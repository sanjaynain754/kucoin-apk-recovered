package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.i3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29384i3 extends C29226H3 {

    @NotNull
    public static final C29352e3 Companion = new C29352e3();

    /* JADX INFO: renamed from: d */
    public static final Lazy[] f59394d = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.b6
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SNSMessage$ServerMessage$Type.Companion.serializer();
        }
    }), null};

    /* JADX INFO: renamed from: c */
    public final C29376h3 f59395c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29384i3(int i11, SNSMessage$ServerMessage$Type sNSMessage$ServerMessage$Type, C29376h3 c29376h3) {
        super(i11, sNSMessage$ServerMessage$Type);
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C29344d3.f59360a.getDescriptor());
        }
        if ((i11 & 2) == 0) {
            this.f59395c = null;
        } else {
            this.f59395c = c29376h3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29384i3) && Intrinsics.areEqual(this.f59395c, ((C29384i3) obj).f59395c);
    }

    public C29384i3(C29376h3 c29376h3) {
        super(SNSMessage$ServerMessage$Type.REDIRECT_COMPLETED);
        this.f59395c = c29376h3;
    }

    public final int hashCode() {
        C29376h3 c29376h3 = this.f59395c;
        if (c29376h3 == null) {
            return 0;
        }
        return c29376h3.hashCode();
    }

    public final String toString() {
        return "RedirectCompleted(payload=" + this.f59395c + ")";
    }
}
