package com.kubi.kyc.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.extensions.C27041f;
import com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.TPReportParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycEntity.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/kyc/api/KycReasonEntity;", "Landroid/os/Parcelable;", "code", "", TPReportParams.JSON_KEY_VAL, "valEn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getVal", "getValEn", "getDesc", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KycApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KycReasonEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<KycReasonEntity> CREATOR = new C17093a();

    @Nullable
    private final String code;

    @Nullable
    private final String val;

    @Nullable
    private final String valEn;

    /* JADX INFO: renamed from: com.kubi.kyc.api.KycReasonEntity$a */
    /* JADX INFO: compiled from: KycEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17093a implements Parcelable.Creator<KycReasonEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KycReasonEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KycReasonEntity(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KycReasonEntity[] newArray(int i11) {
            return new KycReasonEntity[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycReasonEntity)) {
            return false;
        }
        KycReasonEntity kycReasonEntity = (KycReasonEntity) other;
        return Intrinsics.areEqual(this.code, kycReasonEntity.code) && Intrinsics.areEqual(this.val, kycReasonEntity.val) && Intrinsics.areEqual(this.valEn, kycReasonEntity.valEn);
    }

    public static /* synthetic */ KycReasonEntity copy$default(KycReasonEntity kycReasonEntity, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kycReasonEntity.code;
        }
        if ((i11 & 2) != 0) {
            str2 = kycReasonEntity.val;
        }
        if ((i11 & 4) != 0) {
            str3 = kycReasonEntity.valEn;
        }
        return kycReasonEntity.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVal() {
        return this.val;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValEn() {
        return this.valEn;
    }

    @NotNull
    public final KycReasonEntity copy(@Nullable String code, @Nullable String val, @Nullable String valEn) {
        return new KycReasonEntity(code, val, valEn);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getVal() {
        return this.val;
    }

    @Nullable
    public final String getValEn() {
        return this.valEn;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.val;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.valEn;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KycReasonEntity(code=" + this.code + ", val=" + this.val + ", valEn=" + this.valEn + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.code);
        dest.writeString(this.val);
        dest.writeString(this.valEn);
    }

    public KycReasonEntity(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.code = str;
        this.val = str2;
        this.valEn = str3;
    }

    @NotNull
    public final String getDesc() {
        String str;
        if (MultiLanguageManager.m56980j()) {
            str = this.val;
        } else {
            str = this.valEn;
        }
        return C27041f.m66668h(str);
    }
}
