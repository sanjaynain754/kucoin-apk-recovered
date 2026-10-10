package com.kubi.advert.service;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AdvertService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.advert.service.AdvertService", m90122f = "AdvertService.kt", m90123i = {0, 0, 0, 0}, m90124l = {48}, m90125m = "pageConfig", m90126n = {"businessLine", "code", "needErrorToast", "cacheTime"}, m90127s = {"L$0", "L$1", "Z$0", "J$0"})
public final class AdvertService$pageConfig$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdvertService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvertService$pageConfig$1(AdvertService advertService, Continuation<? super AdvertService$pageConfig$1> continuation) {
        super(continuation);
        this.this$0 = advertService;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo14769n(null, null, false, 0L, this);
    }
}
