package com.sumsub.sns.internal.core.analytics;

import com.tencent.bugly.proguard.C33844oi;
import p852kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.analytics.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28370i {
    /* JADX INFO: renamed from: a */
    public static String m69269a(NavigationAction navigationAction, Popup popup) {
        String str = popup != null ? "popup" : "screen";
        return navigationAction.getText() + C33844oi.f71346o + str;
    }

    /* JADX INFO: renamed from: a */
    public static String m69268a(ControlAction controlAction) {
        switch (AbstractC28369h.f57849b[controlAction.ordinal()]) {
            case 1:
                return controlAction.getText() + ":block";
            case 2:
            case 3:
                return controlAction.getText() + ":checkbox";
            case 4:
            case 5:
                return controlAction.getText() + ":button";
            case 6:
                return controlAction.getText() + ":permissions";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m69270a(PrimaryActionState primaryActionState) {
        return primaryActionState.getText() + ":operation";
    }

    /* JADX INFO: renamed from: a */
    public static String m69271a(StepAction stepAction) {
        return stepAction.getText() + ":step";
    }
}
