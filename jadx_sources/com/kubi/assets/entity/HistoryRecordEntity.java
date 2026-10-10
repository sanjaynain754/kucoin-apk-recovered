package com.kubi.assets.entity;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.blankj.utilcode.util.C5303w0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.kubi.assets.R$color;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$string;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.kubi.utils.extensions.StringEx;
import com.sensorsdata.abtest.entity.AppConstants;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33820nf;
import gf.C37886j;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42179a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: HistoryRecordEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bI\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u009c\u00012\u00020\u0001:\u0002\u009c\u0001B\u0099\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0011\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012(\b\u0002\u00100\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u000101j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u0001`2¢\u0006\u0004\b3\u00104J*\u0010z\u001a\u0004\u0018\u00010\u00032\u0006\u0010{\u001a\u00020|2\u0006\u0010}\u001a\u00020\u00112\u0006\u0010~\u001a\u00020\u00002\b\b\u0002\u0010\u007f\u001a\u00020\u0011J\u0007\u0010\u0080\u0001\u001a\u00020\u0011J\u000f\u0010\u0081\u0001\u001a\u00020\u00032\u0006\u0010{\u001a\u00020|J\u0007\u0010\u0082\u0001\u001a\u00020\u0003J\u0007\u0010\u0084\u0001\u001a\u00020\u0003J\u0007\u0010\u0089\u0001\u001a\u00020\u0003J9\u0010\u008a\u0001\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u000101j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u0001`22\u0006\u0010{\u001a\u00020|2\u0006\u0010}\u001a\u00020\u0011H\u0002J\u0007\u0010\u008b\u0001\u001a\u00020\u0003J\u0007\u0010\u008c\u0001\u001a\u00020\u0003J\u001e\u0010\u008d\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u008f\u0001\u001a\u00020\u00112\u000b\b\u0002\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0000J\b\u0010\u0096\u0001\u001a\u00030\u008e\u0001J\u001c\u0010\u0097\u0001\u001a\u00030\u0098\u00012\b\u0010\u0099\u0001\u001a\u00030\u009a\u00012\b\u0010\u009b\u0001\u001a\u00030\u008e\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u00106R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00106\"\u0004\b;\u00108R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u00106\"\u0004\b=\u00108R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u00106\"\u0004\bG\u00108R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u00106\"\u0004\bI\u00108R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u00106\"\u0004\bK\u00108R\u001a\u0010\u0018\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010L\"\u0004\bM\u0010NR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u00106\"\u0004\bP\u00108R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u00106\"\u0004\bR\u00108R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u00106\"\u0004\bX\u00108R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u00106\"\u0004\bZ\u00108R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010L\"\u0004\b[\u0010NR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u00106\"\u0004\b]\u00108R\u001c\u0010#\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u00106\"\u0004\b_\u00108R\u001c\u0010$\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u00106\"\u0004\ba\u00108R\u001c\u0010%\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u00106\"\u0004\bc\u00108R\u001c\u0010&\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u00106\"\u0004\be\u00108R\"\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010T\"\u0004\bg\u0010VR\u001c\u0010(\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u00106\"\u0004\bi\u00108R\u001c\u0010)\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u00106\"\u0004\bk\u00108R\u001c\u0010*\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u00106\"\u0004\bm\u00108R\u001c\u0010+\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u00106\"\u0004\bo\u00108R\u001c\u0010,\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u00106\"\u0004\bq\u00108R\u001e\u0010-\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010v\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u001e\u0010.\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010v\u001a\u0004\b.\u0010s\"\u0004\bw\u0010uR\u001c\u0010/\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u00106\"\u0004\by\u00108R.\u00100\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u000101j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u0001`2X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0083\u0001\u001a\u00020\u00118F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010LR\u0013\u0010\u0085\u0001\u001a\u00020\u00038F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u00106R\u0013\u0010\u0087\u0001\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010?R\u0015\u0010\u0091\u0001\u001a\u00030\u008e\u00018F¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0015\u0010\u0094\u0001\u001a\u00030\u008e\u00018F¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0093\u0001¨\u0006\u009d\u0001"}, m90084d2 = {"Lcom/kubi/assets/entity/HistoryRecordEntity;", "Landroid/os/Parcelable;", "address", "", "addressRemark", "memo", "amount", "Ljava/math/BigDecimal;", "chainId", "createdAt", "", "noticeAt", "code", "currencyName", "fee", "id", "isInner", "", "remark", "status", "updatedAt", "walletTxId", "failureReason", "failureReasonMsg", "isContract", "iconUrl", "type", "accountTypes", "", "accountType", "promptType", "confirmation", "confirmationCount", "isArrears", "toSubUserId", "toSubUserName", "toAccountTag", "chainName", "cancelType", "taxes", "taxDescription", "returnAmount", "returnStatus", "returnCurrency", "subStatus", "needSubmitWht", "isShowOldAddressRisk", "travelRuleOrderStatus", "statusMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/HashMap;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getAddressRemark", "getMemo", "setMemo", "getChainId", "setChainId", "getCreatedAt", "()J", "setCreatedAt", "(J)V", "getFee", "()Ljava/math/BigDecimal;", "setFee", "(Ljava/math/BigDecimal;)V", "getRemark", "setRemark", "getFailureReason", "setFailureReason", "getFailureReasonMsg", "setFailureReasonMsg", "()Z", "setContract", "(Z)V", "getIconUrl", "setIconUrl", "getType", "setType", "getAccountTypes", "()Ljava/util/List;", "setAccountTypes", "(Ljava/util/List;)V", "getAccountType", "setAccountType", "getPromptType", "setPromptType", "setArrears", "getToSubUserId", "setToSubUserId", "getToSubUserName", "setToSubUserName", "getToAccountTag", "setToAccountTag", "getChainName", "setChainName", "getCancelType", "setCancelType", "getTaxes", "setTaxes", "getTaxDescription", "setTaxDescription", "getReturnAmount", "setReturnAmount", "getReturnStatus", "setReturnStatus", "getReturnCurrency", "setReturnCurrency", "getSubStatus", "setSubStatus", "getNeedSubmitWht", "()Ljava/lang/Boolean;", "setNeedSubmitWht", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setShowOldAddressRisk", "getTravelRuleOrderStatus", "setTravelRuleOrderStatus", "getStatusString", "context", "Landroid/content/Context;", "isWithDraw", "historyRecordEntity", "isFromDetail", "isCompleted", "getTypeString", "getWalletTxIdStr", "isWithdraw", "amountFormat", "amountTextString", "getAmountTextString", "time", "getTime", "getTimeString", "getStatusMap", "getConfirmationStr", "getConfirmationCountStr", "getStatusColor", "", "isDetail", "recordEntity", "statusIcon", "getStatusIcon", "()I", "statusBackgroundRes", "getStatusBackgroundRes", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHistoryRecordEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryRecordEntity.kt\ncom/kubi/assets/entity/HistoryRecordEntity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,249:1\n1#2:250\n*E\n"})
public final class HistoryRecordEntity implements Parcelable {

    @Nullable
    private String accountType;

    @Nullable
    private List<String> accountTypes;

    @Nullable
    private String address;

    @Nullable
    private final String addressRemark;

    @JvmField
    @Nullable
    public BigDecimal amount;

    @Nullable
    private String cancelType;

    @Nullable
    private String chainId;

    @Nullable
    private String chainName;

    @SerializedName(FirebaseAnalytics.Param.CURRENCY)
    @JvmField
    @Nullable
    public String code;

    @Nullable
    private String confirmation;

    @Nullable
    private String confirmationCount;
    private long createdAt;

    @JvmField
    @Nullable
    public String currencyName;

    @NotNull
    private String failureReason;

    @NotNull
    private String failureReasonMsg;

    @Nullable
    private BigDecimal fee;

    @Nullable
    private String iconUrl;

    @JvmField
    @Nullable
    public String id;
    private boolean isArrears;
    private boolean isContract;

    @JvmField
    public boolean isInner;

    @Nullable
    private Boolean isShowOldAddressRisk;

    @Nullable
    private String memo;

    @Nullable
    private Boolean needSubmitWht;
    private long noticeAt;

    @Nullable
    private String promptType;

    @Nullable
    private String remark;

    @Nullable
    private String returnAmount;

    @Nullable
    private String returnCurrency;

    @Nullable
    private String returnStatus;

    @JvmField
    @Nullable
    public String status;

    @Nullable
    private HashMap<String, String> statusMap;

    @Nullable
    private String subStatus;

    @Nullable
    private String taxDescription;

    @Nullable
    private List<String> taxes;

    @Nullable
    private String toAccountTag;

    @Nullable
    private String toSubUserId;

    @Nullable
    private String toSubUserName;

    @Nullable
    private String travelRuleOrderStatus;

    @Nullable
    private String type;
    private long updatedAt;

    @Nullable
    private String walletTxId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<HistoryRecordEntity> CREATOR = new Creator();

    /* JADX INFO: compiled from: HistoryRecordEntity.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/entity/HistoryRecordEntity$Companion;", "", "<init>", "()V", "getStatusTypeMap", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "context", "Landroid/content/Context;", "isWithDraw", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final LinkedHashMap<String, String> getStatusTypeMap(@NotNull Context context, boolean isWithDraw) {
            Intrinsics.checkNotNullParameter(context, "context");
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put(AppConstants.AB_TEST_SUCCESS, context.getString(R$string.completed));
            if (isWithDraw) {
                linkedHashMap.put("PROCESSING", context.getString(R$string.asset_detail_status3));
                linkedHashMap.put("REVIEW", context.getString(R$string.asset_detail_status1));
                linkedHashMap.put("WALLET_PROCESSING", context.getString(R$string.asset_detail_status2));
            } else {
                linkedHashMap.put("PROCESSING", context.getString(R$string.deposit_withdraw_processing));
                linkedHashMap.put("CONFIRMING", context.getString(R$string.asset_rollback_confirming));
                linkedHashMap.put("RISK_MGT_REJECTED", context.getString(R$string.asset_rollback_riskreject_status));
                linkedHashMap.put("NEED_SUBMIT_WHT", context.getString(R$string.kc_wht_provider_list_tip));
            }
            linkedHashMap.put("FAILURE", context.getString(R$string.failed));
            return linkedHashMap;
        }
    }

    /* JADX INFO: compiled from: HistoryRecordEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<HistoryRecordEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryRecordEntity createFromParcel(Parcel parcel) {
            boolean z11;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            HashMap map;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            String string4 = parcel.readString();
            long j11 = parcel.readLong();
            long j12 = parcel.readLong();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            String string7 = parcel.readString();
            boolean z12 = false;
            if (parcel.readInt() != 0) {
                z12 = true;
                z11 = true;
            } else {
                z11 = true;
            }
            String string8 = parcel.readString();
            boolean z13 = z11;
            String string9 = parcel.readString();
            long j13 = parcel.readLong();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            boolean z14 = z13;
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                z14 = z12;
            }
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            boolean z15 = z14;
            String string18 = parcel.readString();
            if (parcel.readInt() == 0) {
                z15 = z12;
            }
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            String string27 = parcel.readString();
            boolean z16 = z15;
            String string28 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? z16 : z12);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
                map = null;
            } else {
                if (parcel.readInt() == 0) {
                    z16 = false;
                }
                boolValueOf2 = Boolean.valueOf(z16);
                map = null;
            }
            String string29 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i11 = parcel.readInt();
                HashMap map2 = new HashMap(i11);
                int i12 = 0;
                while (i12 != i11) {
                    map2.put(parcel.readString(), parcel.readString());
                    i12++;
                    i11 = i11;
                }
                map = map2;
            }
            return new HistoryRecordEntity(string, string2, string3, bigDecimal, string4, j11, j12, string5, string6, bigDecimal2, string7, z12, string8, string9, j13, string10, string11, string12, z14, string13, string14, arrayListCreateStringArrayList, string15, string16, string17, string18, z15, string19, string20, string21, string22, string23, arrayListCreateStringArrayList2, string24, string25, string26, string27, string28, boolValueOf, boolValueOf2, string29, map);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryRecordEntity[] newArray(int i11) {
            return new HistoryRecordEntity[i11];
        }
    }

    public HistoryRecordEntity() {
        this(null, null, null, null, null, 0L, 0L, null, null, null, null, false, null, null, 0L, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1023, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public HistoryRecordEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable BigDecimal bigDecimal, @Nullable String str4, long j11, long j12, @Nullable String str5, @Nullable String str6, @Nullable BigDecimal bigDecimal2, @Nullable String str7, boolean z11, @Nullable String str8, @Nullable String str9, long j13, @Nullable String str10, @NotNull String failureReason, @NotNull String failureReasonMsg, boolean z12, @Nullable String str11, @Nullable String str12, @Nullable List<String> list, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, boolean z13, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable List<String> list2, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str27, @Nullable HashMap<String, String> map) {
        Intrinsics.checkNotNullParameter(failureReason, "failureReason");
        Intrinsics.checkNotNullParameter(failureReasonMsg, "failureReasonMsg");
        this.address = str;
        this.addressRemark = str2;
        this.memo = str3;
        this.amount = bigDecimal;
        this.chainId = str4;
        this.createdAt = j11;
        this.noticeAt = j12;
        this.code = str5;
        this.currencyName = str6;
        this.fee = bigDecimal2;
        this.id = str7;
        this.isInner = z11;
        this.remark = str8;
        this.status = str9;
        this.updatedAt = j13;
        this.walletTxId = str10;
        this.failureReason = failureReason;
        this.failureReasonMsg = failureReasonMsg;
        this.isContract = z12;
        this.iconUrl = str11;
        this.type = str12;
        this.accountTypes = list;
        this.accountType = str13;
        this.promptType = str14;
        this.confirmation = str15;
        this.confirmationCount = str16;
        this.isArrears = z13;
        this.toSubUserId = str17;
        this.toSubUserName = str18;
        this.toAccountTag = str19;
        this.chainName = str20;
        this.cancelType = str21;
        this.taxes = list2;
        this.taxDescription = str22;
        this.returnAmount = str23;
        this.returnStatus = str24;
        this.returnCurrency = str25;
        this.subStatus = str26;
        this.needSubmitWht = bool;
        this.isShowOldAddressRisk = bool2;
        this.travelRuleOrderStatus = str27;
        this.statusMap = map;
    }

    public static /* synthetic */ int getStatusColor$default(HistoryRecordEntity historyRecordEntity, boolean z11, HistoryRecordEntity historyRecordEntity2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            historyRecordEntity2 = null;
        }
        return historyRecordEntity.getStatusColor(z11, historyRecordEntity2);
    }

    private final HashMap<String, String> getStatusMap(Context context, boolean isWithDraw) {
        if (this.statusMap == null) {
            this.statusMap = INSTANCE.getStatusTypeMap(context, isWithDraw);
        }
        return this.statusMap;
    }

    public static /* synthetic */ String getStatusString$default(HistoryRecordEntity historyRecordEntity, Context context, boolean z11, HistoryRecordEntity historyRecordEntity2, boolean z12, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        return historyRecordEntity.getStatusString(context, z11, historyRecordEntity2, z12);
    }

    @JvmStatic
    @NotNull
    public static final LinkedHashMap<String, String> getStatusTypeMap(@NotNull Context context, boolean z11) {
        return INSTANCE.getStatusTypeMap(context, z11);
    }

    @NotNull
    public final String amountFormat() {
        return C37886j.m85578b(C41014a.m89922G(this.amount, null, 1, null), this.code, null, false, false, false, 0, null, 0, 254, null);
    }

    @Nullable
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final List<String> getAccountTypes() {
        return this.accountTypes;
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final String getAddressRemark() {
        return this.addressRemark;
    }

    @NotNull
    public final String getAmountTextString() {
        String strM85578b = C37886j.m85578b(C41014a.m89922G(this.amount, null, 1, null), this.code, null, false, false, false, 0, null, 0, 254, null);
        StringEx.Companion companion = StringEx.INSTANCE;
        String str = this.currencyName;
        Intrinsics.checkNotNull(str);
        String strXbt2btc4Java = companion.xbt2btc4Java(str);
        StringBuilder sb2 = new StringBuilder();
        if (C5303w0.m6511a()) {
            sb2.append(strXbt2btc4Java);
            sb2.append(C33627eb.f69716f);
            sb2.append(strM85578b);
            if (TextUtils.equals(this.type, ChannelKycRequest.SCENE_WITHDRAW)) {
                sb2.append(C33820nf.f71144W);
            } else if (TextUtils.equals(this.type, ChannelKycRequest.SCENE_DEPOSIT)) {
                sb2.append("+");
            }
        } else {
            if (TextUtils.equals(this.type, ChannelKycRequest.SCENE_WITHDRAW)) {
                sb2.append(C33820nf.f71144W);
            } else if (TextUtils.equals(this.type, ChannelKycRequest.SCENE_DEPOSIT)) {
                sb2.append("+");
            }
            sb2.append(strM85578b);
            sb2.append(C33627eb.f69716f);
            sb2.append(strXbt2btc4Java);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Nullable
    public final String getCancelType() {
        return this.cancelType;
    }

    @Nullable
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    public final String getChainName() {
        return this.chainName;
    }

    @NotNull
    public final String getConfirmationCountStr() {
        if (this.isInner) {
            return "0";
        }
        String str = this.confirmationCount;
        if (str == null || str.length() == 0) {
            str = null;
        }
        return str == null ? "0" : str;
    }

    @NotNull
    public final String getConfirmationStr() {
        if (this.isInner) {
            return "0";
        }
        String str = this.confirmation;
        if (str == null || str.length() == 0) {
            str = null;
        }
        return str == null ? "0" : str;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final String getFailureReason() {
        return this.failureReason;
    }

    @NotNull
    public final String getFailureReasonMsg() {
        return this.failureReasonMsg;
    }

    @Nullable
    public final BigDecimal getFee() {
        return this.fee;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getMemo() {
        return this.memo;
    }

    @Nullable
    public final Boolean getNeedSubmitWht() {
        return this.needSubmitWht;
    }

    @Nullable
    public final String getPromptType() {
        return this.promptType;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    public final String getReturnAmount() {
        return this.returnAmount;
    }

    @Nullable
    public final String getReturnCurrency() {
        return this.returnCurrency;
    }

    @Nullable
    public final String getReturnStatus() {
        return this.returnStatus;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int getStatusBackgroundRes() {
        String str = this.status;
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -1320377575:
                if (!str.equals("WALLET_PROCESSING")) {
                    return 0;
                }
                return R$drawable.shape_border12_complementary8_2r;
            case -847645549:
                if (!str.equals("RISK_MGT_REJECTED")) {
                    return 0;
                }
                break;
            case -368591510:
                if (!str.equals("FAILURE")) {
                    return 0;
                }
                break;
            case 86970974:
                if (!str.equals("ROLLBACKING")) {
                    return 0;
                }
                return R$drawable.shape_border12_complementary8_2r;
            case 522907364:
                if (!str.equals("ROLLBACK")) {
                    return 0;
                }
                return R$drawable.shape_border12_complementary8_2r;
            case 907287315:
                if (!str.equals("PROCESSING")) {
                    return 0;
                }
                return R$drawable.shape_border12_complementary8_2r;
            default:
                return 0;
        }
        return R$drawable.shape_border12_secondary8_2r;
    }

    public final int getStatusColor(boolean isDetail, @Nullable HistoryRecordEntity recordEntity) {
        if (Intrinsics.areEqual("FAILURE", this.status) || Intrinsics.areEqual("RISK_MGT_REJECTED", this.status) || Intrinsics.areEqual("TRM_MGT_REJECTED", this.status)) {
            return R$color.secondary;
        }
        if (!Intrinsics.areEqual("PROCESSING", this.status) && !Intrinsics.areEqual("WALLET_PROCESSING", this.status) && !Intrinsics.areEqual("REVIEW", this.status) && !Intrinsics.areEqual("ROLLBACKING", this.status) && !Intrinsics.areEqual("ROLLBACK", this.status) && !Intrinsics.areEqual("WAIT_TRM_MGT", this.status)) {
            if (!(recordEntity != null ? Intrinsics.areEqual(Boolean.TRUE, recordEntity.needSubmitWht) : false)) {
                if (Intrinsics.areEqual("PRE_SUCCESS", this.status)) {
                    return R$color.primary;
                }
                return isDetail ? R$color.primary : R$color.emphasis40;
            }
        }
        return R$color.complementary;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (r0.equals("FAILURE") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r0.equals("RISK_MGT_REJECTED") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        return com.kubi.assets.R$drawable.ic2_warning_16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        if (r0.equals("TRM_MGT_REJECTED") == false) goto L23;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int getStatusIcon() {
        String str = this.status;
        if (str != null) {
            switch (str.hashCode()) {
                case -847645549:
                    break;
                case -368591510:
                    break;
                case 92304935:
                    if (str.equals("PRE_SUCCESS")) {
                        return R$drawable.ic2_success_16;
                    }
                    break;
                case 305498579:
                    break;
            }
        }
        return R$drawable.ic2_wait_16;
    }

    @Nullable
    public final String getStatusString(@NotNull Context context, boolean isWithDraw, @NotNull HistoryRecordEntity historyRecordEntity, boolean isFromDetail) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(historyRecordEntity, "historyRecordEntity");
        String str = this.status;
        if (str == null) {
            return context.getString(R$string.completed);
        }
        if (Intrinsics.areEqual("WALLET_PROCESSING", str) && !isWithDraw) {
            return context.getString(R$string.deposit_withdraw_processing);
        }
        if (Intrinsics.areEqual("ROLLBACKING", this.status) && !isWithDraw) {
            return context.getString(R$string.asset_rollback_confirming);
        }
        if (Intrinsics.areEqual("ROLLBACK", this.status) && !isWithDraw) {
            return context.getString(R$string.asset_rollback_confirming);
        }
        if (Intrinsics.areEqual("PRE_SUCCESS", this.status) && !isWithDraw) {
            return context.getString(R$string.deposit_detail_lock_title);
        }
        if (Intrinsics.areEqual("WAIT_TRM_MGT", this.status) && !isWithDraw) {
            return context.getString(R$string.asset_under_investigation);
        }
        if (Intrinsics.areEqual("TRM_MGT_REJECTED", this.status) && !isWithDraw) {
            return context.getString(R$string.asset_order_freeze);
        }
        if (Intrinsics.areEqual(Boolean.TRUE, historyRecordEntity.needSubmitWht) && !isWithDraw) {
            return isFromDetail ? context.getString(R$string.kc_wht_provider_title) : context.getString(R$string.kc_wht_provider_list_tip);
        }
        HashMap<String, String> statusMap = getStatusMap(context, isWithDraw);
        Intrinsics.checkNotNull(statusMap);
        String str2 = this.status;
        Intrinsics.checkNotNull(str2);
        return statusMap.get(str2);
    }

    @Nullable
    public final String getSubStatus() {
        return this.subStatus;
    }

    @Nullable
    public final String getTaxDescription() {
        return this.taxDescription;
    }

    @Nullable
    public final List<String> getTaxes() {
        return this.taxes;
    }

    public final long getTime() {
        String str = this.status;
        if (str == null) {
            return this.updatedAt;
        }
        if (Intrinsics.areEqual("WALLET_PROCESSING", str) || Intrinsics.areEqual("PROCESSING", this.status)) {
            return this.createdAt;
        }
        if (!Intrinsics.areEqual(AppConstants.AB_TEST_SUCCESS, this.status)) {
            return this.updatedAt;
        }
        long j11 = this.noticeAt;
        return j11 == 0 ? this.updatedAt : j11;
    }

    @Nullable
    public final String getToAccountTag() {
        return this.toAccountTag;
    }

    @Nullable
    public final String getToSubUserId() {
        return this.toSubUserId;
    }

    @Nullable
    public final String getToSubUserName() {
        return this.toSubUserName;
    }

    @Nullable
    public final String getTravelRuleOrderStatus() {
        return this.travelRuleOrderStatus;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getTypeString(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (TextUtils.equals(this.type, ChannelKycRequest.SCENE_WITHDRAW)) {
            String string = context.getString(R$string.fiat_withdrawal);
            Intrinsics.checkNotNull(string);
            return string;
        }
        if (!TextUtils.equals(this.type, ChannelKycRequest.SCENE_DEPOSIT)) {
            return "";
        }
        String string2 = context.getString(R$string.fiat_charge);
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    @NotNull
    public final String getWalletTxIdStr() {
        String strSubstringBefore$default;
        String str = this.walletTxId;
        if (str == null) {
            return "--";
        }
        if (str.length() <= 0) {
            str = null;
        }
        return (str == null || (strSubstringBefore$default = StringsKt.substringBefore$default(str, "@", (String) null, 2, (Object) null)) == null) ? "--" : strSubstringBefore$default;
    }

    /* JADX INFO: renamed from: isArrears, reason: from getter */
    public final boolean getIsArrears() {
        return this.isArrears;
    }

    public final boolean isCompleted() {
        return TextUtils.equals(this.status, AppConstants.AB_TEST_SUCCESS);
    }

    /* JADX INFO: renamed from: isContract, reason: from getter */
    public final boolean getIsContract() {
        return this.isContract;
    }

    @Nullable
    /* JADX INFO: renamed from: isShowOldAddressRisk, reason: from getter */
    public final Boolean getIsShowOldAddressRisk() {
        return this.isShowOldAddressRisk;
    }

    public final boolean isWithdraw() {
        return TextUtils.equals(this.type, ChannelKycRequest.SCENE_WITHDRAW);
    }

    public final void setAccountType(@Nullable String str) {
        this.accountType = str;
    }

    public final void setAccountTypes(@Nullable List<String> list) {
        this.accountTypes = list;
    }

    public final void setAddress(@Nullable String str) {
        this.address = str;
    }

    public final void setArrears(boolean z11) {
        this.isArrears = z11;
    }

    public final void setCancelType(@Nullable String str) {
        this.cancelType = str;
    }

    public final void setChainId(@Nullable String str) {
        this.chainId = str;
    }

    public final void setChainName(@Nullable String str) {
        this.chainName = str;
    }

    public final void setContract(boolean z11) {
        this.isContract = z11;
    }

    public final void setCreatedAt(long j11) {
        this.createdAt = j11;
    }

    public final void setFailureReason(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.failureReason = str;
    }

    public final void setFailureReasonMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.failureReasonMsg = str;
    }

    public final void setFee(@Nullable BigDecimal bigDecimal) {
        this.fee = bigDecimal;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setMemo(@Nullable String str) {
        this.memo = str;
    }

    public final void setNeedSubmitWht(@Nullable Boolean bool) {
        this.needSubmitWht = bool;
    }

    public final void setPromptType(@Nullable String str) {
        this.promptType = str;
    }

    public final void setRemark(@Nullable String str) {
        this.remark = str;
    }

    public final void setReturnAmount(@Nullable String str) {
        this.returnAmount = str;
    }

    public final void setReturnCurrency(@Nullable String str) {
        this.returnCurrency = str;
    }

    public final void setReturnStatus(@Nullable String str) {
        this.returnStatus = str;
    }

    public final void setShowOldAddressRisk(@Nullable Boolean bool) {
        this.isShowOldAddressRisk = bool;
    }

    public final void setSubStatus(@Nullable String str) {
        this.subStatus = str;
    }

    public final void setTaxDescription(@Nullable String str) {
        this.taxDescription = str;
    }

    public final void setTaxes(@Nullable List<String> list) {
        this.taxes = list;
    }

    public final void setToAccountTag(@Nullable String str) {
        this.toAccountTag = str;
    }

    public final void setToSubUserId(@Nullable String str) {
        this.toSubUserId = str;
    }

    public final void setToSubUserName(@Nullable String str) {
        this.toSubUserName = str;
    }

    public final void setTravelRuleOrderStatus(@Nullable String str) {
        this.travelRuleOrderStatus = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.address);
        dest.writeString(this.addressRemark);
        dest.writeString(this.memo);
        dest.writeSerializable(this.amount);
        dest.writeString(this.chainId);
        dest.writeLong(this.createdAt);
        dest.writeLong(this.noticeAt);
        dest.writeString(this.code);
        dest.writeString(this.currencyName);
        dest.writeSerializable(this.fee);
        dest.writeString(this.id);
        dest.writeInt(this.isInner ? 1 : 0);
        dest.writeString(this.remark);
        dest.writeString(this.status);
        dest.writeLong(this.updatedAt);
        dest.writeString(this.walletTxId);
        dest.writeString(this.failureReason);
        dest.writeString(this.failureReasonMsg);
        dest.writeInt(this.isContract ? 1 : 0);
        dest.writeString(this.iconUrl);
        dest.writeString(this.type);
        dest.writeStringList(this.accountTypes);
        dest.writeString(this.accountType);
        dest.writeString(this.promptType);
        dest.writeString(this.confirmation);
        dest.writeString(this.confirmationCount);
        dest.writeInt(this.isArrears ? 1 : 0);
        dest.writeString(this.toSubUserId);
        dest.writeString(this.toSubUserName);
        dest.writeString(this.toAccountTag);
        dest.writeString(this.chainName);
        dest.writeString(this.cancelType);
        dest.writeStringList(this.taxes);
        dest.writeString(this.taxDescription);
        dest.writeString(this.returnAmount);
        dest.writeString(this.returnStatus);
        dest.writeString(this.returnCurrency);
        dest.writeString(this.subStatus);
        Boolean bool = this.needSubmitWht;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isShowOldAddressRisk;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.travelRuleOrderStatus);
        HashMap<String, String> map = this.statusMap;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
    }

    @NotNull
    public final String getTimeString() {
        return C42179a.m92633f(getTime(), null, false, true, null, 11, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HistoryRecordEntity(String str, String str2, String str3, BigDecimal bigDecimal, String str4, long j11, long j12, String str5, String str6, BigDecimal bigDecimal2, String str7, boolean z11, String str8, String str9, long j13, String str10, String str11, String str12, boolean z12, String str13, String str14, List list, String str15, String str16, String str17, String str18, boolean z13, String str19, String str20, String str21, String str22, String str23, List list2, String str24, String str25, String str26, String str27, String str28, Boolean bool, Boolean bool2, String str29, HashMap map, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        String str30 = (i11 & 1) != 0 ? null : str;
        this(str30, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : bigDecimal, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? 0L : j11, (i11 & 64) != 0 ? 0L : j12, (i11 & 128) != 0 ? null : str5, (i11 & 256) != 0 ? null : str6, (i11 & 512) != 0 ? null : bigDecimal2, (i11 & 1024) != 0 ? null : str7, (i11 & 2048) != 0 ? false : z11, (i11 & 4096) != 0 ? null : str8, (i11 & 8192) != 0 ? null : str9, (i11 & 16384) != 0 ? 0L : j13, (32768 & i11) != 0 ? null : str10, (i11 & 65536) != 0 ? "" : str11, (i11 & 131072) == 0 ? str12 : "", (i11 & 262144) != 0 ? false : z12, (i11 & 524288) != 0 ? null : str13, (i11 & 1048576) != 0 ? null : str14, (i11 & 2097152) != 0 ? null : list, (i11 & 4194304) != 0 ? null : str15, (i11 & 8388608) != 0 ? null : str16, (i11 & 16777216) != 0 ? null : str17, (i11 & 33554432) != 0 ? null : str18, (i11 & 67108864) == 0 ? z13 : false, (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : str19, (i11 & 268435456) != 0 ? null : str20, (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : str21, (i11 & 1073741824) != 0 ? null : str22, (i11 & Integer.MIN_VALUE) != 0 ? null : str23, (i12 & 1) != 0 ? null : list2, (i12 & 2) != 0 ? null : str24, (i12 & 4) != 0 ? null : str25, (i12 & 8) != 0 ? null : str26, (i12 & 16) != 0 ? null : str27, (i12 & 32) != 0 ? null : str28, (i12 & 64) != 0 ? null : bool, (i12 & 128) != 0 ? null : bool2, (i12 & 256) != 0 ? null : str29, (i12 & 512) != 0 ? null : map);
    }
}
