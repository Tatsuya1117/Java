class se4_19 {
    public static void main(String[] args) {
        int i = 0;
        while(i < 2) {
            i++;
            for(int j = 0; j < 2; j++) {
                System.out.println("iは、" + i + "回目のループです。");
                System.out.println("jは、" + j + "回目のループです。");
                System.out.println(i * j + " ");
                System.out.println(" ");
            }
        }
    }
}