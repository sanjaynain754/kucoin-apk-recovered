package cn.jiguang.privates.common;

import android.content.Context;
import android.os.Bundle;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.binder.JMessenger;
import cn.jiguang.privates.common.business.lifecycle.JLifecycleBusiness;
import cn.jiguang.privates.common.business.network.JNetworkBusiness;
import cn.jiguang.privates.common.constants.JCommonConstants;
import cn.jiguang.privates.common.observer.JObserver;

/* JADX INFO: loaded from: classes.dex */
public class JCommon extends JObserver {
    public static final String THREAD_COMMON = "JIGUANG-PRIVATES-COMMON";

    @Override // cn.jiguang.privates.common.observer.JObserver
    public void dispatchMessage(Context context, int i11, Bundle bundle) {
        JCommonPrivatesApi.sendMessage(context, THREAD_COMMON, i11, bundle);
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public String[] getThreadName() {
        return new String[]{THREAD_COMMON};
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public void handleMessage(Context context, int i11, Bundle bundle) {
        if (i11 == 1000) {
            JMessenger.getInstance().initOnMainProcess(context);
            return;
        }
        if (i11 == 1007) {
            JNetworkBusiness.getInstance().onMainNetworkState(context, bundle);
            return;
        }
        if (i11 == 1008) {
            JLifecycleBusiness.getInstance().onMainLifecycleState(context, bundle);
            return;
        }
        switch (i11) {
            case JCommonConstants.RemoteWhat.TO_BACKGROUND /* 1994 */:
            case JCommonConstants.RemoteWhat.TO_FOREGROUND /* 1995 */:
                JLifecycleBusiness.getInstance().onRemoteLifecycleState(context, bundle);
                break;
            case JCommonConstants.RemoteWhat.ON_NETWORK_DISCONNECTED /* 1996 */:
            case JCommonConstants.RemoteWhat.ON_NETWORK_CONNECTED /* 1997 */:
                JNetworkBusiness.getInstance().onRemoteNetworkState(context, bundle);
                break;
        }
    }

    @Override // cn.jiguang.privates.common.observer.JObserver
    public boolean isSupport(int i11) {
        if (i11 == 1000 || i11 == 1007 || i11 == 1008) {
            return true;
        }
        switch (i11) {
            case JCommonConstants.RemoteWhat.TO_BACKGROUND /* 1994 */:
            case JCommonConstants.RemoteWhat.TO_FOREGROUND /* 1995 */:
            case JCommonConstants.RemoteWhat.ON_NETWORK_DISCONNECTED /* 1996 */:
            case JCommonConstants.RemoteWhat.ON_NETWORK_CONNECTED /* 1997 */:
                return true;
            default:
                return false;
        }
    }
}
