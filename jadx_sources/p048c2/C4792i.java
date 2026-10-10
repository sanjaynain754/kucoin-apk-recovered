package p048c2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.nio.ByteBuffer;
import p628t1.C44613e;
import p628t1.InterfaceC44614f;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: c2.i */
/* JADX INFO: compiled from: ByteBufferBitmapImageDecoderResourceDecoder.java */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(api = 28)
public final class C4792i implements InterfaceC44614f<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final C4786d f4810a = new C4786d();

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo4262b(@NonNull ByteBuffer byteBuffer, @NonNull C44613e c44613e) throws IOException {
        return true;
    }

    @Override // p628t1.InterfaceC44614f
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC45359j<Bitmap> mo4261a(@NonNull ByteBuffer byteBuffer, int i11, int i12, @NonNull C44613e c44613e) throws IOException {
        return this.f4810a.m4264d(ImageDecoder.createSource(byteBuffer), i11, i12, c44613e);
    }
}
