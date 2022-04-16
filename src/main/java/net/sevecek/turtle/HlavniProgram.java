package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        nakresliPrasatko(zofka);
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
