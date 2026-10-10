package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FavSimpleParam.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u0005J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0005R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\f¨\u0006%"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/PinTopFavParam;", "Landroid/os/Parcelable;", "item", "", "type", "", "datasource", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getItem", "()Ljava/lang/String;", "setItem", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDatasource", "setDatasource", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/kubi/quotefacade/entity/PinTopFavParam;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PinTopFavParam implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PinTopFavParam> CREATOR = new C21904a();

    @Nullable
    private String datasource;

    @Nullable
    private String item;

    @Nullable
    private Integer type;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.PinTopFavParam$a */
    /* JADX INFO: compiled from: FavSimpleParam.kt */
    /* JADX INFO: loaded from: classes37.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21904a implements Parcelable.Creator<PinTopFavParam> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PinTopFavParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PinTopFavParam(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PinTopFavParam[] newArray(int i11) {
            return new PinTopFavParam[i11];
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
        if (!(other instanceof PinTopFavParam)) {
            return false;
        }
        PinTopFavParam pinTopFavParam = (PinTopFavParam) other;
        return Intrinsics.areEqual(this.item, pinTopFavParam.item) && Intrinsics.areEqual(this.type, pinTopFavParam.type) && Intrinsics.areEqual(this.datasource, pinTopFavParam.datasource);
    }

    public static /* synthetic */ PinTopFavParam copy$default(PinTopFavParam pinTopFavParam, String str, Integer num, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pinTopFavParam.item;
        }
        if ((i11 & 2) != 0) {
            num = pinTopFavParam.type;
        }
        if ((i11 & 4) != 0) {
            str2 = pinTopFavParam.datasource;
        }
        return pinTopFavParam.copy(str, num, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getItem() {
        return this.item;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDatasource() {
        return this.datasource;
    }

    @NotNull
    public final PinTopFavParam copy(@Nullable String item, @Nullable Integer type, @Nullable String datasource) {
        return new PinTopFavParam(item, type, datasource);
    }

    @Nullable
    public final String getDatasource() {
        return this.datasource;
    }

    @Nullable
    public final String getItem() {
        return this.item;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.item;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.type;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.datasource;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDatasource(@Nullable String str) {
        this.datasource = str;
    }

    public final void setItem(@Nullable String str) {
        this.item = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    @NotNull
    public String toString() {
        return "PinTopFavParam(item=" + this.item + ", type=" + this.type + ", datasource=" + this.datasource + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.item);
        Integer num = this.type;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.datasource);
    }

    public PinTopFavParam(@Nullable String str, @Nullable Integer num, @Nullable String str2) {
        this.item = str;
        this.type = num;
        this.datasource = str2;
    }
}
