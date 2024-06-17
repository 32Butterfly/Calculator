/*
Evaldas Dmitrišin evaldas.dmitrisin@mif.stud.vu.lt MIF VU Information Technologies 1st year 3rd group.
Object-oriented programming class project of a Calculator with GUI (Graphical user interface)

This code only uses built in java libraries and doesn't depend on any outside frameworks

The code uses polymorphism and inheritance in order to create new buttons. If you want to create a new button
create a new class. Make sure this class 'implements Button' and then add the functionality that you want that
button to do: It's name, color, font size, background and what it does when pressed. When you have implemented
such class please include it in the panel which can be found in the 'Calculator' class. This way your new button
can be placed in the GUI.
*/

public class Main {
    public static void main(String[] args) {
        new Calculator();
    }
}