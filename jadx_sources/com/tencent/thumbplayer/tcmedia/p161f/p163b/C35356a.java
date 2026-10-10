package com.tencent.thumbplayer.tcmedia.p161f.p163b;

import android.os.SystemClock;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.thumbplayer.tcmedia.api.richmedia.TPRichMediaFeature;
import com.tencent.thumbplayer.tcmedia.common.p158a.InterfaceC35304a;
import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.tplayer.plugins.InterfaceC35415a;
import com.tencent.thumbplayer.tcmedia.utils.C35429i;
import com.tencent.thumbplayer.tcmedia.utils.C35432l;
import com.tencent.thumbplayer.tcmedia.utils.C35433m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.f.b.a */
/* JADX INFO: loaded from: classes64.dex */
public class C35356a implements InterfaceC35415a {

    /* JADX INFO: renamed from: b */
    private String f76033b;

    /* JADX INFO: renamed from: c */
    private String f76034c;

    /* JADX INFO: renamed from: d */
    private TPRichMediaFeature[] f76035d;

    /* JADX INFO: renamed from: a */
    C35433m f76032a = new C35433m();

    /* JADX INFO: renamed from: e */
    private int f76036e = 0;

    /* JADX INFO: renamed from: f */
    private int f76037f = 0;

    /* JADX INFO: renamed from: g */
    private int f76038g = -1;

    /* JADX INFO: renamed from: h */
    private long f76039h = 0;

    /* JADX INFO: renamed from: i */
    private List<b> f76040i = new ArrayList();

    /* JADX INFO: renamed from: j */
    private Map<Integer, a> f76041j = new HashMap();

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.f.b.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f76042a;

        /* JADX INFO: renamed from: b */
        public long f76043b;

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.f.b.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public int f76044a;

        /* JADX INFO: renamed from: b */
        public int f76045b;

        /* JADX INFO: renamed from: c */
        public long f76046c;

        private b() {
        }
    }

    /* JADX INFO: renamed from: c */
    private void m78167c() {
        this.f76039h = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: d */
    private void m78170d() {
        m78176g(0);
    }

    /* JADX INFO: renamed from: e */
    private void m78172e() {
        m78176g(0);
    }

    /* JADX INFO: renamed from: f */
    private void m78174f() {
        this.f76035d = null;
        this.f76036e = 0;
        this.f76037f = 0;
        this.f76039h = 0L;
        this.f76040i.clear();
        this.f76041j.clear();
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.InterfaceC35415a
    /* JADX INFO: renamed from: a */
    public void mo78182a() {
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.InterfaceC35415a
    /* JADX INFO: renamed from: b */
    public void mo78184b() {
    }

    /* JADX INFO: renamed from: a */
    private void m78157a(int i11) {
        this.f76036e++;
        b bVar = new b();
        bVar.f76044a = i11;
        bVar.f76045b = this.f76036e;
        bVar.f76046c = SystemClock.elapsedRealtime();
        this.f76040i.add(bVar);
    }

    /* JADX INFO: renamed from: b */
    private void m78165b(int i11) {
        m78166b(i11, 0);
        if (this.f76041j.containsKey(Integer.valueOf(i11))) {
            return;
        }
        this.f76037f++;
        a aVar = new a();
        aVar.f76042a = this.f76037f;
        aVar.f76043b = SystemClock.elapsedRealtime();
        this.f76041j.put(Integer.valueOf(i11), aVar);
    }

    /* JADX INFO: renamed from: c */
    private void m78168c(int i11) {
        m78166b(i11, 0);
    }

    /* JADX INFO: renamed from: d */
    private void m78171d(int i11) {
        m78169c(i11, 0);
    }

    /* JADX INFO: renamed from: e */
    private void m78173e(int i11) {
        m78176g(i11);
    }

    /* JADX INFO: renamed from: f */
    private void m78175f(int i11) {
        this.f76038g = i11;
    }

    /* JADX INFO: renamed from: i */
    private void m78178i(int i11) {
        if (this.f76035d != null) {
            for (int i12 = 0; i12 < this.f76035d.length; i12++) {
                m78166b(i12, 0);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private void m78179j(int i11) {
        if (this.f76035d != null) {
            for (int i12 = 0; i12 < this.f76035d.length; i12++) {
                m78169c(i12, 0);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private String m78180k(int i11) {
        TPRichMediaFeature[] tPRichMediaFeatureArr = this.f76035d;
        return (tPRichMediaFeatureArr == null || i11 < 0 || i11 >= tPRichMediaFeatureArr.length) ? "" : tPRichMediaFeatureArr[i11].getFeatureType();
    }

    /* JADX INFO: renamed from: l */
    private void m78181l(int i11) {
        if (this.f76039h <= 0) {
            return;
        }
        C35432l c35432l = new C35432l();
        c35432l.mo78037a(TypedValues.TransitionType.S_DURATION, SystemClock.elapsedRealtime() - this.f76039h);
        c35432l.mo78036a("code", i11);
        m78164a("rich_media_prepare", c35432l);
        this.f76039h = 0L;
    }

    /* JADX INFO: renamed from: a */
    private void m78158a(int i11, int i12) {
        m78166b(i11, i12);
        m78169c(i11, i12);
    }

    /* JADX INFO: renamed from: b */
    private void m78166b(int i11, int i12) {
        String strM78180k = m78180k(i11);
        Iterator<b> it = this.f76040i.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f76044a == i11) {
                m78161a(next, strM78180k, i12);
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m78169c(int i11, int i12) {
        if (this.f76041j.containsKey(Integer.valueOf(i11))) {
            m78160a(this.f76041j.get(Integer.valueOf(i11)), m78180k(i11), i12);
            this.f76041j.remove(Integer.valueOf(i11));
        }
    }

    /* JADX INFO: renamed from: g */
    private void m78176g(int i11) {
        m78177h(i11);
        m78174f();
    }

    /* JADX INFO: renamed from: h */
    private void m78177h(int i11) {
        m78181l(i11);
        m78178i(i11);
        m78179j(i11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.InterfaceC35415a
    /* JADX INFO: renamed from: a */
    public void mo78183a(int i11, int i12, int i13, String str, Object obj) {
        this.f76032a.writeLock().lock();
        switch (i11) {
            case 300:
                m78167c();
                break;
            case 301:
                m78162a(obj);
                break;
            case 302:
                m78157a(i12);
                break;
            case 303:
                m78165b(i12);
                break;
            case 304:
                m78168c(i12);
                break;
            case 305:
                m78171d(i12);
                break;
            case 306:
                m78170d();
                break;
            case 307:
                m78172e();
                break;
            case 308:
                m78173e(i12);
                break;
            case 309:
                m78163a(str);
                break;
            case 310:
                m78158a(i12, i13);
                break;
            case 311:
                m78175f(i12);
                break;
        }
        this.f76032a.writeLock().unlock();
    }

    /* JADX INFO: renamed from: a */
    private void m78159a(InterfaceC35304a interfaceC35304a) {
        interfaceC35304a.mo78038a("url", this.f76034c);
        interfaceC35304a.mo78038a("flowid", this.f76033b);
        interfaceC35304a.mo78038a(TPDownloadProxyEnum.USER_GUID, TPPlayerConfig.getGuid());
        interfaceC35304a.mo78036a("appplatform", TPPlayerConfig.getPlatform());
        interfaceC35304a.mo78036a("network", C35429i.m78885b());
    }

    /* JADX INFO: renamed from: a */
    private void m78160a(a aVar, String str, int i11) {
        C35432l c35432l = new C35432l();
        c35432l.mo78037a(TypedValues.TransitionType.S_DURATION, SystemClock.elapsedRealtime() - aVar.f76043b);
        c35432l.mo78036a("code", i11);
        c35432l.mo78036a("seq", aVar.f76042a);
        c35432l.mo78038a("featuretype", str);
        c35432l.mo78036a(ViewProps.POSITION, this.f76038g);
        m78164a("rich_media_feature_data_callback", c35432l);
    }

    /* JADX INFO: renamed from: a */
    private void m78161a(b bVar, String str, int i11) {
        C35432l c35432l = new C35432l();
        c35432l.mo78037a(TypedValues.TransitionType.S_DURATION, SystemClock.elapsedRealtime() - bVar.f76046c);
        c35432l.mo78036a("code", i11);
        c35432l.mo78036a("seq", bVar.f76045b);
        c35432l.mo78038a("featuretype", str);
        c35432l.mo78036a(ViewProps.POSITION, this.f76038g);
        m78164a("rich_media_feature_select", c35432l);
    }

    /* JADX INFO: renamed from: a */
    private void m78162a(Object obj) {
        if (obj instanceof TPRichMediaFeature[]) {
            this.f76035d = (TPRichMediaFeature[]) obj;
        }
        m78181l(0);
    }

    /* JADX INFO: renamed from: a */
    private void m78163a(String str) {
        this.f76033b = UUID.randomUUID().toString() + System.nanoTime() + "_" + TPPlayerConfig.getPlatform();
        this.f76034c = str;
    }

    /* JADX INFO: renamed from: a */
    private void m78164a(String str, InterfaceC35304a interfaceC35304a) {
        m78159a(interfaceC35304a);
    }
}
