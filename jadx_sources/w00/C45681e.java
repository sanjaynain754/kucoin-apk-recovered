package w00;

import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.viewbinding.ViewBinding;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: w00.e */
/* JADX INFO: compiled from: FragmentViewBindings.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a]\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001aa\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aa\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Landroidx/fragment/app/Fragment;", "F", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "viewBinder", "", "onViewDestroyed", "Lcom/kubi/sdk/viewbindingdelegate/base/a;", "e", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;", "", "viewNeedsInitialization", "c", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lcom/kubi/sdk/viewbindingdelegate/base/a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "sdk_release"}, m90085k = 2, m90086mv = {1, 6, 0}, m90088xi = 48)
@JvmName(name = "FragmentViewBindings")
public final class C45681e {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <F extends Fragment, T extends ViewBinding> InterfaceC24293a<F, T> m100795a(@NotNull Function1<? super T, Unit> onViewDestroyed, @NotNull Function1<? super F, ? extends T> viewBinder, boolean z11) {
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        return new C45679c(z11, viewBinder, onViewDestroyed);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC24293a m100796b(Function1 function1, Function1 function2, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return m100795a(function1, function2, z11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <F extends Fragment, T extends ViewBinding> InterfaceC24293a<F, T> m100797c(@NotNull Function1<? super T, Unit> onViewDestroyed, @NotNull Function1<? super F, ? extends T> viewBinder, boolean z11) {
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        return new C45680d(z11, viewBinder, onViewDestroyed);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC24293a m100798d(Function1 function1, Function1 function2, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return m100797c(function1, function2, z11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @JvmName(name = "viewBindingFragmentWithCallbacks")
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <F extends Fragment, T extends ViewBinding> InterfaceC24293a<F, T> m100799e(@NotNull Fragment fragment, @NotNull Function1<? super F, ? extends T> viewBinder, @NotNull Function1<? super T, Unit> onViewDestroyed) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        return fragment instanceof DialogFragment ? m100796b(onViewDestroyed, viewBinder, false, 4, null) : m100798d(onViewDestroyed, viewBinder, false, 4, null);
    }
}
