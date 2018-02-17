/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webserviceclientforsimplescreenshotone;

import WebServiceClientForSimpleScreenShot.ScreenShotSimple;
import WebServiceClientForSimpleScreenShot.ScreenShotSimple_Service;
import java.util.Scanner;

/**
 *
 * @author maria
 */
public class WebServiceClientforSimpleScreenShotOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String urls;
        Scanner sc=new Scanner(System.in);
        ScreenShotSimple_Service service=new ScreenShotSimple_Service();
        final ScreenShotSimple proxy=service.getScreenShotSimplePort();
        proxy.takeScreenShot("http://www.google.com");

        
    }
    
}
