package com.jumio.sdk.interfaces;

import com.google.firebase.messaging.Constants;
import com.jumio.sdk.consent.JumioConsentItem;
import com.jumio.sdk.credentials.JumioCredentialInfo;
import com.jumio.sdk.error.JumioError;
import com.jumio.sdk.result.JumioResult;
import com.jumio.sdk.termsofuse.JumioTermsOfUse;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/sdk/interfaces/JumioControllerInterface;", "", "onInitialized", "", "credentials", "", "Lcom/jumio/sdk/credentials/JumioCredentialInfo;", "consentItems", "Lcom/jumio/sdk/consent/JumioConsentItem;", "termsOfUse", "Lcom/jumio/sdk/termsofuse/JumioTermsOfUse;", "onError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/jumio/sdk/error/JumioError;", "onFinished", DbParams.KEY_CHANNEL_RESULT, "Lcom/jumio/sdk/result/JumioResult;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface JumioControllerInterface {
    void onError(@NotNull JumioError error);

    void onFinished(@NotNull JumioResult result);

    void onInitialized(@NotNull List<JumioCredentialInfo> credentials, @Nullable List<JumioConsentItem> consentItems, @Nullable JumioTermsOfUse termsOfUse);
}
