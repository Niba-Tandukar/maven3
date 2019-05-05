/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenweb.configuartion;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author Niba
 */
@Configuration 
@EnableWebMvc
@ComponentScan(basePackage"com.mycompany.mavenweb.configuration/")
public class WebMvcConfig {
    
}
