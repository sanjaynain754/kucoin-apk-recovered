package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.internal.zbm;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* JADX INFO: loaded from: classes45.dex */
@Deprecated
public class GoogleSignInClient extends GoogleApi<GoogleSignInOptions> {
    private static final zbb zbb = new zbb(null);

    @VisibleForTesting
    static int zba = 1;

    public GoogleSignInClient(@NonNull Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, Auth.GOOGLE_SIGN_IN_API, googleSignInOptions, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    private final synchronized int zba() {
        int i11;
        try {
            i11 = zba;
            if (i11 == 1) {
                Context applicationContext = getApplicationContext();
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
                int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(applicationContext, 12451000);
                if (iIsGooglePlayServicesAvailable == 0) {
                    i11 = 4;
                    zba = 4;
                } else if (googleApiAvailability.getErrorResolutionIntent(applicationContext, iIsGooglePlayServicesAvailable, null) != null || DynamiteModule.getLocalVersion(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i11 = 2;
                    zba = 2;
                } else {
                    i11 = 3;
                    zba = 3;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i11;
    }

    public GoogleSignInClient(@NonNull Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, Auth.GOOGLE_SIGN_IN_API, googleSignInOptions, new GoogleApi.Settings.Builder().setMapper(new ApiExceptionMapper()).build());
    }

    @NonNull
    public Intent getSignInIntent() {
        Context applicationContext = getApplicationContext();
        int iZba = zba();
        int i11 = iZba - 1;
        if (iZba != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return zbm.zbb(applicationContext, getApiOptions());
                }
                return zbm.zbc(applicationContext, getApiOptions());
            }
            return zbm.zba(applicationContext, getApiOptions());
        }
        throw null;
    }

    @NonNull
    public Task<Void> revokeAccess() {
        boolean z11;
        GoogleApiClient googleApiClientAsGoogleApiClient = asGoogleApiClient();
        Context applicationContext = getApplicationContext();
        if (zba() == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        return PendingResultUtil.toVoidTask(zbm.zbf(googleApiClientAsGoogleApiClient, applicationContext, z11));
    }

    @NonNull
    public Task<Void> signOut() {
        boolean z11;
        GoogleApiClient googleApiClientAsGoogleApiClient = asGoogleApiClient();
        Context applicationContext = getApplicationContext();
        if (zba() == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        return PendingResultUtil.toVoidTask(zbm.zbg(googleApiClientAsGoogleApiClient, applicationContext, z11));
    }

    @NonNull
    public Task<GoogleSignInAccount> silentSignIn() {
        boolean z11;
        GoogleApiClient googleApiClientAsGoogleApiClient = asGoogleApiClient();
        Context applicationContext = getApplicationContext();
        GoogleSignInOptions apiOptions = getApiOptions();
        if (zba() == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        return PendingResultUtil.toTask(zbm.zbe(googleApiClientAsGoogleApiClient, applicationContext, apiOptions, z11), zbb);
    }
}
