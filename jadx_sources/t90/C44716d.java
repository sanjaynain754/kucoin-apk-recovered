package t90;

import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.pipeline.AbstractC27357c;
import com.otaliastudios.transcoder.internal.pipeline.AbstractC27360f;
import da0.InterfaceC36655b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: t90.d */
/* JADX INFO: compiled from: ReaderTimer.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lt90/d;", "Lcom/otaliastudios/transcoder/internal/pipeline/c;", "Lt90/c;", "Lt90/b;", "Lcom/otaliastudios/transcoder/common/TrackType;", "track", "Lda0/b;", "interpolator", "<init>", "(Lcom/otaliastudios/transcoder/common/TrackType;Lda0/b;)V", "Lcom/otaliastudios/transcoder/internal/pipeline/f$b;", "state", "", "fresh", "Lcom/otaliastudios/transcoder/internal/pipeline/f;", "b", "(Lcom/otaliastudios/transcoder/internal/pipeline/f$b;Z)Lcom/otaliastudios/transcoder/internal/pipeline/f;", "c", "Lcom/otaliastudios/transcoder/common/TrackType;", "d", "Lda0/b;", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C44716d extends AbstractC27357c<ReaderData, InterfaceC44714b> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final TrackType track;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC36655b interpolator;

    public C44716d(@NotNull TrackType track, @NotNull InterfaceC36655b interpolator) {
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        this.track = track;
        this.interpolator = interpolator;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    @NotNull
    /* JADX INFO: renamed from: b */
    public AbstractC27360f<ReaderData> mo67997b(@NotNull AbstractC27360f.b<ReaderData> state, boolean fresh) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof AbstractC27360f.a) {
            return state;
        }
        state.m68053a().m98942c().f632c = this.interpolator.mo68019a(this.track, state.m68053a().m98942c().f632c);
        return state;
    }
}
