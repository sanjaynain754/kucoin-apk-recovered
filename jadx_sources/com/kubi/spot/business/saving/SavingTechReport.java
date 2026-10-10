package com.kubi.spot.business.saving;

import com.kubi.p110rn.modules.BridgeParamKeyKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;

/* JADX INFO: renamed from: com.kubi.spot.business.saving.r, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SavingTechReport.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/spot/business/saving/SavingTechReport;", "", "<init>", "()V", "PAGE_ID", "", "reportSavingEntranceDisplay", "", "reportSavingSwitchStatusChange", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SavingTechReport {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SavingTechReport f50327a = new SavingTechReport();

    /* JADX INFO: renamed from: a */
    public final void m61348a() {
        C43852m.m96595g("B5trading", "saving_ui_entrance", null, null, 12, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m61349b(boolean z11) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_remark", z11 ? "1" : "0");
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B5trading", "saving_switch_button", "1", jSONObject);
    }
}
