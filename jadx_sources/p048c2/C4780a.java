package p048c2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.IOException;
import p523p2.C43363j;
import p628t1.C44613e;
import p628t1.InterfaceC44614f;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: c2.a */
/* JADX INFO: compiled from: BitmapDrawableDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class C4780a<DataType> implements InterfaceC44614f<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC44614f<DataType, Bitmap> f4790a;

    /* JADX INFO: renamed from: b */
    public final Resources f4791b;

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: a */
    public InterfaceC45359j<BitmapDrawable> mo4261a(@NonNull DataType datatype, int i11, int i12, @NonNull C44613e c44613e) throws IOException {
        return C4807x.m4910c(this.f4791b, this.f4790a.mo4261a(datatype, i11, i12, c44613e));
    }

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: b */
    public boolean mo4262b(@NonNull DataType datatype, @NonNull C44613e c44613e) throws IOException {
        return this.f4790a.mo4262b(datatype, c44613e);
    }

    public C4780a(@NonNull Resources resources, @NonNull InterfaceC44614f<DataType, Bitmap> interfaceC44614f) {
        this.f4791b = (Resources) C43363j.m95506d(resources);
        this.f4790a = (InterfaceC44614f) C43363j.m95506d(interfaceC44614f);
    }
}
