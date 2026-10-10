package u90;

import aa0.InterfaceC0214b;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.otaliastudios.transcoder.common.TrackType;
import java.io.IOException;

/* JADX INFO: renamed from: u90.b */
/* JADX INFO: compiled from: MediaFormatProvider.java */
/* JADX INFO: loaded from: classes59.dex */
public class C45142b {

    /* JADX INFO: renamed from: u90.b$a */
    /* JADX INFO: compiled from: MediaFormatProvider.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f101587a;

        static {
            int[] iArr = new int[TrackType.values().length];
            f101587a = iArr;
            try {
                iArr[TrackType.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f101587a[TrackType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final MediaFormat m99777c(@NonNull MediaCodec mediaCodec, @NonNull C45141a c45141a, @NonNull MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
        if (iDequeueOutputBuffer == -3) {
            c45141a.m99774c();
            return m99777c(mediaCodec, c45141a, bufferInfo);
        }
        if (iDequeueOutputBuffer == -2) {
            return mediaCodec.getOutputFormat();
        }
        if (iDequeueOutputBuffer != -1) {
            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m99779e(@NonNull TrackType trackType, @NonNull MediaFormat mediaFormat) {
        if (trackType == TrackType.VIDEO && !mediaFormat.containsKey("frame-rate")) {
            mediaFormat.setInteger("frame-rate", 24);
        }
        int i11 = a.f101587a[trackType.ordinal()];
        if (i11 == 1) {
            return m99780f(mediaFormat);
        }
        if (i11 == 2) {
            return m99781g(mediaFormat);
        }
        throw new RuntimeException("Unexpected type: " + trackType);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public final MediaFormat m99775a(@NonNull InterfaceC0214b interfaceC0214b, @NonNull TrackType trackType, @NonNull MediaFormat mediaFormat) {
        interfaceC0214b.mo792e(trackType);
        try {
            MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(mediaFormat.getString("mime"));
            mediaCodecCreateDecoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
            mediaCodecCreateDecoderByType.start();
            C45141a c45141a = new C45141a(mediaCodecCreateDecoderByType);
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            InterfaceC0214b.a aVar = new InterfaceC0214b.a();
            MediaFormat mediaFormatM99776b = null;
            while (mediaFormatM99776b == null) {
                mediaFormatM99776b = m99776b(trackType, interfaceC0214b, aVar, mediaCodecCreateDecoderByType, c45141a, bufferInfo);
            }
            interfaceC0214b.mo794g();
            interfaceC0214b.initialize();
            return mediaFormatM99776b;
        } catch (IOException e11) {
            throw new RuntimeException("Can't decode this track", e11);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final MediaFormat m99776b(@NonNull TrackType trackType, @NonNull InterfaceC0214b interfaceC0214b, @NonNull InterfaceC0214b.a aVar, @NonNull MediaCodec mediaCodec, @NonNull C45141a c45141a, @NonNull MediaCodec.BufferInfo bufferInfo) {
        MediaFormat mediaFormatM99777c = m99777c(mediaCodec, c45141a, bufferInfo);
        if (mediaFormatM99777c != null) {
            return mediaFormatM99777c;
        }
        m99778d(trackType, interfaceC0214b, aVar, mediaCodec, c45141a);
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m99778d(@NonNull TrackType trackType, @NonNull InterfaceC0214b interfaceC0214b, @NonNull InterfaceC0214b.a aVar, @NonNull MediaCodec mediaCodec, @NonNull C45141a c45141a) {
        if (interfaceC0214b.mo788a(trackType)) {
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            if (iDequeueInputBuffer < 0) {
                return;
            }
            aVar.f630a = c45141a.m99772a(iDequeueInputBuffer);
            interfaceC0214b.mo793f(aVar);
            mediaCodec.queueInputBuffer(iDequeueInputBuffer, aVar.f630a.position(), aVar.f630a.remaining(), aVar.f632c, aVar.f631b ? 1 : 0);
            return;
        }
        throw new RuntimeException("This should never happen!");
    }

    /* JADX INFO: renamed from: f */
    public final boolean m99780f(@NonNull MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("mime") && mediaFormat.containsKey("channel-count") && mediaFormat.containsKey("sample-rate")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m99781g(@NonNull MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("mime") && mediaFormat.containsKey("height") && mediaFormat.containsKey("width") && mediaFormat.containsKey("frame-rate")) {
            return true;
        }
        return false;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public MediaFormat m99782h(@NonNull InterfaceC0214b interfaceC0214b, @NonNull TrackType trackType, @NonNull MediaFormat mediaFormat) {
        if (m99779e(trackType, mediaFormat)) {
            return mediaFormat;
        }
        MediaFormat mediaFormatM99775a = m99775a(interfaceC0214b, trackType, mediaFormat);
        if (!m99779e(trackType, mediaFormatM99775a)) {
            String str = "Could not get a complete format! hasMimeType:" + mediaFormatM99775a.containsKey("mime");
            if (trackType != TrackType.VIDEO) {
                if (trackType == TrackType.AUDIO) {
                    str = (str + " hasChannels:" + mediaFormatM99775a.containsKey("channel-count")) + " hasSampleRate:" + mediaFormatM99775a.containsKey("sample-rate");
                }
            } else {
                str = ((str + " hasWidth:" + mediaFormatM99775a.containsKey("width")) + " hasHeight:" + mediaFormatM99775a.containsKey("height")) + " hasFrameRate:" + mediaFormatM99775a.containsKey("frame-rate");
            }
            throw new RuntimeException(str);
        }
        return mediaFormatM99775a;
    }
}
