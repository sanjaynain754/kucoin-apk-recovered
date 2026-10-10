package com.google.android.gms.auth.blockstore.restorecredential.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth_blockstore.zzb;
import com.google.android.gms.internal.auth_blockstore.zzc;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* JADX INFO: loaded from: classes45.dex */
public interface ICreateRestoreCredentialCallback extends IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
    public static abstract class Stub extends zzb implements ICreateRestoreCredentialCallback {
        @Override // com.google.android.gms.internal.auth_blockstore.zzb
        public boolean dispatchTransaction(int i11, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i12) throws RemoteException {
            if (i11 != 1) {
                return false;
            }
            Status status = (Status) zzc.zza(parcel, Status.CREATOR);
            CreateRestoreCredentialResponse createRestoreCredentialResponse = (CreateRestoreCredentialResponse) zzc.zza(parcel, CreateRestoreCredentialResponse.CREATOR);
            enforceNoDataAvail(parcel);
            onCreateRestoreCredential(status, createRestoreCredentialResponse);
            return true;
        }

        public Stub() {
            super("com.google.android.gms.auth.blockstore.restorecredential.internal.ICreateRestoreCredentialCallback");
        }
    }

    void onCreateRestoreCredential(@NonNull Status status, @NonNull CreateRestoreCredentialResponse createRestoreCredentialResponse) throws RemoteException;
}
