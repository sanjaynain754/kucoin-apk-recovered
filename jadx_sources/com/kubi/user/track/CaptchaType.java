package com.kubi.user.track;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: CommonTrackEnum.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/user/track/CaptchaType;", "", "<init>", "(Ljava/lang/String;I)V", "GEETEST", "HCAPTCHA", "IMAGE", "UNKNOWN", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum CaptchaType {
    GEETEST,
    HCAPTCHA,
    IMAGE,
    UNKNOWN;


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f53872c = EnumEntriesKt.enumEntries(m65877a());

    @NotNull
    public static EnumEntries<CaptchaType> getEntries() {
        return f53872c;
    }
}
