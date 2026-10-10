package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.savedstate.SavedStateRegistryOwner;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModelFactory;", "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "Landroidx/savedstate/SavedStateRegistryOwner;", "stateRegistryOwner", "Landroid/os/Bundle;", "args", "Lcom/sumsub/sns/internal/core/domain/h;", "serviceLocator", "<init>", "(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;Lcom/sumsub/sns/internal/core/domain/h;)V", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "", "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/SavedStateHandle;", "state", "create", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "Landroid/os/Bundle;", "getArgs", "()Landroid/os/Bundle;", "Lcom/sumsub/sns/internal/core/domain/h;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class LanguageSelectionViewModelFactory extends AbstractSavedStateViewModelFactory {

    @Nullable
    private final Bundle args;

    @NotNull
    private final C28578h serviceLocator;

    public /* synthetic */ LanguageSelectionViewModelFactory(SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle, C28578h c28578h, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(savedStateRegistryOwner, (i11 & 2) != 0 ? null : bundle, c28578h);
    }

    public LanguageSelectionViewModelFactory(@NotNull SavedStateRegistryOwner savedStateRegistryOwner, @Nullable Bundle bundle, @NotNull C28578h c28578h) {
        super(savedStateRegistryOwner, bundle);
        this.args = bundle;
        this.serviceLocator = c28578h;
    }

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    @NotNull
    public <T extends ViewModel> T create(@NotNull String key, @NotNull Class<T> modelClass, @NotNull SavedStateHandle state) {
        Bundle bundle = this.args;
        if (bundle != null) {
            return new LanguageSelectionViewModel(bundle, (InterfaceC29953a) this.serviceLocator.f58168f.getValue(), (InterfaceC29984m) this.serviceLocator.f58180r.getValue());
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Nullable
    public final Bundle getArgs() {
        return this.args;
    }
}
