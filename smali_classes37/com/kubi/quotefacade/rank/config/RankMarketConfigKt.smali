.class public final Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt;
.super Ljava/lang/Object;
.source "RankMarketConfig.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\t\u001a\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0002\u0010\r\u001a\u000e\u0010\u000e\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0002\u0010\u000f\u001a\u0014\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@\u00a2\u0006\u0002\u0010\u000f\u001a\u001e\u0010\u0011\u001a\u00020\u000b2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003H\u0086@\u00a2\u0006\u0002\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "defaultMarketType",
        "",
        "defaultMarketConfig",
        "",
        "marketSeparator",
        "curMarketConfig",
        "Lcom/kubi/sdk/widget/dialog/SelectEntity;",
        "chooseMarketEntity",
        "Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$SelectItem;",
        "chooseMarketValue",
        "updateCurMarket",
        "",
        "selectItem",
        "(Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$SelectItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getCurMarketEntity",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getRankMarketConfig",
        "updateMarketConfig",
        "marketList",
        "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "QuoteFacadeLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRankMarketConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankMarketConfig.kt\ncom/kubi/quotefacade/rank/config/RankMarketConfigKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n295#2,2:112\n1869#2,2:114\n*S KotlinDebug\n*F\n+ 1 RankMarketConfig.kt\ncom/kubi/quotefacade/rank/config/RankMarketConfigKt\n*L\n54#1:112,2\n83#1:114,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/sdk/widget/dialog/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static c:Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public static d:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const-string v0, "ALL"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt;->a:Ljava/util/List;

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sput-object v0, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt;->b:Ljava/util/List;

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
.end method

.method public static final synthetic a()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt;->d:Ljava/lang/String;

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
.end method

.method public static final synthetic b(Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$a;)V
    .locals 0

    .line 1
    .line 2
    sput-object p0, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt;->c:Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$a;

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
.end method

.method public static final c(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 23
    .param p0    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    instance-of v1, v0, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    move-object v1, v0

    .line 8
    .line 9
    check-cast v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;

    .line 10
    .line 11
    iget v2, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;->label:I

    .line 12
    .line 13
    const/high16 v3, -0x80000000

    .line 14
    .line 15
    and-int v4, v2, v3

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    sub-int/2addr v2, v3

    .line 19
    .line 20
    iput v2, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;->label:I

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :cond_0
    new-instance v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v0}, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    :goto_0
    iget-object v0, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    iget v3, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;->label:I

    .line 35
    const/4 v4, 0x3

    .line 36
    const/4 v5, 0x2

    .line 37
    const/4 v6, 0x1

    .line 38
    const/4 v7, 0x0

    .line 39
    .line 40
    if-eqz v3, :cond_4

    .line 41
    .line 42
    if-eq v3, v6, :cond_3

    .line 43
    .line 44
    if-eq v3, v5, :cond_2

    .line 45
    .line 46
    if-ne v3, v4, :cond_1

    .line 47
    .line 48
    iget-object v2, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;->L$2:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Lcom/kubi/sdk/widget/dialog/a;

    .line 51
    .line 52
    iget-object v2, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;->L$1:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, Ljava/lang/String;

    .line 55
    .line 56
    iget-object v1, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Lcom/kubi/sdk/widget/dialog/a;

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 62
    return-object v0

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
    :cond_2
    iget-object v3, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;->L$1:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v3, Ljava/lang/String;

    .line 75
    .line 76
    iget-object v5, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;->L$0:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v5, Lcom/kubi/sdk/widget/dialog/a;

    .line 79
    .line 80
    .line 81
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 82
    .line 83
    goto/16 :goto_2

    .line 84
    .line 85
    :cond_3
    iget-object v3, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;->L$0:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v3, Lcom/kubi/sdk/widget/dialog/a;

    .line 88
    .line 89
    .line 90
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 91
    goto :goto_1

    .line 92
    .line 93
    .line 94
    :cond_4
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 95
    .line 96
    sget-object v0, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt;->c:Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$a;

    .line 97
    .line 98
    if-eqz v0, :cond_5

    .line 99
    return-object v0

    .line 100
    .line 101
    :cond_5
    new-instance v8, Lcom/kubi/sdk/widget/dialog/a;

    .line 102
    .line 103
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 104
    .line 105
    sget v3, Lcom/kubi/quotefacade/R$string;->all_market:I

    .line 106
    const/4 v9, 0x0

    .line 107
    .line 108
    new-array v9, v9, [Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v3, v9}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 112
    move-result-object v10

    .line 113
    .line 114
    const/16 v21, 0xff9

    .line 115
    .line 116
    const/16 v22, 0x0

    .line 117
    const/4 v9, 0x0

    .line 118
    .line 119
    const-string v11, "ALL"

    .line 120
    const/4 v12, 0x0

    .line 121
    const/4 v13, 0x0

    .line 122
    const/4 v14, 0x0

    .line 123
    const/4 v15, 0x0

    .line 124
    .line 125
    const/16 v16, 0x0

    .line 126
    .line 127
    const/16 v17, 0x0

    .line 128
    .line 129
    const/16 v18, 0x0

    .line 130
    .line 131
    const/16 v19, 0x0

    .line 132
    .line 133
    const/16 v20, 0x0

    .line 134
    .line 135
    .line 136
    invoke-direct/range {v8 .. v22}, Lcom/kubi/sdk/widget/dialog/a;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;Ljava/lang/Integer;Ljava/lang/String;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 137
    .line 138
    sget-object v0, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt;->d:Ljava/lang/String;

    .line 139
    .line 140
    if-nez v0, :cond_7

    .line 141
    .line 142
    .line 143
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 144
    move-result-object v0

    .line 145
    .line 146
    new-instance v3, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$preChoose$1;

    .line 147
    .line 148
    .line 149
    invoke-direct {v3, v7}, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$preChoose$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 150
    .line 151
    iput-object v8, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;->L$0:Ljava/lang/Object;

    .line 152
    .line 153
    iput v6, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;->label:I

    .line 154
    .line 155
    .line 156
    invoke-static {v0, v3, v1}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 157
    move-result-object v0

    .line 158
    .line 159
    if-ne v0, v2, :cond_6

    .line 160
    .line 161
    goto/16 :goto_6

    .line 162
    :cond_6
    move-object v3, v8

    .line 163
    .line 164
    :goto_1
    check-cast v0, Ljava/lang/String;

    .line 165
    move-object v8, v3

    .line 166
    :cond_7
    move-object v3, v0

    .line 167
    .line 168
    if-eqz v3, :cond_c

    .line 169
    .line 170
    .line 171
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 172
    move-result v0

    .line 173
    .line 174
    if-nez v0, :cond_8

    .line 175
    goto :goto_4

    .line 176
    .line 177
    :cond_8
    iput-object v8, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;->L$0:Ljava/lang/Object;

    .line 178
    .line 179
    iput-object v3, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;->L$1:Ljava/lang/Object;

    .line 180
    .line 181
    iput v5, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;->label:I

    .line 182
    .line 183
    .line 184
    invoke-static {v1}, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt;->d(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 185
    move-result-object v0

    .line 186
    .line 187
    if-ne v0, v2, :cond_9

    .line 188
    goto :goto_6

    .line 189
    :cond_9
    move-object v5, v8

    .line 190
    .line 191
    :goto_2
    check-cast v0, Ljava/lang/Iterable;

    .line 192
    .line 193
    .line 194
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 195
    move-result-object v0

    .line 196
    .line 197
    .line 198
    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    move-result v6

    .line 200
    .line 201
    if-eqz v6, :cond_b

    .line 202
    .line 203
    .line 204
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    move-result-object v6

    .line 206
    move-object v8, v6

    .line 207
    .line 208
    check-cast v8, Lcom/kubi/sdk/widget/dialog/a;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v8}, Lcom/kubi/sdk/widget/dialog/a;->getValue()Ljava/lang/String;

    .line 212
    move-result-object v8

    .line 213
    .line 214
    .line 215
    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    move-result v8

    .line 217
    .line 218
    if-eqz v8, :cond_a

    .line 219
    goto :goto_3

    .line 220
    :cond_b
    move-object v6, v7

    .line 221
    .line 222
    :goto_3
    check-cast v6, Lcom/kubi/sdk/widget/dialog/a;

    .line 223
    move-object v8, v5

    .line 224
    goto :goto_5

    .line 225
    :cond_c
    :goto_4
    move-object v6, v7

    .line 226
    .line 227
    .line 228
    :goto_5
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 229
    move-result-object v0

    .line 230
    .line 231
    new-instance v5, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$3;

    .line 232
    .line 233
    .line 234
    invoke-direct {v5, v6, v8, v7}, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$3;-><init>(Lcom/kubi/sdk/widget/dialog/a;Lcom/kubi/sdk/widget/dialog/a;Lkotlin/coroutines/Continuation;)V

    .line 235
    .line 236
    .line 237
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    move-result-object v7

    .line 239
    .line 240
    iput-object v7, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;->L$0:Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    move-result-object v3

    .line 245
    .line 246
    iput-object v3, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;->L$1:Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    move-result-object v3

    .line 251
    .line 252
    iput-object v3, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;->L$2:Ljava/lang/Object;

    .line 253
    .line 254
    iput v4, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getCurMarketEntity$1;->label:I

    .line 255
    .line 256
    .line 257
    invoke-static {v0, v5, v1}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 258
    move-result-object v0

    .line 259
    .line 260
    if-ne v0, v2, :cond_d

    .line 261
    :goto_6
    return-object v2

    .line 262
    :cond_d
    return-object v0
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
.end method

.method public static final d(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 22
    .param p0    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/kubi/sdk/widget/dialog/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    instance-of v1, v0, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getRankMarketConfig$1;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    move-object v1, v0

    .line 8
    .line 9
    check-cast v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getRankMarketConfig$1;

    .line 10
    .line 11
    iget v2, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getRankMarketConfig$1;->label:I

    .line 12
    .line 13
    const/high16 v3, -0x80000000

    .line 14
    .line 15
    and-int v4, v2, v3

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    sub-int/2addr v2, v3

    .line 19
    .line 20
    iput v2, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getRankMarketConfig$1;->label:I

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :cond_0
    new-instance v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getRankMarketConfig$1;

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v0}, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getRankMarketConfig$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    :goto_0
    iget-object v0, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getRankMarketConfig$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    iget v3, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getRankMarketConfig$1;->label:I

    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x2

    .line 37
    const/4 v6, 0x1

    .line 38
    .line 39
    if-eqz v3, :cond_3

    .line 40
    .line 41
    if-eq v3, v6, :cond_2

    .line 42
    .line 43
    if-ne v3, v5, :cond_1

    .line 44
    .line 45
    iget-object v2, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getRankMarketConfig$1;->L$1:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, Ljava/util/List;

    .line 48
    .line 49
    iget-object v1, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getRankMarketConfig$1;->L$0:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    goto :goto_3

    .line 56
    .line 57
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    .line 62
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    throw v0

    .line 64
    .line 65
    .line 66
    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 67
    goto :goto_1

    .line 68
    .line 69
    .line 70
    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 71
    .line 72
    sget-object v0, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt;->b:Ljava/util/List;

    .line 73
    .line 74
    .line 75
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 76
    move-result v0

    .line 77
    .line 78
    if-nez v0, :cond_4

    .line 79
    .line 80
    sget-object v0, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt;->b:Ljava/util/List;

    .line 81
    return-object v0

    .line 82
    .line 83
    :cond_4
    sget-object v0, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt;->d:Ljava/lang/String;

    .line 84
    .line 85
    if-nez v0, :cond_6

    .line 86
    .line 87
    .line 88
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 89
    move-result-object v0

    .line 90
    .line 91
    new-instance v3, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getRankMarketConfig$preChoose$1;

    .line 92
    .line 93
    .line 94
    invoke-direct {v3, v4}, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getRankMarketConfig$preChoose$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 95
    .line 96
    iput v6, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getRankMarketConfig$1;->label:I

    .line 97
    .line 98
    .line 99
    invoke-static {v0, v3, v1}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 100
    move-result-object v0

    .line 101
    .line 102
    if-ne v0, v2, :cond_5

    .line 103
    goto :goto_2

    .line 104
    .line 105
    :cond_5
    :goto_1
    check-cast v0, Ljava/lang/String;

    .line 106
    .line 107
    :cond_6
    new-instance v3, Ljava/util/ArrayList;

    .line 108
    .line 109
    .line 110
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 114
    move-result-object v6

    .line 115
    .line 116
    new-instance v7, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getRankMarketConfig$config$1;

    .line 117
    .line 118
    .line 119
    invoke-direct {v7, v4}, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getRankMarketConfig$config$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 120
    .line 121
    iput-object v0, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getRankMarketConfig$1;->L$0:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object v3, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getRankMarketConfig$1;->L$1:Ljava/lang/Object;

    .line 124
    .line 125
    iput v5, v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$getRankMarketConfig$1;->label:I

    .line 126
    .line 127
    .line 128
    invoke-static {v6, v7, v1}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 129
    move-result-object v1

    .line 130
    .line 131
    if-ne v1, v2, :cond_7

    .line 132
    :goto_2
    return-object v2

    .line 133
    :cond_7
    move-object v2, v1

    .line 134
    move-object v1, v0

    .line 135
    move-object v0, v2

    .line 136
    move-object v2, v3

    .line 137
    :goto_3
    move-object v3, v0

    .line 138
    .line 139
    check-cast v3, Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 143
    move-result v0

    .line 144
    .line 145
    if-nez v0, :cond_8

    .line 146
    .line 147
    sget-object v0, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt;->a:Ljava/util/List;

    .line 148
    goto :goto_4

    .line 149
    .line 150
    :cond_8
    const-string v0, ","

    .line 151
    .line 152
    .line 153
    filled-new-array {v0}, [Ljava/lang/String;

    .line 154
    move-result-object v4

    .line 155
    const/4 v7, 0x6

    .line 156
    const/4 v8, 0x0

    .line 157
    const/4 v5, 0x0

    .line 158
    const/4 v6, 0x0

    .line 159
    .line 160
    .line 161
    invoke-static/range {v3 .. v8}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 162
    move-result-object v0

    .line 163
    .line 164
    .line 165
    :goto_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 166
    move-result-object v0

    .line 167
    .line 168
    .line 169
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    move-result v3

    .line 171
    .line 172
    if-eqz v3, :cond_a

    .line 173
    .line 174
    .line 175
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    move-result-object v3

    .line 177
    move-object v6, v3

    .line 178
    .line 179
    check-cast v6, Ljava/lang/String;

    .line 180
    .line 181
    const-string v3, "ALL"

    .line 182
    .line 183
    .line 184
    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 185
    move-result v4

    .line 186
    .line 187
    if-eqz v4, :cond_9

    .line 188
    .line 189
    sget-object v4, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 190
    .line 191
    sget v5, Lcom/kubi/quotefacade/R$string;->all_market:I

    .line 192
    const/4 v6, 0x0

    .line 193
    .line 194
    new-array v6, v6, [Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v4, v5, v6}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 198
    move-result-object v9

    .line 199
    .line 200
    .line 201
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 202
    move-result v18

    .line 203
    .line 204
    new-instance v7, Lcom/kubi/sdk/widget/dialog/a;

    .line 205
    .line 206
    const/16 v20, 0xbf9

    .line 207
    .line 208
    const/16 v21, 0x0

    .line 209
    const/4 v8, 0x0

    .line 210
    .line 211
    const-string v10, "ALL"

    .line 212
    const/4 v11, 0x0

    .line 213
    const/4 v12, 0x0

    .line 214
    const/4 v13, 0x0

    .line 215
    const/4 v14, 0x0

    .line 216
    const/4 v15, 0x0

    .line 217
    .line 218
    const/16 v16, 0x0

    .line 219
    .line 220
    const/16 v17, 0x0

    .line 221
    .line 222
    const/16 v19, 0x0

    .line 223
    .line 224
    .line 225
    invoke-direct/range {v7 .. v21}, Lcom/kubi/sdk/widget/dialog/a;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;Ljava/lang/Integer;Ljava/lang/String;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 226
    .line 227
    .line 228
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 229
    goto :goto_5

    .line 230
    .line 231
    :cond_9
    new-instance v4, Lcom/kubi/sdk/widget/dialog/a;

    .line 232
    .line 233
    .line 234
    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 235
    move-result v15

    .line 236
    .line 237
    const/16 v17, 0xbf9

    .line 238
    .line 239
    const/16 v18, 0x0

    .line 240
    const/4 v5, 0x0

    .line 241
    const/4 v8, 0x0

    .line 242
    const/4 v9, 0x0

    .line 243
    const/4 v10, 0x0

    .line 244
    const/4 v11, 0x0

    .line 245
    const/4 v12, 0x0

    .line 246
    const/4 v13, 0x0

    .line 247
    const/4 v14, 0x0

    .line 248
    .line 249
    const/16 v16, 0x0

    .line 250
    move-object v7, v6

    .line 251
    .line 252
    .line 253
    invoke-direct/range {v4 .. v18}, Lcom/kubi/sdk/widget/dialog/a;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;Ljava/lang/Integer;Ljava/lang/String;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 254
    .line 255
    .line 256
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 257
    goto :goto_5

    .line 258
    .line 259
    :cond_a
    sput-object v2, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt;->b:Ljava/util/List;

    .line 260
    return-object v2
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
.end method

.method public static final e(Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p0    # Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$a;",
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
    sput-object p0, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt;->c:Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$a;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$a;->getValue()Ljava/lang/String;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    sput-object p0, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt;->d:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    new-instance v0, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$updateCurMarket$2;

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$updateCurMarket$2;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0, v0, p1}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 22
    move-result-object p0

    .line 23
    return-object p0
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
.end method

.method public static final f(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .param p0    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
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
    if-nez p0, :cond_0

    .line 3
    .line 4
    const-string p0, "rankMarketConfig"

    .line 5
    .line 6
    const-string p1, "marketList is empty."

    .line 7
    .line 8
    .line 9
    invoke-static {p0, p1}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    return-object p0

    .line 13
    .line 14
    :cond_0
    const/16 v7, 0x3e

    .line 15
    const/4 v8, 0x0

    .line 16
    .line 17
    const-string v1, ","

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    move-object v0, p0

    .line 24
    .line 25
    .line 26
    invoke-static/range {v0 .. v8}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 27
    move-result-object p0

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    new-instance v1, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$updateMarketConfig$2;

    .line 34
    .line 35
    .line 36
    invoke-direct {v1, p0, v2}, Lcom/kubi/quotefacade/rank/config/RankMarketConfigKt$updateMarketConfig$2;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 40
    move-result-object p0

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    if-ne p0, p1, :cond_1

    .line 47
    return-object p0

    .line 48
    .line 49
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 50
    return-object p0
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
.end method
