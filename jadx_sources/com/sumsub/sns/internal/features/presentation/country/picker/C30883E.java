package com.sumsub.sns.internal.features.presentation.country.picker;

import android.widget.TextView;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30883E extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62390a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextView f62391b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30883E(TextView textView, Continuation continuation) {
        super(2, continuation);
        this.f62391b = textView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30883E c30883e = new C30883E(this.f62391b, continuation);
        c30883e.f62390a = obj;
        return c30883e;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30883E c30883e = new C30883E(this.f62391b, (Continuation) obj2);
        c30883e.f62390a = (CharSequence) obj;
        return c30883e.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i11;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CharSequence charSequence = (CharSequence) this.f62390a;
        TextView textView = this.f62391b;
        if (charSequence != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        this.f62391b.setText(charSequence);
        return Unit.INSTANCE;
    }
}
