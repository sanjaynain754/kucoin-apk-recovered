package com.kubi.tradebase.business.klineSettings;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KLineTimeEntity.kt */
/* JADX INFO: loaded from: classes48.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u0005J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\""}, m90084d2 = {"Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;", "Landroid/os/Parcelable;", "time", "", "tag", "", "isSelected", "", "<init>", "(Ljava/lang/String;IZ)V", "getTime", "()Ljava/lang/String;", "setTime", "(Ljava/lang/String;)V", "getTag", "()I", "()Z", "setSelected", "(Z)V", "equals", "other", "", "component1", "component2", "component3", "copy", "describeContents", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KLineTimeEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<KLineTimeEntity> CREATOR = new C25858a();
    private boolean isSelected;
    private final int tag;

    @NotNull
    private String time;

    /* JADX INFO: renamed from: com.kubi.tradebase.business.klineSettings.KLineTimeEntity$a */
    /* JADX INFO: compiled from: KLineTimeEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25858a implements Parcelable.Creator<KLineTimeEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KLineTimeEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KLineTimeEntity(parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KLineTimeEntity[] newArray(int i11) {
            return new KLineTimeEntity[i11];
        }
    }

    public KLineTimeEntity(@NotNull String time, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(time, "time");
        this.time = time;
        this.tag = i11;
        this.isSelected = z11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return other != null && Intrinsics.areEqual(KLineTimeEntity.class, other.getClass()) && this.tag == ((KLineTimeEntity) other).tag;
    }

    public static /* synthetic */ KLineTimeEntity copy$default(KLineTimeEntity kLineTimeEntity, String str, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = kLineTimeEntity.time;
        }
        if ((i12 & 2) != 0) {
            i11 = kLineTimeEntity.tag;
        }
        if ((i12 & 4) != 0) {
            z11 = kLineTimeEntity.isSelected;
        }
        return kLineTimeEntity.copy(str, i11, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public final KLineTimeEntity copy(@NotNull String time, int tag, boolean isSelected) {
        Intrinsics.checkNotNullParameter(time, "time");
        return new KLineTimeEntity(time, tag, isSelected);
    }

    public final int getTag() {
        return this.tag;
    }

    @NotNull
    public final String getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((this.time.hashCode() * 31) + Integer.hashCode(this.tag)) * 31) + Boolean.hashCode(this.isSelected);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z11) {
        this.isSelected = z11;
    }

    public final void setTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.time = str;
    }

    @NotNull
    public String toString() {
        return "KLineTimeEntity(time=" + this.time + ", tag=" + this.tag + ", isSelected=" + this.isSelected + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.time);
        dest.writeInt(this.tag);
        dest.writeInt(this.isSelected ? 1 : 0);
    }

    public /* synthetic */ KLineTimeEntity(String str, int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, (i12 & 4) != 0 ? false : z11);
    }
}
