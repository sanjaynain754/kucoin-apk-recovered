package com.sumsub.sentry;

import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.internal.C41813f;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C27996t {

    @NotNull
    public static final C27992s Companion = new C27992s();

    /* JADX INFO: renamed from: c */
    public static final Lazy[] f57129c = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sentry.t2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C27996t.m69023a();
        }
    })};

    /* JADX INFO: renamed from: a */
    public final C27895T f57130a;

    /* JADX INFO: renamed from: b */
    public final List f57131b;

    public /* synthetic */ C27996t(int i11, C27895T c27895t, List list) {
        this.f57130a = (i11 & 1) == 0 ? null : c27895t;
        if ((i11 & 2) == 0) {
            this.f57131b = new ArrayList();
        } else {
            this.f57131b = list;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69023a() {
        return new C41813f(C27976o.f57107a);
    }

    public C27996t() {
        ArrayList arrayList = new ArrayList();
        this.f57130a = null;
        this.f57131b = arrayList;
    }
}
