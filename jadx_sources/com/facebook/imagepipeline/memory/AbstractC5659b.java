package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import p008a6.C0148h0;
import p008a6.InterfaceC0164x;
import p712w3.C45708h;
import p819z3.InterfaceC46675d;

/* JADX INFO: renamed from: com.facebook.imagepipeline.memory.b */
/* JADX INFO: compiled from: MemoryChunkPool.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC5659b extends BasePool<InterfaceC0164x> {

    /* JADX INFO: renamed from: k */
    public final int[] f9170k;

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC0164x mo699g(int i11);

    /* JADX INFO: renamed from: D */
    public int m9498D() {
        return this.f9170k[0];
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: n */
    public int mo701n(int i11) {
        if (i11 <= 0) {
            throw new BasePool.InvalidSizeException(Integer.valueOf(i11));
        }
        for (int i12 : this.f9170k) {
            if (i12 >= i11) {
                return i12;
            }
        }
        return i11;
    }

    public AbstractC5659b(InterfaceC46675d interfaceC46675d, C0148h0 c0148h0, PoolStatsTracker poolStatsTracker) {
        super(interfaceC46675d, c0148h0, poolStatsTracker);
        SparseIntArray sparseIntArray = (SparseIntArray) C45708h.m100896g(c0148h0.f516c);
        this.f9170k = new int[sparseIntArray.size()];
        int i11 = 0;
        while (true) {
            int[] iArr = this.f9170k;
            if (i11 < iArr.length) {
                iArr[i11] = sparseIntArray.keyAt(i11);
                i11++;
            } else {
                m9474s();
                return;
            }
        }
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo700k(InterfaceC0164x interfaceC0164x) {
        C45708h.m100896g(interfaceC0164x);
        interfaceC0164x.close();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int mo702o(InterfaceC0164x interfaceC0164x) {
        C45708h.m100896g(interfaceC0164x);
        return interfaceC0164x.getSize();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public boolean mo705u(InterfaceC0164x interfaceC0164x) {
        C45708h.m100896g(interfaceC0164x);
        return !interfaceC0164x.isClosed();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: p */
    public int mo703p(int i11) {
        return i11;
    }
}
