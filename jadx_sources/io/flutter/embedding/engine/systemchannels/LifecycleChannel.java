package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.StringCodec;
import java.util.Locale;

/* JADX INFO: loaded from: classes23.dex */
public class LifecycleChannel {
    private static final String CHANNEL_NAME = "flutter/lifecycle";
    private static final String TAG = "LifecycleChannel";

    @NonNull
    private final BasicMessageChannel<String> channel;
    private AppLifecycleState lastAndroidState;
    private AppLifecycleState lastFlutterState;
    private boolean lastFocus;

    public enum AppLifecycleState {
        DETACHED,
        RESUMED,
        INACTIVE,
        HIDDEN,
        PAUSED
    }

    public LifecycleChannel(@NonNull DartExecutor dartExecutor) {
        this((BasicMessageChannel<String>) new BasicMessageChannel(dartExecutor, CHANNEL_NAME, StringCodec.INSTANCE));
    }

    /* JADX INFO: renamed from: io.flutter.embedding.engine.systemchannels.LifecycleChannel$1 */
    public static /* synthetic */ class C387731 {

        /* JADX INFO: renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$LifecycleChannel$AppLifecycleState */
        static final /* synthetic */ int[] f86780xddedd993;

        static {
            int[] iArr = new int[AppLifecycleState.values().length];
            f86780xddedd993 = iArr;
            try {
                iArr[AppLifecycleState.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f86780xddedd993[AppLifecycleState.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f86780xddedd993[AppLifecycleState.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f86780xddedd993[AppLifecycleState.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f86780xddedd993[AppLifecycleState.DETACHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @VisibleForTesting
    public LifecycleChannel(@NonNull BasicMessageChannel<String> basicMessageChannel) {
        this.lastAndroidState = null;
        this.lastFlutterState = null;
        this.lastFocus = true;
        this.channel = basicMessageChannel;
    }

    private void sendState(AppLifecycleState appLifecycleState, boolean z11) {
        AppLifecycleState appLifecycleState2;
        AppLifecycleState appLifecycleState3 = this.lastAndroidState;
        if (appLifecycleState3 == appLifecycleState && z11 == this.lastFocus) {
            return;
        }
        if (appLifecycleState == null && appLifecycleState3 == null) {
            this.lastFocus = z11;
            return;
        }
        int i11 = C387731.f86780xddedd993[appLifecycleState.ordinal()];
        if (i11 != 1) {
            appLifecycleState2 = (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) ? appLifecycleState : null;
        } else {
            appLifecycleState2 = z11 ? AppLifecycleState.RESUMED : AppLifecycleState.INACTIVE;
        }
        this.lastAndroidState = appLifecycleState;
        this.lastFocus = z11;
        if (appLifecycleState2 == this.lastFlutterState) {
            return;
        }
        String str = "AppLifecycleState." + appLifecycleState2.name().toLowerCase(Locale.ROOT);
        Log.m87481v(TAG, "Sending " + str + " message.");
        this.channel.send(str);
        this.lastFlutterState = appLifecycleState2;
    }

    public void aWindowIsFocused() {
        sendState(this.lastAndroidState, true);
    }

    public void appIsDetached() {
        sendState(AppLifecycleState.DETACHED, this.lastFocus);
    }

    public void appIsInactive() {
        sendState(AppLifecycleState.INACTIVE, this.lastFocus);
    }

    public void appIsPaused() {
        sendState(AppLifecycleState.PAUSED, this.lastFocus);
    }

    public void appIsResumed() {
        sendState(AppLifecycleState.RESUMED, this.lastFocus);
    }

    public void noWindowsAreFocused() {
        sendState(this.lastAndroidState, false);
    }
}
