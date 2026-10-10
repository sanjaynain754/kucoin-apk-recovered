package com.sumsub.sentry;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Date;
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

/* JADX INFO: renamed from: com.sumsub.sentry.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C27932d implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C27932d f57059a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    static {
        C27932d c27932d = new C27932d();
        f57059a = c27932d;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sentry.Breadcrumb", c27932d, 6);
        c41826h2.m91581o("timestamp", true);
        c41826h2.m91581o("message", true);
        c41826h2.m91581o("type", true);
        c41826h2.m91581o("data", true);
        c41826h2.m91581o("category", true);
        c41826h2.m91581o(FirebaseAnalytics.Param.LEVEL, true);
        descriptor = c41826h2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C27940f.f57062g;
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new InterfaceC44951d[]{lazyArr[0].getValue(), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), lazyArr[3].getValue(), C45236a.m99969u(c41897w2), C45236a.m99969u((InterfaceC44951d) lazyArr[5].getValue())};
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        int i11;
        Date date;
        String str;
        String str2;
        Map map;
        String str3;
        SentryLevel sentryLevel;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C27940f.f57062g;
        int i12 = 4;
        int i13 = 0;
        Date date2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Date date3 = (Date) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 0, (InterfaceC44949c) lazyArr[0].getValue(), null);
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41897w2, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41897w2, null);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 3, (InterfaceC44949c) lazyArr[3].getValue(), null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, c41897w2, null);
            sentryLevel = (SentryLevel) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, (InterfaceC44949c) lazyArr[5].getValue(), null);
            date = date3;
            str3 = str6;
            str2 = str5;
            i11 = 63;
            map = map2;
            str = str4;
        } else {
            int i14 = 1;
            int i15 = 0;
            String str7 = null;
            String str8 = null;
            Map map3 = null;
            String str9 = null;
            SentryLevel sentryLevel2 = null;
            while (i14 != 0) {
                int i16 = i13;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                switch (iDecodeElementIndex) {
                    case -1:
                        i13 = i16;
                        i14 = i13;
                        i12 = 4;
                        break;
                    case 0:
                        date2 = (Date) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, i16, (InterfaceC44949c) lazyArr[i16].getValue(), date2);
                        i15 |= 1;
                        i13 = i16;
                        i12 = 4;
                        break;
                    case 1:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, str7);
                        i15 |= 2;
                        i13 = i16;
                        break;
                    case 2:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, str8);
                        i15 |= 4;
                        i13 = i16;
                        break;
                    case 3:
                        map3 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 3, (InterfaceC44949c) lazyArr[3].getValue(), map3);
                        i15 |= 8;
                        i13 = i16;
                        break;
                    case 4:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i12, C41897w2.f92051a, str9);
                        i15 |= 16;
                        i13 = i16;
                        break;
                    case 5:
                        sentryLevel2 = (SentryLevel) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, (InterfaceC44949c) lazyArr[5].getValue(), sentryLevel2);
                        i15 |= 32;
                        i13 = i16;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i11 = i15;
            date = date2;
            str = str7;
            str2 = str8;
            map = map3;
            str3 = str9;
            sentryLevel = sentryLevel2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C27940f(i11, date, str, str2, map, str3, sentryLevel);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C27940f c27940f = (C27940f) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C27940f.f57062g;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || !Intrinsics.areEqual(c27940f.f57063a, AbstractC27972n.f57094b)) {
            interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 0, (InterfaceC44963p) lazyArr[0].getValue(), c27940f.f57063a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c27940f.f57064b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, c27940f.f57064b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c27940f.f57065c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, c27940f.f57065c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || !Intrinsics.areEqual(c27940f.f57066d, new ConcurrentHashMap())) {
            interfaceC45829bBeginStructure.encodeSerializableElement(interfaceC45533f, 3, (InterfaceC44963p) lazyArr[3].getValue(), c27940f.f57066d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c27940f.f57067e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, C41897w2.f92051a, c27940f.f57067e);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 5) || c27940f.f57068f != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 5, (InterfaceC44963p) lazyArr[5].getValue(), c27940f.f57068f);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
