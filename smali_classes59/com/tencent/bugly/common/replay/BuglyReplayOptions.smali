.class public final Lcom/tencent/bugly/common/replay/BuglyReplayOptions;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;
    }
.end annotation


# static fields
.field public static final ANDROIDX_MEDIA_VIEW_CLASS_NAME:Ljava/lang/String; = "androidx.media3.ui.PlayerView"

.field public static final EXOPLAYER_CLASS_NAME:Ljava/lang/String; = "com.google.android.exoplayer2.ui.PlayerView"

.field public static final EXOPLAYER_STYLED_CLASS_NAME:Ljava/lang/String; = "com.google.android.exoplayer2.ui.StyledPlayerView"

.field public static final IMAGE_VIEW_CLASS_NAME:Ljava/lang/String; = "android.widget.ImageView"

.field public static MASK_KEY:I = 0xe69

.field public static final TEXT_VIEW_CLASS_NAME:Ljava/lang/String; = "android.widget.TextView"

.field public static final VIDEO_VIEW_CLASS_NAME:Ljava/lang/String; = "android.widget.VideoView"

.field public static final WEB_VIEW_CLASS_NAME:Ljava/lang/String; = "android.webkit.WebView"


# instance fields
.field public a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public c:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public d:Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;

.field public e:I


# direct methods
.method public static constructor <clinit>()V
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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->a:Ljava/util/Set;

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->b:Ljava/lang/String;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->c:Ljava/lang/String;

    .line 16
    .line 17
    sget-object v0, Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;->MEDIUM:Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->d:Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;

    .line 20
    const/4 v0, 0x1

    .line 21
    .line 22
    iput v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->e:I

    .line 23
    return-void
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
.end method


# virtual methods
.method public addUnmaskViewClass(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->a:Ljava/util/Set;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

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
.end method

.method public getFrameRate()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->e:I

    .line 3
    return v0
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
.end method

.method public getMaskViewContainerClass()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->b:Ljava/lang/String;

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
.end method

.method public getQuality()Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->d:Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;

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
.end method

.method public getUnmaskViewClasses()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->a:Ljava/util/Set;

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
.end method

.method public getUnmaskViewContainerClass()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->c:Ljava/lang/String;

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
.end method

.method public removeUnmaskViewClass(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->a:Ljava/util/Set;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

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
.end method

.method public setFrameRate(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->e:I

    .line 3
    return-void
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
.end method

.method public setMaskAllImages(Z)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "android.widget.ImageView"

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->a:Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->a:Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setMaskAllText(Z)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "android.widget.TextView"

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->a:Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->a:Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setMaskKey(I)V
    .locals 0

    .line 1
    .line 2
    sput p1, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->MASK_KEY:I

    .line 3
    return-void
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
.end method

.method public setQuality(Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;)V
    .locals 0
    .param p1    # Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->d:Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;

    .line 3
    return-void
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
.end method
