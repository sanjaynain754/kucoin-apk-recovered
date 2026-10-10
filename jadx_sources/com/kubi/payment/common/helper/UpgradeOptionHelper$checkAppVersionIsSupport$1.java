package com.kubi.payment.common.helper;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: UpgradeOptionHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.common.helper.UpgradeOptionHelper", m90122f = "UpgradeOptionHelper.kt", m90123i = {0, 0}, m90124l = {35}, m90125m = "checkAppVersionIsSupport", m90126n = {"request", "manage"}, m90127s = {"L$0", "L$1"})
public final class UpgradeOptionHelper$checkAppVersionIsSupport$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpgradeOptionHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeOptionHelper$checkAppVersionIsSupport$1(UpgradeOptionHelper upgradeOptionHelper, Continuation<? super UpgradeOptionHelper$checkAppVersionIsSupport$1> continuation) {
        super(continuation);
        this.this$0 = upgradeOptionHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m46258b(null, null, this);
    }
}
