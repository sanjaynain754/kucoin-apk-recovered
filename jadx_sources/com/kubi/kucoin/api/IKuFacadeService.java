package com.kubi.kucoin.api;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.kubi.data.entity.MaintenanceEntity;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: IKuFacadeService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cJ\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH&J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017H&J\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u001aH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kucoin/api/IKuFacadeService;", "", "navHeight", "", "getErrorMsgByThrowable", "", "throwable", "", "maintenanceStatusObserver", "", "tradeFragment", "Lcom/kubi/sdk/BaseFragment;", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "function", "Lkotlin/Function0;", "maintenanceStatusFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/data/entity/MaintenanceEntity;", "appNotSupported", "activity", "Landroidx/fragment/app/FragmentActivity;", "mainClass", "Ljava/lang/Class;", "Landroid/app/Activity;", "hasShowSignProtocolDialog", "", "shouldShowWeb3ModeRedDot", "Companion", "KuFacadeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IKuFacadeService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f27711a = Companion.f27712a;

    /* JADX INFO: compiled from: IKuFacadeService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kucoin/api/IKuFacadeService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/kucoin/api/IKuFacadeService;", "KuFacadeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f27712a = new Companion();

        @NotNull
        public final IKuFacadeService get() {
            return (IKuFacadeService) Router.f46192a.m56192n(IKuFacadeService.class);
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo31922a();

    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<MaintenanceEntity> mo31923b(@NotNull BaseFragment baseFragment);

    /* JADX INFO: renamed from: c */
    void mo31924c(@NotNull FragmentActivity fragmentActivity);

    @NotNull
    /* JADX INFO: renamed from: d */
    Class<? extends Activity> mo31925d();

    @NotNull
    /* JADX INFO: renamed from: e */
    String mo31926e(@Nullable Throwable th2);

    /* JADX INFO: renamed from: f */
    int mo31927f();

    /* JADX INFO: renamed from: g */
    void mo31928g(@NotNull BaseFragment baseFragment, @NotNull LifecycleOwner lifecycleOwner, @NotNull Function0<Unit> function0);
}
