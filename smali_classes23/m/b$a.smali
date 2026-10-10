.class public Lm/b$a;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm/b;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lm/b;


# direct methods
.method public constructor <init>(Lm/b;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lm/b$a;->b:Lm/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

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
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    .line 2
    const-string v0, "camera_numbers"

    .line 3
    .line 4
    const-string v1, "back_camera_id"

    .line 5
    .line 6
    const-string v2, "front_camera_id"

    .line 7
    .line 8
    :try_start_0
    iget-object v3, p0, Lm/b$a;->b:Lm/b;

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lk/c;->f()I

    .line 12
    move-result v4

    .line 13
    .line 14
    .line 15
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    move-result-object v4

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3, v2, v4}, Lm/b;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    iget-object v3, p0, Lm/b$a;->b:Lm/b;

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lk/c;->d()I

    .line 25
    move-result v4

    .line 26
    .line 27
    .line 28
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    move-result-object v4

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v1, v4}, Lm/b;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    .line 34
    iget-object v3, p0, Lm/b$a;->b:Lm/b;

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lk/c;->g()I

    .line 38
    move-result v4

    .line 39
    .line 40
    .line 41
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    move-result-object v4

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v0, v4}, Lm/b;->k(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    return-void

    .line 47
    .line 48
    :catch_0
    iget-object v3, p0, Lm/b$a;->b:Lm/b;

    .line 49
    const/4 v4, -0x1

    .line 50
    .line 51
    .line 52
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    move-result-object v5

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v2, v5}, Lm/b;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 57
    .line 58
    iget-object v2, p0, Lm/b$a;->b:Lm/b;

    .line 59
    .line 60
    .line 61
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    move-result-object v3

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v1, v3}, Lm/b;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 66
    .line 67
    iget-object v1, p0, Lm/b$a;->b:Lm/b;

    .line 68
    .line 69
    .line 70
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    move-result-object v2

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v0, v2}, Lm/b;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 75
    return-void
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
.end method
