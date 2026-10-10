package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FavSimpleParam.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J6\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u0006J\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020\u0004HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0006R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006)"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/UpdateFavParam;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.ITEMS, "", "", "type", "", "kcNewMarketHoldingV3", "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getKcNewMarketHoldingV3", "()Ljava/lang/Boolean;", "setKcNewMarketHoldingV3", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/kubi/quotefacade/entity/UpdateFavParam;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UpdateFavParam implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UpdateFavParam> CREATOR = new C21915a();

    @NotNull
    private List<String> items;

    @Nullable
    private Boolean kcNewMarketHoldingV3;

    @Nullable
    private Integer type;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.UpdateFavParam$a */
    /* JADX INFO: compiled from: FavSimpleParam.kt */
    /* JADX INFO: loaded from: classes37.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21915a implements Parcelable.Creator<UpdateFavParam> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UpdateFavParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UpdateFavParam(arrayListCreateStringArrayList, numValueOf, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UpdateFavParam[] newArray(int i11) {
            return new UpdateFavParam[i11];
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
        if (!(other instanceof UpdateFavParam)) {
            return false;
        }
        UpdateFavParam updateFavParam = (UpdateFavParam) other;
        return Intrinsics.areEqual(this.items, updateFavParam.items) && Intrinsics.areEqual(this.type, updateFavParam.type) && Intrinsics.areEqual(this.kcNewMarketHoldingV3, updateFavParam.kcNewMarketHoldingV3);
    }

    public UpdateFavParam(@NotNull List<String> items, @Nullable Integer num, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.type = num;
        this.kcNewMarketHoldingV3 = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateFavParam copy$default(UpdateFavParam updateFavParam, List list, Integer num, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = updateFavParam.items;
        }
        if ((i11 & 2) != 0) {
            num = updateFavParam.type;
        }
        if ((i11 & 4) != 0) {
            bool = updateFavParam.kcNewMarketHoldingV3;
        }
        return updateFavParam.copy(list, num, bool);
    }

    @NotNull
    public final List<String> component1() {
        return this.items;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getKcNewMarketHoldingV3() {
        return this.kcNewMarketHoldingV3;
    }

    @NotNull
    public final UpdateFavParam copy(@NotNull List<String> items, @Nullable Integer type, @Nullable Boolean kcNewMarketHoldingV3) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new UpdateFavParam(items, type, kcNewMarketHoldingV3);
    }

    @NotNull
    public final List<String> getItems() {
        return this.items;
    }

    @Nullable
    public final Boolean getKcNewMarketHoldingV3() {
        return this.kcNewMarketHoldingV3;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        Integer num = this.type;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.kcNewMarketHoldingV3;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setItems(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.items = list;
    }

    public final void setKcNewMarketHoldingV3(@Nullable Boolean bool) {
        this.kcNewMarketHoldingV3 = bool;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    @NotNull
    public String toString() {
        return "UpdateFavParam(items=" + this.items + ", type=" + this.type + ", kcNewMarketHoldingV3=" + this.kcNewMarketHoldingV3 + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.items);
        Integer num = this.type;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Boolean bool = this.kcNewMarketHoldingV3;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }
}
