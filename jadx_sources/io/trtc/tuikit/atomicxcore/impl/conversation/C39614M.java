package io.trtc.tuikit.atomicxcore.impl.conversation;

import io.trtc.tuikit.atomicxcore.api.conversation.ConversationMarkType;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.M */
/* JADX INFO: loaded from: classes61.dex */
public final class C39614M extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f88000a;

    public C39614M(Continuation continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39614M(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C39614M((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f88000a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C39617P c39617p = C39617P.f88005a;
        ConversationMarkType conversationMarkType = ConversationMarkType.HIDE;
        this.f88000a = 1;
        Object objM88285a = C39617P.m88285a(conversationMarkType, this);
        if (objM88285a == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM88285a;
    }
}
