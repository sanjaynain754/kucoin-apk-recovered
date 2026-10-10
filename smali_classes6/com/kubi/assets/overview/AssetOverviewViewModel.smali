.class public final Lcom/kubi/assets/overview/AssetOverviewViewModel;
.super Lcom/kubi/mvi/state/l;
.source "AssetOverviewViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/mvi/state/l<",
        "Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0016\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0094@\u00a2\u0006\u0002\u0010\u0010J\u0008\u0010\u0011\u001a\u00020\rH\u0002J\u0016\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0094@\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0014H\u0082@\u00a2\u0006\u0002\u0010\u0015J.\u0010\u0016\u001a\u00020\r2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a2\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u001a\u0010$\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0008\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0012\u0010\'\u001a\u00020!2\u0008\u0010\"\u001a\u0004\u0018\u00010#H\u0002R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010(\u001a\u00020\u00028TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010*\u00a8\u0006+"
    }
    d2 = {
        "Lcom/kubi/assets/overview/AssetOverviewViewModel;",
        "Lcom/kubi/mvi/state/SimpleStateVM;",
        "Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;",
        "<init>",
        "()V",
        "api",
        "Lcom/kubi/assets/AssetV2Api;",
        "kotlin.jvm.PlatformType",
        "getApi",
        "()Lcom/kubi/assets/AssetV2Api;",
        "api$delegate",
        "Lkotlin/Lazy;",
        "dispatchIntentOnIO",
        "",
        "intent",
        "Lcom/kubi/mvi/state/IIntent;",
        "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "handleHideSmallAssetAccountIntent",
        "dispatchIntent",
        "handleGetRecentTransitionData",
        "Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRecentTransitionData;",
        "(Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRecentTransitionData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getListFromEntity",
        "assetV2OverviewEntity",
        "Lcom/kubi/assets/entity/AssetV2OverviewEntity;",
        "dataList",
        "",
        "Lcom/kubi/assets/entity/OverviewItemEntity;",
        "originDataList",
        "handleRangeProfitEventPoint",
        "range",
        "",
        "filterNonNullAccount",
        "",
        "account",
        "Lcom/kubi/assets/entity/OverviewAccountInfo;",
        "filterZeroSubAsset",
        "sub",
        "Lcom/kubi/data/entity/SubAssetEntity;",
        "filterZeroAssets",
        "initState",
        "getInitState",
        "()Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;",
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
        "SMAP\nAssetOverviewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOverviewViewModel.kt\ncom/kubi/assets/overview/AssetOverviewViewModel\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,400:1\n126#2,2:401\n135#2,2:416\n774#3:403\n865#3,2:404\n774#3:408\n865#3,2:409\n774#3:412\n865#3,2:413\n1869#3:415\n1870#3:418\n25#4:406\n26#4:411\n1#5:407\n*S KotlinDebug\n*F\n+ 1 AssetOverviewViewModel.kt\ncom/kubi/assets/overview/AssetOverviewViewModel\n*L\n51#1:401,2\n269#1:416,2\n113#1:403\n113#1:404,2\n232#1:408\n232#1:409,2\n255#1:412\n255#1:413,2\n258#1:415\n258#1:418\n231#1:406\n231#1:411\n231#1:407\n*E\n"
    }
.end annotation


# instance fields
.field public final W:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/mvi/state/l;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/assets/overview/a0;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/assets/overview/a0;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/assets/overview/AssetOverviewViewModel;->W:Lkotlin/Lazy;

    .line 15
    return-void
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

.method public static final A(Ljava/util/List;Ljava/util/List;Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;)Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;
    .locals 18

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    const/16 v16, 0x3ff5

    .line 10
    .line 11
    const/16 v17, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v9, 0x0

    .line 18
    const/4 v10, 0x0

    .line 19
    const/4 v11, 0x0

    .line 20
    const/4 v12, 0x0

    .line 21
    const/4 v13, 0x0

    .line 22
    const/4 v14, 0x0

    .line 23
    const/4 v15, 0x0

    .line 24
    .line 25
    move-object/from16 v3, p0

    .line 26
    .line 27
    move-object/from16 v5, p1

    .line 28
    .line 29
    .line 30
    invoke-static/range {v1 .. v17}, Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;->copy$default(Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;Lcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/util/List;Ljava/lang/Throwable;Ljava/util/List;ZZLjava/lang/Boolean;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/kubi/assets/entity/NewOverviewEntity;Lcom/kubi/assets/entity/OldOverviewEntity;ILjava/lang/Object;)Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;

    .line 31
    move-result-object v0

    .line 32
    return-object v0
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

.method public static final C(Ljava/util/List;Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;)Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;
    .locals 18

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    const/16 v16, 0x3ffd

    .line 10
    .line 11
    const/16 v17, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v7, 0x0

    .line 17
    const/4 v8, 0x0

    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v10, 0x0

    .line 20
    const/4 v11, 0x0

    .line 21
    const/4 v12, 0x0

    .line 22
    const/4 v13, 0x0

    .line 23
    const/4 v14, 0x0

    .line 24
    const/4 v15, 0x0

    .line 25
    .line 26
    move-object/from16 v3, p0

    .line 27
    .line 28
    .line 29
    invoke-static/range {v1 .. v17}, Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;->copy$default(Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;Lcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/util/List;Ljava/lang/Throwable;Ljava/util/List;ZZLjava/lang/Boolean;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/kubi/assets/entity/NewOverviewEntity;Lcom/kubi/assets/entity/OldOverviewEntity;ILjava/lang/Object;)Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;

    .line 30
    move-result-object v0

    .line 31
    return-object v0
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

.method public static synthetic b(Ljava/util/List;Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;)Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/overview/AssetOverviewViewModel;->C(Ljava/util/List;Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;)Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;

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

.method public static synthetic d(Ljava/util/List;Ljava/util/List;Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;)Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/assets/overview/AssetOverviewViewModel;->A(Ljava/util/List;Ljava/util/List;Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;)Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;

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

.method public static synthetic n()Lcom/kubi/assets/h0;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/overview/AssetOverviewViewModel;->r()Lcom/kubi/assets/h0;

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

.method public static synthetic o(Lcom/kubi/mvi/state/d;Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;)Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/overview/AssetOverviewViewModel;->s(Lcom/kubi/mvi/state/d;Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;)Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;

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

.method public static final synthetic p(Lcom/kubi/assets/overview/AssetOverviewViewModel;Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRecentTransitionData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/overview/AssetOverviewViewModel;->z(Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRecentTransitionData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

.method public static final synthetic q(Lcom/kubi/assets/overview/AssetOverviewViewModel;Lkotlin/jvm/functions/Function1;)Z
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

.method private static final r()Lcom/kubi/assets/h0;
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

.method public static final s(Lcom/kubi/mvi/state/d;Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;)Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;
    .locals 18

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    move-object/from16 v0, p0

    .line 10
    .line 11
    check-cast v0, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$HideOrShowNumber;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$HideOrShowNumber;->isChecked()Z

    .line 15
    move-result v7

    .line 16
    .line 17
    const/16 v16, 0x3fdf

    .line 18
    .line 19
    const/16 v17, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v9, 0x0

    .line 27
    const/4 v10, 0x0

    .line 28
    const/4 v11, 0x0

    .line 29
    const/4 v12, 0x0

    .line 30
    const/4 v13, 0x0

    .line 31
    const/4 v14, 0x0

    .line 32
    const/4 v15, 0x0

    .line 33
    .line 34
    .line 35
    invoke-static/range {v1 .. v17}, Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;->copy$default(Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;Lcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/util/List;Ljava/lang/Throwable;Ljava/util/List;ZZLjava/lang/Boolean;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/kubi/assets/entity/NewOverviewEntity;Lcom/kubi/assets/entity/OldOverviewEntity;ILjava/lang/Object;)Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;

    .line 36
    move-result-object v0

    .line 37
    return-object v0
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

.method private final w()Lcom/kubi/assets/h0;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/AssetOverviewViewModel;->W:Lkotlin/Lazy;

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


# virtual methods
.method public final B()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/overview/account/q;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;->getOriginDataList()Ljava/util/List;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    new-instance v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    move-result v2

    .line 30
    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    move-result-object v2

    .line 36
    move-object v3, v2

    .line 37
    .line 38
    check-cast v3, Lcom/kubi/assets/entity/OverviewItemEntity;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Lcom/kubi/assets/entity/OverviewItemEntity;->getType()I

    .line 42
    move-result v4

    .line 43
    const/4 v5, 0x1

    .line 44
    .line 45
    if-ne v4, v5, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 49
    move-result-object v3

    .line 50
    .line 51
    .line 52
    invoke-static {v3}, Lcom/kubi/assets/overview/j0;->a(Lcom/kubi/assets/entity/OverviewAccountInfo;)Z

    .line 53
    move-result v5

    .line 54
    .line 55
    :cond_1
    if-eqz v5, :cond_0

    .line 56
    .line 57
    .line 58
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 59
    goto :goto_0

    .line 60
    .line 61
    .line 62
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    check-cast v0, Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;->getOriginDataList()Ljava/util/List;

    .line 69
    move-result-object v1

    .line 70
    .line 71
    :cond_3
    new-instance v0, Lcom/kubi/assets/overview/d0;

    .line 72
    .line 73
    .line 74
    invoke-direct {v0, v1}, Lcom/kubi/assets/overview/d0;-><init>(Ljava/util/List;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 78
    return-void
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

.method public final D(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    sparse-switch v0, :sswitch_data_0

    .line 8
    goto :goto_0

    .line 9
    .line 10
    :sswitch_0
    const-string v0, "LAST_7_DAYS"

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    move-result p1

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    sget-object p1, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 20
    .line 21
    sget-object v0, Lcom/kubi/assets/entity/ProfitEventPoint;->PnL7D:Lcom/kubi/assets/entity/ProfitEventPoint;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/kubi/assets/entity/ProfitEventPoint;->getValue()I

    .line 25
    move-result v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lcom/kubi/assets/overview/b1;->p(I)V

    .line 29
    return-void

    .line 30
    .line 31
    :sswitch_1
    const-string v0, "LAST_30_DAYS"

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    move-result p1

    .line 36
    .line 37
    if-nez p1, :cond_1

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_1
    sget-object p1, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 41
    .line 42
    sget-object v0, Lcom/kubi/assets/entity/ProfitEventPoint;->PnL30D:Lcom/kubi/assets/entity/ProfitEventPoint;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/kubi/assets/entity/ProfitEventPoint;->getValue()I

    .line 46
    move-result v0

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Lcom/kubi/assets/overview/b1;->p(I)V

    .line 50
    return-void

    .line 51
    .line 52
    :sswitch_2
    const-string v0, "LAST_180_DAYS"

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    move-result p1

    .line 57
    .line 58
    if-nez p1, :cond_2

    .line 59
    goto :goto_0

    .line 60
    .line 61
    :cond_2
    sget-object p1, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 62
    .line 63
    sget-object v0, Lcom/kubi/assets/entity/ProfitEventPoint;->PnL6M:Lcom/kubi/assets/entity/ProfitEventPoint;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/kubi/assets/entity/ProfitEventPoint;->getValue()I

    .line 67
    move-result v0

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v0}, Lcom/kubi/assets/overview/b1;->p(I)V

    .line 71
    return-void

    .line 72
    .line 73
    :sswitch_3
    const-string v0, "LAST_1_DAY"

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    move-result p1

    .line 78
    .line 79
    if-nez p1, :cond_3

    .line 80
    goto :goto_0

    .line 81
    .line 82
    :cond_3
    sget-object p1, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 83
    .line 84
    sget-object v0, Lcom/kubi/assets/entity/ProfitEventPoint;->PNL1D:Lcom/kubi/assets/entity/ProfitEventPoint;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Lcom/kubi/assets/entity/ProfitEventPoint;->getValue()I

    .line 88
    move-result v0

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v0}, Lcom/kubi/assets/overview/b1;->p(I)V

    .line 92
    return-void

    .line 93
    .line 94
    :sswitch_4
    const-string v0, "LAST_90_DAYS"

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    move-result p1

    .line 99
    .line 100
    if-nez p1, :cond_4

    .line 101
    :goto_0
    return-void

    .line 102
    .line 103
    :cond_4
    sget-object p1, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 104
    .line 105
    sget-object v0, Lcom/kubi/assets/entity/ProfitEventPoint;->PnL3M:Lcom/kubi/assets/entity/ProfitEventPoint;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Lcom/kubi/assets/entity/ProfitEventPoint;->getValue()I

    .line 109
    move-result v0

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v0}, Lcom/kubi/assets/overview/b1;->p(I)V

    .line 113
    return-void

    .line 114
    nop

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
    :sswitch_data_0
    .sparse-switch
        -0x63d7542a -> :sswitch_4
        -0x264a247b -> :sswitch_3
        0x25efb76 -> :sswitch_2
        0x5ec34850 -> :sswitch_1
        0x6742a928 -> :sswitch_0
    .end sparse-switch
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

.method public dispatchIntent(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
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
    instance-of v0, p1, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRecentTransitionData;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    check-cast p1, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRecentTransitionData;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/overview/AssetOverviewViewModel;->z(Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRecentTransitionData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 14
    move-result-object p2

    .line 15
    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    return-object p1

    .line 18
    .line 19
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 20
    return-object p1

    .line 21
    .line 22
    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 23
    return-object p1
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

.method public dispatchIntentOnIO(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
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
    instance-of v0, p2, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$1;->label:I

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
    iput v1, v0, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$1;->label:I

    .line 19
    :goto_0
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$1;-><init>(Lcom/kubi/assets/overview/AssetOverviewViewModel;Lkotlin/coroutines/Continuation;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object p2, v4, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget v1, v4, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$1;->label:I

    .line 35
    const/4 v2, 0x4

    .line 36
    const/4 v3, 0x3

    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x1

    .line 39
    .line 40
    if-eqz v1, :cond_5

    .line 41
    .line 42
    if-eq v1, v6, :cond_4

    .line 43
    .line 44
    if-eq v1, v5, :cond_3

    .line 45
    .line 46
    if-eq v1, v3, :cond_2

    .line 47
    .line 48
    if-ne v1, v2, :cond_1

    .line 49
    .line 50
    iget-object p1, v4, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 53
    .line 54
    .line 55
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 56
    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    .line 64
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    throw p1

    .line 66
    .line 67
    :cond_2
    iget-object p1, v4, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 70
    .line 71
    .line 72
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 73
    .line 74
    goto/16 :goto_6

    .line 75
    .line 76
    :cond_3
    iget-object p1, v4, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 79
    .line 80
    .line 81
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 82
    .line 83
    goto/16 :goto_3

    .line 84
    .line 85
    :cond_4
    iget-object p1, v4, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 88
    .line 89
    .line 90
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 91
    goto :goto_2

    .line 92
    .line 93
    .line 94
    :cond_5
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 95
    .line 96
    instance-of p2, p1, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$HideSmallAssetAccount;

    .line 97
    .line 98
    if-eqz p2, :cond_6

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewViewModel;->B()V

    .line 102
    .line 103
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 104
    .line 105
    goto/16 :goto_6

    .line 106
    .line 107
    :cond_6
    instance-of p2, p1, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$HideOrShowNumber;

    .line 108
    .line 109
    if-eqz p2, :cond_7

    .line 110
    .line 111
    sget-object p2, Lcom/kubi/profit/loss/analysis/api/a;->a:Lcom/kubi/profit/loss/analysis/api/a;

    .line 112
    move-object v0, p1

    .line 113
    .line 114
    check-cast v0, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$HideOrShowNumber;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$HideOrShowNumber;->isChecked()Z

    .line 118
    move-result v1

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2, v1}, Lcom/kubi/profit/loss/analysis/api/a;->e(Z)V

    .line 122
    .line 123
    sget-object p2, Llb/h;->a:Llb/h;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p2}, Llb/h;->D()Ly70/g;

    .line 127
    move-result-object p2

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$HideOrShowNumber;->isChecked()Z

    .line 131
    move-result v0

    .line 132
    .line 133
    .line 134
    invoke-static {p2, v0}, Ly70/a;->k(Ly70/g;Z)Ly70/a;

    .line 135
    .line 136
    new-instance p2, Lcom/kubi/assets/overview/b0;

    .line 137
    .line 138
    .line 139
    invoke-direct {p2, p1}, Lcom/kubi/assets/overview/b0;-><init>(Lcom/kubi/mvi/state/d;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0, p2}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 143
    move-result p1

    .line 144
    .line 145
    .line 146
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 147
    .line 148
    goto/16 :goto_6

    .line 149
    .line 150
    :cond_7
    instance-of p2, p1, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRollbackData;

    .line 151
    const/4 v1, 0x0

    .line 152
    const/4 v7, 0x0

    .line 153
    .line 154
    if-eqz p2, :cond_9

    .line 155
    .line 156
    .line 157
    invoke-direct {p0}, Lcom/kubi/assets/overview/AssetOverviewViewModel;->w()Lcom/kubi/assets/h0;

    .line 158
    move-result-object p2

    .line 159
    .line 160
    .line 161
    invoke-interface {p2, v6}, Lcom/kubi/assets/h0;->h(Z)Lkotlinx/coroutines/flow/e;

    .line 162
    move-result-object p2

    .line 163
    .line 164
    new-instance v2, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$3;

    .line 165
    .line 166
    .line 167
    invoke-direct {v2, p0, v7}, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$3;-><init>(Lcom/kubi/assets/overview/AssetOverviewViewModel;Lkotlin/coroutines/Continuation;)V

    .line 168
    .line 169
    .line 170
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    move-result-object p1

    .line 172
    .line 173
    iput-object p1, v4, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 174
    .line 175
    iput v6, v4, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$1;->label:I

    .line 176
    .line 177
    .line 178
    invoke-static {p2, v1, v2, v4}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->d(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 179
    move-result-object p1

    .line 180
    .line 181
    if-ne p1, v0, :cond_8

    .line 182
    .line 183
    goto/16 :goto_4

    .line 184
    .line 185
    :cond_8
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 186
    return-object p1

    .line 187
    .line 188
    :cond_9
    instance-of p2, p1, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetDynamicsData;

    .line 189
    .line 190
    if-eqz p2, :cond_c

    .line 191
    .line 192
    sget-object p2, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Financing:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 193
    .line 194
    .line 195
    invoke-static {p2}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 196
    move-result p2

    .line 197
    .line 198
    if-eqz p2, :cond_b

    .line 199
    .line 200
    .line 201
    invoke-direct {p0}, Lcom/kubi/assets/overview/AssetOverviewViewModel;->w()Lcom/kubi/assets/h0;

    .line 202
    move-result-object p2

    .line 203
    .line 204
    .line 205
    invoke-interface {p2}, Lcom/kubi/assets/h0;->g0()Lkotlinx/coroutines/flow/e;

    .line 206
    move-result-object p2

    .line 207
    .line 208
    new-instance v2, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$4;

    .line 209
    .line 210
    .line 211
    invoke-direct {v2, p0, v7}, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$4;-><init>(Lcom/kubi/assets/overview/AssetOverviewViewModel;Lkotlin/coroutines/Continuation;)V

    .line 212
    .line 213
    .line 214
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    move-result-object p1

    .line 216
    .line 217
    iput-object p1, v4, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 218
    .line 219
    iput v5, v4, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$1;->label:I

    .line 220
    .line 221
    .line 222
    invoke-static {p2, v1, v2, v4}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->d(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 223
    move-result-object p1

    .line 224
    .line 225
    if-ne p1, v0, :cond_a

    .line 226
    goto :goto_4

    .line 227
    .line 228
    :cond_a
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 229
    return-object p1

    .line 230
    .line 231
    :cond_b
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 232
    goto :goto_6

    .line 233
    .line 234
    :cond_c
    instance-of p2, p1, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetLineChartPoint;

    .line 235
    .line 236
    if-eqz p2, :cond_d

    .line 237
    .line 238
    .line 239
    invoke-direct {p0}, Lcom/kubi/assets/overview/AssetOverviewViewModel;->w()Lcom/kubi/assets/h0;

    .line 240
    move-result-object p2

    .line 241
    move-object v1, p1

    .line 242
    .line 243
    check-cast v1, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetLineChartPoint;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v1}, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetLineChartPoint;->getRange()Ljava/lang/String;

    .line 247
    move-result-object v1

    .line 248
    .line 249
    .line 250
    invoke-interface {p2, v1}, Lcom/kubi/assets/h0;->i(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 251
    move-result-object v1

    .line 252
    move p2, v3

    .line 253
    .line 254
    new-instance v3, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$5;

    .line 255
    .line 256
    .line 257
    invoke-direct {v3, p0, v7}, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$5;-><init>(Lcom/kubi/assets/overview/AssetOverviewViewModel;Lkotlin/coroutines/Continuation;)V

    .line 258
    .line 259
    .line 260
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    move-result-object p1

    .line 262
    .line 263
    iput-object p1, v4, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 264
    .line 265
    iput p2, v4, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$1;->label:I

    .line 266
    const/4 v2, 0x0

    .line 267
    const/4 v5, 0x1

    .line 268
    const/4 v6, 0x0

    .line 269
    .line 270
    .line 271
    invoke-static/range {v1 .. v6}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->e(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 272
    move-result-object p1

    .line 273
    .line 274
    if-ne p1, v0, :cond_10

    .line 275
    goto :goto_4

    .line 276
    .line 277
    :cond_d
    instance-of p2, p1, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetProfitLoss;

    .line 278
    .line 279
    if-eqz p2, :cond_f

    .line 280
    .line 281
    .line 282
    invoke-direct {p0}, Lcom/kubi/assets/overview/AssetOverviewViewModel;->w()Lcom/kubi/assets/h0;

    .line 283
    move-result-object p2

    .line 284
    move-object v1, p1

    .line 285
    .line 286
    check-cast v1, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetProfitLoss;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1}, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetProfitLoss;->getRange()Ljava/lang/String;

    .line 290
    move-result-object v1

    .line 291
    .line 292
    .line 293
    invoke-interface {p2, v1}, Lcom/kubi/assets/h0;->U0(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 294
    move-result-object v1

    .line 295
    .line 296
    new-instance v3, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$6;

    .line 297
    .line 298
    .line 299
    invoke-direct {v3, p0, v7}, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$6;-><init>(Lcom/kubi/assets/overview/AssetOverviewViewModel;Lkotlin/coroutines/Continuation;)V

    .line 300
    .line 301
    iput-object p1, v4, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 302
    .line 303
    iput v2, v4, Lcom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$1;->label:I

    .line 304
    const/4 v2, 0x0

    .line 305
    const/4 v5, 0x1

    .line 306
    const/4 v6, 0x0

    .line 307
    .line 308
    .line 309
    invoke-static/range {v1 .. v6}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->e(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 310
    move-result-object p2

    .line 311
    .line 312
    if-ne p2, v0, :cond_e

    .line 313
    :goto_4
    return-object v0

    .line 314
    .line 315
    :cond_e
    :goto_5
    check-cast p1, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetProfitLoss;

    .line 316
    .line 317
    .line 318
    invoke-virtual {p1}, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetProfitLoss;->getRange()Ljava/lang/String;

    .line 319
    move-result-object p1

    .line 320
    .line 321
    .line 322
    invoke-virtual {p0, p1}, Lcom/kubi/assets/overview/AssetOverviewViewModel;->D(Ljava/lang/String;)V

    .line 323
    .line 324
    :cond_f
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 325
    .line 326
    :cond_10
    :goto_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 327
    return-object p1
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
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewViewModel;->x()Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;

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

.method public final t(Lcom/kubi/assets/entity/OverviewAccountInfo;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getMain()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_9

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getTrade()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-nez v0, :cond_9

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getMargin()Lcom/kubi/assets/entity/MarginEntity;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Margin:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-nez v0, :cond_9

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getKumex()Lcom/kubi/assets/entity/EquityEntity;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lcom/kubi/assets/a;->a()Z

    .line 36
    move-result v0

    .line 37
    .line 38
    if-nez v0, :cond_9

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getRobot()Lcom/kubi/data/entity/SubAssetEntity;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->TradingBot:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 50
    move-result v0

    .line 51
    .line 52
    if-nez v0, :cond_9

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getEarn()Lcom/kubi/assets/entity/EarnBalance;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Financing:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 61
    .line 62
    .line 63
    invoke-static {v0}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 64
    move-result v0

    .line 65
    .line 66
    if-nez v0, :cond_9

    .line 67
    .line 68
    .line 69
    :cond_3
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getOption()Lcom/kubi/assets/entity/CommonAccountEntity;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Option:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 78
    move-result v0

    .line 79
    .line 80
    if-nez v0, :cond_9

    .line 81
    .line 82
    .line 83
    :cond_4
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getAlpha()Lcom/kubi/assets/entity/CommonAccountEntity;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    if-eqz v0, :cond_5

    .line 87
    .line 88
    sget-object v0, Lcom/kubi/quotefacade/api/IQuoteFacadeService;->a:Lcom/kubi/quotefacade/api/IQuoteFacadeService$Companion;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Lcom/kubi/quotefacade/api/IQuoteFacadeService$Companion;->get()Lcom/kubi/quotefacade/api/IQuoteFacadeService;

    .line 92
    move-result-object v0

    .line 93
    .line 94
    .line 95
    invoke-interface {v0}, Lcom/kubi/quotefacade/api/IQuoteFacadeService;->o()Z

    .line 96
    move-result v0

    .line 97
    .line 98
    if-nez v0, :cond_9

    .line 99
    .line 100
    .line 101
    :cond_5
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getCopyTrading()Lcom/kubi/data/entity/SubAssetEntity;

    .line 102
    move-result-object v0

    .line 103
    .line 104
    if-eqz v0, :cond_6

    .line 105
    .line 106
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->CopyTrading:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 107
    .line 108
    .line 109
    invoke-static {v0}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 110
    move-result v0

    .line 111
    .line 112
    if-nez v0, :cond_9

    .line 113
    .line 114
    .line 115
    :cond_6
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getMining()Lcom/kubi/assets/entity/CommonAccountEntity;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    if-eqz v0, :cond_7

    .line 119
    .line 120
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->CLOUD_MINING:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 121
    .line 122
    .line 123
    invoke-static {v0}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 124
    move-result v0

    .line 125
    .line 126
    if-nez v0, :cond_9

    .line 127
    .line 128
    .line 129
    :cond_7
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getSub()Lcom/kubi/data/entity/SubAssetEntity;

    .line 130
    move-result-object v0

    .line 131
    .line 132
    if-nez v0, :cond_9

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getUnified()Lcom/kubi/data/entity/UnifiedAssetEntity;

    .line 136
    move-result-object p1

    .line 137
    .line 138
    if-eqz p1, :cond_8

    .line 139
    goto :goto_0

    .line 140
    :cond_8
    const/4 p1, 0x0

    .line 141
    return p1

    .line 142
    :cond_9
    :goto_0
    const/4 p1, 0x1

    .line 143
    return p1
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

.method public final u(Lcom/kubi/assets/entity/OverviewAccountInfo;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getMain()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/kubi/data/entity/AssetSingleEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 13
    move-result-object v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v1, v0

    .line 16
    :goto_0
    const/4 v2, 0x1

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v0, v2, v0}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    sget-object v3, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 26
    move-result v1

    .line 27
    .line 28
    if-gtz v1, :cond_10

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getTrade()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/kubi/data/entity/AssetSingleEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 40
    move-result-object v1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move-object v1, v0

    .line 43
    .line 44
    .line 45
    :goto_1
    invoke-static {v1, v0, v2, v0}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 50
    move-result v1

    .line 51
    .line 52
    if-gtz v1, :cond_10

    .line 53
    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getKumex()Lcom/kubi/assets/entity/EquityEntity;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Lcom/kubi/assets/entity/EquityEntity;->getTotalEquity()Ljava/math/BigDecimal;

    .line 64
    move-result-object v1

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    move-object v1, v0

    .line 67
    .line 68
    .line 69
    :goto_2
    invoke-static {v1, v0, v2, v0}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 74
    move-result v1

    .line 75
    .line 76
    if-gtz v1, :cond_10

    .line 77
    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getMargin()Lcom/kubi/assets/entity/MarginEntity;

    .line 82
    move-result-object v1

    .line 83
    .line 84
    if-eqz v1, :cond_3

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Lcom/kubi/assets/entity/MarginEntity;->getTotalBalanceIfExecuted()Ljava/math/BigDecimal;

    .line 88
    move-result-object v1

    .line 89
    goto :goto_3

    .line 90
    :cond_3
    move-object v1, v0

    .line 91
    .line 92
    .line 93
    :goto_3
    invoke-static {v1, v0, v2, v0}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 94
    move-result-object v1

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 98
    move-result v1

    .line 99
    .line 100
    if-gtz v1, :cond_10

    .line 101
    .line 102
    if-eqz p1, :cond_4

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getEarn()Lcom/kubi/assets/entity/EarnBalance;

    .line 106
    move-result-object v1

    .line 107
    .line 108
    if-eqz v1, :cond_4

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Lcom/kubi/assets/entity/EarnBalance;->getTotalValue()Ljava/math/BigDecimal;

    .line 112
    move-result-object v1

    .line 113
    goto :goto_4

    .line 114
    :cond_4
    move-object v1, v0

    .line 115
    .line 116
    .line 117
    :goto_4
    invoke-static {v1, v0, v2, v0}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 118
    move-result-object v1

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 122
    move-result v1

    .line 123
    .line 124
    if-gtz v1, :cond_10

    .line 125
    .line 126
    if-eqz p1, :cond_5

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getCopyTrading()Lcom/kubi/data/entity/SubAssetEntity;

    .line 130
    move-result-object v1

    .line 131
    .line 132
    if-eqz v1, :cond_5

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Lcom/kubi/data/entity/SubAssetEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 136
    move-result-object v1

    .line 137
    goto :goto_5

    .line 138
    :cond_5
    move-object v1, v0

    .line 139
    .line 140
    .line 141
    :goto_5
    invoke-static {v1, v0, v2, v0}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 142
    move-result-object v1

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 146
    move-result v1

    .line 147
    .line 148
    if-lez v1, :cond_6

    .line 149
    .line 150
    sget-object v1, Lcom/kubi/assets/service/a;->a:Lcom/kubi/assets/service/a;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1}, Lcom/kubi/assets/service/a;->a()Lcom/kubi/copytrading/ICopyTradingService;

    .line 154
    move-result-object v1

    .line 155
    .line 156
    .line 157
    invoke-interface {v1}, Lcom/kubi/copytrading/ICopyTradingService;->o()Z

    .line 158
    move-result v1

    .line 159
    .line 160
    if-nez v1, :cond_10

    .line 161
    .line 162
    :cond_6
    if-eqz p1, :cond_7

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getRobot()Lcom/kubi/data/entity/SubAssetEntity;

    .line 166
    move-result-object v1

    .line 167
    .line 168
    if-eqz v1, :cond_7

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, Lcom/kubi/data/entity/SubAssetEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 172
    move-result-object v1

    .line 173
    goto :goto_6

    .line 174
    :cond_7
    move-object v1, v0

    .line 175
    .line 176
    .line 177
    :goto_6
    invoke-static {v1, v0, v2, v0}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 178
    move-result-object v1

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 182
    move-result v1

    .line 183
    .line 184
    if-gtz v1, :cond_10

    .line 185
    .line 186
    if-eqz p1, :cond_8

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getOption()Lcom/kubi/assets/entity/CommonAccountEntity;

    .line 190
    move-result-object v1

    .line 191
    .line 192
    if-eqz v1, :cond_8

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1}, Lcom/kubi/assets/entity/CommonAccountEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 196
    move-result-object v1

    .line 197
    goto :goto_7

    .line 198
    :cond_8
    move-object v1, v0

    .line 199
    .line 200
    .line 201
    :goto_7
    invoke-static {v1, v0, v2, v0}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 202
    move-result-object v1

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 206
    move-result v1

    .line 207
    .line 208
    if-lez v1, :cond_9

    .line 209
    .line 210
    sget-object v1, Lcom/kubi/user/api/IUserService;->a:Lcom/kubi/user/api/IUserService$Companion;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1}, Lcom/kubi/user/api/IUserService$Companion;->get()Lcom/kubi/user/api/IUserService;

    .line 214
    move-result-object v1

    .line 215
    .line 216
    .line 217
    invoke-interface {v1}, Lcom/kubi/user/api/IUserService;->d0()Lcom/kubi/user/model/LoginUserEntity;

    .line 218
    move-result-object v1

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1}, Lcom/kubi/user/model/LoginUserEntity;->getHasMarginOption()Z

    .line 222
    move-result v1

    .line 223
    .line 224
    if-nez v1, :cond_10

    .line 225
    .line 226
    :cond_9
    if-eqz p1, :cond_a

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getAlpha()Lcom/kubi/assets/entity/CommonAccountEntity;

    .line 230
    move-result-object v1

    .line 231
    .line 232
    if-eqz v1, :cond_a

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1}, Lcom/kubi/assets/entity/CommonAccountEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 236
    move-result-object v1

    .line 237
    goto :goto_8

    .line 238
    :cond_a
    move-object v1, v0

    .line 239
    .line 240
    .line 241
    :goto_8
    invoke-static {v1, v0, v2, v0}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 242
    move-result-object v1

    .line 243
    .line 244
    .line 245
    invoke-virtual {v1, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 246
    move-result v1

    .line 247
    .line 248
    if-gtz v1, :cond_10

    .line 249
    .line 250
    if-eqz p1, :cond_b

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getMining()Lcom/kubi/assets/entity/CommonAccountEntity;

    .line 254
    move-result-object v1

    .line 255
    .line 256
    if-eqz v1, :cond_b

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1}, Lcom/kubi/assets/entity/CommonAccountEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 260
    move-result-object v1

    .line 261
    goto :goto_9

    .line 262
    :cond_b
    move-object v1, v0

    .line 263
    .line 264
    .line 265
    :goto_9
    invoke-static {v1, v0, v2, v0}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 266
    move-result-object v1

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 270
    move-result v1

    .line 271
    .line 272
    if-gtz v1, :cond_10

    .line 273
    .line 274
    if-eqz p1, :cond_c

    .line 275
    .line 276
    .line 277
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getUnified()Lcom/kubi/data/entity/UnifiedAssetEntity;

    .line 278
    move-result-object v1

    .line 279
    .line 280
    if-eqz v1, :cond_c

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1}, Lcom/kubi/data/entity/UnifiedAssetEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 284
    move-result-object v1

    .line 285
    goto :goto_a

    .line 286
    :cond_c
    move-object v1, v0

    .line 287
    .line 288
    .line 289
    :goto_a
    invoke-static {v1, v0, v2, v0}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 290
    move-result-object v1

    .line 291
    .line 292
    .line 293
    invoke-virtual {v1, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 294
    move-result v1

    .line 295
    .line 296
    if-lez v1, :cond_d

    .line 297
    .line 298
    sget-object v1, Lcom/kubi/unify/api/IUnifyAccountService;->a:Lcom/kubi/unify/api/IUnifyAccountService$Companion;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v1}, Lcom/kubi/unify/api/IUnifyAccountService$Companion;->get()Lcom/kubi/unify/api/IUnifyAccountService;

    .line 302
    move-result-object v1

    .line 303
    .line 304
    .line 305
    invoke-interface {v1}, Lcom/kubi/unify/api/IUnifyAccountService;->e()Z

    .line 306
    move-result v1

    .line 307
    .line 308
    if-nez v1, :cond_10

    .line 309
    .line 310
    :cond_d
    if-eqz p1, :cond_e

    .line 311
    .line 312
    .line 313
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getSub()Lcom/kubi/data/entity/SubAssetEntity;

    .line 314
    move-result-object v0

    .line 315
    .line 316
    .line 317
    invoke-virtual {p1, v0}, Lcom/kubi/assets/entity/OverviewAccountInfo;->filterZeroSubAsset(Lcom/kubi/data/entity/SubAssetEntity;)Z

    .line 318
    move-result p1

    .line 319
    .line 320
    .line 321
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 322
    move-result-object v0

    .line 323
    .line 324
    .line 325
    :cond_e
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 326
    move-result p1

    .line 327
    .line 328
    if-eqz p1, :cond_f

    .line 329
    goto :goto_b

    .line 330
    :cond_f
    const/4 p1, 0x0

    .line 331
    return p1

    .line 332
    :cond_10
    :goto_b
    return v2
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

.method public final v(Lcom/kubi/assets/entity/OverviewAccountInfo;Lcom/kubi/data/entity/SubAssetEntity;)Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getSub()Lcom/kubi/data/entity/SubAssetEntity;

    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x1

    .line 6
    .line 7
    if-eqz p1, :cond_4

    .line 8
    const/4 p1, 0x0

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/kubi/data/entity/SubAssetEntity;->getHasSubAccount()Ljava/lang/Boolean;

    .line 14
    move-result-object v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v1, p1

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Lcom/kubi/data/entity/SubAssetEntity;->getShowSubAccountBalanceSwitch()Ljava/lang/Boolean;

    .line 28
    move-result-object v1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-object v1, p1

    .line 31
    .line 32
    .line 33
    :goto_1
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 34
    move-result v1

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Lcom/kubi/data/entity/SubAssetEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 42
    move-result-object p2

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    move-object p2, p1

    .line 45
    .line 46
    .line 47
    :goto_2
    invoke-static {p2, p1, v0, p1}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    sget-object p2, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, p2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 54
    move-result p1

    .line 55
    .line 56
    if-lez p1, :cond_3

    .line 57
    goto :goto_3

    .line 58
    :cond_3
    const/4 p1, 0x0

    .line 59
    return p1

    .line 60
    :cond_4
    :goto_3
    return v0
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method

.method public x()Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;
    .locals 17
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;

    .line 3
    .line 4
    const/16 v15, 0x3fff

    .line 5
    .line 6
    const/16 v16, 0x0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v9, 0x0

    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v11, 0x0

    .line 18
    const/4 v12, 0x0

    .line 19
    const/4 v13, 0x0

    .line 20
    const/4 v14, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct/range {v0 .. v16}, Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;-><init>(Lcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/util/List;Ljava/lang/Throwable;Ljava/util/List;ZZLjava/lang/Boolean;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/kubi/assets/entity/NewOverviewEntity;Lcom/kubi/assets/entity/OldOverviewEntity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 24
    return-object v0
    .line 25
    .line 26
    .line 27
.end method

.method public final y(Lcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/util/List;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/assets/entity/AssetV2OverviewEntity;",
            "Ljava/util/List<",
            "Lcom/kubi/assets/entity/OverviewItemEntity;",
            ">;",
            "Ljava/util/List<",
            "Lcom/kubi/assets/entity/OverviewItemEntity;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_7

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getAccounts()Ljava/util/List;

    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    move-result v2

    .line 23
    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    move-result-object v2

    .line 29
    move-object v3, v2

    .line 30
    .line 31
    check-cast v3, Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v3}, Lcom/kubi/assets/overview/AssetOverviewViewModel;->t(Lcom/kubi/assets/entity/OverviewAccountInfo;)Z

    .line 35
    move-result v3

    .line 36
    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    .line 40
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-object v1, v0

    .line 43
    .line 44
    :cond_2
    if-eqz v1, :cond_7

    .line 45
    .line 46
    .line 47
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    .line 51
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    move-result v1

    .line 53
    .line 54
    if-eqz v1, :cond_7

    .line 55
    .line 56
    .line 57
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    check-cast v1, Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getSub()Lcom/kubi/data/entity/SubAssetEntity;

    .line 64
    move-result-object v2

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v1, v2}, Lcom/kubi/assets/overview/AssetOverviewViewModel;->v(Lcom/kubi/assets/entity/OverviewAccountInfo;Lcom/kubi/data/entity/SubAssetEntity;)Z

    .line 68
    move-result v2

    .line 69
    const/4 v3, 0x1

    .line 70
    .line 71
    if-eqz v2, :cond_4

    .line 72
    .line 73
    new-instance v2, Lcom/kubi/assets/entity/OverviewItemEntity;

    .line 74
    .line 75
    .line 76
    invoke-direct {v2, v1, v0, v3}, Lcom/kubi/assets/entity/OverviewItemEntity;-><init>(Lcom/kubi/assets/entity/OverviewAccountInfo;Lcom/kubi/assets/entity/HistoryRecordEntity;I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {p3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    :cond_4
    sget-object v2, Llb/h;->a:Llb/h;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Llb/h;->m()Ly70/g;

    .line 85
    move-result-object v2

    .line 86
    const/4 v4, 0x0

    .line 87
    .line 88
    .line 89
    invoke-static {v2, v4}, Ly70/a;->d(Ly70/g;Z)Z

    .line 90
    move-result v2

    .line 91
    .line 92
    if-eqz v2, :cond_5

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v1}, Lcom/kubi/assets/overview/AssetOverviewViewModel;->u(Lcom/kubi/assets/entity/OverviewAccountInfo;)Z

    .line 96
    move-result v2

    .line 97
    .line 98
    if-eqz v2, :cond_3

    .line 99
    .line 100
    new-instance v2, Lcom/kubi/assets/entity/OverviewItemEntity;

    .line 101
    .line 102
    .line 103
    invoke-direct {v2, v1, v0, v3}, Lcom/kubi/assets/entity/OverviewItemEntity;-><init>(Lcom/kubi/assets/entity/OverviewAccountInfo;Lcom/kubi/assets/entity/HistoryRecordEntity;I)V

    .line 104
    .line 105
    .line 106
    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    goto :goto_1

    .line 108
    .line 109
    .line 110
    :cond_5
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getSub()Lcom/kubi/data/entity/SubAssetEntity;

    .line 111
    move-result-object v2

    .line 112
    .line 113
    if-eqz v2, :cond_6

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getSub()Lcom/kubi/data/entity/SubAssetEntity;

    .line 117
    move-result-object v2

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, v1, v2}, Lcom/kubi/assets/overview/AssetOverviewViewModel;->v(Lcom/kubi/assets/entity/OverviewAccountInfo;Lcom/kubi/data/entity/SubAssetEntity;)Z

    .line 121
    move-result v2

    .line 122
    .line 123
    if-eqz v2, :cond_3

    .line 124
    .line 125
    :cond_6
    new-instance v2, Lcom/kubi/assets/entity/OverviewItemEntity;

    .line 126
    .line 127
    .line 128
    invoke-direct {v2, v1, v0, v3}, Lcom/kubi/assets/entity/OverviewItemEntity;-><init>(Lcom/kubi/assets/entity/OverviewAccountInfo;Lcom/kubi/assets/entity/HistoryRecordEntity;I)V

    .line 129
    .line 130
    .line 131
    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 132
    goto :goto_1

    .line 133
    :cond_7
    return-void
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

.method public final z(Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRecentTransitionData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRecentTransitionData;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object v0, p2

    .line 2
    .line 3
    instance-of v1, v0, Lcom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    move-object v1, v0

    .line 7
    .line 8
    check-cast v1, Lcom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$1;

    .line 9
    .line 10
    iget v2, v1, Lcom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$1;->label:I

    .line 11
    .line 12
    const/high16 v4, -0x80000000

    .line 13
    .line 14
    and-int v5, v2, v4

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    sub-int/2addr v2, v4

    .line 18
    .line 19
    iput v2, v1, Lcom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$1;->label:I

    .line 20
    :goto_0
    move-object v6, v1

    .line 21
    goto :goto_1

    .line 22
    .line 23
    :cond_0
    new-instance v1, Lcom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$1;

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, p0, p2}, Lcom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$1;-><init>(Lcom/kubi/assets/overview/AssetOverviewViewModel;Lkotlin/coroutines/Continuation;)V

    .line 27
    goto :goto_0

    .line 28
    .line 29
    :goto_1
    iget-object v0, v6, Lcom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 33
    move-result-object v8

    .line 34
    .line 35
    iget v1, v6, Lcom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$1;->label:I

    .line 36
    const/4 v9, 0x1

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    if-ne v1, v9, :cond_1

    .line 41
    .line 42
    iget-boolean v1, v6, Lcom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$1;->Z$0:Z

    .line 43
    .line 44
    iget-object v2, v6, Lcom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$1;->L$3:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Ljava/util/List;

    .line 47
    .line 48
    iget-object v4, v6, Lcom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$1;->L$2:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v4, Ljava/util/List;

    .line 51
    .line 52
    iget-object v5, v6, Lcom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$1;->L$1:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v5, Lcom/kubi/assets/entity/AssetV2OverviewEntity;

    .line 55
    .line 56
    iget-object v5, v6, Lcom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$1;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v5, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRecentTransitionData;

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 62
    goto :goto_2

    .line 63
    .line 64
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    .line 69
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    throw v0

    .line 71
    .line 72
    .line 73
    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRecentTransitionData;->getData()Lcom/kubi/assets/entity/AssetV2OverviewEntity;

    .line 77
    move-result-object v7

    .line 78
    .line 79
    if-eqz v7, :cond_7

    .line 80
    .line 81
    new-instance v1, Ljava/util/ArrayList;

    .line 82
    .line 83
    .line 84
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 85
    .line 86
    new-instance v2, Ljava/util/ArrayList;

    .line 87
    .line 88
    .line 89
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v7, v1, v2}, Lcom/kubi/assets/overview/AssetOverviewViewModel;->y(Lcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/util/List;Ljava/util/List;)V

    .line 93
    .line 94
    .line 95
    invoke-static {}, Lcom/kubi/assets/overview/account/q;->a()Z

    .line 96
    move-result v4

    .line 97
    .line 98
    .line 99
    invoke-direct {p0}, Lcom/kubi/assets/overview/AssetOverviewViewModel;->w()Lcom/kubi/assets/h0;

    .line 100
    move-result-object v0

    .line 101
    const/4 v5, 0x3

    .line 102
    const/4 v10, 0x0

    .line 103
    const/4 v11, 0x0

    .line 104
    .line 105
    .line 106
    invoke-static {v0, v11, v11, v5, v10}, Lcom/kubi/assets/h0;->O(Lcom/kubi/assets/h0;IIILjava/lang/Object;)Lkotlinx/coroutines/flow/e;

    .line 107
    move-result-object v10

    .line 108
    .line 109
    new-instance v0, Lcom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$2$1;

    .line 110
    const/4 v5, 0x0

    .line 111
    move-object v3, p0

    .line 112
    .line 113
    .line 114
    invoke-direct/range {v0 .. v5}, Lcom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$2$1;-><init>(Ljava/util/List;Ljava/util/List;Lcom/kubi/assets/overview/AssetOverviewViewModel;ZLkotlin/coroutines/Continuation;)V

    .line 115
    move-object v12, v1

    .line 116
    move v1, v4

    .line 117
    move-object v4, v0

    .line 118
    move-object v0, v2

    .line 119
    .line 120
    .line 121
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    move-result-object v2

    .line 123
    .line 124
    iput-object v2, v6, Lcom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$1;->L$0:Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    move-result-object v2

    .line 129
    .line 130
    iput-object v2, v6, Lcom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$1;->L$1:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v12, v6, Lcom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$1;->L$2:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object v0, v6, Lcom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$1;->L$3:Ljava/lang/Object;

    .line 135
    .line 136
    iput v11, v6, Lcom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$1;->I$0:I

    .line 137
    .line 138
    iput-boolean v1, v6, Lcom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$1;->Z$0:Z

    .line 139
    .line 140
    iput v9, v6, Lcom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$1;->label:I

    .line 141
    const/4 v3, 0x0

    .line 142
    move-object v5, v6

    .line 143
    const/4 v6, 0x1

    .line 144
    const/4 v7, 0x0

    .line 145
    move-object v2, v10

    .line 146
    .line 147
    .line 148
    invoke-static/range {v2 .. v7}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->e(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 149
    move-result-object v2

    .line 150
    .line 151
    if-ne v2, v8, :cond_3

    .line 152
    return-object v8

    .line 153
    :cond_3
    move-object v4, v2

    .line 154
    move-object v2, v0

    .line 155
    move-object v0, v4

    .line 156
    move-object v4, v12

    .line 157
    .line 158
    :goto_2
    check-cast v0, Lcom/kubi/network/retrofit/utils/f;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Lcom/kubi/network/retrofit/utils/f;->b()Ljava/lang/Throwable;

    .line 162
    move-result-object v0

    .line 163
    .line 164
    if-eqz v0, :cond_7

    .line 165
    .line 166
    new-instance v0, Ljava/util/ArrayList;

    .line 167
    .line 168
    .line 169
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 173
    move-result-object v3

    .line 174
    .line 175
    .line 176
    :cond_4
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    move-result v4

    .line 178
    .line 179
    if-eqz v4, :cond_6

    .line 180
    .line 181
    .line 182
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    move-result-object v4

    .line 184
    move-object v5, v4

    .line 185
    .line 186
    check-cast v5, Lcom/kubi/assets/entity/OverviewItemEntity;

    .line 187
    .line 188
    if-eqz v1, :cond_5

    .line 189
    .line 190
    .line 191
    invoke-virtual {v5}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 192
    move-result-object v5

    .line 193
    .line 194
    .line 195
    invoke-static {v5}, Lcom/kubi/assets/overview/j0;->a(Lcom/kubi/assets/entity/OverviewAccountInfo;)Z

    .line 196
    move-result v5

    .line 197
    goto :goto_4

    .line 198
    :cond_5
    move v5, v9

    .line 199
    .line 200
    :goto_4
    if-eqz v5, :cond_4

    .line 201
    .line 202
    .line 203
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 204
    goto :goto_3

    .line 205
    .line 206
    :cond_6
    new-instance v1, Lcom/kubi/assets/overview/c0;

    .line 207
    .line 208
    .line 209
    invoke-direct {v1, v0, v2}, Lcom/kubi/assets/overview/c0;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0, v1}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 213
    .line 214
    :cond_7
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 215
    return-object v0
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
