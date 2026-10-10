package com.google.android.gms.identitycredentials.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.identitycredentials.ClearCreationOptionsRequest;
import com.google.android.gms.identitycredentials.ClearCredentialStateRequest;
import com.google.android.gms.identitycredentials.ClearRegistryRequest;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.ImportCredentialsRequest;
import com.google.android.gms.identitycredentials.RegisterCreationOptionsRequest;
import com.google.android.gms.identitycredentials.RegisterExportRequest;
import com.google.android.gms.identitycredentials.RegistrationRequest;
import com.google.android.gms.identitycredentials.SignalCredentialStateRequest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
/* JADX INFO: loaded from: classes45.dex */
public interface IIdentityCredentialService extends IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
    public static abstract class Stub extends com.google.android.gms.internal.identity_credentials.zzb implements IIdentityCredentialService {

        /* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
        public static class Proxy extends com.google.android.gms.internal.identity_credentials.zza implements IIdentityCredentialService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void clearCreationOptions(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull ClearCreationOptionsRequest clearCreationOptionsRequest, @NonNull ApiMetadata apiMetadata) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzc(parcelObtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(parcelObtainAndWriteInterfaceToken, clearCreationOptionsRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(15, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void clearCredentialState(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull ClearCredentialStateRequest clearCredentialStateRequest, @NonNull ApiMetadata apiMetadata) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzc(parcelObtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(parcelObtainAndWriteInterfaceToken, clearCredentialStateRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void clearRegistry(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull ClearRegistryRequest clearRegistryRequest, @NonNull ApiMetadata apiMetadata) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzc(parcelObtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(parcelObtainAndWriteInterfaceToken, clearRegistryRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void createCredential(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull CreateCredentialRequest createCredentialRequest, @NonNull ApiMetadata apiMetadata) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzc(parcelObtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(parcelObtainAndWriteInterfaceToken, createCredentialRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void getCredential(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull GetCredentialRequest getCredentialRequest, @NonNull ApiMetadata apiMetadata) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzc(parcelObtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(parcelObtainAndWriteInterfaceToken, getCredentialRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void importCredentials(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull ImportCredentialsRequest importCredentialsRequest, @NonNull ApiMetadata apiMetadata) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzc(parcelObtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(parcelObtainAndWriteInterfaceToken, importCredentialsRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void registerCreationOptions(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull RegisterCreationOptionsRequest registerCreationOptionsRequest, @NonNull ApiMetadata apiMetadata) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzc(parcelObtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(parcelObtainAndWriteInterfaceToken, registerCreationOptionsRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void registerCredentials(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull RegistrationRequest registrationRequest, @NonNull ApiMetadata apiMetadata) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzc(parcelObtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(parcelObtainAndWriteInterfaceToken, registrationRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void registerExport(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull RegisterExportRequest registerExportRequest, @NonNull ApiMetadata apiMetadata) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzc(parcelObtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(parcelObtainAndWriteInterfaceToken, registerExportRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void signalCredentialState(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull SignalCredentialStateRequest signalCredentialStateRequest, @NonNull ApiMetadata apiMetadata) throws RemoteException {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzc(parcelObtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(parcelObtainAndWriteInterfaceToken, signalCredentialStateRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }
        }

        @Override // com.google.android.gms.internal.identity_credentials.zzb
        public boolean dispatchTransaction(int i11, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i12) throws RemoteException {
            throw null;
        }

        @NonNull
        public static IIdentityCredentialService asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
            return iInterfaceQueryLocalInterface instanceof IIdentityCredentialService ? (IIdentityCredentialService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }
    }

    void clearCreationOptions(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull ClearCreationOptionsRequest clearCreationOptionsRequest, @NonNull ApiMetadata apiMetadata) throws RemoteException;

    void clearCredentialState(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull ClearCredentialStateRequest clearCredentialStateRequest, @NonNull ApiMetadata apiMetadata) throws RemoteException;

    void clearRegistry(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull ClearRegistryRequest clearRegistryRequest, @NonNull ApiMetadata apiMetadata) throws RemoteException;

    void createCredential(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull CreateCredentialRequest createCredentialRequest, @NonNull ApiMetadata apiMetadata) throws RemoteException;

    void getCredential(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull GetCredentialRequest getCredentialRequest, @NonNull ApiMetadata apiMetadata) throws RemoteException;

    void importCredentials(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull ImportCredentialsRequest importCredentialsRequest, @NonNull ApiMetadata apiMetadata) throws RemoteException;

    void registerCreationOptions(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull RegisterCreationOptionsRequest registerCreationOptionsRequest, @NonNull ApiMetadata apiMetadata) throws RemoteException;

    void registerCredentials(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull RegistrationRequest registrationRequest, @NonNull ApiMetadata apiMetadata) throws RemoteException;

    void registerExport(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull RegisterExportRequest registerExportRequest, @NonNull ApiMetadata apiMetadata) throws RemoteException;

    void signalCredentialState(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull SignalCredentialStateRequest signalCredentialStateRequest, @NonNull ApiMetadata apiMetadata) throws RemoteException;
}
