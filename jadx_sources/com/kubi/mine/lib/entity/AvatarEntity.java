package com.kubi.mine.lib.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UserEntity.kt */
/* JADX INFO: loaded from: classes29.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\""}, m90084d2 = {"Lcom/kubi/mine/lib/entity/AvatarEntity;", "Landroid/os/Parcelable;", "isChecked", "", "code", "", "imgUrl", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "()Z", "setChecked", "(Z)V", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "getImgUrl", "setImgUrl", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AvatarEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AvatarEntity> CREATOR = new C18930a();

    @Nullable
    private String code;

    @Nullable
    private String imgUrl;
    private boolean isChecked;

    /* JADX INFO: renamed from: com.kubi.mine.lib.entity.AvatarEntity$a */
    /* JADX INFO: compiled from: UserEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18930a implements Parcelable.Creator<AvatarEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AvatarEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AvatarEntity(parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AvatarEntity[] newArray(int i11) {
            return new AvatarEntity[i11];
        }
    }

    public AvatarEntity() {
        this(false, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvatarEntity)) {
            return false;
        }
        AvatarEntity avatarEntity = (AvatarEntity) other;
        return this.isChecked == avatarEntity.isChecked && Intrinsics.areEqual(this.code, avatarEntity.code) && Intrinsics.areEqual(this.imgUrl, avatarEntity.imgUrl);
    }

    public AvatarEntity(boolean z11, @Nullable String str, @Nullable String str2) {
        this.isChecked = z11;
        this.code = str;
        this.imgUrl = str2;
    }

    public static /* synthetic */ AvatarEntity copy$default(AvatarEntity avatarEntity, boolean z11, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = avatarEntity.isChecked;
        }
        if ((i11 & 2) != 0) {
            str = avatarEntity.code;
        }
        if ((i11 & 4) != 0) {
            str2 = avatarEntity.imgUrl;
        }
        return avatarEntity.copy(z11, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @NotNull
    public final AvatarEntity copy(boolean isChecked, @Nullable String code, @Nullable String imgUrl) {
        return new AvatarEntity(isChecked, code, imgUrl);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getImgUrl() {
        return this.imgUrl;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isChecked) * 31;
        String str = this.code;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imgUrl;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final void setChecked(boolean z11) {
        this.isChecked = z11;
    }

    public final void setCode(@Nullable String str) {
        this.code = str;
    }

    public final void setImgUrl(@Nullable String str) {
        this.imgUrl = str;
    }

    @NotNull
    public String toString() {
        return "AvatarEntity(isChecked=" + this.isChecked + ", code=" + this.code + ", imgUrl=" + this.imgUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.isChecked ? 1 : 0);
        dest.writeString(this.code);
        dest.writeString(this.imgUrl);
    }

    public /* synthetic */ AvatarEntity(boolean z11, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2);
    }
}
