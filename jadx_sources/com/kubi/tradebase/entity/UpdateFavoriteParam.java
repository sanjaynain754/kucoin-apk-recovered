package com.kubi.tradebase.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FavoriteSortChildEntity.kt */
/* JADX INFO: loaded from: classes48.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ*\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0006J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\""}, m90084d2 = {"Lcom/kubi/tradebase/entity/UpdateFavoriteParam;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.ITEMS, "", "", "type", "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lcom/kubi/tradebase/entity/UpdateFavoriteParam;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UpdateFavoriteParam implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UpdateFavoriteParam> CREATOR = new C25889a();

    @NotNull
    private List<String> items;

    @Nullable
    private Integer type;

    /* JADX INFO: renamed from: com.kubi.tradebase.entity.UpdateFavoriteParam$a */
    /* JADX INFO: compiled from: FavoriteSortChildEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25889a implements Parcelable.Creator<UpdateFavoriteParam> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UpdateFavoriteParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UpdateFavoriteParam(parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UpdateFavoriteParam[] newArray(int i11) {
            return new UpdateFavoriteParam[i11];
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
        if (!(other instanceof UpdateFavoriteParam)) {
            return false;
        }
        UpdateFavoriteParam updateFavoriteParam = (UpdateFavoriteParam) other;
        return Intrinsics.areEqual(this.items, updateFavoriteParam.items) && Intrinsics.areEqual(this.type, updateFavoriteParam.type);
    }

    public UpdateFavoriteParam(@NotNull List<String> items, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.type = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateFavoriteParam copy$default(UpdateFavoriteParam updateFavoriteParam, List list, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = updateFavoriteParam.items;
        }
        if ((i11 & 2) != 0) {
            num = updateFavoriteParam.type;
        }
        return updateFavoriteParam.copy(list, num);
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

    @NotNull
    public final UpdateFavoriteParam copy(@NotNull List<String> items, @Nullable Integer type) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new UpdateFavoriteParam(items, type);
    }

    @NotNull
    public final List<String> getItems() {
        return this.items;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        Integer num = this.type;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final void setItems(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.items = list;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    @NotNull
    public String toString() {
        return "UpdateFavoriteParam(items=" + this.items + ", type=" + this.type + ')';
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
    }
}
