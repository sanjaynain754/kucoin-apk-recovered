package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p008a6.C0148h0;
import p819z3.InterfaceC46672a;
import p819z3.InterfaceC46675d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.memory.a */
/* JADX INFO: compiled from: GenericByteArrayPool.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0017\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m90084d2 = {"Lcom/facebook/imagepipeline/memory/a;", "Lcom/facebook/imagepipeline/memory/BasePool;", "", "Lz3/a;", "Lz3/d;", "memoryTrimmableRegistry", "La6/h0;", "poolParams", "Lcom/facebook/imagepipeline/memory/PoolStatsTracker;", "poolStatsTracker", "<init>", "(Lz3/d;La6/h0;Lcom/facebook/imagepipeline/memory/PoolStatsTracker;)V", "", "bucketedSize", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(I)[B", "value", "", "B", "([B)V", "p", "(I)I", "requestSize", "n", "C", "([B)I", "", "k", "[I", "bucketSizes", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class C5658a extends BasePool<byte[]> implements InterfaceC46672a {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final int[] bucketSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5658a(@NotNull InterfaceC46675d memoryTrimmableRegistry, @NotNull C0148h0 poolParams, @NotNull PoolStatsTracker poolStatsTracker) {
        super(memoryTrimmableRegistry, poolParams, poolStatsTracker);
        Intrinsics.checkNotNullParameter(memoryTrimmableRegistry, "memoryTrimmableRegistry");
        Intrinsics.checkNotNullParameter(poolParams, "poolParams");
        Intrinsics.checkNotNullParameter(poolStatsTracker, "poolStatsTracker");
        SparseIntArray sparseIntArray = poolParams.f516c;
        if (sparseIntArray != null) {
            this.bucketSizes = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.bucketSizes[i11] = sparseIntArray.keyAt(i11);
            }
        } else {
            this.bucketSizes = new int[0];
        }
        m9474s();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public byte[] mo699g(int bucketedSize) {
        return new byte[bucketedSize];
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: n */
    public int mo701n(int requestSize) {
        if (requestSize <= 0) {
            throw new BasePool.InvalidSizeException(Integer.valueOf(requestSize));
        }
        for (int i11 : this.bucketSizes) {
            if (i11 >= requestSize) {
                return i11;
            }
        }
        return requestSize;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo700k(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int mo702o(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.length;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: p */
    public int mo703p(int bucketedSize) {
        return bucketedSize;
    }
}
