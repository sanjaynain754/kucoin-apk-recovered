package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FavMarketQuoteEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ,\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/UserFavoritesSpotEntity;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/quotefacade/entity/MarketListEntityItem;", "siteEnabled", "", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "getItems", "()Ljava/util/List;", "getSiteEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lcom/kubi/quotefacade/entity/UserFavoritesSpotEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UserFavoritesSpotEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserFavoritesSpotEntity> CREATOR = new C21918a();

    @Nullable
    private final List<MarketListEntityItem> items;

    @Nullable
    private final Boolean siteEnabled;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.UserFavoritesSpotEntity$a */
    /* JADX INFO: compiled from: FavMarketQuoteEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21918a implements Parcelable.Creator<UserFavoritesSpotEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UserFavoritesSpotEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(UserFavoritesSpotEntity.class.getClassLoader()));
                }
            }
            return new UserFavoritesSpotEntity(arrayList, parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UserFavoritesSpotEntity[] newArray(int i11) {
            return new UserFavoritesSpotEntity[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserFavoritesSpotEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserFavoritesSpotEntity)) {
            return false;
        }
        UserFavoritesSpotEntity userFavoritesSpotEntity = (UserFavoritesSpotEntity) other;
        return Intrinsics.areEqual(this.items, userFavoritesSpotEntity.items) && Intrinsics.areEqual(this.siteEnabled, userFavoritesSpotEntity.siteEnabled);
    }

    public UserFavoritesSpotEntity(@Nullable List<MarketListEntityItem> list, @Nullable Boolean bool) {
        this.items = list;
        this.siteEnabled = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserFavoritesSpotEntity copy$default(UserFavoritesSpotEntity userFavoritesSpotEntity, List list, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = userFavoritesSpotEntity.items;
        }
        if ((i11 & 2) != 0) {
            bool = userFavoritesSpotEntity.siteEnabled;
        }
        return userFavoritesSpotEntity.copy(list, bool);
    }

    @Nullable
    public final List<MarketListEntityItem> component1() {
        return this.items;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getSiteEnabled() {
        return this.siteEnabled;
    }

    @NotNull
    public final UserFavoritesSpotEntity copy(@Nullable List<MarketListEntityItem> items, @Nullable Boolean siteEnabled) {
        return new UserFavoritesSpotEntity(items, siteEnabled);
    }

    @Nullable
    public final List<MarketListEntityItem> getItems() {
        return this.items;
    }

    @Nullable
    public final Boolean getSiteEnabled() {
        return this.siteEnabled;
    }

    public int hashCode() {
        List<MarketListEntityItem> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.siteEnabled;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UserFavoritesSpotEntity(items=" + this.items + ", siteEnabled=" + this.siteEnabled + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<MarketListEntityItem> list = this.items;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<MarketListEntityItem> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }
        Boolean bool = this.siteEnabled;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ UserFavoritesSpotEntity(List list, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : bool);
    }
}
