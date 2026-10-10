package com.kubi.core.spot.business.businessTrack;

import org.jetbrains.annotations.NotNull;
import p569qq.C43841b;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.core.spot.business.businessTrack.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DurationTrackerHelper.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/core/spot/business/businessTrack/DurationTrackerHelper;", "", "<init>", "()V", "trackDelegationListEnd", "", "cancelDelegationList", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DurationTrackerHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DurationTrackerHelper f21018a = new DurationTrackerHelper();

    /* JADX INFO: renamed from: a */
    public final void m22868a() {
        DurationTrackManager.Companion companion = DurationTrackManager.f21006c;
        C43841b.m96554a("unified_click_submit_spot_order", companion.getInstance().getF21009b());
        companion.getInstance().m22856c();
        C43841b.m96555b("unified_spot_cancel_order", null, 2, null);
        C43841b.m96555b("unified_refresh_delegation_list", null, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m22869b() {
        C43841b.m96557d("unified_spot_cancel_order", "data_load_finish", null, 4, null);
        C43841b.m96557d("unified_refresh_delegation_list", "receive_list", null, 4, null);
    }
}
