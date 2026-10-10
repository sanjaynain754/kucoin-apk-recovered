package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.C2711C;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.unify.api.IUnifyAccountService;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FavMarketQuoteEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\bk\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0015\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010#\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b,\u0010-J\u0006\u0010Z\u001a\u00020\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010d\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010j\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010CJ\u0010\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010l\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010m\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019HÆ\u0003J\u0010\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010p\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010s\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010t\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010CJ\u000b\u0010u\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010v\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010CJ\u0010\u0010w\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010;J\u000b\u0010x\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010{\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010CJ\u0010\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/JÒ\u0003\u0010\u0080\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010\u0081\u0001J\u0007\u0010\u0082\u0001\u001a\u00020\u0003J\u0016\u0010\u0083\u0001\u001a\u00020\u00152\n\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0085\u0001HÖ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010\u0087\u0001\u001a\u00020\u0005HÖ\u0001J\u001b\u0010\u0088\u0001\u001a\u00030\u0089\u00012\b\u0010\u008a\u0001\u001a\u00030\u008b\u00012\u0007\u0010\u008c\u0001\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00100\u001a\u0004\b3\u0010/R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00100\u001a\u0004\b4\u0010/R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u00102R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u00102R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u00102R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00100\u001a\u0004\b8\u0010/R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00100\u001a\u0004\b9\u0010/R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010<\u001a\u0004\b:\u0010;R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00100\u001a\u0004\b=\u0010/R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u00102R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u00102R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u00102R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u00102R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010D\u001a\u0004\bB\u0010CR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00100\u001a\u0004\bE\u0010/R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bF\u00102R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00100\u001a\u0004\bI\u0010/R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00100\u001a\u0004\bJ\u0010/R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bK\u00102R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bL\u00102R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00100\u001a\u0004\bM\u0010/R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bN\u00102R\u0015\u0010 \u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010D\u001a\u0004\bO\u0010CR\u0013\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bP\u00102R\u0015\u0010\"\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010D\u001a\u0004\bQ\u0010CR\u0015\u0010#\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010<\u001a\u0004\bR\u0010;R\u0013\u0010$\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bS\u00102R\u0013\u0010%\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bT\u00102R\u0013\u0010&\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bU\u00102R\u0015\u0010'\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010D\u001a\u0004\b'\u0010CR\u0015\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00100\u001a\u0004\bV\u0010/R\u0015\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00100\u001a\u0004\bW\u0010/R\u0015\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00100\u001a\u0004\bX\u0010/R\u0015\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00100\u001a\u0004\bY\u0010/¨\u0006\u008d\u0001"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;", "Landroid/os/Parcelable;", "askSize", "", "baseCurrency", "", "bidSize", "board", "buy", "changePrice", "changeRate", "close", "collectType", "datetime", "", "globalOrder", "high", "iconUrl", "lastTradedPrice", "low", "marginTrade", "", "mark", "market", "markets", "", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "order", "quoteCurrency", "sell", "sort", "symbol", NotificationCompat.CATEGORY_ALARM, "symbolCode", "trading", "updatedTime", "coinLabel", "vol", "volValue", "isMarginEnable", "maxIsolatedLeverageRatio", "maxMarginLeverageRatio", "buySideRatioUnifiedAccountLeverage", "sellSideRatioUnifiedAccountLeverage", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAskSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBaseCurrency", "()Ljava/lang/String;", "getBidSize", "getBoard", "getBuy", "getChangePrice", "getChangeRate", "getClose", "getCollectType", "getDatetime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getGlobalOrder", "getHigh", "getIconUrl", "getLastTradedPrice", "getLow", "getMarginTrade", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMark", "getMarket", "getMarkets", "()Ljava/util/List;", "getOpen", "getOrder", "getQuoteCurrency", "getSell", "getSort", "getSymbol", "getAlarm", "getSymbolCode", "getTrading", "getUpdatedTime", "getCoinLabel", "getVol", "getVolValue", "getMaxIsolatedLeverageRatio", "getMaxMarginLeverageRatio", "getBuySideRatioUnifiedAccountLeverage", "getSellSideRatioUnifiedAccountLeverage", "getMaxLeverageByAccountStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FavMarketQuoteEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FavMarketQuoteEntity> CREATOR = new C21884a();

    @Nullable
    private final Boolean alarm;

    @Nullable
    private final Integer askSize;

    @Nullable
    private final String baseCurrency;

    @Nullable
    private final Integer bidSize;

    @Nullable
    private final Integer board;

    @Nullable
    private final String buy;

    @Nullable
    private final Integer buySideRatioUnifiedAccountLeverage;

    @Nullable
    private final String changePrice;

    @Nullable
    private final String changeRate;

    @Nullable
    private final Integer close;

    @Nullable
    private final String coinLabel;

    @Nullable
    private final Integer collectType;

    @Nullable
    private final Long datetime;

    @Nullable
    private final Integer globalOrder;

    @Nullable
    private final String high;

    @Nullable
    private final String iconUrl;

    @Nullable
    private final Boolean isMarginEnable;

    @Nullable
    private final String lastTradedPrice;

    @Nullable
    private final String low;

    @Nullable
    private final Boolean marginTrade;

    @Nullable
    private final Integer mark;

    @Nullable
    private final String market;

    @Nullable
    private final List<String> markets;

    @Nullable
    private final Integer maxIsolatedLeverageRatio;

    @Nullable
    private final Integer maxMarginLeverageRatio;

    @Nullable
    private final Integer open;

    @Nullable
    private final Integer order;

    @Nullable
    private final String quoteCurrency;

    @Nullable
    private final String sell;

    @Nullable
    private final Integer sellSideRatioUnifiedAccountLeverage;

    @Nullable
    private final Integer sort;

    @Nullable
    private final String symbol;

    @Nullable
    private final String symbolCode;

    @Nullable
    private final Boolean trading;

    @Nullable
    private final Long updatedTime;

    @Nullable
    private final String vol;

    @Nullable
    private final String volValue;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.FavMarketQuoteEntity$a */
    /* JADX INFO: compiled from: FavMarketQuoteEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21884a implements Parcelable.Creator<FavMarketQuoteEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FavMarketQuoteEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string9 = parcel.readString();
            Integer num = numValueOf7;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Integer numValueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer num2 = numValueOf8;
            String string10 = parcel.readString();
            Integer num3 = numValueOf9;
            String string11 = parcel.readString();
            Integer numValueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string13 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer num4 = numValueOf10;
            Boolean bool = boolValueOf2;
            Boolean bool2 = boolValueOf3;
            String string14 = parcel.readString();
            boolean z11 = false;
            Long l11 = lValueOf2;
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                boolValueOf4 = Boolean.valueOf(z11);
            }
            return new FavMarketQuoteEntity(numValueOf, string, numValueOf2, numValueOf3, string2, string3, string4, numValueOf4, numValueOf5, lValueOf, numValueOf6, string5, string6, string7, string8, boolValueOf, num, string9, arrayListCreateStringArrayList, num2, num3, string10, string11, num4, string12, bool, string13, bool2, l11, string14, string15, string16, boolValueOf4, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FavMarketQuoteEntity[] newArray(int i11) {
            return new FavMarketQuoteEntity[i11];
        }
    }

    public FavMarketQuoteEntity(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num4, @Nullable Integer num5, @Nullable Long l11, @Nullable Integer num6, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Boolean bool, @Nullable Integer num7, @Nullable String str9, @Nullable List<String> list, @Nullable Integer num8, @Nullable Integer num9, @Nullable String str10, @Nullable String str11, @Nullable Integer num10, @Nullable String str12, @Nullable Boolean bool2, @Nullable String str13, @Nullable Boolean bool3, @Nullable Long l12, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable Boolean bool4, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14) {
        this.askSize = num;
        this.baseCurrency = str;
        this.bidSize = num2;
        this.board = num3;
        this.buy = str2;
        this.changePrice = str3;
        this.changeRate = str4;
        this.close = num4;
        this.collectType = num5;
        this.datetime = l11;
        this.globalOrder = num6;
        this.high = str5;
        this.iconUrl = str6;
        this.lastTradedPrice = str7;
        this.low = str8;
        this.marginTrade = bool;
        this.mark = num7;
        this.market = str9;
        this.markets = list;
        this.open = num8;
        this.order = num9;
        this.quoteCurrency = str10;
        this.sell = str11;
        this.sort = num10;
        this.symbol = str12;
        this.alarm = bool2;
        this.symbolCode = str13;
        this.trading = bool3;
        this.updatedTime = l12;
        this.coinLabel = str14;
        this.vol = str15;
        this.volValue = str16;
        this.isMarginEnable = bool4;
        this.maxIsolatedLeverageRatio = num11;
        this.maxMarginLeverageRatio = num12;
        this.buySideRatioUnifiedAccountLeverage = num13;
        this.sellSideRatioUnifiedAccountLeverage = num14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavMarketQuoteEntity copy$default(FavMarketQuoteEntity favMarketQuoteEntity, Integer num, String str, Integer num2, Integer num3, String str2, String str3, String str4, Integer num4, Integer num5, Long l11, Integer num6, String str5, String str6, String str7, String str8, Boolean bool, Integer num7, String str9, List list, Integer num8, Integer num9, String str10, String str11, Integer num10, String str12, Boolean bool2, String str13, Boolean bool3, Long l12, String str14, String str15, String str16, Boolean bool4, Integer num11, Integer num12, Integer num13, Integer num14, int i11, int i12, Object obj) {
        Integer num15;
        Integer num16;
        Integer num17 = (i11 & 1) != 0 ? favMarketQuoteEntity.askSize : num;
        String str17 = (i11 & 2) != 0 ? favMarketQuoteEntity.baseCurrency : str;
        Integer num18 = (i11 & 4) != 0 ? favMarketQuoteEntity.bidSize : num2;
        Integer num19 = (i11 & 8) != 0 ? favMarketQuoteEntity.board : num3;
        String str18 = (i11 & 16) != 0 ? favMarketQuoteEntity.buy : str2;
        String str19 = (i11 & 32) != 0 ? favMarketQuoteEntity.changePrice : str3;
        String str20 = (i11 & 64) != 0 ? favMarketQuoteEntity.changeRate : str4;
        Integer num20 = (i11 & 128) != 0 ? favMarketQuoteEntity.close : num4;
        Integer num21 = (i11 & 256) != 0 ? favMarketQuoteEntity.collectType : num5;
        Long l13 = (i11 & 512) != 0 ? favMarketQuoteEntity.datetime : l11;
        Integer num22 = (i11 & 1024) != 0 ? favMarketQuoteEntity.globalOrder : num6;
        String str21 = (i11 & 2048) != 0 ? favMarketQuoteEntity.high : str5;
        String str22 = (i11 & 4096) != 0 ? favMarketQuoteEntity.iconUrl : str6;
        String str23 = (i11 & 8192) != 0 ? favMarketQuoteEntity.lastTradedPrice : str7;
        Integer num23 = num17;
        String str24 = (i11 & 16384) != 0 ? favMarketQuoteEntity.low : str8;
        Boolean bool5 = (i11 & 32768) != 0 ? favMarketQuoteEntity.marginTrade : bool;
        Integer num24 = (i11 & 65536) != 0 ? favMarketQuoteEntity.mark : num7;
        String str25 = (i11 & 131072) != 0 ? favMarketQuoteEntity.market : str9;
        List list2 = (i11 & 262144) != 0 ? favMarketQuoteEntity.markets : list;
        Integer num25 = (i11 & 524288) != 0 ? favMarketQuoteEntity.open : num8;
        Integer num26 = (i11 & 1048576) != 0 ? favMarketQuoteEntity.order : num9;
        String str26 = (i11 & 2097152) != 0 ? favMarketQuoteEntity.quoteCurrency : str10;
        String str27 = (i11 & 4194304) != 0 ? favMarketQuoteEntity.sell : str11;
        Integer num27 = (i11 & 8388608) != 0 ? favMarketQuoteEntity.sort : num10;
        String str28 = (i11 & 16777216) != 0 ? favMarketQuoteEntity.symbol : str12;
        Boolean bool6 = (i11 & 33554432) != 0 ? favMarketQuoteEntity.alarm : bool2;
        String str29 = (i11 & 67108864) != 0 ? favMarketQuoteEntity.symbolCode : str13;
        Boolean bool7 = (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? favMarketQuoteEntity.trading : bool3;
        Long l14 = (i11 & 268435456) != 0 ? favMarketQuoteEntity.updatedTime : l12;
        String str30 = (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? favMarketQuoteEntity.coinLabel : str14;
        String str31 = (i11 & 1073741824) != 0 ? favMarketQuoteEntity.vol : str15;
        String str32 = (i11 & Integer.MIN_VALUE) != 0 ? favMarketQuoteEntity.volValue : str16;
        Boolean bool8 = (i12 & 1) != 0 ? favMarketQuoteEntity.isMarginEnable : bool4;
        Integer num28 = (i12 & 2) != 0 ? favMarketQuoteEntity.maxIsolatedLeverageRatio : num11;
        Integer num29 = (i12 & 4) != 0 ? favMarketQuoteEntity.maxMarginLeverageRatio : num12;
        Integer num30 = (i12 & 8) != 0 ? favMarketQuoteEntity.buySideRatioUnifiedAccountLeverage : num13;
        if ((i12 & 16) != 0) {
            num16 = num30;
            num15 = favMarketQuoteEntity.sellSideRatioUnifiedAccountLeverage;
        } else {
            num15 = num14;
            num16 = num30;
        }
        return favMarketQuoteEntity.copy(num23, str17, num18, num19, str18, str19, str20, num20, num21, l13, num22, str21, str22, str23, str24, bool5, num24, str25, list2, num25, num26, str26, str27, num27, str28, bool6, str29, bool7, l14, str30, str31, str32, bool8, num28, num29, num16, num15);
    }

    @NotNull
    public final FavMarketQuoteEntity copy(@Nullable Integer askSize, @Nullable String baseCurrency, @Nullable Integer bidSize, @Nullable Integer board, @Nullable String buy, @Nullable String changePrice, @Nullable String changeRate, @Nullable Integer close, @Nullable Integer collectType, @Nullable Long datetime, @Nullable Integer globalOrder, @Nullable String high, @Nullable String iconUrl, @Nullable String lastTradedPrice, @Nullable String low, @Nullable Boolean marginTrade, @Nullable Integer mark, @Nullable String market, @Nullable List<String> markets, @Nullable Integer open, @Nullable Integer order, @Nullable String quoteCurrency, @Nullable String sell, @Nullable Integer sort, @Nullable String symbol, @Nullable Boolean alarm, @Nullable String symbolCode, @Nullable Boolean trading, @Nullable Long updatedTime, @Nullable String coinLabel, @Nullable String vol, @Nullable String volValue, @Nullable Boolean isMarginEnable, @Nullable Integer maxIsolatedLeverageRatio, @Nullable Integer maxMarginLeverageRatio, @Nullable Integer buySideRatioUnifiedAccountLeverage, @Nullable Integer sellSideRatioUnifiedAccountLeverage) {
        return new FavMarketQuoteEntity(askSize, baseCurrency, bidSize, board, buy, changePrice, changeRate, close, collectType, datetime, globalOrder, high, iconUrl, lastTradedPrice, low, marginTrade, mark, market, markets, open, order, quoteCurrency, sell, sort, symbol, alarm, symbolCode, trading, updatedTime, coinLabel, vol, volValue, isMarginEnable, maxIsolatedLeverageRatio, maxMarginLeverageRatio, buySideRatioUnifiedAccountLeverage, sellSideRatioUnifiedAccountLeverage);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavMarketQuoteEntity)) {
            return false;
        }
        FavMarketQuoteEntity favMarketQuoteEntity = (FavMarketQuoteEntity) other;
        return Intrinsics.areEqual(this.askSize, favMarketQuoteEntity.askSize) && Intrinsics.areEqual(this.baseCurrency, favMarketQuoteEntity.baseCurrency) && Intrinsics.areEqual(this.bidSize, favMarketQuoteEntity.bidSize) && Intrinsics.areEqual(this.board, favMarketQuoteEntity.board) && Intrinsics.areEqual(this.buy, favMarketQuoteEntity.buy) && Intrinsics.areEqual(this.changePrice, favMarketQuoteEntity.changePrice) && Intrinsics.areEqual(this.changeRate, favMarketQuoteEntity.changeRate) && Intrinsics.areEqual(this.close, favMarketQuoteEntity.close) && Intrinsics.areEqual(this.collectType, favMarketQuoteEntity.collectType) && Intrinsics.areEqual(this.datetime, favMarketQuoteEntity.datetime) && Intrinsics.areEqual(this.globalOrder, favMarketQuoteEntity.globalOrder) && Intrinsics.areEqual(this.high, favMarketQuoteEntity.high) && Intrinsics.areEqual(this.iconUrl, favMarketQuoteEntity.iconUrl) && Intrinsics.areEqual(this.lastTradedPrice, favMarketQuoteEntity.lastTradedPrice) && Intrinsics.areEqual(this.low, favMarketQuoteEntity.low) && Intrinsics.areEqual(this.marginTrade, favMarketQuoteEntity.marginTrade) && Intrinsics.areEqual(this.mark, favMarketQuoteEntity.mark) && Intrinsics.areEqual(this.market, favMarketQuoteEntity.market) && Intrinsics.areEqual(this.markets, favMarketQuoteEntity.markets) && Intrinsics.areEqual(this.open, favMarketQuoteEntity.open) && Intrinsics.areEqual(this.order, favMarketQuoteEntity.order) && Intrinsics.areEqual(this.quoteCurrency, favMarketQuoteEntity.quoteCurrency) && Intrinsics.areEqual(this.sell, favMarketQuoteEntity.sell) && Intrinsics.areEqual(this.sort, favMarketQuoteEntity.sort) && Intrinsics.areEqual(this.symbol, favMarketQuoteEntity.symbol) && Intrinsics.areEqual(this.alarm, favMarketQuoteEntity.alarm) && Intrinsics.areEqual(this.symbolCode, favMarketQuoteEntity.symbolCode) && Intrinsics.areEqual(this.trading, favMarketQuoteEntity.trading) && Intrinsics.areEqual(this.updatedTime, favMarketQuoteEntity.updatedTime) && Intrinsics.areEqual(this.coinLabel, favMarketQuoteEntity.coinLabel) && Intrinsics.areEqual(this.vol, favMarketQuoteEntity.vol) && Intrinsics.areEqual(this.volValue, favMarketQuoteEntity.volValue) && Intrinsics.areEqual(this.isMarginEnable, favMarketQuoteEntity.isMarginEnable) && Intrinsics.areEqual(this.maxIsolatedLeverageRatio, favMarketQuoteEntity.maxIsolatedLeverageRatio) && Intrinsics.areEqual(this.maxMarginLeverageRatio, favMarketQuoteEntity.maxMarginLeverageRatio) && Intrinsics.areEqual(this.buySideRatioUnifiedAccountLeverage, favMarketQuoteEntity.buySideRatioUnifiedAccountLeverage) && Intrinsics.areEqual(this.sellSideRatioUnifiedAccountLeverage, favMarketQuoteEntity.sellSideRatioUnifiedAccountLeverage);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getAskSize() {
        return this.askSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getDatetime() {
        return this.datetime;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getGlobalOrder() {
        return this.globalOrder;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getHigh() {
        return this.high;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getLastTradedPrice() {
        return this.lastTradedPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getLow() {
        return this.low;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getMarginTrade() {
        return this.marginTrade;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getMark() {
        return this.mark;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getMarket() {
        return this.market;
    }

    @Nullable
    public final List<String> component19() {
        return this.markets;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Integer getOpen() {
        return this.open;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Integer getOrder() {
        return this.order;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getSell() {
        return this.sell;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Integer getSort() {
        return this.sort;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Boolean getAlarm() {
        return this.alarm;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Boolean getTrading() {
        return this.trading;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Long getUpdatedTime() {
        return this.updatedTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getBidSize() {
        return this.bidSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getCoinLabel() {
        return this.coinLabel;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getVol() {
        return this.vol;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getVolValue() {
        return this.volValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Boolean getIsMarginEnable() {
        return this.isMarginEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Integer getMaxIsolatedLeverageRatio() {
        return this.maxIsolatedLeverageRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final Integer getMaxMarginLeverageRatio() {
        return this.maxMarginLeverageRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final Integer getBuySideRatioUnifiedAccountLeverage() {
        return this.buySideRatioUnifiedAccountLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final Integer getSellSideRatioUnifiedAccountLeverage() {
        return this.sellSideRatioUnifiedAccountLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getBoard() {
        return this.board;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBuy() {
        return this.buy;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChangePrice() {
        return this.changePrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getClose() {
        return this.close;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getCollectType() {
        return this.collectType;
    }

    @Nullable
    public final Boolean getAlarm() {
        return this.alarm;
    }

    @Nullable
    public final Integer getAskSize() {
        return this.askSize;
    }

    @Nullable
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    public final Integer getBidSize() {
        return this.bidSize;
    }

    @Nullable
    public final Integer getBoard() {
        return this.board;
    }

    @Nullable
    public final String getBuy() {
        return this.buy;
    }

    @Nullable
    public final Integer getBuySideRatioUnifiedAccountLeverage() {
        return this.buySideRatioUnifiedAccountLeverage;
    }

    @Nullable
    public final String getChangePrice() {
        return this.changePrice;
    }

    @Nullable
    public final String getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public final Integer getClose() {
        return this.close;
    }

    @Nullable
    public final String getCoinLabel() {
        return this.coinLabel;
    }

    @Nullable
    public final Integer getCollectType() {
        return this.collectType;
    }

    @Nullable
    public final Long getDatetime() {
        return this.datetime;
    }

    @Nullable
    public final Integer getGlobalOrder() {
        return this.globalOrder;
    }

    @Nullable
    public final String getHigh() {
        return this.high;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getLastTradedPrice() {
        return this.lastTradedPrice;
    }

    @Nullable
    public final String getLow() {
        return this.low;
    }

    @Nullable
    public final Boolean getMarginTrade() {
        return this.marginTrade;
    }

    @Nullable
    public final Integer getMark() {
        return this.mark;
    }

    @Nullable
    public final String getMarket() {
        return this.market;
    }

    @Nullable
    public final List<String> getMarkets() {
        return this.markets;
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
    public final Integer getOpen() {
        return this.open;
    }

    @Nullable
    public final Integer getOrder() {
        return this.order;
    }

    @Nullable
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    public final String getSell() {
        return this.sell;
    }

    @Nullable
    public final Integer getSellSideRatioUnifiedAccountLeverage() {
        return this.sellSideRatioUnifiedAccountLeverage;
    }

    @Nullable
    public final Integer getSort() {
        return this.sort;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    public final Boolean getTrading() {
        return this.trading;
    }

    @Nullable
    public final Long getUpdatedTime() {
        return this.updatedTime;
    }

    @Nullable
    public final String getVol() {
        return this.vol;
    }

    @Nullable
    public final String getVolValue() {
        return this.volValue;
    }

    public int hashCode() {
        Integer num = this.askSize;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.baseCurrency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.bidSize;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.board;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.buy;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.changePrice;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.changeRate;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.close;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.collectType;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Long l11 = this.datetime;
        int iHashCode10 = (iHashCode9 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num6 = this.globalOrder;
        int iHashCode11 = (iHashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str5 = this.high;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.iconUrl;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lastTradedPrice;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.low;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.marginTrade;
        int iHashCode16 = (iHashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num7 = this.mark;
        int iHashCode17 = (iHashCode16 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str9 = this.market;
        int iHashCode18 = (iHashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<String> list = this.markets;
        int iHashCode19 = (iHashCode18 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num8 = this.open;
        int iHashCode20 = (iHashCode19 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.order;
        int iHashCode21 = (iHashCode20 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str10 = this.quoteCurrency;
        int iHashCode22 = (iHashCode21 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.sell;
        int iHashCode23 = (iHashCode22 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num10 = this.sort;
        int iHashCode24 = (iHashCode23 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str12 = this.symbol;
        int iHashCode25 = (iHashCode24 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool2 = this.alarm;
        int iHashCode26 = (iHashCode25 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str13 = this.symbolCode;
        int iHashCode27 = (iHashCode26 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool3 = this.trading;
        int iHashCode28 = (iHashCode27 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l12 = this.updatedTime;
        int iHashCode29 = (iHashCode28 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str14 = this.coinLabel;
        int iHashCode30 = (iHashCode29 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.vol;
        int iHashCode31 = (iHashCode30 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.volValue;
        int iHashCode32 = (iHashCode31 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Boolean bool4 = this.isMarginEnable;
        int iHashCode33 = (iHashCode32 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num11 = this.maxIsolatedLeverageRatio;
        int iHashCode34 = (iHashCode33 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.maxMarginLeverageRatio;
        int iHashCode35 = (iHashCode34 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.buySideRatioUnifiedAccountLeverage;
        int iHashCode36 = (iHashCode35 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.sellSideRatioUnifiedAccountLeverage;
        return iHashCode36 + (num14 != null ? num14.hashCode() : 0);
    }

    @Nullable
    public final Boolean isMarginEnable() {
        return this.isMarginEnable;
    }

    @NotNull
    public String toString() {
        return "FavMarketQuoteEntity(askSize=" + this.askSize + ", baseCurrency=" + this.baseCurrency + ", bidSize=" + this.bidSize + ", board=" + this.board + ", buy=" + this.buy + ", changePrice=" + this.changePrice + ", changeRate=" + this.changeRate + ", close=" + this.close + ", collectType=" + this.collectType + ", datetime=" + this.datetime + ", globalOrder=" + this.globalOrder + ", high=" + this.high + ", iconUrl=" + this.iconUrl + ", lastTradedPrice=" + this.lastTradedPrice + ", low=" + this.low + ", marginTrade=" + this.marginTrade + ", mark=" + this.mark + ", market=" + this.market + ", markets=" + this.markets + ", open=" + this.open + ", order=" + this.order + ", quoteCurrency=" + this.quoteCurrency + ", sell=" + this.sell + ", sort=" + this.sort + ", symbol=" + this.symbol + ", alarm=" + this.alarm + ", symbolCode=" + this.symbolCode + ", trading=" + this.trading + ", updatedTime=" + this.updatedTime + ", coinLabel=" + this.coinLabel + ", vol=" + this.vol + ", volValue=" + this.volValue + ", isMarginEnable=" + this.isMarginEnable + ", maxIsolatedLeverageRatio=" + this.maxIsolatedLeverageRatio + ", maxMarginLeverageRatio=" + this.maxMarginLeverageRatio + ", buySideRatioUnifiedAccountLeverage=" + this.buySideRatioUnifiedAccountLeverage + ", sellSideRatioUnifiedAccountLeverage=" + this.sellSideRatioUnifiedAccountLeverage + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.askSize;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.baseCurrency);
        Integer num2 = this.bidSize;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.board;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        dest.writeString(this.buy);
        dest.writeString(this.changePrice);
        dest.writeString(this.changeRate);
        Integer num4 = this.close;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
        Integer num5 = this.collectType;
        if (num5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num5.intValue());
        }
        Long l11 = this.datetime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Integer num6 = this.globalOrder;
        if (num6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num6.intValue());
        }
        dest.writeString(this.high);
        dest.writeString(this.iconUrl);
        dest.writeString(this.lastTradedPrice);
        dest.writeString(this.low);
        Boolean bool = this.marginTrade;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num7 = this.mark;
        if (num7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num7.intValue());
        }
        dest.writeString(this.market);
        dest.writeStringList(this.markets);
        Integer num8 = this.open;
        if (num8 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num8.intValue());
        }
        Integer num9 = this.order;
        if (num9 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num9.intValue());
        }
        dest.writeString(this.quoteCurrency);
        dest.writeString(this.sell);
        Integer num10 = this.sort;
        if (num10 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num10.intValue());
        }
        dest.writeString(this.symbol);
        Boolean bool2 = this.alarm;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.symbolCode);
        Boolean bool3 = this.trading;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Long l12 = this.updatedTime;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeString(this.coinLabel);
        dest.writeString(this.vol);
        dest.writeString(this.volValue);
        Boolean bool4 = this.isMarginEnable;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Integer num11 = this.maxIsolatedLeverageRatio;
        if (num11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num11.intValue());
        }
        Integer num12 = this.maxMarginLeverageRatio;
        if (num12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num12.intValue());
        }
        Integer num13 = this.buySideRatioUnifiedAccountLeverage;
        if (num13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num13.intValue());
        }
        Integer num14 = this.sellSideRatioUnifiedAccountLeverage;
        if (num14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num14.intValue());
        }
    }

    public /* synthetic */ FavMarketQuoteEntity(Integer num, String str, Integer num2, Integer num3, String str2, String str3, String str4, Integer num4, Integer num5, Long l11, Integer num6, String str5, String str6, String str7, String str8, Boolean bool, Integer num7, String str9, List list, Integer num8, Integer num9, String str10, String str11, Integer num10, String str12, Boolean bool2, String str13, Boolean bool3, Long l12, String str14, String str15, String str16, Boolean bool4, Integer num11, Integer num12, Integer num13, Integer num14, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, num2, num3, str2, str3, str4, num4, num5, l11, num6, str5, str6, str7, str8, bool, num7, str9, list, num8, num9, str10, str11, num10, str12, bool2, str13, bool3, l12, str14, str15, str16, bool4, (i12 & 2) != 0 ? null : num11, (i12 & 4) != 0 ? null : num12, (i12 & 8) != 0 ? null : num13, (i12 & 16) != 0 ? null : num14);
    }
}
