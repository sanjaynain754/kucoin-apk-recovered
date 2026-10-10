package com.kubi.mvi.common;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.mvi.common.e */
/* JADX INFO: compiled from: MviLog.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u000e\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001d\u0010\b\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a\u001d\u0010\t\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\u0006\u001a\u001d\u0010\n\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a\u001d\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\r\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u0006\u001a\u001b\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, m90084d2 = {"", "", "b", "(Ljava/lang/String;)V", "tag", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "g", "d", "i", "j", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "f", "e", "MVI_release"}, m90085k = 2, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class C19243e {
    /* JADX INFO: renamed from: b */
    public static final void m42533b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C19242d.f35622a.m42530a(str);
    }

    /* JADX INFO: renamed from: c */
    public static final void m42534c(@NotNull String str, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        C19242d.f35622a.m42531b(tag, str);
    }

    /* JADX INFO: renamed from: d */
    public static final void m42535d(@NotNull String str, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        m42534c(str, m42532a("mvi-data", tag));
    }

    /* JADX INFO: renamed from: e */
    public static final void m42536e(@NotNull String str, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        m42534c(str, m42532a("mvi-event", tag));
    }

    /* JADX INFO: renamed from: f */
    public static final void m42537f(@NotNull String str, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        m42534c(str, m42532a("mvi-intent", tag));
    }

    /* JADX INFO: renamed from: g */
    public static final void m42538g(@NotNull String str, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        C19242d.f35622a.m42531b(m42532a("mvi-page", tag), str);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m42539h(String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = "";
        }
        m42538g(str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static final void m42540i(@NotNull String str, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        m42534c(str, m42532a("mvi-state", tag));
    }

    /* JADX INFO: renamed from: j */
    public static final void m42541j(@NotNull String str, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        m42534c(str, m42532a("mvi-time", tag));
    }

    /* JADX INFO: renamed from: a */
    public static final String m42532a(String str, String str2) {
        if (str2.length() == 0) {
            return str;
        }
        return str + '-' + str2;
    }
}
