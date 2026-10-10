package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: loaded from: classes34.dex */
@Deprecated
public class ViewModelProviders {
    @NonNull
    @MainThread
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static ViewModelProvider m2863of(@NonNull Fragment fragment) {
        return new ViewModelProvider(fragment);
    }

    @Deprecated
    public static class DefaultFactory extends ViewModelProvider.AndroidViewModelFactory {
        @Deprecated
        public DefaultFactory(@NonNull Application application) {
            super(application);
        }
    }

    @NonNull
    @MainThread
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static ViewModelProvider m2865of(@NonNull FragmentActivity fragmentActivity) {
        return new ViewModelProvider(fragmentActivity);
    }

    @Deprecated
    public ViewModelProviders() {
    }

    @NonNull
    @MainThread
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static ViewModelProvider m2864of(@NonNull Fragment fragment, @Nullable ViewModelProvider.Factory factory) {
        if (factory == null) {
            factory = fragment.getDefaultViewModelProviderFactory();
        }
        return new ViewModelProvider(fragment.getMViewModelStore(), factory);
    }

    @NonNull
    @MainThread
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static ViewModelProvider m2866of(@NonNull FragmentActivity fragmentActivity, @Nullable ViewModelProvider.Factory factory) {
        if (factory == null) {
            factory = fragmentActivity.getDefaultViewModelProviderFactory();
        }
        return new ViewModelProvider(fragmentActivity.getMViewModelStore(), factory);
    }
}
