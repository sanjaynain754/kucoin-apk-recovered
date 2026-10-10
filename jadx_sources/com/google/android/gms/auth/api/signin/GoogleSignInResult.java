package com.google.android.gms.auth.api.signin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* JADX INFO: loaded from: classes45.dex */
@Deprecated
public class GoogleSignInResult implements Result {
    private final Status zba;

    @Nullable
    private final GoogleSignInAccount zbb;

    @Nullable
    public GoogleSignInAccount getSignInAccount() {
        return this.zbb;
    }

    @Override // com.google.android.gms.common.api.Result
    @NonNull
    public Status getStatus() {
        return this.zba;
    }

    public boolean isSuccess() {
        return this.zba.isSuccess();
    }

    public GoogleSignInResult(@Nullable GoogleSignInAccount googleSignInAccount, @NonNull Status status) {
        this.zbb = googleSignInAccount;
        this.zba = status;
    }
}
