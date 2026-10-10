package com.sumsub.sentry;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.firebase.analytics.FirebaseAnalytics;
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

/* JADX INFO: renamed from: com.sumsub.sentry.i0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C27953i0 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C27953i0 f57081a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C27953i0 c27953i0 = new C27953i0();
        f57081a = c27953i0;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sentry.SentryEnvelopeItemHeader", c27953i0, 5);
        c41826h2.m91581o(FirebaseAnalytics.Param.CONTENT_TYPE, true);
        c41826h2.m91581o("filename", true);
        c41826h2.m91581o("type", false);
        c41826h2.m91581o("attachment_type", true);
        c41826h2.m91581o(SessionDescription.ATTR_LENGTH, false);
        descriptor = c41826h2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C27961k0.f57082f;
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new InterfaceC44951d[]{C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), lazyArr[2].getValue(), C45236a.m99969u(c41897w2), C41891v0.f92041a};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int iDecodeIntElement;
        int i11;
        String str;
        String str2;
        SentryItemType sentryItemType;
        String str3;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C27961k0.f57082f;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, c41897w2, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41897w2, null);
            sentryItemType = (SentryItemType) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 2, (InterfaceC44949c) lazyArr[2].getValue(), null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, c41897w2, null);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(interfaceC45533f, 4);
            i11 = 31;
            str2 = str5;
            str = str4;
        } else {
            boolean z11 = true;
            int iDecodeIntElement2 = 0;
            String str6 = null;
            String str7 = null;
            SentryItemType sentryItemType2 = null;
            String str8 = null;
            int i12 = 0;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, str6);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, str7);
                    i12 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    sentryItemType2 = (SentryItemType) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 2, (InterfaceC44949c) lazyArr[2].getValue(), sentryItemType2);
                    i12 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, str8);
                    i12 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(interfaceC45533f, 4);
                    i12 |= 16;
                }
            }
            iDecodeIntElement = iDecodeIntElement2;
            i11 = i12;
            str = str6;
            str2 = str7;
            sentryItemType = sentryItemType2;
            str3 = str8;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C27961k0(i11, str, str2, sentryItemType, str3, iDecodeIntElement);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C27961k0 c27961k0 = (C27961k0) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C27961k0.f57082f;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c27961k0.f57083a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, C41897w2.f92051a, c27961k0.f57083a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c27961k0.f57084b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, c27961k0.f57084b);
        }
        interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 2, (InterfaceC44963p) lazyArr[2].getValue(), c27961k0.f57085c);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c27961k0.f57086d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, C41897w2.f92051a, c27961k0.f57086d);
        }
        interfaceC45829bBeginStructure.encodeIntElement(interfaceC45533f, 4, c27961k0.f57087e);
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
