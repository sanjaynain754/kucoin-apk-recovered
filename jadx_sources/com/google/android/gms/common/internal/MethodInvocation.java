package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.errorprone.annotations.InlineMe;
import com.kubi.otc.entity.OtcAd;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "MethodInvocationCreator")
public class MethodInvocation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new zan();

    @SafeParcelable.Field(getter = "getMethodKey", m12889id = 1)
    private final int zaa;

    @SafeParcelable.Field(getter = "getResultStatusCode", m12889id = 2)
    private final int zab;

    @SafeParcelable.Field(getter = "getConnectionResultStatusCode", m12889id = 3)
    private final int zac;

    @SafeParcelable.Field(getter = "getStartTimeMillis", m12889id = 4)
    private final long zad;

    @SafeParcelable.Field(getter = "getEndTimeMillis", m12889id = 5)
    private final long zae;

    @Nullable
    @SafeParcelable.Field(getter = "getCallingModuleId", m12889id = 6)
    private final String zaf;

    @Nullable
    @SafeParcelable.Field(getter = "getCallingEntryPoint", m12889id = 7)
    private final String zag;

    @SafeParcelable.Field(defaultValue = "0", getter = "getServiceId", m12889id = 8)
    private final int zah;

    @SafeParcelable.Field(defaultValue = OtcAd.KYC_NOT_PASS, getter = "getLatencyMillis", m12889id = 9)
    private final int zai;

    @InlineMe(replacement = "this(methodKey, resultStatusCode, connectionResultStatusCode, startTimeMillis, endTimeMillis, callingModuleId, callingEntryPoint, serviceId, -1)")
    @KeepForSdk
    @Deprecated
    public MethodInvocation(int i11, int i12, int i13, long j11, long j12, @Nullable String str, @Nullable String str2, int i14) {
        this(i11, i12, i13, j11, j12, str, str2, i14, -1);
    }

    @SafeParcelable.Constructor
    public MethodInvocation(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) int i12, @SafeParcelable.Param(m12890id = 3) int i13, @SafeParcelable.Param(m12890id = 4) long j11, @SafeParcelable.Param(m12890id = 5) long j12, @Nullable @SafeParcelable.Param(m12890id = 6) String str, @Nullable @SafeParcelable.Param(m12890id = 7) String str2, @SafeParcelable.Param(m12890id = 8) int i14, @SafeParcelable.Param(m12890id = 9) int i15) {
        this.zaa = i11;
        this.zab = i12;
        this.zac = i13;
        this.zad = j11;
        this.zae = j12;
        this.zaf = str;
        this.zag = str2;
        this.zah = i14;
        this.zai = i15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        int i12 = this.zaa;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i12);
        SafeParcelWriter.writeInt(parcel, 2, this.zab);
        SafeParcelWriter.writeInt(parcel, 3, this.zac);
        SafeParcelWriter.writeLong(parcel, 4, this.zad);
        SafeParcelWriter.writeLong(parcel, 5, this.zae);
        SafeParcelWriter.writeString(parcel, 6, this.zaf, false);
        SafeParcelWriter.writeString(parcel, 7, this.zag, false);
        SafeParcelWriter.writeInt(parcel, 8, this.zah);
        SafeParcelWriter.writeInt(parcel, 9, this.zai);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
