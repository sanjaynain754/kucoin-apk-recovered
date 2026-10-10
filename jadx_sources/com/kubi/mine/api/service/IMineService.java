package com.kubi.mine.api.service;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.mine.api.entity.KycStatusEntity;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.user.model.LoginUserEntity;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p694vk.AbstractC45585n0;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: IMineService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u0000 02\u00020\u0001:\u00010J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\t\u001a\u00020\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH&J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH&J,\u0010\u0010\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00120\u0011j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0012`\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0012\u0010\u0016\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H&JD\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH&J@\u0010#\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010 2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010 2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010'\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cH&J\b\u0010(\u001a\u00020\u0006H&J\u0010\u0010)\u001a\u0004\u0018\u00010*H¦@¢\u0006\u0002\u0010+J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0003H&J\u0010\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00061À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/mine/api/service/IMineService;", "", "getVisitorNoteContent", "", "ip", "refreshMineFragmentData", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "mineFragmentInjectUI", "injectUI", "Lkotlin/Function1;", "Landroid/widget/LinearLayout;", "startToMove", "loginUserEntity", "Lcom/kubi/user/model/LoginUserEntity;", "getCheckList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "activity", "Landroidx/fragment/app/FragmentActivity;", "setAccountMoveActivityOK", "attachDrawer", "checkUpgrade", "appUpgradeType", "Lcom/kubi/kucoin/UpgradeType;", "manager", "Landroidx/fragment/app/FragmentManager;", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "isPageShow", "Lkotlin/Function0;", "", "dialogShow", "v2checkUpgrade", "increaseCount", "decreaseCount", "futuresPageId", "futuresCrossUpgrade", "goToUpgradeApp", "fetchKycStatus", "Lcom/kubi/mine/api/entity/KycStatusEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeLanguage", "language", "setUserCurrency", FirebaseAnalytics.Param.CURRENCY, "Companion", "MineApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IMineService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f35025a = Companion.f35026a;

    /* JADX INFO: compiled from: IMineService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/mine/api/service/IMineService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/mine/api/service/IMineService;", "MineApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f35026a = new Companion();

        @NotNull
        public final IMineService get() {
            return (IMineService) Router.f46192a.m56192n(IMineService.class);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo41618a(@NotNull String str);

    /* JADX INFO: renamed from: b */
    void mo41619b(@Nullable FragmentActivity fragmentActivity);

    @NotNull
    /* JADX INFO: renamed from: c */
    String mo41620c(@Nullable String str);

    /* JADX INFO: renamed from: d */
    void mo41621d();

    @NotNull
    /* JADX INFO: renamed from: e */
    ArrayList<String[]> mo41622e(@NotNull FragmentActivity fragmentActivity);

    /* JADX INFO: renamed from: f */
    void mo41623f(@NotNull LoginUserEntity loginUserEntity);

    @Nullable
    /* JADX INFO: renamed from: g */
    Object mo41624g(@NotNull Continuation<? super KycStatusEntity> continuation);

    /* JADX INFO: renamed from: h */
    void mo41625h(@NotNull String str);

    /* JADX INFO: renamed from: i */
    void mo41626i(@NotNull AbstractC45585n0 abstractC45585n0, @NotNull FragmentManager fragmentManager, @NotNull LifecycleCoroutineScope lifecycleCoroutineScope, @NotNull Function0<Boolean> function0, @Nullable Function1<? super Boolean, Unit> function1);

    /* JADX INFO: renamed from: j */
    void mo41627j(@NotNull BaseFragment baseFragment);

    /* JADX INFO: renamed from: k */
    void mo41628k(@NotNull FragmentActivity fragmentActivity);

    /* JADX INFO: renamed from: l */
    void mo41629l(@NotNull BaseFragment baseFragment, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable String str);
}
