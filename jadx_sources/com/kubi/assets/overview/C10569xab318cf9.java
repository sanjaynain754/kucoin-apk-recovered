package com.kubi.assets.overview;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.assets.entity.NewOverviewEntity;
import com.kubi.assets.entity.OldOverviewEntity;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.utils.extensions.C27025c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44840p3;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import pf.C43460a;
import pf.InterfaceC43461b;

/* JADX INFO: renamed from: com.kubi.assets.overview.AssetOverviewFragment$bindLineChartFlowEvent$$inlined$bindFlowEvent$1 */
/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.overview.AssetOverviewFragment$bindLineChartFlowEvent$$inlined$bindFlowEvent$1", m90122f = "AssetOverviewFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment\n*L\n1#1,187:1\n620#2:188\n130#2:189\n621#2,7:190\n*S KotlinDebug\n*F\n+ 1 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment\n*L\n620#1:189\n*E\n"})
public final class C10569xab318cf9 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetOverviewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10569xab318cf9(String str, Continuation continuation, AssetOverviewFragment assetOverviewFragment) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = assetOverviewFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C10569xab318cf9 c10569xab318cf9 = new C10569xab318cf9(this.$key, continuation, this.this$0);
        c10569xab318cf9.L$0 = obj;
        return c10569xab318cf9;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((C10569xab318cf9) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Boolean boolBoxBoolean;
        C44840p3 c44840p3M18267c4;
        AssetV2OverviewHeaderView assetV2OverviewHeaderView;
        AccountInfoHeaderView accountInfoHeader;
        AssetV2OverviewHeaderView assetV2OverviewHeaderView2;
        AccountInfoHeaderView accountInfoHeader2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if (interfaceC43461b instanceof C43460a) {
                C43460a c43460a = (C43460a) interfaceC43461b;
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof Double)) {
                    double dDoubleValue = ((Number) c43460a.getData()).doubleValue();
                    AssetOverviewFragment assetOverviewFragment = this.this$0;
                    if (assetOverviewFragment.isAdded() && !assetOverviewFragment.isDetached()) {
                        C44840p3 c44840p3M18267c5 = this.this$0.m18267c4();
                        if (c44840p3M18267c5 != null && (assetV2OverviewHeaderView2 = c44840p3M18267c5.f100615r) != null && (accountInfoHeader2 = assetV2OverviewHeaderView2.getAccountInfoHeader()) != null) {
                            accountInfoHeader2.m19951X(dDoubleValue, this.this$0.m18269e4());
                        }
                        NewOverviewEntity newOverviewEntity = this.this$0.f18192f0;
                        Boolean boolBoxBoolean2 = null;
                        if (newOverviewEntity != null) {
                            boolBoxBoolean = Boxing.boxBoolean(newOverviewEntity.getEnabled());
                        } else {
                            boolBoxBoolean = null;
                        }
                        if (!C27025c.m66566d(boolBoxBoolean)) {
                            OldOverviewEntity oldOverviewEntity = this.this$0.f18193g0;
                            if (oldOverviewEntity != null) {
                                boolBoxBoolean2 = Boxing.boxBoolean(oldOverviewEntity.getEnabled());
                            }
                            if (C27025c.m66566d(boolBoxBoolean2)) {
                                c44840p3M18267c4 = this.this$0.m18267c4();
                                if (c44840p3M18267c4 != null) {
                                    accountInfoHeader.m19950W(false);
                                }
                            }
                        } else {
                            c44840p3M18267c4 = this.this$0.m18267c4();
                            if (c44840p3M18267c4 != null && (assetV2OverviewHeaderView = c44840p3M18267c4.f100615r) != null && (accountInfoHeader = assetV2OverviewHeaderView.getAccountInfoHeader()) != null) {
                                accountInfoHeader.m19950W(false);
                            }
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
