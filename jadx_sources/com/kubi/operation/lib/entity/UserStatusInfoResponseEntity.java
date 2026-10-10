package com.kubi.operation.lib.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WelfareTaskInfoEntity.kt */
/* JADX INFO: loaded from: classes32.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u0005J\u0006\u0010\u0012\u001a\u00020\u0005J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, m90084d2 = {"Lcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;", "Landroid/os/Parcelable;", "welfareTaskInfo", "Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;", "abTestResult", "", "commonCardInfo", "Lcom/kubi/operation/lib/entity/CommonCardInfo;", "<init>", "(Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;Ljava/lang/Boolean;Lcom/kubi/operation/lib/entity/CommonCardInfo;)V", "getWelfareTaskInfo", "()Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;", "getAbTestResult", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCommonCardInfo", "()Lcom/kubi/operation/lib/entity/CommonCardInfo;", "useStepUI", "showCommonCard", "component1", "component2", "component3", "copy", "(Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;Ljava/lang/Boolean;Lcom/kubi/operation/lib/entity/CommonCardInfo;)Lcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UserStatusInfoResponseEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserStatusInfoResponseEntity> CREATOR = new C19512a();

    @Nullable
    private final Boolean abTestResult;

    @Nullable
    private final CommonCardInfo commonCardInfo;

    @Nullable
    private final WelfareTaskInfoEntity welfareTaskInfo;

    /* JADX INFO: renamed from: com.kubi.operation.lib.entity.UserStatusInfoResponseEntity$a */
    /* JADX INFO: compiled from: WelfareTaskInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19512a implements Parcelable.Creator<UserStatusInfoResponseEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UserStatusInfoResponseEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            WelfareTaskInfoEntity welfareTaskInfoEntityCreateFromParcel = parcel.readInt() == 0 ? null : WelfareTaskInfoEntity.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UserStatusInfoResponseEntity(welfareTaskInfoEntityCreateFromParcel, boolValueOf, parcel.readInt() != 0 ? CommonCardInfo.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UserStatusInfoResponseEntity[] newArray(int i11) {
            return new UserStatusInfoResponseEntity[i11];
        }
    }

    public UserStatusInfoResponseEntity(@Nullable WelfareTaskInfoEntity welfareTaskInfoEntity, @Nullable Boolean bool, @Nullable CommonCardInfo commonCardInfo) {
        this.welfareTaskInfo = welfareTaskInfoEntity;
        this.abTestResult = bool;
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
        if (!(other instanceof UserStatusInfoResponseEntity)) {
            return false;
        }
        UserStatusInfoResponseEntity userStatusInfoResponseEntity = (UserStatusInfoResponseEntity) other;
        return Intrinsics.areEqual(this.welfareTaskInfo, userStatusInfoResponseEntity.welfareTaskInfo) && Intrinsics.areEqual(this.abTestResult, userStatusInfoResponseEntity.abTestResult) && Intrinsics.areEqual(this.commonCardInfo, userStatusInfoResponseEntity.commonCardInfo);
    }

    public static /* synthetic */ UserStatusInfoResponseEntity copy$default(UserStatusInfoResponseEntity userStatusInfoResponseEntity, WelfareTaskInfoEntity welfareTaskInfoEntity, Boolean bool, CommonCardInfo commonCardInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            welfareTaskInfoEntity = userStatusInfoResponseEntity.welfareTaskInfo;
        }
        if ((i11 & 2) != 0) {
            bool = userStatusInfoResponseEntity.abTestResult;
        }
        if ((i11 & 4) != 0) {
            commonCardInfo = userStatusInfoResponseEntity.commonCardInfo;
        }
        return userStatusInfoResponseEntity.copy(welfareTaskInfoEntity, bool, commonCardInfo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WelfareTaskInfoEntity getWelfareTaskInfo() {
        return this.welfareTaskInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getAbTestResult() {
        return this.abTestResult;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CommonCardInfo getCommonCardInfo() {
        return this.commonCardInfo;
    }

    @NotNull
    public final UserStatusInfoResponseEntity copy(@Nullable WelfareTaskInfoEntity welfareTaskInfo, @Nullable Boolean abTestResult, @Nullable CommonCardInfo commonCardInfo) {
        return new UserStatusInfoResponseEntity(welfareTaskInfo, abTestResult, commonCardInfo);
    }

    @Nullable
    public final Boolean getAbTestResult() {
        return this.abTestResult;
    }

    @Nullable
    public final CommonCardInfo getCommonCardInfo() {
        return this.commonCardInfo;
    }

    @Nullable
    public final WelfareTaskInfoEntity getWelfareTaskInfo() {
        return this.welfareTaskInfo;
    }

    public int hashCode() {
        WelfareTaskInfoEntity welfareTaskInfoEntity = this.welfareTaskInfo;
        int iHashCode = (welfareTaskInfoEntity == null ? 0 : welfareTaskInfoEntity.hashCode()) * 31;
        Boolean bool = this.abTestResult;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        CommonCardInfo commonCardInfo = this.commonCardInfo;
        return iHashCode2 + (commonCardInfo != null ? commonCardInfo.hashCode() : 0);
    }

    public final boolean showCommonCard() {
        CommonCardInfo commonCardInfo = this.commonCardInfo;
        if (commonCardInfo == null) {
            return false;
        }
        String title = commonCardInfo.getTitle();
        if (title != null && title.length() != 0) {
            return true;
        }
        String subTitle = this.commonCardInfo.getSubTitle();
        return (subTitle == null || subTitle.length() == 0) ? false : true;
    }

    @NotNull
    public String toString() {
        return "UserStatusInfoResponseEntity(welfareTaskInfo=" + this.welfareTaskInfo + ", abTestResult=" + this.abTestResult + ", commonCardInfo=" + this.commonCardInfo + ')';
    }

    public final boolean useStepUI() {
        return Intrinsics.areEqual(this.abTestResult, Boolean.TRUE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        WelfareTaskInfoEntity welfareTaskInfoEntity = this.welfareTaskInfo;
        if (welfareTaskInfoEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            welfareTaskInfoEntity.writeToParcel(dest, flags);
        }
        Boolean bool = this.abTestResult;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        CommonCardInfo commonCardInfo = this.commonCardInfo;
        if (commonCardInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonCardInfo.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ UserStatusInfoResponseEntity(WelfareTaskInfoEntity welfareTaskInfoEntity, Boolean bool, CommonCardInfo commonCardInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(welfareTaskInfoEntity, (i11 & 2) != 0 ? Boolean.FALSE : bool, (i11 & 4) != 0 ? null : commonCardInfo);
    }
}
