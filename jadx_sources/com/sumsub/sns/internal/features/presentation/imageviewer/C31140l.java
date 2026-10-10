package com.sumsub.sns.internal.features.presentation.imageviewer;

import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.C41685g2;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.imageviewer.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31140l extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ InterfaceC41635f f62969a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Throwable f62970b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31141m f62971c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31140l(C31141m c31141m, Continuation continuation) {
        super(3, continuation);
        this.f62971c = c31141m;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C31140l c31140l = new C31140l(this.f62971c, (Continuation) obj3);
        c31140l.f62969a = (InterfaceC41635f) obj;
        c31140l.f62970b = (Throwable) obj2;
        return c31140l.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String string;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC41635f interfaceC41635f = this.f62969a;
        Throwable th2 = this.f62970b;
        C31141m c31141m = this.f62971c;
        Bundle bundle = c31141m.f62972a;
        if (bundle == null || (string = bundle.getString("arg_iddocsettype")) == null) {
            string = "TYPE_UNKNOWN";
        }
        AbstractC28052C.throwError$default(c31141m, th2, string, null, 4, null);
        C33272c c33272c = C33272c.f67812a;
        String strM71624a = AbstractC33294e.m71624a(interfaceC41635f);
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        C33272c.f67814c.mo68956e(strM71624a, message, th2);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this.f62971c), C41685g2.f91735b, null, new C31139k(th2, null), 2, null);
        return Unit.INSTANCE;
    }
}
