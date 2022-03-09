class Lesson08_04 {
    public static void main(String[] args) {
        // 2次元配列を宣言
        String[][][] arr;
        arr = new String[3][3][3];

        arr[0][0][0] = "佐藤";
        arr[0][0][1] = "鈴木";
        arr[0][0][2] = "田中";
        arr[0][1][0] = "高橋";
        arr[0][1][1] = "小谷";
        arr[0][1][2] = "小森";
        arr[0][2][0] = "小林";
        arr[0][2][1] = "本田";
        arr[0][2][2] = "吉田";

        System.out.println(arr[0][0][0]);
        System.out.println(arr[0][0][1]);
        System.out.println(arr[0][0][2]);
        System.out.println(arr[0][1][0]);
        System.out.println(arr[0][1][1]);
        System.out.println(arr[0][1][2]);
        System.out.println(arr[0][2][0]);
        System.out.println(arr[0][2][1]);
        System.out.println(arr[0][2][2]);
    }
}