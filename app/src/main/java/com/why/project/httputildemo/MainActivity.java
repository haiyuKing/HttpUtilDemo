package com.why.project.httputildemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.why.project.httputildemo.util.httputil.HttpUtil;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Login();
	}

	/**
	 * 程序登录
	 */
	private void Login(){
		if (HttpUtil.isNetworkAvailable(this)) {
			//执行网络请求接口
		}else{
			//配合ToastUtil提示"当前网络未连接"
			//ToastUtil.showShortToast(MyApplication.getAppContext().getResources().getString(R.string.network_enable));
		}
	}
}
