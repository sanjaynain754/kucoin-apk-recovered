package p852kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.UInt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: UIntRange.kt */
/* JADX INFO: loaded from: classes61.dex */
@SinceKotlin(version = "1.3")
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000b\u001a\u00020\fH\u0096\u0002J\u0010\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0010\u0010\t\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\r\u001a\u00020\u0002X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0010"}, m90084d2 = {"Lkotlin/ranges/UIntProgressionIterator;", "", "Lkotlin/UInt;", "first", "last", "step", "", "<init>", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "finalElement", "I", "hasNext", "", "next", "next-pVg5ArA", "()I", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
final class UIntProgressionIterator implements Iterator<UInt>, KMappedMarker {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    public /* synthetic */ UIntProgressionIterator(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, i13);
    }

    private UIntProgressionIterator(int i11, int i12, int i13) {
        this.finalElement = i12;
        boolean z11 = false;
        int iCompare = Integer.compare(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE);
        if (i13 <= 0 ? iCompare >= 0 : iCompare <= 0) {
            z11 = true;
        }
        this.hasNext = z11;
        this.step = UInt.m103939constructorimpl(i13);
        this.next = this.hasNext ? i11 : i12;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    /* JADX INFO: renamed from: next-pVg5ArA, reason: not valid java name */
    public int m105069nextpVg5ArA() {
        int i11 = this.next;
        if (i11 != this.finalElement) {
            this.next = UInt.m103939constructorimpl(this.step + i11);
            return i11;
        }
        if (!this.hasNext) {
            throw new NoSuchElementException();
        }
        this.hasNext = false;
        return i11;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ UInt next() {
        return UInt.m103933boximpl(m105069nextpVg5ArA());
    }
}
