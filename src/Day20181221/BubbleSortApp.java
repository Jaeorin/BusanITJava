package Day20181221;

public class BubbleSortApp {

    public static void main(String[] args) {
        int a[] = {5, 4, 3, 2, 1};
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int k = 0; k < a.length - 1; k++) {
                if (a[k] > a[k + 1]) {
                    temp = a[k]; // 값을 바꾸기 위해 temp 라는 임시 저장공간 생성
                    a[k] = a[k + 1]; // 큰값과 작은 값을 변경
                    a[k + 1] = temp; // 임시로 저장한 temp 에 a[k]값을 a[k+1]에 삽입
                }
            }
        }
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }
    }

}
