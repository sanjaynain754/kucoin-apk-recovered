.class public La3d20260409/h$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La3d20260409/h;->k0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg/a<",
        "Lg/b;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Laai/liveness/http/entity/ResultEntity;

.field public final synthetic b:Landroid/util/Pair;

.field public final synthetic c:La3d20260409/h;


# direct methods
.method public constructor <init>(La3d20260409/h;Laai/liveness/http/entity/ResultEntity;Landroid/util/Pair;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, La3d20260409/h$f;->c:La3d20260409/h;

    .line 3
    .line 4
    iput-object p2, p0, La3d20260409/h$f;->a:Laai/liveness/http/entity/ResultEntity;

    .line 5
    .line 6
    iput-object p3, p0, La3d20260409/h$f;->b:Landroid/util/Pair;

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
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, La3d20260409/h$f;->b()Lg/b;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public b()Lg/b;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lg/b$b;

    .line 3
    .line 4
    sget-object v1, Lintl/OoooOOOoooooo;->oOOOOOooooOo:Lintl/OoooOOOoooooo;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lg/b$b;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    iget-object v1, p0, La3d20260409/h$f;->a:Laai/liveness/http/entity/ResultEntity;

    .line 10
    .line 11
    iget-boolean v1, v1, Lai/advance/common/entity/BaseResultEntity;->success:Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lg/b$b;->e(Z)Lg/b$b;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iget-object v1, p0, La3d20260409/h$f;->a:Laai/liveness/http/entity/ResultEntity;

    .line 18
    .line 19
    iget-object v1, v1, Lai/advance/common/entity/BaseResultEntity;->message:Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lg/b$b;->c(Ljava/lang/Object;)Lg/b$b;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iget-object v1, p0, La3d20260409/h$f;->b:Landroid/util/Pair;

    .line 26
    .line 27
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 33
    move-result v1

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lg/b$b;->a(I)Lg/b$b;

    .line 37
    move-result-object v0

    .line 38
    const/4 v1, 0x1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lg/b$b;->g(Z)Lg/b$b;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lg/b$b;->f()Lg/b;

    .line 46
    move-result-object v0

    .line 47
    return-object v0
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
.end method
