package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.sdk.util.TimeSyncManager;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AlphaMarketEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0003\b\u0083\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0097\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010$\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010*¢\u0006\u0004\b+\u0010,J\u0007\u0010\u0082\u0001\u001a\u00020\fJ\t\u0010\u0083\u0001\u001a\u00020\u0006H\u0016J\u0007\u0010\u0084\u0001\u001a\u00020\u0004J\u0007\u0010\u0085\u0001\u001a\u00020\u0004J\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\fJ\u0011\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010.J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00103J\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00103J\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00103J\u0011\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00103J\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00103J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010HJ\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0004HÆ\u0003J\u0011\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010HJ\n\u0010\u009a\u0001\u001a\u00020\u0004HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010$HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010$HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010$HÆ\u0003J\u0012\u0010¨\u0001\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010*HÆ\u0003J \u0003\u0010©\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010$2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010*HÆ\u0001¢\u0006\u0003\u0010ª\u0001J\u0007\u0010«\u0001\u001a\u00020\u0006J\u0016\u0010¬\u0001\u001a\u00020\u00042\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010®\u0001HÖ\u0003J\n\u0010¯\u0001\u001a\u00020\u0006HÖ\u0001J\n\u0010°\u0001\u001a\u00020\fHÖ\u0001J\u001b\u0010±\u0001\u001a\u00030²\u00012\b\u0010³\u0001\u001a\u00030´\u00012\u0007\u0010µ\u0001\u001a\u00020\u0006R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b7\u00103\"\u0004\b8\u00105R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b9\u00103\"\u0004\b:\u00105R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b;\u00103\"\u0004\b<\u00105R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b=\u00103\"\u0004\b>\u00105R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010\r\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010@\"\u0004\bD\u0010BR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010@\"\u0004\bF\u0010BR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010K\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010@\"\u0004\bM\u0010BR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010@\"\u0004\bO\u0010BR\u001a\u0010\u0013\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001a\u0010\u0014\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010Q\"\u0004\bU\u0010SR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010Q\"\u0004\bW\u0010SR\u001a\u0010\u0016\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Q\"\u0004\bY\u0010SR\u001a\u0010\u0017\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010Q\"\u0004\b[\u0010SR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010Q\"\u0004\b]\u0010SR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010K\u001a\u0004\b^\u0010H\"\u0004\b_\u0010JR\u001a\u0010\u001a\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010Q\"\u0004\ba\u0010SR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010@\"\u0004\bc\u0010BR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010@\"\u0004\be\u0010BR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010@\"\u0004\bg\u0010BR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010@\"\u0004\bi\u0010BR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010@\"\u0004\bk\u0010BR\u001c\u0010 \u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010@\"\u0004\bm\u0010BR\u001c\u0010!\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010@\"\u0004\bo\u0010BR\u001c\u0010\"\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010@\"\u0004\bq\u0010BR\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u001c\u0010%\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010s\"\u0004\bw\u0010uR\u001c\u0010&\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010@\"\u0004\by\u0010BR\u001c\u0010'\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010@\"\u0004\b{\u0010BR\u001c\u0010(\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010s\"\u0004\b}\u0010uR$\u0010)\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010*X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001¨\u0006¶\u0001"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "Landroid/os/Parcelable;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "hot", "", "txCount", "", "buySideCount", "sellSideCount", "tradingAddressCount", "tokenHolderCount", "marketCap", "", "fdv", "tokenLiquidity", "tokenCreationAt", "", "kcChain", "securityScore", "mintable", "adminRightsRetained", "closedSourceContract", "unlockedLiquidity", "inBlacklist", "freezableContract", "alphaOpeningAt", "favoritePersonal", "fullDisplayToken", "category", InterfaceC33826o0.f71244p, "chainIcon", "collectType", "currencyUnit", "displayToken", "externalChain", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "priceRate", "tokenBridgeId", "tokenIcon", "tradingVolume", "alphaMarks", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZZZZZZLjava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/List;)V", "getHot", "()Ljava/lang/Boolean;", "setHot", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getTxCount", "()Ljava/lang/Integer;", "setTxCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getBuySideCount", "setBuySideCount", "getSellSideCount", "setSellSideCount", "getTradingAddressCount", "setTradingAddressCount", "getTokenHolderCount", "setTokenHolderCount", "getMarketCap", "()Ljava/lang/String;", "setMarketCap", "(Ljava/lang/String;)V", "getFdv", "setFdv", "getTokenLiquidity", "setTokenLiquidity", "getTokenCreationAt", "()Ljava/lang/Long;", "setTokenCreationAt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getKcChain", "setKcChain", "getSecurityScore", "setSecurityScore", "getMintable", "()Z", "setMintable", "(Z)V", "getAdminRightsRetained", "setAdminRightsRetained", "getClosedSourceContract", "setClosedSourceContract", "getUnlockedLiquidity", "setUnlockedLiquidity", "getInBlacklist", "setInBlacklist", "getFreezableContract", "setFreezableContract", "getAlphaOpeningAt", "setAlphaOpeningAt", "getFavoritePersonal", "setFavoritePersonal", "getFullDisplayToken", "setFullDisplayToken", "getCategory", "setCategory", "getToken", "setToken", "getChainIcon", "setChainIcon", "getCollectType", "setCollectType", "getCurrencyUnit", "setCurrencyUnit", "getDisplayToken", "setDisplayToken", "getExternalChain", "setExternalChain", "getPrice", "()Ljava/math/BigDecimal;", "setPrice", "(Ljava/math/BigDecimal;)V", "getPriceRate", "setPriceRate", "getTokenBridgeId", "setTokenBridgeId", "getTokenIcon", "setTokenIcon", "getTradingVolume", "setTradingVolume", "getAlphaMarks", "()Ljava/util/List;", "setAlphaMarks", "(Ljava/util/List;)V", "getUniqueCode", "getItemType", "isCountDownType", "isShowAlphaOnDo", "getCollectTypeOrCategory", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZZZZZZLjava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/List;)Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlphaMarketEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaMarketEntity.kt\ncom/kubi/quotefacade/entity/AlphaItemEntity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1#2:128\n*E\n"})
public final /* data */ class AlphaItemEntity implements Parcelable, MultiItemEntity {

    @NotNull
    public static final Parcelable.Creator<AlphaItemEntity> CREATOR = new C21863a();
    private boolean adminRightsRetained;

    @Nullable
    private List<String> alphaMarks;

    @Nullable
    private Long alphaOpeningAt;

    @Nullable
    private Integer buySideCount;

    @Nullable
    private String category;

    @Nullable
    private String chainIcon;
    private boolean closedSourceContract;

    @Nullable
    private String collectType;

    @Nullable
    private String currencyUnit;

    @Nullable
    private String displayToken;

    @Nullable
    private String externalChain;
    private boolean favoritePersonal;

    @Nullable
    private String fdv;
    private boolean freezableContract;

    @Nullable
    private String fullDisplayToken;

    @Nullable
    private Boolean hot;
    private boolean inBlacklist;

    @Nullable
    private String kcChain;

    @Nullable
    private String marketCap;
    private boolean mintable;

    @Nullable
    private BigDecimal price;

    @Nullable
    private BigDecimal priceRate;

    @Nullable
    private String securityScore;

    @Nullable
    private Integer sellSideCount;

    @Nullable
    private String token;

    @Nullable
    private String tokenBridgeId;

    @Nullable
    private Long tokenCreationAt;

    @Nullable
    private Integer tokenHolderCount;

    @Nullable
    private String tokenIcon;

    @Nullable
    private String tokenLiquidity;

    @Nullable
    private Integer tradingAddressCount;

    @Nullable
    private BigDecimal tradingVolume;

    @Nullable
    private Integer txCount;
    private boolean unlockedLiquidity;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.AlphaItemEntity$a */
    /* JADX INFO: compiled from: AlphaMarketEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21863a implements Parcelable.Creator<AlphaItemEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AlphaItemEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Integer numValueOf;
            Long l11;
            Long lValueOf;
            Long lValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                numValueOf = null;
                l11 = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                l11 = null;
            }
            Integer num = numValueOf3;
            Integer num2 = numValueOf5;
            String string = parcel.readString();
            Integer num3 = numValueOf2;
            Integer num4 = numValueOf4;
            Integer num5 = numValueOf;
            String string2 = parcel.readString();
            Long l12 = l11;
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = l12;
                lValueOf2 = lValueOf;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                lValueOf2 = l12;
            }
            String string4 = parcel.readString();
            boolean z11 = true;
            Long l13 = lValueOf;
            String string5 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z11 = false;
            }
            boolean z13 = parcel.readInt() != 0 ? z11 : false;
            if (parcel.readInt() == 0) {
                z11 = false;
            }
            boolean z14 = parcel.readInt() != 0 ? z11 : false;
            if (parcel.readInt() == 0) {
                z11 = false;
            }
            if (parcel.readInt() != 0) {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                z11 = false;
            }
            return new AlphaItemEntity(boolValueOf, num3, num, num4, num2, num5, string, string2, string3, l13, string4, string5, z12, z11, z13, z11, z14, z11, lValueOf2, z11, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AlphaItemEntity[] newArray(int i11) {
            return new AlphaItemEntity[i11];
        }
    }

    public AlphaItemEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlphaItemEntity copy$default(AlphaItemEntity alphaItemEntity, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, Long l11, String str4, String str5, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Long l12, boolean z17, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str14, String str15, BigDecimal bigDecimal3, List list, int i11, int i12, Object obj) {
        List list2;
        BigDecimal bigDecimal4;
        Boolean bool2 = (i11 & 1) != 0 ? alphaItemEntity.hot : bool;
        Integer num6 = (i11 & 2) != 0 ? alphaItemEntity.txCount : num;
        Integer num7 = (i11 & 4) != 0 ? alphaItemEntity.buySideCount : num2;
        Integer num8 = (i11 & 8) != 0 ? alphaItemEntity.sellSideCount : num3;
        Integer num9 = (i11 & 16) != 0 ? alphaItemEntity.tradingAddressCount : num4;
        Integer num10 = (i11 & 32) != 0 ? alphaItemEntity.tokenHolderCount : num5;
        String str16 = (i11 & 64) != 0 ? alphaItemEntity.marketCap : str;
        String str17 = (i11 & 128) != 0 ? alphaItemEntity.fdv : str2;
        String str18 = (i11 & 256) != 0 ? alphaItemEntity.tokenLiquidity : str3;
        Long l13 = (i11 & 512) != 0 ? alphaItemEntity.tokenCreationAt : l11;
        String str19 = (i11 & 1024) != 0 ? alphaItemEntity.kcChain : str4;
        String str20 = (i11 & 2048) != 0 ? alphaItemEntity.securityScore : str5;
        boolean z18 = (i11 & 4096) != 0 ? alphaItemEntity.mintable : z11;
        boolean z19 = (i11 & 8192) != 0 ? alphaItemEntity.adminRightsRetained : z12;
        Boolean bool3 = bool2;
        boolean z21 = (i11 & 16384) != 0 ? alphaItemEntity.closedSourceContract : z13;
        boolean z22 = (i11 & 32768) != 0 ? alphaItemEntity.unlockedLiquidity : z14;
        boolean z23 = (i11 & 65536) != 0 ? alphaItemEntity.inBlacklist : z15;
        boolean z24 = (i11 & 131072) != 0 ? alphaItemEntity.freezableContract : z16;
        Long l14 = (i11 & 262144) != 0 ? alphaItemEntity.alphaOpeningAt : l12;
        boolean z25 = (i11 & 524288) != 0 ? alphaItemEntity.favoritePersonal : z17;
        String str21 = (i11 & 1048576) != 0 ? alphaItemEntity.fullDisplayToken : str6;
        String str22 = (i11 & 2097152) != 0 ? alphaItemEntity.category : str7;
        String str23 = (i11 & 4194304) != 0 ? alphaItemEntity.token : str8;
        String str24 = (i11 & 8388608) != 0 ? alphaItemEntity.chainIcon : str9;
        String str25 = (i11 & 16777216) != 0 ? alphaItemEntity.collectType : str10;
        String str26 = (i11 & 33554432) != 0 ? alphaItemEntity.currencyUnit : str11;
        String str27 = (i11 & 67108864) != 0 ? alphaItemEntity.displayToken : str12;
        String str28 = (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? alphaItemEntity.externalChain : str13;
        BigDecimal bigDecimal5 = (i11 & 268435456) != 0 ? alphaItemEntity.price : bigDecimal;
        BigDecimal bigDecimal6 = (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? alphaItemEntity.priceRate : bigDecimal2;
        String str29 = (i11 & 1073741824) != 0 ? alphaItemEntity.tokenBridgeId : str14;
        String str30 = (i11 & Integer.MIN_VALUE) != 0 ? alphaItemEntity.tokenIcon : str15;
        BigDecimal bigDecimal7 = (i12 & 1) != 0 ? alphaItemEntity.tradingVolume : bigDecimal3;
        if ((i12 & 2) != 0) {
            bigDecimal4 = bigDecimal7;
            list2 = alphaItemEntity.alphaMarks;
        } else {
            list2 = list;
            bigDecimal4 = bigDecimal7;
        }
        return alphaItemEntity.copy(bool3, num6, num7, num8, num9, num10, str16, str17, str18, l13, str19, str20, z18, z19, z21, z22, z23, z24, l14, z25, str21, str22, str23, str24, str25, str26, str27, str28, bigDecimal5, bigDecimal6, str29, str30, bigDecimal4, list2);
    }

    @NotNull
    public final AlphaItemEntity copy(@Nullable Boolean hot, @Nullable Integer txCount, @Nullable Integer buySideCount, @Nullable Integer sellSideCount, @Nullable Integer tradingAddressCount, @Nullable Integer tokenHolderCount, @Nullable String marketCap, @Nullable String fdv, @Nullable String tokenLiquidity, @Nullable Long tokenCreationAt, @Nullable String kcChain, @Nullable String securityScore, boolean mintable, boolean adminRightsRetained, boolean closedSourceContract, boolean unlockedLiquidity, boolean inBlacklist, boolean freezableContract, @Nullable Long alphaOpeningAt, boolean favoritePersonal, @Nullable String fullDisplayToken, @Nullable String category, @Nullable String token, @Nullable String chainIcon, @Nullable String collectType, @Nullable String currencyUnit, @Nullable String displayToken, @Nullable String externalChain, @Nullable BigDecimal price, @Nullable BigDecimal priceRate, @Nullable String tokenBridgeId, @Nullable String tokenIcon, @Nullable BigDecimal tradingVolume, @Nullable List<String> alphaMarks) {
        return new AlphaItemEntity(hot, txCount, buySideCount, sellSideCount, tradingAddressCount, tokenHolderCount, marketCap, fdv, tokenLiquidity, tokenCreationAt, kcChain, securityScore, mintable, adminRightsRetained, closedSourceContract, unlockedLiquidity, inBlacklist, freezableContract, alphaOpeningAt, favoritePersonal, fullDisplayToken, category, token, chainIcon, collectType, currencyUnit, displayToken, externalChain, price, priceRate, tokenBridgeId, tokenIcon, tradingVolume, alphaMarks);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlphaItemEntity)) {
            return false;
        }
        AlphaItemEntity alphaItemEntity = (AlphaItemEntity) other;
        return Intrinsics.areEqual(this.hot, alphaItemEntity.hot) && Intrinsics.areEqual(this.txCount, alphaItemEntity.txCount) && Intrinsics.areEqual(this.buySideCount, alphaItemEntity.buySideCount) && Intrinsics.areEqual(this.sellSideCount, alphaItemEntity.sellSideCount) && Intrinsics.areEqual(this.tradingAddressCount, alphaItemEntity.tradingAddressCount) && Intrinsics.areEqual(this.tokenHolderCount, alphaItemEntity.tokenHolderCount) && Intrinsics.areEqual(this.marketCap, alphaItemEntity.marketCap) && Intrinsics.areEqual(this.fdv, alphaItemEntity.fdv) && Intrinsics.areEqual(this.tokenLiquidity, alphaItemEntity.tokenLiquidity) && Intrinsics.areEqual(this.tokenCreationAt, alphaItemEntity.tokenCreationAt) && Intrinsics.areEqual(this.kcChain, alphaItemEntity.kcChain) && Intrinsics.areEqual(this.securityScore, alphaItemEntity.securityScore) && this.mintable == alphaItemEntity.mintable && this.adminRightsRetained == alphaItemEntity.adminRightsRetained && this.closedSourceContract == alphaItemEntity.closedSourceContract && this.unlockedLiquidity == alphaItemEntity.unlockedLiquidity && this.inBlacklist == alphaItemEntity.inBlacklist && this.freezableContract == alphaItemEntity.freezableContract && Intrinsics.areEqual(this.alphaOpeningAt, alphaItemEntity.alphaOpeningAt) && this.favoritePersonal == alphaItemEntity.favoritePersonal && Intrinsics.areEqual(this.fullDisplayToken, alphaItemEntity.fullDisplayToken) && Intrinsics.areEqual(this.category, alphaItemEntity.category) && Intrinsics.areEqual(this.token, alphaItemEntity.token) && Intrinsics.areEqual(this.chainIcon, alphaItemEntity.chainIcon) && Intrinsics.areEqual(this.collectType, alphaItemEntity.collectType) && Intrinsics.areEqual(this.currencyUnit, alphaItemEntity.currencyUnit) && Intrinsics.areEqual(this.displayToken, alphaItemEntity.displayToken) && Intrinsics.areEqual(this.externalChain, alphaItemEntity.externalChain) && Intrinsics.areEqual(this.price, alphaItemEntity.price) && Intrinsics.areEqual(this.priceRate, alphaItemEntity.priceRate) && Intrinsics.areEqual(this.tokenBridgeId, alphaItemEntity.tokenBridgeId) && Intrinsics.areEqual(this.tokenIcon, alphaItemEntity.tokenIcon) && Intrinsics.areEqual(this.tradingVolume, alphaItemEntity.tradingVolume) && Intrinsics.areEqual(this.alphaMarks, alphaItemEntity.alphaMarks);
    }

    public AlphaItemEntity(@Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l11, @Nullable String str4, @Nullable String str5, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, @Nullable Long l12, boolean z17, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str14, @Nullable String str15, @Nullable BigDecimal bigDecimal3, @Nullable List<String> list) {
        this.hot = bool;
        this.txCount = num;
        this.buySideCount = num2;
        this.sellSideCount = num3;
        this.tradingAddressCount = num4;
        this.tokenHolderCount = num5;
        this.marketCap = str;
        this.fdv = str2;
        this.tokenLiquidity = str3;
        this.tokenCreationAt = l11;
        this.kcChain = str4;
        this.securityScore = str5;
        this.mintable = z11;
        this.adminRightsRetained = z12;
        this.closedSourceContract = z13;
        this.unlockedLiquidity = z14;
        this.inBlacklist = z15;
        this.freezableContract = z16;
        this.alphaOpeningAt = l12;
        this.favoritePersonal = z17;
        this.fullDisplayToken = str6;
        this.category = str7;
        this.token = str8;
        this.chainIcon = str9;
        this.collectType = str10;
        this.currencyUnit = str11;
        this.displayToken = str12;
        this.externalChain = str13;
        this.price = bigDecimal;
        this.priceRate = bigDecimal2;
        this.tokenBridgeId = str14;
        this.tokenIcon = str15;
        this.tradingVolume = bigDecimal3;
        this.alphaMarks = list;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getHot() {
        return this.hot;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getTokenCreationAt() {
        return this.tokenCreationAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getKcChain() {
        return this.kcChain;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSecurityScore() {
        return this.securityScore;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getMintable() {
        return this.mintable;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getAdminRightsRetained() {
        return this.adminRightsRetained;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getClosedSourceContract() {
        return this.closedSourceContract;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getUnlockedLiquidity() {
        return this.unlockedLiquidity;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getInBlacklist() {
        return this.inBlacklist;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getFreezableContract() {
        return this.freezableContract;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Long getAlphaOpeningAt() {
        return this.alphaOpeningAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getTxCount() {
        return this.txCount;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getFavoritePersonal() {
        return this.favoritePersonal;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getFullDisplayToken() {
        return this.fullDisplayToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getChainIcon() {
        return this.chainIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getCollectType() {
        return this.collectType;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getCurrencyUnit() {
        return this.currencyUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getDisplayToken() {
        return this.displayToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getExternalChain() {
        return this.externalChain;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getBuySideCount() {
        return this.buySideCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final BigDecimal getPriceRate() {
        return this.priceRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getTokenBridgeId() {
        return this.tokenBridgeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getTokenIcon() {
        return this.tokenIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final BigDecimal getTradingVolume() {
        return this.tradingVolume;
    }

    @Nullable
    public final List<String> component34() {
        return this.alphaMarks;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getSellSideCount() {
        return this.sellSideCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getTradingAddressCount() {
        return this.tradingAddressCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getTokenHolderCount() {
        return this.tokenHolderCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMarketCap() {
        return this.marketCap;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFdv() {
        return this.fdv;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTokenLiquidity() {
        return this.tokenLiquidity;
    }

    public final boolean getAdminRightsRetained() {
        return this.adminRightsRetained;
    }

    @Nullable
    public final List<String> getAlphaMarks() {
        return this.alphaMarks;
    }

    @Nullable
    public final Long getAlphaOpeningAt() {
        return this.alphaOpeningAt;
    }

    @Nullable
    public final Integer getBuySideCount() {
        return this.buySideCount;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final String getChainIcon() {
        return this.chainIcon;
    }

    public final boolean getClosedSourceContract() {
        return this.closedSourceContract;
    }

    @Nullable
    public final String getCollectType() {
        return this.collectType;
    }

    @Nullable
    public final String getCollectTypeOrCategory() {
        String str = this.collectType;
        if (str == null || StringsKt.isBlank(str)) {
            str = null;
        }
        if (str == null) {
            str = this.category;
        }
        if (str == null) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Nullable
    public final String getCurrencyUnit() {
        return this.currencyUnit;
    }

    @Nullable
    public final String getDisplayToken() {
        return this.displayToken;
    }

    @Nullable
    public final String getExternalChain() {
        return this.externalChain;
    }

    public final boolean getFavoritePersonal() {
        return this.favoritePersonal;
    }

    @Nullable
    public final String getFdv() {
        return this.fdv;
    }

    public final boolean getFreezableContract() {
        return this.freezableContract;
    }

    @Nullable
    public final String getFullDisplayToken() {
        return this.fullDisplayToken;
    }

    @Nullable
    public final Boolean getHot() {
        return this.hot;
    }

    public final boolean getInBlacklist() {
        return this.inBlacklist;
    }

    @Nullable
    public final String getKcChain() {
        return this.kcChain;
    }

    @Nullable
    public final String getMarketCap() {
        return this.marketCap;
    }

    public final boolean getMintable() {
        return this.mintable;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final BigDecimal getPriceRate() {
        return this.priceRate;
    }

    @Nullable
    public final String getSecurityScore() {
        return this.securityScore;
    }

    @Nullable
    public final Integer getSellSideCount() {
        return this.sellSideCount;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final String getTokenBridgeId() {
        return this.tokenBridgeId;
    }

    @Nullable
    public final Long getTokenCreationAt() {
        return this.tokenCreationAt;
    }

    @Nullable
    public final Integer getTokenHolderCount() {
        return this.tokenHolderCount;
    }

    @Nullable
    public final String getTokenIcon() {
        return this.tokenIcon;
    }

    @Nullable
    public final String getTokenLiquidity() {
        return this.tokenLiquidity;
    }

    @Nullable
    public final Integer getTradingAddressCount() {
        return this.tradingAddressCount;
    }

    @Nullable
    public final BigDecimal getTradingVolume() {
        return this.tradingVolume;
    }

    @Nullable
    public final Integer getTxCount() {
        return this.txCount;
    }

    @NotNull
    public final String getUniqueCode() {
        return this.token + '-' + this.externalChain;
    }

    public final boolean getUnlockedLiquidity() {
        return this.unlockedLiquidity;
    }

    public int hashCode() {
        Boolean bool = this.hot;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.txCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.buySideCount;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.sellSideCount;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.tradingAddressCount;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.tokenHolderCount;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str = this.marketCap;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fdv;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tokenLiquidity;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.tokenCreationAt;
        int iHashCode10 = (iHashCode9 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str4 = this.kcChain;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.securityScore;
        int iHashCode12 = (((((((((((((iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31) + Boolean.hashCode(this.mintable)) * 31) + Boolean.hashCode(this.adminRightsRetained)) * 31) + Boolean.hashCode(this.closedSourceContract)) * 31) + Boolean.hashCode(this.unlockedLiquidity)) * 31) + Boolean.hashCode(this.inBlacklist)) * 31) + Boolean.hashCode(this.freezableContract)) * 31;
        Long l12 = this.alphaOpeningAt;
        int iHashCode13 = (((iHashCode12 + (l12 == null ? 0 : l12.hashCode())) * 31) + Boolean.hashCode(this.favoritePersonal)) * 31;
        String str6 = this.fullDisplayToken;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.category;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.token;
        int iHashCode16 = (iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.chainIcon;
        int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.collectType;
        int iHashCode18 = (iHashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.currencyUnit;
        int iHashCode19 = (iHashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.displayToken;
        int iHashCode20 = (iHashCode19 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.externalChain;
        int iHashCode21 = (iHashCode20 + (str13 == null ? 0 : str13.hashCode())) * 31;
        BigDecimal bigDecimal = this.price;
        int iHashCode22 = (iHashCode21 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.priceRate;
        int iHashCode23 = (iHashCode22 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str14 = this.tokenBridgeId;
        int iHashCode24 = (iHashCode23 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.tokenIcon;
        int iHashCode25 = (iHashCode24 + (str15 == null ? 0 : str15.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.tradingVolume;
        int iHashCode26 = (iHashCode25 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        List<String> list = this.alphaMarks;
        return iHashCode26 + (list != null ? list.hashCode() : 0);
    }

    public final boolean isCountDownType() {
        Long l11 = this.alphaOpeningAt;
        return (l11 != null ? l11.longValue() : 0L) > TimeSyncManager.f48123a.m58365o();
    }

    public final boolean isShowAlphaOnDo() {
        List<String> list = this.alphaMarks;
        return list != null && list.contains("Ondo");
    }

    public final void setAdminRightsRetained(boolean z11) {
        this.adminRightsRetained = z11;
    }

    public final void setAlphaMarks(@Nullable List<String> list) {
        this.alphaMarks = list;
    }

    public final void setAlphaOpeningAt(@Nullable Long l11) {
        this.alphaOpeningAt = l11;
    }

    public final void setBuySideCount(@Nullable Integer num) {
        this.buySideCount = num;
    }

    public final void setCategory(@Nullable String str) {
        this.category = str;
    }

    public final void setChainIcon(@Nullable String str) {
        this.chainIcon = str;
    }

    public final void setClosedSourceContract(boolean z11) {
        this.closedSourceContract = z11;
    }

    public final void setCollectType(@Nullable String str) {
        this.collectType = str;
    }

    public final void setCurrencyUnit(@Nullable String str) {
        this.currencyUnit = str;
    }

    public final void setDisplayToken(@Nullable String str) {
        this.displayToken = str;
    }

    public final void setExternalChain(@Nullable String str) {
        this.externalChain = str;
    }

    public final void setFavoritePersonal(boolean z11) {
        this.favoritePersonal = z11;
    }

    public final void setFdv(@Nullable String str) {
        this.fdv = str;
    }

    public final void setFreezableContract(boolean z11) {
        this.freezableContract = z11;
    }

    public final void setFullDisplayToken(@Nullable String str) {
        this.fullDisplayToken = str;
    }

    public final void setHot(@Nullable Boolean bool) {
        this.hot = bool;
    }

    public final void setInBlacklist(boolean z11) {
        this.inBlacklist = z11;
    }

    public final void setKcChain(@Nullable String str) {
        this.kcChain = str;
    }

    public final void setMarketCap(@Nullable String str) {
        this.marketCap = str;
    }

    public final void setMintable(boolean z11) {
        this.mintable = z11;
    }

    public final void setPrice(@Nullable BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }

    public final void setPriceRate(@Nullable BigDecimal bigDecimal) {
        this.priceRate = bigDecimal;
    }

    public final void setSecurityScore(@Nullable String str) {
        this.securityScore = str;
    }

    public final void setSellSideCount(@Nullable Integer num) {
        this.sellSideCount = num;
    }

    public final void setToken(@Nullable String str) {
        this.token = str;
    }

    public final void setTokenBridgeId(@Nullable String str) {
        this.tokenBridgeId = str;
    }

    public final void setTokenCreationAt(@Nullable Long l11) {
        this.tokenCreationAt = l11;
    }

    public final void setTokenHolderCount(@Nullable Integer num) {
        this.tokenHolderCount = num;
    }

    public final void setTokenIcon(@Nullable String str) {
        this.tokenIcon = str;
    }

    public final void setTokenLiquidity(@Nullable String str) {
        this.tokenLiquidity = str;
    }

    public final void setTradingAddressCount(@Nullable Integer num) {
        this.tradingAddressCount = num;
    }

    public final void setTradingVolume(@Nullable BigDecimal bigDecimal) {
        this.tradingVolume = bigDecimal;
    }

    public final void setTxCount(@Nullable Integer num) {
        this.txCount = num;
    }

    public final void setUnlockedLiquidity(boolean z11) {
        this.unlockedLiquidity = z11;
    }

    @NotNull
    public String toString() {
        return "AlphaItemEntity(hot=" + this.hot + ", txCount=" + this.txCount + ", buySideCount=" + this.buySideCount + ", sellSideCount=" + this.sellSideCount + ", tradingAddressCount=" + this.tradingAddressCount + ", tokenHolderCount=" + this.tokenHolderCount + ", marketCap=" + this.marketCap + ", fdv=" + this.fdv + ", tokenLiquidity=" + this.tokenLiquidity + ", tokenCreationAt=" + this.tokenCreationAt + ", kcChain=" + this.kcChain + ", securityScore=" + this.securityScore + ", mintable=" + this.mintable + ", adminRightsRetained=" + this.adminRightsRetained + ", closedSourceContract=" + this.closedSourceContract + ", unlockedLiquidity=" + this.unlockedLiquidity + ", inBlacklist=" + this.inBlacklist + ", freezableContract=" + this.freezableContract + ", alphaOpeningAt=" + this.alphaOpeningAt + ", favoritePersonal=" + this.favoritePersonal + ", fullDisplayToken=" + this.fullDisplayToken + ", category=" + this.category + ", token=" + this.token + ", chainIcon=" + this.chainIcon + ", collectType=" + this.collectType + ", currencyUnit=" + this.currencyUnit + ", displayToken=" + this.displayToken + ", externalChain=" + this.externalChain + ", price=" + this.price + ", priceRate=" + this.priceRate + ", tokenBridgeId=" + this.tokenBridgeId + ", tokenIcon=" + this.tokenIcon + ", tradingVolume=" + this.tradingVolume + ", alphaMarks=" + this.alphaMarks + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.hot;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.txCount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.buySideCount;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.sellSideCount;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        Integer num4 = this.tradingAddressCount;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
        Integer num5 = this.tokenHolderCount;
        if (num5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num5.intValue());
        }
        dest.writeString(this.marketCap);
        dest.writeString(this.fdv);
        dest.writeString(this.tokenLiquidity);
        Long l11 = this.tokenCreationAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.kcChain);
        dest.writeString(this.securityScore);
        dest.writeInt(this.mintable ? 1 : 0);
        dest.writeInt(this.adminRightsRetained ? 1 : 0);
        dest.writeInt(this.closedSourceContract ? 1 : 0);
        dest.writeInt(this.unlockedLiquidity ? 1 : 0);
        dest.writeInt(this.inBlacklist ? 1 : 0);
        dest.writeInt(this.freezableContract ? 1 : 0);
        Long l12 = this.alphaOpeningAt;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeInt(this.favoritePersonal ? 1 : 0);
        dest.writeString(this.fullDisplayToken);
        dest.writeString(this.category);
        dest.writeString(this.token);
        dest.writeString(this.chainIcon);
        dest.writeString(this.collectType);
        dest.writeString(this.currencyUnit);
        dest.writeString(this.displayToken);
        dest.writeString(this.externalChain);
        dest.writeSerializable(this.price);
        dest.writeSerializable(this.priceRate);
        dest.writeString(this.tokenBridgeId);
        dest.writeString(this.tokenIcon);
        dest.writeSerializable(this.tradingVolume);
        dest.writeStringList(this.alphaMarks);
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF42794b() {
        if (isCountDownType()) {
            return 1;
        }
        return 2;
    }

    public /* synthetic */ AlphaItemEntity(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, Long l11, String str4, String str5, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Long l12, boolean z17, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str14, String str15, BigDecimal bigDecimal3, List list, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Boolean.FALSE : bool, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : num2, (i11 & 8) != 0 ? null : num3, (i11 & 16) != 0 ? null : num4, (i11 & 32) != 0 ? null : num5, (i11 & 64) != 0 ? null : str, (i11 & 128) != 0 ? null : str2, (i11 & 256) != 0 ? null : str3, (i11 & 512) != 0 ? null : l11, (i11 & 1024) != 0 ? null : str4, (i11 & 2048) != 0 ? null : str5, (i11 & 4096) != 0 ? true : z11, (i11 & 8192) != 0 ? true : z12, (i11 & 16384) != 0 ? true : z13, (i11 & 32768) != 0 ? true : z14, (i11 & 65536) != 0 ? true : z15, (i11 & 131072) != 0 ? true : z16, (i11 & 262144) != 0 ? 0L : l12, (i11 & 524288) != 0 ? false : z17, (i11 & 1048576) != 0 ? null : str6, (i11 & 2097152) != 0 ? null : str7, (i11 & 4194304) != 0 ? null : str8, (i11 & 8388608) != 0 ? null : str9, (i11 & 16777216) != 0 ? null : str10, (i11 & 33554432) != 0 ? null : str11, (i11 & 67108864) != 0 ? null : str12, (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : str13, (i11 & 268435456) != 0 ? null : bigDecimal, (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : bigDecimal2, (i11 & 1073741824) != 0 ? null : str14, (i11 & Integer.MIN_VALUE) != 0 ? null : str15, (i12 & 1) != 0 ? null : bigDecimal3, (i12 & 2) != 0 ? null : list);
    }
}
