package sc0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.C5313g;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.trtc.tuikit.common.system.ContextProvider;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.util.ArrayList;
import p048c2.AbstractC4789f;
import p048c2.C4781a0;
import p048c2.C4793j;
import p419l2.C42032f;
import p628t1.C44611c;
import p680v1.AbstractC45352c;
import p710w1.InterfaceC45686d;

/* JADX INFO: renamed from: sc0.c */
/* JADX INFO: compiled from: ImageLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class C44385c {

    /* JADX INFO: renamed from: sc0.c$a */
    /* JADX INFO: compiled from: ImageLoader.java */
    public static class a extends AbstractC4789f {

        /* JADX INFO: renamed from: b */
        public final float f98041b;

        /* JADX INFO: renamed from: c */
        public final WeakReference<Context> f98042c;

        @Override // p628t1.InterfaceC44610b
        /* JADX INFO: renamed from: a */
        public void mo4268a(@NonNull MessageDigest messageDigest) {
            messageDigest.update(("blur:" + this.f98041b).getBytes());
        }

        @Override // p048c2.AbstractC4789f
        @Nullable
        /* JADX INFO: renamed from: c */
        public Bitmap mo4851c(@NonNull InterfaceC45686d interfaceC45686d, @NonNull Bitmap bitmap, int i11, int i12) {
            return C44383a.m97888b(this.f98042c.get(), interfaceC45686d, bitmap, (int) this.f98041b);
        }

        public a(Context context, float f11) {
            this.f98041b = f11 * 0.25f;
            this.f98042c = new WeakReference<>(context);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m97891a(Context context, ImageView imageView) {
        if (imageView != null) {
            ComponentCallbacks2C5309c.m6556t(context.getApplicationContext()).m6625m(imageView);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m97893c(Context context, ImageView imageView, Object obj, int i11) {
        m97894d(context, imageView, obj, new C44386d.b().m97912h(i11).m97910f());
    }

    /* JADX INFO: renamed from: d */
    public static void m97894d(Context context, ImageView imageView, Object obj, C44386d c44386d) {
        if (imageView == null) {
            return;
        }
        if (obj == null) {
            imageView.setImageResource(c44386d.m97900c() != 0 ? c44386d.m97900c() : c44386d.m97899b());
        } else {
            m97895e(context, imageView, obj, c44386d);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m97895e(Context context, ImageView imageView, Object obj, C44386d c44386d) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
        }
        C5313g<Drawable> c5313gMo6600K0 = c44386d.m97902e() ? ComponentCallbacks2C5309c.m6556t(context.getApplicationContext()).mo6624l().mo6600K0(obj) : ComponentCallbacks2C5309c.m6556t(context.getApplicationContext()).mo6633u(obj);
        m97896f(context.getApplicationContext(), c5313gMo6600K0, c44386d);
        c5313gMo6600K0.m6594E0(imageView);
        m97897g(imageView, c44386d);
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: f */
    public static void m97896f(Context context, C5313g<?> c5313g, C44386d c44386d) {
        C42032f c42032f = new C42032f();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C4793j());
        if (c44386d.m97901d() > 0) {
            arrayList.add(new C4781a0(m97892b(c44386d.m97901d())));
        }
        if (c44386d.m97898a() > 0.0f && Build.VERSION.SDK_INT < 31) {
            arrayList.add(new a(context, c44386d.m97898a()));
        }
        c42032f.mo92213o0(new C44611c(arrayList));
        if (c44386d.m97900c() != 0) {
            c42032f.mo92188b0(c44386d.m97900c());
        }
        if (c44386d.m97899b() != 0) {
            c42032f.mo92208m(c44386d.m97899b());
        }
        c42032f.mo92200i(c44386d.m97903f() ? AbstractC45352c.f101955b : AbstractC45352c.f101954a);
        c42032f.mo92207l0(c44386d.m97904g());
        c5313g.mo6606a(c42032f);
    }

    /* JADX INFO: renamed from: b */
    public static int m97892b(int i11) {
        return (int) ((i11 * ContextProvider.m79397b().getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: g */
    public static void m97897g(ImageView imageView, C44386d c44386d) {
        float fM97898a = c44386d.m97898a();
        if (fM97898a > 0.0f && Build.VERSION.SDK_INT >= 31) {
            imageView.setRenderEffect(RenderEffect.createBlurEffect(fM97898a, fM97898a, Shader.TileMode.MIRROR));
        }
    }
}
