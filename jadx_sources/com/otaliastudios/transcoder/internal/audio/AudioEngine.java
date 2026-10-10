package com.otaliastudios.transcoder.internal.audio;

import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.exoplayer.upstream.CmcdData;
import ca0.InterfaceC4920a;
import com.appsflyer.AppsFlyerProperties;
import com.otaliastudios.transcoder.internal.audio.remix.AudioRemixer;
import com.otaliastudios.transcoder.internal.codec.C27346b;
import com.otaliastudios.transcoder.internal.codec.C27349e;
import com.otaliastudios.transcoder.internal.codec.EncoderData;
import com.otaliastudios.transcoder.internal.codec.InterfaceC27345a;
import com.otaliastudios.transcoder.internal.codec.InterfaceC27350f;
import com.otaliastudios.transcoder.internal.pipeline.AbstractC27359e;
import com.otaliastudios.transcoder.internal.pipeline.AbstractC27360f;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import w90.C45770i;
import x90.InterfaceC46104a;

/* JADX INFO: compiled from: AudioEngine.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000 =2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0003:\u0001>B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010!R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010:\u001a\u000207*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0018\u0010<\u001a\u000207*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u00109¨\u0006?"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;", "Lcom/otaliastudios/transcoder/internal/pipeline/e;", "Lcom/otaliastudios/transcoder/internal/codec/b;", "Lcom/otaliastudios/transcoder/internal/codec/a;", "Lcom/otaliastudios/transcoder/internal/codec/EncoderData;", "Lcom/otaliastudios/transcoder/internal/codec/f;", "Lca0/a;", "stretcher", "Lx90/a;", "resampler", "Landroid/media/MediaFormat;", "targetFormat", "<init>", "(Lca0/a;Lx90/a;Landroid/media/MediaFormat;)V", "sourceFormat", "Landroid/view/Surface;", "e", "(Landroid/media/MediaFormat;)Landroid/view/Surface;", "rawFormat", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/media/MediaFormat;)V", "data", CmcdData.Factory.STREAMING_FORMAT_SS, "(Lcom/otaliastudios/transcoder/internal/codec/b;)V", "r", "Lcom/otaliastudios/transcoder/internal/pipeline/f;", "g", "()Lcom/otaliastudios/transcoder/internal/pipeline/f;", "c", "Lca0/a;", "d", "Lx90/a;", "Landroid/media/MediaFormat;", "Lw90/i;", "f", "Lw90/i;", "log", "Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;", "t", "()Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;", AppsFlyerProperties.CHANNEL, "Lcom/otaliastudios/transcoder/internal/audio/c;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/otaliastudios/transcoder/internal/audio/c;", "buffers", "i", "Lcom/otaliastudios/transcoder/internal/audio/a;", "j", "Lcom/otaliastudios/transcoder/internal/audio/a;", "chunks", "Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer;", "k", "Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer;", "remixer", "", "v", "(Landroid/media/MediaFormat;)I", "sampleRate", "u", "channels", CmcdData.Factory.STREAM_TYPE_LIVE, "Companion", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class AudioEngine extends AbstractC27359e<C27346b, InterfaceC27345a, EncoderData, InterfaceC27350f> implements InterfaceC27345a {

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final AtomicInteger f55632m = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4920a stretcher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC46104a resampler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final MediaFormat targetFormat;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C45770i log;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final AudioEngine channel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final C27338c buffers;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public MediaFormat rawFormat;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public C27336a chunks;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public AudioRemixer remixer;

    @Override // com.otaliastudios.transcoder.internal.pipeline.AbstractC27359e
    @NotNull
    /* JADX INFO: renamed from: g */
    public AbstractC27360f<EncoderData> mo67920g() {
        C27336a c27336a = this.chunks;
        C27336a c27336a2 = null;
        if (c27336a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chunks");
            c27336a = null;
        }
        if (c27336a.m67938d()) {
            this.log.m101066c("drain(): no chunks, waiting...");
            return AbstractC27360f.d.f55760a;
        }
        Pair<ByteBuffer, Integer> pairBuffer = ((InterfaceC27350f) m68050f()).buffer();
        if (pairBuffer == null) {
            this.log.m101066c("drain(): no next buffer, waiting...");
            return AbstractC27360f.d.f55760a;
        }
        final ByteBuffer byteBufferComponent1 = pairBuffer.component1();
        final int iIntValue = pairBuffer.component2().intValue();
        final ShortBuffer shortBufferAsShortBuffer = byteBufferComponent1.asShortBuffer();
        C27336a c27336a3 = this.chunks;
        if (c27336a3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chunks");
        } else {
            c27336a2 = c27336a3;
        }
        return (AbstractC27360f) c27336a2.m67935a(new AbstractC27360f.a(new EncoderData(byteBufferComponent1, iIntValue, 0L)), new Function3<ShortBuffer, Long, Double, AbstractC27360f.b<EncoderData>>() { // from class: com.otaliastudios.transcoder.internal.audio.AudioEngine$drain$2
            @Override // p852kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ AbstractC27360f.b<EncoderData> invoke(ShortBuffer shortBuffer, Long l11, Double d11) {
                return invoke(shortBuffer, l11.longValue(), d11.doubleValue());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @NotNull
            public final AbstractC27360f.b<EncoderData> invoke(@NotNull ShortBuffer inBuffer, long j11, double d11) {
                Intrinsics.checkNotNullParameter(inBuffer, "inBuffer");
                int iRemaining = shortBufferAsShortBuffer.remaining();
                int iRemaining2 = inBuffer.remaining();
                double d12 = iRemaining2;
                double dCeil = Math.ceil(d12 * d11);
                AudioRemixer audioRemixer = this.remixer;
                MediaFormat mediaFormat = null;
                if (audioRemixer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("remixer");
                    audioRemixer = null;
                }
                double dMo67944a = audioRemixer.mo67944a((int) dCeil);
                AudioEngine audioEngine = this;
                double dM67927v = dMo67944a * ((double) audioEngine.m67927v(audioEngine.targetFormat));
                AudioEngine audioEngine2 = this;
                MediaFormat mediaFormat2 = audioEngine2.rawFormat;
                if (mediaFormat2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rawFormat");
                    mediaFormat2 = null;
                }
                double dCeil2 = Math.ceil(dM67927v / ((double) audioEngine2.m67927v(mediaFormat2)));
                double d13 = iRemaining;
                if (dCeil2 > d13) {
                    iRemaining2 = (int) Math.floor(d13 / (dCeil2 / d12));
                }
                inBuffer.limit(inBuffer.position() + iRemaining2);
                int iCeil = (int) Math.ceil(((double) iRemaining2) * d11);
                ShortBuffer shortBufferM67943a = this.buffers.m67943a("stretch", iCeil);
                InterfaceC4920a interfaceC4920a = this.stretcher;
                AudioEngine audioEngine3 = this;
                MediaFormat mediaFormat3 = audioEngine3.rawFormat;
                if (mediaFormat3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rawFormat");
                    mediaFormat3 = null;
                }
                interfaceC4920a.mo5145a(inBuffer, shortBufferM67943a, audioEngine3.m67926u(mediaFormat3));
                shortBufferM67943a.flip();
                AudioRemixer audioRemixer2 = this.remixer;
                if (audioRemixer2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("remixer");
                    audioRemixer2 = null;
                }
                ShortBuffer shortBufferM67943a2 = this.buffers.m67943a("remix", audioRemixer2.mo67944a(iCeil));
                AudioRemixer audioRemixer3 = this.remixer;
                if (audioRemixer3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("remixer");
                    audioRemixer3 = null;
                }
                audioRemixer3.mo67945b(shortBufferM67943a, shortBufferM67943a2);
                shortBufferM67943a2.flip();
                InterfaceC46104a interfaceC46104a = this.resampler;
                AudioEngine audioEngine4 = this;
                MediaFormat mediaFormat4 = audioEngine4.rawFormat;
                if (mediaFormat4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rawFormat");
                } else {
                    mediaFormat = mediaFormat4;
                }
                int iM67927v = audioEngine4.m67927v(mediaFormat);
                ShortBuffer shortBuffer = shortBufferAsShortBuffer;
                AudioEngine audioEngine5 = this;
                int iM67927v2 = audioEngine5.m67927v(audioEngine5.targetFormat);
                AudioEngine audioEngine6 = this;
                interfaceC46104a.mo101606a(shortBufferM67943a2, iM67927v, shortBuffer, iM67927v2, audioEngine6.m67926u(audioEngine6.targetFormat));
                shortBufferAsShortBuffer.flip();
                byteBufferComponent1.clear();
                byteBufferComponent1.limit(shortBufferAsShortBuffer.limit() * 2);
                byteBufferComponent1.position(shortBufferAsShortBuffer.position() * 2);
                return new AbstractC27360f.b<>(new EncoderData(byteBufferComponent1, iIntValue, j11));
            }
        });
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.AbstractC27359e
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo67921h(@NotNull final C27346b data) {
        C27336a c27336a;
        Intrinsics.checkNotNullParameter(data, "data");
        C27349e c27349e = data instanceof C27349e ? (C27349e) data : null;
        double timeStretch = c27349e == null ? 1.0d : c27349e.getTimeStretch();
        C27336a c27336a2 = this.chunks;
        if (c27336a2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chunks");
            c27336a = null;
        } else {
            c27336a = c27336a2;
        }
        ShortBuffer shortBufferAsShortBuffer = data.getBuffer().asShortBuffer();
        Intrinsics.checkNotNullExpressionValue(shortBufferAsShortBuffer, "data.buffer.asShortBuffer()");
        c27336a.m67936b(shortBufferAsShortBuffer, data.getTimeUs(), timeStretch, new Function0<Unit>() { // from class: com.otaliastudios.transcoder.internal.audio.AudioEngine$enqueue$1
            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                data.m67991b().invoke(Boolean.FALSE);
            }
        });
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.AbstractC27359e
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo67922i(@NotNull C27346b data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.log.m101066c("enqueueEos()");
        data.m67991b().invoke(Boolean.FALSE);
        C27336a c27336a = this.chunks;
        if (c27336a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chunks");
            c27336a = null;
        }
        c27336a.m67937c();
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public AudioEngine getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: u */
    public final int m67926u(MediaFormat mediaFormat) {
        return mediaFormat.getInteger("channel-count");
    }

    public AudioEngine(@NotNull InterfaceC4920a stretcher, @NotNull InterfaceC46104a resampler, @NotNull MediaFormat targetFormat) {
        Intrinsics.checkNotNullParameter(stretcher, "stretcher");
        Intrinsics.checkNotNullParameter(resampler, "resampler");
        Intrinsics.checkNotNullParameter(targetFormat, "targetFormat");
        this.stretcher = stretcher;
        this.resampler = resampler;
        this.targetFormat = targetFormat;
        this.log = new C45770i("AudioEngine(" + f55632m.getAndIncrement() + ')');
        this.channel = this;
        this.buffers = new C27338c();
    }

    @Override // com.otaliastudios.transcoder.internal.codec.InterfaceC27345a
    /* JADX INFO: renamed from: a */
    public void mo67918a(@NotNull MediaFormat rawFormat) {
        Intrinsics.checkNotNullParameter(rawFormat, "rawFormat");
        this.log.m101066c("handleRawFormat(" + rawFormat + ')');
        this.rawFormat = rawFormat;
        this.remixer = AudioRemixer.INSTANCE.get$lib_release(m67926u(rawFormat), m67926u(this.targetFormat));
        this.chunks = new C27336a(m67927v(rawFormat), m67926u(rawFormat));
    }

    @Override // com.otaliastudios.transcoder.internal.codec.InterfaceC27345a
    @Nullable
    /* JADX INFO: renamed from: e */
    public Surface mo67919e(@NotNull MediaFormat sourceFormat) {
        Intrinsics.checkNotNullParameter(sourceFormat, "sourceFormat");
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final int m67927v(MediaFormat mediaFormat) {
        return mediaFormat.getInteger("sample-rate");
    }
}
