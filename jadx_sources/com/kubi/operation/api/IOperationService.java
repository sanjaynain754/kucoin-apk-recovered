package com.kubi.operation.api;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.kubi.kucoin.home.cards.ClassMapping;
import com.kubi.kucoin.home.p090v2.cards.ClassMappingV2;
import com.kubi.operation.api.entity.SearchTopicEntity;
import com.kubi.operation.api.entity.WelfareGuideInfo;
import com.kubi.router.core.Router;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: IOperationService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 $2\u00020\u0001:\u0001$J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0016\u0010\u0015\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0017H&J\b\u0010\u0018\u001a\u00020\fH&J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020\u001eH&J\b\u0010 \u001a\u00020\u001eH&J\u0010\u0010!\u001a\u0004\u0018\u00010\"H¦@¢\u0006\u0002\u0010#ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/operation/api/IOperationService;", "", "hotTopicCardClassMapping", "Lcom/kubi/kucoin/home/cards/ClassMapping;", "hotTopicFragment", "Landroidx/fragment/app/Fragment;", "coin", "", "welfareCardClassMapping", "bonusCardClassMapping", "mainCoinCardClassMapping", "provideHomeCardShimmer", "", "type", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "searchTopicFragment", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/operation/api/entity/SearchTopicEntity;", "checkIsNewcomer", "onFinish", "Lkotlin/Function0;", "onUserLogout", "welfareApplyJoinTask", "Lcom/kubi/operation/api/entity/WelfareSignupEntity;", "taskId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWidgetOfNewUser", "Lcom/kubi/kucoin/home/v2/cards/ClassMappingV2;", "getWidgetOfLearn", "getWidgetOfUserStatus", "getWelfareGuideInfo", "Lcom/kubi/operation/api/entity/WelfareGuideInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "OperationApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IOperationService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f36504a = Companion.f36505a;

    /* JADX INFO: compiled from: IOperationService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/operation/api/IOperationService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/operation/api/IOperationService;", "OperationApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f36505a = new Companion();

        @NotNull
        public final IOperationService get() {
            return (IOperationService) Router.f46192a.m56192n(IOperationService.class);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    Fragment mo4599a(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: b */
    ClassMappingV2 mo4600b();

    @NotNull
    /* JADX INFO: renamed from: c */
    ClassMapping mo4601c();

    @NotNull
    /* JADX INFO: renamed from: d */
    Fragment mo4602d(@NotNull SearchTopicEntity searchTopicEntity);

    @NotNull
    /* JADX INFO: renamed from: e */
    ClassMapping mo4603e();

    @NotNull
    /* JADX INFO: renamed from: f */
    ClassMappingV2 mo4604f();

    /* JADX INFO: renamed from: g */
    void mo4605g();

    /* JADX INFO: renamed from: h */
    void mo4606h(@NotNull String str, @NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup);

    @NotNull
    /* JADX INFO: renamed from: i */
    ClassMapping mo4607i();

    @Nullable
    /* JADX INFO: renamed from: j */
    Object mo4608j(@NotNull Continuation<? super WelfareGuideInfo> continuation);

    @NotNull
    /* JADX INFO: renamed from: k */
    ClassMappingV2 mo4609k();

    @NotNull
    /* JADX INFO: renamed from: l */
    ClassMapping mo4610l();
}
