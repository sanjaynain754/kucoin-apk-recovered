package androidx.lifecycle;

import androidx.annotation.MainThread;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: ViewModelProviderGet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0087\b¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"get", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider;", "(Landroidx/lifecycle/ViewModelProvider;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@JvmName(name = "ViewModelProviderGetKt")
public final class ViewModelProviderGetKt {
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> VM get(ViewModelProvider viewModelProvider) {
        Intrinsics.checkNotNullParameter(viewModelProvider, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        return (VM) viewModelProvider.get(Reflection.getOrCreateKotlinClass(ViewModel.class));
    }
}
