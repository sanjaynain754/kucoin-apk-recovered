package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.b2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29327b2 extends C29226H3 {

    @NotNull
    public static final C29303X1 Companion = new C29303X1();

    /* JADX INFO: renamed from: d */
    public static final Lazy[] f59338d = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.v5
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SNSMessage$ServerMessage$Type.Companion.serializer();
        }
    }), null};

    /* JADX INFO: renamed from: c */
    public final C29319a2 f59339c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29327b2(int i11, SNSMessage$ServerMessage$Type sNSMessage$ServerMessage$Type, C29319a2 c29319a2) {
        super(i11, sNSMessage$ServerMessage$Type);
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C29298W1.f59308a.getDescriptor());
        }
        if ((i11 & 2) == 0) {
            this.f59339c = null;
        } else {
            this.f59339c = c29319a2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29327b2) && Intrinsics.areEqual(this.f59339c, ((C29327b2) obj).f59339c);
    }

    public C29327b2(C29319a2 c29319a2) {
        super(SNSMessage$ServerMessage$Type.ADDED_ID_DOC);
        this.f59339c = c29319a2;
    }

    public final int hashCode() {
        C29319a2 c29319a2 = this.f59339c;
        if (c29319a2 == null) {
            return 0;
        }
        return c29319a2.hashCode();
    }

    public final String toString() {
        return "AddedIdDoc(payload=" + this.f59339c + ")";
    }
}
