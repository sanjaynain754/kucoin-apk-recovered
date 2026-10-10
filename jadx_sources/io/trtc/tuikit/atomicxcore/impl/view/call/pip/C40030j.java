package io.trtc.tuikit.atomicxcore.impl.view.call.pip;

import io.trtc.tuikit.atomicxcore.api.call.CallInfo;
import io.trtc.tuikit.atomicxcore.api.call.CallStore;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39399b;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.pip.j */
/* JADX INFO: loaded from: classes61.dex */
public final class C40030j extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89039a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40032l f89040b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40030j(C40032l c40032l, Continuation continuation) {
        super(2, continuation);
        this.f89040b = c40032l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C40030j c40030j = new C40030j(this.f89040b, continuation);
        c40030j.f89039a = obj;
        return c40030j;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C40030j c40030j = new C40030j(this.f89040b, (Continuation) obj2);
        c40030j.f89039a = (InterfaceC41709m0) obj;
        return c40030j.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f89039a;
        C41696j.m91104d(interfaceC41709m0, null, null, new C40027g(this.f89040b, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C40028h(this.f89040b, null), 3, null);
        C40032l c40032l = this.f89040b;
        int i11 = C40032l.f89043k;
        c40032l.getClass();
        CallStore.Companion companion = CallStore.INSTANCE;
        int size = ((CallInfo) AbstractC39399b.m88230a(companion)).getInviteeIds().size();
        String chatGroupId = ((CallInfo) AbstractC39399b.m88230a(companion)).getChatGroupId();
        if (size > 1 || chatGroupId.length() > 0) {
            C41696j.m91104d(interfaceC41709m0, null, null, new C40029i(this.f89040b, null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
