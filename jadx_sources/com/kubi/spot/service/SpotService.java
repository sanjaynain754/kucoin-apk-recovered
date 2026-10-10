package com.kubi.spot.service;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.gson.reflect.TypeToken;
import com.kubi.alpha.AlphaFragmentWrap;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.core.biz.offline.SymbolsOfflineManager;
import com.kubi.data.entity.MaintenanceEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.flutter.widget.kline.C12803q;
import com.kubi.kucoin.quote.market.KuCoinMarketActivity;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.spot.R$string;
import com.kubi.spot.api.ISpotService;
import com.kubi.spot.business.BaseTradeFragment;
import com.kubi.spot.business.ITradeParentBehavior;
import com.kubi.spot.business.SpotTradeFragment;
import com.kubi.spot.business.market.QuoteModel;
import com.kubi.spot.business.newCoin.NewCoinHelper;
import com.kubi.spot.entity.MarketsEntity;
import com.kubi.spot.helper.MarketHelper;
import com.kubi.spot.helper.TradeManager;
import com.kubi.spot.kline.flutter.SpotFlutterKlineLandscapeActivity;
import com.kubi.spot.quote.market.TradeListModel;
import com.kubi.tradebase.business.klineSettings.KLineSettingConfig;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import e20.InterfaceC37053d;
import f00.C37304a;
import f30.C37330a;
import g00.InterfaceC37762n;
import id.C38519a;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: SpotService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00140\u0013H\u0017J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J.\u0010\u0019\u001a\u00020\u001a2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001c2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001fH\u0016J\u001e\u0010 \u001a\u00020\u001a2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001cH\u0016J\u0012\u0010!\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u000eH\u0016J\u0010\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0016H\u0016J\u0010\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u0016H\u0016J,\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0+2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000eH\u0016J$\u00100\u001a\u00020\u00112\u0006\u00101\u001a\u0002022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u001cH\u0016J$\u00104\u001a\u00020\u00112\b\u00105\u001a\u0004\u0018\u0001062\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u000eH\u0016J\u001e\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0,0+2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0018\u0010<\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\fH\u0016J\u001e\u0010>\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020@0?j\b\u0012\u0004\u0012\u00020@`A0+H\u0016J\u0010\u0010B\u001a\n\u0012\u0006\b\u0001\u0012\u00020D0CH\u0016J\b\u0010E\u001a\u00020\u000eH\u0016J,\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00140+2\u0006\u0010G\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\f2\u0006\u0010I\u001a\u00020\u000eH\u0016JA\u0010J\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010K\u001a\u0004\u0018\u00010\u00182\b\u00109\u001a\u0004\u0018\u00010\u000e2\u0014\u0010L\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001cH\u0016¢\u0006\u0002\u0010MJ\u0010\u0010N\u001a\u00020\f2\u0006\u0010O\u001a\u000208H\u0016J\u0010\u0010P\u001a\u00020\f2\u0006\u0010O\u001a\u000208H\u0016J\u0018\u0010Q\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00162\u0006\u0010O\u001a\u000208H\u0016J\u000e\u0010R\u001a\b\u0012\u0004\u0012\u00020\f0SH\u0016J\b\u0010T\u001a\u00020\u0016H\u0016J8\u0010U\u001a\u00020\u00112\u0006\u0010V\u001a\u0002062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\f2\u0006\u0010X\u001a\u00020\f2\u0006\u0010Y\u001a\u00020\f2\u0006\u0010Z\u001a\u00020\u000eH\u0016J\b\u0010[\u001a\u00020\u0018H\u0016J\u0010\u0010\\\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010]\u001a\u00020\fH\u0016J\u0010\u0010^\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$H\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006_"}, m90084d2 = {"Lcom/kubi/spot/service/SpotService;", "Lcom/kubi/spot/api/ISpotService;", "<init>", "()V", "marketApi", "Lcom/kubi/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "getMarketApi", "()Lcom/kubi/spot/api/MarketApi;", "marketApi$delegate", "Lkotlin/Lazy;", "isMaintenance", "", "symbol", "", "allowCancelOrder", "getMarkets", "", "consumer", "Lio/reactivex/functions/Consumer;", "", "getSpotTradeFragment", "Lcom/kubi/sdk/BaseFragment;", "getSpotType", "", "getMaintenanceStatus", "Lio/reactivex/disposables/Disposable;", "complete", "Lkotlin/Function1;", "Lcom/kubi/data/entity/MaintenanceEntity;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lkotlin/Function0;", "getCDNMaintenanceStatus", "getMaintenance", "refreshButtonStatus", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "getTradingPageId", "baseTradeFragmentScrollToTop", "fragment", "isBaseTradeFragment", "currentFragment", "getPreviewInfo", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/data/entity/SymbolPreviewEntity;", FirebaseAnalytics.Param.CURRENCY, "lang", "bindFlowEvent", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "block", "toMarketReady", "context", "Landroid/content/Context;", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "spmId", "addFavorSymbol", "", "toSpotTradeTab", "isBuy", "getTabDataList", "Ljava/util/ArrayList;", "Lcom/kubi/spot/entity/MarketsEntity;", "Lkotlin/collections/ArrayList;", "getKuCoinMarketActivity", "Ljava/lang/Class;", "Landroid/app/Activity;", "actionWidgetDeskItem", "getMarketList", "market", "isMarket", "from", "handleSymbolClick", "fromType", TUIConstants.TUIChat.CALL_BACK, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "isSymbolCallAuction", "item", "canReserveNewCoin", "reserveNewCoin", "getLastTradeIsIsolated", "Lcom/kubi/utils/storage/StorageId;", "getAlphaTradeFragment", "jump2SpotHorizontalKlinePage", "ctx", "showHistoryOrder", "showActivityOrder", "isFrom", "klineType", "getAlphaType", "isInOfflineEffect", "isOpenMarginStructuralMerge", "showBuySellRatioDialogTip", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotService.kt\ncom/kubi/spot/service/SpotService\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 6 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,265:1\n32#2:266\n23#2,2:293\n1563#3:267\n1634#3,3:268\n808#3,11:271\n1869#3,2:282\n1563#3:295\n1634#3,3:296\n81#4,2:284\n35#5,4:286\n39#5:292\n44#6,2:290\n*S KotlinDebug\n*F\n+ 1 SpotService.kt\ncom/kubi/spot/service/SpotService\n*L\n79#1:266\n90#1:293,2\n85#1:267\n85#1:268,3\n123#1:271,11\n124#1:282,2\n91#1:295\n91#1:296,3\n151#1:284,2\n253#1:286,4\n253#1:292\n253#1:290,2\n*E\n"})
public final class SpotService implements ISpotService {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f51243b = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.service.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotService.m63029Q();
        }
    });

    /* JADX INFO: renamed from: com.kubi.spot.service.SpotService$a */
    /* JADX INFO: compiled from: SpotService.kt */
    /* JADX INFO: loaded from: classes47.dex */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m90084d2 = {"com/kubi/spot/service/SpotService$getMarkets$list$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/kubi/spot/entity/MarketsEntity;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25835a extends TypeToken<List<? extends MarketsEntity>> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.service.SpotService$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes47.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C25836b extends TypeToken<Boolean> {
    }

    @Override // com.kubi.spot.api.ISpotService
    /* JADX INFO: renamed from: q */
    public int mo60004q() {
        return 0;
    }

    @Override // com.kubi.spot.api.ISpotService
    /* JADX INFO: renamed from: w */
    public int mo60010w() {
        return 6;
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m63025M(Consumer consumer, ArrayList arrayList) throws Exception {
        C46392a.m102333p(C38519a.f86479a.m87127b(), C27099x.m66919i(arrayList, false, 2, null));
        Intrinsics.checkNotNull(arrayList);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((MarketsEntity) it.next()).getName());
        }
        consumer.accept(arrayList2);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.spot.api.ISpotService
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: B */
    public void mo59985B(@NotNull final Consumer<List<String>> consumer) throws Exception {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        String strM102326h = C46392a.m102326h(C38519a.f86479a.m87127b(), "");
        if (TextUtils.isEmpty(strM102326h)) {
            Observable<R> observableCompose = m63030L().m82949q().compose(C24217a1.m58389m());
            final Function1 function1 = new Function1() { // from class: com.kubi.spot.service.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SpotService.m63025M(consumer, (ArrayList) obj);
                }
            };
            Consumer consumer2 = new Consumer() { // from class: com.kubi.spot.service.e
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SpotService.m63026N(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.spot.service.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SpotService.m63027O(consumer, (Throwable) obj);
                }
            };
            observableCompose.subscribe(consumer2, new Consumer() { // from class: com.kubi.spot.service.g
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SpotService.m63028P(function2, obj);
                }
            });
            return;
        }
        List list = (List) C27099x.m66914d(strM102326h, new C25835a().getType());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((MarketsEntity) it.next()).getName());
        }
        consumer.accept(arrayList);
    }

    @Override // com.kubi.spot.api.ISpotService
    /* JADX INFO: renamed from: C */
    public void mo59986C(@NotNull FragmentManager childFragmentManager) {
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        List<Fragment> fragments = childFragmentManager.getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof ITradeParentBehavior) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ITradeParentBehavior) it.next()).mo60309f0();
        }
    }

    @Override // com.kubi.spot.api.ISpotService
    @NotNull
    /* JADX INFO: renamed from: D */
    public StorageId<Boolean> mo59987D() {
        return C38519a.f86479a.m87134i();
    }

    @Override // com.kubi.spot.api.ISpotService
    /* JADX INFO: renamed from: E */
    public boolean mo59988E() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C25836b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("is_open_margin_structural_merge", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    @Override // com.kubi.spot.api.ISpotService
    @NotNull
    /* JADX INFO: renamed from: F */
    public BaseFragment mo59989F() {
        return new AlphaFragmentWrap();
    }

    /* JADX INFO: renamed from: L */
    public final InterfaceC37053d m63030L() {
        return (InterfaceC37053d) this.f51243b.getValue();
    }

    @Override // com.kubi.spot.api.ISpotService
    @NotNull
    /* JADX INFO: renamed from: a */
    public Disposable mo59990a(@Nullable Function1<? super MaintenanceEntity, Unit> function1, @Nullable Function0<Unit> function0) {
        return TradeManager.f50593a.m61842q(function1, function0);
    }

    @Override // com.kubi.spot.api.ISpotService
    @NotNull
    /* JADX INFO: renamed from: b */
    public Observable<List<TradeItemBean>> mo59991b(@NotNull String market, boolean z11, @NotNull String from) {
        Intrinsics.checkNotNullParameter(market, "market");
        Intrinsics.checkNotNullParameter(from, "from");
        return TradeListModel.m62518e(new TradeListModel(), market, z11, from, null, 8, null);
    }

    @Override // com.kubi.spot.api.ISpotService
    /* JADX INFO: renamed from: c */
    public boolean mo59992c(@Nullable String str) {
        return TradeManager.f50593a.m61840o(str);
    }

    @Override // com.kubi.spot.api.ISpotService
    /* JADX INFO: renamed from: e */
    public boolean mo59993e(@NotNull BaseFragment currentFragment) {
        Intrinsics.checkNotNullParameter(currentFragment, "currentFragment");
        return currentFragment instanceof BaseTradeFragment;
    }

    @Override // com.kubi.spot.api.ISpotService
    /* JADX INFO: renamed from: f */
    public boolean mo59994f(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return SymbolsOfflineManager.f20563a.m22083e(symbol);
    }

    @Override // com.kubi.spot.api.ISpotService
    /* JADX INFO: renamed from: h */
    public boolean mo59995h(@Nullable String str) {
        return TradeManager.f50593a.m61837h(str);
    }

    @Override // com.kubi.spot.api.ISpotService
    /* JADX INFO: renamed from: i */
    public boolean mo59996i(@NotNull TradeItemBean item) {
        Intrinsics.checkNotNullParameter(item, "item");
        CallAuctionSwitch callAuctionSwitch = CallAuctionSwitch.f20317a;
        return callAuctionSwitch.m21637c() && callAuctionSwitch.m21643j(item, false);
    }

    @Override // com.kubi.spot.api.ISpotService
    @NotNull
    /* JADX INFO: renamed from: j */
    public String mo59997j() {
        return "B5trading";
    }

    @Override // com.kubi.spot.api.ISpotService
    /* JADX INFO: renamed from: k */
    public void mo59998k(@Nullable Context context, @NotNull TradeItemBean tradeItemBean, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
        InterfaceC37762n.a.m85177a(C37304a.f82764a, tradeItemBean.getSymbol(), str, null, null, 12, null);
    }

    @Override // com.kubi.spot.api.ISpotService
    @NotNull
    /* JADX INFO: renamed from: l */
    public Class<? extends Activity> mo59999l() {
        return KuCoinMarketActivity.class;
    }

    @Override // com.kubi.spot.api.ISpotService
    /* JADX INFO: renamed from: m */
    public boolean mo60000m(@NotNull TradeItemBean item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return NewCoinHelper.f50279a.m61280c(item);
    }

    @Override // com.kubi.spot.api.ISpotService
    /* JADX INFO: renamed from: n */
    public void mo60001n(@NotNull String symbol, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        C37330a.m83910b(symbol, z11, mo60004q());
    }

    @Override // com.kubi.spot.api.ISpotService
    /* JADX INFO: renamed from: o */
    public void mo60002o(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (fragment instanceof BaseTradeFragment) {
            ((BaseTradeFragment) fragment).m60209r6();
        }
    }

    @Override // com.kubi.spot.api.ISpotService
    @NotNull
    /* JADX INFO: renamed from: p */
    public Observable<ArrayList<MarketsEntity>> mo60003p() {
        return new QuoteModel().m61187k();
    }

    @Override // com.kubi.spot.api.ISpotService
    @NotNull
    /* JADX INFO: renamed from: r */
    public BaseFragment mo60005r() {
        return new SpotTradeFragment();
    }

    @Override // com.kubi.spot.api.ISpotService
    /* JADX INFO: renamed from: s */
    public void mo60006s(@NotNull FragmentManager childFragmentManager) {
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.trade_orderbook_title).m54153J4(R$string.trade_orderbook_content).m54162S4(R$string.already_know, null).show(childFragmentManager, "BuySellRatioDialogTipFragmentHelper");
    }

    @Override // com.kubi.spot.api.ISpotService
    /* JADX INFO: renamed from: t */
    public void mo60007t(@NotNull Context ctx, @NotNull String symbol, boolean z11, boolean z12, boolean z13, @NotNull String klineType) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(klineType, "klineType");
        TradeItemBean tradeItemBean = new TradeItemBean(symbol);
        Intent intent = new Intent(ctx, (Class<?>) SpotFlutterKlineLandscapeActivity.class);
        intent.putExtra("data", tradeItemBean);
        intent.putExtra("isFrom", z13);
        C12803q.m24369a(intent, symbol, klineType);
        intent.putExtra("data_4", new KLineSettingConfig(z11, z12));
        intent.setFlags(268435456);
        ctx.startActivity(intent);
    }

    @Override // com.kubi.spot.api.ISpotService
    /* JADX INFO: renamed from: u */
    public boolean mo60008u(@Nullable String str) {
        return TradeManager.f50593a.m61840o(str);
    }

    @Override // com.kubi.spot.api.ISpotService
    /* JADX INFO: renamed from: v */
    public void mo60009v(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable Function1<? super TradeItemBean, Unit> function1) {
        MarketHelper.f50590a.m61822g(str, num, str2, function1);
    }

    @Override // com.kubi.spot.api.ISpotService
    /* JADX INFO: renamed from: x */
    public void mo60011x(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super String, Unit> block) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(block, "block");
        if (C12573b.f21598a.m23696a()) {
            "NOTIFY_MAINTENANCE".length();
        }
        C12572a.m23692a(lifecycleOwner, false, new SpotService$bindFlowEvent$$inlined$bindFlowEvent$1("NOTIFY_MAINTENANCE", block, null));
    }

    @Override // com.kubi.spot.api.ISpotService
    @NotNull
    /* JADX INFO: renamed from: y */
    public Disposable mo60012y(@Nullable Function1<? super MaintenanceEntity, Unit> function1) {
        return TradeManager.f50593a.m61839j(function1);
    }

    @Override // com.kubi.spot.api.ISpotService
    @NotNull
    /* JADX INFO: renamed from: z */
    public String mo60013z() {
        return "action_widget_desk_item";
    }

    /* JADX INFO: renamed from: N */
    public static final void m63026N(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m63027O(Consumer consumer, Throwable th2) throws Exception {
        th2.printStackTrace();
        consumer.accept(CollectionsKt.emptyList());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P */
    public static final void m63028P(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q */
    public static final InterfaceC37053d m63029Q() {
        return (InterfaceC37053d) C42597a.m93386b().create(InterfaceC37053d.class);
    }

    @Override // com.kubi.spot.api.ISpotService
    @NotNull
    public Observable<BaseEntity<Object>> addFavorSymbol(@Nullable String symbol) {
        return m63030L().addFavorSymbol(symbol);
    }
}
