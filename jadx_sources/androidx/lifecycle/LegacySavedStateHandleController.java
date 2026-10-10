package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LegacySavedStateHandleController.android.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController;", "", "<init>", "()V", "TAG_SAVED_STATE_HANDLE_CONTROLLER", "", "create", "Landroidx/lifecycle/SavedStateHandleController;", "registry", "Landroidx/savedstate/SavedStateRegistry;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "key", "defaultArgs", "Landroid/os/Bundle;", "attachHandleIfNeeded", "", "viewModel", "Landroidx/lifecycle/ViewModel;", "tryToAddRecreator", "OnRecreation", "lifecycle-viewmodel-savedstate_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class LegacySavedStateHandleController {

    @NotNull
    public static final LegacySavedStateHandleController INSTANCE = new LegacySavedStateHandleController();

    @NotNull
    public static final String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";

    /* JADX INFO: compiled from: LegacySavedStateHandleController.android.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController$OnRecreation;", "Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "<init>", "()V", "onRecreated", "", TUIConstants.TUIChat.OWNER, "Landroidx/savedstate/SavedStateRegistryOwner;", "lifecycle-viewmodel-savedstate_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class OnRecreation implements SavedStateRegistry.AutoRecreated {
        @Override // androidx.savedstate.SavedStateRegistry.AutoRecreated
        public void onRecreated(@NotNull SavedStateRegistryOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (owner instanceof ViewModelStoreOwner) {
                ViewModelStore mViewModelStore = ((ViewModelStoreOwner) owner).getMViewModelStore();
                SavedStateRegistry savedStateRegistry = owner.getSavedStateRegistry();
                Iterator<String> it = mViewModelStore.keys().iterator();
                while (it.hasNext()) {
                    ViewModel viewModel = mViewModelStore.get(it.next());
                    if (viewModel != null) {
                        LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, owner.getLifecycle());
                    }
                }
                if (!mViewModelStore.keys().isEmpty()) {
                    savedStateRegistry.runOnNextRecreation(OnRecreation.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
        }
    }

    private LegacySavedStateHandleController() {
    }

    @JvmStatic
    public static final void attachHandleIfNeeded(@NotNull ViewModel viewModel, @NotNull SavedStateRegistry registry, @NotNull Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.getCloseable(TAG_SAVED_STATE_HANDLE_CONTROLLER);
        if (savedStateHandleController != null && !savedStateHandleController.getIsAttached()) {
            savedStateHandleController.attachToLifecycle(registry, lifecycle);
            INSTANCE.tryToAddRecreator(registry, lifecycle);
        }
    }

    @JvmStatic
    @NotNull
    public static final SavedStateHandleController create(@NotNull SavedStateRegistry registry, @NotNull Lifecycle lifecycle, @Nullable String key, @Nullable Bundle defaultArgs) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNull(key);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(key, SavedStateHandle.INSTANCE.createHandle(registry.consumeRestoredStateForKey(key), defaultArgs));
        savedStateHandleController.attachToLifecycle(registry, lifecycle);
        INSTANCE.tryToAddRecreator(registry, lifecycle);
        return savedStateHandleController;
    }

    private final void tryToAddRecreator(final SavedStateRegistry registry, final Lifecycle lifecycle) {
        Lifecycle.State state = lifecycle.getState();
        if (state != Lifecycle.State.INITIALIZED && !state.isAtLeast(Lifecycle.State.STARTED)) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.lifecycle.LegacySavedStateHandleController.tryToAddRecreator.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (event == Lifecycle.Event.ON_START) {
                        lifecycle.removeObserver(this);
                        registry.runOnNextRecreation(OnRecreation.class);
                    }
                }
            });
        } else {
            registry.runOnNextRecreation(OnRecreation.class);
        }
    }
}
