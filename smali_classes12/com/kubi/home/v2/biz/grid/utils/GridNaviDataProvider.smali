.class public final Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;
.super Ljava/lang/Object;
.source "GridNaviDataProvider.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u000c\u001a\u00020\rJ\u001c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0002\u0010\u0013J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0002\u0010\u0013J&\u0010\u0016\u001a\u00020\u00122\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000f2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0086@\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "bizRepo",
        "Lcom/kubi/home/api/HomeBizRepo;",
        "widgetRepo",
        "Lcom/kubi/home/widgets/HomeWidgetRepo;",
        "scope",
        "Lcom/kubi/home/utils/HomeCoroutineScope;",
        "init",
        "",
        "getAllNavigations",
        "",
        "Lcom/kubi/home/api/entity/QuickAccessEntity;",
        "useCache",
        "",
        "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getHomeShowNavigations",
        "Lcom/kubi/home/api/entity/HomeQuickAccessEntity;",
        "saveHomeShowNavigations",
        "ids",
        "userCustomVersion",
        "",
        "(Ljava/util/List;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "HomeLib_googleRelease"
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
        "SMAP\nGridNaviDataProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridNaviDataProvider.kt\ncom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider\n+ 2 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,138:1\n75#2:139\n77#2:144\n75#2:145\n77#2:150\n47#3,4:140\n47#3,4:146\n*S KotlinDebug\n*F\n+ 1 GridNaviDataProvider.kt\ncom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider\n*L\n68#1:139\n68#1:144\n88#1:145\n88#1:150\n68#1:140,4\n88#1:146,4\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lcom/kubi/home/api/HomeBizRepo;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lcom/kubi/home/widgets/HomeWidgetRepo;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Lcom/kubi/home/utils/HomeCoroutineScope;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;->a:Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;

    .line 8
    .line 9
    new-instance v0, Lcom/kubi/home/api/HomeBizRepo;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/kubi/home/api/HomeBizRepo;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;->b:Lcom/kubi/home/api/HomeBizRepo;

    .line 15
    .line 16
    new-instance v0, Lcom/kubi/home/widgets/HomeWidgetRepo;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Lcom/kubi/home/widgets/HomeWidgetRepo;-><init>()V

    .line 20
    .line 21
    sput-object v0, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;->c:Lcom/kubi/home/widgets/HomeWidgetRepo;

    .line 22
    .line 23
    new-instance v0, Lcom/kubi/home/utils/HomeCoroutineScope;

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    const-string v2, "navi_provider"

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1, v2}, Lcom/kubi/home/utils/HomeCoroutineScope;-><init>(Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;)V

    .line 33
    .line 34
    sput-object v0, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;->d:Lcom/kubi/home/utils/HomeCoroutineScope;

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

.method public static synthetic a(Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;->i(Ljava/lang/Boolean;)Lkotlin/Unit;

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
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;->j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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
.end method

.method public static final synthetic c()Lcom/kubi/home/api/HomeBizRepo;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;->b:Lcom/kubi/home/api/HomeBizRepo;

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

.method public static final synthetic d()Lcom/kubi/home/utils/HomeCoroutineScope;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;->d:Lcom/kubi/home/utils/HomeCoroutineScope;

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

.method public static final synthetic e()Lcom/kubi/home/widgets/HomeWidgetRepo;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;->c:Lcom/kubi/home/widgets/HomeWidgetRepo;

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

.method public static final i(Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0

    .line 10
    .line 11
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    const-string v1, "refreshNaviMore--afterLogin->"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    move-result-object p0

    .line 27
    .line 28
    const-string v0, "GridNaviDataProvider"

    .line 29
    .line 30
    .line 31
    invoke-static {v0, p0}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    sget-object v1, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;->d:Lcom/kubi/home/utils/HomeCoroutineScope;

    .line 34
    .line 35
    new-instance v4, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$init$subscribe$1$1;

    .line 36
    const/4 p0, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct {v4, p0}, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$init$subscribe$1$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 40
    const/4 v5, 0x3

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v2, 0x0

    .line 43
    const/4 v3, 0x0

    .line 44
    .line 45
    .line 46
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 49
    return-object p0
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
.end method

.method public static final j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
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
.end method


# virtual methods
.method public final f(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/kubi/home/api/entity/QuickAccessEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Loj/d;->a:Loj/d;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Loj/d;->c()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    sget-object v0, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kubi/user/config/UserInfo;->n()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    sget-object v1, Lkotlinx/coroutines/CoroutineExceptionHandler;->M0:Lkotlinx/coroutines/CoroutineExceptionHandler$a;

    .line 24
    .line 25
    new-instance v2, Lgj/a;

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v1}, Lgj/a;-><init>(Lkotlinx/coroutines/CoroutineExceptionHandler$a;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    new-instance v1, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$getAllNavigations$2;

    .line 35
    const/4 v2, 0x0

    .line 36
    .line 37
    .line 38
    invoke-direct {v1, p1, v2}, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$getAllNavigations$2;-><init>(ZLkotlin/coroutines/Continuation;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 42
    move-result-object p1

    .line 43
    return-object p1

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 47
    move-result-object p1

    .line 48
    return-object p1
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
.end method

.method public final g(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/home/api/entity/HomeQuickAccessEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Loj/d;->a:Loj/d;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Loj/d;->c()Z

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    sget-object v0, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/kubi/user/config/UserInfo;->n()Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    goto :goto_0

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    sget-object v2, Lkotlinx/coroutines/CoroutineExceptionHandler;->M0:Lkotlinx/coroutines/CoroutineExceptionHandler$a;

    .line 25
    .line 26
    new-instance v3, Lgj/a;

    .line 27
    .line 28
    .line 29
    invoke-direct {v3, v2}, Lgj/a;-><init>(Lkotlinx/coroutines/CoroutineExceptionHandler$a;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v3}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    new-instance v2, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$getHomeShowNavigations$2;

    .line 36
    .line 37
    .line 38
    invoke-direct {v2, p1, v1}, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$getHomeShowNavigations$2;-><init>(ZLkotlin/coroutines/Continuation;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v2, p2}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 42
    move-result-object p1

    .line 43
    return-object p1

    .line 44
    :cond_1
    :goto_0
    return-object v1
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
.end method

.method public final h()V
    .locals 9

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/user/config/UserInfo;->n()Z

    .line 6
    move-result v1

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-string v1, "GridNaviDataProvider"

    .line 11
    .line 12
    const-string v2, "refreshNaviMore--isLogin"

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    sget-object v3, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;->d:Lcom/kubi/home/utils/HomeCoroutineScope;

    .line 18
    .line 19
    new-instance v6, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$init$1;

    .line 20
    const/4 v1, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct {v6, v1}, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$init$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 24
    const/4 v7, 0x3

    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    .line 29
    .line 30
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {v0}, Lcom/kubi/user/config/UserInfo;->e()Lio/reactivex/Observable;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    new-instance v1, Lcom/kubi/home/v2/biz/grid/utils/a;

    .line 37
    .line 38
    .line 39
    invoke-direct {v1}, Lcom/kubi/home/v2/biz/grid/utils/a;-><init>()V

    .line 40
    .line 41
    new-instance v2, Lcom/kubi/home/v2/biz/grid/utils/b;

    .line 42
    .line 43
    .line 44
    invoke-direct {v2, v1}, Lcom/kubi/home/v2/biz/grid/utils/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 48
    .line 49
    sget-object v0, Lcom/kubi/sdk/function/language/a;->a:Lcom/kubi/sdk/function/language/a;

    .line 50
    .line 51
    new-instance v1, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$init$2;

    .line 52
    .line 53
    .line 54
    invoke-direct {v1}, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$init$2;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lcom/kubi/sdk/function/language/a;->addOnLanguageChangeListener(Lcom/kubi/sdk/function/language/a$a;)V

    .line 58
    return-void
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
.end method

.method public final k(Ljava/util/List;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Long;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p3, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$saveHomeShowNavigations$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p3

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$saveHomeShowNavigations$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$saveHomeShowNavigations$1;->label:I

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
    iput v1, v0, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$saveHomeShowNavigations$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$saveHomeShowNavigations$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$saveHomeShowNavigations$1;-><init>(Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p3, v0, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$saveHomeShowNavigations$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$saveHomeShowNavigations$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$saveHomeShowNavigations$1;->L$2:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lcom/kubi/home/entity/GridNavigationSaveReqEntity;

    .line 42
    .line 43
    iget-object p1, v0, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$saveHomeShowNavigations$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Ljava/lang/Long;

    .line 46
    .line 47
    iget-object p1, v0, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$saveHomeShowNavigations$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Ljava/util/List;

    .line 50
    .line 51
    .line 52
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    goto :goto_1

    .line 54
    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    throw p1

    .line 62
    .line 63
    .line 64
    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 65
    .line 66
    sget-object p3, Loj/d;->a:Loj/d;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p3}, Loj/d;->c()Z

    .line 70
    move-result p3

    .line 71
    const/4 v2, 0x0

    .line 72
    .line 73
    if-eqz p3, :cond_7

    .line 74
    .line 75
    sget-object p3, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p3}, Lcom/kubi/user/config/UserInfo;->n()Z

    .line 79
    move-result p3

    .line 80
    .line 81
    if-nez p3, :cond_3

    .line 82
    .line 83
    goto/16 :goto_3

    .line 84
    .line 85
    .line 86
    :cond_3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 87
    move-result p3

    .line 88
    .line 89
    if-eqz p3, :cond_4

    .line 90
    .line 91
    .line 92
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 93
    move-result-object p1

    .line 94
    return-object p1

    .line 95
    .line 96
    :cond_4
    new-instance p3, Lcom/kubi/home/entity/GridNavigationSaveReqEntity;

    .line 97
    .line 98
    .line 99
    invoke-static {p2}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 100
    move-result-wide v4

    .line 101
    .line 102
    const-wide/16 v6, 0x1

    .line 103
    add-long/2addr v4, v6

    .line 104
    .line 105
    .line 106
    invoke-static {v4, v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 107
    move-result-object v2

    .line 108
    .line 109
    const-string v4, "SAVE"

    .line 110
    .line 111
    .line 112
    invoke-direct {p3, p1, v4, v2}, Lcom/kubi/home/entity/GridNavigationSaveReqEntity;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;)V

    .line 113
    .line 114
    new-instance v2, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    .line 119
    const-string v4, "save=>"

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const-string v4, ",userCustomVersion:"

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    move-result-object v2

    .line 138
    .line 139
    const-string v4, "GridNaviDataProvider"

    .line 140
    .line 141
    .line 142
    invoke-static {v4, v2}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    sget-object v2, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;->b:Lcom/kubi/home/api/HomeBizRepo;

    .line 145
    .line 146
    .line 147
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    move-result-object p1

    .line 149
    .line 150
    iput-object p1, v0, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$saveHomeShowNavigations$1;->L$0:Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    move-result-object p1

    .line 155
    .line 156
    iput-object p1, v0, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$saveHomeShowNavigations$1;->L$1:Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    move-result-object p1

    .line 161
    .line 162
    iput-object p1, v0, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$saveHomeShowNavigations$1;->L$2:Ljava/lang/Object;

    .line 163
    .line 164
    iput v3, v0, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider$saveHomeShowNavigations$1;->label:I

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, p3, v0}, Lcom/kubi/home/api/HomeBizRepo;->g(Lcom/kubi/home/entity/GridNavigationSaveReqEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 168
    move-result-object p3

    .line 169
    .line 170
    if-ne p3, v1, :cond_5

    .line 171
    return-object v1

    .line 172
    .line 173
    :cond_5
    :goto_1
    check-cast p3, Ljava/lang/Boolean;

    .line 174
    .line 175
    if-eqz p3, :cond_6

    .line 176
    const/4 v4, 0x6

    .line 177
    const/4 v5, 0x0

    .line 178
    .line 179
    const-string v0, "event_grid_change_by_more"

    .line 180
    const/4 v1, 0x0

    .line 181
    .line 182
    const-wide/16 v2, 0x0

    .line 183
    .line 184
    .line 185
    invoke-static/range {v0 .. v5}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 186
    const/4 v10, 0x6

    .line 187
    const/4 v11, 0x0

    .line 188
    .line 189
    const-string v6, "EVENT_SAVE_HOME_SHOW"

    .line 190
    const/4 v7, 0x0

    .line 191
    .line 192
    const-wide/16 v8, 0x0

    .line 193
    .line 194
    .line 195
    invoke-static/range {v6 .. v11}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 196
    goto :goto_2

    .line 197
    :cond_6
    const/4 p3, 0x0

    .line 198
    .line 199
    .line 200
    :goto_2
    invoke-static {p3}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 201
    move-result p1

    .line 202
    .line 203
    .line 204
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 205
    move-result-object p1

    .line 206
    return-object p1

    .line 207
    .line 208
    .line 209
    :cond_7
    :goto_3
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 210
    move-result-object p1

    .line 211
    return-object p1
.end method
