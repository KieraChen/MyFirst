package class5.draw;
/*1��	������Draw������ͼ�Σ���������
a)	���ԣ�private double drawRound��������ͼ�ε��ܳ���
b)	���췽���������Ը�ֵΪ0��
c)	������getRound�������ش����ܳ�������ֵ
d)	������void round��double r�� ����Բ�ε��ܳ���������ʾԲ�İ뾶
e)	������void round��int length��int width�� ���㳤���ε��ܳ���������ʾ�����εĳ����
f)	������void round��int length�����������ε��ܳ���������ʾ�����εı߳�
g)	������void round��int a��int b��int c�����������ε��ܳ���������ʾ�����ε������ߡ�
*/
public class Draw {
	private double drawRound;
	Draw(){
		drawRound = 0;
	}
	public double getDrawRound() {
		return this.drawRound;
	}
	public void round(double r){
		this.drawRound = 2*Math.PI*r;	
	}
	public void round(int length, int width){
		this.drawRound = 2*(length + width);
	}
	public void round(int length){
		this.drawRound = 4*length;
	}
	public void round(int a, int b, int c){
		if(a+b > c && b+c > a && c+a > b){
			this.drawRound = a+b+c;
		}
		else{
			System.out.println("�޷����������Σ�");
			this.drawRound = 0;
		}
	}
	

}
