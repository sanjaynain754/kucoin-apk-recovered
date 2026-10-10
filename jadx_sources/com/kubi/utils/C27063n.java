package com.kubi.utils;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utils.n */
/* JADX INFO: compiled from: DataMapUtil.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0002*\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0011\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"", "key", "", "j", "(Ljava/lang/String;Ljava/lang/String;)V", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(ILjava/lang/String;)V", "", "i", "(JLjava/lang/String;)V", "", "k", "(ZLjava/lang/String;)V", "defValue", "f", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Z)Z", "d", "(Ljava/lang/String;J)J", "b", "(Ljava/lang/String;I)I", "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27063n {
    @Deprecated(message = "请使用MMKVHelper替换", replaceWith = @ReplaceWith(expression = "MMKVHelper", imports = {}))
    /* JADX INFO: renamed from: a */
    public static final boolean m66763a(@NotNull String str, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return DataMapUtil.f54245a.m66370a(str, z11);
    }

    @Deprecated(message = "请使用MMKVHelper替换", replaceWith = @ReplaceWith(expression = "MMKVHelper", imports = {}))
    /* JADX INFO: renamed from: b */
    public static final int m66764b(@NotNull String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return DataMapUtil.f54245a.m66371c(str, i11);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m66765c(String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return m66764b(str, i11);
    }

    @Deprecated(message = "请使用MMKVHelper替换", replaceWith = @ReplaceWith(expression = "MMKVHelper", imports = {}))
    /* JADX INFO: renamed from: d */
    public static final long m66766d(@NotNull String str, long j11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return DataMapUtil.f54245a.m66372e(str, j11);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ long m66767e(String str, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 0;
        }
        return m66766d(str, j11);
    }

    @Deprecated(message = "请使用MMKVHelper替换", replaceWith = @ReplaceWith(expression = "MMKVHelper", imports = {}))
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m66768f(@NotNull String str, @NotNull String defValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(defValue, "defValue");
        return DataMapUtil.f54245a.m66375i(str, defValue);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m66769g(String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = "";
        }
        return m66768f(str, str2);
    }

    @Deprecated(message = "请使用MMKVHelper替换", replaceWith = @ReplaceWith(expression = "MMKVHelper", imports = {}))
    /* JADX INFO: renamed from: j */
    public static final void m66772j(@NotNull String str, @NotNull String key) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        DataMapUtil.f54245a.m66380o(key, str);
    }

    @Deprecated(message = "请使用MMKVHelper替换", replaceWith = @ReplaceWith(expression = "MMKVHelper", imports = {}))
    /* JADX INFO: renamed from: h */
    public static final void m66770h(int i11, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        DataMapUtil.f54245a.m66378m(key, i11);
    }

    @Deprecated(message = "请使用MMKVHelper替换", replaceWith = @ReplaceWith(expression = "MMKVHelper", imports = {}))
    /* JADX INFO: renamed from: i */
    public static final void m66771i(long j11, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        DataMapUtil.f54245a.m66379n(key, j11);
    }

    @Deprecated(message = "请使用MMKVHelper替换", replaceWith = @ReplaceWith(expression = "MMKVHelper", imports = {}))
    /* JADX INFO: renamed from: k */
    public static final void m66773k(boolean z11, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        DataMapUtil.f54245a.m66377l(key, z11);
    }
}
