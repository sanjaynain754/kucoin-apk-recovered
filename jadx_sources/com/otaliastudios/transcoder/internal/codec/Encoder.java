package com.otaliastudios.transcoder.internal.codec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.Codecs;
import com.otaliastudios.transcoder.internal.pipeline.AbstractC27359e;
import com.otaliastudios.transcoder.internal.pipeline.AbstractC27360f;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.MutablePropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.properties.Delegates;
import p852kotlin.properties.ObservableProperty;
import p852kotlin.properties.ReadWriteProperty;
import p852kotlin.reflect.KProperty;
import t90.InterfaceC44718f;
import t90.WriterData;
import u90.C45141a;
import w90.C45770i;
import w90.C45774m;
import w90.InterfaceC45773l;

/* JADX INFO: compiled from: Encoder.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001f2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0003:\u0001NB)\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\r\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040 H\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0014H\u0016¢\u0006\u0004\b#\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010/R+\u00108\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00198B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R+\u0010<\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00198B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b9\u00103\u001a\u0004\b:\u00105\"\u0004\b;\u00107R\u001a\u0010A\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010+¨\u0006O"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/codec/Encoder;", "Lcom/otaliastudios/transcoder/internal/pipeline/e;", "Lcom/otaliastudios/transcoder/internal/codec/EncoderData;", "Lcom/otaliastudios/transcoder/internal/codec/f;", "Lt90/g;", "Lt90/f;", "Landroid/media/MediaCodec;", "codec", "Landroid/view/Surface;", "surface", "", "ownsCodecStart", "ownsCodecStop", "<init>", "(Landroid/media/MediaCodec;Landroid/view/Surface;ZZ)V", "Lcom/otaliastudios/transcoder/internal/Codecs;", "codecs", "Lcom/otaliastudios/transcoder/common/TrackType;", "type", "(Lcom/otaliastudios/transcoder/internal/Codecs;Lcom/otaliastudios/transcoder/common/TrackType;)V", "", "t", "()V", "Lkotlin/Pair;", "Ljava/nio/ByteBuffer;", "", "buffer", "()Lkotlin/Pair;", "data", "o", "(Lcom/otaliastudios/transcoder/internal/codec/EncoderData;)V", "n", "Lcom/otaliastudios/transcoder/internal/pipeline/f;", "g", "()Lcom/otaliastudios/transcoder/internal/pipeline/f;", "release", "c", "Landroid/media/MediaCodec;", "d", "Landroid/view/Surface;", "getSurface", "()Landroid/view/Surface;", "e", "Z", "f", "Lcom/otaliastudios/transcoder/common/TrackType;", "Lw90/i;", "Lw90/i;", "log", "<set-?>", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lkotlin/properties/ReadWriteProperty;", "r", "()I", "u", "(I)V", "dequeuedInputs", "i", CmcdData.Factory.STREAMING_FORMAT_SS, "v", "dequeuedOutputs", "j", "Lcom/otaliastudios/transcoder/internal/codec/Encoder;", "q", "()Lcom/otaliastudios/transcoder/internal/codec/Encoder;", AppsFlyerProperties.CHANNEL, "Lu90/a;", "k", "Lkotlin/Lazy;", "p", "()Lu90/a;", "buffers", "Landroid/media/MediaCodec$BufferInfo;", CmcdData.Factory.STREAM_TYPE_LIVE, "Landroid/media/MediaCodec$BufferInfo;", "info", "m", "eosReceivedButNotEnqueued", "Companion", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class Encoder extends AbstractC27359e<EncoderData, InterfaceC27350f, WriterData, InterfaceC44718f> implements InterfaceC27350f {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final MediaCodec codec;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final Surface surface;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean ownsCodecStop;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final TrackType type;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C45770i log;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final ReadWriteProperty dequeuedInputs;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final ReadWriteProperty dequeuedOutputs;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Encoder channel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy buffers;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public MediaCodec.BufferInfo info;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean eosReceivedButNotEnqueued;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ KProperty<Object>[] f55683o = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Encoder.class, "dequeuedInputs", "getDequeuedInputs()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Encoder.class, "dequeuedOutputs", "getDequeuedOutputs()I", 0))};

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final InterfaceC45773l<AtomicInteger> f55684p = C45774m.m101098c(new AtomicInteger(0), new AtomicInteger(0));

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.codec.Encoder$a */
    /* JADX INFO: compiled from: Delegates.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, m90085k = 1, m90086mv = {1, 5, 1})
    public static final class C27343a extends ObservableProperty<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f55696a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Encoder f55697b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27343a(Object obj, Object obj2, Encoder encoder) {
            super(obj2);
            this.f55696a = obj;
            this.f55697b = encoder;
        }

        @Override // p852kotlin.properties.ObservableProperty
        public void afterChange(@NotNull KProperty<?> property, Integer oldValue, Integer newValue) {
            Intrinsics.checkNotNullParameter(property, "property");
            newValue.intValue();
            oldValue.intValue();
            this.f55697b.m67980t();
        }
    }

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.codec.Encoder$b */
    /* JADX INFO: compiled from: Delegates.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, m90085k = 1, m90086mv = {1, 5, 1})
    public static final class C27344b extends ObservableProperty<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f55698a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Encoder f55699b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27344b(Object obj, Object obj2, Encoder encoder) {
            super(obj2);
            this.f55698a = obj;
            this.f55699b = encoder;
        }

        @Override // p852kotlin.properties.ObservableProperty
        public void afterChange(@NotNull KProperty<?> property, Integer oldValue, Integer newValue) {
            Intrinsics.checkNotNullParameter(property, "property");
            newValue.intValue();
            oldValue.intValue();
            this.f55699b.m67980t();
        }
    }

    public Encoder(@NotNull MediaCodec codec, @Nullable Surface surface, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.codec = codec;
        this.surface = surface;
        this.ownsCodecStop = z12;
        TrackType trackType = getSurface() != null ? TrackType.VIDEO : TrackType.AUDIO;
        this.type = trackType;
        C45770i c45770i = new C45770i("Encoder(" + trackType + ',' + f55684p.mo67873M(trackType).getAndIncrement() + ')');
        this.log = c45770i;
        Delegates delegates = Delegates.INSTANCE;
        this.dequeuedInputs = new C27343a(0, 0, this);
        this.dequeuedOutputs = new C27344b(0, 0, this);
        this.channel = this;
        this.buffers = LazyKt.lazy(new Function0<C45141a>() { // from class: com.otaliastudios.transcoder.internal.codec.Encoder$buffers$2
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final C45141a invoke() {
                return new C45141a(this.this$0.codec);
            }
        });
        this.info = new MediaCodec.BufferInfo();
        c45770i.m101066c("Encoder: ownsStart=" + z11 + " ownsStop=" + z12);
        if (z11) {
            codec.start();
        }
    }

    /* JADX INFO: renamed from: p */
    private final C45141a m67977p() {
        return (C45141a) this.buffers.getValue();
    }

    /* JADX INFO: renamed from: r */
    private final int m67978r() {
        return ((Number) this.dequeuedInputs.getValue(this, f55683o[0])).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final int m67979s() {
        return ((Number) this.dequeuedOutputs.getValue(this, f55683o[1])).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final void m67980t() {
        this.log.m101070h("dequeuedInputs=" + m67978r() + " dequeuedOutputs=" + m67979s());
    }

    /* JADX INFO: renamed from: u */
    private final void m67981u(int i11) {
        this.dequeuedInputs.setValue(this, f55683o[0], Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final void m67982v(int i11) {
        this.dequeuedOutputs.setValue(this, f55683o[1], Integer.valueOf(i11));
    }

    @Override // com.otaliastudios.transcoder.internal.codec.InterfaceC27350f
    @Nullable
    public Pair<ByteBuffer, Integer> buffer() {
        int iDequeueInputBuffer = this.codec.dequeueInputBuffer(0L);
        if (iDequeueInputBuffer >= 0) {
            m67981u(m67978r() + 1);
            return TuplesKt.m90091to(m67977p().m99772a(iDequeueInputBuffer), Integer.valueOf(iDequeueInputBuffer));
        }
        this.log.m101066c("buffer() failed. dequeuedInputs=" + m67978r() + " dequeuedOutputs=" + m67979s());
        return null;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.AbstractC27359e
    @NotNull
    /* JADX INFO: renamed from: g */
    public AbstractC27360f<WriterData> mo67920g() {
        final int iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(this.info, this.eosReceivedButNotEnqueued ? 5000L : 0L);
        if (iDequeueOutputBuffer == -3) {
            m67977p().m99774c();
            return AbstractC27360f.c.f55759a;
        }
        if (iDequeueOutputBuffer == -2) {
            this.log.m101066c(Intrinsics.stringPlus("INFO_OUTPUT_FORMAT_CHANGED! format=", this.codec.getOutputFormat()));
            InterfaceC44718f interfaceC44718f = (InterfaceC44718f) m68050f();
            MediaFormat outputFormat = this.codec.getOutputFormat();
            Intrinsics.checkNotNullExpressionValue(outputFormat, "codec.outputFormat");
            interfaceC44718f.mo98944d(outputFormat);
            return AbstractC27360f.c.f55759a;
        }
        if (iDequeueOutputBuffer == -1) {
            if (!this.eosReceivedButNotEnqueued) {
                this.log.m101066c("Can't dequeue output buffer: INFO_TRY_AGAIN_LATER");
                return AbstractC27360f.d.f55760a;
            }
            this.log.m101066c("Sending fake Eos. dequeuedInputs=" + m67978r() + " dequeuedOutputs=" + m67979s());
            ByteBuffer buffer = ByteBuffer.allocateDirect(0);
            Intrinsics.checkNotNullExpressionValue(buffer, "buffer");
            return new AbstractC27360f.a(new WriterData(buffer, 0L, 0, new Function0<Unit>() { // from class: com.otaliastudios.transcoder.internal.codec.Encoder$drain$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // p852kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }));
        }
        if ((this.info.flags & 2) != 0) {
            this.codec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            return AbstractC27360f.c.f55759a;
        }
        m67982v(m67979s() + 1);
        int i11 = this.info.flags;
        boolean z11 = (i11 & 4) != 0;
        int i12 = i11 & (-5);
        ByteBuffer byteBufferM99773b = m67977p().m99773b(iDequeueOutputBuffer);
        Intrinsics.checkNotNullExpressionValue(byteBufferM99773b, "buffers.getOutputBuffer(result)");
        long j11 = this.info.presentationTimeUs;
        byteBufferM99773b.clear();
        MediaCodec.BufferInfo bufferInfo = this.info;
        byteBufferM99773b.limit(bufferInfo.offset + bufferInfo.size);
        byteBufferM99773b.position(this.info.offset);
        WriterData writerData = new WriterData(byteBufferM99773b, j11, i12, new Function0<Unit>() { // from class: com.otaliastudios.transcoder.internal.codec.Encoder$drain$data$1
            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.codec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                Encoder encoder = this.this$0;
                encoder.m67982v(encoder.m67979s() - 1);
            }
        });
        return z11 ? new AbstractC27360f.a(writerData) : new AbstractC27360f.b(writerData);
    }

    @Override // com.otaliastudios.transcoder.internal.codec.InterfaceC27350f
    @Nullable
    public Surface getSurface() {
        return this.surface;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.AbstractC27359e
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo67921h(@NotNull EncoderData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (getSurface() != null) {
            return;
        }
        ByteBuffer buffer = data.getBuffer();
        if (buffer == null) {
            throw new IllegalArgumentException("Audio should always pass a buffer to Encoder.");
        }
        this.codec.queueInputBuffer(data.getId(), buffer.position(), buffer.remaining(), data.getTimeUs(), 0);
        m67981u(m67978r() - 1);
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.AbstractC27359e
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo67922i(@NotNull EncoderData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (getSurface() != null) {
            if (this.ownsCodecStop) {
                this.codec.signalEndOfInputStream();
                return;
            } else {
                this.eosReceivedButNotEnqueued = true;
                return;
            }
        }
        boolean z11 = this.ownsCodecStop;
        if (!z11) {
            this.eosReceivedButNotEnqueued = true;
        }
        this.codec.queueInputBuffer(data.getId(), 0, 0, 0L, !z11 ? 0 : 4);
        m67981u(m67978r() - 1);
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public Encoder getChannel() {
        return this.channel;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.AbstractC27355a, com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    public void release() {
        this.log.m101066c("release(): ownsStop=" + this.ownsCodecStop + " dequeuedInputs=" + m67978r() + " dequeuedOutputs=" + m67979s());
        if (this.ownsCodecStop) {
            this.codec.stop();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Encoder(@NotNull Codecs codecs, @NotNull TrackType type) {
        this(codecs.m67866d().mo67873M(type).getFirst(), codecs.m67866d().mo67873M(type).getSecond(), codecs.m67867e().mo67873M(type).booleanValue(), codecs.m67868f().mo67873M(type).booleanValue());
        Intrinsics.checkNotNullParameter(codecs, "codecs");
        Intrinsics.checkNotNullParameter(type, "type");
    }
}
