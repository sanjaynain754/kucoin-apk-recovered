package com.sumsub.sns.internal.features.data.model.common.remote.response;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41799c0;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.a0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29520a0 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29520a0 f59540a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29520a0 c29520a0 = new C29520a0();
        f59540a = c29520a0;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.response.PoiAsPoaSettingsRemote", c29520a0, 4);
        c41826h2.m91581o("acceptPoiAsPoa", true);
        c41826h2.m91581o("acceptSamePoiAsPoa", true);
        c41826h2.m91581o("validMonths", true);
        c41826h2.m91581o("allowedTypes", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C29530c0.f59543e;
        C41828i c41828i = C41828i.f91957a;
        return new InterfaceC44951d[]{C45236a.m99969u(c41828i), C45236a.m99969u(c41828i), C45236a.m99969u(C41799c0.f91901a), C45236a.m99969u((InterfaceC44951d) lazyArr[3].getValue())};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        Boolean bool;
        Boolean bool2;
        Double d11;
        List list;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29530c0.f59543e;
        Boolean bool3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C41828i c41828i = C41828i.f91957a;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, c41828i, null);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41828i, null);
            Double d12 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41799c0.f91901a, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44949c) lazyArr[3].getValue(), null);
            bool2 = bool5;
            d11 = d12;
            i11 = 15;
            bool = bool4;
        } else {
            boolean z11 = true;
            int i12 = 0;
            Boolean bool6 = null;
            Double d13 = null;
            List list2 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41828i.f91957a, bool3);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41828i.f91957a, bool6);
                    i12 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    d13 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41799c0.f91901a, d13);
                    i12 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44949c) lazyArr[3].getValue(), list2);
                    i12 |= 8;
                }
            }
            i11 = i12;
            bool = bool3;
            bool2 = bool6;
            d11 = d13;
            list = list2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29530c0(i11, bool, bool2, d11, list);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29530c0 c29530c0 = (C29530c0) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29530c0.f59543e;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29530c0.f59544a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41828i.f91957a, c29530c0.f59544a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29530c0.f59545b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41828i.f91957a, c29530c0.f59545b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29530c0.f59546c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41799c0.f91901a, c29530c0.f59546c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29530c0.f59547d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44963p) lazyArr[3].getValue(), c29530c0.f59547d);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
