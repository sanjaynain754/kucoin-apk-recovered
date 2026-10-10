.class public La3d20260409/p$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La3d20260409/p;->a(Landroid/content/Context;Lg/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lg/e;


# direct methods
.method public constructor <init>(Lg/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, La3d20260409/p$b;->b:Lg/e;

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
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, La3d20260409/j3d20260409;->oOo0oOo()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    new-instance v2, La3d20260409/p$b$b;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2, p0, v0}, La3d20260409/p$b$b;-><init>(La3d20260409/p$b;Ljava/lang/String;)V

    .line 17
    .line 18
    iget-object v3, p0, La3d20260409/p$b;->b:Lg/e;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2, v3}, Lf/h;->y(Lg/a;Lg/e;)V

    .line 22
    .line 23
    sget-object v1, Lintl/oOooooooooooooo;->oOoOOOOOooooo:Lintl/oOooooooooooooo;

    .line 24
    .line 25
    iget-object v2, p0, La3d20260409/p$b;->b:Lg/e;

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v0, v2}, La3d20260409/l;->b(Lintl/oOooooooooooooo;Ljava/lang/String;Lg/e;)Landroid/util/Pair;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Ln/h;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ln/h;->a()Ljava/lang/String;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    const-class v3, Laai/liveness/http/entity/ResultEntity;

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v3}, Lk/g;->h(Ljava/lang/String;Ljava/lang/Class;)Lai/advance/common/entity/BaseResultEntity;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    check-cast v2, Laai/liveness/http/entity/ResultEntity;

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 49
    move-result-object v3

    .line 50
    .line 51
    new-instance v4, La3d20260409/p$b$a;

    .line 52
    .line 53
    .line 54
    invoke-direct {v4, p0, v2, v0, v1}, La3d20260409/p$b$a;-><init>(La3d20260409/p$b;Laai/liveness/http/entity/ResultEntity;Ljava/lang/String;Landroid/util/Pair;)V

    .line 55
    .line 56
    iget-object v0, p0, La3d20260409/p$b;->b:Lg/e;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v4, v0}, Lf/h;->y(Lg/a;Lg/e;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    :catch_0
    :goto_0
    return-void
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
.end method
