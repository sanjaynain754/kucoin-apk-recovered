package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.K1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29239K1 extends C29288U1 {

    @NotNull
    public static final C29214F1 Companion = new C29214F1();

    /* JADX INFO: renamed from: d */
    public static final Lazy[] f59232d = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.s4
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SNSMessage$ClientMessage$Type.Companion.serializer();
        }
    }), null};

    /* JADX INFO: renamed from: c */
    public final C29229I1 f59233c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29239K1(int i11, SNSMessage$ClientMessage$Type sNSMessage$ClientMessage$Type, C29229I1 c29229i1) {
        super(i11, sNSMessage$ClientMessage$Type);
        if (3 != (i11 & 3)) {
            C41801c2.m91514a(i11, 3, C29209E1.f59197a.getDescriptor());
        }
        this.f59233c = c29229i1;
    }

    public C29239K1(C29229I1 c29229i1) {
        super(SNSMessage$ClientMessage$Type.USER_VISIBILITY_STATE);
        this.f59233c = c29229i1;
    }
}
