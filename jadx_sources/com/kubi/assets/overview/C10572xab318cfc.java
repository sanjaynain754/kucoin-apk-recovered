package com.kubi.assets.overview;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.assets.view.AccountInfoHeaderView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/* JADX INFO: renamed from: com.kubi.assets.overview.AssetOverviewFragment$bindLineChartFlowEvent$$inlined$bindFlowEvent$4 */
/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.overview.AssetOverviewFragment$bindLineChartFlowEvent$$inlined$bindFlowEvent$4", m90122f = "AssetOverviewFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment\n*L\n1#1,187:1\n651#2:188\n130#2:189\n652#2,8:190\n*S KotlinDebug\n*F\n+ 1 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment\n*L\n651#1:189\n*E\n"})
public final class C10572xab318cfc extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetOverviewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10572xab318cfc(String str, Continuation continuation, AssetOverviewFragment assetOverviewFragment) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = assetOverviewFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C10572xab318cfc c10572xab318cfc = new C10572xab318cfc(this.$key, continuation, this.this$0);
        c10572xab318cfc.L$0 = obj;
        return c10572xab318cfc;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((C10572xab318cfc) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AssetV2OverviewHeaderView assetV2OverviewHeaderView;
        AccountInfoHeaderView accountInfoHeader;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if (interfaceC43461b instanceof C43460a) {
                C43460a c43460a = (C43460a) interfaceC43461b;
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof Boolean)) {
                    boolean zBooleanValue = ((Boolean) c43460a.getData()).booleanValue();
                    AssetOverviewFragment assetOverviewFragment = this.this$0;
                    if (assetOverviewFragment.isAdded() && !assetOverviewFragment.isDetached()) {
                        C44840p3 c44840p3M18267c4 = this.this$0.m18267c4();
                        if (c44840p3M18267c4 != null && (assetV2OverviewHeaderView = c44840p3M18267c4.f100615r) != null && (accountInfoHeader = assetV2OverviewHeaderView.getAccountInfoHeader()) != null) {
                            accountInfoHeader.m19949V(zBooleanValue);
                        }
                        this.this$0.f18194h0 = zBooleanValue;
                        if (zBooleanValue) {
                            AssetOverviewFragment assetOverviewFragment2 = this.this$0;
                            String lineChartRange = AssetOverviewFragment.f18179i0.getLineChartRange();
                            if (lineChartRange == null) {
                                lineChartRange = "LAST_1_DAY";
                            }
                            assetOverviewFragment2.sendIntent(new AssetV2OverviewContract$UiIntent.GetLineChartPoint(lineChartRange));
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
