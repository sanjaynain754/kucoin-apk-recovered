package com.sumsub.sentry;

import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
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

/* JADX INFO: renamed from: com.sumsub.sentry.I0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C27875I0 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C27875I0 f56924a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C27875I0 c27875i0 = new C27875I0();
        f56924a = c27875i0;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sentry.SentryStackFrame", c27875i0, 15);
        c41826h2.m91581o("filename", true);
        c41826h2.m91581o("function", true);
        c41826h2.m91581o("module", true);
        c41826h2.m91581o("lineno", true);
        c41826h2.m91581o("colno", true);
        c41826h2.m91581o("abs_path", true);
        c41826h2.m91581o("context_line", true);
        c41826h2.m91581o("in_app", true);
        c41826h2.m91581o(TPDownloadProxyEnum.DLPARAM_PACKAGE, true);
        c41826h2.m91581o("native", true);
        c41826h2.m91581o("platform", true);
        c41826h2.m91581o("image_addr", true);
        c41826h2.m91581o("symbol_addr", true);
        c41826h2.m91581o("instruction_addr", true);
        c41826h2.m91581o("raw_function", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        C41897w2 c41897w2 = C41897w2.f92051a;
        InterfaceC44951d interfaceC44951dM99969u = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u2 = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u3 = C45236a.m99969u(c41897w2);
        C41891v0 c41891v0 = C41891v0.f92041a;
        InterfaceC44951d interfaceC44951dM99969u4 = C45236a.m99969u(c41891v0);
        InterfaceC44951d interfaceC44951dM99969u5 = C45236a.m99969u(c41891v0);
        InterfaceC44951d interfaceC44951dM99969u6 = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u7 = C45236a.m99969u(c41897w2);
        C41828i c41828i = C41828i.f91957a;
        return new InterfaceC44951d[]{interfaceC44951dM99969u, interfaceC44951dM99969u2, interfaceC44951dM99969u3, interfaceC44951dM99969u4, interfaceC44951dM99969u5, interfaceC44951dM99969u6, interfaceC44951dM99969u7, C45236a.m99969u(c41828i), C45236a.m99969u(c41897w2), C45236a.m99969u(c41828i), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Boolean bool;
        String str6;
        Boolean bool2;
        String str7;
        String str8;
        String str9;
        Integer num;
        String str10;
        String str11;
        Integer num2;
        int i11;
        String str12;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        String str13 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, c41897w2, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41897w2, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41897w2, null);
            C41891v0 c41891v0 = C41891v0.f92041a;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, c41891v0, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, c41891v0, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, c41897w2, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, c41897w2, null);
            C41828i c41828i = C41828i.f91957a;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, c41828i, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, c41897w2, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 9, c41828i, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 10, c41897w2, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 11, c41897w2, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 12, c41897w2, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 13, c41897w2, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 14, c41897w2, null);
            i11 = 32767;
            str = str14;
            num = num4;
            str8 = str20;
            bool = bool4;
            bool2 = bool3;
            str9 = str18;
            str7 = str17;
            num2 = num3;
            str6 = str19;
            str5 = str21;
            str11 = str16;
            str2 = str23;
            str4 = str22;
            str10 = str15;
        } else {
            boolean z11 = true;
            int i12 = 0;
            Integer num5 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            Boolean bool5 = null;
            String str28 = null;
            Boolean bool6 = null;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            Integer num6 = null;
            String str32 = null;
            String str33 = null;
            while (z11) {
                String str34 = str24;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        str24 = str34;
                        num5 = num5;
                        i12 = i12;
                        break;
                    case 0:
                        str12 = str34;
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, str32);
                        i12 |= 1;
                        str33 = str33;
                        str24 = str12;
                        num5 = num5;
                        break;
                    case 1:
                        str12 = str34;
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, str33);
                        i12 |= 2;
                        str24 = str12;
                        num5 = num5;
                        break;
                    case 2:
                        num5 = num5;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, str34);
                        i12 |= 4;
                        num5 = num5;
                        break;
                    case 3:
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41891v0.f92041a, num5);
                        i12 |= 8;
                        str24 = str34;
                        break;
                    case 4:
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C41891v0.f92041a, num6);
                        i12 |= 16;
                        str24 = str34;
                        num5 = num5;
                        break;
                    case 5:
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, C41897w2.f92051a, str29);
                        i12 |= 32;
                        str24 = str34;
                        num5 = num5;
                        break;
                    case 6:
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, C41897w2.f92051a, str31);
                        i12 |= 64;
                        str24 = str34;
                        num5 = num5;
                        break;
                    case 7:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, C41828i.f91957a, bool6);
                        i12 |= 128;
                        str24 = str34;
                        num5 = num5;
                        break;
                    case 8:
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, C41897w2.f92051a, str28);
                        i12 |= 256;
                        str24 = str34;
                        num5 = num5;
                        break;
                    case 9:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 9, C41828i.f91957a, bool5);
                        i12 |= 512;
                        str24 = str34;
                        num5 = num5;
                        break;
                    case 10:
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 10, C41897w2.f92051a, str30);
                        i12 |= 1024;
                        str24 = str34;
                        num5 = num5;
                        break;
                    case 11:
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 11, C41897w2.f92051a, str27);
                        i12 |= 2048;
                        str24 = str34;
                        num5 = num5;
                        break;
                    case 12:
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 12, C41897w2.f92051a, str26);
                        i12 |= 4096;
                        str24 = str34;
                        num5 = num5;
                        break;
                    case 13:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 13, C41897w2.f92051a, str13);
                        i12 |= 8192;
                        str24 = str34;
                        num5 = num5;
                        break;
                    case 14:
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 14, C41897w2.f92051a, str25);
                        i12 |= 16384;
                        str24 = str34;
                        num5 = num5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str32;
            str2 = str13;
            str3 = str25;
            str4 = str26;
            str5 = str27;
            bool = bool5;
            str6 = str28;
            bool2 = bool6;
            str7 = str29;
            str8 = str30;
            str9 = str31;
            num = num6;
            str10 = str33;
            str11 = str24;
            num2 = num5;
            i11 = i12;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C27879K0(i11, str, str10, str11, num2, num, str7, str9, bool2, str6, bool, str8, str5, str4, str2, str3);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C27879K0 c27879k0 = (C27879K0) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c27879k0.f56934a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, c27879k0.f56934a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c27879k0.f56935b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, c27879k0.f56935b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c27879k0.f56936c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, c27879k0.f56936c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c27879k0.f56937d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C41891v0.f92041a, c27879k0.f56937d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c27879k0.f56938e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, C41891v0.f92041a, c27879k0.f56938e);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 5) || c27879k0.f56939f != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 5, C41897w2.f92051a, c27879k0.f56939f);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 6) || c27879k0.f56940g != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 6, C41897w2.f92051a, c27879k0.f56940g);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 7) || c27879k0.f56941h != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 7, C41828i.f91957a, c27879k0.f56941h);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 8) || c27879k0.f56942i != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 8, C41897w2.f92051a, c27879k0.f56942i);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 9) || c27879k0.f56943j != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 9, C41828i.f91957a, c27879k0.f56943j);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 10) || c27879k0.f56944k != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 10, C41897w2.f92051a, c27879k0.f56944k);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 11) || c27879k0.f56945l != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 11, C41897w2.f92051a, c27879k0.f56945l);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 12) || c27879k0.f56946m != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 12, C41897w2.f92051a, c27879k0.f56946m);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 13) || c27879k0.f56947n != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 13, C41897w2.f92051a, c27879k0.f56947n);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 14) || c27879k0.f56948o != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 14, C41897w2.f92051a, c27879k0.f56948o);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
