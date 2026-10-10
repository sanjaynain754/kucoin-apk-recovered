package io.trtc.tuikit.atomicxcore.impl.contact;

import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.contact.ReceiveMessageOpt;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.p */
/* JADX INFO: loaded from: classes61.dex */
public final class C39580p extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f87890a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39586s f87891b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ReceiveMessageOpt f87892c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CompletionHandler f87893d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39580p(C39586s c39586s, ReceiveMessageOpt receiveMessageOpt, CompletionHandler completionHandler, Continuation continuation) {
        super(2, continuation);
        this.f87891b = c39586s;
        this.f87892c = receiveMessageOpt;
        this.f87893d = completionHandler;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39580p(this.f87891b, this.f87892c, this.f87893d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C39580p) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f87890a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C39586s c39586s = this.f87891b;
                ReceiveMessageOpt receiveMessageOpt = this.f87892c;
                this.f87890a = 1;
                if (C39586s.m88279a(c39586s, receiveMessageOpt, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            CompletionHandler completionHandler = this.f87893d;
            if (completionHandler != null) {
                completionHandler.onSuccess();
            }
        } catch (C39497e e11) {
            CompletionHandler completionHandler2 = this.f87893d;
            if (completionHandler2 != null) {
                completionHandler2.onFailure(e11.f87694a, e11.f87695b);
            }
        }
        return Unit.INSTANCE;
    }
}
