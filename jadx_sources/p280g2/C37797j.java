package p280g2;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.C5318a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p628t1.C44613e;
import p628t1.InterfaceC44614f;
import p680v1.InterfaceC45359j;
import p710w1.InterfaceC45684b;

/* JADX INFO: renamed from: g2.j */
/* JADX INFO: compiled from: StreamGifDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class C37797j implements InterfaceC44614f<InputStream, C37790c> {

    /* JADX INFO: renamed from: a */
    public final List<ImageHeaderParser> f85155a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC44614f<ByteBuffer, C37790c> f85156b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC45684b f85157c;

    /* JADX INFO: renamed from: e */
    public static byte[] m85293e(InputStream inputStream) {
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
        } catch (IOException e11) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e11);
            return null;
        }
    }

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo4262b(@NonNull InputStream inputStream, @NonNull C44613e c44613e) throws IOException {
        return !((Boolean) c44613e.m98732c(C37796i.f85154b)).booleanValue() && C5318a.m6654e(this.f85155a, inputStream, this.f85157c) == ImageHeaderParser.ImageType.GIF;
    }

    public C37797j(List<ImageHeaderParser> list, InterfaceC44614f<ByteBuffer, C37790c> interfaceC44614f, InterfaceC45684b interfaceC45684b) {
        this.f85155a = list;
        this.f85156b = interfaceC44614f;
        this.f85157c = interfaceC45684b;
    }

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC45359j<C37790c> mo4261a(@NonNull InputStream inputStream, int i11, int i12, @NonNull C44613e c44613e) throws IOException {
        byte[] bArrM85293e = m85293e(inputStream);
        if (bArrM85293e == null) {
            return null;
        }
        return this.f85156b.mo4261a(ByteBuffer.wrap(bArrM85293e), i11, i12, c44613e);
    }
}
