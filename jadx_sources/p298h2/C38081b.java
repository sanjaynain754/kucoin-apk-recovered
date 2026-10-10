package p298h2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p048c2.C4807x;
import p523p2.C43363j;
import p628t1.C44613e;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: h2.b */
/* JADX INFO: compiled from: BitmapDrawableTranscoder.java */
/* JADX INFO: loaded from: classes.dex */
public class C38081b implements InterfaceC38084e<Bitmap, BitmapDrawable> {

    /* JADX INFO: renamed from: a */
    public final Resources f85727a;

    @Override // p298h2.InterfaceC38084e
    @Nullable
    /* JADX INFO: renamed from: a */
    public InterfaceC45359j<BitmapDrawable> mo85980a(@NonNull InterfaceC45359j<Bitmap> interfaceC45359j, @NonNull C44613e c44613e) {
        return C4807x.m4910c(this.f85727a, interfaceC45359j);
    }

    public C38081b(@NonNull Resources resources) {
        this.f85727a = (Resources) C43363j.m95506d(resources);
    }
}
