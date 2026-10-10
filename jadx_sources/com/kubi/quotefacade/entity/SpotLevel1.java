package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketMenuEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005HÆ\u0001J\u0006\u0010 \u001a\u00020\nJ\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\nHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012¨\u0006+"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/SpotLevel1;", "Landroid/os/Parcelable;", "quoteCryptoAliasName", "", "quoteCryptos", "", "nameA", "enabled", "", "priority", "", "level2", "Lcom/kubi/quotefacade/entity/SpotLevel2;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZILjava/util/List;)V", "getQuoteCryptoAliasName", "()Ljava/lang/String;", "getQuoteCryptos", "()Ljava/util/List;", "getNameA", "getEnabled", "()Z", "getPriority", "()I", "getLevel2", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SpotLevel1 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SpotLevel1> CREATOR = new C21911a();
    private final boolean enabled;

    @Nullable
    private final List<SpotLevel2> level2;

    @Nullable
    private final String nameA;
    private final int priority;

    @Nullable
    private final String quoteCryptoAliasName;

    @Nullable
    private final List<String> quoteCryptos;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.SpotLevel1$a */
    /* JADX INFO: compiled from: MarketMenuEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21911a implements Parcelable.Creator<SpotLevel1> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SpotLevel1 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string2 = parcel.readString();
            boolean z11 = parcel.readInt() != 0;
            int i11 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(SpotLevel2.CREATOR.createFromParcel(parcel));
                }
            }
            return new SpotLevel1(string, arrayListCreateStringArrayList, string2, z11, i11, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SpotLevel1[] newArray(int i11) {
            return new SpotLevel1[i11];
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
        if (!(other instanceof SpotLevel1)) {
            return false;
        }
        SpotLevel1 spotLevel1 = (SpotLevel1) other;
        return Intrinsics.areEqual(this.quoteCryptoAliasName, spotLevel1.quoteCryptoAliasName) && Intrinsics.areEqual(this.quoteCryptos, spotLevel1.quoteCryptos) && Intrinsics.areEqual(this.nameA, spotLevel1.nameA) && this.enabled == spotLevel1.enabled && this.priority == spotLevel1.priority && Intrinsics.areEqual(this.level2, spotLevel1.level2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpotLevel1 copy$default(SpotLevel1 spotLevel1, String str, List list, String str2, boolean z11, int i11, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = spotLevel1.quoteCryptoAliasName;
        }
        if ((i12 & 2) != 0) {
            list = spotLevel1.quoteCryptos;
        }
        if ((i12 & 4) != 0) {
            str2 = spotLevel1.nameA;
        }
        if ((i12 & 8) != 0) {
            z11 = spotLevel1.enabled;
        }
        if ((i12 & 16) != 0) {
            i11 = spotLevel1.priority;
        }
        if ((i12 & 32) != 0) {
            list2 = spotLevel1.level2;
        }
        int i13 = i11;
        List list3 = list2;
        return spotLevel1.copy(str, list, str2, z11, i13, list3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuoteCryptoAliasName() {
        return this.quoteCryptoAliasName;
    }

    @Nullable
    public final List<String> component2() {
        return this.quoteCryptos;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNameA() {
        return this.nameA;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    @Nullable
    public final List<SpotLevel2> component6() {
        return this.level2;
    }

    @NotNull
    public final SpotLevel1 copy(@Nullable String quoteCryptoAliasName, @Nullable List<String> quoteCryptos, @Nullable String nameA, boolean enabled, int priority, @Nullable List<SpotLevel2> level2) {
        return new SpotLevel1(quoteCryptoAliasName, quoteCryptos, nameA, enabled, priority, level2);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final List<SpotLevel2> getLevel2() {
        return this.level2;
    }

    @Nullable
    public final String getNameA() {
        return this.nameA;
    }

    public final int getPriority() {
        return this.priority;
    }

    @Nullable
    public final String getQuoteCryptoAliasName() {
        return this.quoteCryptoAliasName;
    }

    @Nullable
    public final List<String> getQuoteCryptos() {
        return this.quoteCryptos;
    }

    public int hashCode() {
        String str = this.quoteCryptoAliasName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.quoteCryptos;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.nameA;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.enabled)) * 31) + Integer.hashCode(this.priority)) * 31;
        List<SpotLevel2> list2 = this.level2;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SpotLevel1(quoteCryptoAliasName=" + this.quoteCryptoAliasName + ", quoteCryptos=" + this.quoteCryptos + ", nameA=" + this.nameA + ", enabled=" + this.enabled + ", priority=" + this.priority + ", level2=" + this.level2 + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.quoteCryptoAliasName);
        dest.writeStringList(this.quoteCryptos);
        dest.writeString(this.nameA);
        dest.writeInt(this.enabled ? 1 : 0);
        dest.writeInt(this.priority);
        List<SpotLevel2> list = this.level2;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<SpotLevel2> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public SpotLevel1(@Nullable String str, @Nullable List<String> list, @Nullable String str2, boolean z11, int i11, @Nullable List<SpotLevel2> list2) {
        this.quoteCryptoAliasName = str;
        this.quoteCryptos = list;
        this.nameA = str2;
        this.enabled = z11;
        this.priority = i11;
        this.level2 = list2;
    }
}
