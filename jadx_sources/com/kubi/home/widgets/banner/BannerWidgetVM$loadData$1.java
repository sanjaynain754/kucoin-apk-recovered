package com.kubi.home.widgets.banner;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: BannerWidgetVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.widgets.banner.BannerWidgetVM", m90122f = "BannerWidgetVM.kt", m90123i = {0, 1, 1, 1}, m90124l = {31, 35}, m90125m = "loadData", m90126n = {"forceRefresh", "cacheTime", "forceRefresh", "startTime"}, m90127s = {"Z$0", "L$0", "Z$0", "J$0"})
public final class BannerWidgetVM$loadData$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BannerWidgetVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerWidgetVM$loadData$1(BannerWidgetVM bannerWidgetVM, Continuation<? super BannerWidgetVM$loadData$1> continuation) {
        super(continuation);
        this.this$0 = bannerWidgetVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m31100o(false, this);
    }
}
