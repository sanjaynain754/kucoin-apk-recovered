package com.sumsub.sns.internal.features.data.model.prooface;

import java.util.List;
import kotlinx.serialization.internal.C41813f;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.prooface.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29834r {

    @NotNull
    public static final C29830n Companion = new C29830n();

    /* JADX INFO: renamed from: d */
    public static final Lazy[] f59911d = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.prooface.b0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29834r.m69929a();
        }
    })};

    /* JADX INFO: renamed from: a */
    public final String f59912a;

    /* JADX INFO: renamed from: b */
    public final String f59913b;

    /* JADX INFO: renamed from: c */
    public final List f59914c;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69929a() {
        return new C41813f(C29831o.f59909a);
    }

    public /* synthetic */ C29834r(int i11, String str, String str2, List list) {
        if ((i11 & 1) == 0) {
            this.f59912a = null;
        } else {
            this.f59912a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59913b = null;
        } else {
            this.f59913b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59914c = null;
        } else {
            this.f59914c = list;
        }
    }
}
