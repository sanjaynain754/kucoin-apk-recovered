.class public Lc9/b$b;
.super Ljava/lang/Object;
.source "CameraInstance.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc9/b;->q(Lc9/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lc9/i;

.field public final synthetic c:Lc9/b;


# direct methods
.method public constructor <init>(Lc9/b;Lc9/i;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lc9/b$b;->c:Lc9/b;

    .line 3
    .line 4
    iput-object p2, p0, Lc9/b$b;->b:Lc9/i;

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
.method public run()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lc9/b$b;->c:Lc9/b;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lc9/b;->b(Lc9/b;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lc9/b;->c()Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    const-string v1, "Camera is closed, not requesting preview"

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    return-void

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lc9/b$b;->c:Lc9/b;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lc9/b;->d(Lc9/b;)Lc9/d;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    new-instance v1, Lc9/b$b$a;

    .line 27
    .line 28
    .line 29
    invoke-direct {v1, p0}, Lc9/b$b$a;-><init>(Lc9/b$b;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lc9/d;->c(Ljava/lang/Runnable;)V

    .line 33
    return-void
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
.end method
