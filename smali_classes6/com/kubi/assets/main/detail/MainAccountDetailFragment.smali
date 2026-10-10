.class public final Lcom/kubi/assets/main/detail/MainAccountDetailFragment;
.super Lcom/kubi/assets/detail/BaseAccountDetailFragment;
.source "MainAccountDetailFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/assets/main/detail/MainAccountDetailFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/assets/detail/BaseAccountDetailFragment<",
        "Lcom/kubi/assets/entity/AccountDetailEntity;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 42\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\u000b\u001a\u00020\u000cH\u0016J$\u0010\u0014\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0014J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0002H\u0014J\u001a\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0008\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0008\u0010$\u001a\u00020\u001bH\u0016J\u0014\u0010%\u001a\u00020\u001b2\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010\'H\u0002J\u0008\u0010(\u001a\u00020\u001bH\u0016J\u0008\u0010)\u001a\u00020\u001bH\u0002J\u001c\u0010*\u001a\u0004\u0018\u00010+2\u0008\u0010,\u001a\u0004\u0018\u00010-H\u0080@\u00a2\u0006\u0004\u0008.\u0010/J\u001c\u00100\u001a\u0004\u0018\u00010+2\u0008\u0010,\u001a\u0004\u0018\u00010-H\u0080@\u00a2\u0006\u0004\u00081\u0010/R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008R#\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0010\u0010\u0011R\u000e\u00102\u001a\u000203X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"
    }
    d2 = {
        "Lcom/kubi/assets/main/detail/MainAccountDetailFragment;",
        "Lcom/kubi/assets/detail/BaseAccountDetailFragment;",
        "Lcom/kubi/assets/entity/AccountDetailEntity;",
        "<init>",
        "()V",
        "binding",
        "Lcom/kubi/assets/databinding/LayoutBaseAccountDetailBinding;",
        "getBinding",
        "()Lcom/kubi/assets/databinding/LayoutBaseAccountDetailBinding;",
        "binding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "getAccountType",
        "",
        "coinJson",
        "Lorg/json/JSONObject;",
        "kotlin.jvm.PlatformType",
        "getCoinJson",
        "()Lorg/json/JSONObject;",
        "coinJson$delegate",
        "Lkotlin/Lazy;",
        "getDataLoader",
        "Lio/reactivex/Observable;",
        "Lcom/kubi/sdk/base/entity/BasePageEntity;",
        "pageIndex",
        "",
        "pageSize",
        "bindDataToView",
        "",
        "helper",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "item",
        "onViewCreated",
        "view",
        "Landroid/view/View;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "lazyLoad",
        "initHeaderInfo",
        "balance",
        "Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;",
        "onFilterClick",
        "initAsnycAssetsHeaderItems",
        "asyncGetConvertItem",
        "Lcom/kubi/assets/detail/BaseAccountDetailFragment$AssetHeaderFunction;",
        "coinInfoEntity",
        "Lcom/kubi/data/entity/CoinInfoEntity;",
        "asyncGetConvertItem$AssetsCenterLib_googleRelease",
        "(Lcom/kubi/data/entity/CoinInfoEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "asyncGetB2CItem",
        "asyncGetB2CItem$AssetsCenterLib_googleRelease",
        "exceptionHandler",
        "Lkotlinx/coroutines/CoroutineExceptionHandler;",
        "Companion",
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
        "SMAP\nMainAccountDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainAccountDetailFragment.kt\ncom/kubi/assets/main/detail/MainAccountDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,429:1\n147#2,16:430\n47#3,4:446\n774#4:450\n865#4,2:451\n1869#4,2:453\n774#4:457\n865#4,2:458\n17#5,2:455\n*S KotlinDebug\n*F\n+ 1 MainAccountDetailFragment.kt\ncom/kubi/assets/main/detail/MainAccountDetailFragment\n*L\n72#1:430,16\n426#1:446,4\n97#1:450\n97#1:451,2\n97#1:453,2\n386#1:457\n386#1:458,2\n156#1:455,2\n*E\n"
    }
.end annotation


# static fields
.field public static final k0:Lcom/kubi/assets/main/detail/MainAccountDetailFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic l0:[Lkotlin/reflect/KProperty;
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
.field public final h0:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j0:Lkotlinx/coroutines/CoroutineExceptionHandler;
    .annotation build Lorg/jetbrains/annotations/NotNull;
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
    const-string v1, "getBinding()Lcom/kubi/assets/databinding/LayoutBaseAccountDetailBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;

    .line 8
    .line 9
    const-string v4, "binding"

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
    sput-object v1, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->l0:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->k0:Lcom/kubi/assets/main/detail/MainAccountDetailFragment$Companion;

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
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$special$$inlined$viewBindingFragment$1;->INSTANCE:Lcom/kubi/assets/main/detail/MainAccountDetailFragment$special$$inlined$viewBindingFragment$1;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$special$$inlined$viewBindingFragment$2;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$special$$inlined$viewBindingFragment$2;-><init>(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->h0:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 17
    .line 18
    const-string v0, "B1mainAccountDetail"

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->setPageId(Ljava/lang/String;)V

    .line 22
    .line 23
    new-instance v0, Lcom/kubi/assets/main/detail/q;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p0}, Lcom/kubi/assets/main/detail/q;-><init>(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    iput-object v0, p0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->i0:Lkotlin/Lazy;

    .line 33
    .line 34
    sget-object v0, Lkotlinx/coroutines/CoroutineExceptionHandler;->M0:Lkotlinx/coroutines/CoroutineExceptionHandler$a;

    .line 35
    .line 36
    new-instance v1, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$a;

    .line 37
    .line 38
    .line 39
    invoke-direct {v1, v0, p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$a;-><init>(Lkotlinx/coroutines/CoroutineExceptionHandler$a;Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V

    .line 40
    .line 41
    iput-object v1, p0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->j0:Lkotlinx/coroutines/CoroutineExceptionHandler;

    .line 42
    return-void
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

.method public static final A5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)Lkotlin/Unit;
    .locals 14

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->k5()Lorg/json/JSONObject;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "B1mainAccountDetail"

    .line 7
    .line 8
    const-string v2, "transfer"

    .line 9
    .line 10
    const-string v3, "1"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2, v3, v0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 14
    .line 15
    sget-object v4, Lcom/kubi/data/coin/TransferJumper;->a:Lcom/kubi/data/coin/TransferJumper$Companion;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->h4()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 19
    move-result-object p0

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 25
    move-result-object p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    move-result-object v5

    .line 32
    .line 33
    const/16 v12, 0x46

    .line 34
    const/4 v13, 0x0

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    .line 38
    const-string v8, "MAIN"

    .line 39
    .line 40
    const-string v9, "TRADE"

    .line 41
    const/4 v10, 0x1

    .line 42
    const/4 v11, 0x0

    .line 43
    .line 44
    .line 45
    invoke-static/range {v4 .. v13}, Lcom/kubi/data/coin/TransferJumper$Companion;->jumpToTransfer$default(Lcom/kubi/data/coin/TransferJumper$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 48
    return-object p0
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
.end method

.method public static synthetic L4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->r5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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
.end method

.method public static synthetic M4(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Lcom/kubi/assets/entity/AccountDetailEntity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->i5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Lcom/kubi/assets/entity/AccountDetailEntity;)Lkotlin/Unit;

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

.method public static synthetic N4(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->y5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)Lkotlin/Unit;

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

.method public static synthetic O4(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->u5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V

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
.end method

.method public static synthetic P4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->p5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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
.end method

.method public static synthetic Q4(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->q5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Ljava/lang/Throwable;)Lkotlin/Unit;

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

.method public static synthetic R4(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->t5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V

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
.end method

.method public static synthetic S4(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->g5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Ljava/lang/String;)V

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
.end method

.method public static synthetic T4(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->x5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)Lkotlin/Unit;

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

.method public static synthetic U4(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->v5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)Lkotlin/Unit;

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

.method public static synthetic V4(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->o5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;)Lkotlin/Unit;

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

.method public static synthetic W4(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Ljava/util/List;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->e5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Ljava/util/List;)V

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
.end method

.method public static synthetic X4(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->s5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V

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
.end method

.method public static synthetic Y4(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)Lorg/json/JSONObject;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->j5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)Lorg/json/JSONObject;

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

.method public static synthetic Z4(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->z5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)Lkotlin/Unit;

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

.method public static synthetic a5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->w5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)Lkotlin/Unit;

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

.method public static synthetic b5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->A5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)Lkotlin/Unit;

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

.method public static final synthetic c5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)Lta/n5;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->g4()Lta/n5;

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

.method public static final e5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Ljava/util/List;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->k5()Lorg/json/JSONObject;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "B1mainAccountDetail"

    .line 7
    .line 8
    const-string v2, "assets"

    .line 9
    .line 10
    const-string v3, "2"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2, v3, v0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    check-cast v0, Lcom/kubi/assets/entity/B2CLoanEntity;

    .line 20
    const/4 v1, 0x0

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/kubi/assets/entity/B2CLoanEntity;->getState()Ljava/lang/String;

    .line 26
    move-result-object v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v0, v1

    .line 29
    .line 30
    :goto_0
    const-string v2, "ENABLE"

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    move-result v0

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 40
    move-result-object p0

    .line 41
    .line 42
    new-instance v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetB2CItem$2$1;

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, p1, v1}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetB2CItem$2$1;-><init>(Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 49
    return-void

    .line 50
    :cond_1
    const/4 p0, 0x0

    .line 51
    const/4 p1, 0x1

    .line 52
    .line 53
    const-string v0, "b2c/home"

    .line 54
    .line 55
    .line 56
    invoke-static {v0, p0, p1, v1}, Lcom/kubi/sdk/flutter/n;->b(Ljava/lang/String;ZILjava/lang/Object;)V

    .line 57
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method

.method public static final g5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "5"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->k5()Lorg/json/JSONObject;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    const-string v1, "B1mainAccountDetail"

    .line 9
    .line 10
    const-string v2, "assets"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2, v0, p0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 14
    .line 15
    sget-object p0, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 16
    .line 17
    sget-object v0, Lhf/b;->a:Lhf/b;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lhf/b;->a()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1, v0, v1}, Lcom/kubi/assets/service/AssetsHelper;->A(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 26
    return-void
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

.method public static final i5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Lcom/kubi/assets/entity/AccountDetailEntity;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->k5()Lorg/json/JSONObject;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "B1mainAccountDetail"

    .line 7
    .line 8
    const-string v2, "accountDetail"

    .line 9
    .line 10
    const-string v3, "2"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2, v3, v0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->h4()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/kubi/data/entity/CoinInfoEntity;->getCurrency()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v0, v1

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->h4()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p1, v0, v1}, Lcom/kubi/assets/entity/AccountDetailEntity;->setCoinName(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/assets/entity/AccountDetailEntity;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    sget-object v0, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 46
    move-result-object p0

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p0, p1}, Lcom/kubi/assets/service/AssetsHelper;->l(Landroid/content/Context;Landroid/os/Parcelable;)V

    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 55
    return-object p0
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

.method public static final j5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)Lorg/json/JSONObject;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->h4()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 15
    move-result-object p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    .line 19
    :goto_0
    if-nez p0, :cond_1

    .line 20
    .line 21
    const-string p0, ""

    .line 22
    .line 23
    :cond_1
    const-string v1, "coin"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    move-result-object p0

    .line 28
    return-object p0
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

.method public static synthetic n5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;ILjava/lang/Object;)V
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
    invoke-virtual {p0, p1}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->m5(Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;)V

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
.end method

.method public static final o5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->m5(Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;)V

    .line 4
    const/4 p0, 0x0

    .line 5
    const/4 p1, 0x4

    .line 6
    .line 7
    const-string v0, "b1overview_asset_detail_load"

    .line 8
    .line 9
    const-string v1, "data_load_finish"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, p0, p1, p0}, Lqq/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 13
    .line 14
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    return-object p0
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

.method public static final p5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
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
.end method

.method public static final q5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    new-instance p1, Lcom/kubi/sdk/util/c1;

    .line 3
    .line 4
    .line 5
    invoke-direct {p1, p0}, Lcom/kubi/sdk/util/c1;-><init>(Lcom/kubi/sdk/base/ui/g;)V

    .line 6
    const/4 p0, 0x0

    .line 7
    const/4 p1, 0x2

    .line 8
    .line 9
    const-string v0, "b1overview_asset_detail_load"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, p0, p1, p0}, Lqq/b;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 13
    .line 14
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    return-object p0
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

.method public static final r5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
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
.end method

.method public static final s5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->k5()Lorg/json/JSONObject;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "B1mainAccountDetail"

    .line 7
    .line 8
    const-string v2, "assets"

    .line 9
    .line 10
    const-string v3, "1"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2, v3, v0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 14
    .line 15
    new-instance v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$onViewCreated$1$3$1;

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0, v1}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$onViewCreated$1$3$1;-><init>(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Lkotlin/coroutines/Continuation;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v0}, Lcom/kubi/mvi/common/MviExKt;->o(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;)V

    .line 23
    return-void
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

.method public static final t5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V
    .locals 14

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->k5()Lorg/json/JSONObject;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "B1mainAccountDetail"

    .line 7
    .line 8
    const-string v2, "assets"

    .line 9
    .line 10
    const-string v3, "3"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2, v3, v0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 14
    .line 15
    sget-object v4, Lf00/a;->a:Lf00/a;

    .line 16
    .line 17
    const-wide/16 v0, 0x2

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    move-result-object v5

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->h4()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 25
    move-result-object p0

    .line 26
    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 31
    move-result-object p0

    .line 32
    :goto_0
    move-object v6, p0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :goto_1
    const/16 v12, 0x7c

    .line 38
    const/4 v13, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x0

    .line 41
    const/4 v9, 0x0

    .line 42
    const/4 v10, 0x0

    .line 43
    const/4 v11, 0x0

    .line 44
    .line 45
    .line 46
    invoke-static/range {v4 .. v13}, Lg00/j$a;->l(Lg00/j;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 47
    return-void
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
.end method

.method public static final u5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V
    .locals 14

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->k5()Lorg/json/JSONObject;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "B1mainAccountDetail"

    .line 7
    .line 8
    const-string v2, "assets"

    .line 9
    .line 10
    const-string v3, "4"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2, v3, v0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 14
    .line 15
    sget-object v4, Lf00/a;->a:Lf00/a;

    .line 16
    .line 17
    new-instance v0, Lay/a;

    .line 18
    .line 19
    sget-object v1, Lcom/kubi/assets/finance/a;->a:Lcom/kubi/assets/finance/a;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/kubi/assets/finance/a;->d()Ljava/lang/String;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    const-string v2, "parse(...)"

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x2

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, v1, v2, v3, v2}, Lay/a;-><init>(Landroid/net/Uri;Landroid/os/Bundle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->h4()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 47
    move-result-object v1

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move-object v1, v2

    .line 50
    .line 51
    :goto_0
    const-string v5, "currency"

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v5, v1}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 58
    .line 59
    const-string v5, "dark"

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v5, v1}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    .line 66
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    const-string v3, "loading"

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v3, v1}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    sget-object v1, Lcom/kubi/sdk/function/language/a;->g:Lcom/kubi/sdk/function/language/LanguageType;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Lcom/kubi/sdk/function/language/LanguageType;->getLocalString()Ljava/lang/String;

    .line 79
    move-result-object v1

    .line 80
    .line 81
    const-string v3, "lang"

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v3, v1}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->h4()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 89
    move-result-object p0

    .line 90
    .line 91
    if-eqz p0, :cond_1

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 95
    move-result-object v2

    .line 96
    .line 97
    :cond_1
    const-string p0, "scroll_currency"

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, p0, v2}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 101
    move-result-object p0

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lay/a;->h()Ljava/lang/String;

    .line 105
    move-result-object v5

    .line 106
    .line 107
    const/16 v12, 0x7e

    .line 108
    const/4 v13, 0x0

    .line 109
    const/4 v6, 0x0

    .line 110
    const/4 v7, 0x0

    .line 111
    const/4 v8, 0x0

    .line 112
    const/4 v9, 0x0

    .line 113
    const/4 v10, 0x0

    .line 114
    const/4 v11, 0x0

    .line 115
    .line 116
    .line 117
    invoke-static/range {v4 .. v13}, Lg00/r$a;->a(Lg00/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

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
.end method

.method public static final v5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)Lkotlin/Unit;
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->k5()Lorg/json/JSONObject;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "B1mainAccountDetail"

    .line 7
    .line 8
    const-string v2, "deposit"

    .line 9
    .line 10
    const-string v3, "1"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2, v3, v0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 14
    .line 15
    sget-object v4, Lf00/a;->a:Lf00/a;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->h4()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 19
    move-result-object p0

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 25
    move-result-object p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    move-result-object v5

    .line 32
    .line 33
    const/16 v10, 0x1e

    .line 34
    const/4 v11, 0x0

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v9, 0x0

    .line 39
    .line 40
    .line 41
    invoke-static/range {v4 .. v11}, Lg00/j$a;->f(Lg00/j;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 44
    return-object p0
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
.end method

.method public static final w5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)Lkotlin/Unit;
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->k5()Lorg/json/JSONObject;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "B1mainAccountDetail"

    .line 7
    .line 8
    const-string v2, "withdraw"

    .line 9
    .line 10
    const-string v3, "1"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2, v3, v0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 14
    .line 15
    sget-object v4, Lf00/a;->a:Lf00/a;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->h4()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 19
    move-result-object p0

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 25
    move-result-object p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    move-result-object v5

    .line 32
    .line 33
    const/16 v10, 0x1e

    .line 34
    const/4 v11, 0x0

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v9, 0x0

    .line 39
    .line 40
    .line 41
    invoke-static/range {v4 .. v11}, Lg00/j$a;->h(Lg00/j;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 44
    return-object p0
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
.end method

.method public static final x5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)Lkotlin/Unit;
    .locals 14

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->k5()Lorg/json/JSONObject;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "B1mainAccountDetail"

    .line 7
    .line 8
    const-string v2, "transfer"

    .line 9
    .line 10
    const-string v3, "1"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2, v3, v0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 14
    .line 15
    sget-object v4, Lcom/kubi/data/coin/TransferJumper;->a:Lcom/kubi/data/coin/TransferJumper$Companion;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->h4()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 19
    move-result-object p0

    .line 20
    const/4 v0, 0x0

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 26
    move-result-object p0

    .line 27
    move-object v5, p0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v5, v0

    .line 30
    :goto_0
    const/4 p0, 0x4

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v2, v0, p0, v0}, Lqq/m;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 34
    move-result-object v11

    .line 35
    const/4 v12, 0x6

    .line 36
    const/4 v13, 0x0

    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x0

    .line 39
    .line 40
    const-string v8, "MAIN"

    .line 41
    .line 42
    const-string v9, "TRADE"

    .line 43
    const/4 v10, 0x1

    .line 44
    .line 45
    .line 46
    invoke-static/range {v4 .. v13}, Lcom/kubi/data/coin/TransferJumper$Companion;->jumpToTransfer$default(Lcom/kubi/data/coin/TransferJumper$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    .line 47
    .line 48
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
.end method

.method public static final y5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)Lkotlin/Unit;
    .locals 13

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->k5()Lorg/json/JSONObject;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "B1mainAccountDetail"

    .line 7
    .line 8
    const-string v2, "deposit"

    .line 9
    .line 10
    const-string v3, "1"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2, v3, v0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 14
    .line 15
    sget-object v4, Lf00/a;->a:Lf00/a;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->h4()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 19
    move-result-object p0

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 25
    move-result-object p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    move-result-object v5

    .line 32
    .line 33
    const/16 v11, 0x3e

    .line 34
    const/4 v12, 0x0

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v9, 0x0

    .line 39
    const/4 v10, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static/range {v4 .. v12}, Lg00/a$a;->e(Lg00/a;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 45
    return-object p0
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
.end method

.method public static final z5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)Lkotlin/Unit;
    .locals 14

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->k5()Lorg/json/JSONObject;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "B1mainAccountDetail"

    .line 7
    .line 8
    const-string v2, "withdraw"

    .line 9
    .line 10
    const-string v3, "1"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2, v3, v0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 14
    .line 15
    sget-object v4, Lf00/a;->a:Lf00/a;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->h4()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 19
    move-result-object p0

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 25
    move-result-object p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    move-result-object v5

    .line 32
    .line 33
    const/16 v12, 0x7e

    .line 34
    const/4 v13, 0x0

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v9, 0x0

    .line 39
    const/4 v10, 0x0

    .line 40
    const/4 v11, 0x0

    .line 41
    .line 42
    .line 43
    invoke-static/range {v4 .. v13}, Lg00/a$a;->m(Lg00/a;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 46
    return-object p0
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
.end method


# virtual methods
.method public c4()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->h4()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/data/entity/CoinInfoEntity;->isDigital()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    move-result-object v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    const/4 v1, 0x1

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const-string v0, "MAIN"

    .line 26
    return-object v0

    .line 27
    .line 28
    :cond_1
    const-string v0, "FIAT"

    .line 29
    return-object v0
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
.end method

.method public final d5(Lcom/kubi/data/entity/CoinInfoEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .param p1    # Lcom/kubi/data/entity/CoinInfoEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/data/entity/CoinInfoEntity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/assets/detail/BaseAccountDetailFragment$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetB2CItem$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetB2CItem$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetB2CItem$1;->label:I

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
    iput v1, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetB2CItem$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetB2CItem$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetB2CItem$1;-><init>(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetB2CItem$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetB2CItem$1;->label:I

    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    const/4 v5, 0x0

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    if-eq v2, v4, :cond_2

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    iget-object p1, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetB2CItem$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Ljava/lang/String;

    .line 46
    .line 47
    iget-object p1, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetB2CItem$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lcom/kubi/data/entity/CoinInfoEntity;

    .line 50
    .line 51
    .line 52
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    goto :goto_4

    .line 54
    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    throw p1

    .line 62
    .line 63
    :cond_2
    iget-object p1, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetB2CItem$1;->L$1:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Ljava/lang/String;

    .line 66
    .line 67
    iget-object v2, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetB2CItem$1;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Lcom/kubi/data/entity/CoinInfoEntity;

    .line 70
    .line 71
    .line 72
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 73
    move-object p2, p1

    .line 74
    move-object p1, v2

    .line 75
    goto :goto_2

    .line 76
    .line 77
    .line 78
    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 79
    .line 80
    sget-object p2, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->LEND:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 81
    .line 82
    .line 83
    invoke-static {p2}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 84
    move-result p2

    .line 85
    .line 86
    if-nez p2, :cond_4

    .line 87
    return-object v5

    .line 88
    .line 89
    :cond_4
    if-eqz p1, :cond_5

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/kubi/data/entity/CoinInfoEntity;->getCurrency()Ljava/lang/String;

    .line 93
    move-result-object p2

    .line 94
    goto :goto_1

    .line 95
    :cond_5
    move-object p2, v5

    .line 96
    .line 97
    :goto_1
    if-eqz p2, :cond_e

    .line 98
    .line 99
    .line 100
    invoke-static {p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 101
    move-result v2

    .line 102
    .line 103
    if-eqz v2, :cond_6

    .line 104
    .line 105
    goto/16 :goto_6

    .line 106
    .line 107
    :cond_6
    sget-object v2, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 108
    .line 109
    iput-object p1, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetB2CItem$1;->L$0:Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    move-result-object v6

    .line 114
    .line 115
    iput-object v6, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetB2CItem$1;->L$1:Ljava/lang/Object;

    .line 116
    .line 117
    iput v4, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetB2CItem$1;->label:I

    .line 118
    .line 119
    .line 120
    invoke-static {v2, v5, v0, v4, v5}, Lcom/kubi/assets/service/AssetsHelper;->e(Lcom/kubi/assets/service/AssetsHelper;Lio/reactivex/functions/Consumer;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 121
    move-result-object v2

    .line 122
    .line 123
    if-ne v2, v1, :cond_7

    .line 124
    goto :goto_3

    .line 125
    .line 126
    :cond_7
    :goto_2
    sget-object v2, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 127
    .line 128
    iput-object p1, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetB2CItem$1;->L$0:Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    move-result-object p2

    .line 133
    .line 134
    iput-object p2, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetB2CItem$1;->L$1:Ljava/lang/Object;

    .line 135
    .line 136
    iput v3, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetB2CItem$1;->label:I

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v0}, Lcom/kubi/assets/service/AssetsHelper;->f(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 140
    move-result-object p2

    .line 141
    .line 142
    if-ne p2, v1, :cond_8

    .line 143
    :goto_3
    return-object v1

    .line 144
    .line 145
    :cond_8
    :goto_4
    check-cast p2, Ljava/util/List;

    .line 146
    .line 147
    .line 148
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 149
    move-result v0

    .line 150
    .line 151
    if-eqz v0, :cond_9

    .line 152
    return-object v5

    .line 153
    .line 154
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    .line 155
    .line 156
    .line 157
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 158
    .line 159
    .line 160
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 161
    move-result-object p2

    .line 162
    .line 163
    .line 164
    :cond_a
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    move-result v1

    .line 166
    .line 167
    if-eqz v1, :cond_c

    .line 168
    .line 169
    .line 170
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    move-result-object v1

    .line 172
    move-object v2, v1

    .line 173
    .line 174
    check-cast v2, Lcom/kubi/assets/entity/B2CLoanEntity;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2}, Lcom/kubi/assets/entity/B2CLoanEntity;->getCurrency()Ljava/lang/String;

    .line 178
    move-result-object v2

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 182
    move-result-object v3

    .line 183
    .line 184
    if-nez v3, :cond_b

    .line 185
    .line 186
    const-string v3, ""

    .line 187
    .line 188
    .line 189
    :cond_b
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    move-result v2

    .line 191
    .line 192
    if-eqz v2, :cond_a

    .line 193
    .line 194
    .line 195
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 196
    goto :goto_5

    .line 197
    .line 198
    .line 199
    :cond_c
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 200
    move-result p1

    .line 201
    .line 202
    if-eqz p1, :cond_d

    .line 203
    return-object v5

    .line 204
    .line 205
    :cond_d
    const-string p1, "2"

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->k5()Lorg/json/JSONObject;

    .line 209
    move-result-object p2

    .line 210
    .line 211
    const-string v1, "B1mainAccountDetail"

    .line 212
    .line 213
    const-string v2, "assets"

    .line 214
    .line 215
    .line 216
    invoke-static {v1, v2, p1, p2}, Lqq/m;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 217
    .line 218
    new-instance p1, Lcom/kubi/assets/detail/BaseAccountDetailFragment$a;

    .line 219
    .line 220
    sget p2, Lcom/kubi/assets/R$drawable;->ic2_buy_crypto2_20:I

    .line 221
    .line 222
    sget v1, Lcom/kubi/assets/R$string;->assets_earns_interest:I

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 226
    move-result-object v1

    .line 227
    .line 228
    const-string v2, "getString(...)"

    .line 229
    .line 230
    .line 231
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 232
    .line 233
    new-instance v2, Lcom/kubi/assets/main/detail/h;

    .line 234
    .line 235
    .line 236
    invoke-direct {v2, p0, v0}, Lcom/kubi/assets/main/detail/h;-><init>(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Ljava/util/List;)V

    .line 237
    .line 238
    .line 239
    invoke-direct {p1, p2, v1, v2}, Lcom/kubi/assets/detail/BaseAccountDetailFragment$a;-><init>(ILjava/lang/String;Lio/reactivex/functions/Action;)V

    .line 240
    return-object p1

    .line 241
    :cond_e
    :goto_6
    return-object v5
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

.method public final f5(Lcom/kubi/data/entity/CoinInfoEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .param p1    # Lcom/kubi/data/entity/CoinInfoEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/data/entity/CoinInfoEntity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/assets/detail/BaseAccountDetailFragment$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetConvertItem$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetConvertItem$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetConvertItem$1;->label:I

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
    iput v1, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetConvertItem$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetConvertItem$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetConvertItem$1;-><init>(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetConvertItem$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetConvertItem$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    iget-object p1, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetConvertItem$1;->L$1:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Ljava/lang/String;

    .line 43
    .line 44
    iget-object v0, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetConvertItem$1;->L$0:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lcom/kubi/data/entity/CoinInfoEntity;

    .line 47
    .line 48
    .line 49
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    goto :goto_2

    .line 51
    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    throw p1

    .line 59
    .line 60
    .line 61
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 62
    .line 63
    sget-object p2, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Convert:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 64
    .line 65
    .line 66
    invoke-static {p2}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 67
    move-result p2

    .line 68
    .line 69
    if-nez p2, :cond_3

    .line 70
    return-object v4

    .line 71
    .line 72
    :cond_3
    if-eqz p1, :cond_4

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 76
    move-result-object p2

    .line 77
    goto :goto_1

    .line 78
    :cond_4
    move-object p2, v4

    .line 79
    .line 80
    :goto_1
    if-eqz p2, :cond_7

    .line 81
    .line 82
    .line 83
    invoke-static {p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 84
    move-result v2

    .line 85
    .line 86
    if-eqz v2, :cond_5

    .line 87
    goto :goto_3

    .line 88
    .line 89
    .line 90
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->d4()Lcom/kubi/assets/h0;

    .line 91
    move-result-object v2

    .line 92
    .line 93
    .line 94
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    move-result-object p1

    .line 96
    .line 97
    iput-object p1, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetConvertItem$1;->L$0:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object p2, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetConvertItem$1;->L$1:Ljava/lang/Object;

    .line 100
    .line 101
    iput v3, v0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$asyncGetConvertItem$1;->label:I

    .line 102
    .line 103
    .line 104
    invoke-interface {v2, p2, v0}, Lcom/kubi/assets/h0;->D0(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 105
    move-result-object p1

    .line 106
    .line 107
    if-ne p1, v1, :cond_6

    .line 108
    return-object v1

    .line 109
    :cond_6
    move-object v5, p2

    .line 110
    move-object p2, p1

    .line 111
    move-object p1, v5

    .line 112
    .line 113
    :goto_2
    check-cast p2, Lcom/kubi/sdk/base/entity/BaseEntity;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2}, Lcom/kubi/sdk/base/entity/BaseEntity;->getSuccess()Z

    .line 117
    move-result v0

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2}, Lcom/kubi/sdk/base/entity/BaseEntity;->getData()Ljava/lang/Object;

    .line 121
    move-result-object p2

    .line 122
    .line 123
    const-string v1, "getData(...)"

    .line 124
    .line 125
    .line 126
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    check-cast p2, Ljava/lang/Boolean;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 132
    move-result p2

    .line 133
    and-int/2addr p2, v0

    .line 134
    .line 135
    if-eqz p2, :cond_7

    .line 136
    .line 137
    const-string p2, "5"

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->k5()Lorg/json/JSONObject;

    .line 141
    move-result-object v0

    .line 142
    .line 143
    const-string v1, "B1mainAccountDetail"

    .line 144
    .line 145
    const-string v2, "assets"

    .line 146
    .line 147
    .line 148
    invoke-static {v1, v2, p2, v0}, Lqq/m;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 149
    .line 150
    new-instance p2, Lcom/kubi/assets/detail/BaseAccountDetailFragment$a;

    .line 151
    .line 152
    sget v0, Lcom/kubi/assets/R$drawable;->ic2_convert_20:I

    .line 153
    .line 154
    sget v1, Lcom/kubi/assets/R$string;->coin_convert:I

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 158
    move-result-object v1

    .line 159
    .line 160
    const-string v2, "getString(...)"

    .line 161
    .line 162
    .line 163
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    new-instance v2, Lcom/kubi/assets/main/detail/g;

    .line 166
    .line 167
    .line 168
    invoke-direct {v2, p0, p1}, Lcom/kubi/assets/main/detail/g;-><init>(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-direct {p2, v0, v1, v2}, Lcom/kubi/assets/detail/BaseAccountDetailFragment$a;-><init>(ILjava/lang/String;Lio/reactivex/functions/Action;)V

    .line 172
    return-object p2

    .line 173
    :cond_7
    :goto_3
    return-object v4
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

.method public final g4()Lta/n5;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->h0:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->l0:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lta/n5;

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
.end method

.method public h5(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/AccountDetailEntity;)V
    .locals 9
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/assets/entity/AccountDetailEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "helper"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "item"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget v0, Lcom/kubi/assets/R$id;->tv_amount:I

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Lcom/kubi/assets/entity/AccountDetailEntity;->getDirectionSymbol()Ljava/lang/String;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    new-instance v2, Ljava/math/BigDecimal;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Lcom/kubi/assets/entity/AccountDetailEntity;->getAmount()D

    .line 30
    move-result-wide v3

    .line 31
    .line 32
    .line 33
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    .line 37
    invoke-direct {v2, v3}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->h4()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 41
    move-result-object v3

    .line 42
    const/4 v4, 0x0

    .line 43
    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 48
    move-result-object v3

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move-object v3, v4

    .line 51
    :goto_0
    const/4 v5, 0x0

    .line 52
    const/4 v6, 0x2

    .line 53
    .line 54
    .line 55
    invoke-static {v2, v3, v5, v6, v4}, Lgf/i;->b(Ljava/math/BigDecimal;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    iget-object v2, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, v2}, Lcom/kubi/assets/entity/AccountDetailEntity;->getDirectionColor(Landroid/content/Context;)I

    .line 73
    move-result v2

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v0, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 77
    .line 78
    sget v0, Lcom/kubi/assets/R$id;->tv_type:I

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2}, Lcom/kubi/assets/entity/AccountDetailEntity;->getBizTypeNameString()Ljava/lang/String;

    .line 82
    move-result-object v1

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 86
    .line 87
    sget v0, Lcom/kubi/assets/R$id;->tv_time:I

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2}, Lcom/kubi/assets/entity/AccountDetailEntity;->getTradeDate()J

    .line 91
    move-result-wide v1

    .line 92
    .line 93
    const/16 v7, 0x9

    .line 94
    const/4 v8, 0x0

    .line 95
    const/4 v3, 0x0

    .line 96
    const/4 v4, 0x1

    .line 97
    const/4 v5, 0x1

    .line 98
    const/4 v6, 0x0

    .line 99
    .line 100
    .line 101
    invoke-static/range {v1 .. v8}, Llf/a;->f(JLjava/util/Locale;ZZLjava/util/TimeZone;ILjava/lang/Object;)Ljava/lang/String;

    .line 102
    move-result-object v1

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 106
    .line 107
    iget-object v2, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 108
    .line 109
    const-string p1, "itemView"

    .line 110
    .line 111
    .line 112
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    new-instance v5, Lcom/kubi/assets/main/detail/f;

    .line 115
    .line 116
    .line 117
    invoke-direct {v5, p0, p2}, Lcom/kubi/assets/main/detail/f;-><init>(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Lcom/kubi/assets/entity/AccountDetailEntity;)V

    .line 118
    const/4 v6, 0x1

    .line 119
    const/4 v7, 0x0

    .line 120
    .line 121
    const-wide/16 v3, 0x0

    .line 122
    .line 123
    .line 124
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 125
    return-void
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

.method public final k5()Lorg/json/JSONObject;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->i0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lorg/json/JSONObject;

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

.method public final l5()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iget-object v2, p0, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->j0:Lkotlinx/coroutines/CoroutineExceptionHandler;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    new-instance v3, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$initAsnycAssetsHeaderItems$1;

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, p0, v2}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment$initAsnycAssetsHeaderItems$1;-><init>(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Lkotlin/coroutines/Continuation;)V

    .line 21
    const/4 v4, 0x2

    .line 22
    const/4 v5, 0x0

    .line 23
    .line 24
    .line 25
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 26
    return-void
    .line 27
.end method

.method public lazyLoad()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->lazyLoad()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->d4()Lcom/kubi/assets/h0;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->h4()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 17
    move-result-object v1

    .line 18
    :goto_0
    move-object v2, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const/4 v1, 0x0

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :goto_1
    const/16 v5, 0xc

    .line 24
    const/4 v6, 0x0

    .line 25
    .line 26
    const-string v1, "MAIN"

    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    .line 30
    .line 31
    invoke-static/range {v0 .. v6}, Lcom/kubi/assets/h0;->i1(Lcom/kubi/assets/h0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lcom/kubi/sdk/util/a1;->m()Lio/reactivex/ObservableTransformer;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    new-instance v1, Lcom/kubi/assets/main/detail/b;

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, p0}, Lcom/kubi/assets/main/detail/b;-><init>(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V

    .line 46
    .line 47
    new-instance v2, Lcom/kubi/assets/main/detail/c;

    .line 48
    .line 49
    .line 50
    invoke-direct {v2, v1}, Lcom/kubi/assets/main/detail/c;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 51
    .line 52
    new-instance v1, Lcom/kubi/assets/main/detail/d;

    .line 53
    .line 54
    .line 55
    invoke-direct {v1, p0}, Lcom/kubi/assets/main/detail/d;-><init>(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V

    .line 56
    .line 57
    new-instance v3, Lcom/kubi/assets/main/detail/e;

    .line 58
    .line 59
    .line 60
    invoke-direct {v3, v1}, Lcom/kubi/assets/main/detail/e;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    const-string v1, "subscribe(...)"

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    const-string v2, "getCompositeDisposable(...)"

    .line 76
    .line 77
    .line 78
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v0, v1}, Lio/reactivex/rxkotlin/DisposableKt;->addTo(Lio/reactivex/disposables/Disposable;Lio/reactivex/disposables/CompositeDisposable;)Lio/reactivex/disposables/Disposable;

    .line 82
    return-void
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

.method public final m5(Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;)V
    .locals 22

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->g4()Lta/n5;

    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    const-string v4, "- -"

    .line 11
    const/4 v5, 0x0

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    iget-object v1, v1, Lta/n5;->e:Lcom/kubi/assets/detail/AccountDetailHeaderView;

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;->getTotalBalance()Ljava/math/BigDecimal;

    .line 23
    move-result-object v6

    .line 24
    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 29
    move-result-object v7

    .line 30
    .line 31
    .line 32
    invoke-static {v6, v7, v3, v2, v5}, Lgf/i;->b(Ljava/math/BigDecimal;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 33
    move-result-object v6

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v6, v5

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-static {v6, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    move-result-object v6

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    .line 44
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;->getTotalBalance()Ljava/math/BigDecimal;

    .line 45
    move-result-object v7

    .line 46
    .line 47
    if-eqz v7, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 51
    move-result-object v8

    .line 52
    .line 53
    .line 54
    invoke-static {v7, v8}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 55
    move-result-wide v9

    .line 56
    .line 57
    const/16 v18, 0x7f

    .line 58
    .line 59
    const/16 v19, 0x0

    .line 60
    const/4 v11, 0x0

    .line 61
    const/4 v12, 0x0

    .line 62
    const/4 v13, 0x0

    .line 63
    const/4 v14, 0x0

    .line 64
    const/4 v15, 0x0

    .line 65
    .line 66
    const/16 v16, 0x0

    .line 67
    .line 68
    const/16 v17, 0x0

    .line 69
    .line 70
    .line 71
    invoke-static/range {v9 .. v19}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 72
    move-result-object v7

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    move-object v7, v5

    .line 75
    .line 76
    .line 77
    :goto_1
    invoke-static {v7, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    move-result-object v7

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v6, v7}, Lcom/kubi/assets/detail/AccountDetailHeaderView;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 84
    .line 85
    .line 86
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    new-instance v6, Lcom/kubi/assets/detail/BaseAccountDetailFragment$b;

    .line 89
    .line 90
    sget v7, Lcom/kubi/assets/R$string;->useful:I

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 94
    move-result-object v7

    .line 95
    .line 96
    if-eqz p1, :cond_3

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;->getAvailableBalance()Ljava/math/BigDecimal;

    .line 100
    move-result-object v8

    .line 101
    .line 102
    if-eqz v8, :cond_3

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 106
    move-result-object v9

    .line 107
    .line 108
    .line 109
    invoke-static {v8, v9, v3, v2, v5}, Lgf/i;->b(Ljava/math/BigDecimal;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 110
    move-result-object v8

    .line 111
    goto :goto_2

    .line 112
    :cond_3
    move-object v8, v5

    .line 113
    .line 114
    .line 115
    :goto_2
    invoke-static {v8, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    move-result-object v8

    .line 117
    .line 118
    if-eqz p1, :cond_4

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;->getAvailableBalance()Ljava/math/BigDecimal;

    .line 122
    move-result-object v9

    .line 123
    .line 124
    if-eqz v9, :cond_4

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 128
    move-result-object v10

    .line 129
    .line 130
    .line 131
    invoke-static {v9, v10}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 132
    move-result-wide v11

    .line 133
    .line 134
    const/16 v20, 0x7f

    .line 135
    .line 136
    const/16 v21, 0x0

    .line 137
    const/4 v13, 0x0

    .line 138
    const/4 v14, 0x0

    .line 139
    const/4 v15, 0x0

    .line 140
    .line 141
    const/16 v16, 0x0

    .line 142
    .line 143
    const/16 v17, 0x0

    .line 144
    .line 145
    const/16 v18, 0x0

    .line 146
    .line 147
    const/16 v19, 0x0

    .line 148
    .line 149
    .line 150
    invoke-static/range {v11 .. v21}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 151
    move-result-object v9

    .line 152
    goto :goto_3

    .line 153
    :cond_4
    move-object v9, v5

    .line 154
    .line 155
    .line 156
    :goto_3
    invoke-static {v9, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 157
    move-result-object v9

    .line 158
    .line 159
    const/16 v15, 0xf8

    .line 160
    .line 161
    const/16 v16, 0x0

    .line 162
    const/4 v10, 0x0

    .line 163
    const/4 v11, 0x0

    .line 164
    const/4 v12, 0x0

    .line 165
    const/4 v13, 0x0

    .line 166
    const/4 v14, 0x0

    .line 167
    .line 168
    .line 169
    invoke-direct/range {v6 .. v16}, Lcom/kubi/assets/detail/BaseAccountDetailFragment$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Lio/reactivex/functions/Action;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    new-instance v7, Lcom/kubi/assets/detail/BaseAccountDetailFragment$b;

    .line 175
    .line 176
    sget v6, Lcom/kubi/assets/R$string;->lock:I

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 180
    move-result-object v8

    .line 181
    .line 182
    if-eqz p1, :cond_5

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;->getHoldBalance()Ljava/math/BigDecimal;

    .line 186
    move-result-object v6

    .line 187
    .line 188
    if-eqz v6, :cond_5

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 192
    move-result-object v9

    .line 193
    .line 194
    .line 195
    invoke-static {v6, v9, v3, v2, v5}, Lgf/i;->b(Ljava/math/BigDecimal;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 196
    move-result-object v2

    .line 197
    goto :goto_4

    .line 198
    :cond_5
    move-object v2, v5

    .line 199
    .line 200
    .line 201
    :goto_4
    invoke-static {v2, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 202
    move-result-object v9

    .line 203
    .line 204
    if-eqz p1, :cond_6

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;->getHoldBalance()Ljava/math/BigDecimal;

    .line 208
    move-result-object v2

    .line 209
    .line 210
    if-eqz v2, :cond_6

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 214
    move-result-object v3

    .line 215
    .line 216
    .line 217
    invoke-static {v2, v3}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 218
    move-result-wide v10

    .line 219
    .line 220
    const/16 v19, 0x7f

    .line 221
    .line 222
    const/16 v20, 0x0

    .line 223
    const/4 v12, 0x0

    .line 224
    const/4 v13, 0x0

    .line 225
    const/4 v14, 0x0

    .line 226
    const/4 v15, 0x0

    .line 227
    .line 228
    const/16 v16, 0x0

    .line 229
    .line 230
    const/16 v17, 0x0

    .line 231
    .line 232
    const/16 v18, 0x0

    .line 233
    .line 234
    .line 235
    invoke-static/range {v10 .. v20}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 236
    move-result-object v5

    .line 237
    .line 238
    .line 239
    :cond_6
    invoke-static {v5, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 240
    move-result-object v10

    .line 241
    .line 242
    const/16 v16, 0xf0

    .line 243
    .line 244
    const/16 v17, 0x0

    .line 245
    const/4 v11, 0x1

    .line 246
    const/4 v12, 0x0

    .line 247
    const/4 v13, 0x0

    .line 248
    const/4 v14, 0x0

    .line 249
    const/4 v15, 0x0

    .line 250
    .line 251
    .line 252
    invoke-direct/range {v7 .. v17}, Lcom/kubi/assets/detail/BaseAccountDetailFragment$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Lio/reactivex/functions/Action;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0, v1}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->C4(Ljava/util/List;)V

    .line 259
    return-void
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
.end method

.method public bridge synthetic o3(Lio/chad/library/adapter/base/BaseViewHolder;Landroid/os/Parcelable;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/assets/entity/AccountDetailEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->h5(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/AccountDetailEntity;)V

    .line 6
    return-void
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

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 12
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
    invoke-super {p0, p1, p2}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 9
    .line 10
    new-instance p1, Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->h4()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 17
    move-result-object p2

    .line 18
    const/4 v0, 0x0

    .line 19
    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Lcom/kubi/data/entity/CoinInfoEntity;->isDigital()Z

    .line 24
    move-result p2

    .line 25
    .line 26
    .line 27
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    move-result-object p2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object p2, v0

    .line 31
    :goto_0
    const/4 v1, 0x1

    .line 32
    .line 33
    .line 34
    invoke-static {p2, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 35
    move-result p2

    .line 36
    .line 37
    const-string v2, "getString(...)"

    .line 38
    .line 39
    const-string v3, "assets"

    .line 40
    .line 41
    const-string v4, "B1mainAccountDetail"

    .line 42
    .line 43
    if-nez p2, :cond_1

    .line 44
    .line 45
    sget-object p2, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->FastTrade:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 46
    .line 47
    .line 48
    invoke-static {p2}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 49
    move-result p2

    .line 50
    .line 51
    if-eqz p2, :cond_1

    .line 52
    .line 53
    const-string p2, "3"

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->k5()Lorg/json/JSONObject;

    .line 57
    move-result-object v5

    .line 58
    .line 59
    .line 60
    invoke-static {v4, v3, p2, v5}, Lqq/m;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 61
    .line 62
    new-instance p2, Lcom/kubi/assets/detail/BaseAccountDetailFragment$a;

    .line 63
    .line 64
    sget v5, Lcom/kubi/assets/R$drawable;->ic2_card_20:I

    .line 65
    .line 66
    sget v6, Lcom/kubi/assets/R$string;->trade:I

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 70
    move-result-object v6

    .line 71
    .line 72
    .line 73
    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    new-instance v7, Lcom/kubi/assets/main/detail/a;

    .line 76
    .line 77
    .line 78
    invoke-direct {v7, p0}, Lcom/kubi/assets/main/detail/a;-><init>(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p2, v5, v6, v7}, Lcom/kubi/assets/detail/BaseAccountDetailFragment$a;-><init>(ILjava/lang/String;Lio/reactivex/functions/Action;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->h4()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 88
    move-result-object p2

    .line 89
    .line 90
    if-eqz p2, :cond_2

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2}, Lcom/kubi/data/entity/CoinInfoEntity;->isEarnEnabled()Z

    .line 94
    move-result p2

    .line 95
    .line 96
    .line 97
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 98
    move-result-object p2

    .line 99
    goto :goto_1

    .line 100
    :cond_2
    move-object p2, v0

    .line 101
    .line 102
    .line 103
    :goto_1
    invoke-static {p2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 104
    move-result p2

    .line 105
    const/4 v5, 0x0

    .line 106
    .line 107
    if-eqz p2, :cond_5

    .line 108
    .line 109
    sget-object p2, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Financing:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 110
    .line 111
    .line 112
    invoke-static {p2}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 113
    move-result p2

    .line 114
    .line 115
    if-eqz p2, :cond_5

    .line 116
    .line 117
    const-string p2, "4"

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->k5()Lorg/json/JSONObject;

    .line 121
    move-result-object v6

    .line 122
    .line 123
    .line 124
    invoke-static {v4, v3, p2, v6}, Lqq/m;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 125
    .line 126
    sget-object p2, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 127
    .line 128
    sget-object v6, Lcom/kubi/sdk/site/info/SiteInfoManager;->a:Lcom/kubi/sdk/site/info/SiteInfoManager;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v6}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 132
    move-result-object v6

    .line 133
    .line 134
    const-class v7, Lzf/j0;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2, v7, v6}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 138
    move-result-object p2

    .line 139
    .line 140
    if-eqz p2, :cond_3

    .line 141
    .line 142
    check-cast p2, Lzf/j0;

    .line 143
    .line 144
    .line 145
    invoke-interface {p2}, Lzf/j0;->a()Z

    .line 146
    move-result p2

    .line 147
    goto :goto_2

    .line 148
    :cond_3
    move p2, v5

    .line 149
    .line 150
    :goto_2
    if-eqz p2, :cond_4

    .line 151
    .line 152
    sget p2, Lcom/kubi/assets/R$string;->homepage_stake:I

    .line 153
    goto :goto_3

    .line 154
    .line 155
    :cond_4
    sget p2, Lcom/kubi/assets/R$string;->account_earn:I

    .line 156
    .line 157
    :goto_3
    new-instance v6, Lcom/kubi/assets/detail/BaseAccountDetailFragment$a;

    .line 158
    .line 159
    sget v7, Lcom/kubi/assets/R$drawable;->ic2_earn_pig_20:I

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 163
    move-result-object p2

    .line 164
    .line 165
    .line 166
    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    .line 168
    new-instance v8, Lcom/kubi/assets/main/detail/i;

    .line 169
    .line 170
    .line 171
    invoke-direct {v8, p0}, Lcom/kubi/assets/main/detail/i;-><init>(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V

    .line 172
    .line 173
    .line 174
    invoke-direct {v6, v7, p2, v8}, Lcom/kubi/assets/detail/BaseAccountDetailFragment$a;-><init>(ILjava/lang/String;Lio/reactivex/functions/Action;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    :cond_5
    sget-object p2, Lcom/kubi/redpackage/api/IRedPackageService;->a:Lcom/kubi/redpackage/api/IRedPackageService$Companion;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p2}, Lcom/kubi/redpackage/api/IRedPackageService$Companion;->get()Lcom/kubi/redpackage/api/IRedPackageService;

    .line 183
    move-result-object p2

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->h4()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 187
    move-result-object v6

    .line 188
    .line 189
    if-eqz v6, :cond_6

    .line 190
    .line 191
    .line 192
    invoke-virtual {v6}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 193
    move-result-object v6

    .line 194
    goto :goto_4

    .line 195
    :cond_6
    move-object v6, v0

    .line 196
    .line 197
    :goto_4
    if-nez v6, :cond_7

    .line 198
    .line 199
    const-string v6, ""

    .line 200
    .line 201
    .line 202
    :cond_7
    invoke-interface {p2, v6}, Lcom/kubi/redpackage/api/IRedPackageService;->b(Ljava/lang/String;)Z

    .line 203
    move-result p2

    .line 204
    .line 205
    if-eqz p2, :cond_8

    .line 206
    .line 207
    .line 208
    invoke-static {}, Lcom/kubi/sdk/site/a;->a()Z

    .line 209
    move-result p2

    .line 210
    .line 211
    if-eqz p2, :cond_8

    .line 212
    .line 213
    const-string p2, "1"

    .line 214
    .line 215
    .line 216
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->k5()Lorg/json/JSONObject;

    .line 217
    move-result-object v6

    .line 218
    .line 219
    .line 220
    invoke-static {v4, v3, p2, v6}, Lqq/m;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 221
    .line 222
    new-instance p2, Lcom/kubi/assets/detail/BaseAccountDetailFragment$a;

    .line 223
    .line 224
    sget v3, Lcom/kubi/assets/R$drawable;->ic2_red_envelop_20:I

    .line 225
    .line 226
    sget v4, Lcom/kubi/assets/R$string;->red_package:I

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 230
    move-result-object v4

    .line 231
    .line 232
    .line 233
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 234
    .line 235
    new-instance v2, Lcom/kubi/assets/main/detail/j;

    .line 236
    .line 237
    .line 238
    invoke-direct {v2, p0}, Lcom/kubi/assets/main/detail/j;-><init>(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V

    .line 239
    .line 240
    .line 241
    invoke-direct {p2, v3, v4, v2}, Lcom/kubi/assets/detail/BaseAccountDetailFragment$a;-><init>(ILjava/lang/String;Lio/reactivex/functions/Action;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    :cond_8
    invoke-virtual {p0, p1}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->B4(Ljava/util/List;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->h4()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 251
    move-result-object p1

    .line 252
    .line 253
    if-eqz p1, :cond_9

    .line 254
    .line 255
    .line 256
    invoke-virtual {p1}, Lcom/kubi/data/entity/CoinInfoEntity;->isDigital()Z

    .line 257
    move-result p1

    .line 258
    .line 259
    .line 260
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 261
    move-result-object p1

    .line 262
    goto :goto_5

    .line 263
    :cond_9
    move-object p1, v0

    .line 264
    .line 265
    .line 266
    :goto_5
    invoke-static {p1, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 267
    move-result p1

    .line 268
    .line 269
    if-nez p1, :cond_11

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->g4()Lta/n5;

    .line 273
    move-result-object p1

    .line 274
    .line 275
    if-eqz p1, :cond_a

    .line 276
    .line 277
    iget-object p1, p1, Lta/n5;->n:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 278
    .line 279
    if-eqz p1, :cond_a

    .line 280
    .line 281
    sget-object p2, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->FiatDeposit:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 282
    .line 283
    .line 284
    invoke-static {p2}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 285
    move-result p2

    .line 286
    .line 287
    .line 288
    invoke-static {p1, p2}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 289
    .line 290
    .line 291
    :cond_a
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->g4()Lta/n5;

    .line 292
    move-result-object p1

    .line 293
    .line 294
    if-eqz p1, :cond_b

    .line 295
    .line 296
    iget-object p1, p1, Lta/n5;->n:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 297
    .line 298
    if-eqz p1, :cond_b

    .line 299
    .line 300
    sget p2, Lcom/kubi/assets/R$string;->fiat_charge:I

    .line 301
    .line 302
    .line 303
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 304
    .line 305
    .line 306
    :cond_b
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->g4()Lta/n5;

    .line 307
    move-result-object p1

    .line 308
    .line 309
    if-eqz p1, :cond_c

    .line 310
    .line 311
    iget-object v2, p1, Lta/n5;->n:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 312
    .line 313
    if-eqz v2, :cond_c

    .line 314
    .line 315
    new-instance v5, Lcom/kubi/assets/main/detail/k;

    .line 316
    .line 317
    .line 318
    invoke-direct {v5, p0}, Lcom/kubi/assets/main/detail/k;-><init>(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V

    .line 319
    const/4 v6, 0x1

    .line 320
    const/4 v7, 0x0

    .line 321
    .line 322
    const-wide/16 v3, 0x0

    .line 323
    .line 324
    .line 325
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    :cond_c
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->g4()Lta/n5;

    .line 329
    move-result-object p1

    .line 330
    .line 331
    if-eqz p1, :cond_d

    .line 332
    .line 333
    iget-object p1, p1, Lta/n5;->m:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 334
    .line 335
    if-eqz p1, :cond_d

    .line 336
    .line 337
    sget-object p2, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->FiatDeposit:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 338
    .line 339
    .line 340
    invoke-static {p2}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 341
    move-result p2

    .line 342
    .line 343
    .line 344
    invoke-static {p1, p2}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 345
    .line 346
    .line 347
    :cond_d
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->g4()Lta/n5;

    .line 348
    move-result-object p1

    .line 349
    .line 350
    if-eqz p1, :cond_e

    .line 351
    .line 352
    iget-object v2, p1, Lta/n5;->m:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 353
    .line 354
    if-eqz v2, :cond_e

    .line 355
    .line 356
    new-instance v5, Lcom/kubi/assets/main/detail/l;

    .line 357
    .line 358
    .line 359
    invoke-direct {v5, p0}, Lcom/kubi/assets/main/detail/l;-><init>(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V

    .line 360
    const/4 v6, 0x1

    .line 361
    const/4 v7, 0x0

    .line 362
    .line 363
    const-wide/16 v3, 0x0

    .line 364
    .line 365
    .line 366
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    :cond_e
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->g4()Lta/n5;

    .line 370
    move-result-object p1

    .line 371
    .line 372
    if-eqz p1, :cond_f

    .line 373
    .line 374
    iget-object p1, p1, Lta/n5;->p:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 375
    .line 376
    if-eqz p1, :cond_f

    .line 377
    .line 378
    sget p2, Lcom/kubi/assets/R$string;->transfer:I

    .line 379
    .line 380
    .line 381
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 382
    .line 383
    .line 384
    :cond_f
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->g4()Lta/n5;

    .line 385
    move-result-object p1

    .line 386
    .line 387
    if-eqz p1, :cond_10

    .line 388
    .line 389
    iget-object p1, p1, Lta/n5;->p:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 390
    .line 391
    if-eqz p1, :cond_10

    .line 392
    .line 393
    .line 394
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 395
    .line 396
    .line 397
    :cond_10
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->g4()Lta/n5;

    .line 398
    move-result-object p1

    .line 399
    .line 400
    if-eqz p1, :cond_1a

    .line 401
    .line 402
    iget-object v2, p1, Lta/n5;->p:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 403
    .line 404
    if-eqz v2, :cond_1a

    .line 405
    .line 406
    new-instance v5, Lcom/kubi/assets/main/detail/m;

    .line 407
    .line 408
    .line 409
    invoke-direct {v5, p0}, Lcom/kubi/assets/main/detail/m;-><init>(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V

    .line 410
    const/4 v6, 0x1

    .line 411
    const/4 v7, 0x0

    .line 412
    .line 413
    const-wide/16 v3, 0x0

    .line 414
    .line 415
    .line 416
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 417
    .line 418
    goto/16 :goto_7

    .line 419
    .line 420
    .line 421
    :cond_11
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->g4()Lta/n5;

    .line 422
    move-result-object p1

    .line 423
    .line 424
    if-eqz p1, :cond_13

    .line 425
    .line 426
    iget-object p1, p1, Lta/n5;->n:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 427
    .line 428
    if-eqz p1, :cond_13

    .line 429
    .line 430
    .line 431
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->h4()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 432
    move-result-object p2

    .line 433
    .line 434
    if-eqz p2, :cond_12

    .line 435
    .line 436
    .line 437
    invoke-virtual {p2}, Lcom/kubi/data/entity/CoinInfoEntity;->isEtfCoin()Z

    .line 438
    move-result p2

    .line 439
    .line 440
    if-nez p2, :cond_12

    .line 441
    move p2, v1

    .line 442
    goto :goto_6

    .line 443
    :cond_12
    move p2, v5

    .line 444
    .line 445
    .line 446
    :goto_6
    invoke-static {p1, p2}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 447
    .line 448
    .line 449
    :cond_13
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->g4()Lta/n5;

    .line 450
    move-result-object p1

    .line 451
    .line 452
    if-eqz p1, :cond_14

    .line 453
    .line 454
    iget-object p1, p1, Lta/n5;->n:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 455
    .line 456
    if-eqz p1, :cond_14

    .line 457
    .line 458
    sget p2, Lcom/kubi/assets/R$string;->deposit_coin:I

    .line 459
    .line 460
    .line 461
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 462
    .line 463
    .line 464
    :cond_14
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->g4()Lta/n5;

    .line 465
    move-result-object p1

    .line 466
    .line 467
    if-eqz p1, :cond_15

    .line 468
    .line 469
    iget-object v6, p1, Lta/n5;->n:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 470
    .line 471
    if-eqz v6, :cond_15

    .line 472
    .line 473
    new-instance v9, Lcom/kubi/assets/main/detail/n;

    .line 474
    .line 475
    .line 476
    invoke-direct {v9, p0}, Lcom/kubi/assets/main/detail/n;-><init>(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V

    .line 477
    const/4 v10, 0x1

    .line 478
    const/4 v11, 0x0

    .line 479
    .line 480
    const-wide/16 v7, 0x0

    .line 481
    .line 482
    .line 483
    invoke-static/range {v6 .. v11}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    :cond_15
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->g4()Lta/n5;

    .line 487
    move-result-object p1

    .line 488
    .line 489
    if-eqz p1, :cond_17

    .line 490
    .line 491
    iget-object p1, p1, Lta/n5;->m:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 492
    .line 493
    if-eqz p1, :cond_17

    .line 494
    .line 495
    .line 496
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->h4()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 497
    move-result-object p2

    .line 498
    .line 499
    if-eqz p2, :cond_16

    .line 500
    .line 501
    .line 502
    invoke-virtual {p2}, Lcom/kubi/data/entity/CoinInfoEntity;->isEtfCoin()Z

    .line 503
    move-result p2

    .line 504
    .line 505
    if-nez p2, :cond_16

    .line 506
    move v5, v1

    .line 507
    .line 508
    .line 509
    :cond_16
    invoke-static {p1, v5}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 510
    .line 511
    .line 512
    :cond_17
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->g4()Lta/n5;

    .line 513
    move-result-object p1

    .line 514
    .line 515
    if-eqz p1, :cond_18

    .line 516
    .line 517
    iget-object v2, p1, Lta/n5;->m:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 518
    .line 519
    if-eqz v2, :cond_18

    .line 520
    .line 521
    new-instance v5, Lcom/kubi/assets/main/detail/o;

    .line 522
    .line 523
    .line 524
    invoke-direct {v5, p0}, Lcom/kubi/assets/main/detail/o;-><init>(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V

    .line 525
    const/4 v6, 0x1

    .line 526
    const/4 v7, 0x0

    .line 527
    .line 528
    const-wide/16 v3, 0x0

    .line 529
    .line 530
    .line 531
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    :cond_18
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->g4()Lta/n5;

    .line 535
    move-result-object p1

    .line 536
    .line 537
    if-eqz p1, :cond_19

    .line 538
    .line 539
    iget-object p1, p1, Lta/n5;->p:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 540
    .line 541
    if-eqz p1, :cond_19

    .line 542
    .line 543
    .line 544
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 545
    .line 546
    .line 547
    :cond_19
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->g4()Lta/n5;

    .line 548
    move-result-object p1

    .line 549
    .line 550
    if-eqz p1, :cond_1a

    .line 551
    .line 552
    iget-object v2, p1, Lta/n5;->p:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 553
    .line 554
    if-eqz v2, :cond_1a

    .line 555
    .line 556
    new-instance v5, Lcom/kubi/assets/main/detail/p;

    .line 557
    .line 558
    .line 559
    invoke-direct {v5, p0}, Lcom/kubi/assets/main/detail/p;-><init>(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;)V

    .line 560
    const/4 v6, 0x1

    .line 561
    const/4 v7, 0x0

    .line 562
    .line 563
    const-wide/16 v3, 0x0

    .line 564
    .line 565
    .line 566
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 567
    .line 568
    .line 569
    :cond_1a
    :goto_7
    invoke-static {p0, v0, v1, v0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->n5(Lcom/kubi/assets/main/detail/MainAccountDetailFragment;Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;ILjava/lang/Object;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->l4()V

    .line 573
    .line 574
    .line 575
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->l5()V

    .line 576
    return-void
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
.end method

.method public q4()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "1"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/assets/main/detail/MainAccountDetailFragment;->k5()Lorg/json/JSONObject;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    const-string v2, "B1mainAccountDetail"

    .line 9
    .line 10
    const-string v3, "accountDetail"

    .line 11
    .line 12
    .line 13
    invoke-static {v2, v3, v0, v1}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

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
.end method

.method public r3(II)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BasePageEntity<",
            "Lcom/kubi/assets/entity/AccountDetailEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->j4()Ljava/util/HashMap;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->j4()Ljava/util/HashMap;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    move-result-object p2

    .line 16
    .line 17
    const-string v1, "size"

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->j4()Ljava/util/HashMap;

    .line 24
    move-result-object p2

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    const-string v0, "page"

    .line 31
    .line 32
    .line 33
    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->j4()Ljava/util/HashMap;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->h4()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 41
    move-result-object p2

    .line 42
    .line 43
    if-eqz p2, :cond_0

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 47
    move-result-object p2

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 p2, 0x0

    .line 50
    .line 51
    :goto_0
    if-nez p2, :cond_1

    .line 52
    .line 53
    const-string p2, ""

    .line 54
    .line 55
    :cond_1
    const-string v0, "currency"

    .line 56
    .line 57
    .line 58
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->i4()Ljava/util/ArrayList;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    new-instance p2, Ljava/util/ArrayList;

    .line 65
    .line 66
    .line 67
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    move-result-object p1

    .line 72
    .line 73
    .line 74
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    move-result v0

    .line 76
    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    move-result-object v0

    .line 82
    move-object v1, v0

    .line 83
    .line 84
    check-cast v1, Lcom/kubi/assets/filter/ParcelizePair;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Lcom/kubi/assets/filter/ParcelizePair;->getValue()Ljava/lang/String;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    .line 91
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 92
    move-result v1

    .line 93
    .line 94
    if-nez v1, :cond_2

    .line 95
    .line 96
    .line 97
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 98
    goto :goto_1

    .line 99
    .line 100
    .line 101
    :cond_3
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    move-result-object p1

    .line 103
    .line 104
    .line 105
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    move-result p2

    .line 107
    .line 108
    if-eqz p2, :cond_4

    .line 109
    .line 110
    .line 111
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    move-result-object p2

    .line 113
    .line 114
    check-cast p2, Lcom/kubi/assets/filter/ParcelizePair;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->j4()Ljava/util/HashMap;

    .line 118
    move-result-object v0

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2}, Lcom/kubi/assets/filter/ParcelizePair;->getKey()Ljava/lang/String;

    .line 122
    move-result-object v1

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2}, Lcom/kubi/assets/filter/ParcelizePair;->getValue()Ljava/lang/String;

    .line 126
    move-result-object p2

    .line 127
    .line 128
    .line 129
    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    goto :goto_2

    .line 131
    .line 132
    .line 133
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->j4()Ljava/util/HashMap;

    .line 134
    move-result-object p1

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->j4()Ljava/util/HashMap;

    .line 138
    move-result-object p2

    .line 139
    .line 140
    const-string v0, "time"

    .line 141
    .line 142
    .line 143
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    move-result-object p2

    .line 145
    .line 146
    .line 147
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 148
    move-result-object p2

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, p2}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->k4(Ljava/lang/String;)J

    .line 152
    move-result-wide v1

    .line 153
    .line 154
    .line 155
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 156
    move-result-object p2

    .line 157
    .line 158
    const-string v1, "startAt"

    .line 159
    .line 160
    .line 161
    invoke-interface {p1, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->j4()Ljava/util/HashMap;

    .line 165
    move-result-object p1

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->f4()Lcom/kubi/utils/TimeUtils$b;

    .line 169
    move-result-object p2

    .line 170
    .line 171
    iget-object p2, p2, Lcom/kubi/utils/TimeUtils$b;->b:Ljava/lang/String;

    .line 172
    .line 173
    const-string v1, "endAt"

    .line 174
    .line 175
    .line 176
    invoke-interface {p1, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->j4()Ljava/util/HashMap;

    .line 180
    move-result-object p1

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->d4()Lcom/kubi/assets/h0;

    .line 187
    move-result-object p1

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0}, Lcom/kubi/assets/detail/BaseAccountDetailFragment;->j4()Ljava/util/HashMap;

    .line 191
    move-result-object p2

    .line 192
    .line 193
    .line 194
    invoke-interface {p1, p2}, Lcom/kubi/assets/h0;->q0(Ljava/util/HashMap;)Lio/reactivex/Observable;

    .line 195
    move-result-object p1

    .line 196
    .line 197
    .line 198
    invoke-static {}, Lcom/kubi/sdk/util/a1;->m()Lio/reactivex/ObservableTransformer;

    .line 199
    move-result-object p2

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 203
    move-result-object p1

    .line 204
    .line 205
    const-string p2, "compose(...)"

    .line 206
    .line 207
    .line 208
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    return-object p1
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
