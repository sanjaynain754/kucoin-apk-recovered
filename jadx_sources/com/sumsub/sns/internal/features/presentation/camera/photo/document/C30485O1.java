package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import androidx.lifecycle.ViewModelKt;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.io.File;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.channels.InterfaceC41565d;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.O1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30485O1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f61534a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30440B2 f61535b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ File f61536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30485O1(C30440B2 c30440b2, File file, Continuation continuation) {
        super(2, continuation);
        this.f61535b = c30440b2;
        this.f61536c = file;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30485O1(this.f61535b, this.f61536c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30485O1(this.f61535b, this.f61536c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61534a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41565d interfaceC41565d = this.f61535b.f61297R;
            this.f61534a = 1;
            if (interfaceC41565d.mo90550D(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        C30440B2 c30440b2 = this.f61535b;
        File file = this.f61536c;
        KProperty[] kPropertyArr = C30440B2.f61279U;
        c30440b2.getClass();
        Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c30440b2), "Picture is taken", null, 4, null);
        C29054T c29054t = new C29054T(file, file, null, null, (IdentitySide) c30440b2.f61309j.get("current_side"), null, null, 1004);
        C32635M c32635m = c30440b2.f61310k;
        if (c32635m != null) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(c30440b2), null, null, new C30435A1(c30440b2, c32635m, c29054t, null), 3, null);
        } else {
            c30440b2.showProgress(true);
            AbstractC28052C.finish$default(c30440b2, null, c29054t, null, null, 13, null);
        }
        return Unit.INSTANCE;
    }
}
