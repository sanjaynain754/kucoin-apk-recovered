package com.otaliastudios.transcoder.internal;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.otaliastudios.transcoder.common.TrackStatus;
import com.otaliastudios.transcoder.common.TrackType;
import java.io.IOException;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import w90.C45770i;
import w90.InterfaceC45773l;

/* JADX INFO: compiled from: Codecs.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R+\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00180\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0015\u0010\u001cR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u001f\u0010\u001c¨\u0006\""}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/Codecs;", "", "Lcom/otaliastudios/transcoder/internal/a;", "sources", "Lcom/otaliastudios/transcoder/internal/e;", "tracks", "Lw90/l;", "", "current", "<init>", "(Lcom/otaliastudios/transcoder/internal/a;Lcom/otaliastudios/transcoder/internal/e;Lw90/l;)V", "", "g", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/otaliastudios/transcoder/internal/a;", "b", "Lcom/otaliastudios/transcoder/internal/e;", "c", "Lw90/l;", "Lw90/i;", "d", "Lw90/i;", "log", "Lkotlin/Pair;", "Landroid/media/MediaCodec;", "Landroid/view/Surface;", "e", "()Lw90/l;", "encoders", "", "f", "ownsEncoderStart", "ownsEncoderStop", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class Codecs {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C27335a sources;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C27352e tracks;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45773l<Integer> current;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C45770i log;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45773l<Pair<MediaCodec, Surface>> encoders;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45773l<Boolean> ownsEncoderStart;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45773l<Boolean> ownsEncoderStop;

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.Codecs$a */
    /* JADX INFO: compiled from: Codecs.kt */
    @Metadata(m90083d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"com/otaliastudios/transcoder/internal/Codecs$a", "Lw90/l;", "", "Lcom/otaliastudios/transcoder/common/TrackType;", "type", "w", "(Lcom/otaliastudios/transcoder/common/TrackType;)Z", "b", "(Lcom/otaliastudios/transcoder/common/TrackType;)Ljava/lang/Boolean;", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class C27332a implements InterfaceC45773l<Boolean> {
        public C27332a() {
        }

        @Override // w90.InterfaceC45773l
        /* JADX INFO: renamed from: C */
        public boolean mo67870C() {
            return InterfaceC45773l.a.m101090d(this);
        }

        @Override // w90.InterfaceC45773l
        /* JADX INFO: renamed from: E */
        public boolean mo67871E() {
            return InterfaceC45773l.a.m101089c(this);
        }

        @Override // w90.InterfaceC45773l
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean mo67872J() {
            return (Boolean) InterfaceC45773l.a.m101087a(this);
        }

        @Override // w90.InterfaceC45773l
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean mo67873M(@NotNull TrackType type) {
            boolean z11;
            Intrinsics.checkNotNullParameter(type, "type");
            if (((Number) Codecs.this.current.mo67873M(type)).intValue() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }

        @Override // w90.InterfaceC45773l
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean mo67881p() {
            return (Boolean) InterfaceC45773l.a.m101088b(this);
        }

        @Override // w90.InterfaceC45773l
        @Nullable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean mo67883u(@NotNull TrackType trackType) {
            return (Boolean) InterfaceC45773l.a.m101091e(this, trackType);
        }

        @Override // w90.InterfaceC45773l
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean mo67880o() {
            return (Boolean) InterfaceC45773l.a.m101093g(this);
        }

        @Override // w90.InterfaceC45773l
        @Nullable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean mo67882q() {
            return (Boolean) InterfaceC45773l.a.m101095i(this);
        }

        @Override // w90.InterfaceC45773l
        public int getSize() {
            return InterfaceC45773l.a.m101092f(this);
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<Boolean> iterator() {
            return InterfaceC45773l.a.m101094h(this);
        }

        @Override // w90.InterfaceC45773l
        /* JADX INFO: renamed from: w */
        public boolean mo67884w(@NotNull TrackType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return true;
        }
    }

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.Codecs$b */
    /* JADX INFO: compiled from: Codecs.kt */
    @Metadata(m90083d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"com/otaliastudios/transcoder/internal/Codecs$b", "Lw90/l;", "", "Lcom/otaliastudios/transcoder/common/TrackType;", "type", "w", "(Lcom/otaliastudios/transcoder/common/TrackType;)Z", "b", "(Lcom/otaliastudios/transcoder/common/TrackType;)Ljava/lang/Boolean;", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class C27333b implements InterfaceC45773l<Boolean> {
        public C27333b() {
        }

        @Override // w90.InterfaceC45773l
        /* JADX INFO: renamed from: C */
        public boolean mo67870C() {
            return InterfaceC45773l.a.m101090d(this);
        }

        @Override // w90.InterfaceC45773l
        /* JADX INFO: renamed from: E */
        public boolean mo67871E() {
            return InterfaceC45773l.a.m101089c(this);
        }

        @Override // w90.InterfaceC45773l
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean mo67872J() {
            return (Boolean) InterfaceC45773l.a.m101087a(this);
        }

        @Override // w90.InterfaceC45773l
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean mo67873M(@NotNull TrackType type) {
            boolean z11;
            Intrinsics.checkNotNullParameter(type, "type");
            if (((Number) Codecs.this.current.mo67873M(type)).intValue() == CollectionsKt.getLastIndex(Codecs.this.sources.mo67873M(type))) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }

        @Override // w90.InterfaceC45773l
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean mo67881p() {
            return (Boolean) InterfaceC45773l.a.m101088b(this);
        }

        @Override // w90.InterfaceC45773l
        @Nullable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean mo67883u(@NotNull TrackType trackType) {
            return (Boolean) InterfaceC45773l.a.m101091e(this, trackType);
        }

        @Override // w90.InterfaceC45773l
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean mo67880o() {
            return (Boolean) InterfaceC45773l.a.m101093g(this);
        }

        @Override // w90.InterfaceC45773l
        @Nullable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean mo67882q() {
            return (Boolean) InterfaceC45773l.a.m101095i(this);
        }

        @Override // w90.InterfaceC45773l
        public int getSize() {
            return InterfaceC45773l.a.m101092f(this);
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<Boolean> iterator() {
            return InterfaceC45773l.a.m101094h(this);
        }

        @Override // w90.InterfaceC45773l
        /* JADX INFO: renamed from: w */
        public boolean mo67884w(@NotNull TrackType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return true;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC45773l<Pair<MediaCodec, Surface>> m67866d() {
        return this.encoders;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final InterfaceC45773l<Boolean> m67867e() {
        return this.ownsEncoderStart;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final InterfaceC45773l<Boolean> m67868f() {
        return this.ownsEncoderStop;
    }

    /* JADX INFO: renamed from: g */
    public final void m67869g() {
        Iterator<Pair<MediaCodec, Surface>> it = this.encoders.iterator();
        while (it.hasNext()) {
            it.next().getFirst().release();
        }
    }

    public Codecs(@NotNull C27335a sources, @NotNull C27352e tracks, @NotNull InterfaceC45773l<Integer> current) {
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        Intrinsics.checkNotNullParameter(current, "current");
        this.sources = sources;
        this.tracks = tracks;
        this.current = current;
        this.log = new C45770i("Codecs");
        this.encoders = new InterfaceC45773l<Pair<? extends MediaCodec, ? extends Surface>>() { // from class: com.otaliastudios.transcoder.internal.Codecs$encoders$1

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final Lazy lazyAudio;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @NotNull
            public final Lazy lazyVideo;

            /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.Codecs$encoders$1$a */
            /* JADX INFO: compiled from: Codecs.kt */
            @Metadata(m90085k = 3, m90086mv = {1, 5, 1}, m90088xi = 48)
            public /* synthetic */ class C27334a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TrackType.values().length];
                    iArr[TrackType.AUDIO.ordinal()] = 1;
                    iArr[TrackType.VIDEO.ordinal()] = 2;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                this.lazyAudio = LazyKt.lazy(new Function0<Pair>() { // from class: com.otaliastudios.transcoder.internal.Codecs$encoders$1$lazyAudio$2
                    {
                        super(0);
                    }

                    @Override // p852kotlin.jvm.functions.Function0
                    @NotNull
                    public final Pair invoke() throws IOException {
                        MediaFormat mediaFormatMo67881p = codecs.tracks.m68036c().mo67881p();
                        String string = mediaFormatMo67881p.getString("mime");
                        Intrinsics.checkNotNull(string);
                        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(string);
                        Intrinsics.checkNotNullExpressionValue(mediaCodecCreateEncoderByType, "createEncoderByType(form…(MediaFormat.KEY_MIME)!!)");
                        mediaCodecCreateEncoderByType.configure(mediaFormatMo67881p, (Surface) null, (MediaCrypto) null, 1);
                        return TuplesKt.m90091to(mediaCodecCreateEncoderByType, null);
                    }
                });
                this.lazyVideo = LazyKt.lazy(new Function0<Pair<? extends MediaCodec, ? extends Surface>>() { // from class: com.otaliastudios.transcoder.internal.Codecs$encoders$1$lazyVideo$2
                    {
                        super(0);
                    }

                    @Override // p852kotlin.jvm.functions.Function0
                    @NotNull
                    public final Pair<? extends MediaCodec, ? extends Surface> invoke() throws IOException {
                        MediaFormat mediaFormatMo67880o = codecs.tracks.m68036c().mo67880o();
                        String string = mediaFormatMo67880o.getString("mime");
                        Intrinsics.checkNotNull(string);
                        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(string);
                        Intrinsics.checkNotNullExpressionValue(mediaCodecCreateEncoderByType, "createEncoderByType(form…(MediaFormat.KEY_MIME)!!)");
                        mediaCodecCreateEncoderByType.configure(mediaFormatMo67880o, (Surface) null, (MediaCrypto) null, 1);
                        return TuplesKt.m90091to(mediaCodecCreateEncoderByType, mediaCodecCreateEncoderByType.createInputSurface());
                    }
                });
            }

            /* JADX INFO: renamed from: d */
            public final Pair m67894d() {
                return (Pair) this.lazyAudio.getValue();
            }

            /* JADX INFO: renamed from: e */
            public final Pair<MediaCodec, Surface> m67895e() {
                return (Pair) this.lazyVideo.getValue();
            }

            @Override // w90.InterfaceC45773l
            /* JADX INFO: renamed from: C */
            public boolean mo67870C() {
                return InterfaceC45773l.a.m101090d(this);
            }

            @Override // w90.InterfaceC45773l
            /* JADX INFO: renamed from: E */
            public boolean mo67871E() {
                return InterfaceC45773l.a.m101089c(this);
            }

            @Override // w90.InterfaceC45773l
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Pair<MediaCodec, Surface> mo67872J() {
                return (Pair) InterfaceC45773l.a.m101087a(this);
            }

            @Override // w90.InterfaceC45773l
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Pair<MediaCodec, Surface> mo67873M(@NotNull TrackType type) {
                Intrinsics.checkNotNullParameter(type, "type");
                int i11 = C27334a.$EnumSwitchMapping$0[type.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        return m67895e();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return m67894d();
            }

            @Override // w90.InterfaceC45773l
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Pair<MediaCodec, Surface> mo67881p() {
                return (Pair) InterfaceC45773l.a.m101088b(this);
            }

            @Override // w90.InterfaceC45773l
            @Nullable
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public Pair<MediaCodec, Surface> mo67883u(@NotNull TrackType trackType) {
                return (Pair) InterfaceC45773l.a.m101091e(this, trackType);
            }

            @Override // w90.InterfaceC45773l
            @NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public Pair<MediaCodec, Surface> mo67880o() {
                return (Pair) InterfaceC45773l.a.m101093g(this);
            }

            @Override // w90.InterfaceC45773l
            public int getSize() {
                return InterfaceC45773l.a.m101092f(this);
            }

            @Override // w90.InterfaceC45773l
            @Nullable
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public Pair<MediaCodec, Surface> mo67882q() {
                return (Pair) InterfaceC45773l.a.m101095i(this);
            }

            @Override // java.lang.Iterable
            @NotNull
            public Iterator<Pair<MediaCodec, Surface>> iterator() {
                return InterfaceC45773l.a.m101094h(this);
            }

            @Override // w90.InterfaceC45773l
            /* JADX INFO: renamed from: w */
            public boolean mo67884w(@NotNull TrackType type) {
                Intrinsics.checkNotNullParameter(type, "type");
                if (this.f55626d.tracks.m68035b().mo67873M(type) == TrackStatus.COMPRESSING) {
                    return true;
                }
                return false;
            }
        };
        this.ownsEncoderStart = new C27332a();
        this.ownsEncoderStop = new C27333b();
    }
}
