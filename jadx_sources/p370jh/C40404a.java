package p370jh;

import com.kubi.broker.MultiBizType;
import com.kubi.kumex.data.trade.model.ClosePositionSizeEntity;
import com.kubi.kumex.data.trade.model.PositionModeEntity;
import com.kubi.kumex.data.trade.model.SubmitAutoDepositEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mh.C42545k;
import org.jetbrains.annotations.NotNull;
import p431lh.C42223c;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import tg.InterfaceC44942a;
import tg.InterfaceC44944c;

/* JADX INFO: renamed from: jh.a */
/* JADX INFO: compiled from: HedgeBizInterfaceImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000bH\u0096\u0001J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096\u0001J\t\u0010\u0017\u001a\u00020\rH\u0096\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0096\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/futures/classic/hedge/HedgeBizInterfaceImpl;", "Lcom/kubi/function/hedge/IHedgeBizInterface;", "Lcom/kubi/function/hedge/IIHedgeAssetsApi;", "api", "<init>", "(Lcom/kubi/function/hedge/IIHedgeAssetsApi;)V", "hedgeServiceImpl", "Lcom/kubi/futures/classic/hedge/service/HedgeServiceImpl;", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "fetchPositionModeAndSave", "", "isTrial", "", "observePositionMode", "Lkotlinx/coroutines/flow/Flow;", "getPositionModeFromCache", "fetchHedgeAutoDepositMargin", "", "Lcom/kubi/kumex/data/trade/model/AutoDepositStatusEntity;", "symbol", "fetchHedgeClosePositionSize", "Lcom/kubi/kumex/data/trade/model/ClosePositionSizeEntity;", "hedgeFeatureAvailable", "submitHedgeAutoDepositMargin", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/trade/model/SubmitAutoDepositEntity;", "submitPositionMode", "Lcom/kubi/kumex/data/trade/model/PositionModeEntity;", "positionMode", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40404a implements InterfaceC44942a, InterfaceC44944c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC44944c f89710a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final C42545k f89711b;

    /* JADX WARN: Multi-variable type inference failed */
    public C40404a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C40404a(@NotNull InterfaceC44944c api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.f89710a = api;
        this.f89711b = new C42545k();
    }

    @Override // tg.InterfaceC44944c
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public PositionModeEntity mo89032F0(boolean z11, @NotNull PositionModeEntity positionMode) {
        Intrinsics.checkNotNullParameter(positionMode, "positionMode");
        return this.f89710a.mo89032F0(z11, positionMode);
    }

    @Override // tg.InterfaceC44944c
    @NotNull
    /* JADX INFO: renamed from: T0 */
    public Object mo89033T0(boolean z11, @NotNull SubmitAutoDepositEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return this.f89710a.mo89033T0(z11, entity);
    }

    @Override // tg.InterfaceC44944c
    /* JADX INFO: renamed from: U */
    public boolean mo89034U() {
        return this.f89710a.mo89034U();
    }

    @Override // tg.InterfaceC44943b
    @NotNull
    /* JADX INFO: renamed from: V0 */
    public String mo89035V0(boolean z11) {
        return this.f89711b.mo89035V0(z11);
    }

    @Override // tg.InterfaceC44943b
    @NotNull
    /* JADX INFO: renamed from: a0 */
    public String mo89037a0(boolean z11) {
        return this.f89711b.mo89037a0(z11);
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.CLASSIC;
    }

    @Override // tg.InterfaceC44943b
    @NotNull
    /* JADX INFO: renamed from: x0 */
    public InterfaceC41634e<String> mo89038x0(boolean z11) {
        return this.f89711b.mo89038x0(z11);
    }

    @Override // tg.InterfaceC44944c
    @NotNull
    /* JADX INFO: renamed from: W0 */
    public List<ClosePositionSizeEntity> mo89036W0(@NotNull String symbol, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f89710a.mo89036W0(symbol, z11);
    }

    public /* synthetic */ C40404a(InterfaceC44944c interfaceC44944c, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new C42223c() : interfaceC44944c);
    }
}
