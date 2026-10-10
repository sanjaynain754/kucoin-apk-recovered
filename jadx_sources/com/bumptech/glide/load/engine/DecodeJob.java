package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.C5311e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.data.InterfaceC5323d;
import com.bumptech.glide.load.data.InterfaceC5324e;
import com.bumptech.glide.load.resource.bitmap.C5368a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p523p2.C43359f;
import p546q2.AbstractC43593c;
import p546q2.C43591a;
import p546q2.C43592b;
import p628t1.C44612d;
import p628t1.C44613e;
import p628t1.InterfaceC44610b;
import p628t1.InterfaceC44615g;
import p628t1.InterfaceC44616h;
import p680v1.AbstractC45352c;
import p680v1.C45350a;
import p680v1.C45351b;
import p680v1.C45354e;
import p680v1.C45358i;
import p680v1.C45360k;
import p680v1.InterfaceC45356g;
import p680v1.InterfaceC45359j;
import p745x1.InterfaceC45981a;

/* JADX INFO: loaded from: classes.dex */
public class DecodeJob<R> implements InterfaceC5343c.a, Runnable, Comparable<DecodeJob<?>>, C43591a.f {

    /* JADX INFO: renamed from: A */
    public Object f6774A;

    /* JADX INFO: renamed from: B */
    public DataSource f6775B;

    /* JADX INFO: renamed from: C */
    public InterfaceC5323d<?> f6776C;

    /* JADX INFO: renamed from: D */
    public volatile InterfaceC5343c f6777D;

    /* JADX INFO: renamed from: E */
    public volatile boolean f6778E;

    /* JADX INFO: renamed from: F */
    public volatile boolean f6779F;

    /* JADX INFO: renamed from: G */
    public boolean f6780G;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5338e f6784e;

    /* JADX INFO: renamed from: f */
    public final Pools.Pool<DecodeJob<?>> f6785f;

    /* JADX INFO: renamed from: i */
    public C5311e f6788i;

    /* JADX INFO: renamed from: j */
    public InterfaceC44610b f6789j;

    /* JADX INFO: renamed from: k */
    public Priority f6790k;

    /* JADX INFO: renamed from: l */
    public C45354e f6791l;

    /* JADX INFO: renamed from: m */
    public int f6792m;

    /* JADX INFO: renamed from: n */
    public int f6793n;

    /* JADX INFO: renamed from: o */
    public AbstractC45352c f6794o;

    /* JADX INFO: renamed from: p */
    public C44613e f6795p;

    /* JADX INFO: renamed from: q */
    public InterfaceC5335b<R> f6796q;

    /* JADX INFO: renamed from: r */
    public int f6797r;

    /* JADX INFO: renamed from: s */
    public Stage f6798s;

    /* JADX INFO: renamed from: t */
    public RunReason f6799t;

    /* JADX INFO: renamed from: u */
    public long f6800u;

    /* JADX INFO: renamed from: v */
    public boolean f6801v;

    /* JADX INFO: renamed from: w */
    public Object f6802w;

    /* JADX INFO: renamed from: x */
    public Thread f6803x;

    /* JADX INFO: renamed from: y */
    public InterfaceC44610b f6804y;

    /* JADX INFO: renamed from: z */
    public InterfaceC44610b f6805z;

    /* JADX INFO: renamed from: b */
    public final C5344d<R> f6781b = new C5344d<>();

    /* JADX INFO: renamed from: c */
    public final List<Throwable> f6782c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final AbstractC43593c f6783d = AbstractC43593c.m95945a();

    /* JADX INFO: renamed from: g */
    public final C5337d<?> f6786g = new C5337d<>();

    /* JADX INFO: renamed from: h */
    public final C5339f f6787h = new C5339f();

    public enum RunReason {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    public enum Stage {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$b */
    public interface InterfaceC5335b<R> {
        /* JADX INFO: renamed from: b */
        void mo6726b(GlideException glideException);

        /* JADX INFO: renamed from: c */
        void mo6727c(InterfaceC45359j<R> interfaceC45359j, DataSource dataSource, boolean z11);

        /* JADX INFO: renamed from: d */
        void mo6728d(DecodeJob<?> decodeJob);
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$c */
    public final class C5336c<Z> implements C5345e.a<Z> {

        /* JADX INFO: renamed from: a */
        public final DataSource f6811a;

        public C5336c(DataSource dataSource) {
            this.f6811a = dataSource;
        }

        @Override // com.bumptech.glide.load.engine.C5345e.a
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC45359j<Z> mo6729a(@NonNull InterfaceC45359j<Z> interfaceC45359j) {
            return DecodeJob.this.m6720u(this.f6811a, interfaceC45359j);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$d */
    public static class C5337d<Z> {

        /* JADX INFO: renamed from: a */
        public InterfaceC44610b f6813a;

        /* JADX INFO: renamed from: b */
        public InterfaceC44615g<Z> f6814b;

        /* JADX INFO: renamed from: c */
        public C45358i<Z> f6815c;

        /* JADX INFO: renamed from: a */
        public void m6730a() {
            this.f6813a = null;
            this.f6814b = null;
            this.f6815c = null;
        }

        /* JADX INFO: renamed from: b */
        public void m6731b(InterfaceC5338e interfaceC5338e, C44613e c44613e) {
            C43592b.m95941a("DecodeJob.encode");
            try {
                interfaceC5338e.mo6734a().mo101439b(this.f6813a, new C45351b(this.f6814b, this.f6815c, c44613e));
            } finally {
                this.f6815c.m100262f();
                C43592b.m95944d();
            }
        }

        /* JADX INFO: renamed from: c */
        public boolean m6732c() {
            return this.f6815c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: d */
        public <X> void m6733d(InterfaceC44610b interfaceC44610b, InterfaceC44615g<X> interfaceC44615g, C45358i<X> c45358i) {
            this.f6813a = interfaceC44610b;
            this.f6814b = interfaceC44615g;
            this.f6815c = c45358i;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$e */
    public interface InterfaceC5338e {
        /* JADX INFO: renamed from: a */
        InterfaceC45981a mo6734a();
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$f */
    public static class C5339f {

        /* JADX INFO: renamed from: a */
        public boolean f6816a;

        /* JADX INFO: renamed from: b */
        public boolean f6817b;

        /* JADX INFO: renamed from: c */
        public boolean f6818c;

        /* JADX INFO: renamed from: b */
        public synchronized boolean m6736b() {
            this.f6817b = true;
            return m6735a(false);
        }

        /* JADX INFO: renamed from: c */
        public synchronized boolean m6737c() {
            this.f6818c = true;
            return m6735a(false);
        }

        /* JADX INFO: renamed from: d */
        public synchronized boolean m6738d(boolean z11) {
            this.f6816a = true;
            return m6735a(z11);
        }

        /* JADX INFO: renamed from: e */
        public synchronized void m6739e() {
            this.f6817b = false;
            this.f6816a = false;
            this.f6818c = false;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m6735a(boolean z11) {
            return (this.f6818c || z11 || this.f6817b) && this.f6816a;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m6700a() {
        this.f6779F = true;
        InterfaceC5343c interfaceC5343c = this.f6777D;
        if (interfaceC5343c != null) {
            interfaceC5343c.cancel();
        }
    }

    /* JADX INFO: renamed from: m */
    public DecodeJob<R> m6712m(C5311e c5311e, Object obj, C45354e c45354e, InterfaceC44610b interfaceC44610b, int i11, int i12, Class<?> cls, Class<R> cls2, Priority priority, AbstractC45352c abstractC45352c, Map<Class<?>, InterfaceC44616h<?>> map, boolean z11, boolean z12, boolean z13, C44613e c44613e, InterfaceC5335b<R> interfaceC5335b, int i13) {
        this.f6781b.m6775u(c5311e, obj, interfaceC44610b, i11, i12, abstractC45352c, cls, cls2, priority, c44613e, map, z11, z12, this.f6784e);
        this.f6788i = c5311e;
        this.f6789j = interfaceC44610b;
        this.f6790k = priority;
        this.f6791l = c45354e;
        this.f6792m = i11;
        this.f6793n = i12;
        this.f6794o = abstractC45352c;
        this.f6801v = z13;
        this.f6795p = c44613e;
        this.f6796q = interfaceC5335b;
        this.f6797r = i13;
        this.f6799t = RunReason.INITIALIZE;
        this.f6802w = obj;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final void m6713n(String str, long j11) {
        m6714o(str, j11, null);
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$a */
    public static /* synthetic */ class C5334a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6808a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f6809b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f6810c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f6810c = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6810c[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Stage.values().length];
            f6809b = iArr2;
            try {
                iArr2[Stage.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6809b[Stage.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6809b[Stage.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6809b[Stage.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6809b[Stage.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[RunReason.values().length];
            f6808a = iArr3;
            try {
                iArr3[RunReason.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6808a[RunReason.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6808a[RunReason.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m6698A() {
        Throwable th2;
        this.f6783d.mo95947c();
        if (!this.f6778E) {
            this.f6778E = true;
            return;
        }
        if (this.f6782c.isEmpty()) {
            th2 = null;
        } else {
            List<Throwable> list = this.f6782c;
            th2 = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th2);
    }

    /* JADX INFO: renamed from: C */
    public boolean m6699C() {
        Stage stageM6710k = m6710k(Stage.INITIALIZE);
        return stageM6710k == Stage.RESOURCE_CACHE || stageM6710k == Stage.DATA_CACHE;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5343c.a
    /* JADX INFO: renamed from: c */
    public void mo6702c(InterfaceC44610b interfaceC44610b, Object obj, InterfaceC5323d<?> interfaceC5323d, DataSource dataSource, InterfaceC44610b interfaceC44610b2) {
        this.f6804y = interfaceC44610b;
        this.f6774A = obj;
        this.f6776C = interfaceC5323d;
        this.f6775B = dataSource;
        this.f6805z = interfaceC44610b2;
        this.f6780G = interfaceC44610b != this.f6781b.m6757c().get(0);
        if (Thread.currentThread() != this.f6803x) {
            this.f6799t = RunReason.DECODE_DATA;
            this.f6796q.mo6728d(this);
        } else {
            C43592b.m95941a("DecodeJob.decodeFromRetrievedData");
            try {
                m6708i();
            } finally {
                C43592b.m95944d();
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5343c.a
    /* JADX INFO: renamed from: d */
    public void mo6703d() {
        this.f6799t = RunReason.SWITCH_TO_SOURCE_SERVICE;
        this.f6796q.mo6728d(this);
    }

    @Override // p546q2.C43591a.f
    @NonNull
    /* JADX INFO: renamed from: e */
    public AbstractC43593c mo6704e() {
        return this.f6783d;
    }

    /* JADX INFO: renamed from: g */
    public final <Data> InterfaceC45359j<R> m6706g(InterfaceC5323d<?> interfaceC5323d, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            interfaceC5323d.mo24b();
            return null;
        }
        try {
            long jM95490b = C43359f.m95490b();
            InterfaceC45359j<R> interfaceC45359jM6707h = m6707h(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                m6713n("Decoded result " + interfaceC45359jM6707h, jM95490b);
            }
            return interfaceC45359jM6707h;
        } finally {
            interfaceC5323d.mo24b();
        }
    }

    public final int getPriority() {
        return this.f6790k.ordinal();
    }

    /* JADX INFO: renamed from: h */
    public final <Data> InterfaceC45359j<R> m6707h(Data data, DataSource dataSource) throws GlideException {
        return m6724y(data, dataSource, this.f6781b.m6762h(data.getClass()));
    }

    /* JADX INFO: renamed from: i */
    public final void m6708i() {
        InterfaceC45359j<R> interfaceC45359jM6706g;
        if (Log.isLoggable("DecodeJob", 2)) {
            m6714o("Retrieved data", this.f6800u, "data: " + this.f6774A + ", cache key: " + this.f6804y + ", fetcher: " + this.f6776C);
        }
        try {
            interfaceC45359jM6706g = m6706g(this.f6776C, this.f6774A, this.f6775B);
        } catch (GlideException e11) {
            e11.setLoggingDetails(this.f6805z, this.f6775B);
            this.f6782c.add(e11);
            interfaceC45359jM6706g = null;
        }
        if (interfaceC45359jM6706g != null) {
            m6716q(interfaceC45359jM6706g, this.f6775B, this.f6780G);
        } else {
            m6723x();
        }
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC5343c m6709j() {
        int i11 = C5334a.f6809b[this.f6798s.ordinal()];
        if (i11 == 1) {
            return new C5350j(this.f6781b, this);
        }
        if (i11 == 2) {
            return new C5342b(this.f6781b, this);
        }
        if (i11 == 3) {
            return new C5351k(this.f6781b, this);
        }
        if (i11 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f6798s);
    }

    /* JADX INFO: renamed from: k */
    public final Stage m6710k(Stage stage) {
        int i11 = C5334a.f6809b[stage.ordinal()];
        if (i11 == 1) {
            return this.f6794o.mo100250a() ? Stage.DATA_CACHE : m6710k(Stage.DATA_CACHE);
        }
        if (i11 == 2) {
            return this.f6801v ? Stage.FINISHED : Stage.SOURCE;
        }
        if (i11 == 3 || i11 == 4) {
            return Stage.FINISHED;
        }
        if (i11 == 5) {
            return this.f6794o.mo100251b() ? Stage.RESOURCE_CACHE : m6710k(Stage.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + stage);
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public final C44613e m6711l(DataSource dataSource) {
        C44613e c44613e = this.f6795p;
        if (Build.VERSION.SDK_INT < 26) {
            return c44613e;
        }
        boolean z11 = dataSource == DataSource.RESOURCE_DISK_CACHE || this.f6781b.m6777w();
        C44612d<Boolean> c44612d = C5368a.f6990j;
        Boolean bool = (Boolean) c44613e.m98732c(c44612d);
        if (bool != null && (!bool.booleanValue() || z11)) {
            return c44613e;
        }
        C44613e c44613e2 = new C44613e();
        c44613e2.m98733d(this.f6795p);
        c44613e2.m98734e(c44612d, Boolean.valueOf(z11));
        return c44613e2;
    }

    /* JADX INFO: renamed from: o */
    public final void m6714o(String str, long j11, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(C43359f.m95489a(j11));
        sb2.append(", load key: ");
        sb2.append(this.f6791l);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb2.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final void m6716q(InterfaceC45359j<R> interfaceC45359j, DataSource dataSource, boolean z11) {
        C45358i c45358i;
        if (interfaceC45359j instanceof InterfaceC45356g) {
            ((InterfaceC45356g) interfaceC45359j).initialize();
        }
        if (this.f6786g.m6732c()) {
            interfaceC45359j = C45358i.m100259c(interfaceC45359j);
            c45358i = interfaceC45359j;
        } else {
            c45358i = 0;
        }
        m6715p(interfaceC45359j, dataSource, z11);
        this.f6798s = Stage.ENCODE;
        try {
            if (this.f6786g.m6732c()) {
                this.f6786g.m6731b(this.f6784e, this.f6795p);
            }
            if (c45358i != 0) {
                c45358i.m100262f();
            }
            m6718s();
        } catch (Throwable th2) {
            if (c45358i != 0) {
                c45358i.m100262f();
            }
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        C43592b.m95942b("DecodeJob#run(model=%s)", this.f6802w);
        InterfaceC5323d<?> interfaceC5323d = this.f6776C;
        try {
            try {
                try {
                    if (this.f6779F) {
                        m6717r();
                        if (interfaceC5323d != null) {
                            interfaceC5323d.mo24b();
                        }
                        C43592b.m95944d();
                        return;
                    }
                    m6725z();
                    if (interfaceC5323d != null) {
                        interfaceC5323d.mo24b();
                    }
                    C43592b.m95944d();
                } catch (Throwable th2) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f6779F + ", stage: " + this.f6798s, th2);
                    }
                    if (this.f6798s != Stage.ENCODE) {
                        this.f6782c.add(th2);
                        m6717r();
                    }
                    if (!this.f6779F) {
                        throw th2;
                    }
                    throw th2;
                }
            } catch (CallbackException e11) {
                throw e11;
            }
        } catch (Throwable th3) {
            if (interfaceC5323d != null) {
                interfaceC5323d.mo24b();
            }
            C43592b.m95944d();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m6718s() {
        if (this.f6787h.m6736b()) {
            m6722w();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m6719t() {
        if (this.f6787h.m6737c()) {
            m6722w();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m6721v(boolean z11) {
        if (this.f6787h.m6738d(z11)) {
            m6722w();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m6722w() {
        this.f6787h.m6739e();
        this.f6786g.m6730a();
        this.f6781b.m6755a();
        this.f6778E = false;
        this.f6788i = null;
        this.f6789j = null;
        this.f6795p = null;
        this.f6790k = null;
        this.f6791l = null;
        this.f6796q = null;
        this.f6798s = null;
        this.f6777D = null;
        this.f6803x = null;
        this.f6804y = null;
        this.f6774A = null;
        this.f6775B = null;
        this.f6776C = null;
        this.f6800u = 0L;
        this.f6779F = false;
        this.f6802w = null;
        this.f6782c.clear();
        this.f6785f.release(this);
    }

    /* JADX INFO: renamed from: z */
    public final void m6725z() {
        int i11 = C5334a.f6808a[this.f6799t.ordinal()];
        if (i11 == 1) {
            this.f6798s = m6710k(Stage.INITIALIZE);
            this.f6777D = m6709j();
            m6723x();
        } else if (i11 == 2) {
            m6723x();
        } else {
            if (i11 == 3) {
                m6708i();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f6799t);
        }
    }

    public DecodeJob(InterfaceC5338e interfaceC5338e, Pools.Pool<DecodeJob<?>> pool) {
        this.f6784e = interfaceC5338e;
        this.f6785f = pool;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5343c.a
    /* JADX INFO: renamed from: b */
    public void mo6701b(InterfaceC44610b interfaceC44610b, Exception exc, InterfaceC5323d<?> interfaceC5323d, DataSource dataSource) {
        interfaceC5323d.mo24b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.setLoggingDetails(interfaceC44610b, dataSource, interfaceC5323d.mo23a());
        this.f6782c.add(glideException);
        if (Thread.currentThread() != this.f6803x) {
            this.f6799t = RunReason.SWITCH_TO_SOURCE_SERVICE;
            this.f6796q.mo6728d(this);
        } else {
            m6723x();
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull DecodeJob<?> decodeJob) {
        int priority = getPriority() - decodeJob.getPriority();
        if (priority == 0) {
            return this.f6797r - decodeJob.f6797r;
        }
        return priority;
    }

    /* JADX INFO: renamed from: p */
    public final void m6715p(InterfaceC45359j<R> interfaceC45359j, DataSource dataSource, boolean z11) {
        m6698A();
        this.f6796q.mo6727c(interfaceC45359j, dataSource, z11);
    }

    /* JADX INFO: renamed from: r */
    public final void m6717r() {
        m6698A();
        this.f6796q.mo6726b(new GlideException("Failed to load resource", new ArrayList(this.f6782c)));
        m6719t();
    }

    @NonNull
    /* JADX INFO: renamed from: u */
    public <Z> InterfaceC45359j<Z> m6720u(DataSource dataSource, @NonNull InterfaceC45359j<Z> interfaceC45359j) {
        InterfaceC45359j<Z> interfaceC45359jMo4269b;
        InterfaceC44616h<Z> interfaceC44616h;
        EncodeStrategy encodeStrategyMo4853b;
        InterfaceC44610b c45350a;
        Class<?> cls = interfaceC45359j.get().getClass();
        InterfaceC44615g<Z> interfaceC44615gM6768n = null;
        if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
            InterfaceC44616h<Z> interfaceC44616hM6772r = this.f6781b.m6772r(cls);
            interfaceC44616h = interfaceC44616hM6772r;
            interfaceC45359jMo4269b = interfaceC44616hM6772r.mo4269b(this.f6788i, interfaceC45359j, this.f6792m, this.f6793n);
        } else {
            interfaceC45359jMo4269b = interfaceC45359j;
            interfaceC44616h = null;
        }
        if (!interfaceC45359j.equals(interfaceC45359jMo4269b)) {
            interfaceC45359j.recycle();
        }
        if (this.f6781b.m6776v(interfaceC45359jMo4269b)) {
            interfaceC44615gM6768n = this.f6781b.m6768n(interfaceC45359jMo4269b);
            encodeStrategyMo4853b = interfaceC44615gM6768n.mo4853b(this.f6795p);
        } else {
            encodeStrategyMo4853b = EncodeStrategy.NONE;
        }
        InterfaceC44615g interfaceC44615g = interfaceC44615gM6768n;
        if (this.f6794o.mo100253d(!this.f6781b.m6778x(this.f6804y), dataSource, encodeStrategyMo4853b)) {
            if (interfaceC44615g != null) {
                int i11 = C5334a.f6810c[encodeStrategyMo4853b.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        c45350a = new C45360k(this.f6781b.m6756b(), this.f6804y, this.f6789j, this.f6792m, this.f6793n, interfaceC44616h, cls, this.f6795p);
                    } else {
                        throw new IllegalArgumentException("Unknown strategy: " + encodeStrategyMo4853b);
                    }
                } else {
                    c45350a = new C45350a(this.f6804y, this.f6789j);
                }
                C45358i c45358iM100259c = C45358i.m100259c(interfaceC45359jMo4269b);
                this.f6786g.m6733d(c45350a, interfaceC44615g, c45358iM100259c);
                return c45358iM100259c;
            }
            throw new Registry.NoResultEncoderAvailableException(interfaceC45359jMo4269b.get().getClass());
        }
        return interfaceC45359jMo4269b;
    }

    /* JADX INFO: renamed from: x */
    public final void m6723x() {
        this.f6803x = Thread.currentThread();
        this.f6800u = C43359f.m95490b();
        boolean zMo6753a = false;
        while (!this.f6779F && this.f6777D != null && !(zMo6753a = this.f6777D.mo6753a())) {
            this.f6798s = m6710k(this.f6798s);
            this.f6777D = m6709j();
            if (this.f6798s == Stage.SOURCE) {
                mo6703d();
                return;
            }
        }
        if ((this.f6798s == Stage.FINISHED || this.f6779F) && !zMo6753a) {
            m6717r();
        }
    }

    /* JADX INFO: renamed from: y */
    public final <Data, ResourceType> InterfaceC45359j<R> m6724y(Data data, DataSource dataSource, C5349i<Data, ResourceType, R> c5349i) throws GlideException {
        C44613e c44613eM6711l = m6711l(dataSource);
        InterfaceC5324e<Data> interfaceC5324eM6538l = this.f6788i.m6586i().m6538l(data);
        try {
            return c5349i.m6824a(interfaceC5324eM6538l, c44613eM6711l, this.f6792m, this.f6793n, new C5336c(dataSource));
        } finally {
            interfaceC5324eM6538l.mo6661b();
        }
    }
}
