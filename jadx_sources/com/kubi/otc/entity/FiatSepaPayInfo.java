package com.kubi.otc.entity;

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
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J8\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006%"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatSepaPayInfo;", "Landroid/os/Parcelable;", "channel_id", "", "sepaKycNotice", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/otc/entity/FiatSepaPayItem;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "getChannel_id", "()Ljava/lang/String;", "getSepaKycNotice", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)Lcom/kubi/otc/entity/FiatSepaPayInfo;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatSepaPayInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FiatSepaPayInfo> CREATOR = new Creator();

    @Nullable
    private final String channel_id;

    @Nullable
    private List<FiatSepaPayItem> items;

    @Nullable
    private final Boolean sepaKycNotice;

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FiatSepaPayInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatSepaPayInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            ArrayList arrayList = null;
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() != 0) {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(FiatSepaPayItem.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new FiatSepaPayInfo(string, boolValueOf, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatSepaPayInfo[] newArray(int i11) {
            return new FiatSepaPayInfo[i11];
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
        if (!(other instanceof FiatSepaPayInfo)) {
            return false;
        }
        FiatSepaPayInfo fiatSepaPayInfo = (FiatSepaPayInfo) other;
        return Intrinsics.areEqual(this.channel_id, fiatSepaPayInfo.channel_id) && Intrinsics.areEqual(this.sepaKycNotice, fiatSepaPayInfo.sepaKycNotice) && Intrinsics.areEqual(this.items, fiatSepaPayInfo.items);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FiatSepaPayInfo copy$default(FiatSepaPayInfo fiatSepaPayInfo, String str, Boolean bool, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatSepaPayInfo.channel_id;
        }
        if ((i11 & 2) != 0) {
            bool = fiatSepaPayInfo.sepaKycNotice;
        }
        if ((i11 & 4) != 0) {
            list = fiatSepaPayInfo.items;
        }
        return fiatSepaPayInfo.copy(str, bool, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannel_id() {
        return this.channel_id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getSepaKycNotice() {
        return this.sepaKycNotice;
    }

    @Nullable
    public final List<FiatSepaPayItem> component3() {
        return this.items;
    }

    @NotNull
    public final FiatSepaPayInfo copy(@Nullable String channel_id, @Nullable Boolean sepaKycNotice, @Nullable List<FiatSepaPayItem> items) {
        return new FiatSepaPayInfo(channel_id, sepaKycNotice, items);
    }

    @Nullable
    public final String getChannel_id() {
        return this.channel_id;
    }

    @Nullable
    public final List<FiatSepaPayItem> getItems() {
        return this.items;
    }

    @Nullable
    public final Boolean getSepaKycNotice() {
        return this.sepaKycNotice;
    }

    public int hashCode() {
        String str = this.channel_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.sepaKycNotice;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<FiatSepaPayItem> list = this.items;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setItems(@Nullable List<FiatSepaPayItem> list) {
        this.items = list;
    }

    @NotNull
    public String toString() {
        return "FiatSepaPayInfo(channel_id=" + this.channel_id + ", sepaKycNotice=" + this.sepaKycNotice + ", items=" + this.items + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.channel_id);
        Boolean bool = this.sepaKycNotice;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List<FiatSepaPayItem> list = this.items;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<FiatSepaPayItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public FiatSepaPayInfo(@Nullable String str, @Nullable Boolean bool, @Nullable List<FiatSepaPayItem> list) {
        this.channel_id = str;
        this.sepaKycNotice = bool;
        this.items = list;
    }
}
