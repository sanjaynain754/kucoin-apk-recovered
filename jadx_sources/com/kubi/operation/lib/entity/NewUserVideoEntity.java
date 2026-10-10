package com.kubi.operation.lib.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NewUserVideoEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006%"}, m90084d2 = {"Lcom/kubi/operation/lib/entity/NewUserVideoEntity;", "Landroid/os/Parcelable;", "dayVideoUrl", "", "darkVideoUrl", "dayFilePath", "darkFilePath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDayVideoUrl", "()Ljava/lang/String;", "setDayVideoUrl", "(Ljava/lang/String;)V", "getDarkVideoUrl", "setDarkVideoUrl", "getDayFilePath", "setDayFilePath", "getDarkFilePath", "setDarkFilePath", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NewUserVideoEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NewUserVideoEntity> CREATOR = new C19509a();

    @Nullable
    private String darkFilePath;

    @Nullable
    private String darkVideoUrl;

    @Nullable
    private String dayFilePath;

    @Nullable
    private String dayVideoUrl;

    /* JADX INFO: renamed from: com.kubi.operation.lib.entity.NewUserVideoEntity$a */
    /* JADX INFO: compiled from: NewUserVideoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19509a implements Parcelable.Creator<NewUserVideoEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NewUserVideoEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NewUserVideoEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NewUserVideoEntity[] newArray(int i11) {
            return new NewUserVideoEntity[i11];
        }
    }

    public NewUserVideoEntity() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewUserVideoEntity)) {
            return false;
        }
        NewUserVideoEntity newUserVideoEntity = (NewUserVideoEntity) other;
        return Intrinsics.areEqual(this.dayVideoUrl, newUserVideoEntity.dayVideoUrl) && Intrinsics.areEqual(this.darkVideoUrl, newUserVideoEntity.darkVideoUrl) && Intrinsics.areEqual(this.dayFilePath, newUserVideoEntity.dayFilePath) && Intrinsics.areEqual(this.darkFilePath, newUserVideoEntity.darkFilePath);
    }

    public NewUserVideoEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.dayVideoUrl = str;
        this.darkVideoUrl = str2;
        this.dayFilePath = str3;
        this.darkFilePath = str4;
    }

    public static /* synthetic */ NewUserVideoEntity copy$default(NewUserVideoEntity newUserVideoEntity, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = newUserVideoEntity.dayVideoUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = newUserVideoEntity.darkVideoUrl;
        }
        if ((i11 & 4) != 0) {
            str3 = newUserVideoEntity.dayFilePath;
        }
        if ((i11 & 8) != 0) {
            str4 = newUserVideoEntity.darkFilePath;
        }
        return newUserVideoEntity.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDayVideoUrl() {
        return this.dayVideoUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDarkVideoUrl() {
        return this.darkVideoUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDayFilePath() {
        return this.dayFilePath;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDarkFilePath() {
        return this.darkFilePath;
    }

    @NotNull
    public final NewUserVideoEntity copy(@Nullable String dayVideoUrl, @Nullable String darkVideoUrl, @Nullable String dayFilePath, @Nullable String darkFilePath) {
        return new NewUserVideoEntity(dayVideoUrl, darkVideoUrl, dayFilePath, darkFilePath);
    }

    @Nullable
    public final String getDarkFilePath() {
        return this.darkFilePath;
    }

    @Nullable
    public final String getDarkVideoUrl() {
        return this.darkVideoUrl;
    }

    @Nullable
    public final String getDayFilePath() {
        return this.dayFilePath;
    }

    @Nullable
    public final String getDayVideoUrl() {
        return this.dayVideoUrl;
    }

    public int hashCode() {
        String str = this.dayVideoUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.darkVideoUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dayFilePath;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.darkFilePath;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setDarkFilePath(@Nullable String str) {
        this.darkFilePath = str;
    }

    public final void setDarkVideoUrl(@Nullable String str) {
        this.darkVideoUrl = str;
    }

    public final void setDayFilePath(@Nullable String str) {
        this.dayFilePath = str;
    }

    public final void setDayVideoUrl(@Nullable String str) {
        this.dayVideoUrl = str;
    }

    @NotNull
    public String toString() {
        return "NewUserVideoEntity(dayVideoUrl=" + this.dayVideoUrl + ", darkVideoUrl=" + this.darkVideoUrl + ", dayFilePath=" + this.dayFilePath + ", darkFilePath=" + this.darkFilePath + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.dayVideoUrl);
        dest.writeString(this.darkVideoUrl);
        dest.writeString(this.dayFilePath);
        dest.writeString(this.darkFilePath);
    }

    public /* synthetic */ NewUserVideoEntity(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
    }
}
