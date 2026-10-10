package p284g6;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.IOException;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: g6.g */
/* JADX INFO: compiled from: StreamProcessor.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lg6/g;", "", "<init>", "()V", "Ljava/io/InputStream;", "stream", "", "numBytes", "", "isLittleEndian", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/io/InputStream;IZ)I", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C37822g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37822g f85198a = new C37822g();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m85355a(@NotNull InputStream stream, int numBytes, boolean isLittleEndian) throws IOException {
        int i11;
        Intrinsics.checkNotNullParameter(stream, "stream");
        int i12 = 0;
        for (int i13 = 0; i13 < numBytes; i13++) {
            int i14 = stream.read();
            if (i14 != -1) {
                if (isLittleEndian) {
                    i11 = (i14 & 255) << (i13 * 8);
                } else {
                    i12 <<= 8;
                    i11 = i14 & 255;
                }
                i12 |= i11;
            } else {
                throw new IOException("no more bytes");
            }
        }
        return i12;
    }
}
