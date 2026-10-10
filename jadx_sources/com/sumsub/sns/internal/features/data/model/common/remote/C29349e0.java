package com.sumsub.sns.internal.features.data.model.common.remote;

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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.e0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29349e0 {

    @NotNull
    public static final C29341d0 Companion = new C29341d0();

    /* JADX INFO: renamed from: h */
    public static final Lazy[] f59362h;

    /* JADX INFO: renamed from: a */
    public final String f59363a;

    /* JADX INFO: renamed from: b */
    public final String f59364b;

    /* JADX INFO: renamed from: c */
    public final String f59365c;

    /* JADX INFO: renamed from: d */
    public final List f59366d;

    /* JADX INFO: renamed from: e */
    public final String f59367e;

    /* JADX INFO: renamed from: f */
    public final String f59368f;

    /* JADX INFO: renamed from: g */
    public final List f59369g;

    public /* synthetic */ C29349e0(int i11, String str, String str2, String str3, List list, String str4, String str5, List list2) {
        if (127 != (i11 & 127)) {
            C41801c2.m91514a(i11, 127, C29333c0.f59350a.getDescriptor());
        }
        this.f59363a = str;
        this.f59364b = str2;
        this.f59365c = str3;
        this.f59366d = list;
        this.f59367e = str4;
        this.f59368f = str5;
        this.f59369g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29349e0)) {
            return false;
        }
        C29349e0 c29349e0 = (C29349e0) obj;
        return Intrinsics.areEqual(this.f59363a, c29349e0.f59363a) && Intrinsics.areEqual(this.f59364b, c29349e0.f59364b) && Intrinsics.areEqual(this.f59365c, c29349e0.f59365c) && Intrinsics.areEqual(this.f59366d, c29349e0.f59366d) && Intrinsics.areEqual(this.f59367e, c29349e0.f59367e) && Intrinsics.areEqual(this.f59368f, c29349e0.f59368f) && Intrinsics.areEqual(this.f59369g, c29349e0.f59369g);
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f59362h = new Lazy[]{null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.y5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29349e0.m69850a();
            }
        }), null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.z5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29349e0.m69851b();
            }
        })};
    }

    public C29349e0(String str, String str2, String str3, List list, String str4, String str5, ArrayList arrayList) {
        this.f59363a = str;
        this.f59364b = str2;
        this.f59365c = str3;
        this.f59366d = list;
        this.f59367e = str4;
        this.f59368f = str5;
        this.f59369g = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69850a() {
        return new C41813f(C41897w2.f92051a);
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69851b() {
        return new C41813f(C29357f0.f59374a);
    }

    public final int hashCode() {
        String str = this.f59363a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59364b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59365c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f59366d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.f59367e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f59368f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list2 = this.f59369g;
        return iHashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "MRTDData(imageId=" + this.f59363a + ", country=" + this.f59364b + ", idDocType=" + this.f59365c + ", data=" + this.f59366d + ", kinegramSessionId=" + this.f59367e + ", kinegramData=" + this.f59368f + ", processingErrors=" + this.f59369g + ")";
    }
}
