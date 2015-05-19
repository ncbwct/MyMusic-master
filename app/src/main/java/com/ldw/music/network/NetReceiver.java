package com.ldw.music.network;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class NetReceiver extends BroadcastReceiver {


	public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(action)) {
            boolean GPRSisConnected = NetUtils.isMobileConnected(context);
            boolean WLANSisConnected = NetUtils.isWifiConnected(context);
            boolean isConnected = NetUtils.isNetworkConnected(context);
            System.out.println("网络状态：" + isConnected);
            System.out.println("wifi状态：" + NetUtils.isWifiConnected(context));
            System.out.println("移动网络状态：" + NetUtils.isMobileConnected(context));
            System.out.println("网络连接类型：" + NetUtils.getConnectedType(context));

if(isConnected){
    Toast.makeText(context, "关闭你的WLAN和GPRS，好好学习，不要玩手机", Toast.LENGTH_LONG).show();

//}else if (!GPRSisConnected&&WLANSisConnected){
//
//    Toast.makeText(context, "关闭你的WLAN，好好学习，不要玩手机", Toast.LENGTH_LONG).show();
//}else if (GPRSisConnected&&!WLANSisConnected) {
//
//    Toast.makeText(context, "关闭你的GPRS，好好学习，不要玩手机", Toast.LENGTH_LONG).show();
//
}else Toast.makeText(context, "已经断开网络，好好学习吧", Toast.LENGTH_LONG).show();



//            if (NetUtils.isWifiConnected(context) && NetUtils.isGPRDConnected(context))
//                Toast.makeText(context, "关闭你的WLAN和GPRS，好好学习，不要玩手机", Toast.LENGTH_LONG).show();
//            else if (NetUtils.isMobileConnected(context) && !NetUtils.isWifiConnected(context))
//                Toast.makeText(context, "关闭你的GPRS，好好学习,不要玩手机", Toast.LENGTH_LONG).show();
//                 else if (!NetUtils.isMobileConnected(context) && NetUtils.isWifiConnected(context))
//                Toast.makeText(context, "关闭你的WLAN，好好学习,不要玩手机", Toast.LENGTH_LONG).show();
//
//                      else
//                        Toast.makeText(context, "已经断开网络，继续学习吧", Toast.LENGTH_LONG).show();

        }
    }
}
	

