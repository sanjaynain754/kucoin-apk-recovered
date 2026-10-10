package p284g6;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.jumio.core.constants.ConstantsKt;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.UShort;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: g6.i */
/* JADX INFO: compiled from: WebpUtil.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\tJ%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\tJ#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u000bJ\u0013\u0010\u001b\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lg6/i;", "", "<init>", "()V", "Ljava/io/InputStream;", "stream", "Lkotlin/Pair;", "", "f", "(Ljava/io/InputStream;)Lkotlin/Pair;", "b", "(Ljava/io/InputStream;)I", "g", CmcdData.Factory.STREAMING_FORMAT_HLS, "i", "", "what", "", "with", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "([BLjava/lang/String;)Z", "header", "c", "([B)Ljava/lang/String;", "d", "j", "e", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWebpUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebpUtil.kt\ncom/facebook/imageutils/WebpUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n2632#2,3:183\n*S KotlinDebug\n*F\n+ 1 WebpUtil.kt\ncom/facebook/imageutils/WebpUtil\n*L\n144#1:183,3\n*E\n"})
public final class C37824i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37824i f85204a = new C37824i();

    /* JADX INFO: renamed from: a */
    public final boolean m85369a(byte[] what, String with) {
        if (what.length != with.length()) {
            return false;
        }
        Iterable indices = ArraysKt.getIndices(what);
        if ((indices instanceof Collection) && ((Collection) indices).isEmpty()) {
            return true;
        }
        Iterator it = indices.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            if (((byte) with.charAt(iNextInt)) != what[iNextInt]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final String m85370c(byte[] header) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b11 : header) {
            sb2.append((char) (UShort.m104125constructorimpl(b11) & UShort.MAX_VALUE));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: g */
    public final Pair<Integer, Integer> m85373g(InputStream stream) throws IOException {
        stream.skip(7L);
        int iM85372e = m85372e(stream);
        int iM85372e2 = m85372e(stream);
        int iM85372e3 = m85372e(stream);
        if (iM85372e == 157 && iM85372e2 == 1 && iM85372e3 == 42) {
            return new Pair<>(Integer.valueOf(m85367b(stream)), Integer.valueOf(m85367b(stream)));
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final Pair<Integer, Integer> m85375i(InputStream stream) throws IOException {
        stream.skip(8L);
        return new Pair<>(Integer.valueOf(m85376j(stream) + 1), Integer.valueOf(m85376j(stream) + 1));
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final int m85367b(@NotNull InputStream stream) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        C37824i c37824i = f85204a;
        return (c37824i.m85372e(stream) << 8) | c37824i.m85372e(stream);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final Pair<Integer, Integer> m85368f(@NotNull InputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        byte[] bArr = new byte[4];
        try {
            try {
                try {
                    stream.read(bArr);
                    C37824i c37824i = f85204a;
                    if (!c37824i.m85369a(bArr, "RIFF")) {
                        try {
                            stream.close();
                            return null;
                        } catch (IOException e11) {
                            e11.printStackTrace();
                            return null;
                        }
                    }
                    c37824i.m85371d(stream);
                    stream.read(bArr);
                    if (!c37824i.m85369a(bArr, ConstantsKt.FILE_TYPE_WEBP)) {
                        try {
                            stream.close();
                            return null;
                        } catch (IOException e12) {
                            e12.printStackTrace();
                            return null;
                        }
                    }
                    stream.read(bArr);
                    String strM85370c = c37824i.m85370c(bArr);
                    int iHashCode = strM85370c.hashCode();
                    if (iHashCode != 2640674) {
                        if (iHashCode != 2640718) {
                            if (iHashCode == 2640730 && strM85370c.equals("VP8X")) {
                                Pair<Integer, Integer> pairM85375i = c37824i.m85375i(stream);
                                try {
                                    stream.close();
                                    return pairM85375i;
                                } catch (IOException e13) {
                                    e13.printStackTrace();
                                    return pairM85375i;
                                }
                            }
                        } else if (strM85370c.equals("VP8L")) {
                            Pair<Integer, Integer> pairM85374h = c37824i.m85374h(stream);
                            try {
                                stream.close();
                                return pairM85374h;
                            } catch (IOException e14) {
                                e14.printStackTrace();
                                return pairM85374h;
                            }
                        }
                    } else if (strM85370c.equals("VP8 ")) {
                        Pair<Integer, Integer> pairM85373g = c37824i.m85373g(stream);
                        try {
                            stream.close();
                            return pairM85373g;
                        } catch (IOException e15) {
                            e15.printStackTrace();
                            return pairM85373g;
                        }
                    }
                    stream.close();
                    return null;
                } catch (IOException e16) {
                    e16.printStackTrace();
                    stream.close();
                }
            } catch (IOException e17) {
                e17.printStackTrace();
            }
        } catch (Throwable th2) {
            try {
                stream.close();
            } catch (IOException e18) {
                e18.printStackTrace();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m85371d(InputStream stream) throws IOException {
        int iM85372e = m85372e(stream);
        int iM85372e2 = m85372e(stream);
        return (m85372e(stream) << 24) | (m85372e(stream) << 16) | (iM85372e2 << 8) | iM85372e;
    }

    /* JADX INFO: renamed from: e */
    public final int m85372e(InputStream inputStream) throws IOException {
        return inputStream.read() & 255;
    }

    /* JADX INFO: renamed from: h */
    public final Pair<Integer, Integer> m85374h(InputStream stream) throws IOException {
        m85371d(stream);
        if (m85372e(stream) != 47) {
            return null;
        }
        int i11 = stream.read() & 255;
        int i12 = stream.read();
        return new Pair<>(Integer.valueOf((i11 | ((i12 & 63) << 8)) + 1), Integer.valueOf((((stream.read() & 15) << 10) | ((stream.read() & 255) << 2) | ((i12 & 192) >> 6)) + 1));
    }

    /* JADX INFO: renamed from: j */
    public final int m85376j(InputStream stream) throws IOException {
        return (m85372e(stream) << 16) | (m85372e(stream) << 8) | m85372e(stream);
    }
}
