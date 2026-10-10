package com.sumsub.sns.internal.features.data.model.common.remote.response;

import com.sumsub.sns.internal.features.data.model.common.ReviewStatusType;
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
import p852kotlin.Lazy;
import tg0.InterfaceC44949c;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44963p;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.v1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29615v1 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29615v1 f59670a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29615v1 c29615v1 = new C29615v1();
        f59670a = c29615v1;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.response.WithIdDocsStatusResponse.RequiredIdDocsStatus.InspectionReview", c29615v1, 11);
        c41826h2.m91581o("notificationFailureCnt", true);
        c41826h2.m91581o("reviewStatus", true);
        c41826h2.m91581o("priority", true);
        c41826h2.m91581o("createDate", true);
        c41826h2.m91581o("reviewResult", true);
        c41826h2.m91581o("reviewId", true);
        c41826h2.m91581o("reprocessing", true);
        c41826h2.m91581o("levelName", true);
        c41826h2.m91581o("autoChecked", true);
        c41826h2.m91581o("elapsedSinceQueuedMs", true);
        c41826h2.m91581o("elapsedSincePendingMs", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C29623x1.f59672l;
        C41891v0 c41891v0 = C41891v0.f92041a;
        InterfaceC44951d interfaceC44951dM99969u = C45236a.m99969u(c41891v0);
        InterfaceC44951d interfaceC44951dM99969u2 = C45236a.m99969u((InterfaceC44951d) lazyArr[1].getValue());
        InterfaceC44951d interfaceC44951dM99969u3 = C45236a.m99969u(c41891v0);
        C41897w2 c41897w2 = C41897w2.f92051a;
        InterfaceC44951d interfaceC44951dM99969u4 = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u5 = C45236a.m99969u(C29481I1.f59488a);
        InterfaceC44951d interfaceC44951dM99969u6 = C45236a.m99969u(c41897w2);
        C41828i c41828i = C41828i.f91957a;
        InterfaceC44951d interfaceC44951dM99969u7 = C45236a.m99969u(c41828i);
        InterfaceC44951d interfaceC44951dM99969u8 = C45236a.m99969u(c41897w2);
        InterfaceC44951d interfaceC44951dM99969u9 = C45236a.m99969u(c41828i);
        C41820g1 c41820g1 = C41820g1.f91932a;
        return new InterfaceC44951d[]{interfaceC44951dM99969u, interfaceC44951dM99969u2, interfaceC44951dM99969u3, interfaceC44951dM99969u4, interfaceC44951dM99969u5, interfaceC44951dM99969u6, interfaceC44951dM99969u7, interfaceC44951dM99969u8, interfaceC44951dM99969u9, C45236a.m99969u(c41820g1), C45236a.m99969u(c41820g1)};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        Long l11;
        Boolean bool;
        String str;
        Boolean bool2;
        C29487K1 c29487k1;
        Long l12;
        String str2;
        String str3;
        Integer num;
        ReviewStatusType reviewStatusType;
        Integer num2;
        Lazy[] lazyArr;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr2 = C29623x1.f59672l;
        Integer num3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C41891v0 c41891v0 = C41891v0.f92041a;
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, c41891v0, null);
            ReviewStatusType reviewStatusType2 = (ReviewStatusType) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, (InterfaceC44949c) lazyArr2[1].getValue(), null);
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41891v0, null);
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, c41897w2, null);
            C29487K1 c29487k2 = (C29487K1) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C29481I1.f59488a, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, c41897w2, null);
            C41828i c41828i = C41828i.f91957a;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, c41828i, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, c41897w2, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, c41828i, null);
            C41820g1 c41820g1 = C41820g1.f91932a;
            Long l13 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 9, c41820g1, null);
            reviewStatusType = reviewStatusType2;
            num = num5;
            l11 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 10, c41820g1, null);
            l12 = l13;
            str = str6;
            bool2 = bool3;
            str2 = str5;
            str3 = str4;
            bool = bool4;
            c29487k1 = c29487k2;
            i11 = 2047;
            num2 = num4;
        } else {
            int i12 = 1;
            boolean z11 = true;
            int i13 = 0;
            Long l14 = null;
            Boolean bool5 = null;
            String str7 = null;
            Boolean bool6 = null;
            C29487K1 c29487k3 = null;
            Long l15 = null;
            String str8 = null;
            String str9 = null;
            Integer num6 = null;
            ReviewStatusType reviewStatusType3 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        lazyArr2 = lazyArr2;
                        i12 = 1;
                        break;
                    case 0:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41891v0.f92041a, num3);
                        i13 |= 1;
                        lazyArr2 = lazyArr2;
                        i12 = 1;
                        break;
                    case 1:
                        lazyArr = lazyArr2;
                        reviewStatusType3 = (ReviewStatusType) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i12, (InterfaceC44949c) lazyArr[i12].getValue(), reviewStatusType3);
                        i13 |= 2;
                        lazyArr2 = lazyArr;
                        break;
                    case 2:
                        lazyArr = lazyArr2;
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41891v0.f92041a, num6);
                        i13 |= 4;
                        lazyArr2 = lazyArr;
                        break;
                    case 3:
                        lazyArr = lazyArr2;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, str9);
                        i13 |= 8;
                        lazyArr2 = lazyArr;
                        break;
                    case 4:
                        lazyArr = lazyArr2;
                        c29487k3 = (C29487K1) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C29481I1.f59488a, c29487k3);
                        i13 |= 16;
                        lazyArr2 = lazyArr;
                        break;
                    case 5:
                        lazyArr = lazyArr2;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, C41897w2.f92051a, str8);
                        i13 |= 32;
                        lazyArr2 = lazyArr;
                        break;
                    case 6:
                        lazyArr = lazyArr2;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, C41828i.f91957a, bool6);
                        i13 |= 64;
                        lazyArr2 = lazyArr;
                        break;
                    case 7:
                        lazyArr = lazyArr2;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, C41897w2.f92051a, str7);
                        i13 |= 128;
                        lazyArr2 = lazyArr;
                        break;
                    case 8:
                        lazyArr = lazyArr2;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, C41828i.f91957a, bool5);
                        i13 |= 256;
                        lazyArr2 = lazyArr;
                        break;
                    case 9:
                        lazyArr = lazyArr2;
                        l15 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 9, C41820g1.f91932a, l15);
                        i13 |= 512;
                        lazyArr2 = lazyArr;
                        break;
                    case 10:
                        l14 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 10, C41820g1.f91932a, l14);
                        i13 |= 1024;
                        lazyArr2 = lazyArr2;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i11 = i13;
            l11 = l14;
            bool = bool5;
            str = str7;
            bool2 = bool6;
            c29487k1 = c29487k3;
            l12 = l15;
            str2 = str8;
            str3 = str9;
            num = num6;
            reviewStatusType = reviewStatusType3;
            num2 = num3;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29623x1(i11, num2, reviewStatusType, num, str3, c29487k1, str2, bool2, str, bool, l12, l11);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29623x1 c29623x1 = (C29623x1) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29623x1.f59672l;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29623x1.f59673a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41891v0.f92041a, c29623x1.f59673a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29623x1.f59674b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, (InterfaceC44963p) lazyArr[1].getValue(), c29623x1.f59674b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29623x1.f59675c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41891v0.f92041a, c29623x1.f59675c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29623x1.f59676d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, c29623x1.f59676d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c29623x1.f59677e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, C29481I1.f59488a, c29623x1.f59677e);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 5) || c29623x1.f59678f != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 5, C41897w2.f92051a, c29623x1.f59678f);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 6) || c29623x1.f59679g != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 6, C41828i.f91957a, c29623x1.f59679g);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 7) || c29623x1.f59680h != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 7, C41897w2.f92051a, c29623x1.f59680h);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 8) || c29623x1.f59681i != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 8, C41828i.f91957a, c29623x1.f59681i);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 9) || c29623x1.f59682j != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 9, C41820g1.f91932a, c29623x1.f59682j);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 10) || c29623x1.f59683k != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 10, C41820g1.f91932a, c29623x1.f59683k);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
