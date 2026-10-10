package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0001)BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0014\u001a\u00020\u0015J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006*"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatSepaPayItem;", "Landroid/os/Parcelable;", "title", "", "value", "desc", "sort", "businessType", "processType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getValue", "getDesc", "getSort", "getBusinessType", "getProcessType", "isDelCopySpace", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatSepaPayItem implements Parcelable {

    @NotNull
    public static final String DEL_COPY_SPACE_TYPE = "1";

    @NotNull
    public static final String INDEX_FIRST_TYPE = "1";

    @NotNull
    public static final String INDEX_SECOND_TYPE = "2";

    @NotNull
    public static final String QR_CDDE_TYPE = "2";

    @Nullable
    private final String businessType;

    @Nullable
    private final String desc;

    @Nullable
    private final String processType;

    @Nullable
    private final String sort;

    @Nullable
    private String title;

    @Nullable
    private final String value;

    @NotNull
    public static final Parcelable.Creator<FiatSepaPayItem> CREATOR = new Creator();

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FiatSepaPayItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatSepaPayItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FiatSepaPayItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatSepaPayItem[] newArray(int i11) {
            return new FiatSepaPayItem[i11];
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
        if (!(other instanceof FiatSepaPayItem)) {
            return false;
        }
        FiatSepaPayItem fiatSepaPayItem = (FiatSepaPayItem) other;
        return Intrinsics.areEqual(this.title, fiatSepaPayItem.title) && Intrinsics.areEqual(this.value, fiatSepaPayItem.value) && Intrinsics.areEqual(this.desc, fiatSepaPayItem.desc) && Intrinsics.areEqual(this.sort, fiatSepaPayItem.sort) && Intrinsics.areEqual(this.businessType, fiatSepaPayItem.businessType) && Intrinsics.areEqual(this.processType, fiatSepaPayItem.processType);
    }

    public static /* synthetic */ FiatSepaPayItem copy$default(FiatSepaPayItem fiatSepaPayItem, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatSepaPayItem.title;
        }
        if ((i11 & 2) != 0) {
            str2 = fiatSepaPayItem.value;
        }
        if ((i11 & 4) != 0) {
            str3 = fiatSepaPayItem.desc;
        }
        if ((i11 & 8) != 0) {
            str4 = fiatSepaPayItem.sort;
        }
        if ((i11 & 16) != 0) {
            str5 = fiatSepaPayItem.businessType;
        }
        if ((i11 & 32) != 0) {
            str6 = fiatSepaPayItem.processType;
        }
        String str7 = str5;
        String str8 = str6;
        return fiatSepaPayItem.copy(str, str2, str3, str4, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSort() {
        return this.sort;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBusinessType() {
        return this.businessType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getProcessType() {
        return this.processType;
    }

    @NotNull
    public final FiatSepaPayItem copy(@Nullable String title, @Nullable String value, @Nullable String desc, @Nullable String sort, @Nullable String businessType, @Nullable String processType) {
        return new FiatSepaPayItem(title, value, desc, sort, businessType, processType);
    }

    @Nullable
    public final String getBusinessType() {
        return this.businessType;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getProcessType() {
        return this.processType;
    }

    @Nullable
    public final String getSort() {
        return this.sort;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sort;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.businessType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.processType;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final boolean isDelCopySpace() {
        return Intrinsics.areEqual(this.processType, "1");
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "FiatSepaPayItem(title=" + this.title + ", value=" + this.value + ", desc=" + this.desc + ", sort=" + this.sort + ", businessType=" + this.businessType + ", processType=" + this.processType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.value);
        dest.writeString(this.desc);
        dest.writeString(this.sort);
        dest.writeString(this.businessType);
        dest.writeString(this.processType);
    }

    public FiatSepaPayItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.title = str;
        this.value = str2;
        this.desc = str3;
        this.sort = str4;
        this.businessType = str5;
        this.processType = str6;
    }
}
