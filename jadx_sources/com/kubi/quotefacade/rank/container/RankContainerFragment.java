package com.kubi.quotefacade.rank.container;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import bv.C4704y;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.mvi.state.LazySimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.entity.RankEntity;
import com.kubi.quotefacade.favorites.C21938a1;
import com.kubi.quotefacade.helper.QuoteKV;
import com.kubi.quotefacade.rank.NewRankRedDotHelper;
import com.kubi.quotefacade.rank.config.RankConfig;
import com.kubi.quotefacade.rank.config.RankSubTabItemConfig;
import com.kubi.quotefacade.rank.config.RankTabConfig;
import com.kubi.quotefacade.rank.list.RankListFragment;
import com.kubi.quotefacade.view.NoScrollQuoteViewPager;
import com.kubi.resources.widget.flyco.RankSlidingTabLayout;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p025av.C4391b;
import p025av.C4392c;
import p208dr.InterfaceC36952a;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: RankContainerFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0007*\u00013\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0011H\u0002J\b\u0010%\u001a\u00020\"H\u0016J\b\u0010&\u001a\u00020\"H\u0002J\b\u0010'\u001a\u00020\"H\u0002J\b\u0010(\u001a\u00020\"H\u0016J\u0010\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+H\u0014J\u0018\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020/H\u0007J\u0018\u00100\u001a\u00020\"2\u0006\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00101\u001a\u00020 2\u0006\u0010-\u001a\u00020\fH\u0002J\u0010\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020 H\u0002J\u0010\u00107\u001a\u00020\"2\u0006\u0010-\u001a\u00020\fH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0010\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0004\n\u0002\u00104¨\u00069"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/container/RankContainerFragment;", "Lcom/kubi/mvi/state/LazySimpleStateFragment;", "Lcom/kubi/quotefacade/rank/container/RankContainerContract$UIState;", "<init>", "()V", "tabConfig", "Lcom/kubi/quotefacade/rank/config/RankTabConfig;", "getTabConfig", "()Lcom/kubi/quotefacade/rank/config/RankTabConfig;", "tabConfig$delegate", "Lkotlin/Lazy;", "positionType", "", "getPositionType", "()Ljava/lang/String;", "positionType$delegate", "binding", "Lcom/kubi/quotefacade/databinding/FragmentRankContainerBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentRankContainerBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "titleList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/quotefacade/rank/container/RankContainerVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "doOnLazyInitView", "", "updateDiffUi", "vb", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "initViewPager", "initObserver", "onDestroyView", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "testUpdateNewTabRedDot", "subType", TIMPushProvider.f75062n, "", "updateNewTabRedDot", "getTabIndexBySubType", "onPageChangeListener", "com/kubi/quotefacade/rank/container/RankContainerFragment$onPageChangeListener$1", "Lcom/kubi/quotefacade/rank/container/RankContainerFragment$onPageChangeListener$1;", "cacheCurrentTab", ViewProps.POSITION, "trackRankTabClick", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRankContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankContainerFragment.kt\ncom/kubi/quotefacade/rank/container/RankContainerFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 5 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 6 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,234:1\n147#2,16:235\n1869#3,2:251\n1869#3,2:253\n360#3,7:259\n1869#3,2:268\n295#3,2:270\n93#4,4:255\n15#5,2:266\n23#6,2:272\n*S KotlinDebug\n*F\n+ 1 RankContainerFragment.kt\ncom/kubi/quotefacade/rank/container/RankContainerFragment\n*L\n54#1:235,16\n138#1:251,2\n149#1:253,2\n185#1:259,7\n117#1:268,2\n213#1:270,2\n157#1:255,4\n211#1:266,2\n219#1:272,2\n*E\n"})
public final class RankContainerFragment extends LazySimpleStateFragment<RankContainerContract$UIState> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f42433Z = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.rank.container.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RankContainerFragment.m52755R3(this.f42442b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f42434a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.rank.container.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RankContainerFragment.m52754Q3(this.f42443b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final InterfaceC24293a f42435b0 = C45681e.m100799e(this, new Function1<RankContainerFragment, C4704y>() { // from class: com.kubi.quotefacade.rank.container.RankContainerFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4704y invoke(@NotNull RankContainerFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            View viewM42558q3 = this.this$0.m42558q3();
            Intrinsics.checkNotNullExpressionValue(viewM42558q3, "access$getLazyFragContentView(...)");
            return C4704y.m4720a(viewM42558q3);
        }

        {
            super(1);
        }
    }, new Function1<C4704y, Unit>() { // from class: com.kubi.quotefacade.rank.container.RankContainerFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4704y it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4704y c4704y) {
            invoke(c4704y);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final ArrayList<CharSequence> f42436c0 = new ArrayList<>();

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final C22447a f42437d0 = new C22447a();

    /* JADX INFO: renamed from: f0 */
    public static final /* synthetic */ KProperty<Object>[] f42432f0 = {Reflection.property1(new PropertyReference1Impl(RankContainerFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentRankContainerBinding;", 0))};

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public static final Companion f42431e0 = new Companion(null);

    /* JADX INFO: compiled from: RankContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/container/RankContainerFragment$Companion;", "", "<init>", "()V", "TAB_CONFIG", "", "instance", "Lcom/kubi/quotefacade/rank/container/RankContainerFragment;", "tabConfig", "Lcom/kubi/quotefacade/rank/config/RankTabConfig;", "positionType", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final RankContainerFragment instance(@NotNull RankTabConfig tabConfig, @Nullable String positionType) {
            Intrinsics.checkNotNullParameter(tabConfig, "tabConfig");
            RankContainerFragment rankContainerFragment = new RankContainerFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("rank_tab_config", tabConfig);
            bundle.putString("positionType", positionType);
            rankContainerFragment.setArguments(bundle);
            return rankContainerFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.rank.container.RankContainerFragment$a */
    /* JADX INFO: compiled from: RankContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/quotefacade/rank/container/RankContainerFragment$onPageChangeListener$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22447a extends ViewPager.SimpleOnPageChangeListener {
        public C22447a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) throws JSONException {
            String type;
            C4704y c4704yM52764H3;
            RankSlidingTabLayout rankSlidingTabLayout;
            if (RankContainerFragment.this.m52765J3().isNewRankTab() && (c4704yM52764H3 = RankContainerFragment.this.m52764H3()) != null && (rankSlidingTabLayout = c4704yM52764H3.f4627b) != null) {
                rankSlidingTabLayout.m55226r(position);
            }
            RankContainerFragment.this.m52763F3(position);
            RankSubTabItemConfig rankSubTabItemConfig = (RankSubTabItemConfig) CollectionsKt.getOrNull(RankContainerFragment.this.m52765J3().getSubTabs(), position);
            if (rankSubTabItemConfig == null || (type = rankSubTabItemConfig.getType()) == null) {
                return;
            }
            RankContainerFragment.this.m52767S3(type);
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.rank.container.RankContainerFragment$b */
    /* JADX INFO: compiled from: RankContainerFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22448b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f42439b;

        public C22448b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f42439b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f42439b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f42439b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.rank.container.RankContainerFragment$onShow$1 */
    /* JADX INFO: compiled from: RankContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.rank.container.RankContainerFragment$onShow$1", m90122f = "RankContainerFragment.kt", m90123i = {0}, m90124l = {99}, m90125m = "invokeSuspend", m90126n = {"index"}, m90127s = {"I$0"})
    @SourceDebugExtension({"SMAP\nRankContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankContainerFragment.kt\ncom/kubi/quotefacade/rank/container/RankContainerFragment$onShow$1\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,234:1\n32#2:235\n*S KotlinDebug\n*F\n+ 1 RankContainerFragment.kt\ncom/kubi/quotefacade/rank/container/RankContainerFragment$onShow$1\n*L\n98#1:235\n*E\n"})
    public static final class C224491 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int I$0;
        int label;

        /* JADX INFO: renamed from: com.kubi.quotefacade.rank.container.RankContainerFragment$onShow$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: RankContainerFragment.kt */
        @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.quotefacade.rank.container.RankContainerFragment$onShow$1$1", m90122f = "RankContainerFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            final /* synthetic */ int $index;
            int label;
            final /* synthetic */ RankContainerFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(int i11, RankContainerFragment rankContainerFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$index = i11;
                this.this$0 = rankContainerFragment;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$index, this.this$0, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                C4704y c4704yM52764H3;
                NoScrollQuoteViewPager noScrollQuoteViewPager;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.$index > -1 && (c4704yM52764H3 = this.this$0.m52764H3()) != null && (noScrollQuoteViewPager = c4704yM52764H3.f4629d) != null) {
                        noScrollQuoteViewPager.setCurrentItem(this.$index, false);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public C224491(Continuation<? super C224491> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RankContainerFragment.this.new C224491(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C224491) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                RankContainerFragment rankContainerFragment = RankContainerFragment.this;
                String strM4007e = C4391b.f3820a.m4007e();
                if (StringsKt.isBlank(strM4007e)) {
                    strM4007e = null;
                }
                if (strM4007e == null) {
                    strM4007e = C46392a.m102326h(QuoteKV.f42044a.m52057q(), "");
                }
                int iM52766K3 = rankContainerFragment.m52766K3(strM4007e);
                AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(iM52766K3, RankContainerFragment.this, null);
                this.I$0 = iM52766K3;
                this.label = 1;
                if (C41686h.m91049g(abstractC41697j0M94121c, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: G3 */
    public static final void m52747G3(RankContainerFragment rankContainerFragment, int i11) {
        Object next;
        String type;
        CharSequence charSequence = (CharSequence) CollectionsKt.getOrNull(rankContainerFragment.f42436c0, i11);
        if (charSequence == null) {
            return;
        }
        Iterator<T> it = rankContainerFragment.m52765J3().getSubTabs().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((RankSubTabItemConfig) next).getTabName(), charSequence));
        RankSubTabItemConfig rankSubTabItemConfig = (RankSubTabItemConfig) next;
        if (rankSubTabItemConfig == null || (type = rankSubTabItemConfig.getType()) == null) {
            type = "";
        }
        if (StringsKt.isBlank(type)) {
            return;
        }
        C4391b.f3820a.m4012j(type);
        C46392a.m102333p(QuoteKV.f42044a.m52057q(), type);
    }

    /* JADX INFO: renamed from: I3 */
    private final String m52748I3() {
        return (String) this.f42434a0.getValue();
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m52750M3(RankContainerFragment rankContainerFragment, RankSubTabItemConfig rankSubTabItemConfig, List list) {
        rankContainerFragment.sendIntent(new RankContainerContract$UiIntent.CheckToShowNewTabRedDot(rankSubTabItemConfig.getType()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    private final void m52751N3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.rank.container.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankContainerFragment.m52752O3(this.f42444b);
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public final void m52763F3(final int i11) {
        C42917g.m94137c().execute(new Runnable() { // from class: com.kubi.quotefacade.rank.container.g
            @Override // java.lang.Runnable
            public final void run() {
                RankContainerFragment.m52747G3(this.f42447b, i11);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public final C4704y m52764H3() {
        return (C4704y) this.f42435b0.getValue(this, f42432f0[0]);
    }

    /* JADX INFO: renamed from: J3 */
    public final RankTabConfig m52765J3() {
        return (RankTabConfig) this.f42433Z.getValue();
    }

    /* JADX INFO: renamed from: S3 */
    public final void m52767S3(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rankTab", m52765J3().getRankType());
        jSONObject.put("subTab", str);
        jSONObject.put("from", C4392c.m4013a(m52748I3()) ? "homePage" : C33556b3.f68963J);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(HomeCardViewHolderProxy.PAGE_ID, "hotRankFlow", "3", jSONObject);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C22451a) {
            C22451a c22451a = (C22451a) singleEvent;
            if (getView() == null) {
                return;
            }
            m52769U3(c22451a.getF42440a(), c22451a.getF42441b());
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_rank_container;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<RankContainerVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(RankContainerVM.class);
    }

    /* JADX INFO: renamed from: L3 */
    private final void m52749L3() {
        if (m52765J3().isNewRankTab()) {
            for (final RankSubTabItemConfig rankSubTabItemConfig : m52765J3().getSubTabs()) {
                MutableLiveData<List<RankEntity>> mutableLiveDataM52640h = NewRankRedDotHelper.f42388a.m52640h(rankSubTabItemConfig.getType());
                if (mutableLiveDataM52640h != null) {
                    mutableLiveDataM52640h.observe(getViewLifecycleOwner(), new C22448b(new Function1() { // from class: com.kubi.quotefacade.rank.container.f
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RankContainerFragment.m52750M3(this.f42445b, rankSubTabItemConfig, (List) obj);
                        }
                    }));
                }
            }
        }
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m52752O3(RankContainerFragment rankContainerFragment) {
        C4704y c4704yM52764H3 = rankContainerFragment.m52764H3();
        if (c4704yM52764H3 == null) {
            return Unit.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        rankContainerFragment.f42436c0.clear();
        for (RankSubTabItemConfig rankSubTabItemConfig : rankContainerFragment.m52765J3().getSubTabs()) {
            rankContainerFragment.f42436c0.add(rankSubTabItemConfig.getTabName());
            arrayList.add(RankListFragment.f42475k0.instance(rankContainerFragment.m52765J3().getRankType(), rankSubTabItemConfig, rankContainerFragment.m52748I3()));
        }
        c4704yM52764H3.f4627b.setNeedBold(true);
        NoScrollQuoteViewPager noScrollQuoteViewPager = c4704yM52764H3.f4629d;
        FragmentManager childFragmentManager = rankContainerFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        noScrollQuoteViewPager.setAdapter(new C27103z(childFragmentManager, arrayList, rankContainerFragment.f42436c0));
        c4704yM52764H3.f4627b.setViewPager(c4704yM52764H3.f4629d);
        c4704yM52764H3.f4629d.setOffscreenPageLimit(arrayList.size());
        c4704yM52764H3.f4629d.addOnPageChangeListener(rankContainerFragment.f42437d0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m52753P3() {
        C21938a1.m51383b();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final String m52754Q3(RankContainerFragment rankContainerFragment) {
        Bundle arguments = rankContainerFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("positionType");
        }
        return null;
    }

    /* JADX INFO: renamed from: R3 */
    public static final RankTabConfig m52755R3(RankContainerFragment rankContainerFragment) {
        RankTabConfig rankTabConfig;
        Bundle arguments = rankContainerFragment.getArguments();
        if (arguments != null && (rankTabConfig = (RankTabConfig) arguments.getParcelable("rank_tab_config")) != null) {
            return rankTabConfig;
        }
        return RankConfig.f42417a.m52734l();
    }

    /* JADX INFO: renamed from: K3 */
    public final int m52766K3(String str) {
        Iterator<RankSubTabItemConfig> it = m52765J3().getSubTabs().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next().getType(), str)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: T3 */
    public final void m52768T3(C4704y c4704y) {
        if (!C4392c.m4013a(m52748I3())) {
            return;
        }
        int iM66658b = C27040e.m66658b(12);
        c4704y.f4627b.setPadding(iM66658b, 0, iM66658b, 0);
    }

    /* JADX INFO: renamed from: U3 */
    public final void m52769U3(String str, boolean z11) {
        C4704y c4704yM52764H3;
        RankSlidingTabLayout rankSlidingTabLayout;
        int iM52766K3;
        if (m52765J3().isNewRankTab() && (c4704yM52764H3 = m52764H3()) != null && (rankSlidingTabLayout = c4704yM52764H3.f4627b) != null && (iM52766K3 = m52766K3(str)) >= 0) {
            if (iM52766K3 != rankSlidingTabLayout.getCurrentTab() && z11) {
                rankSlidingTabLayout.m55233y(iM52766K3);
            } else {
                rankSlidingTabLayout.m55226r(iM52766K3);
            }
        }
    }

    @Override // com.kubi.mvi.state.LazyBaseStateFragment
    /* JADX INFO: renamed from: o3 */
    public void mo42556o3() {
        m52751N3();
        m52749L3();
        C4704y c4704yM52764H3 = m52764H3();
        if (c4704yM52764H3 != null) {
            m52768T3(c4704yM52764H3);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (m52765J3().isNewRankTab()) {
            Iterator<T> it = m52765J3().getSubTabs().iterator();
            while (it.hasNext()) {
                MutableLiveData<List<RankEntity>> mutableLiveDataM52640h = NewRankRedDotHelper.f42388a.m52640h(((RankSubTabItemConfig) it.next()).getType());
                if (mutableLiveDataM52640h != null) {
                    mutableLiveDataM52640h.removeObservers(getViewLifecycleOwner());
                }
            }
        }
    }

    @Override // com.kubi.mvi.state.LazyBaseStateFragment, com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        int i11;
        super.onShow();
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94120b(), null, new C224491(null), 2, null);
        C4704y c4704yM52764H3 = m52764H3();
        if (c4704yM52764H3 != null && (linearLayout2 = c4704yM52764H3.f4628c) != null) {
            if (C21938a1.m51382a()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            linearLayout2.setVisibility(i11);
        }
        C4704y c4704yM52764H4 = m52764H3();
        if (c4704yM52764H4 != null && (linearLayout = c4704yM52764H4.f4628c) != null) {
            C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.quotefacade.rank.container.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RankContainerFragment.m52753P3();
                }
            }, 1, null);
        }
    }
}
