package com.kubi.p110rn.core;

import com.google.firebase.messaging.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: ReactInstanceHelper.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u001a$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"KRN_BUNDLE_LOAD_LOG_PREFIX", "", "REACT_INSTANCE_HELPER_TAG", "logKrnBundleLoadError", "", "tag", "message", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "BReactNativeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nReactInstanceHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactInstanceHelper.kt\ncom/kubi/rn/core/ReactInstanceHelperKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1#2:208\n*E\n"})
public final class ReactInstanceHelperKt {

    @NotNull
    public static final String KRN_BUNDLE_LOAD_LOG_PREFIX = "KRN_BUNDLE_LOAD";

    @NotNull
    private static final String REACT_INSTANCE_HELPER_TAG = "ReactInstanceHelper";

    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    public static final void logKrnBundleLoadError(@NotNull String tag, @NotNull String message, @Nullable Throwable th2) {
        String str;
        String message2;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            Result.Companion companion = Result.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(message);
            if (th2 == null || (message2 = th2.getMessage()) == null) {
                str = "";
            } else {
                str = ' ' + message2;
                if (str == null) {
                    str = "";
                }
            }
            sb2.append(str);
            C44128b.m97261e(tag, sb2.toString());
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th3));
        }
    }

    public static /* synthetic */ void logKrnBundleLoadError$default(String str, String str2, Throwable th2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        logKrnBundleLoadError(str, str2, th2);
    }
}
