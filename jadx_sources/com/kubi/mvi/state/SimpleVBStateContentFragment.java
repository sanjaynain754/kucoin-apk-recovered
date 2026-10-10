package com.kubi.mvi.state;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewbinding.ViewBinding;
import com.kubi.mvi.state.InterfaceC19284f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SimpleStateFragment.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0019H&R\u0014\u0010\b\u001a\u0004\u0018\u00018\u0001X¤\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/mvi/state/SimpleVBStateContentFragment;", ExifInterface.LATITUDE_SOUTH, "Lcom/kubi/mvi/state/IState;", "VB", "Landroidx/viewbinding/ViewBinding;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "<init>", "()V", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "onCustomCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "getLayout", "", "getBindingRootViewLayout", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class SimpleVBStateContentFragment<S extends InterfaceC19284f, VB extends ViewBinding> extends SimpleStateFragment<S> {

    /* JADX INFO: renamed from: U */
    public View f35653U;

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return 0;
    }

    /* JADX INFO: renamed from: m3 */
    public abstract int mo21545m3();

    @NotNull
    /* JADX INFO: renamed from: n3 */
    public final View m42580n3() {
        View view = this.f35653U;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rootView");
        return null;
    }

    /* JADX INFO: renamed from: o3 */
    public final void m42581o3(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.f35653U = view;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    @NotNull
    public View onCustomCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(mo21545m3(), (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        m42581o3(viewInflate);
        return m42580n3();
    }
}
