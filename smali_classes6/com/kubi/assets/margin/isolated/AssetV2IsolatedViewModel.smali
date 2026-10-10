.class public final Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;
.super Lcom/kubi/mvi/state/BaseStateVM;
.source "AssetV2IsolatedViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/mvi/state/BaseStateVM<",
        "Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;",
        "Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0095@\u00a2\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0013H\u0002R#\u0010\u0006\u001a\n \u0008*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00038TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;",
        "Lcom/kubi/mvi/state/BaseStateVM;",
        "Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;",
        "Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;",
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
        "(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "checkSameCurrency",
        "checkSame",
        "",
        "initState",
        "getInitState",
        "()Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;",
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
        "SMAP\nAssetV2IsolatedViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2IsolatedViewModel.kt\ncom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n126#2,2:131\n126#2,2:133\n774#3:135\n865#3,2:136\n25#4:138\n26#4:140\n1#5:139\n*S KotlinDebug\n*F\n+ 1 AssetV2IsolatedViewModel.kt\ncom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel\n*L\n38#1:131,2\n60#1:133,2\n63#1:135\n63#1:136,2\n102#1:138\n102#1:140\n102#1:139\n*E\n"
    }
.end annotation


# instance fields
.field public final V:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/mvi/state/BaseStateVM;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/assets/margin/isolated/c0;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/assets/margin/isolated/c0;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;->V:Lkotlin/Lazy;

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

.method public static final A(Ljava/util/List;Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;)Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;
    .locals 10

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const/16 v8, 0x37

    .line 8
    const/4 v9, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    move-object v5, p0

    .line 15
    move-object v1, p1

    .line 16
    .line 17
    .line 18
    invoke-static/range {v1 .. v9}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;->copy$default(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;Ljava/util/List;ZZLjava/util/List;Ljava/lang/String;Lcom/kubi/assets/entity/MarginPnlEntity;ILjava/lang/Object;)Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;

    .line 19
    move-result-object p0

    .line 20
    return-object p0
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

.method public static final B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
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

.method public static final C(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    sget-object p1, Lcom/kubi/mvi/event/SingleEvent$c;->b:Lcom/kubi/mvi/event/SingleEvent$c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->sendSingleEvent(Ldr/a;)V

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p0
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

.method public static final D(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
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

.method public static final E(Ljava/util/List;Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;)Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;
    .locals 9

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    check-cast p1, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideSmallOrFilter;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideSmallOrFilter;->getChecked()Z

    .line 11
    move-result v3

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideSmallOrFilter;->getKeyword()Ljava/lang/String;

    .line 15
    move-result-object v5

    .line 16
    .line 17
    const/16 v7, 0x2a

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v6, 0x0

    .line 22
    move-object v1, p0

    .line 23
    move-object v0, p2

    .line 24
    .line 25
    .line 26
    invoke-static/range {v0 .. v8}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;->copy$default(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;Ljava/util/List;ZZLjava/util/List;Ljava/lang/String;Lcom/kubi/assets/entity/MarginPnlEntity;ILjava/lang/Object;)Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;

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

.method private final F()Lcom/kubi/assets/h0;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;->V:Lkotlin/Lazy;

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

.method public static synthetic b(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;->C(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;Ljava/lang/Throwable;)Lkotlin/Unit;

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

.method public static synthetic d(Ljava/util/List;Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;)Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;->A(Ljava/util/List;Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;)Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;

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

.method public static synthetic e(Ljava/util/List;Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;)Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;->E(Ljava/util/List;Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;)Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;

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

.method public static synthetic f(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;)Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;->y(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;)Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;

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
    invoke-static {}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;->t()Lcom/kubi/assets/h0;

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

.method public static synthetic o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;->B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;->D(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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

.method public static synthetic q(Ljava/lang/String;Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;)Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;->w(Ljava/lang/String;Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;)Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;

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

.method public static synthetic r(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;Lcom/kubi/margin/api/entity/IsolateMarginPosition;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;->z(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;Lcom/kubi/margin/api/entity/IsolateMarginPosition;)Lkotlin/Unit;

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

.method public static final synthetic s(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;Lkotlin/jvm/functions/Function1;)Z
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

.method private static final t()Lcom/kubi/assets/h0;
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

.method private final u(Z)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/assets/service/a;->a:Lcom/kubi/assets/service/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/assets/service/a;->j()Lcom/kubi/user/api/IUserService;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lcom/kubi/user/api/IUserService;->d0()Lcom/kubi/user/model/LoginUserEntity;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kubi/user/model/LoginUserEntity;->getBalanceCurrency()Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;->getMarginPnlEntity()Lcom/kubi/assets/entity/MarginPnlEntity;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    check-cast v1, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;->getMarginPnlEntity()Lcom/kubi/assets/entity/MarginPnlEntity;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Lcom/kubi/assets/entity/MarginPnlEntity;->getBaseCurrency()Ljava/lang/String;

    .line 42
    move-result-object v1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v1, 0x0

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    move-result v1

    .line 49
    .line 50
    if-nez v1, :cond_1

    .line 51
    const/4 v1, 0x1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const/4 v1, 0x0

    .line 54
    .line 55
    :goto_1
    if-eqz p1, :cond_3

    .line 56
    .line 57
    if-eqz v1, :cond_2

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    return-void

    .line 60
    .line 61
    :cond_3
    :goto_2
    new-instance p1, Lcom/kubi/assets/margin/isolated/e0;

    .line 62
    .line 63
    .line 64
    invoke-direct {p1, v0}, Lcom/kubi/assets/margin/isolated/e0;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 68
    return-void
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

.method public static synthetic v(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    const/4 p3, 0x1

    .line 2
    and-int/2addr p2, p3

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    move p1, p3

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-direct {p0, p1}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;->u(Z)V

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

.method public static final w(Ljava/lang/String;Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;)Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;
    .locals 10

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/assets/entity/MarginPnlEntity;

    .line 8
    .line 9
    const/16 v7, 0x13

    .line 10
    const/4 v8, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    const-string v4, "ISOLATED"

    .line 15
    const/4 v6, 0x0

    .line 16
    move-object v5, p0

    .line 17
    .line 18
    .line 19
    invoke-direct/range {v1 .. v8}, Lcom/kubi/assets/entity/MarginPnlEntity;-><init>(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    .line 21
    const/16 v8, 0x1f

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    move-object v7, v1

    .line 27
    move-object v1, p1

    .line 28
    .line 29
    .line 30
    invoke-static/range {v1 .. v9}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;->copy$default(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;Ljava/util/List;ZZLjava/util/List;Ljava/lang/String;Lcom/kubi/assets/entity/MarginPnlEntity;ILjava/lang/Object;)Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;

    .line 31
    move-result-object p0

    .line 32
    return-object p0
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

.method public static final y(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;)Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;
    .locals 9

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    check-cast p0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideOrShowNumber;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideOrShowNumber;->isChecked()Z

    .line 11
    move-result v2

    .line 12
    .line 13
    const/16 v7, 0x3d

    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    move-object v0, p1

    .line 21
    .line 22
    .line 23
    invoke-static/range {v0 .. v8}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;->copy$default(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;Ljava/util/List;ZZLjava/util/List;Ljava/lang/String;Lcom/kubi/assets/entity/MarginPnlEntity;ILjava/lang/Object;)Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;

    .line 24
    move-result-object p0

    .line 25
    return-object p0
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

.method public static final z(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;Lcom/kubi/margin/api/entity/IsolateMarginPosition;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/IsolateMarginPosition;->getPositions()Ljava/util/List;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;->getIsolatedAssetsSourceList()Ljava/util/List;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :cond_0
    sget-object v0, Lcom/kubi/mvi/event/SingleEvent$c;->b:Lcom/kubi/mvi/event/SingleEvent$c;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateVM;->sendSingleEvent(Ldr/a;)V

    .line 31
    .line 32
    :cond_1
    :goto_0
    new-instance v0, Lcom/kubi/assets/margin/isolated/d0;

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, p1}, Lcom/kubi/assets/margin/isolated/d0;-><init>(Ljava/util/List;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 39
    .line 40
    :cond_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 41
    return-object p0
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


# virtual methods
.method public G()Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;
    .locals 9
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;

    .line 3
    .line 4
    const/16 v7, 0x3f

    .line 5
    const/4 v8, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct/range {v0 .. v8}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;-><init>(Ljava/util/List;ZZLjava/util/List;Ljava/lang/String;Lcom/kubi/assets/entity/MarginPnlEntity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 15
    return-object v0
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

.method public bridge synthetic dispatchIntentOnIO(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;->x(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method public bridge synthetic getInitState()Lcom/kubi/mvi/state/f;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;->G()Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;

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

.method public x(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .param p1    # Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult",
            "KCCyclomaticComplexityCheck"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;",
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
    instance-of v0, p2, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel$dispatchIntentOnIO$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel$dispatchIntentOnIO$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel$dispatchIntentOnIO$1;->label:I

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
    iput v1, v0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel$dispatchIntentOnIO$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel$dispatchIntentOnIO$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel$dispatchIntentOnIO$1;-><init>(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel$dispatchIntentOnIO$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel$dispatchIntentOnIO$1;->label:I

    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    iget-object p1, v0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel$dispatchIntentOnIO$1;->L$1:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Ljava/lang/String;

    .line 43
    .line 44
    iget-object p1, v0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;

    .line 47
    .line 48
    .line 49
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    .line 51
    goto/16 :goto_6

    .line 52
    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    .line 58
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    throw p1

    .line 60
    .line 61
    .line 62
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 63
    .line 64
    instance-of p2, p1, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideOrShowNumber;

    .line 65
    .line 66
    if-eqz p2, :cond_3

    .line 67
    .line 68
    sget-object p2, Llb/h;->a:Llb/h;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Llb/h;->D()Ly70/g;

    .line 72
    move-result-object p2

    .line 73
    move-object v0, p1

    .line 74
    .line 75
    check-cast v0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideOrShowNumber;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideOrShowNumber;->isChecked()Z

    .line 79
    move-result v0

    .line 80
    .line 81
    .line 82
    invoke-static {p2, v0}, Ly70/a;->k(Ly70/g;Z)Ly70/a;

    .line 83
    .line 84
    new-instance p2, Lcom/kubi/assets/margin/isolated/w;

    .line 85
    .line 86
    .line 87
    invoke-direct {p2, p1}, Lcom/kubi/assets/margin/isolated/w;-><init>(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p2}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 91
    move-result p1

    .line 92
    .line 93
    .line 94
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 95
    .line 96
    goto/16 :goto_7

    .line 97
    .line 98
    :cond_3
    instance-of p2, p1, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$FetchIsolatedAssetsList;

    .line 99
    const/4 v2, 0x0

    .line 100
    .line 101
    if-eqz p2, :cond_4

    .line 102
    .line 103
    sget-object p1, Lcom/kubi/assets/service/a;->a:Lcom/kubi/assets/service/a;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Lcom/kubi/assets/service/a;->d()Lcom/kubi/margin/api/IMarginService;

    .line 107
    move-result-object p1

    .line 108
    .line 109
    .line 110
    invoke-static {p1, v2, v4, v2}, Lcom/kubi/margin/api/IMarginService;->A0(Lcom/kubi/margin/api/IMarginService;Ljava/lang/Boolean;ILjava/lang/Object;)Lio/reactivex/Observable;

    .line 111
    move-result-object p1

    .line 112
    .line 113
    if-eqz p1, :cond_12

    .line 114
    .line 115
    new-instance p2, Lcom/kubi/assets/margin/isolated/x;

    .line 116
    .line 117
    .line 118
    invoke-direct {p2, p0}, Lcom/kubi/assets/margin/isolated/x;-><init>(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;)V

    .line 119
    .line 120
    new-instance v0, Lcom/kubi/assets/margin/isolated/y;

    .line 121
    .line 122
    .line 123
    invoke-direct {v0, p2}, Lcom/kubi/assets/margin/isolated/y;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 124
    .line 125
    new-instance p2, Lcom/kubi/assets/margin/isolated/z;

    .line 126
    .line 127
    .line 128
    invoke-direct {p2, p0}, Lcom/kubi/assets/margin/isolated/z;-><init>(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;)V

    .line 129
    .line 130
    new-instance v1, Lcom/kubi/assets/margin/isolated/a0;

    .line 131
    .line 132
    .line 133
    invoke-direct {v1, p2}, Lcom/kubi/assets/margin/isolated/a0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v0, v1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 137
    .line 138
    goto/16 :goto_7

    .line 139
    .line 140
    :cond_4
    instance-of p2, p1, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideSmallOrFilter;

    .line 141
    .line 142
    if-eqz p2, :cond_10

    .line 143
    move-object p2, p1

    .line 144
    .line 145
    check-cast p2, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideSmallOrFilter;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p2}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideSmallOrFilter;->isManual()Z

    .line 149
    move-result v0

    .line 150
    .line 151
    if-eqz v0, :cond_5

    .line 152
    .line 153
    sget-object v0, Llb/h;->a:Llb/h;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Llb/h;->p()Ly70/g;

    .line 157
    move-result-object v0

    .line 158
    .line 159
    .line 160
    invoke-virtual {p2}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideSmallOrFilter;->getChecked()Z

    .line 161
    move-result v1

    .line 162
    .line 163
    .line 164
    invoke-static {v0, v1}, Ly70/a;->k(Ly70/g;Z)Ly70/a;

    .line 165
    .line 166
    .line 167
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 168
    move-result-object v0

    .line 169
    .line 170
    check-cast v0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;->getIsolatedAssetsSourceList()Ljava/util/List;

    .line 174
    move-result-object v0

    .line 175
    .line 176
    if-eqz v0, :cond_e

    .line 177
    .line 178
    .line 179
    invoke-static {v0}, Lcom/kubi/utils/extensions/b;->a(Ljava/util/List;)Ljava/util/List;

    .line 180
    move-result-object v0

    .line 181
    .line 182
    if-eqz v0, :cond_e

    .line 183
    .line 184
    new-instance v1, Ljava/util/ArrayList;

    .line 185
    .line 186
    .line 187
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 191
    move-result-object v0

    .line 192
    .line 193
    .line 194
    :cond_6
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    move-result v3

    .line 196
    .line 197
    if-eqz v3, :cond_d

    .line 198
    .line 199
    .line 200
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    move-result-object v3

    .line 202
    move-object v5, v3

    .line 203
    .line 204
    check-cast v5, Lcom/kubi/margin/api/entity/MarginPosition;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v5}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 208
    move-result-object v6

    .line 209
    .line 210
    if-eqz v6, :cond_7

    .line 211
    .line 212
    .line 213
    invoke-virtual {v6}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 214
    move-result-object v6

    .line 215
    goto :goto_2

    .line 216
    :cond_7
    move-object v6, v2

    .line 217
    .line 218
    :goto_2
    if-nez v6, :cond_8

    .line 219
    .line 220
    const-string v6, ""

    .line 221
    .line 222
    .line 223
    :cond_8
    invoke-virtual {p2}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideSmallOrFilter;->getKeyword()Ljava/lang/String;

    .line 224
    move-result-object v7

    .line 225
    .line 226
    .line 227
    invoke-static {v6, v7, v4}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 228
    move-result v6

    .line 229
    .line 230
    .line 231
    invoke-virtual {p2}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideSmallOrFilter;->getChecked()Z

    .line 232
    move-result v7

    .line 233
    .line 234
    if-eqz v7, :cond_b

    .line 235
    .line 236
    if-eqz v6, :cond_6

    .line 237
    .line 238
    .line 239
    invoke-virtual {v5}, Lcom/kubi/margin/api/entity/MarginPosition;->totalConversionCompat()Ljava/math/BigDecimal;

    .line 240
    move-result-object v6

    .line 241
    .line 242
    .line 243
    invoke-static {v6, v2, v4, v2}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 244
    move-result-object v6

    .line 245
    .line 246
    sget-object v7, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v7}, Lcom/kubi/assets/service/AssetsHelper;->h()Lcom/kubi/assets/entity/SmallEntity;

    .line 250
    move-result-object v8

    .line 251
    .line 252
    if-eqz v8, :cond_9

    .line 253
    .line 254
    .line 255
    invoke-virtual {v8}, Lcom/kubi/assets/entity/SmallEntity;->getBaseCurrency()Ljava/lang/String;

    .line 256
    move-result-object v8

    .line 257
    goto :goto_3

    .line 258
    :cond_9
    move-object v8, v2

    .line 259
    .line 260
    :goto_3
    const-string v9, "BTC"

    .line 261
    .line 262
    .line 263
    invoke-static {v6, v9, v8}, Lkf/a;->A(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 264
    move-result-object v6

    .line 265
    .line 266
    .line 267
    invoke-virtual {v7}, Lcom/kubi/assets/service/AssetsHelper;->h()Lcom/kubi/assets/entity/SmallEntity;

    .line 268
    move-result-object v7

    .line 269
    .line 270
    if-eqz v7, :cond_a

    .line 271
    .line 272
    .line 273
    invoke-virtual {v7}, Lcom/kubi/assets/entity/SmallEntity;->getQuotaLimit()Ljava/math/BigDecimal;

    .line 274
    move-result-object v7

    .line 275
    goto :goto_4

    .line 276
    :cond_a
    move-object v7, v2

    .line 277
    .line 278
    .line 279
    :goto_4
    invoke-virtual {v6, v7}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 280
    move-result v6

    .line 281
    .line 282
    if-gez v6, :cond_c

    .line 283
    .line 284
    .line 285
    invoke-virtual {v5}, Lcom/kubi/margin/api/entity/MarginPosition;->getLiabilityConversionBalance()Ljava/math/BigDecimal;

    .line 286
    move-result-object v5

    .line 287
    .line 288
    .line 289
    invoke-static {v5}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 290
    move-result-wide v5

    .line 291
    .line 292
    const-wide/16 v7, 0x0

    .line 293
    .line 294
    cmpl-double v5, v5, v7

    .line 295
    .line 296
    if-lez v5, :cond_6

    .line 297
    goto :goto_5

    .line 298
    .line 299
    :cond_b
    if-eqz v6, :cond_6

    .line 300
    .line 301
    .line 302
    :cond_c
    :goto_5
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 303
    goto :goto_1

    .line 304
    :cond_d
    move-object v2, v1

    .line 305
    .line 306
    :cond_e
    new-instance p2, Lcom/kubi/assets/margin/isolated/b0;

    .line 307
    .line 308
    .line 309
    invoke-direct {p2, v2, p1}, Lcom/kubi/assets/margin/isolated/b0;-><init>(Ljava/util/List;Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {p0, p2}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 313
    .line 314
    .line 315
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 316
    move-result-object p1

    .line 317
    .line 318
    check-cast p1, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;

    .line 319
    .line 320
    .line 321
    invoke-virtual {p1}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;->getIsolatedAssetsSourceList()Ljava/util/List;

    .line 322
    move-result-object p1

    .line 323
    .line 324
    if-eqz p1, :cond_12

    .line 325
    .line 326
    .line 327
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 328
    move-result p1

    .line 329
    .line 330
    if-eqz p1, :cond_f

    .line 331
    goto :goto_7

    .line 332
    .line 333
    :cond_f
    sget-object p1, Lcom/kubi/mvi/event/SingleEvent$c;->b:Lcom/kubi/mvi/event/SingleEvent$c;

    .line 334
    .line 335
    .line 336
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->sendSingleEvent(Ldr/a;)V

    .line 337
    goto :goto_7

    .line 338
    .line 339
    :cond_10
    instance-of p2, p1, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$FetchMarginPnl;

    .line 340
    .line 341
    if-eqz p2, :cond_13

    .line 342
    .line 343
    sget-object p2, Lcom/kubi/assets/service/a;->a:Lcom/kubi/assets/service/a;

    .line 344
    .line 345
    .line 346
    invoke-virtual {p2}, Lcom/kubi/assets/service/a;->j()Lcom/kubi/user/api/IUserService;

    .line 347
    move-result-object p2

    .line 348
    .line 349
    .line 350
    invoke-interface {p2}, Lcom/kubi/user/api/IUserService;->d0()Lcom/kubi/user/model/LoginUserEntity;

    .line 351
    move-result-object p2

    .line 352
    .line 353
    .line 354
    invoke-virtual {p2}, Lcom/kubi/user/model/LoginUserEntity;->getBalanceCurrency()Ljava/lang/String;

    .line 355
    move-result-object p2

    .line 356
    .line 357
    .line 358
    invoke-static {p0, v3, v4, v2}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;->v(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;ZILjava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    invoke-direct {p0}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;->F()Lcom/kubi/assets/h0;

    .line 362
    move-result-object v5

    .line 363
    .line 364
    const-string v6, "ISOLATED"

    .line 365
    .line 366
    .line 367
    invoke-interface {v5, p2, v6}, Lcom/kubi/assets/h0;->M0(Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 368
    move-result-object v5

    .line 369
    .line 370
    new-instance v6, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel$dispatchIntentOnIO$6;

    .line 371
    .line 372
    .line 373
    invoke-direct {v6, p0, v2}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel$dispatchIntentOnIO$6;-><init>(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;Lkotlin/coroutines/Continuation;)V

    .line 374
    .line 375
    .line 376
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    move-result-object p1

    .line 378
    .line 379
    iput-object p1, v0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    move-result-object p1

    .line 384
    .line 385
    iput-object p1, v0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel$dispatchIntentOnIO$1;->L$1:Ljava/lang/Object;

    .line 386
    .line 387
    iput v4, v0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel$dispatchIntentOnIO$1;->label:I

    .line 388
    .line 389
    .line 390
    invoke-static {v5, v3, v6, v0}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->d(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 391
    move-result-object p2

    .line 392
    .line 393
    if-ne p2, v1, :cond_11

    .line 394
    return-object v1

    .line 395
    .line 396
    :cond_11
    :goto_6
    check-cast p2, Lcom/kubi/network/retrofit/utils/f;

    .line 397
    .line 398
    .line 399
    invoke-virtual {p2}, Lcom/kubi/network/retrofit/utils/f;->b()Ljava/lang/Throwable;

    .line 400
    move-result-object p1

    .line 401
    .line 402
    if-eqz p1, :cond_12

    .line 403
    .line 404
    .line 405
    invoke-direct {p0, v3}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;->u(Z)V

    .line 406
    .line 407
    :cond_12
    :goto_7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 408
    return-object p1

    .line 409
    .line 410
    :cond_13
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 411
    .line 412
    .line 413
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 414
    throw p1
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
