package com.sumsub.sns.internal.core.common;

import androidx.fragment.app.Fragment;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.v0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28501v0 {
    /* JADX INFO: renamed from: a */
    public static void m69388a(InterfaceC28504w0 interfaceC28504w0, Fragment fragment, String str, boolean z11, int i11) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        SNSAppActivity.m70600a((SNSAppActivity) interfaceC28504w0, fragment, str, z11, 4);
    }
}
