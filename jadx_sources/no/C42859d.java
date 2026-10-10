package no;

import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.kubi.loan.api.ILoanService;
import com.kubi.loan.api.entity.LeverCoinConfig;
import com.kubi.loan.repo.platform.IPlatformService;
import com.kubi.sdk.base.entity.BaseEntity;
import io.InterfaceC38688a;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.Callable;
import mr.C42597a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p406ko.C41086j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: no.d */
/* JADX INFO: compiled from: LoanService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J(\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001a0\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/loan/service/LoanService;", "Lcom/kubi/loan/api/ILoanService;", "<init>", "()V", "loanApi", "Lcom/kubi/loan/api/LoanApi;", "kotlin.jvm.PlatformType", "getLoanApi", "()Lcom/kubi/loan/api/LoanApi;", "loanApi$delegate", "Lkotlin/Lazy;", "getLeverBorrowMin", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.CURRENCY, "", "getLeverBorrowUnit", "getLeverConfig", "Lcom/kubi/loan/api/entity/LeverCoinConfig;", "getLeverConfigForBridge", RemoteConfigComponent.FETCH_FILE_NAME, "", "fetchLeverConfigListForBridge", "Lio/reactivex/Observable;", "", "needRate", "fetchReferRate", "Lcom/kubi/sdk/base/entity/BaseEntity;", "amount", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42859d implements ILoanService {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f94923b = LazyKt.lazy(new Function0() { // from class: no.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C42859d.m94004l();
        }
    });

    /* JADX INFO: renamed from: j */
    public static final List m94003j(boolean z11) {
        return ((IPlatformService) C41086j.f91299a.m90077i(IPlatformService.class)).mo92797d(z11);
    }

    @Override // com.kubi.loan.api.ILoanService
    @Nullable
    /* JADX INFO: renamed from: a */
    public BigDecimal mo37703a(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        LeverCoinConfig leverCoinConfigM37796b = IPlatformService.m37796b((IPlatformService) C41086j.f91299a.m90077i(IPlatformService.class), currency, false, 2, null);
        if (leverCoinConfigM37796b != null) {
            return leverCoinConfigM37796b.getBorrowMinAmount();
        }
        return null;
    }

    @Override // com.kubi.loan.api.ILoanService
    @NotNull
    /* JADX INFO: renamed from: b */
    public Observable<List<LeverCoinConfig>> mo37704b(final boolean z11) {
        Observable<List<LeverCoinConfig>> observableSubscribeOn = Observable.fromCallable(new Callable() { // from class: no.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C42859d.m94003j(z11);
            }
        }).subscribeOn(C42916f.m94127f());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        return observableSubscribeOn;
    }

    @Override // com.kubi.loan.api.ILoanService
    @Nullable
    /* JADX INFO: renamed from: c */
    public BigDecimal mo37705c(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        LeverCoinConfig leverCoinConfigM37796b = IPlatformService.m37796b((IPlatformService) C41086j.f91299a.m90077i(IPlatformService.class), currency, false, 2, null);
        if (leverCoinConfigM37796b != null) {
            return leverCoinConfigM37796b.getCurrencyLoanMinUnit();
        }
        return null;
    }

    @Override // com.kubi.loan.api.ILoanService
    @Nullable
    /* JADX INFO: renamed from: f */
    public LeverCoinConfig mo37707f(@NotNull String currency, boolean z11) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return ((IPlatformService) C41086j.f91299a.m90077i(IPlatformService.class)).mo37798e(currency, z11);
    }

    @Override // com.kubi.loan.api.ILoanService
    @Nullable
    /* JADX INFO: renamed from: g */
    public LeverCoinConfig mo37708g(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return IPlatformService.m37796b((IPlatformService) C41086j.f91299a.m90077i(IPlatformService.class), currency, false, 2, null);
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC38688a m94005k() {
        return (InterfaceC38688a) this.f94923b.getValue();
    }

    /* JADX INFO: renamed from: l */
    public static final InterfaceC38688a m94004l() {
        return (InterfaceC38688a) C42597a.m93386b().create(InterfaceC38688a.class);
    }

    @Override // com.kubi.loan.api.ILoanService
    @NotNull
    /* JADX INFO: renamed from: e */
    public Observable<BaseEntity<BigDecimal>> mo37706e(@Nullable BigDecimal bigDecimal, @Nullable String str) {
        String plainString;
        BigDecimal bigDecimalM11724a;
        InterfaceC38688a interfaceC38688aM94005k = m94005k();
        if (bigDecimal != null && (bigDecimalM11724a = C6447a.m11724a(bigDecimal)) != null) {
            plainString = bigDecimalM11724a.toPlainString();
        } else {
            plainString = null;
        }
        return interfaceC38688aM94005k.m87467a(plainString, str);
    }
}
