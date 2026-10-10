package bt;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.kubi.kucoin.home.cards.ClassMapping;
import com.kubi.kucoin.home.p090v2.cards.ClassMappingV2;
import com.kubi.operation.api.IOperationService;
import com.kubi.operation.api.entity.SearchTopicEntity;
import com.kubi.operation.api.entity.WelfareGuideInfo;
import com.kubi.operation.lib.cards.bonus.BonusCard;
import com.kubi.operation.lib.cards.bonus.BonusCardData;
import com.kubi.operation.lib.cards.bonus.BonusCardInterceptor;
import com.kubi.operation.lib.cards.bonus.BonusCardViewHolder;
import com.kubi.operation.lib.cards.maincoin.MainCoinCard;
import com.kubi.operation.lib.cards.maincoin.MainCoinCardData;
import com.kubi.operation.lib.cards.maincoin.MainCoinCardViewHolder;
import com.kubi.operation.lib.cards.topic.HotTopicCard;
import com.kubi.operation.lib.cards.topic.HotTopicCardData;
import com.kubi.operation.lib.cards.topic.HotTopicCardInterceptor;
import com.kubi.operation.lib.cards.topic.HotTopicCardViewHolder;
import com.kubi.operation.lib.cards.welfare.WelfareCard;
import com.kubi.operation.lib.cards.welfare.WelfareCardData;
import com.kubi.operation.lib.cards.welfare.WelfareCardInterceptor;
import com.kubi.operation.lib.cards.welfare.WelfareCardViewHolder;
import com.kubi.operation.lib.topic.market.CoinTopicFragment;
import com.kubi.operation.lib.topic.search.SearchTopicFragment;
import com.kubi.operation.lib.utils.C19553c;
import com.kubi.operation.lib.utils.OperationGuideHelper;
import com.kubi.operation.lib.utils.ShimmerHelper;
import com.kubi.operation.lib.widgets.learn.C19576a;
import com.kubi.operation.lib.widgets.newuser.C19582a;
import com.kubi.operation.lib.widgets.userstatus.C19606a;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p808ys.InterfaceC46560a;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: bt.a */
/* JADX INFO: compiled from: OperationService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0016\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u0004\u0018\u00010!H\u0096@¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020$H\u0016¨\u0006'"}, m90084d2 = {"Lcom/kubi/operation/lib/service/OperationService;", "Lcom/kubi/operation/api/IOperationService;", "<init>", "()V", "hotTopicCardClassMapping", "Lcom/kubi/kucoin/home/cards/ClassMapping;", "hotTopicFragment", "Lcom/kubi/operation/lib/topic/market/CoinTopicFragment;", "coin", "", "welfareCardClassMapping", "bonusCardClassMapping", "mainCoinCardClassMapping", "provideHomeCardShimmer", "", "type", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "searchTopicFragment", "Landroidx/fragment/app/Fragment;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/operation/api/entity/SearchTopicEntity;", "checkIsNewcomer", "onFinish", "Lkotlin/Function0;", "onUserLogout", "welfareApplyJoinTask", "Lcom/kubi/operation/api/entity/WelfareSignupEntity;", "taskId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWelfareGuideInfo", "Lcom/kubi/operation/api/entity/WelfareGuideInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWidgetOfNewUser", "Lcom/kubi/kucoin/home/v2/cards/ClassMappingV2;", "getWidgetOfLearn", "getWidgetOfUserStatus", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOperationService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperationService.kt\ncom/kubi/operation/lib/service/OperationService\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n17#2,2:134\n33#3:136\n34#3:138\n25#3:139\n26#3:141\n1#4:137\n1#4:140\n*S KotlinDebug\n*F\n+ 1 OperationService.kt\ncom/kubi/operation/lib/service/OperationService\n*L\n69#1:134,2\n116#1:136\n116#1:138\n119#1:139\n119#1:141\n116#1:137\n119#1:140\n*E\n"})
public final class C4648a implements IOperationService {
    @Override // com.kubi.operation.api.IOperationService
    @NotNull
    /* JADX INFO: renamed from: c */
    public ClassMapping mo4601c() {
        return new ClassMapping(MainCoinCardViewHolder.class, MainCoinCard.class, MainCoinCardData.class, null, 8, null);
    }

    @Override // com.kubi.operation.api.IOperationService
    @NotNull
    /* JADX INFO: renamed from: d */
    public Fragment mo4602d(@NotNull SearchTopicEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return SearchTopicFragment.f36830W.instance(entity);
    }

    @Override // com.kubi.operation.api.IOperationService
    @NotNull
    /* JADX INFO: renamed from: e */
    public ClassMapping mo4603e() {
        return new ClassMapping(BonusCardViewHolder.class, BonusCard.class, BonusCardData.class, new BonusCardInterceptor());
    }

    @Override // com.kubi.operation.api.IOperationService
    /* JADX INFO: renamed from: g */
    public void mo4605g() {
        C19553c.m43659g(-1L);
        C19553c.m43660h(-1L);
    }

    @Override // com.kubi.operation.api.IOperationService
    /* JADX INFO: renamed from: h */
    public void mo4606h(@NotNull String type, @NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(parent, "parent");
        ShimmerHelper.f36897a.m43687a(type, inflater, parent);
    }

    @Override // com.kubi.operation.api.IOperationService
    @NotNull
    /* JADX INFO: renamed from: i */
    public ClassMapping mo4607i() {
        ClassMapping classMappingM102717b;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46560a.class, SiteInfoManager.f47913a.m58109c());
        return (objM56186h == null || (classMappingM102717b = ((InterfaceC46560a) objM56186h).m102717b()) == null) ? new ClassMapping(WelfareCardViewHolder.class, WelfareCard.class, WelfareCardData.class, new WelfareCardInterceptor()) : classMappingM102717b;
    }

    @Override // com.kubi.operation.api.IOperationService
    @Nullable
    /* JADX INFO: renamed from: j */
    public Object mo4608j(@NotNull Continuation<? super WelfareGuideInfo> continuation) {
        return OperationGuideHelper.f36851a.m43649b(continuation);
    }

    @Override // com.kubi.operation.api.IOperationService
    @NotNull
    /* JADX INFO: renamed from: l */
    public ClassMapping mo4610l() {
        return new ClassMapping(HotTopicCardViewHolder.class, HotTopicCard.class, HotTopicCardData.class, new HotTopicCardInterceptor());
    }

    @Override // com.kubi.operation.api.IOperationService
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public CoinTopicFragment mo4599a(@NotNull String coin) {
        Intrinsics.checkNotNullParameter(coin, "coin");
        return CoinTopicFragment.f36823W.instance(coin);
    }

    @Override // com.kubi.operation.api.IOperationService
    @NotNull
    /* JADX INFO: renamed from: b */
    public ClassMappingV2 mo4600b() {
        return C19606a.m43901a();
    }

    @Override // com.kubi.operation.api.IOperationService
    @NotNull
    /* JADX INFO: renamed from: f */
    public ClassMappingV2 mo4604f() {
        return C19582a.m43749a();
    }

    @Override // com.kubi.operation.api.IOperationService
    @NotNull
    /* JADX INFO: renamed from: k */
    public ClassMappingV2 mo4609k() {
        return C19576a.m43716a();
    }
}
