package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes59.dex */
public class Picasso {

    /* JADX INFO: renamed from: p */
    public static final Handler f56672p = new HandlerC27812a(Looper.getMainLooper());

    /* JADX INFO: renamed from: q */
    @SuppressLint({"StaticFieldLeak"})
    public static volatile Picasso f56673q = null;

    /* JADX INFO: renamed from: a */
    public final InterfaceC27815d f56674a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC27816e f56675b;

    /* JADX INFO: renamed from: c */
    public final C27814c f56676c;

    /* JADX INFO: renamed from: d */
    public final List<AbstractC27836t> f56677d;

    /* JADX INFO: renamed from: e */
    public final Context f56678e;

    /* JADX INFO: renamed from: f */
    public final C27825i f56679f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC27820d f56680g;

    /* JADX INFO: renamed from: h */
    public final C27838v f56681h;

    /* JADX INFO: renamed from: i */
    public final Map<Object, AbstractC27817a> f56682i;

    /* JADX INFO: renamed from: j */
    public final Map<ImageView, ViewTreeObserverOnPreDrawListenerC27824h> f56683j;

    /* JADX INFO: renamed from: k */
    public final ReferenceQueue<Object> f56684k;

    /* JADX INFO: renamed from: l */
    public final Bitmap.Config f56685l;

    /* JADX INFO: renamed from: m */
    public boolean f56686m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f56687n;

    /* JADX INFO: renamed from: o */
    public boolean f56688o;

    public enum Priority {
        LOW,
        NORMAL,
        HIGH
    }

    /* JADX INFO: renamed from: com.squareup.picasso.Picasso$a */
    public static class HandlerC27812a extends Handler {
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 3) {
                AbstractC27817a abstractC27817a = (AbstractC27817a) message.obj;
                if (abstractC27817a.m68812g().f56687n) {
                    C27841y.m68954t("Main", "canceled", abstractC27817a.f56707b.m68894d(), "target got garbage collected");
                }
                abstractC27817a.f56706a.m68787a(abstractC27817a.m68816k());
                return;
            }
            int i12 = 0;
            if (i11 == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i12 < size) {
                    RunnableC27819c runnableC27819c = (RunnableC27819c) list.get(i12);
                    runnableC27819c.f56728c.m68789c(runnableC27819c);
                    i12++;
                }
                return;
            }
            if (i11 != 13) {
                throw new AssertionError("Unknown handler message received: " + message.what);
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            while (i12 < size2) {
                AbstractC27817a abstractC27817a2 = (AbstractC27817a) list2.get(i12);
                abstractC27817a2.f56706a.m68797k(abstractC27817a2);
                i12++;
            }
        }

        public HandlerC27812a(Looper looper) {
            super(looper);
        }
    }

    /* JADX INFO: renamed from: com.squareup.picasso.Picasso$b */
    public static class C27813b {

        /* JADX INFO: renamed from: a */
        public final Context f56691a;

        /* JADX INFO: renamed from: b */
        public InterfaceC27826j f56692b;

        /* JADX INFO: renamed from: c */
        public ExecutorService f56693c;

        /* JADX INFO: renamed from: d */
        public InterfaceC27820d f56694d;

        /* JADX INFO: renamed from: e */
        public InterfaceC27815d f56695e;

        /* JADX INFO: renamed from: f */
        public InterfaceC27816e f56696f;

        /* JADX INFO: renamed from: g */
        public List<AbstractC27836t> f56697g;

        /* JADX INFO: renamed from: h */
        public Bitmap.Config f56698h;

        /* JADX INFO: renamed from: i */
        public boolean f56699i;

        /* JADX INFO: renamed from: j */
        public boolean f56700j;

        /* JADX INFO: renamed from: a */
        public Picasso m68800a() {
            Context context = this.f56691a;
            if (this.f56692b == null) {
                this.f56692b = new C27831o(context);
            }
            if (this.f56694d == null) {
                this.f56694d = new C27829m(context);
            }
            if (this.f56693c == null) {
                this.f56693c = new C27833q();
            }
            if (this.f56696f == null) {
                this.f56696f = InterfaceC27816e.f56705a;
            }
            C27838v c27838v = new C27838v(this.f56694d);
            return new Picasso(context, new C27825i(context, this.f56693c, Picasso.f56672p, this.f56692b, this.f56694d, c27838v), this.f56694d, this.f56695e, this.f56696f, this.f56697g, c27838v, this.f56698h, this.f56699i, this.f56700j);
        }

        /* JADX INFO: renamed from: b */
        public C27813b m68801b(@NonNull InterfaceC27826j interfaceC27826j) {
            if (interfaceC27826j == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            }
            if (this.f56692b != null) {
                throw new IllegalStateException("Downloader already set.");
            }
            this.f56692b = interfaceC27826j;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C27813b m68802c(@NonNull InterfaceC27815d interfaceC27815d) {
            if (interfaceC27815d == null) {
                throw new IllegalArgumentException("Listener must not be null.");
            }
            if (this.f56695e != null) {
                throw new IllegalStateException("Listener already set.");
            }
            this.f56695e = interfaceC27815d;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C27813b m68803d(@NonNull InterfaceC27816e interfaceC27816e) {
            if (interfaceC27816e == null) {
                throw new IllegalArgumentException("Transformer must not be null.");
            }
            if (this.f56696f != null) {
                throw new IllegalStateException("Transformer already set.");
            }
            this.f56696f = interfaceC27816e;
            return this;
        }

        public C27813b(@NonNull Context context) {
            if (context != null) {
                this.f56691a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }
    }

    /* JADX INFO: renamed from: com.squareup.picasso.Picasso$c */
    public static class C27814c extends Thread {

        /* JADX INFO: renamed from: b */
        public final ReferenceQueue<Object> f56701b;

        /* JADX INFO: renamed from: c */
        public final Handler f56702c;

        /* JADX INFO: renamed from: com.squareup.picasso.Picasso$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Exception f56703b;

            public a(Exception exc) {
                this.f56703b = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f56703b);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    AbstractC27817a.a aVar = (AbstractC27817a.a) this.f56701b.remove(1000L);
                    Message messageObtainMessage = this.f56702c.obtainMessage();
                    if (aVar != null) {
                        messageObtainMessage.what = 3;
                        messageObtainMessage.obj = aVar.f56718a;
                        this.f56702c.sendMessage(messageObtainMessage);
                    } else {
                        messageObtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e11) {
                    this.f56702c.post(new a(e11));
                    return;
                }
            }
        }

        public C27814c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f56701b = referenceQueue;
            this.f56702c = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }
    }

    /* JADX INFO: renamed from: com.squareup.picasso.Picasso$d */
    public interface InterfaceC27815d {
        /* JADX INFO: renamed from: a */
        void mo68804a(Picasso picasso, Uri uri, Exception exc);
    }

    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(SupportMenu.CATEGORY_MASK);

        final int debugColor;

        LoadedFrom(int i11) {
            this.debugColor = i11;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m68788b(@NonNull ImageView imageView) {
        if (imageView == null) {
            throw new IllegalArgumentException("view cannot be null.");
        }
        m68787a(imageView);
    }

    /* JADX INFO: renamed from: d */
    public void m68790d(ImageView imageView, ViewTreeObserverOnPreDrawListenerC27824h viewTreeObserverOnPreDrawListenerC27824h) {
        if (this.f56683j.containsKey(imageView)) {
            m68787a(imageView);
        }
        this.f56683j.put(imageView, viewTreeObserverOnPreDrawListenerC27824h);
    }

    /* JADX INFO: renamed from: g */
    public List<AbstractC27836t> m68793g() {
        return this.f56677d;
    }

    /* JADX INFO: renamed from: h */
    public C27835s m68794h(@Nullable Uri uri) {
        return new C27835s(this, uri, 0);
    }

    /* JADX INFO: renamed from: i */
    public C27835s m68795i(@Nullable String str) {
        if (str == null) {
            return new C27835s(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return m68794h(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* JADX INFO: renamed from: j */
    public Bitmap m68796j(String str) {
        Bitmap bitmap = this.f56680g.get(str);
        if (bitmap != null) {
            this.f56681h.m68924d();
            return bitmap;
        }
        this.f56681h.m68925e();
        return bitmap;
    }

    /* JADX INFO: renamed from: k */
    public void m68797k(AbstractC27817a abstractC27817a) {
        Bitmap bitmapM68796j = MemoryPolicy.shouldReadFromMemoryCache(abstractC27817a.f56710e) ? m68796j(abstractC27817a.m68809d()) : null;
        if (bitmapM68796j == null) {
            m68792f(abstractC27817a);
            if (this.f56687n) {
                C27841y.m68953s("Main", "resumed", abstractC27817a.f56707b.m68894d());
                return;
            }
            return;
        }
        LoadedFrom loadedFrom = LoadedFrom.MEMORY;
        m68791e(bitmapM68796j, loadedFrom, abstractC27817a, null);
        if (this.f56687n) {
            C27841y.m68954t("Main", "completed", abstractC27817a.f56707b.m68894d(), "from " + loadedFrom);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m68798l(AbstractC27817a abstractC27817a) {
        this.f56679f.m68859h(abstractC27817a);
    }

    /* JADX INFO: renamed from: m */
    public C27834r m68799m(C27834r c27834r) {
        C27834r c27834rMo68805a = this.f56675b.mo68805a(c27834r);
        if (c27834rMo68805a != null) {
            return c27834rMo68805a;
        }
        throw new IllegalStateException("Request transformer " + this.f56675b.getClass().getCanonicalName() + " returned null for " + c27834r);
    }

    public Picasso(Context context, C27825i c27825i, InterfaceC27820d interfaceC27820d, InterfaceC27815d interfaceC27815d, InterfaceC27816e interfaceC27816e, List<AbstractC27836t> list, C27838v c27838v, Bitmap.Config config, boolean z11, boolean z12) {
        int size;
        this.f56678e = context;
        this.f56679f = c27825i;
        this.f56680g = interfaceC27820d;
        this.f56674a = interfaceC27815d;
        this.f56675b = interfaceC27816e;
        this.f56685l = config;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        ArrayList arrayList = new ArrayList(size + 7);
        arrayList.add(new C27837u(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C27822f(context));
        arrayList.add(new MediaStoreRequestHandler(context));
        arrayList.add(new C27823g(context));
        arrayList.add(new C27818b(context));
        arrayList.add(new C27827k(context));
        arrayList.add(new NetworkRequestHandler(c27825i.f56759d, c27838v));
        this.f56677d = Collections.unmodifiableList(arrayList);
        this.f56681h = c27838v;
        this.f56682i = new WeakHashMap();
        this.f56683j = new WeakHashMap();
        this.f56686m = z11;
        this.f56687n = z12;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f56684k = referenceQueue;
        C27814c c27814c = new C27814c(referenceQueue, f56672p);
        this.f56676c = c27814c;
        c27814c.start();
    }

    /* JADX INFO: renamed from: a */
    public void m68787a(Object obj) {
        C27841y.m68937c();
        AbstractC27817a abstractC27817aRemove = this.f56682i.remove(obj);
        if (abstractC27817aRemove != null) {
            abstractC27817aRemove.mo68806a();
            this.f56679f.m68854c(abstractC27817aRemove);
        }
        if (obj instanceof ImageView) {
            ViewTreeObserverOnPreDrawListenerC27824h viewTreeObserverOnPreDrawListenerC27824hRemove = this.f56683j.remove((ImageView) obj);
            if (viewTreeObserverOnPreDrawListenerC27824hRemove != null) {
                viewTreeObserverOnPreDrawListenerC27824hRemove.m68851a();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m68789c(RunnableC27819c runnableC27819c) {
        boolean z11;
        AbstractC27817a abstractC27817aM68832h = runnableC27819c.m68832h();
        List<AbstractC27817a> listM68833i = runnableC27819c.m68833i();
        if (listM68833i != null && !listM68833i.isEmpty()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (abstractC27817aM68832h == null && !z11) {
            return;
        }
        Uri uri = runnableC27819c.m68834j().f56803d;
        Exception excM68835k = runnableC27819c.m68835k();
        Bitmap bitmapM68841s = runnableC27819c.m68841s();
        LoadedFrom loadedFromM68837o = runnableC27819c.m68837o();
        if (abstractC27817aM68832h != null) {
            m68791e(bitmapM68841s, loadedFromM68837o, abstractC27817aM68832h, excM68835k);
        }
        if (z11) {
            int size = listM68833i.size();
            for (int i11 = 0; i11 < size; i11++) {
                m68791e(bitmapM68841s, loadedFromM68837o, listM68833i.get(i11), excM68835k);
            }
        }
        InterfaceC27815d interfaceC27815d = this.f56674a;
        if (interfaceC27815d != null && excM68835k != null) {
            interfaceC27815d.mo68804a(this, uri, excM68835k);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m68791e(Bitmap bitmap, LoadedFrom loadedFrom, AbstractC27817a abstractC27817a, Exception exc) {
        if (!abstractC27817a.m68817l()) {
            if (!abstractC27817a.m68818m()) {
                this.f56682i.remove(abstractC27817a.m68816k());
            }
            if (bitmap != null) {
                if (loadedFrom != null) {
                    abstractC27817a.mo68807b(bitmap, loadedFrom);
                    if (this.f56687n) {
                        C27841y.m68954t("Main", "completed", abstractC27817a.f56707b.m68894d(), "from " + loadedFrom);
                        return;
                    }
                    return;
                }
                throw new AssertionError("LoadedFrom cannot be null.");
            }
            abstractC27817a.mo68808c(exc);
            if (this.f56687n) {
                C27841y.m68954t("Main", "errored", abstractC27817a.f56707b.m68894d(), exc.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m68792f(AbstractC27817a abstractC27817a) {
        Object objM68816k = abstractC27817a.m68816k();
        if (objM68816k != null && this.f56682i.get(objM68816k) != abstractC27817a) {
            m68787a(objM68816k);
            this.f56682i.put(objM68816k, abstractC27817a);
        }
        m68798l(abstractC27817a);
    }

    /* JADX INFO: renamed from: com.squareup.picasso.Picasso$e */
    public interface InterfaceC27816e {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC27816e f56705a = new a();

        /* JADX INFO: renamed from: a */
        C27834r mo68805a(C27834r c27834r);

        /* JADX INFO: renamed from: com.squareup.picasso.Picasso$e$a */
        public static class a implements InterfaceC27816e {
            @Override // com.squareup.picasso.Picasso.InterfaceC27816e
            /* JADX INFO: renamed from: a */
            public C27834r mo68805a(C27834r c27834r) {
                return c27834r;
            }
        }
    }
}
