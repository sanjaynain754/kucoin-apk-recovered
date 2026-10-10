.class public final Lrepayment/ext/RepayForAssetsVMExtKt;
.super Ljava/lang/Object;
.source "RepayForAssetsVMExt.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u001c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00022\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004H\u0000\u001a&\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0000\u001a\u0014\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\u000c\u0010\u0011\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a&\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002\u00a8\u0006\u0015"
    }
    d2 = {
        "updateDisplayListBySearchKey",
        "",
        "Lrepayment/RepayVM;",
        "keyword",
        "",
        "getFilterDisplayAssetListData",
        "",
        "Lrepayment/UnifyAssetData;",
        "keyWord",
        "updatePreRepayPriceStatus",
        "liability",
        "Lrepayment/UnifyLiabilityData;",
        "repayAssetsList",
        "startPreRepayPriceTimerTask",
        "Lkotlinx/coroutines/Job;",
        "requestEntity",
        "Lcom/kubi/unify/entity/PreRepayRequestBody;",
        "clearPreRepayPriceInfo",
        "launchFetchPreRepaySizeTask",
        "liabilityData",
        "repayAssetList",
        "BUnifyAccountLib_googleRelease"
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
        "SMAP\nRepayForAssetsVMExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepayForAssetsVMExt.kt\nrepayment/ext/RepayForAssetsVMExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n774#2:142\n865#2,2:143\n1563#2:145\n1634#2,3:146\n*S KotlinDebug\n*F\n+ 1 RepayForAssetsVMExt.kt\nrepayment/ext/RepayForAssetsVMExtKt\n*L\n52#1:142\n52#1:143,2\n131#1:145\n131#1:146,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lrepayment/RepayVM;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lrepayment/RepayVM;->s()Lkotlinx/coroutines/flow/n;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    const-string v0, "--"

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 10
    return-void
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

.method public static final b(Lrepayment/RepayVM;Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .param p0    # Lrepayment/RepayVM;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrepayment/RepayVM;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lrepayment/UnifyAssetData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lrepayment/RepayVM;->t()Lkotlinx/coroutines/flow/n;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 13
    move-result-object p0

    .line 14
    .line 15
    instance-of v0, p0, Lrepayment/b$b;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    check-cast p0, Lrepayment/b$b;

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    .line 23
    :goto_0
    if-eqz p0, :cond_6

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lrepayment/b$b;->d()Lrepayment/RepayAssetData;

    .line 27
    move-result-object p0

    .line 28
    .line 29
    if-eqz p0, :cond_6

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lrepayment/RepayAssetData;->getUnifyAssetList()Ljava/util/List;

    .line 33
    move-result-object p0

    .line 34
    .line 35
    if-nez p0, :cond_1

    .line 36
    goto :goto_3

    .line 37
    .line 38
    :cond_1
    if-eqz p1, :cond_5

    .line 39
    .line 40
    .line 41
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 42
    move-result v0

    .line 43
    .line 44
    if-nez v0, :cond_2

    .line 45
    goto :goto_2

    .line 46
    .line 47
    .line 48
    :cond_2
    invoke-static {p0}, Lcom/kubi/utils/extensions/b;->a(Ljava/util/List;)Ljava/util/List;

    .line 49
    move-result-object p0

    .line 50
    .line 51
    new-instance v0, Ljava/util/ArrayList;

    .line 52
    .line 53
    .line 54
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    move-result-object p0

    .line 59
    .line 60
    .line 61
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    move-result v1

    .line 63
    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    .line 67
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    move-result-object v1

    .line 69
    move-object v2, v1

    .line 70
    .line 71
    check-cast v2, Lrepayment/UnifyAssetData;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Lrepayment/UnifyAssetData;->getCurrencyName()Ljava/lang/String;

    .line 75
    move-result-object v2

    .line 76
    .line 77
    if-eqz v2, :cond_3

    .line 78
    const/4 v3, 0x1

    .line 79
    .line 80
    .line 81
    invoke-static {v2, p1, v3}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 82
    move-result v2

    .line 83
    .line 84
    if-ne v2, v3, :cond_3

    .line 85
    .line 86
    .line 87
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 88
    goto :goto_1

    .line 89
    :cond_4
    return-object v0

    .line 90
    :cond_5
    :goto_2
    return-object p0

    .line 91
    .line 92
    .line 93
    :cond_6
    :goto_3
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 94
    move-result-object p0

    .line 95
    return-object p0
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
.end method

.method public static final c(Lrepayment/RepayVM;Lrepayment/UnifyLiabilityData;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrepayment/RepayVM;",
            "Lrepayment/UnifyLiabilityData;",
            "Ljava/util/List<",
            "Lrepayment/UnifyAssetData;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_8

    .line 3
    .line 4
    new-instance v0, Lcom/kubi/unify/entity/CurrencyItem;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lrepayment/UnifyLiabilityData;->getCurrencyCode()Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    const-string v2, ""

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    move-object v1, v2

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1}, Lrepayment/UnifyLiabilityData;->getAmount()Ljava/math/BigDecimal;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    if-nez p1, :cond_2

    .line 26
    :cond_1
    move-object p1, v2

    .line 27
    .line 28
    .line 29
    :cond_2
    invoke-direct {v0, v1, p1}, Lcom/kubi/unify/entity/CurrencyItem;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    if-eqz p2, :cond_6

    .line 32
    .line 33
    new-instance p1, Ljava/util/ArrayList;

    .line 34
    .line 35
    const/16 v1, 0xa

    .line 36
    .line 37
    .line 38
    invoke-static {p2, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 39
    move-result v1

    .line 40
    .line 41
    .line 42
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    move-result-object p2

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    move-result v1

    .line 51
    .line 52
    if-eqz v1, :cond_7

    .line 53
    .line 54
    .line 55
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    check-cast v1, Lrepayment/UnifyAssetData;

    .line 59
    .line 60
    new-instance v3, Lcom/kubi/unify/entity/CurrencyItem;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Lrepayment/UnifyAssetData;->getCurrencyCode()Ljava/lang/String;

    .line 64
    move-result-object v4

    .line 65
    .line 66
    if-nez v4, :cond_3

    .line 67
    move-object v4, v2

    .line 68
    .line 69
    .line 70
    :cond_3
    invoke-virtual {v1}, Lrepayment/UnifyAssetData;->getAmount()Ljava/math/BigDecimal;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    if-eqz v1, :cond_4

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 77
    move-result-object v1

    .line 78
    .line 79
    if-nez v1, :cond_5

    .line 80
    :cond_4
    move-object v1, v2

    .line 81
    .line 82
    .line 83
    :cond_5
    invoke-direct {v3, v4, v1}, Lcom/kubi/unify/entity/CurrencyItem;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {p1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 87
    goto :goto_0

    .line 88
    .line 89
    .line 90
    :cond_6
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    :cond_7
    new-instance p2, Lcom/kubi/unify/entity/PreRepayRequestBody;

    .line 94
    .line 95
    .line 96
    invoke-direct {p2, v0, p1}, Lcom/kubi/unify/entity/PreRepayRequestBody;-><init>(Lcom/kubi/unify/entity/CurrencyItem;Ljava/util/List;)V

    .line 97
    .line 98
    .line 99
    invoke-static {p0, p2}, Lrepayment/ext/RepayForAssetsVMExtKt;->d(Lrepayment/RepayVM;Lcom/kubi/unify/entity/PreRepayRequestBody;)Lkotlinx/coroutines/x1;

    .line 100
    move-result-object p1

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, p1}, Lrepayment/RepayVM;->E(Lkotlinx/coroutines/x1;)V

    .line 104
    :cond_8
    return-void
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
.end method

.method public static final d(Lrepayment/RepayVM;Lcom/kubi/unify/entity/PreRepayRequestBody;)Lkotlinx/coroutines/x1;
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
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    new-instance v3, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct {v3, p0, p1, v2}, Lrepayment/ext/RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1;-><init>(Lrepayment/RepayVM;Lcom/kubi/unify/entity/PreRepayRequestBody;Lkotlin/coroutines/Continuation;)V

    .line 15
    const/4 v4, 0x2

    .line 16
    const/4 v5, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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
.end method

.method public static final e(Lrepayment/RepayVM;Ljava/lang/String;)V
    .locals 3
    .param p0    # Lrepayment/RepayVM;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lrepayment/RepayVM;->t()Lkotlinx/coroutines/flow/n;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    instance-of v1, v0, Lrepayment/b$b;

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    check-cast v0, Lrepayment/b$b;

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v0, v2

    .line 23
    .line 24
    :goto_0
    if-eqz v0, :cond_2

    .line 25
    .line 26
    .line 27
    invoke-static {p0, p1}, Lrepayment/ext/RepayForAssetsVMExtKt;->b(Lrepayment/RepayVM;Ljava/lang/String;)Ljava/util/List;

    .line 28
    move-result-object p1

    .line 29
    const/4 v1, 0x1

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v2, p1, v1, v2}, Lrepayment/b$b;->b(Lrepayment/b$b;Lrepayment/RepayAssetData;Ljava/util/List;ILjava/lang/Object;)Lrepayment/b$b;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    if-nez p1, :cond_1

    .line 36
    goto :goto_1

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0}, Lrepayment/RepayVM;->t()Lkotlinx/coroutines/flow/n;

    .line 40
    move-result-object p0

    .line 41
    .line 42
    .line 43
    invoke-interface {p0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 44
    :cond_2
    :goto_1
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
    .line 184
    .line 185
    .line 186
.end method

.method public static final f(Lrepayment/RepayVM;Lrepayment/UnifyLiabilityData;Ljava/util/List;)V
    .locals 3
    .param p0    # Lrepayment/RepayVM;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lrepayment/UnifyLiabilityData;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrepayment/RepayVM;",
            "Lrepayment/UnifyLiabilityData;",
            "Ljava/util/List<",
            "Lrepayment/UnifyAssetData;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lrepayment/RepayVM;->u()Lkotlinx/coroutines/x1;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-static {p0}, Lrepayment/ext/RepayForAssetsVMExtKt;->a(Lrepayment/RepayVM;)V

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    if-eqz p2, :cond_2

    .line 24
    .line 25
    .line 26
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 27
    move-result v0

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    goto :goto_0

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-static {p0, p1, p2}, Lrepayment/ext/RepayForAssetsVMExtKt;->c(Lrepayment/RepayVM;Lrepayment/UnifyLiabilityData;Ljava/util/List;)V

    .line 34
    :cond_2
    :goto_0
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
.end method
