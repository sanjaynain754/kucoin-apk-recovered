package com.kubi.quotefacade.favorites.recommend;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.kucoin.manager.MarketWsHelper;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.quotefacade.entity.RecommendItemBean;
import com.kubi.quotefacade.entity.RecommendQuoteEntity;
import com.kubi.quotefacade.event.RecommendCommonContract$UiIntent;
import com.kubi.quotefacade.event.UIState;
import com.kubi.quotefacade.helper.FavAlphaCacheManager;
import com.kubi.quotefacade.helper.FavTradeCacheConvert;
import com.kubi.quotefacade.helper.QuoteWSDataController;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27041f;
import cv.C36550g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p212dv.C36982v;
import p212dv.C36983w;
import p212dv.C36984x;
import p321hv.InterfaceC38356f;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
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
import ro.C44128b;

/* JADX INFO: compiled from: RecommendCommonViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\"J\u0018\u0010#\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010%H\u0082@¢\u0006\u0002\u0010&J\u0016\u0010'\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0082@¢\u0006\u0002\u0010(J\u0018\u0010)\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010%H\u0082@¢\u0006\u0002\u0010&J\u0018\u0010*\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010%H\u0082@¢\u0006\u0002\u0010&J\u0017\u0010+\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0002\u0010,J\u0010\u0010-\u001a\u00020 2\u0006\u0010!\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020 H\u0016R$\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00060"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/recommend/RecommendCommonViewModel;", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/quotefacade/event/RecommendCommonContract$UiIntent;", "Lcom/kubi/quotefacade/event/RecommendCommonContract$UIState;", "<init>", "()V", "repository", "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "getRepository$annotations", "getRepository", "()Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "setRepository", "(Lcom/kubi/quotefacade/repository/QuoteMarketRepository;)V", "wsDataController", "Lcom/kubi/quotefacade/helper/QuoteWSDataController;", "wsHelper", "Lcom/kubi/kucoin/manager/MarketWsHelper;", "initState", "getInitState", "()Lcom/kubi/quotefacade/event/RecommendCommonContract$UIState;", "selector", "Lcom/kubi/quotefacade/entity/Selector;", "", "getSelector", "()Lcom/kubi/quotefacade/entity/Selector;", "selector$delegate", "Lkotlin/Lazy;", "selectorInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getSelectorInitialized", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "dispatchIntentOnIO", "", "intent", "(Lcom/kubi/quotefacade/event/RecommendCommonContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleRecommendData", "favType", "", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleRecommendDataAlpha", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addFavorSymbol", "addFavorAlpha", "refreshSelector", "(Ljava/lang/Integer;)V", "changeSelectState", "Lcom/kubi/quotefacade/event/RecommendCommonContract$UiIntent$ChangeSelectState;", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRecommendCommonViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendCommonViewModel.kt\ncom/kubi/quotefacade/favorites/recommend/RecommendCommonViewModel\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,287:1\n17#2,2:288\n1563#3:290\n1634#3,3:291\n774#3:294\n865#3,2:295\n1563#3:297\n1634#3,3:298\n1563#3:301\n1634#3,3:302\n774#3:305\n865#3,2:306\n1563#3:308\n1634#3,3:309\n1563#3:312\n1634#3,3:313\n1563#3:316\n1634#3,3:317\n1563#3:323\n1634#3,3:324\n1563#3:327\n1634#3,3:328\n25#4:320\n26#4:322\n1#5:321\n*S KotlinDebug\n*F\n+ 1 RecommendCommonViewModel.kt\ncom/kubi/quotefacade/favorites/recommend/RecommendCommonViewModel\n*L\n67#1:288,2\n109#1:290\n109#1:291,3\n118#1:294\n118#1:295,2\n125#1:297\n125#1:298,3\n165#1:301\n165#1:302,3\n173#1:305\n173#1:306,2\n176#1:308\n176#1:309,3\n191#1:312\n191#1:313,3\n213#1:316\n213#1:317,3\n235#1:323\n235#1:324,3\n271#1:327\n271#1:328,3\n225#1:320\n225#1:322\n225#1:321\n*E\n"})
public final class RecommendCommonViewModel extends BaseStateVM<RecommendCommonContract$UiIntent, UIState> {

    /* JADX INFO: renamed from: V */
    @NotNull
    public QuoteMarketRepository f41860V = new QuoteMarketRepository();

    /* JADX INFO: renamed from: W */
    @NotNull
    public final QuoteWSDataController f41861W = new QuoteWSDataController();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MarketWsHelper f41862X = new MarketWsHelper();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f41863Y = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.favorites.recommend.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecommendCommonViewModel.m51694Y();
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final AtomicBoolean f41864Z = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.recommend.RecommendCommonViewModel$dispatchIntentOnIO$1 */
    /* JADX INFO: compiled from: RecommendCommonViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.recommend.RecommendCommonViewModel", m90122f = "RecommendCommonViewModel.kt", m90123i = {0, 1, 2}, m90124l = {64, 68, 75}, m90125m = "dispatchIntentOnIO", m90126n = {"intent", "intent", "intent"}, m90127s = {"L$0", "L$0", "L$0"})
    public static final class C220691 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C220691(Continuation<? super C220691> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RecommendCommonViewModel.this.dispatchIntentOnIO(null, this);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m51718X(Integer num) {
        C12572a.m23695d("refresh_favor_page", num, 0L, 4, null);
        this.f41861W.m51879c();
        this.f41862X.m32541F();
        this.f41864Z.compareAndSet(true, false);
        m51715M().m81820e(CollectionsKt.emptyList());
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m51682E(RecommendCommonViewModel recommendCommonViewModel, Integer num, boolean z11) {
        if (z11) {
            recommendCommonViewModel.m51718X(num);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static final UIState m51684I(List list, RecommendCommonViewModel recommendCommonViewModel, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, CollectionsKt.toMutableList((Collection) list), recommendCommonViewModel.m51715M().m81817b().size(), null, 4, null);
    }

    /* JADX INFO: renamed from: K */
    public static final UIState m51685K(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, 0, new Object(), 3, null);
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m51686O(RecommendCommonViewModel recommendCommonViewModel, List list) {
        recommendCommonViewModel.send(new C36983w(list));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P */
    public static final UIState m51687P(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, 0, new Object(), 3, null);
    }

    /* JADX INFO: renamed from: Q */
    public static final UIState m51688Q(List list, RecommendCommonViewModel recommendCommonViewModel, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, list, recommendCommonViewModel.m51715M().m81817b().size(), null, 4, null);
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m51689R(RecommendCommonViewModel recommendCommonViewModel, List list) {
        recommendCommonViewModel.send(new C36984x(list));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T */
    public static final UIState m51690T(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, 0, new Object(), 3, null);
    }

    /* JADX INFO: renamed from: U */
    public static final UIState m51691U(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, 0, new Object(), 3, null);
    }

    /* JADX INFO: renamed from: V */
    public static final UIState m51692V(List list, RecommendCommonViewModel recommendCommonViewModel, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, list, recommendCommonViewModel.m51715M().m81817b().size(), null, 4, null);
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m51693W(RecommendCommonViewModel recommendCommonViewModel, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        recommendCommonViewModel.send(new C36982v(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y */
    public static final C36550g m51694Y() {
        return new C36550g();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: D */
    public final Object m51710D(final Integer num, Continuation<? super Unit> continuation) {
        RecommendCommonViewModel$addFavorAlpha$1 recommendCommonViewModel$addFavorAlpha$1;
        if (continuation instanceof RecommendCommonViewModel$addFavorAlpha$1) {
            recommendCommonViewModel$addFavorAlpha$1 = (RecommendCommonViewModel$addFavorAlpha$1) continuation;
            int i11 = recommendCommonViewModel$addFavorAlpha$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                recommendCommonViewModel$addFavorAlpha$1.label = i11 - Integer.MIN_VALUE;
            } else {
                recommendCommonViewModel$addFavorAlpha$1 = new RecommendCommonViewModel$addFavorAlpha$1(this, continuation);
            }
        } else {
            recommendCommonViewModel$addFavorAlpha$1 = new RecommendCommonViewModel$addFavorAlpha$1(this, continuation);
        }
        Object obj = recommendCommonViewModel$addFavorAlpha$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = recommendCommonViewModel$addFavorAlpha$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                List<String> listM81817b = m51715M().m81817b();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM81817b, 10));
                Iterator<T> it = listM81817b.iterator();
                while (it.hasNext()) {
                    arrayList.add(C27041f.m66668h((String) it.next()));
                }
                if (BQuoteFacadeDepend.f42592a.m53025e().c()) {
                    QuoteMarketRepository quoteMarketRepository = this.f41860V;
                    recommendCommonViewModel$addFavorAlpha$1.L$0 = num;
                    recommendCommonViewModel$addFavorAlpha$1.L$1 = SpillingKt.nullOutSpilledVariable(arrayList);
                    recommendCommonViewModel$addFavorAlpha$1.label = 1;
                    if (quoteMarketRepository.m52992f(arrayList, recommendCommonViewModel$addFavorAlpha$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    FavAlphaCacheManager.f41929a.m51812F(arrayList, new Function1() { // from class: com.kubi.quotefacade.favorites.recommend.n
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return RecommendCommonViewModel.m51682E(this.f41880b, num, ((Boolean) obj2).booleanValue());
                        }
                    });
                }
                return Unit.INSTANCE;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            num = (Integer) recommendCommonViewModel$addFavorAlpha$1.L$0;
            ResultKt.throwOnFailure(obj);
            m51718X(num);
        } catch (Exception e11) {
            C44128b.m97264h(e11);
            if ((e11 instanceof ApiException) && Intrinsics.areEqual(((ApiException) e11).code, "420000")) {
                ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.rank_fav_limit, Boxing.boxInt(150)), new Object[0]);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
    
        if (r2 == r3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0104, code lost:
    
        if (m51710D(r18, r7) == r3) goto L44;
     */
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m51711F(Integer num, Continuation<? super Unit> continuation) {
        RecommendCommonViewModel$addFavorSymbol$1 recommendCommonViewModel$addFavorSymbol$1;
        if (continuation instanceof RecommendCommonViewModel$addFavorSymbol$1) {
            recommendCommonViewModel$addFavorSymbol$1 = (RecommendCommonViewModel$addFavorSymbol$1) continuation;
            int i11 = recommendCommonViewModel$addFavorSymbol$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                recommendCommonViewModel$addFavorSymbol$1.label = i11 - Integer.MIN_VALUE;
            } else {
                recommendCommonViewModel$addFavorSymbol$1 = new RecommendCommonViewModel$addFavorSymbol$1(this, continuation);
            }
        } else {
            recommendCommonViewModel$addFavorSymbol$1 = new RecommendCommonViewModel$addFavorSymbol$1(this, continuation);
        }
        RecommendCommonViewModel$addFavorSymbol$1 recommendCommonViewModel$addFavorSymbol$2 = recommendCommonViewModel$addFavorSymbol$1;
        Object objM42826g = recommendCommonViewModel$addFavorSymbol$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = recommendCommonViewModel$addFavorSymbol$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42826g);
            if ((num != null && num.intValue() == 6) || (num != null && num.intValue() == 7)) {
                recommendCommonViewModel$addFavorSymbol$2.L$0 = SpillingKt.nullOutSpilledVariable(num);
                recommendCommonViewModel$addFavorSymbol$2.label = 1;
            } else {
                String strJoinToString$default = CollectionsKt.joinToString$default(m51715M().m81817b(), ",", null, null, 0, null, new Function1() { // from class: com.kubi.quotefacade.favorites.recommend.q
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RecommendCommonViewModel.m51683G((String) obj);
                    }
                }, 30, null);
                if (BQuoteFacadeDepend.f42592a.m53025e().c()) {
                    InterfaceC41634e<Object> interfaceC41634eM52994h = this.f41860V.m52994h(strJoinToString$default, num);
                    RecommendCommonViewModel$addFavorSymbol$2 recommendCommonViewModel$addFavorSymbol$3 = new RecommendCommonViewModel$addFavorSymbol$2(strJoinToString$default, this, num, null);
                    recommendCommonViewModel$addFavorSymbol$2.L$0 = SpillingKt.nullOutSpilledVariable(num);
                    recommendCommonViewModel$addFavorSymbol$2.L$1 = SpillingKt.nullOutSpilledVariable(strJoinToString$default);
                    recommendCommonViewModel$addFavorSymbol$2.label = 2;
                    objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM52994h, false, recommendCommonViewModel$addFavorSymbol$3, recommendCommonViewModel$addFavorSymbol$2, 1, null);
                } else {
                    List<String> listM81817b = m51715M().m81817b();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM81817b, 10));
                    for (String str : listM81817b) {
                        TradeItemBean tradeItemBean = new TradeItemBean();
                        tradeItemBean.setSymbol(str);
                        arrayList.add(tradeItemBean);
                    }
                    FavTradeCacheConvert.f42000a.m51958d(num, arrayList);
                    m51718X(num);
                }
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM42826g);
            return Unit.INSTANCE;
        }
        if (i12 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objM42826g);
        Throwable throwable = ((C19334f) objM42826g).getThrowable();
        if (throwable != null) {
            C44128b.m97264h(throwable);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public final void m51712H(RecommendCommonContract$UiIntent.ChangeSelectState changeSelectState) {
        ArrayList arrayList;
        List<RecommendItemBean> list;
        m51715M().m81819d(changeSelectState.getSymbolCode());
        List<RecommendItemBean> recommendBeanList = getState().getRecommendBeanList();
        if (recommendBeanList == null || (list = CollectionsKt.toList(recommendBeanList)) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (RecommendItemBean recommendItemBean : list) {
                arrayList.add(RecommendItemBean.copy$default(recommendItemBean, null, null, null, null, null, null, null, null, Boolean.valueOf(m51715M().m81818c(C27041f.m66668h(recommendItemBean.getSymbolCode()))), null, null, null, 3839, null));
            }
        }
        final List listM66560c = C27024b.m66560c(arrayList);
        updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.recommend.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendCommonViewModel.m51684I(listM66560c, this, (UIState) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (m51716N(r8, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        if (m51711F(r8, r0) == r1) goto L37;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntentOnIO(@NotNull RecommendCommonContract$UiIntent recommendCommonContract$UiIntent, @NotNull Continuation<? super Unit> continuation) {
        C220691 c220691;
        if (continuation instanceof C220691) {
            c220691 = (C220691) continuation;
            int i11 = c220691.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c220691.label = i11 - Integer.MIN_VALUE;
            } else {
                c220691 = new C220691(continuation);
            }
        } else {
            c220691 = new C220691(continuation);
        }
        Object obj = c220691.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c220691.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c220691.L$0 = recommendCommonContract$UiIntent;
            c220691.label = 1;
            if (super.dispatchIntentOnIO(recommendCommonContract$UiIntent, c220691) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        recommendCommonContract$UiIntent = (RecommendCommonContract$UiIntent) c220691.L$0;
        ResultKt.throwOnFailure(obj);
        if (recommendCommonContract$UiIntent instanceof RecommendCommonContract$UiIntent.FetchRecommendData) {
            Object objM56186h = Router.f46192a.m56186h(InterfaceC38356f.class, SiteInfoManager.f47913a.m58109c());
            if (!(objM56186h != null ? ((InterfaceC38356f) objM56186h).m86549c() : true)) {
                Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.recommend.k
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RecommendCommonViewModel.m51685K((UIState) obj2);
                    }
                }));
                return Unit.INSTANCE;
            }
            Integer favType = ((RecommendCommonContract$UiIntent.FetchRecommendData) recommendCommonContract$UiIntent).getFavType();
            c220691.L$0 = SpillingKt.nullOutSpilledVariable(recommendCommonContract$UiIntent);
            c220691.label = 2;
        } else {
            if (!(recommendCommonContract$UiIntent instanceof RecommendCommonContract$UiIntent.AddFavorSymbol)) {
                if (!(recommendCommonContract$UiIntent instanceof RecommendCommonContract$UiIntent.ChangeSelectState)) {
                    throw new NoWhenBranchMatchedException();
                }
                m51712H((RecommendCommonContract$UiIntent.ChangeSelectState) recommendCommonContract$UiIntent);
                return Unit.INSTANCE;
            }
            Integer favType2 = ((RecommendCommonContract$UiIntent.AddFavorSymbol) recommendCommonContract$UiIntent).getFavType();
            c220691.L$0 = SpillingKt.nullOutSpilledVariable(recommendCommonContract$UiIntent);
            c220691.label = 3;
        }
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, 0, null, 7, null);
    }

    /* JADX INFO: renamed from: M */
    public final C36550g<String> m51715M() {
        return (C36550g) this.f41863Y.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        if (r12 == r1) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
    
        if (r12 == r1) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b8, code lost:
    
        if (r12 == r1) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01dc, code lost:
    
        if (m51717S(r12, r0) == r1) goto L95;
     */
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m51716N(Integer num, Continuation<? super Unit> continuation) {
        RecommendCommonViewModel$handleRecommendData$1 recommendCommonViewModel$handleRecommendData$1;
        List<RecommendQuoteEntity> listEmptyList;
        if (continuation instanceof RecommendCommonViewModel$handleRecommendData$1) {
            recommendCommonViewModel$handleRecommendData$1 = (RecommendCommonViewModel$handleRecommendData$1) continuation;
            int i11 = recommendCommonViewModel$handleRecommendData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                recommendCommonViewModel$handleRecommendData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                recommendCommonViewModel$handleRecommendData$1 = new RecommendCommonViewModel$handleRecommendData$1(this, continuation);
            }
        } else {
            recommendCommonViewModel$handleRecommendData$1 = new RecommendCommonViewModel$handleRecommendData$1(this, continuation);
        }
        Object objM52982Q = recommendCommonViewModel$handleRecommendData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = recommendCommonViewModel$handleRecommendData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM52982Q);
            if ((num != null && num.intValue() == 6) || (num != null && num.intValue() == 7)) {
                int iIntValue = num.intValue();
                recommendCommonViewModel$handleRecommendData$1.L$0 = SpillingKt.nullOutSpilledVariable(num);
                recommendCommonViewModel$handleRecommendData$1.label = 1;
            } else if (num != null && num.intValue() == 1) {
                QuoteMarketRepository quoteMarketRepository = this.f41860V;
                recommendCommonViewModel$handleRecommendData$1.L$0 = num;
                recommendCommonViewModel$handleRecommendData$1.label = 2;
                objM52982Q = quoteMarketRepository.m52984S(recommendCommonViewModel$handleRecommendData$1);
            } else if (num != null && num.intValue() == 2) {
                QuoteMarketRepository quoteMarketRepository2 = this.f41860V;
                recommendCommonViewModel$handleRecommendData$1.L$0 = num;
                recommendCommonViewModel$handleRecommendData$1.label = 3;
                objM52982Q = quoteMarketRepository2.m52983R(recommendCommonViewModel$handleRecommendData$1);
            } else if (num != null && num.intValue() == 3) {
                QuoteMarketRepository quoteMarketRepository3 = this.f41860V;
                recommendCommonViewModel$handleRecommendData$1.L$0 = num;
                recommendCommonViewModel$handleRecommendData$1.label = 4;
                objM52982Q = quoteMarketRepository3.m52982Q(recommendCommonViewModel$handleRecommendData$1);
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM52982Q);
            return Unit.INSTANCE;
        }
        if (i12 == 2) {
            num = (Integer) recommendCommonViewModel$handleRecommendData$1.L$0;
            ResultKt.throwOnFailure(objM52982Q);
            listEmptyList = (List) objM52982Q;
        } else if (i12 == 3) {
            num = (Integer) recommendCommonViewModel$handleRecommendData$1.L$0;
            ResultKt.throwOnFailure(objM52982Q);
            listEmptyList = (List) objM52982Q;
        } else {
            if (i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            num = (Integer) recommendCommonViewModel$handleRecommendData$1.L$0;
            ResultKt.throwOnFailure(objM52982Q);
            listEmptyList = (List) objM52982Q;
        }
        if (listEmptyList.isEmpty()) {
            Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.recommend.u
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecommendCommonViewModel.m51687P((UIState) obj);
                }
            }));
        } else {
            final ArrayList arrayList = new ArrayList();
            List<? extends String> arrayList2 = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(listEmptyList, 10));
            Iterator it = listEmptyList.iterator();
            while (it.hasNext()) {
                arrayList2.add(C27041f.m66668h(((RecommendQuoteEntity) it.next()).getSymbol()));
            }
            ArrayList arrayList3 = new ArrayList();
            if (this.f41864Z.compareAndSet(false, true)) {
                m51715M().m81820e(arrayList2);
            } else {
                List<String> listM81817b = m51715M().m81817b();
                List<? extends String> arrayList4 = new ArrayList<>();
                for (Object obj : listM81817b) {
                    if (arrayList2.contains((String) obj)) {
                        arrayList4.add(obj);
                    }
                }
                m51715M().m81820e(arrayList4);
            }
            RecommendBeanMapper recommendBeanMapper = new RecommendBeanMapper();
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listEmptyList, 10));
            for (RecommendQuoteEntity recommendQuoteEntity : listEmptyList) {
                RecommendItemBean recommendItemBeanMo51723a = recommendBeanMapper.mo51723a(recommendQuoteEntity);
                String symbol = recommendQuoteEntity.getSymbol();
                if (symbol != null) {
                    Boxing.boxBoolean(arrayList3.add(symbol));
                }
                recommendItemBeanMo51723a.setSelected(Boxing.boxBoolean(m51715M().m81818c(C27041f.m66668h(recommendQuoteEntity.getSymbol()))));
                arrayList5.add(Boxing.boxBoolean(arrayList.add(recommendItemBeanMo51723a)));
            }
            updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.recommend.r
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return RecommendCommonViewModel.m51688Q(arrayList, this, (UIState) obj2);
                }
            });
            if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 3)) {
                this.f41861W.m51881f(arrayList3, new Function1() { // from class: com.kubi.quotefacade.favorites.recommend.s
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RecommendCommonViewModel.m51689R(this.f41886b, (List) obj2);
                    }
                });
            } else {
                this.f41861W.m51880d(arrayList3, new Function1() { // from class: com.kubi.quotefacade.favorites.recommend.t
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RecommendCommonViewModel.m51686O(this.f41887b, (List) obj2);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r2 == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r2 == r4) goto L27;
     */
    /* JADX INFO: renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m51717S(int i11, Continuation<? super Unit> continuation) {
        RecommendCommonViewModel$handleRecommendDataAlpha$1 recommendCommonViewModel$handleRecommendDataAlpha$1;
        List<AlphaItemEntity> listEmptyList;
        int i12 = i11;
        if (continuation instanceof RecommendCommonViewModel$handleRecommendDataAlpha$1) {
            recommendCommonViewModel$handleRecommendDataAlpha$1 = (RecommendCommonViewModel$handleRecommendDataAlpha$1) continuation;
            int i13 = recommendCommonViewModel$handleRecommendDataAlpha$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                recommendCommonViewModel$handleRecommendDataAlpha$1.label = i13 - Integer.MIN_VALUE;
            } else {
                recommendCommonViewModel$handleRecommendDataAlpha$1 = new RecommendCommonViewModel$handleRecommendDataAlpha$1(this, continuation);
            }
        } else {
            recommendCommonViewModel$handleRecommendDataAlpha$1 = new RecommendCommonViewModel$handleRecommendDataAlpha$1(this, continuation);
        }
        Object objM52981P = recommendCommonViewModel$handleRecommendDataAlpha$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = recommendCommonViewModel$handleRecommendDataAlpha$1.label;
        if (i14 == 0) {
            ResultKt.throwOnFailure(objM52981P);
            if (i12 == 6) {
                QuoteMarketRepository quoteMarketRepository = this.f41860V;
                recommendCommonViewModel$handleRecommendDataAlpha$1.I$0 = i12;
                recommendCommonViewModel$handleRecommendDataAlpha$1.label = 1;
                objM52981P = quoteMarketRepository.m52981P("HIGHLIGHTS", recommendCommonViewModel$handleRecommendDataAlpha$1);
            } else if (i12 != 7) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                QuoteMarketRepository quoteMarketRepository2 = this.f41860V;
                recommendCommonViewModel$handleRecommendDataAlpha$1.I$0 = i12;
                recommendCommonViewModel$handleRecommendDataAlpha$1.label = 2;
                objM52981P = quoteMarketRepository2.m52981P("CHAIN_AREA", recommendCommonViewModel$handleRecommendDataAlpha$1);
            }
            return coroutine_suspended;
        }
        if (i14 == 1) {
            i12 = recommendCommonViewModel$handleRecommendDataAlpha$1.I$0;
            ResultKt.throwOnFailure(objM52981P);
            listEmptyList = (List) objM52981P;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = recommendCommonViewModel$handleRecommendDataAlpha$1.I$0;
            ResultKt.throwOnFailure(objM52981P);
            listEmptyList = (List) objM52981P;
        }
        if (listEmptyList.isEmpty()) {
            updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.recommend.v
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecommendCommonViewModel.m51690T((UIState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listEmptyList, 10));
        Iterator it = listEmptyList.iterator();
        while (it.hasNext()) {
            arrayList.add(C27041f.m66668h(((AlphaItemEntity) it.next()).getUniqueCode()));
        }
        if (arrayList.isEmpty()) {
            updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.recommend.w
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecommendCommonViewModel.m51691U((UIState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        if (this.f41864Z.compareAndSet(false, true)) {
            m51715M().m81820e(arrayList);
        } else {
            List<String> listM81817b = m51715M().m81817b();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listM81817b) {
                if (arrayList.contains((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            m51715M().m81820e(arrayList2);
        }
        final ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listEmptyList, 10));
        for (AlphaItemEntity alphaItemEntity : listEmptyList) {
            String uniqueCode = alphaItemEntity.getUniqueCode();
            RecommendItemBean recommendItemBean = new RecommendItemBean(uniqueCode, null, null, null, null, null, null, null, null, null, null, null, 4094, null);
            recommendItemBean.setSelected(Boxing.boxBoolean(m51715M().m81818c(uniqueCode)));
            recommendItemBean.setCollectType(Boxing.boxInt(i12));
            recommendItemBean.setAlphaItemEntity(alphaItemEntity);
            arrayList3.add(recommendItemBean);
        }
        updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.recommend.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return RecommendCommonViewModel.m51692V(arrayList3, this, (UIState) obj2);
            }
        });
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listEmptyList, 10));
        Iterator it2 = listEmptyList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(C27041f.m66668h(((AlphaItemEntity) it2.next()).getTokenBridgeId()));
        }
        if (!arrayList4.isEmpty()) {
            MarketWsHelper.m32538x(this.f41862X, arrayList4, null, 0L, new Function1() { // from class: com.kubi.quotefacade.favorites.recommend.m
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return RecommendCommonViewModel.m51693W(this.f41879b, (List) obj2);
                }
            }, 6, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final CharSequence m51683G(String str) {
        return C27041f.m66668h(str);
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        this.f41861W.m51879c();
        this.f41862X.m32541F();
    }
}
