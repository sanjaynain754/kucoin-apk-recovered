package com.google.android.gms.identitycredentials.provider;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.identitycredentials.CreateCredentialException;
import com.google.android.gms.identitycredentials.CreateCredentialResponse;
import com.google.firebase.messaging.Constants;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/google/android/gms/identitycredentials/provider/CreateCredentialCallback;", "", "onConditionalCreateResult", "", DbParams.KEY_CHANNEL_RESULT, "Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "onError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/google/android/gms/identitycredentials/CreateCredentialException;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface CreateCredentialCallback {
    void onConditionalCreateResult(@NonNull CreateCredentialResponse result, @NonNull PendingIntent pendingIntent);

    void onError(@NonNull CreateCredentialException error);
}
