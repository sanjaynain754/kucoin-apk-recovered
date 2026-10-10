package p048c2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.io.InputStream;
import p523p2.C43354a;
import p628t1.C44613e;
import p628t1.InterfaceC44614f;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: c2.w */
/* JADX INFO: compiled from: InputStreamBitmapImageDecoderResourceDecoder.java */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(api = 28)
public final class C4806w implements InterfaceC44614f<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final C4786d f4829a = new C4786d();

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo4262b(@NonNull InputStream inputStream, @NonNull C44613e c44613e) throws IOException {
        return true;
    }

    @Override // p628t1.InterfaceC44614f
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC45359j<Bitmap> mo4261a(@NonNull InputStream inputStream, int i11, int i12, @NonNull C44613e c44613e) throws IOException {
        return this.f4829a.m4264d(ImageDecoder.createSource(C43354a.m95477b(inputStream)), i11, i12, c44613e);
    }
}
