package com.kubi.assets.sort;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.AccountTabSortOldFragment;
import com.kubi.assets.R$color;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p569qq.C43852m;
import p637ta.C44723a2;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: AccountTabSortSettingFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020#H\u0014J\b\u0010%\u001a\u00020#H\u0002J\b\u0010&\u001a\u00020#H\u0002J\b\u0010'\u001a\u00020#H\u0014J\u0010\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020*H\u0014J\u0010\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020\u001bH\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u00150\u00148TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, m90084d2 = {"Lcom/kubi/assets/sort/AccountTabSortSettingFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/assets/sort/AccountTabSortContract$UIState;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetSortSettingFragmentBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetSortSettingFragmentBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adapter", "Lcom/kubi/assets/sort/AccountTabSortAdapter;", "getAdapter", "()Lcom/kubi/assets/sort/AccountTabSortAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "previewLayoutHelper", "Lcom/kubi/assets/sort/AccountPreviewTabLayoutHelper;", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "pageId", "", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "hasChangedMode", "", "onDestroy", "", "initView", "showHandGuideIfNeeded", "dismissHandGuide", "bindState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "clickTrack", "sortMode", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountTabSortSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountTabSortSettingFragment.kt\ncom/kubi/assets/sort/AccountTabSortSettingFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,286:1\n147#2,16:287\n32#3:303\n136#3:304\n126#3,2:305\n65#4,4:307\n37#4:311\n53#4:312\n72#4:313\n*S KotlinDebug\n*F\n+ 1 AccountTabSortSettingFragment.kt\ncom/kubi/assets/sort/AccountTabSortSettingFragment\n*L\n60#1:287,16\n77#1:303\n154#1:304\n157#1:305,2\n161#1:307,4\n161#1:311\n161#1:312\n161#1:313\n*E\n"})
public final class AccountTabSortSettingFragment extends SimpleStateFragment<UIState> {

    /* JADX INFO: renamed from: W */
    @Nullable
    public AccountPreviewTabLayoutHelper f18761W;

    /* JADX INFO: renamed from: Y */
    public boolean f18763Y;

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f18758a0 = {Reflection.property1(new PropertyReference1Impl(AccountTabSortSettingFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetSortSettingFragmentBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f18757Z = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f18759U = C45681e.m100799e(this, new Function1<AccountTabSortSettingFragment, C44723a2>() { // from class: com.kubi.assets.sort.AccountTabSortSettingFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44723a2 invoke(@NotNull AccountTabSortSettingFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44723a2.m98956a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44723a2, Unit>() { // from class: com.kubi.assets.sort.AccountTabSortSettingFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44723a2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44723a2 c44723a2) {
            invoke(c44723a2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f18760V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.sort.s
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AccountTabSortSettingFragment.m19305w3();
        }
    });

    /* JADX INFO: renamed from: X */
    @Nullable
    public String f18762X = "B1functionSortSetPage";

    /* JADX INFO: compiled from: AccountTabSortSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountTabSortSettingFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "launchPageOnCase", "", "context", "Landroid/content/Context;", "launchPage", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void launchPage(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            BaseActivity.Companion companion = BaseActivity.INSTANCE;
            String string = context.getString(R$string.kc_asset_sort_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            companion.launch(context, AccountTabSortSettingFragment.class, string);
        }

        public final void launchPageOnCase(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (C10997l.m19368a()) {
                launchPage(context);
            } else {
                AccountTabSortOldFragment.f16312Z.launchPage(context);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.sort.AccountTabSortSettingFragment$a */
    /* JADX INFO: compiled from: View.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "left", "", ViewProps.TOP, "right", ViewProps.BOTTOM, "oldLeft", "oldTop", "oldRight", "oldBottom", "core-ktx_release", "androidx/core/view/ViewKt$doOnLayout$$inlined$doOnNextLayout$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 AccountTabSortSettingFragment.kt\ncom/kubi/assets/sort/AccountTabSortSettingFragment\n*L\n1#1,414:1\n69#2:415\n70#2:418\n162#3,2:416\n*E\n"})
    public static final class ViewOnLayoutChangeListenerC10971a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C44723a2 f18764b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f18765c;

        public ViewOnLayoutChangeListenerC10971a(C44723a2 c44723a2, int i11) {
            this.f18764b = c44723a2;
            this.f18765c = i11;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            view.removeOnLayoutChangeListener(this);
            this.f18764b.f99556h.setY(view.getTop() + this.f18765c);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.sort.AccountTabSortSettingFragment$b */
    /* JADX INFO: compiled from: AccountTabSortSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/assets/sort/AccountTabSortSettingFragment$showHandGuideIfNeeded$2$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C10972b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LottieAnimationView f18766a;

        public C10972b(LottieAnimationView lottieAnimationView) {
            this.f18766a = lottieAnimationView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.f18766a.setVisibility(8);
            this.f18766a.removeAllAnimatorListeners();
            this.f18766a.removeAllUpdateListeners();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.sort.AccountTabSortSettingFragment$bindState$10 */
    /* JADX INFO: compiled from: AccountTabSortSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "msg", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.sort.AccountTabSortSettingFragment$bindState$10", m90122f = "AccountTabSortSettingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1097410 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C1097410(Continuation<? super C1097410> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1097410 c1097410 = AccountTabSortSettingFragment.this.new C1097410(continuation);
            c1097410.L$0 = obj;
            return c1097410;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C1097410) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (str != null && str.length() != 0) {
                BaseFragment.showFailView$default(AccountTabSortSettingFragment.this, 0, 0, (View.OnClickListener) null, 7, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.sort.AccountTabSortSettingFragment$bindState$2 */
    /* JADX INFO: compiled from: AccountTabSortSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "isLoading", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.sort.AccountTabSortSettingFragment$bindState$2", m90122f = "AccountTabSortSettingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C109752 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C109752(Continuation<? super C109752> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C109752 c109752 = AccountTabSortSettingFragment.this.new C109752(continuation);
            c109752.Z$0 = ((Boolean) obj).booleanValue();
            return c109752;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C109752) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (z11) {
                BaseFragment.showLoadingView$default(AccountTabSortSettingFragment.this, 0, 0, 3, null);
            } else {
                AccountTabSortSettingFragment.this.showContentView();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.sort.AccountTabSortSettingFragment$bindState$4 */
    /* JADX INFO: compiled from: AccountTabSortSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "mode", "Lcom/kubi/assets/sort/DisplayMode;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.sort.AccountTabSortSettingFragment$bindState$4", m90122f = "AccountTabSortSettingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C109774 extends SuspendLambda implements Function2<DisplayMode, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(DisplayMode displayMode, Continuation<? super Unit> continuation) {
            return ((C109774) create(displayMode, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.kubi.assets.sort.AccountTabSortSettingFragment$bindState$4$a */
        /* JADX INFO: compiled from: AccountTabSortSettingFragment.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DisplayMode.values().length];
                try {
                    iArr[DisplayMode.RECOMMEND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DisplayMode.SIMPLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DisplayMode.ALL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C109774(Continuation<? super C109774> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C109774 c109774 = AccountTabSortSettingFragment.this.new C109774(continuation);
            c109774.L$0 = obj;
            return c109774;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            DisplayMode displayMode = (DisplayMode) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44723a2 c44723a2M19307A3 = AccountTabSortSettingFragment.this.m19307A3();
            if (c44723a2M19307A3 != null) {
                c44723a2M19307A3.f99558j.f101234f.setChecked(false);
                c44723a2M19307A3.f99558j.f101235g.setChecked(false);
                c44723a2M19307A3.f99558j.f101233e.setChecked(false);
                int[] iArr = a.$EnumSwitchMapping$0;
                int i11 = iArr[displayMode.ordinal()];
                if (i11 == 1) {
                    c44723a2M19307A3.f99558j.f101234f.setChecked(true);
                } else if (i11 == 2) {
                    c44723a2M19307A3.f99558j.f101235g.setChecked(true);
                } else {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c44723a2M19307A3.f99558j.f101233e.setChecked(true);
                }
                int i12 = iArr[displayMode.ordinal()];
                if (i12 == 1) {
                    c44723a2M19307A3.f99555g.setVisibility(0);
                    c44723a2M19307A3.f99561m.setText(R$string.kc_asset_sort_mode_recommend_desc);
                } else if (i12 == 2) {
                    c44723a2M19307A3.f99555g.setVisibility(0);
                    c44723a2M19307A3.f99561m.setText(R$string.kc_asset_sort_mode_simple_desc);
                } else {
                    if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c44723a2M19307A3.f99555g.setVisibility(8);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.sort.AccountTabSortSettingFragment$bindState$6 */
    /* JADX INFO: compiled from: AccountTabSortSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "sortType", "Lcom/kubi/assets/sort/SortType;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.sort.AccountTabSortSettingFragment$bindState$6", m90122f = "AccountTabSortSettingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C109796 extends SuspendLambda implements Function2<SortType, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SortType sortType, Continuation<? super Unit> continuation) {
            return ((C109796) create(sortType, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C109796(Continuation<? super C109796> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C109796 c109796 = AccountTabSortSettingFragment.this.new C109796(continuation);
            c109796.L$0 = obj;
            return c109796;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SortType sortType = (SortType) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44723a2 c44723a2M19307A3 = AccountTabSortSettingFragment.this.m19307A3();
            if (c44723a2M19307A3 != null) {
                AccountTabSortSettingFragment accountTabSortSettingFragment = AccountTabSortSettingFragment.this;
                int color = sortType == SortType.VALUE_DESC ? accountTabSortSettingFragment.getResources().getColor(R$color.brandGreen, null) : accountTabSortSettingFragment.getResources().getColor(R$color.c_icon60, null);
                AppCompatImageView ivSortIcon = c44723a2M19307A3.f99552d;
                Intrinsics.checkNotNullExpressionValue(ivSortIcon, "ivSortIcon");
                C27046k.m66701p(ivSortIcon, color);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.sort.AccountTabSortSettingFragment$bindState$8 */
    /* JADX INFO: compiled from: AccountTabSortSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "accounts", "", "Lcom/kubi/assets/sort/AccountTabSortData;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.sort.AccountTabSortSettingFragment$bindState$8", m90122f = "AccountTabSortSettingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C109818 extends SuspendLambda implements Function2<List<? extends AccountTabSortData>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends AccountTabSortData> list, Continuation<? super Unit> continuation) {
            return invoke2((List<AccountTabSortData>) list, continuation);
        }

        public C109818(Continuation<? super C109818> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C109818 c109818 = AccountTabSortSettingFragment.this.new C109818(continuation);
            c109818.L$0 = obj;
            return c109818;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<AccountTabSortData> list, Continuation<? super Unit> continuation) {
            return ((C109818) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<AccountTabSortData> list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccountTabSortSettingFragment.this.m19310z3().m19285u(AccountTabSortManager.f18789a.m19363f(), list).m19284t(AccountTabSortSettingFragment.this.f18761W);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: x3 */
    private final void m19306x3(String str) {
        this.f18763Y = true;
        C43852m.m96590b("B1functionSortSetPage", "sortModeSelect", "1", TuplesKt.m90091to("after_click_element_value", str));
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m19294G3(AccountTabSortSettingFragment accountTabSortSettingFragment, List accounts) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        accountTabSortSettingFragment.sendIntent(new AccountTabSortContract$UiIntent.OnSortChanged(accounts));
        AccountPreviewTabLayoutHelper accountPreviewTabLayoutHelper = accountTabSortSettingFragment.f18761W;
        if (accountPreviewTabLayoutHelper != null) {
            accountPreviewTabLayoutHelper.m19348f(accounts, AccountTabSortManager.f18789a.m19363f());
        }
        C43852m.m96591c("B1functionSortSetPage", TypedValues.Custom.NAME, "1", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w3 */
    public static final AccountTabSortAdapter m19305w3() {
        return new AccountTabSortAdapter(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: A3 */
    public final C44723a2 m19307A3() {
        return (C44723a2) this.f18759U.getValue(this, f18758a0[0]);
    }

    /* JADX INFO: renamed from: H3 */
    public final void m19308H3() {
        C44723a2 c44723a2M19307A3;
        C42153h c42153h = C42153h.f93593a;
        if (C46392a.m102322d(c42153h.m92512b(), false) || (c44723a2M19307A3 = m19307A3()) == null) {
            return;
        }
        C46392a.m102328k(c42153h.m92512b(), true);
        int i11 = (int) (32 * getResources().getDisplayMetrics().density);
        RecyclerView recyclerView = c44723a2M19307A3.f99557i;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC10971a(c44723a2M19307A3, i11));
        } else {
            c44723a2M19307A3.f99556h.setY(recyclerView.getTop() + i11);
        }
        LottieAnimationView lottieAnimationView = c44723a2M19307A3.f99556h;
        lottieAnimationView.setRepeatCount(1);
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.addAnimatorListener(new C10972b(lottieAnimationView));
        lottieAnimationView.playAnimation();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        if (singleEvent instanceof C10992g) {
            BaseFragment.hideLoadingDialog$default(this, false, 1, null);
        } else if (singleEvent instanceof LoadFailed) {
            showToast(((LoadFailed) singleEvent).getMessage());
        } else if (singleEvent instanceof C10993h) {
            showLoadingDialog();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.asset_sort_setting_fragment;
    }

    @Override // com.kubi.sdk.BaseFragment, p569qq.InterfaceC43845f
    @Nullable
    /* JADX INFO: renamed from: getPageId, reason: from getter */
    public String getF16318Y() {
        return this.f18762X;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(AccountTabSortSettingVM.class);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setPageId(@Nullable String str) {
        this.f18762X = str;
    }

    /* JADX INFO: renamed from: z3 */
    public final AccountTabSortAdapter m19310z3() {
        return (AccountTabSortAdapter) this.f18760V.getValue();
    }

    /* JADX INFO: renamed from: B3 */
    public static final void m19289B3(AccountTabSortSettingFragment accountTabSortSettingFragment, View view) {
        accountTabSortSettingFragment.m19309y3();
        accountTabSortSettingFragment.m19306x3("RECOMMEND");
        accountTabSortSettingFragment.sendIntent(new AccountTabSortContract$UiIntent.UpdateSortMode(DisplayMode.RECOMMEND));
    }

    /* JADX INFO: renamed from: C3 */
    public static final void m19290C3(AccountTabSortSettingFragment accountTabSortSettingFragment, View view) {
        accountTabSortSettingFragment.m19309y3();
        accountTabSortSettingFragment.m19306x3("SIMPLE");
        accountTabSortSettingFragment.sendIntent(new AccountTabSortContract$UiIntent.UpdateSortMode(DisplayMode.SIMPLE));
    }

    /* JADX INFO: renamed from: D3 */
    public static final void m19291D3(AccountTabSortSettingFragment accountTabSortSettingFragment, View view) {
        accountTabSortSettingFragment.m19309y3();
        accountTabSortSettingFragment.m19306x3("ALL");
        accountTabSortSettingFragment.sendIntent(new AccountTabSortContract$UiIntent.UpdateSortMode(DisplayMode.ALL));
    }

    /* JADX INFO: renamed from: E3 */
    public static final void m19292E3(AccountTabSortSettingFragment accountTabSortSettingFragment, View view) {
        accountTabSortSettingFragment.m19309y3();
        accountTabSortSettingFragment.sendIntent(AccountTabSortContract$UiIntent.SortByAssetValue.INSTANCE);
        C43852m.m96591c("B1functionSortSetPage", "valueDescending", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: F3 */
    public static final boolean m19293F3(AccountTabSortSettingFragment accountTabSortSettingFragment, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            accountTabSortSettingFragment.m19309y3();
            return false;
        }
        return false;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.sort.AccountTabSortSettingFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getIsLoading());
            }
        }, new C109752(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.sort.AccountTabSortSettingFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getDisplayMode();
            }
        }, new C109774(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.sort.AccountTabSortSettingFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getSortType();
            }
        }, new C109796(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.sort.AccountTabSortSettingFragment.bindState.7
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getAccountList();
            }
        }, new C109818(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.sort.AccountTabSortSettingFragment.bindState.9
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getErrorMsg();
            }
        }, new C1097410(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        super.initView();
        C44723a2 c44723a2M19307A3 = m19307A3();
        if (c44723a2M19307A3 != null) {
            c44723a2M19307A3.f99558j.f101234f.setClickable(false);
            c44723a2M19307A3.f99558j.f101235g.setClickable(false);
            c44723a2M19307A3.f99558j.f101233e.setClickable(false);
            c44723a2M19307A3.f99558j.f101231c.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.sort.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccountTabSortSettingFragment.m19289B3(this.f18792b, view);
                }
            });
            c44723a2M19307A3.f99558j.f101232d.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.sort.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccountTabSortSettingFragment.m19290C3(this.f18793b, view);
                }
            });
            c44723a2M19307A3.f99558j.f101230b.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.sort.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccountTabSortSettingFragment.m19291D3(this.f18794b, view);
                }
            });
            c44723a2M19307A3.f99554f.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.sort.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccountTabSortSettingFragment.m19292E3(this.f18795b, view);
                }
            });
            c44723a2M19307A3.f99557i.setLayoutManager(new LinearLayoutManager(getContext()));
            c44723a2M19307A3.f99557i.setAdapter(m19310z3());
            c44723a2M19307A3.f99557i.setOnTouchListener(new View.OnTouchListener() { // from class: com.kubi.assets.sort.q
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return AccountTabSortSettingFragment.m19293F3(this.f18796b, view, motionEvent);
                }
            });
            HorizontalScrollView flPreviewTabLayout = c44723a2M19307A3.f99551c;
            Intrinsics.checkNotNullExpressionValue(flPreviewTabLayout, "flPreviewTabLayout");
            LinearLayout tabContainer = c44723a2M19307A3.f99559k;
            Intrinsics.checkNotNullExpressionValue(tabContainer, "tabContainer");
            this.f18761W = new AccountPreviewTabLayoutHelper(flPreviewTabLayout, tabContainer);
            m19310z3().m19286v(c44723a2M19307A3.f99557i).m19287w(new Function1() { // from class: com.kubi.assets.sort.r
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountTabSortSettingFragment.m19294G3(this.f18797b, (List) obj);
                }
            });
        }
        sendIntent(AccountTabSortContract$UiIntent.LoadData.INSTANCE);
        m19308H3();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.f18763Y) {
            C43852m.m96590b("B1functionSortSetPage", "sortMode", "1", TuplesKt.m90091to("after_click_element_value", C46392a.m102326h(C42153h.f93593a.m92513c(), "")));
        }
    }

    /* JADX INFO: renamed from: y3 */
    public final void m19309y3() {
        LottieAnimationView lottieAnimationView;
        C44723a2 c44723a2M19307A3 = m19307A3();
        if (c44723a2M19307A3 != null && (lottieAnimationView = c44723a2M19307A3.f99556h) != null && lottieAnimationView.getVisibility() == 0) {
            lottieAnimationView.removeAllAnimatorListeners();
            lottieAnimationView.cancelAnimation();
            lottieAnimationView.setVisibility(8);
        }
    }
}
