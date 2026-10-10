package com.sumsub.sns.core.data.model;

import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41897w2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Lazy;
import p852kotlin.Metadata;
import tg0.InterfaceC44949c;
import tg0.InterfaceC44951d;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"com/sumsub/sns/core/data/model/SNSTrackEvents.$serializer", "Lkotlinx/serialization/internal/m0;", "Lcom/sumsub/sns/core/data/model/SNSTrackEvents;", "<init>", "()V", "Lwg0/c;", "encoder", "value", "", "serialize", "(Lwg0/c;Lcom/sumsub/sns/core/data/model/SNSTrackEvents;)V", "Lkotlinx/serialization/encoding/b;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/b;)Lcom/sumsub/sns/core/data/model/SNSTrackEvents;", "", "Ltg0/d;", "childSerializers", "()[Ltg0/d;", "Lvg0/f;", "descriptor", "Lvg0/f;", "getDescriptor", "()Lvg0/f;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class SNSTrackEvents$$serializer implements InterfaceC41849m0<SNSTrackEvents> {

    @NotNull
    public static final SNSTrackEvents$$serializer INSTANCE;

    @NotNull
    private static final InterfaceC45533f descriptor;

    @Override // tg0.InterfaceC44949c
    @NotNull
    public final SNSTrackEvents deserialize(@NotNull InterfaceC41787b decoder) {
        int i11;
        String str;
        String str2;
        Map map;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = SNSTrackEvents.$childSerializers;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 0);
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, null);
            map = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, (InterfaceC44949c) lazyArr[2].getValue(), null);
            str = strDecodeStringElement2;
            i11 = 7;
            str2 = str3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            String str4 = null;
            Map map2 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(interfaceC45533f, 0);
                    i12 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, str4);
                    i12 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, (InterfaceC44949c) lazyArr[2].getValue(), map2);
                    i12 |= 4;
                }
            }
            i11 = i12;
            str = strDecodeStringElement;
            str2 = str4;
            map = map2;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new SNSTrackEvents(i11, str, str2, map, null);
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(@NotNull InterfaceC45830c encoder, @NotNull SNSTrackEvents value) {
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = encoder.beginStructure(interfaceC45533f);
        SNSTrackEvents.write$Self$idensic_mobile_sdk_aar_defaultRelease(value, interfaceC45829bBeginStructure, interfaceC45533f);
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    static {
        SNSTrackEvents$$serializer sNSTrackEvents$$serializer = new SNSTrackEvents$$serializer();
        INSTANCE = sNSTrackEvents$$serializer;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.core.data.model.SNSTrackEvents", sNSTrackEvents$$serializer, 3);
        c41826h2.m91581o("activity", false);
        c41826h2.m91581o("ts", true);
        c41826h2.m91581o("payload", true);
        descriptor = c41826h2;
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    private SNSTrackEvents$$serializer() {
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    @NotNull
    public final InterfaceC44951d<?>[] childSerializers() {
        Lazy[] lazyArr = SNSTrackEvents.$childSerializers;
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new InterfaceC44951d[]{c41897w2, C45236a.m99969u(c41897w2), C45236a.m99969u((InterfaceC44951d) lazyArr[2].getValue())};
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    @NotNull
    public InterfaceC44951d<?>[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
