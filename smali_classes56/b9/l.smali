.class public Lb9/l;
.super Ljava/lang/Object;
.source "RotationListener.java"


# instance fields
.field public a:I

.field public b:Landroid/view/WindowManager;

.field public c:Landroid/view/OrientationEventListener;

.field public d:Lb9/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static synthetic a(Lb9/l;)Landroid/view/WindowManager;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lb9/l;->b:Landroid/view/WindowManager;

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

.method public static synthetic b(Lb9/l;)Lb9/k;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lb9/l;->d:Lb9/k;

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

.method public static synthetic c(Lb9/l;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lb9/l;->a:I

    .line 3
    return p0
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

.method public static synthetic d(Lb9/l;I)I
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lb9/l;->a:I

    .line 3
    return p1
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
.method public e(Landroid/content/Context;Lb9/k;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lb9/l;->f()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    iput-object p2, p0, Lb9/l;->d:Lb9/k;

    .line 10
    .line 11
    const-string p2, "window"

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    move-result-object p2

    .line 16
    .line 17
    check-cast p2, Landroid/view/WindowManager;

    .line 18
    .line 19
    iput-object p2, p0, Lb9/l;->b:Landroid/view/WindowManager;

    .line 20
    .line 21
    new-instance p2, Lb9/l$a;

    .line 22
    const/4 v0, 0x3

    .line 23
    .line 24
    .line 25
    invoke-direct {p2, p0, p1, v0}, Lb9/l$a;-><init>(Lb9/l;Landroid/content/Context;I)V

    .line 26
    .line 27
    iput-object p2, p0, Lb9/l;->c:Landroid/view/OrientationEventListener;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Landroid/view/OrientationEventListener;->enable()V

    .line 31
    .line 32
    iget-object p1, p0, Lb9/l;->b:Landroid/view/WindowManager;

    .line 33
    .line 34
    .line 35
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/Display;->getRotation()I

    .line 40
    move-result p1

    .line 41
    .line 42
    iput p1, p0, Lb9/l;->a:I

    .line 43
    return-void
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public f()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lb9/l;->c:Landroid/view/OrientationEventListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/OrientationEventListener;->disable()V

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-object v0, p0, Lb9/l;->c:Landroid/view/OrientationEventListener;

    .line 11
    .line 12
    iput-object v0, p0, Lb9/l;->b:Landroid/view/WindowManager;

    .line 13
    .line 14
    iput-object v0, p0, Lb9/l;->d:Lb9/k;

    .line 15
    return-void
    .line 16
.end method
