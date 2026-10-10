package p298h2;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import p188d2.C36595b;
import p628t1.C44613e;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: h2.a */
/* JADX INFO: compiled from: BitmapBytesTranscoder.java */
/* JADX INFO: loaded from: classes.dex */
public class C38080a implements InterfaceC38084e<Bitmap, byte[]> {

    /* JADX INFO: renamed from: a */
    public final Bitmap.CompressFormat f85725a;

    /* JADX INFO: renamed from: b */
    public final int f85726b;

    public C38080a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public C38080a(@NonNull Bitmap.CompressFormat compressFormat, int i11) {
        this.f85725a = compressFormat;
        this.f85726b = i11;
    }

    @Override // p298h2.InterfaceC38084e
    @Nullable
    /* JADX INFO: renamed from: a */
    public InterfaceC45359j<byte[]> mo85980a(@NonNull InterfaceC45359j<Bitmap> interfaceC45359j, @NonNull C44613e c44613e) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        interfaceC45359j.get().compress(this.f85725a, this.f85726b, byteArrayOutputStream);
        interfaceC45359j.recycle();
        return new C36595b(byteArrayOutputStream.toByteArray());
    }
}
