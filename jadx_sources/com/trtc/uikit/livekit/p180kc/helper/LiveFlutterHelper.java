package com.trtc.uikit.livekit.p180kc.helper;

import com.kubi.sdk.flutter.KCFlutterRouteManager;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.helper.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: LiveFlutterHelper.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0005J\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u001e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/helper/LiveFlutterHelper;", "", "<init>", "()V", "PROFILE_PAGE", "", "REPORT_PAGE", "TRADE_FUTURE_SHARED_POSITION_PAGE", "TRADE_FUTURE_SHARED_POSITION_CARD_PAGE", "jumpProfilePage", "", "txUserId", "jumpReportPage", "roomId", "jumpFutureCardDialog", "roomOwnerId", "tradeFutureSharedPositionCard", "businessId", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LiveFlutterHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final LiveFlutterHelper f79161a = new LiveFlutterHelper();

    /* JADX INFO: renamed from: a */
    public final void m81516a(@NotNull String roomOwnerId, @NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomOwnerId, "roomOwnerId");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        KCFlutterRouteManager.m56840m(KCFlutterRouteManager.f46704a, "market/feed/share_position?userId=" + roomOwnerId + "&roomId=" + roomId + "&theme=dark", null, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m81517b(@NotNull String txUserId) {
        Intrinsics.checkNotNullParameter(txUserId, "txUserId");
        KCFlutterRouteManager.m56839j(KCFlutterRouteManager.f46704a, "market/feed/person_profile?squareUserId=" + txUserId + "&profileType=live", true, null, 4, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m81518c(@NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        KCFlutterRouteManager.m56839j(KCFlutterRouteManager.f46704a, "live/report?roomId=" + roomId, true, null, 4, null);
    }
}
