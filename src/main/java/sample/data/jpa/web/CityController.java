/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.data.jpa.web;


import sample.data.jpa.domain.City;
import sample.data.jpa.domain.Synn_role;
import sample.data.jpa.service.CityService;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sample.data.jpa.service.Synn_roleService;

@Controller
@RequestMapping("city")
public class CityController {

    @Autowired
    private CityService cityService;

    @Autowired
    private Synn_roleService synn_roleService;

   @RequestMapping("test")
    public String testSynn(Map<String,Object> model){
        List<Synn_role> list = synn_roleService.findAll();
        model.put("lists",list);
        return "test";
    }

    @PostMapping("save")
    public String save(City city, HttpServletResponse rsp) throws IOException {
        this.cityService.saveCity(city);
        rsp.sendRedirect("all");
        return null;
    }

    @RequestMapping("all")
    public String findAll(Map<String, Object> model) {
        List<City> cities = this.cityService.findAll();

        model.put("cities", cities);
        return "cities";
    }

    @RequestMapping("del")
    public String del(@RequestParam("id") long id, HttpServletResponse rsp) throws IOException {

        this.cityService.delCity(id);

        rsp.sendRedirect("all");

        return null;
    }


    @RequestMapping("4edit/{id}")
    public String find4edit(@PathVariable("id") long id, HttpServletResponse rsp, Map<String, Object> model) throws IOException {

        City c = this.cityService.find(id);
        model.put("city", c);

        return "city-edit";
    }


    @RequestMapping("update")
    public String update(City city, HttpServletResponse rsp) throws IOException {

        this.cityService.updateCity(city);

        rsp.sendRedirect("all");

        return null;
    }

}
