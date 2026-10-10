package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cn.jiguang.privates.common.constants.JCommonConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChainFilterData.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006%"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;", "Landroid/os/Parcelable;", "filterBy", "", "gte", JCommonConstants.Network.RADIO_4G, "eq", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFilterBy", "()Ljava/lang/String;", "setFilterBy", "(Ljava/lang/String;)V", "getGte", "setGte", "getLte", "setLte", "getEq", "setEq", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AlphaListBodyEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AlphaListBodyEntity> CREATOR = new C21865a();

    @Nullable
    private String eq;

    @Nullable
    private String filterBy;

    @Nullable
    private String gte;

    @Nullable
    private String lte;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.AlphaListBodyEntity$a */
    /* JADX INFO: compiled from: ChainFilterData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21865a implements Parcelable.Creator<AlphaListBodyEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AlphaListBodyEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AlphaListBodyEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AlphaListBodyEntity[] newArray(int i11) {
            return new AlphaListBodyEntity[i11];
        }
    }

    public AlphaListBodyEntity() {
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
        if (!(other instanceof AlphaListBodyEntity)) {
            return false;
        }
        AlphaListBodyEntity alphaListBodyEntity = (AlphaListBodyEntity) other;
        return Intrinsics.areEqual(this.filterBy, alphaListBodyEntity.filterBy) && Intrinsics.areEqual(this.gte, alphaListBodyEntity.gte) && Intrinsics.areEqual(this.lte, alphaListBodyEntity.lte) && Intrinsics.areEqual(this.eq, alphaListBodyEntity.eq);
    }

    public AlphaListBodyEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.filterBy = str;
        this.gte = str2;
        this.lte = str3;
        this.eq = str4;
    }

    public static /* synthetic */ AlphaListBodyEntity copy$default(AlphaListBodyEntity alphaListBodyEntity, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = alphaListBodyEntity.filterBy;
        }
        if ((i11 & 2) != 0) {
            str2 = alphaListBodyEntity.gte;
        }
        if ((i11 & 4) != 0) {
            str3 = alphaListBodyEntity.lte;
        }
        if ((i11 & 8) != 0) {
            str4 = alphaListBodyEntity.eq;
        }
        return alphaListBodyEntity.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFilterBy() {
        return this.filterBy;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGte() {
        return this.gte;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLte() {
        return this.lte;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEq() {
        return this.eq;
    }

    @NotNull
    public final AlphaListBodyEntity copy(@Nullable String filterBy, @Nullable String gte, @Nullable String lte, @Nullable String eq2) {
        return new AlphaListBodyEntity(filterBy, gte, lte, eq2);
    }

    @Nullable
    public final String getEq() {
        return this.eq;
    }

    @Nullable
    public final String getFilterBy() {
        return this.filterBy;
    }

    @Nullable
    public final String getGte() {
        return this.gte;
    }

    @Nullable
    public final String getLte() {
        return this.lte;
    }

    public int hashCode() {
        String str = this.filterBy;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.gte;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lte;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.eq;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setEq(@Nullable String str) {
        this.eq = str;
    }

    public final void setFilterBy(@Nullable String str) {
        this.filterBy = str;
    }

    public final void setGte(@Nullable String str) {
        this.gte = str;
    }

    public final void setLte(@Nullable String str) {
        this.lte = str;
    }

    @NotNull
    public String toString() {
        return "AlphaListBodyEntity(filterBy=" + this.filterBy + ", gte=" + this.gte + ", lte=" + this.lte + ", eq=" + this.eq + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.filterBy);
        dest.writeString(this.gte);
        dest.writeString(this.lte);
        dest.writeString(this.eq);
    }

    public /* synthetic */ AlphaListBodyEntity(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
    }
}
