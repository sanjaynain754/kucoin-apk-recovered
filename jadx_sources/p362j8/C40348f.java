package p362j8;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.github.penfeizhou.animation.apng.decode.APNGParser;
import com.github.penfeizhou.animation.decode.FrameSeqDecoder;
import com.github.penfeizhou.animation.gif.decode.GifParser;
import com.github.penfeizhou.animation.p065io.C6955d;
import com.github.penfeizhou.animation.webp.decode.WebPParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p194d8.C36641c;
import p628t1.C44613e;
import p628t1.InterfaceC44614f;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: j8.f */
/* JADX INFO: compiled from: StreamAnimationDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class C40348f implements InterfaceC44614f<InputStream, FrameSeqDecoder> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC44614f<ByteBuffer, FrameSeqDecoder> f89620a;

    /* JADX INFO: renamed from: e */
    private static byte[] m88922e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i11 = inputStream.read(bArr);
                if (i11 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo4262b(@NonNull InputStream inputStream, @NonNull C44613e c44613e) {
        if (!((Boolean) c44613e.m98732c(C40343a.f89603b)).booleanValue() && WebPParser.m12803a(new C6955d(inputStream))) {
            return true;
        }
        if (!((Boolean) c44613e.m98732c(C40343a.f89604c)).booleanValue() && APNGParser.m12746a(new C6955d(inputStream))) {
            return true;
        }
        if (((Boolean) c44613e.m98732c(C40343a.f89602a)).booleanValue() || !GifParser.m12792b(new C6955d(inputStream))) {
            return !((Boolean) c44613e.m98732c(C40343a.f89606e)).booleanValue() && C36641c.m81978a(new C6955d(inputStream));
        }
        return true;
    }

    public C40348f(InterfaceC44614f<ByteBuffer, FrameSeqDecoder> interfaceC44614f) {
        this.f89620a = interfaceC44614f;
    }

    @Override // p628t1.InterfaceC44614f
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC45359j<FrameSeqDecoder> mo4261a(@NonNull InputStream inputStream, int i11, int i12, @NonNull C44613e c44613e) throws IOException {
        byte[] bArrM88922e = m88922e(inputStream);
        if (bArrM88922e == null) {
            return null;
        }
        return this.f89620a.mo4261a(ByteBuffer.wrap(bArrM88922e), i11, i12, c44613e);
    }
}
