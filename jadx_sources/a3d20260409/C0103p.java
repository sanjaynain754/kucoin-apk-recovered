package a3d20260409;

import aai.liveness.http.entity.ResultEntity;
import android.content.Context;
import android.util.Pair;
import intl.OoooOOOoooooo;
import intl.oOooooooooooooo;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p277g.C37736b;
import p277g.C37739e;
import p277g.InterfaceC37735a;
import p387k.C40829d;
import p387k.C40832g;
import p457n.C42687h;
import we0.C45819f;

/* JADX INFO: renamed from: a3d20260409.p */
/* JADX INFO: loaded from: classes23.dex */
public class C0103p {

    /* JADX INFO: renamed from: a */
    public static final ExecutorService f401a = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: a3d20260409.p$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f402b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C37739e f403c;

        /* JADX INFO: renamed from: a3d20260409.p$a$a, reason: collision with other inner class name */
        public class C46953a implements InterfaceC37735a<C37736b> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ResultEntity f404a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Pair f405b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ byte[] f406c;

            public C46953a(ResultEntity resultEntity, Pair pair, byte[] bArr) {
                this.f404a = resultEntity;
                this.f405b = pair;
                this.f406c = bArr;
            }

            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C37736b mo92a() {
                return new C37736b.b(OoooOOOoooooo.UPLOAD_VIDEO_FINISH).m85064g(true).m85062e(this.f404a.success).m85060c(this.f404a.message).m85058a(((Integer) this.f405b.second).intValue()).m85061d("video_byte_count", Integer.valueOf(this.f406c.length)).m85061d("network_lib", C0075l.m358a() ? "native" : "cpp").m85063f();
            }
        }

        /* JADX INFO: renamed from: a3d20260409.p$a$b */
        public class b implements InterfaceC37735a<C37736b> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ byte[] f408a;

            public b(byte[] bArr) {
                this.f408a = bArr;
            }

            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C37736b mo92a() {
                return new C37736b.b(OoooOOOoooooo.UPLOAD_VIDEO_START).m85064g(true).m85061d("video_byte_count", Integer.valueOf(this.f408a.length)).m85063f();
            }
        }

        public a(Context context, C37739e c37739e) {
            this.f402b = context;
            this.f403c = c37739e;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                byte[] bArrM475b = C0103p.m475b(this.f402b);
                if (bArrM475b != null) {
                    C45819f.m101227J().m83501y(new b(bArrM475b), this.f403c);
                    byte[] bArrO0o0Oo0o = j3d20260409.O0o0Oo0o(bArrM475b, C0108u.m510j() ? "" : String.valueOf(C0108u.m505e()), "esu2fhj1C0QmBl2Z");
                    if (bArrO0o0Oo0o == null) {
                        return;
                    }
                    Pair<C42687h, Integer> pairM361d = C0075l.m361d(oOooooooooooooo.UPLOAD_VIDEO, bArrO0o0Oo0o, this.f403c);
                    C45819f.m101227J().m83501y(new C46953a((ResultEntity) C40832g.m89353h(((C42687h) pairM361d.first).m93549a(), ResultEntity.class), pairM361d, bArrM475b), this.f403c);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a3d20260409.p$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C37739e f410b;

        /* JADX INFO: renamed from: a3d20260409.p$b$a */
        public class a implements InterfaceC37735a<C37736b> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ResultEntity f411a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f412b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Pair f413c;

            public a(ResultEntity resultEntity, String str, Pair pair) {
                this.f411a = resultEntity;
                this.f412b = str;
                this.f413c = pair;
            }

            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C37736b mo92a() {
                return new C37736b.b(OoooOOOoooooo.UPLOAD_TRACKING_IMAGES_FINISH).m85064g(true).m85062e(this.f411a.success).m85061d("byte_count", Integer.valueOf(this.f412b.length())).m85060c(this.f411a.message).m85058a(((Integer) this.f413c.second).intValue()).m85061d("network_lib", C0075l.m358a() ? "native" : "cpp").m85063f();
            }
        }

        /* JADX INFO: renamed from: a3d20260409.p$b$b, reason: collision with other inner class name */
        public class C46954b implements InterfaceC37735a<C37736b> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f415a;

            public C46954b(String str) {
                this.f415a = str;
            }

            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C37736b mo92a() {
                return new C37736b.b(OoooOOOoooooo.UPLOAD_TRACKING_IMAGES_START).m85064g(true).m85061d("byte_count", Integer.valueOf(this.f415a.length())).m85063f();
            }
        }

        public b(C37739e c37739e) {
            this.f410b = c37739e;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String strOOo0oOo = j3d20260409.oOo0oOo();
                if (strOOo0oOo != null) {
                    C45819f.m101227J().m83501y(new C46954b(strOOo0oOo), this.f410b);
                    Pair<C42687h, Integer> pairM359b = C0075l.m359b(oOooooooooooooo.EVENT_TRACKING_UPLOAD_IMAGE, strOOo0oOo, this.f410b);
                    C45819f.m101227J().m83501y(new a((ResultEntity) C40832g.m89353h(((C42687h) pairM359b.first).m93549a(), ResultEntity.class), strOOo0oOo, pairM359b), this.f410b);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a3d20260409.p$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ File[] f417b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Context f418c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C37739e f419d;

        public c(File[] fileArr, Context context, C37739e c37739e) {
            this.f417b = fileArr;
            this.f418c = context;
            this.f419d = c37739e;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String strOOOOooOOOO = j3d20260409.OOOOooOOOO();
                for (File file : this.f417b) {
                    if (file != null && file.exists()) {
                        String name = file.getName();
                        if (name.endsWith(strOOOOooOOOO)) {
                            String strOo0o0oo = j3d20260409.Oo0o0oo(C40829d.m89337b(this.f418c, name));
                            if (strOo0o0oo != null) {
                                if (((ResultEntity) C40832g.m89353h(((C42687h) C0075l.m359b(oOooooooooooooo.EVENT_TRACKING, strOo0o0oo, this.f419d).first).m93549a(), ResultEntity.class)).success) {
                                    file.delete();
                                } else {
                                    continue;
                                }
                            } else {
                                return;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m474a(Context context, C37739e c37739e) {
        File filesDir;
        File[] fileArrListFiles;
        if (j3d20260409.oOo0oOo0()) {
            f401a.submit(new b(c37739e));
        }
        if (C0109v.m514C()) {
            f401a.submit(new a(context, c37739e));
        }
        if (context != null && (filesDir = context.getFilesDir()) != null && (fileArrListFiles = filesDir.listFiles()) != null && fileArrListFiles.length != 0) {
            f401a.submit(new c(fileArrListFiles, context, c37739e));
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m475b(Context context) {
        String strM521J = C0109v.m521J();
        byte[] bArr = null;
        if (context != null && strM521J != null) {
            File file = new File(context.getFilesDir() + File.separator + strM521J);
            if (!file.exists()) {
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
            } catch (Exception unused) {
            }
            try {
                if (!C0106s.f432l) {
                    file.delete();
                }
            } catch (Exception unused2) {
            }
        }
        return bArr;
    }
}
