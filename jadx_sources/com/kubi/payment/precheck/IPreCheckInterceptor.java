package com.kubi.payment.precheck;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.kubi.payment.precheck.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IPreCheckInterceptor.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/precheck/IPreCheckInterceptor;", "", "intercept", "Lcom/kubi/payment/precheck/PreCheckResult;", "param", "Lcom/kubi/payment/precheck/PreCheckRequest;", "(Lcom/kubi/payment/precheck/PreCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IPreCheckInterceptor {
    @Nullable
    /* JADX INFO: renamed from: a */
    Object mo47135a(@NotNull PreCheckRequest preCheckRequest, @NotNull Continuation<? super PreCheckResult> continuation);
}
