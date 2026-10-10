package com.kubi.sdk.viewbindingdelegate.base;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.viewbinding.ViewBinding;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: compiled from: ViewBindingProperty.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b'\u0018\u0000 \u001c*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\n\b\u0001\u0010\u0004 \u0001*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0002\u0017\u001dB/\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H$¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u00002\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0097\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u00068\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00018\u00018\b@\bX\u0088\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/sdk/viewbindingdelegate/base/LifecycleViewBindingProperty;", "", "R", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/sdk/viewbindingdelegate/base/a;", "Lkotlin/Function1;", "", "onViewDestroyed", "viewBinder", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "thisRef", "Landroidx/lifecycle/LifecycleOwner;", "b", "(Ljava/lang/Object;)Landroidx/lifecycle/LifecycleOwner;", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;", "", "c", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "Lkotlin/jvm/functions/Function1;", "Landroidx/viewbinding/ViewBinding;", "viewBinding", "d", "Companion", "sdk_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class LifecycleViewBindingProperty<R, T extends ViewBinding> implements InterfaceC24293a<R, T> {

    /* JADX INFO: renamed from: e */
    @Deprecated
    @NotNull
    public static final Handler f48309e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function1<T, Unit> onViewDestroyed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function1<R, T> viewBinder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public T viewBinding;

    /* JADX INFO: renamed from: com.kubi.sdk.viewbindingdelegate.base.LifecycleViewBindingProperty$a */
    /* JADX INFO: compiled from: ViewBindingProperty.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\nR\u001c\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/sdk/viewbindingdelegate/base/LifecycleViewBindingProperty$a;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/kubi/sdk/viewbindingdelegate/base/LifecycleViewBindingProperty;", "property", "<init>", "(Lcom/kubi/sdk/viewbindingdelegate/base/LifecycleViewBindingProperty;)V", "Landroidx/lifecycle/LifecycleOwner;", TUIConstants.TUIChat.OWNER, "", "onCreate", "(Landroidx/lifecycle/LifecycleOwner;)V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "b", "Lcom/kubi/sdk/viewbindingdelegate/base/LifecycleViewBindingProperty;", "sdk_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class C24292a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final LifecycleViewBindingProperty<?, ?> property;

        public C24292a(@NotNull LifecycleViewBindingProperty<?, ?> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.property = property;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(@NotNull LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        @MainThread
        public void onDestroy(@NotNull LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.property.mo58548a();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(@NotNull LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(@NotNull LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(@NotNull LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(@NotNull LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract LifecycleOwner mo58549b(@NotNull R thisRef);

    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleViewBindingProperty(@NotNull Function1<? super T, Unit> onViewDestroyed, @NotNull Function1<? super R, ? extends T> viewBinder) {
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        this.onViewDestroyed = onViewDestroyed;
        this.viewBinder = viewBinder;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo58550c(@NotNull R thisRef) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        return true;
    }

    @Override // com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a
    @MainThread
    @Nullable
    public T getValue(@NotNull R thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        T t11 = this.viewBinding;
        if (t11 != null) {
            return t11;
        }
        if (!mo58550c(thisRef)) {
            if (C24294b.f48314a.m58551a()) {
                throw new IllegalStateException("Host view isn't ready to create a ViewBinding instance");
            }
            return null;
        }
        Lifecycle lifecycle = mo58549b(thisRef).getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "getLifecycleOwner(thisRef).lifecycle");
        if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
            this.viewBinding = null;
            if (C24294b.f48314a.m58551a()) {
                throw new IllegalStateException("Accessing viewBinding after Lifecycle is destroyed or hasn't been created yet. The instance of viewBinding isn't cached.");
            }
            return null;
        }
        T tInvoke = this.viewBinder.invoke(thisRef);
        lifecycle.addObserver(new C24292a(this));
        this.viewBinding = tInvoke;
        return tInvoke;
    }

    @CallSuper
    @MainThread
    /* JADX INFO: renamed from: a */
    public void mo58548a() {
        UtilsKt.m58553a();
        T t11 = this.viewBinding;
        this.viewBinding = null;
        if (t11 != null) {
            this.onViewDestroyed.invoke(t11);
        }
    }
}
