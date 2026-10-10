package com.kubi.profit.loss.analysis.lib;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mvi.common.C19244f;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleVBStateContentFragment;
import com.kubi.profit.loss.analysis.api.AssetsProfitLossAnalysisManager;
import com.kubi.resources.C22890g;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.chart.data.AxisType;
import com.kubi.resources.widget.chart.data.DataPoint;
import com.kubi.resources.widget.chart.data.configuration.LineChartConfiguration;
import com.kubi.resources.widget.chart.view.LineChartView;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p479nw.Label;
import p479nw.LinearGradientData;
import p479nw.Paddings;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import su.C44546b;
import w00.C45681e;
import y70.C46396e;

/* JADX INFO: compiled from: AssetsProfitLossAnalysisContentFragment.kt */
/* JADX INFO: loaded from: classes35.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\rH\u0015J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\rH\u0002J\b\u0010\u0017\u001a\u00020\rH\u0002J\b\u0010\u0018\u001a\u00020\rH\u0002J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\rH\u0014J\b\u0010\u001c\u001a\u00020\rH\u0016J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\rH\u0002J\b\u0010+\u001a\u00020,H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001d\u0010&\u001a\u0004\u0018\u00010\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\"\u0010-\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020/0.X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u00063"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisContentFragment;", "Lcom/kubi/mvi/state/SimpleVBStateContentFragment;", "Lcom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisFragmentContract$ContentUIState;", "Lcom/kubi/profit/loss/analysis/lib/databinding/FragmentProfitAnalysisContentBinding;", "<init>", "()V", "rangeTypeListAdapter", "Lcom/kubi/profit/loss/analysis/lib/RangeTypeListAdapter;", "mLineChartOverlayView", "Lcom/kubi/profit/loss/analysis/lib/LineChartOverlayView;", "mAnimatorSet", "Landroid/animation/AnimatorSet;", "bindFlowEvent", "", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "initView", "startAnimation", "expand", "", "initRangeUI", "initRemoteConfig", "initShowInOutPoint", "setChartConfig", "updateChartSmooth", "isSmooth", "bindState", "onDestroyView", "bindDataPointState", "it", "Lcom/kubi/profit/loss/analysis/lib/DataPointState;", "onClickEvents", "needLoadingView", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "binding", "getBinding", "()Lcom/kubi/profit/loss/analysis/lib/databinding/FragmentProfitAnalysisContentBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getBindingRootViewLayout", "", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "Companion", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetsProfitLossAnalysisContentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetsProfitLossAnalysisContentFragment.kt\ncom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisContentFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n147#2,16:334\n81#3,2:350\n81#3,2:352\n81#3,2:354\n93#4,4:356\n1#5:360\n*S KotlinDebug\n*F\n+ 1 AssetsProfitLossAnalysisContentFragment.kt\ncom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisContentFragment\n*L\n324#1:334,16\n62#1:350,2\n68#1:352,2\n71#1:354,2\n78#1:356,4\n*E\n"})
public final class AssetsProfitLossAnalysisContentFragment extends SimpleVBStateContentFragment<ContentUIState, C44546b> {

    /* JADX INFO: renamed from: V */
    @Nullable
    public RangeTypeListAdapter f40614V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public LineChartOverlayView f40615W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final AnimatorSet f40616X = new AnimatorSet();

    /* JADX INFO: renamed from: Y */
    public boolean f40617Y = true;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f40618Z = C45681e.m100799e(this, new Function1<AssetsProfitLossAnalysisContentFragment, C44546b>() { // from class: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44546b invoke(@NotNull AssetsProfitLossAnalysisContentFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44546b.m98611a(this.this$0.m42580n3());
        }

        {
            super(1);
        }
    }, new Function1<C44546b, Unit>() { // from class: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44546b it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44546b c44546b) {
            invoke(c44546b);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final KClass<? extends AbstractC19290l<ContentUIState>> f40619a0 = Reflection.getOrCreateKotlinClass(AssetsProfitLossAnalysisContentVM.class);

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f40613c0 = {Reflection.property1(new PropertyReference1Impl(AssetsProfitLossAnalysisContentFragment.class, "binding", "getBinding()Lcom/kubi/profit/loss/analysis/lib/databinding/FragmentProfitAnalysisContentBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f40612b0 = new Companion(null);

    /* JADX INFO: compiled from: AssetsProfitLossAnalysisContentFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisContentFragment$Companion;", "", "<init>", "()V", "ANIMATOR_DURATION", "", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentFragment$bindState$2 */
    /* JADX INFO: compiled from: AssetsProfitLossAnalysisContentFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/profit/loss/analysis/lib/RangeType;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentFragment$bindState$2", m90122f = "AssetsProfitLossAnalysisContentFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C214882 extends SuspendLambda implements Function2<List<? extends RangeType>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends RangeType> list, Continuation<? super Unit> continuation) {
            return invoke2((List<RangeType>) list, continuation);
        }

        public C214882(Continuation<? super C214882> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C214882 c214882 = AssetsProfitLossAnalysisContentFragment.this.new C214882(continuation);
            c214882.L$0 = obj;
            return c214882;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<RangeType> list, Continuation<? super Unit> continuation) {
            return ((C214882) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (list != null) {
                final AssetsProfitLossAnalysisContentFragment assetsProfitLossAnalysisContentFragment = AssetsProfitLossAnalysisContentFragment.this;
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.kubi.profit.loss.analysis.lib.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        AssetsProfitLossAnalysisContentFragment.C214882.m49986f(assetsProfitLossAnalysisContentFragment, list);
                    }
                }, 200L);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final void m49986f(AssetsProfitLossAnalysisContentFragment assetsProfitLossAnalysisContentFragment, List list) {
            RangeTypeListAdapter rangeTypeListAdapter = assetsProfitLossAnalysisContentFragment.f40614V;
            if (rangeTypeListAdapter != null) {
                rangeTypeListAdapter.replaceData(list);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentFragment$bindState$4 */
    /* JADX INFO: compiled from: AssetsProfitLossAnalysisContentFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/profit/loss/analysis/lib/DataPointState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentFragment$bindState$4", m90122f = "AssetsProfitLossAnalysisContentFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C214904 extends SuspendLambda implements Function2<DataPointState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(DataPointState dataPointState, Continuation<? super Unit> continuation) {
            return ((C214904) create(dataPointState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C214904(Continuation<? super C214904> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C214904 c214904 = AssetsProfitLossAnalysisContentFragment.this.new C214904(continuation);
            c214904.L$0 = obj;
            return c214904;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            DataPointState dataPointState = (DataPointState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (dataPointState != null) {
                AssetsProfitLossAnalysisContentFragment.this.m49976C3(dataPointState);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentFragment$bindState$6 */
    /* JADX INFO: compiled from: AssetsProfitLossAnalysisContentFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentFragment$bindState$6", m90122f = "AssetsProfitLossAnalysisContentFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C214926 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return ((C214926) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C214926(Continuation<? super C214926> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C214926 c214926 = AssetsProfitLossAnalysisContentFragment.this.new C214926(continuation);
            c214926.L$0 = obj;
            return c214926;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LinearLayoutCompat linearLayoutCompat;
            ImageView imageView;
            Boolean bool = (Boolean) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (bool != null) {
                AssetsProfitLossAnalysisContentFragment assetsProfitLossAnalysisContentFragment = AssetsProfitLossAnalysisContentFragment.this;
                boolean zBooleanValue = bool.booleanValue();
                C44546b c44546bM49977E3 = assetsProfitLossAnalysisContentFragment.m49977E3();
                if (c44546bM49977E3 != null && (imageView = c44546bM49977E3.f98763e) != null) {
                    C19244f.m42542a(imageView, !zBooleanValue);
                }
                C44546b c44546bM49977E4 = assetsProfitLossAnalysisContentFragment.m49977E3();
                if (c44546bM49977E4 != null && (linearLayoutCompat = c44546bM49977E4.f98761c) != null) {
                    C19244f.m42542a(linearLayoutCompat, zBooleanValue);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentFragment$bindState$8 */
    /* JADX INFO: compiled from: AssetsProfitLossAnalysisContentFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentFragment$bindState$8", m90122f = "AssetsProfitLossAnalysisContentFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C214948 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C214948(Continuation<? super C214948> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C214948 c214948 = AssetsProfitLossAnalysisContentFragment.this.new C214948(continuation);
            c214948.L$0 = obj;
            return c214948;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C214948) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetsProfitLossAnalysisContentFragment.this.m49984R3(!Intrinsics.areEqual(str, "LAST_1_DAY"));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public final void m49983O3(boolean z11) {
        C44546b c44546bM49977E3;
        LineChartView lineChartView;
        List<DataPoint> listEmptyList;
        this.f40616X.cancel();
        View view = getView();
        final ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        View view2 = getView();
        if (view2 != null) {
            view2.measure(0, 0);
        }
        View view3 = getView();
        int iM66650j = C27039d.m66650j(view3 != null ? Integer.valueOf(view3.getMeasuredHeight()) : null);
        int i11 = z11 ? 0 : iM66650j;
        if (!z11) {
            iM66650j = 0;
        }
        float f11 = z11 ? 0.0f : 1.0f;
        float f12 = z11 ? 1.0f : 0.0f;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i11, iM66650j);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f11, f12);
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kubi.profit.loss.analysis.lib.d
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AssetsProfitLossAnalysisContentFragment.m49962P3(layoutParams, this, valueAnimator);
                }
            });
        }
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kubi.profit.loss.analysis.lib.e
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AssetsProfitLossAnalysisContentFragment.m49963Q3(this.f40724b, valueAnimator);
                }
            });
        }
        this.f40616X.setDuration(500L);
        this.f40616X.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f40616X.playTogether(valueAnimatorOfInt, valueAnimatorOfFloat);
        this.f40616X.start();
        if (!z11 || (c44546bM49977E3 = m49977E3()) == null || (lineChartView = c44546bM49977E3.f98762d) == null) {
            return;
        }
        DataPointState dataPointState = ((ContentUIState) getState()).getDataPointState();
        if (dataPointState == null || (listEmptyList = dataPointState.getPointList()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        lineChartView.m55116l(listEmptyList);
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m49957D3(int i11, DataPointState dataPointState, LineChartConfiguration updateConfig) {
        Intrinsics.checkNotNullParameter(updateConfig, "$this$updateConfig");
        updateConfig.m55089g0(i11);
        updateConfig.m55088f0(new LinearGradientData(false, 0, ColorUtils.setAlphaComponent(updateConfig.getF44469s(), 30), 0, 10, null));
        updateConfig.m55093k0(i11);
        updateConfig.m95398w(dataPointState.getMaxMinEquals() ? new Paddings(0.0f, C27040e.m66658b(18), 0.0f, 0.0f) : new Paddings(0.0f, C27040e.m66658b(18), 0.0f, C27040e.m66658b(10)));
        List<Label> labelList = dataPointState.getLabelList();
        if (labelList == null) {
            labelList = CollectionsKt.emptyList();
        }
        updateConfig.m95375D(labelList);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G3 */
    public static final void m49958G3(AssetsProfitLossAnalysisContentFragment assetsProfitLossAnalysisContentFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        String range;
        RangeType item;
        RangeTypeListAdapter rangeTypeListAdapter = assetsProfitLossAnalysisContentFragment.f40614V;
        if (rangeTypeListAdapter == null || (item = rangeTypeListAdapter.getItem(i11)) == null || (range = item.getRange()) == null) {
            range = "";
        }
        C21535v.m50071i(null, "change_" + range, null, null, 13, null);
        if (Intrinsics.areEqual(range, ((ContentUIState) assetsProfitLossAnalysisContentFragment.getState()).getCurrentRange())) {
            return;
        }
        assetsProfitLossAnalysisContentFragment.sendIntent(new C21510x555bf7ec(range));
        AssetsProfitLossAnalysisManager.f40608a.m49948j(range);
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m49960L3(boolean z11, LineChartConfiguration updateConfig) {
        Intrinsics.checkNotNullParameter(updateConfig, "$this$updateConfig");
        updateConfig.m55099q0(z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m49961N3(AssetsProfitLossAnalysisContentFragment assetsProfitLossAnalysisContentFragment, LineChartConfiguration updateConfig) {
        KuCheckBox kuCheckBox;
        Intrinsics.checkNotNullParameter(updateConfig, "$this$updateConfig");
        updateConfig.m95392q(AxisType.NONE);
        updateConfig.m55085c0(true);
        updateConfig.m55101s0(true);
        updateConfig.m55102t0(false);
        updateConfig.m55100r0(false);
        updateConfig.m55098p0(true);
        updateConfig.m55088f0(new LinearGradientData(false, 0, updateConfig.getF44469s(), 0, 10, null));
        updateConfig.m55095m0(ContextCompat.getColor(assetsProfitLossAnalysisContentFragment.mContext, R$color.c_cover12));
        updateConfig.m55096n0(ContextCompat.getColor(assetsProfitLossAnalysisContentFragment.mContext, R$color.c_overlay));
        updateConfig.m95400y(ContextCompat.getColor(assetsProfitLossAnalysisContentFragment.mContext, R$color.c_text20));
        updateConfig.m95401z(C27040e.m66659c(12.0f));
        updateConfig.m95372A(ResourcesCompat.getFont(assetsProfitLossAnalysisContentFragment.mContext, R$font.medium));
        C44546b c44546bM49977E3 = assetsProfitLossAnalysisContentFragment.m49977E3();
        updateConfig.m55099q0(C27025c.m66566d((c44546bM49977E3 == null || (kuCheckBox = c44546bM49977E3.f98760b) == null) ? null : Boolean.valueOf(kuCheckBox.isChecked())));
        updateConfig.m55092j0(20);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final void m49962P3(ViewGroup.LayoutParams layoutParams, AssetsProfitLossAnalysisContentFragment assetsProfitLossAnalysisContentFragment, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        if (layoutParams != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
        }
        View view = assetsProfitLossAnalysisContentFragment.getView();
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: Q3 */
    public static final void m49963Q3(AssetsProfitLossAnalysisContentFragment assetsProfitLossAnalysisContentFragment, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        View view = assetsProfitLossAnalysisContentFragment.getView();
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m49964S3(LineChartConfiguration updateConfig) {
        Intrinsics.checkNotNullParameter(updateConfig, "$this$updateConfig");
        updateConfig.m55102t0(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    public final void m49976C3(final DataPointState dataPointState) {
        LineChartView lineChartView;
        AssetEmptyView assetEmptyView;
        LineChartView lineChartView2;
        LineChartView lineChartView3;
        AssetEmptyView assetEmptyView2;
        LineChartView lineChartView4;
        Double value;
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        ValueEntity rangeValueEntity = dataPointState.getRangeValueEntity();
        final int iM54281f = C22890g.m54281f(mContext, ((rangeValueEntity == null || (value = rangeValueEntity.getValue()) == null) ? 0.0d : value.doubleValue()) >= 0.0d);
        C44546b c44546bM49977E3 = m49977E3();
        if (c44546bM49977E3 != null && (lineChartView4 = c44546bM49977E3.f98762d) != null) {
            lineChartView4.m55117m(new Function1() { // from class: com.kubi.profit.loss.analysis.lib.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AssetsProfitLossAnalysisContentFragment.m49957D3(iM54281f, dataPointState, (LineChartConfiguration) obj);
                }
            });
        }
        List<DataPoint> pointList = dataPointState.getPointList();
        if (pointList == null || pointList.isEmpty()) {
            C44546b c44546bM49977E4 = m49977E3();
            if (c44546bM49977E4 != null && (assetEmptyView = c44546bM49977E4.f98765g) != null) {
                ViewExtKt.m66594y(assetEmptyView);
            }
            C44546b c44546bM49977E5 = m49977E3();
            if (c44546bM49977E5 == null || (lineChartView = c44546bM49977E5.f98762d) == null) {
                return;
            }
            ViewExtKt.m66577h(lineChartView);
            return;
        }
        C44546b c44546bM49977E6 = m49977E3();
        if (c44546bM49977E6 != null && (assetEmptyView2 = c44546bM49977E6.f98765g) != null) {
            ViewExtKt.m66577h(assetEmptyView2);
        }
        C44546b c44546bM49977E7 = m49977E3();
        if (c44546bM49977E7 != null && (lineChartView3 = c44546bM49977E7.f98762d) != null) {
            ViewExtKt.m66594y(lineChartView3);
        }
        C44546b c44546bM49977E8 = m49977E3();
        if (c44546bM49977E8 != null && (lineChartView2 = c44546bM49977E8.f98762d) != null) {
            lineChartView2.m55116l(dataPointState.getPointList());
        }
        LineChartOverlayView lineChartOverlayView = this.f40615W;
        if (lineChartOverlayView != null) {
            lineChartOverlayView.setDataList(dataPointState.getPointList());
        }
    }

    @Nullable
    /* JADX INFO: renamed from: E3 */
    public C44546b m49977E3() {
        return (C44546b) this.f40618Z.getValue(this, f40613c0[0]);
    }

    /* JADX INFO: renamed from: F3 */
    public final void m49978F3() {
        RangeTypeListAdapter rangeTypeListAdapter;
        RecyclerView recyclerView;
        C44546b c44546bM49977E3;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        DynamicSpacingItemDecoration dynamicSpacingItemDecoration = null;
        this.f40614V = new RangeTypeListAdapter(null, 1, null);
        int i11 = (int) (42 * getResources().getDisplayMetrics().density);
        C44546b c44546bM49977E4 = m49977E3();
        if (c44546bM49977E4 != null && (recyclerView3 = c44546bM49977E4.f98764f) != null) {
            dynamicSpacingItemDecoration = new DynamicSpacingItemDecoration(recyclerView3, i11);
        }
        if (dynamicSpacingItemDecoration != null && (c44546bM49977E3 = m49977E3()) != null && (recyclerView2 = c44546bM49977E3.f98764f) != null) {
            recyclerView2.addItemDecoration(dynamicSpacingItemDecoration);
        }
        C44546b c44546bM49977E5 = m49977E3();
        if (c44546bM49977E5 != null && (recyclerView = c44546bM49977E5.f98764f) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
        }
        C44546b c44546bM49977E6 = m49977E3();
        if (c44546bM49977E6 != null && (rangeTypeListAdapter = this.f40614V) != null) {
            rangeTypeListAdapter.bindToRecyclerView(c44546bM49977E6.f98764f);
        }
        RangeTypeListAdapter rangeTypeListAdapter2 = this.f40614V;
        if (rangeTypeListAdapter2 != null) {
            rangeTypeListAdapter2.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.profit.loss.analysis.lib.h
                @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
                public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i12) {
                    AssetsProfitLossAnalysisContentFragment.m49958G3(this.f40728a, baseQuickAdapter, view, i12);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final void m49982M3() {
        LineChartView lineChartView;
        C44546b c44546bM49977E3;
        LineChartView lineChartView2;
        LineChartView lineChartView3;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        LineChartOverlayView lineChartOverlayView = new LineChartOverlayView(contextRequireContext, null);
        this.f40615W = lineChartOverlayView;
        C44546b c44546bM49977E4 = m49977E3();
        lineChartOverlayView.setChartView(c44546bM49977E4 != null ? c44546bM49977E4.f98762d : null);
        C44546b c44546bM49977E5 = m49977E3();
        if (c44546bM49977E5 != null && (lineChartView3 = c44546bM49977E5.f98762d) != null) {
            lineChartView3.m55113h(new AssetsProfitLossTooltip());
        }
        LineChartOverlayView lineChartOverlayView2 = this.f40615W;
        if (lineChartOverlayView2 != null && (c44546bM49977E3 = m49977E3()) != null && (lineChartView2 = c44546bM49977E3.f98762d) != null) {
            lineChartView2.m55113h(lineChartOverlayView2);
        }
        C44546b c44546bM49977E6 = m49977E3();
        if (c44546bM49977E6 == null || (lineChartView = c44546bM49977E6.f98762d) == null) {
            return;
        }
        lineChartView.m55117m(new Function1() { // from class: com.kubi.profit.loss.analysis.lib.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetsProfitLossAnalysisContentFragment.m49961N3(this.f40721b, (LineChartConfiguration) obj);
            }
        });
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        C44546b c44546bM49977E3;
        ImageView imageView;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (!(singleEvent instanceof C21534u) || (c44546bM49977E3 = m49977E3()) == null || (imageView = c44546bM49977E3.f98763e) == null) {
            return;
        }
        C27046k.m66685H(imageView);
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF49804W() {
        return this.f40617Y;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<ContentUIState>> getVmClass() {
        return this.f40619a0;
    }

    @Override // com.kubi.mvi.state.SimpleVBStateContentFragment
    /* JADX INFO: renamed from: m3 */
    public int mo21545m3() {
        return R$layout.fragment_profit_analysis_content;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f40617Y = z11;
    }

    /* JADX INFO: renamed from: K3 */
    public static final void m49959K3(AssetsProfitLossAnalysisContentFragment assetsProfitLossAnalysisContentFragment, CompoundButton compoundButton, final boolean z11) {
        LineChartView lineChartView;
        C44546b c44546bM49977E3 = assetsProfitLossAnalysisContentFragment.m49977E3();
        if (c44546bM49977E3 != null && (lineChartView = c44546bM49977E3.f98762d) != null) {
            lineChartView.m55117m(new Function1() { // from class: com.kubi.profit.loss.analysis.lib.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AssetsProfitLossAnalysisContentFragment.m49960L3(z11, (LineChartConfiguration) obj);
                }
            });
        }
        C46396e.m102354k("asset_chart", "key_is_show_in_out_point", z11);
        if (z11) {
            C43852m.m96595g("B1overview", "assetTrendNew", "fundsActivity", null, 8, null);
        }
    }

    /* JADX INFO: renamed from: H3 */
    public final void m49979H3() {
        KuCheckBox kuCheckBox;
        C44546b c44546bM49977E3 = m49977E3();
        if (c44546bM49977E3 != null && (kuCheckBox = c44546bM49977E3.f98760b) != null) {
            C21535v.m50074l(kuCheckBox, true);
        }
    }

    /* JADX INFO: renamed from: I3 */
    public final void m49980I3() {
        KuCheckBox kuCheckBox;
        KuCheckBox kuCheckBox2;
        KuCheckBox kuCheckBox3;
        C44546b c44546bM49977E3 = m49977E3();
        if (c44546bM49977E3 != null && (kuCheckBox3 = c44546bM49977E3.f98760b) != null) {
            HighlightTextHelper.f43497a.m54120f(kuCheckBox3, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(getColorRes(R$color.brandGreen))), new Pair(HighlightTextHelper.TextTagEnum.SPAN1, new ForegroundColorSpan(getColorRes(R$color.brandRed))));
        }
        C44546b c44546bM49977E4 = m49977E3();
        if (c44546bM49977E4 != null && (kuCheckBox2 = c44546bM49977E4.f98760b) != null) {
            kuCheckBox2.setChecked(C46396e.m102347d("asset_chart", "key_is_show_in_out_point", false));
        }
        C44546b c44546bM49977E5 = m49977E3();
        if (c44546bM49977E5 != null && (kuCheckBox = c44546bM49977E5.f98760b) != null && kuCheckBox.isChecked()) {
            C43852m.m96595g("B1overview", "assetTrendNew", "fundsActivity", null, 8, null);
        }
    }

    /* JADX INFO: renamed from: J3 */
    public final void m49981J3() {
        KuCheckBox kuCheckBox;
        C44546b c44546bM49977E3 = m49977E3();
        if (c44546bM49977E3 != null && (kuCheckBox = c44546bM49977E3.f98760b) != null) {
            kuCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.profit.loss.analysis.lib.g
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    AssetsProfitLossAnalysisContentFragment.m49959K3(this.f40727b, compoundButton, z11);
                }
            });
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final void m49984R3(boolean z11) {
        LineChartView lineChartView;
        C44546b c44546bM49977E3 = m49977E3();
        if (c44546bM49977E3 != null && (lineChartView = c44546bM49977E3.f98762d) != null) {
            lineChartView.m55117m(new Function1() { // from class: com.kubi.profit.loss.analysis.lib.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AssetsProfitLossAnalysisContentFragment.m49964S3((LineChartConfiguration) obj);
                }
            });
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindFlowEvent() {
        super.bindFlowEvent();
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "update_config".length();
        }
        C12572a.m23692a(this, true, new C21484x337fd8b5("update_config", null, this));
        if (c12573b.m23696a()) {
            "setData".length();
        }
        C12572a.m23692a(this, true, new C21485x337fd8b6("setData", null, this));
        if (c12573b.m23696a()) {
            "change_chart_visible".length();
        }
        C12572a.m23692a(this, true, new C21486x337fd8b7("change_chart_visible", null, this));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ContentUIState) obj).getRangeTypeList();
            }
        }, new C214882(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ContentUIState) obj).getDataPointState();
            }
        }, new C214904(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ContentUIState) obj).getResultSuccess();
            }
        }, new C214926(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentFragment.bindState.7
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ContentUIState) obj).getCurrentRange();
            }
        }, new C214948(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void initView() {
        ImageView imageView;
        super.initView();
        m49979H3();
        m49978F3();
        m49980I3();
        m49982M3();
        m49981J3();
        C21535v.m50073k(null, "chart", null, null, 13, null);
        Context context = getContext();
        int i11 = R$drawable.kc_loading;
        C44546b c44546bM49977E3 = m49977E3();
        if (c44546bM49977E3 != null) {
            imageView = c44546bM49977E3.f98763e;
        } else {
            imageView = null;
        }
        C24277v.m58539d(context, i11, imageView);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f40616X.cancel();
    }
}
