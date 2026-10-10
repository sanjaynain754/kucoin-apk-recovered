package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.R$color;
import com.sensorsdata.abtest.entity.AppConstants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DynamicsEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010(\u001a\u00020\nJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J°\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00107J\u0006\u00108\u001a\u00020\nJ\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020\nHÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001J\u0016\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0015\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017¨\u0006D"}, m90084d2 = {"Lcom/kubi/assets/entity/DynamicsEntity;", "Landroid/os/Parcelable;", "id", "", "amonut", "Ljava/math/BigDecimal;", "phrases", "status", "statusPhrases", "dynamicsType", "", "url", "buttonName", "type", "currencyInfo", "", "Lcom/kubi/assets/entity/CurrencyInfo;", FirebaseAnalytics.Param.CURRENCY, TtmlNode.TAG_STYLE, "typePhrases", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getAmonut", "()Ljava/math/BigDecimal;", "getPhrases", "getStatus", "getStatusPhrases", "getDynamicsType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUrl", "getButtonName", "getType", "getCurrencyInfo", "()Ljava/util/List;", "getCurrency", "getStyle", "getTypePhrases", "getStatusColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/assets/entity/DynamicsEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DynamicsEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DynamicsEntity> CREATOR = new Creator();

    @Nullable
    private final BigDecimal amonut;

    @Nullable
    private final String buttonName;

    @Nullable
    private final String currency;

    @Nullable
    private final List<CurrencyInfo> currencyInfo;

    @Nullable
    private final Integer dynamicsType;

    @Nullable
    private final String id;

    @Nullable
    private final String phrases;

    @Nullable
    private final String status;

    @Nullable
    private final String statusPhrases;

    @Nullable
    private final String style;

    @Nullable
    private final Integer type;

    @Nullable
    private final String typePhrases;

    @Nullable
    private final String url;

    /* JADX INFO: compiled from: DynamicsEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<DynamicsEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DynamicsEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(CurrencyInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new DynamicsEntity(string, bigDecimal, string2, string3, string4, numValueOf, string5, string6, numValueOf2, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DynamicsEntity[] newArray(int i11) {
            return new DynamicsEntity[i11];
        }
    }

    public DynamicsEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicsEntity)) {
            return false;
        }
        DynamicsEntity dynamicsEntity = (DynamicsEntity) other;
        return Intrinsics.areEqual(this.id, dynamicsEntity.id) && Intrinsics.areEqual(this.amonut, dynamicsEntity.amonut) && Intrinsics.areEqual(this.phrases, dynamicsEntity.phrases) && Intrinsics.areEqual(this.status, dynamicsEntity.status) && Intrinsics.areEqual(this.statusPhrases, dynamicsEntity.statusPhrases) && Intrinsics.areEqual(this.dynamicsType, dynamicsEntity.dynamicsType) && Intrinsics.areEqual(this.url, dynamicsEntity.url) && Intrinsics.areEqual(this.buttonName, dynamicsEntity.buttonName) && Intrinsics.areEqual(this.type, dynamicsEntity.type) && Intrinsics.areEqual(this.currencyInfo, dynamicsEntity.currencyInfo) && Intrinsics.areEqual(this.currency, dynamicsEntity.currency) && Intrinsics.areEqual(this.style, dynamicsEntity.style) && Intrinsics.areEqual(this.typePhrases, dynamicsEntity.typePhrases);
    }

    public DynamicsEntity(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable String str5, @Nullable String str6, @Nullable Integer num2, @Nullable List<CurrencyInfo> list, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.id = str;
        this.amonut = bigDecimal;
        this.phrases = str2;
        this.status = str3;
        this.statusPhrases = str4;
        this.dynamicsType = num;
        this.url = str5;
        this.buttonName = str6;
        this.type = num2;
        this.currencyInfo = list;
        this.currency = str7;
        this.style = str8;
        this.typePhrases = str9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DynamicsEntity copy$default(DynamicsEntity dynamicsEntity, String str, BigDecimal bigDecimal, String str2, String str3, String str4, Integer num, String str5, String str6, Integer num2, List list, String str7, String str8, String str9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dynamicsEntity.id;
        }
        return dynamicsEntity.copy(str, (i11 & 2) != 0 ? dynamicsEntity.amonut : bigDecimal, (i11 & 4) != 0 ? dynamicsEntity.phrases : str2, (i11 & 8) != 0 ? dynamicsEntity.status : str3, (i11 & 16) != 0 ? dynamicsEntity.statusPhrases : str4, (i11 & 32) != 0 ? dynamicsEntity.dynamicsType : num, (i11 & 64) != 0 ? dynamicsEntity.url : str5, (i11 & 128) != 0 ? dynamicsEntity.buttonName : str6, (i11 & 256) != 0 ? dynamicsEntity.type : num2, (i11 & 512) != 0 ? dynamicsEntity.currencyInfo : list, (i11 & 1024) != 0 ? dynamicsEntity.currency : str7, (i11 & 2048) != 0 ? dynamicsEntity.style : str8, (i11 & 4096) != 0 ? dynamicsEntity.typePhrases : str9);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final List<CurrencyInfo> component10() {
        return this.currencyInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTypePhrases() {
        return this.typePhrases;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getAmonut() {
        return this.amonut;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPhrases() {
        return this.phrases;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatusPhrases() {
        return this.statusPhrases;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getDynamicsType() {
        return this.dynamicsType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getButtonName() {
        return this.buttonName;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @NotNull
    public final DynamicsEntity copy(@Nullable String id2, @Nullable BigDecimal amonut, @Nullable String phrases, @Nullable String status, @Nullable String statusPhrases, @Nullable Integer dynamicsType, @Nullable String url, @Nullable String buttonName, @Nullable Integer type, @Nullable List<CurrencyInfo> currencyInfo, @Nullable String currency, @Nullable String style, @Nullable String typePhrases) {
        return new DynamicsEntity(id2, amonut, phrases, status, statusPhrases, dynamicsType, url, buttonName, type, currencyInfo, currency, style, typePhrases);
    }

    @Nullable
    public final BigDecimal getAmonut() {
        return this.amonut;
    }

    @Nullable
    public final String getButtonName() {
        return this.buttonName;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final List<CurrencyInfo> getCurrencyInfo() {
        return this.currencyInfo;
    }

    @Nullable
    public final Integer getDynamicsType() {
        return this.dynamicsType;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getPhrases() {
        return this.phrases;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r0.equals("TRM_MGT_REJECTED") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        if (r0.equals("FAILURE") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r0.equals("RISK_MGT_REJECTED") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        return com.kubi.assets.R$color.secondary;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if (r0.equals("WALLET_PROCESSING") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004a, code lost:
    
        return com.kubi.assets.R$color.complementary;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        if (r0.equals("PROCESSING") == false) goto L31;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int getStatusColor() {
        String str = this.status;
        if (str != null) {
            switch (str.hashCode()) {
                case -1320377575:
                    break;
                case -1149187101:
                    if (str.equals(AppConstants.AB_TEST_SUCCESS)) {
                        return R$color.brandGreen;
                    }
                    break;
                case -847645549:
                    break;
                case -368591510:
                    break;
                case 305498579:
                    break;
                case 907287315:
                    break;
            }
        }
        return R$color.c_text60;
    }

    @Nullable
    public final String getStatusPhrases() {
        return this.statusPhrases;
    }

    @Nullable
    public final String getStyle() {
        return this.style;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final String getTypePhrases() {
        return this.typePhrases;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.amonut;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.phrases;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.statusPhrases;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.dynamicsType;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.url;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.buttonName;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.type;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<CurrencyInfo> list = this.currencyInfo;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.currency;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.style;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.typePhrases;
        return iHashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DynamicsEntity(id=" + this.id + ", amonut=" + this.amonut + ", phrases=" + this.phrases + ", status=" + this.status + ", statusPhrases=" + this.statusPhrases + ", dynamicsType=" + this.dynamicsType + ", url=" + this.url + ", buttonName=" + this.buttonName + ", type=" + this.type + ", currencyInfo=" + this.currencyInfo + ", currency=" + this.currency + ", style=" + this.style + ", typePhrases=" + this.typePhrases + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeSerializable(this.amonut);
        dest.writeString(this.phrases);
        dest.writeString(this.status);
        dest.writeString(this.statusPhrases);
        Integer num = this.dynamicsType;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.url);
        dest.writeString(this.buttonName);
        Integer num2 = this.type;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        List<CurrencyInfo> list = this.currencyInfo;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<CurrencyInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.currency);
        dest.writeString(this.style);
        dest.writeString(this.typePhrases);
    }

    public /* synthetic */ DynamicsEntity(String str, BigDecimal bigDecimal, String str2, String str3, String str4, Integer num, String str5, String str6, Integer num2, List list, String str7, String str8, String str9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : num, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : num2, (i11 & 512) != 0 ? null : list, (i11 & 1024) != 0 ? null : str7, (i11 & 2048) != 0 ? null : str8, (i11 & 4096) != 0 ? null : str9);
    }
}
