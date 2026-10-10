package com.kubi.quotefacade.chain;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kubi.quotefacade.entity.ChainItemEntity;
import com.kubi.quotefacade.helper.ChainCoroutineScope;
import com.kubi.quotefacade.helper.ChainFavCacheManager;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import com.kubi.utils.C27100x0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p241ev.C37266a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ChainContainerViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005J\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u001c\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010\u001eJ\u0016\u0010\u001f\u001a\u00020\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u000e\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\tJ\u0016\u0010#\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005J\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\b*\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u000e\u0010%\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005J\u0006\u0010&\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/quotefacade/chain/ChainContainerViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "TAG", "", "chainItemList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/kubi/quotefacade/entity/ChainItemEntity;", "getChainItemList", "()Landroidx/lifecycle/MutableLiveData;", "requestError", "", "getRequestError", "repository", "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "chainScope", "Lcom/kubi/quotefacade/helper/ChainCoroutineScope;", "repeatJob", "Lkotlinx/coroutines/Job;", "sortName", "sortType", "oriList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "lastOrderByRange", "fetchChainFavData", "", "orderByRange", "getChainFavDataByCacheToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setOriList", "list", "removeOrignalListItem", "itemEntity", "setSortSet", "withSort", "startLoopLoadData", "resetRepeatJob", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChainContainerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainContainerViewModel.kt\ncom/kubi/quotefacade/chain/ChainContainerViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 QuoteIssue.kt\ncom/kubi/quotefacade/exception/QuoteIssueKt\n*L\n1#1,166:1\n47#2,4:167\n45#3,7:171\n*S KotlinDebug\n*F\n+ 1 ChainContainerViewModel.kt\ncom/kubi/quotefacade/chain/ChainContainerViewModel\n*L\n50#1:167,4\n163#1:171,7\n*E\n"})
public final class ChainContainerViewModel extends ViewModel {

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public InterfaceC41775x1 f41476a0;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final String f41471V = "ChainContainerViewModel";

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<List<ChainItemEntity>> f41472W = new MutableLiveData<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Boolean> f41473X = new MutableLiveData<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final QuoteMarketRepository f41474Y = new QuoteMarketRepository();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final ChainCoroutineScope f41475Z = new ChainCoroutineScope(C42911a.m94120b());

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public String f41477b0 = "";

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public String f41478c0 = "";

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public CopyOnWriteArrayList<ChainItemEntity> f41479d0 = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public String f41480e0 = "";

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.ChainContainerViewModel$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 ChainContainerViewModel.kt\ncom/kubi/quotefacade/chain/ChainContainerViewModel\n*L\n1#1,49:1\n51#2,2:50\n*E\n"})
    public static final class C21742a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ChainContainerViewModel f41481b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21742a(CoroutineExceptionHandler.Companion companion, ChainContainerViewModel chainContainerViewModel) {
            super(companion);
            this.f41481b = chainContainerViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            this.f41481b.m50756s().postValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final List<ChainItemEntity> m50737C(List<ChainItemEntity> list) {
        return (this.f41477b0.length() == 0 || this.f41478c0.length() == 0 || list.isEmpty()) ? list : C21781i.m50837c(list, this.f41477b0, this.f41478c0);
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m50749u(ChainContainerViewModel chainContainerViewModel, ChainItemEntity chainItemEntity) {
        chainContainerViewModel.f41479d0.remove(chainItemEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m50750w(ChainContainerViewModel chainContainerViewModel) {
        try {
            chainContainerViewModel.f41475Z.close();
            InterfaceC41775x1 interfaceC41775x1 = chainContainerViewModel.f41476a0;
            if (interfaceC41775x1 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            }
            chainContainerViewModel.f41476a0 = null;
        } catch (Exception e11) {
            C37266a.m83411b(e11, "ChainContainerViewModel");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m50751y(ChainContainerViewModel chainContainerViewModel, List list) {
        chainContainerViewModel.f41479d0.clear();
        chainContainerViewModel.f41479d0.addAll(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final void m50752A(@NotNull final String orderByRange) {
        Intrinsics.checkNotNullParameter(orderByRange, "orderByRange");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.chain.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainContainerViewModel.m50736B(this.f41531b, orderByRange);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m50753p(@NotNull String orderByRange) {
        Intrinsics.checkNotNullParameter(orderByRange, "orderByRange");
        this.f41480e0 = orderByRange;
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(new C21742a(CoroutineExceptionHandler.INSTANCE, this)), null, new ChainContainerViewModel$fetchChainFavData$2(this, orderByRange, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public final Object m50754q(String str, Continuation<? super List<ChainItemEntity>> continuation) {
        ChainContainerViewModel$getChainFavDataByCacheToken$1 chainContainerViewModel$getChainFavDataByCacheToken$1;
        if (continuation instanceof ChainContainerViewModel$getChainFavDataByCacheToken$1) {
            chainContainerViewModel$getChainFavDataByCacheToken$1 = (ChainContainerViewModel$getChainFavDataByCacheToken$1) continuation;
            int i11 = chainContainerViewModel$getChainFavDataByCacheToken$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                chainContainerViewModel$getChainFavDataByCacheToken$1.label = i11 - Integer.MIN_VALUE;
            } else {
                chainContainerViewModel$getChainFavDataByCacheToken$1 = new ChainContainerViewModel$getChainFavDataByCacheToken$1(this, continuation);
            }
        } else {
            chainContainerViewModel$getChainFavDataByCacheToken$1 = new ChainContainerViewModel$getChainFavDataByCacheToken$1(this, continuation);
        }
        Object objM53006v = chainContainerViewModel$getChainFavDataByCacheToken$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = chainContainerViewModel$getChainFavDataByCacheToken$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM53006v);
            CopyOnWriteArrayList<String> copyOnWriteArrayListM51781s = ChainFavCacheManager.f41922a.m51781s();
            if (copyOnWriteArrayListM51781s.isEmpty()) {
                return CollectionsKt.emptyList();
            }
            QuoteMarketRepository quoteMarketRepository = this.f41474Y;
            chainContainerViewModel$getChainFavDataByCacheToken$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            chainContainerViewModel$getChainFavDataByCacheToken$1.L$1 = SpillingKt.nullOutSpilledVariable(copyOnWriteArrayListM51781s);
            chainContainerViewModel$getChainFavDataByCacheToken$1.label = 1;
            objM53006v = quoteMarketRepository.m53006v(copyOnWriteArrayListM51781s, str, chainContainerViewModel$getChainFavDataByCacheToken$1);
            if (objM53006v == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM53006v);
        }
        List<ChainItemEntity> list = (List) objM53006v;
        m50759x(list);
        return m50737C(list);
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final MutableLiveData<List<ChainItemEntity>> m50755r() {
        return this.f41472W;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final MutableLiveData<Boolean> m50756s() {
        return this.f41473X;
    }

    /* JADX INFO: renamed from: t */
    public final void m50757t(@NotNull final ChainItemEntity itemEntity) {
        Intrinsics.checkNotNullParameter(itemEntity, "itemEntity");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.chain.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainContainerViewModel.m50749u(this.f41529b, itemEntity);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m50758v() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.chain.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainContainerViewModel.m50750w(this.f41486b);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final void m50759x(final List<ChainItemEntity> list) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.chain.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainContainerViewModel.m50751y(this.f41487b, list);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m50760z(@NotNull String sortName, @NotNull String sortType) {
        Intrinsics.checkNotNullParameter(sortName, "sortName");
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        this.f41477b0 = sortName;
        this.f41478c0 = sortType;
        if (this.f41479d0.isEmpty()) {
            m50753p(this.f41480e0);
        } else if (sortName.length() == 0 || sortType.length() == 0) {
            this.f41472W.postValue(this.f41479d0);
        } else {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new ChainContainerViewModel$setSortSet$1(this, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m50736B(ChainContainerViewModel chainContainerViewModel, String str) {
        chainContainerViewModel.m50758v();
        C41696j.m91104d(chainContainerViewModel.f41475Z, null, null, new ChainContainerViewModel$startLoopLoadData$1$1(chainContainerViewModel, str, null), 3, null);
        return Unit.INSTANCE;
    }
}
