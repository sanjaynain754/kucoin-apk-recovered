package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28497u;
import com.sumsub.sns.internal.core.presentation.screen.base.C28917a;
import com.sumsub.sns.internal.core.presentation.screen.base.C28919c;
import com.sumsub.sns.internal.core.presentation.screen.base.ErrorClosure$Outcome;
import com.sumsub.sns.internal.core.presentation.screen.base.InterfaceC28918b;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import com.sumsub.sns.internal.features.data.model.common.C29119g0;
import com.sumsub.sns.internal.features.data.model.common.C29131i0;
import com.sumsub.sns.internal.features.data.model.common.C29143k0;
import com.sumsub.sns.internal.features.presentation.error.C30922a;
import com.sumsub.sns.internal.features.presentation.error.C30923b;
import com.sumsub.sns.internal.features.presentation.error.C30924c;
import com.sumsub.sns.internal.features.presentation.error.InterfaceC30925d;
import com.sumsub.sns.internal.log.C33272c;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31252d implements InterfaceC28918b {

    /* JADX INFO: renamed from: a */
    public final AbstractC31275i2 f63293a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f63294b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final void m70660a(C28917a c28917a) {
        InterfaceC30925d c30923b;
        AbstractC29149l0 abstractC29149l0 = c28917a.f58801a;
        ErrorClosure$Outcome errorClosure$Outcome = c28917a.f58803c;
        AbstractC28503w abstractC28503w = c28917a.f58802b;
        if ((abstractC29149l0 instanceof C29131i0) || (abstractC29149l0 instanceof C29119g0)) {
            c30923b = (errorClosure$Outcome == ErrorClosure$Outcome.CANCELLED && Intrinsics.areEqual(abstractC28503w, C28497u.f58029b)) ? new C30923b(abstractC29149l0) : new C30922a(abstractC29149l0);
        } else if (abstractC29149l0 instanceof C29107e0) {
            c30923b = Intrinsics.areEqual(abstractC28503w, C28497u.f58029b) ? new C30922a(abstractC29149l0) : new C30924c(abstractC29149l0);
        } else {
            if (!(abstractC29149l0 instanceof C29143k0)) {
                throw new NoWhenBranchMatchedException();
            }
            c30923b = new C30924c(abstractC29149l0);
        }
        AbstractC29149l0 error = c30923b.getError();
        C31289k c31289k = null;
        if ((error instanceof C29107e0) && Intrinsics.areEqual(c28917a.f58802b, C28497u.f58029b)) {
            C33272c.f67816e.f67810a.mo68955d("ErrorControllerImpl", "Fatal error — terminating SDK: " + error, null);
            this.f63293a.mo70620a((SNSCompletionResult) new SNSCompletionResult.AbnormalTermination(((C29107e0) error).f59055a), false);
            return;
        }
        String str = c28917a.f58804d;
        if (str != null) {
            InterfaceC41769w interfaceC41769w = (InterfaceC41769w) this.f63294b.remove(str);
            if (interfaceC41769w != null) {
                interfaceC41769w.mo91370n(c30923b);
            }
            c31289k = new C31289k(null);
        } else if (c30923b instanceof C30923b) {
            c31289k = new C31289k(new C31272i(((C30923b) c30923b).f62465a));
        } else if (c30923b instanceof C30922a) {
            c31289k = new C31289k(new C31268h(((C30922a) c30923b).f62464a));
        } else if (!(c30923b instanceof C30924c)) {
            throw new NoWhenBranchMatchedException();
        }
        if (c31289k != null) {
            this.f63293a.fireEvent(c31289k);
        }
    }

    public C31252d(AbstractC31275i2 abstractC31275i2) {
        this.f63293a = abstractC31275i2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70659a(C28919c c28919c, ContinuationImpl continuationImpl) throws Throwable {
        C31248c c31248c;
        Throwable th2;
        String str;
        if (continuationImpl instanceof C31248c) {
            c31248c = (C31248c) continuationImpl;
            int i11 = c31248c.f63253d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31248c.f63253d = i11 - Integer.MIN_VALUE;
            } else {
                c31248c = new C31248c(this, continuationImpl);
            }
        } else {
            c31248c = new C31248c(this, continuationImpl);
        }
        Object obj = c31248c.f63251b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31248c.f63253d;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c31248c.f63250a;
            try {
                ResultKt.throwOnFailure(obj);
                this.f63294b.remove(str);
                return obj;
            } catch (Throwable th3) {
                th2 = th3;
                this.f63294b.remove(str);
                throw th2;
            }
        }
        ResultKt.throwOnFailure(obj);
        String string = UUID.randomUUID().toString();
        InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
        this.f63294b.put(string, interfaceC41769wM91388c);
        try {
            AbstractC31275i2 abstractC31275i2 = this.f63293a;
            AbstractC29149l0 abstractC29149l0 = c28919c.f58805a;
            String str2 = c28919c.f58806b;
            if (str2 == null) {
                str2 = "TYPE_UNKNOWN";
            }
            abstractC31275i2.throwError(abstractC29149l0, str2, false, string);
            c31248c.f63250a = string;
            c31248c.f63253d = 1;
            Object objMo91198h = interfaceC41769wM91388c.mo91198h(c31248c);
            if (objMo91198h == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objMo91198h;
            str = string;
            this.f63294b.remove(str);
            return obj;
        } catch (Throwable th4) {
            th2 = th4;
            str = string;
            this.f63294b.remove(str);
            throw th2;
        }
    }
}
