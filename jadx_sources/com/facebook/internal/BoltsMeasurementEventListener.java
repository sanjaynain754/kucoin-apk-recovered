package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.InternalAppEventsLogger;
import com.tencent.bugly.proguard.C33820nf;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Regex;

/* JADX INFO: compiled from: BoltsMeasurementEventListener.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m90084d2 = {"Lcom/facebook/internal/BoltsMeasurementEventListener;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "finalize", "()V", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "f", "e", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "applicationContext", "b", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class BoltsMeasurementEventListener extends BroadcastReceiver {

    /* JADX INFO: renamed from: c */
    @Nullable
    public static BoltsMeasurementEventListener f9548c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final String f9549d = "com.parse.bolts.measurement_event";

    /* JADX INFO: compiled from: BoltsMeasurementEventListener.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u00020\u00048\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/facebook/internal/BoltsMeasurementEventListener$Companion;", "", "()V", "BOLTS_MEASUREMENT_EVENT_PREFIX", "", "MEASUREMENT_EVENT_ARGS_KEY", "MEASUREMENT_EVENT_NAME_KEY", "MEASUREMENT_EVENT_NOTIFICATION_NAME", "getMEASUREMENT_EVENT_NOTIFICATION_NAME$facebook_core_release$annotations", "getMEASUREMENT_EVENT_NOTIFICATION_NAME$facebook_core_release", "()Ljava/lang/String;", "singleton", "Lcom/facebook/internal/BoltsMeasurementEventListener;", "getInstance", "context", "Landroid/content/Context;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @Nullable
        public final BoltsMeasurementEventListener getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (BoltsMeasurementEventListener.m9920b() != null) {
                return BoltsMeasurementEventListener.m9920b();
            }
            BoltsMeasurementEventListener boltsMeasurementEventListener = new BoltsMeasurementEventListener(context, null);
            BoltsMeasurementEventListener.m9921c(boltsMeasurementEventListener);
            BoltsMeasurementEventListener.m9922d(boltsMeasurementEventListener);
            return BoltsMeasurementEventListener.m9920b();
        }

        @NotNull
        public final String getMEASUREMENT_EVENT_NOTIFICATION_NAME$facebook_core_release() {
            return BoltsMeasurementEventListener.m9919a();
        }

        @VisibleForTesting
        /* JADX INFO: renamed from: getMEASUREMENT_EVENT_NOTIFICATION_NAME$facebook_core_release$annotations */
        public static /* synthetic */ void m9925x83b588fd() {
        }
    }

    public /* synthetic */ BoltsMeasurementEventListener(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public BoltsMeasurementEventListener(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ String m9919a() {
        if (C42757a.m93689d(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return f9549d;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, BoltsMeasurementEventListener.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ BoltsMeasurementEventListener m9920b() {
        if (C42757a.m93689d(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return f9548c;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, BoltsMeasurementEventListener.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ void m9921c(BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (C42757a.m93689d(BoltsMeasurementEventListener.class)) {
            return;
        }
        try {
            boltsMeasurementEventListener.m9924f();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, BoltsMeasurementEventListener.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ void m9922d(BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (C42757a.m93689d(BoltsMeasurementEventListener.class)) {
            return;
        }
        try {
            f9548c = boltsMeasurementEventListener;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, BoltsMeasurementEventListener.class);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(context);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bf_");
            sb2.append(intent != null ? intent.getStringExtra("event_name") : null);
            String string = sb2.toString();
            Bundle bundleExtra = intent != null ? intent.getBundleExtra("event_args") : null;
            Bundle bundle = new Bundle();
            Set<String> setKeySet = bundleExtra != null ? bundleExtra.keySet() : null;
            if (setKeySet != null) {
                for (String key : setKeySet) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    bundle.putString(new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(new Regex("[^0-9a-zA-Z _-]").replace(key, C33820nf.f71144W), ""), ""), (String) bundleExtra.get(key));
                }
            }
            internalAppEventsLogger.m7882d(string, bundle);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9923e() {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.applicationContext);
            Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
            localBroadcastManager.unregisterReceiver(this);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m9924f() {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.applicationContext);
            Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
            localBroadcastManager.registerReceiver(this, new IntentFilter(f9549d));
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    public final void finalize() throws Throwable {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            m9923e();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }
}
