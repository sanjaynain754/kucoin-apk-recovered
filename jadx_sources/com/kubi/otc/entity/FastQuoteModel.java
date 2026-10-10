package com.kubi.otc.entity;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.kubi.otc.R$string;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import ht.C38346y;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FastBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ~2\u00020\u0001:\u0001~BÅ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010I\u001a\u00020\u001bJ\u0010\u0010J\u001a\u00020\u001b2\b\u0010K\u001a\u0004\u0018\u00010\u0000J\u0006\u0010L\u001a\u00020\u001bJ\u0006\u0010M\u001a\u00020\u001bJ\u000e\u0010N\u001a\u00020\u001b2\u0006\u0010O\u001a\u00020\u0003J\u0006\u0010P\u001a\u00020\u001bJ\u0006\u0010Q\u001a\u00020\u0003J\u0006\u0010R\u001a\u00020\u0003J\u0006\u0010S\u001a\u00020\u0003J\u0006\u0010T\u001a\u00020\u0003J\u0010\u0010U\u001a\u00020\u001b2\b\u0010V\u001a\u0004\u0018\u00010\u0000J\u001f\u0010W\u001a\u00020\u00032\u0006\u0010X\u001a\u00020Y2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010[J\u0006\u0010\\\u001a\u00020\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0010\u0010m\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u0010BJ\u0010\u0010n\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u0010BJ\u000b\u0010o\u001a\u0004\u0018\u00010\u001eHÆ\u0003Jò\u0001\u0010p\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÆ\u0001¢\u0006\u0002\u0010qJ\u0006\u0010r\u001a\u00020sJ\u0013\u0010t\u001a\u00020\u001b2\b\u0010u\u001a\u0004\u0018\u00010vHÖ\u0003J\t\u0010w\u001a\u00020sHÖ\u0001J\t\u0010x\u001a\u00020\u0003HÖ\u0001J\u0016\u0010y\u001a\u00020z2\u0006\u0010{\u001a\u00020|2\u0006\u0010}\u001a\u00020sR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010)R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\"\"\u0004\b+\u0010)R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010)R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u0010C\u001a\u0004\bA\u0010BR\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010C\u001a\u0004\bD\u0010BR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006\u007f"}, m90084d2 = {"Lcom/kubi/otc/entity/FastQuoteModel;", "Landroid/os/Parcelable;", "fiatCurrency", "", "cryptoCurrency", "fiatAmount", "cryptoAmount", "highPrice", "paymentMethod", "paymentMethodCode", "paymentPicture", "paymentType", "feeResponse", "Lcom/kubi/otc/entity/FastFeeModel;", "fiatLimitResponse", "Lcom/kubi/otc/entity/FiatLimitResponse;", "fiatRechargeResponse", "Lcom/kubi/otc/entity/FastRechargePaymentModel;", "bankCardQuoteResponse", "Lcom/kubi/otc/entity/FastBankPaymentModel;", "commonFiatResponse", "Lcom/kubi/otc/entity/FastFiatCommonMode;", "commonOtcResponse", "Lcom/kubi/otc/entity/FastCommonOtcMode;", "selectCard", "Lcom/kubi/otc/entity/CardInfoModel;", "forceRefresh", "", "needConfirm", "quoteParams", "Lcom/kubi/otc/entity/FastQuoteParams;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/FastFeeModel;Lcom/kubi/otc/entity/FiatLimitResponse;Lcom/kubi/otc/entity/FastRechargePaymentModel;Lcom/kubi/otc/entity/FastBankPaymentModel;Lcom/kubi/otc/entity/FastFiatCommonMode;Lcom/kubi/otc/entity/FastCommonOtcMode;Lcom/kubi/otc/entity/CardInfoModel;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/kubi/otc/entity/FastQuoteParams;)V", "getFiatCurrency", "()Ljava/lang/String;", "getCryptoCurrency", "getFiatAmount", "getCryptoAmount", "getHighPrice", "getPaymentMethod", "setPaymentMethod", "(Ljava/lang/String;)V", "getPaymentMethodCode", "setPaymentMethodCode", "getPaymentPicture", "setPaymentPicture", "getPaymentType", "getFeeResponse", "()Lcom/kubi/otc/entity/FastFeeModel;", "setFeeResponse", "(Lcom/kubi/otc/entity/FastFeeModel;)V", "getFiatLimitResponse", "()Lcom/kubi/otc/entity/FiatLimitResponse;", "getFiatRechargeResponse", "()Lcom/kubi/otc/entity/FastRechargePaymentModel;", "getBankCardQuoteResponse", "()Lcom/kubi/otc/entity/FastBankPaymentModel;", "getCommonFiatResponse", "()Lcom/kubi/otc/entity/FastFiatCommonMode;", "getCommonOtcResponse", "()Lcom/kubi/otc/entity/FastCommonOtcMode;", "getSelectCard", "()Lcom/kubi/otc/entity/CardInfoModel;", "setSelectCard", "(Lcom/kubi/otc/entity/CardInfoModel;)V", "getForceRefresh", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNeedConfirm", "getQuoteParams", "()Lcom/kubi/otc/entity/FastQuoteParams;", "setQuoteParams", "(Lcom/kubi/otc/entity/FastQuoteParams;)V", "isOtcType", "isSelectPay", "selectQuote", "isOtcUnEnable", "isFiatPayCheckLimit", "isBalanceUnAvailable", "balanceAmount", "isUnAvailableAmount", "getBuyCryptoAmount", "getSellFiatAmount", "getLimitMinCryptoAmount", "getLimitMaxCryptoAmount", "isSameQuote", "quote", "getPayName", "context", "Landroid/content/Context;", "isShort", "(Landroid/content/Context;Ljava/lang/Boolean;)Ljava/lang/String;", "getPayIcon", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/FastFeeModel;Lcom/kubi/otc/entity/FiatLimitResponse;Lcom/kubi/otc/entity/FastRechargePaymentModel;Lcom/kubi/otc/entity/FastBankPaymentModel;Lcom/kubi/otc/entity/FastFiatCommonMode;Lcom/kubi/otc/entity/FastCommonOtcMode;Lcom/kubi/otc/entity/CardInfoModel;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/kubi/otc/entity/FastQuoteParams;)Lcom/kubi/otc/entity/FastQuoteModel;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FastQuoteModel implements Parcelable {

    @NotNull
    public static final String PAY_BALANCE = "BALANCE";

    @NotNull
    public static final String PAY_BANK_CARD = "BANK_CARD";

    @NotNull
    public static final String PAY_P2P = "P2P";

    @NotNull
    public static final String PAY_POPULAR_PAY = "POPULAR_PAY";

    @NotNull
    public static final String PAY_RECHARGE = "RECHARGE";

    @NotNull
    public static final String PAY_THIRD_PARTY = "THIRD_PARTY";

    @Nullable
    private final FastBankPaymentModel bankCardQuoteResponse;

    @Nullable
    private final FastFiatCommonMode commonFiatResponse;

    @Nullable
    private final FastCommonOtcMode commonOtcResponse;

    @Nullable
    private final String cryptoAmount;

    @Nullable
    private final String cryptoCurrency;

    @Nullable
    private FastFeeModel feeResponse;

    @Nullable
    private final String fiatAmount;

    @Nullable
    private final String fiatCurrency;

    @Nullable
    private final FiatLimitResponse fiatLimitResponse;

    @SerializedName("sepaTransactiveResponse")
    @Nullable
    private final FastRechargePaymentModel fiatRechargeResponse;

    @Nullable
    private final Boolean forceRefresh;

    @Nullable
    private final String highPrice;

    @SerializedName("needConfirm")
    @Nullable
    private final Boolean needConfirm;

    @Nullable
    private String paymentMethod;

    @Nullable
    private String paymentMethodCode;

    @Nullable
    private String paymentPicture;

    @Nullable
    private final String paymentType;

    @Nullable
    private FastQuoteParams quoteParams;

    @Nullable
    private CardInfoModel selectCard;

    @NotNull
    public static final Parcelable.Creator<FastQuoteModel> CREATOR = new Creator();

    /* JADX INFO: compiled from: FastBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FastQuoteModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FastQuoteModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            FastFeeModel fastFeeModelCreateFromParcel = parcel.readInt() == 0 ? null : FastFeeModel.CREATOR.createFromParcel(parcel);
            FiatLimitResponse fiatLimitResponseCreateFromParcel = parcel.readInt() == 0 ? null : FiatLimitResponse.CREATOR.createFromParcel(parcel);
            FastRechargePaymentModel fastRechargePaymentModelCreateFromParcel = parcel.readInt() == 0 ? null : FastRechargePaymentModel.CREATOR.createFromParcel(parcel);
            FastBankPaymentModel fastBankPaymentModelCreateFromParcel = parcel.readInt() == 0 ? null : FastBankPaymentModel.CREATOR.createFromParcel(parcel);
            FastFiatCommonMode fastFiatCommonModeCreateFromParcel = parcel.readInt() == 0 ? null : FastFiatCommonMode.CREATOR.createFromParcel(parcel);
            FastCommonOtcMode fastCommonOtcModeCreateFromParcel = parcel.readInt() == 0 ? null : FastCommonOtcMode.CREATOR.createFromParcel(parcel);
            CardInfoModel cardInfoModelCreateFromParcel = parcel.readInt() == 0 ? null : CardInfoModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FastQuoteModel(string, string2, string3, string4, string5, string6, string7, string8, string9, fastFeeModelCreateFromParcel, fiatLimitResponseCreateFromParcel, fastRechargePaymentModelCreateFromParcel, fastBankPaymentModelCreateFromParcel, fastFiatCommonModeCreateFromParcel, fastCommonOtcModeCreateFromParcel, cardInfoModelCreateFromParcel, boolValueOf, boolValueOf2, parcel.readInt() == 0 ? null : FastQuoteParams.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FastQuoteModel[] newArray(int i11) {
            return new FastQuoteModel[i11];
        }
    }

    public static /* synthetic */ FastQuoteModel copy$default(FastQuoteModel fastQuoteModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, FastFeeModel fastFeeModel, FiatLimitResponse fiatLimitResponse, FastRechargePaymentModel fastRechargePaymentModel, FastBankPaymentModel fastBankPaymentModel, FastFiatCommonMode fastFiatCommonMode, FastCommonOtcMode fastCommonOtcMode, CardInfoModel cardInfoModel, Boolean bool, Boolean bool2, FastQuoteParams fastQuoteParams, int i11, Object obj) {
        FastQuoteParams fastQuoteParams2;
        Boolean bool3;
        String str10 = (i11 & 1) != 0 ? fastQuoteModel.fiatCurrency : str;
        String str11 = (i11 & 2) != 0 ? fastQuoteModel.cryptoCurrency : str2;
        String str12 = (i11 & 4) != 0 ? fastQuoteModel.fiatAmount : str3;
        String str13 = (i11 & 8) != 0 ? fastQuoteModel.cryptoAmount : str4;
        String str14 = (i11 & 16) != 0 ? fastQuoteModel.highPrice : str5;
        String str15 = (i11 & 32) != 0 ? fastQuoteModel.paymentMethod : str6;
        String str16 = (i11 & 64) != 0 ? fastQuoteModel.paymentMethodCode : str7;
        String str17 = (i11 & 128) != 0 ? fastQuoteModel.paymentPicture : str8;
        String str18 = (i11 & 256) != 0 ? fastQuoteModel.paymentType : str9;
        FastFeeModel fastFeeModel2 = (i11 & 512) != 0 ? fastQuoteModel.feeResponse : fastFeeModel;
        FiatLimitResponse fiatLimitResponse2 = (i11 & 1024) != 0 ? fastQuoteModel.fiatLimitResponse : fiatLimitResponse;
        FastRechargePaymentModel fastRechargePaymentModel2 = (i11 & 2048) != 0 ? fastQuoteModel.fiatRechargeResponse : fastRechargePaymentModel;
        FastBankPaymentModel fastBankPaymentModel2 = (i11 & 4096) != 0 ? fastQuoteModel.bankCardQuoteResponse : fastBankPaymentModel;
        FastFiatCommonMode fastFiatCommonMode2 = (i11 & 8192) != 0 ? fastQuoteModel.commonFiatResponse : fastFiatCommonMode;
        String str19 = str10;
        FastCommonOtcMode fastCommonOtcMode2 = (i11 & 16384) != 0 ? fastQuoteModel.commonOtcResponse : fastCommonOtcMode;
        CardInfoModel cardInfoModel2 = (i11 & 32768) != 0 ? fastQuoteModel.selectCard : cardInfoModel;
        Boolean bool4 = (i11 & 65536) != 0 ? fastQuoteModel.forceRefresh : bool;
        Boolean bool5 = (i11 & 131072) != 0 ? fastQuoteModel.needConfirm : bool2;
        if ((i11 & 262144) != 0) {
            bool3 = bool5;
            fastQuoteParams2 = fastQuoteModel.quoteParams;
        } else {
            fastQuoteParams2 = fastQuoteParams;
            bool3 = bool5;
        }
        return fastQuoteModel.copy(str19, str11, str12, str13, str14, str15, str16, str17, str18, fastFeeModel2, fiatLimitResponse2, fastRechargePaymentModel2, fastBankPaymentModel2, fastFiatCommonMode2, fastCommonOtcMode2, cardInfoModel2, bool4, bool3, fastQuoteParams2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FastQuoteModel)) {
            return false;
        }
        FastQuoteModel fastQuoteModel = (FastQuoteModel) other;
        return Intrinsics.areEqual(this.fiatCurrency, fastQuoteModel.fiatCurrency) && Intrinsics.areEqual(this.cryptoCurrency, fastQuoteModel.cryptoCurrency) && Intrinsics.areEqual(this.fiatAmount, fastQuoteModel.fiatAmount) && Intrinsics.areEqual(this.cryptoAmount, fastQuoteModel.cryptoAmount) && Intrinsics.areEqual(this.highPrice, fastQuoteModel.highPrice) && Intrinsics.areEqual(this.paymentMethod, fastQuoteModel.paymentMethod) && Intrinsics.areEqual(this.paymentMethodCode, fastQuoteModel.paymentMethodCode) && Intrinsics.areEqual(this.paymentPicture, fastQuoteModel.paymentPicture) && Intrinsics.areEqual(this.paymentType, fastQuoteModel.paymentType) && Intrinsics.areEqual(this.feeResponse, fastQuoteModel.feeResponse) && Intrinsics.areEqual(this.fiatLimitResponse, fastQuoteModel.fiatLimitResponse) && Intrinsics.areEqual(this.fiatRechargeResponse, fastQuoteModel.fiatRechargeResponse) && Intrinsics.areEqual(this.bankCardQuoteResponse, fastQuoteModel.bankCardQuoteResponse) && Intrinsics.areEqual(this.commonFiatResponse, fastQuoteModel.commonFiatResponse) && Intrinsics.areEqual(this.commonOtcResponse, fastQuoteModel.commonOtcResponse) && Intrinsics.areEqual(this.selectCard, fastQuoteModel.selectCard) && Intrinsics.areEqual(this.forceRefresh, fastQuoteModel.forceRefresh) && Intrinsics.areEqual(this.needConfirm, fastQuoteModel.needConfirm) && Intrinsics.areEqual(this.quoteParams, fastQuoteModel.quoteParams);
    }

    public final boolean isSelectPay(@Nullable FastQuoteModel selectQuote) {
        String str;
        String str2;
        Boolean boolValueOf = null;
        if (!C27025c.m66566d((selectQuote == null || (str2 = selectQuote.paymentMethod) == null) ? null : Boolean.valueOf(str2.equals(this.paymentMethod)))) {
            return false;
        }
        if (selectQuote != null && (str = selectQuote.paymentType) != null) {
            boolValueOf = Boolean.valueOf(str.equals(this.paymentType));
        }
        return C27025c.m66566d(boolValueOf);
    }

    public static /* synthetic */ String getPayName$default(FastQuoteModel fastQuoteModel, Context context, Boolean bool, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bool = Boolean.FALSE;
        }
        return fastQuoteModel.getPayName(context, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final FastFeeModel getFeeResponse() {
        return this.feeResponse;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final FiatLimitResponse getFiatLimitResponse() {
        return this.fiatLimitResponse;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final FastRechargePaymentModel getFiatRechargeResponse() {
        return this.fiatRechargeResponse;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final FastBankPaymentModel getBankCardQuoteResponse() {
        return this.bankCardQuoteResponse;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final FastFiatCommonMode getCommonFiatResponse() {
        return this.commonFiatResponse;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final FastCommonOtcMode getCommonOtcResponse() {
        return this.commonOtcResponse;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final CardInfoModel getSelectCard() {
        return this.selectCard;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getForceRefresh() {
        return this.forceRefresh;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getNeedConfirm() {
        return this.needConfirm;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final FastQuoteParams getQuoteParams() {
        return this.quoteParams;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFiatAmount() {
        return this.fiatAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCryptoAmount() {
        return this.cryptoAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHighPrice() {
        return this.highPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPaymentPicture() {
        return this.paymentPicture;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPaymentType() {
        return this.paymentType;
    }

    @NotNull
    public final FastQuoteModel copy(@Nullable String fiatCurrency, @Nullable String cryptoCurrency, @Nullable String fiatAmount, @Nullable String cryptoAmount, @Nullable String highPrice, @Nullable String paymentMethod, @Nullable String paymentMethodCode, @Nullable String paymentPicture, @Nullable String paymentType, @Nullable FastFeeModel feeResponse, @Nullable FiatLimitResponse fiatLimitResponse, @Nullable FastRechargePaymentModel fiatRechargeResponse, @Nullable FastBankPaymentModel bankCardQuoteResponse, @Nullable FastFiatCommonMode commonFiatResponse, @Nullable FastCommonOtcMode commonOtcResponse, @Nullable CardInfoModel selectCard, @Nullable Boolean forceRefresh, @Nullable Boolean needConfirm, @Nullable FastQuoteParams quoteParams) {
        return new FastQuoteModel(fiatCurrency, cryptoCurrency, fiatAmount, cryptoAmount, highPrice, paymentMethod, paymentMethodCode, paymentPicture, paymentType, feeResponse, fiatLimitResponse, fiatRechargeResponse, bankCardQuoteResponse, commonFiatResponse, commonOtcResponse, selectCard, forceRefresh, needConfirm, quoteParams);
    }

    @Nullable
    public final FastBankPaymentModel getBankCardQuoteResponse() {
        return this.bankCardQuoteResponse;
    }

    @NotNull
    public final String getBuyCryptoAmount() {
        try {
            BigDecimal bigDecimalM86490A = C38346y.m86490A(this.fiatAmount);
            FastFeeModel fastFeeModel = this.feeResponse;
            BigDecimal bigDecimalSubtract = bigDecimalM86490A.subtract(C38346y.m86490A(fastFeeModel != null ? fastFeeModel.getFee() : null));
            String plainString = bigDecimalSubtract.compareTo(BigDecimal.ZERO) > -1 ? bigDecimalSubtract.divide(C38346y.m86490A(this.highPrice), 8, RoundingMode.DOWN).toPlainString() : "--";
            Intrinsics.checkNotNull(plainString);
            return plainString;
        } catch (Exception unused) {
            return "--";
        }
    }

    @Nullable
    public final FastFiatCommonMode getCommonFiatResponse() {
        return this.commonFiatResponse;
    }

    @Nullable
    public final FastCommonOtcMode getCommonOtcResponse() {
        return this.commonOtcResponse;
    }

    @Nullable
    public final String getCryptoAmount() {
        return this.cryptoAmount;
    }

    @Nullable
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    @Nullable
    public final FastFeeModel getFeeResponse() {
        return this.feeResponse;
    }

    @Nullable
    public final String getFiatAmount() {
        return this.fiatAmount;
    }

    @Nullable
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    public final FiatLimitResponse getFiatLimitResponse() {
        return this.fiatLimitResponse;
    }

    @Nullable
    public final FastRechargePaymentModel getFiatRechargeResponse() {
        return this.fiatRechargeResponse;
    }

    @Nullable
    public final Boolean getForceRefresh() {
        return this.forceRefresh;
    }

    @Nullable
    public final String getHighPrice() {
        return this.highPrice;
    }

    @NotNull
    public final String getLimitMaxCryptoAmount() {
        try {
            FiatLimitResponse fiatLimitResponse = this.fiatLimitResponse;
            String plainString = C38346y.m86490A(fiatLimitResponse != null ? fiatLimitResponse.getFiatMaxAmount() : null).divide(C38346y.m86490A(this.highPrice), 2, RoundingMode.DOWN).toPlainString();
            Intrinsics.checkNotNull(plainString);
            return plainString;
        } catch (Exception unused) {
            return "--";
        }
    }

    @NotNull
    public final String getLimitMinCryptoAmount() {
        try {
            FiatLimitResponse fiatLimitResponse = this.fiatLimitResponse;
            String plainString = C38346y.m86490A(fiatLimitResponse != null ? fiatLimitResponse.getFiatMinAmount() : null).divide(C38346y.m86490A(this.highPrice), 2, RoundingMode.DOWN).toPlainString();
            Intrinsics.checkNotNull(plainString);
            return plainString;
        } catch (Exception unused) {
            return "--";
        }
    }

    @Nullable
    public final Boolean getNeedConfirm() {
        return this.needConfirm;
    }

    @NotNull
    public final String getPayIcon() {
        if (!Intrinsics.areEqual(this.paymentType, PAY_BANK_CARD)) {
            return C27041f.m66668h(this.paymentPicture);
        }
        CardInfoModel cardInfoModel = this.selectCard;
        return C27041f.m66668h(cardInfoModel != null ? cardInfoModel.getSchemeUrl() : null);
    }

    @NotNull
    public final String getPayName(@NotNull Context context, @Nullable Boolean isShort) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.paymentType;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -786382386) {
                if (iHashCode != 378796732) {
                    if (iHashCode == 1028436787 && str.equals(PAY_BANK_CARD)) {
                        CardInfoModel cardInfoModel = this.selectCard;
                        return C27041f.m66668h(cardInfoModel != null ? cardInfoModel.getCardNumStr(context) : null);
                    }
                } else if (str.equals(PAY_BALANCE)) {
                    String string = context.getString(R$string.pay_fast_balance_name, C27041f.m66668h(this.fiatCurrency));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    return string;
                }
            } else if (str.equals("THIRD_PARTY")) {
                if (!C27025c.m66566d(isShort)) {
                    return C27041f.m66668h(this.paymentMethod);
                }
                String string2 = context.getString(R$string.visa_deposit);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
        }
        return C27041f.m66668h(this.paymentMethod);
    }

    @Nullable
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    @Nullable
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    public final String getPaymentPicture() {
        return this.paymentPicture;
    }

    @Nullable
    public final String getPaymentType() {
        return this.paymentType;
    }

    @Nullable
    public final FastQuoteParams getQuoteParams() {
        return this.quoteParams;
    }

    @Nullable
    public final CardInfoModel getSelectCard() {
        return this.selectCard;
    }

    @NotNull
    public final String getSellFiatAmount() {
        BigDecimal bigDecimalM86490A = C38346y.m86490A(this.fiatAmount);
        FastFeeModel fastFeeModel = this.feeResponse;
        BigDecimal bigDecimalSubtract = bigDecimalM86490A.subtract(C38346y.m86490A(fastFeeModel != null ? fastFeeModel.getFee() : null));
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return C27041f.m66669i(C41014a.m89946t(bigDecimalSubtract, null, 0, false, true, false, false, false, null, 0, 503, null), "--");
    }

    public int hashCode() {
        String str = this.fiatCurrency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cryptoCurrency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fiatAmount;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cryptoAmount;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.highPrice;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.paymentMethod;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.paymentMethodCode;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.paymentPicture;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.paymentType;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        FastFeeModel fastFeeModel = this.feeResponse;
        int iHashCode10 = (iHashCode9 + (fastFeeModel == null ? 0 : fastFeeModel.hashCode())) * 31;
        FiatLimitResponse fiatLimitResponse = this.fiatLimitResponse;
        int iHashCode11 = (iHashCode10 + (fiatLimitResponse == null ? 0 : fiatLimitResponse.hashCode())) * 31;
        FastRechargePaymentModel fastRechargePaymentModel = this.fiatRechargeResponse;
        int iHashCode12 = (iHashCode11 + (fastRechargePaymentModel == null ? 0 : fastRechargePaymentModel.hashCode())) * 31;
        FastBankPaymentModel fastBankPaymentModel = this.bankCardQuoteResponse;
        int iHashCode13 = (iHashCode12 + (fastBankPaymentModel == null ? 0 : fastBankPaymentModel.hashCode())) * 31;
        FastFiatCommonMode fastFiatCommonMode = this.commonFiatResponse;
        int iHashCode14 = (iHashCode13 + (fastFiatCommonMode == null ? 0 : fastFiatCommonMode.hashCode())) * 31;
        FastCommonOtcMode fastCommonOtcMode = this.commonOtcResponse;
        int iHashCode15 = (iHashCode14 + (fastCommonOtcMode == null ? 0 : fastCommonOtcMode.hashCode())) * 31;
        CardInfoModel cardInfoModel = this.selectCard;
        int iHashCode16 = (iHashCode15 + (cardInfoModel == null ? 0 : cardInfoModel.hashCode())) * 31;
        Boolean bool = this.forceRefresh;
        int iHashCode17 = (iHashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.needConfirm;
        int iHashCode18 = (iHashCode17 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        FastQuoteParams fastQuoteParams = this.quoteParams;
        return iHashCode18 + (fastQuoteParams != null ? fastQuoteParams.hashCode() : 0);
    }

    public final boolean isBalanceUnAvailable(@NotNull String balanceAmount) {
        Intrinsics.checkNotNullParameter(balanceAmount, "balanceAmount");
        BigDecimal bigDecimalM86490A = C38346y.m86490A(this.cryptoAmount);
        return bigDecimalM86490A.compareTo(BigDecimal.ZERO) == 1 && bigDecimalM86490A.compareTo(C38346y.m86490A(balanceAmount)) == 1;
    }

    public final boolean isFiatPayCheckLimit() {
        if (!CollectionsKt.contains(CollectionsKt.arrayListOf(PAY_BALANCE, PAY_BANK_CARD, "POPULAR_PAY"), this.paymentType)) {
            return false;
        }
        FiatLimitResponse fiatLimitResponse = this.fiatLimitResponse;
        if ((fiatLimitResponse != null ? fiatLimitResponse.getFiatMinAmount() : null) != null) {
            FiatLimitResponse fiatLimitResponse2 = this.fiatLimitResponse;
            if ((fiatLimitResponse2 != null ? fiatLimitResponse2.getFiatMaxAmount() : null) != null) {
                BigDecimal bigDecimalM86490A = C38346y.m86490A(this.fiatAmount);
                return bigDecimalM86490A.compareTo(BigDecimal.ZERO) != 1 || bigDecimalM86490A.compareTo(C38346y.m86490A(this.fiatLimitResponse.getFiatMinAmount())) <= -1 || bigDecimalM86490A.compareTo(C38346y.m86490A(this.fiatLimitResponse.getFiatMaxAmount())) >= 1;
            }
        }
        return false;
    }

    public final boolean isOtcType() {
        return Intrinsics.areEqual(this.paymentType, PAY_P2P);
    }

    public final boolean isOtcUnEnable() {
        FastCommonOtcMode fastCommonOtcMode = this.commonOtcResponse;
        if (C27025c.m66566d(fastCommonOtcMode != null ? fastCommonOtcMode.getAvailable() : null)) {
            return false;
        }
        FastCommonOtcMode fastCommonOtcMode2 = this.commonOtcResponse;
        return !C27025c.m66566d(fastCommonOtcMode2 != null ? fastCommonOtcMode2.getLimit() : null);
    }

    public final boolean isSameQuote(@Nullable FastQuoteModel quote) {
        if (Intrinsics.areEqual(this.paymentType, quote != null ? quote.paymentType : null)) {
            return Intrinsics.areEqual(this.paymentMethod, quote != null ? quote.paymentMethod : null);
        }
        return false;
    }

    public final boolean isUnAvailableAmount() {
        BigDecimal bigDecimalM86490A = C38346y.m86490A(this.fiatAmount);
        FastFeeModel fastFeeModel = this.feeResponse;
        return bigDecimalM86490A.subtract(C38346y.m86490A(fastFeeModel != null ? fastFeeModel.getFee() : null)).compareTo(BigDecimal.ZERO) == -1;
    }

    public final void setFeeResponse(@Nullable FastFeeModel fastFeeModel) {
        this.feeResponse = fastFeeModel;
    }

    public final void setPaymentMethod(@Nullable String str) {
        this.paymentMethod = str;
    }

    public final void setPaymentMethodCode(@Nullable String str) {
        this.paymentMethodCode = str;
    }

    public final void setPaymentPicture(@Nullable String str) {
        this.paymentPicture = str;
    }

    public final void setQuoteParams(@Nullable FastQuoteParams fastQuoteParams) {
        this.quoteParams = fastQuoteParams;
    }

    public final void setSelectCard(@Nullable CardInfoModel cardInfoModel) {
        this.selectCard = cardInfoModel;
    }

    @NotNull
    public String toString() {
        return "FastQuoteModel(fiatCurrency=" + this.fiatCurrency + ", cryptoCurrency=" + this.cryptoCurrency + ", fiatAmount=" + this.fiatAmount + ", cryptoAmount=" + this.cryptoAmount + ", highPrice=" + this.highPrice + ", paymentMethod=" + this.paymentMethod + ", paymentMethodCode=" + this.paymentMethodCode + ", paymentPicture=" + this.paymentPicture + ", paymentType=" + this.paymentType + ", feeResponse=" + this.feeResponse + ", fiatLimitResponse=" + this.fiatLimitResponse + ", fiatRechargeResponse=" + this.fiatRechargeResponse + ", bankCardQuoteResponse=" + this.bankCardQuoteResponse + ", commonFiatResponse=" + this.commonFiatResponse + ", commonOtcResponse=" + this.commonOtcResponse + ", selectCard=" + this.selectCard + ", forceRefresh=" + this.forceRefresh + ", needConfirm=" + this.needConfirm + ", quoteParams=" + this.quoteParams + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.fiatCurrency);
        dest.writeString(this.cryptoCurrency);
        dest.writeString(this.fiatAmount);
        dest.writeString(this.cryptoAmount);
        dest.writeString(this.highPrice);
        dest.writeString(this.paymentMethod);
        dest.writeString(this.paymentMethodCode);
        dest.writeString(this.paymentPicture);
        dest.writeString(this.paymentType);
        FastFeeModel fastFeeModel = this.feeResponse;
        if (fastFeeModel == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fastFeeModel.writeToParcel(dest, flags);
        }
        FiatLimitResponse fiatLimitResponse = this.fiatLimitResponse;
        if (fiatLimitResponse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fiatLimitResponse.writeToParcel(dest, flags);
        }
        FastRechargePaymentModel fastRechargePaymentModel = this.fiatRechargeResponse;
        if (fastRechargePaymentModel == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fastRechargePaymentModel.writeToParcel(dest, flags);
        }
        FastBankPaymentModel fastBankPaymentModel = this.bankCardQuoteResponse;
        if (fastBankPaymentModel == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fastBankPaymentModel.writeToParcel(dest, flags);
        }
        FastFiatCommonMode fastFiatCommonMode = this.commonFiatResponse;
        if (fastFiatCommonMode == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fastFiatCommonMode.writeToParcel(dest, flags);
        }
        FastCommonOtcMode fastCommonOtcMode = this.commonOtcResponse;
        if (fastCommonOtcMode == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fastCommonOtcMode.writeToParcel(dest, flags);
        }
        CardInfoModel cardInfoModel = this.selectCard;
        if (cardInfoModel == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cardInfoModel.writeToParcel(dest, flags);
        }
        Boolean bool = this.forceRefresh;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.needConfirm;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        FastQuoteParams fastQuoteParams = this.quoteParams;
        if (fastQuoteParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fastQuoteParams.writeToParcel(dest, flags);
        }
    }

    public FastQuoteModel(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable FastFeeModel fastFeeModel, @Nullable FiatLimitResponse fiatLimitResponse, @Nullable FastRechargePaymentModel fastRechargePaymentModel, @Nullable FastBankPaymentModel fastBankPaymentModel, @Nullable FastFiatCommonMode fastFiatCommonMode, @Nullable FastCommonOtcMode fastCommonOtcMode, @Nullable CardInfoModel cardInfoModel, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable FastQuoteParams fastQuoteParams) {
        this.fiatCurrency = str;
        this.cryptoCurrency = str2;
        this.fiatAmount = str3;
        this.cryptoAmount = str4;
        this.highPrice = str5;
        this.paymentMethod = str6;
        this.paymentMethodCode = str7;
        this.paymentPicture = str8;
        this.paymentType = str9;
        this.feeResponse = fastFeeModel;
        this.fiatLimitResponse = fiatLimitResponse;
        this.fiatRechargeResponse = fastRechargePaymentModel;
        this.bankCardQuoteResponse = fastBankPaymentModel;
        this.commonFiatResponse = fastFiatCommonMode;
        this.commonOtcResponse = fastCommonOtcMode;
        this.selectCard = cardInfoModel;
        this.forceRefresh = bool;
        this.needConfirm = bool2;
        this.quoteParams = fastQuoteParams;
    }
}
