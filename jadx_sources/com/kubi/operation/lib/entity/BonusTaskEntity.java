package com.kubi.operation.lib.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WelfareTaskInfoEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, m90084d2 = {"Lcom/kubi/operation/lib/entity/BonusTaskEntity;", "Landroid/os/Parcelable;", "title", "", "subtitle", "tips", "forwardUrl", "blockid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getTips", "getForwardUrl", "getBlockid", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BonusTaskEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BonusTaskEntity> CREATOR = new C19504a();

    @Nullable
    private final String blockid;

    @Nullable
    private final String forwardUrl;

    @Nullable
    private final String subtitle;

    @Nullable
    private final String tips;

    @Nullable
    private final String title;

    /* JADX INFO: renamed from: com.kubi.operation.lib.entity.BonusTaskEntity$a */
    /* JADX INFO: compiled from: WelfareTaskInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19504a implements Parcelable.Creator<BonusTaskEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BonusTaskEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BonusTaskEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BonusTaskEntity[] newArray(int i11) {
            return new BonusTaskEntity[i11];
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
        if (!(other instanceof BonusTaskEntity)) {
            return false;
        }
        BonusTaskEntity bonusTaskEntity = (BonusTaskEntity) other;
        return Intrinsics.areEqual(this.title, bonusTaskEntity.title) && Intrinsics.areEqual(this.subtitle, bonusTaskEntity.subtitle) && Intrinsics.areEqual(this.tips, bonusTaskEntity.tips) && Intrinsics.areEqual(this.forwardUrl, bonusTaskEntity.forwardUrl) && Intrinsics.areEqual(this.blockid, bonusTaskEntity.blockid);
    }

    public static /* synthetic */ BonusTaskEntity copy$default(BonusTaskEntity bonusTaskEntity, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bonusTaskEntity.title;
        }
        if ((i11 & 2) != 0) {
            str2 = bonusTaskEntity.subtitle;
        }
        if ((i11 & 4) != 0) {
            str3 = bonusTaskEntity.tips;
        }
        if ((i11 & 8) != 0) {
            str4 = bonusTaskEntity.forwardUrl;
        }
        if ((i11 & 16) != 0) {
            str5 = bonusTaskEntity.blockid;
        }
        String str6 = str5;
        String str7 = str3;
        return bonusTaskEntity.copy(str, str2, str7, str4, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getForwardUrl() {
        return this.forwardUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBlockid() {
        return this.blockid;
    }

    @NotNull
    public final BonusTaskEntity copy(@Nullable String title, @Nullable String subtitle, @Nullable String tips, @Nullable String forwardUrl, @Nullable String blockid) {
        return new BonusTaskEntity(title, subtitle, tips, forwardUrl, blockid);
    }

    @Nullable
    public final String getBlockid() {
        return this.blockid;
    }

    @Nullable
    public final String getForwardUrl() {
        return this.forwardUrl;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final String getTips() {
        return this.tips;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tips;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.forwardUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.blockid;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BonusTaskEntity(title=" + this.title + ", subtitle=" + this.subtitle + ", tips=" + this.tips + ", forwardUrl=" + this.forwardUrl + ", blockid=" + this.blockid + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.tips);
        dest.writeString(this.forwardUrl);
        dest.writeString(this.blockid);
    }

    public BonusTaskEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.title = str;
        this.subtitle = str2;
        this.tips = str3;
        this.forwardUrl = str4;
        this.blockid = str5;
    }
}
