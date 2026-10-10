package com.sumsub.sentry;

import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.internal.C41826h2;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.X0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C27904X0<T> {

    @NotNull
    public static final C27902W0 Companion = new C27902W0();

    /* JADX INFO: renamed from: a */
    public final List f56992a;

    public /* synthetic */ C27904X0(List list, int i11) {
        if ((i11 & 1) == 0) {
            this.f56992a = new ArrayList(0);
        } else {
            this.f56992a = list;
        }
    }

    static {
        new C41826h2("com.sumsub.sentry.SentryValues", null, 1).m91581o("values", true);
    }

    public C27904X0(List list) {
        this.f56992a = list;
    }
}
