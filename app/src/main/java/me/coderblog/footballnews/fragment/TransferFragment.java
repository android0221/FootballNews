package me.coderblog.footballnews.fragment;


import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import me.coderblog.footballnews.global.Http;
import me.coderblog.footballnews.util.Utils;

/**
 * 转会Fragment
 */
public class TransferFragment extends BaseFragment {

    //首次从服务中获取数据
    @Override
    public void loadDataFromServer() {
        //创建请求队列
        RequestQueue requestQueue = Volley.newRequestQueue(Utils.getContext());
        //创建请求
        StringRequest stringRequest = new StringRequest(Http.URL_Transfer, this, this);
        //将请求添加到请求队列
        requestQueue.add(stringRequest);
    }
}
