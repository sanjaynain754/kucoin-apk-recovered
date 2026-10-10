package com.kubi.assets.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.blankj.utilcode.util.C5258a;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.KeyboardUtils;
import com.kubi.assets.AssetsLog;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.R$styleable;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.reactivex.functions.Action;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44775g6;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: AssetSearchView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001)B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\"\u001a\u00020\u001bH\u0014J\b\u0010#\u001a\u00020\u001bH\u0014J\b\u0010$\u001a\u00020\u001bH\u0002J\b\u0010%\u001a\u00020\u001bH\u0016J\u0010\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(H\u0016R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006*"}, m90084d2 = {"Lcom/kubi/assets/view/AssetSearchView;", "Landroid/widget/FrameLayout;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Lcom/blankj/utilcode/util/KeyboardUtils$OnSoftInputChangedListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/ViewSearchWidgetBinding;", "getBinding", "()Lcom/kubi/assets/databinding/ViewSearchWidgetBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "wrapperView", "Lcom/kubi/assets/view/AssetSearchView$ViewWrapper;", "getWrapperView", "()Lcom/kubi/assets/view/AssetSearchView$ViewWrapper;", "wrapperView$delegate", "Lkotlin/Lazy;", "animator", "Landroid/animation/ObjectAnimator;", "getEtSearchView", "Lcom/kubi/resources/widget/ClearEditText;", "initView", "", "showInputCallBack", "Lio/reactivex/functions/Action;", "getShowInputCallBack", "()Lio/reactivex/functions/Action;", "setShowInputCallBack", "(Lio/reactivex/functions/Action;)V", "onAttachedToWindow", "onDetachedFromWindow", "hideInputView", "onScrollChanged", "onSoftInputChanged", "height", "", "ViewWrapper", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetSearchView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetSearchView.kt\ncom/kubi/assets/view/AssetSearchView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n52#2:132\n80#2,7:133\n30#3:140\n91#3,14:141\n30#3:156\n91#3,14:157\n1#4:155\n*S KotlinDebug\n*F\n+ 1 AssetSearchView.kt\ncom/kubi/assets/view/AssetSearchView\n*L\n32#1:132\n32#1:133,7\n102#1:140\n102#1:141,14\n64#1:156\n64#1:157,14\n*E\n"})
public final class AssetSearchView extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, KeyboardUtils.InterfaceC5235b {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ KProperty<Object>[] f19076f = {Reflection.property1(new PropertyReference1Impl(AssetSearchView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/ViewSearchWidgetBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f19077b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f19078c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public ObjectAnimator f19079d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Action f19080e;

    /* JADX INFO: compiled from: AssetSearchView.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/assets/view/AssetSearchView$ViewWrapper;", "", "mTarget", "Lcom/kubi/resources/widget/ClearEditText;", "<init>", "(Lcom/kubi/resources/widget/ClearEditText;)V", "getMTarget", "()Lcom/kubi/resources/widget/ClearEditText;", "width", "", "trueWidth", "getTrueWidth", "()I", "setTrueWidth", "(I)V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ViewWrapper {

        @NotNull
        private final ClearEditText mTarget;

        public ViewWrapper(@NotNull ClearEditText mTarget) {
            Intrinsics.checkNotNullParameter(mTarget, "mTarget");
            this.mTarget = mTarget;
        }

        @NotNull
        public final ClearEditText getMTarget() {
            return this.mTarget;
        }

        public final int getTrueWidth() {
            return this.mTarget.getLayoutParams().width;
        }

        public final void setTrueWidth(int i11) {
            this.mTarget.getLayoutParams().width = i11;
            this.mTarget.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.view.AssetSearchView$a */
    /* JADX INFO: compiled from: Animator.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\n"}, m90084d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core-ktx_release", "androidx/core/animation/AnimatorKt$doOnEnd$$inlined$addListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 AssetSearchView.kt\ncom/kubi/assets/view/AssetSearchView\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,123:1\n95#2:124\n103#3,4:125\n94#4:129\n93#5:130\n*E\n"})
    public static final class C11235a implements Animator.AnimatorListener {
        public C11235a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            ImageView imageView;
            ClearEditText clearEditText;
            ImageView imageView2;
            ViewPropertyAnimator viewPropertyAnimatorAnimate;
            ViewPropertyAnimator viewPropertyAnimatorAlpha;
            ViewPropertyAnimator duration;
            C44775g6 binding = AssetSearchView.this.getBinding();
            if (binding != null && (imageView2 = binding.f99999c) != null && (viewPropertyAnimatorAnimate = imageView2.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(200L)) != null) {
                duration.start();
            }
            C44775g6 binding2 = AssetSearchView.this.getBinding();
            if (binding2 != null && (clearEditText = binding2.f99998b) != null) {
                ViewExtKt.m66577h(clearEditText);
            }
            C44775g6 binding3 = AssetSearchView.this.getBinding();
            if (binding3 == null || (imageView = binding3.f99999c) == null) {
                return;
            }
            ViewExtKt.m66594y(imageView);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.view.AssetSearchView$b */
    /* JADX INFO: compiled from: Animator.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\n"}, m90084d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core-ktx_release", "androidx/core/animation/AnimatorKt$doOnEnd$$inlined$addListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 AssetSearchView.kt\ncom/kubi/assets/view/AssetSearchView\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,123:1\n95#2:124\n65#3,5:125\n94#4:130\n93#5:131\n*E\n"})
    public static final class C11236b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f19082a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C44775g6 f19083b;

        public C11236b(int i11, C44775g6 c44775g6) {
            this.f19082a = i11;
            this.f19083b = c44775g6;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            int i11 = this.f19082a;
            if (i11 != 0) {
                this.f19083b.f99998b.setHint(i11);
            }
            KeyboardUtils.m6041m(this.f19083b.f99998b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetSearchView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f19077b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44775g6>() { // from class: com.kubi.assets.view.AssetSearchView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44775g6 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44775g6.m99066a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.view_search_widget, this);
        m19976f(attrs);
        this.f19078c = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.view.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetSearchView.m19974h(this.f19185b);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m19973g(AssetSearchView assetSearchView, C44775g6 c44775g6, int i11, int i12) throws Exception {
        Action action = assetSearchView.f19080e;
        if (action != null) {
            action.run();
        }
        ImageView ivSearch = c44775g6.f99999c;
        Intrinsics.checkNotNullExpressionValue(ivSearch, "ivSearch");
        ViewExtKt.m66577h(ivSearch);
        ClearEditText etSearch = c44775g6.f99998b;
        Intrinsics.checkNotNullExpressionValue(etSearch, "etSearch");
        ViewExtKt.m66594y(etSearch);
        c44775g6.f99998b.setAlpha(1.0f);
        ObjectAnimator objectAnimator = assetSearchView.f19079d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(assetSearchView.getWrapperView(), "trueWidth", i11);
        assetSearchView.f19079d = objectAnimatorOfInt;
        if (objectAnimatorOfInt != null) {
            objectAnimatorOfInt.setDuration(200L);
        }
        ObjectAnimator objectAnimator2 = assetSearchView.f19079d;
        if (objectAnimator2 != null) {
            objectAnimator2.addListener(new C11236b(i12, c44775g6));
        }
        ObjectAnimator objectAnimator3 = assetSearchView.f19079d;
        if (objectAnimator3 != null) {
            objectAnimator3.start();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C44775g6 getBinding() {
        return (C44775g6) this.f19077b.getValue(this, f19076f[0]);
    }

    private final ViewWrapper getWrapperView() {
        return (ViewWrapper) this.f19078c.getValue();
    }

    @Override // com.blankj.utilcode.util.KeyboardUtils.InterfaceC5235b
    /* JADX INFO: renamed from: a */
    public void mo6045a(int i11) {
        if (i11 <= 0) {
            m19975e();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getShowInputCallBack, reason: from getter */
    public final Action getF19080e() {
        return this.f19080e;
    }

    public final void setShowInputCallBack(@Nullable Action action) {
        this.f19080e = action;
    }

    /* JADX INFO: renamed from: h */
    public static final ViewWrapper m19974h(AssetSearchView assetSearchView) {
        C44775g6 binding = assetSearchView.getBinding();
        if (binding != null) {
            ClearEditText etSearch = binding.f99998b;
            Intrinsics.checkNotNullExpressionValue(etSearch, "etSearch");
            return new ViewWrapper(etSearch);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m19975e() {
        Editable text;
        ClearEditText clearEditText;
        ClearEditText clearEditText2;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ClearEditText clearEditText3;
        C44775g6 binding = getBinding();
        if (binding != null && (clearEditText3 = binding.f99998b) != null) {
            text = clearEditText3.getText();
        } else {
            text = null;
        }
        if (text != null && text.length() != 0) {
            return;
        }
        ObjectAnimator objectAnimator = this.f19079d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(getWrapperView(), "trueWidth", C5275i0.m6236a(0.0f));
        this.f19079d = objectAnimatorOfInt;
        if (objectAnimatorOfInt != null) {
            objectAnimatorOfInt.setDuration(200L);
        }
        ObjectAnimator objectAnimator2 = this.f19079d;
        if (objectAnimator2 != null) {
            objectAnimator2.addListener(new C11235a());
        }
        C44775g6 binding2 = getBinding();
        if (binding2 != null && (clearEditText2 = binding2.f99998b) != null && (viewPropertyAnimatorAnimate = clearEditText2.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.0f)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(200L)) != null) {
            duration.start();
        }
        C44775g6 binding3 = getBinding();
        if (binding3 != null && (clearEditText = binding3.f99998b) != null) {
            clearEditText.setHint("");
        }
        ObjectAnimator objectAnimator3 = this.f19079d;
        if (objectAnimator3 != null) {
            objectAnimator3.start();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m19976f(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.AssetSearchView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        final int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AssetSearchView_trueWidth, C5275i0.m6236a(132.0f));
        final int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AssetSearchView_searchHintText, R$string.search);
        typedArrayObtainStyledAttributes.recycle();
        final C44775g6 binding = getBinding();
        if (binding != null) {
            ImageView ivSearch = binding.f99999c;
            Intrinsics.checkNotNullExpressionValue(ivSearch, "ivSearch");
            C27046k.m66711z(ivSearch, 0L, new Function0() { // from class: com.kubi.assets.view.x
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetSearchView.m19973g(this.f19187b, binding, dimensionPixelSize, resourceId);
                }
            }, 1, null);
        }
    }

    @Nullable
    public final ClearEditText getEtSearchView() {
        C44775g6 binding = getBinding();
        if (binding != null) {
            return binding.f99998b;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                KeyboardUtils.m6038j(activityM6125h, this);
                Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object objM103844constructorimpl;
        Window window;
        super.onDetachedFromWindow();
        try {
            Result.Companion companion = Result.INSTANCE;
            Activity activityM6125h = C5258a.m6125h();
            if (activityM6125h != null && (window = activityM6125h.getWindow()) != null) {
                KeyboardUtils.m6044p(window);
            } else {
                window = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(window);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            AssetsLog.Home.m15236i("Application is not alive, skipping unregister");
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        C44775g6 binding = getBinding();
        if (binding != null) {
            KeyboardUtils.m6034f(binding.f99998b);
        }
    }
}
