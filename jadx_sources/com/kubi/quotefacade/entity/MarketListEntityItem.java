package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.google.gson.annotations.SerializedName;
import com.kubi.unify.api.IUnifyAccountService;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarkekListEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b^\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0016\u0012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010'\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010 \u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b,\u0010-J\u0006\u0010\\\u001a\u00020\u0012J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010j\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010?J\u0010\u0010k\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010?J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u0016HÆ\u0003J\u0010\u0010n\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010?J\u0010\u0010o\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010GJ\u0010\u0010p\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010GJ\u0010\u0010q\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010GJ\u0010\u0010r\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010GJ\u0010\u0010s\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010t\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010GJ\t\u0010u\u001a\u00020\u0016HÆ\u0003J\u0011\u0010v\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010 HÆ\u0003J\u0010\u0010w\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010?J\u0010\u0010x\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010?J\u0010\u0010y\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010?J\u0010\u0010z\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010?J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010'HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010'HÆ\u0003J\u0011\u0010~\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010 HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÈ\u0003\u0010\u0081\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001e\u001a\u00020\u00162\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010 2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010\u0082\u0001J\u0007\u0010\u0083\u0001\u001a\u00020\u0012J\u0016\u0010\u0084\u0001\u001a\u00020\u00162\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u0001HÖ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0012HÖ\u0001J\n\u0010\u0088\u0001\u001a\u00020\u0003HÖ\u0001J\u001b\u0010\u0089\u0001\u001a\u00030\u008a\u00012\b\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u008d\u0001\u001a\u00020\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010/R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010/R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010/R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010/R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010/R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010/R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010/R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010/R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010/R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010@\u001a\u0004\b>\u0010?R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010@\u001a\u0004\bA\u0010?R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010/R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010@\u001a\u0004\bE\u0010?R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010H\u001a\u0004\bF\u0010GR\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010H\u001a\u0004\bI\u0010GR\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010H\u001a\u0004\bJ\u0010GR\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010H\u001a\u0004\bK\u0010GR\u0015\u0010\u001c\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u00109\u001a\u0004\bL\u00108R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010H\u001a\u0004\bM\u0010GR\u0016\u0010\u001e\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010DR\u0019\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0015\u0010!\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010@\u001a\u0004\bQ\u0010?R\u0015\u0010\"\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010@\u001a\u0004\bR\u0010?R\u0015\u0010#\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010@\u001a\u0004\bS\u0010?R\u0015\u0010$\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010@\u001a\u0004\bT\u0010?R\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u0010/R\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0013\u0010(\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bX\u0010WR\u0019\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bY\u0010PR\u0013\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010/R\u0013\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u0010/¨\u0006\u008e\u0001"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/MarketListEntityItem;", "Landroid/os/Parcelable;", "crypto", "", "quoteCrypto", "symbol", "nameAMultiLang", "last1HourRate", "last4HourRate", "last24HourRate", "lastPrice", "openAt", "", TUIConstants.TUIChat.INPUT_MORE_ICON, "last24HourTradingVolume", "last24HourHighestPrice", "last24HourLowestPrice", "symbolMark", "", "symbolBoard", "symbolLabel", "alarmingPersonal", "", "priority", "tradingEnabled", "isolatedEnabled", "marginEnabled", "callAuctionSymbol", "tradingSoonSt", "tradingSoonEnabled", "favoritePersonal", "spotMarks", "", "maxIsolatedLeverageRatio", "maxMarginLeverageRatio", "buySideRatioUnifiedAccountLeverage", "sellSideRatioUnifiedAccountLeverage", "statusIcon", "fundingRate", "Ljava/math/BigDecimal;", "marketCap", "futuresMarks", "displayCrypto", "fullNameCrypto", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;ZLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getCrypto", "()Ljava/lang/String;", "getQuoteCrypto", "getSymbol", "getNameAMultiLang", "getLast1HourRate", "getLast4HourRate", "getLast24HourRate", "getLastPrice", "getOpenAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getIcon", "getLast24HourTradingVolume", "getLast24HourHighestPrice", "getLast24HourLowestPrice", "getSymbolMark", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSymbolBoard", "getSymbolLabel", "getAlarmingPersonal", "()Z", "getPriority", "getTradingEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIsolatedEnabled", "getMarginEnabled", "getCallAuctionSymbol", "getTradingSoonSt", "getTradingSoonEnabled", "getFavoritePersonal", "getSpotMarks", "()Ljava/util/List;", "getMaxIsolatedLeverageRatio", "getMaxMarginLeverageRatio", "getBuySideRatioUnifiedAccountLeverage", "getSellSideRatioUnifiedAccountLeverage", "getStatusIcon", "getFundingRate", "()Ljava/math/BigDecimal;", "getMarketCap", "getFuturesMarks", "getDisplayCrypto", "getFullNameCrypto", "getMaxLeverageByAccountStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;ZLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/quotefacade/entity/MarketListEntityItem;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketListEntityItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarketListEntityItem> CREATOR = new C21902a();

    @SerializedName("alarming_personal")
    private final boolean alarmingPersonal;

    @Nullable
    private final Integer buySideRatioUnifiedAccountLeverage;

    @Nullable
    private final Boolean callAuctionSymbol;

    @Nullable
    private final String crypto;

    @Nullable
    private final String displayCrypto;

    @SerializedName("favorite_personal")
    private final boolean favoritePersonal;

    @Nullable
    private final String fullNameCrypto;

    @Nullable
    private final BigDecimal fundingRate;

    @Nullable
    private final List<String> futuresMarks;

    @Nullable
    private final String icon;

    @Nullable
    private final Boolean isolatedEnabled;

    @Nullable
    private final String last1HourRate;

    @Nullable
    private final String last24HourHighestPrice;

    @Nullable
    private final String last24HourLowestPrice;

    @Nullable
    private final String last24HourRate;

    @Nullable
    private final String last24HourTradingVolume;

    @Nullable
    private final String last4HourRate;

    @Nullable
    private final String lastPrice;

    @Nullable
    private final Boolean marginEnabled;

    @Nullable
    private final BigDecimal marketCap;

    @Nullable
    private final Integer maxIsolatedLeverageRatio;

    @Nullable
    private final Integer maxMarginLeverageRatio;

    @SerializedName("nameA_multi_lang")
    @Nullable
    private final String nameAMultiLang;

    @Nullable
    private final Long openAt;

    @Nullable
    private final Integer priority;

    @Nullable
    private final String quoteCrypto;

    @Nullable
    private final Integer sellSideRatioUnifiedAccountLeverage;

    @Nullable
    private final List<String> spotMarks;

    @Nullable
    private final String statusIcon;

    @Nullable
    private final String symbol;

    @Nullable
    private final Integer symbolBoard;

    @Nullable
    private final String symbolLabel;

    @Nullable
    private final Integer symbolMark;

    @Nullable
    private final Boolean tradingEnabled;

    @Nullable
    private final Boolean tradingSoonEnabled;

    @Nullable
    private final Long tradingSoonSt;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.MarketListEntityItem$a */
    /* JADX INFO: compiled from: MarkekListEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21902a implements Parcelable.Creator<MarketListEntityItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarketListEntityItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string13 = parcel.readString();
            boolean z11 = parcel.readInt() != 0;
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketListEntityItem(string, string2, string3, string4, string5, string6, string7, string8, lValueOf, string9, string10, string11, string12, numValueOf, numValueOf2, string13, z11, numValueOf3, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, lValueOf2, boolValueOf5, parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarketListEntityItem[] newArray(int i11) {
            return new MarketListEntityItem[i11];
        }
    }

    public MarketListEntityItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Long l11, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable Integer num, @Nullable Integer num2, @Nullable String str13, boolean z11, @Nullable Integer num3, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Long l12, @Nullable Boolean bool5, boolean z12, @Nullable List<String> list, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable String str14, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable List<String> list2, @Nullable String str15, @Nullable String str16) {
        this.crypto = str;
        this.quoteCrypto = str2;
        this.symbol = str3;
        this.nameAMultiLang = str4;
        this.last1HourRate = str5;
        this.last4HourRate = str6;
        this.last24HourRate = str7;
        this.lastPrice = str8;
        this.openAt = l11;
        this.icon = str9;
        this.last24HourTradingVolume = str10;
        this.last24HourHighestPrice = str11;
        this.last24HourLowestPrice = str12;
        this.symbolMark = num;
        this.symbolBoard = num2;
        this.symbolLabel = str13;
        this.alarmingPersonal = z11;
        this.priority = num3;
        this.tradingEnabled = bool;
        this.isolatedEnabled = bool2;
        this.marginEnabled = bool3;
        this.callAuctionSymbol = bool4;
        this.tradingSoonSt = l12;
        this.tradingSoonEnabled = bool5;
        this.favoritePersonal = z12;
        this.spotMarks = list;
        this.maxIsolatedLeverageRatio = num4;
        this.maxMarginLeverageRatio = num5;
        this.buySideRatioUnifiedAccountLeverage = num6;
        this.sellSideRatioUnifiedAccountLeverage = num7;
        this.statusIcon = str14;
        this.fundingRate = bigDecimal;
        this.marketCap = bigDecimal2;
        this.futuresMarks = list2;
        this.displayCrypto = str15;
        this.fullNameCrypto = str16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketListEntityItem copy$default(MarketListEntityItem marketListEntityItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l11, String str9, String str10, String str11, String str12, Integer num, Integer num2, String str13, boolean z11, Integer num3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Long l12, Boolean bool5, boolean z12, List list, Integer num4, Integer num5, Integer num6, Integer num7, String str14, BigDecimal bigDecimal, BigDecimal bigDecimal2, List list2, String str15, String str16, int i11, int i12, Object obj) {
        String str17;
        String str18;
        String str19 = (i11 & 1) != 0 ? marketListEntityItem.crypto : str;
        String str20 = (i11 & 2) != 0 ? marketListEntityItem.quoteCrypto : str2;
        String str21 = (i11 & 4) != 0 ? marketListEntityItem.symbol : str3;
        String str22 = (i11 & 8) != 0 ? marketListEntityItem.nameAMultiLang : str4;
        String str23 = (i11 & 16) != 0 ? marketListEntityItem.last1HourRate : str5;
        String str24 = (i11 & 32) != 0 ? marketListEntityItem.last4HourRate : str6;
        String str25 = (i11 & 64) != 0 ? marketListEntityItem.last24HourRate : str7;
        String str26 = (i11 & 128) != 0 ? marketListEntityItem.lastPrice : str8;
        Long l13 = (i11 & 256) != 0 ? marketListEntityItem.openAt : l11;
        String str27 = (i11 & 512) != 0 ? marketListEntityItem.icon : str9;
        String str28 = (i11 & 1024) != 0 ? marketListEntityItem.last24HourTradingVolume : str10;
        String str29 = (i11 & 2048) != 0 ? marketListEntityItem.last24HourHighestPrice : str11;
        String str30 = (i11 & 4096) != 0 ? marketListEntityItem.last24HourLowestPrice : str12;
        Integer num8 = (i11 & 8192) != 0 ? marketListEntityItem.symbolMark : num;
        String str31 = str19;
        Integer num9 = (i11 & 16384) != 0 ? marketListEntityItem.symbolBoard : num2;
        String str32 = (i11 & 32768) != 0 ? marketListEntityItem.symbolLabel : str13;
        boolean z13 = (i11 & 65536) != 0 ? marketListEntityItem.alarmingPersonal : z11;
        Integer num10 = (i11 & 131072) != 0 ? marketListEntityItem.priority : num3;
        Boolean bool6 = (i11 & 262144) != 0 ? marketListEntityItem.tradingEnabled : bool;
        Boolean bool7 = (i11 & 524288) != 0 ? marketListEntityItem.isolatedEnabled : bool2;
        Boolean bool8 = (i11 & 1048576) != 0 ? marketListEntityItem.marginEnabled : bool3;
        Boolean bool9 = (i11 & 2097152) != 0 ? marketListEntityItem.callAuctionSymbol : bool4;
        Long l14 = (i11 & 4194304) != 0 ? marketListEntityItem.tradingSoonSt : l12;
        Boolean bool10 = (i11 & 8388608) != 0 ? marketListEntityItem.tradingSoonEnabled : bool5;
        boolean z14 = (i11 & 16777216) != 0 ? marketListEntityItem.favoritePersonal : z12;
        List list3 = (i11 & 33554432) != 0 ? marketListEntityItem.spotMarks : list;
        Integer num11 = (i11 & 67108864) != 0 ? marketListEntityItem.maxIsolatedLeverageRatio : num4;
        Integer num12 = (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketListEntityItem.maxMarginLeverageRatio : num5;
        Integer num13 = (i11 & 268435456) != 0 ? marketListEntityItem.buySideRatioUnifiedAccountLeverage : num6;
        Integer num14 = (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? marketListEntityItem.sellSideRatioUnifiedAccountLeverage : num7;
        String str33 = (i11 & 1073741824) != 0 ? marketListEntityItem.statusIcon : str14;
        BigDecimal bigDecimal3 = (i11 & Integer.MIN_VALUE) != 0 ? marketListEntityItem.fundingRate : bigDecimal;
        BigDecimal bigDecimal4 = (i12 & 1) != 0 ? marketListEntityItem.marketCap : bigDecimal2;
        List list4 = (i12 & 2) != 0 ? marketListEntityItem.futuresMarks : list2;
        String str34 = (i12 & 4) != 0 ? marketListEntityItem.displayCrypto : str15;
        if ((i12 & 8) != 0) {
            str18 = str34;
            str17 = marketListEntityItem.fullNameCrypto;
        } else {
            str17 = str16;
            str18 = str34;
        }
        return marketListEntityItem.copy(str31, str20, str21, str22, str23, str24, str25, str26, l13, str27, str28, str29, str30, num8, num9, str32, z13, num10, bool6, bool7, bool8, bool9, l14, bool10, z14, list3, num11, num12, num13, num14, str33, bigDecimal3, bigDecimal4, list4, str18, str17);
    }

    @NotNull
    public final MarketListEntityItem copy(@Nullable String crypto, @Nullable String quoteCrypto, @Nullable String symbol, @Nullable String nameAMultiLang, @Nullable String last1HourRate, @Nullable String last4HourRate, @Nullable String last24HourRate, @Nullable String lastPrice, @Nullable Long openAt, @Nullable String icon, @Nullable String last24HourTradingVolume, @Nullable String last24HourHighestPrice, @Nullable String last24HourLowestPrice, @Nullable Integer symbolMark, @Nullable Integer symbolBoard, @Nullable String symbolLabel, boolean alarmingPersonal, @Nullable Integer priority, @Nullable Boolean tradingEnabled, @Nullable Boolean isolatedEnabled, @Nullable Boolean marginEnabled, @Nullable Boolean callAuctionSymbol, @Nullable Long tradingSoonSt, @Nullable Boolean tradingSoonEnabled, boolean favoritePersonal, @Nullable List<String> spotMarks, @Nullable Integer maxIsolatedLeverageRatio, @Nullable Integer maxMarginLeverageRatio, @Nullable Integer buySideRatioUnifiedAccountLeverage, @Nullable Integer sellSideRatioUnifiedAccountLeverage, @Nullable String statusIcon, @Nullable BigDecimal fundingRate, @Nullable BigDecimal marketCap, @Nullable List<String> futuresMarks, @Nullable String displayCrypto, @Nullable String fullNameCrypto) {
        return new MarketListEntityItem(crypto, quoteCrypto, symbol, nameAMultiLang, last1HourRate, last4HourRate, last24HourRate, lastPrice, openAt, icon, last24HourTradingVolume, last24HourHighestPrice, last24HourLowestPrice, symbolMark, symbolBoard, symbolLabel, alarmingPersonal, priority, tradingEnabled, isolatedEnabled, marginEnabled, callAuctionSymbol, tradingSoonSt, tradingSoonEnabled, favoritePersonal, spotMarks, maxIsolatedLeverageRatio, maxMarginLeverageRatio, buySideRatioUnifiedAccountLeverage, sellSideRatioUnifiedAccountLeverage, statusIcon, fundingRate, marketCap, futuresMarks, displayCrypto, fullNameCrypto);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketListEntityItem)) {
            return false;
        }
        MarketListEntityItem marketListEntityItem = (MarketListEntityItem) other;
        return Intrinsics.areEqual(this.crypto, marketListEntityItem.crypto) && Intrinsics.areEqual(this.quoteCrypto, marketListEntityItem.quoteCrypto) && Intrinsics.areEqual(this.symbol, marketListEntityItem.symbol) && Intrinsics.areEqual(this.nameAMultiLang, marketListEntityItem.nameAMultiLang) && Intrinsics.areEqual(this.last1HourRate, marketListEntityItem.last1HourRate) && Intrinsics.areEqual(this.last4HourRate, marketListEntityItem.last4HourRate) && Intrinsics.areEqual(this.last24HourRate, marketListEntityItem.last24HourRate) && Intrinsics.areEqual(this.lastPrice, marketListEntityItem.lastPrice) && Intrinsics.areEqual(this.openAt, marketListEntityItem.openAt) && Intrinsics.areEqual(this.icon, marketListEntityItem.icon) && Intrinsics.areEqual(this.last24HourTradingVolume, marketListEntityItem.last24HourTradingVolume) && Intrinsics.areEqual(this.last24HourHighestPrice, marketListEntityItem.last24HourHighestPrice) && Intrinsics.areEqual(this.last24HourLowestPrice, marketListEntityItem.last24HourLowestPrice) && Intrinsics.areEqual(this.symbolMark, marketListEntityItem.symbolMark) && Intrinsics.areEqual(this.symbolBoard, marketListEntityItem.symbolBoard) && Intrinsics.areEqual(this.symbolLabel, marketListEntityItem.symbolLabel) && this.alarmingPersonal == marketListEntityItem.alarmingPersonal && Intrinsics.areEqual(this.priority, marketListEntityItem.priority) && Intrinsics.areEqual(this.tradingEnabled, marketListEntityItem.tradingEnabled) && Intrinsics.areEqual(this.isolatedEnabled, marketListEntityItem.isolatedEnabled) && Intrinsics.areEqual(this.marginEnabled, marketListEntityItem.marginEnabled) && Intrinsics.areEqual(this.callAuctionSymbol, marketListEntityItem.callAuctionSymbol) && Intrinsics.areEqual(this.tradingSoonSt, marketListEntityItem.tradingSoonSt) && Intrinsics.areEqual(this.tradingSoonEnabled, marketListEntityItem.tradingSoonEnabled) && this.favoritePersonal == marketListEntityItem.favoritePersonal && Intrinsics.areEqual(this.spotMarks, marketListEntityItem.spotMarks) && Intrinsics.areEqual(this.maxIsolatedLeverageRatio, marketListEntityItem.maxIsolatedLeverageRatio) && Intrinsics.areEqual(this.maxMarginLeverageRatio, marketListEntityItem.maxMarginLeverageRatio) && Intrinsics.areEqual(this.buySideRatioUnifiedAccountLeverage, marketListEntityItem.buySideRatioUnifiedAccountLeverage) && Intrinsics.areEqual(this.sellSideRatioUnifiedAccountLeverage, marketListEntityItem.sellSideRatioUnifiedAccountLeverage) && Intrinsics.areEqual(this.statusIcon, marketListEntityItem.statusIcon) && Intrinsics.areEqual(this.fundingRate, marketListEntityItem.fundingRate) && Intrinsics.areEqual(this.marketCap, marketListEntityItem.marketCap) && Intrinsics.areEqual(this.futuresMarks, marketListEntityItem.futuresMarks) && Intrinsics.areEqual(this.displayCrypto, marketListEntityItem.displayCrypto) && Intrinsics.areEqual(this.fullNameCrypto, marketListEntityItem.fullNameCrypto);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCrypto() {
        return this.crypto;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getLast24HourTradingVolume() {
        return this.last24HourTradingVolume;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getLast24HourHighestPrice() {
        return this.last24HourHighestPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getLast24HourLowestPrice() {
        return this.last24HourLowestPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getSymbolMark() {
        return this.symbolMark;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getSymbolBoard() {
        return this.symbolBoard;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getSymbolLabel() {
        return this.symbolLabel;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getAlarmingPersonal() {
        return this.alarmingPersonal;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getPriority() {
        return this.priority;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getTradingEnabled() {
        return this.tradingEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQuoteCrypto() {
        return this.quoteCrypto;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Boolean getIsolatedEnabled() {
        return this.isolatedEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getMarginEnabled() {
        return this.marginEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Boolean getCallAuctionSymbol() {
        return this.callAuctionSymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Long getTradingSoonSt() {
        return this.tradingSoonSt;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Boolean getTradingSoonEnabled() {
        return this.tradingSoonEnabled;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final boolean getFavoritePersonal() {
        return this.favoritePersonal;
    }

    @Nullable
    public final List<String> component26() {
        return this.spotMarks;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Integer getMaxIsolatedLeverageRatio() {
        return this.maxIsolatedLeverageRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Integer getMaxMarginLeverageRatio() {
        return this.maxMarginLeverageRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Integer getBuySideRatioUnifiedAccountLeverage() {
        return this.buySideRatioUnifiedAccountLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Integer getSellSideRatioUnifiedAccountLeverage() {
        return this.sellSideRatioUnifiedAccountLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getStatusIcon() {
        return this.statusIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final BigDecimal getFundingRate() {
        return this.fundingRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final BigDecimal getMarketCap() {
        return this.marketCap;
    }

    @Nullable
    public final List<String> component34() {
        return this.futuresMarks;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getDisplayCrypto() {
        return this.displayCrypto;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getFullNameCrypto() {
        return this.fullNameCrypto;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNameAMultiLang() {
        return this.nameAMultiLang;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLast1HourRate() {
        return this.last1HourRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLast4HourRate() {
        return this.last4HourRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLast24HourRate() {
        return this.last24HourRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getOpenAt() {
        return this.openAt;
    }

    public final boolean getAlarmingPersonal() {
        return this.alarmingPersonal;
    }

    @Nullable
    public final Integer getBuySideRatioUnifiedAccountLeverage() {
        return this.buySideRatioUnifiedAccountLeverage;
    }

    @Nullable
    public final Boolean getCallAuctionSymbol() {
        return this.callAuctionSymbol;
    }

    @Nullable
    public final String getCrypto() {
        return this.crypto;
    }

    @Nullable
    public final String getDisplayCrypto() {
        return this.displayCrypto;
    }

    public final boolean getFavoritePersonal() {
        return this.favoritePersonal;
    }

    @Nullable
    public final String getFullNameCrypto() {
        return this.fullNameCrypto;
    }

    @Nullable
    public final BigDecimal getFundingRate() {
        return this.fundingRate;
    }

    @Nullable
    public final List<String> getFuturesMarks() {
        return this.futuresMarks;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final Boolean getIsolatedEnabled() {
        return this.isolatedEnabled;
    }

    @Nullable
    public final String getLast1HourRate() {
        return this.last1HourRate;
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
    public final String getLast24HourRate() {
        return this.last24HourRate;
    }

    @Nullable
    public final String getLast24HourTradingVolume() {
        return this.last24HourTradingVolume;
    }

    @Nullable
    public final String getLast4HourRate() {
        return this.last4HourRate;
    }

    @Nullable
    public final String getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    public final Boolean getMarginEnabled() {
        return this.marginEnabled;
    }

    @Nullable
    public final BigDecimal getMarketCap() {
        return this.marketCap;
    }

    @Nullable
    public final Integer getMaxIsolatedLeverageRatio() {
        return this.maxIsolatedLeverageRatio;
    }

    public final int getMaxLeverageByAccountStatus() {
        if (IUnifyAccountService.f53155a.get().mo64979C()) {
            Integer num = this.maxIsolatedLeverageRatio;
            int iIntValue = num != null ? num.intValue() : -1;
            Integer num2 = this.sellSideRatioUnifiedAccountLeverage;
            return Math.max(iIntValue, num2 != null ? num2.intValue() : -1);
        }
        Integer num3 = this.maxMarginLeverageRatio;
        int iIntValue2 = num3 != null ? num3.intValue() : -1;
        Integer num4 = this.maxIsolatedLeverageRatio;
        return Math.max(iIntValue2, num4 != null ? num4.intValue() : -1);
    }

    @Nullable
    public final Integer getMaxMarginLeverageRatio() {
        return this.maxMarginLeverageRatio;
    }

    @Nullable
    public final String getNameAMultiLang() {
        return this.nameAMultiLang;
    }

    @Nullable
    public final Long getOpenAt() {
        return this.openAt;
    }

    @Nullable
    public final Integer getPriority() {
        return this.priority;
    }

    @Nullable
    public final String getQuoteCrypto() {
        return this.quoteCrypto;
    }

    @Nullable
    public final Integer getSellSideRatioUnifiedAccountLeverage() {
        return this.sellSideRatioUnifiedAccountLeverage;
    }

    @Nullable
    public final List<String> getSpotMarks() {
        return this.spotMarks;
    }

    @Nullable
    public final String getStatusIcon() {
        return this.statusIcon;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final Integer getSymbolBoard() {
        return this.symbolBoard;
    }

    @Nullable
    public final String getSymbolLabel() {
        return this.symbolLabel;
    }

    @Nullable
    public final Integer getSymbolMark() {
        return this.symbolMark;
    }

    @Nullable
    public final Boolean getTradingEnabled() {
        return this.tradingEnabled;
    }

    @Nullable
    public final Boolean getTradingSoonEnabled() {
        return this.tradingSoonEnabled;
    }

    @Nullable
    public final Long getTradingSoonSt() {
        return this.tradingSoonSt;
    }

    public int hashCode() {
        String str = this.crypto;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.quoteCrypto;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.symbol;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nameAMultiLang;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.last1HourRate;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.last4HourRate;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.last24HourRate;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.lastPrice;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l11 = this.openAt;
        int iHashCode9 = (iHashCode8 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str9 = this.icon;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.last24HourTradingVolume;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.last24HourHighestPrice;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.last24HourLowestPrice;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num = this.symbolMark;
        int iHashCode14 = (iHashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.symbolBoard;
        int iHashCode15 = (iHashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str13 = this.symbolLabel;
        int iHashCode16 = (((iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31) + Boolean.hashCode(this.alarmingPersonal)) * 31;
        Integer num3 = this.priority;
        int iHashCode17 = (iHashCode16 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.tradingEnabled;
        int iHashCode18 = (iHashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isolatedEnabled;
        int iHashCode19 = (iHashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.marginEnabled;
        int iHashCode20 = (iHashCode19 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.callAuctionSymbol;
        int iHashCode21 = (iHashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Long l12 = this.tradingSoonSt;
        int iHashCode22 = (iHashCode21 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Boolean bool5 = this.tradingSoonEnabled;
        int iHashCode23 = (((iHashCode22 + (bool5 == null ? 0 : bool5.hashCode())) * 31) + Boolean.hashCode(this.favoritePersonal)) * 31;
        List<String> list = this.spotMarks;
        int iHashCode24 = (iHashCode23 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num4 = this.maxIsolatedLeverageRatio;
        int iHashCode25 = (iHashCode24 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.maxMarginLeverageRatio;
        int iHashCode26 = (iHashCode25 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.buySideRatioUnifiedAccountLeverage;
        int iHashCode27 = (iHashCode26 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.sellSideRatioUnifiedAccountLeverage;
        int iHashCode28 = (iHashCode27 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str14 = this.statusIcon;
        int iHashCode29 = (iHashCode28 + (str14 == null ? 0 : str14.hashCode())) * 31;
        BigDecimal bigDecimal = this.fundingRate;
        int iHashCode30 = (iHashCode29 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.marketCap;
        int iHashCode31 = (iHashCode30 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        List<String> list2 = this.futuresMarks;
        int iHashCode32 = (iHashCode31 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str15 = this.displayCrypto;
        int iHashCode33 = (iHashCode32 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.fullNameCrypto;
        return iHashCode33 + (str16 != null ? str16.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarketListEntityItem(crypto=" + this.crypto + ", quoteCrypto=" + this.quoteCrypto + ", symbol=" + this.symbol + ", nameAMultiLang=" + this.nameAMultiLang + ", last1HourRate=" + this.last1HourRate + ", last4HourRate=" + this.last4HourRate + ", last24HourRate=" + this.last24HourRate + ", lastPrice=" + this.lastPrice + ", openAt=" + this.openAt + ", icon=" + this.icon + ", last24HourTradingVolume=" + this.last24HourTradingVolume + ", last24HourHighestPrice=" + this.last24HourHighestPrice + ", last24HourLowestPrice=" + this.last24HourLowestPrice + ", symbolMark=" + this.symbolMark + ", symbolBoard=" + this.symbolBoard + ", symbolLabel=" + this.symbolLabel + ", alarmingPersonal=" + this.alarmingPersonal + ", priority=" + this.priority + ", tradingEnabled=" + this.tradingEnabled + ", isolatedEnabled=" + this.isolatedEnabled + ", marginEnabled=" + this.marginEnabled + ", callAuctionSymbol=" + this.callAuctionSymbol + ", tradingSoonSt=" + this.tradingSoonSt + ", tradingSoonEnabled=" + this.tradingSoonEnabled + ", favoritePersonal=" + this.favoritePersonal + ", spotMarks=" + this.spotMarks + ", maxIsolatedLeverageRatio=" + this.maxIsolatedLeverageRatio + ", maxMarginLeverageRatio=" + this.maxMarginLeverageRatio + ", buySideRatioUnifiedAccountLeverage=" + this.buySideRatioUnifiedAccountLeverage + ", sellSideRatioUnifiedAccountLeverage=" + this.sellSideRatioUnifiedAccountLeverage + ", statusIcon=" + this.statusIcon + ", fundingRate=" + this.fundingRate + ", marketCap=" + this.marketCap + ", futuresMarks=" + this.futuresMarks + ", displayCrypto=" + this.displayCrypto + ", fullNameCrypto=" + this.fullNameCrypto + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.crypto);
        dest.writeString(this.quoteCrypto);
        dest.writeString(this.symbol);
        dest.writeString(this.nameAMultiLang);
        dest.writeString(this.last1HourRate);
        dest.writeString(this.last4HourRate);
        dest.writeString(this.last24HourRate);
        dest.writeString(this.lastPrice);
        Long l11 = this.openAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.icon);
        dest.writeString(this.last24HourTradingVolume);
        dest.writeString(this.last24HourHighestPrice);
        dest.writeString(this.last24HourLowestPrice);
        Integer num = this.symbolMark;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.symbolBoard;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.symbolLabel);
        dest.writeInt(this.alarmingPersonal ? 1 : 0);
        Integer num3 = this.priority;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        Boolean bool = this.tradingEnabled;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isolatedEnabled;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.marginEnabled;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.callAuctionSymbol;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Long l12 = this.tradingSoonSt;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        Boolean bool5 = this.tradingSoonEnabled;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        dest.writeInt(this.favoritePersonal ? 1 : 0);
        dest.writeStringList(this.spotMarks);
        Integer num4 = this.maxIsolatedLeverageRatio;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
        Integer num5 = this.maxMarginLeverageRatio;
        if (num5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num5.intValue());
        }
        Integer num6 = this.buySideRatioUnifiedAccountLeverage;
        if (num6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num6.intValue());
        }
        Integer num7 = this.sellSideRatioUnifiedAccountLeverage;
        if (num7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num7.intValue());
        }
        dest.writeString(this.statusIcon);
        dest.writeSerializable(this.fundingRate);
        dest.writeSerializable(this.marketCap);
        dest.writeStringList(this.futuresMarks);
        dest.writeString(this.displayCrypto);
        dest.writeString(this.fullNameCrypto);
    }

    public /* synthetic */ MarketListEntityItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l11, String str9, String str10, String str11, String str12, Integer num, Integer num2, String str13, boolean z11, Integer num3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Long l12, Boolean bool5, boolean z12, List list, Integer num4, Integer num5, Integer num6, Integer num7, String str14, BigDecimal bigDecimal, BigDecimal bigDecimal2, List list2, String str15, String str16, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, (i11 & 256) != 0 ? null : l11, str9, str10, str11, str12, num, num2, str13, z11, num3, bool, bool2, bool3, bool4, l12, bool5, z12, list, (67108864 & i11) != 0 ? null : num4, (134217728 & i11) != 0 ? null : num5, (268435456 & i11) != 0 ? null : num6, (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : num7, str14, bigDecimal, bigDecimal2, list2, (i12 & 4) != 0 ? null : str15, (i12 & 8) != 0 ? null : str16);
    }
}
