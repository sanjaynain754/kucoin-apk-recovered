package com.kubi.home.rank.impl.cache;

import com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity;
import com.kubi.utils.C27099x;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: RankCoinHelper.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/kucoin/home/cards_2/rank/impl/cache/RankCoinEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.rank.impl.cache.RankCoinHelper$getCoinEntityFromNet$2", m90122f = "RankCoinHelper.kt", m90123i = {0}, m90124l = {123}, m90125m = "invokeSuspend", m90126n = {"it"}, m90127s = {"L$0"})
public final class RankCoinHelper$getCoinEntityFromNet$2 extends SuspendLambda implements Function2<List<? extends RankCoinEntity>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.home.rank.impl.cache.RankCoinHelper$getCoinEntityFromNet$2$1 */
    /* JADX INFO: compiled from: RankCoinHelper.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.rank.impl.cache.RankCoinHelper$getCoinEntityFromNet$2$1", m90122f = "RankCoinHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C147711 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<RankCoinEntity> $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C147711(List<RankCoinEntity> list, Continuation<? super C147711> continuation) {
            super(2, continuation);
            this.$it = list;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C147711(this.$it, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C147711) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                RankDBEntity rankDBEntity = new RankDBEntity();
                List<RankCoinEntity> list = this.$it;
                rankDBEntity.setKey("coin");
                rankDBEntity.setValue(C27099x.m66919i(list, false, 2, null));
                IRankDao iRankDaoM29945i = RankCoinHelper.f26031a.m29945i();
                if (iRankDaoM29945i != null) {
                    iRankDaoM29945i.mo29934a(CollectionsKt.listOf(rankDBEntity));
                }
                IRankCoinMemory.m29966d(RankCoinHelper.f26035e, this.$it, null, null, 6, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public RankCoinHelper$getCoinEntityFromNet$2(Continuation<? super RankCoinHelper$getCoinEntityFromNet$2> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends RankCoinEntity> list, Continuation<? super Unit> continuation) {
        return invoke2((List<RankCoinEntity>) list, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RankCoinHelper$getCoinEntityFromNet$2 rankCoinHelper$getCoinEntityFromNet$2 = new RankCoinHelper$getCoinEntityFromNet$2(continuation);
        rankCoinHelper$getCoinEntityFromNet$2.L$0 = obj;
        return rankCoinHelper$getCoinEntityFromNet$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<RankCoinEntity> list, Continuation<? super Unit> continuation) {
        return ((RankCoinHelper$getCoinEntityFromNet$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            C147711 c147711 = new C147711(list, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(list);
            this.label = 1;
            if (C41686h.m91049g(abstractC41697j0M94120b, c147711, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
