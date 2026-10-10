package com.kubi.spot.business.businessTrack;

import org.jetbrains.annotations.NotNull;
import p569qq.C43841b;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.spot.business.businessTrack.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DurationTrackerHelper.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/spot/business/businessTrack/DurationTrackerHelper;", "", "<init>", "()V", "trackDelegationListEnd", "", "cancelDelegationList", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DurationTrackerHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DurationTrackerHelper f49784a = new DurationTrackerHelper();

    /* JADX INFO: renamed from: a */
    public final void m60348a() {
        DurationTrackManager.Companion companion = DurationTrackManager.f49767c;
        C43841b.m96554a("click_submit_spot_order", companion.getInstance().getF49770b());
        companion.getInstance().m60319d();
        C43841b.m96555b("spot_cancel_order", null, 2, null);
        C43841b.m96555b("refresh_delegation_list", null, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m60349b() {
        C43841b.m96557d("spot_cancel_order", "data_load_finish", null, 4, null);
        C43841b.m96557d("refresh_delegation_list", "receive_list", null, 4, null);
    }
}
