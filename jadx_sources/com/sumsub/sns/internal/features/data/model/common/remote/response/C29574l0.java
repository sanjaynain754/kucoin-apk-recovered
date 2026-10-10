package com.sumsub.sns.internal.features.data.model.common.remote.response;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41828i;
import kotlinx.serialization.internal.C41897w2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44951d;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.l0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29574l0 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29574l0 f59600a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29574l0 c29574l0 = new C29574l0();
        f59600a = c29574l0;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.response.Restriction", c29574l0, 2);
        c41826h2.m91581o("code", true);
        c41826h2.m91581o("reloadEnabled", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        return new InterfaceC44951d[]{C45236a.m99969u(C41897w2.f92051a), C45236a.m99969u(C41828i.f91957a)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        String str;
        Boolean bool;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        String str2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, null);
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41828i.f91957a, null);
            i11 = 3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            Boolean bool2 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, str2);
                    i12 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41828i.f91957a, bool2);
                    i12 |= 2;
                }
            }
            i11 = i12;
            str = str2;
            bool = bool2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29586o0(i11, bool, str);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29586o0 c29586o0 = (C29586o0) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29586o0.f59609a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, c29586o0.f59609a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29586o0.f59610b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41828i.f91957a, c29586o0.f59610b);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
