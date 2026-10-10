package com.kubi.operation.lib.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LearnVideoEntity.kt */
/* JADX INFO: loaded from: classes32.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/operation/lib/entity/LearnVideoEntity;", "Landroid/os/Parcelable;", "title", "", "imgUrl", "materialUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getImgUrl", "getMaterialUrl", "isUsefulData", "", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LearnVideoEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LearnVideoEntity> CREATOR = new C19507a();

    @Nullable
    private final String imgUrl;

    @Nullable
    private final String materialUrl;

    @Nullable
    private final String title;

    /* JADX INFO: renamed from: com.kubi.operation.lib.entity.LearnVideoEntity$a */
    /* JADX INFO: compiled from: LearnVideoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19507a implements Parcelable.Creator<LearnVideoEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LearnVideoEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LearnVideoEntity(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LearnVideoEntity[] newArray(int i11) {
            return new LearnVideoEntity[i11];
        }
    }

    public LearnVideoEntity() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LearnVideoEntity)) {
            return false;
        }
        LearnVideoEntity learnVideoEntity = (LearnVideoEntity) other;
        return Intrinsics.areEqual(this.title, learnVideoEntity.title) && Intrinsics.areEqual(this.imgUrl, learnVideoEntity.imgUrl) && Intrinsics.areEqual(this.materialUrl, learnVideoEntity.materialUrl);
    }

    public LearnVideoEntity(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.title = str;
        this.imgUrl = str2;
        this.materialUrl = str3;
    }

    public static /* synthetic */ LearnVideoEntity copy$default(LearnVideoEntity learnVideoEntity, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = learnVideoEntity.title;
        }
        if ((i11 & 2) != 0) {
            str2 = learnVideoEntity.imgUrl;
        }
        if ((i11 & 4) != 0) {
            str3 = learnVideoEntity.materialUrl;
        }
        return learnVideoEntity.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMaterialUrl() {
        return this.materialUrl;
    }

    @NotNull
    public final LearnVideoEntity copy(@Nullable String title, @Nullable String imgUrl, @Nullable String materialUrl) {
        return new LearnVideoEntity(title, imgUrl, materialUrl);
    }

    @Nullable
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @Nullable
    public final String getMaterialUrl() {
        return this.materialUrl;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imgUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.materialUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isUsefulData() {
        String str = this.title;
        if (str == null) {
            str = "";
        }
        if (str.length() <= 0) {
            return false;
        }
        String str2 = this.materialUrl;
        return (str2 != null ? str2 : "").length() > 0;
    }

    @NotNull
    public String toString() {
        return "LearnVideoEntity(title=" + this.title + ", imgUrl=" + this.imgUrl + ", materialUrl=" + this.materialUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.imgUrl);
        dest.writeString(this.materialUrl);
    }

    public /* synthetic */ LearnVideoEntity(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
