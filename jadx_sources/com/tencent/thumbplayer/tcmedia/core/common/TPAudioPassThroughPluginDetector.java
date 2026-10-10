package com.tencent.thumbplayer.tcmedia.core.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes63.dex */
public class TPAudioPassThroughPluginDetector {
    private static final int DEFAULT_MAX_CHANNEL_COUNT = 8;
    private static final String TAG = "TPAudioPassThroughPluginDetector";
    private static boolean hasRegisterReceiver;
    private static boolean isInitted;
    private static WeakReference<Context> mContextRef;
    private static Handler mHandler;
    private static BroadcastReceiver mReceiver;
    private static List<AudioPassThroughPluginListener> listeners = new LinkedList();
    private static boolean mIsAudioPassThroughPlugin = false;
    private static TPAudioPassThroughCapabilities mAudioPassThroughCapabilities = null;

    public interface AudioPassThroughPluginListener {
        void onAudioPassThroughPlugin(boolean z11);
    }

    public static class HdmiAudioPlugBroadcastReceiver extends BroadcastReceiver {
        private HdmiAudioPlugBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            TPNativeLog.printLog(2, TPAudioPassThroughPluginDetector.TAG, "HdmiAudioPlugBroadcastReceiver onReceive: " + intent.getAction());
            boolean z11 = false;
            int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0);
            if (intExtra != 0 && intExtra == 1) {
                z11 = true;
            }
            TPNativeLog.printLog(2, TPAudioPassThroughPluginDetector.TAG, "HdmiAudioPlugBroadcastReceiver audioPassThroughState:" + intExtra + " bPlugin:" + z11);
            TPAudioPassThroughPluginDetector.onUpdateAudioCapabilities(new TPAudioPassThroughCapabilities(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)));
            TPAudioPassThroughPluginDetector.notifyAudioPassThroughStateChange(z11);
        }
    }

    public static void addListener(AudioPassThroughPluginListener audioPassThroughPluginListener) {
        synchronized (TPAudioPassThroughPluginDetector.class) {
            try {
                if (listeners.add(audioPassThroughPluginListener) && !hasRegisterReceiver) {
                    registerReceiver();
                    hasRegisterReceiver = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void deinit() {
        WeakReference<Context> weakReference;
        synchronized (TPAudioPassThroughPluginDetector.class) {
            if (isInitted && (weakReference = mContextRef) != null) {
                weakReference.clear();
                isInitted = false;
                TPNativeLog.printLog(2, TAG, "TPAudioPassThroughPluginDetector deinit succeed!");
            }
        }
    }

    public static void init(Context context) {
        synchronized (TPAudioPassThroughPluginDetector.class) {
            try {
                TPNativeLog.printLog(2, TAG, "TPAudioPassThroughPluginDetector init enter!");
                if (!isInitted) {
                    mContextRef = new WeakReference<>(context.getApplicationContext());
                    isInitted = true;
                    mHandler = new Handler(getLooper());
                    registerReceiver();
                    hasRegisterReceiver = true;
                    TPNativeLog.printLog(2, TAG, "TPAudioPassThroughPluginDetector init succeed!");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean isAudioPassThroughPlugin() {
        boolean z11;
        synchronized (TPAudioPassThroughPluginDetector.class) {
            z11 = mIsAudioPassThroughPlugin;
        }
        return z11;
    }

    public static boolean isAudioPassThroughSupport(int i11, int i12) {
        TPAudioPassThroughCapabilities tPAudioPassThroughCapabilities = mAudioPassThroughCapabilities;
        if (tPAudioPassThroughCapabilities != null) {
            return tPAudioPassThroughCapabilities.supportsEncoding(i11) && i12 <= mAudioPassThroughCapabilities.getMaxChannelCount();
        }
        TPNativeLog.printLog(4, TAG, "isAudioPassThroughSupport failed, mAudioPassThroughCapabilities is not init yet!");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void notifyAudioPassThroughStateChange(boolean z11) {
        if (mIsAudioPassThroughPlugin == z11) {
            return;
        }
        mIsAudioPassThroughPlugin = z11;
        synchronized (TPAudioPassThroughPluginDetector.class) {
            try {
                Iterator<AudioPassThroughPluginListener> it = listeners.iterator();
                while (it.hasNext()) {
                    it.next().onAudioPassThroughPlugin(z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onUpdateAudioCapabilities(TPAudioPassThroughCapabilities tPAudioPassThroughCapabilities) {
        if (tPAudioPassThroughCapabilities.equals(mAudioPassThroughCapabilities)) {
            return;
        }
        mAudioPassThroughCapabilities = tPAudioPassThroughCapabilities;
        TPNativeLog.printLog(2, TAG, "onUpdateAudioCapabilities AudioCapabilities:" + mAudioPassThroughCapabilities.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void registerReceiver() {
        TPNativeLog.printLog(2, TAG, "registerReceiver enter");
        if (!isInitted || mContextRef == null) {
            TPNativeLog.printLog(4, TAG, "registerReceiver failed, TPAudioPassThroughPluginDetector is not init yet!");
            return;
        }
        Intent intentRegisterReceiver = null;
        Object[] objArr = 0;
        if (mReceiver == null) {
            mReceiver = new HdmiAudioPlugBroadcastReceiver();
        }
        Context context = mContextRef.get();
        if (context == null) {
            TPNativeLog.printLog(4, TAG, "registerReceiver failed, context is null, maybe is invalid!");
            return;
        }
        if (mReceiver != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.action.HDMI_AUDIO_PLUG");
            intentRegisterReceiver = context.registerReceiver(mReceiver, intentFilter, null, mHandler);
        }
        mAudioPassThroughCapabilities = TPAudioPassThroughCapabilities.getCapabilities(context, intentRegisterReceiver);
        TPNativeLog.printLog(2, TAG, "registerReceiver leave");
    }

    public static void removeListener(AudioPassThroughPluginListener audioPassThroughPluginListener) {
        synchronized (TPAudioPassThroughPluginDetector.class) {
            try {
                listeners.remove(audioPassThroughPluginListener);
                if (listeners.isEmpty() && hasRegisterReceiver) {
                    unregisterReceiver();
                    hasRegisterReceiver = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void unregisterReceiver() {
        WeakReference<Context> weakReference;
        if (!isInitted || (weakReference = mContextRef) == null) {
            TPNativeLog.printLog(4, TAG, "registerReceiver failed, TPAudioPassThroughPluginDetector is not init yet!");
            return;
        }
        Context context = weakReference.get();
        if (context == null) {
            TPNativeLog.printLog(4, TAG, "registerReceiver failed, context is null, maybe is invalid!");
        } else {
            context.unregisterReceiver(mReceiver);
        }
    }

    private static Looper getLooper() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            return looperMyLooper;
        }
        return Looper.getMainLooper();
    }
}
