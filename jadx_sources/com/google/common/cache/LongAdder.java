package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
final class LongAdder extends Striped64 implements Serializable, LongAddable {
    private static final long serialVersionUID = 7249069246863182397L;

    @Override // com.google.common.cache.Striped64
    /* JADX INFO: renamed from: fn */
    public final long mo13390fn(long j11, long j12) {
        return j11 + j12;
    }

    @Override // com.google.common.cache.LongAddable
    public void add(long j11) {
        int length;
        Striped64.Cell cell;
        Striped64.Cell[] cellArr = this.cells;
        if (cellArr == null) {
            long j12 = this.base;
            if (casBase(j12, j12 + j11)) {
                return;
            }
        }
        int[] iArr = Striped64.threadHashCode.get();
        boolean zCas = true;
        if (iArr != null && cellArr != null && (length = cellArr.length) >= 1 && (cell = cellArr[(length - 1) & iArr[0]]) != null) {
            long j13 = cell.value;
            zCas = cell.cas(j13, j13 + j11);
            if (zCas) {
                return;
            }
        }
        retryUpdate(j11, iArr, zCas);
    }

    public void decrement() {
        add(-1L);
    }

    @Override // com.google.common.cache.LongAddable
    public void increment() {
        add(1L);
    }

    public void reset() {
        internalReset(0L);
    }

    @Override // com.google.common.cache.LongAddable
    public long sum() {
        long j11 = this.base;
        Striped64.Cell[] cellArr = this.cells;
        if (cellArr != null) {
            for (Striped64.Cell cell : cellArr) {
                if (cell != null) {
                    j11 += cell.value;
                }
            }
        }
        return j11;
    }

    public long sumThenReset() {
        long j11 = this.base;
        Striped64.Cell[] cellArr = this.cells;
        this.base = 0L;
        if (cellArr != null) {
            for (Striped64.Cell cell : cellArr) {
                if (cell != null) {
                    j11 += cell.value;
                    cell.value = 0L;
                }
            }
        }
        return j11;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.busy = 0;
        this.cells = null;
        this.base = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(sum());
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return sum();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return sum();
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) sum();
    }

    @Override // java.lang.Number
    public long longValue() {
        return sum();
    }

    public String toString() {
        return Long.toString(sum());
    }
}
