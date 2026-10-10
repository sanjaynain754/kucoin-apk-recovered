package x60;

import cm.UnifyChangeLeverageResult;
import cm.UnifyChangeMarginResult;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.data.platform.model.ContractRiskLimitEntity;
import com.kubi.kumex.data.trade.model.AutoDepositStatus;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.entity.BalanceEntity;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ug.InterfaceC45233b;
import ug.InterfaceC45234c;
import z60.C46713b;

/* JADX INFO: renamed from: x60.a */
/* JADX INFO: compiled from: IIsolatedBizInterfaceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J1\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0002\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016J*\u0010\u001b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0010H\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016J+\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0096\u0001J#\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0096\u0001J\u0013\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096\u0001J#\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0096\u0001J+\u0010+\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0096\u0001J\t\u0010,\u001a\u00020-H\u0096\u0001J5\u0010.\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0096\u0001J+\u0010/\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/kubi/unify/unify/isolated/IIsolatedBizInterfaceImpl;", "Lcom/kubi/function/isolated/IIsolatedBizInterface;", "Lcom/kubi/function/isolated/IMultiIsolatedApi;", "api", "<init>", "(Lcom/kubi/function/isolated/IMultiIsolatedApi;)V", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "observeRiskLimit", "Lio/reactivex/Observable;", "", "isTrial", "", "observeFreezeBalance", "Lcom/kubi/kumex/entity/BalanceEntity;", FirebaseAnalytics.Param.CURRENCY, "", "observePositions", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "submitAutoDepositMargin", "symbol", "status", "positionSide", "(ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/Object;", "fetchUserRiskLimit", "Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;", "submitUserRiskLimit", FirebaseAnalytics.Param.LEVEL, "", "bizNo", "fetchPositionAutoDepositStatus", "Lcom/kubi/kumex/data/trade/model/AutoDepositStatus;", "fetchAddMarginOfCalResult", "Lcom/kubi/kumex/data/trade/model/UnifyChangeMarginResult;", ViewProps.MARGIN, "type", "fetchAdjustLeverageOfCalResult", "Lcom/kubi/kumex/data/trade/model/UnifyChangeLeverageResult;", "leverage", "fetchIsolatedAvailableBalance", "Ljava/math/BigDecimal;", "fetchMaxReduceMargin", "fetchReduceMarginOfCalResult", "refreshPositionList", "", "submitAddMargin", "submitReduceMargin", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46084a implements InterfaceC45233b, InterfaceC45234c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC45234c f103534a;

    /* JADX WARN: Multi-variable type inference failed */
    public C46084a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C46084a(@NotNull InterfaceC45234c api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.f103534a = api;
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: A */
    public UnifyChangeMarginResult mo93803A(@NotNull String symbol, @NotNull String margin, @NotNull String positionSide, @NotNull String type) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f103534a.mo93803A(symbol, margin, positionSide, type);
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: I */
    public Object mo93805I(boolean z11, @NotNull String symbol, @NotNull String margin, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        return this.f103534a.mo93805I(z11, symbol, margin, positionSide);
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: N */
    public BigDecimal mo93806N(boolean z11, @NotNull String symbol, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        return this.f103534a.mo93806N(z11, symbol, positionSide);
    }

    @Override // ug.InterfaceC45235d
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public Observable<Object> mo93827N0(boolean z11) {
        Observable<Object> observableJust = Observable.just(new Object());
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: R0 */
    public Object mo93807R0(boolean z11, @NotNull String symbol, @Nullable Boolean bool, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        return null;
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: Z */
    public Object mo93809Z(boolean z11, @NotNull String symbol, int i11, @NotNull String bizNo) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(bizNo, "bizNo");
        return null;
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: g0 */
    public PositionEntity mo93810g0(boolean z11, @NotNull String symbol, @NotNull String margin, @Nullable String str, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        return this.f103534a.mo93810g0(z11, symbol, margin, str, positionSide);
    }

    @Override // ug.InterfaceC45234c
    @NotNull
    /* JADX INFO: renamed from: h0 */
    public ContractRiskLimitEntity mo93811h0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new ContractRiskLimitEntity();
    }

    @Override // ug.InterfaceC45234c
    /* JADX INFO: renamed from: m0 */
    public void mo93939m0() {
        this.f103534a.mo93939m0();
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: n */
    public UnifyChangeLeverageResult mo93812n(@NotNull String symbol, @NotNull String leverage, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        return this.f103534a.mo93812n(symbol, leverage, positionSide);
    }

    @Override // ug.InterfaceC45234c
    @NotNull
    /* JADX INFO: renamed from: p0 */
    public AutoDepositStatus mo93813p0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new AutoDepositStatus(null, null, null, 7, null);
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: t */
    public BigDecimal mo93940t(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return this.f103534a.mo93940t(currency);
    }

    @Override // ug.InterfaceC45235d
    @NotNull
    /* JADX INFO: renamed from: t0 */
    public Observable<BalanceEntity> mo93830t0(boolean z11, @NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Observable<BalanceEntity> observableJust = Observable.just(new BalanceEntity(currency, null, null, null, null, null, null, null, null, null, null, null, null, null, z11, null, 49150, null));
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: u */
    public UnifyChangeMarginResult mo93814u(@NotNull String symbol, @NotNull String margin, @NotNull String positionSide, @NotNull String type) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f103534a.mo93814u(symbol, margin, positionSide, type);
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.UNIFIED;
    }

    public /* synthetic */ C46084a(InterfaceC45234c interfaceC45234c, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new C46713b() : interfaceC45234c);
    }

    @Override // ug.InterfaceC45232a
    @NotNull
    /* JADX INFO: renamed from: G */
    public Observable<List<PositionEntity>> mo93938G(boolean z11) {
        Observable<List<PositionEntity>> observableJust = Observable.just(CollectionsKt.emptyList());
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }
}
