public class usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada ?" + smartTv.ligada);
        System.out.println("Canal atual ? " + smartTv.canal);
        System.out.println("Volume atual ? " + smartTv.volume);


        smartTv.ligar();
        System.out.println("TV ligada ?" + smartTv.ligada);

    }
}
