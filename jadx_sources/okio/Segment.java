package okio;

import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Segment.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000J\u0006\u0010\u0013\u001a\u00020\u0000J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0000J\u0016\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lokio/Segment;", "", "()V", "data", "", "pos", "", TUIConstants.TUIContact.LIMIT, "shared", "", TUIConstants.TUIChat.OWNER, "([BIIZZ)V", "next", "prev", "compact", "", "pop", "push", "segment", "sharedCopy", "split", "byteCount", "unsharedCopy", "writeTo", "sink", "Companion", "okio"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSegment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Segment.kt\nokio/Segment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
public final class Segment {
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;

    @JvmField
    @NotNull
    public final byte[] data;

    @JvmField
    public int limit;

    @JvmField
    @Nullable
    public Segment next;

    @JvmField
    public boolean owner;

    @JvmField
    public int pos;

    @JvmField
    @Nullable
    public Segment prev;

    @JvmField
    public boolean shared;

    public Segment() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    @NotNull
    public final Segment sharedCopy() {
        this.shared = true;
        return new Segment(this.data, this.pos, this.limit, true, false);
    }

    public final void compact() {
        int i11;
        Segment segment = this.prev;
        if (segment == this) {
            throw new IllegalStateException("cannot compact");
        }
        Intrinsics.checkNotNull(segment);
        if (segment.owner) {
            int i12 = this.limit - this.pos;
            Segment segment2 = this.prev;
            Intrinsics.checkNotNull(segment2);
            int i13 = 8192 - segment2.limit;
            Segment segment3 = this.prev;
            Intrinsics.checkNotNull(segment3);
            if (segment3.shared) {
                i11 = 0;
            } else {
                Segment segment4 = this.prev;
                Intrinsics.checkNotNull(segment4);
                i11 = segment4.pos;
            }
            if (i12 > i13 + i11) {
                return;
            }
            Segment segment5 = this.prev;
            Intrinsics.checkNotNull(segment5);
            writeTo(segment5, i12);
            pop();
            SegmentPool.recycle(this);
        }
    }

    @Nullable
    public final Segment pop() {
        Segment segment = this.next;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.prev;
        Intrinsics.checkNotNull(segment2);
        segment2.next = this.next;
        Segment segment3 = this.next;
        Intrinsics.checkNotNull(segment3);
        segment3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return segment;
    }

    @NotNull
    public final Segment split(int byteCount) {
        Segment segmentTake;
        if (byteCount <= 0 || byteCount > this.limit - this.pos) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (byteCount >= 1024) {
            segmentTake = sharedCopy();
        } else {
            segmentTake = SegmentPool.take();
            byte[] bArr = this.data;
            byte[] bArr2 = segmentTake.data;
            int i11 = this.pos;
            ArraysKt.copyInto$default(bArr, bArr2, 0, i11, i11 + byteCount, 2, (Object) null);
        }
        segmentTake.limit = segmentTake.pos + byteCount;
        this.pos += byteCount;
        Segment segment = this.prev;
        Intrinsics.checkNotNull(segment);
        segment.push(segmentTake);
        return segmentTake;
    }

    @NotNull
    public final Segment unsharedCopy() {
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        return new Segment(bArrCopyOf, this.pos, this.limit, false, true);
    }

    @NotNull
    public final Segment push(@NotNull Segment segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        Segment segment2 = this.next;
        Intrinsics.checkNotNull(segment2);
        segment2.prev = segment;
        this.next = segment;
        return segment;
    }

    public final void writeTo(@NotNull Segment sink, int byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (sink.owner) {
            int i11 = sink.limit;
            if (i11 + byteCount > 8192) {
                if (!sink.shared) {
                    int i12 = sink.pos;
                    if ((i11 + byteCount) - i12 <= 8192) {
                        byte[] bArr = sink.data;
                        ArraysKt.copyInto$default(bArr, bArr, 0, i12, i11, 2, (Object) null);
                        sink.limit -= sink.pos;
                        sink.pos = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.data;
            byte[] bArr3 = sink.data;
            int i13 = sink.limit;
            int i14 = this.pos;
            ArraysKt.copyInto(bArr2, bArr3, i13, i14, i14 + byteCount);
            sink.limit += byteCount;
            this.pos += byteCount;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }

    public Segment(@NotNull byte[] data, int i11, int i12, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.pos = i11;
        this.limit = i12;
        this.shared = z11;
        this.owner = z12;
    }
}
