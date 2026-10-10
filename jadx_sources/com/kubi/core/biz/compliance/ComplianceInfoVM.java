package com.kubi.core.biz.compliance;

import androidx.lifecycle.ViewModelKt;
import com.kubi.core.base.arch.mvi.AbsTradeBaseBizVM;
import com.kubi.spot.api.ISpotCommonService;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p827zc.AbstractC46753c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import se.InterfaceC44395a;

/* JADX INFO: compiled from: ComplianceInfoVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/core/biz/compliance/ComplianceInfoVM;", "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizVM;", "Lcom/kubi/core/biz/compliance/ComplianceInfoContract$UiIntent;", "Lcom/kubi/core/biz/compliance/ComplianceInfoContract$UiState;", "repoProvider", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "<init>", "(Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;)V", "api", "Lcom/kubi/core/spot/business/mvi/ISpotTradeApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/core/spot/business/mvi/ISpotTradeApi;", "api$delegate", "Lkotlin/Lazy;", "initState", "getInitState", "()Lcom/kubi/core/biz/compliance/ComplianceInfoContract$UiState;", "sendBizIntent", "", "intent", "fetchComplianceInfo", "symbol", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nComplianceInfoVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplianceInfoVM.kt\ncom/kubi/core/biz/compliance/ComplianceInfoVM\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
public final class ComplianceInfoVM extends AbsTradeBaseBizVM<ComplianceInfoContract$UiIntent, UiState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f20363X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComplianceInfoVM(@NotNull AbstractC46753c repoProvider) {
        super(repoProvider);
        Intrinsics.checkNotNullParameter(repoProvider, "repoProvider");
        this.f20363X = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.compliance.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComplianceInfoVM.m21707v();
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static final UiState m21701B(UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final InterfaceC44395a m21709y() {
        return (InterfaceC44395a) this.f20363X.getValue();
    }

    /* JADX INFO: renamed from: A */
    public void m21710A(@NotNull ComplianceInfoContract$UiIntent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.m21025p(intent);
        if (!(intent instanceof ComplianceInfoContract$UiIntent.SymbolChange)) {
            if (!(intent instanceof ComplianceInfoContract$UiIntent.GetComplianceInfo)) {
                throw new NoWhenBranchMatchedException();
            }
            m21711w(((ComplianceInfoContract$UiIntent.GetComplianceInfo) intent).getSymbol());
        } else {
            updateState(new Function1() { // from class: com.kubi.core.biz.compliance.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComplianceInfoVM.m21701B((UiState) obj);
                }
            });
            String symbol = ((ComplianceInfoContract$UiIntent.SymbolChange) intent).getSymbol();
            if (symbol != null) {
                m21711w(symbol);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m21711w(final String str) {
        ISpotCommonService.f49644a.get().mo59980y(new Function0() { // from class: com.kubi.core.biz.compliance.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComplianceInfoVM.m21708x(this.f20370b, str);
            }
        });
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public UiState getInitState() {
        return new UiState(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final InterfaceC44395a m21707v() {
        return (InterfaceC44395a) C42597a.m93387c().create(InterfaceC44395a.class);
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m21708x(ComplianceInfoVM complianceInfoVM, String str) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(complianceInfoVM), null, null, new ComplianceInfoVM$fetchComplianceInfo$1$1(complianceInfoVM, str, null), 3, null);
        return Unit.INSTANCE;
    }
}
