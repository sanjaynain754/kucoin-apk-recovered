package com.sumsub.sns.internal.features.data.model.prooface;

import com.tencent.bugly.proguard.C33864ph;
import java.util.List;
import kotlinx.serialization.internal.C41813f;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.prooface.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29818c {

    @NotNull
    public static final C29816b Companion = new C29816b();

    /* JADX INFO: renamed from: d */
    public static final Lazy[] f59894d = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.prooface.a0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29818c.m69928a();
        }
    }), null};

    /* JADX INFO: renamed from: e */
    public static final C29818c f59895e = new C29818c("skipped", null, 6);

    /* JADX INFO: renamed from: f */
    public static final C29818c f59896f = new C29818c(C33864ph.f71456b, null, 2);

    /* JADX INFO: renamed from: a */
    public String f59897a;

    /* JADX INFO: renamed from: b */
    public final List f59898b;

    /* JADX INFO: renamed from: c */
    public final String f59899c;

    public /* synthetic */ C29818c(int i11, String str, String str2, List list) {
        if ((i11 & 1) == 0) {
            this.f59897a = null;
        } else {
            this.f59897a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59898b = null;
        } else {
            this.f59898b = list;
        }
        if ((i11 & 4) == 0) {
            this.f59899c = null;
        } else {
            this.f59899c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29818c)) {
            return false;
        }
        C29818c c29818c = (C29818c) obj;
        return Intrinsics.areEqual(this.f59897a, c29818c.f59897a) && Intrinsics.areEqual(this.f59898b, c29818c.f59898b) && Intrinsics.areEqual(this.f59899c, c29818c.f59899c);
    }

    public C29818c(String str, List list, int i11) {
        list = (i11 & 2) != 0 ? null : list;
        String str2 = (i11 & 4) == 0 ? "Zero calibration range" : null;
        this.f59897a = str;
        this.f59898b = list;
        this.f59899c = str2;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69928a() {
        return new C41813f(C29820d.f59900a);
    }

    public final int hashCode() {
        String str = this.f59897a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f59898b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f59899c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Calibration(status=" + this.f59897a + ", values=" + this.f59898b + ", error=" + this.f59899c + ")";
    }
}
