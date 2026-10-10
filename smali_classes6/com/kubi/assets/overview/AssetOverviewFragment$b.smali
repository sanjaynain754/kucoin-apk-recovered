.class public final Lcom/kubi/assets/overview/AssetOverviewFragment$b;
.super Lww/b;
.source "AssetOverviewFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/assets/overview/AssetOverviewFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/kubi/assets/overview/AssetOverviewFragment$initView$12",
        "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;",
        "onTabSelect",
        "",
        "position",
        "",
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


# instance fields
.field public final synthetic a:Lcom/kubi/assets/overview/AssetOverviewFragment;


# direct methods
.method public constructor <init>(Lcom/kubi/assets/overview/AssetOverviewFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/overview/AssetOverviewFragment$b;->a:Lcom/kubi/assets/overview/AssetOverviewFragment;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lww/b;-><init>()V

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
.end method


# virtual methods
.method public b(I)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lww/b;->b(I)V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    if-ne p1, v0, :cond_1

    .line 7
    .line 8
    sget-object v1, Lcom/kubi/assets/sort/k;->a:Lcom/kubi/assets/sort/k;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/kubi/assets/sort/k;->j()Z

    .line 12
    move-result v2

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    iget-object v2, p0, Lcom/kubi/assets/overview/AssetOverviewFragment$b;->a:Lcom/kubi/assets/overview/AssetOverviewFragment;

    .line 17
    .line 18
    .line 19
    invoke-static {v2}, Lcom/kubi/assets/overview/AssetOverviewFragment;->E3(Lcom/kubi/assets/overview/AssetOverviewFragment;)Lta/p3;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    iget-object v2, v2, Lta/p3;->u:Lcom/kubi/resources/widget/flyco/SlidingTabLayout;

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->u(I)V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {v1}, Lcom/kubi/assets/sort/k;->g()V

    .line 33
    .line 34
    :cond_1
    if-eqz p1, :cond_3

    .line 35
    .line 36
    if-eq p1, v0, :cond_2

    .line 37
    .line 38
    const-string v0, "ongoing"

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_2
    const-string v0, "account"

    .line 42
    goto :goto_0

    .line 43
    .line 44
    :cond_3
    const-string v0, "coin"

    .line 45
    .line 46
    :goto_0
    sget-object v1, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v0}, Lcom/kubi/assets/overview/b1;->x(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p1}, Lcom/kubi/assets/overview/b1;->y(I)V

    .line 53
    return-void
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
.end method
