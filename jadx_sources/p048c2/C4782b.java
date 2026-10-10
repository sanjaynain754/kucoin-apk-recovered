package p048c2;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import p628t1.C44613e;
import p628t1.InterfaceC44615g;
import p680v1.InterfaceC45359j;
import p710w1.InterfaceC45686d;

/* JADX INFO: renamed from: c2.b */
/* JADX INFO: compiled from: BitmapDrawableEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public class C4782b implements InterfaceC44615g<BitmapDrawable> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC45686d f4794a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC44615g<Bitmap> f4795b;

    @Override // p628t1.InterfaceC44615g
    @NonNull
    /* JADX INFO: renamed from: b */
    public EncodeStrategy mo4853b(@NonNull C44613e c44613e) {
        return this.f4795b.mo4853b(c44613e);
    }

    @Override // p628t1.InterfaceC44609a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo4852a(@NonNull InterfaceC45359j<BitmapDrawable> interfaceC45359j, @NonNull File file, @NonNull C44613e c44613e) {
        return this.f4795b.mo4852a((Bitmap) new C4788e(interfaceC45359j.get().getBitmap(), this.f4794a), file, c44613e);
    }

    public C4782b(InterfaceC45686d interfaceC45686d, InterfaceC44615g<Bitmap> interfaceC44615g) {
        this.f4794a = interfaceC45686d;
        this.f4795b = interfaceC44615g;
    }
}
