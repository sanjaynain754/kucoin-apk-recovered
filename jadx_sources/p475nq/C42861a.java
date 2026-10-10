package p475nq;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.kubi.mine.api.service.IMineService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p694vk.AbstractC45585n0;
import p759xf.InterfaceC46157a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: nq.a */
/* JADX INFO: compiled from: FallbackHockSPI.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eH\u0016¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/mine/lib/spi/FallbackHockSPI;", "Lcom/kubi/fallback/spi/IFallbackHockSPI;", "<init>", "()V", "checkUpgrade", "", "manager", "Landroidx/fragment/app/FragmentManager;", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "isPageShow", "Lkotlin/Function0;", "", "dialogShow", "Lkotlin/Function1;", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42861a implements InterfaceC46157a {
    @Override // p759xf.InterfaceC46157a
    /* JADX INFO: renamed from: a */
    public void mo94006a(@NotNull FragmentManager manager, @NotNull LifecycleCoroutineScope lifecycleScope, @NotNull Function0<Boolean> isPageShow, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(isPageShow, "isPageShow");
        IMineService.f35025a.get().mo41626i(new AbstractC45585n0.d(), manager, lifecycleScope, isPageShow, function1);
    }
}
