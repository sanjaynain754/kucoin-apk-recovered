package com.google.android.gms.fido.u2f.api.messagebased;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@Deprecated
public enum ResponseType {
    REGISTER("u2f_register_response"),
    SIGN("u2f_sign_response");

    private final String zzb;

    @NonNull
    public static ResponseType getResponseTypeForRequestType(@NonNull RequestType requestType) throws RequestType.UnsupportedRequestTypeException {
        if (requestType == null) {
            throw new RequestType.UnsupportedRequestTypeException(null);
        }
        int iOrdinal = requestType.ordinal();
        if (iOrdinal == 0) {
            return REGISTER;
        }
        if (iOrdinal == 1) {
            return SIGN;
        }
        throw new RequestType.UnsupportedRequestTypeException(requestType.toString());
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.zzb;
    }

    ResponseType(String str) {
        this.zzb = str;
    }
}
