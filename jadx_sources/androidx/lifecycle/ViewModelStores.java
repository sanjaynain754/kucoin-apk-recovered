package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: loaded from: classes34.dex */
@Deprecated
public class ViewModelStores {
    @NonNull
    @MainThread
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static ViewModelStore m2868of(@NonNull FragmentActivity fragmentActivity) {
        return fragmentActivity.getMViewModelStore();
    }

    @NonNull
    @MainThread
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static ViewModelStore m2867of(@NonNull Fragment fragment) {
        return fragment.getMViewModelStore();
    }

    private ViewModelStores() {
    }
}
