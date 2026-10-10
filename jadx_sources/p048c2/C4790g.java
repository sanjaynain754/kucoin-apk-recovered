package p048c2;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.C5368a;
import java.io.IOException;
import java.nio.ByteBuffer;
import p523p2.C43354a;
import p628t1.C44613e;
import p628t1.InterfaceC44614f;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: c2.g */
/* JADX INFO: compiled from: ByteBufferBitmapDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class C4790g implements InterfaceC44614f<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final C5368a f4809a;

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo4262b(@NonNull ByteBuffer byteBuffer, @NonNull C44613e c44613e) {
        return this.f4809a.m6892q(byteBuffer);
    }

    public C4790g(C5368a c5368a) {
        this.f4809a = c5368a;
    }

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC45359j<Bitmap> mo4261a(@NonNull ByteBuffer byteBuffer, int i11, int i12, @NonNull C44613e c44613e) throws IOException {
        return this.f4809a.m6887f(C43354a.m95481f(byteBuffer), i11, i12, c44613e);
    }
}
