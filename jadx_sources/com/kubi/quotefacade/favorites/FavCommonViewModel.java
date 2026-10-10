package com.kubi.quotefacade.favorites;

import android.text.TextUtils;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kucoin.manager.MarketWsHelper;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.entity.AlphaFavEntity;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.quotefacade.entity.FavMarketQuoteEntity;
import com.kubi.quotefacade.entity.MarketListEntityItem;
import com.kubi.quotefacade.entity.TradeSymbolEntity;
import com.kubi.quotefacade.event.FavCommonContract$UiIntent;
import com.kubi.quotefacade.event.UIState;
import com.kubi.quotefacade.helper.FavAlphaCacheManager;
import com.kubi.quotefacade.helper.FavTradeCacheConvert;
import com.kubi.quotefacade.helper.QuoteBusinessConfigHelp;
import com.kubi.quotefacade.helper.QuoteWSDataController;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import com.kubi.user.api.IUserService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p212dv.C36965e;
import p212dv.C36966f;
import p212dv.C36967g;
import p212dv.C36968h;
import p212dv.C36969i;
import p414kv.C41988d;
import p414kv.C41992h;
import p414kv.C41993i;
import p814yz.C46614a;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: FavCommonViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0014J,\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0007H\u0082@¢\u0006\u0002\u0010!J\"\u0010\"\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010#\u001a\u00020$H\u0082@¢\u0006\u0002\u0010%J\"\u0010&\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010)\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010*J\u0018\u0010+\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u000fH\u0082@¢\u0006\u0002\u0010,J\u0018\u0010-\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u000fH\u0082@¢\u0006\u0002\u0010,J\u0018\u0010.\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u000fH\u0082@¢\u0006\u0002\u0010,J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00020(002\b\u0010\u001e\u001a\u0004\u0018\u00010\u000fH\u0082@¢\u0006\u0002\u0010,J%\u00101\u001a\u00020\u00172\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007002\b\u0010\u001e\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u00103J%\u00104\u001a\u00020\u00172\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007002\b\u0010\u001e\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u00103J\b\u00105\u001a\u00020\u0017H\u0016J\u0017\u00106\u001a\u00020$2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u00107J\u0017\u00108\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u00109R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006:"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/FavCommonViewModel;", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/quotefacade/event/FavCommonContract$UiIntent;", "Lcom/kubi/quotefacade/event/FavCommonContract$UIState;", "<init>", "()V", "TAG", "", "repository", "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "wsDataController", "Lcom/kubi/quotefacade/helper/QuoteWSDataController;", "wsHelper", "Lcom/kubi/kucoin/manager/MarketWsHelper;", "currentFavType", "", "Ljava/lang/Integer;", "networkRecovery", "Lcom/kubi/sdk/network/NetworkRecoveryMonitor;", "initState", "getInitState", "()Lcom/kubi/quotefacade/event/FavCommonContract$UIState;", "dispatchIntentOnIO", "", "intent", "(Lcom/kubi/quotefacade/event/FavCommonContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "requestNetworkRecoveryRefresh", "onCleared", "pinFavDataTop", "favType", "symbol", "datasource", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleFavData", "needSubscribe", "", "(Ljava/lang/Integer;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "alphaCollectOrCancelCoin", "item", "Lcom/kubi/data/entity/TradeItemBean;", "itemPosition", "(Lcom/kubi/data/entity/TradeItemBean;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAlphaFavData", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAlphaLocalDara", "loadAlphaRemoteData", "getTradeListFromCache", "", "favPageDataSubscribe", "symbols", "(Ljava/util/List;Ljava/lang/Integer;)V", "favPageDataSubscribeAlpha", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "isAlphaFavTab", "(Ljava/lang/Integer;)Z", "getAlphaParams", "(Ljava/lang/Integer;)Ljava/lang/String;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFavCommonViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavCommonViewModel.kt\ncom/kubi/quotefacade/favorites/FavCommonViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n*L\n1#1,364:1\n1617#2,9:365\n1869#2:374\n1870#2:376\n1626#2:377\n1869#2,2:378\n1563#2:380\n1634#2,3:381\n1617#2,9:387\n1869#2:396\n1870#2:398\n1626#2:399\n1563#2:400\n1634#2,3:401\n1617#2,9:404\n1869#2:413\n1870#2:415\n1626#2:416\n1563#2:417\n1634#2,3:418\n1563#2:421\n1634#2,3:422\n1617#2,9:425\n1869#2:434\n1870#2:436\n1626#2:437\n1563#2:438\n1634#2,3:439\n1#3:375\n1#3:385\n1#3:397\n1#3:414\n1#3:435\n25#4:384\n26#4:386\n*S KotlinDebug\n*F\n+ 1 FavCommonViewModel.kt\ncom/kubi/quotefacade/favorites/FavCommonViewModel\n*L\n153#1:365,9\n153#1:374\n153#1:376\n153#1:377\n172#1:378,2\n188#1:380\n188#1:381,3\n221#1:387,9\n221#1:396\n221#1:398\n221#1:399\n260#1:400\n260#1:401,3\n261#1:404,9\n261#1:413\n261#1:415\n261#1:416\n279#1:417\n279#1:418,3\n280#1:421\n280#1:422,3\n281#1:425,9\n281#1:434\n281#1:436\n281#1:437\n308#1:438\n308#1:439,3\n153#1:375\n202#1:385\n221#1:397\n261#1:414\n281#1:435\n202#1:384\n202#1:386\n*E\n"})
public final class FavCommonViewModel extends BaseStateVM<FavCommonContract$UiIntent, UIState> {

    /* JADX INFO: renamed from: Z */
    @Nullable
    public Integer f41682Z;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final String f41678V = "FavCommonViewModel";

    /* JADX INFO: renamed from: W */
    @NotNull
    public final QuoteMarketRepository f41679W = new QuoteMarketRepository();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final QuoteWSDataController f41680X = new QuoteWSDataController();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MarketWsHelper f41681Y = new MarketWsHelper();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final C46614a f41683a0 = new C46614a("FavCommonViewModel", new FavCommonViewModel$networkRecovery$1(this));

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.FavCommonViewModel$dispatchIntentOnIO$1 */
    /* JADX INFO: compiled from: FavCommonViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.FavCommonViewModel", m90122f = "FavCommonViewModel.kt", m90123i = {0, 1, 2, 3, 4}, m90124l = {66, 70, 74, 79, 86}, m90125m = "dispatchIntentOnIO", m90126n = {"intent", "intent", "intent", "intent", "intent"}, m90127s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
    public static final class C219301 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C219301(Continuation<? super C219301> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FavCommonViewModel.this.dispatchIntentOnIO(null, this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.FavCommonViewModel$dispatchIntentOnIO$2 */
    /* JADX INFO: compiled from: FavCommonViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.FavCommonViewModel$dispatchIntentOnIO$2", m90122f = "FavCommonViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C219312 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        final /* synthetic */ FavCommonContract$UiIntent $intent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C219312(FavCommonContract$UiIntent favCommonContract$UiIntent, Continuation<? super C219312> continuation) {
            super(2, continuation);
            this.$intent = favCommonContract$UiIntent;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FavCommonViewModel.this.new C219312(this.$intent, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C219312) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                FavCommonViewModel.this.send(new C36965e(new Pair(((FavCommonContract$UiIntent.CollectOrCancelCoin) this.$intent).getTradeItemBean(), Boxing.boxInt(((FavCommonContract$UiIntent.CollectOrCancelCoin) this.$intent).getItemPosition()))));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0223  */
    /* JADX WARN: Code duplicated, block: B:102:0x022c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0241  */
    /* JADX WARN: Code duplicated, block: B:108:0x0250  */
    /* JADX WARN: Code duplicated, block: B:118:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00df  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:51:0x010b  */
    /* JADX WARN: Code duplicated, block: B:66:0x014e A[LOOP:2: B:64:0x0148->B:66:0x014e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b3 A[LOOP:1: B:81:0x01ad->B:83:0x01b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x0210  */
    /* JADX WARN: Code duplicated, block: B:98:0x021b  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        if (m51324R(r10, r0) == r1) goto L92;
     */
    /* JADX INFO: renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m51322J(Integer num, boolean z11, Continuation<? super Unit> continuation) {
        FavCommonViewModel$handleFavData$1 favCommonViewModel$handleFavData$1;
        List arrayList;
        Integer num2;
        List list;
        List list2;
        Integer num3;
        C41992h c41992h;
        C41993i c41993i;
        Integer num4;
        List list3;
        List list4;
        List<String> arrayList2;
        Iterator it;
        String symbol;
        Iterator it2;
        ArrayList arrayList3;
        Iterator it3;
        List<String> arrayList4;
        Iterator it4;
        String symbol2;
        if (continuation instanceof FavCommonViewModel$handleFavData$1) {
            favCommonViewModel$handleFavData$1 = (FavCommonViewModel$handleFavData$1) continuation;
            int i11 = favCommonViewModel$handleFavData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                favCommonViewModel$handleFavData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                favCommonViewModel$handleFavData$1 = new FavCommonViewModel$handleFavData$1(this, continuation);
            }
        } else {
            favCommonViewModel$handleFavData$1 = new FavCommonViewModel$handleFavData$1(this, continuation);
        }
        Object obj = favCommonViewModel$handleFavData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = favCommonViewModel$handleFavData$1.label;
        try {
            try {
                if (i12 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (m51323Q(num)) {
                        favCommonViewModel$handleFavData$1.L$0 = SpillingKt.nullOutSpilledVariable(num);
                        favCommonViewModel$handleFavData$1.Z$0 = z11;
                        favCommonViewModel$handleFavData$1.label = 1;
                    } else {
                        arrayList = new ArrayList();
                        if (IUserService.a.get().c()) {
                            arrayList.clear();
                            if (num != null && num.intValue() == 1) {
                                C41993i c41993i2 = new C41993i();
                                QuoteMarketRepository quoteMarketRepository = this.f41679W;
                                favCommonViewModel$handleFavData$1.L$0 = num;
                                favCommonViewModel$handleFavData$1.L$1 = arrayList;
                                favCommonViewModel$handleFavData$1.L$2 = c41993i2;
                                favCommonViewModel$handleFavData$1.Z$0 = z11;
                                favCommonViewModel$handleFavData$1.label = 3;
                                Object objM52967B = quoteMarketRepository.m52967B(favCommonViewModel$handleFavData$1);
                                if (objM52967B != coroutine_suspended) {
                                    list2 = arrayList;
                                    obj = objM52967B;
                                    num3 = num;
                                    c41993i = c41993i2;
                                    it2 = ((List) obj).iterator();
                                    while (it2.hasNext()) {
                                        list2.add(c41993i.mo51723a((MarketListEntityItem) it2.next()));
                                    }
                                    num = num3;
                                    arrayList = list2;
                                    if (arrayList.isEmpty()) {
                                        Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.m0
                                            @Override // p852kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                return FavCommonViewModel.m51289P((UIState) obj2);
                                            }
                                        }));
                                    } else {
                                        send(new C36966f(arrayList));
                                    }
                                    C44128b.m97266j(this.f41678V, "把线上最新的币对缓存到本地【不写入缓存】");
                                    if (z11) {
                                        arrayList4 = new ArrayList<>();
                                        it4 = arrayList.iterator();
                                        while (it4.hasNext()) {
                                            symbol2 = ((TradeItemBean) it4.next()).getSymbol();
                                            if (symbol2 != null) {
                                                arrayList4.add(symbol2);
                                            }
                                        }
                                        m51317B(arrayList4, num);
                                    }
                                }
                            } else if (num != null && num.intValue() == 2) {
                                C41992h c41992h2 = new C41992h();
                                String strM51845i = QuoteBusinessConfigHelp.f41933a.m51845i();
                                QuoteMarketRepository quoteMarketRepository2 = this.f41679W;
                                favCommonViewModel$handleFavData$1.L$0 = num;
                                favCommonViewModel$handleFavData$1.L$1 = arrayList;
                                favCommonViewModel$handleFavData$1.L$2 = c41992h2;
                                favCommonViewModel$handleFavData$1.L$3 = SpillingKt.nullOutSpilledVariable(strM51845i);
                                favCommonViewModel$handleFavData$1.Z$0 = z11;
                                favCommonViewModel$handleFavData$1.label = 4;
                                Object objM52966A = quoteMarketRepository2.m52966A(strM51845i, favCommonViewModel$handleFavData$1);
                                if (objM52966A != coroutine_suspended) {
                                    list2 = arrayList;
                                    obj = objM52966A;
                                    num3 = num;
                                    c41992h = c41992h2;
                                    List list5 = (List) obj;
                                    arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
                                    it3 = list5.iterator();
                                    while (it3.hasNext()) {
                                        arrayList3.add(Boxing.boxBoolean(list2.add(c41992h.mo51723a((MarketListEntityItem) it3.next()))));
                                    }
                                    num = num3;
                                    arrayList = list2;
                                    if (arrayList.isEmpty()) {
                                        send(new C36966f(arrayList));
                                    } else {
                                        Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.m0
                                            @Override // p852kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                return FavCommonViewModel.m51289P((UIState) obj2);
                                            }
                                        }));
                                    }
                                    C44128b.m97266j(this.f41678V, "把线上最新的币对缓存到本地【不写入缓存】");
                                    if (z11) {
                                        arrayList4 = new ArrayList<>();
                                        it4 = arrayList.iterator();
                                        while (it4.hasNext()) {
                                            symbol2 = ((TradeItemBean) it4.next()).getSymbol();
                                            if (symbol2 != null) {
                                                arrayList4.add(symbol2);
                                            }
                                        }
                                        m51317B(arrayList4, num);
                                    }
                                }
                            } else if (num != null && num.intValue() == 3) {
                                C41988d c41988d = new C41988d();
                                InterfaceC41634e<List<FavMarketQuoteEntity>> interfaceC41634eM53010z = this.f41679W.m53010z();
                                FavCommonViewModel$handleFavData$6 favCommonViewModel$handleFavData$6 = new FavCommonViewModel$handleFavData$6(c41988d, arrayList, null);
                                favCommonViewModel$handleFavData$1.L$0 = num;
                                favCommonViewModel$handleFavData$1.L$1 = arrayList;
                                favCommonViewModel$handleFavData$1.L$2 = SpillingKt.nullOutSpilledVariable(c41988d);
                                favCommonViewModel$handleFavData$1.Z$0 = z11;
                                favCommonViewModel$handleFavData$1.label = 5;
                                Object objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM53010z, false, favCommonViewModel$handleFavData$6, favCommonViewModel$handleFavData$1);
                                if (objM42823d != coroutine_suspended) {
                                    num2 = num;
                                    list = arrayList;
                                    obj = objM42823d;
                                    if (((C19334f) obj).getThrowable() != null) {
                                        updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.l0
                                            @Override // p852kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                return FavCommonViewModel.m51288O((UIState) obj2);
                                            }
                                        });
                                        return Unit.INSTANCE;
                                    }
                                    arrayList = list;
                                    num = num2;
                                    if (arrayList.isEmpty()) {
                                        send(new C36966f(arrayList));
                                    } else {
                                        Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.m0
                                            @Override // p852kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                return FavCommonViewModel.m51289P((UIState) obj2);
                                            }
                                        }));
                                    }
                                    C44128b.m97266j(this.f41678V, "把线上最新的币对缓存到本地【不写入缓存】");
                                    if (z11) {
                                        arrayList4 = new ArrayList<>();
                                        it4 = arrayList.iterator();
                                        while (it4.hasNext()) {
                                            symbol2 = ((TradeItemBean) it4.next()).getSymbol();
                                            if (symbol2 != null) {
                                                arrayList4.add(symbol2);
                                            }
                                        }
                                        m51317B(arrayList4, num);
                                    }
                                }
                            } else {
                                if (arrayList.isEmpty()) {
                                    send(new C36966f(arrayList));
                                } else {
                                    Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.m0
                                        @Override // p852kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return FavCommonViewModel.m51289P((UIState) obj2);
                                        }
                                    }));
                                }
                                C44128b.m97266j(this.f41678V, "把线上最新的币对缓存到本地【不写入缓存】");
                                if (z11) {
                                    arrayList4 = new ArrayList<>();
                                    it4 = arrayList.iterator();
                                    while (it4.hasNext()) {
                                        symbol2 = ((TradeItemBean) it4.next()).getSymbol();
                                        if (symbol2 != null) {
                                            arrayList4.add(symbol2);
                                        }
                                    }
                                    m51317B(arrayList4, num);
                                }
                            }
                        } else {
                            favCommonViewModel$handleFavData$1.L$0 = num;
                            favCommonViewModel$handleFavData$1.L$1 = arrayList;
                            favCommonViewModel$handleFavData$1.Z$0 = z11;
                            favCommonViewModel$handleFavData$1.label = 2;
                            Object objM51321I = m51321I(num, favCommonViewModel$handleFavData$1);
                            if (objM51321I != coroutine_suspended) {
                                num4 = num;
                                list3 = arrayList;
                                obj = objM51321I;
                                list4 = (List) obj;
                                if (list4.isEmpty()) {
                                    Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.i0
                                        @Override // p852kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return FavCommonViewModel.m51285L((UIState) obj2);
                                        }
                                    }));
                                } else {
                                    list3.clear();
                                    list3.addAll(list4);
                                    if (z11) {
                                        arrayList2 = new ArrayList<>();
                                        it = list3.iterator();
                                        while (it.hasNext()) {
                                            symbol = ((TradeItemBean) it.next()).getSymbol();
                                            if (symbol != null) {
                                                arrayList2.add(symbol);
                                            }
                                        }
                                        m51317B(arrayList2, num4);
                                    }
                                    send(new C36966f(list3));
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                if (i12 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i12 == 2) {
                    z11 = favCommonViewModel$handleFavData$1.Z$0;
                    list3 = (List) favCommonViewModel$handleFavData$1.L$1;
                    num4 = (Integer) favCommonViewModel$handleFavData$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    list4 = (List) obj;
                    if (list4.isEmpty()) {
                        list3.clear();
                        list3.addAll(list4);
                        if (z11) {
                            arrayList2 = new ArrayList<>();
                            it = list3.iterator();
                            while (it.hasNext()) {
                                symbol = ((TradeItemBean) it.next()).getSymbol();
                                if (symbol != null) {
                                    arrayList2.add(symbol);
                                }
                            }
                            m51317B(arrayList2, num4);
                        }
                        send(new C36966f(list3));
                    } else {
                        Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.i0
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return FavCommonViewModel.m51285L((UIState) obj2);
                            }
                        }));
                    }
                } else if (i12 == 3) {
                    z11 = favCommonViewModel$handleFavData$1.Z$0;
                    c41993i = (C41993i) favCommonViewModel$handleFavData$1.L$2;
                    list2 = (List) favCommonViewModel$handleFavData$1.L$1;
                    num3 = (Integer) favCommonViewModel$handleFavData$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    it2 = ((List) obj).iterator();
                    while (it2.hasNext()) {
                        list2.add(c41993i.mo51723a((MarketListEntityItem) it2.next()));
                    }
                    num = num3;
                    arrayList = list2;
                    if (arrayList.isEmpty()) {
                        send(new C36966f(arrayList));
                    } else {
                        Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.m0
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return FavCommonViewModel.m51289P((UIState) obj2);
                            }
                        }));
                    }
                    C44128b.m97266j(this.f41678V, "把线上最新的币对缓存到本地【不写入缓存】");
                    if (z11) {
                        arrayList4 = new ArrayList<>();
                        it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            symbol2 = ((TradeItemBean) it4.next()).getSymbol();
                            if (symbol2 != null) {
                                arrayList4.add(symbol2);
                            }
                        }
                        m51317B(arrayList4, num);
                    }
                } else if (i12 == 4) {
                    z11 = favCommonViewModel$handleFavData$1.Z$0;
                    c41992h = (C41992h) favCommonViewModel$handleFavData$1.L$2;
                    list2 = (List) favCommonViewModel$handleFavData$1.L$1;
                    num3 = (Integer) favCommonViewModel$handleFavData$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    List list6 = (List) obj;
                    arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                    it3 = list6.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(Boxing.boxBoolean(list2.add(c41992h.mo51723a((MarketListEntityItem) it3.next()))));
                    }
                    num = num3;
                    arrayList = list2;
                    if (arrayList.isEmpty()) {
                        send(new C36966f(arrayList));
                    } else {
                        Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.m0
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return FavCommonViewModel.m51289P((UIState) obj2);
                            }
                        }));
                    }
                    C44128b.m97266j(this.f41678V, "把线上最新的币对缓存到本地【不写入缓存】");
                    if (z11) {
                        arrayList4 = new ArrayList<>();
                        it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            symbol2 = ((TradeItemBean) it4.next()).getSymbol();
                            if (symbol2 != null) {
                                arrayList4.add(symbol2);
                            }
                        }
                        m51317B(arrayList4, num);
                    }
                } else {
                    if (i12 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z11 = favCommonViewModel$handleFavData$1.Z$0;
                    list = (List) favCommonViewModel$handleFavData$1.L$1;
                    num2 = (Integer) favCommonViewModel$handleFavData$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (((C19334f) obj).getThrowable() != null) {
                        updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.l0
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return FavCommonViewModel.m51288O((UIState) obj2);
                            }
                        });
                        return Unit.INSTANCE;
                    }
                    arrayList = list;
                    num = num2;
                    if (arrayList.isEmpty()) {
                        send(new C36966f(arrayList));
                    } else {
                        Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.m0
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return FavCommonViewModel.m51289P((UIState) obj2);
                            }
                        }));
                    }
                    C44128b.m97266j(this.f41678V, "把线上最新的币对缓存到本地【不写入缓存】");
                    if (z11) {
                        arrayList4 = new ArrayList<>();
                        it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            symbol2 = ((TradeItemBean) it4.next()).getSymbol();
                            if (symbol2 != null) {
                                arrayList4.add(symbol2);
                            }
                        }
                        m51317B(arrayList4, num);
                    }
                }
                return Unit.INSTANCE;
            } catch (Exception unused) {
                updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.j0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return FavCommonViewModel.m51286M((UIState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
        } catch (Exception unused2) {
            updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.k0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return FavCommonViewModel.m51287N((UIState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m51281C(FavCommonViewModel favCommonViewModel, List list) {
        favCommonViewModel.send(new C36969i(list));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m51282D(FavCommonViewModel favCommonViewModel, List list) {
        favCommonViewModel.send(new C36968h(list));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m51283F(FavCommonViewModel favCommonViewModel, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C44128b.m97266j(favCommonViewModel.f41678V, "favPageDataSubscribeAlpha==>" + it);
        favCommonViewModel.send(new C36967g(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ Object m51284K(FavCommonViewModel favCommonViewModel, Integer num, boolean z11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return favCommonViewModel.m51322J(num, z11, continuation);
    }

    /* JADX INFO: renamed from: L */
    public static final UIState m51285L(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, new Object(), null, null, 6, null);
    }

    /* JADX INFO: renamed from: M */
    public static final UIState m51286M(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, new Object(), null, 5, null);
    }

    /* JADX INFO: renamed from: N */
    public static final UIState m51287N(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, new Object(), null, 5, null);
    }

    /* JADX INFO: renamed from: O */
    public static final UIState m51288O(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, new Object(), null, 5, null);
    }

    /* JADX INFO: renamed from: P */
    public static final UIState m51289P(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, new Object(), null, null, 6, null);
    }

    /* JADX INFO: renamed from: T */
    public static final UIState m51290T(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, new Object(), null, null, 6, null);
    }

    /* JADX INFO: renamed from: U */
    public static final UIState m51291U(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, new Object(), null, null, 6, null);
    }

    /* JADX INFO: renamed from: W */
    public static final UIState m51292W(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, new Object(), null, 5, null);
    }

    /* JADX INFO: renamed from: X */
    public static final UIState m51293X(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, new Object(), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public final void m51294Z() {
        Integer num = this.f41682Z;
        if (num == null) {
            C44128b.m97266j(this.f41678V, "network recovered: skip FetchFavData, currentFavType is null");
            return;
        }
        C44128b.m97266j(this.f41678V, "network recovered: send FetchFavData favType=" + num);
        sendIntent(new FavCommonContract$UiIntent.FetchFavData(num));
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m51315z(FavCommonViewModel favCommonViewModel, TradeItemBean tradeItemBean, int i11, boolean z11) {
        if (z11) {
            favCommonViewModel.send(new C36965e(new Pair(tradeItemBean, Integer.valueOf(i11))));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        if (m51322J(r10, true, r4) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
    
        if (m51327Y(r1, r2, r10, r4) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e2, code lost:
    
        if (m51328y(r1, r10, r4) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0113, code lost:
    
        if (com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42826g(r1, false, r3, r4, 1, null) == r0) goto L55;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntentOnIO(@NotNull FavCommonContract$UiIntent favCommonContract$UiIntent, @NotNull Continuation<? super Unit> continuation) {
        C219301 c219301;
        if (continuation instanceof C219301) {
            c219301 = (C219301) continuation;
            int i11 = c219301.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c219301.label = i11 - Integer.MIN_VALUE;
            } else {
                c219301 = new C219301(continuation);
            }
        } else {
            c219301 = new C219301(continuation);
        }
        C219301 c219302 = c219301;
        Object obj = c219302.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c219302.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c219302.L$0 = favCommonContract$UiIntent;
            c219302.label = 1;
            if (super.dispatchIntentOnIO(favCommonContract$UiIntent, c219302) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i12 == 3) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i12 == 4) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i12 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        favCommonContract$UiIntent = (FavCommonContract$UiIntent) c219302.L$0;
        ResultKt.throwOnFailure(obj);
        if (favCommonContract$UiIntent instanceof FavCommonContract$UiIntent.FetchFavData) {
            FavCommonContract$UiIntent.FetchFavData fetchFavData = (FavCommonContract$UiIntent.FetchFavData) favCommonContract$UiIntent;
            this.f41682Z = fetchFavData.getFavType();
            Integer favType = fetchFavData.getFavType();
            c219302.L$0 = SpillingKt.nullOutSpilledVariable(favCommonContract$UiIntent);
            c219302.label = 2;
        } else {
            if (!(favCommonContract$UiIntent instanceof FavCommonContract$UiIntent.PinItemToTop)) {
                if (favCommonContract$UiIntent instanceof FavCommonContract$UiIntent.CollectOrCancelCoin) {
                    FavCommonContract$UiIntent.CollectOrCancelCoin collectOrCancelCoin = (FavCommonContract$UiIntent.CollectOrCancelCoin) favCommonContract$UiIntent;
                    if (m51323Q(collectOrCancelCoin.getFavType())) {
                        TradeItemBean tradeItemBean = collectOrCancelCoin.getTradeItemBean();
                        int itemPosition = collectOrCancelCoin.getItemPosition();
                        c219302.L$0 = SpillingKt.nullOutSpilledVariable(favCommonContract$UiIntent);
                        c219302.label = 4;
                    } else {
                        QuoteMarketRepository quoteMarketRepository = this.f41679W;
                        TradeItemBean tradeItemBean2 = collectOrCancelCoin.getTradeItemBean();
                        InterfaceC41634e<Object> interfaceC41634eM52994h = quoteMarketRepository.m52994h(tradeItemBean2 != null ? tradeItemBean2.getSymbol() : null, collectOrCancelCoin.getFavType());
                        C219312 c219312 = new C219312(favCommonContract$UiIntent, null);
                        c219302.L$0 = SpillingKt.nullOutSpilledVariable(favCommonContract$UiIntent);
                        c219302.label = 5;
                    }
                } else {
                    if (!(favCommonContract$UiIntent instanceof FavCommonContract$UiIntent.UpdateSubscribe)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FavCommonContract$UiIntent.UpdateSubscribe updateSubscribe = (FavCommonContract$UiIntent.UpdateSubscribe) favCommonContract$UiIntent;
                    this.f41682Z = updateSubscribe.getFavType();
                    if (m51323Q(updateSubscribe.getFavType())) {
                        m51318E(updateSubscribe.getSymbols(), updateSubscribe.getFavType());
                    } else {
                        m51317B(updateSubscribe.getSymbols(), updateSubscribe.getFavType());
                    }
                    Unit unit = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            FavCommonContract$UiIntent.PinItemToTop pinItemToTop = (FavCommonContract$UiIntent.PinItemToTop) favCommonContract$UiIntent;
            Integer favType2 = pinItemToTop.getFavType();
            String symbol = pinItemToTop.getSymbol();
            String datasource = pinItemToTop.getDatasource();
            c219302.L$0 = SpillingKt.nullOutSpilledVariable(favCommonContract$UiIntent);
            c219302.label = 3;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: E */
    public final void m51318E(List<String> list, Integer num) {
        MarketWsHelper.m32538x(this.f41681Y, list, null, 0L, new Function1() { // from class: com.kubi.quotefacade.favorites.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FavCommonViewModel.m51283F(this.f41786b, (List) obj);
            }
        }, 6, null);
    }

    /* JADX INFO: renamed from: G */
    public final String m51319G(Integer num) {
        if (num != null && num.intValue() == 6) {
            return "Alpha_Highlights";
        }
        return (num != null && num.intValue() == 7) ? "Alpha_ChainArea" : "";
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, null, 7, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: I */
    public final Object m51321I(Integer num, Continuation<? super List<? extends TradeItemBean>> continuation) {
        FavCommonViewModel$getTradeListFromCache$1 favCommonViewModel$getTradeListFromCache$1;
        C41993i c41993i;
        List<MarketListEntityItem> spots;
        if (continuation instanceof FavCommonViewModel$getTradeListFromCache$1) {
            favCommonViewModel$getTradeListFromCache$1 = (FavCommonViewModel$getTradeListFromCache$1) continuation;
            int i11 = favCommonViewModel$getTradeListFromCache$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                favCommonViewModel$getTradeListFromCache$1.label = i11 - Integer.MIN_VALUE;
            } else {
                favCommonViewModel$getTradeListFromCache$1 = new FavCommonViewModel$getTradeListFromCache$1(this, continuation);
            }
        } else {
            favCommonViewModel$getTradeListFromCache$1 = new FavCommonViewModel$getTradeListFromCache$1(this, continuation);
        }
        Object objM52986U = favCommonViewModel$getTradeListFromCache$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = favCommonViewModel$getTradeListFromCache$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM52986U);
            List<String> listM51956b = FavTradeCacheConvert.f42000a.m51956b(num);
            C44128b.m97266j(this.f41678V, "未登陆时从缓存获取数据 favorList=" + num + " => " + listM51956b);
            StringBuilder sb2 = new StringBuilder();
            int size = listM51956b.size();
            for (int i13 = 0; i13 < size; i13++) {
                String str = (String) CollectionsKt.getOrNull(listM51956b, i13);
                if (str != null) {
                    sb2.append(str);
                    if (i13 != listM51956b.size() - 1) {
                        sb2.append(",");
                    }
                }
            }
            if (TextUtils.isEmpty(sb2)) {
                return CollectionsKt.emptyList();
            }
            if (num != null && num.intValue() == 1) {
                C41993i c41993i2 = new C41993i();
                QuoteMarketRepository quoteMarketRepository = this.f41679W;
                favCommonViewModel$getTradeListFromCache$1.L$0 = SpillingKt.nullOutSpilledVariable(num);
                favCommonViewModel$getTradeListFromCache$1.L$1 = SpillingKt.nullOutSpilledVariable(listM51956b);
                favCommonViewModel$getTradeListFromCache$1.L$2 = SpillingKt.nullOutSpilledVariable(sb2);
                favCommonViewModel$getTradeListFromCache$1.L$3 = c41993i2;
                favCommonViewModel$getTradeListFromCache$1.label = 1;
                objM52986U = quoteMarketRepository.m52986U(listM51956b, favCommonViewModel$getTradeListFromCache$1);
                if (objM52986U != coroutine_suspended) {
                    c41993i = c41993i2;
                }
            } else {
                QuoteMarketRepository quoteMarketRepository2 = this.f41679W;
                String string = sb2.toString();
                favCommonViewModel$getTradeListFromCache$1.L$0 = SpillingKt.nullOutSpilledVariable(num);
                favCommonViewModel$getTradeListFromCache$1.L$1 = SpillingKt.nullOutSpilledVariable(listM51956b);
                favCommonViewModel$getTradeListFromCache$1.L$2 = SpillingKt.nullOutSpilledVariable(sb2);
                favCommonViewModel$getTradeListFromCache$1.label = 2;
                Object objM52979N = quoteMarketRepository2.m52979N(string, "android/trade_list", num, favCommonViewModel$getTradeListFromCache$1);
                if (objM52979N != coroutine_suspended) {
                    return objM52979N;
                }
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM52986U);
            return objM52986U;
        }
        c41993i = (C41993i) favCommonViewModel$getTradeListFromCache$1.L$3;
        ResultKt.throwOnFailure(objM52986U);
        TradeSymbolEntity tradeSymbolEntity = (TradeSymbolEntity) objM52986U;
        if (tradeSymbolEntity == null || (spots = tradeSymbolEntity.getSpots()) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(spots, 10));
        Iterator<T> it = spots.iterator();
        while (it.hasNext()) {
            arrayList.add(c41993i.mo51723a((MarketListEntityItem) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m51323Q(Integer num) {
        if (num != null && num.intValue() == 6) {
            return true;
        }
        return num != null && num.intValue() == 7;
    }

    /* JADX INFO: renamed from: R */
    public final Object m51324R(Integer num, Continuation<? super Unit> continuation) {
        if (IUserService.a.get().c()) {
            Object objM51326V = m51326V(num, continuation);
            return objM51326V == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM51326V : Unit.INSTANCE;
        }
        Object objM51325S = m51325S(num, continuation);
        return objM51325S == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM51325S : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: S */
    public final Object m51325S(Integer num, Continuation<? super Unit> continuation) {
        FavCommonViewModel$loadAlphaLocalDara$1 favCommonViewModel$loadAlphaLocalDara$1;
        if (continuation instanceof FavCommonViewModel$loadAlphaLocalDara$1) {
            favCommonViewModel$loadAlphaLocalDara$1 = (FavCommonViewModel$loadAlphaLocalDara$1) continuation;
            int i11 = favCommonViewModel$loadAlphaLocalDara$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                favCommonViewModel$loadAlphaLocalDara$1.label = i11 - Integer.MIN_VALUE;
            } else {
                favCommonViewModel$loadAlphaLocalDara$1 = new FavCommonViewModel$loadAlphaLocalDara$1(this, continuation);
            }
        } else {
            favCommonViewModel$loadAlphaLocalDara$1 = new FavCommonViewModel$loadAlphaLocalDara$1(this, continuation);
        }
        Object objM53003s = favCommonViewModel$loadAlphaLocalDara$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = favCommonViewModel$loadAlphaLocalDara$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM53003s);
            List<String> listM51823t = FavAlphaCacheManager.f41929a.m51823t();
            if (listM51823t.isEmpty()) {
                updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.e0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FavCommonViewModel.m51290T((UIState) obj);
                    }
                });
                return Unit.INSTANCE;
            }
            QuoteMarketRepository quoteMarketRepository = this.f41679W;
            String strM51319G = m51319G(num);
            favCommonViewModel$loadAlphaLocalDara$1.L$0 = num;
            favCommonViewModel$loadAlphaLocalDara$1.L$1 = SpillingKt.nullOutSpilledVariable(listM51823t);
            favCommonViewModel$loadAlphaLocalDara$1.label = 1;
            objM53003s = quoteMarketRepository.m53003s(strM51319G, listM51823t, favCommonViewModel$loadAlphaLocalDara$1);
            if (objM53003s == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            num = (Integer) favCommonViewModel$loadAlphaLocalDara$1.L$0;
            ResultKt.throwOnFailure(objM53003s);
        }
        List list = (List) objM53003s;
        if (list.isEmpty()) {
            updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.f0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FavCommonViewModel.m51291U((UIState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new AlphaFavEntity((AlphaItemEntity) it.next()));
        }
        send(new C36966f(arrayList));
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String tokenBridgeId = ((AlphaItemEntity) it2.next()).getTokenBridgeId();
            if (tokenBridgeId != null) {
                arrayList2.add(tokenBridgeId);
            }
        }
        if (!arrayList2.isEmpty()) {
            m51318E(arrayList2, num);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: V */
    public final Object m51326V(Integer num, Continuation<? super Unit> continuation) {
        FavCommonViewModel$loadAlphaRemoteData$1 favCommonViewModel$loadAlphaRemoteData$1;
        if (continuation instanceof FavCommonViewModel$loadAlphaRemoteData$1) {
            favCommonViewModel$loadAlphaRemoteData$1 = (FavCommonViewModel$loadAlphaRemoteData$1) continuation;
            int i11 = favCommonViewModel$loadAlphaRemoteData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                favCommonViewModel$loadAlphaRemoteData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                favCommonViewModel$loadAlphaRemoteData$1 = new FavCommonViewModel$loadAlphaRemoteData$1(this, continuation);
            }
        } else {
            favCommonViewModel$loadAlphaRemoteData$1 = new FavCommonViewModel$loadAlphaRemoteData$1(this, continuation);
        }
        Object objM52969D = favCommonViewModel$loadAlphaRemoteData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = favCommonViewModel$loadAlphaRemoteData$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM52969D);
                QuoteMarketRepository quoteMarketRepository = this.f41679W;
                String strM51319G = m51319G(num);
                favCommonViewModel$loadAlphaRemoteData$1.L$0 = num;
                favCommonViewModel$loadAlphaRemoteData$1.label = 1;
                objM52969D = quoteMarketRepository.m52969D(strM51319G, favCommonViewModel$loadAlphaRemoteData$1);
                if (objM52969D == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                num = (Integer) favCommonViewModel$loadAlphaRemoteData$1.L$0;
                ResultKt.throwOnFailure(objM52969D);
            }
            List list = (List) objM52969D;
            if (list.isEmpty()) {
                updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.d0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FavCommonViewModel.m51293X((UIState) obj);
                    }
                });
                FavAlphaCacheManager.f41929a.m51816N(CollectionsKt.emptyList());
                return Unit.INSTANCE;
            }
            FavAlphaCacheManager favAlphaCacheManager = FavAlphaCacheManager.f41929a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((AlphaItemEntity) it.next()).getUniqueCode());
            }
            favAlphaCacheManager.m51816N(arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new AlphaFavEntity((AlphaItemEntity) it2.next()));
            }
            send(new C36966f(arrayList2));
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                String tokenBridgeId = ((AlphaItemEntity) it3.next()).getTokenBridgeId();
                if (tokenBridgeId != null) {
                    arrayList3.add(tokenBridgeId);
                }
            }
            if (!arrayList3.isEmpty()) {
                m51318E(arrayList3, num);
            }
            return Unit.INSTANCE;
        } catch (Exception unused) {
            updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.o0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FavCommonViewModel.m51292W((UIState) obj);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Y */
    public final Object m51327Y(Integer num, String str, String str2, Continuation<? super Unit> continuation) {
        Object objM42824e = RetrofitFlowExKt.m42824e(this.f41679W.m52988X(str, num, str2), false, new FavCommonViewModel$pinFavDataTop$2(this, num, null), continuation, 1, null);
        return objM42824e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM42824e : Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        this.f41683a0.m102779e();
        super.onCleared();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        this.f41683a0.m102780f();
        super.onHide();
        this.f41680X.m51879c();
        this.f41681Y.m32541F();
    }

    /* JADX INFO: renamed from: y */
    public final Object m51328y(final TradeItemBean tradeItemBean, final int i11, Continuation<? super Unit> continuation) {
        AlphaItemEntity itemEntity;
        Object objM51819n;
        AlphaFavEntity alphaFavEntity = tradeItemBean instanceof AlphaFavEntity ? (AlphaFavEntity) tradeItemBean : null;
        return (alphaFavEntity == null || (itemEntity = alphaFavEntity.getItemEntity()) == null || (objM51819n = FavAlphaCacheManager.f41929a.m51819n(itemEntity, false, new Function1() { // from class: com.kubi.quotefacade.favorites.n0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FavCommonViewModel.m51315z(this.f41842b, tradeItemBean, i11, ((Boolean) obj).booleanValue());
            }
        }, continuation)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : objM51819n;
    }

    /* JADX INFO: renamed from: B */
    public final void m51317B(List<String> list, Integer num) {
        if (!list.isEmpty()) {
            if ((num == null || num.intValue() != 1) && (num == null || num.intValue() != 3)) {
                this.f41680X.m51880d(list, new Function1() { // from class: com.kubi.quotefacade.favorites.h0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FavCommonViewModel.m51282D(this.f41831b, (List) obj);
                    }
                });
                return;
            } else {
                this.f41680X.m51881f(list, new Function1() { // from class: com.kubi.quotefacade.favorites.g0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FavCommonViewModel.m51281C(this.f41829b, (List) obj);
                    }
                });
                return;
            }
        }
        this.f41680X.m51879c();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        this.f41683a0.m102781g();
    }
}
