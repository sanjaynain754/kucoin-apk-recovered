package com.kubi.user.track;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: SignupV3Track.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/user/track/SignupDescription;", "", "<init>", "(Ljava/lang/String;I)V", "ACCOUNT_EXIST", "CAPTCHA_INIT", "CAPTCHA_HANDLE", "CAPTCHA_SUBMIT", "CAPTCHA_CANCEL", "VALIDATION_SEND", "VALIDATION_UNAVALIABLE", "VALIDATION_CANCEL", "VALIDATION_SUBMIT", "BIND_EMAIL_CANCEL", "REGISTER_PASSWORD_CANCEL", "REGISTER_FINISH", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum SignupDescription {
    ACCOUNT_EXIST,
    CAPTCHA_INIT,
    CAPTCHA_HANDLE,
    CAPTCHA_SUBMIT,
    CAPTCHA_CANCEL,
    VALIDATION_SEND,
    VALIDATION_UNAVALIABLE,
    VALIDATION_CANCEL,
    VALIDATION_SUBMIT,
    BIND_EMAIL_CANCEL,
    REGISTER_PASSWORD_CANCEL,
    REGISTER_FINISH;


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f53878c = EnumEntriesKt.enumEntries(m65880a());

    @NotNull
    public static EnumEntries<SignupDescription> getEntries() {
        return f53878c;
    }
}
