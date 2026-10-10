package com.kubi.quotefacade.rank;

import bv.C4702x;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: RankFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.rank.RankFragment$openTargetTab$1", m90122f = "RankFragment.kt", m90123i = {0}, m90124l = {246}, m90125m = "invokeSuspend", m90126n = {"index"}, m90127s = {"I$0"})
public final class RankFragment$openTargetTab$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int I$0;
    int label;
    final /* synthetic */ RankFragment this$0;

    /* JADX INFO: renamed from: com.kubi.quotefacade.rank.RankFragment$openTargetTab$1$1 */
    /* JADX INFO: compiled from: RankFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.rank.RankFragment$openTargetTab$1$1", m90122f = "RankFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C224331 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $index;
        int label;
        final /* synthetic */ RankFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C224331(RankFragment rankFragment, int i11, Continuation<? super C224331> continuation) {
            super(2, continuation);
            this.this$0 = rankFragment;
            this.$index = i11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C224331(this.this$0, this.$index, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C224331) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C4702x c4702xM52691T3 = this.this$0.m52691T3();
                if (c4702xM52691T3 == null) {
                    return Unit.INSTANCE;
                }
                int currentItem = c4702xM52691T3.f4608e.getCurrentItem();
                C44128b.m97259c("KKKKKKemp", this.this$0.getTAG() + " -- index:" + this.$index + ". curIndex:" + currentItem);
                int i11 = this.$index;
                if (i11 == currentItem) {
                    return Unit.INSTANCE;
                }
                c4702xM52691T3.f4608e.setCurrentItem(i11, false);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankFragment$openTargetTab$1(RankFragment rankFragment, Continuation<? super RankFragment$openTargetTab$1> continuation) {
        super(2, continuation);
        this.this$0 = rankFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RankFragment$openTargetTab$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RankFragment$openTargetTab$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            int iM52688J3 = this.this$0.m52688J3();
            AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
            C224331 c224331 = new C224331(this.this$0, iM52688J3, null);
            this.I$0 = iM52688J3;
            this.label = 1;
            if (C41686h.m91049g(abstractC41697j0M94121c, c224331, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
