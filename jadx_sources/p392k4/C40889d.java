package p392k4;

import android.content.Context;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.core.C5656a;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.soloader.nativeloader.NativeLoader;
import com.facebook.soloader.nativeloader.SystemDelegate;
import java.lang.reflect.InvocationTargetException;
import p192d6.C36621b;
import p617s5.C44347s;
import p747x3.C45999a;

/* JADX INFO: renamed from: k4.d */
/* JADX INFO: compiled from: Fresco.java */
/* JADX INFO: loaded from: classes34.dex */
public class C40889d {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f90925a = C40889d.class;

    /* JADX INFO: renamed from: b */
    public static C40892g f90926b;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f90927c;

    /* JADX INFO: renamed from: c */
    public static void m89527c(Context context, ImagePipelineConfig imagePipelineConfig, C40887b c40887b) {
        m89528d(context, imagePipelineConfig, c40887b, true);
    }

    /* JADX INFO: renamed from: f */
    public static C40891f m89530f() {
        return f90926b.get();
    }

    /* JADX INFO: renamed from: a */
    public static ImagePipeline m89525a() {
        return m89526b().m9445j();
    }

    /* JADX INFO: renamed from: b */
    public static C5656a m89526b() {
        return C5656a.m9433l();
    }

    /* JADX INFO: renamed from: d */
    public static void m89528d(Context context, ImagePipelineConfig imagePipelineConfig, C40887b c40887b, boolean z11) {
        if (C36621b.m81959d()) {
            C36621b.m81957a("Fresco#initialize");
        }
        if (f90927c) {
            C45999a.m101484E(f90925a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            f90927c = true;
        }
        C44347s.m97813b(z11);
        if (!NativeLoader.isInitialized()) {
            if (C36621b.m81959d()) {
                C36621b.m81957a("Fresco.initialize->SoLoader.init");
            }
            try {
                Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, context);
            } catch (IllegalAccessException unused) {
                NativeLoader.initIfUninitialized(new SystemDelegate());
            } catch (InvocationTargetException unused2) {
                NativeLoader.initIfUninitialized(new SystemDelegate());
            } catch (ClassNotFoundException unused3) {
                NativeLoader.initIfUninitialized(new SystemDelegate());
            } catch (NoSuchMethodException unused4) {
                NativeLoader.initIfUninitialized(new SystemDelegate());
            } finally {
                if (C36621b.m81959d()) {
                    C36621b.m81958b();
                }
            }
        }
        Context applicationContext = context.getApplicationContext();
        if (imagePipelineConfig == null) {
            C5656a.m9434q(applicationContext);
        } else {
            C5656a.m9435r(imagePipelineConfig);
        }
        m89529e(applicationContext, c40887b);
        if (C36621b.m81959d()) {
            C36621b.m81958b();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m89529e(Context context, C40887b c40887b) {
        if (C36621b.m81959d()) {
            C36621b.m81957a("Fresco.initializeDrawee");
        }
        C40892g c40892g = new C40892g(context, c40887b);
        f90926b = c40892g;
        SimpleDraweeView.m8737b(c40892g);
        if (C36621b.m81959d()) {
            C36621b.m81958b();
        }
    }
}
