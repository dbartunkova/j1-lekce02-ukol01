package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();


        for (int i = 0; i < 3; i++) {
            nakresliDomecek(zofka);
            zofka.penUp();
            zofka.turnLeft(90.0);
            zofka.move(130.0);
            zofka.turnRight(90.0);
            zofka.penDown();
        }


        zofka.penUp();
        zofka.turnRight(90.0);
        zofka.move(650.0);
        zofka.turnLeft(90.0);
        zofka.penDown();

        for (int i = 0; i < 2; i++) {
            nakresliDomecek(zofka);
            zofka.penUp();
            zofka.turnLeft(90.0);
            zofka.move(130.0);
            zofka.turnRight(90.0);
            zofka.penDown();
        }

        zofka.penUp();
        zofka.move(-220.0);
        zofka.turnLeft(90.0);
        zofka.move(300.0);
        zofka.turnRight(90.0);
        zofka.penDown();

        nakresliDomecek(zofka);
        zofka.penUp();
        zofka.move(50.0);
        zofka.turnRight(90.0);
        zofka.move(220.0);
        zofka.turnLeft(90.0);
        zofka.penDown();

        nakresliPrasatko(zofka);
        zofka.penUp();
        zofka.turnRight(90.0);
        zofka.move(100.0);
        zofka.turnLeft(90.0);
        zofka.penDown();
        nakresliDomecek(zofka);

        zofka.penUp();
        zofka.move(-200.0);
        zofka.turnLeft(90.0);
        zofka.move(350.0);
        zofka.turnRight(90);

        zofka.penDown();
        nakresliD(zofka);
        nakresliA(zofka);
        nakresliN(zofka);
        nakresliA(zofka);

        zofka.move(450.0);
        zofka.turnLeft(90.0);
        zofka.move(720.0);

        nakresliKolecko(zofka);

    }

    private void nakresliN(Turtle zofka) {
        zofka.penDown();
        zofka.move(110.0);
        zofka.turnRight(140.0);
        zofka.move(140.0);
        zofka.turnLeft(140.0);
        zofka.move(110.0);
        zofka.penUp();
        zofka.move(-110.0);
    }

    private void nakresliA(Turtle zofka) {
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
        zofka.move(-100.0);
        zofka.turnLeft(120.0);
        zofka.move(50.0);
        zofka.turnLeft(150.0);
        zofka.move(20.0);
    }

    private void nakresliD(Turtle zofka) {
        zofka.move(110);
        zofka.turnRight(80.0);
        for (int i = 0; i <39 ; i++) {
            zofka.turnRight(5.0);
            zofka.move(5.0);
        }
        zofka.penUp();
        zofka.move(-100.0);
        zofka.turnRight(85.0);
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
            zofka.move(100.0);
            zofka.turnRight(90.0);
        }

        zofka.penUp();
        zofka.move(100.0);
        zofka.penDown();

        zofka.turnRight(30.0);
        zofka.move(100.0);
        zofka.turnRight(120.0);
        zofka.move(100.0);

        zofka.turnRight(30.0);
        zofka.penUp();
        zofka.move(100.0);
        zofka.turnRight(90.0);
        zofka.move(100.0);
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
        zofka.turnRight(150.0);
        zofka.penUp();
    }
}
