package com.kubi.assets.overview;

import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.NewOverviewEntity;
import com.kubi.assets.entity.OldOverviewEntity;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.data.entity.AssetSingleEntity;
import com.kubi.utils.extensions.C27025c;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
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

/* JADX INFO: renamed from: com.kubi.assets.overview.AssetOverviewFragment$bindLineChartFlowEvent$$inlined$bindFlowEvent$2 */
/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¨\u0006\u0004"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$4"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.overview.AssetOverviewFragment$bindLineChartFlowEvent$$inlined$bindFlowEvent$2", m90122f = "AssetOverviewFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$4\n+ 2 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment\n*L\n1#1,187:1\n629#2:188\n130#2:189\n630#2,12:190\n*S KotlinDebug\n*F\n+ 1 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment\n*L\n629#1:189\n*E\n"})
public final class C10570xab318cfa extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetOverviewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10570xab318cfa(String str, Continuation continuation, AssetOverviewFragment assetOverviewFragment) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = assetOverviewFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C10570xab318cfa c10570xab318cfa = new C10570xab318cfa(this.$key, continuation, this.this$0);
        c10570xab318cfa.L$0 = obj;
        return c10570xab318cfa;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((C10570xab318cfa) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Boolean boolBoxBoolean;
        C44840p3 c44840p3M18267c4;
        AssetV2OverviewHeaderView assetV2OverviewHeaderView;
        AccountInfoHeaderView accountInfoHeader;
        BigDecimal totalBalance;
        C44840p3 c44840p3M18267c5;
        AssetV2OverviewHeaderView assetV2OverviewHeaderView2;
        boolean zAreEqual;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if ((interfaceC43461b instanceof C43460a) && Intrinsics.areEqual(((C43460a) interfaceC43461b).getKeyEvent(), this.$key)) {
                AssetOverviewFragment assetOverviewFragment = this.this$0;
                if (assetOverviewFragment.isAdded() && !assetOverviewFragment.isDetached()) {
                    AssetV2OverviewEntity assetV2OverviewEntityM18269e4 = this.this$0.m18269e4();
                    Boolean boolBoxBoolean2 = null;
                    if (assetV2OverviewEntityM18269e4 != null) {
                        AssetSingleEntity total = assetV2OverviewEntityM18269e4.getTotal();
                        if (total != null) {
                            totalBalance = total.getTotalBalance();
                        } else {
                            totalBalance = null;
                        }
                        if (C41014a.m89922G(totalBalance, null, 1, null).compareTo(BigDecimal.ZERO) > 0) {
                            c44840p3M18267c5 = this.this$0.m18267c4();
                            if (c44840p3M18267c5 != null && (assetV2OverviewHeaderView2 = c44840p3M18267c5.f100615r) != null) {
                                assetV2OverviewHeaderView2.m18321g(assetV2OverviewEntityM18269e4);
                            }
                        } else {
                            AssetSingleEntity total2 = assetV2OverviewEntityM18269e4.getTotal();
                            if (total2 != null) {
                                zAreEqual = Intrinsics.areEqual(total2.getExecute(), Boxing.boxBoolean(true));
                            } else {
                                zAreEqual = false;
                            }
                            if (!zAreEqual) {
                                c44840p3M18267c5 = this.this$0.m18267c4();
                                if (c44840p3M18267c5 != null) {
                                    assetV2OverviewHeaderView2.m18321g(assetV2OverviewEntityM18269e4);
                                }
                            } else {
                                AssetOverviewFragment assetOverviewFragment2 = this.this$0;
                                assetOverviewFragment2.m18263D4(assetOverviewFragment2.m18269e4());
                            }
                        }
                    }
                    NewOverviewEntity newOverviewEntity = this.this$0.f18192f0;
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
                                accountInfoHeader.m19950W(true);
                            }
                        }
                    } else {
                        c44840p3M18267c4 = this.this$0.m18267c4();
                        if (c44840p3M18267c4 != null && (assetV2OverviewHeaderView = c44840p3M18267c4.f100615r) != null && (accountInfoHeader = assetV2OverviewHeaderView.getAccountInfoHeader()) != null) {
                            accountInfoHeader.m19950W(true);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
