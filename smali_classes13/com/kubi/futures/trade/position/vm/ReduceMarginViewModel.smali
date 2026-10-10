.class public final Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;
.super Lcom/kubi/futures/trade/position/vm/e2;
.source "ReduceMarginViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J \u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00112\u0008\u0008\u0001\u0010!\u001a\u00020\u001bJ(\u0010\"\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00112\u0006\u0010#\u001a\u00020\t2\u0008\u0008\u0001\u0010!\u001a\u00020\u001bJ\u0006\u0010$\u001a\u00020\u0016J\u0016\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0006H\u0082@\u00a2\u0006\u0002\u0010\'R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000bR%\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00100\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000bR\u0010\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("
    }
    d2 = {
        "Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;",
        "Lcom/kubi/futures/trade/position/vm/ModifyMarginViewModel;",
        "<init>",
        "()V",
        "unifyCalFlow",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/kubi/futures/trade/position/vm/FetchUnifyCalculateParams;",
        "reduceMargin",
        "Landroidx/lifecycle/MutableLiveData;",
        "Ljava/math/BigDecimal;",
        "getReduceMargin",
        "()Landroidx/lifecycle/MutableLiveData;",
        "afterPositionRender",
        "Lcom/kubi/futures/trade/position/PositionRenderInfo;",
        "getAfterPositionRender",
        "submitResult",
        "Lkotlin/Pair;",
        "",
        "",
        "getSubmitResult",
        "inputValue",
        "handleReduceMargin",
        "",
        "input",
        "position",
        "Lcom/kubi/kumex/data/trade/model/PositionEntity;",
        "getEntryPrice",
        "",
        "contract",
        "Lcom/kubi/kumex/data/platform/model/ContractEntity;",
        "fetchMaxReduceMargin",
        "symbol",
        "isTrial",
        "positionSide",
        "submitReduceMargin",
        "margin",
        "fetchSymbolConfig",
        "fetchUnifyCalculateResult",
        "value",
        "(Lcom/kubi/futures/trade/position/vm/FetchUnifyCalculateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "KumexLib_googleRelease"
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
        "SMAP\nReduceMarginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReduceMarginViewModel.kt\ncom/kubi/futures/trade/position/vm/ReduceMarginViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,296:1\n1#2:297\n*E\n"
    }
.end annotation


# instance fields
.field public final Z:Lkotlinx/coroutines/flow/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/n<",
            "Lcom/kubi/futures/trade/position/vm/c0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final a0:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/math/BigDecimal;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b0:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/kubi/futures/trade/position/f3;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c0:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Throwable;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public d0:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/vm/e2;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/futures/trade/position/vm/c0;

    .line 6
    .line 7
    const/16 v6, 0x1f

    .line 8
    const/4 v7, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    .line 15
    .line 16
    invoke-direct/range {v0 .. v7}, Lcom/kubi/futures/trade/position/vm/c0;-><init>(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    iput-object v0, p0, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->Z:Lkotlinx/coroutines/flow/n;

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lo00/a;->a()Lkotlinx/coroutines/j0;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v4, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel$1;

    .line 33
    const/4 v0, 0x0

    .line 34
    .line 35
    .line 36
    invoke-direct {v4, p0, v0}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel$1;-><init>(Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;Lkotlin/coroutines/Continuation;)V

    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x0

    .line 39
    .line 40
    .line 41
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 42
    .line 43
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 44
    .line 45
    .line 46
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 47
    .line 48
    iput-object v0, p0, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->a0:Landroidx/lifecycle/MutableLiveData;

    .line 49
    .line 50
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 51
    .line 52
    .line 53
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 54
    .line 55
    iput-object v0, p0, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->b0:Landroidx/lifecycle/MutableLiveData;

    .line 56
    .line 57
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 58
    .line 59
    .line 60
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 61
    .line 62
    iput-object v0, p0, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->c0:Landroidx/lifecycle/MutableLiveData;

    .line 63
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
.end method

.method public static synthetic P()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->W()V

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
.end method

.method public static synthetic Q()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->X()Lkotlin/Unit;

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
.end method

.method public static synthetic R(Lcom/kubi/futures/trade/position/vm/c0;)Lcm/r;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->Z(Lcom/kubi/futures/trade/position/vm/c0;)Lcm/r;

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
.end method

.method public static final synthetic S(Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;Lcom/kubi/futures/trade/position/vm/c0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->Y(Lcom/kubi/futures/trade/position/vm/c0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic T(Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;)Lkotlinx/coroutines/flow/n;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->Z:Lkotlinx/coroutines/flow/n;

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
.end method

.method public static final W()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/futures/trade/position/vm/j2;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/futures/trade/position/vm/j2;-><init>()V

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
    .line 31
    .line 32
    .line 33
.end method

.method public static final X()Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2, v1}, Lth/d;->B(Lth/d;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/util/Map;

    .line 12
    .line 13
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

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
    .line 31
    .line 32
    .line 33
.end method

.method private final Y(Lcom/kubi/futures/trade/position/vm/c0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/futures/trade/position/vm/c0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/futures/trade/position/f3;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    instance-of v2, v1, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel$fetchUnifyCalculateResult$1;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    move-object v2, v1

    .line 10
    .line 11
    check-cast v2, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel$fetchUnifyCalculateResult$1;

    .line 12
    .line 13
    iget v3, v2, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel$fetchUnifyCalculateResult$1;->label:I

    .line 14
    .line 15
    const/high16 v4, -0x80000000

    .line 16
    .line 17
    and-int v5, v3, v4

    .line 18
    .line 19
    if-eqz v5, :cond_0

    .line 20
    sub-int/2addr v3, v4

    .line 21
    .line 22
    iput v3, v2, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel$fetchUnifyCalculateResult$1;->label:I

    .line 23
    .line 24
    move-object/from16 v3, p0

    .line 25
    :goto_0
    move-object v7, v2

    .line 26
    goto :goto_1

    .line 27
    .line 28
    :cond_0
    new-instance v2, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel$fetchUnifyCalculateResult$1;

    .line 29
    .line 30
    move-object/from16 v3, p0

    .line 31
    .line 32
    .line 33
    invoke-direct {v2, v3, v1}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel$fetchUnifyCalculateResult$1;-><init>(Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;Lkotlin/coroutines/Continuation;)V

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :goto_1
    iget-object v1, v7, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel$fetchUnifyCalculateResult$1;->result:Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    iget v4, v7, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel$fetchUnifyCalculateResult$1;->label:I

    .line 43
    const/4 v10, 0x1

    .line 44
    const/4 v11, 0x0

    .line 45
    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    if-ne v4, v10, :cond_1

    .line 49
    .line 50
    iget-object v0, v7, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel$fetchUnifyCalculateResult$1;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lcom/kubi/futures/trade/position/vm/c0;

    .line 53
    .line 54
    .line 55
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 56
    goto :goto_2

    .line 57
    .line 58
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    .line 63
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    throw v0

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Lcom/kubi/futures/trade/position/vm/c0;->b()Ljava/math/BigDecimal;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    .line 74
    invoke-static {v1, v11, v10, v11}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 75
    move-result-object v1

    .line 76
    .line 77
    sget-object v4, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 81
    move-result v1

    .line 82
    .line 83
    if-gtz v1, :cond_3

    .line 84
    .line 85
    new-instance v12, Lcom/kubi/futures/trade/position/f3;

    .line 86
    .line 87
    const/16 v17, 0xf

    .line 88
    .line 89
    const/16 v18, 0x0

    .line 90
    const/4 v13, 0x0

    .line 91
    const/4 v14, 0x0

    .line 92
    const/4 v15, 0x0

    .line 93
    .line 94
    const/16 v16, 0x0

    .line 95
    .line 96
    .line 97
    invoke-direct/range {v12 .. v18}, Lcom/kubi/futures/trade/position/f3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 98
    return-object v12

    .line 99
    .line 100
    .line 101
    :cond_3
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 102
    move-result-object v4

    .line 103
    .line 104
    new-instance v6, Lcom/kubi/futures/trade/position/vm/i2;

    .line 105
    .line 106
    .line 107
    invoke-direct {v6, v0}, Lcom/kubi/futures/trade/position/vm/i2;-><init>(Lcom/kubi/futures/trade/position/vm/c0;)V

    .line 108
    .line 109
    iput-object v0, v7, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel$fetchUnifyCalculateResult$1;->L$0:Ljava/lang/Object;

    .line 110
    .line 111
    iput v10, v7, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel$fetchUnifyCalculateResult$1;->label:I

    .line 112
    const/4 v5, 0x0

    .line 113
    const/4 v8, 0x2

    .line 114
    const/4 v9, 0x0

    .line 115
    .line 116
    .line 117
    invoke-static/range {v4 .. v9}, Lcom/kubi/kumex/utils/CoroutineExKt;->d(Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 118
    move-result-object v1

    .line 119
    .line 120
    if-ne v1, v2, :cond_4

    .line 121
    return-object v2

    .line 122
    .line 123
    :cond_4
    :goto_2
    check-cast v1, Lcm/r;

    .line 124
    .line 125
    if-nez v1, :cond_5

    .line 126
    .line 127
    new-instance v1, Lcm/r;

    .line 128
    .line 129
    .line 130
    invoke-direct {v1, v11, v10, v11}, Lcm/r;-><init>(Ljava/math/BigDecimal;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 131
    .line 132
    :cond_5
    sget-object v2, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 136
    move-result-object v2

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Lcom/kubi/futures/trade/position/vm/c0;->e()Ljava/lang/String;

    .line 140
    move-result-object v4

    .line 141
    .line 142
    .line 143
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    move-result-object v4

    .line 145
    const/4 v5, 0x0

    .line 146
    const/4 v6, 0x2

    .line 147
    .line 148
    .line 149
    invoke-static {v2, v4, v5, v6, v11}, Lth/d;->O(Lth/d;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 150
    move-result-object v13

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Lcom/kubi/futures/trade/position/vm/c0;->a()Ljava/math/BigDecimal;

    .line 154
    move-result-object v2

    .line 155
    .line 156
    if-eqz v2, :cond_6

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Lcom/kubi/futures/trade/position/vm/c0;->b()Ljava/math/BigDecimal;

    .line 160
    move-result-object v4

    .line 161
    .line 162
    .line 163
    invoke-static {v4, v11, v10, v11}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 164
    move-result-object v4

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v4}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 168
    move-result-object v2

    .line 169
    move-object v14, v2

    .line 170
    goto :goto_3

    .line 171
    :cond_6
    move-object v14, v11

    .line 172
    .line 173
    :goto_3
    if-eqz v14, :cond_8

    .line 174
    .line 175
    sget-object v15, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 176
    .line 177
    if-eqz v13, :cond_7

    .line 178
    .line 179
    .line 180
    invoke-static {v13}, Lfm/b;->c(Lcom/kubi/kumex/data/platform/model/ContractEntity;)I

    .line 181
    move-result v2

    .line 182
    .line 183
    .line 184
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 185
    move-result-object v2

    .line 186
    goto :goto_4

    .line 187
    :cond_7
    move-object v2, v11

    .line 188
    :goto_4
    const/4 v4, 0x4

    .line 189
    .line 190
    .line 191
    invoke-static {v2, v4}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 192
    move-result v16

    .line 193
    .line 194
    const/16 v22, 0x60

    .line 195
    .line 196
    const/16 v23, 0x0

    .line 197
    .line 198
    const/16 v17, 0x1

    .line 199
    .line 200
    const/16 v18, 0x1

    .line 201
    .line 202
    const/16 v19, 0x1

    .line 203
    .line 204
    const/16 v20, 0x0

    .line 205
    .line 206
    const/16 v21, 0x0

    .line 207
    .line 208
    .line 209
    invoke-static/range {v14 .. v23}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 210
    move-result-object v2

    .line 211
    goto :goto_5

    .line 212
    :cond_8
    move-object v2, v11

    .line 213
    .line 214
    .line 215
    :goto_5
    invoke-static {v2}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 216
    move-result-object v5

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1}, Lcm/r;->a()Ljava/math/BigDecimal;

    .line 220
    move-result-object v1

    .line 221
    .line 222
    if-eqz v1, :cond_a

    .line 223
    .line 224
    sget-object v2, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1, v2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 228
    move-result v2

    .line 229
    .line 230
    if-lez v2, :cond_9

    .line 231
    move-object v12, v1

    .line 232
    goto :goto_6

    .line 233
    :cond_9
    move-object v12, v11

    .line 234
    .line 235
    :goto_6
    if-eqz v12, :cond_a

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0}, Lcom/kubi/futures/trade/position/vm/c0;->d()Ljava/lang/String;

    .line 239
    move-result-object v0

    .line 240
    .line 241
    const-string v1, "buy"

    .line 242
    .line 243
    .line 244
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 245
    move-result-object v14

    .line 246
    .line 247
    const/16 v17, 0xc

    .line 248
    .line 249
    const/16 v18, 0x0

    .line 250
    const/4 v15, 0x0

    .line 251
    .line 252
    const/16 v16, 0x0

    .line 253
    .line 254
    .line 255
    invoke-static/range {v12 .. v18}, Lcom/kubi/kumex/utils/k0;->n(Ljava/math/BigDecimal;Lcom/kubi/kumex/data/platform/model/ContractEntity;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 256
    move-result-object v11

    .line 257
    .line 258
    .line 259
    :cond_a
    invoke-static {v11}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 260
    move-result-object v7

    .line 261
    .line 262
    new-instance v4, Lcom/kubi/futures/trade/position/f3;

    .line 263
    const/4 v6, 0x0

    .line 264
    const/4 v8, 0x0

    .line 265
    .line 266
    const/16 v9, 0xa

    .line 267
    const/4 v10, 0x0

    .line 268
    .line 269
    .line 270
    invoke-direct/range {v4 .. v10}, Lcom/kubi/futures/trade/position/f3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 271
    return-object v4
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
.end method

.method public static final Z(Lcom/kubi/futures/trade/position/vm/c0;)Lcm/r;
    .locals 10

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/broker/m;->a:Lcom/kubi/broker/m;

    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v2, v1, v2}, Lcom/kubi/broker/m;->p(Lcom/kubi/broker/m;Lcom/kubi/broker/MultiBizType;ILjava/lang/Object;)Lug/b;

    .line 8
    move-result-object v3

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/vm/c0;->e()Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    move-result-object v4

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/vm/c0;->b()Ljava/math/BigDecimal;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    :cond_0
    const-string v0, "0"

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v0}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    move-result-object v5

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/vm/c0;->c()Ljava/lang/String;

    .line 36
    move-result-object p0

    .line 37
    .line 38
    const-string v0, "BOTH"

    .line 39
    .line 40
    .line 41
    invoke-static {p0, v0}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    move-result-object v6

    .line 43
    .line 44
    const/16 v8, 0x8

    .line 45
    const/4 v9, 0x0

    .line 46
    const/4 v7, 0x0

    .line 47
    .line 48
    .line 49
    invoke-static/range {v3 .. v9}, Lug/c;->R(Lug/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcm/r;

    .line 50
    move-result-object p0

    .line 51
    return-object p0
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
.end method


# virtual methods
.method public final U(Ljava/lang/String;ZLjava/lang/String;)V
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "symbol"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "positionSide"

    .line 8
    .line 9
    .line 10
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lem/a;->d()Lkotlinx/coroutines/CoroutineExceptionHandler;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v2}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    new-instance v3, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel$fetchMaxReduceMargin$1;

    .line 29
    const/4 v8, 0x0

    .line 30
    move-object v7, p0

    .line 31
    move-object v5, p1

    .line 32
    move v4, p2

    .line 33
    move-object v6, p3

    .line 34
    .line 35
    .line 36
    invoke-direct/range {v3 .. v8}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel$fetchMaxReduceMargin$1;-><init>(ZLjava/lang/String;Ljava/lang/String;Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;Lkotlin/coroutines/Continuation;)V

    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x0

    .line 39
    move-object v4, v3

    .line 40
    const/4 v3, 0x0

    .line 41
    .line 42
    .line 43
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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
.end method

.method public final V()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/h2;->n()Lio/reactivex/disposables/CompositeDisposable;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lo00/f;->f()Lio/reactivex/Scheduler;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    new-instance v2, Lcom/kubi/futures/trade/position/vm/h2;

    .line 11
    .line 12
    .line 13
    invoke-direct {v2}, Lcom/kubi/futures/trade/position/vm/h2;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, Lio/reactivex/Scheduler;->scheduleDirect(Ljava/lang/Runnable;)Lio/reactivex/disposables/Disposable;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 21
    return-void
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
.end method

.method public final a0()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/kubi/futures/trade/position/f3;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->b0:Landroidx/lifecycle/MutableLiveData;

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
.end method

.method public final b0(Ljava/math/BigDecimal;Lcom/kubi/kumex/data/trade/model/PositionEntity;Lcom/kubi/kumex/data/platform/model/ContractEntity;)Ljava/lang/String;
    .locals 10

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSymbol()Ljava/lang/String;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, Lth/d;->X(Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/SymbolConfig;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lfm/e;->b(Lcom/kubi/kumex/data/platform/model/SymbolConfig;)Ljava/math/BigDecimal;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    sget-object v1, Luk/c;->a:Luk/c;

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 28
    move-result-object v7

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosMargin()Ljava/math/BigDecimal;

    .line 36
    move-result-object p1

    .line 37
    const/4 v0, 0x0

    .line 38
    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 43
    move-result-object p1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object p1, v0

    .line 46
    :goto_0
    const/4 v8, 0x1

    .line 47
    .line 48
    .line 49
    invoke-static {p1, v0, v8, v0}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 50
    move-result-object v3

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosCost()Ljava/math/BigDecimal;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    .line 59
    invoke-static {p1}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 60
    move-result-object p1

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    move-object p1, v0

    .line 63
    .line 64
    .line 65
    :goto_1
    invoke-static {p1, v0, v8, v0}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 66
    move-result-object v4

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getMarkPrice()Ljava/math/BigDecimal;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    .line 75
    invoke-static {p1}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 76
    move-result-object p1

    .line 77
    goto :goto_2

    .line 78
    :cond_2
    move-object p1, v0

    .line 79
    .line 80
    .line 81
    :goto_2
    invoke-static {p1, v0, v8, v0}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 82
    move-result-object v5

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getAvgEntryPrice()Ljava/math/BigDecimal;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    if-eqz p1, :cond_3

    .line 89
    .line 90
    .line 91
    invoke-static {p1}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 92
    move-result-object p1

    .line 93
    goto :goto_3

    .line 94
    :cond_3
    move-object p1, v0

    .line 95
    .line 96
    .line 97
    :goto_3
    invoke-static {p1, v0, v8, v0}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 98
    move-result-object v6

    .line 99
    .line 100
    .line 101
    invoke-virtual/range {v1 .. v7}, Luk/c;->a(Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;

    .line 102
    move-result-object p1

    .line 103
    .line 104
    .line 105
    invoke-static {p1, v0, v8, v0}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 106
    move-result-object p1

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Lrk/b;->d()Ljava/math/BigDecimal;

    .line 110
    move-result-object v0

    .line 111
    .line 112
    sget-object v1, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 113
    .line 114
    .line 115
    invoke-static {p3}, Lfm/b;->h(Lcom/kubi/kumex/data/platform/model/ContractEntity;)I

    .line 116
    move-result p1

    .line 117
    .line 118
    .line 119
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    move-result-object p1

    .line 121
    const/4 p2, 0x2

    .line 122
    .line 123
    .line 124
    invoke-static {p1, p2}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 125
    move-result v2

    .line 126
    .line 127
    const/16 v8, 0x60

    .line 128
    const/4 v9, 0x0

    .line 129
    const/4 v3, 0x1

    .line 130
    const/4 v4, 0x1

    .line 131
    const/4 v5, 0x1

    .line 132
    const/4 v6, 0x0

    .line 133
    const/4 v7, 0x0

    .line 134
    .line 135
    .line 136
    invoke-static/range {v0 .. v9}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 137
    move-result-object p1

    .line 138
    return-object p1
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
.end method

.method public final c0()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/math/BigDecimal;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->a0:Landroidx/lifecycle/MutableLiveData;

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
.end method

.method public final d0()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Throwable;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->c0:Landroidx/lifecycle/MutableLiveData;

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
.end method

.method public final e0(Ljava/math/BigDecimal;Lcom/kubi/kumex/data/trade/model/PositionEntity;)V
    .locals 22
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/kumex/data/trade/model/PositionEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    sget-object v2, Lcom/kubi/broker/BrokerConfig;->a:Lcom/kubi/broker/BrokerConfig;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v2}, Lcom/kubi/broker/BrokerConfig;->d()Lcom/kubi/broker/f;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    .line 11
    invoke-interface {v2}, Lcom/kubi/broker/f;->x()Lcom/kubi/broker/MultiBizType;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    sget-object v3, Lcom/kubi/broker/MultiBizType;->UNIFIED:Lcom/kubi/broker/MultiBizType;

    .line 15
    const/4 v4, 0x0

    .line 16
    .line 17
    if-ne v2, v3, :cond_3

    .line 18
    .line 19
    iget-object v9, v0, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->Z:Lkotlinx/coroutines/flow/n;

    .line 20
    .line 21
    move-object/from16 v2, p2

    .line 22
    .line 23
    new-instance v1, Lcom/kubi/futures/trade/position/vm/c0;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSymbol()Ljava/lang/String;

    .line 29
    move-result-object v3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v3, v4

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosMargin()Ljava/math/BigDecimal;

    .line 41
    move-result-object v5

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move-object v5, v4

    .line 44
    .line 45
    :goto_1
    if-eqz v2, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPositionSide()Ljava/lang/String;

    .line 49
    move-result-object v4

    .line 50
    .line 51
    :cond_2
    const-string v2, "BOTH"

    .line 52
    .line 53
    .line 54
    invoke-static {v4, v2}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    move-result-object v2

    .line 56
    .line 57
    const/16 v7, 0x10

    .line 58
    const/4 v8, 0x0

    .line 59
    const/4 v6, 0x0

    .line 60
    move-object v4, v5

    .line 61
    move-object v5, v2

    .line 62
    move-object v2, v3

    .line 63
    move-object v3, v4

    .line 64
    .line 65
    move-object/from16 v4, p1

    .line 66
    .line 67
    .line 68
    invoke-direct/range {v1 .. v8}, Lcom/kubi/futures/trade/position/vm/c0;-><init>(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v9, v1}, Lkotlinx/coroutines/flow/m;->d(Ljava/lang/Object;)Z

    .line 72
    return-void

    .line 73
    .line 74
    :cond_3
    move-object/from16 v1, p1

    .line 75
    .line 76
    move-object/from16 v2, p2

    .line 77
    .line 78
    iget-object v3, v0, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->d0:Ljava/math/BigDecimal;

    .line 79
    .line 80
    if-nez v3, :cond_4

    .line 81
    .line 82
    if-nez v1, :cond_4

    .line 83
    return-void

    .line 84
    .line 85
    :cond_4
    if-eqz v1, :cond_5

    .line 86
    .line 87
    new-instance v3, Ljava/math/BigDecimal;

    .line 88
    const/4 v5, -0x1

    .line 89
    .line 90
    .line 91
    invoke-direct {v3, v5}, Ljava/math/BigDecimal;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v3}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 95
    move-result-object v1

    .line 96
    goto :goto_2

    .line 97
    :cond_5
    move-object v1, v4

    .line 98
    .line 99
    :goto_2
    iput-object v1, v0, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->d0:Ljava/math/BigDecimal;

    .line 100
    .line 101
    sget-object v3, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 105
    move-result-object v3

    .line 106
    .line 107
    if-eqz v2, :cond_6

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSymbol()Ljava/lang/String;

    .line 111
    move-result-object v5

    .line 112
    goto :goto_3

    .line 113
    :cond_6
    move-object v5, v4

    .line 114
    .line 115
    .line 116
    :goto_3
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    move-result-object v5

    .line 118
    const/4 v6, 0x2

    .line 119
    const/4 v7, 0x0

    .line 120
    .line 121
    .line 122
    invoke-static {v3, v5, v7, v6, v4}, Lth/d;->O(Lth/d;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 123
    move-result-object v9

    .line 124
    .line 125
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 126
    .line 127
    sget v5, Lcom/kubi/kumex/R$string;->stub:I

    .line 128
    .line 129
    new-array v6, v7, [Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, v5, v6}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 133
    move-result-object v3

    .line 134
    .line 135
    if-eqz v1, :cond_17

    .line 136
    .line 137
    sget-object v5, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v5}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 141
    move-result v5

    .line 142
    .line 143
    if-eqz v5, :cond_17

    .line 144
    .line 145
    if-eqz v2, :cond_17

    .line 146
    .line 147
    if-nez v9, :cond_7

    .line 148
    .line 149
    goto/16 :goto_12

    .line 150
    .line 151
    :cond_7
    sget-object v5, Luk/b;->a:Luk/b;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v9}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse()Z

    .line 155
    move-result v6

    .line 156
    .line 157
    .line 158
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 159
    move-result-object v6

    .line 160
    .line 161
    .line 162
    invoke-static {v6}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 163
    move-result v6

    .line 164
    .line 165
    .line 166
    invoke-virtual {v9}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMultiplier()Ljava/math/BigDecimal;

    .line 167
    move-result-object v8

    .line 168
    .line 169
    if-eqz v8, :cond_8

    .line 170
    .line 171
    .line 172
    invoke-static {v8}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 173
    move-result-object v8

    .line 174
    goto :goto_4

    .line 175
    :cond_8
    move-object v8, v4

    .line 176
    :goto_4
    const/4 v10, 0x1

    .line 177
    .line 178
    .line 179
    invoke-static {v8, v4, v10, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 180
    move-result-object v8

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getMarkPrice()Ljava/math/BigDecimal;

    .line 184
    move-result-object v11

    .line 185
    .line 186
    if-eqz v11, :cond_9

    .line 187
    .line 188
    .line 189
    invoke-static {v11}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 190
    move-result-object v11

    .line 191
    goto :goto_5

    .line 192
    :cond_9
    move-object v11, v4

    .line 193
    .line 194
    .line 195
    :goto_5
    invoke-static {v11, v4, v10, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 196
    move-result-object v11

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getCurrentQty()Ljava/math/BigDecimal;

    .line 200
    move-result-object v12

    .line 201
    .line 202
    if-eqz v12, :cond_a

    .line 203
    .line 204
    .line 205
    invoke-static {v12}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 206
    move-result-object v12

    .line 207
    goto :goto_6

    .line 208
    :cond_a
    move-object v12, v4

    .line 209
    .line 210
    .line 211
    :goto_6
    invoke-static {v12, v4, v10, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 212
    move-result-object v12

    .line 213
    .line 214
    .line 215
    invoke-virtual {v5, v6, v8, v11, v12}, Luk/b;->g(ZLrk/b;Lrk/b;Lrk/b;)Lrk/b;

    .line 216
    move-result-object v5

    .line 217
    .line 218
    .line 219
    invoke-static {v5, v4, v10, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 220
    move-result-object v5

    .line 221
    .line 222
    .line 223
    invoke-virtual {v5}, Lrk/b;->d()Ljava/math/BigDecimal;

    .line 224
    move-result-object v5

    .line 225
    .line 226
    sget-object v11, Luk/c;->a:Luk/c;

    .line 227
    .line 228
    .line 229
    invoke-static {v5}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 230
    move-result-object v6

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosMargin()Ljava/math/BigDecimal;

    .line 234
    move-result-object v8

    .line 235
    .line 236
    if-eqz v8, :cond_b

    .line 237
    .line 238
    .line 239
    invoke-static {v8}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 240
    move-result-object v8

    .line 241
    goto :goto_7

    .line 242
    :cond_b
    move-object v8, v4

    .line 243
    .line 244
    .line 245
    :goto_7
    invoke-static {v8, v4, v10, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 246
    move-result-object v8

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosCost()Ljava/math/BigDecimal;

    .line 250
    move-result-object v12

    .line 251
    .line 252
    if-eqz v12, :cond_c

    .line 253
    .line 254
    .line 255
    invoke-static {v12}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 256
    move-result-object v12

    .line 257
    goto :goto_8

    .line 258
    :cond_c
    move-object v12, v4

    .line 259
    .line 260
    .line 261
    :goto_8
    invoke-static {v12, v4, v10, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 262
    move-result-object v12

    .line 263
    .line 264
    .line 265
    invoke-static {v1}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 266
    move-result-object v13

    .line 267
    .line 268
    .line 269
    invoke-virtual {v11, v6, v8, v12, v13}, Luk/c;->e(Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;

    .line 270
    move-result-object v6

    .line 271
    .line 272
    .line 273
    invoke-static {v6, v4, v10, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 274
    move-result-object v6

    .line 275
    .line 276
    .line 277
    invoke-virtual {v6}, Lrk/b;->d()Ljava/math/BigDecimal;

    .line 278
    move-result-object v6

    .line 279
    .line 280
    .line 281
    invoke-static {v5}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 282
    move-result-object v5

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosMargin()Ljava/math/BigDecimal;

    .line 286
    move-result-object v8

    .line 287
    .line 288
    if-eqz v8, :cond_d

    .line 289
    .line 290
    .line 291
    invoke-static {v8}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 292
    move-result-object v8

    .line 293
    goto :goto_9

    .line 294
    :cond_d
    move-object v8, v4

    .line 295
    .line 296
    .line 297
    :goto_9
    invoke-static {v8, v4, v10, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 298
    move-result-object v8

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosCost()Ljava/math/BigDecimal;

    .line 302
    move-result-object v12

    .line 303
    .line 304
    if-eqz v12, :cond_e

    .line 305
    .line 306
    .line 307
    invoke-static {v12}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 308
    move-result-object v12

    .line 309
    goto :goto_a

    .line 310
    :cond_e
    move-object v12, v4

    .line 311
    .line 312
    .line 313
    :goto_a
    invoke-static {v12, v4, v10, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 314
    move-result-object v12

    .line 315
    .line 316
    .line 317
    invoke-static {v1}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 318
    move-result-object v13

    .line 319
    .line 320
    .line 321
    invoke-virtual {v11, v5, v8, v12, v13}, Luk/c;->b(Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;

    .line 322
    move-result-object v5

    .line 323
    .line 324
    if-eqz v5, :cond_f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v5}, Lrk/b;->d()Ljava/math/BigDecimal;

    .line 328
    move-result-object v5

    .line 329
    .line 330
    if-eqz v5, :cond_f

    .line 331
    .line 332
    .line 333
    invoke-static {v5, v7, v10, v4}, Lcom/kubi/kumex/utils/k0;->d(Ljava/math/BigDecimal;ZILjava/lang/Object;)Ljava/lang/String;

    .line 334
    move-result-object v5

    .line 335
    goto :goto_b

    .line 336
    :cond_f
    move-object v5, v4

    .line 337
    .line 338
    .line 339
    :goto_b
    invoke-static {v5, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 340
    move-result-object v5

    .line 341
    .line 342
    .line 343
    invoke-virtual {v9}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse()Z

    .line 344
    move-result v7

    .line 345
    .line 346
    .line 347
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 348
    move-result-object v7

    .line 349
    .line 350
    .line 351
    invoke-static {v7}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 352
    move-result v12

    .line 353
    .line 354
    .line 355
    invoke-virtual {v9}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMultiplier()Ljava/math/BigDecimal;

    .line 356
    move-result-object v7

    .line 357
    .line 358
    if-eqz v7, :cond_10

    .line 359
    .line 360
    .line 361
    invoke-static {v7}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 362
    move-result-object v7

    .line 363
    goto :goto_c

    .line 364
    :cond_10
    move-object v7, v4

    .line 365
    .line 366
    .line 367
    :goto_c
    invoke-static {v7, v4, v10, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 368
    move-result-object v13

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getCurrentQty()Ljava/math/BigDecimal;

    .line 372
    move-result-object v7

    .line 373
    .line 374
    if-eqz v7, :cond_11

    .line 375
    .line 376
    .line 377
    invoke-static {v7}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 378
    move-result-object v7

    .line 379
    goto :goto_d

    .line 380
    :cond_11
    move-object v7, v4

    .line 381
    .line 382
    .line 383
    :goto_d
    invoke-static {v7, v4, v10, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 384
    move-result-object v14

    .line 385
    .line 386
    .line 387
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosCost()Ljava/math/BigDecimal;

    .line 388
    move-result-object v7

    .line 389
    .line 390
    if-eqz v7, :cond_12

    .line 391
    .line 392
    .line 393
    invoke-static {v7}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 394
    move-result-object v7

    .line 395
    goto :goto_e

    .line 396
    :cond_12
    move-object v7, v4

    .line 397
    .line 398
    .line 399
    :goto_e
    invoke-static {v7, v4, v10, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 400
    move-result-object v15

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosMargin()Ljava/math/BigDecimal;

    .line 404
    move-result-object v7

    .line 405
    .line 406
    if-eqz v7, :cond_13

    .line 407
    .line 408
    .line 409
    invoke-static {v7}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 410
    move-result-object v7

    .line 411
    goto :goto_f

    .line 412
    :cond_13
    move-object v7, v4

    .line 413
    .line 414
    .line 415
    :goto_f
    invoke-static {v7, v4, v10, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 416
    move-result-object v16

    .line 417
    .line 418
    .line 419
    invoke-virtual {v0, v2}, Lcom/kubi/futures/trade/position/vm/e2;->H(Lcom/kubi/kumex/data/trade/model/PositionEntity;)Ljava/math/BigDecimal;

    .line 420
    move-result-object v7

    .line 421
    .line 422
    .line 423
    invoke-static {v7}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 424
    move-result-object v17

    .line 425
    .line 426
    .line 427
    invoke-virtual {v9}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getTakerFeeRate()Ljava/math/BigDecimal;

    .line 428
    move-result-object v7

    .line 429
    .line 430
    if-eqz v7, :cond_14

    .line 431
    .line 432
    .line 433
    invoke-static {v7}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 434
    move-result-object v7

    .line 435
    goto :goto_10

    .line 436
    :cond_14
    move-object v7, v4

    .line 437
    .line 438
    .line 439
    :goto_10
    invoke-static {v7, v4, v10, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 440
    move-result-object v18

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 444
    move-result v7

    .line 445
    .line 446
    .line 447
    invoke-virtual {v0, v7}, Lcom/kubi/futures/trade/position/vm/e2;->G(Z)Ljava/math/BigDecimal;

    .line 448
    move-result-object v7

    .line 449
    .line 450
    .line 451
    invoke-static {v7}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 452
    move-result-object v19

    .line 453
    .line 454
    .line 455
    invoke-static {v1}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 456
    move-result-object v20

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v11 .. v20}, Luk/c;->c(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;

    .line 460
    move-result-object v7

    .line 461
    .line 462
    if-eqz v7, :cond_15

    .line 463
    .line 464
    .line 465
    invoke-virtual {v7}, Lrk/b;->d()Ljava/math/BigDecimal;

    .line 466
    move-result-object v7

    .line 467
    move-object v8, v7

    .line 468
    goto :goto_11

    .line 469
    :cond_15
    move-object v8, v4

    .line 470
    .line 471
    :goto_11
    iget-object v7, v0, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->b0:Landroidx/lifecycle/MutableLiveData;

    .line 472
    .line 473
    new-instance v10, Lcom/kubi/futures/trade/position/f3;

    .line 474
    .line 475
    sget-object v13, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 476
    .line 477
    .line 478
    invoke-static {v9}, Lfm/b;->c(Lcom/kubi/kumex/data/platform/model/ContractEntity;)I

    .line 479
    move-result v14

    .line 480
    .line 481
    const/16 v20, 0x60

    .line 482
    .line 483
    const/16 v21, 0x0

    .line 484
    const/4 v15, 0x1

    .line 485
    .line 486
    const/16 v16, 0x1

    .line 487
    .line 488
    const/16 v17, 0x1

    .line 489
    .line 490
    const/16 v18, 0x0

    .line 491
    .line 492
    const/16 v19, 0x0

    .line 493
    move-object v12, v6

    .line 494
    .line 495
    .line 496
    invoke-static/range {v12 .. v21}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 497
    move-result-object v6

    .line 498
    .line 499
    .line 500
    invoke-static {v6, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 501
    move-result-object v3

    .line 502
    move-object v6, v10

    .line 503
    .line 504
    if-eqz v8, :cond_16

    .line 505
    .line 506
    .line 507
    invoke-static {v2}, Lfm/d;->x(Lcom/kubi/kumex/data/trade/model/PositionEntity;)Ljava/lang/String;

    .line 508
    move-result-object v10

    .line 509
    .line 510
    const/16 v13, 0xc

    .line 511
    const/4 v14, 0x0

    .line 512
    const/4 v11, 0x0

    .line 513
    const/4 v12, 0x0

    .line 514
    .line 515
    .line 516
    invoke-static/range {v8 .. v14}, Lcom/kubi/kumex/utils/k0;->n(Ljava/math/BigDecimal;Lcom/kubi/kumex/data/platform/model/ContractEntity;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 517
    move-result-object v4

    .line 518
    .line 519
    .line 520
    :cond_16
    invoke-static {v4}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 521
    move-result-object v4

    .line 522
    .line 523
    .line 524
    invoke-virtual {v0, v1, v2, v9}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->b0(Ljava/math/BigDecimal;Lcom/kubi/kumex/data/trade/model/PositionEntity;Lcom/kubi/kumex/data/platform/model/ContractEntity;)Ljava/lang/String;

    .line 525
    move-result-object v1

    .line 526
    .line 527
    .line 528
    invoke-direct {v6, v3, v5, v4, v1}, Lcom/kubi/futures/trade/position/f3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v7, v6}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 532
    return-void

    .line 533
    .line 534
    :cond_17
    :goto_12
    iget-object v1, v0, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->b0:Landroidx/lifecycle/MutableLiveData;

    .line 535
    .line 536
    new-instance v2, Lcom/kubi/futures/trade/position/f3;

    .line 537
    .line 538
    .line 539
    invoke-direct {v2, v3, v3, v3, v3}, Lcom/kubi/futures/trade/position/f3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 543
    return-void
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
.end method

.method public final f0(Ljava/lang/String;ZLjava/math/BigDecimal;Ljava/lang/String;)V
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "symbol"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "margin"

    .line 8
    .line 9
    .line 10
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "positionSide"

    .line 13
    .line 14
    .line 15
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lem/a;->d()Lkotlinx/coroutines/CoroutineExceptionHandler;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v2}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    new-instance v3, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel$submitReduceMargin$1;

    .line 34
    const/4 v9, 0x0

    .line 35
    move-object v8, p0

    .line 36
    move-object v5, p1

    .line 37
    move v4, p2

    .line 38
    move-object v6, p3

    .line 39
    move-object v7, p4

    .line 40
    .line 41
    .line 42
    invoke-direct/range {v3 .. v9}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel$submitReduceMargin$1;-><init>(ZLjava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;Lkotlin/coroutines/Continuation;)V

    .line 43
    const/4 v5, 0x2

    .line 44
    const/4 v6, 0x0

    .line 45
    move-object v4, v3

    .line 46
    const/4 v3, 0x0

    .line 47
    .line 48
    .line 49
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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
.end method
