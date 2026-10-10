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
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.E1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29209E1 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29209E1 f59197a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29209E1 c29209e1 = new C29209E1();
        f59197a = c29209e1;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.SNSMessage.ClientMessage.UserVisibilityState", c29209e1, 2);
        c41826h2.m91581o("type", false);
        c41826h2.m91581o("payload", false);
        descriptor = c41826h2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        return new InterfaceC44951d[]{C29239K1.f59232d[0].getValue(), C29219G1.f59212a};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        SNSMessage$ClientMessage$Type sNSMessage$ClientMessage$Type;
        C29229I1 c29229i1;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29239K1.f59232d;
        SNSMessage$ClientMessage$Type sNSMessage$ClientMessage$Type2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            sNSMessage$ClientMessage$Type = (SNSMessage$ClientMessage$Type) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 0, (InterfaceC44949c) lazyArr[0].getValue(), null);
            c29229i1 = (C29229I1) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 1, C29219G1.f59212a, null);
            i11 = 3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            C29229I1 c29229i2 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    sNSMessage$ClientMessage$Type2 = (SNSMessage$ClientMessage$Type) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 0, (InterfaceC44949c) lazyArr[0].getValue(), sNSMessage$ClientMessage$Type2);
                    i12 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    c29229i2 = (C29229I1) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 1, C29219G1.f59212a, c29229i2);
                    i12 |= 2;
                }
            }
            i11 = i12;
            sNSMessage$ClientMessage$Type = sNSMessage$ClientMessage$Type2;
            c29229i1 = c29229i2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29239K1(i11, sNSMessage$ClientMessage$Type, c29229i1);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29239K1 c29239k1 = (C29239K1) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        C29214F1 c29214f1 = C29239K1.Companion;
        interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 0, (InterfaceC44963p) C29288U1.f59301b[0].getValue(), c29239k1.f59302a);
        interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 1, C29219G1.f59212a, c29239k1.f59233c);
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
