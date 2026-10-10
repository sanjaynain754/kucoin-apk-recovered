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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.f3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29360f3 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29360f3 f59376a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29360f3 c29360f3 = new C29360f3();
        f59376a = c29360f3;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.SNSMessage.ServerMessage.RedirectCompleted.Payload", c29360f3, 2);
        c41826h2.m91581o("confirmationId", true);
        c41826h2.m91581o("type", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new InterfaceC44951d[]{C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        String str;
        String str2;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        String str3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C41897w2 c41897w2 = C41897w2.f92051a;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, c41897w2, null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41897w2, null);
            i11 = 3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            String str4 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, str3);
                    i12 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, str4);
                    i12 |= 2;
                }
            }
            i11 = i12;
            str = str3;
            str2 = str4;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29376h3(i11, str, str2);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29376h3 c29376h3 = (C29376h3) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29376h3.f59387a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, c29376h3.f59387a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29376h3.f59388b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, c29376h3.f59388b);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
