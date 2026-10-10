package com.kubi.unify.entity;

import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.google.gson.annotations.SerializedName;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.kubi.unify.unify.mapper.PositionMapper;
import com.tencent.qcloud.tuicore.TUIConstants;
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
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\bS\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bç\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b.\u0010/J\u0006\u0010q\u001a\u00020rJ\u000e\u0010s\u001a\u00020\u00002\u0006\u0010t\u001a\u00020uJ\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010|\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010}\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010;J\u000b\u0010~\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010SJ\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010SJ\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jð\u0003\u0010\u009e\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0003\u0010\u009f\u0001J\u0015\u0010 \u0001\u001a\u00020\u001e2\t\u0010¡\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010¢\u0001\u001a\u00030£\u0001HÖ\u0001J\n\u0010¤\u0001\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b5\u00104R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00104\"\u0004\b7\u00108R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b9\u00104R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010<\u001a\u0004\b:\u0010;R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010<\u001a\u0004\b=\u0010;R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00104\"\u0004\b?\u00108R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00104\"\u0004\bA\u00108R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u00104\"\u0004\bC\u00108R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00104\"\u0004\bE\u00108R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u00104\"\u0004\bG\u00108R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bH\u00104R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u00101R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u00101R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bK\u00104R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bL\u00104R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bM\u00104R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bN\u00104R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bO\u00104R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bP\u00104R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bQ\u00104R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bR\u00104R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010T\u001a\u0004\b\u001d\u0010SR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u00101R\u001c\u0010 \u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u00104\"\u0004\bW\u00108R\u001c\u0010!\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u00104\"\u0004\bY\u00108R \u0010\"\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u00104\"\u0004\b[\u00108R \u0010#\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u00104\"\u0004\b]\u00108R \u0010$\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u00104\"\u0004\b_\u00108R\u0013\u0010%\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b`\u00104R \u0010&\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u00104\"\u0004\bb\u00108R \u0010'\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u00104\"\u0004\bd\u00108R\u001c\u0010(\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u00104\"\u0004\bf\u00108R\u001e\u0010)\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010T\u001a\u0004\b)\u0010S\"\u0004\bg\u0010hR\u001c\u0010*\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u00104\"\u0004\bj\u00108R\u001c\u0010+\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u00104\"\u0004\bl\u00108R\u001c\u0010,\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u00104\"\u0004\bn\u00108R\u001c\u0010-\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u00104\"\u0004\bp\u00108¨\u0006¥\u0001"}, m90084d2 = {"Lcom/kubi/unify/entity/UnifyPositionEntity;", "", "positionId", "", "positionSide", "currentQuantity", "Ljava/math/BigDecimal;", "avgPrice", "leverage", "unrealisedCost", "openTime", "", "currentTimestamp", "cumulativeTax", "cumulativeFundingFee", "cumulativeTradeFee", "realisedCost", "realisedGrossCost", "markPrice", "symbol", "settleCurrency", "posCost", "currentCost", "currentComm", "posComm", "posMargin", "posMaint", "posInit", "markValue", "isOpen", "", "marginMode", "adlPercentage", "liquidationPrice", "maintMargin", "unrealisedRoePcnt", KlineFlutterMiniConstants.PROP_LATEST_PRICE, "lastTradePriceValue", "latestUnrealisedPnl", "latestUnrealisedRoePcnt", "riskRatio", "isTrialFunds", "bestBid", "bestAsk", "imr", "mmr", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getPositionId", "()Ljava/lang/String;", "getPositionSide", "getCurrentQuantity", "()Ljava/math/BigDecimal;", "getAvgPrice", "getLeverage", "setLeverage", "(Ljava/math/BigDecimal;)V", "getUnrealisedCost", "getOpenTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrentTimestamp", "getCumulativeTax", "setCumulativeTax", "getCumulativeFundingFee", "setCumulativeFundingFee", "getCumulativeTradeFee", "setCumulativeTradeFee", "getRealisedCost", "setRealisedCost", "getRealisedGrossCost", "setRealisedGrossCost", "getMarkPrice", "getSymbol", "getSettleCurrency", "getPosCost", "getCurrentCost", "getCurrentComm", "getPosComm", "getPosMargin", "getPosMaint", "getPosInit", "getMarkValue", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMarginMode", "getAdlPercentage", "setAdlPercentage", "getLiquidationPrice", "setLiquidationPrice", "getMaintMargin", "setMaintMargin", "getUnrealisedRoePcnt", "setUnrealisedRoePcnt", "getLatestPrice", "setLatestPrice", "getLastTradePriceValue", "getLatestUnrealisedPnl", "setLatestUnrealisedPnl", "getLatestUnrealisedRoePcnt", "setLatestUnrealisedRoePcnt", "getRiskRatio", "setRiskRatio", "setTrialFunds", "(Ljava/lang/Boolean;)V", "getBestBid", "setBestBid", "getBestAsk", "setBestAsk", "getImr", "setImr", "getMmr", "setMmr", "toPositionEntity", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "copyFromWs", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/unify/entity/WsUnifyPositionEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/unify/entity/UnifyPositionEntity;", "equals", "other", "hashCode", "", "toString", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyPositionEntity {

    @Nullable
    private BigDecimal adlPercentage;

    @Nullable
    private final BigDecimal avgPrice;

    @Nullable
    private BigDecimal bestAsk;

    @Nullable
    private BigDecimal bestBid;

    @Nullable
    private BigDecimal cumulativeFundingFee;

    @Nullable
    private BigDecimal cumulativeTax;

    @Nullable
    private BigDecimal cumulativeTradeFee;

    @Nullable
    private final BigDecimal currentComm;

    @Nullable
    private final BigDecimal currentCost;

    @Nullable
    private final BigDecimal currentQuantity;

    @Nullable
    private final Long currentTimestamp;

    @Nullable
    private BigDecimal imr;

    @Nullable
    private final Boolean isOpen;

    @Nullable
    private Boolean isTrialFunds;

    @Nullable
    private final BigDecimal lastTradePriceValue;

    @SerializedName("lastTradePrice")
    @Nullable
    private BigDecimal latestPrice;

    @SerializedName("lastTradePriceUnrealisedCost")
    @Nullable
    private BigDecimal latestUnrealisedPnl;

    @SerializedName("lastTradePriceRoi")
    @Nullable
    private BigDecimal latestUnrealisedRoePcnt;

    @Nullable
    private BigDecimal leverage;

    @Nullable
    private BigDecimal liquidationPrice;

    @SerializedName("maintenanceMargin")
    @Nullable
    private BigDecimal maintMargin;

    @Nullable
    private final String marginMode;

    @Nullable
    private final BigDecimal markPrice;

    @Nullable
    private final BigDecimal markValue;

    @Nullable
    private BigDecimal mmr;

    @Nullable
    private final Long openTime;

    @Nullable
    private final BigDecimal posComm;

    @Nullable
    private final BigDecimal posCost;

    @Nullable
    private final BigDecimal posInit;

    @Nullable
    private final BigDecimal posMaint;

    @Nullable
    private final BigDecimal posMargin;

    @Nullable
    private final String positionId;

    @Nullable
    private final String positionSide;

    @Nullable
    private BigDecimal realisedCost;

    @Nullable
    private BigDecimal realisedGrossCost;

    @Nullable
    private BigDecimal riskRatio;

    @Nullable
    private final String settleCurrency;

    @Nullable
    private final String symbol;

    @Nullable
    private final BigDecimal unrealisedCost;

    @SerializedName("markPriceRoi")
    @Nullable
    private BigDecimal unrealisedRoePcnt;

    public UnifyPositionEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 255, null);
    }

    public static /* synthetic */ UnifyPositionEntity copy$default(UnifyPositionEntity unifyPositionEntity, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, Long l11, Long l12, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, String str3, String str4, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, BigDecimal bigDecimal15, BigDecimal bigDecimal16, BigDecimal bigDecimal17, BigDecimal bigDecimal18, Boolean bool, String str5, BigDecimal bigDecimal19, BigDecimal bigDecimal20, BigDecimal bigDecimal21, BigDecimal bigDecimal22, BigDecimal bigDecimal23, BigDecimal bigDecimal24, BigDecimal bigDecimal25, BigDecimal bigDecimal26, BigDecimal bigDecimal27, Boolean bool2, BigDecimal bigDecimal28, BigDecimal bigDecimal29, BigDecimal bigDecimal30, BigDecimal bigDecimal31, int i11, int i12, Object obj) {
        return unifyPositionEntity.copy((i11 & 1) != 0 ? unifyPositionEntity.positionId : str, (i11 & 2) != 0 ? unifyPositionEntity.positionSide : str2, (i11 & 4) != 0 ? unifyPositionEntity.currentQuantity : bigDecimal, (i11 & 8) != 0 ? unifyPositionEntity.avgPrice : bigDecimal2, (i11 & 16) != 0 ? unifyPositionEntity.leverage : bigDecimal3, (i11 & 32) != 0 ? unifyPositionEntity.unrealisedCost : bigDecimal4, (i11 & 64) != 0 ? unifyPositionEntity.openTime : l11, (i11 & 128) != 0 ? unifyPositionEntity.currentTimestamp : l12, (i11 & 256) != 0 ? unifyPositionEntity.cumulativeTax : bigDecimal5, (i11 & 512) != 0 ? unifyPositionEntity.cumulativeFundingFee : bigDecimal6, (i11 & 1024) != 0 ? unifyPositionEntity.cumulativeTradeFee : bigDecimal7, (i11 & 2048) != 0 ? unifyPositionEntity.realisedCost : bigDecimal8, (i11 & 4096) != 0 ? unifyPositionEntity.realisedGrossCost : bigDecimal9, (i11 & 8192) != 0 ? unifyPositionEntity.markPrice : bigDecimal10, (i11 & 16384) != 0 ? unifyPositionEntity.symbol : str3, (i11 & 32768) != 0 ? unifyPositionEntity.settleCurrency : str4, (i11 & 65536) != 0 ? unifyPositionEntity.posCost : bigDecimal11, (i11 & 131072) != 0 ? unifyPositionEntity.currentCost : bigDecimal12, (i11 & 262144) != 0 ? unifyPositionEntity.currentComm : bigDecimal13, (i11 & 524288) != 0 ? unifyPositionEntity.posComm : bigDecimal14, (i11 & 1048576) != 0 ? unifyPositionEntity.posMargin : bigDecimal15, (i11 & 2097152) != 0 ? unifyPositionEntity.posMaint : bigDecimal16, (i11 & 4194304) != 0 ? unifyPositionEntity.posInit : bigDecimal17, (i11 & 8388608) != 0 ? unifyPositionEntity.markValue : bigDecimal18, (i11 & 16777216) != 0 ? unifyPositionEntity.isOpen : bool, (i11 & 33554432) != 0 ? unifyPositionEntity.marginMode : str5, (i11 & 67108864) != 0 ? unifyPositionEntity.adlPercentage : bigDecimal19, (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? unifyPositionEntity.liquidationPrice : bigDecimal20, (i11 & 268435456) != 0 ? unifyPositionEntity.maintMargin : bigDecimal21, (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? unifyPositionEntity.unrealisedRoePcnt : bigDecimal22, (i11 & 1073741824) != 0 ? unifyPositionEntity.latestPrice : bigDecimal23, (i11 & Integer.MIN_VALUE) != 0 ? unifyPositionEntity.lastTradePriceValue : bigDecimal24, (i12 & 1) != 0 ? unifyPositionEntity.latestUnrealisedPnl : bigDecimal25, (i12 & 2) != 0 ? unifyPositionEntity.latestUnrealisedRoePcnt : bigDecimal26, (i12 & 4) != 0 ? unifyPositionEntity.riskRatio : bigDecimal27, (i12 & 8) != 0 ? unifyPositionEntity.isTrialFunds : bool2, (i12 & 16) != 0 ? unifyPositionEntity.bestBid : bigDecimal28, (i12 & 32) != 0 ? unifyPositionEntity.bestAsk : bigDecimal29, (i12 & 64) != 0 ? unifyPositionEntity.imr : bigDecimal30, (i12 & 128) != 0 ? unifyPositionEntity.mmr : bigDecimal31);
    }

    @NotNull
    public final UnifyPositionEntity copy(@Nullable String positionId, @Nullable String positionSide, @Nullable BigDecimal currentQuantity, @Nullable BigDecimal avgPrice, @Nullable BigDecimal leverage, @Nullable BigDecimal unrealisedCost, @Nullable Long openTime, @Nullable Long currentTimestamp, @Nullable BigDecimal cumulativeTax, @Nullable BigDecimal cumulativeFundingFee, @Nullable BigDecimal cumulativeTradeFee, @Nullable BigDecimal realisedCost, @Nullable BigDecimal realisedGrossCost, @Nullable BigDecimal markPrice, @Nullable String symbol, @Nullable String settleCurrency, @Nullable BigDecimal posCost, @Nullable BigDecimal currentCost, @Nullable BigDecimal currentComm, @Nullable BigDecimal posComm, @Nullable BigDecimal posMargin, @Nullable BigDecimal posMaint, @Nullable BigDecimal posInit, @Nullable BigDecimal markValue, @Nullable Boolean isOpen, @Nullable String marginMode, @Nullable BigDecimal adlPercentage, @Nullable BigDecimal liquidationPrice, @Nullable BigDecimal maintMargin, @Nullable BigDecimal unrealisedRoePcnt, @Nullable BigDecimal latestPrice, @Nullable BigDecimal lastTradePriceValue, @Nullable BigDecimal latestUnrealisedPnl, @Nullable BigDecimal latestUnrealisedRoePcnt, @Nullable BigDecimal riskRatio, @Nullable Boolean isTrialFunds, @Nullable BigDecimal bestBid, @Nullable BigDecimal bestAsk, @Nullable BigDecimal imr, @Nullable BigDecimal mmr) {
        return new UnifyPositionEntity(positionId, positionSide, currentQuantity, avgPrice, leverage, unrealisedCost, openTime, currentTimestamp, cumulativeTax, cumulativeFundingFee, cumulativeTradeFee, realisedCost, realisedGrossCost, markPrice, symbol, settleCurrency, posCost, currentCost, currentComm, posComm, posMargin, posMaint, posInit, markValue, isOpen, marginMode, adlPercentage, liquidationPrice, maintMargin, unrealisedRoePcnt, latestPrice, lastTradePriceValue, latestUnrealisedPnl, latestUnrealisedRoePcnt, riskRatio, isTrialFunds, bestBid, bestAsk, imr, mmr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifyPositionEntity)) {
            return false;
        }
        UnifyPositionEntity unifyPositionEntity = (UnifyPositionEntity) other;
        return Intrinsics.areEqual(this.positionId, unifyPositionEntity.positionId) && Intrinsics.areEqual(this.positionSide, unifyPositionEntity.positionSide) && Intrinsics.areEqual(this.currentQuantity, unifyPositionEntity.currentQuantity) && Intrinsics.areEqual(this.avgPrice, unifyPositionEntity.avgPrice) && Intrinsics.areEqual(this.leverage, unifyPositionEntity.leverage) && Intrinsics.areEqual(this.unrealisedCost, unifyPositionEntity.unrealisedCost) && Intrinsics.areEqual(this.openTime, unifyPositionEntity.openTime) && Intrinsics.areEqual(this.currentTimestamp, unifyPositionEntity.currentTimestamp) && Intrinsics.areEqual(this.cumulativeTax, unifyPositionEntity.cumulativeTax) && Intrinsics.areEqual(this.cumulativeFundingFee, unifyPositionEntity.cumulativeFundingFee) && Intrinsics.areEqual(this.cumulativeTradeFee, unifyPositionEntity.cumulativeTradeFee) && Intrinsics.areEqual(this.realisedCost, unifyPositionEntity.realisedCost) && Intrinsics.areEqual(this.realisedGrossCost, unifyPositionEntity.realisedGrossCost) && Intrinsics.areEqual(this.markPrice, unifyPositionEntity.markPrice) && Intrinsics.areEqual(this.symbol, unifyPositionEntity.symbol) && Intrinsics.areEqual(this.settleCurrency, unifyPositionEntity.settleCurrency) && Intrinsics.areEqual(this.posCost, unifyPositionEntity.posCost) && Intrinsics.areEqual(this.currentCost, unifyPositionEntity.currentCost) && Intrinsics.areEqual(this.currentComm, unifyPositionEntity.currentComm) && Intrinsics.areEqual(this.posComm, unifyPositionEntity.posComm) && Intrinsics.areEqual(this.posMargin, unifyPositionEntity.posMargin) && Intrinsics.areEqual(this.posMaint, unifyPositionEntity.posMaint) && Intrinsics.areEqual(this.posInit, unifyPositionEntity.posInit) && Intrinsics.areEqual(this.markValue, unifyPositionEntity.markValue) && Intrinsics.areEqual(this.isOpen, unifyPositionEntity.isOpen) && Intrinsics.areEqual(this.marginMode, unifyPositionEntity.marginMode) && Intrinsics.areEqual(this.adlPercentage, unifyPositionEntity.adlPercentage) && Intrinsics.areEqual(this.liquidationPrice, unifyPositionEntity.liquidationPrice) && Intrinsics.areEqual(this.maintMargin, unifyPositionEntity.maintMargin) && Intrinsics.areEqual(this.unrealisedRoePcnt, unifyPositionEntity.unrealisedRoePcnt) && Intrinsics.areEqual(this.latestPrice, unifyPositionEntity.latestPrice) && Intrinsics.areEqual(this.lastTradePriceValue, unifyPositionEntity.lastTradePriceValue) && Intrinsics.areEqual(this.latestUnrealisedPnl, unifyPositionEntity.latestUnrealisedPnl) && Intrinsics.areEqual(this.latestUnrealisedRoePcnt, unifyPositionEntity.latestUnrealisedRoePcnt) && Intrinsics.areEqual(this.riskRatio, unifyPositionEntity.riskRatio) && Intrinsics.areEqual(this.isTrialFunds, unifyPositionEntity.isTrialFunds) && Intrinsics.areEqual(this.bestBid, unifyPositionEntity.bestBid) && Intrinsics.areEqual(this.bestAsk, unifyPositionEntity.bestAsk) && Intrinsics.areEqual(this.imr, unifyPositionEntity.imr) && Intrinsics.areEqual(this.mmr, unifyPositionEntity.mmr);
    }

    public int hashCode() {
        String str = this.positionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.positionSide;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.currentQuantity;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.avgPrice;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.leverage;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.unrealisedCost;
        int iHashCode6 = (iHashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        Long l11 = this.openTime;
        int iHashCode7 = (iHashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.currentTimestamp;
        int iHashCode8 = (iHashCode7 + (l12 == null ? 0 : l12.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.cumulativeTax;
        int iHashCode9 = (iHashCode8 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.cumulativeFundingFee;
        int iHashCode10 = (iHashCode9 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.cumulativeTradeFee;
        int iHashCode11 = (iHashCode10 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.realisedCost;
        int iHashCode12 = (iHashCode11 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.realisedGrossCost;
        int iHashCode13 = (iHashCode12 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.markPrice;
        int iHashCode14 = (iHashCode13 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        String str3 = this.symbol;
        int iHashCode15 = (iHashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.settleCurrency;
        int iHashCode16 = (iHashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.posCost;
        int iHashCode17 = (iHashCode16 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.currentCost;
        int iHashCode18 = (iHashCode17 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        BigDecimal bigDecimal13 = this.currentComm;
        int iHashCode19 = (iHashCode18 + (bigDecimal13 == null ? 0 : bigDecimal13.hashCode())) * 31;
        BigDecimal bigDecimal14 = this.posComm;
        int iHashCode20 = (iHashCode19 + (bigDecimal14 == null ? 0 : bigDecimal14.hashCode())) * 31;
        BigDecimal bigDecimal15 = this.posMargin;
        int iHashCode21 = (iHashCode20 + (bigDecimal15 == null ? 0 : bigDecimal15.hashCode())) * 31;
        BigDecimal bigDecimal16 = this.posMaint;
        int iHashCode22 = (iHashCode21 + (bigDecimal16 == null ? 0 : bigDecimal16.hashCode())) * 31;
        BigDecimal bigDecimal17 = this.posInit;
        int iHashCode23 = (iHashCode22 + (bigDecimal17 == null ? 0 : bigDecimal17.hashCode())) * 31;
        BigDecimal bigDecimal18 = this.markValue;
        int iHashCode24 = (iHashCode23 + (bigDecimal18 == null ? 0 : bigDecimal18.hashCode())) * 31;
        Boolean bool = this.isOpen;
        int iHashCode25 = (iHashCode24 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.marginMode;
        int iHashCode26 = (iHashCode25 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal19 = this.adlPercentage;
        int iHashCode27 = (iHashCode26 + (bigDecimal19 == null ? 0 : bigDecimal19.hashCode())) * 31;
        BigDecimal bigDecimal20 = this.liquidationPrice;
        int iHashCode28 = (iHashCode27 + (bigDecimal20 == null ? 0 : bigDecimal20.hashCode())) * 31;
        BigDecimal bigDecimal21 = this.maintMargin;
        int iHashCode29 = (iHashCode28 + (bigDecimal21 == null ? 0 : bigDecimal21.hashCode())) * 31;
        BigDecimal bigDecimal22 = this.unrealisedRoePcnt;
        int iHashCode30 = (iHashCode29 + (bigDecimal22 == null ? 0 : bigDecimal22.hashCode())) * 31;
        BigDecimal bigDecimal23 = this.latestPrice;
        int iHashCode31 = (iHashCode30 + (bigDecimal23 == null ? 0 : bigDecimal23.hashCode())) * 31;
        BigDecimal bigDecimal24 = this.lastTradePriceValue;
        int iHashCode32 = (iHashCode31 + (bigDecimal24 == null ? 0 : bigDecimal24.hashCode())) * 31;
        BigDecimal bigDecimal25 = this.latestUnrealisedPnl;
        int iHashCode33 = (iHashCode32 + (bigDecimal25 == null ? 0 : bigDecimal25.hashCode())) * 31;
        BigDecimal bigDecimal26 = this.latestUnrealisedRoePcnt;
        int iHashCode34 = (iHashCode33 + (bigDecimal26 == null ? 0 : bigDecimal26.hashCode())) * 31;
        BigDecimal bigDecimal27 = this.riskRatio;
        int iHashCode35 = (iHashCode34 + (bigDecimal27 == null ? 0 : bigDecimal27.hashCode())) * 31;
        Boolean bool2 = this.isTrialFunds;
        int iHashCode36 = (iHashCode35 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        BigDecimal bigDecimal28 = this.bestBid;
        int iHashCode37 = (iHashCode36 + (bigDecimal28 == null ? 0 : bigDecimal28.hashCode())) * 31;
        BigDecimal bigDecimal29 = this.bestAsk;
        int iHashCode38 = (iHashCode37 + (bigDecimal29 == null ? 0 : bigDecimal29.hashCode())) * 31;
        BigDecimal bigDecimal30 = this.imr;
        int iHashCode39 = (iHashCode38 + (bigDecimal30 == null ? 0 : bigDecimal30.hashCode())) * 31;
        BigDecimal bigDecimal31 = this.mmr;
        return iHashCode39 + (bigDecimal31 != null ? bigDecimal31.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnifyPositionEntity(positionId=" + this.positionId + ", positionSide=" + this.positionSide + ", currentQuantity=" + this.currentQuantity + ", avgPrice=" + this.avgPrice + ", leverage=" + this.leverage + ", unrealisedCost=" + this.unrealisedCost + ", openTime=" + this.openTime + ", currentTimestamp=" + this.currentTimestamp + ", cumulativeTax=" + this.cumulativeTax + ", cumulativeFundingFee=" + this.cumulativeFundingFee + ", cumulativeTradeFee=" + this.cumulativeTradeFee + ", realisedCost=" + this.realisedCost + ", realisedGrossCost=" + this.realisedGrossCost + ", markPrice=" + this.markPrice + ", symbol=" + this.symbol + ", settleCurrency=" + this.settleCurrency + ", posCost=" + this.posCost + ", currentCost=" + this.currentCost + ", currentComm=" + this.currentComm + ", posComm=" + this.posComm + ", posMargin=" + this.posMargin + ", posMaint=" + this.posMaint + ", posInit=" + this.posInit + ", markValue=" + this.markValue + ", isOpen=" + this.isOpen + ", marginMode=" + this.marginMode + ", adlPercentage=" + this.adlPercentage + ", liquidationPrice=" + this.liquidationPrice + ", maintMargin=" + this.maintMargin + ", unrealisedRoePcnt=" + this.unrealisedRoePcnt + ", latestPrice=" + this.latestPrice + ", lastTradePriceValue=" + this.lastTradePriceValue + ", latestUnrealisedPnl=" + this.latestUnrealisedPnl + ", latestUnrealisedRoePcnt=" + this.latestUnrealisedRoePcnt + ", riskRatio=" + this.riskRatio + ", isTrialFunds=" + this.isTrialFunds + ", bestBid=" + this.bestBid + ", bestAsk=" + this.bestAsk + ", imr=" + this.imr + ", mmr=" + this.mmr + ')';
    }

    public UnifyPositionEntity(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable Long l11, @Nullable Long l12, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable String str3, @Nullable String str4, @Nullable BigDecimal bigDecimal11, @Nullable BigDecimal bigDecimal12, @Nullable BigDecimal bigDecimal13, @Nullable BigDecimal bigDecimal14, @Nullable BigDecimal bigDecimal15, @Nullable BigDecimal bigDecimal16, @Nullable BigDecimal bigDecimal17, @Nullable BigDecimal bigDecimal18, @Nullable Boolean bool, @Nullable String str5, @Nullable BigDecimal bigDecimal19, @Nullable BigDecimal bigDecimal20, @Nullable BigDecimal bigDecimal21, @Nullable BigDecimal bigDecimal22, @Nullable BigDecimal bigDecimal23, @Nullable BigDecimal bigDecimal24, @Nullable BigDecimal bigDecimal25, @Nullable BigDecimal bigDecimal26, @Nullable BigDecimal bigDecimal27, @Nullable Boolean bool2, @Nullable BigDecimal bigDecimal28, @Nullable BigDecimal bigDecimal29, @Nullable BigDecimal bigDecimal30, @Nullable BigDecimal bigDecimal31) {
        this.positionId = str;
        this.positionSide = str2;
        this.currentQuantity = bigDecimal;
        this.avgPrice = bigDecimal2;
        this.leverage = bigDecimal3;
        this.unrealisedCost = bigDecimal4;
        this.openTime = l11;
        this.currentTimestamp = l12;
        this.cumulativeTax = bigDecimal5;
        this.cumulativeFundingFee = bigDecimal6;
        this.cumulativeTradeFee = bigDecimal7;
        this.realisedCost = bigDecimal8;
        this.realisedGrossCost = bigDecimal9;
        this.markPrice = bigDecimal10;
        this.symbol = str3;
        this.settleCurrency = str4;
        this.posCost = bigDecimal11;
        this.currentCost = bigDecimal12;
        this.currentComm = bigDecimal13;
        this.posComm = bigDecimal14;
        this.posMargin = bigDecimal15;
        this.posMaint = bigDecimal16;
        this.posInit = bigDecimal17;
        this.markValue = bigDecimal18;
        this.isOpen = bool;
        this.marginMode = str5;
        this.adlPercentage = bigDecimal19;
        this.liquidationPrice = bigDecimal20;
        this.maintMargin = bigDecimal21;
        this.unrealisedRoePcnt = bigDecimal22;
        this.latestPrice = bigDecimal23;
        this.lastTradePriceValue = bigDecimal24;
        this.latestUnrealisedPnl = bigDecimal25;
        this.latestUnrealisedRoePcnt = bigDecimal26;
        this.riskRatio = bigDecimal27;
        this.isTrialFunds = bool2;
        this.bestBid = bigDecimal28;
        this.bestAsk = bigDecimal29;
        this.imr = bigDecimal30;
        this.mmr = bigDecimal31;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPositionId() {
        return this.positionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getCumulativeFundingFee() {
        return this.cumulativeFundingFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getCumulativeTradeFee() {
        return this.cumulativeTradeFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getRealisedCost() {
        return this.realisedCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getRealisedGrossCost() {
        return this.realisedGrossCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getSettleCurrency() {
        return this.settleCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final BigDecimal getPosCost() {
        return this.posCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final BigDecimal getCurrentCost() {
        return this.currentCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final BigDecimal getCurrentComm() {
        return this.currentComm;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final BigDecimal getPosComm() {
        return this.posComm;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final BigDecimal getPosMargin() {
        return this.posMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final BigDecimal getPosMaint() {
        return this.posMaint;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final BigDecimal getPosInit() {
        return this.posInit;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final BigDecimal getMarkValue() {
        return this.markValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Boolean getIsOpen() {
        return this.isOpen;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final BigDecimal getAdlPercentage() {
        return this.adlPercentage;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final BigDecimal getLiquidationPrice() {
        return this.liquidationPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final BigDecimal getMaintMargin() {
        return this.maintMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getCurrentQuantity() {
        return this.currentQuantity;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final BigDecimal getUnrealisedRoePcnt() {
        return this.unrealisedRoePcnt;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final BigDecimal getLatestPrice() {
        return this.latestPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final BigDecimal getLastTradePriceValue() {
        return this.lastTradePriceValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final BigDecimal getLatestUnrealisedPnl() {
        return this.latestUnrealisedPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final BigDecimal getLatestUnrealisedRoePcnt() {
        return this.latestUnrealisedRoePcnt;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final BigDecimal getRiskRatio() {
        return this.riskRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final Boolean getIsTrialFunds() {
        return this.isTrialFunds;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final BigDecimal getBestBid() {
        return this.bestBid;
    }

    @Nullable
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final BigDecimal getBestAsk() {
        return this.bestAsk;
    }

    @Nullable
    /* JADX INFO: renamed from: component39, reason: from getter */
    public final BigDecimal getImr() {
        return this.imr;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getAvgPrice() {
        return this.avgPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component40, reason: from getter */
    public final BigDecimal getMmr() {
        return this.mmr;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getUnrealisedCost() {
        return this.unrealisedCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getOpenTime() {
        return this.openTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getCurrentTimestamp() {
        return this.currentTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getCumulativeTax() {
        return this.cumulativeTax;
    }

    @NotNull
    public final UnifyPositionEntity copyFromWs(@NotNull WsUnifyPositionEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        String positionId = entity.getPositionId();
        BigDecimal currentQuantity = entity.getCurrentQuantity();
        BigDecimal leverage = entity.getLeverage();
        BigDecimal unrealisedCost = entity.getUnrealisedCost();
        BigDecimal markPrice = entity.getMarkPrice();
        String symbol = entity.getSymbol();
        BigDecimal markValue = entity.getMarkValue();
        BigDecimal bigDecimal = this.posMargin;
        BigDecimal liquidationPrice = entity.getLiquidationPrice();
        BigDecimal unrealisedRoePcnt = entity.getUnrealisedRoePcnt();
        BigDecimal latestPrice = entity.getLatestPrice();
        BigDecimal latestUnrealisedPnl = entity.getLatestUnrealisedPnl();
        BigDecimal latestUnrealisedRoePcnt = entity.getLatestUnrealisedRoePcnt();
        BigDecimal imr = entity.getImr();
        BigDecimal mmr = entity.getMmr();
        BigDecimal posMaint = entity.getPosMaint();
        BigDecimal r11 = entity.getR();
        if (r11 == null) {
            r11 = this.riskRatio;
        }
        return copy$default(this, positionId, null, currentQuantity, null, leverage, unrealisedCost, null, null, null, null, null, null, null, markPrice, symbol, null, null, null, null, null, bigDecimal, posMaint, null, markValue, null, null, null, liquidationPrice, null, unrealisedRoePcnt, latestPrice, null, latestUnrealisedPnl, latestUnrealisedRoePcnt, r11, null, null, null, imr, mmr, -1756389430, 56, null);
    }

    @Nullable
    public final BigDecimal getAdlPercentage() {
        return this.adlPercentage;
    }

    @Nullable
    public final BigDecimal getAvgPrice() {
        return this.avgPrice;
    }

    @Nullable
    public final BigDecimal getBestAsk() {
        return this.bestAsk;
    }

    @Nullable
    public final BigDecimal getBestBid() {
        return this.bestBid;
    }

    @Nullable
    public final BigDecimal getCumulativeFundingFee() {
        return this.cumulativeFundingFee;
    }

    @Nullable
    public final BigDecimal getCumulativeTax() {
        return this.cumulativeTax;
    }

    @Nullable
    public final BigDecimal getCumulativeTradeFee() {
        return this.cumulativeTradeFee;
    }

    @Nullable
    public final BigDecimal getCurrentComm() {
        return this.currentComm;
    }

    @Nullable
    public final BigDecimal getCurrentCost() {
        return this.currentCost;
    }

    @Nullable
    public final BigDecimal getCurrentQuantity() {
        return this.currentQuantity;
    }

    @Nullable
    public final Long getCurrentTimestamp() {
        return this.currentTimestamp;
    }

    @Nullable
    public final BigDecimal getImr() {
        return this.imr;
    }

    @Nullable
    public final BigDecimal getLastTradePriceValue() {
        return this.lastTradePriceValue;
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
    public final BigDecimal getLeverage() {
        return this.leverage;
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
    public final BigDecimal getMmr() {
        return this.mmr;
    }

    @Nullable
    public final Long getOpenTime() {
        return this.openTime;
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
    public final BigDecimal getPosInit() {
        return this.posInit;
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
    public final String getPositionId() {
        return this.positionId;
    }

    @Nullable
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    public final BigDecimal getRealisedCost() {
        return this.realisedCost;
    }

    @Nullable
    public final BigDecimal getRealisedGrossCost() {
        return this.realisedGrossCost;
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
    public final BigDecimal getUnrealisedCost() {
        return this.unrealisedCost;
    }

    @Nullable
    public final BigDecimal getUnrealisedRoePcnt() {
        return this.unrealisedRoePcnt;
    }

    @Nullable
    public final Boolean isOpen() {
        return this.isOpen;
    }

    @Nullable
    public final Boolean isTrialFunds() {
        return this.isTrialFunds;
    }

    public final void setAdlPercentage(@Nullable BigDecimal bigDecimal) {
        this.adlPercentage = bigDecimal;
    }

    public final void setBestAsk(@Nullable BigDecimal bigDecimal) {
        this.bestAsk = bigDecimal;
    }

    public final void setBestBid(@Nullable BigDecimal bigDecimal) {
        this.bestBid = bigDecimal;
    }

    public final void setCumulativeFundingFee(@Nullable BigDecimal bigDecimal) {
        this.cumulativeFundingFee = bigDecimal;
    }

    public final void setCumulativeTax(@Nullable BigDecimal bigDecimal) {
        this.cumulativeTax = bigDecimal;
    }

    public final void setCumulativeTradeFee(@Nullable BigDecimal bigDecimal) {
        this.cumulativeTradeFee = bigDecimal;
    }

    public final void setImr(@Nullable BigDecimal bigDecimal) {
        this.imr = bigDecimal;
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

    public final void setLeverage(@Nullable BigDecimal bigDecimal) {
        this.leverage = bigDecimal;
    }

    public final void setLiquidationPrice(@Nullable BigDecimal bigDecimal) {
        this.liquidationPrice = bigDecimal;
    }

    public final void setMaintMargin(@Nullable BigDecimal bigDecimal) {
        this.maintMargin = bigDecimal;
    }

    public final void setMmr(@Nullable BigDecimal bigDecimal) {
        this.mmr = bigDecimal;
    }

    public final void setRealisedCost(@Nullable BigDecimal bigDecimal) {
        this.realisedCost = bigDecimal;
    }

    public final void setRealisedGrossCost(@Nullable BigDecimal bigDecimal) {
        this.realisedGrossCost = bigDecimal;
    }

    public final void setRiskRatio(@Nullable BigDecimal bigDecimal) {
        this.riskRatio = bigDecimal;
    }

    public final void setTrialFunds(@Nullable Boolean bool) {
        this.isTrialFunds = bool;
    }

    public final void setUnrealisedRoePcnt(@Nullable BigDecimal bigDecimal) {
        this.unrealisedRoePcnt = bigDecimal;
    }

    @NotNull
    public final PositionEntity toPositionEntity() {
        return ((PositionMapper) C44095a.m97166c(PositionMapper.class)).toPositionEntity(this);
    }

    public /* synthetic */ UnifyPositionEntity(String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, Long l11, Long l12, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, String str3, String str4, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, BigDecimal bigDecimal15, BigDecimal bigDecimal16, BigDecimal bigDecimal17, BigDecimal bigDecimal18, Boolean bool, String str5, BigDecimal bigDecimal19, BigDecimal bigDecimal20, BigDecimal bigDecimal21, BigDecimal bigDecimal22, BigDecimal bigDecimal23, BigDecimal bigDecimal24, BigDecimal bigDecimal25, BigDecimal bigDecimal26, BigDecimal bigDecimal27, Boolean bool2, BigDecimal bigDecimal28, BigDecimal bigDecimal29, BigDecimal bigDecimal30, BigDecimal bigDecimal31, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bigDecimal, (i11 & 8) != 0 ? null : bigDecimal2, (i11 & 16) != 0 ? null : bigDecimal3, (i11 & 32) != 0 ? null : bigDecimal4, (i11 & 64) != 0 ? null : l11, (i11 & 128) != 0 ? null : l12, (i11 & 256) != 0 ? null : bigDecimal5, (i11 & 512) != 0 ? null : bigDecimal6, (i11 & 1024) != 0 ? null : bigDecimal7, (i11 & 2048) != 0 ? null : bigDecimal8, (i11 & 4096) != 0 ? null : bigDecimal9, (i11 & 8192) != 0 ? null : bigDecimal10, (i11 & 16384) != 0 ? null : str3, (i11 & 32768) != 0 ? null : str4, (i11 & 65536) != 0 ? null : bigDecimal11, (i11 & 131072) != 0 ? null : bigDecimal12, (i11 & 262144) != 0 ? null : bigDecimal13, (i11 & 524288) != 0 ? null : bigDecimal14, (i11 & 1048576) != 0 ? null : bigDecimal15, (i11 & 2097152) != 0 ? null : bigDecimal16, (i11 & 4194304) != 0 ? null : bigDecimal17, (i11 & 8388608) != 0 ? null : bigDecimal18, (i11 & 16777216) != 0 ? null : bool, (i11 & 33554432) != 0 ? null : str5, (i11 & 67108864) != 0 ? null : bigDecimal19, (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : bigDecimal20, (i11 & 268435456) != 0 ? null : bigDecimal21, (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : bigDecimal22, (i11 & 1073741824) != 0 ? null : bigDecimal23, (i11 & Integer.MIN_VALUE) != 0 ? null : bigDecimal24, (i12 & 1) != 0 ? null : bigDecimal25, (i12 & 2) != 0 ? null : bigDecimal26, (i12 & 4) != 0 ? null : bigDecimal27, (i12 & 8) != 0 ? Boolean.FALSE : bool2, (i12 & 16) != 0 ? null : bigDecimal28, (i12 & 32) != 0 ? null : bigDecimal29, (i12 & 64) != 0 ? null : bigDecimal30, (i12 & 128) != 0 ? null : bigDecimal31);
    }
}
