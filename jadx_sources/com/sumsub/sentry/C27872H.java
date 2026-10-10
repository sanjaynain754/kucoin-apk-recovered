package com.sumsub.sentry;

import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41828i;
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

/* JADX INFO: renamed from: com.sumsub.sentry.H */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C27872H implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C27872H f56921a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C27872H c27872h = new C27872H();
        f56921a = c27872h;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sentry.Mechanism", c27872h, 7);
        c41826h2.m91581o("type", true);
        c41826h2.m91581o(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, true);
        c41826h2.m91581o("help_link", true);
        c41826h2.m91581o("handled", true);
        c41826h2.m91581o("meta", true);
        c41826h2.m91581o("data", true);
        c41826h2.m91581o("synthetic", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C27876J.f56925h;
        C41897w2 c41897w2 = C41897w2.f92051a;
        InterfaceC44951d interfaceC44951dM99969u = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u2 = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u3 = C45236a.m99969u(c41897w2);
        C41828i c41828i = C41828i.f91957a;
        return new InterfaceC44951d[]{interfaceC44951dM99969u, interfaceC44951dM99969u2, interfaceC44951dM99969u3, C45236a.m99969u(c41828i), C45236a.m99969u((InterfaceC44951d) lazyArr[4].getValue()), C45236a.m99969u((InterfaceC44951d) lazyArr[5].getValue()), C45236a.m99969u(c41828i)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        Boolean bool;
        Map map;
        String str;
        String str2;
        String str3;
        Boolean bool2;
        Map map2;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C27876J.f56925h;
        int i12 = 6;
        String str4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, c41897w2, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41897w2, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41897w2, null);
            C41828i c41828i = C41828i.f91957a;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, c41828i, null);
            Map map3 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44949c) lazyArr[4].getValue(), null);
            map = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, (InterfaceC44949c) lazyArr[5].getValue(), null);
            str3 = str7;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, c41828i, null);
            bool2 = bool3;
            i11 = 127;
            map2 = map3;
            str2 = str6;
            str = str5;
        } else {
            boolean z11 = true;
            int i13 = 0;
            Boolean bool4 = null;
            Map map4 = null;
            String str8 = null;
            String str9 = null;
            Boolean bool5 = null;
            Map map5 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        i12 = 6;
                        break;
                    case 0:
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, str4);
                        i13 |= 1;
                        i12 = 6;
                        break;
                    case 1:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, str8);
                        i13 |= 2;
                        i12 = 6;
                        break;
                    case 2:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, str9);
                        i13 |= 4;
                        i12 = 6;
                        break;
                    case 3:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41828i.f91957a, bool5);
                        i13 |= 8;
                        break;
                    case 4:
                        map5 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44949c) lazyArr[4].getValue(), map5);
                        i13 |= 16;
                        break;
                    case 5:
                        map4 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, (InterfaceC44949c) lazyArr[5].getValue(), map4);
                        i13 |= 32;
                        break;
                    case 6:
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i12, C41828i.f91957a, bool4);
                        i13 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i11 = i13;
            bool = bool4;
            map = map4;
            str = str4;
            str2 = str8;
            str3 = str9;
            bool2 = bool5;
            map2 = map5;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C27876J(i11, str, str2, str3, bool2, map2, map, bool);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C27876J c27876j = (C27876J) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C27876J.f56925h;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c27876j.f56926a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, c27876j.f56926a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c27876j.f56927b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, c27876j.f56927b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c27876j.f56928c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, c27876j.f56928c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c27876j.f56929d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C41828i.f91957a, c27876j.f56929d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c27876j.f56930e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44963p) lazyArr[4].getValue(), c27876j.f56930e);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 5) || c27876j.f56931f != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 5, (InterfaceC44963p) lazyArr[5].getValue(), c27876j.f56931f);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 6) || c27876j.f56932g != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 6, C41828i.f91957a, c27876j.f56932g);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
