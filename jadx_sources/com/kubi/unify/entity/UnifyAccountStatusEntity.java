package com.kubi.unify.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.kubi.unify.api.entity.UnifyAccountType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifyEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0002\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\nR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\n¨\u0006\""}, m90084d2 = {"Lcom/kubi/unify/entity/UnifyAccountStatusEntity;", "Landroid/os/Parcelable;", "isAnswered", "", "accountType", "", "hasOpened", "isHitGray", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAccountType", "()Ljava/lang/String;", "getHasOpened", "isUnifyAccount", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/unify/entity/UnifyAccountStatusEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyAccountStatusEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UnifyAccountStatusEntity> CREATOR = new C26516a();

    @SerializedName("accountType")
    @Nullable
    private final String accountType;

    @SerializedName("hasOpened")
    @Nullable
    private final Boolean hasOpened;

    @SerializedName("isAnswered")
    @Nullable
    private final Boolean isAnswered;

    @SerializedName("isHitGray")
    @Nullable
    private final Boolean isHitGray;

    /* JADX INFO: renamed from: com.kubi.unify.entity.UnifyAccountStatusEntity$a */
    /* JADX INFO: compiled from: UnifyEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26516a implements Parcelable.Creator<UnifyAccountStatusEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UnifyAccountStatusEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean boolValueOf3 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UnifyAccountStatusEntity(boolValueOf, string, boolValueOf2, boolValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UnifyAccountStatusEntity[] newArray(int i11) {
            return new UnifyAccountStatusEntity[i11];
        }
    }

    public UnifyAccountStatusEntity() {
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
        if (!(other instanceof UnifyAccountStatusEntity)) {
            return false;
        }
        UnifyAccountStatusEntity unifyAccountStatusEntity = (UnifyAccountStatusEntity) other;
        return Intrinsics.areEqual(this.isAnswered, unifyAccountStatusEntity.isAnswered) && Intrinsics.areEqual(this.accountType, unifyAccountStatusEntity.accountType) && Intrinsics.areEqual(this.hasOpened, unifyAccountStatusEntity.hasOpened) && Intrinsics.areEqual(this.isHitGray, unifyAccountStatusEntity.isHitGray);
    }

    public UnifyAccountStatusEntity(@Nullable Boolean bool, @Nullable String str, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        this.isAnswered = bool;
        this.accountType = str;
        this.hasOpened = bool2;
        this.isHitGray = bool3;
    }

    public static /* synthetic */ UnifyAccountStatusEntity copy$default(UnifyAccountStatusEntity unifyAccountStatusEntity, Boolean bool, String str, Boolean bool2, Boolean bool3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = unifyAccountStatusEntity.isAnswered;
        }
        if ((i11 & 2) != 0) {
            str = unifyAccountStatusEntity.accountType;
        }
        if ((i11 & 4) != 0) {
            bool2 = unifyAccountStatusEntity.hasOpened;
        }
        if ((i11 & 8) != 0) {
            bool3 = unifyAccountStatusEntity.isHitGray;
        }
        return unifyAccountStatusEntity.copy(bool, str, bool2, bool3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsAnswered() {
        return this.isAnswered;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getHasOpened() {
        return this.hasOpened;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsHitGray() {
        return this.isHitGray;
    }

    @NotNull
    public final UnifyAccountStatusEntity copy(@Nullable Boolean isAnswered, @Nullable String accountType, @Nullable Boolean hasOpened, @Nullable Boolean isHitGray) {
        return new UnifyAccountStatusEntity(isAnswered, accountType, hasOpened, isHitGray);
    }

    @Nullable
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final Boolean getHasOpened() {
        return this.hasOpened;
    }

    public int hashCode() {
        Boolean bool = this.isAnswered;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.accountType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.hasOpened;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isHitGray;
        return iHashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @Nullable
    public final Boolean isAnswered() {
        return this.isAnswered;
    }

    @Nullable
    public final Boolean isHitGray() {
        return this.isHitGray;
    }

    public final boolean isUnifyAccount() {
        return Intrinsics.areEqual(this.accountType, UnifyAccountType.UNIFIED.getValue());
    }

    @NotNull
    public String toString() {
        return "UnifyAccountStatusEntity(isAnswered=" + this.isAnswered + ", accountType=" + this.accountType + ", hasOpened=" + this.hasOpened + ", isHitGray=" + this.isHitGray + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.isAnswered;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.accountType);
        Boolean bool2 = this.hasOpened;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isHitGray;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ UnifyAccountStatusEntity(Boolean bool, String str, Boolean bool2, Boolean bool3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Boolean.FALSE : bool, (i11 & 2) != 0 ? UnifyAccountType.CLASSIC.getValue() : str, (i11 & 4) != 0 ? Boolean.FALSE : bool2, (i11 & 8) != 0 ? Boolean.FALSE : bool3);
    }
}
