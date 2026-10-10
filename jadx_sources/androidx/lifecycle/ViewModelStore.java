package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import com.kubi.sdk.aspect.ViewModelStoreAspect;
import dh0.C36686b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.runtime.internal.AbstractC43178a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewModelStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0007J\u0013\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0006H\u0087\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0007J\u0006\u0010\u000f\u001a\u00020\tR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Landroidx/lifecycle/ViewModelStore;", "", "<init>", "()V", "map", "", "", "Landroidx/lifecycle/ViewModel;", "put", "", "key", "viewModel", "get", "keys", "", "clear", "lifecycle-viewmodel_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class ViewModelStore {
    private static /* synthetic */ InterfaceC43175a.a ajc$tjp_0;
    private static /* synthetic */ InterfaceC43175a.a ajc$tjp_1;

    @NotNull
    private final Map<String, ViewModel> map = new LinkedHashMap();

    /* JADX INFO: compiled from: ViewModelStore.kt */
    public class AjcClosure1 extends AbstractC43178a {
        @Override // org.aspectj.runtime.internal.AbstractC43178a
        public Object run(Object[] objArr) {
            Object[] objArr2 = this.state;
            ViewModelStore.put_aroundBody0((ViewModelStore) objArr2[0], (String) objArr2[1], (ViewModel) objArr2[2], (InterfaceC43175a) objArr2[3]);
            return null;
        }

        public AjcClosure1(Object[] objArr) {
            super(objArr);
        }
    }

    /* JADX INFO: compiled from: ViewModelStore.kt */
    public class AjcClosure3 extends AbstractC43178a {
        @Override // org.aspectj.runtime.internal.AbstractC43178a
        public Object run(Object[] objArr) {
            Object[] objArr2 = this.state;
            ViewModelStore.clear_aroundBody2((ViewModelStore) objArr2[0], (InterfaceC43175a) objArr2[1]);
            return null;
        }

        public AjcClosure3(Object[] objArr) {
            super(objArr);
        }
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("ViewModelStore.kt", ViewModelStore.class);
        ajc$tjp_0 = c36686b.m82128h("method-execution", c36686b.m82127g("11", "put", "androidx.lifecycle.ViewModelStore", "java.lang.String:androidx.lifecycle.ViewModel", "key:viewModel", "", "void"), 0);
        ajc$tjp_1 = c36686b.m82128h("method-execution", c36686b.m82127g("11", "clear", "androidx.lifecycle.ViewModelStore", "", "", "", "void"), 57);
    }

    public static final /* synthetic */ void clear_aroundBody2(ViewModelStore viewModelStore, InterfaceC43175a interfaceC43175a) {
        Iterator<ViewModel> it = viewModelStore.map.values().iterator();
        while (it.hasNext()) {
            it.next().clear$lifecycle_viewmodel_release();
        }
        viewModelStore.map.clear();
    }

    public static final /* synthetic */ void put_aroundBody0(ViewModelStore viewModelStore, String key, ViewModel viewModel, InterfaceC43175a interfaceC43175a) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        ViewModel viewModelPut = viewModelStore.map.put(key, viewModel);
        if (viewModelPut != null) {
            viewModelPut.clear$lifecycle_viewmodel_release();
        }
    }

    public final void clear() {
        ViewModelStoreAspect.m56554c().m56555d(new AjcClosure3(new Object[]{this, C36686b.m82122b(ajc$tjp_1, this, this)}).linkClosureAndJoinPoint(69648));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final ViewModel get(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.map.get(key);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Set<String> keys() {
        return new HashSet(this.map.keySet());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void put(@NotNull String key, @NotNull ViewModel viewModel) throws Throwable {
        ViewModelStoreAspect.m56554c().m56556e(new AjcClosure1(new Object[]{this, key, viewModel, C36686b.m82124d(ajc$tjp_0, this, this, key, viewModel)}).linkClosureAndJoinPoint(69648));
    }

    static {
        ajc$preClinit();
    }
}
