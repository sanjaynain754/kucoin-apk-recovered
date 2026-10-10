package com.sumsub.sns.internal.features.data.model.common.remote;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.AbstractC33293d;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import tg0.InterfaceC44951d;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.M2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29250M2 {
    /* JADX INFO: renamed from: a */
    public final C29226H3 m69815a(AbstractC46162a abstractC46162a, String str) {
        C29309Y2 c29309y2;
        try {
            if (StringsKt.isBlank(str)) {
                return new C29270Q2();
            }
            abstractC46162a.getSerializersModule();
            C29246L3 c29246l3 = (C29246L3) abstractC46162a.mo99408a(C29246L3.Companion.serializer(), str);
            String str2 = c29246l3.f59237a;
            if (Intrinsics.areEqual(str2, SNSMessage$ServerMessage$Type.CANCEL_VERIFY_MOBILE_PHONE_TAN.getType())) {
                return new C29245L2();
            }
            if (Intrinsics.areEqual(str2, SNSMessage$ServerMessage$Type.VERIFY_MOBILE_PHONE_TAN.getType())) {
                return new C29206D3();
            }
            if (Intrinsics.areEqual(str2, SNSMessage$ServerMessage$Type.STEP_CHANGE.getType())) {
                JsonElement jsonElement = c29246l3.f59238b;
                return new C29644t3(jsonElement != null ? (C29637s3) abstractC46162a.m101763c(C29637s3.Companion.serializer(), jsonElement) : null);
            }
            if (Intrinsics.areEqual(str2, SNSMessage$ServerMessage$Type.COMPLETED.getType())) {
                return new C29265P2();
            }
            if (Intrinsics.areEqual(str2, SNSMessage$ServerMessage$Type.MODERATOR_NAME.getType())) {
                JsonElement jsonElement2 = c29246l3.f59238b;
                if (jsonElement2 != null && (c29309y2 = (C29309Y2) abstractC46162a.m101763c(C29309Y2.Companion.serializer(), jsonElement2)) != null) {
                    return new C29314Z2(c29309y2);
                }
                return new C29672x3(c29246l3.f59237a);
            }
            if (Intrinsics.areEqual(str2, SNSMessage$ServerMessage$Type.READY_FOR_SCREENSHOT.getType())) {
                JsonElement jsonElement3 = c29246l3.f59238b;
                return new C29336c3(jsonElement3 != null ? (C29424n3) abstractC46162a.m101763c(C29424n3.Companion.serializer(), jsonElement3) : null);
            }
            if (Intrinsics.areEqual(str2, SNSMessage$ServerMessage$Type.MAKE_SCREENSHOT.getType())) {
                JsonElement jsonElement4 = c29246l3.f59238b;
                return new C29284T2(jsonElement4 != null ? (C29424n3) abstractC46162a.m101763c(C29424n3.Companion.serializer(), jsonElement4) : null);
            }
            if (Intrinsics.areEqual(str2, SNSMessage$ServerMessage$Type.CANCEL_SCREENSHOT.getType())) {
                return new C29230I2();
            }
            if (Intrinsics.areEqual(str2, SNSMessage$ServerMessage$Type.UPDATE_REQUIRED_ID_DOCS.getType())) {
                return new C29191A3();
            }
            if (Intrinsics.areEqual(str2, SNSMessage$ServerMessage$Type.APPLICANT_LEVEL_CHANGE.getType())) {
                JsonElement jsonElement5 = c29246l3.f59238b;
                return new C29643t2(jsonElement5 != null ? (C29636s2) abstractC46162a.m101763c(C29636s2.Companion.serializer(), jsonElement5) : null);
            }
            if (Intrinsics.areEqual(str2, SNSMessage$ServerMessage$Type.APPLICANT_STATUS_CHANGE.getType())) {
                JsonElement jsonElement6 = c29246l3.f59238b;
                return new C29215F2(jsonElement6 != null ? (C29210E2) abstractC46162a.m101763c(C29210E2.Companion.serializer(), jsonElement6) : null);
            }
            if (Intrinsics.areEqual(str2, SNSMessage$ServerMessage$Type.APPLICANT_ACTION_STATUS_CHANGE.getType())) {
                JsonElement jsonElement7 = c29246l3.f59238b;
                return new C29375h2(jsonElement7 != null ? (C29367g2) abstractC46162a.m101763c(C29367g2.Companion.serializer(), jsonElement7) : null);
            }
            if (Intrinsics.areEqual(str2, SNSMessage$ServerMessage$Type.WELCOME.getType())) {
                return new C29221G3();
            }
            if (Intrinsics.areEqual(str2, SNSMessage$ServerMessage$Type.ADDED_ID_DOC.getType())) {
                JsonElement jsonElement8 = c29246l3.f59238b;
                return new C29327b2(jsonElement8 != null ? (C29319a2) abstractC46162a.m101763c(C29319a2.Companion.serializer(), jsonElement8) : null);
            }
            if (Intrinsics.areEqual(str2, SNSMessage$ServerMessage$Type.APPLICANT_IMAGE_REVIEWED.getType())) {
                JsonElement jsonElement9 = c29246l3.f59238b;
                return new C29423n2(jsonElement9 != null ? (C29415m2) abstractC46162a.m101763c(C29415m2.Companion.serializer(), jsonElement9) : null);
            }
            if (Intrinsics.areEqual(str2, SNSMessage$ServerMessage$Type.APPLICANT_QUEUE_STATUS.getType())) {
                JsonElement jsonElement10 = c29246l3.f59238b;
                return new C29685z2(jsonElement10 != null ? (C29678y2) abstractC46162a.m101763c(C29678y2.Companion.serializer(), jsonElement10) : null);
            }
            if (Intrinsics.areEqual(str2, SNSMessage$ServerMessage$Type.REDIRECT_COMPLETED.getType())) {
                JsonElement jsonElement11 = c29246l3.f59238b;
                return new C29384i3(jsonElement11 != null ? (C29376h3) abstractC46162a.m101763c(C29376h3.Companion.serializer(), jsonElement11) : null);
            }
            Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "unknown message: " + str, null, 4, null);
            return new C29672x3(c29246l3.f59237a);
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a(AbstractC33294e.m71624a(this), "Can't parse server message=" + str, e11);
            return new C29672x3(null);
        }
    }

    @NotNull
    public final InterfaceC44951d<C29226H3> serializer() {
        return C29293V1.f59307a;
    }
}
