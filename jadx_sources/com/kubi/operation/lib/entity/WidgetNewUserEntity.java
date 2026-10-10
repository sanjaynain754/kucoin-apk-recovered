package com.kubi.operation.lib.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WidgetNewUserEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u0005J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006 "}, m90084d2 = {"Lcom/kubi/operation/lib/entity/WidgetNewUserEntity;", "Landroid/os/Parcelable;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;", "dayVideoUrl", "", "darkVideoUrl", "<init>", "(Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;Ljava/lang/String;Ljava/lang/String;)V", "getEntity", "()Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;", "getDayVideoUrl", "()Ljava/lang/String;", "getDarkVideoUrl", "getVideoUrl", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WidgetNewUserEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WidgetNewUserEntity> CREATOR = new C19514a();

    @Nullable
    private final String darkVideoUrl;

    @Nullable
    private final String dayVideoUrl;

    @Nullable
    private final WelfareTaskInfoEntity entity;

    /* JADX INFO: renamed from: com.kubi.operation.lib.entity.WidgetNewUserEntity$a */
    /* JADX INFO: compiled from: WidgetNewUserEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19514a implements Parcelable.Creator<WidgetNewUserEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WidgetNewUserEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WidgetNewUserEntity(parcel.readInt() == 0 ? null : WelfareTaskInfoEntity.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WidgetNewUserEntity[] newArray(int i11) {
            return new WidgetNewUserEntity[i11];
        }
    }

    public WidgetNewUserEntity() {
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
        if (!(other instanceof WidgetNewUserEntity)) {
            return false;
        }
        WidgetNewUserEntity widgetNewUserEntity = (WidgetNewUserEntity) other;
        return Intrinsics.areEqual(this.entity, widgetNewUserEntity.entity) && Intrinsics.areEqual(this.dayVideoUrl, widgetNewUserEntity.dayVideoUrl) && Intrinsics.areEqual(this.darkVideoUrl, widgetNewUserEntity.darkVideoUrl);
    }

    public WidgetNewUserEntity(@Nullable WelfareTaskInfoEntity welfareTaskInfoEntity, @Nullable String str, @Nullable String str2) {
        this.entity = welfareTaskInfoEntity;
        this.dayVideoUrl = str;
        this.darkVideoUrl = str2;
    }

    public static /* synthetic */ WidgetNewUserEntity copy$default(WidgetNewUserEntity widgetNewUserEntity, WelfareTaskInfoEntity welfareTaskInfoEntity, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            welfareTaskInfoEntity = widgetNewUserEntity.entity;
        }
        if ((i11 & 2) != 0) {
            str = widgetNewUserEntity.dayVideoUrl;
        }
        if ((i11 & 4) != 0) {
            str2 = widgetNewUserEntity.darkVideoUrl;
        }
        return widgetNewUserEntity.copy(welfareTaskInfoEntity, str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WelfareTaskInfoEntity getEntity() {
        return this.entity;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDayVideoUrl() {
        return this.dayVideoUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDarkVideoUrl() {
        return this.darkVideoUrl;
    }

    @NotNull
    public final WidgetNewUserEntity copy(@Nullable WelfareTaskInfoEntity entity, @Nullable String dayVideoUrl, @Nullable String darkVideoUrl) {
        return new WidgetNewUserEntity(entity, dayVideoUrl, darkVideoUrl);
    }

    @Nullable
    public final String getDarkVideoUrl() {
        return this.darkVideoUrl;
    }

    @Nullable
    public final String getDayVideoUrl() {
        return this.dayVideoUrl;
    }

    @Nullable
    public final WelfareTaskInfoEntity getEntity() {
        return this.entity;
    }

    @NotNull
    public final String getVideoUrl() {
        return C27041f.m66668h(DayNightThemeManager.f28592a.m33187l() ? this.dayVideoUrl : this.darkVideoUrl);
    }

    public int hashCode() {
        WelfareTaskInfoEntity welfareTaskInfoEntity = this.entity;
        int iHashCode = (welfareTaskInfoEntity == null ? 0 : welfareTaskInfoEntity.hashCode()) * 31;
        String str = this.dayVideoUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.darkVideoUrl;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WidgetNewUserEntity(entity=" + this.entity + ", dayVideoUrl=" + this.dayVideoUrl + ", darkVideoUrl=" + this.darkVideoUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        WelfareTaskInfoEntity welfareTaskInfoEntity = this.entity;
        if (welfareTaskInfoEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            welfareTaskInfoEntity.writeToParcel(dest, flags);
        }
        dest.writeString(this.dayVideoUrl);
        dest.writeString(this.darkVideoUrl);
    }

    public /* synthetic */ WidgetNewUserEntity(WelfareTaskInfoEntity welfareTaskInfoEntity, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : welfareTaskInfoEntity, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2);
    }
}
