package com.kubi.home.gembox;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kucoin.home.cards.BaseCardData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GemboxCardData.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/home/gembox/GemboxCardData;", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "data", "", "Lcom/kubi/home/gembox/GemboxCardData$Data;", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Data", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class GemboxCardData extends BaseCardData {

    @NotNull
    public static final Parcelable.Creator<GemboxCardData> CREATOR = new C14566a();

    @NotNull
    private final List<Data> data;

    /* JADX INFO: compiled from: GemboxCardData.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0081\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0006\u0010*\u001a\u00020+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020+HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020+R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00067"}, m90084d2 = {"Lcom/kubi/home/gembox/GemboxCardData$Data;", "Landroid/os/Parcelable;", "changeRate", "Ljava/math/BigDecimal;", "changeRateString", "", "heatValue", "name", "iconUrl", FirebaseAnalytics.Param.PRICE, "priceString", "symbolCode", "jumpLink", "highLights", "", "Lcom/kubi/home/gembox/GemboxCardDataHighLight;", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getChangeRate", "()Ljava/math/BigDecimal;", "getChangeRateString", "()Ljava/lang/String;", "getHeatValue", "getName", "getIconUrl", "getPrice", "getPriceString", "getSymbolCode", "getJumpLink", "getHighLights", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Data implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Data> CREATOR = new C14565a();

        @Nullable
        private final BigDecimal changeRate;

        @NotNull
        private final String changeRateString;

        @Nullable
        private final String heatValue;

        @Nullable
        private final List<GemboxCardDataHighLight> highLights;

        @Nullable
        private final String iconUrl;

        @Nullable
        private final String jumpLink;

        @NotNull
        private final String name;

        @Nullable
        private final BigDecimal price;

        @NotNull
        private final String priceString;

        @Nullable
        private final String symbolCode;

        /* JADX INFO: renamed from: com.kubi.home.gembox.GemboxCardData$Data$a */
        /* JADX INFO: compiled from: GemboxCardData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C14565a implements Parcelable.Creator<Data> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Data createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i11 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        arrayList2.add(GemboxCardDataHighLight.CREATOR.createFromParcel(parcel));
                    }
                    arrayList = arrayList2;
                }
                return new Data(bigDecimal, string, string2, string3, string4, bigDecimal2, string5, string6, string7, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Data[] newArray(int i11) {
                return new Data[i11];
            }
        }

        public Data() {
            this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.areEqual(this.changeRate, data.changeRate) && Intrinsics.areEqual(this.changeRateString, data.changeRateString) && Intrinsics.areEqual(this.heatValue, data.heatValue) && Intrinsics.areEqual(this.name, data.name) && Intrinsics.areEqual(this.iconUrl, data.iconUrl) && Intrinsics.areEqual(this.price, data.price) && Intrinsics.areEqual(this.priceString, data.priceString) && Intrinsics.areEqual(this.symbolCode, data.symbolCode) && Intrinsics.areEqual(this.jumpLink, data.jumpLink) && Intrinsics.areEqual(this.highLights, data.highLights);
        }

        public Data(@Nullable BigDecimal bigDecimal, @NotNull String changeRateString, @Nullable String str, @NotNull String name, @Nullable String str2, @Nullable BigDecimal bigDecimal2, @NotNull String priceString, @Nullable String str3, @Nullable String str4, @Nullable List<GemboxCardDataHighLight> list) {
            Intrinsics.checkNotNullParameter(changeRateString, "changeRateString");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(priceString, "priceString");
            this.changeRate = bigDecimal;
            this.changeRateString = changeRateString;
            this.heatValue = str;
            this.name = name;
            this.iconUrl = str2;
            this.price = bigDecimal2;
            this.priceString = priceString;
            this.symbolCode = str3;
            this.jumpLink = str4;
            this.highLights = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data copy$default(Data data, BigDecimal bigDecimal, String str, String str2, String str3, String str4, BigDecimal bigDecimal2, String str5, String str6, String str7, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bigDecimal = data.changeRate;
            }
            if ((i11 & 2) != 0) {
                str = data.changeRateString;
            }
            if ((i11 & 4) != 0) {
                str2 = data.heatValue;
            }
            if ((i11 & 8) != 0) {
                str3 = data.name;
            }
            if ((i11 & 16) != 0) {
                str4 = data.iconUrl;
            }
            if ((i11 & 32) != 0) {
                bigDecimal2 = data.price;
            }
            if ((i11 & 64) != 0) {
                str5 = data.priceString;
            }
            if ((i11 & 128) != 0) {
                str6 = data.symbolCode;
            }
            if ((i11 & 256) != 0) {
                str7 = data.jumpLink;
            }
            if ((i11 & 512) != 0) {
                list = data.highLights;
            }
            String str8 = str7;
            List list2 = list;
            String str9 = str5;
            String str10 = str6;
            String str11 = str4;
            BigDecimal bigDecimal3 = bigDecimal2;
            return data.copy(bigDecimal, str, str2, str3, str11, bigDecimal3, str9, str10, str8, list2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BigDecimal getChangeRate() {
            return this.changeRate;
        }

        @Nullable
        public final List<GemboxCardDataHighLight> component10() {
            return this.highLights;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getChangeRateString() {
            return this.changeRateString;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getHeatValue() {
            return this.heatValue;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final BigDecimal getPrice() {
            return this.price;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getPriceString() {
            return this.priceString;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getSymbolCode() {
            return this.symbolCode;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getJumpLink() {
            return this.jumpLink;
        }

        @NotNull
        public final Data copy(@Nullable BigDecimal changeRate, @NotNull String changeRateString, @Nullable String heatValue, @NotNull String name, @Nullable String iconUrl, @Nullable BigDecimal price, @NotNull String priceString, @Nullable String symbolCode, @Nullable String jumpLink, @Nullable List<GemboxCardDataHighLight> highLights) {
            Intrinsics.checkNotNullParameter(changeRateString, "changeRateString");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(priceString, "priceString");
            return new Data(changeRate, changeRateString, heatValue, name, iconUrl, price, priceString, symbolCode, jumpLink, highLights);
        }

        @Nullable
        public final BigDecimal getChangeRate() {
            return this.changeRate;
        }

        @NotNull
        public final String getChangeRateString() {
            return this.changeRateString;
        }

        @Nullable
        public final String getHeatValue() {
            return this.heatValue;
        }

        @Nullable
        public final List<GemboxCardDataHighLight> getHighLights() {
            return this.highLights;
        }

        @Nullable
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        public final String getJumpLink() {
            return this.jumpLink;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final BigDecimal getPrice() {
            return this.price;
        }

        @NotNull
        public final String getPriceString() {
            return this.priceString;
        }

        @Nullable
        public final String getSymbolCode() {
            return this.symbolCode;
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.changeRate;
            int iHashCode = (((bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31) + this.changeRateString.hashCode()) * 31;
            String str = this.heatValue;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.name.hashCode()) * 31;
            String str2 = this.iconUrl;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.price;
            int iHashCode4 = (((iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + this.priceString.hashCode()) * 31;
            String str3 = this.symbolCode;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.jumpLink;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List<GemboxCardDataHighLight> list = this.highLights;
            return iHashCode6 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Data(changeRate=" + this.changeRate + ", changeRateString=" + this.changeRateString + ", heatValue=" + this.heatValue + ", name=" + this.name + ", iconUrl=" + this.iconUrl + ", price=" + this.price + ", priceString=" + this.priceString + ", symbolCode=" + this.symbolCode + ", jumpLink=" + this.jumpLink + ", highLights=" + this.highLights + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.changeRate);
            dest.writeString(this.changeRateString);
            dest.writeString(this.heatValue);
            dest.writeString(this.name);
            dest.writeString(this.iconUrl);
            dest.writeSerializable(this.price);
            dest.writeString(this.priceString);
            dest.writeString(this.symbolCode);
            dest.writeString(this.jumpLink);
            List<GemboxCardDataHighLight> list = this.highLights;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<GemboxCardDataHighLight> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ Data(BigDecimal bigDecimal, String str, String str2, String str3, String str4, BigDecimal bigDecimal2, String str5, String str6, String str7, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? "--" : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? "--" : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : bigDecimal2, (i11 & 64) != 0 ? "--" : str5, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? "" : str7, (i11 & 512) != 0 ? CollectionsKt.emptyList() : list);
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.gembox.GemboxCardData$a */
    /* JADX INFO: compiled from: GemboxCardData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14566a implements Parcelable.Creator<GemboxCardData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GemboxCardData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(Data.CREATOR.createFromParcel(parcel));
            }
            return new GemboxCardData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GemboxCardData[] newArray(int i11) {
            return new GemboxCardData[i11];
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GemboxCardData) && Intrinsics.areEqual(this.data, ((GemboxCardData) other).data);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GemboxCardData(@NotNull List<Data> data) {
        super(0, 0, 0, false, 0, null, null, 0, 255, null);
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GemboxCardData copy$default(GemboxCardData gemboxCardData, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = gemboxCardData.data;
        }
        return gemboxCardData.copy(list);
    }

    @NotNull
    public final List<Data> component1() {
        return this.data;
    }

    @NotNull
    public final GemboxCardData copy(@NotNull List<Data> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new GemboxCardData(data);
    }

    @NotNull
    public final List<Data> getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "GemboxCardData(data=" + this.data + ')';
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardData, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<Data> list = this.data;
        dest.writeInt(list.size());
        Iterator<Data> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }
}
