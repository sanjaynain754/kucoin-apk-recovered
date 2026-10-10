package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes56.dex */
public final class UnionVector extends BaseVector {
    public UnionVector __assign(int i11, int i12, ByteBuffer byteBuffer) {
        __reset(i11, i12, byteBuffer);
        return this;
    }

    public Table get(Table table, int i11) {
        return Table.__union(table, __element(i11), this.f12708bb);
    }
}
