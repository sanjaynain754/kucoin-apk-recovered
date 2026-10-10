.class public Lcom/kubi/resources/widget/slider/BaseSlider$d;
.super Ljava/lang/Object;
.source "BaseSlider.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/resources/widget/slider/BaseSlider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public b:I

.field public final synthetic c:Lcom/kubi/resources/widget/slider/BaseSlider;


# direct methods
.method public constructor <init>(Lcom/kubi/resources/widget/slider/BaseSlider;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kubi/resources/widget/slider/BaseSlider$d;->c:Lcom/kubi/resources/widget/slider/BaseSlider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/slider/BaseSlider$d;->b:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/kubi/resources/widget/slider/BaseSlider;Lcom/kubi/resources/widget/slider/BaseSlider$a;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/kubi/resources/widget/slider/BaseSlider$d;-><init>(Lcom/kubi/resources/widget/slider/BaseSlider;)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/slider/BaseSlider$d;->b:I

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public run()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/slider/BaseSlider$d;->c:Lcom/kubi/resources/widget/slider/BaseSlider;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/resources/widget/slider/BaseSlider;->c(Lcom/kubi/resources/widget/slider/BaseSlider;)Lcom/kubi/resources/widget/slider/BaseSlider$e;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget v1, p0, Lcom/kubi/resources/widget/slider/BaseSlider$d;->b:I

    .line 9
    const/4 v2, 0x4

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Landroidx/customview/widget/ExploreByTouchHelper;->sendEventForVirtualView(II)Z

    .line 13
    return-void
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
.end method
