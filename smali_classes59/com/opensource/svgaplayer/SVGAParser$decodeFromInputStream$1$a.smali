.class public final Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1$a;
.super Ljava/lang/Object;
.source "SVGAParser.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "run",
        "com/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1$1$2"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xf
    }
.end annotation


# instance fields
.field public final synthetic b:[B

.field public final synthetic c:Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1;


# direct methods
.method public constructor <init>([BLcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1$a;->b:[B

    .line 3
    .line 4
    iput-object p2, p0, Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1$a;->c:Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lcom/opensource/svgaplayer/SVGACache;->c:Lcom/opensource/svgaplayer/SVGACache;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1$a;->c:Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1;

    .line 5
    .line 6
    iget-object v1, v1, Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1;->d:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/opensource/svgaplayer/SVGACache;->e(Ljava/lang/String;)Ljava/io/File;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    move-object v1, v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    .line 21
    :goto_0
    if-eqz v1, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    .line 25
    goto :goto_1

    .line 26
    :catch_0
    move-exception v1

    .line 27
    goto :goto_2

    .line 28
    .line 29
    :cond_1
    :goto_1
    new-instance v1, Ljava/io/FileOutputStream;

    .line 30
    .line 31
    .line 32
    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 33
    .line 34
    iget-object v2, p0, Lcom/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1$a;->b:[B

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/io/FileOutputStream;->write([B)V

    .line 38
    .line 39
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    return-void

    .line 41
    .line 42
    :goto_2
    sget-object v2, Lk90/c;->a:Lk90/c;

    .line 43
    .line 44
    const-string v3, "SVGAParser"

    .line 45
    .line 46
    const-string v4, "create cache file fail."

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v3, v4, v1}, Lk90/c;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 53
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
.end method
