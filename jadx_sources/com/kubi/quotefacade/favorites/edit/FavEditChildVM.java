package com.kubi.quotefacade.favorites.edit;

import android.text.style.ForegroundColorSpan;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.entity.AllTradeItemBean;
import com.kubi.quotefacade.entity.FavEditChildEntity;
import com.kubi.quotefacade.entity.FavMarketQuoteEntity;
import com.kubi.quotefacade.entity.MarketListEntityItem;
import com.kubi.quotefacade.helper.QuoteBusinessConfigHelp;
import com.kubi.quotefacade.helper.QuoteConfigHelper;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p414kv.C41988d;
import p414kv.C41992h;
import p414kv.C41993i;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FavEditChildVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0094@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0012\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0013\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0002J\f\u0010\u0018\u001a\u00020\u0017*\u00020\u0019H\u0002J\f\u0010\u0018\u001a\u00020\u0017*\u00020\u001aH\u0002J\f\u0010\u0018\u001a\u00020\u0017*\u00020\u001bH\u0002J\f\u0010\u0018\u001a\u00020\u0017*\u00020\u001cH\u0002J\f\u0010\u001d\u001a\u00020\u0017*\u00020\u001bH\u0002J\f\u0010\u001e\u001a\u00020\u0017*\u00020\u001fH\u0002J\f\u0010 \u001a\u00020\u0017*\u00020\u001fH\u0002J\f\u0010!\u001a\u00020\u0017*\u00020\u001fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006%"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/edit/FavEditChildVM;", "Lcom/kubi/mvi/state/SimpleStateVM;", "Lcom/kubi/quotefacade/favorites/edit/FavEditChildContract$UIState;", "<init>", "()V", "repository", "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "dispatchIntentOnIO", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleUpdateFavoriteList", "Lcom/kubi/quotefacade/favorites/edit/FavEditChildContract$UiIntent$UpdateFavoriteList;", "(Lcom/kubi/quotefacade/favorites/edit/FavEditChildContract$UiIntent$UpdateFavoriteList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleGetFuturesFavoriteList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleGetSpotFavoriteList", "handleGetEtfFavoriteList", "handleGetAllFavoriteList", "updateFavoriteList", "list", "", "Lcom/kubi/quotefacade/entity/FavEditChildEntity;", "asSpotFavoriteSortChildEntity", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;", "Lcom/kubi/quotefacade/entity/MarketListEntityItem;", "Lcom/kubi/quotefacade/entity/FutureQuoteEntity;", "asFutureFavoriteSortChildEntity", "asSpotFavEditChildEntity", "Lcom/kubi/quotefacade/entity/AllTradeItemBean;", "asFutureFavEditChildEntity", "asAlphaFavEditChildEntity", "initState", "getInitState", "()Lcom/kubi/quotefacade/favorites/edit/FavEditChildContract$UIState;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFavEditChildVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavEditChildVM.kt\ncom/kubi/quotefacade/favorites/edit/FavEditChildVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1563#2:281\n1634#2,3:282\n1563#2:285\n1634#2,3:286\n1563#2:289\n1634#2,3:290\n774#2:296\n865#2,2:297\n1617#2,9:299\n1869#2:308\n1870#2:310\n1626#2:311\n25#3:293\n26#3:295\n1#4:294\n1#4:309\n*S KotlinDebug\n*F\n+ 1 FavEditChildVM.kt\ncom/kubi/quotefacade/favorites/edit/FavEditChildVM\n*L\n69#1:281\n69#1:282,3\n101#1:285\n101#1:286,3\n127#1:289\n127#1:290,3\n178#1:296\n178#1:297,2\n180#1:299,9\n180#1:308\n180#1:310\n180#1:311\n156#1:293\n156#1:295\n156#1:294\n180#1:309\n*E\n"})
public final class FavEditChildVM extends AbstractC19290l<UIState> {

    /* JADX INFO: renamed from: W */
    @NotNull
    public final QuoteMarketRepository f41798W = new QuoteMarketRepository();

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.edit.FavEditChildVM$dispatchIntentOnIO$1 */
    /* JADX INFO: compiled from: FavEditChildVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.edit.FavEditChildVM", m90122f = "FavEditChildVM.kt", m90123i = {0, 1, 2, 3, 4, 5}, m90124l = {43, 47, 51, 55, 59, 63}, m90125m = "dispatchIntentOnIO", m90126n = {"intent", "intent", "intent", "intent", "intent", "intent"}, m90127s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0"})
    public static final class C220111 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C220111(Continuation<? super C220111> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FavEditChildVM.this.dispatchIntentOnIO(null, this);
        }
    }

    /* JADX INFO: renamed from: D */
    public static final UIState m51574D(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, new Object(), 3, null);
    }

    /* JADX INFO: renamed from: E */
    public static final UIState m51575E(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, new Object(), null, 5, null);
    }

    /* JADX INFO: renamed from: G */
    public static final UIState m51576G(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, new Object(), 3, null);
    }

    /* JADX INFO: renamed from: I */
    public static final UIState m51577I(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, new Object(), 3, null);
    }

    /* JADX INFO: renamed from: J */
    public static final UIState m51578J(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, new Object(), null, 5, null);
    }

    /* JADX INFO: renamed from: L */
    public static final UIState m51579L(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, new Object(), 3, null);
    }

    /* JADX INFO: renamed from: M */
    public static final UIState m51580M(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, new Object(), null, 5, null);
    }

    /* JADX INFO: renamed from: P */
    public static final UIState m51581P(List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, list, null, null, 6, null);
    }

    /* JADX INFO: renamed from: A */
    public final FavEditChildEntity m51599A(MarketListEntityItem marketListEntityItem) {
        TradeItemBean tradeItemBeanMo51723a = new C41993i().mo51723a(marketListEntityItem);
        SymbolInfoEntity symbolInfoEntity = tradeItemBeanMo51723a.getSymbolInfoEntity();
        C27096v0 c27096v0Append = new C27096v0().append(symbolInfoEntity.getBaseCurrencyName());
        C27096v0 c27096v0M66903c = new C27096v0().m66903c(" /" + symbolInfoEntity.getQuoteCurrencyName(), new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.emphasis40)));
        String symbol = tradeItemBeanMo51723a.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        C27096v0 c27096v0Append2 = c27096v0Append.append(c27096v0M66903c);
        Intrinsics.checkNotNullExpressionValue(c27096v0Append2, "append(...)");
        return new FavEditChildEntity(symbol, c27096v0Append2, false, 1, 4, null);
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, null, 7, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: C */
    public final Object m51601C(Continuation<? super Unit> continuation) {
        FavEditChildVM$handleGetAllFavoriteList$1 favEditChildVM$handleGetAllFavoriteList$1;
        FavEditChildEntity favEditChildEntityM51610y;
        if (continuation instanceof FavEditChildVM$handleGetAllFavoriteList$1) {
            favEditChildVM$handleGetAllFavoriteList$1 = (FavEditChildVM$handleGetAllFavoriteList$1) continuation;
            int i11 = favEditChildVM$handleGetAllFavoriteList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                favEditChildVM$handleGetAllFavoriteList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                favEditChildVM$handleGetAllFavoriteList$1 = new FavEditChildVM$handleGetAllFavoriteList$1(this, continuation);
            }
        } else {
            favEditChildVM$handleGetAllFavoriteList$1 = new FavEditChildVM$handleGetAllFavoriteList$1(this, continuation);
        }
        Object objM53009y = favEditChildVM$handleGetAllFavoriteList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = favEditChildVM$handleGetAllFavoriteList$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM53009y);
                QuoteMarketRepository quoteMarketRepository = this.f41798W;
                favEditChildVM$handleGetAllFavoriteList$1.label = 1;
                objM53009y = quoteMarketRepository.m53009y(favEditChildVM$handleGetAllFavoriteList$1);
                if (objM53009y == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM53009y);
            }
            List<AllTradeItemBean> list = (List) objM53009y;
            if (list == null || list.isEmpty()) {
                updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.edit.p
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FavEditChildVM.m51575E((UIState) obj);
                    }
                });
                return Unit.INSTANCE;
            }
            if (!QuoteConfigHelper.f41987a.m51937q()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((AllTradeItemBean) obj).getCollectType() != 5) {
                        arrayList.add(obj);
                    }
                }
                list = arrayList;
            }
            ArrayList arrayList2 = new ArrayList();
            for (AllTradeItemBean allTradeItemBean : list) {
                int collectType = allTradeItemBean.getCollectType();
                if (collectType == 1) {
                    favEditChildEntityM51610y = m51610y(allTradeItemBean);
                } else if (collectType != 2) {
                    favEditChildEntityM51610y = collectType != 5 ? null : m51607v(allTradeItemBean);
                } else {
                    favEditChildEntityM51610y = m51608w(allTradeItemBean);
                }
                if (favEditChildEntityM51610y != null) {
                    arrayList2.add(favEditChildEntityM51610y);
                }
            }
            m51606O(arrayList2);
            return Unit.INSTANCE;
        } catch (Exception unused) {
            updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.edit.o
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return FavEditChildVM.m51574D((UIState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: F */
    public final Object m51602F(Continuation<? super Unit> continuation) {
        FavEditChildVM$handleGetEtfFavoriteList$1 favEditChildVM$handleGetEtfFavoriteList$1;
        if (continuation instanceof FavEditChildVM$handleGetEtfFavoriteList$1) {
            favEditChildVM$handleGetEtfFavoriteList$1 = (FavEditChildVM$handleGetEtfFavoriteList$1) continuation;
            int i11 = favEditChildVM$handleGetEtfFavoriteList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                favEditChildVM$handleGetEtfFavoriteList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                favEditChildVM$handleGetEtfFavoriteList$1 = new FavEditChildVM$handleGetEtfFavoriteList$1(this, continuation);
            }
        } else {
            favEditChildVM$handleGetEtfFavoriteList$1 = new FavEditChildVM$handleGetEtfFavoriteList$1(this, continuation);
        }
        FavEditChildVM$handleGetEtfFavoriteList$1 favEditChildVM$handleGetEtfFavoriteList$2 = favEditChildVM$handleGetEtfFavoriteList$1;
        Object objM42824e = favEditChildVM$handleGetEtfFavoriteList$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = favEditChildVM$handleGetEtfFavoriteList$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            InterfaceC41634e<List<FavMarketQuoteEntity>> interfaceC41634eM53010z = this.f41798W.m53010z();
            FavEditChildVM$handleGetEtfFavoriteList$2 favEditChildVM$handleGetEtfFavoriteList$3 = new FavEditChildVM$handleGetEtfFavoriteList$2(this, null);
            favEditChildVM$handleGetEtfFavoriteList$2.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM53010z, false, favEditChildVM$handleGetEtfFavoriteList$3, favEditChildVM$handleGetEtfFavoriteList$2, 1, null);
            if (objM42824e == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42824e);
        }
        if (((C19334f) objM42824e).getThrowable() != null) {
            updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.edit.n
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FavEditChildVM.m51576G((UIState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: H */
    public final Object m51603H(Continuation<? super Unit> continuation) {
        FavEditChildVM$handleGetFuturesFavoriteList$1 favEditChildVM$handleGetFuturesFavoriteList$1;
        if (continuation instanceof FavEditChildVM$handleGetFuturesFavoriteList$1) {
            favEditChildVM$handleGetFuturesFavoriteList$1 = (FavEditChildVM$handleGetFuturesFavoriteList$1) continuation;
            int i11 = favEditChildVM$handleGetFuturesFavoriteList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                favEditChildVM$handleGetFuturesFavoriteList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                favEditChildVM$handleGetFuturesFavoriteList$1 = new FavEditChildVM$handleGetFuturesFavoriteList$1(this, continuation);
            }
        } else {
            favEditChildVM$handleGetFuturesFavoriteList$1 = new FavEditChildVM$handleGetFuturesFavoriteList$1(this, continuation);
        }
        Object objM52966A = favEditChildVM$handleGetFuturesFavoriteList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = favEditChildVM$handleGetFuturesFavoriteList$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM52966A);
                String strM51845i = QuoteBusinessConfigHelp.f41933a.m51845i();
                QuoteMarketRepository quoteMarketRepository = this.f41798W;
                favEditChildVM$handleGetFuturesFavoriteList$1.L$0 = SpillingKt.nullOutSpilledVariable(strM51845i);
                favEditChildVM$handleGetFuturesFavoriteList$1.label = 1;
                objM52966A = quoteMarketRepository.m52966A(strM51845i, favEditChildVM$handleGetFuturesFavoriteList$1);
                if (objM52966A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM52966A);
            }
            List list = (List) objM52966A;
            if (list.isEmpty()) {
                Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.edit.k
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FavEditChildVM.m51578J((UIState) obj);
                    }
                }));
            } else {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(m51609x((MarketListEntityItem) it.next()));
                }
                m51606O(arrayList);
            }
            return Unit.INSTANCE;
        } catch (Exception unused) {
            updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.edit.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FavEditChildVM.m51577I((UIState) obj);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: K */
    public final Object m51604K(Continuation<? super Unit> continuation) {
        FavEditChildVM$handleGetSpotFavoriteList$1 favEditChildVM$handleGetSpotFavoriteList$1;
        if (continuation instanceof FavEditChildVM$handleGetSpotFavoriteList$1) {
            favEditChildVM$handleGetSpotFavoriteList$1 = (FavEditChildVM$handleGetSpotFavoriteList$1) continuation;
            int i11 = favEditChildVM$handleGetSpotFavoriteList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                favEditChildVM$handleGetSpotFavoriteList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                favEditChildVM$handleGetSpotFavoriteList$1 = new FavEditChildVM$handleGetSpotFavoriteList$1(this, continuation);
            }
        } else {
            favEditChildVM$handleGetSpotFavoriteList$1 = new FavEditChildVM$handleGetSpotFavoriteList$1(this, continuation);
        }
        Object objM52967B = favEditChildVM$handleGetSpotFavoriteList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = favEditChildVM$handleGetSpotFavoriteList$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM52967B);
                QuoteMarketRepository quoteMarketRepository = this.f41798W;
                favEditChildVM$handleGetSpotFavoriteList$1.label = 1;
                objM52967B = quoteMarketRepository.m52967B(favEditChildVM$handleGetSpotFavoriteList$1);
                if (objM52967B == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM52967B);
            }
            List list = (List) objM52967B;
            if (list.isEmpty()) {
                Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.edit.m
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FavEditChildVM.m51580M((UIState) obj);
                    }
                }));
            } else {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(m51599A((MarketListEntityItem) it.next()));
                }
                m51606O(arrayList);
            }
            return Unit.INSTANCE;
        } catch (Exception unused) {
            updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.edit.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FavEditChildVM.m51579L((UIState) obj);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c9, code lost:
    
        if (com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42824e((kotlinx.coroutines.flow.InterfaceC41634e) r13, false, r3, r6, 1, null) == r0) goto L30;
     */
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m51605N(FavEditChildContract$UiIntent.UpdateFavoriteList updateFavoriteList, Continuation<? super Unit> continuation) {
        FavEditChildVM$handleUpdateFavoriteList$1 favEditChildVM$handleUpdateFavoriteList$1;
        List<String> arrayList;
        FavEditChildVM$handleUpdateFavoriteList$1 favEditChildVM$handleUpdateFavoriteList$2;
        if (continuation instanceof FavEditChildVM$handleUpdateFavoriteList$1) {
            favEditChildVM$handleUpdateFavoriteList$1 = (FavEditChildVM$handleUpdateFavoriteList$1) continuation;
            int i11 = favEditChildVM$handleUpdateFavoriteList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                favEditChildVM$handleUpdateFavoriteList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                favEditChildVM$handleUpdateFavoriteList$1 = new FavEditChildVM$handleUpdateFavoriteList$1(this, continuation);
            }
        } else {
            favEditChildVM$handleUpdateFavoriteList$1 = new FavEditChildVM$handleUpdateFavoriteList$1(this, continuation);
        }
        FavEditChildVM$handleUpdateFavoriteList$1 favEditChildVM$handleUpdateFavoriteList$3 = favEditChildVM$handleUpdateFavoriteList$1;
        Object objStartLoading$default = favEditChildVM$handleUpdateFavoriteList$3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = favEditChildVM$handleUpdateFavoriteList$3.label;
        if (i12 != 0) {
            if (i12 == 1) {
                List<String> list = (List) favEditChildVM$handleUpdateFavoriteList$3.L$1;
                FavEditChildContract$UiIntent.UpdateFavoriteList updateFavoriteList2 = (FavEditChildContract$UiIntent.UpdateFavoriteList) favEditChildVM$handleUpdateFavoriteList$3.L$0;
                ResultKt.throwOnFailure(objStartLoading$default);
                arrayList = list;
                updateFavoriteList = updateFavoriteList2;
                favEditChildVM$handleUpdateFavoriteList$2 = favEditChildVM$handleUpdateFavoriteList$3;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objStartLoading$default);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objStartLoading$default);
        List<FavEditChildEntity> data = updateFavoriteList.getData();
        arrayList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(data, 10));
        for (FavEditChildEntity favEditChildEntity : data) {
            arrayList.add(favEditChildEntity.getType() == 5 ? favEditChildEntity.getSymbolName().toString() : favEditChildEntity.getSymbol());
        }
        InterfaceC41634e<Object> interfaceC41634eM52989Y = this.f41798W.m52989Y(arrayList, updateFavoriteList.getType());
        favEditChildVM$handleUpdateFavoriteList$3.L$0 = updateFavoriteList;
        favEditChildVM$handleUpdateFavoriteList$3.L$1 = arrayList;
        favEditChildVM$handleUpdateFavoriteList$3.label = 1;
        favEditChildVM$handleUpdateFavoriteList$2 = favEditChildVM$handleUpdateFavoriteList$3;
        objStartLoading$default = BaseStateVM.startLoading$default(this, interfaceC41634eM52989Y, 0, false, false, favEditChildVM$handleUpdateFavoriteList$2, 7, null);
        if (objStartLoading$default != coroutine_suspended) {
        }
        return coroutine_suspended;
        FavEditChildVM$handleUpdateFavoriteList$2 favEditChildVM$handleUpdateFavoriteList$4 = new FavEditChildVM$handleUpdateFavoriteList$2(this, updateFavoriteList, arrayList, null);
        favEditChildVM$handleUpdateFavoriteList$2.L$0 = SpillingKt.nullOutSpilledVariable(updateFavoriteList);
        favEditChildVM$handleUpdateFavoriteList$2.L$1 = SpillingKt.nullOutSpilledVariable(arrayList);
        favEditChildVM$handleUpdateFavoriteList$2.label = 2;
    }

    /* JADX INFO: renamed from: O */
    public final void m51606O(final List<FavEditChildEntity> list) {
        updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.edit.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FavEditChildVM.m51581P(list, (UIState) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (m51601C(r0) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        if (m51604K(r0) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        if (m51603H(r0) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c4, code lost:
    
        if (m51602F(r0) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
    
        if (m51605N(r6, r0) == r1) goto L53;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntentOnIO(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C220111 c220111;
        if (continuation instanceof C220111) {
            c220111 = (C220111) continuation;
            int i11 = c220111.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c220111.label = i11 - Integer.MIN_VALUE;
            } else {
                c220111 = new C220111(continuation);
            }
        } else {
            c220111 = new C220111(continuation);
        }
        Object obj = c220111.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c220111.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                c220111.L$0 = interfaceC19282d;
                c220111.label = 1;
                if (super.dispatchIntentOnIO(interfaceC19282d, c220111) != coroutine_suspended) {
                    if (!(interfaceC19282d instanceof FavEditChildContract$UiIntent.GetAllFavoriteList)) {
                        c220111.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                        c220111.label = 2;
                    } else if (interfaceC19282d instanceof FavEditChildContract$UiIntent.GetSpotFavoriteList) {
                        c220111.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                        c220111.label = 3;
                    } else if (interfaceC19282d instanceof FavEditChildContract$UiIntent.GetFuturesFavoriteList) {
                        c220111.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                        c220111.label = 4;
                    } else if (interfaceC19282d instanceof FavEditChildContract$UiIntent.GetEtfFavoriteList) {
                        c220111.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                        c220111.label = 5;
                    } else {
                        if (interfaceC19282d instanceof FavEditChildContract$UiIntent.UpdateFavoriteList) {
                            return Unit.INSTANCE;
                        }
                        FavEditChildContract$UiIntent.UpdateFavoriteList updateFavoriteList = (FavEditChildContract$UiIntent.UpdateFavoriteList) interfaceC19282d;
                        c220111.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                        c220111.label = 6;
                    }
                    break;
                }
                return coroutine_suspended;
            case 1:
                interfaceC19282d = (InterfaceC19282d) c220111.L$0;
                ResultKt.throwOnFailure(obj);
                if (!(interfaceC19282d instanceof FavEditChildContract$UiIntent.GetAllFavoriteList)) {
                    if (interfaceC19282d instanceof FavEditChildContract$UiIntent.GetSpotFavoriteList) {
                        c220111.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                        c220111.label = 3;
                    } else if (interfaceC19282d instanceof FavEditChildContract$UiIntent.GetFuturesFavoriteList) {
                        c220111.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                        c220111.label = 4;
                    } else if (interfaceC19282d instanceof FavEditChildContract$UiIntent.GetEtfFavoriteList) {
                        c220111.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                        c220111.label = 5;
                    } else {
                        if (interfaceC19282d instanceof FavEditChildContract$UiIntent.UpdateFavoriteList) {
                            return Unit.INSTANCE;
                        }
                        FavEditChildContract$UiIntent.UpdateFavoriteList updateFavoriteList2 = (FavEditChildContract$UiIntent.UpdateFavoriteList) interfaceC19282d;
                        c220111.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                        c220111.label = 6;
                    }
                    break;
                } else {
                    c220111.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                    c220111.label = 2;
                    break;
                }
                return coroutine_suspended;
            case 2:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 4:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 5:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: x */
    public final FavEditChildEntity m51609x(MarketListEntityItem marketListEntityItem) {
        String symbol = new C41992h().mo51723a(marketListEntityItem).getSymbol();
        Intrinsics.checkNotNull(symbol);
        return new FavEditChildEntity(symbol, "", false, 2, 4, null);
    }

    /* JADX INFO: renamed from: z */
    public final FavEditChildEntity m51611z(FavMarketQuoteEntity favMarketQuoteEntity) {
        TradeItemBean tradeItemBeanMo51723a = new C41988d().mo51723a(favMarketQuoteEntity);
        SymbolInfoEntity symbolInfoEntity = tradeItemBeanMo51723a.getSymbolInfoEntity();
        C27096v0 c27096v0Append = new C27096v0().append(symbolInfoEntity.getBaseCurrencyName());
        C27096v0 c27096v0M66903c = new C27096v0().m66903c(" /" + symbolInfoEntity.getQuoteCurrencyName(), new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.emphasis40)));
        String symbol = tradeItemBeanMo51723a.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        C27096v0 c27096v0Append2 = c27096v0Append.append(c27096v0M66903c);
        Intrinsics.checkNotNullExpressionValue(c27096v0Append2, "append(...)");
        return new FavEditChildEntity(symbol, c27096v0Append2, false, 1, 4, null);
    }

    /* JADX INFO: renamed from: v */
    public final FavEditChildEntity m51607v(AllTradeItemBean allTradeItemBean) {
        String feeCode;
        String priceIncrement;
        String str;
        SymbolInfoEntity symbolInfoEntity = allTradeItemBean.getSymbolInfoEntity();
        if (symbolInfoEntity == null || (feeCode = symbolInfoEntity.getFeeCode()) == null) {
            feeCode = "";
        }
        SymbolInfoEntity symbolInfoEntity2 = allTradeItemBean.getSymbolInfoEntity();
        if (symbolInfoEntity2 == null || (priceIncrement = symbolInfoEntity2.getPriceIncrement()) == null) {
            priceIncrement = "";
        }
        String showSymbol = allTradeItemBean.getShowSymbol();
        if (showSymbol == null) {
            str = "";
        } else {
            str = showSymbol;
        }
        return new FavEditChildEntity(str, feeCode + '-' + priceIncrement, false, 5, 4, null);
    }

    /* JADX INFO: renamed from: w */
    public final FavEditChildEntity m51608w(AllTradeItemBean allTradeItemBean) {
        SymbolInfoEntity symbolInfoEntity = allTradeItemBean.getSymbolInfoEntity();
        C27096v0 c27096v0Append = new C27096v0().append(symbolInfoEntity.getBaseCurrencyName());
        C27096v0 c27096v0M66903c = new C27096v0().m66903c(" /" + symbolInfoEntity.getQuoteCurrencyName(), new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.emphasis40)));
        String symbol = allTradeItemBean.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        C27096v0 c27096v0Append2 = c27096v0Append.append(c27096v0M66903c);
        Intrinsics.checkNotNullExpressionValue(c27096v0Append2, "append(...)");
        return new FavEditChildEntity(symbol, c27096v0Append2, false, 2, 4, null);
    }

    /* JADX INFO: renamed from: y */
    public final FavEditChildEntity m51610y(AllTradeItemBean allTradeItemBean) {
        SymbolInfoEntity symbolInfoEntity = allTradeItemBean.getSymbolInfoEntity();
        C27096v0 c27096v0Append = new C27096v0().append(symbolInfoEntity.getBaseCurrencyName());
        C27096v0 c27096v0M66903c = new C27096v0().m66903c(" /" + symbolInfoEntity.getQuoteCurrencyName(), new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.emphasis40)));
        String symbol = allTradeItemBean.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        C27096v0 c27096v0Append2 = c27096v0Append.append(c27096v0M66903c);
        Intrinsics.checkNotNullExpressionValue(c27096v0Append2, "append(...)");
        return new FavEditChildEntity(symbol, c27096v0Append2, false, 1, 4, null);
    }
}
