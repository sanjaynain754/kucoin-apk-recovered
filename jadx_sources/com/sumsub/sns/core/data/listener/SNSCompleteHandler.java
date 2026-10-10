package com.sumsub.sns.core.data.listener;

import androidx.annotation.Keep;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.data.model.SNSSDKState;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;", "", "onComplete", "", DbParams.KEY_CHANNEL_RESULT, "Lcom/sumsub/sns/core/data/model/SNSCompletionResult;", "state", "Lcom/sumsub/sns/core/data/model/SNSSDKState;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface SNSCompleteHandler {
    void onComplete(@NotNull SNSCompletionResult result, @NotNull SNSSDKState state);
}
