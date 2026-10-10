package com.sumsub.sns.internal.core.presentation.android;

import androidx.activity.result.ActivityResultLauncher;
import java.util.Set;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28708w extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58378a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28709x f58379b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28708w(C28709x c28709x, Continuation continuation) {
        super(2, continuation);
        this.f58379b = c28709x;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28708w c28708w = new C28708w(this.f58379b, continuation);
        c28708w.f58378a = obj;
        return c28708w;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C28708w c28708w = new C28708w(this.f58379b, (Continuation) obj2);
        c28708w.f58378a = (InterfaceC28697p) obj;
        return c28708w.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC28697p interfaceC28697p = (InterfaceC28697p) this.f58378a;
        if (interfaceC28697p instanceof C28693n) {
            C28709x c28709x = this.f58379b;
            Set set = ((C28693n) interfaceC28697p).f58341a;
            ((C28705t) c28709x.f58381g.getValue()).f58361d.setValue(C28659k.f58288a);
            ActivityResultLauncher activityResultLauncher = c28709x.f58382h;
            if (activityResultLauncher != null) {
                activityResultLauncher.launch(set.toArray(new String[0]));
            }
        } else if (interfaceC28697p instanceof C28695o) {
            this.f58379b.mo69598p();
        }
        return Unit.INSTANCE;
    }
}
