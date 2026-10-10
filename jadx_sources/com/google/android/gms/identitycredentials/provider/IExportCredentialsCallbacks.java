package com.google.android.gms.identitycredentials.provider;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse;
import com.google.android.gms.internal.identity_credentials.zza;
import com.google.android.gms.internal.identity_credentials.zzb;
import com.google.android.gms.internal.identity_credentials.zzc;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
/* JADX INFO: loaded from: classes45.dex */
public interface IExportCredentialsCallbacks extends IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
    public static abstract class Stub extends zzb implements IExportCredentialsCallbacks {

        /* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
        public static class Proxy extends zza implements IExportCredentialsCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks");
            }

            @Override // com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks
            public void onFailure(@NonNull String str, @NonNull String str2) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks
            public void onSuccess(@NonNull ExportCredentialsToDeviceSetupResponse exportCredentialsToDeviceSetupResponse) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzb(parcelObtainAndWriteInterfaceToken, exportCredentialsToDeviceSetupResponse);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        @Override // com.google.android.gms.internal.identity_credentials.zzb
        public boolean dispatchTransaction(int i11, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i12) throws RemoteException {
            if (i11 == 1) {
                ExportCredentialsToDeviceSetupResponse exportCredentialsToDeviceSetupResponse = (ExportCredentialsToDeviceSetupResponse) zzc.zza(parcel, ExportCredentialsToDeviceSetupResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onSuccess(exportCredentialsToDeviceSetupResponse);
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
            super("com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks");
        }

        @NonNull
        public static IExportCredentialsCallbacks asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks");
            return iInterfaceQueryLocalInterface instanceof IExportCredentialsCallbacks ? (IExportCredentialsCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }
    }

    void onFailure(@NonNull String str, @NonNull String str2) throws RemoteException;

    void onSuccess(@NonNull ExportCredentialsToDeviceSetupResponse exportCredentialsToDeviceSetupResponse) throws RemoteException;
}
