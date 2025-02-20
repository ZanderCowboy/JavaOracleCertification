package academy.learnprogramming;

import academy.learnprogramming.common.Common;

/**
 * MODIFIER                 CLASS       PACKAGE     SUBCLASS    WORLD
 * public                   Yes         Yes         Yes         Yes
 * protected                Yes         Yes         Yes         No
 * No modifier (Default)    Yes         Yes         No          No
 * private                  Yes         No          No          No
 */

public class AccessModifiers {

    public static void main(String[] args) {
        Common common = new Common();
        common.publicPrint();
//        common.protectedPrint();
//        common.defaultPrint();
//        common.privatePrint();

        System.out.println("publicNumber= " + common.publicNumber);
//        System.out.println("protectedNumber= " + common.protectedNumber);
//        System.out.println("defaultNumber= " + common.defaultNumber);
//        System.out.println("privateNumber= " + common.privateNumber);
    }

}
