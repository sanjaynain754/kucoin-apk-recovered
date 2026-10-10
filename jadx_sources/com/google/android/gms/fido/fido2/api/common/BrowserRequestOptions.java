package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class BrowserRequestOptions extends RequestOptions {
    @NonNull
    public abstract byte[] getClientDataHash();

    @NonNull
    public abstract Uri getOrigin();
}
