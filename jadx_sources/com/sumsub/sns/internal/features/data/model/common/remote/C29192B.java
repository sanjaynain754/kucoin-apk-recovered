package com.sumsub.sns.internal.features.data.model.common.remote;

import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.internal.C41790a1;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import tg0.C44947b;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29192B {

    @NotNull
    public static final C29187A Companion = new C29187A();

    /* JADX INFO: renamed from: b */
    public static final Lazy[] f59186b = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.k4
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29192B.m69803a();
        }
    })};

    /* JADX INFO: renamed from: a */
    public final Map f59187a;

    public /* synthetic */ C29192B(int i11, Map map) {
        if ((i11 & 1) == 0) {
            this.f59187a = null;
        } else {
            this.f59187a = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29192B) && Intrinsics.areEqual(this.f59187a, ((C29192B) obj).f59187a);
    }

    public C29192B(HashMap map) {
        this.f59187a = map;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69803a() {
        return new C41790a1(C41897w2.f92051a, new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]));
    }

    public final int hashCode() {
        Map map = this.f59187a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        return "ApplicantDataSubmitModel(idDoc=" + this.f59187a + ")";
    }
}
