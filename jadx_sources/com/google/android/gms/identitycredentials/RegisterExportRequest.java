package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B'\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, m90084d2 = {"Lcom/google/android/gms/identitycredentials/RegisterExportRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "matcher", "", "data", "id", "", "<init>", "([B[BLjava/lang/String;)V", "getMatcher", "()[B", "getData", "getId", "()Ljava/lang/String;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SafeParcelable.Class(creator = "RegisterExportRequestCreator")
public final class RegisterExportRequest extends AbstractSafeParcelable {

    @NotNull
    public static final String REQUEST_TYPE = "androidx.identitycredentials.TYPE_CREDENTIALS_SYNC";

    @SafeParcelable.Field(getter = "getData", m12889id = 2)
    @NotNull
    private final byte[] data;

    @SafeParcelable.Field(getter = "getId", m12889id = 3)
    @NotNull
    private final String id;

    @SafeParcelable.Field(getter = "getMatcher", m12889id = 1)
    @NotNull
    private final byte[] matcher;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<RegisterExportRequest> CREATOR = new RegisterExportRequestCreator();

    @SafeParcelable.Constructor
    public RegisterExportRequest(@NonNull @SafeParcelable.Param(m12890id = 1) byte[] matcher, @NonNull @SafeParcelable.Param(m12890id = 2) byte[] data, @NonNull @SafeParcelable.Param(m12890id = 3) String id2) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.matcher = matcher;
        this.data = data;
        this.id = id2;
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final byte[] getMatcher() {
        return this.matcher;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        RegisterExportRequestCreator.writeToParcel(this, dest, flags);
    }
}
