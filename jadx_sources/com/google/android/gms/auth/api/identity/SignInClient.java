package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* JADX INFO: loaded from: classes45.dex */
public interface SignInClient extends HasApiKey<zbv> {
    @NonNull
    @Deprecated
    Task<BeginSignInResult> beginSignIn(@NonNull BeginSignInRequest beginSignInRequest);

    @NonNull
    String getPhoneNumberFromIntent(@Nullable Intent intent) throws ApiException;

    @NonNull
    Task<PendingIntent> getPhoneNumberHintIntent(@NonNull GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest);

    @NonNull
    @Deprecated
    SignInCredential getSignInCredentialFromIntent(@Nullable Intent intent) throws ApiException;

    @NonNull
    @Deprecated
    Task<PendingIntent> getSignInIntent(@NonNull GetSignInIntentRequest getSignInIntentRequest);

    @NonNull
    @Deprecated
    Task<Void> signOut();
}
