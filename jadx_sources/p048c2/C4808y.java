package p048c2;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.resource.bitmap.C5368a;
import java.io.IOException;
import p628t1.C44613e;
import p628t1.InterfaceC44614f;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: c2.y */
/* JADX INFO: compiled from: ParcelFileDescriptorBitmapDecoder.java */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class C4808y implements InterfaceC44614f<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final C5368a f4832a;

    @Override // p628t1.InterfaceC44614f
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC45359j<Bitmap> mo4261a(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i11, int i12, @NonNull C44613e c44613e) throws IOException {
        return this.f4832a.m6885d(parcelFileDescriptor, i11, i12, c44613e);
    }

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo4262b(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull C44613e c44613e) {
        return this.f4832a.m6890o(parcelFileDescriptor);
    }

    public C4808y(C5368a c5368a) {
        this.f4832a = c5368a;
    }
}
