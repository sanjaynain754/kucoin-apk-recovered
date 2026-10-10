package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.U1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public class C29288U1 extends AbstractC29231I3 {

    @NotNull
    public static final C29642t1 Companion = new C29642t1();

    /* JADX INFO: renamed from: b */
    public static final Lazy[] f59301b = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.q5
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SNSMessage$ClientMessage$Type.Companion.serializer();
        }
    })};

    /* JADX INFO: renamed from: a */
    public final SNSMessage$ClientMessage$Type f59302a;

    public /* synthetic */ C29288U1(int i11, SNSMessage$ClientMessage$Type sNSMessage$ClientMessage$Type) {
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C29436p1.f59435a.getDescriptor());
        }
        this.f59302a = sNSMessage$ClientMessage$Type;
    }

    public C29288U1(SNSMessage$ClientMessage$Type sNSMessage$ClientMessage$Type) {
        this.f59302a = sNSMessage$ClientMessage$Type;
    }
}
