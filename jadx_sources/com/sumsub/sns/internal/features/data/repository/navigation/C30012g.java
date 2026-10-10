package com.sumsub.sns.internal.features.data.repository.navigation;

import com.sumsub.sns.internal.features.data.model.common.remote.C29242L;
import com.sumsub.sns.internal.features.data.model.common.remote.C29252N;
import java.util.Map;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.navigation.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C30012g implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C30012g f60293a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C30012g c30012g = new C30012g();
        f60293a = c30012g;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.repository.navigation.SdkParamsDto", c30012g, 4);
        c41826h2.m91581o("documentsByCountries", true);
        c41826h2.m91581o("tinCountryInfo", true);
        c41826h2.m91581o("eKycConfig", true);
        c41826h2.m91581o("passiveLiveness", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C30014i.f60294e;
        return new InterfaceC44951d[]{C45236a.m99969u((InterfaceC44951d) lazyArr[0].getValue()), C45236a.m99969u((InterfaceC44951d) lazyArr[1].getValue()), C45236a.m99969u(C29242L.f59234a), C45236a.m99969u(C41828i.f91957a)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        Map map;
        Map map2;
        C29252N c29252n;
        Boolean bool;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C30014i.f60294e;
        Map map3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Map map4 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, (InterfaceC44949c) lazyArr[0].getValue(), null);
            Map map5 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, (InterfaceC44949c) lazyArr[1].getValue(), null);
            C29252N c29252n2 = (C29252N) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C29242L.f59234a, null);
            map2 = map5;
            map = map4;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41828i.f91957a, null);
            c29252n = c29252n2;
            i11 = 15;
        } else {
            boolean z11 = true;
            int i12 = 0;
            Map map6 = null;
            C29252N c29252n3 = null;
            Boolean bool2 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    map3 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, (InterfaceC44949c) lazyArr[0].getValue(), map3);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    map6 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, (InterfaceC44949c) lazyArr[1].getValue(), map6);
                    i12 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    c29252n3 = (C29252N) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C29242L.f59234a, c29252n3);
                    i12 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41828i.f91957a, bool2);
                    i12 |= 8;
                }
            }
            i11 = i12;
            map = map3;
            map2 = map6;
            c29252n = c29252n3;
            bool = bool2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C30014i(i11, map, map2, c29252n, bool);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C30014i c30014i = (C30014i) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C30014i.f60294e;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c30014i.f60295a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, (InterfaceC44963p) lazyArr[0].getValue(), c30014i.f60295a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c30014i.f60296b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, (InterfaceC44963p) lazyArr[1].getValue(), c30014i.f60296b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c30014i.f60297c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C29242L.f59234a, c30014i.f60297c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c30014i.f60298d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C41828i.f91957a, c30014i.f60298d);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
