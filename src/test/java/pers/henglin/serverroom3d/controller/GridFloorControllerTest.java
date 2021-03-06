package pers.henglin.serverroom3d.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import pers.henglin.serverroom3d.ServerRoom3dApplication;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = ServerRoom3dApplication.class)
public class GridFloorControllerTest {
    @Autowired
    private GridFloorController gridFloorController;

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mvc;

    @Before
    public void setup(){
        mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void contextLoads() throws Exception {
        String uri = "/getGridFloor";
        MvcResult result = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON)).andReturn();
        int status = result.getResponse().getStatus();
        System.out.println(result.getResponse());
        Assert.assertEquals("錯誤",200,status);
    }
}
