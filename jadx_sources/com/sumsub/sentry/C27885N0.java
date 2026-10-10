package com.sumsub.sentry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.C41790a1;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.N0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C27885N0 {

    @NotNull
    public static final C27883M0 Companion = new C27883M0();

    /* JADX INFO: renamed from: d */
    public static final Lazy[] f56955d;

    /* JADX INFO: renamed from: a */
    public final List f56956a;

    /* JADX INFO: renamed from: b */
    public final Map f56957b;

    /* JADX INFO: renamed from: c */
    public final Boolean f56958c;

    public /* synthetic */ C27885N0(int i11, List list, Map map, Boolean bool) {
        if ((i11 & 1) == 0) {
            this.f56956a = null;
        } else {
            this.f56956a = list;
        }
        if ((i11 & 2) == 0) {
            this.f56957b = null;
        } else {
            this.f56957b = map;
        }
        if ((i11 & 4) == 0) {
            this.f56958c = null;
        } else {
            this.f56958c = bool;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f56955d = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.r1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27885N0.m68975a();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.s1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27885N0.m68976b();
            }
        }), null};
    }

    public C27885N0(ArrayList arrayList, Boolean bool) {
        this.f56956a = arrayList;
        this.f56957b = null;
        this.f56958c = bool;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m68975a() {
        return new C41813f(C27875I0.f56924a);
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m68976b() {
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new C41790a1(c41897w2, c41897w2);
    }
}
