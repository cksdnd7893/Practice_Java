import java.util.Arrays;

public class arrCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {10, 20, 30, 40, 50};
		int arr2[] = new int[arr1.length * 2];
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println(arr1);	// 참조변수 출력
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr1));	// arr1값 출력
		System.out.println(Arrays.toString(arr2));
		
		int arr3[] = {10, 20, 30, 40, 50};
		int arr4[] = new int[arr1.length * 2];
		
		System.arraycopy(arr3, 0, arr4, 1, arr3.length);
		// arr3의 1번째 값부터 그 길이만큼 arr4의 2번째 자리부터 입력
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
	}

}
