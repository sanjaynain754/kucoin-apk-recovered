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

/* JADX INFO: compiled from: KrnPageOpenRegistry.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH&J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\bH&J/\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\u000eJO\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H&¢\u0006\u0002\u0010\u0017J \u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H&J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH&J \u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\bH&J&\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;", "", "register", "", "rootTag", "", "ownerToken", "trace", "Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;", "find", "remove", "expected", "recordDataReady", "cacheHit", "(ILjava/lang/Object;Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;Ljava/lang/Boolean;)Z", "finishContainerEntry", DbParams.KEY_CHANNEL_RESULT, "Lcom/kubi/sdk/performance/pageopen/PageOpenResult;", "phaseTimings", "Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;", "externalStages", "", "Lcom/kubi/sdk/performance/pageopen/PageOpenStageRecord;", "(ILjava/lang/Object;Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;Lcom/kubi/sdk/performance/pageopen/PageOpenResult;Ljava/lang/Boolean;Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;Ljava/util/List;)Z", "finishAndRemove", "isContainerActive", "unregisterContainer", "tryMarkExternalCompleted", "pageTraceId", "", "armTimeoutAfterBind", "attachTerminalListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface KrnPageOpenRegistryAccess {
    boolean armTimeoutAfterBind(int rootTag, @NotNull Object ownerToken, @NotNull PageOpenTrace expected);

    boolean attachTerminalListener(int rootTag, @NotNull Object ownerToken, @NotNull Function0<Unit> listener);

    @Nullable
    PageOpenTrace find(int rootTag, @NotNull Object ownerToken);

    boolean finishAndRemove(int rootTag, @NotNull Object ownerToken, @NotNull PageOpenResult result);

    boolean finishContainerEntry(int i11, @NotNull Object obj, @NotNull PageOpenTrace pageOpenTrace, @NotNull PageOpenResult pageOpenResult, @Nullable Boolean bool, @Nullable PageOpenPhaseTimings pageOpenPhaseTimings, @NotNull List<PageOpenStageRecord> list);

    boolean isContainerActive(int rootTag, @NotNull Object ownerToken);

    boolean recordDataReady(int rootTag, @NotNull Object ownerToken, @NotNull PageOpenTrace expected, @Nullable Boolean cacheHit);

    boolean register(int rootTag, @NotNull Object ownerToken, @NotNull PageOpenTrace trace);

    boolean remove(int rootTag, @NotNull Object ownerToken, @NotNull PageOpenTrace expected);

    boolean tryMarkExternalCompleted(@NotNull String pageTraceId);

    boolean unregisterContainer(int rootTag, @NotNull Object ownerToken);
}
