/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan49.biayaemaskawin;

/**
 *
 * @author ASUS
 */
public class Emas {
	private float harga, mahar, total;

	public float getHarga() {
		return harga;
	}

	public float getMahar() {
		return mahar;
	}

	public float getTotal() {
		return total;
	}

	public Emas(float harga, float mahar){
		this.harga = harga;
		this.mahar = mahar;
	}
	
	public void hitungTotal(){
		this.total = this.harga * this.mahar;
	}
	
	public void tampil(){
		System.out.println("Mahar Emas Seberat  : "+ getMahar());	
		System.out.println("Harga Emas per gram : "+ getHarga());
		hitungTotal();
		System.out.println("Total Biaya    	: "+ getTotal());
	}
}
