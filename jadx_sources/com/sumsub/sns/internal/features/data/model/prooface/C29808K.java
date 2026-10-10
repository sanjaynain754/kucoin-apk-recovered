package com.sumsub.sns.internal.features.data.model.prooface;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41828i;
import kotlinx.serialization.internal.C41891v0;
import kotlinx.serialization.internal.C41897w2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44951d;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.prooface.K */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29808K implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29808K f59883a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29808K c29808k = new C29808K();
        f59883a = c29808k;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.prooface.LivenessSession", c29808k, 7);
        c41826h2.m91581o("sessionId", true);
        c41826h2.m91581o("sessionKey", true);
        c41826h2.m91581o("requiredFragments", true);
        c41826h2.m91581o("answer", true);
        c41826h2.m91581o("allowContinuing", true);
        c41826h2.m91581o("skipCalibration", true);
        c41826h2.m91581o("suggestion", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        C41897w2 c41897w2 = C41897w2.f92051a;
        InterfaceC44951d interfaceC44951dM99969u = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u2 = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u3 = C45236a.m99969u(C41891v0.f92041a);
        InterfaceC44951d interfaceC44951dM99969u4 = C45236a.m99969u(c41897w2);
        C41828i c41828i = C41828i.f91957a;
        return new InterfaceC44951d[]{interfaceC44951dM99969u, interfaceC44951dM99969u2, interfaceC44951dM99969u3, interfaceC44951dM99969u4, C45236a.m99969u(c41828i), C45236a.m99969u(c41828i), C45236a.m99969u(c41897w2)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        String str;
        String str2;
        String str3;
        Integer num;
        String str4;
        Boolean bool;
        Boolean bool2;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        int i12 = 6;
        String str5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, c41897w2, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41897w2, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41891v0.f92041a, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, c41897w2, null);
            C41828i c41828i = C41828i.f91957a;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, c41828i, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, c41828i, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, c41897w2, null);
            i11 = 127;
            bool2 = bool4;
            str4 = str8;
            bool = bool3;
            num = num2;
            str3 = str7;
            str2 = str6;
        } else {
            boolean z11 = true;
            int i13 = 0;
            String str9 = null;
            String str10 = null;
            Integer num3 = null;
            String str11 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        i12 = 6;
                        break;
                    case 0:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, str5);
                        i13 |= 1;
                        i12 = 6;
                        break;
                    case 1:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, str10);
                        i13 |= 2;
                        i12 = 6;
                        break;
                    case 2:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41891v0.f92041a, num3);
                        i13 |= 4;
                        break;
                    case 3:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, str11);
                        i13 |= 8;
                        break;
                    case 4:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C41828i.f91957a, bool5);
                        i13 |= 16;
                        break;
                    case 5:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, C41828i.f91957a, bool6);
                        i13 |= 32;
                        break;
                    case 6:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i12, C41897w2.f92051a, str9);
                        i13 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i11 = i13;
            str = str9;
            str2 = str5;
            str3 = str10;
            num = num3;
            str4 = str11;
            bool = bool5;
            bool2 = bool6;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29810M(i11, str2, str3, num, str4, bool, bool2, str);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29810M c29810m = (C29810M) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29810m.f59884a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, c29810m.f59884a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29810m.f59885b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, c29810m.f59885b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29810m.f59886c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41891v0.f92041a, c29810m.f59886c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29810m.f59887d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, c29810m.f59887d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c29810m.f59888e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, C41828i.f91957a, c29810m.f59888e);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 5) || c29810m.f59889f != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 5, C41828i.f91957a, c29810m.f59889f);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 6) || c29810m.f59890g != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 6, C41897w2.f92051a, c29810m.f59890g);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
