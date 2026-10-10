package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AlertEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 V2\u00020\u00012\u00020\u0002:\u0001VB\u0089\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u00109\u001a\u00020\u0007H\u0016J\u0006\u0010:\u001a\u00020\u0010J\u000e\u0010'\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0010J\u000b\u0010=\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010@\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010B\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010E\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\t\u0010F\u001a\u00020\u0010HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ¨\u0001\u0010J\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010KJ\u0006\u0010L\u001a\u00020\u0007J\u0013\u0010M\u001a\u00020\u00102\b\u0010N\u001a\u0004\u0018\u00010OHÖ\u0003J\t\u0010P\u001a\u00020\u0007HÖ\u0001J\t\u0010Q\u001a\u00020\u0004HÖ\u0001J\u0016\u0010R\u001a\u00020;2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u001e\u0010\r\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u00100\"\u0004\b1\u00102R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0017\"\u0004\b4\u0010\u0019R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0017\"\u0004\b6\u0010\u0019R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b7\u0010\u001d\"\u0004\b8\u0010\u001f¨\u0006W"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/AlertEntity;", "Landroid/os/Parcelable;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "requestId", "", "id", "noticeType", "", "quoteCurrencyPrice", "", "status", "symbol", "userId", "warnAmount", "warnType", "isEditing", "", "checkPeriod", "threshold", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getRequestId", "()Ljava/lang/String;", "setRequestId", "(Ljava/lang/String;)V", "getId", "setId", "getNoticeType", "()Ljava/lang/Integer;", "setNoticeType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getQuoteCurrencyPrice", "()Ljava/lang/Double;", "setQuoteCurrencyPrice", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getStatus", "setStatus", "getSymbol", "setSymbol", "getUserId", "setUserId", "getWarnAmount", "setWarnAmount", "getWarnType", "setWarnType", "()Z", "setEditing", "(Z)V", "getCheckPeriod", "setCheckPeriod", "getThreshold", "setThreshold", "getType", "setType", "getItemType", "isOpenStatus", "", "isOpen", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/quotefacade/entity/AlertEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AlertEntity implements Parcelable, MultiItemEntity {
    public static final int TYPE_AMPLITUDE = 2;
    public static final int TYPE_EDIT = 2;
    public static final int TYPE_NORMAL = 1;
    public static final int TYPE_PRICE = 1;
    public static final int TYPE_PRICE_DOWN = 1;
    public static final int TYPE_PRICE_UP = 0;

    @Nullable
    private String checkPeriod;

    @Nullable
    private String id;
    private boolean isEditing;

    @Nullable
    private Integer noticeType;

    @Nullable
    private Double quoteCurrencyPrice;

    @Nullable
    private String requestId;

    @Nullable
    private Integer status;

    @Nullable
    private String symbol;

    @Nullable
    private String threshold;

    @Nullable
    private Integer type;

    @Nullable
    private String userId;

    @Nullable
    private Double warnAmount;

    @Nullable
    private Integer warnType;

    @NotNull
    public static final Parcelable.Creator<AlertEntity> CREATOR = new C21859a();

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.AlertEntity$a */
    /* JADX INFO: compiled from: AlertEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21859a implements Parcelable.Creator<AlertEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AlertEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AlertEntity(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AlertEntity[] newArray(int i11) {
            return new AlertEntity[i11];
        }
    }

    public AlertEntity(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Double d11, @Nullable Integer num2, @Nullable String str3, @Nullable String str4, @Nullable Double d12, @Nullable Integer num3, boolean z11, @Nullable String str5, @Nullable String str6, @Nullable Integer num4) {
        this.requestId = str;
        this.id = str2;
        this.noticeType = num;
        this.quoteCurrencyPrice = d11;
        this.status = num2;
        this.symbol = str3;
        this.userId = str4;
        this.warnAmount = d12;
        this.warnType = num3;
        this.isEditing = z11;
        this.checkPeriod = str5;
        this.threshold = str6;
        this.type = num4;
    }

    public static /* synthetic */ AlertEntity copy$default(AlertEntity alertEntity, String str, String str2, Integer num, Double d11, Integer num2, String str3, String str4, Double d12, Integer num3, boolean z11, String str5, String str6, Integer num4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = alertEntity.requestId;
        }
        return alertEntity.copy(str, (i11 & 2) != 0 ? alertEntity.id : str2, (i11 & 4) != 0 ? alertEntity.noticeType : num, (i11 & 8) != 0 ? alertEntity.quoteCurrencyPrice : d11, (i11 & 16) != 0 ? alertEntity.status : num2, (i11 & 32) != 0 ? alertEntity.symbol : str3, (i11 & 64) != 0 ? alertEntity.userId : str4, (i11 & 128) != 0 ? alertEntity.warnAmount : d12, (i11 & 256) != 0 ? alertEntity.warnType : num3, (i11 & 512) != 0 ? alertEntity.isEditing : z11, (i11 & 1024) != 0 ? alertEntity.checkPeriod : str5, (i11 & 2048) != 0 ? alertEntity.threshold : str6, (i11 & 4096) != 0 ? alertEntity.type : num4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertEntity)) {
            return false;
        }
        AlertEntity alertEntity = (AlertEntity) other;
        return Intrinsics.areEqual(this.requestId, alertEntity.requestId) && Intrinsics.areEqual(this.id, alertEntity.id) && Intrinsics.areEqual(this.noticeType, alertEntity.noticeType) && Intrinsics.areEqual((Object) this.quoteCurrencyPrice, (Object) alertEntity.quoteCurrencyPrice) && Intrinsics.areEqual(this.status, alertEntity.status) && Intrinsics.areEqual(this.symbol, alertEntity.symbol) && Intrinsics.areEqual(this.userId, alertEntity.userId) && Intrinsics.areEqual((Object) this.warnAmount, (Object) alertEntity.warnAmount) && Intrinsics.areEqual(this.warnType, alertEntity.warnType) && this.isEditing == alertEntity.isEditing && Intrinsics.areEqual(this.checkPeriod, alertEntity.checkPeriod) && Intrinsics.areEqual(this.threshold, alertEntity.threshold) && Intrinsics.areEqual(this.type, alertEntity.type);
    }

    public final void setStatus(@Nullable Integer num) {
        this.status = num;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsEditing() {
        return this.isEditing;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCheckPeriod() {
        return this.checkPeriod;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getThreshold() {
        return this.threshold;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getNoticeType() {
        return this.noticeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getQuoteCurrencyPrice() {
        return this.quoteCurrencyPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getWarnAmount() {
        return this.warnAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getWarnType() {
        return this.warnType;
    }

    @NotNull
    public final AlertEntity copy(@Nullable String requestId, @Nullable String id2, @Nullable Integer noticeType, @Nullable Double quoteCurrencyPrice, @Nullable Integer status, @Nullable String symbol, @Nullable String userId, @Nullable Double warnAmount, @Nullable Integer warnType, boolean isEditing, @Nullable String checkPeriod, @Nullable String threshold, @Nullable Integer type) {
        return new AlertEntity(requestId, id2, noticeType, quoteCurrencyPrice, status, symbol, userId, warnAmount, warnType, isEditing, checkPeriod, threshold, type);
    }

    @Nullable
    public final String getCheckPeriod() {
        return this.checkPeriod;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF17248b() {
        return this.isEditing ? 2 : 1;
    }

    @Nullable
    public final Integer getNoticeType() {
        return this.noticeType;
    }

    @Nullable
    public final Double getQuoteCurrencyPrice() {
        return this.quoteCurrencyPrice;
    }

    @Nullable
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getThreshold() {
        return this.threshold;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    public final Double getWarnAmount() {
        return this.warnAmount;
    }

    @Nullable
    public final Integer getWarnType() {
        return this.warnType;
    }

    public int hashCode() {
        String str = this.requestId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.noticeType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Double d11 = this.quoteCurrencyPrice;
        int iHashCode4 = (iHashCode3 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Integer num2 = this.status;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.symbol;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.userId;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d12 = this.warnAmount;
        int iHashCode8 = (iHashCode7 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Integer num3 = this.warnType;
        int iHashCode9 = (((iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31) + Boolean.hashCode(this.isEditing)) * 31;
        String str5 = this.checkPeriod;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.threshold;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num4 = this.type;
        return iHashCode11 + (num4 != null ? num4.hashCode() : 0);
    }

    public final boolean isEditing() {
        return this.isEditing;
    }

    public final boolean isOpenStatus() {
        Integer num = this.status;
        return num != null && num.intValue() == 1;
    }

    public final void setCheckPeriod(@Nullable String str) {
        this.checkPeriod = str;
    }

    public final void setEditing(boolean z11) {
        this.isEditing = z11;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setNoticeType(@Nullable Integer num) {
        this.noticeType = num;
    }

    public final void setQuoteCurrencyPrice(@Nullable Double d11) {
        this.quoteCurrencyPrice = d11;
    }

    public final void setRequestId(@Nullable String str) {
        this.requestId = str;
    }

    public final void setStatus(boolean isOpen) {
        this.status = Integer.valueOf(isOpen ? 1 : 0);
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setThreshold(@Nullable String str) {
        this.threshold = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }

    public final void setWarnAmount(@Nullable Double d11) {
        this.warnAmount = d11;
    }

    public final void setWarnType(@Nullable Integer num) {
        this.warnType = num;
    }

    @NotNull
    public String toString() {
        return "AlertEntity(requestId=" + this.requestId + ", id=" + this.id + ", noticeType=" + this.noticeType + ", quoteCurrencyPrice=" + this.quoteCurrencyPrice + ", status=" + this.status + ", symbol=" + this.symbol + ", userId=" + this.userId + ", warnAmount=" + this.warnAmount + ", warnType=" + this.warnType + ", isEditing=" + this.isEditing + ", checkPeriod=" + this.checkPeriod + ", threshold=" + this.threshold + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.requestId);
        dest.writeString(this.id);
        Integer num = this.noticeType;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Double d11 = this.quoteCurrencyPrice;
        if (d11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d11.doubleValue());
        }
        Integer num2 = this.status;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.symbol);
        dest.writeString(this.userId);
        Double d12 = this.warnAmount;
        if (d12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d12.doubleValue());
        }
        Integer num3 = this.warnType;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        dest.writeInt(this.isEditing ? 1 : 0);
        dest.writeString(this.checkPeriod);
        dest.writeString(this.threshold);
        Integer num4 = this.type;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
    }

    public /* synthetic */ AlertEntity(String str, String str2, Integer num, Double d11, Integer num2, String str3, String str4, Double d12, Integer num3, boolean z11, String str5, String str6, Integer num4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num, d11, num2, str3, str4, d12, num3, (i11 & 512) != 0 ? false : z11, str5, str6, num4);
    }
}
