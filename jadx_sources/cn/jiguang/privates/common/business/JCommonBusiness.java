package cn.jiguang.privates.common.business;

import android.content.Context;
import android.os.Bundle;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.binder.JMessenger;
import cn.jiguang.privates.common.constants.JCommonConstants;
import cn.jiguang.privates.common.observer.JObservable;
import cn.jiguang.privates.common.observer.JObserver;

/* JADX INFO: loaded from: classes.dex */
public class JCommonBusiness {
    private static final String TAG = "JCommonBusiness";
    private static volatile JCommonBusiness instance;

    public static JCommonBusiness getInstance() {
        if (instance == null) {
            synchronized (JCommonBusiness.class) {
                instance = new JCommonBusiness();
            }
        }
        return instance;
    }

    public void init(Context context) {
        for (String str : JObservable.getInstance().observeNameQueue) {
            Bundle bundle = new Bundle();
            bundle.putString(JCommonConstants.Observer.KEY_OBSERVER_NAME, str);
            JMessenger.getInstance().sendMessageToRemoteProcess(context, 101, bundle);
        }
        try {
            Object objNewInstance = Class.forName("cn.jiguang.privates.collect.JCollect").newInstance();
            if (objNewInstance instanceof JObserver) {
                JCommonPrivatesApi.observer(context.getApplicationContext(), (JObserver) objNewInstance);
            }
        } catch (Throwable unused) {
        }
        try {
            Object objNewInstance2 = Class.forName("cn.jiguang.privates.geofence.JGeofence").newInstance();
            if (objNewInstance2 instanceof JObserver) {
                JCommonPrivatesApi.observer(context.getApplicationContext(), (JObserver) objNewInstance2);
            }
        } catch (Throwable unused2) {
        }
        try {
            Object objNewInstance3 = Class.forName("cn.jiguang.privates.wake.JWake").newInstance();
            if (objNewInstance3 instanceof JObserver) {
                JCommonPrivatesApi.observer(context.getApplicationContext(), (JObserver) objNewInstance3);
            }
        } catch (Throwable unused3) {
        }
    }

    public void release(Context context) {
    }
}
