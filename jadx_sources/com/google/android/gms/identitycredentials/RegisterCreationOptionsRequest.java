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
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B;\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0019"}, m90084d2 = {"Lcom/google/android/gms/identitycredentials/RegisterCreationOptionsRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "createOptions", "", "matcher", "type", "", "id", "fulfillmentActionName", "<init>", "([B[BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreateOptions", "()[B", "getMatcher", "getType", "()Ljava/lang/String;", "getId", "getFulfillmentActionName", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SafeParcelable.Class(creator = "RegisterCreationOptionsRequestCreator")
public final class RegisterCreationOptionsRequest extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "getCreateOptions", m12889id = 1)
    @NotNull
    private final byte[] createOptions;

    @SafeParcelable.Field(defaultValue = "", getter = "getFulfillmentActionName", m12889id = 5)
    @NotNull
    private final String fulfillmentActionName;

    @SafeParcelable.Field(getter = "getId", m12889id = 4)
    @NotNull
    private final String id;

    @SafeParcelable.Field(getter = "getMatcher", m12889id = 2)
    @NotNull
    private final byte[] matcher;

    @SafeParcelable.Field(getter = "getType", m12889id = 3)
    @NotNull
    private final String type;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<RegisterCreationOptionsRequest> CREATOR = new RegisterCreationOptionsRequestCreator();

    @SafeParcelable.Constructor
    public RegisterCreationOptionsRequest(@NonNull @SafeParcelable.Param(m12890id = 1) byte[] createOptions, @NonNull @SafeParcelable.Param(m12890id = 2) byte[] matcher, @NonNull @SafeParcelable.Param(m12890id = 3) String type, @NonNull @SafeParcelable.Param(m12890id = 4) String id2, @NonNull @SafeParcelable.Param(m12890id = 5) String fulfillmentActionName) {
        Intrinsics.checkNotNullParameter(createOptions, "createOptions");
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(fulfillmentActionName, "fulfillmentActionName");
        this.createOptions = createOptions;
        this.matcher = matcher;
        this.type = type;
        this.id = id2;
        this.fulfillmentActionName = fulfillmentActionName;
    }

    @NotNull
    public final byte[] getCreateOptions() {
        return this.createOptions;
    }

    @NotNull
    public final String getFulfillmentActionName() {
        return this.fulfillmentActionName;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final byte[] getMatcher() {
        return this.matcher;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        RegisterCreationOptionsRequestCreator.writeToParcel(this, dest, flags);
    }
}
