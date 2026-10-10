package com.kubi.mvi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: LifecycleView.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0017\u0010\u0010J\u000f\u0010\u0018\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001b\u0010\u0010J\u000f\u0010\u001c\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001c\u0010\u0010J\u000f\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u0010R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, m90084d2 = {"Lcom/kubi/mvi/view/LifecycleView;", "Landroid/widget/FrameLayout;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getLayout", "()I", "", "onAttachedToWindow", "()V", "onDetachedFromWindow", "visibility", "onWindowVisibilityChanged", "(I)V", CmcdData.Factory.STREAM_TYPE_LIVE, "i", "g", "m", "k", "j", "n", CmcdData.Factory.STREAMING_FORMAT_HLS, "f", "Landroidx/lifecycle/ViewModelStore;", "b", "Landroidx/lifecycle/ViewModelStore;", "mViewModelStore", "Landroidx/lifecycle/LifecycleRegistry;", "c", "Lkotlin/Lazy;", "getMRegistry", "()Landroidx/lifecycle/LifecycleRegistry;", "mRegistry", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public class LifecycleView extends FrameLayout implements LifecycleOwner, ViewModelStoreOwner {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ViewModelStore mViewModelStore;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy mRegistry;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LifecycleView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public int getLayout() {
        return -1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LifecycleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final LifecycleRegistry getMRegistry() {
        return (LifecycleRegistry) this.mRegistry.getValue();
    }

    /* JADX INFO: renamed from: g */
    public void mo42679g() {
        C44128b.m97259c("mvi", "view:" + this + " onCreate");
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @NotNull
    /* JADX INFO: renamed from: getViewModelStore, reason: from getter */
    public ViewModelStore getMViewModelStore() {
        return this.mViewModelStore;
    }

    /* JADX INFO: renamed from: h */
    public void mo41008h() {
        C44128b.m97259c("mvi", "view:" + this + " onDestroy");
        this.mViewModelStore.clear();
    }

    /* JADX INFO: renamed from: i */
    public void mo42680i() {
        C44128b.m97259c("mvi", "view:" + this + " onHide");
    }

    /* JADX INFO: renamed from: j */
    public void m42681j() {
        C44128b.m97259c("mvi", "view:" + this + " onPause");
    }

    /* JADX INFO: renamed from: k */
    public void m42682k() {
        C44128b.m97259c("mvi", "view:" + this + " onResume");
    }

    /* JADX INFO: renamed from: l */
    public void mo42683l() {
        C44128b.m97259c("mvi", "view:" + this + " onShow");
    }

    /* JADX INFO: renamed from: m */
    public void m42684m() {
        C44128b.m97259c("mvi", "view:" + this + " onStart");
    }

    /* JADX INFO: renamed from: n */
    public void m42685n() {
        C44128b.m97259c("mvi", "view:" + this + " onStop");
    }

    public /* synthetic */ LifecycleView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: f */
    public final void m42678f() {
        if (getLayout() != -1) {
            LayoutInflater.from(getContext()).inflate(getLayout(), (ViewGroup) this, true);
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return getMRegistry();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getMRegistry().setCurrentState(Lifecycle.State.CREATED);
        mo42679g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getMRegistry().setCurrentState(Lifecycle.State.DESTROYED);
        mo41008h();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        if (visibility != 0) {
            if (visibility != 4 && visibility != 8) {
                return;
            }
            getMRegistry().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
            m42681j();
            getMRegistry().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            m42685n();
            mo42680i();
            return;
        }
        getMRegistry().handleLifecycleEvent(Lifecycle.Event.ON_START);
        m42684m();
        getMRegistry().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        m42682k();
        mo42683l();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LifecycleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mViewModelStore = new ViewModelStore();
        m42678f();
        this.mRegistry = LazyKt.lazy(new Function0<LifecycleRegistry>() { // from class: com.kubi.mvi.view.LifecycleView$mRegistry$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final LifecycleRegistry invoke() {
                return new LifecycleRegistry(this.this$0);
            }

            {
                super(0);
            }
        });
    }
}
