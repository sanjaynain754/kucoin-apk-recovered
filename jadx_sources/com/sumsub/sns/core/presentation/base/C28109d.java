package com.sumsub.sns.core.presentation.base;

import android.os.Bundle;
import android.widget.TextView;
import com.sumsub.sns.R$id;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28109d extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57315a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractActivityC28115f f57316b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TextView f57317c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Bundle f57318d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28109d(AbstractActivityC28115f abstractActivityC28115f, TextView textView, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.f57316b = abstractActivityC28115f;
        this.f57317c = textView;
        this.f57318d = bundle;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28109d c28109d = new C28109d(this.f57316b, this.f57317c, this.f57318d, continuation);
        c28109d.f57315a = obj;
        return c28109d;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28109d) create((C28150t0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i11;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C28150t0 c28150t0 = (C28150t0) this.f57315a;
        AbstractActivityC28115f abstractActivityC28115f = this.f57316b;
        boolean z11 = c28150t0.f57389d;
        int i12 = R$id.sns_powered;
        TextView textView = (TextView) abstractActivityC28115f.findViewById(i12);
        if (textView != null) {
            if (z11) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            textView.setVisibility(i11);
        }
        TextView textView2 = (TextView) this.f57316b.findViewById(i12);
        if (textView2 != null) {
            textView2.setText(c28150t0.f57392g);
        }
        TextView textView3 = this.f57317c;
        if (textView3 != null) {
            AbstractC28458h.m69341a(textView3, c28150t0.f57393h);
        }
        AbstractActivityC28115f abstractActivityC28115f2 = this.f57316b;
        boolean z12 = abstractActivityC28115f2.f57329b;
        boolean z13 = c28150t0.f57391f;
        if (z12 != z13) {
            abstractActivityC28115f2.f57329b = z13;
        }
        return Unit.INSTANCE;
    }
}
