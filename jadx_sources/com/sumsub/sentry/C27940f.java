package com.sumsub.sentry;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
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

/* JADX INFO: renamed from: com.sumsub.sentry.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C27940f {

    @NotNull
    public static final C27936e Companion = new C27936e();

    /* JADX INFO: renamed from: g */
    public static final Lazy[] f57062g;

    /* JADX INFO: renamed from: a */
    public final Date f57063a;

    /* JADX INFO: renamed from: b */
    public final String f57064b;

    /* JADX INFO: renamed from: c */
    public final String f57065c;

    /* JADX INFO: renamed from: d */
    public final Map f57066d;

    /* JADX INFO: renamed from: e */
    public final String f57067e;

    /* JADX INFO: renamed from: f */
    public final SentryLevel f57068f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f57062g = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.h2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27940f.m69007a();
            }
        }), null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.i2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27940f.m69008b();
            }
        }), null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.j2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SentryLevel.Companion.serializer();
            }
        })};
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69007a() {
        return new C44947b(Reflection.getOrCreateKotlinClass(Date.class), null, new InterfaceC44951d[0]);
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69008b() {
        return new C41790a1(C41897w2.f92051a, new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]));
    }

    public C27940f(int i11, Date date, String str, String str2, Map map, String str3, SentryLevel sentryLevel) {
        this.f57063a = (i11 & 1) == 0 ? AbstractC27972n.f57094b : date;
        if ((i11 & 2) == 0) {
            this.f57064b = null;
        } else {
            this.f57064b = str;
        }
        if ((i11 & 4) == 0) {
            this.f57065c = null;
        } else {
            this.f57065c = str2;
        }
        if ((i11 & 8) == 0) {
            this.f57066d = new ConcurrentHashMap();
        } else {
            this.f57066d = map;
        }
        if ((i11 & 16) == 0) {
            this.f57067e = null;
        } else {
            this.f57067e = str3;
        }
        if ((i11 & 32) == 0) {
            this.f57068f = null;
        } else {
            this.f57068f = sentryLevel;
        }
    }
}
