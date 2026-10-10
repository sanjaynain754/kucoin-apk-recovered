.class public abstract Lcom/github/penfeizhou/animation/decode/a;
.super Ljava/lang/Object;
.source "Frame.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lcom/github/penfeizhou/animation/io/Reader;",
        "W::",
        "Lcom/github/penfeizhou/animation/io/e;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected final dstRect:Landroid/graphics/Rect;

.field public frameDuration:I

.field public frameHeight:I

.field public frameWidth:I

.field public frameX:I

.field public frameY:I

.field protected final reader:Lcom/github/penfeizhou/animation/io/Reader;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TR;"
        }
    .end annotation
.end field

.field protected final srcRect:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Lcom/github/penfeizhou/animation/io/Reader;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Rect;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/github/penfeizhou/animation/decode/a;->srcRect:Landroid/graphics/Rect;

    .line 11
    .line 12
    new-instance v0, Landroid/graphics/Rect;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/github/penfeizhou/animation/decode/a;->dstRect:Landroid/graphics/Rect;

    .line 18
    .line 19
    iput-object p1, p0, Lcom/github/penfeizhou/animation/decode/a;->reader:Lcom/github/penfeizhou/animation/io/Reader;

    .line 20
    return-void
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
.end method


# virtual methods
.method public abstract draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;ILandroid/graphics/Bitmap;Lcom/github/penfeizhou/animation/io/e;)Landroid/graphics/Bitmap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Landroid/graphics/Paint;",
            "I",
            "Landroid/graphics/Bitmap;",
            "TW;)",
            "Landroid/graphics/Bitmap;"
        }
    .end annotation
.end method
