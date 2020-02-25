package com.company;

/*

1011 Big salary
Display the inscription "I do not want to learn Java, I want a big salary" 40 times according to the model.
Sample:
I do not want to learn Java, I want a big salary
 I do not want to learn Java, I want a big salary
I do not want to learn Java, I want a big salary
I want to learn Java, I want a big salary
 I want to learn Java, I want a big salary
I want to learn Java, I want a big salary
...

Requirements:
1. The program should display the text on the screen.
2. The program should output 40 lines.
3. The program should use a for or while loop.
4. The displayed text should correspond to an example from the condition.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        System.out.println(s);
        for(int i=0;i<39;i++)System.out.println(s=s.replaceAll("^.",""));
    }

}

















