package com.sumsub.sns.internal.features.data.model.common.remote;

import com.sumsub.sns.core.data.model.FlowActionType;
import com.sumsub.sns.core.data.model.FlowType;
import com.sumsub.sns.internal.core.data.serializer.C28531b;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29574l0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29586o0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.Q0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C29268Q0 implements InterfaceC41849m0 {

    /* JADX INFO: renamed from: a */
    public static final C29268Q0 f59260a;

    @NotNull
    private static final InterfaceC45533f descriptor;

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        String str;
        Map map;
        String str2;
        Map map2;
        C29449r0 c29449r0;
        Map map3;
        Map map4;
        C29385i4 c29385i4;
        C29252N c29252n;
        C29586o0 c29586o0;
        C29261O3 c29261o3;
        String str3;
        Map map5;
        Map map6;
        String str4;
        String str5;
        FlowType flowType;
        String str6;
        String str7;
        FlowActionType flowActionType;
        String str8;
        String str9;
        Map map7;
        Map map8;
        int i11;
        int i12;
        int i13;
        int i14;
        InterfaceC45533f interfaceC45533f = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = interfaceC41787b.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29277S0.f59268y;
        Map map9 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Map map10 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 0, (InterfaceC44949c) lazyArr[0].getValue(), null);
            C41897w2 c41897w2 = C41897w2.f92051a;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, c41897w2, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, c41897w2, null);
            FlowType flowType2 = (FlowType) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44949c) lazyArr[3].getValue(), null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, c41897w2, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, c41897w2, null);
            FlowActionType flowActionType2 = (FlowActionType) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, C28531b.f58082a, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, c41897w2, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, c41897w2, null);
            Map map11 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 9, (InterfaceC44949c) lazyArr[9].getValue(), null);
            Map map12 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 10, (InterfaceC44949c) lazyArr[10].getValue(), null);
            Map map13 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 11, (InterfaceC44949c) lazyArr[11].getValue(), null);
            Map map14 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 12, (InterfaceC44949c) lazyArr[12].getValue(), null);
            Map map15 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 13, (InterfaceC44949c) lazyArr[13].getValue(), null);
            C29252N c29252n2 = (C29252N) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 14, C29242L.f59234a, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 15, c41897w2, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 16, c41897w2, null);
            C29261O3 c29261o4 = (C29261O3) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 17, C29251M3.f59241a, null);
            C29449r0 c29449r1 = (C29449r0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 18, C29435p0.f59434a, null);
            C29586o0 c29586o1 = (C29586o0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 19, C29574l0.f59600a, null);
            C29385i4 c29385i5 = (C29385i4) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 20, C29345d4.f59361a, null);
            Map map16 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 21, (InterfaceC44949c) lazyArr[21].getValue(), null);
            Map map17 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 22, (InterfaceC44949c) lazyArr[22].getValue(), null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 23, c41897w2, null);
            map3 = map17;
            i11 = 16777215;
            map7 = map11;
            flowType = flowType2;
            str8 = str14;
            flowActionType = flowActionType2;
            str7 = str13;
            str6 = str12;
            str9 = str15;
            str2 = str16;
            str5 = str11;
            str4 = str10;
            map4 = map16;
            c29449r0 = c29449r1;
            c29261o3 = c29261o4;
            str3 = str17;
            c29252n = c29252n2;
            map = map10;
            map2 = map15;
            map5 = map14;
            map6 = map13;
            map8 = map12;
            c29586o0 = c29586o1;
            c29385i4 = c29385i5;
        } else {
            int i15 = 0;
            int i16 = 0;
            Map map18 = null;
            str = null;
            String str18 = null;
            Map map19 = null;
            Map map20 = null;
            C29385i4 c29385i6 = null;
            C29252N c29252n3 = null;
            Map map21 = null;
            C29586o0 c29586o2 = null;
            C29261O3 c29261o5 = null;
            Map map22 = null;
            String str19 = null;
            String str20 = null;
            FlowType flowType3 = null;
            String str21 = null;
            String str22 = null;
            FlowActionType flowActionType3 = null;
            String str23 = null;
            String str24 = null;
            Map map23 = null;
            int i17 = 9;
            int i18 = 3;
            int i19 = 1;
            Map map24 = null;
            C29449r0 c29449r2 = null;
            String str25 = null;
            while (i19 != 0) {
                Map map25 = map21;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                switch (iDecodeElementIndex) {
                    case -1:
                        map25 = map25;
                        i19 = i15;
                        i18 = 3;
                        i15 = i19;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 0:
                        map18 = map18;
                        Map map26 = map24;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        map25 = map25;
                        InterfaceC44949c interfaceC44949c = (InterfaceC44949c) lazyArr[i15].getValue();
                        i15 = i15;
                        str19 = str19;
                        map22 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i15, interfaceC44949c, map22);
                        map24 = map26;
                        i12 = 1;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 1:
                        map18 = map18;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        map25 = map25;
                        str20 = str20;
                        map24 = map24;
                        i15 = i15;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, str19);
                        i12 = 2;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 2:
                        map18 = map18;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        map25 = map25;
                        flowType3 = flowType3;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, str20);
                        map24 = map24;
                        i15 = i15;
                        str19 = str19;
                        i12 = 4;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 3:
                        map18 = map18;
                        Map map27 = map24;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        map25 = map25;
                        InterfaceC44949c interfaceC44949c2 = (InterfaceC44949c) lazyArr[i18].getValue();
                        int i21 = i18;
                        str21 = str21;
                        flowType3 = (FlowType) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i21, interfaceC44949c2, flowType3);
                        map24 = map27;
                        i15 = i15;
                        str19 = str19;
                        str20 = str20;
                        i12 = 8;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 4:
                        map18 = map18;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        map25 = map25;
                        str22 = str22;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 4, C41897w2.f92051a, str21);
                        map24 = map24;
                        i15 = i15;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        i12 = 16;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 5:
                        map18 = map18;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        map25 = map25;
                        flowActionType3 = flowActionType3;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 5, C41897w2.f92051a, str22);
                        i12 = 32;
                        map24 = map24;
                        i15 = i15;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 6:
                        map18 = map18;
                        str24 = str24;
                        map23 = map23;
                        map25 = map25;
                        str23 = str23;
                        flowActionType3 = (FlowActionType) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 6, C28531b.f58082a, flowActionType3);
                        i12 = 64;
                        map24 = map24;
                        i15 = i15;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 7:
                        map18 = map18;
                        map23 = map23;
                        map25 = map25;
                        str24 = str24;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 7, C41897w2.f92051a, str23);
                        i12 = 128;
                        map24 = map24;
                        i15 = i15;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 8:
                        map18 = map18;
                        map25 = map25;
                        map23 = map23;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 8, C41897w2.f92051a, str24);
                        i12 = 256;
                        map24 = map24;
                        i15 = i15;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 9:
                        map18 = map18;
                        Map map28 = map24;
                        InterfaceC44949c interfaceC44949c3 = (InterfaceC44949c) lazyArr[i17].getValue();
                        int i22 = i17;
                        map25 = map25;
                        map23 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, i22, interfaceC44949c3, map23);
                        i12 = 512;
                        map24 = map28;
                        i15 = i15;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 10:
                        map18 = map18;
                        map25 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 10, (InterfaceC44949c) lazyArr[10].getValue(), map25);
                        i12 = 1024;
                        map24 = map24;
                        i15 = i15;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 11:
                        map18 = map18;
                        map24 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 11, (InterfaceC44949c) lazyArr[11].getValue(), map24);
                        i12 = 2048;
                        i15 = i15;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        map25 = map25;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 12:
                        map18 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 12, (InterfaceC44949c) lazyArr[12].getValue(), map18);
                        i13 = 4096;
                        map18 = map18;
                        i12 = i13;
                        map24 = map24;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 13:
                        map9 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 13, (InterfaceC44949c) lazyArr[13].getValue(), map9);
                        i14 = 8192;
                        i12 = i14;
                        map24 = map24;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 14:
                        map24 = map24;
                        map18 = map18;
                        i12 = 16384;
                        c29252n3 = (C29252N) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 14, C29242L.f59234a, c29252n3);
                        map24 = map24;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 15:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 15, C41897w2.f92051a, str18);
                        i13 = 32768;
                        map18 = map18;
                        i12 = i13;
                        map24 = map24;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 16:
                        map24 = map24;
                        map18 = map18;
                        i12 = 65536;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 16, C41897w2.f92051a, str25);
                        map24 = map24;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 17:
                        map24 = map24;
                        map18 = map18;
                        i12 = 131072;
                        c29261o5 = (C29261O3) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 17, C29251M3.f59241a, c29261o5);
                        map24 = map24;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 18:
                        map24 = map24;
                        map18 = map18;
                        i12 = 262144;
                        c29449r2 = (C29449r0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 18, C29435p0.f59434a, c29449r2);
                        map24 = map24;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 19:
                        map24 = map24;
                        i14 = 524288;
                        c29586o2 = (C29586o0) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 19, C29574l0.f59600a, c29586o2);
                        i12 = i14;
                        map24 = map24;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 20:
                        map24 = map24;
                        map18 = map18;
                        i12 = 1048576;
                        c29385i6 = (C29385i4) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 20, C29345d4.f59361a, c29385i6);
                        map24 = map24;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 21:
                        map24 = map24;
                        Map map29 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 21, (InterfaceC44949c) lazyArr[21].getValue(), map20);
                        map18 = map18;
                        i12 = 2097152;
                        map20 = map29;
                        map24 = map24;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 22:
                        map19 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 22, (InterfaceC44949c) lazyArr[22].getValue(), map19);
                        i14 = 4194304;
                        i12 = i14;
                        map24 = map24;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    case 23:
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(interfaceC45533f, 23, C41897w2.f92051a, str);
                        i13 = 8388608;
                        map18 = map18;
                        i12 = i13;
                        map24 = map24;
                        i16 |= i12;
                        map18 = map18;
                        str19 = str19;
                        str20 = str20;
                        flowType3 = flowType3;
                        str21 = str21;
                        str22 = str22;
                        flowActionType3 = flowActionType3;
                        str23 = str23;
                        str24 = str24;
                        map23 = map23;
                        i18 = 3;
                        i15 = i15;
                        map21 = map25;
                        i17 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            map = map22;
            str2 = str18;
            map2 = map9;
            c29449r0 = c29449r2;
            map3 = map19;
            map4 = map20;
            c29385i4 = c29385i6;
            c29252n = c29252n3;
            c29586o0 = c29586o2;
            c29261o3 = c29261o5;
            str3 = str25;
            map5 = map18;
            map6 = map24;
            str4 = str19;
            str5 = str20;
            flowType = flowType3;
            str6 = str21;
            str7 = str22;
            flowActionType = flowActionType3;
            str8 = str23;
            str9 = str24;
            map7 = map23;
            map8 = map21;
            i11 = i16;
        }
        String str26 = str;
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new C29277S0(i11, map, str4, str5, flowType, str6, str7, flowActionType, str8, str9, map7, map8, map6, map5, map2, c29252n, str2, str3, c29261o3, c29449r0, c29586o0, c29385i4, map4, map3, str26);
    }

    static {
        C29268Q0 c29268q0 = new C29268Q0();
        f59260a = c29268q0;
        C41826h2 c41826h2 = new C41826h2("com.sumsub.sns.internal.features.data.model.common.remote.RemoteConfig", c29268q0, 24);
        c41826h2.m91581o("uiConf", true);
        c41826h2.m91581o("applicantId", true);
        c41826h2.m91581o("flowName", true);
        c41826h2.m91581o("flowType", true);
        c41826h2.m91581o("idDocSetType", true);
        c41826h2.m91581o(TUIConstants.TUIChat.INPUT_MORE_ACTION_ID, true);
        c41826h2.m91581o("actionType", true);
        c41826h2.m91581o("faceLivenessLic", true);
        c41826h2.m91581o("facemapPublicKey", true);
        c41826h2.m91581o("sdkDict", false);
        c41826h2.m91581o("documentsByCountries", true);
        c41826h2.m91581o("phoneCountryCodeWithMasks", true);
        c41826h2.m91581o("tinCountryInfo", true);
        c41826h2.m91581o("initMetadata", true);
        c41826h2.m91581o("eKycConfig", true);
        c41826h2.m91581o("verificationUrl", true);
        c41826h2.m91581o("accessToken", true);
        c41826h2.m91581o("sumsubIdConfig", true);
        c41826h2.m91581o("nfcConfiguration", true);
        c41826h2.m91581o("restriction", true);
        c41826h2.m91581o("videoIdentConfig", true);
        c41826h2.m91581o("staticSdkDict", true);
        c41826h2.m91581o("staticI18n", true);
        c41826h2.m91581o("staticBaseUrl", true);
        descriptor = c41826h2;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] childSerializers() {
        Lazy[] lazyArr = C29277S0.f59268y;
        InterfaceC44951d interfaceC44951dM99969u = C45236a.m99969u((InterfaceC44951d) lazyArr[0].getValue());
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new InterfaceC44951d[]{interfaceC44951dM99969u, C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u((InterfaceC44951d) lazyArr[3].getValue()), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(C28531b.f58082a), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u((InterfaceC44951d) lazyArr[9].getValue()), C45236a.m99969u((InterfaceC44951d) lazyArr[10].getValue()), C45236a.m99969u((InterfaceC44951d) lazyArr[11].getValue()), C45236a.m99969u((InterfaceC44951d) lazyArr[12].getValue()), C45236a.m99969u((InterfaceC44951d) lazyArr[13].getValue()), C45236a.m99969u(C29242L.f59234a), C45236a.m99969u(c41897w2), C45236a.m99969u(c41897w2), C45236a.m99969u(C29251M3.f59241a), C45236a.m99969u(C29435p0.f59434a), C45236a.m99969u(C29574l0.f59600a), C45236a.m99969u(C29345d4.f59361a), C45236a.m99969u((InterfaceC44951d) lazyArr[21].getValue()), C45236a.m99969u((InterfaceC44951d) lazyArr[22].getValue()), C45236a.m99969u(c41897w2)};
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29277S0 c29277s0 = (C29277S0) obj;
        InterfaceC45533f interfaceC45533f = descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = interfaceC45830c.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = C29277S0.f59268y;
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 0) || c29277s0.f59269a != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 0, (InterfaceC44963p) lazyArr[0].getValue(), c29277s0.f59269a);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 1) || c29277s0.f59270b != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 1, C41897w2.f92051a, c29277s0.f59270b);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 2) || c29277s0.f59271c != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 2, C41897w2.f92051a, c29277s0.f59271c);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 3) || c29277s0.f59272d != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 3, (InterfaceC44963p) lazyArr[3].getValue(), c29277s0.f59272d);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 4) || c29277s0.f59273e != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 4, C41897w2.f92051a, c29277s0.f59273e);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 5) || c29277s0.f59274f != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 5, C41897w2.f92051a, c29277s0.f59274f);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 6) || c29277s0.f59275g != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 6, C28531b.f58082a, c29277s0.f59275g);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 7) || c29277s0.f59276h != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 7, C41897w2.f92051a, c29277s0.f59276h);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 8) || c29277s0.f59277i != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 8, C41897w2.f92051a, c29277s0.f59277i);
        }
        interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 9, (InterfaceC44963p) lazyArr[9].getValue(), c29277s0.f59278j);
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 10) || c29277s0.f59279k != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 10, (InterfaceC44963p) lazyArr[10].getValue(), c29277s0.f59279k);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 11) || c29277s0.f59280l != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 11, (InterfaceC44963p) lazyArr[11].getValue(), c29277s0.f59280l);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 12) || c29277s0.f59281m != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 12, (InterfaceC44963p) lazyArr[12].getValue(), c29277s0.f59281m);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 13) || c29277s0.f59282n != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 13, (InterfaceC44963p) lazyArr[13].getValue(), c29277s0.f59282n);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 14) || c29277s0.f59283o != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 14, C29242L.f59234a, c29277s0.f59283o);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 15) || c29277s0.f59284p != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 15, C41897w2.f92051a, c29277s0.f59284p);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 16) || c29277s0.f59285q != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 16, C41897w2.f92051a, c29277s0.f59285q);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 17) || c29277s0.f59286r != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 17, C29251M3.f59241a, c29277s0.f59286r);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 18) || c29277s0.f59287s != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 18, C29435p0.f59434a, c29277s0.f59287s);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 19) || c29277s0.f59288t != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 19, C29574l0.f59600a, c29277s0.f59288t);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 20) || c29277s0.f59289u != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 20, C29345d4.f59361a, c29277s0.f59289u);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 21) || c29277s0.f59290v != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 21, (InterfaceC44963p) lazyArr[21].getValue(), c29277s0.f59290v);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 22) || c29277s0.f59291w != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 22, (InterfaceC44963p) lazyArr[22].getValue(), c29277s0.f59291w);
        }
        if (interfaceC45829bBeginStructure.shouldEncodeElementDefault(interfaceC45533f, 23) || c29277s0.f59292x != null) {
            interfaceC45829bBeginStructure.encodeNullableSerializableElement(interfaceC45533f, 23, C41897w2.f92051a, c29277s0.f59292x);
        }
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    public final InterfaceC44951d[] typeParametersSerializers() {
        return InterfaceC41849m0.a.m91640a(this);
    }
}
