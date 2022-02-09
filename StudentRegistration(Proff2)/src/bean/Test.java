/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 *
 * @author user
 */
public class Test {

    public static void main(String[] args) throws Exception {

        Teacher t = new Teacher();

        Student[] ss = {new Student()};
//        t.setStudents(ss);

        checkObjNotNull(t);

    }

    public static void checkObjNotNull(Object obj) throws Exception {
        Method[] methods = obj.getClass().getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {

            Method m = methods[i];

            System.out.println(m.getName());

            Annotation[] ann = m.getAnnotations();
            for (int j = 0; j < ann.length; j++) {
                Annotation anot = ann[j];
                if (anot.annotationType() == WritingStyle.class) {
                    Object ob = m.invoke(obj);
                    if (ob == null) {
                        throw new IllegalArgumentException("Bosh olmamali idi axi....");
                    }
                    if (ob instanceof Object[]) {
                        Object[] oo = (Object[]) ob;   
                        if (oo.length == 0) {
                            throw new IllegalArgumentException("Bosh olmamali idi axi......Arr");
                        }
                    }
                }
                System.out.println("ann= " + anot.annotationType());
            }
            System.out.println("------------------");
        }
    }

}
