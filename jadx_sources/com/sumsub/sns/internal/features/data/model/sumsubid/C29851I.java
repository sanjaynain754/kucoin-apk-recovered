package com.sumsub.sns.internal.features.data.model.sumsubid;

import java.util.ArrayList;
import java.util.List;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.sumsubid.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29851I {

    @NotNull
    public static final C29850H Companion = new C29850H();

    /* JADX INFO: renamed from: d */
    public static final Lazy[] f59938d;

    /* JADX INFO: renamed from: a */
    public final List f59939a;

    /* JADX INFO: renamed from: b */
    public final List f59940b;

    /* JADX INFO: renamed from: c */
    public final Integer f59941c;

    public /* synthetic */ C29851I(int i11, List list, List list2, Integer num) {
        if ((i11 & 1) == 0) {
            this.f59939a = null;
        } else {
            this.f59939a = list;
        }
        if ((i11 & 2) == 0) {
            this.f59940b = null;
        } else {
            this.f59940b = list2;
        }
        if ((i11 & 4) == 0) {
            this.f59941c = null;
        } else {
            this.f59941c = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29851I)) {
            return false;
        }
        C29851I c29851i = (C29851I) obj;
        return Intrinsics.areEqual(this.f59939a, c29851i.f59939a) && Intrinsics.areEqual(this.f59940b, c29851i.f59940b) && Intrinsics.areEqual(this.f59941c, c29851i.f59941c);
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f59938d = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.sumsubid.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29851I.m69931a();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.sumsubid.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29851I.m69932b();
            }
        }), null};
    }

    public C29851I(ArrayList arrayList, ArrayList arrayList2, Integer num) {
        this.f59939a = arrayList;
        this.f59940b = arrayList2;
        this.f59941c = num;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69931a() {
        return new C41813f(C41897w2.f92051a);
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69932b() {
        return new C41813f(C41897w2.f92051a);
    }

    public final int hashCode() {
        List list = this.f59939a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f59940b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.f59941c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "SNSSumsubIdSubmitRequestBody(docIds=" + this.f59939a + ", infoFields=" + this.f59940b + ", addressIndex=" + this.f59941c + ")";
    }
}
