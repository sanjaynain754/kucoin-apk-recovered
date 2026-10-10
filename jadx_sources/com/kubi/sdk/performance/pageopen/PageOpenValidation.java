package com.kubi.sdk.performance.pageopen;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.sdk.performance.pageopen.l, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PageOpenModels.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/sdk/performance/pageopen/PageOpenValidation;", "", "<init>", "()V", "MAX_STAGE_COUNT", "", "MAX_STAGE_NAME_LENGTH", "MAX_TRACE_ID_LENGTH", "MAX_ROUTE_KEY_LENGTH", "MAX_DURATION_MS", "", "pageIdPattern", "Lkotlin/text/Regex;", "stageNamePattern", "isValidPageId", "", "pageId", "", "isValidTraceId", "traceId", "isValidRouteKey", "routeKey", "isValidStageName", "name", "isValidDuration", "durationMs", "upperBoundMs", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPageOpenModels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageOpenModels.kt\ncom/kubi/sdk/performance/pageopen/PageOpenValidation\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,131:1\n1855#2,2:132\n1855#2,2:134\n*S KotlinDebug\n*F\n+ 1 PageOpenModels.kt\ncom/kubi/sdk/performance/pageopen/PageOpenValidation\n*L\n101#1:132,2\n108#1:134,2\n*E\n"})
public final class PageOpenValidation {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PageOpenValidation f47249a = new PageOpenValidation();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Regex f47250b = new Regex("^B[0-9A-Za-z_]{1,63}$");

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Regex f47251c = new Regex("^[a-z][a-z0-9_]{0,63}$");

    /* JADX INFO: renamed from: d */
    public final boolean m57424d(@Nullable String str) {
        if (str != null && !StringsKt.isBlank(str) && str.length() <= 256) {
            for (int i11 = 0; i11 < str.length(); i11++) {
                if (!Character.isISOControl(str.charAt(i11))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m57426f(@Nullable String str) {
        if (str != null && !StringsKt.isBlank(str) && str.length() <= 256) {
            for (int i11 = 0; i11 < str.length(); i11++) {
                if (!Character.isISOControl(str.charAt(i11))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m57421b(PageOpenValidation pageOpenValidation, long j11, long j12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j12 = 300000;
        }
        return pageOpenValidation.m57422a(j11, j12);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m57422a(long j11, long j12) {
        return j11 >= 0 && j11 <= 300000 && j11 <= RangesKt.coerceAtMost(j12, 300000L);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m57423c(@Nullable String str) {
        return str != null && f47250b.matches(str);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m57425e(@Nullable String str) {
        return str != null && str.length() <= 64 && f47251c.matches(str);
    }
}
