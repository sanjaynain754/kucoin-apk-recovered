package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41820g1;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44951d;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.w2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29664w2 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29664w2 f59724a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29664w2 c29664w2 = new C29664w2();
        f59724a = c29664w2;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.SNSMessage.ServerMessage.ApplicantQueueStatus.Payload", c29664w2, 2);
        c41826h2.m91581o("waitTimeSec", true);
        c41826h2.m91581o("queuePlace", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        C41820g1 c41820g1 = C41820g1.f91932a;
        return new InterfaceC44951d[]{C45236a.m99969u(c41820g1), C45236a.m99969u(c41820g1)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        Long l11;
        Long l12;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Long l13 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C41820g1 c41820g1 = C41820g1.f91932a;
            l11 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, c41820g1, null);
            l12 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41820g1, null);
            i11 = 3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            Long l14 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    l13 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41820g1.f91932a, l13);
                    i12 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    l14 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41820g1.f91932a, l14);
                    i12 |= 2;
                }
            }
            i11 = i12;
            l11 = l13;
            l12 = l14;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29678y2(i11, l11, l12);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29678y2 c29678y2 = (C29678y2) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29678y2.f59730a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41820g1.f91932a, c29678y2.f59730a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29678y2.f59731b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41820g1.f91932a, c29678y2.f59731b);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
