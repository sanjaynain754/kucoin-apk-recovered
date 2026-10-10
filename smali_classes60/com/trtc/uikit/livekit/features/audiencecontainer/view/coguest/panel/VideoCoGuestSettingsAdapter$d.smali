.class public final Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$d;
.super Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$a;
.source "VideoCoGuestSettingsAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$SettingsViewHolder;",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$BaseViewHolder;",
        "itemView",
        "Landroid/view/View;",
        "<init>",
        "(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter;Landroid/view/View;)V",
        "layoutRoot",
        "Landroid/widget/RelativeLayout;",
        "getLayoutRoot",
        "()Landroid/widget/RelativeLayout;",
        "textTitle",
        "Landroid/widget/TextView;",
        "getTextTitle",
        "()Landroid/widget/TextView;",
        "imageIcon",
        "Landroid/widget/ImageView;",
        "getImageIcon",
        "()Landroid/widget/ImageView;",
        "bindData",
        "",
        "position",
        "",
        "tuilivekit_googleRelease"
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
.field public final g:Landroid/widget/RelativeLayout;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Landroid/widget/TextView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Landroid/widget/ImageView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final synthetic j:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter;Landroid/view/View;)V
    .locals 1
    .param p1    # Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "itemView"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$d;->j:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$a;-><init>(Landroid/view/View;)V

    .line 11
    .line 12
    sget p1, Lcom/trtc/uikit/livekit/R$id;->rl_settings_item_root:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    const-string v0, "findViewById(...)"

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    check-cast p1, Landroid/widget/RelativeLayout;

    .line 24
    .line 25
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$d;->g:Landroid/widget/RelativeLayout;

    .line 26
    .line 27
    sget p1, Lcom/trtc/uikit/livekit/R$id;->item_text:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    .line 34
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    check-cast p1, Landroid/widget/TextView;

    .line 37
    .line 38
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$d;->h:Landroid/widget/TextView;

    .line 39
    .line 40
    sget p1, Lcom/trtc/uikit/livekit/R$id;->item_image:I

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    .line 47
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    check-cast p1, Landroid/widget/ImageView;

    .line 50
    .line 51
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$d;->i:Landroid/widget/ImageView;

    .line 52
    return-void
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
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$d;->h:Landroid/widget/TextView;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$d;->j:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter;

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter;->i(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter;)Ljava/util/List;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    check-cast v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$c;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$c;->c()Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$d;->i:Landroid/widget/ImageView;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$d;->j:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter;

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter;->i(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter;)Ljava/util/List;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    check-cast v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$c;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$c;->a()I

    .line 39
    move-result v1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 43
    .line 44
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$d;->g:Landroid/widget/RelativeLayout;

    .line 45
    .line 46
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$d;->j:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter;

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter;->i(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter;)Ljava/util/List;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    .line 53
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    check-cast v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$c;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$c;->d()I

    .line 60
    move-result v1

    .line 61
    .line 62
    .line 63
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    move-result-object v1

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 68
    .line 69
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$d;->g:Landroid/widget/RelativeLayout;

    .line 70
    .line 71
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$d;->j:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter;

    .line 72
    .line 73
    .line 74
    invoke-static {v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter;->i(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter;)Ljava/util/List;

    .line 75
    move-result-object v1

    .line 76
    .line 77
    .line 78
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    move-result-object p1

    .line 80
    .line 81
    check-cast p1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$c;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$c;->b()Landroid/view/View$OnClickListener;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 89
    return-void
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
.end method
