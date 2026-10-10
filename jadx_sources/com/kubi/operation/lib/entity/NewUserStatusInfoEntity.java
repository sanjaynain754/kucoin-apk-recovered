package com.kubi.operation.lib.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NewUserStatusInfoEntity.kt */
/* JADX INFO: loaded from: classes32.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m90084d2 = {"Lcom/kubi/operation/lib/entity/NewUserStatusInfoEntity;", "Landroid/os/Parcelable;", "abTestResult", "", "newcomerCard", "Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;", "commonCardInfo", "Lcom/kubi/operation/lib/entity/CommonCardInfo;", "<init>", "(Ljava/lang/String;Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;Lcom/kubi/operation/lib/entity/CommonCardInfo;)V", "getAbTestResult", "()Ljava/lang/String;", "getNewcomerCard", "()Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;", "getCommonCardInfo", "()Lcom/kubi/operation/lib/entity/CommonCardInfo;", "hitABTest", "", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NewUserStatusInfoEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NewUserStatusInfoEntity> CREATOR = new C19508a();

    @Nullable
    private final String abTestResult;

    @Nullable
    private final CommonCardInfo commonCardInfo;

    @Nullable
    private final WelfareTaskInfoEntity newcomerCard;

    /* JADX INFO: renamed from: com.kubi.operation.lib.entity.NewUserStatusInfoEntity$a */
    /* JADX INFO: compiled from: NewUserStatusInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19508a implements Parcelable.Creator<NewUserStatusInfoEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NewUserStatusInfoEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NewUserStatusInfoEntity(parcel.readString(), parcel.readInt() == 0 ? null : WelfareTaskInfoEntity.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CommonCardInfo.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NewUserStatusInfoEntity[] newArray(int i11) {
            return new NewUserStatusInfoEntity[i11];
        }
    }

    public NewUserStatusInfoEntity(@Nullable String str, @Nullable WelfareTaskInfoEntity welfareTaskInfoEntity, @Nullable CommonCardInfo commonCardInfo) {
        this.abTestResult = str;
        this.newcomerCard = welfareTaskInfoEntity;
        this.commonCardInfo = commonCardInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewUserStatusInfoEntity)) {
            return false;
        }
        NewUserStatusInfoEntity newUserStatusInfoEntity = (NewUserStatusInfoEntity) other;
        return Intrinsics.areEqual(this.abTestResult, newUserStatusInfoEntity.abTestResult) && Intrinsics.areEqual(this.newcomerCard, newUserStatusInfoEntity.newcomerCard) && Intrinsics.areEqual(this.commonCardInfo, newUserStatusInfoEntity.commonCardInfo);
    }

    public static /* synthetic */ NewUserStatusInfoEntity copy$default(NewUserStatusInfoEntity newUserStatusInfoEntity, String str, WelfareTaskInfoEntity welfareTaskInfoEntity, CommonCardInfo commonCardInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = newUserStatusInfoEntity.abTestResult;
        }
        if ((i11 & 2) != 0) {
            welfareTaskInfoEntity = newUserStatusInfoEntity.newcomerCard;
        }
        if ((i11 & 4) != 0) {
            commonCardInfo = newUserStatusInfoEntity.commonCardInfo;
        }
        return newUserStatusInfoEntity.copy(str, welfareTaskInfoEntity, commonCardInfo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAbTestResult() {
        return this.abTestResult;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WelfareTaskInfoEntity getNewcomerCard() {
        return this.newcomerCard;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CommonCardInfo getCommonCardInfo() {
        return this.commonCardInfo;
    }

    @NotNull
    public final NewUserStatusInfoEntity copy(@Nullable String abTestResult, @Nullable WelfareTaskInfoEntity newcomerCard, @Nullable CommonCardInfo commonCardInfo) {
        return new NewUserStatusInfoEntity(abTestResult, newcomerCard, commonCardInfo);
    }

    @Nullable
    public final String getAbTestResult() {
        return this.abTestResult;
    }

    @Nullable
    public final CommonCardInfo getCommonCardInfo() {
        return this.commonCardInfo;
    }

    @Nullable
    public final WelfareTaskInfoEntity getNewcomerCard() {
        return this.newcomerCard;
    }

    public int hashCode() {
        String str = this.abTestResult;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        WelfareTaskInfoEntity welfareTaskInfoEntity = this.newcomerCard;
        int iHashCode2 = (iHashCode + (welfareTaskInfoEntity == null ? 0 : welfareTaskInfoEntity.hashCode())) * 31;
        CommonCardInfo commonCardInfo = this.commonCardInfo;
        return iHashCode2 + (commonCardInfo != null ? commonCardInfo.hashCode() : 0);
    }

    public final boolean hitABTest() {
        return Intrinsics.areEqual(this.abTestResult, "1");
    }

    @NotNull
    public String toString() {
        return "NewUserStatusInfoEntity(abTestResult=" + this.abTestResult + ", newcomerCard=" + this.newcomerCard + ", commonCardInfo=" + this.commonCardInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.abTestResult);
        WelfareTaskInfoEntity welfareTaskInfoEntity = this.newcomerCard;
        if (welfareTaskInfoEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            welfareTaskInfoEntity.writeToParcel(dest, flags);
        }
        CommonCardInfo commonCardInfo = this.commonCardInfo;
        if (commonCardInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonCardInfo.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ NewUserStatusInfoEntity(String str, WelfareTaskInfoEntity welfareTaskInfoEntity, CommonCardInfo commonCardInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, welfareTaskInfoEntity, (i11 & 4) != 0 ? null : commonCardInfo);
    }
}
