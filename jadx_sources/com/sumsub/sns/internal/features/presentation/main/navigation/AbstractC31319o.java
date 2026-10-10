package com.sumsub.sns.internal.features.presentation.main.navigation;

import p852kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.navigation.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC31319o {
    /* JADX INFO: renamed from: a */
    public static Exception m70679a(InterfaceC31322r interfaceC31322r) {
        if (!(interfaceC31322r instanceof C31320p)) {
            if (interfaceC31322r instanceof C31321q) {
                return new C31326v(((C31321q) interfaceC31322r).f63481a.toString());
            }
            throw new NoWhenBranchMatchedException();
        }
        return new Exception("Module " + ((C31320p) interfaceC31322r).f63480a + " not available");
    }
}
