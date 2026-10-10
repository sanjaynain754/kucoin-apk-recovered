package com.sumsub.sns.internal.features.presentation.videoident.twilio;

import com.twilio.video.TwilioException;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.twilio.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33047g {
    /* JADX INFO: renamed from: a */
    public static final String m71430a(TwilioException twilioException) {
        return "code=" + twilioException.getCode() + ", expl=" + twilioException.getExplanation();
    }
}
