package com.kubi.market.monitor.lib.p100ui.floating;

import android.graphics.Point;
import aq.C4373b;
import com.blankj.utilcode.util.C5288p;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kucoin.feature.widget.appwidget.WidgetRefreshService;
import com.kubi.market.monitor.lib.entity.MarketFloatingWindowConfig;
import com.kubi.market.monitor.lib.exeption.MarketMonitorException;
import com.kubi.market.monitor.lib.p100ui.floating.window.FloatingActionManager;
import com.kubi.utils.C27099x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p265fl.C37565d;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: FloatingWindowConfigManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0012\u001a\u00020\u0013J\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0005H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\rH\u0002J\u0006\u0010\u0019\u001a\u00020\u0015J\u001f\u0010\u001a\u001a\u00020\u00152\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u001c¢\u0006\u0002\b\u001dJ\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0013J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\rH\u0002J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050!J\u000e\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0005J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0005H\u0002J\u000e\u0010%\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0005J\u0006\u0010&\u001a\u00020\u0013J\"\u0010'\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010(j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`)H\u0086@¢\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020\u0005J\u0014\u0010,\u001a\u00020\u00152\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050!J\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050!J\u0006\u0010/\u001a\u00020\u0005J\u0014\u00100\u001a\u00020\u00152\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050!J\u0006\u00102\u001a\u000203J\u000e\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u000203R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u00066"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;", "", "<init>", "()V", "LOG_TAG", "", "market_floating_window_config", "category_market_floating_window", "NEWFLOATING_SYMBOLS_LIST_DATA_KEY", "TRACKING_SYMBOLS_KEY", "Lcom/kubi/utils/storage/StorageId;", "FLOATING_LAST_POSITION_KEY", "config", "Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;", "getConfig", "()Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;", "setConfig", "(Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;)V", "getOldFloatingWindowSwitch", "", "log", "", "saveOldFloatingWindowSwitch", "switch", "initMarketFloatingWindowConfig", "init", "updateMarketFloatingWindowConfig", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "updateFloatingWindowSwitch", "saveMarketFloatingWindowConfig", "getNewSymbolList", "", "addOrRemoveSymbol", "symbol", "addSymbol", "removeSymbol", "canShowFloatingWindow", "getSymbolsListData", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSymbolsString", "saveSymbolsListData", "newListData", "getOldSymbolList", "getOldSymbolListString", "saveOldSymbolList", "list", "getFloatingPoint", "Landroid/graphics/Point;", "cacheFloatingPoint", "point", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFloatingWindowConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingWindowConfigManager.kt\ncom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 JsonEx.kt\ncom/kubi/mvi/common/JsonExKt\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 5 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 6 MarketMonitorIssue.kt\ncom/kubi/market/monitor/lib/exeption/MarketMonitorIssueKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 CommonUtils.kt\ncom/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt\n*L\n1#1,302:1\n135#2,2:303\n126#2,2:305\n32#2:355\n23#2,2:359\n32#2:361\n23#2,2:362\n36#3:307\n36#3:316\n36#3:349\n137#4,5:308\n137#4,5:317\n196#4,3:327\n137#4,5:350\n35#5,3:313\n35#5,3:356\n45#6,4:322\n45#6,4:344\n1#7:326\n63#8,14:330\n78#8:348\n*S KotlinDebug\n*F\n+ 1 FloatingWindowConfigManager.kt\ncom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager\n*L\n72#1:303,2\n86#1:305,2\n261#1:355\n269#1:359,2\n277#1:361\n294#1:362,2\n96#1:307\n152#1:316\n252#1:349\n96#1:308,5\n152#1:317,5\n218#1:327,3\n252#1:350,5\n139#1:313,3\n269#1:356,3\n198#1:322,4\n239#1:344,4\n239#1:330,14\n239#1:348\n*E\n"})
public final class FloatingWindowConfigManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FloatingWindowConfigManager f34272a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final String f34273b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final StorageId<String> f34274c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final StorageId<String> f34275d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static MarketFloatingWindowConfig f34276e;

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.FloatingWindowConfigManager$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes27.dex */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/mvi/common/JsonExKt$convertToObj$$inlined$fromJSONOrNull$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C18598a extends TypeToken<List<? extends String>> {
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.FloatingWindowConfigManager$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/mvi/common/JsonExKt$convertToObj$$inlined$fromJSONOrNull$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C18599b extends TypeToken<MarketFloatingWindowConfig> {
    }

    static {
        FloatingWindowConfigManager floatingWindowConfigManager = new FloatingWindowConfigManager();
        f34272a = floatingWindowConfigManager;
        f34273b = "FloatingWindowConfigManager";
        f34274c = new StorageId<>("CATE_KV_MARKET_MONITOR", "tracking_symbols_key_list_data", null, false, 12, null);
        f34275d = new StorageId<>("CATE_KV_MARKET_MONITOR", "floating_last_position_key", null, false, 12, null);
        f34276e = floatingWindowConfigManager.m40738o();
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m40724r(String str, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it, str);
    }

    /* JADX INFO: renamed from: x */
    public static final MarketFloatingWindowConfig m40725x(boolean z11, MarketFloatingWindowConfig updateMarketFloatingWindowConfig) {
        Intrinsics.checkNotNullParameter(updateMarketFloatingWindowConfig, "$this$updateMarketFloatingWindowConfig");
        return updateMarketFloatingWindowConfig.copy((16382 & 1) != 0 ? updateMarketFloatingWindowConfig.isShow : z11, (16382 & 2) != 0 ? updateMarketFloatingWindowConfig.theme : 0, (16382 & 4) != 0 ? updateMarketFloatingWindowConfig.floatingWindowBgAlpha : 0, (16382 & 8) != 0 ? updateMarketFloatingWindowConfig.dataUpdateIntervalTime : 0, (16382 & 16) != 0 ? updateMarketFloatingWindowConfig.displayMode : 0, (16382 & 32) != 0 ? updateMarketFloatingWindowConfig.autoScrollTime : 0, (16382 & 64) != 0 ? updateMarketFloatingWindowConfig.pageTurningTime : 0, (16382 & 128) != 0 ? updateMarketFloatingWindowConfig.pagingMode : 0, (16382 & 256) != 0 ? updateMarketFloatingWindowConfig.pageSize : 0, (16382 & 512) != 0 ? updateMarketFloatingWindowConfig.actionBarShow : false, (16382 & 1024) != 0 ? updateMarketFloatingWindowConfig.currencyNameShow : false, (16382 & 2048) != 0 ? updateMarketFloatingWindowConfig.quoteChangeShow : false, (16382 & 4096) != 0 ? updateMarketFloatingWindowConfig.priceShow : false, (16382 & 8192) != 0 ? updateMarketFloatingWindowConfig.textSizeMode : 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m40726c(@NotNull String symbol) throws Throwable {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (m40732i().contains(symbol)) {
            m40740q(symbol);
        } else {
            m40727d(symbol);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m40728e(@NotNull Point point) {
        Intrinsics.checkNotNullParameter(point, "point");
        StorageId<String> storageId = f34275d;
        String strM6348j = C5288p.m6348j(point);
        Intrinsics.checkNotNullExpressionValue(strM6348j, "toJson(...)");
        C46392a.m102333p(storageId, strM6348j);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m40729f() {
        return f34276e.isShow() && !C37565d.f83517a.m84598d();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final MarketFloatingWindowConfig m40730g() {
        return f34276e;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Point m40731h() {
        String strM102326h = C46392a.m102326h(f34275d, "");
        if (strM102326h == null || strM102326h.length() == 0) {
            return new Point(0, 0);
        }
        try {
            Object objM6342d = C5288p.m6342d(strM102326h, Point.class);
            Intrinsics.checkNotNullExpressionValue(objM6342d, "fromJson(...)");
            return (Point) objM6342d;
        } catch (Exception unused) {
            return new Point(0, 0);
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m40733j() {
        boolean zM102322d = C46392a.m102322d(C37565d.f83517a.m84600f(), false);
        f34272a.m40739p("getOldFloatingWindowSwitch:" + zM102322d);
        return zM102322d;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final String m40734k() {
        return C46392a.m102326h(f34274c, "");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: l */
    public final Object m40735l(@NotNull Continuation<? super ArrayList<String>> continuation) {
        FloatingWindowConfigManager$getSymbolsListData$1 floatingWindowConfigManager$getSymbolsListData$1;
        if (continuation instanceof FloatingWindowConfigManager$getSymbolsListData$1) {
            floatingWindowConfigManager$getSymbolsListData$1 = (FloatingWindowConfigManager$getSymbolsListData$1) continuation;
            int i11 = floatingWindowConfigManager$getSymbolsListData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                floatingWindowConfigManager$getSymbolsListData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                floatingWindowConfigManager$getSymbolsListData$1 = new FloatingWindowConfigManager$getSymbolsListData$1(this, continuation);
            }
        } else {
            floatingWindowConfigManager$getSymbolsListData$1 = new FloatingWindowConfigManager$getSymbolsListData$1(this, continuation);
        }
        Object obj = floatingWindowConfigManager$getSymbolsListData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = floatingWindowConfigManager$getSymbolsListData$1.label;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            String strM40736m = m40736m();
            if (strM40736m.length() == 0) {
                return null;
            }
            C27099x c27099x = C27099x.f54458a;
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C18600xb154433e(strM40736m, null)), C42911a.m94120b());
            floatingWindowConfigManager$getSymbolsListData$1.L$0 = SpillingKt.nullOutSpilledVariable(strM40736m);
            floatingWindowConfigManager$getSymbolsListData$1.L$1 = SpillingKt.nullOutSpilledVariable(c27099x);
            floatingWindowConfigManager$getSymbolsListData$1.L$2 = SpillingKt.nullOutSpilledVariable(strM40736m);
            floatingWindowConfigManager$getSymbolsListData$1.I$0 = 0;
            floatingWindowConfigManager$getSymbolsListData$1.label = 1;
            Object objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, floatingWindowConfigManager$getSymbolsListData$1);
            return objM90914f0 == coroutine_suspended ? coroutine_suspended : objM90914f0;
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final String m40736m() {
        return C46392a.m102326h(new StorageId("category_market_floating_window", "newfloating_tracking_symbols_list_data_key", null, false, 12, null), m40734k());
    }

    /* JADX INFO: renamed from: n */
    public final void m40737n() {
        C37565d c37565d = C37565d.f83517a;
        c37565d.m84603i().clear();
        c37565d.m84603i().addAll(m40732i());
    }

    /* JADX INFO: renamed from: o */
    public final MarketFloatingWindowConfig m40738o() {
        Object objM66914d;
        String strM102326h = C46392a.m102326h(new StorageId("category_market_floating_window", "market_floating_window_config", null, false, 12, null), "");
        try {
            C27099x c27099x = C27099x.f54458a;
            objM66914d = C27099x.m66914d(strM102326h, new C18599b().getType());
        } catch (Throwable th2) {
            C43846g.m96569d(th2, "GsonUtils", null, 4, null);
            objM66914d = null;
        }
        MarketFloatingWindowConfig marketFloatingWindowConfig = (MarketFloatingWindowConfig) objM66914d;
        if (marketFloatingWindowConfig != null) {
            f34272a.m40739p("initMarketFloatingWindowConfig:" + marketFloatingWindowConfig);
            return marketFloatingWindowConfig;
        }
        MarketFloatingWindowConfig marketFloatingWindowConfig2 = new MarketFloatingWindowConfig(false, 0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 16383, null);
        f34272a.m40739p("create default MarketFloatingWindowConfig:" + marketFloatingWindowConfig2);
        return marketFloatingWindowConfig2;
    }

    /* JADX INFO: renamed from: p */
    public final void m40739p(String str) {
        C44128b.m97259c(f34273b, str);
    }

    /* JADX INFO: renamed from: q */
    public final void m40740q(@NotNull final String symbol) throws Throwable {
        Object obj;
        boolean zAreEqual;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        List<String> mutableList = CollectionsKt.toMutableList((Collection) m40732i());
        CollectionsKt.removeAll((List) mutableList, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(FloatingWindowConfigManager.m40724r(symbol, (String) obj2));
            }
        });
        m40744v(mutableList);
        C37565d.f83517a.m84603i().remove(symbol);
        List<TradeItemBean> tradeLists = WidgetRefreshService.f27799g.getTradeLists();
        Iterator<T> it = tradeLists.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                zAreEqual = Intrinsics.areEqual(symbol, ((TradeItemBean) next).getSymbol());
            } catch (Throwable th2) {
                if (!C42899b.m94075e(th2)) {
                    C43846g.m96568c(new MarketMonitorException(th2, "FloatingWindowConfigManager", false, null, 8, null), null, 2, null);
                }
                zAreEqual = false;
            }
            if (zAreEqual) {
                obj = next;
                break;
            }
        }
        TradeItemBean tradeItemBean = (TradeItemBean) obj;
        if (tradeItemBean != null) {
            tradeLists.remove(tradeItemBean);
        }
        FloatingActionManager.f34540a.m41353X0(symbol);
    }

    /* JADX INFO: renamed from: s */
    public final void m40741s(MarketFloatingWindowConfig marketFloatingWindowConfig) {
        String strM66919i;
        StorageId storageId = new StorageId("category_market_floating_window", "market_floating_window_config", null, false, 12, null);
        if (marketFloatingWindowConfig == null || (strM66919i = C27099x.m66919i(marketFloatingWindowConfig, false, 2, null)) == null) {
            strM66919i = "";
        }
        C46392a.m102333p(storageId, strM66919i);
    }

    /* JADX INFO: renamed from: t */
    public final void m40742t(boolean z11) {
        C46392a.m102328k(C37565d.f83517a.m84600f(), z11);
    }

    /* JADX INFO: renamed from: u */
    public final void m40743u(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        StorageId<String> storageId = f34274c;
        String strM66919i = C27099x.m66919i(list, false, 2, null);
        if (strM66919i == null) {
            strM66919i = "";
        }
        C46392a.m102333p(storageId, strM66919i);
    }

    /* JADX INFO: renamed from: v */
    public final void m40744v(@NotNull List<String> newListData) throws Throwable {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(newListData, "newListData");
        boolean zM3900b = C4373b.m3900b();
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(C46392a.m102333p(new StorageId("category_market_floating_window", "newfloating_tracking_symbols_list_data_key", null, false, 12, null), C27099x.m66919i(newListData, false, 2, null)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (!zM3900b || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                throw thM103847exceptionOrNullimpl;
            }
            if (C42899b.m94075e(thM103847exceptionOrNullimpl)) {
                return;
            }
            C43846g.m96568c(new MarketMonitorException(thM103847exceptionOrNullimpl, "market_monitor_issue", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m40745w(final boolean z11) {
        m40746y(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowConfigManager.m40725x(z11, (MarketFloatingWindowConfig) obj);
            }
        });
        m40742t(z11);
    }

    /* JADX INFO: renamed from: y */
    public final void m40746y(@NotNull Function1<? super MarketFloatingWindowConfig, MarketFloatingWindowConfig> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MarketFloatingWindowConfig marketFloatingWindowConfigInvoke = block.invoke(f34276e);
        f34276e = marketFloatingWindowConfigInvoke;
        m40741s(marketFloatingWindowConfigInvoke);
    }

    /* JADX INFO: renamed from: d */
    public final void m40727d(String str) throws Throwable {
        List<String> mutableList = CollectionsKt.toMutableList((Collection) m40732i());
        mutableList.add(str);
        m40744v(mutableList);
        FloatingActionManager.f34540a.m41360c0(str);
        C37565d.f83517a.m84603i().add(str);
        WidgetRefreshService.f27799g.getTradeLists().add(new TradeItemBean(str));
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final List<String> m40732i() {
        Object objM66914d;
        String strM40736m = m40736m();
        if (strM40736m.length() == 0) {
            return CollectionsKt.emptyList();
        }
        try {
            C27099x c27099x = C27099x.f54458a;
            objM66914d = C27099x.m66914d(strM40736m, new C18598a().getType());
        } catch (Throwable th2) {
            C43846g.m96569d(th2, "GsonUtils", null, 4, null);
            objM66914d = null;
        }
        List<String> list = (List) objM66914d;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        return list;
    }
}
