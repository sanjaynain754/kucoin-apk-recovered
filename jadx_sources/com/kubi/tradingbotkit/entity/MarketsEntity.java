package com.kubi.tradingbotkit.entity;

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
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003JB\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/MarketsEntity;", "Landroid/os/Parcelable;", "displayName", "", "name", "checked", "", "quotes", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "getDisplayName", "()Ljava/lang/String;", "getName", "getChecked", "()Ljava/lang/Boolean;", "setChecked", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getQuotes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)Lcom/kubi/tradingbotkit/entity/MarketsEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketsEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarketsEntity> CREATOR = new C26215a();

    @Nullable
    private Boolean checked;

    @Nullable
    private final String displayName;

    @Nullable
    private final String name;

    @NotNull
    private final List<String> quotes;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.entity.MarketsEntity$a */
    /* JADX INFO: compiled from: MarketsEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26215a implements Parcelable.Creator<MarketsEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarketsEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketsEntity(string, string2, boolValueOf, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarketsEntity[] newArray(int i11) {
            return new MarketsEntity[i11];
        }
    }

    public MarketsEntity() {
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
        if (!(other instanceof MarketsEntity)) {
            return false;
        }
        MarketsEntity marketsEntity = (MarketsEntity) other;
        return Intrinsics.areEqual(this.displayName, marketsEntity.displayName) && Intrinsics.areEqual(this.name, marketsEntity.name) && Intrinsics.areEqual(this.checked, marketsEntity.checked) && Intrinsics.areEqual(this.quotes, marketsEntity.quotes);
    }

    public MarketsEntity(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @NotNull List<String> quotes) {
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        this.displayName = str;
        this.name = str2;
        this.checked = bool;
        this.quotes = quotes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketsEntity copy$default(MarketsEntity marketsEntity, String str, String str2, Boolean bool, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = marketsEntity.displayName;
        }
        if ((i11 & 2) != 0) {
            str2 = marketsEntity.name;
        }
        if ((i11 & 4) != 0) {
            bool = marketsEntity.checked;
        }
        if ((i11 & 8) != 0) {
            list = marketsEntity.quotes;
        }
        return marketsEntity.copy(str, str2, bool, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getChecked() {
        return this.checked;
    }

    @NotNull
    public final List<String> component4() {
        return this.quotes;
    }

    @NotNull
    public final MarketsEntity copy(@Nullable String displayName, @Nullable String name, @Nullable Boolean checked, @NotNull List<String> quotes) {
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        return new MarketsEntity(displayName, name, checked, quotes);
    }

    @Nullable
    public final Boolean getChecked() {
        return this.checked;
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<String> getQuotes() {
        return this.quotes;
    }

    public int hashCode() {
        String str = this.displayName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.checked;
        return ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + this.quotes.hashCode();
    }

    public final void setChecked(@Nullable Boolean bool) {
        this.checked = bool;
    }

    @NotNull
    public String toString() {
        return "MarketsEntity(displayName=" + this.displayName + ", name=" + this.name + ", checked=" + this.checked + ", quotes=" + this.quotes + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.displayName);
        dest.writeString(this.name);
        Boolean bool = this.checked;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            dest.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        dest.writeInt(BooleanValue);
        dest.writeStringList(this.quotes);
    }

    public /* synthetic */ MarketsEntity(String str, String str2, Boolean bool, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? Boolean.FALSE : bool, (i11 & 8) != 0 ? new ArrayList() : list);
    }
}
