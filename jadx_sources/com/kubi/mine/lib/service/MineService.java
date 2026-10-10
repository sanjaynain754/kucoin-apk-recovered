package com.kubi.mine.lib.service;

import android.annotation.SuppressLint;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.mine.api.entity.KycStatusEntity;
import com.kubi.mine.api.service.IMineService;
import com.kubi.mine.lib.language.LanguageRepository;
import com.kubi.mine.lib.manger.AppUpgradeManger;
import com.kubi.mine.lib.manger.AppUpgradeMangerV2;
import com.kubi.mine.lib.manger.V2Upgrade;
import com.kubi.mine.lib.p101ui.AccountMoveActivity;
import com.kubi.mine.lib.p101ui.C19116o3;
import com.kubi.mine.lib.p101ui.DrawerProxy;
import com.kubi.mine.lib.p101ui.MineFragment;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.user.model.LoginUserEntity;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p319hq.InterfaceC38285b;
import p538pq.C43522b;
import p569qq.C43846g;
import p694vk.AbstractC45585n0;
import p694vk.C45591t;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: MineService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001e\u0010\u000b\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b\u0018\u00010\rH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J,\u0010\u0012\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00140\u0013j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0014`\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016JD\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b\u0018\u00010\rH\u0016J:\u0010%\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\"2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\"2\b\u0010(\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010)\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010*\u001a\u00020\bH\u0016J\u0010\u0010+\u001a\u0004\u0018\u00010,H\u0096@¢\u0006\u0002\u0010-J\u0010\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u0005H\u0016J\u0010\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\u0005H\u0017¨\u00062"}, m90084d2 = {"Lcom/kubi/mine/lib/service/MineService;", "Lcom/kubi/mine/api/service/IMineService;", "<init>", "()V", "getVisitorNoteContent", "", "ip", "refreshMineFragmentData", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "mineFragmentInjectUI", "injectUI", "Lkotlin/Function1;", "Landroid/widget/LinearLayout;", "startToMove", "loginUserEntity", "Lcom/kubi/user/model/LoginUserEntity;", "getCheckList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "activity", "Landroidx/fragment/app/FragmentActivity;", "setAccountMoveActivityOK", "attachDrawer", "checkUpgrade", "appUpgradeType", "Lcom/kubi/kucoin/UpgradeType;", "manager", "Landroidx/fragment/app/FragmentManager;", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "isPageShow", "Lkotlin/Function0;", "", "dialogShow", "v2checkUpgrade", "increaseCount", "decreaseCount", "futuresPageId", "futuresCrossUpgrade", "goToUpgradeApp", "fetchKycStatus", "Lcom/kubi/mine/api/entity/KycStatusEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeLanguage", "language", "setUserCurrency", FirebaseAnalytics.Param.CURRENCY, "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMineService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MineService.kt\ncom/kubi/mine/lib/service/MineService\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,142:1\n35#2,4:143\n39#2:149\n44#3,2:147\n*S KotlinDebug\n*F\n+ 1 MineService.kt\ncom/kubi/mine/lib/service/MineService\n*L\n78#1:143,4\n78#1:149\n78#1:147,2\n*E\n"})
public final class MineService implements IMineService {

    /* JADX INFO: renamed from: com.kubi.mine.lib.service.MineService$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C19005a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: p */
    public static final void m41819p(Object obj) {
        MineDepend.f35159a.m41832k();
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m41820q(Throwable th2) {
        C44128b.m97263g("MineService", th2);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mine.api.service.IMineService
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: a */
    public void mo41618a(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        if (MineDepend.f35159a.m41829h()) {
            Observable observableCompose = InterfaceC38285b.m86406e((InterfaceC38285b) C42597a.m93386b().create(InterfaceC38285b.class), currency, null, null, 4, null).compose(C24217a1.m58390n());
            Consumer consumer = new Consumer() { // from class: com.kubi.mine.lib.service.b
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MineService.m41819p(obj);
                }
            };
            final Function1 function1 = new Function1() { // from class: com.kubi.mine.lib.service.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MineService.m41820q((Throwable) obj);
                }
            };
            observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.mine.lib.service.d
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MineService.m41821r(function1, obj);
                }
            });
        }
    }

    @Override // com.kubi.mine.api.service.IMineService
    /* JADX INFO: renamed from: b */
    public void mo41619b(@Nullable FragmentActivity fragmentActivity) {
        AccountMoveActivity accountMoveActivity = fragmentActivity instanceof AccountMoveActivity ? (AccountMoveActivity) fragmentActivity : null;
        if (accountMoveActivity != null) {
            accountMoveActivity.m41865a0();
        }
    }

    @Override // com.kubi.mine.api.service.IMineService
    /* JADX INFO: renamed from: d */
    public void mo41621d() {
        C43522b.f96058a.m95772c();
    }

    @Override // com.kubi.mine.api.service.IMineService
    @NotNull
    /* JADX INFO: renamed from: e */
    public ArrayList<String[]> mo41622e(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return ((AccountMoveActivity) activity).m41864X();
    }

    @Override // com.kubi.mine.api.service.IMineService
    /* JADX INFO: renamed from: f */
    public void mo41623f(@NotNull LoginUserEntity loginUserEntity) {
        Intrinsics.checkNotNullParameter(loginUserEntity, "loginUserEntity");
        AccountMoveActivity.f35167l.startToMove(loginUserEntity);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.kubi.mine.api.service.IMineService
    @Nullable
    /* JADX INFO: renamed from: g */
    public Object mo41624g(@NotNull Continuation<? super KycStatusEntity> continuation) {
        MineService$fetchKycStatus$1 mineService$fetchKycStatus$1;
        if (continuation instanceof MineService$fetchKycStatus$1) {
            mineService$fetchKycStatus$1 = (MineService$fetchKycStatus$1) continuation;
            int i11 = mineService$fetchKycStatus$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mineService$fetchKycStatus$1.label = i11 - Integer.MIN_VALUE;
            } else {
                mineService$fetchKycStatus$1 = new MineService$fetchKycStatus$1(this, continuation);
            }
        } else {
            mineService$fetchKycStatus$1 = new MineService$fetchKycStatus$1(this, continuation);
        }
        MineService$fetchKycStatus$1 mineService$fetchKycStatus$2 = mineService$fetchKycStatus$1;
        Object objM42826g = mineService$fetchKycStatus$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = mineService$fetchKycStatus$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42826g);
            InterfaceC41634e<KycStatusEntity> interfaceC41634eM86408a = ((InterfaceC38285b) RetrofitFlowExKt.m42820a(InterfaceC38285b.class)).m86408a();
            mineService$fetchKycStatus$2.label = 1;
            objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM86408a, false, null, mineService$fetchKycStatus$2, 2, null);
            if (objM42826g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42826g);
        }
        return ((C19334f) objM42826g).m42846a();
    }

    @Override // com.kubi.mine.api.service.IMineService
    /* JADX INFO: renamed from: h */
    public void mo41625h(@NotNull String language) {
        Intrinsics.checkNotNullParameter(language, "language");
        LanguageRepository.f35074a.m41682d(language, false);
    }

    @Override // com.kubi.mine.api.service.IMineService
    /* JADX INFO: renamed from: i */
    public void mo41626i(@NotNull AbstractC45585n0 appUpgradeType, @NotNull FragmentManager manager, @NotNull LifecycleCoroutineScope lifecycleScope, @NotNull Function0<Boolean> isPageShow, @Nullable Function1<? super Boolean, Unit> function1) {
        Object objM20457a;
        Intrinsics.checkNotNullParameter(appUpgradeType, "appUpgradeType");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(isPageShow, "isPageShow");
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C19005a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("android_appupgradedialog_v2open", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        Boolean bool = (Boolean) objM20457a;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        C45591t.f102713a.m100681a("appUpgradeDialog-isV2Open " + zBooleanValue);
        if (zBooleanValue) {
            AppUpgradeMangerV2.f35086a.m41727f(appUpgradeType, manager, lifecycleScope, isPageShow, function1);
        } else {
            AppUpgradeManger.f35079a.m41707m(appUpgradeType, manager, lifecycleScope, isPageShow);
        }
    }

    @Override // com.kubi.mine.api.service.IMineService
    /* JADX INFO: renamed from: j */
    public void mo41627j(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (fragment instanceof MineFragment) {
            ((MineFragment) fragment).m42107R5();
        }
    }

    @Override // com.kubi.mine.api.service.IMineService
    /* JADX INFO: renamed from: k */
    public void mo41628k(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        new DrawerProxy(activity).m41935h();
    }

    @Override // com.kubi.mine.api.service.IMineService
    /* JADX INFO: renamed from: l */
    public void mo41629l(@NotNull BaseFragment fragment, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable String str) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        try {
            V2Upgrade v2Upgrade = new V2Upgrade(function0, function1, str);
            v2Upgrade.m41767b(fragment);
            v2Upgrade.m41766a();
        } catch (Throwable th2) {
            C45591t.f102713a.m100682b("appUpgradeDialog-v2checkUpgrade", th2);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m41821r(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // com.kubi.mine.api.service.IMineService
    @NotNull
    /* JADX INFO: renamed from: c */
    public String mo41620c(@Nullable String str) {
        return C19116o3.m42275c(str);
    }
}
