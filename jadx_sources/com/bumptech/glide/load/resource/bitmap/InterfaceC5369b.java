package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.C5318a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C5330k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p523p2.C43363j;
import p710w1.InterfaceC45684b;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.b */
/* JADX INFO: compiled from: ImageReader.java */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5369b {

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.b$a */
    /* JADX INFO: compiled from: ImageReader.java */
    public static final class a implements InterfaceC5369b {

        /* JADX INFO: renamed from: a */
        public final C5330k f7000a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC45684b f7001b;

        /* JADX INFO: renamed from: c */
        public final List<ImageHeaderParser> f7002c;

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5369b
        /* JADX INFO: renamed from: a */
        public void mo6896a() {
            this.f7000a.m6689c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5369b
        /* JADX INFO: renamed from: b */
        public int mo6897b() throws IOException {
            return C5318a.m6651b(this.f7002c, this.f7000a.mo6660a(), this.f7001b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5369b
        @Nullable
        /* JADX INFO: renamed from: c */
        public Bitmap mo6898c(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f7000a.mo6660a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5369b
        /* JADX INFO: renamed from: d */
        public ImageHeaderParser.ImageType mo6899d() throws IOException {
            return C5318a.m6654e(this.f7002c, this.f7000a.mo6660a(), this.f7001b);
        }

        public a(InputStream inputStream, List<ImageHeaderParser> list, InterfaceC45684b interfaceC45684b) {
            this.f7001b = (InterfaceC45684b) C43363j.m95506d(interfaceC45684b);
            this.f7002c = (List) C43363j.m95506d(list);
            this.f7000a = new C5330k(inputStream, interfaceC45684b);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.b$b */
    /* JADX INFO: compiled from: ImageReader.java */
    /* JADX INFO: loaded from: classes34.dex */
    @RequiresApi(21)
    public static final class b implements InterfaceC5369b {

        /* JADX INFO: renamed from: a */
        public final InterfaceC45684b f7003a;

        /* JADX INFO: renamed from: b */
        public final List<ImageHeaderParser> f7004b;

        /* JADX INFO: renamed from: c */
        public final ParcelFileDescriptorRewinder f7005c;

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5369b
        /* JADX INFO: renamed from: b */
        public int mo6897b() throws IOException {
            return C5318a.m6650a(this.f7004b, this.f7005c, this.f7003a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5369b
        @Nullable
        /* JADX INFO: renamed from: c */
        public Bitmap mo6898c(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f7005c.mo6660a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5369b
        /* JADX INFO: renamed from: d */
        public ImageHeaderParser.ImageType mo6899d() throws IOException {
            return C5318a.m6653d(this.f7004b, this.f7005c, this.f7003a);
        }

        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, InterfaceC45684b interfaceC45684b) {
            this.f7003a = (InterfaceC45684b) C43363j.m95506d(interfaceC45684b);
            this.f7004b = (List) C43363j.m95506d(list);
            this.f7005c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC5369b
        /* JADX INFO: renamed from: a */
        public void mo6896a() {
        }
    }

    /* JADX INFO: renamed from: a */
    void mo6896a();

    /* JADX INFO: renamed from: b */
    int mo6897b() throws IOException;

    @Nullable
    /* JADX INFO: renamed from: c */
    Bitmap mo6898c(BitmapFactory.Options options) throws IOException;

    /* JADX INFO: renamed from: d */
    ImageHeaderParser.ImageType mo6899d() throws IOException;
}
