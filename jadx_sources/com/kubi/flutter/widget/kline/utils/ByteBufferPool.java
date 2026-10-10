package com.kubi.flutter.widget.kline.utils;

import androidx.core.util.Pools;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ByteBufferPool.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/utils/ByteBufferPool;", "", "<init>", "()V", "bigPools", "Landroidx/core/util/Pools$SynchronizedPool;", "Ljava/nio/ByteBuffer;", "smallPools", "allocateDirect", "size", "", "release", "", "buffer", "Companion", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ByteBufferPool {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f22482c = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Pools.SynchronizedPool<ByteBuffer> f22483a = new Pools.SynchronizedPool<>(8);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Pools.SynchronizedPool<ByteBuffer> f22484b = new Pools.SynchronizedPool<>(64);

    /* JADX INFO: compiled from: ByteBufferPool.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/utils/ByteBufferPool$Companion;", "", "<init>", "()V", "SMALL_MAX_SIZE", "", "BIG_MAX_SIZE", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ByteBuffer m24374a(int i11) {
        if (i11 <= 1024) {
            ByteBuffer byteBufferAcquire = this.f22484b.acquire();
            if (byteBufferAcquire == null) {
                byteBufferAcquire = ByteBuffer.allocateDirect(1024);
            }
            Intrinsics.checkNotNull(byteBufferAcquire);
            return byteBufferAcquire;
        }
        if (i11 > 131072) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i11);
            Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
            return byteBufferAllocate;
        }
        ByteBuffer byteBufferAcquire2 = this.f22483a.acquire();
        if (byteBufferAcquire2 == null) {
            byteBufferAcquire2 = ByteBuffer.allocateDirect(131072);
        }
        Intrinsics.checkNotNull(byteBufferAcquire2);
        return byteBufferAcquire2;
    }

    /* JADX INFO: renamed from: b */
    public final void m24375b(@NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.clear();
        int iCapacity = buffer.capacity();
        if (iCapacity == 1024) {
            this.f22484b.release(buffer);
        } else {
            if (iCapacity != 131072) {
                return;
            }
            this.f22483a.release(buffer);
        }
    }
}
