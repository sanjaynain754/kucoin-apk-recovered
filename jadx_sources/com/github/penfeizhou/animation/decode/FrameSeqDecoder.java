package com.github.penfeizhou.animation.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.github.penfeizhou.animation.p065io.InterfaceC6956e;
import com.github.penfeizhou.animation.p065io.Reader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;
import p255f8.C37389a;
import p396k8.InterfaceC40939b;

/* JADX INFO: loaded from: classes.dex */
public abstract class FrameSeqDecoder<R extends Reader, W extends InterfaceC6956e> {

    /* JADX INFO: renamed from: u */
    public static final String f11568u = "FrameSeqDecoder";

    /* JADX INFO: renamed from: v */
    public static final Rect f11569v = new Rect();

    /* JADX INFO: renamed from: a */
    public final int f11570a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC40939b f11571b;

    /* JADX INFO: renamed from: c */
    public final Handler f11572c;

    /* JADX INFO: renamed from: f */
    public int f11575f;

    /* JADX INFO: renamed from: h */
    public final Set<InterfaceC6948j> f11577h;

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f11578i;

    /* JADX INFO: renamed from: j */
    public final Runnable f11579j;

    /* JADX INFO: renamed from: k */
    public int f11580k;

    /* JADX INFO: renamed from: l */
    public final Set<Bitmap> f11581l;

    /* JADX INFO: renamed from: m */
    public final Object f11582m;

    /* JADX INFO: renamed from: n */
    public Map<Bitmap, Canvas> f11583n;

    /* JADX INFO: renamed from: o */
    public ByteBuffer f11584o;

    /* JADX INFO: renamed from: p */
    public volatile Rect f11585p;

    /* JADX INFO: renamed from: q */
    public W f11586q;

    /* JADX INFO: renamed from: r */
    public R f11587r;

    /* JADX INFO: renamed from: s */
    public boolean f11588s;

    /* JADX INFO: renamed from: t */
    public volatile State f11589t;

    /* JADX INFO: renamed from: d */
    public List<AbstractC6949a<R, W>> f11573d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public int f11574e = -1;

    /* JADX INFO: renamed from: g */
    public Integer f11576g = null;

    public enum State {
        IDLE,
        RUNNING,
        INITIALIZING,
        FINISHING
    }

    /* JADX INFO: renamed from: com.github.penfeizhou.animation.decode.FrameSeqDecoder$a */
    public class RunnableC6939a implements Runnable {
        public RunnableC6939a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (FrameSeqDecoder.this.f11578i.get()) {
                return;
            }
            if (!FrameSeqDecoder.this.m12779q()) {
                FrameSeqDecoder.this.m12776R();
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jM12775Q = FrameSeqDecoder.this.m12775Q();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            FrameSeqDecoder.this.f11572c.removeCallbacks(FrameSeqDecoder.this.f11579j);
            FrameSeqDecoder.this.f11572c.postDelayed(this, Math.max(0L, jM12775Q - jCurrentTimeMillis2));
            for (InterfaceC6948j interfaceC6948j : FrameSeqDecoder.this.f11577h) {
                ByteBuffer byteBuffer = FrameSeqDecoder.this.f11584o;
                if (byteBuffer != null) {
                    interfaceC6948j.mo12789a(byteBuffer);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.github.penfeizhou.animation.decode.FrameSeqDecoder$b */
    public class RunnableC6940b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC6948j f11592b;

        public RunnableC6940b(InterfaceC6948j interfaceC6948j) {
            this.f11592b = interfaceC6948j;
        }

        @Override // java.lang.Runnable
        public void run() {
            FrameSeqDecoder.this.f11577h.add(this.f11592b);
        }
    }

    /* JADX INFO: renamed from: com.github.penfeizhou.animation.decode.FrameSeqDecoder$c */
    /* JADX INFO: loaded from: classes45.dex */
    public class RunnableC6941c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC6948j f11594b;

        public RunnableC6941c(InterfaceC6948j interfaceC6948j) {
            this.f11594b = interfaceC6948j;
        }

        @Override // java.lang.Runnable
        public void run() {
            FrameSeqDecoder.this.f11577h.remove(this.f11594b);
        }
    }

    /* JADX INFO: renamed from: com.github.penfeizhou.animation.decode.FrameSeqDecoder$d */
    /* JADX INFO: loaded from: classes45.dex */
    public class RunnableC6942d implements Runnable {
        public RunnableC6942d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (FrameSeqDecoder.this.f11577h.size() == 0) {
                FrameSeqDecoder.this.m12776R();
            }
        }
    }

    /* JADX INFO: renamed from: com.github.penfeizhou.animation.decode.FrameSeqDecoder$e */
    public class RunnableC6943e implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Thread f11597b;

        public RunnableC6943e(Thread thread) {
            this.f11597b = thread;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    if (FrameSeqDecoder.this.f11585p == null) {
                        if (FrameSeqDecoder.this.f11587r == null) {
                            FrameSeqDecoder frameSeqDecoder = FrameSeqDecoder.this;
                            frameSeqDecoder.f11587r = frameSeqDecoder.mo757A(frameSeqDecoder.f11571b.mo89709a());
                        } else {
                            FrameSeqDecoder.this.f11587r.reset();
                        }
                        FrameSeqDecoder frameSeqDecoder2 = FrameSeqDecoder.this;
                        frameSeqDecoder2.m12765D(frameSeqDecoder2.mo759I(frameSeqDecoder2.f11587r));
                    }
                } finally {
                    LockSupport.unpark(this.f11597b);
                }
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
                FrameSeqDecoder.this.f11585p = FrameSeqDecoder.f11569v;
                LockSupport.unpark(this.f11597b);
            } catch (OutOfMemoryError e12) {
                e = e12;
                e.printStackTrace();
                FrameSeqDecoder.this.f11585p = FrameSeqDecoder.f11569v;
                LockSupport.unpark(this.f11597b);
            }
        }
    }

    /* JADX INFO: renamed from: com.github.penfeizhou.animation.decode.FrameSeqDecoder$f */
    public class RunnableC6944f implements Runnable {
        public RunnableC6944f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FrameSeqDecoder.this.m12766E();
        }
    }

    /* JADX INFO: renamed from: com.github.penfeizhou.animation.decode.FrameSeqDecoder$g */
    /* JADX INFO: loaded from: classes45.dex */
    public class RunnableC6945g implements Runnable {
        public RunnableC6945g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FrameSeqDecoder.this.m12767F();
        }
    }

    /* JADX INFO: renamed from: com.github.penfeizhou.animation.decode.FrameSeqDecoder$h */
    public class RunnableC6946h implements Runnable {
        public RunnableC6946h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FrameSeqDecoder.this.f11575f = 0;
            FrameSeqDecoder frameSeqDecoder = FrameSeqDecoder.this;
            frameSeqDecoder.f11574e = -1;
            frameSeqDecoder.f11588s = false;
        }
    }

    /* JADX INFO: renamed from: com.github.penfeizhou.animation.decode.FrameSeqDecoder$i */
    /* JADX INFO: loaded from: classes45.dex */
    public class RunnableC6947i implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f11602b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f11603c;

        public RunnableC6947i(int i11, boolean z11) {
            this.f11602b = i11;
            this.f11603c = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            FrameSeqDecoder.this.m12767F();
            try {
                FrameSeqDecoder frameSeqDecoder = FrameSeqDecoder.this;
                frameSeqDecoder.f11580k = this.f11602b;
                frameSeqDecoder.m12765D(frameSeqDecoder.mo759I(frameSeqDecoder.mo757A(frameSeqDecoder.f11571b.mo89709a())));
                if (this.f11603c) {
                    FrameSeqDecoder.this.m12766E();
                }
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.github.penfeizhou.animation.decode.FrameSeqDecoder$j */
    public interface InterfaceC6948j {
        /* JADX INFO: renamed from: a */
        void mo12789a(ByteBuffer byteBuffer);

        /* JADX INFO: renamed from: b */
        void mo12790b();

        void onStart();
    }

    /* JADX INFO: renamed from: A */
    public abstract R mo757A(Reader reader);

    /* JADX INFO: renamed from: C */
    public abstract W mo758C();

    /* JADX INFO: renamed from: I */
    public abstract Rect mo759I(R r11) throws IOException;

    /* JADX INFO: renamed from: K */
    public abstract void mo760K();

    /* JADX INFO: renamed from: M */
    public abstract void mo761M(AbstractC6949a<R, W> abstractC6949a);

    /* JADX INFO: renamed from: t */
    public int mo12782t(int i11, int i12) {
        int i13 = 1;
        if (i11 != 0 && i12 != 0) {
            int iMin = Math.min(m12781s().width() / i11, m12781s().height() / i12);
            while (true) {
                int i14 = i13 * 2;
                if (i14 > iMin) {
                    break;
                }
                i13 = i14;
            }
        }
        return i13;
    }

    /* JADX INFO: renamed from: x */
    public abstract int mo765x();

    /* JADX INFO: renamed from: B */
    public int mo12764B() {
        return this.f11580k;
    }

    /* JADX INFO: renamed from: D */
    public final void m12765D(Rect rect) {
        this.f11585p = rect;
        long jWidth = ((long) rect.width()) * ((long) rect.height());
        int i11 = this.f11580k;
        long j11 = ((jWidth / (((long) i11) * ((long) i11))) + 1) * 4;
        try {
            this.f11584o = ByteBuffer.allocate((int) j11);
            if (this.f11586q == null) {
                this.f11586q = (W) mo758C();
            }
        } catch (OutOfMemoryError e11) {
            Log.e(f11568u, String.format("OutOfMemoryError in FrameSeqDecoder: Buffer needed: %.2fMB (%,d bytes)", Double.valueOf(j11 / 1048576.0d), Long.valueOf(j11)));
            this.f11584o = null;
            this.f11585p = f11569v;
            throw e11;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: E */
    public final void m12766E() {
        this.f11578i.compareAndSet(true, false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (mo12785w() == 0) {
                try {
                    R r11 = this.f11587r;
                    if (r11 == null) {
                        this.f11587r = (R) mo757A(this.f11571b.mo89709a());
                    } else {
                        r11.reset();
                    }
                    m12765D(mo759I(this.f11587r));
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            String str = f11568u;
            Log.i(str, m12780r() + " Set state to RUNNING,cost " + (System.currentTimeMillis() - jCurrentTimeMillis));
            this.f11589t = State.RUNNING;
            if (m12787z() != 0 && this.f11588s) {
                Log.i(str, m12780r() + " No need to started");
                return;
            }
            this.f11574e = -1;
            this.f11572c.removeCallbacks(this.f11579j);
            this.f11579j.run();
            Iterator<InterfaceC6948j> it = this.f11577h.iterator();
            while (it.hasNext()) {
                it.next().onStart();
            }
        } catch (Throwable th3) {
            Log.i(f11568u, m12780r() + " Set state to RUNNING,cost " + (System.currentTimeMillis() - jCurrentTimeMillis));
            this.f11589t = State.RUNNING;
            throw th3;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: F */
    public final void m12767F() {
        this.f11572c.removeCallbacks(this.f11579j);
        this.f11573d.clear();
        synchronized (this.f11582m) {
            try {
                for (Bitmap bitmap : this.f11581l) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                }
                this.f11581l.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f11584o != null) {
            this.f11584o = null;
        }
        this.f11583n.clear();
        try {
            R r11 = this.f11587r;
            if (r11 != null) {
                r11.close();
                this.f11587r = null;
            }
            W w11 = this.f11586q;
            if (w11 != null) {
                w11.close();
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        mo760K();
        this.f11589t = State.IDLE;
        Iterator<InterfaceC6948j> it = this.f11577h.iterator();
        while (it.hasNext()) {
            it.next().mo12790b();
        }
    }

    /* JADX INFO: renamed from: G */
    public boolean m12768G() {
        return this.f11589t == State.RUNNING || this.f11589t == State.INITIALIZING;
    }

    /* JADX INFO: renamed from: H */
    public Bitmap m12769H(int i11, int i12) {
        synchronized (this.f11582m) {
            try {
                Iterator<Bitmap> it = this.f11581l.iterator();
                Bitmap bitmapCreateBitmap = null;
                while (it.hasNext()) {
                    int i13 = i11 * i12 * 4;
                    Bitmap next = it.next();
                    if (next != null && next.getAllocationByteCount() >= i13) {
                        it.remove();
                        if (next.getWidth() != i11 || next.getHeight() != i12) {
                            if (i11 > 0 && i12 > 0) {
                                next.reconfigure(i11, i12, Bitmap.Config.ARGB_8888);
                            }
                        }
                        next.eraseColor(0);
                        return next;
                    }
                    bitmapCreateBitmap = next;
                }
                if (i11 <= 0 || i12 <= 0) {
                    return null;
                }
                try {
                    try {
                        bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                } catch (OutOfMemoryError e12) {
                    e12.printStackTrace();
                }
                return bitmapCreateBitmap;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m12770J(Bitmap bitmap) {
        synchronized (this.f11582m) {
            if (bitmap != null) {
                try {
                    this.f11581l.add(bitmap);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m12771L(InterfaceC6948j interfaceC6948j) {
        this.f11572c.post(new RunnableC6941c(interfaceC6948j));
    }

    /* JADX INFO: renamed from: N */
    public void m12772N() {
        this.f11572c.post(new RunnableC6946h());
    }

    /* JADX INFO: renamed from: P */
    public void m12774P() {
        if (this.f11585p == f11569v) {
            return;
        }
        if (this.f11589t != State.RUNNING) {
            State state = this.f11589t;
            State state2 = State.INITIALIZING;
            if (state != state2) {
                if (this.f11589t == State.FINISHING) {
                    Log.e(f11568u, m12780r() + " Processing,wait for finish at " + this.f11589t);
                }
                this.f11589t = state2;
                if (Looper.myLooper() == this.f11572c.getLooper()) {
                    m12766E();
                    return;
                } else {
                    this.f11572c.post(new RunnableC6944f());
                    return;
                }
            }
        }
        Log.i(f11568u, m12780r() + " Already started");
    }

    @WorkerThread
    /* JADX INFO: renamed from: Q */
    public final long m12775Q() {
        int i11 = this.f11574e + 1;
        this.f11574e = i11;
        if (i11 >= mo12785w()) {
            this.f11574e = 0;
            this.f11575f++;
        }
        AbstractC6949a<R, W> abstractC6949aMo12783u = mo12783u(this.f11574e);
        if (abstractC6949aMo12783u == null) {
            return 0L;
        }
        mo761M(abstractC6949aMo12783u);
        return abstractC6949aMo12783u.frameDuration;
    }

    /* JADX INFO: renamed from: R */
    public void m12776R() {
        if (this.f11585p == f11569v) {
            return;
        }
        State state = this.f11589t;
        State state2 = State.FINISHING;
        if (state == state2 || this.f11589t == State.IDLE) {
            Log.i(f11568u, m12780r() + "No need to stop");
            return;
        }
        if (this.f11589t == State.INITIALIZING) {
            Log.e(f11568u, m12780r() + "Processing,wait for finish at " + this.f11589t);
        }
        this.f11589t = state2;
        if (Looper.myLooper() == this.f11572c.getLooper()) {
            m12767F();
        } else {
            this.f11572c.post(new RunnableC6945g());
        }
    }

    /* JADX INFO: renamed from: S */
    public void m12777S() {
        this.f11572c.post(new RunnableC6942d());
    }

    /* JADX INFO: renamed from: p */
    public void m12778p(InterfaceC6948j interfaceC6948j) {
        this.f11572c.post(new RunnableC6940b(interfaceC6948j));
    }

    /* JADX INFO: renamed from: r */
    public final String m12780r() {
        return "";
    }

    /* JADX INFO: renamed from: s */
    public Rect m12781s() {
        if (this.f11585p == null) {
            if (this.f11589t == State.FINISHING) {
                Log.e(f11568u, "In finishing,do not interrupt");
            }
            Thread threadCurrentThread = Thread.currentThread();
            this.f11572c.post(new RunnableC6943e(threadCurrentThread));
            LockSupport.park(threadCurrentThread);
        }
        return this.f11585p == null ? f11569v : this.f11585p;
    }

    /* JADX INFO: renamed from: u */
    public AbstractC6949a<R, W> mo12783u(int i11) {
        if (i11 < 0 || i11 >= this.f11573d.size()) {
            return null;
        }
        return this.f11573d.get(i11);
    }

    /* JADX INFO: renamed from: v */
    public Bitmap mo12784v(int i11) throws IOException {
        if (this.f11589t != State.IDLE) {
            Log.e(f11568u, m12780r() + ",stop first");
            return null;
        }
        this.f11589t = State.RUNNING;
        this.f11578i.compareAndSet(true, false);
        if (this.f11573d.size() == 0) {
            R r11 = this.f11587r;
            if (r11 == null) {
                this.f11587r = (R) mo757A(this.f11571b.mo89709a());
            } else {
                r11.reset();
            }
            m12765D(mo759I(this.f11587r));
        }
        if (i11 < 0) {
            i11 += this.f11573d.size();
        }
        int i12 = i11 >= 0 ? i11 : 0;
        this.f11574e = -1;
        while (this.f11574e < i12 && m12779q()) {
            m12775Q();
        }
        this.f11584o.rewind();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(m12781s().width() / mo12764B(), m12781s().height() / mo12764B(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(this.f11584o);
        m12767F();
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: w */
    public int mo12785w() {
        return this.f11573d.size();
    }

    /* JADX INFO: renamed from: y */
    public int m12786y() {
        int iCapacity;
        synchronized (this.f11582m) {
            try {
                iCapacity = 0;
                for (Bitmap bitmap : this.f11581l) {
                    if (!bitmap.isRecycled()) {
                        iCapacity += bitmap.getAllocationByteCount();
                    }
                }
                ByteBuffer byteBuffer = this.f11584o;
                if (byteBuffer != null) {
                    iCapacity += byteBuffer.capacity();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iCapacity;
    }

    /* JADX INFO: renamed from: z */
    public final int m12787z() {
        Integer num = this.f11576g;
        return num != null ? num.intValue() : mo765x();
    }

    public FrameSeqDecoder(InterfaceC40939b interfaceC40939b, @Nullable InterfaceC6948j interfaceC6948j) {
        HashSet hashSet = new HashSet();
        this.f11577h = hashSet;
        this.f11578i = new AtomicBoolean(true);
        this.f11579j = new RunnableC6939a();
        this.f11580k = 1;
        this.f11581l = new HashSet();
        this.f11582m = new Object();
        this.f11583n = new WeakHashMap();
        this.f11586q = (W) mo758C();
        this.f11587r = null;
        this.f11588s = false;
        this.f11589t = State.IDLE;
        this.f11571b = interfaceC40939b;
        if (interfaceC6948j != null) {
            hashSet.add(interfaceC6948j);
        }
        int iM84114a = C37389a.m84113b().m84114a();
        this.f11570a = iM84114a;
        this.f11572c = new Handler(C37389a.m84113b().m84115c(iM84114a));
    }

    /* JADX INFO: renamed from: O */
    public int m12773O(int i11, int i12) {
        int iMo12782t = mo12782t(i11, i12);
        if (iMo12782t != mo12764B()) {
            boolean zM12768G = m12768G();
            this.f11572c.removeCallbacks(this.f11579j);
            this.f11572c.post(new RunnableC6947i(iMo12782t, zM12768G));
        }
        return iMo12782t;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m12779q() {
        if (!m12768G() || mo12785w() == 0) {
            return false;
        }
        if (m12787z() <= 0 || this.f11575f < m12787z() - 1) {
            return true;
        }
        if (this.f11575f == m12787z() - 1 && this.f11574e < mo12785w() - 1) {
            return true;
        }
        this.f11588s = true;
        return false;
    }
}
