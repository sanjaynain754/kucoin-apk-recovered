package com.kubi.home.rank.impl;

import com.kubi.home.api.RankEntity;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: RankVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "list", "", "Lcom/kubi/home/api/RankEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.rank.impl.RankVM$listenRankData$2", m90122f = "RankVM.kt", m90123i = {0, 1}, m90124l = {264, 269}, m90125m = "invokeSuspend", m90126n = {"list", "list"}, m90127s = {"L$0", "L$0"})
public final class RankVM$listenRankData$2 extends SuspendLambda implements Function2<List<? extends RankEntity>, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $type;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RankVM this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends RankEntity> list, Continuation<? super Unit> continuation) {
        return invoke2((List<RankEntity>) list, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankVM$listenRankData$2(RankVM rankVM, int i11, Continuation<? super RankVM$listenRankData$2> continuation) {
        super(2, continuation);
        this.this$0 = rankVM;
        this.$type = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RankVM$listenRankData$2 rankVM$listenRankData$2 = new RankVM$listenRankData$2(this.this$0, this.$type, continuation);
        rankVM$listenRankData$2.L$0 = obj;
        return rankVM$listenRankData$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<RankEntity> list, Continuation<? super Unit> continuation) {
        return ((RankVM$listenRankData$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r6.m29915T(r0, r5) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (r6.m29916U(r0, false, r5) == r1) goto L17;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.this$0.m29913R() == 2) {
                RankVM rankVM = this.this$0;
                this.L$0 = SpillingKt.nullOutSpilledVariable(list);
                this.label = 1;
            } else {
                this.this$0.f26017a0.clear();
                this.this$0.f26017a0.addAll(list);
                RankVM rankVM2 = this.this$0;
                this.L$0 = SpillingKt.nullOutSpilledVariable(list);
                this.label = 2;
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.m29921d0(this.$type);
        }
        return Unit.INSTANCE;
    }
}
