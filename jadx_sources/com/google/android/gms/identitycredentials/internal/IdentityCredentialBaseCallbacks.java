package com.google.android.gms.identitycredentials.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.ClearCreationOptionsResponse;
import com.google.android.gms.identitycredentials.ClearCredentialStateResponse;
import com.google.android.gms.identitycredentials.ClearExportResponse;
import com.google.android.gms.identitycredentials.ClearRegistryResponse;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.CreateCredentialResponse;
import com.google.android.gms.identitycredentials.CredentialTransferCapabilities;
import com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse;
import com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupResponse;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.identitycredentials.PendingImportCredentialsHandle;
import com.google.android.gms.identitycredentials.RegisterCreationOptionsResponse;
import com.google.android.gms.identitycredentials.RegisterExportResponse;
import com.google.android.gms.identitycredentials.RegistrationResponse;
import com.google.android.gms.identitycredentials.SignalCredentialStateResponse;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010%H\u0016¨\u0006&"}, m90084d2 = {"Lcom/google/android/gms/identitycredentials/internal/IdentityCredentialBaseCallbacks;", "Lcom/google/android/gms/identitycredentials/internal/IIdentityCredentialCallbacks$Stub;", "<init>", "()V", "onRegisterCredentials", "", "status", "Lcom/google/android/gms/common/api/Status;", DbParams.KEY_CHANNEL_RESULT, "Lcom/google/android/gms/identitycredentials/RegistrationResponse;", "onGetCredential", "Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;", "onCreateCredential", "Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;", "onCreateCredentialV2", "Lcom/google/android/gms/identitycredentials/CreateCredentialHandle;", "onClearRegistry", "Lcom/google/android/gms/identitycredentials/ClearRegistryResponse;", "onImportCredentials", "Lcom/google/android/gms/identitycredentials/PendingImportCredentialsHandle;", "onRegisterExport", "Lcom/google/android/gms/identitycredentials/RegisterExportResponse;", "onRegisterCreationOptions", "Lcom/google/android/gms/identitycredentials/RegisterCreationOptionsResponse;", "onClearCredentialState", "Lcom/google/android/gms/identitycredentials/ClearCredentialStateResponse;", "onSignalCredentialState", "Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;", "onClearExport", "Lcom/google/android/gms/identitycredentials/ClearExportResponse;", "onImportCredentialsForDeviceSetup", "Lcom/google/android/gms/identitycredentials/ImportCredentialsForDeviceSetupResponse;", "onExportCredentialsToDeviceSetup", "Lcom/google/android/gms/identitycredentials/ExportCredentialsToDeviceSetupResponse;", "onGetCredentialTransferCapabilities", "Lcom/google/android/gms/identitycredentials/CredentialTransferCapabilities;", "onClearCreationOptions", "Lcom/google/android/gms/identitycredentials/ClearCreationOptionsResponse;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class IdentityCredentialBaseCallbacks extends IIdentityCredentialCallbacks.Stub {
    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void onClearCreationOptions(@NonNull Status status, @Nullable ClearCreationOptionsResponse result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void onClearCredentialState(@NonNull Status status, @Nullable ClearCredentialStateResponse result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void onClearExport(@NonNull Status status, @Nullable ClearExportResponse result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void onClearRegistry(@NonNull Status status, @Nullable ClearRegistryResponse result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void onCreateCredential(@NonNull Status status, @Nullable CreateCredentialResponse result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void onCreateCredentialV2(@NonNull Status status, @Nullable CreateCredentialHandle result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void onExportCredentialsToDeviceSetup(@NonNull Status status, @Nullable ExportCredentialsToDeviceSetupResponse result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void onGetCredential(@NonNull Status status, @Nullable PendingGetCredentialHandle result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void onGetCredentialTransferCapabilities(@NonNull Status status, @Nullable CredentialTransferCapabilities result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void onImportCredentials(@NonNull Status status, @Nullable PendingImportCredentialsHandle result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void onImportCredentialsForDeviceSetup(@NonNull Status status, @Nullable ImportCredentialsForDeviceSetupResponse result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void onRegisterCreationOptions(@NonNull Status status, @Nullable RegisterCreationOptionsResponse result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void onRegisterCredentials(@NonNull Status status, @Nullable RegistrationResponse result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void onRegisterExport(@NonNull Status status, @Nullable RegisterExportResponse result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void onSignalCredentialState(@NonNull Status status, @Nullable SignalCredentialStateResponse result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }
}
