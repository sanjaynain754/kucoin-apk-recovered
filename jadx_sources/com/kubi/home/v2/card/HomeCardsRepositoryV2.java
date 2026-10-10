package com.kubi.home.v2.card;

import com.kubi.home.config.HomeFeedTab;
import com.kubi.home.exception.HomeException;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.kucoin.home.p090v2.cards.CardFlowParserV2;
import com.kubi.kucoin.home.p090v2.cardsconfig.CardListReqV2;
import com.kubi.kucoin.home.p090v2.cardsconfig.CardListRspV2;
import com.kubi.kucoin.token.ITokenLifecycleRefreshSPI;
import com.kubi.kucoin.token.TokenLifecycleManager;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.core.C27033g;
import dj.C36718c;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p351iy.C40192c;
import p569qq.C43846g;
import p764xk.InterfaceC46257e;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import ro.C44128b;
import sj.C44510a;
import tj.InterfaceC45038a;
import y70.C46392a;

/* JADX INFO: compiled from: HomeCardsRepositoryV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u00014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u0018\u001a\u00020\u0019J0\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00102\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00152\b\b\u0002\u0010\u001e\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0010H\u0086@¢\u0006\u0002\u0010!J*\u0010\"\u001a\u0004\u0018\u00010\u00102\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020&H\u0082@¢\u0006\u0002\u0010'J\u000e\u0010(\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010!J&\u0010)\u001a\u0004\u0018\u00010\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00152\u0006\u0010,\u001a\u00020&H\u0086@¢\u0006\u0002\u0010-J\u0016\u0010.\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u0015H\u0086@¢\u0006\u0002\u0010!J\u0010\u00100\u001a\u0004\u0018\u000101H\u0086@¢\u0006\u0002\u0010!J\u0006\u00102\u001a\u00020\u0019J\u0006\u00103\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u00065"}, m90084d2 = {"Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;", "", "<init>", "()V", "TAG", "", "HOME_CARD_CONFIG_PATH", "isFeedEnable", "", "()Z", "setFeedEnable", "(Z)V", "homeCardFlowParser", "com/kubi/home/v2/card/HomeCardsRepositoryV2$homeCardFlowParser$1", "Lcom/kubi/home/v2/card/HomeCardsRepositoryV2$homeCardFlowParser$1;", "latestConfig", "Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2;", "initConfig", "getInitConfig", "()Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2;", "getUserWidgetList", "", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "getCardConfig", "buildVisibleCardFlow", "", "saveConfig", "rsp", "preList", "Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2$AppWidgetConfigVO;", "refreshCacheTime", "(Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCardConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCardConfig", "requestMD5", "hasLogin", "retry", "", "(Ljava/lang/String;ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshTokenForHome5000007", "saveUserConfig", "userList", "Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2$UserCustomWidget;", "version", "(Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFeedTabs", "Lcom/kubi/home/config/HomeFeedTab;", "fetchLevelUpDialogInfo", "Lcom/kubi/home/v2/card/VipLevelUpDialogInfo;", "clearCache", "userLogin", "CardsApiV2", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeCardsRepositoryV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeCardsRepositoryV2.kt\ncom/kubi/home/v2/card/HomeCardsRepositoryV2\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n+ 6 Router.kt\ncom/kubi/router/core/Router\n*L\n1#1,321:1\n17#2,2:322\n32#3:324\n23#3,2:328\n1#4:325\n47#5,2:326\n47#5,2:330\n47#5,2:333\n47#5,2:335\n47#5,2:337\n176#6:332\n*S KotlinDebug\n*F\n+ 1 HomeCardsRepositoryV2.kt\ncom/kubi/home/v2/card/HomeCardsRepositoryV2\n*L\n84#1:322,2\n87#1:324\n141#1:328,2\n92#1:326,2\n177#1:330,2\n245#1:333,2\n261#1:335,2\n277#1:337,2\n188#1:332\n*E\n"})
public final class HomeCardsRepositoryV2 {

    /* JADX INFO: renamed from: b */
    public static volatile boolean f26495b;

    /* JADX INFO: renamed from: d */
    @Nullable
    public static CardListRspV2 f26497d;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final HomeCardsRepositoryV2 f26494a = new HomeCardsRepositoryV2();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final C14984b f26496c = new C14984b();

    /* JADX INFO: renamed from: com.kubi.home.v2.card.HomeCardsRepositoryV2$a */
    /* JADX INFO: compiled from: HomeCardsRepositoryV2.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH§@¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u000eH§@¢\u0006\u0002\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/home/v2/card/HomeCardsRepositoryV2$CardsApiV2;", "", "getConfig", "Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2;", "requestMD5", "", "hasLogined", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUserConfig", "cardList", "Lcom/kubi/kucoin/home/v2/cardsconfig/CardListReqV2;", "(Lcom/kubi/kucoin/home/v2/cardsconfig/CardListReqV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFeedTabs", "", "Lcom/kubi/home/config/HomeFeedTab;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchVipDialogInfo", "Lcom/kubi/home/v2/card/VipLevelUpDialogInfo;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC14983a {
        @GET("vip/prize/pop-up")
        @Nullable
        /* JADX INFO: renamed from: a */
        Object m30801a(@NotNull Continuation<? super List<VipLevelUpDialogInfo>> continuation);

        @POST("v1/homepage/widget/save")
        @Nullable
        /* JADX INFO: renamed from: b */
        Object m30802b(@Body @NotNull CardListReqV2 cardListReqV2, @NotNull Continuation<? super Boolean> continuation);

        @GET("homepage/v2/widget")
        @Nullable
        /* JADX INFO: renamed from: c */
        Object m30803c(@NotNull @Query("requestMD5") String str, @Query("hasLogined") boolean z11, @NotNull Continuation<? super CardListRspV2> continuation);

        @GET("v2/article-feed/modules")
        @Nullable
        /* JADX INFO: renamed from: d */
        Object m30804d(@NotNull Continuation<? super List<HomeFeedTab>> continuation);
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.card.HomeCardsRepositoryV2$b */
    /* JADX INFO: compiled from: HomeCardsRepositoryV2.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/home/v2/card/HomeCardsRepositoryV2$homeCardFlowParser$1", "Lcom/kubi/kucoin/home/v2/cards/CardFlowParserV2;", "loadCardData", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "allWidget", "", "", "Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2$AppWidgetConfigVO;", "userWidget", "Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2$UserCustomWidget;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nHomeCardsRepositoryV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeCardsRepositoryV2.kt\ncom/kubi/home/v2/card/HomeCardsRepositoryV2$homeCardFlowParser$1\n+ 2 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n*L\n1#1,321:1\n47#2,2:322\n*S KotlinDebug\n*F\n+ 1 HomeCardsRepositoryV2.kt\ncom/kubi/home/v2/card/HomeCardsRepositoryV2$homeCardFlowParser$1\n*L\n68#1:322,2\n*E\n"})
    public static final class C14984b extends CardFlowParserV2 {
        @Override // com.kubi.kucoin.home.p090v2.cards.CardFlowParserV2
        /* JADX INFO: renamed from: c */
        public BaseCardDataV2 mo30805c(Map<String, CardListRspV2.AppWidgetConfigVO> allWidget, CardListRspV2.UserCustomWidget userWidget) {
            Intrinsics.checkNotNullParameter(allWidget, "allWidget");
            Intrinsics.checkNotNullParameter(userWidget, "userWidget");
            try {
                Result.Companion companion = Result.INSTANCE;
                CardListRspV2.AppWidgetConfigVO appWidgetConfigVO = allWidget.get(userWidget.getCode());
                if (appWidgetConfigVO != null && appWidgetConfigVO.getStyle().contains(userWidget.getStyle())) {
                    return C15000n.m30814d(appWidgetConfigVO, userWidget.getStyle());
                }
                return null;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(Result.m103844constructorimpl(ResultKt.createFailure(th2)));
                if (thM103847exceptionOrNullimpl != null) {
                    C43846g.m96568c(new HomeException(thM103847exceptionOrNullimpl, "WidgetException", false, null, 8, null), null, 2, null);
                }
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m30788d() {
        f26497d = null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m30785f(HomeCardsRepositoryV2 homeCardsRepositoryV2, String str, boolean z11, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return homeCardsRepositoryV2.m30789e(str, z11, i11, continuation);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Object m30786p(HomeCardsRepositoryV2 homeCardsRepositoryV2, CardListRspV2 cardListRspV2, List list, boolean z11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return homeCardsRepositoryV2.m30798o(cardListRspV2, list, z11, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:59:0x0102  */
    /* JADX WARN: Code duplicated, block: B:62:0x011d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x011e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0120  */
    /* JADX WARN: Code duplicated, block: B:68:0x014c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x014d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: e */
    public final Object m30789e(String str, boolean z11, int i11, Continuation<? super CardListRspV2> continuation) {
        HomeCardsRepositoryV2$fetchCardConfig$1 homeCardsRepositoryV2$fetchCardConfig$1;
        int i12;
        boolean z12;
        Object objM30789e;
        Object objM30797n;
        String str2;
        int i13;
        ApiException apiException;
        Object objM30789e2;
        if (continuation instanceof HomeCardsRepositoryV2$fetchCardConfig$1) {
            homeCardsRepositoryV2$fetchCardConfig$1 = (HomeCardsRepositoryV2$fetchCardConfig$1) continuation;
            int i14 = homeCardsRepositoryV2$fetchCardConfig$1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                homeCardsRepositoryV2$fetchCardConfig$1.label = i14 - Integer.MIN_VALUE;
            } else {
                homeCardsRepositoryV2$fetchCardConfig$1 = new HomeCardsRepositoryV2$fetchCardConfig$1(this, continuation);
            }
        } else {
            homeCardsRepositoryV2$fetchCardConfig$1 = new HomeCardsRepositoryV2$fetchCardConfig$1(this, continuation);
        }
        Object objM30803c = homeCardsRepositoryV2$fetchCardConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i15 = homeCardsRepositoryV2$fetchCardConfig$1.label;
        try {
            if (i15 == 0) {
                ResultKt.throwOnFailure(objM30803c);
                try {
                    InterfaceC14983a interfaceC14983a = (InterfaceC14983a) C42597a.m93388d().create(InterfaceC14983a.class);
                    homeCardsRepositoryV2$fetchCardConfig$1.L$0 = str;
                    homeCardsRepositoryV2$fetchCardConfig$1.Z$0 = z11;
                    i12 = i11;
                    try {
                        homeCardsRepositoryV2$fetchCardConfig$1.I$0 = i12;
                        homeCardsRepositoryV2$fetchCardConfig$1.label = 1;
                        objM30803c = interfaceC14983a.m30803c(str, z11, homeCardsRepositoryV2$fetchCardConfig$1);
                        if (objM30803c != coroutine_suspended) {
                            z12 = z11;
                            return (CardListRspV2) objM30803c;
                        }
                    } catch (ApiException e11) {
                        e = e11;
                        z12 = z11;
                        C44128b.m97261e("WidgetException", "fetchCardConfig error: " + e.code + ' ' + e.getMessage());
                        if (Intrinsics.areEqual(e.code, "5000007")) {
                            if (C40192c.f89321a.m88545g()) {
                                if (i12 < 3) {
                                    homeCardsRepositoryV2$fetchCardConfig$1.L$0 = str;
                                    homeCardsRepositoryV2$fetchCardConfig$1.L$1 = SpillingKt.nullOutSpilledVariable(e);
                                    homeCardsRepositoryV2$fetchCardConfig$1.Z$0 = z12;
                                    homeCardsRepositoryV2$fetchCardConfig$1.I$0 = i12;
                                    homeCardsRepositoryV2$fetchCardConfig$1.label = 2;
                                    objM30797n = m30797n(homeCardsRepositoryV2$fetchCardConfig$1);
                                    if (objM30797n != coroutine_suspended) {
                                        str2 = str;
                                        i13 = i12;
                                        apiException = e;
                                        objM30803c = objM30797n;
                                        if (((Boolean) objM30803c).booleanValue()) {
                                            homeCardsRepositoryV2$fetchCardConfig$1.L$0 = SpillingKt.nullOutSpilledVariable(str2);
                                            homeCardsRepositoryV2$fetchCardConfig$1.L$1 = SpillingKt.nullOutSpilledVariable(apiException);
                                            homeCardsRepositoryV2$fetchCardConfig$1.Z$0 = z12;
                                            homeCardsRepositoryV2$fetchCardConfig$1.I$0 = i13;
                                            homeCardsRepositoryV2$fetchCardConfig$1.label = 3;
                                            objM30789e2 = m30789e(str2, z12, i13 + 1, homeCardsRepositoryV2$fetchCardConfig$1);
                                            if (objM30789e2 != coroutine_suspended) {
                                                return objM30789e2;
                                            }
                                        }
                                    }
                                    return coroutine_suspended;
                                }
                            } else if (i12 < 3) {
                                homeCardsRepositoryV2$fetchCardConfig$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
                                homeCardsRepositoryV2$fetchCardConfig$1.L$1 = SpillingKt.nullOutSpilledVariable(e);
                                homeCardsRepositoryV2$fetchCardConfig$1.Z$0 = z12;
                                homeCardsRepositoryV2$fetchCardConfig$1.I$0 = i12;
                                homeCardsRepositoryV2$fetchCardConfig$1.label = 4;
                                objM30789e = m30789e(str, z12, i12 + 1, homeCardsRepositoryV2$fetchCardConfig$1);
                                if (objM30789e == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return objM30789e;
                            }
                        }
                        return null;
                    }
                } catch (ApiException e12) {
                    e = e12;
                    i12 = i11;
                }
                return coroutine_suspended;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3 && i15 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objM30803c);
                    return objM30803c;
                }
                i13 = homeCardsRepositoryV2$fetchCardConfig$1.I$0;
                z12 = homeCardsRepositoryV2$fetchCardConfig$1.Z$0;
                apiException = (ApiException) homeCardsRepositoryV2$fetchCardConfig$1.L$1;
                str2 = (String) homeCardsRepositoryV2$fetchCardConfig$1.L$0;
                ResultKt.throwOnFailure(objM30803c);
                if (((Boolean) objM30803c).booleanValue()) {
                    homeCardsRepositoryV2$fetchCardConfig$1.L$0 = SpillingKt.nullOutSpilledVariable(str2);
                    homeCardsRepositoryV2$fetchCardConfig$1.L$1 = SpillingKt.nullOutSpilledVariable(apiException);
                    homeCardsRepositoryV2$fetchCardConfig$1.Z$0 = z12;
                    homeCardsRepositoryV2$fetchCardConfig$1.I$0 = i13;
                    homeCardsRepositoryV2$fetchCardConfig$1.label = 3;
                    objM30789e2 = m30789e(str2, z12, i13 + 1, homeCardsRepositoryV2$fetchCardConfig$1);
                    if (objM30789e2 != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objM30789e2;
                }
                return null;
            }
            int i16 = homeCardsRepositoryV2$fetchCardConfig$1.I$0;
            z12 = homeCardsRepositoryV2$fetchCardConfig$1.Z$0;
            String str3 = (String) homeCardsRepositoryV2$fetchCardConfig$1.L$0;
            try {
                ResultKt.throwOnFailure(objM30803c);
                i12 = i16;
                str = str3;
                try {
                    return (CardListRspV2) objM30803c;
                } catch (ApiException e13) {
                    e = e13;
                    C44128b.m97261e("WidgetException", "fetchCardConfig error: " + e.code + ' ' + e.getMessage());
                    if (Intrinsics.areEqual(e.code, "5000007")) {
                        if (C40192c.f89321a.m88545g()) {
                            if (i12 < 3) {
                                homeCardsRepositoryV2$fetchCardConfig$1.L$0 = str;
                                homeCardsRepositoryV2$fetchCardConfig$1.L$1 = SpillingKt.nullOutSpilledVariable(e);
                                homeCardsRepositoryV2$fetchCardConfig$1.Z$0 = z12;
                                homeCardsRepositoryV2$fetchCardConfig$1.I$0 = i12;
                                homeCardsRepositoryV2$fetchCardConfig$1.label = 2;
                                objM30797n = m30797n(homeCardsRepositoryV2$fetchCardConfig$1);
                                if (objM30797n != coroutine_suspended) {
                                    str2 = str;
                                    i13 = i12;
                                    apiException = e;
                                    objM30803c = objM30797n;
                                    if (((Boolean) objM30803c).booleanValue()) {
                                        homeCardsRepositoryV2$fetchCardConfig$1.L$0 = SpillingKt.nullOutSpilledVariable(str2);
                                        homeCardsRepositoryV2$fetchCardConfig$1.L$1 = SpillingKt.nullOutSpilledVariable(apiException);
                                        homeCardsRepositoryV2$fetchCardConfig$1.Z$0 = z12;
                                        homeCardsRepositoryV2$fetchCardConfig$1.I$0 = i13;
                                        homeCardsRepositoryV2$fetchCardConfig$1.label = 3;
                                        objM30789e2 = m30789e(str2, z12, i13 + 1, homeCardsRepositoryV2$fetchCardConfig$1);
                                        if (objM30789e2 != coroutine_suspended) {
                                            return objM30789e2;
                                        }
                                    }
                                }
                                return coroutine_suspended;
                            }
                        } else if (i12 < 3 && InterfaceC46257e.m102016a((InterfaceC46257e) Router.f46192a.m56192n(InterfaceC46257e.class), "v1/homepage/widget-info", null, 2, null)) {
                            homeCardsRepositoryV2$fetchCardConfig$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
                            homeCardsRepositoryV2$fetchCardConfig$1.L$1 = SpillingKt.nullOutSpilledVariable(e);
                            homeCardsRepositoryV2$fetchCardConfig$1.Z$0 = z12;
                            homeCardsRepositoryV2$fetchCardConfig$1.I$0 = i12;
                            homeCardsRepositoryV2$fetchCardConfig$1.label = 4;
                            objM30789e = m30789e(str, z12, i12 + 1, homeCardsRepositoryV2$fetchCardConfig$1);
                            if (objM30789e == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return objM30789e;
                        }
                    }
                    return null;
                }
            } catch (ApiException e14) {
                e = e14;
                i12 = i16;
                str = str3;
                C44128b.m97261e("WidgetException", "fetchCardConfig error: " + e.code + ' ' + e.getMessage());
                if (Intrinsics.areEqual(e.code, "5000007")) {
                    if (C40192c.f89321a.m88545g()) {
                        if (i12 < 3) {
                            homeCardsRepositoryV2$fetchCardConfig$1.L$0 = str;
                            homeCardsRepositoryV2$fetchCardConfig$1.L$1 = SpillingKt.nullOutSpilledVariable(e);
                            homeCardsRepositoryV2$fetchCardConfig$1.Z$0 = z12;
                            homeCardsRepositoryV2$fetchCardConfig$1.I$0 = i12;
                            homeCardsRepositoryV2$fetchCardConfig$1.label = 2;
                            objM30797n = m30797n(homeCardsRepositoryV2$fetchCardConfig$1);
                            if (objM30797n != coroutine_suspended) {
                                str2 = str;
                                i13 = i12;
                                apiException = e;
                                objM30803c = objM30797n;
                                if (((Boolean) objM30803c).booleanValue()) {
                                    homeCardsRepositoryV2$fetchCardConfig$1.L$0 = SpillingKt.nullOutSpilledVariable(str2);
                                    homeCardsRepositoryV2$fetchCardConfig$1.L$1 = SpillingKt.nullOutSpilledVariable(apiException);
                                    homeCardsRepositoryV2$fetchCardConfig$1.Z$0 = z12;
                                    homeCardsRepositoryV2$fetchCardConfig$1.I$0 = i13;
                                    homeCardsRepositoryV2$fetchCardConfig$1.label = 3;
                                    objM30789e2 = m30789e(str2, z12, i13 + 1, homeCardsRepositoryV2$fetchCardConfig$1);
                                    if (objM30789e2 != coroutine_suspended) {
                                        return objM30789e2;
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                    } else if (i12 < 3) {
                        homeCardsRepositoryV2$fetchCardConfig$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
                        homeCardsRepositoryV2$fetchCardConfig$1.L$1 = SpillingKt.nullOutSpilledVariable(e);
                        homeCardsRepositoryV2$fetchCardConfig$1.Z$0 = z12;
                        homeCardsRepositoryV2$fetchCardConfig$1.I$0 = i12;
                        homeCardsRepositoryV2$fetchCardConfig$1.label = 4;
                        objM30789e = m30789e(str, z12, i12 + 1, homeCardsRepositoryV2$fetchCardConfig$1);
                        if (objM30789e == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return objM30789e;
                    }
                }
                return null;
            }
        } catch (CancellationException e15) {
            throw e15;
        } catch (JSONException e16) {
            C43846g.m96568c(new HomeException(e16, "WidgetException", false, null, 8, null), null, 2, null);
        } catch (Exception e17) {
            C44128b.m97263g("WidgetException", e17);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m30790g(@NotNull Continuation<? super List<HomeFeedTab>> continuation) {
        HomeCardsRepositoryV2$fetchFeedTabs$1 homeCardsRepositoryV2$fetchFeedTabs$1;
        if (continuation instanceof HomeCardsRepositoryV2$fetchFeedTabs$1) {
            homeCardsRepositoryV2$fetchFeedTabs$1 = (HomeCardsRepositoryV2$fetchFeedTabs$1) continuation;
            int i11 = homeCardsRepositoryV2$fetchFeedTabs$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeCardsRepositoryV2$fetchFeedTabs$1.label = i11 - Integer.MIN_VALUE;
            } else {
                homeCardsRepositoryV2$fetchFeedTabs$1 = new HomeCardsRepositoryV2$fetchFeedTabs$1(this, continuation);
            }
        } else {
            homeCardsRepositoryV2$fetchFeedTabs$1 = new HomeCardsRepositoryV2$fetchFeedTabs$1(this, continuation);
        }
        Object objM30804d = homeCardsRepositoryV2$fetchFeedTabs$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = homeCardsRepositoryV2$fetchFeedTabs$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM30804d);
                InterfaceC14983a interfaceC14983a = (InterfaceC14983a) C42597a.m93388d().create(InterfaceC14983a.class);
                homeCardsRepositoryV2$fetchFeedTabs$1.label = 1;
                objM30804d = interfaceC14983a.m30804d(homeCardsRepositoryV2$fetchFeedTabs$1);
                if (objM30804d == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM30804d);
            }
            return (List) objM30804d;
        } catch (ApiException e11) {
            C44128b.m97259c("WidgetException", "getFeedTabs error: " + e11.code + ' ' + e11.getMessage());
            return null;
        } catch (Exception e12) {
            C43846g.m96568c(new HomeException(e12, "WidgetException", false, null, 8, null), null, 2, null);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: h */
    public final Object m30791h(@NotNull Continuation<? super VipLevelUpDialogInfo> continuation) {
        HomeCardsRepositoryV2$fetchLevelUpDialogInfo$1 homeCardsRepositoryV2$fetchLevelUpDialogInfo$1;
        if (continuation instanceof HomeCardsRepositoryV2$fetchLevelUpDialogInfo$1) {
            homeCardsRepositoryV2$fetchLevelUpDialogInfo$1 = (HomeCardsRepositoryV2$fetchLevelUpDialogInfo$1) continuation;
            int i11 = homeCardsRepositoryV2$fetchLevelUpDialogInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeCardsRepositoryV2$fetchLevelUpDialogInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                homeCardsRepositoryV2$fetchLevelUpDialogInfo$1 = new HomeCardsRepositoryV2$fetchLevelUpDialogInfo$1(this, continuation);
            }
        } else {
            homeCardsRepositoryV2$fetchLevelUpDialogInfo$1 = new HomeCardsRepositoryV2$fetchLevelUpDialogInfo$1(this, continuation);
        }
        Object objM30801a = homeCardsRepositoryV2$fetchLevelUpDialogInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = homeCardsRepositoryV2$fetchLevelUpDialogInfo$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM30801a);
                InterfaceC14983a interfaceC14983a = (InterfaceC14983a) C42597a.m93388d().create(InterfaceC14983a.class);
                homeCardsRepositoryV2$fetchLevelUpDialogInfo$1.label = 1;
                objM30801a = interfaceC14983a.m30801a(homeCardsRepositoryV2$fetchLevelUpDialogInfo$1);
                if (objM30801a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM30801a);
            }
            List list = (List) objM30801a;
            if (list != null) {
                return (VipLevelUpDialogInfo) CollectionsKt.getOrNull(list, 0);
            }
            return null;
        } catch (ApiException e11) {
            C44128b.m97259c("HomeCardsRepositoryV2", "[fetchLevelUpDialogInfo] error: " + e11.code + ' ' + e11.getMessage());
            return null;
        } catch (Exception e12) {
            C43846g.m96568c(new HomeException(e12, "HomeCardsRepositoryV2", false, null, 8, null), null, 2, null);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final CardListRspV2 m30792i() {
        CardListRspV2 cardListRspV2 = f26497d;
        if (cardListRspV2 != null) {
            return cardListRspV2;
        }
        CardListRspV2 cardListRspV2M30793j = m30793j();
        f26497d = cardListRspV2M30793j;
        return cardListRspV2M30793j;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX INFO: renamed from: j */
    public final CardListRspV2 m30793j() {
        CardListRspV2 cardListRspV2M99597a;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC45038a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null && (cardListRspV2M99597a = ((InterfaceC45038a) objM56186h).m99597a()) != null) {
            return cardListRspV2M99597a;
        }
        try {
            CardListRspV2 cardListRspV2 = (CardListRspV2) C27099x.m66913c(C46392a.m102326h(C44510a.f98560a.m98476b(), ""), CardListRspV2.class);
            if (cardListRspV2 != null) {
                if (cardListRspV2.getAllWidgetList() == null || cardListRspV2.getUserCustomWidgetList() == null) {
                    cardListRspV2 = null;
                } else {
                    cardListRspV2.getUserCustomVersion();
                    if (cardListRspV2.getUserCustomVersion() < 0) {
                        cardListRspV2 = null;
                    }
                }
                if (cardListRspV2 != null) {
                    return cardListRspV2;
                }
            }
        } catch (Exception e11) {
            C44128b.m97263g("WidgetException", e11);
            C43846g.m96568c(new HomeException(e11, "WidgetException", false, null, 8, null), null, 2, null);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final List<BaseCardDataV2> m30794k() {
        return f26496c.m32259b();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m30795l() {
        return f26495b;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    /* JADX INFO: renamed from: m */
    public final Object m30796m(@NotNull Continuation<? super CardListRspV2> continuation) {
        HomeCardsRepositoryV2$loadCardConfig$1 homeCardsRepositoryV2$loadCardConfig$1;
        String lowerCase;
        List<CardListRspV2.AppWidgetConfigVO> list;
        String str;
        String string;
        String strM66629a;
        CardListRspV2 cardListRspV2;
        CardListRspV2 cardListRspV3;
        if (continuation instanceof HomeCardsRepositoryV2$loadCardConfig$1) {
            homeCardsRepositoryV2$loadCardConfig$1 = (HomeCardsRepositoryV2$loadCardConfig$1) continuation;
            int i11 = homeCardsRepositoryV2$loadCardConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeCardsRepositoryV2$loadCardConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                homeCardsRepositoryV2$loadCardConfig$1 = new HomeCardsRepositoryV2$loadCardConfig$1(this, continuation);
            }
        } else {
            homeCardsRepositoryV2$loadCardConfig$1 = new HomeCardsRepositoryV2$loadCardConfig$1(this, continuation);
        }
        HomeCardsRepositoryV2$loadCardConfig$1 homeCardsRepositoryV2$loadCardConfig$2 = homeCardsRepositoryV2$loadCardConfig$1;
        Object obj = homeCardsRepositoryV2$loadCardConfig$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = homeCardsRepositoryV2$loadCardConfig$2.label;
        CardListRspV2 cardListRspV4 = null;
        if (i12 != 0) {
            if (i12 == 1) {
                str = (String) homeCardsRepositoryV2$loadCardConfig$2.L$1;
                List<CardListRspV2.AppWidgetConfigVO> list2 = (List) homeCardsRepositoryV2$loadCardConfig$2.L$0;
                ResultKt.throwOnFailure(obj);
                list = list2;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cardListRspV3 = (CardListRspV2) homeCardsRepositoryV2$loadCardConfig$2.L$2;
                ResultKt.throwOnFailure(obj);
            }
            if (cardListRspV3 != null) {
                cardListRspV4 = cardListRspV3;
            } else if (C36718c.m82250a()) {
                cardListRspV4 = f26497d;
            }
            f26495b = cardListRspV4 != null ? cardListRspV4.getFeedEnabled() : false;
            return cardListRspV4;
        }
        ResultKt.throwOnFailure(obj);
        CardListRspV2 cardListRspV2M30792i = m30792i();
        List<CardListRspV2.AppWidgetConfigVO> allWidgetList = cardListRspV2M30792i != null ? cardListRspV2M30792i.getAllWidgetList() : null;
        if (allWidgetList == null || (string = allWidgetList.toString()) == null || (strM66629a = C27033g.m66629a(string)) == null) {
            lowerCase = "";
        } else {
            lowerCase = strM66629a.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase == null) {
                lowerCase = "";
            }
        }
        boolean zM30800r = m30800r();
        homeCardsRepositoryV2$loadCardConfig$2.L$0 = allWidgetList;
        homeCardsRepositoryV2$loadCardConfig$2.L$1 = SpillingKt.nullOutSpilledVariable(lowerCase);
        homeCardsRepositoryV2$loadCardConfig$2.label = 1;
        String str2 = lowerCase;
        Object objM30785f = m30785f(this, str2, zM30800r, 0, homeCardsRepositoryV2$loadCardConfig$2, 4, null);
        if (objM30785f != coroutine_suspended) {
            list = allWidgetList;
            obj = objM30785f;
            str = str2;
        }
        return coroutine_suspended;
        CardListRspV2 cardListRspV5 = (CardListRspV2) obj;
        if (cardListRspV5 != null) {
            if (cardListRspV5.getUserCustomWidgetList() != null) {
                cardListRspV5.getUserCustomVersion();
                if (cardListRspV5.getUserCustomVersion() >= 0) {
                    cardListRspV2 = cardListRspV5;
                } else {
                    cardListRspV2 = null;
                }
            } else {
                cardListRspV2 = null;
            }
            if (cardListRspV2 != null) {
                String str3 = str;
                HomeCardsRepositoryV2 homeCardsRepositoryV2 = f26494a;
                homeCardsRepositoryV2$loadCardConfig$2.L$0 = SpillingKt.nullOutSpilledVariable(list);
                homeCardsRepositoryV2$loadCardConfig$2.L$1 = SpillingKt.nullOutSpilledVariable(str3);
                homeCardsRepositoryV2$loadCardConfig$2.L$2 = cardListRspV2;
                homeCardsRepositoryV2$loadCardConfig$2.L$3 = SpillingKt.nullOutSpilledVariable(cardListRspV2);
                homeCardsRepositoryV2$loadCardConfig$2.I$0 = 0;
                homeCardsRepositoryV2$loadCardConfig$2.label = 2;
                if (m30786p(homeCardsRepositoryV2, cardListRspV2, list, false, homeCardsRepositoryV2$loadCardConfig$2, 4, null) != coroutine_suspended) {
                    cardListRspV3 = cardListRspV2;
                    if (cardListRspV3 != null) {
                        cardListRspV4 = cardListRspV3;
                    }
                }
                return coroutine_suspended;
            }
            f26495b = cardListRspV4 != null ? cardListRspV4.getFeedEnabled() : false;
            return cardListRspV4;
        }
        if (C36718c.m82250a()) {
            cardListRspV4 = f26497d;
        }
        f26495b = cardListRspV4 != null ? cardListRspV4.getFeedEnabled() : false;
        return cardListRspV4;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: n */
    public final Object m30797n(Continuation<? super Boolean> continuation) {
        HomeCardsRepositoryV2$refreshTokenForHome5000007$1 homeCardsRepositoryV2$refreshTokenForHome5000007$1;
        if (continuation instanceof HomeCardsRepositoryV2$refreshTokenForHome5000007$1) {
            homeCardsRepositoryV2$refreshTokenForHome5000007$1 = (HomeCardsRepositoryV2$refreshTokenForHome5000007$1) continuation;
            int i11 = homeCardsRepositoryV2$refreshTokenForHome5000007$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeCardsRepositoryV2$refreshTokenForHome5000007$1.label = i11 - Integer.MIN_VALUE;
            } else {
                homeCardsRepositoryV2$refreshTokenForHome5000007$1 = new HomeCardsRepositoryV2$refreshTokenForHome5000007$1(this, continuation);
            }
        } else {
            homeCardsRepositoryV2$refreshTokenForHome5000007$1 = new HomeCardsRepositoryV2$refreshTokenForHome5000007$1(this, continuation);
        }
        HomeCardsRepositoryV2$refreshTokenForHome5000007$1 homeCardsRepositoryV2$refreshTokenForHome5000007$2 = homeCardsRepositoryV2$refreshTokenForHome5000007$1;
        Object objM32894e0 = homeCardsRepositoryV2$refreshTokenForHome5000007$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = homeCardsRepositoryV2$refreshTokenForHome5000007$2.label;
        boolean z11 = false;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM32894e0);
                TokenLifecycleManager tokenLifecycleManager = TokenLifecycleManager.f28424a;
                homeCardsRepositoryV2$refreshTokenForHome5000007$2.label = 1;
                objM32894e0 = TokenLifecycleManager.m32894e0(tokenLifecycleManager, "v1/homepage/widget-info", null, ITokenLifecycleRefreshSPI.Companion.SOURCE_HOME_5000007, 0L, homeCardsRepositoryV2$refreshTokenForHome5000007$2, 10, null);
                if (objM32894e0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM32894e0);
            }
            String str = (String) objM32894e0;
            boolean z12 = (str == null || StringsKt.isBlank(str)) ? false : true;
            C44128b.m97266j("TokenLifecycle", "Home 5000007 refresh completed: success=" + z12);
            z11 = z12;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Exception e12) {
            C44128b.m97262f("TokenLifecycle", "Home 5000007 refresh failed with exception", e12);
        }
        return Boxing.boxBoolean(z11);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: q */
    public final Object m30799q(@NotNull List<CardListRspV2.UserCustomWidget> list, int i11, @NotNull Continuation<? super Boolean> continuation) {
        HomeCardsRepositoryV2$saveUserConfig$1 homeCardsRepositoryV2$saveUserConfig$1;
        if (continuation instanceof HomeCardsRepositoryV2$saveUserConfig$1) {
            homeCardsRepositoryV2$saveUserConfig$1 = (HomeCardsRepositoryV2$saveUserConfig$1) continuation;
            int i12 = homeCardsRepositoryV2$saveUserConfig$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                homeCardsRepositoryV2$saveUserConfig$1.label = i12 - Integer.MIN_VALUE;
            } else {
                homeCardsRepositoryV2$saveUserConfig$1 = new HomeCardsRepositoryV2$saveUserConfig$1(this, continuation);
            }
        } else {
            homeCardsRepositoryV2$saveUserConfig$1 = new HomeCardsRepositoryV2$saveUserConfig$1(this, continuation);
        }
        Object objM30802b = homeCardsRepositoryV2$saveUserConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = homeCardsRepositoryV2$saveUserConfig$1.label;
        try {
            if (i13 == 0) {
                ResultKt.throwOnFailure(objM30802b);
                InterfaceC14983a interfaceC14983a = (InterfaceC14983a) C42597a.m93388d().create(InterfaceC14983a.class);
                CardListReqV2 cardListReqV2 = new CardListReqV2(list, i11);
                homeCardsRepositoryV2$saveUserConfig$1.L$0 = SpillingKt.nullOutSpilledVariable(list);
                homeCardsRepositoryV2$saveUserConfig$1.I$0 = i11;
                homeCardsRepositoryV2$saveUserConfig$1.label = 1;
                objM30802b = interfaceC14983a.m30802b(cardListReqV2, homeCardsRepositoryV2$saveUserConfig$1);
                if (objM30802b == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM30802b);
            }
            return (Boolean) objM30802b;
        } catch (ApiException e11) {
            C44128b.m97259c("WidgetException", "saveUserConfig error: " + e11.code + ' ' + e11.getMessage());
            if (Intrinsics.areEqual(e11.code, "5000006")) {
                return Boxing.boxBoolean(false);
            }
            return null;
        } catch (Exception e12) {
            C43846g.m96568c(new HomeException(e12, "WidgetException", false, null, 8, null), null, 2, null);
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m30800r() {
        return UserInfo.a.d() == UserInfo.LoginState.Login;
    }

    /* JADX INFO: renamed from: c */
    public final void m30787c() {
        CardListRspV2 cardListRspV2M30792i = m30792i();
        if (cardListRspV2M30792i != null) {
            f26496c.m32258a(cardListRspV2M30792i);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final Object m30798o(@NotNull CardListRspV2 cardListRspV2, @Nullable List<CardListRspV2.AppWidgetConfigVO> list, boolean z11, @NotNull Continuation<? super Unit> continuation) {
        List<CardListRspV2.AppWidgetConfigVO> list2;
        Boolean allWidgetChange = cardListRspV2.getAllWidgetChange();
        String allWidgetMD5 = cardListRspV2.getAllWidgetMD5();
        int userCustomVersion = cardListRspV2.getUserCustomVersion();
        List<CardListRspV2.UserCustomWidget> userCustomWidgetList = cardListRspV2.getUserCustomWidgetList();
        List<CardListRspV2.AppWidgetConfigVO> allWidgetList = cardListRspV2.getAllWidgetList();
        if (allWidgetList == null) {
            if (list == null) {
                return Unit.INSTANCE;
            }
            list2 = list;
        } else {
            list2 = allWidgetList;
        }
        CardListRspV2 cardListRspV3 = new CardListRspV2(allWidgetMD5, allWidgetChange, userCustomVersion, 0, list2, userCustomWidgetList, cardListRspV2.getFeedEnabled(), 8, null);
        f26497d = cardListRspV3;
        C46392a.m102333p(C44510a.f98560a.m98476b(), C27099x.m66919i(cardListRspV3, false, 2, null));
        if (z11) {
            C36718c.m82251b();
        }
        return Unit.INSTANCE;
    }
}
