package com.kubi.futures.dialog;

import androidx.fragment.app.FragmentManager;
import com.kubi.kumex.R$string;
import com.kubi.kumex.dialog.C15943u;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.futures.dialog.f1 */
/* JADX INFO: compiled from: PositionRiskRatioDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0004"}, m90084d2 = {"showIsolateRiskRatioDialog", "", "manager", "Landroidx/fragment/app/FragmentManager;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C13080f1 {
    /* JADX INFO: renamed from: b */
    public static final void m25280b(FragmentManager fragmentManager) {
        C15943u.m33667J(R$string.kumex_position_risk_ratio, R$string.kumex_cross_risk_rate_desc, null, 4, null).show(fragmentManager, "IsolatedRiskRatioDialog");
    }
}
