.class public final Lcom/kubi/assets/overview/coin/AssetCoinAdapter;
.super Lio/chad/library/adapter/base/BaseQuickAdapter;
.source "AssetCoinAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/kubi/assets/entity/AssetCoinEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\u0008\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001c\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0014J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u001f\u0010\u0013\u001a\u00020\u0014*\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0002\u00a2\u0006\u0002\u0010\u0017J\u0012\u0010\u0018\u001a\u00020\u00142\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000b\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/kubi/assets/overview/coin/AssetCoinAdapter;",
        "Lio/chad/library/adapter/base/BaseQuickAdapter;",
        "Lcom/kubi/assets/entity/AssetCoinEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "<init>",
        "()V",
        "hideNumber",
        "",
        "getHideNumber",
        "()Z",
        "setHideNumber",
        "(Z)V",
        "convert",
        "",
        "helper",
        "item",
        "updateWSData",
        "entity",
        "Lcom/kubi/data/entity/WsMarketSnapshotEntity;",
        "dealPrice",
        "",
        "",
        "coinOrSymbol",
        "(Ljava/lang/Double;Ljava/lang/String;)Ljava/lang/String;",
        "getTradeCode",
        "abbreviateAddress",
        "address",
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
        "SMAP\nAssetCoinAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetCoinAdapter.kt\ncom/kubi/assets/overview/coin/AssetCoinAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,210:1\n295#2,2:211\n*S KotlinDebug\n*F\n+ 1 AssetCoinAdapter.kt\ncom/kubi/assets/overview/coin/AssetCoinAdapter\n*L\n182#1:211,2\n*E\n"
    }
.end annotation


# instance fields
.field public i:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/assets/R$layout;->asset_item_coin:I

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;-><init>(I)V

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
.end method

.method public static synthetic g(Lcom/kubi/assets/entity/AssetCoinEntity;Lcom/kubi/assets/overview/coin/AssetCoinAdapter;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/overview/coin/AssetCoinAdapter;->q(Lcom/kubi/assets/entity/AssetCoinEntity;Lcom/kubi/assets/overview/coin/AssetCoinAdapter;)Lkotlin/Unit;

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

.method public static synthetic h(Landroid/widget/TextView;Landroid/text/TextPaint;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/overview/coin/AssetCoinAdapter;->r(Landroid/widget/TextView;Landroid/text/TextPaint;)Lkotlin/Unit;

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

.method public static synthetic i(Lcom/kubi/assets/overview/coin/AssetCoinAdapter;Lcom/kubi/data/entity/WsMarketSnapshotEntity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/overview/coin/AssetCoinAdapter;->x(Lcom/kubi/assets/overview/coin/AssetCoinAdapter;Lcom/kubi/data/entity/WsMarketSnapshotEntity;)Lkotlin/Unit;

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

.method public static synthetic j(Lcom/kubi/assets/entity/AssetCoinEntity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/coin/AssetCoinAdapter;->o(Lcom/kubi/assets/entity/AssetCoinEntity;)Lkotlin/Unit;

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

.method public static synthetic k()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/overview/coin/AssetCoinAdapter;->p()Lkotlin/Unit;

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

.method public static synthetic l(Lcom/kubi/assets/entity/AssetCoinEntity;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/overview/coin/AssetCoinAdapter;->s(Lcom/kubi/assets/entity/AssetCoinEntity;Landroid/view/View;)V

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

.method private final m(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    if-le v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x4

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    const-string v3, "substring(...)"

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const/16 v1, 0x2026

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-static {p1, v2}, Lkotlin/text/StringsKt;->takeLast(Ljava/lang/String;I)Ljava/lang/String;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    move-result-object p1

    .line 44
    :cond_0
    return-object p1
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

.method public static final o(Lcom/kubi/assets/entity/AssetCoinEntity;)Lkotlin/Unit;
    .locals 10

    .line 1
    .line 2
    sget-object v0, Lf00/a;->a:Lf00/a;

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/assets/entity/AssetCoinEntity;->getCode()Ljava/lang/String;

    .line 8
    move-result-object p0

    .line 9
    :goto_0
    move-object v1, p0

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :goto_1
    const/16 v8, 0x7e

    .line 15
    const/4 v9, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static/range {v0 .. v9}, Lg00/a$a;->m(Lg00/a;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

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
.end method

.method public static final p()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

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
.end method

.method public static final q(Lcom/kubi/assets/entity/AssetCoinEntity;Lcom/kubi/assets/overview/coin/AssetCoinAdapter;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/assets/entity/AssetCoinEntity;->getTokenAddress()Ljava/lang/String;

    .line 6
    move-result-object p0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Lcom/kubi/utils/k;->b(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    iget-object p0, p1, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 18
    .line 19
    const-string p1, "vibrator"

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    move-result-object p0

    .line 24
    .line 25
    const-string p1, "null cannot be cast to non-null type android.os.Vibrator"

    .line 26
    .line 27
    .line 28
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    check-cast p0, Landroid/os/Vibrator;

    .line 31
    .line 32
    const-wide/16 v0, 0x64

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0, v1}, Landroid/os/Vibrator;->vibrate(J)V

    .line 36
    .line 37
    sget-object p0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 38
    .line 39
    sget p1, Lcom/kubi/assets/R$string;->copy_success:I

    .line 40
    const/4 v0, 0x0

    .line 41
    .line 42
    new-array v1, v0, [Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    move-result-object p0

    .line 47
    .line 48
    new-array p1, v0, [Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    invoke-static {p0, p1}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

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
.end method

.method public static final r(Landroid/widget/TextView;Landroid/text/TextPaint;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    const-string v0, "ds"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    sget v1, Lcom/kubi/assets/R$font;->regular:I

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Landroidx/core/content/res/ResourcesCompat;->getFont(Landroid/content/Context;I)Landroid/graphics/Typeface;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    move-result-object p0

    .line 23
    .line 24
    sget v0, Lcom/kubi/assets/R$color;->brandGreen:I

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 28
    move-result p0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p0}, Landroid/graphics/Paint;->setColor(I)V

    .line 32
    const/4 p0, 0x1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p0}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 38
    return-object p0
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

.method public static final s(Lcom/kubi/assets/entity/AssetCoinEntity;Landroid/view/View;)V
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/flutter/i0;->a:Lcom/kubi/sdk/flutter/i0;

    .line 3
    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v1, "delistcoin?coin="

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/kubi/assets/entity/AssetCoinEntity;->getCode()Ljava/lang/String;

    .line 18
    move-result-object p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    move-result-object v1

    .line 28
    const/4 v4, 0x6

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v2, 0x0

    .line 31
    const/4 v3, 0x0

    .line 32
    .line 33
    .line 34
    invoke-static/range {v0 .. v5}, Lcom/kubi/sdk/flutter/i0;->j(Lcom/kubi/sdk/flutter/i0;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 35
    return-void
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

.method public static final x(Lcom/kubi/assets/overview/coin/AssetCoinAdapter;Lcom/kubi/data/entity/WsMarketSnapshotEntity;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "getData(...)"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    move-result-object v1

    .line 24
    move-object v2, v1

    .line 25
    .line 26
    check-cast v2, Lcom/kubi/assets/entity/AssetCoinEntity;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v2}, Lcom/kubi/assets/overview/coin/AssetCoinAdapter;->u(Lcom/kubi/assets/entity/AssetCoinEntity;)Ljava/lang/String;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/kubi/data/entity/WsMarketSnapshotEntity;->getSymbolCode()Ljava/lang/String;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    move-result v2

    .line 39
    .line 40
    if-eqz v2, :cond_0

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 v1, 0x0

    .line 43
    .line 44
    :goto_0
    check-cast v1, Lcom/kubi/assets/entity/AssetCoinEntity;

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/kubi/assets/entity/AssetCoinEntity;->getLastTradedPrice()Ljava/lang/Double;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/kubi/data/entity/WsMarketSnapshotEntity;->getLastTradedPrice()D

    .line 54
    move-result-wide v2

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Double;D)Z

    .line 58
    move-result v0

    .line 59
    .line 60
    if-nez v0, :cond_2

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Lcom/kubi/assets/entity/AssetCoinEntity;->getChangeRate()Ljava/lang/Double;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/kubi/data/entity/WsMarketSnapshotEntity;->getChangeRate()D

    .line 68
    move-result-wide v2

    .line 69
    .line 70
    .line 71
    invoke-static {v0, v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Double;D)Z

    .line 72
    move-result v0

    .line 73
    .line 74
    if-nez v0, :cond_2

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/kubi/data/entity/WsMarketSnapshotEntity;->getLastTradedPrice()D

    .line 78
    move-result-wide v2

    .line 79
    .line 80
    .line 81
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v0}, Lcom/kubi/assets/entity/AssetCoinEntity;->setLastTradedPrice(Ljava/lang/Double;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/kubi/data/entity/WsMarketSnapshotEntity;->getChangeRate()D

    .line 89
    move-result-wide v2

    .line 90
    .line 91
    .line 92
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 93
    move-result-object p1

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, p1}, Lcom/kubi/assets/entity/AssetCoinEntity;->setChangeRate(Ljava/lang/Double;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 100
    move-result-object p1

    .line 101
    .line 102
    .line 103
    invoke-interface {p1, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 104
    move-result p1

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 108
    .line 109
    :cond_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 110
    return-object p0
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


# virtual methods
.method public bridge synthetic convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/assets/entity/AssetCoinEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/overview/coin/AssetCoinAdapter;->n(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/AssetCoinEntity;)V

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

.method public n(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/AssetCoinEntity;)V
    .locals 29
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/assets/entity/AssetCoinEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sget v7, Lcom/kubi/assets/R$id;->tv_amount:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 18
    move-result-object v7

    .line 19
    .line 20
    check-cast v7, Landroid/widget/TextView;

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    new-instance v8, Lrs/c$a;

    .line 25
    .line 26
    .line 27
    invoke-direct {v8, v5, v5, v3, v6}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v7, v8, v5, v4, v6}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 31
    .line 32
    :cond_0
    if-eqz v1, :cond_1

    .line 33
    .line 34
    sget v7, Lcom/kubi/assets/R$id;->tv_price:I

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 38
    move-result-object v7

    .line 39
    .line 40
    check-cast v7, Landroid/widget/TextView;

    .line 41
    .line 42
    if-eqz v7, :cond_1

    .line 43
    .line 44
    new-instance v8, Lrs/c$a;

    .line 45
    .line 46
    .line 47
    invoke-direct {v8, v5, v5, v3, v6}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v7, v8, v5, v4, v6}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 51
    .line 52
    :cond_1
    if-eqz v1, :cond_2

    .line 53
    .line 54
    sget v3, Lcom/kubi/assets/R$id;->iv_icon:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 58
    move-result-object v3

    .line 59
    .line 60
    check-cast v3, Lcom/kubi/resources/widget/CoinAvatarView;

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    move-object v3, v6

    .line 63
    .line 64
    :goto_0
    if-eqz v1, :cond_3

    .line 65
    .line 66
    sget v7, Lcom/kubi/assets/R$id;->ivSubIcon:I

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 70
    move-result-object v7

    .line 71
    .line 72
    check-cast v7, Lcom/kubi/resources/widget/CoinAvatarView;

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    move-object v7, v6

    .line 75
    .line 76
    :goto_1
    sget-object v8, Lgf/n;->a:Lgf/n;

    .line 77
    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AssetCoinEntity;->getCode()Ljava/lang/String;

    .line 82
    move-result-object v9

    .line 83
    goto :goto_2

    .line 84
    :cond_4
    move-object v9, v6

    .line 85
    .line 86
    :goto_2
    const-string v10, ""

    .line 87
    .line 88
    if-nez v9, :cond_5

    .line 89
    move-object v9, v10

    .line 90
    .line 91
    .line 92
    :cond_5
    invoke-virtual {v8, v9}, Lgf/n;->u(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 93
    move-result-object v9

    .line 94
    .line 95
    if-eqz v1, :cond_7

    .line 96
    .line 97
    sget v11, Lcom/kubi/assets/R$id;->delistingTip:I

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v11}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 101
    move-result-object v11

    .line 102
    move-object v12, v11

    .line 103
    .line 104
    check-cast v12, Landroid/widget/LinearLayout;

    .line 105
    .line 106
    if-eqz v12, :cond_7

    .line 107
    .line 108
    if-eqz v9, :cond_6

    .line 109
    .line 110
    .line 111
    invoke-virtual {v9}, Lcom/kubi/data/entity/CoinInfoEntity;->getProperties()Lcom/kubi/data/entity/CoinProperty;

    .line 112
    move-result-object v9

    .line 113
    .line 114
    if-eqz v9, :cond_6

    .line 115
    .line 116
    .line 117
    invoke-virtual {v9}, Lcom/kubi/data/entity/CoinProperty;->isDelisting()Ljava/lang/String;

    .line 118
    move-result-object v9

    .line 119
    goto :goto_3

    .line 120
    :cond_6
    move-object v9, v6

    .line 121
    .line 122
    :goto_3
    const-string v11, "TRUE"

    .line 123
    .line 124
    .line 125
    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    move-result v9

    .line 127
    .line 128
    .line 129
    invoke-static {v12, v9}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 130
    .line 131
    new-instance v15, Lcom/kubi/assets/overview/coin/b;

    .line 132
    .line 133
    .line 134
    invoke-direct {v15, v2}, Lcom/kubi/assets/overview/coin/b;-><init>(Lcom/kubi/assets/entity/AssetCoinEntity;)V

    .line 135
    .line 136
    const/16 v16, 0x1

    .line 137
    .line 138
    const/16 v17, 0x0

    .line 139
    .line 140
    const-wide/16 v13, 0x0

    .line 141
    .line 142
    .line 143
    invoke-static/range {v12 .. v17}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 144
    .line 145
    :cond_7
    if-eqz v2, :cond_8

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AssetCoinEntity;->getLastTradedPrice()Ljava/lang/Double;

    .line 149
    move-result-object v9

    .line 150
    goto :goto_4

    .line 151
    :cond_8
    move-object v9, v6

    .line 152
    .line 153
    .line 154
    :goto_4
    invoke-virtual {v0, v2}, Lcom/kubi/assets/overview/coin/AssetCoinAdapter;->u(Lcom/kubi/assets/entity/AssetCoinEntity;)Ljava/lang/String;

    .line 155
    move-result-object v11

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v9, v11}, Lcom/kubi/assets/overview/coin/AssetCoinAdapter;->t(Ljava/lang/Double;Ljava/lang/String;)Ljava/lang/String;

    .line 159
    move-result-object v9

    .line 160
    .line 161
    const-string v11, "mContext"

    .line 162
    .line 163
    const-string v12, "--"

    .line 164
    const/4 v13, 0x1

    .line 165
    .line 166
    if-eqz v1, :cond_11

    .line 167
    .line 168
    sget v14, Lcom/kubi/assets/R$id;->tv_coin_name:I

    .line 169
    .line 170
    if-eqz v2, :cond_9

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AssetCoinEntity;->getCurrency()Ljava/lang/String;

    .line 174
    move-result-object v15

    .line 175
    goto :goto_5

    .line 176
    :cond_9
    move-object v15, v6

    .line 177
    .line 178
    .line 179
    :goto_5
    invoke-static {v15}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 180
    move-result-object v15

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v14, v15}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 184
    move-result-object v14

    .line 185
    .line 186
    if-eqz v14, :cond_11

    .line 187
    .line 188
    sget v15, Lcom/kubi/assets/R$id;->tv_amount:I

    .line 189
    .line 190
    if-eqz v2, :cond_a

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AssetCoinEntity;->getTotalAmount()Ljava/lang/String;

    .line 194
    move-result-object v4

    .line 195
    .line 196
    if-eqz v4, :cond_a

    .line 197
    .line 198
    .line 199
    invoke-static {v4, v6, v13, v6}, Lcom/kubi/utils/extensions/DowngradeExKt;->e(Ljava/lang/String;Ljava/math/BigDecimal;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 200
    move-result-object v4

    .line 201
    .line 202
    if-eqz v4, :cond_a

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AssetCoinEntity;->getCode()Ljava/lang/String;

    .line 206
    move-result-object v13

    .line 207
    .line 208
    move-object/from16 v18, v10

    .line 209
    const/4 v10, 0x2

    .line 210
    .line 211
    .line 212
    invoke-static {v4, v13, v5, v10, v6}, Lgf/i;->b(Ljava/math/BigDecimal;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 213
    move-result-object v4

    .line 214
    goto :goto_6

    .line 215
    .line 216
    :cond_a
    move-object/from16 v18, v10

    .line 217
    move-object v4, v6

    .line 218
    .line 219
    .line 220
    :goto_6
    invoke-static {v4, v12}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 221
    move-result-object v4

    .line 222
    .line 223
    .line 224
    invoke-virtual {v14, v15, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 225
    move-result-object v4

    .line 226
    .line 227
    if-eqz v4, :cond_12

    .line 228
    .line 229
    sget v10, Lcom/kubi/assets/R$id;->tv_percentage:I

    .line 230
    .line 231
    if-eqz v2, :cond_b

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AssetCoinEntity;->getProportion()Ljava/lang/String;

    .line 235
    move-result-object v13

    .line 236
    .line 237
    move-object/from16 v19, v13

    .line 238
    goto :goto_7

    .line 239
    .line 240
    :cond_b
    move-object/from16 v19, v6

    .line 241
    .line 242
    :goto_7
    sget-object v20, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 243
    .line 244
    const/16 v23, 0x6

    .line 245
    .line 246
    const/16 v24, 0x0

    .line 247
    .line 248
    const/16 v21, 0x0

    .line 249
    .line 250
    const/16 v22, 0x0

    .line 251
    .line 252
    .line 253
    invoke-static/range {v19 .. v24}, Lcom/kubi/assets/AssetExKt;->h(Ljava/lang/String;Ljava/math/RoundingMode;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 254
    move-result-object v13

    .line 255
    .line 256
    .line 257
    invoke-virtual {v4, v10, v13}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 258
    move-result-object v4

    .line 259
    .line 260
    if-eqz v4, :cond_12

    .line 261
    .line 262
    sget v10, Lcom/kubi/assets/R$id;->tv_current_price:I

    .line 263
    .line 264
    .line 265
    invoke-virtual {v4, v10, v9}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 266
    move-result-object v4

    .line 267
    .line 268
    if-eqz v4, :cond_12

    .line 269
    .line 270
    sget v13, Lcom/kubi/assets/R$id;->tv_rate:I

    .line 271
    .line 272
    if-eqz v2, :cond_c

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AssetCoinEntity;->getChangeRate()Ljava/lang/Double;

    .line 276
    move-result-object v14

    .line 277
    .line 278
    if-eqz v14, :cond_c

    .line 279
    .line 280
    new-instance v15, Ljava/math/BigDecimal;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v14}, Ljava/lang/Double;->doubleValue()D

    .line 284
    move-result-wide v19

    .line 285
    .line 286
    .line 287
    invoke-static/range {v19 .. v20}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 288
    move-result-object v14

    .line 289
    .line 290
    .line 291
    invoke-direct {v15, v14}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    const/16 v26, 0x37

    .line 294
    .line 295
    const/16 v27, 0x0

    .line 296
    .line 297
    const/16 v20, 0x0

    .line 298
    .line 299
    const/16 v21, 0x0

    .line 300
    .line 301
    const/16 v22, 0x0

    .line 302
    .line 303
    const/16 v23, 0x1

    .line 304
    .line 305
    const/16 v24, 0x0

    .line 306
    .line 307
    const/16 v25, 0x0

    .line 308
    .line 309
    move-object/from16 v19, v15

    .line 310
    .line 311
    .line 312
    invoke-static/range {v19 .. v27}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 313
    move-result-object v14

    .line 314
    .line 315
    if-eqz v14, :cond_c

    .line 316
    goto :goto_8

    .line 317
    :cond_c
    move-object v14, v12

    .line 318
    .line 319
    .line 320
    :goto_8
    invoke-virtual {v4, v13, v14}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 321
    move-result-object v4

    .line 322
    .line 323
    if-eqz v4, :cond_12

    .line 324
    .line 325
    iget-object v14, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 326
    .line 327
    .line 328
    invoke-static {v14, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 329
    .line 330
    if-eqz v2, :cond_d

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AssetCoinEntity;->getChangeRate()Ljava/lang/Double;

    .line 334
    move-result-object v15

    .line 335
    goto :goto_9

    .line 336
    :cond_d
    move-object v15, v6

    .line 337
    .line 338
    .line 339
    :goto_9
    invoke-static {v15}, Lcom/kubi/utils/extensions/d;->f(Ljava/lang/Double;)D

    .line 340
    move-result-wide v20

    .line 341
    .line 342
    const/16 v23, 0x2

    .line 343
    .line 344
    const/16 v24, 0x0

    .line 345
    .line 346
    const/16 v22, 0x0

    .line 347
    .line 348
    move-object/from16 v19, v14

    .line 349
    .line 350
    .line 351
    invoke-static/range {v19 .. v24}, Lcom/kubi/resources/g;->d(Landroid/content/Context;DIILjava/lang/Object;)I

    .line 352
    move-result v14

    .line 353
    .line 354
    .line 355
    invoke-virtual {v4, v13, v14}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 356
    move-result-object v4

    .line 357
    .line 358
    if-eqz v4, :cond_12

    .line 359
    .line 360
    .line 361
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 362
    move-result v14

    .line 363
    .line 364
    if-lez v14, :cond_e

    .line 365
    const/4 v14, 0x1

    .line 366
    goto :goto_a

    .line 367
    :cond_e
    move v14, v5

    .line 368
    .line 369
    .line 370
    :goto_a
    invoke-virtual {v4, v10, v14}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 371
    move-result-object v4

    .line 372
    .line 373
    if-eqz v4, :cond_12

    .line 374
    .line 375
    .line 376
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 377
    move-result v10

    .line 378
    .line 379
    if-lez v10, :cond_f

    .line 380
    const/4 v10, 0x1

    .line 381
    goto :goto_b

    .line 382
    :cond_f
    move v10, v5

    .line 383
    .line 384
    .line 385
    :goto_b
    invoke-virtual {v4, v13, v10}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 386
    move-result-object v4

    .line 387
    .line 388
    if-eqz v4, :cond_12

    .line 389
    .line 390
    sget v10, Lcom/kubi/assets/R$id;->tv_current_price_name:I

    .line 391
    .line 392
    .line 393
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 394
    move-result v9

    .line 395
    .line 396
    if-lez v9, :cond_10

    .line 397
    const/4 v9, 0x1

    .line 398
    goto :goto_c

    .line 399
    :cond_10
    move v9, v5

    .line 400
    .line 401
    .line 402
    :goto_c
    invoke-virtual {v4, v10, v9}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 403
    goto :goto_d

    .line 404
    .line 405
    :cond_11
    move-object/from16 v18, v10

    .line 406
    .line 407
    :cond_12
    :goto_d
    if-eqz v2, :cond_13

    .line 408
    .line 409
    .line 410
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AssetCoinEntity;->getTokenAddress()Ljava/lang/String;

    .line 411
    move-result-object v4

    .line 412
    goto :goto_e

    .line 413
    :cond_13
    move-object v4, v6

    .line 414
    .line 415
    :goto_e
    const-string v9, "getView(...)"

    .line 416
    .line 417
    if-eqz v4, :cond_20

    .line 418
    .line 419
    .line 420
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 421
    move-result v4

    .line 422
    .line 423
    if-nez v4, :cond_14

    .line 424
    .line 425
    goto/16 :goto_16

    .line 426
    .line 427
    :cond_14
    if-eqz v2, :cond_15

    .line 428
    .line 429
    .line 430
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AssetCoinEntity;->getCode()Ljava/lang/String;

    .line 431
    move-result-object v4

    .line 432
    goto :goto_f

    .line 433
    :cond_15
    move-object v4, v6

    .line 434
    .line 435
    .line 436
    :goto_f
    invoke-static {v4}, Lcom/kubi/utils/extensions/DowngradeExKt;->q(Ljava/lang/String;)Ljava/lang/Long;

    .line 437
    move-result-object v4

    .line 438
    .line 439
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v8, v4, v10}, Lgf/n;->s(Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;

    .line 443
    move-result-object v4

    .line 444
    .line 445
    iget-object v8, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 446
    .line 447
    if-eqz v2, :cond_16

    .line 448
    .line 449
    .line 450
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AssetCoinEntity;->getIconUrl()Ljava/lang/String;

    .line 451
    move-result-object v10

    .line 452
    goto :goto_10

    .line 453
    :cond_16
    move-object v10, v6

    .line 454
    .line 455
    :goto_10
    if-nez v10, :cond_17

    .line 456
    .line 457
    move-object/from16 v10, v18

    .line 458
    .line 459
    .line 460
    :cond_17
    invoke-static {v8, v10, v3}, Lcom/kubi/sdk/util/v;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 461
    .line 462
    iget-object v3, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 463
    .line 464
    if-eqz v2, :cond_18

    .line 465
    .line 466
    .line 467
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AssetCoinEntity;->getChainIconUrl()Ljava/lang/String;

    .line 468
    move-result-object v8

    .line 469
    goto :goto_11

    .line 470
    :cond_18
    move-object v8, v6

    .line 471
    .line 472
    .line 473
    :goto_11
    invoke-static {v8}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 474
    move-result-object v8

    .line 475
    .line 476
    .line 477
    invoke-static {v3, v8, v7}, Lcom/kubi/sdk/util/v;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 478
    .line 479
    if-eqz v7, :cond_19

    .line 480
    .line 481
    iget-object v3, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 482
    .line 483
    .line 484
    invoke-static {v3, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 485
    .line 486
    sget v8, Lcom/kubi/assets/R$color;->c_overlay:I

    .line 487
    .line 488
    .line 489
    invoke-static {v3, v8}, Lcom/kubi/utils/extensions/k;->n(Landroid/content/Context;I)I

    .line 490
    move-result v3

    .line 491
    .line 492
    .line 493
    invoke-virtual {v7, v3}, Lcom/kubi/resources/widget/CoinAvatarView;->setStrokeColor(I)V

    .line 494
    .line 495
    :cond_19
    if-eqz v7, :cond_1a

    .line 496
    .line 497
    .line 498
    invoke-static {v7}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 499
    .line 500
    :cond_1a
    if-eqz v1, :cond_1f

    .line 501
    .line 502
    sget v3, Lcom/kubi/assets/R$id;->tv_amount:I

    .line 503
    .line 504
    if-eqz v2, :cond_1c

    .line 505
    .line 506
    .line 507
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AssetCoinEntity;->getTotalAmount()Ljava/lang/String;

    .line 508
    move-result-object v7

    .line 509
    .line 510
    if-eqz v7, :cond_1c

    .line 511
    const/4 v8, 0x1

    .line 512
    .line 513
    .line 514
    invoke-static {v7, v6, v8, v6}, Lcom/kubi/utils/extensions/DowngradeExKt;->e(Ljava/lang/String;Ljava/math/BigDecimal;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 515
    move-result-object v7

    .line 516
    .line 517
    if-eqz v7, :cond_1c

    .line 518
    .line 519
    if-eqz v4, :cond_1b

    .line 520
    .line 521
    .line 522
    invoke-virtual {v4}, Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;->getTokenDecimal()Ljava/lang/Integer;

    .line 523
    move-result-object v4

    .line 524
    goto :goto_12

    .line 525
    :cond_1b
    move-object v4, v6

    .line 526
    .line 527
    :goto_12
    const/16 v8, 0x8

    .line 528
    .line 529
    .line 530
    invoke-static {v4, v8}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 531
    move-result v4

    .line 532
    .line 533
    .line 534
    invoke-static {v7, v6, v4}, Lgf/i;->a(Ljava/math/BigDecimal;Ljava/lang/String;I)Ljava/lang/String;

    .line 535
    move-result-object v4

    .line 536
    goto :goto_13

    .line 537
    :cond_1c
    move-object v4, v6

    .line 538
    .line 539
    .line 540
    :goto_13
    invoke-static {v4, v12}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 541
    move-result-object v4

    .line 542
    .line 543
    .line 544
    invoke-virtual {v1, v3, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 545
    move-result-object v3

    .line 546
    .line 547
    if-eqz v3, :cond_1f

    .line 548
    .line 549
    sget v4, Lcom/kubi/assets/R$id;->tvTokenContract:I

    .line 550
    .line 551
    if-eqz v2, :cond_1d

    .line 552
    .line 553
    .line 554
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AssetCoinEntity;->getTokenAddress()Ljava/lang/String;

    .line 555
    move-result-object v7

    .line 556
    goto :goto_14

    .line 557
    :cond_1d
    move-object v7, v6

    .line 558
    .line 559
    .line 560
    :goto_14
    invoke-static {v7, v12}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 561
    move-result-object v7

    .line 562
    .line 563
    .line 564
    invoke-direct {v0, v7}, Lcom/kubi/assets/overview/coin/AssetCoinAdapter;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 565
    move-result-object v7

    .line 566
    .line 567
    .line 568
    invoke-virtual {v3, v4, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 569
    move-result-object v3

    .line 570
    .line 571
    if-eqz v3, :cond_1f

    .line 572
    .line 573
    sget v7, Lcom/kubi/assets/R$id;->tv_price:I

    .line 574
    .line 575
    if-eqz v2, :cond_1e

    .line 576
    .line 577
    .line 578
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AssetCoinEntity;->getTotalAmountBaseUSDT()Ljava/math/BigDecimal;

    .line 579
    move-result-object v8

    .line 580
    .line 581
    if-eqz v8, :cond_1e

    .line 582
    .line 583
    const-string v10, "USDT"

    .line 584
    .line 585
    .line 586
    invoke-static {v8, v10}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 587
    move-result-wide v10

    .line 588
    .line 589
    new-instance v8, Ljava/math/BigDecimal;

    .line 590
    .line 591
    .line 592
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 593
    move-result-object v10

    .line 594
    .line 595
    .line 596
    invoke-direct {v8, v10}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 597
    .line 598
    const/16 v25, 0x1f

    .line 599
    .line 600
    const/16 v26, 0x0

    .line 601
    .line 602
    const/16 v19, 0x0

    .line 603
    .line 604
    const/16 v20, 0x0

    .line 605
    .line 606
    const/16 v21, 0x0

    .line 607
    .line 608
    const/16 v22, 0x0

    .line 609
    .line 610
    const/16 v23, 0x0

    .line 611
    .line 612
    const/16 v24, 0x1

    .line 613
    .line 614
    move-object/from16 v18, v8

    .line 615
    .line 616
    .line 617
    invoke-static/range {v18 .. v26}, Lkf/a;->g(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 618
    move-result-object v8

    .line 619
    goto :goto_15

    .line 620
    :cond_1e
    move-object v8, v6

    .line 621
    .line 622
    .line 623
    :goto_15
    invoke-static {v8, v12}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 624
    move-result-object v8

    .line 625
    .line 626
    .line 627
    invoke-virtual {v3, v7, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 628
    move-result-object v3

    .line 629
    .line 630
    if-eqz v3, :cond_1f

    .line 631
    .line 632
    sget v7, Lcom/kubi/assets/R$id;->ivCopy:I

    .line 633
    const/4 v8, 0x1

    .line 634
    .line 635
    .line 636
    invoke-virtual {v3, v7, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 637
    move-result-object v3

    .line 638
    .line 639
    if-eqz v3, :cond_1f

    .line 640
    .line 641
    .line 642
    invoke-virtual {v3, v4, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 643
    move-result-object v3

    .line 644
    .line 645
    if-eqz v3, :cond_1f

    .line 646
    .line 647
    sget v4, Lcom/kubi/assets/R$id;->tv_percentage:I

    .line 648
    .line 649
    .line 650
    invoke-virtual {v3, v4, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 651
    .line 652
    :cond_1f
    if-eqz v1, :cond_29

    .line 653
    .line 654
    sget v3, Lcom/kubi/assets/R$id;->ivCopy:I

    .line 655
    .line 656
    .line 657
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 658
    move-result-object v3

    .line 659
    .line 660
    .line 661
    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 662
    .line 663
    sget v4, Lcom/kubi/assets/R$id;->tvTokenContract:I

    .line 664
    .line 665
    .line 666
    invoke-virtual {v1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 667
    move-result-object v4

    .line 668
    .line 669
    .line 670
    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 671
    .line 672
    .line 673
    filled-new-array {v3, v4}, [Landroid/view/View;

    .line 674
    move-result-object v3

    .line 675
    .line 676
    new-instance v4, Lcom/kubi/assets/overview/coin/d;

    .line 677
    .line 678
    .line 679
    invoke-direct {v4, v2, v0}, Lcom/kubi/assets/overview/coin/d;-><init>(Lcom/kubi/assets/entity/AssetCoinEntity;Lcom/kubi/assets/overview/coin/AssetCoinAdapter;)V

    .line 680
    .line 681
    .line 682
    invoke-static {v3, v4}, Lcom/kubi/utils/extensions/k;->D([Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 683
    .line 684
    goto/16 :goto_1e

    .line 685
    .line 686
    :cond_20
    :goto_16
    if-eqz v2, :cond_21

    .line 687
    .line 688
    .line 689
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AssetCoinEntity;->getCode()Ljava/lang/String;

    .line 690
    move-result-object v4

    .line 691
    goto :goto_17

    .line 692
    :cond_21
    move-object v4, v6

    .line 693
    .line 694
    :goto_17
    if-nez v4, :cond_22

    .line 695
    .line 696
    move-object/from16 v10, v18

    .line 697
    goto :goto_18

    .line 698
    :cond_22
    move-object v10, v4

    .line 699
    .line 700
    .line 701
    :goto_18
    invoke-virtual {v8, v10}, Lgf/n;->u(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 702
    move-result-object v4

    .line 703
    .line 704
    if-eqz v4, :cond_23

    .line 705
    .line 706
    .line 707
    invoke-virtual {v4}, Lcom/kubi/data/entity/CoinInfoEntity;->getIconUrl()Ljava/lang/String;

    .line 708
    move-result-object v4

    .line 709
    goto :goto_19

    .line 710
    :cond_23
    move-object v4, v6

    .line 711
    .line 712
    :goto_19
    iget-object v8, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 713
    .line 714
    .line 715
    invoke-static {v8, v4, v3}, Lcom/kubi/sdk/util/v;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 716
    .line 717
    if-eqz v7, :cond_24

    .line 718
    .line 719
    .line 720
    invoke-static {v7}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 721
    .line 722
    :cond_24
    if-eqz v1, :cond_28

    .line 723
    .line 724
    sget v3, Lcom/kubi/assets/R$id;->tv_percentage:I

    .line 725
    .line 726
    if-eqz v2, :cond_25

    .line 727
    .line 728
    .line 729
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AssetCoinEntity;->getProportion()Ljava/lang/String;

    .line 730
    move-result-object v4

    .line 731
    move-object v10, v4

    .line 732
    goto :goto_1a

    .line 733
    :cond_25
    move-object v10, v6

    .line 734
    .line 735
    :goto_1a
    sget-object v11, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 736
    const/4 v14, 0x6

    .line 737
    const/4 v15, 0x0

    .line 738
    const/4 v12, 0x0

    .line 739
    const/4 v13, 0x0

    .line 740
    .line 741
    .line 742
    invoke-static/range {v10 .. v15}, Lcom/kubi/assets/AssetExKt;->h(Ljava/lang/String;Ljava/math/RoundingMode;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 743
    move-result-object v4

    .line 744
    .line 745
    .line 746
    invoke-virtual {v1, v3, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 747
    move-result-object v4

    .line 748
    .line 749
    if-eqz v4, :cond_28

    .line 750
    .line 751
    sget v7, Lcom/kubi/assets/R$id;->tv_price:I

    .line 752
    .line 753
    if-eqz v2, :cond_26

    .line 754
    .line 755
    .line 756
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AssetCoinEntity;->getTotalAmount()Ljava/lang/String;

    .line 757
    move-result-object v8

    .line 758
    :goto_1b
    const/4 v10, 0x1

    .line 759
    goto :goto_1c

    .line 760
    :cond_26
    move-object v8, v6

    .line 761
    goto :goto_1b

    .line 762
    .line 763
    .line 764
    :goto_1c
    invoke-static {v8, v6, v10, v6}, Lcom/kubi/utils/extensions/DowngradeExKt;->e(Ljava/lang/String;Ljava/math/BigDecimal;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 765
    move-result-object v8

    .line 766
    .line 767
    if-eqz v2, :cond_27

    .line 768
    .line 769
    .line 770
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AssetCoinEntity;->getCode()Ljava/lang/String;

    .line 771
    move-result-object v10

    .line 772
    goto :goto_1d

    .line 773
    :cond_27
    move-object v10, v6

    .line 774
    .line 775
    .line 776
    :goto_1d
    invoke-static {v8, v10}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 777
    move-result-wide v18

    .line 778
    .line 779
    const/16 v27, 0x3f

    .line 780
    .line 781
    const/16 v28, 0x0

    .line 782
    .line 783
    const/16 v20, 0x0

    .line 784
    .line 785
    const/16 v21, 0x0

    .line 786
    .line 787
    const/16 v22, 0x0

    .line 788
    .line 789
    const/16 v23, 0x0

    .line 790
    .line 791
    const/16 v24, 0x0

    .line 792
    .line 793
    const/16 v25, 0x0

    .line 794
    .line 795
    const/16 v26, 0x1

    .line 796
    .line 797
    .line 798
    invoke-static/range {v18 .. v28}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 799
    move-result-object v8

    .line 800
    .line 801
    .line 802
    invoke-virtual {v4, v7, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 803
    move-result-object v4

    .line 804
    .line 805
    if-eqz v4, :cond_28

    .line 806
    .line 807
    sget v7, Lcom/kubi/assets/R$id;->ivCopy:I

    .line 808
    .line 809
    .line 810
    invoke-virtual {v4, v7, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 811
    move-result-object v4

    .line 812
    .line 813
    if-eqz v4, :cond_28

    .line 814
    .line 815
    sget v7, Lcom/kubi/assets/R$id;->tvTokenContract:I

    .line 816
    .line 817
    .line 818
    invoke-virtual {v4, v7, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 819
    move-result-object v4

    .line 820
    .line 821
    if-eqz v4, :cond_28

    .line 822
    const/4 v8, 0x1

    .line 823
    .line 824
    .line 825
    invoke-virtual {v4, v3, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 826
    .line 827
    :cond_28
    if-eqz v1, :cond_29

    .line 828
    .line 829
    sget v3, Lcom/kubi/assets/R$id;->ivCopy:I

    .line 830
    .line 831
    .line 832
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 833
    move-result-object v3

    .line 834
    .line 835
    .line 836
    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 837
    .line 838
    sget v4, Lcom/kubi/assets/R$id;->tvTokenContract:I

    .line 839
    .line 840
    .line 841
    invoke-virtual {v1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 842
    move-result-object v4

    .line 843
    .line 844
    .line 845
    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 846
    .line 847
    .line 848
    filled-new-array {v3, v4}, [Landroid/view/View;

    .line 849
    move-result-object v3

    .line 850
    .line 851
    new-instance v4, Lcom/kubi/assets/overview/coin/c;

    .line 852
    .line 853
    .line 854
    invoke-direct {v4}, Lcom/kubi/assets/overview/coin/c;-><init>()V

    .line 855
    .line 856
    .line 857
    invoke-static {v3, v4}, Lcom/kubi/utils/extensions/k;->D([Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 858
    .line 859
    :cond_29
    :goto_1e
    if-eqz v1, :cond_2a

    .line 860
    .line 861
    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 862
    goto :goto_1f

    .line 863
    :cond_2a
    move-object v3, v6

    .line 864
    .line 865
    :goto_1f
    iget-boolean v4, v0, Lcom/kubi/assets/overview/coin/AssetCoinAdapter;->i:Z

    .line 866
    .line 867
    .line 868
    invoke-static {v3, v4}, Lcom/kubi/resources/widget/ShowHideTextView;->d(Landroid/view/View;Z)V

    .line 869
    .line 870
    if-eqz v1, :cond_2c

    .line 871
    .line 872
    sget v3, Lcom/kubi/assets/R$id;->delistedTip:I

    .line 873
    .line 874
    .line 875
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 876
    move-result-object v3

    .line 877
    .line 878
    check-cast v3, Landroid/widget/LinearLayout;

    .line 879
    .line 880
    if-eqz v3, :cond_2c

    .line 881
    .line 882
    if-eqz v2, :cond_2b

    .line 883
    .line 884
    .line 885
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AssetCoinEntity;->getDelisted()Ljava/lang/Boolean;

    .line 886
    move-result-object v4

    .line 887
    .line 888
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 889
    .line 890
    .line 891
    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 892
    move-result v4

    .line 893
    goto :goto_20

    .line 894
    :cond_2b
    move v4, v5

    .line 895
    .line 896
    .line 897
    :goto_20
    invoke-static {v3, v4}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 898
    .line 899
    sget v3, Lcom/kubi/assets/R$id;->delistedTipText:I

    .line 900
    .line 901
    .line 902
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 903
    move-result-object v3

    .line 904
    .line 905
    check-cast v3, Landroid/widget/TextView;

    .line 906
    .line 907
    .line 908
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 909
    move-result-object v4

    .line 910
    .line 911
    .line 912
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 913
    .line 914
    sget-object v4, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 915
    .line 916
    .line 917
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 918
    .line 919
    new-instance v7, Lkotlin/Pair;

    .line 920
    .line 921
    sget-object v8, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 922
    .line 923
    new-instance v9, Lcom/kubi/resources/f;

    .line 924
    .line 925
    new-instance v10, Lcom/kubi/assets/overview/coin/e;

    .line 926
    .line 927
    .line 928
    invoke-direct {v10, v3}, Lcom/kubi/assets/overview/coin/e;-><init>(Landroid/widget/TextView;)V

    .line 929
    .line 930
    new-instance v11, Lcom/kubi/assets/overview/coin/f;

    .line 931
    .line 932
    .line 933
    invoke-direct {v11, v2}, Lcom/kubi/assets/overview/coin/f;-><init>(Lcom/kubi/assets/entity/AssetCoinEntity;)V

    .line 934
    .line 935
    .line 936
    invoke-direct {v9, v10, v11}, Lcom/kubi/resources/f;-><init>(Lkotlin/jvm/functions/Function1;Landroid/view/View$OnClickListener;)V

    .line 937
    .line 938
    .line 939
    invoke-direct {v7, v8, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 940
    .line 941
    .line 942
    filled-new-array {v7}, [Lkotlin/Pair;

    .line 943
    move-result-object v7

    .line 944
    .line 945
    .line 946
    invoke-virtual {v4, v3, v7}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 947
    .line 948
    :cond_2c
    if-eqz v2, :cond_2d

    .line 949
    .line 950
    .line 951
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AssetCoinEntity;->getDelisted()Ljava/lang/Boolean;

    .line 952
    move-result-object v3

    .line 953
    .line 954
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 955
    .line 956
    .line 957
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 958
    move-result v3

    .line 959
    goto :goto_21

    .line 960
    :cond_2d
    move v3, v5

    .line 961
    .line 962
    :goto_21
    if-eqz v3, :cond_32

    .line 963
    .line 964
    if-eqz v1, :cond_2e

    .line 965
    .line 966
    sget v3, Lcom/kubi/assets/R$id;->tv_current_price:I

    .line 967
    .line 968
    .line 969
    invoke-virtual {v1, v3, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 970
    .line 971
    :cond_2e
    if-eqz v1, :cond_2f

    .line 972
    .line 973
    sget v3, Lcom/kubi/assets/R$id;->tv_rate:I

    .line 974
    .line 975
    .line 976
    invoke-virtual {v1, v3, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 977
    .line 978
    :cond_2f
    if-eqz v1, :cond_30

    .line 979
    .line 980
    sget v3, Lcom/kubi/assets/R$id;->tv_current_price_name:I

    .line 981
    .line 982
    .line 983
    invoke-virtual {v1, v3, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 984
    .line 985
    :cond_30
    if-eqz v1, :cond_32

    .line 986
    .line 987
    sget v3, Lcom/kubi/assets/R$id;->tv_price:I

    .line 988
    .line 989
    sget-object v4, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 990
    .line 991
    const-string v5, "ZERO"

    .line 992
    .line 993
    .line 994
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 995
    .line 996
    if-eqz v2, :cond_31

    .line 997
    .line 998
    .line 999
    invoke-virtual {v2}, Lcom/kubi/assets/entity/AssetCoinEntity;->getCode()Ljava/lang/String;

    .line 1000
    move-result-object v6

    .line 1001
    .line 1002
    .line 1003
    :cond_31
    invoke-static {v4, v6}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 1004
    move-result-wide v7

    .line 1005
    .line 1006
    const/16 v16, 0x3f

    .line 1007
    .line 1008
    const/16 v17, 0x0

    .line 1009
    const/4 v9, 0x0

    .line 1010
    const/4 v10, 0x0

    .line 1011
    const/4 v11, 0x0

    .line 1012
    const/4 v12, 0x0

    .line 1013
    const/4 v13, 0x0

    .line 1014
    const/4 v14, 0x0

    .line 1015
    const/4 v15, 0x1

    .line 1016
    .line 1017
    .line 1018
    invoke-static/range {v7 .. v17}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 1019
    move-result-object v2

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v1, v3, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 1023
    :cond_32
    return-void
.end method

.method public final t(Ljava/lang/Double;Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    .line 1
    .line 2
    const-string v0, ""

    .line 3
    .line 4
    if-eqz p1, :cond_3

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Double;->toString()Ljava/lang/String;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/text/StringsKt;->toBigDecimalOrNull(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    return-object v0

    .line 16
    .line 17
    :cond_0
    if-eqz p2, :cond_2

    .line 18
    .line 19
    .line 20
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 21
    move-result p1

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    goto :goto_1

    .line 25
    .line 26
    :cond_1
    sget-object p1, Lcom/kubi/data/q;->a:Lcom/kubi/data/q;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/kubi/data/q;->b()Lcom/kubi/data/t;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2}, Lcom/kubi/data/t;->a(Ljava/lang/String;)Ljava/lang/Integer;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    const/16 p2, 0x8

    .line 37
    .line 38
    .line 39
    invoke-static {p1, p2}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 40
    move-result p1

    .line 41
    :goto_0
    move v3, p1

    .line 42
    goto :goto_2

    .line 43
    .line 44
    .line 45
    :cond_2
    :goto_1
    invoke-virtual {v1}, Ljava/math/BigDecimal;->scale()I

    .line 46
    move-result p1

    .line 47
    goto :goto_0

    .line 48
    .line 49
    :goto_2
    const/16 v11, 0x1d9

    .line 50
    const/4 v12, 0x0

    .line 51
    const/4 v2, 0x0

    .line 52
    const/4 v4, 0x1

    .line 53
    const/4 v5, 0x0

    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v7, 0x0

    .line 56
    const/4 v8, 0x0

    .line 57
    const/4 v9, 0x0

    .line 58
    const/4 v10, 0x0

    .line 59
    .line 60
    .line 61
    invoke-static/range {v1 .. v12}, Lkf/a;->t(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 62
    move-result-object p1

    .line 63
    return-object p1

    .line 64
    :cond_3
    return-object v0
    .line 65
.end method

.method public final u(Lcom/kubi/assets/entity/AssetCoinEntity;)Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/kubi/assets/entity/AssetCoinEntity;->getCode()Ljava/lang/String;

    .line 12
    move-result-object v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v2, v1

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const/16 v2, 0x2d

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/kubi/assets/entity/AssetCoinEntity;->getQuote()Ljava/lang/String;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    move-result-object p1

    .line 36
    return-object p1
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public final v(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/assets/overview/coin/AssetCoinAdapter;->i:Z

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
.end method

.method public final w(Lcom/kubi/data/entity/WsMarketSnapshotEntity;)V
    .locals 1
    .param p1    # Lcom/kubi/data/entity/WsMarketSnapshotEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "entity"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/kubi/assets/overview/coin/a;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p0, p1}, Lcom/kubi/assets/overview/coin/a;-><init>(Lcom/kubi/assets/overview/coin/AssetCoinAdapter;Lcom/kubi/data/entity/WsMarketSnapshotEntity;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/kubi/utils/x0;->e(Lkotlin/jvm/functions/Function0;)V

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
