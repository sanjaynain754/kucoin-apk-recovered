package com.facebook.appevents.gps;

import android.content.Context;
import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.InternalAppEventsLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.random.Random;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: GpsDebugLogger.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0014"}, m90084d2 = {"Lcom/facebook/appevents/gps/GpsDebugLogger;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "eventName", "Landroid/os/Bundle;", "parameters", "", "b", "(Ljava/lang/String;Landroid/os/Bundle;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Z", "Lcom/facebook/appevents/InternalAppEventsLogger;", "Lcom/facebook/appevents/InternalAppEventsLogger;", "internalAppEventsLogger", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class GpsDebugLogger {

    /* JADX INFO: renamed from: c */
    public static final boolean f7832c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InternalAppEventsLogger internalAppEventsLogger;

    /* JADX INFO: renamed from: a */
    public final boolean m8107a(String eventName) {
        if (eventName != null) {
            return StringsKt.contains$default((CharSequence) eventName, (CharSequence) "gps", false, 2, (Object) null);
        }
        return false;
    }

    static {
        f7832c = Random.INSTANCE.nextDouble() <= 1.0E-4d;
    }

    public GpsDebugLogger(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.internalAppEventsLogger = new InternalAppEventsLogger(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m8108b(@Nullable String eventName, @Nullable Bundle parameters) {
        if (f7832c && m8107a(eventName)) {
            this.internalAppEventsLogger.m7884f(eventName, parameters);
        }
    }
}
