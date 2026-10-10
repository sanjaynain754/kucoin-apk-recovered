package com.kubi.welfare.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WelfareEntity.kt */
/* JADX INFO: loaded from: classes58.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0003J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/welfare/api/entity/RemainAwardNumEntity;", "Landroid/os/Parcelable;", "encouragementCount", "", "invitationAwardCount", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getEncouragementCount", "()Ljava/lang/Integer;", "setEncouragementCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getInvitationAwardCount", "setInvitationAwardCount", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/kubi/welfare/api/entity/RemainAwardNumEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "WelfareApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RemainAwardNumEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RemainAwardNumEntity> CREATOR = new C27125a();

    @Nullable
    private Integer encouragementCount;

    @Nullable
    private Integer invitationAwardCount;

    /* JADX INFO: renamed from: com.kubi.welfare.api.entity.RemainAwardNumEntity$a */
    /* JADX INFO: compiled from: WelfareEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C27125a implements Parcelable.Creator<RemainAwardNumEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RemainAwardNumEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RemainAwardNumEntity(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RemainAwardNumEntity[] newArray(int i11) {
            return new RemainAwardNumEntity[i11];
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
        if (!(other instanceof RemainAwardNumEntity)) {
            return false;
        }
        RemainAwardNumEntity remainAwardNumEntity = (RemainAwardNumEntity) other;
        return Intrinsics.areEqual(this.encouragementCount, remainAwardNumEntity.encouragementCount) && Intrinsics.areEqual(this.invitationAwardCount, remainAwardNumEntity.invitationAwardCount);
    }

    public static /* synthetic */ RemainAwardNumEntity copy$default(RemainAwardNumEntity remainAwardNumEntity, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = remainAwardNumEntity.encouragementCount;
        }
        if ((i11 & 2) != 0) {
            num2 = remainAwardNumEntity.invitationAwardCount;
        }
        return remainAwardNumEntity.copy(num, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getEncouragementCount() {
        return this.encouragementCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getInvitationAwardCount() {
        return this.invitationAwardCount;
    }

    @NotNull
    public final RemainAwardNumEntity copy(@Nullable Integer encouragementCount, @Nullable Integer invitationAwardCount) {
        return new RemainAwardNumEntity(encouragementCount, invitationAwardCount);
    }

    @Nullable
    public final Integer getEncouragementCount() {
        return this.encouragementCount;
    }

    @Nullable
    public final Integer getInvitationAwardCount() {
        return this.invitationAwardCount;
    }

    public int hashCode() {
        Integer num = this.encouragementCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.invitationAwardCount;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setEncouragementCount(@Nullable Integer num) {
        this.encouragementCount = num;
    }

    public final void setInvitationAwardCount(@Nullable Integer num) {
        this.invitationAwardCount = num;
    }

    @NotNull
    public String toString() {
        return "RemainAwardNumEntity(encouragementCount=" + this.encouragementCount + ", invitationAwardCount=" + this.invitationAwardCount + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.encouragementCount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.invitationAwardCount;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
    }

    public RemainAwardNumEntity(@Nullable Integer num, @Nullable Integer num2) {
        this.encouragementCount = num;
        this.invitationAwardCount = num2;
    }
}
