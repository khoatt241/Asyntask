package com.example.asyntask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAsync;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAsync = findViewById(R.id.buttonAsyntask);

        btnAsync.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    //param: tham số truyền vào để xử lý logic
    //progress: tham số cập nhật giá trị khi đang xử lý
    //result: tham số trả về sau khi xử lý xong
    class XulyAsync extends AsyncTask<String, String, String > {

        //trước khi xử lý muốn thay đổi gì ko
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        //tham số truyền vào để doinbackground xử lý logic
        //... tượng trưng cho mảng
        @Override
        protected String doInBackground(String... strings) {
            //gửi đi dưới dạng chuỗi
            //publishProgress(a); gửi a đi
            //ví dụ b return về integer
            return null;
        }

        @Override
        protected void onProgressUpdate(String... values) {
            //nhận dữ liệu dưới dạng mảng
            //values = a, nhận a liền
            super.onProgressUpdate(values);
        }

        //tham số truyền vào integer s, lúc này s nhận tham số truyền vào là b
        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }
    }
}
