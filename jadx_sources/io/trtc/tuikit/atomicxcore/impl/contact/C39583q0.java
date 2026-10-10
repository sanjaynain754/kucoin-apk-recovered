package io.trtc.tuikit.atomicxcore.impl.contact;

import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.contact.GroupJoinOption;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.q0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39583q0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f87898a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39531G0 f87899b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ GroupJoinOption f87900c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CompletionHandler f87901d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39583q0(C39531G0 c39531g0, GroupJoinOption groupJoinOption, CompletionHandler completionHandler, Continuation continuation) {
        super(2, continuation);
        this.f87899b = c39531g0;
        this.f87900c = groupJoinOption;
        this.f87901d = completionHandler;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39583q0(this.f87899b, this.f87900c, this.f87901d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C39583q0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f87898a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C39531G0 c39531g0 = this.f87899b;
                GroupJoinOption groupJoinOption = this.f87900c;
                this.f87898a = 1;
                if (C39531G0.m88256a(c39531g0, groupJoinOption, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f87899b.f87774p.setValue(this.f87900c);
            CompletionHandler completionHandler = this.f87901d;
            if (completionHandler != null) {
                completionHandler.onSuccess();
            }
        } catch (C39497e e11) {
            CompletionHandler completionHandler2 = this.f87901d;
            if (completionHandler2 != null) {
                completionHandler2.onFailure(e11.f87694a, e11.f87695b);
            }
        }
        return Unit.INSTANCE;
    }
}
