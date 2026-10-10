package com.kubi.quotefacade.chain.market.sectors;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import bv.C4672i;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.entity.ChainMarketSectorsEntity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: ChainSectorsFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003*\u0001\u001e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0014J\u0016\u0010\u0019\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f¨\u0006 "}, m90084d2 = {"Lcom/kubi/quotefacade/chain/market/sectors/ChainSectorsFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/quotefacade/chain/market/sectors/ChainSectorsContract$UIState;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/FragmentChainMarketSectorsBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentChainMarketSectorsBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/quotefacade/chain/market/sectors/ChainSectorsVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindState", "renderDataList", "dataList", "", "Lcom/kubi/quotefacade/entity/ChainMarketSectorsEntity;", "adapter", "com/kubi/quotefacade/chain/market/sectors/ChainSectorsFragment$adapter$1", "Lcom/kubi/quotefacade/chain/market/sectors/ChainSectorsFragment$adapter$1;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChainSectorsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainSectorsFragment.kt\ncom/kubi/quotefacade/chain/market/sectors/ChainSectorsFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,166:1\n147#2,16:167\n*S KotlinDebug\n*F\n+ 1 ChainSectorsFragment.kt\ncom/kubi/quotefacade/chain/market/sectors/ChainSectorsFragment\n*L\n46#1:167,16\n*E\n"})
public final class ChainSectorsFragment extends SimpleStateFragment<UIState> {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f41600W = {Reflection.property1(new PropertyReference1Impl(ChainSectorsFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentChainMarketSectorsBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f41601U = C45681e.m100799e(this, new Function1<ChainSectorsFragment, C4672i>() { // from class: com.kubi.quotefacade.chain.market.sectors.ChainSectorsFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4672i invoke(@NotNull ChainSectorsFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4672i.m4656a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4672i, Unit>() { // from class: com.kubi.quotefacade.chain.market.sectors.ChainSectorsFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4672i it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4672i c4672i) {
            invoke(c4672i);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final ChainSectorsFragment$adapter$1 f41602V = new ChainSectorsFragment$adapter$1(R$layout.quote_item_chain_market_sectors);

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.market.sectors.ChainSectorsFragment$bindState$2 */
    /* JADX INFO: compiled from: ChainSectorsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/quotefacade/entity/ChainMarketSectorsEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.chain.market.sectors.ChainSectorsFragment$bindState$2", m90122f = "ChainSectorsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C218312 extends SuspendLambda implements Function2<List<? extends ChainMarketSectorsEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends ChainMarketSectorsEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<ChainMarketSectorsEntity>) list, continuation);
        }

        public C218312(Continuation<? super C218312> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C218312 c218312 = ChainSectorsFragment.this.new C218312(continuation);
            c218312.L$0 = obj;
            return c218312;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<ChainMarketSectorsEntity> list, Continuation<? super Unit> continuation) {
            return ((C218312) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ChainSectorsFragment.this.m50996p3(list);
            return Unit.INSTANCE;
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_chain_market_sectors;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<ChainSectorsVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(ChainSectorsVM.class);
    }

    @Nullable
    /* JADX INFO: renamed from: o3 */
    public final C4672i m50995o3() {
        return (C4672i) this.f41601U.getValue(this, f41600W[0]);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C4672i c4672iM50995o3 = m50995o3();
        if (c4672iM50995o3 != null && (recyclerView2 = c4672iM50995o3.f4372b) != null) {
            recyclerView2.setAdapter(this.f41602V);
        }
        C4672i c4672iM50995o4 = m50995o3();
        if (c4672iM50995o4 == null || (recyclerView = c4672iM50995o4.f4372b) == null) {
            return;
        }
        recyclerView.addItemDecoration(new SectorsItemDecoration());
    }

    /* JADX INFO: renamed from: p3 */
    public final void m50996p3(final List<ChainMarketSectorsEntity> list) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.chain.market.sectors.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainSectorsFragment.m50994q3(list, this);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public static final Unit m50994q3(List list, ChainSectorsFragment chainSectorsFragment) {
        LinearLayoutCompat root;
        LinearLayoutCompat root2;
        if (list.isEmpty()) {
            C4672i c4672iM50995o3 = chainSectorsFragment.m50995o3();
            if (c4672iM50995o3 != null && (root2 = c4672iM50995o3.getRoot()) != null) {
                C27046k.m66700o(root2);
            }
            return Unit.INSTANCE;
        }
        C4672i c4672iM50995o4 = chainSectorsFragment.m50995o3();
        if (c4672iM50995o4 != null && (root = c4672iM50995o4.getRoot()) != null) {
            C27046k.m66685H(root);
        }
        chainSectorsFragment.f41602V.setNewData(list);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.chain.market.sectors.ChainSectorsFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getList();
            }
        }, new C218312(null));
    }
}
