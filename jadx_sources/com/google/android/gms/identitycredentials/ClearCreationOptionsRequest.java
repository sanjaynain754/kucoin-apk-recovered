package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.credentials.provider.CredentialEntry;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u001f\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, m90084d2 = {"Lcom/google/android/gms/identitycredentials/ClearCreationOptionsRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "deleteAll", "", "clearTypedRegistryOption", "Lcom/google/android/gms/identitycredentials/ClearCreationOptionsRequest$ClearTypedCreationOption;", "<init>", "(ZLcom/google/android/gms/identitycredentials/ClearCreationOptionsRequest$ClearTypedCreationOption;)V", "()V", "getDeleteAll", "()Z", "getClearTypedRegistryOption", "()Lcom/google/android/gms/identitycredentials/ClearCreationOptionsRequest$ClearTypedCreationOption;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Companion", "ClearTypedCreationOption", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SafeParcelable.Class(creator = "ClearCreationOptionsRequestCreator")
public final class ClearCreationOptionsRequest extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "getClearTypedRegistryOption", m12889id = 2)
    @Nullable
    private final ClearTypedCreationOption clearTypedRegistryOption;

    @SafeParcelable.Field(defaultValue = CredentialEntry.TRUE_STRING, getter = "getDeleteAll", m12889id = 1)
    private final boolean deleteAll;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<ClearCreationOptionsRequest> CREATOR = new ClearCreationOptionsRequestCreator();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B-\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m90084d2 = {"Lcom/google/android/gms/identitycredentials/ClearCreationOptionsRequest$ClearTypedCreationOption;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "deleteAllForType", "", "type", "", "registryIds", "", "<init>", "(ZLjava/lang/String;Ljava/util/List;)V", "getDeleteAllForType", "()Z", "getType", "()Ljava/lang/String;", "getRegistryIds", "()Ljava/util/List;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SafeParcelable.Class(creator = "ClearTypedCreationOptionCreator")
    public static final class ClearTypedCreationOption extends AbstractSafeParcelable {

        @SafeParcelable.Field(getter = "getDeleteAllForType", m12889id = 1)
        private final boolean deleteAllForType;

        @SafeParcelable.Field(getter = "getRegistryIds", m12889id = 3)
        @NotNull
        private final List<String> registryIds;

        @SafeParcelable.Field(getter = "getType", m12889id = 2)
        @NotNull
        private final String type;

        @JvmField
        @NotNull
        public static final Parcelable.Creator<ClearTypedCreationOption> CREATOR = new ClearTypedCreationOptionCreator();

        public final boolean getDeleteAllForType() {
            return this.deleteAllForType;
        }

        @NotNull
        public final List<String> getRegistryIds() {
            return this.registryIds;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            ClearTypedCreationOptionCreator.writeToParcel(this, dest, flags);
        }

        @SafeParcelable.Constructor
        public ClearTypedCreationOption(@SafeParcelable.Param(m12890id = 1) boolean z11, @NonNull @SafeParcelable.Param(m12890id = 2) String type, @NonNull @SafeParcelable.Param(m12890id = 3) List<String> registryIds) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(registryIds, "registryIds");
            this.deleteAllForType = z11;
            this.type = type;
            this.registryIds = registryIds;
        }
    }

    public ClearCreationOptionsRequest() {
        this(true, null);
    }

    @SafeParcelable.Constructor
    public ClearCreationOptionsRequest(@SafeParcelable.Param(m12890id = 1) boolean z11, @SafeParcelable.Param(m12890id = 2) @Nullable ClearTypedCreationOption clearTypedCreationOption) {
        this.deleteAll = z11;
        this.clearTypedRegistryOption = clearTypedCreationOption;
    }

    @androidx.annotation.Nullable
    public final ClearTypedCreationOption getClearTypedRegistryOption() {
        return this.clearTypedRegistryOption;
    }

    public final boolean getDeleteAll() {
        return this.deleteAll;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ClearCreationOptionsRequestCreator.writeToParcel(this, dest, flags);
    }
}
