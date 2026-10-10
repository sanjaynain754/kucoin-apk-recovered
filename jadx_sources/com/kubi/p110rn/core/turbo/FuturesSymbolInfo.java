package com.kubi.p110rn.core.turbo;

import androidx.media3.common.C2711C;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeSymbolsCoinTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\bX\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b/\u00100J\b\u0010[\u001a\u00020\\H\u0016J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009a\u0004\u0010\u0089\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0017\u0010\u008a\u0001\u001a\u00030\u008b\u00012\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u0001HÖ\u0003J\u000b\u0010\u008e\u0001\u001a\u00030\u008f\u0001HÖ\u0001J\n\u0010\u0090\u0001\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u00102R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u00102R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u00102R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u00102R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u00102R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u00102R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u00102R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u00102R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u00102R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u00102R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u00102R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u00102R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u00102R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u00102R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u00102R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u00102R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u00102R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u00102R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u00102R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u00102R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u00102R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u00102R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u00102R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u00102R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u00102R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u00102R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u00102R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u00102R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u00102R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u00102R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u00102R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u00102R\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u00102R\u0013\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u00102R\u0013\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u00102R\u0013\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u00102R\u0013\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u00102R\u0013\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u00102R\u0013\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u00102R\u0013\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u00102R\u0013\u0010-\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u00102R\u0013\u0010.\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u00102¨\u0006\u0091\u0001"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/FuturesSymbolInfo;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "type", "", "isInverse", "symbol", "rootSymbol", "baseCurrency", "displayBaseCurrency", "quoteCurrency", "status", "createdAt", "expireDate", "updatedAt", "fairMethod", "firstOpenDate", "fundingBaseSymbol", "fundingQuoteSymbol", "fundingRateSymbol", "indexSymbol", "initialMargin", "isDeleverage", "isQuanto", "lotSize", "maintainMargin", "makerFeeRate", "makerFixFee", "markMethod", "maxOrderQty", "indexPriceTickSize", "maxPrice", "maxRiskLimit", "minRiskLimit", "riskStep", "settleCurrency", "settleDate", "settlementFee", "takerFeeRate", "takerFixFee", "tickSize", "multiplier", "symbolName", "prepName", "maxLeverage", "iconUrl", "marketStage", "preMarketToPerpDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getSymbol", "getRootSymbol", "getBaseCurrency", "getDisplayBaseCurrency", "getQuoteCurrency", "getStatus", "getCreatedAt", "getExpireDate", "getUpdatedAt", "getFairMethod", "getFirstOpenDate", "getFundingBaseSymbol", "getFundingQuoteSymbol", "getFundingRateSymbol", "getIndexSymbol", "getInitialMargin", "getLotSize", "getMaintainMargin", "getMakerFeeRate", "getMakerFixFee", "getMarkMethod", "getMaxOrderQty", "getIndexPriceTickSize", "getMaxPrice", "getMaxRiskLimit", "getMinRiskLimit", "getRiskStep", "getSettleCurrency", "getSettleDate", "getSettlementFee", "getTakerFeeRate", "getTakerFixFee", "getTickSize", "getMultiplier", "getSymbolName", "getPrepName", "getMaxLeverage", "getIconUrl", "getMarketStage", "getPreMarketToPerpDate", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeSymbolsCoinTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeSymbolsCoinTurboModule.kt\ncom/kubi/rn/core/turbo/FuturesSymbolInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,521:1\n1#2:522\n*E\n"})
public final /* data */ class FuturesSymbolInfo implements WritableMapSerializable {

    @Nullable
    private final String baseCurrency;

    @Nullable
    private final String createdAt;

    @Nullable
    private final String displayBaseCurrency;

    @Nullable
    private final String expireDate;

    @Nullable
    private final String fairMethod;

    @Nullable
    private final String firstOpenDate;

    @Nullable
    private final String fundingBaseSymbol;

    @Nullable
    private final String fundingQuoteSymbol;

    @Nullable
    private final String fundingRateSymbol;

    @Nullable
    private final String iconUrl;

    @Nullable
    private final String indexPriceTickSize;

    @Nullable
    private final String indexSymbol;

    @Nullable
    private final String initialMargin;

    @Nullable
    private final String isDeleverage;

    @Nullable
    private final String isInverse;

    @Nullable
    private final String isQuanto;

    @Nullable
    private final String lotSize;

    @Nullable
    private final String maintainMargin;

    @Nullable
    private final String makerFeeRate;

    @Nullable
    private final String makerFixFee;

    @Nullable
    private final String markMethod;

    @Nullable
    private final String marketStage;

    @Nullable
    private final String maxLeverage;

    @Nullable
    private final String maxOrderQty;

    @Nullable
    private final String maxPrice;

    @Nullable
    private final String maxRiskLimit;

    @Nullable
    private final String minRiskLimit;

    @Nullable
    private final String multiplier;

    @Nullable
    private final String preMarketToPerpDate;

    @Nullable
    private final String prepName;

    @Nullable
    private final String quoteCurrency;

    @Nullable
    private final String riskStep;

    @Nullable
    private final String rootSymbol;

    @Nullable
    private final String settleCurrency;

    @Nullable
    private final String settleDate;

    @Nullable
    private final String settlementFee;

    @Nullable
    private final String status;

    @Nullable
    private final String symbol;

    @Nullable
    private final String symbolName;

    @Nullable
    private final String takerFeeRate;

    @Nullable
    private final String takerFixFee;

    @Nullable
    private final String tickSize;

    @Nullable
    private final String type;

    @Nullable
    private final String updatedAt;

    public FuturesSymbolInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 4095, null);
    }

    @NotNull
    public final FuturesSymbolInfo copy(@Nullable String type, @Nullable String isInverse, @Nullable String symbol, @Nullable String rootSymbol, @Nullable String baseCurrency, @Nullable String displayBaseCurrency, @Nullable String quoteCurrency, @Nullable String status, @Nullable String createdAt, @Nullable String expireDate, @Nullable String updatedAt, @Nullable String fairMethod, @Nullable String firstOpenDate, @Nullable String fundingBaseSymbol, @Nullable String fundingQuoteSymbol, @Nullable String fundingRateSymbol, @Nullable String indexSymbol, @Nullable String initialMargin, @Nullable String isDeleverage, @Nullable String isQuanto, @Nullable String lotSize, @Nullable String maintainMargin, @Nullable String makerFeeRate, @Nullable String makerFixFee, @Nullable String markMethod, @Nullable String maxOrderQty, @Nullable String indexPriceTickSize, @Nullable String maxPrice, @Nullable String maxRiskLimit, @Nullable String minRiskLimit, @Nullable String riskStep, @Nullable String settleCurrency, @Nullable String settleDate, @Nullable String settlementFee, @Nullable String takerFeeRate, @Nullable String takerFixFee, @Nullable String tickSize, @Nullable String multiplier, @Nullable String symbolName, @Nullable String prepName, @Nullable String maxLeverage, @Nullable String iconUrl, @Nullable String marketStage, @Nullable String preMarketToPerpDate) {
        return new FuturesSymbolInfo(type, isInverse, symbol, rootSymbol, baseCurrency, displayBaseCurrency, quoteCurrency, status, createdAt, expireDate, updatedAt, fairMethod, firstOpenDate, fundingBaseSymbol, fundingQuoteSymbol, fundingRateSymbol, indexSymbol, initialMargin, isDeleverage, isQuanto, lotSize, maintainMargin, makerFeeRate, makerFixFee, markMethod, maxOrderQty, indexPriceTickSize, maxPrice, maxRiskLimit, minRiskLimit, riskStep, settleCurrency, settleDate, settlementFee, takerFeeRate, takerFixFee, tickSize, multiplier, symbolName, prepName, maxLeverage, iconUrl, marketStage, preMarketToPerpDate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesSymbolInfo)) {
            return false;
        }
        FuturesSymbolInfo futuresSymbolInfo = (FuturesSymbolInfo) other;
        return Intrinsics.areEqual(this.type, futuresSymbolInfo.type) && Intrinsics.areEqual(this.isInverse, futuresSymbolInfo.isInverse) && Intrinsics.areEqual(this.symbol, futuresSymbolInfo.symbol) && Intrinsics.areEqual(this.rootSymbol, futuresSymbolInfo.rootSymbol) && Intrinsics.areEqual(this.baseCurrency, futuresSymbolInfo.baseCurrency) && Intrinsics.areEqual(this.displayBaseCurrency, futuresSymbolInfo.displayBaseCurrency) && Intrinsics.areEqual(this.quoteCurrency, futuresSymbolInfo.quoteCurrency) && Intrinsics.areEqual(this.status, futuresSymbolInfo.status) && Intrinsics.areEqual(this.createdAt, futuresSymbolInfo.createdAt) && Intrinsics.areEqual(this.expireDate, futuresSymbolInfo.expireDate) && Intrinsics.areEqual(this.updatedAt, futuresSymbolInfo.updatedAt) && Intrinsics.areEqual(this.fairMethod, futuresSymbolInfo.fairMethod) && Intrinsics.areEqual(this.firstOpenDate, futuresSymbolInfo.firstOpenDate) && Intrinsics.areEqual(this.fundingBaseSymbol, futuresSymbolInfo.fundingBaseSymbol) && Intrinsics.areEqual(this.fundingQuoteSymbol, futuresSymbolInfo.fundingQuoteSymbol) && Intrinsics.areEqual(this.fundingRateSymbol, futuresSymbolInfo.fundingRateSymbol) && Intrinsics.areEqual(this.indexSymbol, futuresSymbolInfo.indexSymbol) && Intrinsics.areEqual(this.initialMargin, futuresSymbolInfo.initialMargin) && Intrinsics.areEqual(this.isDeleverage, futuresSymbolInfo.isDeleverage) && Intrinsics.areEqual(this.isQuanto, futuresSymbolInfo.isQuanto) && Intrinsics.areEqual(this.lotSize, futuresSymbolInfo.lotSize) && Intrinsics.areEqual(this.maintainMargin, futuresSymbolInfo.maintainMargin) && Intrinsics.areEqual(this.makerFeeRate, futuresSymbolInfo.makerFeeRate) && Intrinsics.areEqual(this.makerFixFee, futuresSymbolInfo.makerFixFee) && Intrinsics.areEqual(this.markMethod, futuresSymbolInfo.markMethod) && Intrinsics.areEqual(this.maxOrderQty, futuresSymbolInfo.maxOrderQty) && Intrinsics.areEqual(this.indexPriceTickSize, futuresSymbolInfo.indexPriceTickSize) && Intrinsics.areEqual(this.maxPrice, futuresSymbolInfo.maxPrice) && Intrinsics.areEqual(this.maxRiskLimit, futuresSymbolInfo.maxRiskLimit) && Intrinsics.areEqual(this.minRiskLimit, futuresSymbolInfo.minRiskLimit) && Intrinsics.areEqual(this.riskStep, futuresSymbolInfo.riskStep) && Intrinsics.areEqual(this.settleCurrency, futuresSymbolInfo.settleCurrency) && Intrinsics.areEqual(this.settleDate, futuresSymbolInfo.settleDate) && Intrinsics.areEqual(this.settlementFee, futuresSymbolInfo.settlementFee) && Intrinsics.areEqual(this.takerFeeRate, futuresSymbolInfo.takerFeeRate) && Intrinsics.areEqual(this.takerFixFee, futuresSymbolInfo.takerFixFee) && Intrinsics.areEqual(this.tickSize, futuresSymbolInfo.tickSize) && Intrinsics.areEqual(this.multiplier, futuresSymbolInfo.multiplier) && Intrinsics.areEqual(this.symbolName, futuresSymbolInfo.symbolName) && Intrinsics.areEqual(this.prepName, futuresSymbolInfo.prepName) && Intrinsics.areEqual(this.maxLeverage, futuresSymbolInfo.maxLeverage) && Intrinsics.areEqual(this.iconUrl, futuresSymbolInfo.iconUrl) && Intrinsics.areEqual(this.marketStage, futuresSymbolInfo.marketStage) && Intrinsics.areEqual(this.preMarketToPerpDate, futuresSymbolInfo.preMarketToPerpDate);
    }

    public FuturesSymbolInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable String str37, @Nullable String str38, @Nullable String str39, @Nullable String str40, @Nullable String str41, @Nullable String str42, @Nullable String str43, @Nullable String str44) {
        this.type = str;
        this.isInverse = str2;
        this.symbol = str3;
        this.rootSymbol = str4;
        this.baseCurrency = str5;
        this.displayBaseCurrency = str6;
        this.quoteCurrency = str7;
        this.status = str8;
        this.createdAt = str9;
        this.expireDate = str10;
        this.updatedAt = str11;
        this.fairMethod = str12;
        this.firstOpenDate = str13;
        this.fundingBaseSymbol = str14;
        this.fundingQuoteSymbol = str15;
        this.fundingRateSymbol = str16;
        this.indexSymbol = str17;
        this.initialMargin = str18;
        this.isDeleverage = str19;
        this.isQuanto = str20;
        this.lotSize = str21;
        this.maintainMargin = str22;
        this.makerFeeRate = str23;
        this.makerFixFee = str24;
        this.markMethod = str25;
        this.maxOrderQty = str26;
        this.indexPriceTickSize = str27;
        this.maxPrice = str28;
        this.maxRiskLimit = str29;
        this.minRiskLimit = str30;
        this.riskStep = str31;
        this.settleCurrency = str32;
        this.settleDate = str33;
        this.settlementFee = str34;
        this.takerFeeRate = str35;
        this.takerFixFee = str36;
        this.tickSize = str37;
        this.multiplier = str38;
        this.symbolName = str39;
        this.prepName = str40;
        this.maxLeverage = str41;
        this.iconUrl = str42;
        this.marketStage = str43;
        this.preMarketToPerpDate = str44;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getExpireDate() {
        return this.expireDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getFairMethod() {
        return this.fairMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getFirstOpenDate() {
        return this.firstOpenDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getFundingBaseSymbol() {
        return this.fundingBaseSymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getFundingQuoteSymbol() {
        return this.fundingQuoteSymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getFundingRateSymbol() {
        return this.fundingRateSymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getIndexSymbol() {
        return this.indexSymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getInitialMargin() {
        return this.initialMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getIsDeleverage() {
        return this.isDeleverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIsInverse() {
        return this.isInverse;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getIsQuanto() {
        return this.isQuanto;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getLotSize() {
        return this.lotSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getMaintainMargin() {
        return this.maintainMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getMakerFeeRate() {
        return this.makerFeeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getMakerFixFee() {
        return this.makerFixFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getMarkMethod() {
        return this.markMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getMaxOrderQty() {
        return this.maxOrderQty;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getIndexPriceTickSize() {
        return this.indexPriceTickSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getMaxPrice() {
        return this.maxPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getMaxRiskLimit() {
        return this.maxRiskLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getMinRiskLimit() {
        return this.minRiskLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getRiskStep() {
        return this.riskStep;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getSettleCurrency() {
        return this.settleCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getSettleDate() {
        return this.settleDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getSettlementFee() {
        return this.settlementFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getTakerFeeRate() {
        return this.takerFeeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getTakerFixFee() {
        return this.takerFixFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getTickSize() {
        return this.tickSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getMultiplier() {
        return this.multiplier;
    }

    @Nullable
    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getSymbolName() {
        return this.symbolName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRootSymbol() {
        return this.rootSymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getPrepName() {
        return this.prepName;
    }

    @Nullable
    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getMarketStage() {
        return this.marketStage;
    }

    @Nullable
    /* JADX INFO: renamed from: component44, reason: from getter */
    public final String getPreMarketToPerpDate() {
        return this.preMarketToPerpDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDisplayBaseCurrency() {
        return this.displayBaseCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getDisplayBaseCurrency() {
        return this.displayBaseCurrency;
    }

    @Nullable
    public final String getExpireDate() {
        return this.expireDate;
    }

    @Nullable
    public final String getFairMethod() {
        return this.fairMethod;
    }

    @Nullable
    public final String getFirstOpenDate() {
        return this.firstOpenDate;
    }

    @Nullable
    public final String getFundingBaseSymbol() {
        return this.fundingBaseSymbol;
    }

    @Nullable
    public final String getFundingQuoteSymbol() {
        return this.fundingQuoteSymbol;
    }

    @Nullable
    public final String getFundingRateSymbol() {
        return this.fundingRateSymbol;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getIndexPriceTickSize() {
        return this.indexPriceTickSize;
    }

    @Nullable
    public final String getIndexSymbol() {
        return this.indexSymbol;
    }

    @Nullable
    public final String getInitialMargin() {
        return this.initialMargin;
    }

    @Nullable
    public final String getLotSize() {
        return this.lotSize;
    }

    @Nullable
    public final String getMaintainMargin() {
        return this.maintainMargin;
    }

    @Nullable
    public final String getMakerFeeRate() {
        return this.makerFeeRate;
    }

    @Nullable
    public final String getMakerFixFee() {
        return this.makerFixFee;
    }

    @Nullable
    public final String getMarkMethod() {
        return this.markMethod;
    }

    @Nullable
    public final String getMarketStage() {
        return this.marketStage;
    }

    @Nullable
    public final String getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    public final String getMaxOrderQty() {
        return this.maxOrderQty;
    }

    @Nullable
    public final String getMaxPrice() {
        return this.maxPrice;
    }

    @Nullable
    public final String getMaxRiskLimit() {
        return this.maxRiskLimit;
    }

    @Nullable
    public final String getMinRiskLimit() {
        return this.minRiskLimit;
    }

    @Nullable
    public final String getMultiplier() {
        return this.multiplier;
    }

    @Nullable
    public final String getPreMarketToPerpDate() {
        return this.preMarketToPerpDate;
    }

    @Nullable
    public final String getPrepName() {
        return this.prepName;
    }

    @Nullable
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    public final String getRiskStep() {
        return this.riskStep;
    }

    @Nullable
    public final String getRootSymbol() {
        return this.rootSymbol;
    }

    @Nullable
    public final String getSettleCurrency() {
        return this.settleCurrency;
    }

    @Nullable
    public final String getSettleDate() {
        return this.settleDate;
    }

    @Nullable
    public final String getSettlementFee() {
        return this.settlementFee;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getSymbolName() {
        return this.symbolName;
    }

    @Nullable
    public final String getTakerFeeRate() {
        return this.takerFeeRate;
    }

    @Nullable
    public final String getTakerFixFee() {
        return this.takerFixFee;
    }

    @Nullable
    public final String getTickSize() {
        return this.tickSize;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.isInverse;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.symbol;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rootSymbol;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.baseCurrency;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.displayBaseCurrency;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.quoteCurrency;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.status;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.createdAt;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.expireDate;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.updatedAt;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.fairMethod;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.firstOpenDate;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.fundingBaseSymbol;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.fundingQuoteSymbol;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.fundingRateSymbol;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.indexSymbol;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.initialMargin;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.isDeleverage;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.isQuanto;
        int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.lotSize;
        int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.maintainMargin;
        int iHashCode22 = (iHashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.makerFeeRate;
        int iHashCode23 = (iHashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.makerFixFee;
        int iHashCode24 = (iHashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.markMethod;
        int iHashCode25 = (iHashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.maxOrderQty;
        int iHashCode26 = (iHashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.indexPriceTickSize;
        int iHashCode27 = (iHashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.maxPrice;
        int iHashCode28 = (iHashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.maxRiskLimit;
        int iHashCode29 = (iHashCode28 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.minRiskLimit;
        int iHashCode30 = (iHashCode29 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.riskStep;
        int iHashCode31 = (iHashCode30 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.settleCurrency;
        int iHashCode32 = (iHashCode31 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.settleDate;
        int iHashCode33 = (iHashCode32 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.settlementFee;
        int iHashCode34 = (iHashCode33 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.takerFeeRate;
        int iHashCode35 = (iHashCode34 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.takerFixFee;
        int iHashCode36 = (iHashCode35 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.tickSize;
        int iHashCode37 = (iHashCode36 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.multiplier;
        int iHashCode38 = (iHashCode37 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.symbolName;
        int iHashCode39 = (iHashCode38 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.prepName;
        int iHashCode40 = (iHashCode39 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.maxLeverage;
        int iHashCode41 = (iHashCode40 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.iconUrl;
        int iHashCode42 = (iHashCode41 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.marketStage;
        int iHashCode43 = (iHashCode42 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.preMarketToPerpDate;
        return iHashCode43 + (str44 != null ? str44.hashCode() : 0);
    }

    @Nullable
    public final String isDeleverage() {
        return this.isDeleverage;
    }

    @Nullable
    public final String isInverse() {
        return this.isInverse;
    }

    @Nullable
    public final String isQuanto() {
        return this.isQuanto;
    }

    @NotNull
    public String toString() {
        return "FuturesSymbolInfo(type=" + this.type + ", isInverse=" + this.isInverse + ", symbol=" + this.symbol + ", rootSymbol=" + this.rootSymbol + ", baseCurrency=" + this.baseCurrency + ", displayBaseCurrency=" + this.displayBaseCurrency + ", quoteCurrency=" + this.quoteCurrency + ", status=" + this.status + ", createdAt=" + this.createdAt + ", expireDate=" + this.expireDate + ", updatedAt=" + this.updatedAt + ", fairMethod=" + this.fairMethod + ", firstOpenDate=" + this.firstOpenDate + ", fundingBaseSymbol=" + this.fundingBaseSymbol + ", fundingQuoteSymbol=" + this.fundingQuoteSymbol + ", fundingRateSymbol=" + this.fundingRateSymbol + ", indexSymbol=" + this.indexSymbol + ", initialMargin=" + this.initialMargin + ", isDeleverage=" + this.isDeleverage + ", isQuanto=" + this.isQuanto + ", lotSize=" + this.lotSize + ", maintainMargin=" + this.maintainMargin + ", makerFeeRate=" + this.makerFeeRate + ", makerFixFee=" + this.makerFixFee + ", markMethod=" + this.markMethod + ", maxOrderQty=" + this.maxOrderQty + ", indexPriceTickSize=" + this.indexPriceTickSize + ", maxPrice=" + this.maxPrice + ", maxRiskLimit=" + this.maxRiskLimit + ", minRiskLimit=" + this.minRiskLimit + ", riskStep=" + this.riskStep + ", settleCurrency=" + this.settleCurrency + ", settleDate=" + this.settleDate + ", settlementFee=" + this.settlementFee + ", takerFeeRate=" + this.takerFeeRate + ", takerFixFee=" + this.takerFixFee + ", tickSize=" + this.tickSize + ", multiplier=" + this.multiplier + ", symbolName=" + this.symbolName + ", prepName=" + this.prepName + ", maxLeverage=" + this.maxLeverage + ", iconUrl=" + this.iconUrl + ", marketStage=" + this.marketStage + ", preMarketToPerpDate=" + this.preMarketToPerpDate + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.type;
        if (str != null) {
            writableMapCreateMap.putString("type", str.toString());
        }
        String str2 = this.isInverse;
        if (str2 != null) {
            writableMapCreateMap.putString("isInverse", str2.toString());
        }
        String str3 = this.symbol;
        if (str3 != null) {
            writableMapCreateMap.putString("symbol", str3.toString());
        }
        String str4 = this.rootSymbol;
        if (str4 != null) {
            writableMapCreateMap.putString("rootSymbol", str4.toString());
        }
        String str5 = this.baseCurrency;
        if (str5 != null) {
            writableMapCreateMap.putString("baseCurrency", str5.toString());
        }
        String str6 = this.displayBaseCurrency;
        if (str6 != null) {
            writableMapCreateMap.putString("displayBaseCurrency", str6.toString());
        }
        String str7 = this.quoteCurrency;
        if (str7 != null) {
            writableMapCreateMap.putString("quoteCurrency", str7.toString());
        }
        String str8 = this.status;
        if (str8 != null) {
            writableMapCreateMap.putString("status", str8.toString());
        }
        String str9 = this.createdAt;
        if (str9 != null) {
            writableMapCreateMap.putString("createdAt", str9.toString());
        }
        String str10 = this.expireDate;
        if (str10 != null) {
            writableMapCreateMap.putString("expireDate", str10.toString());
        }
        String str11 = this.updatedAt;
        if (str11 != null) {
            writableMapCreateMap.putString("updatedAt", str11.toString());
        }
        String str12 = this.fairMethod;
        if (str12 != null) {
            writableMapCreateMap.putString("fairMethod", str12.toString());
        }
        String str13 = this.firstOpenDate;
        if (str13 != null) {
            writableMapCreateMap.putString("firstOpenDate", str13.toString());
        }
        String str14 = this.fundingBaseSymbol;
        if (str14 != null) {
            writableMapCreateMap.putString("fundingBaseSymbol", str14.toString());
        }
        String str15 = this.fundingQuoteSymbol;
        if (str15 != null) {
            writableMapCreateMap.putString("fundingQuoteSymbol", str15.toString());
        }
        String str16 = this.fundingRateSymbol;
        if (str16 != null) {
            writableMapCreateMap.putString("fundingRateSymbol", str16.toString());
        }
        String str17 = this.indexSymbol;
        if (str17 != null) {
            writableMapCreateMap.putString("indexSymbol", str17.toString());
        }
        String str18 = this.initialMargin;
        if (str18 != null) {
            writableMapCreateMap.putString("initialMargin", str18.toString());
        }
        String str19 = this.isDeleverage;
        if (str19 != null) {
            writableMapCreateMap.putString("isDeleverage", str19.toString());
        }
        String str20 = this.isQuanto;
        if (str20 != null) {
            writableMapCreateMap.putString("isQuanto", str20.toString());
        }
        String str21 = this.lotSize;
        if (str21 != null) {
            writableMapCreateMap.putString("lotSize", str21.toString());
        }
        String str22 = this.maintainMargin;
        if (str22 != null) {
            writableMapCreateMap.putString("maintainMargin", str22.toString());
        }
        String str23 = this.makerFeeRate;
        if (str23 != null) {
            writableMapCreateMap.putString("makerFeeRate", str23.toString());
        }
        String str24 = this.makerFixFee;
        if (str24 != null) {
            writableMapCreateMap.putString("makerFixFee", str24.toString());
        }
        String str25 = this.markMethod;
        if (str25 != null) {
            writableMapCreateMap.putString("markMethod", str25.toString());
        }
        String str26 = this.maxOrderQty;
        if (str26 != null) {
            writableMapCreateMap.putString("maxOrderQty", str26.toString());
        }
        String str27 = this.indexPriceTickSize;
        if (str27 != null) {
            writableMapCreateMap.putString("indexPriceTickSize", str27.toString());
        }
        String str28 = this.maxPrice;
        if (str28 != null) {
            writableMapCreateMap.putString("maxPrice", str28.toString());
        }
        String str29 = this.maxRiskLimit;
        if (str29 != null) {
            writableMapCreateMap.putString("maxRiskLimit", str29.toString());
        }
        String str30 = this.minRiskLimit;
        if (str30 != null) {
            writableMapCreateMap.putString("minRiskLimit", str30.toString());
        }
        String str31 = this.riskStep;
        if (str31 != null) {
            writableMapCreateMap.putString("riskStep", str31.toString());
        }
        String str32 = this.settleCurrency;
        if (str32 != null) {
            writableMapCreateMap.putString("settleCurrency", str32.toString());
        }
        String str33 = this.settleDate;
        if (str33 != null) {
            writableMapCreateMap.putString("settleDate", str33.toString());
        }
        String str34 = this.settlementFee;
        if (str34 != null) {
            writableMapCreateMap.putString("settlementFee", str34.toString());
        }
        String str35 = this.takerFeeRate;
        if (str35 != null) {
            writableMapCreateMap.putString("takerFeeRate", str35.toString());
        }
        String str36 = this.takerFixFee;
        if (str36 != null) {
            writableMapCreateMap.putString("takerFixFee", str36.toString());
        }
        String str37 = this.tickSize;
        if (str37 != null) {
            writableMapCreateMap.putString("tickSize", str37.toString());
        }
        String str38 = this.multiplier;
        if (str38 != null) {
            writableMapCreateMap.putString("multiplier", str38.toString());
        }
        String str39 = this.symbolName;
        if (str39 != null) {
            writableMapCreateMap.putString("symbolName", str39.toString());
        }
        String str40 = this.prepName;
        if (str40 != null) {
            writableMapCreateMap.putString("prepName", str40.toString());
        }
        String str41 = this.maxLeverage;
        if (str41 != null) {
            writableMapCreateMap.putString("maxLeverage", str41.toString());
        }
        String str42 = this.iconUrl;
        if (str42 != null) {
            writableMapCreateMap.putString("iconUrl", str42.toString());
        }
        String str43 = this.marketStage;
        if (str43 != null) {
            writableMapCreateMap.putString("marketStage", str43.toString());
        }
        String str44 = this.preMarketToPerpDate;
        if (str44 != null) {
            writableMapCreateMap.putString("preMarketToPerpDate", str44.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FuturesSymbolInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        String str45 = (i11 & 1) != 0 ? null : str;
        this(str45, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : str10, (i11 & 1024) != 0 ? null : str11, (i11 & 2048) != 0 ? null : str12, (i11 & 4096) != 0 ? null : str13, (i11 & 8192) != 0 ? null : str14, (i11 & 16384) != 0 ? null : str15, (i11 & 32768) != 0 ? null : str16, (i11 & 65536) != 0 ? null : str17, (i11 & 131072) != 0 ? null : str18, (i11 & 262144) != 0 ? null : str19, (i11 & 524288) != 0 ? null : str20, (i11 & 1048576) != 0 ? null : str21, (i11 & 2097152) != 0 ? null : str22, (i11 & 4194304) != 0 ? null : str23, (i11 & 8388608) != 0 ? null : str24, (i11 & 16777216) != 0 ? null : str25, (i11 & 33554432) != 0 ? null : str26, (i11 & 67108864) != 0 ? null : str27, (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : str28, (i11 & 268435456) != 0 ? null : str29, (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : str30, (i11 & 1073741824) != 0 ? null : str31, (i11 & Integer.MIN_VALUE) != 0 ? null : str32, (i12 & 1) != 0 ? null : str33, (i12 & 2) != 0 ? null : str34, (i12 & 4) != 0 ? null : str35, (i12 & 8) != 0 ? null : str36, (i12 & 16) != 0 ? null : str37, (i12 & 32) != 0 ? null : str38, (i12 & 64) != 0 ? null : str39, (i12 & 128) != 0 ? null : str40, (i12 & 256) != 0 ? null : str41, (i12 & 512) != 0 ? null : str42, (i12 & 1024) != 0 ? null : str43, (i12 & 2048) != 0 ? null : str44);
    }
}
