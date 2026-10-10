package pl;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.kubi.data.entity.MaintenanceEntity;
import com.kubi.facade.lib.R$string;
import com.kubi.kucoin.api.IKuFacadeService;
import com.kubi.kucoin.main.KuCoinMainActivity;
import com.kubi.kucoin.main.KuCoinMainViewModel;
import com.kubi.mine.api.service.IMineService;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.flow.InterfaceC41634e;
import nl.C42851a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p694vk.AbstractC45585n0;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: pl.c */
/* JADX INFO: compiled from: KuFacadeService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/kucoin/main/service/KuFacadeService;", "Lcom/kubi/kucoin/api/IKuFacadeService;", "<init>", "()V", "navHeight", "", "getErrorMsgByThrowable", "", "throwable", "", "maintenanceStatusObserver", "", "tradeFragment", "Lcom/kubi/sdk/BaseFragment;", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "function", "Lkotlin/Function0;", "maintenanceStatusFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/data/entity/MaintenanceEntity;", "appNotSupported", "activity", "Landroidx/fragment/app/FragmentActivity;", "hasShowSignProtocolDialog", "", "shouldShowWeb3ModeRedDot", "mainClass", "Ljava/lang/Class;", "Lcom/kubi/kucoin/main/KuCoinMainActivity;", "KuFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43504c implements IKuFacadeService {

    /* JADX INFO: renamed from: pl.c$a */
    /* JADX INFO: compiled from: KuFacadeService.kt */
    /* JADX INFO: loaded from: classes18.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f96043b;

        public a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f96043b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f96043b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f96043b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Override // com.kubi.kucoin.api.IKuFacadeService
    /* JADX INFO: renamed from: a */
    public boolean mo31922a() {
        return C42851a.f94919a.m93994k();
    }

    @Override // com.kubi.kucoin.api.IKuFacadeService
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC41634e<MaintenanceEntity> mo31923b(@NotNull BaseFragment tradeFragment) {
        Intrinsics.checkNotNullParameter(tradeFragment, "tradeFragment");
        FragmentActivity fragmentActivityRequireActivity = tradeFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return FlowLiveDataConversions.asFlow(((KuCoinMainViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(KuCoinMainViewModel.class)).m32458s());
    }

    @Override // com.kubi.kucoin.api.IKuFacadeService
    /* JADX INFO: renamed from: c */
    public void mo31924c(@NotNull final FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IMineService iMineService = IMineService.f35025a.get();
        AbstractC45585n0.b bVar = new AbstractC45585n0.b();
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        iMineService.mo41626i(bVar, supportFragmentManager, LifecycleOwnerKt.getLifecycleScope(activity), new Function0() { // from class: pl.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C43504c.m95729j(activity));
            }
        }, null);
    }

    @Override // com.kubi.kucoin.api.IKuFacadeService
    @NotNull
    /* JADX INFO: renamed from: d */
    public Class<KuCoinMainActivity> mo31925d() {
        return KuCoinMainActivity.class;
    }

    @Override // com.kubi.kucoin.api.IKuFacadeService
    @NotNull
    /* JADX INFO: renamed from: e */
    public String mo31926e(@Nullable Throwable th2) {
        boolean z11 = th2 instanceof ApiException;
        ApiException apiException = z11 ? (ApiException) th2 : null;
        String message = apiException != null ? apiException.getMessage() : null;
        if (message == null || message.length() == 0) {
            return C27017c.f54310a.m66516f(R$string.common_something_wrong, new Object[0]);
        }
        ApiException apiException2 = z11 ? (ApiException) th2 : null;
        return C27041f.m66668h(apiException2 != null ? apiException2.getMessage() : null);
    }

    @Override // com.kubi.kucoin.api.IKuFacadeService
    /* JADX INFO: renamed from: f */
    public int mo31927f() {
        return KuCoinMainActivity.f27951P.getNavHeight();
    }

    @Override // com.kubi.kucoin.api.IKuFacadeService
    /* JADX INFO: renamed from: g */
    public void mo31928g(@NotNull BaseFragment tradeFragment, @NotNull LifecycleOwner viewLifecycleOwner, @NotNull final Function0<Unit> function) {
        Intrinsics.checkNotNullParameter(tradeFragment, "tradeFragment");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(function, "function");
        FragmentActivity fragmentActivityRequireActivity = tradeFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ((KuCoinMainViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(KuCoinMainViewModel.class)).m32458s().observe(viewLifecycleOwner, new a(new Function1() { // from class: pl.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43504c.m95730k(function, (MaintenanceEntity) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m95729j(FragmentActivity fragmentActivity) {
        if (!fragmentActivity.isDestroyed() && !fragmentActivity.isFinishing()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m95730k(Function0 function0, MaintenanceEntity maintenanceEntity) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
