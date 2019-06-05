import java.util.Scanner;

public class RemoveValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cho mang:");
        int size =scanner.nextInt();
        System.out.println("Nhap phan tu can xoa");
        int remove = scanner.nextInt();
        int indexRemove =0;
        int[] array = new int[size];
        System.out.println("nhap cac phan tu cho mang");
        for (int i=0;i<array.length;i++){
            int x = scanner.nextInt();
            array[i] = x;
        }
        for (int i=0;i<array.length;i++){
            if (array[i] == remove){
                System.out.println("vi tri phan tu can xoa la:"+" "+(i+1));
                indexRemove =i;
            }
        }

        for (int i = indexRemove;i<array.length-1;i++){
            array[i] =array[i+1];
        }
        System.out.println("Mang sau khi xoa la");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
        }


    }
}
