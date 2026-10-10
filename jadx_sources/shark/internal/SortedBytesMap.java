package shark.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.ranges.RangesKt;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;
import shark.internal.hppc.C44482f;
import shark.internal.hppc.LongObjectPair;

/* JADX INFO: compiled from: SortedBytesMap.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00150\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u0010R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010(¨\u0006)"}, m90084d2 = {"Lshark/internal/SortedBytesMap;", "", "", "longIdentifiers", "", "bytesPerValue", "", "sortedEntries", "<init>", "(ZI[B)V", "", "key", "Lshark/internal/b;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(J)Lshark/internal/b;", "k", "(J)I", "keyIndex", "i", "(I)Lshark/internal/b;", "Lkotlin/sequences/Sequence;", "Lshark/internal/hppc/d;", "g", "()Lkotlin/sequences/Sequence;", "index", CmcdData.Factory.STREAM_TYPE_LIVE, "(I)J", "f", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "bytesPerKey", "b", "bytesPerEntry", "c", "j", "()I", "size", "d", "Z", "e", "[B", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class SortedBytesMap {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int bytesPerKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int bytesPerEntry;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int size;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean longIdentifiers;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int bytesPerValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final byte[] sortedEntries;

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Sequence<LongObjectPair<C44469b>> m98295g() {
        return SequencesKt.map(CollectionsKt.asSequence(RangesKt.until(0, this.size)), new Function1<Integer, LongObjectPair<? extends C44469b>>() { // from class: shark.internal.SortedBytesMap$entrySequence$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ LongObjectPair<? extends C44469b> invoke(Integer num) {
                return invoke(num.intValue());
            }

            {
                super(1);
            }

            @NotNull
            public final LongObjectPair<C44469b> invoke(int i11) {
                return C44482f.m98401c(this.this$0.m98300l(i11), new C44469b(this.this$0.sortedEntries, (this.this$0.bytesPerEntry * i11) + this.this$0.bytesPerKey, this.this$0.bytesPerValue, this.this$0.longIdentifiers));
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final int m98294f(long key) {
        int i11 = this.size - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long jM98300l = m98300l(i13);
            if (jM98300l < key) {
                i12 = i13 + 1;
            } else {
                if (jM98300l <= key) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final C44469b m98297i(int keyIndex) {
        return new C44469b(this.sortedEntries, (keyIndex * this.bytesPerEntry) + this.bytesPerKey, this.bytesPerValue, this.longIdentifiers);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: l */
    public final long m98300l(int index) {
        int i11 = index * this.bytesPerEntry;
        return this.longIdentifiers ? C44470c.m98328b(this.sortedEntries, i11) : C44470c.m98327a(this.sortedEntries, i11);
    }

    public SortedBytesMap(boolean z11, int i11, @NotNull byte[] bArr) {
        int i12;
        this.longIdentifiers = z11;
        this.bytesPerValue = i11;
        this.sortedEntries = bArr;
        if (z11) {
            i12 = 8;
        } else {
            i12 = 4;
        }
        this.bytesPerKey = i12;
        int i13 = i12 + i11;
        this.bytesPerEntry = i13;
        this.size = bArr.length / i13;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final C44469b m98296h(long key) {
        int iM98294f = m98294f(key);
        if (iM98294f < 0) {
            return null;
        }
        return m98297i(iM98294f);
    }

    /* JADX INFO: renamed from: k */
    public final int m98299k(long key) {
        return m98294f(key);
    }
}
