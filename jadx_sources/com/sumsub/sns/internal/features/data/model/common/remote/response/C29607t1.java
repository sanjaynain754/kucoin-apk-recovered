package com.sumsub.sns.internal.features.data.model.common.remote.response;

import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44949c;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44963p;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.t1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29607t1 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29607t1 f59665a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29607t1 c29607t1 = new C29607t1();
        f59665a = c29607t1;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.response.WithIdDocsStatusResponse.RequiredIdDocsStatus", c29607t1, 4);
        c41826h2.m91581o("inspectionReview", false);
        c41826h2.m91581o("requiredIdDocsStatus", true);
        c41826h2.m91581o("workflowStatus", true);
        c41826h2.m91581o("videoIdentData", true);
        descriptor = c41826h2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        return new InterfaceC44951d[]{C29615v1.f59670a, C29478H1.f59482e[1].getValue(), C45236a.m99969u(C29469E1.f59464a), C45236a.m99969u(C29460B1.f59459a)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        C29623x1 c29623x1;
        Map map;
        C29475G1 c29475g1;
        C29466D1 c29466d1;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29478H1.f59482e;
        C29623x1 c29623x2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C29623x1 c29623x3 = (C29623x1) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 0, C29615v1.f59670a, null);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 1, (InterfaceC44949c) lazyArr[1].getValue(), null);
            C29475G1 c29475g2 = (C29475G1) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C29469E1.f59464a, null);
            map = map2;
            c29623x1 = c29623x3;
            c29466d1 = (C29466D1) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C29460B1.f59459a, null);
            c29475g1 = c29475g2;
            i11 = 15;
        } else {
            boolean z11 = true;
            int i12 = 0;
            Map map3 = null;
            C29475G1 c29475g3 = null;
            C29466D1 c29466d2 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    c29623x2 = (C29623x1) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 0, C29615v1.f59670a, c29623x2);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    map3 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 1, (InterfaceC44949c) lazyArr[1].getValue(), map3);
                    i12 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    c29475g3 = (C29475G1) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C29469E1.f59464a, c29475g3);
                    i12 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    c29466d2 = (C29466D1) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C29460B1.f59459a, c29466d2);
                    i12 |= 8;
                }
            }
            i11 = i12;
            c29623x1 = c29623x2;
            map = map3;
            c29475g1 = c29475g3;
            c29466d1 = c29466d2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29478H1(i11, c29623x1, map, c29475g1, c29466d1);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29478H1 c29478h1 = (C29478H1) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29478H1.f59482e;
        interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 0, C29615v1.f59670a, c29478h1.f59483a);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || !Intrinsics.areEqual(c29478h1.f59484b, MapsKt.emptyMap())) {
            interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 1, (InterfaceC44963p) lazyArr[1].getValue(), c29478h1.f59484b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29478h1.f59485c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C29469E1.f59464a, c29478h1.f59485c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29478h1.f59486d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C29460B1.f59459a, c29478h1.f59486d);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
