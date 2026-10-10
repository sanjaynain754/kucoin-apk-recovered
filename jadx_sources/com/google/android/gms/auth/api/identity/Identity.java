package com.google.android.gms.auth.api.identity;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p849authapi.zbaa;
import com.google.android.gms.internal.p849authapi.zbag;
import com.google.android.gms.internal.p849authapi.zbaq;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* JADX INFO: loaded from: classes45.dex */
public final class Identity {
    @NonNull
    public static AuthorizationClient getAuthorizationClient(@NonNull Activity activity) {
        return new zbaa((Activity) Preconditions.checkNotNull(activity), new zbb(null).zbb());
    }

    @NonNull
    public static CredentialSavingClient getCredentialSavingClient(@NonNull Activity activity) {
        return new zbag((Activity) Preconditions.checkNotNull(activity), new zbi());
    }

    @NonNull
    public static SignInClient getSignInClient(@NonNull Activity activity) {
        return new zbaq((Activity) Preconditions.checkNotNull(activity), new zbv());
    }

    private Identity() {
    }

    @NonNull
    public static AuthorizationClient getAuthorizationClient(@NonNull Context context) {
        return new zbaa((Context) Preconditions.checkNotNull(context), new zbb(null).zbb());
    }

    @NonNull
    public static CredentialSavingClient getCredentialSavingClient(@NonNull Context context) {
        return new zbag((Context) Preconditions.checkNotNull(context), new zbi());
    }

    @NonNull
    public static SignInClient getSignInClient(@NonNull Context context) {
        return new zbaq((Context) Preconditions.checkNotNull(context), new zbv());
    }
}
