package z60;

import cm.UnifyChangeLeverageResult;
import cm.UnifyChangeMarginResult;
import com.facebook.react.uimanager.ViewProps;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.data.platform.model.ContractRiskLimitEntity;
import com.kubi.kumex.data.trade.model.AutoDepositStatus;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.unify.entity.IsolatedModifyMarginRequest;
import com.kubi.unify.entity.UnifyBalanceEntity;
import com.kubi.unify.stream.UnifyDataStreamManager;
import com.kubi.utils.extensions.DowngradeExKt;
import java.math.BigDecimal;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ug.InterfaceC45234c;
import y60.InterfaceC46390a;

/* JADX INFO: renamed from: z60.b */
/* JADX INFO: compiled from: IMultiIsolatedApiDelegate.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0002\u0010\u0013J\"\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J4\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J*\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J*\u0010\u001d\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J*\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0016J*\u0010%\u001a\u0004\u0018\u00010#2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0016J\"\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0012\u0010)\u001a\u0004\u0018\u00010\u00152\u0006\u0010*\u001a\u00020\u0010H\u0016J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020.H\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006/"}, m90084d2 = {"Lcom/kubi/unify/unify/isolated/delegate/IMultiIsolatedApiDelegate;", "Lcom/kubi/function/isolated/IMultiIsolatedApi;", "<init>", "()V", "api", "Lcom/kubi/unify/unify/isolated/api/IIsolatedApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/unify/unify/isolated/api/IIsolatedApi;", "api$delegate", "Lkotlin/Lazy;", "submitAutoDepositMargin", "", "isTrial", "", "symbol", "", "status", "positionSide", "(ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/Object;", "fetchMaxReduceMargin", "Ljava/math/BigDecimal;", "submitAddMargin", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", ViewProps.MARGIN, "bizNo", "submitReduceMargin", "fetchUserRiskLimit", "Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;", "submitUserRiskLimit", FirebaseAnalytics.Param.LEVEL, "", "fetchPositionAutoDepositStatus", "Lcom/kubi/kumex/data/trade/model/AutoDepositStatus;", "fetchReduceMarginOfCalResult", "Lcom/kubi/kumex/data/trade/model/UnifyChangeMarginResult;", "type", "fetchAddMarginOfCalResult", "fetchAdjustLeverageOfCalResult", "Lcom/kubi/kumex/data/trade/model/UnifyChangeLeverageResult;", "leverage", "fetchIsolatedAvailableBalance", FirebaseAnalytics.Param.CURRENCY, "refreshPositionList", "", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIMultiIsolatedApiDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IMultiIsolatedApiDelegate.kt\ncom/kubi/unify/unify/isolated/delegate/IMultiIsolatedApiDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
public final class C46713b implements InterfaceC45234c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f104540a = LazyKt.lazy(new Function0() { // from class: z60.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C46713b.m102958a0();
        }
    });

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: A */
    public UnifyChangeMarginResult mo93803A(@NotNull String symbol, @NotNull String margin, @NotNull String positionSide, @NotNull String type) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        Intrinsics.checkNotNullParameter(type, "type");
        return m102959x0().m102305A(symbol, margin, positionSide, type);
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: I */
    public Object mo93805I(boolean z11, @NotNull String symbol, @NotNull String margin, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        InterfaceC46390a interfaceC46390aM102959x0 = m102959x0();
        String plainString = C6447a.m11724a(DowngradeExKt.m66535e(margin, null, 1, null).abs()).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        return interfaceC46390aM102959x0.m102308d(new IsolatedModifyMarginRequest(symbol, plainString, positionSide, "WITHDRAW"));
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: N */
    public BigDecimal mo93806N(boolean z11, @NotNull String symbol, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        if (z11) {
            return null;
        }
        return m102959x0().m102306a(symbol, positionSide);
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
    public PositionEntity mo93810g0(boolean z11, @NotNull String symbol, @NotNull String margin, @Nullable String str, @NotNull String positionSide) throws Throwable {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        InterfaceC46390a interfaceC46390aM102959x0 = m102959x0();
        String plainString = C6447a.m11724a(DowngradeExKt.m66535e(margin, null, 1, null).abs()).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        interfaceC46390aM102959x0.m102308d(new IsolatedModifyMarginRequest(symbol, plainString, positionSide, "DEPOSIT"));
        return new PositionEntity(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 131071, null);
    }

    @Override // ug.InterfaceC45234c
    @NotNull
    /* JADX INFO: renamed from: h0 */
    public ContractRiskLimitEntity mo93811h0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new ContractRiskLimitEntity();
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: n */
    public UnifyChangeLeverageResult mo93812n(@NotNull String symbol, @NotNull String leverage, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        return m102959x0().m102309n(symbol, leverage, positionSide);
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
    public BigDecimal mo93940t(@NotNull String currency) throws Throwable {
        Intrinsics.checkNotNullParameter(currency, "currency");
        UnifyBalanceEntity unifyBalanceEntityM102310t = m102959x0().m102310t(currency);
        if (unifyBalanceEntityM102310t != null) {
            return unifyBalanceEntityM102310t.getFuturesIsolatedAvailable();
        }
        return null;
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: u */
    public UnifyChangeMarginResult mo93814u(@NotNull String symbol, @NotNull String margin, @NotNull String positionSide, @NotNull String type) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        Intrinsics.checkNotNullParameter(type, "type");
        return m102959x0().m102311u(symbol, margin, positionSide, type);
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.UNIFIED;
    }

    /* JADX INFO: renamed from: x0 */
    public final InterfaceC46390a m102959x0() {
        return (InterfaceC46390a) this.f104540a.getValue();
    }

    /* JADX INFO: renamed from: a0 */
    public static final InterfaceC46390a m102958a0() {
        return (InterfaceC46390a) C42597a.m93391g().create(InterfaceC46390a.class);
    }

    @Override // ug.InterfaceC45234c
    /* JADX INFO: renamed from: m0 */
    public void mo93939m0() throws Throwable {
        UnifyDataStreamManager.f53365a.m65358q(InterfaceC46390a.m102304c(m102959x0(), false, 1, null));
    }
}
