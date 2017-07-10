package com.lin.myJava;

import java.util.Scanner;
public class Zcx {
	public static void main(String[] args){
		A a=new A();
		String[] names = {"奥迪A4", "马自达6", "皮卡雪", "金龙", "松花江", "依维柯"};
		int[] prices = {500, 400, 450, 800, 400, 1000};
		int[] rooms = {4, 4, 2, 0, 0, 0};
		int[] cccs = {0, 0, 0, 20, 4, 20};
		Qc[] c3=new Qc[6];
		for(int i=0;i<c3.length;i++){
			Qc car = new Qc(names[i], prices[i], rooms[i], cccs[i]);
			c3[i] = car;
		}
		Scanner in=new Scanner(System.in);
		a.a();
		while(true){
			int number=in.nextInt();
			if(number == 1){
				a.b(c3);
				a.c();
				int number1=in.nextInt();
				
				Qc[] outCar =new Qc[number1];
				int sum = 0;
				int sumCcc = 0;
				for(int i=0;i<outCar.length;i++) {
					B.bb((i+1));
					int s = in.nextInt()-1;
					if(s>-1 && s<6) {
						outCar[i] = c3[s];
						System.out.println(c3[s].getName());
						System.out.println(c3[s].getPrice());
						sum += c3[s].getPrice();
						sumCcc += c3[s].getCcc();
					}else {
						System.out.println("没有此型号的车辆，请重新输入：");
						i--;
					}
				}
				B.bc(sum, sumCcc, outCar);
				a.a1();
			}
			else if(number==0){
				in.close();
				System.exit(0);
			}
			else{
				System.out.println("输入错误");
			}
		}
	}
	
}

class A{
	
	void a(){
		System.out.println("欢迎使用答答租车系统");
		System.out.println("您是否要租车：1是 0否");
	}	
	void a1() {
		System.out.println("是否需要租用其他车辆？1是2否");
	}
	void b(Qc[] c3){
		System.out.println("您可租车的类型及其价目表：");
		System.out.println("序号   汽车名称       租金             容量");
		for(int i=0;i<c3.length;i++){
			System.out.println((i+1)+"."+"    "+c3[i].getName()+"    "+c3[i].getPrice()+"/天"+"    载人："+c3[i].getRoom()+"人    载货："+c3[i].getCcc()+"吨");
		}
	}
	void c(){
		System.out.println("请输入您要租汽车的数量：");
	}
	void d(){
		B.ba("请输入租车天数：");
	}
	void e(){
		B.ba("您的账单：");
	}
}
class B{
	static void ba(String replay){
		System.out.println(replay);
	}
	static void bb(int number){
		System.out.println("请输入第"+number+"辆车的序号");
	}
	static void bc(int a,int b, Qc[] outCar){
		System.out.println("总金额："+a+"元");
		System.out.println("你选的车型分别为：");
		for(int i=0;i<outCar.length;i++)
			System.out.print(outCar[i].getName()+"    ");
		System.out.println();
		System.out.println("总载货量："+b+"吨");
	}
}


class Qc{
	private String name;
	private int price;
	private int room;
	private int ccc;
	
	public Qc(String name, int price, int room, int ccc){
		this.name = name;
		this.price = price;
		this.room = room;
		this.ccc = ccc;
	}
	
	public int getCcc() {
		return ccc;
	}
	public void setCcc(int ccc) {
		this.ccc = ccc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public void  setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
}