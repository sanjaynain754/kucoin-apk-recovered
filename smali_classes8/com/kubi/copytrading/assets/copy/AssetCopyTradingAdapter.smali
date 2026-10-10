.class public final Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;
.super Lio/chad/library/adapter/base/BaseQuickAdapter;
.source "AssetCopyTradingAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010#\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0003H\u0016J\u0006\u0010\u001a\u001a\u00020\u0010J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0014J(\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017H\u0002J \u0010\"\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0017H\u0002J\u0008\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0008\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"
    }
    d2 = {
        "Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;",
        "Lio/chad/library/adapter/base/BaseQuickAdapter;",
        "Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "assetCopyTradingFragment",
        "Lcom/kubi/sdk/BaseFragment;",
        "<init>",
        "(Lcom/kubi/sdk/BaseFragment;)V",
        "hideNumber",
        "",
        "getHideNumber",
        "()Z",
        "setHideNumber",
        "(Z)V",
        "onTrialExpired",
        "Lkotlin/Function0;",
        "",
        "getOnTrialExpired",
        "()Lkotlin/jvm/functions/Function0;",
        "setOnTrialExpired",
        "(Lkotlin/jvm/functions/Function0;)V",
        "countDownTaskIds",
        "",
        "",
        "onViewRecycled",
        "holder",
        "release",
        "convert",
        "helper",
        "item",
        "bindTrialView",
        "ctx",
        "Landroid/content/Context;",
        "settleCurrencyPrecision",
        "sharePosition",
        "getRcode",
        "",
        "CopyTradingLib_googleRelease"
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
        "SMAP\nAssetCopyTradingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetCopyTradingAdapter.kt\ncom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,323:1\n1869#2,2:324\n*S KotlinDebug\n*F\n+ 1 AssetCopyTradingAdapter.kt\ncom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter\n*L\n74#1:324,2\n*E\n"
    }
.end annotation


# instance fields
.field public final i:Lcom/kubi/sdk/BaseFragment;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public j:Z

.field public k:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final l:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/sdk/BaseFragment;)V
    .locals 1
    .param p1    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "assetCopyTradingFragment"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget v0, Lcom/kubi/copytrading/R$layout;->item_asset_copy_trading:I

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;-><init>(I)V

    .line 11
    .line 12
    iput-object p1, p0, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->i:Lcom/kubi/sdk/BaseFragment;

    .line 13
    .line 14
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 15
    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 18
    .line 19
    iput-object p1, p0, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->l:Ljava/util/Set;

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
.end method

.method public static final C(Ljava/lang/Boolean;Lcom/kubi/sdk/protocol/ProtocolException;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

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
.end method

.method public static synthetic g(Ljava/lang/Boolean;Lcom/kubi/sdk/protocol/ProtocolException;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->C(Ljava/lang/Boolean;Lcom/kubi/sdk/protocol/ProtocolException;)Lkotlin/Unit;

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
.end method

.method public static synthetic h(Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->s(Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;)Lkotlin/Unit;

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
.end method

.method public static synthetic i(Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;Landroid/content/Context;Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;ILandroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->t(Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;Landroid/content/Context;Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;ILandroid/view/View;)V

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
.end method

.method public static synthetic j(Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->r(Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;Ljava/lang/String;Landroid/view/View;)V

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
.end method

.method public static synthetic k()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->p()Lkotlin/Unit;

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
.end method

.method public static final synthetic l(Landroid/content/Context;J)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->o(Landroid/content/Context;J)Ljava/lang/String;

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
.end method

.method public static final synthetic m(Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;)Ljava/util/Set;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->l:Ljava/util/Set;

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
.end method

.method public static final o(Landroid/content/Context;J)Ljava/lang/String;
    .locals 5

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    cmp-long v0, p1, v0

    .line 5
    .line 6
    if-gtz v0, :cond_0

    .line 7
    .line 8
    const-string p0, "--"

    .line 9
    return-object p0

    .line 10
    .line 11
    :cond_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    .line 12
    .line 13
    const-wide/16 v1, 0x18

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    .line 17
    move-result-wide v0

    .line 18
    .line 19
    cmp-long v0, p1, v0

    .line 20
    .line 21
    if-ltz v0, :cond_1

    .line 22
    .line 23
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toDays(J)J

    .line 27
    move-result-wide v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toHours(J)J

    .line 31
    move-result-wide p1

    .line 32
    .line 33
    const/16 v0, 0x18

    .line 34
    int-to-long v3, v0

    .line 35
    rem-long/2addr p1, v3

    .line 36
    .line 37
    sget v0, Lcom/kubi/copytrading/R$string;->copy_trading_day_hours:I

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    .line 48
    filled-new-array {v1, p1}, [Ljava/lang/Object;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    move-result-object p0

    .line 54
    .line 55
    .line 56
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 57
    return-object p0

    .line 58
    .line 59
    :cond_1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toHours(J)J

    .line 63
    move-result-wide v1

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMinutes(J)J

    .line 67
    move-result-wide p1

    .line 68
    .line 69
    const/16 v0, 0x3c

    .line 70
    int-to-long v3, v0

    .line 71
    rem-long/2addr p1, v3

    .line 72
    .line 73
    sget v0, Lcom/kubi/copytrading/R$string;->copy_trading_hours_min:I

    .line 74
    .line 75
    .line 76
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 77
    move-result-object v1

    .line 78
    .line 79
    .line 80
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 81
    move-result-object p1

    .line 82
    .line 83
    .line 84
    filled-new-array {v1, p1}, [Ljava/lang/Object;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    move-result-object p0

    .line 90
    .line 91
    .line 92
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 93
    return-object p0
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
.end method

.method public static final p()Lkotlin/Unit;
    .locals 10

    .line 1
    .line 2
    sget-object v0, Lf00/a;->a:Lf00/a;

    .line 3
    .line 4
    const/16 v8, 0x7a

    .line 5
    const/4 v9, 0x0

    .line 6
    .line 7
    const-string v1, "copyTrading"

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    const-string v3, "copyTradingJump.myCopy"

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    .line 16
    .line 17
    invoke-static/range {v0 .. v9}, Lg00/f$a;->j(Lg00/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 18
    .line 19
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 20
    return-object v0
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
.end method

.method public static final r(Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;Ljava/lang/String;Landroid/view/View;)V
    .locals 2

    .line 1
    .line 2
    sget-object p2, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    sget v0, Lcom/kubi/copytrading/R$string;->copytd_share_profit_tips_title:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 12
    move-result-object p2

    .line 13
    .line 14
    iget-object v0, p0, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->i:Lcom/kubi/sdk/BaseFragment;

    .line 15
    .line 16
    sget v1, Lcom/kubi/copytrading/R$string;->copytd_share_profit_tips_content:I

    .line 17
    .line 18
    .line 19
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1, p1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, p1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->M4(Ljava/lang/CharSequence;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    sget p2, Lcom/kubi/copytrading/R$string;->i_know:I

    .line 31
    const/4 v0, 0x0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p2, v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->S4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    iget-object p0, p0, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->i:Lcom/kubi/sdk/BaseFragment;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 41
    move-result-object p0

    .line 42
    .line 43
    const-string p2, "getChildFragmentManager(...)"

    .line 44
    .line 45
    .line 46
    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    const-string p2, "tvRatioLabel"

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p0, p2}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 52
    return-void
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
.end method

.method public static final s(Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    const/16 v4, 0x8

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B20CopyTradeFuturesAssetsCopy"

    .line 6
    .line 7
    const-string v1, "body"

    .line 8
    .line 9
    const-string v2, "traderDetail"

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 14
    .line 15
    sget-object v0, Lcom/kubi/copytrading/CopyTradingConfig;->a:Lcom/kubi/copytrading/CopyTradingConfig;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getCopyConfigId()Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    const-string v2, ""

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    move-object v1, v2

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getTraderInfoResponse()Lcom/kubi/copytrading/assets/TraderInfoResponse;

    .line 28
    move-result-object p0

    .line 29
    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/kubi/copytrading/assets/TraderInfoResponse;->getLeadConfigId()Ljava/lang/String;

    .line 34
    move-result-object p0

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 p0, 0x0

    .line 37
    .line 38
    :goto_0
    if-nez p0, :cond_2

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move-object v2, p0

    .line 41
    .line 42
    .line 43
    :goto_1
    invoke-virtual {v0, v1, v2}, Lcom/kubi/copytrading/CopyTradingConfig;->E(Ljava/lang/String;Ljava/lang/String;)Z

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
.end method

.method public static final t(Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;Landroid/content/Context;Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;ILandroid/view/View;)V
    .locals 6

    .line 1
    .line 2
    const/16 v4, 0x8

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B20CopyTradeFuturesAssetsCopy"

    .line 6
    .line 7
    const-string v1, "body"

    .line 8
    .line 9
    const-string v2, "traderShare"

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->B(Landroid/content/Context;Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;I)V

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
.end method

.method private final v()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/share/api/IShareService;->a:Lcom/kubi/share/api/IShareService$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/share/api/IShareService$Companion;->get()Lcom/kubi/share/api/IShareService;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lcom/kubi/share/api/IShareService;->e()Ljava/lang/String;

    .line 10
    move-result-object v0

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
.end method


# virtual methods
.method public final A(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->k:Lkotlin/jvm/functions/Function0;

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
.end method

.method public final B(Landroid/content/Context;Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;I)V
    .locals 23

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    .line 5
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getThirtyDayProfitDetail()Lcom/kubi/copytrading/assets/ThirtyDayProfitDetail;

    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/kubi/copytrading/assets/ThirtyDayProfitDetail;->getCurrency()Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v1, v2

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getTotalPnl()Ljava/math/BigDecimal;

    .line 19
    move-result-object v3

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    sget-object v4, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 27
    move-result v3

    .line 28
    .line 29
    .line 30
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    move-result-object v3

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move-object v3, v2

    .line 34
    .line 35
    .line 36
    :goto_1
    invoke-static {}, Lcom/kubi/user/config/UserInfo;->c()Lcom/kubi/user/model/LoginUserEntity;

    .line 37
    move-result-object v4

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4}, Lcom/kubi/user/model/LoginUserEntity;->getNicknameShow()Ljava/lang/String;

    .line 41
    move-result-object v4

    .line 42
    .line 43
    .line 44
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getTotalPnl()Ljava/math/BigDecimal;

    .line 45
    move-result-object v5

    .line 46
    .line 47
    const-string v6, "--"

    .line 48
    .line 49
    if-nez v5, :cond_2

    .line 50
    move-object v7, v6

    .line 51
    goto :goto_2

    .line 52
    .line 53
    :cond_2
    new-instance v5, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getTotalPnl()Ljava/math/BigDecimal;

    .line 60
    move-result-object v7

    .line 61
    .line 62
    .line 63
    invoke-static {v7}, Lcom/kubi/utils/extensions/d;->d(Ljava/lang/Number;)Ljava/lang/String;

    .line 64
    move-result-object v7

    .line 65
    .line 66
    .line 67
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getTotalPnl()Ljava/math/BigDecimal;

    .line 71
    move-result-object v8

    .line 72
    .line 73
    const/16 v16, 0x5d

    .line 74
    .line 75
    const/16 v17, 0x0

    .line 76
    const/4 v9, 0x0

    .line 77
    const/4 v11, 0x0

    .line 78
    const/4 v12, 0x0

    .line 79
    const/4 v13, 0x0

    .line 80
    const/4 v14, 0x2

    .line 81
    const/4 v15, 0x0

    .line 82
    .line 83
    move/from16 v10, p3

    .line 84
    .line 85
    .line 86
    invoke-static/range {v8 .. v17}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 87
    move-result-object v7

    .line 88
    .line 89
    .line 90
    invoke-static {v7, v6}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    move-result-object v7

    .line 92
    .line 93
    .line 94
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    move-result-object v5

    .line 99
    move-object v7, v5

    .line 100
    .line 101
    .line 102
    :goto_2
    invoke-direct/range {p0 .. p0}, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->v()Ljava/lang/String;

    .line 103
    move-result-object v5

    .line 104
    .line 105
    sget-object v8, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 106
    .line 107
    const-class v9, Le00/d;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v8, v9}, Lcom/kubi/router/core/Router;->n(Ljava/lang/Class;)Ljava/lang/Object;

    .line 111
    move-result-object v8

    .line 112
    move-object v13, v8

    .line 113
    .line 114
    check-cast v13, Le00/d;

    .line 115
    .line 116
    new-instance v14, Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity;

    .line 117
    .line 118
    const-string v15, ""

    .line 119
    .line 120
    if-nez v4, :cond_3

    .line 121
    move-object v4, v15

    .line 122
    .line 123
    .line 124
    :cond_3
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getTotalPnlRatio()Ljava/math/BigDecimal;

    .line 125
    move-result-object v8

    .line 126
    .line 127
    if-eqz v8, :cond_5

    .line 128
    .line 129
    .line 130
    invoke-virtual {v8}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 131
    move-result-object v8

    .line 132
    .line 133
    if-nez v8, :cond_4

    .line 134
    goto :goto_3

    .line 135
    .line 136
    :cond_4
    move-object/from16 v16, v8

    .line 137
    goto :goto_4

    .line 138
    .line 139
    :cond_5
    :goto_3
    move-object/from16 v16, v15

    .line 140
    .line 141
    :goto_4
    if-nez v1, :cond_6

    .line 142
    move-object v8, v15

    .line 143
    goto :goto_5

    .line 144
    :cond_6
    move-object v8, v1

    .line 145
    :goto_5
    const/4 v11, 0x4

    .line 146
    const/4 v12, 0x0

    .line 147
    const/4 v9, 0x1

    .line 148
    const/4 v10, 0x0

    .line 149
    .line 150
    .line 151
    invoke-static/range {v7 .. v12}, Lnf/b;->g(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 152
    move-result-object v17

    .line 153
    .line 154
    .line 155
    invoke-static {v3}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 156
    move-result v3

    .line 157
    int-to-long v7, v3

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getTraderInfoResponse()Lcom/kubi/copytrading/assets/TraderInfoResponse;

    .line 161
    move-result-object v3

    .line 162
    .line 163
    if-eqz v3, :cond_7

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3}, Lcom/kubi/copytrading/assets/TraderInfoResponse;->getNickName()Ljava/lang/String;

    .line 167
    move-result-object v2

    .line 168
    .line 169
    :cond_7
    if-nez v2, :cond_8

    .line 170
    .line 171
    move-object/from16 v20, v15

    .line 172
    goto :goto_6

    .line 173
    .line 174
    :cond_8
    move-object/from16 v20, v2

    .line 175
    .line 176
    .line 177
    :goto_6
    invoke-static {v1, v6}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 178
    move-result-object v21

    .line 179
    .line 180
    const/16 v22, 0x0

    .line 181
    move-object v15, v4

    .line 182
    .line 183
    move-wide/from16 v18, v7

    .line 184
    .line 185
    .line 186
    invoke-direct/range {v14 .. v22}, Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    .line 188
    new-instance v1, Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingShareFooterInfo;

    .line 189
    .line 190
    sget v2, Lcom/kubi/copytrading/R$string;->bcopytd_share_copy_pnl_title:I

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 194
    move-result-object v2

    .line 195
    .line 196
    const-string v3, "getString(...)"

    .line 197
    .line 198
    .line 199
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    .line 201
    new-instance v3, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 205
    .line 206
    sget v4, Lcom/kubi/copytrading/R$string;->my_referralcode:I

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 210
    move-result-object v4

    .line 211
    .line 212
    .line 213
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    move-result-object v3

    .line 221
    .line 222
    new-instance v4, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 226
    .line 227
    sget-object v6, Lcom/kubi/host/HostManager;->a:Lcom/kubi/host/HostManager;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v6}, Lcom/kubi/host/HostManager;->e()Ljava/lang/String;

    .line 231
    move-result-object v6

    .line 232
    .line 233
    .line 234
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    const-string v6, "/ucenter/signup?rcode="

    .line 237
    .line 238
    .line 239
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    move-result-object v4

    .line 247
    .line 248
    .line 249
    invoke-direct {v1, v2, v3, v4}, Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingShareFooterInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    .line 251
    new-instance v2, Lcom/kubi/copytrading/assets/copy/e;

    .line 252
    .line 253
    .line 254
    invoke-direct {v2}, Lcom/kubi/copytrading/assets/copy/e;-><init>()V

    .line 255
    .line 256
    .line 257
    invoke-interface {v13, v0, v14, v1, v2}, Le00/d;->c(Landroid/content/Context;Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity;Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingShareFooterInfo;Lkotlin/jvm/functions/Function2;)V

    .line 258
    return-void
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
.end method

.method public bridge synthetic convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->q(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;)V

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
.end method

.method public final n(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;Landroid/content/Context;I)V
    .locals 19

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p3

    .line 7
    .line 8
    sget v3, Lcom/kubi/copytrading/R$id;->llTrial:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 12
    move-result-object v4

    .line 13
    .line 14
    sget v3, Lcom/kubi/copytrading/R$id;->tvTodayLabel:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 18
    move-result-object v3

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getFundsType()Ljava/lang/String;

    .line 22
    move-result-object v5

    .line 23
    .line 24
    const-string v6, "copyTrial"

    .line 25
    .line 26
    .line 27
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    move-result v5

    .line 29
    .line 30
    const/16 v6, 0x10

    .line 31
    .line 32
    const-string v7, "getView(...)"

    .line 33
    const/4 v8, 0x0

    .line 34
    .line 35
    if-nez v5, :cond_4

    .line 36
    .line 37
    iget-object v5, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 41
    move-result-object v5

    .line 42
    .line 43
    instance-of v9, v5, Ljava/lang/Integer;

    .line 44
    .line 45
    if-eqz v9, :cond_0

    .line 46
    .line 47
    check-cast v5, Ljava/lang/Integer;

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move-object v5, v8

    .line 50
    .line 51
    :goto_0
    if-eqz v5, :cond_1

    .line 52
    .line 53
    iget-object v9, v0, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->l:Ljava/util/Set;

    .line 54
    .line 55
    .line 56
    invoke-interface {v9, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 57
    .line 58
    sget-object v9, Lcom/kubi/sdk/util/TimeSyncManager;->a:Lcom/kubi/sdk/util/TimeSyncManager;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 62
    move-result v5

    .line 63
    .line 64
    .line 65
    invoke-virtual {v9, v5}, Lcom/kubi/sdk/util/TimeSyncManager;->s(I)V

    .line 66
    .line 67
    iget-object v5, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v4}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 77
    .line 78
    sget v4, Lcom/kubi/copytrading/R$id;->flRatioLabel:I

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 82
    move-result-object v4

    .line 83
    .line 84
    .line 85
    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v4}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 89
    .line 90
    sget v4, Lcom/kubi/copytrading/R$id;->tvRatioValue:I

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 94
    move-result-object v1

    .line 95
    .line 96
    .line 97
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 104
    move-result-object v1

    .line 105
    .line 106
    instance-of v4, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 107
    .line 108
    if-eqz v4, :cond_2

    .line 109
    move-object v8, v1

    .line 110
    .line 111
    check-cast v8, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 112
    .line 113
    :cond_2
    if-eqz v8, :cond_3

    .line 114
    .line 115
    .line 116
    invoke-static {v2, v6}, Lcom/kubi/utils/extensions/core/c;->b(Landroid/content/Context;I)I

    .line 117
    move-result v1

    .line 118
    .line 119
    iput v1, v8, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 120
    .line 121
    .line 122
    :cond_3
    invoke-virtual {v3}, Landroid/view/View;->requestLayout()V

    .line 123
    return-void

    .line 124
    .line 125
    .line 126
    :cond_4
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v4}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 130
    .line 131
    sget v5, Lcom/kubi/copytrading/R$id;->flRatioLabel:I

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 135
    move-result-object v5

    .line 136
    .line 137
    .line 138
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v5}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 142
    .line 143
    sget v5, Lcom/kubi/copytrading/R$id;->tvRatioValue:I

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 147
    move-result-object v5

    .line 148
    .line 149
    .line 150
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-static {v5}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 157
    move-result-object v5

    .line 158
    .line 159
    instance-of v7, v5, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 160
    .line 161
    if-eqz v7, :cond_5

    .line 162
    .line 163
    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 164
    goto :goto_1

    .line 165
    :cond_5
    move-object v5, v8

    .line 166
    .line 167
    :goto_1
    if-eqz v5, :cond_6

    .line 168
    .line 169
    .line 170
    invoke-static {v2, v6}, Lcom/kubi/utils/extensions/core/c;->b(Landroid/content/Context;I)I

    .line 171
    move-result v6

    .line 172
    .line 173
    iput v6, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 174
    .line 175
    .line 176
    :cond_6
    invoke-virtual {v3}, Landroid/view/View;->requestLayout()V

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getCurrency()Ljava/lang/String;

    .line 180
    move-result-object v3

    .line 181
    .line 182
    const-string v5, "--"

    .line 183
    .line 184
    .line 185
    invoke-static {v3, v5}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 186
    move-result-object v3

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getAmount()Ljava/math/BigDecimal;

    .line 190
    move-result-object v9

    .line 191
    .line 192
    if-eqz v9, :cond_7

    .line 193
    .line 194
    const/16 v17, 0x7d

    .line 195
    .line 196
    const/16 v18, 0x0

    .line 197
    const/4 v10, 0x0

    .line 198
    const/4 v12, 0x0

    .line 199
    const/4 v13, 0x0

    .line 200
    const/4 v14, 0x0

    .line 201
    const/4 v15, 0x0

    .line 202
    .line 203
    const/16 v16, 0x0

    .line 204
    .line 205
    move/from16 v11, p4

    .line 206
    .line 207
    .line 208
    invoke-static/range {v9 .. v18}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 209
    move-result-object v6

    .line 210
    goto :goto_2

    .line 211
    :cond_7
    move-object v6, v8

    .line 212
    .line 213
    .line 214
    :goto_2
    invoke-static {v6, v5}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 215
    move-result-object v5

    .line 216
    .line 217
    sget v6, Lcom/kubi/copytrading/R$id;->tvTrialAmount:I

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 221
    move-result-object v6

    .line 222
    .line 223
    check-cast v6, Lcom/kubi/resources/widget/BaseTextView;

    .line 224
    .line 225
    sget v7, Lcom/kubi/copytrading/R$string;->copy_trade_trial_fund_using_label:I

    .line 226
    .line 227
    .line 228
    filled-new-array {v5, v3}, [Ljava/lang/Object;

    .line 229
    move-result-object v3

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v7, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 233
    move-result-object v3

    .line 234
    .line 235
    .line 236
    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 237
    .line 238
    sget-object v3, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 239
    .line 240
    .line 241
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 242
    .line 243
    new-instance v5, Lkotlin/Pair;

    .line 244
    .line 245
    sget-object v7, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 246
    .line 247
    sget v9, Lcom/kubi/copytrading/R$font;->bold:I

    .line 248
    .line 249
    .line 250
    invoke-virtual {v6}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 251
    move-result v10

    .line 252
    .line 253
    .line 254
    invoke-static {v9, v10}, Lcom/kubi/resources/t;->f(II)Landroid/text/style/CharacterStyle;

    .line 255
    move-result-object v9

    .line 256
    .line 257
    .line 258
    invoke-direct {v5, v7, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    filled-new-array {v5}, [Lkotlin/Pair;

    .line 262
    move-result-object v5

    .line 263
    .line 264
    .line 265
    invoke-virtual {v3, v6, v5}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getExpireTime()Ljava/lang/Long;

    .line 269
    move-result-object v3

    .line 270
    .line 271
    const-wide/16 v5, 0x0

    .line 272
    .line 273
    if-eqz v3, :cond_8

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 277
    move-result-wide v9

    .line 278
    goto :goto_3

    .line 279
    :cond_8
    move-wide v9, v5

    .line 280
    .line 281
    :goto_3
    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 285
    move-result-object v3

    .line 286
    .line 287
    instance-of v7, v3, Ljava/lang/Integer;

    .line 288
    .line 289
    if-eqz v7, :cond_9

    .line 290
    .line 291
    check-cast v3, Ljava/lang/Integer;

    .line 292
    goto :goto_4

    .line 293
    :cond_9
    move-object v3, v8

    .line 294
    .line 295
    :goto_4
    if-eqz v3, :cond_a

    .line 296
    .line 297
    iget-object v7, v0, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->l:Ljava/util/Set;

    .line 298
    .line 299
    .line 300
    invoke-interface {v7, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 301
    .line 302
    sget-object v7, Lcom/kubi/sdk/util/TimeSyncManager;->a:Lcom/kubi/sdk/util/TimeSyncManager;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 306
    move-result v3

    .line 307
    .line 308
    .line 309
    invoke-virtual {v7, v3}, Lcom/kubi/sdk/util/TimeSyncManager;->s(I)V

    .line 310
    .line 311
    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v3, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 315
    .line 316
    :cond_a
    sget v3, Lcom/kubi/copytrading/R$id;->tvTrialExpire:I

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 320
    move-result-object v3

    .line 321
    .line 322
    check-cast v3, Lcom/kubi/resources/widget/BaseTextView;

    .line 323
    .line 324
    new-instance v7, Lkotlin/jvm/internal/Ref$IntRef;

    .line 325
    .line 326
    .line 327
    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 328
    const/4 v8, -0x1

    .line 329
    .line 330
    iput v8, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 331
    .line 332
    sget-object v8, Lcom/kubi/sdk/util/TimeSyncManager;->a:Lcom/kubi/sdk/util/TimeSyncManager;

    .line 333
    .line 334
    new-instance v11, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter$a;

    .line 335
    .line 336
    .line 337
    invoke-direct {v11, v3, v2}, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter$a;-><init>(Lcom/kubi/resources/widget/BaseTextView;Landroid/content/Context;)V

    .line 338
    .line 339
    new-instance v12, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter$b;

    .line 340
    .line 341
    .line 342
    invoke-direct {v12, v0, v7, v1}, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter$b;-><init>(Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;Lkotlin/jvm/internal/Ref$IntRef;Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v8, v9, v10, v11, v12}, Lcom/kubi/sdk/util/TimeSyncManager;->i(JLcom/kubi/sdk/util/c;Lcom/kubi/sdk/util/d;)I

    .line 346
    move-result v11

    .line 347
    .line 348
    iput v11, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 349
    .line 350
    .line 351
    invoke-virtual {v8}, Lcom/kubi/sdk/util/TimeSyncManager;->p()J

    .line 352
    move-result-wide v11

    .line 353
    sub-long/2addr v9, v11

    .line 354
    .line 355
    const/16 v8, 0x3e8

    .line 356
    int-to-long v11, v8

    .line 357
    div-long/2addr v9, v11

    .line 358
    .line 359
    .line 360
    invoke-static {v9, v10, v5, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(JJ)J

    .line 361
    move-result-wide v5

    .line 362
    .line 363
    .line 364
    invoke-static {v2, v5, v6}, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->o(Landroid/content/Context;J)Ljava/lang/String;

    .line 365
    move-result-object v2

    .line 366
    .line 367
    .line 368
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 369
    .line 370
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 371
    .line 372
    iget v2, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 373
    .line 374
    .line 375
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 376
    move-result-object v2

    .line 377
    .line 378
    .line 379
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 380
    .line 381
    iget-object v1, v0, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->l:Ljava/util/Set;

    .line 382
    .line 383
    iget v2, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 384
    .line 385
    .line 386
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 387
    move-result-object v2

    .line 388
    .line 389
    .line 390
    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 391
    .line 392
    new-instance v7, Lcom/kubi/copytrading/assets/copy/d;

    .line 393
    .line 394
    .line 395
    invoke-direct {v7}, Lcom/kubi/copytrading/assets/copy/d;-><init>()V

    .line 396
    const/4 v8, 0x1

    .line 397
    const/4 v9, 0x0

    .line 398
    .line 399
    const-wide/16 v5, 0x0

    .line 400
    .line 401
    .line 402
    invoke-static/range {v4 .. v9}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 403
    return-void
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
.end method

.method public bridge synthetic onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lio/chad/library/adapter/base/BaseViewHolder;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->w(Lio/chad/library/adapter/base/BaseViewHolder;)V

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
.end method

.method public q(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;)V
    .locals 30
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v2, p1

    .line 5
    .line 6
    move-object/from16 v3, p2

    .line 7
    .line 8
    const-string v0, "helper"

    .line 9
    .line 10
    .line 11
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    const-string v0, "item"

    .line 14
    .line 15
    .line 16
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 20
    move-result v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 24
    move-result-object v4

    .line 25
    .line 26
    .line 27
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 28
    move-result v4

    .line 29
    .line 30
    const-string v5, "getView(...)"

    .line 31
    .line 32
    if-ne v0, v4, :cond_0

    .line 33
    .line 34
    sget v0, Lcom/kubi/copytrading/R$id;->dividerView:I

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 45
    goto :goto_0

    .line 46
    .line 47
    :cond_0
    sget v0, Lcom/kubi/copytrading/R$id;->dividerView:I

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    .line 54
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    invoke-virtual {v3}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getCurrency()Ljava/lang/String;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    const-string v4, "--"

    .line 64
    .line 65
    .line 66
    invoke-static {v0, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    move-result-object v5

    .line 68
    .line 69
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 70
    .line 71
    sget-object v0, Lcom/kubi/kumex/api/IKuMexService;->a:Lcom/kubi/kumex/api/IKuMexService$Companion;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/kubi/kumex/api/IKuMexService$Companion;->get()Lcom/kubi/kumex/api/IKuMexService;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    .line 78
    invoke-interface {v0, v5}, Lcom/kubi/kumex/api/IKuMexService;->S(Ljava/lang/String;)Ljava/util/Map;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    const-string v7, "properties"

    .line 82
    .line 83
    .line 84
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    instance-of v7, v0, Ljava/util/Map;

    .line 88
    .line 89
    if-eqz v7, :cond_1

    .line 90
    .line 91
    check-cast v0, Ljava/util/Map;

    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception v0

    .line 94
    goto :goto_5

    .line 95
    :cond_1
    const/4 v0, 0x0

    .line 96
    .line 97
    :goto_1
    if-eqz v0, :cond_2

    .line 98
    .line 99
    const-string v7, "shortDisplayPrecision"

    .line 100
    .line 101
    .line 102
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    move-result-object v0

    .line 104
    goto :goto_2

    .line 105
    :cond_2
    const/4 v0, 0x0

    .line 106
    .line 107
    :goto_2
    instance-of v7, v0, Ljava/lang/Number;

    .line 108
    .line 109
    if-eqz v7, :cond_3

    .line 110
    .line 111
    check-cast v0, Ljava/lang/Number;

    .line 112
    goto :goto_3

    .line 113
    :cond_3
    const/4 v0, 0x0

    .line 114
    .line 115
    :goto_3
    if-eqz v0, :cond_4

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 119
    move-result v0

    .line 120
    .line 121
    .line 122
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    move-result-object v0

    .line 124
    goto :goto_4

    .line 125
    :cond_4
    const/4 v0, 0x0

    .line 126
    .line 127
    .line 128
    :goto_4
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    goto :goto_6

    .line 131
    .line 132
    :goto_5
    sget-object v7, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 133
    .line 134
    .line 135
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 136
    move-result-object v0

    .line 137
    .line 138
    .line 139
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    move-result-object v0

    .line 141
    .line 142
    .line 143
    :goto_6
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 144
    move-result v7

    .line 145
    .line 146
    if-eqz v7, :cond_5

    .line 147
    const/4 v0, 0x0

    .line 148
    .line 149
    :cond_5
    check-cast v0, Ljava/lang/Integer;

    .line 150
    const/4 v7, 0x4

    .line 151
    .line 152
    .line 153
    invoke-static {v0, v7}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 154
    move-result v10

    .line 155
    .line 156
    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 160
    move-result-object v0

    .line 161
    .line 162
    sget v7, Lcom/kubi/copytrading/R$id;->userAvatar:I

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 166
    move-result-object v7

    .line 167
    .line 168
    check-cast v7, Lcom/kubi/copytrading/view/CopyTradingUserAvatarView;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getTraderInfoResponse()Lcom/kubi/copytrading/assets/TraderInfoResponse;

    .line 172
    move-result-object v8

    .line 173
    .line 174
    if-eqz v8, :cond_6

    .line 175
    .line 176
    .line 177
    invoke-virtual {v8}, Lcom/kubi/copytrading/assets/TraderInfoResponse;->getAvatarUrl()Ljava/lang/String;

    .line 178
    move-result-object v8

    .line 179
    goto :goto_7

    .line 180
    :cond_6
    const/4 v8, 0x0

    .line 181
    .line 182
    .line 183
    :goto_7
    invoke-virtual {v3}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getTraderInfoResponse()Lcom/kubi/copytrading/assets/TraderInfoResponse;

    .line 184
    move-result-object v9

    .line 185
    .line 186
    if-eqz v9, :cond_7

    .line 187
    .line 188
    .line 189
    invoke-virtual {v9}, Lcom/kubi/copytrading/assets/TraderInfoResponse;->getNickName()Ljava/lang/String;

    .line 190
    move-result-object v9

    .line 191
    goto :goto_8

    .line 192
    :cond_7
    const/4 v9, 0x0

    .line 193
    .line 194
    .line 195
    :goto_8
    invoke-virtual {v7, v8, v9}, Lcom/kubi/copytrading/view/CopyTradingUserAvatarView;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    sget v7, Lcom/kubi/copytrading/R$id;->userName:I

    .line 198
    .line 199
    .line 200
    invoke-virtual {v3}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getTraderInfoResponse()Lcom/kubi/copytrading/assets/TraderInfoResponse;

    .line 201
    move-result-object v8

    .line 202
    .line 203
    if-eqz v8, :cond_8

    .line 204
    .line 205
    .line 206
    invoke-virtual {v8}, Lcom/kubi/copytrading/assets/TraderInfoResponse;->getNickName()Ljava/lang/String;

    .line 207
    move-result-object v8

    .line 208
    goto :goto_9

    .line 209
    :cond_8
    const/4 v8, 0x0

    .line 210
    .line 211
    .line 212
    :goto_9
    invoke-static {v8, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 213
    move-result-object v8

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2, v7, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 217
    .line 218
    sget v7, Lcom/kubi/copytrading/R$id;->tvPnlLabel:I

    .line 219
    .line 220
    sget v8, Lcom/kubi/copytrading/R$string;->copytd_total_item_pnl:I

    .line 221
    .line 222
    .line 223
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 224
    move-result-object v9

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, v8, v9}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 228
    move-result-object v8

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v7, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 232
    .line 233
    sget v8, Lcom/kubi/copytrading/R$id;->tvTodayLabel:I

    .line 234
    .line 235
    sget v9, Lcom/kubi/copytrading/R$string;->copytd_today_pnl:I

    .line 236
    .line 237
    .line 238
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 239
    move-result-object v11

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v9, v11}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 243
    move-result-object v9

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2, v8, v9}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 247
    .line 248
    sget v8, Lcom/kubi/copytrading/R$id;->tvInvestmentLabel:I

    .line 249
    .line 250
    sget v9, Lcom/kubi/copytrading/R$string;->copytd_current_investment:I

    .line 251
    .line 252
    .line 253
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 254
    move-result-object v5

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v9, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 258
    move-result-object v5

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, v8, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 262
    .line 263
    new-instance v5, Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 267
    .line 268
    const/16 v8, 0x28

    .line 269
    .line 270
    .line 271
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getTotalPnlRatio()Ljava/math/BigDecimal;

    .line 275
    move-result-object v11

    .line 276
    .line 277
    if-eqz v11, :cond_9

    .line 278
    .line 279
    const/16 v18, 0x37

    .line 280
    .line 281
    const/16 v19, 0x0

    .line 282
    const/4 v12, 0x0

    .line 283
    const/4 v13, 0x0

    .line 284
    const/4 v14, 0x0

    .line 285
    const/4 v15, 0x1

    .line 286
    .line 287
    const/16 v16, 0x0

    .line 288
    .line 289
    const/16 v17, 0x0

    .line 290
    .line 291
    .line 292
    invoke-static/range {v11 .. v19}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 293
    move-result-object v8

    .line 294
    goto :goto_a

    .line 295
    :cond_9
    const/4 v8, 0x0

    .line 296
    .line 297
    .line 298
    :goto_a
    invoke-static {v8, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 299
    move-result-object v8

    .line 300
    .line 301
    .line 302
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    const/16 v8, 0x29

    .line 305
    .line 306
    .line 307
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    move-result-object v5

    .line 312
    .line 313
    new-instance v8, Lcom/kubi/utils/v0;

    .line 314
    .line 315
    .line 316
    invoke-direct {v8}, Lcom/kubi/utils/v0;-><init>()V

    .line 317
    .line 318
    new-instance v9, Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v3}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getTotalPnl()Ljava/math/BigDecimal;

    .line 325
    move-result-object v11

    .line 326
    .line 327
    .line 328
    invoke-static {v11}, Lcom/kubi/utils/extensions/d;->d(Ljava/lang/Number;)Ljava/lang/String;

    .line 329
    move-result-object v11

    .line 330
    .line 331
    .line 332
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    move-object v11, v8

    .line 334
    .line 335
    .line 336
    invoke-virtual {v3}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getTotalPnl()Ljava/math/BigDecimal;

    .line 337
    move-result-object v8

    .line 338
    .line 339
    if-eqz v8, :cond_a

    .line 340
    .line 341
    const/16 v16, 0x5d

    .line 342
    .line 343
    const/16 v17, 0x0

    .line 344
    move-object v12, v9

    .line 345
    const/4 v9, 0x0

    .line 346
    move-object v13, v11

    .line 347
    const/4 v11, 0x0

    .line 348
    move-object v14, v12

    .line 349
    const/4 v12, 0x0

    .line 350
    move-object v15, v13

    .line 351
    const/4 v13, 0x0

    .line 352
    .line 353
    move-object/from16 v18, v14

    .line 354
    const/4 v14, 0x2

    .line 355
    .line 356
    move-object/from16 v19, v15

    .line 357
    const/4 v15, 0x0

    .line 358
    .line 359
    move-object/from16 v6, v18

    .line 360
    .line 361
    move/from16 v18, v7

    .line 362
    move-object v7, v6

    .line 363
    .line 364
    move-object/from16 v6, v19

    .line 365
    .line 366
    .line 367
    invoke-static/range {v8 .. v17}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 368
    move-result-object v8

    .line 369
    goto :goto_b

    .line 370
    .line 371
    :cond_a
    move/from16 v18, v7

    .line 372
    move-object v7, v9

    .line 373
    move-object v6, v11

    .line 374
    const/4 v8, 0x0

    .line 375
    .line 376
    .line 377
    :goto_b
    invoke-static {v8, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 378
    move-result-object v8

    .line 379
    .line 380
    .line 381
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 385
    move-result-object v7

    .line 386
    .line 387
    .line 388
    invoke-virtual {v6, v7}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 389
    move-result-object v6

    .line 390
    .line 391
    const/16 v7, 0xc

    .line 392
    .line 393
    .line 394
    invoke-virtual {v6, v5, v7}, Lcom/kubi/utils/v0;->d(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 395
    move-result-object v5

    .line 396
    .line 397
    sget v6, Lcom/kubi/copytrading/R$id;->tvPnlValue:I

    .line 398
    .line 399
    .line 400
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v3}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getTotalPnl()Ljava/math/BigDecimal;

    .line 404
    move-result-object v7

    .line 405
    .line 406
    .line 407
    invoke-static {v7}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 408
    move-result-object v7

    .line 409
    const/4 v8, 0x0

    .line 410
    const/4 v9, 0x2

    .line 411
    const/4 v11, 0x0

    .line 412
    .line 413
    .line 414
    invoke-static {v0, v7, v8, v9, v11}, Lcom/kubi/resources/g;->g(Landroid/content/Context;Ljava/math/BigDecimal;IILjava/lang/Object;)I

    .line 415
    move-result v7

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v2, v6, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 422
    .line 423
    sget v5, Lcom/kubi/copytrading/R$id;->tvTodayValue:I

    .line 424
    .line 425
    .line 426
    invoke-virtual {v3}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getTodayPnl()Ljava/math/BigDecimal;

    .line 427
    move-result-object v6

    .line 428
    .line 429
    .line 430
    invoke-static {v6}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 431
    move-result-object v6

    .line 432
    .line 433
    .line 434
    invoke-static {v0, v6, v8, v9, v11}, Lcom/kubi/resources/g;->g(Landroid/content/Context;Ljava/math/BigDecimal;IILjava/lang/Object;)I

    .line 435
    move-result v6

    .line 436
    .line 437
    .line 438
    invoke-virtual {v2, v5, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 439
    .line 440
    new-instance v6, Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v3}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getTodayPnl()Ljava/math/BigDecimal;

    .line 447
    move-result-object v7

    .line 448
    .line 449
    .line 450
    invoke-static {v7}, Lcom/kubi/utils/extensions/d;->d(Ljava/lang/Number;)Ljava/lang/String;

    .line 451
    move-result-object v7

    .line 452
    .line 453
    .line 454
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v3}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getTodayPnl()Ljava/math/BigDecimal;

    .line 458
    move-result-object v8

    .line 459
    .line 460
    if-eqz v8, :cond_b

    .line 461
    .line 462
    const/16 v16, 0x5d

    .line 463
    .line 464
    const/16 v17, 0x0

    .line 465
    const/4 v9, 0x0

    .line 466
    .line 467
    move-object/from16 v20, v11

    .line 468
    const/4 v11, 0x0

    .line 469
    const/4 v12, 0x0

    .line 470
    const/4 v13, 0x0

    .line 471
    const/4 v14, 0x2

    .line 472
    const/4 v15, 0x0

    .line 473
    .line 474
    .line 475
    invoke-static/range {v8 .. v17}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 476
    move-result-object v11

    .line 477
    goto :goto_c

    .line 478
    .line 479
    :cond_b
    move-object/from16 v20, v11

    .line 480
    .line 481
    .line 482
    :goto_c
    invoke-static {v11, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 483
    move-result-object v7

    .line 484
    .line 485
    .line 486
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 490
    move-result-object v6

    .line 491
    .line 492
    .line 493
    invoke-virtual {v2, v5, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 494
    .line 495
    sget v5, Lcom/kubi/copytrading/R$id;->tvInvestmentValue:I

    .line 496
    .line 497
    .line 498
    invoke-virtual {v3}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getCopyAmount()Ljava/math/BigDecimal;

    .line 499
    move-result-object v8

    .line 500
    .line 501
    if-eqz v8, :cond_c

    .line 502
    .line 503
    const/16 v16, 0x5d

    .line 504
    .line 505
    const/16 v17, 0x0

    .line 506
    const/4 v9, 0x0

    .line 507
    const/4 v11, 0x0

    .line 508
    const/4 v12, 0x0

    .line 509
    const/4 v13, 0x0

    .line 510
    const/4 v14, 0x2

    .line 511
    const/4 v15, 0x0

    .line 512
    .line 513
    .line 514
    invoke-static/range {v8 .. v17}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 515
    move-result-object v11

    .line 516
    goto :goto_d

    .line 517
    .line 518
    :cond_c
    move-object/from16 v11, v20

    .line 519
    .line 520
    .line 521
    :goto_d
    invoke-static {v11, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 522
    move-result-object v6

    .line 523
    .line 524
    .line 525
    invoke-virtual {v2, v5, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v3}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getProfitSharingRatio()Ljava/math/BigDecimal;

    .line 529
    move-result-object v21

    .line 530
    .line 531
    if-eqz v21, :cond_d

    .line 532
    .line 533
    const/16 v28, 0x3f

    .line 534
    .line 535
    const/16 v29, 0x0

    .line 536
    .line 537
    const/16 v22, 0x0

    .line 538
    .line 539
    const/16 v23, 0x0

    .line 540
    .line 541
    const/16 v24, 0x0

    .line 542
    .line 543
    const/16 v25, 0x0

    .line 544
    .line 545
    const/16 v26, 0x0

    .line 546
    .line 547
    const/16 v27, 0x0

    .line 548
    .line 549
    .line 550
    invoke-static/range {v21 .. v29}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 551
    move-result-object v6

    .line 552
    goto :goto_e

    .line 553
    .line 554
    :cond_d
    move-object/from16 v6, v20

    .line 555
    .line 556
    .line 557
    :goto_e
    invoke-static {v6, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 558
    move-result-object v5

    .line 559
    .line 560
    sget v6, Lcom/kubi/copytrading/R$id;->tvRatioValue:I

    .line 561
    .line 562
    .line 563
    invoke-virtual {v2, v6, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 564
    .line 565
    sget v6, Lcom/kubi/copytrading/R$id;->flRatioLabel:I

    .line 566
    .line 567
    new-instance v7, Lcom/kubi/copytrading/assets/copy/a;

    .line 568
    .line 569
    .line 570
    invoke-direct {v7, v1, v5}, Lcom/kubi/copytrading/assets/copy/a;-><init>(Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;Ljava/lang/String;)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v2, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 574
    .line 575
    sget v5, Lcom/kubi/copytrading/R$id;->tvDateValue:I

    .line 576
    .line 577
    .line 578
    invoke-virtual {v3}, Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;->getStartDate()Ljava/lang/Long;

    .line 579
    move-result-object v6

    .line 580
    .line 581
    if-eqz v6, :cond_f

    .line 582
    .line 583
    .line 584
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 585
    move-result-wide v19

    .line 586
    .line 587
    const/16 v25, 0xf

    .line 588
    .line 589
    const/16 v26, 0x0

    .line 590
    .line 591
    const/16 v21, 0x0

    .line 592
    .line 593
    const/16 v22, 0x0

    .line 594
    .line 595
    const/16 v23, 0x0

    .line 596
    .line 597
    const/16 v24, 0x0

    .line 598
    .line 599
    .line 600
    invoke-static/range {v19 .. v26}, Llf/a;->b(JLjava/util/Locale;ZLjava/util/TimeZone;ZILjava/lang/Object;)Ljava/lang/String;

    .line 601
    move-result-object v6

    .line 602
    .line 603
    if-nez v6, :cond_e

    .line 604
    goto :goto_f

    .line 605
    :cond_e
    move-object v4, v6

    .line 606
    .line 607
    .line 608
    :cond_f
    :goto_f
    invoke-virtual {v2, v5, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 609
    .line 610
    iget-object v11, v2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 611
    .line 612
    const-string v4, "itemView"

    .line 613
    .line 614
    .line 615
    invoke-static {v11, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 616
    .line 617
    new-instance v14, Lcom/kubi/copytrading/assets/copy/b;

    .line 618
    .line 619
    .line 620
    invoke-direct {v14, v3}, Lcom/kubi/copytrading/assets/copy/b;-><init>(Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;)V

    .line 621
    const/4 v15, 0x1

    .line 622
    .line 623
    const/16 v16, 0x0

    .line 624
    .line 625
    const-wide/16 v12, 0x0

    .line 626
    .line 627
    .line 628
    invoke-static/range {v11 .. v16}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 629
    .line 630
    new-instance v4, Lcom/kubi/copytrading/assets/copy/c;

    .line 631
    .line 632
    .line 633
    invoke-direct {v4, v1, v0, v3, v10}, Lcom/kubi/copytrading/assets/copy/c;-><init>(Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;Landroid/content/Context;Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;I)V

    .line 634
    .line 635
    move/from16 v5, v18

    .line 636
    .line 637
    .line 638
    invoke-virtual {v2, v5, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v1, v2, v3, v0, v10}, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->n(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;Landroid/content/Context;I)V

    .line 642
    .line 643
    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 644
    .line 645
    iget-boolean v2, v1, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->j:Z

    .line 646
    .line 647
    .line 648
    invoke-static {v0, v2}, Lcom/kubi/resources/widget/ShowHideTextView;->d(Landroid/view/View;Z)V

    .line 649
    return-void
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
.end method

.method public final u()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->k:Lkotlin/jvm/functions/Function0;

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
.end method

.method public w(Lio/chad/library/adapter/base/BaseViewHolder;)V
    .locals 3
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "holder"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    .line 9
    .line 10
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    instance-of v1, v0, Ljava/lang/Integer;

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    check-cast v0, Ljava/lang/Integer;

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v0, v2

    .line 24
    .line 25
    :goto_0
    if-eqz v0, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 29
    move-result v1

    .line 30
    .line 31
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 35
    .line 36
    iget-object p1, p0, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->l:Ljava/util/Set;

    .line 37
    .line 38
    .line 39
    invoke-interface {p1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 40
    .line 41
    sget-object p1, Lcom/kubi/sdk/util/TimeSyncManager;->a:Lcom/kubi/sdk/util/TimeSyncManager;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v1}, Lcom/kubi/sdk/util/TimeSyncManager;->s(I)V

    .line 45
    :cond_1
    return-void
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
.end method

.method public final x()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->l:Ljava/util/Set;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    check-cast v1, Ljava/lang/Number;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 22
    move-result v1

    .line 23
    .line 24
    sget-object v2, Lcom/kubi/sdk/util/TimeSyncManager;->a:Lcom/kubi/sdk/util/TimeSyncManager;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v1}, Lcom/kubi/sdk/util/TimeSyncManager;->s(I)V

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->l:Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 34
    const/4 v0, 0x0

    .line 35
    .line 36
    iput-object v0, p0, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->k:Lkotlin/jvm/functions/Function0;

    .line 37
    return-void
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
.end method

.method public final y(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;->j:Z

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
.end method
