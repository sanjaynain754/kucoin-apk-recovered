.class public final Lzs/b;
.super Ljava/lang/Object;
.source "RealtimeHelper.kt"

# interfaces
.implements Lcom/blankj/utilcode/util/o0$b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u000c\u001a\u00020\rJ\u0012\u0010\u000e\u001a\u00020\r2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\r2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/kubi/operation/lib/realtime/RealtimeHelper;",
        "Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;",
        "<init>",
        "()V",
        "TAG",
        "",
        "service",
        "Lcom/kubi/home/realtime/IRealTimeWidgetService;",
        "getService$OperationLib_googleRelease",
        "()Lcom/kubi/home/realtime/IRealTimeWidgetService;",
        "service$delegate",
        "Lkotlin/Lazy;",
        "init",
        "",
        "onForeground",
        "activity",
        "Landroid/app/Activity;",
        "onBackground",
        "loggingInfo",
        "msg",
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
.field public static final a:Lzs/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lzs/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lzs/b;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lzs/b;->a:Lzs/b;

    .line 8
    .line 9
    new-instance v0, Lzs/a;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lzs/a;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sput-object v0, Lzs/b;->b:Lkotlin/Lazy;

    .line 19
    return-void
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

.method public static synthetic a()Lcom/kubi/home/realtime/IRealTimeWidgetService;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lzs/b;->e()Lcom/kubi/home/realtime/IRealTimeWidgetService;

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
.end method

.method public static final e()Lcom/kubi/home/realtime/IRealTimeWidgetService;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/home/realtime/IRealTimeWidgetService;->a:Lcom/kubi/home/realtime/IRealTimeWidgetService$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/home/realtime/IRealTimeWidgetService$Companion;->get()Lcom/kubi/home/realtime/IRealTimeWidgetService;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.method public final b()Lcom/kubi/home/realtime/IRealTimeWidgetService;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lzs/b;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/home/realtime/IRealTimeWidgetService;

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
    .line 28
    .line 29
    .line 30
.end method

.method public final c()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/home/api/IHomeService;->a:Lcom/kubi/home/api/IHomeService$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/home/api/IHomeService$Companion;->get()Lcom/kubi/home/api/IHomeService;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lcom/kubi/home/api/IHomeService;->h()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-string v0, "not use homeV2, ignore realtime-gempool/bonus"

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lzs/b;->d(Ljava/lang/String;)V

    .line 18
    return-void

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Lzs/b;->b()Lcom/kubi/home/realtime/IRealTimeWidgetService;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    new-instance v1, Lcom/kubi/operation/lib/realtime/gempool/d;

    .line 25
    .line 26
    .line 27
    invoke-direct {v1}, Lcom/kubi/operation/lib/realtime/gempool/d;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, v1}, Lcom/kubi/home/realtime/IRealTimeWidgetService;->a(Lcom/kubi/home/realtime/a;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lzs/b;->b()Lcom/kubi/home/realtime/IRealTimeWidgetService;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    new-instance v1, Lcom/kubi/operation/lib/realtime/gempool/g;

    .line 37
    .line 38
    .line 39
    invoke-direct {v1}, Lcom/kubi/operation/lib/realtime/gempool/g;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-interface {v0, v1}, Lcom/kubi/home/realtime/IRealTimeWidgetService;->b(Lcom/kubi/home/realtime/f;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lzs/b;->b()Lcom/kubi/home/realtime/IRealTimeWidgetService;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    new-instance v1, Lcom/kubi/operation/lib/realtime/bonus/c;

    .line 49
    .line 50
    .line 51
    invoke-direct {v1}, Lcom/kubi/operation/lib/realtime/bonus/c;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-interface {v0, v1}, Lcom/kubi/home/realtime/IRealTimeWidgetService;->a(Lcom/kubi/home/realtime/a;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lzs/b;->b()Lcom/kubi/home/realtime/IRealTimeWidgetService;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    new-instance v1, Lcom/kubi/operation/lib/realtime/bonus/f;

    .line 61
    .line 62
    .line 63
    invoke-direct {v1}, Lcom/kubi/operation/lib/realtime/bonus/f;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-interface {v0, v1}, Lcom/kubi/home/realtime/IRealTimeWidgetService;->b(Lcom/kubi/home/realtime/f;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p0}, Lcom/blankj/utilcode/util/d;->registerAppStatusChangedListener(Lcom/blankj/utilcode/util/o0$b;)V

    .line 70
    return-void
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

.method public final d(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "msg"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
.end method

.method public onBackground(Landroid/app/Activity;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object p1, Lcom/kubi/operation/lib/realtime/gempool/GempoolRealtimeDataHelper;->a:Lcom/kubi/operation/lib/realtime/gempool/GempoolRealtimeDataHelper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/kubi/operation/lib/realtime/gempool/GempoolRealtimeDataHelper;->l()V

    .line 6
    .line 7
    sget-object p1, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->a:Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->j()V

    .line 11
    return-void
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

.method public onForeground(Landroid/app/Activity;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object p1, Lcom/kubi/operation/lib/realtime/gempool/GempoolRealtimeDataHelper;->a:Lcom/kubi/operation/lib/realtime/gempool/GempoolRealtimeDataHelper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/kubi/operation/lib/realtime/gempool/GempoolRealtimeDataHelper;->k()V

    .line 6
    .line 7
    sget-object p1, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->a:Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->i()V

    .line 11
    return-void
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
