package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.imsdk.p128v2.V2TIMMessageListGetOption;
import java.util.List;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.g0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39835g0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f88511a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f88512b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C39857r0 f88513c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ V2TIMMessageListGetOption f88514d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Ref.ObjectRef f88515e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39835g0(C39857r0 c39857r0, V2TIMMessageListGetOption v2TIMMessageListGetOption, Ref.ObjectRef objectRef, Continuation continuation) {
        super(2, continuation);
        this.f88513c = c39857r0;
        this.f88514d = v2TIMMessageListGetOption;
        this.f88515e = objectRef;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C39835g0 c39835g0 = new C39835g0(this.f88513c, this.f88514d, this.f88515e, continuation);
        c39835g0.f88512b = obj;
        return c39835g0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C39835g0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [T, java.lang.Object, java.util.List] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        Ref.ObjectRef objectRef;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f88511a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    objectRef = (Ref.ObjectRef) this.f88512b;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C39857r0 c39857r0 = this.f88513c;
                V2TIMMessageListGetOption v2TIMMessageListGetOption = this.f88514d;
                Ref.ObjectRef objectRef2 = this.f88515e;
                Result.Companion companion = Result.INSTANCE;
                this.f88512b = objectRef2;
                this.f88511a = 1;
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
            ?? r11 = (List) obj;
            objectRef.element = r11;
            objM103844constructorimpl = Result.m103844constructorimpl(r11);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return Result.m103843boximpl(objM103844constructorimpl);
    }
}
