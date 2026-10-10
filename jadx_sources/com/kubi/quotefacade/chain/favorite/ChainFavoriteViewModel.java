package com.kubi.quotefacade.chain.favorite;

import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.quotefacade.entity.ChainBackDeleteEntity;
import com.kubi.quotefacade.entity.ChainItemEntity;
import com.kubi.quotefacade.helper.ChainFavCacheManager;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
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
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ChainFavoriteViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0094@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteViewModel;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteContract$UIState;", "<init>", "()V", "TAG", "", "repository", "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "initState", "getInitState", "()Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChainFavoriteViewModel extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final String f41505X = "ChainFavoriteViewModel";

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final QuoteMarketRepository f41506Y = new QuoteMarketRepository();

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.favorite.ChainFavoriteViewModel$dispatchIntent$1 */
    /* JADX INFO: compiled from: ChainFavoriteViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.chain.favorite.ChainFavoriteViewModel", m90122f = "ChainFavoriteViewModel.kt", m90123i = {0, 1}, m90124l = {24, 29}, m90125m = "dispatchIntent", m90126n = {"intent", "intent"}, m90127s = {"L$0", "L$0"})
    public static final class C217551 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C217551(Continuation<? super C217551> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChainFavoriteViewModel.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.favorite.ChainFavoriteViewModel$dispatchIntent$2 */
    /* JADX INFO: compiled from: ChainFavoriteViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/quotefacade/entity/ChainBackDeleteEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.chain.favorite.ChainFavoriteViewModel$dispatchIntent$2", m90122f = "ChainFavoriteViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C217562 extends SuspendLambda implements Function2<ChainBackDeleteEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC19282d $intent;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ChainBackDeleteEntity chainBackDeleteEntity, Continuation<? super Unit> continuation) {
            return ((C217562) create(chainBackDeleteEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C217562(InterfaceC19282d interfaceC19282d, Continuation<? super C217562> continuation) {
            super(2, continuation);
            this.$intent = interfaceC19282d;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C217562 c217562 = ChainFavoriteViewModel.this.new C217562(this.$intent, continuation);
            c217562.L$0 = obj;
            return c217562;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ChainBackDeleteEntity chainBackDeleteEntity = (ChainBackDeleteEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ChainFavoriteViewModel.this.send(new C21757a(new Pair(((ChainFavoriteContract$UIIntent.CollectOrCancelChain) this.$intent).getChainItem(), Boxing.boxInt(((ChainFavoriteContract$UIIntent.CollectOrCancelChain) this.$intent).getItemPosition()))));
            List<String> outOfBoundsDelete = chainBackDeleteEntity.getOutOfBoundsDelete();
            if (outOfBoundsDelete != null && !outOfBoundsDelete.isEmpty()) {
                ChainFavCacheManager.f41922a.m51776j(chainBackDeleteEntity.getOutOfBoundsDelete());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42824e(r1, false, r3, r4, 1, null) == r0) goto L32;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C217551 c217551;
        if (continuation instanceof C217551) {
            c217551 = (C217551) continuation;
            int i11 = c217551.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c217551.label = i11 - Integer.MIN_VALUE;
            } else {
                c217551 = new C217551(continuation);
            }
        } else {
            c217551 = new C217551(continuation);
        }
        C217551 c217552 = c217551;
        Object obj = c217552.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c217552.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c217552.L$0 = interfaceC19282d;
            c217552.label = 1;
            if (super.dispatchIntent(interfaceC19282d, c217552) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            interfaceC19282d = (InterfaceC19282d) c217552.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        if (interfaceC19282d instanceof ChainFavoriteContract$UIIntent.CollectOrCancelChain) {
            QuoteMarketRepository quoteMarketRepository = this.f41506Y;
            StringBuilder sb2 = new StringBuilder();
            ChainFavoriteContract$UIIntent.CollectOrCancelChain collectOrCancelChain = (ChainFavoriteContract$UIIntent.CollectOrCancelChain) interfaceC19282d;
            ChainItemEntity chainItem = collectOrCancelChain.getChainItem();
            sb2.append(chainItem != null ? chainItem.getToken() : null);
            sb2.append('-');
            ChainItemEntity chainItem2 = collectOrCancelChain.getChainItem();
            sb2.append(chainItem2 != null ? chainItem2.getChain() : null);
            InterfaceC41634e<ChainBackDeleteEntity> interfaceC41634eM52995i = quoteMarketRepository.m52995i(CollectionsKt.listOf(sb2.toString()));
            C217562 c217562 = new C217562(interfaceC19282d, null);
            c217552.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
            c217552.label = 2;
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, 3, null);
    }
}
