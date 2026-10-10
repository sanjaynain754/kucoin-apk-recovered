package com.sumsub.sns.internal.core.domain.facedetector;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.sumsub.sns.internal.core.analytics.C28368g;
import com.sumsub.sns.internal.core.analytics.PrimaryAction;
import com.sumsub.sns.internal.core.analytics.PrimaryActionState;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.facedetector.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28558d {

    /* JADX INFO: renamed from: a */
    public final LinkedBlockingQueue f58112a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41709m0 f58113b;

    /* JADX INFO: renamed from: c */
    public final AbstractC41697j0 f58114c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f58115d;

    /* JADX INFO: renamed from: a */
    public final void m69415a(Bitmap bitmap, RectF rectF, Function1 function1) {
        InterfaceC28561g interfaceC28561gM69414a = m69414a();
        if (interfaceC28561gM69414a == null) {
            C33272c.f67816e.f67810a.mo68955d("CompositeFaceDetector", "No detector found", null);
            function1.invoke(new C28565k(bitmap));
            return;
        }
        try {
            function1.invoke(interfaceC28561gM69414a.mo69426a(bitmap, rectF));
        } catch (Throwable th2) {
            C33270a c33270a = C33272c.f67816e;
            c33270a.f67810a.mo68955d("CompositeFaceDetector", "Failed to process image", th2);
            if (this.f58112a.isEmpty() || C33048a.f67475h.m71434a()) {
                c33270a.f67810a.mo68955d("CompositeFaceDetector", "Face detector switching disabled with FF", null);
            } else {
                m69418d();
                InterfaceC28561g interfaceC28561gM69414a2 = m69414a();
                if (interfaceC28561gM69414a2 != null) {
                    C28368g c28368gM69264a = new C28368g().m69264a(PrimaryAction.FaceDetection);
                    c28368gM69264a.f57846b.add(PrimaryActionState.Completed);
                    c28368gM69264a.f57847c = MapsKt.toMap(ArraysKt.filterNotNull(new Pair[]{TuplesKt.m90091to("detector", interfaceC28561gM69414a2.getName()), TuplesKt.m90091to("switch", 1)}));
                    c28368gM69264a.m69267a(false);
                }
                if (interfaceC28561gM69414a2 != null) {
                    m69415a(bitmap, rectF, function1);
                    return;
                }
            }
            function1.invoke(new C28565k(bitmap));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m69416b() {
        C33272c.f67816e.f67810a.mo68955d("CompositeFaceDetector", "start: d=" + this.f58112a.size(), null);
        this.f58115d = true;
        C41696j.m91104d(this.f58113b, this.f58114c, null, new C28556b(this, null), 2, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m69417c() {
        C33272c.f67816e.f67810a.mo68955d("CompositeFaceDetector", "stop: d=" + this.f58112a.size(), null);
        this.f58115d = false;
        C41696j.m91104d(this.f58113b, this.f58114c, null, new C28557c(this, null), 2, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m69418d() {
        try {
            InterfaceC28561g interfaceC28561g = (InterfaceC28561g) this.f58112a.peek();
            InterfaceC28561g interfaceC28561g2 = (InterfaceC28561g) this.f58112a.poll();
            if (interfaceC28561g2 != null) {
                interfaceC28561g2.stop();
            }
            C33272c.f67816e.f67810a.mo68955d("CompositeFaceDetector", (interfaceC28561g != null ? interfaceC28561g.getName() : null) + " stopped and removed successfully", null);
        } catch (Throwable th2) {
            C33272c.f67816e.f67810a.mo68955d("CompositeFaceDetector", "Error happened while stopping and removing detector", th2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m69419e() {
        try {
            InterfaceC28561g interfaceC28561g = (InterfaceC28561g) this.f58112a.peek();
            if (interfaceC28561g != null) {
                interfaceC28561g.stop();
            }
            C33272c.f67816e.f67810a.mo68955d("CompositeFaceDetector", (interfaceC28561g != null ? interfaceC28561g.getName() : null) + " stopped successfully", null);
        } catch (Throwable th2) {
            C33272c.f67816e.f67810a.mo68955d("CompositeFaceDetector", "Error happened while stopping detector", th2);
        }
    }

    public C28558d(LinkedBlockingQueue linkedBlockingQueue) {
        this.f58112a = linkedBlockingQueue;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(linkedBlockingQueue, 10));
        Iterator it = linkedBlockingQueue.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC28561g) it.next()).getName());
        }
        C33272c.f67816e.f67810a.mo68955d("CompositeFaceDetector", "init: " + arrayList, null);
        this.f58113b = C41713n0.m91125a(C41727q2.m91192b(null, 1, null));
        this.f58114c = C41782z0.m91391a().limitedParallelism(1);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC28561g m69414a() {
        InterfaceC28561g interfaceC28561g = (InterfaceC28561g) this.f58112a.peek();
        if (interfaceC28561g == null) {
            C33272c.f67816e.f67810a.mo68955d("CompositeFaceDetector", "No detector to start", null);
            return null;
        }
        if (interfaceC28561g.isStarted()) {
            return interfaceC28561g;
        }
        try {
            interfaceC28561g.start();
            C33272c.f67816e.f67810a.mo68955d("CompositeFaceDetector", interfaceC28561g.getName() + " started successfully", null);
            return interfaceC28561g;
        } catch (Throwable th2) {
            C33272c.f67816e.f67810a.mo68955d("CompositeFaceDetector", "Error happened while starting " + interfaceC28561g.getName(), th2);
            m69418d();
            return null;
        }
    }
}
