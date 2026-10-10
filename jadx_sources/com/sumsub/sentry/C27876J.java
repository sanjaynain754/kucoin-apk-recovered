package com.sumsub.sentry;

import java.util.Map;
import kotlinx.serialization.internal.C41790a1;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Reflection;
import tg0.C44947b;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C27876J {

    @NotNull
    public static final C27874I Companion = new C27874I();

    /* JADX INFO: renamed from: h */
    public static final Lazy[] f56925h;

    /* JADX INFO: renamed from: a */
    public final String f56926a;

    /* JADX INFO: renamed from: b */
    public final String f56927b;

    /* JADX INFO: renamed from: c */
    public final String f56928c;

    /* JADX INFO: renamed from: d */
    public final Boolean f56929d;

    /* JADX INFO: renamed from: e */
    public final Map f56930e;

    /* JADX INFO: renamed from: f */
    public final Map f56931f;

    /* JADX INFO: renamed from: g */
    public final Boolean f56932g;

    public /* synthetic */ C27876J(int i11, String str, String str2, String str3, Boolean bool, Map map, Map map2, Boolean bool2) {
        if ((i11 & 1) == 0) {
            this.f56926a = null;
        } else {
            this.f56926a = str;
        }
        if ((i11 & 2) == 0) {
            this.f56927b = null;
        } else {
            this.f56927b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f56928c = null;
        } else {
            this.f56928c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f56929d = null;
        } else {
            this.f56929d = bool;
        }
        if ((i11 & 16) == 0) {
            this.f56930e = null;
        } else {
            this.f56930e = map;
        }
        if ((i11 & 32) == 0) {
            this.f56931f = null;
        } else {
            this.f56931f = map2;
        }
        if ((i11 & 64) == 0) {
            this.f56932g = null;
        } else {
            this.f56932g = bool2;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f56925h = new Lazy[]{null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.o1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27876J.m68972a();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.p1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27876J.m68973b();
            }
        }), null};
    }

    public C27876J(String str, Boolean bool) {
        this.f56926a = str;
        this.f56927b = null;
        this.f56928c = null;
        this.f56929d = bool;
        this.f56930e = null;
        this.f56931f = null;
        this.f56932g = null;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m68972a() {
        return new C41790a1(C41897w2.f92051a, new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]));
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m68973b() {
        return new C41790a1(C41897w2.f92051a, new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]));
    }
}
