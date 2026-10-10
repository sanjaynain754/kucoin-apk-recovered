.class public final Lcom/kubi/mine/lib/ui/DrawerProxy$a;
.super Landroidx/drawerlayout/widget/DrawerLayout$SimpleDrawerListener;
.source "DrawerProxy.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/mine/lib/ui/DrawerProxy;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "com/kubi/mine/lib/ui/DrawerProxy$initDrawer$2",
        "Landroidx/drawerlayout/widget/DrawerLayout$SimpleDrawerListener;",
        "onDrawerClosed",
        "",
        "drawerView",
        "Landroid/view/View;",
        "onDrawerOpened",
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


# instance fields
.field public final synthetic a:Lcom/kubi/mine/lib/ui/DrawerProxy;


# direct methods
.method public constructor <init>(Lcom/kubi/mine/lib/ui/DrawerProxy;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/mine/lib/ui/DrawerProxy$a;->a:Lcom/kubi/mine/lib/ui/DrawerProxy;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/drawerlayout/widget/DrawerLayout$SimpleDrawerListener;-><init>()V

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


# virtual methods
.method public onDrawerClosed(Landroid/view/View;)V
    .locals 7

    .line 1
    .line 2
    const-string v0, "drawerView"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v5, 0x6

    .line 7
    const/4 v6, 0x0

    .line 8
    .line 9
    const-string v1, "com.kubi.home.event.HomeEvent:updateAvatar"

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    .line 15
    invoke-static/range {v1 .. v6}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 16
    .line 17
    iget-object p1, p0, Lcom/kubi/mine/lib/ui/DrawerProxy$a;->a:Lcom/kubi/mine/lib/ui/DrawerProxy;

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lcom/kubi/mine/lib/ui/DrawerProxy;->d(Lcom/kubi/mine/lib/ui/DrawerProxy;)Lcom/kubi/mine/lib/ui/MineFragment;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/kubi/mine/lib/ui/MineFragment;->X5()V

    .line 25
    return-void
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

.method public onDrawerOpened(Landroid/view/View;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "drawerView"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p1, p0, Lcom/kubi/mine/lib/ui/DrawerProxy$a;->a:Lcom/kubi/mine/lib/ui/DrawerProxy;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lcom/kubi/mine/lib/ui/DrawerProxy;->d(Lcom/kubi/mine/lib/ui/DrawerProxy;)Lcom/kubi/mine/lib/ui/MineFragment;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->isVisible()Z

    .line 15
    move-result p1

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lcom/kubi/mine/lib/ui/DrawerProxy$a;->a:Lcom/kubi/mine/lib/ui/DrawerProxy;

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lcom/kubi/mine/lib/ui/DrawerProxy;->d(Lcom/kubi/mine/lib/ui/DrawerProxy;)Lcom/kubi/mine/lib/ui/MineFragment;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    iget-object v0, p0, Lcom/kubi/mine/lib/ui/DrawerProxy$a;->a:Lcom/kubi/mine/lib/ui/DrawerProxy;

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lcom/kubi/mine/lib/ui/DrawerProxy;->c(Lcom/kubi/mine/lib/ui/DrawerProxy;)Lcom/kubi/sdk/util/j;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Lcom/kubi/mine/lib/ui/MineFragment;->Y5(Lcom/kubi/sdk/util/j;)V

    .line 33
    .line 34
    sget-object p1, Lcom/kubi/mine/api/service/IMineService;->a:Lcom/kubi/mine/api/service/IMineService$Companion;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/kubi/mine/api/service/IMineService$Companion;->get()Lcom/kubi/mine/api/service/IMineService;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    iget-object v0, p0, Lcom/kubi/mine/lib/ui/DrawerProxy$a;->a:Lcom/kubi/mine/lib/ui/DrawerProxy;

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lcom/kubi/mine/lib/ui/DrawerProxy;->d(Lcom/kubi/mine/lib/ui/DrawerProxy;)Lcom/kubi/mine/lib/ui/MineFragment;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    .line 47
    invoke-interface {p1, v0}, Lcom/kubi/mine/api/service/IMineService;->j(Lcom/kubi/sdk/BaseFragment;)V

    .line 48
    :cond_0
    return-void
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
.end method
