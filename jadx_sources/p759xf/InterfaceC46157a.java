package p759xf;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: xf.a */
/* JADX INFO: compiled from: IFallbackHockSPI.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/fallback/spi/IFallbackHockSPI;", "", "checkUpgrade", "", "manager", "Landroidx/fragment/app/FragmentManager;", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "isPageShow", "Lkotlin/Function0;", "", "dialogShow", "Lkotlin/Function1;", "LFallback_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46157a {
    /* JADX INFO: renamed from: a */
    void mo94006a(@NotNull FragmentManager fragmentManager, @NotNull LifecycleCoroutineScope lifecycleCoroutineScope, @NotNull Function0<Boolean> function0, @Nullable Function1<? super Boolean, Unit> function1);
}
