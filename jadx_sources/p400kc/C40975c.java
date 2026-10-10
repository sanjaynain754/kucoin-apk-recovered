package p400kc;

import com.kubi.broker.MultiBizType;
import com.kubi.kumex.data.platform.model.GrayCrossModeEntity;
import com.kubi.kumex.data.platform.model.MarginModeInfoEntity;
import com.kubi.kumex.data.platform.model.ModifyMarginModeResultEntity;
import com.kubi.kumex.data.platform.model.SubmitCrossLeverageEntity;
import com.kubi.kumex.data.trade.model.CrossHedgeQtyMarginEntity;
import com.kubi.kumex.data.trade.model.QuoteEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import java.util.Map;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import sg.InterfaceC44405b;

/* JADX INFO: renamed from: kc.c */
/* JADX INFO: compiled from: ICrossApiDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J&\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0012H\u0016J\b\u0010 \u001a\u00020!H\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\""}, m90084d2 = {"Lcom/kubi/copytrading/copytd/cross/ICrossApiDelegate;", "Lcom/kubi/function/cross/IMultiCrossApi;", "<init>", "()V", "api", "Lcom/kubi/copytrading/copytd/cross/ICrossApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/copytrading/copytd/cross/ICrossApi;", "api$delegate", "Lkotlin/Lazy;", "fetchAllContractsMarginMode", "", "Lcom/kubi/kumex/data/trade/model/QuoteEntity;", "isTrial", "", "fetchMarginMode", "", "", "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "symbol", "submitMarginMode", "Lcom/kubi/kumex/data/platform/model/ModifyMarginModeResultEntity;", "map", "fetchCrossModeGray", "Lcom/kubi/kumex/data/platform/model/GrayCrossModeEntity;", "submitCrossLeverage", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/platform/model/SubmitCrossLeverageEntity;", "fetchActiveOrderStatistics", "Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMarginEntity;", "symbols", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40975c implements InterfaceC44405b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f91065a = LazyKt.lazy(new Function0() { // from class: kc.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C40975c.m89736a0();
        }
    });

    @Override // sg.InterfaceC44405b
    /* JADX INFO: renamed from: f0 */
    public boolean mo24481f0(boolean z11, @NotNull SubmitCrossLeverageEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return z11 ? m89737x0().m89734l(entity) : m89737x0().m89725c(entity);
    }

    @Override // sg.InterfaceC44405b
    @NotNull
    /* JADX INFO: renamed from: g1 */
    public ModifyMarginModeResultEntity mo24483g1(boolean z11, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return z11 ? m89737x0().m89732j(map) : m89737x0().m89724b(map);
    }

    @Override // sg.InterfaceC44405b
    @Nullable
    /* JADX INFO: renamed from: n0 */
    public List<QuoteEntity> mo24485n0(boolean z11) {
        return z11 ? m89737x0().m89728f() : m89737x0().m89729g();
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.COPY_TRADING;
    }

    /* JADX INFO: renamed from: x0 */
    public final InterfaceC40973a m89737x0() {
        return (InterfaceC40973a) this.f91065a.getValue();
    }

    /* JADX INFO: renamed from: a0 */
    public static final InterfaceC40973a m89736a0() {
        return (InterfaceC40973a) C42597a.m93391g().create(InterfaceC40973a.class);
    }

    @Override // sg.InterfaceC44405b
    @NotNull
    /* JADX INFO: renamed from: I0 */
    public GrayCrossModeEntity mo24476I0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (z11) {
            return m89737x0().m89733k(symbol);
        }
        return m89737x0().m89727e(symbol);
    }

    @Override // sg.InterfaceC44405b
    @NotNull
    /* JADX INFO: renamed from: M0 */
    public CrossHedgeQtyMarginEntity mo24478M0(boolean z11, @NotNull String symbols) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        if (z11) {
            return m89737x0().m89730h(symbols);
        }
        return m89737x0().m89731i(symbols);
    }

    @Override // sg.InterfaceC44405b
    @NotNull
    /* JADX INFO: renamed from: i0 */
    public Map<String, MarginModeInfoEntity> mo24484i0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (z11) {
            return m89737x0().m89726d(symbol);
        }
        return m89737x0().m89723a(symbol);
    }
}
