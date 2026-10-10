package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27041f;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.C41636g;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: OtcBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u00104\u001a\u0004\u0018\u000105H\u0086@¢\u0006\u0002\u00106J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0011\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJà\u0001\u0010H\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010IJ\u0006\u0010J\u001a\u00020KJ\u0013\u0010L\u001a\u00020\u00052\b\u0010M\u001a\u0004\u0018\u00010NHÖ\u0003J\t\u0010O\u001a\u00020KHÖ\u0001J\t\u0010P\u001a\u00020\u0003HÖ\u0001J\u0016\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020KR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0004\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010(R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b)\u0010\u001aR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010(R \u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010(R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0019R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b3\u0010\u001a¨\u0006V"}, m90084d2 = {"Lcom/kubi/otc/entity/AdPayType;", "Landroid/os/Parcelable;", "id", "", "isDefault", "", "legal", "payTypeCode", "payTypeNameEn", TUIConstantDefine.USER_NAME, "payTypeNumber", "payQrcodePic", "bankName", "subBranch", "reservedFields", "phoneNoPayTip", "displayList", "", "payTypeName", "payTypeIcon", "color", "valid", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "setDefault", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getLegal", "getPayTypeCode", "getPayTypeNameEn", "getUserName", "getPayTypeNumber", "getPayQrcodePic", "getBankName", "getSubBranch", "getReservedFields", "setReservedFields", "(Ljava/lang/String;)V", "getPhoneNoPayTip", "getDisplayList", "()Ljava/util/List;", "setDisplayList", "(Ljava/util/List;)V", "getPayTypeName", "setPayTypeName", "getPayTypeIcon", "setPayTypeIcon", "getColor", "getValid", "getPayTypeFields", "Lcom/kubi/otc/entity/ReservedFileds;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/otc/entity/AdPayType;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOtcBean.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcBean.kt\ncom/kubi/otc/entity/AdPayType\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,710:1\n196#2,3:711\n*S KotlinDebug\n*F\n+ 1 OtcBean.kt\ncom/kubi/otc/entity/AdPayType\n*L\n391#1:711,3\n*E\n"})
public final /* data */ class AdPayType implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AdPayType> CREATOR = new Creator();

    @Nullable
    private final String bankName;

    @Nullable
    private final String color;

    @Nullable
    private List<String> displayList;

    @Nullable
    private final String id;

    @Nullable
    private Boolean isDefault;

    @Nullable
    private final String legal;

    @Nullable
    private final String payQrcodePic;

    @Nullable
    private final String payTypeCode;

    @Expose(deserialize = false, serialize = false)
    @Nullable
    private String payTypeIcon;

    @Expose(deserialize = false, serialize = false)
    @Nullable
    private String payTypeName;

    @Nullable
    private final String payTypeNameEn;

    @Nullable
    private final String payTypeNumber;

    @Nullable
    private final Boolean phoneNoPayTip;

    @Nullable
    private String reservedFields;

    @Nullable
    private final String subBranch;

    @Nullable
    private final String userName;

    @Nullable
    private final Boolean valid;

    /* JADX INFO: compiled from: OtcBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<AdPayType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdPayType createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Boolean bool = boolValueOf2;
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AdPayType(string, boolValueOf, string2, string3, string4, string5, string6, string7, string8, string9, string10, bool, arrayListCreateStringArrayList, string11, string12, string13, boolValueOf3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdPayType[] newArray(int i11) {
            return new AdPayType[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdPayType copy$default(AdPayType adPayType, String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool2, List list, String str11, String str12, String str13, Boolean bool3, int i11, Object obj) {
        Boolean bool4;
        String str14;
        String str15 = (i11 & 1) != 0 ? adPayType.id : str;
        Boolean bool5 = (i11 & 2) != 0 ? adPayType.isDefault : bool;
        String str16 = (i11 & 4) != 0 ? adPayType.legal : str2;
        String str17 = (i11 & 8) != 0 ? adPayType.payTypeCode : str3;
        String str18 = (i11 & 16) != 0 ? adPayType.payTypeNameEn : str4;
        String str19 = (i11 & 32) != 0 ? adPayType.userName : str5;
        String str20 = (i11 & 64) != 0 ? adPayType.payTypeNumber : str6;
        String str21 = (i11 & 128) != 0 ? adPayType.payQrcodePic : str7;
        String str22 = (i11 & 256) != 0 ? adPayType.bankName : str8;
        String str23 = (i11 & 512) != 0 ? adPayType.subBranch : str9;
        String str24 = (i11 & 1024) != 0 ? adPayType.reservedFields : str10;
        Boolean bool6 = (i11 & 2048) != 0 ? adPayType.phoneNoPayTip : bool2;
        List list2 = (i11 & 4096) != 0 ? adPayType.displayList : list;
        String str25 = (i11 & 8192) != 0 ? adPayType.payTypeName : str11;
        String str26 = str15;
        String str27 = (i11 & 16384) != 0 ? adPayType.payTypeIcon : str12;
        String str28 = (i11 & 32768) != 0 ? adPayType.color : str13;
        if ((i11 & 65536) != 0) {
            str14 = str28;
            bool4 = adPayType.valid;
        } else {
            bool4 = bool3;
            str14 = str28;
        }
        return adPayType.copy(str26, bool5, str16, str17, str18, str19, str20, str21, str22, str23, str24, bool6, list2, str25, str27, str14, bool4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdPayType)) {
            return false;
        }
        AdPayType adPayType = (AdPayType) other;
        return Intrinsics.areEqual(this.id, adPayType.id) && Intrinsics.areEqual(this.isDefault, adPayType.isDefault) && Intrinsics.areEqual(this.legal, adPayType.legal) && Intrinsics.areEqual(this.payTypeCode, adPayType.payTypeCode) && Intrinsics.areEqual(this.payTypeNameEn, adPayType.payTypeNameEn) && Intrinsics.areEqual(this.userName, adPayType.userName) && Intrinsics.areEqual(this.payTypeNumber, adPayType.payTypeNumber) && Intrinsics.areEqual(this.payQrcodePic, adPayType.payQrcodePic) && Intrinsics.areEqual(this.bankName, adPayType.bankName) && Intrinsics.areEqual(this.subBranch, adPayType.subBranch) && Intrinsics.areEqual(this.reservedFields, adPayType.reservedFields) && Intrinsics.areEqual(this.phoneNoPayTip, adPayType.phoneNoPayTip) && Intrinsics.areEqual(this.displayList, adPayType.displayList) && Intrinsics.areEqual(this.payTypeName, adPayType.payTypeName) && Intrinsics.areEqual(this.payTypeIcon, adPayType.payTypeIcon) && Intrinsics.areEqual(this.color, adPayType.color) && Intrinsics.areEqual(this.valid, adPayType.valid);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSubBranch() {
        return this.subBranch;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getReservedFields() {
        return this.reservedFields;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getPhoneNoPayTip() {
        return this.phoneNoPayTip;
    }

    @Nullable
    public final List<String> component13() {
        return this.displayList;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPayTypeName() {
        return this.payTypeName;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPayTypeIcon() {
        return this.payTypeIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getValid() {
        return this.valid;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsDefault() {
        return this.isDefault;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLegal() {
        return this.legal;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPayTypeCode() {
        return this.payTypeCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPayTypeNameEn() {
        return this.payTypeNameEn;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPayTypeNumber() {
        return this.payTypeNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPayQrcodePic() {
        return this.payQrcodePic;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    @NotNull
    public final AdPayType copy(@Nullable String id2, @Nullable Boolean isDefault, @Nullable String legal, @Nullable String payTypeCode, @Nullable String payTypeNameEn, @Nullable String userName, @Nullable String payTypeNumber, @Nullable String payQrcodePic, @Nullable String bankName, @Nullable String subBranch, @Nullable String reservedFields, @Nullable Boolean phoneNoPayTip, @Nullable List<String> displayList, @Nullable String payTypeName, @Nullable String payTypeIcon, @Nullable String color, @Nullable Boolean valid) {
        return new AdPayType(id2, isDefault, legal, payTypeCode, payTypeNameEn, userName, payTypeNumber, payQrcodePic, bankName, subBranch, reservedFields, phoneNoPayTip, displayList, payTypeName, payTypeIcon, color, valid);
    }

    @Nullable
    public final String getBankName() {
        return this.bankName;
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    @Nullable
    public final List<String> getDisplayList() {
        return this.displayList;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLegal() {
        return this.legal;
    }

    @Nullable
    public final String getPayQrcodePic() {
        return this.payQrcodePic;
    }

    @Nullable
    public final String getPayTypeCode() {
        return this.payTypeCode;
    }

    @Nullable
    public final Object getPayTypeFields(@NotNull Continuation<? super ReservedFileds> continuation) {
        C27099x c27099x = C27099x.f54458a;
        return C41636g.m90914f0(C41636g.m90890N(C41636g.m90887K(new AdPayType$getPayTypeFields$$inlined$fromJsonOrNull$1(C27041f.m66668h(this.reservedFields), null)), C42911a.m94120b()), continuation);
    }

    @Nullable
    public final String getPayTypeIcon() {
        return this.payTypeIcon;
    }

    @Nullable
    public final String getPayTypeName() {
        return this.payTypeName;
    }

    @Nullable
    public final String getPayTypeNameEn() {
        return this.payTypeNameEn;
    }

    @Nullable
    public final String getPayTypeNumber() {
        return this.payTypeNumber;
    }

    @Nullable
    public final Boolean getPhoneNoPayTip() {
        return this.phoneNoPayTip;
    }

    @Nullable
    public final String getReservedFields() {
        return this.reservedFields;
    }

    @Nullable
    public final String getSubBranch() {
        return this.subBranch;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    @Nullable
    public final Boolean getValid() {
        return this.valid;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isDefault;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.legal;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.payTypeCode;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.payTypeNameEn;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.userName;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.payTypeNumber;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.payQrcodePic;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.bankName;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.subBranch;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.reservedFields;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool2 = this.phoneNoPayTip;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<String> list = this.displayList;
        int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        String str11 = this.payTypeName;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.payTypeIcon;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.color;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool3 = this.valid;
        return iHashCode16 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @Nullable
    public final Boolean isDefault() {
        return this.isDefault;
    }

    public final void setDefault(@Nullable Boolean bool) {
        this.isDefault = bool;
    }

    public final void setDisplayList(@Nullable List<String> list) {
        this.displayList = list;
    }

    public final void setPayTypeIcon(@Nullable String str) {
        this.payTypeIcon = str;
    }

    public final void setPayTypeName(@Nullable String str) {
        this.payTypeName = str;
    }

    public final void setReservedFields(@Nullable String str) {
        this.reservedFields = str;
    }

    @NotNull
    public String toString() {
        return "AdPayType(id=" + this.id + ", isDefault=" + this.isDefault + ", legal=" + this.legal + ", payTypeCode=" + this.payTypeCode + ", payTypeNameEn=" + this.payTypeNameEn + ", userName=" + this.userName + ", payTypeNumber=" + this.payTypeNumber + ", payQrcodePic=" + this.payQrcodePic + ", bankName=" + this.bankName + ", subBranch=" + this.subBranch + ", reservedFields=" + this.reservedFields + ", phoneNoPayTip=" + this.phoneNoPayTip + ", displayList=" + this.displayList + ", payTypeName=" + this.payTypeName + ", payTypeIcon=" + this.payTypeIcon + ", color=" + this.color + ", valid=" + this.valid + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        Boolean bool = this.isDefault;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.legal);
        dest.writeString(this.payTypeCode);
        dest.writeString(this.payTypeNameEn);
        dest.writeString(this.userName);
        dest.writeString(this.payTypeNumber);
        dest.writeString(this.payQrcodePic);
        dest.writeString(this.bankName);
        dest.writeString(this.subBranch);
        dest.writeString(this.reservedFields);
        Boolean bool2 = this.phoneNoPayTip;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        dest.writeStringList(this.displayList);
        dest.writeString(this.payTypeName);
        dest.writeString(this.payTypeIcon);
        dest.writeString(this.color);
        Boolean bool3 = this.valid;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
    }

    public AdPayType(@Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable Boolean bool2, @Nullable List<String> list, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable Boolean bool3) {
        this.id = str;
        this.isDefault = bool;
        this.legal = str2;
        this.payTypeCode = str3;
        this.payTypeNameEn = str4;
        this.userName = str5;
        this.payTypeNumber = str6;
        this.payQrcodePic = str7;
        this.bankName = str8;
        this.subBranch = str9;
        this.reservedFields = str10;
        this.phoneNoPayTip = bool2;
        this.displayList = list;
        this.payTypeName = str11;
        this.payTypeIcon = str12;
        this.color = str13;
        this.valid = bool3;
    }
}
