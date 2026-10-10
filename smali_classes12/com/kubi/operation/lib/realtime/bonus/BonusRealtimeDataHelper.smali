.class public final Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;
.super Ljava/lang/Object;
.source "BonusRealtimeDataHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\rJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R2\u0010\u000b\u001a&\u0012\u000c\u0012\n \u000e*\u0004\u0018\u00010\r0\r \u000e*\u0012\u0012\u000c\u0012\n \u000e*\u0004\u0018\u00010\r0\r\u0018\u00010\u000f0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "repo",
        "Lcom/kubi/operation/lib/api/OperationRepo;",
        "scope",
        "Lcom/kubi/operation/lib/utils/OperationCoroutineScope;",
        "wsScope",
        "currentList",
        "",
        "Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeData;",
        "kotlin.jvm.PlatformType",
        "",
        "isRequestPulling",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "hasLogin",
        "",
        "getHasLogin",
        "()Z",
        "pullDatas",
        "Lkotlinx/coroutines/Job;",
        "onDataRemoved",
        "data",
        "startWsSubcribe",
        "",
        "stopWsSubcribe",
        "getCurrentList",
        "OperationLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lcom/kubi/operation/lib/api/OperationRepo;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lcom/kubi/operation/lib/utils/OperationCoroutineScope;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Lcom/kubi/operation/lib/utils/OperationCoroutineScope;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeData;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->a:Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;

    .line 8
    .line 9
    new-instance v0, Lcom/kubi/operation/lib/api/OperationRepo;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/kubi/operation/lib/api/OperationRepo;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->b:Lcom/kubi/operation/lib/api/OperationRepo;

    .line 15
    .line 16
    new-instance v0, Lcom/kubi/operation/lib/utils/OperationCoroutineScope;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    const-string v2, "BonusRealtimeDataHelper"

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1, v2}, Lcom/kubi/operation/lib/utils/OperationCoroutineScope;-><init>(Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;)V

    .line 26
    .line 27
    sput-object v0, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->c:Lcom/kubi/operation/lib/utils/OperationCoroutineScope;

    .line 28
    .line 29
    new-instance v0, Lcom/kubi/operation/lib/utils/OperationCoroutineScope;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    const-string v2, "BonusRealtimeDataHelperws"

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Lcom/kubi/operation/lib/utils/OperationCoroutineScope;-><init>(Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;)V

    .line 39
    .line 40
    sput-object v0, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->d:Lcom/kubi/operation/lib/utils/OperationCoroutineScope;

    .line 41
    .line 42
    new-instance v0, Ljava/util/ArrayList;

    .line 43
    .line 44
    .line 45
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    sput-object v0, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->e:Ljava/util/List;

    .line 52
    .line 53
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 54
    const/4 v1, 0x0

    .line 55
    .line 56
    .line 57
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 58
    .line 59
    sput-object v0, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 60
    return-void
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
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static final synthetic a()Ljava/util/List;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->e:Ljava/util/List;

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
.end method

.method public static final synthetic b(Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->f()Z

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
.end method

.method public static final synthetic c()Lcom/kubi/operation/lib/api/OperationRepo;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->b:Lcom/kubi/operation/lib/api/OperationRepo;

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
.end method

.method public static final synthetic d()Lcom/kubi/operation/lib/utils/OperationCoroutineScope;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->d:Lcom/kubi/operation/lib/utils/OperationCoroutineScope;

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
.end method

.method public static final synthetic e()Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

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
.end method


# virtual methods
.method public final f()Z
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/user/config/UserInfo;->d()Lcom/kubi/user/config/UserInfo$LoginState;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget-object v1, Lcom/kubi/user/config/UserInfo$LoginState;->Login:Lcom/kubi/user/config/UserInfo$LoginState;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
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

.method public final g(Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeData;)Lkotlinx/coroutines/x1;
    .locals 7
    .param p1    # Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "data"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v1, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->c:Lcom/kubi/operation/lib/utils/OperationCoroutineScope;

    .line 8
    .line 9
    new-instance v4, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper$onDataRemoved$1;

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    invoke-direct {v4, p1, v0}, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper$onDataRemoved$1;-><init>(Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeData;Lkotlin/coroutines/Continuation;)V

    .line 14
    const/4 v5, 0x3

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 21
    move-result-object p1

    .line 22
    return-object p1
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
.end method

.method public final h()Lkotlinx/coroutines/x1;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->c:Lcom/kubi/operation/lib/utils/OperationCoroutineScope;

    .line 3
    .line 4
    new-instance v3, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper$pullDatas$1;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v3, v1}, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper$pullDatas$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 15
    move-result-object v0

    .line 16
    return-object v0
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

.method public final i()V
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->d:Lcom/kubi/operation/lib/utils/OperationCoroutineScope;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/operation/lib/utils/OperationCoroutineScope;->close()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->f()Z

    .line 9
    move-result v1

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    new-instance v3, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper$startWsSubcribe$1;

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    .line 18
    invoke-direct {v3, v1}, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper$startWsSubcribe$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 19
    const/4 v4, 0x3

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final j()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lzs/b;->a:Lzs/b;

    .line 3
    .line 4
    const-string v1, "[helper-bonus]stopWsSubcribe."

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lzs/b;->d(Ljava/lang/String;)V

    .line 8
    .line 9
    sget-object v0, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->d:Lcom/kubi/operation/lib/utils/OperationCoroutineScope;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/kubi/operation/lib/utils/OperationCoroutineScope;->close()V

    .line 13
    return-void
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
