package p611s;

import ai.advance.sdk.global.iqa.lib.JNI;
import ai.advance.sdk.global.iqa.lib.code.ErrorCode;
import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.sensorsdata.abtest.entity.AppConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p246f.AbstractC37286h;
import p277g.C37738d;
import p277g.C37739e;
import p277g.InterfaceC37735a;
import p457n.C42687h;

/* JADX INFO: renamed from: s.b1 */
/* JADX INFO: loaded from: classes23.dex */
public class C44208b1 extends C44218f {

    /* JADX INFO: renamed from: b */
    public final InterfaceC44214d1 f97564b;

    /* JADX INFO: renamed from: c */
    public final C37739e f97565c;

    /* JADX INFO: renamed from: d */
    public final String f97566d;

    /* JADX INFO: renamed from: e */
    public final String f97567e;

    /* JADX INFO: renamed from: f */
    public final Map<String, String> f97568f;

    /* JADX INFO: renamed from: g */
    public AtomicInteger f97569g;

    /* JADX INFO: renamed from: h */
    public AtomicInteger f97570h;

    /* JADX INFO: renamed from: i */
    public boolean f97571i;

    /* JADX INFO: renamed from: j */
    public final String f97572j;

    /* JADX INFO: renamed from: k */
    public long f97573k;

    /* JADX INFO: renamed from: l */
    public ExecutorService f97574l;

    /* JADX INFO: renamed from: m */
    public final AtomicBoolean f97575m;

    /* JADX INFO: renamed from: s.b1$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final String f97576b;

        /* JADX INFO: renamed from: c */
        public final String f97577c;

        /* JADX INFO: renamed from: d */
        public final long f97578d;

        public a(String str, String str2, long j11) {
            this.f97576b = str;
            this.f97578d = j11;
            this.f97577c = str2;
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C37738d m97468f() {
            return new C37738d.b("copy_file_from_assets_failed").m85089f(this.f97576b).m85085b("file_not_found").m85096m();
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ C37738d m97469g(long j11, boolean z11, String str) {
            return new C37738d.b("one_model_file_validation_finished").m85087d((int) j11).m85085b(z11 ? AppConstants.AB_TEST_SUCCESS : "FAILED").m85094k("fileSource", str).m85094k("name", this.f97576b).m85094k("url", this.f97577c).m85096m();
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ C37738d m97470h(Exception exc) {
            return new C37738d.b("copy_file_from_assets_failed").m85089f(this.f97576b).m85085b("exception").m85091h(AbstractC37286h.m83484C(exc)).m85096m();
        }

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ C37738d m97471i(String str, String str2, String str3) {
            return new C37738d.b("model_file_md5_not_equal").m85094k("name", this.f97576b).m85094k("fileMD5", str).m85094k("urlMD5", str2).m85094k("url", str3).m85096m();
        }

        /* JADX INFO: renamed from: k */
        public final void m97473k(String str, long j11) {
            C44208b1.this.f97569g.incrementAndGet();
            m97474l(str, true, j11);
            m97479q();
        }

        /* JADX INFO: renamed from: m */
        public final boolean m97475m(String str) {
            if (((C42687h) C44232m.m97530h(this.f97577c, str, C44208b1.this.f97565c).first).m93552d()) {
                return true;
            }
            return ((C42687h) C44232m.m97530h(this.f97577c, str, C44208b1.this.f97565c).first).m93552d();
        }

        /* JADX INFO: renamed from: o */
        public final /* synthetic */ C37738d m97477o() {
            return new C37738d.b("all_model_file_validation_succeed").m85087d((int) (System.currentTimeMillis() - this.f97578d)).m85096m();
        }

        /* JADX INFO: renamed from: p */
        public final boolean m97478p(String str) {
            File file = new File(str);
            if (file.exists()) {
                return m97476n(this.f97577c, file);
            }
            return false;
        }

        /* JADX INFO: renamed from: q */
        public final void m97479q() {
            if (C44208b1.this.f97570h.incrementAndGet() == C44208b1.this.f97568f.size() && C44208b1.this.f97575m.compareAndSet(false, true)) {
                if (C44208b1.this.f97569g.get() != C44208b1.this.f97568f.size()) {
                    C44208b1.this.m97460h();
                } else {
                    C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.y0
                        @Override // p277g.InterfaceC37735a
                        /* JADX INFO: renamed from: a */
                        public final Object mo92a() {
                            return this.f97804a.m97477o();
                        }
                    });
                    C44208b1.this.m97462m();
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m97472j(Context context, String str, String str2) throws IOException {
            String strSubstring;
            String strSubstring2;
            AssetManager assets = context.getAssets();
            if (str.contains("/")) {
                strSubstring = str.substring(0, str.lastIndexOf(47));
            } else {
                strSubstring = "";
            }
            if (str.contains("/")) {
                strSubstring2 = str.substring(str.lastIndexOf(47) + 1);
            } else {
                strSubstring2 = str;
            }
            String[] list = assets.list(strSubstring);
            if (list != null) {
                for (String str3 : list) {
                    if (str3.equals(strSubstring2)) {
                        InputStream inputStreamOpen = assets.open(str);
                        File file = new File(str2);
                        if (!file.getParentFile().exists()) {
                            file.getParentFile().mkdirs();
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i11 = inputStreamOpen.read(bArr);
                            if (i11 != -1) {
                                fileOutputStream.write(bArr, 0, i11);
                            } else {
                                inputStreamOpen.close();
                                fileOutputStream.close();
                                return;
                            }
                        }
                    }
                }
            }
            C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.x0
                @Override // p277g.InterfaceC37735a
                /* JADX INFO: renamed from: a */
                public final Object mo92a() {
                    return this.f97803a.m97468f();
                }
            });
        }

        /* JADX INFO: renamed from: l */
        public final void m97474l(final String str, final boolean z11, final long j11) {
            C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.z0
                @Override // p277g.InterfaceC37735a
                /* JADX INFO: renamed from: a */
                public final Object mo92a() {
                    return this.f97805a.m97469g(j11, z11, str);
                }
            });
        }

        /* JADX INFO: renamed from: n */
        public final boolean m97476n(final String str, File file) {
            final String strM97529g = C44232m.m97529g(file);
            final String strM97458c = C44208b1.this.m97458c(str);
            boolean zEquals = TextUtils.equals(strM97529g, strM97458c);
            if (!zEquals) {
                C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.a1
                    @Override // p277g.InterfaceC37735a
                    /* JADX INFO: renamed from: a */
                    public final Object mo92a() {
                        return this.f97556a.m97471i(strM97529g, strM97458c, str);
                    }
                });
            }
            return zEquals;
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C44208b1.this.f97566d);
            sb2.append(C44208b1.this.f97567e);
            String str = File.separator;
            sb2.append(str);
            sb2.append(this.f97576b);
            String string = sb2.toString();
            if (m97478p(string)) {
                m97473k("private_storage", System.currentTimeMillis() - jCurrentTimeMillis);
                return;
            }
            try {
                m97472j(C44208b1.this.f97649a, C44208b1.this.f97567e + "/" + this.f97576b, C44208b1.this.f97566d + C44208b1.this.f97567e + str + this.f97576b);
            } catch (Exception e11) {
                C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.w0
                    @Override // p277g.InterfaceC37735a
                    /* JADX INFO: renamed from: a */
                    public final Object mo92a() {
                        return this.f97771a.m97470h(e11);
                    }
                });
                C44208b1.this.m97505a(e11);
            }
            if (m97478p(string)) {
                m97473k("copy_from_assets", System.currentTimeMillis() - jCurrentTimeMillis);
            } else if (m97475m(string) && m97478p(string)) {
                m97473k("download_from_server", System.currentTimeMillis() - jCurrentTimeMillis);
            } else {
                m97474l("", false, System.currentTimeMillis() - jCurrentTimeMillis);
                m97479q();
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m97462m() {
        long j11;
        String str;
        String str2;
        String str3;
        this.f97571i = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = this.f97649a;
        if (context == null) {
            j11 = -1;
            str2 = "ApplicationContext is null";
            str = "APPLICATION_CONTEXT_NULL";
            str3 = "applicationContext_null";
        } else {
            JNI.m1356a(context, this.f97572j);
            j11 = 0;
            str = "";
            str2 = str;
            str3 = str2;
        }
        long j12 = j11;
        this.f97571i = false;
        this.f97564b.mo97490b(j12, System.currentTimeMillis() - jCurrentTimeMillis, true, str, str2, str3);
    }

    /* JADX INFO: renamed from: c */
    public final String m97458c(String str) {
        try {
            String[] strArrSplit = str.split("/");
            String[] strArrSplit2 = strArrSplit[strArrSplit.length - 1].split("!");
            return strArrSplit2[strArrSplit2.length - 1];
        } catch (Exception e11) {
            m97505a(e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final Map<String, String> m97459e() {
        HashMap map = new HashMap();
        map.put("card_occlusion_mobilecardocc_classification-ph-v0.0.5.half.dat", "https://r2.advance.ai/production/iqa/sdk/1.0.0/card_occlusion_mobilecardocc_classification-ph-v0.0.5.half.dat!7e174affeb7dbddd2d6c2933414bef66");
        map.put("card_occlusion_mobilecardocc_classification-th-v0.1.2.half.dat", "https://r2.advance.ai/production/iqa/sdk/1.0.0/card_occlusion_mobilecardocc_classification-th-v0.1.2.half.dat!522a7cf0e89175c2af622942ad77400a");
        map.put("global_iqa-card_detection-v0.2.dat", "https://r2.advance.ai/production/iqa/sdk/1.0.0/global_iqa-card_detection-v0.2.dat!7ee34aea37eb70efd18677ebf91f8cfd");
        map.put("global_iqa-quality-v1.2.dat", "https://r2.advance.ai/production/iqa/sdk/1.0.0/global_iqa-quality-v1.2.dat!a53c9f23d6f5655d474c2938f7f89438");
        map.put("glossy_classification_mobilenet_v3_smaller_global-v1.0.half.dat", "https://r2.advance.ai/production/iqa/sdk/1.0.0/glossy_classification_mobilenet_v3_smaller_global-v1.0.half.dat!1b1279f6d23a30c07a0b63c9ae7c506c");
        return map;
    }

    /* JADX INFO: renamed from: h */
    public final void m97460h() {
        this.f97564b.mo97490b(-11L, System.currentTimeMillis() - this.f97573k, false, ErrorCode.MODEL_ERROR.name(), "Model file is incomplete.", "model_file_incomplete");
    }

    public C44208b1(Context context, String str, C37739e c37739e, InterfaceC44214d1 interfaceC44214d1) {
        super(context);
        this.f97575m = new AtomicBoolean(false);
        this.f97569g = new AtomicInteger(0);
        this.f97570h = new AtomicInteger(0);
        this.f97565c = c37739e;
        this.f97572j = str;
        this.f97564b = interfaceC44214d1;
        this.f97568f = m97459e();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getFilesDir().getAbsolutePath());
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append("aai");
        sb2.append(str2);
        this.f97566d = sb2.toString();
        this.f97567e = "aai-iqa-model";
    }

    /* JADX INFO: renamed from: l */
    public void m97461l() {
        C44211c1.m97482R().m83470M("model_file_validation_started");
        this.f97564b.mo97489a();
        this.f97573k = System.currentTimeMillis();
        this.f97574l = Executors.newCachedThreadPool();
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (String str : this.f97568f.keySet()) {
            this.f97574l.submit(new a(str, this.f97568f.get(str), jCurrentTimeMillis));
        }
    }
}
