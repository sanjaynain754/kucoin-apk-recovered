package cn.jiguang.privates.common.observer;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jiguang.privates.common.binder.JMessenger;
import cn.jiguang.privates.common.constants.JCommonConstants;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public class JObservable {
    private static final String TAG = "JObservable";
    public static final int WHAT_OBSERVER = 101;
    private static volatile JObservable instance;
    public ConcurrentLinkedQueue<JObserver> observeQueue = new ConcurrentLinkedQueue<>();
    public ConcurrentLinkedQueue<String> observeNameQueue = new ConcurrentLinkedQueue<>();

    public static JObservable getInstance() {
        if (instance == null) {
            synchronized (JObservable.class) {
                instance = new JObservable();
            }
        }
        return instance;
    }

    public void dispatchMessage(Context context, int i11, Bundle bundle) {
        for (JObserver jObserver : this.observeQueue) {
            if (jObserver.isSupport(i11)) {
                jObserver.dispatchMessage(context, i11, bundle);
            }
        }
    }

    public void handleMessage(Context context, int i11, String str, int i12, Bundle bundle) {
        for (JObserver jObserver : this.observeQueue) {
            if (Arrays.asList(jObserver.getThreadName()).contains(str) && jObserver.isSupport(i12)) {
                if (i11 == 0) {
                    jObserver.handleMessage(context, i12, bundle);
                }
                if (i11 == 1) {
                    jObserver.handleDelayMessage(context, i12, bundle);
                }
            }
        }
    }

    public void observer(Context context, JObserver jObserver) {
        if (this.observeQueue.contains(jObserver)) {
            return;
        }
        String canonicalName = jObserver.getClass().getCanonicalName();
        if (this.observeNameQueue.contains(canonicalName)) {
            return;
        }
        JCommonLog.m5430d(TAG, "observer " + canonicalName);
        this.observeQueue.add(jObserver);
        this.observeNameQueue.add(canonicalName);
        Bundle bundle = new Bundle();
        bundle.putString(JCommonConstants.Observer.KEY_OBSERVER_NAME, canonicalName);
        if (JGlobal.isMainProcess(context)) {
            boolean lifecycleState = JGlobal.getLifecycleState();
            String currentActivityName = JGlobal.getCurrentActivityName();
            if (!TextUtils.isEmpty(currentActivityName)) {
                bundle.putBoolean("state", lifecycleState);
                bundle.putString("activity", currentActivityName);
                if (jObserver.isSupport(1005) || jObserver.isSupport(1006)) {
                    jObserver.dispatchMessage(context, 1005, null);
                }
            }
            boolean networkState = JGlobal.getNetworkState();
            int networkType = JGlobal.getNetworkType();
            String networkName = JGlobal.getNetworkName();
            String networkRadio = JGlobal.getNetworkRadio();
            if (!TextUtils.isEmpty(networkRadio)) {
                bundle.putBoolean("state", networkState);
                bundle.putInt("type", networkType);
                bundle.putString("name", networkName);
                bundle.putString(JCommonConstants.Network.KEY_RADIO, networkRadio);
                if (jObserver.isSupport(1003) || jObserver.isSupport(1004)) {
                    jObserver.dispatchMessage(context, networkState ? 1003 : 1004, null);
                }
            }
        }
        JMessenger.getInstance().sendMessageToRemoteProcess(context, 101, bundle);
    }

    public void observerOnRemoteProcess(Context context, Bundle bundle) {
        try {
            String string = bundle.getString(JCommonConstants.Observer.KEY_OBSERVER_NAME);
            if (!this.observeNameQueue.contains(string)) {
                Object objNewInstance = Class.forName(string).newInstance();
                if (objNewInstance instanceof JObserver) {
                    JObserver jObserver = (JObserver) objNewInstance;
                    observer(context, jObserver);
                    boolean z11 = bundle.getBoolean("state");
                    String string2 = bundle.getString("activity");
                    if (!TextUtils.isEmpty(string2)) {
                        JGlobal.setLifecycleState(z11);
                        JGlobal.setCurrentActivityName(string2);
                        int i11 = JCommonConstants.RemoteWhat.TO_FOREGROUND;
                        if (jObserver.isSupport(JCommonConstants.RemoteWhat.TO_FOREGROUND) || jObserver.isSupport(JCommonConstants.RemoteWhat.TO_BACKGROUND)) {
                            if (!z11) {
                                i11 = 1994;
                            }
                            jObserver.dispatchMessage(context, i11, null);
                        }
                    }
                    boolean z12 = bundle.getBoolean("state");
                    int i12 = bundle.getInt("type");
                    String string3 = bundle.getString("name");
                    String string4 = bundle.getString(JCommonConstants.Network.KEY_RADIO);
                    if (!TextUtils.isEmpty(string4)) {
                        JGlobal.setNetworkState(z12);
                        JGlobal.setNetworkType(i12);
                        JGlobal.setNetworkName(string3);
                        JGlobal.setNetworkRadio(string4);
                        int i13 = JCommonConstants.RemoteWhat.ON_NETWORK_CONNECTED;
                        if (jObserver.isSupport(JCommonConstants.RemoteWhat.ON_NETWORK_CONNECTED) || jObserver.isSupport(JCommonConstants.RemoteWhat.ON_NETWORK_DISCONNECTED)) {
                            if (!z11) {
                                i13 = 1996;
                            }
                            jObserver.dispatchMessage(context, i13, null);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "observer failed " + th2.getMessage());
        }
    }
}
