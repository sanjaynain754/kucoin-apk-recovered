package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.ImmutableSet;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p617s5.InterfaceC44346r;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.e */
/* JADX INFO: compiled from: BaseProducerContext.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5688e implements InterfaceC5733w0 {

    /* JADX INFO: renamed from: o */
    public static final Set<String> f9304o = ImmutableSet.m8539of((Object[]) new String[]{"id", HasExtraData.Companion.KEY_URI_SOURCE});

    /* JADX INFO: renamed from: p */
    public static final Object f9305p = new Object();

    /* JADX INFO: renamed from: b */
    public final ImageRequest f9306b;

    /* JADX INFO: renamed from: c */
    public final String f9307c;

    /* JADX INFO: renamed from: d */
    public final String f9308d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5737y0 f9309e;

    /* JADX INFO: renamed from: f */
    public final Object f9310f;

    /* JADX INFO: renamed from: g */
    public final ImageRequest.RequestLevel f9311g;

    /* JADX INFO: renamed from: h */
    public final Map<String, Object> f9312h;

    /* JADX INFO: renamed from: i */
    public boolean f9313i;

    /* JADX INFO: renamed from: j */
    public Priority f9314j;

    /* JADX INFO: renamed from: k */
    public boolean f9315k;

    /* JADX INFO: renamed from: l */
    public boolean f9316l;

    /* JADX INFO: renamed from: m */
    public final List<InterfaceC5735x0> f9317m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC44346r f9318n;

    public C5688e(ImageRequest imageRequest, String str, InterfaceC5737y0 interfaceC5737y0, Object obj, ImageRequest.RequestLevel requestLevel, boolean z11, boolean z12, Priority priority, InterfaceC44346r interfaceC44346r) {
        this(imageRequest, str, null, null, interfaceC5737y0, obj, requestLevel, z11, z12, priority, interfaceC44346r);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5733w0
    public synchronized Priority getPriority() {
        return this.f9314j;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5733w0
    /* JADX INFO: renamed from: i */
    public void mo9667i(InterfaceC5735x0 interfaceC5735x0) {
        boolean z11;
        synchronized (this) {
            this.f9317m.add(interfaceC5735x0);
            z11 = this.f9316l;
        }
        if (z11) {
            interfaceC5735x0.mo9116b();
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5733w0
    /* JADX INFO: renamed from: m */
    public synchronized boolean mo9671m() {
        return this.f9315k;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5733w0
    /* JADX INFO: renamed from: n */
    public synchronized boolean mo9672n() {
        return this.f9313i;
    }

    /* JADX INFO: renamed from: r */
    public synchronized List<InterfaceC5735x0> m9675r() {
        if (this.f9316l) {
            return null;
        }
        this.f9316l = true;
        return new ArrayList(this.f9317m);
    }

    /* JADX INFO: renamed from: s */
    public synchronized List<InterfaceC5735x0> m9676s(boolean z11) {
        if (z11 == this.f9315k) {
            return null;
        }
        this.f9315k = z11;
        return new ArrayList(this.f9317m);
    }

    /* JADX INFO: renamed from: u */
    public synchronized List<InterfaceC5735x0> m9677u(boolean z11) {
        if (z11 == this.f9313i) {
            return null;
        }
        this.f9313i = z11;
        return new ArrayList(this.f9317m);
    }

    /* JADX INFO: renamed from: v */
    public synchronized List<InterfaceC5735x0> m9678v(Priority priority) {
        if (priority == this.f9314j) {
            return null;
        }
        this.f9314j = priority;
        return new ArrayList(this.f9317m);
    }

    public C5688e(ImageRequest imageRequest, String str, String str2, Map<String, ?> map, InterfaceC5737y0 interfaceC5737y0, Object obj, ImageRequest.RequestLevel requestLevel, boolean z11, boolean z12, Priority priority, InterfaceC44346r interfaceC44346r) {
        this.f9306b = imageRequest;
        this.f9307c = str;
        HashMap map2 = new HashMap();
        this.f9312h = map2;
        map2.put("id", str);
        map2.put(HasExtraData.Companion.KEY_URI_SOURCE, imageRequest == null ? "null-request" : imageRequest.getSourceUri());
        putExtras(map);
        this.f9308d = str2;
        this.f9309e = interfaceC5737y0;
        this.f9310f = obj == null ? f9305p : obj;
        this.f9311g = requestLevel;
        this.f9313i = z11;
        this.f9314j = priority;
        this.f9315k = z12;
        this.f9316l = false;
        this.f9317m = new ArrayList();
        this.f9318n = interfaceC44346r;
    }

    /* JADX INFO: renamed from: c */
    public static void m9659c(List<InterfaceC5735x0> list) {
        if (list == null) {
            return;
        }
        Iterator<InterfaceC5735x0> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo9116b();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m9660d(List<InterfaceC5735x0> list) {
        if (list == null) {
            return;
        }
        Iterator<InterfaceC5735x0> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo9557a();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m9661e(List<InterfaceC5735x0> list) {
        if (list == null) {
            return;
        }
        Iterator<InterfaceC5735x0> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo9684c();
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m9662p(List<InterfaceC5735x0> list) {
        if (list == null) {
            return;
        }
        Iterator<InterfaceC5735x0> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo9685d();
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5733w0
    /* JADX INFO: renamed from: a */
    public Object mo9663a() {
        return this.f9310f;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5733w0
    /* JADX INFO: renamed from: b */
    public InterfaceC44346r mo9664b() {
        return this.f9318n;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5733w0
    /* JADX INFO: renamed from: g */
    public InterfaceC5737y0 mo9665g() {
        return this.f9309e;
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public <T> T getExtra(String str) {
        return (T) this.f9312h.get(str);
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public Map<String, Object> getExtras() {
        return this.f9312h;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5733w0
    public String getId() {
        return this.f9307c;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5733w0
    /* JADX INFO: renamed from: h */
    public ImageRequest mo9666h() {
        return this.f9306b;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5733w0
    /* JADX INFO: renamed from: j */
    public void mo9668j(String str, String str2) {
        this.f9312h.put("origin", str);
        this.f9312h.put(HasExtraData.Companion.KEY_ORIGIN_SUBCATEGORY, str2);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5733w0
    /* JADX INFO: renamed from: k */
    public String mo9669k() {
        return this.f9308d;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5733w0
    /* JADX INFO: renamed from: l */
    public void mo9670l(String str) {
        mo9668j(str, "default");
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5733w0
    /* JADX INFO: renamed from: o */
    public ImageRequest.RequestLevel mo9673o() {
        return this.f9311g;
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public void putExtra(String str, Object obj) {
        if (f9304o.contains(str)) {
            return;
        }
        this.f9312h.put(str, obj);
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public void putExtras(Map<String, ?> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            putExtra(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: q */
    public void m9674q() {
        m9659c(m9675r());
    }
}
