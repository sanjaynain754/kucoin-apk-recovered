package com.sumsub.sns.internal.features.presentation.common;

import com.sumsub.sns.internal.core.presentation.android.C28710y;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C30819e extends FunctionReferenceImpl implements Function0 {
    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        AbstractC30823g abstractC30823g = (AbstractC30823g) this.receiver;
        int i11 = AbstractC30823g.f62258U;
        C28710y c28710y = abstractC30823g.f62259a;
        if (c28710y != null && !c28710y.m69536a(String.valueOf(System.currentTimeMillis()))) {
            ((AbstractC30808G) abstractC30823g.getViewModel$idensic_mobile_sdk_aar_defaultRelease()).getClass();
        }
        return Unit.INSTANCE;
    }

    public C30819e(AbstractC30823g abstractC30823g) {
        super(0, abstractC30823g, AbstractC30823g.class, "openGallery", "openGallery()V", 0);
    }
}
