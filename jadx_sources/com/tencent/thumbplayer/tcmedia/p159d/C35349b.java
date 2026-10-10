package com.tencent.thumbplayer.tcmedia.p159d;

import android.os.SystemClock;
import com.tencent.thumbplayer.tcmedia.api.TPDrmInfo;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import com.tencent.thumbplayer.tcmedia.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPGeneralPlayFlowParams;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b */
/* JADX INFO: loaded from: classes64.dex */
public class C35349b {

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b$a */
    public static class a {

        /* JADX INFO: renamed from: b */
        private long f75985b = SystemClock.elapsedRealtime();

        /* JADX INFO: renamed from: c */
        private long f75986c = System.currentTimeMillis();

        /* JADX INFO: renamed from: a */
        private int f75984a = -1;

        /* JADX INFO: renamed from: a */
        public int m78078a() {
            return this.f75984a;
        }

        /* JADX INFO: renamed from: a */
        public void m78079a(int i11) {
            this.f75984a = i11;
        }

        /* JADX INFO: renamed from: b */
        public long m78080b() {
            return this.f75985b;
        }

        /* JADX INFO: renamed from: c */
        public long m78081c() {
            return this.f75986c;
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b$d */
    public static class d extends a {

        /* JADX INFO: renamed from: a */
        private String f75987a;

        /* JADX INFO: renamed from: b */
        private String f75988b;

        /* JADX INFO: renamed from: a */
        public void m78082a(String str) {
            this.f75987a = str;
        }

        /* JADX INFO: renamed from: b */
        public void m78083b(String str) {
            this.f75988b = str;
        }

        /* JADX INFO: renamed from: d */
        public String m78084d() {
            return this.f75987a;
        }

        /* JADX INFO: renamed from: e */
        public String m78085e() {
            return this.f75988b;
        }

        public d() {
            m78079a(202);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b$e */
    public static class e extends a {

        /* JADX INFO: renamed from: a */
        private int f75989a;

        /* JADX INFO: renamed from: b */
        public void m78086b(int i11) {
            this.f75989a = i11;
        }

        /* JADX INFO: renamed from: d */
        public int m78087d() {
            return this.f75989a;
        }

        public e() {
            m78079a(201);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b$f */
    public static class f extends a {

        /* JADX INFO: renamed from: a */
        private String f75990a;

        /* JADX INFO: renamed from: b */
        private String f75991b;

        /* JADX INFO: renamed from: a */
        public void m78088a(String str) {
            this.f75990a = str;
        }

        /* JADX INFO: renamed from: b */
        public void m78089b(String str) {
            this.f75991b = str;
        }

        /* JADX INFO: renamed from: d */
        public String m78090d() {
            return this.f75990a;
        }

        public f() {
            m78079a(203);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b$h */
    public static class h extends a {

        /* JADX INFO: renamed from: a */
        private TPDrmInfo f75992a;

        /* JADX INFO: renamed from: a */
        public void m78091a(TPDrmInfo tPDrmInfo) {
            this.f75992a = tPDrmInfo;
        }

        /* JADX INFO: renamed from: d */
        public TPDrmInfo m78092d() {
            return this.f75992a;
        }

        public h() {
            m78079a(116);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b$i */
    public static class i extends a {

        /* JADX INFO: renamed from: a */
        private int f75993a;

        /* JADX INFO: renamed from: b */
        private int f75994b;

        /* JADX INFO: renamed from: c */
        private TPGeneralPlayFlowParams f75995c;

        /* JADX INFO: renamed from: d */
        private TPDynamicStatisticParams f75996d;

        /* JADX INFO: renamed from: a */
        public void m78093a(TPDynamicStatisticParams tPDynamicStatisticParams) {
            this.f75996d = tPDynamicStatisticParams;
        }

        /* JADX INFO: renamed from: a */
        public void m78094a(TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
            this.f75995c = tPGeneralPlayFlowParams;
        }

        /* JADX INFO: renamed from: b */
        public void m78095b(int i11) {
            this.f75993a = i11;
        }

        /* JADX INFO: renamed from: c */
        public void m78096c(int i11) {
            this.f75994b = i11;
        }

        /* JADX INFO: renamed from: d */
        public int m78097d() {
            return this.f75993a;
        }

        /* JADX INFO: renamed from: e */
        public int m78098e() {
            return this.f75994b;
        }

        /* JADX INFO: renamed from: f */
        public TPGeneralPlayFlowParams m78099f() {
            return this.f75995c;
        }

        /* JADX INFO: renamed from: g */
        public TPDynamicStatisticParams m78100g() {
            return this.f75996d;
        }

        public i() {
            m78079a(106);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b$l */
    public static class l extends a {

        /* JADX INFO: renamed from: a */
        private TPGeneralPlayFlowParams f75997a;

        /* JADX INFO: renamed from: b */
        private TPDynamicStatisticParams f75998b;

        /* JADX INFO: renamed from: a */
        public void m78101a(TPDynamicStatisticParams tPDynamicStatisticParams) {
            this.f75998b = tPDynamicStatisticParams;
        }

        /* JADX INFO: renamed from: a */
        public void m78102a(TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
            this.f75997a = tPGeneralPlayFlowParams;
        }

        /* JADX INFO: renamed from: d */
        public TPGeneralPlayFlowParams m78103d() {
            return this.f75997a;
        }

        /* JADX INFO: renamed from: e */
        public TPDynamicStatisticParams m78104e() {
            return this.f75998b;
        }

        public l() {
            m78079a(107);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b$n */
    public static class n extends a {

        /* JADX INFO: renamed from: a */
        private TPGeneralPlayFlowParams f75999a;

        /* JADX INFO: renamed from: b */
        private TPDynamicStatisticParams f76000b;

        /* JADX INFO: renamed from: a */
        public void m78105a(TPDynamicStatisticParams tPDynamicStatisticParams) {
            this.f76000b = tPDynamicStatisticParams;
        }

        /* JADX INFO: renamed from: a */
        public void m78106a(TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
            this.f75999a = tPGeneralPlayFlowParams;
        }

        /* JADX INFO: renamed from: d */
        public TPGeneralPlayFlowParams m78107d() {
            return this.f75999a;
        }

        /* JADX INFO: renamed from: e */
        public TPDynamicStatisticParams m78108e() {
            return this.f76000b;
        }

        public n() {
            m78079a(105);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b$o */
    public static class o extends a {

        /* JADX INFO: renamed from: a */
        private long f76001a;

        /* JADX INFO: renamed from: b */
        private int f76002b;

        /* JADX INFO: renamed from: a */
        public void m78109a(long j11) {
            this.f76001a = j11;
        }

        /* JADX INFO: renamed from: b */
        public void m78110b(int i11) {
            this.f76002b = i11;
        }

        /* JADX INFO: renamed from: d */
        public long m78111d() {
            return this.f76001a;
        }

        /* JADX INFO: renamed from: e */
        public int m78112e() {
            return this.f76002b;
        }

        public o() {
            m78079a(102);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b$p */
    public static class p extends a {

        /* JADX INFO: renamed from: a */
        private String f76003a = "";

        /* JADX INFO: renamed from: a */
        public void m78113a(String str) {
            this.f76003a = str;
        }

        /* JADX INFO: renamed from: d */
        public String m78114d() {
            return this.f76003a;
        }

        public p() {
            m78079a(101);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b$s */
    public static class s extends a {

        /* JADX INFO: renamed from: a */
        private int f76004a;

        /* JADX INFO: renamed from: b */
        private long f76005b;

        /* JADX INFO: renamed from: a */
        public void m78115a(long j11) {
            this.f76005b = j11;
        }

        /* JADX INFO: renamed from: b */
        public void m78116b(int i11) {
            this.f76004a = i11;
        }

        /* JADX INFO: renamed from: d */
        public int m78117d() {
            return this.f76004a;
        }

        /* JADX INFO: renamed from: e */
        public long m78118e() {
            return this.f76005b;
        }

        public s() {
            m78079a(115);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b$t */
    public static class t extends a {

        /* JADX INFO: renamed from: a */
        private int f76006a;

        /* JADX INFO: renamed from: b */
        private long f76007b;

        /* JADX INFO: renamed from: c */
        private TPTrackInfo f76008c;

        /* JADX INFO: renamed from: a */
        public void m78119a(long j11) {
            this.f76007b = j11;
        }

        /* JADX INFO: renamed from: a */
        public void m78120a(TPTrackInfo tPTrackInfo) {
            this.f76008c = tPTrackInfo;
        }

        /* JADX INFO: renamed from: b */
        public void m78121b(int i11) {
            this.f76006a = i11;
        }

        /* JADX INFO: renamed from: d */
        public int m78122d() {
            return this.f76006a;
        }

        /* JADX INFO: renamed from: e */
        public long m78123e() {
            return this.f76007b;
        }

        /* JADX INFO: renamed from: f */
        public TPTrackInfo m78124f() {
            return this.f76008c;
        }

        public t() {
            m78079a(114);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b$u */
    public static class u extends a {

        /* JADX INFO: renamed from: a */
        private String f76009a;

        /* JADX INFO: renamed from: b */
        private boolean f76010b;

        /* JADX INFO: renamed from: c */
        private int f76011c;

        /* JADX INFO: renamed from: a */
        public void m78125a(String str) {
            this.f76009a = str;
        }

        /* JADX INFO: renamed from: a */
        public void m78126a(boolean z11) {
            this.f76010b = z11;
        }

        /* JADX INFO: renamed from: b */
        public void m78127b(int i11) {
            this.f76011c = i11;
        }

        /* JADX INFO: renamed from: d */
        public String m78128d() {
            return this.f76009a;
        }

        /* JADX INFO: renamed from: e */
        public boolean m78129e() {
            return this.f76010b;
        }

        /* JADX INFO: renamed from: f */
        public int m78130f() {
            return this.f76011c;
        }

        public u() {
            m78079a(117);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b$v */
    public static class v extends a {

        /* JADX INFO: renamed from: a */
        private float f76012a;

        /* JADX INFO: renamed from: a */
        public void m78131a(float f11) {
            this.f76012a = f11;
        }

        /* JADX INFO: renamed from: d */
        public float m78132d() {
            return this.f76012a;
        }

        public v() {
            m78079a(113);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b$b */
    public static class b extends a {
        public b() {
            m78079a(112);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b$c */
    public static class c extends a {
        public c() {
            m78079a(111);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b$g */
    public static class g extends a {
        public g() {
            m78079a(204);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b$j */
    public static class j extends a {
        public j() {
            m78079a(104);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b$k */
    public static class k extends a {
        public k() {
            m78079a(108);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b$m */
    public static class m extends a {
        public m() {
            m78079a(103);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b$q */
    public static class q extends a {
        public q() {
            m78079a(110);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.b$r */
    public static class r extends a {
        public r() {
            m78079a(109);
        }
    }
}
