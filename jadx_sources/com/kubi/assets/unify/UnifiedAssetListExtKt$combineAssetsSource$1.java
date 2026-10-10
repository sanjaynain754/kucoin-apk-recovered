package com.kubi.assets.unify;

import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: UnifiedAssetListExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.unify.UnifiedAssetListExtKt", m90122f = "UnifiedAssetListExt.kt", m90123i = {0, 0}, m90124l = {28}, m90125m = "combineAssetsSource", m90126n = {"$this$combineAssetsSource", TUIConstants.TUIChat.CALL_BACK}, m90127s = {"L$0", "L$1"})
public final class UnifiedAssetListExtKt$combineAssetsSource$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UnifiedAssetListExtKt.m19719e(null, null, this);
    }

    public UnifiedAssetListExtKt$combineAssetsSource$1(Continuation<? super UnifiedAssetListExtKt$combineAssetsSource$1> continuation) {
        super(continuation);
    }
}
