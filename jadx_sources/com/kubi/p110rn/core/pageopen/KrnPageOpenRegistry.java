package com.kubi.p110rn.core.pageopen;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.sdk.performance.pageopen.PageOpenPhaseTimings;
import com.kubi.sdk.performance.pageopen.PageOpenResult;
import com.kubi.sdk.performance.pageopen.PageOpenStageRecord;
import com.kubi.sdk.performance.pageopen.PageOpenTrace;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KrnPageOpenRegistry.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\rH\u0016J/\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\u0013JO\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0002\u0010\u001cJ \u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u001f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"H\u0016J \u0010#\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\rH\u0016J&\u0010$\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0016J\u0016\u0010(\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010)\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ$\u0010*\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020'0&J6\u0010,\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u001e\u0010+\u001a\u001a\u0012\u0004\u0012\u00020.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070&\u0012\u0004\u0012\u00020'0-J\u001e\u0010/\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistry;", "Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;", "<init>", "()V", "store", "Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryStore;", "register", "", "rootTag", "", "ownerToken", "", "trace", "Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;", "find", "remove", "expected", "recordDataReady", "cacheHit", "(ILjava/lang/Object;Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;Ljava/lang/Boolean;)Z", "finishContainerEntry", DbParams.KEY_CHANNEL_RESULT, "Lcom/kubi/sdk/performance/pageopen/PageOpenResult;", "phaseTimings", "Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;", "externalStages", "", "Lcom/kubi/sdk/performance/pageopen/PageOpenStageRecord;", "(ILjava/lang/Object;Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;Lcom/kubi/sdk/performance/pageopen/PageOpenResult;Ljava/lang/Boolean;Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;Ljava/util/List;)Z", "finishAndRemove", "isContainerActive", "unregisterContainer", "tryMarkExternalCompleted", "pageTraceId", "", "armTimeoutAfterBind", "attachTerminalListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "", "recordRenderReady", "recordVisibleFrame", "attachVisibleFrameScheduler", "scheduler", "attachTimeoutScheduler", "Lkotlin/Function2;", "", "timeout", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KrnPageOpenRegistry implements KrnPageOpenRegistryAccess {

    @NotNull
    public static final KrnPageOpenRegistry INSTANCE = new KrnPageOpenRegistry();

    @NotNull
    private static final KrnPageOpenRegistryStore store = new KrnPageOpenRegistryStore(null, 1, null);

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenRegistryAccess
    public boolean armTimeoutAfterBind(int rootTag, @NotNull Object ownerToken, @NotNull PageOpenTrace expected) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        Intrinsics.checkNotNullParameter(expected, "expected");
        return store.armTimeoutAfterBind(rootTag, ownerToken, expected);
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenRegistryAccess
    public boolean attachTerminalListener(int rootTag, @NotNull Object ownerToken, @NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return store.attachTerminalListener(rootTag, ownerToken, listener);
    }

    public final boolean attachTimeoutScheduler(int rootTag, @NotNull Object ownerToken, @NotNull Function2<? super Long, ? super Function0<Boolean>, Unit> scheduler) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        return store.attachTimeoutScheduler(rootTag, ownerToken, scheduler);
    }

    public final boolean attachVisibleFrameScheduler(int rootTag, @NotNull Object ownerToken, @NotNull Function0<Unit> scheduler) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        return store.attachVisibleFrameScheduler(rootTag, ownerToken, scheduler);
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenRegistryAccess
    @Nullable
    public PageOpenTrace find(int rootTag, @NotNull Object ownerToken) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        return store.find(rootTag, ownerToken);
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenRegistryAccess
    public boolean finishAndRemove(int rootTag, @NotNull Object ownerToken, @NotNull PageOpenResult result) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        Intrinsics.checkNotNullParameter(result, "result");
        return store.finishAndRemove(rootTag, ownerToken, result);
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenRegistryAccess
    public boolean finishContainerEntry(int i11, @NotNull Object ownerToken, @NotNull PageOpenTrace expected, @NotNull PageOpenResult result, @Nullable Boolean bool, @Nullable PageOpenPhaseTimings pageOpenPhaseTimings, @NotNull List<PageOpenStageRecord> externalStages) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        Intrinsics.checkNotNullParameter(expected, "expected");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(externalStages, "externalStages");
        return store.finishContainerEntry(i11, ownerToken, expected, result, bool, pageOpenPhaseTimings, externalStages);
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenRegistryAccess
    public boolean isContainerActive(int rootTag, @NotNull Object ownerToken) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        return store.isContainerActive(rootTag, ownerToken);
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenRegistryAccess
    public boolean recordDataReady(int rootTag, @NotNull Object ownerToken, @NotNull PageOpenTrace expected, @Nullable Boolean cacheHit) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        Intrinsics.checkNotNullParameter(expected, "expected");
        return store.recordDataReady(rootTag, ownerToken, expected, cacheHit);
    }

    public final boolean recordRenderReady(int rootTag, @NotNull Object ownerToken) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        return store.recordRenderReady(rootTag, ownerToken);
    }

    public final boolean recordVisibleFrame(int rootTag, @NotNull Object ownerToken) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        return store.recordVisibleFrame(rootTag, ownerToken);
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenRegistryAccess
    public boolean register(int rootTag, @NotNull Object ownerToken, @NotNull PageOpenTrace trace) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        Intrinsics.checkNotNullParameter(trace, "trace");
        return store.register(rootTag, ownerToken, trace);
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenRegistryAccess
    public boolean remove(int rootTag, @NotNull Object ownerToken, @NotNull PageOpenTrace expected) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        Intrinsics.checkNotNullParameter(expected, "expected");
        return store.remove(rootTag, ownerToken, expected);
    }

    public final boolean timeout(int rootTag, @NotNull Object ownerToken, @NotNull PageOpenTrace expected) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        Intrinsics.checkNotNullParameter(expected, "expected");
        return store.timeout(rootTag, ownerToken, expected);
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenRegistryAccess
    public boolean tryMarkExternalCompleted(@NotNull String pageTraceId) {
        Intrinsics.checkNotNullParameter(pageTraceId, "pageTraceId");
        return store.tryMarkExternalCompleted(pageTraceId);
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenRegistryAccess
    public boolean unregisterContainer(int rootTag, @NotNull Object ownerToken) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        return store.unregisterContainer(rootTag, ownerToken);
    }

    private KrnPageOpenRegistry() {
    }
}
