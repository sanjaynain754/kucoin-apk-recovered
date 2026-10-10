package com.otaliastudios.transcoder.internal.pipeline;

import aa0.InterfaceC0214b;
import android.media.MediaFormat;
import androidx.media3.exoplayer.upstream.CmcdData;
import ca0.InterfaceC4920a;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.Codecs;
import com.otaliastudios.transcoder.internal.audio.AudioEngine;
import com.otaliastudios.transcoder.internal.codec.C27348d;
import com.otaliastudios.transcoder.internal.codec.Decoder;
import com.otaliastudios.transcoder.internal.codec.Encoder;
import com.otaliastudios.transcoder.internal.data.Bridge;
import com.otaliastudios.transcoder.internal.video.C27368d;
import com.otaliastudios.transcoder.internal.video.VideoRenderer;
import com.tencent.qcloud.tuicore.TUIConstants;
import da0.InterfaceC36655b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import t90.C44713a;
import t90.C44716d;
import t90.C44717e;
import x90.InterfaceC46104a;
import z90.InterfaceC46735a;

/* JADX INFO: compiled from: pipelines.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a/\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aW\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a?\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001aG\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;", "b", "()Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;", "Lcom/otaliastudios/transcoder/common/TrackType;", "track", "Laa0/b;", "source", "Lz90/a;", "sink", "Lda0/b;", "interpolator", "c", "(Lcom/otaliastudios/transcoder/common/TrackType;Laa0/b;Lz90/a;Lda0/b;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;", "Landroid/media/MediaFormat;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "Lcom/otaliastudios/transcoder/internal/Codecs;", "codecs", "", "videoRotation", "Lca0/a;", "audioStretcher", "Lx90/a;", "audioResampler", "d", "(Lcom/otaliastudios/transcoder/common/TrackType;Laa0/b;Lz90/a;Lda0/b;Landroid/media/MediaFormat;Lcom/otaliastudios/transcoder/internal/Codecs;ILca0/a;Lx90/a;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;", "e", "(Laa0/b;Lz90/a;Lda0/b;Landroid/media/MediaFormat;Lcom/otaliastudios/transcoder/internal/Codecs;I)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Laa0/b;Lz90/a;Lda0/b;Landroid/media/MediaFormat;Lcom/otaliastudios/transcoder/internal/Codecs;Lca0/a;Lx90/a;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;", "lib_release"}, m90085k = 2, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class PipelinesKt {

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.pipeline.PipelinesKt$a */
    /* JADX INFO: compiled from: pipelines.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 5, 1}, m90088xi = 48)
    public /* synthetic */ class C27354a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrackType.values().length];
            iArr[TrackType.VIDEO.ordinal()] = 1;
            iArr[TrackType.AUDIO.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Pipeline m68045a(final InterfaceC0214b interfaceC0214b, final InterfaceC46735a interfaceC46735a, final InterfaceC36655b interfaceC36655b, final MediaFormat mediaFormat, final Codecs codecs, final InterfaceC4920a interfaceC4920a, final InterfaceC46104a interfaceC46104a) {
        return Pipeline.INSTANCE.build$lib_release("Audio", new Function0<Pipeline.C27353a<?, InterfaceC27356b>>() { // from class: com.otaliastudios.transcoder.internal.pipeline.PipelinesKt$AudioPipeline$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Pipeline.C27353a<?, InterfaceC27356b> invoke() {
                InterfaceC0214b interfaceC0214b2 = interfaceC0214b;
                TrackType trackType = TrackType.AUDIO;
                C44713a c44713a = new C44713a(interfaceC0214b2, trackType);
                MediaFormat mediaFormatMo791d = interfaceC0214b.mo791d(trackType);
                Intrinsics.checkNotNull(mediaFormatMo791d);
                Intrinsics.checkNotNullExpressionValue(mediaFormatMo791d, "source.getTrackFormat(TrackType.AUDIO)!!");
                return C27358d.m68052a(c44713a, new Decoder(mediaFormatMo791d, true)).m68044b(new C27348d(trackType, interfaceC36655b)).m68044b(new AudioEngine(interfaceC4920a, interfaceC46104a, mediaFormat)).m68044b(new Encoder(codecs, trackType)).m68044b(new C44717e(interfaceC46735a, trackType));
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Pipeline m68046b() {
        return Pipeline.Companion.build$lib_release$default(Pipeline.INSTANCE, "Empty", null, 2, null);
    }

    /* JADX INFO: renamed from: e */
    public static final Pipeline m68049e(final InterfaceC0214b interfaceC0214b, final InterfaceC46735a interfaceC46735a, final InterfaceC36655b interfaceC36655b, final MediaFormat mediaFormat, final Codecs codecs, final int i11) {
        return Pipeline.INSTANCE.build$lib_release("Video", new Function0<Pipeline.C27353a<?, InterfaceC27356b>>() { // from class: com.otaliastudios.transcoder.internal.pipeline.PipelinesKt$VideoPipeline$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Pipeline.C27353a<?, InterfaceC27356b> invoke() {
                InterfaceC0214b interfaceC0214b2 = interfaceC0214b;
                TrackType trackType = TrackType.VIDEO;
                C44713a c44713a = new C44713a(interfaceC0214b2, trackType);
                MediaFormat mediaFormatMo791d = interfaceC0214b.mo791d(trackType);
                Intrinsics.checkNotNull(mediaFormatMo791d);
                Intrinsics.checkNotNullExpressionValue(mediaFormatMo791d, "source.getTrackFormat(TrackType.VIDEO)!!");
                return C27358d.m68052a(c44713a, new Decoder(mediaFormatMo791d, true)).m68044b(new C27348d(trackType, interfaceC36655b)).m68044b(new VideoRenderer(interfaceC0214b.getOrientation(), i11, mediaFormat, false, 8, null)).m68044b(new C27368d()).m68044b(new Encoder(codecs, trackType)).m68044b(new C44717e(interfaceC46735a, trackType));
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final Pipeline m68047c(@NotNull final TrackType track, @NotNull final InterfaceC0214b source, @NotNull final InterfaceC46735a sink, @NotNull final InterfaceC36655b interpolator) {
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        return Pipeline.INSTANCE.build$lib_release("PassThrough(" + track + ')', new Function0<Pipeline.C27353a<?, InterfaceC27356b>>() { // from class: com.otaliastudios.transcoder.internal.pipeline.PipelinesKt$PassThroughPipeline$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Pipeline.C27353a<?, InterfaceC27356b> invoke() {
                Pipeline.C27353a c27353aM68052a = C27358d.m68052a(new C44713a(source, track), new C44716d(track, interpolator));
                MediaFormat mediaFormatMo791d = source.mo791d(track);
                Intrinsics.checkNotNull(mediaFormatMo791d);
                Intrinsics.checkNotNullExpressionValue(mediaFormatMo791d, "source.getTrackFormat(track)!!");
                return c27353aM68052a.m68044b(new Bridge(mediaFormatMo791d)).m68044b(new C44717e(sink, track));
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Pipeline m68048d(@NotNull TrackType track, @NotNull InterfaceC0214b source, @NotNull InterfaceC46735a sink, @NotNull InterfaceC36655b interpolator, @NotNull MediaFormat format, @NotNull Codecs codecs, int i11, @NotNull InterfaceC4920a audioStretcher, @NotNull InterfaceC46104a audioResampler) {
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(codecs, "codecs");
        Intrinsics.checkNotNullParameter(audioStretcher, "audioStretcher");
        Intrinsics.checkNotNullParameter(audioResampler, "audioResampler");
        int i12 = C27354a.$EnumSwitchMapping$0[track.ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                return m68045a(source, sink, interpolator, format, codecs, audioStretcher, audioResampler);
            }
            throw new NoWhenBranchMatchedException();
        }
        return m68049e(source, sink, interpolator, format, codecs, i11);
    }
}
