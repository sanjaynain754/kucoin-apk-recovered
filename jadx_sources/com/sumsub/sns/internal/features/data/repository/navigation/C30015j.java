package com.sumsub.sns.internal.features.data.repository.navigation;

import com.sumsub.sns.internal.features.data.model.common.remote.response.C29574l0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29586o0;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.navigation.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C30015j implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C30015j f60299a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C30015j c30015j = new C30015j();
        f60299a = c30015j;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.repository.navigation.SdkStepDto", c30015j, 4);
        c41826h2.m91581o("stepType", false);
        c41826h2.m91581o("idDocSetType", true);
        c41826h2.m91581o("restriction", true);
        c41826h2.m91581o("idDocSet", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new InterfaceC44951d[]{c41897w2, C45236a.m99969u(c41897w2), C45236a.m99969u(C29574l0.f59600a), C45236a.m99969u(C30017l.f60300a)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        String str;
        String str2;
        C29586o0 c29586o0;
        C30019n c30019n;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 0);
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, null);
            C29586o0 c29586o1 = (C29586o0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C29574l0.f59600a, null);
            str = strDecodeStringElement2;
            c30019n = (C30019n) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C30017l.f60300a, null);
            c29586o0 = c29586o1;
            str2 = str3;
            i11 = 15;
        } else {
            boolean z11 = true;
            int i12 = 0;
            String str4 = null;
            C29586o0 c29586o2 = null;
            C30019n c30019n2 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 0);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, str4);
                    i12 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    c29586o2 = (C29586o0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C29574l0.f59600a, c29586o2);
                    i12 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    c30019n2 = (C30019n) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C30017l.f60300a, c30019n2);
                    i12 |= 8;
                }
            }
            i11 = i12;
            str = strDecodeStringElement;
            str2 = str4;
            c29586o0 = c29586o2;
            c30019n = c30019n2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C30020o(i11, str, str2, c29586o0, c30019n);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C30020o c30020o = (C30020o) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        interfaceC45829bBeginStructure.encodeStringElement(interfaceC45533f, 0, c30020o.f60304a);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c30020o.f60305b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, c30020o.f60305b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c30020o.f60306c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C29574l0.f59600a, c30020o.f60306c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c30020o.f60307d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C30017l.f60300a, c30020o.f60307d);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
