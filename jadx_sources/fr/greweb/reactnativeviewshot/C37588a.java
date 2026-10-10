package fr.greweb.reactnativeviewshot;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.zip.Deflater;

/* JADX INFO: renamed from: fr.greweb.reactnativeviewshot.a */
/* JADX INFO: compiled from: ViewShot.java */
/* JADX INFO: loaded from: classes60.dex */
public class C37588a implements UIBlock, com.facebook.react.fabric.interop.UIBlock {

    /* JADX INFO: renamed from: o */
    public static final String f83552o = "a";

    /* JADX INFO: renamed from: p */
    public static byte[] f83553p = new byte[65536];

    /* JADX INFO: renamed from: q */
    public static final Object f83554q = new Object();

    /* JADX INFO: renamed from: r */
    public static final Set<Bitmap> f83555r = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: a */
    public final int f83556a;

    /* JADX INFO: renamed from: b */
    public final String f83557b;

    /* JADX INFO: renamed from: c */
    @c
    public final int f83558c;

    /* JADX INFO: renamed from: d */
    public final double f83559d;

    /* JADX INFO: renamed from: e */
    public final Integer f83560e;

    /* JADX INFO: renamed from: f */
    public final Integer f83561f;

    /* JADX INFO: renamed from: g */
    public final File f83562g;

    /* JADX INFO: renamed from: h */
    public final String f83563h;

    /* JADX INFO: renamed from: i */
    public final Promise f83564i;

    /* JADX INFO: renamed from: j */
    public final Boolean f83565j;

    /* JADX INFO: renamed from: k */
    public final ReactApplicationContext f83566k;

    /* JADX INFO: renamed from: l */
    public final boolean f83567l;

    /* JADX INFO: renamed from: m */
    public final Activity f83568m;

    /* JADX INFO: renamed from: n */
    public final Executor f83569n;

    /* JADX INFO: renamed from: fr.greweb.reactnativeviewshot.a$a */
    /* JADX INFO: compiled from: ViewShot.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UIBlockViewResolver f83570b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ NativeViewHierarchyManager f83571c;

        public a(UIBlockViewResolver uIBlockViewResolver, NativeViewHierarchyManager nativeViewHierarchyManager) {
            this.f83570b = uIBlockViewResolver;
            this.f83571c = nativeViewHierarchyManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewResolveView;
            try {
                if (C37588a.this.f83556a == -1) {
                    viewResolveView = C37588a.this.f83568m.getWindow().getDecorView().findViewById(R.id.content);
                } else {
                    UIBlockViewResolver uIBlockViewResolver = this.f83570b;
                    viewResolveView = uIBlockViewResolver != null ? uIBlockViewResolver.resolveView(C37588a.this.f83556a) : this.f83571c.resolveView(C37588a.this.f83556a);
                }
                if (viewResolveView == null) {
                    Log.e(C37588a.f83552o, "No view found with reactTag: " + C37588a.this.f83556a, new AssertionError());
                    C37588a.this.f83564i.reject("E_UNABLE_TO_SNAPSHOT", "No view found with reactTag: " + C37588a.this.f83556a);
                    return;
                }
                d dVar = new d(C37588a.f83553p);
                dVar.m84760i(C37588a.m84745x(viewResolveView));
                C37588a.f83553p = dVar.m84759h();
                if ("tmpfile".equals(C37588a.this.f83563h) && -1 == C37588a.this.f83558c) {
                    C37588a.this.m84748B(viewResolveView);
                    return;
                }
                if ("tmpfile".equals(C37588a.this.f83563h) && -1 != C37588a.this.f83558c) {
                    C37588a.this.m84749C(viewResolveView);
                    return;
                }
                if (!"base64".equals(C37588a.this.f83563h) && !"zip-base64".equals(C37588a.this.f83563h)) {
                    if ("data-uri".equals(C37588a.this.f83563h)) {
                        C37588a.this.m84747A(viewResolveView);
                        return;
                    }
                    return;
                }
                C37588a.this.m84755z(viewResolveView);
            } catch (Throwable th2) {
                Log.e(C37588a.f83552o, "Failed to capture view snapshot", th2);
                C37588a.this.f83564i.reject("E_UNABLE_TO_SNAPSHOT", "Failed to capture view snapshot");
            }
        }
    }

    /* JADX INFO: renamed from: fr.greweb.reactnativeviewshot.a$b */
    /* JADX INFO: compiled from: ViewShot.java */
    public class b implements PixelCopy.OnPixelCopyFinishedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Canvas f83573a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f83574b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f83575c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Bitmap f83576d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Paint f83577e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CountDownLatch f83578f;

        public b(Canvas canvas, View view, View view2, Bitmap bitmap, Paint paint, CountDownLatch countDownLatch) {
            this.f83573a = canvas;
            this.f83574b = view;
            this.f83575c = view2;
            this.f83576d = bitmap;
            this.f83577e = paint;
            this.f83578f = countDownLatch;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i11) {
            int iSave = this.f83573a.save();
            C37588a.this.m84750p(this.f83573a, this.f83574b, this.f83575c);
            this.f83573a.drawBitmap(this.f83576d, 0.0f, 0.0f, this.f83577e);
            this.f83573a.restoreToCount(iSave);
            C37588a.m84746y(this.f83576d);
            this.f83578f.countDown();
        }
    }

    /* JADX INFO: renamed from: fr.greweb.reactnativeviewshot.a$c */
    /* JADX INFO: compiled from: ViewShot.java */
    public @interface c {

        /* JADX INFO: renamed from: a */
        public static final Bitmap.CompressFormat[] f83580a = {Bitmap.CompressFormat.JPEG, Bitmap.CompressFormat.PNG, Bitmap.CompressFormat.WEBP};
    }

    /* JADX INFO: renamed from: fr.greweb.reactnativeviewshot.a$d */
    /* JADX INFO: compiled from: ViewShot.java */
    public static class d extends ByteArrayOutputStream {
        public d(@NonNull byte[] bArr) {
            super(0);
            ((ByteArrayOutputStream) this).buf = bArr;
        }

        /* JADX INFO: renamed from: g */
        public static int m84756g(int i11) {
            if (i11 >= 0) {
                return i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            throw new OutOfMemoryError();
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public ByteBuffer m84757a(int i11) {
            if (((ByteArrayOutputStream) this).buf.length < i11) {
                m84758b(i11);
            }
            return ByteBuffer.wrap(((ByteArrayOutputStream) this).buf);
        }

        /* JADX INFO: renamed from: b */
        public void m84758b(int i11) {
            int length = ((ByteArrayOutputStream) this).buf.length << 1;
            if (length - i11 < 0) {
                length = i11;
            }
            if (length - 2147483639 > 0) {
                length = m84756g(i11);
            }
            ((ByteArrayOutputStream) this).buf = Arrays.copyOf(((ByteArrayOutputStream) this).buf, length);
        }

        /* JADX INFO: renamed from: h */
        public byte[] m84759h() {
            return ((ByteArrayOutputStream) this).buf;
        }

        /* JADX INFO: renamed from: i */
        public void m84760i(int i11) {
            ((ByteArrayOutputStream) this).count = i11;
        }
    }

    public C37588a(int i11, String str, @c int i12, double d11, Integer num, Integer num2, File file, String str2, Boolean bool, ReactApplicationContext reactApplicationContext, Activity activity, boolean z11, Promise promise, Executor executor) {
        this.f83556a = i11;
        this.f83557b = str;
        this.f83558c = i12;
        this.f83559d = d11;
        this.f83560e = num;
        this.f83561f = num2;
        this.f83562g = file;
        this.f83563h = str2;
        this.f83565j = bool;
        this.f83566k = reactApplicationContext;
        this.f83568m = activity;
        this.f83567l = z11;
        this.f83564i = promise;
        this.f83569n = executor;
    }

    @Override // com.facebook.react.uimanager.UIBlock
    public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
        m84753t(nativeViewHierarchyManager, null);
    }

    /* JADX INFO: renamed from: z */
    public final void m84755z(@NonNull View view) throws IOException {
        String str;
        boolean z11 = -1 == this.f83558c;
        boolean zEquals = "zip-base64".equals(this.f83563h);
        d dVar = new d(f83553p);
        Point pointM84751q = m84751q(view, dVar);
        f83553p = dVar.m84759h();
        int size = dVar.size();
        String str2 = String.format(Locale.US, "%d:%d|", Integer.valueOf(pointM84751q.x), Integer.valueOf(pointM84751q.y));
        if (!z11) {
            str2 = "";
        }
        if (zEquals) {
            Deflater deflater = new Deflater();
            deflater.setInput(f83553p, 0, size);
            deflater.finish();
            d dVar2 = new d(new byte[32]);
            byte[] bArr = new byte[1024];
            while (!deflater.finished()) {
                dVar2.write(bArr, 0, deflater.deflate(bArr));
            }
            str = str2 + Base64.encodeToString(dVar2.m84759h(), 0, dVar2.size(), 2);
        } else {
            str = str2 + Base64.encodeToString(f83553p, 0, size, 2);
        }
        this.f83564i.resolve(str);
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public static Bitmap m84743v(int i11, int i12) {
        synchronized (f83554q) {
            try {
                for (Bitmap bitmap : f83555r) {
                    if (bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
                        f83555r.remove(bitmap);
                        bitmap.eraseColor(0);
                        return bitmap;
                    }
                }
                return Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: w */
    public static Bitmap m84744w(int i11, int i12) {
        synchronized (f83554q) {
            try {
                for (Bitmap bitmap : f83555r) {
                    if (bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
                        f83555r.remove(bitmap);
                        bitmap.eraseColor(0);
                        return bitmap;
                    }
                }
                return Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m84746y(@NonNull Bitmap bitmap) {
        synchronized (f83554q) {
            f83555r.add(bitmap);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m84747A(@NonNull View view) throws IOException {
        d dVar = new d(f83553p);
        m84751q(view, dVar);
        f83553p = dVar.m84759h();
        String strEncodeToString = Base64.encodeToString(f83553p, 0, dVar.size(), 2);
        String str = "jpg".equals(this.f83557b) ? "jpeg" : this.f83557b;
        this.f83564i.resolve("data:image/" + str + ";base64," + strEncodeToString);
    }

    /* JADX INFO: renamed from: B */
    public final void m84748B(@NonNull View view) throws IOException {
        String string = Uri.fromFile(this.f83562g).toString();
        FileOutputStream fileOutputStream = new FileOutputStream(this.f83562g);
        d dVar = new d(f83553p);
        Point pointM84751q = m84751q(view, dVar);
        f83553p = dVar.m84759h();
        int size = dVar.size();
        fileOutputStream.write(String.format(Locale.US, "%d:%d|", Integer.valueOf(pointM84751q.x), Integer.valueOf(pointM84751q.y)).getBytes(Charset.forName("US-ASCII")));
        fileOutputStream.write(f83553p, 0, size);
        fileOutputStream.close();
        this.f83564i.resolve(string);
    }

    /* JADX INFO: renamed from: C */
    public final void m84749C(@NonNull View view) throws IOException {
        m84751q(view, new FileOutputStream(this.f83562g));
        this.f83564i.resolve(Uri.fromFile(this.f83562g).toString());
    }

    @Override // com.facebook.react.fabric.interop.UIBlock
    public void execute(@NonNull UIBlockViewResolver uIBlockViewResolver) {
        m84753t(null, uIBlockViewResolver);
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public final Matrix m84750p(Canvas canvas, @NonNull View view, @NonNull View view2) {
        Matrix matrix = new Matrix();
        LinkedList<View> linkedList = new LinkedList();
        View view3 = view2;
        do {
            linkedList.add(view3);
            view3 = (View) view3.getParent();
        } while (view3 != view);
        Collections.reverse(linkedList);
        for (View view4 : linkedList) {
            canvas.save();
            int paddingTop = 0;
            float left = view4.getLeft() + (view4 != view2 ? view4.getPaddingLeft() : 0) + view4.getTranslationX();
            int top = view4.getTop();
            if (view4 != view2) {
                paddingTop = view4.getPaddingTop();
            }
            float translationY = top + paddingTop + view4.getTranslationY();
            canvas.translate(left, translationY);
            canvas.rotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            canvas.scale(view4.getScaleX(), view4.getScaleY());
            matrix.postTranslate(left, translationY);
            matrix.postRotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            matrix.postScale(view4.getScaleX(), view4.getScaleY());
        }
        return matrix;
    }

    /* JADX INFO: renamed from: r */
    public final Point m84752r(@NonNull View view, @NonNull OutputStream outputStream) {
        int i11;
        View view2 = view;
        int width = view2.getWidth();
        int height = view2.getHeight();
        if (width <= 0 || height <= 0) {
            throw new RuntimeException("Impossible to snapshot the view: view is invalid");
        }
        boolean z11 = false;
        if (this.f83565j.booleanValue()) {
            ScrollView scrollView = (ScrollView) view2;
            int height2 = 0;
            for (int i12 = 0; i12 < scrollView.getChildCount(); i12++) {
                height2 += scrollView.getChildAt(i12).getHeight();
            }
            i11 = height2;
        } else {
            i11 = height;
        }
        Point point = new Point(width, i11);
        Bitmap bitmapM84743v = m84743v(width, i11);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        Canvas canvas = new Canvas(bitmapM84743v);
        view2.draw(canvas);
        for (View view3 : m84754u(view)) {
            if (view3 instanceof TextureView) {
                if (view3.getVisibility() == 0) {
                    TextureView textureView = (TextureView) view3;
                    textureView.setOpaque(z11);
                    Bitmap bitmap = textureView.getBitmap(m84744w(view3.getWidth(), view3.getHeight()));
                    int iSave = canvas.save();
                    m84750p(canvas, view2, view3);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    canvas.restoreToCount(iSave);
                    m84746y(bitmap);
                }
            } else if ((view3 instanceof SurfaceView) && this.f83567l) {
                SurfaceView surfaceView = (SurfaceView) view3;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Bitmap bitmapM84744w = m84744w(view3.getWidth(), view3.getHeight());
                try {
                    PixelCopy.request(surfaceView, bitmapM84744w, new b(canvas, view2, view3, bitmapM84744w, paint, countDownLatch), new Handler(Looper.getMainLooper()));
                    countDownLatch.await(5L, TimeUnit.SECONDS);
                } catch (Exception e11) {
                    Log.e(f83552o, "Cannot PixelCopy for " + surfaceView, e11);
                }
            }
            view2 = view;
            z11 = false;
        }
        Integer num = this.f83560e;
        if (num != null && this.f83561f != null && (num.intValue() != width || this.f83561f.intValue() != i11)) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapM84743v, this.f83560e.intValue(), this.f83561f.intValue(), true);
            m84746y(bitmapM84743v);
            bitmapM84743v = bitmapCreateScaledBitmap;
        }
        int i13 = this.f83558c;
        if (-1 == i13 && (outputStream instanceof d)) {
            int i14 = width * i11 * 4;
            d dVar = (d) m84742s(outputStream);
            bitmapM84743v.copyPixelsToBuffer(dVar.m84757a(i14));
            dVar.m84760i(i14);
        } else {
            bitmapM84743v.compress(c.f83580a[i13], (int) (this.f83559d * 100.0d), outputStream);
        }
        m84746y(bitmapM84743v);
        return point;
    }

    /* JADX INFO: renamed from: t */
    public final void m84753t(NativeViewHierarchyManager nativeViewHierarchyManager, UIBlockViewResolver uIBlockViewResolver) {
        this.f83569n.execute(new a(uIBlockViewResolver, nativeViewHierarchyManager));
    }

    @NonNull
    /* JADX INFO: renamed from: u */
    public final List<View> m84754u(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            arrayList2.addAll(m84754u(viewGroup.getChildAt(i11)));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: x */
    public static int m84745x(@NonNull View view) {
        return Math.min(view.getWidth() * view.getHeight() * 4, 32);
    }

    /* JADX INFO: renamed from: q */
    public final Point m84751q(@NonNull View view, @NonNull OutputStream outputStream) throws IOException {
        try {
            return m84752r(view, outputStream);
        } finally {
            outputStream.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static <T extends A, A> T m84742s(A a11) {
        return a11;
    }
}
