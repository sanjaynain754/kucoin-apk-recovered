.class Landroidx/media3/ui/PlayerControlViewLayoutManager$2;
.super Landroid/animation/AnimatorListenerAdapter;
.source "PlayerControlViewLayoutManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media3/ui/PlayerControlViewLayoutManager;-><init>(Landroidx/media3/ui/PlayerControlView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media3/ui/PlayerControlViewLayoutManager;


# direct methods
.method public constructor <init>(Landroidx/media3/ui/PlayerControlViewLayoutManager;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/media3/ui/PlayerControlViewLayoutManager$2;->this$0:Landroidx/media3/ui/PlayerControlViewLayoutManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

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
.end method


# virtual methods
.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    .line 2
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlViewLayoutManager$2;->this$0:Landroidx/media3/ui/PlayerControlViewLayoutManager;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Landroidx/media3/ui/PlayerControlViewLayoutManager;->access$200(Landroidx/media3/ui/PlayerControlViewLayoutManager;)Landroid/view/View;

    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlViewLayoutManager$2;->this$0:Landroidx/media3/ui/PlayerControlViewLayoutManager;

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Landroidx/media3/ui/PlayerControlViewLayoutManager;->access$200(Landroidx/media3/ui/PlayerControlViewLayoutManager;)Landroid/view/View;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    :cond_0
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlViewLayoutManager$2;->this$0:Landroidx/media3/ui/PlayerControlViewLayoutManager;

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Landroidx/media3/ui/PlayerControlViewLayoutManager;->access$300(Landroidx/media3/ui/PlayerControlViewLayoutManager;)Landroid/view/ViewGroup;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlViewLayoutManager$2;->this$0:Landroidx/media3/ui/PlayerControlViewLayoutManager;

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Landroidx/media3/ui/PlayerControlViewLayoutManager;->access$300(Landroidx/media3/ui/PlayerControlViewLayoutManager;)Landroid/view/ViewGroup;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    :cond_1
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlViewLayoutManager$2;->this$0:Landroidx/media3/ui/PlayerControlViewLayoutManager;

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Landroidx/media3/ui/PlayerControlViewLayoutManager;->access$400(Landroidx/media3/ui/PlayerControlViewLayoutManager;)Landroid/view/ViewGroup;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlViewLayoutManager$2;->this$0:Landroidx/media3/ui/PlayerControlViewLayoutManager;

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Landroidx/media3/ui/PlayerControlViewLayoutManager;->access$400(Landroidx/media3/ui/PlayerControlViewLayoutManager;)Landroid/view/ViewGroup;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlViewLayoutManager$2;->this$0:Landroidx/media3/ui/PlayerControlViewLayoutManager;

    .line 52
    .line 53
    .line 54
    invoke-static {v1}, Landroidx/media3/ui/PlayerControlViewLayoutManager;->access$100(Landroidx/media3/ui/PlayerControlViewLayoutManager;)Z

    .line 55
    move-result v1

    .line 56
    .line 57
    if-eqz v1, :cond_2

    .line 58
    goto :goto_0

    .line 59
    :cond_2
    const/4 v0, 0x4

    .line 60
    .line 61
    .line 62
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 63
    .line 64
    :cond_3
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlViewLayoutManager$2;->this$0:Landroidx/media3/ui/PlayerControlViewLayoutManager;

    .line 65
    .line 66
    .line 67
    invoke-static {p1}, Landroidx/media3/ui/PlayerControlViewLayoutManager;->access$000(Landroidx/media3/ui/PlayerControlViewLayoutManager;)Landroid/view/View;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    instance-of p1, p1, Landroidx/media3/ui/DefaultTimeBar;

    .line 71
    .line 72
    if-eqz p1, :cond_4

    .line 73
    .line 74
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlViewLayoutManager$2;->this$0:Landroidx/media3/ui/PlayerControlViewLayoutManager;

    .line 75
    .line 76
    .line 77
    invoke-static {p1}, Landroidx/media3/ui/PlayerControlViewLayoutManager;->access$100(Landroidx/media3/ui/PlayerControlViewLayoutManager;)Z

    .line 78
    move-result p1

    .line 79
    .line 80
    if-nez p1, :cond_4

    .line 81
    .line 82
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlViewLayoutManager$2;->this$0:Landroidx/media3/ui/PlayerControlViewLayoutManager;

    .line 83
    .line 84
    .line 85
    invoke-static {p1}, Landroidx/media3/ui/PlayerControlViewLayoutManager;->access$000(Landroidx/media3/ui/PlayerControlViewLayoutManager;)Landroid/view/View;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    check-cast p1, Landroidx/media3/ui/DefaultTimeBar;

    .line 89
    .line 90
    const-wide/16 v0, 0xfa

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v0, v1}, Landroidx/media3/ui/DefaultTimeBar;->showScrubber(J)V

    .line 94
    :cond_4
    return-void
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
.end method
