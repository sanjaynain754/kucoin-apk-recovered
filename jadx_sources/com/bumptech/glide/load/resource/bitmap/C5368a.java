package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import p048c2.C4783b0;
import p048c2.C4788e;
import p048c2.C4805v;
import p523p2.C43359f;
import p523p2.C43363j;
import p523p2.C43364k;
import p628t1.C44612d;
import p628t1.C44613e;
import p680v1.InterfaceC45359j;
import p710w1.InterfaceC45684b;
import p710w1.InterfaceC45686d;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.a */
/* JADX INFO: compiled from: Downsampler.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5368a {

    /* JADX INFO: renamed from: f */
    public static final C44612d<DecodeFormat> f6986f = C44612d.m98727f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);

    /* JADX INFO: renamed from: g */
    public static final C44612d<PreferredColorSpace> f6987g = C44612d.m98727f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", PreferredColorSpace.SRGB);

    /* JADX INFO: renamed from: h */
    @Deprecated
    public static final C44612d<DownsampleStrategy> f6988h = DownsampleStrategy.f6967h;

    /* JADX INFO: renamed from: i */
    public static final C44612d<Boolean> f6989i;

    /* JADX INFO: renamed from: j */
    public static final C44612d<Boolean> f6990j;

    /* JADX INFO: renamed from: k */
    public static final Set<String> f6991k;

    /* JADX INFO: renamed from: l */
    public static final b f6992l;

    /* JADX INFO: renamed from: m */
    public static final Set<ImageHeaderParser.ImageType> f6993m;

    /* JADX INFO: renamed from: n */
    public static final Queue<BitmapFactory.Options> f6994n;

    /* JADX INFO: renamed from: a */
    public final InterfaceC45686d f6995a;

    /* JADX INFO: renamed from: b */
    public final DisplayMetrics f6996b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC45684b f6997c;

    /* JADX INFO: renamed from: d */
    public final List<ImageHeaderParser> f6998d;

    /* JADX INFO: renamed from: e */
    public final C4805v f6999e = C4805v.m4899b();

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.a$b */
    /* JADX INFO: compiled from: Downsampler.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo6894a();

        /* JADX INFO: renamed from: b */
        void mo6895b(InterfaceC45686d interfaceC45686d, Bitmap bitmap) throws IOException;
    }

    /* JADX INFO: renamed from: c */
    public static void m6869c(ImageHeaderParser.ImageType imageType, InterfaceC5369b interfaceC5369b, b bVar, InterfaceC45686d interfaceC45686d, DownsampleStrategy downsampleStrategy, int i11, int i12, int i13, int i14, int i15, BitmapFactory.Options options) throws IOException {
        int i16;
        int i17;
        int i18;
        int iFloor;
        int iFloor2;
        if (i12 <= 0 || i13 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i14 + "x" + i15 + "]");
                return;
            }
            return;
        }
        if (m6876r(i11)) {
            i17 = i12;
            i16 = i13;
        } else {
            i16 = i12;
            i17 = i13;
        }
        float fMo6850b = downsampleStrategy.mo6850b(i16, i17, i14, i15);
        if (fMo6850b <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fMo6850b + " from: " + downsampleStrategy + ", source: [" + i12 + "x" + i13 + "], target: [" + i14 + "x" + i15 + "]");
        }
        DownsampleStrategy.SampleSizeRounding sampleSizeRoundingMo6849a = downsampleStrategy.mo6849a(i16, i17, i14, i15);
        if (sampleSizeRoundingMo6849a == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f11 = i16;
        float f12 = i17;
        int i19 = i16;
        int i21 = i17;
        int iM6882x = i19 / m6882x(fMo6850b * f11);
        int iM6882x2 = i21 / m6882x(fMo6850b * f12);
        DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(sampleSizeRoundingMo6849a == sampleSizeRounding ? Math.max(iM6882x, iM6882x2) : Math.min(iM6882x, iM6882x2)));
        if (sampleSizeRoundingMo6849a == sampleSizeRounding && iMax < 1.0f / fMo6850b) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            i18 = 0;
            iFloor = (int) Math.ceil(f11 / fMin);
            iFloor2 = (int) Math.ceil(f12 / fMin);
            int i22 = iMax / 8;
            if (i22 > 0) {
                iFloor /= i22;
                iFloor2 /= i22;
            }
        } else {
            i18 = 0;
            if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                float f13 = iMax;
                iFloor = (int) Math.floor(f11 / f13);
                iFloor2 = (int) Math.floor(f12 / f13);
            } else if (imageType == ImageHeaderParser.ImageType.WEBP || imageType == ImageHeaderParser.ImageType.WEBP_A) {
                float f14 = iMax;
                iFloor = Math.round(f11 / f14);
                iFloor2 = Math.round(f12 / f14);
            } else if (i19 % iMax == 0 && i21 % iMax == 0) {
                iFloor = i19 / iMax;
                iFloor2 = i21 / iMax;
            } else {
                int[] iArrM6874m = m6874m(interfaceC5369b, options, bVar, interfaceC45686d);
                iFloor = iArrM6874m[0];
                iFloor2 = iArrM6874m[1];
            }
        }
        double dMo6850b = downsampleStrategy.mo6850b(iFloor, iFloor2, i14, i15);
        options.inTargetDensity = m6868a(dMo6850b);
        options.inDensity = m6873l(dMo6850b);
        if (m6877s(options)) {
            options.inScaled = true;
        } else {
            int i23 = i18;
            options.inTargetDensity = i23;
            options.inDensity = i23;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Calculate scaling, source: [" + i12 + "x" + i13 + "], degreesToRotate: " + i11 + ", target: [" + i14 + "x" + i15 + "], power of two scaled: [" + iFloor + "x" + iFloor2 + "], exact scale factor: " + fMo6850b + ", power of 2 sample size: " + iMax + ", adjusted scale factor: " + dMo6850b + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    /* JADX INFO: renamed from: m */
    public static int[] m6874m(InterfaceC5369b interfaceC5369b, BitmapFactory.Options options, b bVar, InterfaceC45686d interfaceC45686d) throws IOException {
        options.inJustDecodeBounds = true;
        m6870i(interfaceC5369b, options, bVar, interfaceC45686d);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX INFO: renamed from: w */
    public static void m6881w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* JADX INFO: renamed from: p */
    public boolean m6891p(InputStream inputStream) {
        return true;
    }

    /* JADX INFO: renamed from: q */
    public boolean m6892q(ByteBuffer byteBuffer) {
        return true;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m6893z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    static {
        Boolean bool = Boolean.FALSE;
        f6989i = C44612d.m98727f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f6990j = C44612d.m98727f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f6991k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f6992l = new a();
        f6993m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f6994n = C43364k.m95513f(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r1;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m6870i(InterfaceC5369b interfaceC5369b, BitmapFactory.Options options, b bVar, InterfaceC45686d interfaceC45686d) throws IOException {
        Bitmap bitmapM6870i;
        if (!options.inJustDecodeBounds) {
            bVar.mo6894a();
            interfaceC5369b.mo6896a();
        }
        int i11 = options.outWidth;
        int i12 = options.outHeight;
        String str = options.outMimeType;
        C4783b0.m4863i().lock();
        try {
            try {
                bitmapM6870i = interfaceC5369b.mo6898c(options);
            } catch (IllegalArgumentException e11) {
                IOException iOExceptionM6879u = m6879u(e11, i11, i12, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOExceptionM6879u);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOExceptionM6879u;
                }
                try {
                    interfaceC45686d.mo4893b(bitmap);
                    options.inBitmap = null;
                    bitmapM6870i = m6870i(interfaceC5369b, options, bVar, interfaceC45686d);
                } catch (IOException unused) {
                    throw iOExceptionM6879u;
                }
            }
            C4783b0.m4863i().unlock();
            return bitmapM6870i;
        } catch (Throwable th2) {
            C4783b0.m4863i().unlock();
            throw th2;
        }
    }

    @Nullable
    @TargetApi(19)
    /* JADX INFO: renamed from: j */
    public static String m6871j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* JADX INFO: renamed from: k */
    public static synchronized BitmapFactory.Options m6872k() {
        BitmapFactory.Options optionsPoll;
        Queue<BitmapFactory.Options> queue = f6994n;
        synchronized (queue) {
            optionsPoll = queue.poll();
        }
        if (optionsPoll == null) {
            optionsPoll = new BitmapFactory.Options();
            m6881w(optionsPoll);
        }
        return optionsPoll;
    }

    /* JADX INFO: renamed from: l */
    public static int m6873l(double d11) {
        if (d11 > 1.0d) {
            d11 = 1.0d / d11;
        }
        return (int) Math.round(d11 * 2.147483647E9d);
    }

    /* JADX INFO: renamed from: n */
    public static String m6875n(BitmapFactory.Options options) {
        return m6871j(options.inBitmap);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m6876r(int i11) {
        return i11 == 90 || i11 == 270;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m6877s(BitmapFactory.Options options) {
        int i11;
        int i12 = options.inTargetDensity;
        return i12 > 0 && (i11 = options.inDensity) > 0 && i12 != i11;
    }

    /* JADX INFO: renamed from: t */
    public static void m6878t(int i11, int i12, String str, BitmapFactory.Options options, Bitmap bitmap, int i13, int i14, long j11) {
        Log.v("Downsampler", "Decoded " + m6871j(bitmap) + " from [" + i11 + "x" + i12 + "] " + str + " with inBitmap " + m6875n(options) + " for [" + i13 + "x" + i14 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C43359f.m95489a(j11));
    }

    /* JADX INFO: renamed from: u */
    public static IOException m6879u(IllegalArgumentException illegalArgumentException, int i11, int i12, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i11 + ", outHeight: " + i12 + ", outMimeType: " + str + ", inBitmap: " + m6875n(options), illegalArgumentException);
    }

    /* JADX INFO: renamed from: x */
    public static int m6882x(double d11) {
        return (int) (d11 + 0.5d);
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: y */
    public static void m6883y(BitmapFactory.Options options, InterfaceC45686d interfaceC45686d, int i11, int i12) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = interfaceC45686d.mo100814e(i11, i12, config);
    }

    /* JADX INFO: renamed from: b */
    public final void m6884b(InterfaceC5369b interfaceC5369b, DecodeFormat decodeFormat, boolean z11, boolean z12, BitmapFactory.Options options, int i11, int i12) {
        boolean zHasAlpha;
        if (this.f6999e.m4907i(i11, i12, options, z11, z12)) {
            return;
        }
        if (decodeFormat == DecodeFormat.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = interfaceC5369b.mo6899d().hasAlpha();
        } catch (IOException e11) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + decodeFormat, e11);
            }
            zHasAlpha = false;
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: d */
    public InterfaceC45359j<Bitmap> m6885d(ParcelFileDescriptor parcelFileDescriptor, int i11, int i12, C44613e c44613e) throws IOException {
        return m6886e(new InterfaceC5369b.b(parcelFileDescriptor, this.f6998d, this.f6997c), i11, i12, c44613e, f6992l);
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC45359j<Bitmap> m6886e(InterfaceC5369b interfaceC5369b, int i11, int i12, C44613e c44613e, b bVar) throws IOException {
        byte[] bArr = (byte[]) this.f6997c.mo100806d(65536, byte[].class);
        BitmapFactory.Options optionsM6872k = m6872k();
        optionsM6872k.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) c44613e.m98732c(f6986f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) c44613e.m98732c(f6987g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) c44613e.m98732c(DownsampleStrategy.f6967h);
        boolean zBooleanValue = ((Boolean) c44613e.m98732c(f6989i)).booleanValue();
        C44612d<Boolean> c44612d = f6990j;
        try {
            return C4788e.m4879c(m6889h(interfaceC5369b, optionsM6872k, downsampleStrategy, decodeFormat, preferredColorSpace, c44613e.m98732c(c44612d) != null && ((Boolean) c44613e.m98732c(c44612d)).booleanValue(), i11, i12, zBooleanValue, bVar), this.f6995a);
        } finally {
            m6880v(optionsM6872k);
            this.f6997c.put(bArr);
        }
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC45359j<Bitmap> m6887f(InputStream inputStream, int i11, int i12, C44613e c44613e) throws IOException {
        return m6888g(inputStream, i11, i12, c44613e, f6992l);
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC45359j<Bitmap> m6888g(InputStream inputStream, int i11, int i12, C44613e c44613e, b bVar) throws IOException {
        return m6886e(new InterfaceC5369b.a(inputStream, this.f6998d, this.f6997c), i11, i12, c44613e, bVar);
    }

    /* JADX INFO: renamed from: h */
    public final Bitmap m6889h(InterfaceC5369b interfaceC5369b, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z11, int i11, int i12, boolean z12, b bVar) throws IOException {
        String str;
        String str2;
        int iRound;
        long jM95490b = C43359f.m95490b();
        int[] iArrM6874m = m6874m(interfaceC5369b, options, bVar, this.f6995a);
        int i13 = iArrM6874m[0];
        int i14 = iArrM6874m[1];
        String str3 = options.outMimeType;
        boolean z13 = (i13 == -1 || i14 == -1) ? false : z11;
        int iMo6897b = interfaceC5369b.mo6897b();
        int iM4864j = C4783b0.m4864j(iMo6897b);
        boolean zM4867m = C4783b0.m4867m(iMo6897b);
        int i15 = i11;
        if (i15 == Integer.MIN_VALUE) {
            i15 = m6876r(iM4864j) ? i14 : i13;
        }
        if (i12 == -2147483648) {
            i12 = m6876r(iM4864j) ? i13 : i14;
        }
        ImageHeaderParser.ImageType imageTypeMo6899d = interfaceC5369b.mo6899d();
        m6869c(imageTypeMo6899d, interfaceC5369b, bVar, this.f6995a, downsampleStrategy, iM4864j, i13, i14, i15, i12, options);
        int i16 = i15;
        int i17 = i12;
        m6884b(interfaceC5369b, decodeFormat, z13, zM4867m, options, i16, i17);
        int i18 = Build.VERSION.SDK_INT;
        if (m6893z(imageTypeMo6899d)) {
            if (i13 < 0 || i14 < 0 || !z12) {
                float f11 = m6877s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i19 = options.inSampleSize;
                float f12 = i19;
                int iCeil = (int) Math.ceil(i13 / f12);
                str = str3;
                int iCeil2 = (int) Math.ceil(i14 / f12);
                int iRound2 = Math.round(iCeil * f11);
                iRound = Math.round(iCeil2 * f11);
                str2 = "Downsampler";
                if (Log.isLoggable(str2, 2)) {
                    Log.v(str2, "Calculated target [" + iRound2 + "x" + iRound + "] for source [" + i13 + "x" + i14 + "], sampleSize: " + i19 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f11);
                }
                i16 = iRound2;
            } else {
                str2 = "Downsampler";
                iRound = i17;
                str = str3;
            }
            if (i16 > 0 && iRound > 0) {
                m6883y(options, this.f6995a, i16, iRound);
            }
        } else {
            str = str3;
            str2 = "Downsampler";
        }
        if (i18 >= 28) {
            options.inPreferredColorSpace = ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        } else if (i18 >= 26) {
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Bitmap bitmapM6870i = m6870i(interfaceC5369b, options, bVar, this.f6995a);
        bVar.mo6895b(this.f6995a, bitmapM6870i);
        if (Log.isLoggable(str2, 2)) {
            m6878t(i13, i14, str, options, bitmapM6870i, i11, i12, jM95490b);
        }
        if (bitmapM6870i == null) {
            return null;
        }
        bitmapM6870i.setDensity(this.f6996b.densityDpi);
        Bitmap bitmapM4868n = C4783b0.m4868n(this.f6995a, bitmapM6870i, iMo6897b);
        if (!bitmapM6870i.equals(bitmapM4868n)) {
            this.f6995a.mo4893b(bitmapM6870i);
        }
        return bitmapM4868n;
    }

    public C5368a(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, InterfaceC45686d interfaceC45686d, InterfaceC45684b interfaceC45684b) {
        this.f6998d = list;
        this.f6996b = (DisplayMetrics) C43363j.m95506d(displayMetrics);
        this.f6995a = (InterfaceC45686d) C43363j.m95506d(interfaceC45686d);
        this.f6997c = (InterfaceC45684b) C43363j.m95506d(interfaceC45684b);
    }

    /* JADX INFO: renamed from: a */
    public static int m6868a(double d11) {
        int iM6873l = m6873l(d11);
        int iM6882x = m6882x(((double) iM6873l) * d11);
        return m6882x((d11 / ((double) (iM6882x / iM6873l))) * ((double) iM6882x));
    }

    /* JADX INFO: renamed from: v */
    public static void m6880v(BitmapFactory.Options options) {
        m6881w(options);
        Queue<BitmapFactory.Options> queue = f6994n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* JADX INFO: renamed from: o */
    public boolean m6890o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.m6659c();
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.a$a */
    /* JADX INFO: compiled from: Downsampler.java */
    public class a implements b {
        @Override // com.bumptech.glide.load.resource.bitmap.C5368a.b
        /* JADX INFO: renamed from: a */
        public void mo6894a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C5368a.b
        /* JADX INFO: renamed from: b */
        public void mo6895b(InterfaceC45686d interfaceC45686d, Bitmap bitmap) {
        }
    }
}
