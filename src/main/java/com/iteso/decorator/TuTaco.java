package com.iteso.decorator;

import com.iteso.decorator.condiments.*;
import com.iteso.decorator.condiments.meat.*;
import com.iteso.decorator.tacos.*;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 4:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class TuTaco {
    public static void main(String[] args){
        Taco taco = new TacoNormal();
        System.out.println(taco.getDescription());
        System.out.println("$" + taco.cost() + " MXN");

        taco = new TortillaMaiz(taco);
        taco = new Chorizo(taco);
        taco = new Cebolla(taco);
        taco = new Cilantro(taco);

        System.out.println();
        System.out.println();
        System.out.println(taco.getDescription());
        System.out.println("$" + taco.cost() + " MXN");

        Taco taco2 = new TacoNormal();

        taco2 = new TortillaHarina(taco2);
        taco2 = new Lengua(taco2);
        taco2 = new Cilantro(taco2);

        System.out.println();
        System.out.println();
        System.out.println(taco2.getDescription());
        System.out.println("$" + taco2.cost() + " MXN");

        Taco taco3 = new Quesadilla();

        taco3 = new TortillaHarina(taco3);
        taco3 = new Pastor(taco3);
        taco3 = new Cebolla(taco3);

        System.out.println();
        System.out.println();
        System.out.println(taco3.getDescription());
        System.out.println("$" + taco3.cost() + " MXN");

        /** changes Here I put the three new types of tacos -------------------------------**/

        Taco taco4 = new Volcan();

        /**  esta parte no entendi bien  que hace **/
        taco4 = new TortillaMaiz(taco4);
        taco4 = new Bistec(taco4);
        taco4 = new Cebolla(taco4);
        taco4 = new Cilantro(taco4);
        taco4 = new Queso(taco4);



        System.out.println();
        System.out.println();
        System.out.println(taco4.getDescription());
        System.out.println("$" + taco4.cost() + " MXN");



        Taco taco5 = new ShripTaco();

        /**  esta parte no entendi bien  que hace **/
        taco5 = new TortillaHarina(taco5);
        taco5 = new Shrip(taco5);


        System.out.println();
        System.out.println();
        System.out.println(taco5.getDescription());
        System.out.println("$" + taco5.cost() + " MXN");


        Taco taco6 = new FishTaco();

        /**  esta parte no entendi bien  que hace **/
        taco6 = new TortillaHarina(taco6);
        taco6 = new Fish(taco6);


        System.out.println();
        System.out.println();
        System.out.println(taco6.getDescription());
        System.out.println("$" + taco6.cost() + " MXN");






    }
}
