package com.otaliastudios.transcoder.internal.codec;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.LongRange;
import w90.C45770i;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.codec.c */
/* JADX INFO: compiled from: DecoderDropper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010#¨\u0006'"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/codec/c;", "", "", "continuous", "<init>", "(Z)V", "", "timeUs", "render", "", "c", "(JZ)V", "d", "(J)Ljava/lang/Long;", "", "message", "important", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Z)V", "Z", "Lw90/i;", "b", "Lw90/i;", "log", "", "Lkotlin/ranges/LongRange;", "Ljava/util/Map;", "closedDeltas", "", "Ljava/util/List;", "closedRanges", "e", "Lkotlin/ranges/LongRange;", "pendingRange", "f", "Ljava/lang/Long;", "firstInputUs", "g", "firstOutputUs", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C27347c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean continuous;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C45770i log = new C45770i("DecoderDropper");

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Map<LongRange, Long> closedDeltas = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<LongRange> closedRanges = new ArrayList();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public LongRange pendingRange;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Long firstInputUs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Long firstOutputUs;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m67993b(C27347c c27347c, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        c27347c.m67994a(str, z11);
    }

    /* JADX INFO: renamed from: c */
    public final void m67995c(long timeUs, boolean render) {
        long last;
        if (this.firstInputUs == null) {
            this.firstInputUs = Long.valueOf(timeUs);
        }
        if (render) {
            m67993b(this, Intrinsics.stringPlus("INPUT: inputUs=", Long.valueOf(timeUs)), false, 2, null);
            if (this.pendingRange == null) {
                this.pendingRange = new LongRange(timeUs, Long.MAX_VALUE);
                return;
            }
            LongRange longRange = this.pendingRange;
            Intrinsics.checkNotNull(longRange);
            this.pendingRange = new LongRange(longRange.getFirst(), timeUs);
            return;
        }
        m67993b(this, Intrinsics.stringPlus("INPUT: Got SKIPPING input! inputUs=", Long.valueOf(timeUs)), false, 2, null);
        LongRange longRange2 = this.pendingRange;
        if (longRange2 != null) {
            Intrinsics.checkNotNull(longRange2);
            if (longRange2.getLast() != Long.MAX_VALUE) {
                List<LongRange> list = this.closedRanges;
                LongRange longRange3 = this.pendingRange;
                Intrinsics.checkNotNull(longRange3);
                list.add(longRange3);
                Map<LongRange, Long> map = this.closedDeltas;
                LongRange longRange4 = this.pendingRange;
                Intrinsics.checkNotNull(longRange4);
                if (this.closedRanges.size() >= 2) {
                    LongRange longRange5 = this.pendingRange;
                    Intrinsics.checkNotNull(longRange5);
                    long first = longRange5.getFirst();
                    List<LongRange> list2 = this.closedRanges;
                    last = first - list2.get(CollectionsKt.getLastIndex(list2) - 1).getLast();
                } else {
                    last = 0;
                }
                map.put(longRange4, Long.valueOf(last));
            }
        }
        this.pendingRange = null;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Long m67996d(long timeUs) {
        if (this.firstOutputUs == null) {
            this.firstOutputUs = Long.valueOf(timeUs);
        }
        Long l11 = this.firstInputUs;
        Intrinsics.checkNotNull(l11);
        long jLongValue = l11.longValue();
        Long l12 = this.firstOutputUs;
        Intrinsics.checkNotNull(l12);
        long jLongValue2 = jLongValue + (timeUs - l12.longValue());
        long first = 0;
        for (LongRange longRange : this.closedRanges) {
            Long l13 = this.closedDeltas.get(longRange);
            Intrinsics.checkNotNull(l13);
            first += l13.longValue();
            if (longRange.contains(jLongValue2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("OUTPUT: Rendering! outputTimeUs=");
                sb2.append(timeUs);
                sb2.append(" newOutputTimeUs=");
                long j11 = timeUs - first;
                sb2.append(j11);
                sb2.append(" deltaUs=");
                sb2.append(first);
                m67993b(this, sb2.toString(), false, 2, null);
                return this.continuous ? Long.valueOf(j11) : Long.valueOf(timeUs);
            }
        }
        LongRange longRange2 = this.pendingRange;
        if (longRange2 != null) {
            Intrinsics.checkNotNull(longRange2);
            if (longRange2.contains(jLongValue2)) {
                if (!this.closedRanges.isEmpty()) {
                    LongRange longRange3 = this.pendingRange;
                    Intrinsics.checkNotNull(longRange3);
                    first += longRange3.getFirst() - ((LongRange) CollectionsKt.last((List) this.closedRanges)).getLast();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("OUTPUT: Rendering! outputTimeUs=");
                sb3.append(timeUs);
                sb3.append(" newOutputTimeUs=");
                long j12 = timeUs - first;
                sb3.append(j12);
                sb3.append(" deltaUs=");
                sb3.append(first);
                m67993b(this, sb3.toString(), false, 2, null);
                return this.continuous ? Long.valueOf(j12) : Long.valueOf(timeUs);
            }
        }
        m67994a(Intrinsics.stringPlus("OUTPUT: SKIPPING! outputTimeUs=", Long.valueOf(timeUs)), true);
        return null;
    }

    public C27347c(boolean z11) {
        this.continuous = z11;
    }

    /* JADX INFO: renamed from: a */
    public final void m67994a(String message, boolean important) {
    }
}
