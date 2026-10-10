package com.sumsub.sns.internal.features.data.model.common.remote.response;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41828i;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.T */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29505T implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29505T f59525a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29505T c29505t = new C29505T();
        f59525a = c29505t;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.response.PoaStepSettingsRemote", c29505t, 3);
        c41826h2.m91581o("poiAsPoaSettings", true);
        c41826h2.m91581o("allowedTypesSettings", true);
        c41826h2.m91581o("acceptMultiplePages", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        return new InterfaceC44951d[]{C45236a.m99969u(C29520a0.f59540a), C45236a.m99969u((InterfaceC44951d) C29509V.f59527d[1].getValue()), C45236a.m99969u(C41828i.f91957a)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        C29530c0 c29530c0;
        List list;
        Boolean bool;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29509V.f59527d;
        C29530c0 c29530c1 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            c29530c0 = (C29530c0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C29520a0.f59540a, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, (InterfaceC44949c) lazyArr[1].getValue(), null);
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41828i.f91957a, null);
            i11 = 7;
        } else {
            boolean z11 = true;
            int i12 = 0;
            List list2 = null;
            Boolean bool2 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    c29530c1 = (C29530c0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C29520a0.f59540a, c29530c1);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, (InterfaceC44949c) lazyArr[1].getValue(), list2);
                    i12 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41828i.f91957a, bool2);
                    i12 |= 4;
                }
            }
            i11 = i12;
            c29530c0 = c29530c1;
            list = list2;
            bool = bool2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29509V(i11, c29530c0, list, bool);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29509V c29509v = (C29509V) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29509V.f59527d;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29509v.f59528a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C29520a0.f59540a, c29509v.f59528a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29509v.f59529b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, (InterfaceC44963p) lazyArr[1].getValue(), c29509v.f59529b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29509v.f59530c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41828i.f91957a, c29509v.f59530c);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
