1. 에라토스테네스의 체
``` Java
boolean[] arr = new boolean[num+1];
Arrays.fill(arr, true);

        arr[0] = false;
        arr[1] = false;

        for(int i=2; i*i <num; i++) {
            if (arr[i]) {
                for (int j = i*i; j <= num; j += i) {
                    arr[j] = false;
                }
            }
        }
```
