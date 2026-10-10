package com.sumsub.sentry;

import com.tencent.bugly.proguard.C33612dh;
import com.tencent.bugly.proguard.C33616e0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41897w2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44949c;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44963p;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sentry.Y0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C27906Y0 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C27906Y0 f56996a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C27906Y0 c27906y0 = new C27906Y0();
        f56996a = c27906y0;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sentry.SpanContext", c27906y0, 7);
        c41826h2.m91581o(C33612dh.f69612g, false);
        c41826h2.m91581o(C33612dh.f69613h, false);
        c41826h2.m91581o(C33612dh.f69614i, false);
        c41826h2.m91581o("op", false);
        c41826h2.m91581o(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, true);
        c41826h2.m91581o("status", true);
        c41826h2.m91581o(C33616e0.f69644s, true);
        descriptor = c41826h2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C27911a1.f57012h;
        C27926b1 c27926b1 = C27926b1.f57048a;
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new InterfaceC44951d[]{C28001u0.f57136a, c27926b1, C45236a.m99969u(c27926b1), c41897w2, C45236a.m99969u(c41897w2), C45236a.m99969u((InterfaceC44951d) lazyArr[5].getValue()), lazyArr[6].getValue()};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        Map map;
        String str;
        SpanStatus spanStatus;
        String str2;
        String str3;
        String str4;
        String str5;
        int i11;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C27911a1.f57012h;
        int i12 = 3;
        SpanStatus spanStatus2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C28009w0 c28009w0 = (C28009w0) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 0, C28001u0.f57136a, null);
            String str6 = c28009w0 != null ? c28009w0.f57137a : null;
            C27926b1 c27926b1 = C27926b1.f57048a;
            C27934d1 c27934d1 = (C27934d1) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 1, c27926b1, null);
            String str7 = c27934d1 != null ? c27934d1.f57061a : null;
            C27934d1 c27934d2 = (C27934d1) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c27926b1, null);
            String str8 = c27934d2 != null ? c27934d2.f57061a : null;
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 3);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C41897w2.f92051a, null);
            SpanStatus spanStatus3 = (SpanStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, (InterfaceC44949c) lazyArr[5].getValue(), null);
            map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 6, (InterfaceC44949c) lazyArr[6].getValue(), null);
            str2 = str6;
            str3 = strDecodeStringElement;
            str4 = str9;
            str5 = str8;
            i11 = 127;
            spanStatus = spanStatus3;
            str = str7;
        } else {
            boolean z11 = true;
            int i13 = 0;
            Map map2 = null;
            String str10 = null;
            String str11 = null;
            String strDecodeStringElement2 = null;
            String str12 = null;
            String str13 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        break;
                    case 0:
                        C28009w0 c28009w1 = (C28009w0) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 0, C28001u0.f57136a, str11 != null ? new C28009w0(str11) : null);
                        i13 |= 1;
                        str11 = c28009w1 != null ? c28009w1.f57137a : null;
                        i12 = 3;
                        break;
                    case 1:
                        C27934d1 c27934d3 = (C27934d1) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 1, C27926b1.f57048a, str10 != null ? new C27934d1(str10) : null);
                        i13 |= 2;
                        str10 = c27934d3 != null ? c27934d3.f57061a : null;
                        i12 = 3;
                        break;
                    case 2:
                        C27934d1 c27934d4 = (C27934d1) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C27926b1.f57048a, str13 != null ? new C27934d1(str13) : null);
                        str13 = c27934d4 != null ? c27934d4.f57061a : null;
                        i13 |= 4;
                        i12 = 3;
                        break;
                    case 3:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, i12);
                        i13 |= 8;
                        break;
                    case 4:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C41897w2.f92051a, str12);
                        i13 |= 16;
                        break;
                    case 5:
                        spanStatus2 = (SpanStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, (InterfaceC44949c) lazyArr[5].getValue(), spanStatus2);
                        i13 |= 32;
                        break;
                    case 6:
                        map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 6, (InterfaceC44949c) lazyArr[6].getValue(), map2);
                        i13 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            map = map2;
            str = str10;
            spanStatus = spanStatus2;
            str2 = str11;
            str3 = strDecodeStringElement2;
            str4 = str12;
            str5 = str13;
            i11 = i13;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C27911a1(i11, str2, str, str5, str3, str4, spanStatus, map);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C27911a1 c27911a1 = (C27911a1) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C27911a1.f57012h;
        interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 0, C28001u0.f57136a, new C28009w0(c27911a1.f57013a));
        C27926b1 c27926b1 = C27926b1.f57048a;
        interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 1, c27926b1, new C27934d1(c27911a1.f57014b));
        String str = c27911a1.f57015c;
        interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, c27926b1, str != null ? new C27934d1(str) : null);
        interfaceC45829bBeginStructure.encodeStringElement(interfaceC45533f, 3, c27911a1.f57016d);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c27911a1.f57017e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, C41897w2.f92051a, c27911a1.f57017e);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 5) || c27911a1.f57018f != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 5, (InterfaceC44963p) lazyArr[5].getValue(), c27911a1.f57018f);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 6) || !Intrinsics.areEqual(c27911a1.f57019g, new ConcurrentHashMap())) {
            interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 6, (InterfaceC44963p) lazyArr[6].getValue(), c27911a1.f57019g);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
