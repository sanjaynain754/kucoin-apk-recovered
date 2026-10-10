package com.sumsub.sentry;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
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

/* JADX INFO: renamed from: com.sumsub.sentry.V */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C27899V implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C27899V f56985a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C27899V c27899v = new C27899V();
        f56985a = c27899v;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sentry.SdkVersion", c27899v, 4);
        c41826h2.m91581o("name", false);
        c41826h2.m91581o("version", false);
        c41826h2.m91581o("packages", true);
        c41826h2.m91581o("integrations", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C27903X.f56987e;
        InterfaceC44951d interfaceC44951dM99969u = C45236a.m99969u((InterfaceC44951d) lazyArr[2].getValue());
        InterfaceC44951d interfaceC44951dM99969u2 = C45236a.m99969u((InterfaceC44951d) lazyArr[3].getValue());
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new InterfaceC44951d[]{c41897w2, c41897w2, interfaceC44951dM99969u, interfaceC44951dM99969u2};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        String str;
        String str2;
        List list;
        List list2;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C27903X.f56987e;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 1);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, (InterfaceC44949c) lazyArr[2].getValue(), null);
            list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44949c) lazyArr[3].getValue(), null);
            str = strDecodeStringElement2;
            i11 = 15;
            list = list3;
            str2 = strDecodeStringElement3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            String strDecodeStringElement4 = null;
            List list4 = null;
            List list5 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 0);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 1);
                    i12 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, (InterfaceC44949c) lazyArr[2].getValue(), list4);
                    i12 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44949c) lazyArr[3].getValue(), list5);
                    i12 |= 8;
                }
            }
            i11 = i12;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement4;
            list = list4;
            list2 = list5;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C27903X(i11, str, str2, list, list2);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C27903X c27903x = (C27903X) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C27903X.f56987e;
        interfaceC45829bBeginStructure.encodeStringElement(interfaceC45533f, 0, c27903x.f56988a);
        interfaceC45829bBeginStructure.encodeStringElement(interfaceC45533f, 1, c27903x.f56989b);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c27903x.f56990c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, (InterfaceC44963p) lazyArr[2].getValue(), c27903x.f56990c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c27903x.f56991d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44963p) lazyArr[3].getValue(), c27903x.f56991d);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
