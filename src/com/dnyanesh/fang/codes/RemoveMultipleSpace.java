package com.dnyanesh.fang.codes;

import java.util.StringTokenizer;

public class RemoveMultipleSpace {
    public static void main(String a[]){
        String str = "String    With Multiple      Spaces";
        StringTokenizer st = new StringTokenizer(str, " ");
        StringBuffer sb = new StringBuffer();
        while(st.hasMoreElements()){
            sb.append(st.nextElement()).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}