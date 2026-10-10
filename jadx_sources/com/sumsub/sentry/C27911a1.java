package com.sumsub.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.internal.C41790a1;
import kotlinx.serialization.internal.C41801c2;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.a1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C27911a1 {

    @NotNull
    public static final C27908Z0 Companion = new C27908Z0();

    /* JADX INFO: renamed from: h */
    public static final Lazy[] f57012h;

    /* JADX INFO: renamed from: a */
    public final String f57013a;

    /* JADX INFO: renamed from: b */
    public final String f57014b;

    /* JADX INFO: renamed from: c */
    public final String f57015c;

    /* JADX INFO: renamed from: d */
    public final String f57016d;

    /* JADX INFO: renamed from: e */
    public final String f57017e;

    /* JADX INFO: renamed from: f */
    public final SpanStatus f57018f;

    /* JADX INFO: renamed from: g */
    public final Map f57019g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f57012h = new Lazy[]{null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.e2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpanStatus.Companion.serializer();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.f2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27911a1.m68993b();
            }
        })};
    }

    public /* synthetic */ C27911a1(int i11, String str, String str2, String str3, String str4, String str5, SpanStatus spanStatus, Map map) {
        if (15 != (i11 & 15)) {
            C41801c2.m91514a(i11, 15, C27906Y0.f56996a.getDescriptor());
        }
        this.f57013a = str;
        this.f57014b = str2;
        this.f57015c = str3;
        this.f57016d = str4;
        if ((i11 & 16) == 0) {
            this.f57017e = null;
        } else {
            this.f57017e = str5;
        }
        if ((i11 & 32) == 0) {
            this.f57018f = null;
        } else {
            this.f57018f = spanStatus;
        }
        if ((i11 & 64) == 0) {
            this.f57019g = new ConcurrentHashMap();
        } else {
            this.f57019g = map;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m68993b() {
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new C41790a1(c41897w2, c41897w2);
    }
}
