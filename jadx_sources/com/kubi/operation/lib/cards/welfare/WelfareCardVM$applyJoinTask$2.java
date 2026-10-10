package com.kubi.operation.lib.cards.welfare;

import com.kubi.operation.api.entity.WelfareSignupEntity;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: WelfareCardVM.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/operation/api/entity/WelfareSignupEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.cards.welfare.WelfareCardVM$applyJoinTask$2", m90122f = "WelfareCardVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class WelfareCardVM$applyJoinTask$2 extends SuspendLambda implements Function2<WelfareSignupEntity, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public WelfareCardVM$applyJoinTask$2(Continuation<? super WelfareCardVM$applyJoinTask$2> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(WelfareSignupEntity welfareSignupEntity, Continuation<? super Unit> continuation) {
        return ((WelfareCardVM$applyJoinTask$2) create(welfareSignupEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WelfareCardVM$applyJoinTask$2 welfareCardVM$applyJoinTask$2 = new WelfareCardVM$applyJoinTask$2(continuation);
        welfareCardVM$applyJoinTask$2.L$0 = obj;
        return welfareCardVM$applyJoinTask$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WelfareSignupEntity welfareSignupEntity = (WelfareSignupEntity) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("applyJoinTask: result=");
        sb2.append(welfareSignupEntity != null ? welfareSignupEntity.getSigned() : null);
        C44128b.m97266j("WelfareCardVM", sb2.toString());
        return Unit.INSTANCE;
    }
}
