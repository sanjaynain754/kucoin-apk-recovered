.class public final Lcom/kubi/assets/main/AssetV2MainViewModel;
.super Lcom/kubi/mvi/state/BaseStateVM;
.source "AssetV2MainViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/mvi/state/BaseStateVM<",
        "Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;",
        "Lcom/kubi/assets/main/AssetV2MainContract$UIState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0094@\u00a2\u0006\u0002\u0010\u0010R#\u0010\u0006\u001a\n \u0008*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00038TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/kubi/assets/main/AssetV2MainViewModel;",
        "Lcom/kubi/mvi/state/BaseStateVM;",
        "Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;",
        "Lcom/kubi/assets/main/AssetV2MainContract$UIState;",
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
        "(Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "initState",
        "getInitState",
        "()Lcom/kubi/assets/main/AssetV2MainContract$UIState;",
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
        "SMAP\nAssetV2MainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2MainViewModel.kt\ncom/kubi/assets/main/AssetV2MainViewModel\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n25#2:115\n26#2:117\n1#3:116\n126#4,2:118\n126#4,2:120\n774#5:122\n865#5,2:123\n*S KotlinDebug\n*F\n+ 1 AssetV2MainViewModel.kt\ncom/kubi/assets/main/AssetV2MainViewModel\n*L\n41#1:115\n41#1:117\n41#1:116\n59#1:118,2\n66#1:120,2\n75#1:122\n75#1:123,2\n*E\n"
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
    new-instance v0, Lcom/kubi/assets/main/a0;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/assets/main/a0;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/assets/main/AssetV2MainViewModel;->V:Lkotlin/Lazy;

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

.method private final A()Lcom/kubi/assets/h0;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/main/AssetV2MainViewModel;->V:Lkotlin/Lazy;

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

.method public static synthetic b(Lcom/kubi/assets/entity/AccountItemEntity;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/main/AssetV2MainViewModel;->w(Lcom/kubi/assets/entity/AccountItemEntity;)Ljava/lang/String;

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

.method public static synthetic d(Lcom/kubi/assets/entity/AccountItemEntity;)Ljava/math/BigDecimal;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/main/AssetV2MainViewModel;->x(Lcom/kubi/assets/entity/AccountItemEntity;)Ljava/math/BigDecimal;

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

.method public static synthetic e(ZLcom/kubi/assets/main/AssetV2MainContract$UIState;)Lcom/kubi/assets/main/AssetV2MainContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/main/AssetV2MainViewModel;->z(ZLcom/kubi/assets/main/AssetV2MainContract$UIState;)Lcom/kubi/assets/main/AssetV2MainContract$UIState;

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

.method public static synthetic f(Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;Lcom/kubi/assets/main/AssetV2MainContract$UIState;)Lcom/kubi/assets/main/AssetV2MainContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/main/AssetV2MainViewModel;->u(Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;Lcom/kubi/assets/main/AssetV2MainContract$UIState;)Lcom/kubi/assets/main/AssetV2MainContract$UIState;

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
    invoke-static {}, Lcom/kubi/assets/main/AssetV2MainViewModel;->s()Lcom/kubi/assets/h0;

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

.method public static synthetic o(Ljava/util/List;Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;Lcom/kubi/assets/main/AssetV2MainContract$UIState;)Lcom/kubi/assets/main/AssetV2MainContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/assets/main/AssetV2MainViewModel;->y(Ljava/util/List;Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;Lcom/kubi/assets/main/AssetV2MainContract$UIState;)Lcom/kubi/assets/main/AssetV2MainContract$UIState;

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

.method public static synthetic p(Lcom/kubi/assets/entity/AccountItemEntity;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/main/AssetV2MainViewModel;->v(Lcom/kubi/assets/entity/AccountItemEntity;)Ljava/lang/String;

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

.method public static final synthetic q(Lcom/kubi/assets/main/AssetV2MainViewModel;Ldr/a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->sendSingleEvent(Ldr/a;)V

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

.method public static final synthetic r(Lcom/kubi/assets/main/AssetV2MainViewModel;Lkotlin/jvm/functions/Function1;)Z
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

.method private static final s()Lcom/kubi/assets/h0;
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

.method public static final u(Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;Lcom/kubi/assets/main/AssetV2MainContract$UIState;)Lcom/kubi/assets/main/AssetV2MainContract$UIState;
    .locals 11

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    check-cast p0, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent$HideOrShowNumber;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent$HideOrShowNumber;->isChecked()Z

    .line 11
    move-result v3

    .line 12
    .line 13
    const/16 v9, 0xfb

    .line 14
    const/4 v10, 0x0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    move-object v0, p1

    .line 23
    .line 24
    .line 25
    invoke-static/range {v0 .. v10}, Lcom/kubi/assets/main/AssetV2MainContract$UIState;->copy$default(Lcom/kubi/assets/main/AssetV2MainContract$UIState;Ljava/util/List;Ljava/util/ArrayList;ZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/assets/main/AssetV2MainContract$UIState;

    .line 26
    move-result-object p0

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

.method public static final v(Lcom/kubi/assets/entity/AccountItemEntity;)Ljava/lang/String;
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
    .line 8
    invoke-virtual {p0}, Lcom/kubi/assets/entity/AccountItemEntity;->getCurrencyName()Ljava/lang/String;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    move-result-object p0

    .line 14
    return-object p0
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

.method public static final w(Lcom/kubi/assets/entity/AccountItemEntity;)Ljava/lang/String;
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
    .line 8
    invoke-virtual {p0}, Lcom/kubi/assets/entity/AccountItemEntity;->getCurrencyFullName()Ljava/lang/String;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    move-result-object p0

    .line 14
    return-object p0
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

.method public static final x(Lcom/kubi/assets/entity/AccountItemEntity;)Ljava/math/BigDecimal;
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
    .line 8
    invoke-virtual {p0}, Lcom/kubi/assets/entity/AccountItemEntity;->getAvailableBalance()Ljava/math/BigDecimal;

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
.end method

.method public static final y(Ljava/util/List;Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;Lcom/kubi/assets/main/AssetV2MainContract$UIState;)Lcom/kubi/assets/main/AssetV2MainContract$UIState;
    .locals 11

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    check-cast p1, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent$HideSmallOrFilter;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent$HideSmallOrFilter;->getChecked()Z

    .line 11
    move-result v4

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent$HideSmallOrFilter;->getKeyword()Ljava/lang/String;

    .line 15
    move-result-object v7

    .line 16
    .line 17
    const/16 v9, 0xb6

    .line 18
    const/4 v10, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v8, 0x0

    .line 24
    move-object v1, p0

    .line 25
    move-object v0, p2

    .line 26
    .line 27
    .line 28
    invoke-static/range {v0 .. v10}, Lcom/kubi/assets/main/AssetV2MainContract$UIState;->copy$default(Lcom/kubi/assets/main/AssetV2MainContract$UIState;Ljava/util/List;Ljava/util/ArrayList;ZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/assets/main/AssetV2MainContract$UIState;

    .line 29
    move-result-object p0

    .line 30
    return-object p0
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

.method public static final z(ZLcom/kubi/assets/main/AssetV2MainContract$UIState;)Lcom/kubi/assets/main/AssetV2MainContract$UIState;
    .locals 12

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const/16 v10, 0x7f

    .line 8
    const/4 v11, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x0

    .line 16
    move v9, p0

    .line 17
    move-object v1, p1

    .line 18
    .line 19
    .line 20
    invoke-static/range {v1 .. v11}, Lcom/kubi/assets/main/AssetV2MainContract$UIState;->copy$default(Lcom/kubi/assets/main/AssetV2MainContract$UIState;Ljava/util/List;Ljava/util/ArrayList;ZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/assets/main/AssetV2MainContract$UIState;

    .line 21
    move-result-object p0

    .line 22
    return-object p0
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


# virtual methods
.method public B()Lcom/kubi/assets/main/AssetV2MainContract$UIState;
    .locals 11
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/main/AssetV2MainContract$UIState;

    .line 3
    .line 4
    const/16 v9, 0xff

    .line 5
    const/4 v10, 0x0

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
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    .line 15
    .line 16
    invoke-direct/range {v0 .. v10}, Lcom/kubi/assets/main/AssetV2MainContract$UIState;-><init>(Ljava/util/List;Ljava/util/ArrayList;ZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    return-object v0
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
    check-cast p1, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/main/AssetV2MainViewModel;->t(Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    invoke-virtual {p0}, Lcom/kubi/assets/main/AssetV2MainViewModel;->B()Lcom/kubi/assets/main/AssetV2MainContract$UIState;

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

.method public t(Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .param p1    # Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;
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
            "Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;",
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
    instance-of v0, p2, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$1;->label:I

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
    iput v1, v0, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$1;->label:I

    .line 19
    :goto_0
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$1;-><init>(Lcom/kubi/assets/main/AssetV2MainViewModel;Lkotlin/coroutines/Continuation;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object p2, v4, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget v1, v4, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$1;->label:I

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
    iget-object p1, v4, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;

    .line 53
    .line 54
    .line 55
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 56
    .line 57
    goto/16 :goto_9

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
    iget-object p1, v4, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;

    .line 70
    .line 71
    .line 72
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 73
    .line 74
    goto/16 :goto_a

    .line 75
    .line 76
    :cond_3
    iget-object p1, v4, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p1, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;

    .line 79
    .line 80
    .line 81
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 82
    goto :goto_3

    .line 83
    .line 84
    :cond_4
    iget-object p1, v4, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p1, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;

    .line 87
    .line 88
    .line 89
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 90
    goto :goto_2

    .line 91
    .line 92
    .line 93
    :cond_5
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 94
    .line 95
    instance-of p2, p1, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent$FetchMainAssetsList;

    .line 96
    const/4 v1, 0x0

    .line 97
    .line 98
    if-eqz p2, :cond_7

    .line 99
    .line 100
    .line 101
    invoke-direct {p0}, Lcom/kubi/assets/main/AssetV2MainViewModel;->A()Lcom/kubi/assets/h0;

    .line 102
    move-result-object p2

    .line 103
    .line 104
    .line 105
    invoke-interface {p2}, Lcom/kubi/assets/h0;->d()Lkotlinx/coroutines/flow/e;

    .line 106
    move-result-object p2

    .line 107
    .line 108
    new-instance v3, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$2;

    .line 109
    .line 110
    .line 111
    invoke-direct {v3, p0, v1}, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$2;-><init>(Lcom/kubi/assets/main/AssetV2MainViewModel;Lkotlin/coroutines/Continuation;)V

    .line 112
    .line 113
    .line 114
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    move-result-object p1

    .line 116
    .line 117
    iput-object p1, v4, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 118
    .line 119
    iput v6, v4, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$1;->label:I

    .line 120
    const/4 v2, 0x0

    .line 121
    const/4 v5, 0x1

    .line 122
    const/4 v6, 0x0

    .line 123
    move-object v1, p2

    .line 124
    .line 125
    .line 126
    invoke-static/range {v1 .. v6}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->e(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 127
    move-result-object p2

    .line 128
    .line 129
    if-ne p2, v0, :cond_6

    .line 130
    .line 131
    goto/16 :goto_8

    .line 132
    .line 133
    :cond_6
    :goto_2
    check-cast p2, Lcom/kubi/network/retrofit/utils/f;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2}, Lcom/kubi/network/retrofit/utils/f;->b()Ljava/lang/Throwable;

    .line 137
    move-result-object p1

    .line 138
    .line 139
    if-eqz p1, :cond_17

    .line 140
    .line 141
    sget-object p2, Lcom/kubi/assets/l0;->a:Lcom/kubi/assets/l0;

    .line 142
    .line 143
    const-string v0, "v2/account/main-balances"

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2, v0, p1}, Lcom/kubi/assets/l0;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    .line 148
    sget-object p1, Lcom/kubi/mvi/event/SingleEvent$c;->b:Lcom/kubi/mvi/event/SingleEvent$c;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->sendSingleEvent(Ldr/a;)V

    .line 152
    .line 153
    goto/16 :goto_a

    .line 154
    .line 155
    :cond_7
    instance-of p2, p1, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent$FetchMainLendCrypto;

    .line 156
    const/4 v7, 0x0

    .line 157
    .line 158
    if-eqz p2, :cond_9

    .line 159
    .line 160
    .line 161
    invoke-direct {p0}, Lcom/kubi/assets/main/AssetV2MainViewModel;->A()Lcom/kubi/assets/h0;

    .line 162
    move-result-object p2

    .line 163
    .line 164
    .line 165
    invoke-static {p2, v7, v6, v1}, Lcom/kubi/assets/h0;->B(Lcom/kubi/assets/h0;IILjava/lang/Object;)Lkotlinx/coroutines/flow/e;

    .line 166
    move-result-object p2

    .line 167
    .line 168
    new-instance v2, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$4;

    .line 169
    .line 170
    .line 171
    invoke-direct {v2, p0, v1}, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$4;-><init>(Lcom/kubi/assets/main/AssetV2MainViewModel;Lkotlin/coroutines/Continuation;)V

    .line 172
    .line 173
    .line 174
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    move-result-object p1

    .line 176
    .line 177
    iput-object p1, v4, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 178
    .line 179
    iput v5, v4, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$1;->label:I

    .line 180
    .line 181
    .line 182
    invoke-static {p2, v7, v2, v4}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->d(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 183
    move-result-object p1

    .line 184
    .line 185
    if-ne p1, v0, :cond_8

    .line 186
    .line 187
    goto/16 :goto_8

    .line 188
    .line 189
    :cond_8
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 190
    return-object p1

    .line 191
    .line 192
    :cond_9
    instance-of p2, p1, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent$HideOrShowNumber;

    .line 193
    .line 194
    if-eqz p2, :cond_a

    .line 195
    .line 196
    sget-object p2, Llb/h;->a:Llb/h;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p2}, Llb/h;->D()Ly70/g;

    .line 200
    move-result-object p2

    .line 201
    move-object v0, p1

    .line 202
    .line 203
    check-cast v0, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent$HideOrShowNumber;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0}, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent$HideOrShowNumber;->isChecked()Z

    .line 207
    move-result v0

    .line 208
    .line 209
    .line 210
    invoke-static {p2, v0}, Ly70/a;->k(Ly70/g;Z)Ly70/a;

    .line 211
    .line 212
    new-instance p2, Lcom/kubi/assets/main/b0;

    .line 213
    .line 214
    .line 215
    invoke-direct {p2, p1}, Lcom/kubi/assets/main/b0;-><init>(Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0, p2}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 219
    move-result p1

    .line 220
    .line 221
    .line 222
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 223
    .line 224
    goto/16 :goto_a

    .line 225
    .line 226
    :cond_a
    instance-of p2, p1, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent$HideSmallOrFilter;

    .line 227
    .line 228
    if-eqz p2, :cond_14

    .line 229
    move-object p2, p1

    .line 230
    .line 231
    check-cast p2, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent$HideSmallOrFilter;

    .line 232
    .line 233
    .line 234
    invoke-virtual {p2}, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent$HideSmallOrFilter;->isManual()Z

    .line 235
    move-result v0

    .line 236
    .line 237
    if-eqz v0, :cond_b

    .line 238
    .line 239
    sget-object v0, Llb/h;->a:Llb/h;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0}, Llb/h;->v()Ly70/g;

    .line 243
    move-result-object v0

    .line 244
    .line 245
    .line 246
    invoke-virtual {p2}, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent$HideSmallOrFilter;->getChecked()Z

    .line 247
    move-result v2

    .line 248
    .line 249
    .line 250
    invoke-static {v0, v2}, Ly70/a;->k(Ly70/g;Z)Ly70/a;

    .line 251
    .line 252
    .line 253
    :cond_b
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 254
    move-result-object v0

    .line 255
    .line 256
    check-cast v0, Lcom/kubi/assets/main/AssetV2MainContract$UIState;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0}, Lcom/kubi/assets/main/AssetV2MainContract$UIState;->getMainAssetsSourceList()Ljava/util/ArrayList;

    .line 260
    move-result-object v0

    .line 261
    .line 262
    if-eqz v0, :cond_11

    .line 263
    .line 264
    .line 265
    invoke-static {v0}, Lcom/kubi/utils/extensions/b;->a(Ljava/util/List;)Ljava/util/List;

    .line 266
    move-result-object v0

    .line 267
    .line 268
    if-eqz v0, :cond_11

    .line 269
    .line 270
    .line 271
    invoke-virtual {p2}, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent$HideSmallOrFilter;->getKeyword()Ljava/lang/String;

    .line 272
    move-result-object v2

    .line 273
    .line 274
    new-instance v3, Lcom/kubi/assets/main/c0;

    .line 275
    .line 276
    .line 277
    invoke-direct {v3}, Lcom/kubi/assets/main/c0;-><init>()V

    .line 278
    .line 279
    new-instance v4, Lcom/kubi/assets/main/d0;

    .line 280
    .line 281
    .line 282
    invoke-direct {v4}, Lcom/kubi/assets/main/d0;-><init>()V

    .line 283
    .line 284
    new-instance v5, Lcom/kubi/assets/main/e0;

    .line 285
    .line 286
    .line 287
    invoke-direct {v5}, Lcom/kubi/assets/main/e0;-><init>()V

    .line 288
    .line 289
    .line 290
    invoke-static {v0, v2, v3, v4, v5}, Le60/b;->d(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 291
    move-result-object v0

    .line 292
    .line 293
    if-eqz v0, :cond_11

    .line 294
    .line 295
    new-instance v2, Ljava/util/ArrayList;

    .line 296
    .line 297
    .line 298
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 299
    .line 300
    .line 301
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 302
    move-result-object v0

    .line 303
    .line 304
    .line 305
    :cond_c
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 306
    move-result v3

    .line 307
    .line 308
    if-eqz v3, :cond_10

    .line 309
    .line 310
    .line 311
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 312
    move-result-object v3

    .line 313
    move-object v4, v3

    .line 314
    .line 315
    check-cast v4, Lcom/kubi/assets/entity/AccountItemEntity;

    .line 316
    .line 317
    .line 318
    invoke-virtual {p2}, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent$HideSmallOrFilter;->getChecked()Z

    .line 319
    move-result v5

    .line 320
    .line 321
    if-eqz v5, :cond_f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v4}, Lcom/kubi/assets/entity/AccountItemEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 325
    move-result-object v5

    .line 326
    .line 327
    .line 328
    invoke-virtual {v4}, Lcom/kubi/assets/entity/AccountItemEntity;->getCurrency()Ljava/lang/String;

    .line 329
    move-result-object v4

    .line 330
    .line 331
    sget-object v6, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v6}, Lcom/kubi/assets/service/AssetsHelper;->h()Lcom/kubi/assets/entity/SmallEntity;

    .line 335
    move-result-object v7

    .line 336
    .line 337
    if-eqz v7, :cond_d

    .line 338
    .line 339
    .line 340
    invoke-virtual {v7}, Lcom/kubi/assets/entity/SmallEntity;->getBaseCurrency()Ljava/lang/String;

    .line 341
    move-result-object v7

    .line 342
    goto :goto_5

    .line 343
    :cond_d
    move-object v7, v1

    .line 344
    .line 345
    .line 346
    :goto_5
    invoke-static {v5, v4, v7}, Lkf/a;->A(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 347
    move-result-object v4

    .line 348
    .line 349
    .line 350
    invoke-virtual {v6}, Lcom/kubi/assets/service/AssetsHelper;->h()Lcom/kubi/assets/entity/SmallEntity;

    .line 351
    move-result-object v5

    .line 352
    .line 353
    if-eqz v5, :cond_e

    .line 354
    .line 355
    .line 356
    invoke-virtual {v5}, Lcom/kubi/assets/entity/SmallEntity;->getQuotaLimit()Ljava/math/BigDecimal;

    .line 357
    move-result-object v5

    .line 358
    goto :goto_6

    .line 359
    :cond_e
    move-object v5, v1

    .line 360
    .line 361
    .line 362
    :goto_6
    invoke-virtual {v4, v5}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 363
    move-result v4

    .line 364
    .line 365
    if-ltz v4, :cond_c

    .line 366
    .line 367
    .line 368
    :cond_f
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 369
    goto :goto_4

    .line 370
    :cond_10
    move-object v1, v2

    .line 371
    .line 372
    :cond_11
    new-instance p2, Lcom/kubi/assets/main/f0;

    .line 373
    .line 374
    .line 375
    invoke-direct {p2, v1, p1}, Lcom/kubi/assets/main/f0;-><init>(Ljava/util/List;Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {p0, p2}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 379
    .line 380
    .line 381
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 382
    move-result-object p1

    .line 383
    .line 384
    check-cast p1, Lcom/kubi/assets/main/AssetV2MainContract$UIState;

    .line 385
    .line 386
    .line 387
    invoke-virtual {p1}, Lcom/kubi/assets/main/AssetV2MainContract$UIState;->getMainAssetsSourceList()Ljava/util/ArrayList;

    .line 388
    move-result-object p1

    .line 389
    .line 390
    if-eqz p1, :cond_13

    .line 391
    .line 392
    .line 393
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 394
    move-result p1

    .line 395
    .line 396
    if-eqz p1, :cond_12

    .line 397
    goto :goto_7

    .line 398
    .line 399
    :cond_12
    sget-object p1, Lcom/kubi/mvi/event/SingleEvent$c;->b:Lcom/kubi/mvi/event/SingleEvent$c;

    .line 400
    .line 401
    .line 402
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->sendSingleEvent(Ldr/a;)V

    .line 403
    .line 404
    :cond_13
    :goto_7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 405
    goto :goto_a

    .line 406
    .line 407
    :cond_14
    instance-of p2, p1, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent$FetchProducts;

    .line 408
    .line 409
    if-eqz p2, :cond_15

    .line 410
    .line 411
    .line 412
    invoke-direct {p0}, Lcom/kubi/assets/main/AssetV2MainViewModel;->A()Lcom/kubi/assets/h0;

    .line 413
    move-result-object p2

    .line 414
    .line 415
    const-string v2, "upActive"

    .line 416
    .line 417
    .line 418
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 419
    move-result-object v5

    .line 420
    .line 421
    .line 422
    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 423
    move-result-object v2

    .line 424
    .line 425
    .line 426
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 427
    move-result-object v2

    .line 428
    .line 429
    .line 430
    invoke-static {v2}, Lkotlin/collections/MapsKt;->hashMapOf([Lkotlin/Pair;)Ljava/util/HashMap;

    .line 431
    move-result-object v2

    .line 432
    .line 433
    .line 434
    invoke-interface {p2, v2}, Lcom/kubi/assets/h0;->R(Ljava/util/HashMap;)Lkotlinx/coroutines/flow/e;

    .line 435
    move-result-object p2

    .line 436
    move v2, v3

    .line 437
    .line 438
    new-instance v3, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$7;

    .line 439
    .line 440
    .line 441
    invoke-direct {v3, p0, v1}, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$7;-><init>(Lcom/kubi/assets/main/AssetV2MainViewModel;Lkotlin/coroutines/Continuation;)V

    .line 442
    .line 443
    .line 444
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    move-result-object p1

    .line 446
    .line 447
    iput-object p1, v4, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 448
    .line 449
    iput v2, v4, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$1;->label:I

    .line 450
    const/4 v2, 0x0

    .line 451
    const/4 v5, 0x1

    .line 452
    const/4 v6, 0x0

    .line 453
    move-object v1, p2

    .line 454
    .line 455
    .line 456
    invoke-static/range {v1 .. v6}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->e(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 457
    move-result-object p1

    .line 458
    .line 459
    if-ne p1, v0, :cond_17

    .line 460
    goto :goto_8

    .line 461
    .line 462
    :cond_15
    instance-of p2, p1, Lcom/kubi/assets/main/AssetV2MainContract$UiIntent$FetchKuCardStatus;

    .line 463
    .line 464
    if-eqz p2, :cond_18

    .line 465
    .line 466
    sget-object p2, Lcom/kubi/assets/service/a;->a:Lcom/kubi/assets/service/a;

    .line 467
    .line 468
    .line 469
    invoke-virtual {p2}, Lcom/kubi/assets/service/a;->e()Lcom/kubi/otc/api/IOtcService;

    .line 470
    move-result-object p2

    .line 471
    .line 472
    .line 473
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    move-result-object p1

    .line 475
    .line 476
    iput-object p1, v4, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 477
    .line 478
    iput v2, v4, Lcom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$1;->label:I

    .line 479
    .line 480
    .line 481
    invoke-interface {p2, v7, v4}, Lcom/kubi/otc/api/IOtcService;->f(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 482
    move-result-object p2

    .line 483
    .line 484
    if-ne p2, v0, :cond_16

    .line 485
    :goto_8
    return-object v0

    .line 486
    .line 487
    :cond_16
    :goto_9
    check-cast p2, Ljava/lang/Boolean;

    .line 488
    .line 489
    .line 490
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 491
    move-result p1

    .line 492
    .line 493
    new-instance p2, Lcom/kubi/assets/main/g0;

    .line 494
    .line 495
    .line 496
    invoke-direct {p2, p1}, Lcom/kubi/assets/main/g0;-><init>(Z)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {p0, p2}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 500
    move-result p1

    .line 501
    .line 502
    .line 503
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 504
    .line 505
    :cond_17
    :goto_a
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 506
    return-object p1

    .line 507
    .line 508
    :cond_18
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 509
    .line 510
    .line 511
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 512
    throw p1
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
