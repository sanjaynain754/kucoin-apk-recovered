package dh0;

import ch0.InterfaceC4979b;
import java.util.Stack;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.lang.InterfaceC43176b;
import org.aspectj.lang.InterfaceC43177c;
import org.aspectj.runtime.internal.AbstractC43178a;

/* JADX INFO: renamed from: dh0.c */
/* JADX INFO: compiled from: JoinPointImpl.java */
/* JADX INFO: loaded from: classes23.dex */
public class C36687c implements InterfaceC43176b {

    /* JADX INFO: renamed from: a */
    public Object f79553a;

    /* JADX INFO: renamed from: b */
    public Object f79554b;

    /* JADX INFO: renamed from: c */
    public Object[] f79555c;

    /* JADX INFO: renamed from: d */
    public InterfaceC43175a.a f79556d;

    /* JADX INFO: renamed from: e */
    public AbstractC43178a f79557e = null;

    /* JADX INFO: renamed from: f */
    public Stack<AbstractC43178a> f79558f = null;

    /* JADX INFO: renamed from: dh0.c$a */
    /* JADX INFO: compiled from: JoinPointImpl.java */
    public static class a implements InterfaceC43175a.a {

        /* JADX INFO: renamed from: a */
        public String f79559a;

        /* JADX INFO: renamed from: b */
        public InterfaceC43177c f79560b;

        /* JADX INFO: renamed from: c */
        public InterfaceC4979b f79561c;

        /* JADX INFO: renamed from: d */
        public int f79562d;

        /* JADX INFO: renamed from: a */
        public String m82135a() {
            return this.f79559a;
        }

        /* JADX INFO: renamed from: b */
        public InterfaceC43177c m82136b() {
            return this.f79560b;
        }

        /* JADX INFO: renamed from: c */
        public String m82137c(C36692h c36692h) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(c36692h.m82158d(m82135a()));
            stringBuffer.append("(");
            stringBuffer.append(((AbstractC36690f) m82136b()).m82149k(c36692h));
            stringBuffer.append(")");
            return stringBuffer.toString();
        }

        @Override // org.aspectj.lang.InterfaceC43175a.a
        public final String toString() {
            return m82137c(C36692h.f79579k);
        }

        public a(int i11, String str, InterfaceC43177c interfaceC43177c, InterfaceC4979b interfaceC4979b) {
            this.f79559a = str;
            this.f79560b = interfaceC43177c;
            this.f79561c = interfaceC4979b;
            this.f79562d = i11;
        }
    }

    @Override // org.aspectj.lang.InterfaceC43176b
    /* JADX INFO: renamed from: a */
    public Object mo82130a() throws Throwable {
        Stack<AbstractC43178a> stack = this.f79558f;
        if (stack != null) {
            return stack.peek().run(this.f79558f.peek().getState());
        }
        AbstractC43178a abstractC43178a = this.f79557e;
        if (abstractC43178a == null) {
            return null;
        }
        return abstractC43178a.run(abstractC43178a.getState());
    }

    @Override // org.aspectj.lang.InterfaceC43175a
    /* JADX INFO: renamed from: b */
    public Object[] mo82131b() {
        if (this.f79555c == null) {
            this.f79555c = new Object[0];
        }
        Object[] objArr = this.f79555c;
        Object[] objArr2 = new Object[objArr.length];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        return objArr2;
    }

    @Override // org.aspectj.lang.InterfaceC43176b
    /* JADX INFO: renamed from: c */
    public void mo82132c(AbstractC43178a abstractC43178a) {
        this.f79557e = abstractC43178a;
    }

    @Override // org.aspectj.lang.InterfaceC43176b
    /* JADX INFO: renamed from: d */
    public Object mo82133d(Object[] objArr) throws Throwable {
        int i11;
        Stack<AbstractC43178a> stack = this.f79558f;
        AbstractC43178a abstractC43178aPeek = stack == null ? this.f79557e : stack.peek();
        if (abstractC43178aPeek == null) {
            return null;
        }
        int flags = abstractC43178aPeek.getFlags();
        int i12 = 0;
        boolean z11 = (65536 & flags) != 0;
        int i13 = (flags & 4096) != 0 ? 1 : 0;
        int i14 = (flags & 256) != 0 ? 1 : 0;
        boolean z12 = (flags & 16) != 0;
        boolean z13 = (flags & 1) != 0;
        Object[] state = abstractC43178aPeek.getState();
        int i15 = ((!z12 || z11) ? 0 : 1) + i13;
        if (i13 == 0 || i14 == 0) {
            i11 = 0;
        } else {
            state[0] = objArr[0];
            i11 = 1;
        }
        if (z12 && z13) {
            if (z11) {
                i11 = i14 + 1;
                state[0] = objArr[i14];
            } else {
                char c11 = (i13 == 0 || i14 == 0) ? (char) 0 : (char) 1;
                int i16 = (i13 == 0 || i14 == 0) ? 0 : 1;
                if (z12 && z13 && !z11) {
                    i12 = 1;
                }
                state[i13] = objArr[c11];
                i11 = i16 + i12;
            }
        }
        for (int i17 = i11; i17 < objArr.length; i17++) {
            state[(i17 - i11) + i15] = objArr[i17];
        }
        return abstractC43178aPeek.run(state);
    }

    @Override // org.aspectj.lang.InterfaceC43176b
    /* JADX INFO: renamed from: e */
    public void mo82134e(AbstractC43178a abstractC43178a) {
        if (this.f79558f == null) {
            this.f79558f = new Stack<>();
        }
        if (abstractC43178a == null) {
            this.f79558f.pop();
        } else {
            this.f79558f.push(abstractC43178a);
        }
    }

    @Override // org.aspectj.lang.InterfaceC43175a
    public Object getTarget() {
        return this.f79554b;
    }

    public final String toString() {
        return this.f79556d.toString();
    }

    public C36687c(InterfaceC43175a.a aVar, Object obj, Object obj2, Object[] objArr) {
        this.f79556d = aVar;
        this.f79553a = obj;
        this.f79554b = obj2;
        this.f79555c = objArr;
    }
}
