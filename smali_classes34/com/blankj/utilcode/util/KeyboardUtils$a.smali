.class public final Lcom/blankj/utilcode/util/KeyboardUtils$a;
.super Ljava/lang/Object;
.source "KeyboardUtils.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/blankj/utilcode/util/KeyboardUtils;->k(Landroid/view/Window;Lcom/blankj/utilcode/util/KeyboardUtils$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/view/Window;

.field public final synthetic c:[I

.field public final synthetic d:Lcom/blankj/utilcode/util/KeyboardUtils$b;


# direct methods
.method public constructor <init>(Landroid/view/Window;[ILcom/blankj/utilcode/util/KeyboardUtils$b;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/blankj/utilcode/util/KeyboardUtils$a;->b:Landroid/view/Window;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/blankj/utilcode/util/KeyboardUtils$a;->c:[I

    .line 5
    .line 6
    iput-object p3, p0, Lcom/blankj/utilcode/util/KeyboardUtils$a;->d:Lcom/blankj/utilcode/util/KeyboardUtils$b;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    return-void
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
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/blankj/utilcode/util/KeyboardUtils$a;->b:Landroid/view/Window;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/blankj/utilcode/util/KeyboardUtils;->a(Landroid/view/Window;)I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/blankj/utilcode/util/KeyboardUtils$a;->c:[I

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    aget v1, v1, v2

    .line 12
    .line 13
    if-eq v1, v0, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/blankj/utilcode/util/KeyboardUtils$a;->d:Lcom/blankj/utilcode/util/KeyboardUtils$b;

    .line 16
    .line 17
    .line 18
    invoke-interface {v1, v0}, Lcom/blankj/utilcode/util/KeyboardUtils$b;->a(I)V

    .line 19
    .line 20
    iget-object v1, p0, Lcom/blankj/utilcode/util/KeyboardUtils$a;->c:[I

    .line 21
    .line 22
    aput v0, v1, v2

    .line 23
    :cond_0
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
.end method
