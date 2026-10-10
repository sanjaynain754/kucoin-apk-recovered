package com.kubi.user.track;

import com.tencent.imsdk.BaseConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: UCenterTrackEnum.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/user/track/UCenterFailReason;", "", "errorCode", "", "<init>", "(Ljava/lang/String;II)V", "getErrorCode", "()I", "GT_CANCEL", "HC_INIT", "HC_CANCEL", "HC_TIME_OUT", "IMAGE_CANCEL", "AUTH_CANCEL", "AUTH_TIME_OUT", "CHECKCODE_CANCEL", "CHECKCODE_UNAVAILABLE_GA", "CHECKCODE_UNAVAILABLE_EMAIL", "CHECKCODE_UNAVAILABLE_SMS", "EXT_AUTH_FAILED", "EXT_BIND_CANCEL", "EXT_CREATE_CANCEL", "EXT_CREATE_CODE_CANCEL", "EXT_BIND_PWD_CANCEL", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum UCenterFailReason {
    GT_CANCEL(BaseConstants.ERR_SVR_SSO_D2_EXPIRED),
    HC_INIT(-10002),
    HC_CANCEL(BaseConstants.ERR_SVR_SSO_A2_UP_INVALID),
    HC_TIME_OUT(BaseConstants.ERR_SVR_SSO_A2_DOWN_INVALID),
    IMAGE_CANCEL(BaseConstants.ERR_SVR_SSO_EMPTY_KEY),
    AUTH_CANCEL(BaseConstants.ERR_SVR_SSO_UIN_INVALID),
    AUTH_TIME_OUT(BaseConstants.ERR_SVR_SSO_VCODE_TIMEOUT),
    CHECKCODE_CANCEL(BaseConstants.ERR_SVR_SSO_NO_IMEI_AND_A2),
    CHECKCODE_UNAVAILABLE_GA(BaseConstants.ERR_SVR_SSO_COOKIE_INVALID),
    CHECKCODE_UNAVAILABLE_EMAIL(-10010),
    CHECKCODE_UNAVAILABLE_SMS(-10011),
    EXT_AUTH_FAILED(-10012),
    EXT_BIND_CANCEL(-10013),
    EXT_CREATE_CANCEL(-10014),
    EXT_CREATE_CODE_CANCEL(-10015),
    EXT_BIND_PWD_CANCEL(-10016);


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f53882c = EnumEntriesKt.enumEntries(m65882a());
    private final int errorCode;

    @NotNull
    public static EnumEntries<UCenterFailReason> getEntries() {
        return f53882c;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    UCenterFailReason(int i11) {
        this.errorCode = i11;
    }
}
