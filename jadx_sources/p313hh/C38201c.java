package p313hh;

import com.kubi.broker.MultiBizType;
import com.kubi.kumex.data.platform.model.AllContractLeverageUpdateRequest;
import com.kubi.kumex.data.platform.model.GrayCrossModeEntity;
import com.kubi.kumex.data.platform.model.MarginModeInfoEntity;
import com.kubi.kumex.data.platform.model.ModifyMarginModeResultEntity;
import com.kubi.kumex.data.platform.model.SubmitCrossLeverageEntity;
import com.kubi.kumex.data.trade.model.CrossHedgeQtyMarginEntity;
import com.kubi.kumex.data.trade.model.QuoteEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import gh.InterfaceC37921b;
import gh.InterfaceC37922c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import sg.InterfaceC44405b;

/* JADX INFO: renamed from: hh.c */
/* JADX INFO: compiled from: ICrossApiDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J&\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00162\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J\u0018\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010 \u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u0017H\u0016J\b\u0010'\u001a\u00020(H\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006)"}, m90084d2 = {"Lcom/kubi/futures/classic/cross/delegate/ICrossApiDelegate;", "Lcom/kubi/function/cross/IMultiCrossApi;", "<init>", "()V", "api", "Lcom/kubi/futures/classic/cross/api/ISelfCrossApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/futures/classic/cross/api/ISelfCrossApi;", "api$delegate", "Lkotlin/Lazy;", "trialApi", "Lcom/kubi/futures/classic/cross/api/ITrialCrossApi;", "getTrialApi", "()Lcom/kubi/futures/classic/cross/api/ITrialCrossApi;", "trialApi$delegate", "fetchAllContractsMarginMode", "", "Lcom/kubi/kumex/data/trade/model/QuoteEntity;", "isTrial", "", "fetchMarginMode", "", "", "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "symbol", "submitMarginMode", "Lcom/kubi/kumex/data/platform/model/ModifyMarginModeResultEntity;", "map", "fetchCrossModeGray", "Lcom/kubi/kumex/data/platform/model/GrayCrossModeEntity;", "submitCrossLeverage", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/platform/model/SubmitCrossLeverageEntity;", "submitAllContractsLeverage", "Lcom/kubi/kumex/data/platform/model/AllContractLeverageUpdateRequest;", "fetchActiveOrderStatistics", "Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMarginEntity;", "symbols", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nICrossApiDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ICrossApiDelegate.kt\ncom/kubi/futures/classic/cross/delegate/ICrossApiDelegate\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n463#2:86\n413#2:87\n1252#3,4:88\n*S KotlinDebug\n*F\n+ 1 ICrossApiDelegate.kt\ncom/kubi/futures/classic/cross/delegate/ICrossApiDelegate\n*L\n43#1:86\n43#1:87\n43#1:88,4\n*E\n"})
public final class C38201c implements InterfaceC44405b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f85899a = LazyKt.lazy(new Function0() { // from class: hh.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C38201c.m86185x0();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f85900b = LazyKt.lazy(new Function0() { // from class: hh.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C38201c.m86183V0();
        }
    });

    @Override // sg.InterfaceC44405b
    /* JADX INFO: renamed from: D */
    public boolean mo24473D(@NotNull AllContractLeverageUpdateRequest entity) throws Throwable {
        Intrinsics.checkNotNullParameter(entity, "entity");
        m86186F0().m85761D(entity);
        return true;
    }

    /* JADX INFO: renamed from: F0 */
    public final InterfaceC37921b m86186F0() {
        return (InterfaceC37921b) this.f85899a.getValue();
    }

    /* JADX INFO: renamed from: T0 */
    public final InterfaceC37922c m86187T0() {
        return (InterfaceC37922c) this.f85900b.getValue();
    }

    @Override // sg.InterfaceC44405b
    /* JADX INFO: renamed from: f0 */
    public boolean mo24481f0(boolean z11, @NotNull SubmitCrossLeverageEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return z11 ? m86187T0().m85770c(entity) : m86186F0().m85765c(entity);
    }

    @Override // sg.InterfaceC44405b
    @NotNull
    /* JADX INFO: renamed from: g1 */
    public ModifyMarginModeResultEntity mo24483g1(boolean z11, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return z11 ? m86187T0().m85769b(map) : m86186F0().m85764b(map);
    }

    @Override // sg.InterfaceC44405b
    @Nullable
    /* JADX INFO: renamed from: n0 */
    public List<QuoteEntity> mo24485n0(boolean z11) {
        return z11 ? m86187T0().m85772f() : m86186F0().m85767g();
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.CLASSIC;
    }

    /* JADX INFO: renamed from: V0 */
    public static final InterfaceC37922c m86183V0() {
        return (InterfaceC37922c) C42597a.m93391g().create(InterfaceC37922c.class);
    }

    /* JADX INFO: renamed from: x0 */
    public static final InterfaceC37921b m86185x0() {
        return (InterfaceC37921b) C42597a.m93391g().create(InterfaceC37921b.class);
    }

    @Override // sg.InterfaceC44405b
    @NotNull
    /* JADX INFO: renamed from: I0 */
    public GrayCrossModeEntity mo24476I0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (z11) {
            return m86187T0().m85771e(symbol);
        }
        return m86186F0().m85766e(symbol);
    }

    @Override // sg.InterfaceC44405b
    @NotNull
    /* JADX INFO: renamed from: M0 */
    public CrossHedgeQtyMarginEntity mo24478M0(boolean z11, @NotNull String symbols) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        if (z11) {
            return m86187T0().m85773h(symbols);
        }
        return m86186F0().m85762E(symbols);
    }

    @Override // sg.InterfaceC44405b
    @NotNull
    /* JADX INFO: renamed from: i0 */
    public Map<String, MarginModeInfoEntity> mo24484i0(boolean z11, @NotNull String symbol) throws Throwable {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (z11) {
            Map<String, String> mapM85768a = m86187T0().m85768a(symbol);
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapM85768a.size()));
            Iterator<T> it = mapM85768a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), new MarginModeInfoEntity((String) entry.getValue(), null, 2, null));
            }
            return linkedHashMap;
        }
        return m86186F0().m85763a(symbol);
    }
}
