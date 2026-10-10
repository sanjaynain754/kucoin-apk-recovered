package p206dp;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.kubi.resources.widget.SwitchFragmentBar;

/* JADX INFO: renamed from: dp.t0 */
/* JADX INFO: compiled from: BmarginLayoutSwitchFragmentbarBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36940t0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final SwitchFragmentBar f81982a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SwitchFragmentBar f81983b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36940t0 m82749a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SwitchFragmentBar switchFragmentBar = (SwitchFragmentBar) view;
        return new C36940t0(switchFragmentBar, switchFragmentBar);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SwitchFragmentBar getRoot() {
        return this.f81982a;
    }

    public C36940t0(@NonNull SwitchFragmentBar switchFragmentBar, @NonNull SwitchFragmentBar switchFragmentBar2) {
        this.f81982a = switchFragmentBar;
        this.f81983b = switchFragmentBar2;
    }
}
