package p034b6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p006a4.AbstractC0110a;
import p006a4.InterfaceC0117h;
import p008a6.C0159s;
import p008a6.InterfaceC0149i;
import p032b4.C4487a;
import p032b4.C4488b;
import p526p5.C43389e;
import p712w3.C45708h;
import p747x3.C45999a;
import p749x5.C46075i;
import p819z3.C46673b;

/* JADX INFO: renamed from: b6.b */
/* JADX INFO: compiled from: DefaultDecoder.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC4493b implements InterfaceC4495d {

    /* JADX INFO: renamed from: f */
    public static final Class<?> f3898f = AbstractC4493b.class;

    /* JADX INFO: renamed from: g */
    public static final byte[] f3899g = {-1, -39};

    /* JADX INFO: renamed from: a */
    public final InterfaceC0149i f3900a;

    /* JADX INFO: renamed from: b */
    public boolean f3901b;

    /* JADX INFO: renamed from: c */
    public boolean f3902c;

    /* JADX INFO: renamed from: d */
    public final PreverificationHelper f3903d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public final Pools.Pool<ByteBuffer> f3904e;

    /* JADX INFO: renamed from: b6.b$a */
    /* JADX INFO: compiled from: DefaultDecoder.java */
    public static final class a implements InterfaceC0117h<Bitmap> {

        /* JADX INFO: renamed from: a */
        public static final a f3905a = new a();

        @Override // p006a4.InterfaceC0117h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void release(Bitmap bitmap) {
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo4291d(int i11, int i12, BitmapFactory.Options options);

    /* JADX INFO: renamed from: e */
    public static BitmapFactory.Options m4292e(C46075i c46075i, Bitmap.Config config, boolean z11) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = c46075i.m101581p();
        options.inJustDecodeBounds = true;
        options.inDither = true;
        boolean z12 = Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
        if (!z12) {
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        if (!z11) {
            BitmapFactory.decodeStream(c46075i.m101579n(), null, options);
            if (options.outWidth == -1 || options.outHeight == -1) {
                throw new IllegalArgumentException();
            }
        }
        if (z12) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    @Override // p034b6.InterfaceC4495d
    /* JADX INFO: renamed from: b */
    public AbstractC0110a<Bitmap> mo4294b(C46075i c46075i, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options optionsM4292e = m4292e(c46075i, config, this.f3901b);
        boolean z11 = optionsM4292e.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return m4295c((InputStream) C45708h.m100896g(c46075i.m101579n()), optionsM4292e, rect, colorSpace);
        } catch (RuntimeException e11) {
            if (z11) {
                return mo4294b(c46075i, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e11;
        }
    }

    public AbstractC4493b(InterfaceC0149i interfaceC0149i, Pools.Pool<ByteBuffer> pool, C4497f c4497f) {
        PreverificationHelper preverificationHelper;
        if (Build.VERSION.SDK_INT >= 26) {
            preverificationHelper = new PreverificationHelper();
        } else {
            preverificationHelper = null;
        }
        this.f3903d = preverificationHelper;
        this.f3900a = interfaceC0149i;
        if (interfaceC0149i instanceof C0159s) {
            this.f3901b = c4497f.getAvoidPoolGet();
            this.f3902c = c4497f.getAvoidPoolRelease();
        }
        this.f3904e = pool;
    }

    @Override // p034b6.InterfaceC4495d
    /* JADX INFO: renamed from: a */
    public AbstractC0110a<Bitmap> mo4293a(C46075i c46075i, Bitmap.Config config, Rect rect, int i11, ColorSpace colorSpace) {
        boolean z11;
        boolean zM101587x = c46075i.m101587x(i11);
        BitmapFactory.Options optionsM4292e = m4292e(c46075i, config, this.f3901b);
        InputStream inputStreamM101579n = c46075i.m101579n();
        C45708h.m100896g(inputStreamM101579n);
        if (c46075i.m101582q() > i11) {
            inputStreamM101579n = new C4487a(inputStreamM101579n, i11);
        }
        if (!zM101587x) {
            inputStreamM101579n = new C4488b(inputStreamM101579n, f3899g);
        }
        if (optionsM4292e.inPreferredConfig != Bitmap.Config.ARGB_8888) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z12 = z11;
        try {
            try {
                AbstractC0110a<Bitmap> abstractC0110aM4295c = m4295c(inputStreamM101579n, optionsM4292e, rect, colorSpace);
                try {
                    inputStreamM101579n.close();
                    return abstractC0110aM4295c;
                } catch (IOException e11) {
                    e11.printStackTrace();
                    return abstractC0110aM4295c;
                }
            } catch (Throwable th2) {
                try {
                    inputStreamM101579n.close();
                    throw th2;
                } catch (IOException e12) {
                    e12.printStackTrace();
                    throw th2;
                }
            }
        } catch (RuntimeException e13) {
            if (z12) {
                AbstractC0110a<Bitmap> abstractC0110aMo4293a = mo4293a(c46075i, Bitmap.Config.ARGB_8888, rect, i11, colorSpace);
                try {
                    inputStreamM101579n.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
                return abstractC0110aMo4293a;
            }
            throw e13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0075  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7 A[Catch: all -> 0x00a3, RuntimeException -> 0x00a6, IllegalArgumentException -> 0x00a8, TRY_LEAVE, TryCatch #8 {IllegalArgumentException -> 0x00a8, RuntimeException -> 0x00a6, blocks: (B:36:0x007d, B:39:0x0087, B:49:0x009f, B:68:0x00c7, B:64:0x00c0, B:65:0x00c3, B:62:0x00ba), top: B:98:0x007d, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX INFO: renamed from: c */
    public final AbstractC0110a<Bitmap> m4295c(InputStream inputStream, BitmapFactory.Options options, Rect rect, ColorSpace colorSpace) {
        boolean z11;
        Bitmap bitmap;
        Bitmap bitmap2;
        ByteBuffer byteBufferAcquire;
        Bitmap bitmapDecodeStream;
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        PreverificationHelper preverificationHelper;
        C45708h.m100896g(inputStream);
        int i11 = options.outWidth;
        int iHeight = options.outHeight;
        ?? r11 = i11;
        if (rect != null) {
            int iWidth = rect.width() / options.inSampleSize;
            iHeight = rect.height() / options.inSampleSize;
            r11 = iWidth;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26 && (preverificationHelper = this.f3903d) != null && preverificationHelper.shouldUseHardwareBitmapConfig(options.inPreferredConfig)) {
            z11 = true;
        } else {
            z11 = false;
        }
        BitmapRegionDecoder bitmapRegionDecoder = 0;
        try {
            try {
                if (rect == null && z11) {
                    options.inMutable = false;
                } else {
                    if (rect != null && z11) {
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    }
                    if (!this.f3901b) {
                        bitmap = this.f3900a.get(mo4291d(r11, iHeight, options));
                        if (bitmap == null) {
                            bitmap2 = bitmap;
                            throw new NullPointerException("BitmapPool.get returned null");
                        }
                    }
                    bitmap2 = bitmap;
                    options.inBitmap = bitmap2;
                    if (i12 >= 26) {
                        if (colorSpace == null) {
                            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                        }
                        options.inPreferredColorSpace = colorSpace;
                    }
                    byteBufferAcquire = this.f3904e.acquire();
                    if (byteBufferAcquire == null) {
                        byteBufferAcquire = ByteBuffer.allocate(C46673b.m102893c());
                    }
                    options.inTempStorage = byteBufferAcquire.array();
                    if (rect == null && bitmap2 != 0) {
                        Bitmap.Config config = options.inPreferredConfig;
                        try {
                            if (config != null) {
                                try {
                                    bitmap2.reconfigure(r11, iHeight, config);
                                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStream, true);
                                    if (bitmapRegionDecoderNewInstance != null) {
                                        try {
                                            bitmapDecodeStream = bitmapRegionDecoderNewInstance.decodeRegion(rect, options);
                                        } catch (IOException unused) {
                                            C45999a.m101505k(f3898f, "Could not decode region %s, decoding full bitmap instead.", rect);
                                            if (bitmapRegionDecoderNewInstance != null) {
                                                bitmapRegionDecoderNewInstance.recycle();
                                            }
                                            bitmapDecodeStream = null;
                                        }
                                    } else {
                                        bitmapDecodeStream = null;
                                    }
                                    if (bitmapRegionDecoderNewInstance != null) {
                                        bitmapRegionDecoderNewInstance.recycle();
                                    }
                                } catch (IOException unused2) {
                                    bitmapRegionDecoderNewInstance = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (bitmapRegionDecoder != 0) {
                                        bitmapRegionDecoder.recycle();
                                    }
                                    throw th;
                                }
                            } else {
                                bitmapDecodeStream = null;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            bitmapRegionDecoder = r11;
                        }
                    } else {
                        bitmapDecodeStream = null;
                    }
                    if (bitmapDecodeStream == null) {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                    }
                    this.f3904e.release(byteBufferAcquire);
                    if (bitmap2 == 0 && bitmap2 != bitmapDecodeStream) {
                        this.f3900a.release(bitmap2);
                        if (bitmapDecodeStream != null) {
                            bitmapDecodeStream.recycle();
                        }
                        throw new IllegalStateException();
                    }
                    if (this.f3902c) {
                        return AbstractC0110a.m560u(bitmapDecodeStream, a.f3905a);
                    }
                    return AbstractC0110a.m560u(bitmapDecodeStream, this.f3900a);
                }
                options.inTempStorage = byteBufferAcquire.array();
                if (rect == null) {
                    bitmapDecodeStream = null;
                } else {
                    bitmapDecodeStream = null;
                }
                if (bitmapDecodeStream == null) {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                }
                this.f3904e.release(byteBufferAcquire);
                if (bitmap2 == 0) {
                }
                if (this.f3902c) {
                    return AbstractC0110a.m560u(bitmapDecodeStream, a.f3905a);
                }
                return AbstractC0110a.m560u(bitmapDecodeStream, this.f3900a);
            } catch (Throwable th4) {
                this.f3904e.release(byteBufferAcquire);
                throw th4;
            }
        } catch (IllegalArgumentException e11) {
            if (bitmap2 != 0) {
                this.f3900a.release(bitmap2);
            }
            try {
                inputStream.reset();
                Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStream);
                if (bitmapDecodeStream2 != null) {
                    AbstractC0110a<Bitmap> abstractC0110aM560u = AbstractC0110a.m560u(bitmapDecodeStream2, C43389e.m95564a());
                    this.f3904e.release(byteBufferAcquire);
                    return abstractC0110aM560u;
                }
                throw e11;
            } catch (IOException unused3) {
                throw e11;
            }
        } catch (RuntimeException e12) {
            if (bitmap2 != 0) {
                this.f3900a.release(bitmap2);
            }
            throw e12;
        }
        bitmap2 = 0;
        bitmap2 = bitmap;
        options.inBitmap = bitmap2;
        if (i12 >= 26) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
        byteBufferAcquire = this.f3904e.acquire();
        if (byteBufferAcquire == null) {
            byteBufferAcquire = ByteBuffer.allocate(C46673b.m102893c());
        }
    }
}
