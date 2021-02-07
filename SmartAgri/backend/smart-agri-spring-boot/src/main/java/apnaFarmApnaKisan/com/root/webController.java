/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnaFarmApnaKisan.com.root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nixon
 */
@RestController
@RequestMapping(path = "api/v1/web")
public class webController
{

    private final webService webService1;

    @Autowired
    public webController(webService webService1)
    {
        this.webService1 = webService1;
    }
    
    @GetMapping
    public String test()
    {
        return webService1.test();
    }

}
