package com.sumsub.sns.internal.features.data.model.common.remote.response;

import com.sumsub.sns.internal.features.data.model.common.C29058U;
import java.util.Map;
import kotlinx.serialization.internal.C41790a1;
import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;
import ug0.C45236a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.H1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29478H1 {

    @NotNull
    public static final C29611u1 Companion = new C29611u1();

    /* JADX INFO: renamed from: e */
    public static final Lazy[] f59482e = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.j2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29478H1.m69868a();
        }
    }), null, null};

    /* JADX INFO: renamed from: a */
    public final C29623x1 f59483a;

    /* JADX INFO: renamed from: b */
    public final Map f59484b;

    /* JADX INFO: renamed from: c */
    public final C29475G1 f59485c;

    /* JADX INFO: renamed from: d */
    public final C29466D1 f59486d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29478H1)) {
            return false;
        }
        C29478H1 c29478h1 = (C29478H1) obj;
        return Intrinsics.areEqual(this.f59483a, c29478h1.f59483a) && Intrinsics.areEqual(this.f59484b, c29478h1.f59484b) && Intrinsics.areEqual(this.f59485c, c29478h1.f59485c) && Intrinsics.areEqual(this.f59486d, c29478h1.f59486d);
    }

    public /* synthetic */ C29478H1(int i11, C29623x1 c29623x1, Map map, C29475G1 c29475g1, C29466D1 c29466d1) {
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C29607t1.f59665a.getDescriptor());
        }
        this.f59483a = c29623x1;
        if ((i11 & 2) == 0) {
            this.f59484b = MapsKt.emptyMap();
        } else {
            this.f59484b = map;
        }
        if ((i11 & 4) == 0) {
            this.f59485c = null;
        } else {
            this.f59485c = c29475g1;
        }
        if ((i11 & 8) == 0) {
            this.f59486d = null;
        } else {
            this.f59486d = c29466d1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69868a() {
        return new C41790a1(C29058U.f59005a, C45236a.m99969u(C29627y1.f59685a));
    }

    public final int hashCode() {
        int iHashCode = (this.f59484b.hashCode() + (this.f59483a.hashCode() * 31)) * 31;
        C29475G1 c29475g1 = this.f59485c;
        int iHashCode2 = (iHashCode + (c29475g1 == null ? 0 : c29475g1.hashCode())) * 31;
        C29466D1 c29466d1 = this.f59486d;
        return iHashCode2 + (c29466d1 != null ? c29466d1.hashCode() : 0);
    }

    public final String toString() {
        return "RequiredIdDocsStatus(inspectionReview=" + this.f59483a + ", requiredIdDocsStatus=" + this.f59484b + ", workflowStatus=" + this.f59485c + ", videoIdentData=" + this.f59486d + ")";
    }
}
