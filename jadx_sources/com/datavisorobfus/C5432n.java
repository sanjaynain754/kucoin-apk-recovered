package com.datavisorobfus;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.webkit.WebView;
import com.datavisor.vangogh.face.DVKeyName;
import com.datavisor.vangogh.face.DVTokenClient;
import com.datavisor.vangogh.storage.local.DVJS2Native;
import com.datavisor.vangogh.util.ExceptionUtil;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.datavisorobfus.n */
/* JADX INFO: loaded from: classes34.dex */
public class C5432n {

    /* JADX INFO: renamed from: c */
    private static C5432n f7321c;

    /* JADX INFO: renamed from: a */
    private Context f7322a;

    /* JADX INFO: renamed from: b */
    private DVJS2Native f7323b = null;

    /* JADX INFO: renamed from: com.datavisorobfus.n$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f7324a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f7325b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ DVTokenClient.InitResultListener f7326c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Map f7327d;

        /* JADX INFO: renamed from: com.datavisorobfus.n$a$a, reason: collision with other inner class name */
        public class RunnableC46964a implements Runnable {
            public RunnableC46964a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ExceptionUtil.reportException(C5432n.this.f7322a);
            }
        }

        public a(String str, String str2, DVTokenClient.InitResultListener initResultListener, Map map) {
            this.f7324a = str;
            this.f7325b = str2;
            this.f7326c = initResultListener;
            this.f7327d = map;
        }

        /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:62:0x013b A[Catch: all -> 0x0141, TRY_LEAVE, TryCatch #1 {all -> 0x0141, blocks: (B:60:0x0129, B:62:0x013b), top: B:87:0x0129 }] */
        /* JADX WARN: Code duplicated, block: B:67:0x0145 A[Catch: all -> 0x011b, TRY_ENTER, TryCatch #6 {all -> 0x011b, blocks: (B:51:0x0117, B:55:0x011f, B:57:0x0124, B:67:0x0145, B:69:0x014a), top: B:96:0x0005 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x014a A[Catch: all -> 0x011b, TRY_LEAVE, TryCatch #6 {all -> 0x011b, blocks: (B:51:0x0117, B:55:0x011f, B:57:0x0124, B:67:0x0145, B:69:0x014a), top: B:96:0x0005 }] */
        /* JADX WARN: Code duplicated, block: B:79:0x015e A[Catch: all -> 0x015a, TryCatch #5 {all -> 0x015a, blocks: (B:75:0x0156, B:79:0x015e, B:81:0x0163), top: B:94:0x0156 }] */
        /* JADX WARN: Code duplicated, block: B:81:0x0163 A[Catch: all -> 0x015a, TRY_LEAVE, TryCatch #5 {all -> 0x015a, blocks: (B:75:0x0156, B:79:0x015e, B:81:0x0163), top: B:94:0x0156 }] */
        @Override // java.lang.Runnable
        public void run() {
            RandomAccessFile randomAccessFileM7225a;
            FileChannel channel;
            FileLock fileLockLock;
            DVTokenClient.InitResultListener initResultListener;
            String str;
            String strM7403a;
            FileLock fileLock = null;
            try {
                try {
                    C5432n c5432n = C5432n.this;
                    randomAccessFileM7225a = c5432n.m7225a(c5432n.f7322a);
                    if (randomAccessFileM7225a != null) {
                        try {
                            channel = randomAccessFileM7225a.getChannel();
                            if (channel != null) {
                                try {
                                    fileLockLock = channel.lock();
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        C5415f0.m7139a(th);
                                        fileLockLock = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            C5415f0.m7139a(th);
                                            ExceptionUtil.m7095b("initToken", th, C5432n.this.f7322a);
                                            initResultListener = this.f7326c;
                                            if (initResultListener != null) {
                                                initResultListener.onResult("", 11);
                                            }
                                            if (fileLock != null) {
                                                fileLock.release();
                                            }
                                            if (channel != null) {
                                                channel.close();
                                            }
                                            if (randomAccessFileM7225a == null) {
                                                return;
                                            }
                                            randomAccessFileM7225a.close();
                                        } catch (Throwable th4) {
                                            if (fileLock != null) {
                                                try {
                                                    fileLock.release();
                                                    if (channel != null) {
                                                        channel.close();
                                                    }
                                                    if (randomAccessFileM7225a != null) {
                                                        randomAccessFileM7225a.close();
                                                    }
                                                } catch (Throwable th5) {
                                                    C5415f0.m7139a(th5);
                                                    throw th4;
                                                }
                                            } else {
                                                if (channel != null) {
                                                    channel.close();
                                                }
                                                if (randomAccessFileM7225a != null) {
                                                    randomAccessFileM7225a.close();
                                                }
                                            }
                                            throw th4;
                                        }
                                    }
                                }
                            } else {
                                fileLockLock = null;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            channel = null;
                        }
                    } else {
                        channel = null;
                        fileLockLock = null;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    randomAccessFileM7225a = null;
                    channel = null;
                }
                try {
                    C5422i.m7160b().f7276o = true;
                    C5422i.m7160b().m7166a(this.f7324a);
                    C5422i.m7160b().m7168b(this.f7325b);
                    C5422i.m7160b().f7264c = this.f7326c;
                    C5422i.m7160b().f7265d = null;
                    C5426k.m7189a().f7299g.execute(new RunnableC46964a());
                    System.loadLibrary("dedge");
                    Map map = this.f7327d;
                    if (map == null || (str = (String) map.get(DVKeyName.DV_USER_SESSION_ID_KEY)) == null) {
                        str = "";
                    }
                    if (this.f7327d == null || (strM7403a = C5446u.m7403a(C5411e.m7130b(new TreeMap(this.f7327d)).toString())) == null) {
                        strM7403a = "";
                    }
                    String strM7416e = C5447u0.m7416e(C5432n.this.f7322a, "SPLASTE1HASH");
                    if (strM7416e == null) {
                        strM7416e = "";
                    }
                    boolean zEquals = strM7416e.equals(strM7403a);
                    if (C5457z0.m7482b(strM7403a)) {
                        if (!zEquals) {
                            C5447u0.m7411b(C5432n.this.f7322a, "SPLASTE1HASH", strM7403a);
                        }
                    } else if (C5447u0.m7409a(C5432n.this.f7322a, "SPLASTE1HASH")) {
                        C5447u0.m7412b(C5432n.this.f7322a, "SPLASTE1HASH");
                    }
                    if (!C5422i.m7160b().f7275n || C5428l.m7195a(C5432n.this.f7322a).m7205d() || C5455y0.m7470a(C5432n.this.f7322a).m7479c() || !zEquals) {
                        C5428l.m7195a(C5432n.this.f7322a).m7204a(this.f7327d, str);
                    } else {
                        C5422i.m7160b().m7164a(C5432n.this.f7322a, 0, null, str);
                    }
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    if (randomAccessFileM7225a == null) {
                        return;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    fileLock = fileLockLock;
                    C5415f0.m7139a(th);
                    ExceptionUtil.m7095b("initToken", th, C5432n.this.f7322a);
                    initResultListener = this.f7326c;
                    if (initResultListener != null) {
                        initResultListener.onResult("", 11);
                    }
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    if (randomAccessFileM7225a == null) {
                        return;
                    }
                }
                randomAccessFileM7225a.close();
            } catch (Throwable th9) {
                C5415f0.m7139a(th9);
            }
        }
    }

    /* JADX INFO: renamed from: com.datavisorobfus.n$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ DVTokenClient.GetDVTokenListener f7330a;

        public b(DVTokenClient.GetDVTokenListener getDVTokenListener) {
            this.f7330a = getDVTokenListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            DVTokenClient.GetDVTokenListener getDVTokenListener;
            DVTokenClient.GetDVTokenListener getDVTokenListener2;
            try {
                if (!C5399a.m7098a().m7107h(C5432n.this.f7322a)) {
                    getDVTokenListener2 = this.f7330a;
                    if (getDVTokenListener2 == null) {
                        return;
                    }
                } else {
                    if (C5422i.m7160b().f7276o) {
                        String strM7474a = C5455y0.m7470a(C5432n.this.f7322a).m7474a();
                        if (C5457z0.m7480a(strM7474a)) {
                            strM7474a = C5408d.m7123d(C5432n.this.f7322a);
                            getDVTokenListener = this.f7330a;
                            if (getDVTokenListener == null) {
                                return;
                            }
                        } else {
                            getDVTokenListener = this.f7330a;
                            if (getDVTokenListener == null) {
                                return;
                            }
                        }
                        getDVTokenListener.onResult(strM7474a);
                        return;
                    }
                    getDVTokenListener2 = this.f7330a;
                    if (getDVTokenListener2 == null) {
                        return;
                    }
                }
                getDVTokenListener2.onResult("");
            } catch (Throwable unused) {
                DVTokenClient.GetDVTokenListener getDVTokenListener3 = this.f7330a;
                if (getDVTokenListener3 != null) {
                    getDVTokenListener3.onResult("");
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C5432n m7227b(Context context) {
        if (f7321c == null) {
            synchronized (C5432n.class) {
                try {
                    if (f7321c == null) {
                        f7321c = new C5432n(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f7321c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public RandomAccessFile m7225a(Context context) {
        try {
            File externalFilesDir = Build.VERSION.SDK_INT >= 29 ? context.getExternalFilesDir(null) : Environment.getExternalStorageDirectory();
            if (externalFilesDir == null) {
                return null;
            }
            return new RandomAccessFile(new File(externalFilesDir, ".__ppsk.sys"), "rw");
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            try {
                return new RandomAccessFile(new File(this.f7322a.getApplicationContext().getFilesDir().getPath(), ".__ppsk.sys"), "rw");
            } catch (Throwable th3) {
                C5415f0.m7139a(th3);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m7233b(String str, String str2, Map<String, String> map, DVTokenClient.InitResultListener initResultListener) {
        C5415f0.m7141b(C5420h.f7256a, "Start init DV token");
        if (!C5399a.m7098a().m7107h(this.f7322a)) {
            return false;
        }
        C5426k.m7189a().f7293a.execute(new a(str, str2, initResultListener, map));
        return true;
    }

    private C5432n(Context context) {
        this.f7322a = null;
        if (context instanceof Application) {
            this.f7322a = context;
            return;
        }
        throw new IllegalArgumentException("DVTokenClient initialization error: mContext is null or not ApplicationContext.");
    }

    /* JADX INFO: renamed from: a */
    public String m7228a() {
        try {
            if (!C5399a.m7098a().m7107h(this.f7322a) || !C5422i.m7160b().f7276o) {
                return "";
            }
            String strM7474a = C5455y0.m7470a(this.f7322a).m7474a();
            return C5457z0.m7480a(strM7474a) ? "" : strM7474a;
        } catch (Throwable th2) {
            ExceptionUtil.m7095b("getDVToken", th2, this.f7322a);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public void m7229a(DVTokenClient.GetDVTokenListener getDVTokenListener) {
        new Thread(new b(getDVTokenListener)).start();
    }

    /* JADX INFO: renamed from: a */
    public void m7230a(String str) {
        if (C5399a.m7098a().m7107h(this.f7322a)) {
            C5454y.m7454a(this.f7322a).m7467d(str);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    /* JADX INFO: renamed from: a */
    public boolean m7231a(WebView webView) {
        if (webView == null) {
            return false;
        }
        try {
            System.loadLibrary("dedge");
            if (this.f7323b == null) {
                this.f7323b = new DVJS2Native(this.f7322a, webView);
            }
            webView.getSettings().setJavaScriptEnabled(true);
            webView.addJavascriptInterface(this.f7323b, "dvEdgeRapahelJs2native2");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m7232a(String str, String str2, Map<String, String> map, DVTokenClient.InitResultListener initResultListener) {
        return m7233b(str, str2, map, initResultListener);
    }
}
