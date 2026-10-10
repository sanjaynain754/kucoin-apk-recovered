.class public final Lcom/kubi/quotefacade/HomeMarketFragment;
.super Lcom/kubi/sdk/base/ui/OldBaseFragment;
.source "HomeMarketFragment.kt"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "KCCyclomaticComplexityCheck",
        "KCFragmentCheck",
        "KCLongMethodCheck"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/quotefacade/HomeMarketFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 I2\u00020\u0001:\u0001IB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u001e\u001a\u00020\u001fH\u0014J\u0008\u0010 \u001a\u00020!H\u0016J\u0008\u0010\"\u001a\u00020!H\u0016J\u0012\u0010#\u001a\u00020!2\u0008\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020!2\u0006\u0010\'\u001a\u00020(2\u0008\u0010)\u001a\u0004\u0018\u00010%H\u0016J\u0008\u0010*\u001a\u00020!H\u0016J\u0010\u0010+\u001a\u00020!2\u0006\u0010\'\u001a\u00020(H\u0002J\u0008\u0010,\u001a\u00020!H\u0002J\u0010\u0010-\u001a\u00020!2\u0006\u0010\'\u001a\u00020(H\u0002J\u0010\u0010.\u001a\u00020!2\u0006\u0010\'\u001a\u00020(H\u0002J \u0010/\u001a\u00020!2\u0006\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000202H\u0007J \u00104\u001a\u00020!2\u0006\u00105\u001a\u0002022\u0006\u00106\u001a\u0002022\u0006\u00107\u001a\u000202H\u0007J\u0012\u00108\u001a\u00020\u001f2\u0008\u0008\u0001\u00109\u001a\u00020\u001fH\u0002J\u0006\u0010:\u001a\u00020!J\u0008\u0010;\u001a\u00020!H\u0002J\u0008\u0010<\u001a\u00020!H\u0002J\u0010\u0010=\u001a\u00020!2\u0006\u0010>\u001a\u00020\nH\u0002J\u0008\u0010?\u001a\u00020!H\u0002J\u0010\u0010@\u001a\u00020!2\u0006\u0010A\u001a\u000202H\u0007J\u0006\u0010B\u001a\u00020!J\u0006\u0010C\u001a\u00020!J\u0008\u0010D\u001a\u00020!H\u0016J\u0008\u0010G\u001a\u00020!H\u0002J\u0006\u0010H\u001a\u00020!R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0008R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0010\u0010\u0011R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001a8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\u0010\u0010E\u001a\u0004\u0018\u00010FX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006J"
    }
    d2 = {
        "Lcom/kubi/quotefacade/HomeMarketFragment;",
        "Lcom/kubi/sdk/base/ui/OldBaseFragment;",
        "<init>",
        "()V",
        "mNoticeBadge",
        "Lcom/kubi/resources/widget/rorbin/badgeview/Badge;",
        "latestNoticeGmtCreated",
        "",
        "Ljava/lang/Long;",
        "clearRedDotOnNextResult",
        "",
        "pageInfos",
        "",
        "Lcom/kubi/quotefacade/entity/PageInfo;",
        "viewBind",
        "Lcom/kubi/quotefacade/databinding/KucoinLayoutHomeMarketSwitchFragmentbarBinding;",
        "getViewBind",
        "()Lcom/kubi/quotefacade/databinding/KucoinLayoutHomeMarketSwitchFragmentbarBinding;",
        "viewBind$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "cachedChanceFragment",
        "Landroidx/fragment/app/Fragment;",
        "chanceFragment",
        "getChanceFragment",
        "()Landroidx/fragment/app/Fragment;",
        "cachedFeedFragment",
        "Lcom/kubi/quotefacade/view/TabContainerFragment;",
        "feedFragment",
        "getFeedFragment",
        "()Lcom/kubi/quotefacade/view/TabContainerFragment;",
        "getLayout",
        "",
        "onLoad",
        "",
        "lazyLoad",
        "onArguments",
        "bundle",
        "Landroid/os/Bundle;",
        "onViewCreated",
        "view",
        "Landroid/view/View;",
        "savedInstanceState",
        "onDestroyView",
        "initViews",
        "setupMarketHeaderWidgetsBySite",
        "initFragments",
        "initViewPager",
        "resetSwitchBar",
        "type",
        "market",
        "",
        "index",
        "resetSwitchBarV2",
        "mainTab",
        "subTab",
        "info",
        "indexOf",
        "titleResId",
        "showTopMenuGuide",
        "initBadges",
        "getRedDotStatus",
        "updateReddot",
        "isShow",
        "gotoSmartPush",
        "changePagerScrollStatus",
        "scrollStatus",
        "removeEmotionView",
        "removeCopyTradingRnFragment",
        "onShow",
        "currentSearchHint",
        "Lcom/kubi/search/api/entity/SearchHintEntity;",
        "refreshSearchGuideWord",
        "removeFeedFlutterFragment",
        "Companion",
        "QuoteFacadeLib_googleRelease"
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
        "SMAP\nHomeMarketFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeMarketFragment.kt\ncom/kubi/quotefacade/HomeMarketFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 10 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,807:1\n147#2,16:808\n35#3,4:824\n39#3:830\n44#4,2:828\n1#5:831\n326#6,4:832\n17#7,2:836\n17#7,2:838\n25#7,2:848\n27#7:859\n25#7,3:866\n1563#8:840\n1634#8,3:841\n1563#8:844\n1634#8,3:845\n1563#8:862\n1634#8,3:863\n135#9,2:850\n67#9:860\n67#9:861\n76#10,7:852\n*S KotlinDebug\n*F\n+ 1 HomeMarketFragment.kt\ncom/kubi/quotefacade/HomeMarketFragment\n*L\n115#1:808,16\n138#1:824,4\n138#1:830\n138#1:828,2\n248#1:832,4\n270#1:836,2\n298#1:838,2\n381#1:848,2\n381#1:859\n597#1:866,3\n344#1:840\n344#1:841,3\n345#1:844\n345#1:845,3\n590#1:862\n590#1:863,3\n383#1:850,2\n519#1:860\n580#1:861\n390#1:852,7\n*E\n"
    }
.end annotation


# static fields
.field public static final c0:Lcom/kubi/quotefacade/HomeMarketFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic d0:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public U:Lzw/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public volatile V:Ljava/lang/Long;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public volatile W:Z

.field public X:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/quotefacade/entity/PageInfo;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final Y:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public Z:Landroidx/fragment/app/Fragment;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public a0:Lcom/kubi/quotefacade/view/TabContainerFragment;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public b0:Lcom/kubi/search/api/entity/SearchHintEntity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lkotlin/jvm/internal/PropertyReference1Impl;

    .line 3
    .line 4
    const-string v1, "getViewBind()Lcom/kubi/quotefacade/databinding/KucoinLayoutHomeMarketSwitchFragmentbarBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/quotefacade/HomeMarketFragment;

    .line 8
    .line 9
    const-string v4, "viewBind"

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->property1(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;

    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    .line 19
    new-array v1, v1, [Lkotlin/reflect/KProperty;

    .line 20
    .line 21
    aput-object v0, v1, v2

    .line 22
    .line 23
    sput-object v1, Lcom/kubi/quotefacade/HomeMarketFragment;->d0:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/quotefacade/HomeMarketFragment$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/quotefacade/HomeMarketFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/quotefacade/HomeMarketFragment;->c0:Lcom/kubi/quotefacade/HomeMarketFragment$Companion;

    .line 32
    return-void
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
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/quotefacade/HomeMarketFragment$special$$inlined$viewBindingFragment$1;->INSTANCE:Lcom/kubi/quotefacade/HomeMarketFragment$special$$inlined$viewBindingFragment$1;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/quotefacade/HomeMarketFragment$special$$inlined$viewBindingFragment$2;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/kubi/quotefacade/HomeMarketFragment$special$$inlined$viewBindingFragment$2;-><init>(Lcom/kubi/quotefacade/HomeMarketFragment;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->Y:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 17
    .line 18
    const-string v0, "B5Markets"

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->setPageId(Ljava/lang/String;)V

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static final E3(Lcom/kubi/quotefacade/HomeMarketFragment;Lcom/kubi/quotefacade/entity/Letter;)Lkotlin/Unit;
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->getTAG()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    const-string v2, "result = "

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    const-string v0, "none"

    .line 27
    .line 28
    const-string v1, "contentType"

    .line 29
    .line 30
    const-string v2, "1"

    .line 31
    .line 32
    const-string v3, "inform"

    .line 33
    .line 34
    const-string v4, "B5Markets"

    .line 35
    const/4 v5, 0x0

    .line 36
    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/Letter;->getLetters()Ljava/util/List;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 47
    move-result v6

    .line 48
    .line 49
    if-nez v6, :cond_3

    .line 50
    .line 51
    sget-object v6, Lcom/kubi/quotefacade/helper/p2;->a:Lcom/kubi/quotefacade/helper/p2;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v6}, Lcom/kubi/quotefacade/helper/p2;->v()Ljava/lang/Long;

    .line 55
    move-result-object v7

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->getTAG()Ljava/lang/String;

    .line 59
    move-result-object v8

    .line 60
    .line 61
    new-instance v9, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    const-string v10, "getGmtCreated sp= "

    .line 67
    .line 68
    .line 69
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v10, ", new gmt:"

    .line 75
    .line 76
    .line 77
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    move-result-object v10

    .line 82
    .line 83
    check-cast v10, Lcom/kubi/quotefacade/entity/Lettes;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v10}, Lcom/kubi/quotefacade/entity/Lettes;->getGmtCreated()Ljava/lang/String;

    .line 87
    move-result-object v10

    .line 88
    .line 89
    .line 90
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    move-result-object v9

    .line 95
    .line 96
    .line 97
    invoke-static {v8, v9}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    move-result-object v8

    .line 102
    .line 103
    check-cast v8, Lcom/kubi/quotefacade/entity/Lettes;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v8}, Lcom/kubi/quotefacade/entity/Lettes;->getGmtCreated()Ljava/lang/String;

    .line 107
    move-result-object v8

    .line 108
    .line 109
    .line 110
    invoke-static {v8}, Lcom/kubi/utils/extensions/DowngradeExKt;->q(Ljava/lang/String;)Ljava/lang/Long;

    .line 111
    move-result-object v9

    .line 112
    .line 113
    iput-object v9, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->V:Ljava/lang/Long;

    .line 114
    .line 115
    iget-boolean v10, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->W:Z

    .line 116
    .line 117
    if-eqz v10, :cond_1

    .line 118
    .line 119
    if-eqz v8, :cond_1

    .line 120
    .line 121
    .line 122
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 123
    move-result v10

    .line 124
    .line 125
    if-nez v10, :cond_0

    .line 126
    goto :goto_0

    .line 127
    .line 128
    :cond_0
    iput-boolean v5, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->W:Z

    .line 129
    .line 130
    .line 131
    invoke-virtual {v6, v8}, Lcom/kubi/quotefacade/helper/p2;->x(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, v5}, Lcom/kubi/quotefacade/HomeMarketFragment;->f4(Z)V

    .line 135
    .line 136
    new-instance p0, Lorg/json/JSONObject;

    .line 137
    .line 138
    .line 139
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 143
    .line 144
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 145
    .line 146
    .line 147
    invoke-static {v4, v3, v2, p0}, Lqq/m;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 148
    .line 149
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 150
    return-object p0

    .line 151
    .line 152
    :cond_1
    :goto_0
    if-nez v7, :cond_2

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->getTAG()Ljava/lang/String;

    .line 156
    move-result-object p0

    .line 157
    .line 158
    new-instance v7, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    const-string v8, "save gmtCreated to sp= "

    .line 164
    .line 165
    .line 166
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 170
    move-result-object v8

    .line 171
    .line 172
    check-cast v8, Lcom/kubi/quotefacade/entity/Lettes;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v8}, Lcom/kubi/quotefacade/entity/Lettes;->getGmtCreated()Ljava/lang/String;

    .line 176
    move-result-object v8

    .line 177
    .line 178
    .line 179
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    move-result-object v7

    .line 184
    .line 185
    .line 186
    invoke-static {p0, v7}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 190
    move-result-object p0

    .line 191
    .line 192
    check-cast p0, Lcom/kubi/quotefacade/entity/Lettes;

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0}, Lcom/kubi/quotefacade/entity/Lettes;->getGmtCreated()Ljava/lang/String;

    .line 196
    move-result-object p0

    .line 197
    .line 198
    .line 199
    invoke-virtual {v6, p0}, Lcom/kubi/quotefacade/helper/p2;->x(Ljava/lang/String;)V

    .line 200
    goto :goto_1

    .line 201
    .line 202
    :cond_2
    if-eqz v9, :cond_3

    .line 203
    .line 204
    .line 205
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 206
    move-result-wide v8

    .line 207
    .line 208
    .line 209
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 210
    move-result-wide v6

    .line 211
    .line 212
    cmp-long p1, v8, v6

    .line 213
    .line 214
    if-lez p1, :cond_3

    .line 215
    const/4 v5, 0x1

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0, v5}, Lcom/kubi/quotefacade/HomeMarketFragment;->f4(Z)V

    .line 219
    .line 220
    :cond_3
    :goto_1
    new-instance p0, Lorg/json/JSONObject;

    .line 221
    .line 222
    .line 223
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 224
    .line 225
    if-eqz v5, :cond_4

    .line 226
    .line 227
    const-string v0, "redpoint"

    .line 228
    .line 229
    .line 230
    :cond_4
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 231
    .line 232
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 233
    .line 234
    .line 235
    invoke-static {v4, v3, v2, p0}, Lqq/m;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 236
    .line 237
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 238
    return-object p0
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
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
.end method

.method public static final F3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

.method public static final G3(Lcom/kubi/quotefacade/HomeMarketFragment;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->getTAG()Ljava/lang/String;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    const-string v1, "getRedDotStatus error: "

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-static {p0, p1}, Lro/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 27
    return-object p0
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

.method public static final H3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

.method private final K3(I)I
    .locals 3
    .param p1    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->X:Ljava/util/List;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/16 v2, 0xa

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 12
    move-result v2

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    move-result v2

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    check-cast v2, Lcom/kubi/quotefacade/entity/PageInfo;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lcom/kubi/quotefacade/entity/PageInfo;->getPageTitle()Ljava/lang/String;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    .line 38
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 39
    goto :goto_0

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    invoke-interface {v1, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 47
    move-result p1

    .line 48
    return p1

    .line 49
    :cond_1
    const/4 p1, -0x1

    .line 50
    return p1
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

.method public static final N3(Lcom/kubi/quotefacade/HomeMarketFragment;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->X:Ljava/util/List;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/quotefacade/entity/PageInfo;

    .line 7
    .line 8
    sget v2, Lcom/kubi/quotefacade/R$string;->kc_tb_asset_bot:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    const-string v2, "getString(...)"

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    new-instance v2, Landroidx/fragment/app/Fragment;

    .line 20
    .line 21
    .line 22
    invoke-direct {v2}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 23
    .line 24
    const-string v3, "10"

    .line 25
    .line 26
    .line 27
    invoke-direct {v1, p0, v3, v2}, Lcom/kubi/quotefacade/entity/PageInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 33
    return-object p0
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

.method public static final Q3(Lcom/kubi/quotefacade/HomeMarketFragment;)Lkotlin/Unit;
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getCurrentItem()I

    .line 14
    move-result v0

    .line 15
    .line 16
    sget v1, Lcom/kubi/quotefacade/R$string;->copytd_copy_trading:I

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v1}, Lcom/kubi/quotefacade/HomeMarketFragment;->K3(I)I

    .line 20
    move-result v1

    .line 21
    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    sget-object p0, Lcom/kubi/quotefacade/service/a;->a:Lcom/kubi/quotefacade/service/a;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/kubi/quotefacade/service/a;->a()Lcom/kubi/copytrading/ICopyTradingService;

    .line 28
    move-result-object p0

    .line 29
    .line 30
    .line 31
    invoke-interface {p0}, Lcom/kubi/copytrading/ICopyTradingService;->d()Z

    .line 32
    goto :goto_2

    .line 33
    .line 34
    :cond_0
    iget-object p0, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->b0:Lcom/kubi/search/api/entity/SearchHintEntity;

    .line 35
    const/4 v0, 0x0

    .line 36
    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/kubi/search/api/entity/SearchHintEntity;->getValue()Ljava/lang/String;

    .line 41
    move-result-object v1

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object v1, v0

    .line 44
    .line 45
    :goto_0
    const-string v2, ""

    .line 46
    .line 47
    if-nez v1, :cond_2

    .line 48
    move-object v1, v2

    .line 49
    .line 50
    :cond_2
    sget-object v3, Lp10/a;->a:Lp10/a;

    .line 51
    .line 52
    const-string v4, "search"

    .line 53
    const/4 v5, 0x4

    .line 54
    .line 55
    const-string v6, "B5Markets"

    .line 56
    .line 57
    .line 58
    invoke-static {v6, v4, v0, v5, v0}, Lqq/m;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 59
    move-result-object v4

    .line 60
    .line 61
    if-eqz p0, :cond_3

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/kubi/search/api/entity/SearchHintEntity;->getType()Ljava/lang/String;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    :cond_3
    if-nez v0, :cond_4

    .line 68
    goto :goto_1

    .line 69
    :cond_4
    move-object v2, v0

    .line 70
    .line 71
    :goto_1
    const-string p0, "MARKET"

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, v1, p0, v4, v2}, Lp10/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    const/16 v9, 0xc

    .line 77
    const/4 v10, 0x0

    .line 78
    .line 79
    const-string v5, "B5Markets"

    .line 80
    .line 81
    const-string v6, "search"

    .line 82
    const/4 v7, 0x0

    .line 83
    const/4 v8, 0x0

    .line 84
    .line 85
    .line 86
    invoke-static/range {v5 .. v10}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 87
    .line 88
    :goto_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 89
    return-object p0
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

.method public static final R3(Landroid/os/Bundle;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/quotefacade/service/a;->a:Lcom/kubi/quotefacade/service/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/quotefacade/service/a;->a()Lcom/kubi/copytrading/ICopyTradingService;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, p0}, Lcom/kubi/copytrading/ICopyTradingService;->g(Landroid/os/Bundle;)V

    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    return-object p0
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

.method public static final S3()Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/quotefacade/service/a;->a:Lcom/kubi/quotefacade/service/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/quotefacade/service/a;->c()Lcom/kubi/kumex/api/IKuMexService;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Lcom/kubi/kumex/api/IKuMexService;->c(Z)V

    .line 11
    .line 12
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    return-object v0
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

.method public static final U3(Lcom/kubi/quotefacade/HomeMarketFragment;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0

    .line 10
    .line 11
    :cond_0
    sget-object v1, Lcom/kubi/search/api/ISearchService;->a:Lcom/kubi/search/api/ISearchService$Companion;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/kubi/search/api/ISearchService$Companion;->get()Lcom/kubi/search/api/ISearchService;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-interface {v1}, Lcom/kubi/search/api/ISearchService;->a()Lcom/kubi/search/api/entity/SearchHintEntity;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iget-object v0, v0, Lbv/d0;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/kubi/search/api/entity/SearchHintEntity;->getValue()Ljava/lang/String;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v1, 0x0

    .line 33
    .line 34
    :goto_0
    iput-object v1, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->b0:Lcom/kubi/search/api/entity/SearchHintEntity;

    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 37
    return-object p0
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static final X3(Lcom/kubi/quotefacade/HomeMarketFragment;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->X:Ljava/util/List;

    .line 12
    .line 13
    if-eqz v0, :cond_7

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-eqz v0, :cond_6

    .line 20
    .line 21
    iget-object v0, v0, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 22
    .line 23
    if-eqz v0, :cond_6

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getCurrentItem()I

    .line 27
    move-result v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->B3()Landroidx/fragment/app/Fragment;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    instance-of v2, v1, Lcom/kubi/quotefacade/chance/ChanceFragment;

    .line 34
    const/4 v3, 0x0

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    iget-object p0, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->X:Ljava/util/List;

    .line 39
    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    .line 43
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    move-result-object p0

    .line 45
    .line 46
    check-cast p0, Lcom/kubi/quotefacade/entity/PageInfo;

    .line 47
    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/kubi/quotefacade/entity/PageInfo;->getFragment()Landroidx/fragment/app/Fragment;

    .line 52
    move-result-object v3

    .line 53
    .line 54
    :cond_1
    instance-of p0, v3, Lcom/kubi/quotefacade/chance/ChanceFragment;

    .line 55
    .line 56
    if-eqz p0, :cond_2

    .line 57
    move-object p0, v1

    .line 58
    .line 59
    check-cast p0, Lcom/kubi/quotefacade/chance/ChanceFragment;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/kubi/quotefacade/chance/ChanceFragment;->p3()Z

    .line 63
    move-result p0

    .line 64
    const/4 v0, 0x1

    .line 65
    .line 66
    if-ne p0, v0, :cond_2

    .line 67
    .line 68
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 69
    return-object p0

    .line 70
    .line 71
    :cond_2
    check-cast v1, Lcom/kubi/quotefacade/chance/ChanceFragment;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Lcom/kubi/quotefacade/chance/ChanceFragment;->q3()V

    .line 75
    goto :goto_0

    .line 76
    .line 77
    :cond_3
    instance-of v2, v1, Lcom/kubi/quotefacade/chance/ChanceRnContainer;

    .line 78
    .line 79
    if-eqz v2, :cond_7

    .line 80
    .line 81
    iget-object p0, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->X:Ljava/util/List;

    .line 82
    .line 83
    if-eqz p0, :cond_4

    .line 84
    .line 85
    .line 86
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 87
    move-result-object p0

    .line 88
    .line 89
    check-cast p0, Lcom/kubi/quotefacade/entity/PageInfo;

    .line 90
    .line 91
    if-eqz p0, :cond_4

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/kubi/quotefacade/entity/PageInfo;->getFragment()Landroidx/fragment/app/Fragment;

    .line 95
    move-result-object v3

    .line 96
    .line 97
    :cond_4
    instance-of p0, v3, Lcom/kubi/quotefacade/chance/ChanceRnContainer;

    .line 98
    .line 99
    if-eqz p0, :cond_5

    .line 100
    .line 101
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 102
    return-object p0

    .line 103
    .line 104
    :cond_5
    check-cast v1, Lcom/kubi/quotefacade/chance/ChanceRnContainer;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Lcom/kubi/quotefacade/chance/ChanceRnContainer;->s3()V

    .line 108
    goto :goto_0

    .line 109
    .line 110
    :cond_6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 111
    return-object p0

    .line 112
    .line 113
    :cond_7
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 114
    return-object p0
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

.method public static final Z3(Lcom/kubi/quotefacade/HomeMarketFragment;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->X:Ljava/util/List;

    .line 12
    .line 13
    if-eqz v0, :cond_4

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    iget-object v0, v0, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getCurrentItem()I

    .line 27
    move-result v0

    .line 28
    .line 29
    iget-object v1, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->X:Ljava/util/List;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    check-cast v0, Lcom/kubi/quotefacade/entity/PageInfo;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/kubi/quotefacade/entity/PageInfo;->getFragment()Landroidx/fragment/app/Fragment;

    .line 43
    move-result-object v0

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v0, 0x0

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->C3()Lcom/kubi/quotefacade/view/TabContainerFragment;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    move-result v0

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 58
    return-object p0

    .line 59
    .line 60
    .line 61
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->C3()Lcom/kubi/quotefacade/view/TabContainerFragment;

    .line 62
    move-result-object p0

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/kubi/quotefacade/view/TabContainerFragment;->o3()V

    .line 66
    goto :goto_1

    .line 67
    .line 68
    :cond_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 69
    return-object p0

    .line 70
    .line 71
    :cond_4
    :goto_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 72
    return-object p0
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

.method public static final d4()Lkotlin/Unit;
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->MarketWidget:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object v0

    .line 12
    .line 13
    :cond_0
    sget-object v1, Lf00/a;->a:Lf00/a;

    .line 14
    const/4 v5, 0x7

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    .line 20
    .line 21
    invoke-static/range {v1 .. v6}, Lg00/i$a;->b(Lg00/i;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 22
    .line 23
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 24
    return-object v0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static final e4(Lcom/kubi/quotefacade/HomeMarketFragment;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->IntelligentMonitoring:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 6
    move-result v0

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
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->J3()V

    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 17
    return-object p0
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

.method public static synthetic k3(Lcom/kubi/quotefacade/HomeMarketFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->Z3(Lcom/kubi/quotefacade/HomeMarketFragment;)Lkotlin/Unit;

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

.method public static synthetic l3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/quotefacade/HomeMarketFragment;->H3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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

.method public static synthetic m3(Lcom/kubi/quotefacade/HomeMarketFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->X3(Lcom/kubi/quotefacade/HomeMarketFragment;)Lkotlin/Unit;

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

.method public static synthetic n3(Lcom/kubi/quotefacade/HomeMarketFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->N3(Lcom/kubi/quotefacade/HomeMarketFragment;)Lkotlin/Unit;

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

.method public static synthetic o3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/quotefacade/HomeMarketFragment;->F3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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

.method public static synthetic p3()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/quotefacade/HomeMarketFragment;->d4()Lkotlin/Unit;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public static synthetic q3(Lcom/kubi/quotefacade/HomeMarketFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->U3(Lcom/kubi/quotefacade/HomeMarketFragment;)Lkotlin/Unit;

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

.method public static synthetic r3(Lcom/kubi/quotefacade/HomeMarketFragment;Lcom/kubi/quotefacade/entity/Letter;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/quotefacade/HomeMarketFragment;->E3(Lcom/kubi/quotefacade/HomeMarketFragment;Lcom/kubi/quotefacade/entity/Letter;)Lkotlin/Unit;

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

.method public static synthetic s3(Lcom/kubi/quotefacade/HomeMarketFragment;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/quotefacade/HomeMarketFragment;->G3(Lcom/kubi/quotefacade/HomeMarketFragment;Ljava/lang/Throwable;)Lkotlin/Unit;

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

.method public static synthetic t3(Landroid/os/Bundle;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->R3(Landroid/os/Bundle;)Lkotlin/Unit;

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

.method public static synthetic u3()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/quotefacade/HomeMarketFragment;->S3()Lkotlin/Unit;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public static synthetic v3(Lcom/kubi/quotefacade/HomeMarketFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->Q3(Lcom/kubi/quotefacade/HomeMarketFragment;)Lkotlin/Unit;

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

.method public static synthetic w3(Lcom/kubi/quotefacade/HomeMarketFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->e4(Lcom/kubi/quotefacade/HomeMarketFragment;)Lkotlin/Unit;

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

.method public static final synthetic x3(Lcom/kubi/quotefacade/HomeMarketFragment;)Ljava/util/List;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->X:Ljava/util/List;

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

.method public static final synthetic y3(Lcom/kubi/quotefacade/HomeMarketFragment;)Lbv/d0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

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

.method public static final synthetic z3(Lcom/kubi/quotefacade/HomeMarketFragment;I)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kubi/quotefacade/HomeMarketFragment;->K3(I)I

    .line 4
    move-result p0

    .line 5
    return p0
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


# virtual methods
.method public final A3(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    .line 2
    const-string v0, "scrollStatus"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    goto :goto_0

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_1
    sget-object v1, Lcv/c;->a:Lcv/c;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lcv/c;->a(Ljava/lang/String;)Z

    .line 25
    move-result p1

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    if-eqz p1, :cond_3

    .line 29
    .line 30
    iget-object p1, v0, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 31
    const/4 v0, 0x0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->setScroll(Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->B3()Landroidx/fragment/app/Fragment;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    instance-of v2, p1, Lcom/kubi/quotefacade/chance/ChanceFragment;

    .line 41
    .line 42
    if-eqz v2, :cond_2

    .line 43
    move-object v1, p1

    .line 44
    .line 45
    check-cast v1, Lcom/kubi/quotefacade/chance/ChanceFragment;

    .line 46
    .line 47
    :cond_2
    if-eqz v1, :cond_5

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v0}, Lcom/kubi/quotefacade/chance/ChanceFragment;->l3(Z)V

    .line 51
    return-void

    .line 52
    .line 53
    :cond_3
    iget-object p1, v0, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 54
    const/4 v0, 0x1

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->setScroll(Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->B3()Landroidx/fragment/app/Fragment;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    instance-of v2, p1, Lcom/kubi/quotefacade/chance/ChanceFragment;

    .line 64
    .line 65
    if-eqz v2, :cond_4

    .line 66
    move-object v1, p1

    .line 67
    .line 68
    check-cast v1, Lcom/kubi/quotefacade/chance/ChanceFragment;

    .line 69
    .line 70
    :cond_4
    if-eqz v1, :cond_5

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v0}, Lcom/kubi/quotefacade/chance/ChanceFragment;->l3(Z)V

    .line 74
    :cond_5
    :goto_0
    return-void
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

.method public final B3()Landroidx/fragment/app/Fragment;
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->Z:Landroidx/fragment/app/Fragment;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    const-string v0, "market_opportunity_rn"

    .line 7
    .line 8
    :try_start_0
    sget-object v1, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 9
    .line 10
    new-instance v1, Lcom/kubi/quotefacade/HomeMarketFragment$a;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1}, Lcom/kubi/quotefacade/HomeMarketFragment$a;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    const-string v2, "object : TypeToken<T>() {}.type"

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 26
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    move-object v2, v0

    .line 30
    .line 31
    new-instance v1, Lcom/kubi/config/exception/KCConfigException;

    .line 32
    .line 33
    const/16 v6, 0x8

    .line 34
    const/4 v7, 0x0

    .line 35
    .line 36
    const-string v3, "RemoteConfig"

    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    .line 40
    .line 41
    invoke-direct/range {v1 .. v7}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 42
    const/4 v0, 0x2

    .line 43
    const/4 v2, 0x0

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 47
    move-object v0, v2

    .line 48
    .line 49
    :goto_0
    check-cast v0, Ljava/lang/Boolean;

    .line 50
    const/4 v1, 0x0

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 54
    move-result v0

    .line 55
    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    sget-object v0, Lcom/kubi/quotefacade/chance/ChanceRnContainer;->V:Lcom/kubi/quotefacade/chance/ChanceRnContainer$Companion;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/kubi/quotefacade/chance/ChanceRnContainer$Companion;->newInstance()Lcom/kubi/quotefacade/chance/ChanceRnContainer;

    .line 62
    move-result-object v0

    .line 63
    goto :goto_1

    .line 64
    .line 65
    :cond_0
    sget-object v0, Lcom/kubi/quotefacade/chance/ChanceFragment;->Y:Lcom/kubi/quotefacade/chance/ChanceFragment$Companion;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/kubi/quotefacade/chance/ChanceFragment$Companion;->newInstance()Lcom/kubi/quotefacade/chance/ChanceFragment;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    :goto_1
    iput-object v0, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->Z:Landroidx/fragment/app/Fragment;

    .line 72
    :cond_1
    return-object v0
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

.method public final C3()Lcom/kubi/quotefacade/view/TabContainerFragment;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->a0:Lcom/kubi/quotefacade/view/TabContainerFragment;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/kubi/quotefacade/feed/FeedFragment;->W:Lcom/kubi/quotefacade/feed/FeedFragment$Companion;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/quotefacade/feed/FeedFragment$Companion;->instance()Lcom/kubi/quotefacade/feed/FeedFragment;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iput-object v0, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->a0:Lcom/kubi/quotefacade/view/TabContainerFragment;

    .line 13
    :cond_0
    return-object v0
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

.method public final D3()V
    .locals 10

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->IntelligentMonitoring:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/kubi/quotefacade/service/a;->a:Lcom/kubi/quotefacade/service/a;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/quotefacade/service/a;->e()Lcom/kubi/user/api/IUserService;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Lcom/kubi/user/api/IUserService;->c()Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    sget-object v0, Lcom/kubi/quotefacade/constant/CardID;->ALART:Lcom/kubi/quotefacade/constant/CardID;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/kubi/quotefacade/constant/CardID;->getId()I

    .line 28
    move-result v0

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    sget-object v1, Lcom/kubi/quotefacade/constant/CardID;->MARKET_CHANGE:Lcom/kubi/quotefacade/constant/CardID;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/kubi/quotefacade/constant/CardID;->getId()I

    .line 38
    move-result v1

    .line 39
    .line 40
    .line 41
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    sget-object v2, Lcom/kubi/quotefacade/constant/CardID;->WHALE:Lcom/kubi/quotefacade/constant/CardID;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Lcom/kubi/quotefacade/constant/CardID;->getId()I

    .line 48
    move-result v2

    .line 49
    .line 50
    .line 51
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    .line 55
    filled-new-array {v0, v1, v2}, [Ljava/lang/Integer;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    const/16 v8, 0x3e

    .line 63
    const/4 v9, 0x0

    .line 64
    .line 65
    const-string v2, ","

    .line 66
    const/4 v3, 0x0

    .line 67
    const/4 v4, 0x0

    .line 68
    const/4 v5, 0x0

    .line 69
    const/4 v6, 0x0

    .line 70
    const/4 v7, 0x0

    .line 71
    .line 72
    .line 73
    invoke-static/range {v1 .. v9}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    new-instance v1, Lcom/kubi/quotefacade/repository/d;

    .line 77
    .line 78
    .line 79
    invoke-direct {v1}, Lcom/kubi/quotefacade/repository/d;-><init>()V

    .line 80
    const/4 v2, 0x0

    .line 81
    const/4 v3, 0x1

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v0, v2, v3, v3}, Lcom/kubi/quotefacade/repository/d;->d(Ljava/lang/String;Ljava/lang/Long;II)Lio/reactivex/Observable;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    .line 88
    invoke-static {}, Lcom/kubi/sdk/util/a1;->n()Lio/reactivex/ObservableTransformer;

    .line 89
    move-result-object v1

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 93
    move-result-object v0

    .line 94
    .line 95
    .line 96
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    .line 97
    move-result-object v1

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    .line 101
    move-result-object v0

    .line 102
    .line 103
    new-instance v1, Lcom/kubi/quotefacade/i;

    .line 104
    .line 105
    .line 106
    invoke-direct {v1, p0}, Lcom/kubi/quotefacade/i;-><init>(Lcom/kubi/quotefacade/HomeMarketFragment;)V

    .line 107
    .line 108
    new-instance v2, Lcom/kubi/quotefacade/j;

    .line 109
    .line 110
    .line 111
    invoke-direct {v2, v1}, Lcom/kubi/quotefacade/j;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 112
    .line 113
    new-instance v1, Lcom/kubi/quotefacade/k;

    .line 114
    .line 115
    .line 116
    invoke-direct {v1, p0}, Lcom/kubi/quotefacade/k;-><init>(Lcom/kubi/quotefacade/HomeMarketFragment;)V

    .line 117
    .line 118
    new-instance v3, Lcom/kubi/quotefacade/l;

    .line 119
    .line 120
    .line 121
    invoke-direct {v3, v1}, Lcom/kubi/quotefacade/l;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 125
    move-result-object v0

    .line 126
    .line 127
    const-string v1, "subscribe(...)"

    .line 128
    .line 129
    .line 130
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->getDestroyDisposable()Lio/reactivex/disposables/CompositeDisposable;

    .line 134
    move-result-object v1

    .line 135
    .line 136
    .line 137
    invoke-static {v0, v1}, Lio/reactivex/rxkotlin/DisposableKt;->addTo(Lio/reactivex/disposables/Disposable;Lio/reactivex/disposables/CompositeDisposable;)Lio/reactivex/disposables/Disposable;

    .line 138
    :cond_1
    :goto_0
    return-void
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

.method public final I3()Lbv/d0;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->Y:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/quotefacade/HomeMarketFragment;->d0:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p0, v1}, Lcom/kubi/sdk/viewbindingdelegate/base/a;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Lbv/d0;

    .line 14
    return-object v0
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

.method public final J3()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->V:Ljava/lang/Long;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    sget-object v2, Lcom/kubi/quotefacade/helper/p2;->a:Lcom/kubi/quotefacade/helper/p2;

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, v0}, Lcom/kubi/quotefacade/helper/p2;->x(Ljava/lang/String;)V

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x1

    .line 20
    .line 21
    iput-boolean v0, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->W:Z

    .line 22
    .line 23
    :goto_0
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 24
    .line 25
    const-string v1, "krn/router?biz=message&entry=main&component=kucoin_message_rn&needLogin=true&route=GroupPage&cardBusinessId=104"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lay/a;->k()Z

    .line 33
    .line 34
    new-instance v0, Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 38
    .line 39
    iget-object v1, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->U:Lzw/a;

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    .line 44
    invoke-interface {v1}, Lzw/a;->getBadgeNumber()I

    .line 45
    move-result v1

    .line 46
    const/4 v2, -0x1

    .line 47
    .line 48
    if-ne v1, v2, :cond_1

    .line 49
    .line 50
    const-string v1, "redpoint"

    .line 51
    goto :goto_1

    .line 52
    .line 53
    :cond_1
    const-string v1, "none"

    .line 54
    .line 55
    :goto_1
    const-string v2, "contentType"

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 59
    .line 60
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 61
    .line 62
    const-string v1, "B5Markets"

    .line 63
    .line 64
    const-string v2, "inform"

    .line 65
    .line 66
    const-string v3, "1"

    .line 67
    .line 68
    .line 69
    invoke-static {v1, v2, v3, v0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 70
    const/4 v0, 0x0

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v0}, Lcom/kubi/quotefacade/HomeMarketFragment;->f4(Z)V

    .line 74
    return-void
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

.method public final L3()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    new-instance v1, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, v0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Lzw/c;->a(Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;)Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v1, v1, Lbv/d0;->b:Landroid/widget/ImageView;

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v1, 0x0

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->f(Landroid/view/View;)Lzw/a;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    iput-object v0, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->U:Lzw/a;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    const/high16 v1, 0x40800000    # 4.0f

    .line 36
    const/4 v2, 0x1

    .line 37
    .line 38
    const/high16 v3, 0x41800000    # 16.0f

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v3, v1, v2}, Lzw/a;->c(FFZ)Lzw/a;

    .line 42
    const/4 v0, 0x0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lcom/kubi/quotefacade/HomeMarketFragment;->f4(Z)V

    .line 46
    :cond_1
    return-void
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
.end method

.method public final M3(Landroid/view/View;)V
    .locals 11

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/sdk/site/info/SiteInfoManager;->a:Lcom/kubi/sdk/site/info/SiteInfoManager;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    const-class v3, Lhv/c;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v3, v2}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    const-string v3, "8"

    .line 17
    const/4 v4, 0x1

    .line 18
    const/4 v5, 0x0

    .line 19
    .line 20
    const-string v6, "getString(...)"

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    check-cast v2, Lhv/c;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    const-string v7, "getContext(...)"

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 37
    move-result-object v7

    .line 38
    .line 39
    .line 40
    invoke-interface {v2, p1, v7}, Lhv/c;->a(Landroid/content/Context;Landroid/os/Bundle;)Ljava/util/ArrayList;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    if-nez p1, :cond_3

    .line 44
    .line 45
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    sget-object v2, Lcom/kubi/quotefacade/helper/h2;->a:Lcom/kubi/quotefacade/helper/h2;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Lcom/kubi/quotefacade/helper/h2;->j()Z

    .line 54
    move-result v7

    .line 55
    .line 56
    if-eqz v7, :cond_1

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Lcom/kubi/quotefacade/helper/h2;->h()Z

    .line 60
    move-result v7

    .line 61
    .line 62
    if-eqz v7, :cond_1

    .line 63
    .line 64
    new-instance v7, Lcom/kubi/quotefacade/entity/PageInfo;

    .line 65
    .line 66
    sget v8, Lcom/kubi/quotefacade/R$string;->favorites:I

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v8}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 70
    move-result-object v8

    .line 71
    .line 72
    .line 73
    invoke-static {v8, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    sget-object v9, Lcom/kubi/quotefacade/favorites/QuoteFavoriteFragment;->f0:Lcom/kubi/quotefacade/favorites/QuoteFavoriteFragment$Companion;

    .line 76
    .line 77
    .line 78
    invoke-static {v9, v5, v4, v5}, Lcom/kubi/quotefacade/favorites/QuoteFavoriteFragment$Companion;->newInstance$default(Lcom/kubi/quotefacade/favorites/QuoteFavoriteFragment$Companion;Ljava/lang/String;ILjava/lang/Object;)Lcom/kubi/quotefacade/favorites/QuoteFavoriteFragment;

    .line 79
    move-result-object v9

    .line 80
    .line 81
    const-string v10, "1"

    .line 82
    .line 83
    .line 84
    invoke-direct {v7, v8, v10, v9}, Lcom/kubi/quotefacade/entity/PageInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :cond_1
    invoke-virtual {v2}, Lcom/kubi/quotefacade/helper/h2;->p()Z

    .line 91
    move-result v7

    .line 92
    .line 93
    if-eqz v7, :cond_2

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Lcom/kubi/quotefacade/helper/h2;->m()Z

    .line 97
    move-result v7

    .line 98
    .line 99
    if-eqz v7, :cond_2

    .line 100
    .line 101
    new-instance v7, Lcom/kubi/quotefacade/entity/PageInfo;

    .line 102
    .line 103
    sget v8, Lcom/kubi/quotefacade/R$string;->market:I

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v8}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 107
    move-result-object v8

    .line 108
    .line 109
    .line 110
    invoke-static {v8, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    sget-object v9, Lcom/kubi/quotefacade/market/QuoteMarketFragment;->X:Lcom/kubi/quotefacade/market/QuoteMarketFragment$Companion;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v9}, Lcom/kubi/quotefacade/market/QuoteMarketFragment$Companion;->newInstance()Lcom/kubi/quotefacade/market/QuoteMarketFragment;

    .line 116
    move-result-object v9

    .line 117
    .line 118
    const-string v10, "6"

    .line 119
    .line 120
    .line 121
    invoke-direct {v7, v8, v10, v9}, Lcom/kubi/quotefacade/entity/PageInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    :cond_2
    invoke-virtual {v2}, Lcom/kubi/quotefacade/helper/h2;->q()Z

    .line 128
    move-result v2

    .line 129
    .line 130
    if-eqz v2, :cond_3

    .line 131
    .line 132
    new-instance v2, Lcom/kubi/quotefacade/entity/PageInfo;

    .line 133
    .line 134
    sget v7, Lcom/kubi/quotefacade/R$string;->market_alpha:I

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 138
    move-result-object v7

    .line 139
    .line 140
    .line 141
    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    new-instance v8, Lcom/kubi/quotefacade/alpha/AlphaFragment;

    .line 144
    .line 145
    .line 146
    invoke-direct {v8}, Lcom/kubi/quotefacade/alpha/AlphaFragment;-><init>()V

    .line 147
    .line 148
    .line 149
    invoke-direct {v2, v7, v3, v8}, Lcom/kubi/quotefacade/entity/PageInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    :cond_3
    iput-object p1, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->X:Ljava/util/List;

    .line 155
    .line 156
    const-class p1, Lhv/d;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 160
    move-result-object v1

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, p1, v1}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 164
    move-result-object p1

    .line 165
    .line 166
    if-eqz p1, :cond_4

    .line 167
    .line 168
    check-cast p1, Lhv/d;

    .line 169
    .line 170
    .line 171
    invoke-interface {p1}, Lhv/d;->b()Z

    .line 172
    move-result v4

    .line 173
    .line 174
    :cond_4
    sget-object p1, Lcom/kubi/quotefacade/chance/e;->a:Lcom/kubi/quotefacade/chance/e;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1}, Lcom/kubi/quotefacade/chance/e;->a()Z

    .line 178
    move-result p1

    .line 179
    .line 180
    if-eqz v4, :cond_5

    .line 181
    .line 182
    if-eqz p1, :cond_5

    .line 183
    .line 184
    sget-object p1, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Opportunity:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 185
    .line 186
    .line 187
    invoke-static {p1}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 188
    move-result p1

    .line 189
    .line 190
    if-eqz p1, :cond_5

    .line 191
    .line 192
    iget-object p1, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->X:Ljava/util/List;

    .line 193
    .line 194
    if-eqz p1, :cond_5

    .line 195
    .line 196
    new-instance v0, Lcom/kubi/quotefacade/entity/PageInfo;

    .line 197
    .line 198
    sget v1, Lcom/kubi/quotefacade/R$string;->discover_emotion_chance:I

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 202
    move-result-object v1

    .line 203
    .line 204
    .line 205
    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    .line 207
    const-string v2, "4"

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->B3()Landroidx/fragment/app/Fragment;

    .line 211
    move-result-object v4

    .line 212
    .line 213
    .line 214
    invoke-direct {v0, v1, v2, v4}, Lcom/kubi/quotefacade/entity/PageInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    .line 215
    .line 216
    .line 217
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    :cond_5
    sget-object p1, Lcom/kubi/quotefacade/api/IQuoteFacadeService;->a:Lcom/kubi/quotefacade/api/IQuoteFacadeService$Companion;

    .line 220
    .line 221
    .line 222
    invoke-virtual {p1}, Lcom/kubi/quotefacade/api/IQuoteFacadeService$Companion;->get()Lcom/kubi/quotefacade/api/IQuoteFacadeService;

    .line 223
    move-result-object p1

    .line 224
    .line 225
    .line 226
    invoke-interface {p1}, Lcom/kubi/quotefacade/api/IQuoteFacadeService;->i()Z

    .line 227
    move-result p1

    .line 228
    .line 229
    if-eqz p1, :cond_6

    .line 230
    .line 231
    sget-object p1, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Feed:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 232
    .line 233
    .line 234
    invoke-static {p1}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 235
    move-result p1

    .line 236
    .line 237
    if-eqz p1, :cond_6

    .line 238
    .line 239
    iget-object p1, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->X:Ljava/util/List;

    .line 240
    .line 241
    if-eqz p1, :cond_6

    .line 242
    .line 243
    new-instance v0, Lcom/kubi/quotefacade/entity/PageInfo;

    .line 244
    .line 245
    sget v1, Lcom/kubi/quotefacade/R$string;->kc_market_feed_tab:I

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 249
    move-result-object v1

    .line 250
    .line 251
    .line 252
    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->C3()Lcom/kubi/quotefacade/view/TabContainerFragment;

    .line 256
    move-result-object v2

    .line 257
    .line 258
    .line 259
    invoke-direct {v0, v1, v3, v2}, Lcom/kubi/quotefacade/entity/PageInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    .line 260
    .line 261
    .line 262
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    :cond_6
    sget-object p1, Lcom/kubi/quotefacade/service/a;->a:Lcom/kubi/quotefacade/service/a;

    .line 265
    .line 266
    .line 267
    invoke-virtual {p1}, Lcom/kubi/quotefacade/service/a;->a()Lcom/kubi/copytrading/ICopyTradingService;

    .line 268
    move-result-object v0

    .line 269
    .line 270
    .line 271
    invoke-interface {v0}, Lcom/kubi/copytrading/ICopyTradingService;->o()Z

    .line 272
    move-result v0

    .line 273
    .line 274
    if-eqz v0, :cond_8

    .line 275
    .line 276
    iget-object v0, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->X:Ljava/util/List;

    .line 277
    .line 278
    if-eqz v0, :cond_8

    .line 279
    .line 280
    .line 281
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 282
    move-result-object v1

    .line 283
    .line 284
    if-eqz v1, :cond_7

    .line 285
    .line 286
    const-string v2, "uiStateValue"

    .line 287
    .line 288
    .line 289
    invoke-static {v1, v2}, Lcom/kubi/router/utils/RouteExKt;->y(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 290
    move-result-object v5

    .line 291
    .line 292
    :cond_7
    new-instance v1, Lcom/kubi/quotefacade/entity/PageInfo;

    .line 293
    .line 294
    sget v2, Lcom/kubi/quotefacade/R$string;->copytd_copy_trading:I

    .line 295
    .line 296
    .line 297
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 298
    move-result-object v2

    .line 299
    .line 300
    .line 301
    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {p1}, Lcom/kubi/quotefacade/service/a;->a()Lcom/kubi/copytrading/ICopyTradingService;

    .line 305
    move-result-object p1

    .line 306
    .line 307
    const-string v3, "quotes"

    .line 308
    .line 309
    .line 310
    invoke-interface {p1, v5, v3}, Lcom/kubi/copytrading/ICopyTradingService;->k(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/BaseFragment;

    .line 311
    move-result-object p1

    .line 312
    .line 313
    const-string v3, "5"

    .line 314
    .line 315
    .line 316
    invoke-direct {v1, v2, v3, p1}, Lcom/kubi/quotefacade/entity/PageInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    .line 317
    .line 318
    .line 319
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    :cond_8
    sget-object p1, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->TradingBot:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 322
    .line 323
    new-instance v0, Lcom/kubi/quotefacade/g;

    .line 324
    .line 325
    .line 326
    invoke-direct {v0, p0}, Lcom/kubi/quotefacade/g;-><init>(Lcom/kubi/quotefacade/HomeMarketFragment;)V

    .line 327
    .line 328
    .line 329
    invoke-static {p1, v0}, Lcom/kubi/sdk/site/b;->e(Lcom/kubi/sdk/site/SiteVisibleConfigKey;Lkotlin/jvm/functions/Function0;)V

    .line 330
    return-void
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
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
.end method

.method public final O3(Landroid/view/View;)V
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x1

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p1, Lbv/d0;->d:Lcom/kubi/resources/widget/flyco/SlidingTabLayout;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->setNeedBold(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    iget-object p1, p1, Lbv/d0;->d:Lcom/kubi/resources/widget/flyco/SlidingTabLayout;

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->setUnderlineIgnorePadding(Z)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    const-string v1, "getChildFragmentManager(...)"

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    iget-object v1, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->X:Ljava/util/List;

    .line 39
    .line 40
    const/16 v2, 0xa

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    new-instance v3, Ljava/util/ArrayList;

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 48
    move-result v4

    .line 49
    .line 50
    .line 51
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    move-result v4

    .line 60
    .line 61
    if-eqz v4, :cond_3

    .line 62
    .line 63
    .line 64
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    move-result-object v4

    .line 66
    .line 67
    check-cast v4, Lcom/kubi/quotefacade/entity/PageInfo;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Lcom/kubi/quotefacade/entity/PageInfo;->getFragment()Landroidx/fragment/app/Fragment;

    .line 71
    move-result-object v4

    .line 72
    .line 73
    .line 74
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 75
    goto :goto_0

    .line 76
    .line 77
    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    .line 78
    .line 79
    .line 80
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 81
    .line 82
    :cond_3
    iget-object v1, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->X:Ljava/util/List;

    .line 83
    .line 84
    if-eqz v1, :cond_4

    .line 85
    .line 86
    new-instance v4, Ljava/util/ArrayList;

    .line 87
    .line 88
    .line 89
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 90
    move-result v2

    .line 91
    .line 92
    .line 93
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    move-result-object v1

    .line 98
    .line 99
    .line 100
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    move-result v2

    .line 102
    .line 103
    if-eqz v2, :cond_5

    .line 104
    .line 105
    .line 106
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    move-result-object v2

    .line 108
    .line 109
    check-cast v2, Lcom/kubi/quotefacade/entity/PageInfo;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Lcom/kubi/quotefacade/entity/PageInfo;->getPageTitle()Ljava/lang/String;

    .line 113
    move-result-object v2

    .line 114
    .line 115
    .line 116
    invoke-interface {v4, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 117
    goto :goto_1

    .line 118
    .line 119
    .line 120
    :cond_4
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 121
    move-result-object v4

    .line 122
    .line 123
    :cond_5
    new-instance v1, Lcom/kubi/utils/z;

    .line 124
    .line 125
    .line 126
    invoke-direct {v1, p1, v3, v4}, Lcom/kubi/utils/z;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;Ljava/util/List;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 130
    move-result-object p1

    .line 131
    .line 132
    if-eqz p1, :cond_6

    .line 133
    .line 134
    iget-object p1, p1, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 135
    .line 136
    if-eqz p1, :cond_6

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v1}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 140
    .line 141
    .line 142
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 143
    move-result-object p1

    .line 144
    const/4 v1, 0x0

    .line 145
    .line 146
    if-eqz p1, :cond_8

    .line 147
    .line 148
    iget-object p1, p1, Lbv/d0;->d:Lcom/kubi/resources/widget/flyco/SlidingTabLayout;

    .line 149
    .line 150
    if-eqz p1, :cond_8

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 154
    move-result-object v2

    .line 155
    .line 156
    if-eqz v2, :cond_7

    .line 157
    .line 158
    iget-object v2, v2, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 159
    goto :goto_2

    .line 160
    :cond_7
    move-object v2, v1

    .line 161
    .line 162
    .line 163
    :goto_2
    invoke-virtual {p1, v2}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 164
    .line 165
    .line 166
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 167
    move-result-object p1

    .line 168
    .line 169
    if-eqz p1, :cond_9

    .line 170
    .line 171
    iget-object p1, p1, Lbv/d0;->d:Lcom/kubi/resources/widget/flyco/SlidingTabLayout;

    .line 172
    .line 173
    if-eqz p1, :cond_9

    .line 174
    .line 175
    new-instance v2, Lcom/kubi/quotefacade/HomeMarketFragment$b;

    .line 176
    .line 177
    .line 178
    invoke-direct {v2, p0}, Lcom/kubi/quotefacade/HomeMarketFragment$b;-><init>(Lcom/kubi/quotefacade/HomeMarketFragment;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, v2}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->setOnTabSelectListener(Lww/b;)V

    .line 182
    .line 183
    :cond_9
    sget-object p1, Lcom/kubi/quotefacade/helper/h2;->a:Lcom/kubi/quotefacade/helper/h2;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1}, Lcom/kubi/quotefacade/helper/h2;->e()Z

    .line 187
    move-result v2

    .line 188
    .line 189
    const/high16 v3, 0x40800000    # 4.0f

    .line 190
    const/4 v4, -0x1

    .line 191
    .line 192
    if-eqz v2, :cond_a

    .line 193
    .line 194
    sget v2, Lcom/kubi/quotefacade/R$string;->quote_chain_tab_name:I

    .line 195
    .line 196
    .line 197
    invoke-direct {p0, v2}, Lcom/kubi/quotefacade/HomeMarketFragment;->K3(I)I

    .line 198
    move-result v2

    .line 199
    .line 200
    if-eq v2, v4, :cond_a

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 204
    move-result-object v5

    .line 205
    .line 206
    if-eqz v5, :cond_a

    .line 207
    .line 208
    iget-object v5, v5, Lbv/d0;->d:Lcom/kubi/resources/widget/flyco/SlidingTabLayout;

    .line 209
    .line 210
    if-eqz v5, :cond_a

    .line 211
    .line 212
    .line 213
    invoke-virtual {v5, v2}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->t(I)Landroid/widget/TextView;

    .line 214
    move-result-object v6

    .line 215
    .line 216
    if-eqz v6, :cond_a

    .line 217
    .line 218
    sget v7, Lcom/kubi/quotefacade/R$mipmap;->quote_ic_hot:I

    .line 219
    .line 220
    .line 221
    invoke-static {v3}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 222
    move-result v8

    .line 223
    const/4 v10, 0x4

    .line 224
    const/4 v11, 0x0

    .line 225
    const/4 v9, 0x0

    .line 226
    .line 227
    .line 228
    invoke-static/range {v6 .. v11}, Lcom/kubi/utils/extensions/k;->i(Landroid/widget/TextView;IIIILjava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    :cond_a
    invoke-virtual {p1}, Lcom/kubi/quotefacade/helper/h2;->d()Z

    .line 232
    move-result p1

    .line 233
    .line 234
    if-eqz p1, :cond_b

    .line 235
    .line 236
    sget p1, Lcom/kubi/quotefacade/R$string;->market_alpha:I

    .line 237
    .line 238
    .line 239
    invoke-direct {p0, p1}, Lcom/kubi/quotefacade/HomeMarketFragment;->K3(I)I

    .line 240
    move-result p1

    .line 241
    .line 242
    if-eq p1, v4, :cond_b

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 246
    move-result-object v2

    .line 247
    .line 248
    if-eqz v2, :cond_b

    .line 249
    .line 250
    iget-object v2, v2, Lbv/d0;->d:Lcom/kubi/resources/widget/flyco/SlidingTabLayout;

    .line 251
    .line 252
    if-eqz v2, :cond_b

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, p1}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->t(I)Landroid/widget/TextView;

    .line 256
    move-result-object v4

    .line 257
    .line 258
    if-eqz v4, :cond_b

    .line 259
    .line 260
    sget v5, Lcom/kubi/quotefacade/R$mipmap;->quote_ic_hot:I

    .line 261
    .line 262
    .line 263
    invoke-static {v3}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 264
    move-result v6

    .line 265
    const/4 v8, 0x4

    .line 266
    const/4 v9, 0x0

    .line 267
    const/4 v7, 0x0

    .line 268
    .line 269
    .line 270
    invoke-static/range {v4 .. v9}, Lcom/kubi/utils/extensions/k;->i(Landroid/widget/TextView;IIIILjava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    :cond_b
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 274
    move-result-object p1

    .line 275
    .line 276
    if-eqz p1, :cond_d

    .line 277
    .line 278
    iget-object p1, p1, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 279
    .line 280
    if-eqz p1, :cond_d

    .line 281
    .line 282
    iget-object v2, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->X:Ljava/util/List;

    .line 283
    .line 284
    if-eqz v2, :cond_c

    .line 285
    .line 286
    .line 287
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 288
    move-result v0

    .line 289
    .line 290
    .line 291
    :cond_c
    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 292
    .line 293
    .line 294
    :cond_d
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 295
    move-result-object p1

    .line 296
    .line 297
    if-eqz p1, :cond_f

    .line 298
    .line 299
    iget-object p1, p1, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 300
    .line 301
    if-eqz p1, :cond_f

    .line 302
    .line 303
    .line 304
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 305
    move-result-object v0

    .line 306
    .line 307
    if-eqz v0, :cond_e

    .line 308
    .line 309
    const-string v2, "type"

    .line 310
    .line 311
    .line 312
    invoke-static {v0, v2}, Lcom/kubi/router/utils/RouteExKt;->S(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;

    .line 313
    move-result-object v0

    .line 314
    goto :goto_3

    .line 315
    :cond_e
    move-object v0, v1

    .line 316
    .line 317
    .line 318
    :goto_3
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 319
    move-result v0

    .line 320
    .line 321
    .line 322
    invoke-virtual {p1, v0}, Lcom/kubi/resources/widget/CustomViewPager;->setCurrentItem(I)V

    .line 323
    .line 324
    :cond_f
    sget-object p1, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 325
    .line 326
    sget-object v0, Lcom/kubi/sdk/site/info/SiteInfoManager;->a:Lcom/kubi/sdk/site/info/SiteInfoManager;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 330
    move-result-object v0

    .line 331
    .line 332
    const-class v2, Lhv/c;

    .line 333
    .line 334
    .line 335
    invoke-virtual {p1, v2, v0}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 336
    move-result-object p1

    .line 337
    .line 338
    if-eqz p1, :cond_10

    .line 339
    .line 340
    check-cast p1, Lhv/c;

    .line 341
    .line 342
    .line 343
    invoke-interface {p1}, Lhv/c;->b()V

    .line 344
    goto :goto_4

    .line 345
    .line 346
    :cond_10
    sget-object p1, Lcom/kubi/quotefacade/helper/p2;->a:Lcom/kubi/quotefacade/helper/p2;

    .line 347
    .line 348
    .line 349
    invoke-virtual {p1}, Lcom/kubi/quotefacade/helper/p2;->g()Ly70/g;

    .line 350
    move-result-object p1

    .line 351
    const/4 v0, 0x0

    .line 352
    .line 353
    .line 354
    invoke-static {p1, v0}, Ly70/a;->d(Ly70/g;Z)Z

    .line 355
    move-result p1

    .line 356
    .line 357
    if-nez p1, :cond_11

    .line 358
    .line 359
    sget p1, Lcom/kubi/quotefacade/R$string;->discover_emotion_chance:I

    .line 360
    .line 361
    .line 362
    invoke-direct {p0, p1}, Lcom/kubi/quotefacade/HomeMarketFragment;->K3(I)I

    .line 363
    move-result p1

    .line 364
    .line 365
    if-ltz p1, :cond_11

    .line 366
    .line 367
    .line 368
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 369
    move-result-object v2

    .line 370
    .line 371
    if-eqz v2, :cond_11

    .line 372
    .line 373
    iget-object v2, v2, Lbv/d0;->d:Lcom/kubi/resources/widget/flyco/SlidingTabLayout;

    .line 374
    .line 375
    if-eqz v2, :cond_11

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2, p1, v0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->H(II)V

    .line 379
    .line 380
    .line 381
    :cond_11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 382
    move-result-object p1

    .line 383
    .line 384
    const-string v2, "getViewLifecycleOwner(...)"

    .line 385
    .line 386
    .line 387
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 388
    .line 389
    sget-object v2, Lcom/kubi/event/api/b;->a:Lcom/kubi/event/api/b;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v2}, Lcom/kubi/event/api/b;->a()Z

    .line 393
    move-result v2

    .line 394
    .line 395
    const-string v3, "gesture_status"

    .line 396
    .line 397
    if-eqz v2, :cond_12

    .line 398
    .line 399
    .line 400
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 401
    move-result v2

    .line 402
    .line 403
    :cond_12
    new-instance v2, Lcom/kubi/quotefacade/HomeMarketFragment$initViewPager$lambda$21$$inlined$bindFlowEvent$default$1;

    .line 404
    .line 405
    .line 406
    invoke-direct {v2, v3, v1, p0}, Lcom/kubi/quotefacade/HomeMarketFragment$initViewPager$lambda$21$$inlined$bindFlowEvent$default$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/quotefacade/HomeMarketFragment;)V

    .line 407
    .line 408
    .line 409
    invoke-static {p1, v0, v2}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 410
    .line 411
    .line 412
    :goto_4
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 413
    move-result-object p1

    .line 414
    .line 415
    if-eqz p1, :cond_13

    .line 416
    .line 417
    iget-object p1, p1, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 418
    .line 419
    if-eqz p1, :cond_13

    .line 420
    .line 421
    new-instance v0, Lcom/kubi/quotefacade/HomeMarketFragment$c;

    .line 422
    .line 423
    .line 424
    invoke-direct {v0, p0}, Lcom/kubi/quotefacade/HomeMarketFragment$c;-><init>(Lcom/kubi/quotefacade/HomeMarketFragment;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {p1, v0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 428
    :cond_13
    return-void
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
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
.end method

.method public final P3(Landroid/view/View;)V
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->a:Lcom/kubi/sdk/util/EdgeToEdgeCompat;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->j()I

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v1, v0, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 11
    .line 12
    sget v0, Lcom/kubi/quotefacade/R$color;->c_overlay:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 16
    move-result v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->c4()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget-object v0, p1, Lbv/d0;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    new-instance v3, Lcom/kubi/quotefacade/f;

    .line 35
    .line 36
    .line 37
    invoke-direct {v3, p0}, Lcom/kubi/quotefacade/f;-><init>(Lcom/kubi/quotefacade/HomeMarketFragment;)V

    .line 38
    const/4 v4, 0x1

    .line 39
    const/4 v5, 0x0

    .line 40
    .line 41
    const-wide/16 v1, 0x0

    .line 42
    .line 43
    .line 44
    invoke-static/range {v0 .. v5}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 45
    :cond_0
    return-void
.end method

.method public final T3()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/quotefacade/h;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/kubi/quotefacade/h;-><init>(Lcom/kubi/quotefacade/HomeMarketFragment;)V

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

.method public final V3()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->X:Ljava/util/List;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget v1, Lcom/kubi/quotefacade/R$string;->copytd_copy_trading:I

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, v1}, Lcom/kubi/quotefacade/HomeMarketFragment;->K3(I)I

    .line 10
    move-result v1

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Lcom/kubi/quotefacade/entity/PageInfo;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/kubi/quotefacade/entity/PageInfo;->getFragment()Landroidx/fragment/app/Fragment;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    sget-object v1, Lcom/kubi/quotefacade/service/a;->a:Lcom/kubi/quotefacade/service/a;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/kubi/quotefacade/service/a;->a()Lcom/kubi/copytrading/ICopyTradingService;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-interface {v1, v0}, Lcom/kubi/copytrading/ICopyTradingService;->r(Landroidx/fragment/app/Fragment;)V

    .line 34
    :cond_0
    return-void
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
.end method

.method public final W3()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/quotefacade/d;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/kubi/quotefacade/d;-><init>(Lcom/kubi/quotefacade/HomeMarketFragment;)V

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

.method public final Y3()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/quotefacade/c;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/kubi/quotefacade/c;-><init>(Lcom/kubi/quotefacade/HomeMarketFragment;)V

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

.method public final a4(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    .line 2
    const-string v0, "market"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v1, "index"

    .line 8
    .line 9
    .line 10
    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string p3, ""

    .line 13
    .line 14
    if-eqz p1, :cond_5

    .line 15
    const/4 v1, 0x1

    .line 16
    .line 17
    if-eq p1, v1, :cond_3

    .line 18
    const/4 v1, 0x2

    .line 19
    .line 20
    if-eq p1, v1, :cond_2

    .line 21
    .line 22
    sget-object p1, Lcom/kubi/quotefacade/helper/p2;->a:Lcom/kubi/quotefacade/helper/p2;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/kubi/quotefacade/helper/p2;->l()Ly70/g;

    .line 26
    move-result-object p1

    .line 27
    const/4 p3, 0x0

    .line 28
    .line 29
    .line 30
    invoke-static {p1, p3}, Ly70/a;->e(Ly70/g;I)I

    .line 31
    move-result p1

    .line 32
    .line 33
    sget p3, Lcom/kubi/quotefacade/R$string;->discover_emotion_chance:I

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, p3}, Lcom/kubi/quotefacade/HomeMarketFragment;->K3(I)I

    .line 37
    move-result p3

    .line 38
    .line 39
    if-ne p1, p3, :cond_0

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->B3()Landroidx/fragment/app/Fragment;

    .line 43
    move-result-object p3

    .line 44
    .line 45
    .line 46
    invoke-virtual {p3}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 47
    move-result-object p3

    .line 48
    .line 49
    if-eqz p3, :cond_0

    .line 50
    .line 51
    .line 52
    invoke-virtual {p3, v0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 56
    move-result-object p2

    .line 57
    .line 58
    if-eqz p2, :cond_1

    .line 59
    .line 60
    iget-object p2, p2, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 61
    .line 62
    if-eqz p2, :cond_1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2, p1}, Lcom/kubi/resources/widget/CustomViewPager;->setCurrentItem(I)V

    .line 66
    :cond_1
    return-void

    .line 67
    .line 68
    :cond_2
    sget-object p1, Lcom/kubi/quotefacade/constant/QuoteMainTab;->CHANCE:Lcom/kubi/quotefacade/constant/QuoteMainTab;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/kubi/quotefacade/constant/QuoteMainTab;->getType()Ljava/lang/String;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p1, p3, p3}, Lcom/kubi/quotefacade/HomeMarketFragment;->b4(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    return-void

    .line 77
    .line 78
    :cond_3
    const-string p1, "FAV"

    .line 79
    .line 80
    .line 81
    invoke-static {p1, p2, v1}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 82
    move-result p1

    .line 83
    .line 84
    const-string p2, "futures"

    .line 85
    .line 86
    if-eqz p1, :cond_4

    .line 87
    .line 88
    sget-object p1, Lcom/kubi/quotefacade/constant/QuoteMainTab;->FAV:Lcom/kubi/quotefacade/constant/QuoteMainTab;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/kubi/quotefacade/constant/QuoteMainTab;->getType()Ljava/lang/String;

    .line 92
    move-result-object p1

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/quotefacade/HomeMarketFragment;->b4(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    return-void

    .line 97
    .line 98
    :cond_4
    sget-object p1, Lcom/kubi/quotefacade/constant/QuoteMainTab;->MARKET:Lcom/kubi/quotefacade/constant/QuoteMainTab;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/kubi/quotefacade/constant/QuoteMainTab;->getType()Ljava/lang/String;

    .line 102
    move-result-object p1

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/quotefacade/HomeMarketFragment;->b4(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    return-void

    .line 107
    .line 108
    :cond_5
    sget-object p1, Lcom/kubi/quotefacade/constant/QuoteMainTab;->MARKET:Lcom/kubi/quotefacade/constant/QuoteMainTab;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Lcom/kubi/quotefacade/constant/QuoteMainTab;->getType()Ljava/lang/String;

    .line 112
    move-result-object p1

    .line 113
    .line 114
    const-string p2, "spot"

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/quotefacade/HomeMarketFragment;->b4(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    return-void
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

.method public final b4(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    .line 2
    const-string v0, "mainTab"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "subTab"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "info"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    sget-object v0, Lcom/kubi/quotefacade/constant/QuoteMainTab;->FAV:Lcom/kubi/quotefacade/constant/QuoteMainTab;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/kubi/quotefacade/constant/QuoteMainTab;->getType()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    move-result v0

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    iget-object p1, p1, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 36
    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    sget p3, Lcom/kubi/quotefacade/R$string;->favorites:I

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, p3}, Lcom/kubi/quotefacade/HomeMarketFragment;->K3(I)I

    .line 43
    move-result p3

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p3}, Lcom/kubi/resources/widget/CustomViewPager;->setCurrentItem(I)V

    .line 47
    .line 48
    :cond_0
    sget-object p1, Lav/b;->a:Lav/b;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p2}, Lav/b;->g(Ljava/lang/String;)V

    .line 52
    return-void

    .line 53
    .line 54
    :cond_1
    sget-object v0, Lcom/kubi/quotefacade/constant/QuoteMainTab;->MARKET:Lcom/kubi/quotefacade/constant/QuoteMainTab;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/kubi/quotefacade/constant/QuoteMainTab;->getType()Ljava/lang/String;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    move-result v0

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    if-eqz p1, :cond_a

    .line 71
    .line 72
    iget-object p1, p1, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 73
    .line 74
    if-eqz p1, :cond_a

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    if-eqz p1, :cond_a

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    if-eqz p1, :cond_2

    .line 87
    .line 88
    iget-object p1, p1, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 89
    .line 90
    if-eqz p1, :cond_2

    .line 91
    .line 92
    sget p3, Lcom/kubi/quotefacade/R$string;->market:I

    .line 93
    .line 94
    .line 95
    invoke-direct {p0, p3}, Lcom/kubi/quotefacade/HomeMarketFragment;->K3(I)I

    .line 96
    move-result p3

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p3}, Lcom/kubi/resources/widget/CustomViewPager;->setCurrentItem(I)V

    .line 100
    .line 101
    :cond_2
    sget-object p1, Lav/b;->a:Lav/b;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, p2}, Lav/b;->h(Ljava/lang/String;)V

    .line 105
    return-void

    .line 106
    .line 107
    :cond_3
    sget-object v0, Lcom/kubi/quotefacade/constant/QuoteMainTab;->ALPHA:Lcom/kubi/quotefacade/constant/QuoteMainTab;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Lcom/kubi/quotefacade/constant/QuoteMainTab;->getType()Ljava/lang/String;

    .line 111
    move-result-object v0

    .line 112
    .line 113
    .line 114
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    move-result v0

    .line 116
    .line 117
    if-eqz v0, :cond_5

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 121
    move-result-object p1

    .line 122
    .line 123
    if-eqz p1, :cond_a

    .line 124
    .line 125
    iget-object p1, p1, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 126
    .line 127
    if-eqz p1, :cond_a

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 131
    move-result-object p1

    .line 132
    .line 133
    if-eqz p1, :cond_a

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 137
    move-result-object p1

    .line 138
    .line 139
    if-eqz p1, :cond_4

    .line 140
    .line 141
    iget-object p1, p1, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 142
    .line 143
    if-eqz p1, :cond_4

    .line 144
    .line 145
    sget p3, Lcom/kubi/quotefacade/R$string;->market_alpha:I

    .line 146
    .line 147
    .line 148
    invoke-direct {p0, p3}, Lcom/kubi/quotefacade/HomeMarketFragment;->K3(I)I

    .line 149
    move-result p3

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, p3}, Lcom/kubi/resources/widget/CustomViewPager;->setCurrentItem(I)V

    .line 153
    .line 154
    :cond_4
    sget-object p1, Lav/b;->a:Lav/b;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, p2}, Lav/b;->h(Ljava/lang/String;)V

    .line 158
    return-void

    .line 159
    .line 160
    :cond_5
    sget-object v0, Lcom/kubi/quotefacade/constant/QuoteMainTab;->KRAZY_DEGEN:Lcom/kubi/quotefacade/constant/QuoteMainTab;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Lcom/kubi/quotefacade/constant/QuoteMainTab;->getType()Ljava/lang/String;

    .line 164
    move-result-object v0

    .line 165
    .line 166
    .line 167
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    move-result v0

    .line 169
    .line 170
    if-eqz v0, :cond_6

    .line 171
    .line 172
    sget p1, Lcom/kubi/quotefacade/R$string;->quote_chain_tab_name:I

    .line 173
    .line 174
    .line 175
    invoke-direct {p0, p1}, Lcom/kubi/quotefacade/HomeMarketFragment;->K3(I)I

    .line 176
    move-result p1

    .line 177
    const/4 p2, -0x1

    .line 178
    .line 179
    if-eq p1, p2, :cond_a

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 183
    move-result-object p2

    .line 184
    .line 185
    if-eqz p2, :cond_a

    .line 186
    .line 187
    iget-object p2, p2, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 188
    .line 189
    if-eqz p2, :cond_a

    .line 190
    .line 191
    .line 192
    invoke-virtual {p2, p1}, Lcom/kubi/resources/widget/CustomViewPager;->setCurrentItem(I)V

    .line 193
    return-void

    .line 194
    .line 195
    :cond_6
    sget-object v0, Lcom/kubi/quotefacade/constant/QuoteMainTab;->CHANCE:Lcom/kubi/quotefacade/constant/QuoteMainTab;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Lcom/kubi/quotefacade/constant/QuoteMainTab;->getType()Ljava/lang/String;

    .line 199
    move-result-object v0

    .line 200
    .line 201
    .line 202
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    move-result v0

    .line 204
    .line 205
    if-eqz v0, :cond_8

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 209
    move-result-object p1

    .line 210
    .line 211
    if-eqz p1, :cond_7

    .line 212
    .line 213
    iget-object p1, p1, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 214
    .line 215
    if-eqz p1, :cond_7

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 219
    move-result-object p1

    .line 220
    .line 221
    if-eqz p1, :cond_7

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 225
    move-result-object p1

    .line 226
    .line 227
    if-eqz p1, :cond_7

    .line 228
    .line 229
    iget-object p1, p1, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 230
    .line 231
    if-eqz p1, :cond_7

    .line 232
    .line 233
    sget v0, Lcom/kubi/quotefacade/R$string;->discover_emotion_chance:I

    .line 234
    .line 235
    .line 236
    invoke-direct {p0, v0}, Lcom/kubi/quotefacade/HomeMarketFragment;->K3(I)I

    .line 237
    move-result v0

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1, v0}, Lcom/kubi/resources/widget/CustomViewPager;->setCurrentItem(I)V

    .line 241
    .line 242
    :cond_7
    sget-object p1, Lav/b;->a:Lav/b;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, p2}, Lav/b;->f(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->B3()Landroidx/fragment/app/Fragment;

    .line 249
    move-result-object p1

    .line 250
    .line 251
    .line 252
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 253
    move-result-object p1

    .line 254
    .line 255
    if-eqz p1, :cond_a

    .line 256
    .line 257
    const-string p2, "market"

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1, p2, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    return-void

    .line 262
    .line 263
    :cond_8
    sget-object p2, Lcom/kubi/quotefacade/constant/QuoteMainTab;->COPY_TRADING:Lcom/kubi/quotefacade/constant/QuoteMainTab;

    .line 264
    .line 265
    .line 266
    invoke-virtual {p2}, Lcom/kubi/quotefacade/constant/QuoteMainTab;->getType()Ljava/lang/String;

    .line 267
    move-result-object p2

    .line 268
    .line 269
    .line 270
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 271
    move-result p1

    .line 272
    .line 273
    if-eqz p1, :cond_9

    .line 274
    .line 275
    sget-object p1, Lcom/kubi/quotefacade/service/a;->a:Lcom/kubi/quotefacade/service/a;

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1}, Lcom/kubi/quotefacade/service/a;->a()Lcom/kubi/copytrading/ICopyTradingService;

    .line 279
    move-result-object p1

    .line 280
    .line 281
    .line 282
    invoke-interface {p1}, Lcom/kubi/copytrading/ICopyTradingService;->o()Z

    .line 283
    move-result p1

    .line 284
    .line 285
    if-eqz p1, :cond_a

    .line 286
    .line 287
    .line 288
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 289
    move-result-object p1

    .line 290
    .line 291
    if-eqz p1, :cond_a

    .line 292
    .line 293
    iget-object p1, p1, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 294
    .line 295
    if-eqz p1, :cond_a

    .line 296
    .line 297
    .line 298
    invoke-virtual {p1}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 299
    move-result-object p1

    .line 300
    .line 301
    if-eqz p1, :cond_a

    .line 302
    .line 303
    .line 304
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 305
    move-result-object p1

    .line 306
    .line 307
    if-eqz p1, :cond_a

    .line 308
    .line 309
    iget-object p1, p1, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 310
    .line 311
    if-eqz p1, :cond_a

    .line 312
    .line 313
    sget p2, Lcom/kubi/quotefacade/R$string;->copytd_copy_trading:I

    .line 314
    .line 315
    .line 316
    invoke-direct {p0, p2}, Lcom/kubi/quotefacade/HomeMarketFragment;->K3(I)I

    .line 317
    move-result p2

    .line 318
    .line 319
    .line 320
    invoke-virtual {p1, p2}, Lcom/kubi/resources/widget/CustomViewPager;->setCurrentItem(I)V

    .line 321
    return-void

    .line 322
    .line 323
    :cond_9
    sget-object p1, Lcom/kubi/quotefacade/helper/p2;->a:Lcom/kubi/quotefacade/helper/p2;

    .line 324
    .line 325
    .line 326
    invoke-virtual {p1}, Lcom/kubi/quotefacade/helper/p2;->l()Ly70/g;

    .line 327
    move-result-object p1

    .line 328
    const/4 p2, 0x0

    .line 329
    .line 330
    .line 331
    invoke-static {p1, p2}, Ly70/a;->e(Ly70/g;I)I

    .line 332
    move-result p1

    .line 333
    .line 334
    .line 335
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 336
    move-result-object p2

    .line 337
    .line 338
    if-eqz p2, :cond_a

    .line 339
    .line 340
    iget-object p2, p2, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 341
    .line 342
    if-eqz p2, :cond_a

    .line 343
    .line 344
    .line 345
    invoke-virtual {p2, p1}, Lcom/kubi/resources/widget/CustomViewPager;->setCurrentItem(I)V

    .line 346
    :cond_a
    return-void
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
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
.end method

.method public final c4()V
    .locals 18

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    sget-object v1, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->MarketWidget:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 13
    move-result v1

    .line 14
    .line 15
    sget-object v2, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->IntelligentMonitoring:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 19
    move-result v2

    .line 20
    .line 21
    iget-object v3, v0, Lbv/d0;->c:Landroid/widget/ImageView;

    .line 22
    .line 23
    const/16 v4, 0x8

    .line 24
    const/4 v5, 0x0

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    move v6, v5

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v6, v4

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-virtual {v3, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 33
    .line 34
    iget-object v3, v0, Lbv/d0;->b:Landroid/widget/ImageView;

    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    move v4, v5

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 41
    .line 42
    iget-object v3, v0, Lbv/d0;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 43
    .line 44
    const-string v4, "tvSearch"

    .line 45
    .line 46
    .line 47
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 51
    move-result-object v4

    .line 52
    .line 53
    if-eqz v4, :cond_5

    .line 54
    .line 55
    check-cast v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 56
    .line 57
    if-nez v1, :cond_3

    .line 58
    .line 59
    if-nez v2, :cond_3

    .line 60
    .line 61
    const/high16 v1, 0x41800000    # 16.0f

    .line 62
    .line 63
    .line 64
    invoke-static {v1}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 65
    move-result v5

    .line 66
    .line 67
    .line 68
    :cond_3
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 72
    .line 73
    if-eqz v2, :cond_4

    .line 74
    .line 75
    .line 76
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->L3()V

    .line 77
    .line 78
    :cond_4
    iget-object v6, v0, Lbv/d0;->c:Landroid/widget/ImageView;

    .line 79
    .line 80
    const-string v1, "ivBack"

    .line 81
    .line 82
    .line 83
    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    new-instance v9, Lcom/kubi/quotefacade/m;

    .line 86
    .line 87
    .line 88
    invoke-direct {v9}, Lcom/kubi/quotefacade/m;-><init>()V

    .line 89
    const/4 v10, 0x1

    .line 90
    const/4 v11, 0x0

    .line 91
    .line 92
    const-wide/16 v7, 0x0

    .line 93
    .line 94
    .line 95
    invoke-static/range {v6 .. v11}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 96
    .line 97
    iget-object v12, v0, Lbv/d0;->b:Landroid/widget/ImageView;

    .line 98
    .line 99
    const-string v0, "ivAlert"

    .line 100
    .line 101
    .line 102
    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    new-instance v15, Lcom/kubi/quotefacade/b;

    .line 105
    .line 106
    move-object/from16 v0, p0

    .line 107
    .line 108
    .line 109
    invoke-direct {v15, v0}, Lcom/kubi/quotefacade/b;-><init>(Lcom/kubi/quotefacade/HomeMarketFragment;)V

    .line 110
    .line 111
    const/16 v16, 0x1

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const-wide/16 v13, 0x0

    .line 116
    .line 117
    .line 118
    invoke-static/range {v12 .. v17}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 119
    return-void

    .line 120
    .line 121
    :cond_5
    move-object/from16 v0, p0

    .line 122
    .line 123
    new-instance v1, Ljava/lang/NullPointerException;

    .line 124
    .line 125
    const-string v2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"

    .line 126
    .line 127
    .line 128
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 129
    throw v1
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

.method public final f4(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->U:Lzw/a;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    const/4 p1, -0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-interface {v0, p1}, Lzw/a;->b(I)Lzw/a;

    .line 13
    :cond_1
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

.method public getLayout()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/quotefacade/R$layout;->kucoin_layout_home_market_switch_fragmentbar:I

    .line 3
    return v0
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

.method public lazyLoad()V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->lazyLoad()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    const-string v1, "mainTab"

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/kubi/router/utils/RouteExKt;->a0(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v0, v2

    .line 25
    .line 26
    :goto_0
    const-string v3, ""

    .line 27
    .line 28
    if-eqz v0, :cond_7

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 32
    move-result v0

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    goto/16 :goto_3

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v1}, Lcom/kubi/router/utils/RouteExKt;->a0(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    move-result-object v0

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move-object v0, v2

    .line 55
    .line 56
    .line 57
    :goto_1
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 62
    move-result-object v4

    .line 63
    .line 64
    const-string v5, "subTab"

    .line 65
    .line 66
    if-eqz v4, :cond_3

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 70
    move-result-object v4

    .line 71
    .line 72
    if-eqz v4, :cond_3

    .line 73
    .line 74
    .line 75
    invoke-static {v4, v5}, Lcom/kubi/router/utils/RouteExKt;->a0(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    move-result-object v4

    .line 77
    goto :goto_2

    .line 78
    :cond_3
    move-object v4, v2

    .line 79
    .line 80
    .line 81
    :goto_2
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    move-result-object v4

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 86
    move-result-object v6

    .line 87
    .line 88
    const-string v7, "info"

    .line 89
    .line 90
    if-eqz v6, :cond_4

    .line 91
    .line 92
    .line 93
    invoke-virtual {v6}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 94
    move-result-object v6

    .line 95
    .line 96
    if-eqz v6, :cond_4

    .line 97
    .line 98
    .line 99
    invoke-static {v6, v7}, Lcom/kubi/router/utils/RouteExKt;->a0(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    move-result-object v2

    .line 101
    .line 102
    .line 103
    :cond_4
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    move-result-object v2

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v0, v4, v2}, Lcom/kubi/quotefacade/HomeMarketFragment;->b4(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 111
    move-result-object v0

    .line 112
    .line 113
    if-eqz v0, :cond_5

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    if-eqz v0, :cond_5

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 123
    .line 124
    .line 125
    :cond_5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    if-eqz v0, :cond_6

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 132
    move-result-object v0

    .line 133
    .line 134
    if-eqz v0, :cond_6

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v5, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 138
    .line 139
    .line 140
    :cond_6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 141
    move-result-object v0

    .line 142
    .line 143
    if-eqz v0, :cond_d

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 147
    move-result-object v0

    .line 148
    .line 149
    if-eqz v0, :cond_d

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v7, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 153
    .line 154
    goto/16 :goto_6

    .line 155
    .line 156
    .line 157
    :cond_7
    :goto_3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 158
    move-result-object v0

    .line 159
    .line 160
    const-string v1, "type"

    .line 161
    .line 162
    if-eqz v0, :cond_8

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 166
    move-result-object v0

    .line 167
    .line 168
    if-eqz v0, :cond_8

    .line 169
    .line 170
    .line 171
    invoke-static {v0, v1}, Lcom/kubi/router/utils/RouteExKt;->R(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    .line 172
    move-result-object v0

    .line 173
    goto :goto_4

    .line 174
    :cond_8
    move-object v0, v2

    .line 175
    :goto_4
    const/4 v4, -0x1

    .line 176
    .line 177
    .line 178
    invoke-static {v0, v4}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 179
    move-result v0

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 183
    move-result-object v4

    .line 184
    .line 185
    const-string v5, "market"

    .line 186
    .line 187
    if-eqz v4, :cond_9

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 191
    move-result-object v4

    .line 192
    .line 193
    if-eqz v4, :cond_9

    .line 194
    .line 195
    .line 196
    invoke-static {v4, v5}, Lcom/kubi/router/utils/RouteExKt;->a0(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;

    .line 197
    move-result-object v4

    .line 198
    goto :goto_5

    .line 199
    :cond_9
    move-object v4, v2

    .line 200
    .line 201
    .line 202
    :goto_5
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 203
    move-result-object v4

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 207
    move-result-object v6

    .line 208
    .line 209
    const-string v7, "index"

    .line 210
    .line 211
    if-eqz v6, :cond_a

    .line 212
    .line 213
    .line 214
    invoke-virtual {v6}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 215
    move-result-object v6

    .line 216
    .line 217
    if-eqz v6, :cond_a

    .line 218
    .line 219
    .line 220
    invoke-static {v6, v7}, Lcom/kubi/router/utils/RouteExKt;->a0(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;

    .line 221
    move-result-object v2

    .line 222
    .line 223
    .line 224
    :cond_a
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 225
    move-result-object v2

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, v0, v4, v2}, Lcom/kubi/quotefacade/HomeMarketFragment;->a4(ILjava/lang/String;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 232
    move-result-object v0

    .line 233
    .line 234
    if-eqz v0, :cond_b

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 238
    move-result-object v0

    .line 239
    .line 240
    if-eqz v0, :cond_b

    .line 241
    .line 242
    const-string v2, "-1"

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 246
    .line 247
    .line 248
    :cond_b
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 249
    move-result-object v0

    .line 250
    .line 251
    if-eqz v0, :cond_c

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 255
    move-result-object v0

    .line 256
    .line 257
    if-eqz v0, :cond_c

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v5, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 261
    .line 262
    .line 263
    :cond_c
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 264
    move-result-object v0

    .line 265
    .line 266
    if-eqz v0, :cond_d

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 270
    move-result-object v0

    .line 271
    .line 272
    if-eqz v0, :cond_d

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0, v7, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 276
    .line 277
    .line 278
    :cond_d
    :goto_6
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->D3()V

    .line 279
    return-void
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
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
.end method

.method public onArguments(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/kubi/sdk/BaseFragment;->onArguments(Landroid/os/Bundle;)V

    .line 4
    .line 5
    const-string v0, "mainTab"

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lcom/kubi/router/utils/RouteExKt;->b0(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v2, v1

    .line 15
    .line 16
    :goto_0
    if-eqz v2, :cond_5

    .line 17
    .line 18
    .line 19
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 20
    move-result v2

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    goto :goto_3

    .line 24
    .line 25
    :cond_1
    if-eqz p1, :cond_2

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v0}, Lcom/kubi/router/utils/RouteExKt;->b0(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    goto :goto_1

    .line 31
    :cond_2
    move-object v0, v1

    .line 32
    .line 33
    .line 34
    :goto_1
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    const-string v2, "subTab"

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v2}, Lcom/kubi/router/utils/RouteExKt;->b0(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    move-result-object v2

    .line 44
    goto :goto_2

    .line 45
    :cond_3
    move-object v2, v1

    .line 46
    .line 47
    .line 48
    :goto_2
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    move-result-object v2

    .line 50
    .line 51
    if-eqz p1, :cond_4

    .line 52
    .line 53
    const-string v1, "info"

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v1}, Lcom/kubi/router/utils/RouteExKt;->b0(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    .line 60
    :cond_4
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    move-result-object v1

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v0, v2, v1}, Lcom/kubi/quotefacade/HomeMarketFragment;->b4(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    goto :goto_6

    .line 66
    .line 67
    :cond_5
    :goto_3
    if-eqz p1, :cond_6

    .line 68
    .line 69
    const-string v0, "type"

    .line 70
    .line 71
    .line 72
    invoke-static {p1, v0}, Lcom/kubi/router/utils/RouteExKt;->S(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;

    .line 73
    move-result-object v0

    .line 74
    goto :goto_4

    .line 75
    :cond_6
    move-object v0, v1

    .line 76
    :goto_4
    const/4 v2, -0x1

    .line 77
    .line 78
    .line 79
    invoke-static {v0, v2}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 80
    move-result v0

    .line 81
    .line 82
    if-eqz p1, :cond_7

    .line 83
    .line 84
    const-string v2, "market"

    .line 85
    .line 86
    .line 87
    invoke-static {p1, v2}, Lcom/kubi/router/utils/RouteExKt;->b0(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    move-result-object v2

    .line 89
    goto :goto_5

    .line 90
    :cond_7
    move-object v2, v1

    .line 91
    .line 92
    .line 93
    :goto_5
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    move-result-object v2

    .line 95
    .line 96
    if-eqz p1, :cond_8

    .line 97
    .line 98
    const-string v1, "index"

    .line 99
    .line 100
    .line 101
    invoke-static {p1, v1}, Lcom/kubi/router/utils/RouteExKt;->b0(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    move-result-object v1

    .line 103
    .line 104
    .line 105
    :cond_8
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    move-result-object v1

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v0, v2, v1}, Lcom/kubi/quotefacade/HomeMarketFragment;->a4(ILjava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    :goto_6
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->CopyTrading:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 112
    .line 113
    new-instance v1, Lcom/kubi/quotefacade/a;

    .line 114
    .line 115
    .line 116
    invoke-direct {v1, p1}, Lcom/kubi/quotefacade/a;-><init>(Landroid/os/Bundle;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v0, v1}, Lcom/kubi/sdk/site/b;->e(Lcom/kubi/sdk/site/SiteVisibleConfigKey;Lkotlin/jvm/functions/Function0;)V

    .line 120
    return-void
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

.method public onDestroyView()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->I3()Lbv/d0;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lbv/d0;->f:Lcom/kubi/quotefacade/view/QuoteViewPager;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 15
    .line 16
    :cond_0
    iput-object v1, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->X:Ljava/util/List;

    .line 17
    .line 18
    iput-object v1, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->Z:Landroidx/fragment/app/Fragment;

    .line 19
    .line 20
    iput-object v1, p0, Lcom/kubi/quotefacade/HomeMarketFragment;->a0:Lcom/kubi/quotefacade/view/TabContainerFragment;

    .line 21
    .line 22
    .line 23
    invoke-super {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->onDestroyView()V

    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public onLoad()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/BaseFragment;->onLoad()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Futures:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/quotefacade/e;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/kubi/quotefacade/e;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/kubi/sdk/site/b;->e(Lcom/kubi/sdk/site/SiteVisibleConfigKey;Lkotlin/jvm/functions/Function0;)V

    .line 14
    return-void
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

.method public onShow()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/BaseFragment;->onShow()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/quotefacade/HomeMarketFragment;->T3()V

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

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "view"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1, p2}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/kubi/quotefacade/HomeMarketFragment;->P3(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/kubi/quotefacade/HomeMarketFragment;->M3(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lcom/kubi/quotefacade/HomeMarketFragment;->O3(Landroid/view/View;)V

    .line 18
    return-void
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
