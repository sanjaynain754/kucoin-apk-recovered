package com.kubi.welfare.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WelfareEntity.kt */
/* JADX INFO: loaded from: classes58.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B,\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0019\u0010\u0004\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001c\u0010\u0014\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\bHÆ\u0003J2\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u001b\b\u0002\u0010\u0004\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\bHÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR-\u0010\u0004\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006$"}, m90084d2 = {"Lcom/kubi/welfare/api/entity/WelfareInfoEntity;", "Landroid/os/Parcelable;", "totalAmount", "Ljava/math/BigDecimal;", "incomeResponse", "", "", "Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;", "Lkotlinx/parcelize/RawValue;", "<init>", "(Ljava/math/BigDecimal;Ljava/util/Map;)V", "getTotalAmount", "()Ljava/math/BigDecimal;", "setTotalAmount", "(Ljava/math/BigDecimal;)V", "getIncomeResponse", "()Ljava/util/Map;", "setIncomeResponse", "(Ljava/util/Map;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "WelfareDetailEntity", "WelfareApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WelfareInfoEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WelfareInfoEntity> CREATOR = new C27127a();

    @Nullable
    private Map<String, WelfareDetailEntity> incomeResponse;

    @Nullable
    private BigDecimal totalAmount;

    /* JADX INFO: compiled from: WelfareEntity.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u0006,"}, m90084d2 = {"Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "totalAmount", "Ljava/math/BigDecimal;", "type", "yesterdayAmount", "expandNum", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getTotalAmount", "()Ljava/math/BigDecimal;", "setTotalAmount", "(Ljava/math/BigDecimal;)V", "getType", "setType", "getYesterdayAmount", "setYesterdayAmount", "getExpandNum", "setExpandNum", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "WelfareApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class WelfareDetailEntity implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<WelfareDetailEntity> CREATOR = new C27126a();

        @Nullable
        private String currency;

        @Nullable
        private BigDecimal expandNum;

        @Nullable
        private BigDecimal totalAmount;

        @Nullable
        private String type;

        @Nullable
        private BigDecimal yesterdayAmount;

        /* JADX INFO: renamed from: com.kubi.welfare.api.entity.WelfareInfoEntity$WelfareDetailEntity$a */
        /* JADX INFO: compiled from: WelfareEntity.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C27126a implements Parcelable.Creator<WelfareDetailEntity> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WelfareDetailEntity createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WelfareDetailEntity(parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final WelfareDetailEntity[] newArray(int i11) {
                return new WelfareDetailEntity[i11];
            }
        }

        public static /* synthetic */ WelfareDetailEntity copy$default(WelfareDetailEntity welfareDetailEntity, String str, BigDecimal bigDecimal, String str2, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = welfareDetailEntity.currency;
            }
            if ((i11 & 2) != 0) {
                bigDecimal = welfareDetailEntity.totalAmount;
            }
            if ((i11 & 4) != 0) {
                str2 = welfareDetailEntity.type;
            }
            if ((i11 & 8) != 0) {
                bigDecimal2 = welfareDetailEntity.yesterdayAmount;
            }
            if ((i11 & 16) != 0) {
                bigDecimal3 = welfareDetailEntity.expandNum;
            }
            BigDecimal bigDecimal4 = bigDecimal3;
            String str3 = str2;
            return welfareDetailEntity.copy(str, bigDecimal, str3, bigDecimal2, bigDecimal4);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WelfareDetailEntity)) {
                return false;
            }
            WelfareDetailEntity welfareDetailEntity = (WelfareDetailEntity) other;
            return Intrinsics.areEqual(this.currency, welfareDetailEntity.currency) && Intrinsics.areEqual(this.totalAmount, welfareDetailEntity.totalAmount) && Intrinsics.areEqual(this.type, welfareDetailEntity.type) && Intrinsics.areEqual(this.yesterdayAmount, welfareDetailEntity.yesterdayAmount) && Intrinsics.areEqual(this.expandNum, welfareDetailEntity.expandNum);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final BigDecimal getTotalAmount() {
            return this.totalAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final BigDecimal getYesterdayAmount() {
            return this.yesterdayAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final BigDecimal getExpandNum() {
            return this.expandNum;
        }

        @NotNull
        public final WelfareDetailEntity copy(@Nullable String currency, @Nullable BigDecimal totalAmount, @Nullable String type, @Nullable BigDecimal yesterdayAmount, @Nullable BigDecimal expandNum) {
            return new WelfareDetailEntity(currency, totalAmount, type, yesterdayAmount, expandNum);
        }

        @Nullable
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        public final BigDecimal getExpandNum() {
            return this.expandNum;
        }

        @Nullable
        public final BigDecimal getTotalAmount() {
            return this.totalAmount;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        @Nullable
        public final BigDecimal getYesterdayAmount() {
            return this.yesterdayAmount;
        }

        public int hashCode() {
            String str = this.currency;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            BigDecimal bigDecimal = this.totalAmount;
            int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            String str2 = this.type;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.yesterdayAmount;
            int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.expandNum;
            return iHashCode4 + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0);
        }

        public final void setCurrency(@Nullable String str) {
            this.currency = str;
        }

        public final void setExpandNum(@Nullable BigDecimal bigDecimal) {
            this.expandNum = bigDecimal;
        }

        public final void setTotalAmount(@Nullable BigDecimal bigDecimal) {
            this.totalAmount = bigDecimal;
        }

        public final void setType(@Nullable String str) {
            this.type = str;
        }

        public final void setYesterdayAmount(@Nullable BigDecimal bigDecimal) {
            this.yesterdayAmount = bigDecimal;
        }

        @NotNull
        public String toString() {
            return "WelfareDetailEntity(currency=" + this.currency + ", totalAmount=" + this.totalAmount + ", type=" + this.type + ", yesterdayAmount=" + this.yesterdayAmount + ", expandNum=" + this.expandNum + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.currency);
            dest.writeSerializable(this.totalAmount);
            dest.writeString(this.type);
            dest.writeSerializable(this.yesterdayAmount);
            dest.writeSerializable(this.expandNum);
        }

        public WelfareDetailEntity(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable String str2, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3) {
            this.currency = str;
            this.totalAmount = bigDecimal;
            this.type = str2;
            this.yesterdayAmount = bigDecimal2;
            this.expandNum = bigDecimal3;
        }
    }

    /* JADX INFO: renamed from: com.kubi.welfare.api.entity.WelfareInfoEntity$a */
    /* JADX INFO: compiled from: WelfareEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C27127a implements Parcelable.Creator<WelfareInfoEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WelfareInfoEntity createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i11 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap2.put(parcel.readString(), WelfareDetailEntity.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new WelfareInfoEntity(bigDecimal, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WelfareInfoEntity[] newArray(int i11) {
            return new WelfareInfoEntity[i11];
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
        if (!(other instanceof WelfareInfoEntity)) {
            return false;
        }
        WelfareInfoEntity welfareInfoEntity = (WelfareInfoEntity) other;
        return Intrinsics.areEqual(this.totalAmount, welfareInfoEntity.totalAmount) && Intrinsics.areEqual(this.incomeResponse, welfareInfoEntity.incomeResponse);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.totalAmount);
        Map<String, WelfareDetailEntity> map = this.incomeResponse;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(map.size());
        for (Map.Entry<String, WelfareDetailEntity> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            entry.getValue().writeToParcel(dest, flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WelfareInfoEntity copy$default(WelfareInfoEntity welfareInfoEntity, BigDecimal bigDecimal, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = welfareInfoEntity.totalAmount;
        }
        if ((i11 & 2) != 0) {
            map = welfareInfoEntity.incomeResponse;
        }
        return welfareInfoEntity.copy(bigDecimal, map);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    @Nullable
    public final Map<String, WelfareDetailEntity> component2() {
        return this.incomeResponse;
    }

    @NotNull
    public final WelfareInfoEntity copy(@Nullable BigDecimal totalAmount, @Nullable Map<String, WelfareDetailEntity> incomeResponse) {
        return new WelfareInfoEntity(totalAmount, incomeResponse);
    }

    @Nullable
    public final Map<String, WelfareDetailEntity> getIncomeResponse() {
        return this.incomeResponse;
    }

    @Nullable
    public final BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.totalAmount;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        Map<String, WelfareDetailEntity> map = this.incomeResponse;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final void setIncomeResponse(@Nullable Map<String, WelfareDetailEntity> map) {
        this.incomeResponse = map;
    }

    public final void setTotalAmount(@Nullable BigDecimal bigDecimal) {
        this.totalAmount = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "WelfareInfoEntity(totalAmount=" + this.totalAmount + ", incomeResponse=" + this.incomeResponse + ')';
    }

    public WelfareInfoEntity(@Nullable BigDecimal bigDecimal, @Nullable Map<String, WelfareDetailEntity> map) {
        this.totalAmount = bigDecimal;
        this.incomeResponse = map;
    }
}
