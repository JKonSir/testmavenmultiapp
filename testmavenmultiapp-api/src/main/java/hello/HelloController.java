package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/helloworld")
public class HelloController
{
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public @ResponseBody Hello hello(@RequestParam(value = "textField", defaultValue = "Vasya") String textField)
    {
        return new Hello(textField);
    }

}
