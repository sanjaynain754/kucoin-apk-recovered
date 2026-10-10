package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.E1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C31177E1 extends AdaptedFunctionReference implements Function2 {
    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AbstractC28052C.throwError$default((C31243a2) this.receiver, (Throwable) obj, (String) obj2, null, 4, null);
        return Unit.INSTANCE;
    }

    public C31177E1(C31243a2 c31243a2) {
        super(2, c31243a2, C31243a2.class, "throwError", "throwError(Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;)V", 0);
    }
}
