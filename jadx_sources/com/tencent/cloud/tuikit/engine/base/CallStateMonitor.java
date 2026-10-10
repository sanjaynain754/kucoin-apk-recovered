package com.tencent.cloud.tuikit.engine.base;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager$OnModeChangedListener;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes59.dex */
public class CallStateMonitor {
    private static final int ANDROID_BUILD_VERSION_S = 31;
    private static final int CALL_STATE_CONNECTED = 3;
    private static final int CALL_STATE_DISCONNECTED = 4;
    private static final String TAG = "CallStateMonitor";
    private AudioManager mAudioManager;
    private AudioModeListener mAudioModeListener;
    private TelephonyManager mTelephonyManager;
    private TelephonyStateListener mTelephonyStateListener;

    public interface CallStateListener {
        void onCallStateChanged(int i11);
    }

    public class TelephonyStateListener extends PhoneStateListener {
        private Runnable mCallEndTimeoutTask;
        private final CallStateListener mListener;
        private final long CALL_END_TIMEOUT_MS = TimeUnit.SECONDS.toSeconds(5);
        private final Handler mHandler = new Handler(Looper.getMainLooper());

        public TelephonyStateListener(CallStateListener callStateListener) {
            this.mListener = callStateListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cancelCallEndTimeout() {
            Runnable runnable = this.mCallEndTimeoutTask;
            if (runnable != null) {
                this.mHandler.removeCallbacks(runnable);
                this.mCallEndTimeoutTask = null;
            }
        }

        private void scheduleCallEndTimeout() {
            cancelCallEndTimeout();
            Runnable runnable = new Runnable() { // from class: com.tencent.cloud.tuikit.engine.base.CallStateMonitor.TelephonyStateListener.1
                @Override // java.lang.Runnable
                public void run() {
                    if (CallStateMonitor.this.mTelephonyManager.getCallState() == 0) {
                        TelephonyStateListener.this.cancelCallEndTimeout();
                        TelephonyStateListener.this.mListener.onCallStateChanged(4);
                    }
                }
            };
            this.mCallEndTimeoutTask = runnable;
            this.mHandler.postDelayed(runnable, this.CALL_END_TIMEOUT_MS);
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i11, String str) {
            super.onCallStateChanged(i11, str);
            if (i11 != 0) {
                if (i11 != 2) {
                    return;
                }
                this.mListener.onCallStateChanged(3);
                scheduleCallEndTimeout();
                return;
            }
            cancelCallEndTimeout();
            this.mListener.onCallStateChanged(4);
        }
    }

    @SuppressLint({"NewApi"})
    public static class AudioModeListener implements AudioManager$OnModeChangedListener {
        private boolean mInCall = false;
        private final CallStateListener mListener;

        public void onModeChanged(int i11) {
            if (i11 == 1 || i11 == 2) {
                this.mInCall = true;
                this.mListener.onCallStateChanged(3);
            } else if (this.mInCall) {
                this.mListener.onCallStateChanged(4);
                this.mInCall = false;
            }
        }

        public AudioModeListener(CallStateListener callStateListener) {
            this.mListener = callStateListener;
        }
    }

    public void destroy() {
        if (Build.VERSION.SDK_INT >= 31) {
            this.mAudioManager.removeOnModeChangedListener(this.mAudioModeListener);
        }
    }

    public CallStateMonitor(CallStateListener callStateListener) {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            Log.m76033e(TAG, "CallStateMonitor init failed. Context is null", new Object[0]);
            return;
        }
        this.mAudioManager = (AudioManager) applicationContext.getSystemService("audio");
        if (Build.VERSION.SDK_INT >= 31) {
            this.mAudioModeListener = new AudioModeListener(callStateListener);
            this.mAudioManager.addOnModeChangedListener(applicationContext.getMainExecutor(), this.mAudioModeListener);
        } else {
            this.mTelephonyStateListener = new TelephonyStateListener(callStateListener);
            TelephonyManager telephonyManager = (TelephonyManager) applicationContext.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            this.mTelephonyManager = telephonyManager;
            telephonyManager.listen(this.mTelephonyStateListener, 32);
        }
    }
}
