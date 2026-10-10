package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmClassMappingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KClass;

/* JADX INFO: compiled from: ViewModelProviderImpl.android.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\u0010\t¨\u0006\n"}, m90084d2 = {"createViewModel", "VM", "Landroidx/lifecycle/ViewModel;", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "modelClass", "Lkotlin/reflect/KClass;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Landroidx/lifecycle/ViewModelProvider$Factory;Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ViewModelProviderImpl_androidKt {
    @NotNull
    public static final <VM extends ViewModel> VM createViewModel(@NotNull ViewModelProvider.Factory factory, @NotNull KClass<VM> modelClass, @NotNull CreationExtras extras) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            try {
                return (VM) factory.create(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return (VM) factory.create(JvmClassMappingKt.getJavaClass((KClass) modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return (VM) factory.create(JvmClassMappingKt.getJavaClass((KClass) modelClass), extras);
        }
    }
}
