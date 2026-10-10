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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.x1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29670x1 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29670x1 f59725a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29670x1 c29670x1 = new C29670x1();
        f59725a = c29670x1;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.SNSMessage.ClientMessage.ScreenshotMade", c29670x1, 2);
        c41826h2.m91581o("type", false);
        c41826h2.m91581o("payload", false);
        descriptor = c41826h2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        return new InterfaceC44951d[]{C29199C1.f59191d[0].getValue(), C29684z1.f59735a};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        SNSMessage$ClientMessage$Type sNSMessage$ClientMessage$Type;
        C29194B1 c29194b1;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29199C1.f59191d;
        SNSMessage$ClientMessage$Type sNSMessage$ClientMessage$Type2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            sNSMessage$ClientMessage$Type = (SNSMessage$ClientMessage$Type) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 0, (InterfaceC44949c) lazyArr[0].getValue(), null);
            c29194b1 = (C29194B1) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 1, C29684z1.f59735a, null);
            i11 = 3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            C29194B1 c29194b2 = null;
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
                    c29194b2 = (C29194B1) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 1, C29684z1.f59735a, c29194b2);
                    i12 |= 2;
                }
            }
            i11 = i12;
            sNSMessage$ClientMessage$Type = sNSMessage$ClientMessage$Type2;
            c29194b1 = c29194b2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29199C1(i11, sNSMessage$ClientMessage$Type, c29194b1);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29199C1 c29199c1 = (C29199C1) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        C29677y1 c29677y1 = C29199C1.Companion;
        interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 0, (InterfaceC44963p) C29288U1.f59301b[0].getValue(), c29199c1.f59302a);
        interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 1, C29684z1.f59735a, c29199c1.f59192c);
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
