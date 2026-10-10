package com.kubi.mart.sidebar.spot.tablist;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.mart.entity.SpotMenuModel;
import com.kubi.mart.sidebar.spot.helper.SortType;
import com.kubi.mart.sidebar.spot.helper.SpotWsHelper;
import com.kubi.mart.sidebar.spot.tablist.data.ITabListGet;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27039d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SpotSidebarTabVM.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0094@¢\u0006\u0002\u0010\u001aJ(\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0!2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u001a\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u001d2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010$\u001a\u00020\u0017H\u0016J\b\u0010%\u001a\u00020\u0017H\u0016J\u0012\u0010&\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0!*\b\u0012\u0004\u0012\u00020\f0!H\u0002R\u0014\u0010\u0005\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIState;", "<init>", "()V", "initState", "getInitState", "()Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIState;", "menuModel", "Lcom/kubi/mart/entity/SpotMenuModel;", "orgList", "", "Lcom/kubi/data/entity/TradeItemBean;", "uiShowList", "wsHelper", "Lcom/kubi/mart/sidebar/spot/helper/SpotWsHelper;", "getWsHelper", "()Lcom/kubi/mart/sidebar/spot/helper/SpotWsHelper;", "wsHelper$delegate", "Lkotlin/Lazy;", "sortType", "Lcom/kubi/mart/sidebar/spot/helper/SortType;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTabList", "sidebarType", "", "symbolCode", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/mart/entity/SpotMenuModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSubTabs", "", "tabChecked", "quoteCrypto", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "subscribeWSData", "withSort", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotSidebarTabVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotSidebarTabVM.kt\ncom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabVM\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,162:1\n1#2:163\n774#3:164\n865#3,2:165\n1563#3:167\n1634#3,3:168\n774#3:171\n865#3,2:172\n1021#3,2:174\n1869#3:176\n295#3,2:177\n1870#3:179\n*S KotlinDebug\n*F\n+ 1 SpotSidebarTabVM.kt\ncom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabVM\n*L\n98#1:164\n98#1:165,2\n130#1:167\n130#1:168,3\n130#1:171\n130#1:172,2\n154#1:174,2\n134#1:176\n135#1:177,2\n134#1:179\n*E\n"})
public final class SpotSidebarTabVM extends AbstractC19291m<SpotSidebarTabContract$UIState> {

    /* JADX INFO: renamed from: X */
    @Nullable
    public SpotMenuModel f34819X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public List<TradeItemBean> f34820Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public List<TradeItemBean> f34821Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f34822a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.mart.sidebar.spot.tablist.b0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotSidebarTabVM.m41596x();
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public SortType f34823b0 = SortType.NONE;

    /* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.tablist.SpotSidebarTabVM$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SpotSidebarTabVM.kt\ncom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabVM\n*L\n1#1,328:1\n153#2:329\n*E\n"})
    public static final class C18890b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((TradeItemBean) t11).getShowSymbol(), ((TradeItemBean) t12).getShowSymbol());
        }
    }

    /* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.tablist.SpotSidebarTabVM$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SpotSidebarTabVM.kt\ncom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabVM\n*L\n1#1,328:1\n155#2:329\n*E\n"})
    public static final class C18891c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(((TradeItemBean) t11).getLastDealPrice()), Double.valueOf(((TradeItemBean) t12).getLastDealPrice()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.tablist.SpotSidebarTabVM$d */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SpotSidebarTabVM.kt\ncom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabVM\n*L\n1#1,328:1\n156#2:329\n*E\n"})
    public static final class C18892d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(-((TradeItemBean) t11).getLastDealPrice()), Double.valueOf(-((TradeItemBean) t12).getLastDealPrice()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.tablist.SpotSidebarTabVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: SpotSidebarTabVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mart.sidebar.spot.tablist.SpotSidebarTabVM", m90122f = "SpotSidebarTabVM.kt", m90123i = {0, 1}, m90124l = {32, 37}, m90125m = "dispatchIntent", m90126n = {"intent", "intent"}, m90127s = {"L$0", "L$0"})
    public static final class C188931 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C188931(Continuation<? super C188931> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpotSidebarTabVM.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.tablist.SpotSidebarTabVM$e */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SpotSidebarTabVM.kt\ncom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabVM\n*L\n1#1,328:1\n157#2:329\n*E\n"})
    public static final class C18894e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(C27039d.m66646f(((TradeItemBean) t11).getChangeRate())), Double.valueOf(C27039d.m66646f(((TradeItemBean) t12).getChangeRate())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.tablist.SpotSidebarTabVM$f */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SpotSidebarTabVM.kt\ncom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabVM\n*L\n1#1,328:1\n158#2:329\n*E\n"})
    public static final class C18895f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(-C27039d.m66646f(((TradeItemBean) t11).getChangeRate())), Double.valueOf(-C27039d.m66646f(((TradeItemBean) t12).getChangeRate())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.tablist.SpotSidebarTabVM$g */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 SpotSidebarTabVM.kt\ncom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabVM\n*L\n1#1,328:1\n154#2:329\n*E\n"})
    public static final class C18896g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((TradeItemBean) t12).getShowSymbol(), ((TradeItemBean) t11).getShowSymbol());
        }
    }

    /* JADX INFO: renamed from: p */
    public final List<String> m41597p(SpotMenuModel spotMenuModel) {
        List<String> quoteCryptos = spotMenuModel != null ? spotMenuModel.getQuoteCryptos() : null;
        if (quoteCryptos == null) {
            quoteCryptos = CollectionsKt.emptyList();
        }
        List mutableList = CollectionsKt.toMutableList((Collection) quoteCryptos);
        if (mutableList.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        String titleName = spotMenuModel != null ? spotMenuModel.getTitleName() : null;
        if (titleName == null) {
            titleName = "";
        }
        mutableList.add(0, titleName);
        return CollectionsKt.distinct(mutableList);
    }

    /* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.tablist.SpotSidebarTabVM$a */
    /* JADX INFO: compiled from: SpotSidebarTabVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C18889a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SortType.values().length];
            try {
                iArr[SortType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SortType.NAME_ASC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SortType.NAME_DESC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SortType.PRICE_ASC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SortType.PRICE_DESC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SortType.CHANGE_RATE_ASC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SortType.CHANGE_RATE_DESC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m41595u(SpotSidebarTabVM spotSidebarTabVM, List wsList) {
        Object next;
        Intrinsics.checkNotNullParameter(wsList, "wsList");
        Iterator it = wsList.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            WsMarketSnapshotEntity wsMarketSnapshotEntity = (WsMarketSnapshotEntity) it.next();
            List<TradeItemBean> list = spotSidebarTabVM.f34821Z;
            if (list != null) {
                Iterator<T> it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.areEqual(((TradeItemBean) next).getSymbol(), wsMarketSnapshotEntity.getSymbolCode()));
                TradeItemBean tradeItemBean = (TradeItemBean) next;
                if (tradeItemBean != null && (tradeItemBean.getLastDealPrice() != wsMarketSnapshotEntity.getLastTradedPrice() || !Intrinsics.areEqual(tradeItemBean.getChangeRate(), wsMarketSnapshotEntity.getChangeRate()))) {
                    wsMarketSnapshotEntity.covertToTradeItemBean(tradeItemBean);
                    z11 = true;
                }
            }
        }
        if (z11) {
            List<TradeItemBean> listEmptyList = spotSidebarTabVM.f34821Z;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            spotSidebarTabVM.send(new C18905e(spotSidebarTabVM.m41603w(C27024b.m66558a(listEmptyList))));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final SpotWsHelper m41596x() {
        return new SpotWsHelper();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (m41598q(r2, r4, r7, r0) == r1) goto L23;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C188931 c188931;
        if (continuation instanceof C188931) {
            c188931 = (C188931) continuation;
            int i11 = c188931.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c188931.label = i11 - Integer.MIN_VALUE;
            } else {
                c188931 = new C188931(continuation);
            }
        } else {
            c188931 = new C188931(continuation);
        }
        Object obj = c188931.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c188931.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c188931.L$0 = interfaceC19282d;
            c188931.label = 1;
            if (super.dispatchIntent(interfaceC19282d, c188931) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            interfaceC19282d = (InterfaceC19282d) c188931.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        if (!(interfaceC19282d instanceof SpotSidebarTabContract$UIIntent.FetchTabList)) {
            if (interfaceC19282d instanceof SpotSidebarTabContract$UIIntent.TabChecked) {
                SpotSidebarTabContract$UIIntent.TabChecked tabChecked = (SpotSidebarTabContract$UIIntent.TabChecked) interfaceC19282d;
                this.f34823b0 = tabChecked.getSortType();
                m41602v(tabChecked.getQuoteCrypto(), tabChecked.getMenuModel());
            } else if (interfaceC19282d instanceof SpotSidebarTabContract$UIIntent.ListItemRemoved) {
                SpotSidebarTabContract$UIIntent.ListItemRemoved listItemRemoved = (SpotSidebarTabContract$UIIntent.ListItemRemoved) interfaceC19282d;
                this.f34823b0 = listItemRemoved.getSortType();
                List<TradeItemBean> list = this.f34820Y;
                if (list != null) {
                    Boxing.boxBoolean(list.remove(listItemRemoved.getItem()));
                }
                List<TradeItemBean> list2 = this.f34821Z;
                if (list2 != null) {
                    Boxing.boxBoolean(list2.remove(listItemRemoved.getItem()));
                }
                m41601t(listItemRemoved.getMenuModel());
            } else if (interfaceC19282d instanceof SpotSidebarTabContract$UIIntent.SortList) {
                SpotSidebarTabContract$UIIntent.SortList sortList = (SpotSidebarTabContract$UIIntent.SortList) interfaceC19282d;
                SortType sortType = sortList.getSortType();
                this.f34823b0 = sortType;
                if (sortType == SortType.NONE) {
                    List<TradeItemBean> listEmptyList = this.f34821Z;
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    send(new C18899b(listEmptyList));
                } else {
                    send(new C18899b(m41603w(sortList.getItems())));
                }
            }
            return Unit.INSTANCE;
        }
        SpotSidebarTabContract$UIIntent.FetchTabList fetchTabList = (SpotSidebarTabContract$UIIntent.FetchTabList) interfaceC19282d;
        this.f34823b0 = fetchTabList.getSortType();
        String sidebarType = fetchTabList.getSidebarType();
        String symbolCode = fetchTabList.getSymbolCode();
        SpotMenuModel menuModel = fetchTabList.getMenuModel();
        c188931.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
        c188931.label = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public final Object m41598q(String str, String str2, SpotMenuModel spotMenuModel, Continuation<? super Unit> continuation) {
        SpotSidebarTabVM$fetchTabList$1 spotSidebarTabVM$fetchTabList$1;
        if (continuation instanceof SpotSidebarTabVM$fetchTabList$1) {
            spotSidebarTabVM$fetchTabList$1 = (SpotSidebarTabVM$fetchTabList$1) continuation;
            int i11 = spotSidebarTabVM$fetchTabList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                spotSidebarTabVM$fetchTabList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                spotSidebarTabVM$fetchTabList$1 = new SpotSidebarTabVM$fetchTabList$1(this, continuation);
            }
        } else {
            spotSidebarTabVM$fetchTabList$1 = new SpotSidebarTabVM$fetchTabList$1(this, continuation);
        }
        Object objMo41609a = spotSidebarTabVM$fetchTabList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = spotSidebarTabVM$fetchTabList$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo41609a);
            if (spotMenuModel == null) {
                send(new C18897a(false));
                return Unit.INSTANCE;
            }
            ITabListGet iTabListGetCreate = ITabListGet.f34832a.create(str, str2, spotMenuModel);
            spotSidebarTabVM$fetchTabList$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            spotSidebarTabVM$fetchTabList$1.L$1 = SpillingKt.nullOutSpilledVariable(str2);
            spotSidebarTabVM$fetchTabList$1.L$2 = spotMenuModel;
            spotSidebarTabVM$fetchTabList$1.label = 1;
            objMo41609a = iTabListGetCreate.mo41609a(spotSidebarTabVM$fetchTabList$1);
            if (objMo41609a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            spotMenuModel = (SpotMenuModel) spotSidebarTabVM$fetchTabList$1.L$2;
            ResultKt.throwOnFailure(objMo41609a);
        }
        List<? extends TradeItemBean> list = (List) objMo41609a;
        List<TradeItemBean> listSynchronizedList = Collections.synchronizedList(C27024b.m66558a(list));
        this.f34821Z = listSynchronizedList;
        this.f34820Y = listSynchronizedList;
        if (list.isEmpty()) {
            send(new C18897a(false));
        } else {
            send(new C18903d(m41603w(list), m41597p(spotMenuModel)));
        }
        m41601t(spotMenuModel);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.kubi.mart.sidebar.spot.tablist.SpotSidebarTabContract$UIState] */
    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public SpotSidebarTabContract$UIState getInitState() {
        return new InterfaceC19284f() { // from class: com.kubi.mart.sidebar.spot.tablist.SpotSidebarTabContract$UIState
        };
    }

    /* JADX INFO: renamed from: s */
    public final SpotWsHelper m41600s() {
        return (SpotWsHelper) this.f34822a0.getValue();
    }

    /* JADX INFO: renamed from: t */
    public final void m41601t(SpotMenuModel spotMenuModel) {
        List<String> listListOf;
        this.f34819X = spotMenuModel;
        List<TradeItemBean> listEmptyList = this.f34820Y;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List listM66558a = C27024b.m66558a(listEmptyList);
        if (listM66558a.isEmpty() || spotMenuModel == null) {
            m41600s().m41498h();
            return;
        }
        if (!Intrinsics.areEqual(spotMenuModel.getTabType(), "AREA") || spotMenuModel.getConcept().length() <= 0) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM66558a, 10));
            Iterator it = listM66558a.iterator();
            while (it.hasNext()) {
                String symbol = ((TradeItemBean) it.next()).getSymbol();
                if (symbol == null) {
                    symbol = "";
                }
                arrayList.add(symbol);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            listListOf = arrayList2;
        } else {
            listListOf = CollectionsKt.listOf(spotMenuModel.getConcept());
        }
        m41600s().m41497g(listListOf, new Function1() { // from class: com.kubi.mart.sidebar.spot.tablist.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return SpotSidebarTabVM.m41595u(this.f34829b, (List) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m41602v(String str, SpotMenuModel spotMenuModel) {
        boolean zEquals = StringsKt.equals(str, spotMenuModel != null ? spotMenuModel.getTitleName() : null, true);
        List<TradeItemBean> listEmptyList = this.f34820Y;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (!zEquals) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listEmptyList) {
                if (Intrinsics.areEqual(((TradeItemBean) obj).getSymbolInfoEntity().getQuoteCurrency(), str)) {
                    arrayList.add(obj);
                }
            }
            listEmptyList = arrayList;
        }
        this.f34821Z = Collections.synchronizedList(C27024b.m66558a(listEmptyList));
        if (listEmptyList.isEmpty()) {
            send(new C18897a(true));
        } else {
            send(new C18901c(m41603w(listEmptyList)));
        }
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        m41600s().m41498h();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        m41601t(this.f34819X);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: w */
    public final List<TradeItemBean> m41603w(List<? extends TradeItemBean> list) {
        List<TradeItemBean> mutableList = CollectionsKt.toMutableList((Collection) list);
        switch (C18889a.$EnumSwitchMapping$0[this.f34823b0.ordinal()]) {
            case 1:
                return mutableList;
            case 2:
                CollectionsKt.sortWith(mutableList, new C18890b());
                return mutableList;
            case 3:
                if (mutableList.size() > 1) {
                    CollectionsKt.sortWith(mutableList, new C18896g());
                    return mutableList;
                }
                return mutableList;
            case 4:
                CollectionsKt.sortWith(mutableList, new C18891c());
                return mutableList;
            case 5:
                CollectionsKt.sortWith(mutableList, new C18892d());
                return mutableList;
            case 6:
                CollectionsKt.sortWith(mutableList, new C18894e());
                return mutableList;
            case 7:
                CollectionsKt.sortWith(mutableList, new C18895f());
                return mutableList;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
