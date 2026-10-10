.class public final Lcom/kubi/home/v2/card/CardsViewModelV2;
.super Landroidx/lifecycle/ViewModel;
.source "CardsViewModelV2.kt"

# interfaces
.implements Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/home/v2/card/CardsViewModelV2$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008\u0000\u0018\u0000 d2\u00020\u00012\u00020\u0002:\u0001dB\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u00120\u0014J\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00170\u00160\u0014J\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0014J\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0011J\u0010\u0010%\u001a\u00020\u000b2\u0008\u0008\u0002\u0010&\u001a\u00020\u0006J\u0008\u0010\'\u001a\u00020\u000bH\u0002J\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020\u000bH\u0082@\u00a2\u0006\u0002\u0010+J\u000e\u0010,\u001a\u00020\u000bH\u0082@\u00a2\u0006\u0002\u0010+J\u000e\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020/J\u0008\u00100\u001a\u00020\u000bH\u0016J\u0008\u00101\u001a\u00020\u000bH\u0016J\u0008\u00102\u001a\u00020\u000bH\u0016J\u0008\u00103\u001a\u00020\u000bH\u0016J\u0010\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000fH\u0016J\u0018\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u000fH\u0002J\u0008\u00109\u001a\u00020\u000bH\u0016J\u0010\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020<H\u0016J\u0006\u0010=\u001a\u00020\u000bJ\u0010\u0010>\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000fH\u0002J\u000e\u0010?\u001a\u00020\u000bH\u0082@\u00a2\u0006\u0002\u0010+J\u0008\u0010@\u001a\u00020\u000bH\u0002J\u0016\u0010A\u001a\u00020\u000b2\u000c\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0012H\u0002J\u0016\u0010C\u001a\u00020\u000b2\u000c\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0012H\u0002J\u0016\u0010E\u001a\u00020\u000b2\u000c\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0012H\u0002J\u0006\u0010F\u001a\u00020\u0006J\u0006\u0010G\u001a\u00020\u000bJ\u0010\u0010Q\u001a\u00020\u000b2\u0008\u0010R\u001a\u0004\u0018\u00010SR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u000c\u0010\u0004R\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00170\u00160\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u001e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\"\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0012\u0010H\u001a\u0004\u0018\u00010<X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010IR\u000e\u0010J\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010L\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008O\u0010P\u001a\u0004\u0008M\u0010NR\u001b\u0010T\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008W\u0010P\u001a\u0004\u0008U\u0010VR\u001b\u0010X\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008Z\u0010P\u001a\u0004\u0008Y\u0010VR\u001b\u0010[\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008]\u0010P\u001a\u0004\u0008\\\u0010VR\u001b\u0010^\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008`\u0010P\u001a\u0004\u0008_\u0010VR\u001b\u0010a\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008c\u0010P\u001a\u0004\u0008b\u0010V\u00a8\u0006e"
    }
    d2 = {
        "Lcom/kubi/home/v2/card/CardsViewModelV2;",
        "Landroidx/lifecycle/ViewModel;",
        "Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$WidgetActionHandler;",
        "<init>",
        "()V",
        "isInEdit",
        "",
        "firstReq",
        "isChanged",
        "shimmerFlow",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "",
        "getShimmerFlow$annotations",
        "touchHelper",
        "Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;",
        "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;",
        "cardsLiveData",
        "Landroidx/lifecycle/MutableLiveData;",
        "",
        "getCardsLiveData",
        "Landroidx/lifecycle/LiveData;",
        "_homeFeedTitles",
        "",
        "Lcom/kubi/home/config/HomeFeedTab;",
        "getHomeFeedTabTitlesLiveData",
        "cardRegisLiveData",
        "getCardRegisLiveData",
        "dragLiveData",
        "getDragLiveData",
        "builder",
        "Lcom/kubi/home/v2/container/ui/GridAdapter$Builder;",
        "getBuilder",
        "()Lcom/kubi/home/v2/container/ui/GridAdapter$Builder;",
        "adapter",
        "Lcom/kubi/home/v2/container/ui/GridAdapter;",
        "getAdapter",
        "()Lcom/kubi/home/v2/container/ui/GridAdapter;",
        "loadCards",
        "loginStateChange",
        "setLiveDataCacheData",
        "pullRefresh",
        "Lkotlinx/coroutines/Job;",
        "checkBizControl",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadCardsDetails",
        "setupRecyclerView",
        "recyclerView",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "onEnterDragMode",
        "onExitDragMode",
        "onEnterEditMode",
        "onExitEditMode",
        "showCardDetail",
        "cardData",
        "changeCard",
        "oldData",
        "newData",
        "showAddList",
        "removeCard",
        "position",
        "",
        "removeTradingRobotCard",
        "addCard",
        "saveUserChanges",
        "updateUI",
        "appendFooterCard",
        "list",
        "appendSearchCard",
        "cardList",
        "appendFeedCard",
        "onBackPressed",
        "onLoginStateChange",
        "beforeShowLevel",
        "Ljava/lang/Integer;",
        "isNeedShowVipDilogChecking",
        "isVipDialogShow",
        "homeVipDialogEnable",
        "getHomeVipDialogEnable",
        "()Z",
        "homeVipDialogEnable$delegate",
        "Lkotlin/Lazy;",
        "checkShowVipLevelUpDialog",
        "activity",
        "Landroidx/fragment/app/FragmentActivity;",
        "emptyCardData",
        "getEmptyCardData",
        "()Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;",
        "emptyCardData$delegate",
        "searchCardData",
        "getSearchCardData",
        "searchCardData$delegate",
        "feedCardData",
        "getFeedCardData",
        "feedCardData$delegate",
        "bottomGapData",
        "getBottomGapData",
        "bottomGapData$delegate",
        "footerCardData",
        "getFooterCardData",
        "footerCardData$delegate",
        "Companion",
        "HomeLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCardsViewModelV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardsViewModelV2.kt\ncom/kubi/home/v2/card/CardsViewModelV2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 CollectionsEx.kt\ncom/kubi/utils/extensions/CollectionsExKt\n+ 6 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 7 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,651:1\n1#2:652\n126#3,2:653\n360#4,7:655\n360#4,7:662\n111#5:669\n99#5:670\n35#6,4:671\n39#6:677\n35#6,4:678\n39#6:684\n44#7,2:675\n44#7,2:682\n*S KotlinDebug\n*F\n+ 1 CardsViewModelV2.kt\ncom/kubi/home/v2/card/CardsViewModelV2\n*L\n327#1:653,2\n379#1:655,7\n410#1:662,7\n517#1:669\n517#1:670\n525#1:671,4\n525#1:677\n558#1:678,4\n558#1:684\n525#1:675,2\n558#1:682,2\n*E\n"
    }
.end annotation


# static fields
.field public static final p0:Lcom/kubi/home/v2/card/CardsViewModelV2$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public volatile V:Z

.field public volatile W:Z

.field public volatile X:Z

.field public final Y:Lkotlinx/coroutines/flow/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/m<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public Z:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/kubi/home/v2/container/ui/GridItemTouchHelper<",
            "Lcom/kubi/kucoin/home/v2/cards/a;",
            ">;"
        }
    .end annotation
.end field

.field public final a0:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/util/List<",
            "Lcom/kubi/kucoin/home/v2/cards/a;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b0:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/util/List<",
            "Lcom/kubi/home/config/HomeFeedTab;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c0:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/kubi/kucoin/home/v2/cards/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d0:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e0:Lqj/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqj/a$a<",
            "Lcom/kubi/kucoin/home/v2/cards/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f0:Lqj/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqj/a<",
            "Lcom/kubi/kucoin/home/v2/cards/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public volatile g0:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public h0:Z

.field public i0:Z

.field public final j0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final l0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final m0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final n0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final o0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/home/v2/card/CardsViewModelV2$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/home/v2/card/CardsViewModelV2$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/home/v2/card/CardsViewModelV2;->p0:Lcom/kubi/home/v2/card/CardsViewModelV2$Companion;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->W:Z

    .line 7
    .line 8
    sget-object v1, Lkotlinx/coroutines/channels/BufferOverflow;->DROP_OLDEST:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static {v2, v0, v1, v0, v3}, Lkotlinx/coroutines/flow/s;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/m;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    const-wide/16 v1, 0x3e8

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1, v2}, Lkotlinx/coroutines/flow/g;->t(Lkotlinx/coroutines/flow/e;J)Lkotlinx/coroutines/flow/e;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    new-instance v2, Lcom/kubi/home/v2/card/CardsViewModelV2$shimmerFlow$1$1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v2, p0, v3}, Lcom/kubi/home/v2/card/CardsViewModelV2$shimmerFlow$1$1;-><init>(Lcom/kubi/home/v2/card/CardsViewModelV2;Lkotlin/coroutines/Continuation;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v2}, Lkotlinx/coroutines/flow/g;->T(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v2}, Lkotlinx/coroutines/flow/g;->O(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;)Lkotlinx/coroutines/x1;

    .line 37
    .line 38
    iput-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->Y:Lkotlinx/coroutines/flow/m;

    .line 39
    .line 40
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 41
    .line 42
    .line 43
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 44
    .line 45
    iput-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->a0:Landroidx/lifecycle/MutableLiveData;

    .line 46
    .line 47
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 48
    .line 49
    .line 50
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 51
    .line 52
    iput-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->b0:Landroidx/lifecycle/MutableLiveData;

    .line 53
    .line 54
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 55
    .line 56
    .line 57
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 58
    .line 59
    iput-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->c0:Landroidx/lifecycle/MutableLiveData;

    .line 60
    .line 61
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 62
    .line 63
    .line 64
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 65
    .line 66
    iput-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->d0:Landroidx/lifecycle/MutableLiveData;

    .line 67
    .line 68
    new-instance v0, Lqj/a$a;

    .line 69
    .line 70
    .line 71
    invoke-direct {v0}, Lqj/a$a;-><init>()V

    .line 72
    .line 73
    new-instance v1, Lcom/kubi/home/v2/card/CardsViewModelV2$c;

    .line 74
    .line 75
    .line 76
    invoke-direct {v1}, Lcom/kubi/home/v2/card/CardsViewModelV2$c;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Lqj/a$a;->d(Lcom/kubi/sdk/i2;)Lqj/a$a;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    new-instance v1, Lcom/kubi/home/v2/card/CardsViewModelV2$d;

    .line 83
    .line 84
    .line 85
    invoke-direct {v1, p0}, Lcom/kubi/home/v2/card/CardsViewModelV2$d;-><init>(Lcom/kubi/home/v2/card/CardsViewModelV2;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v1}, Lqj/a$a;->e(Lcom/kubi/sdk/u2;)Lqj/a$a;

    .line 89
    move-result-object v0

    .line 90
    .line 91
    iput-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->e0:Lqj/a$a;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Lqj/a$a;->a()Lqj/a;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    new-instance v1, Lcom/kubi/home/v2/card/CardsViewModelV2$a;

    .line 98
    .line 99
    .line 100
    invoke-direct {v1, p0}, Lcom/kubi/home/v2/card/CardsViewModelV2$a;-><init>(Lcom/kubi/home/v2/card/CardsViewModelV2;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;)V

    .line 104
    .line 105
    iput-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->f0:Lqj/a;

    .line 106
    .line 107
    new-instance v0, Lcom/kubi/home/v2/card/c;

    .line 108
    .line 109
    .line 110
    invoke-direct {v0}, Lcom/kubi/home/v2/card/c;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 114
    move-result-object v0

    .line 115
    .line 116
    iput-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->j0:Lkotlin/Lazy;

    .line 117
    .line 118
    new-instance v0, Lcom/kubi/home/v2/card/d;

    .line 119
    .line 120
    .line 121
    invoke-direct {v0, p0}, Lcom/kubi/home/v2/card/d;-><init>(Lcom/kubi/home/v2/card/CardsViewModelV2;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 125
    move-result-object v0

    .line 126
    .line 127
    iput-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->k0:Lkotlin/Lazy;

    .line 128
    .line 129
    new-instance v0, Lcom/kubi/home/v2/card/e;

    .line 130
    .line 131
    .line 132
    invoke-direct {v0, p0}, Lcom/kubi/home/v2/card/e;-><init>(Lcom/kubi/home/v2/card/CardsViewModelV2;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 136
    move-result-object v0

    .line 137
    .line 138
    iput-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->l0:Lkotlin/Lazy;

    .line 139
    .line 140
    new-instance v0, Lcom/kubi/home/v2/card/f;

    .line 141
    .line 142
    .line 143
    invoke-direct {v0, p0}, Lcom/kubi/home/v2/card/f;-><init>(Lcom/kubi/home/v2/card/CardsViewModelV2;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 147
    move-result-object v0

    .line 148
    .line 149
    iput-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->m0:Lkotlin/Lazy;

    .line 150
    .line 151
    new-instance v0, Lcom/kubi/home/v2/card/g;

    .line 152
    .line 153
    .line 154
    invoke-direct {v0, p0}, Lcom/kubi/home/v2/card/g;-><init>(Lcom/kubi/home/v2/card/CardsViewModelV2;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 158
    move-result-object v0

    .line 159
    .line 160
    iput-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->n0:Lkotlin/Lazy;

    .line 161
    .line 162
    new-instance v0, Lcom/kubi/home/v2/card/h;

    .line 163
    .line 164
    .line 165
    invoke-direct {v0, p0}, Lcom/kubi/home/v2/card/h;-><init>(Lcom/kubi/home/v2/card/CardsViewModelV2;)V

    .line 166
    .line 167
    .line 168
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 169
    move-result-object v0

    .line 170
    .line 171
    iput-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->o0:Lkotlin/Lazy;

    .line 172
    return-void
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
.end method

.method public static final synthetic A(Lcom/kubi/home/v2/card/CardsViewModelV2;)Lkotlinx/coroutines/flow/m;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->Y:Lkotlinx/coroutines/flow/m;

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method private final A0()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/home/v2/card/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/kubi/home/v2/card/a;-><init>(Lcom/kubi/home/v2/card/CardsViewModelV2;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/kubi/utils/x0;->d(Lkotlin/jvm/functions/Function0;)V

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static final synthetic B(Lcom/kubi/home/v2/card/CardsViewModelV2;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->b0:Landroidx/lifecycle/MutableLiveData;

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static final B0(Lcom/kubi/home/v2/card/CardsViewModelV2;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;->a:Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;->k()Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->P(Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->N(Ljava/util/List;)V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    move-result v1

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-object p0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->a0:Landroidx/lifecycle/MutableLiveData;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 41
    goto :goto_0

    .line 42
    .line 43
    :cond_1
    iget-object p0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->a0:Landroidx/lifecycle/MutableLiveData;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 47
    .line 48
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 49
    return-object p0
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
.end method

.method public static final synthetic C(Lcom/kubi/home/v2/card/CardsViewModelV2;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->X:Z

    .line 3
    return p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static final synthetic D(Lcom/kubi/home/v2/card/CardsViewModelV2;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->V:Z

    .line 3
    return p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static final D0(Lcom/kubi/home/v2/card/CardsViewModelV2;Lcom/kubi/kucoin/home/v2/cards/a;Lcom/kubi/kucoin/home/v2/cards/a;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    const-string v0, "oldData"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "newData"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    const-string v1, "[setupRecyclerView] quick change: "

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/kubi/kucoin/home/v2/cards/a;->j()Lcom/kubi/kucoin/home/v2/cards/e;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v1, " -> "

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Lcom/kubi/kucoin/home/v2/cards/a;->j()Lcom/kubi/kucoin/home/v2/cards/e;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    const-string v1, "CardsViewModelV2"

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v0}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1, p2}, Lcom/kubi/home/v2/card/CardsViewModelV2;->R(Lcom/kubi/kucoin/home/v2/cards/a;Lcom/kubi/kucoin/home/v2/cards/a;)V

    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 54
    return-object p0
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
.end method

.method public static final synthetic E(Lcom/kubi/home/v2/card/CardsViewModelV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/home/v2/card/CardsViewModelV2;->n0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public static final E0(Lcom/kubi/home/v2/card/CardsViewModelV2;Lcom/kubi/kucoin/home/v2/cards/a;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/kubi/home/v2/card/CardsViewModelV2;->M(Lcom/kubi/kucoin/home/v2/cards/a;)V

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public static final synthetic F(Lcom/kubi/home/v2/card/CardsViewModelV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/home/v2/card/CardsViewModelV2;->y0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public static final F0(Lcom/kubi/kucoin/home/v2/cards/a;Lcom/kubi/home/v2/card/CardsViewModelV2;Lcom/kubi/kucoin/home/v2/cards/a;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/kucoin/home/v2/cards/a;->j()Lcom/kubi/kucoin/home/v2/cards/e;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Lcom/kubi/kucoin/home/v2/cards/a;->j()Lcom/kubi/kucoin/home/v2/cards/e;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p0, p2}, Lcom/kubi/home/v2/card/CardsViewModelV2;->R(Lcom/kubi/kucoin/home/v2/cards/a;Lcom/kubi/kucoin/home/v2/cards/a;)V

    .line 23
    .line 24
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 25
    return-object p0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
.end method

.method public static final synthetic G(Lcom/kubi/home/v2/card/CardsViewModelV2;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->g0:Ljava/lang/Integer;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public static final synthetic H(Lcom/kubi/home/v2/card/CardsViewModelV2;Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->X:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public static final synthetic I(Lcom/kubi/home/v2/card/CardsViewModelV2;Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->W:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public static final synthetic J(Lcom/kubi/home/v2/card/CardsViewModelV2;Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->h0:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public static final synthetic K(Lcom/kubi/home/v2/card/CardsViewModelV2;Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->i0:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public static final synthetic L(Lcom/kubi/home/v2/card/CardsViewModelV2;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->G0()V

    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static final Q(Lcom/kubi/home/v2/card/CardsViewModelV2;)Lcom/kubi/kucoin/home/v2/cards/a;
    .locals 12

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/kucoin/home/v2/cards/a;

    .line 3
    .line 4
    new-instance v2, Lcom/kubi/kucoin/home/v2/cards/e;

    .line 5
    .line 6
    sget-object v1, Lcom/kubi/home/v2/s0;->a:Lcom/kubi/home/v2/s0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/kubi/home/v2/s0;->Q()Lcom/kubi/kucoin/home/v2/cards/f;

    .line 10
    move-result-object v1

    .line 11
    const/4 v3, 0x0

    .line 12
    .line 13
    const-string v4, "style_1"

    .line 14
    .line 15
    .line 16
    invoke-direct {v2, v4, v1, v3}, Lcom/kubi/kucoin/home/v2/cards/e;-><init>(Ljava/lang/String;Lcom/kubi/kucoin/home/v2/cards/f;I)V

    .line 17
    .line 18
    const/16 v10, 0x1dc

    .line 19
    const/4 v11, 0x0

    .line 20
    .line 21
    const-string v1, "bottomGap"

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x0

    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v9, 0x0

    .line 29
    .line 30
    .line 31
    invoke-direct/range {v0 .. v11}, Lcom/kubi/kucoin/home/v2/cards/a;-><init>(Ljava/lang/String;Lcom/kubi/kucoin/home/v2/cards/e;Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 32
    .line 33
    iget-object v1, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->e0:Lqj/a$a;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/kubi/kucoin/home/v2/cards/a;->h()I

    .line 37
    move-result v2

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/kubi/kucoin/home/v2/cards/a;->j()Lcom/kubi/kucoin/home/v2/cards/e;

    .line 41
    move-result-object p0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/kubi/kucoin/home/v2/cards/e;->b()Lcom/kubi/kucoin/home/v2/cards/f;

    .line 45
    move-result-object p0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/kubi/kucoin/home/v2/cards/f;->a()Ljava/lang/Class;

    .line 49
    move-result-object v3

    .line 50
    .line 51
    const/16 v6, 0xc

    .line 52
    const/4 v7, 0x0

    .line 53
    .line 54
    .line 55
    invoke-static/range {v1 .. v7}, Lqj/a$a;->c(Lqj/a$a;ILjava/lang/Class;Lcom/kubi/sdk/s2;Lcom/kubi/sdk/s2;ILjava/lang/Object;)Lqj/a$a;

    .line 56
    return-object v0
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
.end method

.method private final S(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/home/v2/card/CardsViewModelV2$checkBizControl$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/home/v2/card/CardsViewModelV2$checkBizControl$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/home/v2/card/CardsViewModelV2$checkBizControl$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/kubi/home/v2/card/CardsViewModelV2$checkBizControl$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/home/v2/card/CardsViewModelV2$checkBizControl$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/kubi/home/v2/card/CardsViewModelV2$checkBizControl$1;-><init>(Lcom/kubi/home/v2/card/CardsViewModelV2;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/kubi/home/v2/card/CardsViewModelV2$checkBizControl$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/home/v2/card/CardsViewModelV2$checkBizControl$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object v1, v0, Lcom/kubi/home/v2/card/CardsViewModelV2$checkBizControl$1;->L$1:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Lcom/kubi/home/v2/card/CardsViewModelV2$e;

    .line 42
    .line 43
    iget-object v0, v0, Lcom/kubi/home/v2/card/CardsViewModelV2$checkBizControl$1;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lkotlinx/coroutines/w;

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    goto :goto_1

    .line 50
    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    .line 56
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    throw p1

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    .line 62
    sget-object p1, Lgz/b;->a:Lgz/b;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lgz/b;->g()Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;

    .line 66
    move-result-object v2

    .line 67
    .line 68
    sget-object v4, Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;->SUCCESS:Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;

    .line 69
    .line 70
    if-ne v2, v4, :cond_3

    .line 71
    .line 72
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 73
    return-object p1

    .line 74
    :cond_3
    const/4 v2, 0x0

    .line 75
    .line 76
    .line 77
    invoke-static {v2, v3, v2}, Lkotlinx/coroutines/y;->c(Lkotlinx/coroutines/x1;ILjava/lang/Object;)Lkotlinx/coroutines/w;

    .line 78
    move-result-object v2

    .line 79
    .line 80
    new-instance v5, Lcom/kubi/home/v2/card/CardsViewModelV2$e;

    .line 81
    .line 82
    .line 83
    invoke-direct {v5, v2}, Lcom/kubi/home/v2/card/CardsViewModelV2$e;-><init>(Lkotlinx/coroutines/w;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v5}, Lgz/b;->a(Lgz/e;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Lgz/b;->g()Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;

    .line 90
    move-result-object p1

    .line 91
    .line 92
    if-eq p1, v4, :cond_5

    .line 93
    .line 94
    .line 95
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    move-result-object p1

    .line 97
    .line 98
    iput-object p1, v0, Lcom/kubi/home/v2/card/CardsViewModelV2$checkBizControl$1;->L$0:Ljava/lang/Object;

    .line 99
    .line 100
    iput-object v5, v0, Lcom/kubi/home/v2/card/CardsViewModelV2$checkBizControl$1;->L$1:Ljava/lang/Object;

    .line 101
    .line 102
    iput v3, v0, Lcom/kubi/home/v2/card/CardsViewModelV2$checkBizControl$1;->label:I

    .line 103
    .line 104
    .line 105
    invoke-interface {v2, v0}, Lkotlinx/coroutines/r0;->h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 106
    move-result-object p1

    .line 107
    .line 108
    if-ne p1, v1, :cond_4

    .line 109
    return-object v1

    .line 110
    :cond_4
    move-object v1, v5

    .line 111
    :goto_1
    move-object v5, v1

    .line 112
    .line 113
    :cond_5
    sget-object p1, Lgz/b;->a:Lgz/b;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v5}, Lgz/b;->k(Lgz/e;)V

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 119
    return-object p1
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
.end method

.method public static final U(Lcom/kubi/home/v2/card/CardsViewModelV2;)Lcom/kubi/kucoin/home/v2/cards/a;
    .locals 12

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/kucoin/home/v2/cards/a;

    .line 3
    .line 4
    new-instance v2, Lcom/kubi/kucoin/home/v2/cards/e;

    .line 5
    .line 6
    sget-object v1, Lcom/kubi/home/v2/s0;->a:Lcom/kubi/home/v2/s0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/kubi/home/v2/s0;->X()Lcom/kubi/kucoin/home/v2/cards/f;

    .line 10
    move-result-object v1

    .line 11
    const/4 v3, 0x0

    .line 12
    .line 13
    const-string v4, "style_1"

    .line 14
    .line 15
    .line 16
    invoke-direct {v2, v4, v1, v3}, Lcom/kubi/kucoin/home/v2/cards/e;-><init>(Ljava/lang/String;Lcom/kubi/kucoin/home/v2/cards/f;I)V

    .line 17
    .line 18
    const/16 v10, 0x1dc

    .line 19
    const/4 v11, 0x0

    .line 20
    .line 21
    const-string v1, "empty"

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x0

    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v9, 0x0

    .line 29
    .line 30
    .line 31
    invoke-direct/range {v0 .. v11}, Lcom/kubi/kucoin/home/v2/cards/a;-><init>(Ljava/lang/String;Lcom/kubi/kucoin/home/v2/cards/e;Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 32
    .line 33
    iget-object v1, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->e0:Lqj/a$a;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/kubi/kucoin/home/v2/cards/a;->h()I

    .line 37
    move-result v2

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/kubi/kucoin/home/v2/cards/a;->j()Lcom/kubi/kucoin/home/v2/cards/e;

    .line 41
    move-result-object p0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/kubi/kucoin/home/v2/cards/e;->b()Lcom/kubi/kucoin/home/v2/cards/f;

    .line 45
    move-result-object p0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/kubi/kucoin/home/v2/cards/f;->a()Ljava/lang/Class;

    .line 49
    move-result-object v3

    .line 50
    .line 51
    const/16 v6, 0xc

    .line 52
    const/4 v7, 0x0

    .line 53
    .line 54
    .line 55
    invoke-static/range {v1 .. v7}, Lqj/a$a;->c(Lqj/a$a;ILjava/lang/Class;Lcom/kubi/sdk/s2;Lcom/kubi/sdk/s2;ILjava/lang/Object;)Lqj/a$a;

    .line 56
    return-object v0
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
.end method

.method public static final V(Lcom/kubi/home/v2/card/CardsViewModelV2;)Lcom/kubi/kucoin/home/v2/cards/a;
    .locals 12

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/kucoin/home/v2/cards/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/home/api/HomeWidgetCode;->HomeFeed:Lcom/kubi/home/api/HomeWidgetCode;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/kubi/home/api/HomeWidgetCode;->getCode()Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    new-instance v2, Lcom/kubi/kucoin/home/v2/cards/e;

    .line 11
    .line 12
    sget-object v3, Lcom/kubi/home/v2/s0;->a:Lcom/kubi/home/v2/s0;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3}, Lcom/kubi/home/v2/s0;->c0()Lcom/kubi/kucoin/home/v2/cards/f;

    .line 16
    move-result-object v3

    .line 17
    const/4 v4, 0x0

    .line 18
    .line 19
    const-string v5, "style_1"

    .line 20
    .line 21
    .line 22
    invoke-direct {v2, v5, v3, v4}, Lcom/kubi/kucoin/home/v2/cards/e;-><init>(Ljava/lang/String;Lcom/kubi/kucoin/home/v2/cards/f;I)V

    .line 23
    .line 24
    const/16 v10, 0x1dc

    .line 25
    const/4 v11, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v9, 0x0

    .line 33
    .line 34
    .line 35
    invoke-direct/range {v0 .. v11}, Lcom/kubi/kucoin/home/v2/cards/a;-><init>(Ljava/lang/String;Lcom/kubi/kucoin/home/v2/cards/e;Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 36
    .line 37
    iget-object v1, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->e0:Lqj/a$a;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/kubi/kucoin/home/v2/cards/a;->h()I

    .line 41
    move-result v2

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/kubi/kucoin/home/v2/cards/a;->j()Lcom/kubi/kucoin/home/v2/cards/e;

    .line 45
    move-result-object p0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/kubi/kucoin/home/v2/cards/e;->b()Lcom/kubi/kucoin/home/v2/cards/f;

    .line 49
    move-result-object p0

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/kubi/kucoin/home/v2/cards/f;->a()Ljava/lang/Class;

    .line 53
    move-result-object v3

    .line 54
    .line 55
    const/16 v6, 0xc

    .line 56
    const/4 v7, 0x0

    .line 57
    .line 58
    .line 59
    invoke-static/range {v1 .. v7}, Lqj/a$a;->c(Lqj/a$a;ILjava/lang/Class;Lcom/kubi/sdk/s2;Lcom/kubi/sdk/s2;ILjava/lang/Object;)Lqj/a$a;

    .line 60
    return-object v0
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
.end method

.method public static final W(Lcom/kubi/home/v2/card/CardsViewModelV2;)Lcom/kubi/kucoin/home/v2/cards/a;
    .locals 12

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/kucoin/home/v2/cards/a;

    .line 3
    .line 4
    new-instance v2, Lcom/kubi/kucoin/home/v2/cards/e;

    .line 5
    .line 6
    sget-object v1, Lcom/kubi/home/v2/s0;->a:Lcom/kubi/home/v2/s0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/kubi/home/v2/s0;->a0()Lcom/kubi/kucoin/home/v2/cards/f;

    .line 10
    move-result-object v1

    .line 11
    const/4 v3, 0x0

    .line 12
    .line 13
    const-string v4, "style_1"

    .line 14
    .line 15
    .line 16
    invoke-direct {v2, v4, v1, v3}, Lcom/kubi/kucoin/home/v2/cards/e;-><init>(Ljava/lang/String;Lcom/kubi/kucoin/home/v2/cards/f;I)V

    .line 17
    .line 18
    const/16 v10, 0x1dc

    .line 19
    const/4 v11, 0x0

    .line 20
    .line 21
    const-string v1, "footer"

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x0

    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v9, 0x0

    .line 29
    .line 30
    .line 31
    invoke-direct/range {v0 .. v11}, Lcom/kubi/kucoin/home/v2/cards/a;-><init>(Ljava/lang/String;Lcom/kubi/kucoin/home/v2/cards/e;Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 32
    .line 33
    iget-object v1, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->e0:Lqj/a$a;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/kubi/kucoin/home/v2/cards/a;->h()I

    .line 37
    move-result v2

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/kubi/kucoin/home/v2/cards/a;->j()Lcom/kubi/kucoin/home/v2/cards/e;

    .line 41
    move-result-object p0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/kubi/kucoin/home/v2/cards/e;->b()Lcom/kubi/kucoin/home/v2/cards/f;

    .line 45
    move-result-object p0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/kubi/kucoin/home/v2/cards/f;->a()Ljava/lang/Class;

    .line 49
    move-result-object v3

    .line 50
    .line 51
    const/16 v6, 0xc

    .line 52
    const/4 v7, 0x0

    .line 53
    .line 54
    .line 55
    invoke-static/range {v1 .. v7}, Lqj/a$a;->c(Lqj/a$a;ILjava/lang/Class;Lcom/kubi/sdk/s2;Lcom/kubi/sdk/s2;ILjava/lang/Object;)Lqj/a$a;

    .line 56
    return-object v0
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
.end method

.method public static synthetic b(Lcom/kubi/home/v2/card/CardsViewModelV2;)Lcom/kubi/kucoin/home/v2/cards/a;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->V(Lcom/kubi/home/v2/card/CardsViewModelV2;)Lcom/kubi/kucoin/home/v2/cards/a;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static synthetic d(Lcom/kubi/home/v2/card/CardsViewModelV2;)Lcom/kubi/kucoin/home/v2/cards/a;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->W(Lcom/kubi/home/v2/card/CardsViewModelV2;)Lcom/kubi/kucoin/home/v2/cards/a;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static synthetic e(Lcom/kubi/home/v2/card/CardsViewModelV2;)Lcom/kubi/kucoin/home/v2/cards/a;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->Q(Lcom/kubi/home/v2/card/CardsViewModelV2;)Lcom/kubi/kucoin/home/v2/cards/a;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static final j0()Z
    .locals 8

    .line 1
    .line 2
    const-string v0, "home_vip_dialog"

    .line 3
    .line 4
    :try_start_0
    sget-object v1, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/home/v2/card/CardsViewModelV2$f;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lcom/kubi/home/v2/card/CardsViewModelV2$f;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    const-string v2, "object : TypeToken<T>() {}.type"

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 22
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    move-object v2, v0

    .line 26
    .line 27
    new-instance v1, Lcom/kubi/config/exception/KCConfigException;

    .line 28
    .line 29
    const/16 v6, 0x8

    .line 30
    const/4 v7, 0x0

    .line 31
    .line 32
    const-string v3, "RemoteConfig"

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v1 .. v7}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    const/4 v0, 0x2

    .line 39
    const/4 v2, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 43
    move-object v0, v2

    .line 44
    .line 45
    :goto_0
    check-cast v0, Ljava/lang/Boolean;

    .line 46
    const/4 v1, 0x1

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 50
    move-result v0

    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Vip:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 58
    move-result v0

    .line 59
    .line 60
    if-eqz v0, :cond_0

    .line 61
    goto :goto_1

    .line 62
    :cond_0
    const/4 v1, 0x0

    .line 63
    :goto_1
    return v1
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
.end method

.method public static synthetic m0(Lcom/kubi/home/v2/card/CardsViewModelV2;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p2, p2, 0x1

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Lcom/kubi/home/v2/card/CardsViewModelV2;->l0(Z)V

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
.end method

.method public static synthetic n()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/home/v2/card/CardsViewModelV2;->j0()Z

    .line 4
    move-result v0

    .line 5
    return v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static synthetic o(Lcom/kubi/home/v2/card/CardsViewModelV2;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->B0(Lcom/kubi/home/v2/card/CardsViewModelV2;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static synthetic p(Lcom/kubi/kucoin/home/v2/cards/a;Lcom/kubi/home/v2/card/CardsViewModelV2;Lcom/kubi/kucoin/home/v2/cards/a;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/home/v2/card/CardsViewModelV2;->F0(Lcom/kubi/kucoin/home/v2/cards/a;Lcom/kubi/home/v2/card/CardsViewModelV2;Lcom/kubi/kucoin/home/v2/cards/a;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
.end method

.method public static synthetic q(Lcom/kubi/home/v2/card/CardsViewModelV2;Lcom/kubi/kucoin/home/v2/cards/a;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/home/v2/card/CardsViewModelV2;->E0(Lcom/kubi/home/v2/card/CardsViewModelV2;Lcom/kubi/kucoin/home/v2/cards/a;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public static synthetic r(Lcom/kubi/home/v2/card/CardsViewModelV2;)Lcom/kubi/kucoin/home/v2/cards/a;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->U(Lcom/kubi/home/v2/card/CardsViewModelV2;)Lcom/kubi/kucoin/home/v2/cards/a;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static synthetic s(Lcom/kubi/home/v2/card/CardsViewModelV2;)Lcom/kubi/kucoin/home/v2/cards/a;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->z0(Lcom/kubi/home/v2/card/CardsViewModelV2;)Lcom/kubi/kucoin/home/v2/cards/a;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static synthetic t(Lcom/kubi/home/v2/card/CardsViewModelV2;Lcom/kubi/kucoin/home/v2/cards/a;Lcom/kubi/kucoin/home/v2/cards/a;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/home/v2/card/CardsViewModelV2;->D0(Lcom/kubi/home/v2/card/CardsViewModelV2;Lcom/kubi/kucoin/home/v2/cards/a;Lcom/kubi/kucoin/home/v2/cards/a;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
.end method

.method public static final synthetic u(Lcom/kubi/home/v2/card/CardsViewModelV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kubi/home/v2/card/CardsViewModelV2;->S(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public static final synthetic v(Lcom/kubi/home/v2/card/CardsViewModelV2;)Ljava/lang/Integer;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->g0:Ljava/lang/Integer;

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static final synthetic w(Lcom/kubi/home/v2/card/CardsViewModelV2;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->c0:Landroidx/lifecycle/MutableLiveData;

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static final synthetic x(Lcom/kubi/home/v2/card/CardsViewModelV2;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->a0:Landroidx/lifecycle/MutableLiveData;

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static final synthetic y(Lcom/kubi/home/v2/card/CardsViewModelV2;)Lcom/kubi/kucoin/home/v2/cards/a;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->d0()Lcom/kubi/kucoin/home/v2/cards/a;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static final synthetic z(Lcom/kubi/home/v2/card/CardsViewModelV2;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->W:Z

    .line 3
    return p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static final z0(Lcom/kubi/home/v2/card/CardsViewModelV2;)Lcom/kubi/kucoin/home/v2/cards/a;
    .locals 12

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/kucoin/home/v2/cards/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/home/api/HomeWidgetCode;->Search:Lcom/kubi/home/api/HomeWidgetCode;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/kubi/home/api/HomeWidgetCode;->getCode()Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    new-instance v2, Lcom/kubi/kucoin/home/v2/cards/e;

    .line 11
    .line 12
    sget-object v3, Lcom/kubi/home/v2/s0;->a:Lcom/kubi/home/v2/s0;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3}, Lcom/kubi/home/v2/s0;->m0()Lcom/kubi/kucoin/home/v2/cards/f;

    .line 16
    move-result-object v3

    .line 17
    const/4 v4, 0x1

    .line 18
    .line 19
    const-string v5, "style_1"

    .line 20
    .line 21
    .line 22
    invoke-direct {v2, v5, v3, v4}, Lcom/kubi/kucoin/home/v2/cards/e;-><init>(Ljava/lang/String;Lcom/kubi/kucoin/home/v2/cards/f;I)V

    .line 23
    .line 24
    const/16 v10, 0x1dc

    .line 25
    const/4 v11, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v9, 0x0

    .line 33
    .line 34
    .line 35
    invoke-direct/range {v0 .. v11}, Lcom/kubi/kucoin/home/v2/cards/a;-><init>(Ljava/lang/String;Lcom/kubi/kucoin/home/v2/cards/e;Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 36
    .line 37
    iget-object v1, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->e0:Lqj/a$a;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/kubi/kucoin/home/v2/cards/a;->h()I

    .line 41
    move-result v2

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/kubi/kucoin/home/v2/cards/a;->j()Lcom/kubi/kucoin/home/v2/cards/e;

    .line 45
    move-result-object p0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/kubi/kucoin/home/v2/cards/e;->b()Lcom/kubi/kucoin/home/v2/cards/f;

    .line 49
    move-result-object p0

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/kubi/kucoin/home/v2/cards/f;->a()Ljava/lang/Class;

    .line 53
    move-result-object v3

    .line 54
    .line 55
    const/16 v6, 0xc

    .line 56
    const/4 v7, 0x0

    .line 57
    .line 58
    .line 59
    invoke-static/range {v1 .. v7}, Lqj/a$a;->c(Lqj/a$a;ILjava/lang/Class;Lcom/kubi/sdk/s2;Lcom/kubi/sdk/s2;ILjava/lang/Object;)Lqj/a$a;

    .line 60
    return-object v0
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
.end method


# virtual methods
.method public final C0(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 4
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "recyclerView"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/kubi/home/v2/container/ui/CustomGridLayoutManager;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    const-string v2, "getContext(...)"

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    const/4 v2, 0x2

    .line 18
    .line 19
    iget-object v3, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->f0:Lqj/a;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1, v2, v3}, Lcom/kubi/home/v2/container/ui/CustomGridLayoutManager;-><init>(Landroid/content/Context;ILqj/a;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 26
    .line 27
    new-instance v0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->f0:Lqj/a;

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1, p0}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;-><init>(Lqj/a;Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$b;)V

    .line 33
    .line 34
    new-instance v1, Landroidx/recyclerview/widget/ItemTouchHelper;

    .line 35
    .line 36
    .line 37
    invoke-direct {v1, v0}, Landroidx/recyclerview/widget/ItemTouchHelper;-><init>(Landroidx/recyclerview/widget/ItemTouchHelper$Callback;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/ItemTouchHelper;->attachToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->F(Landroidx/recyclerview/widget/ItemTouchHelper;)V

    .line 44
    .line 45
    new-instance v1, Lcom/kubi/home/v2/card/i;

    .line 46
    .line 47
    .line 48
    invoke-direct {v1, p0}, Lcom/kubi/home/v2/card/i;-><init>(Lcom/kubi/home/v2/card/CardsViewModelV2;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->G(Lkotlin/jvm/functions/Function2;)V

    .line 52
    .line 53
    iput-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->Z:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;

    .line 54
    .line 55
    iget-object v1, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->f0:Lqj/a;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v0}, Lqj/a;->w(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;)V

    .line 59
    .line 60
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->f0:Lqj/a;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 64
    .line 65
    new-instance v0, Lcom/kubi/home/v2/card/CardsViewModelV2$g;

    .line 66
    .line 67
    .line 68
    invoke-direct {v0, p0}, Lcom/kubi/home/v2/card/CardsViewModelV2$g;-><init>(Lcom/kubi/home/v2/card/CardsViewModelV2;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnChildAttachStateChangeListener(Landroidx/recyclerview/widget/RecyclerView$OnChildAttachStateChangeListener;)V

    .line 72
    return-void
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
.end method

.method public final G0()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;->a:Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;->c()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;->k()Ljava/util/List;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    .line 19
    :goto_0
    if-eqz v0, :cond_2

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 23
    move-result v1

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    goto :goto_1

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0, v0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->P(Ljava/util/List;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->O(Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->N(Ljava/util/List;)V

    .line 36
    .line 37
    iget-object v1, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->a0:Landroidx/lifecycle/MutableLiveData;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 41
    return-void

    .line 42
    .line 43
    :cond_2
    :goto_1
    sget-object v0, Loj/f;->a:Loj/f;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Loj/f;->h()V

    .line 47
    .line 48
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->a0:Landroidx/lifecycle/MutableLiveData;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->d0()Lcom/kubi/kucoin/home/v2/cards/a;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    .line 55
    filled-new-array {v1}, [Lcom/kubi/kucoin/home/v2/cards/a;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    .line 59
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 64
    return-void
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
.end method

.method public final M(Lcom/kubi/kucoin/home/v2/cards/a;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lo00/a;->c()Lkotlinx/coroutines/j0;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    new-instance v3, Lcom/kubi/home/v2/card/CardsViewModelV2$addCard$1;

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct {v3, p1, p0, v2}, Lcom/kubi/home/v2/card/CardsViewModelV2$addCard$1;-><init>(Lcom/kubi/kucoin/home/v2/cards/a;Lcom/kubi/home/v2/card/CardsViewModelV2;Lkotlin/coroutines/Continuation;)V

    .line 15
    const/4 v4, 0x2

    .line 16
    const/4 v5, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public final N(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/kucoin/home/v2/cards/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "home_feed"

    .line 3
    .line 4
    :try_start_0
    sget-object v1, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/home/v2/card/CardsViewModelV2$b;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lcom/kubi/home/v2/card/CardsViewModelV2$b;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    const-string v2, "object : TypeToken<T>() {}.type"

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 22
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    move-object v2, v0

    .line 26
    .line 27
    new-instance v1, Lcom/kubi/config/exception/KCConfigException;

    .line 28
    .line 29
    const/16 v6, 0x8

    .line 30
    const/4 v7, 0x0

    .line 31
    .line 32
    const-string v3, "RemoteConfig"

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v1 .. v7}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    const/4 v0, 0x2

    .line 39
    const/4 v2, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 43
    move-object v0, v2

    .line 44
    .line 45
    :goto_0
    check-cast v0, Ljava/lang/Boolean;

    .line 46
    const/4 v1, 0x1

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 50
    move-result v0

    .line 51
    .line 52
    sget-object v1, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->HOME_FEED:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 53
    .line 54
    .line 55
    invoke-static {v1}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 56
    move-result v1

    .line 57
    .line 58
    new-instance v2, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    const-string v3, "[appendFeedCard] config:"

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v3, ", site:"

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    move-result-object v2

    .line 82
    .line 83
    const-string v3, "CardsViewModelV2"

    .line 84
    .line 85
    .line 86
    invoke-static {v3, v2}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    if-eqz v0, :cond_0

    .line 89
    .line 90
    if-eqz v1, :cond_0

    .line 91
    .line 92
    sget-object v0, Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;->a:Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;->l()Z

    .line 96
    move-result v0

    .line 97
    .line 98
    if-eqz v0, :cond_0

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->e0()Lcom/kubi/kucoin/home/v2/cards/a;

    .line 102
    move-result-object v0

    .line 103
    .line 104
    .line 105
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 106
    goto :goto_1

    .line 107
    .line 108
    .line 109
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->Y()Lcom/kubi/kucoin/home/v2/cards/a;

    .line 110
    move-result-object v0

    .line 111
    .line 112
    .line 113
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    :goto_1
    return-void
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
.end method

.method public final O(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/kucoin/home/v2/cards/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lcom/kubi/home/v2/card/n;->b(Ljava/util/List;)I

    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    const/4 v1, 0x2

    .line 11
    .line 12
    if-gt v0, v1, :cond_1

    .line 13
    .line 14
    sget-object v0, Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;->a:Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;->r()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->f0()Lcom/kubi/kucoin/home/v2/cards/a;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    move-result v0

    .line 33
    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->f0()Lcom/kubi/kucoin/home/v2/cards/a;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    :cond_0
    return-void

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->f0()Lcom/kubi/kucoin/home/v2/cards/a;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    .line 49
    invoke-interface {p1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 50
    return-void
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
.end method

.method public final P(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/kucoin/home/v2/cards/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/wallet/api/IWalletService;->a:Lcom/kubi/wallet/api/IWalletService$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/wallet/api/IWalletService$Companion;->get()Lcom/kubi/wallet/api/IWalletService;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lcom/kubi/wallet/api/IWalletService;->a()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    move-object v2, v1

    .line 28
    .line 29
    check-cast v2, Lcom/kubi/kucoin/home/v2/cards/a;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Lcom/kubi/kucoin/home/v2/cards/a;->c()Ljava/lang/String;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    sget-object v3, Lcom/kubi/home/api/HomeWidgetCode;->Search:Lcom/kubi/home/api/HomeWidgetCode;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Lcom/kubi/home/api/HomeWidgetCode;->getCode()Ljava/lang/String;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    move-result v2

    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v1, 0x0

    .line 48
    :goto_0
    const/4 v0, 0x0

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    const/4 v1, 0x1

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move v1, v0

    .line 54
    .line 55
    :goto_1
    if-nez v1, :cond_3

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->i0()Lcom/kubi/kucoin/home/v2/cards/a;

    .line 59
    move-result-object v1

    .line 60
    .line 61
    .line 62
    invoke-interface {p1, v0, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 63
    :cond_3
    return-void
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
.end method

.method public final R(Lcom/kubi/kucoin/home/v2/cards/a;Lcom/kubi/kucoin/home/v2/cards/a;)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->f0:Lqj/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lqj/a;->getData()Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    move-result v3

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    move-result-object v3

    .line 24
    .line 25
    check-cast v3, Lcom/kubi/kucoin/home/v2/cards/a;

    .line 26
    .line 27
    if-ne v3, p1, :cond_0

    .line 28
    goto :goto_1

    .line 29
    .line 30
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v2, -0x1

    .line 33
    .line 34
    :goto_1
    if-ltz v2, :cond_2

    .line 35
    .line 36
    iget-object p1, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->c0:Landroidx/lifecycle/MutableLiveData;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v0, v2, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    iget-object p1, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->f0:Lqj/a;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 48
    .line 49
    iget-boolean p1, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->V:Z

    .line 50
    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    .line 54
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    new-instance v3, Lcom/kubi/home/v2/card/CardsViewModelV2$changeCard$1$1;

    .line 58
    const/4 p1, 0x0

    .line 59
    .line 60
    .line 61
    invoke-direct {v3, p0, p1}, Lcom/kubi/home/v2/card/CardsViewModelV2$changeCard$1$1;-><init>(Lcom/kubi/home/v2/card/CardsViewModelV2;Lkotlin/coroutines/Continuation;)V

    .line 62
    const/4 v4, 0x3

    .line 63
    const/4 v5, 0x0

    .line 64
    const/4 v1, 0x0

    .line 65
    const/4 v2, 0x0

    .line 66
    .line 67
    .line 68
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 69
    return-void

    .line 70
    .line 71
    :cond_2
    sget p1, Lcom/kubi/home/R$string;->homepage_feature_save_failed:I

    .line 72
    .line 73
    .line 74
    invoke-static {p1}, Lcom/kubi/utils/ToastCompat;->C(I)V

    .line 75
    :cond_3
    return-void
.end method

.method public final T(Landroidx/fragment/app/FragmentActivity;)V
    .locals 7
    .param p1    # Landroidx/fragment/app/FragmentActivity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->h0()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    sget-object v0, Lcom/kubi/user/api/IUserService;->a:Lcom/kubi/user/api/IUserService$Companion;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/kubi/user/api/IUserService$Companion;->get()Lcom/kubi/user/api/IUserService;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Lcom/kubi/user/api/IUserService;->c()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    goto :goto_1

    .line 20
    .line 21
    :cond_0
    iget-boolean v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->h0:Z

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    iget-boolean v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->i0:Z

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v0, 0x1

    .line 30
    .line 31
    iput-boolean v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->h0:Z

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    new-instance v4, Lcom/kubi/home/v2/card/CardsViewModelV2$checkShowVipLevelUpDialog$1;

    .line 38
    const/4 v0, 0x0

    .line 39
    .line 40
    .line 41
    invoke-direct {v4, p1, p0, v0}, Lcom/kubi/home/v2/card/CardsViewModelV2$checkShowVipLevelUpDialog$1;-><init>(Landroidx/fragment/app/FragmentActivity;Lcom/kubi/home/v2/card/CardsViewModelV2;Lkotlin/coroutines/Continuation;)V

    .line 42
    const/4 v5, 0x3

    .line 43
    const/4 v6, 0x0

    .line 44
    const/4 v2, 0x0

    .line 45
    const/4 v3, 0x0

    .line 46
    .line 47
    .line 48
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 49
    :cond_2
    :goto_0
    return-void

    .line 50
    .line 51
    :cond_3
    :goto_1
    sget-object v0, Loj/b;->a:Loj/b;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p1}, Loj/b;->d(Landroid/app/Activity;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Loj/b;->e(Landroid/app/Activity;)V

    .line 58
    return-void
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
.end method

.method public final X()Lqj/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lqj/a<",
            "Lcom/kubi/kucoin/home/v2/cards/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->f0:Lqj/a;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final Y()Lcom/kubi/kucoin/home/v2/cards/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->n0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/kucoin/home/v2/cards/a;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final Z()Lqj/a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lqj/a$a<",
            "Lcom/kubi/kucoin/home/v2/cards/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->e0:Lqj/a$a;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final a0()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Lcom/kubi/kucoin/home/v2/cards/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->c0:Landroidx/lifecycle/MutableLiveData;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final b0()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/util/List<",
            "Lcom/kubi/kucoin/home/v2/cards/a;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->a0:Landroidx/lifecycle/MutableLiveData;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final c0()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->d0:Landroidx/lifecycle/MutableLiveData;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final d0()Lcom/kubi/kucoin/home/v2/cards/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->k0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/kucoin/home/v2/cards/a;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final e0()Lcom/kubi/kucoin/home/v2/cards/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->m0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/kucoin/home/v2/cards/a;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final f0()Lcom/kubi/kucoin/home/v2/cards/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->o0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/kucoin/home/v2/cards/a;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final g0()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/util/List<",
            "Lcom/kubi/home/config/HomeFeedTab;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->b0:Landroidx/lifecycle/MutableLiveData;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final h0()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->j0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    move-result v0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final i0()Lcom/kubi/kucoin/home/v2/cards/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->l0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/kucoin/home/v2/cards/a;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public k0()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->V:Z

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->f0:Lqj/a;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lqj/a;->getData()Ljava/util/List;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-boolean v1, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->X:Z

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    check-cast v1, Lcom/kubi/kucoin/home/v2/cards/a;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/kubi/kucoin/home/v2/cards/a;->c()Ljava/lang/String;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    const-string v2, "footer"

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v1

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    .line 37
    move-result v1

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 41
    .line 42
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->f0:Lqj/a;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 46
    .line 47
    :cond_0
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->d0:Landroidx/lifecycle/MutableLiveData;

    .line 48
    .line 49
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    new-instance v0, Lcom/kubi/home/v2/card/CardsViewModelV2$onExitDragMode$2;

    .line 55
    const/4 v1, 0x0

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, p0, v1}, Lcom/kubi/home/v2/card/CardsViewModelV2$onExitDragMode$2;-><init>(Lcom/kubi/home/v2/card/CardsViewModelV2;Lkotlin/coroutines/Continuation;)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0, v0}, Lcom/kubi/kucoin/home/cards/ExtensionKt;->j(Landroidx/lifecycle/ViewModel;Lkotlin/jvm/functions/Function2;)V

    .line 62
    return-void
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
.end method

.method public final l0(Z)V
    .locals 11

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/util/j1;->a:Lcom/kubi/sdk/util/j1;

    .line 3
    .line 4
    const-string v1, "duration8"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/kubi/sdk/util/j1;->j(Ljava/lang/String;)V

    .line 8
    .line 9
    sget-object v1, Loj/f;->a:Loj/f;

    .line 10
    .line 11
    const-string v2, "home_page_start_load_data"

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Loj/f;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    sget-object v2, Lgz/b;->a:Lgz/b;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Lgz/b;->i()Z

    .line 20
    move-result v3

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x1

    .line 23
    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Lgz/b;->g()Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    sget-object v6, Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;->SUCCESS:Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;

    .line 31
    .line 32
    if-eq v2, v6, :cond_0

    .line 33
    move v2, v5

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v2, v4

    .line 36
    .line 37
    :goto_0
    sget-object v6, Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;->a:Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v6}, Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;->i()Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2;

    .line 41
    move-result-object v6

    .line 42
    .line 43
    if-eqz v6, :cond_1

    .line 44
    move v4, v5

    .line 45
    .line 46
    :cond_1
    if-eqz v4, :cond_2

    .line 47
    .line 48
    if-nez v2, :cond_2

    .line 49
    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    :cond_2
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 53
    const/4 v9, 0x4

    .line 54
    const/4 v10, 0x0

    .line 55
    .line 56
    const-string v5, "com.kubi.home.event.HomeEvent:shimmer_show"

    .line 57
    .line 58
    const-wide/16 v7, 0x0

    .line 59
    .line 60
    .line 61
    invoke-static/range {v5 .. v10}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 62
    .line 63
    :cond_3
    if-eqz v4, :cond_5

    .line 64
    .line 65
    if-nez v2, :cond_5

    .line 66
    .line 67
    iget-boolean v2, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->W:Z

    .line 68
    .line 69
    if-nez v2, :cond_4

    .line 70
    .line 71
    if-eqz p1, :cond_5

    .line 72
    .line 73
    :cond_4
    const-string p1, "home_page_widget_use_cache"

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, p1}, Loj/f;->b(Ljava/lang/String;)V

    .line 77
    .line 78
    const-string p1, "duration9"

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, p1}, Lcom/kubi/sdk/util/j1;->j(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-direct {p0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->A0()V

    .line 85
    .line 86
    :cond_5
    new-instance p1, Lcom/kubi/home/v2/card/CardsViewModelV2$loadCards$1;

    .line 87
    const/4 v0, 0x0

    .line 88
    .line 89
    .line 90
    invoke-direct {p1, p0, v3, v0}, Lcom/kubi/home/v2/card/CardsViewModelV2$loadCards$1;-><init>(Lcom/kubi/home/v2/card/CardsViewModelV2;ZLkotlin/coroutines/Continuation;)V

    .line 91
    .line 92
    .line 93
    invoke-static {p0, p1}, Lcom/kubi/kucoin/home/cards/ExtensionKt;->j(Landroidx/lifecycle/ViewModel;Lkotlin/jvm/functions/Function2;)V

    .line 94
    return-void
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
.end method

.method public final n0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/home/v2/card/CardsViewModelV2$loadCardsDetails$2;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0, v2}, Lcom/kubi/home/v2/card/CardsViewModelV2$loadCardsDetails$2;-><init>(Lcom/kubi/home/v2/card/CardsViewModelV2;Lkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    if-ne p1, v0, :cond_0

    .line 21
    return-object p1

    .line 22
    .line 23
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 24
    return-object p1
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public final o0()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->Z:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "touchHelper"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->D()Z

    .line 14
    move-result v0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final p0()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->Z:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "touchHelper"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    :cond_0
    sget-object v1, Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;->a:Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;->r()Z

    .line 16
    move-result v2

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->Q(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;->d()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;->c()V

    .line 26
    const/4 v0, 0x1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lcom/kubi/home/v2/card/CardsViewModelV2;->l0(Z)V

    .line 30
    return-void
.end method

.method public final q0()Lkotlinx/coroutines/x1;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v3, Lcom/kubi/home/v2/card/CardsViewModelV2$pullRefresh$1;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v3, p0, v1}, Lcom/kubi/home/v2/card/CardsViewModelV2$pullRefresh$1;-><init>(Lcom/kubi/home/v2/card/CardsViewModelV2;Lkotlin/coroutines/Continuation;)V

    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 17
    move-result-object v0

    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public r0()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->V:Z

    .line 4
    const/4 v1, 0x0

    .line 5
    .line 6
    iput-boolean v1, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->X:Z

    .line 7
    .line 8
    iget-object v1, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->d0:Landroidx/lifecycle/MutableLiveData;

    .line 9
    .line 10
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    sget-object v1, Lsj/a;->a:Lsj/a;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Lsj/a;->f()Ly70/g;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v0}, Ly70/a;->k(Ly70/g;Z)Ly70/a;

    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public s0()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->V:Z

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/home/v2/card/CardsViewModelV2$onExitEditMode$1;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Lcom/kubi/home/v2/card/CardsViewModelV2$onExitEditMode$1;-><init>(Lcom/kubi/home/v2/card/CardsViewModelV2;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v0}, Lcom/kubi/kucoin/home/cards/ExtensionKt;->j(Landroidx/lifecycle/ViewModel;Lkotlin/jvm/functions/Function2;)V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public t0(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->f0:Lqj/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lqj/a;->getData()Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Lcom/kubi/kucoin/home/v2/cards/a;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->f0:Lqj/a;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRemoved(I)V

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public u0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->V:Z

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->X:Z

    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public v0()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lrj/e;->a:Lrj/e;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->f0:Lqj/a;

    .line 5
    .line 6
    new-instance v2, Lcom/kubi/home/v2/card/b;

    .line 7
    .line 8
    .line 9
    invoke-direct {v2, p0}, Lcom/kubi/home/v2/card/b;-><init>(Lcom/kubi/home/v2/card/CardsViewModelV2;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lrj/e;->e(Lqj/a;Lkotlin/jvm/functions/Function1;)V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public w0(Lcom/kubi/kucoin/home/v2/cards/a;)V
    .locals 3
    .param p1    # Lcom/kubi/kucoin/home/v2/cards/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "cardData"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/home/v2/container/ui/description/CardDetailBottomSheet;->a:Lcom/kubi/home/v2/container/ui/description/CardDetailBottomSheet;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->f0:Lqj/a;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lqj/a;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    move-result-object v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    .line 23
    :goto_0
    new-instance v2, Lcom/kubi/home/v2/card/j;

    .line 24
    .line 25
    .line 26
    invoke-direct {v2, p1, p0}, Lcom/kubi/home/v2/card/j;-><init>(Lcom/kubi/kucoin/home/v2/cards/a;Lcom/kubi/home/v2/card/CardsViewModelV2;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1, v1, v2}, Lcom/kubi/home/v2/container/ui/description/CardDetailBottomSheet;->m(Lcom/kubi/kucoin/home/v2/cards/a;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    .line 30
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public final x0()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->f0:Lqj/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lqj/a;->getData()Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, -0x1

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    move-result-object v0

    .line 14
    const/4 v2, 0x0

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    move-result v3

    .line 19
    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    move-result-object v3

    .line 25
    .line 26
    check-cast v3, Lcom/kubi/kucoin/home/v2/cards/a;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Lcom/kubi/kucoin/home/v2/cards/a;->c()Ljava/lang/String;

    .line 30
    move-result-object v3

    .line 31
    .line 32
    sget-object v4, Lcom/kubi/home/api/HomeWidgetCode;->TradingRobot:Lcom/kubi/home/api/HomeWidgetCode;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4}, Lcom/kubi/home/api/HomeWidgetCode;->getCode()Ljava/lang/String;

    .line 36
    move-result-object v4

    .line 37
    .line 38
    .line 39
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    move-result v3

    .line 41
    .line 42
    if-eqz v3, :cond_0

    .line 43
    move v1, v2

    .line 44
    goto :goto_1

    .line 45
    .line 46
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 47
    goto :goto_0

    .line 48
    .line 49
    :cond_1
    :goto_1
    if-gez v1, :cond_2

    .line 50
    return-void

    .line 51
    .line 52
    :cond_2
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->f0:Lqj/a;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lqj/a;->getData()Ljava/util/List;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    .line 61
    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    check-cast v0, Lcom/kubi/kucoin/home/v2/cards/a;

    .line 65
    .line 66
    :cond_3
    iget-object v0, p0, Lcom/kubi/home/v2/card/CardsViewModelV2;->f0:Lqj/a;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRemoved(I)V

    .line 70
    return-void
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
.end method

.method public final y0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/home/v2/card/CardsViewModelV2$saveUserChanges$2;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0, v2}, Lcom/kubi/home/v2/card/CardsViewModelV2$saveUserChanges$2;-><init>(Lcom/kubi/home/v2/card/CardsViewModelV2;Lkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    if-ne p1, v0, :cond_0

    .line 21
    return-object p1

    .line 22
    .line 23
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 24
    return-object p1
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method
