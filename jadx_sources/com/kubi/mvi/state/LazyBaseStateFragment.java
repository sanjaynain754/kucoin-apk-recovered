package com.kubi.mvi.state;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: SimpleStateFragment.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000 %*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\u0014\b\u0002\u0010\u0005*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00062 \u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00060\u0007:\u0001%B\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010#\u001a\u00020!H\u0017J\b\u0010$\u001a\u00020!H&R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0014\u001a\n \u0015*\u0004\u0018\u00010\r0\r8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, m90084d2 = {"Lcom/kubi/mvi/state/LazyBaseStateFragment;", "I", "Lcom/kubi/mvi/state/IIntent;", ExifInterface.LATITUDE_SOUTH, "Lcom/kubi/mvi/state/IState;", "VM", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/mvi/state/BaseStateFragment;", "<init>", "()V", "hasInitView", "", "lazyInflateView", "Landroid/view/View;", "innerLazyView", "Landroid/widget/FrameLayout;", "getInnerLazyView", "()Landroid/widget/FrameLayout;", "innerLazyView$delegate", "Lkotlin/Lazy;", "lazyFragContentView", "kotlin.jvm.PlatformType", "getLazyFragContentView", "()Landroid/view/View;", "lazyFragContentView$delegate", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "doOnLazyInitView", "Companion", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class LazyBaseStateFragment<I extends InterfaceC19282d, S extends InterfaceC19284f, VM extends BaseStateVM<I, S>> extends BaseStateFragment<I, S, BaseStateVM<I, S>> {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f35634Y = new Companion(null);

    /* JADX INFO: renamed from: U */
    public boolean f35635U;

    /* JADX INFO: renamed from: V */
    public View f35636V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f35637W = LazyKt.lazy(new Function0() { // from class: com.kubi.mvi.state.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LazyBaseStateFragment.m42554r3(this.f35688b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f35638X = LazyKt.lazy(new Function0() { // from class: com.kubi.mvi.state.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LazyBaseStateFragment.m42555s3(this.f35689b);
        }
    });

    /* JADX INFO: compiled from: SimpleStateFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/mvi/state/LazyBaseStateFragment$Companion;", "", "<init>", "()V", "useLazyInit", "", "dynamicOffscreenPageLimit", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: o3 */
    public abstract void mo42556o3();

    /* JADX INFO: renamed from: r3 */
    public static final FrameLayout m42554r3(LazyBaseStateFragment lazyBaseStateFragment) {
        FrameLayout frameLayout = new FrameLayout(lazyBaseStateFragment.requireContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    /* JADX INFO: renamed from: s3 */
    public static final View m42555s3(LazyBaseStateFragment lazyBaseStateFragment) {
        View view = lazyBaseStateFragment.f35636V;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lazyInflateView");
        return null;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C44128b.m97259c("KKKKKKemp", getTAG() + " -- onCreateView  useLazyInit:true");
        return m42557p3();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
    }

    /* JADX INFO: renamed from: p3 */
    public final FrameLayout m42557p3() {
        return (FrameLayout) this.f35637W.getValue();
    }

    /* JADX INFO: renamed from: q3 */
    public final View m42558q3() {
        return (View) this.f35638X.getValue();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    @CallSuper
    public void onShow() {
        super.onShow();
        C44128b.m97259c("KKKKKKemp", getTAG() + " -- onShow:useLazyInit:true, hasInitView:" + this.f35635U);
        if (!this.f35635U) {
            this.f35635U = true;
            View view = null;
            View viewInflate = LayoutInflater.from(getContext()).inflate(getLayout(), (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            this.f35636V = viewInflate;
            FrameLayout frameLayoutM42557p3 = m42557p3();
            View view2 = this.f35636V;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lazyInflateView");
            } else {
                view = view2;
            }
            frameLayoutM42557p3.addView(view, new ViewGroup.LayoutParams(-1, -1));
            mo42556o3();
        }
    }
}
