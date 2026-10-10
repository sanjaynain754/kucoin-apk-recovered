package com.kubi.home.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HomeAppGuideEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0003J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m90084d2 = {"Lcom/kubi/home/entity/HomeAppGuideEntity;", "Landroid/os/Parcelable;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "", "jumpUrl", "", "popUp", "Lcom/kubi/home/entity/AppGuidePopUpEntity;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/kubi/home/entity/AppGuidePopUpEntity;)V", "getAction", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getJumpUrl", "()Ljava/lang/String;", "getPopUp", "()Lcom/kubi/home/entity/AppGuidePopUpEntity;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/kubi/home/entity/AppGuidePopUpEntity;)Lcom/kubi/home/entity/HomeAppGuideEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class HomeAppGuideEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HomeAppGuideEntity> CREATOR = new C14551a();

    @Nullable
    private final Integer action;

    @Nullable
    private final String jumpUrl;

    @Nullable
    private final AppGuidePopUpEntity popUp;

    /* JADX INFO: renamed from: com.kubi.home.entity.HomeAppGuideEntity$a */
    /* JADX INFO: compiled from: HomeAppGuideEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14551a implements Parcelable.Creator<HomeAppGuideEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HomeAppGuideEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HomeAppGuideEntity(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? AppGuidePopUpEntity.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HomeAppGuideEntity[] newArray(int i11) {
            return new HomeAppGuideEntity[i11];
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
        if (!(other instanceof HomeAppGuideEntity)) {
            return false;
        }
        HomeAppGuideEntity homeAppGuideEntity = (HomeAppGuideEntity) other;
        return Intrinsics.areEqual(this.action, homeAppGuideEntity.action) && Intrinsics.areEqual(this.jumpUrl, homeAppGuideEntity.jumpUrl) && Intrinsics.areEqual(this.popUp, homeAppGuideEntity.popUp);
    }

    public static /* synthetic */ HomeAppGuideEntity copy$default(HomeAppGuideEntity homeAppGuideEntity, Integer num, String str, AppGuidePopUpEntity appGuidePopUpEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = homeAppGuideEntity.action;
        }
        if ((i11 & 2) != 0) {
            str = homeAppGuideEntity.jumpUrl;
        }
        if ((i11 & 4) != 0) {
            appGuidePopUpEntity = homeAppGuideEntity.popUp;
        }
        return homeAppGuideEntity.copy(num, str, appGuidePopUpEntity);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getAction() {
        return this.action;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AppGuidePopUpEntity getPopUp() {
        return this.popUp;
    }

    @NotNull
    public final HomeAppGuideEntity copy(@Nullable Integer action, @Nullable String jumpUrl, @Nullable AppGuidePopUpEntity popUp) {
        return new HomeAppGuideEntity(action, jumpUrl, popUp);
    }

    @Nullable
    public final Integer getAction() {
        return this.action;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final AppGuidePopUpEntity getPopUp() {
        return this.popUp;
    }

    public int hashCode() {
        Integer num = this.action;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.jumpUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AppGuidePopUpEntity appGuidePopUpEntity = this.popUp;
        return iHashCode2 + (appGuidePopUpEntity != null ? appGuidePopUpEntity.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HomeAppGuideEntity(action=" + this.action + ", jumpUrl=" + this.jumpUrl + ", popUp=" + this.popUp + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.action;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.jumpUrl);
        AppGuidePopUpEntity appGuidePopUpEntity = this.popUp;
        if (appGuidePopUpEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            appGuidePopUpEntity.writeToParcel(dest, flags);
        }
    }

    public HomeAppGuideEntity(@Nullable Integer num, @Nullable String str, @Nullable AppGuidePopUpEntity appGuidePopUpEntity) {
        this.action = num;
        this.jumpUrl = str;
        this.popUp = appGuidePopUpEntity;
    }
}
