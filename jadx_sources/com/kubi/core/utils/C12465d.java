package com.kubi.core.utils;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tencent.bugly.proguard.C33820nf;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.kubi.core.utils.d */
/* JADX INFO: compiled from: TimeUtilsExt.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u001a\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0006\u0010\r\u001a\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"SEC", "", "MIN", "HOUR", "getHHmm", "", "time", "", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "Ljava/util/TimeZone;", "getTime", "getTimeDetail", "getCountdown", "getUtcOffsetString", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C12465d {
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m23406b(long j11, @Nullable TimeZone timeZone) {
        return C42179a.m92635h(j11, null, true, timeZone, 1, null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m23407c(long j11, TimeZone timeZone, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            timeZone = null;
        }
        return m23406b(j11, timeZone);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m23408d(long j11) {
        return C42179a.m92633f(j11, null, false, false, null, 9, null);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m23409e(long j11) {
        return C42179a.m92633f(j11, null, false, false, null, 15, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m23405a(long j11) {
        long j12 = 3600000;
        long j13 = j11 / j12;
        long j14 = j11 - (j12 * j13);
        long j15 = 60000;
        long j16 = j14 / j15;
        long j17 = (j14 - (j15 * j16)) / ((long) 1000);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.ENGLISH, "%1$02d:%2$02d:%3$02d", Arrays.copyOf(new Object[]{Long.valueOf(j13), Long.valueOf(j16), Long.valueOf(j17)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m23410f() {
        String str;
        int offset = TimeZone.getDefault().getOffset(System.currentTimeMillis());
        int i11 = offset / 3600000;
        int i12 = (offset / 60000) % 60;
        if (i11 >= 0) {
            str = "+";
        } else {
            str = C33820nf.f71144W;
        }
        if (i12 == 0) {
            return "UTC" + str + Math.abs(i11);
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format(Locale.getDefault(), "UTC%s%02d:%02d", Arrays.copyOf(new Object[]{str, Integer.valueOf(Math.abs(i11)), Integer.valueOf(Math.abs(i12))}, 3));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }
}
