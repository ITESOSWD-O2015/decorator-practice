package com.iteso.decorator;

import com.iteso.decorator.condiments.*;
import com.iteso.decorator.condiments.meat.*;
import com.iteso.decorator.condiments.sizes.Mega;
import com.iteso.decorator.condiments.sizes.Mini;
import com.iteso.decorator.tacos.Quesadilla;
import com.iteso.decorator.tacos.TacoNormal;
import com.iteso.decorator.tacos.Volcan;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 4:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class TuTaco {
    public static void main(String[] args){

        // Caso 1: Se prepara un taco mega de chorizo y unos ingredientes.
        Taco taco = new TacoNormal();
        taco = new Mega(taco);
        taco = new Chorizo(taco);
        taco = new TortillaMaiz(taco);
        taco = new Cebolla(taco);
        taco = new Cilantro(taco);

        System.out.println();
        System.out.println(taco.getDescription());
        System.out.println("$" + taco.cost() + " MXN");

        //------------------------------------------------------------------------------------------//

        //Caso 2: Crear un taco mini de pescado con diferentes ingredientes. (Debera desplegar error)
        Taco taco2 = new TacoNormal();
        taco2 = new Mini(taco2);
        taco2 = new TortillaHarina(taco2);
        taco2 = new Pescado(taco2);
        taco2 = new Cilantro(taco2);
        taco2 = new Cebolla(taco2);

        System.out.println();
        System.out.println(taco2.getDescription());
        System.out.println("$" + taco2.cost() + " MXN");

        //------------------------------------------------------------------------------------------//

        //Caso 3: Crear una Quesadilla de Harina con ingredientes
        Taco taco3 = new Quesadilla();

        taco3 = new TortillaHarina(taco3);
        taco3 = new Pastor(taco3);
        taco3 = new Cebolla(taco3);

        System.out.println();
        System.out.println(taco3.getDescription());
        System.out.println("$" + taco3.cost() + " MXN");

        //------------------------------------------------------------------------------------------//

        //Caso 4: Crear un Volcan de Lengua e ingredientes

        Taco taco4 = new Volcan();
        taco4 = new Queso(taco4);
        taco4 = new Lengua(taco4);
        taco4 = new Cebolla(taco4);
        taco4 = new Cilantro(taco4);

        System.out.println();
        System.out.println(taco4.getDescription());
        System.out.println("$" + taco4.cost() + " MXN");

        //------------------------------------------------------------------------------------------//

        //Caso 5: Crear un taco mini de pescado con ingregientes (Deberia desplegar error)

        Taco taco5 = new TacoNormal();
        taco5 = new Mini(taco5);
        taco5 = new Pescado(taco5);
        taco5 = new Cebolla(taco5);
        taco5 = new Cilantro(taco5);
        taco5 = new TortillaMaiz(taco5);

        System.out.println();
        System.out.println(taco5.getDescription());
        System.out.println("$" + taco5.cost() + " MXN");

        //------------------------------------------------------------------------------------------//

        //Caso 6: Crear un super taco con muchos ingredientes

        Taco taco6 = new TacoNormal();
        taco6 = new Mega(taco6);
        taco6 = new Queso(taco6);
        taco6 = new TortillaHarina(taco6);
        taco6 = new Lengua(taco6);
        taco6 = new Pescado(taco6);
        taco6 = new Cebolla(taco6);
        taco6 = new Cilantro(taco6);

        System.out.println();
        System.out.println(taco6.getDescription());
        System.out.println("$" + taco6.cost() + " MXN");

        //------------------------------------------------------------------------------------------//

        //Caso 7: Crear un taco mini de Bistec y algunos ingredientes

        Taco taco7 = new TacoNormal();
        taco7 = new Mini(taco7);
        taco7 = new TortillaMaiz(taco7);
        taco7 = new Bistec(taco7);
        taco7 = new Cebolla(taco7);
        taco7 = new Cilantro(taco7);

        System.out.println();
        System.out.println(taco7.getDescription());
        System.out.println("$" + taco7.cost() + " MXN");




    }
}
