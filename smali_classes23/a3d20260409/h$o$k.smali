.class public La3d20260409/h$o$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La3d20260409/h$o;->u()V
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
.field public final synthetic a:La3d20260409/h$o;


# direct methods
.method public constructor <init>(La3d20260409/h$o;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, La3d20260409/h$o$k;->a:La3d20260409/h$o;

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
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, La3d20260409/h$o$k;->b()Lg/b;

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
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lg/b$b;

    .line 3
    .line 4
    sget-object v1, Lintl/OoooOOOoooooo;->o0oOOOOOooooo:Lintl/OoooOOOoooooo;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lg/b$b;-><init>(Ljava/lang/Object;)V

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lg/b$b;->e(Z)Lg/b$b;

    .line 12
    .line 13
    iget-object v1, p0, La3d20260409/h$o$k;->a:La3d20260409/h$o;

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, La3d20260409/h$o;->G(La3d20260409/h$o;)I

    .line 17
    move-result v1

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    const-string v2, "face_captured_times"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2, v1}, Lg/b$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lg/b$b;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lwe0/f;->J()Lwe0/f;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    sget-object v2, Lintl/o0oOOOOOooooo;->ooooOOOOO:Lintl/o0oOOOOOooooo;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    iget-object v3, p0, La3d20260409/h$o$k;->a:La3d20260409/h$o;

    .line 39
    .line 40
    iget-object v3, v3, La3d20260409/h$o;->w:La3d20260409/h;

    .line 41
    .line 42
    .line 43
    invoke-static {v3}, La3d20260409/h;->l0(La3d20260409/h;)Lg/e;

    .line 44
    move-result-object v3

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2, v3}, Lf/h;->B(Ljava/lang/String;Lg/e;)Ljava/lang/Long;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 54
    move-result-wide v2

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 58
    move-result-wide v4

    .line 59
    sub-long/2addr v2, v4

    .line 60
    long-to-int v1, v2

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Lg/b$b;->a(I)Lg/b$b;

    .line 64
    .line 65
    .line 66
    :cond_0
    invoke-virtual {v0}, Lg/b$b;->f()Lg/b;

    .line 67
    move-result-object v0

    .line 68
    return-object v0
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
