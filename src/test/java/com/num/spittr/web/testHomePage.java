package com.num.spittr.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import com.num.web.HomeController;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.springframework.test.web.servlet.MockMvc;

public class testHomePage {
    @Test
    public void testHomePage1() throws Exception{
        HomeController controller = new HomeController();
        //断言home()方法会返回一个home
        assertEquals("home",controller.home());
    }

    @Test
    public void testHomePage2() throws Exception{
        HomeController controller = new HomeController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }
}
