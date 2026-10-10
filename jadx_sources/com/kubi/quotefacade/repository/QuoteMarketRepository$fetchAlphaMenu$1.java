package com.kubi.quotefacade.repository;

import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: QuoteMarketRepository.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.repository.QuoteMarketRepository", m90122f = "QuoteMarketRepository.kt", m90123i = {0}, m90124l = {TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS}, m90125m = "fetchAlphaMenu", m90126n = {"excludes"}, m90127s = {"L$0"})
public final class QuoteMarketRepository$fetchAlphaMenu$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ QuoteMarketRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteMarketRepository$fetchAlphaMenu$1(QuoteMarketRepository quoteMarketRepository, Continuation<? super QuoteMarketRepository$fetchAlphaMenu$1> continuation) {
        super(continuation);
        this.this$0 = quoteMarketRepository;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m52997l(null, this);
    }
}
