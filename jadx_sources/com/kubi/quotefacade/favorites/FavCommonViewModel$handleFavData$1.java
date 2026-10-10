package com.kubi.quotefacade.favorites;

import com.tencent.thumbplayer.tcmedia.core.common.TPPixelFormat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: FavCommonViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.FavCommonViewModel", m90122f = "FavCommonViewModel.kt", m90123i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4}, m90124l = {141, 147, TPPixelFormat.TP_PIX_FMT_MEDIACODEC, 183, 197}, m90125m = "handleFavData", m90126n = {"favType", "needSubscribe", "favType", "resultList", "needSubscribe", "favType", "resultList", "tradeBeanMapper", "needSubscribe", "favType", "resultList", "futureTradeBeanMapper", "includeMarket", "needSubscribe", "favType", "resultList", "tradeBeanMapper", "needSubscribe"}, m90127s = {"L$0", "Z$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "Z$0"})
public final class FavCommonViewModel$handleFavData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FavCommonViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavCommonViewModel$handleFavData$1(FavCommonViewModel favCommonViewModel, Continuation<? super FavCommonViewModel$handleFavData$1> continuation) {
        super(continuation);
        this.this$0 = favCommonViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m51322J(null, false, this);
    }
}
