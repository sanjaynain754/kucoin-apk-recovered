package cn.jiguang.privates.common.binder;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import cn.jiguang.privates.common.business.JCommonBusiness;
import cn.jiguang.privates.common.cache.JCommonConfig;
import cn.jiguang.privates.common.cache.JCommonTransferConfig;
import cn.jiguang.privates.common.component.JCommonService;
import cn.jiguang.privates.common.constants.JCommonConstants;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public class JMessenger {
    private static final String TAG = "JMessenger";
    private static volatile JMessenger instance;
    private Messenger mainMessenger;
    private Messenger remoteMessenger;
    private boolean serviceFlag = false;
    private final ConcurrentLinkedQueue<Message> mainMessageQueue = new ConcurrentLinkedQueue<>();
    private final ConcurrentLinkedQueue<Message> remoteMessageQueue = new ConcurrentLinkedQueue<>();

    public static JMessenger getInstance() {
        if (instance == null) {
            synchronized (JMessenger.class) {
                instance = new JMessenger();
            }
        }
        return instance;
    }

    public IBinder getBinder() {
        return this.remoteMessenger.getBinder();
    }

    public void initMainMessenger(Messenger messenger) {
        if (messenger == null) {
            return;
        }
        try {
            this.mainMessenger = messenger;
            Iterator<Message> it = this.mainMessageQueue.iterator();
            while (it.hasNext()) {
                this.mainMessenger.send(it.next());
                it.remove();
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "initMainMessenger failed " + th2.getMessage());
        }
    }

    public void initOnMainProcess(Context context) {
        try {
            if (this.mainMessenger == null) {
                JCommonLog.m5432i(TAG, "init common version:2.2.0");
                if (!initConfig(context)) {
                    return;
                }
                this.mainMessenger = new Messenger(new MainMessengerHandler(context, Looper.getMainLooper()));
                Iterator<Message> it = this.mainMessageQueue.iterator();
                while (it.hasNext()) {
                    this.mainMessenger.send(it.next());
                    it.remove();
                }
            }
            if (JGlobal.isNeedRemoteProcess && !this.serviceFlag) {
                this.serviceFlag = true;
                if (JGlobal.getCommonService(context) == null) {
                    JCommonLog.m5431e(TAG, "JCommonService is null, please create new Service extends JCommonService");
                    return;
                }
                JMessengerConnection jMessengerConnection = new JMessengerConnection(context);
                JCommonService commonService = JGlobal.getCommonService(context);
                if (commonService == null) {
                    JCommonLog.m5431e(TAG, "initOnMainProcess error, there are no service extends JCommonService");
                    return;
                }
                Intent intent = new Intent();
                intent.setClass(context, commonService.getClass());
                context.bindService(intent, jMessengerConnection, 1);
                if (Build.VERSION.SDK_INT < 26) {
                    context.startService(intent);
                }
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "initOnMainProcess failed " + th2.getMessage());
        }
    }

    public void initOnRemoteProcess(Context context) {
        try {
            if (this.remoteMessenger != null) {
                return;
            }
            JGlobal.isNeedRemoteProcess = true;
            JCommonLog.m5432i(TAG, "init common version:2.2.0");
            if (initConfig(context)) {
                this.remoteMessenger = new Messenger(new RemoteMessengerHandler(context, Looper.getMainLooper()));
                Iterator<Message> it = this.remoteMessageQueue.iterator();
                while (it.hasNext()) {
                    this.remoteMessenger.send(it.next());
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "initOnRemoteProcess failed " + th2.getMessage());
        }
    }

    public void onServiceConnected(Context context, IBinder iBinder) {
        JCommonLog.m5432i(TAG, "onServiceConnected");
        this.serviceFlag = true;
        JCommonBusiness.getInstance().init(context);
        this.remoteMessenger = new Messenger(iBinder);
        try {
            Iterator<Message> it = this.remoteMessageQueue.iterator();
            while (it.hasNext()) {
                this.remoteMessenger.send(it.next());
                it.remove();
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "sendMessageToRemoteProcess failed " + th2.getMessage());
        }
        sendMessageToMainProcess(context, 1001, null);
        sendMessageToRemoteProcess(context, JCommonConstants.RemoteWhat.ON_SERVICE_CONNECTED, null);
    }

    public void onServiceDisconnected(Context context) {
        JCommonLog.m5432i(TAG, "onServiceDisconnected");
        this.serviceFlag = false;
        this.mainMessenger = null;
        this.remoteMessenger = null;
        this.mainMessageQueue.clear();
        this.remoteMessageQueue.clear();
        sendMessageToMainProcess(context, 1002, null);
    }

    public void sendMessageToMainProcess(Context context, int i11, Bundle bundle) {
        try {
            Message messageObtain = Message.obtain();
            messageObtain.what = i11;
            messageObtain.setData(bundle);
            Messenger messenger = this.mainMessenger;
            if (messenger == null) {
                this.mainMessageQueue.add(messageObtain);
            } else {
                messenger.send(messageObtain);
            }
        } catch (DeadObjectException e11) {
            JCommonLog.m5433w(TAG, "sendMessageToMainProcess DeadObjectException " + e11.getMessage());
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "sendMessageToMainProcess failed " + th2.getMessage());
        }
    }

    public void sendMessageToRemoteProcess(Context context, int i11, Bundle bundle) {
        try {
            if (JGlobal.isNeedRemoteProcess) {
                Message messageObtain = Message.obtain();
                messageObtain.what = i11;
                messageObtain.setData(bundle);
                if (JGlobal.isMainProcess(context)) {
                    messageObtain.replyTo = this.mainMessenger;
                }
                Messenger messenger = this.remoteMessenger;
                if (messenger == null) {
                    this.remoteMessageQueue.add(messageObtain);
                } else {
                    messenger.send(messageObtain);
                }
            }
        } catch (DeadObjectException e11) {
            JCommonLog.m5433w(TAG, "sendMessageToRemoteProcess DeadObjectException " + e11.getMessage());
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "sendMessageToRemoteProcess failed " + th2.getMessage());
        }
    }

    private boolean initConfig(Context context) {
        JCommonTransferConfig.initConfig(context);
        String appKey = JGlobal.getAppKey(context);
        if (TextUtils.isEmpty(appKey)) {
            JCommonLog.m5431e(TAG, "appKey is empty, please check it");
            return false;
        }
        String appChannel = JGlobal.getAppChannel(context);
        String appProcess = JGlobal.getAppProcess(context);
        String appVersionName = JGlobal.getAppVersionName(context);
        JCommonLog.m5430d(TAG, "appVersionCode:" + JGlobal.getAppVersionCode(context) + ", appVersionName:" + appVersionName + ", appKey:" + appKey + ", appChannel:" + appChannel + ", appProcess:" + appProcess);
        JCommonConfig.setSdkVersionName(context, "2.2.0");
        JCommonConfig.setSdkVersionCode(context, 220);
        JCommonConfig.setAppKey(context, appKey);
        JCommonConfig.setAppChannel(context, appChannel);
        return true;
    }
}
