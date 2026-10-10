package com.kubi.kumex.data.trade.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import java.io.Serializable;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PositionEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\b³\u0001\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BÑ\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010$\u001a\u00020\u0007\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b:\u0010;J\f\u0010©\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010«\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010BJ\u0011\u0010¬\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010BJ\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010°\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010±\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010µ\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010[J\f\u0010¶\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010¼\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010À\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Á\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Ä\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Å\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\n\u0010Æ\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010'HÆ\u0003J\f\u0010É\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\f\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010Ë\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Í\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Î\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Ð\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Ñ\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Ò\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Ó\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Ô\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Õ\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Ö\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010×\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010Ø\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Ù\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003JÚ\u0004\u0010Ú\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010$\u001a\u00020\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00108\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0003\u0010Û\u0001J\b\u0010Ü\u0001\u001a\u00030Ý\u0001J\u0016\u0010Þ\u0001\u001a\u00020\u00072\n\u0010ß\u0001\u001a\u0005\u0018\u00010à\u0001HÖ\u0003J\u000b\u0010á\u0001\u001a\u00030Ý\u0001HÖ\u0001J\n\u0010â\u0001\u001a\u00020\u0004HÖ\u0001J\u001c\u0010ã\u0001\u001a\u00030ä\u00012\b\u0010å\u0001\u001a\u00030æ\u00012\b\u0010ç\u0001\u001a\u00030Ý\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010=\"\u0004\bA\u0010?R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\b\u0006\u0010B\"\u0004\bC\u0010DR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bF\u0010B\"\u0004\bG\u0010DR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010I\"\u0004\bM\u0010KR\u001c\u0010\f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010I\"\u0004\bO\u0010KR\u001c\u0010\r\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010I\"\u0004\bQ\u0010KR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010I\"\u0004\bS\u0010KR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010I\"\u0004\bU\u0010KR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010I\"\u0004\bW\u0010KR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010I\"\u0004\bY\u0010KR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010^\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010I\"\u0004\b`\u0010KR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010I\"\u0004\bb\u0010KR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010I\"\u0004\bd\u0010KR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010I\"\u0004\bf\u0010KR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010I\"\u0004\bh\u0010KR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010I\"\u0004\bj\u0010KR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010I\"\u0004\bl\u0010KR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010I\"\u0004\bn\u0010KR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010I\"\u0004\bp\u0010KR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010I\"\u0004\br\u0010KR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010I\"\u0004\bt\u0010KR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010I\"\u0004\bv\u0010KR\u001c\u0010 \u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010I\"\u0004\bx\u0010KR\u001c\u0010!\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010I\"\u0004\bz\u0010KR\u001c\u0010\"\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010I\"\u0004\b|\u0010KR\u001c\u0010#\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010=\"\u0004\b~\u0010?R\u001c\u0010$\u001a\u00020\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0004\b$\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0014\u0010%\u001a\u0004\u0018\u00010\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010=R \u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0015\u0010(\u001a\u0004\u0018\u00010)¢\u0006\n\n\u0000\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001e\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010=\"\u0005\b\u008a\u0001\u0010?R\u001e\u0010+\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010I\"\u0005\b\u008c\u0001\u0010KR\u001e\u0010,\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010I\"\u0005\b\u008e\u0001\u0010KR\u001e\u0010-\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010I\"\u0005\b\u0090\u0001\u0010KR\u001e\u0010.\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010I\"\u0005\b\u0092\u0001\u0010KR\u001e\u0010/\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010I\"\u0005\b\u0094\u0001\u0010KR\u001e\u00100\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010I\"\u0005\b\u0096\u0001\u0010KR\u001e\u00101\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010I\"\u0005\b\u0098\u0001\u0010KR\u001e\u00102\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010I\"\u0005\b\u009a\u0001\u0010KR\u001e\u00103\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0001\u0010I\"\u0005\b\u009c\u0001\u0010KR\u001e\u00104\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010I\"\u0005\b\u009e\u0001\u0010KR\u001e\u00105\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0001\u0010I\"\u0005\b \u0001\u0010KR\u001e\u00106\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¡\u0001\u0010I\"\u0005\b¢\u0001\u0010KR\u001e\u00107\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b£\u0001\u0010=\"\u0005\b¤\u0001\u0010?R\u001e\u00108\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¥\u0001\u0010I\"\u0005\b¦\u0001\u0010KR\u001e\u00109\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b§\u0001\u0010I\"\u0005\b¨\u0001\u0010K¨\u0006è\u0001"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/PositionEntity;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "id", "", "symbol", "isOpen", "", "autoDeposit", "avgEntryPrice", "Ljava/math/BigDecimal;", "currentCost", "currentQty", "delevPercentage", "liquidationPrice", "maintMargin", "markPrice", "markValue", "openingTimestamp", "", "posComm", "posCost", "posCross", "posInit", "posLoss", "posMaint", "aggRate", "posMargin", "realLeverage", "realisedGrossCost", "realisedGrossPnl", "realisedPnl", "riskLimit", "unrealisedPnl", "unrealisedRoePcnt", "settleCurrency", "isTrialFunds", "prizeType", "trialCoupon", "Lcom/kubi/kumex/data/trade/model/PositionTrialEntity;", "userJoinChallenge", "Lcom/kubi/kumex/data/trade/model/UserJoinChallengeEntity;", "marginMode", "riskRatio", "crossIMR", "crossMMR", "adjustCrossIMR", "adjustCrossMMR", KlineFlutterMiniConstants.PROP_LATEST_PRICE, "latestUnrealisedPnl", "latestUnrealisedRoePcnt", "withdrawPnl", "dealComm", "fundingFee", FirebaseAnalytics.Param.TAX, "positionSide", "bestAskPrice", "bestBidPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;ZLjava/lang/String;Lcom/kubi/kumex/data/trade/model/PositionTrialEntity;Lcom/kubi/kumex/data/trade/model/UserJoinChallengeEntity;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getSymbol", "setSymbol", "()Ljava/lang/Boolean;", "setOpen", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getAutoDeposit", "setAutoDeposit", "getAvgEntryPrice", "()Ljava/math/BigDecimal;", "setAvgEntryPrice", "(Ljava/math/BigDecimal;)V", "getCurrentCost", "setCurrentCost", "getCurrentQty", "setCurrentQty", "getDelevPercentage", "setDelevPercentage", "getLiquidationPrice", "setLiquidationPrice", "getMaintMargin", "setMaintMargin", "getMarkPrice", "setMarkPrice", "getMarkValue", "setMarkValue", "getOpeningTimestamp", "()Ljava/lang/Long;", "setOpeningTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPosComm", "setPosComm", "getPosCost", "setPosCost", "getPosCross", "setPosCross", "getPosInit", "setPosInit", "getPosLoss", "setPosLoss", "getPosMaint", "setPosMaint", "getAggRate", "setAggRate", "getPosMargin", "setPosMargin", "getRealLeverage", "setRealLeverage", "getRealisedGrossCost", "setRealisedGrossCost", "getRealisedGrossPnl", "setRealisedGrossPnl", "getRealisedPnl", "setRealisedPnl", "getRiskLimit", "setRiskLimit", "getUnrealisedPnl", "setUnrealisedPnl", "getUnrealisedRoePcnt", "setUnrealisedRoePcnt", "getSettleCurrency", "setSettleCurrency", "()Z", "setTrialFunds", "(Z)V", "getPrizeType", "getTrialCoupon", "()Lcom/kubi/kumex/data/trade/model/PositionTrialEntity;", "setTrialCoupon", "(Lcom/kubi/kumex/data/trade/model/PositionTrialEntity;)V", "getUserJoinChallenge", "()Lcom/kubi/kumex/data/trade/model/UserJoinChallengeEntity;", "getMarginMode", "setMarginMode", "getRiskRatio", "setRiskRatio", "getCrossIMR", "setCrossIMR", "getCrossMMR", "setCrossMMR", "getAdjustCrossIMR", "setAdjustCrossIMR", "getAdjustCrossMMR", "setAdjustCrossMMR", "getLatestPrice", "setLatestPrice", "getLatestUnrealisedPnl", "setLatestUnrealisedPnl", "getLatestUnrealisedRoePcnt", "setLatestUnrealisedRoePcnt", "getWithdrawPnl", "setWithdrawPnl", "getDealComm", "setDealComm", "getFundingFee", "setFundingFee", "getTax", "setTax", "getPositionSide", "setPositionSide", "getBestAskPrice", "setBestAskPrice", "getBestBidPrice", "setBestBidPrice", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;ZLjava/lang/String;Lcom/kubi/kumex/data/trade/model/PositionTrialEntity;Lcom/kubi/kumex/data/trade/model/UserJoinChallengeEntity;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/kumex/data/trade/model/PositionEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PositionEntity implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<PositionEntity> CREATOR = new C15837a();

    @Nullable
    private BigDecimal adjustCrossIMR;

    @Nullable
    private BigDecimal adjustCrossMMR;

    @Nullable
    private BigDecimal aggRate;

    @Nullable
    private Boolean autoDeposit;

    @Nullable
    private BigDecimal avgEntryPrice;

    @Nullable
    private BigDecimal bestAskPrice;

    @Nullable
    private BigDecimal bestBidPrice;

    @Nullable
    private BigDecimal crossIMR;

    @Nullable
    private BigDecimal crossMMR;

    @Nullable
    private BigDecimal currentCost;

    @Nullable
    private BigDecimal currentQty;

    @Nullable
    private BigDecimal dealComm;

    @Nullable
    private BigDecimal delevPercentage;

    @Nullable
    private BigDecimal fundingFee;

    @Nullable
    private String id;

    @Nullable
    private Boolean isOpen;
    private boolean isTrialFunds;

    @Nullable
    private BigDecimal latestPrice;

    @Nullable
    private BigDecimal latestUnrealisedPnl;

    @Nullable
    private BigDecimal latestUnrealisedRoePcnt;

    @Nullable
    private BigDecimal liquidationPrice;

    @Nullable
    private BigDecimal maintMargin;

    @Nullable
    private String marginMode;

    @Nullable
    private BigDecimal markPrice;

    @Nullable
    private BigDecimal markValue;

    @Nullable
    private Long openingTimestamp;

    @Nullable
    private BigDecimal posComm;

    @Nullable
    private BigDecimal posCost;

    @Nullable
    private BigDecimal posCross;

    @Nullable
    private BigDecimal posInit;

    @Nullable
    private BigDecimal posLoss;

    @Nullable
    private BigDecimal posMaint;

    @Nullable
    private BigDecimal posMargin;

    @Nullable
    private String positionSide;

    @Nullable
    private final String prizeType;

    @Nullable
    private BigDecimal realLeverage;

    @Nullable
    private BigDecimal realisedGrossCost;

    @Nullable
    private BigDecimal realisedGrossPnl;

    @Nullable
    private BigDecimal realisedPnl;

    @Nullable
    private BigDecimal riskLimit;

    @Nullable
    private BigDecimal riskRatio;

    @Nullable
    private String settleCurrency;

    @Nullable
    private String symbol;

    @Nullable
    private BigDecimal tax;

    @Nullable
    private PositionTrialEntity trialCoupon;

    @Nullable
    private BigDecimal unrealisedPnl;

    @Nullable
    private BigDecimal unrealisedRoePcnt;

    @Nullable
    private final UserJoinChallengeEntity userJoinChallenge;

    @Nullable
    private BigDecimal withdrawPnl;

    /* JADX INFO: renamed from: com.kubi.kumex.data.trade.model.PositionEntity$a */
    /* JADX INFO: compiled from: PositionEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15837a implements Parcelable.Creator<PositionEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PositionEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
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
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal6 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal7 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal8 = (BigDecimal) parcel.readSerializable();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            BigDecimal bigDecimal9 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal10 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal11 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal12 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal13 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal14 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal15 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal16 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal17 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal18 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal19 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal20 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal21 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal22 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal23 = (BigDecimal) parcel.readSerializable();
            Long l11 = lValueOf;
            String string3 = parcel.readString();
            boolean z11 = parcel.readInt() != 0;
            PositionTrialEntity positionTrialEntityCreateFromParcel = null;
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                positionTrialEntityCreateFromParcel = PositionTrialEntity.CREATOR.createFromParcel(parcel);
            }
            return new PositionEntity(string, string2, boolValueOf, boolValueOf2, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8, l11, bigDecimal9, bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13, bigDecimal14, bigDecimal15, bigDecimal16, bigDecimal17, bigDecimal18, bigDecimal19, bigDecimal20, bigDecimal21, bigDecimal22, bigDecimal23, string3, z11, string4, positionTrialEntityCreateFromParcel, parcel.readInt() == 0 ? null : UserJoinChallengeEntity.CREATOR.createFromParcel(parcel), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PositionEntity[] newArray(int i11) {
            return new PositionEntity[i11];
        }
    }

    public PositionEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 131071, null);
    }

    @NotNull
    public final PositionEntity copy(@Nullable String id2, @Nullable String symbol, @Nullable Boolean isOpen, @Nullable Boolean autoDeposit, @Nullable BigDecimal avgEntryPrice, @Nullable BigDecimal currentCost, @Nullable BigDecimal currentQty, @Nullable BigDecimal delevPercentage, @Nullable BigDecimal liquidationPrice, @Nullable BigDecimal maintMargin, @Nullable BigDecimal markPrice, @Nullable BigDecimal markValue, @Nullable Long openingTimestamp, @Nullable BigDecimal posComm, @Nullable BigDecimal posCost, @Nullable BigDecimal posCross, @Nullable BigDecimal posInit, @Nullable BigDecimal posLoss, @Nullable BigDecimal posMaint, @Nullable BigDecimal aggRate, @Nullable BigDecimal posMargin, @Nullable BigDecimal realLeverage, @Nullable BigDecimal realisedGrossCost, @Nullable BigDecimal realisedGrossPnl, @Nullable BigDecimal realisedPnl, @Nullable BigDecimal riskLimit, @Nullable BigDecimal unrealisedPnl, @Nullable BigDecimal unrealisedRoePcnt, @Nullable String settleCurrency, boolean isTrialFunds, @Nullable String prizeType, @Nullable PositionTrialEntity trialCoupon, @Nullable UserJoinChallengeEntity userJoinChallenge, @Nullable String marginMode, @Nullable BigDecimal riskRatio, @Nullable BigDecimal crossIMR, @Nullable BigDecimal crossMMR, @Nullable BigDecimal adjustCrossIMR, @Nullable BigDecimal adjustCrossMMR, @Nullable BigDecimal latestPrice, @Nullable BigDecimal latestUnrealisedPnl, @Nullable BigDecimal latestUnrealisedRoePcnt, @Nullable BigDecimal withdrawPnl, @Nullable BigDecimal dealComm, @Nullable BigDecimal fundingFee, @Nullable BigDecimal tax, @Nullable String positionSide, @Nullable BigDecimal bestAskPrice, @Nullable BigDecimal bestBidPrice) {
        return new PositionEntity(id2, symbol, isOpen, autoDeposit, avgEntryPrice, currentCost, currentQty, delevPercentage, liquidationPrice, maintMargin, markPrice, markValue, openingTimestamp, posComm, posCost, posCross, posInit, posLoss, posMaint, aggRate, posMargin, realLeverage, realisedGrossCost, realisedGrossPnl, realisedPnl, riskLimit, unrealisedPnl, unrealisedRoePcnt, settleCurrency, isTrialFunds, prizeType, trialCoupon, userJoinChallenge, marginMode, riskRatio, crossIMR, crossMMR, adjustCrossIMR, adjustCrossMMR, latestPrice, latestUnrealisedPnl, latestUnrealisedRoePcnt, withdrawPnl, dealComm, fundingFee, tax, positionSide, bestAskPrice, bestBidPrice);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionEntity)) {
            return false;
        }
        PositionEntity positionEntity = (PositionEntity) other;
        return Intrinsics.areEqual(this.id, positionEntity.id) && Intrinsics.areEqual(this.symbol, positionEntity.symbol) && Intrinsics.areEqual(this.isOpen, positionEntity.isOpen) && Intrinsics.areEqual(this.autoDeposit, positionEntity.autoDeposit) && Intrinsics.areEqual(this.avgEntryPrice, positionEntity.avgEntryPrice) && Intrinsics.areEqual(this.currentCost, positionEntity.currentCost) && Intrinsics.areEqual(this.currentQty, positionEntity.currentQty) && Intrinsics.areEqual(this.delevPercentage, positionEntity.delevPercentage) && Intrinsics.areEqual(this.liquidationPrice, positionEntity.liquidationPrice) && Intrinsics.areEqual(this.maintMargin, positionEntity.maintMargin) && Intrinsics.areEqual(this.markPrice, positionEntity.markPrice) && Intrinsics.areEqual(this.markValue, positionEntity.markValue) && Intrinsics.areEqual(this.openingTimestamp, positionEntity.openingTimestamp) && Intrinsics.areEqual(this.posComm, positionEntity.posComm) && Intrinsics.areEqual(this.posCost, positionEntity.posCost) && Intrinsics.areEqual(this.posCross, positionEntity.posCross) && Intrinsics.areEqual(this.posInit, positionEntity.posInit) && Intrinsics.areEqual(this.posLoss, positionEntity.posLoss) && Intrinsics.areEqual(this.posMaint, positionEntity.posMaint) && Intrinsics.areEqual(this.aggRate, positionEntity.aggRate) && Intrinsics.areEqual(this.posMargin, positionEntity.posMargin) && Intrinsics.areEqual(this.realLeverage, positionEntity.realLeverage) && Intrinsics.areEqual(this.realisedGrossCost, positionEntity.realisedGrossCost) && Intrinsics.areEqual(this.realisedGrossPnl, positionEntity.realisedGrossPnl) && Intrinsics.areEqual(this.realisedPnl, positionEntity.realisedPnl) && Intrinsics.areEqual(this.riskLimit, positionEntity.riskLimit) && Intrinsics.areEqual(this.unrealisedPnl, positionEntity.unrealisedPnl) && Intrinsics.areEqual(this.unrealisedRoePcnt, positionEntity.unrealisedRoePcnt) && Intrinsics.areEqual(this.settleCurrency, positionEntity.settleCurrency) && this.isTrialFunds == positionEntity.isTrialFunds && Intrinsics.areEqual(this.prizeType, positionEntity.prizeType) && Intrinsics.areEqual(this.trialCoupon, positionEntity.trialCoupon) && Intrinsics.areEqual(this.userJoinChallenge, positionEntity.userJoinChallenge) && Intrinsics.areEqual(this.marginMode, positionEntity.marginMode) && Intrinsics.areEqual(this.riskRatio, positionEntity.riskRatio) && Intrinsics.areEqual(this.crossIMR, positionEntity.crossIMR) && Intrinsics.areEqual(this.crossMMR, positionEntity.crossMMR) && Intrinsics.areEqual(this.adjustCrossIMR, positionEntity.adjustCrossIMR) && Intrinsics.areEqual(this.adjustCrossMMR, positionEntity.adjustCrossMMR) && Intrinsics.areEqual(this.latestPrice, positionEntity.latestPrice) && Intrinsics.areEqual(this.latestUnrealisedPnl, positionEntity.latestUnrealisedPnl) && Intrinsics.areEqual(this.latestUnrealisedRoePcnt, positionEntity.latestUnrealisedRoePcnt) && Intrinsics.areEqual(this.withdrawPnl, positionEntity.withdrawPnl) && Intrinsics.areEqual(this.dealComm, positionEntity.dealComm) && Intrinsics.areEqual(this.fundingFee, positionEntity.fundingFee) && Intrinsics.areEqual(this.tax, positionEntity.tax) && Intrinsics.areEqual(this.positionSide, positionEntity.positionSide) && Intrinsics.areEqual(this.bestAskPrice, positionEntity.bestAskPrice) && Intrinsics.areEqual(this.bestBidPrice, positionEntity.bestBidPrice);
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
        BigDecimal bigDecimal = this.avgEntryPrice;
        int iHashCode5 = (iHashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.currentCost;
        int iHashCode6 = (iHashCode5 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.currentQty;
        int iHashCode7 = (iHashCode6 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.delevPercentage;
        int iHashCode8 = (iHashCode7 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.liquidationPrice;
        int iHashCode9 = (iHashCode8 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.maintMargin;
        int iHashCode10 = (iHashCode9 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.markPrice;
        int iHashCode11 = (iHashCode10 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.markValue;
        int iHashCode12 = (iHashCode11 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        Long l11 = this.openingTimestamp;
        int iHashCode13 = (iHashCode12 + (l11 == null ? 0 : l11.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.posComm;
        int iHashCode14 = (iHashCode13 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.posCost;
        int iHashCode15 = (iHashCode14 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.posCross;
        int iHashCode16 = (iHashCode15 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.posInit;
        int iHashCode17 = (iHashCode16 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        BigDecimal bigDecimal13 = this.posLoss;
        int iHashCode18 = (iHashCode17 + (bigDecimal13 == null ? 0 : bigDecimal13.hashCode())) * 31;
        BigDecimal bigDecimal14 = this.posMaint;
        int iHashCode19 = (iHashCode18 + (bigDecimal14 == null ? 0 : bigDecimal14.hashCode())) * 31;
        BigDecimal bigDecimal15 = this.aggRate;
        int iHashCode20 = (iHashCode19 + (bigDecimal15 == null ? 0 : bigDecimal15.hashCode())) * 31;
        BigDecimal bigDecimal16 = this.posMargin;
        int iHashCode21 = (iHashCode20 + (bigDecimal16 == null ? 0 : bigDecimal16.hashCode())) * 31;
        BigDecimal bigDecimal17 = this.realLeverage;
        int iHashCode22 = (iHashCode21 + (bigDecimal17 == null ? 0 : bigDecimal17.hashCode())) * 31;
        BigDecimal bigDecimal18 = this.realisedGrossCost;
        int iHashCode23 = (iHashCode22 + (bigDecimal18 == null ? 0 : bigDecimal18.hashCode())) * 31;
        BigDecimal bigDecimal19 = this.realisedGrossPnl;
        int iHashCode24 = (iHashCode23 + (bigDecimal19 == null ? 0 : bigDecimal19.hashCode())) * 31;
        BigDecimal bigDecimal20 = this.realisedPnl;
        int iHashCode25 = (iHashCode24 + (bigDecimal20 == null ? 0 : bigDecimal20.hashCode())) * 31;
        BigDecimal bigDecimal21 = this.riskLimit;
        int iHashCode26 = (iHashCode25 + (bigDecimal21 == null ? 0 : bigDecimal21.hashCode())) * 31;
        BigDecimal bigDecimal22 = this.unrealisedPnl;
        int iHashCode27 = (iHashCode26 + (bigDecimal22 == null ? 0 : bigDecimal22.hashCode())) * 31;
        BigDecimal bigDecimal23 = this.unrealisedRoePcnt;
        int iHashCode28 = (iHashCode27 + (bigDecimal23 == null ? 0 : bigDecimal23.hashCode())) * 31;
        String str3 = this.settleCurrency;
        int iHashCode29 = (((iHashCode28 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.isTrialFunds)) * 31;
        String str4 = this.prizeType;
        int iHashCode30 = (iHashCode29 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PositionTrialEntity positionTrialEntity = this.trialCoupon;
        int iHashCode31 = (iHashCode30 + (positionTrialEntity == null ? 0 : positionTrialEntity.hashCode())) * 31;
        UserJoinChallengeEntity userJoinChallengeEntity = this.userJoinChallenge;
        int iHashCode32 = (iHashCode31 + (userJoinChallengeEntity == null ? 0 : userJoinChallengeEntity.hashCode())) * 31;
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
        return iHashCode47 + (bigDecimal37 != null ? bigDecimal37.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PositionEntity(id=" + this.id + ", symbol=" + this.symbol + ", isOpen=" + this.isOpen + ", autoDeposit=" + this.autoDeposit + ", avgEntryPrice=" + this.avgEntryPrice + ", currentCost=" + this.currentCost + ", currentQty=" + this.currentQty + ", delevPercentage=" + this.delevPercentage + ", liquidationPrice=" + this.liquidationPrice + ", maintMargin=" + this.maintMargin + ", markPrice=" + this.markPrice + ", markValue=" + this.markValue + ", openingTimestamp=" + this.openingTimestamp + ", posComm=" + this.posComm + ", posCost=" + this.posCost + ", posCross=" + this.posCross + ", posInit=" + this.posInit + ", posLoss=" + this.posLoss + ", posMaint=" + this.posMaint + ", aggRate=" + this.aggRate + ", posMargin=" + this.posMargin + ", realLeverage=" + this.realLeverage + ", realisedGrossCost=" + this.realisedGrossCost + ", realisedGrossPnl=" + this.realisedGrossPnl + ", realisedPnl=" + this.realisedPnl + ", riskLimit=" + this.riskLimit + ", unrealisedPnl=" + this.unrealisedPnl + ", unrealisedRoePcnt=" + this.unrealisedRoePcnt + ", settleCurrency=" + this.settleCurrency + ", isTrialFunds=" + this.isTrialFunds + ", prizeType=" + this.prizeType + ", trialCoupon=" + this.trialCoupon + ", userJoinChallenge=" + this.userJoinChallenge + ", marginMode=" + this.marginMode + ", riskRatio=" + this.riskRatio + ", crossIMR=" + this.crossIMR + ", crossMMR=" + this.crossMMR + ", adjustCrossIMR=" + this.adjustCrossIMR + ", adjustCrossMMR=" + this.adjustCrossMMR + ", latestPrice=" + this.latestPrice + ", latestUnrealisedPnl=" + this.latestUnrealisedPnl + ", latestUnrealisedRoePcnt=" + this.latestUnrealisedRoePcnt + ", withdrawPnl=" + this.withdrawPnl + ", dealComm=" + this.dealComm + ", fundingFee=" + this.fundingFee + ", tax=" + this.tax + ", positionSide=" + this.positionSide + ", bestAskPrice=" + this.bestAskPrice + ", bestBidPrice=" + this.bestBidPrice + ')';
    }

    public PositionEntity(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable Long l11, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable BigDecimal bigDecimal11, @Nullable BigDecimal bigDecimal12, @Nullable BigDecimal bigDecimal13, @Nullable BigDecimal bigDecimal14, @Nullable BigDecimal bigDecimal15, @Nullable BigDecimal bigDecimal16, @Nullable BigDecimal bigDecimal17, @Nullable BigDecimal bigDecimal18, @Nullable BigDecimal bigDecimal19, @Nullable BigDecimal bigDecimal20, @Nullable BigDecimal bigDecimal21, @Nullable BigDecimal bigDecimal22, @Nullable BigDecimal bigDecimal23, @Nullable String str3, boolean z11, @Nullable String str4, @Nullable PositionTrialEntity positionTrialEntity, @Nullable UserJoinChallengeEntity userJoinChallengeEntity, @Nullable String str5, @Nullable BigDecimal bigDecimal24, @Nullable BigDecimal bigDecimal25, @Nullable BigDecimal bigDecimal26, @Nullable BigDecimal bigDecimal27, @Nullable BigDecimal bigDecimal28, @Nullable BigDecimal bigDecimal29, @Nullable BigDecimal bigDecimal30, @Nullable BigDecimal bigDecimal31, @Nullable BigDecimal bigDecimal32, @Nullable BigDecimal bigDecimal33, @Nullable BigDecimal bigDecimal34, @Nullable BigDecimal bigDecimal35, @Nullable String str6, @Nullable BigDecimal bigDecimal36, @Nullable BigDecimal bigDecimal37) {
        this.id = str;
        this.symbol = str2;
        this.isOpen = bool;
        this.autoDeposit = bool2;
        this.avgEntryPrice = bigDecimal;
        this.currentCost = bigDecimal2;
        this.currentQty = bigDecimal3;
        this.delevPercentage = bigDecimal4;
        this.liquidationPrice = bigDecimal5;
        this.maintMargin = bigDecimal6;
        this.markPrice = bigDecimal7;
        this.markValue = bigDecimal8;
        this.openingTimestamp = l11;
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
        this.userJoinChallenge = userJoinChallengeEntity;
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
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getMaintMargin() {
        return this.maintMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getMarkValue() {
        return this.markValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getOpeningTimestamp() {
        return this.openingTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BigDecimal getPosComm() {
        return this.posComm;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final BigDecimal getPosCost() {
        return this.posCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigDecimal getPosCross() {
        return this.posCross;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final BigDecimal getPosInit() {
        return this.posInit;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final BigDecimal getPosLoss() {
        return this.posLoss;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final BigDecimal getPosMaint() {
        return this.posMaint;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final BigDecimal getAggRate() {
        return this.aggRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final BigDecimal getPosMargin() {
        return this.posMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final BigDecimal getRealLeverage() {
        return this.realLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final BigDecimal getRealisedGrossCost() {
        return this.realisedGrossCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final BigDecimal getRealisedGrossPnl() {
        return this.realisedGrossPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final BigDecimal getRealisedPnl() {
        return this.realisedPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final BigDecimal getRiskLimit() {
        return this.riskLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final BigDecimal getUnrealisedPnl() {
        return this.unrealisedPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final BigDecimal getUnrealisedRoePcnt() {
        return this.unrealisedRoePcnt;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getSettleCurrency() {
        return this.settleCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsOpen() {
        return this.isOpen;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final boolean getIsTrialFunds() {
        return this.isTrialFunds;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getPrizeType() {
        return this.prizeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final PositionTrialEntity getTrialCoupon() {
        return this.trialCoupon;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final UserJoinChallengeEntity getUserJoinChallenge() {
        return this.userJoinChallenge;
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
    public final BigDecimal getAvgEntryPrice() {
        return this.avgEntryPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getCurrentCost() {
        return this.currentCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getCurrentQty() {
        return this.currentQty;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getDelevPercentage() {
        return this.delevPercentage;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getLiquidationPrice() {
        return this.liquidationPrice;
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
    public final UserJoinChallengeEntity getUserJoinChallenge() {
        return this.userJoinChallenge;
    }

    @Nullable
    public final BigDecimal getWithdrawPnl() {
        return this.withdrawPnl;
    }

    @Nullable
    public final Boolean isOpen() {
        return this.isOpen;
    }

    public final boolean isTrialFunds() {
        return this.isTrialFunds;
    }

    public final void setAdjustCrossIMR(@Nullable BigDecimal bigDecimal) {
        this.adjustCrossIMR = bigDecimal;
    }

    public final void setAdjustCrossMMR(@Nullable BigDecimal bigDecimal) {
        this.adjustCrossMMR = bigDecimal;
    }

    public final void setAggRate(@Nullable BigDecimal bigDecimal) {
        this.aggRate = bigDecimal;
    }

    public final void setAutoDeposit(@Nullable Boolean bool) {
        this.autoDeposit = bool;
    }

    public final void setAvgEntryPrice(@Nullable BigDecimal bigDecimal) {
        this.avgEntryPrice = bigDecimal;
    }

    public final void setBestAskPrice(@Nullable BigDecimal bigDecimal) {
        this.bestAskPrice = bigDecimal;
    }

    public final void setBestBidPrice(@Nullable BigDecimal bigDecimal) {
        this.bestBidPrice = bigDecimal;
    }

    public final void setCrossIMR(@Nullable BigDecimal bigDecimal) {
        this.crossIMR = bigDecimal;
    }

    public final void setCrossMMR(@Nullable BigDecimal bigDecimal) {
        this.crossMMR = bigDecimal;
    }

    public final void setCurrentCost(@Nullable BigDecimal bigDecimal) {
        this.currentCost = bigDecimal;
    }

    public final void setCurrentQty(@Nullable BigDecimal bigDecimal) {
        this.currentQty = bigDecimal;
    }

    public final void setDealComm(@Nullable BigDecimal bigDecimal) {
        this.dealComm = bigDecimal;
    }

    public final void setDelevPercentage(@Nullable BigDecimal bigDecimal) {
        this.delevPercentage = bigDecimal;
    }

    public final void setFundingFee(@Nullable BigDecimal bigDecimal) {
        this.fundingFee = bigDecimal;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setLatestPrice(@Nullable BigDecimal bigDecimal) {
        this.latestPrice = bigDecimal;
    }

    public final void setLatestUnrealisedPnl(@Nullable BigDecimal bigDecimal) {
        this.latestUnrealisedPnl = bigDecimal;
    }

    public final void setLatestUnrealisedRoePcnt(@Nullable BigDecimal bigDecimal) {
        this.latestUnrealisedRoePcnt = bigDecimal;
    }

    public final void setLiquidationPrice(@Nullable BigDecimal bigDecimal) {
        this.liquidationPrice = bigDecimal;
    }

    public final void setMaintMargin(@Nullable BigDecimal bigDecimal) {
        this.maintMargin = bigDecimal;
    }

    public final void setMarginMode(@Nullable String str) {
        this.marginMode = str;
    }

    public final void setMarkPrice(@Nullable BigDecimal bigDecimal) {
        this.markPrice = bigDecimal;
    }

    public final void setMarkValue(@Nullable BigDecimal bigDecimal) {
        this.markValue = bigDecimal;
    }

    public final void setOpen(@Nullable Boolean bool) {
        this.isOpen = bool;
    }

    public final void setOpeningTimestamp(@Nullable Long l11) {
        this.openingTimestamp = l11;
    }

    public final void setPosComm(@Nullable BigDecimal bigDecimal) {
        this.posComm = bigDecimal;
    }

    public final void setPosCost(@Nullable BigDecimal bigDecimal) {
        this.posCost = bigDecimal;
    }

    public final void setPosCross(@Nullable BigDecimal bigDecimal) {
        this.posCross = bigDecimal;
    }

    public final void setPosInit(@Nullable BigDecimal bigDecimal) {
        this.posInit = bigDecimal;
    }

    public final void setPosLoss(@Nullable BigDecimal bigDecimal) {
        this.posLoss = bigDecimal;
    }

    public final void setPosMaint(@Nullable BigDecimal bigDecimal) {
        this.posMaint = bigDecimal;
    }

    public final void setPosMargin(@Nullable BigDecimal bigDecimal) {
        this.posMargin = bigDecimal;
    }

    public final void setPositionSide(@Nullable String str) {
        this.positionSide = str;
    }

    public final void setRealLeverage(@Nullable BigDecimal bigDecimal) {
        this.realLeverage = bigDecimal;
    }

    public final void setRealisedGrossCost(@Nullable BigDecimal bigDecimal) {
        this.realisedGrossCost = bigDecimal;
    }

    public final void setRealisedGrossPnl(@Nullable BigDecimal bigDecimal) {
        this.realisedGrossPnl = bigDecimal;
    }

    public final void setRealisedPnl(@Nullable BigDecimal bigDecimal) {
        this.realisedPnl = bigDecimal;
    }

    public final void setRiskLimit(@Nullable BigDecimal bigDecimal) {
        this.riskLimit = bigDecimal;
    }

    public final void setRiskRatio(@Nullable BigDecimal bigDecimal) {
        this.riskRatio = bigDecimal;
    }

    public final void setSettleCurrency(@Nullable String str) {
        this.settleCurrency = str;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setTax(@Nullable BigDecimal bigDecimal) {
        this.tax = bigDecimal;
    }

    public final void setTrialCoupon(@Nullable PositionTrialEntity positionTrialEntity) {
        this.trialCoupon = positionTrialEntity;
    }

    public final void setTrialFunds(boolean z11) {
        this.isTrialFunds = z11;
    }

    public final void setUnrealisedPnl(@Nullable BigDecimal bigDecimal) {
        this.unrealisedPnl = bigDecimal;
    }

    public final void setUnrealisedRoePcnt(@Nullable BigDecimal bigDecimal) {
        this.unrealisedRoePcnt = bigDecimal;
    }

    public final void setWithdrawPnl(@Nullable BigDecimal bigDecimal) {
        this.withdrawPnl = bigDecimal;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.symbol);
        Boolean bool = this.isOpen;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.autoDeposit;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        dest.writeSerializable(this.avgEntryPrice);
        dest.writeSerializable(this.currentCost);
        dest.writeSerializable(this.currentQty);
        dest.writeSerializable(this.delevPercentage);
        dest.writeSerializable(this.liquidationPrice);
        dest.writeSerializable(this.maintMargin);
        dest.writeSerializable(this.markPrice);
        dest.writeSerializable(this.markValue);
        Long l11 = this.openingTimestamp;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeSerializable(this.posComm);
        dest.writeSerializable(this.posCost);
        dest.writeSerializable(this.posCross);
        dest.writeSerializable(this.posInit);
        dest.writeSerializable(this.posLoss);
        dest.writeSerializable(this.posMaint);
        dest.writeSerializable(this.aggRate);
        dest.writeSerializable(this.posMargin);
        dest.writeSerializable(this.realLeverage);
        dest.writeSerializable(this.realisedGrossCost);
        dest.writeSerializable(this.realisedGrossPnl);
        dest.writeSerializable(this.realisedPnl);
        dest.writeSerializable(this.riskLimit);
        dest.writeSerializable(this.unrealisedPnl);
        dest.writeSerializable(this.unrealisedRoePcnt);
        dest.writeString(this.settleCurrency);
        dest.writeInt(this.isTrialFunds ? 1 : 0);
        dest.writeString(this.prizeType);
        PositionTrialEntity positionTrialEntity = this.trialCoupon;
        if (positionTrialEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            positionTrialEntity.writeToParcel(dest, flags);
        }
        UserJoinChallengeEntity userJoinChallengeEntity = this.userJoinChallenge;
        if (userJoinChallengeEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            userJoinChallengeEntity.writeToParcel(dest, flags);
        }
        dest.writeString(this.marginMode);
        dest.writeSerializable(this.riskRatio);
        dest.writeSerializable(this.crossIMR);
        dest.writeSerializable(this.crossMMR);
        dest.writeSerializable(this.adjustCrossIMR);
        dest.writeSerializable(this.adjustCrossMMR);
        dest.writeSerializable(this.latestPrice);
        dest.writeSerializable(this.latestUnrealisedPnl);
        dest.writeSerializable(this.latestUnrealisedRoePcnt);
        dest.writeSerializable(this.withdrawPnl);
        dest.writeSerializable(this.dealComm);
        dest.writeSerializable(this.fundingFee);
        dest.writeSerializable(this.tax);
        dest.writeString(this.positionSide);
        dest.writeSerializable(this.bestAskPrice);
        dest.writeSerializable(this.bestBidPrice);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PositionEntity(String str, String str2, Boolean bool, Boolean bool2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, Long l11, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, BigDecimal bigDecimal15, BigDecimal bigDecimal16, BigDecimal bigDecimal17, BigDecimal bigDecimal18, BigDecimal bigDecimal19, BigDecimal bigDecimal20, BigDecimal bigDecimal21, BigDecimal bigDecimal22, BigDecimal bigDecimal23, String str3, boolean z11, String str4, PositionTrialEntity positionTrialEntity, UserJoinChallengeEntity userJoinChallengeEntity, String str5, BigDecimal bigDecimal24, BigDecimal bigDecimal25, BigDecimal bigDecimal26, BigDecimal bigDecimal27, BigDecimal bigDecimal28, BigDecimal bigDecimal29, BigDecimal bigDecimal30, BigDecimal bigDecimal31, BigDecimal bigDecimal32, BigDecimal bigDecimal33, BigDecimal bigDecimal34, BigDecimal bigDecimal35, String str6, BigDecimal bigDecimal36, BigDecimal bigDecimal37, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        String str7 = (i11 & 1) != 0 ? null : str;
        this(str7, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bool, (i11 & 8) != 0 ? null : bool2, (i11 & 16) != 0 ? null : bigDecimal, (i11 & 32) != 0 ? null : bigDecimal2, (i11 & 64) != 0 ? null : bigDecimal3, (i11 & 128) != 0 ? null : bigDecimal4, (i11 & 256) != 0 ? null : bigDecimal5, (i11 & 512) != 0 ? null : bigDecimal6, (i11 & 1024) != 0 ? null : bigDecimal7, (i11 & 2048) != 0 ? null : bigDecimal8, (i11 & 4096) != 0 ? null : l11, (i11 & 8192) != 0 ? null : bigDecimal9, (i11 & 16384) != 0 ? null : bigDecimal10, (i11 & 32768) != 0 ? null : bigDecimal11, (i11 & 65536) != 0 ? null : bigDecimal12, (i11 & 131072) != 0 ? null : bigDecimal13, (i11 & 262144) != 0 ? null : bigDecimal14, (i11 & 524288) != 0 ? null : bigDecimal15, (i11 & 1048576) != 0 ? null : bigDecimal16, (i11 & 2097152) != 0 ? null : bigDecimal17, (i11 & 4194304) != 0 ? null : bigDecimal18, (i11 & 8388608) != 0 ? null : bigDecimal19, (i11 & 16777216) != 0 ? null : bigDecimal20, (i11 & 33554432) != 0 ? null : bigDecimal21, (i11 & 67108864) != 0 ? null : bigDecimal22, (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : bigDecimal23, (i11 & 268435456) != 0 ? null : str3, (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? false : z11, (i11 & 1073741824) != 0 ? null : str4, (i11 & Integer.MIN_VALUE) != 0 ? null : positionTrialEntity, (i12 & 1) != 0 ? null : userJoinChallengeEntity, (i12 & 2) != 0 ? null : str5, (i12 & 4) != 0 ? null : bigDecimal24, (i12 & 8) != 0 ? null : bigDecimal25, (i12 & 16) != 0 ? null : bigDecimal26, (i12 & 32) != 0 ? null : bigDecimal27, (i12 & 64) != 0 ? null : bigDecimal28, (i12 & 128) != 0 ? null : bigDecimal29, (i12 & 256) != 0 ? null : bigDecimal30, (i12 & 512) != 0 ? null : bigDecimal31, (i12 & 1024) != 0 ? null : bigDecimal32, (i12 & 2048) != 0 ? null : bigDecimal33, (i12 & 4096) != 0 ? null : bigDecimal34, (i12 & 8192) != 0 ? null : bigDecimal35, (i12 & 16384) != 0 ? null : str6, (i12 & 32768) != 0 ? null : bigDecimal36, (i12 & 65536) != 0 ? null : bigDecimal37);
    }
}
