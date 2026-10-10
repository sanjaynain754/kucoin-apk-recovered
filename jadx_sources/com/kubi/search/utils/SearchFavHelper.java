package com.kubi.search.utils;

import android.text.TextUtils;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.search.R$string;
import com.kubi.search.SearchApi;
import com.kubi.search.config.DataSource;
import com.kubi.search.entity.ContractEntity;
import com.kubi.search.entity.ContractTradeItemBean;
import com.kubi.search.entity.ExtendEntity;
import com.kubi.search.entity.SearchItemData;
import com.kubi.search.entity.SearchLoginFavorEntity;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.spot.api.ISpotService;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import gf.C37890n;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.rx2.RxConvertKt;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SearchFavHelper.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rJ$\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\tJ \u0010\u0015\u001a\u00020\u00052\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rH\u0086@¢\u0006\u0002\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0011H\u0002J$\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rJ$\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u001e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0082@¢\u0006\u0002\u0010\u001fJ\u001e\u0010 \u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0002J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#H\u0002J\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\tJ \u0010(\u001a\u00020\u00052\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rH\u0086@¢\u0006\u0002\u0010\u0017J\u0010\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u001eH\u0002J\u0018\u0010+\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u0011H\u0002R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, m90084d2 = {"Lcom/kubi/search/utils/SearchFavHelper;", "", "<init>", "()V", "changeTradePaireFavor", "", "coroutineScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "itemData", "Lcom/kubi/search/entity/SearchItemData;", "itemContract", "Lcom/kubi/search/entity/ContractTradeItemBean;", "success", "Lkotlin/Function0;", "changeAlphaFavor", "item", "isAlphaFavor", "", "alphaList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "", "refreshAlphaLoginFav", "onFinish", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setAlphaFavor", "tokenChain", "isFavor", "changeChainFavor", "currentToken", "changeFavorSpot", "Lcom/kubi/data/entity/TradeItemBean;", "(Lcom/kubi/data/entity/TradeItemBean;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeFavorFutures", "toast", "strResId", "", "api", "Lcom/kubi/search/SearchApi;", "favorList", "Lcom/kubi/search/entity/SearchLoginFavorEntity;", "refreshLoginFav", "spotIsFavor", "itemBean", "setSpotFavorNew", "newFavorState", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchFavHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchFavHelper.kt\ncom/kubi/search/utils/SearchFavHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CollectionsEx.kt\ncom/kubi/utils/extensions/CollectionsExKt\n*L\n1#1,246:1\n1#2:247\n295#3,2:248\n295#3,2:250\n295#3,2:253\n99#4:252\n*S KotlinDebug\n*F\n+ 1 SearchFavHelper.kt\ncom/kubi/search/utils/SearchFavHelper\n*L\n228#1:248,2\n237#1:250,2\n240#1:253,2\n239#1:252\n*E\n"})
public final class SearchFavHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SearchFavHelper f49141a = new SearchFavHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static CopyOnWriteArrayList<String> f49142b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final SearchApi f49143c = (SearchApi) RetrofitFlowExKt.m42820a(SearchApi.class);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static CopyOnWriteArrayList<SearchLoginFavorEntity> f49144d = new CopyOnWriteArrayList<>();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public static /* synthetic */ Object m59545B(SearchFavHelper searchFavHelper, Function0 function0, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function0 = null;
        }
        return searchFavHelper.m59565A(function0, continuation);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m59559p() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m59561s() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m59562t(TradeItemBean tradeItemBean, boolean z11) {
        if (z11) {
            f49141a.m59569F(IQuoteFacadeService.f41383a.get().mo50681F(tradeItemBean) ? R$string.cancel_favor_ok : R$string.add_favorites_ok);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m59563v(ContractTradeItemBean contractTradeItemBean, Function0 function0) {
        f49141a.m59572n(contractTradeItemBean, function0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Object m59564z(SearchFavHelper searchFavHelper, Function0 function0, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function0 = null;
        }
        return searchFavHelper.m59577y(function0, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r11, r1, r4) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c1, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r1, r2, r4) == r0) goto L34;
     */
    @Nullable
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m59565A(@Nullable Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) {
        SearchFavHelper$refreshLoginFav$1 searchFavHelper$refreshLoginFav$1;
        List list;
        if (continuation instanceof SearchFavHelper$refreshLoginFav$1) {
            searchFavHelper$refreshLoginFav$1 = (SearchFavHelper$refreshLoginFav$1) continuation;
            int i11 = searchFavHelper$refreshLoginFav$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                searchFavHelper$refreshLoginFav$1.label = i11 - Integer.MIN_VALUE;
            } else {
                searchFavHelper$refreshLoginFav$1 = new SearchFavHelper$refreshLoginFav$1(this, continuation);
            }
        } else {
            searchFavHelper$refreshLoginFav$1 = new SearchFavHelper$refreshLoginFav$1(this, continuation);
        }
        SearchFavHelper$refreshLoginFav$1 searchFavHelper$refreshLoginFav$2 = searchFavHelper$refreshLoginFav$1;
        Object objM42826g = searchFavHelper$refreshLoginFav$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = searchFavHelper$refreshLoginFav$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42826g);
            if (UserInfo.a.n()) {
                InterfaceC41634e interfaceC41634eM59626c = SearchApi.m59626c(f49143c, null, null, 3, null);
                searchFavHelper$refreshLoginFav$2.L$0 = function0;
                searchFavHelper$refreshLoginFav$2.label = 2;
                objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM59626c, false, null, searchFavHelper$refreshLoginFav$2, 2, null);
                if (objM42826g != coroutine_suspended) {
                    list = (List) ((C19334f) objM42826g).m42846a();
                    if (list != null) {
                        f49144d.clear();
                        Boxing.boxBoolean(f49144d.addAll(list));
                    }
                    AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                    SearchFavHelper$refreshLoginFav$4 searchFavHelper$refreshLoginFav$4 = new SearchFavHelper$refreshLoginFav$4(function0, null);
                    searchFavHelper$refreshLoginFav$2.L$0 = SpillingKt.nullOutSpilledVariable(function0);
                    searchFavHelper$refreshLoginFav$2.L$1 = SpillingKt.nullOutSpilledVariable(list);
                    searchFavHelper$refreshLoginFav$2.label = 3;
                }
            } else {
                AbstractC41697j0 abstractC41697j0M94121c2 = C42911a.m94121c();
                SearchFavHelper$refreshLoginFav$2 searchFavHelper$refreshLoginFav$3 = new SearchFavHelper$refreshLoginFav$2(function0, null);
                searchFavHelper$refreshLoginFav$2.L$0 = SpillingKt.nullOutSpilledVariable(function0);
                searchFavHelper$refreshLoginFav$2.label = 1;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM42826g);
            return Unit.INSTANCE;
        }
        if (i12 == 2) {
            function0 = (Function0) searchFavHelper$refreshLoginFav$2.L$0;
            ResultKt.throwOnFailure(objM42826g);
            list = (List) ((C19334f) objM42826g).m42846a();
            if (list != null) {
                f49144d.clear();
                Boxing.boxBoolean(f49144d.addAll(list));
            }
            AbstractC41697j0 abstractC41697j0M94121c3 = C42911a.m94121c();
            SearchFavHelper$refreshLoginFav$4 searchFavHelper$refreshLoginFav$5 = new SearchFavHelper$refreshLoginFav$4(function0, null);
            searchFavHelper$refreshLoginFav$2.L$0 = SpillingKt.nullOutSpilledVariable(function0);
            searchFavHelper$refreshLoginFav$2.L$1 = SpillingKt.nullOutSpilledVariable(list);
            searchFavHelper$refreshLoginFav$2.label = 3;
        } else {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42826g);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public final void m59566C(String str, boolean z11) {
        if (UserInfo.a.n()) {
            if (z11) {
                f49142b.remove(str);
            } else {
                f49142b.add(0, str);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m59567D(TradeItemBean tradeItemBean, boolean z11) {
        Object obj;
        Object next;
        Object next2;
        TradeItemBean tradeItemBean2;
        Iterator<T> it = DataSource.f48855a.m59114f().iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                tradeItemBean2 = (TradeItemBean) next;
            }
        } while (!Intrinsics.areEqual(tradeItemBean2 != null ? tradeItemBean2.getSymbol() : null, tradeItemBean.getSymbol()));
        TradeItemBean tradeItemBean3 = (TradeItemBean) next;
        if (tradeItemBean3 != null) {
            tradeItemBean3.setFavor(z11);
        }
        if (UserInfo.a.n()) {
            Iterator<T> it2 = f49144d.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!Intrinsics.areEqual(((SearchLoginFavorEntity) next2).getSymbol(), tradeItemBean.getSymbol()));
            if (next2 == null) {
                f49144d.add(new SearchLoginFavorEntity(tradeItemBean.getSymbol(), Boolean.valueOf(z11)));
                return;
            }
            for (Object obj2 : f49144d) {
                if (Intrinsics.areEqual(((SearchLoginFavorEntity) obj2).getSymbol(), tradeItemBean.getSymbol())) {
                    obj = obj2;
                    break;
                }
            }
            SearchLoginFavorEntity searchLoginFavorEntity = (SearchLoginFavorEntity) obj;
            if (searchLoginFavorEntity != null) {
                searchLoginFavorEntity.setFavor(Boolean.valueOf(z11));
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final boolean m59568E(TradeItemBean tradeItemBean) {
        Object next;
        Boolean favor;
        if (!UserInfo.a.n() || f49144d.isEmpty()) {
            return IQuoteFacadeService.f41383a.get().mo50681F(tradeItemBean);
        }
        Iterator<T> it = f49144d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((SearchLoginFavorEntity) next).getSymbol(), tradeItemBean.getSymbol()));
        SearchLoginFavorEntity searchLoginFavorEntity = (SearchLoginFavorEntity) next;
        if (searchLoginFavorEntity == null || (favor = searchLoginFavorEntity.getFavor()) == null) {
            return false;
        }
        return favor.booleanValue();
    }

    /* JADX INFO: renamed from: F */
    public final void m59569F(final int i11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.utils.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchFavHelper.m59546G(i11);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m59570l(@NotNull LifecycleCoroutineScope coroutineScope, @NotNull SearchItemData item, @NotNull Function0<Unit> success) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(success, "success");
        SearchExKt.m59510D(coroutineScope, new SearchFavHelper$changeAlphaFavor$1(item, success, null));
    }

    /* JADX INFO: renamed from: m */
    public final void m59571m(@NotNull LifecycleCoroutineScope coroutineScope, @NotNull String currentToken, @NotNull Function0<Unit> success) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(currentToken, "currentToken");
        Intrinsics.checkNotNullParameter(success, "success");
        SearchExKt.m59510D(coroutineScope, new SearchFavHelper$changeChainFavor$1(currentToken, success, null));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0097  */
    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r5, r7, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0159, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r11, r2, r0) == r1) goto L52;
     */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m59573r(final TradeItemBean tradeItemBean, Function0<Unit> function0, Continuation<? super Unit> continuation) {
        SearchFavHelper$changeFavorSpot$1 searchFavHelper$changeFavorSpot$1;
        BaseEntity baseEntity;
        Boolean boolBoxBoolean;
        boolean zM59568E;
        int i11;
        if (continuation instanceof SearchFavHelper$changeFavorSpot$1) {
            searchFavHelper$changeFavorSpot$1 = (SearchFavHelper$changeFavorSpot$1) continuation;
            int i12 = searchFavHelper$changeFavorSpot$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                searchFavHelper$changeFavorSpot$1.label = i12 - Integer.MIN_VALUE;
            } else {
                searchFavHelper$changeFavorSpot$1 = new SearchFavHelper$changeFavorSpot$1(this, continuation);
            }
        } else {
            searchFavHelper$changeFavorSpot$1 = new SearchFavHelper$changeFavorSpot$1(this, continuation);
        }
        Object objM42830k = searchFavHelper$changeFavorSpot$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = searchFavHelper$changeFavorSpot$1.label;
        if (i13 != 0) {
            if (i13 == 1) {
                function0 = (Function0) searchFavHelper$changeFavorSpot$1.L$1;
                tradeItemBean = (TradeItemBean) searchFavHelper$changeFavorSpot$1.L$0;
                ResultKt.throwOnFailure(objM42830k);
                baseEntity = (BaseEntity) objM42830k;
                if (baseEntity != null) {
                    boolBoxBoolean = Boxing.boxBoolean(baseEntity.getSuccess());
                } else {
                    boolBoxBoolean = null;
                }
                if (C27025c.m66566d(boolBoxBoolean)) {
                    if (Intrinsics.areEqual(baseEntity != null ? baseEntity.getCode() : null, "420000")) {
                        ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.rank_fav_limit, Boxing.boxInt(150)), new Object[0]);
                    }
                    return Unit.INSTANCE;
                }
                zM59568E = m59568E(tradeItemBean);
                if (zM59568E) {
                    i11 = R$string.cancel_favor_ok;
                } else {
                    i11 = R$string.add_favorites_ok;
                }
                m59569F(i11);
                boolean z11 = !zM59568E;
                tradeItemBean.setFavor(z11);
                m59567D(tradeItemBean, z11);
                AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                SearchFavHelper$changeFavorSpot$2 searchFavHelper$changeFavorSpot$2 = new SearchFavHelper$changeFavorSpot$2(function0, null);
                searchFavHelper$changeFavorSpot$1.L$0 = SpillingKt.nullOutSpilledVariable(tradeItemBean);
                searchFavHelper$changeFavorSpot$1.L$1 = SpillingKt.nullOutSpilledVariable(function0);
                searchFavHelper$changeFavorSpot$1.L$2 = SpillingKt.nullOutSpilledVariable(baseEntity);
                searchFavHelper$changeFavorSpot$1.Z$0 = zM59568E;
                searchFavHelper$changeFavorSpot$1.I$0 = z11 ? 1 : 0;
                searchFavHelper$changeFavorSpot$1.label = 2;
            } else {
                if (i13 != 2) {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objM42830k);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(objM42830k);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM42830k);
        if (UserInfo.a.n()) {
            InterfaceC41634e interfaceC41634eM91205b = RxConvertKt.m91205b(ISpotService.f49646a.get().addFavorSymbol(tradeItemBean.getSymbol()));
            searchFavHelper$changeFavorSpot$1.L$0 = tradeItemBean;
            searchFavHelper$changeFavorSpot$1.L$1 = function0;
            searchFavHelper$changeFavorSpot$1.label = 1;
            objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eM91205b, searchFavHelper$changeFavorSpot$1);
            if (objM42830k != coroutine_suspended) {
                baseEntity = (BaseEntity) objM42830k;
                if (baseEntity != null) {
                    boolBoxBoolean = Boxing.boxBoolean(baseEntity.getSuccess());
                } else {
                    boolBoxBoolean = null;
                }
                if (C27025c.m66566d(boolBoxBoolean)) {
                    if (Intrinsics.areEqual(baseEntity != null ? baseEntity.getCode() : null, "420000")) {
                        ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.rank_fav_limit, Boxing.boxInt(150)), new Object[0]);
                    }
                    return Unit.INSTANCE;
                }
                zM59568E = m59568E(tradeItemBean);
                if (zM59568E) {
                    i11 = R$string.cancel_favor_ok;
                } else {
                    i11 = R$string.add_favorites_ok;
                }
                m59569F(i11);
                boolean z12 = !zM59568E;
                tradeItemBean.setFavor(z12);
                m59567D(tradeItemBean, z12);
                AbstractC41697j0 abstractC41697j0M94121c2 = C42911a.m94121c();
                SearchFavHelper$changeFavorSpot$2 searchFavHelper$changeFavorSpot$3 = new SearchFavHelper$changeFavorSpot$2(function0, null);
                searchFavHelper$changeFavorSpot$1.L$0 = SpillingKt.nullOutSpilledVariable(tradeItemBean);
                searchFavHelper$changeFavorSpot$1.L$1 = SpillingKt.nullOutSpilledVariable(function0);
                searchFavHelper$changeFavorSpot$1.L$2 = SpillingKt.nullOutSpilledVariable(baseEntity);
                searchFavHelper$changeFavorSpot$1.Z$0 = zM59568E;
                searchFavHelper$changeFavorSpot$1.I$0 = z12 ? 1 : 0;
                searchFavHelper$changeFavorSpot$1.label = 2;
            }
        } else {
            if (!TextUtils.isEmpty(UserInfo.c().id) && com.kubi.user.config.a.b()) {
                IUserService.O(IUserService.a.get(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.search.utils.v
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchFavHelper.m59561s();
                    }
                }), 1, (Object) null);
                return Unit.INSTANCE;
            }
            IQuoteFacadeService.f41383a.get().mo50678C(tradeItemBean, new Function1() { // from class: com.kubi.search.utils.w
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchFavHelper.m59562t(tradeItemBean, ((Boolean) obj).booleanValue());
                }
            });
            AbstractC41697j0 abstractC41697j0M94121c3 = C42911a.m94121c();
            SearchFavHelper$changeFavorSpot$5 searchFavHelper$changeFavorSpot$5 = new SearchFavHelper$changeFavorSpot$5(function0, null);
            searchFavHelper$changeFavorSpot$1.L$0 = SpillingKt.nullOutSpilledVariable(tradeItemBean);
            searchFavHelper$changeFavorSpot$1.L$1 = SpillingKt.nullOutSpilledVariable(function0);
            searchFavHelper$changeFavorSpot$1.label = 3;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: u */
    public final void m59574u(@NotNull LifecycleCoroutineScope coroutineScope, @NotNull SearchItemData itemData, @Nullable final ContractTradeItemBean contractTradeItemBean, @NotNull final Function0<Unit> success) {
        TradeItemBean tradeItemBeanM85603D;
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(itemData, "itemData");
        Intrinsics.checkNotNullParameter(success, "success");
        if (Intrinsics.areEqual(itemData.getCategory(), SearchCategory$Companion.SPOT) && (tradeItemBeanM85603D = C37890n.f85269a.m85603D(itemData.getSymbol())) != null) {
            SearchExKt.m59510D(coroutineScope, new SearchFavHelper$changeTradePaireFavor$1$1(tradeItemBeanM85603D, success, null));
        }
        if (!Intrinsics.areEqual(itemData.getCategory(), SearchCategory$Companion.FUTURES) || contractTradeItemBean == null) {
            return;
        }
        C24129b.m58033e(SiteVisibleConfigKey.Futures, new Function0() { // from class: com.kubi.search.utils.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchFavHelper.m59563v(contractTradeItemBean, success);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final boolean m59575w(@NotNull SearchItemData item) {
        Intrinsics.checkNotNullParameter(item, "item");
        StringBuilder sb2 = new StringBuilder();
        ExtendEntity beanWeb3 = item.getBeanWeb3();
        sb2.append(beanWeb3 != null ? beanWeb3.getToken() : null);
        sb2.append('-');
        ExtendEntity beanWeb4 = item.getBeanWeb3();
        sb2.append(beanWeb4 != null ? beanWeb4.getAveChainName() : null);
        String string = sb2.toString();
        return UserInfo.a.n() ? f49142b.contains(string) : IQuoteFacadeService.f41383a.get().mo50697Y(string);
    }

    /* JADX INFO: renamed from: x */
    public final boolean m59576x(@NotNull SearchItemData item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getIsSpot()) {
            TradeItemBean tradeItemBeanM85603D = C37890n.f85269a.m85603D(item.getSymbol());
            if (tradeItemBeanM85603D == null) {
                return false;
            }
            return m59568E(tradeItemBeanM85603D);
        }
        if (item.getIsFuture() && C24129b.m58030b(SiteVisibleConfigKey.Futures)) {
            return IKuMexService.f28731a.get().mo33262K(item.getSymbol());
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r9, r2, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r2, r5, r0) == r1) goto L30;
     */
    @Nullable
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m59577y(@Nullable Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) {
        SearchFavHelper$refreshAlphaLoginFav$1 searchFavHelper$refreshAlphaLoginFav$1;
        if (continuation instanceof SearchFavHelper$refreshAlphaLoginFav$1) {
            searchFavHelper$refreshAlphaLoginFav$1 = (SearchFavHelper$refreshAlphaLoginFav$1) continuation;
            int i11 = searchFavHelper$refreshAlphaLoginFav$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                searchFavHelper$refreshAlphaLoginFav$1.label = i11 - Integer.MIN_VALUE;
            } else {
                searchFavHelper$refreshAlphaLoginFav$1 = new SearchFavHelper$refreshAlphaLoginFav$1(this, continuation);
            }
        } else {
            searchFavHelper$refreshAlphaLoginFav$1 = new SearchFavHelper$refreshAlphaLoginFav$1(this, continuation);
        }
        Object objMo50702e = searchFavHelper$refreshAlphaLoginFav$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = searchFavHelper$refreshAlphaLoginFav$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo50702e);
            if (UserInfo.a.n()) {
                IQuoteFacadeService iQuoteFacadeService = IQuoteFacadeService.f41383a.get();
                searchFavHelper$refreshAlphaLoginFav$1.L$0 = function0;
                searchFavHelper$refreshAlphaLoginFav$1.label = 2;
                objMo50702e = iQuoteFacadeService.mo50702e(searchFavHelper$refreshAlphaLoginFav$1);
                if (objMo50702e != coroutine_suspended) {
                    List list = (List) objMo50702e;
                    f49142b.clear();
                    f49142b.addAll(list);
                    AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                    SearchFavHelper$refreshAlphaLoginFav$4 searchFavHelper$refreshAlphaLoginFav$4 = new SearchFavHelper$refreshAlphaLoginFav$4(function0, null);
                    searchFavHelper$refreshAlphaLoginFav$1.L$0 = SpillingKt.nullOutSpilledVariable(function0);
                    searchFavHelper$refreshAlphaLoginFav$1.L$1 = SpillingKt.nullOutSpilledVariable(list);
                    searchFavHelper$refreshAlphaLoginFav$1.label = 3;
                }
            } else {
                AbstractC41697j0 abstractC41697j0M94121c2 = C42911a.m94121c();
                SearchFavHelper$refreshAlphaLoginFav$2 searchFavHelper$refreshAlphaLoginFav$2 = new SearchFavHelper$refreshAlphaLoginFav$2(function0, null);
                searchFavHelper$refreshAlphaLoginFav$1.L$0 = SpillingKt.nullOutSpilledVariable(function0);
                searchFavHelper$refreshAlphaLoginFav$1.label = 1;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objMo50702e);
            return Unit.INSTANCE;
        }
        if (i12 == 2) {
            function0 = (Function0) searchFavHelper$refreshAlphaLoginFav$1.L$0;
            ResultKt.throwOnFailure(objMo50702e);
            List list2 = (List) objMo50702e;
            f49142b.clear();
            f49142b.addAll(list2);
            AbstractC41697j0 abstractC41697j0M94121c3 = C42911a.m94121c();
            SearchFavHelper$refreshAlphaLoginFav$4 searchFavHelper$refreshAlphaLoginFav$5 = new SearchFavHelper$refreshAlphaLoginFav$4(function0, null);
            searchFavHelper$refreshAlphaLoginFav$1.L$0 = SpillingKt.nullOutSpilledVariable(function0);
            searchFavHelper$refreshAlphaLoginFav$1.L$1 = SpillingKt.nullOutSpilledVariable(list2);
            searchFavHelper$refreshAlphaLoginFav$1.label = 3;
        } else {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMo50702e);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m59546G(int i11) {
        ToastCompat.m66437C(i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m59558o(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m59560q(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public final void m59572n(ContractTradeItemBean contractTradeItemBean, final Function0<Unit> function0) {
        String symbol;
        ContractEntity contract = contractTradeItemBean.getContract();
        if (contract != null) {
            symbol = contract.getSymbol();
        } else {
            symbol = null;
        }
        String strM66668h = C27041f.m66668h(symbol);
        IKuMexService.Companion companion = IKuMexService.f28731a;
        boolean zMo33262K = companion.get().mo33262K(strM66668h);
        if (UserInfo.a.n()) {
            IKuMexService.m33250m(companion.get(), strM66668h, !zMo33262K, false, new Function0() { // from class: com.kubi.search.utils.s
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchFavHelper.m59558o(function0);
                }
            }, 4, null);
        } else if (!TextUtils.isEmpty(UserInfo.c().id) && com.kubi.user.config.a.b()) {
            IUserService.O(IUserService.a.get(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.search.utils.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchFavHelper.m59559p();
                }
            }), 1, (Object) null);
        } else {
            IKuMexService.m33250m(companion.get(), strM66668h, !zMo33262K, false, new Function0() { // from class: com.kubi.search.utils.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchFavHelper.m59560q(function0);
                }
            }, 4, null);
        }
    }
}
