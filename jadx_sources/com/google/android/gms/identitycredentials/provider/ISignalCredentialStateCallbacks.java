package com.google.android.gms.identitycredentials.provider;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.SignalCredentialStateResponse;
import com.google.android.gms.internal.identity_credentials.zza;
import com.google.android.gms.internal.identity_credentials.zzb;
import com.google.android.gms.internal.identity_credentials.zzc;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
/* JADX INFO: loaded from: classes45.dex */
public interface ISignalCredentialStateCallbacks extends IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
    public static abstract class Stub extends zzb implements ISignalCredentialStateCallbacks {

        /* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
        public static class Proxy extends zza implements ISignalCredentialStateCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks");
            }

            @Override // com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks
            public void onFailure(@NonNull String str, @NonNull String str2) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks
            public void onSuccess(@NonNull SignalCredentialStateResponse signalCredentialStateResponse) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzb(parcelObtainAndWriteInterfaceToken, signalCredentialStateResponse);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        @Override // com.google.android.gms.internal.identity_credentials.zzb
        public boolean dispatchTransaction(int i11, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i12) throws RemoteException {
            if (i11 == 1) {
                SignalCredentialStateResponse signalCredentialStateResponse = (SignalCredentialStateResponse) zzc.zza(parcel, SignalCredentialStateResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onSuccess(signalCredentialStateResponse);
            } else {
                if (i11 != 2) {
                    return false;
                }
                String string = parcel.readString();
                String string2 = parcel.readString();
                enforceNoDataAvail(parcel);
                onFailure(string, string2);
            }
            parcel2.writeNoException();
            return true;
        }

        public Stub() {
            super("com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks");
        }

        @NonNull
        public static ISignalCredentialStateCallbacks asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks");
            return iInterfaceQueryLocalInterface instanceof ISignalCredentialStateCallbacks ? (ISignalCredentialStateCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }
    }

    void onFailure(@NonNull String str, @NonNull String str2) throws RemoteException;

    void onSuccess(@NonNull SignalCredentialStateResponse signalCredentialStateResponse) throws RemoteException;
}
