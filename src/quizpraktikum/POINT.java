/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package quizpraktikum;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Agung Aldhiyat
 */
public class POINT {
    private static final double PI = 3.14159265;
	private float x;
	private float y;

	public POINT(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public POINT MakePOINT(float x, float y) {
		return new POINT(x, y);
	}

	public void BacaPOINT() {
		/*KAMUS*/
		Scanner scanner = new Scanner(System.in);

		/* ALGORITMA */
		this.x = scanner.nextFloat();
		this.y = scanner.nextFloat();

		scanner.close();
	}

	public void TulisPOINT() {
		/* ALGORITMA */
		System.out.printf("(%.2f,%.2f)\n", this.x, this.y);
	}

	public boolean IsOrigin(POINT P) {
		return this.x == 0 && this.y == 0;
	}

	public boolean IsOnSbX(POINT P) {
		return this.y == 0;
	}

	public boolean IsOnSbY(POINT P) {
		return this.x == 0;
	}

	public int Kuadran(POINT P) {
		assert (P.x != 0 && P.y != 0);
		if (P.x > 0 && P.y > 0) {
			return 1;
		} else if (P.x < 0 && P.y > 0) {
			return 2;
		} else if (P.x < 0 && P.y < 0) {
			return 3;
		} else {
			return 4;
		}
	}

	public float Jarak0(POINT P) {
		return (float) Math.sqrt(Math.pow(P.x, 2) + Math.pow(P.y, 2));
	}

	public float Jarak(POINT P1, POINT P2) {
		return (float) Math.sqrt(Math.pow(P1.x - P2.x, 2) + Math.pow(P1.y - P2.y, 2));
	}
	/* Menghitung jarak antara 2 POINT */

	public void Mirror(boolean SbX, boolean SbY) {
		if (SbX && !SbY) {
			this.y *= -1;
		} else if (!SbX && SbY) {
			this.x *= -1;
		} else if (SbX && SbY) {
			this.y *= -1;
		}
	}
	/* Memindahkan P ke posisi pencerminan P tergantung nilai SbX dan SbY */
	/* I.S. P terdefinisi, SbX dan SbY terdefinisi */
	/* F.S. P dipindahkan pada posisi pencerminan tergantung nilai SbX dan SbY */
	/* Jika SbX bernilai true, maka P dipindahkan ke posisi pencerminannya terhadap sumbu X */
	/* Jika SbY bernilai true, maka P dipindahkan ke posisi pencerminannya terhadap sumbu Y */

	public void Translasi(float deltaX, float deltaY) {
		this.x += deltaX;
		this.y += deltaY;
	}
	/* I.S. P terdefinisi, deltaX dan deltaY terdefinisi */
	/* F.S. P digeser sebesar deltaX dan ordinatnya sebesar deltaY */

	public void Putar(float Sudut) {
		float RadSudut = (float) (Sudut * PI / 180.0);
		float X = this.x;
		float Y = this.y;

		/*ALGORITMA*/
		this.x = (float) (X * Math.cos(RadSudut) + Y * Math.sin(RadSudut));
		this.y = (float) (Y * Math.cos(RadSudut) - X * Math.sin(RadSudut));
	}
	/* I.S. P terdefinisi dan Sudut terdefinisi */
	/* F.S. P diputar sebesar Sudut derajat terhadap Titik Origin searah jarum jam */

	public static void main(String args[]) {
		POINT P;
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		int command;

		P = new POINT(scanner.nextFloat(), scanner.nextFloat());

		do {
			command = scanner.nextInt();

			switch (command) {
				case 1:
					float deltaX = scanner.nextFloat();
					float deltaY = scanner.nextFloat();
					P.Translasi(deltaX, deltaY);
					P.TulisPOINT();
					break;
				case 2:
					float Sudut = scanner.nextFloat();
					P.Putar(Sudut);
					P.TulisPOINT();
					break;
				case 3:
					P.Mirror(true, false);
					P.TulisPOINT();
					break;
				case 4:
					P.Mirror(false, true);
					P.TulisPOINT();
					break;
				case 0:
					P.TulisPOINT();
					break;
				default:
					System.out.println("Kode operasi salah");
					break;
			}

		} while (command != 0);

		scanner.close();
	}
}
