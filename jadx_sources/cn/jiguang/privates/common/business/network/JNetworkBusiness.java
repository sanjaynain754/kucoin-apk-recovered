package cn.jiguang.privates.common.business.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.constants.JCommonConstants;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;

/* JADX INFO: loaded from: classes.dex */
public class JNetworkBusiness {
    public static final int STATE_NETWORK_CONNECTED = 1;
    public static final int STATE_NETWORK_DISCONNECTED = 0;
    private static final String TAG = "JNetworkBusiness";
    private static volatile JNetworkBusiness instance;
    private JNetworkListener networkListener;
    private int networkState = 0;
    private boolean init = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    public void onMainNetworkState(Context context, Bundle bundle) {
        ?? r11;
        NetworkInfo networkInfo = (NetworkInfo) bundle.getParcelable("networkInfo");
        if (bundle.containsKey("state")) {
            r11 = bundle.getBoolean("state");
        } else {
            r11 = (networkInfo == null || networkInfo.getState() != NetworkInfo.State.CONNECTED) ? 0 : 1;
        }
        Bundle bundleOnMainNetworkState = onMainNetworkState(context, r11, networkInfo);
        int i11 = JCommonConstants.RemoteWhat.ON_NETWORK_DISCONNECTED;
        if (r11 != 0 && this.networkState == 1) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("state", false);
            bundle2.putInt("type", 0);
            bundle2.putString("name", "unknown");
            bundle2.putString(JCommonConstants.Network.KEY_RADIO, "unknown");
            JCommonLog.m5430d(TAG, "onMainNetworkState network is connecting, new network connected");
            JCommonPrivatesApi.sendMessageToMainProcess(context, 1004, bundle2);
            if (JGlobal.isNeedRemoteProcess) {
                JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCommonConstants.RemoteWhat.ON_NETWORK_DISCONNECTED, bundle2);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onMainNetworkState ");
        sb2.append(r11 != 0 ? "connected" : "disConnected");
        sb2.append(" currentNetwork:");
        sb2.append(JGlobal.getNetworkName());
        JCommonLog.m5430d(TAG, sb2.toString());
        this.networkState = r11;
        JCommonPrivatesApi.sendMessageToMainProcess(context, r11 != 0 ? 1003 : 1004, bundleOnMainNetworkState);
        if (JGlobal.isNeedRemoteProcess) {
            if (r11 != 0) {
                i11 = JCommonConstants.RemoteWhat.ON_NETWORK_CONNECTED;
            }
            JCommonPrivatesApi.sendMessageToRemoteProcess(context, i11, bundleOnMainNetworkState);
        }
    }

    public void release(Context context) {
        this.networkState = 0;
        ((ConnectivityManager) context.getSystemService("connectivity")).unregisterNetworkCallback(this.networkListener);
    }

    public static JNetworkBusiness getInstance() {
        if (instance == null) {
            synchronized (JNetworkBusiness.class) {
                instance = new JNetworkBusiness();
            }
        }
        return instance;
    }

    public void init(Context context) {
        if (this.init) {
            return;
        }
        this.init = true;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (Build.VERSION.SDK_INT >= 26) {
                JNetworkListener jNetworkListener = new JNetworkListener(context);
                this.networkListener = jNetworkListener;
                connectivityManager.registerDefaultNetworkCallback(jNetworkListener);
            } else {
                NetworkRequest networkRequestBuild = new NetworkRequest.Builder().build();
                JNetworkListener jNetworkListener2 = new JNetworkListener(context);
                this.networkListener = jNetworkListener2;
                connectivityManager.registerNetworkCallback(networkRequestBuild, jNetworkListener2);
            }
        } catch (Exception e11) {
            JCommonLog.m5431e(TAG, "init err " + e11.getMessage());
        }
    }

    public void onRemoteNetworkState(Context context, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        boolean z11 = bundle.getBoolean("state");
        int i11 = bundle.getInt("type");
        String string = bundle.getString("name");
        String string2 = bundle.getString(JCommonConstants.Network.KEY_RADIO);
        JGlobal.setNetworkState(z11);
        JGlobal.setNetworkType(i11);
        if (TextUtils.isEmpty(string)) {
            string = "unknown";
        }
        JGlobal.setNetworkName(string);
        if (TextUtils.isEmpty(string2)) {
            string2 = "unknown";
        }
        JGlobal.setNetworkRadio(string2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onRemoteNetworkState ");
        sb2.append(z11 ? "connected" : "disConnected");
        sb2.append(" currentNetwork:");
        sb2.append(JGlobal.getNetworkName());
        JCommonLog.m5430d(TAG, sb2.toString());
    }

    public Bundle onMainNetworkState(Context context, boolean z11, NetworkInfo networkInfo) {
        Bundle bundle = new Bundle();
        if (!z11) {
            JGlobal.setNetworkState(false);
            JGlobal.setNetworkType(0);
            JGlobal.setNetworkName("unknown");
            JGlobal.setNetworkRadio("unknown");
            bundle.putBoolean("state", false);
            bundle.putInt("type", 0);
            bundle.putString("name", "unknown");
            bundle.putString(JCommonConstants.Network.KEY_RADIO, "unknown");
            return bundle;
        }
        JGlobal.setNetworkState(true);
        bundle.putBoolean("state", true);
        if (networkInfo.getType() == 1) {
            JGlobal.setNetworkType(1);
            JGlobal.setNetworkName("wifi");
            JGlobal.setNetworkRadio("wifi");
            bundle.putInt("type", 1);
            bundle.putString("name", "wifi");
            bundle.putString(JCommonConstants.Network.KEY_RADIO, "wifi");
            return bundle;
        }
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                JGlobal.setNetworkType(2);
                JGlobal.setNetworkName(JCommonConstants.Network.NAME_2G);
                JGlobal.setNetworkRadio(JCommonConstants.Network.RADIO_2G);
                bundle.putInt("type", 2);
                bundle.putString("name", JCommonConstants.Network.NAME_2G);
                bundle.putString(JCommonConstants.Network.KEY_RADIO, JCommonConstants.Network.RADIO_2G);
                break;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                JGlobal.setNetworkType(3);
                JGlobal.setNetworkName(JCommonConstants.Network.NAME_3G);
                JGlobal.setNetworkRadio(JCommonConstants.Network.RADIO_3G);
                bundle.putInt("type", 3);
                bundle.putString("name", JCommonConstants.Network.NAME_3G);
                bundle.putString(JCommonConstants.Network.KEY_RADIO, JCommonConstants.Network.RADIO_3G);
                break;
            case 13:
            case 18:
            case 19:
                JGlobal.setNetworkType(4);
                JGlobal.setNetworkName(JCommonConstants.Network.NAME_4G);
                JGlobal.setNetworkRadio(JCommonConstants.Network.RADIO_4G);
                bundle.putInt("type", 4);
                bundle.putString("name", JCommonConstants.Network.NAME_4G);
                bundle.putString(JCommonConstants.Network.KEY_RADIO, JCommonConstants.Network.RADIO_4G);
                break;
            case 20:
                JGlobal.setNetworkType(5);
                JGlobal.setNetworkName(JCommonConstants.Network.NAME_5G);
                JGlobal.setNetworkRadio(JCommonConstants.Network.RADIO_5G);
                bundle.putInt("type", 5);
                bundle.putString("name", JCommonConstants.Network.NAME_5G);
                bundle.putString(JCommonConstants.Network.KEY_RADIO, JCommonConstants.Network.RADIO_5G);
                break;
            default:
                JGlobal.setNetworkType(0);
                JGlobal.setNetworkName("unknown");
                JGlobal.setNetworkRadio("unknown");
                bundle.putInt("type", 0);
                bundle.putString("name", "unknown");
                bundle.putString(JCommonConstants.Network.KEY_RADIO, "unknown");
                break;
        }
        return bundle;
    }
}
