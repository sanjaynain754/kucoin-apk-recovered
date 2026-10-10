package com.otaliastudios.transcoder.internal.transcode;

import android.media.MediaFormat;
import com.otaliastudios.transcoder.common.TrackStatus;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.pipeline.Pipeline;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DefaultTranscodeEngine.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90085k = 3, m90086mv = {1, 5, 1}, m90088xi = 48)
public /* synthetic */ class DefaultTranscodeEngine$segments$1 extends FunctionReferenceImpl implements Function4<TrackType, Integer, TrackStatus, MediaFormat, Pipeline> {
    @NotNull
    public final Pipeline invoke(@NotNull TrackType p11, int i11, @NotNull TrackStatus p12, @NotNull MediaFormat p13) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p2");
        Intrinsics.checkNotNullParameter(p13, "p3");
        return ((DefaultTranscodeEngine) this.receiver).m68062f(p11, i11, p12, p13);
    }

    public DefaultTranscodeEngine$segments$1(Object obj) {
        super(4, obj, DefaultTranscodeEngine.class, "createPipeline", "createPipeline(Lcom/otaliastudios/transcoder/common/TrackType;ILcom/otaliastudios/transcoder/common/TrackStatus;Landroid/media/MediaFormat;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;", 0);
    }

    @Override // p852kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Pipeline invoke(TrackType trackType, Integer num, TrackStatus trackStatus, MediaFormat mediaFormat) {
        return invoke(trackType, num.intValue(), trackStatus, mediaFormat);
    }
}
