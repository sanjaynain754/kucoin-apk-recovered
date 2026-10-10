.class public Lv5/c;
.super Ljava/lang/Object;
.source "ImageDecoderConfig.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv5/c$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/facebook/imageformat/ImageFormat;",
            "Lv5/b;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/imageformat/ImageFormat$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv5/c$a;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lv5/c$a;->a(Lv5/c$a;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lv5/c;->a:Ljava/util/Map;

    .line 4
    invoke-static {p1}, Lv5/c$a;->b(Lv5/c$a;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lv5/c;->b:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lv5/c$a;Lv5/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lv5/c;-><init>(Lv5/c$a;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/facebook/imageformat/ImageFormat;",
            "Lv5/b;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lv5/c;->a:Ljava/util/Map;

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
    .line 18
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/facebook/imageformat/ImageFormat$a;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lv5/c;->b:Ljava/util/List;

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
    .line 18
.end method
