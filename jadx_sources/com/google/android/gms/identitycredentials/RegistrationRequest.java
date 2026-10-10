package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"BU\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\b\b\u0003\u0010\n\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rB7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\f\u0010\u000eJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006#"}, m90084d2 = {"Lcom/google/android/gms/identitycredentials/RegistrationRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "credentials", "", "matcher", "type", "", "requestType", "protocolTypes", "", "id", "fulfillmentActionName", "<init>", "([B[BLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "([B[BLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCredentials", "()[B", "getMatcher", "getType", "()Ljava/lang/String;", "getRequestType$annotations", "()V", "getRequestType", "getProtocolTypes$annotations", "getProtocolTypes", "()Ljava/util/List;", "getId", "getFulfillmentActionName", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SafeParcelable.Class(creator = "RegistrationRequestCreator")
public final class RegistrationRequest extends AbstractSafeParcelable {

    @NotNull
    public static final String TAG = "RegistrationRequest";

    @SafeParcelable.Field(getter = "getCredentials", m12889id = 1)
    @NotNull
    private final byte[] credentials;

    @SafeParcelable.Field(defaultValue = "", getter = "getFulfillmentActionName", m12889id = 7)
    @NotNull
    private final String fulfillmentActionName;

    @SafeParcelable.Field(defaultValue = "", getter = "getId", m12889id = 6)
    @NotNull
    private final String id;

    @SafeParcelable.Field(getter = "getMatcher", m12889id = 2)
    @NotNull
    private final byte[] matcher;

    @SafeParcelable.Field(defaultValueUnchecked = "java.util.Collections.emptyList()", getter = "getProtocolTypes", m12889id = 5)
    @NotNull
    private final List<String> protocolTypes;

    @SafeParcelable.Field(defaultValue = "", getter = "getRequestType", m12889id = 4)
    @NotNull
    private final String requestType;

    @SafeParcelable.Field(defaultValue = "", getter = "getType", m12889id = 3)
    @NotNull
    private final String type;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<RegistrationRequest> CREATOR = new RegistrationRequestCreator();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RegistrationRequest(@NonNull byte[] credentials, @NonNull byte[] matcher, @NonNull String type, @NonNull String requestType, @NonNull List<String> protocolTypes) {
        this(credentials, matcher, type, requestType, protocolTypes, "", null, 64, null);
        Intrinsics.checkNotNullParameter(credentials, "credentials");
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(protocolTypes, "protocolTypes");
    }

    @SafeParcelable.Constructor
    public RegistrationRequest(@NonNull @SafeParcelable.Param(m12890id = 1) byte[] credentials, @NonNull @SafeParcelable.Param(m12890id = 2) byte[] matcher, @NonNull @SafeParcelable.Param(m12890id = 3) String type, @NonNull @SafeParcelable.Param(m12890id = 4) String requestType, @NonNull @SafeParcelable.Param(m12890id = 5) List<String> protocolTypes, @NonNull @SafeParcelable.Param(m12890id = 6) String id2, @NonNull @SafeParcelable.Param(m12890id = 7) String fulfillmentActionName) {
        boolean z11;
        Intrinsics.checkNotNullParameter(credentials, "credentials");
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(protocolTypes, "protocolTypes");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(fulfillmentActionName, "fulfillmentActionName");
        this.credentials = credentials;
        this.matcher = matcher;
        this.type = type;
        this.requestType = requestType;
        this.protocolTypes = protocolTypes;
        this.id = id2;
        this.fulfillmentActionName = fulfillmentActionName;
        if (!StringsKt.isBlank(requestType) && !protocolTypes.isEmpty() && (protocolTypes == null || !protocolTypes.isEmpty())) {
            Iterator<T> it = protocolTypes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = false;
                    break;
                } else if (!StringsKt.isBlank((String) it.next())) {
                    z11 = true;
                    break;
                }
            }
        } else {
            z11 = false;
            break;
        }
        boolean z12 = !StringsKt.isBlank(this.type) && this.requestType.length() == 0 && this.protocolTypes.isEmpty();
        if (z11 || z12) {
            return;
        }
        String str = this.type;
        String str2 = this.requestType;
        List<String> list = this.protocolTypes;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 31 + String.valueOf(str2).length() + 20 + String.valueOf(list).length() + 94);
        sb2.append("Either type: ");
        sb2.append(str);
        sb2.append(", or requestType: ");
        sb2.append(str2);
        sb2.append(" and protocolTypes: ");
        sb2.append(list);
        sb2.append(" must be specified, but all were blank, or for protocolTypes, empty or full of blank elements.");
        throw new IllegalArgumentException(sb2.toString());
    }

    @NotNull
    public final byte[] getCredentials() {
        return this.credentials;
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
    public final List<String> getProtocolTypes() {
        return this.protocolTypes;
    }

    @NotNull
    public final String getRequestType() {
        return this.requestType;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        RegistrationRequestCreator.writeToParcel(this, dest, flags);
    }

    public /* synthetic */ RegistrationRequest(@NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull String str, @NonNull String str2, @NonNull List list, @NonNull String str3, @NonNull String str4, int i11, @NonNull DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, bArr2, str, str2, list, "", "");
    }
}
