import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            String[] xy = br.readLine().split(" ");

            int st_x = Integer.parseInt(xy[0]);
            int st_y = Integer.parseInt(xy[1]);
            int en_x = Integer.parseInt(xy[2]);
            int en_y = Integer.parseInt(xy[3]);

            int C = Integer.parseInt(br.readLine());
            int count = 0;
            
            while (C --> 0) {
                String[] c_xyr = br.readLine().split(" ");
            
                int c_x = Integer.parseInt(c_xyr[0]);
                int c_y = Integer.parseInt(c_xyr[1]);
                int c_r = Integer.parseInt(c_xyr[2]); 

                double  Sdis = Math.pow(st_x-c_x, 2) + Math.pow(st_y - c_y, 2);
                double  Edis = Math.pow(en_x-c_x, 2) + Math.pow(en_y - c_y, 2);
                double r = Math.pow(c_r, 2);

                if(Sdis < r && Edis < r){
                    continue;
                }

                if(Sdis < r){
                  count++;
                }

                if(Edis < r){
                    count ++;
                }
            }
            System.out.println(count);
        }

    }

}