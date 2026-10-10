package cn.jiguang.privates.push.platform.google.business;

import android.content.Context;
import android.os.Bundle;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.push.api.JPushPrivatesApi;
import cn.jiguang.privates.push.api.PlatformTokenMessage;
import cn.jiguang.privates.push.constants.JPushConstants;
import cn.jiguang.privates.push.platform.google.callback.JGoogleListener;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: loaded from: classes.dex */
public class JGoogleBusiness {
    private static final String TAG = "JGoogleBusiness";
    private static volatile JGoogleBusiness instance;

    public static JGoogleBusiness getInstance() {
        if (instance == null) {
            synchronized (JGoogleBusiness.class) {
                instance = new JGoogleBusiness();
            }
        }
        return instance;
    }

    public void init(Context context) {
        try {
            int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context);
            if (iIsGooglePlayServicesAvailable == 0) {
                JCommonLog.m5430d(TAG, "support google push");
                FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new JGoogleListener(context));
                return;
            }
            JCommonLog.m5430d(TAG, "not support google push, code:" + iIsGooglePlayServicesAvailable);
            onNode(context, 3002, iIsGooglePlayServicesAvailable, JPushConstants.PlatformNode.KEY_EVENT_TYPE_TOKEN_FAILED, 1);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "init failed " + th2.getMessage());
        }
    }

    public void onNode(Context context, int i11, int i12, int i13, int i14) {
        Bundle bundle = new Bundle();
        bundle.putByte("platform", (byte) 8);
        bundle.putInt("code", i11);
        bundle.putInt(JPushConstants.PlatformNode.KEY_M_CODE, i12);
        bundle.putInt("type", i13);
        bundle.putInt("from", i14);
        JCommonPrivatesApi.sendMessageToMainProcess(context, JPushConstants.MainWhat.ON_PLATFORM_NODE, bundle);
    }

    public void onToken(Context context, String str, int i11) {
        PlatformTokenMessage token = new PlatformTokenMessage().setPlatform((byte) 8).setToken(str);
        Bundle bundle = new Bundle();
        bundle.putParcelable("message", token);
        JPushPrivatesApi.init(context);
        JCommonPrivatesApi.sendMessageToMainProcess(context, JPushConstants.MainWhat.ON_PLATFORM_TOKEN, bundle);
        onNode(context, 3008, 0, JPushConstants.PlatformNode.KEY_EVENT_TYPE_TOKEN_SUCCESS, i11);
    }
}
