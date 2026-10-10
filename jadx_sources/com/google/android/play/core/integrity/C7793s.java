package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C7815aj;
import com.google.android.play.integrity.internal.C7817al;
import com.google.android.play.integrity.internal.InterfaceC7816ak;
import com.google.android.play.integrity.internal.InterfaceC7819an;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.s */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7793s {

    /* JADX INFO: renamed from: a */
    private final C7793s f12066a = this;

    /* JADX INFO: renamed from: b */
    private final InterfaceC7819an f12067b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC7819an f12068c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC7819an f12069d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC7819an f12070e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC7819an f12071f;

    /* JADX INFO: renamed from: a */
    public final IntegrityManager m13268a() {
        return (IntegrityManager) this.f12071f.mo13217a();
    }

    public /* synthetic */ C7793s(Context context, C7792r c7792r) {
        InterfaceC7816ak interfaceC7816akM13304b = C7817al.m13304b(context);
        this.f12067b = interfaceC7816akM13304b;
        InterfaceC7819an interfaceC7819anM13303b = C7815aj.m13303b(C7728ac.f11957a);
        this.f12068c = interfaceC7819anM13303b;
        C7746au c7746au = new C7746au(interfaceC7816akM13304b, C7784l.f12059a);
        this.f12069d = c7746au;
        InterfaceC7819an interfaceC7819anM13303b2 = C7815aj.m13303b(new C7737al(interfaceC7816akM13304b, interfaceC7819anM13303b, c7746au, C7784l.f12059a));
        this.f12070e = interfaceC7819anM13303b2;
        this.f12071f = C7815aj.m13303b(new C7727ab(interfaceC7819anM13303b2));
    }
}
