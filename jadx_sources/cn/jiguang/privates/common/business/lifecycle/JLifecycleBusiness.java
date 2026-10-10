package cn.jiguang.privates.common.business.lifecycle;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.component.JCommonService;
import cn.jiguang.privates.common.constants.JCommonConstants;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;

/* JADX INFO: loaded from: classes.dex */
public class JLifecycleBusiness {
    private static final String TAG = "JLifecycleBusiness";
    private static volatile JLifecycleBusiness instance;
    private JLifecycleListener lifecycleListener;
    private boolean init = false;
    private int activityFlag = 0;
    private boolean startServiceFlag = false;

    public static JLifecycleBusiness getInstance() {
        if (instance == null) {
            synchronized (JLifecycleBusiness.class) {
                instance = new JLifecycleBusiness();
            }
        }
        return instance;
    }

    private void startCommonService(Context context) {
        if (Build.VERSION.SDK_INT >= 26 && !this.startServiceFlag && JGlobal.isNeedRemoteProcess) {
            this.startServiceFlag = true;
            JCommonService commonService = JGlobal.getCommonService(context);
            if (commonService == null) {
                return;
            }
            Intent intent = new Intent();
            intent.setClass(context, commonService.getClass());
            context.startService(intent);
        }
    }

    public void init(Context context) {
        if (this.init) {
            return;
        }
        this.init = true;
        JLifecycleListener jLifecycleListener = new JLifecycleListener();
        this.lifecycleListener = jLifecycleListener;
        ((Application) context).registerActivityLifecycleCallbacks(jLifecycleListener);
    }

    public void onRemoteLifecycleState(Context context, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        String string = bundle.getString("activity");
        boolean z11 = bundle.getBoolean("state");
        JGlobal.setCurrentActivityName(string);
        JGlobal.setLifecycleState(z11);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(JGlobal.getLifecycleState() ? "toForeground" : "toBackground");
        sb2.append(" currentActivity:");
        sb2.append(JGlobal.getCurrentActivityName());
        JCommonLog.m5430d(TAG, sb2.toString());
    }

    public void release(Context context) {
        ((Application) context).unregisterActivityLifecycleCallbacks(this.lifecycleListener);
    }

    public void onMainLifecycleState(Context context, Bundle bundle) {
        boolean z11 = bundle.getBoolean("state");
        String string = bundle.getString("activity");
        JGlobal.setLifecycleState(z11);
        JGlobal.setCurrentActivityName(string);
        if (z11) {
            if (this.activityFlag == 0) {
                startCommonService(context);
                JCommonLog.m5430d(TAG, "toForeground currentActivity:" + JGlobal.getCurrentActivityName());
                JCommonPrivatesApi.sendMessageToMainProcess(context, 1005, bundle);
                if (JGlobal.isNeedRemoteProcess) {
                    JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCommonConstants.RemoteWhat.TO_FOREGROUND, bundle);
                }
            }
            this.activityFlag++;
            return;
        }
        int i11 = this.activityFlag;
        if (i11 > 0) {
            this.activityFlag = i11 - 1;
        }
        if (this.activityFlag == 0) {
            JCommonLog.m5430d(TAG, "toBackground currentActivity:" + JGlobal.getCurrentActivityName());
            JCommonPrivatesApi.sendMessageToMainProcess(context, 1006, bundle);
            if (JGlobal.isNeedRemoteProcess) {
                JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCommonConstants.RemoteWhat.TO_BACKGROUND, bundle);
            }
        }
    }
}
