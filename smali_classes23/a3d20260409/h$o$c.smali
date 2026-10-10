.class public La3d20260409/h$o$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La3d20260409/h$o;->n(La3d20260409/c;La3d20260409/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg/a<",
        "Lg/c;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:La3d20260409/b;

.field public final synthetic b:La3d20260409/h$o;


# direct methods
.method public constructor <init>(La3d20260409/h$o;La3d20260409/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, La3d20260409/h$o$c;->b:La3d20260409/h$o;

    .line 3
    .line 4
    iput-object p2, p0, La3d20260409/h$o$c;->a:La3d20260409/b;

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
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, La3d20260409/h$o$c;->b()Lg/c;

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

.method public b()Lg/c;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lg/c$b;

    .line 3
    .line 4
    const-string v1, "blink_image_update"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lg/c$b;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v1, p0, La3d20260409/h$o$c;->b:La3d20260409/h$o;

    .line 10
    .line 11
    iget-wide v1, v1, La3d20260409/h$o;->e:D

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    const-string/jumbo v2, "oldValue"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2, v1}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iget-object v1, p0, La3d20260409/h$o$c;->a:La3d20260409/b;

    .line 25
    .line 26
    iget-wide v1, v1, La3d20260409/b;->l:D

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    const-string/jumbo v2, "newValue"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v2, v1}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    sget-object v1, Lintl/o0oOOOOOooooo;->ooooOOOOO:Lintl/o0oOOOOOooooo;

    .line 40
    .line 41
    iget-object v2, p0, La3d20260409/h$o$c;->a:La3d20260409/b;

    .line 42
    .line 43
    iget-object v2, v2, La3d20260409/b;->c:Lintl/o0oOOOOOooooo;

    .line 44
    .line 45
    if-ne v1, v2, :cond_0

    .line 46
    const/4 v1, 0x1

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 v1, 0x0

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    const-string v2, "isForceEyeClosed"

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v2, v1}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    iget-object v1, p0, La3d20260409/h$o$c;->a:La3d20260409/b;

    .line 61
    .line 62
    iget-object v1, v1, La3d20260409/b;->a:Lorg/json/JSONObject;

    .line 63
    .line 64
    .line 65
    const-string/jumbo v2, "r"

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v2, v1}, Lg/c$b;->c(Ljava/lang/String;Ljava/lang/Object;)Lg/c$b;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lg/c$b;->d()Lg/c;

    .line 73
    move-result-object v0

    .line 74
    return-object v0
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
.end method
