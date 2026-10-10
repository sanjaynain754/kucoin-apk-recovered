package com.sumsub.sns.internal.features.presentation.sumsubid.p124ui.adapter;

import com.sumsub.sns.internal.features.presentation.sumsubid.AbstractC32550p;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.ui.adapter.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C32566b extends FunctionReferenceImpl implements Function2 {
    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32568d.m71177a((C32568d) this.receiver, ((Number) obj).intValue(), (AbstractC32550p) obj2);
        return Unit.INSTANCE;
    }

    public C32566b(C32568d c32568d) {
        super(2, c32568d, C32568d.class, "onItemChecked", "onItemChecked(ILcom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdDocumentItem;)V", 0);
    }
}
