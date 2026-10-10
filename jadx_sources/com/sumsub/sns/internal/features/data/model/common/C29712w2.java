package com.sumsub.sns.internal.features.data.model.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33612dh;
import com.tencent.bugly.proguard.C33812n7;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41876r2;
import kotlinx.serialization.internal.C41897w2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44951d;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.w2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29712w2 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29712w2 f59775a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29712w2 c29712w2 = new C29712w2();
        f59775a = c29712w2;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.LogParams", c29712w2, 8);
        c41826h2.m91581o("errorType", true);
        c41826h2.m91581o(FirebaseAnalytics.Param.LOCATION, false);
        c41826h2.m91581o("externalUserId", true);
        c41826h2.m91581o("fileName", true);
        c41826h2.m91581o("applicantId", false);
        c41826h2.m91581o("message", false);
        c41826h2.m91581o(C33612dh.f69618m, true);
        c41826h2.m91581o(C33812n7.f71061t, true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new InterfaceC44951d[]{c41897w2, c41897w2, C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), c41897w2, c41897w2, c41897w2, C45236a.m99969u(c41897w2)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 1);
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41897w2, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, c41897w2, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 6);
            str2 = strDecodeStringElement2;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, c41897w2, null);
            str8 = strDecodeStringElement6;
            str7 = strDecodeStringElement5;
            str5 = str10;
            str6 = strDecodeStringElement4;
            str4 = str9;
            str3 = strDecodeStringElement3;
            i11 = 255;
        } else {
            boolean z11 = true;
            int i12 = 0;
            String str11 = null;
            String strDecodeStringElement7 = null;
            String str12 = null;
            String str13 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        break;
                    case 0:
                        i12 |= 1;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 0);
                        continue;
                    case 1:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 1);
                        i12 |= 2;
                        continue;
                    case 2:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, str12);
                        i12 |= 4;
                        break;
                    case 3:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, str13);
                        i12 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 4);
                        i12 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 5);
                        i12 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 6);
                        i12 |= 64;
                        break;
                    case 7:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, C41897w2.f92051a, str11);
                        i12 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i11 = i12;
            str = str11;
            str2 = strDecodeStringElement;
            str3 = strDecodeStringElement7;
            str4 = str12;
            str5 = str13;
            str6 = strDecodeStringElement8;
            str7 = strDecodeStringElement9;
            str8 = strDecodeStringElement10;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new LogParams(i11, str2, str3, str4, str5, str6, str7, str8, str, (C41876r2) null);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        LogParams.write$Self$idensic_mobile_sdk_aar_defaultRelease((LogParams) obj, interfaceC45829bBeginStructure, interfaceC45533f);
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
