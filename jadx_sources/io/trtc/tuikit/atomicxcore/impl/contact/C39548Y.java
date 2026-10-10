package io.trtc.tuikit.atomicxcore.impl.contact;

import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39512t;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import java.util.concurrent.ConcurrentHashMap;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.Y */
/* JADX INFO: loaded from: classes61.dex */
public final class C39548Y extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f87828a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39531G0 f87829b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f87830c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39548Y(C39531G0 c39531g0, CompletionHandler completionHandler, Continuation continuation) {
        super(2, continuation);
        this.f87829b = c39531g0;
        this.f87830c = completionHandler;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39548Y(this.f87829b, this.f87830c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C39548Y(this.f87829b, this.f87830c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f87828a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C39531G0 c39531g0 = this.f87829b;
                this.f87828a = 1;
                if (C39531G0.m88260a(c39531g0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            ConcurrentHashMap concurrentHashMap = AbstractC39512t.f87709a;
            AbstractC39512t.m88254a("GroupDeleted", MapsKt.mapOf(TuplesKt.m90091to("groupID", this.f87829b.f87759a)));
            CompletionHandler completionHandler = this.f87830c;
            if (completionHandler != null) {
                completionHandler.onSuccess();
            }
        } catch (C39497e e11) {
            CompletionHandler completionHandler2 = this.f87830c;
            if (completionHandler2 != null) {
                completionHandler2.onFailure(e11.f87694a, e11.f87695b);
            }
        }
        return Unit.INSTANCE;
    }
}
