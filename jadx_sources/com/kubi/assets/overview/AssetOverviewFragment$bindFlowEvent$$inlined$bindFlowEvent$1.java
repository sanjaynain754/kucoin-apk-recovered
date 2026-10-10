package com.kubi.assets.overview;

import com.kubi.assets.view.AssetEmptyView;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43841b;
import p637ta.C44840p3;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import pf.C43460a;
import pf.InterfaceC43461b;

/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¨\u0006\u0004"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$4"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.overview.AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$1", m90122f = "AssetOverviewFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$4\n+ 2 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment\n*L\n1#1,187:1\n161#2:188\n130#2:189\n163#2,7:190\n*S KotlinDebug\n*F\n+ 1 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment\n*L\n161#1:189\n*E\n"})
public final class AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$1 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetOverviewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$1(String str, Continuation continuation, AssetOverviewFragment assetOverviewFragment) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = assetOverviewFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$1 assetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$1 = new AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$1(this.$key, continuation, this.this$0);
        assetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$1.L$0 = obj;
        return assetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$1) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AssetEmptyView assetEmptyView;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if ((interfaceC43461b instanceof C43460a) && Intrinsics.areEqual(((C43460a) interfaceC43461b).getKeyEvent(), this.$key)) {
                AssetOverviewFragment assetOverviewFragment = this.this$0;
                if (assetOverviewFragment.isAdded() && !assetOverviewFragment.isDetached()) {
                    if (this.this$0.m18269e4() == null) {
                        WrapperLoadingView wrapperLoadingView = this.this$0.f18191e0;
                        if (wrapperLoadingView != null) {
                            wrapperLoadingView.showContent();
                        }
                        C44840p3 c44840p3M18267c4 = this.this$0.m18267c4();
                        if (c44840p3M18267c4 != null && (assetEmptyView = c44840p3M18267c4.f100622y) != null) {
                            ViewExtKt.m66594y(assetEmptyView);
                        }
                    }
                    C43841b.m96555b("B1overview_account_detail_load", null, 2, null);
                    this.this$0.m18271g4();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
