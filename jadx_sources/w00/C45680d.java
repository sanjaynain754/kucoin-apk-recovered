package w00;

import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.viewbinding.ViewBinding;
import com.kubi.sdk.viewbindingdelegate.base.LifecycleViewBindingProperty;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: w00.d */
/* JADX INFO: compiled from: FragmentViewBindings.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\n\b\u0001\u0010\u0004 \u0001*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001\u0015B7\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000e\u001a\u00028\u00002\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, m90084d2 = {"Lw00/d;", "Landroidx/fragment/app/Fragment;", "F", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/sdk/viewbindingdelegate/base/LifecycleViewBindingProperty;", "", "viewNeedsInitialization", "Lkotlin/Function1;", "viewBinder", "", "onViewDestroyed", "<init>", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "e", "(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;", "f", "(Landroidx/fragment/app/Fragment;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "Landroidx/lifecycle/LifecycleOwner;", "d", "(Landroidx/fragment/app/Fragment;)Landroidx/lifecycle/LifecycleOwner;", "fragment", "g", "(Landroidx/fragment/app/Fragment;)V", "Z", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "fragmentLifecycleCallbacks", "Ljava/lang/ref/Reference;", "Landroidx/fragment/app/FragmentManager;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Ljava/lang/ref/Reference;", "fragmentManager", "sdk_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class C45680d<F extends Fragment, T extends ViewBinding> extends LifecycleViewBindingProperty<F, T> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean viewNeedsInitialization;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public Reference<FragmentManager> fragmentManager;

    /* JADX INFO: renamed from: w00.d$a */
    /* JADX INFO: compiled from: FragmentViewBindings.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lw00/d$a;", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Lw00/d;Landroidx/fragment/app/Fragment;)V", "Landroidx/fragment/app/FragmentManager;", "fm", "f", "", "onFragmentDestroyed", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V", "Ljava/lang/ref/Reference;", "c", "Ljava/lang/ref/Reference;", "sdk_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public final class a extends FragmentManager.FragmentLifecycleCallbacks {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public Reference<Fragment> fragment;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C45680d<F, T> f102992d;

        public a(@NotNull C45680d this$0, Fragment fragment) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.f102992d = this$0;
            this.fragment = new WeakReference(fragment);
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentDestroyed(@NotNull FragmentManager fm2, @NotNull Fragment f11) {
            Intrinsics.checkNotNullParameter(fm2, "fm");
            Intrinsics.checkNotNullParameter(f11, "f");
            if (this.fragment.get() == f11) {
                this.f102992d.mo58548a();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45680d(boolean z11, @NotNull Function1<? super F, ? extends T> viewBinder, @NotNull Function1<? super T, Unit> onViewDestroyed) {
        super(onViewDestroyed, viewBinder);
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        this.viewNeedsInitialization = z11;
    }

    @Override // com.kubi.sdk.viewbindingdelegate.base.LifecycleViewBindingProperty
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public LifecycleOwner mo58549b(@NotNull F thisRef) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        try {
            LifecycleOwner viewLifecycleOwner = thisRef.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "thisRef.viewLifecycleOwner");
            return viewLifecycleOwner;
        } catch (IllegalStateException unused) {
            throw new IllegalStateException("Fragment doesn't have a view associated with it or the view has been destroyed");
        }
    }

    @Override // com.kubi.sdk.viewbindingdelegate.base.LifecycleViewBindingProperty, com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public T getValue(@NotNull F thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        T t11 = (T) super.getValue(thisRef, property);
        try {
            m100794g(thisRef);
            return t11;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.kubi.sdk.viewbindingdelegate.base.LifecycleViewBindingProperty
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo58550c(@NotNull F thisRef) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        if (!this.viewNeedsInitialization) {
            return true;
        }
        if (thisRef instanceof DialogFragment) {
            return super.mo58550c(thisRef);
        }
        return thisRef.getView() != null;
    }

    /* JADX INFO: renamed from: g */
    public final void m100794g(Fragment fragment) {
        if (this.fragmentLifecycleCallbacks != null) {
            return;
        }
        FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
        this.fragmentManager = new WeakReference(parentFragmentManager);
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "fragment.parentFragmentM…akReference(fm)\n        }");
        a aVar = new a(this, fragment);
        parentFragmentManager.registerFragmentLifecycleCallbacks(aVar, false);
        this.fragmentLifecycleCallbacks = aVar;
    }

    @Override // com.kubi.sdk.viewbindingdelegate.base.LifecycleViewBindingProperty
    /* JADX INFO: renamed from: a */
    public void mo58548a() {
        FragmentManager fragmentManager;
        FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks;
        super.mo58548a();
        Reference<FragmentManager> reference = this.fragmentManager;
        if (reference != null && (fragmentManager = reference.get()) != null && (fragmentLifecycleCallbacks = this.fragmentLifecycleCallbacks) != null) {
            fragmentManager.unregisterFragmentLifecycleCallbacks(fragmentLifecycleCallbacks);
        }
        this.fragmentManager = null;
        this.fragmentLifecycleCallbacks = null;
    }
}
