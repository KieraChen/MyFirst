package class2;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
/*		1��	����һ����Ϸ�˵���ͼ��ʾ
		2��	�����û�������Ϸ��ţ����Ա�Ž����ж�����Ч�ԣ�����Ч����Ҫ��������룬ֱ�������ЧΪֹ
		3��	�����û��������Ϸ�����ʾ����Ӧ����Ϸ����
		4��	������ʾ�û����뵱ǰ�����ĵȼ������ݵȼ�����ʾ����ͬ�Ľ��
		a)	20�����£��������³�é®��С���񣬼ӿ첽����ǰ��ɣ���
		b)	21-40�������Ѿ���ʼ���߽���������С�гɾ��ˣ����ͣ���
		c)	41-60�������Ѿ���ɨ�����ˣ��������޵л��в�࣬����Ŭ���ɣ���
		d)	60�����ϣ����Ѿ������޵��ˣ�̫ţ�ˣ���
*/
		System.out.println("������Ϸ����");
		System.out.println("--------------------");
		System.out.println("1��	wow");
		System.out.println("2��	����");
		System.out.println("3��	�λ�����");
		System.out.println("4��	����֮��");
		System.out.println("5��	������ol");
		
		System.out.println("��������ѡ�����Ϸ��");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		while(num != 1 && num !=2 && num !=3 && num !=4 && num !=5){
			System.out.println(">>>>>���������Ϸ�����Ч����������룡��");	
			num = scan.nextInt();
			}
		
	    switch(num){
	    case 1:System.out.println("��ѡ����*wow*");
	    System.out.println("�������������Ѿ��浽�ļ���");
	    int level = scan.nextInt();
	        if(level <= 20){
	    	    System.out.println("20�����£��������³�é®��С���񣬼ӿ첽����ǰ��ɣ���");
	        }
	        else if(level > 20 && level <= 40){
	    	    System.out.println("21-40�������Ѿ���ʼ���߽���������С�гɾ��ˣ����ͣ���");
	        }
	        else if(level > 40 && level <=60){
	    	    System.out.println("41-60�������Ѿ���ɨ�����ˣ��������޵л��в�࣬����Ŭ���ɣ���");
	        }
	        else{
	    	    System.out.println("60�����ϣ����Ѿ������޵��ˣ�̫ţ�ˣ���");
	        }
	    break;
	    case 2:System.out.println("��ѡ����*����*");
	    System.out.println("�������������Ѿ��浽�ļ���");
	    int level2 = scan.nextInt();
	        if(level2 <= 20){
    	        System.out.println("20�����£��������³�é®��С���񣬼ӿ첽����ǰ��ɣ���");
            }
            else if(level2 > 20 && level2 <= 40){
    	        System.out.println("21-40�������Ѿ���ʼ���߽���������С�гɾ��ˣ����ͣ���");
            }
            else if(level2 > 40 && level2 <=60){
    	        System.out.println("41-60�������Ѿ���ɨ�����ˣ��������޵л��в�࣬����Ŭ���ɣ���");
            }
            else{
    	        System.out.println("60�����ϣ����Ѿ������޵��ˣ�̫ţ�ˣ���");
            }
	    break;
	    case 3:System.out.println("��ѡ����*�λ�����*");
	    System.out.println("�������������Ѿ��浽�ļ���");
	    int level3 = scan.nextInt();
	        if(level3 <= 20){
	    	    System.out.println("20�����£��������³�é®��С���񣬼ӿ첽����ǰ��ɣ���");
	        }
	        else if(level3 > 20 && level3 <= 40){
	        	System.out.println("21-40�������Ѿ���ʼ���߽���������С�гɾ��ˣ����ͣ���");
	        }
	        else if(level3 > 40 && level3 <=60){
	    	    System.out.println("41-60�������Ѿ���ɨ�����ˣ��������޵л��в�࣬����Ŭ���ɣ���");
	        }
	        else{
	    	    System.out.println("60�����ϣ����Ѿ������޵��ˣ�̫ţ�ˣ���");
	        }
	    break;
	    case 4:System.out.println("��ѡ����*����֮��*");
	    System.out.println("�������������Ѿ��浽�ļ���");
	    int level4 = scan.nextInt();
	        if(level4 <= 20){
	        	System.out.println("20�����£��������³�é®��С���񣬼ӿ첽����ǰ��ɣ���");
	        }
	        else if(level4 > 20 && level4 <= 40){
	    	    System.out.println("21-40�������Ѿ���ʼ���߽���������С�гɾ��ˣ����ͣ���");
	        }
	        else if(level4 > 40 && level4 <=60){
	    	    System.out.println("41-60�������Ѿ���ɨ�����ˣ��������޵л��в�࣬����Ŭ���ɣ���");
	        }
	        else{
	    	    System.out.println("60�����ϣ����Ѿ������޵��ˣ�̫ţ�ˣ���");
	        }
	    break;
	    case 5:System.out.println("��ѡ����*������ol*");
	    System.out.println("�������������Ѿ��浽�ļ���");
	    int level5 = scan.nextInt();
	        if(level5 <= 20){
	    	    System.out.println("20�����£��������³�é®��С���񣬼ӿ첽����ǰ��ɣ���");
	        }
	        else if(level5 > 20 && level5 <= 40){
	    	    System.out.println("21-40�������Ѿ���ʼ���߽���������С�гɾ��ˣ����ͣ���");
	        }
	        else if(level5 > 40 && level5 <=60){
	    	    System.out.println("41-60�������Ѿ���ɨ�����ˣ��������޵л��в�࣬����Ŭ���ɣ���");
	        }
	        else{
	    	    System.out.println("60�����ϣ����Ѿ������޵��ˣ�̫ţ�ˣ���");
	        }
	    break;
	    
	    }
		
	}

}
