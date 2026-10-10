package com.kubi.home.widgets.feed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233ej.C37201i;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HomeFeedWrapperTabLayout.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u000fJ\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007J\u0006\u0010\u001e\u001a\u00020\u0015J\u0010\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010!R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\""}, m90084d2 = {"Lcom/kubi/home/widgets/feed/HomeFeedWrapperTabLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "fakeTabLayout", "Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout;", "fakeRnTabLayout", "Lcom/kubi/home/widgets/feed/HomeFeedRnFakeTabLayout;", "useRNHomeFeedTab", "", "getUseRNHomeFeedTab", "()Z", "useRNHomeFeedTab$delegate", "Lkotlin/Lazy;", "configJumpTopClick", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "updateVisible", TIMPushProvider.f75062n, "onFlutterSelectTab", "pos", "onNotifyTabScrollXChange", "scrollX", "jumpToHomeFeedPos", "configTabs", "fm", "Landroidx/fragment/app/FragmentManager;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HomeFeedWrapperTabLayout extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @Nullable
    public HomeFeedFakeTabLayout f26733b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public HomeFeedRnFakeTabLayout f26734c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f26735d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeFeedWrapperTabLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeFeedWrapperTabLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m31160g() {
        return C37201i.f82500a.m83231t();
    }

    private final boolean getUseRNHomeFeedTab() {
        return ((Boolean) this.f26735d.getValue()).booleanValue();
    }

    public final void configJumpTopClick(@NotNull View.OnClickListener listener) {
        HomeFeedFakeTabLayout homeFeedFakeTabLayout;
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (getUseRNHomeFeedTab() || (homeFeedFakeTabLayout = this.f26733b) == null) {
            return;
        }
        homeFeedFakeTabLayout.configJumpTopClick(listener);
    }

    public /* synthetic */ HomeFeedWrapperTabLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: b */
    public final void m31161b(@Nullable FragmentManager fragmentManager) {
        HomeFeedFakeTabLayout homeFeedFakeTabLayout;
        if (!getUseRNHomeFeedTab() && (homeFeedFakeTabLayout = this.f26733b) != null) {
            homeFeedFakeTabLayout.m31149g(fragmentManager);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m31162c() {
        HomeFeedFakeTabLayout homeFeedFakeTabLayout;
        if (!getUseRNHomeFeedTab() && (homeFeedFakeTabLayout = this.f26733b) != null) {
            homeFeedFakeTabLayout.m31150h();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m31163d(int i11) {
        HomeFeedFakeTabLayout homeFeedFakeTabLayout;
        if (!getUseRNHomeFeedTab() && (homeFeedFakeTabLayout = this.f26733b) != null) {
            homeFeedFakeTabLayout.m31151i(i11);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m31164e(int i11) {
        HomeFeedFakeTabLayout homeFeedFakeTabLayout;
        if (!getUseRNHomeFeedTab() && (homeFeedFakeTabLayout = this.f26733b) != null) {
            homeFeedFakeTabLayout.m31152j(i11);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m31165f(boolean z11) {
        int i11;
        if (getUseRNHomeFeedTab()) {
            HomeFeedRnFakeTabLayout homeFeedRnFakeTabLayout = this.f26734c;
            if (homeFeedRnFakeTabLayout != null) {
                homeFeedRnFakeTabLayout.m31158b(z11);
            }
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            setVisibility(i11);
            return;
        }
        HomeFeedFakeTabLayout homeFeedFakeTabLayout = this.f26733b;
        if (homeFeedFakeTabLayout != null) {
            homeFeedFakeTabLayout.m31155p(z11);
            setVisibility(homeFeedFakeTabLayout.getVisibility());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeFeedWrapperTabLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26735d = LazyKt.lazy(new Function0() { // from class: com.kubi.home.widgets.feed.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(HomeFeedWrapperTabLayout.m31160g());
            }
        });
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (getUseRNHomeFeedTab()) {
            HomeFeedRnFakeTabLayout homeFeedRnFakeTabLayout = new HomeFeedRnFakeTabLayout(context, null, 0, 6, null);
            this.f26734c = homeFeedRnFakeTabLayout;
            addView(homeFeedRnFakeTabLayout, layoutParams);
        } else {
            HomeFeedFakeTabLayout homeFeedFakeTabLayout = new HomeFeedFakeTabLayout(context, null, 0, 6, null);
            this.f26733b = homeFeedFakeTabLayout;
            addView(homeFeedFakeTabLayout, layoutParams);
        }
    }
}
