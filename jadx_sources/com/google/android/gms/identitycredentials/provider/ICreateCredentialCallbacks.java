package com.google.android.gms.identitycredentials.provider;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.CreateCredentialResponse;
import com.google.android.gms.internal.identity_credentials.zza;
import com.google.android.gms.internal.identity_credentials.zzb;
import com.google.android.gms.internal.identity_credentials.zzc;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
/* JADX INFO: loaded from: classes45.dex */
public interface ICreateCredentialCallbacks extends IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
    public static abstract class Stub extends zzb implements ICreateCredentialCallbacks {

        /* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
        public static class Proxy extends zza implements ICreateCredentialCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks");
            }

            @Override // com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks
            public void onFailure(@NonNull String str, @NonNull String str2) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks
            public void onSuccess(@NonNull CreateCredentialResponse createCredentialResponse) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzb(parcelObtainAndWriteInterfaceToken, createCredentialResponse);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks
            public void onSuccessV2(@NonNull CreateCredentialResponse createCredentialResponse, @NonNull PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzb(parcelObtainAndWriteInterfaceToken, createCredentialResponse);
                zzc.zzb(parcelObtainAndWriteInterfaceToken, pendingIntent);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }
        }

        @Override // com.google.android.gms.internal.identity_credentials.zzb
        public boolean dispatchTransaction(int i11, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i12) throws RemoteException {
            if (i11 == 1) {
                CreateCredentialResponse createCredentialResponse = (CreateCredentialResponse) zzc.zza(parcel, CreateCredentialResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onSuccess(createCredentialResponse);
            } else if (i11 == 2) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                enforceNoDataAvail(parcel);
                onFailure(string, string2);
            } else {
                if (i11 != 3) {
                    return false;
                }
                CreateCredentialResponse createCredentialResponse2 = (CreateCredentialResponse) zzc.zza(parcel, CreateCredentialResponse.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) zzc.zza(parcel, PendingIntent.CREATOR);
                enforceNoDataAvail(parcel);
                onSuccessV2(createCredentialResponse2, pendingIntent);
            }
            parcel2.writeNoException();
            return true;
        }

        public Stub() {
            super("com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks");
        }

        @NonNull
        public static ICreateCredentialCallbacks asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks");
            return iInterfaceQueryLocalInterface instanceof ICreateCredentialCallbacks ? (ICreateCredentialCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }
    }

    void onFailure(@NonNull String str, @NonNull String str2) throws RemoteException;

    void onSuccess(@NonNull CreateCredentialResponse createCredentialResponse) throws RemoteException;

    void onSuccessV2(@NonNull CreateCredentialResponse createCredentialResponse, @NonNull PendingIntent pendingIntent) throws RemoteException;
}
