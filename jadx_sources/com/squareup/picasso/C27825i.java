package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.squareup.picasso.i */
/* JADX INFO: compiled from: Dispatcher.java */
/* JADX INFO: loaded from: classes59.dex */
public class C27825i {

    /* JADX INFO: renamed from: a */
    public final b f56756a;

    /* JADX INFO: renamed from: b */
    public final Context f56757b;

    /* JADX INFO: renamed from: c */
    public final ExecutorService f56758c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC27826j f56759d;

    /* JADX INFO: renamed from: e */
    public final Map<String, RunnableC27819c> f56760e;

    /* JADX INFO: renamed from: f */
    public final Map<Object, AbstractC27817a> f56761f;

    /* JADX INFO: renamed from: g */
    public final Map<Object, AbstractC27817a> f56762g;

    /* JADX INFO: renamed from: h */
    public final Set<Object> f56763h;

    /* JADX INFO: renamed from: i */
    public final Handler f56764i;

    /* JADX INFO: renamed from: j */
    public final Handler f56765j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC27820d f56766k;

    /* JADX INFO: renamed from: l */
    public final C27838v f56767l;

    /* JADX INFO: renamed from: m */
    public final List<RunnableC27819c> f56768m;

    /* JADX INFO: renamed from: n */
    public final c f56769n;

    /* JADX INFO: renamed from: o */
    public final boolean f56770o;

    /* JADX INFO: renamed from: p */
    public boolean f56771p;

    /* JADX INFO: renamed from: com.squareup.picasso.i$a */
    /* JADX INFO: compiled from: Dispatcher.java */
    public static class a extends Handler {

        /* JADX INFO: renamed from: a */
        public final C27825i f56772a;

        /* JADX INFO: renamed from: com.squareup.picasso.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Dispatcher.java */
        public class RunnableC46991a implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Message f56773b;

            public RunnableC46991a(Message message) {
                this.f56773b = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f56773b.what);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f56772a.m68873v((AbstractC27817a) message.obj);
                    break;
                case 2:
                    this.f56772a.m68866o((AbstractC27817a) message.obj);
                    break;
                case 3:
                case 8:
                default:
                    Picasso.f56672p.post(new RunnableC46991a(message));
                    break;
                case 4:
                    this.f56772a.m68867p((RunnableC27819c) message.obj);
                    break;
                case 5:
                    this.f56772a.m68872u((RunnableC27819c) message.obj);
                    break;
                case 6:
                    this.f56772a.m68868q((RunnableC27819c) message.obj, false);
                    break;
                case 7:
                    this.f56772a.m68865n();
                    break;
                case 9:
                    this.f56772a.m68869r((NetworkInfo) message.obj);
                    break;
                case 10:
                    this.f56772a.m68864m(message.arg1 == 1);
                    break;
                case 11:
                    this.f56772a.m68870s(message.obj);
                    break;
                case 12:
                    this.f56772a.m68871t(message.obj);
                    break;
            }
        }

        public a(Looper looper, C27825i c27825i) {
            super(looper);
            this.f56772a = c27825i;
        }
    }

    /* JADX INFO: renamed from: com.squareup.picasso.i$b */
    /* JADX INFO: compiled from: Dispatcher.java */
    public static class b extends HandlerThread {
        public b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* JADX INFO: renamed from: com.squareup.picasso.i$c */
    /* JADX INFO: compiled from: Dispatcher.java */
    public static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final C27825i f56775a;

        /* JADX INFO: renamed from: a */
        public void m68875a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f56775a.f56770o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f56775a.f56757b.registerReceiver(this, intentFilter);
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra("state")) {
                    this.f56775a.m68853b(intent.getBooleanExtra("state", false));
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.f56775a.m68857f(((ConnectivityManager) C27841y.m68948n(context, "connectivity")).getActiveNetworkInfo());
            }
        }

        public c(C27825i c27825i) {
            this.f56775a = c27825i;
        }
    }

    /* JADX INFO: renamed from: v */
    public void m68873v(AbstractC27817a abstractC27817a) {
        m68874w(abstractC27817a, true);
    }

    /* JADX INFO: renamed from: b */
    public void m68853b(boolean z11) {
        Handler handler = this.f56764i;
        handler.sendMessage(handler.obtainMessage(10, z11 ? 1 : 0, 0));
    }

    /* JADX INFO: renamed from: c */
    public void m68854c(AbstractC27817a abstractC27817a) {
        Handler handler = this.f56764i;
        handler.sendMessage(handler.obtainMessage(2, abstractC27817a));
    }

    /* JADX INFO: renamed from: d */
    public void m68855d(RunnableC27819c runnableC27819c) {
        Handler handler = this.f56764i;
        handler.sendMessage(handler.obtainMessage(4, runnableC27819c));
    }

    /* JADX INFO: renamed from: e */
    public void m68856e(RunnableC27819c runnableC27819c) {
        Handler handler = this.f56764i;
        handler.sendMessage(handler.obtainMessage(6, runnableC27819c));
    }

    /* JADX INFO: renamed from: f */
    public void m68857f(NetworkInfo networkInfo) {
        Handler handler = this.f56764i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    /* JADX INFO: renamed from: g */
    public void m68858g(RunnableC27819c runnableC27819c) {
        Handler handler = this.f56764i;
        handler.sendMessageDelayed(handler.obtainMessage(5, runnableC27819c), 500L);
    }

    /* JADX INFO: renamed from: h */
    public void m68859h(AbstractC27817a abstractC27817a) {
        Handler handler = this.f56764i;
        handler.sendMessage(handler.obtainMessage(1, abstractC27817a));
    }

    /* JADX INFO: renamed from: i */
    public final void m68860i() {
        if (this.f56761f.isEmpty()) {
            return;
        }
        Iterator<AbstractC27817a> it = this.f56761f.values().iterator();
        while (it.hasNext()) {
            AbstractC27817a next = it.next();
            it.remove();
            if (next.m68812g().f56687n) {
                C27841y.m68953s("Dispatcher", "replaying", next.m68814i().m68894d());
            }
            m68874w(next, false);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m68861j(List<RunnableC27819c> list) {
        if (list == null || list.isEmpty() || !list.get(0).m68839q().f56687n) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (RunnableC27819c runnableC27819c : list) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(C27841y.m68944j(runnableC27819c));
        }
        C27841y.m68953s("Dispatcher", "delivered", sb2.toString());
    }

    /* JADX INFO: renamed from: m */
    public void m68864m(boolean z11) {
        this.f56771p = z11;
    }

    /* JADX INFO: renamed from: n */
    public void m68865n() {
        ArrayList arrayList = new ArrayList(this.f56768m);
        this.f56768m.clear();
        Handler handler = this.f56765j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        m68861j(arrayList);
    }

    /* JADX INFO: renamed from: r */
    public void m68869r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f56758c;
        if (executorService instanceof C27833q) {
            ((C27833q) executorService).m68888a(networkInfo);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return;
        }
        m68860i();
    }

    /* JADX INFO: renamed from: s */
    public void m68870s(Object obj) {
        if (this.f56763h.add(obj)) {
            Iterator<RunnableC27819c> it = this.f56760e.values().iterator();
            while (it.hasNext()) {
                RunnableC27819c next = it.next();
                boolean z11 = next.m68839q().f56687n;
                AbstractC27817a abstractC27817aM68832h = next.m68832h();
                List<AbstractC27817a> listM68833i = next.m68833i();
                boolean z12 = (listM68833i == null || listM68833i.isEmpty()) ? false : true;
                if (abstractC27817aM68832h != null || z12) {
                    if (abstractC27817aM68832h != null && abstractC27817aM68832h.m68815j().equals(obj)) {
                        next.m68831f(abstractC27817aM68832h);
                        this.f56762g.put(abstractC27817aM68832h.m68816k(), abstractC27817aM68832h);
                        if (z11) {
                            C27841y.m68954t("Dispatcher", "paused", abstractC27817aM68832h.f56707b.m68894d(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z12) {
                        for (int size = listM68833i.size() - 1; size >= 0; size--) {
                            AbstractC27817a abstractC27817a = listM68833i.get(size);
                            if (abstractC27817a.m68815j().equals(obj)) {
                                next.m68831f(abstractC27817a);
                                this.f56762g.put(abstractC27817a.m68816k(), abstractC27817a);
                                if (z11) {
                                    C27841y.m68954t("Dispatcher", "paused", abstractC27817a.f56707b.m68894d(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (next.m68829c()) {
                        it.remove();
                        if (z11) {
                            C27841y.m68954t("Dispatcher", "canceled", C27841y.m68944j(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void m68871t(Object obj) {
        if (this.f56763h.remove(obj)) {
            Iterator<AbstractC27817a> it = this.f56762g.values().iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                AbstractC27817a next = it.next();
                if (next.m68815j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f56765j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m68874w(AbstractC27817a abstractC27817a, boolean z11) {
        if (this.f56763h.contains(abstractC27817a.m68815j())) {
            this.f56762g.put(abstractC27817a.m68816k(), abstractC27817a);
            if (abstractC27817a.m68812g().f56687n) {
                C27841y.m68954t("Dispatcher", "paused", abstractC27817a.f56707b.m68894d(), "because tag '" + abstractC27817a.m68815j() + "' is paused");
                return;
            }
            return;
        }
        RunnableC27819c runnableC27819c = this.f56760e.get(abstractC27817a.m68809d());
        if (runnableC27819c != null) {
            runnableC27819c.m68828b(abstractC27817a);
            return;
        }
        if (this.f56758c.isShutdown()) {
            if (abstractC27817a.m68812g().f56687n) {
                C27841y.m68954t("Dispatcher", "ignored", abstractC27817a.f56707b.m68894d(), "because shut down");
                return;
            }
            return;
        }
        RunnableC27819c runnableC27819cM68822g = RunnableC27819c.m68822g(abstractC27817a.m68812g(), this, this.f56766k, this.f56767l, abstractC27817a);
        runnableC27819cM68822g.f56740o = this.f56758c.submit(runnableC27819cM68822g);
        this.f56760e.put(abstractC27817a.m68809d(), runnableC27819cM68822g);
        if (z11) {
            this.f56761f.remove(abstractC27817a.m68816k());
        }
        if (abstractC27817a.m68812g().f56687n) {
            C27841y.m68953s("Dispatcher", "enqueued", abstractC27817a.f56707b.m68894d());
        }
    }

    public C27825i(Context context, ExecutorService executorService, Handler handler, InterfaceC27826j interfaceC27826j, InterfaceC27820d interfaceC27820d, C27838v c27838v) {
        b bVar = new b();
        this.f56756a = bVar;
        bVar.start();
        C27841y.m68942h(bVar.getLooper());
        this.f56757b = context;
        this.f56758c = executorService;
        this.f56760e = new LinkedHashMap();
        this.f56761f = new WeakHashMap();
        this.f56762g = new WeakHashMap();
        this.f56763h = new LinkedHashSet();
        this.f56764i = new a(bVar.getLooper(), this);
        this.f56759d = interfaceC27826j;
        this.f56765j = handler;
        this.f56766k = interfaceC27820d;
        this.f56767l = c27838v;
        this.f56768m = new ArrayList(4);
        this.f56771p = C27841y.m68950p(context);
        this.f56770o = C27841y.m68949o(context, "android.permission.ACCESS_NETWORK_STATE");
        c cVar = new c(this);
        this.f56769n = cVar;
        cVar.m68875a();
    }

    /* JADX INFO: renamed from: a */
    public final void m68852a(RunnableC27819c runnableC27819c) {
        if (!runnableC27819c.m68843u()) {
            Bitmap bitmap = runnableC27819c.f56739n;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            this.f56768m.add(runnableC27819c);
            if (!this.f56764i.hasMessages(7)) {
                this.f56764i.sendEmptyMessageDelayed(7, 200L);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m68862k(AbstractC27817a abstractC27817a) {
        Object objM68816k = abstractC27817a.m68816k();
        if (objM68816k != null) {
            abstractC27817a.f56716k = true;
            this.f56761f.put(objM68816k, abstractC27817a);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m68863l(RunnableC27819c runnableC27819c) {
        AbstractC27817a abstractC27817aM68832h = runnableC27819c.m68832h();
        if (abstractC27817aM68832h != null) {
            m68862k(abstractC27817aM68832h);
        }
        List<AbstractC27817a> listM68833i = runnableC27819c.m68833i();
        if (listM68833i != null) {
            int size = listM68833i.size();
            for (int i11 = 0; i11 < size; i11++) {
                m68862k(listM68833i.get(i11));
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m68866o(AbstractC27817a abstractC27817a) {
        String strM68809d = abstractC27817a.m68809d();
        RunnableC27819c runnableC27819c = this.f56760e.get(strM68809d);
        if (runnableC27819c != null) {
            runnableC27819c.m68831f(abstractC27817a);
            if (runnableC27819c.m68829c()) {
                this.f56760e.remove(strM68809d);
                if (abstractC27817a.m68812g().f56687n) {
                    C27841y.m68953s("Dispatcher", "canceled", abstractC27817a.m68814i().m68894d());
                }
            }
        }
        if (this.f56763h.contains(abstractC27817a.m68815j())) {
            this.f56762g.remove(abstractC27817a.m68816k());
            if (abstractC27817a.m68812g().f56687n) {
                C27841y.m68954t("Dispatcher", "canceled", abstractC27817a.m68814i().m68894d(), "because paused request got canceled");
            }
        }
        AbstractC27817a abstractC27817aRemove = this.f56761f.remove(abstractC27817a.m68816k());
        if (abstractC27817aRemove != null && abstractC27817aRemove.m68812g().f56687n) {
            C27841y.m68954t("Dispatcher", "canceled", abstractC27817aRemove.m68814i().m68894d(), "from replaying");
        }
    }

    /* JADX INFO: renamed from: p */
    public void m68867p(RunnableC27819c runnableC27819c) {
        if (MemoryPolicy.shouldWriteToMemoryCache(runnableC27819c.m68838p())) {
            this.f56766k.mo68848b(runnableC27819c.m68836n(), runnableC27819c.m68841s());
        }
        this.f56760e.remove(runnableC27819c.m68836n());
        m68852a(runnableC27819c);
        if (runnableC27819c.m68839q().f56687n) {
            C27841y.m68954t("Dispatcher", "batched", C27841y.m68944j(runnableC27819c), "for completion");
        }
    }

    /* JADX INFO: renamed from: q */
    public void m68868q(RunnableC27819c runnableC27819c, boolean z11) {
        String str;
        if (runnableC27819c.m68839q().f56687n) {
            String strM68944j = C27841y.m68944j(runnableC27819c);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("for error");
            if (z11) {
                str = " (will replay)";
            } else {
                str = "";
            }
            sb2.append(str);
            C27841y.m68954t("Dispatcher", "batched", strM68944j, sb2.toString());
        }
        this.f56760e.remove(runnableC27819c.m68836n());
        m68852a(runnableC27819c);
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: u */
    public void m68872u(RunnableC27819c runnableC27819c) {
        NetworkInfo activeNetworkInfo;
        if (!runnableC27819c.m68843u()) {
            boolean z11 = false;
            if (this.f56758c.isShutdown()) {
                m68868q(runnableC27819c, false);
                return;
            }
            if (this.f56770o) {
                activeNetworkInfo = ((ConnectivityManager) C27841y.m68948n(this.f56757b, "connectivity")).getActiveNetworkInfo();
            } else {
                activeNetworkInfo = null;
            }
            if (runnableC27819c.m68844w(this.f56771p, activeNetworkInfo)) {
                if (runnableC27819c.m68839q().f56687n) {
                    C27841y.m68953s("Dispatcher", "retrying", C27841y.m68944j(runnableC27819c));
                }
                if (runnableC27819c.m68835k() instanceof NetworkRequestHandler.ContentLengthException) {
                    runnableC27819c.f56735j |= NetworkPolicy.NO_CACHE.index;
                }
                runnableC27819c.f56740o = this.f56758c.submit(runnableC27819c);
                return;
            }
            if (this.f56770o && runnableC27819c.m68845x()) {
                z11 = true;
            }
            m68868q(runnableC27819c, z11);
            if (z11) {
                m68863l(runnableC27819c);
            }
        }
    }
}
