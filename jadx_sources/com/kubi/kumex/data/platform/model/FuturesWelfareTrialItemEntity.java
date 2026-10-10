package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import bm.InterfaceC4633f;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FuturesWelfareEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\bs\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u009e\u00012\u00020\u00012\u00020\u0002:\u0002\u009e\u0001BÕ\u0003\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b/\u00100J\u0006\u0010i\u001a\u00020\"J\u0006\u0010j\u001a\u00020\"J\u000b\u0010k\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010m\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010n\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010o\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010p\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010x\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010CJ\u0010\u0010y\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010CJ\u000b\u0010z\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010|\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0019HÆ\u0003J\u0011\u0010}\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\"HÆ\u0003J\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u00105J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0002\u0010VJ\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010CJ\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003Jâ\u0003\u0010\u0091\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0003\u0010\u0092\u0001J\u0007\u0010\u0093\u0001\u001a\u00020\u0014J\u0016\u0010\u0094\u0001\u001a\u00020\"2\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0096\u0001HÖ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0014HÖ\u0001J\n\u0010\u0098\u0001\u001a\u00020\u0004HÖ\u0001J\u001b\u0010\u0099\u0001\u001a\u00030\u009a\u00012\b\u0010\u009b\u0001\u001a\u00030\u009c\u00012\u0007\u0010\u009d\u0001\u001a\u00020\u0014R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u00106\u001a\u0004\b7\u00105R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u00106\u001a\u0004\b8\u00105R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00102R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b<\u0010;R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b=\u0010;R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b>\u0010;R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00102R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010;R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bA\u0010;R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010D\u001a\u0004\bB\u0010CR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010D\u001a\u0004\bE\u0010CR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bF\u0010;R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bG\u0010;R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010IR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bK\u0010;R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bL\u0010;R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u00102R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u00102R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u00102R\u0013\u0010 \u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bP\u0010;R\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0015\u0010#\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u00106\u001a\u0004\bU\u00105R\u001e\u0010$\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u0010\n\u0002\u0010Y\u001a\u0004\b$\u0010V\"\u0004\bW\u0010XR\u001c\u0010%\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u00102\"\u0004\b[\u0010\\R\u001e\u0010&\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010D\u001a\u0004\b]\u0010C\"\u0004\b^\u0010_R\u001c\u0010'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u00102\"\u0004\ba\u0010\\R\u0013\u0010(\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u00102R\u0013\u0010)\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u00102R\u0013\u0010*\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u00102R\u0013\u0010+\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u00102R\u0013\u0010,\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u00102R\u0013\u0010-\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u00102R\u0013\u0010.\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u00102¨\u0006\u009f\u0001"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "Landroid/os/Parcelable;", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareType;", "code", "", "status", "validPeriod", "", "activateValidPeriod", "expiredPeriod", FirebaseAnalytics.Param.CURRENCY, "faceValue", "Ljava/math/BigDecimal;", "withdrawnValue", "availableCashAmount", "realisedPNL", "type", "minTotalAmount", "totalAmount", "tradeNum", "", "minTradeNum", "maxValue", "minValue", "contractList", "", "supportedContracts", "maxLeverage", "trialFundBalance", "ruleUrl", "ruleText", "withDrawHelpText", "minCloseRealisedPnl", "checked", "", "recycleAt", "isLoading", "prizeType", "useDurition", "marginMode", "couponId", "rewardId", "tag", "displayTitle", "couponAlias", "progressUrl", "campaignTemplateCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ZLjava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getStatus", "getValidPeriod", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getActivateValidPeriod", "getExpiredPeriod", "getCurrency", "getFaceValue", "()Ljava/math/BigDecimal;", "getWithdrawnValue", "getAvailableCashAmount", "getRealisedPNL", "getType", "getMinTotalAmount", "getTotalAmount", "getTradeNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinTradeNum", "getMaxValue", "getMinValue", "getContractList", "()Ljava/util/List;", "getSupportedContracts", "getMaxLeverage", "getTrialFundBalance", "getRuleUrl", "getRuleText", "getWithDrawHelpText", "getMinCloseRealisedPnl", "getChecked", "()Z", "setChecked", "(Z)V", "getRecycleAt", "()Ljava/lang/Boolean;", "setLoading", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPrizeType", "setPrizeType", "(Ljava/lang/String;)V", "getUseDurition", "setUseDurition", "(Ljava/lang/Integer;)V", "getMarginMode", "setMarginMode", "getCouponId", "getRewardId", "getTag", "getDisplayTitle", "getCouponAlias", "getProgressUrl", "getCampaignTemplateCode", "isLeadTrialFund", "isTradeProTrial", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ZLjava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesWelfareTrialItemEntity implements Parcelable, InterfaceC4633f {

    @NotNull
    public static final String LEAD_TRIAL_FUND_TYPE = "leadTrial";

    @NotNull
    public static final String PRIZE_TYPE_TRADE_PRO = "TRADE_PRO";

    @Nullable
    private final Long activateValidPeriod;

    @Nullable
    private final BigDecimal availableCashAmount;

    @Nullable
    private final String campaignTemplateCode;
    private boolean checked;

    @Nullable
    private final String code;

    @Nullable
    private final List<String> contractList;

    @Nullable
    private final String couponAlias;

    @Nullable
    private final String couponId;

    @Nullable
    private final String currency;

    @Nullable
    private final String displayTitle;

    @Nullable
    private final Long expiredPeriod;

    @Nullable
    private final BigDecimal faceValue;

    @Nullable
    private Boolean isLoading;

    @Nullable
    private String marginMode;

    @Nullable
    private final BigDecimal maxLeverage;

    @Nullable
    private final BigDecimal maxValue;

    @Nullable
    private final BigDecimal minCloseRealisedPnl;

    @Nullable
    private final BigDecimal minTotalAmount;

    @Nullable
    private final Integer minTradeNum;

    @Nullable
    private final BigDecimal minValue;

    @Nullable
    private String prizeType;

    @Nullable
    private final String progressUrl;

    @Nullable
    private final BigDecimal realisedPNL;

    @Nullable
    private final Long recycleAt;

    @Nullable
    private final String rewardId;

    @Nullable
    private final String ruleText;

    @Nullable
    private final String ruleUrl;

    @Nullable
    private final String status;

    @Nullable
    private final List<String> supportedContracts;

    @Nullable
    private final String tag;

    @Nullable
    private final BigDecimal totalAmount;

    @Nullable
    private final Integer tradeNum;

    @Nullable
    private final BigDecimal trialFundBalance;

    @Nullable
    private final String type;

    @Nullable
    private Integer useDurition;

    @Nullable
    private final Long validPeriod;

    @Nullable
    private final String withDrawHelpText;

    @Nullable
    private final BigDecimal withdrawnValue;

    @NotNull
    public static final Parcelable.Creator<FuturesWelfareTrialItemEntity> CREATOR = new C15807a();

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity$a */
    /* JADX INFO: compiled from: FuturesWelfareEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15807a implements Parcelable.Creator<FuturesWelfareTrialItemEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FuturesWelfareTrialItemEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string3 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            String string4 = parcel.readString();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal6 = (BigDecimal) parcel.readSerializable();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BigDecimal bigDecimal7 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal8 = (BigDecimal) parcel.readSerializable();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            BigDecimal bigDecimal9 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal10 = (BigDecimal) parcel.readSerializable();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            BigDecimal bigDecimal11 = (BigDecimal) parcel.readSerializable();
            boolean z11 = parcel.readInt() != 0;
            Long lValueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FuturesWelfareTrialItemEntity(string, string2, lValueOf, lValueOf2, lValueOf3, string3, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, string4, bigDecimal5, bigDecimal6, numValueOf, numValueOf2, bigDecimal7, bigDecimal8, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, bigDecimal9, bigDecimal10, string5, string6, string7, bigDecimal11, z11, lValueOf4, boolValueOf, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FuturesWelfareTrialItemEntity[] newArray(int i11) {
            return new FuturesWelfareTrialItemEntity[i11];
        }
    }

    public FuturesWelfareTrialItemEntity(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable String str3, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable String str4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable Integer num, @Nullable Integer num2, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable List<String> list, @Nullable List<String> list2, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable BigDecimal bigDecimal11, boolean z11, @Nullable Long l14, @Nullable Boolean bool, @Nullable String str8, @Nullable Integer num3, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16) {
        this.code = str;
        this.status = str2;
        this.validPeriod = l11;
        this.activateValidPeriod = l12;
        this.expiredPeriod = l13;
        this.currency = str3;
        this.faceValue = bigDecimal;
        this.withdrawnValue = bigDecimal2;
        this.availableCashAmount = bigDecimal3;
        this.realisedPNL = bigDecimal4;
        this.type = str4;
        this.minTotalAmount = bigDecimal5;
        this.totalAmount = bigDecimal6;
        this.tradeNum = num;
        this.minTradeNum = num2;
        this.maxValue = bigDecimal7;
        this.minValue = bigDecimal8;
        this.contractList = list;
        this.supportedContracts = list2;
        this.maxLeverage = bigDecimal9;
        this.trialFundBalance = bigDecimal10;
        this.ruleUrl = str5;
        this.ruleText = str6;
        this.withDrawHelpText = str7;
        this.minCloseRealisedPnl = bigDecimal11;
        this.checked = z11;
        this.recycleAt = l14;
        this.isLoading = bool;
        this.prizeType = str8;
        this.useDurition = num3;
        this.marginMode = str9;
        this.couponId = str10;
        this.rewardId = str11;
        this.tag = str12;
        this.displayTitle = str13;
        this.couponAlias = str14;
        this.progressUrl = str15;
        this.campaignTemplateCode = str16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesWelfareTrialItemEntity copy$default(FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity, String str, String str2, Long l11, Long l12, Long l13, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, Integer num, Integer num2, BigDecimal bigDecimal7, BigDecimal bigDecimal8, List list, List list2, BigDecimal bigDecimal9, BigDecimal bigDecimal10, String str5, String str6, String str7, BigDecimal bigDecimal11, boolean z11, Long l14, Boolean bool, String str8, Integer num3, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i11, int i12, Object obj) {
        String str17;
        String str18;
        String str19 = (i11 & 1) != 0 ? futuresWelfareTrialItemEntity.code : str;
        String str20 = (i11 & 2) != 0 ? futuresWelfareTrialItemEntity.status : str2;
        Long l15 = (i11 & 4) != 0 ? futuresWelfareTrialItemEntity.validPeriod : l11;
        Long l16 = (i11 & 8) != 0 ? futuresWelfareTrialItemEntity.activateValidPeriod : l12;
        Long l17 = (i11 & 16) != 0 ? futuresWelfareTrialItemEntity.expiredPeriod : l13;
        String str21 = (i11 & 32) != 0 ? futuresWelfareTrialItemEntity.currency : str3;
        BigDecimal bigDecimal12 = (i11 & 64) != 0 ? futuresWelfareTrialItemEntity.faceValue : bigDecimal;
        BigDecimal bigDecimal13 = (i11 & 128) != 0 ? futuresWelfareTrialItemEntity.withdrawnValue : bigDecimal2;
        BigDecimal bigDecimal14 = (i11 & 256) != 0 ? futuresWelfareTrialItemEntity.availableCashAmount : bigDecimal3;
        BigDecimal bigDecimal15 = (i11 & 512) != 0 ? futuresWelfareTrialItemEntity.realisedPNL : bigDecimal4;
        String str22 = (i11 & 1024) != 0 ? futuresWelfareTrialItemEntity.type : str4;
        BigDecimal bigDecimal16 = (i11 & 2048) != 0 ? futuresWelfareTrialItemEntity.minTotalAmount : bigDecimal5;
        BigDecimal bigDecimal17 = (i11 & 4096) != 0 ? futuresWelfareTrialItemEntity.totalAmount : bigDecimal6;
        Integer num4 = (i11 & 8192) != 0 ? futuresWelfareTrialItemEntity.tradeNum : num;
        String str23 = str19;
        Integer num5 = (i11 & 16384) != 0 ? futuresWelfareTrialItemEntity.minTradeNum : num2;
        BigDecimal bigDecimal18 = (i11 & 32768) != 0 ? futuresWelfareTrialItemEntity.maxValue : bigDecimal7;
        BigDecimal bigDecimal19 = (i11 & 65536) != 0 ? futuresWelfareTrialItemEntity.minValue : bigDecimal8;
        List list3 = (i11 & 131072) != 0 ? futuresWelfareTrialItemEntity.contractList : list;
        List list4 = (i11 & 262144) != 0 ? futuresWelfareTrialItemEntity.supportedContracts : list2;
        BigDecimal bigDecimal20 = (i11 & 524288) != 0 ? futuresWelfareTrialItemEntity.maxLeverage : bigDecimal9;
        BigDecimal bigDecimal21 = (i11 & 1048576) != 0 ? futuresWelfareTrialItemEntity.trialFundBalance : bigDecimal10;
        String str24 = (i11 & 2097152) != 0 ? futuresWelfareTrialItemEntity.ruleUrl : str5;
        String str25 = (i11 & 4194304) != 0 ? futuresWelfareTrialItemEntity.ruleText : str6;
        String str26 = (i11 & 8388608) != 0 ? futuresWelfareTrialItemEntity.withDrawHelpText : str7;
        BigDecimal bigDecimal22 = (i11 & 16777216) != 0 ? futuresWelfareTrialItemEntity.minCloseRealisedPnl : bigDecimal11;
        boolean z12 = (i11 & 33554432) != 0 ? futuresWelfareTrialItemEntity.checked : z11;
        Long l18 = (i11 & 67108864) != 0 ? futuresWelfareTrialItemEntity.recycleAt : l14;
        Boolean bool2 = (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? futuresWelfareTrialItemEntity.isLoading : bool;
        String str27 = (i11 & 268435456) != 0 ? futuresWelfareTrialItemEntity.prizeType : str8;
        Integer num6 = (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? futuresWelfareTrialItemEntity.useDurition : num3;
        String str28 = (i11 & 1073741824) != 0 ? futuresWelfareTrialItemEntity.marginMode : str9;
        String str29 = (i11 & Integer.MIN_VALUE) != 0 ? futuresWelfareTrialItemEntity.couponId : str10;
        String str30 = (i12 & 1) != 0 ? futuresWelfareTrialItemEntity.rewardId : str11;
        String str31 = (i12 & 2) != 0 ? futuresWelfareTrialItemEntity.tag : str12;
        String str32 = (i12 & 4) != 0 ? futuresWelfareTrialItemEntity.displayTitle : str13;
        String str33 = (i12 & 8) != 0 ? futuresWelfareTrialItemEntity.couponAlias : str14;
        String str34 = (i12 & 16) != 0 ? futuresWelfareTrialItemEntity.progressUrl : str15;
        if ((i12 & 32) != 0) {
            str18 = str34;
            str17 = futuresWelfareTrialItemEntity.campaignTemplateCode;
        } else {
            str17 = str16;
            str18 = str34;
        }
        return futuresWelfareTrialItemEntity.copy(str23, str20, l15, l16, l17, str21, bigDecimal12, bigDecimal13, bigDecimal14, bigDecimal15, str22, bigDecimal16, bigDecimal17, num4, num5, bigDecimal18, bigDecimal19, list3, list4, bigDecimal20, bigDecimal21, str24, str25, str26, bigDecimal22, z12, l18, bool2, str27, num6, str28, str29, str30, str31, str32, str33, str18, str17);
    }

    @NotNull
    public final FuturesWelfareTrialItemEntity copy(@Nullable String code, @Nullable String status, @Nullable Long validPeriod, @Nullable Long activateValidPeriod, @Nullable Long expiredPeriod, @Nullable String currency, @Nullable BigDecimal faceValue, @Nullable BigDecimal withdrawnValue, @Nullable BigDecimal availableCashAmount, @Nullable BigDecimal realisedPNL, @Nullable String type, @Nullable BigDecimal minTotalAmount, @Nullable BigDecimal totalAmount, @Nullable Integer tradeNum, @Nullable Integer minTradeNum, @Nullable BigDecimal maxValue, @Nullable BigDecimal minValue, @Nullable List<String> contractList, @Nullable List<String> supportedContracts, @Nullable BigDecimal maxLeverage, @Nullable BigDecimal trialFundBalance, @Nullable String ruleUrl, @Nullable String ruleText, @Nullable String withDrawHelpText, @Nullable BigDecimal minCloseRealisedPnl, boolean checked, @Nullable Long recycleAt, @Nullable Boolean isLoading, @Nullable String prizeType, @Nullable Integer useDurition, @Nullable String marginMode, @Nullable String couponId, @Nullable String rewardId, @Nullable String tag, @Nullable String displayTitle, @Nullable String couponAlias, @Nullable String progressUrl, @Nullable String campaignTemplateCode) {
        return new FuturesWelfareTrialItemEntity(code, status, validPeriod, activateValidPeriod, expiredPeriod, currency, faceValue, withdrawnValue, availableCashAmount, realisedPNL, type, minTotalAmount, totalAmount, tradeNum, minTradeNum, maxValue, minValue, contractList, supportedContracts, maxLeverage, trialFundBalance, ruleUrl, ruleText, withDrawHelpText, minCloseRealisedPnl, checked, recycleAt, isLoading, prizeType, useDurition, marginMode, couponId, rewardId, tag, displayTitle, couponAlias, progressUrl, campaignTemplateCode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesWelfareTrialItemEntity)) {
            return false;
        }
        FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity = (FuturesWelfareTrialItemEntity) other;
        return Intrinsics.areEqual(this.code, futuresWelfareTrialItemEntity.code) && Intrinsics.areEqual(this.status, futuresWelfareTrialItemEntity.status) && Intrinsics.areEqual(this.validPeriod, futuresWelfareTrialItemEntity.validPeriod) && Intrinsics.areEqual(this.activateValidPeriod, futuresWelfareTrialItemEntity.activateValidPeriod) && Intrinsics.areEqual(this.expiredPeriod, futuresWelfareTrialItemEntity.expiredPeriod) && Intrinsics.areEqual(this.currency, futuresWelfareTrialItemEntity.currency) && Intrinsics.areEqual(this.faceValue, futuresWelfareTrialItemEntity.faceValue) && Intrinsics.areEqual(this.withdrawnValue, futuresWelfareTrialItemEntity.withdrawnValue) && Intrinsics.areEqual(this.availableCashAmount, futuresWelfareTrialItemEntity.availableCashAmount) && Intrinsics.areEqual(this.realisedPNL, futuresWelfareTrialItemEntity.realisedPNL) && Intrinsics.areEqual(this.type, futuresWelfareTrialItemEntity.type) && Intrinsics.areEqual(this.minTotalAmount, futuresWelfareTrialItemEntity.minTotalAmount) && Intrinsics.areEqual(this.totalAmount, futuresWelfareTrialItemEntity.totalAmount) && Intrinsics.areEqual(this.tradeNum, futuresWelfareTrialItemEntity.tradeNum) && Intrinsics.areEqual(this.minTradeNum, futuresWelfareTrialItemEntity.minTradeNum) && Intrinsics.areEqual(this.maxValue, futuresWelfareTrialItemEntity.maxValue) && Intrinsics.areEqual(this.minValue, futuresWelfareTrialItemEntity.minValue) && Intrinsics.areEqual(this.contractList, futuresWelfareTrialItemEntity.contractList) && Intrinsics.areEqual(this.supportedContracts, futuresWelfareTrialItemEntity.supportedContracts) && Intrinsics.areEqual(this.maxLeverage, futuresWelfareTrialItemEntity.maxLeverage) && Intrinsics.areEqual(this.trialFundBalance, futuresWelfareTrialItemEntity.trialFundBalance) && Intrinsics.areEqual(this.ruleUrl, futuresWelfareTrialItemEntity.ruleUrl) && Intrinsics.areEqual(this.ruleText, futuresWelfareTrialItemEntity.ruleText) && Intrinsics.areEqual(this.withDrawHelpText, futuresWelfareTrialItemEntity.withDrawHelpText) && Intrinsics.areEqual(this.minCloseRealisedPnl, futuresWelfareTrialItemEntity.minCloseRealisedPnl) && this.checked == futuresWelfareTrialItemEntity.checked && Intrinsics.areEqual(this.recycleAt, futuresWelfareTrialItemEntity.recycleAt) && Intrinsics.areEqual(this.isLoading, futuresWelfareTrialItemEntity.isLoading) && Intrinsics.areEqual(this.prizeType, futuresWelfareTrialItemEntity.prizeType) && Intrinsics.areEqual(this.useDurition, futuresWelfareTrialItemEntity.useDurition) && Intrinsics.areEqual(this.marginMode, futuresWelfareTrialItemEntity.marginMode) && Intrinsics.areEqual(this.couponId, futuresWelfareTrialItemEntity.couponId) && Intrinsics.areEqual(this.rewardId, futuresWelfareTrialItemEntity.rewardId) && Intrinsics.areEqual(this.tag, futuresWelfareTrialItemEntity.tag) && Intrinsics.areEqual(this.displayTitle, futuresWelfareTrialItemEntity.displayTitle) && Intrinsics.areEqual(this.couponAlias, futuresWelfareTrialItemEntity.couponAlias) && Intrinsics.areEqual(this.progressUrl, futuresWelfareTrialItemEntity.progressUrl) && Intrinsics.areEqual(this.campaignTemplateCode, futuresWelfareTrialItemEntity.campaignTemplateCode);
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.status;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.validPeriod;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.activateValidPeriod;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.expiredPeriod;
        int iHashCode5 = (iHashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal = this.faceValue;
        int iHashCode7 = (iHashCode6 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.withdrawnValue;
        int iHashCode8 = (iHashCode7 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.availableCashAmount;
        int iHashCode9 = (iHashCode8 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.realisedPNL;
        int iHashCode10 = (iHashCode9 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str4 = this.type;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.minTotalAmount;
        int iHashCode12 = (iHashCode11 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.totalAmount;
        int iHashCode13 = (iHashCode12 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        Integer num = this.tradeNum;
        int iHashCode14 = (iHashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minTradeNum;
        int iHashCode15 = (iHashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.maxValue;
        int iHashCode16 = (iHashCode15 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.minValue;
        int iHashCode17 = (iHashCode16 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        List<String> list = this.contractList;
        int iHashCode18 = (iHashCode17 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.supportedContracts;
        int iHashCode19 = (iHashCode18 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.maxLeverage;
        int iHashCode20 = (iHashCode19 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.trialFundBalance;
        int iHashCode21 = (iHashCode20 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        String str5 = this.ruleUrl;
        int iHashCode22 = (iHashCode21 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ruleText;
        int iHashCode23 = (iHashCode22 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.withDrawHelpText;
        int iHashCode24 = (iHashCode23 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.minCloseRealisedPnl;
        int iHashCode25 = (((iHashCode24 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31) + Boolean.hashCode(this.checked)) * 31;
        Long l14 = this.recycleAt;
        int iHashCode26 = (iHashCode25 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Boolean bool = this.isLoading;
        int iHashCode27 = (iHashCode26 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.prizeType;
        int iHashCode28 = (iHashCode27 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num3 = this.useDurition;
        int iHashCode29 = (iHashCode28 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str9 = this.marginMode;
        int iHashCode30 = (iHashCode29 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.couponId;
        int iHashCode31 = (iHashCode30 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.rewardId;
        int iHashCode32 = (iHashCode31 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.tag;
        int iHashCode33 = (iHashCode32 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.displayTitle;
        int iHashCode34 = (iHashCode33 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.couponAlias;
        int iHashCode35 = (iHashCode34 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.progressUrl;
        int iHashCode36 = (iHashCode35 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.campaignTemplateCode;
        return iHashCode36 + (str16 != null ? str16.hashCode() : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getRealisedPNL() {
        return this.realisedPNL;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getMinTotalAmount() {
        return this.minTotalAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getTradeNum() {
        return this.tradeNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getMinTradeNum() {
        return this.minTradeNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigDecimal getMaxValue() {
        return this.maxValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final BigDecimal getMinValue() {
        return this.minValue;
    }

    @Nullable
    public final List<String> component18() {
        return this.contractList;
    }

    @Nullable
    public final List<String> component19() {
        return this.supportedContracts;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final BigDecimal getTrialFundBalance() {
        return this.trialFundBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getRuleUrl() {
        return this.ruleUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getRuleText() {
        return this.ruleText;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getWithDrawHelpText() {
        return this.withDrawHelpText;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final BigDecimal getMinCloseRealisedPnl() {
        return this.minCloseRealisedPnl;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Long getRecycleAt() {
        return this.recycleAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Boolean getIsLoading() {
        return this.isLoading;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getPrizeType() {
        return this.prizeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getValidPeriod() {
        return this.validPeriod;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Integer getUseDurition() {
        return this.useDurition;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getCouponId() {
        return this.couponId;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getRewardId() {
        return this.rewardId;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getDisplayTitle() {
        return this.displayTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getCouponAlias() {
        return this.couponAlias;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getProgressUrl() {
        return this.progressUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getCampaignTemplateCode() {
        return this.campaignTemplateCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getActivateValidPeriod() {
        return this.activateValidPeriod;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getExpiredPeriod() {
        return this.expiredPeriod;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getFaceValue() {
        return this.faceValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getWithdrawnValue() {
        return this.withdrawnValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getAvailableCashAmount() {
        return this.availableCashAmount;
    }

    @Nullable
    public final Long getActivateValidPeriod() {
        return this.activateValidPeriod;
    }

    @Nullable
    public final BigDecimal getAvailableCashAmount() {
        return this.availableCashAmount;
    }

    @Nullable
    public final String getCampaignTemplateCode() {
        return this.campaignTemplateCode;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final List<String> getContractList() {
        return this.contractList;
    }

    @Nullable
    public final String getCouponAlias() {
        return this.couponAlias;
    }

    @Nullable
    public final String getCouponId() {
        return this.couponId;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getDisplayTitle() {
        return this.displayTitle;
    }

    @Nullable
    public final Long getExpiredPeriod() {
        return this.expiredPeriod;
    }

    @Nullable
    public final BigDecimal getFaceValue() {
        return this.faceValue;
    }

    @Nullable
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    public final BigDecimal getMaxValue() {
        return this.maxValue;
    }

    @Nullable
    public final BigDecimal getMinCloseRealisedPnl() {
        return this.minCloseRealisedPnl;
    }

    @Nullable
    public final BigDecimal getMinTotalAmount() {
        return this.minTotalAmount;
    }

    @Nullable
    public final Integer getMinTradeNum() {
        return this.minTradeNum;
    }

    @Nullable
    public final BigDecimal getMinValue() {
        return this.minValue;
    }

    @Nullable
    public final String getPrizeType() {
        return this.prizeType;
    }

    @Nullable
    public final String getProgressUrl() {
        return this.progressUrl;
    }

    @Nullable
    public final BigDecimal getRealisedPNL() {
        return this.realisedPNL;
    }

    @Nullable
    public final Long getRecycleAt() {
        return this.recycleAt;
    }

    @Nullable
    public final String getRewardId() {
        return this.rewardId;
    }

    @Nullable
    public final String getRuleText() {
        return this.ruleText;
    }

    @Nullable
    public final String getRuleUrl() {
        return this.ruleUrl;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final List<String> getSupportedContracts() {
        return this.supportedContracts;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    @Nullable
    public final Integer getTradeNum() {
        return this.tradeNum;
    }

    @Nullable
    public final BigDecimal getTrialFundBalance() {
        return this.trialFundBalance;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final Integer getUseDurition() {
        return this.useDurition;
    }

    @Nullable
    public final Long getValidPeriod() {
        return this.validPeriod;
    }

    @Nullable
    public final String getWithDrawHelpText() {
        return this.withDrawHelpText;
    }

    @Nullable
    public final BigDecimal getWithdrawnValue() {
        return this.withdrawnValue;
    }

    public final boolean isLeadTrialFund() {
        return StringsKt.equals(C27041f.m66668h(this.type), LEAD_TRIAL_FUND_TYPE, true);
    }

    @Nullable
    public final Boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isTradeProTrial() {
        return StringsKt.equals(C27041f.m66668h(this.prizeType), PRIZE_TYPE_TRADE_PRO, true);
    }

    public final void setChecked(boolean z11) {
        this.checked = z11;
    }

    public final void setLoading(@Nullable Boolean bool) {
        this.isLoading = bool;
    }

    public final void setMarginMode(@Nullable String str) {
        this.marginMode = str;
    }

    public final void setPrizeType(@Nullable String str) {
        this.prizeType = str;
    }

    public final void setUseDurition(@Nullable Integer num) {
        this.useDurition = num;
    }

    @NotNull
    public String toString() {
        return "FuturesWelfareTrialItemEntity(code=" + this.code + ", status=" + this.status + ", validPeriod=" + this.validPeriod + ", activateValidPeriod=" + this.activateValidPeriod + ", expiredPeriod=" + this.expiredPeriod + ", currency=" + this.currency + ", faceValue=" + this.faceValue + ", withdrawnValue=" + this.withdrawnValue + ", availableCashAmount=" + this.availableCashAmount + ", realisedPNL=" + this.realisedPNL + ", type=" + this.type + ", minTotalAmount=" + this.minTotalAmount + ", totalAmount=" + this.totalAmount + ", tradeNum=" + this.tradeNum + ", minTradeNum=" + this.minTradeNum + ", maxValue=" + this.maxValue + ", minValue=" + this.minValue + ", contractList=" + this.contractList + ", supportedContracts=" + this.supportedContracts + ", maxLeverage=" + this.maxLeverage + ", trialFundBalance=" + this.trialFundBalance + ", ruleUrl=" + this.ruleUrl + ", ruleText=" + this.ruleText + ", withDrawHelpText=" + this.withDrawHelpText + ", minCloseRealisedPnl=" + this.minCloseRealisedPnl + ", checked=" + this.checked + ", recycleAt=" + this.recycleAt + ", isLoading=" + this.isLoading + ", prizeType=" + this.prizeType + ", useDurition=" + this.useDurition + ", marginMode=" + this.marginMode + ", couponId=" + this.couponId + ", rewardId=" + this.rewardId + ", tag=" + this.tag + ", displayTitle=" + this.displayTitle + ", couponAlias=" + this.couponAlias + ", progressUrl=" + this.progressUrl + ", campaignTemplateCode=" + this.campaignTemplateCode + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.code);
        dest.writeString(this.status);
        Long l11 = this.validPeriod;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.activateValidPeriod;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        Long l13 = this.expiredPeriod;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l13.longValue());
        }
        dest.writeString(this.currency);
        dest.writeSerializable(this.faceValue);
        dest.writeSerializable(this.withdrawnValue);
        dest.writeSerializable(this.availableCashAmount);
        dest.writeSerializable(this.realisedPNL);
        dest.writeString(this.type);
        dest.writeSerializable(this.minTotalAmount);
        dest.writeSerializable(this.totalAmount);
        Integer num = this.tradeNum;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.minTradeNum;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeSerializable(this.maxValue);
        dest.writeSerializable(this.minValue);
        dest.writeStringList(this.contractList);
        dest.writeStringList(this.supportedContracts);
        dest.writeSerializable(this.maxLeverage);
        dest.writeSerializable(this.trialFundBalance);
        dest.writeString(this.ruleUrl);
        dest.writeString(this.ruleText);
        dest.writeString(this.withDrawHelpText);
        dest.writeSerializable(this.minCloseRealisedPnl);
        dest.writeInt(this.checked ? 1 : 0);
        Long l14 = this.recycleAt;
        if (l14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l14.longValue());
        }
        Boolean bool = this.isLoading;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.prizeType);
        Integer num3 = this.useDurition;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        dest.writeString(this.marginMode);
        dest.writeString(this.couponId);
        dest.writeString(this.rewardId);
        dest.writeString(this.tag);
        dest.writeString(this.displayTitle);
        dest.writeString(this.couponAlias);
        dest.writeString(this.progressUrl);
        dest.writeString(this.campaignTemplateCode);
    }

    public /* synthetic */ FuturesWelfareTrialItemEntity(String str, String str2, Long l11, Long l12, Long l13, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, Integer num, Integer num2, BigDecimal bigDecimal7, BigDecimal bigDecimal8, List list, List list2, BigDecimal bigDecimal9, BigDecimal bigDecimal10, String str5, String str6, String str7, BigDecimal bigDecimal11, boolean z11, Long l14, Boolean bool, String str8, Integer num3, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : l11, (i11 & 8) != 0 ? null : l12, (i11 & 16) != 0 ? null : l13, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : bigDecimal, (i11 & 128) != 0 ? null : bigDecimal2, (i11 & 256) != 0 ? null : bigDecimal3, (i11 & 512) != 0 ? null : bigDecimal4, str4, (i11 & 2048) != 0 ? null : bigDecimal5, (i11 & 4096) != 0 ? null : bigDecimal6, (i11 & 8192) != 0 ? null : num, (i11 & 16384) != 0 ? null : num2, (32768 & i11) != 0 ? null : bigDecimal7, (65536 & i11) != 0 ? null : bigDecimal8, (131072 & i11) != 0 ? null : list, (262144 & i11) != 0 ? null : list2, (524288 & i11) != 0 ? null : bigDecimal9, (1048576 & i11) != 0 ? null : bigDecimal10, (2097152 & i11) != 0 ? null : str5, (4194304 & i11) != 0 ? null : str6, (8388608 & i11) != 0 ? null : str7, (16777216 & i11) != 0 ? null : bigDecimal11, (33554432 & i11) != 0 ? false : z11, (67108864 & i11) != 0 ? null : l14, (134217728 & i11) != 0 ? Boolean.FALSE : bool, (268435456 & i11) != 0 ? null : str8, (536870912 & i11) != 0 ? null : num3, (1073741824 & i11) != 0 ? null : str9, (i11 & Integer.MIN_VALUE) != 0 ? null : str10, (i12 & 1) != 0 ? null : str11, (i12 & 2) != 0 ? null : str12, (i12 & 4) != 0 ? null : str13, (i12 & 8) != 0 ? null : str14, (i12 & 16) != 0 ? null : str15, (i12 & 32) != 0 ? null : str16);
    }
}
