package com.kubi.trade.core.biz.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketsEntity.kt */
/* JADX INFO: loaded from: classes45.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, m90084d2 = {"Lcom/kubi/trade/core/biz/entity/MarketsEntity;", "Landroid/os/Parcelable;", "displayName", "", "name", "checked", "", "quotes", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getDisplayName", "()Ljava/lang/String;", "getName", "getChecked", "()Z", "setChecked", "(Z)V", "getQuotes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketsEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarketsEntity> CREATOR = new C25850a();
    private boolean checked;

    @NotNull
    private final String displayName;

    @NotNull
    private final String name;

    @NotNull
    private final List<String> quotes;

    /* JADX INFO: renamed from: com.kubi.trade.core.biz.entity.MarketsEntity$a */
    /* JADX INFO: compiled from: MarketsEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25850a implements Parcelable.Creator<MarketsEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarketsEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarketsEntity(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarketsEntity[] newArray(int i11) {
            return new MarketsEntity[i11];
        }
    }

    public MarketsEntity() {
        this(null, null, false, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketsEntity)) {
            return false;
        }
        MarketsEntity marketsEntity = (MarketsEntity) other;
        return Intrinsics.areEqual(this.displayName, marketsEntity.displayName) && Intrinsics.areEqual(this.name, marketsEntity.name) && this.checked == marketsEntity.checked && Intrinsics.areEqual(this.quotes, marketsEntity.quotes);
    }

    public MarketsEntity(@NotNull String displayName, @NotNull String name, boolean z11, @NotNull List<String> quotes) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        this.displayName = displayName;
        this.name = name;
        this.checked = z11;
        this.quotes = quotes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketsEntity copy$default(MarketsEntity marketsEntity, String str, String str2, boolean z11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = marketsEntity.displayName;
        }
        if ((i11 & 2) != 0) {
            str2 = marketsEntity.name;
        }
        if ((i11 & 4) != 0) {
            z11 = marketsEntity.checked;
        }
        if ((i11 & 8) != 0) {
            list = marketsEntity.quotes;
        }
        return marketsEntity.copy(str, str2, z11, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    @NotNull
    public final List<String> component4() {
        return this.quotes;
    }

    @NotNull
    public final MarketsEntity copy(@NotNull String displayName, @NotNull String name, boolean checked, @NotNull List<String> quotes) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        return new MarketsEntity(displayName, name, checked, quotes);
    }

    public final boolean getChecked() {
        return this.checked;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<String> getQuotes() {
        return this.quotes;
    }

    public int hashCode() {
        return (((((this.displayName.hashCode() * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.checked)) * 31) + this.quotes.hashCode();
    }

    public final void setChecked(boolean z11) {
        this.checked = z11;
    }

    @NotNull
    public String toString() {
        return "MarketsEntity(displayName=" + this.displayName + ", name=" + this.name + ", checked=" + this.checked + ", quotes=" + this.quotes + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.displayName);
        dest.writeString(this.name);
        dest.writeInt(this.checked ? 1 : 0);
        dest.writeStringList(this.quotes);
    }

    public /* synthetic */ MarketsEntity(String str, String str2, boolean z11, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? new ArrayList() : list);
    }
}
