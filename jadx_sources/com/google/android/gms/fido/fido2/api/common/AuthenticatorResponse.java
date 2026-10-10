package com.google.android.gms.fido.fido2.api.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AuthenticatorResponse extends AbstractSafeParcelable {
    @NonNull
    public abstract byte[] getClientDataJSON();

    @NonNull
    public abstract byte[] serializeToBytes();
}
