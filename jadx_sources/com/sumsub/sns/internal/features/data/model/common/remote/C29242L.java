package com.sumsub.sns.internal.features.data.model.common.remote;

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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.L */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29242L implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29242L f59234a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29242L c29242l = new C29242L();
        f59234a = c29242l;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.EKycConfig", c29242l, 2);
        c41826h2.m91581o("supportedSources", true);
        c41826h2.m91581o("skipFixedCountrySelect", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        return new InterfaceC44951d[]{C45236a.m99969u((InterfaceC44951d) C29252N.f59242c[0].getValue()), C45236a.m99969u(C41828i.f91957a)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        Map map;
        Boolean bool;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29252N.f59242c;
        Map map2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            map = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, (InterfaceC44949c) lazyArr[0].getValue(), null);
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
                    map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, (InterfaceC44949c) lazyArr[0].getValue(), map2);
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
            map = map2;
            bool = bool2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29252N(i11, map, bool);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29252N c29252n = (C29252N) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29252N.f59242c;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29252n.f59243a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, (InterfaceC44963p) lazyArr[0].getValue(), c29252n.f59243a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29252n.f59244b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41828i.f91957a, c29252n.f59244b);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
