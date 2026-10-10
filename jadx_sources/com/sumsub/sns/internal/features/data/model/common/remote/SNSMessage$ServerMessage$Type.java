package com.sumsub.sns.internal.features.data.model.common.remote;

import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.C41829i0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, m90084d2 = {"com/sumsub/sns/internal/features/data/model/common/remote/SNSMessage$ServerMessage$Type", "", "Lcom/sumsub/sns/internal/features/data/model/common/remote/SNSMessage$ServerMessage$Type;", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Companion", "com/sumsub/sns/internal/features/data/model/common/remote/u3", "MODERATOR_NAME", "COMPLETED", "READY_FOR_SCREENSHOT", "MAKE_SCREENSHOT", "CANCEL_SCREENSHOT", "UPDATE_REQUIRED_ID_DOCS", "STEP_CHANGE", "VERIFY_MOBILE_PHONE_TAN", "CANCEL_VERIFY_MOBILE_PHONE_TAN", "APPLICANT_STATUS_CHANGE", "APPLICANT_ACTION_STATUS_CHANGE", "APPLICANT_LEVEL_CHANGE", "ADDED_ID_DOC", "WELCOME", "APPLICANT_IMAGE_REVIEWED", "APPLICANT_QUEUE_STATUS", "REDIRECT_COMPLETED", "UNKNOWN", "EMPTY", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@InterfaceC44962o
public enum SNSMessage$ServerMessage$Type {
    MODERATOR_NAME("moderatorName"),
    COMPLETED("completed"),
    READY_FOR_SCREENSHOT("readyForScreenshot"),
    MAKE_SCREENSHOT("makeScreenshot"),
    CANCEL_SCREENSHOT("cancelScreenshot"),
    UPDATE_REQUIRED_ID_DOCS("updateRequiredIdDocs"),
    STEP_CHANGE("stepChange"),
    VERIFY_MOBILE_PHONE_TAN("verifyMobilePhoneTan"),
    CANCEL_VERIFY_MOBILE_PHONE_TAN("cancelVerifyMobilePhoneTan"),
    APPLICANT_STATUS_CHANGE("applicantStatusChange"),
    APPLICANT_ACTION_STATUS_CHANGE("applicantActionStatusChange"),
    APPLICANT_LEVEL_CHANGE("applicantLevelChange"),
    ADDED_ID_DOC("addedIdDoc"),
    WELCOME("welcome"),
    APPLICANT_IMAGE_REVIEWED("applicantImageReviewed"),
    APPLICANT_QUEUE_STATUS("applicantQueueStatus"),
    REDIRECT_COMPLETED("redirectCompleted"),
    UNKNOWN("unknown"),
    EMPTY("empty");


    @NotNull
    private final String type;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static final C29651u3 Companion = new C29651u3();

    @NotNull
    private static final Lazy<InterfaceC44951d<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.n5
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SNSMessage$ServerMessage$Type._init_$_anonymous_();
        }
    });

    @NotNull
    public static EnumEntries<SNSMessage$ServerMessage$Type> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    SNSMessage$ServerMessage$Type(String str) {
        this.type = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC44951d _init_$_anonymous_() {
        return C41829i0.m91591a("com.sumsub.sns.internal.features.data.model.common.remote.SNSMessage.ServerMessage.Type", values(), new String[]{"moderatorName", "completed", "readyForScreenshot", "makeScreenshot", "cancelScreenshot", "updateRequiredIdDocs", "stepChange", "verifyMobilePhoneTan", "cancelVerifyMobilePhoneTan", "applicantStatusChange", "applicantActionStatusChange", "applicantLevelChange", "addedIdDoc", "welcome", "applicantImageReviewed", "applicantQueueStatus", "redirectCompleted", "unknown", "empty"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, null);
    }
}
