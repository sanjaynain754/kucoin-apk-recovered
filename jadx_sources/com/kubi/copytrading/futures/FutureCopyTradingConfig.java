package com.kubi.copytrading.futures;

import com.kubi.copytrading.CopyTradingConfig;
import com.kubi.copytrading.CopytdApi;
import com.kubi.copytrading.entity.CopyTradingContractEntity;
import com.kubi.copytrading.entity.LeadUserEntity;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p495oc.CopyTradingUiState;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FutureCopyTradingConfig.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001dJ\u0010\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\"\u001a\u00020\u000fJ\u0010\u0010#\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010$\u001a\u00020\u001bJ\u0010\u0010%\u001a\u00020\u001b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, m90084d2 = {"Lcom/kubi/copytrading/futures/FutureCopyTradingConfig;", "", "<init>", "()V", "api", "Lcom/kubi/copytrading/CopytdApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/copytrading/CopytdApi;", "api$delegate", "Lkotlin/Lazy;", "symbolConfig", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/kubi/copytrading/entity/CopyTradingContractEntity;", "SYMBOL_DEFAULT", "", "subUid", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getSubUid", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "_masterAccountState", "Lcom/kubi/copytrading/data/CopyTradingUiState;", "masterAccountState", "Lkotlinx/coroutines/flow/StateFlow;", "getMasterAccountState", "()Lkotlinx/coroutines/flow/StateFlow;", "changeMasterAccountModel", "", "isMaster", "", "isNeedShowLeaderTips", "queryMaxLeverage", "Ljava/math/BigDecimal;", "symbol", "getRequestSubAccountId", "switch2DefaultCopyTradingSymbol", "fetchAllSymbolSupportCopyTrading", "forceSetInterceptFlag", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFutureCopyTradingConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FutureCopyTradingConfig.kt\ncom/kubi/copytrading/futures/FutureCopyTradingConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
public final class FutureCopyTradingConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FutureCopyTradingConfig f19902a = new FutureCopyTradingConfig();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f19903b = LazyKt.lazy(new Function0() { // from class: com.kubi.copytrading.futures.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FutureCopyTradingConfig.m20869d();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final CopyOnWriteArrayList<CopyTradingContractEntity> f19904c = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final InterfaceC41669n<String> f19905d = C41679x.m91009a(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final InterfaceC41669n<CopyTradingUiState> f19906e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final InterfaceC41678w<CopyTradingUiState> f19907f;

    static {
        InterfaceC41669n<CopyTradingUiState> interfaceC41669nM91009a = C41679x.m91009a(new CopyTradingUiState(true, false, 2, null));
        f19906e = interfaceC41669nM91009a;
        f19907f = interfaceC41669nM91009a;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m20870f(FutureCopyTradingConfig futureCopyTradingConfig, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        futureCopyTradingConfig.m20871e(z11, z12);
    }

    /* JADX INFO: renamed from: e */
    public final void m20871e(boolean z11, boolean z12) {
        f19906e.setValue(new CopyTradingUiState(z11, z12));
    }

    /* JADX INFO: renamed from: g */
    public final void m20872g() {
        if (CopyTradingConfig.f19710a.m20609z()) {
            C41696j.m91104d(C41713n0.m91126b(), null, null, new FutureCopyTradingConfig$fetchAllSymbolSupportCopyTrading$1(null), 3, null);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m20873h(@Nullable String str) {
        f19905d.setValue(str);
    }

    /* JADX INFO: renamed from: i */
    public final CopytdApi m20874i() {
        return (CopytdApi) f19903b.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final InterfaceC41678w<CopyTradingUiState> m20875j() {
        return f19907f;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final String m20876k() {
        String value = f19905d.getValue();
        if (value != null) {
            return value;
        }
        LeadUserEntity leadUserEntityM20602s = CopyTradingConfig.f19710a.m20602s();
        return C27041f.m66668h(leadUserEntityM20602s != null ? leadUserEntityM20602s.getUid() : null);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final InterfaceC41669n<String> m20877l() {
        return f19905d;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final BigDecimal m20878m(@Nullable String str) {
        LeadUserEntity leadUserEntityM20602s = CopyTradingConfig.f19710a.m20602s();
        return C41014a.m89921F(leadUserEntityM20602s != null ? leadUserEntityM20602s.getMaxLeverage() : null, "10");
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final String m20879n(@Nullable String str) {
        Object next;
        String symbol;
        Iterator<T> it = f19904c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((CopyTradingContractEntity) next).getSymbol(), str));
        CopyTradingContractEntity copyTradingContractEntity = (CopyTradingContractEntity) next;
        if (copyTradingContractEntity != null && (symbol = copyTradingContractEntity.getSymbol()) != null) {
            return symbol;
        }
        CopyTradingContractEntity copyTradingContractEntity2 = (CopyTradingContractEntity) CollectionsKt.firstOrNull((List) f19904c);
        String symbol2 = copyTradingContractEntity2 != null ? copyTradingContractEntity2.getSymbol() : null;
        return symbol2 == null ? "XBTUSDTM" : symbol2;
    }

    /* JADX INFO: renamed from: d */
    public static final CopytdApi m20869d() {
        return (CopytdApi) C42597a.m93388d().create(CopytdApi.class);
    }
}
