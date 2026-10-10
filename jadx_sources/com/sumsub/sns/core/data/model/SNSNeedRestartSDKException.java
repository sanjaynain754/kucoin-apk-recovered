package com.sumsub.sns.core.data.model;

import androidx.annotation.Keep;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSNeedRestartSDKException;", "Lcom/sumsub/sns/core/data/model/SNSGeneralException;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SNSNeedRestartSDKException extends SNSGeneralException {
    public SNSNeedRestartSDKException() {
        super("SDK must be restarted", "needRestartSdk", null, 4, null);
    }
}
