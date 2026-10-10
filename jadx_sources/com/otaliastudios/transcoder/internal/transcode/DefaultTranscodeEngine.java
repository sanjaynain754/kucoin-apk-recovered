package com.otaliastudios.transcoder.internal.transcode;

import aa0.InterfaceC0214b;
import android.media.MediaFormat;
import androidx.media3.exoplayer.upstream.CmcdData;
import ba0.InterfaceC4528e;
import ca0.InterfaceC4920a;
import com.otaliastudios.transcoder.common.TrackStatus;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.C27335a;
import com.otaliastudios.transcoder.internal.C27339b;
import com.otaliastudios.transcoder.internal.C27340c;
import com.otaliastudios.transcoder.internal.C27351d;
import com.otaliastudios.transcoder.internal.C27352e;
import com.otaliastudios.transcoder.internal.Codecs;
import com.otaliastudios.transcoder.internal.pipeline.Pipeline;
import com.otaliastudios.transcoder.internal.pipeline.PipelinesKt;
import da0.InterfaceC36655b;
import ea0.InterfaceC37126b;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.sequences.SequencesKt;
import w90.C45768g;
import w90.C45770i;
import w90.InterfaceC45773l;
import x90.InterfaceC46104a;
import z90.InterfaceC46735a;

/* JADX INFO: compiled from: DefaultTranscodeEngine.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 G2\u00020\u0001:\u0001HBM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010(\u001a\u00020'2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00100R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00101R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00102R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006I"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;", "Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine;", "Lcom/otaliastudios/transcoder/internal/a;", "dataSources", "Lz90/a;", "dataSink", "Lw90/l;", "Lba0/e;", "strategies", "Lea0/b;", "validator", "", "videoRotation", "Lca0/a;", "audioStretcher", "Lx90/a;", "audioResampler", "Lda0/b;", "interpolator", "<init>", "(Lcom/otaliastudios/transcoder/internal/a;Lz90/a;Lw90/l;Lea0/b;ILca0/a;Lx90/a;Lda0/b;)V", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Z", "Lkotlin/Function1;", "", "", "progress", "g", "(Lkotlin/jvm/functions/Function1;)V", "b", "()V", "Lcom/otaliastudios/transcoder/common/TrackType;", "type", "index", "Lcom/otaliastudios/transcoder/common/TrackStatus;", "status", "Landroid/media/MediaFormat;", "outputFormat", "Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;", "f", "(Lcom/otaliastudios/transcoder/common/TrackType;ILcom/otaliastudios/transcoder/common/TrackStatus;Landroid/media/MediaFormat;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;", "c", "Lcom/otaliastudios/transcoder/internal/a;", "d", "Lz90/a;", "e", "Lea0/b;", "I", "Lca0/a;", "Lx90/a;", "Lw90/i;", "i", "Lw90/i;", "log", "Lcom/otaliastudios/transcoder/internal/e;", "j", "Lcom/otaliastudios/transcoder/internal/e;", "tracks", "Lcom/otaliastudios/transcoder/internal/c;", "k", "Lcom/otaliastudios/transcoder/internal/c;", "segments", "Lcom/otaliastudios/transcoder/internal/d;", CmcdData.Factory.STREAM_TYPE_LIVE, "Lcom/otaliastudios/transcoder/internal/d;", "timer", "Lcom/otaliastudios/transcoder/internal/Codecs;", "m", "Lcom/otaliastudios/transcoder/internal/Codecs;", "codecs", "n", "Companion", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class DefaultTranscodeEngine extends TranscodeEngine {

    /* JADX INFO: renamed from: o */
    public static final long f55767o = 10;

    /* JADX INFO: renamed from: p */
    public static final long f55768p = 10;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C27335a dataSources;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC46735a dataSink;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC37126b validator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int videoRotation;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4920a audioStretcher;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC46104a audioResampler;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final C45770i log;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final C27352e tracks;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C27340c segments;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final C27351d timer;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Codecs codecs;

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.transcode.DefaultTranscodeEngine$a */
    /* JADX INFO: compiled from: DefaultTranscodeEngine.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 5, 1}, m90088xi = 48)
    public /* synthetic */ class C27363a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrackStatus.values().length];
            iArr[TrackStatus.ABSENT.ordinal()] = 1;
            iArr[TrackStatus.REMOVING.ordinal()] = 2;
            iArr[TrackStatus.PASS_THROUGH.ordinal()] = 3;
            iArr[TrackStatus.COMPRESSING.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DefaultTranscodeEngine(@NotNull C27335a dataSources, @NotNull InterfaceC46735a dataSink, @NotNull InterfaceC45773l<InterfaceC4528e> strategies, @NotNull InterfaceC37126b validator, int i11, @NotNull InterfaceC4920a audioStretcher, @NotNull InterfaceC46104a audioResampler, @NotNull InterfaceC36655b interpolator) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        Intrinsics.checkNotNullParameter(dataSink, "dataSink");
        Intrinsics.checkNotNullParameter(strategies, "strategies");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(audioStretcher, "audioStretcher");
        Intrinsics.checkNotNullParameter(audioResampler, "audioResampler");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        this.dataSources = dataSources;
        this.dataSink = dataSink;
        this.validator = validator;
        this.videoRotation = i11;
        this.audioStretcher = audioStretcher;
        this.audioResampler = audioResampler;
        C45770i c45770i = new C45770i("TranscodeEngine");
        this.log = c45770i;
        C27352e c27352e = new C27352e(strategies, dataSources, i11, false);
        this.tracks = c27352e;
        C27340c c27340c = new C27340c(dataSources, c27352e, new DefaultTranscodeEngine$segments$1(this));
        this.segments = c27340c;
        this.timer = new C27351d(interpolator, dataSources, c27352e, c27340c.m67952b());
        this.codecs = new Codecs(dataSources, c27352e, c27340c.m67952b());
        c45770i.m101066c("Created Tracks, Segments, Timer...");
        dataSink.mo101057c(0);
        double[] dArr = (double[]) SequencesKt.firstOrNull(SequencesKt.mapNotNull(CollectionsKt.asSequence(dataSources.m67899a()), new Function1<InterfaceC0214b, double[]>() { // from class: com.otaliastudios.transcoder.internal.transcode.DefaultTranscodeEngine$location$1
            @Override // p852kotlin.jvm.functions.Function1
            @Nullable
            public final double[] invoke(@NotNull InterfaceC0214b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getLocation();
            }
        }));
        if (dArr != null) {
            dataSink.mo101056b(dArr[0], dArr[1]);
        }
        dataSink.mo101058d(TrackType.VIDEO, c27352e.m68035b().mo67880o());
        dataSink.mo101058d(TrackType.AUDIO, c27352e.m68035b().mo67881p());
        c45770i.m101066c("Set up the DataSink...");
    }

    @Override // com.otaliastudios.transcoder.internal.transcode.TranscodeEngine
    /* JADX INFO: renamed from: b */
    public void mo68061b() {
        try {
            Result.Companion companion = Result.INSTANCE;
            this.segments.m67956f();
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        try {
            this.dataSink.release();
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th3));
        }
        try {
            this.dataSources.release();
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th4) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th4));
        }
        try {
            this.codecs.m67869g();
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th5) {
            Result.Companion companion5 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th5));
        }
    }

    /* JADX INFO: renamed from: f */
    public final Pipeline m68062f(final TrackType type, final int index, TrackStatus status, MediaFormat outputFormat) {
        this.log.m101072j("createPipeline(" + type + ", " + index + ", " + status + "), format=" + outputFormat);
        InterfaceC36655b interfaceC36655bM68011m = this.timer.m68011m(type, index);
        final List<InterfaceC0214b> listMo67873M = this.dataSources.mo67873M(type);
        InterfaceC0214b interfaceC0214bM101060a = C45768g.m101060a(listMo67873M.get(index), new Function0<Boolean>() { // from class: com.otaliastudios.transcoder.internal.transcode.DefaultTranscodeEngine$createPipeline$source$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.timer.m68008j().mo67873M(type).longValue() > this.this$0.timer.m68010l() + 100);
            }
        });
        InterfaceC46735a interfaceC46735aM101061b = C45768g.m101061b(this.dataSink, new Function0<Boolean>() { // from class: com.otaliastudios.transcoder.internal.transcode.DefaultTranscodeEngine$createPipeline$sink$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(index < CollectionsKt.getLastIndex(listMo67873M));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }
        });
        int i11 = C27363a.$EnumSwitchMapping$0[status.ordinal()];
        if (i11 == 1) {
            return PipelinesKt.m68046b();
        }
        if (i11 == 2) {
            return PipelinesKt.m68046b();
        }
        if (i11 == 3) {
            return PipelinesKt.m68047c(type, interfaceC0214bM101060a, interfaceC46735aM101061b, interfaceC36655bM68011m);
        }
        if (i11 == 4) {
            return PipelinesKt.m68048d(type, interfaceC0214bM101060a, interfaceC46735aM101061b, interfaceC36655bM68011m, outputFormat, this.codecs, this.videoRotation, this.audioStretcher, this.audioResampler);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: h */
    public boolean m68064h() {
        if (this.validator.mo83041a(this.tracks.m68035b().mo67880o(), this.tracks.m68035b().mo67881p())) {
            return true;
        }
        this.log.m101066c("Validator has decided that the input is fine and transcoding is not necessary.");
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void m68063g(@NotNull Function1<? super Double, Unit> progress) throws InterruptedException {
        boolean zM67946a;
        boolean zM67946a2;
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.log.m101066c("transcode(): about to start, durationUs=" + this.timer.m68010l() + ", audioUs=" + this.timer.m68007i().mo67872J() + ", videoUs=" + this.timer.m68007i().mo67882q());
        long j11 = 0L;
        while (true) {
            C27339b c27339bM67955e = this.segments.m67955e(TrackType.AUDIO);
            C27339b c27339bM67955e2 = this.segments.m67955e(TrackType.VIDEO);
            boolean z11 = false;
            if (c27339bM67955e == null) {
                zM67946a = false;
            } else {
                zM67946a = c27339bM67955e.m67946a();
            }
            if (c27339bM67955e2 == null) {
                zM67946a2 = false;
            } else {
                zM67946a2 = c27339bM67955e2.m67946a();
            }
            boolean z12 = zM67946a | zM67946a2;
            if (!z12 && !this.segments.m67953c()) {
                z11 = true;
            }
            this.log.m101070h("transcode(): executed step=" + j11 + " advanced=" + z12 + " completed=" + z11);
            if (!Thread.interrupted()) {
                if (z11) {
                    progress.invoke(Double.valueOf(1.0d));
                    this.dataSink.stop();
                    return;
                }
                if (!z12) {
                    Thread.sleep(f55767o);
                }
                j11++;
                if (j11 % f55768p == 0) {
                    double dDoubleValue = this.timer.m68009k().mo67881p().doubleValue();
                    double dDoubleValue2 = this.timer.m68009k().mo67880o().doubleValue();
                    this.log.m101070h("transcode(): got progress, video=" + dDoubleValue2 + " audio=" + dDoubleValue);
                    progress.invoke(Double.valueOf((dDoubleValue2 + dDoubleValue) / ((double) this.tracks.m68034a().getSize())));
                }
            } else {
                throw new InterruptedException();
            }
        }
    }
}
