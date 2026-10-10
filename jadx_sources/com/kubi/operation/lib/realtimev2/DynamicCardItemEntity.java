package com.kubi.operation.lib.realtimev2;

import androidx.annotation.Keep;
import com.kubi.home.realtime.IRealTimeData;
import com.kubi.home.realtime.RealTimeViewType;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.sdk.util.TimeSyncManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: DynamicCardEntity.kt */
/* JADX INFO: loaded from: classes32.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\b\u00108\u001a\u00020\u0003H\u0016J\u0006\u00109\u001a\u00020:J\u0006\u0010;\u001a\u00020\u000eJ\b\u0010<\u001a\u0004\u0018\u00010\u0003J\b\u0010=\u001a\u0004\u0018\u00010\u0003J\b\u0010>\u001a\u0004\u0018\u00010\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÚ\u0001\u0010P\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010QJ\u0013\u0010R\u001a\u00020:2\b\u0010S\u001a\u0004\u0018\u00010THÖ\u0003J\t\u0010U\u001a\u00020\u0007HÖ\u0001J\t\u0010V\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0019R\u0014\u0010.\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0019R\u0014\u00100\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u00104\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0019R\u0016\u00106\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0019¨\u0006W"}, m90084d2 = {"Lcom/kubi/operation/lib/realtimev2/DynamicCardItemEntity;", "Lcom/kubi/home/realtime/IRealTimeData;", "bizType", "", "bizStatus", "cardName", "sort", "", "bizId", TUIConstants.TUIChat.INPUT_MORE_ICON, "iconDark", "title", "subTitle", "countDownTime", "", "cardUrl", "btnTxt", "btnUrl", "btnColor", "btnColorDark", "btnBgColor", "btnBgColorDark", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBizType", "()Ljava/lang/String;", "getBizStatus", "getCardName", "getSort", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBizId", "getIcon", "getIconDark", "getTitle", "getSubTitle", "getCountDownTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCardUrl", "getBtnTxt", "getBtnUrl", "getBtnColor", "getBtnColorDark", "getBtnBgColor", "getBtnBgColorDark", "businessId", "getBusinessId", "viewType", "Lcom/kubi/home/realtime/RealTimeViewType;", "getViewType", "()Lcom/kubi/home/realtime/RealTimeViewType;", "viewTypeV2", "getViewTypeV2", "reportStatus", "getReportStatus", "getUniqueId", "isCountDown", "", "getCountDownSeconds", "showIcon", "getShowBtnBgColor", "getShowBtnColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/operation/lib/realtimev2/DynamicCardItemEntity;", "equals", "other", "", "hashCode", "toString", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DynamicCardItemEntity extends IRealTimeData {

    @Nullable
    private final String bizId;

    @Nullable
    private final String bizStatus;

    @Nullable
    private final String bizType;

    @Nullable
    private final String btnBgColor;

    @Nullable
    private final String btnBgColorDark;

    @Nullable
    private final String btnColor;

    @Nullable
    private final String btnColorDark;

    @Nullable
    private final String btnTxt;

    @Nullable
    private final String btnUrl;

    @Nullable
    private final String cardName;

    @Nullable
    private final String cardUrl;

    @Nullable
    private final Long countDownTime;

    @Nullable
    private final String icon;

    @Nullable
    private final String iconDark;

    @Nullable
    private final Integer sort;

    @Nullable
    private final String subTitle;

    @Nullable
    private final String title;

    public DynamicCardItemEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public static /* synthetic */ DynamicCardItemEntity copy$default(DynamicCardItemEntity dynamicCardItemEntity, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, Long l11, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i11, Object obj) {
        String str16;
        String str17;
        String str18 = (i11 & 1) != 0 ? dynamicCardItemEntity.bizType : str;
        String str19 = (i11 & 2) != 0 ? dynamicCardItemEntity.bizStatus : str2;
        String str20 = (i11 & 4) != 0 ? dynamicCardItemEntity.cardName : str3;
        Integer num2 = (i11 & 8) != 0 ? dynamicCardItemEntity.sort : num;
        String str21 = (i11 & 16) != 0 ? dynamicCardItemEntity.bizId : str4;
        String str22 = (i11 & 32) != 0 ? dynamicCardItemEntity.icon : str5;
        String str23 = (i11 & 64) != 0 ? dynamicCardItemEntity.iconDark : str6;
        String str24 = (i11 & 128) != 0 ? dynamicCardItemEntity.title : str7;
        String str25 = (i11 & 256) != 0 ? dynamicCardItemEntity.subTitle : str8;
        Long l12 = (i11 & 512) != 0 ? dynamicCardItemEntity.countDownTime : l11;
        String str26 = (i11 & 1024) != 0 ? dynamicCardItemEntity.cardUrl : str9;
        String str27 = (i11 & 2048) != 0 ? dynamicCardItemEntity.btnTxt : str10;
        String str28 = (i11 & 4096) != 0 ? dynamicCardItemEntity.btnUrl : str11;
        String str29 = (i11 & 8192) != 0 ? dynamicCardItemEntity.btnColor : str12;
        String str30 = str18;
        String str31 = (i11 & 16384) != 0 ? dynamicCardItemEntity.btnColorDark : str13;
        String str32 = (i11 & 32768) != 0 ? dynamicCardItemEntity.btnBgColor : str14;
        if ((i11 & 65536) != 0) {
            str17 = str32;
            str16 = dynamicCardItemEntity.btnBgColorDark;
        } else {
            str16 = str15;
            str17 = str32;
        }
        return dynamicCardItemEntity.copy(str30, str19, str20, num2, str21, str22, str23, str24, str25, l12, str26, str27, str28, str29, str31, str17, str16);
    }

    @NotNull
    public final DynamicCardItemEntity copy(@Nullable String bizType, @Nullable String bizStatus, @Nullable String cardName, @Nullable Integer sort, @Nullable String bizId, @Nullable String icon, @Nullable String iconDark, @Nullable String title, @Nullable String subTitle, @Nullable Long countDownTime, @Nullable String cardUrl, @Nullable String btnTxt, @Nullable String btnUrl, @Nullable String btnColor, @Nullable String btnColorDark, @Nullable String btnBgColor, @Nullable String btnBgColorDark) {
        return new DynamicCardItemEntity(bizType, bizStatus, cardName, sort, bizId, icon, iconDark, title, subTitle, countDownTime, cardUrl, btnTxt, btnUrl, btnColor, btnColorDark, btnBgColor, btnBgColorDark);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicCardItemEntity)) {
            return false;
        }
        DynamicCardItemEntity dynamicCardItemEntity = (DynamicCardItemEntity) other;
        return Intrinsics.areEqual(this.bizType, dynamicCardItemEntity.bizType) && Intrinsics.areEqual(this.bizStatus, dynamicCardItemEntity.bizStatus) && Intrinsics.areEqual(this.cardName, dynamicCardItemEntity.cardName) && Intrinsics.areEqual(this.sort, dynamicCardItemEntity.sort) && Intrinsics.areEqual(this.bizId, dynamicCardItemEntity.bizId) && Intrinsics.areEqual(this.icon, dynamicCardItemEntity.icon) && Intrinsics.areEqual(this.iconDark, dynamicCardItemEntity.iconDark) && Intrinsics.areEqual(this.title, dynamicCardItemEntity.title) && Intrinsics.areEqual(this.subTitle, dynamicCardItemEntity.subTitle) && Intrinsics.areEqual(this.countDownTime, dynamicCardItemEntity.countDownTime) && Intrinsics.areEqual(this.cardUrl, dynamicCardItemEntity.cardUrl) && Intrinsics.areEqual(this.btnTxt, dynamicCardItemEntity.btnTxt) && Intrinsics.areEqual(this.btnUrl, dynamicCardItemEntity.btnUrl) && Intrinsics.areEqual(this.btnColor, dynamicCardItemEntity.btnColor) && Intrinsics.areEqual(this.btnColorDark, dynamicCardItemEntity.btnColorDark) && Intrinsics.areEqual(this.btnBgColor, dynamicCardItemEntity.btnBgColor) && Intrinsics.areEqual(this.btnBgColorDark, dynamicCardItemEntity.btnBgColorDark);
    }

    public int hashCode() {
        String str = this.bizType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bizStatus;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.sort;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.bizId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.icon;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.iconDark;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.title;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.subTitle;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l11 = this.countDownTime;
        int iHashCode10 = (iHashCode9 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str9 = this.cardUrl;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.btnTxt;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.btnUrl;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.btnColor;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.btnColorDark;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.btnBgColor;
        int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.btnBgColorDark;
        return iHashCode16 + (str15 != null ? str15.hashCode() : 0);
    }

    public /* synthetic */ DynamicCardItemEntity(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, Long l11, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : str8, (i11 & 512) != 0 ? null : l11, (i11 & 1024) != 0 ? null : str9, (i11 & 2048) != 0 ? null : str10, (i11 & 4096) != 0 ? null : str11, (i11 & 8192) != 0 ? null : str12, (i11 & 16384) != 0 ? null : str13, (i11 & 32768) != 0 ? null : str14, (i11 & 65536) != 0 ? null : str15);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBizType() {
        return this.bizType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getCountDownTime() {
        return this.countDownTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCardUrl() {
        return this.cardUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBtnTxt() {
        return this.btnTxt;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getBtnUrl() {
        return this.btnUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getBtnColor() {
        return this.btnColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getBtnColorDark() {
        return this.btnColorDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getBtnBgColor() {
        return this.btnBgColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getBtnBgColorDark() {
        return this.btnBgColorDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBizStatus() {
        return this.bizStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getSort() {
        return this.sort;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBizId() {
        return this.bizId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIconDark() {
        return this.iconDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final String getBizId() {
        return this.bizId;
    }

    @Nullable
    public final String getBizStatus() {
        return this.bizStatus;
    }

    @Nullable
    public final String getBizType() {
        return this.bizType;
    }

    @Nullable
    public final String getBtnBgColor() {
        return this.btnBgColor;
    }

    @Nullable
    public final String getBtnBgColorDark() {
        return this.btnBgColorDark;
    }

    @Nullable
    public final String getBtnColor() {
        return this.btnColor;
    }

    @Nullable
    public final String getBtnColorDark() {
        return this.btnColorDark;
    }

    @Nullable
    public final String getBtnTxt() {
        return this.btnTxt;
    }

    @Nullable
    public final String getBtnUrl() {
        return this.btnUrl;
    }

    @Override // com.kubi.home.realtime.IRealTimeData
    @NotNull
    public String getBusinessId() {
        String str = this.bizId;
        return str == null ? "" : str;
    }

    @Nullable
    public final String getCardName() {
        return this.cardName;
    }

    @Nullable
    public final String getCardUrl() {
        return this.cardUrl;
    }

    @Nullable
    public final Long getCountDownTime() {
        return this.countDownTime;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getIconDark() {
        return this.iconDark;
    }

    @Override // com.kubi.home.realtime.IRealTimeData
    @Nullable
    public String getReportStatus() {
        return this.bizStatus;
    }

    @Nullable
    public final String getShowBtnBgColor() {
        return DayNightThemeManager.f28592a.m33187l() ? this.btnBgColor : this.btnBgColorDark;
    }

    @Nullable
    public final String getShowBtnColor() {
        return DayNightThemeManager.f28592a.m33187l() ? this.btnColor : this.btnColorDark;
    }

    @Nullable
    public final Integer getSort() {
        return this.sort;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Override // com.kubi.home.realtime.IRealTimeData
    @NotNull
    public String getUniqueId() {
        return RealTimeViewType.COMMON.getTypeName() + '_' + this.bizId + '_' + this.bizType;
    }

    @Override // com.kubi.home.realtime.IRealTimeData
    @NotNull
    public RealTimeViewType getViewType() {
        return RealTimeViewType.COMMON;
    }

    @Override // com.kubi.home.realtime.IRealTimeData
    @Nullable
    public String getViewTypeV2() {
        return this.cardName;
    }

    public final boolean isCountDown() {
        Long l11 = this.countDownTime;
        return (l11 != null ? l11.longValue() : 0L) > TimeSyncManager.f48123a.m58366p();
    }

    @Nullable
    public final String showIcon() {
        return DayNightThemeManager.f28592a.m33187l() ? this.icon : this.iconDark;
    }

    @NotNull
    public String toString() {
        return "DynamicCardItemEntity(bizType=" + this.bizType + ", bizStatus=" + this.bizStatus + ", cardName=" + this.cardName + ", sort=" + this.sort + ", bizId=" + this.bizId + ", icon=" + this.icon + ", iconDark=" + this.iconDark + ", title=" + this.title + ", subTitle=" + this.subTitle + ", countDownTime=" + this.countDownTime + ", cardUrl=" + this.cardUrl + ", btnTxt=" + this.btnTxt + ", btnUrl=" + this.btnUrl + ", btnColor=" + this.btnColor + ", btnColorDark=" + this.btnColorDark + ", btnBgColor=" + this.btnBgColor + ", btnBgColorDark=" + this.btnBgColorDark + ')';
    }

    public DynamicCardItemEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Long l11, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15) {
        this.bizType = str;
        this.bizStatus = str2;
        this.cardName = str3;
        this.sort = num;
        this.bizId = str4;
        this.icon = str5;
        this.iconDark = str6;
        this.title = str7;
        this.subTitle = str8;
        this.countDownTime = l11;
        this.cardUrl = str9;
        this.btnTxt = str10;
        this.btnUrl = str11;
        this.btnColor = str12;
        this.btnColorDark = str13;
        this.btnBgColor = str14;
        this.btnBgColorDark = str15;
    }

    public final long getCountDownSeconds() {
        long jLongValue;
        if (!isCountDown()) {
            return 0L;
        }
        Long l11 = this.countDownTime;
        if (l11 != null) {
            jLongValue = l11.longValue();
        } else {
            jLongValue = 0;
        }
        return RangesKt.coerceAtLeast(0L, jLongValue - TimeSyncManager.f48123a.m58366p()) / ((long) 1000);
    }
}
