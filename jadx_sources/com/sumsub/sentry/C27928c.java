package com.sumsub.sentry;

import java.util.Map;
import kotlinx.serialization.internal.C41790a1;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@SourceDebugExtension({"SMAP\nApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 App.kt\ncom/sumsub/sentry/App\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
@InterfaceC44962o
public final class C27928c {

    @NotNull
    public static final C27924b Companion = new C27924b();

    /* JADX INFO: renamed from: h */
    public static final Lazy[] f57049h = {null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sentry.g2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C27928c.m69002a();
        }
    })};

    /* JADX INFO: renamed from: a */
    public String f57050a;

    /* JADX INFO: renamed from: b */
    public final String f57051b;

    /* JADX INFO: renamed from: c */
    public final String f57052c;

    /* JADX INFO: renamed from: d */
    public String f57053d;

    /* JADX INFO: renamed from: e */
    public String f57054e;

    /* JADX INFO: renamed from: f */
    public String f57055f;

    /* JADX INFO: renamed from: g */
    public Map f57056g;

    public /* synthetic */ C27928c(int i11, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        if ((i11 & 1) == 0) {
            this.f57050a = null;
        } else {
            this.f57050a = str;
        }
        if ((i11 & 2) == 0) {
            this.f57051b = null;
        } else {
            this.f57051b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f57052c = null;
        } else {
            this.f57052c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f57053d = null;
        } else {
            this.f57053d = str4;
        }
        if ((i11 & 16) == 0) {
            this.f57054e = null;
        } else {
            this.f57054e = str5;
        }
        if ((i11 & 32) == 0) {
            this.f57055f = null;
        } else {
            this.f57055f = str6;
        }
        if ((i11 & 64) == 0) {
            this.f57056g = null;
        } else {
            this.f57056g = map;
        }
    }

    public C27928c() {
        this.f57050a = null;
        this.f57051b = null;
        this.f57052c = null;
        this.f57053d = null;
        this.f57054e = null;
        this.f57055f = null;
        this.f57056g = null;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69002a() {
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new C41790a1(c41897w2, c41897w2);
    }
}
