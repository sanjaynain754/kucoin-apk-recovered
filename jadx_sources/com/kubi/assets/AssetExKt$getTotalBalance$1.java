package com.kubi.assets;

import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AssetEx.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.AssetExKt", m90122f = "AssetEx.kt", m90123i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 3}, m90124l = {176, 181, 185, 190}, m90125m = "getTotalBalance", m90126n = {"balanceCurrency", "api$delegate", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "balanceCurrency", "api$delegate", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "it", "$i$a$-let-AssetExKt$getTotalBalance$2", "subOverLimit", "balanceCurrency", "api$delegate", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "balanceCurrency", "api$delegate", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "it", "$i$a$-let-AssetExKt$getTotalBalance$3", "subOverLimit"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "I$0", "Z$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "I$0", "Z$0"})
public final class AssetExKt$getTotalBalance$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AssetExKt.m15124l(null, this);
    }

    public AssetExKt$getTotalBalance$1(Continuation<? super AssetExKt$getTotalBalance$1> continuation) {
        super(continuation);
    }
}
