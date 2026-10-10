package p048c2;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p523p2.C43363j;
import p710w1.InterfaceC45686d;

/* JADX INFO: renamed from: c2.b0 */
/* JADX INFO: compiled from: TransformationUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C4783b0 {

    /* JADX INFO: renamed from: a */
    public static final Paint f4796a = new Paint(6);

    /* JADX INFO: renamed from: b */
    public static final Paint f4797b = new Paint(7);

    /* JADX INFO: renamed from: c */
    public static final Paint f4798c;

    /* JADX INFO: renamed from: d */
    public static final Set<String> f4799d;

    /* JADX INFO: renamed from: e */
    public static final Lock f4800e;

    /* JADX INFO: renamed from: c2.b0$a */
    /* JADX INFO: compiled from: TransformationUtils.java */
    /* JADX INFO: loaded from: classes34.dex */
    public class a implements b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f4801a;

        public a(int i11) {
            this.f4801a = i11;
        }

        @Override // p048c2.C4783b0.b
        /* JADX INFO: renamed from: a */
        public void mo4872a(Canvas canvas, Paint paint, RectF rectF) {
            int i11 = this.f4801a;
            canvas.drawRoundRect(rectF, i11, i11, paint);
        }
    }

    /* JADX INFO: renamed from: c2.b0$b */
    /* JADX INFO: compiled from: TransformationUtils.java */
    /* JADX INFO: loaded from: classes34.dex */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo4872a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* JADX INFO: renamed from: c2.b0$c */
    /* JADX INFO: compiled from: TransformationUtils.java */
    public static final class c implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        @NonNull
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j11, @NonNull TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m4859e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f4799d = hashSet;
        f4800e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new c();
        Paint paint = new Paint(7);
        f4798c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* JADX INFO: renamed from: a */
    public static void m4855a(@NonNull Bitmap bitmap, @NonNull Bitmap bitmap2, Matrix matrix) {
        f4800e.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f4796a);
            m4859e(canvas);
        } finally {
            f4800e.unlock();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static Bitmap.Config m4862h(@NonNull Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    /* JADX INFO: renamed from: i */
    public static Lock m4863i() {
        return f4800e;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: l */
    public static void m4866l(int i11, Matrix matrix) {
        switch (i11) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    /* JADX INFO: renamed from: o */
    public static Bitmap m4869o(@NonNull InterfaceC45686d interfaceC45686d, @NonNull Bitmap bitmap, int i11) {
        C43363j.m95503a(i11 > 0, "roundingRadius must be greater than 0.");
        return m4870p(interfaceC45686d, bitmap, new a(i11));
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m4856b(@NonNull InterfaceC45686d interfaceC45686d, @NonNull Bitmap bitmap, int i11, int i12) {
        float width;
        float height;
        if (bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i12 > bitmap.getHeight() * i11) {
            width = i12 / bitmap.getHeight();
            width2 = (i11 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i11 / bitmap.getWidth();
            height = (i12 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo100813d = interfaceC45686d.mo100813d(i11, i12, m4865k(bitmap));
        m4871q(bitmap, bitmapMo100813d);
        m4855a(bitmap, bitmapMo100813d, matrix);
        return bitmapMo100813d;
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m4857c(@NonNull InterfaceC45686d interfaceC45686d, @NonNull Bitmap bitmap, int i11, int i12) {
        if (bitmap.getWidth() <= i11 && bitmap.getHeight() <= i12) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            }
            return bitmap;
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
        }
        return m4860f(interfaceC45686d, bitmap, i11, i12);
    }

    /* JADX INFO: renamed from: d */
    public static Bitmap m4858d(@NonNull InterfaceC45686d interfaceC45686d, @NonNull Bitmap bitmap, int i11, int i12) {
        int iMin = Math.min(i11, i12);
        float f11 = iMin;
        float f12 = f11 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f11 / width, f11 / height);
        float f13 = width * fMax;
        float f14 = fMax * height;
        float f15 = (f11 - f13) / 2.0f;
        float f16 = (f11 - f14) / 2.0f;
        RectF rectF = new RectF(f15, f16, f13 + f15, f14 + f16);
        Bitmap bitmapM4861g = m4861g(interfaceC45686d, bitmap);
        Bitmap bitmapMo100813d = interfaceC45686d.mo100813d(iMin, iMin, m4862h(bitmap));
        bitmapMo100813d.setHasAlpha(true);
        Lock lock = f4800e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo100813d);
            canvas.drawCircle(f12, f12, f12, f4797b);
            canvas.drawBitmap(bitmapM4861g, (Rect) null, rectF, f4798c);
            m4859e(canvas);
            lock.unlock();
            if (!bitmapM4861g.equals(bitmap)) {
                interfaceC45686d.mo4893b(bitmapM4861g);
            }
            return bitmapMo100813d;
        } catch (Throwable th2) {
            f4800e.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public static Bitmap m4860f(@NonNull InterfaceC45686d interfaceC45686d, @NonNull Bitmap bitmap, int i11, int i12) {
        if (bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
                return bitmap;
            }
        } else {
            float fMin = Math.min(i11 / bitmap.getWidth(), i12 / bitmap.getHeight());
            int iRound = Math.round(bitmap.getWidth() * fMin);
            int iRound2 = Math.round(bitmap.getHeight() * fMin);
            if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
                if (Log.isLoggable("TransformationUtils", 2)) {
                    Log.v("TransformationUtils", "adjusted target size matches input, returning input");
                }
            } else {
                Bitmap bitmapMo100813d = interfaceC45686d.mo100813d((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), m4865k(bitmap));
                m4871q(bitmap, bitmapMo100813d);
                if (Log.isLoggable("TransformationUtils", 2)) {
                    Log.v("TransformationUtils", "request: " + i11 + "x" + i12);
                    Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
                    Log.v("TransformationUtils", "toReuse: " + bitmapMo100813d.getWidth() + "x" + bitmapMo100813d.getHeight());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("minPct:   ");
                    sb2.append(fMin);
                    Log.v("TransformationUtils", sb2.toString());
                }
                Matrix matrix = new Matrix();
                matrix.setScale(fMin, fMin);
                m4855a(bitmap, bitmapMo100813d, matrix);
                return bitmapMo100813d;
            }
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: g */
    public static Bitmap m4861g(@NonNull InterfaceC45686d interfaceC45686d, @NonNull Bitmap bitmap) {
        Bitmap.Config configM4862h = m4862h(bitmap);
        if (configM4862h.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapMo100813d = interfaceC45686d.mo100813d(bitmap.getWidth(), bitmap.getHeight(), configM4862h);
        new Canvas(bitmapMo100813d).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapMo100813d;
    }

    /* JADX INFO: renamed from: j */
    public static int m4864j(int i11) {
        switch (i11) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public static Bitmap.Config m4865k(@NonNull Bitmap bitmap) {
        if (bitmap.getConfig() != null) {
            return bitmap.getConfig();
        }
        return Bitmap.Config.ARGB_8888;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m4867m(int i11) {
        switch (i11) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static Bitmap m4868n(@NonNull InterfaceC45686d interfaceC45686d, @NonNull Bitmap bitmap, int i11) {
        if (!m4867m(i11)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m4866l(i11, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapMo100813d = interfaceC45686d.mo100813d(Math.round(rectF.width()), Math.round(rectF.height()), m4865k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapMo100813d.setHasAlpha(bitmap.hasAlpha());
        m4855a(bitmap, bitmapMo100813d, matrix);
        return bitmapMo100813d;
    }

    /* JADX INFO: renamed from: p */
    public static Bitmap m4870p(@NonNull InterfaceC45686d interfaceC45686d, @NonNull Bitmap bitmap, b bVar) {
        Bitmap.Config configM4862h = m4862h(bitmap);
        Bitmap bitmapM4861g = m4861g(interfaceC45686d, bitmap);
        Bitmap bitmapMo100813d = interfaceC45686d.mo100813d(bitmapM4861g.getWidth(), bitmapM4861g.getHeight(), configM4862h);
        bitmapMo100813d.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapM4861g, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapMo100813d.getWidth(), bitmapMo100813d.getHeight());
        Lock lock = f4800e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo100813d);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            bVar.mo4872a(canvas, paint, rectF);
            m4859e(canvas);
            lock.unlock();
            if (!bitmapM4861g.equals(bitmap)) {
                interfaceC45686d.mo4893b(bitmapM4861g);
            }
            return bitmapMo100813d;
        } catch (Throwable th2) {
            f4800e.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m4871q(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
