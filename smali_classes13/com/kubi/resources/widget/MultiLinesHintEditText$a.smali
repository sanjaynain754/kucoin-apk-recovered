.class public final Lcom/kubi/resources/widget/MultiLinesHintEditText$a;
.super Ljava/lang/Object;
.source "MultiLinesHintEditText.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/resources/widget/MultiLinesHintEditText;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "com/kubi/resources/widget/MultiLinesHintEditText$cursorBlinkRunnable$1",
        "Ljava/lang/Runnable;",
        "run",
        "",
        "LComponent_googleRelease"
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
.field public final synthetic b:Lcom/kubi/resources/widget/MultiLinesHintEditText;


# direct methods
.method public constructor <init>(Lcom/kubi/resources/widget/MultiLinesHintEditText;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/MultiLinesHintEditText$a;->b:Lcom/kubi/resources/widget/MultiLinesHintEditText;

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/MultiLinesHintEditText$a;->b:Lcom/kubi/resources/widget/MultiLinesHintEditText;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/resources/widget/MultiLinesHintEditText;->f(Lcom/kubi/resources/widget/MultiLinesHintEditText;)Z

    .line 6
    move-result v1

    .line 7
    .line 8
    xor-int/lit8 v1, v1, 0x1

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/kubi/resources/widget/MultiLinesHintEditText;->g(Lcom/kubi/resources/widget/MultiLinesHintEditText;Z)V

    .line 12
    .line 13
    iget-object v0, p0, Lcom/kubi/resources/widget/MultiLinesHintEditText$a;->b:Lcom/kubi/resources/widget/MultiLinesHintEditText;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 17
    .line 18
    iget-object v0, p0, Lcom/kubi/resources/widget/MultiLinesHintEditText$a;->b:Lcom/kubi/resources/widget/MultiLinesHintEditText;

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/kubi/resources/widget/MultiLinesHintEditText;->e(Lcom/kubi/resources/widget/MultiLinesHintEditText;)J

    .line 22
    move-result-wide v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method
