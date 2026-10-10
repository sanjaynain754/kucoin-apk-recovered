package com.sumsub.sns.internal.features.presentation.videoident.service;

import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/service/NotificationState;", "Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;", "strings", "", "getMessage", "(Lcom/sumsub/sns/internal/features/presentation/videoident/service/NotificationState;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/String;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SNSVideoChatServiceKt {

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotificationState.values().length];
            try {
                iArr[NotificationState.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationState.WAITING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getMessage(NotificationState notificationState, C29983l c29983l) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[notificationState.ordinal()];
        if (i11 == 1) {
            String strM70061a = c29983l.m70061a("sns_videoident_notification_expertJoined");
            return strM70061a == null ? "Operator connected" : strM70061a;
        }
        if (i11 != 2) {
            return "";
        }
        String strM70061a2 = c29983l.m70061a("sns_videoident_notification_waitingForExpert");
        return strM70061a2 == null ? "Waiting for operator" : strM70061a2;
    }
}
