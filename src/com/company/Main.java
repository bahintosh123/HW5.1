package com.company;

public class Main {

    public static void main(String[] args) {
	Hero ahilles = new Hero ();
	ahilles.health = 1000;
	ahilles.power = 250;
	ahilles.magic = 50;
        System.out.println(ahilles.health + " " + ahilles.power + " " + ahilles.magic);
        Hero hector = new Hero (800, 200, 20);
		System.out.println(hector.health + " " + hector.power + " " + hector.magic);
		ahilles.shoutHector();

		Boss devil = new Boss();
		devil.setHealth(1000);
		devil.setPower(500);
		devil.setDefense(200);
		System.out.println(devil.getHealth()+ " "+ devil.getPower() + " " + devil.getDefense());


		Boss devil2 = new Boss();
		devil.setDefense(300);
		devil.getHealth();
		devil.getPower();
		System.out.println(devil.getDefense());

		Magic_door player = new Magic_door();
		System.out.println(player.n1);
    }
}
