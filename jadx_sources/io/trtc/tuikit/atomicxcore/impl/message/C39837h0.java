package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.imsdk.p128v2.V2TIMMessageListGetOption;
import java.util.List;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.h0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39837h0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f88519a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f88520b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C39857r0 f88521c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ V2TIMMessageListGetOption f88522d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Ref.ObjectRef f88523e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39837h0(C39857r0 c39857r0, V2TIMMessageListGetOption v2TIMMessageListGetOption, Ref.ObjectRef objectRef, Continuation continuation) {
        super(2, continuation);
        this.f88521c = c39857r0;
        this.f88522d = v2TIMMessageListGetOption;
        this.f88523e = objectRef;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C39837h0 c39837h0 = new C39837h0(this.f88521c, this.f88522d, this.f88523e, continuation);
        c39837h0.f88520b = obj;
        return c39837h0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C39837h0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.util.List] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        Ref.ObjectRef objectRef;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f88519a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    objectRef = (Ref.ObjectRef) this.f88520b;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C39857r0 c39857r0 = this.f88521c;
                V2TIMMessageListGetOption v2TIMMessageListGetOption = this.f88522d;
                Ref.ObjectRef objectRef2 = this.f88523e;
                Result.Companion companion = Result.INSTANCE;
                this.f88520b = objectRef2;
                this.f88519a = 1;
                int i12 = C39857r0.f88586n;
                c39857r0.getClass();
                C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(this), 1);
                c41716o.m91142E();
                V2TIMManager.getMessageManager().getHistoryMessageList(v2TIMMessageListGetOption, new C39845l0(c41716o));
                obj = c41716o.m91171w();
                if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            }
            List list = (List) obj;
            objectRef.element = CollectionsKt.reversed(list);
            objM103844constructorimpl = Result.m103844constructorimpl(list);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return Result.m103843boximpl(objM103844constructorimpl);
    }
}
