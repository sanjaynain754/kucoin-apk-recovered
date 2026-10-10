package t60;

import com.appsflyer.AppsFlyerProperties;
import com.kubi.broker.MultiBizType;
import com.kubi.futures.model.setting.KycLeverageEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.unify.entity.UnifyPositionEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p595rg.InterfaceC44079g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import s60.InterfaceC44357a;

/* JADX INFO: renamed from: t60.b */
/* JADX INFO: compiled from: IPositionApiDelegate.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0016R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/unify/unify/common/positon/delegate/IPositionApiDelegate;", "Lcom/kubi/function/common/IMultiPositionApi;", "<init>", "()V", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "api", "Lcom/kubi/unify/unify/common/positon/api/IPositionApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/unify/unify/common/positon/api/IPositionApi;", "api$delegate", "Lkotlin/Lazy;", "closeAllPosition", "", AppsFlyerProperties.CHANNEL, "", "isTrial", "", "fetchPositionBySymbol", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "symbol", "fetchKycLeverage", "Lcom/kubi/futures/model/setting/KycLeverageEntity;", "marginMode", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIPositionApiDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IPositionApiDelegate.kt\ncom/kubi/unify/unify/common/positon/delegate/IPositionApiDelegate\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n1563#2:40\n1634#2,3:41\n*S KotlinDebug\n*F\n+ 1 IPositionApiDelegate.kt\ncom/kubi/unify/unify/common/positon/delegate/IPositionApiDelegate\n*L\n33#1:40\n33#1:41,3\n*E\n"})
public final class C44698b implements InterfaceC44079g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f99479a = LazyKt.lazy(new Function0() { // from class: t60.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C44698b.m98862a0();
        }
    });

    @Override // p595rg.InterfaceC44079g
    @NotNull
    /* JADX INFO: renamed from: B0 */
    public Object mo83153B0(@NotNull String channel, boolean z11) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        return m98863x0().m97856c(MapsKt.mapOf(TuplesKt.m90091to(AppsFlyerProperties.CHANNEL, channel), TuplesKt.m90091to("tradeSource", "0")));
    }

    @Override // p595rg.InterfaceC44079g
    @NotNull
    /* JADX INFO: renamed from: S */
    public List<PositionEntity> mo83155S(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (z11) {
            return CollectionsKt.emptyList();
        }
        List<UnifyPositionEntity> listM97855b = m98863x0().m97855b(symbol);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM97855b, 10));
        Iterator<T> it = listM97855b.iterator();
        while (it.hasNext()) {
            arrayList.add(((UnifyPositionEntity) it.next()).toPositionEntity());
        }
        return arrayList;
    }

    @Override // p595rg.InterfaceC44079g
    @Nullable
    /* JADX INFO: renamed from: a */
    public KycLeverageEntity mo83157a(@NotNull String symbol, @NotNull String marginMode) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(marginMode, "marginMode");
        return m98863x0().m97854a(symbol, marginMode);
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.UNIFIED;
    }

    /* JADX INFO: renamed from: x0 */
    public final InterfaceC44357a m98863x0() {
        return (InterfaceC44357a) this.f99479a.getValue();
    }

    /* JADX INFO: renamed from: a0 */
    public static final InterfaceC44357a m98862a0() {
        return (InterfaceC44357a) C42597a.m93391g().create(InterfaceC44357a.class);
    }
}
