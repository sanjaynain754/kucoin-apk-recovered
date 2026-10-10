package iq;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.kubi.mine.api.entity.KycStatusEntity;
import gq.C37992m;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45660a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: iq.c */
/* JADX INFO: compiled from: IMineFragmentFlavor.kt */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC45660a
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J \u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH&J$\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H&J\u0016\u0010\u0013\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H&J\u0016\u0010\u0015\u001a\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H&J\u0012\u0010\u0017\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0018\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0019\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u001aH&J\b\u0010\u001b\u001a\u00020\u0003H&J\u0012\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/mine/lib/flavor/IMineFragmentFlavor;", "", "flavorLoadVipIcon", "", "binding", "Lcom/kubi/mine/databinding/KucoinFragmentMineBinding;", "userinfoBinding", "Lcom/kubi/mine/databinding/BmineLayoutUserinfoBinding;", "flavorLoadKCSLevel", "flavorFetchNewcomerAndKycGuide", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "kycStateLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/mine/api/entity/KycStatusEntity;", "flavorRefreshData", "refreshUserInfo", "Lkotlin/Function0;", "updateInfo", "flavorOnShow", "fetchNewcomerAndKycGuide", "flavorInitObservers", "observeKycStatus", "flavorInitViews", "flavorUpdateInfo", "flavorUpdateInviteInfo", "Lcom/kubi/mine/databinding/BmineLayoutReferralBinding;", "clickKycStatus", "onCustomerIconClick", "context", "Landroid/content/Context;", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC40161c {
    /* JADX INFO: renamed from: a */
    void m88512a(@NotNull Function0<Unit> function0);

    /* JADX INFO: renamed from: b */
    void m88513b(@NotNull Function0<Unit> function0);

    /* JADX INFO: renamed from: c */
    void m88514c(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function1);

    /* JADX INFO: renamed from: d */
    void m88515d(@Nullable C37992m c37992m);

    /* JADX INFO: renamed from: e */
    void m88516e(@Nullable Context context);

    /* JADX INFO: renamed from: f */
    void m88517f();

    /* JADX INFO: renamed from: g */
    void m88518g(@NotNull InterfaceC41709m0 interfaceC41709m0, @NotNull MutableLiveData<KycStatusEntity> mutableLiveData);
}
