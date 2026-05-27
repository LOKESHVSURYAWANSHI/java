package polimorphism;

public class Dimond {

	public static void main(String[] args) {
/** 
 * each runtime polimorphisum(dimanlic polymorphisum) is method overriding but each method overridng is not runtime and dinamic polymorphisum
 *       " polimorephic object "
 *       
 *       reference pc  = object cc
 *       Forest forest = new RainForest();
 *       
 *       here we can access the common method of child and parent class
 *       
 *       DMD = " dynamic method dispatch " 
 *       we create the object of paranet class and the call the method of child class
 *       
 *       it is concept in polimorphisum (overridng) where the compile time method call is not followed at the
 *       runtime execution at compile time method is liked from the parent class at the execution time (runtime ) 
 *       the call is switched to the child class method in short compile linking is not followed through out the runtime 
 *       and this is called as the dmd there are certain conditions which are required dmd to happen 
 *       
 *          condition first A= the call must happen with the help of polimorphic obj
 *          condition second = that method must be overridden in child class
 *       
 *       polimorphic obj when you create the ref of parent class but obj of child class there is it called as polimorphic obj you can normally access only the common variables and  methods of parent and child class
 *       when we create polimorphic of it take the reference of parent class while the compile time and when we run the program it will take the reference of child class
 *       
 */
		mobile mob=new Iphone();
		mob.on();
		

	}

}
class mobile {
	public void on() {
		System.out.println("mobile is on");
	}
	public void reboot() {
		System.out.println("mobile is rebuted....");
	}
}
class Iphone extends mobile {
	public void on() {
		System.out.println("Iphone is on ");
	}
	public void reboot() {
		System.out.println("Iphone is rebooted");
	}
}
