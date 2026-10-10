package com.kubi.operation.lib.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NewUserStatusInfoEntity.kt */
/* JADX INFO: loaded from: classes32.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\bG\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010<\u001a\u0004\u0018\u00010\u0003J\b\u0010=\u001a\u0004\u0018\u00010\u0003J\b\u0010>\u001a\u0004\u0018\u00010\u0003J\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006J\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u00102J\u0010\u0010P\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u00102J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jº\u0002\u0010X\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010YJ\u0006\u0010Z\u001a\u00020\rJ\u0013\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010^HÖ\u0003J\t\u0010_\u001a\u00020\rHÖ\u0001J\t\u0010`\u001a\u00020\u0003HÖ\u0001J\u0016\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u00103\u001a\u0004\b4\u00102R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010 R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010 R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010 ¨\u0006f"}, m90084d2 = {"Lcom/kubi/operation/lib/entity/CommonCardInfo;", "Landroid/os/Parcelable;", "bizType", "", "cardName", "cardColorArray", "", "cardColorDarkArray", "tagColorArray", "tagColorDarkArray", "cardBottomUrl", "cardBottomUrlDark", "sort", "", "bizId", "title", "subTitle", TUIConstants.TUIChat.INPUT_MORE_ICON, "currencyName", "countDownSeconds", "", "countDownTime", "btnTxt", "btnColor", "btnColorDark", "btnBgColor", "btnBgColorDark", "btnUrl", "cardUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBizType", "()Ljava/lang/String;", "getCardName", "getCardColorArray", "()Ljava/util/List;", "getCardColorDarkArray", "getTagColorArray", "getTagColorDarkArray", "getCardBottomUrl", "getCardBottomUrlDark", "getSort", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBizId", "getTitle", "getSubTitle", "getIcon", "getCurrencyName", "getCountDownSeconds", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCountDownTime", "getBtnTxt", "getBtnColor", "getBtnColorDark", "getBtnBgColor", "getBtnBgColorDark", "getBtnUrl", "getCardUrl", "showCardBottomUrl", "showBtnColor", "showBtnBgColor", "showCardBg", "showTagBg", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/operation/lib/entity/CommonCardInfo;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CommonCardInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CommonCardInfo> CREATOR = new C19506a();

    @Nullable
    private final String bizId;

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
    private final String cardBottomUrl;

    @Nullable
    private final String cardBottomUrlDark;

    @Nullable
    private final List<String> cardColorArray;

    @Nullable
    private final List<String> cardColorDarkArray;

    @Nullable
    private final String cardName;

    @Nullable
    private final String cardUrl;

    @Nullable
    private final Long countDownSeconds;

    @Nullable
    private final Long countDownTime;

    @Nullable
    private final String currencyName;

    @Nullable
    private final String icon;

    @Nullable
    private final Integer sort;

    @Nullable
    private final String subTitle;

    @Nullable
    private final List<String> tagColorArray;

    @Nullable
    private final List<String> tagColorDarkArray;

    @Nullable
    private final String title;

    /* JADX INFO: renamed from: com.kubi.operation.lib.entity.CommonCardInfo$a */
    /* JADX INFO: compiled from: NewUserStatusInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19506a implements Parcelable.Creator<CommonCardInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CommonCardInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CommonCardInfo(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CommonCardInfo[] newArray(int i11) {
            return new CommonCardInfo[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommonCardInfo copy$default(CommonCardInfo commonCardInfo, String str, String str2, List list, List list2, List list3, List list4, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, String str9, Long l11, Long l12, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i11, Object obj) {
        String str17;
        String str18;
        String str19 = (i11 & 1) != 0 ? commonCardInfo.bizType : str;
        String str20 = (i11 & 2) != 0 ? commonCardInfo.cardName : str2;
        List list5 = (i11 & 4) != 0 ? commonCardInfo.cardColorArray : list;
        List list6 = (i11 & 8) != 0 ? commonCardInfo.cardColorDarkArray : list2;
        List list7 = (i11 & 16) != 0 ? commonCardInfo.tagColorArray : list3;
        List list8 = (i11 & 32) != 0 ? commonCardInfo.tagColorDarkArray : list4;
        String str21 = (i11 & 64) != 0 ? commonCardInfo.cardBottomUrl : str3;
        String str22 = (i11 & 128) != 0 ? commonCardInfo.cardBottomUrlDark : str4;
        Integer num2 = (i11 & 256) != 0 ? commonCardInfo.sort : num;
        String str23 = (i11 & 512) != 0 ? commonCardInfo.bizId : str5;
        String str24 = (i11 & 1024) != 0 ? commonCardInfo.title : str6;
        String str25 = (i11 & 2048) != 0 ? commonCardInfo.subTitle : str7;
        String str26 = (i11 & 4096) != 0 ? commonCardInfo.icon : str8;
        String str27 = (i11 & 8192) != 0 ? commonCardInfo.currencyName : str9;
        String str28 = str19;
        Long l13 = (i11 & 16384) != 0 ? commonCardInfo.countDownSeconds : l11;
        Long l14 = (i11 & 32768) != 0 ? commonCardInfo.countDownTime : l12;
        String str29 = (i11 & 65536) != 0 ? commonCardInfo.btnTxt : str10;
        String str30 = (i11 & 131072) != 0 ? commonCardInfo.btnColor : str11;
        String str31 = (i11 & 262144) != 0 ? commonCardInfo.btnColorDark : str12;
        String str32 = (i11 & 524288) != 0 ? commonCardInfo.btnBgColor : str13;
        String str33 = (i11 & 1048576) != 0 ? commonCardInfo.btnBgColorDark : str14;
        String str34 = (i11 & 2097152) != 0 ? commonCardInfo.btnUrl : str15;
        if ((i11 & 4194304) != 0) {
            str18 = str34;
            str17 = commonCardInfo.cardUrl;
        } else {
            str17 = str16;
            str18 = str34;
        }
        return commonCardInfo.copy(str28, str20, list5, list6, list7, list8, str21, str22, num2, str23, str24, str25, str26, str27, l13, l14, str29, str30, str31, str32, str33, str18, str17);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonCardInfo)) {
            return false;
        }
        CommonCardInfo commonCardInfo = (CommonCardInfo) other;
        return Intrinsics.areEqual(this.bizType, commonCardInfo.bizType) && Intrinsics.areEqual(this.cardName, commonCardInfo.cardName) && Intrinsics.areEqual(this.cardColorArray, commonCardInfo.cardColorArray) && Intrinsics.areEqual(this.cardColorDarkArray, commonCardInfo.cardColorDarkArray) && Intrinsics.areEqual(this.tagColorArray, commonCardInfo.tagColorArray) && Intrinsics.areEqual(this.tagColorDarkArray, commonCardInfo.tagColorDarkArray) && Intrinsics.areEqual(this.cardBottomUrl, commonCardInfo.cardBottomUrl) && Intrinsics.areEqual(this.cardBottomUrlDark, commonCardInfo.cardBottomUrlDark) && Intrinsics.areEqual(this.sort, commonCardInfo.sort) && Intrinsics.areEqual(this.bizId, commonCardInfo.bizId) && Intrinsics.areEqual(this.title, commonCardInfo.title) && Intrinsics.areEqual(this.subTitle, commonCardInfo.subTitle) && Intrinsics.areEqual(this.icon, commonCardInfo.icon) && Intrinsics.areEqual(this.currencyName, commonCardInfo.currencyName) && Intrinsics.areEqual(this.countDownSeconds, commonCardInfo.countDownSeconds) && Intrinsics.areEqual(this.countDownTime, commonCardInfo.countDownTime) && Intrinsics.areEqual(this.btnTxt, commonCardInfo.btnTxt) && Intrinsics.areEqual(this.btnColor, commonCardInfo.btnColor) && Intrinsics.areEqual(this.btnColorDark, commonCardInfo.btnColorDark) && Intrinsics.areEqual(this.btnBgColor, commonCardInfo.btnBgColor) && Intrinsics.areEqual(this.btnBgColorDark, commonCardInfo.btnBgColorDark) && Intrinsics.areEqual(this.btnUrl, commonCardInfo.btnUrl) && Intrinsics.areEqual(this.cardUrl, commonCardInfo.cardUrl);
    }

    public int hashCode() {
        String str = this.bizType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cardName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.cardColorArray;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.cardColorDarkArray;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.tagColorArray;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.tagColorDarkArray;
        int iHashCode6 = (iHashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str3 = this.cardBottomUrl;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cardBottomUrlDark;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.sort;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.bizId;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.title;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.subTitle;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.icon;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.currencyName;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l11 = this.countDownSeconds;
        int iHashCode15 = (iHashCode14 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.countDownTime;
        int iHashCode16 = (iHashCode15 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str10 = this.btnTxt;
        int iHashCode17 = (iHashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.btnColor;
        int iHashCode18 = (iHashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.btnColorDark;
        int iHashCode19 = (iHashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.btnBgColor;
        int iHashCode20 = (iHashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.btnBgColorDark;
        int iHashCode21 = (iHashCode20 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.btnUrl;
        int iHashCode22 = (iHashCode21 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.cardUrl;
        return iHashCode22 + (str16 != null ? str16.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CommonCardInfo(bizType=" + this.bizType + ", cardName=" + this.cardName + ", cardColorArray=" + this.cardColorArray + ", cardColorDarkArray=" + this.cardColorDarkArray + ", tagColorArray=" + this.tagColorArray + ", tagColorDarkArray=" + this.tagColorDarkArray + ", cardBottomUrl=" + this.cardBottomUrl + ", cardBottomUrlDark=" + this.cardBottomUrlDark + ", sort=" + this.sort + ", bizId=" + this.bizId + ", title=" + this.title + ", subTitle=" + this.subTitle + ", icon=" + this.icon + ", currencyName=" + this.currencyName + ", countDownSeconds=" + this.countDownSeconds + ", countDownTime=" + this.countDownTime + ", btnTxt=" + this.btnTxt + ", btnColor=" + this.btnColor + ", btnColorDark=" + this.btnColorDark + ", btnBgColor=" + this.btnBgColor + ", btnBgColorDark=" + this.btnBgColorDark + ", btnUrl=" + this.btnUrl + ", cardUrl=" + this.cardUrl + ')';
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBizType() {
        return this.bizType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBizId() {
        return this.bizId;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Long getCountDownSeconds() {
        return this.countDownSeconds;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Long getCountDownTime() {
        return this.countDownTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getBtnTxt() {
        return this.btnTxt;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getBtnColor() {
        return this.btnColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getBtnColorDark() {
        return this.btnColorDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getBtnBgColor() {
        return this.btnBgColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getBtnBgColorDark() {
        return this.btnBgColorDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getBtnUrl() {
        return this.btnUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getCardUrl() {
        return this.cardUrl;
    }

    @Nullable
    public final List<String> component3() {
        return this.cardColorArray;
    }

    @Nullable
    public final List<String> component4() {
        return this.cardColorDarkArray;
    }

    @Nullable
    public final List<String> component5() {
        return this.tagColorArray;
    }

    @Nullable
    public final List<String> component6() {
        return this.tagColorDarkArray;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCardBottomUrl() {
        return this.cardBottomUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCardBottomUrlDark() {
        return this.cardBottomUrlDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getSort() {
        return this.sort;
    }

    @NotNull
    public final CommonCardInfo copy(@Nullable String bizType, @Nullable String cardName, @Nullable List<String> cardColorArray, @Nullable List<String> cardColorDarkArray, @Nullable List<String> tagColorArray, @Nullable List<String> tagColorDarkArray, @Nullable String cardBottomUrl, @Nullable String cardBottomUrlDark, @Nullable Integer sort, @Nullable String bizId, @Nullable String title, @Nullable String subTitle, @Nullable String icon, @Nullable String currencyName, @Nullable Long countDownSeconds, @Nullable Long countDownTime, @Nullable String btnTxt, @Nullable String btnColor, @Nullable String btnColorDark, @Nullable String btnBgColor, @Nullable String btnBgColorDark, @Nullable String btnUrl, @Nullable String cardUrl) {
        return new CommonCardInfo(bizType, cardName, cardColorArray, cardColorDarkArray, tagColorArray, tagColorDarkArray, cardBottomUrl, cardBottomUrlDark, sort, bizId, title, subTitle, icon, currencyName, countDownSeconds, countDownTime, btnTxt, btnColor, btnColorDark, btnBgColor, btnBgColorDark, btnUrl, cardUrl);
    }

    @Nullable
    public final String getBizId() {
        return this.bizId;
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

    @Nullable
    public final String getCardBottomUrl() {
        return this.cardBottomUrl;
    }

    @Nullable
    public final String getCardBottomUrlDark() {
        return this.cardBottomUrlDark;
    }

    @Nullable
    public final List<String> getCardColorArray() {
        return this.cardColorArray;
    }

    @Nullable
    public final List<String> getCardColorDarkArray() {
        return this.cardColorDarkArray;
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
    public final Long getCountDownSeconds() {
        return this.countDownSeconds;
    }

    @Nullable
    public final Long getCountDownTime() {
        return this.countDownTime;
    }

    @Nullable
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
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
    public final List<String> getTagColorArray() {
        return this.tagColorArray;
    }

    @Nullable
    public final List<String> getTagColorDarkArray() {
        return this.tagColorDarkArray;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String showBtnBgColor() {
        return DayNightThemeManager.f28592a.m33187l() ? this.btnBgColor : this.btnBgColorDark;
    }

    @Nullable
    public final String showBtnColor() {
        return DayNightThemeManager.f28592a.m33187l() ? this.btnColor : this.btnColorDark;
    }

    @Nullable
    public final List<String> showCardBg() {
        return DayNightThemeManager.f28592a.m33187l() ? this.cardColorArray : this.cardColorDarkArray;
    }

    @Nullable
    public final String showCardBottomUrl() {
        return DayNightThemeManager.f28592a.m33187l() ? this.cardBottomUrl : this.cardBottomUrlDark;
    }

    @Nullable
    public final List<String> showTagBg() {
        return DayNightThemeManager.f28592a.m33187l() ? this.tagColorArray : this.tagColorDarkArray;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.bizType);
        dest.writeString(this.cardName);
        dest.writeStringList(this.cardColorArray);
        dest.writeStringList(this.cardColorDarkArray);
        dest.writeStringList(this.tagColorArray);
        dest.writeStringList(this.tagColorDarkArray);
        dest.writeString(this.cardBottomUrl);
        dest.writeString(this.cardBottomUrlDark);
        Integer num = this.sort;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.bizId);
        dest.writeString(this.title);
        dest.writeString(this.subTitle);
        dest.writeString(this.icon);
        dest.writeString(this.currencyName);
        Long l11 = this.countDownSeconds;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.countDownTime;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeString(this.btnTxt);
        dest.writeString(this.btnColor);
        dest.writeString(this.btnColorDark);
        dest.writeString(this.btnBgColor);
        dest.writeString(this.btnBgColorDark);
        dest.writeString(this.btnUrl);
        dest.writeString(this.cardUrl);
    }

    public CommonCardInfo(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable List<String> list4, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Long l11, @Nullable Long l12, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16) {
        this.bizType = str;
        this.cardName = str2;
        this.cardColorArray = list;
        this.cardColorDarkArray = list2;
        this.tagColorArray = list3;
        this.tagColorDarkArray = list4;
        this.cardBottomUrl = str3;
        this.cardBottomUrlDark = str4;
        this.sort = num;
        this.bizId = str5;
        this.title = str6;
        this.subTitle = str7;
        this.icon = str8;
        this.currencyName = str9;
        this.countDownSeconds = l11;
        this.countDownTime = l12;
        this.btnTxt = str10;
        this.btnColor = str11;
        this.btnColorDark = str12;
        this.btnBgColor = str13;
        this.btnBgColorDark = str14;
        this.btnUrl = str15;
        this.cardUrl = str16;
    }
}
