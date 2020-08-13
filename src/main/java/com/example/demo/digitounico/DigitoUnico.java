package com.example.demo.digitounico;


public class DigitoUnico {

    public static int obterDigitoUnico(String n, int k) {
        int digito = 0;
        String p = "";
        int somaCaracteresDeP = 0;

        for (int i = 0; i < k; i++) {
            p = p.concat(n);
        }

        for (int i = 0; i < p.length(); i++) {
            somaCaracteresDeP += Character.getNumericValue(p.charAt(i));
        }

        if (String.valueOf(somaCaracteresDeP).length() == 1) {
            digito = Integer.parseInt(n);
        } else {
            for (int i = 0; i < String.valueOf(somaCaracteresDeP).length(); i++) {
                digito += Character.getNumericValue(String.valueOf(somaCaracteresDeP).charAt(i));
            }
        }
        return digito;
    }
}
