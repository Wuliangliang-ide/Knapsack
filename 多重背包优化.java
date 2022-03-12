import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), capacity = sc.nextInt(); // 物品数量以及背包容量
        int capacities[] = new int[1005];
        while (num-- > 0) {
            int weight = sc.nextInt(), val = sc.nextInt(), s = sc.nextInt(); // 重量 价值 个数
            for (int i = 1; i <= s; i++) {
                for (int j = capacity; j >= weight; j--) { // 01背包方案解决
                    if (capacities[j - weight] + val > capacities[j])
                        capacities[j] = capacities[j - weight] + val;
                }
            }
        }
        System.out.println(capacities[capacity]);
    }
}
