package com.kubi.homern.page;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: HomeRNRepository.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.homern.page.HomeRNRepository", m90122f = "HomeRNRepository.kt", m90123i = {}, m90124l = {17}, m90125m = "fetchLevelUpDialogInfo", m90126n = {}, m90127s = {})
public final class HomeRNRepository$fetchLevelUpDialogInfo$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeRNRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRNRepository$fetchLevelUpDialogInfo$1(HomeRNRepository homeRNRepository, Continuation<? super HomeRNRepository$fetchLevelUpDialogInfo$1> continuation) {
        super(continuation);
        this.this$0 = homeRNRepository;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m31249a(this);
    }
}
