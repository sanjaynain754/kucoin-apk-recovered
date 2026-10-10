package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p710w1.InterfaceC45684b;

/* JADX INFO: renamed from: com.bumptech.glide.load.a */
/* JADX INFO: compiled from: ImageHeaderParserUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5318a {

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$a */
    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public class a implements g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InputStream f6736a;

        public a(InputStream inputStream) {
            this.f6736a = inputStream;
        }

        @Override // com.bumptech.glide.load.C5318a.g
        /* JADX INFO: renamed from: a */
        public ImageHeaderParser.ImageType mo6657a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo4896a(this.f6736a);
            } finally {
                this.f6736a.reset();
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$b */
    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public class b implements g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ByteBuffer f6737a;

        public b(ByteBuffer byteBuffer) {
            this.f6737a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.C5318a.g
        /* JADX INFO: renamed from: a */
        public ImageHeaderParser.ImageType mo6657a(ImageHeaderParser imageHeaderParser) throws IOException {
            return imageHeaderParser.mo4898c(this.f6737a);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$c */
    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    /* JADX INFO: loaded from: classes34.dex */
    public class c implements g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ParcelFileDescriptorRewinder f6738a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC45684b f6739b;

        @Override // com.bumptech.glide.load.C5318a.g
        /* JADX INFO: renamed from: a */
        public ImageHeaderParser.ImageType mo6657a(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f6738a.mo6660a().getFileDescriptor()), this.f6739b);
                try {
                    ImageHeaderParser.ImageType imageTypeMo4896a = imageHeaderParser.mo4896a(recyclableBufferedInputStream2);
                    try {
                        recyclableBufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    this.f6738a.mo6660a();
                    return imageTypeMo4896a;
                } catch (Throwable th2) {
                    th = th2;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f6738a.mo6660a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC45684b interfaceC45684b) {
            this.f6738a = parcelFileDescriptorRewinder;
            this.f6739b = interfaceC45684b;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$d */
    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public class d implements f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InputStream f6740a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC45684b f6741b;

        public d(InputStream inputStream, InterfaceC45684b interfaceC45684b) {
            this.f6740a = inputStream;
            this.f6741b = interfaceC45684b;
        }

        @Override // com.bumptech.glide.load.C5318a.f
        /* JADX INFO: renamed from: a */
        public int mo6658a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo4897b(this.f6740a, this.f6741b);
            } finally {
                this.f6740a.reset();
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$e */
    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    /* JADX INFO: loaded from: classes34.dex */
    public class e implements f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ParcelFileDescriptorRewinder f6742a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC45684b f6743b;

        @Override // com.bumptech.glide.load.C5318a.f
        /* JADX INFO: renamed from: a */
        public int mo6658a(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f6742a.mo6660a().getFileDescriptor()), this.f6743b);
                try {
                    int iMo4897b = imageHeaderParser.mo4897b(recyclableBufferedInputStream2, this.f6743b);
                    try {
                        recyclableBufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    this.f6742a.mo6660a();
                    return iMo4897b;
                } catch (Throwable th2) {
                    th = th2;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f6742a.mo6660a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public e(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC45684b interfaceC45684b) {
            this.f6742a = parcelFileDescriptorRewinder;
            this.f6743b = interfaceC45684b;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$f */
    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public interface f {
        /* JADX INFO: renamed from: a */
        int mo6658a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$g */
    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public interface g {
        /* JADX INFO: renamed from: a */
        ImageHeaderParser.ImageType mo6657a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: a */
    public static int m6650a(@NonNull List<ImageHeaderParser> list, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull InterfaceC45684b interfaceC45684b) throws IOException {
        return m6652c(list, new e(parcelFileDescriptorRewinder, interfaceC45684b));
    }

    /* JADX INFO: renamed from: b */
    public static int m6651b(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull InterfaceC45684b interfaceC45684b) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, interfaceC45684b);
        }
        inputStream.mark(5242880);
        return m6652c(list, new d(inputStream, interfaceC45684b));
    }

    @NonNull
    @RequiresApi(21)
    /* JADX INFO: renamed from: d */
    public static ImageHeaderParser.ImageType m6653d(@NonNull List<ImageHeaderParser> list, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull InterfaceC45684b interfaceC45684b) throws IOException {
        return m6656g(list, new c(parcelFileDescriptorRewinder, interfaceC45684b));
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static ImageHeaderParser.ImageType m6654e(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull InterfaceC45684b interfaceC45684b) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, interfaceC45684b);
        }
        inputStream.mark(5242880);
        return m6656g(list, new a(inputStream));
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static ImageHeaderParser.ImageType m6655f(@NonNull List<ImageHeaderParser> list, @Nullable ByteBuffer byteBuffer) throws IOException {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : m6656g(list, new b(byteBuffer));
    }

    /* JADX INFO: renamed from: c */
    public static int m6652c(@NonNull List<ImageHeaderParser> list, f fVar) throws IOException {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            int iMo6658a = fVar.mo6658a(list.get(i11));
            if (iMo6658a != -1) {
                return iMo6658a;
            }
        }
        return -1;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static ImageHeaderParser.ImageType m6656g(@NonNull List<ImageHeaderParser> list, g gVar) throws IOException {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ImageHeaderParser.ImageType imageTypeMo6657a = gVar.mo6657a(list.get(i11));
            if (imageTypeMo6657a != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeMo6657a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
