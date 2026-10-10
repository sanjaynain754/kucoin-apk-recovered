package com.facebook.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.facebook.internal.b */
/* JADX INFO: compiled from: ServerProtocol.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\n \r*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lcom/facebook/internal/b;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "c", "e", "b", "subdomain", "d", "(Ljava/lang/String;)Ljava/lang/String;", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C5759b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5759b f9647a = new C5759b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG = C5759b.class.getName();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m10038b() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{C5501a.m7807u()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m10039c() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{C5501a.m7809w()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m10041e() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{C5501a.m7809w()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m10037a() {
        return "v16.0";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m10040d(@NotNull String subdomain) {
        Intrinsics.checkNotNullParameter(subdomain, "subdomain");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{subdomain}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }
}
