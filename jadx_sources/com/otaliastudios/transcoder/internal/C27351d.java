package com.otaliastudios.transcoder.internal;

import aa0.InterfaceC0214b;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.otaliastudios.transcoder.common.TrackType;
import da0.InterfaceC36655b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import w90.C45770i;
import w90.InterfaceC45773l;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.d */
/* JADX INFO: compiled from: Timer.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140\b8\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140\b8\u0006¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010&R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b,\u0010&R,\u00101\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0/\u0012\u0004\u0012\u00020\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00100R\u0011\u00104\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/d;", "", "Lda0/b;", "interpolator", "Lcom/otaliastudios/transcoder/internal/a;", "sources", "Lcom/otaliastudios/transcoder/internal/e;", "tracks", "Lw90/l;", "", "current", "<init>", "(Lda0/b;Lcom/otaliastudios/transcoder/internal/a;Lcom/otaliastudios/transcoder/internal/e;Lw90/l;)V", "Lcom/otaliastudios/transcoder/common/TrackType;", "type", "index", "m", "(Lcom/otaliastudios/transcoder/common/TrackType;I)Lda0/b;", "", "Laa0/b;", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/util/List;I)J", "n", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lda0/b;", "b", "Lcom/otaliastudios/transcoder/internal/a;", "c", "Lcom/otaliastudios/transcoder/internal/e;", "d", "Lw90/l;", "Lw90/i;", "e", "Lw90/i;", "log", "f", "j", "()Lw90/l;", "positionUs", "g", "i", "durationUs", "", "k", "progress", "", "Lkotlin/Pair;", "Ljava/util/Map;", "interpolators", CmcdData.Factory.STREAM_TYPE_LIVE, "()J", "totalDurationUs", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C27351d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC36655b interpolator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C27335a sources;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C27352e tracks;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45773l<Integer> current;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C45770i log;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45773l<Long> positionUs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45773l<Long> durationUs;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45773l<Double> progress;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Map<Pair<TrackType, Integer>, InterfaceC36655b> interpolators;

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.d$a */
    /* JADX INFO: compiled from: Timer.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"com/otaliastudios/transcoder/internal/d$a", "Lw90/l;", "", "Lcom/otaliastudios/transcoder/common/TrackType;", "type", "", "w", "(Lcom/otaliastudios/transcoder/common/TrackType;)Z", "b", "(Lcom/otaliastudios/transcoder/common/TrackType;)Ljava/lang/Long;", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class a implements InterfaceC45773l<Long> {
        public a() {
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
        public Long mo67872J() {
            return (Long) InterfaceC45773l.a.m101087a(this);
        }

        @Override // w90.InterfaceC45773l
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long mo67873M(@NotNull TrackType type) {
            long jM68006h;
            Intrinsics.checkNotNullParameter(type, "type");
            if (!C27351d.this.tracks.m68034a().mo67884w(type)) {
                jM68006h = 0;
            } else {
                C27351d c27351d = C27351d.this;
                jM68006h = c27351d.m68006h(c27351d.sources.mo67873M(type), ((Number) C27351d.this.current.mo67873M(type)).intValue());
            }
            return Long.valueOf(jM68006h);
        }

        @Override // w90.InterfaceC45773l
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Long mo67881p() {
            return (Long) InterfaceC45773l.a.m101088b(this);
        }

        @Override // w90.InterfaceC45773l
        @Nullable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Long mo67883u(@NotNull TrackType trackType) {
            return (Long) InterfaceC45773l.a.m101091e(this, trackType);
        }

        @Override // w90.InterfaceC45773l
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Long mo67880o() {
            return (Long) InterfaceC45773l.a.m101093g(this);
        }

        @Override // w90.InterfaceC45773l
        @Nullable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Long mo67882q() {
            return (Long) InterfaceC45773l.a.m101095i(this);
        }

        @Override // w90.InterfaceC45773l
        public int getSize() {
            return InterfaceC45773l.a.m101092f(this);
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<Long> iterator() {
            return InterfaceC45773l.a.m101094h(this);
        }

        @Override // w90.InterfaceC45773l
        /* JADX INFO: renamed from: w */
        public boolean mo67884w(@NotNull TrackType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return true;
        }
    }

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.d$b */
    /* JADX INFO: compiled from: Timer.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000e"}, m90084d2 = {"com/otaliastudios/transcoder/internal/d$b", "Lda0/b;", "Lcom/otaliastudios/transcoder/common/TrackType;", "type", "", "time", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/otaliastudios/transcoder/common/TrackType;J)J", "J", "lastOut", "b", "firstIn", "c", "firstOut", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class b implements InterfaceC36655b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public long lastOut;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public long firstIn = Long.MAX_VALUE;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final long firstOut;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f55734d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C27351d f55735e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TrackType f55736f;

        public b(int i11, C27351d c27351d, TrackType trackType) {
            long jMo68019a;
            this.f55734d = i11;
            this.f55735e = c27351d;
            this.f55736f = trackType;
            if (i11 == 0) {
                jMo68019a = 0;
            } else {
                Object obj = c27351d.interpolators.get(TuplesKt.m90091to(trackType, Integer.valueOf(i11 - 1)));
                Intrinsics.checkNotNull(obj);
                jMo68019a = ((InterfaceC36655b) obj).mo68019a(trackType, Long.MAX_VALUE) + 10;
            }
            this.firstOut = jMo68019a;
        }

        @Override // da0.InterfaceC36655b
        /* JADX INFO: renamed from: a */
        public long mo68019a(@NotNull TrackType type, long time) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (time == Long.MAX_VALUE) {
                return this.lastOut;
            }
            if (this.firstIn == Long.MAX_VALUE) {
                this.firstIn = time;
            }
            this.lastOut = this.firstOut + (time - this.firstIn);
            return this.f55735e.interpolator.mo68019a(type, this.lastOut);
        }
    }

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.d$c */
    /* JADX INFO: compiled from: Timer.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"com/otaliastudios/transcoder/internal/d$c", "Lw90/l;", "", "Lcom/otaliastudios/transcoder/common/TrackType;", "type", "", "w", "(Lcom/otaliastudios/transcoder/common/TrackType;)Z", "b", "(Lcom/otaliastudios/transcoder/common/TrackType;)Ljava/lang/Long;", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class c implements InterfaceC45773l<Long> {
        public c() {
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
        public Long mo67872J() {
            return (Long) InterfaceC45773l.a.m101087a(this);
        }

        @Override // w90.InterfaceC45773l
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long mo67873M(@NotNull TrackType type) {
            long jM68012n;
            Intrinsics.checkNotNullParameter(type, "type");
            if (!C27351d.this.tracks.m68034a().mo67884w(type)) {
                jM68012n = 0;
            } else {
                C27351d c27351d = C27351d.this;
                jM68012n = c27351d.m68012n(c27351d.sources.mo67873M(type), ((Number) C27351d.this.current.mo67873M(type)).intValue());
            }
            return Long.valueOf(jM68012n);
        }

        @Override // w90.InterfaceC45773l
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Long mo67881p() {
            return (Long) InterfaceC45773l.a.m101088b(this);
        }

        @Override // w90.InterfaceC45773l
        @Nullable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Long mo67883u(@NotNull TrackType trackType) {
            return (Long) InterfaceC45773l.a.m101091e(this, trackType);
        }

        @Override // w90.InterfaceC45773l
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Long mo67880o() {
            return (Long) InterfaceC45773l.a.m101093g(this);
        }

        @Override // w90.InterfaceC45773l
        @Nullable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Long mo67882q() {
            return (Long) InterfaceC45773l.a.m101095i(this);
        }

        @Override // w90.InterfaceC45773l
        public int getSize() {
            return InterfaceC45773l.a.m101092f(this);
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<Long> iterator() {
            return InterfaceC45773l.a.m101094h(this);
        }

        @Override // w90.InterfaceC45773l
        /* JADX INFO: renamed from: w */
        public boolean mo67884w(@NotNull TrackType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return true;
        }
    }

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.d$d */
    /* JADX INFO: compiled from: Timer.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"com/otaliastudios/transcoder/internal/d$d", "Lw90/l;", "", "Lcom/otaliastudios/transcoder/common/TrackType;", "type", "", "w", "(Lcom/otaliastudios/transcoder/common/TrackType;)Z", "b", "(Lcom/otaliastudios/transcoder/common/TrackType;)Ljava/lang/Double;", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class d implements InterfaceC45773l<Double> {
        public d() {
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
        public Double mo67872J() {
            return (Double) InterfaceC45773l.a.m101087a(this);
        }

        @Override // w90.InterfaceC45773l
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double mo67873M(@NotNull TrackType type) {
            double d11;
            Intrinsics.checkNotNullParameter(type, "type");
            long jLongValue = C27351d.this.m68008j().mo67873M(type).longValue();
            long jLongValue2 = C27351d.this.m68007i().mo67873M(type).longValue();
            if (jLongValue2 == 0) {
                d11 = 0.0d;
            } else {
                d11 = jLongValue / jLongValue2;
            }
            return Double.valueOf(d11);
        }

        @Override // w90.InterfaceC45773l
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Double mo67881p() {
            return (Double) InterfaceC45773l.a.m101088b(this);
        }

        @Override // w90.InterfaceC45773l
        @Nullable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Double mo67883u(@NotNull TrackType trackType) {
            return (Double) InterfaceC45773l.a.m101091e(this, trackType);
        }

        @Override // w90.InterfaceC45773l
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double mo67880o() {
            return (Double) InterfaceC45773l.a.m101093g(this);
        }

        @Override // w90.InterfaceC45773l
        @Nullable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Double mo67882q() {
            return (Double) InterfaceC45773l.a.m101095i(this);
        }

        @Override // w90.InterfaceC45773l
        public int getSize() {
            return InterfaceC45773l.a.m101092f(this);
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<Double> iterator() {
            return InterfaceC45773l.a.m101094h(this);
        }

        @Override // w90.InterfaceC45773l
        /* JADX INFO: renamed from: w */
        public boolean mo67884w(@NotNull TrackType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return true;
        }
    }

    public C27351d(@NotNull InterfaceC36655b interpolator, @NotNull C27335a sources, @NotNull C27352e tracks, @NotNull InterfaceC45773l<Integer> current) {
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        Intrinsics.checkNotNullParameter(current, "current");
        this.interpolator = interpolator;
        this.sources = sources;
        this.tracks = tracks;
        this.current = current;
        this.log = new C45770i("Timer");
        this.positionUs = new c();
        this.durationUs = new a();
        this.progress = new d();
        this.interpolators = new LinkedHashMap();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final InterfaceC45773l<Long> m68007i() {
        return this.durationUs;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final InterfaceC45773l<Long> m68008j() {
        return this.positionUs;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final InterfaceC45773l<Double> m68009k() {
        return this.progress;
    }

    /* JADX INFO: renamed from: l */
    public final long m68010l() {
        return Math.min(this.tracks.m68034a().mo67870C() ? this.durationUs.mo67880o().longValue() : Long.MAX_VALUE, this.tracks.m68034a().mo67871E() ? this.durationUs.mo67881p().longValue() : Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: h */
    public final long m68006h(List<? extends InterfaceC0214b> list, int i11) {
        long durationUs;
        long j11 = 0;
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            InterfaceC0214b interfaceC0214b = (InterfaceC0214b) obj;
            if (i12 < i11) {
                durationUs = interfaceC0214b.getPositionUs();
            } else {
                durationUs = interfaceC0214b.getDurationUs();
            }
            j11 += durationUs;
            i12 = i13;
        }
        return j11;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final InterfaceC36655b m68011m(@NotNull TrackType type, int index) {
        Intrinsics.checkNotNullParameter(type, "type");
        Map<Pair<TrackType, Integer>, InterfaceC36655b> map = this.interpolators;
        Pair<TrackType, Integer> pairM90091to = TuplesKt.m90091to(type, Integer.valueOf(index));
        InterfaceC36655b bVar = map.get(pairM90091to);
        if (bVar == null) {
            bVar = new b(index, this, type);
            map.put(pairM90091to, bVar);
        }
        return bVar;
    }

    /* JADX INFO: renamed from: n */
    public final long m68012n(List<? extends InterfaceC0214b> list, int i11) {
        long positionUs = 0;
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            InterfaceC0214b interfaceC0214b = (InterfaceC0214b) obj;
            if (i12 <= i11) {
                positionUs += interfaceC0214b.getPositionUs();
            }
            i12 = i13;
        }
        return positionUs;
    }
}
