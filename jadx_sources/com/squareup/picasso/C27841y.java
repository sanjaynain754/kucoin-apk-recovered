package com.squareup.picasso;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import androidx.media3.datasource.cache.CacheDataSink;
import com.jumio.core.constants.ConstantsKt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: renamed from: com.squareup.picasso.y */
/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes59.dex */
public final class C27841y {

    /* JADX INFO: renamed from: a */
    public static final StringBuilder f56886a = new StringBuilder();

    /* JADX INFO: renamed from: b */
    public static final ByteString f56887b = ByteString.encodeUtf8("RIFF");

    /* JADX INFO: renamed from: c */
    public static final ByteString f56888c = ByteString.encodeUtf8(ConstantsKt.FILE_TYPE_WEBP);

    /* JADX INFO: renamed from: com.squareup.picasso.y$b */
    /* JADX INFO: compiled from: Utils.java */
    public static class b extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }

        public b(Runnable runnable) {
            super(runnable);
        }
    }

    /* JADX INFO: renamed from: com.squareup.picasso.y$c */
    /* JADX INFO: compiled from: Utils.java */
    public static class c implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new b(runnable);
        }
    }

    /* JADX INFO: renamed from: com.squareup.picasso.y$a */
    /* JADX INFO: compiled from: Utils.java */
    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000L);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m68936b(Context context) {
        ActivityManager activityManager = (ActivityManager) m68948n(context, "activity");
        return (int) ((((long) ((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass())) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) / 7);
    }

    /* JADX INFO: renamed from: d */
    public static <T> T m68938d(T t11, String str) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: renamed from: e */
    public static File m68939e(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: f */
    public static String m68940f(C27834r c27834r) {
        StringBuilder sb2 = f56886a;
        String strM68941g = m68941g(c27834r, sb2);
        sb2.setLength(0);
        return strM68941g;
    }

    /* JADX INFO: renamed from: g */
    public static String m68941g(C27834r c27834r, StringBuilder sb2) {
        String str = c27834r.f56805f;
        if (str != null) {
            sb2.ensureCapacity(str.length() + 50);
            sb2.append(c27834r.f56805f);
        } else {
            Uri uri = c27834r.f56803d;
            if (uri != null) {
                String string = uri.toString();
                sb2.ensureCapacity(string.length() + 50);
                sb2.append(string);
            } else {
                sb2.ensureCapacity(50);
                sb2.append(c27834r.f56804e);
            }
        }
        sb2.append('\n');
        if (c27834r.f56813n != 0.0f) {
            sb2.append("rotation:");
            sb2.append(c27834r.f56813n);
            if (c27834r.f56816q) {
                sb2.append('@');
                sb2.append(c27834r.f56814o);
                sb2.append('x');
                sb2.append(c27834r.f56815p);
            }
            sb2.append('\n');
        }
        if (c27834r.m68893c()) {
            sb2.append("resize:");
            sb2.append(c27834r.f56807h);
            sb2.append('x');
            sb2.append(c27834r.f56808i);
            sb2.append('\n');
        }
        if (c27834r.f56809j) {
            sb2.append("centerCrop:");
            sb2.append(c27834r.f56810k);
            sb2.append('\n');
        } else if (c27834r.f56811l) {
            sb2.append("centerInside");
            sb2.append('\n');
        }
        List<InterfaceC27840x> list = c27834r.f56806g;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                sb2.append(c27834r.f56806g.get(i11).key());
                sb2.append('\n');
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: h */
    public static void m68942h(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
    }

    /* JADX INFO: renamed from: j */
    public static String m68944j(RunnableC27819c runnableC27819c) {
        return m68945k(runnableC27819c, "");
    }

    /* JADX INFO: renamed from: k */
    public static String m68945k(RunnableC27819c runnableC27819c, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        AbstractC27817a abstractC27817aM68832h = runnableC27819c.m68832h();
        if (abstractC27817aM68832h != null) {
            sb2.append(abstractC27817aM68832h.f56707b.m68894d());
        }
        List<AbstractC27817a> listM68833i = runnableC27819c.m68833i();
        if (listM68833i != null) {
            int size = listM68833i.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (i11 > 0 || abstractC27817aM68832h != null) {
                    sb2.append(", ");
                }
                sb2.append(listM68833i.get(i11).f56707b.m68894d());
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: l */
    public static int m68946l(Resources resources, C27834r c27834r) throws FileNotFoundException {
        Uri uri;
        int i11 = c27834r.f56804e;
        if (i11 != 0 || (uri = c27834r.f56803d) == null) {
            return i11;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + c27834r.f56803d);
        }
        List<String> pathSegments = c27834r.f56803d.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            throw new FileNotFoundException("No path segments: " + c27834r.f56803d);
        }
        if (pathSegments.size() == 1) {
            try {
                return Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new FileNotFoundException("Last path segment is not a resource ID: " + c27834r.f56803d);
            }
        }
        if (pathSegments.size() == 2) {
            return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        }
        throw new FileNotFoundException("More than two path segments: " + c27834r.f56803d);
    }

    /* JADX INFO: renamed from: m */
    public static Resources m68947m(Context context, C27834r c27834r) throws FileNotFoundException {
        Uri uri;
        if (c27834r.f56804e != 0 || (uri = c27834r.f56803d) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + c27834r.f56803d);
        }
        try {
            return context.getPackageManager().getResourcesForApplication(authority);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new FileNotFoundException("Unable to obtain resources for package: " + c27834r.f56803d);
        }
    }

    /* JADX INFO: renamed from: r */
    public static boolean m68952r(BufferedSource bufferedSource) throws IOException {
        return bufferedSource.rangeEquals(0L, f56887b) && bufferedSource.rangeEquals(8L, f56888c);
    }

    /* JADX INFO: renamed from: s */
    public static void m68953s(String str, String str2, String str3) {
        m68954t(str, str2, str3, "");
    }

    /* JADX INFO: renamed from: t */
    public static void m68954t(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }

    @TargetApi(18)
    /* JADX INFO: renamed from: a */
    public static long m68935a(File file) {
        long blockCountLong;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            blockCountLong = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            blockCountLong = 5242880;
        }
        return Math.max(Math.min(blockCountLong, 52428800L), CacheDataSink.DEFAULT_FRAGMENT_SIZE);
    }

    /* JADX INFO: renamed from: c */
    public static void m68937c() {
        if (m68951q()) {
        } else {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m68943i(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    /* JADX INFO: renamed from: n */
    public static <T> T m68948n(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m68949o(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m68950p(Context context) {
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 0) {
                return false;
            }
            return true;
        } catch (NullPointerException | SecurityException unused) {
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m68951q() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
