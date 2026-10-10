package com.kubi.operation.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchTopicEntity.kt */
/* JADX INFO: loaded from: classes31.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, m90084d2 = {"Lcom/kubi/operation/api/entity/SearchTopicCurrency;", "Landroid/os/Parcelable;", "changeRate", "", "code", "logo", "name", "symbol", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChangeRate", "()Ljava/lang/String;", "getCode", "getLogo", "getName", "getSymbol", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "OperationApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SearchTopicCurrency implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SearchTopicCurrency> CREATOR = new C19431a();

    @Nullable
    private final String changeRate;

    @Nullable
    private final String code;

    @Nullable
    private final String logo;

    @Nullable
    private final String name;

    @Nullable
    private final String symbol;

    /* JADX INFO: renamed from: com.kubi.operation.api.entity.SearchTopicCurrency$a */
    /* JADX INFO: compiled from: SearchTopicEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19431a implements Parcelable.Creator<SearchTopicCurrency> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SearchTopicCurrency createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SearchTopicCurrency(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SearchTopicCurrency[] newArray(int i11) {
            return new SearchTopicCurrency[i11];
        }
    }

    public static /* synthetic */ SearchTopicCurrency copy$default(SearchTopicCurrency searchTopicCurrency, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchTopicCurrency.changeRate;
        }
        if ((i11 & 2) != 0) {
            str2 = searchTopicCurrency.code;
        }
        if ((i11 & 4) != 0) {
            str3 = searchTopicCurrency.logo;
        }
        if ((i11 & 8) != 0) {
            str4 = searchTopicCurrency.name;
        }
        if ((i11 & 16) != 0) {
            str5 = searchTopicCurrency.symbol;
        }
        String str6 = str5;
        String str7 = str3;
        return searchTopicCurrency.copy(str, str2, str7, str4, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchTopicCurrency)) {
            return false;
        }
        SearchTopicCurrency searchTopicCurrency = (SearchTopicCurrency) other;
        return Intrinsics.areEqual(this.changeRate, searchTopicCurrency.changeRate) && Intrinsics.areEqual(this.code, searchTopicCurrency.code) && Intrinsics.areEqual(this.logo, searchTopicCurrency.logo) && Intrinsics.areEqual(this.name, searchTopicCurrency.name) && Intrinsics.areEqual(this.symbol, searchTopicCurrency.symbol);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.changeRate);
        dest.writeString(this.code);
        dest.writeString(this.logo);
        dest.writeString(this.name);
        dest.writeString(this.symbol);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final SearchTopicCurrency copy(@Nullable String changeRate, @Nullable String code, @Nullable String logo, @Nullable String name, @Nullable String symbol) {
        return new SearchTopicCurrency(changeRate, code, logo, name, symbol);
    }

    @Nullable
    public final String getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getLogo() {
        return this.logo;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.changeRate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.logo;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.symbol;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SearchTopicCurrency(changeRate=" + this.changeRate + ", code=" + this.code + ", logo=" + this.logo + ", name=" + this.name + ", symbol=" + this.symbol + ')';
    }

    public SearchTopicCurrency(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.changeRate = str;
        this.code = str2;
        this.logo = str3;
        this.name = str4;
        this.symbol = str5;
    }
}
