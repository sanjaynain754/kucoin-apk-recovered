package com.kubi.safe.api.entity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SafeVerifyResult.kt */
/* JADX INFO: loaded from: classes40.dex */
@Metadata(m90083d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a4\u0010\u0005\u001a\u00020\u0001*\u00020\u00012 \b\u0002\u0010\u0002\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006H\u0086@¢\u0006\u0002\u0010\t\u001aJ\u0010\n\u001a\u00020\u0001*\u00020\u00012>\b\u0002\u0010\u0002\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\"\u000e\u0010\u0011\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"onSuccess", "Lcom/kubi/safe/api/entity/SafeVerifyResult;", "block", "Lkotlin/Function0;", "", "onVerify", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lcom/kubi/safe/api/entity/SafeVerifyResult;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onFail", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "code", "msg", "CODE_VERIFY", "CODE_SUCCESS", "CODE_CLOSE", "CODE_UN_KNOW", "CODE_20000", "CODE_20001", "CODE_20002", "CODE_30001", "MSG_VERIFY", "CODE_NETWORK_ERROR", "MSG_SUCCESS", "MSG_UN_KNOW", "MSG_CLOSE", "PATH_RISK_CHECK", "SafeApi_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SafeVerifyResultKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final SafeVerifyResult m56303a(@NotNull SafeVerifyResult safeVerifyResult, @Nullable Function2<? super String, ? super String, Unit> function2) {
        Intrinsics.checkNotNullParameter(safeVerifyResult, "<this>");
        if (!Intrinsics.areEqual(safeVerifyResult.getCode(), "200") && !Intrinsics.areEqual(safeVerifyResult.getCode(), "-789") && function2 != null) {
            function2.invoke(safeVerifyResult.getCode(), safeVerifyResult.getMsg());
        }
        return safeVerifyResult;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final SafeVerifyResult m56304b(@NotNull SafeVerifyResult safeVerifyResult, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(safeVerifyResult, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (Intrinsics.areEqual(safeVerifyResult.getCode(), "200")) {
            block.invoke();
        }
        return safeVerifyResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Object m56305c(@NotNull SafeVerifyResult safeVerifyResult, @Nullable Function1<? super Continuation<? super Unit>, ? extends Object> function1, @NotNull Continuation<? super SafeVerifyResult> continuation) {
        SafeVerifyResultKt$onVerify$1 safeVerifyResultKt$onVerify$1;
        if (continuation instanceof SafeVerifyResultKt$onVerify$1) {
            safeVerifyResultKt$onVerify$1 = (SafeVerifyResultKt$onVerify$1) continuation;
            int i11 = safeVerifyResultKt$onVerify$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                safeVerifyResultKt$onVerify$1.label = i11 - Integer.MIN_VALUE;
            } else {
                safeVerifyResultKt$onVerify$1 = new SafeVerifyResultKt$onVerify$1(continuation);
            }
        } else {
            safeVerifyResultKt$onVerify$1 = new SafeVerifyResultKt$onVerify$1(continuation);
        }
        Object obj = safeVerifyResultKt$onVerify$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = safeVerifyResultKt$onVerify$1.label;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SafeVerifyResult safeVerifyResult2 = (SafeVerifyResult) safeVerifyResultKt$onVerify$1.L$0;
            ResultKt.throwOnFailure(obj);
            return safeVerifyResult2;
        }
        ResultKt.throwOnFailure(obj);
        if (Intrinsics.areEqual(safeVerifyResult.getCode(), "-789") && function1 != null) {
            safeVerifyResultKt$onVerify$1.L$0 = safeVerifyResult;
            safeVerifyResultKt$onVerify$1.L$1 = SpillingKt.nullOutSpilledVariable(function1);
            safeVerifyResultKt$onVerify$1.label = 1;
            if (function1.invoke(safeVerifyResultKt$onVerify$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return safeVerifyResult;
    }
}
