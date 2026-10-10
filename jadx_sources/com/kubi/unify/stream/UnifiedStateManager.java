package com.kubi.unify.stream;

import ci.InterfaceC4984e;
import com.kubi.kumex.data.platform.model.MarginModeInfoEntity;
import com.kubi.unify.entity.UnifyAccountOverviewEntity;
import com.kubi.unify.entity.UnifyFundsInfoEntity;
import com.kubi.unify.entity.UnifyPositionEntity;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.unify.stream.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UnifyStateManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0014\u0010)\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fJ\u0010\u0010*\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u001aJ\u001a\u0010+\u001a\u00020'2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001eJ\u001c\u0010,\u001a\u00020'2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010#0\u001eJ\u0006\u0010-\u001a\u00020'J\u000e\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020\u0006R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000f0\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R \u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001e0\nX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001e0\u0012¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\"\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010#0\u001e0\nX\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010#0\u001e0\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0014¨\u00060"}, m90084d2 = {"Lcom/kubi/unify/stream/UnifiedStateManager;", "", "<init>", "()V", "steamsOnError", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/kubi/futures/exception/IFuturesCoreApiException;", "getSteamsOnError", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "hasSendError", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getHasSendError", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "_positionState", "", "Lcom/kubi/unify/entity/UnifyPositionEntity;", "positionState", "Lkotlinx/coroutines/flow/StateFlow;", "getPositionState", "()Lkotlinx/coroutines/flow/StateFlow;", "_fundsInfoState", "Lcom/kubi/unify/entity/UnifyFundsInfoEntity;", "fundsInfoState", "getFundsInfoState", "_accountOverViewState", "Lcom/kubi/unify/entity/UnifyAccountOverviewEntity;", "accountOverViewState", "getAccountOverViewState", "_futuresCrossLeverageState", "", "", "futuresCrossLeverageState", "getFuturesCrossLeverageState", "_marginModeState", "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "marginModeState", "getMarginModeState", "updatePositionState", "", "copy", "updateFundsInfo", "updateOverViewState", "updateFuturesCrossLeverageState", "updateMarginModeState", "clearAllData", "updateSteamsOnError", "iFuturesCoreApiException", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyStateManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyStateManager.kt\ncom/kubi/unify/stream/UnifiedStateManager\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,110:1\n230#2,5:111\n230#2,5:116\n230#2,5:121\n230#2,5:126\n230#2,5:131\n*S KotlinDebug\n*F\n+ 1 UnifyStateManager.kt\ncom/kubi/unify/stream/UnifiedStateManager\n*L\n61#1:111,5\n68#1:116,5\n75#1:121,5\n82#1:126,5\n89#1:131,5\n*E\n"})
public final class UnifiedStateManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC41668m<InterfaceC4984e> f53444a = C41674s.m91001b(1, 0, null, 6, null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC41669n<Boolean> f53445b = C41679x.m91009a(Boolean.FALSE);

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC41669n<List<UnifyPositionEntity>> f53446c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC41678w<List<UnifyPositionEntity>> f53447d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final InterfaceC41669n<List<UnifyFundsInfoEntity>> f53448e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final InterfaceC41678w<List<UnifyFundsInfoEntity>> f53449f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final InterfaceC41669n<UnifyAccountOverviewEntity> f53450g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final InterfaceC41678w<UnifyAccountOverviewEntity> f53451h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final InterfaceC41669n<Map<String, String>> f53452i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final InterfaceC41678w<Map<String, String>> f53453j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final InterfaceC41669n<Map<String, MarginModeInfoEntity>> f53454k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final InterfaceC41678w<Map<String, MarginModeInfoEntity>> f53455l;

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC41678w<UnifyAccountOverviewEntity> m65392b() {
        return this.f53451h;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC41678w<List<UnifyFundsInfoEntity>> m65393c() {
        return this.f53449f;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC41678w<Map<String, String>> m65394d() {
        return this.f53453j;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final InterfaceC41669n<Boolean> m65395e() {
        return this.f53445b;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final InterfaceC41678w<Map<String, MarginModeInfoEntity>> m65396f() {
        return this.f53455l;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final InterfaceC41678w<List<UnifyPositionEntity>> m65397g() {
        return this.f53447d;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final InterfaceC41668m<InterfaceC4984e> m65398h() {
        return this.f53444a;
    }

    /* JADX INFO: renamed from: i */
    public final void m65399i(@NotNull List<UnifyFundsInfoEntity> copy) {
        Intrinsics.checkNotNullParameter(copy, "copy");
        InterfaceC41669n<List<UnifyFundsInfoEntity>> interfaceC41669n = this.f53448e;
        while (!interfaceC41669n.compareAndSet(interfaceC41669n.getValue(), copy)) {
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m65400j(@NotNull Map<String, String> copy) {
        Intrinsics.checkNotNullParameter(copy, "copy");
        InterfaceC41669n<Map<String, String>> interfaceC41669n = this.f53452i;
        while (!interfaceC41669n.compareAndSet(interfaceC41669n.getValue(), copy)) {
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m65401k(@NotNull Map<String, MarginModeInfoEntity> copy) {
        Intrinsics.checkNotNullParameter(copy, "copy");
        InterfaceC41669n<Map<String, MarginModeInfoEntity>> interfaceC41669n = this.f53454k;
        while (!interfaceC41669n.compareAndSet(interfaceC41669n.getValue(), copy)) {
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m65402l(@Nullable UnifyAccountOverviewEntity unifyAccountOverviewEntity) {
        InterfaceC41669n<UnifyAccountOverviewEntity> interfaceC41669n = this.f53450g;
        while (!interfaceC41669n.compareAndSet(interfaceC41669n.getValue(), unifyAccountOverviewEntity)) {
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m65403m(@NotNull List<UnifyPositionEntity> copy) {
        Intrinsics.checkNotNullParameter(copy, "copy");
        InterfaceC41669n<List<UnifyPositionEntity>> interfaceC41669n = this.f53446c;
        while (!interfaceC41669n.compareAndSet(interfaceC41669n.getValue(), copy)) {
        }
    }

    public UnifiedStateManager() {
        InterfaceC41669n<List<UnifyPositionEntity>> interfaceC41669nM91009a = C41679x.m91009a(CollectionsKt.emptyList());
        this.f53446c = interfaceC41669nM91009a;
        this.f53447d = C41636g.m90907c(interfaceC41669nM91009a);
        InterfaceC41669n<List<UnifyFundsInfoEntity>> interfaceC41669nM91009a2 = C41679x.m91009a(null);
        this.f53448e = interfaceC41669nM91009a2;
        this.f53449f = C41636g.m90907c(interfaceC41669nM91009a2);
        InterfaceC41669n<UnifyAccountOverviewEntity> interfaceC41669nM91009a3 = C41679x.m91009a(null);
        this.f53450g = interfaceC41669nM91009a3;
        this.f53451h = C41636g.m90907c(interfaceC41669nM91009a3);
        InterfaceC41669n<Map<String, String>> interfaceC41669nM91009a4 = C41679x.m91009a(MapsKt.emptyMap());
        this.f53452i = interfaceC41669nM91009a4;
        this.f53453j = C41636g.m90907c(interfaceC41669nM91009a4);
        InterfaceC41669n<Map<String, MarginModeInfoEntity>> interfaceC41669nM91009a5 = C41679x.m91009a(MapsKt.emptyMap());
        this.f53454k = interfaceC41669nM91009a5;
        this.f53455l = C41636g.m90907c(interfaceC41669nM91009a5);
    }

    /* JADX INFO: renamed from: a */
    public final void m65391a() {
        m65403m(CollectionsKt.emptyList());
        m65399i(CollectionsKt.emptyList());
        m65402l(null);
        m65401k(MapsKt.emptyMap());
    }
}
