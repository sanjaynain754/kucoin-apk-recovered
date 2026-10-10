package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import tg0.InterfaceC44949c;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44963p;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.u2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29650u2 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29650u2 f59704a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29650u2 c29650u2 = new C29650u2();
        f59704a = c29650u2;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.SNSMessage.ServerMessage.ApplicantQueueStatus", c29650u2, 2);
        c41826h2.m91581o("type", false);
        c41826h2.m91581o("payload", true);
        descriptor = c41826h2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        return new InterfaceC44951d[]{C29685z2.f59736d[0].getValue(), C45236a.m99969u(C29664w2.f59724a)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        SNSMessage$ServerMessage$Type sNSMessage$ServerMessage$Type;
        C29678y2 c29678y2;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29685z2.f59736d;
        SNSMessage$ServerMessage$Type sNSMessage$ServerMessage$Type2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            sNSMessage$ServerMessage$Type = (SNSMessage$ServerMessage$Type) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 0, (InterfaceC44949c) lazyArr[0].getValue(), null);
            c29678y2 = (C29678y2) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C29664w2.f59724a, null);
            i11 = 3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            C29678y2 c29678y3 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    sNSMessage$ServerMessage$Type2 = (SNSMessage$ServerMessage$Type) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 0, (InterfaceC44949c) lazyArr[0].getValue(), sNSMessage$ServerMessage$Type2);
                    i12 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    c29678y3 = (C29678y2) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C29664w2.f59724a, c29678y3);
                    i12 |= 2;
                }
            }
            i11 = i12;
            sNSMessage$ServerMessage$Type = sNSMessage$ServerMessage$Type2;
            c29678y2 = c29678y3;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29685z2(i11, sNSMessage$ServerMessage$Type, c29678y2);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29685z2 c29685z2 = (C29685z2) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        C29657v2 c29657v2 = C29685z2.Companion;
        interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 0, (InterfaceC44963p) C29226H3.f59216b[0].getValue(), c29685z2.f59217a);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29685z2.f59737c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C29664w2.f59724a, c29685z2.f59737c);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
