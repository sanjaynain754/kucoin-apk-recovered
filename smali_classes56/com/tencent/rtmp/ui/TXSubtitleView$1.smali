.class final Lcom/tencent/rtmp/ui/TXSubtitleView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/rtmp/ui/TXSubtitleView;->show(Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/graphics/Bitmap;

.field final synthetic b:Lcom/tencent/rtmp/ui/TXSubtitleView;


# direct methods
.method public constructor <init>(Lcom/tencent/rtmp/ui/TXSubtitleView;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/rtmp/ui/TXSubtitleView$1;->b:Lcom/tencent/rtmp/ui/TXSubtitleView;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/rtmp/ui/TXSubtitleView$1;->a:Landroid/graphics/Bitmap;

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
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rtmp/ui/TXSubtitleView$1;->b:Lcom/tencent/rtmp/ui/TXSubtitleView;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/rtmp/ui/TXSubtitleView;->access$000(Lcom/tencent/rtmp/ui/TXSubtitleView;)Landroid/widget/ImageView;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/tencent/rtmp/ui/TXSubtitleView$1;->a:Landroid/graphics/Bitmap;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
.end method
