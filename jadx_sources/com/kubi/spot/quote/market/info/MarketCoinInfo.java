package com.kubi.spot.quote.market.info;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.kubi.spot.entity.Tag;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27039d;
import com.tencent.bugly.proguard.C33616e0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MarketInfoEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b6\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÃ\u0003\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003\u0012\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003\u0012\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003\u0012\u0010\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0003\u0012\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003\u0012\u0010\u0010#\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0010\u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010'\u001a\u00020(\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\b\b\u0002\u0010*\u001a\u00020(\u0012\b\b\u0002\u0010+\u001a\u00020(\u0012\b\b\u0002\u0010,\u001a\u00020(\u0012\b\b\u0002\u0010-\u001a\u00020(¢\u0006\u0004\b.\u0010/J\u000e\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0003J\u0006\u0010^\u001a\u00020_J\u0006\u0010`\u001a\u00020_J\u0006\u0010a\u001a\u00020(J\u0013\u0010b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0013\u0010e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0013\u0010g\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0013\u0010i\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003HÆ\u0003J\u0013\u0010j\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0013\u0010l\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0013\u0010n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003HÆ\u0003J\u0013\u0010o\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003HÆ\u0003J\u0013\u0010p\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0003HÆ\u0003J\u0013\u0010q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0013\u0010z\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003HÆ\u0003J\u0013\u0010{\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010|\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003HÆ\u0003J\u0010\u0010}\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0002\u0010SJ\t\u0010~\u001a\u00020(HÆ\u0003J\t\u0010\u007f\u001a\u00020(HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020(HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020(HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020(HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020(HÆ\u0003J\u0084\u0004\u0010\u0084\u0001\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00032\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0012\b\u0002\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0012\b\u0002\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00032\u0012\b\u0002\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00032\u0012\b\u0002\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u00032\u0012\b\u0002\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\u0012\b\u0002\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00032\u0012\b\u0002\u0010#\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020(2\b\b\u0002\u0010,\u001a\u00020(2\b\b\u0002\u0010-\u001a\u00020(HÆ\u0001¢\u0006\u0003\u0010\u0085\u0001J\u0007\u0010\u0086\u0001\u001a\u00020_J\u0016\u0010\u0087\u0001\u001a\u00020(2\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u0001HÖ\u0003J\n\u0010\u008a\u0001\u001a\u00020_HÖ\u0001J\n\u0010\u008b\u0001\u001a\u00020\u0006HÖ\u0001J\u001b\u0010\u008c\u0001\u001a\u00030\u008d\u00012\b\u0010\u008e\u0001\u001a\u00030\u008f\u00012\u0007\u0010\u0090\u0001\u001a\u00020_R\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00103\"\u0004\b7\u00105R\u001b\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u00101R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b9\u00103R\u001b\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u00101R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b;\u00103R\u001b\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u00101R\u001b\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u00101R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u001b\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u00101R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bA\u00103R\u001b\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u00101R\u001b\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u00101R\u001b\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u00101R\u001b\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u00101R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bF\u00103R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bG\u00103R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bH\u00103R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bI\u00103R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bL\u00103R\u0013\u0010 \u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bM\u00103R\u0013\u0010!\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bN\u00103R\u001b\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u00101R\u001b\u0010#\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u00101R\u001b\u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u00101R\u0015\u0010%\u001a\u0004\u0018\u00010&¢\u0006\n\n\u0002\u0010T\u001a\u0004\bR\u0010SR\u001a\u0010'\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010U\"\u0004\bV\u0010WR\u001a\u0010)\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010U\"\u0004\bX\u0010WR\u001a\u0010*\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010U\"\u0004\bY\u0010WR\u001a\u0010+\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010U\"\u0004\bZ\u0010WR\u001a\u0010,\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010U\"\u0004\b[\u0010WR\u001a\u0010-\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010U\"\u0004\b\\\u0010W¨\u0006\u0091\u0001"}, m90084d2 = {"Lcom/kubi/spot/quote/market/info/MarketCoinInfo;", "Landroid/os/Parcelable;", "activities", "", "Lcom/kubi/spot/quote/market/info/MarketBannerEntity;", "ath", "", "atl", "auditAgency", "circulatingSupply", "codeAndCommunity", "coinName", "contract", "currencyIntroduction", "Lcom/kubi/spot/quote/market/info/MarketCoinInfoParagraph;", "currencyReferenceRecommend", "Lcom/kubi/spot/quote/market/info/MarketCoinInfoRecommend;", "currencyTagList", "Lcom/kubi/spot/entity/Tag;", KlineFlutterMiniConstants.PROP_DATA_SOURCE, "doc", "explorer", "faqs", "Lcom/kubi/spot/quote/market/info/MarketCoinInfoFAQ;", "investor", "logo", "marketCap", "marketCapChange", "maxSupply", "priceLiveData", "Lcom/kubi/spot/quote/market/info/PriceLiveData;", "rank", "rating", "source", C33616e0.f69644s, "topics", "website", "arriveCountdown", "", "isCommunityExpose", "", "isWebsiteTrack", "isDocTrack", "isExplorerTrack", "isContractTrack", "isCommunityTrack", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/kubi/spot/quote/market/info/MarketCoinInfoRecommend;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/spot/quote/market/info/PriceLiveData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;ZZZZZZ)V", "getActivities", "()Ljava/util/List;", "getAth", "()Ljava/lang/String;", "setAth", "(Ljava/lang/String;)V", "getAtl", "setAtl", "getAuditAgency", "getCirculatingSupply", "getCodeAndCommunity", "getCoinName", "getContract", "getCurrencyIntroduction", "getCurrencyReferenceRecommend", "()Lcom/kubi/spot/quote/market/info/MarketCoinInfoRecommend;", "getCurrencyTagList", "getDataSource", "getDoc", "getExplorer", "getFaqs", "getInvestor", "getLogo", "getMarketCap", "getMarketCapChange", "getMaxSupply", "getPriceLiveData", "()Lcom/kubi/spot/quote/market/info/PriceLiveData;", "getRank", "getRating", "getSource", "getTags", "getTopics", "getWebsite", "getArriveCountdown", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Z", "setCommunityExpose", "(Z)V", "setWebsiteTrack", "setDocTrack", "setExplorerTrack", "setContractTrack", "setCommunityTrack", "getSortedTagList", "getIntroFirstTitleIndex", "", "getIntroTitleNum", "isKuCoin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/kubi/spot/quote/market/info/MarketCoinInfoRecommend;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/spot/quote/market/info/PriceLiveData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;ZZZZZZ)Lcom/kubi/spot/quote/market/info/MarketCoinInfo;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketInfoEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketInfoEntity.kt\ncom/kubi/spot/quote/market/info/MarketCoinInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,395:1\n774#2:396\n865#2,2:397\n360#2,7:399\n360#2,7:406\n774#2:413\n865#2,2:414\n*S KotlinDebug\n*F\n+ 1 MarketInfoEntity.kt\ncom/kubi/spot/quote/market/info/MarketCoinInfo\n*L\n100#1:396\n100#1:397,2\n124#1:399,7\n127#1:406,7\n133#1:413\n133#1:414,2\n*E\n"})
public final /* data */ class MarketCoinInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarketCoinInfo> CREATOR = new C25591a();

    @Nullable
    private final List<MarketBannerEntity> activities;

    @Nullable
    private final Long arriveCountdown;

    @Nullable
    private String ath;

    @Nullable
    private String atl;

    @Nullable
    private final List<String> auditAgency;

    @Nullable
    private final String circulatingSupply;

    @Nullable
    private final List<String> codeAndCommunity;

    @Nullable
    private final String coinName;

    @Nullable
    private final List<String> contract;

    @Nullable
    private final List<MarketCoinInfoParagraph> currencyIntroduction;

    @Nullable
    private final MarketCoinInfoRecommend currencyReferenceRecommend;

    @Nullable
    private final List<Tag> currencyTagList;

    @Nullable
    private final String dataSource;

    @Nullable
    private final List<String> doc;

    @Nullable
    private final List<String> explorer;

    @Nullable
    private final List<MarketCoinInfoFAQ> faqs;

    @Nullable
    private final List<String> investor;
    private boolean isCommunityExpose;
    private boolean isCommunityTrack;
    private boolean isContractTrack;
    private boolean isDocTrack;
    private boolean isExplorerTrack;
    private boolean isWebsiteTrack;

    @Nullable
    private final String logo;

    @Nullable
    private final String marketCap;

    @Nullable
    private final String marketCapChange;

    @Nullable
    private final String maxSupply;

    @Nullable
    private final PriceLiveData priceLiveData;

    @Nullable
    private final String rank;

    @Nullable
    private final String rating;

    @Nullable
    private final String source;

    @Nullable
    private final List<String> tags;

    @Nullable
    private final List<MarketBannerEntity> topics;

    @Nullable
    private final List<String> website;

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.info.MarketCoinInfo$a */
    /* JADX INFO: compiled from: MarketInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25591a implements Parcelable.Creator<MarketCoinInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarketCoinInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList6.add(parcel.readInt() == 0 ? null : MarketBannerEntity.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList6;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string3 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            String string4 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList7.add(parcel.readInt() == 0 ? null : MarketCoinInfoParagraph.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList7;
            }
            MarketCoinInfoRecommend marketCoinInfoRecommendCreateFromParcel = parcel.readInt() == 0 ? null : MarketCoinInfoRecommend.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList8.add(parcel.readInt() == 0 ? null : Tag.CREATOR.createFromParcel(parcel));
                }
                arrayList3 = arrayList8;
            }
            String string5 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList4 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList5 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i17 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList9.add(parcel.readInt() == 0 ? null : MarketCoinInfoFAQ.CREATOR.createFromParcel(parcel));
                }
                arrayList4 = arrayList9;
            }
            ArrayList<String> arrayListCreateStringArrayList6 = parcel.createStringArrayList();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            PriceLiveData priceLiveDataCreateFromParcel = parcel.readInt() == 0 ? null : PriceLiveData.CREATOR.createFromParcel(parcel);
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList7 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int i19 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i19);
                for (int i21 = 0; i21 != i19; i21++) {
                    arrayList10.add(parcel.readInt() == 0 ? null : MarketBannerEntity.CREATOR.createFromParcel(parcel));
                }
                arrayList5 = arrayList10;
            }
            return new MarketCoinInfo(arrayList, string, string2, arrayListCreateStringArrayList, string3, arrayListCreateStringArrayList2, string4, arrayListCreateStringArrayList3, arrayList2, marketCoinInfoRecommendCreateFromParcel, arrayList3, string5, arrayListCreateStringArrayList4, arrayListCreateStringArrayList5, arrayList4, arrayListCreateStringArrayList6, string6, string7, string8, string9, priceLiveDataCreateFromParcel, string10, string11, string12, arrayListCreateStringArrayList7, arrayList5, parcel.createStringArrayList(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarketCoinInfo[] newArray(int i11) {
            return new MarketCoinInfo[i11];
        }
    }

    public MarketCoinInfo(@Nullable List<MarketBannerEntity> list, @Nullable String str, @Nullable String str2, @Nullable List<String> list2, @Nullable String str3, @Nullable List<String> list3, @Nullable String str4, @Nullable List<String> list4, @Nullable List<MarketCoinInfoParagraph> list5, @Nullable MarketCoinInfoRecommend marketCoinInfoRecommend, @Nullable List<Tag> list6, @Nullable String str5, @Nullable List<String> list7, @Nullable List<String> list8, @Nullable List<MarketCoinInfoFAQ> list9, @Nullable List<String> list10, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable PriceLiveData priceLiveData, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable List<String> list11, @Nullable List<MarketBannerEntity> list12, @Nullable List<String> list13, @Nullable Long l11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.activities = list;
        this.ath = str;
        this.atl = str2;
        this.auditAgency = list2;
        this.circulatingSupply = str3;
        this.codeAndCommunity = list3;
        this.coinName = str4;
        this.contract = list4;
        this.currencyIntroduction = list5;
        this.currencyReferenceRecommend = marketCoinInfoRecommend;
        this.currencyTagList = list6;
        this.dataSource = str5;
        this.doc = list7;
        this.explorer = list8;
        this.faqs = list9;
        this.investor = list10;
        this.logo = str6;
        this.marketCap = str7;
        this.marketCapChange = str8;
        this.maxSupply = str9;
        this.priceLiveData = priceLiveData;
        this.rank = str10;
        this.rating = str11;
        this.source = str12;
        this.tags = list11;
        this.topics = list12;
        this.website = list13;
        this.arriveCountdown = l11;
        this.isCommunityExpose = z11;
        this.isWebsiteTrack = z12;
        this.isDocTrack = z13;
        this.isExplorerTrack = z14;
        this.isContractTrack = z15;
        this.isCommunityTrack = z16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketCoinInfo copy$default(MarketCoinInfo marketCoinInfo, List list, String str, String str2, List list2, String str3, List list3, String str4, List list4, List list5, MarketCoinInfoRecommend marketCoinInfoRecommend, List list6, String str5, List list7, List list8, List list9, List list10, String str6, String str7, String str8, String str9, PriceLiveData priceLiveData, String str10, String str11, String str12, List list11, List list12, List list13, Long l11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i11, int i12, Object obj) {
        boolean z17;
        boolean z18;
        List list14 = (i11 & 1) != 0 ? marketCoinInfo.activities : list;
        String str13 = (i11 & 2) != 0 ? marketCoinInfo.ath : str;
        String str14 = (i11 & 4) != 0 ? marketCoinInfo.atl : str2;
        List list15 = (i11 & 8) != 0 ? marketCoinInfo.auditAgency : list2;
        String str15 = (i11 & 16) != 0 ? marketCoinInfo.circulatingSupply : str3;
        List list16 = (i11 & 32) != 0 ? marketCoinInfo.codeAndCommunity : list3;
        String str16 = (i11 & 64) != 0 ? marketCoinInfo.coinName : str4;
        List list17 = (i11 & 128) != 0 ? marketCoinInfo.contract : list4;
        List list18 = (i11 & 256) != 0 ? marketCoinInfo.currencyIntroduction : list5;
        MarketCoinInfoRecommend marketCoinInfoRecommend2 = (i11 & 512) != 0 ? marketCoinInfo.currencyReferenceRecommend : marketCoinInfoRecommend;
        List list19 = (i11 & 1024) != 0 ? marketCoinInfo.currencyTagList : list6;
        String str17 = (i11 & 2048) != 0 ? marketCoinInfo.dataSource : str5;
        List list20 = (i11 & 4096) != 0 ? marketCoinInfo.doc : list7;
        List list21 = (i11 & 8192) != 0 ? marketCoinInfo.explorer : list8;
        List list22 = list14;
        List list23 = (i11 & 16384) != 0 ? marketCoinInfo.faqs : list9;
        List list24 = (i11 & 32768) != 0 ? marketCoinInfo.investor : list10;
        String str18 = (i11 & 65536) != 0 ? marketCoinInfo.logo : str6;
        String str19 = (i11 & 131072) != 0 ? marketCoinInfo.marketCap : str7;
        String str20 = (i11 & 262144) != 0 ? marketCoinInfo.marketCapChange : str8;
        String str21 = (i11 & 524288) != 0 ? marketCoinInfo.maxSupply : str9;
        PriceLiveData priceLiveData2 = (i11 & 1048576) != 0 ? marketCoinInfo.priceLiveData : priceLiveData;
        String str22 = (i11 & 2097152) != 0 ? marketCoinInfo.rank : str10;
        String str23 = (i11 & 4194304) != 0 ? marketCoinInfo.rating : str11;
        String str24 = (i11 & 8388608) != 0 ? marketCoinInfo.source : str12;
        List list25 = (i11 & 16777216) != 0 ? marketCoinInfo.tags : list11;
        List list26 = (i11 & 33554432) != 0 ? marketCoinInfo.topics : list12;
        List list27 = (i11 & 67108864) != 0 ? marketCoinInfo.website : list13;
        Long l12 = (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketCoinInfo.arriveCountdown : l11;
        boolean z19 = (i11 & 268435456) != 0 ? marketCoinInfo.isCommunityExpose : z11;
        boolean z21 = (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? marketCoinInfo.isWebsiteTrack : z12;
        boolean z22 = (i11 & 1073741824) != 0 ? marketCoinInfo.isDocTrack : z13;
        boolean z23 = (i11 & Integer.MIN_VALUE) != 0 ? marketCoinInfo.isExplorerTrack : z14;
        boolean z24 = (i12 & 1) != 0 ? marketCoinInfo.isContractTrack : z15;
        if ((i12 & 2) != 0) {
            z18 = z24;
            z17 = marketCoinInfo.isCommunityTrack;
        } else {
            z17 = z16;
            z18 = z24;
        }
        return marketCoinInfo.copy(list22, str13, str14, list15, str15, list16, str16, list17, list18, marketCoinInfoRecommend2, list19, str17, list20, list21, list23, list24, str18, str19, str20, str21, priceLiveData2, str22, str23, str24, list25, list26, list27, l12, z19, z21, z22, z23, z18, z17);
    }

    @NotNull
    public final MarketCoinInfo copy(@Nullable List<MarketBannerEntity> activities, @Nullable String ath, @Nullable String atl, @Nullable List<String> auditAgency, @Nullable String circulatingSupply, @Nullable List<String> codeAndCommunity, @Nullable String coinName, @Nullable List<String> contract, @Nullable List<MarketCoinInfoParagraph> currencyIntroduction, @Nullable MarketCoinInfoRecommend currencyReferenceRecommend, @Nullable List<Tag> currencyTagList, @Nullable String dataSource, @Nullable List<String> doc, @Nullable List<String> explorer, @Nullable List<MarketCoinInfoFAQ> faqs, @Nullable List<String> investor, @Nullable String logo, @Nullable String marketCap, @Nullable String marketCapChange, @Nullable String maxSupply, @Nullable PriceLiveData priceLiveData, @Nullable String rank, @Nullable String rating, @Nullable String source, @Nullable List<String> tags, @Nullable List<MarketBannerEntity> topics, @Nullable List<String> website, @Nullable Long arriveCountdown, boolean isCommunityExpose, boolean isWebsiteTrack, boolean isDocTrack, boolean isExplorerTrack, boolean isContractTrack, boolean isCommunityTrack) {
        return new MarketCoinInfo(activities, ath, atl, auditAgency, circulatingSupply, codeAndCommunity, coinName, contract, currencyIntroduction, currencyReferenceRecommend, currencyTagList, dataSource, doc, explorer, faqs, investor, logo, marketCap, marketCapChange, maxSupply, priceLiveData, rank, rating, source, tags, topics, website, arriveCountdown, isCommunityExpose, isWebsiteTrack, isDocTrack, isExplorerTrack, isContractTrack, isCommunityTrack);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketCoinInfo)) {
            return false;
        }
        MarketCoinInfo marketCoinInfo = (MarketCoinInfo) other;
        return Intrinsics.areEqual(this.activities, marketCoinInfo.activities) && Intrinsics.areEqual(this.ath, marketCoinInfo.ath) && Intrinsics.areEqual(this.atl, marketCoinInfo.atl) && Intrinsics.areEqual(this.auditAgency, marketCoinInfo.auditAgency) && Intrinsics.areEqual(this.circulatingSupply, marketCoinInfo.circulatingSupply) && Intrinsics.areEqual(this.codeAndCommunity, marketCoinInfo.codeAndCommunity) && Intrinsics.areEqual(this.coinName, marketCoinInfo.coinName) && Intrinsics.areEqual(this.contract, marketCoinInfo.contract) && Intrinsics.areEqual(this.currencyIntroduction, marketCoinInfo.currencyIntroduction) && Intrinsics.areEqual(this.currencyReferenceRecommend, marketCoinInfo.currencyReferenceRecommend) && Intrinsics.areEqual(this.currencyTagList, marketCoinInfo.currencyTagList) && Intrinsics.areEqual(this.dataSource, marketCoinInfo.dataSource) && Intrinsics.areEqual(this.doc, marketCoinInfo.doc) && Intrinsics.areEqual(this.explorer, marketCoinInfo.explorer) && Intrinsics.areEqual(this.faqs, marketCoinInfo.faqs) && Intrinsics.areEqual(this.investor, marketCoinInfo.investor) && Intrinsics.areEqual(this.logo, marketCoinInfo.logo) && Intrinsics.areEqual(this.marketCap, marketCoinInfo.marketCap) && Intrinsics.areEqual(this.marketCapChange, marketCoinInfo.marketCapChange) && Intrinsics.areEqual(this.maxSupply, marketCoinInfo.maxSupply) && Intrinsics.areEqual(this.priceLiveData, marketCoinInfo.priceLiveData) && Intrinsics.areEqual(this.rank, marketCoinInfo.rank) && Intrinsics.areEqual(this.rating, marketCoinInfo.rating) && Intrinsics.areEqual(this.source, marketCoinInfo.source) && Intrinsics.areEqual(this.tags, marketCoinInfo.tags) && Intrinsics.areEqual(this.topics, marketCoinInfo.topics) && Intrinsics.areEqual(this.website, marketCoinInfo.website) && Intrinsics.areEqual(this.arriveCountdown, marketCoinInfo.arriveCountdown) && this.isCommunityExpose == marketCoinInfo.isCommunityExpose && this.isWebsiteTrack == marketCoinInfo.isWebsiteTrack && this.isDocTrack == marketCoinInfo.isDocTrack && this.isExplorerTrack == marketCoinInfo.isExplorerTrack && this.isContractTrack == marketCoinInfo.isContractTrack && this.isCommunityTrack == marketCoinInfo.isCommunityTrack;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getSortedTagList$lambda$1(Tag tag, Tag tag2) {
        Integer algorithm;
        Integer algorithm2;
        Integer algorithm3;
        Integer algorithm4;
        Integer algorithm5;
        Integer algorithm6;
        Integer algorithm7 = tag2 != null ? tag2.getAlgorithm() : null;
        if (algorithm7 != null && algorithm7.intValue() == 1) {
            return 1;
        }
        if (algorithm7 != null && algorithm7.intValue() == 2) {
            return (tag == null || (algorithm6 = tag.getAlgorithm()) == null || algorithm6.intValue() != 1) ? 1 : -1;
        }
        if (algorithm7 != null && algorithm7.intValue() == 3) {
            return ((tag == null || (algorithm5 = tag.getAlgorithm()) == null || algorithm5.intValue() != 1) && (tag == null || (algorithm4 = tag.getAlgorithm()) == null || algorithm4.intValue() != 2)) ? 1 : -1;
        }
        if (algorithm7 != null && algorithm7.intValue() == 12) {
            return ((tag == null || (algorithm3 = tag.getAlgorithm()) == null || algorithm3.intValue() != 4) && (tag == null || (algorithm2 = tag.getAlgorithm()) == null || algorithm2.intValue() != 11)) ? -1 : 1;
        }
        return (algorithm7 == null || algorithm7.intValue() != 11 || tag == null || (algorithm = tag.getAlgorithm()) == null || algorithm.intValue() != 4) ? -1 : 1;
    }

    @Nullable
    public final List<MarketBannerEntity> component1() {
        return this.activities;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final MarketCoinInfoRecommend getCurrencyReferenceRecommend() {
        return this.currencyReferenceRecommend;
    }

    @Nullable
    public final List<Tag> component11() {
        return this.currencyTagList;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDataSource() {
        return this.dataSource;
    }

    @Nullable
    public final List<String> component13() {
        return this.doc;
    }

    @Nullable
    public final List<String> component14() {
        return this.explorer;
    }

    @Nullable
    public final List<MarketCoinInfoFAQ> component15() {
        return this.faqs;
    }

    @Nullable
    public final List<String> component16() {
        return this.investor;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getMarketCap() {
        return this.marketCap;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getMarketCapChange() {
        return this.marketCapChange;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAth() {
        return this.ath;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getMaxSupply() {
        return this.maxSupply;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final PriceLiveData getPriceLiveData() {
        return this.priceLiveData;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getRank() {
        return this.rank;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getRating() {
        return this.rating;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final List<String> component25() {
        return this.tags;
    }

    @Nullable
    public final List<MarketBannerEntity> component26() {
        return this.topics;
    }

    @Nullable
    public final List<String> component27() {
        return this.website;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Long getArriveCountdown() {
        return this.arriveCountdown;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final boolean getIsCommunityExpose() {
        return this.isCommunityExpose;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAtl() {
        return this.atl;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final boolean getIsWebsiteTrack() {
        return this.isWebsiteTrack;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final boolean getIsDocTrack() {
        return this.isDocTrack;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final boolean getIsExplorerTrack() {
        return this.isExplorerTrack;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final boolean getIsContractTrack() {
        return this.isContractTrack;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final boolean getIsCommunityTrack() {
        return this.isCommunityTrack;
    }

    @Nullable
    public final List<String> component4() {
        return this.auditAgency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCirculatingSupply() {
        return this.circulatingSupply;
    }

    @Nullable
    public final List<String> component6() {
        return this.codeAndCommunity;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCoinName() {
        return this.coinName;
    }

    @Nullable
    public final List<String> component8() {
        return this.contract;
    }

    @Nullable
    public final List<MarketCoinInfoParagraph> component9() {
        return this.currencyIntroduction;
    }

    @Nullable
    public final List<MarketBannerEntity> getActivities() {
        return this.activities;
    }

    @Nullable
    public final Long getArriveCountdown() {
        return this.arriveCountdown;
    }

    @Nullable
    public final String getAth() {
        return this.ath;
    }

    @Nullable
    public final String getAtl() {
        return this.atl;
    }

    @Nullable
    public final List<String> getAuditAgency() {
        return this.auditAgency;
    }

    @Nullable
    public final String getCirculatingSupply() {
        return this.circulatingSupply;
    }

    @Nullable
    public final List<String> getCodeAndCommunity() {
        return this.codeAndCommunity;
    }

    @Nullable
    public final String getCoinName() {
        return this.coinName;
    }

    @Nullable
    public final List<String> getContract() {
        return this.contract;
    }

    @Nullable
    public final List<MarketCoinInfoParagraph> getCurrencyIntroduction() {
        return this.currencyIntroduction;
    }

    @Nullable
    public final MarketCoinInfoRecommend getCurrencyReferenceRecommend() {
        return this.currencyReferenceRecommend;
    }

    @Nullable
    public final List<Tag> getCurrencyTagList() {
        return this.currencyTagList;
    }

    @Nullable
    public final String getDataSource() {
        return this.dataSource;
    }

    @Nullable
    public final List<String> getDoc() {
        return this.doc;
    }

    @Nullable
    public final List<String> getExplorer() {
        return this.explorer;
    }

    @Nullable
    public final List<MarketCoinInfoFAQ> getFaqs() {
        return this.faqs;
    }

    public final int getIntroFirstTitleIndex() {
        Integer numValueOf;
        List<MarketCoinInfoParagraph> list = this.currencyIntroduction;
        int i11 = 0;
        Integer numValueOf2 = null;
        if (list != null) {
            Iterator<MarketCoinInfoParagraph> it = list.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                MarketCoinInfoParagraph next = it.next();
                if (Intrinsics.areEqual(next != null ? next.getType() : null, "TITLE")) {
                    break;
                }
                i12++;
            }
            numValueOf = Integer.valueOf(i12);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == -1) {
            List<MarketCoinInfoParagraph> list2 = this.currencyIntroduction;
            if (list2 != null) {
                Iterator<MarketCoinInfoParagraph> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i11 = -1;
                        break;
                    }
                    MarketCoinInfoParagraph next2 = it2.next();
                    if (Intrinsics.areEqual(next2 != null ? next2.getType() : null, "RICHTEXT")) {
                        break;
                    }
                    i11++;
                }
                numValueOf2 = Integer.valueOf(i11);
            }
            numValueOf = numValueOf2;
        }
        return C27039d.m66651k(numValueOf, -1);
    }

    public final int getIntroTitleNum() {
        List<MarketCoinInfoParagraph> list = this.currencyIntroduction;
        Integer numValueOf = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                MarketCoinInfoParagraph marketCoinInfoParagraph = (MarketCoinInfoParagraph) obj;
                if (!Intrinsics.areEqual(marketCoinInfoParagraph != null ? marketCoinInfoParagraph.getType() : null, "TITLE")) {
                    if (Intrinsics.areEqual(marketCoinInfoParagraph != null ? marketCoinInfoParagraph.getType() : null, "RICHTEXT")) {
                    }
                }
                arrayList.add(obj);
            }
            numValueOf = Integer.valueOf(arrayList.size());
        }
        return C27039d.m66650j(numValueOf);
    }

    @Nullable
    public final List<String> getInvestor() {
        return this.investor;
    }

    @Nullable
    public final String getLogo() {
        return this.logo;
    }

    @Nullable
    public final String getMarketCap() {
        return this.marketCap;
    }

    @Nullable
    public final String getMarketCapChange() {
        return this.marketCapChange;
    }

    @Nullable
    public final String getMaxSupply() {
        return this.maxSupply;
    }

    @Nullable
    public final PriceLiveData getPriceLiveData() {
        return this.priceLiveData;
    }

    @Nullable
    public final String getRank() {
        return this.rank;
    }

    @Nullable
    public final String getRating() {
        return this.rating;
    }

    @NotNull
    public final List<Tag> getSortedTagList() {
        List<Tag> list = this.currencyTagList;
        List listSortedWith = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Tag tag = (Tag) obj;
                if (ArraysKt.contains(new Integer[]{1, 2, 3, 4, 11, 12}, tag != null ? tag.getAlgorithm() : null)) {
                    arrayList.add(obj);
                }
            }
            final Function2 function2 = new Function2() { // from class: com.kubi.spot.quote.market.info.f
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return Integer.valueOf(MarketCoinInfo.getSortedTagList$lambda$1((Tag) obj2, (Tag) obj3));
                }
            };
            listSortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.kubi.spot.quote.market.info.g
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return MarketCoinInfo.getSortedTagList$lambda$2(function2, obj2, obj3);
                }
            });
        }
        return C27024b.m66560c(listSortedWith);
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final List<String> getTags() {
        return this.tags;
    }

    @Nullable
    public final List<MarketBannerEntity> getTopics() {
        return this.topics;
    }

    @Nullable
    public final List<String> getWebsite() {
        return this.website;
    }

    public int hashCode() {
        List<MarketBannerEntity> list = this.activities;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.ath;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.atl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list2 = this.auditAgency;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.circulatingSupply;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list3 = this.codeAndCommunity;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str4 = this.coinName;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list4 = this.contract;
        int iHashCode8 = (iHashCode7 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<MarketCoinInfoParagraph> list5 = this.currencyIntroduction;
        int iHashCode9 = (iHashCode8 + (list5 == null ? 0 : list5.hashCode())) * 31;
        MarketCoinInfoRecommend marketCoinInfoRecommend = this.currencyReferenceRecommend;
        int iHashCode10 = (iHashCode9 + (marketCoinInfoRecommend == null ? 0 : marketCoinInfoRecommend.hashCode())) * 31;
        List<Tag> list6 = this.currencyTagList;
        int iHashCode11 = (iHashCode10 + (list6 == null ? 0 : list6.hashCode())) * 31;
        String str5 = this.dataSource;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list7 = this.doc;
        int iHashCode13 = (iHashCode12 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<String> list8 = this.explorer;
        int iHashCode14 = (iHashCode13 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<MarketCoinInfoFAQ> list9 = this.faqs;
        int iHashCode15 = (iHashCode14 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<String> list10 = this.investor;
        int iHashCode16 = (iHashCode15 + (list10 == null ? 0 : list10.hashCode())) * 31;
        String str6 = this.logo;
        int iHashCode17 = (iHashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.marketCap;
        int iHashCode18 = (iHashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.marketCapChange;
        int iHashCode19 = (iHashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.maxSupply;
        int iHashCode20 = (iHashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        PriceLiveData priceLiveData = this.priceLiveData;
        int iHashCode21 = (iHashCode20 + (priceLiveData == null ? 0 : priceLiveData.hashCode())) * 31;
        String str10 = this.rank;
        int iHashCode22 = (iHashCode21 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.rating;
        int iHashCode23 = (iHashCode22 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.source;
        int iHashCode24 = (iHashCode23 + (str12 == null ? 0 : str12.hashCode())) * 31;
        List<String> list11 = this.tags;
        int iHashCode25 = (iHashCode24 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<MarketBannerEntity> list12 = this.topics;
        int iHashCode26 = (iHashCode25 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<String> list13 = this.website;
        int iHashCode27 = (iHashCode26 + (list13 == null ? 0 : list13.hashCode())) * 31;
        Long l11 = this.arriveCountdown;
        return ((((((((((((iHashCode27 + (l11 != null ? l11.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCommunityExpose)) * 31) + Boolean.hashCode(this.isWebsiteTrack)) * 31) + Boolean.hashCode(this.isDocTrack)) * 31) + Boolean.hashCode(this.isExplorerTrack)) * 31) + Boolean.hashCode(this.isContractTrack)) * 31) + Boolean.hashCode(this.isCommunityTrack);
    }

    public final boolean isCommunityExpose() {
        return this.isCommunityExpose;
    }

    public final boolean isCommunityTrack() {
        return this.isCommunityTrack;
    }

    public final boolean isContractTrack() {
        return this.isContractTrack;
    }

    public final boolean isDocTrack() {
        return this.isDocTrack;
    }

    public final boolean isExplorerTrack() {
        return this.isExplorerTrack;
    }

    public final boolean isKuCoin() {
        return Intrinsics.areEqual(this.dataSource, "Kucoin");
    }

    public final boolean isWebsiteTrack() {
        return this.isWebsiteTrack;
    }

    public final void setAth(@Nullable String str) {
        this.ath = str;
    }

    public final void setAtl(@Nullable String str) {
        this.atl = str;
    }

    public final void setCommunityExpose(boolean z11) {
        this.isCommunityExpose = z11;
    }

    public final void setCommunityTrack(boolean z11) {
        this.isCommunityTrack = z11;
    }

    public final void setContractTrack(boolean z11) {
        this.isContractTrack = z11;
    }

    public final void setDocTrack(boolean z11) {
        this.isDocTrack = z11;
    }

    public final void setExplorerTrack(boolean z11) {
        this.isExplorerTrack = z11;
    }

    public final void setWebsiteTrack(boolean z11) {
        this.isWebsiteTrack = z11;
    }

    @NotNull
    public String toString() {
        return "MarketCoinInfo(activities=" + this.activities + ", ath=" + this.ath + ", atl=" + this.atl + ", auditAgency=" + this.auditAgency + ", circulatingSupply=" + this.circulatingSupply + ", codeAndCommunity=" + this.codeAndCommunity + ", coinName=" + this.coinName + ", contract=" + this.contract + ", currencyIntroduction=" + this.currencyIntroduction + ", currencyReferenceRecommend=" + this.currencyReferenceRecommend + ", currencyTagList=" + this.currencyTagList + ", dataSource=" + this.dataSource + ", doc=" + this.doc + ", explorer=" + this.explorer + ", faqs=" + this.faqs + ", investor=" + this.investor + ", logo=" + this.logo + ", marketCap=" + this.marketCap + ", marketCapChange=" + this.marketCapChange + ", maxSupply=" + this.maxSupply + ", priceLiveData=" + this.priceLiveData + ", rank=" + this.rank + ", rating=" + this.rating + ", source=" + this.source + ", tags=" + this.tags + ", topics=" + this.topics + ", website=" + this.website + ", arriveCountdown=" + this.arriveCountdown + ", isCommunityExpose=" + this.isCommunityExpose + ", isWebsiteTrack=" + this.isWebsiteTrack + ", isDocTrack=" + this.isDocTrack + ", isExplorerTrack=" + this.isExplorerTrack + ", isContractTrack=" + this.isContractTrack + ", isCommunityTrack=" + this.isCommunityTrack + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<MarketBannerEntity> list = this.activities;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            for (MarketBannerEntity marketBannerEntity : list) {
                if (marketBannerEntity == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    marketBannerEntity.writeToParcel(dest, flags);
                }
            }
        }
        dest.writeString(this.ath);
        dest.writeString(this.atl);
        dest.writeStringList(this.auditAgency);
        dest.writeString(this.circulatingSupply);
        dest.writeStringList(this.codeAndCommunity);
        dest.writeString(this.coinName);
        dest.writeStringList(this.contract);
        List<MarketCoinInfoParagraph> list2 = this.currencyIntroduction;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            for (MarketCoinInfoParagraph marketCoinInfoParagraph : list2) {
                if (marketCoinInfoParagraph == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    marketCoinInfoParagraph.writeToParcel(dest, flags);
                }
            }
        }
        MarketCoinInfoRecommend marketCoinInfoRecommend = this.currencyReferenceRecommend;
        if (marketCoinInfoRecommend == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            marketCoinInfoRecommend.writeToParcel(dest, flags);
        }
        List<Tag> list3 = this.currencyTagList;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list3.size());
            for (Tag tag : list3) {
                if (tag == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    tag.writeToParcel(dest, flags);
                }
            }
        }
        dest.writeString(this.dataSource);
        dest.writeStringList(this.doc);
        dest.writeStringList(this.explorer);
        List<MarketCoinInfoFAQ> list4 = this.faqs;
        if (list4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list4.size());
            for (MarketCoinInfoFAQ marketCoinInfoFAQ : list4) {
                if (marketCoinInfoFAQ == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    marketCoinInfoFAQ.writeToParcel(dest, flags);
                }
            }
        }
        dest.writeStringList(this.investor);
        dest.writeString(this.logo);
        dest.writeString(this.marketCap);
        dest.writeString(this.marketCapChange);
        dest.writeString(this.maxSupply);
        PriceLiveData priceLiveData = this.priceLiveData;
        if (priceLiveData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            priceLiveData.writeToParcel(dest, flags);
        }
        dest.writeString(this.rank);
        dest.writeString(this.rating);
        dest.writeString(this.source);
        dest.writeStringList(this.tags);
        List<MarketBannerEntity> list5 = this.topics;
        if (list5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list5.size());
            for (MarketBannerEntity marketBannerEntity2 : list5) {
                if (marketBannerEntity2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    marketBannerEntity2.writeToParcel(dest, flags);
                }
            }
        }
        dest.writeStringList(this.website);
        Long l11 = this.arriveCountdown;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeInt(this.isCommunityExpose ? 1 : 0);
        dest.writeInt(this.isWebsiteTrack ? 1 : 0);
        dest.writeInt(this.isDocTrack ? 1 : 0);
        dest.writeInt(this.isExplorerTrack ? 1 : 0);
        dest.writeInt(this.isContractTrack ? 1 : 0);
        dest.writeInt(this.isCommunityTrack ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getSortedTagList$lambda$2(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    public /* synthetic */ MarketCoinInfo(List list, String str, String str2, List list2, String str3, List list3, String str4, List list4, List list5, MarketCoinInfoRecommend marketCoinInfoRecommend, List list6, String str5, List list7, List list8, List list9, List list10, String str6, String str7, String str8, String str9, PriceLiveData priceLiveData, String str10, String str11, String str12, List list11, List list12, List list13, Long l11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, list2, str3, list3, str4, list4, list5, marketCoinInfoRecommend, list6, str5, list7, list8, list9, list10, str6, str7, str8, str9, priceLiveData, str10, str11, str12, list11, list12, list13, l11, (i11 & 268435456) != 0 ? false : z11, (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? false : z12, (i11 & 1073741824) != 0 ? false : z13, (i11 & Integer.MIN_VALUE) != 0 ? false : z14, (i12 & 1) != 0 ? false : z15, (i12 & 2) != 0 ? false : z16);
    }
}
