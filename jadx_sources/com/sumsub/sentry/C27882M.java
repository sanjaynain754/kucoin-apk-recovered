package com.sumsub.sentry;

import java.util.List;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.M */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C27882M {

    @NotNull
    public static final C27880L Companion = new C27880L();

    /* JADX INFO: renamed from: d */
    public static final Lazy[] f56950d = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sentry.q1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C27882M.m68974a();
        }
    })};

    /* JADX INFO: renamed from: a */
    public final String f56951a;

    /* JADX INFO: renamed from: b */
    public final String f56952b;

    /* JADX INFO: renamed from: c */
    public final List f56953c;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m68974a() {
        return new C41813f(C41897w2.f92051a);
    }

    public /* synthetic */ C27882M(int i11, String str, String str2, List list) {
        if ((i11 & 1) == 0) {
            this.f56951a = null;
        } else {
            this.f56951a = str;
        }
        if ((i11 & 2) == 0) {
            this.f56952b = null;
        } else {
            this.f56952b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f56953c = null;
        } else {
            this.f56953c = list;
        }
    }
}
