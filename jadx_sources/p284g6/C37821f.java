package p284g6;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import java.io.IOException;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: g6.f */
/* JADX INFO: compiled from: JfifUtil.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, m90084d2 = {"Lg6/f;", "", "<init>", "()V", "", "orientation", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)I", "Ljava/io/InputStream;", "inputStream", "b", "(Ljava/io/InputStream;)I", "markerToFind", "", "e", "(Ljava/io/InputStream;I)Z", "marker", "c", "(I)Z", "d", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C37821f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37821f f85197a = new C37821f();

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final int m85351b(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        try {
            int iM85354d = f85197a.m85354d(inputStream);
            if (iM85354d == 0) {
                return 0;
            }
            return C37823h.m85357d(inputStream, iM85354d);
        } catch (IOException unused) {
            return 0;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m85352e(@NotNull InputStream inputStream, int markerToFind) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        while (C37822g.m85355a(inputStream, 1, false) == 255) {
            int iM85355a = 255;
            while (iM85355a == 255) {
                iM85355a = C37822g.m85355a(inputStream, 1, false);
            }
            if ((markerToFind == 192 && f85197a.m85353c(iM85355a)) || iM85355a == markerToFind) {
                return true;
            }
            if (iM85355a != 1 && iM85355a != 216) {
                if (iM85355a == 217 || iM85355a == 218) {
                    break;
                }
                inputStream.skip(C37822g.m85355a(inputStream, 2, false) - 2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final int m85354d(InputStream inputStream) throws IOException {
        if (m85352e(inputStream, 225)) {
            int iM85355a = C37822g.m85355a(inputStream, 2, false);
            if (iM85355a - 2 > 6) {
                int iM85355a2 = C37822g.m85355a(inputStream, 4, false);
                int iM85355a3 = C37822g.m85355a(inputStream, 2, false);
                int i11 = iM85355a - 8;
                if (iM85355a2 == 1165519206 && iM85355a3 == 0) {
                    return i11;
                }
            }
        }
        return 0;
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m85350a(int orientation) {
        return C37823h.m85356a(orientation);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m85353c(int marker) {
        switch (marker) {
            case 192:
            case 193:
            case TPCodecParamers.TP_PROFILE_MJPEG_HUFFMAN_PROGRESSIVE_DCT /* 194 */:
            case TPCodecParamers.TP_PROFILE_MJPEG_HUFFMAN_LOSSLESS /* 195 */:
            case 197:
            case 198:
            case 199:
            case 201:
            case 202:
            case 203:
            case 205:
            case 206:
            case 207:
                return true;
            case 196:
            case 200:
            case 204:
            default:
                return false;
        }
    }
}
