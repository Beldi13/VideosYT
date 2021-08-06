package Validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validar {

    /**
     * Método para validar un número de cédula ecuatoriana usando modulo 10.
     * link del video: https://youtu.be/lISJfOQLZs8
     *
     * @param cedula
     * @return retorna true si cedula es validad, false en cualquier otro caso.
     */
    public static boolean cedula(String cedula) {
        boolean estado = false;
        try {
            ///Restricción 1
            if (cedula.length() == 10) {
                ///Restricción 3
                if ((Integer.parseInt(cedula.substring(0, 2)) <= 24) || (Integer.parseInt(cedula.substring(0, 2)) == 30)) {
                    int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int digitoVerificador = Integer.parseInt(cedula.substring(cedula.length() - 1, cedula.length()));
                    int suma = 0;
                    int digitoXcoeficiente = 0;
                    int modulo = 0;
                    ///Restricción 4
                    for (int i = 0; i < cedula.length() - 1; i++) {
                        ///Paso 1
                        digitoXcoeficiente = Integer.parseInt(cedula.substring(i, i + 1)) * coeficientes[i];
                        ///Paso 2
                        digitoXcoeficiente = (digitoXcoeficiente > 9) ? digitoXcoeficiente -= 9 : digitoXcoeficiente;
                        ///Paso 3
                        suma += digitoXcoeficiente;
                    }
                    ///Paso 4
                    modulo = suma % 10;
                    ///Paso 5
                    if ((10 - modulo) == digitoVerificador) {
                        estado = true;
                    }
                    if (modulo == 0 & modulo == digitoVerificador) {
                        estado = true;
                    }
                } else {///Fin Restricción 3
                    estado = false;
                    System.out.println("Su cédula no pertenece a ecuador");
                }
            } else {///Fin Restricción 1
                estado = false;
                System.out.println("Tiene menos o más de 10 cracteres");
            }
        } catch (NumberFormatException e) {
            estado = false;
            System.out.println("Error al intentar validar");
        }
        return estado;
    }

    /**
     * Espresión regular segun estandar RFC 5322, para más info:
     * https://www.ietf.org/rfc/rfc5322.txt , http://emailregex.com/
     * "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])"
     * Expresión más simple. ([a-z0-9]+(\\.?[a-z0-9])*)+@(([a-z]+)\\.([a-z]+))+
     * 
     * Link del video: https://youtu.be/GGFsOID__ME
     * @param correo
     * @return retorna true si el correo es valido, false cualquier otro caso.
     */
    public static boolean correo(String correo) {
        Pattern patron = Pattern.compile("([a-z0-9]+(\\.?[a-z0-9])*)+@(([a-z]+)\\.([a-z]+))+");
        Matcher comparador = patron.matcher(correo);
        return comparador.find();
    }
}
