package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C7815aj;
import com.google.android.play.integrity.internal.C7817al;
import com.google.android.play.integrity.internal.InterfaceC7816ak;
import com.google.android.play.integrity.internal.InterfaceC7819an;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.w */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7797w implements InterfaceC7748aw {

    /* JADX INFO: renamed from: a */
    private final C7797w f12073a = this;

    /* JADX INFO: renamed from: b */
    private final InterfaceC7819an f12074b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC7819an f12075c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC7819an f12076d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC7819an f12077e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC7819an f12078f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC7819an f12079g;

    @Override // com.google.android.play.core.integrity.InterfaceC7748aw
    /* JADX INFO: renamed from: a */
    public final StandardIntegrityManager mo13236a() {
        return (StandardIntegrityManager) this.f12079g.mo13217a();
    }

    public /* synthetic */ C7797w(Context context, C7796v c7796v) {
        InterfaceC7816ak interfaceC7816akM13304b = C7817al.m13304b(context);
        this.f12074b = interfaceC7816akM13304b;
        InterfaceC7819an interfaceC7819anM13303b = C7815aj.m13303b(C7754bb.f12010a);
        this.f12075c = interfaceC7819anM13303b;
        C7746au c7746au = new C7746au(interfaceC7816akM13304b, C7788n.f12064a);
        this.f12076d = c7746au;
        InterfaceC7819an interfaceC7819anM13303b2 = C7815aj.m13303b(new C7768bp(interfaceC7816akM13304b, interfaceC7819anM13303b, c7746au, C7788n.f12064a));
        this.f12077e = interfaceC7819anM13303b2;
        InterfaceC7819an interfaceC7819anM13303b3 = C7815aj.m13303b(new C7773bu(interfaceC7819anM13303b2));
        this.f12078f = interfaceC7819anM13303b3;
        this.f12079g = C7815aj.m13303b(new C7753ba(interfaceC7819anM13303b2, interfaceC7819anM13303b3));
    }
}
