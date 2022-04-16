package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();


        pismenoA(zofka);

        //nakresliD(zofka);


        //nakresliKolecko(zofka);
        //for (int i = 0; i < 3; i++) {
            //nakresliPaprsekSlunce(zofka);




        //nakresliPaprsekSlunce(zofka);


    }

    private void pismenoA(Turtle zofka) {
        zofka.penDown();
        zofka.turnRight(30.0);
        zofka.move(150.0);
        zofka.turnRight(120.0);
        zofka.move(150.0);
        zofka.penUp();
        zofka.move(-50.0);
        zofka.penDown();
        zofka.turnRight(120.0);
        zofka.move(100.0);
        zofka.penUp();
    }

    private void nakresliD(Turtle zofka) {
        zofka.move(110);
        zofka.turnRight(80.0);
        for (int i = 0; i <39 ; i++) {
            zofka.turnRight(5.0);
            zofka.move(5.0);
        }
        zofka.penUp();
    }

    private void nakresliPaprsekSlunce(Turtle zofka) {
        zofka.turnLeft(90.0);
        zofka.move(30.0);
        zofka.move(-30.0);
        zofka.penUp();
    }


    //nakresliKolecko(zofka);

        //zofka.turnRight(60.0);
        //zofka.move(160.0);

        //nakresliOsmiuhelnik(zofka);

        //nakresliDomecek(zofka);

        //nakresliPrasatko(zofka);


    private void nakresliKolecko(Turtle zofka) {
        for (int i = 0; i < 75; i++) {
            zofka.penDown();
            zofka.move(5.0);
            zofka.turnRight(5.0);
            zofka.penUp();
        }
    }

    private void nakresliOsmiuhelnik(Turtle zofka) {
        for (int i = 0; i < 8; i++) {
            zofka.penDown();
            zofka.move(50.0);
            zofka.turnRight(45.0);
           // zofka.penUp();
        }
    }

    private void nakresliDomecek(Turtle zofka) {
        for (int i = 0; i < 4; i++) {
            zofka.move(150.0);
            zofka.turnRight(90.0);
        }

        zofka.penUp();
        zofka.move(150.0);
        zofka.penDown();

        zofka.turnRight(30.0);
        zofka.move(150.0);
        zofka.turnRight(120.0);
        zofka.move(150.0);

        zofka.turnRight(30.0);
        zofka.penUp();
        zofka.move(150.0);
        zofka.turnRight(90.0);
        zofka.move(150.0);
        zofka.turnRight(90.0);
        zofka.penDown();
    }

    private void nakresliPrasatko(Turtle zofka) {
        zofka.turnLeft(45.0);
        zofka.move(100.0);
        zofka.turnRight(90.0);
        zofka.move(100.0);
        zofka.turnRight(135.0);
        zofka.move(145.0);
        zofka.turnLeft(90.0);
        zofka.move(200.0);
        zofka.turnLeft(90.0);
        zofka.move(145.0);
        zofka.turnLeft(90.0);
        zofka.move(200.0);
        zofka.turnLeft(90.0);
        zofka.move(145.0);

        zofka.turnRight(30.0);
        zofka.move(40.0);

        zofka.penUp();
        zofka.move(-40.0);

        zofka.penDown();
        zofka.turnLeft(60);
        zofka.move(40.0);

        zofka.penUp();
        zofka.move(-40.0);

        zofka.penDown();
        zofka.turnLeft(60);
        zofka.move(200.0);

        zofka.turnRight(60.0);
        zofka.move(40.0);

        zofka.penUp();
        zofka.move(-40.0);

        zofka.penDown();
        zofka.turnRight(60.0);
        zofka.move(40.0);
    }
}
