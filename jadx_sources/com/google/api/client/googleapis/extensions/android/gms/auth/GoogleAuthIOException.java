package com.google.api.client.googleapis.extensions.android.gms.auth;

import com.google.android.gms.auth.GoogleAuthException;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import java.io.IOException;

/* JADX INFO: loaded from: classes56.dex */
@Beta
public class GoogleAuthIOException extends IOException {
    private static final long serialVersionUID = 1;

    @Override // java.lang.Throwable
    public GoogleAuthException getCause() {
        return (GoogleAuthException) super.getCause();
    }

    public GoogleAuthIOException(GoogleAuthException googleAuthException) {
        initCause((Throwable) Preconditions.checkNotNull(googleAuthException));
    }
}
