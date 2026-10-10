package com.kubi.p110rn.core.pageopen;

import com.kubi.sdk.performance.pageopen.PageOpenMode;
import com.kubi.sdk.performance.pageopen.PageOpenPhaseTimings;
import com.kubi.sdk.performance.pageopen.PageOpenResult;
import com.kubi.sdk.performance.pageopen.PageOpenStageRecord;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KrnPageOpenBridgePayload.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00105\u001a\u00020\fHÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010%J\u0010\u00107\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010(J\u0010\u00108\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010(J\t\u00109\u001a\u00020\u0013HÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003J\u0094\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\u000e2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020\u0003HÖ\u0001J\t\u0010A\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010)\u001a\u0004\b*\u0010(R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006B"}, m90084d2 = {"Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;", "Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgePayload;", "rootTag", "", "routeKey", "", "pageId", "openMode", "Lcom/kubi/sdk/performance/pageopen/PageOpenMode;", "pageTraceId", "source", DbParams.KEY_CHANNEL_RESULT, "Lcom/kubi/sdk/performance/pageopen/PageOpenResult;", "cacheHit", "", "ttidMs", "", "ttfdMs", "phaseTimings", "Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;", "stages", "", "Lcom/kubi/sdk/performance/pageopen/PageOpenStageRecord;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/performance/pageopen/PageOpenMode;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/performance/pageopen/PageOpenResult;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;Ljava/util/List;)V", "getRootTag", "()I", "getRouteKey", "()Ljava/lang/String;", "getPageId", "getOpenMode", "()Lcom/kubi/sdk/performance/pageopen/PageOpenMode;", "getPageTraceId", "getSource", "getResult", "()Lcom/kubi/sdk/performance/pageopen/PageOpenResult;", "getCacheHit", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTtidMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTtfdMs", "getPhaseTimings", "()Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;", "getStages", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/performance/pageopen/PageOpenMode;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/performance/pageopen/PageOpenResult;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;Ljava/util/List;)Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;", "equals", "other", "", "hashCode", "toString", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KrnPageOpenFinishPayload implements KrnPageOpenBridgePayload {

    @Nullable
    private final Boolean cacheHit;

    @NotNull
    private final PageOpenMode openMode;

    @NotNull
    private final String pageId;

    @NotNull
    private final String pageTraceId;

    @NotNull
    private final PageOpenPhaseTimings phaseTimings;

    @NotNull
    private final PageOpenResult result;
    private final int rootTag;

    @NotNull
    private final String routeKey;

    @Nullable
    private final String source;

    @NotNull
    private final List<PageOpenStageRecord> stages;

    @Nullable
    private final Long ttfdMs;

    @Nullable
    private final Long ttidMs;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KrnPageOpenFinishPayload copy$default(KrnPageOpenFinishPayload krnPageOpenFinishPayload, int i11, String str, String str2, PageOpenMode pageOpenMode, String str3, String str4, PageOpenResult pageOpenResult, Boolean bool, Long l11, Long l12, PageOpenPhaseTimings pageOpenPhaseTimings, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = krnPageOpenFinishPayload.rootTag;
        }
        if ((i12 & 2) != 0) {
            str = krnPageOpenFinishPayload.routeKey;
        }
        if ((i12 & 4) != 0) {
            str2 = krnPageOpenFinishPayload.pageId;
        }
        if ((i12 & 8) != 0) {
            pageOpenMode = krnPageOpenFinishPayload.openMode;
        }
        if ((i12 & 16) != 0) {
            str3 = krnPageOpenFinishPayload.pageTraceId;
        }
        if ((i12 & 32) != 0) {
            str4 = krnPageOpenFinishPayload.source;
        }
        if ((i12 & 64) != 0) {
            pageOpenResult = krnPageOpenFinishPayload.result;
        }
        if ((i12 & 128) != 0) {
            bool = krnPageOpenFinishPayload.cacheHit;
        }
        if ((i12 & 256) != 0) {
            l11 = krnPageOpenFinishPayload.ttidMs;
        }
        if ((i12 & 512) != 0) {
            l12 = krnPageOpenFinishPayload.ttfdMs;
        }
        if ((i12 & 1024) != 0) {
            pageOpenPhaseTimings = krnPageOpenFinishPayload.phaseTimings;
        }
        if ((i12 & 2048) != 0) {
            list = krnPageOpenFinishPayload.stages;
        }
        PageOpenPhaseTimings pageOpenPhaseTimings2 = pageOpenPhaseTimings;
        List list2 = list;
        Long l13 = l11;
        Long l14 = l12;
        PageOpenResult pageOpenResult2 = pageOpenResult;
        Boolean bool2 = bool;
        String str5 = str3;
        String str6 = str4;
        return krnPageOpenFinishPayload.copy(i11, str, str2, pageOpenMode, str5, str6, pageOpenResult2, bool2, l13, l14, pageOpenPhaseTimings2, list2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KrnPageOpenFinishPayload)) {
            return false;
        }
        KrnPageOpenFinishPayload krnPageOpenFinishPayload = (KrnPageOpenFinishPayload) other;
        return this.rootTag == krnPageOpenFinishPayload.rootTag && Intrinsics.areEqual(this.routeKey, krnPageOpenFinishPayload.routeKey) && Intrinsics.areEqual(this.pageId, krnPageOpenFinishPayload.pageId) && this.openMode == krnPageOpenFinishPayload.openMode && Intrinsics.areEqual(this.pageTraceId, krnPageOpenFinishPayload.pageTraceId) && Intrinsics.areEqual(this.source, krnPageOpenFinishPayload.source) && this.result == krnPageOpenFinishPayload.result && Intrinsics.areEqual(this.cacheHit, krnPageOpenFinishPayload.cacheHit) && Intrinsics.areEqual(this.ttidMs, krnPageOpenFinishPayload.ttidMs) && Intrinsics.areEqual(this.ttfdMs, krnPageOpenFinishPayload.ttfdMs) && Intrinsics.areEqual(this.phaseTimings, krnPageOpenFinishPayload.phaseTimings) && Intrinsics.areEqual(this.stages, krnPageOpenFinishPayload.stages);
    }

    public KrnPageOpenFinishPayload(int i11, @NotNull String routeKey, @NotNull String pageId, @NotNull PageOpenMode openMode, @NotNull String pageTraceId, @Nullable String str, @NotNull PageOpenResult result, @Nullable Boolean bool, @Nullable Long l11, @Nullable Long l12, @NotNull PageOpenPhaseTimings phaseTimings, @NotNull List<PageOpenStageRecord> stages) {
        Intrinsics.checkNotNullParameter(routeKey, "routeKey");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(openMode, "openMode");
        Intrinsics.checkNotNullParameter(pageTraceId, "pageTraceId");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(phaseTimings, "phaseTimings");
        Intrinsics.checkNotNullParameter(stages, "stages");
        this.rootTag = i11;
        this.routeKey = routeKey;
        this.pageId = pageId;
        this.openMode = openMode;
        this.pageTraceId = pageTraceId;
        this.source = str;
        this.result = result;
        this.cacheHit = bool;
        this.ttidMs = l11;
        this.ttfdMs = l12;
        this.phaseTimings = phaseTimings;
        this.stages = stages;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRootTag() {
        return this.rootTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getTtfdMs() {
        return this.ttfdMs;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final PageOpenPhaseTimings getPhaseTimings() {
        return this.phaseTimings;
    }

    @NotNull
    public final List<PageOpenStageRecord> component12() {
        return this.stages;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRouteKey() {
        return this.routeKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PageOpenMode getOpenMode() {
        return this.openMode;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPageTraceId() {
        return this.pageTraceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PageOpenResult getResult() {
        return this.result;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getCacheHit() {
        return this.cacheHit;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getTtidMs() {
        return this.ttidMs;
    }

    @NotNull
    public final KrnPageOpenFinishPayload copy(int i11, @NotNull String routeKey, @NotNull String pageId, @NotNull PageOpenMode openMode, @NotNull String pageTraceId, @Nullable String str, @NotNull PageOpenResult result, @Nullable Boolean bool, @Nullable Long l11, @Nullable Long l12, @NotNull PageOpenPhaseTimings phaseTimings, @NotNull List<PageOpenStageRecord> stages) {
        Intrinsics.checkNotNullParameter(routeKey, "routeKey");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(openMode, "openMode");
        Intrinsics.checkNotNullParameter(pageTraceId, "pageTraceId");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(phaseTimings, "phaseTimings");
        Intrinsics.checkNotNullParameter(stages, "stages");
        return new KrnPageOpenFinishPayload(i11, routeKey, pageId, openMode, pageTraceId, str, result, bool, l11, l12, phaseTimings, stages);
    }

    @Nullable
    public final Boolean getCacheHit() {
        return this.cacheHit;
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenBridgePayload
    @NotNull
    public PageOpenMode getOpenMode() {
        return this.openMode;
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenBridgePayload
    @NotNull
    public String getPageId() {
        return this.pageId;
    }

    @NotNull
    public final String getPageTraceId() {
        return this.pageTraceId;
    }

    @NotNull
    public final PageOpenPhaseTimings getPhaseTimings() {
        return this.phaseTimings;
    }

    @NotNull
    public final PageOpenResult getResult() {
        return this.result;
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenBridgePayload
    public int getRootTag() {
        return this.rootTag;
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenBridgePayload
    @NotNull
    public String getRouteKey() {
        return this.routeKey;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final List<PageOpenStageRecord> getStages() {
        return this.stages;
    }

    @Nullable
    public final Long getTtfdMs() {
        return this.ttfdMs;
    }

    @Nullable
    public final Long getTtidMs() {
        return this.ttidMs;
    }

    public int hashCode() {
        int iHashCode = ((((((((Integer.hashCode(this.rootTag) * 31) + this.routeKey.hashCode()) * 31) + this.pageId.hashCode()) * 31) + this.openMode.hashCode()) * 31) + this.pageTraceId.hashCode()) * 31;
        String str = this.source;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.result.hashCode()) * 31;
        Boolean bool = this.cacheHit;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l11 = this.ttidMs;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.ttfdMs;
        return ((((iHashCode4 + (l12 != null ? l12.hashCode() : 0)) * 31) + this.phaseTimings.hashCode()) * 31) + this.stages.hashCode();
    }

    @NotNull
    public String toString() {
        return "KrnPageOpenFinishPayload(rootTag=" + this.rootTag + ", routeKey=" + this.routeKey + ", pageId=" + this.pageId + ", openMode=" + this.openMode + ", pageTraceId=" + this.pageTraceId + ", source=" + this.source + ", result=" + this.result + ", cacheHit=" + this.cacheHit + ", ttidMs=" + this.ttidMs + ", ttfdMs=" + this.ttfdMs + ", phaseTimings=" + this.phaseTimings + ", stages=" + this.stages + ')';
    }
}
