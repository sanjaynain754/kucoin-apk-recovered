package com.kubi.unify.entity;

import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.unify.unify.mapper.OrderMapper;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import rh0.C44095a;

/* JADX INFO: compiled from: FuturesEntity.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0003\b\u0083\u0001\n\u0002\u0018\u0002\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b2\u00103J\b\u0010\u0095\u0001\u001a\u00030\u0096\u0001J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u009b\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010?J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010NJ\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¢\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010UJ\u0011\u0010£\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010UJ\u0011\u0010¤\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010UJ\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¨\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010UJ\u0011\u0010©\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010UJ\u0011\u0010ª\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010UJ\u0011\u0010«\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010UJ\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010°\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010±\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010¶\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010º\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010?J\f\u0010»\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¼\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010À\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Á\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0094\u0004\u0010Â\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010Ã\u0001J\u0015\u0010Ä\u0001\u001a\u00020\u00122\t\u0010Å\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010Æ\u0001\u001a\u00020\bHÖ\u0001J\n\u0010Ç\u0001\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00105\"\u0004\b9\u00107R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00105\"\u0004\b;\u00107R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u00105\"\u0004\b=\u00107R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010B\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u00105\"\u0004\bD\u00107R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010F\"\u0004\bJ\u0010HR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u00105\"\u0004\bL\u00107R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010Q\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u00105\"\u0004\bS\u00107R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010X\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010X\u001a\u0004\bY\u0010U\"\u0004\bZ\u0010WR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010X\u001a\u0004\b[\u0010U\"\u0004\b\\\u0010WR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010F\"\u0004\b^\u0010HR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u00105R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b`\u00105R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010X\u001a\u0004\ba\u0010U\"\u0004\bb\u0010WR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010X\u001a\u0004\bc\u0010U\"\u0004\bd\u0010WR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010X\u001a\u0004\be\u0010U\"\u0004\bf\u0010WR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010X\u001a\u0004\bg\u0010U\"\u0004\bh\u0010WR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010F\"\u0004\bj\u0010HR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010F\"\u0004\bl\u0010HR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010F\"\u0004\bn\u0010HR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010F\"\u0004\bp\u0010HR\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u00105\"\u0004\br\u00107R\u001c\u0010!\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010F\"\u0004\bt\u0010HR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u00105\"\u0004\bv\u00107R\u001c\u0010#\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u00105\"\u0004\bx\u00107R\u001c\u0010$\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010F\"\u0004\bz\u0010HR\u001c\u0010%\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010F\"\u0004\b|\u0010HR\u001c\u0010&\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010F\"\u0004\b~\u0010HR\u001d\u0010'\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u00105\"\u0005\b\u0080\u0001\u00107R\u001e\u0010(\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u00105\"\u0005\b\u0082\u0001\u00107R\u001e\u0010)\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u00105\"\u0005\b\u0084\u0001\u00107R \u0010*\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010B\u001a\u0005\b\u0085\u0001\u0010?\"\u0005\b\u0086\u0001\u0010AR\u001e\u0010+\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u00105\"\u0005\b\u0088\u0001\u00107R\u001e\u0010,\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u00105\"\u0005\b\u008a\u0001\u00107R\u001e\u0010-\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u00105\"\u0005\b\u008c\u0001\u00107R\u001e\u0010.\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010F\"\u0005\b\u008e\u0001\u0010HR\u001e\u0010/\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u00105\"\u0005\b\u0090\u0001\u00107R\u001e\u00100\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u00105\"\u0005\b\u0092\u0001\u00107R\u001e\u00101\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u00105\"\u0005\b\u0094\u0001\u00107¨\u0006È\u0001"}, m90084d2 = {"Lcom/kubi/unify/entity/UnifyOrderEntity;", "", "tradeType", "", "orderId", "symbol", "orderType", "orderDisplayType", "", "side", "size", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.PRICE, AppsFlyerProperties.CHANNEL, "orderTime", "", "timeInForce", "postOnly", "", ViewProps.HIDDEN, "iceberg", "visibleSize", "marginMode", "positionSide", "fromReduce", "reduceOnly", "closeOrder", "shortcut", "pnl", "filledSize", "filledFunds", "fee", "feeCurrency", FirebaseAnalytics.Param.TAX, "taxCurrency", "triggerOrderId", "cancelSize", "tpTriggerPrice", "slTriggerPrice", "tpOrderPrice", "slOrderPrice", "cancelReason", "status", "triggerDirection", "slTriggerPriceType", "tpTriggerPriceType", "triggerPrice", "triggerPriceType", "eventType", "leverage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTradeType", "()Ljava/lang/String;", "setTradeType", "(Ljava/lang/String;)V", "getOrderId", "setOrderId", "getSymbol", "setSymbol", "getOrderType", "setOrderType", "getOrderDisplayType", "()Ljava/lang/Integer;", "setOrderDisplayType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSide", "setSide", "getSize", "()Ljava/math/BigDecimal;", "setSize", "(Ljava/math/BigDecimal;)V", "getPrice", "setPrice", "getChannel", "setChannel", "getOrderTime", "()Ljava/lang/Long;", "setOrderTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getTimeInForce", "setTimeInForce", "getPostOnly", "()Ljava/lang/Boolean;", "setPostOnly", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getHidden", "setHidden", "getIceberg", "setIceberg", "getVisibleSize", "setVisibleSize", "getMarginMode", "getPositionSide", "getFromReduce", "setFromReduce", "getReduceOnly", "setReduceOnly", "getCloseOrder", "setCloseOrder", "getShortcut", "setShortcut", "getPnl", "setPnl", "getFilledSize", "setFilledSize", "getFilledFunds", "setFilledFunds", "getFee", "setFee", "getFeeCurrency", "setFeeCurrency", "getTax", "setTax", "getTaxCurrency", "setTaxCurrency", "getTriggerOrderId", "setTriggerOrderId", "getCancelSize", "setCancelSize", "getTpTriggerPrice", "setTpTriggerPrice", "getSlTriggerPrice", "setSlTriggerPrice", "getTpOrderPrice", "setTpOrderPrice", "getSlOrderPrice", "setSlOrderPrice", "getCancelReason", "setCancelReason", "getStatus", "setStatus", "getTriggerDirection", "setTriggerDirection", "getSlTriggerPriceType", "setSlTriggerPriceType", "getTpTriggerPriceType", "setTpTriggerPriceType", "getTriggerPrice", "setTriggerPrice", "getTriggerPriceType", "setTriggerPriceType", "getEventType", "setEventType", "getLeverage", "setLeverage", "toOrderEntity", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/unify/entity/UnifyOrderEntity;", "equals", "other", "hashCode", "toString", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyOrderEntity {

    @Nullable
    private String cancelReason;

    @Nullable
    private BigDecimal cancelSize;

    @Nullable
    private String channel;

    @Nullable
    private Boolean closeOrder;

    @Nullable
    private String eventType;

    @Nullable
    private BigDecimal fee;

    @Nullable
    private String feeCurrency;

    @Nullable
    private BigDecimal filledFunds;

    @Nullable
    private BigDecimal filledSize;

    @Nullable
    private Boolean fromReduce;

    @Nullable
    private Boolean hidden;

    @Nullable
    private Boolean iceberg;

    @Nullable
    private String leverage;

    @Nullable
    private final String marginMode;

    @Nullable
    private Integer orderDisplayType;

    @Nullable
    private String orderId;

    @Nullable
    private Long orderTime;

    @Nullable
    private String orderType;

    @Nullable
    private BigDecimal pnl;

    @Nullable
    private final String positionSide;

    @Nullable
    private Boolean postOnly;

    @Nullable
    private BigDecimal price;

    @Nullable
    private Boolean reduceOnly;

    @Nullable
    private Boolean shortcut;

    @Nullable
    private String side;

    @Nullable
    private BigDecimal size;

    @Nullable
    private String slOrderPrice;

    @Nullable
    private BigDecimal slTriggerPrice;

    @Nullable
    private String slTriggerPriceType;

    @Nullable
    private Integer status;

    @Nullable
    private String symbol;

    @Nullable
    private BigDecimal tax;

    @Nullable
    private String taxCurrency;

    @Nullable
    private String timeInForce;

    @Nullable
    private String tpOrderPrice;

    @Nullable
    private BigDecimal tpTriggerPrice;

    @Nullable
    private String tpTriggerPriceType;

    @Nullable
    private String tradeType;

    @Nullable
    private String triggerDirection;

    @Nullable
    private String triggerOrderId;

    @Nullable
    private BigDecimal triggerPrice;

    @Nullable
    private String triggerPriceType;

    @Nullable
    private BigDecimal visibleSize;

    public UnifyOrderEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 2047, null);
    }

    @NotNull
    public final UnifyOrderEntity copy(@Nullable String tradeType, @Nullable String orderId, @Nullable String symbol, @Nullable String orderType, @Nullable Integer orderDisplayType, @Nullable String side, @Nullable BigDecimal size, @Nullable BigDecimal price, @Nullable String channel, @Nullable Long orderTime, @Nullable String timeInForce, @Nullable Boolean postOnly, @Nullable Boolean hidden, @Nullable Boolean iceberg, @Nullable BigDecimal visibleSize, @Nullable String marginMode, @Nullable String positionSide, @Nullable Boolean fromReduce, @Nullable Boolean reduceOnly, @Nullable Boolean closeOrder, @Nullable Boolean shortcut, @Nullable BigDecimal pnl, @Nullable BigDecimal filledSize, @Nullable BigDecimal filledFunds, @Nullable BigDecimal fee, @Nullable String feeCurrency, @Nullable BigDecimal tax, @Nullable String taxCurrency, @Nullable String triggerOrderId, @Nullable BigDecimal cancelSize, @Nullable BigDecimal tpTriggerPrice, @Nullable BigDecimal slTriggerPrice, @Nullable String tpOrderPrice, @Nullable String slOrderPrice, @Nullable String cancelReason, @Nullable Integer status, @Nullable String triggerDirection, @Nullable String slTriggerPriceType, @Nullable String tpTriggerPriceType, @Nullable BigDecimal triggerPrice, @Nullable String triggerPriceType, @Nullable String eventType, @Nullable String leverage) {
        return new UnifyOrderEntity(tradeType, orderId, symbol, orderType, orderDisplayType, side, size, price, channel, orderTime, timeInForce, postOnly, hidden, iceberg, visibleSize, marginMode, positionSide, fromReduce, reduceOnly, closeOrder, shortcut, pnl, filledSize, filledFunds, fee, feeCurrency, tax, taxCurrency, triggerOrderId, cancelSize, tpTriggerPrice, slTriggerPrice, tpOrderPrice, slOrderPrice, cancelReason, status, triggerDirection, slTriggerPriceType, tpTriggerPriceType, triggerPrice, triggerPriceType, eventType, leverage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifyOrderEntity)) {
            return false;
        }
        UnifyOrderEntity unifyOrderEntity = (UnifyOrderEntity) other;
        return Intrinsics.areEqual(this.tradeType, unifyOrderEntity.tradeType) && Intrinsics.areEqual(this.orderId, unifyOrderEntity.orderId) && Intrinsics.areEqual(this.symbol, unifyOrderEntity.symbol) && Intrinsics.areEqual(this.orderType, unifyOrderEntity.orderType) && Intrinsics.areEqual(this.orderDisplayType, unifyOrderEntity.orderDisplayType) && Intrinsics.areEqual(this.side, unifyOrderEntity.side) && Intrinsics.areEqual(this.size, unifyOrderEntity.size) && Intrinsics.areEqual(this.price, unifyOrderEntity.price) && Intrinsics.areEqual(this.channel, unifyOrderEntity.channel) && Intrinsics.areEqual(this.orderTime, unifyOrderEntity.orderTime) && Intrinsics.areEqual(this.timeInForce, unifyOrderEntity.timeInForce) && Intrinsics.areEqual(this.postOnly, unifyOrderEntity.postOnly) && Intrinsics.areEqual(this.hidden, unifyOrderEntity.hidden) && Intrinsics.areEqual(this.iceberg, unifyOrderEntity.iceberg) && Intrinsics.areEqual(this.visibleSize, unifyOrderEntity.visibleSize) && Intrinsics.areEqual(this.marginMode, unifyOrderEntity.marginMode) && Intrinsics.areEqual(this.positionSide, unifyOrderEntity.positionSide) && Intrinsics.areEqual(this.fromReduce, unifyOrderEntity.fromReduce) && Intrinsics.areEqual(this.reduceOnly, unifyOrderEntity.reduceOnly) && Intrinsics.areEqual(this.closeOrder, unifyOrderEntity.closeOrder) && Intrinsics.areEqual(this.shortcut, unifyOrderEntity.shortcut) && Intrinsics.areEqual(this.pnl, unifyOrderEntity.pnl) && Intrinsics.areEqual(this.filledSize, unifyOrderEntity.filledSize) && Intrinsics.areEqual(this.filledFunds, unifyOrderEntity.filledFunds) && Intrinsics.areEqual(this.fee, unifyOrderEntity.fee) && Intrinsics.areEqual(this.feeCurrency, unifyOrderEntity.feeCurrency) && Intrinsics.areEqual(this.tax, unifyOrderEntity.tax) && Intrinsics.areEqual(this.taxCurrency, unifyOrderEntity.taxCurrency) && Intrinsics.areEqual(this.triggerOrderId, unifyOrderEntity.triggerOrderId) && Intrinsics.areEqual(this.cancelSize, unifyOrderEntity.cancelSize) && Intrinsics.areEqual(this.tpTriggerPrice, unifyOrderEntity.tpTriggerPrice) && Intrinsics.areEqual(this.slTriggerPrice, unifyOrderEntity.slTriggerPrice) && Intrinsics.areEqual(this.tpOrderPrice, unifyOrderEntity.tpOrderPrice) && Intrinsics.areEqual(this.slOrderPrice, unifyOrderEntity.slOrderPrice) && Intrinsics.areEqual(this.cancelReason, unifyOrderEntity.cancelReason) && Intrinsics.areEqual(this.status, unifyOrderEntity.status) && Intrinsics.areEqual(this.triggerDirection, unifyOrderEntity.triggerDirection) && Intrinsics.areEqual(this.slTriggerPriceType, unifyOrderEntity.slTriggerPriceType) && Intrinsics.areEqual(this.tpTriggerPriceType, unifyOrderEntity.tpTriggerPriceType) && Intrinsics.areEqual(this.triggerPrice, unifyOrderEntity.triggerPrice) && Intrinsics.areEqual(this.triggerPriceType, unifyOrderEntity.triggerPriceType) && Intrinsics.areEqual(this.eventType, unifyOrderEntity.eventType) && Intrinsics.areEqual(this.leverage, unifyOrderEntity.leverage);
    }

    public int hashCode() {
        String str = this.tradeType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.symbol;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.orderType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.orderDisplayType;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.side;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal = this.size;
        int iHashCode7 = (iHashCode6 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.price;
        int iHashCode8 = (iHashCode7 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str6 = this.channel;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l11 = this.orderTime;
        int iHashCode10 = (iHashCode9 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str7 = this.timeInForce;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.postOnly;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hidden;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.iceberg;
        int iHashCode14 = (iHashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.visibleSize;
        int iHashCode15 = (iHashCode14 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str8 = this.marginMode;
        int iHashCode16 = (iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.positionSide;
        int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool4 = this.fromReduce;
        int iHashCode18 = (iHashCode17 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.reduceOnly;
        int iHashCode19 = (iHashCode18 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.closeOrder;
        int iHashCode20 = (iHashCode19 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.shortcut;
        int iHashCode21 = (iHashCode20 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.pnl;
        int iHashCode22 = (iHashCode21 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.filledSize;
        int iHashCode23 = (iHashCode22 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.filledFunds;
        int iHashCode24 = (iHashCode23 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.fee;
        int iHashCode25 = (iHashCode24 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        String str10 = this.feeCurrency;
        int iHashCode26 = (iHashCode25 + (str10 == null ? 0 : str10.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.tax;
        int iHashCode27 = (iHashCode26 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        String str11 = this.taxCurrency;
        int iHashCode28 = (iHashCode27 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.triggerOrderId;
        int iHashCode29 = (iHashCode28 + (str12 == null ? 0 : str12.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.cancelSize;
        int iHashCode30 = (iHashCode29 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.tpTriggerPrice;
        int iHashCode31 = (iHashCode30 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.slTriggerPrice;
        int iHashCode32 = (iHashCode31 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        String str13 = this.tpOrderPrice;
        int iHashCode33 = (iHashCode32 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.slOrderPrice;
        int iHashCode34 = (iHashCode33 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.cancelReason;
        int iHashCode35 = (iHashCode34 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num2 = this.status;
        int iHashCode36 = (iHashCode35 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str16 = this.triggerDirection;
        int iHashCode37 = (iHashCode36 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.slTriggerPriceType;
        int iHashCode38 = (iHashCode37 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.tpTriggerPriceType;
        int iHashCode39 = (iHashCode38 + (str18 == null ? 0 : str18.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.triggerPrice;
        int iHashCode40 = (iHashCode39 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        String str19 = this.triggerPriceType;
        int iHashCode41 = (iHashCode40 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.eventType;
        int iHashCode42 = (iHashCode41 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.leverage;
        return iHashCode42 + (str21 != null ? str21.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnifyOrderEntity(tradeType=" + this.tradeType + ", orderId=" + this.orderId + ", symbol=" + this.symbol + ", orderType=" + this.orderType + ", orderDisplayType=" + this.orderDisplayType + ", side=" + this.side + ", size=" + this.size + ", price=" + this.price + ", channel=" + this.channel + ", orderTime=" + this.orderTime + ", timeInForce=" + this.timeInForce + ", postOnly=" + this.postOnly + ", hidden=" + this.hidden + ", iceberg=" + this.iceberg + ", visibleSize=" + this.visibleSize + ", marginMode=" + this.marginMode + ", positionSide=" + this.positionSide + ", fromReduce=" + this.fromReduce + ", reduceOnly=" + this.reduceOnly + ", closeOrder=" + this.closeOrder + ", shortcut=" + this.shortcut + ", pnl=" + this.pnl + ", filledSize=" + this.filledSize + ", filledFunds=" + this.filledFunds + ", fee=" + this.fee + ", feeCurrency=" + this.feeCurrency + ", tax=" + this.tax + ", taxCurrency=" + this.taxCurrency + ", triggerOrderId=" + this.triggerOrderId + ", cancelSize=" + this.cancelSize + ", tpTriggerPrice=" + this.tpTriggerPrice + ", slTriggerPrice=" + this.slTriggerPrice + ", tpOrderPrice=" + this.tpOrderPrice + ", slOrderPrice=" + this.slOrderPrice + ", cancelReason=" + this.cancelReason + ", status=" + this.status + ", triggerDirection=" + this.triggerDirection + ", slTriggerPriceType=" + this.slTriggerPriceType + ", tpTriggerPriceType=" + this.tpTriggerPriceType + ", triggerPrice=" + this.triggerPrice + ", triggerPriceType=" + this.triggerPriceType + ", eventType=" + this.eventType + ", leverage=" + this.leverage + ')';
    }

    public UnifyOrderEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable String str5, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str6, @Nullable Long l11, @Nullable String str7, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable BigDecimal bigDecimal3, @Nullable String str8, @Nullable String str9, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable String str10, @Nullable BigDecimal bigDecimal8, @Nullable String str11, @Nullable String str12, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable BigDecimal bigDecimal11, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable Integer num2, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable BigDecimal bigDecimal12, @Nullable String str19, @Nullable String str20, @Nullable String str21) {
        this.tradeType = str;
        this.orderId = str2;
        this.symbol = str3;
        this.orderType = str4;
        this.orderDisplayType = num;
        this.side = str5;
        this.size = bigDecimal;
        this.price = bigDecimal2;
        this.channel = str6;
        this.orderTime = l11;
        this.timeInForce = str7;
        this.postOnly = bool;
        this.hidden = bool2;
        this.iceberg = bool3;
        this.visibleSize = bigDecimal3;
        this.marginMode = str8;
        this.positionSide = str9;
        this.fromReduce = bool4;
        this.reduceOnly = bool5;
        this.closeOrder = bool6;
        this.shortcut = bool7;
        this.pnl = bigDecimal4;
        this.filledSize = bigDecimal5;
        this.filledFunds = bigDecimal6;
        this.fee = bigDecimal7;
        this.feeCurrency = str10;
        this.tax = bigDecimal8;
        this.taxCurrency = str11;
        this.triggerOrderId = str12;
        this.cancelSize = bigDecimal9;
        this.tpTriggerPrice = bigDecimal10;
        this.slTriggerPrice = bigDecimal11;
        this.tpOrderPrice = str13;
        this.slOrderPrice = str14;
        this.cancelReason = str15;
        this.status = num2;
        this.triggerDirection = str16;
        this.slTriggerPriceType = str17;
        this.tpTriggerPriceType = str18;
        this.triggerPrice = bigDecimal12;
        this.triggerPriceType = str19;
        this.eventType = str20;
        this.leverage = str21;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTradeType() {
        return this.tradeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getOrderTime() {
        return this.orderTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTimeInForce() {
        return this.timeInForce;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getPostOnly() {
        return this.postOnly;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getHidden() {
        return this.hidden;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getIceberg() {
        return this.iceberg;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final BigDecimal getVisibleSize() {
        return this.visibleSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getFromReduce() {
        return this.fromReduce;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getReduceOnly() {
        return this.reduceOnly;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Boolean getCloseOrder() {
        return this.closeOrder;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getShortcut() {
        return this.shortcut;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final BigDecimal getPnl() {
        return this.pnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final BigDecimal getFilledSize() {
        return this.filledSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final BigDecimal getFilledFunds() {
        return this.filledFunds;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final BigDecimal getFee() {
        return this.fee;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getFeeCurrency() {
        return this.feeCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final BigDecimal getTax() {
        return this.tax;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getTaxCurrency() {
        return this.taxCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getTriggerOrderId() {
        return this.triggerOrderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final BigDecimal getCancelSize() {
        return this.cancelSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final BigDecimal getTpTriggerPrice() {
        return this.tpTriggerPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final BigDecimal getSlTriggerPrice() {
        return this.slTriggerPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getTpOrderPrice() {
        return this.tpOrderPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getSlOrderPrice() {
        return this.slOrderPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getCancelReason() {
        return this.cancelReason;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getTriggerDirection() {
        return this.triggerDirection;
    }

    @Nullable
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getSlTriggerPriceType() {
        return this.slTriggerPriceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getTpTriggerPriceType() {
        return this.tpTriggerPriceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    @Nullable
    /* JADX INFO: renamed from: component40, reason: from getter */
    public final BigDecimal getTriggerPrice() {
        return this.triggerPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getTriggerPriceType() {
        return this.triggerPriceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @Nullable
    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getOrderDisplayType() {
        return this.orderDisplayType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getCancelReason() {
        return this.cancelReason;
    }

    @Nullable
    public final BigDecimal getCancelSize() {
        return this.cancelSize;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final Boolean getCloseOrder() {
        return this.closeOrder;
    }

    @Nullable
    public final String getEventType() {
        return this.eventType;
    }

    @Nullable
    public final BigDecimal getFee() {
        return this.fee;
    }

    @Nullable
    public final String getFeeCurrency() {
        return this.feeCurrency;
    }

    @Nullable
    public final BigDecimal getFilledFunds() {
        return this.filledFunds;
    }

    @Nullable
    public final BigDecimal getFilledSize() {
        return this.filledSize;
    }

    @Nullable
    public final Boolean getFromReduce() {
        return this.fromReduce;
    }

    @Nullable
    public final Boolean getHidden() {
        return this.hidden;
    }

    @Nullable
    public final Boolean getIceberg() {
        return this.iceberg;
    }

    @Nullable
    public final String getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    public final Integer getOrderDisplayType() {
        return this.orderDisplayType;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final Long getOrderTime() {
        return this.orderTime;
    }

    @Nullable
    public final String getOrderType() {
        return this.orderType;
    }

    @Nullable
    public final BigDecimal getPnl() {
        return this.pnl;
    }

    @Nullable
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    public final Boolean getPostOnly() {
        return this.postOnly;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final Boolean getReduceOnly() {
        return this.reduceOnly;
    }

    @Nullable
    public final Boolean getShortcut() {
        return this.shortcut;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    public final String getSlOrderPrice() {
        return this.slOrderPrice;
    }

    @Nullable
    public final BigDecimal getSlTriggerPrice() {
        return this.slTriggerPrice;
    }

    @Nullable
    public final String getSlTriggerPriceType() {
        return this.slTriggerPriceType;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final BigDecimal getTax() {
        return this.tax;
    }

    @Nullable
    public final String getTaxCurrency() {
        return this.taxCurrency;
    }

    @Nullable
    public final String getTimeInForce() {
        return this.timeInForce;
    }

    @Nullable
    public final String getTpOrderPrice() {
        return this.tpOrderPrice;
    }

    @Nullable
    public final BigDecimal getTpTriggerPrice() {
        return this.tpTriggerPrice;
    }

    @Nullable
    public final String getTpTriggerPriceType() {
        return this.tpTriggerPriceType;
    }

    @Nullable
    public final String getTradeType() {
        return this.tradeType;
    }

    @Nullable
    public final String getTriggerDirection() {
        return this.triggerDirection;
    }

    @Nullable
    public final String getTriggerOrderId() {
        return this.triggerOrderId;
    }

    @Nullable
    public final BigDecimal getTriggerPrice() {
        return this.triggerPrice;
    }

    @Nullable
    public final String getTriggerPriceType() {
        return this.triggerPriceType;
    }

    @Nullable
    public final BigDecimal getVisibleSize() {
        return this.visibleSize;
    }

    public final void setCancelReason(@Nullable String str) {
        this.cancelReason = str;
    }

    public final void setCancelSize(@Nullable BigDecimal bigDecimal) {
        this.cancelSize = bigDecimal;
    }

    public final void setChannel(@Nullable String str) {
        this.channel = str;
    }

    public final void setCloseOrder(@Nullable Boolean bool) {
        this.closeOrder = bool;
    }

    public final void setEventType(@Nullable String str) {
        this.eventType = str;
    }

    public final void setFee(@Nullable BigDecimal bigDecimal) {
        this.fee = bigDecimal;
    }

    public final void setFeeCurrency(@Nullable String str) {
        this.feeCurrency = str;
    }

    public final void setFilledFunds(@Nullable BigDecimal bigDecimal) {
        this.filledFunds = bigDecimal;
    }

    public final void setFilledSize(@Nullable BigDecimal bigDecimal) {
        this.filledSize = bigDecimal;
    }

    public final void setFromReduce(@Nullable Boolean bool) {
        this.fromReduce = bool;
    }

    public final void setHidden(@Nullable Boolean bool) {
        this.hidden = bool;
    }

    public final void setIceberg(@Nullable Boolean bool) {
        this.iceberg = bool;
    }

    public final void setLeverage(@Nullable String str) {
        this.leverage = str;
    }

    public final void setOrderDisplayType(@Nullable Integer num) {
        this.orderDisplayType = num;
    }

    public final void setOrderId(@Nullable String str) {
        this.orderId = str;
    }

    public final void setOrderTime(@Nullable Long l11) {
        this.orderTime = l11;
    }

    public final void setOrderType(@Nullable String str) {
        this.orderType = str;
    }

    public final void setPnl(@Nullable BigDecimal bigDecimal) {
        this.pnl = bigDecimal;
    }

    public final void setPostOnly(@Nullable Boolean bool) {
        this.postOnly = bool;
    }

    public final void setPrice(@Nullable BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }

    public final void setReduceOnly(@Nullable Boolean bool) {
        this.reduceOnly = bool;
    }

    public final void setShortcut(@Nullable Boolean bool) {
        this.shortcut = bool;
    }

    public final void setSide(@Nullable String str) {
        this.side = str;
    }

    public final void setSize(@Nullable BigDecimal bigDecimal) {
        this.size = bigDecimal;
    }

    public final void setSlOrderPrice(@Nullable String str) {
        this.slOrderPrice = str;
    }

    public final void setSlTriggerPrice(@Nullable BigDecimal bigDecimal) {
        this.slTriggerPrice = bigDecimal;
    }

    public final void setSlTriggerPriceType(@Nullable String str) {
        this.slTriggerPriceType = str;
    }

    public final void setStatus(@Nullable Integer num) {
        this.status = num;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setTax(@Nullable BigDecimal bigDecimal) {
        this.tax = bigDecimal;
    }

    public final void setTaxCurrency(@Nullable String str) {
        this.taxCurrency = str;
    }

    public final void setTimeInForce(@Nullable String str) {
        this.timeInForce = str;
    }

    public final void setTpOrderPrice(@Nullable String str) {
        this.tpOrderPrice = str;
    }

    public final void setTpTriggerPrice(@Nullable BigDecimal bigDecimal) {
        this.tpTriggerPrice = bigDecimal;
    }

    public final void setTpTriggerPriceType(@Nullable String str) {
        this.tpTriggerPriceType = str;
    }

    public final void setTradeType(@Nullable String str) {
        this.tradeType = str;
    }

    public final void setTriggerDirection(@Nullable String str) {
        this.triggerDirection = str;
    }

    public final void setTriggerOrderId(@Nullable String str) {
        this.triggerOrderId = str;
    }

    public final void setTriggerPrice(@Nullable BigDecimal bigDecimal) {
        this.triggerPrice = bigDecimal;
    }

    public final void setTriggerPriceType(@Nullable String str) {
        this.triggerPriceType = str;
    }

    public final void setVisibleSize(@Nullable BigDecimal bigDecimal) {
        this.visibleSize = bigDecimal;
    }

    @NotNull
    public final OrderEntity toOrderEntity() {
        return ((OrderMapper) C44095a.m97166c(OrderMapper.class)).toOrderEntity(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UnifyOrderEntity(String str, String str2, String str3, String str4, Integer num, String str5, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str6, Long l11, String str7, Boolean bool, Boolean bool2, Boolean bool3, BigDecimal bigDecimal3, String str8, String str9, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, String str10, BigDecimal bigDecimal8, String str11, String str12, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, String str13, String str14, String str15, Integer num2, String str16, String str17, String str18, BigDecimal bigDecimal12, String str19, String str20, String str21, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        String str22 = (i11 & 1) != 0 ? null : str;
        this(str22, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : bigDecimal, (i11 & 128) != 0 ? null : bigDecimal2, (i11 & 256) != 0 ? null : str6, (i11 & 512) != 0 ? null : l11, (i11 & 1024) != 0 ? null : str7, (i11 & 2048) != 0 ? null : bool, (i11 & 4096) != 0 ? null : bool2, (i11 & 8192) != 0 ? null : bool3, (i11 & 16384) != 0 ? null : bigDecimal3, (i11 & 32768) != 0 ? null : str8, (i11 & 65536) != 0 ? null : str9, (i11 & 131072) != 0 ? null : bool4, (i11 & 262144) != 0 ? null : bool5, (i11 & 524288) != 0 ? null : bool6, (i11 & 1048576) != 0 ? null : bool7, (i11 & 2097152) != 0 ? null : bigDecimal4, (i11 & 4194304) != 0 ? null : bigDecimal5, (i11 & 8388608) != 0 ? null : bigDecimal6, (i11 & 16777216) != 0 ? null : bigDecimal7, (i11 & 33554432) != 0 ? null : str10, (i11 & 67108864) != 0 ? null : bigDecimal8, (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : str11, (i11 & 268435456) != 0 ? null : str12, (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : bigDecimal9, (i11 & 1073741824) != 0 ? null : bigDecimal10, (i11 & Integer.MIN_VALUE) != 0 ? null : bigDecimal11, (i12 & 1) != 0 ? null : str13, (i12 & 2) != 0 ? null : str14, (i12 & 4) != 0 ? null : str15, (i12 & 8) != 0 ? null : num2, (i12 & 16) != 0 ? null : str16, (i12 & 32) != 0 ? null : str17, (i12 & 64) != 0 ? null : str18, (i12 & 128) != 0 ? null : bigDecimal12, (i12 & 256) != 0 ? null : str19, (i12 & 512) != 0 ? null : str20, (i12 & 1024) != 0 ? null : str21);
    }
}
