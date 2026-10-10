package com.kubi.home.api;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.home.api.entity.HomeQuickAccessEntity;
import com.kubi.home.api.entity.QuickAccessEntity;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: IHomeService.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u0000  2\u00020\u0001:\u0001 J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0005H&J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0015J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0015J&\u0010\u0018\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH¦@¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/home/api/IHomeService;", "", "getCustomerService", "", "getUserLevelChange", "", "adjustHost", "host", "createHomeFragment", "Lcom/kubi/sdk/BaseFragment;", "getCoinIconUrl", FirebaseAnalytics.Param.CURRENCY, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHomeCardsABType", "", "()Ljava/lang/Integer;", "isUseHomeV2", "getAllNavigations", "", "Lcom/kubi/home/api/entity/QuickAccessEntity;", "useCache", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHomeShowNavigations", "Lcom/kubi/home/api/entity/HomeQuickAccessEntity;", "saveHomeShowNavigations", "ids", "userCustomVersion", "", "(Ljava/util/List;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryHideKoCoinPayPopup", "", "switchDrawerEventKey", "Companion", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IHomeService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f25434a = Companion.f25435a;

    /* JADX INFO: compiled from: IHomeService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/api/IHomeService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/home/api/IHomeService;", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f25435a = new Companion();

        @NotNull
        public final IHomeService get() {
            return (IHomeService) Router.f46192a.m56192n(IHomeService.class);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    Object mo28945a(@NotNull List<String> list, @Nullable Long l11, @NotNull Continuation<? super Boolean> continuation);

    @NotNull
    /* JADX INFO: renamed from: b */
    String mo28946b();

    @Nullable
    /* JADX INFO: renamed from: c */
    Object mo28947c(boolean z11, @NotNull Continuation<? super HomeQuickAccessEntity> continuation);

    @Nullable
    /* JADX INFO: renamed from: d */
    Object mo28948d(@NotNull String str, @NotNull Continuation<? super String> continuation);

    @Nullable
    /* JADX INFO: renamed from: e */
    Object mo28949e(boolean z11, @NotNull Continuation<? super List<QuickAccessEntity>> continuation);

    @NotNull
    /* JADX INFO: renamed from: f */
    BaseFragment mo28950f();

    /* JADX INFO: renamed from: g */
    void mo28951g();

    /* JADX INFO: renamed from: h */
    boolean mo28952h();

    @NotNull
    /* JADX INFO: renamed from: i */
    String mo28953i(@NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: j */
    Integer mo28954j();

    @NotNull
    /* JADX INFO: renamed from: k */
    String mo28955k();
}
