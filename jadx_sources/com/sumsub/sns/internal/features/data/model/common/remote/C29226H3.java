package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.H3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public class C29226H3 extends AbstractC29231I3 {

    @NotNull
    public static final C29250M2 Companion = new C29250M2();

    /* JADX INFO: renamed from: b */
    public static final Lazy[] f59216b = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.q4
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SNSMessage$ServerMessage$Type.Companion.serializer();
        }
    })};

    /* JADX INFO: renamed from: a */
    public final SNSMessage$ServerMessage$Type f59217a;

    public /* synthetic */ C29226H3(int i11, SNSMessage$ServerMessage$Type sNSMessage$ServerMessage$Type) {
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C29293V1.f59307a.getDescriptor());
        }
        this.f59217a = sNSMessage$ServerMessage$Type;
    }

    public C29226H3(SNSMessage$ServerMessage$Type sNSMessage$ServerMessage$Type) {
        this.f59217a = sNSMessage$ServerMessage$Type;
    }
}
