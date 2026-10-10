package p284g6;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.util.Pair;
import androidx.core.util.Pools;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p819z3.C46673b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: g6.c */
/* JADX INFO: compiled from: BitmapUtil.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001fH\u0002¢\u0006\u0004\b&\u0010!R!\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001f0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010.R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010.¨\u00061"}, m90084d2 = {"Lg6/c;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "", "j", "(Landroid/graphics/Bitmap;)I", "Ljava/io/InputStream;", "inputStream", "Landroid/util/Pair;", "d", "(Ljava/io/InputStream;)Landroid/util/Pair;", "Lg6/e;", "e", "(Ljava/io/InputStream;)Lg6/e;", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/graphics/Bitmap$Config;)I", "width", "height", "i", "(IILandroid/graphics/Bitmap$Config;)I", "Landroid/graphics/Rect;", "outPadding", "Landroid/graphics/BitmapFactory$Options;", "options", "f", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "Ljava/nio/ByteBuffer;", "c", "()Ljava/nio/ByteBuffer;", "byteBuffer", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/nio/ByteBuffer;)V", "k", "Landroidx/core/util/Pools$SynchronizedPool;", "b", "Lkotlin/Lazy;", "g", "()Landroidx/core/util/Pools$SynchronizedPool;", "DECODE_BUFFERS", "", "Z", "useDecodeBufferHelper", "fixDecodeDrmImageCrash", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBitmapUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapUtil.kt\ncom/facebook/imageutils/BitmapUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n1#2:227\n*E\n"})
public final class C37818c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37818c f85190a = new C37818c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy DECODE_BUFFERS = LazyKt.lazy(new Function0() { // from class: g6.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C37818c.m85336b();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static boolean useDecodeBufferHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static boolean fixDecodeDrmImageCrash;

    /* JADX INFO: renamed from: g6.c$a */
    /* JADX INFO: compiled from: BitmapUtil.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Bitmap.Config.RGBA_1010102.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Bitmap.Config.HARDWARE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Pools.SynchronizedPool m85336b() {
        return new Pools.SynchronizedPool(12);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final Pair<Integer, Integer> m85337d(@Nullable InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.");
        }
        C37818c c37818c = f85190a;
        ByteBuffer byteBufferM85345k = c37818c.m85345k();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferM85345k.array();
            Pair<Integer, Integer> pair = null;
            c37818c.m85343f(inputStream, null, options);
            if (options.outWidth != -1 && options.outHeight != -1) {
                pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            }
            return pair;
        } finally {
            f85190a.m85346l(byteBufferM85345k);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final C37820e m85338e(@Nullable InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.");
        }
        C37818c c37818c = f85190a;
        ByteBuffer byteBufferM85345k = c37818c.m85345k();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferM85345k.array();
            c37818c.m85343f(inputStream, null, options);
            return new C37820e(options.outWidth, options.outHeight, Build.VERSION.SDK_INT >= 26 ? options.outColorSpace : null);
        } finally {
            f85190a.m85346l(byteBufferM85345k);
        }
    }

    @JvmStatic
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: h */
    public static final int m85339h(@Nullable Bitmap.Config bitmapConfig) {
        switch (bitmapConfig == null ? -1 : a.$EnumSwitchMapping$0[bitmapConfig.ordinal()]) {
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            case 6:
            case 7:
                return 4;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final int m85340i(int width, int height, @Nullable Bitmap.Config bitmapConfig) {
        if (width <= 0) {
            throw new IllegalArgumentException(("width must be > 0, width is: " + width).toString());
        }
        if (height <= 0) {
            throw new IllegalArgumentException(("height must be > 0, height is: " + height).toString());
        }
        int iM85339h = m85339h(bitmapConfig);
        int i11 = width * height * iM85339h;
        if (i11 > 0) {
            return i11;
        }
        throw new IllegalStateException(("size must be > 0: size: " + i11 + ", width: " + width + ", height: " + height + ", pixelSize: " + iM85339h).toString());
    }

    @JvmStatic
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: j */
    public static final int m85341j(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }

    /* JADX INFO: renamed from: c */
    public final ByteBuffer m85342c() {
        return useDecodeBufferHelper ? C46673b.f104505a.acquire() : m85344g().acquire();
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Bitmap m85343f(@Nullable InputStream inputStream, @Nullable Rect outPadding, @Nullable BitmapFactory.Options options) {
        if (!fixDecodeDrmImageCrash) {
            return BitmapFactory.decodeStream(inputStream, outPadding, options);
        }
        try {
            return BitmapFactory.decodeStream(inputStream, outPadding, options);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final Pools.SynchronizedPool<ByteBuffer> m85344g() {
        return (Pools.SynchronizedPool) DECODE_BUFFERS.getValue();
    }

    /* JADX INFO: renamed from: l */
    public final void m85346l(ByteBuffer byteBuffer) {
        if (useDecodeBufferHelper) {
            return;
        }
        m85344g().release(byteBuffer);
    }

    /* JADX INFO: renamed from: k */
    public final ByteBuffer m85345k() {
        ByteBuffer byteBufferM85342c = m85342c();
        if (byteBufferM85342c == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(C46673b.m102893c());
            Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
            return byteBufferAllocate;
        }
        return byteBufferM85342c;
    }
}
