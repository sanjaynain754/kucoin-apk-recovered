package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C5330k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.C5346f;
import com.bumptech.glide.load.resource.bitmap.C5368a;
import com.bumptech.glide.load.resource.bitmap.C5370c;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p004a2.C0017a;
import p004a2.C0018b;
import p004a2.C0019c;
import p004a2.C0020d;
import p004a2.C0023g;
import p048c2.C4780a;
import p048c2.C4782b;
import p048c2.C4784c;
import p048c2.C4785c0;
import p048c2.C4790g;
import p048c2.C4792i;
import p048c2.C4803t;
import p048c2.C4806w;
import p048c2.C4808y;
import p048c2.C4809z;
import p188d2.C36594a;
import p219e2.C37048d;
import p219e2.C37049e;
import p249f2.C37324a;
import p280g2.C37788a;
import p280g2.C37790c;
import p280g2.C37791d;
import p280g2.C37795h;
import p280g2.C37797j;
import p298h2.C38080a;
import p298h2.C38081b;
import p298h2.C38082c;
import p298h2.C38083d;
import p329i2.C38424p;
import p329i2.InterfaceC38412d;
import p356j2.C40249d;
import p356j2.InterfaceC40247b;
import p419l2.C42032f;
import p419l2.InterfaceC42031e;
import p445m2.C42396g;
import p445m2.InterfaceC42399j;
import p523p2.C43363j;
import p523p2.C43364k;
import p581r1.InterfaceC43896a;
import p628t1.InterfaceC44614f;
import p710w1.InterfaceC45684b;
import p710w1.InterfaceC45686d;
import p745x1.InterfaceC45988h;
import p817z1.C46622a;
import p817z1.C46623b;
import p817z1.C46624c;
import p817z1.C46625d;
import p817z1.C46626e;
import p817z1.C46627f;
import p817z1.C46628g;
import p817z1.C46632k;
import p817z1.C46640s;
import p817z1.C46641t;
import p817z1.C46642u;
import p817z1.C46643v;
import p817z1.C46644w;
import p817z1.C46645x;

/* JADX INFO: renamed from: com.bumptech.glide.c */
/* JADX INFO: compiled from: Glide.java */
/* JADX INFO: loaded from: classes.dex */
public class ComponentCallbacks2C5309c implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: m */
    @GuardedBy("Glide.class")
    public static volatile ComponentCallbacks2C5309c f6648m;

    /* JADX INFO: renamed from: n */
    public static volatile boolean f6649n;

    /* JADX INFO: renamed from: b */
    public final C5346f f6650b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC45686d f6651c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC45988h f6652d;

    /* JADX INFO: renamed from: e */
    public final C5311e f6653e;

    /* JADX INFO: renamed from: f */
    public final Registry f6654f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC45684b f6655g;

    /* JADX INFO: renamed from: h */
    public final C38424p f6656h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC38412d f6657i;

    /* JADX INFO: renamed from: k */
    public final a f6659k;

    /* JADX INFO: renamed from: j */
    @GuardedBy("managers")
    public final List<ComponentCallbacks2C5314h> f6658j = new ArrayList();

    /* JADX INFO: renamed from: l */
    public MemoryCategory f6660l = MemoryCategory.NORMAL;

    /* JADX INFO: renamed from: com.bumptech.glide.c$a */
    /* JADX INFO: compiled from: Glide.java */
    public interface a {
        @NonNull
        C42032f build();
    }

    public ComponentCallbacks2C5309c(@NonNull Context context, @NonNull C5346f c5346f, @NonNull InterfaceC45988h interfaceC45988h, @NonNull InterfaceC45686d interfaceC45686d, @NonNull InterfaceC45684b interfaceC45684b, @NonNull C38424p c38424p, @NonNull InterfaceC38412d interfaceC38412d, int i11, @NonNull a aVar, @NonNull Map<Class<?>, AbstractC5315i<?, ?>> map, @NonNull List<InterfaceC42031e<Object>> list, C5312f c5312f) {
        InterfaceC44614f c4790g;
        InterfaceC44614f c5370c;
        Registry registry;
        this.f6650b = c5346f;
        this.f6651c = interfaceC45686d;
        this.f6655g = interfaceC45684b;
        this.f6652d = interfaceC45988h;
        this.f6656h = c38424p;
        this.f6657i = interfaceC38412d;
        this.f6659k = aVar;
        Resources resources = context.getResources();
        Registry registry2 = new Registry();
        this.f6654f = registry2;
        registry2.m6543q(new DefaultImageHeaderParser());
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 27) {
            registry2.m6543q(new C4803t());
        }
        List<ImageHeaderParser> listM6533g = registry2.m6533g();
        C37788a c37788a = new C37788a(context, listM6533g, interfaceC45686d, interfaceC45684b);
        InterfaceC44614f<ParcelFileDescriptor, Bitmap> interfaceC44614fM6859h = VideoDecoder.m6859h(interfaceC45686d);
        C5368a c5368a = new C5368a(registry2.m6533g(), resources.getDisplayMetrics(), interfaceC45686d, interfaceC45684b);
        if (!c5312f.m6587a(C5310d.c.class) || i12 < 28) {
            c4790g = new C4790g(c5368a);
            c5370c = new C5370c(c5368a, interfaceC45684b);
        } else {
            c5370c = new C4806w();
            c4790g = new C4792i();
        }
        C37048d c37048d = new C37048d(context);
        C46640s.c cVar = new C46640s.c(resources);
        C46640s.d dVar = new C46640s.d(resources);
        C46640s.b bVar = new C46640s.b(resources);
        C46640s.a aVar2 = new C46640s.a(resources);
        C4784c c4784c = new C4784c(interfaceC45684b);
        C38080a c38080a = new C38080a();
        C38083d c38083d = new C38083d();
        ContentResolver contentResolver = context.getContentResolver();
        registry2.m6529c(ByteBuffer.class, new C46624c()).m6529c(InputStream.class, new C46641t(interfaceC45684b)).m6531e("Bitmap", ByteBuffer.class, Bitmap.class, c4790g).m6531e("Bitmap", InputStream.class, Bitmap.class, c5370c);
        if (ParcelFileDescriptorRewinder.m6659c()) {
            registry2.m6531e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C4808y(c5368a));
        }
        registry2.m6531e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, interfaceC44614fM6859h).m6531e("Bitmap", AssetFileDescriptor.class, Bitmap.class, VideoDecoder.m6854c(interfaceC45686d)).m6528b(Bitmap.class, Bitmap.class, C46643v.a.m102881b()).m6531e("Bitmap", Bitmap.class, Bitmap.class, new C4785c0()).m6530d(Bitmap.class, c4784c).m6531e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C4780a(resources, c4790g)).m6531e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C4780a(resources, c5370c)).m6531e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C4780a(resources, interfaceC44614fM6859h)).m6530d(BitmapDrawable.class, new C4782b(interfaceC45686d, c4784c)).m6531e("Gif", InputStream.class, C37790c.class, new C37797j(listM6533g, c37788a, interfaceC45684b)).m6531e("Gif", ByteBuffer.class, C37790c.class, c37788a).m6530d(C37790c.class, new C37791d()).m6528b(InterfaceC43896a.class, InterfaceC43896a.class, C46643v.a.m102881b()).m6531e("Bitmap", InterfaceC43896a.class, Bitmap.class, new C37795h(interfaceC45686d)).m6527a(Uri.class, Drawable.class, c37048d).m6527a(Uri.class, Bitmap.class, new C4809z(c37048d, interfaceC45686d)).m6544r(new C36594a.a()).m6528b(File.class, ByteBuffer.class, new C46625d.b()).m6528b(File.class, InputStream.class, new C46627f.e()).m6527a(File.class, File.class, new C37324a()).m6528b(File.class, ParcelFileDescriptor.class, new C46627f.b()).m6528b(File.class, File.class, C46643v.a.m102881b()).m6544r(new C5330k.a(interfaceC45684b));
        if (ParcelFileDescriptorRewinder.m6659c()) {
            registry = registry2;
            registry.m6544r(new ParcelFileDescriptorRewinder.C5319a());
        } else {
            registry = registry2;
        }
        Class cls = Integer.TYPE;
        registry.m6528b(cls, InputStream.class, cVar).m6528b(cls, ParcelFileDescriptor.class, bVar).m6528b(Integer.class, InputStream.class, cVar).m6528b(Integer.class, ParcelFileDescriptor.class, bVar).m6528b(Integer.class, Uri.class, dVar).m6528b(cls, AssetFileDescriptor.class, aVar2).m6528b(Integer.class, AssetFileDescriptor.class, aVar2).m6528b(cls, Uri.class, dVar).m6528b(String.class, InputStream.class, new C46626e.c()).m6528b(Uri.class, InputStream.class, new C46626e.c()).m6528b(String.class, InputStream.class, new C46642u.c()).m6528b(String.class, ParcelFileDescriptor.class, new C46642u.b()).m6528b(String.class, AssetFileDescriptor.class, new C46642u.a()).m6528b(Uri.class, InputStream.class, new C46622a.c(context.getAssets())).m6528b(Uri.class, ParcelFileDescriptor.class, new C46622a.b(context.getAssets())).m6528b(Uri.class, InputStream.class, new C0018b.a(context)).m6528b(Uri.class, InputStream.class, new C0019c.a(context));
        if (i12 >= 29) {
            registry.m6528b(Uri.class, InputStream.class, new C0020d.c(context));
            registry.m6528b(Uri.class, ParcelFileDescriptor.class, new C0020d.b(context));
        }
        registry.m6528b(Uri.class, InputStream.class, new C46644w.d(contentResolver)).m6528b(Uri.class, ParcelFileDescriptor.class, new C46644w.b(contentResolver)).m6528b(Uri.class, AssetFileDescriptor.class, new C46644w.a(contentResolver)).m6528b(Uri.class, InputStream.class, new C46645x.a()).m6528b(URL.class, InputStream.class, new C0023g.a()).m6528b(Uri.class, File.class, new C46632k.a(context)).m6528b(C46628g.class, InputStream.class, new C0017a.a()).m6528b(byte[].class, ByteBuffer.class, new C46623b.a()).m6528b(byte[].class, InputStream.class, new C46623b.d()).m6528b(Uri.class, Uri.class, C46643v.a.m102881b()).m6528b(Drawable.class, Drawable.class, C46643v.a.m102881b()).m6527a(Drawable.class, Drawable.class, new C37049e()).m6545s(Bitmap.class, BitmapDrawable.class, new C38081b(resources)).m6545s(Bitmap.class, byte[].class, c38080a).m6545s(Drawable.class, byte[].class, new C38082c(interfaceC45686d, c38080a, c38083d)).m6545s(C37790c.class, byte[].class, c38083d);
        InterfaceC44614f<ByteBuffer, Bitmap> interfaceC44614fM6855d = VideoDecoder.m6855d(interfaceC45686d);
        registry.m6527a(ByteBuffer.class, Bitmap.class, interfaceC44614fM6855d);
        registry.m6527a(ByteBuffer.class, BitmapDrawable.class, new C4780a(resources, interfaceC44614fM6855d));
        this.f6653e = new C5311e(context, interfaceC45684b, registry, new C42396g(), aVar, map, list, c5346f, c5312f, i11);
    }

    @GuardedBy("Glide.class")
    /* JADX INFO: renamed from: a */
    public static void m6549a(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        if (f6649n) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f6649n = true;
        m6553m(context, generatedAppGlideModule);
        f6649n = false;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static ComponentCallbacks2C5309c m6550c(@NonNull Context context) {
        if (f6648m == null) {
            GeneratedAppGlideModule generatedAppGlideModuleM6551d = m6551d(context.getApplicationContext());
            synchronized (ComponentCallbacks2C5309c.class) {
                try {
                    if (f6648m == null) {
                        m6549a(context, generatedAppGlideModuleM6551d);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f6648m;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static GeneratedAppGlideModule m6551d(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e11) {
            m6555q(e11);
            return null;
        } catch (InstantiationException e12) {
            m6555q(e12);
            return null;
        } catch (NoSuchMethodException e13) {
            m6555q(e13);
            return null;
        } catch (InvocationTargetException e14) {
            m6555q(e14);
            return null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public static C38424p m6552l(@Nullable Context context) {
        C43363j.m95507e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m6550c(context).m6567k();
    }

    @GuardedBy("Glide.class")
    /* JADX INFO: renamed from: m */
    public static void m6553m(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        m6554n(context, new C5310d(), generatedAppGlideModule);
    }

    /* JADX INFO: renamed from: q */
    public static void m6555q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public InterfaceC45684b m6561e() {
        return this.f6655g;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public InterfaceC45686d m6562f() {
        return this.f6651c;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC38412d m6563g() {
        return this.f6657i;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public Context m6564h() {
        return this.f6653e.getBaseContext();
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public C5311e m6565i() {
        return this.f6653e;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public Registry m6566j() {
        return this.f6654f;
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public C38424p m6567k() {
        return this.f6656h;
    }

    /* JADX INFO: renamed from: o */
    public void m6568o(ComponentCallbacks2C5314h componentCallbacks2C5314h) {
        synchronized (this.f6658j) {
            try {
                if (this.f6658j.contains(componentCallbacks2C5314h)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f6658j.add(componentCallbacks2C5314h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m6569p(@NonNull InterfaceC42399j<?> interfaceC42399j) {
        synchronized (this.f6658j) {
            try {
                Iterator<ComponentCallbacks2C5314h> it = this.f6658j.iterator();
                while (it.hasNext()) {
                    if (it.next().m6618C(interfaceC42399j)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m6571s(ComponentCallbacks2C5314h componentCallbacks2C5314h) {
        synchronized (this.f6658j) {
            try {
                if (!this.f6658j.contains(componentCallbacks2C5314h)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f6658j.remove(componentCallbacks2C5314h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @GuardedBy("Glide.class")
    /* JADX INFO: renamed from: n */
    public static void m6554n(@NonNull Context context, @NonNull C5310d c5310d, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        C38424p.b bVarMo6522e;
        Context applicationContext = context.getApplicationContext();
        List<InterfaceC40247b> listM88603a = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.mo6525c()) {
            listM88603a = new C40249d(applicationContext).m88603a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.mo6521d().isEmpty()) {
            Set<Class<?>> setMo6521d = generatedAppGlideModule.mo6521d();
            Iterator<InterfaceC40247b> it = listM88603a.iterator();
            while (it.hasNext()) {
                InterfaceC40247b next = it.next();
                if (setMo6521d.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<InterfaceC40247b> it2 = listM88603a.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        if (generatedAppGlideModule != null) {
            bVarMo6522e = generatedAppGlideModule.mo6522e();
        } else {
            bVarMo6522e = null;
        }
        c5310d.m6577f(bVarMo6522e);
        Iterator<InterfaceC40247b> it3 = listM88603a.iterator();
        while (it3.hasNext()) {
            it3.next().mo6645a(applicationContext, c5310d);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo6524b(applicationContext, c5310d);
        }
        ComponentCallbacks2C5309c componentCallbacks2C5309cM6572a = c5310d.m6572a(applicationContext);
        for (InterfaceC40247b interfaceC40247b : listM88603a) {
            try {
                interfaceC40247b.mo6646b(applicationContext, componentCallbacks2C5309cM6572a, componentCallbacks2C5309cM6572a.f6654f);
            } catch (AbstractMethodError e11) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + interfaceC40247b.getClass().getName(), e11);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo6523a(applicationContext, componentCallbacks2C5309cM6572a, componentCallbacks2C5309cM6572a.f6654f);
        }
        applicationContext.registerComponentCallbacks(componentCallbacks2C5309cM6572a);
        f6648m = componentCallbacks2C5309cM6572a;
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public static ComponentCallbacks2C5314h m6556t(@NonNull Context context) {
        return m6552l(context).m86625l(context);
    }

    @NonNull
    /* JADX INFO: renamed from: u */
    public static ComponentCallbacks2C5314h m6557u(@NonNull View view) {
        return m6552l(view.getContext()).m86626m(view);
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public static ComponentCallbacks2C5314h m6558v(@NonNull Fragment fragment) {
        return m6552l(fragment.getContext()).m86627n(fragment);
    }

    @NonNull
    /* JADX INFO: renamed from: w */
    public static ComponentCallbacks2C5314h m6559w(@NonNull FragmentActivity fragmentActivity) {
        return m6552l(fragmentActivity).m86628o(fragmentActivity);
    }

    /* JADX INFO: renamed from: b */
    public void m6560b() {
        C43364k.m95509b();
        this.f6652d.m101453c();
        this.f6651c.mo100812c();
        this.f6655g.mo100805c();
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        m6560b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        m6570r(i11);
    }

    /* JADX INFO: renamed from: r */
    public void m6570r(int i11) {
        C43364k.m95509b();
        synchronized (this.f6658j) {
            try {
                Iterator<ComponentCallbacks2C5314h> it = this.f6658j.iterator();
                while (it.hasNext()) {
                    it.next().onTrimMemory(i11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f6652d.mo101447a(i11);
        this.f6651c.mo100811a(i11);
        this.f6655g.mo100804a(i11);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
