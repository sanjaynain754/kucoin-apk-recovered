package io.trtc.tuikit.atomicxcore.impl.contact;

import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.r */
/* JADX INFO: loaded from: classes61.dex */
public final class C39584r extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f87902a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39586s f87903b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f87904c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CompletionHandler f87905d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39584r(C39586s c39586s, String str, CompletionHandler completionHandler, Continuation continuation) {
        super(2, continuation);
        this.f87903b = c39586s;
        this.f87904c = str;
        this.f87905d = completionHandler;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39584r(this.f87903b, this.f87904c, this.f87905d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C39584r) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f87902a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C39586s c39586s = this.f87903b;
                String str = c39586s.f87908a;
                String str2 = this.f87904c;
                this.f87902a = 1;
                if (C39586s.m88280a(c39586s, str, str2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f87903b.f87913f.setValue(this.f87904c);
            CompletionHandler completionHandler = this.f87905d;
            if (completionHandler != null) {
                completionHandler.onSuccess();
            }
        } catch (C39497e e11) {
            CompletionHandler completionHandler2 = this.f87905d;
            if (completionHandler2 != null) {
                completionHandler2.onFailure(e11.f87694a, e11.f87695b);
            }
        }
        return Unit.INSTANCE;
    }
}
