package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMGroupMemberFullInfo;
import com.tencent.imsdk.p128v2.V2TIMManager;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import kotlinx.coroutines.C41716o;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.i0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39567i0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f87871a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39531G0 f87872b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f87873c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39567i0(C39531G0 c39531g0, CompletionHandler completionHandler, Continuation continuation) {
        super(2, continuation);
        this.f87872b = c39531g0;
        this.f87873c = completionHandler;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39567i0(this.f87872b, this.f87873c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C39567i0(this.f87872b, this.f87873c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f87871a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C39531G0 c39531g0 = this.f87872b;
                String strM88272a = C39531G0.m88272a(c39531g0);
                this.f87871a = 1;
                C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(this), 1);
                c41716o.m91142E();
                V2TIMManager.getGroupManager().getGroupMembersInfo(c39531g0.f87759a, CollectionsKt.listOf(strM88272a), new C39575m0(c41716o));
                obj = c41716o.m91171w();
                if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            V2TIMGroupMemberFullInfo v2TIMGroupMemberFullInfo = (V2TIMGroupMemberFullInfo) obj;
            if (v2TIMGroupMemberFullInfo != null) {
                this.f87872b.f87771m.setValue(v2TIMGroupMemberFullInfo.getNameCard());
            }
            CompletionHandler completionHandler = this.f87873c;
            if (completionHandler != null) {
                completionHandler.onSuccess();
            }
        } catch (C39497e e11) {
            CompletionHandler completionHandler2 = this.f87873c;
            if (completionHandler2 != null) {
                completionHandler2.onFailure(e11.f87694a, e11.f87695b);
            }
        }
        return Unit.INSTANCE;
    }
}
