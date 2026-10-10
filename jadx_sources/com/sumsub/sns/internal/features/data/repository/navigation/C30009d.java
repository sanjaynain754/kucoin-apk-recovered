package com.sumsub.sns.internal.features.data.repository.navigation;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41828i;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44951d;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.navigation.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C30009d implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C30009d f60289a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C30009d c30009d = new C30009d();
        f60289a = c30009d;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.repository.navigation.SdkNavigationDto", c30009d, 3);
        c41826h2.m91581o("canGoBack", true);
        c41826h2.m91581o("canGoForward", true);
        c41826h2.m91581o("canSkip", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        C41828i c41828i = C41828i.f91957a;
        return new InterfaceC44951d[]{C45236a.m99969u(c41828i), C45236a.m99969u(c41828i), C45236a.m99969u(c41828i)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Boolean bool4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C41828i c41828i = C41828i.f91957a;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, c41828i, null);
            bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41828i, null);
            bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41828i, null);
            i11 = 7;
        } else {
            boolean z11 = true;
            int i12 = 0;
            Boolean bool5 = null;
            Boolean bool6 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41828i.f91957a, bool4);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41828i.f91957a, bool5);
                    i12 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41828i.f91957a, bool6);
                    i12 |= 4;
                }
            }
            i11 = i12;
            bool = bool4;
            bool2 = bool5;
            bool3 = bool6;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C30011f(i11, bool, bool2, bool3);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C30011f c30011f = (C30011f) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c30011f.f60290a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41828i.f91957a, c30011f.f60290a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c30011f.f60291b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41828i.f91957a, c30011f.f60291b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c30011f.f60292c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41828i.f91957a, c30011f.f60292c);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
