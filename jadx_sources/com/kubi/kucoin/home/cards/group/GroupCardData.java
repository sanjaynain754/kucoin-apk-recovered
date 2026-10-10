package com.kubi.kucoin.home.cards.group;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.kucoin.home.cards.BaseCardData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GroupCardData.kt */
/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/kucoin/home/cards/group/GroupCardData;", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "children", "", "<init>", "(Ljava/util/List;)V", "getChildren", "()Ljava/util/List;", "setChildren", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class GroupCardData extends BaseCardData {

    @NotNull
    public static final Parcelable.Creator<GroupCardData> CREATOR = new C15388a();

    @Nullable
    private List<BaseCardData> children;

    /* JADX INFO: renamed from: com.kubi.kucoin.home.cards.group.GroupCardData$a */
    /* JADX INFO: compiled from: GroupCardData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15388a implements Parcelable.Creator<GroupCardData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GroupCardData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(parcel.readParcelable(GroupCardData.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new GroupCardData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GroupCardData[] newArray(int i11) {
            return new GroupCardData[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupCardData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardData, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GroupCardData) && Intrinsics.areEqual(this.children, ((GroupCardData) other).children);
    }

    public GroupCardData(@Nullable List<BaseCardData> list) {
        super(0, 0, 0, false, 0, null, null, 0, 255, null);
        this.children = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupCardData copy$default(GroupCardData groupCardData, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = groupCardData.children;
        }
        return groupCardData.copy(list);
    }

    @Nullable
    public final List<BaseCardData> component1() {
        return this.children;
    }

    @NotNull
    public final GroupCardData copy(@Nullable List<BaseCardData> children) {
        return new GroupCardData(children);
    }

    @Nullable
    public final List<BaseCardData> getChildren() {
        return this.children;
    }

    public int hashCode() {
        List<BaseCardData> list = this.children;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setChildren(@Nullable List<BaseCardData> list) {
        this.children = list;
    }

    @NotNull
    public String toString() {
        return "GroupCardData(children=" + this.children + ')';
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardData, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<BaseCardData> list = this.children;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<BaseCardData> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
    }

    public /* synthetic */ GroupCardData(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list);
    }
}
