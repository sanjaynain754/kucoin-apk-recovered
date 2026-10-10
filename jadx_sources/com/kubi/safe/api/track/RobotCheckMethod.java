package com.kubi.safe.api.track;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: RobotCheckEvent.kt */
/* JADX INFO: loaded from: classes40.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/safe/api/track/RobotCheckMethod;", "", "<init>", "(Ljava/lang/String;I)V", "GEETEST", "HCAPTCHA", "IMAGE", "SafeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum RobotCheckMethod {
    GEETEST,
    HCAPTCHA,
    IMAGE;


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f46331c = EnumEntriesKt.enumEntries(m56341a());

    @NotNull
    public static EnumEntries<RobotCheckMethod> getEntries() {
        return f46331c;
    }
}
