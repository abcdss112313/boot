package sample.data.jpa.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import sample.data.jpa.domain.Synnapply;
import sample.data.jpa.service.SynnapplyService;

import javax.servlet.http.HttpServletRequest;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.Map;

/**
 * Created by windsorl on 2017/6/23.
 */
@Controller
@RequestMapping("/apply")
public class SynnapplyController {
    @Autowired
    private SynnapplyService synnapplyService;

     @RequestMapping("/all/{id}")
    public String querySynnapply(@PathVariable int id,Map<String,Object> model){
    //    int userId = (Integer) request.getSession().getAttribute("userid");
        List<Synnapply> list =synnapplyService.findByUserid(id);
        model.put("list",list);
        return "cities";
    }


}
