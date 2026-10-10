package com.kubi.p110rn.modules;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: RNH5InterActionHelper.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"EVENT_NAME_FROM_RN", "", "EVENT_NAME_FROM_H5", "getEVENT_NAME_FROM_H5$annotations", "()V", "EVENT_NAME_ON_SHOW", "EVENT_NAME_ON_HIDE", "EVENT_LOGIN_SUCCESS", "EVENT_DID_APPEAR", "EVENT_DID_DISAPPEAR", "BReactNativeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RNH5InterActionHelperKt {

    @NotNull
    public static final String EVENT_DID_APPEAR = "containerDidAppear";

    @NotNull
    public static final String EVENT_DID_DISAPPEAR = "containerDidDisappear";

    @NotNull
    public static final String EVENT_LOGIN_SUCCESS = "onLoginSuccess";

    @NotNull
    public static final String EVENT_NAME_FROM_H5 = "onInterCommunicateFromH5";

    @NotNull
    public static final String EVENT_NAME_FROM_RN = "onInterCommunicateFromRN";

    @NotNull
    public static final String EVENT_NAME_ON_HIDE = "onHide";

    @NotNull
    public static final String EVENT_NAME_ON_SHOW = "onShow";

    @Deprecated(message = "由于双端实现不一致，确认过web端并未使用该api，因此该方法废弃，禁止使用，等后续重构新增方法实现该需求")
    public static /* synthetic */ void getEVENT_NAME_FROM_H5$annotations() {
    }
}
