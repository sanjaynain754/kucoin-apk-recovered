package com.kubi.p110rn.core.pageopen;

import com.facebook.react.bridge.ReadableMap;
import com.kubi.sdk.performance.pageopen.PageOpenMode;
import com.kubi.sdk.performance.pageopen.PageOpenReport;
import com.kubi.sdk.performance.pageopen.PageOpenReportSink;
import com.kubi.sdk.performance.pageopen.PageOpenReporter;
import com.kubi.sdk.performance.pageopen.PageOpenResult;
import com.kubi.sdk.performance.pageopen.PageOpenTrace;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: KrnPageOpenBridgeHandler.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J#\u0010\n\u001a\u00020\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fH\u0000¢\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u001bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler;", "Lcom/kubi/rn/core/pageopen/KrnPageOpenEventHandler;", "ownerToken", "", "registry", "Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;", "reportSink", "Lcom/kubi/sdk/performance/pageopen/PageOpenReportSink;", "<init>", "(Ljava/lang/Object;Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;Lcom/kubi/sdk/performance/pageopen/PageOpenReportSink;)V", "handle", "Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;", ReportDataTable.COLUMN_PARAMS, "Lcom/facebook/react/bridge/ReadableMap;", "values", "", "", "handle$BReactNativeLib_googleRelease", "handleParsedPayload", "parsed", "Lcom/kubi/rn/core/pageopen/KrnPageOpenPayloadParseResult;", "handleContainerDataReady", "payload", "Lcom/kubi/rn/core/pageopen/KrnPageOpenDataReadyPayload;", "handleBind", "Lcom/kubi/rn/core/pageopen/KrnPageOpenBindPayload;", "handleContainerEntryFinish", "Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;", "handleInBundleNavigationFinish", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKrnPageOpenBridgeHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KrnPageOpenBridgeHandler.kt\ncom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1#2:203\n*E\n"})
public final class KrnPageOpenBridgeHandler implements KrnPageOpenEventHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "KrnPageOpenHandler";

    @NotNull
    private final Object ownerToken;

    @NotNull
    private final KrnPageOpenRegistryAccess registry;

    @NotNull
    private final PageOpenReportSink reportSink;

    /* JADX INFO: compiled from: KrnPageOpenBridgeHandler.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeHandler$Companion;", "", "<init>", "()V", "TAG", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public KrnPageOpenBridgeHandler(@NotNull Object ownerToken, @NotNull KrnPageOpenRegistryAccess registry, @NotNull PageOpenReportSink reportSink) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(reportSink, "reportSink");
        this.ownerToken = ownerToken;
        this.registry = registry;
        this.reportSink = reportSink;
    }

    /* JADX INFO: compiled from: KrnPageOpenBridgeHandler.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PageOpenMode.values().length];
            try {
                iArr[PageOpenMode.CONTAINER_ENTRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PageOpenMode.IN_BUNDLE_NAVIGATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final KrnPageOpenBridgeResult handleBind(KrnPageOpenBindPayload payload) {
        PageOpenTrace pageOpenTraceFind = this.registry.find(payload.getRootTag(), this.ownerToken);
        if (pageOpenTraceFind == null) {
            return KrnPageOpenBridgeResult.INSTANCE.rejected("root_tag_not_found");
        }
        if (!pageOpenTraceFind.m57370c(payload.getPageId(), payload.getRouteKey())) {
            return KrnPageOpenBridgeResult.INSTANCE.rejected("page_binding_mismatch");
        }
        this.registry.armTimeoutAfterBind(payload.getRootTag(), this.ownerToken, pageOpenTraceFind);
        if (pageOpenTraceFind.m57376l()) {
            this.registry.remove(payload.getRootTag(), this.ownerToken, pageOpenTraceFind);
        }
        return KrnPageOpenBridgeResult.INSTANCE.accepted(pageOpenTraceFind.getF47204a().getPageTraceId());
    }

    private final KrnPageOpenBridgeResult handleContainerDataReady(KrnPageOpenDataReadyPayload payload) {
        PageOpenTrace pageOpenTraceFind = this.registry.find(payload.getRootTag(), this.ownerToken);
        if (pageOpenTraceFind == null) {
            return KrnPageOpenBridgeResult.INSTANCE.rejected("root_tag_not_found");
        }
        if (!Intrinsics.areEqual(pageOpenTraceFind.getF47204a().getPageTraceId(), payload.getPageTraceId())) {
            return KrnPageOpenBridgeResult.INSTANCE.rejected("page_trace_id_mismatch");
        }
        if (pageOpenTraceFind.m57378n(payload.getPageId(), payload.getRouteKey())) {
            return !this.registry.recordDataReady(payload.getRootTag(), this.ownerToken, pageOpenTraceFind, payload.getCacheHit()) ? KrnPageOpenBridgeResult.INSTANCE.rejected("trace_not_accepted") : KrnPageOpenBridgeResult.Companion.accepted$default(KrnPageOpenBridgeResult.INSTANCE, null, 1, null);
        }
        return KrnPageOpenBridgeResult.INSTANCE.rejected("page_binding_mismatch");
    }

    private final KrnPageOpenBridgeResult handleContainerEntryFinish(KrnPageOpenFinishPayload payload) {
        PageOpenTrace pageOpenTraceFind = this.registry.find(payload.getRootTag(), this.ownerToken);
        if (pageOpenTraceFind == null) {
            return KrnPageOpenBridgeResult.INSTANCE.rejected("root_tag_not_found");
        }
        if (!Intrinsics.areEqual(pageOpenTraceFind.getF47204a().getPageTraceId(), payload.getPageTraceId())) {
            return KrnPageOpenBridgeResult.INSTANCE.rejected("page_trace_id_mismatch");
        }
        if (pageOpenTraceFind.m57378n(payload.getPageId(), payload.getRouteKey())) {
            return !this.registry.finishContainerEntry(payload.getRootTag(), this.ownerToken, pageOpenTraceFind, payload.getResult(), payload.getCacheHit(), payload.getPhaseTimings(), payload.getStages()) ? KrnPageOpenBridgeResult.INSTANCE.rejected("trace_not_accepted") : KrnPageOpenBridgeResult.Companion.accepted$default(KrnPageOpenBridgeResult.INSTANCE, null, 1, null);
        }
        return KrnPageOpenBridgeResult.INSTANCE.rejected("page_binding_mismatch");
    }

    private final KrnPageOpenBridgeResult handleInBundleNavigationFinish(KrnPageOpenFinishPayload payload) {
        Object objM103844constructorimpl;
        if (!this.registry.isContainerActive(payload.getRootTag(), this.ownerToken)) {
            return KrnPageOpenBridgeResult.INSTANCE.rejected("root_tag_not_found");
        }
        String pageTraceId = payload.getPageTraceId();
        if (!this.registry.tryMarkExternalCompleted(pageTraceId)) {
            return KrnPageOpenBridgeResult.INSTANCE.rejected("duplicate_terminal");
        }
        Long ttfdMs = payload.getTtfdMs();
        if (ttfdMs == null) {
            return KrnPageOpenBridgeResult.INSTANCE.rejected("missing_navigation_timings");
        }
        long jLongValue = ttfdMs.longValue();
        String pageId = payload.getPageId();
        PageOpenMode pageOpenMode = PageOpenMode.IN_BUNDLE_NAVIGATION;
        String source = payload.getSource();
        if (source == null) {
            source = "rn_navigation";
        }
        String str = source;
        PageOpenResult result = payload.getResult();
        Long ttidMs = payload.getTtidMs();
        PageOpenResult result2 = payload.getResult();
        PageOpenResult pageOpenResult = PageOpenResult.SUCCESS;
        Long dataPhaseMs = result2 == pageOpenResult ? payload.getPhaseTimings().getDataPhaseMs() : null;
        PageOpenReport pageOpenReport = new PageOpenReport(pageTraceId, pageId, pageOpenMode, str, result, ttidMs, jLongValue, dataPhaseMs, payload.getResult() == pageOpenResult ? payload.getPhaseTimings().getRenderPhaseMs() : null, payload.getCacheHit(), payload.getStages(), true);
        try {
            Result.Companion companion = Result.INSTANCE;
            this.reportSink.mo57355a(pageOpenReport);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            C44128b.m97270n(TAG, "PageOpen in-bundle report failed");
        }
        return KrnPageOpenBridgeResult.Companion.accepted$default(KrnPageOpenBridgeResult.INSTANCE, null, 1, null);
    }

    private final KrnPageOpenBridgeResult handleParsedPayload(KrnPageOpenPayloadParseResult parsed) {
        Object objM103844constructorimpl;
        KrnPageOpenBridgeResult krnPageOpenBridgeResultHandleContainerEntryFinish;
        try {
            Result.Companion companion = Result.INSTANCE;
            KrnPageOpenBridgePayload payload = parsed.getPayload();
            if (payload == null) {
                KrnPageOpenBridgeResult.Companion companion2 = KrnPageOpenBridgeResult.INSTANCE;
                String errorCode = parsed.getErrorCode();
                if (errorCode == null) {
                    errorCode = "invalid_payload";
                }
                krnPageOpenBridgeResultHandleContainerEntryFinish = companion2.rejected(errorCode);
            } else if (payload instanceof KrnPageOpenBindPayload) {
                krnPageOpenBridgeResultHandleContainerEntryFinish = handleBind((KrnPageOpenBindPayload) payload);
            } else if (payload instanceof KrnPageOpenDataReadyPayload) {
                krnPageOpenBridgeResultHandleContainerEntryFinish = handleContainerDataReady((KrnPageOpenDataReadyPayload) payload);
            } else {
                if (!(payload instanceof KrnPageOpenFinishPayload)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i11 = WhenMappings.$EnumSwitchMapping$0[((KrnPageOpenFinishPayload) payload).getOpenMode().ordinal()];
                if (i11 == 1) {
                    krnPageOpenBridgeResultHandleContainerEntryFinish = handleContainerEntryFinish((KrnPageOpenFinishPayload) payload);
                } else {
                    if (i11 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    krnPageOpenBridgeResultHandleContainerEntryFinish = handleInBundleNavigationFinish((KrnPageOpenFinishPayload) payload);
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl(krnPageOpenBridgeResultHandleContainerEntryFinish);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            C44128b.m97270n(TAG, "PageOpen payload handling failed");
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            objM103844constructorimpl = KrnPageOpenBridgeResult.INSTANCE.rejected("internal_error");
        }
        return (KrnPageOpenBridgeResult) objM103844constructorimpl;
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenEventHandler
    @NotNull
    public KrnPageOpenBridgeResult handle(@Nullable ReadableMap params) {
        return handleParsedPayload(KrnPageOpenBridgePayloadParser.INSTANCE.parse(params));
    }

    @NotNull
    public final KrnPageOpenBridgeResult handle$BReactNativeLib_googleRelease(@NotNull Map<String, ? extends Object> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return handleParsedPayload(KrnPageOpenBridgePayloadParser.INSTANCE.parse$BReactNativeLib_googleRelease(values));
    }

    public /* synthetic */ KrnPageOpenBridgeHandler(Object obj, KrnPageOpenRegistryAccess krnPageOpenRegistryAccess, PageOpenReportSink pageOpenReportSink, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? KrnPageOpenRegistry.INSTANCE : krnPageOpenRegistryAccess, (i11 & 4) != 0 ? PageOpenReporter.f47194d.getDefault() : pageOpenReportSink);
    }
}
