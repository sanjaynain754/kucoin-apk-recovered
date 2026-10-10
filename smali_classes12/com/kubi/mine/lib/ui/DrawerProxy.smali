.class public final Lcom/kubi/mine/lib/ui/DrawerProxy;
.super Ljava/lang/Object;
.source "DrawerProxy.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010\u0013\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u001b\u0010\u0008\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\r\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/kubi/mine/lib/ui/DrawerProxy;",
        "",
        "activity",
        "Landroidx/fragment/app/FragmentActivity;",
        "<init>",
        "(Landroidx/fragment/app/FragmentActivity;)V",
        "getActivity",
        "()Landroidx/fragment/app/FragmentActivity;",
        "mineFragment",
        "Lcom/kubi/mine/lib/ui/MineFragment;",
        "getMineFragment",
        "()Lcom/kubi/mine/lib/ui/MineFragment;",
        "mineFragment$delegate",
        "Lkotlin/Lazy;",
        "homeDrawer",
        "Lcom/kubi/sdk/util/DrawerInject;",
        "getHomeDrawer",
        "()Lcom/kubi/sdk/util/DrawerInject;",
        "homeDrawer$delegate",
        "initDrawer",
        "",
        "MineLib_googleRelease"
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
        "SMAP\nDrawerProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawerProxy.kt\ncom/kubi/mine/lib/ui/DrawerProxy\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,52:1\n81#2,2:53\n*S KotlinDebug\n*F\n+ 1 DrawerProxy.kt\ncom/kubi/mine/lib/ui/DrawerProxy\n*L\n31#1:53,2\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Landroidx/fragment/app/FragmentActivity;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentActivity;)V
    .locals 1
    .param p1    # Landroidx/fragment/app/FragmentActivity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "activity"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/mine/lib/ui/DrawerProxy;->a:Landroidx/fragment/app/FragmentActivity;

    .line 11
    .line 12
    new-instance p1, Lcom/kubi/mine/lib/ui/i0;

    .line 13
    .line 14
    .line 15
    invoke-direct {p1}, Lcom/kubi/mine/lib/ui/i0;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    iput-object p1, p0, Lcom/kubi/mine/lib/ui/DrawerProxy;->b:Lkotlin/Lazy;

    .line 22
    .line 23
    new-instance p1, Lcom/kubi/mine/lib/ui/j0;

    .line 24
    .line 25
    .line 26
    invoke-direct {p1, p0}, Lcom/kubi/mine/lib/ui/j0;-><init>(Lcom/kubi/mine/lib/ui/DrawerProxy;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    iput-object p1, p0, Lcom/kubi/mine/lib/ui/DrawerProxy;->c:Lkotlin/Lazy;

    .line 33
    return-void
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

.method public static synthetic a()Lcom/kubi/mine/lib/ui/MineFragment;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/mine/lib/ui/DrawerProxy;->i()Lcom/kubi/mine/lib/ui/MineFragment;

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

.method public static synthetic b(Lcom/kubi/mine/lib/ui/DrawerProxy;)Lcom/kubi/sdk/util/j;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/mine/lib/ui/DrawerProxy;->g(Lcom/kubi/mine/lib/ui/DrawerProxy;)Lcom/kubi/sdk/util/j;

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

.method public static final synthetic c(Lcom/kubi/mine/lib/ui/DrawerProxy;)Lcom/kubi/sdk/util/j;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/mine/lib/ui/DrawerProxy;->e()Lcom/kubi/sdk/util/j;

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

.method public static final synthetic d(Lcom/kubi/mine/lib/ui/DrawerProxy;)Lcom/kubi/mine/lib/ui/MineFragment;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/mine/lib/ui/DrawerProxy;->f()Lcom/kubi/mine/lib/ui/MineFragment;

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

.method public static final g(Lcom/kubi/mine/lib/ui/DrawerProxy;)Lcom/kubi/sdk/util/j;
    .locals 8

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/util/j;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/mine/lib/ui/DrawerProxy;->a:Landroidx/fragment/app/FragmentActivity;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/mine/lib/ui/DrawerProxy;->f()Lcom/kubi/mine/lib/ui/MineFragment;

    .line 8
    move-result-object v2

    .line 9
    const/4 v6, 0x4

    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x1

    .line 13
    .line 14
    const-string v5, "mine"

    .line 15
    .line 16
    .line 17
    invoke-direct/range {v0 .. v7}, Lcom/kubi/sdk/util/j;-><init>(Landroidx/fragment/app/FragmentActivity;Lcom/kubi/sdk/BaseFragment;IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    return-object v0
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

.method public static final i()Lcom/kubi/mine/lib/ui/MineFragment;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/mine/lib/ui/MineFragment;->f0:Lcom/kubi/mine/lib/ui/MineFragment$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/mine/lib/ui/MineFragment$Companion;->newInstance()Lcom/kubi/mine/lib/ui/MineFragment;

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
.method public final e()Lcom/kubi/sdk/util/j;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/mine/lib/ui/DrawerProxy;->c:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/sdk/util/j;

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

.method public final f()Lcom/kubi/mine/lib/ui/MineFragment;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/mine/lib/ui/DrawerProxy;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/mine/lib/ui/MineFragment;

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

.method public final h()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/mine/lib/ui/DrawerProxy;->a:Landroidx/fragment/app/FragmentActivity;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/event/api/b;->a:Lcom/kubi/event/api/b;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/kubi/event/api/b;->a()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    const-string v2, "com.kubi.home.event.HomeEvent:switchDrawer"

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 16
    move-result v1

    .line 17
    .line 18
    :cond_0
    new-instance v1, Lcom/kubi/mine/lib/ui/DrawerProxy$initDrawer$$inlined$bindFlowEvent$1;

    .line 19
    const/4 v3, 0x0

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, v2, v3, p0}, Lcom/kubi/mine/lib/ui/DrawerProxy$initDrawer$$inlined$bindFlowEvent$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/mine/lib/ui/DrawerProxy;)V

    .line 23
    const/4 v2, 0x0

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v2, v1}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/kubi/mine/lib/ui/DrawerProxy;->e()Lcom/kubi/sdk/util/j;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    new-instance v1, Lcom/kubi/mine/lib/ui/DrawerProxy$a;

    .line 33
    .line 34
    .line 35
    invoke-direct {v1, p0}, Lcom/kubi/mine/lib/ui/DrawerProxy$a;-><init>(Lcom/kubi/mine/lib/ui/DrawerProxy;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/kubi/sdk/util/j;->n(Landroidx/drawerlayout/widget/DrawerLayout$SimpleDrawerListener;)V

    .line 39
    return-void
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
