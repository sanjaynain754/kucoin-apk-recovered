package com.kubi.monitor.firebase;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: FirebaseConfig.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90085k = 3, m90086mv = {1, 6, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.monitor.firebase.FirebaseConfig", m90122f = "FirebaseConfig.kt", m90123i = {}, m90124l = {59}, m90125m = "getAppInstanceId", m90126n = {}, m90127s = {})
public final class FirebaseConfig$getAppInstanceId$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FirebaseConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseConfig$getAppInstanceId$1(FirebaseConfig firebaseConfig, Continuation<? super FirebaseConfig$getAppInstanceId$1> continuation) {
        super(continuation);
        this.this$0 = firebaseConfig;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m42439a(this);
    }
}
