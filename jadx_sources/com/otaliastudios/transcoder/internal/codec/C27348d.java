package com.otaliastudios.transcoder.internal.codec;

import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.pipeline.AbstractC27357c;
import com.otaliastudios.transcoder.internal.pipeline.AbstractC27360f;
import da0.InterfaceC36655b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.codec.d */
/* JADX INFO: compiled from: DecoderTimer.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/codec/d;", "Lcom/otaliastudios/transcoder/internal/pipeline/c;", "Lcom/otaliastudios/transcoder/internal/codec/b;", "Lcom/otaliastudios/transcoder/internal/codec/a;", "Lcom/otaliastudios/transcoder/common/TrackType;", "track", "Lda0/b;", "interpolator", "<init>", "(Lcom/otaliastudios/transcoder/common/TrackType;Lda0/b;)V", "Lcom/otaliastudios/transcoder/internal/pipeline/f$b;", "state", "", "fresh", "Lcom/otaliastudios/transcoder/internal/pipeline/f;", "b", "(Lcom/otaliastudios/transcoder/internal/pipeline/f$b;Z)Lcom/otaliastudios/transcoder/internal/pipeline/f;", "c", "Lcom/otaliastudios/transcoder/common/TrackType;", "d", "Lda0/b;", "", "e", "Ljava/lang/Long;", "lastTimeUs", "f", "lastRawTimeUs", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C27348d extends AbstractC27357c<C27346b, InterfaceC27345a> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final TrackType track;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC36655b interpolator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Long lastTimeUs;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Long lastRawTimeUs;

    public C27348d(@NotNull TrackType track, @NotNull InterfaceC36655b interpolator) {
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        this.track = track;
        this.interpolator = interpolator;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    @NotNull
    /* JADX INFO: renamed from: b */
    public AbstractC27360f<C27346b> mo67997b(@NotNull AbstractC27360f.b<C27346b> state, boolean fresh) {
        double dLongValue;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof AbstractC27360f.a) {
            return state;
        }
        if (!(state.m68053a() instanceof C27349e)) {
            long timeUs = state.m68053a().getTimeUs();
            long jMo68019a = this.interpolator.mo68019a(this.track, timeUs);
            Long l11 = this.lastTimeUs;
            if (l11 == null) {
                dLongValue = 1.0d;
            } else {
                Intrinsics.checkNotNull(l11);
                long jLongValue = jMo68019a - l11.longValue();
                Long l12 = this.lastRawTimeUs;
                Intrinsics.checkNotNull(l12);
                dLongValue = jLongValue / (timeUs - l12.longValue());
            }
            double d11 = dLongValue;
            this.lastTimeUs = Long.valueOf(jMo68019a);
            this.lastRawTimeUs = Long.valueOf(timeUs);
            return new AbstractC27360f.b(new C27349e(state.m68053a().getBuffer(), timeUs, jMo68019a, d11, state.m68053a().m67991b()));
        }
        throw new IllegalArgumentException("Can't apply DecoderTimer twice.");
    }
}
