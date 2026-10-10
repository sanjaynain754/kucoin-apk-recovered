package io.trtc.tuikit.atomicxcore.impl.message;

import io.trtc.tuikit.atomicxcore.api.message.MessageInfo;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.k0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39843k0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f88546a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f88547b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f88548c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C39857r0 f88549d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ MessageInfo f88550e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f88551f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39843k0(long j11, C39857r0 c39857r0, MessageInfo messageInfo, String str, Continuation continuation) {
        super(2, continuation);
        this.f88548c = j11;
        this.f88549d = c39857r0;
        this.f88550e = messageInfo;
        this.f88551f = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C39843k0 c39843k0 = new C39843k0(this.f88548c, this.f88549d, this.f88550e, this.f88551f, continuation);
        c39843k0.f88547b = obj;
        return c39843k0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C39843k0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (io.trtc.tuikit.atomicxcore.impl.message.C39857r0.m88334a(r7, r1, r3, r6) == r0) goto L19;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f88546a;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                return Result.m103843boximpl(objM103844constructorimpl);
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f88547b;
            long j11 = this.f88548c;
            this.f88547b = interfaceC41709m0;
            this.f88546a = 1;
            if (DelayKt.m90350b(j11, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
            C39857r0 c39857r0 = this.f88549d;
            MessageInfo messageInfo = this.f88550e;
            String str = this.f88551f;
            Result.Companion companion = Result.INSTANCE;
            this.f88547b = null;
            this.f88546a = 2;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
