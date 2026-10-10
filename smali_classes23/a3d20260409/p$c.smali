.class public La3d20260409/p$c;
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
.field public final synthetic b:[Ljava/io/File;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Lg/e;


# direct methods
.method public constructor <init>([Ljava/io/File;Landroid/content/Context;Lg/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, La3d20260409/p$c;->b:[Ljava/io/File;

    .line 3
    .line 4
    iput-object p2, p0, La3d20260409/p$c;->c:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p3, p0, La3d20260409/p$c;->d:Lg/e;

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
.method public run()V
    .locals 8

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, La3d20260409/j3d20260409;->OOOOooOOOO()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, La3d20260409/p$c;->b:[Ljava/io/File;

    .line 7
    array-length v2, v1

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    :goto_0
    if-ge v3, v2, :cond_2

    .line 11
    .line 12
    aget-object v4, v1, v3

    .line 13
    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 18
    move-result v5

    .line 19
    .line 20
    if-eqz v5, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 24
    move-result-object v5

    .line 25
    .line 26
    .line 27
    invoke-virtual {v5, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 28
    move-result v6

    .line 29
    .line 30
    if-eqz v6, :cond_1

    .line 31
    .line 32
    iget-object v6, p0, La3d20260409/p$c;->c:Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    invoke-static {v6, v5}, Lk/d;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    move-result-object v5

    .line 37
    .line 38
    .line 39
    invoke-static {v5}, La3d20260409/j3d20260409;->Oo0o0oo(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    move-result-object v5

    .line 41
    .line 42
    if-nez v5, :cond_0

    .line 43
    goto :goto_1

    .line 44
    .line 45
    :cond_0
    sget-object v6, Lintl/oOooooooooooooo;->OoooOOOoooooo:Lintl/oOooooooooooooo;

    .line 46
    .line 47
    iget-object v7, p0, La3d20260409/p$c;->d:Lg/e;

    .line 48
    .line 49
    .line 50
    invoke-static {v6, v5, v7}, La3d20260409/l;->b(Lintl/oOooooooooooooo;Ljava/lang/String;Lg/e;)Landroid/util/Pair;

    .line 51
    move-result-object v5

    .line 52
    .line 53
    iget-object v5, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v5, Ln/h;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5}, Ln/h;->a()Ljava/lang/String;

    .line 59
    move-result-object v5

    .line 60
    .line 61
    const-class v6, Laai/liveness/http/entity/ResultEntity;

    .line 62
    .line 63
    .line 64
    invoke-static {v5, v6}, Lk/g;->h(Ljava/lang/String;Ljava/lang/Class;)Lai/advance/common/entity/BaseResultEntity;

    .line 65
    move-result-object v5

    .line 66
    .line 67
    check-cast v5, Laai/liveness/http/entity/ResultEntity;

    .line 68
    .line 69
    iget-boolean v5, v5, Lai/advance/common/entity/BaseResultEntity;->success:Z

    .line 70
    .line 71
    if-eqz v5, :cond_1

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    .line 76
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 77
    goto :goto_0

    .line 78
    :catch_0
    :cond_2
    :goto_1
    return-void
    .line 79
    .line 80
.end method
