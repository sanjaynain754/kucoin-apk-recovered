package p484o1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C5072d;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import p218e1.C37041u;
import p248f1.C37308d;

/* JADX INFO: renamed from: o1.l */
/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C42930l {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<PathMeasure> f95050a = new a();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<Path> f95051b = new b();

    /* JADX INFO: renamed from: c */
    public static final ThreadLocal<Path> f95052c = new c();

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal<float[]> f95053d = new d();

    /* JADX INFO: renamed from: e */
    public static final float f95054e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* JADX INFO: renamed from: o1.l$a */
    /* JADX INFO: compiled from: Utils.java */
    public class a extends ThreadLocal<PathMeasure> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* JADX INFO: renamed from: o1.l$b */
    /* JADX INFO: compiled from: Utils.java */
    public class b extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    /* JADX INFO: renamed from: o1.l$c */
    /* JADX INFO: compiled from: Utils.java */
    public class c extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    /* JADX INFO: renamed from: o1.l$d */
    /* JADX INFO: compiled from: Utils.java */
    public class d extends ThreadLocal<float[]> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m94206i(float f11, float f12, float f13, float f14) {
        int i11 = f11 != 0.0f ? (int) (527 * f11) : 17;
        if (f12 != 0.0f) {
            i11 = (int) (i11 * 31 * f12);
        }
        if (f13 != 0.0f) {
            i11 = (int) (i11 * 31 * f13);
        }
        return f14 != 0.0f ? (int) (i11 * 31 * f14) : i11;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m94207j(int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i11 < i14) {
            return false;
        }
        if (i11 > i14) {
            return true;
        }
        if (i12 < i15) {
            return false;
        }
        return i12 > i15 || i13 >= i16;
    }

    /* JADX INFO: renamed from: b */
    public static void m94199b(Path path, @Nullable C37041u c37041u) {
        if (c37041u == null || c37041u.m82889k()) {
            return;
        }
        m94198a(path, ((C37308d) c37041u.m82887i()).m83855q() / 100.0f, ((C37308d) c37041u.m82885c()).m83855q() / 100.0f, ((C37308d) c37041u.m82886g()).m83855q() / 360.0f);
    }

    /* JADX INFO: renamed from: c */
    public static void m94200c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static Path m94201d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
            return path;
        }
        float f11 = pointF.x + pointF3.x;
        float f12 = pointF.y + pointF3.y;
        float f13 = pointF2.x;
        float f14 = f13 + pointF4.x;
        float f15 = pointF2.y;
        path.cubicTo(f11, f12, f14, f15 + pointF4.y, f13, f15);
        return path;
    }

    /* JADX INFO: renamed from: g */
    public static float m94204g(Matrix matrix) {
        float[] fArr = f95053d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f11 = f95054e;
        fArr[2] = f11;
        fArr[3] = f11;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m94205h(Matrix matrix) {
        float[] fArr = f95053d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    /* JADX INFO: renamed from: k */
    public static boolean m94208k(Throwable th2) {
        return (th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException);
    }

    /* JADX INFO: renamed from: m */
    public static void m94210m(Canvas canvas, RectF rectF, Paint paint) {
        m94211n(canvas, rectF, paint, 31);
    }

    /* JADX INFO: renamed from: a */
    public static void m94198a(Path path, float f11, float f12, float f13) {
        if (C5072d.m5647g()) {
            C5072d.m5642b("applyTrimPathIfNeeded");
        }
        PathMeasure pathMeasure = f95050a.get();
        Path path2 = f95051b.get();
        Path path3 = f95052c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f11 == 1.0f && f12 == 0.0f) {
            if (C5072d.m5647g()) {
                C5072d.m5643c("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (length >= 1.0f && Math.abs((f12 - f11) - 1.0f) >= 0.01d) {
            float f14 = f11 * length;
            float f15 = f12 * length;
            float f16 = f13 * length;
            float fMin = Math.min(f14, f15) + f16;
            float fMax = Math.max(f14, f15) + f16;
            if (fMin >= length && fMax >= length) {
                fMin = C42929k.m94192f(fMin, length);
                fMax = C42929k.m94192f(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = C42929k.m94192f(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = C42929k.m94192f(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                if (C5072d.m5647g()) {
                    C5072d.m5643c("applyTrimPathIfNeeded");
                    return;
                }
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            if (C5072d.m5647g()) {
                C5072d.m5643c("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (C5072d.m5647g()) {
            C5072d.m5643c("applyTrimPathIfNeeded");
        }
    }

    /* JADX INFO: renamed from: e */
    public static float m94202e() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: f */
    public static float m94203f(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* JADX INFO: renamed from: l */
    public static Bitmap m94209l(Bitmap bitmap, int i11, int i12) {
        if (bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i11, i12, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    /* JADX INFO: renamed from: n */
    public static void m94211n(Canvas canvas, RectF rectF, Paint paint, int i11) {
        if (C5072d.m5647g()) {
            C5072d.m5642b("Utils#saveLayer");
        }
        canvas.saveLayer(rectF, paint);
        if (C5072d.m5647g()) {
            C5072d.m5643c("Utils#saveLayer");
        }
    }
}
