package com.kubi.assets.entity;

import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AlphaTopTokenInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bs\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b-\u0010.J\u0010\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00100J\u000b\u0010^\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00100J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010h\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010>J\u0010\u0010i\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010AJ\u000b\u0010j\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0010\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00100J\u000b\u0010n\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00100J\u0010\u0010r\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010>J\u0010\u0010s\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010>J\u0010\u0010t\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010>J\u0010\u0010u\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010>J\u0010\u0010v\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010>J\u0010\u0010w\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010>J\u000b\u0010x\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0010\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00100J\u0010\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00100J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00100J\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00100J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010AJ\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010>JØ\u0003\u0010\u0083\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0003\u0010\u0084\u0001J\u0015\u0010\u0085\u0001\u001a\u00020\u00102\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0012HÖ\u0001J\n\u0010\u0088\u0001\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00101\u001a\u0004\b7\u00100R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u00103R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u00103R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u00103R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u00103R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u00103R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010?\u001a\u0004\b=\u0010>R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010B\u001a\u0004\b@\u0010AR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u00103R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bD\u00103R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00101\u001a\u0004\bG\u00100R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bH\u00103R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u00103R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bJ\u00103R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00101\u001a\u0004\bK\u00100R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010?\u001a\u0004\bL\u0010>R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010?\u001a\u0004\bM\u0010>R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010?\u001a\u0004\bN\u0010>R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010?\u001a\u0004\bO\u0010>R\u0015\u0010 \u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010?\u001a\u0004\bP\u0010>R\u0015\u0010!\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010?\u001a\u0004\bQ\u0010>R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bR\u00103R\u0013\u0010#\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bS\u00103R\u0013\u0010$\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bT\u00103R\u0013\u0010%\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bU\u00103R\u0013\u0010&\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\bV\u0010FR\u0015\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00101\u001a\u0004\bW\u00100R\u0015\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00101\u001a\u0004\bX\u00100R\u0015\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00101\u001a\u0004\bY\u00100R\u0015\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00101\u001a\u0004\bZ\u00100R\u0015\u0010+\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010B\u001a\u0004\b[\u0010AR\u0015\u0010,\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010?\u001a\u0004\b\\\u0010>¨\u0006\u0089\u0001"}, m90084d2 = {"Lcom/kubi/assets/entity/AlphaTopTokenInfo;", "", "tokenBridgeId", "", InterfaceC33826o0.f71244p, "", "kcChain", "externalChain", "category", "alphaOpeningAt", "currencyUnit", "tokenIcon", "chainIcon", "displayToken", "fullDisplayToken", "hot", "", "recommendScale", "", "last24HourHighestPrice", "last24HourLowestPrice", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "tokenHolderCount", "marketCap", "tokenLiquidity", "fdv", "tokenCreationAt", "mintable", "unlockedLiquidity", "adminRightsRetained", "closedSourceContract", "inBlacklist", "freezableContract", "securityScore", "tokenAppendixInformation", "tokenIntroduction", "tradingVolume", "priceRate", "txCount", "buySideCount", "sellSideCount", "tradingAddressCount", "delaySeconds", "favoritePersonal", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getTokenBridgeId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getToken", "()Ljava/lang/String;", "getKcChain", "getExternalChain", "getCategory", "getAlphaOpeningAt", "getCurrencyUnit", "getTokenIcon", "getChainIcon", "getDisplayToken", "getFullDisplayToken", "getHot", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRecommendScale", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLast24HourHighestPrice", "getLast24HourLowestPrice", "getPrice", "()Ljava/math/BigDecimal;", "getTokenHolderCount", "getMarketCap", "getTokenLiquidity", "getFdv", "getTokenCreationAt", "getMintable", "getUnlockedLiquidity", "getAdminRightsRetained", "getClosedSourceContract", "getInBlacklist", "getFreezableContract", "getSecurityScore", "getTokenAppendixInformation", "getTokenIntroduction", "getTradingVolume", "getPriceRate", "getTxCount", "getBuySideCount", "getSellSideCount", "getTradingAddressCount", "getDelaySeconds", "getFavoritePersonal", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/kubi/assets/entity/AlphaTopTokenInfo;", "equals", "other", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AlphaTopTokenInfo {

    @Nullable
    private final Boolean adminRightsRetained;

    @Nullable
    private final Long alphaOpeningAt;

    @Nullable
    private final Long buySideCount;

    @Nullable
    private final String category;

    @Nullable
    private final String chainIcon;

    @Nullable
    private final Boolean closedSourceContract;

    @Nullable
    private final String currencyUnit;

    @Nullable
    private final Integer delaySeconds;

    @Nullable
    private final String displayToken;

    @Nullable
    private final String externalChain;

    @Nullable
    private final Boolean favoritePersonal;

    @Nullable
    private final String fdv;

    @Nullable
    private final Boolean freezableContract;

    @Nullable
    private final String fullDisplayToken;

    @Nullable
    private final Boolean hot;

    @Nullable
    private final Boolean inBlacklist;

    @Nullable
    private final String kcChain;

    @Nullable
    private final String last24HourHighestPrice;

    @Nullable
    private final String last24HourLowestPrice;

    @Nullable
    private final String marketCap;

    @Nullable
    private final Boolean mintable;

    @Nullable
    private final BigDecimal price;

    @Nullable
    private final BigDecimal priceRate;

    @Nullable
    private final Integer recommendScale;

    @Nullable
    private final String securityScore;

    @Nullable
    private final Long sellSideCount;

    @Nullable
    private final String token;

    @Nullable
    private final String tokenAppendixInformation;

    @Nullable
    private final Long tokenBridgeId;

    @Nullable
    private final Long tokenCreationAt;

    @Nullable
    private final Long tokenHolderCount;

    @Nullable
    private final String tokenIcon;

    @Nullable
    private final String tokenIntroduction;

    @Nullable
    private final String tokenLiquidity;

    @Nullable
    private final Long tradingAddressCount;

    @Nullable
    private final String tradingVolume;

    @Nullable
    private final Long txCount;

    @Nullable
    private final Boolean unlockedLiquidity;

    public AlphaTopTokenInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 63, null);
    }

    public static /* synthetic */ AlphaTopTokenInfo copy$default(AlphaTopTokenInfo alphaTopTokenInfo, Long l11, String str, String str2, String str3, String str4, Long l12, String str5, String str6, String str7, String str8, String str9, Boolean bool, Integer num, String str10, String str11, BigDecimal bigDecimal, Long l13, String str12, String str13, String str14, Long l14, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str15, String str16, String str17, String str18, BigDecimal bigDecimal2, Long l15, Long l16, Long l17, Long l18, Integer num2, Boolean bool8, int i11, int i12, Object obj) {
        Boolean bool9;
        Integer num3;
        Long l19 = (i11 & 1) != 0 ? alphaTopTokenInfo.tokenBridgeId : l11;
        String str19 = (i11 & 2) != 0 ? alphaTopTokenInfo.token : str;
        String str20 = (i11 & 4) != 0 ? alphaTopTokenInfo.kcChain : str2;
        String str21 = (i11 & 8) != 0 ? alphaTopTokenInfo.externalChain : str3;
        String str22 = (i11 & 16) != 0 ? alphaTopTokenInfo.category : str4;
        Long l21 = (i11 & 32) != 0 ? alphaTopTokenInfo.alphaOpeningAt : l12;
        String str23 = (i11 & 64) != 0 ? alphaTopTokenInfo.currencyUnit : str5;
        String str24 = (i11 & 128) != 0 ? alphaTopTokenInfo.tokenIcon : str6;
        String str25 = (i11 & 256) != 0 ? alphaTopTokenInfo.chainIcon : str7;
        String str26 = (i11 & 512) != 0 ? alphaTopTokenInfo.displayToken : str8;
        String str27 = (i11 & 1024) != 0 ? alphaTopTokenInfo.fullDisplayToken : str9;
        Boolean bool10 = (i11 & 2048) != 0 ? alphaTopTokenInfo.hot : bool;
        Integer num4 = (i11 & 4096) != 0 ? alphaTopTokenInfo.recommendScale : num;
        String str28 = (i11 & 8192) != 0 ? alphaTopTokenInfo.last24HourHighestPrice : str10;
        Long l22 = l19;
        String str29 = (i11 & 16384) != 0 ? alphaTopTokenInfo.last24HourLowestPrice : str11;
        BigDecimal bigDecimal3 = (i11 & 32768) != 0 ? alphaTopTokenInfo.price : bigDecimal;
        Long l23 = (i11 & 65536) != 0 ? alphaTopTokenInfo.tokenHolderCount : l13;
        String str30 = (i11 & 131072) != 0 ? alphaTopTokenInfo.marketCap : str12;
        String str31 = (i11 & 262144) != 0 ? alphaTopTokenInfo.tokenLiquidity : str13;
        String str32 = (i11 & 524288) != 0 ? alphaTopTokenInfo.fdv : str14;
        Long l24 = (i11 & 1048576) != 0 ? alphaTopTokenInfo.tokenCreationAt : l14;
        Boolean bool11 = (i11 & 2097152) != 0 ? alphaTopTokenInfo.mintable : bool2;
        Boolean bool12 = (i11 & 4194304) != 0 ? alphaTopTokenInfo.unlockedLiquidity : bool3;
        Boolean bool13 = (i11 & 8388608) != 0 ? alphaTopTokenInfo.adminRightsRetained : bool4;
        Boolean bool14 = (i11 & 16777216) != 0 ? alphaTopTokenInfo.closedSourceContract : bool5;
        Boolean bool15 = (i11 & 33554432) != 0 ? alphaTopTokenInfo.inBlacklist : bool6;
        Boolean bool16 = (i11 & 67108864) != 0 ? alphaTopTokenInfo.freezableContract : bool7;
        String str33 = (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? alphaTopTokenInfo.securityScore : str15;
        String str34 = (i11 & 268435456) != 0 ? alphaTopTokenInfo.tokenAppendixInformation : str16;
        String str35 = (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? alphaTopTokenInfo.tokenIntroduction : str17;
        String str36 = (i11 & 1073741824) != 0 ? alphaTopTokenInfo.tradingVolume : str18;
        BigDecimal bigDecimal4 = (i11 & Integer.MIN_VALUE) != 0 ? alphaTopTokenInfo.priceRate : bigDecimal2;
        Long l25 = (i12 & 1) != 0 ? alphaTopTokenInfo.txCount : l15;
        Long l26 = (i12 & 2) != 0 ? alphaTopTokenInfo.buySideCount : l16;
        Long l27 = (i12 & 4) != 0 ? alphaTopTokenInfo.sellSideCount : l17;
        Long l28 = (i12 & 8) != 0 ? alphaTopTokenInfo.tradingAddressCount : l18;
        Integer num5 = (i12 & 16) != 0 ? alphaTopTokenInfo.delaySeconds : num2;
        if ((i12 & 32) != 0) {
            num3 = num5;
            bool9 = alphaTopTokenInfo.favoritePersonal;
        } else {
            bool9 = bool8;
            num3 = num5;
        }
        return alphaTopTokenInfo.copy(l22, str19, str20, str21, str22, l21, str23, str24, str25, str26, str27, bool10, num4, str28, str29, bigDecimal3, l23, str30, str31, str32, l24, bool11, bool12, bool13, bool14, bool15, bool16, str33, str34, str35, str36, bigDecimal4, l25, l26, l27, l28, num3, bool9);
    }

    @NotNull
    public final AlphaTopTokenInfo copy(@Nullable Long tokenBridgeId, @Nullable String token, @Nullable String kcChain, @Nullable String externalChain, @Nullable String category, @Nullable Long alphaOpeningAt, @Nullable String currencyUnit, @Nullable String tokenIcon, @Nullable String chainIcon, @Nullable String displayToken, @Nullable String fullDisplayToken, @Nullable Boolean hot, @Nullable Integer recommendScale, @Nullable String last24HourHighestPrice, @Nullable String last24HourLowestPrice, @Nullable BigDecimal price, @Nullable Long tokenHolderCount, @Nullable String marketCap, @Nullable String tokenLiquidity, @Nullable String fdv, @Nullable Long tokenCreationAt, @Nullable Boolean mintable, @Nullable Boolean unlockedLiquidity, @Nullable Boolean adminRightsRetained, @Nullable Boolean closedSourceContract, @Nullable Boolean inBlacklist, @Nullable Boolean freezableContract, @Nullable String securityScore, @Nullable String tokenAppendixInformation, @Nullable String tokenIntroduction, @Nullable String tradingVolume, @Nullable BigDecimal priceRate, @Nullable Long txCount, @Nullable Long buySideCount, @Nullable Long sellSideCount, @Nullable Long tradingAddressCount, @Nullable Integer delaySeconds, @Nullable Boolean favoritePersonal) {
        return new AlphaTopTokenInfo(tokenBridgeId, token, kcChain, externalChain, category, alphaOpeningAt, currencyUnit, tokenIcon, chainIcon, displayToken, fullDisplayToken, hot, recommendScale, last24HourHighestPrice, last24HourLowestPrice, price, tokenHolderCount, marketCap, tokenLiquidity, fdv, tokenCreationAt, mintable, unlockedLiquidity, adminRightsRetained, closedSourceContract, inBlacklist, freezableContract, securityScore, tokenAppendixInformation, tokenIntroduction, tradingVolume, priceRate, txCount, buySideCount, sellSideCount, tradingAddressCount, delaySeconds, favoritePersonal);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlphaTopTokenInfo)) {
            return false;
        }
        AlphaTopTokenInfo alphaTopTokenInfo = (AlphaTopTokenInfo) other;
        return Intrinsics.areEqual(this.tokenBridgeId, alphaTopTokenInfo.tokenBridgeId) && Intrinsics.areEqual(this.token, alphaTopTokenInfo.token) && Intrinsics.areEqual(this.kcChain, alphaTopTokenInfo.kcChain) && Intrinsics.areEqual(this.externalChain, alphaTopTokenInfo.externalChain) && Intrinsics.areEqual(this.category, alphaTopTokenInfo.category) && Intrinsics.areEqual(this.alphaOpeningAt, alphaTopTokenInfo.alphaOpeningAt) && Intrinsics.areEqual(this.currencyUnit, alphaTopTokenInfo.currencyUnit) && Intrinsics.areEqual(this.tokenIcon, alphaTopTokenInfo.tokenIcon) && Intrinsics.areEqual(this.chainIcon, alphaTopTokenInfo.chainIcon) && Intrinsics.areEqual(this.displayToken, alphaTopTokenInfo.displayToken) && Intrinsics.areEqual(this.fullDisplayToken, alphaTopTokenInfo.fullDisplayToken) && Intrinsics.areEqual(this.hot, alphaTopTokenInfo.hot) && Intrinsics.areEqual(this.recommendScale, alphaTopTokenInfo.recommendScale) && Intrinsics.areEqual(this.last24HourHighestPrice, alphaTopTokenInfo.last24HourHighestPrice) && Intrinsics.areEqual(this.last24HourLowestPrice, alphaTopTokenInfo.last24HourLowestPrice) && Intrinsics.areEqual(this.price, alphaTopTokenInfo.price) && Intrinsics.areEqual(this.tokenHolderCount, alphaTopTokenInfo.tokenHolderCount) && Intrinsics.areEqual(this.marketCap, alphaTopTokenInfo.marketCap) && Intrinsics.areEqual(this.tokenLiquidity, alphaTopTokenInfo.tokenLiquidity) && Intrinsics.areEqual(this.fdv, alphaTopTokenInfo.fdv) && Intrinsics.areEqual(this.tokenCreationAt, alphaTopTokenInfo.tokenCreationAt) && Intrinsics.areEqual(this.mintable, alphaTopTokenInfo.mintable) && Intrinsics.areEqual(this.unlockedLiquidity, alphaTopTokenInfo.unlockedLiquidity) && Intrinsics.areEqual(this.adminRightsRetained, alphaTopTokenInfo.adminRightsRetained) && Intrinsics.areEqual(this.closedSourceContract, alphaTopTokenInfo.closedSourceContract) && Intrinsics.areEqual(this.inBlacklist, alphaTopTokenInfo.inBlacklist) && Intrinsics.areEqual(this.freezableContract, alphaTopTokenInfo.freezableContract) && Intrinsics.areEqual(this.securityScore, alphaTopTokenInfo.securityScore) && Intrinsics.areEqual(this.tokenAppendixInformation, alphaTopTokenInfo.tokenAppendixInformation) && Intrinsics.areEqual(this.tokenIntroduction, alphaTopTokenInfo.tokenIntroduction) && Intrinsics.areEqual(this.tradingVolume, alphaTopTokenInfo.tradingVolume) && Intrinsics.areEqual(this.priceRate, alphaTopTokenInfo.priceRate) && Intrinsics.areEqual(this.txCount, alphaTopTokenInfo.txCount) && Intrinsics.areEqual(this.buySideCount, alphaTopTokenInfo.buySideCount) && Intrinsics.areEqual(this.sellSideCount, alphaTopTokenInfo.sellSideCount) && Intrinsics.areEqual(this.tradingAddressCount, alphaTopTokenInfo.tradingAddressCount) && Intrinsics.areEqual(this.delaySeconds, alphaTopTokenInfo.delaySeconds) && Intrinsics.areEqual(this.favoritePersonal, alphaTopTokenInfo.favoritePersonal);
    }

    public AlphaTopTokenInfo(@Nullable Long l11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l12, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Boolean bool, @Nullable Integer num, @Nullable String str10, @Nullable String str11, @Nullable BigDecimal bigDecimal, @Nullable Long l13, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable Long l14, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable BigDecimal bigDecimal2, @Nullable Long l15, @Nullable Long l16, @Nullable Long l17, @Nullable Long l18, @Nullable Integer num2, @Nullable Boolean bool8) {
        this.tokenBridgeId = l11;
        this.token = str;
        this.kcChain = str2;
        this.externalChain = str3;
        this.category = str4;
        this.alphaOpeningAt = l12;
        this.currencyUnit = str5;
        this.tokenIcon = str6;
        this.chainIcon = str7;
        this.displayToken = str8;
        this.fullDisplayToken = str9;
        this.hot = bool;
        this.recommendScale = num;
        this.last24HourHighestPrice = str10;
        this.last24HourLowestPrice = str11;
        this.price = bigDecimal;
        this.tokenHolderCount = l13;
        this.marketCap = str12;
        this.tokenLiquidity = str13;
        this.fdv = str14;
        this.tokenCreationAt = l14;
        this.mintable = bool2;
        this.unlockedLiquidity = bool3;
        this.adminRightsRetained = bool4;
        this.closedSourceContract = bool5;
        this.inBlacklist = bool6;
        this.freezableContract = bool7;
        this.securityScore = str15;
        this.tokenAppendixInformation = str16;
        this.tokenIntroduction = str17;
        this.tradingVolume = str18;
        this.priceRate = bigDecimal2;
        this.txCount = l15;
        this.buySideCount = l16;
        this.sellSideCount = l17;
        this.tradingAddressCount = l18;
        this.delaySeconds = num2;
        this.favoritePersonal = bool8;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTokenBridgeId() {
        return this.tokenBridgeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDisplayToken() {
        return this.displayToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getFullDisplayToken() {
        return this.fullDisplayToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getHot() {
        return this.hot;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getRecommendScale() {
        return this.recommendScale;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getLast24HourHighestPrice() {
        return this.last24HourHighestPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getLast24HourLowestPrice() {
        return this.last24HourLowestPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Long getTokenHolderCount() {
        return this.tokenHolderCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getMarketCap() {
        return this.marketCap;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getTokenLiquidity() {
        return this.tokenLiquidity;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getFdv() {
        return this.fdv;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Long getTokenCreationAt() {
        return this.tokenCreationAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Boolean getMintable() {
        return this.mintable;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Boolean getUnlockedLiquidity() {
        return this.unlockedLiquidity;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Boolean getAdminRightsRetained() {
        return this.adminRightsRetained;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Boolean getClosedSourceContract() {
        return this.closedSourceContract;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Boolean getInBlacklist() {
        return this.inBlacklist;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Boolean getFreezableContract() {
        return this.freezableContract;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getSecurityScore() {
        return this.securityScore;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getTokenAppendixInformation() {
        return this.tokenAppendixInformation;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKcChain() {
        return this.kcChain;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getTokenIntroduction() {
        return this.tokenIntroduction;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getTradingVolume() {
        return this.tradingVolume;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final BigDecimal getPriceRate() {
        return this.priceRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Long getTxCount() {
        return this.txCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Long getBuySideCount() {
        return this.buySideCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final Long getSellSideCount() {
        return this.sellSideCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final Long getTradingAddressCount() {
        return this.tradingAddressCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final Integer getDelaySeconds() {
        return this.delaySeconds;
    }

    @Nullable
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final Boolean getFavoritePersonal() {
        return this.favoritePersonal;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExternalChain() {
        return this.externalChain;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getAlphaOpeningAt() {
        return this.alphaOpeningAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCurrencyUnit() {
        return this.currencyUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTokenIcon() {
        return this.tokenIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getChainIcon() {
        return this.chainIcon;
    }

    @Nullable
    public final Boolean getAdminRightsRetained() {
        return this.adminRightsRetained;
    }

    @Nullable
    public final Long getAlphaOpeningAt() {
        return this.alphaOpeningAt;
    }

    @Nullable
    public final Long getBuySideCount() {
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

    @Nullable
    public final Boolean getClosedSourceContract() {
        return this.closedSourceContract;
    }

    @Nullable
    public final String getCurrencyUnit() {
        return this.currencyUnit;
    }

    @Nullable
    public final Integer getDelaySeconds() {
        return this.delaySeconds;
    }

    @Nullable
    public final String getDisplayToken() {
        return this.displayToken;
    }

    @Nullable
    public final String getExternalChain() {
        return this.externalChain;
    }

    @Nullable
    public final Boolean getFavoritePersonal() {
        return this.favoritePersonal;
    }

    @Nullable
    public final String getFdv() {
        return this.fdv;
    }

    @Nullable
    public final Boolean getFreezableContract() {
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

    @Nullable
    public final Boolean getInBlacklist() {
        return this.inBlacklist;
    }

    @Nullable
    public final String getKcChain() {
        return this.kcChain;
    }

    @Nullable
    public final String getLast24HourHighestPrice() {
        return this.last24HourHighestPrice;
    }

    @Nullable
    public final String getLast24HourLowestPrice() {
        return this.last24HourLowestPrice;
    }

    @Nullable
    public final String getMarketCap() {
        return this.marketCap;
    }

    @Nullable
    public final Boolean getMintable() {
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
    public final Integer getRecommendScale() {
        return this.recommendScale;
    }

    @Nullable
    public final String getSecurityScore() {
        return this.securityScore;
    }

    @Nullable
    public final Long getSellSideCount() {
        return this.sellSideCount;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final String getTokenAppendixInformation() {
        return this.tokenAppendixInformation;
    }

    @Nullable
    public final Long getTokenBridgeId() {
        return this.tokenBridgeId;
    }

    @Nullable
    public final Long getTokenCreationAt() {
        return this.tokenCreationAt;
    }

    @Nullable
    public final Long getTokenHolderCount() {
        return this.tokenHolderCount;
    }

    @Nullable
    public final String getTokenIcon() {
        return this.tokenIcon;
    }

    @Nullable
    public final String getTokenIntroduction() {
        return this.tokenIntroduction;
    }

    @Nullable
    public final String getTokenLiquidity() {
        return this.tokenLiquidity;
    }

    @Nullable
    public final Long getTradingAddressCount() {
        return this.tradingAddressCount;
    }

    @Nullable
    public final String getTradingVolume() {
        return this.tradingVolume;
    }

    @Nullable
    public final Long getTxCount() {
        return this.txCount;
    }

    @Nullable
    public final Boolean getUnlockedLiquidity() {
        return this.unlockedLiquidity;
    }

    public int hashCode() {
        Long l11 = this.tokenBridgeId;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.token;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.kcChain;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.externalChain;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.category;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l12 = this.alphaOpeningAt;
        int iHashCode6 = (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str5 = this.currencyUnit;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tokenIcon;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.chainIcon;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.displayToken;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.fullDisplayToken;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.hot;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.recommendScale;
        int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        String str10 = this.last24HourHighestPrice;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.last24HourLowestPrice;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        BigDecimal bigDecimal = this.price;
        int iHashCode16 = (iHashCode15 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Long l13 = this.tokenHolderCount;
        int iHashCode17 = (iHashCode16 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str12 = this.marketCap;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.tokenLiquidity;
        int iHashCode19 = (iHashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.fdv;
        int iHashCode20 = (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Long l14 = this.tokenCreationAt;
        int iHashCode21 = (iHashCode20 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Boolean bool2 = this.mintable;
        int iHashCode22 = (iHashCode21 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.unlockedLiquidity;
        int iHashCode23 = (iHashCode22 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.adminRightsRetained;
        int iHashCode24 = (iHashCode23 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.closedSourceContract;
        int iHashCode25 = (iHashCode24 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.inBlacklist;
        int iHashCode26 = (iHashCode25 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.freezableContract;
        int iHashCode27 = (iHashCode26 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str15 = this.securityScore;
        int iHashCode28 = (iHashCode27 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.tokenAppendixInformation;
        int iHashCode29 = (iHashCode28 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.tokenIntroduction;
        int iHashCode30 = (iHashCode29 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.tradingVolume;
        int iHashCode31 = (iHashCode30 + (str18 == null ? 0 : str18.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.priceRate;
        int iHashCode32 = (iHashCode31 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Long l15 = this.txCount;
        int iHashCode33 = (iHashCode32 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.buySideCount;
        int iHashCode34 = (iHashCode33 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.sellSideCount;
        int iHashCode35 = (iHashCode34 + (l17 == null ? 0 : l17.hashCode())) * 31;
        Long l18 = this.tradingAddressCount;
        int iHashCode36 = (iHashCode35 + (l18 == null ? 0 : l18.hashCode())) * 31;
        Integer num2 = this.delaySeconds;
        int iHashCode37 = (iHashCode36 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool8 = this.favoritePersonal;
        return iHashCode37 + (bool8 != null ? bool8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AlphaTopTokenInfo(tokenBridgeId=" + this.tokenBridgeId + ", token=" + this.token + ", kcChain=" + this.kcChain + ", externalChain=" + this.externalChain + ", category=" + this.category + ", alphaOpeningAt=" + this.alphaOpeningAt + ", currencyUnit=" + this.currencyUnit + ", tokenIcon=" + this.tokenIcon + ", chainIcon=" + this.chainIcon + ", displayToken=" + this.displayToken + ", fullDisplayToken=" + this.fullDisplayToken + ", hot=" + this.hot + ", recommendScale=" + this.recommendScale + ", last24HourHighestPrice=" + this.last24HourHighestPrice + ", last24HourLowestPrice=" + this.last24HourLowestPrice + ", price=" + this.price + ", tokenHolderCount=" + this.tokenHolderCount + ", marketCap=" + this.marketCap + ", tokenLiquidity=" + this.tokenLiquidity + ", fdv=" + this.fdv + ", tokenCreationAt=" + this.tokenCreationAt + ", mintable=" + this.mintable + ", unlockedLiquidity=" + this.unlockedLiquidity + ", adminRightsRetained=" + this.adminRightsRetained + ", closedSourceContract=" + this.closedSourceContract + ", inBlacklist=" + this.inBlacklist + ", freezableContract=" + this.freezableContract + ", securityScore=" + this.securityScore + ", tokenAppendixInformation=" + this.tokenAppendixInformation + ", tokenIntroduction=" + this.tokenIntroduction + ", tradingVolume=" + this.tradingVolume + ", priceRate=" + this.priceRate + ", txCount=" + this.txCount + ", buySideCount=" + this.buySideCount + ", sellSideCount=" + this.sellSideCount + ", tradingAddressCount=" + this.tradingAddressCount + ", delaySeconds=" + this.delaySeconds + ", favoritePersonal=" + this.favoritePersonal + ')';
    }

    public /* synthetic */ AlphaTopTokenInfo(Long l11, String str, String str2, String str3, String str4, Long l12, String str5, String str6, String str7, String str8, String str9, Boolean bool, Integer num, String str10, String str11, BigDecimal bigDecimal, Long l13, String str12, String str13, String str14, Long l14, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str15, String str16, String str17, String str18, BigDecimal bigDecimal2, Long l15, Long l16, Long l17, Long l18, Integer num2, Boolean bool8, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : l12, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : str7, (i11 & 512) != 0 ? null : str8, (i11 & 1024) != 0 ? null : str9, (i11 & 2048) != 0 ? null : bool, (i11 & 4096) != 0 ? null : num, (i11 & 8192) != 0 ? null : str10, (i11 & 16384) != 0 ? null : str11, (i11 & 32768) != 0 ? null : bigDecimal, (i11 & 65536) != 0 ? null : l13, (i11 & 131072) != 0 ? null : str12, (i11 & 262144) != 0 ? null : str13, (i11 & 524288) != 0 ? null : str14, (i11 & 1048576) != 0 ? null : l14, (i11 & 2097152) != 0 ? null : bool2, (i11 & 4194304) != 0 ? null : bool3, (i11 & 8388608) != 0 ? null : bool4, (i11 & 16777216) != 0 ? null : bool5, (i11 & 33554432) != 0 ? null : bool6, (i11 & 67108864) != 0 ? null : bool7, (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : str15, (i11 & 268435456) != 0 ? null : str16, (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : str17, (i11 & 1073741824) != 0 ? null : str18, (i11 & Integer.MIN_VALUE) != 0 ? null : bigDecimal2, (i12 & 1) != 0 ? null : l15, (i12 & 2) != 0 ? null : l16, (i12 & 4) != 0 ? null : l17, (i12 & 8) != 0 ? null : l18, (i12 & 16) != 0 ? null : num2, (i12 & 32) != 0 ? null : bool8);
    }
}
