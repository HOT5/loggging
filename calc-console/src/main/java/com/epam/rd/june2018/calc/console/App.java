package com.epam.rd.june2018.calc.console;


import com.epam.rd.spring2019.calc.core.CalcImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    static final Logger ERROR_LOGGER = LoggerFactory.getLogger(App.class);
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {




        logger.debug("Hello from Logback");

        logger.debug("getNumber() : {}", getNumber());

    }

    static int getNumber() {
        return 5;
    }


        /*if (args.length > 0 && args.length < 4 ) {


            CalcImpl calc = new CalcImpl();
            switch(args[2]) {
                case "+":
                    //logger.error(String.valueOf(calc.addition(Integer.parseInt(args[0]), Integer.parseInt(args[1]))));
                    break;
                case "-":
                    break;
                case "/":
                    break;
                case "*":
                    break;
                    default:
                        System.out.println("not a valid operator");
            }
        } else {
            ERROR_LOGGER.info("use structure -- number number operator --");
        }*/
    }
