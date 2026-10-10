package com.sumsub.sentry;

import com.tencent.bugly.proguard.C33812n7;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41820g1;
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

/* JADX INFO: renamed from: com.sumsub.sentry.R0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C27892R0 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C27892R0 f56970a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C27892R0 c27892r0 = new C27892R0();
        f56970a = c27892r0;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sentry.SentryThread", c27892r0, 8);
        c41826h2.m91581o("id", true);
        c41826h2.m91581o("priority", true);
        c41826h2.m91581o("name", true);
        c41826h2.m91581o("state", true);
        c41826h2.m91581o("crashed", true);
        c41826h2.m91581o("current", true);
        c41826h2.m91581o("daemon", true);
        c41826h2.m91581o(C33812n7.f71061t, true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        InterfaceC44951d interfaceC44951dM99969u = C45236a.m99969u(C41820g1.f91932a);
        InterfaceC44951d interfaceC44951dM99969u2 = C45236a.m99969u(C41891v0.f92041a);
        C41897w2 c41897w2 = C41897w2.f92051a;
        InterfaceC44951d interfaceC44951dM99969u3 = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u4 = C45236a.m99969u(c41897w2);
        C41828i c41828i = C41828i.f91957a;
        return new InterfaceC44951d[]{interfaceC44951dM99969u, interfaceC44951dM99969u2, interfaceC44951dM99969u3, interfaceC44951dM99969u4, C45236a.m99969u(c41828i), C45236a.m99969u(c41828i), C45236a.m99969u(c41828i), C45236a.m99969u(C27881L0.f56949a)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        C27885N0 c27885n0;
        Boolean bool;
        Boolean bool2;
        Long l11;
        Integer num;
        String str;
        String str2;
        Boolean bool3;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        int i12 = 7;
        Long l12 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Long l13 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41820g1.f91932a, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41891v0.f92041a, null);
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41897w2, null);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, c41897w2, null);
            C41828i c41828i = C41828i.f91957a;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, c41828i, null);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, c41828i, null);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, c41828i, null);
            l11 = l13;
            c27885n0 = (C27885N0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, C27881L0.f56949a, null);
            bool = bool6;
            bool2 = bool5;
            str2 = str4;
            bool3 = bool4;
            str = str3;
            num = num2;
            i11 = 255;
        } else {
            boolean z11 = true;
            int i13 = 0;
            C27885N0 c27885n1 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Integer num3 = null;
            String str5 = null;
            String str6 = null;
            Boolean bool9 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        i12 = 7;
                        break;
                    case 0:
                        l12 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41820g1.f91932a, l12);
                        i13 |= 1;
                        i12 = 7;
                        break;
                    case 1:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41891v0.f92041a, num3);
                        i13 |= 2;
                        i12 = 7;
                        break;
                    case 2:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, str5);
                        i13 |= 4;
                        i12 = 7;
                        break;
                    case 3:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, str6);
                        i13 |= 8;
                        i12 = 7;
                        break;
                    case 4:
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C41828i.f91957a, bool9);
                        i13 |= 16;
                        break;
                    case 5:
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, C41828i.f91957a, bool8);
                        i13 |= 32;
                        break;
                    case 6:
                        bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, C41828i.f91957a, bool7);
                        i13 |= 64;
                        break;
                    case 7:
                        c27885n1 = (C27885N0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i12, C27881L0.f56949a, c27885n1);
                        i13 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i11 = i13;
            c27885n0 = c27885n1;
            bool = bool7;
            bool2 = bool8;
            l11 = l12;
            num = num3;
            str = str5;
            str2 = str6;
            bool3 = bool9;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C27896T0(i11, l11, num, str, str2, bool3, bool2, bool, c27885n0);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C27896T0 c27896t0 = (C27896T0) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c27896t0.f56976a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41820g1.f91932a, c27896t0.f56976a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c27896t0.f56977b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41891v0.f92041a, c27896t0.f56977b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c27896t0.f56978c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, c27896t0.f56978c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c27896t0.f56979d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, c27896t0.f56979d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c27896t0.f56980e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, C41828i.f91957a, c27896t0.f56980e);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 5) || c27896t0.f56981f != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 5, C41828i.f91957a, c27896t0.f56981f);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 6) || c27896t0.f56982g != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 6, C41828i.f91957a, c27896t0.f56982g);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 7) || c27896t0.f56983h != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 7, C27881L0.f56949a, c27896t0.f56983h);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
