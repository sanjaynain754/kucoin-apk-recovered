package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1iSDK implements AFj1kSDK {
    @Override // com.appsflyer.internal.AFj1kSDK
    @NotNull
    public final String getCurrencyIso4217Code() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Intrinsics.checkNotNull(obj, "");
            objM103844constructorimpl = Result.m103844constructorimpl((String) obj);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return (String) (Result.m103850isFailureimpl(objM103844constructorimpl) ? "" : objM103844constructorimpl);
    }
}
