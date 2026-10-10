package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMManager;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import java.util.List;
import kotlinx.coroutines.C41716o;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.m */
/* JADX INFO: loaded from: classes61.dex */
public final class C39574m extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f87880a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39586s f87881b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f87882c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39574m(C39586s c39586s, CompletionHandler completionHandler, Continuation continuation) {
        super(2, continuation);
        this.f87881b = c39586s;
        this.f87882c = completionHandler;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39574m(this.f87881b, this.f87882c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C39574m(this.f87881b, this.f87882c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f87880a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                List<String> listListOf = CollectionsKt.listOf(this.f87881b.f87908a);
                this.f87880a = 1;
                C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(this), 1);
                c41716o.m91142E();
                V2TIMManager.getFriendshipManager().deleteFromBlackList(listListOf, new C39576n(c41716o));
                Object objM91171w = c41716o.m91171w();
                if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (objM91171w != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objM91171w = Unit.INSTANCE;
                }
                if (objM91171w == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f87881b.f87917j.setValue(Boxing.boxBoolean(false));
            CompletionHandler completionHandler = this.f87882c;
            if (completionHandler != null) {
                completionHandler.onSuccess();
            }
        } catch (C39497e e11) {
            CompletionHandler completionHandler2 = this.f87882c;
            if (completionHandler2 != null) {
                completionHandler2.onFailure(e11.f87694a, e11.f87695b);
            }
        }
        return Unit.INSTANCE;
    }
}
