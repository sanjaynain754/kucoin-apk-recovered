.class public Ls/x$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/x;->p(Lu/d;Ls/g;)Ls/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lu/d;

.field public final synthetic b:Ls/x;


# direct methods
.method public constructor <init>(Ls/x;Lu/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Ls/x$d;->b:Ls/x;

    .line 3
    .line 4
    iput-object p2, p0, Ls/x$d;->a:Lu/d;

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
.method public a(I)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public b(ZLjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->isOP()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->isTestAccount()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Ls/x$d;->b:Ls/x;

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ls/x;->i(Ls/x;)Landroid/content/Context;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    const-string v1, "This is a test account for development and debugging only!"

    .line 21
    const/4 v2, 0x1

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 29
    .line 30
    :cond_0
    sget-object v0, Lai/advance/sdk/global/iqa/lib/code/ErrorCode;->MODEL_ERROR:Lai/advance/sdk/global/iqa/lib/code/ErrorCode;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    move-result v1

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Ls/a;->o(Lai/advance/sdk/global/iqa/lib/code/ErrorCode;)V

    .line 44
    .line 45
    :cond_1
    iget-object v0, p0, Ls/x$d;->a:Lu/d;

    .line 46
    .line 47
    new-instance v1, Lt/a;

    .line 48
    .line 49
    .line 50
    invoke-direct {v1, p1, p2, p3}, Lt/a;-><init>(ZLjava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, v1}, Lu/a;->e(Lt/a;)V

    .line 54
    return-void
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

.method public c()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ls/x$d;->a:Lu/d;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lu/a;->c()V

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
.end method

.method public d()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public e(Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;Ls/c;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Ls/c;->b()Z

    .line 4
    move-result p1

    .line 5
    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    iget-boolean p1, p2, Ls/c;->c:Z

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-void

    .line 13
    .line 14
    :cond_1
    :goto_0
    iget-object p1, p0, Ls/x$d;->b:Ls/x;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Ls/c;->b()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    const-string v0, "blur"

    .line 23
    goto :goto_1

    .line 24
    .line 25
    :cond_2
    const-string v0, "card_not_exists"

    .line 26
    .line 27
    :goto_1
    iget-object p2, p2, Ls/c;->a:Lorg/json/JSONObject;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0, p2}, Ls/x;->x(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 31
    return-void
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

.method public f()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method
