package p231eh;

import com.appsflyer.AppsFlyerProperties;
import com.kubi.broker.MultiBizType;
import com.kubi.futures.model.setting.KycLeverageEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p202dh.InterfaceC36679a;
import p202dh.InterfaceC36681c;
import p595rg.InterfaceC44079g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: eh.c */
/* JADX INFO: compiled from: IPositionApiDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0015H\u0016J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0015H\u0016R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR#\u0010\r\u001a\n \b*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/futures/classic/common/positon/delegate/IPositionApiDelegate;", "Lcom/kubi/function/common/IMultiPositionApi;", "<init>", "()V", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "api", "Lcom/kubi/futures/classic/common/positon/api/ISelfPositionApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/futures/classic/common/positon/api/ISelfPositionApi;", "api$delegate", "Lkotlin/Lazy;", "trialApi", "Lcom/kubi/futures/classic/common/positon/api/ITrialPositionApi;", "getTrialApi", "()Lcom/kubi/futures/classic/common/positon/api/ITrialPositionApi;", "trialApi$delegate", "closeAllPosition", "", AppsFlyerProperties.CHANNEL, "", "isTrial", "", "fetchPositionBySymbol", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "symbol", "fetchKycLeverage", "Lcom/kubi/futures/model/setting/KycLeverageEntity;", "marginMode", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37178c implements InterfaceC44079g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f82471a = LazyKt.lazy(new Function0() { // from class: eh.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C37178c.m83152x0();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f82472b = LazyKt.lazy(new Function0() { // from class: eh.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C37178c.m83150V0();
        }
    });

    @Override // p595rg.InterfaceC44079g
    @NotNull
    /* JADX INFO: renamed from: B0 */
    public Object mo83153B0(@NotNull String channel, boolean z11) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        return m83154F0().m82105b(channel);
    }

    /* JADX INFO: renamed from: F0 */
    public final InterfaceC36679a m83154F0() {
        return (InterfaceC36679a) this.f82471a.getValue();
    }

    /* JADX INFO: renamed from: T0 */
    public final InterfaceC36681c m83156T0() {
        return (InterfaceC36681c) this.f82472b.getValue();
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.CLASSIC;
    }

    /* JADX INFO: renamed from: V0 */
    public static final InterfaceC36681c m83150V0() {
        return (InterfaceC36681c) C42597a.m93391g().create(InterfaceC36681c.class);
    }

    /* JADX INFO: renamed from: x0 */
    public static final InterfaceC36679a m83152x0() {
        return (InterfaceC36679a) C42597a.m93391g().create(InterfaceC36679a.class);
    }

    @Override // p595rg.InterfaceC44079g
    @NotNull
    /* JADX INFO: renamed from: S */
    public List<PositionEntity> mo83155S(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (z11) {
            return InterfaceC36681c.m82111a(m83156T0(), symbol, false, 2, null);
        }
        return m83154F0().m82106c(symbol);
    }

    @Override // p595rg.InterfaceC44079g
    @Nullable
    /* JADX INFO: renamed from: a */
    public KycLeverageEntity mo83157a(@NotNull String symbol, @NotNull String marginMode) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(marginMode, "marginMode");
        return m83154F0().m82104a(symbol, marginMode);
    }
}
