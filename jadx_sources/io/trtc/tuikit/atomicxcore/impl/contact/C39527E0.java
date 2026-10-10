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

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.E0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39527E0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f87739a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39531G0 f87740b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f87741c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f87742d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f87743e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CompletionHandler f87744f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39527E0(C39531G0 c39531g0, String str, String str2, String str3, CompletionHandler completionHandler, Continuation continuation) {
        super(2, continuation);
        this.f87740b = c39531g0;
        this.f87741c = str;
        this.f87742d = str2;
        this.f87743e = str3;
        this.f87744f = completionHandler;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39527E0(this.f87740b, this.f87741c, this.f87742d, this.f87743e, this.f87744f, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C39527E0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f87739a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C39531G0 c39531g0 = this.f87740b;
                String str = this.f87741c;
                String str2 = this.f87742d;
                String str3 = this.f87743e;
                this.f87739a = 1;
                if (C39531G0.m88266a(c39531g0, str, str2, str3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            CompletionHandler completionHandler = this.f87744f;
            if (completionHandler != null) {
                completionHandler.onSuccess();
            }
        } catch (C39497e e11) {
            CompletionHandler completionHandler2 = this.f87744f;
            if (completionHandler2 != null) {
                completionHandler2.onFailure(e11.f87694a, e11.f87695b);
            }
        }
        return Unit.INSTANCE;
    }
}
