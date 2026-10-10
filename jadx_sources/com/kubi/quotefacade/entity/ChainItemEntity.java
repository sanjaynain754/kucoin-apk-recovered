package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChainMarketEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0003\b\u0099\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÛ\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010(\u001a\u00020#\u0012\b\b\u0002\u0010)\u001a\u00020#\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010,\u001a\u00020#\u0012\b\b\u0002\u0010-\u001a\u00020#\u0012\b\b\u0002\u0010.\u001a\u00020#¢\u0006\u0004\b/\u00100J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010TJ\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¡\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010[J\u0011\u0010¢\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010[J\u0011\u0010£\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010[J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¦\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010TJ\u0011\u0010§\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010TJ\u0011\u0010¨\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010TJ\u0011\u0010©\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010TJ\u0011\u0010ª\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010TJ\u0011\u0010«\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010TJ\n\u0010¬\u0001\u001a\u00020#HÆ\u0003J\u0011\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010TJ\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¯\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010TJ\u0011\u0010°\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0002\u0010~J\n\u0010±\u0001\u001a\u00020#HÆ\u0003J\n\u0010²\u0001\u001a\u00020#HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010µ\u0001\u001a\u00020#HÆ\u0003J\n\u0010¶\u0001\u001a\u00020#HÆ\u0003J\n\u0010·\u0001\u001a\u00020#HÆ\u0003Jä\u0003\u0010¸\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010'\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010(\u001a\u00020#2\b\b\u0002\u0010)\u001a\u00020#2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010,\u001a\u00020#2\b\b\u0002\u0010-\u001a\u00020#2\b\b\u0002\u0010.\u001a\u00020#HÆ\u0001¢\u0006\u0003\u0010¹\u0001J\u0007\u0010º\u0001\u001a\u00020\u0014J\u0016\u0010»\u0001\u001a\u00020#2\n\u0010¼\u0001\u001a\u0005\u0018\u00010½\u0001HÖ\u0003J\n\u0010¾\u0001\u001a\u00020\u0014HÖ\u0001J\n\u0010¿\u0001\u001a\u00020\u0003HÖ\u0001J\u001b\u0010À\u0001\u001a\u00030Á\u00012\b\u0010Â\u0001\u001a\u00030Ã\u00012\u0007\u0010Ä\u0001\u001a\u00020\u0014R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00106\"\u0004\b:\u00108R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00106\"\u0004\b<\u00108R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00102\"\u0004\b>\u00104R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u00102\"\u0004\b@\u00104R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u00102\"\u0004\bB\u00104R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u00102\"\u0004\bD\u00104R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u00102\"\u0004\bF\u00104R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u00102\"\u0004\bH\u00104R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u00102\"\u0004\bJ\u00104R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u00102\"\u0004\bL\u00104R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u00102\"\u0004\bN\u00104R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u00102\"\u0004\bP\u00104R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u00102\"\u0004\bR\u00104R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010W\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u00102\"\u0004\bY\u00104R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010^\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010^\u001a\u0004\b_\u0010[\"\u0004\b`\u0010]R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010^\u001a\u0004\ba\u0010[\"\u0004\bb\u0010]R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u00106\"\u0004\bd\u00108R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u00102\"\u0004\bf\u00104R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010W\u001a\u0004\bg\u0010T\"\u0004\bh\u0010VR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010W\u001a\u0004\bi\u0010T\"\u0004\bj\u0010VR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010W\u001a\u0004\bk\u0010T\"\u0004\bl\u0010VR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010W\u001a\u0004\bm\u0010T\"\u0004\bn\u0010VR\u001e\u0010 \u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010W\u001a\u0004\bo\u0010T\"\u0004\bp\u0010VR\u001e\u0010!\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010W\u001a\u0004\bq\u0010T\"\u0004\br\u0010VR\u001a\u0010\"\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001e\u0010$\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010W\u001a\u0004\bw\u0010T\"\u0004\bx\u0010VR\u001c\u0010%\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u00102\"\u0004\bz\u00104R\u001e\u0010&\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010W\u001a\u0004\b{\u0010T\"\u0004\b|\u0010VR \u0010'\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0012\n\u0003\u0010\u0081\u0001\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\u001c\u0010(\u001a\u00020#X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010t\"\u0005\b\u0083\u0001\u0010vR\u001c\u0010)\u001a\u00020#X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010t\"\u0005\b\u0085\u0001\u0010vR\u001e\u0010*\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u00102\"\u0005\b\u0087\u0001\u00104R\u001e\u0010+\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u00102\"\u0005\b\u0089\u0001\u00104R\u001c\u0010,\u001a\u00020#X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010t\"\u0005\b\u008b\u0001\u0010vR\u001c\u0010-\u001a\u00020#X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u0010t\"\u0005\b\u008d\u0001\u0010vR\u001c\u0010.\u001a\u00020#X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010t\"\u0005\b\u008f\u0001\u0010v¨\u0006Å\u0001"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/ChainItemEntity;", "Landroid/os/Parcelable;", "total", "", "launchPrice", "Ljava/math/BigDecimal;", "currentPriceEth", "currentPriceUsd", "lockAmount", "burnAmount", "otherAmount", "marketCap", "fdv", "tvl", InterfaceC33826o0.f71244p, "chain", "decimal", "name", "symbol", "holders", "", "logoUrl", "launchAt", "", "createdAt", "updatedAt", "tokenPriceChange", "tokenTxVolumeUsd", "tokenTxCount", "tokenBuyTxCount", "tokenSellTxCount", "tokenMakers", "tokenBuyers", "tokenSellers", "hasMintMethod", "", "auditLevel", "chainLogo", "securityScore", "hotToken", "hasNotRenounced", "hasNotOpenSource", KlineFlutterMiniConstants.PROP_DATA_SOURCE, "kcChain", "lpNotLocked", "inBlacklist", "honeypot", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;ZZLjava/lang/String;Ljava/lang/String;ZZZ)V", "getTotal", "()Ljava/lang/String;", "setTotal", "(Ljava/lang/String;)V", "getLaunchPrice", "()Ljava/math/BigDecimal;", "setLaunchPrice", "(Ljava/math/BigDecimal;)V", "getCurrentPriceEth", "setCurrentPriceEth", "getCurrentPriceUsd", "setCurrentPriceUsd", "getLockAmount", "setLockAmount", "getBurnAmount", "setBurnAmount", "getOtherAmount", "setOtherAmount", "getMarketCap", "setMarketCap", "getFdv", "setFdv", "getTvl", "setTvl", "getToken", "setToken", "getChain", "setChain", "getDecimal", "setDecimal", "getName", "setName", "getSymbol", "setSymbol", "getHolders", "()Ljava/lang/Integer;", "setHolders", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLogoUrl", "setLogoUrl", "getLaunchAt", "()Ljava/lang/Long;", "setLaunchAt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCreatedAt", "setCreatedAt", "getUpdatedAt", "setUpdatedAt", "getTokenPriceChange", "setTokenPriceChange", "getTokenTxVolumeUsd", "setTokenTxVolumeUsd", "getTokenTxCount", "setTokenTxCount", "getTokenBuyTxCount", "setTokenBuyTxCount", "getTokenSellTxCount", "setTokenSellTxCount", "getTokenMakers", "setTokenMakers", "getTokenBuyers", "setTokenBuyers", "getTokenSellers", "setTokenSellers", "getHasMintMethod", "()Z", "setHasMintMethod", "(Z)V", "getAuditLevel", "setAuditLevel", "getChainLogo", "setChainLogo", "getSecurityScore", "setSecurityScore", "getHotToken", "()Ljava/lang/Boolean;", "setHotToken", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getHasNotRenounced", "setHasNotRenounced", "getHasNotOpenSource", "setHasNotOpenSource", "getDataSource", "setDataSource", "getKcChain", "setKcChain", "getLpNotLocked", "setLpNotLocked", "getInBlacklist", "setInBlacklist", "getHoneypot", "setHoneypot", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;ZZLjava/lang/String;Ljava/lang/String;ZZZ)Lcom/kubi/quotefacade/entity/ChainItemEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChainItemEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChainItemEntity> CREATOR = new C21876a();

    @Nullable
    private Integer auditLevel;

    @Nullable
    private String burnAmount;

    @Nullable
    private String chain;

    @Nullable
    private String chainLogo;

    @Nullable
    private Long createdAt;

    @Nullable
    private BigDecimal currentPriceEth;

    @Nullable
    private BigDecimal currentPriceUsd;

    @Nullable
    private String dataSource;

    @Nullable
    private String decimal;

    @Nullable
    private String fdv;
    private boolean hasMintMethod;
    private boolean hasNotOpenSource;
    private boolean hasNotRenounced;

    @Nullable
    private Integer holders;
    private boolean honeypot;

    @Nullable
    private Boolean hotToken;
    private boolean inBlacklist;

    @Nullable
    private String kcChain;

    @Nullable
    private Long launchAt;

    @Nullable
    private BigDecimal launchPrice;

    @Nullable
    private String lockAmount;

    @Nullable
    private String logoUrl;
    private boolean lpNotLocked;

    @Nullable
    private String marketCap;

    @Nullable
    private String name;

    @Nullable
    private String otherAmount;

    @Nullable
    private Integer securityScore;

    @Nullable
    private String symbol;

    @Nullable
    private String token;

    @Nullable
    private Integer tokenBuyTxCount;

    @Nullable
    private Integer tokenBuyers;

    @Nullable
    private Integer tokenMakers;

    @Nullable
    private BigDecimal tokenPriceChange;

    @Nullable
    private Integer tokenSellTxCount;

    @Nullable
    private Integer tokenSellers;

    @Nullable
    private Integer tokenTxCount;

    @Nullable
    private String tokenTxVolumeUsd;

    @Nullable
    private String total;

    @Nullable
    private String tvl;

    @Nullable
    private Long updatedAt;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.ChainItemEntity$a */
    /* JADX INFO: compiled from: ChainMarketEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21876a implements Parcelable.Creator<ChainItemEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChainItemEntity createFromParcel(Parcel parcel) {
            boolean z11;
            boolean z12;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string13 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            String string14 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z13 = parcel.readInt() != 0;
            Integer numValueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string15 = parcel.readString();
            Integer numValueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                z11 = false;
                z12 = true;
            } else {
                z11 = false;
                z12 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            }
            String string16 = parcel.readString();
            boolean z14 = z11;
            String string17 = parcel.readString();
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            return new ChainItemEntity(string, bigDecimal, bigDecimal2, bigDecimal3, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, numValueOf, string13, lValueOf, lValueOf2, lValueOf3, bigDecimal4, string14, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, z13, numValueOf8, string15, numValueOf9, boolValueOf, z12, z11, string16, string17, z14, z14, z14);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ChainItemEntity[] newArray(int i11) {
            return new ChainItemEntity[i11];
        }
    }

    public ChainItemEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, null, false, false, false, -1, 255, null);
    }

    @NotNull
    public final ChainItemEntity copy(@Nullable String total, @Nullable BigDecimal launchPrice, @Nullable BigDecimal currentPriceEth, @Nullable BigDecimal currentPriceUsd, @Nullable String lockAmount, @Nullable String burnAmount, @Nullable String otherAmount, @Nullable String marketCap, @Nullable String fdv, @Nullable String tvl, @Nullable String token, @Nullable String chain, @Nullable String decimal, @Nullable String name, @Nullable String symbol, @Nullable Integer holders, @Nullable String logoUrl, @Nullable Long launchAt, @Nullable Long createdAt, @Nullable Long updatedAt, @Nullable BigDecimal tokenPriceChange, @Nullable String tokenTxVolumeUsd, @Nullable Integer tokenTxCount, @Nullable Integer tokenBuyTxCount, @Nullable Integer tokenSellTxCount, @Nullable Integer tokenMakers, @Nullable Integer tokenBuyers, @Nullable Integer tokenSellers, boolean hasMintMethod, @Nullable Integer auditLevel, @Nullable String chainLogo, @Nullable Integer securityScore, @Nullable Boolean hotToken, boolean hasNotRenounced, boolean hasNotOpenSource, @Nullable String dataSource, @Nullable String kcChain, boolean lpNotLocked, boolean inBlacklist, boolean honeypot) {
        return new ChainItemEntity(total, launchPrice, currentPriceEth, currentPriceUsd, lockAmount, burnAmount, otherAmount, marketCap, fdv, tvl, token, chain, decimal, name, symbol, holders, logoUrl, launchAt, createdAt, updatedAt, tokenPriceChange, tokenTxVolumeUsd, tokenTxCount, tokenBuyTxCount, tokenSellTxCount, tokenMakers, tokenBuyers, tokenSellers, hasMintMethod, auditLevel, chainLogo, securityScore, hotToken, hasNotRenounced, hasNotOpenSource, dataSource, kcChain, lpNotLocked, inBlacklist, honeypot);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChainItemEntity)) {
            return false;
        }
        ChainItemEntity chainItemEntity = (ChainItemEntity) other;
        return Intrinsics.areEqual(this.total, chainItemEntity.total) && Intrinsics.areEqual(this.launchPrice, chainItemEntity.launchPrice) && Intrinsics.areEqual(this.currentPriceEth, chainItemEntity.currentPriceEth) && Intrinsics.areEqual(this.currentPriceUsd, chainItemEntity.currentPriceUsd) && Intrinsics.areEqual(this.lockAmount, chainItemEntity.lockAmount) && Intrinsics.areEqual(this.burnAmount, chainItemEntity.burnAmount) && Intrinsics.areEqual(this.otherAmount, chainItemEntity.otherAmount) && Intrinsics.areEqual(this.marketCap, chainItemEntity.marketCap) && Intrinsics.areEqual(this.fdv, chainItemEntity.fdv) && Intrinsics.areEqual(this.tvl, chainItemEntity.tvl) && Intrinsics.areEqual(this.token, chainItemEntity.token) && Intrinsics.areEqual(this.chain, chainItemEntity.chain) && Intrinsics.areEqual(this.decimal, chainItemEntity.decimal) && Intrinsics.areEqual(this.name, chainItemEntity.name) && Intrinsics.areEqual(this.symbol, chainItemEntity.symbol) && Intrinsics.areEqual(this.holders, chainItemEntity.holders) && Intrinsics.areEqual(this.logoUrl, chainItemEntity.logoUrl) && Intrinsics.areEqual(this.launchAt, chainItemEntity.launchAt) && Intrinsics.areEqual(this.createdAt, chainItemEntity.createdAt) && Intrinsics.areEqual(this.updatedAt, chainItemEntity.updatedAt) && Intrinsics.areEqual(this.tokenPriceChange, chainItemEntity.tokenPriceChange) && Intrinsics.areEqual(this.tokenTxVolumeUsd, chainItemEntity.tokenTxVolumeUsd) && Intrinsics.areEqual(this.tokenTxCount, chainItemEntity.tokenTxCount) && Intrinsics.areEqual(this.tokenBuyTxCount, chainItemEntity.tokenBuyTxCount) && Intrinsics.areEqual(this.tokenSellTxCount, chainItemEntity.tokenSellTxCount) && Intrinsics.areEqual(this.tokenMakers, chainItemEntity.tokenMakers) && Intrinsics.areEqual(this.tokenBuyers, chainItemEntity.tokenBuyers) && Intrinsics.areEqual(this.tokenSellers, chainItemEntity.tokenSellers) && this.hasMintMethod == chainItemEntity.hasMintMethod && Intrinsics.areEqual(this.auditLevel, chainItemEntity.auditLevel) && Intrinsics.areEqual(this.chainLogo, chainItemEntity.chainLogo) && Intrinsics.areEqual(this.securityScore, chainItemEntity.securityScore) && Intrinsics.areEqual(this.hotToken, chainItemEntity.hotToken) && this.hasNotRenounced == chainItemEntity.hasNotRenounced && this.hasNotOpenSource == chainItemEntity.hasNotOpenSource && Intrinsics.areEqual(this.dataSource, chainItemEntity.dataSource) && Intrinsics.areEqual(this.kcChain, chainItemEntity.kcChain) && this.lpNotLocked == chainItemEntity.lpNotLocked && this.inBlacklist == chainItemEntity.inBlacklist && this.honeypot == chainItemEntity.honeypot;
    }

    public ChainItemEntity(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable Integer num, @Nullable String str13, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable BigDecimal bigDecimal4, @Nullable String str14, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, boolean z11, @Nullable Integer num8, @Nullable String str15, @Nullable Integer num9, @Nullable Boolean bool, boolean z12, boolean z13, @Nullable String str16, @Nullable String str17, boolean z14, boolean z15, boolean z16) {
        this.total = str;
        this.launchPrice = bigDecimal;
        this.currentPriceEth = bigDecimal2;
        this.currentPriceUsd = bigDecimal3;
        this.lockAmount = str2;
        this.burnAmount = str3;
        this.otherAmount = str4;
        this.marketCap = str5;
        this.fdv = str6;
        this.tvl = str7;
        this.token = str8;
        this.chain = str9;
        this.decimal = str10;
        this.name = str11;
        this.symbol = str12;
        this.holders = num;
        this.logoUrl = str13;
        this.launchAt = l11;
        this.createdAt = l12;
        this.updatedAt = l13;
        this.tokenPriceChange = bigDecimal4;
        this.tokenTxVolumeUsd = str14;
        this.tokenTxCount = num2;
        this.tokenBuyTxCount = num3;
        this.tokenSellTxCount = num4;
        this.tokenMakers = num5;
        this.tokenBuyers = num6;
        this.tokenSellers = num7;
        this.hasMintMethod = z11;
        this.auditLevel = num8;
        this.chainLogo = str15;
        this.securityScore = num9;
        this.hotToken = bool;
        this.hasNotRenounced = z12;
        this.hasNotOpenSource = z13;
        this.dataSource = str16;
        this.kcChain = str17;
        this.lpNotLocked = z14;
        this.inBlacklist = z15;
        this.honeypot = z16;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTotal() {
        return this.total;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTvl() {
        return this.tvl;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getChain() {
        return this.chain;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDecimal() {
        return this.decimal;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getHolders() {
        return this.holders;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Long getLaunchAt() {
        return this.launchAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getLaunchPrice() {
        return this.launchPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final BigDecimal getTokenPriceChange() {
        return this.tokenPriceChange;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getTokenTxVolumeUsd() {
        return this.tokenTxVolumeUsd;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Integer getTokenTxCount() {
        return this.tokenTxCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Integer getTokenBuyTxCount() {
        return this.tokenBuyTxCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Integer getTokenSellTxCount() {
        return this.tokenSellTxCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Integer getTokenMakers() {
        return this.tokenMakers;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Integer getTokenBuyers() {
        return this.tokenBuyers;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Integer getTokenSellers() {
        return this.tokenSellers;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final boolean getHasMintMethod() {
        return this.hasMintMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getCurrentPriceEth() {
        return this.currentPriceEth;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Integer getAuditLevel() {
        return this.auditLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Integer getSecurityScore() {
        return this.securityScore;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Boolean getHotToken() {
        return this.hotToken;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final boolean getHasNotRenounced() {
        return this.hasNotRenounced;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final boolean getHasNotOpenSource() {
        return this.hasNotOpenSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getDataSource() {
        return this.dataSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getKcChain() {
        return this.kcChain;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final boolean getLpNotLocked() {
        return this.lpNotLocked;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final boolean getInBlacklist() {
        return this.inBlacklist;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getCurrentPriceUsd() {
        return this.currentPriceUsd;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final boolean getHoneypot() {
        return this.honeypot;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLockAmount() {
        return this.lockAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBurnAmount() {
        return this.burnAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOtherAmount() {
        return this.otherAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMarketCap() {
        return this.marketCap;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFdv() {
        return this.fdv;
    }

    @Nullable
    public final Integer getAuditLevel() {
        return this.auditLevel;
    }

    @Nullable
    public final String getBurnAmount() {
        return this.burnAmount;
    }

    @Nullable
    public final String getChain() {
        return this.chain;
    }

    @Nullable
    public final String getChainLogo() {
        return this.chainLogo;
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final BigDecimal getCurrentPriceEth() {
        return this.currentPriceEth;
    }

    @Nullable
    public final BigDecimal getCurrentPriceUsd() {
        return this.currentPriceUsd;
    }

    @Nullable
    public final String getDataSource() {
        return this.dataSource;
    }

    @Nullable
    public final String getDecimal() {
        return this.decimal;
    }

    @Nullable
    public final String getFdv() {
        return this.fdv;
    }

    public final boolean getHasMintMethod() {
        return this.hasMintMethod;
    }

    public final boolean getHasNotOpenSource() {
        return this.hasNotOpenSource;
    }

    public final boolean getHasNotRenounced() {
        return this.hasNotRenounced;
    }

    @Nullable
    public final Integer getHolders() {
        return this.holders;
    }

    public final boolean getHoneypot() {
        return this.honeypot;
    }

    @Nullable
    public final Boolean getHotToken() {
        return this.hotToken;
    }

    public final boolean getInBlacklist() {
        return this.inBlacklist;
    }

    @Nullable
    public final String getKcChain() {
        return this.kcChain;
    }

    @Nullable
    public final Long getLaunchAt() {
        return this.launchAt;
    }

    @Nullable
    public final BigDecimal getLaunchPrice() {
        return this.launchPrice;
    }

    @Nullable
    public final String getLockAmount() {
        return this.lockAmount;
    }

    @Nullable
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final boolean getLpNotLocked() {
        return this.lpNotLocked;
    }

    @Nullable
    public final String getMarketCap() {
        return this.marketCap;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getOtherAmount() {
        return this.otherAmount;
    }

    @Nullable
    public final Integer getSecurityScore() {
        return this.securityScore;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final Integer getTokenBuyTxCount() {
        return this.tokenBuyTxCount;
    }

    @Nullable
    public final Integer getTokenBuyers() {
        return this.tokenBuyers;
    }

    @Nullable
    public final Integer getTokenMakers() {
        return this.tokenMakers;
    }

    @Nullable
    public final BigDecimal getTokenPriceChange() {
        return this.tokenPriceChange;
    }

    @Nullable
    public final Integer getTokenSellTxCount() {
        return this.tokenSellTxCount;
    }

    @Nullable
    public final Integer getTokenSellers() {
        return this.tokenSellers;
    }

    @Nullable
    public final Integer getTokenTxCount() {
        return this.tokenTxCount;
    }

    @Nullable
    public final String getTokenTxVolumeUsd() {
        return this.tokenTxVolumeUsd;
    }

    @Nullable
    public final String getTotal() {
        return this.total;
    }

    @Nullable
    public final String getTvl() {
        return this.tvl;
    }

    @Nullable
    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        String str = this.total;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.launchPrice;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.currentPriceEth;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.currentPriceUsd;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str2 = this.lockAmount;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.burnAmount;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.otherAmount;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.marketCap;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fdv;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.tvl;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.token;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.chain;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.decimal;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.name;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.symbol;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num = this.holders;
        int iHashCode16 = (iHashCode15 + (num == null ? 0 : num.hashCode())) * 31;
        String str13 = this.logoUrl;
        int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Long l11 = this.launchAt;
        int iHashCode18 = (iHashCode17 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.createdAt;
        int iHashCode19 = (iHashCode18 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.updatedAt;
        int iHashCode20 = (iHashCode19 + (l13 == null ? 0 : l13.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.tokenPriceChange;
        int iHashCode21 = (iHashCode20 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str14 = this.tokenTxVolumeUsd;
        int iHashCode22 = (iHashCode21 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num2 = this.tokenTxCount;
        int iHashCode23 = (iHashCode22 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.tokenBuyTxCount;
        int iHashCode24 = (iHashCode23 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.tokenSellTxCount;
        int iHashCode25 = (iHashCode24 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.tokenMakers;
        int iHashCode26 = (iHashCode25 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.tokenBuyers;
        int iHashCode27 = (iHashCode26 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.tokenSellers;
        int iHashCode28 = (((iHashCode27 + (num7 == null ? 0 : num7.hashCode())) * 31) + Boolean.hashCode(this.hasMintMethod)) * 31;
        Integer num8 = this.auditLevel;
        int iHashCode29 = (iHashCode28 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str15 = this.chainLogo;
        int iHashCode30 = (iHashCode29 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num9 = this.securityScore;
        int iHashCode31 = (iHashCode30 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Boolean bool = this.hotToken;
        int iHashCode32 = (((((iHashCode31 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.hasNotRenounced)) * 31) + Boolean.hashCode(this.hasNotOpenSource)) * 31;
        String str16 = this.dataSource;
        int iHashCode33 = (iHashCode32 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.kcChain;
        return ((((((iHashCode33 + (str17 != null ? str17.hashCode() : 0)) * 31) + Boolean.hashCode(this.lpNotLocked)) * 31) + Boolean.hashCode(this.inBlacklist)) * 31) + Boolean.hashCode(this.honeypot);
    }

    public final void setAuditLevel(@Nullable Integer num) {
        this.auditLevel = num;
    }

    public final void setBurnAmount(@Nullable String str) {
        this.burnAmount = str;
    }

    public final void setChain(@Nullable String str) {
        this.chain = str;
    }

    public final void setChainLogo(@Nullable String str) {
        this.chainLogo = str;
    }

    public final void setCreatedAt(@Nullable Long l11) {
        this.createdAt = l11;
    }

    public final void setCurrentPriceEth(@Nullable BigDecimal bigDecimal) {
        this.currentPriceEth = bigDecimal;
    }

    public final void setCurrentPriceUsd(@Nullable BigDecimal bigDecimal) {
        this.currentPriceUsd = bigDecimal;
    }

    public final void setDataSource(@Nullable String str) {
        this.dataSource = str;
    }

    public final void setDecimal(@Nullable String str) {
        this.decimal = str;
    }

    public final void setFdv(@Nullable String str) {
        this.fdv = str;
    }

    public final void setHasMintMethod(boolean z11) {
        this.hasMintMethod = z11;
    }

    public final void setHasNotOpenSource(boolean z11) {
        this.hasNotOpenSource = z11;
    }

    public final void setHasNotRenounced(boolean z11) {
        this.hasNotRenounced = z11;
    }

    public final void setHolders(@Nullable Integer num) {
        this.holders = num;
    }

    public final void setHoneypot(boolean z11) {
        this.honeypot = z11;
    }

    public final void setHotToken(@Nullable Boolean bool) {
        this.hotToken = bool;
    }

    public final void setInBlacklist(boolean z11) {
        this.inBlacklist = z11;
    }

    public final void setKcChain(@Nullable String str) {
        this.kcChain = str;
    }

    public final void setLaunchAt(@Nullable Long l11) {
        this.launchAt = l11;
    }

    public final void setLaunchPrice(@Nullable BigDecimal bigDecimal) {
        this.launchPrice = bigDecimal;
    }

    public final void setLockAmount(@Nullable String str) {
        this.lockAmount = str;
    }

    public final void setLogoUrl(@Nullable String str) {
        this.logoUrl = str;
    }

    public final void setLpNotLocked(boolean z11) {
        this.lpNotLocked = z11;
    }

    public final void setMarketCap(@Nullable String str) {
        this.marketCap = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setOtherAmount(@Nullable String str) {
        this.otherAmount = str;
    }

    public final void setSecurityScore(@Nullable Integer num) {
        this.securityScore = num;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setToken(@Nullable String str) {
        this.token = str;
    }

    public final void setTokenBuyTxCount(@Nullable Integer num) {
        this.tokenBuyTxCount = num;
    }

    public final void setTokenBuyers(@Nullable Integer num) {
        this.tokenBuyers = num;
    }

    public final void setTokenMakers(@Nullable Integer num) {
        this.tokenMakers = num;
    }

    public final void setTokenPriceChange(@Nullable BigDecimal bigDecimal) {
        this.tokenPriceChange = bigDecimal;
    }

    public final void setTokenSellTxCount(@Nullable Integer num) {
        this.tokenSellTxCount = num;
    }

    public final void setTokenSellers(@Nullable Integer num) {
        this.tokenSellers = num;
    }

    public final void setTokenTxCount(@Nullable Integer num) {
        this.tokenTxCount = num;
    }

    public final void setTokenTxVolumeUsd(@Nullable String str) {
        this.tokenTxVolumeUsd = str;
    }

    public final void setTotal(@Nullable String str) {
        this.total = str;
    }

    public final void setTvl(@Nullable String str) {
        this.tvl = str;
    }

    public final void setUpdatedAt(@Nullable Long l11) {
        this.updatedAt = l11;
    }

    @NotNull
    public String toString() {
        return "ChainItemEntity(total=" + this.total + ", launchPrice=" + this.launchPrice + ", currentPriceEth=" + this.currentPriceEth + ", currentPriceUsd=" + this.currentPriceUsd + ", lockAmount=" + this.lockAmount + ", burnAmount=" + this.burnAmount + ", otherAmount=" + this.otherAmount + ", marketCap=" + this.marketCap + ", fdv=" + this.fdv + ", tvl=" + this.tvl + ", token=" + this.token + ", chain=" + this.chain + ", decimal=" + this.decimal + ", name=" + this.name + ", symbol=" + this.symbol + ", holders=" + this.holders + ", logoUrl=" + this.logoUrl + ", launchAt=" + this.launchAt + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", tokenPriceChange=" + this.tokenPriceChange + ", tokenTxVolumeUsd=" + this.tokenTxVolumeUsd + ", tokenTxCount=" + this.tokenTxCount + ", tokenBuyTxCount=" + this.tokenBuyTxCount + ", tokenSellTxCount=" + this.tokenSellTxCount + ", tokenMakers=" + this.tokenMakers + ", tokenBuyers=" + this.tokenBuyers + ", tokenSellers=" + this.tokenSellers + ", hasMintMethod=" + this.hasMintMethod + ", auditLevel=" + this.auditLevel + ", chainLogo=" + this.chainLogo + ", securityScore=" + this.securityScore + ", hotToken=" + this.hotToken + ", hasNotRenounced=" + this.hasNotRenounced + ", hasNotOpenSource=" + this.hasNotOpenSource + ", dataSource=" + this.dataSource + ", kcChain=" + this.kcChain + ", lpNotLocked=" + this.lpNotLocked + ", inBlacklist=" + this.inBlacklist + ", honeypot=" + this.honeypot + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.total);
        dest.writeSerializable(this.launchPrice);
        dest.writeSerializable(this.currentPriceEth);
        dest.writeSerializable(this.currentPriceUsd);
        dest.writeString(this.lockAmount);
        dest.writeString(this.burnAmount);
        dest.writeString(this.otherAmount);
        dest.writeString(this.marketCap);
        dest.writeString(this.fdv);
        dest.writeString(this.tvl);
        dest.writeString(this.token);
        dest.writeString(this.chain);
        dest.writeString(this.decimal);
        dest.writeString(this.name);
        dest.writeString(this.symbol);
        Integer num = this.holders;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.logoUrl);
        Long l11 = this.launchAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.createdAt;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        Long l13 = this.updatedAt;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l13.longValue());
        }
        dest.writeSerializable(this.tokenPriceChange);
        dest.writeString(this.tokenTxVolumeUsd);
        Integer num2 = this.tokenTxCount;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.tokenBuyTxCount;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        Integer num4 = this.tokenSellTxCount;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
        Integer num5 = this.tokenMakers;
        if (num5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num5.intValue());
        }
        Integer num6 = this.tokenBuyers;
        if (num6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num6.intValue());
        }
        Integer num7 = this.tokenSellers;
        if (num7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num7.intValue());
        }
        dest.writeInt(this.hasMintMethod ? 1 : 0);
        Integer num8 = this.auditLevel;
        if (num8 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num8.intValue());
        }
        dest.writeString(this.chainLogo);
        Integer num9 = this.securityScore;
        if (num9 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num9.intValue());
        }
        Boolean bool = this.hotToken;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeInt(this.hasNotRenounced ? 1 : 0);
        dest.writeInt(this.hasNotOpenSource ? 1 : 0);
        dest.writeString(this.dataSource);
        dest.writeString(this.kcChain);
        dest.writeInt(this.lpNotLocked ? 1 : 0);
        dest.writeInt(this.inBlacklist ? 1 : 0);
        dest.writeInt(this.honeypot ? 1 : 0);
    }

    public /* synthetic */ ChainItemEntity(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, Long l11, Long l12, Long l13, BigDecimal bigDecimal4, String str14, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, boolean z11, Integer num8, String str15, Integer num9, Boolean bool, boolean z12, boolean z13, String str16, String str17, boolean z14, boolean z15, boolean z16, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : bigDecimal3, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? null : str5, (i11 & 256) != 0 ? null : str6, (i11 & 512) != 0 ? null : str7, (i11 & 1024) != 0 ? null : str8, (i11 & 2048) != 0 ? null : str9, (i11 & 4096) != 0 ? null : str10, (i11 & 8192) != 0 ? null : str11, (i11 & 16384) != 0 ? null : str12, (i11 & 32768) != 0 ? null : num, (i11 & 65536) != 0 ? null : str13, (i11 & 131072) != 0 ? null : l11, (i11 & 262144) != 0 ? null : l12, (i11 & 524288) != 0 ? null : l13, (i11 & 1048576) != 0 ? null : bigDecimal4, (i11 & 2097152) != 0 ? null : str14, (i11 & 4194304) != 0 ? null : num2, (i11 & 8388608) != 0 ? null : num3, (i11 & 16777216) != 0 ? null : num4, (i11 & 33554432) != 0 ? null : num5, (i11 & 67108864) != 0 ? null : num6, (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : num7, (i11 & 268435456) != 0 ? true : z11, (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : num8, (i11 & 1073741824) != 0 ? null : str15, (i11 & Integer.MIN_VALUE) != 0 ? null : num9, (i12 & 1) != 0 ? Boolean.FALSE : bool, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? true : z13, (i12 & 8) != 0 ? null : str16, (i12 & 16) != 0 ? null : str17, (i12 & 32) != 0 ? true : z14, (i12 & 64) != 0 ? true : z15, (i12 & 128) != 0 ? true : z16);
    }
}
