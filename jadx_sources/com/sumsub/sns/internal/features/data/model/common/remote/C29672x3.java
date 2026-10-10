package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.x3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29672x3 extends C29226H3 {

    @NotNull
    public static final C29665w3 Companion = new C29665w3();

    /* JADX INFO: renamed from: d */
    public static final Lazy[] f59726d = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.k6
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SNSMessage$ServerMessage$Type.Companion.serializer();
        }
    }), null};

    /* JADX INFO: renamed from: c */
    public final String f59727c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29672x3(int i11, SNSMessage$ServerMessage$Type sNSMessage$ServerMessage$Type, String str) {
        super(i11, sNSMessage$ServerMessage$Type);
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C29658v3.f59716a.getDescriptor());
        }
        if ((i11 & 2) == 0) {
            this.f59727c = null;
        } else {
            this.f59727c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29672x3) && Intrinsics.areEqual(this.f59727c, ((C29672x3) obj).f59727c);
    }

    public C29672x3(String str) {
        super(SNSMessage$ServerMessage$Type.UNKNOWN);
        this.f59727c = str;
    }

    public final int hashCode() {
        String str = this.f59727c;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "Unknown(messageType=" + this.f59727c + ")";
    }
}
