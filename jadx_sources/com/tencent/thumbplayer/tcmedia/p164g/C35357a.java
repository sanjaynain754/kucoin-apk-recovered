package com.tencent.thumbplayer.tcmedia.p164g;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.thumbplayer.tcmedia.p164g.p166b.AbstractC35366f;
import com.tencent.thumbplayer.tcmedia.p164g.p166b.C35361a;
import com.tencent.thumbplayer.tcmedia.p164g.p166b.C35364d;
import com.tencent.thumbplayer.tcmedia.p164g.p166b.C35365e;
import com.tencent.thumbplayer.tcmedia.p164g.p166b.C35367g;
import com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c;
import com.tencent.thumbplayer.tcmedia.p164g.p168d.C35370a;
import com.tencent.thumbplayer.tcmedia.p164g.p169e.C35373a;
import com.tencent.thumbplayer.tcmedia.p164g.p171f.C35376a;
import com.tencent.thumbplayer.tcmedia.p164g.p171f.C35377b;
import com.tencent.thumbplayer.tcmedia.p164g.p173h.C35380b;
import com.tencent.thumbplayer.tcmedia.p164g.p173h.C35381c;
import com.tencent.thumbplayer.tcmedia.p164g.p173h.InterfaceC35379a;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.a */
/* JADX INFO: loaded from: classes64.dex */
public final class C35357a {

    /* JADX INFO: renamed from: a */
    private static final C35357a f76047a = new C35357a();

    /* JADX INFO: renamed from: e */
    private static boolean f76048e = false;

    /* JADX INFO: renamed from: f */
    private static boolean f76049f = true;

    /* JADX INFO: renamed from: d */
    private boolean f76052d;

    /* JADX INFO: renamed from: b */
    private C35377b f76050b = C35377b.f76175e;

    /* JADX INFO: renamed from: c */
    private boolean f76051c = true;

    /* JADX INFO: renamed from: g */
    private final HashMap<C35360b, InterfaceC35363c> f76053g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    private final C35373a f76054h = new C35373a();

    /* JADX INFO: renamed from: i */
    private final C35370a f76055i = new C35370a();

    /* JADX INFO: renamed from: j */
    private final C35370a f76056j = new C35370a();

    /* JADX INFO: renamed from: k */
    private boolean f76057k = true;

    /* JADX INFO: renamed from: a */
    public static C35357a m78185a() {
        return f76047a;
    }

    /* JADX INFO: renamed from: b */
    private InterfaceC35363c m78189b(MediaFormat mediaFormat, C35360b c35360b) {
        if (C35380b.m78332a()) {
            C35380b.m78334b("TCodecManager", "createNewReuseCodecWrapper mediaFormat:" + mediaFormat + " createBy:" + c35360b.m78212a() + " nameOrType:" + c35360b.m78236l());
        }
        String string = mediaFormat.getString("mime");
        C35365e c35365eM78255a = C35365e.m78255a(mediaFormat);
        C35376a.m78316a(c35365eM78255a, mediaFormat);
        return AbstractC35366f.m78261a(c35360b.m78212a() == C35360b.b.CreateByName ? MediaCodec.createByCodecName(c35360b.m78236l()) : MediaCodec.createDecoderByType(string), string, c35365eM78255a);
    }

    /* JADX INFO: renamed from: c */
    private void m78191c(InterfaceC35363c interfaceC35363c) {
        C35370a c35370a;
        if (m78200e()) {
            if (interfaceC35363c instanceof C35367g) {
                c35370a = this.f76055i;
            } else if (!(interfaceC35363c instanceof C35361a)) {
                return;
            } else {
                c35370a = this.f76056j;
            }
            c35370a.m78291a((AbstractC35366f) interfaceC35363c);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m78190b() {
    }

    /* JADX INFO: renamed from: c */
    public static boolean m78192c() {
        return f76049f;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC35363c m78193a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i11, C35360b c35360b) {
        if (C35380b.m78332a()) {
            C35380b.m78334b("TCodecManager", "configureStart videoPoolInfo:" + this.f76055i.m78290a() + ", audioPoolInfo:" + this.f76056j.m78290a());
        }
        this.f76052d = true;
        this.f76057k = true;
        InterfaceC35363c interfaceC35363cM78187a = m78187a(mediaFormat, c35360b, surface);
        m78191c(interfaceC35363cM78187a);
        interfaceC35363cM78187a.mo78245a(c35360b.m78225c());
        interfaceC35363cM78187a.mo78243a(mediaFormat, surface, mediaCrypto, i11);
        if (C35380b.m78332a()) {
            C35380b.m78334b("TCodecManager", "configureEnd   videoPoolInfo:" + this.f76055i.m78290a() + ", audioPoolInfo:" + this.f76056j.m78290a());
        }
        return interfaceC35363cM78187a;
    }

    /* JADX INFO: renamed from: d */
    public final C35377b m78199d() {
        return this.f76050b;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m78200e() {
        return this.f76051c;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m78201f() {
        return this.f76057k;
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC35363c m78186a(MediaFormat mediaFormat, C35360b c35360b) {
        if (C35380b.m78332a()) {
            C35380b.m78334b("TCodecManager", "createDirectCodecWrapper mediaFormat:" + mediaFormat + " createBy:" + c35360b.m78212a() + " nameOrType:" + c35360b.m78236l());
        }
        return c35360b.m78212a() == C35360b.b.CreateByName ? new C35364d(MediaCodec.createByCodecName(c35360b.m78236l())) : new C35364d(MediaCodec.createDecoderByType(c35360b.m78236l()));
    }

    /* JADX INFO: renamed from: b */
    public final void m78198b(InterfaceC35363c interfaceC35363c) {
        C35370a c35370a;
        if (m78200e()) {
            if (interfaceC35363c instanceof C35367g) {
                c35370a = this.f76055i;
            } else if (!(interfaceC35363c instanceof C35361a)) {
                return;
            } else {
                c35370a = this.f76056j;
            }
            c35370a.m78293c((AbstractC35366f) interfaceC35363c);
        }
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC35363c m78187a(MediaFormat mediaFormat, C35360b c35360b, Surface surface) {
        boolean zM78224b = c35360b.m78224b();
        if (C35380b.m78332a()) {
            C35380b.m78334b("TCodecManager", "getCodec isVideo:" + zM78224b + " codecFinalReuseEnable:" + c35360b.f76058a);
        }
        if (!c35360b.f76058a) {
            c35360b.f76059b = false;
            if (C35380b.m78332a()) {
                C35380b.m78334b("TCodecManager", "getCodec return DirectCodecWrapper for mediaFormat:" + mediaFormat + " codecFinalReuseEnable:false surface:" + surface);
            }
            return m78186a(mediaFormat, c35360b);
        }
        C35365e c35365eM78255a = C35365e.m78255a(mediaFormat);
        InterfaceC35363c interfaceC35363cM78188a = m78188a(zM78224b, c35365eM78255a);
        C35365e.m78257a(c35365eM78255a.f76079a);
        if (interfaceC35363cM78188a != null) {
            C35376a.b bVarMo78246b = interfaceC35363cM78188a.mo78246b(c35365eM78255a);
            if (bVarMo78246b == C35376a.b.KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION || bVarMo78246b == C35376a.b.KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION) {
                if (C35380b.m78332a()) {
                    C35380b.m78334b("TCodecManager", "getCodec reuse, isVideo:" + zM78224b + " reuseType:" + bVarMo78246b);
                }
                interfaceC35363cM78188a.mo78247b();
                interfaceC35363cM78188a.mo78248c();
                c35360b.f76059b = true;
                return interfaceC35363cM78188a;
            }
            if (bVarMo78246b == C35376a.b.KEEP_CODEC_RESULT_NO && C35380b.m78332a()) {
                C35380b.m78337d("TCodecManager", "getCodec not reuse, isVideo:" + zM78224b + " reuseType:" + bVarMo78246b);
            }
        }
        if (C35380b.m78332a()) {
            C35380b.m78334b("TCodecManager", "getCodec not reuse, for can't find reUseAble CodecWrapper. isVideo:".concat(String.valueOf(zM78224b)));
        }
        c35360b.f76059b = false;
        InterfaceC35363c interfaceC35363cM78189b = m78189b(mediaFormat, c35360b);
        interfaceC35363cM78189b.mo78247b();
        this.f76053g.put(c35360b, interfaceC35363cM78189b);
        return interfaceC35363cM78189b;
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC35363c m78188a(boolean z11, C35365e c35365e) {
        return (z11 ? this.f76055i : this.f76056j).m78289a(c35365e);
    }

    /* JADX INFO: renamed from: a */
    public final void m78194a(InterfaceC35363c interfaceC35363c) {
        C35370a c35370a;
        if (m78200e()) {
            if (interfaceC35363c instanceof C35367g) {
                c35370a = this.f76055i;
            } else if (!(interfaceC35363c instanceof C35361a)) {
                return;
            } else {
                c35370a = this.f76056j;
            }
            c35370a.m78292b((AbstractC35366f) interfaceC35363c);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m78195a(InterfaceC35379a interfaceC35379a) {
        C35380b.m78328a(interfaceC35379a);
    }

    /* JADX INFO: renamed from: a */
    public final void m78196a(boolean z11) {
        C35380b.m78331a(z11);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m78197a(C35360b c35360b, Surface surface) {
        boolean zM78200e = m78200e();
        boolean zM78228d = c35360b.m78228d();
        boolean zM78224b = c35360b.m78224b();
        boolean z11 = zM78200e && zM78228d;
        boolean zM78344a = C35381c.m78344a();
        boolean z12 = !zM78344a;
        if (C35380b.m78332a()) {
            C35380b.m78334b("TCodecManager", "reuseEnable getCodec isVideo:" + zM78224b + " reuseEnable:" + z11 + " globalReuseEnable:" + zM78200e + " mediaCodecReuseEnable:" + zM78228d + " canUseSetOutputSurfaceAPI:" + z12 + " ,surface:" + surface);
        }
        return z11 && zM78224b && !zM78344a && surface != null;
    }
}
