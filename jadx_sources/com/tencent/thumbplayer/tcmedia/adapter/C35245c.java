package com.tencent.thumbplayer.tcmedia.adapter;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.C35243e;
import com.tencent.thumbplayer.tcmedia.api.TPOptionalParam;
import com.tencent.thumbplayer.tcmedia.api.TPProgramInfo;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.c */
/* JADX INFO: loaded from: classes62.dex */
public class C35245c {

    /* JADX INFO: renamed from: a */
    private Object f75711a;

    /* JADX INFO: renamed from: g */
    private b f75717g;

    /* JADX INFO: renamed from: h */
    private boolean f75718h;

    /* JADX INFO: renamed from: i */
    private float f75719i;

    /* JADX INFO: renamed from: j */
    private String f75720j;

    /* JADX INFO: renamed from: k */
    private float f75721k;

    /* JADX INFO: renamed from: o */
    private TPProgramInfo f75725o;

    /* JADX INFO: renamed from: m */
    private int f75723m = -1;

    /* JADX INFO: renamed from: b */
    private Map<String, d> f75712b = new HashMap(0);

    /* JADX INFO: renamed from: c */
    private Map<String, a> f75713c = new HashMap(0);

    /* JADX INFO: renamed from: f */
    private C35250h f75716f = new C35250h();

    /* JADX INFO: renamed from: e */
    private Map<Integer, TPOptionalParam> f75715e = new HashMap(0);

    /* JADX INFO: renamed from: l */
    private Map<Integer, TPTrackInfo> f75722l = new HashMap(0);

    /* JADX INFO: renamed from: n */
    private ArrayList<TPTrackInfo> f75724n = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    private ArrayList<c> f75714d = new ArrayList<>();

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f75726a;

        /* JADX INFO: renamed from: b */
        public String f75727b;

        /* JADX INFO: renamed from: c */
        public List<TPOptionalParam> f75728c;

        /* JADX INFO: renamed from: d */
        public Map<String, String> f75729d;
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.c$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public boolean f75730a;

        /* JADX INFO: renamed from: b */
        public long f75731b;

        /* JADX INFO: renamed from: c */
        public long f75732c;
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.c$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public int f75733a;

        /* JADX INFO: renamed from: b */
        public long f75734b;

        /* JADX INFO: renamed from: c */
        public TPTrackInfo f75735c;
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.c$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public String f75736a;

        /* JADX INFO: renamed from: b */
        public String f75737b;

        /* JADX INFO: renamed from: c */
        public String f75738c;

        /* JADX INFO: renamed from: d */
        public Map<String, String> f75739d;
    }

    /* JADX INFO: renamed from: a */
    public TPTrackInfo m77681a(int i11) {
        return this.f75722l.get(Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: b */
    public TPOptionalParam m77699b(int i11) {
        return this.f75715e.get(Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: a */
    public void m77682a() {
        this.f75712b.clear();
        this.f75713c.clear();
        this.f75718h = false;
        this.f75719i = 1.0f;
        this.f75720j = "";
        this.f75721k = 1.0f;
        this.f75722l.clear();
        this.f75711a = null;
        this.f75715e.clear();
        this.f75716f = new C35250h();
        this.f75717g = null;
        this.f75725o = null;
        this.f75723m = -1;
        this.f75724n.clear();
        this.f75714d.clear();
    }

    /* JADX INFO: renamed from: b */
    public ArrayList<TPTrackInfo> m77700b() {
        return this.f75724n;
    }

    /* JADX INFO: renamed from: c */
    public ArrayList<c> m77705c() {
        return this.f75714d;
    }

    /* JADX INFO: renamed from: d */
    public Object m77706d() {
        return this.f75711a;
    }

    /* JADX INFO: renamed from: e */
    public C35250h m77707e() {
        return this.f75716f;
    }

    /* JADX INFO: renamed from: f */
    public boolean m77708f() {
        C35250h c35250h = this.f75716f;
        return c35250h != null && c35250h.m77813h();
    }

    /* JADX INFO: renamed from: g */
    public boolean m77709g() {
        return this.f75718h;
    }

    /* JADX INFO: renamed from: h */
    public float m77710h() {
        return this.f75719i;
    }

    /* JADX INFO: renamed from: i */
    public String m77711i() {
        return this.f75720j;
    }

    /* JADX INFO: renamed from: j */
    public float m77712j() {
        return this.f75721k;
    }

    /* JADX INFO: renamed from: k */
    public b m77713k() {
        return this.f75717g;
    }

    /* JADX INFO: renamed from: l */
    public TPProgramInfo m77714l() {
        return this.f75725o;
    }

    /* JADX INFO: renamed from: m */
    public List<d> m77715m() {
        ArrayList arrayList = new ArrayList(this.f75712b.size());
        Iterator<Map.Entry<String, d>> it = this.f75712b.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public List<a> m77716n() {
        ArrayList arrayList = new ArrayList(this.f75713c.size());
        Iterator<Map.Entry<String, a>> it = this.f75713c.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public List<TPOptionalParam> m77717o() {
        ArrayList arrayList = new ArrayList(this.f75715e.size());
        Iterator<Map.Entry<Integer, TPOptionalParam>> it = this.f75715e.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m77683a(float f11) {
        this.f75719i = f11;
    }

    /* JADX INFO: renamed from: b */
    public void m77701b(float f11) {
        this.f75721k = f11;
    }

    /* JADX INFO: renamed from: p */
    public boolean m77718p() {
        if (m77707e() == null || m77707e().m77812g() != 2) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m77684a(int i11, long j11, TPTrackInfo tPTrackInfo) {
        this.f75722l.put(Integer.valueOf(tPTrackInfo.getTrackType()), tPTrackInfo);
        if (i11 < 0 || i11 >= this.f75724n.size()) {
            TPLogUtil.m78802w("TPPlaybackParams", "track Index:" + i11 + " is invalid, trackInfoList size:" + this.f75724n.size());
            return;
        }
        c cVar = new c();
        cVar.f75733a = i11;
        cVar.f75734b = j11;
        for (TPTrackInfo tPTrackInfo2 : this.f75724n) {
            if (tPTrackInfo2.trackType == tPTrackInfo.trackType) {
                if ((TextUtils.isEmpty(tPTrackInfo2.name) && TextUtils.isEmpty(tPTrackInfo.name)) || tPTrackInfo2.name.equals(tPTrackInfo.name)) {
                    tPTrackInfo2.isSelected = true;
                    cVar.f75735c = tPTrackInfo2;
                } else {
                    tPTrackInfo2.isSelected = false;
                }
            }
        }
        this.f75714d.add(cVar);
    }

    /* JADX INFO: renamed from: b */
    public void m77702b(int i11, long j11, TPTrackInfo tPTrackInfo) {
        this.f75722l.remove(Integer.valueOf(tPTrackInfo.getTrackType()));
        if (i11 < 0 || i11 >= this.f75724n.size()) {
            TPLogUtil.m78802w("TPPlaybackParams", "track Index:" + i11 + " is invalid, trackInfoList size:" + this.f75724n.size());
            return;
        }
        for (TPTrackInfo tPTrackInfo2 : this.f75724n) {
            if (tPTrackInfo2.trackType == tPTrackInfo.trackType && ((TextUtils.isEmpty(tPTrackInfo2.name) && TextUtils.isEmpty(tPTrackInfo.name)) || tPTrackInfo2.name.equals(tPTrackInfo.name))) {
                tPTrackInfo2.isSelected = false;
                break;
            }
        }
        for (c cVar : this.f75714d) {
            TPTrackInfo tPTrackInfo3 = cVar.f75735c;
            if (tPTrackInfo3 != null && tPTrackInfo3.equals(tPTrackInfo)) {
                this.f75714d.remove(cVar);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77685a(AssetFileDescriptor assetFileDescriptor) {
        this.f75716f.m77801a(assetFileDescriptor);
    }

    /* JADX INFO: renamed from: b */
    public void m77703b(String str) {
        this.f75716f.m77805a(str);
    }

    /* JADX INFO: renamed from: a */
    public void m77686a(ParcelFileDescriptor parcelFileDescriptor) {
        this.f75716f.m77802a(parcelFileDescriptor);
    }

    /* JADX INFO: renamed from: b */
    public void m77704b(boolean z11) {
        if (this.f75717g == null) {
            this.f75717g = new b();
        }
        b bVar = this.f75717g;
        bVar.f75730a = z11;
        bVar.f75731b = 0L;
        bVar.f75732c = -1L;
    }

    /* JADX INFO: renamed from: a */
    public void m77687a(Surface surface) {
        this.f75711a = surface;
    }

    /* JADX INFO: renamed from: a */
    public void m77688a(SurfaceHolder surfaceHolder) {
        this.f75711a = surfaceHolder;
    }

    /* JADX INFO: renamed from: a */
    public void m77689a(C35243e c35243e, Map<String, String> map) {
        this.f75716f.m77803a(c35243e);
        this.f75716f.m77806a(map);
    }

    /* JADX INFO: renamed from: a */
    public void m77690a(TPOptionalParam tPOptionalParam) {
        if (tPOptionalParam != null) {
            this.f75715e.put(Integer.valueOf(tPOptionalParam.getKey()), tPOptionalParam);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77691a(TPProgramInfo tPProgramInfo) {
        this.f75725o = tPProgramInfo;
    }

    /* JADX INFO: renamed from: a */
    public void m77692a(ITPMediaAsset iTPMediaAsset) {
        this.f75716f.m77804a(iTPMediaAsset);
    }

    /* JADX INFO: renamed from: a */
    public void m77693a(String str) {
        this.f75720j = str;
    }

    /* JADX INFO: renamed from: a */
    private void m77679a(String str, String str2) {
        this.f75723m++;
        TPTrackInfo tPTrackInfo = new TPTrackInfo();
        tPTrackInfo.trackType = 2;
        tPTrackInfo.name = str2;
        tPTrackInfo.isSelected = false;
        tPTrackInfo.isExclusive = true;
        tPTrackInfo.isInternal = false;
        this.f75724n.add(tPTrackInfo);
    }

    /* JADX INFO: renamed from: a */
    private void m77680a(String str, String str2, String str3) {
        this.f75723m++;
        TPTrackInfo tPTrackInfo = new TPTrackInfo();
        tPTrackInfo.trackType = 3;
        tPTrackInfo.name = str3;
        tPTrackInfo.isSelected = false;
        tPTrackInfo.isExclusive = true;
        tPTrackInfo.isInternal = false;
        this.f75724n.add(tPTrackInfo);
    }

    /* JADX INFO: renamed from: a */
    public void m77694a(String str, Map<String, String> map) {
        this.f75716f.m77805a(str);
        this.f75716f.m77806a(map);
    }

    /* JADX INFO: renamed from: a */
    public void m77695a(String str, Map<String, String> map, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return;
        }
        d dVar = new d();
        dVar.f75736a = str;
        dVar.f75739d = map;
        dVar.f75737b = str2;
        dVar.f75738c = str3;
        this.f75712b.put(str, dVar);
        m77680a(str, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public void m77696a(String str, Map<String, String> map, String str2, List<TPOptionalParam> list) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        a aVar = new a();
        aVar.f75726a = str;
        aVar.f75729d = map;
        aVar.f75727b = str2;
        aVar.f75728c = list;
        this.f75713c.put(str, aVar);
        m77679a(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public void m77697a(boolean z11) {
        this.f75718h = z11;
    }

    /* JADX INFO: renamed from: a */
    public void m77698a(boolean z11, long j11, long j12) {
        if (this.f75717g == null) {
            this.f75717g = new b();
        }
        b bVar = this.f75717g;
        bVar.f75730a = z11;
        bVar.f75731b = j11;
        bVar.f75732c = j12;
    }
}
