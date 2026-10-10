package com.sumsub.sns.internal.features.presentation.country.picker;

import com.sumsub.sns.internal.features.presentation.country.C30877b;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30907s extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62438a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30880B f62439b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CountryPickerDialog f62440c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30907s(C30880B c30880b, CountryPickerDialog countryPickerDialog, Continuation continuation) {
        super(2, continuation);
        this.f62439b = c30880b;
        this.f62440c = countryPickerDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30907s c30907s = new C30907s(this.f62439b, this.f62440c, continuation);
        c30907s.f62438a = obj;
        return c30907s;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30907s) create((C30877b) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C30877b c30877b = (C30877b) this.f62438a;
        InterfaceC30893e interfaceC30893e = this.f62439b.f62378a;
        if (interfaceC30893e != null) {
            interfaceC30893e.onItemSelected(c30877b);
        }
        this.f62440c.dismiss();
        return Unit.INSTANCE;
    }
}
