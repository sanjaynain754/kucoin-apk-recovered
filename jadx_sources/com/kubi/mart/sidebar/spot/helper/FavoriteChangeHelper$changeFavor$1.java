package com.kubi.mart.sidebar.spot.helper;

import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: FavoriteChangeHelper.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mart.sidebar.spot.helper.FavoriteChangeHelper", m90122f = "FavoriteChangeHelper.kt", m90123i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2}, m90124l = {36, 42, 54}, m90125m = "changeFavor", m90126n = {"item", "onFinish", "loginState", "isFavorBefore", "item", "onFinish", "loginState", DbParams.KEY_CHANNEL_RESULT, "isFavorBefore", "item", "onFinish", "loginState", "isFavorBefore"}, m90127s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "Z$0"})
public final class FavoriteChangeHelper$changeFavor$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FavoriteChangeHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteChangeHelper$changeFavor$1(FavoriteChangeHelper favoriteChangeHelper, Continuation<? super FavoriteChangeHelper$changeFavor$1> continuation) {
        super(continuation);
        this.this$0 = favoriteChangeHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m41449b(null, null, this);
    }
}
