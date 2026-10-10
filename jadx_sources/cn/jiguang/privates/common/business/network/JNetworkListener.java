package cn.jiguang.privates.common.business.network;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;
import cn.jiguang.privates.common.JCommon;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.log.JCommonLog;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(21)
public class JNetworkListener extends ConnectivityManager.NetworkCallback {
    private static final String TAG = "JNetworkListener";
    private final Context context;

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        onNetworkState(true, network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        onNetworkState(false, network);
    }

    private void onNetworkState(boolean z11, Network network) {
        try {
            JCommonLog.m5430d(TAG, "onNetworkState state:" + z11 + ",network:" + network.toString());
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo();
            Bundle bundle = new Bundle();
            bundle.putBoolean("state", z11);
            bundle.putParcelable("networkInfo", activeNetworkInfo);
            JCommonPrivatesApi.sendMessage(this.context, JCommon.THREAD_COMMON, 1007, bundle);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "onNetworkState failed " + th2.getMessage());
        }
    }

    public JNetworkListener(Context context) {
        this.context = context;
    }
}
