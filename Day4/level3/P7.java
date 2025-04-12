
public class P7 {

    public int generateOTP() {
        int otp = (int) ((Math.random() * (100000 - 10000)) + 10000);
        return otp;
    }

    public boolean checkUnique(int[] arr) {
        boolean ans = true;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i] == arr[j] && i != j) {
                    ans = false;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        P7 obj = new P7();
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = obj.generateOTP();
            System.out.println(arr[i]);
        }
        boolean unique = obj.checkUnique(arr);
        System.out.println(unique);

    }
}
