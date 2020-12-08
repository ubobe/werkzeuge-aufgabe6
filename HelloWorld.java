public class HelloWorld {
    public static void main (String[] args) {
        new HelloWorld(args);
    }

	public HelloWorld(String[] args) {
		if(args.length == 1) {
			System.out.println(this.hello() + " " + args [0] + "!");
		} else if(args.length > 1) {
			for(int i = 0; i < args.length; i++) {
				System.out.println(this.hello() + " " + args [i] + "!");
			}
		} else {
			System.out.println(this.hello() + " " + this.world() + "!");
		}
    }

	private String hello() {
        return "Hello";
    }

	private String world() {
        return "World!";
    }


}