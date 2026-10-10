package com.kubi.unify.api;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import ci.InterfaceC4984e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.unify.api.entity.UnifyHourlyRateEntity;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: IUnifyAccountService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\bg\u0018\u0000 F2\u00020\u0001:\u0001FJ,\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH&J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0010H&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H&J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0013H&J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H&J(\u0010\u0018\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007H&J0\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00152\u0006\u0010 \u001a\u00020\u001aH&J\u0010\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0013H&J\b\u0010#\u001a\u00020\u0003H&J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0007H&J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'H&J\b\u0010)\u001a\u00020\u0003H&J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0007H&J\u001a\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020-0,0\u0013H&J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00150'2\u0006\u0010\u0017\u001a\u00020\u0007H&J \u0010/\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150'0,0\u0013H&J\u001a\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00150,0\u0013H&J\b\u00101\u001a\u00020\u0003H&J\b\u00102\u001a\u00020\u0003H&J\u0014\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010'0\u0013H&J\b\u00104\u001a\u00020\u0003H&J\b\u00105\u001a\u00020\u0003H&J\b\u00106\u001a\u00020\u0003H&J\b\u00107\u001a\u00020\u0003H&J\b\u00108\u001a\u00020\u0003H&J\b\u00109\u001a\u00020\u0003H&J\n\u0010:\u001a\u0004\u0018\u00010\u0007H&J\b\u0010;\u001a\u00020\u0010H&J\u001a\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020>0=0\u0013H&J6\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u001e2\b\u0010A\u001a\u0004\u0018\u00010\u00072\b\u0010%\u001a\u0004\u0018\u00010\u00072\b\u0010B\u001a\u0004\u0018\u00010\u00072\u0006\u0010C\u001a\u00020\u0007H&J\b\u0010D\u001a\u00020\u0010H&J\b\u0010E\u001a\u00020\u0010H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006GÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/unify/api/IUnifyAccountService;", "", "handleUnifyAccountToggleView", "", "viewGroup", "Landroid/view/ViewGroup;", "fromType", "", "onClickListener", "Lkotlin/Function0;", "getUnifyRecordsFragment", "Lcom/kubi/sdk/BaseFragment;", "arguments", "Landroid/os/Bundle;", "getUnifyFundsFragment", "hasToggledUnifyAccount", "", "isUnifiedAccount", "isUnifiedAccountFlow", "Lkotlinx/coroutines/flow/Flow;", "getAccountRiskRateStateFlow", "Ljava/math/BigDecimal;", "getUnifyAccountAvailableEquity", FirebaseAnalytics.Param.CURRENCY, "showAddFundsDialog", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "tag", "gotoRepay", "context", "Landroid/content/Context;", "amount", "fragmentManager", "steamsOnErrorFlow", "Lcom/kubi/futures/exception/IFuturesCoreApiException;", "refreshStreamDataFlow", "updateFuturesCurrencySymbol", "symbol", "getRiskGradeConfig", "", "", "jump2AccountRiskRatioMore", "fetchUnifyHourlyRates", "getUnifyHourlyRatesStateFlow", "", "Lcom/kubi/unify/api/entity/UnifyHourlyRateEntity;", "getLeverageLevels", "getLoanConfigStateFlow", "getUserLoanLeverageConfigStateFlow", "updateUserLoanLeverageConfig", "updateLoanCurrencyConfig", "observeFundsInfoChange", "startSpotStream", "startMarginStream", "stopSpotStream", "stopMarginStream", "refreshFundsInfo", "refreshPositions", "getAvgCostUpdateTime", "isOrderCenterRnEnabled", "refreshFuturesOrderCounts", "Lkotlin/Pair;", "", "jumpToUtaFuturesOrderDetail", "ctx", "orderId", "content", "businessType", "getUnifySiteVisible", "isUnifyAccountHitGray", "Companion", "BUnifyAccountApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IUnifyAccountService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f53155a = Companion.f53156a;

    /* JADX INFO: compiled from: IUnifyAccountService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/unify/api/IUnifyAccountService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/unify/api/IUnifyAccountService;", "BUnifyAccountApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f53156a = new Companion();

        @NotNull
        public final IUnifyAccountService get() {
            return (IUnifyAccountService) Router.f46192a.m56192n(IUnifyAccountService.class);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    List<Double> mo64977A();

    @Nullable
    /* JADX INFO: renamed from: B */
    BaseFragment mo64978B(@Nullable Bundle bundle);

    /* JADX INFO: renamed from: C */
    boolean mo64979C();

    /* JADX INFO: renamed from: D */
    boolean mo64980D();

    /* JADX INFO: renamed from: E */
    void mo64981E();

    /* JADX INFO: renamed from: F */
    void mo64982F(@NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: G */
    String mo64983G();

    @Nullable
    /* JADX INFO: renamed from: H */
    BaseFragment mo64984H(@Nullable Bundle bundle);

    /* JADX INFO: renamed from: I */
    void mo64985I();

    /* JADX INFO: renamed from: J */
    void mo64986J();

    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<BigDecimal> mo64987a(@Nullable String str);

    @NotNull
    /* JADX INFO: renamed from: b */
    List<BigDecimal> mo64988b(@NotNull String str);

    /* JADX INFO: renamed from: c */
    void mo64989c();

    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<Map<String, List<BigDecimal>>> mo64990d();

    /* JADX INFO: renamed from: e */
    boolean mo64991e();

    @NotNull
    /* JADX INFO: renamed from: f */
    InterfaceC41634e<List<Object>> mo64992f();

    @NotNull
    /* JADX INFO: renamed from: h */
    InterfaceC41634e<BigDecimal> mo64993h();

    @NotNull
    /* JADX INFO: renamed from: i */
    InterfaceC41634e<Map<String, UnifyHourlyRateEntity>> mo64994i();

    /* JADX INFO: renamed from: k */
    void mo64995k();

    /* JADX INFO: renamed from: l */
    void mo64996l();

    /* JADX INFO: renamed from: m */
    void mo64997m(@Nullable ViewGroup viewGroup, @NotNull String str, @Nullable Function0<Unit> function0);

    /* JADX INFO: renamed from: n */
    void mo64998n();

    @NotNull
    /* JADX INFO: renamed from: o */
    InterfaceC41634e<InterfaceC4984e> mo64999o();

    /* JADX INFO: renamed from: p */
    void mo65000p();

    /* JADX INFO: renamed from: q */
    boolean mo65001q();

    /* JADX INFO: renamed from: r */
    void mo65002r();

    @NotNull
    /* JADX INFO: renamed from: s */
    InterfaceC41634e<Pair<Long, Long>> mo65003s();

    /* JADX INFO: renamed from: t */
    void mo65004t(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String str4);

    @NotNull
    /* JADX INFO: renamed from: u */
    InterfaceC41634e<Map<String, BigDecimal>> mo65005u();

    /* JADX INFO: renamed from: v */
    void mo65006v(@NotNull Context context, @Nullable String str, @Nullable BigDecimal bigDecimal, @NotNull FragmentManager fragmentManager);

    /* JADX INFO: renamed from: w */
    void mo65007w();

    /* JADX INFO: renamed from: x */
    boolean mo65008x();

    @NotNull
    /* JADX INFO: renamed from: y */
    InterfaceC41634e<Boolean> mo65009y();

    /* JADX INFO: renamed from: z */
    void mo65010z(@NotNull String str);

    /* JADX INFO: renamed from: g */
    static /* synthetic */ void m64975g(IUnifyAccountService iUnifyAccountService, Context context, String str, BigDecimal bigDecimal, FragmentManager fragmentManager, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoRepay");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = null;
        }
        iUnifyAccountService.mo65006v(context, str, bigDecimal, fragmentManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    static /* synthetic */ void m64976j(IUnifyAccountService iUnifyAccountService, ViewGroup viewGroup, String str, Function0 function0, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleUnifyAccountToggleView");
        }
        if ((i11 & 4) != 0) {
            function0 = null;
        }
        iUnifyAccountService.mo64997m(viewGroup, str, function0);
    }
}
