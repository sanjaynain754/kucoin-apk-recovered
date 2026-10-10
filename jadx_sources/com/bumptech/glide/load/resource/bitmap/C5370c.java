package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import p523p2.C43357d;
import p523p2.C43361h;
import p628t1.C44613e;
import p628t1.InterfaceC44614f;
import p680v1.InterfaceC45359j;
import p710w1.InterfaceC45684b;
import p710w1.InterfaceC45686d;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.c */
/* JADX INFO: compiled from: StreamBitmapDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class C5370c implements InterfaceC44614f<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final C5368a f7006a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC45684b f7007b;

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.c$a */
    /* JADX INFO: compiled from: StreamBitmapDecoder.java */
    /* JADX INFO: loaded from: classes34.dex */
    public static class a implements C5368a.b {

        /* JADX INFO: renamed from: a */
        public final RecyclableBufferedInputStream f7008a;

        /* JADX INFO: renamed from: b */
        public final C43357d f7009b;

        @Override // com.bumptech.glide.load.resource.bitmap.C5368a.b
        /* JADX INFO: renamed from: a */
        public void mo6894a() {
            this.f7008a.m6853b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C5368a.b
        /* JADX INFO: renamed from: b */
        public void mo6895b(InterfaceC45686d interfaceC45686d, Bitmap bitmap) throws IOException {
            IOException iOExceptionM95485a = this.f7009b.m95485a();
            if (iOExceptionM95485a != null) {
                if (bitmap == null) {
                    throw iOExceptionM95485a;
                }
                interfaceC45686d.mo4893b(bitmap);
                throw iOExceptionM95485a;
            }
        }

        public a(RecyclableBufferedInputStream recyclableBufferedInputStream, C43357d c43357d) {
            this.f7008a = recyclableBufferedInputStream;
            this.f7009b = c43357d;
        }
    }

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC45359j<Bitmap> mo4261a(@NonNull InputStream inputStream, int i11, int i12, @NonNull C44613e c44613e) throws IOException {
        boolean z11;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z11 = false;
        } else {
            z11 = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.f7007b);
        }
        C43357d c43357dM95484b = C43357d.m95484b(recyclableBufferedInputStream);
        try {
            return this.f7006a.m6888g(new C43361h(c43357dM95484b), i11, i12, c44613e, new a(recyclableBufferedInputStream, c43357dM95484b));
        } finally {
            c43357dM95484b.release();
            if (z11) {
                recyclableBufferedInputStream.release();
            }
        }
    }

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo4262b(@NonNull InputStream inputStream, @NonNull C44613e c44613e) {
        return this.f7006a.m6891p(inputStream);
    }

    public C5370c(C5368a c5368a, InterfaceC45684b interfaceC45684b) {
        this.f7006a = c5368a;
        this.f7007b = interfaceC45684b;
    }
}
