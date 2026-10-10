package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\r\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\r\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\r\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\r\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001c"}, m90084d2 = {"Lcom/google/android/gms/identitycredentials/CredentialTransferCapabilities;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "responseBundle", "Landroid/os/Bundle;", "<init>", "(Landroid/os/Bundle;)V", "getResponseBundle", "()Landroid/os/Bundle;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "getTotalNumCredentials", "()Ljava/lang/Integer;", "getNumPasswords", "getNumPasskeys", "getNumCustomCredentials", "key", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "getTotalSizeBytes", "", "()Ljava/lang/Long;", "getProviderAppInfo", "Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SafeParcelable.Class(creator = "CredentialTransferCapabilitiesCreator")
public final class CredentialTransferCapabilities extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "getResponseBundle", m12889id = 1)
    @NotNull
    private final Bundle responseBundle;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<CredentialTransferCapabilities> CREATOR = new CredentialTransferCapabilitiesCreator();

    @Nullable
    public final Integer getNumCustomCredentials(@NonNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.responseBundle.containsKey(key)) {
            return Integer.valueOf(this.responseBundle.getInt(key));
        }
        return null;
    }

    @Nullable
    public final Integer getNumPasskeys() {
        if (this.responseBundle.containsKey("NUM_PASSKEYS")) {
            return Integer.valueOf(this.responseBundle.getInt("NUM_PASSKEYS"));
        }
        return null;
    }

    @Nullable
    public final Integer getNumPasswords() {
        if (this.responseBundle.containsKey("NUM_PASSWORDS")) {
            return Integer.valueOf(this.responseBundle.getInt("NUM_PASSWORDS"));
        }
        return null;
    }

    @Nullable
    public final CallingAppInfoParcelable getProviderAppInfo() {
        return (CallingAppInfoParcelable) this.responseBundle.getParcelable("PROVIDER_APP_INFO");
    }

    @NotNull
    public final Bundle getResponseBundle() {
        return this.responseBundle;
    }

    @Nullable
    public final Integer getTotalNumCredentials() {
        if (this.responseBundle.containsKey("TOTAL_NUM_CREDENTIALS")) {
            return Integer.valueOf(this.responseBundle.getInt("TOTAL_NUM_CREDENTIALS"));
        }
        return null;
    }

    @Nullable
    public final Long getTotalSizeBytes() {
        if (this.responseBundle.containsKey("TOTAL_SIZE_BYTES")) {
            return Long.valueOf(this.responseBundle.getLong("TOTAL_SIZE_BYTES"));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        CredentialTransferCapabilitiesCreator.writeToParcel(this, dest, flags);
    }

    @SafeParcelable.Constructor
    public CredentialTransferCapabilities(@NonNull @SafeParcelable.Param(m12890id = 1) Bundle responseBundle) {
        Intrinsics.checkNotNullParameter(responseBundle, "responseBundle");
        this.responseBundle = responseBundle;
    }
}
