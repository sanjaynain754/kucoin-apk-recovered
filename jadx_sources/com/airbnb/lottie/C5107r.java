package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.mlkit.common.sdkinternal.Constants;
import com.tencent.bugly.proguard.C33978va;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.BufferedSource;
import okio.Okio;
import org.tensorflow.lite.schema.BuiltinOptions;
import p297h1.C38072b;
import p297h1.C38076f;
import p444m1.C42383w;
import p484o1.C42924f;
import p484o1.C42930l;

/* JADX INFO: renamed from: com.airbnb.lottie.r */
/* JADX INFO: compiled from: LottieCompositionFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class C5107r {

    /* JADX INFO: renamed from: a */
    public static final Map<String, C5102p0<C5080h>> f6211a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final Set<InterfaceC5106q0> f6212b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static final byte[] f6213c = {BuiltinOptions.UniqueOptions, BuiltinOptions.LeakyReluOptions, 3, 4};

    /* JADX INFO: renamed from: d */
    public static final byte[] f6214d = {31, -117, 8};

    /* JADX INFO: renamed from: B */
    public static C5102p0<C5080h> m5862B(ZipInputStream zipInputStream, @Nullable String str) {
        return m5861A(null, zipInputStream, str);
    }

    @WorkerThread
    /* JADX INFO: renamed from: C */
    public static C5098n0<C5080h> m5863C(@Nullable Context context, ZipInputStream zipInputStream, @Nullable String str) {
        return m5864D(context, zipInputStream, str, true);
    }

    /* JADX INFO: renamed from: j */
    public static C5102p0<C5080h> m5882j(@Nullable final String str, Callable<C5098n0<C5080h>> callable, @Nullable Runnable runnable) {
        C5080h c5080hM85975a = str == null ? null : C38076f.m85974b().m85975a(str);
        C5102p0<C5080h> c5102p0 = c5080hM85975a != null ? new C5102p0<>(c5080hM85975a) : null;
        if (str != null) {
            Map<String, C5102p0<C5080h>> map = f6211a;
            if (map.containsKey(str)) {
                c5102p0 = map.get(str);
            }
        }
        if (c5102p0 != null) {
            if (runnable != null) {
                runnable.run();
            }
            return c5102p0;
        }
        C5102p0<C5080h> c5102p1 = new C5102p0<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            c5102p1.m5816d(new InterfaceC5085j0() { // from class: com.airbnb.lottie.o
                @Override // com.airbnb.lottie.InterfaceC5085j0
                public final void onResult(Object obj) {
                    C5107r.m5877e(str, atomicBoolean, (C5080h) obj);
                }
            });
            c5102p1.m5815c(new InterfaceC5085j0() { // from class: com.airbnb.lottie.p
                @Override // com.airbnb.lottie.InterfaceC5085j0
                public final void onResult(Object obj) {
                    C5107r.m5878f(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, C5102p0<C5080h>> map2 = f6211a;
                map2.put(str, c5102p1);
                if (map2.size() == 1) {
                    m5871K(false);
                }
            }
        }
        return c5102p1;
    }

    @WorkerThread
    /* JADX INFO: renamed from: q */
    public static C5098n0<C5080h> m5889q(InputStream inputStream, @Nullable String str) {
        return m5890r(inputStream, str, true);
    }

    /* JADX INFO: renamed from: A */
    public static C5102p0<C5080h> m5861A(final Context context, final ZipInputStream zipInputStream, @Nullable final String str) {
        return m5882j(str, new Callable() { // from class: com.airbnb.lottie.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5107r.m5863C(context, zipInputStream, str);
            }
        }, new Runnable() { // from class: com.airbnb.lottie.n
            @Override // java.lang.Runnable
            public final void run() {
                C42930l.m94200c(zipInputStream);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0133 A[Catch: IOException -> 0x0294, TryCatch #3 {IOException -> 0x0294, blocks: (B:7:0x001b, B:9:0x0021, B:12:0x002a, B:14:0x0038, B:16:0x0045, B:18:0x004d, B:66:0x0161, B:19:0x0052, B:21:0x005e, B:22:0x0063, B:24:0x006f, B:25:0x0088, B:28:0x0092, B:30:0x009a, B:32:0x00a2, B:35:0x00ac, B:37:0x00b4, B:40:0x00bd, B:41:0x00c2, B:61:0x0129, B:63:0x0133, B:64:0x014e, B:60:0x0108, B:65:0x0152, B:5:0x0011, B:42:0x00e0, B:51:0x00f9, B:59:0x0107, B:58:0x0104), top: B:119:0x0011, inners: #4 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x0133, please report this as an issue */
    @WorkerThread
    /* JADX INFO: renamed from: E */
    public static C5098n0<C5080h> m5865E(Context context, ZipInputStream zipInputStream, @Nullable String str) {
        C5080h c5080hM85975a;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            c5080hM85975a = null;
        } else {
            try {
                c5080hM85975a = C38076f.m85974b().m85975a(str);
            } catch (IOException e11) {
                return new C5098n0<>((Throwable) e11);
            }
        }
        if (c5080hM85975a != null) {
            return new C5098n0<>(c5080hM85975a);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        C5080h c5080hM5811b = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (!m5868H(name, C33978va.f72339h).booleanValue()) {
                return new C5098n0<>((Throwable) new IllegalArgumentException("parse zip file validate failed"));
            }
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase(Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME)) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                c5080hM5811b = m5892t(JsonReader.m5826p(Okio.buffer(Okio.source(zipInputStream))), null, false).m5811b();
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                File file = new File(context.getCacheDir(), str2);
                new FileOutputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i11 = zipInputStream.read(bArr);
                            if (i11 == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i11);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    C42924f.m94159d("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th4);
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        C42924f.m94158c("Failed to delete temp font file " + file.getAbsolutePath() + C33978va.f72339h);
                    }
                    map2.put(str3, typefaceCreateFromFile);
                    nextEntry = zipInputStream.getNextEntry();
                }
                Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                if (!file.delete()) {
                    C42924f.m94158c("Failed to delete temp font file " + file.getAbsolutePath() + C33978va.f72339h);
                }
                map2.put(str3, typefaceCreateFromFile2);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (c5080hM5811b == null) {
            return new C5098n0<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            C5083i0 c5083i0M5883k = m5883k(c5080hM5811b, (String) entry.getKey());
            if (c5083i0M5883k != null) {
                c5083i0M5883k.m5678g(C42930l.m94209l((Bitmap) entry.getValue(), c5083i0M5883k.m5677f(), c5083i0M5883k.m5675d()));
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z11 = false;
            for (C38072b c38072b : c5080hM5811b.m5656g().values()) {
                if (c38072b.m85957a().equals(entry2.getKey())) {
                    c38072b.m85961e((Typeface) entry2.getValue());
                    z11 = true;
                }
            }
            if (!z11) {
                C42924f.m94158c("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator<Map.Entry<String, C5083i0>> it = c5080hM5811b.m5659j().entrySet().iterator();
            while (it.hasNext()) {
                C5083i0 value = it.next().getValue();
                if (value == null) {
                    return null;
                }
                String strM5674c = value.m5674c();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (strM5674c.startsWith("data:") && strM5674c.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(strM5674c.substring(strM5674c.indexOf(44) + 1), 0);
                        value.m5678g(C42930l.m94209l(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), value.m5677f(), value.m5675d()));
                    } catch (IllegalArgumentException e12) {
                        C42924f.m94159d("data URL did not have correct base64 format.", e12);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            C38076f.m85974b().m85976c(str, c5080hM5811b);
        }
        return new C5098n0<>(c5080hM5811b);
    }

    /* JADX INFO: renamed from: F */
    public static Boolean m5866F(BufferedSource bufferedSource) {
        return m5870J(bufferedSource, f6214d);
    }

    /* JADX INFO: renamed from: H */
    public static Boolean m5868H(String str, String str2) {
        try {
            return Boolean.valueOf(new File(str).getCanonicalPath().startsWith(new File(str2).getCanonicalPath()));
        } catch (Throwable unused) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: I */
    public static Boolean m5869I(BufferedSource bufferedSource) {
        return m5870J(bufferedSource, f6213c);
    }

    /* JADX INFO: renamed from: K */
    public static void m5871K(boolean z11) {
        ArrayList arrayList = new ArrayList(f6212b);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((InterfaceC5106q0) arrayList.get(i11)).m5860a(z11);
        }
    }

    /* JADX INFO: renamed from: L */
    public static String m5872L(Context context, @RawRes int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        sb2.append(m5867G(context) ? "_night_" : "_day_");
        sb2.append(i11);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m5877e(String str, AtomicBoolean atomicBoolean, C5080h c5080h) {
        Map<String, C5102p0<C5080h>> map = f6211a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            m5871K(true);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m5878f(String str, AtomicBoolean atomicBoolean, Throwable th2) {
        Map<String, C5102p0<C5080h>> map = f6211a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            m5871K(true);
        }
    }

    /* JADX INFO: renamed from: l */
    public static C5102p0<C5080h> m5884l(Context context, String str) {
        return m5885m(context, str, "asset_" + str);
    }

    @WorkerThread
    /* JADX INFO: renamed from: n */
    public static C5098n0<C5080h> m5886n(Context context, String str) {
        return m5887o(context, str, "asset_" + str);
    }

    @WorkerThread
    /* JADX INFO: renamed from: o */
    public static C5098n0<C5080h> m5887o(Context context, String str, @Nullable String str2) {
        C5080h c5080hM85975a = str2 == null ? null : C38076f.m85974b().m85975a(str2);
        if (c5080hM85975a != null) {
            return new C5098n0<>(c5080hM85975a);
        }
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(context.getAssets().open(str)));
            if (m5869I(bufferedSourceBuffer).booleanValue()) {
                return m5863C(context, new ZipInputStream(bufferedSourceBuffer.inputStream()), str2);
            }
            return m5866F(bufferedSourceBuffer).booleanValue() ? m5889q(new GZIPInputStream(bufferedSourceBuffer.inputStream()), str2) : m5889q(bufferedSourceBuffer.inputStream(), str2);
        } catch (IOException e11) {
            return new C5098n0<>((Throwable) e11);
        }
    }

    /* JADX INFO: renamed from: p */
    public static C5102p0<C5080h> m5888p(final InputStream inputStream, @Nullable final String str) {
        return m5882j(str, new Callable() { // from class: com.airbnb.lottie.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5107r.m5889q(inputStream, str);
            }
        }, new Runnable() { // from class: com.airbnb.lottie.k
            @Override // java.lang.Runnable
            public final void run() {
                C42930l.m94200c(inputStream);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static C5098n0<C5080h> m5892t(JsonReader jsonReader, @Nullable String str, boolean z11) {
        try {
            C5080h c5080hM85975a = str == null ? null : C38076f.m85974b().m85975a(str);
            if (c5080hM85975a != null) {
                return new C5098n0<>(c5080hM85975a);
            }
            C5080h c5080hM92998a = C42383w.m92998a(jsonReader);
            if (str != null) {
                C38076f.m85974b().m85976c(str, c5080hM92998a);
            }
            return new C5098n0<>(c5080hM92998a);
        } catch (Exception e11) {
            return new C5098n0<>((Throwable) e11);
        } finally {
            if (z11) {
                C42930l.m94200c(jsonReader);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static C5102p0<C5080h> m5894v(Context context, @RawRes final int i11, @Nullable final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return m5882j(str, new Callable() { // from class: com.airbnb.lottie.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5107r.m5873a(weakReference, applicationContext, i11, str);
            }
        }, null);
    }

    @WorkerThread
    /* JADX INFO: renamed from: x */
    public static C5098n0<C5080h> m5896x(Context context, @RawRes int i11, @Nullable String str) {
        C5080h c5080hM85975a = str == null ? null : C38076f.m85974b().m85975a(str);
        if (c5080hM85975a != null) {
            return new C5098n0<>(c5080hM85975a);
        }
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(context.getResources().openRawResource(i11)));
            if (m5869I(bufferedSourceBuffer).booleanValue()) {
                return m5863C(context, new ZipInputStream(bufferedSourceBuffer.inputStream()), str);
            }
            if (!m5866F(bufferedSourceBuffer).booleanValue()) {
                return m5889q(bufferedSourceBuffer.inputStream(), str);
            }
            try {
                return m5889q(new GZIPInputStream(bufferedSourceBuffer.inputStream()), str);
            } catch (IOException e11) {
                return new C5098n0<>((Throwable) e11);
            }
        } catch (Resources.NotFoundException e12) {
            return new C5098n0<>((Throwable) e12);
        }
    }

    /* JADX INFO: renamed from: y */
    public static C5102p0<C5080h> m5897y(Context context, String str) {
        return m5898z(context, str, "url_" + str);
    }

    /* JADX INFO: renamed from: z */
    public static C5102p0<C5080h> m5898z(final Context context, final String str, @Nullable final String str2) {
        return m5882j(str2, new Callable() { // from class: com.airbnb.lottie.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5107r.m5874b(context, str, str2);
            }
        }, null);
    }

    @WorkerThread
    /* JADX INFO: renamed from: D */
    public static C5098n0<C5080h> m5864D(@Nullable Context context, ZipInputStream zipInputStream, @Nullable String str, boolean z11) {
        try {
            return m5865E(context, zipInputStream, str);
        } finally {
            if (z11) {
                C42930l.m94200c(zipInputStream);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public static boolean m5867G(Context context) {
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public static Boolean m5870J(BufferedSource bufferedSource, byte[] bArr) {
        try {
            BufferedSource bufferedSourcePeek = bufferedSource.peek();
            for (byte b11 : bArr) {
                if (bufferedSourcePeek.readByte() != b11) {
                    return Boolean.FALSE;
                }
            }
            bufferedSourcePeek.close();
            return Boolean.TRUE;
        } catch (Exception e11) {
            C42924f.m94157b("Failed to check zip file header", e11);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C5098n0 m5873a(WeakReference weakReference, Context context, int i11, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return m5896x(context, i11, str);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C5098n0 m5874b(Context context, String str, String str2) {
        C5098n0<C5080h> c5098n0M92132c = C5072d.m5649i(context).m92132c(context, str, str2);
        if (str2 != null && c5098n0M92132c.m5811b() != null) {
            C38076f.m85974b().m85976c(str2, c5098n0M92132c.m5811b());
        }
        return c5098n0M92132c;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static C5083i0 m5883k(C5080h c5080h, String str) {
        for (C5083i0 c5083i0 : c5080h.m5659j().values()) {
            if (c5083i0.m5674c().equals(str)) {
                return c5083i0;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static C5102p0<C5080h> m5885m(Context context, final String str, @Nullable final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return m5882j(str2, new Callable() { // from class: com.airbnb.lottie.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5107r.m5887o(applicationContext, str, str2);
            }
        }, null);
    }

    @WorkerThread
    /* JADX INFO: renamed from: r */
    public static C5098n0<C5080h> m5890r(InputStream inputStream, @Nullable String str, boolean z11) {
        return m5891s(JsonReader.m5826p(Okio.buffer(Okio.source(inputStream))), str, z11);
    }

    @WorkerThread
    /* JADX INFO: renamed from: s */
    public static C5098n0<C5080h> m5891s(JsonReader jsonReader, @Nullable String str, boolean z11) {
        return m5892t(jsonReader, str, z11);
    }

    /* JADX INFO: renamed from: u */
    public static C5102p0<C5080h> m5893u(Context context, @RawRes int i11) {
        return m5894v(context, i11, m5872L(context, i11));
    }

    @WorkerThread
    /* JADX INFO: renamed from: w */
    public static C5098n0<C5080h> m5895w(Context context, @RawRes int i11) {
        return m5896x(context, i11, m5872L(context, i11));
    }
}
