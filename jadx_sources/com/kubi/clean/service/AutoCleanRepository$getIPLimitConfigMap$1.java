package com.kubi.clean.service;

import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AutoCleanRepository.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.clean.service.AutoCleanRepository", m90122f = "AutoCleanRepository.kt", m90123i = {0, 0, 0}, m90124l = {86}, m90125m = "getIPLimitConfigMap", m90126n = {"bizTypeList", DropFrameTable.COLUMN_SCENE, "successCallBack"}, m90127s = {"L$0", "L$1", "L$2"})
public final class AutoCleanRepository$getIPLimitConfigMap$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AutoCleanRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoCleanRepository$getIPLimitConfigMap$1(AutoCleanRepository autoCleanRepository, Continuation<? super AutoCleanRepository$getIPLimitConfigMap$1> continuation) {
        super(continuation);
        this.this$0 = autoCleanRepository;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m20411c(null, null, null, this);
    }
}
