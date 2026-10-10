package com.kubi.assets.finance;

import android.annotation.SuppressLint;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$color;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.FinanceCoinEntity;
import com.kubi.assets.entity.FinanceRecommendEntity;
import com.kubi.assets.finance.coin.FinanceCoinFragment;
import com.kubi.assets.finance.product.FinanceProductFragment;
import com.kubi.assets.overview.AssetV2OverviewAdapter;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l10.C42025b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44851r0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.MutablePropertyReference1Impl;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: FinanceCommonFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001*B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u0014H\u0014J\b\u0010%\u001a\u00020\u0014H\u0016J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u001eH\u0016J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u001eH\u0016R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082.¢\u0006\u0002\n\u0000R\"\u0010 \u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\"0!8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006+"}, m90084d2 = {"Lcom/kubi/assets/finance/FinanceCommonFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/assets/finance/FinanceCommonContract$UIState;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "Lcom/kubi/assets/overview/AssetV2OverviewAdapter$OverViewIntentListener;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetFragmentFinanceCommonBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetFragmentFinanceCommonBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fragmentList", "Ljava/util/ArrayList;", "Lcom/kubi/sdk/BaseFragment;", "Lkotlin/collections/ArrayList;", "getLayout", "", "initView", "", "getCoinFragment", "Lcom/kubi/assets/finance/coin/FinanceCoinFragment;", "setName", ViewProps.POSITION, "toggleTab", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "loadData", "toggleHeaderVisibility", "isShow", "", "bindState", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "onRefresh", "onHideZeroListener", TIMPushProvider.f75063o, "onEyesChangedListener", ViewProps.VISIBLE, "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"KCFragmentCheck"})
@SourceDebugExtension({"SMAP\nFinanceCommonFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceCommonFragment.kt\ncom/kubi/assets/finance/FinanceCommonFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,211:1\n147#2,16:212\n295#3,2:228\n1869#3,2:230\n*S KotlinDebug\n*F\n+ 1 FinanceCommonFragment.kt\ncom/kubi/assets/finance/FinanceCommonFragment\n*L\n35#1:212,16\n76#1:228,2\n205#1:230,2\n*E\n"})
public final class FinanceCommonFragment extends SimpleStateFragment<UIState> implements SwipeRefreshLayout.OnRefreshListener, AssetV2OverviewAdapter.InterfaceC10586a {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f17378U = C45681e.m100799e(this, new Function1<FinanceCommonFragment, C44851r0>() { // from class: com.kubi.assets.finance.FinanceCommonFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44851r0 invoke(@NotNull FinanceCommonFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44851r0.m99227a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44851r0, Unit>() { // from class: com.kubi.assets.finance.FinanceCommonFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44851r0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44851r0 c44851r0) {
            invoke(c44851r0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    public ArrayList<BaseFragment> f17379V;

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f17377X = {Reflection.property1(new PropertyReference1Impl(FinanceCommonFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetFragmentFinanceCommonBinding;", 0))};

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f17376W = new Companion(null);

    /* JADX INFO: compiled from: FinanceCommonFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/finance/FinanceCommonFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/assets/finance/FinanceCommonFragment;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final FinanceCommonFragment newInstance() {
            return new FinanceCommonFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.finance.FinanceCommonFragment$a */
    /* JADX INFO: compiled from: FinanceCommonFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/assets/finance/FinanceCommonFragment$initView$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9947a extends ViewPager.SimpleOnPageChangeListener {
        public C9947a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            FinanceCommonFragment.this.m16636w3(position);
            FinanceAnalyticsReporter.f17418a.m16760f(String.valueOf(position + 1));
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.finance.FinanceCommonFragment$bindState$2 */
    /* JADX INFO: compiled from: FinanceCommonFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "data", "", "Lcom/kubi/assets/entity/FinanceCoinEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.finance.FinanceCommonFragment$bindState$2", m90122f = "FinanceCommonFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nFinanceCommonFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceCommonFragment.kt\ncom/kubi/assets/finance/FinanceCommonFragment$bindState$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,211:1\n808#2,11:212\n1869#2,2:223\n*S KotlinDebug\n*F\n+ 1 FinanceCommonFragment.kt\ncom/kubi/assets/finance/FinanceCommonFragment$bindState$2\n*L\n166#1:212,11\n166#1:223,2\n*E\n"})
    public static final class C99492 extends SuspendLambda implements Function2<List<? extends FinanceCoinEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends FinanceCoinEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<FinanceCoinEntity>) list, continuation);
        }

        public C99492(Continuation<? super C99492> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C99492 c99492 = FinanceCommonFragment.this.new C99492(continuation);
            c99492.L$0 = obj;
            return c99492;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<FinanceCoinEntity> list, Continuation<? super Unit> continuation) {
            return ((C99492) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<FinanceCoinEntity> list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (list != null) {
                FinanceCommonFragment financeCommonFragment = FinanceCommonFragment.this;
                ArrayList arrayList = financeCommonFragment.f17379V;
                if (arrayList == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fragmentList");
                    arrayList = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (obj2 instanceof IFinanceAsset) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((IFinanceAsset) it.next()).mo16787y(list);
                    financeCommonFragment.m16637x3(!list.isEmpty());
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.finance.FinanceCommonFragment$bindState$4 */
    /* JADX INFO: compiled from: FinanceCommonFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/assets/entity/FinanceRecommendEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.finance.FinanceCommonFragment$bindState$4", m90122f = "FinanceCommonFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C99514 extends SuspendLambda implements Function2<List<? extends FinanceRecommendEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends FinanceRecommendEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<FinanceRecommendEntity>) list, continuation);
        }

        public C99514(Continuation<? super C99514> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C99514 c99514 = FinanceCommonFragment.this.new C99514(continuation);
            c99514.L$0 = obj;
            return c99514;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<FinanceRecommendEntity> list, Continuation<? super Unit> continuation) {
            return ((C99514) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FinanceRecommendView financeRecommendView;
            NestedScrollView nestedScrollView;
            LinearLayoutCompat linearLayoutCompat;
            LinearLayoutCompat linearLayoutCompat2;
            CustomViewPager customViewPager;
            NestedScrollView nestedScrollView2;
            LinearLayoutCompat linearLayoutCompat3;
            LinearLayoutCompat linearLayoutCompat4;
            CustomViewPager customViewPager2;
            List<FinanceRecommendEntity> list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (list != null) {
                FinanceCommonFragment financeCommonFragment = FinanceCommonFragment.this;
                if (list.isEmpty()) {
                    C44851r0 c44851r0M16634r3 = financeCommonFragment.m16634r3();
                    if (c44851r0M16634r3 != null && (customViewPager2 = c44851r0M16634r3.f100718j) != null) {
                        ViewExtKt.m66594y(customViewPager2);
                    }
                    C44851r0 c44851r0M16634r4 = financeCommonFragment.m16634r3();
                    if (c44851r0M16634r4 != null && (linearLayoutCompat4 = c44851r0M16634r4.f100715g) != null) {
                        ViewExtKt.m66594y(linearLayoutCompat4);
                    }
                    C44851r0 c44851r0M16634r5 = financeCommonFragment.m16634r3();
                    if (c44851r0M16634r5 != null && (linearLayoutCompat3 = c44851r0M16634r5.f100710b) != null) {
                        ViewExtKt.m66594y(linearLayoutCompat3);
                    }
                    C44851r0 c44851r0M16634r6 = financeCommonFragment.m16634r3();
                    if (c44851r0M16634r6 != null && (nestedScrollView2 = c44851r0M16634r6.f100714f) != null) {
                        ViewExtKt.m66577h(nestedScrollView2);
                    }
                } else {
                    C44851r0 c44851r0M16634r7 = financeCommonFragment.m16634r3();
                    if (c44851r0M16634r7 != null && (customViewPager = c44851r0M16634r7.f100718j) != null) {
                        ViewExtKt.m66577h(customViewPager);
                    }
                    C44851r0 c44851r0M16634r8 = financeCommonFragment.m16634r3();
                    if (c44851r0M16634r8 != null && (linearLayoutCompat2 = c44851r0M16634r8.f100715g) != null) {
                        ViewExtKt.m66577h(linearLayoutCompat2);
                    }
                    C44851r0 c44851r0M16634r9 = financeCommonFragment.m16634r3();
                    if (c44851r0M16634r9 != null && (linearLayoutCompat = c44851r0M16634r9.f100710b) != null) {
                        ViewExtKt.m66577h(linearLayoutCompat);
                    }
                    C44851r0 c44851r0M16634r10 = financeCommonFragment.m16634r3();
                    if (c44851r0M16634r10 != null && (nestedScrollView = c44851r0M16634r10.f100714f) != null) {
                        ViewExtKt.m66594y(nestedScrollView);
                    }
                    C44851r0 c44851r0M16634r11 = financeCommonFragment.m16634r3();
                    if (c44851r0M16634r11 != null && (financeRecommendView = c44851r0M16634r11.f100713e) != null) {
                        financeRecommendView.m16694b(list);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: t3 */
    public static final Unit m16630t3(FinanceCommonFragment financeCommonFragment) {
        financeCommonFragment.m16638y3(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u3 */
    public static final Unit m16631u3(FinanceCommonFragment financeCommonFragment) {
        financeCommonFragment.m16638y3(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y3 */
    public final void m16638y3(int i11) {
        CustomViewPager customViewPager;
        ShapeTextView shapeTextView;
        ShapeTextView shapeTextView2;
        ShapeTextView shapeTextView3;
        C42025b shapeDrawableBuilder;
        ShapeTextView shapeTextView4;
        C42025b shapeDrawableBuilder2;
        ShapeTextView shapeTextView5;
        C42025b shapeDrawableBuilder3;
        ShapeTextView shapeTextView6;
        C42025b shapeDrawableBuilder4;
        ShapeTextView shapeTextView7;
        ShapeTextView shapeTextView8;
        CustomViewPager customViewPager2;
        ShapeTextView shapeTextView9;
        ShapeTextView shapeTextView10;
        ShapeTextView shapeTextView11;
        C42025b shapeDrawableBuilder5;
        ShapeTextView shapeTextView12;
        C42025b shapeDrawableBuilder6;
        ShapeTextView shapeTextView13;
        C42025b shapeDrawableBuilder7;
        ShapeTextView shapeTextView14;
        C42025b shapeDrawableBuilder8;
        ShapeTextView shapeTextView15;
        ShapeTextView shapeTextView16;
        if (i11 == 0) {
            C44851r0 c44851r0M16634r3 = m16634r3();
            if (c44851r0M16634r3 != null && (shapeTextView8 = c44851r0M16634r3.f100711c) != null) {
                shapeTextView8.setSelected(true);
            }
            C44851r0 c44851r0M16634r4 = m16634r3();
            if (c44851r0M16634r4 != null && (shapeTextView7 = c44851r0M16634r4.f100712d) != null) {
                shapeTextView7.setSelected(false);
            }
            C44851r0 c44851r0M16634r5 = m16634r3();
            if (c44851r0M16634r5 != null && (shapeTextView6 = c44851r0M16634r5.f100711c) != null && (shapeDrawableBuilder4 = shapeTextView6.getShapeDrawableBuilder()) != null) {
                shapeDrawableBuilder4.m92151m(ContextCompat.getColor(C27017c.f54310a.m66513b(), R$color.c_cover4));
            }
            C44851r0 c44851r0M16634r6 = m16634r3();
            if (c44851r0M16634r6 != null && (shapeTextView5 = c44851r0M16634r6.f100712d) != null && (shapeDrawableBuilder3 = shapeTextView5.getShapeDrawableBuilder()) != null) {
                shapeDrawableBuilder3.m92151m(ContextCompat.getColor(C27017c.f54310a.m66513b(), R$color.c_transparent));
            }
            C44851r0 c44851r0M16634r7 = m16634r3();
            if (c44851r0M16634r7 != null && (shapeTextView4 = c44851r0M16634r7.f100711c) != null && (shapeDrawableBuilder2 = shapeTextView4.getShapeDrawableBuilder()) != null) {
                shapeDrawableBuilder2.m92143e();
            }
            C44851r0 c44851r0M16634r8 = m16634r3();
            if (c44851r0M16634r8 != null && (shapeTextView3 = c44851r0M16634r8.f100712d) != null && (shapeDrawableBuilder = shapeTextView3.getShapeDrawableBuilder()) != null) {
                shapeDrawableBuilder.m92143e();
            }
            C44851r0 c44851r0M16634r9 = m16634r3();
            if (c44851r0M16634r9 != null && (shapeTextView2 = c44851r0M16634r9.f100711c) != null) {
                shapeTextView2.setTextColor(ContextCompat.getColor(C27017c.f54310a.m66513b(), R$color.c_text));
            }
            C44851r0 c44851r0M16634r10 = m16634r3();
            if (c44851r0M16634r10 != null && (shapeTextView = c44851r0M16634r10.f100712d) != null) {
                shapeTextView.setTextColor(ContextCompat.getColor(C27017c.f54310a.m66513b(), R$color.c_text40));
            }
            C44851r0 c44851r0M16634r11 = m16634r3();
            if (c44851r0M16634r11 == null || (customViewPager = c44851r0M16634r11.f100718j) == null) {
                return;
            }
            customViewPager.setCurrentItem(0);
            return;
        }
        if (i11 != 1) {
            return;
        }
        C44851r0 c44851r0M16634r12 = m16634r3();
        if (c44851r0M16634r12 != null && (shapeTextView16 = c44851r0M16634r12.f100711c) != null) {
            shapeTextView16.setSelected(false);
        }
        C44851r0 c44851r0M16634r13 = m16634r3();
        if (c44851r0M16634r13 != null && (shapeTextView15 = c44851r0M16634r13.f100712d) != null) {
            shapeTextView15.setSelected(true);
        }
        C44851r0 c44851r0M16634r14 = m16634r3();
        if (c44851r0M16634r14 != null && (shapeTextView14 = c44851r0M16634r14.f100711c) != null && (shapeDrawableBuilder8 = shapeTextView14.getShapeDrawableBuilder()) != null) {
            shapeDrawableBuilder8.m92151m(ContextCompat.getColor(C27017c.f54310a.m66513b(), R$color.c_transparent));
        }
        C44851r0 c44851r0M16634r15 = m16634r3();
        if (c44851r0M16634r15 != null && (shapeTextView13 = c44851r0M16634r15.f100712d) != null && (shapeDrawableBuilder7 = shapeTextView13.getShapeDrawableBuilder()) != null) {
            shapeDrawableBuilder7.m92151m(ContextCompat.getColor(C27017c.f54310a.m66513b(), R$color.c_cover4));
        }
        C44851r0 c44851r0M16634r16 = m16634r3();
        if (c44851r0M16634r16 != null && (shapeTextView12 = c44851r0M16634r16.f100711c) != null && (shapeDrawableBuilder6 = shapeTextView12.getShapeDrawableBuilder()) != null) {
            shapeDrawableBuilder6.m92143e();
        }
        C44851r0 c44851r0M16634r17 = m16634r3();
        if (c44851r0M16634r17 != null && (shapeTextView11 = c44851r0M16634r17.f100712d) != null && (shapeDrawableBuilder5 = shapeTextView11.getShapeDrawableBuilder()) != null) {
            shapeDrawableBuilder5.m92143e();
        }
        C44851r0 c44851r0M16634r18 = m16634r3();
        if (c44851r0M16634r18 != null && (shapeTextView10 = c44851r0M16634r18.f100711c) != null) {
            shapeTextView10.setTextColor(ContextCompat.getColor(C27017c.f54310a.m66513b(), R$color.c_text40));
        }
        C44851r0 c44851r0M16634r19 = m16634r3();
        if (c44851r0M16634r19 != null && (shapeTextView9 = c44851r0M16634r19.f100712d) != null) {
            shapeTextView9.setTextColor(ContextCompat.getColor(C27017c.f54310a.m66513b(), R$color.c_text));
        }
        C44851r0 c44851r0M16634r20 = m16634r3();
        if (c44851r0M16634r20 == null || (customViewPager2 = c44851r0M16634r20.f100718j) == null) {
            return;
        }
        customViewPager2.setCurrentItem(1);
    }

    /* JADX INFO: renamed from: v3 */
    private final void m16632v3() {
        sendIntent(FinanceCommonContract$UiIntent.GetCoinList.INSTANCE);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.asset_fragment_finance_common;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(FinanceCommonViewModel.class);
    }

    /* JADX INFO: renamed from: r3 */
    public final C44851r0 m16634r3() {
        return (C44851r0) this.f17378U.getValue(this, f17377X[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: s3 */
    public final FinanceCoinFragment m16635s3() {
        Object next;
        ArrayList<BaseFragment> arrayList = this.f17379V;
        if (arrayList == null) {
            return null;
        }
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentList");
            arrayList = null;
        }
        Iterator<T> it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((BaseFragment) next) instanceof FinanceCoinFragment));
        if (next instanceof FinanceCoinFragment) {
            return (FinanceCoinFragment) next;
        }
        return null;
    }

    @Override // com.kubi.assets.overview.AssetV2OverviewAdapter.InterfaceC10586a
    /* JADX INFO: renamed from: T2 */
    public void mo16633T2(boolean z11) {
        if (isShowing()) {
            ArrayList<BaseFragment> arrayList = this.f17379V;
            if (arrayList == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fragmentList");
                arrayList = null;
            }
            for (ActivityResultCaller activityResultCaller : arrayList) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Intrinsics.checkNotNull(activityResultCaller, "null cannot be cast to non-null type com.kubi.assets.overview.AssetV2OverviewAdapter.OverViewIntentListener");
                    ((AssetV2OverviewAdapter.InterfaceC10586a) activityResultCaller).mo16633T2(z11);
                    Result.m103844constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
            }
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new MutablePropertyReference1Impl() { // from class: com.kubi.assets.finance.FinanceCommonFragment.bindState.1
            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getData();
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((UIState) obj).setData((List) obj2);
            }
        }, new C99492(null));
        bindState(new MutablePropertyReference1Impl() { // from class: com.kubi.assets.finance.FinanceCommonFragment.bindState.3
            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getRecommendList();
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((UIState) obj).setRecommendList((List) obj2);
            }
        }, new C99514(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        ShapeTextView shapeTextView;
        ShapeTextView shapeTextView2;
        CustomViewPager customViewPager;
        CustomViewPager customViewPager2;
        super.initView();
        this.f17379V = CollectionsKt.arrayListOf(FinanceCoinFragment.f17422Y.newInstance(), FinanceProductFragment.f17463Y.newInstance());
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(R$string.kc_earn_coin_title));
        arrayList.add(getString(R$string.earn_products));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        ArrayList<BaseFragment> arrayList2 = this.f17379V;
        if (arrayList2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentList");
            arrayList2 = null;
        }
        C27103z c27103z = new C27103z(childFragmentManager, arrayList2, arrayList);
        C44851r0 c44851r0M16634r3 = m16634r3();
        if (c44851r0M16634r3 != null && (customViewPager2 = c44851r0M16634r3.f100718j) != null) {
            customViewPager2.setAdapter(c27103z);
        }
        C44851r0 c44851r0M16634r4 = m16634r3();
        if (c44851r0M16634r4 != null && (customViewPager = c44851r0M16634r4.f100718j) != null) {
            customViewPager.addOnPageChangeListener(new C9947a());
        }
        C44851r0 c44851r0M16634r5 = m16634r3();
        if (c44851r0M16634r5 != null && (shapeTextView2 = c44851r0M16634r5.f100711c) != null) {
            C27046k.m66711z(shapeTextView2, 0L, new Function0() { // from class: com.kubi.assets.finance.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FinanceCommonFragment.m16630t3(this.f17443b);
                }
            }, 1, null);
        }
        C44851r0 c44851r0M16634r6 = m16634r3();
        if (c44851r0M16634r6 != null && (shapeTextView = c44851r0M16634r6.f100712d) != null) {
            C27046k.m66711z(shapeTextView, 0L, new Function0() { // from class: com.kubi.assets.finance.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FinanceCommonFragment.m16631u3(this.f17445b);
                }
            }, 1, null);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        m16632v3();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m16632v3();
    }

    /* JADX INFO: renamed from: w3 */
    public final void m16636w3(int i11) {
        String string;
        String string2;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        m16638y3(i11);
        if (i11 == 0) {
            string = getString(R$string.coin);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            string2 = getString(R$string.total_qty);
        } else {
            string = getString(R$string.type);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            string2 = getString(R$string.kc_earn_total_value) + '(' + AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency() + ')';
        }
        Intrinsics.checkNotNull(string2);
        C44851r0 c44851r0M16634r3 = m16634r3();
        if (c44851r0M16634r3 != null && (baseTextView2 = c44851r0M16634r3.f100716h) != null) {
            baseTextView2.setText(string);
        }
        C44851r0 c44851r0M16634r4 = m16634r3();
        if (c44851r0M16634r4 != null && (baseTextView = c44851r0M16634r4.f100717i) != null) {
            baseTextView.setText(string2);
        }
    }

    /* JADX INFO: renamed from: x3 */
    public final void m16637x3(boolean z11) {
        LinearLayoutCompat linearLayoutCompat;
        C44851r0 c44851r0M16634r3 = m16634r3();
        if (c44851r0M16634r3 != null && (linearLayoutCompat = c44851r0M16634r3.f100710b) != null) {
            AssetExKt.m15138z(linearLayoutCompat, z11);
        }
    }
}
