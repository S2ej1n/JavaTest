import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder bld = new StringBuilder();

        int[] chess = {1,1,2,2,2,8};

        for (int i = 0; i < chess.length; i++) {
            int num = Integer.parseInt(st.nextToken());

            bld.append(chess[i] - num).append(" ");
        }
        System.out.println(bld.toString().trim());
    }
}