import java.util.*;
public class Math {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter five numbers:");
        for(int i = 0; i < 5; i++){
            int num = in.nextInt();
            list.add(num);
        }
        System.out.println(sum(list));
        System.out.println(product(list));
        System.out.println(findLargest(list));
        System.out.println(findSmallest(list));

    }

    public static int sum(List<Integer> list){
        int total = 0;
        for(int num : list){
            total += num;
        }
        return total;
    }

    public static int product(List<Integer> list){
        int total = 1;
        for(int num : list){
            total *= num;
        }
        return total;
    }

    public static int findLargest(List<Integer> list){
        int max = 0;
        for(int num : list){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    public static int findSmallest(List<Integer> list){
        int min = Integer.MAX_VALUE;
        for(int num : list){
            if(num < min){
                min = num;
            }
        }
        return min;
    }
}
