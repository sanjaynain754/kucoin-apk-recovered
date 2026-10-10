package p852kotlin.ranges;

import java.util.NoSuchElementException;
import p852kotlin.Metadata;
import p852kotlin.collections.CharIterator;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\rH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lkotlin/ranges/CharProgressionIterator;", "Lkotlin/collections/CharIterator;", "first", "", "last", "step", "", "<init>", "(CCI)V", "getStep", "()I", "finalElement", "hasNext", "", "next", "nextChar", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CharProgressionIterator extends CharIterator {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    public final int getStep() {
        return this.step;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // p852kotlin.collections.CharIterator
    public char nextChar() {
        int i11 = this.next;
        if (i11 != this.finalElement) {
            this.next = this.step + i11;
        } else {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        }
        return (char) i11;
    }

    public CharProgressionIterator(char c11, char c12, int i11) {
        this.step = i11;
        this.finalElement = c12;
        boolean z11 = false;
        if (i11 <= 0 ? Intrinsics.compare((int) c11, (int) c12) >= 0 : Intrinsics.compare((int) c11, (int) c12) <= 0) {
            z11 = true;
        }
        this.hasNext = z11;
        this.next = z11 ? c11 : c12;
    }
}
