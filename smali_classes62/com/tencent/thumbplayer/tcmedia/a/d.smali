.class public Lcom/tencent/thumbplayer/tcmedia/a/d;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/tencent/thumbplayer/tcmedia/adapter/a/a;
.implements Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/ITPImageGeneratorCallback;


# instance fields
.field private a:J

.field private b:Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGenerator;

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/tencent/thumbplayer/tcmedia/api/TPCaptureCallBack;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 6

    .line 1
    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    move v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/tencent/thumbplayer/tcmedia/a/d;-><init>(IJJ)V

    return-void
.end method

.method public constructor <init>(IJJ)V
    .locals 9

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tencent/thumbplayer/tcmedia/a/d;->a:J

    new-instance v2, Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGenerator;

    move-object v8, p0

    move v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v2 .. v8}, Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGenerator;-><init>(IJJLcom/tencent/thumbplayer/tcmedia/core/imagegenerator/ITPImageGeneratorCallback;)V

    iput-object v2, v8, Lcom/tencent/thumbplayer/tcmedia/a/d;->b:Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGenerator;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, v8, Lcom/tencent/thumbplayer/tcmedia/a/d;->c:Ljava/util/Map;

    :try_start_0
    iget-object p1, v8, Lcom/tencent/thumbplayer/tcmedia/a/d;->b:Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGenerator;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGenerator;->init()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "init: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "TPThumbPlayer[TPThumbCapture.java]"

    invoke-static {p2, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tencent/thumbplayer/tcmedia/a/d;->a:J

    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGenerator;

    invoke-direct {v0, p1, p0}, Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGenerator;-><init>(Ljava/lang/String;Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/ITPImageGeneratorCallback;)V

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/a/d;->b:Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGenerator;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/a/d;->c:Ljava/util/Map;

    :try_start_0
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/a/d;->b:Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGenerator;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGenerator;->init()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "init: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "TPThumbPlayer[TPThumbCapture.java]"

    invoke-static {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/a/d;->b:Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGenerator;

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGenerator;->cancelAllImageGenerations()V

    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/a/d;->b:Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGenerator;

    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGenerator;->unInit()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "release: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TPThumbPlayer[TPThumbCapture.java]"

    invoke-static {v1, v0}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/a/d;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/thumbplayer/tcmedia/a/d;->b:Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGenerator;

    return-void
.end method

.method public a(JLcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGeneratorParams;Lcom/tencent/thumbplayer/tcmedia/api/TPCaptureCallBack;)V
    .locals 7

    .line 2
    if-nez p3, :cond_0

    new-instance p3, Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGeneratorParams;

    invoke-direct {p3}, Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGeneratorParams;-><init>()V

    const/16 v0, 0x25

    iput v0, p3, Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGeneratorParams;->format:I

    :cond_0
    move-object v6, p3

    iget-wide v0, p0, Lcom/tencent/thumbplayer/tcmedia/a/d;->a:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/tencent/thumbplayer/tcmedia/a/d;->a:J

    iget-object p3, p0, Lcom/tencent/thumbplayer/tcmedia/a/d;->c:Ljava/util/Map;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p3, v0, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v1, p0, Lcom/tencent/thumbplayer/tcmedia/a/d;->b:Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGenerator;

    iget-wide v4, p0, Lcom/tencent/thumbplayer/tcmedia/a/d;->a:J

    move-wide v2, p1

    invoke-virtual/range {v1 .. v6}, Lcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGenerator;->generateImageAsyncAtTime(JJLcom/tencent/thumbplayer/tcmedia/core/imagegenerator/TPImageGeneratorParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "generateImageAsyncAtTime: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "TPThumbPlayer[TPThumbCapture.java]"

    invoke-static {p2, p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onImageGenerationCompleted(IJJJLcom/tencent/thumbplayer/tcmedia/core/common/TPVideoFrame;)V
    .locals 0

    .line 1
    .line 2
    iget-object p2, p0, Lcom/tencent/thumbplayer/tcmedia/a/d;->c:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-static {p6, p7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    move-result-object p3

    .line 7
    .line 8
    .line 9
    invoke-interface {p2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    move-result-object p2

    .line 11
    .line 12
    check-cast p2, Lcom/tencent/thumbplayer/tcmedia/api/TPCaptureCallBack;

    .line 13
    .line 14
    if-eqz p2, :cond_2

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    if-eqz p8, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-static {p8}, Lcom/tencent/thumbplayer/tcmedia/a/a;->a(Lcom/tencent/thumbplayer/tcmedia/core/common/TPVideoFrame;)Landroid/graphics/Bitmap;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-interface {p2, p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPCaptureCallBack;->onCaptureVideoSuccess(Landroid/graphics/Bitmap;)V

    .line 28
    goto :goto_0

    .line 29
    .line 30
    .line 31
    :cond_0
    const p1, 0xf4241

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-interface {p2, p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPCaptureCallBack;->onCaptureVideoFailed(I)V

    .line 35
    .line 36
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/tencent/thumbplayer/tcmedia/a/d;->c:Ljava/util/Map;

    .line 37
    .line 38
    .line 39
    invoke-static {p6, p7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    move-result-object p2

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    return-void
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
.end method
