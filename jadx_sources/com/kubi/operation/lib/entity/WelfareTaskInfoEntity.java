package com.kubi.operation.lib.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.kucoin.utils.DayNightThemeManager;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WelfareTaskInfoEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bl\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001a\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010$\u001a\u0004\u0018\u00010\r\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010/\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u0005\u0012\b\u00101\u001a\u0004\u0018\u00010\u0006\u0012\b\u00102\u001a\u0004\u0018\u00010\u0006\u0012\b\u00103\u001a\u0004\u0018\u000104¢\u0006\u0004\b5\u00106J\u0006\u0010l\u001a\u00020\rJ\b\u0010m\u001a\u0004\u0018\u00010\u0006J\b\u0010n\u001a\u0004\u0018\u00010\u0006J\u0006\u0010o\u001a\u00020\u0003J\u0006\u0010p\u001a\u00020\u0003J\u0010\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00108J\u0011\u0010r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010s\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010=J\u000b\u0010t\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010w\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010DJ\u0010\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010y\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00108J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010DJ\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0012\u0010\u0098\u0001\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u000104HÆ\u0003J \u0004\u0010\u009c\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00103\u001a\u0004\u0018\u000104HÆ\u0001¢\u0006\u0003\u0010\u009d\u0001J\u0007\u0010\u009e\u0001\u001a\u00020\bJ\u0016\u0010\u009f\u0001\u001a\u00020\u00032\n\u0010 \u0001\u001a\u0005\u0018\u00010¡\u0001HÖ\u0003J\n\u0010¢\u0001\u001a\u00020\bHÖ\u0001J\n\u0010£\u0001\u001a\u00020\u0006HÖ\u0001J\u001b\u0010¤\u0001\u001a\u00030¥\u00012\b\u0010¦\u0001\u001a\u00030§\u00012\u0007\u0010¨\u0001\u001a\u00020\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010>\u001a\u0004\b<\u0010=R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bA\u0010@R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bB\u0010@R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010E\u001a\u0004\bC\u0010DR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00109\u001a\u0004\b\u000e\u00108R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bF\u0010@R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010@\"\u0004\bH\u0010IR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010@R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bK\u0010@R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bL\u0010@R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bM\u0010@R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bN\u0010@R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bO\u0010@R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00109\u001a\u0004\b\u0017\u00108R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bP\u0010@R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bS\u0010RR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bT\u0010RR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bU\u0010RR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bV\u0010RR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bW\u0010@R\u0013\u0010 \u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bX\u0010RR\u0013\u0010!\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bY\u0010@R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010@R\u0013\u0010#\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b[\u0010@R\u0015\u0010$\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010E\u001a\u0004\b\\\u0010DR\u0013\u0010%\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b]\u0010@R\u0013\u0010&\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b^\u0010@R\u0013\u0010'\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b_\u0010@R\u0013\u0010(\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b`\u0010@R\u0013\u0010)\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\ba\u0010@R\u0013\u0010*\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bb\u0010@R\u0013\u0010+\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bc\u0010@R\u0013\u0010,\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bd\u0010@R\u0013\u0010-\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\be\u0010@R\u0013\u0010.\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bf\u0010@R\u0019\u0010/\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bg\u0010;R\u0013\u00101\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bh\u0010@R\u0013\u00102\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bi\u0010@R\u0013\u00103\u001a\u0004\u0018\u000104¢\u0006\b\n\u0000\u001a\u0004\bj\u0010k¨\u0006©\u0001"}, m90084d2 = {"Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;", "Landroid/os/Parcelable;", "taskCompletion", "", "taskNameList", "", "", "taskNameIndex", "", "taskTitleForHome", "taskIcon", "taskIconDark", "countDownTimestamp", "", "isNewcomer", "rewardCenterUri", "taskType", "taskTitle", "taskSubTitle", "taskDesc", "taskDescIcon", "taskDescIconDark", "taskId", "isSignUp", "newTaskStatus", "taskDisplayAmount", "Ljava/math/BigDecimal;", "proSpotTargetAmount", "proSpotCompleteAmount", "proContractTargetAmount", "proContractCompleteAmount", "waitDrawTaskType", "waitDrawPrizeAmount", "amount", "title", "subtitle", "countDownTime", "countDownTips", "countDownTipsDay", "countDownTipsHour", "countDownTipsMinute", "countDownTipsSecond", "rewardCenterTips", "btnTips", "btnAction", "waitDrawPrizeAmountDesc", "btnForwardUrl", "limitTaskList", "Lcom/kubi/operation/lib/entity/BonusTaskEntity;", "rewardValue", "rewardText", "additionalMessage", "Lcom/kubi/operation/lib/entity/AdditionMessage;", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/operation/lib/entity/AdditionMessage;)V", "getTaskCompletion", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTaskNameList", "()Ljava/util/List;", "getTaskNameIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTaskTitleForHome", "()Ljava/lang/String;", "getTaskIcon", "getTaskIconDark", "getCountDownTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRewardCenterUri", "getTaskType", "setTaskType", "(Ljava/lang/String;)V", "getTaskTitle", "getTaskSubTitle", "getTaskDesc", "getTaskDescIcon", "getTaskDescIconDark", "getTaskId", "getNewTaskStatus", "getTaskDisplayAmount", "()Ljava/math/BigDecimal;", "getProSpotTargetAmount", "getProSpotCompleteAmount", "getProContractTargetAmount", "getProContractCompleteAmount", "getWaitDrawTaskType", "getWaitDrawPrizeAmount", "getAmount", "getTitle", "getSubtitle", "getCountDownTime", "getCountDownTips", "getCountDownTipsDay", "getCountDownTipsHour", "getCountDownTipsMinute", "getCountDownTipsSecond", "getRewardCenterTips", "getBtnTips", "getBtnAction", "getWaitDrawPrizeAmountDesc", "getBtnForwardUrl", "getLimitTaskList", "getRewardValue", "getRewardText", "getAdditionalMessage", "()Lcom/kubi/operation/lib/entity/AdditionMessage;", "getCountdownMills", "showTaskIcon", "showDescIcon", "showGuideBtn", "showDrawBtn", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/operation/lib/entity/AdditionMessage;)Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WelfareTaskInfoEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WelfareTaskInfoEntity> CREATOR = new C19513a();

    @Nullable
    private final AdditionMessage additionalMessage;

    @Nullable
    private final String amount;

    @Nullable
    private final String btnAction;

    @Nullable
    private final String btnForwardUrl;

    @Nullable
    private final String btnTips;

    @Nullable
    private final Long countDownTime;

    @Nullable
    private final Long countDownTimestamp;

    @Nullable
    private final String countDownTips;

    @Nullable
    private final String countDownTipsDay;

    @Nullable
    private final String countDownTipsHour;

    @Nullable
    private final String countDownTipsMinute;

    @Nullable
    private final String countDownTipsSecond;

    @Nullable
    private final Boolean isNewcomer;

    @Nullable
    private final Boolean isSignUp;

    @Nullable
    private final List<BonusTaskEntity> limitTaskList;

    @Nullable
    private final String newTaskStatus;

    @Nullable
    private final BigDecimal proContractCompleteAmount;

    @Nullable
    private final BigDecimal proContractTargetAmount;

    @Nullable
    private final BigDecimal proSpotCompleteAmount;

    @Nullable
    private final BigDecimal proSpotTargetAmount;

    @Nullable
    private final String rewardCenterTips;

    @Nullable
    private final String rewardCenterUri;

    @Nullable
    private final String rewardText;

    @Nullable
    private final String rewardValue;

    @Nullable
    private final String subtitle;

    @Nullable
    private final Boolean taskCompletion;

    @Nullable
    private final String taskDesc;

    @Nullable
    private final String taskDescIcon;

    @Nullable
    private final String taskDescIconDark;

    @Nullable
    private final BigDecimal taskDisplayAmount;

    @Nullable
    private final String taskIcon;

    @Nullable
    private final String taskIconDark;

    @Nullable
    private final String taskId;

    @Nullable
    private final Integer taskNameIndex;

    @Nullable
    private final List<String> taskNameList;

    @Nullable
    private final String taskSubTitle;

    @Nullable
    private final String taskTitle;

    @Nullable
    private final String taskTitleForHome;

    @Nullable
    private String taskType;

    @Nullable
    private final String title;

    @Nullable
    private final BigDecimal waitDrawPrizeAmount;

    @Nullable
    private final String waitDrawPrizeAmountDesc;

    @Nullable
    private final String waitDrawTaskType;

    /* JADX INFO: renamed from: com.kubi.operation.lib.entity.WelfareTaskInfoEntity$a */
    /* JADX INFO: compiled from: WelfareTaskInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19513a implements Parcelable.Creator<WelfareTaskInfoEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WelfareTaskInfoEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string12 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            String string13 = parcel.readString();
            BigDecimal bigDecimal6 = (BigDecimal) parcel.readSerializable();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(BonusTaskEntity.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new WelfareTaskInfoEntity(boolValueOf, arrayListCreateStringArrayList, numValueOf, string, string2, string3, lValueOf, boolValueOf2, string4, string5, string6, string7, string8, string9, string10, string11, boolValueOf3, string12, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, string13, bigDecimal6, string14, string15, string16, lValueOf2, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, arrayList, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? AdditionMessage.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WelfareTaskInfoEntity[] newArray(int i11) {
            return new WelfareTaskInfoEntity[i11];
        }
    }

    public WelfareTaskInfoEntity(@Nullable Boolean bool, @Nullable List<String> list, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l11, @Nullable Boolean bool2, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Boolean bool3, @Nullable String str12, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable String str13, @Nullable BigDecimal bigDecimal6, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable Long l12, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable List<BonusTaskEntity> list2, @Nullable String str27, @Nullable String str28, @Nullable AdditionMessage additionMessage) {
        this.taskCompletion = bool;
        this.taskNameList = list;
        this.taskNameIndex = num;
        this.taskTitleForHome = str;
        this.taskIcon = str2;
        this.taskIconDark = str3;
        this.countDownTimestamp = l11;
        this.isNewcomer = bool2;
        this.rewardCenterUri = str4;
        this.taskType = str5;
        this.taskTitle = str6;
        this.taskSubTitle = str7;
        this.taskDesc = str8;
        this.taskDescIcon = str9;
        this.taskDescIconDark = str10;
        this.taskId = str11;
        this.isSignUp = bool3;
        this.newTaskStatus = str12;
        this.taskDisplayAmount = bigDecimal;
        this.proSpotTargetAmount = bigDecimal2;
        this.proSpotCompleteAmount = bigDecimal3;
        this.proContractTargetAmount = bigDecimal4;
        this.proContractCompleteAmount = bigDecimal5;
        this.waitDrawTaskType = str13;
        this.waitDrawPrizeAmount = bigDecimal6;
        this.amount = str14;
        this.title = str15;
        this.subtitle = str16;
        this.countDownTime = l12;
        this.countDownTips = str17;
        this.countDownTipsDay = str18;
        this.countDownTipsHour = str19;
        this.countDownTipsMinute = str20;
        this.countDownTipsSecond = str21;
        this.rewardCenterTips = str22;
        this.btnTips = str23;
        this.btnAction = str24;
        this.waitDrawPrizeAmountDesc = str25;
        this.btnForwardUrl = str26;
        this.limitTaskList = list2;
        this.rewardValue = str27;
        this.rewardText = str28;
        this.additionalMessage = additionMessage;
    }

    @NotNull
    public final WelfareTaskInfoEntity copy(@Nullable Boolean taskCompletion, @Nullable List<String> taskNameList, @Nullable Integer taskNameIndex, @Nullable String taskTitleForHome, @Nullable String taskIcon, @Nullable String taskIconDark, @Nullable Long countDownTimestamp, @Nullable Boolean isNewcomer, @Nullable String rewardCenterUri, @Nullable String taskType, @Nullable String taskTitle, @Nullable String taskSubTitle, @Nullable String taskDesc, @Nullable String taskDescIcon, @Nullable String taskDescIconDark, @Nullable String taskId, @Nullable Boolean isSignUp, @Nullable String newTaskStatus, @Nullable BigDecimal taskDisplayAmount, @Nullable BigDecimal proSpotTargetAmount, @Nullable BigDecimal proSpotCompleteAmount, @Nullable BigDecimal proContractTargetAmount, @Nullable BigDecimal proContractCompleteAmount, @Nullable String waitDrawTaskType, @Nullable BigDecimal waitDrawPrizeAmount, @Nullable String amount, @Nullable String title, @Nullable String subtitle, @Nullable Long countDownTime, @Nullable String countDownTips, @Nullable String countDownTipsDay, @Nullable String countDownTipsHour, @Nullable String countDownTipsMinute, @Nullable String countDownTipsSecond, @Nullable String rewardCenterTips, @Nullable String btnTips, @Nullable String btnAction, @Nullable String waitDrawPrizeAmountDesc, @Nullable String btnForwardUrl, @Nullable List<BonusTaskEntity> limitTaskList, @Nullable String rewardValue, @Nullable String rewardText, @Nullable AdditionMessage additionalMessage) {
        return new WelfareTaskInfoEntity(taskCompletion, taskNameList, taskNameIndex, taskTitleForHome, taskIcon, taskIconDark, countDownTimestamp, isNewcomer, rewardCenterUri, taskType, taskTitle, taskSubTitle, taskDesc, taskDescIcon, taskDescIconDark, taskId, isSignUp, newTaskStatus, taskDisplayAmount, proSpotTargetAmount, proSpotCompleteAmount, proContractTargetAmount, proContractCompleteAmount, waitDrawTaskType, waitDrawPrizeAmount, amount, title, subtitle, countDownTime, countDownTips, countDownTipsDay, countDownTipsHour, countDownTipsMinute, countDownTipsSecond, rewardCenterTips, btnTips, btnAction, waitDrawPrizeAmountDesc, btnForwardUrl, limitTaskList, rewardValue, rewardText, additionalMessage);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WelfareTaskInfoEntity)) {
            return false;
        }
        WelfareTaskInfoEntity welfareTaskInfoEntity = (WelfareTaskInfoEntity) other;
        return Intrinsics.areEqual(this.taskCompletion, welfareTaskInfoEntity.taskCompletion) && Intrinsics.areEqual(this.taskNameList, welfareTaskInfoEntity.taskNameList) && Intrinsics.areEqual(this.taskNameIndex, welfareTaskInfoEntity.taskNameIndex) && Intrinsics.areEqual(this.taskTitleForHome, welfareTaskInfoEntity.taskTitleForHome) && Intrinsics.areEqual(this.taskIcon, welfareTaskInfoEntity.taskIcon) && Intrinsics.areEqual(this.taskIconDark, welfareTaskInfoEntity.taskIconDark) && Intrinsics.areEqual(this.countDownTimestamp, welfareTaskInfoEntity.countDownTimestamp) && Intrinsics.areEqual(this.isNewcomer, welfareTaskInfoEntity.isNewcomer) && Intrinsics.areEqual(this.rewardCenterUri, welfareTaskInfoEntity.rewardCenterUri) && Intrinsics.areEqual(this.taskType, welfareTaskInfoEntity.taskType) && Intrinsics.areEqual(this.taskTitle, welfareTaskInfoEntity.taskTitle) && Intrinsics.areEqual(this.taskSubTitle, welfareTaskInfoEntity.taskSubTitle) && Intrinsics.areEqual(this.taskDesc, welfareTaskInfoEntity.taskDesc) && Intrinsics.areEqual(this.taskDescIcon, welfareTaskInfoEntity.taskDescIcon) && Intrinsics.areEqual(this.taskDescIconDark, welfareTaskInfoEntity.taskDescIconDark) && Intrinsics.areEqual(this.taskId, welfareTaskInfoEntity.taskId) && Intrinsics.areEqual(this.isSignUp, welfareTaskInfoEntity.isSignUp) && Intrinsics.areEqual(this.newTaskStatus, welfareTaskInfoEntity.newTaskStatus) && Intrinsics.areEqual(this.taskDisplayAmount, welfareTaskInfoEntity.taskDisplayAmount) && Intrinsics.areEqual(this.proSpotTargetAmount, welfareTaskInfoEntity.proSpotTargetAmount) && Intrinsics.areEqual(this.proSpotCompleteAmount, welfareTaskInfoEntity.proSpotCompleteAmount) && Intrinsics.areEqual(this.proContractTargetAmount, welfareTaskInfoEntity.proContractTargetAmount) && Intrinsics.areEqual(this.proContractCompleteAmount, welfareTaskInfoEntity.proContractCompleteAmount) && Intrinsics.areEqual(this.waitDrawTaskType, welfareTaskInfoEntity.waitDrawTaskType) && Intrinsics.areEqual(this.waitDrawPrizeAmount, welfareTaskInfoEntity.waitDrawPrizeAmount) && Intrinsics.areEqual(this.amount, welfareTaskInfoEntity.amount) && Intrinsics.areEqual(this.title, welfareTaskInfoEntity.title) && Intrinsics.areEqual(this.subtitle, welfareTaskInfoEntity.subtitle) && Intrinsics.areEqual(this.countDownTime, welfareTaskInfoEntity.countDownTime) && Intrinsics.areEqual(this.countDownTips, welfareTaskInfoEntity.countDownTips) && Intrinsics.areEqual(this.countDownTipsDay, welfareTaskInfoEntity.countDownTipsDay) && Intrinsics.areEqual(this.countDownTipsHour, welfareTaskInfoEntity.countDownTipsHour) && Intrinsics.areEqual(this.countDownTipsMinute, welfareTaskInfoEntity.countDownTipsMinute) && Intrinsics.areEqual(this.countDownTipsSecond, welfareTaskInfoEntity.countDownTipsSecond) && Intrinsics.areEqual(this.rewardCenterTips, welfareTaskInfoEntity.rewardCenterTips) && Intrinsics.areEqual(this.btnTips, welfareTaskInfoEntity.btnTips) && Intrinsics.areEqual(this.btnAction, welfareTaskInfoEntity.btnAction) && Intrinsics.areEqual(this.waitDrawPrizeAmountDesc, welfareTaskInfoEntity.waitDrawPrizeAmountDesc) && Intrinsics.areEqual(this.btnForwardUrl, welfareTaskInfoEntity.btnForwardUrl) && Intrinsics.areEqual(this.limitTaskList, welfareTaskInfoEntity.limitTaskList) && Intrinsics.areEqual(this.rewardValue, welfareTaskInfoEntity.rewardValue) && Intrinsics.areEqual(this.rewardText, welfareTaskInfoEntity.rewardText) && Intrinsics.areEqual(this.additionalMessage, welfareTaskInfoEntity.additionalMessage);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getTaskCompletion() {
        return this.taskCompletion;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTaskType() {
        return this.taskType;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTaskTitle() {
        return this.taskTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTaskSubTitle() {
        return this.taskSubTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTaskDesc() {
        return this.taskDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTaskDescIcon() {
        return this.taskDescIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getTaskDescIconDark() {
        return this.taskDescIconDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getIsSignUp() {
        return this.isSignUp;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getNewTaskStatus() {
        return this.newTaskStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final BigDecimal getTaskDisplayAmount() {
        return this.taskDisplayAmount;
    }

    @Nullable
    public final List<String> component2() {
        return this.taskNameList;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final BigDecimal getProSpotTargetAmount() {
        return this.proSpotTargetAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final BigDecimal getProSpotCompleteAmount() {
        return this.proSpotCompleteAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final BigDecimal getProContractTargetAmount() {
        return this.proContractTargetAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final BigDecimal getProContractCompleteAmount() {
        return this.proContractCompleteAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getWaitDrawTaskType() {
        return this.waitDrawTaskType;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final BigDecimal getWaitDrawPrizeAmount() {
        return this.waitDrawPrizeAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Long getCountDownTime() {
        return this.countDownTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTaskNameIndex() {
        return this.taskNameIndex;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getCountDownTips() {
        return this.countDownTips;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getCountDownTipsDay() {
        return this.countDownTipsDay;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getCountDownTipsHour() {
        return this.countDownTipsHour;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getCountDownTipsMinute() {
        return this.countDownTipsMinute;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getCountDownTipsSecond() {
        return this.countDownTipsSecond;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getRewardCenterTips() {
        return this.rewardCenterTips;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getBtnTips() {
        return this.btnTips;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getBtnAction() {
        return this.btnAction;
    }

    @Nullable
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getWaitDrawPrizeAmountDesc() {
        return this.waitDrawPrizeAmountDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getBtnForwardUrl() {
        return this.btnForwardUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTaskTitleForHome() {
        return this.taskTitleForHome;
    }

    @Nullable
    public final List<BonusTaskEntity> component40() {
        return this.limitTaskList;
    }

    @Nullable
    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getRewardValue() {
        return this.rewardValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getRewardText() {
        return this.rewardText;
    }

    @Nullable
    /* JADX INFO: renamed from: component43, reason: from getter */
    public final AdditionMessage getAdditionalMessage() {
        return this.additionalMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTaskIcon() {
        return this.taskIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTaskIconDark() {
        return this.taskIconDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getCountDownTimestamp() {
        return this.countDownTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getIsNewcomer() {
        return this.isNewcomer;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRewardCenterUri() {
        return this.rewardCenterUri;
    }

    @Nullable
    public final AdditionMessage getAdditionalMessage() {
        return this.additionalMessage;
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getBtnAction() {
        return this.btnAction;
    }

    @Nullable
    public final String getBtnForwardUrl() {
        return this.btnForwardUrl;
    }

    @Nullable
    public final String getBtnTips() {
        return this.btnTips;
    }

    @Nullable
    public final Long getCountDownTime() {
        return this.countDownTime;
    }

    @Nullable
    public final Long getCountDownTimestamp() {
        return this.countDownTimestamp;
    }

    @Nullable
    public final String getCountDownTips() {
        return this.countDownTips;
    }

    @Nullable
    public final String getCountDownTipsDay() {
        return this.countDownTipsDay;
    }

    @Nullable
    public final String getCountDownTipsHour() {
        return this.countDownTipsHour;
    }

    @Nullable
    public final String getCountDownTipsMinute() {
        return this.countDownTipsMinute;
    }

    @Nullable
    public final String getCountDownTipsSecond() {
        return this.countDownTipsSecond;
    }

    public final long getCountdownMills() {
        Long l11 = this.countDownTimestamp;
        if (l11 != null) {
            return l11.longValue();
        }
        return 0L;
    }

    @Nullable
    public final List<BonusTaskEntity> getLimitTaskList() {
        return this.limitTaskList;
    }

    @Nullable
    public final String getNewTaskStatus() {
        return this.newTaskStatus;
    }

    @Nullable
    public final BigDecimal getProContractCompleteAmount() {
        return this.proContractCompleteAmount;
    }

    @Nullable
    public final BigDecimal getProContractTargetAmount() {
        return this.proContractTargetAmount;
    }

    @Nullable
    public final BigDecimal getProSpotCompleteAmount() {
        return this.proSpotCompleteAmount;
    }

    @Nullable
    public final BigDecimal getProSpotTargetAmount() {
        return this.proSpotTargetAmount;
    }

    @Nullable
    public final String getRewardCenterTips() {
        return this.rewardCenterTips;
    }

    @Nullable
    public final String getRewardCenterUri() {
        return this.rewardCenterUri;
    }

    @Nullable
    public final String getRewardText() {
        return this.rewardText;
    }

    @Nullable
    public final String getRewardValue() {
        return this.rewardValue;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final Boolean getTaskCompletion() {
        return this.taskCompletion;
    }

    @Nullable
    public final String getTaskDesc() {
        return this.taskDesc;
    }

    @Nullable
    public final String getTaskDescIcon() {
        return this.taskDescIcon;
    }

    @Nullable
    public final String getTaskDescIconDark() {
        return this.taskDescIconDark;
    }

    @Nullable
    public final BigDecimal getTaskDisplayAmount() {
        return this.taskDisplayAmount;
    }

    @Nullable
    public final String getTaskIcon() {
        return this.taskIcon;
    }

    @Nullable
    public final String getTaskIconDark() {
        return this.taskIconDark;
    }

    @Nullable
    public final String getTaskId() {
        return this.taskId;
    }

    @Nullable
    public final Integer getTaskNameIndex() {
        return this.taskNameIndex;
    }

    @Nullable
    public final List<String> getTaskNameList() {
        return this.taskNameList;
    }

    @Nullable
    public final String getTaskSubTitle() {
        return this.taskSubTitle;
    }

    @Nullable
    public final String getTaskTitle() {
        return this.taskTitle;
    }

    @Nullable
    public final String getTaskTitleForHome() {
        return this.taskTitleForHome;
    }

    @Nullable
    public final String getTaskType() {
        return this.taskType;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final BigDecimal getWaitDrawPrizeAmount() {
        return this.waitDrawPrizeAmount;
    }

    @Nullable
    public final String getWaitDrawPrizeAmountDesc() {
        return this.waitDrawPrizeAmountDesc;
    }

    @Nullable
    public final String getWaitDrawTaskType() {
        return this.waitDrawTaskType;
    }

    public int hashCode() {
        Boolean bool = this.taskCompletion;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<String> list = this.taskNameList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.taskNameIndex;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.taskTitleForHome;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.taskIcon;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.taskIconDark;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.countDownTimestamp;
        int iHashCode7 = (iHashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool2 = this.isNewcomer;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.rewardCenterUri;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.taskType;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.taskTitle;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.taskSubTitle;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.taskDesc;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.taskDescIcon;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.taskDescIconDark;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.taskId;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool3 = this.isSignUp;
        int iHashCode17 = (iHashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str12 = this.newTaskStatus;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        BigDecimal bigDecimal = this.taskDisplayAmount;
        int iHashCode19 = (iHashCode18 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.proSpotTargetAmount;
        int iHashCode20 = (iHashCode19 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.proSpotCompleteAmount;
        int iHashCode21 = (iHashCode20 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.proContractTargetAmount;
        int iHashCode22 = (iHashCode21 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.proContractCompleteAmount;
        int iHashCode23 = (iHashCode22 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        String str13 = this.waitDrawTaskType;
        int iHashCode24 = (iHashCode23 + (str13 == null ? 0 : str13.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.waitDrawPrizeAmount;
        int iHashCode25 = (iHashCode24 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        String str14 = this.amount;
        int iHashCode26 = (iHashCode25 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.title;
        int iHashCode27 = (iHashCode26 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.subtitle;
        int iHashCode28 = (iHashCode27 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Long l12 = this.countDownTime;
        int iHashCode29 = (iHashCode28 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str17 = this.countDownTips;
        int iHashCode30 = (iHashCode29 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.countDownTipsDay;
        int iHashCode31 = (iHashCode30 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.countDownTipsHour;
        int iHashCode32 = (iHashCode31 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.countDownTipsMinute;
        int iHashCode33 = (iHashCode32 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.countDownTipsSecond;
        int iHashCode34 = (iHashCode33 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.rewardCenterTips;
        int iHashCode35 = (iHashCode34 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.btnTips;
        int iHashCode36 = (iHashCode35 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.btnAction;
        int iHashCode37 = (iHashCode36 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.waitDrawPrizeAmountDesc;
        int iHashCode38 = (iHashCode37 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.btnForwardUrl;
        int iHashCode39 = (iHashCode38 + (str26 == null ? 0 : str26.hashCode())) * 31;
        List<BonusTaskEntity> list2 = this.limitTaskList;
        int iHashCode40 = (iHashCode39 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str27 = this.rewardValue;
        int iHashCode41 = (iHashCode40 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.rewardText;
        int iHashCode42 = (iHashCode41 + (str28 == null ? 0 : str28.hashCode())) * 31;
        AdditionMessage additionMessage = this.additionalMessage;
        return iHashCode42 + (additionMessage != null ? additionMessage.hashCode() : 0);
    }

    @Nullable
    public final Boolean isNewcomer() {
        return this.isNewcomer;
    }

    @Nullable
    public final Boolean isSignUp() {
        return this.isSignUp;
    }

    public final void setTaskType(@Nullable String str) {
        this.taskType = str;
    }

    @Nullable
    public final String showDescIcon() {
        return DayNightThemeManager.f28592a.m33187l() ? this.taskDescIcon : this.taskDescIconDark;
    }

    public final boolean showDrawBtn() {
        AdditionMessage additionMessage = this.additionalMessage;
        return !(additionMessage != null ? Intrinsics.areEqual(additionMessage.getShowDrawButton(), Boolean.FALSE) : false);
    }

    public final boolean showGuideBtn() {
        AdditionMessage additionMessage = this.additionalMessage;
        return !(additionMessage != null ? Intrinsics.areEqual(additionMessage.getShowButton(), Boolean.FALSE) : false);
    }

    @Nullable
    public final String showTaskIcon() {
        return DayNightThemeManager.f28592a.m33187l() ? this.taskIcon : this.taskIconDark;
    }

    @NotNull
    public String toString() {
        return "WelfareTaskInfoEntity(taskCompletion=" + this.taskCompletion + ", taskNameList=" + this.taskNameList + ", taskNameIndex=" + this.taskNameIndex + ", taskTitleForHome=" + this.taskTitleForHome + ", taskIcon=" + this.taskIcon + ", taskIconDark=" + this.taskIconDark + ", countDownTimestamp=" + this.countDownTimestamp + ", isNewcomer=" + this.isNewcomer + ", rewardCenterUri=" + this.rewardCenterUri + ", taskType=" + this.taskType + ", taskTitle=" + this.taskTitle + ", taskSubTitle=" + this.taskSubTitle + ", taskDesc=" + this.taskDesc + ", taskDescIcon=" + this.taskDescIcon + ", taskDescIconDark=" + this.taskDescIconDark + ", taskId=" + this.taskId + ", isSignUp=" + this.isSignUp + ", newTaskStatus=" + this.newTaskStatus + ", taskDisplayAmount=" + this.taskDisplayAmount + ", proSpotTargetAmount=" + this.proSpotTargetAmount + ", proSpotCompleteAmount=" + this.proSpotCompleteAmount + ", proContractTargetAmount=" + this.proContractTargetAmount + ", proContractCompleteAmount=" + this.proContractCompleteAmount + ", waitDrawTaskType=" + this.waitDrawTaskType + ", waitDrawPrizeAmount=" + this.waitDrawPrizeAmount + ", amount=" + this.amount + ", title=" + this.title + ", subtitle=" + this.subtitle + ", countDownTime=" + this.countDownTime + ", countDownTips=" + this.countDownTips + ", countDownTipsDay=" + this.countDownTipsDay + ", countDownTipsHour=" + this.countDownTipsHour + ", countDownTipsMinute=" + this.countDownTipsMinute + ", countDownTipsSecond=" + this.countDownTipsSecond + ", rewardCenterTips=" + this.rewardCenterTips + ", btnTips=" + this.btnTips + ", btnAction=" + this.btnAction + ", waitDrawPrizeAmountDesc=" + this.waitDrawPrizeAmountDesc + ", btnForwardUrl=" + this.btnForwardUrl + ", limitTaskList=" + this.limitTaskList + ", rewardValue=" + this.rewardValue + ", rewardText=" + this.rewardText + ", additionalMessage=" + this.additionalMessage + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.taskCompletion;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeStringList(this.taskNameList);
        Integer num = this.taskNameIndex;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.taskTitleForHome);
        dest.writeString(this.taskIcon);
        dest.writeString(this.taskIconDark);
        Long l11 = this.countDownTimestamp;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Boolean bool2 = this.isNewcomer;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.rewardCenterUri);
        dest.writeString(this.taskType);
        dest.writeString(this.taskTitle);
        dest.writeString(this.taskSubTitle);
        dest.writeString(this.taskDesc);
        dest.writeString(this.taskDescIcon);
        dest.writeString(this.taskDescIconDark);
        dest.writeString(this.taskId);
        Boolean bool3 = this.isSignUp;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.newTaskStatus);
        dest.writeSerializable(this.taskDisplayAmount);
        dest.writeSerializable(this.proSpotTargetAmount);
        dest.writeSerializable(this.proSpotCompleteAmount);
        dest.writeSerializable(this.proContractTargetAmount);
        dest.writeSerializable(this.proContractCompleteAmount);
        dest.writeString(this.waitDrawTaskType);
        dest.writeSerializable(this.waitDrawPrizeAmount);
        dest.writeString(this.amount);
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        Long l12 = this.countDownTime;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeString(this.countDownTips);
        dest.writeString(this.countDownTipsDay);
        dest.writeString(this.countDownTipsHour);
        dest.writeString(this.countDownTipsMinute);
        dest.writeString(this.countDownTipsSecond);
        dest.writeString(this.rewardCenterTips);
        dest.writeString(this.btnTips);
        dest.writeString(this.btnAction);
        dest.writeString(this.waitDrawPrizeAmountDesc);
        dest.writeString(this.btnForwardUrl);
        List<BonusTaskEntity> list = this.limitTaskList;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<BonusTaskEntity> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.rewardValue);
        dest.writeString(this.rewardText);
        AdditionMessage additionMessage = this.additionalMessage;
        if (additionMessage == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            additionMessage.writeToParcel(dest, flags);
        }
    }
}
