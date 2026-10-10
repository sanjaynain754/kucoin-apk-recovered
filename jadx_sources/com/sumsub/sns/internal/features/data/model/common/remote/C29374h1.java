package com.sumsub.sns.internal.features.data.model.common.remote;

import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41891v0;
import kotlinx.serialization.internal.C41897w2;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.h1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29374h1 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29374h1 f59384a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29374h1 c29374h1 = new C29374h1();
        f59384a = c29374h1;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.RemoteResourceUploadResult.Uploaded", c29374h1, 6);
        c41826h2.m91581o("imageId", true);
        c41826h2.m91581o("country", true);
        c41826h2.m91581o("idDocType", true);
        c41826h2.m91581o("idDocSubType", true);
        c41826h2.m91581o("errors", true);
        c41826h2.m91581o("nfcSessionInfo", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C29390j1.f59398g;
        InterfaceC44951d interfaceC44951dM99969u = C45236a.m99969u(C41891v0.f92041a);
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new InterfaceC44951d[]{interfaceC44951dM99969u, C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u((InterfaceC44951d) lazyArr[3].getValue()), C45236a.m99969u((InterfaceC44951d) lazyArr[4].getValue()), C45236a.m99969u(C29634s0.f59691a)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        Integer num;
        String str;
        String str2;
        IdentitySide identitySide;
        List list;
        C29655v0 c29655v0;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29390j1.f59398g;
        int i12 = 5;
        Integer num2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41891v0.f92041a, null);
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41897w2, null);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41897w2, null);
            IdentitySide identitySide2 = (IdentitySide) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44949c) lazyArr[3].getValue(), null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44949c) lazyArr[4].getValue(), null);
            num = num3;
            c29655v0 = (C29655v0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, C29634s0.f59691a, null);
            str2 = str4;
            identitySide = identitySide2;
            i11 = 63;
            str = str3;
        } else {
            boolean z11 = true;
            int i13 = 0;
            String str5 = null;
            String str6 = null;
            IdentitySide identitySide3 = null;
            List list2 = null;
            C29655v0 c29655v1 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        i12 = 5;
                        break;
                    case 0:
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41891v0.f92041a, num2);
                        i13 |= 1;
                        i12 = 5;
                        break;
                    case 1:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, str5);
                        i13 |= 2;
                        break;
                    case 2:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, str6);
                        i13 |= 4;
                        break;
                    case 3:
                        identitySide3 = (IdentitySide) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44949c) lazyArr[3].getValue(), identitySide3);
                        i13 |= 8;
                        break;
                    case 4:
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44949c) lazyArr[4].getValue(), list2);
                        i13 |= 16;
                        break;
                    case 5:
                        c29655v1 = (C29655v0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i12, C29634s0.f59691a, c29655v1);
                        i13 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i11 = i13;
            num = num2;
            str = str5;
            str2 = str6;
            identitySide = identitySide3;
            list = list2;
            c29655v0 = c29655v1;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29390j1(i11, num, str, str2, identitySide, list, c29655v0);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29390j1 c29390j1 = (C29390j1) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29390j1.f59398g;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29390j1.f59399a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41891v0.f92041a, c29390j1.f59399a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29390j1.f59400b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, c29390j1.f59400b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29390j1.f59401c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, c29390j1.f59401c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29390j1.f59402d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44963p) lazyArr[3].getValue(), c29390j1.f59402d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c29390j1.f59403e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44963p) lazyArr[4].getValue(), c29390j1.f59403e);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 5) || c29390j1.f59404f != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 5, C29634s0.f59691a, c29390j1.f59404f);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
