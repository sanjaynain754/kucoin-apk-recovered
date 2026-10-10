package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OtcBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0006\u001a\u00020!J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¢\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010/J\u0006\u00100\u001a\u00020\u0005J\u0013\u00101\u001a\u00020!2\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u0005HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0004\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0006\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001e\u0010\u0015R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001f\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014¨\u0006;"}, m90084d2 = {"Lcom/kubi/otc/entity/PayTemplate;", "Landroid/os/Parcelable;", "key", "", "isRealName", "", "isRequired", "payTypeCode", "payTypeId", "selectValue", "", "sort", "tips", "value", "type", "riskWarnStatus", "riskWarnContent", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPayTypeCode", "getPayTypeId", "getSelectValue", "()Ljava/util/List;", "getSort", "getTips", "getValue", "getType", "getRiskWarnStatus", "getRiskWarnContent", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/kubi/otc/entity/PayTemplate;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PayTemplate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PayTemplate> CREATOR = new Creator();

    @Nullable
    private final Integer isRealName;

    @Nullable
    private final Integer isRequired;

    @NotNull
    private final String key;

    @Nullable
    private final String payTypeCode;

    @Nullable
    private final String payTypeId;

    @SerializedName("riskWarnContent")
    @Nullable
    private final String riskWarnContent;

    @SerializedName("riskWarnStatus")
    @Nullable
    private final Integer riskWarnStatus;

    @Nullable
    private final List<String> selectValue;

    @Nullable
    private final Integer sort;

    @Nullable
    private final String tips;

    @Nullable
    private final Integer type;

    @Nullable
    private final String value;

    /* JADX INFO: compiled from: OtcBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<PayTemplate> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PayTemplate createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PayTemplate(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PayTemplate[] newArray(int i11) {
            return new PayTemplate[i11];
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
        if (!(other instanceof PayTemplate)) {
            return false;
        }
        PayTemplate payTemplate = (PayTemplate) other;
        return Intrinsics.areEqual(this.key, payTemplate.key) && Intrinsics.areEqual(this.isRealName, payTemplate.isRealName) && Intrinsics.areEqual(this.isRequired, payTemplate.isRequired) && Intrinsics.areEqual(this.payTypeCode, payTemplate.payTypeCode) && Intrinsics.areEqual(this.payTypeId, payTemplate.payTypeId) && Intrinsics.areEqual(this.selectValue, payTemplate.selectValue) && Intrinsics.areEqual(this.sort, payTemplate.sort) && Intrinsics.areEqual(this.tips, payTemplate.tips) && Intrinsics.areEqual(this.value, payTemplate.value) && Intrinsics.areEqual(this.type, payTemplate.type) && Intrinsics.areEqual(this.riskWarnStatus, payTemplate.riskWarnStatus) && Intrinsics.areEqual(this.riskWarnContent, payTemplate.riskWarnContent);
    }

    @Nullable
    public final Integer isRequired() {
        return this.isRequired;
    }

    public PayTemplate(@NotNull String key, @Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable Integer num3, @Nullable String str3, @Nullable String str4, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
        this.isRealName = num;
        this.isRequired = num2;
        this.payTypeCode = str;
        this.payTypeId = str2;
        this.selectValue = list;
        this.sort = num3;
        this.tips = str3;
        this.value = str4;
        this.type = num4;
        this.riskWarnStatus = num5;
        this.riskWarnContent = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PayTemplate copy$default(PayTemplate payTemplate, String str, Integer num, Integer num2, String str2, String str3, List list, Integer num3, String str4, String str5, Integer num4, Integer num5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = payTemplate.key;
        }
        if ((i11 & 2) != 0) {
            num = payTemplate.isRealName;
        }
        if ((i11 & 4) != 0) {
            num2 = payTemplate.isRequired;
        }
        if ((i11 & 8) != 0) {
            str2 = payTemplate.payTypeCode;
        }
        if ((i11 & 16) != 0) {
            str3 = payTemplate.payTypeId;
        }
        if ((i11 & 32) != 0) {
            list = payTemplate.selectValue;
        }
        if ((i11 & 64) != 0) {
            num3 = payTemplate.sort;
        }
        if ((i11 & 128) != 0) {
            str4 = payTemplate.tips;
        }
        if ((i11 & 256) != 0) {
            str5 = payTemplate.value;
        }
        if ((i11 & 512) != 0) {
            num4 = payTemplate.type;
        }
        if ((i11 & 1024) != 0) {
            num5 = payTemplate.riskWarnStatus;
        }
        if ((i11 & 2048) != 0) {
            str6 = payTemplate.riskWarnContent;
        }
        Integer num6 = num5;
        String str7 = str6;
        String str8 = str5;
        Integer num7 = num4;
        Integer num8 = num3;
        String str9 = str4;
        String str10 = str3;
        List list2 = list;
        return payTemplate.copy(str, num, num2, str2, str10, list2, num8, str9, str8, num7, num6, str7);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getRiskWarnStatus() {
        return this.riskWarnStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRiskWarnContent() {
        return this.riskWarnContent;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getIsRealName() {
        return this.isRealName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getIsRequired() {
        return this.isRequired;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPayTypeCode() {
        return this.payTypeCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPayTypeId() {
        return this.payTypeId;
    }

    @Nullable
    public final List<String> component6() {
        return this.selectValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getSort() {
        return this.sort;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final PayTemplate copy(@NotNull String key, @Nullable Integer isRealName, @Nullable Integer isRequired, @Nullable String payTypeCode, @Nullable String payTypeId, @Nullable List<String> selectValue, @Nullable Integer sort, @Nullable String tips, @Nullable String value, @Nullable Integer type, @Nullable Integer riskWarnStatus, @Nullable String riskWarnContent) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new PayTemplate(key, isRealName, isRequired, payTypeCode, payTypeId, selectValue, sort, tips, value, type, riskWarnStatus, riskWarnContent);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getPayTypeCode() {
        return this.payTypeCode;
    }

    @Nullable
    public final String getPayTypeId() {
        return this.payTypeId;
    }

    @Nullable
    public final String getRiskWarnContent() {
        return this.riskWarnContent;
    }

    @Nullable
    public final Integer getRiskWarnStatus() {
        return this.riskWarnStatus;
    }

    @Nullable
    public final List<String> getSelectValue() {
        return this.selectValue;
    }

    @Nullable
    public final Integer getSort() {
        return this.sort;
    }

    @Nullable
    public final String getTips() {
        return this.tips;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        Integer num = this.isRealName;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.isRequired;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.payTypeCode;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.payTypeId;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.selectValue;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.sort;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.tips;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.value;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.type;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.riskWarnStatus;
        int iHashCode11 = (iHashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str5 = this.riskWarnContent;
        return iHashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    @Nullable
    public final Integer isRealName() {
        return this.isRealName;
    }

    /* JADX INFO: renamed from: isRequired, reason: collision with other method in class */
    public final boolean m103796isRequired() {
        Integer num = this.isRequired;
        return num != null && num.intValue() == 1;
    }

    @NotNull
    public String toString() {
        return "PayTemplate(key=" + this.key + ", isRealName=" + this.isRealName + ", isRequired=" + this.isRequired + ", payTypeCode=" + this.payTypeCode + ", payTypeId=" + this.payTypeId + ", selectValue=" + this.selectValue + ", sort=" + this.sort + ", tips=" + this.tips + ", value=" + this.value + ", type=" + this.type + ", riskWarnStatus=" + this.riskWarnStatus + ", riskWarnContent=" + this.riskWarnContent + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.key);
        Integer num = this.isRealName;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.isRequired;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.payTypeCode);
        dest.writeString(this.payTypeId);
        dest.writeStringList(this.selectValue);
        Integer num3 = this.sort;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        dest.writeString(this.tips);
        dest.writeString(this.value);
        Integer num4 = this.type;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
        Integer num5 = this.riskWarnStatus;
        if (num5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num5.intValue());
        }
        dest.writeString(this.riskWarnContent);
    }
}
