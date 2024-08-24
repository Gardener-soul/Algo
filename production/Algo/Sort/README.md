1. 선택 정렬
```java
public class Selection_Sort {
    public static int[] Solution (int num , int[] arr) {
        for (int i=0; i<num-1; i++) {
            int idx = i;
            // 가장 작은 값을 찾는 루프
            for (int j=i+1; j<num; j++) {
                if(arr[idx] > arr[j]) idx = j; //현재 최솟값의 idx 저장
            }
            // 한 번의 교환만 수행
            int tmp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Solution(num, arr);

        for(int i=0; i<num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

2. 버블 정렬
```java
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
```

3. 삽입 정렬
```java
public class Insertion_Sort {
    public static int[] Solution (int num , int[] arr) {
        for(int i=1; i<num; i++) {
            for(int j=i; j>0; j--) {
                if(arr[j] < arr[j-1]) {
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]= tmp;
                } else break;
            }
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Solution(num, arr);

        for(int i=0; i<num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

4. 좌표 정렬
```java
class Point implements Comparable<Point> {
    public int x, y;
    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int compareTo(Point o) {
        if(this.x==o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}

Collections.sort(arr);
```

5. 이분 검색

```java
int lt = 0, rt = arr.length-1;

while(lt<=rt) {
    if(arr[mid] == target) {
        answer = mid + 1;
        break;
        }
    if(arr[mid]>target) rt = mid-1;
    else lt = mid+1;
}
```