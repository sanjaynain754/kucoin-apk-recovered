.class public final Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;
.super Lcom/kubi/mvi/state/l;
.source "AssetOnGoingViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/mvi/state/l<",
        "Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0094@\u00a2\u0006\u0002\u0010!J\u0018\u0010\"\u001a\u00020\u001e2\u0008\u0008\u0002\u0010#\u001a\u00020\nH\u0082@\u00a2\u0006\u0002\u0010$J\u0008\u0010%\u001a\u00020\u001eH\u0002J\u001c\u0010&\u001a\u00020\u001e2\u0008\u0010\'\u001a\u0004\u0018\u00010\u00192\u0008\u0008\u0002\u0010#\u001a\u00020\nH\u0002J&\u0010(\u001a\u00020\u001e2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020,0+H\u0002J\u001e\u0010-\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020\u00192\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020,0+H\u0002J\u001e\u0010.\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020\u00192\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020,0+H\u0002J\u001e\u0010/\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020\u00192\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020,0+H\u0002J\u001e\u00100\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020\u00192\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020,0+H\u0002J\u001e\u00101\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020\u00192\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020,0+H\u0002J\u0018\u00102\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\nH\u0002J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0002J\u0008\u00107\u001a\u000204H\u0002J\u0018\u00108\u001a\u00020\u001e2\u0006\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\nH\u0002J\u0008\u0010;\u001a\u00020\u001eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u000c\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0012\u001a\u0004\u0008\u0015\u0010\u0016R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010<\u001a\u00020\u00028TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008=\u0010>\u00a8\u0006?"
    }
    d2 = {
        "Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;",
        "Lcom/kubi/mvi/state/SimpleStateVM;",
        "Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;",
        "<init>",
        "()V",
        "protocolScope",
        "Lcom/kubi/assets/utils/ParentCoroutineScope;",
        "hashMap",
        "Ljava/util/HashMap;",
        "",
        "",
        "Lkotlin/collections/HashMap;",
        "api",
        "Lcom/kubi/assets/AssetV2Api;",
        "kotlin.jvm.PlatformType",
        "getApi",
        "()Lcom/kubi/assets/AssetV2Api;",
        "api$delegate",
        "Lkotlin/Lazy;",
        "restfulApi",
        "Lcom/kubi/assets/IRestfulApi;",
        "getRestfulApi",
        "()Lcom/kubi/assets/IRestfulApi;",
        "restfulApi$delegate",
        "originalData",
        "Lcom/kubi/assets/entity/OnGoingEntity;",
        "positionData",
        "",
        "Lcom/kubi/kumex/entity/PositionWrapperEntity;",
        "dispatchIntentOnIO",
        "",
        "intent",
        "Lcom/kubi/mvi/state/IIntent;",
        "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "handleOnGoingData",
        "isSubscribe",
        "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "contractSubscription",
        "updateProducts",
        "apiData",
        "updateContractData",
        "data",
        "items",
        "",
        "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;",
        "updateLeverData",
        "updateRobotData",
        "updateFinancialData",
        "updateCopyTradingData",
        "updateLeadTradingData",
        "handleSubscribe",
        "subscribeLeverageData",
        "Lkotlinx/coroutines/Job;",
        "symbols",
        "",
        "startTimer",
        "handleTitleClickEvent",
        "subType",
        "isExpanded",
        "onHide",
        "initState",
        "getInitState",
        "()Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;",
        "AssetsCenterLib_googleRelease"
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
        "SMAP\nAssetOnGoingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOnGoingViewModel.kt\ncom/kubi/assets/overview/ongoing/AssetOnGoingViewModel\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,432:1\n25#2:433\n26#2:435\n1#3:434\n1#3:436\n1563#4:437\n1634#4,3:438\n1563#4:441\n1634#4,3:442\n1563#4:445\n1634#4,3:446\n1563#4:449\n1634#4,3:450\n1563#4:453\n1634#4,3:454\n1563#4:457\n1634#4,3:458\n1563#4:461\n1634#4,3:462\n*S KotlinDebug\n*F\n+ 1 AssetOnGoingViewModel.kt\ncom/kubi/assets/overview/ongoing/AssetOnGoingViewModel\n*L\n103#1:433\n103#1:435\n103#1:434\n197#1:437\n197#1:438,3\n225#1:441\n225#1:442,3\n232#1:445\n232#1:446,3\n261#1:449\n261#1:450,3\n290#1:453\n290#1:454,3\n315#1:457\n315#1:458,3\n345#1:461\n345#1:462,3\n*E\n"
    }
.end annotation


# instance fields
.field public final W:Llb/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public X:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Y:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Z:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public a0:Lcom/kubi/assets/entity/OnGoingEntity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public b0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/kumex/entity/PositionWrapperEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/mvi/state/l;-><init>()V

    .line 4
    .line 5
    new-instance v0, Llb/f;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Llb/f;-><init>(Lkotlin/coroutines/CoroutineContext;)V

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->W:Llb/f;

    .line 15
    .line 16
    new-instance v0, Ljava/util/HashMap;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 20
    .line 21
    iput-object v0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->X:Ljava/util/HashMap;

    .line 22
    .line 23
    new-instance v0, Lcom/kubi/assets/overview/ongoing/q;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Lcom/kubi/assets/overview/ongoing/q;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    iput-object v0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->Y:Lkotlin/Lazy;

    .line 33
    .line 34
    new-instance v0, Lcom/kubi/assets/overview/ongoing/r;

    .line 35
    .line 36
    .line 37
    invoke-direct {v0}, Lcom/kubi/assets/overview/ongoing/r;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    iput-object v0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->Z:Lkotlin/Lazy;

    .line 44
    return-void
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
.end method

.method public static final A(Lcom/kubi/mvi/state/d;Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;)Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;
    .locals 6

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    check-cast p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UiIntent$HideOrShowNumber;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UiIntent$HideOrShowNumber;->isChecked()Z

    .line 11
    move-result v3

    .line 12
    const/4 v4, 0x3

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    move-object v0, p1

    .line 17
    .line 18
    .line 19
    invoke-static/range {v0 .. v5}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;->copy$default(Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;Ljava/util/List;Ljava/lang/Boolean;ZILjava/lang/Object;)Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;

    .line 20
    move-result-object p0

    .line 21
    return-object p0
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
.end method

.method private final B()Lcom/kubi/assets/h0;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->Y:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/assets/h0;

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
.end method

.method private final D()Lcom/kubi/assets/y0;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->Z:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/assets/y0;

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
.end method

.method public static synthetic F(Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p4, 0x1

    .line 2
    and-int/2addr p3, p4

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    move p1, p4

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->E(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 9
    move-result-object p0

    .line 10
    return-object p0
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
.end method

.method public static final G(Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->z()V

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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
.end method

.method public static final I(Lcom/kubi/margin/api/entity/MarginPosition;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/assets/overview/ongoing/z;->a:Lcom/kubi/assets/overview/ongoing/z;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Lcom/kubi/assets/overview/ongoing/z;->a(Lcom/kubi/margin/api/entity/MarginPosition;)Ljava/lang/String;

    .line 11
    move-result-object p0

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
.end method

.method private static final K()Lcom/kubi/assets/y0;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/network/restful/b$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/network/restful/b$a;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lgr/b;

    .line 8
    .line 9
    const-string v2, "network/channel_default"

    .line 10
    .line 11
    .line 12
    invoke-static {v2}, Ler/b;->e(Ljava/lang/String;)Ler/a;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v2}, Lgr/b;-><init>(Ler/a;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/kubi/network/restful/b$a;->b(Lkr/b;)Lcom/kubi/network/restful/b$a;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    new-instance v1, Lgr/h;

    .line 23
    .line 24
    .line 25
    invoke-direct {v1}, Lgr/h;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/kubi/network/restful/b$a;->c(Lkr/d;)Lcom/kubi/network/restful/b$a;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/kubi/network/restful/b$a;->a()Lcom/kubi/network/restful/b;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    const-class v1, Lcom/kubi/assets/y0;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/kubi/network/restful/b;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    check-cast v0, Lcom/kubi/assets/y0;

    .line 42
    return-object v0
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
.end method

.method public static final T(Ljava/util/List;Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;)Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;
    .locals 7

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v5, 0x6

    .line 7
    const/4 v6, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    move-object v2, p0

    .line 11
    move-object v1, p1

    .line 12
    .line 13
    .line 14
    invoke-static/range {v1 .. v6}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;->copy$default(Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;Ljava/util/List;Ljava/lang/Boolean;ZILjava/lang/Object;)Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;

    .line 15
    move-result-object p0

    .line 16
    return-object p0
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
.end method

.method public static final U(Ljava/util/List;Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;)Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;
    .locals 7

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v5, 0x6

    .line 7
    const/4 v6, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    move-object v2, p0

    .line 11
    move-object v1, p1

    .line 12
    .line 13
    .line 14
    invoke-static/range {v1 .. v6}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;->copy$default(Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;Ljava/util/List;Ljava/lang/Boolean;ZILjava/lang/Object;)Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;

    .line 15
    move-result-object p0

    .line 16
    return-object p0
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
.end method

.method public static synthetic b(Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->G(Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;)Lkotlin/Unit;

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
.end method

.method public static synthetic d(Lcom/kubi/mvi/state/d;Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;)Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->A(Lcom/kubi/mvi/state/d;Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;)Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;

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
.end method

.method public static synthetic e(Lcom/kubi/margin/api/entity/MarginPosition;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->I(Lcom/kubi/margin/api/entity/MarginPosition;)Ljava/lang/CharSequence;

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
.end method

.method public static synthetic f(Ljava/util/List;Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;)Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->U(Ljava/util/List;Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;)Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;

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
.end method

.method public static synthetic n()Lcom/kubi/assets/h0;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->y()Lcom/kubi/assets/h0;

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
.end method

.method public static synthetic o()Lcom/kubi/assets/y0;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->K()Lcom/kubi/assets/y0;

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
.end method

.method public static synthetic p(Ljava/util/List;Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;)Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->T(Ljava/util/List;Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;)Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;

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
.end method

.method public static final synthetic q(Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;)Lcom/kubi/assets/entity/OnGoingEntity;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->a0:Lcom/kubi/assets/entity/OnGoingEntity;

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
.end method

.method public static final synthetic r(Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;)Llb/f;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->W:Llb/f;

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
.end method

.method public static final synthetic s(Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;)Lcom/kubi/assets/y0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->D()Lcom/kubi/assets/y0;

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
.end method

.method public static final synthetic t(Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->E(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    .line 212
    .line 213
    .line 214
.end method

.method public static final synthetic u(Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;Lcom/kubi/assets/entity/OnGoingEntity;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->a0:Lcom/kubi/assets/entity/OnGoingEntity;

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
.end method

.method public static final synthetic v(Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;Ljava/util/List;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->b0:Ljava/util/List;

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
.end method

.method public static final synthetic w(Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;Lcom/kubi/assets/entity/OnGoingEntity;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->S(Lcom/kubi/assets/entity/OnGoingEntity;Z)V

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
.end method

.method public static final synthetic x(Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;Lkotlin/jvm/functions/Function1;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

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
.end method

.method private static final y()Lcom/kubi/assets/h0;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->c()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Lcom/kubi/assets/h0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lcom/kubi/assets/h0;

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
.end method


# virtual methods
.method public C()Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;

    .line 3
    const/4 v4, 0x7

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;-><init>(Ljava/util/List;Ljava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    return-object v0
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
.end method

.method public final E(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$handleOnGoingData$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$handleOnGoingData$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$handleOnGoingData$1;->label:I

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
    iput v1, v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$handleOnGoingData$1;->label:I

    .line 19
    :goto_0
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$handleOnGoingData$1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$handleOnGoingData$1;-><init>(Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;Lkotlin/coroutines/Continuation;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object p2, v4, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$handleOnGoingData$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget v1, v4, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$handleOnGoingData$1;->label:I

    .line 35
    const/4 v2, 0x1

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    if-ne v1, v2, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    goto :goto_2

    .line 44
    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    throw p1

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    iget-object p2, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->W:Llb/f;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2}, Llb/f;->close()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->L()Lkotlinx/coroutines/x1;

    .line 65
    .line 66
    sget-object p2, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Futures:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 67
    .line 68
    new-instance v1, Lcom/kubi/assets/overview/ongoing/v;

    .line 69
    .line 70
    .line 71
    invoke-direct {v1, p0}, Lcom/kubi/assets/overview/ongoing/v;-><init>(Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;)V

    .line 72
    .line 73
    .line 74
    invoke-static {p2, v1}, Lcom/kubi/sdk/site/b;->e(Lcom/kubi/sdk/site/SiteVisibleConfigKey;Lkotlin/jvm/functions/Function0;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    invoke-direct {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->B()Lcom/kubi/assets/h0;

    .line 78
    move-result-object p2

    .line 79
    const/4 v1, 0x3

    .line 80
    const/4 v3, 0x0

    .line 81
    .line 82
    .line 83
    invoke-static {p2, v3, v3, v1, v3}, Lcom/kubi/assets/h0;->D(Lcom/kubi/assets/h0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lkotlinx/coroutines/flow/e;

    .line 84
    move-result-object v1

    .line 85
    move-object p2, v3

    .line 86
    .line 87
    new-instance v3, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$handleOnGoingData$3;

    .line 88
    .line 89
    .line 90
    invoke-direct {v3, p0, p1, p2}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$handleOnGoingData$3;-><init>(Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;ZLkotlin/coroutines/Continuation;)V

    .line 91
    .line 92
    iput-boolean p1, v4, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$handleOnGoingData$1;->Z$0:Z

    .line 93
    .line 94
    iput v2, v4, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$handleOnGoingData$1;->label:I

    .line 95
    const/4 v2, 0x0

    .line 96
    const/4 v5, 0x1

    .line 97
    const/4 v6, 0x0

    .line 98
    .line 99
    .line 100
    invoke-static/range {v1 .. v6}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->e(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 101
    move-result-object p2

    .line 102
    .line 103
    if-ne p2, v0, :cond_4

    .line 104
    return-object v0

    .line 105
    .line 106
    :cond_4
    :goto_2
    check-cast p2, Lcom/kubi/network/retrofit/utils/f;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2}, Lcom/kubi/network/retrofit/utils/f;->b()Ljava/lang/Throwable;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    if-eqz p1, :cond_5

    .line 113
    .line 114
    sget-object p1, Lcom/kubi/assets/overview/ongoing/m;->a:Lcom/kubi/assets/overview/ongoing/m;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->sendSingleEvent(Ldr/a;)V

    .line 118
    .line 119
    :cond_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 120
    return-object p1
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
.end method

.method public final H(Lcom/kubi/assets/entity/OnGoingEntity;Z)V
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->X:Ljava/util/HashMap;

    .line 3
    const/4 v1, 0x2

    .line 4
    .line 5
    .line 6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    const/4 v1, 0x1

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz p2, :cond_4

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    goto :goto_1

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OnGoingEntity;->getIsolated()Lcom/kubi/assets/entity/Isolated;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    if-eqz p1, :cond_4

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/kubi/assets/entity/Isolated;->getExecute()Ljava/lang/Boolean;

    .line 33
    move-result-object p2

    .line 34
    .line 35
    .line 36
    invoke-static {p2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 37
    move-result p2

    .line 38
    const/4 v0, 0x0

    .line 39
    .line 40
    if-eqz p2, :cond_1

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-object p1, v0

    .line 43
    .line 44
    :goto_0
    if-eqz p1, :cond_4

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/kubi/assets/entity/Isolated;->getIsolatedPositionDetail()Lcom/kubi/assets/entity/IsolatedPositionDetail;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/kubi/assets/entity/IsolatedPositionDetail;->getPositions()Ljava/util/List;

    .line 54
    move-result-object v0

    .line 55
    :cond_2
    move-object v1, v0

    .line 56
    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    new-instance v7, Lcom/kubi/assets/overview/ongoing/w;

    .line 60
    .line 61
    .line 62
    invoke-direct {v7}, Lcom/kubi/assets/overview/ongoing/w;-><init>()V

    .line 63
    .line 64
    const/16 v8, 0x1e

    .line 65
    const/4 v9, 0x0

    .line 66
    .line 67
    const-string v2, ","

    .line 68
    const/4 v3, 0x0

    .line 69
    const/4 v4, 0x0

    .line 70
    const/4 v5, 0x0

    .line 71
    const/4 v6, 0x0

    .line 72
    .line 73
    .line 74
    invoke-static/range {v1 .. v9}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    if-nez p1, :cond_3

    .line 78
    goto :goto_1

    .line 79
    .line 80
    :cond_3
    sget-object p2, Lcom/kubi/assets/overview/ongoing/z;->a:Lcom/kubi/assets/overview/ongoing/z;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, p1}, Lcom/kubi/assets/overview/ongoing/z;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->M(Ljava/lang/String;)Lkotlinx/coroutines/x1;

    .line 88
    :cond_4
    :goto_1
    return-void
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
.end method

.method public final J(IZ)V
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->X:Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    xor-int/lit8 p2, p2, 0x1

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    move-result-object p2

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->a0:Lcom/kubi/assets/entity/OnGoingEntity;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/16 v8, 0x3f

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v7, 0x0

    .line 29
    .line 30
    .line 31
    invoke-static/range {v1 .. v9}, Lcom/kubi/assets/entity/OnGoingEntity;->copy$default(Lcom/kubi/assets/entity/OnGoingEntity;Lcom/kubi/assets/entity/Margin;Lcom/kubi/assets/entity/Isolated;Lcom/kubi/assets/entity/Robot;Lcom/kubi/assets/entity/Pool;Lcom/kubi/assets/entity/CopyTradingOnGoingEntity;Lcom/kubi/assets/entity/LeadTradingOnGoingEntity;ILjava/lang/Object;)Lcom/kubi/assets/entity/OnGoingEntity;

    .line 32
    move-result-object p1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p1, 0x0

    .line 35
    .line 36
    :goto_0
    if-eqz p1, :cond_1

    .line 37
    const/4 p2, 0x0

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->S(Lcom/kubi/assets/entity/OnGoingEntity;Z)V

    .line 41
    :cond_1
    return-void
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
.end method

.method public final L()Lkotlinx/coroutines/x1;
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->W:Llb/f;

    .line 3
    .line 4
    new-instance v3, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$startTimer$1;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v3, p0, v1}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$startTimer$1;-><init>(Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;Lkotlin/coroutines/Continuation;)V

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 15
    move-result-object v0

    .line 16
    return-object v0
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
.end method

.method public final M(Ljava/lang/String;)Lkotlinx/coroutines/x1;
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->W:Llb/f;

    .line 3
    .line 4
    new-instance v3, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$subscribeLeverageData$1;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v3, p0, p1, v1}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$subscribeLeverageData$1;-><init>(Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 15
    move-result-object p1

    .line 16
    return-object p1
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
.end method

.method public final N(Ljava/util/List;Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/kumex/entity/PositionWrapperEntity;",
            ">;",
            "Ljava/util/List<",
            "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 7
    move-result v1

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    move-result-object v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v1, v0

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 17
    move-result v1

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_1
    sget-object v2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 23
    .line 24
    sget v3, Lcom/kubi/assets/R$string;->kc_assets_my_futures:I

    .line 25
    const/4 v4, 0x0

    .line 26
    .line 27
    new-array v5, v4, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v3, v5}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    .line 38
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 39
    move-result-object v3

    .line 40
    const/4 v5, 0x2

    .line 41
    .line 42
    .line 43
    invoke-static {v2, v3, v0, v5, v0}, Lcom/kubi/utils/extensions/DowngradeExKt;->u(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    iget-object v3, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->X:Ljava/util/HashMap;

    .line 47
    const/4 v5, 0x1

    .line 48
    .line 49
    .line 50
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    move-result-object v6

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    move-result-object v3

    .line 56
    .line 57
    check-cast v3, Ljava/lang/Boolean;

    .line 58
    .line 59
    .line 60
    invoke-static {v3, v5}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 61
    move-result v8

    .line 62
    .line 63
    const/16 v3, 0xa

    .line 64
    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    .line 68
    invoke-static {p1, v3}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    :cond_2
    new-instance v6, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;

    .line 72
    const/4 v10, 0x4

    .line 73
    const/4 v11, 0x0

    .line 74
    const/4 v7, 0x1

    .line 75
    const/4 v9, 0x0

    .line 76
    .line 77
    .line 78
    invoke-direct/range {v6 .. v11}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;-><init>(IZLjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6, v2}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->c(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    if-nez v8, :cond_3

    .line 87
    :goto_1
    return-void

    .line 88
    .line 89
    :cond_3
    if-eqz v0, :cond_5

    .line 90
    .line 91
    new-instance p1, Lcom/kubi/assets/overview/ongoing/mapper/a;

    .line 92
    .line 93
    .line 94
    invoke-direct {p1, v2}, Lcom/kubi/assets/overview/ongoing/mapper/a;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    new-instance v6, Ljava/util/ArrayList;

    .line 97
    .line 98
    .line 99
    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 100
    move-result v7

    .line 101
    .line 102
    .line 103
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 104
    .line 105
    .line 106
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 107
    move-result-object v0

    .line 108
    .line 109
    .line 110
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    move-result v7

    .line 112
    .line 113
    if-eqz v7, :cond_4

    .line 114
    .line 115
    .line 116
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    move-result-object v7

    .line 118
    .line 119
    check-cast v7, Lcom/kubi/kumex/entity/PositionWrapperEntity;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, v7}, Lcom/kubi/assets/overview/ongoing/mapper/a;->d(Lcom/kubi/kumex/entity/PositionWrapperEntity;)Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$a;

    .line 123
    move-result-object v7

    .line 124
    .line 125
    .line 126
    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 127
    goto :goto_2

    .line 128
    .line 129
    .line 130
    :cond_4
    invoke-interface {p2, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 131
    .line 132
    :cond_5
    if-le v1, v3, :cond_6

    .line 133
    .line 134
    new-instance p1, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$h;

    .line 135
    .line 136
    .line 137
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    move-result-object v0

    .line 139
    .line 140
    .line 141
    invoke-direct {p1, v0, v5}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$h;-><init>(Ljava/lang/Integer;I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, v2}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->c(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 148
    move v4, v5

    .line 149
    .line 150
    :cond_6
    sget-object p1, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 151
    .line 152
    const-string p2, "myFuture"

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1, p2, v1, v4}, Lcom/kubi/assets/overview/b1;->b(Ljava/lang/String;IZ)V

    .line 156
    return-void
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
.end method

.method public final O(Lcom/kubi/assets/entity/OnGoingEntity;Ljava/util/List;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/assets/entity/OnGoingEntity;",
            "Ljava/util/List<",
            "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OnGoingEntity;->getCopyTrading()Lcom/kubi/assets/entity/CopyTradingOnGoingEntity;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/assets/entity/CopyTradingOnGoingEntity;->getTotalCount()Ljava/lang/Integer;

    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 17
    move-result v0

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 28
    .line 29
    sget v4, Lcom/kubi/assets/R$string;->copytd_copy_trading:I

    .line 30
    const/4 v5, 0x0

    .line 31
    .line 32
    new-array v6, v5, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v4, v6}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v3, " ("

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const/16 v3, 0x29

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    iget-object v3, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->X:Ljava/util/HashMap;

    .line 59
    .line 60
    const/16 v4, 0x8

    .line 61
    .line 62
    .line 63
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    move-result-object v6

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    move-result-object v3

    .line 69
    .line 70
    check-cast v3, Ljava/lang/Boolean;

    .line 71
    const/4 v6, 0x1

    .line 72
    .line 73
    .line 74
    invoke-static {v3, v6}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 75
    move-result v9

    .line 76
    .line 77
    new-instance v7, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;

    .line 78
    const/4 v11, 0x4

    .line 79
    const/4 v12, 0x0

    .line 80
    .line 81
    const/16 v8, 0x8

    .line 82
    const/4 v10, 0x0

    .line 83
    .line 84
    .line 85
    invoke-direct/range {v7 .. v12}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;-><init>(IZLjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v7, v2}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->c(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    if-nez v9, :cond_2

    .line 94
    :goto_1
    return-void

    .line 95
    .line 96
    .line 97
    :cond_2
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OnGoingEntity;->getCopyTrading()Lcom/kubi/assets/entity/CopyTradingOnGoingEntity;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    if-eqz p1, :cond_6

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/kubi/assets/entity/CopyTradingOnGoingEntity;->getExecute()Ljava/lang/Boolean;

    .line 104
    move-result-object v3

    .line 105
    .line 106
    .line 107
    invoke-static {v3}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 108
    move-result v3

    .line 109
    .line 110
    if-eqz v3, :cond_3

    .line 111
    move-object v1, p1

    .line 112
    .line 113
    :cond_3
    if-eqz v1, :cond_6

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Lcom/kubi/assets/entity/CopyTradingOnGoingEntity;->getItems()Ljava/util/List;

    .line 117
    move-result-object p1

    .line 118
    .line 119
    if-eqz p1, :cond_5

    .line 120
    .line 121
    new-instance v3, Lcom/kubi/assets/overview/ongoing/mapper/b;

    .line 122
    .line 123
    .line 124
    invoke-direct {v3, v2}, Lcom/kubi/assets/overview/ongoing/mapper/b;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    new-instance v7, Ljava/util/ArrayList;

    .line 127
    .line 128
    const/16 v8, 0xa

    .line 129
    .line 130
    .line 131
    invoke-static {p1, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 132
    move-result v8

    .line 133
    .line 134
    .line 135
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 136
    .line 137
    .line 138
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 139
    move-result-object p1

    .line 140
    .line 141
    .line 142
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    move-result v8

    .line 144
    .line 145
    if-eqz v8, :cond_4

    .line 146
    .line 147
    .line 148
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    move-result-object v8

    .line 150
    .line 151
    check-cast v8, Lcom/kubi/assets/entity/CopyTradingItem;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v3, v8}, Lcom/kubi/assets/overview/ongoing/mapper/b;->e(Lcom/kubi/assets/entity/CopyTradingItem;)Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$b;

    .line 155
    move-result-object v8

    .line 156
    .line 157
    .line 158
    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 159
    goto :goto_2

    .line 160
    .line 161
    .line 162
    :cond_4
    invoke-interface {p2, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 163
    .line 164
    .line 165
    :cond_5
    invoke-virtual {v1}, Lcom/kubi/assets/entity/CopyTradingOnGoingEntity;->getHasMore()Ljava/lang/Boolean;

    .line 166
    move-result-object p1

    .line 167
    .line 168
    .line 169
    invoke-static {p1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 170
    move-result p1

    .line 171
    .line 172
    if-eqz p1, :cond_6

    .line 173
    .line 174
    new-instance p1, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$h;

    .line 175
    .line 176
    .line 177
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    move-result-object v1

    .line 179
    .line 180
    .line 181
    invoke-direct {p1, v1, v4}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$h;-><init>(Ljava/lang/Integer;I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1, v2}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->c(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 188
    move v5, v6

    .line 189
    .line 190
    :cond_6
    sget-object p1, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 191
    .line 192
    const-string p2, "myCopyTrading"

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1, p2, v0, v5}, Lcom/kubi/assets/overview/b1;->b(Ljava/lang/String;IZ)V

    .line 196
    return-void
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
.end method

.method public final P(Lcom/kubi/assets/entity/OnGoingEntity;Ljava/util/List;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/assets/entity/OnGoingEntity;",
            "Ljava/util/List<",
            "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OnGoingEntity;->getPool()Lcom/kubi/assets/entity/Pool;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/assets/entity/Pool;->getTotalCount()Ljava/lang/Integer;

    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 17
    move-result v0

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_1
    sget-object v2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 23
    .line 24
    sget v3, Lcom/kubi/assets/R$string;->kc_assets_my_earn:I

    .line 25
    const/4 v4, 0x0

    .line 26
    .line 27
    new-array v5, v4, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v3, v5}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    move-result-object v3

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    move-result-object v5

    .line 36
    .line 37
    .line 38
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 39
    move-result-object v5

    .line 40
    const/4 v6, 0x2

    .line 41
    .line 42
    .line 43
    invoke-static {v3, v5, v1, v6, v1}, Lcom/kubi/utils/extensions/DowngradeExKt;->u(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    new-instance v3, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    sget-object v5, Lcom/kubi/data/coin/AccountType;->FINANCE:Lcom/kubi/data/coin/AccountType;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5}, Lcom/kubi/data/coin/AccountType;->getNickNameRes()I

    .line 54
    move-result v5

    .line 55
    .line 56
    new-array v6, v4, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v5, v6}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    move-result-object v2

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v2, " ("

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const/16 v2, 0x29

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    move-result-object v2

    .line 81
    .line 82
    iget-object v3, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->X:Ljava/util/HashMap;

    .line 83
    const/4 v5, 0x5

    .line 84
    .line 85
    .line 86
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    move-result-object v6

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    move-result-object v3

    .line 92
    .line 93
    check-cast v3, Ljava/lang/Boolean;

    .line 94
    const/4 v6, 0x1

    .line 95
    .line 96
    .line 97
    invoke-static {v3, v6}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 98
    move-result v9

    .line 99
    .line 100
    new-instance v7, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;

    .line 101
    const/4 v11, 0x4

    .line 102
    const/4 v12, 0x0

    .line 103
    const/4 v8, 0x5

    .line 104
    const/4 v10, 0x0

    .line 105
    .line 106
    .line 107
    invoke-direct/range {v7 .. v12}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;-><init>(IZLjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v7, v2}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->c(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-interface {p2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    if-nez v9, :cond_2

    .line 116
    :goto_1
    return-void

    .line 117
    .line 118
    .line 119
    :cond_2
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OnGoingEntity;->getPool()Lcom/kubi/assets/entity/Pool;

    .line 120
    move-result-object p1

    .line 121
    .line 122
    if-eqz p1, :cond_6

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Lcom/kubi/assets/entity/Pool;->getExecute()Ljava/lang/Boolean;

    .line 126
    move-result-object v3

    .line 127
    .line 128
    .line 129
    invoke-static {v3}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 130
    move-result v3

    .line 131
    .line 132
    if-eqz v3, :cond_3

    .line 133
    move-object v1, p1

    .line 134
    .line 135
    :cond_3
    if-eqz v1, :cond_6

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Lcom/kubi/assets/entity/Pool;->getItems()Ljava/util/List;

    .line 139
    move-result-object p1

    .line 140
    .line 141
    if-eqz p1, :cond_5

    .line 142
    .line 143
    new-instance v3, Lcom/kubi/assets/overview/ongoing/mapper/d;

    .line 144
    .line 145
    .line 146
    invoke-direct {v3, v2}, Lcom/kubi/assets/overview/ongoing/mapper/d;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    new-instance v7, Ljava/util/ArrayList;

    .line 149
    .line 150
    const/16 v8, 0xa

    .line 151
    .line 152
    .line 153
    invoke-static {p1, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 154
    move-result v8

    .line 155
    .line 156
    .line 157
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 158
    .line 159
    .line 160
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 161
    move-result-object p1

    .line 162
    .line 163
    .line 164
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    move-result v8

    .line 166
    .line 167
    if-eqz v8, :cond_4

    .line 168
    .line 169
    .line 170
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    move-result-object v8

    .line 172
    .line 173
    check-cast v8, Lcom/kubi/assets/entity/PoolItem;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3, v8}, Lcom/kubi/assets/overview/ongoing/mapper/d;->g(Lcom/kubi/assets/entity/PoolItem;)Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$d;

    .line 177
    move-result-object v8

    .line 178
    .line 179
    .line 180
    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 181
    goto :goto_2

    .line 182
    .line 183
    .line 184
    :cond_4
    invoke-interface {p2, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 185
    .line 186
    .line 187
    :cond_5
    invoke-virtual {v1}, Lcom/kubi/assets/entity/Pool;->getHasMore()Ljava/lang/Boolean;

    .line 188
    move-result-object p1

    .line 189
    .line 190
    .line 191
    invoke-static {p1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 192
    move-result p1

    .line 193
    .line 194
    if-eqz p1, :cond_6

    .line 195
    .line 196
    new-instance p1, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$h;

    .line 197
    .line 198
    .line 199
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 200
    move-result-object v1

    .line 201
    .line 202
    .line 203
    invoke-direct {p1, v1, v5}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$h;-><init>(Ljava/lang/Integer;I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1, v2}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->c(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 210
    move v4, v6

    .line 211
    .line 212
    :cond_6
    sget-object p1, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 213
    .line 214
    const-string p2, "myEarn"

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, p2, v0, v4}, Lcom/kubi/assets/overview/b1;->b(Ljava/lang/String;IZ)V

    .line 218
    return-void
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
.end method

.method public final Q(Lcom/kubi/assets/entity/OnGoingEntity;Ljava/util/List;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/assets/entity/OnGoingEntity;",
            "Ljava/util/List<",
            "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OnGoingEntity;->getLeadTrading()Lcom/kubi/assets/entity/LeadTradingOnGoingEntity;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/assets/entity/LeadTradingOnGoingEntity;->getTotalCount()Ljava/lang/Integer;

    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 17
    move-result v0

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 29
    .line 30
    sget v4, Lcom/kubi/assets/R$string;->copytd_lead_trading:I

    .line 31
    const/4 v5, 0x0

    .line 32
    .line 33
    new-array v6, v5, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v4, v6}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    move-result-object v3

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v3, " ("

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const/16 v3, 0x29

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    iget-object v3, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->X:Ljava/util/HashMap;

    .line 60
    .line 61
    const/16 v4, 0x9

    .line 62
    .line 63
    .line 64
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    move-result-object v6

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    move-result-object v3

    .line 70
    .line 71
    check-cast v3, Ljava/lang/Boolean;

    .line 72
    const/4 v6, 0x1

    .line 73
    .line 74
    .line 75
    invoke-static {v3, v6}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 76
    move-result v9

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OnGoingEntity;->getLeadTrading()Lcom/kubi/assets/entity/LeadTradingOnGoingEntity;

    .line 80
    move-result-object v3

    .line 81
    .line 82
    if-eqz v3, :cond_2

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3}, Lcom/kubi/assets/entity/LeadTradingOnGoingEntity;->getAlreadyCopyTraders()Ljava/lang/Integer;

    .line 86
    move-result-object v3

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    move-object v3, v1

    .line 89
    .line 90
    .line 91
    :goto_1
    invoke-static {v3}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 92
    move-result v3

    .line 93
    .line 94
    new-instance v7, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;

    .line 95
    const/4 v11, 0x4

    .line 96
    const/4 v12, 0x0

    .line 97
    .line 98
    const/16 v8, 0x9

    .line 99
    const/4 v10, 0x0

    .line 100
    .line 101
    .line 102
    invoke-direct/range {v7 .. v12}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;-><init>(IZLjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v7, v2}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->c(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    move-result-object v3

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 113
    move-result v8

    .line 114
    .line 115
    if-lez v8, :cond_3

    .line 116
    move v8, v6

    .line 117
    goto :goto_2

    .line 118
    :cond_3
    move v8, v5

    .line 119
    .line 120
    :goto_2
    if-eqz v8, :cond_4

    .line 121
    goto :goto_3

    .line 122
    :cond_4
    move-object v3, v1

    .line 123
    .line 124
    .line 125
    :goto_3
    invoke-virtual {v7, v3}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;->g(Ljava/lang/Integer;)V

    .line 126
    .line 127
    .line 128
    invoke-interface {p2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    if-nez v9, :cond_5

    .line 131
    :goto_4
    return-void

    .line 132
    .line 133
    .line 134
    :cond_5
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OnGoingEntity;->getLeadTrading()Lcom/kubi/assets/entity/LeadTradingOnGoingEntity;

    .line 135
    move-result-object p1

    .line 136
    .line 137
    if-eqz p1, :cond_9

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1}, Lcom/kubi/assets/entity/LeadTradingOnGoingEntity;->getExecute()Ljava/lang/Boolean;

    .line 141
    move-result-object v3

    .line 142
    .line 143
    .line 144
    invoke-static {v3}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 145
    move-result v3

    .line 146
    .line 147
    if-eqz v3, :cond_6

    .line 148
    move-object v1, p1

    .line 149
    .line 150
    :cond_6
    if-eqz v1, :cond_9

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1}, Lcom/kubi/assets/entity/LeadTradingOnGoingEntity;->getItems()Ljava/util/List;

    .line 154
    move-result-object p1

    .line 155
    .line 156
    if-eqz p1, :cond_8

    .line 157
    .line 158
    new-instance v3, Lcom/kubi/assets/overview/ongoing/mapper/LeadTradingMapper;

    .line 159
    .line 160
    .line 161
    invoke-direct {v3, v2}, Lcom/kubi/assets/overview/ongoing/mapper/LeadTradingMapper;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    new-instance v7, Ljava/util/ArrayList;

    .line 164
    .line 165
    const/16 v8, 0xa

    .line 166
    .line 167
    .line 168
    invoke-static {p1, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 169
    move-result v8

    .line 170
    .line 171
    .line 172
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 173
    .line 174
    .line 175
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 176
    move-result-object p1

    .line 177
    .line 178
    .line 179
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    move-result v8

    .line 181
    .line 182
    if-eqz v8, :cond_7

    .line 183
    .line 184
    .line 185
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    move-result-object v8

    .line 187
    .line 188
    check-cast v8, Lcom/kubi/assets/entity/LeadTradingItem;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3, v8}, Lcom/kubi/assets/overview/ongoing/mapper/LeadTradingMapper;->f(Lcom/kubi/assets/entity/LeadTradingItem;)Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$g;

    .line 192
    move-result-object v8

    .line 193
    .line 194
    .line 195
    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 196
    goto :goto_5

    .line 197
    .line 198
    .line 199
    :cond_7
    invoke-interface {p2, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 200
    .line 201
    .line 202
    :cond_8
    invoke-virtual {v1}, Lcom/kubi/assets/entity/LeadTradingOnGoingEntity;->getHasMore()Ljava/lang/Boolean;

    .line 203
    move-result-object p1

    .line 204
    .line 205
    .line 206
    invoke-static {p1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 207
    move-result p1

    .line 208
    .line 209
    if-eqz p1, :cond_9

    .line 210
    .line 211
    new-instance p1, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$h;

    .line 212
    .line 213
    .line 214
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    move-result-object v1

    .line 216
    .line 217
    .line 218
    invoke-direct {p1, v1, v4}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$h;-><init>(Ljava/lang/Integer;I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1, v2}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->c(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 225
    move v5, v6

    .line 226
    .line 227
    :cond_9
    sget-object p1, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 228
    .line 229
    const-string p2, "myLeadTrading"

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1, p2, v0, v5}, Lcom/kubi/assets/overview/b1;->b(Ljava/lang/String;IZ)V

    .line 233
    return-void
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
.end method

.method public final R(Lcom/kubi/assets/entity/OnGoingEntity;Ljava/util/List;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/assets/entity/OnGoingEntity;",
            "Ljava/util/List<",
            "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OnGoingEntity;->getMargin()Lcom/kubi/assets/entity/Margin;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/assets/entity/Margin;->getTotalCount()Ljava/lang/Integer;

    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 17
    move-result v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OnGoingEntity;->getIsolated()Lcom/kubi/assets/entity/Isolated;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Lcom/kubi/assets/entity/Isolated;->getTotalCount()Ljava/lang/Integer;

    .line 27
    move-result-object v2

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move-object v2, v1

    .line 30
    .line 31
    .line 32
    :goto_1
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 33
    move-result v2

    .line 34
    add-int/2addr v0, v2

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    goto :goto_2

    .line 38
    .line 39
    :cond_2
    sget-object v2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 40
    .line 41
    sget v3, Lcom/kubi/assets/R$string;->kc_assets_my_margin:I

    .line 42
    const/4 v4, 0x0

    .line 43
    .line 44
    new-array v5, v4, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v3, v5}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    move-result-object v2

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    move-result-object v3

    .line 53
    .line 54
    .line 55
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 56
    move-result-object v3

    .line 57
    const/4 v5, 0x2

    .line 58
    .line 59
    .line 60
    invoke-static {v2, v3, v1, v5, v1}, Lcom/kubi/utils/extensions/DowngradeExKt;->u(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    iget-object v3, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->X:Ljava/util/HashMap;

    .line 64
    .line 65
    .line 66
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    move-result-object v6

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    move-result-object v3

    .line 72
    .line 73
    check-cast v3, Ljava/lang/Boolean;

    .line 74
    const/4 v6, 0x1

    .line 75
    .line 76
    .line 77
    invoke-static {v3, v6}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 78
    move-result v9

    .line 79
    .line 80
    new-instance v7, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;

    .line 81
    const/4 v11, 0x4

    .line 82
    const/4 v12, 0x0

    .line 83
    const/4 v8, 0x2

    .line 84
    const/4 v10, 0x0

    .line 85
    .line 86
    .line 87
    invoke-direct/range {v7 .. v12}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;-><init>(IZLjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v7, v2}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->c(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {p2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    if-nez v9, :cond_3

    .line 96
    :goto_2
    return-void

    .line 97
    .line 98
    .line 99
    :cond_3
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OnGoingEntity;->getMargin()Lcom/kubi/assets/entity/Margin;

    .line 100
    move-result-object v3

    .line 101
    .line 102
    const/16 v7, 0xa

    .line 103
    .line 104
    if-eqz v3, :cond_6

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3}, Lcom/kubi/assets/entity/Margin;->getExecute()Ljava/lang/Boolean;

    .line 108
    move-result-object v8

    .line 109
    .line 110
    .line 111
    invoke-static {v8}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 112
    move-result v8

    .line 113
    .line 114
    if-eqz v8, :cond_4

    .line 115
    goto :goto_3

    .line 116
    :cond_4
    move-object v3, v1

    .line 117
    .line 118
    :goto_3
    if-eqz v3, :cond_6

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3}, Lcom/kubi/assets/entity/Margin;->getMarginPositionDetailList()Ljava/util/List;

    .line 122
    move-result-object v8

    .line 123
    .line 124
    if-eqz v8, :cond_6

    .line 125
    .line 126
    new-instance v9, Lcom/kubi/assets/overview/ongoing/mapper/c;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Lcom/kubi/assets/entity/Margin;->getHasMore()Ljava/lang/Boolean;

    .line 130
    move-result-object v3

    .line 131
    .line 132
    .line 133
    invoke-direct {v9, v0, v3}, Lcom/kubi/assets/overview/ongoing/mapper/c;-><init>(ILjava/lang/Boolean;)V

    .line 134
    .line 135
    new-instance v3, Ljava/util/ArrayList;

    .line 136
    .line 137
    .line 138
    invoke-static {v8, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 139
    move-result v10

    .line 140
    .line 141
    .line 142
    invoke-direct {v3, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 143
    .line 144
    .line 145
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 146
    move-result-object v8

    .line 147
    .line 148
    .line 149
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    move-result v10

    .line 151
    .line 152
    if-eqz v10, :cond_5

    .line 153
    .line 154
    .line 155
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    move-result-object v10

    .line 157
    .line 158
    check-cast v10, Lcom/kubi/assets/entity/MarginPositionDetail;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v9, v10}, Lcom/kubi/assets/overview/ongoing/mapper/c;->e(Lcom/kubi/assets/entity/MarginPositionDetail;)Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$c;

    .line 162
    move-result-object v10

    .line 163
    .line 164
    .line 165
    invoke-interface {v3, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 166
    goto :goto_4

    .line 167
    .line 168
    .line 169
    :cond_5
    invoke-interface {p2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 170
    .line 171
    .line 172
    :cond_6
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OnGoingEntity;->getIsolated()Lcom/kubi/assets/entity/Isolated;

    .line 173
    move-result-object p1

    .line 174
    .line 175
    if-eqz p1, :cond_b

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1}, Lcom/kubi/assets/entity/Isolated;->getExecute()Ljava/lang/Boolean;

    .line 179
    move-result-object v3

    .line 180
    .line 181
    .line 182
    invoke-static {v3}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 183
    move-result v3

    .line 184
    .line 185
    if-eqz v3, :cond_7

    .line 186
    goto :goto_5

    .line 187
    :cond_7
    move-object p1, v1

    .line 188
    .line 189
    :goto_5
    if-eqz p1, :cond_b

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1}, Lcom/kubi/assets/entity/Isolated;->getIsolatedPositionDetail()Lcom/kubi/assets/entity/IsolatedPositionDetail;

    .line 193
    move-result-object v3

    .line 194
    .line 195
    if-eqz v3, :cond_8

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3}, Lcom/kubi/assets/entity/IsolatedPositionDetail;->getPositions()Ljava/util/List;

    .line 199
    move-result-object v1

    .line 200
    .line 201
    :cond_8
    if-eqz v1, :cond_a

    .line 202
    .line 203
    new-instance v3, Lcom/kubi/assets/overview/ongoing/mapper/e;

    .line 204
    .line 205
    .line 206
    invoke-direct {v3, v2}, Lcom/kubi/assets/overview/ongoing/mapper/e;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    new-instance v8, Ljava/util/ArrayList;

    .line 209
    .line 210
    .line 211
    invoke-static {v1, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 212
    move-result v7

    .line 213
    .line 214
    .line 215
    invoke-direct {v8, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 216
    .line 217
    .line 218
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 219
    move-result-object v1

    .line 220
    .line 221
    .line 222
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 223
    move-result v7

    .line 224
    .line 225
    if-eqz v7, :cond_9

    .line 226
    .line 227
    .line 228
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    move-result-object v7

    .line 230
    .line 231
    check-cast v7, Lcom/kubi/margin/api/entity/MarginPosition;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3, v7}, Lcom/kubi/assets/overview/ongoing/mapper/e;->g(Lcom/kubi/margin/api/entity/MarginPosition;)Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$f;

    .line 235
    move-result-object v7

    .line 236
    .line 237
    .line 238
    invoke-interface {v8, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 239
    goto :goto_6

    .line 240
    .line 241
    .line 242
    :cond_9
    invoke-interface {p2, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 243
    .line 244
    .line 245
    :cond_a
    invoke-virtual {p1}, Lcom/kubi/assets/entity/Isolated;->getHasMore()Ljava/lang/Boolean;

    .line 246
    move-result-object p1

    .line 247
    .line 248
    .line 249
    invoke-static {p1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 250
    move-result p1

    .line 251
    .line 252
    if-eqz p1, :cond_b

    .line 253
    .line 254
    new-instance p1, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$h;

    .line 255
    .line 256
    .line 257
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 258
    move-result-object v1

    .line 259
    .line 260
    .line 261
    invoke-direct {p1, v1, v5}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$h;-><init>(Ljava/lang/Integer;I)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p1, v2}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->c(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 268
    move v4, v6

    .line 269
    .line 270
    :cond_b
    sget-object p1, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 271
    .line 272
    const-string p2, "myMargin"

    .line 273
    .line 274
    .line 275
    invoke-virtual {p1, p2, v0, v4}, Lcom/kubi/assets/overview/b1;->b(Ljava/lang/String;IZ)V

    .line 276
    return-void
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
.end method

.method public final S(Lcom/kubi/assets/entity/OnGoingEntity;Z)V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/kubi/assets/a;->a()Z

    .line 9
    move-result v1

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->b0:Ljava/util/List;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1, v0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->N(Ljava/util/List;Ljava/util/List;)V

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OnGoingEntity;->getMargin()Lcom/kubi/assets/entity/Margin;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/kubi/assets/entity/Margin;->getMarginPositionDetailList()Ljava/util/List;

    .line 29
    move-result-object v2

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object v2, v1

    .line 32
    .line 33
    :goto_0
    if-eqz v2, :cond_2

    .line 34
    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 37
    move-result v2

    .line 38
    .line 39
    if-eqz v2, :cond_c

    .line 40
    .line 41
    :cond_2
    if-eqz p1, :cond_3

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OnGoingEntity;->getIsolated()Lcom/kubi/assets/entity/Isolated;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    if-eqz v2, :cond_3

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/kubi/assets/entity/Isolated;->getIsolatedPositionDetail()Lcom/kubi/assets/entity/IsolatedPositionDetail;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Lcom/kubi/assets/entity/IsolatedPositionDetail;->getPositions()Ljava/util/List;

    .line 57
    move-result-object v2

    .line 58
    goto :goto_1

    .line 59
    :cond_3
    move-object v2, v1

    .line 60
    .line 61
    :goto_1
    if-eqz v2, :cond_4

    .line 62
    .line 63
    .line 64
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 65
    move-result v2

    .line 66
    .line 67
    if-eqz v2, :cond_c

    .line 68
    .line 69
    :cond_4
    if-eqz p1, :cond_5

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OnGoingEntity;->getPool()Lcom/kubi/assets/entity/Pool;

    .line 73
    move-result-object v2

    .line 74
    .line 75
    if-eqz v2, :cond_5

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Lcom/kubi/assets/entity/Pool;->getItems()Ljava/util/List;

    .line 79
    move-result-object v2

    .line 80
    goto :goto_2

    .line 81
    :cond_5
    move-object v2, v1

    .line 82
    .line 83
    :goto_2
    if-eqz v2, :cond_6

    .line 84
    .line 85
    .line 86
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 87
    move-result v2

    .line 88
    .line 89
    if-eqz v2, :cond_c

    .line 90
    .line 91
    :cond_6
    if-eqz p1, :cond_7

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OnGoingEntity;->getRobot()Lcom/kubi/assets/entity/Robot;

    .line 95
    move-result-object v2

    .line 96
    .line 97
    if-eqz v2, :cond_7

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Lcom/kubi/assets/entity/Robot;->getItems()Ljava/util/List;

    .line 101
    move-result-object v2

    .line 102
    goto :goto_3

    .line 103
    :cond_7
    move-object v2, v1

    .line 104
    .line 105
    :goto_3
    if-eqz v2, :cond_8

    .line 106
    .line 107
    .line 108
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 109
    move-result v2

    .line 110
    .line 111
    if-eqz v2, :cond_c

    .line 112
    .line 113
    :cond_8
    if-eqz p1, :cond_9

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OnGoingEntity;->getCopyTrading()Lcom/kubi/assets/entity/CopyTradingOnGoingEntity;

    .line 117
    move-result-object v2

    .line 118
    .line 119
    if-eqz v2, :cond_9

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Lcom/kubi/assets/entity/CopyTradingOnGoingEntity;->getItems()Ljava/util/List;

    .line 123
    move-result-object v2

    .line 124
    goto :goto_4

    .line 125
    :cond_9
    move-object v2, v1

    .line 126
    .line 127
    :goto_4
    if-eqz v2, :cond_a

    .line 128
    .line 129
    .line 130
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 131
    move-result v2

    .line 132
    .line 133
    if-eqz v2, :cond_c

    .line 134
    .line 135
    :cond_a
    if-eqz p1, :cond_b

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OnGoingEntity;->getLeadTrading()Lcom/kubi/assets/entity/LeadTradingOnGoingEntity;

    .line 139
    move-result-object v2

    .line 140
    .line 141
    if-eqz v2, :cond_b

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2}, Lcom/kubi/assets/entity/LeadTradingOnGoingEntity;->getItems()Ljava/util/List;

    .line 145
    move-result-object v2

    .line 146
    goto :goto_5

    .line 147
    :cond_b
    move-object v2, v1

    .line 148
    .line 149
    :goto_5
    if-eqz v2, :cond_d

    .line 150
    .line 151
    .line 152
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 153
    move-result v2

    .line 154
    .line 155
    if-eqz v2, :cond_c

    .line 156
    goto :goto_6

    .line 157
    :cond_c
    const/4 v2, 0x0

    .line 158
    goto :goto_7

    .line 159
    :cond_d
    :goto_6
    const/4 v2, 0x1

    .line 160
    .line 161
    :goto_7
    if-eqz p1, :cond_10

    .line 162
    .line 163
    if-eqz v2, :cond_e

    .line 164
    goto :goto_8

    .line 165
    .line 166
    .line 167
    :cond_e
    invoke-virtual {p0, p1, v0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->R(Lcom/kubi/assets/entity/OnGoingEntity;Ljava/util/List;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->H(Lcom/kubi/assets/entity/OnGoingEntity;Z)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, p1, v0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->V(Lcom/kubi/assets/entity/OnGoingEntity;Ljava/util/List;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0, p1, v0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->O(Lcom/kubi/assets/entity/OnGoingEntity;Ljava/util/List;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0, p1, v0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->Q(Lcom/kubi/assets/entity/OnGoingEntity;Ljava/util/List;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0, p1, v0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->P(Lcom/kubi/assets/entity/OnGoingEntity;Ljava/util/List;)V

    .line 183
    .line 184
    sget-object p1, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 188
    move-result-object p2

    .line 189
    .line 190
    check-cast p2, Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p2}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;->getData()Ljava/util/List;

    .line 194
    move-result-object p2

    .line 195
    .line 196
    if-eqz p2, :cond_f

    .line 197
    .line 198
    .line 199
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 200
    move-result p2

    .line 201
    .line 202
    .line 203
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    move-result-object v1

    .line 205
    .line 206
    .line 207
    :cond_f
    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 208
    move-result p2

    .line 209
    .line 210
    .line 211
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 212
    move-result v1

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1, p2, v1}, Lcom/kubi/assets/overview/b1;->c(II)V

    .line 216
    .line 217
    new-instance p1, Lcom/kubi/assets/overview/ongoing/u;

    .line 218
    .line 219
    .line 220
    invoke-direct {p1, v0}, Lcom/kubi/assets/overview/ongoing/u;-><init>(Ljava/util/List;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 224
    return-void

    .line 225
    .line 226
    :cond_10
    :goto_8
    new-instance p1, Lcom/kubi/assets/overview/ongoing/t;

    .line 227
    .line 228
    .line 229
    invoke-direct {p1, v0}, Lcom/kubi/assets/overview/ongoing/t;-><init>(Ljava/util/List;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 233
    return-void
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
.end method

.method public final V(Lcom/kubi/assets/entity/OnGoingEntity;Ljava/util/List;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/assets/entity/OnGoingEntity;",
            "Ljava/util/List<",
            "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OnGoingEntity;->getRobot()Lcom/kubi/assets/entity/Robot;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/assets/entity/Robot;->getTotalCount()Ljava/lang/Integer;

    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 17
    move-result v0

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_1
    sget-object v2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 23
    .line 24
    sget v3, Lcom/kubi/assets/R$string;->kc_assets_my_robot:I

    .line 25
    const/4 v4, 0x0

    .line 26
    .line 27
    new-array v5, v4, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v3, v5}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    .line 38
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 39
    move-result-object v3

    .line 40
    const/4 v5, 0x2

    .line 41
    .line 42
    .line 43
    invoke-static {v2, v3, v1, v5, v1}, Lcom/kubi/utils/extensions/DowngradeExKt;->u(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    iget-object v3, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->X:Ljava/util/HashMap;

    .line 47
    const/4 v5, 0x4

    .line 48
    .line 49
    .line 50
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    move-result-object v6

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    move-result-object v3

    .line 56
    .line 57
    check-cast v3, Ljava/lang/Boolean;

    .line 58
    const/4 v6, 0x1

    .line 59
    .line 60
    .line 61
    invoke-static {v3, v6}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 62
    move-result v9

    .line 63
    .line 64
    new-instance v7, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;

    .line 65
    const/4 v11, 0x4

    .line 66
    const/4 v12, 0x0

    .line 67
    const/4 v8, 0x4

    .line 68
    const/4 v10, 0x0

    .line 69
    .line 70
    .line 71
    invoke-direct/range {v7 .. v12}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;-><init>(IZLjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v7, v2}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->c(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    if-nez v9, :cond_2

    .line 80
    :goto_1
    return-void

    .line 81
    .line 82
    .line 83
    :cond_2
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OnGoingEntity;->getRobot()Lcom/kubi/assets/entity/Robot;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    if-eqz p1, :cond_6

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/kubi/assets/entity/Robot;->getExecute()Ljava/lang/Boolean;

    .line 90
    move-result-object v3

    .line 91
    .line 92
    .line 93
    invoke-static {v3}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 94
    move-result v3

    .line 95
    .line 96
    if-eqz v3, :cond_3

    .line 97
    move-object v1, p1

    .line 98
    .line 99
    :cond_3
    if-eqz v1, :cond_6

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Lcom/kubi/assets/entity/Robot;->getItems()Ljava/util/List;

    .line 103
    move-result-object p1

    .line 104
    .line 105
    if-eqz p1, :cond_5

    .line 106
    .line 107
    new-instance v3, Lcom/kubi/assets/overview/ongoing/mapper/f;

    .line 108
    .line 109
    .line 110
    invoke-direct {v3, v2}, Lcom/kubi/assets/overview/ongoing/mapper/f;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    new-instance v7, Ljava/util/ArrayList;

    .line 113
    .line 114
    const/16 v8, 0xa

    .line 115
    .line 116
    .line 117
    invoke-static {p1, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 118
    move-result v8

    .line 119
    .line 120
    .line 121
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 122
    .line 123
    .line 124
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 125
    move-result-object p1

    .line 126
    .line 127
    .line 128
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    move-result v8

    .line 130
    .line 131
    if-eqz v8, :cond_4

    .line 132
    .line 133
    .line 134
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    move-result-object v8

    .line 136
    .line 137
    check-cast v8, Lcom/kubi/assets/entity/RobotItem;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3, v8}, Lcom/kubi/assets/overview/ongoing/mapper/f;->f(Lcom/kubi/assets/entity/RobotItem;)Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$i;

    .line 141
    move-result-object v8

    .line 142
    .line 143
    .line 144
    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 145
    goto :goto_2

    .line 146
    .line 147
    .line 148
    :cond_4
    invoke-interface {p2, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 149
    .line 150
    .line 151
    :cond_5
    invoke-virtual {v1}, Lcom/kubi/assets/entity/Robot;->getHasMore()Ljava/lang/Boolean;

    .line 152
    move-result-object p1

    .line 153
    .line 154
    .line 155
    invoke-static {p1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 156
    move-result p1

    .line 157
    .line 158
    if-eqz p1, :cond_6

    .line 159
    .line 160
    new-instance p1, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$h;

    .line 161
    .line 162
    .line 163
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    move-result-object v1

    .line 165
    .line 166
    .line 167
    invoke-direct {p1, v1, v5}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$h;-><init>(Ljava/lang/Integer;I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, v2}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->c(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 174
    move v4, v6

    .line 175
    .line 176
    :cond_6
    sget-object p1, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 177
    .line 178
    const-string p2, "myBot"

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, p2, v0, v4}, Lcom/kubi/assets/overview/b1;->b(Ljava/lang/String;IZ)V

    .line 182
    return-void
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
.end method

.method public dispatchIntentOnIO(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1    # Lcom/kubi/mvi/state/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/mvi/state/d;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$dispatchIntentOnIO$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$dispatchIntentOnIO$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$dispatchIntentOnIO$1;->label:I

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
    iput v1, v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$dispatchIntentOnIO$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$dispatchIntentOnIO$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$dispatchIntentOnIO$1;-><init>(Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$dispatchIntentOnIO$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$dispatchIntentOnIO$1;->label:I

    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget-object p1, v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 45
    .line 46
    .line 47
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 48
    goto :goto_3

    .line 49
    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    throw p1

    .line 57
    .line 58
    :cond_2
    iget-object p1, v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 61
    .line 62
    .line 63
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 64
    goto :goto_1

    .line 65
    .line 66
    .line 67
    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 68
    .line 69
    iput-object p1, v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 70
    .line 71
    iput v4, v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$dispatchIntentOnIO$1;->label:I

    .line 72
    .line 73
    .line 74
    invoke-super {p0, p1, v0}, Lcom/kubi/mvi/state/BaseStateVM;->dispatchIntentOnIO(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 75
    move-result-object p2

    .line 76
    .line 77
    if-ne p2, v1, :cond_4

    .line 78
    goto :goto_2

    .line 79
    .line 80
    :cond_4
    :goto_1
    instance-of p2, p1, Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UiIntent$GetOnGoingData;

    .line 81
    .line 82
    if-eqz p2, :cond_6

    .line 83
    .line 84
    .line 85
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    iput-object p1, v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 89
    .line 90
    iput v3, v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$dispatchIntentOnIO$1;->label:I

    .line 91
    const/4 p1, 0x0

    .line 92
    const/4 p2, 0x0

    .line 93
    .line 94
    .line 95
    invoke-static {p0, p1, v0, v4, p2}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->F(Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 96
    move-result-object p1

    .line 97
    .line 98
    if-ne p1, v1, :cond_5

    .line 99
    :goto_2
    return-object v1

    .line 100
    .line 101
    :cond_5
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 102
    return-object p1

    .line 103
    .line 104
    :cond_6
    instance-of p2, p1, Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UiIntent$HideOrShowNumber;

    .line 105
    .line 106
    if-eqz p2, :cond_7

    .line 107
    .line 108
    new-instance p2, Lcom/kubi/assets/overview/ongoing/s;

    .line 109
    .line 110
    .line 111
    invoke-direct {p2, p1}, Lcom/kubi/assets/overview/ongoing/s;-><init>(Lcom/kubi/mvi/state/d;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, p2}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 115
    goto :goto_4

    .line 116
    .line 117
    :cond_7
    instance-of p2, p1, Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UiIntent$TitleClickEvent;

    .line 118
    .line 119
    if-eqz p2, :cond_8

    .line 120
    .line 121
    check-cast p1, Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UiIntent$TitleClickEvent;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UiIntent$TitleClickEvent;->getSubType()I

    .line 125
    move-result p2

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UiIntent$TitleClickEvent;->isExpanded()Z

    .line 129
    move-result p1

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, p2, p1}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->J(IZ)V

    .line 133
    .line 134
    :cond_8
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 135
    return-object p1
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
.end method

.method public bridge synthetic getInitState()Lcom/kubi/mvi/state/f;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->C()Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;

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
.end method

.method public onHide()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/mvi/vm/BaseVM;->onHide()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->W:Llb/f;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Llb/f;->close()V

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
.end method

.method public final z()V
    .locals 7

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;->W:Llb/f;

    .line 5
    .line 6
    new-instance v4, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$contractSubscription$1$1;

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v4, p0, v0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$contractSubscription$1$1;-><init>(Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;Lkotlin/coroutines/Continuation;)V

    .line 11
    const/4 v5, 0x3

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    .line 16
    .line 17
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    .line 25
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    return-void
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
.end method
