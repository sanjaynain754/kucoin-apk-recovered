.class public final Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;
.super Lcom/facebook/react/views/image/ReactImageDownloadListener;
.source "ReactImageView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/views/image/ReactImageView;->setShouldNotifyLoadEvents(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/views/image/ReactImageDownloadListener<",
        "Lx5/k;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ+\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1",
        "Lcom/facebook/react/views/image/ReactImageDownloadListener;",
        "Lx5/k;",
        "",
        "loaded",
        "total",
        "",
        "onProgressChange",
        "(II)V",
        "",
        "id",
        "",
        "callerContext",
        "onSubmit",
        "(Ljava/lang/String;Ljava/lang/Object;)V",
        "imageInfo",
        "Landroid/graphics/drawable/Animatable;",
        "animatable",
        "onFinalImageSet",
        "(Ljava/lang/String;Lx5/k;Landroid/graphics/drawable/Animatable;)V",
        "",
        "throwable",
        "onFailure",
        "(Ljava/lang/String;Ljava/lang/Throwable;)V",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $eventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

.field final synthetic this$0:Lcom/facebook/react/views/image/ReactImageView;


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/events/EventDispatcher;Lcom/facebook/react/views/image/ReactImageView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->$eventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->this$0:Lcom/facebook/react/views/image/ReactImageView;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/facebook/react/views/image/ReactImageDownloadListener;-><init>()V

    .line 8
    return-void
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
.method public onFailure(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "id"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo p1, "throwable"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object p1, p0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->$eventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    return-void

    .line 17
    .line 18
    :cond_0
    sget-object v0, Lcom/facebook/react/views/image/ImageLoadEvent;->Companion:Lcom/facebook/react/views/image/ImageLoadEvent$Companion;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->this$0:Lcom/facebook/react/views/image/ReactImageView;

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    .line 24
    move-result v1

    .line 25
    .line 26
    iget-object v2, p0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->this$0:Lcom/facebook/react/views/image/ReactImageView;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 30
    move-result v2

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, v2, p2}, Lcom/facebook/react/views/image/ImageLoadEvent$Companion;->createErrorEvent(IILjava/lang/Throwable;)Lcom/facebook/react/views/image/ImageLoadEvent;

    .line 34
    move-result-object p2

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, p2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 38
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public bridge synthetic onFinalImageSet(Ljava/lang/String;Ljava/lang/Object;Landroid/graphics/drawable/Animatable;)V
    .locals 0

    .line 1
    check-cast p2, Lx5/k;

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->onFinalImageSet(Ljava/lang/String;Lx5/k;Landroid/graphics/drawable/Animatable;)V

    return-void
.end method

.method public onFinalImageSet(Ljava/lang/String;Lx5/k;Landroid/graphics/drawable/Animatable;)V
    .locals 6

    const-string p3, "id"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    .line 2
    iget-object p1, p0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->this$0:Lcom/facebook/react/views/image/ReactImageView;

    invoke-virtual {p1}, Lcom/facebook/react/views/image/ReactImageView;->getImageSource$ReactAndroid_release()Lcom/facebook/react/views/imagehelper/ImageSource;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->$eventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    if-eqz p1, :cond_1

    .line 3
    sget-object v0, Lcom/facebook/react/views/image/ImageLoadEvent;->Companion:Lcom/facebook/react/views/image/ImageLoadEvent$Companion;

    .line 4
    iget-object p3, p0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->this$0:Lcom/facebook/react/views/image/ReactImageView;

    invoke-static {p3}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    move-result v1

    .line 5
    iget-object p3, p0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->this$0:Lcom/facebook/react/views/image/ReactImageView;

    invoke-virtual {p3}, Landroid/view/View;->getId()I

    move-result v2

    .line 6
    iget-object p3, p0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->this$0:Lcom/facebook/react/views/image/ReactImageView;

    invoke-virtual {p3}, Lcom/facebook/react/views/image/ReactImageView;->getImageSource$ReactAndroid_release()Lcom/facebook/react/views/imagehelper/ImageSource;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lcom/facebook/react/views/imagehelper/ImageSource;->getSource()Ljava/lang/String;

    move-result-object p3

    :goto_0
    move-object v3, p3

    goto :goto_1

    :cond_0
    const/4 p3, 0x0

    goto :goto_0

    .line 7
    :goto_1
    invoke-interface {p2}, Lx5/k;->getWidth()I

    move-result v4

    .line 8
    invoke-interface {p2}, Lx5/k;->getHeight()I

    move-result v5

    .line 9
    invoke-virtual/range {v0 .. v5}, Lcom/facebook/react/views/image/ImageLoadEvent$Companion;->createLoadEvent(IILjava/lang/String;II)Lcom/facebook/react/views/image/ImageLoadEvent;

    move-result-object p2

    .line 10
    invoke-interface {p1, p2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 11
    iget-object p1, p0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->$eventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 12
    iget-object p2, p0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->this$0:Lcom/facebook/react/views/image/ReactImageView;

    invoke-static {p2}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    move-result p2

    iget-object p3, p0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->this$0:Lcom/facebook/react/views/image/ReactImageView;

    invoke-virtual {p3}, Landroid/view/View;->getId()I

    move-result p3

    invoke-virtual {v0, p2, p3}, Lcom/facebook/react/views/image/ImageLoadEvent$Companion;->createLoadEndEvent(II)Lcom/facebook/react/views/image/ImageLoadEvent;

    move-result-object p2

    .line 13
    invoke-interface {p1, p2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    :cond_1
    return-void
.end method

.method public onProgressChange(II)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->$eventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->this$0:Lcom/facebook/react/views/image/ReactImageView;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/facebook/react/views/image/ReactImageView;->getImageSource$ReactAndroid_release()Lcom/facebook/react/views/imagehelper/ImageSource;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    goto :goto_2

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->$eventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 16
    .line 17
    sget-object v1, Lcom/facebook/react/views/image/ImageLoadEvent;->Companion:Lcom/facebook/react/views/image/ImageLoadEvent$Companion;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->this$0:Lcom/facebook/react/views/image/ReactImageView;

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    .line 23
    move-result v2

    .line 24
    .line 25
    iget-object v3, p0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->this$0:Lcom/facebook/react/views/image/ReactImageView;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 29
    move-result v3

    .line 30
    .line 31
    iget-object v4, p0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->this$0:Lcom/facebook/react/views/image/ReactImageView;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4}, Lcom/facebook/react/views/image/ReactImageView;->getImageSource$ReactAndroid_release()Lcom/facebook/react/views/imagehelper/ImageSource;

    .line 35
    move-result-object v4

    .line 36
    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4}, Lcom/facebook/react/views/imagehelper/ImageSource;->getSource()Ljava/lang/String;

    .line 41
    move-result-object v4

    .line 42
    :goto_0
    move v5, p1

    .line 43
    move v6, p2

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const/4 v4, 0x0

    .line 46
    goto :goto_0

    .line 47
    .line 48
    .line 49
    :goto_1
    invoke-virtual/range {v1 .. v6}, Lcom/facebook/react/views/image/ImageLoadEvent$Companion;->createProgressEvent(IILjava/lang/String;II)Lcom/facebook/react/views/image/ImageLoadEvent;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, p1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 54
    :cond_2
    :goto_2
    return-void
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
    .line 212
    .line 213
    .line 214
    .line 215
.end method

.method public onSubmit(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 1
    .line 2
    const-string p2, "id"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p1, p0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->$eventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    sget-object p2, Lcom/facebook/react/views/image/ImageLoadEvent;->Companion:Lcom/facebook/react/views/image/ImageLoadEvent$Companion;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->this$0:Lcom/facebook/react/views/image/ReactImageView;

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    .line 18
    move-result v0

    .line 19
    .line 20
    iget-object v1, p0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;->this$0:Lcom/facebook/react/views/image/ReactImageView;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 24
    move-result v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, v0, v1}, Lcom/facebook/react/views/image/ImageLoadEvent$Companion;->createLoadStartEvent(II)Lcom/facebook/react/views/image/ImageLoadEvent;

    .line 28
    move-result-object p2

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, p2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 32
    return-void
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
