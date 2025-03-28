import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int n3 = Integer.parseInt(st.nextToken());
        int max = n1;

        if (n1 == n2 && n1 == n3) {
            System.out.println(10000 + n1*1000);
        } else if (n1 == n2 || n1 == n3) {
            System.out.println(1000 + n1*100);
        } else if (n2 == n3) {
            System.out.println(1000 + n2*100);
        } else {
            if(max <= n2){
                max = n2;
                if(max <= n3){
                    max = n3;
                }
            } else {
              if(max <= n3){
                  max = n3;
              }
            }
            System.out.println(max*100);
        }
    }
}