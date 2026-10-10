package com.otaliastudios.transcoder.internal;

import aa0.InterfaceC0214b;
import android.media.MediaFormat;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import ba0.InterfaceC4528e;
import com.otaliastudios.transcoder.common.TrackStatus;
import com.otaliastudios.transcoder.common.TrackType;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import u90.C45142b;
import w90.C45770i;
import w90.C45774m;
import w90.InterfaceC45773l;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.e */
/* JADX INFO: compiled from: Tracks.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r0\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b%\u0010#R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b\u001e\u0010#¨\u0006("}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/e;", "", "Lw90/l;", "Lba0/e;", "strategies", "Lcom/otaliastudios/transcoder/internal/a;", "sources", "", "videoRotation", "", "forceCompression", "<init>", "(Lw90/l;Lcom/otaliastudios/transcoder/internal/a;IZ)V", "Lcom/otaliastudios/transcoder/common/TrackStatus;", "status", "rotation", "f", "(Lcom/otaliastudios/transcoder/common/TrackStatus;ZI)Lcom/otaliastudios/transcoder/common/TrackStatus;", "d", "(Lcom/otaliastudios/transcoder/common/TrackStatus;Z)Lcom/otaliastudios/transcoder/common/TrackStatus;", "Lcom/otaliastudios/transcoder/common/TrackType;", "type", "strategy", "", "Laa0/b;", "Lkotlin/Pair;", "Landroid/media/MediaFormat;", "e", "(Lcom/otaliastudios/transcoder/common/TrackType;Lba0/e;Ljava/util/List;)Lkotlin/Pair;", "Lw90/i;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lw90/i;", "log", "b", "Lw90/l;", "()Lw90/l;", TtmlNode.COMBINE_ALL, "c", "outputFormats", "active", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C27352e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C45770i log;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45773l<TrackStatus> all;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45773l<MediaFormat> outputFormats;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45773l<TrackStatus> active;

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC45773l<TrackStatus> m68034a() {
        return this.active;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC45773l<TrackStatus> m68035b() {
        return this.all;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC45773l<MediaFormat> m68036c() {
        return this.outputFormats;
    }

    /* JADX INFO: renamed from: d */
    public final TrackStatus m68037d(TrackStatus status, boolean forceCompression) {
        return (status == TrackStatus.PASS_THROUGH && forceCompression) ? TrackStatus.COMPRESSING : status;
    }

    /* JADX INFO: renamed from: e */
    public final Pair<MediaFormat, TrackStatus> m68038e(TrackType type, InterfaceC4528e strategy, List<? extends InterfaceC0214b> sources) {
        C45770i c45770i = this.log;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("resolveTrack(");
        sb2.append(type);
        sb2.append("), sources=");
        sb2.append(sources == null ? null : Integer.valueOf(sources.size()));
        sb2.append(", strategy=");
        sb2.append((Object) Reflection.getOrCreateKotlinClass(strategy.getClass()).getSimpleName());
        c45770i.m101066c(sb2.toString());
        if (sources == null) {
            return TuplesKt.m90091to(new MediaFormat(), TrackStatus.ABSENT);
        }
        C45142b c45142b = new C45142b();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC0214b interfaceC0214b : sources) {
            MediaFormat mediaFormatMo791d = interfaceC0214b.mo791d(type);
            MediaFormat mediaFormatM99782h = mediaFormatMo791d == null ? null : c45142b.m99782h(interfaceC0214b, type, mediaFormatMo791d);
            if (mediaFormatM99782h != null) {
                arrayList.add(mediaFormatM99782h);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return TuplesKt.m90091to(new MediaFormat(), TrackStatus.ABSENT);
        }
        if (size == sources.size()) {
            MediaFormat mediaFormat = new MediaFormat();
            TrackStatus trackStatusMo4366a = strategy.mo4366a(arrayList, mediaFormat);
            Intrinsics.checkNotNullExpressionValue(trackStatusMo4366a, "strategy.createOutputFormat(inputs, output)");
            return TuplesKt.m90091to(mediaFormat, trackStatusMo4366a);
        }
        throw new IllegalStateException(("Of all " + type + " sources, some have a " + type + " track, some don't.").toString());
    }

    /* JADX INFO: renamed from: f */
    public final TrackStatus m68039f(TrackStatus status, boolean forceCompression, int rotation) {
        return (status == TrackStatus.PASS_THROUGH && (forceCompression || rotation != 0)) ? TrackStatus.COMPRESSING : status;
    }

    public C27352e(@NotNull InterfaceC45773l<InterfaceC4528e> strategies, @NotNull C27335a sources, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(strategies, "strategies");
        Intrinsics.checkNotNullParameter(sources, "sources");
        C45770i c45770i = new C45770i("Tracks");
        this.log = c45770i;
        Pair<MediaFormat, TrackStatus> pairM68038e = m68038e(TrackType.AUDIO, strategies.mo67881p(), sources.mo67872J());
        MediaFormat mediaFormatComponent1 = pairM68038e.component1();
        TrackStatus trackStatusComponent2 = pairM68038e.component2();
        Pair<MediaFormat, TrackStatus> pairM68038e2 = m68038e(TrackType.VIDEO, strategies.mo67880o(), sources.mo67882q());
        MediaFormat mediaFormatComponent2 = pairM68038e2.component1();
        TrackStatus trackStatusComponent3 = pairM68038e2.component2();
        InterfaceC45773l<TrackStatus> interfaceC45773lM101098c = C45774m.m101098c(m68039f(trackStatusComponent3, z11, i11), m68037d(trackStatusComponent2, z11));
        this.all = interfaceC45773lM101098c;
        this.outputFormats = C45774m.m101098c(mediaFormatComponent2, mediaFormatComponent1);
        c45770i.m101066c("init: videoStatus=" + trackStatusComponent3 + ", resolvedVideoStatus=" + interfaceC45773lM101098c.mo67880o() + ", videoFormat=" + mediaFormatComponent2);
        c45770i.m101066c("init: audioStatus=" + trackStatusComponent2 + ", resolvedAudioStatus=" + interfaceC45773lM101098c.mo67881p() + ", audioFormat=" + mediaFormatComponent1);
        TrackStatus trackStatusMo67880o = interfaceC45773lM101098c.mo67880o();
        trackStatusMo67880o = trackStatusMo67880o.isTranscoding() ? trackStatusMo67880o : null;
        TrackStatus trackStatusMo67881p = interfaceC45773lM101098c.mo67881p();
        this.active = C45774m.m101098c(trackStatusMo67880o, trackStatusMo67881p.isTranscoding() ? trackStatusMo67881p : null);
    }
}
