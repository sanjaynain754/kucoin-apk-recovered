package com.sumsub.sns.internal.features.presentation.prooface.session;

import android.graphics.Bitmap;
import android.util.Size;
import com.sumsub.sns.internal.core.common.C28422U0;
import com.sumsub.sns.internal.features.data.model.prooface.C29818c;
import com.sumsub.sns.internal.features.data.network.prooface.C29900o;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.c1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32202c1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41709m0 f65578a;

    /* JADX INFO: renamed from: b */
    public final C28422U0 f65579b;

    /* JADX INFO: renamed from: c */
    public final C29900o f65580c;

    /* JADX INFO: renamed from: d */
    public final C32156G0 f65581d;

    /* JADX INFO: renamed from: e */
    public final C29818c f65582e;

    /* JADX INFO: renamed from: f */
    public final int f65583f;

    /* JADX INFO: renamed from: g */
    public int f65584g;

    /* JADX INFO: renamed from: h */
    public long f65585h;

    /* JADX INFO: renamed from: i */
    public long f65586i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC41668m f65587j;

    /* JADX INFO: renamed from: k */
    public boolean f65588k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC41678w f65589l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC41668m f65590m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC41678w f65591n;

    /* JADX INFO: renamed from: a */
    public final boolean m71056a(Bitmap bitmap) {
        if (this.f65584g > 0) {
            return false;
        }
        this.f65579b.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < this.f65586i) {
            return false;
        }
        Size size = new Size(bitmap.getWidth(), bitmap.getHeight());
        AbstractC32267d.m71078a("SegmentSender: enqueueSegment");
        C41696j.m91104d(this.f65578a, null, null, new C32174P0(this, bitmap, size, "NOT_ALIGNED", true, null), 3, null);
        AbstractC32267d.m71078a("SegmentSender: debug segment enqueued");
        this.f65586i = jCurrentTimeMillis + 8000;
        return true;
    }

    public C32202c1(InterfaceC41709m0 interfaceC41709m0, C28422U0 c28422u0, C29900o c29900o, C32156G0 c32156g0, C29818c c29818c, int i11) {
        AbstractC41697j0 abstractC41697j0LimitedParallelism = C41782z0.m91391a().limitedParallelism(1);
        this.f65578a = interfaceC41709m0;
        this.f65579b = c28422u0;
        this.f65580c = c29900o;
        this.f65581d = c32156g0;
        this.f65582e = c29818c;
        this.f65583f = i11;
        this.f65586i = System.currentTimeMillis() + 100;
        InterfaceC41668m interfaceC41668mM91001b = C41674s.m91001b(0, 0, null, 7, null);
        this.f65587j = interfaceC41668mM91001b;
        InterfaceC41668m interfaceC41668mM91001b2 = C41674s.m91001b(0, 0, null, 7, null);
        this.f65590m = interfaceC41668mM91001b2;
        InterfaceC41634e interfaceC41634eM90930n0 = C41636g.m90930n0(interfaceC41668mM91001b2, new C32185V0(null));
        SharingStarted.Companion companion = SharingStarted.INSTANCE;
        this.f65591n = C41636g.m90916g0(interfaceC41634eM90930n0, interfaceC41709m0, companion.getEagerly(), Boolean.FALSE);
        this.f65589l = C41636g.m90916g0(C41636g.m90908c0(new C32183U0(new C32199b1(C41636g.m90890N(new C32191Y0(interfaceC41668mM91001b, this), abstractC41697j0LimitedParallelism), this)), 0, new C32158H0(null)), interfaceC41709m0, companion.getEagerly(), 0);
    }
}
