package com.facebook.imagepipeline.nativecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import com.facebook.soloader.DoNotOptimize;
import java.util.Locale;
import p006a4.AbstractC0110a;
import p008a6.C0145g;
import p008a6.C0147h;
import p034b6.InterfaceC4495d;
import p284g6.C37818c;
import p712w3.C45708h;
import p712w3.C45713m;
import p712w3.InterfaceC45704d;
import p749x5.C46075i;

/* JADX INFO: loaded from: classes34.dex */
@InterfaceC45704d
public abstract class DalvikPurgeableDecoder implements InterfaceC4495d {

    /* JADX INFO: renamed from: b */
    public static final byte[] f9172b;

    /* JADX INFO: renamed from: a */
    public final C0145g f9173a = C0147h.m680a();

    @DoNotOptimize
    public static class OreoUtils {
        @TargetApi(26)
        /* JADX INFO: renamed from: a */
        public static void m9505a(BitmapFactory.Options options, ColorSpace colorSpace) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }

        private OreoUtils() {
        }
    }

    @InterfaceC45704d
    private static native void nativePinBitmap(Bitmap bitmap);

    /* JADX INFO: renamed from: c */
    public abstract Bitmap mo9502c(AbstractC0110a<PooledByteBuffer> abstractC0110a, BitmapFactory.Options options);

    /* JADX INFO: renamed from: d */
    public abstract Bitmap mo9503d(AbstractC0110a<PooledByteBuffer> abstractC0110a, int i11, BitmapFactory.Options options);

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public static BitmapFactory.Options m9501f(int i11, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i11;
        options.inMutable = true;
        return options;
    }

    static {
        C5660a.m9512a();
        f9172b = new byte[]{-1, -39};
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public static boolean m9500e(AbstractC0110a<PooledByteBuffer> abstractC0110a, int i11) {
        PooledByteBuffer pooledByteBufferM565l = abstractC0110a.m565l();
        if (i11 >= 2 && pooledByteBufferM565l.mo733e(i11 - 2) == -1 && pooledByteBufferM565l.mo733e(i11 - 1) == -39) {
            return true;
        }
        return false;
    }

    @Override // p034b6.InterfaceC4495d
    /* JADX INFO: renamed from: a */
    public AbstractC0110a<Bitmap> mo4293a(C46075i c46075i, Bitmap.Config config, Rect rect, int i11, ColorSpace colorSpace) {
        BitmapFactory.Options optionsM9501f = m9501f(c46075i.m101581p(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.m9505a(optionsM9501f, colorSpace);
        }
        AbstractC0110a<PooledByteBuffer> abstractC0110aM101574i = c46075i.m101574i();
        C45708h.m100896g(abstractC0110aM101574i);
        try {
            return m9504g(mo9503d(abstractC0110aM101574i, i11, optionsM9501f));
        } finally {
            AbstractC0110a.m555j(abstractC0110aM101574i);
        }
    }

    @Override // p034b6.InterfaceC4495d
    /* JADX INFO: renamed from: b */
    public AbstractC0110a<Bitmap> mo4294b(C46075i c46075i, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options optionsM9501f = m9501f(c46075i.m101581p(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.m9505a(optionsM9501f, colorSpace);
        }
        AbstractC0110a<PooledByteBuffer> abstractC0110aM101574i = c46075i.m101574i();
        C45708h.m100896g(abstractC0110aM101574i);
        try {
            return m9504g(mo9502c(abstractC0110aM101574i, optionsM9501f));
        } finally {
            AbstractC0110a.m555j(abstractC0110aM101574i);
        }
    }

    /* JADX INFO: renamed from: g */
    public AbstractC0110a<Bitmap> m9504g(Bitmap bitmap) {
        C45708h.m100896g(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.f9173a.m667g(bitmap)) {
                return AbstractC0110a.m560u(bitmap, this.f9173a.m665e());
            }
            int iM85341j = C37818c.m85341j(bitmap);
            bitmap.recycle();
            throw new TooManyBitmapsException(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", Integer.valueOf(iM85341j), Integer.valueOf(this.f9173a.m662b()), Long.valueOf(this.f9173a.m666f()), Integer.valueOf(this.f9173a.m663c()), Integer.valueOf(this.f9173a.m664d())));
        } catch (Exception e11) {
            bitmap.recycle();
            throw C45713m.m100908a(e11);
        }
    }
}
