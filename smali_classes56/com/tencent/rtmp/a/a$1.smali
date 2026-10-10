.class final Lcom/tencent/rtmp/a/a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/rtmp/a/a;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/rtmp/a/a;


# direct methods
.method public constructor <init>(Lcom/tencent/rtmp/a/a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/rtmp/a/a$1;->a:Lcom/tencent/rtmp/a/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rtmp/a/a$1;->a:Lcom/tencent/rtmp/a/a;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/rtmp/a/a;->a(Lcom/tencent/rtmp/a/a;)Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/rtmp/a/a$1;->a:Lcom/tencent/rtmp/a/a;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/tencent/rtmp/a/a;->a(Lcom/tencent/rtmp/a/a;)Ljava/util/List;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/tencent/rtmp/a/a$1;->a:Lcom/tencent/rtmp/a/a;

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lcom/tencent/rtmp/a/a;->b(Lcom/tencent/rtmp/a/a;)Ljava/util/Map;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    iget-object v0, p0, Lcom/tencent/rtmp/a/a$1;->a:Lcom/tencent/rtmp/a/a;

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lcom/tencent/rtmp/a/a;->b(Lcom/tencent/rtmp/a/a;)Ljava/util/Map;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    move-result v1

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    check-cast v1, Landroid/graphics/BitmapRegionDecoder;

    .line 52
    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Landroid/graphics/BitmapRegionDecoder;->recycle()V

    .line 57
    goto :goto_0

    .line 58
    .line 59
    :cond_2
    iget-object v0, p0, Lcom/tencent/rtmp/a/a$1;->a:Lcom/tencent/rtmp/a/a;

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, Lcom/tencent/rtmp/a/a;->b(Lcom/tencent/rtmp/a/a;)Ljava/util/Map;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 67
    :cond_3
    return-void
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
.end method
