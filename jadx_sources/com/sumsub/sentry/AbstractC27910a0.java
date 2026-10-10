package com.sumsub.sentry;

import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
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
import p852kotlin.jvm.internal.Reflection;
import tg0.C44947b;
import tg0.C44955h;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.a0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public abstract class AbstractC27910a0 {

    @NotNull
    public static final C27907Z Companion = new C27907Z();

    /* JADX INFO: renamed from: m */
    public static final Lazy[] f56998m;

    /* JADX INFO: renamed from: n */
    public static final Lazy f56999n;

    /* JADX INFO: renamed from: a */
    public final C27968m f57000a;

    /* JADX INFO: renamed from: b */
    public C27903X f57001b;

    /* JADX INFO: renamed from: c */
    public final Map f57002c;

    /* JADX INFO: renamed from: d */
    public final String f57003d;

    /* JADX INFO: renamed from: e */
    public String f57004e;

    /* JADX INFO: renamed from: f */
    public String f57005f;

    /* JADX INFO: renamed from: g */
    public C27950h1 f57006g;

    /* JADX INFO: renamed from: h */
    public String f57007h;

    /* JADX INFO: renamed from: i */
    public String f57008i;

    /* JADX INFO: renamed from: j */
    public final List f57009j;

    /* JADX INFO: renamed from: k */
    public Map f57010k;

    /* JADX INFO: renamed from: l */
    public C28015y f57011l;

    public /* synthetic */ AbstractC27910a0(int i11, C27968m c27968m, C27903X c27903x, Map map, String str, String str2, String str3, C27950h1 c27950h1, String str4, String str5, List list, Map map2) {
        this.f57000a = (i11 & 1) == 0 ? new C27968m() : c27968m;
        if ((i11 & 2) == 0) {
            this.f57001b = null;
        } else {
            this.f57001b = c27903x;
        }
        if ((i11 & 4) == 0) {
            this.f57002c = new LinkedHashMap();
        } else {
            this.f57002c = map;
        }
        if ((i11 & 8) == 0) {
            this.f57003d = null;
        } else {
            this.f57003d = str;
        }
        if ((i11 & 16) == 0) {
            this.f57004e = null;
        } else {
            this.f57004e = str2;
        }
        if ((i11 & 32) == 0) {
            this.f57005f = null;
        } else {
            this.f57005f = str3;
        }
        if ((i11 & 64) == 0) {
            this.f57006g = null;
        } else {
            this.f57006g = c27950h1;
        }
        if ((i11 & 128) == 0) {
            this.f57007h = null;
        } else {
            this.f57007h = str4;
        }
        if ((i11 & 256) == 0) {
            this.f57008i = null;
        } else {
            this.f57008i = str5;
        }
        if ((i11 & 512) == 0) {
            this.f57009j = null;
        } else {
            this.f57009j = list;
        }
        if ((i11 & 1024) == 0) {
            this.f57010k = null;
        } else {
            this.f57010k = map2;
        }
        this.f57011l = null;
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f56998m = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.a2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC27910a0.m68988a();
            }
        }), null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.b2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC27910a0.m68989b();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.c2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC27910a0.m68990c();
            }
        })};
        f56999n = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.d2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC27910a0.m68991d();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m68988a() {
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new C41790a1(c41897w2, c41897w2);
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m68989b() {
        return new C41813f(C27932d.f57059a);
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ InterfaceC44951d m68990c() {
        return new C41790a1(C41897w2.f92051a, new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]));
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ InterfaceC44951d m68991d() {
        return new C44955h(Reflection.getOrCreateKotlinClass(AbstractC27910a0.class), new Annotation[0]);
    }

    public AbstractC27910a0() {
        this.f57000a = new C27968m();
        this.f57002c = new LinkedHashMap();
    }
}
