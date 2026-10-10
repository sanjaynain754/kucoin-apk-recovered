package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import io.trtc.tuikit.atomicxcore.api.ListResultCompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.room.log.C39937a;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.U */
/* JADX INFO: loaded from: classes61.dex */
public final class C39905U extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public String f88705a;

    /* JADX INFO: renamed from: b */
    public int f88706b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f88707c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C39934k0 f88708d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f88709e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f88710f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ListResultCompletionHandler f88711g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39905U(C39934k0 c39934k0, String str, String str2, ListResultCompletionHandler listResultCompletionHandler, Continuation continuation) {
        super(2, continuation);
        this.f88708d = c39934k0;
        this.f88709e = str;
        this.f88710f = str2;
        this.f88711g = listResultCompletionHandler;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C39905U c39905u = new C39905U(this.f88708d, this.f88709e, this.f88710f, this.f88711g, continuation);
        c39905u.f88707c = obj;
        return c39905u;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C39905U) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        ListResultCompletionHandler listResultCompletionHandler;
        C39934k0 c39934k0;
        Throwable thM103847exceptionOrNullimpl;
        String message;
        Pair pairM90091to;
        int iIntValue;
        String str;
        C39934k0 c39934k1;
        String str2;
        C39934k0 c39934k2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f88706b;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            c39934k2 = (C39934k0) this.f88707c;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        str2 = this.f88705a;
                        c39934k1 = (C39934k0) this.f88707c;
                        ResultKt.throwOnFailure(obj);
                        this.f88707c = c39934k1;
                        this.f88705a = null;
                        this.f88706b = 3;
                        if (C39934k0.m88348a(c39934k1, str2, this) != coroutine_suspended) {
                            c39934k2 = c39934k1;
                        }
                        return coroutine_suspended;
                    }
                } else {
                    str2 = this.f88705a;
                    c39934k1 = (C39934k0) this.f88707c;
                    ResultKt.throwOnFailure(obj);
                }
                c39934k2.f88780n = true;
                c39934k1 = c39934k2;
                C39934k0.m88349a(c39934k1);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                listResultCompletionHandler = this.f88711g;
                c39934k0 = this.f88708d;
                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl == null) {
                    if (listResultCompletionHandler != null) {
                        listResultCompletionHandler.onSuccess((List) c39934k0.f88768b.getValue(), (String) c39934k0.f88769c.getValue());
                    }
                } else {
                    int i12 = C39934k0.f88764C;
                    c39934k0.getClass();
                    if (thM103847exceptionOrNullimpl instanceof C39919d) {
                        C39919d c39919d = (C39919d) thM103847exceptionOrNullimpl;
                        pairM90091to = TuplesKt.m90091to(Integer.valueOf(c39919d.f88735a), c39919d.f88736b);
                    } else {
                        Integer numValueOf = Integer.valueOf(TUICommonDefine.Error.FAILED.getValue());
                        message = thM103847exceptionOrNullimpl.getMessage();
                        if (message == null) {
                            message = "unknown error";
                        }
                        pairM90091to = TuplesKt.m90091to(numValueOf, message);
                    }
                    iIntValue = ((Number) pairM90091to.component1()).intValue();
                    str = (String) pairM90091to.component2();
                    C39937a c39937a = c39934k0.f88776j;
                    String message2 = "handleError failed: " + iIntValue + ", " + str;
                    c39937a.getClass();
                    Intrinsics.checkNotNullParameter(message2, "message");
                    c39937a.m88357a(2, message2);
                    if (listResultCompletionHandler != null) {
                        listResultCompletionHandler.onFailure(iIntValue, str);
                    }
                }
                this.f88708d.f88779m = false;
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            c39934k1 = this.f88708d;
            c39934k1.f88779m = true;
            String str3 = this.f88709e;
            str2 = this.f88710f;
            Result.Companion companion = Result.INSTANCE;
            this.f88707c = c39934k1;
            this.f88705a = str2;
            this.f88706b = 1;
            if (C39934k0.m88352c(c39934k1, str3, this) == coroutine_suspended) {
            }
            return coroutine_suspended;
            if (!c39934k1.f88780n) {
                this.f88707c = c39934k1;
                this.f88705a = str2;
                this.f88706b = 2;
                if (C39934k0.m88351b(c39934k1, str2, this) != coroutine_suspended) {
                    this.f88707c = c39934k1;
                    this.f88705a = null;
                    this.f88706b = 3;
                    if (C39934k0.m88348a(c39934k1, str2, this) != coroutine_suspended) {
                        c39934k2 = c39934k1;
                        c39934k2.f88780n = true;
                        c39934k1 = c39934k2;
                    }
                }
                return coroutine_suspended;
            }
            C39934k0.m88349a(c39934k1);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        listResultCompletionHandler = this.f88711g;
        c39934k0 = this.f88708d;
        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl == null) {
            if (listResultCompletionHandler != null) {
                listResultCompletionHandler.onSuccess((List) c39934k0.f88768b.getValue(), (String) c39934k0.f88769c.getValue());
            }
        } else {
            int i13 = C39934k0.f88764C;
            c39934k0.getClass();
            if (thM103847exceptionOrNullimpl instanceof C39919d) {
                C39919d c39919d2 = (C39919d) thM103847exceptionOrNullimpl;
                pairM90091to = TuplesKt.m90091to(Integer.valueOf(c39919d2.f88735a), c39919d2.f88736b);
            } else {
                Integer numValueOf2 = Integer.valueOf(TUICommonDefine.Error.FAILED.getValue());
                message = thM103847exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "unknown error";
                }
                pairM90091to = TuplesKt.m90091to(numValueOf2, message);
            }
            iIntValue = ((Number) pairM90091to.component1()).intValue();
            str = (String) pairM90091to.component2();
            C39937a c39937a2 = c39934k0.f88776j;
            String message3 = "handleError failed: " + iIntValue + ", " + str;
            c39937a2.getClass();
            Intrinsics.checkNotNullParameter(message3, "message");
            c39937a2.m88357a(2, message3);
            if (listResultCompletionHandler != null) {
                listResultCompletionHandler.onFailure(iIntValue, str);
            }
        }
        this.f88708d.f88779m = false;
        return Unit.INSTANCE;
    }
}
