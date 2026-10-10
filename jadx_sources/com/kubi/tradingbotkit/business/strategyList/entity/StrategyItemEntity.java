package com.kubi.tradingbotkit.business.strategyList.entity;

import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StrategyItemEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0003\bç\u0001\b\u0087\b\u0018\u00002\u00020\u0001Bí\t\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010'\u001a\u00020\n\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010@\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010A\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D\u0012\u0010\b\u0002\u0010E\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010A\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010k\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010l\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010m\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010p\u001a\u0004\u0018\u00010q\u0012\n\b\u0002\u0010r\u001a\u0004\u0018\u00010q\u0012\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010t\u001a\u00020\n¢\u0006\u0004\bu\u0010vJ\f\u0010ê\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010ë\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010zJ\f\u0010ì\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010í\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010î\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010ï\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u007fJ\f\u0010ð\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010ñ\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010zJ\u0011\u0010ò\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010zJ\f\u0010ó\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010ô\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010õ\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010ö\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010÷\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\n\u0010ø\u0001\u001a\u00020\nHÆ\u0003J\f\u0010ù\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010ú\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010û\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ü\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010ý\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0003\u0010\u0092\u0001J\f\u0010þ\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010ÿ\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010zJ\f\u0010\u0082\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u0085\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010\u0089\u0002\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u007fJ\n\u0010\u008a\u0002\u001a\u00020\nHÆ\u0003J\f\u0010\u008b\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u008d\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u008f\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0091\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010zJ\u0011\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010zJ\f\u0010\u0093\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010\u0095\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010zJ\f\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010\u0097\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010zJ\u0011\u0010\u0098\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010zJ\u0011\u0010\u0099\u0002\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u007fJ\u0011\u0010\u009a\u0002\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u007fJ\u0011\u0010\u009b\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010zJ\u0011\u0010\u009c\u0002\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u007fJ\f\u0010\u009d\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u009e\u0002\u001a\u0004\u0018\u00010<HÆ\u0003J\u0011\u0010\u009f\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010zJ\u0011\u0010 \u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010zJ\u0011\u0010¡\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010zJ\u0012\u0010¢\u0002\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010AHÆ\u0003J\u0012\u0010£\u0002\u001a\u0004\u0018\u00010DHÆ\u0003¢\u0006\u0003\u0010¸\u0001J\u0012\u0010¤\u0002\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010AHÆ\u0003J\u0011\u0010¥\u0002\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u007fJ\u0011\u0010¦\u0002\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u007fJ\f\u0010§\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010¨\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010©\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010zJ\f\u0010ª\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010«\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010¬\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u00ad\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010®\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010¯\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010°\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010±\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010²\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010³\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0012\u0010´\u0002\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0003\u0010\u0092\u0001J\u0012\u0010µ\u0002\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0003\u0010\u0092\u0001J\f\u0010¶\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010·\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010¸\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010¹\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010º\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010»\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010¼\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010½\u0002\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u007fJ\u0012\u0010¾\u0002\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0003\u0010\u0092\u0001J\u0012\u0010¿\u0002\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0003\u0010\u0092\u0001J\f\u0010À\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Á\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010Â\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010Ã\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010Ä\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010zJ\f\u0010Å\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010Æ\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010zJ\u0011\u0010Ç\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010zJ\u0011\u0010È\u0002\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u007fJ\f\u0010É\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010Ê\u0002\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u007fJ\u0011\u0010Ë\u0002\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u007fJ\f\u0010Ì\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Í\u0002\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010Î\u0002\u001a\u0004\u0018\u00010qHÆ\u0003J\f\u0010Ï\u0002\u001a\u0004\u0018\u00010qHÆ\u0003J\f\u0010Ð\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Ñ\u0002\u001a\u00020\nHÆ\u0003Jö\t\u0010Ò\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010'\u001a\u00020\n2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00109\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010@\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010A2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D2\u0010\b\u0002\u0010E\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010A2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010k\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010l\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010m\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010p\u001a\u0004\u0018\u00010q2\n\b\u0002\u0010r\u001a\u0004\u0018\u00010q2\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010t\u001a\u00020\nHÆ\u0001¢\u0006\u0003\u0010Ó\u0002J\u0015\u0010Ô\u0002\u001a\u00020\n2\t\u0010Õ\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010Ö\u0002\u001a\u00020\u001aHÖ\u0001J\n\u0010×\u0002\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bw\u0010xR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010{\u001a\u0004\by\u0010zR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b|\u0010xR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b}\u0010xR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b~\u0010xR\u0016\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u000b\n\u0003\u0010\u0080\u0001\u001a\u0004\b\t\u0010\u007fR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010xR\u0016\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u000b\n\u0002\u0010{\u001a\u0005\b\u0082\u0001\u0010zR\u0016\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u000b\n\u0002\u0010{\u001a\u0005\b\u0083\u0001\u0010zR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0085\u0001R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b\u0087\u0001\u0010\u0085\u0001R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b\u0088\u0001\u0010\u0085\u0001R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u0085\u0001R\u001d\u0010\u0014\u001a\u00020\nX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0014\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b\u008d\u0001\u0010\u0085\u0001R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u0085\u0001R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010xR\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010xR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0085\u0001R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b\u0095\u0001\u0010\u0085\u0001R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0085\u0001R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\u000b\n\u0002\u0010{\u001a\u0005\b\u0097\u0001\u0010zR\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010xR\u0014\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010xR\u0015\u0010!\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b\u009a\u0001\u0010\u0085\u0001R\u0014\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009b\u0001\u0010xR\u0014\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010xR\u0014\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009d\u0001\u0010xR\u0015\u0010%\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b\u009e\u0001\u0010\u0085\u0001R\u0016\u0010&\u001a\u0004\u0018\u00010\n¢\u0006\u000b\n\u0003\u0010\u0080\u0001\u001a\u0004\b&\u0010\u007fR\u0012\u0010'\u001a\u00020\n¢\u0006\t\n\u0000\u001a\u0005\b'\u0010\u008a\u0001R\u0015\u0010(\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b\u009f\u0001\u0010\u0085\u0001R\u0015\u0010)\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b \u0001\u0010\u0085\u0001R\u0015\u0010*\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b¡\u0001\u0010\u0085\u0001R\u0015\u0010+\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b¢\u0001\u0010\u0085\u0001R\u0014\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b£\u0001\u0010xR\u0014\u0010-\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¤\u0001\u0010xR\u0016\u0010.\u001a\u0004\u0018\u00010\u0005¢\u0006\u000b\n\u0002\u0010{\u001a\u0005\b¥\u0001\u0010zR\u0016\u0010/\u001a\u0004\u0018\u00010\u0005¢\u0006\u000b\n\u0002\u0010{\u001a\u0005\b¦\u0001\u0010zR\u0014\u00100\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b§\u0001\u0010xR\u0015\u00101\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b¨\u0001\u0010\u0085\u0001R\u0016\u00102\u001a\u0004\u0018\u00010\u0005¢\u0006\u000b\n\u0002\u0010{\u001a\u0005\b©\u0001\u0010zR\u0015\u00103\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\bª\u0001\u0010\u0085\u0001R\u0016\u00104\u001a\u0004\u0018\u00010\u0005¢\u0006\u000b\n\u0002\u0010{\u001a\u0005\b«\u0001\u0010zR\u0016\u00105\u001a\u0004\u0018\u00010\u0005¢\u0006\u000b\n\u0002\u0010{\u001a\u0005\b¬\u0001\u0010zR\u0016\u00106\u001a\u0004\u0018\u00010\n¢\u0006\u000b\n\u0003\u0010\u0080\u0001\u001a\u0004\b6\u0010\u007fR\u0016\u00107\u001a\u0004\u0018\u00010\n¢\u0006\u000b\n\u0003\u0010\u0080\u0001\u001a\u0004\b7\u0010\u007fR\u0016\u00108\u001a\u0004\u0018\u00010\u0005¢\u0006\u000b\n\u0002\u0010{\u001a\u0005\b\u00ad\u0001\u0010zR\u0017\u00109\u001a\u0004\u0018\u00010\n¢\u0006\f\n\u0003\u0010\u0080\u0001\u001a\u0005\b®\u0001\u0010\u007fR\u0015\u0010:\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b¯\u0001\u0010\u0085\u0001R\u0015\u0010;\u001a\u0004\u0018\u00010<¢\u0006\n\n\u0000\u001a\u0006\b°\u0001\u0010±\u0001R\u0016\u0010=\u001a\u0004\u0018\u00010\u0005¢\u0006\u000b\n\u0002\u0010{\u001a\u0005\b²\u0001\u0010zR\u0016\u0010>\u001a\u0004\u0018\u00010\u0005¢\u0006\u000b\n\u0002\u0010{\u001a\u0005\b³\u0001\u0010zR\u0016\u0010?\u001a\u0004\u0018\u00010\u0005¢\u0006\u000b\n\u0002\u0010{\u001a\u0005\b´\u0001\u0010zR\u001b\u0010@\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010A¢\u0006\n\n\u0000\u001a\u0006\bµ\u0001\u0010¶\u0001R\u0018\u0010C\u001a\u0004\u0018\u00010D¢\u0006\r\n\u0003\u0010¹\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R\u001b\u0010E\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010A¢\u0006\n\n\u0000\u001a\u0006\bº\u0001\u0010¶\u0001R\u0016\u0010G\u001a\u0004\u0018\u00010\n¢\u0006\u000b\n\u0003\u0010\u0080\u0001\u001a\u0004\bG\u0010\u007fR\u0016\u0010H\u001a\u0004\u0018\u00010\n¢\u0006\u000b\n\u0003\u0010\u0080\u0001\u001a\u0004\bH\u0010\u007fR\u0015\u0010I\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b»\u0001\u0010\u0085\u0001R\u0015\u0010J\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b¼\u0001\u0010\u0085\u0001R\u0016\u0010K\u001a\u0004\u0018\u00010\u0005¢\u0006\u000b\n\u0002\u0010{\u001a\u0005\b½\u0001\u0010zR\u0015\u0010L\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b¾\u0001\u0010\u0085\u0001R\u0015\u0010M\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b¿\u0001\u0010\u0085\u0001R\u0015\u0010N\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\bÀ\u0001\u0010\u0085\u0001R\u0015\u0010O\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\bÁ\u0001\u0010\u0085\u0001R\u0015\u0010P\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\bÂ\u0001\u0010\u0085\u0001R\u0015\u0010Q\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\bÃ\u0001\u0010\u0085\u0001R\u0015\u0010R\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\bÄ\u0001\u0010\u0085\u0001R\u0015\u0010S\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\bÅ\u0001\u0010\u0085\u0001R\u0015\u0010T\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\bÆ\u0001\u0010\u0085\u0001R\u0015\u0010U\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\bÇ\u0001\u0010\u0085\u0001R\u0018\u0010V\u001a\u0004\u0018\u00010\u001a¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\bÈ\u0001\u0010\u0092\u0001R\u0018\u0010W\u001a\u0004\u0018\u00010\u001a¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\bÉ\u0001\u0010\u0092\u0001R\u0015\u0010X\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\bÊ\u0001\u0010\u0085\u0001R\u0015\u0010Y\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\bË\u0001\u0010\u0085\u0001R\u0015\u0010Z\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\bÌ\u0001\u0010\u0085\u0001R\u0015\u0010[\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\bÍ\u0001\u0010\u0085\u0001R\u0015\u0010\\\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\bÎ\u0001\u0010\u0085\u0001R\u0015\u0010]\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\bÏ\u0001\u0010\u0085\u0001R\u0015\u0010^\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\bÐ\u0001\u0010\u0085\u0001R\u0017\u0010_\u001a\u0004\u0018\u00010\n¢\u0006\f\n\u0003\u0010\u0080\u0001\u001a\u0005\bÑ\u0001\u0010\u007fR\u0018\u0010`\u001a\u0004\u0018\u00010\u001a¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\bÒ\u0001\u0010\u0092\u0001R\u0018\u0010a\u001a\u0004\u0018\u00010\u001a¢\u0006\r\n\u0003\u0010\u0093\u0001\u001a\u0006\bÓ\u0001\u0010\u0092\u0001R\u0014\u0010b\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÔ\u0001\u0010xR\u0015\u0010c\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\bÕ\u0001\u0010\u0085\u0001R\u0015\u0010d\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\bÖ\u0001\u0010\u0085\u0001R\u0015\u0010e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\b×\u0001\u0010\u0085\u0001R\u0016\u0010f\u001a\u0004\u0018\u00010\u0005¢\u0006\u000b\n\u0002\u0010{\u001a\u0005\bØ\u0001\u0010zR\u0015\u0010g\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\bÙ\u0001\u0010\u0085\u0001R\u0016\u0010h\u001a\u0004\u0018\u00010\u0005¢\u0006\u000b\n\u0002\u0010{\u001a\u0005\bÚ\u0001\u0010zR\u0016\u0010i\u001a\u0004\u0018\u00010\u0005¢\u0006\u000b\n\u0002\u0010{\u001a\u0005\bÛ\u0001\u0010zR\u0016\u0010j\u001a\u0004\u0018\u00010\n¢\u0006\u000b\n\u0003\u0010\u0080\u0001\u001a\u0004\bj\u0010\u007fR\u0015\u0010k\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\bÜ\u0001\u0010\u0085\u0001R\u0016\u0010l\u001a\u0004\u0018\u00010\n¢\u0006\u000b\n\u0003\u0010\u0080\u0001\u001a\u0004\bl\u0010\u007fR\u0017\u0010m\u001a\u0004\u0018\u00010\n¢\u0006\f\n\u0003\u0010\u0080\u0001\u001a\u0005\bÝ\u0001\u0010\u007fR\u0014\u0010n\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÞ\u0001\u0010xR\u0015\u0010o\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0000\u001a\u0006\bß\u0001\u0010\u0085\u0001R \u0010p\u001a\u0004\u0018\u00010qX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bà\u0001\u0010á\u0001\"\u0006\bâ\u0001\u0010ã\u0001R \u0010r\u001a\u0004\u0018\u00010qX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bä\u0001\u0010á\u0001\"\u0006\bå\u0001\u0010ã\u0001R\u001f\u0010s\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\bæ\u0001\u0010x\"\u0006\bç\u0001\u0010è\u0001R\u001d\u0010t\u001a\u00020\nX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\bt\u0010\u008a\u0001\"\u0006\bé\u0001\u0010\u008c\u0001¨\u0006Ø\u0002"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;", "", "createBtnTipWhenEmpty", "", "id", "", "status", "name", "symbol", "isNewAipVersion", "", "newAipVersionTip", "startTime", "endTime", "totalValue", "Ljava/math/BigDecimal;", "totalCost", "realisedPnl", "totalProfit", "totalProfitRate", "isShowYearProfitRate", "yearProfitRate", "baseUnitOpen", "version", "market", "type", "", FirebaseAnalytics.Param.PRICE, "changeRate", "entryPrice", "startTimeDifference", "headImageUrl", "robotName", "avgBuyPrice", "symbolCode", "symbolName", "stopReason", "openUnitPrice", "isOpenUnit", "isRisk", "blowUpPrice", "longBlowUpPrice", "shortBlowUpPrice", "debtRate", "direction", "marginLeverage", "createdAt", "tradeTimes", JPushConstants.Geofence.KEY_INTERVAL, "amount", "investedNum", "totalSize", "nextTime", "nextTimeDifference", "isReachMaxTotalCost", "isNextExceedMaxTotalCost", "reachMaxBuyPriceCount", "hasEnoughMoney", "profitTarget", FirebaseAnalytics.Param.METHOD, "Lcom/kubi/tradingbotkit/business/strategyList/entity/Method;", "executeTimeCountdown", "changeCount7d", "changeCountTotal", "snapshots", "", "Lcom/kubi/tradingbotkit/business/strategyList/entity/Snapshot;", "currentThreshold", "", "currencyInfo", "Lcom/kubi/tradingbotkit/business/strategyList/entity/CurrencyInfo;", "isSellOnStopProfit", "isSellOnStopLoss", "minReduceValue", "maxReduceValue", "leverage", "rsi", "strategyProfitRate", "strategyProfitYearRate", "currentQty", "currentCost", "floatingAmount", "reservedMargin", "fundingRate", "fundingFee", "floatingAmountRate", "dayArbitrageNum", "totalArbitrageNum", "strategyProfit", "stopProfitPrice", "stopLossPrice", "minPrice", "maxPrice", "buyTimes", "currentBuyTimes", "meetCycleCondition", "profitPrecision", "pricePrecision", "trend", "pullBack", "up", "down", "depth", "gridProfitRatio", "buyNum", "sellNum", "isUpdated", "breakEvenPrice", "isKeep", "canReInvestment", "subUserId", "baseAmount", "couponReward", "Lcom/kubi/tradingbotkit/business/strategyList/entity/CouponReward;", "trialCoupon", "quote", "isExpand", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;ZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/math/BigDecimal;Lcom/kubi/tradingbotkit/business/strategyList/entity/Method;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Double;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/kubi/tradingbotkit/business/strategyList/entity/CouponReward;Lcom/kubi/tradingbotkit/business/strategyList/entity/CouponReward;Ljava/lang/String;Z)V", "getCreateBtnTipWhenEmpty", "()Ljava/lang/String;", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStatus", "getName", "getSymbol", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNewAipVersionTip", "getStartTime", "getEndTime", "getTotalValue", "()Ljava/math/BigDecimal;", "getTotalCost", "getRealisedPnl", "getTotalProfit", "getTotalProfitRate", "()Z", "setShowYearProfitRate", "(Z)V", "getYearProfitRate", "getBaseUnitOpen", "getVersion", "getMarket", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrice", "getChangeRate", "getEntryPrice", "getStartTimeDifference", "getHeadImageUrl", "getRobotName", "getAvgBuyPrice", "getSymbolCode", "getSymbolName", "getStopReason", "getOpenUnitPrice", "getBlowUpPrice", "getLongBlowUpPrice", "getShortBlowUpPrice", "getDebtRate", "getDirection", "getMarginLeverage", "getCreatedAt", "getTradeTimes", "getInterval", "getAmount", "getInvestedNum", "getTotalSize", "getNextTime", "getNextTimeDifference", "getReachMaxBuyPriceCount", "getHasEnoughMoney", "getProfitTarget", "getMethod", "()Lcom/kubi/tradingbotkit/business/strategyList/entity/Method;", "getExecuteTimeCountdown", "getChangeCount7d", "getChangeCountTotal", "getSnapshots", "()Ljava/util/List;", "getCurrentThreshold", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCurrencyInfo", "getMinReduceValue", "getMaxReduceValue", "getLeverage", "getRsi", "getStrategyProfitRate", "getStrategyProfitYearRate", "getCurrentQty", "getCurrentCost", "getFloatingAmount", "getReservedMargin", "getFundingRate", "getFundingFee", "getFloatingAmountRate", "getDayArbitrageNum", "getTotalArbitrageNum", "getStrategyProfit", "getStopProfitPrice", "getStopLossPrice", "getMinPrice", "getMaxPrice", "getBuyTimes", "getCurrentBuyTimes", "getMeetCycleCondition", "getProfitPrecision", "getPricePrecision", "getTrend", "getPullBack", "getUp", "getDown", "getDepth", "getGridProfitRatio", "getBuyNum", "getSellNum", "getBreakEvenPrice", "getCanReInvestment", "getSubUserId", "getBaseAmount", "getCouponReward", "()Lcom/kubi/tradingbotkit/business/strategyList/entity/CouponReward;", "setCouponReward", "(Lcom/kubi/tradingbotkit/business/strategyList/entity/CouponReward;)V", "getTrialCoupon", "setTrialCoupon", "getQuote", "setQuote", "(Ljava/lang/String;)V", "setExpand", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component77", "component78", "component79", "component80", "component81", "component82", "component83", "component84", "component85", "component86", "component87", "component88", "component89", "component90", "component91", "component92", "component93", "component94", "component95", "component96", "component97", "component98", "component99", "component100", "component101", "component102", "component103", "component104", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;ZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/math/BigDecimal;Lcom/kubi/tradingbotkit/business/strategyList/entity/Method;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Double;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/kubi/tradingbotkit/business/strategyList/entity/CouponReward;Lcom/kubi/tradingbotkit/business/strategyList/entity/CouponReward;Ljava/lang/String;Z)Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;", "equals", "other", "hashCode", "toString", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class StrategyItemEntity {

    @Nullable
    private final BigDecimal amount;

    @Nullable
    private final BigDecimal avgBuyPrice;

    @Nullable
    private final BigDecimal baseAmount;

    @Nullable
    private final BigDecimal baseUnitOpen;

    @Nullable
    private final BigDecimal blowUpPrice;

    @Nullable
    private final BigDecimal breakEvenPrice;

    @Nullable
    private final Long buyNum;

    @Nullable
    private final BigDecimal buyTimes;

    @Nullable
    private final Boolean canReInvestment;

    @Nullable
    private final Long changeCount7d;

    @Nullable
    private final Long changeCountTotal;

    @Nullable
    private final BigDecimal changeRate;

    @Nullable
    private CouponReward couponReward;

    @Nullable
    private final String createBtnTipWhenEmpty;

    @Nullable
    private final Long createdAt;

    @Nullable
    private final List<CurrencyInfo> currencyInfo;

    @Nullable
    private final BigDecimal currentBuyTimes;

    @Nullable
    private final BigDecimal currentCost;

    @Nullable
    private final BigDecimal currentQty;

    @Nullable
    private final Double currentThreshold;

    @Nullable
    private final Integer dayArbitrageNum;

    @Nullable
    private final BigDecimal debtRate;

    @Nullable
    private final Long depth;

    @Nullable
    private final String direction;

    @Nullable
    private final BigDecimal down;

    @Nullable
    private final Long endTime;

    @Nullable
    private final BigDecimal entryPrice;

    @Nullable
    private final Long executeTimeCountdown;

    @Nullable
    private final BigDecimal floatingAmount;

    @Nullable
    private final BigDecimal floatingAmountRate;

    @Nullable
    private final BigDecimal fundingFee;

    @Nullable
    private final BigDecimal fundingRate;

    @Nullable
    private final BigDecimal gridProfitRatio;

    @Nullable
    private final Boolean hasEnoughMoney;

    @Nullable
    private final String headImageUrl;

    @Nullable
    private final Long id;

    @Nullable
    private final String interval;

    @Nullable
    private final Long investedNum;
    private boolean isExpand;

    @Nullable
    private final Boolean isKeep;

    @Nullable
    private final Boolean isNewAipVersion;

    @Nullable
    private final Boolean isNextExceedMaxTotalCost;

    @Nullable
    private final Boolean isOpenUnit;

    @Nullable
    private final Boolean isReachMaxTotalCost;
    private final boolean isRisk;

    @Nullable
    private final Boolean isSellOnStopLoss;

    @Nullable
    private final Boolean isSellOnStopProfit;
    private boolean isShowYearProfitRate;

    @Nullable
    private final Boolean isUpdated;

    @Nullable
    private final Long leverage;

    @Nullable
    private final BigDecimal longBlowUpPrice;

    @Nullable
    private final String marginLeverage;

    @Nullable
    private final String market;

    @Nullable
    private final BigDecimal maxPrice;

    @Nullable
    private final BigDecimal maxReduceValue;

    @Nullable
    private final Boolean meetCycleCondition;

    @Nullable
    private final Method method;

    @Nullable
    private final BigDecimal minPrice;

    @Nullable
    private final BigDecimal minReduceValue;

    @Nullable
    private final String name;

    @Nullable
    private final String newAipVersionTip;

    @Nullable
    private final Long nextTime;

    @Nullable
    private final Long nextTimeDifference;

    @Nullable
    private final BigDecimal openUnitPrice;

    @Nullable
    private final BigDecimal price;

    @Nullable
    private final Integer pricePrecision;

    @Nullable
    private final Integer profitPrecision;

    @Nullable
    private final BigDecimal profitTarget;

    @Nullable
    private final BigDecimal pullBack;

    @Nullable
    private String quote;

    @Nullable
    private final Long reachMaxBuyPriceCount;

    @Nullable
    private final BigDecimal realisedPnl;

    @Nullable
    private final BigDecimal reservedMargin;

    @Nullable
    private final String robotName;

    @Nullable
    private final BigDecimal rsi;

    @Nullable
    private final Long sellNum;

    @Nullable
    private final BigDecimal shortBlowUpPrice;

    @Nullable
    private final List<Snapshot> snapshots;

    @Nullable
    private final Long startTime;

    @Nullable
    private final Long startTimeDifference;

    @Nullable
    private final String status;

    @Nullable
    private final BigDecimal stopLossPrice;

    @Nullable
    private final BigDecimal stopProfitPrice;

    @Nullable
    private final String stopReason;

    @Nullable
    private final BigDecimal strategyProfit;

    @Nullable
    private final BigDecimal strategyProfitRate;

    @Nullable
    private final BigDecimal strategyProfitYearRate;

    @Nullable
    private final String subUserId;

    @Nullable
    private final String symbol;

    @Nullable
    private final String symbolCode;

    @Nullable
    private final String symbolName;

    @Nullable
    private final Integer totalArbitrageNum;

    @Nullable
    private final BigDecimal totalCost;

    @Nullable
    private final BigDecimal totalProfit;

    @Nullable
    private final BigDecimal totalProfitRate;

    @Nullable
    private final BigDecimal totalSize;

    @Nullable
    private final BigDecimal totalValue;

    @Nullable
    private final Long tradeTimes;

    @Nullable
    private final String trend;

    @Nullable
    private CouponReward trialCoupon;

    @Nullable
    private final Integer type;

    @Nullable
    private final BigDecimal up;

    @Nullable
    private final String version;

    @Nullable
    private final BigDecimal yearProfitRate;

    public StrategyItemEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -1, -1, -1, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StrategyItemEntity copy$default(StrategyItemEntity strategyItemEntity, String str, Long l11, String str2, String str3, String str4, Boolean bool, String str5, Long l12, Long l13, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, boolean z11, BigDecimal bigDecimal6, BigDecimal bigDecimal7, String str6, String str7, Integer num, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, Long l14, String str8, String str9, BigDecimal bigDecimal11, String str10, String str11, String str12, BigDecimal bigDecimal12, Boolean bool2, boolean z12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, BigDecimal bigDecimal15, BigDecimal bigDecimal16, String str13, String str14, Long l15, Long l16, String str15, BigDecimal bigDecimal17, Long l17, BigDecimal bigDecimal18, Long l18, Long l19, Boolean bool3, Boolean bool4, Long l21, Boolean bool5, BigDecimal bigDecimal19, Method method, Long l22, Long l23, Long l24, List list, Double d11, List list2, Boolean bool6, Boolean bool7, BigDecimal bigDecimal20, BigDecimal bigDecimal21, Long l25, BigDecimal bigDecimal22, BigDecimal bigDecimal23, BigDecimal bigDecimal24, BigDecimal bigDecimal25, BigDecimal bigDecimal26, BigDecimal bigDecimal27, BigDecimal bigDecimal28, BigDecimal bigDecimal29, BigDecimal bigDecimal30, BigDecimal bigDecimal31, Integer num2, Integer num3, BigDecimal bigDecimal32, BigDecimal bigDecimal33, BigDecimal bigDecimal34, BigDecimal bigDecimal35, BigDecimal bigDecimal36, BigDecimal bigDecimal37, BigDecimal bigDecimal38, Boolean bool8, Integer num4, Integer num5, String str16, BigDecimal bigDecimal39, BigDecimal bigDecimal40, BigDecimal bigDecimal41, Long l26, BigDecimal bigDecimal42, Long l27, Long l28, Boolean bool9, BigDecimal bigDecimal43, Boolean bool10, Boolean bool11, String str17, BigDecimal bigDecimal44, CouponReward couponReward, CouponReward couponReward2, String str18, boolean z13, int i11, int i12, int i13, int i14, Object obj) {
        String str19 = (i11 & 1) != 0 ? strategyItemEntity.createBtnTipWhenEmpty : str;
        Long l29 = (i11 & 2) != 0 ? strategyItemEntity.id : l11;
        String str20 = (i11 & 4) != 0 ? strategyItemEntity.status : str2;
        String str21 = (i11 & 8) != 0 ? strategyItemEntity.name : str3;
        String str22 = (i11 & 16) != 0 ? strategyItemEntity.symbol : str4;
        Boolean bool12 = (i11 & 32) != 0 ? strategyItemEntity.isNewAipVersion : bool;
        String str23 = (i11 & 64) != 0 ? strategyItemEntity.newAipVersionTip : str5;
        Long l31 = (i11 & 128) != 0 ? strategyItemEntity.startTime : l12;
        Long l32 = (i11 & 256) != 0 ? strategyItemEntity.endTime : l13;
        BigDecimal bigDecimal45 = (i11 & 512) != 0 ? strategyItemEntity.totalValue : bigDecimal;
        BigDecimal bigDecimal46 = (i11 & 1024) != 0 ? strategyItemEntity.totalCost : bigDecimal2;
        String str24 = str19;
        BigDecimal bigDecimal47 = (i11 & 2048) != 0 ? strategyItemEntity.realisedPnl : bigDecimal3;
        BigDecimal bigDecimal48 = (i11 & 4096) != 0 ? strategyItemEntity.totalProfit : bigDecimal4;
        BigDecimal bigDecimal49 = (i11 & 8192) != 0 ? strategyItemEntity.totalProfitRate : bigDecimal5;
        boolean z14 = (i11 & 16384) != 0 ? strategyItemEntity.isShowYearProfitRate : z11;
        BigDecimal bigDecimal50 = (i11 & 32768) != 0 ? strategyItemEntity.yearProfitRate : bigDecimal6;
        BigDecimal bigDecimal51 = (i11 & 65536) != 0 ? strategyItemEntity.baseUnitOpen : bigDecimal7;
        String str25 = (i11 & 131072) != 0 ? strategyItemEntity.version : str6;
        String str26 = (i11 & 262144) != 0 ? strategyItemEntity.market : str7;
        Integer num6 = (i11 & 524288) != 0 ? strategyItemEntity.type : num;
        BigDecimal bigDecimal52 = (i11 & 1048576) != 0 ? strategyItemEntity.price : bigDecimal8;
        BigDecimal bigDecimal53 = (i11 & 2097152) != 0 ? strategyItemEntity.changeRate : bigDecimal9;
        BigDecimal bigDecimal54 = (i11 & 4194304) != 0 ? strategyItemEntity.entryPrice : bigDecimal10;
        Long l33 = (i11 & 8388608) != 0 ? strategyItemEntity.startTimeDifference : l14;
        String str27 = (i11 & 16777216) != 0 ? strategyItemEntity.headImageUrl : str8;
        String str28 = (i11 & 33554432) != 0 ? strategyItemEntity.robotName : str9;
        BigDecimal bigDecimal55 = (i11 & 67108864) != 0 ? strategyItemEntity.avgBuyPrice : bigDecimal11;
        String str29 = (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? strategyItemEntity.symbolCode : str10;
        String str30 = (i11 & 268435456) != 0 ? strategyItemEntity.symbolName : str11;
        String str31 = (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? strategyItemEntity.stopReason : str12;
        BigDecimal bigDecimal56 = (i11 & 1073741824) != 0 ? strategyItemEntity.openUnitPrice : bigDecimal12;
        Boolean bool13 = (i11 & Integer.MIN_VALUE) != 0 ? strategyItemEntity.isOpenUnit : bool2;
        boolean z15 = (i12 & 1) != 0 ? strategyItemEntity.isRisk : z12;
        BigDecimal bigDecimal57 = (i12 & 2) != 0 ? strategyItemEntity.blowUpPrice : bigDecimal13;
        BigDecimal bigDecimal58 = (i12 & 4) != 0 ? strategyItemEntity.longBlowUpPrice : bigDecimal14;
        BigDecimal bigDecimal59 = (i12 & 8) != 0 ? strategyItemEntity.shortBlowUpPrice : bigDecimal15;
        BigDecimal bigDecimal60 = (i12 & 16) != 0 ? strategyItemEntity.debtRate : bigDecimal16;
        String str32 = (i12 & 32) != 0 ? strategyItemEntity.direction : str13;
        String str33 = (i12 & 64) != 0 ? strategyItemEntity.marginLeverage : str14;
        Long l34 = (i12 & 128) != 0 ? strategyItemEntity.createdAt : l15;
        Long l35 = (i12 & 256) != 0 ? strategyItemEntity.tradeTimes : l16;
        String str34 = (i12 & 512) != 0 ? strategyItemEntity.interval : str15;
        BigDecimal bigDecimal61 = (i12 & 1024) != 0 ? strategyItemEntity.amount : bigDecimal17;
        Long l36 = (i12 & 2048) != 0 ? strategyItemEntity.investedNum : l17;
        BigDecimal bigDecimal62 = (i12 & 4096) != 0 ? strategyItemEntity.totalSize : bigDecimal18;
        Long l37 = (i12 & 8192) != 0 ? strategyItemEntity.nextTime : l18;
        Long l38 = (i12 & 16384) != 0 ? strategyItemEntity.nextTimeDifference : l19;
        Boolean bool14 = (i12 & 32768) != 0 ? strategyItemEntity.isReachMaxTotalCost : bool3;
        Boolean bool15 = (i12 & 65536) != 0 ? strategyItemEntity.isNextExceedMaxTotalCost : bool4;
        Long l39 = (i12 & 131072) != 0 ? strategyItemEntity.reachMaxBuyPriceCount : l21;
        Boolean bool16 = (i12 & 262144) != 0 ? strategyItemEntity.hasEnoughMoney : bool5;
        BigDecimal bigDecimal63 = (i12 & 524288) != 0 ? strategyItemEntity.profitTarget : bigDecimal19;
        Method method2 = (i12 & 1048576) != 0 ? strategyItemEntity.method : method;
        Long l41 = (i12 & 2097152) != 0 ? strategyItemEntity.executeTimeCountdown : l22;
        Long l42 = (i12 & 4194304) != 0 ? strategyItemEntity.changeCount7d : l23;
        Long l43 = (i12 & 8388608) != 0 ? strategyItemEntity.changeCountTotal : l24;
        List list3 = (i12 & 16777216) != 0 ? strategyItemEntity.snapshots : list;
        Double d12 = (i12 & 33554432) != 0 ? strategyItemEntity.currentThreshold : d11;
        List list4 = (i12 & 67108864) != 0 ? strategyItemEntity.currencyInfo : list2;
        Boolean bool17 = (i12 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? strategyItemEntity.isSellOnStopProfit : bool6;
        Boolean bool18 = (i12 & 268435456) != 0 ? strategyItemEntity.isSellOnStopLoss : bool7;
        BigDecimal bigDecimal64 = (i12 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? strategyItemEntity.minReduceValue : bigDecimal20;
        BigDecimal bigDecimal65 = (i12 & 1073741824) != 0 ? strategyItemEntity.maxReduceValue : bigDecimal21;
        return strategyItemEntity.copy(str24, l29, str20, str21, str22, bool12, str23, l31, l32, bigDecimal45, bigDecimal46, bigDecimal47, bigDecimal48, bigDecimal49, z14, bigDecimal50, bigDecimal51, str25, str26, num6, bigDecimal52, bigDecimal53, bigDecimal54, l33, str27, str28, bigDecimal55, str29, str30, str31, bigDecimal56, bool13, z15, bigDecimal57, bigDecimal58, bigDecimal59, bigDecimal60, str32, str33, l34, l35, str34, bigDecimal61, l36, bigDecimal62, l37, l38, bool14, bool15, l39, bool16, bigDecimal63, method2, l41, l42, l43, list3, d12, list4, bool17, bool18, bigDecimal64, bigDecimal65, (i12 & Integer.MIN_VALUE) != 0 ? strategyItemEntity.leverage : l25, (i13 & 1) != 0 ? strategyItemEntity.rsi : bigDecimal22, (i13 & 2) != 0 ? strategyItemEntity.strategyProfitRate : bigDecimal23, (i13 & 4) != 0 ? strategyItemEntity.strategyProfitYearRate : bigDecimal24, (i13 & 8) != 0 ? strategyItemEntity.currentQty : bigDecimal25, (i13 & 16) != 0 ? strategyItemEntity.currentCost : bigDecimal26, (i13 & 32) != 0 ? strategyItemEntity.floatingAmount : bigDecimal27, (i13 & 64) != 0 ? strategyItemEntity.reservedMargin : bigDecimal28, (i13 & 128) != 0 ? strategyItemEntity.fundingRate : bigDecimal29, (i13 & 256) != 0 ? strategyItemEntity.fundingFee : bigDecimal30, (i13 & 512) != 0 ? strategyItemEntity.floatingAmountRate : bigDecimal31, (i13 & 1024) != 0 ? strategyItemEntity.dayArbitrageNum : num2, (i13 & 2048) != 0 ? strategyItemEntity.totalArbitrageNum : num3, (i13 & 4096) != 0 ? strategyItemEntity.strategyProfit : bigDecimal32, (i13 & 8192) != 0 ? strategyItemEntity.stopProfitPrice : bigDecimal33, (i13 & 16384) != 0 ? strategyItemEntity.stopLossPrice : bigDecimal34, (i13 & 32768) != 0 ? strategyItemEntity.minPrice : bigDecimal35, (i13 & 65536) != 0 ? strategyItemEntity.maxPrice : bigDecimal36, (i13 & 131072) != 0 ? strategyItemEntity.buyTimes : bigDecimal37, (i13 & 262144) != 0 ? strategyItemEntity.currentBuyTimes : bigDecimal38, (i13 & 524288) != 0 ? strategyItemEntity.meetCycleCondition : bool8, (i13 & 1048576) != 0 ? strategyItemEntity.profitPrecision : num4, (i13 & 2097152) != 0 ? strategyItemEntity.pricePrecision : num5, (i13 & 4194304) != 0 ? strategyItemEntity.trend : str16, (i13 & 8388608) != 0 ? strategyItemEntity.pullBack : bigDecimal39, (i13 & 16777216) != 0 ? strategyItemEntity.up : bigDecimal40, (i13 & 33554432) != 0 ? strategyItemEntity.down : bigDecimal41, (i13 & 67108864) != 0 ? strategyItemEntity.depth : l26, (i13 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? strategyItemEntity.gridProfitRatio : bigDecimal42, (i13 & 268435456) != 0 ? strategyItemEntity.buyNum : l27, (i13 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? strategyItemEntity.sellNum : l28, (i13 & 1073741824) != 0 ? strategyItemEntity.isUpdated : bool9, (i13 & Integer.MIN_VALUE) != 0 ? strategyItemEntity.breakEvenPrice : bigDecimal43, (i14 & 1) != 0 ? strategyItemEntity.isKeep : bool10, (i14 & 2) != 0 ? strategyItemEntity.canReInvestment : bool11, (i14 & 4) != 0 ? strategyItemEntity.subUserId : str17, (i14 & 8) != 0 ? strategyItemEntity.baseAmount : bigDecimal44, (i14 & 16) != 0 ? strategyItemEntity.couponReward : couponReward, (i14 & 32) != 0 ? strategyItemEntity.trialCoupon : couponReward2, (i14 & 64) != 0 ? strategyItemEntity.quote : str18, (i14 & 128) != 0 ? strategyItemEntity.isExpand : z13);
    }

    @NotNull
    public final StrategyItemEntity copy(@Nullable String createBtnTipWhenEmpty, @Nullable Long id2, @Nullable String status, @Nullable String name, @Nullable String symbol, @Nullable Boolean isNewAipVersion, @Nullable String newAipVersionTip, @Nullable Long startTime, @Nullable Long endTime, @Nullable BigDecimal totalValue, @Nullable BigDecimal totalCost, @Nullable BigDecimal realisedPnl, @Nullable BigDecimal totalProfit, @Nullable BigDecimal totalProfitRate, boolean isShowYearProfitRate, @Nullable BigDecimal yearProfitRate, @Nullable BigDecimal baseUnitOpen, @Nullable String version, @Nullable String market, @Nullable Integer type, @Nullable BigDecimal price, @Nullable BigDecimal changeRate, @Nullable BigDecimal entryPrice, @Nullable Long startTimeDifference, @Nullable String headImageUrl, @Nullable String robotName, @Nullable BigDecimal avgBuyPrice, @Nullable String symbolCode, @Nullable String symbolName, @Nullable String stopReason, @Nullable BigDecimal openUnitPrice, @Nullable Boolean isOpenUnit, boolean isRisk, @Nullable BigDecimal blowUpPrice, @Nullable BigDecimal longBlowUpPrice, @Nullable BigDecimal shortBlowUpPrice, @Nullable BigDecimal debtRate, @Nullable String direction, @Nullable String marginLeverage, @Nullable Long createdAt, @Nullable Long tradeTimes, @Nullable String interval, @Nullable BigDecimal amount, @Nullable Long investedNum, @Nullable BigDecimal totalSize, @Nullable Long nextTime, @Nullable Long nextTimeDifference, @Nullable Boolean isReachMaxTotalCost, @Nullable Boolean isNextExceedMaxTotalCost, @Nullable Long reachMaxBuyPriceCount, @Nullable Boolean hasEnoughMoney, @Nullable BigDecimal profitTarget, @Nullable Method method, @Nullable Long executeTimeCountdown, @Nullable Long changeCount7d, @Nullable Long changeCountTotal, @Nullable List<Snapshot> snapshots, @Nullable Double currentThreshold, @Nullable List<CurrencyInfo> currencyInfo, @Nullable Boolean isSellOnStopProfit, @Nullable Boolean isSellOnStopLoss, @Nullable BigDecimal minReduceValue, @Nullable BigDecimal maxReduceValue, @Nullable Long leverage, @Nullable BigDecimal rsi, @Nullable BigDecimal strategyProfitRate, @Nullable BigDecimal strategyProfitYearRate, @Nullable BigDecimal currentQty, @Nullable BigDecimal currentCost, @Nullable BigDecimal floatingAmount, @Nullable BigDecimal reservedMargin, @Nullable BigDecimal fundingRate, @Nullable BigDecimal fundingFee, @Nullable BigDecimal floatingAmountRate, @Nullable Integer dayArbitrageNum, @Nullable Integer totalArbitrageNum, @Nullable BigDecimal strategyProfit, @Nullable BigDecimal stopProfitPrice, @Nullable BigDecimal stopLossPrice, @Nullable BigDecimal minPrice, @Nullable BigDecimal maxPrice, @Nullable BigDecimal buyTimes, @Nullable BigDecimal currentBuyTimes, @Nullable Boolean meetCycleCondition, @Nullable Integer profitPrecision, @Nullable Integer pricePrecision, @Nullable String trend, @Nullable BigDecimal pullBack, @Nullable BigDecimal up2, @Nullable BigDecimal down, @Nullable Long depth, @Nullable BigDecimal gridProfitRatio, @Nullable Long buyNum, @Nullable Long sellNum, @Nullable Boolean isUpdated, @Nullable BigDecimal breakEvenPrice, @Nullable Boolean isKeep, @Nullable Boolean canReInvestment, @Nullable String subUserId, @Nullable BigDecimal baseAmount, @Nullable CouponReward couponReward, @Nullable CouponReward trialCoupon, @Nullable String quote, boolean isExpand) {
        return new StrategyItemEntity(createBtnTipWhenEmpty, id2, status, name, symbol, isNewAipVersion, newAipVersionTip, startTime, endTime, totalValue, totalCost, realisedPnl, totalProfit, totalProfitRate, isShowYearProfitRate, yearProfitRate, baseUnitOpen, version, market, type, price, changeRate, entryPrice, startTimeDifference, headImageUrl, robotName, avgBuyPrice, symbolCode, symbolName, stopReason, openUnitPrice, isOpenUnit, isRisk, blowUpPrice, longBlowUpPrice, shortBlowUpPrice, debtRate, direction, marginLeverage, createdAt, tradeTimes, interval, amount, investedNum, totalSize, nextTime, nextTimeDifference, isReachMaxTotalCost, isNextExceedMaxTotalCost, reachMaxBuyPriceCount, hasEnoughMoney, profitTarget, method, executeTimeCountdown, changeCount7d, changeCountTotal, snapshots, currentThreshold, currencyInfo, isSellOnStopProfit, isSellOnStopLoss, minReduceValue, maxReduceValue, leverage, rsi, strategyProfitRate, strategyProfitYearRate, currentQty, currentCost, floatingAmount, reservedMargin, fundingRate, fundingFee, floatingAmountRate, dayArbitrageNum, totalArbitrageNum, strategyProfit, stopProfitPrice, stopLossPrice, minPrice, maxPrice, buyTimes, currentBuyTimes, meetCycleCondition, profitPrecision, pricePrecision, trend, pullBack, up2, down, depth, gridProfitRatio, buyNum, sellNum, isUpdated, breakEvenPrice, isKeep, canReInvestment, subUserId, baseAmount, couponReward, trialCoupon, quote, isExpand);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrategyItemEntity)) {
            return false;
        }
        StrategyItemEntity strategyItemEntity = (StrategyItemEntity) other;
        return Intrinsics.areEqual(this.createBtnTipWhenEmpty, strategyItemEntity.createBtnTipWhenEmpty) && Intrinsics.areEqual(this.id, strategyItemEntity.id) && Intrinsics.areEqual(this.status, strategyItemEntity.status) && Intrinsics.areEqual(this.name, strategyItemEntity.name) && Intrinsics.areEqual(this.symbol, strategyItemEntity.symbol) && Intrinsics.areEqual(this.isNewAipVersion, strategyItemEntity.isNewAipVersion) && Intrinsics.areEqual(this.newAipVersionTip, strategyItemEntity.newAipVersionTip) && Intrinsics.areEqual(this.startTime, strategyItemEntity.startTime) && Intrinsics.areEqual(this.endTime, strategyItemEntity.endTime) && Intrinsics.areEqual(this.totalValue, strategyItemEntity.totalValue) && Intrinsics.areEqual(this.totalCost, strategyItemEntity.totalCost) && Intrinsics.areEqual(this.realisedPnl, strategyItemEntity.realisedPnl) && Intrinsics.areEqual(this.totalProfit, strategyItemEntity.totalProfit) && Intrinsics.areEqual(this.totalProfitRate, strategyItemEntity.totalProfitRate) && this.isShowYearProfitRate == strategyItemEntity.isShowYearProfitRate && Intrinsics.areEqual(this.yearProfitRate, strategyItemEntity.yearProfitRate) && Intrinsics.areEqual(this.baseUnitOpen, strategyItemEntity.baseUnitOpen) && Intrinsics.areEqual(this.version, strategyItemEntity.version) && Intrinsics.areEqual(this.market, strategyItemEntity.market) && Intrinsics.areEqual(this.type, strategyItemEntity.type) && Intrinsics.areEqual(this.price, strategyItemEntity.price) && Intrinsics.areEqual(this.changeRate, strategyItemEntity.changeRate) && Intrinsics.areEqual(this.entryPrice, strategyItemEntity.entryPrice) && Intrinsics.areEqual(this.startTimeDifference, strategyItemEntity.startTimeDifference) && Intrinsics.areEqual(this.headImageUrl, strategyItemEntity.headImageUrl) && Intrinsics.areEqual(this.robotName, strategyItemEntity.robotName) && Intrinsics.areEqual(this.avgBuyPrice, strategyItemEntity.avgBuyPrice) && Intrinsics.areEqual(this.symbolCode, strategyItemEntity.symbolCode) && Intrinsics.areEqual(this.symbolName, strategyItemEntity.symbolName) && Intrinsics.areEqual(this.stopReason, strategyItemEntity.stopReason) && Intrinsics.areEqual(this.openUnitPrice, strategyItemEntity.openUnitPrice) && Intrinsics.areEqual(this.isOpenUnit, strategyItemEntity.isOpenUnit) && this.isRisk == strategyItemEntity.isRisk && Intrinsics.areEqual(this.blowUpPrice, strategyItemEntity.blowUpPrice) && Intrinsics.areEqual(this.longBlowUpPrice, strategyItemEntity.longBlowUpPrice) && Intrinsics.areEqual(this.shortBlowUpPrice, strategyItemEntity.shortBlowUpPrice) && Intrinsics.areEqual(this.debtRate, strategyItemEntity.debtRate) && Intrinsics.areEqual(this.direction, strategyItemEntity.direction) && Intrinsics.areEqual(this.marginLeverage, strategyItemEntity.marginLeverage) && Intrinsics.areEqual(this.createdAt, strategyItemEntity.createdAt) && Intrinsics.areEqual(this.tradeTimes, strategyItemEntity.tradeTimes) && Intrinsics.areEqual(this.interval, strategyItemEntity.interval) && Intrinsics.areEqual(this.amount, strategyItemEntity.amount) && Intrinsics.areEqual(this.investedNum, strategyItemEntity.investedNum) && Intrinsics.areEqual(this.totalSize, strategyItemEntity.totalSize) && Intrinsics.areEqual(this.nextTime, strategyItemEntity.nextTime) && Intrinsics.areEqual(this.nextTimeDifference, strategyItemEntity.nextTimeDifference) && Intrinsics.areEqual(this.isReachMaxTotalCost, strategyItemEntity.isReachMaxTotalCost) && Intrinsics.areEqual(this.isNextExceedMaxTotalCost, strategyItemEntity.isNextExceedMaxTotalCost) && Intrinsics.areEqual(this.reachMaxBuyPriceCount, strategyItemEntity.reachMaxBuyPriceCount) && Intrinsics.areEqual(this.hasEnoughMoney, strategyItemEntity.hasEnoughMoney) && Intrinsics.areEqual(this.profitTarget, strategyItemEntity.profitTarget) && Intrinsics.areEqual(this.method, strategyItemEntity.method) && Intrinsics.areEqual(this.executeTimeCountdown, strategyItemEntity.executeTimeCountdown) && Intrinsics.areEqual(this.changeCount7d, strategyItemEntity.changeCount7d) && Intrinsics.areEqual(this.changeCountTotal, strategyItemEntity.changeCountTotal) && Intrinsics.areEqual(this.snapshots, strategyItemEntity.snapshots) && Intrinsics.areEqual((Object) this.currentThreshold, (Object) strategyItemEntity.currentThreshold) && Intrinsics.areEqual(this.currencyInfo, strategyItemEntity.currencyInfo) && Intrinsics.areEqual(this.isSellOnStopProfit, strategyItemEntity.isSellOnStopProfit) && Intrinsics.areEqual(this.isSellOnStopLoss, strategyItemEntity.isSellOnStopLoss) && Intrinsics.areEqual(this.minReduceValue, strategyItemEntity.minReduceValue) && Intrinsics.areEqual(this.maxReduceValue, strategyItemEntity.maxReduceValue) && Intrinsics.areEqual(this.leverage, strategyItemEntity.leverage) && Intrinsics.areEqual(this.rsi, strategyItemEntity.rsi) && Intrinsics.areEqual(this.strategyProfitRate, strategyItemEntity.strategyProfitRate) && Intrinsics.areEqual(this.strategyProfitYearRate, strategyItemEntity.strategyProfitYearRate) && Intrinsics.areEqual(this.currentQty, strategyItemEntity.currentQty) && Intrinsics.areEqual(this.currentCost, strategyItemEntity.currentCost) && Intrinsics.areEqual(this.floatingAmount, strategyItemEntity.floatingAmount) && Intrinsics.areEqual(this.reservedMargin, strategyItemEntity.reservedMargin) && Intrinsics.areEqual(this.fundingRate, strategyItemEntity.fundingRate) && Intrinsics.areEqual(this.fundingFee, strategyItemEntity.fundingFee) && Intrinsics.areEqual(this.floatingAmountRate, strategyItemEntity.floatingAmountRate) && Intrinsics.areEqual(this.dayArbitrageNum, strategyItemEntity.dayArbitrageNum) && Intrinsics.areEqual(this.totalArbitrageNum, strategyItemEntity.totalArbitrageNum) && Intrinsics.areEqual(this.strategyProfit, strategyItemEntity.strategyProfit) && Intrinsics.areEqual(this.stopProfitPrice, strategyItemEntity.stopProfitPrice) && Intrinsics.areEqual(this.stopLossPrice, strategyItemEntity.stopLossPrice) && Intrinsics.areEqual(this.minPrice, strategyItemEntity.minPrice) && Intrinsics.areEqual(this.maxPrice, strategyItemEntity.maxPrice) && Intrinsics.areEqual(this.buyTimes, strategyItemEntity.buyTimes) && Intrinsics.areEqual(this.currentBuyTimes, strategyItemEntity.currentBuyTimes) && Intrinsics.areEqual(this.meetCycleCondition, strategyItemEntity.meetCycleCondition) && Intrinsics.areEqual(this.profitPrecision, strategyItemEntity.profitPrecision) && Intrinsics.areEqual(this.pricePrecision, strategyItemEntity.pricePrecision) && Intrinsics.areEqual(this.trend, strategyItemEntity.trend) && Intrinsics.areEqual(this.pullBack, strategyItemEntity.pullBack) && Intrinsics.areEqual(this.up, strategyItemEntity.up) && Intrinsics.areEqual(this.down, strategyItemEntity.down) && Intrinsics.areEqual(this.depth, strategyItemEntity.depth) && Intrinsics.areEqual(this.gridProfitRatio, strategyItemEntity.gridProfitRatio) && Intrinsics.areEqual(this.buyNum, strategyItemEntity.buyNum) && Intrinsics.areEqual(this.sellNum, strategyItemEntity.sellNum) && Intrinsics.areEqual(this.isUpdated, strategyItemEntity.isUpdated) && Intrinsics.areEqual(this.breakEvenPrice, strategyItemEntity.breakEvenPrice) && Intrinsics.areEqual(this.isKeep, strategyItemEntity.isKeep) && Intrinsics.areEqual(this.canReInvestment, strategyItemEntity.canReInvestment) && Intrinsics.areEqual(this.subUserId, strategyItemEntity.subUserId) && Intrinsics.areEqual(this.baseAmount, strategyItemEntity.baseAmount) && Intrinsics.areEqual(this.couponReward, strategyItemEntity.couponReward) && Intrinsics.areEqual(this.trialCoupon, strategyItemEntity.trialCoupon) && Intrinsics.areEqual(this.quote, strategyItemEntity.quote) && this.isExpand == strategyItemEntity.isExpand;
    }

    public int hashCode() {
        String str = this.createBtnTipWhenEmpty;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.id;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.status;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.symbol;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isNewAipVersion;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.newAipVersionTip;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l12 = this.startTime;
        int iHashCode8 = (iHashCode7 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.endTime;
        int iHashCode9 = (iHashCode8 + (l13 == null ? 0 : l13.hashCode())) * 31;
        BigDecimal bigDecimal = this.totalValue;
        int iHashCode10 = (iHashCode9 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.totalCost;
        int iHashCode11 = (iHashCode10 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.realisedPnl;
        int iHashCode12 = (iHashCode11 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.totalProfit;
        int iHashCode13 = (iHashCode12 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.totalProfitRate;
        int iHashCode14 = (((iHashCode13 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31) + Boolean.hashCode(this.isShowYearProfitRate)) * 31;
        BigDecimal bigDecimal6 = this.yearProfitRate;
        int iHashCode15 = (iHashCode14 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.baseUnitOpen;
        int iHashCode16 = (iHashCode15 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        String str6 = this.version;
        int iHashCode17 = (iHashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.market;
        int iHashCode18 = (iHashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.type;
        int iHashCode19 = (iHashCode18 + (num == null ? 0 : num.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.price;
        int iHashCode20 = (iHashCode19 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.changeRate;
        int iHashCode21 = (iHashCode20 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.entryPrice;
        int iHashCode22 = (iHashCode21 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        Long l14 = this.startTimeDifference;
        int iHashCode23 = (iHashCode22 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str8 = this.headImageUrl;
        int iHashCode24 = (iHashCode23 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.robotName;
        int iHashCode25 = (iHashCode24 + (str9 == null ? 0 : str9.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.avgBuyPrice;
        int iHashCode26 = (iHashCode25 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        String str10 = this.symbolCode;
        int iHashCode27 = (iHashCode26 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.symbolName;
        int iHashCode28 = (iHashCode27 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.stopReason;
        int iHashCode29 = (iHashCode28 + (str12 == null ? 0 : str12.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.openUnitPrice;
        int iHashCode30 = (iHashCode29 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        Boolean bool2 = this.isOpenUnit;
        int iHashCode31 = (((iHashCode30 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + Boolean.hashCode(this.isRisk)) * 31;
        BigDecimal bigDecimal13 = this.blowUpPrice;
        int iHashCode32 = (iHashCode31 + (bigDecimal13 == null ? 0 : bigDecimal13.hashCode())) * 31;
        BigDecimal bigDecimal14 = this.longBlowUpPrice;
        int iHashCode33 = (iHashCode32 + (bigDecimal14 == null ? 0 : bigDecimal14.hashCode())) * 31;
        BigDecimal bigDecimal15 = this.shortBlowUpPrice;
        int iHashCode34 = (iHashCode33 + (bigDecimal15 == null ? 0 : bigDecimal15.hashCode())) * 31;
        BigDecimal bigDecimal16 = this.debtRate;
        int iHashCode35 = (iHashCode34 + (bigDecimal16 == null ? 0 : bigDecimal16.hashCode())) * 31;
        String str13 = this.direction;
        int iHashCode36 = (iHashCode35 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.marginLeverage;
        int iHashCode37 = (iHashCode36 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Long l15 = this.createdAt;
        int iHashCode38 = (iHashCode37 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.tradeTimes;
        int iHashCode39 = (iHashCode38 + (l16 == null ? 0 : l16.hashCode())) * 31;
        String str15 = this.interval;
        int iHashCode40 = (iHashCode39 + (str15 == null ? 0 : str15.hashCode())) * 31;
        BigDecimal bigDecimal17 = this.amount;
        int iHashCode41 = (iHashCode40 + (bigDecimal17 == null ? 0 : bigDecimal17.hashCode())) * 31;
        Long l17 = this.investedNum;
        int iHashCode42 = (iHashCode41 + (l17 == null ? 0 : l17.hashCode())) * 31;
        BigDecimal bigDecimal18 = this.totalSize;
        int iHashCode43 = (iHashCode42 + (bigDecimal18 == null ? 0 : bigDecimal18.hashCode())) * 31;
        Long l18 = this.nextTime;
        int iHashCode44 = (iHashCode43 + (l18 == null ? 0 : l18.hashCode())) * 31;
        Long l19 = this.nextTimeDifference;
        int iHashCode45 = (iHashCode44 + (l19 == null ? 0 : l19.hashCode())) * 31;
        Boolean bool3 = this.isReachMaxTotalCost;
        int iHashCode46 = (iHashCode45 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isNextExceedMaxTotalCost;
        int iHashCode47 = (iHashCode46 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Long l21 = this.reachMaxBuyPriceCount;
        int iHashCode48 = (iHashCode47 + (l21 == null ? 0 : l21.hashCode())) * 31;
        Boolean bool5 = this.hasEnoughMoney;
        int iHashCode49 = (iHashCode48 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        BigDecimal bigDecimal19 = this.profitTarget;
        int iHashCode50 = (iHashCode49 + (bigDecimal19 == null ? 0 : bigDecimal19.hashCode())) * 31;
        Method method = this.method;
        int iHashCode51 = (iHashCode50 + (method == null ? 0 : method.hashCode())) * 31;
        Long l22 = this.executeTimeCountdown;
        int iHashCode52 = (iHashCode51 + (l22 == null ? 0 : l22.hashCode())) * 31;
        Long l23 = this.changeCount7d;
        int iHashCode53 = (iHashCode52 + (l23 == null ? 0 : l23.hashCode())) * 31;
        Long l24 = this.changeCountTotal;
        int iHashCode54 = (iHashCode53 + (l24 == null ? 0 : l24.hashCode())) * 31;
        List<Snapshot> list = this.snapshots;
        int iHashCode55 = (iHashCode54 + (list == null ? 0 : list.hashCode())) * 31;
        Double d11 = this.currentThreshold;
        int iHashCode56 = (iHashCode55 + (d11 == null ? 0 : d11.hashCode())) * 31;
        List<CurrencyInfo> list2 = this.currencyInfo;
        int iHashCode57 = (iHashCode56 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool6 = this.isSellOnStopProfit;
        int iHashCode58 = (iHashCode57 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.isSellOnStopLoss;
        int iHashCode59 = (iHashCode58 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        BigDecimal bigDecimal20 = this.minReduceValue;
        int iHashCode60 = (iHashCode59 + (bigDecimal20 == null ? 0 : bigDecimal20.hashCode())) * 31;
        BigDecimal bigDecimal21 = this.maxReduceValue;
        int iHashCode61 = (iHashCode60 + (bigDecimal21 == null ? 0 : bigDecimal21.hashCode())) * 31;
        Long l25 = this.leverage;
        int iHashCode62 = (iHashCode61 + (l25 == null ? 0 : l25.hashCode())) * 31;
        BigDecimal bigDecimal22 = this.rsi;
        int iHashCode63 = (iHashCode62 + (bigDecimal22 == null ? 0 : bigDecimal22.hashCode())) * 31;
        BigDecimal bigDecimal23 = this.strategyProfitRate;
        int iHashCode64 = (iHashCode63 + (bigDecimal23 == null ? 0 : bigDecimal23.hashCode())) * 31;
        BigDecimal bigDecimal24 = this.strategyProfitYearRate;
        int iHashCode65 = (iHashCode64 + (bigDecimal24 == null ? 0 : bigDecimal24.hashCode())) * 31;
        BigDecimal bigDecimal25 = this.currentQty;
        int iHashCode66 = (iHashCode65 + (bigDecimal25 == null ? 0 : bigDecimal25.hashCode())) * 31;
        BigDecimal bigDecimal26 = this.currentCost;
        int iHashCode67 = (iHashCode66 + (bigDecimal26 == null ? 0 : bigDecimal26.hashCode())) * 31;
        BigDecimal bigDecimal27 = this.floatingAmount;
        int iHashCode68 = (iHashCode67 + (bigDecimal27 == null ? 0 : bigDecimal27.hashCode())) * 31;
        BigDecimal bigDecimal28 = this.reservedMargin;
        int iHashCode69 = (iHashCode68 + (bigDecimal28 == null ? 0 : bigDecimal28.hashCode())) * 31;
        BigDecimal bigDecimal29 = this.fundingRate;
        int iHashCode70 = (iHashCode69 + (bigDecimal29 == null ? 0 : bigDecimal29.hashCode())) * 31;
        BigDecimal bigDecimal30 = this.fundingFee;
        int iHashCode71 = (iHashCode70 + (bigDecimal30 == null ? 0 : bigDecimal30.hashCode())) * 31;
        BigDecimal bigDecimal31 = this.floatingAmountRate;
        int iHashCode72 = (iHashCode71 + (bigDecimal31 == null ? 0 : bigDecimal31.hashCode())) * 31;
        Integer num2 = this.dayArbitrageNum;
        int iHashCode73 = (iHashCode72 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.totalArbitrageNum;
        int iHashCode74 = (iHashCode73 + (num3 == null ? 0 : num3.hashCode())) * 31;
        BigDecimal bigDecimal32 = this.strategyProfit;
        int iHashCode75 = (iHashCode74 + (bigDecimal32 == null ? 0 : bigDecimal32.hashCode())) * 31;
        BigDecimal bigDecimal33 = this.stopProfitPrice;
        int iHashCode76 = (iHashCode75 + (bigDecimal33 == null ? 0 : bigDecimal33.hashCode())) * 31;
        BigDecimal bigDecimal34 = this.stopLossPrice;
        int iHashCode77 = (iHashCode76 + (bigDecimal34 == null ? 0 : bigDecimal34.hashCode())) * 31;
        BigDecimal bigDecimal35 = this.minPrice;
        int iHashCode78 = (iHashCode77 + (bigDecimal35 == null ? 0 : bigDecimal35.hashCode())) * 31;
        BigDecimal bigDecimal36 = this.maxPrice;
        int iHashCode79 = (iHashCode78 + (bigDecimal36 == null ? 0 : bigDecimal36.hashCode())) * 31;
        BigDecimal bigDecimal37 = this.buyTimes;
        int iHashCode80 = (iHashCode79 + (bigDecimal37 == null ? 0 : bigDecimal37.hashCode())) * 31;
        BigDecimal bigDecimal38 = this.currentBuyTimes;
        int iHashCode81 = (iHashCode80 + (bigDecimal38 == null ? 0 : bigDecimal38.hashCode())) * 31;
        Boolean bool8 = this.meetCycleCondition;
        int iHashCode82 = (iHashCode81 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Integer num4 = this.profitPrecision;
        int iHashCode83 = (iHashCode82 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.pricePrecision;
        int iHashCode84 = (iHashCode83 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str16 = this.trend;
        int iHashCode85 = (iHashCode84 + (str16 == null ? 0 : str16.hashCode())) * 31;
        BigDecimal bigDecimal39 = this.pullBack;
        int iHashCode86 = (iHashCode85 + (bigDecimal39 == null ? 0 : bigDecimal39.hashCode())) * 31;
        BigDecimal bigDecimal40 = this.up;
        int iHashCode87 = (iHashCode86 + (bigDecimal40 == null ? 0 : bigDecimal40.hashCode())) * 31;
        BigDecimal bigDecimal41 = this.down;
        int iHashCode88 = (iHashCode87 + (bigDecimal41 == null ? 0 : bigDecimal41.hashCode())) * 31;
        Long l26 = this.depth;
        int iHashCode89 = (iHashCode88 + (l26 == null ? 0 : l26.hashCode())) * 31;
        BigDecimal bigDecimal42 = this.gridProfitRatio;
        int iHashCode90 = (iHashCode89 + (bigDecimal42 == null ? 0 : bigDecimal42.hashCode())) * 31;
        Long l27 = this.buyNum;
        int iHashCode91 = (iHashCode90 + (l27 == null ? 0 : l27.hashCode())) * 31;
        Long l28 = this.sellNum;
        int iHashCode92 = (iHashCode91 + (l28 == null ? 0 : l28.hashCode())) * 31;
        Boolean bool9 = this.isUpdated;
        int iHashCode93 = (iHashCode92 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        BigDecimal bigDecimal43 = this.breakEvenPrice;
        int iHashCode94 = (iHashCode93 + (bigDecimal43 == null ? 0 : bigDecimal43.hashCode())) * 31;
        Boolean bool10 = this.isKeep;
        int iHashCode95 = (iHashCode94 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.canReInvestment;
        int iHashCode96 = (iHashCode95 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        String str17 = this.subUserId;
        int iHashCode97 = (iHashCode96 + (str17 == null ? 0 : str17.hashCode())) * 31;
        BigDecimal bigDecimal44 = this.baseAmount;
        int iHashCode98 = (iHashCode97 + (bigDecimal44 == null ? 0 : bigDecimal44.hashCode())) * 31;
        CouponReward couponReward = this.couponReward;
        int iHashCode99 = (iHashCode98 + (couponReward == null ? 0 : couponReward.hashCode())) * 31;
        CouponReward couponReward2 = this.trialCoupon;
        int iHashCode100 = (iHashCode99 + (couponReward2 == null ? 0 : couponReward2.hashCode())) * 31;
        String str18 = this.quote;
        return ((iHashCode100 + (str18 != null ? str18.hashCode() : 0)) * 31) + Boolean.hashCode(this.isExpand);
    }

    public StrategyItemEntity(@Nullable String str, @Nullable Long l11, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable String str5, @Nullable Long l12, @Nullable Long l13, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, boolean z11, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable String str6, @Nullable String str7, @Nullable Integer num, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable Long l14, @Nullable String str8, @Nullable String str9, @Nullable BigDecimal bigDecimal11, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable BigDecimal bigDecimal12, @Nullable Boolean bool2, boolean z12, @Nullable BigDecimal bigDecimal13, @Nullable BigDecimal bigDecimal14, @Nullable BigDecimal bigDecimal15, @Nullable BigDecimal bigDecimal16, @Nullable String str13, @Nullable String str14, @Nullable Long l15, @Nullable Long l16, @Nullable String str15, @Nullable BigDecimal bigDecimal17, @Nullable Long l17, @Nullable BigDecimal bigDecimal18, @Nullable Long l18, @Nullable Long l19, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Long l21, @Nullable Boolean bool5, @Nullable BigDecimal bigDecimal19, @Nullable Method method, @Nullable Long l22, @Nullable Long l23, @Nullable Long l24, @Nullable List<Snapshot> list, @Nullable Double d11, @Nullable List<CurrencyInfo> list2, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable BigDecimal bigDecimal20, @Nullable BigDecimal bigDecimal21, @Nullable Long l25, @Nullable BigDecimal bigDecimal22, @Nullable BigDecimal bigDecimal23, @Nullable BigDecimal bigDecimal24, @Nullable BigDecimal bigDecimal25, @Nullable BigDecimal bigDecimal26, @Nullable BigDecimal bigDecimal27, @Nullable BigDecimal bigDecimal28, @Nullable BigDecimal bigDecimal29, @Nullable BigDecimal bigDecimal30, @Nullable BigDecimal bigDecimal31, @Nullable Integer num2, @Nullable Integer num3, @Nullable BigDecimal bigDecimal32, @Nullable BigDecimal bigDecimal33, @Nullable BigDecimal bigDecimal34, @Nullable BigDecimal bigDecimal35, @Nullable BigDecimal bigDecimal36, @Nullable BigDecimal bigDecimal37, @Nullable BigDecimal bigDecimal38, @Nullable Boolean bool8, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str16, @Nullable BigDecimal bigDecimal39, @Nullable BigDecimal bigDecimal40, @Nullable BigDecimal bigDecimal41, @Nullable Long l26, @Nullable BigDecimal bigDecimal42, @Nullable Long l27, @Nullable Long l28, @Nullable Boolean bool9, @Nullable BigDecimal bigDecimal43, @Nullable Boolean bool10, @Nullable Boolean bool11, @Nullable String str17, @Nullable BigDecimal bigDecimal44, @Nullable CouponReward couponReward, @Nullable CouponReward couponReward2, @Nullable String str18, boolean z13) {
        this.createBtnTipWhenEmpty = str;
        this.id = l11;
        this.status = str2;
        this.name = str3;
        this.symbol = str4;
        this.isNewAipVersion = bool;
        this.newAipVersionTip = str5;
        this.startTime = l12;
        this.endTime = l13;
        this.totalValue = bigDecimal;
        this.totalCost = bigDecimal2;
        this.realisedPnl = bigDecimal3;
        this.totalProfit = bigDecimal4;
        this.totalProfitRate = bigDecimal5;
        this.isShowYearProfitRate = z11;
        this.yearProfitRate = bigDecimal6;
        this.baseUnitOpen = bigDecimal7;
        this.version = str6;
        this.market = str7;
        this.type = num;
        this.price = bigDecimal8;
        this.changeRate = bigDecimal9;
        this.entryPrice = bigDecimal10;
        this.startTimeDifference = l14;
        this.headImageUrl = str8;
        this.robotName = str9;
        this.avgBuyPrice = bigDecimal11;
        this.symbolCode = str10;
        this.symbolName = str11;
        this.stopReason = str12;
        this.openUnitPrice = bigDecimal12;
        this.isOpenUnit = bool2;
        this.isRisk = z12;
        this.blowUpPrice = bigDecimal13;
        this.longBlowUpPrice = bigDecimal14;
        this.shortBlowUpPrice = bigDecimal15;
        this.debtRate = bigDecimal16;
        this.direction = str13;
        this.marginLeverage = str14;
        this.createdAt = l15;
        this.tradeTimes = l16;
        this.interval = str15;
        this.amount = bigDecimal17;
        this.investedNum = l17;
        this.totalSize = bigDecimal18;
        this.nextTime = l18;
        this.nextTimeDifference = l19;
        this.isReachMaxTotalCost = bool3;
        this.isNextExceedMaxTotalCost = bool4;
        this.reachMaxBuyPriceCount = l21;
        this.hasEnoughMoney = bool5;
        this.profitTarget = bigDecimal19;
        this.method = method;
        this.executeTimeCountdown = l22;
        this.changeCount7d = l23;
        this.changeCountTotal = l24;
        this.snapshots = list;
        this.currentThreshold = d11;
        this.currencyInfo = list2;
        this.isSellOnStopProfit = bool6;
        this.isSellOnStopLoss = bool7;
        this.minReduceValue = bigDecimal20;
        this.maxReduceValue = bigDecimal21;
        this.leverage = l25;
        this.rsi = bigDecimal22;
        this.strategyProfitRate = bigDecimal23;
        this.strategyProfitYearRate = bigDecimal24;
        this.currentQty = bigDecimal25;
        this.currentCost = bigDecimal26;
        this.floatingAmount = bigDecimal27;
        this.reservedMargin = bigDecimal28;
        this.fundingRate = bigDecimal29;
        this.fundingFee = bigDecimal30;
        this.floatingAmountRate = bigDecimal31;
        this.dayArbitrageNum = num2;
        this.totalArbitrageNum = num3;
        this.strategyProfit = bigDecimal32;
        this.stopProfitPrice = bigDecimal33;
        this.stopLossPrice = bigDecimal34;
        this.minPrice = bigDecimal35;
        this.maxPrice = bigDecimal36;
        this.buyTimes = bigDecimal37;
        this.currentBuyTimes = bigDecimal38;
        this.meetCycleCondition = bool8;
        this.profitPrecision = num4;
        this.pricePrecision = num5;
        this.trend = str16;
        this.pullBack = bigDecimal39;
        this.up = bigDecimal40;
        this.down = bigDecimal41;
        this.depth = l26;
        this.gridProfitRatio = bigDecimal42;
        this.buyNum = l27;
        this.sellNum = l28;
        this.isUpdated = bool9;
        this.breakEvenPrice = bigDecimal43;
        this.isKeep = bool10;
        this.canReInvestment = bool11;
        this.subUserId = str17;
        this.baseAmount = bigDecimal44;
        this.couponReward = couponReward;
        this.trialCoupon = couponReward2;
        this.quote = str18;
        this.isExpand = z13;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCreateBtnTipWhenEmpty() {
        return this.createBtnTipWhenEmpty;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getTotalValue() {
        return this.totalValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component100, reason: from getter */
    public final BigDecimal getBaseAmount() {
        return this.baseAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component101, reason: from getter */
    public final CouponReward getCouponReward() {
        return this.couponReward;
    }

    @Nullable
    /* JADX INFO: renamed from: component102, reason: from getter */
    public final CouponReward getTrialCoupon() {
        return this.trialCoupon;
    }

    @Nullable
    /* JADX INFO: renamed from: component103, reason: from getter */
    public final String getQuote() {
        return this.quote;
    }

    /* JADX INFO: renamed from: component104, reason: from getter */
    public final boolean getIsExpand() {
        return this.isExpand;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getTotalCost() {
        return this.totalCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getRealisedPnl() {
        return this.realisedPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getTotalProfit() {
        return this.totalProfit;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BigDecimal getTotalProfitRate() {
        return this.totalProfitRate;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIsShowYearProfitRate() {
        return this.isShowYearProfitRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigDecimal getYearProfitRate() {
        return this.yearProfitRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final BigDecimal getBaseUnitOpen() {
        return this.baseUnitOpen;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getMarket() {
        return this.market;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final BigDecimal getEntryPrice() {
        return this.entryPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Long getStartTimeDifference() {
        return this.startTimeDifference;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getHeadImageUrl() {
        return this.headImageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getRobotName() {
        return this.robotName;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final BigDecimal getAvgBuyPrice() {
        return this.avgBuyPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getSymbolName() {
        return this.symbolName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getStopReason() {
        return this.stopReason;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final BigDecimal getOpenUnitPrice() {
        return this.openUnitPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Boolean getIsOpenUnit() {
        return this.isOpenUnit;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final boolean getIsRisk() {
        return this.isRisk;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final BigDecimal getBlowUpPrice() {
        return this.blowUpPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final BigDecimal getLongBlowUpPrice() {
        return this.longBlowUpPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final BigDecimal getShortBlowUpPrice() {
        return this.shortBlowUpPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final BigDecimal getDebtRate() {
        return this.debtRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getMarginLeverage() {
        return this.marginLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component40, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component41, reason: from getter */
    public final Long getTradeTimes() {
        return this.tradeTimes;
    }

    @Nullable
    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getInterval() {
        return this.interval;
    }

    @Nullable
    /* JADX INFO: renamed from: component43, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component44, reason: from getter */
    public final Long getInvestedNum() {
        return this.investedNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component45, reason: from getter */
    public final BigDecimal getTotalSize() {
        return this.totalSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component46, reason: from getter */
    public final Long getNextTime() {
        return this.nextTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component47, reason: from getter */
    public final Long getNextTimeDifference() {
        return this.nextTimeDifference;
    }

    @Nullable
    /* JADX INFO: renamed from: component48, reason: from getter */
    public final Boolean getIsReachMaxTotalCost() {
        return this.isReachMaxTotalCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component49, reason: from getter */
    public final Boolean getIsNextExceedMaxTotalCost() {
        return this.isNextExceedMaxTotalCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component50, reason: from getter */
    public final Long getReachMaxBuyPriceCount() {
        return this.reachMaxBuyPriceCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component51, reason: from getter */
    public final Boolean getHasEnoughMoney() {
        return this.hasEnoughMoney;
    }

    @Nullable
    /* JADX INFO: renamed from: component52, reason: from getter */
    public final BigDecimal getProfitTarget() {
        return this.profitTarget;
    }

    @Nullable
    /* JADX INFO: renamed from: component53, reason: from getter */
    public final Method getMethod() {
        return this.method;
    }

    @Nullable
    /* JADX INFO: renamed from: component54, reason: from getter */
    public final Long getExecuteTimeCountdown() {
        return this.executeTimeCountdown;
    }

    @Nullable
    /* JADX INFO: renamed from: component55, reason: from getter */
    public final Long getChangeCount7d() {
        return this.changeCount7d;
    }

    @Nullable
    /* JADX INFO: renamed from: component56, reason: from getter */
    public final Long getChangeCountTotal() {
        return this.changeCountTotal;
    }

    @Nullable
    public final List<Snapshot> component57() {
        return this.snapshots;
    }

    @Nullable
    /* JADX INFO: renamed from: component58, reason: from getter */
    public final Double getCurrentThreshold() {
        return this.currentThreshold;
    }

    @Nullable
    public final List<CurrencyInfo> component59() {
        return this.currencyInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsNewAipVersion() {
        return this.isNewAipVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component60, reason: from getter */
    public final Boolean getIsSellOnStopProfit() {
        return this.isSellOnStopProfit;
    }

    @Nullable
    /* JADX INFO: renamed from: component61, reason: from getter */
    public final Boolean getIsSellOnStopLoss() {
        return this.isSellOnStopLoss;
    }

    @Nullable
    /* JADX INFO: renamed from: component62, reason: from getter */
    public final BigDecimal getMinReduceValue() {
        return this.minReduceValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component63, reason: from getter */
    public final BigDecimal getMaxReduceValue() {
        return this.maxReduceValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component64, reason: from getter */
    public final Long getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component65, reason: from getter */
    public final BigDecimal getRsi() {
        return this.rsi;
    }

    @Nullable
    /* JADX INFO: renamed from: component66, reason: from getter */
    public final BigDecimal getStrategyProfitRate() {
        return this.strategyProfitRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component67, reason: from getter */
    public final BigDecimal getStrategyProfitYearRate() {
        return this.strategyProfitYearRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component68, reason: from getter */
    public final BigDecimal getCurrentQty() {
        return this.currentQty;
    }

    @Nullable
    /* JADX INFO: renamed from: component69, reason: from getter */
    public final BigDecimal getCurrentCost() {
        return this.currentCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNewAipVersionTip() {
        return this.newAipVersionTip;
    }

    @Nullable
    /* JADX INFO: renamed from: component70, reason: from getter */
    public final BigDecimal getFloatingAmount() {
        return this.floatingAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component71, reason: from getter */
    public final BigDecimal getReservedMargin() {
        return this.reservedMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component72, reason: from getter */
    public final BigDecimal getFundingRate() {
        return this.fundingRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component73, reason: from getter */
    public final BigDecimal getFundingFee() {
        return this.fundingFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component74, reason: from getter */
    public final BigDecimal getFloatingAmountRate() {
        return this.floatingAmountRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component75, reason: from getter */
    public final Integer getDayArbitrageNum() {
        return this.dayArbitrageNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component76, reason: from getter */
    public final Integer getTotalArbitrageNum() {
        return this.totalArbitrageNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component77, reason: from getter */
    public final BigDecimal getStrategyProfit() {
        return this.strategyProfit;
    }

    @Nullable
    /* JADX INFO: renamed from: component78, reason: from getter */
    public final BigDecimal getStopProfitPrice() {
        return this.stopProfitPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component79, reason: from getter */
    public final BigDecimal getStopLossPrice() {
        return this.stopLossPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component80, reason: from getter */
    public final BigDecimal getMinPrice() {
        return this.minPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component81, reason: from getter */
    public final BigDecimal getMaxPrice() {
        return this.maxPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component82, reason: from getter */
    public final BigDecimal getBuyTimes() {
        return this.buyTimes;
    }

    @Nullable
    /* JADX INFO: renamed from: component83, reason: from getter */
    public final BigDecimal getCurrentBuyTimes() {
        return this.currentBuyTimes;
    }

    @Nullable
    /* JADX INFO: renamed from: component84, reason: from getter */
    public final Boolean getMeetCycleCondition() {
        return this.meetCycleCondition;
    }

    @Nullable
    /* JADX INFO: renamed from: component85, reason: from getter */
    public final Integer getProfitPrecision() {
        return this.profitPrecision;
    }

    @Nullable
    /* JADX INFO: renamed from: component86, reason: from getter */
    public final Integer getPricePrecision() {
        return this.pricePrecision;
    }

    @Nullable
    /* JADX INFO: renamed from: component87, reason: from getter */
    public final String getTrend() {
        return this.trend;
    }

    @Nullable
    /* JADX INFO: renamed from: component88, reason: from getter */
    public final BigDecimal getPullBack() {
        return this.pullBack;
    }

    @Nullable
    /* JADX INFO: renamed from: component89, reason: from getter */
    public final BigDecimal getUp() {
        return this.up;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component90, reason: from getter */
    public final BigDecimal getDown() {
        return this.down;
    }

    @Nullable
    /* JADX INFO: renamed from: component91, reason: from getter */
    public final Long getDepth() {
        return this.depth;
    }

    @Nullable
    /* JADX INFO: renamed from: component92, reason: from getter */
    public final BigDecimal getGridProfitRatio() {
        return this.gridProfitRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component93, reason: from getter */
    public final Long getBuyNum() {
        return this.buyNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component94, reason: from getter */
    public final Long getSellNum() {
        return this.sellNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component95, reason: from getter */
    public final Boolean getIsUpdated() {
        return this.isUpdated;
    }

    @Nullable
    /* JADX INFO: renamed from: component96, reason: from getter */
    public final BigDecimal getBreakEvenPrice() {
        return this.breakEvenPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component97, reason: from getter */
    public final Boolean getIsKeep() {
        return this.isKeep;
    }

    @Nullable
    /* JADX INFO: renamed from: component98, reason: from getter */
    public final Boolean getCanReInvestment() {
        return this.canReInvestment;
    }

    @Nullable
    /* JADX INFO: renamed from: component99, reason: from getter */
    public final String getSubUserId() {
        return this.subUserId;
    }

    @Nullable
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    public final BigDecimal getAvgBuyPrice() {
        return this.avgBuyPrice;
    }

    @Nullable
    public final BigDecimal getBaseAmount() {
        return this.baseAmount;
    }

    @Nullable
    public final BigDecimal getBaseUnitOpen() {
        return this.baseUnitOpen;
    }

    @Nullable
    public final BigDecimal getBlowUpPrice() {
        return this.blowUpPrice;
    }

    @Nullable
    public final BigDecimal getBreakEvenPrice() {
        return this.breakEvenPrice;
    }

    @Nullable
    public final Long getBuyNum() {
        return this.buyNum;
    }

    @Nullable
    public final BigDecimal getBuyTimes() {
        return this.buyTimes;
    }

    @Nullable
    public final Boolean getCanReInvestment() {
        return this.canReInvestment;
    }

    @Nullable
    public final Long getChangeCount7d() {
        return this.changeCount7d;
    }

    @Nullable
    public final Long getChangeCountTotal() {
        return this.changeCountTotal;
    }

    @Nullable
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public final CouponReward getCouponReward() {
        return this.couponReward;
    }

    @Nullable
    public final String getCreateBtnTipWhenEmpty() {
        return this.createBtnTipWhenEmpty;
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final List<CurrencyInfo> getCurrencyInfo() {
        return this.currencyInfo;
    }

    @Nullable
    public final BigDecimal getCurrentBuyTimes() {
        return this.currentBuyTimes;
    }

    @Nullable
    public final BigDecimal getCurrentCost() {
        return this.currentCost;
    }

    @Nullable
    public final BigDecimal getCurrentQty() {
        return this.currentQty;
    }

    @Nullable
    public final Double getCurrentThreshold() {
        return this.currentThreshold;
    }

    @Nullable
    public final Integer getDayArbitrageNum() {
        return this.dayArbitrageNum;
    }

    @Nullable
    public final BigDecimal getDebtRate() {
        return this.debtRate;
    }

    @Nullable
    public final Long getDepth() {
        return this.depth;
    }

    @Nullable
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    public final BigDecimal getDown() {
        return this.down;
    }

    @Nullable
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final BigDecimal getEntryPrice() {
        return this.entryPrice;
    }

    @Nullable
    public final Long getExecuteTimeCountdown() {
        return this.executeTimeCountdown;
    }

    @Nullable
    public final BigDecimal getFloatingAmount() {
        return this.floatingAmount;
    }

    @Nullable
    public final BigDecimal getFloatingAmountRate() {
        return this.floatingAmountRate;
    }

    @Nullable
    public final BigDecimal getFundingFee() {
        return this.fundingFee;
    }

    @Nullable
    public final BigDecimal getFundingRate() {
        return this.fundingRate;
    }

    @Nullable
    public final BigDecimal getGridProfitRatio() {
        return this.gridProfitRatio;
    }

    @Nullable
    public final Boolean getHasEnoughMoney() {
        return this.hasEnoughMoney;
    }

    @Nullable
    public final String getHeadImageUrl() {
        return this.headImageUrl;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final String getInterval() {
        return this.interval;
    }

    @Nullable
    public final Long getInvestedNum() {
        return this.investedNum;
    }

    @Nullable
    public final Long getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final BigDecimal getLongBlowUpPrice() {
        return this.longBlowUpPrice;
    }

    @Nullable
    public final String getMarginLeverage() {
        return this.marginLeverage;
    }

    @Nullable
    public final String getMarket() {
        return this.market;
    }

    @Nullable
    public final BigDecimal getMaxPrice() {
        return this.maxPrice;
    }

    @Nullable
    public final BigDecimal getMaxReduceValue() {
        return this.maxReduceValue;
    }

    @Nullable
    public final Boolean getMeetCycleCondition() {
        return this.meetCycleCondition;
    }

    @Nullable
    public final Method getMethod() {
        return this.method;
    }

    @Nullable
    public final BigDecimal getMinPrice() {
        return this.minPrice;
    }

    @Nullable
    public final BigDecimal getMinReduceValue() {
        return this.minReduceValue;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNewAipVersionTip() {
        return this.newAipVersionTip;
    }

    @Nullable
    public final Long getNextTime() {
        return this.nextTime;
    }

    @Nullable
    public final Long getNextTimeDifference() {
        return this.nextTimeDifference;
    }

    @Nullable
    public final BigDecimal getOpenUnitPrice() {
        return this.openUnitPrice;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final Integer getPricePrecision() {
        return this.pricePrecision;
    }

    @Nullable
    public final Integer getProfitPrecision() {
        return this.profitPrecision;
    }

    @Nullable
    public final BigDecimal getProfitTarget() {
        return this.profitTarget;
    }

    @Nullable
    public final BigDecimal getPullBack() {
        return this.pullBack;
    }

    @Nullable
    public final String getQuote() {
        return this.quote;
    }

    @Nullable
    public final Long getReachMaxBuyPriceCount() {
        return this.reachMaxBuyPriceCount;
    }

    @Nullable
    public final BigDecimal getRealisedPnl() {
        return this.realisedPnl;
    }

    @Nullable
    public final BigDecimal getReservedMargin() {
        return this.reservedMargin;
    }

    @Nullable
    public final String getRobotName() {
        return this.robotName;
    }

    @Nullable
    public final BigDecimal getRsi() {
        return this.rsi;
    }

    @Nullable
    public final Long getSellNum() {
        return this.sellNum;
    }

    @Nullable
    public final BigDecimal getShortBlowUpPrice() {
        return this.shortBlowUpPrice;
    }

    @Nullable
    public final List<Snapshot> getSnapshots() {
        return this.snapshots;
    }

    @Nullable
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final Long getStartTimeDifference() {
        return this.startTimeDifference;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final BigDecimal getStopLossPrice() {
        return this.stopLossPrice;
    }

    @Nullable
    public final BigDecimal getStopProfitPrice() {
        return this.stopProfitPrice;
    }

    @Nullable
    public final String getStopReason() {
        return this.stopReason;
    }

    @Nullable
    public final BigDecimal getStrategyProfit() {
        return this.strategyProfit;
    }

    @Nullable
    public final BigDecimal getStrategyProfitRate() {
        return this.strategyProfitRate;
    }

    @Nullable
    public final BigDecimal getStrategyProfitYearRate() {
        return this.strategyProfitYearRate;
    }

    @Nullable
    public final String getSubUserId() {
        return this.subUserId;
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
    public final String getSymbolName() {
        return this.symbolName;
    }

    @Nullable
    public final Integer getTotalArbitrageNum() {
        return this.totalArbitrageNum;
    }

    @Nullable
    public final BigDecimal getTotalCost() {
        return this.totalCost;
    }

    @Nullable
    public final BigDecimal getTotalProfit() {
        return this.totalProfit;
    }

    @Nullable
    public final BigDecimal getTotalProfitRate() {
        return this.totalProfitRate;
    }

    @Nullable
    public final BigDecimal getTotalSize() {
        return this.totalSize;
    }

    @Nullable
    public final BigDecimal getTotalValue() {
        return this.totalValue;
    }

    @Nullable
    public final Long getTradeTimes() {
        return this.tradeTimes;
    }

    @Nullable
    public final String getTrend() {
        return this.trend;
    }

    @Nullable
    public final CouponReward getTrialCoupon() {
        return this.trialCoupon;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final BigDecimal getUp() {
        return this.up;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    public final BigDecimal getYearProfitRate() {
        return this.yearProfitRate;
    }

    public final boolean isExpand() {
        return this.isExpand;
    }

    @Nullable
    public final Boolean isKeep() {
        return this.isKeep;
    }

    @Nullable
    public final Boolean isNewAipVersion() {
        return this.isNewAipVersion;
    }

    @Nullable
    public final Boolean isNextExceedMaxTotalCost() {
        return this.isNextExceedMaxTotalCost;
    }

    @Nullable
    public final Boolean isOpenUnit() {
        return this.isOpenUnit;
    }

    @Nullable
    public final Boolean isReachMaxTotalCost() {
        return this.isReachMaxTotalCost;
    }

    public final boolean isRisk() {
        return this.isRisk;
    }

    @Nullable
    public final Boolean isSellOnStopLoss() {
        return this.isSellOnStopLoss;
    }

    @Nullable
    public final Boolean isSellOnStopProfit() {
        return this.isSellOnStopProfit;
    }

    public final boolean isShowYearProfitRate() {
        return this.isShowYearProfitRate;
    }

    @Nullable
    public final Boolean isUpdated() {
        return this.isUpdated;
    }

    public final void setCouponReward(@Nullable CouponReward couponReward) {
        this.couponReward = couponReward;
    }

    public final void setExpand(boolean z11) {
        this.isExpand = z11;
    }

    public final void setQuote(@Nullable String str) {
        this.quote = str;
    }

    public final void setShowYearProfitRate(boolean z11) {
        this.isShowYearProfitRate = z11;
    }

    public final void setTrialCoupon(@Nullable CouponReward couponReward) {
        this.trialCoupon = couponReward;
    }

    @NotNull
    public String toString() {
        return "StrategyItemEntity(createBtnTipWhenEmpty=" + this.createBtnTipWhenEmpty + ", id=" + this.id + ", status=" + this.status + ", name=" + this.name + ", symbol=" + this.symbol + ", isNewAipVersion=" + this.isNewAipVersion + ", newAipVersionTip=" + this.newAipVersionTip + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", totalValue=" + this.totalValue + ", totalCost=" + this.totalCost + ", realisedPnl=" + this.realisedPnl + ", totalProfit=" + this.totalProfit + ", totalProfitRate=" + this.totalProfitRate + ", isShowYearProfitRate=" + this.isShowYearProfitRate + ", yearProfitRate=" + this.yearProfitRate + ", baseUnitOpen=" + this.baseUnitOpen + ", version=" + this.version + ", market=" + this.market + ", type=" + this.type + ", price=" + this.price + ", changeRate=" + this.changeRate + ", entryPrice=" + this.entryPrice + ", startTimeDifference=" + this.startTimeDifference + ", headImageUrl=" + this.headImageUrl + ", robotName=" + this.robotName + ", avgBuyPrice=" + this.avgBuyPrice + ", symbolCode=" + this.symbolCode + ", symbolName=" + this.symbolName + ", stopReason=" + this.stopReason + ", openUnitPrice=" + this.openUnitPrice + ", isOpenUnit=" + this.isOpenUnit + ", isRisk=" + this.isRisk + ", blowUpPrice=" + this.blowUpPrice + ", longBlowUpPrice=" + this.longBlowUpPrice + ", shortBlowUpPrice=" + this.shortBlowUpPrice + ", debtRate=" + this.debtRate + ", direction=" + this.direction + ", marginLeverage=" + this.marginLeverage + ", createdAt=" + this.createdAt + ", tradeTimes=" + this.tradeTimes + ", interval=" + this.interval + ", amount=" + this.amount + ", investedNum=" + this.investedNum + ", totalSize=" + this.totalSize + ", nextTime=" + this.nextTime + ", nextTimeDifference=" + this.nextTimeDifference + ", isReachMaxTotalCost=" + this.isReachMaxTotalCost + ", isNextExceedMaxTotalCost=" + this.isNextExceedMaxTotalCost + ", reachMaxBuyPriceCount=" + this.reachMaxBuyPriceCount + ", hasEnoughMoney=" + this.hasEnoughMoney + ", profitTarget=" + this.profitTarget + ", method=" + this.method + ", executeTimeCountdown=" + this.executeTimeCountdown + ", changeCount7d=" + this.changeCount7d + ", changeCountTotal=" + this.changeCountTotal + ", snapshots=" + this.snapshots + ", currentThreshold=" + this.currentThreshold + ", currencyInfo=" + this.currencyInfo + ", isSellOnStopProfit=" + this.isSellOnStopProfit + ", isSellOnStopLoss=" + this.isSellOnStopLoss + ", minReduceValue=" + this.minReduceValue + ", maxReduceValue=" + this.maxReduceValue + ", leverage=" + this.leverage + ", rsi=" + this.rsi + ", strategyProfitRate=" + this.strategyProfitRate + ", strategyProfitYearRate=" + this.strategyProfitYearRate + ", currentQty=" + this.currentQty + ", currentCost=" + this.currentCost + ", floatingAmount=" + this.floatingAmount + ", reservedMargin=" + this.reservedMargin + ", fundingRate=" + this.fundingRate + ", fundingFee=" + this.fundingFee + ", floatingAmountRate=" + this.floatingAmountRate + ", dayArbitrageNum=" + this.dayArbitrageNum + ", totalArbitrageNum=" + this.totalArbitrageNum + ", strategyProfit=" + this.strategyProfit + ", stopProfitPrice=" + this.stopProfitPrice + ", stopLossPrice=" + this.stopLossPrice + ", minPrice=" + this.minPrice + ", maxPrice=" + this.maxPrice + ", buyTimes=" + this.buyTimes + ", currentBuyTimes=" + this.currentBuyTimes + ", meetCycleCondition=" + this.meetCycleCondition + ", profitPrecision=" + this.profitPrecision + ", pricePrecision=" + this.pricePrecision + ", trend=" + this.trend + ", pullBack=" + this.pullBack + ", up=" + this.up + ", down=" + this.down + ", depth=" + this.depth + ", gridProfitRatio=" + this.gridProfitRatio + ", buyNum=" + this.buyNum + ", sellNum=" + this.sellNum + ", isUpdated=" + this.isUpdated + ", breakEvenPrice=" + this.breakEvenPrice + ", isKeep=" + this.isKeep + ", canReInvestment=" + this.canReInvestment + ", subUserId=" + this.subUserId + ", baseAmount=" + this.baseAmount + ", couponReward=" + this.couponReward + ", trialCoupon=" + this.trialCoupon + ", quote=" + this.quote + ", isExpand=" + this.isExpand + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StrategyItemEntity(String str, Long l11, String str2, String str3, String str4, Boolean bool, String str5, Long l12, Long l13, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, boolean z11, BigDecimal bigDecimal6, BigDecimal bigDecimal7, String str6, String str7, Integer num, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, Long l14, String str8, String str9, BigDecimal bigDecimal11, String str10, String str11, String str12, BigDecimal bigDecimal12, Boolean bool2, boolean z12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, BigDecimal bigDecimal15, BigDecimal bigDecimal16, String str13, String str14, Long l15, Long l16, String str15, BigDecimal bigDecimal17, Long l17, BigDecimal bigDecimal18, Long l18, Long l19, Boolean bool3, Boolean bool4, Long l21, Boolean bool5, BigDecimal bigDecimal19, Method method, Long l22, Long l23, Long l24, List list, Double d11, List list2, Boolean bool6, Boolean bool7, BigDecimal bigDecimal20, BigDecimal bigDecimal21, Long l25, BigDecimal bigDecimal22, BigDecimal bigDecimal23, BigDecimal bigDecimal24, BigDecimal bigDecimal25, BigDecimal bigDecimal26, BigDecimal bigDecimal27, BigDecimal bigDecimal28, BigDecimal bigDecimal29, BigDecimal bigDecimal30, BigDecimal bigDecimal31, Integer num2, Integer num3, BigDecimal bigDecimal32, BigDecimal bigDecimal33, BigDecimal bigDecimal34, BigDecimal bigDecimal35, BigDecimal bigDecimal36, BigDecimal bigDecimal37, BigDecimal bigDecimal38, Boolean bool8, Integer num4, Integer num5, String str16, BigDecimal bigDecimal39, BigDecimal bigDecimal40, BigDecimal bigDecimal41, Long l26, BigDecimal bigDecimal42, Long l27, Long l28, Boolean bool9, BigDecimal bigDecimal43, Boolean bool10, Boolean bool11, String str17, BigDecimal bigDecimal44, CouponReward couponReward, CouponReward couponReward2, String str18, boolean z13, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        String str19 = (i11 & 1) != 0 ? null : str;
        Long l29 = (i11 & 2) != 0 ? null : l11;
        String str20 = (i11 & 4) != 0 ? null : str2;
        String str21 = (i11 & 8) != 0 ? null : str3;
        String str22 = (i11 & 16) != 0 ? null : str4;
        Boolean bool12 = (i11 & 32) != 0 ? null : bool;
        String str23 = (i11 & 64) != 0 ? null : str5;
        Long l31 = (i11 & 128) != 0 ? null : l12;
        Long l32 = (i11 & 256) != 0 ? null : l13;
        BigDecimal bigDecimal45 = (i11 & 512) != 0 ? null : bigDecimal;
        BigDecimal bigDecimal46 = (i11 & 1024) != 0 ? null : bigDecimal2;
        BigDecimal bigDecimal47 = (i11 & 2048) != 0 ? null : bigDecimal3;
        String str24 = str19;
        BigDecimal bigDecimal48 = (i11 & 4096) != 0 ? null : bigDecimal4;
        BigDecimal bigDecimal49 = (i11 & 8192) != 0 ? null : bigDecimal5;
        boolean z14 = (i11 & 16384) != 0 ? true : z11;
        BigDecimal bigDecimal50 = (i11 & 32768) != 0 ? null : bigDecimal6;
        BigDecimal bigDecimal51 = (i11 & 65536) != 0 ? null : bigDecimal7;
        String str25 = (i11 & 131072) != 0 ? null : str6;
        String str26 = (i11 & 262144) != 0 ? null : str7;
        Integer num6 = (i11 & 524288) != 0 ? null : num;
        BigDecimal bigDecimal52 = (i11 & 1048576) != 0 ? null : bigDecimal8;
        BigDecimal bigDecimal53 = (i11 & 2097152) != 0 ? null : bigDecimal9;
        BigDecimal bigDecimal54 = (i11 & 4194304) != 0 ? null : bigDecimal10;
        Long l33 = (i11 & 8388608) != 0 ? null : l14;
        String str27 = (i11 & 16777216) != 0 ? null : str8;
        String str28 = (i11 & 33554432) != 0 ? null : str9;
        BigDecimal bigDecimal55 = (i11 & 67108864) != 0 ? null : bigDecimal11;
        String str29 = (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : str10;
        String str30 = (i11 & 268435456) != 0 ? null : str11;
        String str31 = (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : str12;
        BigDecimal bigDecimal56 = (i11 & 1073741824) != 0 ? BigDecimal.ZERO : bigDecimal12;
        Boolean bool13 = (i11 & Integer.MIN_VALUE) != 0 ? null : bool2;
        this(str24, l29, str20, str21, str22, bool12, str23, l31, l32, bigDecimal45, bigDecimal46, bigDecimal47, bigDecimal48, bigDecimal49, z14, bigDecimal50, bigDecimal51, str25, str26, num6, bigDecimal52, bigDecimal53, bigDecimal54, l33, str27, str28, bigDecimal55, str29, str30, str31, bigDecimal56, bool13, (i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : bigDecimal13, (i12 & 4) != 0 ? null : bigDecimal14, (i12 & 8) != 0 ? null : bigDecimal15, (i12 & 16) != 0 ? null : bigDecimal16, (i12 & 32) != 0 ? null : str13, (i12 & 64) != 0 ? null : str14, (i12 & 128) != 0 ? null : l15, (i12 & 256) != 0 ? null : l16, (i12 & 512) != 0 ? null : str15, (i12 & 1024) != 0 ? null : bigDecimal17, (i12 & 2048) != 0 ? null : l17, (i12 & 4096) != 0 ? null : bigDecimal18, (i12 & 8192) != 0 ? null : l18, (i12 & 16384) != 0 ? null : l19, (i12 & 32768) != 0 ? null : bool3, (i12 & 65536) != 0 ? null : bool4, (i12 & 131072) != 0 ? null : l21, (i12 & 262144) != 0 ? null : bool5, (i12 & 524288) != 0 ? null : bigDecimal19, (i12 & 1048576) != 0 ? null : method, (i12 & 2097152) != 0 ? null : l22, (i12 & 4194304) != 0 ? null : l23, (i12 & 8388608) != 0 ? null : l24, (i12 & 16777216) != 0 ? null : list, (i12 & 33554432) != 0 ? null : d11, (i12 & 67108864) != 0 ? null : list2, (i12 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : bool6, (i12 & 268435456) != 0 ? null : bool7, (i12 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : bigDecimal20, (i12 & 1073741824) != 0 ? null : bigDecimal21, (i12 & Integer.MIN_VALUE) != 0 ? null : l25, (i13 & 1) != 0 ? null : bigDecimal22, (i13 & 2) != 0 ? null : bigDecimal23, (i13 & 4) != 0 ? null : bigDecimal24, (i13 & 8) != 0 ? null : bigDecimal25, (i13 & 16) != 0 ? null : bigDecimal26, (i13 & 32) != 0 ? null : bigDecimal27, (i13 & 64) != 0 ? null : bigDecimal28, (i13 & 128) != 0 ? null : bigDecimal29, (i13 & 256) != 0 ? null : bigDecimal30, (i13 & 512) != 0 ? null : bigDecimal31, (i13 & 1024) != 0 ? null : num2, (i13 & 2048) != 0 ? null : num3, (i13 & 4096) != 0 ? null : bigDecimal32, (i13 & 8192) != 0 ? null : bigDecimal33, (i13 & 16384) != 0 ? null : bigDecimal34, (i13 & 32768) != 0 ? null : bigDecimal35, (i13 & 65536) != 0 ? null : bigDecimal36, (i13 & 131072) != 0 ? null : bigDecimal37, (i13 & 262144) != 0 ? null : bigDecimal38, (i13 & 524288) != 0 ? null : bool8, (i13 & 1048576) != 0 ? null : num4, (i13 & 2097152) != 0 ? null : num5, (i13 & 4194304) != 0 ? null : str16, (i13 & 8388608) != 0 ? null : bigDecimal39, (i13 & 16777216) != 0 ? null : bigDecimal40, (i13 & 33554432) != 0 ? null : bigDecimal41, (i13 & 67108864) != 0 ? null : l26, (i13 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : bigDecimal42, (i13 & 268435456) != 0 ? null : l27, (i13 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : l28, (i13 & 1073741824) != 0 ? null : bool9, (i13 & Integer.MIN_VALUE) != 0 ? null : bigDecimal43, (i14 & 1) != 0 ? null : bool10, (i14 & 2) != 0 ? null : bool11, (i14 & 4) != 0 ? null : str17, (i14 & 8) != 0 ? null : bigDecimal44, (i14 & 16) != 0 ? null : couponReward, (i14 & 32) != 0 ? null : couponReward2, (i14 & 64) != 0 ? null : str18, (i14 & 128) != 0 ? false : z13);
    }
}
