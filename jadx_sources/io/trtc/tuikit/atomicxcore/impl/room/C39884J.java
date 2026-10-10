package io.trtc.tuikit.atomicxcore.impl.room;

import io.trtc.tuikit.atomicxcore.api.room.RoomUser;
import kotlinx.coroutines.C41716o;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.J */
/* JADX INFO: loaded from: classes61.dex */
public final class C39884J extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C39921e f88639a;

    /* JADX INFO: renamed from: b */
    public int f88640b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C39934k0 f88641c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ RoomUser f88642d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39884J(C39934k0 c39934k0, RoomUser roomUser, Continuation continuation) {
        super(2, continuation);
        this.f88641c = c39934k0;
        this.f88642d = roomUser;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39884J(this.f88641c, this.f88642d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C39884J(this.f88641c, this.f88642d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C39921e c39921e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f88640b;
        if (i11 != 0) {
            if (i11 == 1) {
                c39921e = this.f88639a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C39934k0 c39934k0 = this.f88641c;
            C39921e c39921e2 = c39934k0.f88786t;
            String userID = this.f88642d.getUserID();
            this.f88639a = c39921e2;
            this.f88640b = 1;
            C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(this), 1);
            c41716o.m91142E();
            c39934k0.f88767a.getUserInfo(userID, new C39903T(c41716o, c39934k0));
            obj = c41716o.m91171w();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            c39921e = c39921e2;
        }
        String str = (String) obj;
        c39921e.getClass();
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        c39921e.f88739b = str;
        return Unit.INSTANCE;
    }
}
