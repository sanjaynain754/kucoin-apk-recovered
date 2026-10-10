package p554qb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.bugly.proguard.C33627eb;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Vector;

/* JADX INFO: renamed from: qb.c */
/* JADX INFO: compiled from: StateMachine.java */
/* JADX INFO: loaded from: classes6.dex */
public class C43683c {

    /* JADX INFO: renamed from: a */
    public String f96513a;

    /* JADX INFO: renamed from: b */
    public d f96514b;

    /* JADX INFO: renamed from: c */
    public HandlerThread f96515c;

    /* JADX INFO: renamed from: qb.c$b */
    /* JADX INFO: compiled from: StateMachine.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public C43683c f96516a;

        /* JADX INFO: renamed from: b */
        public long f96517b;

        /* JADX INFO: renamed from: c */
        public int f96518c;

        /* JADX INFO: renamed from: d */
        public String f96519d;

        /* JADX INFO: renamed from: e */
        public InterfaceC43681a f96520e;

        /* JADX INFO: renamed from: f */
        public InterfaceC43681a f96521f;

        /* JADX INFO: renamed from: g */
        public InterfaceC43681a f96522g;

        /* JADX INFO: renamed from: a */
        public void m96169a(C43683c c43683c, Message message, String str, InterfaceC43681a interfaceC43681a, InterfaceC43681a interfaceC43681a2, InterfaceC43681a interfaceC43681a3) {
            this.f96516a = c43683c;
            this.f96517b = System.currentTimeMillis();
            this.f96518c = message != null ? message.what : 0;
            this.f96519d = str;
            this.f96520e = interfaceC43681a;
            this.f96521f = interfaceC43681a2;
            this.f96522g = interfaceC43681a3;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("time=");
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.f96517b);
            sb2.append(String.format("%tm-%td %tH:%tM:%tS.%tL", calendar, calendar, calendar, calendar, calendar, calendar));
            sb2.append(" processed=");
            InterfaceC43681a interfaceC43681a = this.f96520e;
            sb2.append(interfaceC43681a == null ? "<null>" : interfaceC43681a.getName());
            sb2.append(" org=");
            InterfaceC43681a interfaceC43681a2 = this.f96521f;
            sb2.append(interfaceC43681a2 == null ? "<null>" : interfaceC43681a2.getName());
            sb2.append(" dest=");
            InterfaceC43681a interfaceC43681a3 = this.f96522g;
            sb2.append(interfaceC43681a3 != null ? interfaceC43681a3.getName() : "<null>");
            sb2.append(" what=");
            C43683c c43683c = this.f96516a;
            String strM96150h = c43683c != null ? c43683c.m96150h(this.f96518c) : "";
            if (TextUtils.isEmpty(strM96150h)) {
                sb2.append(this.f96518c);
                sb2.append("(0x");
                sb2.append(Integer.toHexString(this.f96518c));
                sb2.append(")");
            } else {
                sb2.append(strM96150h);
            }
            if (!TextUtils.isEmpty(this.f96519d)) {
                sb2.append(C33627eb.f69716f);
                sb2.append(this.f96519d);
            }
            return sb2.toString();
        }

        public b(C43683c c43683c, Message message, String str, InterfaceC43681a interfaceC43681a, InterfaceC43681a interfaceC43681a2, InterfaceC43681a interfaceC43681a3) {
            m96169a(c43683c, message, str, interfaceC43681a, interfaceC43681a2, interfaceC43681a3);
        }
    }

    /* JADX INFO: renamed from: qb.c$c */
    /* JADX INFO: compiled from: StateMachine.java */
    public static class c {

        /* JADX INFO: renamed from: a */
        public Vector<b> f96523a;

        /* JADX INFO: renamed from: b */
        public int f96524b;

        /* JADX INFO: renamed from: c */
        public int f96525c;

        /* JADX INFO: renamed from: d */
        public int f96526d;

        /* JADX INFO: renamed from: e */
        public boolean f96527e;

        /* JADX INFO: renamed from: a */
        public synchronized void m96170a(C43683c c43683c, Message message, String str, InterfaceC43681a interfaceC43681a, InterfaceC43681a interfaceC43681a2, InterfaceC43681a interfaceC43681a3) {
            try {
                this.f96526d++;
                if (this.f96523a.size() < this.f96524b) {
                    this.f96523a.add(new b(c43683c, message, str, interfaceC43681a, interfaceC43681a2, interfaceC43681a3));
                } else {
                    b bVar = this.f96523a.get(this.f96525c);
                    int i11 = this.f96525c + 1;
                    this.f96525c = i11;
                    if (i11 >= this.f96524b) {
                        this.f96525c = 0;
                    }
                    bVar.m96169a(c43683c, message, str, interfaceC43681a, interfaceC43681a2, interfaceC43681a3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* JADX INFO: renamed from: b */
        public synchronized void m96171b() {
            this.f96523a.clear();
        }

        /* JADX INFO: renamed from: c */
        public synchronized boolean m96172c() {
            return this.f96527e;
        }

        public c() {
            this.f96523a = new Vector<>();
            this.f96524b = 20;
            this.f96525c = 0;
            this.f96526d = 0;
            this.f96527e = false;
        }
    }

    /* JADX INFO: renamed from: qb.c$d */
    /* JADX INFO: compiled from: StateMachine.java */
    public static class d extends Handler {

        /* JADX INFO: renamed from: q */
        public static final Object f96528q = new Object();

        /* JADX INFO: renamed from: a */
        public boolean f96529a;

        /* JADX INFO: renamed from: b */
        public boolean f96530b;

        /* JADX INFO: renamed from: c */
        public Message f96531c;

        /* JADX INFO: renamed from: d */
        public c f96532d;

        /* JADX INFO: renamed from: e */
        public boolean f96533e;

        /* JADX INFO: renamed from: f */
        public c[] f96534f;

        /* JADX INFO: renamed from: g */
        public int f96535g;

        /* JADX INFO: renamed from: h */
        public c[] f96536h;

        /* JADX INFO: renamed from: i */
        public int f96537i;

        /* JADX INFO: renamed from: j */
        public a f96538j;

        /* JADX INFO: renamed from: k */
        public b f96539k;

        /* JADX INFO: renamed from: l */
        public C43683c f96540l;

        /* JADX INFO: renamed from: m */
        public HashMap<C43682b, c> f96541m;

        /* JADX INFO: renamed from: n */
        public C43682b f96542n;

        /* JADX INFO: renamed from: o */
        public C43682b f96543o;

        /* JADX INFO: renamed from: p */
        public ArrayList<Message> f96544p;

        /* JADX INFO: renamed from: qb.c$d$a */
        /* JADX INFO: compiled from: StateMachine.java */
        public class a extends C43682b {
            public a() {
            }

            @Override // p554qb.C43682b
            /* JADX INFO: renamed from: c */
            public boolean mo20322c(Message message) {
                d.this.f96540l.m96151i(message);
                return true;
            }
        }

        /* JADX INFO: renamed from: qb.c$d$b */
        /* JADX INFO: compiled from: StateMachine.java */
        public class b extends C43682b {
            public b() {
            }

            @Override // p554qb.C43682b
            /* JADX INFO: renamed from: c */
            public boolean mo20322c(Message message) {
                return false;
            }
        }

        /* JADX INFO: renamed from: qb.c$d$c */
        /* JADX INFO: compiled from: StateMachine.java */
        public class c {

            /* JADX INFO: renamed from: a */
            public C43682b f96547a;

            /* JADX INFO: renamed from: b */
            public c f96548b;

            /* JADX INFO: renamed from: c */
            public boolean f96549c;

            public c() {
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("state=");
                sb2.append(this.f96547a.getName());
                sb2.append(",active=");
                sb2.append(this.f96549c);
                sb2.append(",parent=");
                c cVar = this.f96548b;
                sb2.append(cVar == null ? "null" : cVar.f96547a.getName());
                return sb2.toString();
            }
        }

        /* JADX INFO: renamed from: u */
        public final c m96193u(C43682b c43682b) {
            this.f96537i = 0;
            c cVar = this.f96541m.get(c43682b);
            do {
                c[] cVarArr = this.f96536h;
                int i11 = this.f96537i;
                this.f96537i = i11 + 1;
                cVarArr[i11] = cVar;
                cVar = cVar.f96548b;
                if (cVar == null) {
                    break;
                }
            } while (!cVar.f96549c);
            if (this.f96530b) {
                this.f96540l.m96153k("setupTempStateStackWithStatesToEnter: X mTempStateStackCount=" + this.f96537i + ",curStateInfo: " + cVar);
            }
            return cVar;
        }

        public d(Looper looper, C43683c c43683c) {
            super(looper);
            this.f96529a = false;
            this.f96530b = false;
            this.f96532d = new c();
            this.f96535g = -1;
            this.f96538j = new a();
            this.f96539k = new b();
            this.f96541m = new HashMap<>();
            this.f96544p = new ArrayList<>();
            this.f96540l = c43683c;
            m96180h(this.f96538j, null);
            m96180h(this.f96539k, null);
        }

        /* JADX INFO: renamed from: h */
        public final c m96180h(C43682b c43682b, C43682b c43682b2) {
            c cVarM96180h;
            if (this.f96530b) {
                C43683c c43683c = this.f96540l;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("addStateInternal: E state=");
                sb2.append(c43682b.getName());
                sb2.append(",parent=");
                sb2.append(c43682b2 == null ? "" : c43682b2.getName());
                c43683c.m96153k(sb2.toString());
            }
            if (c43682b2 != null) {
                cVarM96180h = this.f96541m.get(c43682b2);
                if (cVarM96180h == null) {
                    cVarM96180h = m96180h(c43682b2, null);
                }
            } else {
                cVarM96180h = null;
            }
            c cVar = this.f96541m.get(c43682b);
            if (cVar == null) {
                cVar = new c();
                this.f96541m.put(c43682b, cVar);
            }
            c cVar2 = cVar.f96548b;
            if (cVar2 != null && cVar2 != cVarM96180h) {
                throw new RuntimeException("state already added");
            }
            cVar.f96547a = c43682b;
            cVar.f96548b = cVarM96180h;
            cVar.f96549c = false;
            if (this.f96530b) {
                this.f96540l.m96153k("addStateInternal: X stateInfo: " + cVar);
            }
            return cVar;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C43682b c43682bM96190r;
            C43683c c43683c;
            if (this.f96529a) {
                return;
            }
            if (this.f96530b) {
                this.f96540l.m96153k("handleMessage: E msg.what=" + message.what);
            }
            this.f96531c = message;
            boolean z11 = this.f96533e;
            if (z11) {
                c43682bM96190r = m96190r(message);
            } else {
                if (z11 || message.what != -2 || message.obj != f96528q) {
                    throw new RuntimeException("StateMachine.handleMessage: The start method not called, received msg: " + message);
                }
                this.f96533e = true;
                m96184l(0);
                c43682bM96190r = null;
            }
            m96189q(c43682bM96190r, message);
            if (!this.f96530b || (c43683c = this.f96540l) == null) {
                return;
            }
            c43683c.m96153k("handleMessage: X");
        }

        /* JADX INFO: renamed from: i */
        public final void m96181i() {
            if (this.f96540l.f96515c != null) {
                getLooper().quit();
                this.f96540l.f96515c = null;
            }
            this.f96540l.f96514b = null;
            this.f96540l = null;
            this.f96531c = null;
            this.f96532d.m96171b();
            this.f96534f = null;
            this.f96536h = null;
            this.f96541m.clear();
            this.f96542n = null;
            this.f96543o = null;
            this.f96544p.clear();
            this.f96529a = true;
        }

        /* JADX INFO: renamed from: j */
        public final void m96182j() {
            if (this.f96530b) {
                this.f96540l.m96153k("completeConstruction: E");
            }
            int i11 = 0;
            for (c cVar : this.f96541m.values()) {
                int i12 = 0;
                while (cVar != null) {
                    cVar = cVar.f96548b;
                    i12++;
                }
                if (i11 < i12) {
                    i11 = i12;
                }
            }
            if (this.f96530b) {
                this.f96540l.m96153k("completeConstruction: maxDepth=" + i11);
            }
            this.f96534f = new c[i11];
            this.f96536h = new c[i11];
            m96192t();
            sendMessageAtFrontOfQueue(obtainMessage(-2, f96528q));
            if (this.f96530b) {
                this.f96540l.m96153k("completeConstruction: X");
            }
        }

        /* JADX INFO: renamed from: k */
        public final InterfaceC43681a m96183k() {
            return this.f96534f[this.f96535g].f96547a;
        }

        /* JADX INFO: renamed from: l */
        public final void m96184l(int i11) {
            while (i11 <= this.f96535g) {
                if (this.f96530b) {
                    this.f96540l.m96153k("invokeEnterMethods: " + this.f96534f[i11].f96547a.getName());
                }
                this.f96534f[i11].f96547a.m96141a();
                this.f96534f[i11].f96549c = true;
                i11++;
            }
        }

        /* JADX INFO: renamed from: m */
        public final void m96185m(c cVar) {
            c cVar2;
            while (true) {
                int i11 = this.f96535g;
                if (i11 < 0 || (cVar2 = this.f96534f[i11]) == cVar) {
                    return;
                }
                C43682b c43682b = cVar2.f96547a;
                if (this.f96530b) {
                    this.f96540l.m96153k("invokeExitMethods: " + c43682b.getName());
                }
                c43682b.mo20325b();
                c[] cVarArr = this.f96534f;
                int i12 = this.f96535g;
                cVarArr[i12].f96549c = false;
                this.f96535g = i12 - 1;
            }
        }

        /* JADX INFO: renamed from: n */
        public final boolean m96186n(Message message) {
            return message.what == -1 && message.obj == f96528q;
        }

        /* JADX INFO: renamed from: o */
        public final void m96187o() {
            for (int size = this.f96544p.size() - 1; size >= 0; size--) {
                Message message = this.f96544p.get(size);
                if (this.f96530b) {
                    this.f96540l.m96153k("moveDeferredMessageAtFrontOfQueue; what=" + message.what);
                }
                sendMessageAtFrontOfQueue(message);
            }
            this.f96544p.clear();
        }

        /* JADX INFO: renamed from: p */
        public final int m96188p() {
            int i11 = this.f96535g + 1;
            int i12 = i11;
            for (int i13 = this.f96537i - 1; i13 >= 0; i13--) {
                if (this.f96530b) {
                    this.f96540l.m96153k("moveTempStackToStateStack: i=" + i13 + ",j=" + i12);
                }
                this.f96534f[i12] = this.f96536h[i13];
                i12++;
            }
            this.f96535g = i12 - 1;
            if (this.f96530b) {
                this.f96540l.m96153k("moveTempStackToStateStack: X mStateStackTop=" + this.f96535g + ",startingIndex=" + i11 + ",Top=" + this.f96534f[this.f96535g].f96547a.getName());
            }
            return i11;
        }

        /* JADX INFO: renamed from: q */
        public final void m96189q(C43682b c43682b, Message message) {
            C43682b c43682b2 = this.f96534f[this.f96535g].f96547a;
            boolean z11 = this.f96540l.m96160r(this.f96531c) && message.obj != f96528q;
            if (this.f96532d.m96172c()) {
                if (this.f96543o != null) {
                    c cVar = this.f96532d;
                    C43683c c43683c = this.f96540l;
                    Message message2 = this.f96531c;
                    cVar.m96170a(c43683c, message2, c43683c.m96149g(message2), c43682b, c43682b2, this.f96543o);
                }
            } else if (z11) {
                c cVar2 = this.f96532d;
                C43683c c43683c2 = this.f96540l;
                Message message3 = this.f96531c;
                cVar2.m96170a(c43683c2, message3, c43683c2.m96149g(message3), c43682b, c43682b2, this.f96543o);
            }
            C43682b c43682b3 = this.f96543o;
            if (c43682b3 != null) {
                while (true) {
                    if (this.f96530b) {
                        this.f96540l.m96153k("handleMessage: new destination call exit/enter");
                    }
                    m96185m(m96193u(c43682b3));
                    m96184l(m96188p());
                    m96187o();
                    C43682b c43682b4 = this.f96543o;
                    if (c43682b3 == c43682b4) {
                        break;
                    } else {
                        c43682b3 = c43682b4;
                    }
                }
                this.f96543o = null;
            }
            if (c43682b3 != null) {
                if (c43682b3 == this.f96539k) {
                    this.f96540l.m96159q();
                    m96181i();
                } else if (c43682b3 == this.f96538j) {
                    this.f96540l.m96158p();
                }
            }
        }

        /* JADX INFO: renamed from: r */
        public final C43682b m96190r(Message message) {
            c cVar = this.f96534f[this.f96535g];
            if (this.f96530b) {
                this.f96540l.m96153k("processMsg: " + cVar.f96547a.getName());
            }
            if (m96186n(message)) {
                m96194v(this.f96539k);
            } else {
                while (!cVar.f96547a.mo20322c(message)) {
                    cVar = cVar.f96548b;
                    if (cVar == null) {
                        this.f96540l.m96145A(message);
                        break;
                    }
                    if (this.f96530b) {
                        this.f96540l.m96153k("processMsg: " + cVar.f96547a.getName());
                    }
                }
            }
            if (cVar != null) {
                return cVar.f96547a;
            }
            return null;
        }

        /* JADX INFO: renamed from: s */
        public final void m96191s(C43682b c43682b) {
            if (this.f96530b) {
                this.f96540l.m96153k("setInitialState: initialState=" + c43682b.getName());
            }
            this.f96542n = c43682b;
        }

        /* JADX INFO: renamed from: t */
        public final void m96192t() {
            if (this.f96530b) {
                this.f96540l.m96153k("setupInitialStateStack: E mInitialState=" + this.f96542n.getName());
            }
            c cVar = this.f96541m.get(this.f96542n);
            this.f96537i = 0;
            while (cVar != null) {
                c[] cVarArr = this.f96536h;
                int i11 = this.f96537i;
                cVarArr[i11] = cVar;
                cVar = cVar.f96548b;
                this.f96537i = i11 + 1;
            }
            this.f96535g = -1;
            m96188p();
        }

        /* JADX INFO: renamed from: v */
        public final void m96194v(InterfaceC43681a interfaceC43681a) {
            this.f96543o = (C43682b) interfaceC43681a;
            if (this.f96530b) {
                this.f96540l.m96153k("transitionTo: destState=" + this.f96543o.getName());
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public String m96150h(int i11) {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public boolean m96160r(Message message) {
        return true;
    }

    /* JADX INFO: renamed from: A */
    public void m96145A(Message message) {
        if (this.f96514b.f96530b) {
            m96154l(" - unhandledMessage: msg.what=" + message.what);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m96146d(C43682b c43682b) {
        this.f96514b.m96180h(c43682b, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m96147e(C43682b c43682b, C43682b c43682b2) {
        this.f96514b.m96180h(c43682b, c43682b2);
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC43681a m96148f() {
        d dVar = this.f96514b;
        if (dVar == null) {
            return null;
        }
        return dVar.m96183k();
    }

    /* JADX INFO: renamed from: g */
    public String m96149g(Message message) {
        return "";
    }

    /* JADX INFO: renamed from: j */
    public final void m96152j(String str, Looper looper) {
        this.f96513a = str;
        this.f96514b = new d(looper, this);
    }

    /* JADX INFO: renamed from: k */
    public void m96153k(String str) {
        Log.d(this.f96513a, str);
    }

    /* JADX INFO: renamed from: l */
    public void m96154l(String str) {
        Log.e(this.f96513a, str);
    }

    /* JADX INFO: renamed from: m */
    public final Message m96155m(int i11) {
        return Message.obtain(this.f96514b, i11);
    }

    /* JADX INFO: renamed from: n */
    public final Message m96156n(int i11, int i12) {
        return Message.obtain(this.f96514b, i11, i12, 0);
    }

    /* JADX INFO: renamed from: o */
    public final Message m96157o(int i11, Object obj) {
        return Message.obtain(this.f96514b, i11, obj);
    }

    /* JADX INFO: renamed from: s */
    public final void m96161s(int i11) {
        d dVar = this.f96514b;
        if (dVar == null) {
            return;
        }
        dVar.removeMessages(i11);
    }

    /* JADX INFO: renamed from: t */
    public final void m96162t(int i11) {
        d dVar = this.f96514b;
        if (dVar == null) {
            return;
        }
        dVar.sendMessage(m96155m(i11));
    }

    /* JADX INFO: renamed from: u */
    public final void m96163u(int i11, int i12) {
        d dVar = this.f96514b;
        if (dVar == null) {
            return;
        }
        dVar.sendMessage(m96156n(i11, i12));
    }

    /* JADX INFO: renamed from: v */
    public final void m96164v(int i11, Object obj) {
        d dVar = this.f96514b;
        if (dVar == null) {
            return;
        }
        dVar.sendMessage(m96157o(i11, obj));
    }

    /* JADX INFO: renamed from: w */
    public final void m96165w(int i11, long j11) {
        d dVar = this.f96514b;
        if (dVar == null) {
            return;
        }
        dVar.sendMessageDelayed(m96155m(i11), j11);
    }

    /* JADX INFO: renamed from: x */
    public final void m96166x(C43682b c43682b) {
        this.f96514b.m96191s(c43682b);
    }

    /* JADX INFO: renamed from: y */
    public void m96167y() {
        d dVar = this.f96514b;
        if (dVar == null) {
            return;
        }
        dVar.m96182j();
    }

    /* JADX INFO: renamed from: z */
    public final void m96168z(InterfaceC43681a interfaceC43681a) {
        this.f96514b.m96194v(interfaceC43681a);
    }

    public C43683c(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        this.f96515c = handlerThread;
        handlerThread.start();
        m96152j(str, this.f96515c.getLooper());
    }

    /* JADX INFO: renamed from: p */
    public void m96158p() {
    }

    /* JADX INFO: renamed from: q */
    public void m96159q() {
    }

    /* JADX INFO: renamed from: i */
    public void m96151i(Message message) {
    }
}
