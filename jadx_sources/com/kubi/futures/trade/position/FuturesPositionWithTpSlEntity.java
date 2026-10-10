package com.kubi.futures.trade.position;

import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.data.trade.model.PositionTrialEntity;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesPositionAggregateManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bu\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bå\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u0006\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u00108\u001a\u000209\u0012\b\b\u0002\u0010:\u001a\u00020;¢\u0006\u0004\b<\u0010=J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010{\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010AJ\u0010\u0010|\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010AJ\u0010\u0010}\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010EJ\u000b\u0010~\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010EJ\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0006HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010'HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\n\u0010ª\u0001\u001a\u000209HÆ\u0003J\n\u0010«\u0001\u001a\u00020;HÆ\u0003Jî\u0004\u0010¬\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010$\u001a\u00020\u00062\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010:\u001a\u00020;HÆ\u0001¢\u0006\u0003\u0010\u00ad\u0001J\u0015\u0010®\u0001\u001a\u00020\u00062\t\u0010¯\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010°\u0001\u001a\u00030±\u0001HÖ\u0001J\n\u0010²\u0001\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010?R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010B\u001a\u0004\b\u0005\u0010AR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010B\u001a\u0004\bC\u0010AR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010F\u001a\u0004\bD\u0010ER\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bI\u0010HR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010HR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bK\u0010HR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bL\u0010HR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bM\u0010HR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bN\u0010HR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bO\u0010HR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010F\u001a\u0004\bP\u0010ER\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010HR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bR\u0010HR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bS\u0010HR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bT\u0010HR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bU\u0010HR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bV\u0010HR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bW\u0010HR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bX\u0010HR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bY\u0010HR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010HR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b[\u0010HR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010HR\u0013\u0010 \u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b]\u0010HR\u0013\u0010!\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b^\u0010HR\u0013\u0010\"\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b_\u0010HR\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b`\u0010?R\u0011\u0010$\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010aR\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u0010?R\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0013\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u0010?R\u0013\u0010)\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bf\u0010HR\u0013\u0010*\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bg\u0010HR\u0013\u0010+\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bh\u0010HR\u0013\u0010,\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bi\u0010HR\u0013\u0010-\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bj\u0010HR\u0013\u0010.\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bk\u0010HR\u0013\u0010/\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bl\u0010HR\u0013\u00100\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bm\u0010HR\u0013\u00101\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bn\u0010HR\u0013\u00102\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bo\u0010HR\u0013\u00103\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bp\u0010HR\u0013\u00104\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bq\u0010HR\u0013\u00105\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\br\u0010?R\u0013\u00106\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bs\u0010HR\u0013\u00107\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bt\u0010HR\u0011\u00108\u001a\u000209¢\u0006\b\n\u0000\u001a\u0004\bu\u0010vR\u0011\u0010:\u001a\u00020;¢\u0006\b\n\u0000\u001a\u0004\bw\u0010x¨\u0006³\u0001"}, m90084d2 = {"Lcom/kubi/futures/trade/position/FuturesPositionWithTpSlEntity;", "", "id", "", "symbol", "isOpen", "", "autoDeposit", "currentTimestamp", "", "avgEntryPrice", "Ljava/math/BigDecimal;", "currentCost", "currentQty", "delevPercentage", "liquidationPrice", "maintMargin", "markPrice", "markValue", "openingTimestamp", "posComm", "posCost", "posCross", "posInit", "posLoss", "posMaint", "aggRate", "posMargin", "realLeverage", "realisedGrossCost", "realisedGrossPnl", "realisedPnl", "riskLimit", "unrealisedPnl", "unrealisedRoePcnt", "settleCurrency", "isTrialFunds", "prizeType", "trialCoupon", "Lcom/kubi/kumex/data/trade/model/PositionTrialEntity;", "marginMode", "riskRatio", "crossIMR", "crossMMR", "adjustCrossIMR", "adjustCrossMMR", KlineFlutterMiniConstants.PROP_LATEST_PRICE, "latestUnrealisedPnl", "latestUnrealisedRoePcnt", "withdrawPnl", "dealComm", "fundingFee", FirebaseAnalytics.Param.TAX, "positionSide", "bestAskPrice", "bestBidPrice", "tpslOrderData", "Lcom/kubi/futures/trade/position/TpslOrderData;", "kLineShowEntity", "Lcom/kubi/futures/trade/position/KLineShowEntity;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;ZLjava/lang/String;Lcom/kubi/kumex/data/trade/model/PositionTrialEntity;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/kubi/futures/trade/position/TpslOrderData;Lcom/kubi/futures/trade/position/KLineShowEntity;)V", "getId", "()Ljava/lang/String;", "getSymbol", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAutoDeposit", "getCurrentTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAvgEntryPrice", "()Ljava/math/BigDecimal;", "getCurrentCost", "getCurrentQty", "getDelevPercentage", "getLiquidationPrice", "getMaintMargin", "getMarkPrice", "getMarkValue", "getOpeningTimestamp", "getPosComm", "getPosCost", "getPosCross", "getPosInit", "getPosLoss", "getPosMaint", "getAggRate", "getPosMargin", "getRealLeverage", "getRealisedGrossCost", "getRealisedGrossPnl", "getRealisedPnl", "getRiskLimit", "getUnrealisedPnl", "getUnrealisedRoePcnt", "getSettleCurrency", "()Z", "getPrizeType", "getTrialCoupon", "()Lcom/kubi/kumex/data/trade/model/PositionTrialEntity;", "getMarginMode", "getRiskRatio", "getCrossIMR", "getCrossMMR", "getAdjustCrossIMR", "getAdjustCrossMMR", "getLatestPrice", "getLatestUnrealisedPnl", "getLatestUnrealisedRoePcnt", "getWithdrawPnl", "getDealComm", "getFundingFee", "getTax", "getPositionSide", "getBestAskPrice", "getBestBidPrice", "getTpslOrderData", "()Lcom/kubi/futures/trade/position/TpslOrderData;", "getKLineShowEntity", "()Lcom/kubi/futures/trade/position/KLineShowEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;ZLjava/lang/String;Lcom/kubi/kumex/data/trade/model/PositionTrialEntity;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/kubi/futures/trade/position/TpslOrderData;Lcom/kubi/futures/trade/position/KLineShowEntity;)Lcom/kubi/futures/trade/position/FuturesPositionWithTpSlEntity;", "equals", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesPositionWithTpSlEntity {

    @Nullable
    private final BigDecimal adjustCrossIMR;

    @Nullable
    private final BigDecimal adjustCrossMMR;

    @Nullable
    private final BigDecimal aggRate;

    @Nullable
    private final Boolean autoDeposit;

    @Nullable
    private final BigDecimal avgEntryPrice;

    @Nullable
    private final BigDecimal bestAskPrice;

    @Nullable
    private final BigDecimal bestBidPrice;

    @Nullable
    private final BigDecimal crossIMR;

    @Nullable
    private final BigDecimal crossMMR;

    @Nullable
    private final BigDecimal currentCost;

    @Nullable
    private final BigDecimal currentQty;

    @Nullable
    private final Long currentTimestamp;

    @Nullable
    private final BigDecimal dealComm;

    @Nullable
    private final BigDecimal delevPercentage;

    @Nullable
    private final BigDecimal fundingFee;

    @Nullable
    private final String id;

    @Nullable
    private final Boolean isOpen;
    private final boolean isTrialFunds;

    @NotNull
    private final KLineShowEntity kLineShowEntity;

    @Nullable
    private final BigDecimal latestPrice;

    @Nullable
    private final BigDecimal latestUnrealisedPnl;

    @Nullable
    private final BigDecimal latestUnrealisedRoePcnt;

    @Nullable
    private final BigDecimal liquidationPrice;

    @Nullable
    private final BigDecimal maintMargin;

    @Nullable
    private final String marginMode;

    @Nullable
    private final BigDecimal markPrice;

    @Nullable
    private final BigDecimal markValue;

    @Nullable
    private final Long openingTimestamp;

    @Nullable
    private final BigDecimal posComm;

    @Nullable
    private final BigDecimal posCost;

    @Nullable
    private final BigDecimal posCross;

    @Nullable
    private final BigDecimal posInit;

    @Nullable
    private final BigDecimal posLoss;

    @Nullable
    private final BigDecimal posMaint;

    @Nullable
    private final BigDecimal posMargin;

    @Nullable
    private final String positionSide;

    @Nullable
    private final String prizeType;

    @Nullable
    private final BigDecimal realLeverage;

    @Nullable
    private final BigDecimal realisedGrossCost;

    @Nullable
    private final BigDecimal realisedGrossPnl;

    @Nullable
    private final BigDecimal realisedPnl;

    @Nullable
    private final BigDecimal riskLimit;

    @Nullable
    private final BigDecimal riskRatio;

    @Nullable
    private final String settleCurrency;

    @Nullable
    private final String symbol;

    @Nullable
    private final BigDecimal tax;

    @NotNull
    private final TpslOrderData tpslOrderData;

    @Nullable
    private final PositionTrialEntity trialCoupon;

    @Nullable
    private final BigDecimal unrealisedPnl;

    @Nullable
    private final BigDecimal unrealisedRoePcnt;

    @Nullable
    private final BigDecimal withdrawPnl;

    public FuturesPositionWithTpSlEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 524287, null);
    }

    @NotNull
    public final FuturesPositionWithTpSlEntity copy(@Nullable String id2, @Nullable String symbol, @Nullable Boolean isOpen, @Nullable Boolean autoDeposit, @Nullable Long currentTimestamp, @Nullable BigDecimal avgEntryPrice, @Nullable BigDecimal currentCost, @Nullable BigDecimal currentQty, @Nullable BigDecimal delevPercentage, @Nullable BigDecimal liquidationPrice, @Nullable BigDecimal maintMargin, @Nullable BigDecimal markPrice, @Nullable BigDecimal markValue, @Nullable Long openingTimestamp, @Nullable BigDecimal posComm, @Nullable BigDecimal posCost, @Nullable BigDecimal posCross, @Nullable BigDecimal posInit, @Nullable BigDecimal posLoss, @Nullable BigDecimal posMaint, @Nullable BigDecimal aggRate, @Nullable BigDecimal posMargin, @Nullable BigDecimal realLeverage, @Nullable BigDecimal realisedGrossCost, @Nullable BigDecimal realisedGrossPnl, @Nullable BigDecimal realisedPnl, @Nullable BigDecimal riskLimit, @Nullable BigDecimal unrealisedPnl, @Nullable BigDecimal unrealisedRoePcnt, @Nullable String settleCurrency, boolean isTrialFunds, @Nullable String prizeType, @Nullable PositionTrialEntity trialCoupon, @Nullable String marginMode, @Nullable BigDecimal riskRatio, @Nullable BigDecimal crossIMR, @Nullable BigDecimal crossMMR, @Nullable BigDecimal adjustCrossIMR, @Nullable BigDecimal adjustCrossMMR, @Nullable BigDecimal latestPrice, @Nullable BigDecimal latestUnrealisedPnl, @Nullable BigDecimal latestUnrealisedRoePcnt, @Nullable BigDecimal withdrawPnl, @Nullable BigDecimal dealComm, @Nullable BigDecimal fundingFee, @Nullable BigDecimal tax, @Nullable String positionSide, @Nullable BigDecimal bestAskPrice, @Nullable BigDecimal bestBidPrice, @NotNull TpslOrderData tpslOrderData, @NotNull KLineShowEntity kLineShowEntity) {
        Intrinsics.checkNotNullParameter(tpslOrderData, "tpslOrderData");
        Intrinsics.checkNotNullParameter(kLineShowEntity, "kLineShowEntity");
        return new FuturesPositionWithTpSlEntity(id2, symbol, isOpen, autoDeposit, currentTimestamp, avgEntryPrice, currentCost, currentQty, delevPercentage, liquidationPrice, maintMargin, markPrice, markValue, openingTimestamp, posComm, posCost, posCross, posInit, posLoss, posMaint, aggRate, posMargin, realLeverage, realisedGrossCost, realisedGrossPnl, realisedPnl, riskLimit, unrealisedPnl, unrealisedRoePcnt, settleCurrency, isTrialFunds, prizeType, trialCoupon, marginMode, riskRatio, crossIMR, crossMMR, adjustCrossIMR, adjustCrossMMR, latestPrice, latestUnrealisedPnl, latestUnrealisedRoePcnt, withdrawPnl, dealComm, fundingFee, tax, positionSide, bestAskPrice, bestBidPrice, tpslOrderData, kLineShowEntity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesPositionWithTpSlEntity)) {
            return false;
        }
        FuturesPositionWithTpSlEntity futuresPositionWithTpSlEntity = (FuturesPositionWithTpSlEntity) other;
        return Intrinsics.areEqual(this.id, futuresPositionWithTpSlEntity.id) && Intrinsics.areEqual(this.symbol, futuresPositionWithTpSlEntity.symbol) && Intrinsics.areEqual(this.isOpen, futuresPositionWithTpSlEntity.isOpen) && Intrinsics.areEqual(this.autoDeposit, futuresPositionWithTpSlEntity.autoDeposit) && Intrinsics.areEqual(this.currentTimestamp, futuresPositionWithTpSlEntity.currentTimestamp) && Intrinsics.areEqual(this.avgEntryPrice, futuresPositionWithTpSlEntity.avgEntryPrice) && Intrinsics.areEqual(this.currentCost, futuresPositionWithTpSlEntity.currentCost) && Intrinsics.areEqual(this.currentQty, futuresPositionWithTpSlEntity.currentQty) && Intrinsics.areEqual(this.delevPercentage, futuresPositionWithTpSlEntity.delevPercentage) && Intrinsics.areEqual(this.liquidationPrice, futuresPositionWithTpSlEntity.liquidationPrice) && Intrinsics.areEqual(this.maintMargin, futuresPositionWithTpSlEntity.maintMargin) && Intrinsics.areEqual(this.markPrice, futuresPositionWithTpSlEntity.markPrice) && Intrinsics.areEqual(this.markValue, futuresPositionWithTpSlEntity.markValue) && Intrinsics.areEqual(this.openingTimestamp, futuresPositionWithTpSlEntity.openingTimestamp) && Intrinsics.areEqual(this.posComm, futuresPositionWithTpSlEntity.posComm) && Intrinsics.areEqual(this.posCost, futuresPositionWithTpSlEntity.posCost) && Intrinsics.areEqual(this.posCross, futuresPositionWithTpSlEntity.posCross) && Intrinsics.areEqual(this.posInit, futuresPositionWithTpSlEntity.posInit) && Intrinsics.areEqual(this.posLoss, futuresPositionWithTpSlEntity.posLoss) && Intrinsics.areEqual(this.posMaint, futuresPositionWithTpSlEntity.posMaint) && Intrinsics.areEqual(this.aggRate, futuresPositionWithTpSlEntity.aggRate) && Intrinsics.areEqual(this.posMargin, futuresPositionWithTpSlEntity.posMargin) && Intrinsics.areEqual(this.realLeverage, futuresPositionWithTpSlEntity.realLeverage) && Intrinsics.areEqual(this.realisedGrossCost, futuresPositionWithTpSlEntity.realisedGrossCost) && Intrinsics.areEqual(this.realisedGrossPnl, futuresPositionWithTpSlEntity.realisedGrossPnl) && Intrinsics.areEqual(this.realisedPnl, futuresPositionWithTpSlEntity.realisedPnl) && Intrinsics.areEqual(this.riskLimit, futuresPositionWithTpSlEntity.riskLimit) && Intrinsics.areEqual(this.unrealisedPnl, futuresPositionWithTpSlEntity.unrealisedPnl) && Intrinsics.areEqual(this.unrealisedRoePcnt, futuresPositionWithTpSlEntity.unrealisedRoePcnt) && Intrinsics.areEqual(this.settleCurrency, futuresPositionWithTpSlEntity.settleCurrency) && this.isTrialFunds == futuresPositionWithTpSlEntity.isTrialFunds && Intrinsics.areEqual(this.prizeType, futuresPositionWithTpSlEntity.prizeType) && Intrinsics.areEqual(this.trialCoupon, futuresPositionWithTpSlEntity.trialCoupon) && Intrinsics.areEqual(this.marginMode, futuresPositionWithTpSlEntity.marginMode) && Intrinsics.areEqual(this.riskRatio, futuresPositionWithTpSlEntity.riskRatio) && Intrinsics.areEqual(this.crossIMR, futuresPositionWithTpSlEntity.crossIMR) && Intrinsics.areEqual(this.crossMMR, futuresPositionWithTpSlEntity.crossMMR) && Intrinsics.areEqual(this.adjustCrossIMR, futuresPositionWithTpSlEntity.adjustCrossIMR) && Intrinsics.areEqual(this.adjustCrossMMR, futuresPositionWithTpSlEntity.adjustCrossMMR) && Intrinsics.areEqual(this.latestPrice, futuresPositionWithTpSlEntity.latestPrice) && Intrinsics.areEqual(this.latestUnrealisedPnl, futuresPositionWithTpSlEntity.latestUnrealisedPnl) && Intrinsics.areEqual(this.latestUnrealisedRoePcnt, futuresPositionWithTpSlEntity.latestUnrealisedRoePcnt) && Intrinsics.areEqual(this.withdrawPnl, futuresPositionWithTpSlEntity.withdrawPnl) && Intrinsics.areEqual(this.dealComm, futuresPositionWithTpSlEntity.dealComm) && Intrinsics.areEqual(this.fundingFee, futuresPositionWithTpSlEntity.fundingFee) && Intrinsics.areEqual(this.tax, futuresPositionWithTpSlEntity.tax) && Intrinsics.areEqual(this.positionSide, futuresPositionWithTpSlEntity.positionSide) && Intrinsics.areEqual(this.bestAskPrice, futuresPositionWithTpSlEntity.bestAskPrice) && Intrinsics.areEqual(this.bestBidPrice, futuresPositionWithTpSlEntity.bestBidPrice) && Intrinsics.areEqual(this.tpslOrderData, futuresPositionWithTpSlEntity.tpslOrderData) && Intrinsics.areEqual(this.kLineShowEntity, futuresPositionWithTpSlEntity.kLineShowEntity);
    }

    public FuturesPositionWithTpSlEntity(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Long l11, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable Long l12, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable BigDecimal bigDecimal11, @Nullable BigDecimal bigDecimal12, @Nullable BigDecimal bigDecimal13, @Nullable BigDecimal bigDecimal14, @Nullable BigDecimal bigDecimal15, @Nullable BigDecimal bigDecimal16, @Nullable BigDecimal bigDecimal17, @Nullable BigDecimal bigDecimal18, @Nullable BigDecimal bigDecimal19, @Nullable BigDecimal bigDecimal20, @Nullable BigDecimal bigDecimal21, @Nullable BigDecimal bigDecimal22, @Nullable BigDecimal bigDecimal23, @Nullable String str3, boolean z11, @Nullable String str4, @Nullable PositionTrialEntity positionTrialEntity, @Nullable String str5, @Nullable BigDecimal bigDecimal24, @Nullable BigDecimal bigDecimal25, @Nullable BigDecimal bigDecimal26, @Nullable BigDecimal bigDecimal27, @Nullable BigDecimal bigDecimal28, @Nullable BigDecimal bigDecimal29, @Nullable BigDecimal bigDecimal30, @Nullable BigDecimal bigDecimal31, @Nullable BigDecimal bigDecimal32, @Nullable BigDecimal bigDecimal33, @Nullable BigDecimal bigDecimal34, @Nullable BigDecimal bigDecimal35, @Nullable String str6, @Nullable BigDecimal bigDecimal36, @Nullable BigDecimal bigDecimal37, @NotNull TpslOrderData tpslOrderData, @NotNull KLineShowEntity kLineShowEntity) {
        Intrinsics.checkNotNullParameter(tpslOrderData, "tpslOrderData");
        Intrinsics.checkNotNullParameter(kLineShowEntity, "kLineShowEntity");
        this.id = str;
        this.symbol = str2;
        this.isOpen = bool;
        this.autoDeposit = bool2;
        this.currentTimestamp = l11;
        this.avgEntryPrice = bigDecimal;
        this.currentCost = bigDecimal2;
        this.currentQty = bigDecimal3;
        this.delevPercentage = bigDecimal4;
        this.liquidationPrice = bigDecimal5;
        this.maintMargin = bigDecimal6;
        this.markPrice = bigDecimal7;
        this.markValue = bigDecimal8;
        this.openingTimestamp = l12;
        this.posComm = bigDecimal9;
        this.posCost = bigDecimal10;
        this.posCross = bigDecimal11;
        this.posInit = bigDecimal12;
        this.posLoss = bigDecimal13;
        this.posMaint = bigDecimal14;
        this.aggRate = bigDecimal15;
        this.posMargin = bigDecimal16;
        this.realLeverage = bigDecimal17;
        this.realisedGrossCost = bigDecimal18;
        this.realisedGrossPnl = bigDecimal19;
        this.realisedPnl = bigDecimal20;
        this.riskLimit = bigDecimal21;
        this.unrealisedPnl = bigDecimal22;
        this.unrealisedRoePcnt = bigDecimal23;
        this.settleCurrency = str3;
        this.isTrialFunds = z11;
        this.prizeType = str4;
        this.trialCoupon = positionTrialEntity;
        this.marginMode = str5;
        this.riskRatio = bigDecimal24;
        this.crossIMR = bigDecimal25;
        this.crossMMR = bigDecimal26;
        this.adjustCrossIMR = bigDecimal27;
        this.adjustCrossMMR = bigDecimal28;
        this.latestPrice = bigDecimal29;
        this.latestUnrealisedPnl = bigDecimal30;
        this.latestUnrealisedRoePcnt = bigDecimal31;
        this.withdrawPnl = bigDecimal32;
        this.dealComm = bigDecimal33;
        this.fundingFee = bigDecimal34;
        this.tax = bigDecimal35;
        this.positionSide = str6;
        this.bestAskPrice = bigDecimal36;
        this.bestBidPrice = bigDecimal37;
        this.tpslOrderData = tpslOrderData;
        this.kLineShowEntity = kLineShowEntity;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getLiquidationPrice() {
        return this.liquidationPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getMaintMargin() {
        return this.maintMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getMarkValue() {
        return this.markValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Long getOpeningTimestamp() {
        return this.openingTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final BigDecimal getPosComm() {
        return this.posComm;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigDecimal getPosCost() {
        return this.posCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final BigDecimal getPosCross() {
        return this.posCross;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final BigDecimal getPosInit() {
        return this.posInit;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final BigDecimal getPosLoss() {
        return this.posLoss;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final BigDecimal getPosMaint() {
        return this.posMaint;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final BigDecimal getAggRate() {
        return this.aggRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final BigDecimal getPosMargin() {
        return this.posMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final BigDecimal getRealLeverage() {
        return this.realLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final BigDecimal getRealisedGrossCost() {
        return this.realisedGrossCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final BigDecimal getRealisedGrossPnl() {
        return this.realisedGrossPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final BigDecimal getRealisedPnl() {
        return this.realisedPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final BigDecimal getRiskLimit() {
        return this.riskLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final BigDecimal getUnrealisedPnl() {
        return this.unrealisedPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final BigDecimal getUnrealisedRoePcnt() {
        return this.unrealisedRoePcnt;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsOpen() {
        return this.isOpen;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getSettleCurrency() {
        return this.settleCurrency;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final boolean getIsTrialFunds() {
        return this.isTrialFunds;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getPrizeType() {
        return this.prizeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final PositionTrialEntity getTrialCoupon() {
        return this.trialCoupon;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final BigDecimal getRiskRatio() {
        return this.riskRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final BigDecimal getCrossIMR() {
        return this.crossIMR;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final BigDecimal getCrossMMR() {
        return this.crossMMR;
    }

    @Nullable
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final BigDecimal getAdjustCrossIMR() {
        return this.adjustCrossIMR;
    }

    @Nullable
    /* JADX INFO: renamed from: component39, reason: from getter */
    public final BigDecimal getAdjustCrossMMR() {
        return this.adjustCrossMMR;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getAutoDeposit() {
        return this.autoDeposit;
    }

    @Nullable
    /* JADX INFO: renamed from: component40, reason: from getter */
    public final BigDecimal getLatestPrice() {
        return this.latestPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component41, reason: from getter */
    public final BigDecimal getLatestUnrealisedPnl() {
        return this.latestUnrealisedPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component42, reason: from getter */
    public final BigDecimal getLatestUnrealisedRoePcnt() {
        return this.latestUnrealisedRoePcnt;
    }

    @Nullable
    /* JADX INFO: renamed from: component43, reason: from getter */
    public final BigDecimal getWithdrawPnl() {
        return this.withdrawPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component44, reason: from getter */
    public final BigDecimal getDealComm() {
        return this.dealComm;
    }

    @Nullable
    /* JADX INFO: renamed from: component45, reason: from getter */
    public final BigDecimal getFundingFee() {
        return this.fundingFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component46, reason: from getter */
    public final BigDecimal getTax() {
        return this.tax;
    }

    @Nullable
    /* JADX INFO: renamed from: component47, reason: from getter */
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    /* JADX INFO: renamed from: component48, reason: from getter */
    public final BigDecimal getBestAskPrice() {
        return this.bestAskPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component49, reason: from getter */
    public final BigDecimal getBestBidPrice() {
        return this.bestBidPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getCurrentTimestamp() {
        return this.currentTimestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component50, reason: from getter */
    public final TpslOrderData getTpslOrderData() {
        return this.tpslOrderData;
    }

    @NotNull
    /* JADX INFO: renamed from: component51, reason: from getter */
    public final KLineShowEntity getKLineShowEntity() {
        return this.kLineShowEntity;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getAvgEntryPrice() {
        return this.avgEntryPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getCurrentCost() {
        return this.currentCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getCurrentQty() {
        return this.currentQty;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getDelevPercentage() {
        return this.delevPercentage;
    }

    @Nullable
    public final BigDecimal getAdjustCrossIMR() {
        return this.adjustCrossIMR;
    }

    @Nullable
    public final BigDecimal getAdjustCrossMMR() {
        return this.adjustCrossMMR;
    }

    @Nullable
    public final BigDecimal getAggRate() {
        return this.aggRate;
    }

    @Nullable
    public final Boolean getAutoDeposit() {
        return this.autoDeposit;
    }

    @Nullable
    public final BigDecimal getAvgEntryPrice() {
        return this.avgEntryPrice;
    }

    @Nullable
    public final BigDecimal getBestAskPrice() {
        return this.bestAskPrice;
    }

    @Nullable
    public final BigDecimal getBestBidPrice() {
        return this.bestBidPrice;
    }

    @Nullable
    public final BigDecimal getCrossIMR() {
        return this.crossIMR;
    }

    @Nullable
    public final BigDecimal getCrossMMR() {
        return this.crossMMR;
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
    public final Long getCurrentTimestamp() {
        return this.currentTimestamp;
    }

    @Nullable
    public final BigDecimal getDealComm() {
        return this.dealComm;
    }

    @Nullable
    public final BigDecimal getDelevPercentage() {
        return this.delevPercentage;
    }

    @Nullable
    public final BigDecimal getFundingFee() {
        return this.fundingFee;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final KLineShowEntity getKLineShowEntity() {
        return this.kLineShowEntity;
    }

    @Nullable
    public final BigDecimal getLatestPrice() {
        return this.latestPrice;
    }

    @Nullable
    public final BigDecimal getLatestUnrealisedPnl() {
        return this.latestUnrealisedPnl;
    }

    @Nullable
    public final BigDecimal getLatestUnrealisedRoePcnt() {
        return this.latestUnrealisedRoePcnt;
    }

    @Nullable
    public final BigDecimal getLiquidationPrice() {
        return this.liquidationPrice;
    }

    @Nullable
    public final BigDecimal getMaintMargin() {
        return this.maintMargin;
    }

    @Nullable
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    public final BigDecimal getMarkValue() {
        return this.markValue;
    }

    @Nullable
    public final Long getOpeningTimestamp() {
        return this.openingTimestamp;
    }

    @Nullable
    public final BigDecimal getPosComm() {
        return this.posComm;
    }

    @Nullable
    public final BigDecimal getPosCost() {
        return this.posCost;
    }

    @Nullable
    public final BigDecimal getPosCross() {
        return this.posCross;
    }

    @Nullable
    public final BigDecimal getPosInit() {
        return this.posInit;
    }

    @Nullable
    public final BigDecimal getPosLoss() {
        return this.posLoss;
    }

    @Nullable
    public final BigDecimal getPosMaint() {
        return this.posMaint;
    }

    @Nullable
    public final BigDecimal getPosMargin() {
        return this.posMargin;
    }

    @Nullable
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    public final String getPrizeType() {
        return this.prizeType;
    }

    @Nullable
    public final BigDecimal getRealLeverage() {
        return this.realLeverage;
    }

    @Nullable
    public final BigDecimal getRealisedGrossCost() {
        return this.realisedGrossCost;
    }

    @Nullable
    public final BigDecimal getRealisedGrossPnl() {
        return this.realisedGrossPnl;
    }

    @Nullable
    public final BigDecimal getRealisedPnl() {
        return this.realisedPnl;
    }

    @Nullable
    public final BigDecimal getRiskLimit() {
        return this.riskLimit;
    }

    @Nullable
    public final BigDecimal getRiskRatio() {
        return this.riskRatio;
    }

    @Nullable
    public final String getSettleCurrency() {
        return this.settleCurrency;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final BigDecimal getTax() {
        return this.tax;
    }

    @NotNull
    public final TpslOrderData getTpslOrderData() {
        return this.tpslOrderData;
    }

    @Nullable
    public final PositionTrialEntity getTrialCoupon() {
        return this.trialCoupon;
    }

    @Nullable
    public final BigDecimal getUnrealisedPnl() {
        return this.unrealisedPnl;
    }

    @Nullable
    public final BigDecimal getUnrealisedRoePcnt() {
        return this.unrealisedRoePcnt;
    }

    @Nullable
    public final BigDecimal getWithdrawPnl() {
        return this.withdrawPnl;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isOpen;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.autoDeposit;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l11 = this.currentTimestamp;
        int iHashCode5 = (iHashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        BigDecimal bigDecimal = this.avgEntryPrice;
        int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.currentCost;
        int iHashCode7 = (iHashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.currentQty;
        int iHashCode8 = (iHashCode7 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.delevPercentage;
        int iHashCode9 = (iHashCode8 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.liquidationPrice;
        int iHashCode10 = (iHashCode9 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.maintMargin;
        int iHashCode11 = (iHashCode10 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.markPrice;
        int iHashCode12 = (iHashCode11 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.markValue;
        int iHashCode13 = (iHashCode12 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        Long l12 = this.openingTimestamp;
        int iHashCode14 = (iHashCode13 + (l12 == null ? 0 : l12.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.posComm;
        int iHashCode15 = (iHashCode14 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.posCost;
        int iHashCode16 = (iHashCode15 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.posCross;
        int iHashCode17 = (iHashCode16 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.posInit;
        int iHashCode18 = (iHashCode17 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        BigDecimal bigDecimal13 = this.posLoss;
        int iHashCode19 = (iHashCode18 + (bigDecimal13 == null ? 0 : bigDecimal13.hashCode())) * 31;
        BigDecimal bigDecimal14 = this.posMaint;
        int iHashCode20 = (iHashCode19 + (bigDecimal14 == null ? 0 : bigDecimal14.hashCode())) * 31;
        BigDecimal bigDecimal15 = this.aggRate;
        int iHashCode21 = (iHashCode20 + (bigDecimal15 == null ? 0 : bigDecimal15.hashCode())) * 31;
        BigDecimal bigDecimal16 = this.posMargin;
        int iHashCode22 = (iHashCode21 + (bigDecimal16 == null ? 0 : bigDecimal16.hashCode())) * 31;
        BigDecimal bigDecimal17 = this.realLeverage;
        int iHashCode23 = (iHashCode22 + (bigDecimal17 == null ? 0 : bigDecimal17.hashCode())) * 31;
        BigDecimal bigDecimal18 = this.realisedGrossCost;
        int iHashCode24 = (iHashCode23 + (bigDecimal18 == null ? 0 : bigDecimal18.hashCode())) * 31;
        BigDecimal bigDecimal19 = this.realisedGrossPnl;
        int iHashCode25 = (iHashCode24 + (bigDecimal19 == null ? 0 : bigDecimal19.hashCode())) * 31;
        BigDecimal bigDecimal20 = this.realisedPnl;
        int iHashCode26 = (iHashCode25 + (bigDecimal20 == null ? 0 : bigDecimal20.hashCode())) * 31;
        BigDecimal bigDecimal21 = this.riskLimit;
        int iHashCode27 = (iHashCode26 + (bigDecimal21 == null ? 0 : bigDecimal21.hashCode())) * 31;
        BigDecimal bigDecimal22 = this.unrealisedPnl;
        int iHashCode28 = (iHashCode27 + (bigDecimal22 == null ? 0 : bigDecimal22.hashCode())) * 31;
        BigDecimal bigDecimal23 = this.unrealisedRoePcnt;
        int iHashCode29 = (iHashCode28 + (bigDecimal23 == null ? 0 : bigDecimal23.hashCode())) * 31;
        String str3 = this.settleCurrency;
        int iHashCode30 = (((iHashCode29 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.isTrialFunds)) * 31;
        String str4 = this.prizeType;
        int iHashCode31 = (iHashCode30 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PositionTrialEntity positionTrialEntity = this.trialCoupon;
        int iHashCode32 = (iHashCode31 + (positionTrialEntity == null ? 0 : positionTrialEntity.hashCode())) * 31;
        String str5 = this.marginMode;
        int iHashCode33 = (iHashCode32 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal24 = this.riskRatio;
        int iHashCode34 = (iHashCode33 + (bigDecimal24 == null ? 0 : bigDecimal24.hashCode())) * 31;
        BigDecimal bigDecimal25 = this.crossIMR;
        int iHashCode35 = (iHashCode34 + (bigDecimal25 == null ? 0 : bigDecimal25.hashCode())) * 31;
        BigDecimal bigDecimal26 = this.crossMMR;
        int iHashCode36 = (iHashCode35 + (bigDecimal26 == null ? 0 : bigDecimal26.hashCode())) * 31;
        BigDecimal bigDecimal27 = this.adjustCrossIMR;
        int iHashCode37 = (iHashCode36 + (bigDecimal27 == null ? 0 : bigDecimal27.hashCode())) * 31;
        BigDecimal bigDecimal28 = this.adjustCrossMMR;
        int iHashCode38 = (iHashCode37 + (bigDecimal28 == null ? 0 : bigDecimal28.hashCode())) * 31;
        BigDecimal bigDecimal29 = this.latestPrice;
        int iHashCode39 = (iHashCode38 + (bigDecimal29 == null ? 0 : bigDecimal29.hashCode())) * 31;
        BigDecimal bigDecimal30 = this.latestUnrealisedPnl;
        int iHashCode40 = (iHashCode39 + (bigDecimal30 == null ? 0 : bigDecimal30.hashCode())) * 31;
        BigDecimal bigDecimal31 = this.latestUnrealisedRoePcnt;
        int iHashCode41 = (iHashCode40 + (bigDecimal31 == null ? 0 : bigDecimal31.hashCode())) * 31;
        BigDecimal bigDecimal32 = this.withdrawPnl;
        int iHashCode42 = (iHashCode41 + (bigDecimal32 == null ? 0 : bigDecimal32.hashCode())) * 31;
        BigDecimal bigDecimal33 = this.dealComm;
        int iHashCode43 = (iHashCode42 + (bigDecimal33 == null ? 0 : bigDecimal33.hashCode())) * 31;
        BigDecimal bigDecimal34 = this.fundingFee;
        int iHashCode44 = (iHashCode43 + (bigDecimal34 == null ? 0 : bigDecimal34.hashCode())) * 31;
        BigDecimal bigDecimal35 = this.tax;
        int iHashCode45 = (iHashCode44 + (bigDecimal35 == null ? 0 : bigDecimal35.hashCode())) * 31;
        String str6 = this.positionSide;
        int iHashCode46 = (iHashCode45 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BigDecimal bigDecimal36 = this.bestAskPrice;
        int iHashCode47 = (iHashCode46 + (bigDecimal36 == null ? 0 : bigDecimal36.hashCode())) * 31;
        BigDecimal bigDecimal37 = this.bestBidPrice;
        return ((((iHashCode47 + (bigDecimal37 != null ? bigDecimal37.hashCode() : 0)) * 31) + this.tpslOrderData.hashCode()) * 31) + this.kLineShowEntity.hashCode();
    }

    @Nullable
    public final Boolean isOpen() {
        return this.isOpen;
    }

    public final boolean isTrialFunds() {
        return this.isTrialFunds;
    }

    @NotNull
    public String toString() {
        return "FuturesPositionWithTpSlEntity(id=" + this.id + ", symbol=" + this.symbol + ", isOpen=" + this.isOpen + ", autoDeposit=" + this.autoDeposit + ", currentTimestamp=" + this.currentTimestamp + ", avgEntryPrice=" + this.avgEntryPrice + ", currentCost=" + this.currentCost + ", currentQty=" + this.currentQty + ", delevPercentage=" + this.delevPercentage + ", liquidationPrice=" + this.liquidationPrice + ", maintMargin=" + this.maintMargin + ", markPrice=" + this.markPrice + ", markValue=" + this.markValue + ", openingTimestamp=" + this.openingTimestamp + ", posComm=" + this.posComm + ", posCost=" + this.posCost + ", posCross=" + this.posCross + ", posInit=" + this.posInit + ", posLoss=" + this.posLoss + ", posMaint=" + this.posMaint + ", aggRate=" + this.aggRate + ", posMargin=" + this.posMargin + ", realLeverage=" + this.realLeverage + ", realisedGrossCost=" + this.realisedGrossCost + ", realisedGrossPnl=" + this.realisedGrossPnl + ", realisedPnl=" + this.realisedPnl + ", riskLimit=" + this.riskLimit + ", unrealisedPnl=" + this.unrealisedPnl + ", unrealisedRoePcnt=" + this.unrealisedRoePcnt + ", settleCurrency=" + this.settleCurrency + ", isTrialFunds=" + this.isTrialFunds + ", prizeType=" + this.prizeType + ", trialCoupon=" + this.trialCoupon + ", marginMode=" + this.marginMode + ", riskRatio=" + this.riskRatio + ", crossIMR=" + this.crossIMR + ", crossMMR=" + this.crossMMR + ", adjustCrossIMR=" + this.adjustCrossIMR + ", adjustCrossMMR=" + this.adjustCrossMMR + ", latestPrice=" + this.latestPrice + ", latestUnrealisedPnl=" + this.latestUnrealisedPnl + ", latestUnrealisedRoePcnt=" + this.latestUnrealisedRoePcnt + ", withdrawPnl=" + this.withdrawPnl + ", dealComm=" + this.dealComm + ", fundingFee=" + this.fundingFee + ", tax=" + this.tax + ", positionSide=" + this.positionSide + ", bestAskPrice=" + this.bestAskPrice + ", bestBidPrice=" + this.bestBidPrice + ", tpslOrderData=" + this.tpslOrderData + ", kLineShowEntity=" + this.kLineShowEntity + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FuturesPositionWithTpSlEntity(String str, String str2, Boolean bool, Boolean bool2, Long l11, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, Long l12, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, BigDecimal bigDecimal15, BigDecimal bigDecimal16, BigDecimal bigDecimal17, BigDecimal bigDecimal18, BigDecimal bigDecimal19, BigDecimal bigDecimal20, BigDecimal bigDecimal21, BigDecimal bigDecimal22, BigDecimal bigDecimal23, String str3, boolean z11, String str4, PositionTrialEntity positionTrialEntity, String str5, BigDecimal bigDecimal24, BigDecimal bigDecimal25, BigDecimal bigDecimal26, BigDecimal bigDecimal27, BigDecimal bigDecimal28, BigDecimal bigDecimal29, BigDecimal bigDecimal30, BigDecimal bigDecimal31, BigDecimal bigDecimal32, BigDecimal bigDecimal33, BigDecimal bigDecimal34, BigDecimal bigDecimal35, String str6, BigDecimal bigDecimal36, BigDecimal bigDecimal37, TpslOrderData tpslOrderData, KLineShowEntity kLineShowEntity, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        String str7 = (i11 & 1) != 0 ? null : str;
        String str8 = (i11 & 2) != 0 ? null : str2;
        Boolean bool3 = (i11 & 4) != 0 ? null : bool;
        Boolean bool4 = (i11 & 8) != 0 ? null : bool2;
        Long l13 = (i11 & 16) != 0 ? null : l11;
        BigDecimal bigDecimal38 = (i11 & 32) != 0 ? null : bigDecimal;
        BigDecimal bigDecimal39 = (i11 & 64) != 0 ? null : bigDecimal2;
        BigDecimal bigDecimal40 = (i11 & 128) != 0 ? null : bigDecimal3;
        BigDecimal bigDecimal41 = (i11 & 256) != 0 ? null : bigDecimal4;
        BigDecimal bigDecimal42 = (i11 & 512) != 0 ? null : bigDecimal5;
        BigDecimal bigDecimal43 = (i11 & 1024) != 0 ? null : bigDecimal6;
        BigDecimal bigDecimal44 = (i11 & 2048) != 0 ? null : bigDecimal7;
        BigDecimal bigDecimal45 = (i11 & 4096) != 0 ? null : bigDecimal8;
        Long l14 = (i11 & 8192) != 0 ? null : l12;
        String str9 = str7;
        BigDecimal bigDecimal46 = (i11 & 16384) != 0 ? null : bigDecimal9;
        BigDecimal bigDecimal47 = (i11 & 32768) != 0 ? null : bigDecimal10;
        BigDecimal bigDecimal48 = (i11 & 65536) != 0 ? null : bigDecimal11;
        BigDecimal bigDecimal49 = (i11 & 131072) != 0 ? null : bigDecimal12;
        BigDecimal bigDecimal50 = (i11 & 262144) != 0 ? null : bigDecimal13;
        BigDecimal bigDecimal51 = (i11 & 524288) != 0 ? null : bigDecimal14;
        BigDecimal bigDecimal52 = (i11 & 1048576) != 0 ? null : bigDecimal15;
        BigDecimal bigDecimal53 = (i11 & 2097152) != 0 ? null : bigDecimal16;
        BigDecimal bigDecimal54 = (i11 & 4194304) != 0 ? null : bigDecimal17;
        BigDecimal bigDecimal55 = (i11 & 8388608) != 0 ? null : bigDecimal18;
        BigDecimal bigDecimal56 = (i11 & 16777216) != 0 ? null : bigDecimal19;
        BigDecimal bigDecimal57 = (i11 & 33554432) != 0 ? null : bigDecimal20;
        BigDecimal bigDecimal58 = (i11 & 67108864) != 0 ? null : bigDecimal21;
        BigDecimal bigDecimal59 = (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : bigDecimal22;
        BigDecimal bigDecimal60 = (i11 & 268435456) != 0 ? null : bigDecimal23;
        String str10 = (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : str3;
        boolean z12 = (i11 & 1073741824) != 0 ? false : z11;
        String str11 = (i11 & Integer.MIN_VALUE) != 0 ? null : str4;
        this(str9, str8, bool3, bool4, l13, bigDecimal38, bigDecimal39, bigDecimal40, bigDecimal41, bigDecimal42, bigDecimal43, bigDecimal44, bigDecimal45, l14, bigDecimal46, bigDecimal47, bigDecimal48, bigDecimal49, bigDecimal50, bigDecimal51, bigDecimal52, bigDecimal53, bigDecimal54, bigDecimal55, bigDecimal56, bigDecimal57, bigDecimal58, bigDecimal59, bigDecimal60, str10, z12, str11, (i12 & 1) != 0 ? null : positionTrialEntity, (i12 & 2) != 0 ? null : str5, (i12 & 4) != 0 ? null : bigDecimal24, (i12 & 8) != 0 ? null : bigDecimal25, (i12 & 16) != 0 ? null : bigDecimal26, (i12 & 32) != 0 ? null : bigDecimal27, (i12 & 64) != 0 ? null : bigDecimal28, (i12 & 128) != 0 ? null : bigDecimal29, (i12 & 256) != 0 ? null : bigDecimal30, (i12 & 512) != 0 ? null : bigDecimal31, (i12 & 1024) != 0 ? null : bigDecimal32, (i12 & 2048) != 0 ? null : bigDecimal33, (i12 & 4096) != 0 ? null : bigDecimal34, (i12 & 8192) != 0 ? null : bigDecimal35, (i12 & 16384) != 0 ? null : str6, (i12 & 32768) != 0 ? null : bigDecimal36, (i12 & 65536) != 0 ? null : bigDecimal37, (i12 & 131072) != 0 ? new TpslOrderData(null, null, 3, null) : tpslOrderData, (i12 & 262144) != 0 ? new KLineShowEntity(null, null, null, null, null, null, null, 127, null) : kLineShowEntity);
    }
}
