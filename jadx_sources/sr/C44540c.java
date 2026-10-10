package sr;

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

/* JADX INFO: renamed from: sr.c */
/* JADX INFO: compiled from: StateMachine.java */
/* JADX INFO: loaded from: classes12.dex */
public class C44540c {

    /* JADX INFO: renamed from: a */
    public String f98716a;

    /* JADX INFO: renamed from: b */
    public d f98717b;

    /* JADX INFO: renamed from: c */
    public HandlerThread f98718c;

    /* JADX INFO: renamed from: sr.c$b */
    /* JADX INFO: compiled from: StateMachine.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public C44540c f98719a;

        /* JADX INFO: renamed from: b */
        public long f98720b;

        /* JADX INFO: renamed from: c */
        public int f98721c;

        /* JADX INFO: renamed from: d */
        public String f98722d;

        /* JADX INFO: renamed from: e */
        public InterfaceC44538a f98723e;

        /* JADX INFO: renamed from: f */
        public InterfaceC44538a f98724f;

        /* JADX INFO: renamed from: g */
        public InterfaceC44538a f98725g;

        /* JADX INFO: renamed from: a */
        public void m98580a(C44540c c44540c, Message message, String str, InterfaceC44538a interfaceC44538a, InterfaceC44538a interfaceC44538a2, InterfaceC44538a interfaceC44538a3) {
            this.f98719a = c44540c;
            this.f98720b = System.currentTimeMillis();
            this.f98721c = message != null ? message.what : 0;
            this.f98722d = str;
            this.f98723e = interfaceC44538a;
            this.f98724f = interfaceC44538a2;
            this.f98725g = interfaceC44538a3;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("time=");
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.f98720b);
            sb2.append(String.format("%tm-%td %tH:%tM:%tS.%tL", calendar, calendar, calendar, calendar, calendar, calendar));
            sb2.append(" processed=");
            InterfaceC44538a interfaceC44538a = this.f98723e;
            sb2.append(interfaceC44538a == null ? "<null>" : interfaceC44538a.getName());
            sb2.append(" org=");
            InterfaceC44538a interfaceC44538a2 = this.f98724f;
            sb2.append(interfaceC44538a2 == null ? "<null>" : interfaceC44538a2.getName());
            sb2.append(" dest=");
            InterfaceC44538a interfaceC44538a3 = this.f98725g;
            sb2.append(interfaceC44538a3 != null ? interfaceC44538a3.getName() : "<null>");
            sb2.append(" what=");
            C44540c c44540c = this.f98719a;
            String strM98566m = c44540c != null ? c44540c.m98566m(this.f98721c) : "";
            if (TextUtils.isEmpty(strM98566m)) {
                sb2.append(this.f98721c);
                sb2.append("(0x");
                sb2.append(Integer.toHexString(this.f98721c));
                sb2.append(")");
            } else {
                sb2.append(strM98566m);
            }
            if (!TextUtils.isEmpty(this.f98722d)) {
                sb2.append(C33627eb.f69716f);
                sb2.append(this.f98722d);
            }
            return sb2.toString();
        }

        public b(C44540c c44540c, Message message, String str, InterfaceC44538a interfaceC44538a, InterfaceC44538a interfaceC44538a2, InterfaceC44538a interfaceC44538a3) {
            m98580a(c44540c, message, str, interfaceC44538a, interfaceC44538a2, interfaceC44538a3);
        }
    }

    /* JADX INFO: renamed from: sr.c$c */
    /* JADX INFO: compiled from: StateMachine.java */
    public static class c {

        /* JADX INFO: renamed from: a */
        public Vector<b> f98726a;

        /* JADX INFO: renamed from: b */
        public int f98727b;

        /* JADX INFO: renamed from: c */
        public int f98728c;

        /* JADX INFO: renamed from: d */
        public int f98729d;

        /* JADX INFO: renamed from: e */
        public boolean f98730e;

        /* JADX INFO: renamed from: a */
        public synchronized void m98581a(C44540c c44540c, Message message, String str, InterfaceC44538a interfaceC44538a, InterfaceC44538a interfaceC44538a2, InterfaceC44538a interfaceC44538a3) {
            try {
                this.f98729d++;
                if (this.f98726a.size() < this.f98727b) {
                    this.f98726a.add(new b(c44540c, message, str, interfaceC44538a, interfaceC44538a2, interfaceC44538a3));
                } else {
                    b bVar = this.f98726a.get(this.f98728c);
                    int i11 = this.f98728c + 1;
                    this.f98728c = i11;
                    if (i11 >= this.f98727b) {
                        this.f98728c = 0;
                    }
                    bVar.m98580a(c44540c, message, str, interfaceC44538a, interfaceC44538a2, interfaceC44538a3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* JADX INFO: renamed from: b */
        public synchronized void m98582b() {
            this.f98726a.clear();
        }

        /* JADX INFO: renamed from: c */
        public synchronized boolean m98583c() {
            return this.f98730e;
        }

        public c() {
            this.f98726a = new Vector<>();
            this.f98727b = 20;
            this.f98728c = 0;
            this.f98729d = 0;
            this.f98730e = false;
        }
    }

    /* JADX INFO: renamed from: sr.c$d */
    /* JADX INFO: compiled from: StateMachine.java */
    public static class d extends Handler {

        /* JADX INFO: renamed from: q */
        public static final Object f98731q = new Object();

        /* JADX INFO: renamed from: a */
        public boolean f98732a;

        /* JADX INFO: renamed from: b */
        public boolean f98733b;

        /* JADX INFO: renamed from: c */
        public Message f98734c;

        /* JADX INFO: renamed from: d */
        public c f98735d;

        /* JADX INFO: renamed from: e */
        public boolean f98736e;

        /* JADX INFO: renamed from: f */
        public c[] f98737f;

        /* JADX INFO: renamed from: g */
        public int f98738g;

        /* JADX INFO: renamed from: h */
        public c[] f98739h;

        /* JADX INFO: renamed from: i */
        public int f98740i;

        /* JADX INFO: renamed from: j */
        public a f98741j;

        /* JADX INFO: renamed from: k */
        public b f98742k;

        /* JADX INFO: renamed from: l */
        public C44540c f98743l;

        /* JADX INFO: renamed from: m */
        public HashMap<C44539b, c> f98744m;

        /* JADX INFO: renamed from: n */
        public C44539b f98745n;

        /* JADX INFO: renamed from: o */
        public C44539b f98746o;

        /* JADX INFO: renamed from: p */
        public ArrayList<Message> f98747p;

        /* JADX INFO: renamed from: sr.c$d$a */
        /* JADX INFO: compiled from: StateMachine.java */
        public class a extends C44539b {
            public a() {
            }

            @Override // sr.C44539b
            /* JADX INFO: renamed from: c */
            public boolean mo42930c(Message message) {
                d.this.f98743l.m98567n(message);
                return true;
            }
        }

        /* JADX INFO: renamed from: sr.c$d$b */
        /* JADX INFO: compiled from: StateMachine.java */
        public class b extends C44539b {
            public b() {
            }

            @Override // sr.C44539b
            /* JADX INFO: renamed from: c */
            public boolean mo42930c(Message message) {
                return false;
            }
        }

        /* JADX INFO: renamed from: sr.c$d$c */
        /* JADX INFO: compiled from: StateMachine.java */
        public class c {

            /* JADX INFO: renamed from: a */
            public C44539b f98750a;

            /* JADX INFO: renamed from: b */
            public c f98751b;

            /* JADX INFO: renamed from: c */
            public boolean f98752c;

            public c() {
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("state=");
                sb2.append(this.f98750a.getName());
                sb2.append(",active=");
                sb2.append(this.f98752c);
                sb2.append(",parent=");
                c cVar = this.f98751b;
                sb2.append(cVar == null ? "null" : cVar.f98750a.getName());
                return sb2.toString();
            }
        }

        /* JADX INFO: renamed from: u */
        public final c m98604u(C44539b c44539b) {
            this.f98740i = 0;
            c cVar = this.f98744m.get(c44539b);
            do {
                c[] cVarArr = this.f98739h;
                int i11 = this.f98740i;
                this.f98740i = i11 + 1;
                cVarArr[i11] = cVar;
                cVar = cVar.f98751b;
                if (cVar == null) {
                    break;
                }
            } while (!cVar.f98752c);
            if (this.f98733b) {
                this.f98743l.m98569p("setupTempStateStackWithStatesToEnter: X mTempStateStackCount=" + this.f98740i + ",curStateInfo: " + cVar);
            }
            return cVar;
        }

        public d(Looper looper, C44540c c44540c) {
            super(looper);
            this.f98732a = false;
            this.f98733b = false;
            this.f98735d = new c();
            this.f98738g = -1;
            this.f98741j = new a();
            this.f98742k = new b();
            this.f98744m = new HashMap<>();
            this.f98747p = new ArrayList<>();
            this.f98743l = c44540c;
            m98591h(this.f98741j, null);
            m98591h(this.f98742k, null);
        }

        /* JADX INFO: renamed from: h */
        public final c m98591h(C44539b c44539b, C44539b c44539b2) {
            c cVarM98591h;
            if (this.f98733b) {
                C44540c c44540c = this.f98743l;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("addStateInternal: E state=");
                sb2.append(c44539b.getName());
                sb2.append(",parent=");
                sb2.append(c44539b2 == null ? "" : c44539b2.getName());
                c44540c.m98569p(sb2.toString());
            }
            if (c44539b2 != null) {
                cVarM98591h = this.f98744m.get(c44539b2);
                if (cVarM98591h == null) {
                    cVarM98591h = m98591h(c44539b2, null);
                }
            } else {
                cVarM98591h = null;
            }
            c cVar = this.f98744m.get(c44539b);
            if (cVar == null) {
                cVar = new c();
                this.f98744m.put(c44539b, cVar);
            }
            c cVar2 = cVar.f98751b;
            if (cVar2 != null && cVar2 != cVarM98591h) {
                throw new RuntimeException("state already added");
            }
            cVar.f98750a = c44539b;
            cVar.f98751b = cVarM98591h;
            cVar.f98752c = false;
            if (this.f98733b) {
                this.f98743l.m98569p("addStateInternal: X stateInfo: " + cVar);
            }
            return cVar;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C44539b c44539bM98600q;
            C44540c c44540c;
            if (this.f98732a) {
                return;
            }
            if (this.f98733b) {
                this.f98743l.m98569p("handleMessage: E msg.what=" + message.what);
            }
            this.f98734c = message;
            boolean z11 = this.f98736e;
            if (z11) {
                c44539bM98600q = m98600q(message);
            } else {
                if (z11 || message.what != -2 || message.obj != f98731q) {
                    throw new RuntimeException("StateMachine.handleMessage: The start method not called, received msg: " + message);
                }
                this.f98736e = true;
                m98594k(0);
                c44539bM98600q = null;
            }
            m98599p(c44539bM98600q, message);
            if (!this.f98733b || (c44540c = this.f98743l) == null) {
                return;
            }
            c44540c.m98569p("handleMessage: X");
        }

        /* JADX INFO: renamed from: i */
        public final void m98592i() {
            if (this.f98743l.f98718c != null) {
                getLooper().quit();
                this.f98743l.f98718c = null;
            }
            this.f98743l.f98717b = null;
            this.f98743l = null;
            this.f98734c = null;
            this.f98735d.m98582b();
            this.f98737f = null;
            this.f98739h = null;
            this.f98744m.clear();
            this.f98745n = null;
            this.f98746o = null;
            this.f98747p.clear();
            this.f98732a = true;
        }

        /* JADX INFO: renamed from: j */
        public final void m98593j() {
            if (this.f98733b) {
                this.f98743l.m98569p("completeConstruction: E");
            }
            int i11 = 0;
            for (c cVar : this.f98744m.values()) {
                int i12 = 0;
                while (cVar != null) {
                    cVar = cVar.f98751b;
                    i12++;
                }
                if (i11 < i12) {
                    i11 = i12;
                }
            }
            if (this.f98733b) {
                this.f98743l.m98569p("completeConstruction: maxDepth=" + i11);
            }
            this.f98737f = new c[i11];
            this.f98739h = new c[i11];
            m98603t();
            sendMessageAtFrontOfQueue(obtainMessage(-2, f98731q));
            if (this.f98733b) {
                this.f98743l.m98569p("completeConstruction: X");
            }
        }

        /* JADX INFO: renamed from: k */
        public final void m98594k(int i11) {
            while (i11 <= this.f98738g) {
                if (this.f98733b) {
                    this.f98743l.m98569p("invokeEnterMethods: " + this.f98737f[i11].f98750a.getName());
                }
                this.f98737f[i11].f98750a.mo42929a();
                this.f98737f[i11].f98752c = true;
                i11++;
            }
        }

        /* JADX INFO: renamed from: l */
        public final void m98595l(c cVar) {
            c cVar2;
            while (true) {
                int i11 = this.f98738g;
                if (i11 < 0 || (cVar2 = this.f98737f[i11]) == cVar) {
                    return;
                }
                C44539b c44539b = cVar2.f98750a;
                if (this.f98733b) {
                    this.f98743l.m98569p("invokeExitMethods: " + c44539b.getName());
                }
                c44539b.mo42932b();
                c[] cVarArr = this.f98737f;
                int i12 = this.f98738g;
                cVarArr[i12].f98752c = false;
                this.f98738g = i12 - 1;
            }
        }

        /* JADX INFO: renamed from: m */
        public final boolean m98596m(Message message) {
            return message.what == -1 && message.obj == f98731q;
        }

        /* JADX INFO: renamed from: n */
        public final void m98597n() {
            for (int size = this.f98747p.size() - 1; size >= 0; size--) {
                Message message = this.f98747p.get(size);
                if (this.f98733b) {
                    this.f98743l.m98569p("moveDeferredMessageAtFrontOfQueue; what=" + message.what);
                }
                sendMessageAtFrontOfQueue(message);
            }
            this.f98747p.clear();
        }

        /* JADX INFO: renamed from: o */
        public final int m98598o() {
            int i11 = this.f98738g + 1;
            int i12 = i11;
            for (int i13 = this.f98740i - 1; i13 >= 0; i13--) {
                if (this.f98733b) {
                    this.f98743l.m98569p("moveTempStackToStateStack: i=" + i13 + ",j=" + i12);
                }
                this.f98737f[i12] = this.f98739h[i13];
                i12++;
            }
            this.f98738g = i12 - 1;
            if (this.f98733b) {
                this.f98743l.m98569p("moveTempStackToStateStack: X mStateStackTop=" + this.f98738g + ",startingIndex=" + i11 + ",Top=" + this.f98737f[this.f98738g].f98750a.getName());
            }
            return i11;
        }

        /* JADX INFO: renamed from: p */
        public final void m98599p(C44539b c44539b, Message message) {
            C44539b c44539b2 = this.f98737f[this.f98738g].f98750a;
            boolean z11 = this.f98743l.m98577x(this.f98734c) && message.obj != f98731q;
            if (this.f98735d.m98583c()) {
                if (this.f98746o != null) {
                    c cVar = this.f98735d;
                    C44540c c44540c = this.f98743l;
                    Message message2 = this.f98734c;
                    cVar.m98581a(c44540c, message2, c44540c.m98565l(message2), c44539b, c44539b2, this.f98746o);
                }
            } else if (z11) {
                c cVar2 = this.f98735d;
                C44540c c44540c2 = this.f98743l;
                Message message3 = this.f98734c;
                cVar2.m98581a(c44540c2, message3, c44540c2.m98565l(message3), c44539b, c44539b2, this.f98746o);
            }
            C44539b c44539b3 = this.f98746o;
            if (c44539b3 != null) {
                while (true) {
                    if (this.f98733b) {
                        this.f98743l.m98569p("handleMessage: new destination call exit/enter");
                    }
                    m98595l(m98604u(c44539b3));
                    m98594k(m98598o());
                    m98597n();
                    C44539b c44539b4 = this.f98746o;
                    if (c44539b3 == c44539b4) {
                        break;
                    } else {
                        c44539b3 = c44539b4;
                    }
                }
                this.f98746o = null;
            }
            if (c44539b3 != null) {
                if (c44539b3 == this.f98742k) {
                    this.f98743l.m98575v();
                    m98592i();
                } else if (c44539b3 == this.f98741j) {
                    this.f98743l.m98574u();
                }
            }
        }

        /* JADX INFO: renamed from: q */
        public final C44539b m98600q(Message message) {
            c cVar = this.f98737f[this.f98738g];
            if (this.f98733b) {
                this.f98743l.m98569p("processMsg: " + cVar.f98750a.getName());
            }
            if (m98596m(message)) {
                m98605v(this.f98742k);
            } else {
                while (!cVar.f98750a.mo42930c(message)) {
                    cVar = cVar.f98751b;
                    if (cVar == null) {
                        this.f98743l.m98562H(message);
                        break;
                    }
                    if (this.f98733b) {
                        this.f98743l.m98569p("processMsg: " + cVar.f98750a.getName());
                    }
                }
            }
            if (cVar != null) {
                return cVar.f98750a;
            }
            return null;
        }

        /* JADX INFO: renamed from: r */
        public final void m98601r() {
            if (this.f98733b) {
                this.f98743l.m98569p("quit:");
            }
            sendMessage(obtainMessage(-1, f98731q));
        }

        /* JADX INFO: renamed from: s */
        public final void m98602s(C44539b c44539b) {
            if (this.f98733b) {
                this.f98743l.m98569p("setInitialState: initialState=" + c44539b.getName());
            }
            this.f98745n = c44539b;
        }

        /* JADX INFO: renamed from: t */
        public final void m98603t() {
            if (this.f98733b) {
                this.f98743l.m98569p("setupInitialStateStack: E mInitialState=" + this.f98745n.getName());
            }
            c cVar = this.f98744m.get(this.f98745n);
            this.f98740i = 0;
            while (cVar != null) {
                c[] cVarArr = this.f98739h;
                int i11 = this.f98740i;
                cVarArr[i11] = cVar;
                cVar = cVar.f98751b;
                this.f98740i = i11 + 1;
            }
            this.f98738g = -1;
            m98598o();
        }

        /* JADX INFO: renamed from: v */
        public final void m98605v(InterfaceC44538a interfaceC44538a) {
            this.f98746o = (C44539b) interfaceC44538a;
            if (this.f98733b) {
                this.f98743l.m98569p("transitionTo: destState=" + this.f98746o.getName());
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public String m98566m(int i11) {
        return null;
    }

    /* JADX INFO: renamed from: x */
    public boolean m98577x(Message message) {
        return true;
    }

    /* JADX INFO: renamed from: A */
    public final void m98555A(int i11) {
        d dVar = this.f98717b;
        if (dVar == null) {
            return;
        }
        dVar.sendMessage(m98572s(i11));
    }

    /* JADX INFO: renamed from: B */
    public final void m98556B(int i11, Object obj) {
        d dVar = this.f98717b;
        if (dVar == null) {
            return;
        }
        dVar.sendMessage(m98573t(i11, obj));
    }

    /* JADX INFO: renamed from: C */
    public final void m98557C(int i11, long j11) {
        d dVar = this.f98717b;
        if (dVar == null) {
            return;
        }
        dVar.sendMessageDelayed(m98572s(i11), j11);
    }

    /* JADX INFO: renamed from: D */
    public final void m98558D(int i11, Object obj, long j11) {
        d dVar = this.f98717b;
        if (dVar == null) {
            return;
        }
        dVar.sendMessageDelayed(m98573t(i11, obj), j11);
    }

    /* JADX INFO: renamed from: E */
    public final void m98559E(C44539b c44539b) {
        this.f98717b.m98602s(c44539b);
    }

    /* JADX INFO: renamed from: F */
    public void m98560F() {
        d dVar = this.f98717b;
        if (dVar == null) {
            return;
        }
        dVar.m98593j();
    }

    /* JADX INFO: renamed from: G */
    public final void m98561G(InterfaceC44538a interfaceC44538a) {
        this.f98717b.m98605v(interfaceC44538a);
    }

    /* JADX INFO: renamed from: H */
    public void m98562H(Message message) {
        if (this.f98717b.f98733b) {
            m98570q(" - unhandledMessage: msg.what=" + message.what);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m98563j(C44539b c44539b) {
        this.f98717b.m98591h(c44539b, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m98564k(C44539b c44539b, C44539b c44539b2) {
        this.f98717b.m98591h(c44539b, c44539b2);
    }

    /* JADX INFO: renamed from: l */
    public String m98565l(Message message) {
        return "";
    }

    /* JADX INFO: renamed from: o */
    public final void m98568o(String str, Looper looper) {
        this.f98716a = str;
        this.f98717b = new d(looper, this);
    }

    /* JADX INFO: renamed from: p */
    public void m98569p(String str) {
        Log.d(this.f98716a, str);
    }

    /* JADX INFO: renamed from: q */
    public void m98570q(String str) {
        Log.e(this.f98716a, str);
    }

    /* JADX INFO: renamed from: r */
    public void m98571r(String str) {
        Log.i(this.f98716a, str);
    }

    /* JADX INFO: renamed from: s */
    public final Message m98572s(int i11) {
        return Message.obtain(this.f98717b, i11);
    }

    /* JADX INFO: renamed from: t */
    public final Message m98573t(int i11, Object obj) {
        return Message.obtain(this.f98717b, i11, obj);
    }

    /* JADX INFO: renamed from: w */
    public final void m98576w() {
        d dVar = this.f98717b;
        if (dVar == null) {
            return;
        }
        dVar.m98601r();
    }

    /* JADX INFO: renamed from: y */
    public final void m98578y(int i11) {
        d dVar = this.f98717b;
        if (dVar == null) {
            return;
        }
        dVar.removeMessages(i11);
    }

    /* JADX INFO: renamed from: z */
    public final void m98579z(int i11, Object obj) {
        d dVar = this.f98717b;
        if (dVar == null) {
            return;
        }
        dVar.removeMessages(i11, obj);
    }

    public C44540c(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        this.f98718c = handlerThread;
        handlerThread.start();
        m98568o(str, this.f98718c.getLooper());
    }

    /* JADX INFO: renamed from: u */
    public void m98574u() {
    }

    /* JADX INFO: renamed from: v */
    public void m98575v() {
    }

    /* JADX INFO: renamed from: n */
    public void m98567n(Message message) {
    }
}
