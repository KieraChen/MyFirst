package class2;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
/*		1、	制作一个游戏菜单下图所示
		2、	接受用户输入游戏编号，并对编号进行判断其有效性，若无效，则要求继续输入，直到编号有效为止
		3、	根据用户输入的游戏编号显示出对应的游戏名字
		4、	继续提示用户输入当前所处的等级，根据等级数显示出不同的结果
		a)	20级以下：您还是新出茅庐的小菜鸟，加快步伐向前冲吧！！
		b)	21-40级：您已经开始行走江湖，算是小有成就了，加油！！
		c)	41-60级：您已经横扫天下了，离天下无敌还有差距，继续努力吧！！
		d)	60级以上：您已经天下无敌了，太牛了！！
*/
		System.out.println("现有游戏如下");
		System.out.println("--------------------");
		System.out.println("1、	wow");
		System.out.println("2、	传奇");
		System.out.println("3、	梦幻西游");
		System.out.println("4、	永恒之塔");
		System.out.println("5、	七龙珠ol");
		
		System.out.println("请输入您选择的游戏：");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		while(num != 1 && num !=2 && num !=3 && num !=4 && num !=5){
			System.out.println(">>>>>您输入的游戏编号无效，请继续输入！！");	
			num = scan.nextInt();
			}
		
	    switch(num){
	    case 1:System.out.println("您选择了*wow*");
	    System.out.println("请输入您现在已经玩到的级别：");
	    int level = scan.nextInt();
	        if(level <= 20){
	    	    System.out.println("20级以下：您还是新出茅庐的小菜鸟，加快步伐向前冲吧！！");
	        }
	        else if(level > 20 && level <= 40){
	    	    System.out.println("21-40级：您已经开始行走江湖，算是小有成就了，加油！！");
	        }
	        else if(level > 40 && level <=60){
	    	    System.out.println("41-60级：您已经横扫天下了，离天下无敌还有差距，继续努力吧！！");
	        }
	        else{
	    	    System.out.println("60级以上：您已经天下无敌了，太牛了！！");
	        }
	    break;
	    case 2:System.out.println("您选择了*传奇*");
	    System.out.println("请输入您现在已经玩到的级别：");
	    int level2 = scan.nextInt();
	        if(level2 <= 20){
    	        System.out.println("20级以下：您还是新出茅庐的小菜鸟，加快步伐向前冲吧！！");
            }
            else if(level2 > 20 && level2 <= 40){
    	        System.out.println("21-40级：您已经开始行走江湖，算是小有成就了，加油！！");
            }
            else if(level2 > 40 && level2 <=60){
    	        System.out.println("41-60级：您已经横扫天下了，离天下无敌还有差距，继续努力吧！！");
            }
            else{
    	        System.out.println("60级以上：您已经天下无敌了，太牛了！！");
            }
	    break;
	    case 3:System.out.println("您选择了*梦幻西游*");
	    System.out.println("请输入您现在已经玩到的级别：");
	    int level3 = scan.nextInt();
	        if(level3 <= 20){
	    	    System.out.println("20级以下：您还是新出茅庐的小菜鸟，加快步伐向前冲吧！！");
	        }
	        else if(level3 > 20 && level3 <= 40){
	        	System.out.println("21-40级：您已经开始行走江湖，算是小有成就了，加油！！");
	        }
	        else if(level3 > 40 && level3 <=60){
	    	    System.out.println("41-60级：您已经横扫天下了，离天下无敌还有差距，继续努力吧！！");
	        }
	        else{
	    	    System.out.println("60级以上：您已经天下无敌了，太牛了！！");
	        }
	    break;
	    case 4:System.out.println("您选择了*永恒之塔*");
	    System.out.println("请输入您现在已经玩到的级别：");
	    int level4 = scan.nextInt();
	        if(level4 <= 20){
	        	System.out.println("20级以下：您还是新出茅庐的小菜鸟，加快步伐向前冲吧！！");
	        }
	        else if(level4 > 20 && level4 <= 40){
	    	    System.out.println("21-40级：您已经开始行走江湖，算是小有成就了，加油！！");
	        }
	        else if(level4 > 40 && level4 <=60){
	    	    System.out.println("41-60级：您已经横扫天下了，离天下无敌还有差距，继续努力吧！！");
	        }
	        else{
	    	    System.out.println("60级以上：您已经天下无敌了，太牛了！！");
	        }
	    break;
	    case 5:System.out.println("您选择了*七龙珠ol*");
	    System.out.println("请输入您现在已经玩到的级别：");
	    int level5 = scan.nextInt();
	        if(level5 <= 20){
	    	    System.out.println("20级以下：您还是新出茅庐的小菜鸟，加快步伐向前冲吧！！");
	        }
	        else if(level5 > 20 && level5 <= 40){
	    	    System.out.println("21-40级：您已经开始行走江湖，算是小有成就了，加油！！");
	        }
	        else if(level5 > 40 && level5 <=60){
	    	    System.out.println("41-60级：您已经横扫天下了，离天下无敌还有差距，继续努力吧！！");
	        }
	        else{
	    	    System.out.println("60级以上：您已经天下无敌了，太牛了！！");
	        }
	    break;
	    
	    }
		
	}

}
