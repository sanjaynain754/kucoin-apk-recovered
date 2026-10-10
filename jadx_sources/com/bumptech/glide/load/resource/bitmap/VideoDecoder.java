package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p048c2.C4788e;
import p628t1.C44612d;
import p628t1.C44613e;
import p628t1.InterfaceC44614f;
import p680v1.InterfaceC45359j;
import p710w1.InterfaceC45686d;

/* JADX INFO: loaded from: classes.dex */
public class VideoDecoder<T> implements InterfaceC44614f<T, Bitmap> {

    /* JADX INFO: renamed from: d */
    public static final C44612d<Long> f6976d = C44612d.m98724a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C5361a());

    /* JADX INFO: renamed from: e */
    public static final C44612d<Integer> f6977e = C44612d.m98724a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C5362b());

    /* JADX INFO: renamed from: f */
    public static final C5365e f6978f = new C5365e();

    /* JADX INFO: renamed from: a */
    public final InterfaceC5366f<T> f6979a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC45686d f6980b;

    /* JADX INFO: renamed from: c */
    public final C5365e f6981c;

    /* JADX INFO: loaded from: classes34.dex */
    public static final class VideoDecoderException extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        public VideoDecoderException() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$b */
    public class C5362b implements C44612d.b<Integer> {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f6983a = ByteBuffer.allocate(4);

        @Override // p628t1.C44612d.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6860a(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f6983a) {
                this.f6983a.position(0);
                messageDigest.update(this.f6983a.putInt(num.intValue()).array());
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$c */
    public static final class C5363c implements InterfaceC5366f<AssetFileDescriptor> {
        public C5363c() {
        }

        public /* synthetic */ C5363c(C5361a c5361a) {
            this();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5366f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6863a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$d */
    @RequiresApi(23)
    public static final class C5364d implements InterfaceC5366f<ByteBuffer> {

        /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$d$a */
        /* JADX INFO: loaded from: classes34.dex */
        public class a extends MediaDataSource {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ByteBuffer f6984b;

            public a(ByteBuffer byteBuffer) {
                this.f6984b = byteBuffer;
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f6984b.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j11, byte[] bArr, int i11, int i12) {
                if (j11 >= this.f6984b.limit()) {
                    return -1;
                }
                this.f6984b.position((int) j11);
                int iMin = Math.min(i12, this.f6984b.remaining());
                this.f6984b.get(bArr, i11, iMin);
                return iMin;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5366f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6863a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new a(byteBuffer));
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$e */
    @VisibleForTesting
    public static class C5365e {
        /* JADX INFO: renamed from: a */
        public MediaMetadataRetriever m6866a() {
            return new MediaMetadataRetriever();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$f */
    @VisibleForTesting
    public interface InterfaceC5366f<T> {
        /* JADX INFO: renamed from: a */
        void mo6863a(MediaMetadataRetriever mediaMetadataRetriever, T t11);
    }

    public VideoDecoder(InterfaceC45686d interfaceC45686d, InterfaceC5366f<T> interfaceC5366f) {
        this(interfaceC45686d, interfaceC5366f, f6978f);
    }

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: b */
    public boolean mo4262b(@NonNull T t11, @NonNull C44613e c44613e) {
        return true;
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$a */
    public class C5361a implements C44612d.b<Long> {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f6982a = ByteBuffer.allocate(8);

        @Override // p628t1.C44612d.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6860a(@NonNull byte[] bArr, @NonNull Long l11, @NonNull MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f6982a) {
                this.f6982a.position(0);
                messageDigest.update(this.f6982a.putLong(l11.longValue()).array());
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$g */
    public static final class C5367g implements InterfaceC5366f<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5366f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6863a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    @VisibleForTesting
    public VideoDecoder(InterfaceC45686d interfaceC45686d, InterfaceC5366f<T> interfaceC5366f, C5365e c5365e) {
        this.f6980b = interfaceC45686d;
        this.f6979a = interfaceC5366f;
        this.f6981c = c5365e;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC44614f<AssetFileDescriptor, Bitmap> m6854c(InterfaceC45686d interfaceC45686d) {
        return new VideoDecoder(interfaceC45686d, new C5363c(null));
    }

    @RequiresApi(api = 23)
    /* JADX INFO: renamed from: d */
    public static InterfaceC44614f<ByteBuffer, Bitmap> m6855d(InterfaceC45686d interfaceC45686d) {
        return new VideoDecoder(interfaceC45686d, new C5364d());
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static Bitmap m6856e(MediaMetadataRetriever mediaMetadataRetriever, long j11, int i11, int i12, int i13, DownsampleStrategy downsampleStrategy) {
        Bitmap bitmapM6858g = (Build.VERSION.SDK_INT < 27 || i12 == Integer.MIN_VALUE || i13 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.f6965f) ? null : m6858g(mediaMetadataRetriever, j11, i11, i12, i13, downsampleStrategy);
        if (bitmapM6858g == null) {
            bitmapM6858g = m6857f(mediaMetadataRetriever, j11, i11);
        }
        if (bitmapM6858g != null) {
            return bitmapM6858g;
        }
        throw new VideoDecoderException();
    }

    @Nullable
    @TargetApi(27)
    /* JADX INFO: renamed from: g */
    public static Bitmap m6858g(MediaMetadataRetriever mediaMetadataRetriever, long j11, int i11, int i12, int i13, DownsampleStrategy downsampleStrategy) {
        try {
            int i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i16 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i16 == 90 || i16 == 270) {
                i15 = i14;
                i14 = i15;
            }
            float fMo6850b = downsampleStrategy.mo6850b(i14, i15, i12, i13);
            return mediaMetadataRetriever.getScaledFrameAtTime(j11, i11, Math.round(i14 * fMo6850b), Math.round(fMo6850b * i15));
        } catch (Throwable th2) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC44614f<ParcelFileDescriptor, Bitmap> m6859h(InterfaceC45686d interfaceC45686d) {
        return new VideoDecoder(interfaceC45686d, new C5367g());
    }

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: a */
    public InterfaceC45359j<Bitmap> mo4261a(@NonNull T t11, int i11, int i12, @NonNull C44613e c44613e) throws IOException {
        long jLongValue = ((Long) c44613e.m98732c(f6976d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) c44613e.m98732c(f6977e);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) c44613e.m98732c(DownsampleStrategy.f6967h);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f6966g;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        MediaMetadataRetriever mediaMetadataRetrieverM6866a = this.f6981c.m6866a();
        try {
            this.f6979a.mo6863a(mediaMetadataRetrieverM6866a, t11);
            return C4788e.m4879c(m6856e(mediaMetadataRetrieverM6866a, jLongValue, num.intValue(), i11, i12, downsampleStrategy2), this.f6980b);
        } finally {
            mediaMetadataRetrieverM6866a.release();
        }
    }

    /* JADX INFO: renamed from: f */
    public static Bitmap m6857f(MediaMetadataRetriever mediaMetadataRetriever, long j11, int i11) {
        return mediaMetadataRetriever.getFrameAtTime(j11, i11);
    }
}
