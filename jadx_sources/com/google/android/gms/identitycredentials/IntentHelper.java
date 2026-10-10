package com.google.android.gms.identitycredentials;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u001bH\u0007J\"\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0007J\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0007J\u0018\u0010$\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0007J\u0014\u0010%\u001a\u00020&2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0002J\u0014\u0010'\u001a\u00020(2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u00061"}, m90084d2 = {"Lcom/google/android/gms/identitycredentials/IntentHelper;", "", "<init>", "()V", "ACTION_GET_CREDENTIAL", "", "ACTION_IMPORT_CREDENTIAL", "EXTRA_GET_CREDENTIAL_REQUEST", "EXTRA_IMPORT_CREDENTIALS_REQUEST", "EXTRA_IMPORT_CREDENTIALS_REQUEST_JSON", "EXTRA_CALLING_PACKAGE_NAME", "EXTRA_SIGNATURE_COUNT", "EXTRA_SIGNATURE_PREFIX", "EXTRA_SIGNING_INFO", "EXTRA_ORIGIN", "EXTRA_CREDENTIAL_ID", "extractGetCredentialRequest", "Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "intent", "Landroid/content/Intent;", "extractCallingAppInfo", "Lcom/google/android/gms/identitycredentials/CallingAppInfo;", "setImportCredentialsResponse", "", "response", "Lcom/google/android/gms/identitycredentials/ImportCredentialsResponse;", "setGetCredentialResponse", "Lcom/google/android/gms/identitycredentials/GetCredentialResponse;", "setGetCredentialException", "errorType", "errorMessage", "extractImportCredentialsResponse", "resultCode", "", "resultData", "Landroid/os/Bundle;", "extractGetCredentialResponse", "newUnknownException", "Lcom/google/android/gms/identitycredentials/GetCredentialException;", "newUnknownImportCredentialsException", "Lcom/google/android/gms/identitycredentials/ImportCredentialsException;", "EXTRA_EXCEPTION_TYPE", "EXTRA_IMPORT_CREDENTIALS_RESPONSE", "EXTRA_EXCEPTION_MESSAGE", "EXTRA_CREDENTIAL_TYPE", "EXTRA_CREDENTIAL_DATA", "BUNDLE_KEY_PROVIDER_DATA", "BUNDLE_KEY_EXCEPTION_TYPE", "BUNDLE_KEY_EXCEPTION_MESSAGE", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class IntentHelper {

    @NotNull
    public static final String ACTION_GET_CREDENTIAL = "androidx.identitycredentials.action.GET_CREDENTIALS";

    @NotNull
    public static final String EXTRA_CREDENTIAL_ID = "androidx.identitycredentials.extra.CREDENTIAL_ID";

    @NotNull
    public static final IntentHelper INSTANCE = new IntentHelper();

    @Nullable
    @JvmStatic
    public static final CallingAppInfo extractCallingAppInfo(@NonNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        intent.setExtrasClassLoader(null);
        String stringExtra = intent.getStringExtra("androidx.identitycredentials.extra.CALLING_PACKAGE_NAME");
        if (stringExtra == null) {
            return null;
        }
        String stringExtra2 = intent.getStringExtra("androidx.identitycredentials.extra.ORIGIN");
        int intExtra = intent.getIntExtra("androidx.identitycredentials.extra.SIGNATURE_COUNT", 0);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < intExtra; i11++) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 45);
            sb2.append("androidx.identitycredentials.extra.SIGNATURE_");
            sb2.append(i11);
            byte[] byteArrayExtra = intent.getByteArrayExtra(sb2.toString());
            if (byteArrayExtra == null) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 40);
                sb3.append("cannot find expected signature at count ");
                sb3.append(i11);
                Log.w("IntentHelper", sb3.toString());
                return null;
            }
            arrayList.add(byteArrayExtra);
        }
        return new CallingAppInfo(stringExtra, arrayList, stringExtra2);
    }

    @Nullable
    @JvmStatic
    public static final GetCredentialRequest extractGetCredentialRequest(@NonNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        intent.setExtrasClassLoader(GetCredentialRequest.class.getClassLoader());
        return (GetCredentialRequest) intent.getParcelableExtra("androidx.identitycredentials.extra.GET_CREDENTIAL_REQUEST");
    }

    private final GetCredentialException newUnknownException(String errorMessage) {
        return new GetCredentialException("android.credentials.GetCredentialException.TYPE_UNKNOWN", errorMessage);
    }

    @JvmStatic
    public static final void setGetCredentialException(@NonNull Intent intent, @NonNull String errorType, @org.jetbrains.annotations.Nullable String errorMessage) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        intent.putExtra("androidx.identitycredentials.EXTRA_EXCEPTION_TYPE", errorType);
        intent.putExtra("androidx.identitycredentials.EXTRA_EXCEPTION_MESSAGE", errorMessage);
    }

    @JvmStatic
    public static final void setGetCredentialResponse(@NonNull Intent intent, @NonNull GetCredentialResponse response) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(response, "response");
        intent.putExtra("androidx.identitycredentials.EXTRA_CREDENTIAL_TYPE", response.getCredential().getType());
        intent.putExtra("androidx.identitycredentials.EXTRA_CREDENTIAL_DATA", response.getCredential().getData());
    }

    private IntentHelper() {
    }

    @JvmStatic
    @NotNull
    public static final GetCredentialResponse extractGetCredentialResponse(int resultCode, @NonNull Bundle resultData) throws GetCredentialException {
        Intent intent;
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(resultData, "resultData");
        if (resultCode != -1) {
            if (resultCode == 0) {
                CharSequence charSequence = resultData.getCharSequence("androidx.identitycredentials.BUNDLE_KEY_EXCEPTION_TYPE");
                if (charSequence != null) {
                    string = charSequence.toString();
                } else {
                    string = "android.credentials.GetCredentialException.TYPE_USER_CANCELED";
                }
                CharSequence charSequence2 = resultData.getCharSequence("androidx.identitycredentials.BUNDLE_KEY_EXCEPTION_MESSAGE");
                if (charSequence2 != null) {
                    string2 = charSequence2.toString();
                } else {
                    string2 = null;
                }
                throw new GetCredentialException(string, string2);
            }
            IntentHelper intentHelper = INSTANCE;
            StringBuilder sb2 = new StringBuilder(String.valueOf(resultCode).length() + 43);
            sb2.append("Activity result has unexpected resultCode: ");
            sb2.append(resultCode);
            throw intentHelper.newUnknownException(sb2.toString());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            intent = (Intent) resultData.getParcelable("androidx.identitycredentials.BUNDLE_KEY_PROVIDER_DATA", Intent.class);
        } else {
            intent = (Intent) resultData.getParcelable("androidx.identitycredentials.BUNDLE_KEY_PROVIDER_DATA");
        }
        if (intent != null) {
            if (intent.hasExtra("androidx.identitycredentials.EXTRA_CREDENTIAL_TYPE")) {
                String stringExtra = intent.getStringExtra("androidx.identitycredentials.EXTRA_CREDENTIAL_TYPE");
                Bundle bundleExtra = intent.getBundleExtra("androidx.identitycredentials.EXTRA_CREDENTIAL_DATA");
                if (stringExtra != null && bundleExtra != null) {
                    return new GetCredentialResponse(new Credential(stringExtra, bundleExtra));
                }
                throw INSTANCE.newUnknownException("Credential result is empty");
            }
            if (intent.hasExtra("androidx.identitycredentials.EXTRA_EXCEPTION_TYPE")) {
                String stringExtra2 = intent.getStringExtra("androidx.identitycredentials.EXTRA_EXCEPTION_TYPE");
                if (stringExtra2 == null) {
                    throw INSTANCE.newUnknownException("Unknown provider error");
                }
                throw new GetCredentialException(stringExtra2, intent.getStringExtra("androidx.identitycredentials.EXTRA_EXCEPTION_MESSAGE"));
            }
            throw INSTANCE.newUnknownException("Unknown provider error");
        }
        throw INSTANCE.newUnknownException("Provider result is empty");
    }
}
