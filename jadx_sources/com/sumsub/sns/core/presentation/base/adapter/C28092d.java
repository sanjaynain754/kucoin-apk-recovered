package com.sumsub.sns.core.presentation.base.adapter;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.features.presentation.status.C32403L;
import com.sumsub.sns.internal.features.presentation.status.C32418d;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.adapter.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C28092d extends FunctionReferenceImpl implements Function1 {
    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        C32418d c32418d = (C32418d) this.receiver;
        if (str != null) {
            AbstractC28052C.onLinkClicked$default((C32403L) c32418d.f66084a.f66110a.getValue(), str, false, 2, null);
        } else {
            c32418d.getClass();
        }
        return Unit.INSTANCE;
    }

    public C28092d(Object obj) {
        super(1, obj, C32418d.class, "onLinkClicked", "onLinkClicked(Ljava/lang/String;)V", 0);
    }
}
