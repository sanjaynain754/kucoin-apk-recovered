package com.kubi.p110rn.core;

import org.jetbrains.annotations.NotNull;
import p694vk.C45590s;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: ReactConst.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u001b\u0010\u0013\u001a\u00020\u00148@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m90084d2 = {"LOAD_TYPE_LOCAL", "", "LOAD_TYPE_PREPARE", "LOAD_TYPE_REMOTE", "LOAD_TYPE_REMOTE_AND_PREPARE", "CODE_SUCCESS", "CODE_SUCCESS_BY_PREPARE", "CODE_SUCCESS_BY_REMOTE", "CODE_SUCCESS_BY_REMOTE_AND_PREPARE", "CODE_ENGINE_OFF", "CODE_INIT_PARAM_ERROR", "CODE_ENGINE_LOAD_FAILED", "CODE_BUNDLE_IS_DISABLE", "CODE_BUNDLE_NOT_FOUND", "CODE_BUNDLE_LOAD_FAILED", "CODE_BASE_MODULE_NOT_FOUND", "CODE_BASE_MODULE_LOAD_FAILED", "CODE_JS_EXCEPTION", "CODE_RENDER_TIMEOUT", "developerSupport", "", "getDeveloperSupport", "()Z", "developerSupport$delegate", "Lkotlin/Lazy;", "BReactNativeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ReactConstKt {
    public static final int CODE_BASE_MODULE_LOAD_FAILED = 405;
    public static final int CODE_BASE_MODULE_NOT_FOUND = 405;
    public static final int CODE_BUNDLE_IS_DISABLE = 303;
    public static final int CODE_BUNDLE_LOAD_FAILED = 401;
    public static final int CODE_BUNDLE_NOT_FOUND = 400;
    public static final int CODE_ENGINE_LOAD_FAILED = 302;
    public static final int CODE_ENGINE_OFF = 300;
    public static final int CODE_INIT_PARAM_ERROR = 301;
    public static final int CODE_JS_EXCEPTION = 500;
    public static final int CODE_RENDER_TIMEOUT = -210000;
    public static final int CODE_SUCCESS = 200;
    public static final int CODE_SUCCESS_BY_PREPARE = 201;
    public static final int CODE_SUCCESS_BY_REMOTE = 202;
    public static final int CODE_SUCCESS_BY_REMOTE_AND_PREPARE = 203;
    public static final int LOAD_TYPE_LOCAL = 0;
    public static final int LOAD_TYPE_PREPARE = 1;
    public static final int LOAD_TYPE_REMOTE = 2;
    public static final int LOAD_TYPE_REMOTE_AND_PREPARE = 3;

    @NotNull
    private static final Lazy developerSupport$delegate = LazyKt.lazy(new Function0() { // from class: com.kubi.rn.core.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(ReactConstKt.developerSupport_delegate$lambda$0());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean developerSupport_delegate$lambda$0() {
        return C45590s.f102687a.m100666Q();
    }

    public static final boolean getDeveloperSupport() {
        return ((Boolean) developerSupport$delegate.getValue()).booleanValue();
    }
}
