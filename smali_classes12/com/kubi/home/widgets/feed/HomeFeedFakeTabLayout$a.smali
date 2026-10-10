.class public final Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout$a;
.super Lww/b;
.source "HomeFeedFakeTabLayout.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "com/kubi/home/widgets/feed/HomeFeedFakeTabLayout$tabSelectListener$1",
        "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;",
        "onTabSelect",
        "",
        "position",
        "",
        "onTabReselect",
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


# instance fields
.field public final synthetic a:Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout;


# direct methods
.method public constructor <init>(Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout$a;->a:Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout;

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
    .line 44
    .line 45
.end method


# virtual methods
.method public a(I)V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lww/b;->a(I)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout$a;->a:Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout;

    .line 6
    const/4 v1, 0x1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, p1, v1}, Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout;->f(Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout;IZ)V

    .line 10
    const/4 v6, 0x6

    .line 11
    const/4 v7, 0x0

    .line 12
    .line 13
    const-string v2, "com.kubi.home.feed.QuoteEvent:fake_tab_re_click"

    .line 14
    const/4 v3, 0x0

    .line 15
    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static/range {v2 .. v7}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 20
    .line 21
    sget-object v0, Lej/i;->a:Lej/i;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout$a;->a:Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout;

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout;->e(Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout;)Lcom/kubi/resources/widget/flyco/SlidingTabLayout;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1, v1}, Lej/i;->G(ILcom/kubi/resources/widget/flyco/SlidingTabLayout;)V

    .line 31
    return-void
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

.method public b(I)V
    .locals 19

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move/from16 v1, p1

    .line 5
    .line 6
    sget-object v2, Lej/i;->a:Lej/i;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v2, v1}, Lej/i;->M(I)V

    .line 10
    .line 11
    iget-object v3, v0, Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout$a;->a:Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout;

    .line 12
    const/4 v4, 0x2

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    .line 16
    .line 17
    invoke-static {v3, v1, v6, v4, v5}, Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout;->n(Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout;IZILjava/lang/Object;)V

    .line 18
    const/4 v11, 0x6

    .line 19
    const/4 v12, 0x0

    .line 20
    .line 21
    const-string v7, "com.kubi.home.feed.QuoteEvent:fake_tab_change"

    .line 22
    const/4 v8, 0x0

    .line 23
    .line 24
    const-wide/16 v9, 0x0

    .line 25
    .line 26
    .line 27
    invoke-static/range {v7 .. v12}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 28
    .line 29
    const/16 v17, 0x6

    .line 30
    .line 31
    const/16 v18, 0x0

    .line 32
    .line 33
    const-string v13, "com.kubi.home.feed.QuoteEvent:fake_tab_re_click"

    .line 34
    const/4 v14, 0x0

    .line 35
    .line 36
    const-wide/16 v15, 0x0

    .line 37
    .line 38
    .line 39
    invoke-static/range {v13 .. v18}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 40
    .line 41
    iget-object v3, v0, Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout$a;->a:Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout;

    .line 42
    .line 43
    .line 44
    invoke-static {v3}, Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout;->e(Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout;)Lcom/kubi/resources/widget/flyco/SlidingTabLayout;

    .line 45
    move-result-object v3

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v1, v3}, Lej/i;->G(ILcom/kubi/resources/widget/flyco/SlidingTabLayout;)V

    .line 49
    return-void
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
