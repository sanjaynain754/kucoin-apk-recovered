package cn.jiguang.privates.core.business.active;

import android.content.Context;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.core.business.connect.JConnectBusiness;
import cn.jiguang.privates.core.cache.JCoreConfig;
import cn.jiguang.privates.core.constants.JCoreConstants;
import cn.jiguang.privates.core.global.JCoreGlobal;

/* JADX INFO: loaded from: classes34.dex */
public class JActiveBusiness {
    private static final String TAG = "JActiveBusiness";
    private static volatile JActiveBusiness instance;
    private long lastToForegroundTime = 0;
    private long lastToBackgroundTime = 0;

    public static JActiveBusiness getInstance() {
        if (instance == null) {
            synchronized (JActiveBusiness.class) {
                instance = new JActiveBusiness();
            }
        }
        return instance;
    }

    public void toBackground(Context context) {
        if (!JCoreConfig.getConnectState(context)) {
            return;
        }
        this.lastToBackgroundTime = System.currentTimeMillis();
    }

    public void toForeground(Context context) {
        if (JCoreConfig.getConnectState(context) && this.lastToBackgroundTime != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.lastToForegroundTime = jCurrentTimeMillis;
            if (jCurrentTimeMillis - this.lastToBackgroundTime < JCoreGlobal.getHeartbeatInterval() / 2) {
                return;
            }
            if (!JConnectBusiness.getInstance().isTcpConnecting()) {
                JCommonLog.m5430d(TAG, "re connect");
                JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.STOP_CONNECT, null);
                JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.START_CONNECT, null);
            } else {
                JCommonLog.m5430d(TAG, "re heartbeat");
                JConnectBusiness.getInstance().stopHeartbeat(context);
                JConnectBusiness.getInstance().startHeartbeat(context);
            }
        }
    }
}
