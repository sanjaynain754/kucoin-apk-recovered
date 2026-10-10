package com.kubi.home.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MoodInfoEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0011J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/home/entity/MoodInfoEntity;", "Landroid/os/Parcelable;", "raw", "Lcom/kubi/home/entity/RawEntity;", "moduleCode", "", "<init>", "(Lcom/kubi/home/entity/RawEntity;Ljava/lang/String;)V", "getRaw", "()Lcom/kubi/home/entity/RawEntity;", "getModuleCode", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "component1", "component2", "copy", "describeContents", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MoodInfoEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MoodInfoEntity> CREATOR = new C14552a();

    @Nullable
    private final String moduleCode;

    @Nullable
    private final RawEntity raw;

    /* JADX INFO: renamed from: com.kubi.home.entity.MoodInfoEntity$a */
    /* JADX INFO: compiled from: MoodInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14552a implements Parcelable.Creator<MoodInfoEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MoodInfoEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoodInfoEntity(parcel.readInt() == 0 ? null : RawEntity.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MoodInfoEntity[] newArray(int i11) {
            return new MoodInfoEntity[i11];
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
        if (!Intrinsics.areEqual(MoodInfoEntity.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.kubi.home.entity.MoodInfoEntity");
        MoodInfoEntity moodInfoEntity = (MoodInfoEntity) other;
        return Intrinsics.areEqual(this.raw, moodInfoEntity.raw) && Intrinsics.areEqual(this.moduleCode, moodInfoEntity.moduleCode);
    }

    public static /* synthetic */ MoodInfoEntity copy$default(MoodInfoEntity moodInfoEntity, RawEntity rawEntity, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            rawEntity = moodInfoEntity.raw;
        }
        if ((i11 & 2) != 0) {
            str = moodInfoEntity.moduleCode;
        }
        return moodInfoEntity.copy(rawEntity, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RawEntity getRaw() {
        return this.raw;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModuleCode() {
        return this.moduleCode;
    }

    @NotNull
    public final MoodInfoEntity copy(@Nullable RawEntity raw, @Nullable String moduleCode) {
        return new MoodInfoEntity(raw, moduleCode);
    }

    @Nullable
    public final String getModuleCode() {
        return this.moduleCode;
    }

    @Nullable
    public final RawEntity getRaw() {
        return this.raw;
    }

    public int hashCode() {
        RawEntity rawEntity = this.raw;
        int iHashCode = (rawEntity != null ? rawEntity.hashCode() : 0) * 31;
        String str = this.moduleCode;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MoodInfoEntity(raw=" + this.raw + ", moduleCode=" + this.moduleCode + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        RawEntity rawEntity = this.raw;
        if (rawEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rawEntity.writeToParcel(dest, flags);
        }
        dest.writeString(this.moduleCode);
    }

    public MoodInfoEntity(@Nullable RawEntity rawEntity, @Nullable String str) {
        this.raw = rawEntity;
        this.moduleCode = str;
    }
}
