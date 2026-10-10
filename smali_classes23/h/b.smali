.class public Lh/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/media/MediaPlayer;

.field public b:Landroid/content/Context;

.field public c:Landroid/os/Handler;

.field public d:J

.field public final e:I

.field public f:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/16 v0, 0x5dc

    .line 6
    .line 7
    iput v0, p0, Lh/b;->e:I

    .line 8
    const/4 v0, 0x1

    .line 9
    .line 10
    iput-boolean v0, p0, Lh/b;->f:Z

    .line 11
    .line 12
    iput-object p1, p0, Lh/b;->b:Landroid/content/Context;

    .line 13
    .line 14
    new-instance p1, Landroid/media/MediaPlayer;

    .line 15
    .line 16
    .line 17
    invoke-direct {p1}, Landroid/media/MediaPlayer;-><init>()V

    .line 18
    .line 19
    iput-object p1, p0, Lh/b;->a:Landroid/media/MediaPlayer;

    .line 20
    .line 21
    new-instance p1, Lh/b$a;

    .line 22
    .line 23
    .line 24
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-direct {p1, p0, v0}, Lh/b$a;-><init>(Lh/b;Landroid/os/Looper;)V

    .line 29
    .line 30
    iput-object p1, p0, Lh/b;->c:Landroid/os/Handler;

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
.end method

.method public static synthetic a(Lh/b;)Landroid/os/Handler;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lh/b;->c:Landroid/os/Handler;

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
.end method

.method public static synthetic c(Lh/b;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lh/b;->b(I)V

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
.end method

.method public static synthetic d(Lh/b;)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lh/b;->d:J

    .line 3
    return-wide v0
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
.end method


# virtual methods
.method public final b(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lh/b;->c:Landroid/os/Handler;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const/16 v1, 0x5dc

    .line 11
    .line 12
    iput v1, v0, Landroid/os/Message;->what:I

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object p1, p0, Lh/b;->c:Landroid/os/Handler;

    .line 21
    .line 22
    iget-wide v1, p0, Lh/b;->d:J

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 26
    :cond_0
    return-void
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
.end method

.method public e()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lh/b;->c:Landroid/os/Handler;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/16 v1, 0x5dc

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    .line 12
    iput-object v0, p0, Lh/b;->c:Landroid/os/Handler;

    .line 13
    .line 14
    iput-object v0, p0, Lh/b;->b:Landroid/content/Context;

    .line 15
    .line 16
    iget-object v1, p0, Lh/b;->a:Landroid/media/MediaPlayer;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    .line 21
    :try_start_0
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->reset()V

    .line 22
    .line 23
    iget-object v1, p0, Lh/b;->a:Landroid/media/MediaPlayer;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->release()V

    .line 27
    .line 28
    iput-object v0, p0, Lh/b;->a:Landroid/media/MediaPlayer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    :catch_0
    :cond_1
    return-void
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
.end method

.method public f(IZJ)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lh/b;->a:Landroid/media/MediaPlayer;

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    const/4 v0, -0x1

    .line 6
    .line 7
    if-eq p1, v0, :cond_2

    .line 8
    .line 9
    iget-boolean v0, p0, Lh/b;->f:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_0
    iput-wide p3, p0, Lh/b;->d:J

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lh/b;->g()V

    .line 18
    .line 19
    :try_start_0
    iget-object p3, p0, Lh/b;->b:Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 23
    move-result-object p3

    .line 24
    .line 25
    .line 26
    invoke-virtual {p3, p1}, Landroid/content/res/Resources;->openRawResourceFd(I)Landroid/content/res/AssetFileDescriptor;

    .line 27
    move-result-object p3

    .line 28
    .line 29
    iget-object v0, p0, Lh/b;->a:Landroid/media/MediaPlayer;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p3}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    .line 36
    invoke-virtual {p3}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    .line 37
    move-result-wide v2

    .line 38
    .line 39
    .line 40
    invoke-virtual {p3}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    .line 41
    move-result-wide v4

    .line 42
    .line 43
    .line 44
    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3}, Landroid/content/res/AssetFileDescriptor;->close()V

    .line 48
    .line 49
    iget-object p3, p0, Lh/b;->a:Landroid/media/MediaPlayer;

    .line 50
    .line 51
    new-instance p4, Lh/b$b;

    .line 52
    .line 53
    .line 54
    invoke-direct {p4, p0}, Lh/b$b;-><init>(Lh/b;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p3, p4}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 58
    .line 59
    if-eqz p2, :cond_1

    .line 60
    .line 61
    iget-object p2, p0, Lh/b;->a:Landroid/media/MediaPlayer;

    .line 62
    .line 63
    new-instance p3, Lh/b$c;

    .line 64
    .line 65
    .line 66
    invoke-direct {p3, p0, p1}, Lh/b$c;-><init>(Lh/b;I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, p3}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 70
    .line 71
    :cond_1
    iget-object p1, p0, Lh/b;->a:Landroid/media/MediaPlayer;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepareAsync()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    :catch_0
    :cond_2
    :goto_0
    return-void
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
.end method

.method public g()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lh/b;->c:Landroid/os/Handler;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/16 v1, 0x5dc

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lh/b;->a:Landroid/media/MediaPlayer;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    :catch_0
    :cond_1
    return-void
    .line 18
    .line 19
    .line 20
.end method

.method public h(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lh/b;->f:Z

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lh/b;->g()V

    .line 8
    :cond_0
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
.end method
