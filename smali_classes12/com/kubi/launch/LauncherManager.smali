.class public final Lcom/kubi/launch/LauncherManager;
.super Ljava/lang/Object;
.source "LauncherManager.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/launch/LauncherManager$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007*\u0001\u000b\u0008\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0016\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0002\u0010\u0017J\u0016\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0002\u0010\u0017J\u0008\u0010\u001a\u001a\u00020\u0011H\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000cR\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/kubi/launch/LauncherManager;",
        "",
        "<init>",
        "()V",
        "delayJob",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "Lkotlinx/coroutines/Job;",
        "startUpDeferred",
        "Lkotlinx/coroutines/CompletableDeferred;",
        "",
        "listener",
        "com/kubi/launch/LauncherManager$listener$1",
        "Lcom/kubi/launch/LauncherManager$listener$1;",
        "launchers",
        "",
        "Lcom/kubi/launch/Launcher;",
        "startLaunch",
        "",
        "context",
        "Lcom/kubi/launch/LauncherContext;",
        "parseLauncher",
        "Lcom/kubi/launch/ILauncher;",
        "afterStart",
        "(Lcom/kubi/launch/LauncherContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "watchStartUpTimeout",
        "jumpToNext",
        "abTestClose",
        "Companion",
        "LAppFacade_googleRelease"
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
        "SMAP\nLauncherManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherManager.kt\ncom/kubi/launch/LauncherManager\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 LauncherIssue.kt\ncom/kubi/launch/exception/LauncherIssueKt\n+ 5 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,359:1\n17#2,2:360\n295#3,2:362\n51#4,2:364\n55#4,2:366\n55#4,2:368\n55#4,2:370\n55#4,2:374\n51#4,2:376\n126#5,2:372\n*S KotlinDebug\n*F\n+ 1 LauncherManager.kt\ncom/kubi/launch/LauncherManager\n*L\n121#1:360,2\n123#1:362,2\n125#1:364,2\n192#1:366,2\n213#1:368,2\n222#1:370,2\n330#1:374,2\n308#1:376,2\n253#1:372,2\n*E\n"
    }
.end annotation


# static fields
.field public static final e:Lcom/kubi/launch/LauncherManager$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lkotlinx/coroutines/x1;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lkotlinx/coroutines/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/w<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lcom/kubi/launch/LauncherManager$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/launch/i;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/launch/LauncherManager$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/launch/LauncherManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/launch/LauncherManager;->e:Lcom/kubi/launch/LauncherManager$Companion;

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
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    iput-object v0, p0, Lcom/kubi/launch/LauncherManager;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    const/4 v0, 0x1

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v0, v1}, Lkotlinx/coroutines/y;->c(Lkotlinx/coroutines/x1;ILjava/lang/Object;)Lkotlinx/coroutines/w;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    iput-object v1, p0, Lcom/kubi/launch/LauncherManager;->b:Lkotlinx/coroutines/w;

    .line 19
    .line 20
    new-instance v1, Lcom/kubi/launch/LauncherManager$a;

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, p0}, Lcom/kubi/launch/LauncherManager$a;-><init>(Lcom/kubi/launch/LauncherManager;)V

    .line 24
    .line 25
    iput-object v1, p0, Lcom/kubi/launch/LauncherManager;->c:Lcom/kubi/launch/LauncherManager$a;

    .line 26
    .line 27
    new-instance v1, Lcom/kubi/launch/x;

    .line 28
    .line 29
    .line 30
    invoke-direct {v1}, Lcom/kubi/launch/x;-><init>()V

    .line 31
    .line 32
    new-instance v2, Lcom/kubi/launch/u;

    .line 33
    .line 34
    .line 35
    invoke-direct {v2}, Lcom/kubi/launch/u;-><init>()V

    .line 36
    .line 37
    new-instance v3, Lcom/kubi/launch/TimPushLauncher;

    .line 38
    .line 39
    .line 40
    invoke-direct {v3}, Lcom/kubi/launch/TimPushLauncher;-><init>()V

    .line 41
    .line 42
    new-instance v4, Lcom/kubi/launch/w;

    .line 43
    .line 44
    .line 45
    invoke-direct {v4}, Lcom/kubi/launch/w;-><init>()V

    .line 46
    .line 47
    new-instance v5, Lcom/kubi/launch/g;

    .line 48
    .line 49
    .line 50
    invoke-direct {v5}, Lcom/kubi/launch/g;-><init>()V

    .line 51
    .line 52
    new-instance v6, Lcom/kubi/launch/OneLinkLauncher;

    .line 53
    .line 54
    .line 55
    invoke-direct {v6}, Lcom/kubi/launch/OneLinkLauncher;-><init>()V

    .line 56
    .line 57
    new-instance v7, Lcom/kubi/launch/z;

    .line 58
    .line 59
    .line 60
    invoke-direct {v7}, Lcom/kubi/launch/z;-><init>()V

    .line 61
    .line 62
    new-instance v8, Lcom/kubi/launch/c0;

    .line 63
    .line 64
    .line 65
    invoke-direct {v8}, Lcom/kubi/launch/c0;-><init>()V

    .line 66
    .line 67
    const/16 v9, 0x8

    .line 68
    .line 69
    new-array v9, v9, [Lcom/kubi/launch/i;

    .line 70
    const/4 v10, 0x0

    .line 71
    .line 72
    aput-object v1, v9, v10

    .line 73
    .line 74
    aput-object v2, v9, v0

    .line 75
    const/4 v0, 0x2

    .line 76
    .line 77
    aput-object v3, v9, v0

    .line 78
    const/4 v0, 0x3

    .line 79
    .line 80
    aput-object v4, v9, v0

    .line 81
    const/4 v0, 0x4

    .line 82
    .line 83
    aput-object v5, v9, v0

    .line 84
    const/4 v0, 0x5

    .line 85
    .line 86
    aput-object v6, v9, v0

    .line 87
    const/4 v0, 0x6

    .line 88
    .line 89
    aput-object v7, v9, v0

    .line 90
    const/4 v0, 0x7

    .line 91
    .line 92
    aput-object v8, v9, v0

    .line 93
    .line 94
    .line 95
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    iput-object v0, p0, Lcom/kubi/launch/LauncherManager;->d:Ljava/util/List;

    .line 99
    return-void
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

.method public static synthetic a()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/launch/LauncherManager;->f()V

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

.method public static synthetic b()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/launch/LauncherManager;->e()V

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

.method public static synthetic c(Lcom/kubi/sdk/BaseActivity;Ljava/lang/String;Lay/a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/launch/LauncherManager;->o(Lcom/kubi/sdk/BaseActivity;Ljava/lang/String;Lay/a;)V

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
.end method

.method public static final e()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public static final f()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public static final synthetic g(Lcom/kubi/launch/LauncherManager;Lcom/kubi/launch/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/launch/LauncherManager;->m(Lcom/kubi/launch/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic h(Lcom/kubi/launch/LauncherManager;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/launch/LauncherManager;->a:Ljava/util/concurrent/atomic/AtomicReference;

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

.method public static final synthetic i(Lcom/kubi/launch/LauncherManager;)Lkotlinx/coroutines/w;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/launch/LauncherManager;->b:Lkotlinx/coroutines/w;

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

.method public static final synthetic j(Lcom/kubi/launch/LauncherManager;Lcom/kubi/launch/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/launch/LauncherManager;->n(Lcom/kubi/launch/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic k(Lcom/kubi/launch/LauncherManager;Lcom/kubi/launch/l;)Lcom/kubi/launch/f;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/launch/LauncherManager;->p(Lcom/kubi/launch/l;)Lcom/kubi/launch/f;

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
.end method

.method public static final synthetic l(Lcom/kubi/launch/LauncherManager;Lcom/kubi/launch/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/launch/LauncherManager;->r(Lcom/kubi/launch/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final o(Lcom/kubi/sdk/BaseActivity;Ljava/lang/String;Lay/a;)V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_4

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    goto :goto_1

    .line 14
    .line 15
    :cond_0
    :try_start_0
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Lay/a;->k()Z

    .line 19
    move-result p1

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    move-object p1, v0

    .line 31
    .line 32
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    new-instance v0, Lcom/kubi/launch/exception/SplashException;

    .line 49
    .line 50
    const/16 v5, 0xc

    .line 51
    const/4 v6, 0x0

    .line 52
    .line 53
    const-string v2, "jumpToNext OneLink web navigation"

    .line 54
    const/4 v3, 0x0

    .line 55
    const/4 v4, 0x0

    .line 56
    .line 57
    .line 58
    invoke-direct/range {v0 .. v6}, Lcom/kubi/launch/exception/SplashException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 59
    const/4 p2, 0x2

    .line 60
    const/4 v1, 0x0

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v1, p2, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 64
    .line 65
    :cond_1
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 69
    move-result v0

    .line 70
    .line 71
    if-eqz v0, :cond_2

    .line 72
    move-object p1, p2

    .line 73
    .line 74
    :cond_2
    check-cast p1, Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 78
    move-result p1

    .line 79
    .line 80
    if-nez p1, :cond_3

    .line 81
    .line 82
    sget-object v0, Lf00/a;->a:Lf00/a;

    .line 83
    .line 84
    const/16 v7, 0x3f

    .line 85
    const/4 v8, 0x0

    .line 86
    const/4 v1, 0x0

    .line 87
    const/4 v2, 0x0

    .line 88
    const/4 v3, 0x0

    .line 89
    const/4 v4, 0x0

    .line 90
    const/4 v5, 0x0

    .line 91
    const/4 v6, 0x0

    .line 92
    .line 93
    .line 94
    invoke-static/range {v0 .. v8}, Lg00/f$a;->d(Lg00/f;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    :cond_3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 98
    return-void

    .line 99
    .line 100
    :cond_4
    :goto_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    const-string p2, "jumpNextPage skip OneLink web navigation, splash destroyed: "

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    move-result-object p0

    .line 116
    .line 117
    const-string p1, "SplashActivity"

    .line 118
    .line 119
    .line 120
    invoke-static {p1, p0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    return-void
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
.end method


# virtual methods
.method public final d()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Lcom/kubi/user/config/a;->f(Z)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/kubi/user/config/a;->g(Z)V

    .line 8
    .line 9
    sget-object v1, Lun/q;->a:Lun/q;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lun/q;->p()Lun/g;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    const-string v3, ""

    .line 16
    .line 17
    .line 18
    invoke-interface {v2, v3}, Lun/g;->a(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lun/q;->p()Lun/g;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    new-instance v2, Lcom/kubi/launch/n;

    .line 25
    .line 26
    .line 27
    invoke-direct {v2}, Lcom/kubi/launch/n;-><init>()V

    .line 28
    .line 29
    new-instance v3, Lcom/kubi/launch/o;

    .line 30
    .line 31
    .line 32
    invoke-direct {v3}, Lcom/kubi/launch/o;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-interface {v1, v2, v3, v0}, Lun/g;->b(Ljava/lang/Runnable;Ljava/lang/Runnable;Z)V

    .line 36
    return-void
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

.method public final m(Lcom/kubi/launch/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/launch/l;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/launch/LauncherManager$afterStart$2;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p1, p0, v1}, Lcom/kubi/launch/LauncherManager$afterStart$2;-><init>(Lcom/kubi/launch/l;Lcom/kubi/launch/LauncherManager;Lkotlin/coroutines/Continuation;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0, p2}, Lkotlinx/coroutines/n0;->f(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 14
    move-result-object p2

    .line 15
    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    return-object p1

    .line 18
    .line 19
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 20
    return-object p1
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

.method public final n(Lcom/kubi/launch/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/launch/l;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lcom/kubi/launch/LauncherManager$jumpToNext$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/kubi/launch/LauncherManager$jumpToNext$1;

    iget v4, v3, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->label:I

    :goto_0
    move-object v9, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lcom/kubi/launch/LauncherManager$jumpToNext$1;

    invoke-direct {v3, v0, v2}, Lcom/kubi/launch/LauncherManager$jumpToNext$1;-><init>(Lcom/kubi/launch/LauncherManager;Lkotlin/coroutines/Continuation;)V

    goto :goto_0

    :goto_1
    iget-object v2, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 1
    iget v4, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->label:I

    const/4 v12, 0x3

    const-string v13, "SplashActivity"

    const/4 v14, 0x2

    const/4 v15, 0x1

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    if-eq v4, v15, :cond_3

    if-eq v4, v14, :cond_2

    if-ne v4, v12, :cond_1

    iget-boolean v1, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->Z$0:Z

    iget-object v3, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lcom/kubi/sdk/BaseActivity;

    iget-object v6, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lcom/kubi/launch/l;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v12, v5

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-boolean v1, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->Z$0:Z

    iget-object v4, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->L$2:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v6, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lcom/kubi/sdk/BaseActivity;

    iget-object v7, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/kubi/launch/l;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v2, v4

    move-object v4, v6

    move-object v6, v7

    goto/16 :goto_3

    :cond_3
    iget-boolean v1, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->Z$0:Z

    iget-object v4, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->L$2:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v6, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lcom/kubi/sdk/BaseActivity;

    iget-object v7, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/kubi/launch/l;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move v2, v1

    move-object v1, v7

    goto :goto_2

    :cond_4
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    invoke-virtual {v1}, Lcom/kubi/launch/l;->b()Lcom/kubi/sdk/BaseActivity;

    move-result-object v6

    .line 3
    invoke-virtual {v1}, Lcom/kubi/launch/l;->h()Ljava/lang/String;

    move-result-object v4

    .line 4
    invoke-virtual {v1}, Lcom/kubi/launch/l;->d()Z

    move-result v2

    .line 5
    sget-object v7, Lcom/kubi/launch/p;->a:Lcom/kubi/launch/p;

    invoke-virtual {v7, v1}, Lcom/kubi/launch/p;->c(Lcom/kubi/launch/l;)V

    .line 6
    sget-object v7, Lcom/kubi/sdk/util/i1;->a:Lcom/kubi/sdk/util/i1;

    const-string v8, "site_await"

    invoke-virtual {v7, v8}, Lcom/kubi/sdk/util/i1;->b(Ljava/lang/String;)V

    .line 7
    sget-object v7, Lcom/kubi/sdk/site/config/SiteConfigManager;->a:Lcom/kubi/sdk/site/config/SiteConfigManager;

    invoke-virtual {v7}, Lcom/kubi/sdk/site/config/SiteConfigManager;->g()Lkotlinx/coroutines/w;

    move-result-object v7

    iput-object v1, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->L$0:Ljava/lang/Object;

    iput-object v6, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->L$1:Ljava/lang/Object;

    iput-object v4, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->L$2:Ljava/lang/Object;

    iput-boolean v2, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->Z$0:Z

    iput v15, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->label:I

    invoke-interface {v7, v9}, Lkotlinx/coroutines/r0;->h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_5

    goto/16 :goto_4

    .line 8
    :cond_5
    :goto_2
    sget-object v7, Lcom/kubi/sdk/site/config/SiteConfigManager;->a:Lcom/kubi/sdk/site/config/SiteConfigManager;

    invoke-virtual {v7}, Lcom/kubi/sdk/site/config/SiteConfigManager;->c()V

    .line 9
    sget-object v7, Lcom/kubi/sdk/util/i1;->a:Lcom/kubi/sdk/util/i1;

    const-string v8, "task_await"

    invoke-virtual {v7, v8}, Lcom/kubi/sdk/util/i1;->b(Ljava/lang/String;)V

    .line 10
    iget-object v7, v0, Lcom/kubi/launch/LauncherManager;->b:Lkotlinx/coroutines/w;

    iput-object v1, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->L$0:Ljava/lang/Object;

    iput-object v6, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->L$1:Ljava/lang/Object;

    iput-object v4, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->L$2:Ljava/lang/Object;

    iput-boolean v2, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->Z$0:Z

    iput v14, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->label:I

    invoke-interface {v7, v9}, Lkotlinx/coroutines/r0;->h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_6

    goto :goto_4

    :cond_6
    move-object/from16 v22, v6

    move-object v6, v1

    move v1, v2

    move-object v2, v4

    move-object/from16 v4, v22

    .line 11
    :goto_3
    const-string v7, "enable task finish 2"

    invoke-static {v13, v7}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    iget-object v7, v0, Lcom/kubi/launch/LauncherManager;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v7, v5}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lkotlinx/coroutines/x1;

    if-eqz v7, :cond_7

    invoke-static {v7, v5, v15, v5}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 13
    :cond_7
    const-string v7, "waitStartup end"

    invoke-static {v13, v7}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    sget-object v7, Lcom/kubi/sdk/site/SiteService;->a:Lcom/kubi/sdk/site/SiteService;

    invoke-virtual {v7}, Lcom/kubi/sdk/site/SiteService;->v()Z

    move-result v8

    if-eqz v8, :cond_a

    .line 15
    invoke-virtual {v6}, Lcom/kubi/launch/l;->k()Lcom/kubi/launch/q;

    move-result-object v8

    const/16 v10, 0xa

    invoke-virtual {v8, v10}, Lcom/kubi/launch/q;->e(I)V

    .line 16
    const-string v8, "SiteService"

    const-string v10, "state_jump_switch_site splash"

    invoke-static {v8, v10}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    sget-object v8, Lcom/kubi/sdk/site/SiteService$SwitchFromType;->Splash:Lcom/kubi/sdk/site/SiteService$SwitchFromType;

    iput-object v6, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->L$0:Ljava/lang/Object;

    iput-object v4, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->L$1:Ljava/lang/Object;

    iput-object v2, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->L$2:Ljava/lang/Object;

    iput-boolean v1, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->Z$0:Z

    iput v12, v9, Lcom/kubi/launch/LauncherManager$jumpToNext$1;->label:I

    move-object v10, v5

    const/4 v5, 0x0

    move-object v11, v4

    move-object v4, v7

    const/4 v7, 0x0

    move-object/from16 v16, v6

    move-object v6, v8

    const/4 v8, 0x0

    move-object/from16 v17, v10

    const/16 v10, 0xd

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move-object/from16 v12, v17

    invoke-static/range {v4 .. v11}, Lcom/kubi/sdk/site/SiteService;->G(Lcom/kubi/sdk/site/SiteService;Ljava/lang/String;Lcom/kubi/sdk/site/SiteService$SwitchFromType;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_8

    :goto_4
    return-object v3

    :cond_8
    move-object v3, v2

    move-object v2, v4

    move-object/from16 v6, v16

    move-object/from16 v4, v18

    :goto_5
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_9

    .line 18
    invoke-virtual {v4}, Landroid/app/Activity;->finish()V

    .line 19
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 20
    :cond_9
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "SplashActivity startSwitchSite failed, hasAnyBizActivity "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    .line 21
    new-instance v16, Lcom/kubi/launch/exception/SplashMessage;

    const/16 v20, 0x4

    const/16 v21, 0x0

    const-string v18, "jumpToNext"

    const/16 v19, 0x0

    invoke-direct/range {v16 .. v21}, Lcom/kubi/launch/exception/SplashMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v16

    invoke-static {v2, v12, v14, v12}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    move-object v2, v3

    goto :goto_6

    :cond_a
    move-object/from16 v18, v4

    move-object v12, v5

    move-object/from16 v16, v6

    .line 22
    :goto_6
    sget-object v3, Lun/q;->a:Lun/q;

    invoke-virtual {v3}, Lun/q;->l()Lun/b;

    move-result-object v5

    invoke-interface {v5}, Lun/b;->a()Z

    move-result v5

    if-nez v5, :cond_b

    sget-object v5, Lcom/kubi/sdk/mode/AppMode;->Companion:Lcom/kubi/sdk/mode/AppMode$Companion;

    invoke-virtual {v5}, Lcom/kubi/sdk/mode/AppMode$Companion;->isLiteMode()Z

    move-result v7

    if-eqz v7, :cond_b

    .line 23
    sget-object v7, Lcom/kubi/sdk/mode/AppMode;->Pro:Lcom/kubi/sdk/mode/AppMode;

    invoke-virtual {v5, v7}, Lcom/kubi/sdk/mode/AppMode$Companion;->updateCurrentMode(Lcom/kubi/sdk/mode/AppMode;)V

    .line 24
    :cond_b
    invoke-virtual {v6}, Lcom/kubi/launch/l;->i()Z

    move-result v5

    if-eqz v5, :cond_c

    .line 25
    sget-object v1, Lcom/kubi/launch/h;->a:Lcom/kubi/launch/h;

    invoke-virtual {v1, v6}, Lcom/kubi/launch/h;->e(Lcom/kubi/launch/l;)V

    .line 26
    invoke-virtual {v4}, Landroid/app/Activity;->finish()V

    .line 27
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :cond_c
    if-eqz v2, :cond_d

    .line 28
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_e

    :cond_d
    if-eqz v1, :cond_e

    .line 29
    invoke-virtual {v6}, Lcom/kubi/launch/l;->k()Lcom/kubi/launch/q;

    move-result-object v1

    invoke-virtual {v1, v15}, Lcom/kubi/launch/q;->e(I)V

    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SplashActivity jumpNextPage but router is null "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lcom/kubi/launch/l;->k()Lcom/kubi/launch/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 31
    new-instance v5, Lcom/kubi/launch/exception/SplashMessage;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v7, "jumpToNext"

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lcom/kubi/launch/exception/SplashMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v5, v12, v14, v12}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 32
    invoke-virtual {v4}, Landroid/app/Activity;->finish()V

    .line 33
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 34
    :cond_e
    const-string v5, "home"

    if-eqz v2, :cond_10

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_f

    goto :goto_7

    :cond_f
    move-object v7, v2

    goto :goto_8

    .line 35
    :cond_10
    :goto_7
    invoke-virtual {v6}, Lcom/kubi/launch/l;->k()Lcom/kubi/launch/q;

    move-result-object v7

    invoke-virtual {v7, v14}, Lcom/kubi/launch/q;->e(I)V

    .line 36
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "SplashActivity jumpNextPage but router is empty , hasAnyBizActivity "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    .line 37
    new-instance v16, Lcom/kubi/launch/exception/SplashMessage;

    const/16 v20, 0x4

    const/16 v21, 0x0

    const-string v18, "jumpToNext"

    const/16 v19, 0x0

    invoke-direct/range {v16 .. v21}, Lcom/kubi/launch/exception/SplashMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v16

    invoke-static {v7, v12, v14, v12}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    move-object v7, v5

    .line 38
    :goto_8
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "jumpNextPage routerUrl\uff1a"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " start"

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v13, v8}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    sget-object v8, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    invoke-virtual {v8, v7}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    move-result-object v10

    .line 40
    invoke-virtual {v6}, Lcom/kubi/launch/l;->c()Z

    move-result v11

    if-eqz v11, :cond_11

    .line 41
    invoke-virtual {v10}, Lay/a;->e()I

    move-result v11

    const v16, 0x10008000

    or-int v11, v11, v16

    invoke-virtual {v10, v11}, Lay/a;->o(I)V

    .line 42
    invoke-virtual {v6}, Lcom/kubi/launch/l;->k()Lcom/kubi/launch/q;

    move-result-object v11

    const/4 v12, 0x3

    invoke-virtual {v11, v12}, Lcom/kubi/launch/q;->e(I)V

    goto :goto_9

    .line 43
    :cond_11
    invoke-virtual {v6}, Lcom/kubi/launch/l;->k()Lcom/kubi/launch/q;

    move-result-object v11

    const/4 v12, 0x4

    invoke-virtual {v11, v12}, Lcom/kubi/launch/q;->e(I)V

    .line 44
    :goto_9
    invoke-virtual {v6}, Lcom/kubi/launch/l;->g()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Map;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_12

    .line 45
    invoke-virtual {v6}, Lcom/kubi/launch/l;->g()Ljava/util/Map;

    move-result-object v11

    invoke-virtual {v10, v11}, Lay/a;->b(Ljava/util/Map;)Lay/a;

    .line 46
    :cond_12
    const-string v11, "modeSwitchUseAtc"

    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 47
    sget-object v11, Lcom/kubi/sdk/util/i1;->a:Lcom/kubi/sdk/util/i1;

    const-string v12, "sensor_ab"

    invoke-virtual {v11, v12}, Lcom/kubi/sdk/util/i1;->b(Ljava/lang/String;)V

    .line 48
    sget-object v12, Lcom/kubi/launch/helper/a;->a:Lcom/kubi/launch/helper/a;

    invoke-virtual {v12}, Lcom/kubi/launch/helper/a;->a()Z

    move-result v12

    if-eqz v12, :cond_13

    .line 49
    invoke-static {}, Lcom/kubi/utils/a;->i()Lcom/kubi/utils/a;

    move-result-object v12

    invoke-virtual {v12}, Lcom/kubi/utils/a;->h()Landroid/app/Activity;

    move-result-object v12

    if-eqz v12, :cond_13

    if-nez v1, :cond_13

    .line 50
    sget-object v14, Lcom/kubi/sdk/site/rebirth/AppRebirth;->a:Lcom/kubi/sdk/site/rebirth/AppRebirth;

    invoke-virtual {v14, v12}, Lcom/kubi/sdk/site/rebirth/AppRebirth;->b(Landroid/app/Activity;)Z

    move-result v14

    if-nez v14, :cond_13

    .line 51
    const-string v1, "krn/router?biz=startup&entry=main&component=kc_startup_rn&route=RewardsRegisterPage&loginSource=-1"

    invoke-virtual {v8, v1}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    move-result-object v1

    .line 52
    invoke-virtual {v1}, Lay/a;->k()Z

    .line 53
    sget-object v1, Lcom/kubi/sdk/d0;->a:Lcom/kubi/sdk/d0;

    invoke-virtual {v1}, Lcom/kubi/sdk/d0;->b()Ly70/g;

    move-result-object v1

    .line 54
    invoke-static {v1, v15}, Ly70/a;->k(Ly70/g;Z)Ly70/a;

    .line 55
    sget-object v1, Lcom/kubi/sdk/util/j1;->a:Lcom/kubi/sdk/util/j1;

    invoke-virtual {v1}, Lcom/kubi/sdk/util/j1;->r()V

    .line 56
    invoke-virtual {v12}, Landroid/app/Activity;->finish()V

    .line 57
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 58
    :cond_13
    invoke-virtual {v10}, Lay/a;->j()Landroid/net/Uri;

    move-result-object v12

    invoke-static {v12}, Lcom/kubi/router/utils/RouteExKt;->G(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_14

    .line 59
    invoke-virtual {v3}, Lun/q;->p()Lun/g;

    move-result-object v5

    invoke-interface {v5}, Lun/g;->d()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_14

    .line 60
    invoke-virtual {v10}, Lay/a;->d()Landroid/os/Bundle;

    move-result-object v12

    invoke-virtual {v12, v5, v15}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 61
    :cond_14
    invoke-virtual {v3}, Lun/q;->p()Lun/g;

    move-result-object v5

    invoke-interface {v5}, Lun/g;->c()Z

    move-result v5

    if-eqz v5, :cond_17

    .line 62
    invoke-virtual {v3}, Lun/q;->p()Lun/g;

    move-result-object v5

    invoke-interface {v5}, Lun/g;->h()Z

    move-result v5

    if-eqz v5, :cond_16

    .line 63
    invoke-static {}, Lcom/kubi/utils/a;->i()Lcom/kubi/utils/a;

    move-result-object v5

    invoke-virtual {v5}, Lcom/kubi/utils/a;->h()Landroid/app/Activity;

    move-result-object v5

    if-nez v1, :cond_17

    .line 64
    sget-object v12, Lcom/kubi/sdk/site/rebirth/AppRebirth;->a:Lcom/kubi/sdk/site/rebirth/AppRebirth;

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v12, v5}, Lcom/kubi/sdk/site/rebirth/AppRebirth;->b(Landroid/app/Activity;)Z

    move-result v12

    if-nez v12, :cond_17

    .line 65
    invoke-virtual {v3}, Lun/q;->p()Lun/g;

    move-result-object v3

    invoke-interface {v3}, Lun/g;->e()Z

    move-result v3

    if-eqz v3, :cond_15

    .line 66
    const-string v1, "safe/gestureUnlock"

    invoke-virtual {v8, v1}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    move-result-object v1

    .line 67
    invoke-virtual {v10}, Lay/a;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lay/a;->m(Ljava/lang/String;)Lay/a;

    move-result-object v1

    .line 68
    invoke-virtual {v1}, Lay/a;->k()Z

    .line 69
    invoke-virtual {v5}, Landroid/app/Activity;->finish()V

    .line 70
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 71
    :cond_15
    const-string v3, "\u5f00\u5173\u5173\u9000\u51fa\u767b\u5f551"

    invoke-static {v13, v3}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    invoke-virtual {v0}, Lcom/kubi/launch/LauncherManager;->d()V

    goto :goto_a

    .line 73
    :cond_16
    const-string v3, "\u5f00\u5173\u5173\u9000\u51fa\u767b\u5f552"

    invoke-static {v13, v3}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    invoke-virtual {v0}, Lcom/kubi/launch/LauncherManager;->d()V

    .line 75
    :cond_17
    :goto_a
    invoke-virtual {v10}, Lay/a;->j()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v3

    .line 76
    invoke-virtual {v6}, Lcom/kubi/launch/l;->k()Lcom/kubi/launch/q;

    move-result-object v5

    invoke-virtual {v5}, Lcom/kubi/launch/q;->d()I

    move-result v5

    const/4 v12, 0x3

    if-ne v5, v12, :cond_19

    if-nez v1, :cond_19

    .line 77
    const-string v5, "http"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_18

    const-string v5, "https"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_19

    .line 78
    :cond_18
    invoke-virtual {v4}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/kubi/launch/m;

    invoke-direct {v2, v4, v7, v10}, Lcom/kubi/launch/m;-><init>(Lcom/kubi/sdk/BaseActivity;Ljava/lang/String;Lay/a;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 79
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 80
    :cond_19
    const-string v5, "navigation_start"

    invoke-virtual {v11, v5}, Lcom/kubi/sdk/util/i1;->b(Ljava/lang/String;)V

    if-eqz v3, :cond_1b

    .line 81
    invoke-static {}, Lcom/kubi/launch/j;->a()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1a

    goto :goto_b

    :cond_1a
    const/4 v3, 0x0

    goto :goto_c

    .line 82
    :cond_1b
    :goto_b
    invoke-virtual {v10}, Lay/a;->k()Z

    move-result v3

    .line 83
    :goto_c
    const-string v5, "navigation_end"

    invoke-virtual {v11, v5}, Lcom/kubi/sdk/util/i1;->b(Ljava/lang/String;)V

    .line 84
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " result:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v13, v5}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v3, :cond_1c

    .line 85
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "SplashActivity jumpNextPage but router not found:"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", hasAnyBizActivity "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 86
    new-instance v5, Lcom/kubi/launch/exception/SplashMessage;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v7, "jumpToNext"

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lcom/kubi/launch/exception/SplashMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x2

    const/4 v10, 0x0

    invoke-static {v5, v10, v2, v10}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    if-nez v1, :cond_1c

    .line 87
    sget-object v11, Lf00/a;->a:Lf00/a;

    const/16 v18, 0x3f

    const/16 v19, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v11 .. v19}, Lg00/f$a;->d(Lg00/f;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 88
    invoke-virtual {v4}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/16 v2, 0x800

    invoke-virtual {v1, v2, v2}, Landroid/view/Window;->setFlags(II)V

    .line 89
    :cond_1c
    invoke-virtual {v4}, Landroid/app/Activity;->finish()V

    .line 90
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public final p(Lcom/kubi/launch/l;)Lcom/kubi/launch/f;
    .locals 9

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/sdk/site/info/SiteInfoManager;->a:Lcom/kubi/sdk/site/info/SiteInfoManager;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    const-class v2, Lzf/h0;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v2, v1}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    check-cast v0, Lzf/h0;

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, p1}, Lzf/h0;->d(Lcom/kubi/launch/l;)Lcom/kubi/launch/f;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-object v0

    .line 27
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 28
    .line 29
    :try_start_0
    iget-object v0, p0, Lcom/kubi/launch/LauncherManager;->d:Ljava/util/List;

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    move-result v2

    .line 38
    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    move-result-object v2

    .line 44
    move-object v3, v2

    .line 45
    .line 46
    check-cast v3, Lcom/kubi/launch/i;

    .line 47
    .line 48
    .line 49
    invoke-interface {v3, p1}, Lcom/kubi/launch/f;->a(Lcom/kubi/launch/l;)Z

    .line 50
    move-result v3

    .line 51
    .line 52
    if-eqz v3, :cond_2

    .line 53
    goto :goto_1

    .line 54
    :catch_0
    move-exception v0

    .line 55
    move-object p1, v0

    .line 56
    move-object v3, p1

    .line 57
    goto :goto_2

    .line 58
    :cond_3
    move-object v2, v1

    .line 59
    .line 60
    :goto_1
    check-cast v2, Lcom/kubi/launch/i;

    .line 61
    .line 62
    if-nez v2, :cond_4

    .line 63
    .line 64
    new-instance p1, Lcom/kubi/launch/t;

    .line 65
    .line 66
    .line 67
    invoke-direct {p1}, Lcom/kubi/launch/t;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    return-object p1

    .line 69
    :cond_4
    return-object v2

    .line 70
    .line 71
    :goto_2
    new-instance v2, Lcom/kubi/launch/exception/SplashException;

    .line 72
    .line 73
    const/16 v7, 0xc

    .line 74
    const/4 v8, 0x0

    .line 75
    .line 76
    const-string v4, "parseLauncher"

    .line 77
    const/4 v5, 0x0

    .line 78
    const/4 v6, 0x0

    .line 79
    .line 80
    .line 81
    invoke-direct/range {v2 .. v8}, Lcom/kubi/launch/exception/SplashException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 82
    const/4 p1, 0x2

    .line 83
    .line 84
    .line 85
    invoke-static {v2, v1, p1, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 86
    .line 87
    new-instance p1, Lcom/kubi/launch/t;

    .line 88
    .line 89
    .line 90
    invoke-direct {p1}, Lcom/kubi/launch/t;-><init>()V

    .line 91
    return-object p1
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

.method public final q(Lcom/kubi/launch/l;)V
    .locals 14
    .param p1    # Lcom/kubi/launch/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/sdk/startup/StartupDispatcher;->INSTANCE:Lcom/kubi/sdk/startup/StartupDispatcher;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/kubi/launch/LauncherManager;->c:Lcom/kubi/launch/LauncherManager$a;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/kubi/sdk/startup/StartupDispatcher;->addStateListener(Lcom/kubi/sdk/startup/StartupDispatcher$IStateListener;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/sdk/startup/StartupDispatcher;->getState()I

    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x4

    .line 18
    const/4 v2, 0x1

    .line 19
    .line 20
    if-lt v0, v1, :cond_0

    .line 21
    move v0, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    .line 25
    :goto_0
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v1, p0, Lcom/kubi/launch/LauncherManager;->b:Lkotlinx/coroutines/w;

    .line 28
    .line 29
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    invoke-interface {v1, v3}, Lkotlinx/coroutines/w;->n(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/launch/l;->g()Ljava/util/Map;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/kubi/launch/l;->d()Z

    .line 40
    move-result v3

    .line 41
    .line 42
    if-eqz v3, :cond_2

    .line 43
    const/4 v2, 0x2

    .line 44
    goto :goto_1

    .line 45
    .line 46
    :cond_2
    if-eqz v0, :cond_3

    .line 47
    const/4 v2, 0x3

    .line 48
    .line 49
    .line 50
    :cond_3
    :goto_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    const-string v3, "appLauncherType"

    .line 54
    .line 55
    .line 56
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/kubi/launch/l;->d()Z

    .line 60
    move-result v1

    .line 61
    .line 62
    if-eqz v1, :cond_4

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/kubi/launch/l;->j()Landroid/view/View;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    .line 69
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->r(Landroid/view/View;)V

    .line 70
    .line 71
    .line 72
    :cond_4
    invoke-virtual {p1}, Lcom/kubi/launch/l;->f()Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 73
    move-result-object v2

    .line 74
    .line 75
    new-instance v5, Lcom/kubi/launch/LauncherManager$startLaunch$1;

    .line 76
    const/4 v1, 0x0

    .line 77
    .line 78
    .line 79
    invoke-direct {v5, p0, p1, v1}, Lcom/kubi/launch/LauncherManager$startLaunch$1;-><init>(Lcom/kubi/launch/LauncherManager;Lcom/kubi/launch/l;Lkotlin/coroutines/Continuation;)V

    .line 80
    const/4 v6, 0x3

    .line 81
    const/4 v7, 0x0

    .line 82
    const/4 v3, 0x0

    .line 83
    const/4 v4, 0x0

    .line 84
    .line 85
    .line 86
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 87
    .line 88
    if-nez v0, :cond_5

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/kubi/launch/l;->f()Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 92
    move-result-object v8

    .line 93
    .line 94
    new-instance v11, Lcom/kubi/launch/LauncherManager$startLaunch$2;

    .line 95
    .line 96
    .line 97
    invoke-direct {v11, p0, p1, v1}, Lcom/kubi/launch/LauncherManager$startLaunch$2;-><init>(Lcom/kubi/launch/LauncherManager;Lcom/kubi/launch/l;Lkotlin/coroutines/Continuation;)V

    .line 98
    const/4 v12, 0x3

    .line 99
    const/4 v13, 0x0

    .line 100
    const/4 v9, 0x0

    .line 101
    const/4 v10, 0x0

    .line 102
    .line 103
    .line 104
    invoke-static/range {v8 .. v13}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 105
    :cond_5
    return-void
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

.method public final r(Lcom/kubi/launch/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/launch/l;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/launch/LauncherManager$watchStartUpTimeout$2;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p0, p1, v1}, Lcom/kubi/launch/LauncherManager$watchStartUpTimeout$2;-><init>(Lcom/kubi/launch/LauncherManager;Lcom/kubi/launch/l;Lkotlin/coroutines/Continuation;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0, p2}, Lkotlinx/coroutines/n0;->f(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 14
    move-result-object p2

    .line 15
    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    return-object p1

    .line 18
    .line 19
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 20
    return-object p1
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
