package io.trtc.tuikit.atomicxcore.impl.contact;

import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.contact.GroupMemberRole;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.w0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39595w0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f87942a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39531G0 f87943b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f87944c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ GroupMemberRole f87945d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CompletionHandler f87946e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39595w0(C39531G0 c39531g0, String str, GroupMemberRole groupMemberRole, CompletionHandler completionHandler, Continuation continuation) {
        super(2, continuation);
        this.f87943b = c39531g0;
        this.f87944c = str;
        this.f87945d = groupMemberRole;
        this.f87946e = completionHandler;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39595w0(this.f87943b, this.f87944c, this.f87945d, this.f87946e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C39595w0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f87942a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C39531G0 c39531g0 = this.f87943b;
                String str = this.f87944c;
                GroupMemberRole groupMemberRole = this.f87945d;
                this.f87942a = 1;
                if (C39531G0.m88263a(c39531g0, str, groupMemberRole, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            CompletionHandler completionHandler = this.f87946e;
            if (completionHandler != null) {
                completionHandler.onSuccess();
            }
        } catch (C39497e e11) {
            CompletionHandler completionHandler2 = this.f87946e;
            if (completionHandler2 != null) {
                completionHandler2.onFailure(e11.f87694a, e11.f87695b);
            }
        }
        return Unit.INSTANCE;
    }
}
