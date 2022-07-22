package aula9;

import javax.swing.plaf.synth.Region;

public class Wrapper {
    //#region Tipos Primitivos
    short num1 = 1; // números inteiros pequenos, não calculáveis, não aceita negativos
    byte num2 = 10; //até 255
    int num3 = 100; // tem um limite de tamanho e aceita negativos, não aceita decimais
    long num4 = 9412314; //aceita números maiores
    float num5 = 2.5f; //aceita casas decimais, ou flutuantes
    double num6 = 3.4123; // dobro de flutuação do float
    boolean flag = true; // true ou falso, não é um bit
    char a = 'a'; //aceita uma letra, charactere
    //#endregion   

    //#region
    //letra maiuscula é classe caralho
    Short num7 =1;
    Byte num8 = Byte.valueOf(num2);
    Integer num9 = Integer.parseInt("295");
    Long num10 = Long.valueOf(num4);

    Boolean flag2 = Boolean.parseBoolean("true");
    Character b = Character.valueOf('H');
    Double num11 = Double.parseDouble("3.4");
    //#endregion
}
