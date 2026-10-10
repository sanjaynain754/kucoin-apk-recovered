package com.tencent.thumbplayer.tcmedia.adapter;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.TPDrmInfo;
import com.tencent.thumbplayer.tcmedia.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.tcmedia.p159d.C35349b;
import com.tencent.thumbplayer.tcmedia.tplayer.C35383a;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.f */
/* JADX INFO: loaded from: classes62.dex */
public class C35248f implements InvocationHandler {

    /* JADX INFO: renamed from: f */
    private static final Map<String, Class> f75757f;

    /* JADX INFO: renamed from: a */
    private C35246d f75758a;

    /* JADX INFO: renamed from: b */
    private C35383a f75759b;

    /* JADX INFO: renamed from: c */
    private C35249g f75760c = new C35249g("TPPlayerAdapterProxy");

    /* JADX INFO: renamed from: d */
    private a f75761d;

    /* JADX INFO: renamed from: e */
    private Object f75762e;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.f$a */
    public class a implements C35241c.f, C35241c.g, C35241c.h, C35241c.i, C35241c.j {
        private a() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.i
        /* JADX INFO: renamed from: a */
        public void mo77482a() {
            C35349b.o oVar = new C35349b.o();
            oVar.m78110b(C35248f.this.f75758a.mo77362d());
            oVar.m78109a(C35248f.this.f75758a.mo77472n());
            C35248f.this.f75759b.m78353b().m78134a(oVar);
            C35248f.this.f75760c.mo77482a();
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.j
        /* JADX INFO: renamed from: c */
        public void mo77491c() {
            C35248f.this.f75759b.m78353b().m78134a(new C35349b.q());
            C35248f.this.f75760c.mo77491c();
        }

        /* JADX INFO: renamed from: b */
        private void m77779b(long j11, long j12, Object obj) {
            C35248f.this.f75759b.m78353b().m78134a(new C35349b.b());
        }

        /* JADX INFO: renamed from: c */
        private void m77780c(long j11, long j12, Object obj) {
            C35349b.s sVar = new C35349b.s();
            sVar.m78115a(((Long) obj).longValue());
            sVar.m78116b((int) j12);
            C35248f.this.f75759b.m78353b().m78134a(sVar);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.f
        /* JADX INFO: renamed from: a */
        public void mo77483a(@TPCommonEnum.TPErrorType int i11, int i12, long j11, long j12) {
            C35349b.i iVar = new C35349b.i();
            iVar.m78096c(i12);
            iVar.m78095b(i11);
            TPGeneralPlayFlowParams tPGeneralPlayFlowParamsMo77480v = C35248f.this.f75758a.mo77480v();
            if (tPGeneralPlayFlowParamsMo77480v == null) {
                tPGeneralPlayFlowParamsMo77480v = new TPGeneralPlayFlowParams();
            }
            iVar.m78094a(tPGeneralPlayFlowParamsMo77480v);
            TPDynamicStatisticParams tPDynamicStatisticParamsMo77462c = C35248f.this.f75758a.mo77462c(false);
            if (tPDynamicStatisticParamsMo77462c == null) {
                tPDynamicStatisticParamsMo77462c = new TPDynamicStatisticParams();
            }
            iVar.m78093a(tPDynamicStatisticParamsMo77462c);
            C35248f.this.f75759b.m78353b().m78134a(iVar);
            C35248f.this.f75760c.mo77483a(i11, i12, j11, j12);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.h
        /* JADX INFO: renamed from: a */
        public void mo77484a(int i11, long j11, long j12, Object obj) {
            long j13;
            long j14;
            Object obj2;
            a aVar;
            if (i11 != 4) {
                if (i11 == 200) {
                    j13 = j11;
                    j14 = j12;
                    obj2 = obj;
                    m77778a(j13, j14, obj2);
                } else if (i11 != 201) {
                    j13 = j11;
                    j14 = j12;
                    obj2 = obj;
                } else {
                    j13 = j11;
                    j14 = j12;
                    obj2 = obj;
                    m77779b(j13, j14, obj2);
                }
                aVar = this;
            } else {
                j13 = j11;
                j14 = j12;
                obj2 = obj;
                m77780c(j13, j14, obj2);
                aVar = this;
            }
            C35248f.this.f75760c.mo77484a(i11, j13, j14, obj2);
        }

        /* JADX INFO: renamed from: a */
        private void m77778a(long j11, long j12, Object obj) {
            C35248f.this.f75759b.m78353b().m78134a(new C35349b.c());
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.g
        /* JADX INFO: renamed from: a */
        public void mo77634a(TPDrmInfo tPDrmInfo) {
            C35349b.h hVar = new C35349b.h();
            hVar.m78091a(tPDrmInfo);
            C35248f.this.f75759b.m78353b().m78134a(hVar);
            C35248f.this.f75760c.mo77634a(tPDrmInfo);
        }
    }

    static {
        HashMap map = new HashMap();
        f75757f = map;
        map.put("setOnPreparedListener", C35241c.i.class);
        map.put("setOnInfoListener", C35241c.h.class);
        map.put("setOnErrorListener", C35241c.f.class);
        map.put("setOnSeekCompleteListener", C35241c.j.class);
    }

    /* JADX INFO: renamed from: b */
    private void m77767b(Method method, Object[] objArr) {
        Map<String, Class> map = f75757f;
        if (map.containsKey(method.getName())) {
            try {
                this.f75760c.getClass().getMethod(method.getName(), map.get(method.getName())).invoke(this.f75760c, objArr[0]);
                objArr[0] = this.f75761d;
            } catch (IllegalAccessException e11) {
                e11.printStackTrace();
            } catch (NoSuchMethodException e12) {
                e12.printStackTrace();
            } catch (InvocationTargetException e13) {
                e13.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m77770c(Object[] objArr) {
        this.f75759b.m78353b().m78134a(new C35349b.j());
    }

    /* JADX INFO: renamed from: d */
    private void m77771d(Object[] objArr) {
        C35349b.n nVar = new C35349b.n();
        TPGeneralPlayFlowParams tPGeneralPlayFlowParamsMo77480v = this.f75758a.mo77480v();
        if (tPGeneralPlayFlowParamsMo77480v == null) {
            tPGeneralPlayFlowParamsMo77480v = new TPGeneralPlayFlowParams();
        }
        nVar.m78106a(tPGeneralPlayFlowParamsMo77480v);
        TPDynamicStatisticParams tPDynamicStatisticParamsMo77462c = this.f75758a.mo77462c(false);
        if (tPDynamicStatisticParamsMo77462c == null) {
            tPDynamicStatisticParamsMo77462c = new TPDynamicStatisticParams();
        }
        nVar.m78105a(tPDynamicStatisticParamsMo77462c);
        this.f75759b.m78353b().m78134a(nVar);
    }

    /* JADX INFO: renamed from: e */
    private void m77772e(Object[] objArr) {
        C35349b.l lVar = new C35349b.l();
        TPGeneralPlayFlowParams tPGeneralPlayFlowParamsMo77480v = this.f75758a.mo77480v();
        if (tPGeneralPlayFlowParamsMo77480v == null) {
            tPGeneralPlayFlowParamsMo77480v = new TPGeneralPlayFlowParams();
        }
        lVar.m78102a(tPGeneralPlayFlowParamsMo77480v);
        TPDynamicStatisticParams tPDynamicStatisticParamsMo77462c = this.f75758a.mo77462c(false);
        if (tPDynamicStatisticParamsMo77462c == null) {
            tPDynamicStatisticParamsMo77462c = new TPDynamicStatisticParams();
        }
        lVar.m78101a(tPDynamicStatisticParamsMo77462c);
        this.f75759b.m78353b().m78134a(lVar);
    }

    /* JADX INFO: renamed from: f */
    private void m77773f(Object[] objArr) {
        this.f75759b.m78353b().m78134a(new C35349b.k());
    }

    /* JADX INFO: renamed from: g */
    private void m77774g(Object[] objArr) {
        this.f75759b.m78353b().m78134a(new C35349b.r());
    }

    /* JADX INFO: renamed from: h */
    private void m77775h(Object[] objArr) {
        C35349b.v vVar = new C35349b.v();
        vVar.m78131a(((Float) objArr[0]).floatValue());
        this.f75759b.m78353b().m78134a(vVar);
    }

    /* JADX INFO: renamed from: i */
    private void m77776i(Object[] objArr) {
        C35349b.t tVar = new C35349b.t();
        tVar.m78121b(((Integer) objArr[0]).intValue());
        tVar.m78119a(((Long) objArr[1]).longValue());
        tVar.m78120a(this.f75758a.mo77477s()[((Integer) objArr[0]).intValue()]);
        this.f75759b.m78353b().m78134a(tVar);
    }

    /* JADX INFO: renamed from: a */
    public synchronized Object m77777a() {
        try {
            if (this.f75762e == null) {
                this.f75762e = Proxy.newProxyInstance(this.f75758a.getClass().getClassLoader(), this.f75758a.getClass().getInterfaces(), this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f75762e;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        StringBuilder sb2;
        String string;
        try {
            m77764a(method, objArr);
            m77767b(method, objArr);
            return method.invoke(this.f75758a, objArr);
        } catch (InvocationTargetException e11) {
            if (e11.getTargetException() != null) {
                throw e11.getTargetException();
            }
            sb2 = new StringBuilder("invokeMethod ");
            sb2.append(method.getName());
            sb2.append(" has excecption: ");
            string = e11.toString();
            sb2.append(string);
            TPLogUtil.m78797e("TPPlayerAdapterProxy", sb2.toString());
            return m77763a(method);
        } catch (Throwable th2) {
            sb2 = new StringBuilder("invokeMethod ");
            sb2.append(method.getName());
            sb2.append(" has excecption: ");
            string = th2.toString();
            sb2.append(string);
            TPLogUtil.m78797e("TPPlayerAdapterProxy", sb2.toString());
            return m77763a(method);
        }
    }

    public C35248f(C35246d c35246d, C35383a c35383a) {
        a aVar = new a();
        this.f75761d = aVar;
        this.f75758a = c35246d;
        this.f75759b = c35383a;
        c35246d.mo77436a((C35241c.g) aVar);
    }

    /* JADX INFO: renamed from: a */
    private static Object m77763a(Method method) {
        String name = method.getReturnType().getName();
        if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
            return Boolean.FALSE;
        }
        if (name.equals("int")) {
            return 0;
        }
        if (name.equals("long")) {
            return 0L;
        }
        if (name.equals(TypedValues.Custom.S_FLOAT)) {
            return Float.valueOf(0.0f);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private void m77768b(Object[] objArr) {
        this.f75759b.m78353b().m78134a(new C35349b.m());
    }

    /* JADX INFO: renamed from: a */
    private void m77764a(Method method, Object[] objArr) {
        String name = method.getName();
        name.getClass();
        switch (name) {
            case "prepareAsync":
                m77765a(objArr);
                break;
            case "seekTo":
                m77774g(objArr);
                break;
            case "stop":
                m77771d(objArr);
                break;
            case "pause":
                m77770c(objArr);
                break;
            case "reset":
                m77772e(objArr);
                break;
            case "start":
                m77768b(objArr);
                break;
            case "selectTrack":
                m77776i(objArr);
                break;
            case "setPlaySpeedRatio":
                m77775h(objArr);
                break;
            case "release":
                m77773f(objArr);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m77765a(Object[] objArr) {
    }
}
