.class public Lcom/tencent/bugly/proguard/r1$a;
.super Lcom/tencent/bugly/proguard/kg;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# static fields
.field public static final e:I = 0x1


# instance fields
.field public final b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/tencent/bugly/proguard/yf;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Landroid/os/Handler;

.field public final synthetic d:Lcom/tencent/bugly/proguard/r1;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/r1;)V
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/r1$a;->d:Lcom/tencent/bugly/proguard/r1;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/kg;-><init>()V

    .line 6
    .line 7
    new-instance p1, Landroid/util/SparseArray;

    .line 8
    .line 9
    .line 10
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 11
    .line 12
    iput-object p1, p0, Lcom/tencent/bugly/proguard/r1$a;->b:Landroid/util/SparseArray;

    .line 13
    .line 14
    new-instance p1, Lcom/tencent/bugly/proguard/r1$a$a;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-direct {p1, p0, v0}, Lcom/tencent/bugly/proguard/r1$a$a;-><init>(Lcom/tencent/bugly/proguard/r1$a;Landroid/os/Looper;)V

    .line 22
    .line 23
    iput-object p1, p0, Lcom/tencent/bugly/proguard/r1$a;->c:Landroid/os/Handler;

    .line 24
    return-void
    .line 25
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/r1$a;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/r1$a;->a(Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)V
    .locals 5
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    .line 4
    new-instance v2, Lcom/tencent/bugly/proguard/yf;

    const/4 v3, 0x0

    .line 5
    invoke-static {p1, v3}, Lcom/tencent/bugly/common/util/ClassUtil;->getClassName(Ljava/lang/Object;Ljava/lang/Integer;)Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, Lcom/tencent/bugly/proguard/r1$a;->d:Lcom/tencent/bugly/proguard/r1;

    .line 6
    iget-object v4, v3, Lcom/tencent/bugly/proguard/r1;->c:Lcom/tencent/bugly/proguard/q1;

    .line 7
    iget-object v3, v3, Lcom/tencent/bugly/proguard/r1;->d:Lcom/tencent/bugly/proguard/s1;

    .line 8
    invoke-direct {v2, p1, v0, v4, v3}, Lcom/tencent/bugly/proguard/yf;-><init>(Ljava/lang/String;Landroid/view/View;Lcom/tencent/bugly/proguard/q1;Lcom/tencent/bugly/proguard/s1;)V

    .line 9
    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 10
    iget-object p1, p0, Lcom/tencent/bugly/proguard/r1$a;->b:Landroid/util/SparseArray;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p1, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public onDestroy(Landroid/app/Activity;)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/r1$a;->c:Landroid/os/Handler;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iget-object v1, p0, Lcom/tencent/bugly/proguard/r1$a;->b:Landroid/util/SparseArray;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 24
    move-result p1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    check-cast p1, Lcom/tencent/bugly/proguard/yf;

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverJellyBean()Z

    .line 36
    move-result v1

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 42
    :cond_0
    return-void
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
.end method

.method public onPostCreate(Landroid/app/Activity;)V
    .locals 3
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/tencent/bugly/proguard/r1$a;->d:Lcom/tencent/bugly/proguard/r1;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lcom/tencent/bugly/proguard/r1;->b(Ljava/lang/String;)Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 19
    .line 20
    const-string v1, "RMonitor_BigBitmap_Monitor"

    .line 21
    .line 22
    const-string v2, " is excluded"

    .line 23
    .line 24
    .line 25
    filled-new-array {v1, v0, v2}, [Ljava/lang/String;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 30
    return-void

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverN()Z

    .line 34
    move-result v0

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/r1$a;->a(Landroid/app/Activity;)V

    .line 40
    return-void

    .line 41
    .line 42
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/r1$a;->c:Landroid/os/Handler;

    .line 43
    const/4 v1, 0x1

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 51
    return-void
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
.end method
