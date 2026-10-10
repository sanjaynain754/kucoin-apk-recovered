package com.sumsub.sns.internal.features.data.model.common.remote.response;

import com.sumsub.sns.internal.features.data.model.common.ReviewAnswerType;
import com.sumsub.sns.internal.features.data.model.common.ReviewRejectType;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.I1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29481I1 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29481I1 f59488a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C29481I1 c29481i1 = new C29481I1();
        f59488a = c29481i1;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.response.WithIdDocsStatusResponse.ReviewResult", c29481i1, 5);
        c41826h2.m91581o("moderationComment", true);
        c41826h2.m91581o("clientComment", true);
        c41826h2.m91581o("reviewAnswer", true);
        c41826h2.m91581o("rejectLabels", true);
        c41826h2.m91581o("reviewRejectType", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C29487K1.f59494f;
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new InterfaceC44951d[]{C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u((InterfaceC44951d) lazyArr[2].getValue()), C45236a.m99969u((InterfaceC44951d) lazyArr[3].getValue()), C45236a.m99969u((InterfaceC44951d) lazyArr[4].getValue())};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        String str;
        String str2;
        ReviewAnswerType reviewAnswerType;
        List list;
        ReviewRejectType reviewRejectType;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29487K1.f59494f;
        String str3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, c41897w2, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41897w2, null);
            ReviewAnswerType reviewAnswerType2 = (ReviewAnswerType) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, (InterfaceC44949c) lazyArr[2].getValue(), null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44949c) lazyArr[3].getValue(), null);
            reviewRejectType = (ReviewRejectType) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44949c) lazyArr[4].getValue(), null);
            str2 = str5;
            list = list2;
            i11 = 31;
            reviewAnswerType = reviewAnswerType2;
            str = str4;
        } else {
            boolean z11 = true;
            int i12 = 0;
            String str6 = null;
            ReviewAnswerType reviewAnswerType3 = null;
            List list3 = null;
            ReviewRejectType reviewRejectType2 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, str3);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, str6);
                    i12 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    reviewAnswerType3 = (ReviewAnswerType) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, (InterfaceC44949c) lazyArr[2].getValue(), reviewAnswerType3);
                    i12 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44949c) lazyArr[3].getValue(), list3);
                    i12 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    reviewRejectType2 = (ReviewRejectType) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44949c) lazyArr[4].getValue(), reviewRejectType2);
                    i12 |= 16;
                }
            }
            i11 = i12;
            str = str3;
            str2 = str6;
            reviewAnswerType = reviewAnswerType3;
            list = list3;
            reviewRejectType = reviewRejectType2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29487K1(i11, str, str2, reviewAnswerType, list, reviewRejectType);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29487K1 c29487k1 = (C29487K1) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29487K1.f59494f;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29487k1.f59495a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, c29487k1.f59495a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29487k1.f59496b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, c29487k1.f59496b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29487k1.f59497c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, (InterfaceC44963p) lazyArr[2].getValue(), c29487k1.f59497c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29487k1.f59498d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44963p) lazyArr[3].getValue(), c29487k1.f59498d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c29487k1.f59499e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, (InterfaceC44963p) lazyArr[4].getValue(), c29487k1.f59499e);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
