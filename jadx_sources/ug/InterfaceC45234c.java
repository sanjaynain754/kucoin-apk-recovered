package ug;

import cm.UnifyChangeLeverageResult;
import cm.UnifyChangeMarginResult;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.data.platform.model.ContractRiskLimitEntity;
import com.kubi.kumex.data.trade.model.AutoDepositStatus;
import com.kubi.kumex.data.trade.model.PositionEntity;
import java.math.BigDecimal;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p559qg.InterfaceC43729a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ug.c */
/* JADX INFO: compiled from: IIsolatedBizInterface.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u0007H&¢\u0006\u0002\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&J4\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H&J*\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J,\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0010\u001a\u00020\u0007H&J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J,\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u0007H&J,\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u0007H&J\"\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&J\u0012\u0010 \u001a\u0004\u0018\u00010\f2\u0006\u0010!\u001a\u00020\u0007H\u0016J\b\u0010\"\u001a\u00020#H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/function/isolated/IMultiIsolatedApi;", "Lcom/kubi/function/IMultiFunction;", "submitAutoDepositMargin", "", "isTrial", "", "symbol", "", "status", "positionSide", "(ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/Object;", "fetchMaxReduceMargin", "Ljava/math/BigDecimal;", "submitAddMargin", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", ViewProps.MARGIN, "bizNo", "submitReduceMargin", "fetchUserRiskLimit", "Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;", "submitUserRiskLimit", FirebaseAnalytics.Param.LEVEL, "", "fetchPositionAutoDepositStatus", "Lcom/kubi/kumex/data/trade/model/AutoDepositStatus;", "fetchReduceMarginOfCalResult", "Lcom/kubi/kumex/data/trade/model/UnifyChangeMarginResult;", "type", "fetchAddMarginOfCalResult", "fetchAdjustLeverageOfCalResult", "Lcom/kubi/kumex/data/trade/model/UnifyChangeLeverageResult;", "leverage", "fetchIsolatedAvailableBalance", FirebaseAnalytics.Param.CURRENCY, "refreshPositionList", "", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC45234c extends InterfaceC43729a {
    @Nullable
    /* JADX INFO: renamed from: A */
    UnifyChangeMarginResult mo93803A(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4);

    @Nullable
    /* JADX INFO: renamed from: I */
    Object mo93805I(boolean z11, @NotNull String str, @NotNull String str2, @NotNull String str3);

    @Nullable
    /* JADX INFO: renamed from: N */
    BigDecimal mo93806N(boolean z11, @NotNull String str, @NotNull String str2);

    @Nullable
    /* JADX INFO: renamed from: R0 */
    Object mo93807R0(boolean z11, @NotNull String str, @Nullable Boolean bool, @NotNull String str2);

    @Nullable
    /* JADX INFO: renamed from: Z */
    Object mo93809Z(boolean z11, @NotNull String str, int i11, @NotNull String str2);

    @Nullable
    /* JADX INFO: renamed from: g0 */
    PositionEntity mo93810g0(boolean z11, @NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4);

    @NotNull
    /* JADX INFO: renamed from: h0 */
    ContractRiskLimitEntity mo93811h0(boolean z11, @NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: n */
    UnifyChangeLeverageResult mo93812n(@NotNull String str, @NotNull String str2, @NotNull String str3);

    @NotNull
    /* JADX INFO: renamed from: p0 */
    AutoDepositStatus mo93813p0(boolean z11, @NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: u */
    UnifyChangeMarginResult mo93814u(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4);

    /* JADX INFO: renamed from: P */
    static /* synthetic */ Object m99946P(InterfaceC45234c interfaceC45234c, boolean z11, String str, int i11, String str2, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitUserRiskLimit");
        }
        if ((i12 & 8) != 0) {
            str2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str2, "toString(...)");
        }
        return interfaceC45234c.mo93809Z(z11, str, i11, str2);
    }

    /* JADX INFO: renamed from: R */
    static /* synthetic */ UnifyChangeMarginResult m99947R(InterfaceC45234c interfaceC45234c, String str, String str2, String str3, String str4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchReduceMarginOfCalResult");
        }
        if ((i11 & 8) != 0) {
            str4 = "WITHDRAW";
        }
        return interfaceC45234c.mo93814u(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: h1 */
    static /* synthetic */ UnifyChangeMarginResult m99948h1(InterfaceC45234c interfaceC45234c, String str, String str2, String str3, String str4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchAddMarginOfCalResult");
        }
        if ((i11 & 8) != 0) {
            str4 = "DEPOSIT";
        }
        return interfaceC45234c.mo93803A(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    default BigDecimal mo93940t(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return null;
    }

    /* JADX INFO: renamed from: m0 */
    default void mo93939m0() {
    }
}
