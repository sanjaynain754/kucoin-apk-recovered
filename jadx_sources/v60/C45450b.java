package v60;

import com.kubi.broker.MultiBizType;
import com.kubi.kumex.data.platform.model.GrayCrossModeEntity;
import com.kubi.kumex.data.platform.model.MarginModeInfoEntity;
import com.kubi.kumex.data.platform.model.ModifyMarginModeResultEntity;
import com.kubi.kumex.data.platform.model.SubmitCrossLeverageEntity;
import com.kubi.kumex.data.trade.model.CrossHedgeQtyMarginEntity;
import com.kubi.kumex.data.trade.model.PositionOrderHoldMarginEntity;
import com.kubi.kumex.data.trade.model.QuoteEntity;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import sg.InterfaceC44405b;
import u60.InterfaceC45127a;

/* JADX INFO: renamed from: v60.b */
/* JADX INFO: compiled from: IMultiCrossApiDelegate.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\u000eH\u0016J&\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0015H\u0016J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0016J\u0018\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020$H\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006%"}, m90084d2 = {"Lcom/kubi/unify/unify/cross/delegate/IMultiCrossApiDelegate;", "Lcom/kubi/function/cross/IMultiCrossApi;", "<init>", "()V", "api", "Lcom/kubi/unify/unify/cross/api/ICrossApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/unify/unify/cross/api/ICrossApi;", "api$delegate", "Lkotlin/Lazy;", "fetchCrossModeGray", "Lcom/kubi/kumex/data/platform/model/GrayCrossModeEntity;", "isTrial", "", "symbol", "", "fetchAllContractsMarginMode", "", "Lcom/kubi/kumex/data/trade/model/QuoteEntity;", "fetchMarginMode", "", "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "submitMarginMode", "Lcom/kubi/kumex/data/platform/model/ModifyMarginModeResultEntity;", "map", "submitCrossLeverage", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/platform/model/SubmitCrossLeverageEntity;", "fetchActiveOrderStatistics", "Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMarginEntity;", "symbols", "fetchPosOrderMargin", "Lcom/kubi/kumex/data/trade/model/PositionOrderHoldMarginEntity;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIMultiCrossApiDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IMultiCrossApiDelegate.kt\ncom/kubi/unify/unify/cross/delegate/IMultiCrossApiDelegate\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1193#2,2:86\n1267#2,4:88\n1#3:92\n*S KotlinDebug\n*F\n+ 1 IMultiCrossApiDelegate.kt\ncom/kubi/unify/unify/cross/delegate/IMultiCrossApiDelegate\n*L\n49#1:86,2\n49#1:88,4\n*E\n"})
public final class C45450b implements InterfaceC44405b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f102468a = LazyKt.lazy(new Function0() { // from class: v60.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45450b.m100402a0();
        }
    });

    @Override // sg.InterfaceC44405b
    @NotNull
    /* JADX INFO: renamed from: I0 */
    public GrayCrossModeEntity mo24476I0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new GrayCrossModeEntity(true, CollectionsKt.arrayListOf("CROSS", SharedPositionInfo.MARGIN_MODE_ISOLATED));
    }

    @Override // sg.InterfaceC44405b
    @NotNull
    /* JADX INFO: renamed from: M0 */
    public CrossHedgeQtyMarginEntity mo24478M0(boolean z11, @NotNull String symbols) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        return new CrossHedgeQtyMarginEntity(null, 1, null);
    }

    @Override // sg.InterfaceC44405b
    /* JADX INFO: renamed from: f0 */
    public boolean mo24481f0(boolean z11, @NotNull SubmitCrossLeverageEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        if (z11) {
            return false;
        }
        return C41014a.m89927a(DowngradeExKt.m66536f(m100403x0().m99753c(entity).get("leverage")), DowngradeExKt.m66536f(entity.getLeverage()));
    }

    @Override // sg.InterfaceC44405b
    @NotNull
    /* JADX INFO: renamed from: g1 */
    public ModifyMarginModeResultEntity mo24483g1(boolean z11, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return m100403x0().m99752b(map);
    }

    @Override // sg.InterfaceC44405b
    @NotNull
    /* JADX INFO: renamed from: i0 */
    public Map<String, MarginModeInfoEntity> mo24484i0(boolean z11, @NotNull String symbol) throws Throwable {
        Object next;
        String marginMode;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        List<QuoteEntity> listM99751a = m100403x0().m99751a();
        String str = "CROSS";
        if (listM99751a == null || listM99751a.isEmpty()) {
            return MapsKt.mapOf(TuplesKt.m90091to(symbol, new MarginModeInfoEntity("CROSS", Boolean.FALSE)));
        }
        if (Intrinsics.areEqual(symbol, "ALL")) {
            List<QuoteEntity> listFilterNotNull = CollectionsKt.filterNotNull(listM99751a);
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listFilterNotNull, 10)), 16));
            for (QuoteEntity quoteEntity : listFilterNotNull) {
                String symbol2 = quoteEntity.getSymbol();
                if (symbol2 == null) {
                    symbol2 = "";
                }
                Pair pairM90091to = TuplesKt.m90091to(symbol2, new MarginModeInfoEntity(quoteEntity.getMarginMode(), Boolean.FALSE));
                linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
            }
            return linkedHashMap;
        }
        Iterator it = CollectionsKt.filterNotNull(listM99751a).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((QuoteEntity) next).getSymbol(), symbol));
        QuoteEntity quoteEntity2 = (QuoteEntity) next;
        if (quoteEntity2 != null && (marginMode = quoteEntity2.getMarginMode()) != null) {
            str = marginMode;
        }
        return MapsKt.mapOf(TuplesKt.m90091to(symbol, new MarginModeInfoEntity(str, Boolean.FALSE)));
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.UNIFIED;
    }

    /* JADX INFO: renamed from: x0 */
    public final InterfaceC45127a m100403x0() {
        return (InterfaceC45127a) this.f102468a.getValue();
    }

    /* JADX INFO: renamed from: a0 */
    public static final InterfaceC45127a m100402a0() {
        return (InterfaceC45127a) C42597a.m93391g().create(InterfaceC45127a.class);
    }

    @Override // sg.InterfaceC44405b
    @Nullable
    /* JADX INFO: renamed from: L */
    public Object mo24477L(@NotNull String str, @NotNull Continuation<? super PositionOrderHoldMarginEntity> continuation) {
        return m100403x0().m99754d(str);
    }

    @Override // sg.InterfaceC44405b
    @Nullable
    /* JADX INFO: renamed from: n0 */
    public List<QuoteEntity> mo24485n0(boolean z11) {
        return m100403x0().m99751a();
    }
}
