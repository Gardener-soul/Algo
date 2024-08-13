package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Patient {
    int index;
    int risk;

    public Patient(int index, int risk) {
        this.index = index;
        this.risk = risk;
    }
}

public class EmergencyRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 환자 수
        int m = sc.nextInt();  // 몇 번째 환자인지 확인하려는 인덱스

        Queue<Patient> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int risk = sc.nextInt();
            q.add(new Patient(i, risk));
        }

        int answer = 0;

        while (!q.isEmpty()) {
            Patient current = q.poll();
            boolean hasHigherRisk = false;

            for (Patient p : q) {
                if (p.risk > current.risk) {
                    hasHigherRisk = true;
                    break;
                }
            }

            if (hasHigherRisk) {
                q.add(current);  // 위협도가 높은 환자가 있으므로 뒤로 보냄
            } else {
                answer++;
                if (current.index == m) {
                    System.out.println(answer);
                    return;
                }
            }
        }
    }
}
