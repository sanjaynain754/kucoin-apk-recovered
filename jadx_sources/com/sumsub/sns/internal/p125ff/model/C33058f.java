package com.sumsub.sns.internal.p125ff.model;

import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.internal.C41801c2;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ff.model.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C33058f {

    @NotNull
    public static final C33057e Companion = new C33057e();

    /* JADX INFO: renamed from: b */
    public static final Lazy[] f67510b = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.ff.model.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C33058f.m71437a();
        }
    })};

    /* JADX INFO: renamed from: a */
    public final List f67511a;

    public /* synthetic */ C33058f(List list, int i11) {
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C33056d.f67509a.getDescriptor());
        }
        this.f67511a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33058f) && Intrinsics.areEqual(this.f67511a, ((C33058f) obj).f67511a);
    }

    public C33058f(ArrayList arrayList) {
        this.f67511a = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m71437a() {
        return new C41813f(C41897w2.f92051a);
    }

    public final int hashCode() {
        return this.f67511a.hashCode();
    }

    public final String toString() {
        return "FeatureFlagsRequest(requestedFlags=" + this.f67511a + ")";
    }
}
