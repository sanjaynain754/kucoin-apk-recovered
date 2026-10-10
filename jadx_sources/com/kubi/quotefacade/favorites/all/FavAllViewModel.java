package com.kubi.quotefacade.favorites.all;

import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kucoin.manager.MarketWsHelper;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.entity.AllTradeItemBean;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.quotefacade.entity.MarketListEntityItem;
import com.kubi.quotefacade.entity.TradeSymbolEntity;
import com.kubi.quotefacade.helper.FavAlphaCacheManager;
import com.kubi.quotefacade.helper.FavItem;
import com.kubi.quotefacade.helper.FavTradeCacheConvert;
import com.kubi.quotefacade.helper.QuoteConfigHelper;
import com.kubi.quotefacade.helper.QuoteWSDataController;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import com.kubi.user.api.IUserService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p414kv.C41989e;
import p814yz.C46614a;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
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
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: FavAllViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0014J,\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0007H\u0082@¢\u0006\u0002\u0010!J\u0018\u0010\"\u001a\u00020\u00172\b\b\u0002\u0010#\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010$J\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0082@¢\u0006\u0002\u0010(J\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010*\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u0010+J%\u0010,\u001a\u00020\u00172\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070&2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0002\u0010.J\u0018\u0010/\u001a\u00020\u00172\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010&H\u0002J\"\u00100\u001a\u00020\u00172\b\u00101\u001a\u0004\u0018\u0001022\b\b\u0002\u00103\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u00104J\u0017\u00105\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0002\u00106J\b\u00107\u001a\u00020\u0017H\u0016J\b\u00108\u001a\u00020\u0017H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u00069"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;", "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;", "<init>", "()V", "TAG", "", "repository", "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "wsSpotDataController", "Lcom/kubi/quotefacade/helper/QuoteWSDataController;", "wsFutureDataController", "wsHelper", "Lcom/kubi/kucoin/manager/MarketWsHelper;", "isHide", "", "networkRecovery", "Lcom/kubi/sdk/network/NetworkRecoveryMonitor;", "initState", "getInitState", "()Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;", "dispatchIntentOnIO", "", "intent", "(Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestNetworkRecoveryRefresh", "onCleared", "pinFavDataTop", "favType", "", "symbol", "datasource", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleFavData", "needSubscribe", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTradeListFromCache", "", "Lcom/kubi/quotefacade/entity/AllTradeItemBean;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCacheFavorList", "type", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "favPageDataSubscribe", "symbols", "(Ljava/util/List;Ljava/lang/Integer;)V", "subscribeAlphaWs", "alphaCollectOrCancelCoin", "item", "Lcom/kubi/data/entity/TradeItemBean;", "itemPosition", "(Lcom/kubi/data/entity/TradeItemBean;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAlphaFavTab", "(Ljava/lang/Integer;)Z", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFavAllViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavAllViewModel.kt\ncom/kubi/quotefacade/favorites/all/FavAllViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,260:1\n1068#2:261\n774#2:262\n865#2,2:263\n1617#2,9:265\n1869#2:274\n1870#2:276\n1626#2:277\n774#2:278\n865#2,2:279\n1617#2,9:281\n1869#2:290\n1870#2:292\n1626#2:293\n774#2:294\n865#2,2:295\n1617#2,9:297\n1869#2:306\n1870#2:308\n1626#2:309\n774#2:310\n865#2,2:311\n774#2:313\n865#2,2:314\n774#2:316\n865#2,2:317\n1617#2,9:319\n1869#2:328\n1870#2:331\n1626#2:332\n774#2:333\n865#2,2:334\n1617#2,9:336\n1869#2:345\n1870#2:348\n1626#2:349\n774#2:350\n865#2,2:351\n1617#2,9:353\n1869#2:362\n1870#2:364\n1626#2:365\n1563#2:366\n1634#2,3:367\n1563#2:370\n1634#2,3:371\n1563#2:374\n1634#2,3:375\n1563#2:378\n1634#2,3:379\n1563#2:382\n1634#2,3:383\n1869#2:386\n1870#2:388\n1#3:275\n1#3:291\n1#3:307\n1#3:329\n1#3:330\n1#3:346\n1#3:347\n1#3:363\n1#3:387\n*S KotlinDebug\n*F\n+ 1 FavAllViewModel.kt\ncom/kubi/quotefacade/favorites/all/FavAllViewModel\n*L\n106#1:261\n109#1:262\n109#1:263,2\n109#1:265,9\n109#1:274\n109#1:276\n109#1:277\n110#1:278\n110#1:279,2\n110#1:281,9\n110#1:290\n110#1:292\n110#1:293\n111#1:294\n111#1:295,2\n111#1:297,9\n111#1:306\n111#1:308\n111#1:309\n133#1:310\n133#1:311,2\n135#1:313\n135#1:314,2\n138#1:316\n138#1:317,2\n138#1:319,9\n138#1:328\n138#1:331\n138#1:332\n139#1:333\n139#1:334,2\n139#1:336,9\n139#1:345\n139#1:348\n139#1:349\n140#1:350\n140#1:351,2\n140#1:353,9\n140#1:362\n140#1:364\n140#1:365\n174#1:366\n174#1:367,3\n175#1:370\n175#1:371,3\n177#1:374\n177#1:375,3\n177#1:378\n177#1:379,3\n184#1:382\n184#1:383,3\n187#1:386\n187#1:388\n109#1:275\n110#1:291\n111#1:307\n138#1:330\n139#1:347\n140#1:363\n*E\n"})
public final class FavAllViewModel extends BaseStateVM<FavAllContract$UiIntent, UIState> {

    /* JADX INFO: renamed from: a0 */
    public boolean f41728a0;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final String f41723V = "FavAllViewModel";

    /* JADX INFO: renamed from: W */
    @NotNull
    public final QuoteMarketRepository f41724W = new QuoteMarketRepository();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final QuoteWSDataController f41725X = new QuoteWSDataController();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final QuoteWSDataController f41726Y = new QuoteWSDataController();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MarketWsHelper f41727Z = new MarketWsHelper();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final C46614a f41729b0 = new C46614a("FavAllViewModel", new FavAllViewModel$networkRecovery$1(this));

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.all.FavAllViewModel$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 FavAllViewModel.kt\ncom/kubi/quotefacade/favorites/all/FavAllViewModel\n*L\n1#1,328:1\n106#2:329\n*E\n"})
    public static final class C21949a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Long.valueOf(((AllTradeItemBean) t12).getTimestamp()), Long.valueOf(((AllTradeItemBean) t11).getTimestamp()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.all.FavAllViewModel$dispatchIntentOnIO$1 */
    /* JADX INFO: compiled from: FavAllViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.all.FavAllViewModel", m90122f = "FavAllViewModel.kt", m90123i = {0, 1, 2, 3, 4}, m90124l = {43, 46, 50, 55, 62}, m90125m = "dispatchIntentOnIO", m90126n = {"intent", "intent", "intent", "intent", "intent"}, m90127s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
    public static final class C219501 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C219501(Continuation<? super C219501> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FavAllViewModel.this.dispatchIntentOnIO(null, this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.all.FavAllViewModel$dispatchIntentOnIO$2 */
    /* JADX INFO: compiled from: FavAllViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.all.FavAllViewModel$dispatchIntentOnIO$2", m90122f = "FavAllViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C219512 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        final /* synthetic */ FavAllContract$UiIntent $intent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C219512(FavAllContract$UiIntent favAllContract$UiIntent, Continuation<? super C219512> continuation) {
            super(2, continuation);
            this.$intent = favAllContract$UiIntent;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FavAllViewModel.this.new C219512(this.$intent, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C219512) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                FavAllViewModel.this.send(new C21954b(new Pair(((FavAllContract$UiIntent.CollectOrCancelCoin) this.$intent).getTradeItemBean(), Boxing.boxInt(((FavAllContract$UiIntent.CollectOrCancelCoin) this.$intent).getItemPosition()))));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ Object m51496D(FavAllViewModel favAllViewModel, boolean z11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return favAllViewModel.m51526C(z11, continuation);
    }

    /* JADX INFO: renamed from: E */
    public static final UIState m51497E(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, new Object(), null, null, 6, null);
    }

    /* JADX INFO: renamed from: F */
    public static final UIState m51498F(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, new Object(), null, 5, null);
    }

    /* JADX INFO: renamed from: G */
    public static final UIState m51499G(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, new Object(), null, null, 6, null);
    }

    /* JADX INFO: renamed from: H */
    private final boolean m51500H(Integer num) {
        return num != null && num.intValue() == 5;
    }

    /* JADX INFO: renamed from: I */
    private final Object m51501I(Integer num, String str, String str2, Continuation<? super Unit> continuation) {
        Object objM42824e = RetrofitFlowExKt.m42824e(this.f41724W.m52988X(str, num, str2), false, new FavAllViewModel$pinFavDataTop$2(this, null), continuation, 1, null);
        return objM42824e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM42824e : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public final void m51502J() {
        C44128b.m97266j(this.f41723V, "network recovered: send FetchFavData (All)");
        sendIntent(new FavAllContract$UiIntent.FetchFavData());
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m51503L(FavAllViewModel favAllViewModel, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        favAllViewModel.send(new C21958d(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    private final Object m51518s(final TradeItemBean tradeItemBean, final int i11, Continuation<? super Unit> continuation) {
        SymbolInfoEntity symbolInfoEntity;
        SymbolInfoEntity symbolInfoEntity2;
        StringBuilder sb2 = new StringBuilder();
        String priceIncrement = null;
        sb2.append((tradeItemBean == null || (symbolInfoEntity2 = tradeItemBean.getSymbolInfoEntity()) == null) ? null : symbolInfoEntity2.getFeeCode());
        sb2.append('-');
        if (tradeItemBean != null && (symbolInfoEntity = tradeItemBean.getSymbolInfoEntity()) != null) {
            priceIncrement = symbolInfoEntity.getPriceIncrement();
        }
        sb2.append(priceIncrement);
        Object objM51820o = FavAlphaCacheManager.f41929a.m51820o(sb2.toString(), true, false, new Function1() { // from class: com.kubi.quotefacade.favorites.all.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FavAllViewModel.m51519t(this.f41747b, tradeItemBean, i11, ((Boolean) obj).booleanValue());
            }
        }, continuation);
        return objM51820o == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM51820o : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m51519t(FavAllViewModel favAllViewModel, TradeItemBean tradeItemBean, int i11, boolean z11) {
        if (z11) {
            favAllViewModel.send(new C21954b(new Pair(tradeItemBean, Integer.valueOf(i11))));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000b  */
    /* JADX INFO: renamed from: v */
    private final void m51520v(List<String> list, Integer num) {
        boolean z11;
        if (num != null) {
            z11 = num.intValue() == 1;
        }
        if (list.isEmpty()) {
            if (z11) {
                this.f41725X.m51879c();
                return;
            } else {
                this.f41726Y.m51879c();
                return;
            }
        }
        if (z11) {
            this.f41725X.m51881f(list, new Function1() { // from class: com.kubi.quotefacade.favorites.all.m0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FavAllViewModel.m51521w(this.f41753b, (List) obj);
                }
            });
        } else {
            this.f41726Y.m51880d(list, new Function1() { // from class: com.kubi.quotefacade.favorites.all.n0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FavAllViewModel.m51522x(this.f41755b, (List) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m51521w(FavAllViewModel favAllViewModel, List list) {
        favAllViewModel.send(new C21962f(list));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m51522x(FavAllViewModel favAllViewModel, List list) {
        favAllViewModel.send(new C21960e(list));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final CharSequence m51523z(FavItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSymbol();
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, null, 7, null);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: B */
    public final Object m51525B(Continuation<? super List<AllTradeItemBean>> continuation) {
        FavAllViewModel$getTradeListFromCache$1 favAllViewModel$getTradeListFromCache$1;
        int i11;
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        List list8;
        if (continuation instanceof FavAllViewModel$getTradeListFromCache$1) {
            favAllViewModel$getTradeListFromCache$1 = (FavAllViewModel$getTradeListFromCache$1) continuation;
            int i12 = favAllViewModel$getTradeListFromCache$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                favAllViewModel$getTradeListFromCache$1.label = i12 - Integer.MIN_VALUE;
            } else {
                favAllViewModel$getTradeListFromCache$1 = new FavAllViewModel$getTradeListFromCache$1(this, continuation);
            }
        } else {
            favAllViewModel$getTradeListFromCache$1 = new FavAllViewModel$getTradeListFromCache$1(this, continuation);
        }
        Object objM51529y = favAllViewModel$getTradeListFromCache$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = favAllViewModel$getTradeListFromCache$1.label;
        if (i13 == 0) {
            ResultKt.throwOnFailure(objM51529y);
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            favAllViewModel$getTradeListFromCache$1.L$0 = listCreateListBuilder;
            favAllViewModel$getTradeListFromCache$1.L$1 = listCreateListBuilder;
            favAllViewModel$getTradeListFromCache$1.L$2 = listCreateListBuilder;
            i11 = 0;
            favAllViewModel$getTradeListFromCache$1.I$0 = 0;
            favAllViewModel$getTradeListFromCache$1.label = 1;
            Object objM51529y2 = m51529y(1, favAllViewModel$getTradeListFromCache$1);
            if (objM51529y2 != coroutine_suspended) {
                list = listCreateListBuilder;
                list2 = list;
                objM51529y = objM51529y2;
                list3 = list2;
            }
            return coroutine_suspended;
        }
        if (i13 == 1) {
            i11 = favAllViewModel$getTradeListFromCache$1.I$0;
            list3 = (List) favAllViewModel$getTradeListFromCache$1.L$2;
            list = (List) favAllViewModel$getTradeListFromCache$1.L$1;
            list2 = (List) favAllViewModel$getTradeListFromCache$1.L$0;
            ResultKt.throwOnFailure(objM51529y);
        } else {
            if (i13 == 2) {
                i11 = favAllViewModel$getTradeListFromCache$1.I$0;
                list4 = (List) favAllViewModel$getTradeListFromCache$1.L$2;
                list5 = (List) favAllViewModel$getTradeListFromCache$1.L$1;
                list6 = (List) favAllViewModel$getTradeListFromCache$1.L$0;
                ResultKt.throwOnFailure(objM51529y);
                list4.addAll((Collection) objM51529y);
                if (QuoteConfigHelper.f41987a.m51937q()) {
                    favAllViewModel$getTradeListFromCache$1.L$0 = list6;
                    favAllViewModel$getTradeListFromCache$1.L$1 = SpillingKt.nullOutSpilledVariable(list5);
                    favAllViewModel$getTradeListFromCache$1.L$2 = list5;
                    favAllViewModel$getTradeListFromCache$1.I$0 = i11;
                    favAllViewModel$getTradeListFromCache$1.label = 3;
                    objM51529y = m51529y(5, favAllViewModel$getTradeListFromCache$1);
                    if (objM51529y != coroutine_suspended) {
                        list7 = list5;
                        list8 = list6;
                    }
                    return coroutine_suspended;
                }
                return CollectionsKt.build(list6);
            }
            if (i13 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list7 = (List) favAllViewModel$getTradeListFromCache$1.L$2;
            list8 = (List) favAllViewModel$getTradeListFromCache$1.L$0;
            ResultKt.throwOnFailure(objM51529y);
        }
        list7.addAll((Collection) objM51529y);
        list6 = list8;
        return CollectionsKt.build(list6);
        list3.addAll((Collection) objM51529y);
        favAllViewModel$getTradeListFromCache$1.L$0 = list2;
        favAllViewModel$getTradeListFromCache$1.L$1 = list;
        favAllViewModel$getTradeListFromCache$1.L$2 = list;
        favAllViewModel$getTradeListFromCache$1.I$0 = i11;
        favAllViewModel$getTradeListFromCache$1.label = 2;
        objM51529y = m51529y(2, favAllViewModel$getTradeListFromCache$1);
        if (objM51529y != coroutine_suspended) {
            list4 = list;
            list5 = list4;
            list6 = list2;
            list4.addAll((Collection) objM51529y);
            if (QuoteConfigHelper.f41987a.m51937q()) {
                favAllViewModel$getTradeListFromCache$1.L$0 = list6;
                favAllViewModel$getTradeListFromCache$1.L$1 = SpillingKt.nullOutSpilledVariable(list5);
                favAllViewModel$getTradeListFromCache$1.L$2 = list5;
                favAllViewModel$getTradeListFromCache$1.I$0 = i11;
                favAllViewModel$getTradeListFromCache$1.label = 3;
                objM51529y = m51529y(5, favAllViewModel$getTradeListFromCache$1);
                if (objM51529y != coroutine_suspended) {
                    list7 = list5;
                    list8 = list6;
                    list7.addAll((Collection) objM51529y);
                    list6 = list8;
                }
            }
            return CollectionsKt.build(list6);
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:185:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00db  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:47:0x011a  */
    /* JADX WARN: Code duplicated, block: B:53:0x013d  */
    /* JADX WARN: Code duplicated, block: B:59:0x015d  */
    /* JADX WARN: Code duplicated, block: B:63:0x016f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0182  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a3, code lost:
    
        if (r13 == r1) goto L68;
     */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m51526C(boolean z11, Continuation<? super Unit> continuation) {
        FavAllViewModel$handleFavData$1 favAllViewModel$handleFavData$1;
        List list;
        List list2;
        ArrayList arrayList;
        List<String> arrayList2;
        Iterator it;
        ArrayList arrayList3;
        List<String> arrayList4;
        Iterator it2;
        ArrayList arrayList5;
        List<String> arrayList6;
        Iterator it3;
        String symbol;
        String market;
        String symbol2;
        if (continuation instanceof FavAllViewModel$handleFavData$1) {
            favAllViewModel$handleFavData$1 = (FavAllViewModel$handleFavData$1) continuation;
            int i11 = favAllViewModel$handleFavData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                favAllViewModel$handleFavData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                favAllViewModel$handleFavData$1 = new FavAllViewModel$handleFavData$1(this, continuation);
            }
        } else {
            favAllViewModel$handleFavData$1 = new FavAllViewModel$handleFavData$1(this, continuation);
        }
        Object objM53009y = favAllViewModel$handleFavData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = favAllViewModel$handleFavData$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM53009y);
                ArrayList arrayList7 = new ArrayList();
                if (IUserService.a.get().c()) {
                    arrayList7.clear();
                    QuoteMarketRepository quoteMarketRepository = this.f41724W;
                    favAllViewModel$handleFavData$1.L$0 = SpillingKt.nullOutSpilledVariable(arrayList7);
                    favAllViewModel$handleFavData$1.Z$0 = z11;
                    favAllViewModel$handleFavData$1.label = 2;
                    objM53009y = quoteMarketRepository.m53009y(favAllViewModel$handleFavData$1);
                } else {
                    favAllViewModel$handleFavData$1.L$0 = arrayList7;
                    favAllViewModel$handleFavData$1.Z$0 = z11;
                    favAllViewModel$handleFavData$1.label = 1;
                    Object objM51525B = m51525B(favAllViewModel$handleFavData$1);
                    if (objM51525B != coroutine_suspended) {
                        list = arrayList7;
                        objM53009y = objM51525B;
                        list2 = (List) objM53009y;
                        C44128b.m97266j(this.f41723V, "cache size: " + list2.size() + " ==> " + list2);
                        if (list2.isEmpty()) {
                            Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.all.j0
                                @Override // p852kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return FavAllViewModel.m51497E((UIState) obj);
                                }
                            }));
                        } else {
                            list.clear();
                            list.addAll(CollectionsKt.sortedWith(list2, new C21949a()));
                            send(new C21956c(list));
                            arrayList = new ArrayList();
                            for (Object obj : list2) {
                                if (((AllTradeItemBean) obj).getCollectType() == 2) {
                                    arrayList.add(obj);
                                }
                            }
                            arrayList2 = new ArrayList<>();
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                symbol2 = ((AllTradeItemBean) it.next()).getSymbol();
                                if (symbol2 != null) {
                                    arrayList2.add(symbol2);
                                }
                            }
                            arrayList3 = new ArrayList();
                            for (Object obj2 : list2) {
                                if (((AllTradeItemBean) obj2).getCollectType() == 5) {
                                    arrayList3.add(obj2);
                                }
                            }
                            arrayList4 = new ArrayList<>();
                            it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                market = ((AllTradeItemBean) it2.next()).getSymbolInfoEntity().getMarket();
                                if (market != null) {
                                    arrayList4.add(market);
                                }
                            }
                            arrayList5 = new ArrayList();
                            for (Object obj3 : list2) {
                                if (((AllTradeItemBean) obj3).getCollectType() == 1) {
                                    arrayList5.add(obj3);
                                }
                            }
                            arrayList6 = new ArrayList<>();
                            it3 = arrayList5.iterator();
                            while (it3.hasNext()) {
                                symbol = ((AllTradeItemBean) it3.next()).getSymbol();
                                if (symbol != null) {
                                    arrayList6.add(symbol);
                                }
                            }
                            if (z11) {
                                m51520v(arrayList6, Boxing.boxInt(1));
                                m51520v(arrayList2, Boxing.boxInt(2));
                                m51527K(arrayList4);
                            }
                        }
                    }
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                z11 = favAllViewModel$handleFavData$1.Z$0;
                list = (List) favAllViewModel$handleFavData$1.L$0;
                ResultKt.throwOnFailure(objM53009y);
                list2 = (List) objM53009y;
                C44128b.m97266j(this.f41723V, "cache size: " + list2.size() + " ==> " + list2);
                if (list2.isEmpty()) {
                    list.clear();
                    list.addAll(CollectionsKt.sortedWith(list2, new C21949a()));
                    send(new C21956c(list));
                    arrayList = new ArrayList();
                    while (r1.hasNext()) {
                        if (((AllTradeItemBean) obj).getCollectType() == 2) {
                            arrayList.add(obj);
                        }
                    }
                    arrayList2 = new ArrayList<>();
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        symbol2 = ((AllTradeItemBean) it.next()).getSymbol();
                        if (symbol2 != null) {
                            arrayList2.add(symbol2);
                        }
                    }
                    arrayList3 = new ArrayList();
                    while (r2.hasNext()) {
                        if (((AllTradeItemBean) obj2).getCollectType() == 5) {
                            arrayList3.add(obj2);
                        }
                    }
                    arrayList4 = new ArrayList<>();
                    it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        market = ((AllTradeItemBean) it2.next()).getSymbolInfoEntity().getMarket();
                        if (market != null) {
                            arrayList4.add(market);
                        }
                    }
                    arrayList5 = new ArrayList();
                    while (r13.hasNext()) {
                        if (((AllTradeItemBean) obj3).getCollectType() == 1) {
                            arrayList5.add(obj3);
                        }
                    }
                    arrayList6 = new ArrayList<>();
                    it3 = arrayList5.iterator();
                    while (it3.hasNext()) {
                        symbol = ((AllTradeItemBean) it3.next()).getSymbol();
                        if (symbol != null) {
                            arrayList6.add(symbol);
                        }
                    }
                    if (z11) {
                        m51520v(arrayList6, Boxing.boxInt(1));
                        m51520v(arrayList2, Boxing.boxInt(2));
                        m51527K(arrayList4);
                    }
                } else {
                    Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.all.j0
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            return FavAllViewModel.m51497E((UIState) obj4);
                        }
                    }));
                }
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z11 = favAllViewModel$handleFavData$1.Z$0;
                ResultKt.throwOnFailure(objM53009y);
                List list3 = (List) objM53009y;
                if (list3 == null || list3.isEmpty()) {
                    updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.all.l0
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            return FavAllViewModel.m51499G((UIState) obj4);
                        }
                    });
                    return Unit.INSTANCE;
                }
                ArrayList arrayList8 = new ArrayList();
                for (Object obj4 : list3) {
                    if (CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(1), Boxing.boxInt(2), Boxing.boxInt(5)}).contains(Boxing.boxInt(((AllTradeItemBean) obj4).getCollectType()))) {
                        arrayList8.add(obj4);
                    }
                }
                if (!QuoteConfigHelper.f41987a.m51937q()) {
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj5 : arrayList8) {
                        if (((AllTradeItemBean) obj5).getCollectType() != 5) {
                            arrayList9.add(obj5);
                        }
                    }
                    arrayList8 = arrayList9;
                }
                ArrayList arrayList10 = new ArrayList();
                for (Object obj6 : arrayList8) {
                    if (((AllTradeItemBean) obj6).getCollectType() == 1) {
                        arrayList10.add(obj6);
                    }
                }
                List<String> arrayList11 = new ArrayList<>();
                Iterator it4 = arrayList10.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    String symbol3 = ((AllTradeItemBean) it4.next()).getSymbol();
                    String str = symbol3.length() != 0 ? symbol3 : null;
                    if (str != null) {
                        arrayList11.add(str);
                    }
                }
                ArrayList arrayList12 = new ArrayList();
                for (Object obj7 : arrayList8) {
                    if (((AllTradeItemBean) obj7).getCollectType() == 2) {
                        arrayList12.add(obj7);
                    }
                }
                List<String> arrayList13 = new ArrayList<>();
                Iterator it5 = arrayList12.iterator();
                while (it5.hasNext()) {
                    String symbol4 = ((AllTradeItemBean) it5.next()).getSymbol();
                    if (symbol4.length() == 0) {
                        symbol4 = null;
                    }
                    if (symbol4 != null) {
                        arrayList13.add(symbol4);
                    }
                }
                ArrayList arrayList14 = new ArrayList();
                for (Object obj8 : arrayList8) {
                    if (((AllTradeItemBean) obj8).getCollectType() == 5) {
                        arrayList14.add(obj8);
                    }
                }
                List<String> arrayList15 = new ArrayList<>();
                Iterator it6 = arrayList14.iterator();
                while (it6.hasNext()) {
                    SymbolInfoEntity symbolInfoEntity = ((AllTradeItemBean) it6.next()).getSymbolInfoEntity();
                    String market2 = symbolInfoEntity != null ? symbolInfoEntity.getMarket() : null;
                    if (market2 != null) {
                        arrayList15.add(market2);
                    }
                }
                send(new C21956c(arrayList8));
                if (z11) {
                    m51520v(arrayList11, Boxing.boxInt(1));
                    m51520v(arrayList13, Boxing.boxInt(2));
                    m51527K(arrayList15);
                }
            }
            return Unit.INSTANCE;
        } catch (Exception unused) {
            updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.all.k0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj9) {
                    return FavAllViewModel.m51498F((UIState) obj9);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m51527K(List<String> list) {
        if (this.f41728a0 || list == null) {
            return;
        }
        MarketWsHelper.m32538x(this.f41727Z, list, null, 0L, new Function1() { // from class: com.kubi.quotefacade.favorites.all.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FavAllViewModel.m51503L(this.f41745b, (List) obj);
            }
        }, 6, null);
    }

    @Override // com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        this.f41729b0.m102779e();
        super.onCleared();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        this.f41729b0.m102780f();
        super.onHide();
        this.f41728a0 = true;
        this.f41725X.m51879c();
        this.f41726Y.m51879c();
        this.f41727Z.m32541F();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (m51526C(true, r4) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
    
        if (m51501I(r1, r2, r10, r4) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d5, code lost:
    
        if (m51518s(r1, r10, r4) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0106, code lost:
    
        if (com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42826g(r1, false, r3, r4, 1, null) == r0) goto L55;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntentOnIO(@NotNull FavAllContract$UiIntent favAllContract$UiIntent, @NotNull Continuation<? super Unit> continuation) {
        C219501 c219501;
        if (continuation instanceof C219501) {
            c219501 = (C219501) continuation;
            int i11 = c219501.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c219501.label = i11 - Integer.MIN_VALUE;
            } else {
                c219501 = new C219501(continuation);
            }
        } else {
            c219501 = new C219501(continuation);
        }
        C219501 c219502 = c219501;
        Object obj = c219502.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c219502.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c219502.L$0 = favAllContract$UiIntent;
            c219502.label = 1;
            if (super.dispatchIntentOnIO(favAllContract$UiIntent, c219502) != coroutine_suspended) {
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
        favAllContract$UiIntent = (FavAllContract$UiIntent) c219502.L$0;
        ResultKt.throwOnFailure(obj);
        if (favAllContract$UiIntent instanceof FavAllContract$UiIntent.FetchFavData) {
            c219502.L$0 = SpillingKt.nullOutSpilledVariable(favAllContract$UiIntent);
            c219502.label = 2;
        } else {
            if (!(favAllContract$UiIntent instanceof FavAllContract$UiIntent.PinItemToTop)) {
                if (favAllContract$UiIntent instanceof FavAllContract$UiIntent.CollectOrCancelCoin) {
                    FavAllContract$UiIntent.CollectOrCancelCoin collectOrCancelCoin = (FavAllContract$UiIntent.CollectOrCancelCoin) favAllContract$UiIntent;
                    if (m51500H(collectOrCancelCoin.getFavType())) {
                        TradeItemBean tradeItemBean = collectOrCancelCoin.getTradeItemBean();
                        int itemPosition = collectOrCancelCoin.getItemPosition();
                        c219502.L$0 = SpillingKt.nullOutSpilledVariable(favAllContract$UiIntent);
                        c219502.label = 4;
                    } else {
                        QuoteMarketRepository quoteMarketRepository = this.f41724W;
                        TradeItemBean tradeItemBean2 = collectOrCancelCoin.getTradeItemBean();
                        InterfaceC41634e<Object> interfaceC41634eM52994h = quoteMarketRepository.m52994h(tradeItemBean2 != null ? tradeItemBean2.getSymbol() : null, collectOrCancelCoin.getFavType());
                        C219512 c219512 = new C219512(favAllContract$UiIntent, null);
                        c219502.L$0 = SpillingKt.nullOutSpilledVariable(favAllContract$UiIntent);
                        c219502.label = 5;
                    }
                } else if (favAllContract$UiIntent instanceof FavAllContract$UiIntent.UpdateSubscribe) {
                    FavAllContract$UiIntent.UpdateSubscribe updateSubscribe = (FavAllContract$UiIntent.UpdateSubscribe) favAllContract$UiIntent;
                    m51520v(updateSubscribe.getSymbols(), updateSubscribe.getFavType());
                    Unit unit = Unit.INSTANCE;
                } else {
                    if (!(favAllContract$UiIntent instanceof FavAllContract$UiIntent.UpdateSubscribeAlpha)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    m51527K(((FavAllContract$UiIntent.UpdateSubscribeAlpha) favAllContract$UiIntent).getTokenBridgeId());
                    Unit unit2 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            FavAllContract$UiIntent.PinItemToTop pinItemToTop = (FavAllContract$UiIntent.PinItemToTop) favAllContract$UiIntent;
            Integer favType = pinItemToTop.getFavType();
            String symbol = pinItemToTop.getSymbol();
            String datasource = pinItemToTop.getDatasource();
            c219502.L$0 = SpillingKt.nullOutSpilledVariable(favAllContract$UiIntent);
            c219502.label = 3;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0110 A[LOOP:0: B:33:0x010a->B:35:0x0110, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0178 A[LOOP:4: B:45:0x0172->B:47:0x0178, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x021b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: y */
    public final Object m51529y(int i11, Continuation<? super List<AllTradeItemBean>> continuation) {
        FavAllViewModel$getCacheFavorList$1 favAllViewModel$getCacheFavorList$1;
        List<FavItem> list;
        List<FavItem> list2;
        List<AllTradeItemBean> arrayList;
        Iterator it;
        TradeSymbolEntity tradeSymbolEntity;
        List<MarketListEntityItem> spots;
        Object next;
        Iterator it2;
        int i12 = i11;
        if (continuation instanceof FavAllViewModel$getCacheFavorList$1) {
            favAllViewModel$getCacheFavorList$1 = (FavAllViewModel$getCacheFavorList$1) continuation;
            int i13 = favAllViewModel$getCacheFavorList$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                favAllViewModel$getCacheFavorList$1.label = i13 - Integer.MIN_VALUE;
            } else {
                favAllViewModel$getCacheFavorList$1 = new FavAllViewModel$getCacheFavorList$1(this, continuation);
            }
        } else {
            favAllViewModel$getCacheFavorList$1 = new FavAllViewModel$getCacheFavorList$1(this, continuation);
        }
        Object objM52986U = favAllViewModel$getCacheFavorList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = favAllViewModel$getCacheFavorList$1.label;
        if (i14 == 0) {
            ResultKt.throwOnFailure(objM52986U);
            List<FavItem> listM51957c = FavTradeCacheConvert.f42000a.m51957c(Boxing.boxInt(i12));
            C44128b.m97266j(this.f41723V, "getCacheFavorList type=" + i12 + ". favItems=" + listM51957c);
            if (listM51957c.isEmpty()) {
                return CollectionsKt.emptyList();
            }
            String strJoinToString$default = CollectionsKt.joinToString$default(listM51957c, ",", null, null, 0, null, new Function1() { // from class: com.kubi.quotefacade.favorites.all.o0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FavAllViewModel.m51523z((FavItem) obj);
                }
            }, 30, null);
            C44128b.m97266j(this.f41723V, "joinedSymbols = " + strJoinToString$default);
            if (i12 == 1) {
                QuoteMarketRepository quoteMarketRepository = this.f41724W;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM51957c, 10));
                Iterator<T> it3 = listM51957c.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((FavItem) it3.next()).getSymbol());
                }
                favAllViewModel$getCacheFavorList$1.L$0 = listM51957c;
                favAllViewModel$getCacheFavorList$1.L$1 = SpillingKt.nullOutSpilledVariable(strJoinToString$default);
                favAllViewModel$getCacheFavorList$1.I$0 = i12;
                favAllViewModel$getCacheFavorList$1.label = 3;
                objM52986U = quoteMarketRepository.m52986U(arrayList2, favAllViewModel$getCacheFavorList$1);
                if (objM52986U != coroutine_suspended) {
                    list = listM51957c;
                    tradeSymbolEntity = (TradeSymbolEntity) objM52986U;
                    if (tradeSymbolEntity != null) {
                        arrayList = CollectionsKt.emptyList();
                    } else {
                        arrayList = CollectionsKt.emptyList();
                    }
                }
            } else if (i12 == 2) {
                QuoteMarketRepository quoteMarketRepository2 = this.f41724W;
                favAllViewModel$getCacheFavorList$1.L$0 = listM51957c;
                favAllViewModel$getCacheFavorList$1.L$1 = SpillingKt.nullOutSpilledVariable(strJoinToString$default);
                favAllViewModel$getCacheFavorList$1.I$0 = i12;
                favAllViewModel$getCacheFavorList$1.label = 1;
                objM52986U = quoteMarketRepository2.m52980O(strJoinToString$default, favAllViewModel$getCacheFavorList$1);
                if (objM52986U != coroutine_suspended) {
                    list2 = listM51957c;
                    arrayList = (List) objM52986U;
                    list = list2;
                }
            } else if (i12 != 5) {
                QuoteMarketRepository quoteMarketRepository3 = this.f41724W;
                Integer numBoxInt = Boxing.boxInt(i12);
                favAllViewModel$getCacheFavorList$1.L$0 = listM51957c;
                favAllViewModel$getCacheFavorList$1.L$1 = SpillingKt.nullOutSpilledVariable(strJoinToString$default);
                favAllViewModel$getCacheFavorList$1.I$0 = i12;
                favAllViewModel$getCacheFavorList$1.label = 4;
                objM52986U = quoteMarketRepository3.m52979N(strJoinToString$default, "android/trade_list", numBoxInt, favAllViewModel$getCacheFavorList$1);
                if (objM52986U != coroutine_suspended) {
                    list = listM51957c;
                    Iterable iterable = (Iterable) objM52986U;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(C41989e.m92069a(new AllTradeItemBean(0, 0L, null, 7, null), (TradeItemBean) it2.next(), i12));
                    }
                }
            } else {
                QuoteMarketRepository quoteMarketRepository4 = this.f41724W;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM51957c, 10));
                Iterator<T> it4 = listM51957c.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((FavItem) it4.next()).getSymbol());
                }
                favAllViewModel$getCacheFavorList$1.L$0 = listM51957c;
                favAllViewModel$getCacheFavorList$1.L$1 = SpillingKt.nullOutSpilledVariable(strJoinToString$default);
                favAllViewModel$getCacheFavorList$1.I$0 = i12;
                favAllViewModel$getCacheFavorList$1.label = 2;
                objM52986U = quoteMarketRepository4.m53003s("Alpha", arrayList3, favAllViewModel$getCacheFavorList$1);
                if (objM52986U != coroutine_suspended) {
                    list2 = listM51957c;
                    Iterable iterable2 = (Iterable) objM52986U;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                    it = iterable2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C41989e.m92070b(new AllTradeItemBean(0, 0L, null, 7, null), (AlphaItemEntity) it.next(), 5));
                    }
                    list = list2;
                }
            }
            return coroutine_suspended;
        }
        if (i14 == 1) {
            list2 = (List) favAllViewModel$getCacheFavorList$1.L$0;
            ResultKt.throwOnFailure(objM52986U);
            arrayList = (List) objM52986U;
            list = list2;
        } else if (i14 == 2) {
            list2 = (List) favAllViewModel$getCacheFavorList$1.L$0;
            ResultKt.throwOnFailure(objM52986U);
            Iterable iterable3 = (Iterable) objM52986U;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable3, 10));
            it = iterable3.iterator();
            while (it.hasNext()) {
                arrayList.add(C41989e.m92070b(new AllTradeItemBean(0, 0L, null, 7, null), (AlphaItemEntity) it.next(), 5));
            }
            list = list2;
        } else if (i14 == 3) {
            i12 = favAllViewModel$getCacheFavorList$1.I$0;
            list = (List) favAllViewModel$getCacheFavorList$1.L$0;
            ResultKt.throwOnFailure(objM52986U);
            tradeSymbolEntity = (TradeSymbolEntity) objM52986U;
            if (tradeSymbolEntity != null || (spots = tradeSymbolEntity.getSpots()) == null) {
                arrayList = CollectionsKt.emptyList();
            } else {
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(spots, 10));
                Iterator<T> it5 = spots.iterator();
                while (it5.hasNext()) {
                    arrayList.add(C41989e.m92071c(new AllTradeItemBean(0, 0L, null, 7, null), (MarketListEntityItem) it5.next(), i12));
                }
            }
        } else {
            if (i14 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = favAllViewModel$getCacheFavorList$1.I$0;
            list = (List) favAllViewModel$getCacheFavorList$1.L$0;
            ResultKt.throwOnFailure(objM52986U);
            Iterable iterable4 = (Iterable) objM52986U;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable4, 10));
            it2 = iterable4.iterator();
            while (it2.hasNext()) {
                arrayList.add(C41989e.m92069a(new AllTradeItemBean(0, 0L, null, 7, null), (TradeItemBean) it2.next(), i12));
            }
        }
        if (arrayList.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        for (AllTradeItemBean allTradeItemBean : arrayList) {
            Iterator<T> it6 = list.iterator();
            do {
                if (!it6.hasNext()) {
                    next = null;
                    break;
                }
                next = it6.next();
            } while (!Intrinsics.areEqual(((FavItem) next).getSymbol(), allTradeItemBean.getSymbol()));
            FavItem favItem = (FavItem) next;
            if (favItem != null) {
                allTradeItemBean.setTimestamp(favItem.getTimestamp());
            }
        }
        return arrayList;
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        this.f41728a0 = false;
        this.f41729b0.m102781g();
    }
}
