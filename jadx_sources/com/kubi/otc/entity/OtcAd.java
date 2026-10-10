package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.kubi.utils.extensions.C27039d;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: OtcBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bH\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u009f\u00012\u00020\u0001:\u0002\u009f\u0001BÕ\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\u001a\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\"\u0018\u00010!j\n\u0012\u0004\u0012\u00020\"\u0018\u0001`#\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b(\u0010)B\t\b\u0016¢\u0006\u0004\b(\u0010*J\u0006\u0010k\u001a\u00020lJ\u0006\u0010m\u001a\u00020lJ\u0006\u0010n\u001a\u00020lJ\u0006\u0010o\u001a\u00020lJ\u0006\u0010p\u001a\u00020lJ\u0006\u0010q\u001a\u00020\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010}\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010QJ\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001e\u0010\u008c\u0001\u001a\u0016\u0012\u0004\u0012\u00020\"\u0018\u00010!j\n\u0012\u0004\u0012\u00020\"\u0018\u0001`#HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009c\u0003\u0010\u0091\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\"\u0018\u00010!j\n\u0012\u0004\u0012\u00020\"\u0018\u0001`#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010\u0092\u0001J\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001J\u0016\u0010\u0095\u0001\u001a\u00020l2\n\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0097\u0001HÖ\u0003J\u000b\u0010\u0098\u0001\u001a\u00030\u0094\u0001HÖ\u0001J\n\u0010\u0099\u0001\u001a\u00020\u0003HÖ\u0001J\u001c\u0010\u009a\u0001\u001a\u00030\u009b\u00012\b\u0010\u009c\u0001\u001a\u00030\u009d\u00012\b\u0010\u009e\u0001\u001a\u00030\u0094\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010,\"\u0004\b6\u0010.R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00108\"\u0004\b<\u0010:R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b?\u00108R\u001c\u0010\r\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00108\"\u0004\bA\u0010:R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u00108\"\u0004\bC\u0010:R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010,\"\u0004\bI\u0010.R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010,\"\u0004\bK\u0010.R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010,\"\u0004\bM\u0010.R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010,\"\u0004\bO\u0010.R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010R\u001a\u0004\bP\u0010QR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bS\u00108R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u0010,R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010,\"\u0004\bV\u0010.R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010,\"\u0004\bX\u0010.R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010,\"\u0004\bZ\u0010.R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010,\"\u0004\b\\\u0010.R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010,\"\u0004\b^\u0010.R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010,\"\u0004\b`\u0010.R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010,\"\u0004\bb\u0010.R.\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\"\u0018\u00010!j\n\u0012\u0004\u0012\u00020\"\u0018\u0001`#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0018\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010,R\u0018\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010,R\u0018\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010,R\u0018\u0010'\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010,¨\u0006 \u0001"}, m90084d2 = {"Lcom/kubi/otc/entity/OtcAd;", "Landroid/os/Parcelable;", "id", "", "side", FirebaseAnalytics.Param.CURRENCY, "legal", "priceType", "premium", "Ljava/math/BigDecimal;", "limitPrice", "currencyQuantity", "currencyBalanceQuantity", "limitMinQuote", "limitMaxQuote", "payTypeIds", "", "needKyc", "kycLevel", "remarks", "adTarget", "updatedAt", "", "floatPrice", "displayStatus", "tradeTimeLimit", "onlineType", "onlineTimeZone", "onlineStartDate", "onlineEndDate", "legalTradeTimesLimitType", "legalTradeTimesLimit", "adPayTypes", "Ljava/util/ArrayList;", "Lcom/kubi/otc/entity/AdPayType;", "Lkotlin/collections/ArrayList;", "topTag", "newUserTag", "topTagTip", "newUserTagTip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getSide", "setSide", "getCurrency", "setCurrency", "getLegal", "setLegal", "getPriceType", "setPriceType", "getPremium", "()Ljava/math/BigDecimal;", "setPremium", "(Ljava/math/BigDecimal;)V", "getLimitPrice", "setLimitPrice", "getCurrencyQuantity", "setCurrencyQuantity", "getCurrencyBalanceQuantity", "getLimitMinQuote", "setLimitMinQuote", "getLimitMaxQuote", "setLimitMaxQuote", "getPayTypeIds", "()Ljava/util/List;", "setPayTypeIds", "(Ljava/util/List;)V", "getNeedKyc", "setNeedKyc", "getKycLevel", "setKycLevel", "getRemarks", "setRemarks", "getAdTarget", "setAdTarget", "getUpdatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFloatPrice", "getDisplayStatus", "getTradeTimeLimit", "setTradeTimeLimit", "getOnlineType", "setOnlineType", "getOnlineTimeZone", "setOnlineTimeZone", "getOnlineStartDate", "setOnlineStartDate", "getOnlineEndDate", "setOnlineEndDate", "getLegalTradeTimesLimitType", "setLegalTradeTimesLimitType", "getLegalTradeTimesLimit", "setLegalTradeTimesLimit", "getAdPayTypes", "()Ljava/util/ArrayList;", "setAdPayTypes", "(Ljava/util/ArrayList;)V", "getTopTag", "getNewUserTag", "getTopTagTip", "getNewUserTagTip", "isBuy", "", "isSell", "isShow", "isFloatType", "isFixTimeType", "getPayTypeParam", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/otc/entity/OtcAd;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOtcBean.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcBean.kt\ncom/kubi/otc/entity/OtcAd\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n1878#2,3:711\n*S KotlinDebug\n*F\n+ 1 OtcBean.kt\ncom/kubi/otc/entity/OtcAd\n*L\n666#1:711,3\n*E\n"})
public final /* data */ class OtcAd implements Parcelable {

    @NotNull
    public static final String AD_TARGET_ALL = "1";

    @NotNull
    public static final String AD_TARGET_NOT_BUSINESS = "2";

    @NotNull
    public static final String KYC_LEVER_1 = "1";

    @NotNull
    public static final String KYC_LEVER_2 = "2";

    @NotNull
    public static final String KYC_NO = "NO";

    @NotNull
    public static final String KYC_NOT_PASS = "-1";

    @NotNull
    public static final String KYC_YES = "YES";

    @NotNull
    public static final String ONLINE_ALL_TIME_TYPE = "0";

    @NotNull
    public static final String ONLINE_FIX_TIME_TYPE = "1";

    @NotNull
    public static final String SIDE_BUY = "BUY";

    @NotNull
    public static final String SIDE_SELL = "SELL";

    @NotNull
    public static final String STATUS_HIDDEN = "HIDDEN";

    @NotNull
    public static final String STATUS_NORMAL = "NORMAL";

    @NotNull
    public static final String TRADE_NUM_FIVE = "5";

    @NotNull
    public static final String TRADE_NUM_GT = "gt";

    @NotNull
    public static final String TRADE_NUM_LT = "lt";

    @NotNull
    public static final String TRADE_NUM_NONE = "none";

    @NotNull
    public static final String TRADE_NUM_ONE = "1";

    @NotNull
    public static final String TRADE_NUM_TEN = "10";

    @NotNull
    public static final String TRADE_NUM_THIRTY = "30";

    @NotNull
    public static final String TRADE_NUM_THREE = "3";

    @NotNull
    public static final String TRADE_NUM_TWENTY = "20";

    @NotNull
    public static final String TRADE_TIME_FIFTEEN = "15";

    @NotNull
    public static final String TRADE_TIME_FORTYFIVE = "45";

    @NotNull
    public static final String TRADE_TIME_SIXTY = "60";

    @NotNull
    public static final String TRADE_TIME_THIRTY = "30";

    @NotNull
    public static final String TYPE_FLOAT = "FLOAT";

    @NotNull
    public static final String TYPE_REGULAR = "REGULAR";

    @Nullable
    private ArrayList<AdPayType> adPayTypes;

    @Nullable
    private String adTarget;

    @Nullable
    private String currency;

    @Nullable
    private final BigDecimal currencyBalanceQuantity;

    @Nullable
    private BigDecimal currencyQuantity;

    @Nullable
    private final String displayStatus;

    @Nullable
    private final BigDecimal floatPrice;

    @Nullable
    private String id;

    @Nullable
    private String kycLevel;

    @Nullable
    private String legal;

    @Nullable
    private String legalTradeTimesLimit;

    @Nullable
    private String legalTradeTimesLimitType;

    @Nullable
    private BigDecimal limitMaxQuote;

    @Nullable
    private BigDecimal limitMinQuote;

    @Nullable
    private BigDecimal limitPrice;

    @Nullable
    private String needKyc;

    @SerializedName("newUserTag")
    @Nullable
    private final String newUserTag;

    @SerializedName("newUserTagTip")
    @Nullable
    private final String newUserTagTip;

    @Nullable
    private String onlineEndDate;

    @Nullable
    private String onlineStartDate;

    @Nullable
    private String onlineTimeZone;

    @Nullable
    private String onlineType;

    @Nullable
    private List<String> payTypeIds;

    @Nullable
    private BigDecimal premium;

    @Nullable
    private String priceType;

    @Nullable
    private String remarks;

    @Nullable
    private String side;

    @SerializedName("topTag")
    @Nullable
    private final String topTag;

    @SerializedName("topTagTip")
    @Nullable
    private final String topTagTip;

    @Nullable
    private String tradeTimeLimit;

    @Nullable
    private final Long updatedAt;

    @NotNull
    public static final Parcelable.Creator<OtcAd> CREATOR = new Creator();

    /* JADX INFO: compiled from: OtcBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<OtcAd> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OtcAd createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal6 = (BigDecimal) parcel.readSerializable();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            ArrayList arrayList = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            BigDecimal bigDecimal7 = (BigDecimal) parcel.readSerializable();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                int i12 = 0;
                while (i12 != i11) {
                    arrayList.add(AdPayType.CREATOR.createFromParcel(parcel));
                    i12++;
                    i11 = i11;
                }
                string = string;
            }
            return new OtcAd(string, string2, string3, string4, string5, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, arrayListCreateStringArrayList, string6, string7, string8, string9, lValueOf, bigDecimal7, string10, string11, string12, string13, string14, string15, string16, string17, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OtcAd[] newArray(int i11) {
            return new OtcAd[i11];
        }
    }

    public OtcAd(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable List<String> list, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Long l11, @Nullable BigDecimal bigDecimal7, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable ArrayList<AdPayType> arrayList, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21) {
        this.id = str;
        this.side = str2;
        this.currency = str3;
        this.legal = str4;
        this.priceType = str5;
        this.premium = bigDecimal;
        this.limitPrice = bigDecimal2;
        this.currencyQuantity = bigDecimal3;
        this.currencyBalanceQuantity = bigDecimal4;
        this.limitMinQuote = bigDecimal5;
        this.limitMaxQuote = bigDecimal6;
        this.payTypeIds = list;
        this.needKyc = str6;
        this.kycLevel = str7;
        this.remarks = str8;
        this.adTarget = str9;
        this.updatedAt = l11;
        this.floatPrice = bigDecimal7;
        this.displayStatus = str10;
        this.tradeTimeLimit = str11;
        this.onlineType = str12;
        this.onlineTimeZone = str13;
        this.onlineStartDate = str14;
        this.onlineEndDate = str15;
        this.legalTradeTimesLimitType = str16;
        this.legalTradeTimesLimit = str17;
        this.adPayTypes = arrayList;
        this.topTag = str18;
        this.newUserTag = str19;
        this.topTagTip = str20;
        this.newUserTagTip = str21;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OtcAd copy$default(OtcAd otcAd, String str, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, List list, String str6, String str7, String str8, String str9, Long l11, BigDecimal bigDecimal7, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, ArrayList arrayList, String str18, String str19, String str20, String str21, int i11, Object obj) {
        String str22;
        String str23;
        String str24 = (i11 & 1) != 0 ? otcAd.id : str;
        String str25 = (i11 & 2) != 0 ? otcAd.side : str2;
        String str26 = (i11 & 4) != 0 ? otcAd.currency : str3;
        String str27 = (i11 & 8) != 0 ? otcAd.legal : str4;
        String str28 = (i11 & 16) != 0 ? otcAd.priceType : str5;
        BigDecimal bigDecimal8 = (i11 & 32) != 0 ? otcAd.premium : bigDecimal;
        BigDecimal bigDecimal9 = (i11 & 64) != 0 ? otcAd.limitPrice : bigDecimal2;
        BigDecimal bigDecimal10 = (i11 & 128) != 0 ? otcAd.currencyQuantity : bigDecimal3;
        BigDecimal bigDecimal11 = (i11 & 256) != 0 ? otcAd.currencyBalanceQuantity : bigDecimal4;
        BigDecimal bigDecimal12 = (i11 & 512) != 0 ? otcAd.limitMinQuote : bigDecimal5;
        BigDecimal bigDecimal13 = (i11 & 1024) != 0 ? otcAd.limitMaxQuote : bigDecimal6;
        List list2 = (i11 & 2048) != 0 ? otcAd.payTypeIds : list;
        String str29 = (i11 & 4096) != 0 ? otcAd.needKyc : str6;
        String str30 = (i11 & 8192) != 0 ? otcAd.kycLevel : str7;
        String str31 = str24;
        String str32 = (i11 & 16384) != 0 ? otcAd.remarks : str8;
        String str33 = (i11 & 32768) != 0 ? otcAd.adTarget : str9;
        Long l12 = (i11 & 65536) != 0 ? otcAd.updatedAt : l11;
        BigDecimal bigDecimal14 = (i11 & 131072) != 0 ? otcAd.floatPrice : bigDecimal7;
        String str34 = (i11 & 262144) != 0 ? otcAd.displayStatus : str10;
        String str35 = (i11 & 524288) != 0 ? otcAd.tradeTimeLimit : str11;
        String str36 = (i11 & 1048576) != 0 ? otcAd.onlineType : str12;
        String str37 = (i11 & 2097152) != 0 ? otcAd.onlineTimeZone : str13;
        String str38 = (i11 & 4194304) != 0 ? otcAd.onlineStartDate : str14;
        String str39 = (i11 & 8388608) != 0 ? otcAd.onlineEndDate : str15;
        String str40 = (i11 & 16777216) != 0 ? otcAd.legalTradeTimesLimitType : str16;
        String str41 = (i11 & 33554432) != 0 ? otcAd.legalTradeTimesLimit : str17;
        ArrayList arrayList2 = (i11 & 67108864) != 0 ? otcAd.adPayTypes : arrayList;
        String str42 = (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? otcAd.topTag : str18;
        String str43 = (i11 & 268435456) != 0 ? otcAd.newUserTag : str19;
        String str44 = (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? otcAd.topTagTip : str20;
        if ((i11 & 1073741824) != 0) {
            str23 = str44;
            str22 = otcAd.newUserTagTip;
        } else {
            str22 = str21;
            str23 = str44;
        }
        return otcAd.copy(str31, str25, str26, str27, str28, bigDecimal8, bigDecimal9, bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13, list2, str29, str30, str32, str33, l12, bigDecimal14, str34, str35, str36, str37, str38, str39, str40, str41, arrayList2, str42, str43, str23, str22);
    }

    @NotNull
    public final OtcAd copy(@Nullable String id2, @Nullable String side, @Nullable String currency, @Nullable String legal, @Nullable String priceType, @Nullable BigDecimal premium, @Nullable BigDecimal limitPrice, @Nullable BigDecimal currencyQuantity, @Nullable BigDecimal currencyBalanceQuantity, @Nullable BigDecimal limitMinQuote, @Nullable BigDecimal limitMaxQuote, @Nullable List<String> payTypeIds, @Nullable String needKyc, @Nullable String kycLevel, @Nullable String remarks, @Nullable String adTarget, @Nullable Long updatedAt, @Nullable BigDecimal floatPrice, @Nullable String displayStatus, @Nullable String tradeTimeLimit, @Nullable String onlineType, @Nullable String onlineTimeZone, @Nullable String onlineStartDate, @Nullable String onlineEndDate, @Nullable String legalTradeTimesLimitType, @Nullable String legalTradeTimesLimit, @Nullable ArrayList<AdPayType> adPayTypes, @Nullable String topTag, @Nullable String newUserTag, @Nullable String topTagTip, @Nullable String newUserTagTip) {
        return new OtcAd(id2, side, currency, legal, priceType, premium, limitPrice, currencyQuantity, currencyBalanceQuantity, limitMinQuote, limitMaxQuote, payTypeIds, needKyc, kycLevel, remarks, adTarget, updatedAt, floatPrice, displayStatus, tradeTimeLimit, onlineType, onlineTimeZone, onlineStartDate, onlineEndDate, legalTradeTimesLimitType, legalTradeTimesLimit, adPayTypes, topTag, newUserTag, topTagTip, newUserTagTip);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtcAd)) {
            return false;
        }
        OtcAd otcAd = (OtcAd) other;
        return Intrinsics.areEqual(this.id, otcAd.id) && Intrinsics.areEqual(this.side, otcAd.side) && Intrinsics.areEqual(this.currency, otcAd.currency) && Intrinsics.areEqual(this.legal, otcAd.legal) && Intrinsics.areEqual(this.priceType, otcAd.priceType) && Intrinsics.areEqual(this.premium, otcAd.premium) && Intrinsics.areEqual(this.limitPrice, otcAd.limitPrice) && Intrinsics.areEqual(this.currencyQuantity, otcAd.currencyQuantity) && Intrinsics.areEqual(this.currencyBalanceQuantity, otcAd.currencyBalanceQuantity) && Intrinsics.areEqual(this.limitMinQuote, otcAd.limitMinQuote) && Intrinsics.areEqual(this.limitMaxQuote, otcAd.limitMaxQuote) && Intrinsics.areEqual(this.payTypeIds, otcAd.payTypeIds) && Intrinsics.areEqual(this.needKyc, otcAd.needKyc) && Intrinsics.areEqual(this.kycLevel, otcAd.kycLevel) && Intrinsics.areEqual(this.remarks, otcAd.remarks) && Intrinsics.areEqual(this.adTarget, otcAd.adTarget) && Intrinsics.areEqual(this.updatedAt, otcAd.updatedAt) && Intrinsics.areEqual(this.floatPrice, otcAd.floatPrice) && Intrinsics.areEqual(this.displayStatus, otcAd.displayStatus) && Intrinsics.areEqual(this.tradeTimeLimit, otcAd.tradeTimeLimit) && Intrinsics.areEqual(this.onlineType, otcAd.onlineType) && Intrinsics.areEqual(this.onlineTimeZone, otcAd.onlineTimeZone) && Intrinsics.areEqual(this.onlineStartDate, otcAd.onlineStartDate) && Intrinsics.areEqual(this.onlineEndDate, otcAd.onlineEndDate) && Intrinsics.areEqual(this.legalTradeTimesLimitType, otcAd.legalTradeTimesLimitType) && Intrinsics.areEqual(this.legalTradeTimesLimit, otcAd.legalTradeTimesLimit) && Intrinsics.areEqual(this.adPayTypes, otcAd.adPayTypes) && Intrinsics.areEqual(this.topTag, otcAd.topTag) && Intrinsics.areEqual(this.newUserTag, otcAd.newUserTag) && Intrinsics.areEqual(this.topTagTip, otcAd.topTagTip) && Intrinsics.areEqual(this.newUserTagTip, otcAd.newUserTagTip);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getLimitMinQuote() {
        return this.limitMinQuote;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getLimitMaxQuote() {
        return this.limitMaxQuote;
    }

    @Nullable
    public final List<String> component12() {
        return this.payTypeIds;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getNeedKyc() {
        return this.needKyc;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getKycLevel() {
        return this.kycLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getRemarks() {
        return this.remarks;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getAdTarget() {
        return this.adTarget;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final BigDecimal getFloatPrice() {
        return this.floatPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getDisplayStatus() {
        return this.displayStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getTradeTimeLimit() {
        return this.tradeTimeLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getOnlineType() {
        return this.onlineType;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getOnlineTimeZone() {
        return this.onlineTimeZone;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getOnlineStartDate() {
        return this.onlineStartDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getOnlineEndDate() {
        return this.onlineEndDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getLegalTradeTimesLimitType() {
        return this.legalTradeTimesLimitType;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getLegalTradeTimesLimit() {
        return this.legalTradeTimesLimit;
    }

    @Nullable
    public final ArrayList<AdPayType> component27() {
        return this.adPayTypes;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getTopTag() {
        return this.topTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getNewUserTag() {
        return this.newUserTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getTopTagTip() {
        return this.topTagTip;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getNewUserTagTip() {
        return this.newUserTagTip;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLegal() {
        return this.legal;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPriceType() {
        return this.priceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getPremium() {
        return this.premium;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getLimitPrice() {
        return this.limitPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getCurrencyQuantity() {
        return this.currencyQuantity;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getCurrencyBalanceQuantity() {
        return this.currencyBalanceQuantity;
    }

    @Nullable
    public final ArrayList<AdPayType> getAdPayTypes() {
        return this.adPayTypes;
    }

    @Nullable
    public final String getAdTarget() {
        return this.adTarget;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getCurrencyBalanceQuantity() {
        return this.currencyBalanceQuantity;
    }

    @Nullable
    public final BigDecimal getCurrencyQuantity() {
        return this.currencyQuantity;
    }

    @Nullable
    public final String getDisplayStatus() {
        return this.displayStatus;
    }

    @Nullable
    public final BigDecimal getFloatPrice() {
        return this.floatPrice;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getKycLevel() {
        return this.kycLevel;
    }

    @Nullable
    public final String getLegal() {
        return this.legal;
    }

    @Nullable
    public final String getLegalTradeTimesLimit() {
        return this.legalTradeTimesLimit;
    }

    @Nullable
    public final String getLegalTradeTimesLimitType() {
        return this.legalTradeTimesLimitType;
    }

    @Nullable
    public final BigDecimal getLimitMaxQuote() {
        return this.limitMaxQuote;
    }

    @Nullable
    public final BigDecimal getLimitMinQuote() {
        return this.limitMinQuote;
    }

    @Nullable
    public final BigDecimal getLimitPrice() {
        return this.limitPrice;
    }

    @Nullable
    public final String getNeedKyc() {
        return this.needKyc;
    }

    @Nullable
    public final String getNewUserTag() {
        return this.newUserTag;
    }

    @Nullable
    public final String getNewUserTagTip() {
        return this.newUserTagTip;
    }

    @Nullable
    public final String getOnlineEndDate() {
        return this.onlineEndDate;
    }

    @Nullable
    public final String getOnlineStartDate() {
        return this.onlineStartDate;
    }

    @Nullable
    public final String getOnlineTimeZone() {
        return this.onlineTimeZone;
    }

    @Nullable
    public final String getOnlineType() {
        return this.onlineType;
    }

    @Nullable
    public final List<String> getPayTypeIds() {
        return this.payTypeIds;
    }

    @NotNull
    public final String getPayTypeParam() {
        List<String> list;
        List<String> list2 = this.payTypeIds;
        String string = "";
        if (list2 != null && !list2.isEmpty() && (list = this.payTypeIds) != null) {
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                List<String> list3 = this.payTypeIds;
                if (i11 != C27039d.m66650j(list3 != null ? Integer.valueOf(list3.size()) : null) - 1) {
                    str = str + ',';
                }
                sb2.append(str);
                string = sb2.toString();
                i11 = i12;
            }
        }
        return string;
    }

    @Nullable
    public final BigDecimal getPremium() {
        return this.premium;
    }

    @Nullable
    public final String getPriceType() {
        return this.priceType;
    }

    @Nullable
    public final String getRemarks() {
        return this.remarks;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final String getTopTag() {
        return this.topTag;
    }

    @Nullable
    public final String getTopTagTip() {
        return this.topTagTip;
    }

    @Nullable
    public final String getTradeTimeLimit() {
        return this.tradeTimeLimit;
    }

    @Nullable
    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.side;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.legal;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.priceType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal = this.premium;
        int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.limitPrice;
        int iHashCode7 = (iHashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.currencyQuantity;
        int iHashCode8 = (iHashCode7 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.currencyBalanceQuantity;
        int iHashCode9 = (iHashCode8 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.limitMinQuote;
        int iHashCode10 = (iHashCode9 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.limitMaxQuote;
        int iHashCode11 = (iHashCode10 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        List<String> list = this.payTypeIds;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.needKyc;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.kycLevel;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.remarks;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.adTarget;
        int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l11 = this.updatedAt;
        int iHashCode17 = (iHashCode16 + (l11 == null ? 0 : l11.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.floatPrice;
        int iHashCode18 = (iHashCode17 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        String str10 = this.displayStatus;
        int iHashCode19 = (iHashCode18 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.tradeTimeLimit;
        int iHashCode20 = (iHashCode19 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.onlineType;
        int iHashCode21 = (iHashCode20 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.onlineTimeZone;
        int iHashCode22 = (iHashCode21 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.onlineStartDate;
        int iHashCode23 = (iHashCode22 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.onlineEndDate;
        int iHashCode24 = (iHashCode23 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.legalTradeTimesLimitType;
        int iHashCode25 = (iHashCode24 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.legalTradeTimesLimit;
        int iHashCode26 = (iHashCode25 + (str17 == null ? 0 : str17.hashCode())) * 31;
        ArrayList<AdPayType> arrayList = this.adPayTypes;
        int iHashCode27 = (iHashCode26 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str18 = this.topTag;
        int iHashCode28 = (iHashCode27 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.newUserTag;
        int iHashCode29 = (iHashCode28 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.topTagTip;
        int iHashCode30 = (iHashCode29 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.newUserTagTip;
        return iHashCode30 + (str21 != null ? str21.hashCode() : 0);
    }

    public final boolean isBuy() {
        return Intrinsics.areEqual(this.side, "BUY");
    }

    public final boolean isFixTimeType() {
        return Intrinsics.areEqual(this.onlineType, "1");
    }

    public final boolean isFloatType() {
        return Intrinsics.areEqual(this.priceType, "FLOAT");
    }

    public final boolean isSell() {
        return Intrinsics.areEqual(this.side, "SELL");
    }

    public final boolean isShow() {
        return Intrinsics.areEqual(this.displayStatus, STATUS_NORMAL);
    }

    public final void setAdPayTypes(@Nullable ArrayList<AdPayType> arrayList) {
        this.adPayTypes = arrayList;
    }

    public final void setAdTarget(@Nullable String str) {
        this.adTarget = str;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setCurrencyQuantity(@Nullable BigDecimal bigDecimal) {
        this.currencyQuantity = bigDecimal;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setKycLevel(@Nullable String str) {
        this.kycLevel = str;
    }

    public final void setLegal(@Nullable String str) {
        this.legal = str;
    }

    public final void setLegalTradeTimesLimit(@Nullable String str) {
        this.legalTradeTimesLimit = str;
    }

    public final void setLegalTradeTimesLimitType(@Nullable String str) {
        this.legalTradeTimesLimitType = str;
    }

    public final void setLimitMaxQuote(@Nullable BigDecimal bigDecimal) {
        this.limitMaxQuote = bigDecimal;
    }

    public final void setLimitMinQuote(@Nullable BigDecimal bigDecimal) {
        this.limitMinQuote = bigDecimal;
    }

    public final void setLimitPrice(@Nullable BigDecimal bigDecimal) {
        this.limitPrice = bigDecimal;
    }

    public final void setNeedKyc(@Nullable String str) {
        this.needKyc = str;
    }

    public final void setOnlineEndDate(@Nullable String str) {
        this.onlineEndDate = str;
    }

    public final void setOnlineStartDate(@Nullable String str) {
        this.onlineStartDate = str;
    }

    public final void setOnlineTimeZone(@Nullable String str) {
        this.onlineTimeZone = str;
    }

    public final void setOnlineType(@Nullable String str) {
        this.onlineType = str;
    }

    public final void setPayTypeIds(@Nullable List<String> list) {
        this.payTypeIds = list;
    }

    public final void setPremium(@Nullable BigDecimal bigDecimal) {
        this.premium = bigDecimal;
    }

    public final void setPriceType(@Nullable String str) {
        this.priceType = str;
    }

    public final void setRemarks(@Nullable String str) {
        this.remarks = str;
    }

    public final void setSide(@Nullable String str) {
        this.side = str;
    }

    public final void setTradeTimeLimit(@Nullable String str) {
        this.tradeTimeLimit = str;
    }

    @NotNull
    public String toString() {
        return "OtcAd(id=" + this.id + ", side=" + this.side + ", currency=" + this.currency + ", legal=" + this.legal + ", priceType=" + this.priceType + ", premium=" + this.premium + ", limitPrice=" + this.limitPrice + ", currencyQuantity=" + this.currencyQuantity + ", currencyBalanceQuantity=" + this.currencyBalanceQuantity + ", limitMinQuote=" + this.limitMinQuote + ", limitMaxQuote=" + this.limitMaxQuote + ", payTypeIds=" + this.payTypeIds + ", needKyc=" + this.needKyc + ", kycLevel=" + this.kycLevel + ", remarks=" + this.remarks + ", adTarget=" + this.adTarget + ", updatedAt=" + this.updatedAt + ", floatPrice=" + this.floatPrice + ", displayStatus=" + this.displayStatus + ", tradeTimeLimit=" + this.tradeTimeLimit + ", onlineType=" + this.onlineType + ", onlineTimeZone=" + this.onlineTimeZone + ", onlineStartDate=" + this.onlineStartDate + ", onlineEndDate=" + this.onlineEndDate + ", legalTradeTimesLimitType=" + this.legalTradeTimesLimitType + ", legalTradeTimesLimit=" + this.legalTradeTimesLimit + ", adPayTypes=" + this.adPayTypes + ", topTag=" + this.topTag + ", newUserTag=" + this.newUserTag + ", topTagTip=" + this.topTagTip + ", newUserTagTip=" + this.newUserTagTip + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.side);
        dest.writeString(this.currency);
        dest.writeString(this.legal);
        dest.writeString(this.priceType);
        dest.writeSerializable(this.premium);
        dest.writeSerializable(this.limitPrice);
        dest.writeSerializable(this.currencyQuantity);
        dest.writeSerializable(this.currencyBalanceQuantity);
        dest.writeSerializable(this.limitMinQuote);
        dest.writeSerializable(this.limitMaxQuote);
        dest.writeStringList(this.payTypeIds);
        dest.writeString(this.needKyc);
        dest.writeString(this.kycLevel);
        dest.writeString(this.remarks);
        dest.writeString(this.adTarget);
        Long l11 = this.updatedAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeSerializable(this.floatPrice);
        dest.writeString(this.displayStatus);
        dest.writeString(this.tradeTimeLimit);
        dest.writeString(this.onlineType);
        dest.writeString(this.onlineTimeZone);
        dest.writeString(this.onlineStartDate);
        dest.writeString(this.onlineEndDate);
        dest.writeString(this.legalTradeTimesLimitType);
        dest.writeString(this.legalTradeTimesLimit);
        ArrayList<AdPayType> arrayList = this.adPayTypes;
        if (arrayList == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(arrayList.size());
            Iterator<AdPayType> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.topTag);
        dest.writeString(this.newUserTag);
        dest.writeString(this.topTagTip);
        dest.writeString(this.newUserTagTip);
    }

    public OtcAd() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
