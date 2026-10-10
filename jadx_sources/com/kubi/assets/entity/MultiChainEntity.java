package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.SubscriptionInfoEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MultiChainEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\bj\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010(\u001a\u00020\u000f\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u001f¢\u0006\u0004\b+\u0010,J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010y\u001a\u00020\u000fHÆ\u0003J\t\u0010z\u001a\u00020\u000fHÆ\u0003J\t\u0010{\u001a\u00020\u0012HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010~\u001a\u00020\u000fHÆ\u0003J\t\u0010\u007f\u001a\u00020\u000fHÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u000fHÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u0012\u0010\u0086\u0001\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fHÆ\u0003J\u0012\u0010\u0087\u0001\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fHÆ\u0003J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010cJ\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010hJ\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u000fHÆ\u0003J\u0012\u0010\u008f\u0001\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u001fHÆ\u0003J¤\u0003\u0010\u0090\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010(\u001a\u00020\u000f2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u001fHÆ\u0001¢\u0006\u0003\u0010\u0091\u0001J\u0007\u0010\u0092\u0001\u001a\u00020\u0012J\u0016\u0010\u0093\u0001\u001a\u00020\u000f2\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u0001HÖ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0012HÖ\u0001J\n\u0010\u0097\u0001\u001a\u00020\u0003HÖ\u0001J\u001b\u0010\u0098\u0001\u001a\u00030\u0099\u00012\b\u0010\u009a\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009c\u0001\u001a\u00020\u0012R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010.\"\u0004\b8\u00100R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010.\"\u0004\b:\u00100R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010.\"\u0004\b>\u00100R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010.\"\u0004\b?\u00100R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010.\"\u0004\bA\u00100R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010.\"\u0004\bC\u00100R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010D\"\u0004\bE\u0010FR\u001a\u0010\u0010\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010D\"\u0004\bG\u0010FR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010.\"\u0004\bM\u00100R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010.\"\u0004\bO\u00100R\u001a\u0010\u0015\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010D\"\u0004\bP\u0010FR\u001a\u0010\u0016\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010D\"\u0004\bQ\u0010FR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010.\"\u0004\bS\u00100R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010.\"\u0004\bU\u00100R\u001a\u0010\u0019\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010D\"\u0004\bV\u0010FR\u001a\u0010\u001a\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010D\"\u0004\bW\u0010FR\u001a\u0010\u001b\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010D\"\u0004\bX\u0010FR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010^\"\u0004\bb\u0010`R\u0015\u0010\"\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010d\u001a\u0004\b\"\u0010cR\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u0010.R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bf\u0010.R\u0015\u0010%\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010i\u001a\u0004\bg\u0010hR\u0013\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bj\u0010.R\u0013\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bk\u0010.R\u0011\u0010(\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010DR\"\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010^\"\u0004\bm\u0010`¨\u0006\u009d\u0001"}, m90084d2 = {"Lcom/kubi/assets/entity/MultiChainEntity;", "Landroid/os/Parcelable;", "txUrl", "", "chainId", "chainName", "chainFullName", "withdrawMinFee", "confirmationCount", "preConfirmationCount", "depositMinSize", "isChainEnabled", "contractAddress", "withdrawMinSize", "isWithdrawEnabled", "", "isDepositEnabled", "walletPrecision", "", "orgAddress", "userAddressName", "isSelected", "isMatch", "withdrawDisabledTip", "withdrawPredictTime", "isUniversalChain", "isLastDepositUse", "isClickable", "subscriptionInfo", "Lcom/kubi/data/entity/SubscriptionInfoEntity;", "depositLabel", "", "Lcom/kubi/assets/entity/LabelEntity;", "withdrawLabel", "isInvoiceChain", "depositMaxSize", "withdrawMaxSize", "depositPredictTime", FirebaseAnalytics.Param.CURRENCY, "withdrawMemo", "isEvm", "evmSubChains", "Lcom/kubi/assets/entity/EvmChainEntity;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZZZLcom/kubi/data/entity/SubscriptionInfoEntity;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getTxUrl", "()Ljava/lang/String;", "setTxUrl", "(Ljava/lang/String;)V", "getChainId", "setChainId", "getChainName", "setChainName", "getChainFullName", "setChainFullName", "getWithdrawMinFee", "setWithdrawMinFee", "getConfirmationCount", "setConfirmationCount", "getPreConfirmationCount", "setPreConfirmationCount", "getDepositMinSize", "setDepositMinSize", "setChainEnabled", "getContractAddress", "setContractAddress", "getWithdrawMinSize", "setWithdrawMinSize", "()Z", "setWithdrawEnabled", "(Z)V", "setDepositEnabled", "getWalletPrecision", "()I", "setWalletPrecision", "(I)V", "getOrgAddress", "setOrgAddress", "getUserAddressName", "setUserAddressName", "setSelected", "setMatch", "getWithdrawDisabledTip", "setWithdrawDisabledTip", "getWithdrawPredictTime", "setWithdrawPredictTime", "setUniversalChain", "setLastDepositUse", "setClickable", "getSubscriptionInfo", "()Lcom/kubi/data/entity/SubscriptionInfoEntity;", "setSubscriptionInfo", "(Lcom/kubi/data/entity/SubscriptionInfoEntity;)V", "getDepositLabel", "()Ljava/util/List;", "setDepositLabel", "(Ljava/util/List;)V", "getWithdrawLabel", "setWithdrawLabel", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDepositMaxSize", "getWithdrawMaxSize", "getDepositPredictTime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrency", "getWithdrawMemo", "getEvmSubChains", "setEvmSubChains", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZZZLcom/kubi/data/entity/SubscriptionInfoEntity;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)Lcom/kubi/assets/entity/MultiChainEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MultiChainEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MultiChainEntity> CREATOR = new Creator();

    @Nullable
    private String chainFullName;

    @NotNull
    private String chainId;

    @NotNull
    private String chainName;

    @Nullable
    private String confirmationCount;

    @Nullable
    private String contractAddress;

    @Nullable
    private final String currency;

    @Nullable
    private List<LabelEntity> depositLabel;

    @Nullable
    private final String depositMaxSize;

    @Nullable
    private String depositMinSize;

    @Nullable
    private final Integer depositPredictTime;

    @Nullable
    private List<EvmChainEntity> evmSubChains;

    @Nullable
    private String isChainEnabled;
    private boolean isClickable;
    private boolean isDepositEnabled;
    private final boolean isEvm;

    @Nullable
    private final Boolean isInvoiceChain;
    private boolean isLastDepositUse;
    private boolean isMatch;
    private boolean isSelected;
    private boolean isUniversalChain;
    private boolean isWithdrawEnabled;

    @Nullable
    private String orgAddress;

    @Nullable
    private String preConfirmationCount;

    @Nullable
    private SubscriptionInfoEntity subscriptionInfo;

    @Nullable
    private String txUrl;

    @Nullable
    private String userAddressName;
    private int walletPrecision;

    @Nullable
    private String withdrawDisabledTip;

    @Nullable
    private List<LabelEntity> withdrawLabel;

    @Nullable
    private final String withdrawMaxSize;

    @Nullable
    private final String withdrawMemo;

    @Nullable
    private String withdrawMinFee;

    @Nullable
    private String withdrawMinSize;

    @Nullable
    private String withdrawPredictTime;

    /* JADX INFO: compiled from: MultiChainEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<MultiChainEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v25, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v26 */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r36v4, types: [java.util.List] */
        @Override // android.os.Parcelable.Creator
        public final MultiChainEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean boolValueOf;
            Integer num;
            ?? arrayList3;
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
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            boolean z11 = true;
            if (parcel.readInt() == 0) {
                z11 = false;
            }
            boolean z12 = parcel.readInt() != 0;
            int i11 = parcel.readInt();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            boolean z13 = parcel.readInt() != 0 ? z11 : false;
            boolean z14 = parcel.readInt() != 0 ? z11 : false;
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            boolean z15 = parcel.readInt() != 0 ? z11 : false;
            boolean z16 = parcel.readInt() != 0 ? z11 : false;
            boolean z17 = parcel.readInt() != 0 ? z11 : false;
            SubscriptionInfoEntity subscriptionInfoEntity = (SubscriptionInfoEntity) parcel.readParcelable(MultiChainEntity.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int i13 = 0;
                while (i13 != i12) {
                    arrayList.add(LabelEntity.CREATOR.createFromParcel(parcel));
                    i13++;
                    i12 = i12;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i14 = parcel.readInt();
                arrayList2 = new ArrayList(i14);
                int i15 = 0;
                while (i15 != i14) {
                    arrayList2.add(LabelEntity.CREATOR.createFromParcel(parcel));
                    i15++;
                    i14 = i14;
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
                num = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                num = null;
            }
            ArrayList arrayList4 = arrayList2;
            String string16 = parcel.readString();
            ArrayList arrayList5 = arrayList;
            String string17 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            String string18 = parcel.readString();
            boolean z18 = true;
            Integer num2 = numValueOf;
            String string19 = parcel.readString();
            if (parcel.readInt() == 0) {
                z18 = false;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = num;
            } else {
                int i16 = parcel.readInt();
                arrayList3 = new ArrayList(i16);
                int i17 = 0;
                while (i17 != i16) {
                    arrayList3.add(EvmChainEntity.CREATOR.createFromParcel(parcel));
                    i17++;
                    i16 = i16;
                }
            }
            return new MultiChainEntity(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, z11, z12, i11, string12, string13, z13, z14, string14, string15, z15, z16, z17, subscriptionInfoEntity, arrayList5, arrayList4, boolValueOf, string16, string17, num2, string18, string19, z18, arrayList3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MultiChainEntity[] newArray(int i11) {
            return new MultiChainEntity[i11];
        }
    }

    public MultiChainEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, false, false, null, null, false, false, false, null, null, null, null, null, null, null, null, null, false, null, -1, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiChainEntity copy$default(MultiChainEntity multiChainEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z11, boolean z12, int i11, String str12, String str13, boolean z13, boolean z14, String str14, String str15, boolean z15, boolean z16, boolean z17, SubscriptionInfoEntity subscriptionInfoEntity, List list, List list2, Boolean bool, String str16, String str17, Integer num, String str18, String str19, boolean z18, List list3, int i12, int i13, Object obj) {
        List list4;
        boolean z19;
        String str20 = (i12 & 1) != 0 ? multiChainEntity.txUrl : str;
        String str21 = (i12 & 2) != 0 ? multiChainEntity.chainId : str2;
        String str22 = (i12 & 4) != 0 ? multiChainEntity.chainName : str3;
        String str23 = (i12 & 8) != 0 ? multiChainEntity.chainFullName : str4;
        String str24 = (i12 & 16) != 0 ? multiChainEntity.withdrawMinFee : str5;
        String str25 = (i12 & 32) != 0 ? multiChainEntity.confirmationCount : str6;
        String str26 = (i12 & 64) != 0 ? multiChainEntity.preConfirmationCount : str7;
        String str27 = (i12 & 128) != 0 ? multiChainEntity.depositMinSize : str8;
        String str28 = (i12 & 256) != 0 ? multiChainEntity.isChainEnabled : str9;
        String str29 = (i12 & 512) != 0 ? multiChainEntity.contractAddress : str10;
        String str30 = (i12 & 1024) != 0 ? multiChainEntity.withdrawMinSize : str11;
        boolean z21 = (i12 & 2048) != 0 ? multiChainEntity.isWithdrawEnabled : z11;
        boolean z22 = (i12 & 4096) != 0 ? multiChainEntity.isDepositEnabled : z12;
        int i14 = (i12 & 8192) != 0 ? multiChainEntity.walletPrecision : i11;
        String str31 = str20;
        String str32 = (i12 & 16384) != 0 ? multiChainEntity.orgAddress : str12;
        String str33 = (i12 & 32768) != 0 ? multiChainEntity.userAddressName : str13;
        boolean z23 = (i12 & 65536) != 0 ? multiChainEntity.isSelected : z13;
        boolean z24 = (i12 & 131072) != 0 ? multiChainEntity.isMatch : z14;
        String str34 = (i12 & 262144) != 0 ? multiChainEntity.withdrawDisabledTip : str14;
        String str35 = (i12 & 524288) != 0 ? multiChainEntity.withdrawPredictTime : str15;
        boolean z25 = (i12 & 1048576) != 0 ? multiChainEntity.isUniversalChain : z15;
        boolean z26 = (i12 & 2097152) != 0 ? multiChainEntity.isLastDepositUse : z16;
        boolean z27 = (i12 & 4194304) != 0 ? multiChainEntity.isClickable : z17;
        SubscriptionInfoEntity subscriptionInfoEntity2 = (i12 & 8388608) != 0 ? multiChainEntity.subscriptionInfo : subscriptionInfoEntity;
        List list5 = (i12 & 16777216) != 0 ? multiChainEntity.depositLabel : list;
        List list6 = (i12 & 33554432) != 0 ? multiChainEntity.withdrawLabel : list2;
        Boolean bool2 = (i12 & 67108864) != 0 ? multiChainEntity.isInvoiceChain : bool;
        String str36 = (i12 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? multiChainEntity.depositMaxSize : str16;
        String str37 = (i12 & 268435456) != 0 ? multiChainEntity.withdrawMaxSize : str17;
        Integer num2 = (i12 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? multiChainEntity.depositPredictTime : num;
        String str38 = (i12 & 1073741824) != 0 ? multiChainEntity.currency : str18;
        String str39 = (i12 & Integer.MIN_VALUE) != 0 ? multiChainEntity.withdrawMemo : str19;
        boolean z28 = (i13 & 1) != 0 ? multiChainEntity.isEvm : z18;
        if ((i13 & 2) != 0) {
            z19 = z28;
            list4 = multiChainEntity.evmSubChains;
        } else {
            list4 = list3;
            z19 = z28;
        }
        return multiChainEntity.copy(str31, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, z21, z22, i14, str32, str33, z23, z24, str34, str35, z25, z26, z27, subscriptionInfoEntity2, list5, list6, bool2, str36, str37, num2, str38, str39, z19, list4);
    }

    @NotNull
    public final MultiChainEntity copy(@Nullable String txUrl, @NotNull String chainId, @NotNull String chainName, @Nullable String chainFullName, @Nullable String withdrawMinFee, @Nullable String confirmationCount, @Nullable String preConfirmationCount, @Nullable String depositMinSize, @Nullable String isChainEnabled, @Nullable String contractAddress, @Nullable String withdrawMinSize, boolean isWithdrawEnabled, boolean isDepositEnabled, int walletPrecision, @Nullable String orgAddress, @Nullable String userAddressName, boolean isSelected, boolean isMatch, @Nullable String withdrawDisabledTip, @Nullable String withdrawPredictTime, boolean isUniversalChain, boolean isLastDepositUse, boolean isClickable, @Nullable SubscriptionInfoEntity subscriptionInfo, @Nullable List<LabelEntity> depositLabel, @Nullable List<LabelEntity> withdrawLabel, @Nullable Boolean isInvoiceChain, @Nullable String depositMaxSize, @Nullable String withdrawMaxSize, @Nullable Integer depositPredictTime, @Nullable String currency, @Nullable String withdrawMemo, boolean isEvm, @Nullable List<EvmChainEntity> evmSubChains) {
        Intrinsics.checkNotNullParameter(chainId, "chainId");
        Intrinsics.checkNotNullParameter(chainName, "chainName");
        return new MultiChainEntity(txUrl, chainId, chainName, chainFullName, withdrawMinFee, confirmationCount, preConfirmationCount, depositMinSize, isChainEnabled, contractAddress, withdrawMinSize, isWithdrawEnabled, isDepositEnabled, walletPrecision, orgAddress, userAddressName, isSelected, isMatch, withdrawDisabledTip, withdrawPredictTime, isUniversalChain, isLastDepositUse, isClickable, subscriptionInfo, depositLabel, withdrawLabel, isInvoiceChain, depositMaxSize, withdrawMaxSize, depositPredictTime, currency, withdrawMemo, isEvm, evmSubChains);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiChainEntity)) {
            return false;
        }
        MultiChainEntity multiChainEntity = (MultiChainEntity) other;
        return Intrinsics.areEqual(this.txUrl, multiChainEntity.txUrl) && Intrinsics.areEqual(this.chainId, multiChainEntity.chainId) && Intrinsics.areEqual(this.chainName, multiChainEntity.chainName) && Intrinsics.areEqual(this.chainFullName, multiChainEntity.chainFullName) && Intrinsics.areEqual(this.withdrawMinFee, multiChainEntity.withdrawMinFee) && Intrinsics.areEqual(this.confirmationCount, multiChainEntity.confirmationCount) && Intrinsics.areEqual(this.preConfirmationCount, multiChainEntity.preConfirmationCount) && Intrinsics.areEqual(this.depositMinSize, multiChainEntity.depositMinSize) && Intrinsics.areEqual(this.isChainEnabled, multiChainEntity.isChainEnabled) && Intrinsics.areEqual(this.contractAddress, multiChainEntity.contractAddress) && Intrinsics.areEqual(this.withdrawMinSize, multiChainEntity.withdrawMinSize) && this.isWithdrawEnabled == multiChainEntity.isWithdrawEnabled && this.isDepositEnabled == multiChainEntity.isDepositEnabled && this.walletPrecision == multiChainEntity.walletPrecision && Intrinsics.areEqual(this.orgAddress, multiChainEntity.orgAddress) && Intrinsics.areEqual(this.userAddressName, multiChainEntity.userAddressName) && this.isSelected == multiChainEntity.isSelected && this.isMatch == multiChainEntity.isMatch && Intrinsics.areEqual(this.withdrawDisabledTip, multiChainEntity.withdrawDisabledTip) && Intrinsics.areEqual(this.withdrawPredictTime, multiChainEntity.withdrawPredictTime) && this.isUniversalChain == multiChainEntity.isUniversalChain && this.isLastDepositUse == multiChainEntity.isLastDepositUse && this.isClickable == multiChainEntity.isClickable && Intrinsics.areEqual(this.subscriptionInfo, multiChainEntity.subscriptionInfo) && Intrinsics.areEqual(this.depositLabel, multiChainEntity.depositLabel) && Intrinsics.areEqual(this.withdrawLabel, multiChainEntity.withdrawLabel) && Intrinsics.areEqual(this.isInvoiceChain, multiChainEntity.isInvoiceChain) && Intrinsics.areEqual(this.depositMaxSize, multiChainEntity.depositMaxSize) && Intrinsics.areEqual(this.withdrawMaxSize, multiChainEntity.withdrawMaxSize) && Intrinsics.areEqual(this.depositPredictTime, multiChainEntity.depositPredictTime) && Intrinsics.areEqual(this.currency, multiChainEntity.currency) && Intrinsics.areEqual(this.withdrawMemo, multiChainEntity.withdrawMemo) && this.isEvm == multiChainEntity.isEvm && Intrinsics.areEqual(this.evmSubChains, multiChainEntity.evmSubChains);
    }

    public MultiChainEntity(@Nullable String str, @NotNull String chainId, @NotNull String chainName, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, boolean z11, boolean z12, int i11, @Nullable String str10, @Nullable String str11, boolean z13, boolean z14, @Nullable String str12, @Nullable String str13, boolean z15, boolean z16, boolean z17, @Nullable SubscriptionInfoEntity subscriptionInfoEntity, @Nullable List<LabelEntity> list, @Nullable List<LabelEntity> list2, @Nullable Boolean bool, @Nullable String str14, @Nullable String str15, @Nullable Integer num, @Nullable String str16, @Nullable String str17, boolean z18, @Nullable List<EvmChainEntity> list3) {
        Intrinsics.checkNotNullParameter(chainId, "chainId");
        Intrinsics.checkNotNullParameter(chainName, "chainName");
        this.txUrl = str;
        this.chainId = chainId;
        this.chainName = chainName;
        this.chainFullName = str2;
        this.withdrawMinFee = str3;
        this.confirmationCount = str4;
        this.preConfirmationCount = str5;
        this.depositMinSize = str6;
        this.isChainEnabled = str7;
        this.contractAddress = str8;
        this.withdrawMinSize = str9;
        this.isWithdrawEnabled = z11;
        this.isDepositEnabled = z12;
        this.walletPrecision = i11;
        this.orgAddress = str10;
        this.userAddressName = str11;
        this.isSelected = z13;
        this.isMatch = z14;
        this.withdrawDisabledTip = str12;
        this.withdrawPredictTime = str13;
        this.isUniversalChain = z15;
        this.isLastDepositUse = z16;
        this.isClickable = z17;
        this.subscriptionInfo = subscriptionInfoEntity;
        this.depositLabel = list;
        this.withdrawLabel = list2;
        this.isInvoiceChain = bool;
        this.depositMaxSize = str14;
        this.withdrawMaxSize = str15;
        this.depositPredictTime = num;
        this.currency = str16;
        this.withdrawMemo = str17;
        this.isEvm = z18;
        this.evmSubChains = list3;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTxUrl() {
        return this.txUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getWithdrawMinSize() {
        return this.withdrawMinSize;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsWithdrawEnabled() {
        return this.isWithdrawEnabled;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsDepositEnabled() {
        return this.isDepositEnabled;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getWalletPrecision() {
        return this.walletPrecision;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getOrgAddress() {
        return this.orgAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getUserAddressName() {
        return this.userAddressName;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getIsMatch() {
        return this.isMatch;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getWithdrawDisabledTip() {
        return this.withdrawDisabledTip;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getWithdrawPredictTime() {
        return this.withdrawPredictTime;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getIsUniversalChain() {
        return this.isUniversalChain;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getIsLastDepositUse() {
        return this.isLastDepositUse;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getIsClickable() {
        return this.isClickable;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final SubscriptionInfoEntity getSubscriptionInfo() {
        return this.subscriptionInfo;
    }

    @Nullable
    public final List<LabelEntity> component25() {
        return this.depositLabel;
    }

    @Nullable
    public final List<LabelEntity> component26() {
        return this.withdrawLabel;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Boolean getIsInvoiceChain() {
        return this.isInvoiceChain;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getDepositMaxSize() {
        return this.depositMaxSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getWithdrawMaxSize() {
        return this.withdrawMaxSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChainName() {
        return this.chainName;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Integer getDepositPredictTime() {
        return this.depositPredictTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getWithdrawMemo() {
        return this.withdrawMemo;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final boolean getIsEvm() {
        return this.isEvm;
    }

    @Nullable
    public final List<EvmChainEntity> component34() {
        return this.evmSubChains;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChainFullName() {
        return this.chainFullName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getWithdrawMinFee() {
        return this.withdrawMinFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getConfirmationCount() {
        return this.confirmationCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPreConfirmationCount() {
        return this.preConfirmationCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDepositMinSize() {
        return this.depositMinSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIsChainEnabled() {
        return this.isChainEnabled;
    }

    @Nullable
    public final String getChainFullName() {
        return this.chainFullName;
    }

    @NotNull
    public final String getChainId() {
        return this.chainId;
    }

    @NotNull
    public final String getChainName() {
        return this.chainName;
    }

    @Nullable
    public final String getConfirmationCount() {
        return this.confirmationCount;
    }

    @Nullable
    public final String getContractAddress() {
        return this.contractAddress;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final List<LabelEntity> getDepositLabel() {
        return this.depositLabel;
    }

    @Nullable
    public final String getDepositMaxSize() {
        return this.depositMaxSize;
    }

    @Nullable
    public final String getDepositMinSize() {
        return this.depositMinSize;
    }

    @Nullable
    public final Integer getDepositPredictTime() {
        return this.depositPredictTime;
    }

    @Nullable
    public final List<EvmChainEntity> getEvmSubChains() {
        return this.evmSubChains;
    }

    @Nullable
    public final String getOrgAddress() {
        return this.orgAddress;
    }

    @Nullable
    public final String getPreConfirmationCount() {
        return this.preConfirmationCount;
    }

    @Nullable
    public final SubscriptionInfoEntity getSubscriptionInfo() {
        return this.subscriptionInfo;
    }

    @Nullable
    public final String getTxUrl() {
        return this.txUrl;
    }

    @Nullable
    public final String getUserAddressName() {
        return this.userAddressName;
    }

    public final int getWalletPrecision() {
        return this.walletPrecision;
    }

    @Nullable
    public final String getWithdrawDisabledTip() {
        return this.withdrawDisabledTip;
    }

    @Nullable
    public final List<LabelEntity> getWithdrawLabel() {
        return this.withdrawLabel;
    }

    @Nullable
    public final String getWithdrawMaxSize() {
        return this.withdrawMaxSize;
    }

    @Nullable
    public final String getWithdrawMemo() {
        return this.withdrawMemo;
    }

    @Nullable
    public final String getWithdrawMinFee() {
        return this.withdrawMinFee;
    }

    @Nullable
    public final String getWithdrawMinSize() {
        return this.withdrawMinSize;
    }

    @Nullable
    public final String getWithdrawPredictTime() {
        return this.withdrawPredictTime;
    }

    public int hashCode() {
        String str = this.txUrl;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.chainName.hashCode()) * 31;
        String str2 = this.chainFullName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.withdrawMinFee;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.confirmationCount;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.preConfirmationCount;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.depositMinSize;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.isChainEnabled;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.contractAddress;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.withdrawMinSize;
        int iHashCode9 = (((((((iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31) + Boolean.hashCode(this.isWithdrawEnabled)) * 31) + Boolean.hashCode(this.isDepositEnabled)) * 31) + Integer.hashCode(this.walletPrecision)) * 31;
        String str10 = this.orgAddress;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.userAddressName;
        int iHashCode11 = (((((iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Boolean.hashCode(this.isMatch)) * 31;
        String str12 = this.withdrawDisabledTip;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.withdrawPredictTime;
        int iHashCode13 = (((((((iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31) + Boolean.hashCode(this.isUniversalChain)) * 31) + Boolean.hashCode(this.isLastDepositUse)) * 31) + Boolean.hashCode(this.isClickable)) * 31;
        SubscriptionInfoEntity subscriptionInfoEntity = this.subscriptionInfo;
        int iHashCode14 = (iHashCode13 + (subscriptionInfoEntity == null ? 0 : subscriptionInfoEntity.hashCode())) * 31;
        List<LabelEntity> list = this.depositLabel;
        int iHashCode15 = (iHashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        List<LabelEntity> list2 = this.withdrawLabel;
        int iHashCode16 = (iHashCode15 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.isInvoiceChain;
        int iHashCode17 = (iHashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str14 = this.depositMaxSize;
        int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.withdrawMaxSize;
        int iHashCode19 = (iHashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num = this.depositPredictTime;
        int iHashCode20 = (iHashCode19 + (num == null ? 0 : num.hashCode())) * 31;
        String str16 = this.currency;
        int iHashCode21 = (iHashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.withdrawMemo;
        int iHashCode22 = (((iHashCode21 + (str17 == null ? 0 : str17.hashCode())) * 31) + Boolean.hashCode(this.isEvm)) * 31;
        List<EvmChainEntity> list3 = this.evmSubChains;
        return iHashCode22 + (list3 != null ? list3.hashCode() : 0);
    }

    @Nullable
    public final String isChainEnabled() {
        return this.isChainEnabled;
    }

    public final boolean isClickable() {
        return this.isClickable;
    }

    public final boolean isDepositEnabled() {
        return this.isDepositEnabled;
    }

    public final boolean isEvm() {
        return this.isEvm;
    }

    @Nullable
    public final Boolean isInvoiceChain() {
        return this.isInvoiceChain;
    }

    public final boolean isLastDepositUse() {
        return this.isLastDepositUse;
    }

    public final boolean isMatch() {
        return this.isMatch;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final boolean isUniversalChain() {
        return this.isUniversalChain;
    }

    public final boolean isWithdrawEnabled() {
        return this.isWithdrawEnabled;
    }

    public final void setChainEnabled(@Nullable String str) {
        this.isChainEnabled = str;
    }

    public final void setChainFullName(@Nullable String str) {
        this.chainFullName = str;
    }

    public final void setChainId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.chainId = str;
    }

    public final void setChainName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.chainName = str;
    }

    public final void setClickable(boolean z11) {
        this.isClickable = z11;
    }

    public final void setConfirmationCount(@Nullable String str) {
        this.confirmationCount = str;
    }

    public final void setContractAddress(@Nullable String str) {
        this.contractAddress = str;
    }

    public final void setDepositEnabled(boolean z11) {
        this.isDepositEnabled = z11;
    }

    public final void setDepositLabel(@Nullable List<LabelEntity> list) {
        this.depositLabel = list;
    }

    public final void setDepositMinSize(@Nullable String str) {
        this.depositMinSize = str;
    }

    public final void setEvmSubChains(@Nullable List<EvmChainEntity> list) {
        this.evmSubChains = list;
    }

    public final void setLastDepositUse(boolean z11) {
        this.isLastDepositUse = z11;
    }

    public final void setMatch(boolean z11) {
        this.isMatch = z11;
    }

    public final void setOrgAddress(@Nullable String str) {
        this.orgAddress = str;
    }

    public final void setPreConfirmationCount(@Nullable String str) {
        this.preConfirmationCount = str;
    }

    public final void setSelected(boolean z11) {
        this.isSelected = z11;
    }

    public final void setSubscriptionInfo(@Nullable SubscriptionInfoEntity subscriptionInfoEntity) {
        this.subscriptionInfo = subscriptionInfoEntity;
    }

    public final void setTxUrl(@Nullable String str) {
        this.txUrl = str;
    }

    public final void setUniversalChain(boolean z11) {
        this.isUniversalChain = z11;
    }

    public final void setUserAddressName(@Nullable String str) {
        this.userAddressName = str;
    }

    public final void setWalletPrecision(int i11) {
        this.walletPrecision = i11;
    }

    public final void setWithdrawDisabledTip(@Nullable String str) {
        this.withdrawDisabledTip = str;
    }

    public final void setWithdrawEnabled(boolean z11) {
        this.isWithdrawEnabled = z11;
    }

    public final void setWithdrawLabel(@Nullable List<LabelEntity> list) {
        this.withdrawLabel = list;
    }

    public final void setWithdrawMinFee(@Nullable String str) {
        this.withdrawMinFee = str;
    }

    public final void setWithdrawMinSize(@Nullable String str) {
        this.withdrawMinSize = str;
    }

    public final void setWithdrawPredictTime(@Nullable String str) {
        this.withdrawPredictTime = str;
    }

    @NotNull
    public String toString() {
        return "MultiChainEntity(txUrl=" + this.txUrl + ", chainId=" + this.chainId + ", chainName=" + this.chainName + ", chainFullName=" + this.chainFullName + ", withdrawMinFee=" + this.withdrawMinFee + ", confirmationCount=" + this.confirmationCount + ", preConfirmationCount=" + this.preConfirmationCount + ", depositMinSize=" + this.depositMinSize + ", isChainEnabled=" + this.isChainEnabled + ", contractAddress=" + this.contractAddress + ", withdrawMinSize=" + this.withdrawMinSize + ", isWithdrawEnabled=" + this.isWithdrawEnabled + ", isDepositEnabled=" + this.isDepositEnabled + ", walletPrecision=" + this.walletPrecision + ", orgAddress=" + this.orgAddress + ", userAddressName=" + this.userAddressName + ", isSelected=" + this.isSelected + ", isMatch=" + this.isMatch + ", withdrawDisabledTip=" + this.withdrawDisabledTip + ", withdrawPredictTime=" + this.withdrawPredictTime + ", isUniversalChain=" + this.isUniversalChain + ", isLastDepositUse=" + this.isLastDepositUse + ", isClickable=" + this.isClickable + ", subscriptionInfo=" + this.subscriptionInfo + ", depositLabel=" + this.depositLabel + ", withdrawLabel=" + this.withdrawLabel + ", isInvoiceChain=" + this.isInvoiceChain + ", depositMaxSize=" + this.depositMaxSize + ", withdrawMaxSize=" + this.withdrawMaxSize + ", depositPredictTime=" + this.depositPredictTime + ", currency=" + this.currency + ", withdrawMemo=" + this.withdrawMemo + ", isEvm=" + this.isEvm + ", evmSubChains=" + this.evmSubChains + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.txUrl);
        dest.writeString(this.chainId);
        dest.writeString(this.chainName);
        dest.writeString(this.chainFullName);
        dest.writeString(this.withdrawMinFee);
        dest.writeString(this.confirmationCount);
        dest.writeString(this.preConfirmationCount);
        dest.writeString(this.depositMinSize);
        dest.writeString(this.isChainEnabled);
        dest.writeString(this.contractAddress);
        dest.writeString(this.withdrawMinSize);
        dest.writeInt(this.isWithdrawEnabled ? 1 : 0);
        dest.writeInt(this.isDepositEnabled ? 1 : 0);
        dest.writeInt(this.walletPrecision);
        dest.writeString(this.orgAddress);
        dest.writeString(this.userAddressName);
        dest.writeInt(this.isSelected ? 1 : 0);
        dest.writeInt(this.isMatch ? 1 : 0);
        dest.writeString(this.withdrawDisabledTip);
        dest.writeString(this.withdrawPredictTime);
        dest.writeInt(this.isUniversalChain ? 1 : 0);
        dest.writeInt(this.isLastDepositUse ? 1 : 0);
        dest.writeInt(this.isClickable ? 1 : 0);
        dest.writeParcelable(this.subscriptionInfo, flags);
        List<LabelEntity> list = this.depositLabel;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<LabelEntity> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        List<LabelEntity> list2 = this.withdrawLabel;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator<LabelEntity> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
        }
        Boolean bool = this.isInvoiceChain;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.depositMaxSize);
        dest.writeString(this.withdrawMaxSize);
        Integer num = this.depositPredictTime;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.currency);
        dest.writeString(this.withdrawMemo);
        dest.writeInt(this.isEvm ? 1 : 0);
        List<EvmChainEntity> list3 = this.evmSubChains;
        if (list3 == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list3.size());
        Iterator<EvmChainEntity> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ MultiChainEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z11, boolean z12, int i11, String str12, String str13, boolean z13, boolean z14, String str14, String str15, boolean z15, boolean z16, boolean z17, SubscriptionInfoEntity subscriptionInfoEntity, List list, List list2, Boolean bool, String str16, String str17, Integer num, String str18, String str19, boolean z18, List list3, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) == 0 ? str3 : "", (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) != 0 ? null : str8, (i12 & 256) != 0 ? null : str9, (i12 & 512) != 0 ? null : str10, (i12 & 1024) != 0 ? null : str11, (i12 & 2048) != 0 ? false : z11, (i12 & 4096) != 0 ? false : z12, (i12 & 8192) != 0 ? 0 : i11, (i12 & 16384) != 0 ? null : str12, (i12 & 32768) != 0 ? null : str13, (i12 & 65536) != 0 ? false : z13, (i12 & 131072) != 0 ? false : z14, (i12 & 262144) != 0 ? null : str14, (i12 & 524288) != 0 ? null : str15, (i12 & 1048576) != 0 ? false : z15, (i12 & 2097152) != 0 ? false : z16, (i12 & 4194304) != 0 ? true : z17, (i12 & 8388608) != 0 ? null : subscriptionInfoEntity, (i12 & 16777216) != 0 ? null : list, (i12 & 33554432) != 0 ? null : list2, (i12 & 67108864) != 0 ? Boolean.FALSE : bool, (i12 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : str16, (i12 & 268435456) != 0 ? null : str17, (i12 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : num, (i12 & 1073741824) != 0 ? null : str18, (i12 & Integer.MIN_VALUE) != 0 ? null : str19, (i13 & 1) != 0 ? false : z18, (i13 & 2) != 0 ? null : list3);
    }
}
