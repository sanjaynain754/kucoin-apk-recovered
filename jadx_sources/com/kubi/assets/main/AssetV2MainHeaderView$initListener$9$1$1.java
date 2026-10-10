package com.kubi.assets.main;

import androidx.fragment.app.FragmentManager;
import com.kubi.assets.dialog.AssetHelperDialog;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetV2MainHeaderView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.main.AssetV2MainHeaderView$initListener$9$1$1", m90122f = "AssetV2MainHeaderView.kt", m90123i = {}, m90124l = {216}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AssetV2MainHeaderView$initListener$9$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ AssetV2MainFragment $this_apply;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetV2MainHeaderView$initListener$9$1$1(AssetV2MainFragment assetV2MainFragment, Continuation<? super AssetV2MainHeaderView$initListener$9$1$1> continuation) {
        super(1, continuation);
        this.$this_apply = assetV2MainFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AssetV2MainHeaderView$initListener$9$1$1(this.$this_apply, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((AssetV2MainHeaderView$initListener$9$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AssetHelperDialog assetHelperDialog = AssetHelperDialog.f16924a;
            FragmentManager childFragmentManager = this.$this_apply.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            this.label = 1;
            if (assetHelperDialog.m15981s(childFragmentManager, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
