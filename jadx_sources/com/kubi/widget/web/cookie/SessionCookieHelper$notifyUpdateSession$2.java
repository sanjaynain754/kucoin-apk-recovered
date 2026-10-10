package com.kubi.widget.web.cookie;

import com.kubi.router.core.Router;
import com.kubi.widget.web.exception.KWebWidgetException;
import java.util.Iterator;
import kotlinx.coroutines.InterfaceC41709m0;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import u80.InterfaceC45136a;

/* JADX INFO: compiled from: SessionCookieHelper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.widget.web.cookie.SessionCookieHelper$notifyUpdateSession$2", m90122f = "SessionCookieHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nSessionCookieHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionCookieHelper.kt\ncom/kubi/widget/web/cookie/SessionCookieHelper$notifyUpdateSession$2\n+ 2 Router.kt\ncom/kubi/router/core/Router\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 KWebIssue.kt\ncom/kubi/widget/web/exception/KWebIssueKt\n*L\n1#1,270:1\n183#2:271\n184#2:274\n1855#3,2:272\n46#4,6:275\n*S KotlinDebug\n*F\n+ 1 SessionCookieHelper.kt\ncom/kubi/widget/web/cookie/SessionCookieHelper$notifyUpdateSession$2\n*L\n235#1:271\n235#1:274\n235#1:272,2\n237#1:275,6\n*E\n"})
public final class SessionCookieHelper$notifyUpdateSession$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;

    public SessionCookieHelper$notifyUpdateSession$2(Continuation<? super SessionCookieHelper$notifyUpdateSession$2> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SessionCookieHelper$notifyUpdateSession$2(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SessionCookieHelper$notifyUpdateSession$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                Iterator it = Router.f46192a.m56190l(InterfaceC45136a.class).iterator();
                while (it.hasNext()) {
                    ((InterfaceC45136a) it.next()).onUpdateSession();
                }
            } catch (Exception e11) {
                if (!C42899b.m94075e(e11)) {
                    C43846g.m96568c(new KWebWidgetException(e11, "SessionCookieHelper", false, null, 8, null), null, 2, null);
                } else {
                    C44128b.m97264h(e11);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
