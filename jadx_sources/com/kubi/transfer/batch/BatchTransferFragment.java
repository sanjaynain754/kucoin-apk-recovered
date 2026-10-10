package com.kubi.transfer.batch;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import c60.C4847a;
import com.kubi.data.BeepHelper;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.LeverBalance;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.transfer.TransferHelper;
import com.kubi.transfer.TransferLog;
import com.kubi.transfer.entity.AccountCoin;
import com.kubi.transfer.entity.TransferCurrencyResult;
import com.kubi.transfer.lib.R$color;
import com.kubi.transfer.lib.R$drawable;
import com.kubi.transfer.lib.R$layout;
import com.kubi.transfer.lib.R$mipmap;
import com.kubi.transfer.lib.R$raw;
import com.kubi.transfer.lib.R$string;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k10.InterfaceC40863a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
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
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: BatchTransferFragment.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010)\u001a\u00020\u0014H\u0014J\b\u0010*\u001a\u00020+H\u0014J\b\u0010,\u001a\u00020+H\u0002J\b\u0010-\u001a\u00020\fH\u0002J\b\u0010.\u001a\u00020+H\u0002J\b\u0010/\u001a\u00020+H\u0016J\b\u00100\u001a\u00020+H\u0002J\u0018\u00101\u001a\u00020+2\u0006\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u00020\u0014H\u0002J\b\u00104\u001a\u00020+H\u0014J\u001e\u00105\u001a\u00020+2\u0014\u00106\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f07H\u0002J\u0006\u00108\u001a\u00020+J\b\u00109\u001a\u00020+H\u0014J\u0010\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u00020<H\u0016J\u0006\u0010=\u001a\u00020+R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0012\u001a\u0004\b \u0010!R\u000e\u0010#\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010>\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020@0?8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006C"}, m90084d2 = {"Lcom/kubi/transfer/batch/BatchTransferFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/transfer/batch/BatchTransferContract$UIState;", "<init>", "()V", "binding", "Lcom/kubi/transfer/lib/databinding/BtransferFragmentBatchTransferBinding;", "getBinding", "()Lcom/kubi/transfer/lib/databinding/BtransferFragmentBatchTransferBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "isSelectAll", "", "mAdapter", "Lcom/kubi/transfer/batch/BatchTransferAdapter;", "getMAdapter", "()Lcom/kubi/transfer/batch/BatchTransferAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "selectSize", "", "fromType", "", "toType", "isAscending", "transferHelper", "Lcom/kubi/transfer/TransferHelper;", "getTransferHelper", "()Lcom/kubi/transfer/TransferHelper;", "transferHelper$delegate", "loadingView", "Lcom/kubi/sdk/widget/loading/ILoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/ILoadingView;", "loadingView$delegate", "isLiability", "needLoadingView", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "getLayout", "initView", "", "transferConfirm", "isMarginTip", "goBatchTransfer", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "showAllInTips", "setIcon", "count", "size", "bindFlowEvent", "handleItemClick", "item", "", "resetState", "bindState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "transferSuccess", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBatchTransferFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BatchTransferFragment.kt\ncom/kubi/transfer/batch/BatchTransferFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,235:1\n147#2,16:236\n81#3,2:252\n774#4:254\n865#4,2:255\n827#4:257\n855#4:258\n1761#4,3:259\n856#4:262\n1#5:263\n*S KotlinDebug\n*F\n+ 1 BatchTransferFragment.kt\ncom/kubi/transfer/batch/BatchTransferFragment\n*L\n41#1:236,16\n134#1:252,2\n207#1:254\n207#1:255,2\n208#1:257\n208#1:258\n208#1:259,3\n208#1:262\n*E\n"})
public final class BatchTransferFragment extends SimpleStateFragment<UIState> {

    /* JADX INFO: renamed from: f0 */
    public static final /* synthetic */ KProperty<Object>[] f52624f0 = {Reflection.property1(new PropertyReference1Impl(BatchTransferFragment.class, "binding", "getBinding()Lcom/kubi/transfer/lib/databinding/BtransferFragmentBatchTransferBinding;", 0))};

    /* JADX INFO: renamed from: V */
    public boolean f52626V;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public String f52629Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public String f52630Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f52631a0;

    /* JADX INFO: renamed from: d0 */
    public boolean f52634d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f52635e0;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f52625U = C45681e.m100799e(this, new Function1<BatchTransferFragment, C4847a>() { // from class: com.kubi.transfer.batch.BatchTransferFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4847a invoke(@NotNull BatchTransferFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4847a.m4971a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4847a, Unit>() { // from class: com.kubi.transfer.batch.BatchTransferFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4847a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4847a c4847a) {
            invoke(c4847a);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f52627W = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.batch.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BatchTransferFragment.m64534R3(this.f52640b);
        }
    });

    /* JADX INFO: renamed from: X */
    public final int f52628X = 20;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f52632b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.batch.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BatchTransferFragment.m64541c4();
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f52633c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.batch.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BatchTransferFragment.m64533Q3(this.f52644b);
        }
    });

    /* JADX INFO: renamed from: com.kubi.transfer.batch.BatchTransferFragment$bindState$2 */
    /* JADX INFO: compiled from: BatchTransferFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/transfer/entity/AccountCoin;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.transfer.batch.BatchTransferFragment$bindState$2", m90122f = "BatchTransferFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nBatchTransferFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BatchTransferFragment.kt\ncom/kubi/transfer/batch/BatchTransferFragment$bindState$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,235:1\n774#2:236\n865#2,2:237\n*S KotlinDebug\n*F\n+ 1 BatchTransferFragment.kt\ncom/kubi/transfer/batch/BatchTransferFragment$bindState$2\n*L\n189#1:236\n189#1:237,2\n*E\n"})
    public static final class C262742 extends SuspendLambda implements Function2<List<? extends AccountCoin>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends AccountCoin> list, Continuation<? super Unit> continuation) {
            return invoke2((List<AccountCoin>) list, continuation);
        }

        public C262742(Continuation<? super C262742> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C262742 c262742 = BatchTransferFragment.this.new C262742(continuation);
            c262742.L$0 = obj;
            return c262742;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<AccountCoin> list, Continuation<? super Unit> continuation) {
            return ((C262742) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (DowngradeExKt.m66538h(((AccountCoin) obj2).getAvailableBalance(), 0.0d, 1, null) > 0.0d) {
                        arrayList.add(obj2);
                    }
                }
                BatchTransferFragment.this.m64557I3().replaceData(arrayList);
                if (arrayList.isEmpty()) {
                    InterfaceC40863a interfaceC40863aM64528H3 = BatchTransferFragment.this.m64528H3();
                    if (interfaceC40863aM64528H3 != null) {
                        interfaceC40863aM64528H3.showEmpty(R$string.common_no_data, R$drawable.ic2_common_empty, (View.OnClickListener) null);
                    }
                } else {
                    InterfaceC40863a interfaceC40863aM64528H4 = BatchTransferFragment.this.m64528H3();
                    if (interfaceC40863aM64528H4 != null) {
                        interfaceC40863aM64528H4.showContent();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: F3 */
    public static final void m64527F3(BatchTransferFragment batchTransferFragment) {
        batchTransferFragment.sendIntent(new BatchTransferContract$UiIntent.Transfer(batchTransferFragment.m64557I3().m64519j()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H3 */
    public final InterfaceC40863a m64528H3() {
        return (InterfaceC40863a) this.f52633c0.getValue();
    }

    /* JADX INFO: renamed from: J3 */
    private final TransferHelper m64529J3() {
        return (TransferHelper) this.f52632b0.getValue();
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m64532O3(BatchTransferFragment batchTransferFragment) {
        ImageView imageView;
        batchTransferFragment.f52631a0 = !batchTransferFragment.f52631a0;
        batchTransferFragment.m64557I3().m64521l(batchTransferFragment.f52631a0);
        C4847a c4847aM64556G3 = batchTransferFragment.m64556G3();
        if (c4847aM64556G3 != null && (imageView = c4847aM64556G3.f4917c) != null) {
            imageView.setImageResource(!batchTransferFragment.f52631a0 ? R$mipmap.ic_sort_up : R$mipmap.ic_sort_down);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final BatchTransferAdapter m64534R3(final BatchTransferFragment batchTransferFragment) {
        return new BatchTransferAdapter(new Function1() { // from class: com.kubi.transfer.batch.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BatchTransferFragment.m64535S3(this.f52643b, (Map) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m64535S3(BatchTransferFragment batchTransferFragment, Map it) {
        Intrinsics.checkNotNullParameter(it, "it");
        batchTransferFragment.m64559L3(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m64538Y3(Throwable th2) {
        TransferLog.f52948a.m64779a("获取全仓账户信息失败：" + th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final TransferHelper m64541c4() {
        return new TransferHelper();
    }

    /* JADX INFO: renamed from: G3 */
    public final C4847a m64556G3() {
        return (C4847a) this.f52625U.getValue(this, f52624f0[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: I3 */
    public final BatchTransferAdapter m64557I3() {
        return (BatchTransferAdapter) this.f52627W.getValue();
    }

    /* JADX INFO: renamed from: K3 */
    public final void m64558K3() {
        sendIntent(new BatchTransferContract$UiIntent.Transfer(m64557I3().m64519j()));
    }

    /* JADX INFO: renamed from: P3 */
    public final boolean m64560P3() {
        return Intrinsics.areEqual(this.f52630Z, "MARGIN") && this.f52634d0;
    }

    /* JADX INFO: renamed from: U3 */
    public final void m64562U3(int i11, int i12) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        ImageView imageView6;
        if (this.f52626V && i11 == i12) {
            C4847a c4847aM64556G3 = m64556G3();
            if (c4847aM64556G3 != null && (imageView6 = c4847aM64556G3.f4916b) != null) {
                imageView6.setImageResource(R$drawable.ui_ic_checkbox_20);
            }
            C4847a c4847aM64556G4 = m64556G3();
            if (c4847aM64556G4 != null && (imageView5 = c4847aM64556G4.f4916b) != null) {
                imageView5.clearColorFilter();
            }
        } else {
            C4847a c4847aM64556G5 = m64556G3();
            if (c4847aM64556G5 != null && (imageView2 = c4847aM64556G5.f4916b) != null) {
                imageView2.setImageResource(R$drawable.ic_sub_filled2_20);
            }
            C4847a c4847aM64556G6 = m64556G3();
            if (c4847aM64556G6 != null && (imageView = c4847aM64556G6.f4916b) != null) {
                C27046k.m66701p(imageView, ContextCompat.getColor(this.mContext, R$color.color_1d1d1d_00b47d));
            }
        }
        if (i11 == 0) {
            C4847a c4847aM64556G7 = m64556G3();
            if (c4847aM64556G7 != null && (imageView4 = c4847aM64556G7.f4916b) != null) {
                imageView4.setImageResource(R$mipmap.ui_ic_single_unselected_20);
            }
            C4847a c4847aM64556G8 = m64556G3();
            if (c4847aM64556G8 == null || (imageView3 = c4847aM64556G8.f4916b) == null) {
                return;
            }
            imageView3.clearColorFilter();
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final void m64563V3() {
        Observable<R> observableCompose = IMarginService.f32724a.get().mo37935f().compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.transfer.batch.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BatchTransferFragment.m64536W3(this.f52645b, (LeverBalance) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.transfer.batch.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BatchTransferFragment.m64537X3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.transfer.batch.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BatchTransferFragment.m64538Y3((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.transfer.batch.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BatchTransferFragment.m64539Z3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindFlowEvent() {
        if (C12573b.f21598a.m23696a()) {
            "update_batch_transfer_coin_info".length();
        }
        C12572a.m23692a(this, true, new BatchTransferFragment$bindFlowEvent$$inlined$bindFlowEvent$1("update_batch_transfer_coin_info", null, this));
    }

    /* JADX INFO: renamed from: d4 */
    public final void m64565d4() {
        BeepHelper.m23642f("beep_transfer", R$raw.transfer);
        ToastCompat.m66436B(getString(R$string.exchanged_ok), new Object[0]);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, new Intent());
        }
        preformBackPressed();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C26276b) {
            C26276b c26276b = (C26276b) singleEvent;
            if (c26276b.m64566a() == null) {
                m64565d4();
                return;
            }
            List<TransferCurrencyResult> listM64566a = c26276b.m64566a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM64566a) {
                if (Intrinsics.areEqual(((TransferCurrencyResult) obj).getResult(), Boolean.FALSE)) {
                    arrayList.add(obj);
                }
            }
            List<AccountCoin> data = m64557I3().getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : data) {
                AccountCoin accountCoin = (AccountCoin) obj2;
                List<TransferCurrencyResult> listM64566a2 = c26276b.m64566a();
                if (listM64566a2 == null || !listM64566a2.isEmpty()) {
                    Iterator<T> it = listM64566a2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            TransferCurrencyResult transferCurrencyResult = (TransferCurrencyResult) it.next();
                            if (Intrinsics.areEqual(transferCurrencyResult.getCurrency(), accountCoin.getCurrency()) && Intrinsics.areEqual(transferCurrencyResult.getResult(), Boolean.TRUE)) {
                                break;
                            }
                        }
                    }
                }
                arrayList2.add(obj2);
            }
            m64557I3().replaceData(arrayList2);
            if (arrayList.isEmpty()) {
                m64565d4();
                return;
            }
            DialogFragmentHelper dialogFragmentHelperM64491o = m64529J3().m64491o(arrayList, new Action() { // from class: com.kubi.transfer.batch.d
                @Override // io.reactivex.functions.Action
                public final void run() {
                    BatchTransferFragment.m64527F3(this.f52641b);
                }
            });
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            dialogFragmentHelperM64491o.show(childFragmentManager, "TransferFailure");
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.btransfer_fragment_batch_transfer;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF52635e0() {
        return this.f52635e0;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(BatchTransferVM.class);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f52635e0 = z11;
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m64530M3(BatchTransferFragment batchTransferFragment) {
        batchTransferFragment.m64564a4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m64531N3(BatchTransferFragment batchTransferFragment) {
        batchTransferFragment.m64557I3().m64520k(!batchTransferFragment.f52626V);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final WrapperLoadingView m64533Q3(BatchTransferFragment batchTransferFragment) {
        C4847a c4847aM64556G3 = batchTransferFragment.m64556G3();
        if (c4847aM64556G3 != null) {
            return WrapperLoadingView.injectView(c4847aM64556G3.f4921g);
        }
        return null;
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m64536W3(BatchTransferFragment batchTransferFragment, LeverBalance leverBalance) {
        batchTransferFragment.f52634d0 = leverBalance.isLiability();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final void m64537X3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z3 */
    public static final void m64539Z3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m64540b4(BatchTransferFragment batchTransferFragment) {
        batchTransferFragment.m64558K3();
    }

    /* JADX INFO: renamed from: L3 */
    public final void m64559L3(Map<String, Boolean> map) {
        boolean z11;
        KcPrimaryButton kcPrimaryButton;
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        KcPrimaryButton kcPrimaryButton2;
        KcPrimaryButton kcPrimaryButton3;
        int size = map.size();
        boolean z12 = false;
        if (size > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f52626V = z11;
        m64562U3(size, m64557I3().getData().size());
        C4847a c4847aM64556G3 = m64556G3();
        if (c4847aM64556G3 != null && (kcPrimaryButton3 = c4847aM64556G3.f4924j) != null) {
            if (1 <= size && size <= this.f52628X) {
                z12 = true;
            }
            kcPrimaryButton3.setEnabled(z12);
        }
        if (m64557I3().getData().size() > this.f52628X) {
            C4847a c4847aM64556G4 = m64556G3();
            if (c4847aM64556G4 != null && (kcPrimaryButton2 = c4847aM64556G4.f4924j) != null) {
                int i11 = R$string.transfer_batch_confirms;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(size);
                sb2.append('/');
                sb2.append(this.f52628X);
                kcPrimaryButton2.setText(getString(i11, sb2.toString()));
            }
        } else {
            C4847a c4847aM64556G5 = m64556G3();
            if (c4847aM64556G5 != null && (kcPrimaryButton = c4847aM64556G5.f4924j) != null) {
                kcPrimaryButton.setText(getString(R$string.transfer_batch_confirm));
            }
        }
        C4847a c4847aM64556G6 = m64556G3();
        if (c4847aM64556G6 != null && (textView4 = c4847aM64556G6.f4923i) != null) {
            textView4.setText(getString(R$string.transfer_batch_coins_title, String.valueOf(size)));
        }
        if (size >= this.f52628X && m64557I3().getData().size() > this.f52628X) {
            C4847a c4847aM64556G7 = m64556G3();
            if (c4847aM64556G7 != null && (textView3 = c4847aM64556G7.f4922h) != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = getString(R$string.transfer_batch_max_tip);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String str = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(this.f52628X)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                textView3.setText(str);
            }
            C4847a c4847aM64556G8 = m64556G3();
            if (c4847aM64556G8 != null && (textView2 = c4847aM64556G8.f4922h) != null) {
                ViewExtKt.m66594y(textView2);
                return;
            }
            return;
        }
        C4847a c4847aM64556G9 = m64556G3();
        if (c4847aM64556G9 != null && (textView = c4847aM64556G9.f4922h) != null) {
            ViewExtKt.m66577h(textView);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final void m64561T3() {
        ImageView imageView;
        ImageView imageView2;
        TextView textView;
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        InterfaceC40863a interfaceC40863aM64528H3 = m64528H3();
        if (interfaceC40863aM64528H3 != null) {
            interfaceC40863aM64528H3.showLoading();
        }
        this.f52626V = false;
        this.f52631a0 = false;
        C4847a c4847aM64556G3 = m64556G3();
        if (c4847aM64556G3 != null && (kcPrimaryButton2 = c4847aM64556G3.f4924j) != null) {
            kcPrimaryButton2.setEnabled(false);
        }
        C4847a c4847aM64556G4 = m64556G3();
        if (c4847aM64556G4 != null && (kcPrimaryButton = c4847aM64556G4.f4924j) != null) {
            kcPrimaryButton.setText(getString(R$string.transfer_batch_confirm));
        }
        C4847a c4847aM64556G5 = m64556G3();
        if (c4847aM64556G5 != null && (textView = c4847aM64556G5.f4923i) != null) {
            textView.setText(getString(R$string.coin));
        }
        C4847a c4847aM64556G6 = m64556G3();
        if (c4847aM64556G6 != null && (imageView2 = c4847aM64556G6.f4916b) != null) {
            imageView2.setImageResource(R$mipmap.ic_checkbox_button_unchecked);
        }
        C4847a c4847aM64556G7 = m64556G3();
        if (c4847aM64556G7 != null && (imageView = c4847aM64556G7.f4917c) != null) {
            imageView.setImageResource(R$mipmap.ic_sort_up);
        }
        m64557I3().m64520k(false);
    }

    /* JADX INFO: renamed from: a4 */
    public final void m64564a4() {
        if (m64560P3()) {
            DialogFragmentHelper dialogFragmentHelperM64490k = m64529J3().m64490k(this.f52634d0, new Action() { // from class: com.kubi.transfer.batch.e
                @Override // io.reactivex.functions.Action
                public final void run() {
                    BatchTransferFragment.m64540b4(this.f52642b);
                }
            });
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            dialogFragmentHelperM64490k.show(childFragmentManager, "TransferAutoRepayTipDialog");
        } else {
            m64558K3();
        }
        C43852m.m96591c("B1transferNew", "confirm", "2", null, 8, null);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.transfer.batch.BatchTransferFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getList();
            }
        }, new C262742(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        KcPrimaryButton kcPrimaryButton;
        RecyclerView recyclerView;
        super.initView();
        C4847a c4847aM64556G3 = m64556G3();
        if (c4847aM64556G3 != null && (recyclerView = c4847aM64556G3.f4921g) != null) {
            recyclerView.setAdapter(m64557I3());
        }
        C4847a c4847aM64556G4 = m64556G3();
        if (c4847aM64556G4 != null && (kcPrimaryButton = c4847aM64556G4.f4924j) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.transfer.batch.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BatchTransferFragment.m64530M3(this.f52648b);
                }
            }, 1, null);
        }
        C4847a c4847aM64556G5 = m64556G3();
        if (c4847aM64556G5 != null && (linearLayout2 = c4847aM64556G5.f4919e) != null) {
            C27046k.m66711z(linearLayout2, 0L, new Function0() { // from class: com.kubi.transfer.batch.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BatchTransferFragment.m64531N3(this.f52649b);
                }
            }, 1, null);
        }
        C4847a c4847aM64556G6 = m64556G3();
        if (c4847aM64556G6 != null && (linearLayout = c4847aM64556G6.f4920f) != null) {
            C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.transfer.batch.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BatchTransferFragment.m64532O3(this.f52650b);
                }
            }, 1, null);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m64563V3();
    }
}
