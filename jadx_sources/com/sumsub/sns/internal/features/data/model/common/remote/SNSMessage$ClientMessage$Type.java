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
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m90084d2 = {"com/sumsub/sns/internal/features/data/model/common/remote/SNSMessage$ClientMessage$Type", "", "Lcom/sumsub/sns/internal/features/data/model/common/remote/SNSMessage$ClientMessage$Type;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "com/sumsub/sns/internal/features/data/model/common/remote/D1", "USER_VISIBILITY_STATE", "SCREENSHOT_MADE", "COULD_NOT_MAKE_SCREENSHOT", "VERIFY_MOBILE_PHONE_TAN_SUCCESS", "CANCEL_VERIFY_MOBILE_PHONE_TAN", "VERIFY_MOBILE_PHONE_TAN_REQUESTED", "VERIFY_MOBILE_PHONE_TAN_RETRY_CODE", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@InterfaceC44962o
public enum SNSMessage$ClientMessage$Type {
    USER_VISIBILITY_STATE("userVisibilityState"),
    SCREENSHOT_MADE("screenshotMade"),
    COULD_NOT_MAKE_SCREENSHOT("couldNotMakeScreenshot"),
    VERIFY_MOBILE_PHONE_TAN_SUCCESS("verifyMobilePhoneTanSuccess"),
    CANCEL_VERIFY_MOBILE_PHONE_TAN("cancelVerifyMobilePhoneTan"),
    VERIFY_MOBILE_PHONE_TAN_REQUESTED("verifyMobilePhoneTanRequested"),
    VERIFY_MOBILE_PHONE_TAN_RETRY_CODE("verifyMobilePhoneTanRetryCode");


    @NotNull
    private final String value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static final C29204D1 Companion = new C29204D1();

    @NotNull
    private static final Lazy<InterfaceC44951d<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.k5
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SNSMessage$ClientMessage$Type._init_$_anonymous_();
        }
    });

    @NotNull
    public static EnumEntries<SNSMessage$ClientMessage$Type> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    SNSMessage$ClientMessage$Type(String str) {
        this.value = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC44951d _init_$_anonymous_() {
        return C41829i0.m91591a("com.sumsub.sns.internal.features.data.model.common.remote.SNSMessage.ClientMessage.Type", values(), new String[]{"userVisibilityState", "screenshotMade", "couldNotMakeScreenshot", "verifyMobilePhoneTanSuccess", "cancelVerifyMobilePhoneTan", "verifyMobilePhoneTanRequested", "verifyMobilePhoneTanRetryCode"}, new Annotation[][]{null, null, null, null, null, null, null}, null);
    }
}
