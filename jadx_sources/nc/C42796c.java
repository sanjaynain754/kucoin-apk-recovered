package nc;

import cm.UnifyChangeLeverageResult;
import cm.UnifyChangeMarginResult;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.data.platform.model.ContractRiskLimitEntity;
import com.kubi.kumex.data.trade.model.AutoDepositStatus;
import com.kubi.kumex.data.trade.model.AutoDepositStatusEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.utils.extensions.C27025c;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import java.math.BigDecimal;
import java.util.List;
import lc.InterfaceC42166k;
import mc.InterfaceC42503a;
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

/* JADX INFO: renamed from: nc.c */
/* JADX INFO: compiled from: IsolatedApiDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J1\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u0017H\u0016¢\u0006\u0002\u0010\u001aJ\"\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J4\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J*\u0010!\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J*\u0010$\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020\u0017H\u0016J\u0018\u0010'\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J*\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0017H\u0016J*\u0010,\u001a\u0004\u0018\u00010*2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0017H\u0016J\"\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u00060"}, m90084d2 = {"Lcom/kubi/copytrading/copytd/isolated/delegate/IsolatedApiDelegate;", "Lcom/kubi/function/isolated/IMultiIsolatedApi;", "<init>", "()V", "api", "Lcom/kubi/copytrading/copytd/isolated/api/IIsolatedApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/copytrading/copytd/isolated/api/IIsolatedApi;", "api$delegate", "Lkotlin/Lazy;", "hedgeApi", "Lcom/kubi/copytrading/copytd/hedge/IHedgeApi;", "getHedgeApi", "()Lcom/kubi/copytrading/copytd/hedge/IHedgeApi;", "hedgeApi$delegate", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "submitAutoDepositMargin", "", "isTrial", "", "symbol", "", "status", "positionSide", "(ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/Object;", "fetchMaxReduceMargin", "Ljava/math/BigDecimal;", "submitAddMargin", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", ViewProps.MARGIN, "bizNo", "submitReduceMargin", "fetchUserRiskLimit", "Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;", "submitUserRiskLimit", FirebaseAnalytics.Param.LEVEL, "", "fetchPositionAutoDepositStatus", "Lcom/kubi/kumex/data/trade/model/AutoDepositStatus;", "fetchReduceMarginOfCalResult", "Lcom/kubi/kumex/data/trade/model/UnifyChangeMarginResult;", "type", "fetchAddMarginOfCalResult", "fetchAdjustLeverageOfCalResult", "Lcom/kubi/kumex/data/trade/model/UnifyChangeLeverageResult;", "leverage", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIsolatedApiDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IsolatedApiDelegate.kt\ncom/kubi/copytrading/copytd/isolated/delegate/IsolatedApiDelegate\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,143:1\n1869#2,2:144\n*S KotlinDebug\n*F\n+ 1 IsolatedApiDelegate.kt\ncom/kubi/copytrading/copytd/isolated/delegate/IsolatedApiDelegate\n*L\n104#1:144,2\n*E\n"})
public final class C42796c implements InterfaceC45234c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f94812a = LazyKt.lazy(new Function0() { // from class: nc.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C42796c.m93802x0();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f94813b = LazyKt.lazy(new Function0() { // from class: nc.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C42796c.m93800V0();
        }
    });

    /* JADX INFO: renamed from: F0 */
    public final InterfaceC42503a m93804F0() {
        return (InterfaceC42503a) this.f94812a.getValue();
    }

    /* JADX INFO: renamed from: T0 */
    public final InterfaceC42166k m93808T0() {
        return (InterfaceC42166k) this.f94813b.getValue();
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.COPY_TRADING;
    }

    /* JADX INFO: renamed from: V0 */
    public static final InterfaceC42166k m93800V0() {
        return (InterfaceC42166k) C42597a.m93391g().create(InterfaceC42166k.class);
    }

    /* JADX INFO: renamed from: x0 */
    public static final InterfaceC42503a m93802x0() {
        return (InterfaceC42503a) C42597a.m93391g().create(InterfaceC42503a.class);
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: A */
    public UnifyChangeMarginResult mo93803A(@NotNull String symbol, @NotNull String margin, @NotNull String positionSide, @NotNull String type) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        Intrinsics.checkNotNullParameter(type, "type");
        return null;
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: I */
    public Object mo93805I(boolean z11, @NotNull String symbol, @NotNull String margin, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        if (z11) {
            return m93804F0().m93195g(symbol, margin, positionSide);
        }
        return m93804F0().m93190b(symbol, margin, positionSide);
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: N */
    public BigDecimal mo93806N(boolean z11, @NotNull String symbol, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        if (z11) {
            return m93804F0().m93198j(symbol, positionSide);
        }
        return m93804F0().m93189a(symbol, positionSide);
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: R0 */
    public Object mo93807R0(boolean z11, @NotNull String symbol, @Nullable Boolean bool, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        if (z11) {
            return m93804F0().m93196h(symbol, bool, positionSide);
        }
        return m93804F0().m93191c(symbol, bool, positionSide);
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
        if (z11) {
            return m93804F0().m93194f(symbol, margin, str, positionSide);
        }
        return m93804F0().m93193e(symbol, margin, str, positionSide);
    }

    @Override // ug.InterfaceC45234c
    @NotNull
    /* JADX INFO: renamed from: h0 */
    public ContractRiskLimitEntity mo93811h0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (z11) {
            return m93804F0().m93197i(symbol);
        }
        return m93804F0().m93192d(symbol);
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: n */
    public UnifyChangeLeverageResult mo93812n(@NotNull String symbol, @NotNull String leverage, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        return null;
    }

    @Override // ug.InterfaceC45234c
    @NotNull
    /* JADX INFO: renamed from: p0 */
    public AutoDepositStatus mo93813p0(boolean z11, @NotNull String symbol) throws Throwable {
        List<AutoDepositStatusEntity> listM92573c;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (z11) {
            listM92573c = m93808T0().m92579i(symbol);
        } else {
            listM92573c = m93808T0().m92573c(symbol);
        }
        AutoDepositStatus autoDepositStatus = new AutoDepositStatus(null, null, null, 7, null);
        AutoDepositStatus autoDepositStatusCopy$default = autoDepositStatus;
        for (AutoDepositStatusEntity autoDepositStatusEntity : listM92573c) {
            if (Intrinsics.areEqual(autoDepositStatusEntity.getPositionSide(), SharedPositionInfo.SIDE_LONG)) {
                autoDepositStatusCopy$default = AutoDepositStatus.copy$default(autoDepositStatusCopy$default, Boolean.valueOf(C27025c.m66566d(autoDepositStatusEntity.getStatus())), null, null, 6, null);
            }
            AutoDepositStatus autoDepositStatusCopy$default2 = autoDepositStatusCopy$default;
            if (Intrinsics.areEqual(autoDepositStatusEntity.getPositionSide(), SharedPositionInfo.SIDE_SHORT)) {
                autoDepositStatusCopy$default2 = AutoDepositStatus.copy$default(autoDepositStatusCopy$default2, null, Boolean.valueOf(C27025c.m66566d(autoDepositStatusEntity.getStatus())), null, 5, null);
            }
            AutoDepositStatus autoDepositStatus2 = autoDepositStatusCopy$default2;
            if (Intrinsics.areEqual(autoDepositStatusEntity.getPositionSide(), "BOTH")) {
                autoDepositStatusCopy$default = AutoDepositStatus.copy$default(autoDepositStatus2, null, null, Boolean.valueOf(C27025c.m66566d(autoDepositStatusEntity.getStatus())), 3, null);
            } else {
                autoDepositStatusCopy$default = autoDepositStatus2;
            }
        }
        return autoDepositStatusCopy$default;
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: u */
    public UnifyChangeMarginResult mo93814u(@NotNull String symbol, @NotNull String margin, @NotNull String positionSide, @NotNull String type) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        Intrinsics.checkNotNullParameter(type, "type");
        return null;
    }
}
