package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41897w2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44951d;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.z1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29684z1 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29684z1 f59735a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29684z1 c29684z1 = new C29684z1();
        f59735a = c29684z1;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.SNSMessage.ClientMessage.ScreenshotMade.Payload", c29684z1, 1);
        c41826h2.m91581o("imageId", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        return new InterfaceC44951d[]{C45236a.m99969u(C41897w2.f92051a)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        String str;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        int i11 = 1;
        String str2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, null);
        } else {
            boolean z11 = true;
            int i12 = 0;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, str2);
                    i12 = 1;
                }
            }
            str = str2;
            i11 = i12;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29194B1(i11, str);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29194B1 c29194b1 = (C29194B1) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29194b1.f59188a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, c29194b1.f59188a);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
