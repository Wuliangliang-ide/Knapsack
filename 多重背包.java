import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), capacity = sc.nextInt(); // 物品数量已经背包容量
        int[][] infos = new int[num + 1][3];
        int tot = 0; // 统计物品的总数量
        for (int i = 1; i <= num; i++) {
            infos[i] = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()}; // 重量 价值 个数
            tot += infos[i][2];
        }
        int[][] items = new int[tot + 1][2];
        for (int i = 1, t = 1; i <= num; i++) {
            int n = infos[i][2];
            while (n-- > 0) {
                items[t++] = new int[]{infos[i][0], infos[i][1]}; // 拆分01背包问题
            }
        }
        // example
        /**
          4 5
          1 2 3
          2 4 1
          3 4 3
          4 5 2
         */
        int[] capacities = new int[capacity + 1];
        for (int i = 1; i <= tot; i++) { // 用01背包方案解决
            for (int j = capacity; j >= items[i][0]; j--) {
                if (capacities[j - items[i][0]] + items[i][1] > capacities[j])
                    capacities[j] = capacities[j - items[i][0]] + items[i][1];
            }
        }
//        System.out.println(Arrays.toString(capacities));
        System.out.println(capacities[capacity]);
    }
}
