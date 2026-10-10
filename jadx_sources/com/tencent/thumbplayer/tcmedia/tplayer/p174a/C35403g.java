package com.tencent.thumbplayer.tcmedia.tplayer.p174a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.thumbplayer.tcmedia.api.reportv2.ITPExtendReportController;
import com.tencent.thumbplayer.tcmedia.api.reportv2.ITPReportChannelListener;
import com.tencent.thumbplayer.tcmedia.api.reportv2.ITPReportInfoGetter;
import com.tencent.thumbplayer.tcmedia.p159d.C35349b;
import com.tencent.thumbplayer.tcmedia.p159d.InterfaceC35348a;
import com.tencent.thumbplayer.tcmedia.tplayer.p174a.p175a.InterfaceC35385a;
import com.tencent.thumbplayer.tcmedia.utils.C35435o;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.a.g */
/* JADX INFO: loaded from: classes64.dex */
public class C35403g implements ITPExtendReportController, InterfaceC35348a {

    /* JADX INFO: renamed from: k */
    private static final Map<Integer, Integer> f76379k;

    /* JADX INFO: renamed from: g */
    private Context f76386g;

    /* JADX INFO: renamed from: a */
    private ITPReportInfoGetter f76380a = null;

    /* JADX INFO: renamed from: b */
    private HandlerThread f76381b = null;

    /* JADX INFO: renamed from: c */
    private a f76382c = null;

    /* JADX INFO: renamed from: d */
    private InterfaceC35384a f76383d = null;

    /* JADX INFO: renamed from: e */
    private C35408l f76384e = new C35408l();

    /* JADX INFO: renamed from: h */
    private InterfaceC35385a f76387h = null;

    /* JADX INFO: renamed from: i */
    private C35404h f76388i = new C35404h();

    /* JADX INFO: renamed from: j */
    private Object f76389j = new Object();

    /* JADX INFO: renamed from: f */
    private CopyOnWriteArrayList<WeakReference<ITPReportChannelListener>> f76385f = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.a.g$a */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            C35349b.a aVar = (C35349b.a) message.obj;
            C35403g.this.m78565a(i11, aVar);
            if (C35403g.this.f76383d != null) {
                C35403g.this.f76383d.mo78355a(i11, aVar);
            }
            C35403g.this.m78567b(i11, aVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m78579b() {
        TPLogUtil.m78800i("TPReportController", "release");
        synchronized (this.f76389j) {
            a aVar = this.f76382c;
            if (aVar != null) {
                aVar.sendEmptyMessage(1000);
            }
            try {
                this.f76389j.wait(500L);
            } catch (InterruptedException e11) {
                TPLogUtil.m78798e("TPReportController", e11);
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f76379k = map;
        map.put(117, 0);
        map.put(204, 103);
        map.put(101, 1);
        map.put(102, 2);
        map.put(103, 3);
        map.put(104, 4);
        map.put(105, 5);
        map.put(107, 5);
        map.put(108, 5);
        map.put(106, 6);
        map.put(109, 7);
        map.put(110, 8);
        map.put(111, 9);
        map.put(112, 10);
        map.put(114, 11);
        map.put(115, 12);
        map.put(201, 100);
        map.put(202, 101);
        map.put(203, 102);
        map.put(116, 14);
        map.put(113, 13);
        map.put(118, 15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m78567b(int i11, C35349b.a aVar) {
        if (i11 == 5) {
            m78574g(aVar);
        } else {
            if (i11 != 1000) {
                return;
            }
            m78575h(aVar);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m78570c(C35349b.a aVar) {
        if (aVar instanceof C35349b.u) {
            C35349b.u uVar = (C35349b.u) aVar;
            this.f76384e.f76397a = uVar.m78080b();
            this.f76384e.f76401e = uVar.m78128d();
            this.f76384e.f76404h = uVar.m78129e() ? 1 : 0;
            this.f76384e.f76402f = uVar.m78130f();
            TPLogUtil.m78800i("TPReportController", "onSetDataSource url:" + this.f76384e.f76401e + " isUseProxy:" + this.f76384e.f76404h + " urlProtocol:" + this.f76384e.f76402f);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m78571d(C35349b.a aVar) {
        this.f76388i.m78580a(2);
        if (aVar instanceof C35349b.p) {
            C35349b.p pVar = (C35349b.p) aVar;
            this.f76384e.f76399c = pVar.m78080b();
            this.f76384e.f76400d = pVar.m78081c();
            this.f76384e.f76405i = pVar.m78114d();
        }
    }

    /* JADX INFO: renamed from: e */
    private void m78572e(C35349b.a aVar) {
        if (!this.f76388i.m78581b(2)) {
            TPLogUtil.m78797e("TPReportController", "onPrepareEnd Current state is not match:" + this.f76388i.toString());
            return;
        }
        this.f76388i.m78580a(3);
        if (aVar instanceof C35349b.o) {
            C35349b.o oVar = (C35349b.o) aVar;
            this.f76384e.f76403g = C35406j.m78584b(oVar.m78112e());
            TPLogUtil.m78800i("TPReportController", "onPrepareEnd durationMs:" + oVar.m78111d() + " playType:" + this.f76384e.f76403g);
            if (oVar.m78111d() == 0) {
                m78564a(1);
            } else {
                m78564a(0);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private void m78573f(C35349b.a aVar) {
        if (this.f76388i.m78581b(2)) {
            m78564a(2);
        }
        this.f76388i.m78580a(1);
    }

    /* JADX INFO: renamed from: g */
    private void m78574g(C35349b.a aVar) {
        this.f76388i.m78580a(1);
        InterfaceC35384a interfaceC35384a = this.f76383d;
        if (interfaceC35384a != null) {
            interfaceC35384a.mo78354a();
            this.f76383d = null;
        }
        this.f76384e = new C35408l();
    }

    /* JADX INFO: renamed from: h */
    private void m78575h(C35349b.a aVar) {
        TPLogUtil.m78800i("TPReportController", "onControllerRelease");
        synchronized (this.f76389j) {
            try {
                if (this.f76381b != null) {
                    C35435o.m78917a().m78921a(this.f76381b, this.f76382c);
                    this.f76381b = null;
                    this.f76382c = null;
                }
                this.f76385f.clear();
                this.f76389j.notifyAll();
                this.f76389j = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78576a() {
        this.f76381b = C35435o.m78917a().m78919a("TPReportController_Thread");
        this.f76382c = new a(this.f76381b.getLooper());
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.reportv2.ITPExtendReportController
    public void addReportChannelListener(ITPReportChannelListener iTPReportChannelListener) {
        CopyOnWriteArrayList<WeakReference<ITPReportChannelListener>> copyOnWriteArrayList = this.f76385f;
        if (copyOnWriteArrayList == null) {
            TPLogUtil.m78802w("TPReportController", "mReportChannelListenerList is null");
            return;
        }
        Iterator<WeakReference<ITPReportChannelListener>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (it.next().get() == iTPReportChannelListener) {
                TPLogUtil.m78802w("TPReportController", "mReportChannelListenerList has contain reportChannelListener");
                return;
            }
        }
        this.f76385f.add(new WeakReference<>(iTPReportChannelListener));
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.reportv2.ITPExtendReportController
    public void setReportInfoGetter(ITPReportInfoGetter iTPReportInfoGetter) {
        this.f76380a = iTPReportInfoGetter;
    }

    public C35403g(Context context) {
        this.f76386g = null;
        this.f76386g = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    private void m78564a(int i11) {
        String str;
        if (this.f76383d != null) {
            str = "mITPReporter has been create, do not create again.";
        } else {
            InterfaceC35384a interfaceC35384aM78587a = C35407k.m78587a(i11);
            this.f76383d = interfaceC35384aM78587a;
            if (interfaceC35384aM78587a != null) {
                interfaceC35384aM78587a.mo78356a(this.f76386g, this.f76384e);
                this.f76383d.mo78358a(this.f76380a);
                this.f76383d.mo78359a(this.f76387h);
                Iterator<WeakReference<ITPReportChannelListener>> it = this.f76385f.iterator();
                while (it.hasNext()) {
                    ITPReportChannelListener iTPReportChannelListener = it.next().get();
                    if (iTPReportChannelListener != null) {
                        this.f76383d.mo78357a(iTPReportChannelListener);
                    }
                }
                return;
            }
            str = "initReporter(" + i11 + ") fail, mITPReporter is null.";
        }
        TPLogUtil.m78802w("TPReportController", str);
    }

    /* JADX INFO: renamed from: b */
    private void m78568b(C35349b.a aVar) {
        if (aVar instanceof C35349b.g) {
            this.f76384e.f76398b = ((C35349b.g) aVar).m78080b();
            TPLogUtil.m78800i("TPReportController", "onGetConvertedDataSource time:" + this.f76384e.f76398b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m78565a(int i11, C35349b.a aVar) {
        if (i11 == 0) {
            m78570c(aVar);
            return;
        }
        if (i11 == 1) {
            m78571d(aVar);
            return;
        }
        if (i11 == 2) {
            m78572e(aVar);
        } else if (i11 == 6) {
            m78573f(aVar);
        } else {
            if (i11 != 103) {
                return;
            }
            m78568b(aVar);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.p159d.InterfaceC35348a
    /* JADX INFO: renamed from: a */
    public void mo78077a(C35349b.a aVar) {
        Map<Integer, Integer> map = f76379k;
        if (map.containsKey(Integer.valueOf(aVar.m78078a()))) {
            this.f76382c.obtainMessage(map.get(Integer.valueOf(aVar.m78078a())).intValue(), aVar).sendToTarget();
            return;
        }
        TPLogUtil.m78802w("TPReportController", "EventId:" + aVar.m78078a() + " is not need process");
    }

    /* JADX INFO: renamed from: a */
    public void m78577a(InterfaceC35385a interfaceC35385a) {
        this.f76387h = interfaceC35385a;
    }

    /* JADX INFO: renamed from: a */
    public void m78578a(boolean z11) {
        TPLogUtil.m78800i("TPReportController", "reporting is needed:".concat(String.valueOf(z11)));
        this.f76384e.f76406j = Boolean.valueOf(z11);
    }
}
