import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), capacity = sc.nextInt(); // 物品数量已经背包容量
        int[][] items = new int[num + 1][2];
        for (int i = 1; i <= num; i++)
            items[i] = new int[]{sc.nextInt(), sc.nextInt()}; // 将每对物品容量和价值存储

        // example
        /**
         * 4 5
         * 1 2 2 4 3 4 4 5
         */
        int[] capacities = new int[capacity + 1];
        for (int i = 1; i <= num; i++) {
            for (int j = capacity; j >= items[i][0]; j--) { // 倒叙遍历，为了防止物品被多次计算
                if (capacities[j - items[i][0]] + items[i][1] > capacities[j]) // 如果选择当前物品的价值大于不选择当前物品的价值，就更新该价值
                    capacities[j] = capacities[j - items[i][0]] + items[i][1];
            }
        }
        System.out.println(capacities[capacity]);
    }
}
