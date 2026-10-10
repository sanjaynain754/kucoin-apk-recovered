.class public La3d20260409/h$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La3d20260409/h;->b0()V
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
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:La3d20260409/h;


# direct methods
.method public constructor <init>(La3d20260409/h;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, La3d20260409/h$e;->b:La3d20260409/h;

    .line 3
    .line 4
    iput-object p2, p0, La3d20260409/h$e;->a:Ljava/lang/String;

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
    invoke-virtual {p0}, La3d20260409/h$e;->b()Lg/c;

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
    .locals 4

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 3
    .line 4
    iget-object v1, p0, La3d20260409/h$e;->a:Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string/jumbo v1, "timeoutLimit"

    .line 11
    .line 12
    sget-wide v2, La3d20260409/s;->i:J

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1, v2}, Lk/g;->i(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const-string/jumbo v1, "resultPictureSize"

    .line 23
    .line 24
    .line 25
    invoke-static {}, La3d20260409/s;->l()I

    .line 26
    move-result v2

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1, v2}, Lk/g;->i(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    .line 35
    const-string v1, "jniVersion"

    .line 36
    .line 37
    .line 38
    invoke-static {}, La3d20260409/s;->k()Ljava/lang/String;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Lk/g;->i(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 43
    .line 44
    const-string v1, "auditConfig"

    .line 45
    .line 46
    iget-object v2, p0, La3d20260409/h$e;->b:La3d20260409/h;

    .line 47
    .line 48
    iget-object v2, v2, La3d20260409/h;->j:La3d20260409/f;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, La3d20260409/f;->s0()Lorg/json/JSONObject;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1, v2}, Lk/g;->i(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 56
    .line 57
    new-instance v1, Lg/c$b;

    .line 58
    .line 59
    const-string v2, "configs"

    .line 60
    .line 61
    .line 62
    invoke-direct {v1, v2}, Lg/c$b;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v0}, Lg/c$b;->b(Lorg/json/JSONObject;)Lg/c$b;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lg/c$b;->d()Lg/c;

    .line 70
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    return-object v0

    .line 72
    :catch_0
    move-exception v0

    .line 73
    .line 74
    iget-object v1, p0, La3d20260409/h$e;->b:La3d20260409/h;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v0}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 78
    const/4 v0, 0x0

    .line 79
    return-object v0
    .line 80
.end method
