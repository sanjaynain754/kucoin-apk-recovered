package p366jc;

import com.appsflyer.AppsFlyerProperties;
import com.kubi.broker.MultiBizType;
import com.kubi.futures.model.setting.KycLeverageEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p339ic.InterfaceC38511a;
import p595rg.InterfaceC44079g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jc.b */
/* JADX INFO: compiled from: IPositionApiDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/copytrading/copytd/common/position/delegate/IPositionApiDelegate;", "Lcom/kubi/function/common/IMultiPositionApi;", "<init>", "()V", "api", "Lcom/kubi/copytrading/copytd/common/position/api/IPositionApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/copytrading/copytd/common/position/api/IPositionApi;", "api$delegate", "Lkotlin/Lazy;", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "closeAllPosition", "", AppsFlyerProperties.CHANNEL, "", "isTrial", "", "fetchPositionBySymbol", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "symbol", "fetchKycLeverage", "Lcom/kubi/futures/model/setting/KycLeverageEntity;", "marginMode", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40378b implements InterfaceC44079g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f89663a = LazyKt.lazy(new Function0() { // from class: jc.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C40378b.m88971a0();
        }
    });

    @Override // p595rg.InterfaceC44079g
    @NotNull
    /* JADX INFO: renamed from: B0 */
    public Object mo83153B0(@NotNull String channel, boolean z11) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        return z11 ? m88972x0().m87115d(channel) : m88972x0().m87113b(channel);
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.COPY_TRADING;
    }

    /* JADX INFO: renamed from: x0 */
    public final InterfaceC38511a m88972x0() {
        return (InterfaceC38511a) this.f89663a.getValue();
    }

    /* JADX INFO: renamed from: a0 */
    public static final InterfaceC38511a m88971a0() {
        return (InterfaceC38511a) C42597a.m93391g().create(InterfaceC38511a.class);
    }

    @Override // p595rg.InterfaceC44079g
    @NotNull
    /* JADX INFO: renamed from: S */
    public List<PositionEntity> mo83155S(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (z11) {
            return m88972x0().m87116e(symbol);
        }
        return m88972x0().m87114c(symbol);
    }

    @Override // p595rg.InterfaceC44079g
    @Nullable
    /* JADX INFO: renamed from: a */
    public KycLeverageEntity mo83157a(@NotNull String symbol, @NotNull String marginMode) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(marginMode, "marginMode");
        return m88972x0().m87112a(symbol, marginMode);
    }
}
