package io.trtc.tuikit.atomicxcore.impl.contact;

import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.Q */
/* JADX INFO: loaded from: classes61.dex */
public final class C39541Q extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f87812a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39531G0 f87813b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f87814c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CompletionHandler f87815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39541Q(C39531G0 c39531g0, List list, CompletionHandler completionHandler, Continuation continuation) {
        super(2, continuation);
        this.f87813b = c39531g0;
        this.f87814c = list;
        this.f87815d = completionHandler;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39541Q(this.f87813b, this.f87814c, this.f87815d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C39541Q) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f87812a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C39531G0 c39531g0 = this.f87813b;
                List list = this.f87814c;
                this.f87812a = 1;
                if (C39531G0.m88267a(c39531g0, list, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            CompletionHandler completionHandler = this.f87815d;
            if (completionHandler != null) {
                completionHandler.onSuccess();
            }
            C39531G0.m88274b(this.f87813b);
        } catch (C39497e e11) {
            CompletionHandler completionHandler2 = this.f87815d;
            if (completionHandler2 != null) {
                completionHandler2.onFailure(e11.f87694a, e11.f87695b);
            }
        }
        return Unit.INSTANCE;
    }
}
