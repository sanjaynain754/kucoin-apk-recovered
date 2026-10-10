.class public final Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;
.super Lcom/kubi/futures/trade/position/vm/e2;
.source "AddMarginViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00162\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ(\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00082\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00162\u0008\u0008\u0001\u0010 \u001a\u00020\u0008J\u0016\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u001cJ\u000e\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u0008J\u0016\u0010&\u001a\u00020\u000b2\u0006\u0010\'\u001a\u00020\u0006H\u0082@\u00a2\u0006\u0002\u0010(R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082D\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR%\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f0\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\rR%\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f0\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\rR\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\rR\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"
    }
    d2 = {
        "Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;",
        "Lcom/kubi/futures/trade/position/vm/ModifyMarginViewModel;",
        "<init>",
        "()V",
        "unifyCalFlow",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/kubi/futures/trade/position/vm/FetchUnifyCalculateParams;",
        "tag",
        "",
        "afterPositionRender",
        "Landroidx/lifecycle/MutableLiveData;",
        "Lcom/kubi/futures/trade/position/PositionRenderInfo;",
        "getAfterPositionRender",
        "()Landroidx/lifecycle/MutableLiveData;",
        "submitResult",
        "Lkotlin/Pair;",
        "",
        "",
        "getSubmitResult",
        "submitAutoMargin",
        "getSubmitAutoMargin",
        "isolatedAvailableBalance",
        "Ljava/math/BigDecimal;",
        "getIsolatedAvailableBalance",
        "inputValue",
        "handleAddMargin",
        "",
        "position",
        "Lcom/kubi/kumex/data/trade/model/PositionEntity;",
        "submitMargin",
        "symbol",
        "isTrial",
        "positionSide",
        "submitAutoDepositMargin",
        "isOpen",
        "display",
        "observeIsolatedAvailableBalance",
        "currency",
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
        "SMAP\nAddMarginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddMarginViewModel.kt\ncom/kubi/futures/trade/position/vm/AddMarginViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,356:1\n1#2:357\n*E\n"
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

.field public final a0:Ljava/lang/String;
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

.field public final d0:Landroidx/lifecycle/MutableLiveData;
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

.field public final e0:Landroidx/lifecycle/MutableLiveData;
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

.field public f0:Ljava/math/BigDecimal;
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
    iput-object v0, p0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->Z:Lkotlinx/coroutines/flow/n;

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
    new-instance v4, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel$1;

    .line 33
    const/4 v0, 0x0

    .line 34
    .line 35
    .line 36
    invoke-direct {v4, p0, v0}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel$1;-><init>(Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;Lkotlin/coroutines/Continuation;)V

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
    const-string v0, "AddMarginViewModel"

    .line 44
    .line 45
    iput-object v0, p0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->a0:Ljava/lang/String;

    .line 46
    .line 47
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 48
    .line 49
    .line 50
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 51
    .line 52
    iput-object v0, p0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->b0:Landroidx/lifecycle/MutableLiveData;

    .line 53
    .line 54
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 55
    .line 56
    .line 57
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 58
    .line 59
    iput-object v0, p0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->c0:Landroidx/lifecycle/MutableLiveData;

    .line 60
    .line 61
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 62
    .line 63
    .line 64
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 65
    .line 66
    iput-object v0, p0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->d0:Landroidx/lifecycle/MutableLiveData;

    .line 67
    .line 68
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 69
    .line 70
    .line 71
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 72
    .line 73
    iput-object v0, p0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->e0:Landroidx/lifecycle/MutableLiveData;

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

.method public static synthetic P(Lcom/kubi/futures/trade/position/vm/c0;)Lcm/r;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->Y(Lcom/kubi/futures/trade/position/vm/c0;)Lcm/r;

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

.method public static synthetic Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->i0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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
.end method

.method public static synthetic R(Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;Ljava/lang/String;Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->f0(Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;Ljava/lang/String;Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;)Lkotlin/Unit;

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

.method public static synthetic S(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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
.end method

.method public static synthetic T(Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->h0(Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;Ljava/lang/Throwable;)Lkotlin/Unit;

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
.end method

.method public static final synthetic U(Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;Lcom/kubi/futures/trade/position/vm/c0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->X(Lcom/kubi/futures/trade/position/vm/c0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

.method public static final synthetic V(Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->a0:Ljava/lang/String;

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

.method public static final synthetic W(Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;)Lkotlinx/coroutines/flow/n;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->Z:Lkotlinx/coroutines/flow/n;

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

.method public static final Y(Lcom/kubi/futures/trade/position/vm/c0;)Lcm/r;
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
    invoke-static/range {v3 .. v9}, Lug/c;->h1(Lug/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcm/r;

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

.method public static final f0(Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;Ljava/lang/String;Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;)Lkotlin/Unit;
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
    new-instance v3, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel$observeIsolatedAvailableBalance$2$1;

    .line 11
    const/4 p2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct {v3, p1, p0, p2}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel$observeIsolatedAvailableBalance$2$1;-><init>(Ljava/lang/String;Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;Lkotlin/coroutines/Continuation;)V

    .line 15
    const/4 v4, 0x2

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

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

.method public static final g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
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
.end method

.method public static final h0(Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/kumex/utils/v;->a:Lcom/kubi/kumex/utils/v;

    .line 3
    .line 4
    iget-object p0, p0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->a0:Ljava/lang/String;

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    const-string v2, "observeIsolatedAvailableBalance ws error: "

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0, p1}, Lcom/kubi/kumex/utils/v;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 31
    return-object p0
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
.end method

.method public static final i0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
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
.end method


# virtual methods
.method public final X(Lcom/kubi/futures/trade/position/vm/c0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    instance-of v2, v1, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel$fetchUnifyCalculateResult$1;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    move-object v2, v1

    .line 10
    .line 11
    check-cast v2, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel$fetchUnifyCalculateResult$1;

    .line 12
    .line 13
    iget v3, v2, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel$fetchUnifyCalculateResult$1;->label:I

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
    iput v3, v2, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel$fetchUnifyCalculateResult$1;->label:I

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
    new-instance v2, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel$fetchUnifyCalculateResult$1;

    .line 29
    .line 30
    move-object/from16 v3, p0

    .line 31
    .line 32
    .line 33
    invoke-direct {v2, v3, v1}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel$fetchUnifyCalculateResult$1;-><init>(Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;Lkotlin/coroutines/Continuation;)V

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :goto_1
    iget-object v1, v7, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel$fetchUnifyCalculateResult$1;->result:Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    iget v4, v7, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel$fetchUnifyCalculateResult$1;->label:I

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
    iget-object v0, v7, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel$fetchUnifyCalculateResult$1;->L$0:Ljava/lang/Object;

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
    new-instance v6, Lcom/kubi/futures/trade/position/vm/e;

    .line 105
    .line 106
    .line 107
    invoke-direct {v6, v0}, Lcom/kubi/futures/trade/position/vm/e;-><init>(Lcom/kubi/futures/trade/position/vm/c0;)V

    .line 108
    .line 109
    iput-object v0, v7, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel$fetchUnifyCalculateResult$1;->L$0:Ljava/lang/Object;

    .line 110
    .line 111
    iput v10, v7, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel$fetchUnifyCalculateResult$1;->label:I

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
    invoke-virtual {v2, v4}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

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

.method public final Z()Landroidx/lifecycle/MutableLiveData;
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
    iget-object v0, p0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->b0:Landroidx/lifecycle/MutableLiveData;

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

.method public final a0()Landroidx/lifecycle/MutableLiveData;
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
    iget-object v0, p0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->e0:Landroidx/lifecycle/MutableLiveData;

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

.method public final b0()Landroidx/lifecycle/MutableLiveData;
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
    iget-object v0, p0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->d0:Landroidx/lifecycle/MutableLiveData;

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

.method public final c0()Landroidx/lifecycle/MutableLiveData;
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
    iget-object v0, p0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->c0:Landroidx/lifecycle/MutableLiveData;

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

.method public final d0(Ljava/math/BigDecimal;Lcom/kubi/kumex/data/trade/model/PositionEntity;)V
    .locals 26
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
    move-object/from16 v1, p2

    .line 5
    .line 6
    sget-object v2, Lcom/kubi/broker/BrokerConfig;->a:Lcom/kubi/broker/BrokerConfig;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v2}, Lcom/kubi/broker/BrokerConfig;->d()Lcom/kubi/broker/f;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    .line 13
    invoke-interface {v2}, Lcom/kubi/broker/f;->x()Lcom/kubi/broker/MultiBizType;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    sget-object v3, Lcom/kubi/broker/MultiBizType;->UNIFIED:Lcom/kubi/broker/MultiBizType;

    .line 17
    const/4 v4, 0x0

    .line 18
    .line 19
    if-ne v2, v3, :cond_3

    .line 20
    .line 21
    iget-object v9, v0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->Z:Lkotlinx/coroutines/flow/n;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSymbol()Ljava/lang/String;

    .line 27
    move-result-object v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v2, v4

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosMargin()Ljava/math/BigDecimal;

    .line 39
    move-result-object v3

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move-object v3, v4

    .line 42
    .line 43
    :goto_1
    if-eqz v1, :cond_2

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPositionSide()Ljava/lang/String;

    .line 47
    move-result-object v4

    .line 48
    .line 49
    :cond_2
    const-string v1, "BOTH"

    .line 50
    .line 51
    .line 52
    invoke-static {v4, v1}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    move-result-object v5

    .line 54
    .line 55
    new-instance v1, Lcom/kubi/futures/trade/position/vm/c0;

    .line 56
    .line 57
    const/16 v7, 0x10

    .line 58
    const/4 v8, 0x0

    .line 59
    const/4 v6, 0x0

    .line 60
    .line 61
    move-object/from16 v4, p1

    .line 62
    .line 63
    .line 64
    invoke-direct/range {v1 .. v8}, Lcom/kubi/futures/trade/position/vm/c0;-><init>(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v9, v1}, Lkotlinx/coroutines/flow/m;->d(Ljava/lang/Object;)Z

    .line 68
    return-void

    .line 69
    .line 70
    :cond_3
    move-object/from16 v2, p1

    .line 71
    .line 72
    iget-object v3, v0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->f0:Ljava/math/BigDecimal;

    .line 73
    .line 74
    if-nez v3, :cond_4

    .line 75
    .line 76
    if-nez v2, :cond_4

    .line 77
    return-void

    .line 78
    .line 79
    :cond_4
    iput-object v2, v0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->f0:Ljava/math/BigDecimal;

    .line 80
    .line 81
    sget-object v3, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 85
    move-result-object v3

    .line 86
    .line 87
    if-eqz v1, :cond_5

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSymbol()Ljava/lang/String;

    .line 91
    move-result-object v5

    .line 92
    goto :goto_2

    .line 93
    :cond_5
    move-object v5, v4

    .line 94
    .line 95
    .line 96
    :goto_2
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    move-result-object v5

    .line 98
    const/4 v6, 0x0

    .line 99
    const/4 v7, 0x2

    .line 100
    .line 101
    .line 102
    invoke-static {v3, v5, v6, v7, v4}, Lth/d;->O(Lth/d;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 103
    move-result-object v9

    .line 104
    .line 105
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 106
    .line 107
    sget v5, Lcom/kubi/kumex/R$string;->stub:I

    .line 108
    .line 109
    new-array v8, v6, [Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, v5, v8}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 113
    move-result-object v3

    .line 114
    .line 115
    if-eqz v2, :cond_16

    .line 116
    .line 117
    sget-object v5, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v5}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 121
    move-result v5

    .line 122
    .line 123
    if-eqz v5, :cond_16

    .line 124
    .line 125
    if-eqz v1, :cond_16

    .line 126
    .line 127
    if-nez v9, :cond_6

    .line 128
    .line 129
    goto/16 :goto_11

    .line 130
    .line 131
    :cond_6
    sget-object v5, Luk/b;->a:Luk/b;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v9}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse()Z

    .line 135
    move-result v8

    .line 136
    .line 137
    .line 138
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 139
    move-result-object v8

    .line 140
    .line 141
    .line 142
    invoke-static {v8}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 143
    move-result v8

    .line 144
    .line 145
    .line 146
    invoke-virtual {v9}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMultiplier()Ljava/math/BigDecimal;

    .line 147
    move-result-object v10

    .line 148
    .line 149
    if-eqz v10, :cond_7

    .line 150
    .line 151
    .line 152
    invoke-static {v10}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 153
    move-result-object v10

    .line 154
    goto :goto_3

    .line 155
    :cond_7
    move-object v10, v4

    .line 156
    :goto_3
    const/4 v11, 0x1

    .line 157
    .line 158
    .line 159
    invoke-static {v10, v4, v11, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 160
    move-result-object v10

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getMarkPrice()Ljava/math/BigDecimal;

    .line 164
    move-result-object v12

    .line 165
    .line 166
    if-eqz v12, :cond_8

    .line 167
    .line 168
    .line 169
    invoke-static {v12}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 170
    move-result-object v12

    .line 171
    goto :goto_4

    .line 172
    :cond_8
    move-object v12, v4

    .line 173
    .line 174
    .line 175
    :goto_4
    invoke-static {v12, v4, v11, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 176
    move-result-object v12

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getCurrentQty()Ljava/math/BigDecimal;

    .line 180
    move-result-object v13

    .line 181
    .line 182
    if-eqz v13, :cond_9

    .line 183
    .line 184
    .line 185
    invoke-static {v13}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 186
    move-result-object v13

    .line 187
    goto :goto_5

    .line 188
    :cond_9
    move-object v13, v4

    .line 189
    .line 190
    .line 191
    :goto_5
    invoke-static {v13, v4, v11, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 192
    move-result-object v13

    .line 193
    .line 194
    .line 195
    invoke-virtual {v5, v8, v10, v12, v13}, Luk/b;->g(ZLrk/b;Lrk/b;Lrk/b;)Lrk/b;

    .line 196
    move-result-object v5

    .line 197
    .line 198
    .line 199
    invoke-static {v5, v4, v11, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 200
    move-result-object v5

    .line 201
    .line 202
    .line 203
    invoke-virtual {v5}, Lrk/b;->d()Ljava/math/BigDecimal;

    .line 204
    move-result-object v5

    .line 205
    .line 206
    sget-object v12, Luk/c;->a:Luk/c;

    .line 207
    .line 208
    .line 209
    invoke-static {v5}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 210
    move-result-object v8

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosMargin()Ljava/math/BigDecimal;

    .line 214
    move-result-object v10

    .line 215
    .line 216
    if-eqz v10, :cond_a

    .line 217
    .line 218
    .line 219
    invoke-static {v10}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 220
    move-result-object v10

    .line 221
    goto :goto_6

    .line 222
    :cond_a
    move-object v10, v4

    .line 223
    .line 224
    .line 225
    :goto_6
    invoke-static {v10, v4, v11, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 226
    move-result-object v10

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosCost()Ljava/math/BigDecimal;

    .line 230
    move-result-object v13

    .line 231
    .line 232
    if-eqz v13, :cond_b

    .line 233
    .line 234
    .line 235
    invoke-static {v13}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 236
    move-result-object v13

    .line 237
    goto :goto_7

    .line 238
    :cond_b
    move-object v13, v4

    .line 239
    .line 240
    .line 241
    :goto_7
    invoke-static {v13, v4, v11, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 242
    move-result-object v13

    .line 243
    .line 244
    .line 245
    invoke-static {v2}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 246
    move-result-object v14

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12, v8, v10, v13, v14}, Luk/c;->e(Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;

    .line 250
    move-result-object v8

    .line 251
    .line 252
    .line 253
    invoke-static {v8, v4, v11, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 254
    move-result-object v8

    .line 255
    .line 256
    .line 257
    invoke-virtual {v8}, Lrk/b;->d()Ljava/math/BigDecimal;

    .line 258
    move-result-object v8

    .line 259
    .line 260
    .line 261
    invoke-static {v5}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 262
    move-result-object v5

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosMargin()Ljava/math/BigDecimal;

    .line 266
    move-result-object v10

    .line 267
    .line 268
    if-eqz v10, :cond_c

    .line 269
    .line 270
    .line 271
    invoke-static {v10}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 272
    move-result-object v10

    .line 273
    goto :goto_8

    .line 274
    :cond_c
    move-object v10, v4

    .line 275
    .line 276
    .line 277
    :goto_8
    invoke-static {v10, v4, v11, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 278
    move-result-object v10

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosCost()Ljava/math/BigDecimal;

    .line 282
    move-result-object v13

    .line 283
    .line 284
    if-eqz v13, :cond_d

    .line 285
    .line 286
    .line 287
    invoke-static {v13}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 288
    move-result-object v13

    .line 289
    goto :goto_9

    .line 290
    :cond_d
    move-object v13, v4

    .line 291
    .line 292
    .line 293
    :goto_9
    invoke-static {v13, v4, v11, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 294
    move-result-object v13

    .line 295
    .line 296
    .line 297
    invoke-static {v2}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 298
    move-result-object v14

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12, v5, v10, v13, v14}, Luk/c;->b(Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;

    .line 302
    move-result-object v5

    .line 303
    .line 304
    if-eqz v5, :cond_e

    .line 305
    .line 306
    .line 307
    invoke-virtual {v5}, Lrk/b;->d()Ljava/math/BigDecimal;

    .line 308
    move-result-object v5

    .line 309
    .line 310
    if-eqz v5, :cond_e

    .line 311
    .line 312
    .line 313
    invoke-static {v5, v6, v11, v4}, Lcom/kubi/kumex/utils/k0;->d(Ljava/math/BigDecimal;ZILjava/lang/Object;)Ljava/lang/String;

    .line 314
    move-result-object v5

    .line 315
    goto :goto_a

    .line 316
    :cond_e
    move-object v5, v4

    .line 317
    .line 318
    .line 319
    :goto_a
    invoke-static {v5, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 320
    move-result-object v3

    .line 321
    .line 322
    .line 323
    invoke-virtual {v9}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse()Z

    .line 324
    move-result v5

    .line 325
    .line 326
    .line 327
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 328
    move-result-object v5

    .line 329
    .line 330
    .line 331
    invoke-static {v5}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 332
    move-result v13

    .line 333
    .line 334
    .line 335
    invoke-virtual {v9}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getMultiplier()Ljava/math/BigDecimal;

    .line 336
    move-result-object v5

    .line 337
    .line 338
    if-eqz v5, :cond_f

    .line 339
    .line 340
    .line 341
    invoke-static {v5}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 342
    move-result-object v5

    .line 343
    goto :goto_b

    .line 344
    :cond_f
    move-object v5, v4

    .line 345
    .line 346
    .line 347
    :goto_b
    invoke-static {v5, v4, v11, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 348
    move-result-object v14

    .line 349
    .line 350
    .line 351
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getCurrentQty()Ljava/math/BigDecimal;

    .line 352
    move-result-object v5

    .line 353
    .line 354
    if-eqz v5, :cond_10

    .line 355
    .line 356
    .line 357
    invoke-static {v5}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 358
    move-result-object v5

    .line 359
    goto :goto_c

    .line 360
    :cond_10
    move-object v5, v4

    .line 361
    .line 362
    .line 363
    :goto_c
    invoke-static {v5, v4, v11, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 364
    move-result-object v15

    .line 365
    .line 366
    .line 367
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosCost()Ljava/math/BigDecimal;

    .line 368
    move-result-object v5

    .line 369
    .line 370
    if-eqz v5, :cond_11

    .line 371
    .line 372
    .line 373
    invoke-static {v5}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 374
    move-result-object v5

    .line 375
    goto :goto_d

    .line 376
    :cond_11
    move-object v5, v4

    .line 377
    .line 378
    .line 379
    :goto_d
    invoke-static {v5, v4, v11, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 380
    move-result-object v16

    .line 381
    .line 382
    .line 383
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPosMargin()Ljava/math/BigDecimal;

    .line 384
    move-result-object v5

    .line 385
    .line 386
    if-eqz v5, :cond_12

    .line 387
    .line 388
    .line 389
    invoke-static {v5}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 390
    move-result-object v5

    .line 391
    goto :goto_e

    .line 392
    :cond_12
    move-object v5, v4

    .line 393
    .line 394
    .line 395
    :goto_e
    invoke-static {v5, v4, v11, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 396
    move-result-object v17

    .line 397
    .line 398
    .line 399
    invoke-virtual {v0, v1}, Lcom/kubi/futures/trade/position/vm/e2;->H(Lcom/kubi/kumex/data/trade/model/PositionEntity;)Ljava/math/BigDecimal;

    .line 400
    move-result-object v5

    .line 401
    .line 402
    .line 403
    invoke-static {v5}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 404
    move-result-object v18

    .line 405
    .line 406
    .line 407
    invoke-virtual {v9}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getTakerFeeRate()Ljava/math/BigDecimal;

    .line 408
    move-result-object v5

    .line 409
    .line 410
    if-eqz v5, :cond_13

    .line 411
    .line 412
    .line 413
    invoke-static {v5}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 414
    move-result-object v5

    .line 415
    goto :goto_f

    .line 416
    :cond_13
    move-object v5, v4

    .line 417
    .line 418
    .line 419
    :goto_f
    invoke-static {v5, v4, v11, v4}, Lrk/c;->b(Lrk/b;Ljava/lang/String;ILjava/lang/Object;)Lrk/b;

    .line 420
    move-result-object v19

    .line 421
    .line 422
    .line 423
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 424
    move-result v5

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0, v5}, Lcom/kubi/futures/trade/position/vm/e2;->G(Z)Ljava/math/BigDecimal;

    .line 428
    move-result-object v5

    .line 429
    .line 430
    .line 431
    invoke-static {v5}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 432
    move-result-object v20

    .line 433
    .line 434
    .line 435
    invoke-static {v2}, Lrk/c;->c(Ljava/math/BigDecimal;)Lrk/b;

    .line 436
    move-result-object v21

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v12 .. v21}, Luk/c;->c(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;

    .line 440
    move-result-object v2

    .line 441
    .line 442
    if-eqz v2, :cond_14

    .line 443
    .line 444
    .line 445
    invoke-virtual {v2}, Lrk/b;->d()Ljava/math/BigDecimal;

    .line 446
    move-result-object v2

    .line 447
    goto :goto_10

    .line 448
    :cond_14
    move-object v2, v4

    .line 449
    .line 450
    :goto_10
    iget-object v5, v0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->b0:Landroidx/lifecycle/MutableLiveData;

    .line 451
    .line 452
    new-instance v6, Lcom/kubi/futures/trade/position/f3;

    .line 453
    .line 454
    .line 455
    invoke-static {v9}, Lfm/b;->c(Lcom/kubi/kumex/data/platform/model/ContractEntity;)I

    .line 456
    move-result v15

    .line 457
    .line 458
    sget-object v14, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 459
    .line 460
    const/16 v21, 0x60

    .line 461
    .line 462
    const/16 v22, 0x0

    .line 463
    .line 464
    const/16 v16, 0x1

    .line 465
    .line 466
    const/16 v17, 0x1

    .line 467
    .line 468
    const/16 v18, 0x1

    .line 469
    .line 470
    const/16 v19, 0x0

    .line 471
    .line 472
    const/16 v20, 0x0

    .line 473
    move-object v13, v8

    .line 474
    .line 475
    .line 476
    invoke-static/range {v13 .. v22}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 477
    move-result-object v15

    .line 478
    .line 479
    move-object/from16 v17, v14

    .line 480
    .line 481
    if-eqz v2, :cond_15

    .line 482
    .line 483
    .line 484
    invoke-static {v1}, Lfm/d;->x(Lcom/kubi/kumex/data/trade/model/PositionEntity;)Ljava/lang/String;

    .line 485
    move-result-object v10

    .line 486
    .line 487
    const/16 v13, 0xc

    .line 488
    const/4 v14, 0x0

    .line 489
    const/4 v11, 0x0

    .line 490
    const/4 v12, 0x0

    .line 491
    move-object v8, v2

    .line 492
    .line 493
    .line 494
    invoke-static/range {v8 .. v14}, Lcom/kubi/kumex/utils/k0;->n(Ljava/math/BigDecimal;Lcom/kubi/kumex/data/platform/model/ContractEntity;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 495
    move-result-object v4

    .line 496
    .line 497
    .line 498
    :cond_15
    invoke-static {v4}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 499
    move-result-object v2

    .line 500
    .line 501
    .line 502
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getAvgEntryPrice()Ljava/math/BigDecimal;

    .line 503
    move-result-object v1

    .line 504
    .line 505
    .line 506
    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 507
    move-result-object v16

    .line 508
    .line 509
    .line 510
    invoke-static {v9}, Lfm/b;->h(Lcom/kubi/kumex/data/platform/model/ContractEntity;)I

    .line 511
    move-result v1

    .line 512
    .line 513
    .line 514
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 515
    move-result-object v1

    .line 516
    .line 517
    .line 518
    invoke-static {v1, v7}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 519
    move-result v18

    .line 520
    .line 521
    const/16 v24, 0x60

    .line 522
    .line 523
    const/16 v25, 0x0

    .line 524
    .line 525
    const/16 v19, 0x1

    .line 526
    .line 527
    const/16 v20, 0x1

    .line 528
    .line 529
    const/16 v21, 0x1

    .line 530
    .line 531
    const/16 v22, 0x0

    .line 532
    .line 533
    const/16 v23, 0x0

    .line 534
    .line 535
    .line 536
    invoke-static/range {v16 .. v25}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 537
    move-result-object v1

    .line 538
    .line 539
    .line 540
    invoke-direct {v6, v15, v3, v2, v1}, Lcom/kubi/futures/trade/position/f3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v5, v6}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 544
    return-void

    .line 545
    .line 546
    :cond_16
    :goto_11
    iget-object v1, v0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->b0:Landroidx/lifecycle/MutableLiveData;

    .line 547
    .line 548
    new-instance v2, Lcom/kubi/futures/trade/position/f3;

    .line 549
    .line 550
    .line 551
    invoke-direct {v2, v3, v3, v3, v3}, Lcom/kubi/futures/trade/position/f3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 555
    return-void
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

.method public final e0(Ljava/lang/String;)V
    .locals 13
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "currency"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    new-instance v4, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel$observeIsolatedAvailableBalance$1;

    .line 16
    const/4 v0, 0x0

    .line 17
    .line 18
    .line 19
    invoke-direct {v4, p1, p0, v0}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel$observeIsolatedAvailableBalance$1;-><init>(Ljava/lang/String;Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;Lkotlin/coroutines/Continuation;)V

    .line 20
    const/4 v5, 0x2

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    .line 24
    .line 25
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 26
    .line 27
    sget-object v7, Lcom/kubi/broker/m;->a:Lcom/kubi/broker/m;

    .line 28
    const/4 v11, 0x4

    .line 29
    const/4 v12, 0x0

    .line 30
    const/4 v9, 0x0

    .line 31
    const/4 v10, 0x0

    .line 32
    move-object v8, p1

    .line 33
    .line 34
    .line 35
    invoke-static/range {v7 .. v12}, Lcom/kubi/broker/m;->F(Lcom/kubi/broker/m;Ljava/lang/String;ZLcom/kubi/broker/MultiBizType;ILjava/lang/Object;)Lio/reactivex/Observable;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lo00/f;->f()Lio/reactivex/Scheduler;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    new-instance v0, Lcom/kubi/futures/trade/position/vm/a;

    .line 47
    .line 48
    .line 49
    invoke-direct {v0, p0, v8}, Lcom/kubi/futures/trade/position/vm/a;-><init>(Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;Ljava/lang/String;)V

    .line 50
    .line 51
    new-instance v1, Lcom/kubi/futures/trade/position/vm/b;

    .line 52
    .line 53
    .line 54
    invoke-direct {v1, v0}, Lcom/kubi/futures/trade/position/vm/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 55
    .line 56
    new-instance v0, Lcom/kubi/futures/trade/position/vm/c;

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, p0}, Lcom/kubi/futures/trade/position/vm/c;-><init>(Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;)V

    .line 60
    .line 61
    new-instance v2, Lcom/kubi/futures/trade/position/vm/d;

    .line 62
    .line 63
    .line 64
    invoke-direct {v2, v0}, Lcom/kubi/futures/trade/position/vm/d;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    const-string v0, "subscribe(...)"

    .line 71
    .line 72
    .line 73
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/kubi/sdk/h2;->n()Lio/reactivex/disposables/CompositeDisposable;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    .line 80
    invoke-static {p1, v0}, Lio/reactivex/rxkotlin/DisposableKt;->addTo(Lio/reactivex/disposables/Disposable;Lio/reactivex/disposables/CompositeDisposable;)Lio/reactivex/disposables/Disposable;

    .line 81
    return-void
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

.method public final j0(ZLcom/kubi/kumex/data/trade/model/PositionEntity;)V
    .locals 7
    .param p2    # Lcom/kubi/kumex/data/trade/model/PositionEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "display"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    new-instance v4, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel$submitAutoDepositMargin$1;

    .line 16
    const/4 v0, 0x0

    .line 17
    .line 18
    .line 19
    invoke-direct {v4, p2, p1, p0, v0}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel$submitAutoDepositMargin$1;-><init>(Lcom/kubi/kumex/data/trade/model/PositionEntity;ZLcom/kubi/futures/trade/position/vm/AddMarginViewModel;Lkotlin/coroutines/Continuation;)V

    .line 20
    const/4 v5, 0x2

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    .line 24
    .line 25
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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
.end method

.method public final l0(Ljava/lang/String;ZLjava/math/BigDecimal;Ljava/lang/String;)V
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
    const-string v0, "inputValue"

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
    new-instance v3, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel$submitMargin$1;

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
    invoke-direct/range {v3 .. v9}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel$submitMargin$1;-><init>(ZLjava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;Lkotlin/coroutines/Continuation;)V

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
