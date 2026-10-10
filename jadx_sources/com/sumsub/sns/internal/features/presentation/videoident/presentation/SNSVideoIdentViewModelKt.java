package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import p852kotlin.Metadata;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$StateWithVideo;", "Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;", "strings", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "withWarningMessage", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$StateWithVideo;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/Exception;)Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$StateWithVideo;", "", "waitTime", "withAdaptiveWaitingMessage", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$StateWithVideo;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;J)Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$StateWithVideo;", "", "MAX_PHOTO_DIMENSION", "I", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SNSVideoIdentViewModelKt {
    private static final int MAX_PHOTO_DIMENSION = 1920;

    /* JADX INFO: Access modifiers changed from: private */
    public static final SNSViewState.StateWithVideo withAdaptiveWaitingMessage(SNSViewState.StateWithVideo stateWithVideo, C29983l c29983l, long j11) {
        String strReplace;
        String strM70061a = c29983l.m70061a(SNSVideoIdentViewModel.STRING_FOLLOW_WAIT_MESSAGE_ADAPTIVE);
        long jCoerceAtLeast = RangesKt.coerceAtLeast(j11 / ((long) 60), 1L);
        if (strM70061a != null) {
            strReplace = new Regex("\\{timeInMinutes\\}").replace(strM70061a, String.valueOf(jCoerceAtLeast));
        } else {
            strReplace = null;
        }
        stateWithVideo.setMessage(strReplace);
        return stateWithVideo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SNSViewState.StateWithVideo withWarningMessage(SNSViewState.StateWithVideo stateWithVideo, C29983l c29983l, Exception exc) {
        String strM70061a;
        SNSWarning bottomWarning = stateWithVideo.getBottomWarning();
        if (bottomWarning != null) {
            if (exc instanceof SNSException.Network) {
                strM70061a = c29983l.m70061a("sns_videoident_error_connectionFailedNetwork");
            } else {
                strM70061a = c29983l.m70061a("sns_videoident_error_connectionFailedFatal");
            }
            bottomWarning.setText(strM70061a);
        }
        return stateWithVideo;
    }
}
