package t20;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.kubi.resources.widget.SwitchFragmentBar;

/* JADX INFO: renamed from: t20.p0 */
/* JADX INFO: compiled from: KucoinLayoutSwitchFragmentbarBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44659p0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final SwitchFragmentBar f99282a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SwitchFragmentBar f99283b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44659p0 m98794a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SwitchFragmentBar switchFragmentBar = (SwitchFragmentBar) view;
        return new C44659p0(switchFragmentBar, switchFragmentBar);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SwitchFragmentBar getRoot() {
        return this.f99282a;
    }

    public C44659p0(@NonNull SwitchFragmentBar switchFragmentBar, @NonNull SwitchFragmentBar switchFragmentBar2) {
        this.f99282a = switchFragmentBar;
        this.f99283b = switchFragmentBar2;
    }
}
