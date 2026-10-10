package com.otaliastudios.transcoder.internal.codec;

import aa0.InterfaceC0214b;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.otaliastudios.transcoder.internal.pipeline.AbstractC27359e;
import com.otaliastudios.transcoder.internal.pipeline.AbstractC27360f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.IOException;
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
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.MutablePropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.properties.Delegates;
import p852kotlin.properties.ObservableProperty;
import p852kotlin.properties.ReadWriteProperty;
import p852kotlin.reflect.KProperty;
import r90.C43960c;
import t90.InterfaceC44714b;
import t90.ReaderData;
import u90.C45141a;
import w90.C45770i;
import w90.C45774m;
import w90.InterfaceC45773l;

/* JADX INFO: compiled from: Decoder.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 G2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0003:\u0001HB\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010)\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010/\u001a\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R+\u0010B\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR+\u0010F\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010A¨\u0006I"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/codec/Decoder;", "Lcom/otaliastudios/transcoder/internal/pipeline/e;", "Lt90/c;", "Lt90/b;", "Lcom/otaliastudios/transcoder/internal/codec/b;", "Lcom/otaliastudios/transcoder/internal/codec/a;", "Landroid/media/MediaFormat;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "continuous", "<init>", "(Landroid/media/MediaFormat;Z)V", "next", "", "t", "(Lcom/otaliastudios/transcoder/internal/codec/a;)V", "Lkotlin/Pair;", "Ljava/nio/ByteBuffer;", "", "buffer", "()Lkotlin/Pair;", "data", "o", "(Lt90/c;)V", "n", "Lcom/otaliastudios/transcoder/internal/pipeline/f;", "g", "()Lcom/otaliastudios/transcoder/internal/pipeline/f;", "release", "()V", "u", "c", "Landroid/media/MediaFormat;", "Lw90/i;", "d", "Lw90/i;", "log", "e", "Lcom/otaliastudios/transcoder/internal/codec/Decoder;", "q", "()Lcom/otaliastudios/transcoder/internal/codec/Decoder;", AppsFlyerProperties.CHANNEL, "Landroid/media/MediaCodec;", "f", "Landroid/media/MediaCodec;", "codec", "Lu90/a;", "Lkotlin/Lazy;", "p", "()Lu90/a;", "buffers", "Landroid/media/MediaCodec$BufferInfo;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Landroid/media/MediaCodec$BufferInfo;", "info", "Lcom/otaliastudios/transcoder/internal/codec/c;", "i", "Lcom/otaliastudios/transcoder/internal/codec/c;", "dropper", "<set-?>", "j", "Lkotlin/properties/ReadWriteProperty;", "r", "()I", "v", "(I)V", "dequeuedInputs", "k", CmcdData.Factory.STREAMING_FORMAT_SS, "w", "dequeuedOutputs", CmcdData.Factory.STREAM_TYPE_LIVE, "Companion", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class Decoder extends AbstractC27359e<ReaderData, InterfaceC44714b, C27346b, InterfaceC27345a> implements InterfaceC44714b {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final MediaFormat format;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C45770i log;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Decoder channel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final MediaCodec codec;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Lazy buffers;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public MediaCodec.BufferInfo info;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final C27347c dropper;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final ReadWriteProperty dequeuedInputs;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final ReadWriteProperty dequeuedOutputs;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ KProperty<Object>[] f55667m = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Decoder.class, "dequeuedInputs", "getDequeuedInputs()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Decoder.class, "dequeuedOutputs", "getDequeuedOutputs()I", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final InterfaceC45773l<AtomicInteger> f55668n = C45774m.m101098c(new AtomicInteger(0), new AtomicInteger(0));

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.codec.Decoder$a */
    /* JADX INFO: compiled from: Delegates.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, m90085k = 1, m90086mv = {1, 5, 1})
    public static final class C27341a extends ObservableProperty<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f55678a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Decoder f55679b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27341a(Object obj, Object obj2, Decoder decoder) {
            super(obj2);
            this.f55678a = obj;
            this.f55679b = decoder;
        }

        @Override // p852kotlin.properties.ObservableProperty
        public void afterChange(@NotNull KProperty<?> property, Integer oldValue, Integer newValue) {
            Intrinsics.checkNotNullParameter(property, "property");
            newValue.intValue();
            oldValue.intValue();
            this.f55679b.m67970u();
        }
    }

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.codec.Decoder$b */
    /* JADX INFO: compiled from: Delegates.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, m90085k = 1, m90086mv = {1, 5, 1})
    public static final class C27342b extends ObservableProperty<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f55680a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Decoder f55681b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27342b(Object obj, Object obj2, Decoder decoder) {
            super(obj2);
            this.f55680a = obj;
            this.f55681b = decoder;
        }

        @Override // p852kotlin.properties.ObservableProperty
        public void afterChange(@NotNull KProperty<?> property, Integer oldValue, Integer newValue) {
            Intrinsics.checkNotNullParameter(property, "property");
            newValue.intValue();
            oldValue.intValue();
            this.f55681b.m67970u();
        }
    }

    public Decoder(@NotNull MediaFormat format, boolean z11) throws IOException {
        Intrinsics.checkNotNullParameter(format, "format");
        this.format = format;
        this.log = new C45770i("Decoder(" + C43960c.m96908a(format) + ',' + f55668n.mo67873M(C43960c.m96908a(format)).getAndIncrement() + ')');
        this.channel = this;
        String string = format.getString("mime");
        Intrinsics.checkNotNull(string);
        MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string);
        Intrinsics.checkNotNullExpressionValue(mediaCodecCreateDecoderByType, "createDecoderByType(form…(MediaFormat.KEY_MIME)!!)");
        this.codec = mediaCodecCreateDecoderByType;
        this.buffers = LazyKt.lazy(new Function0<C45141a>() { // from class: com.otaliastudios.transcoder.internal.codec.Decoder$buffers$2
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
        this.dropper = new C27347c(z11);
        Delegates delegates = Delegates.INSTANCE;
        this.dequeuedInputs = new C27341a(0, 0, this);
        this.dequeuedOutputs = new C27342b(0, 0, this);
    }

    @Override // t90.InterfaceC44714b
    @Nullable
    public Pair<ByteBuffer, Integer> buffer() {
        int iDequeueInputBuffer = this.codec.dequeueInputBuffer(0L);
        if (iDequeueInputBuffer >= 0) {
            m67971v(m67967r() + 1);
            return TuplesKt.m90091to(m67965p().m99772a(iDequeueInputBuffer), Integer.valueOf(iDequeueInputBuffer));
        }
        this.log.m101066c("buffer() failed. dequeuedInputs=" + m67967r() + " dequeuedOutputs=" + m67968s());
        return null;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.AbstractC27359e
    @NotNull
    /* JADX INFO: renamed from: g */
    public AbstractC27360f<C27346b> mo67920g() {
        AbstractC27360f<C27346b> aVar;
        final int iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(this.info, 0L);
        if (iDequeueOutputBuffer == -3) {
            this.log.m101066c("drain(): got INFO_OUTPUT_BUFFERS_CHANGED, retrying.");
            m67965p().m99774c();
            return AbstractC27360f.c.f55759a;
        }
        if (iDequeueOutputBuffer == -2) {
            this.log.m101066c(Intrinsics.stringPlus("drain(): got INFO_OUTPUT_FORMAT_CHANGED, handling format and retrying. format=", this.codec.getOutputFormat()));
            InterfaceC27345a interfaceC27345a = (InterfaceC27345a) m68050f();
            MediaFormat outputFormat = this.codec.getOutputFormat();
            Intrinsics.checkNotNullExpressionValue(outputFormat, "codec.outputFormat");
            interfaceC27345a.mo67918a(outputFormat);
            return AbstractC27360f.c.f55759a;
        }
        if (iDequeueOutputBuffer == -1) {
            this.log.m101066c("drain(): got INFO_TRY_AGAIN_LATER, waiting.");
            return AbstractC27360f.d.f55760a;
        }
        MediaCodec.BufferInfo bufferInfo = this.info;
        boolean z11 = (bufferInfo.flags & 4) != 0;
        Long lM67996d = z11 ? 0L : this.dropper.m67996d(bufferInfo.presentationTimeUs);
        if (lM67996d != null) {
            m67972w(m67968s() + 1);
            ByteBuffer byteBufferM99773b = m67965p().m99773b(iDequeueOutputBuffer);
            Intrinsics.checkNotNullExpressionValue(byteBufferM99773b, "buffers.getOutputBuffer(result)");
            C27346b c27346b = new C27346b(byteBufferM99773b, lM67996d.longValue(), new Function1<Boolean, Unit>() { // from class: com.otaliastudios.transcoder.internal.codec.Decoder$drain$data$1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(boolean z12) {
                    this.this$0.codec.releaseOutputBuffer(iDequeueOutputBuffer, z12);
                    Decoder decoder = this.this$0;
                    decoder.m67972w(decoder.m67968s() - 1);
                }
            });
            aVar = z11 ? new AbstractC27360f.a<>(c27346b) : new AbstractC27360f.b<>(c27346b);
        } else {
            this.codec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            aVar = AbstractC27360f.d.f55760a;
        }
        this.log.m101070h(Intrinsics.stringPlus("drain(): returning ", aVar));
        return aVar;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.AbstractC27359e
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo67921h(@NotNull ReaderData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        m67971v(m67967r() - 1);
        InterfaceC0214b.a chunk = data.getChunk();
        this.codec.queueInputBuffer(data.getId(), chunk.f630a.position(), chunk.f630a.remaining(), chunk.f632c, chunk.f631b ? 1 : 0);
        this.dropper.m67995c(chunk.f632c, chunk.f633d);
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.AbstractC27359e
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo67922i(@NotNull ReaderData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.log.m101066c("enqueueEos()!");
        m67971v(m67967r() - 1);
        this.codec.queueInputBuffer(data.m98943d(), 0, 0, 0L, 4);
    }

    /* JADX INFO: renamed from: p */
    public final C45141a m67965p() {
        return (C45141a) this.buffers.getValue();
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public Decoder getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: r */
    public final int m67967r() {
        return ((Number) this.dequeuedInputs.getValue(this, f55667m[0])).intValue();
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.AbstractC27355a, com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    public void release() {
        this.log.m101066c("release(): releasing codec. dequeuedInputs=" + m67967r() + " dequeuedOutputs=" + m67968s());
        this.codec.stop();
        this.codec.release();
    }

    /* JADX INFO: renamed from: s */
    public final int m67968s() {
        return ((Number) this.dequeuedOutputs.getValue(this, f55667m[1])).intValue();
    }

    /* JADX INFO: renamed from: v */
    public final void m67971v(int i11) {
        this.dequeuedInputs.setValue(this, f55667m[0], Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: w */
    public final void m67972w(int i11) {
        this.dequeuedOutputs.setValue(this, f55667m[1], Integer.valueOf(i11));
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.AbstractC27355a, com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo67962c(@NotNull InterfaceC27345a next) {
        Intrinsics.checkNotNullParameter(next, "next");
        super.mo67962c(next);
        this.log.m101066c("initialize()");
        this.codec.configure(this.format, next.mo67919e(this.format), (MediaCrypto) null, 0);
        this.codec.start();
    }

    /* JADX INFO: renamed from: u */
    public final void m67970u() {
    }
}
