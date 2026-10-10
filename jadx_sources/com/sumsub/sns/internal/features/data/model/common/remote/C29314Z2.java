package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.Z2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29314Z2 extends C29226H3 {

    @NotNull
    public static final C29294V2 Companion = new C29294V2();

    /* JADX INFO: renamed from: d */
    public static final Lazy[] f59327d = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.u5
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SNSMessage$ServerMessage$Type.Companion.serializer();
        }
    }), null};

    /* JADX INFO: renamed from: c */
    public final C29309Y2 f59328c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29314Z2(int i11, SNSMessage$ServerMessage$Type sNSMessage$ServerMessage$Type, C29309Y2 c29309y2) {
        super(i11, sNSMessage$ServerMessage$Type);
        if (3 != (i11 & 3)) {
            C41801c2.m91514a(i11, 3, C29289U2.f59303a.getDescriptor());
        }
        this.f59328c = c29309y2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29314Z2) && Intrinsics.areEqual(this.f59328c, ((C29314Z2) obj).f59328c);
    }

    public C29314Z2(C29309Y2 c29309y2) {
        super(SNSMessage$ServerMessage$Type.MODERATOR_NAME);
        this.f59328c = c29309y2;
    }

    public final int hashCode() {
        return this.f59328c.hashCode();
    }

    public final String toString() {
        return "ModeratorName(payload=" + this.f59328c + ")";
    }
}
