.class public final Ls/b;
.super Ls/j;
.source "SourceFile"


# static fields
.field public static d:Ljava/lang/String;


# direct methods
.method public static f()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lk/c;->d()I

    .line 4
    move-result v0

    .line 5
    return v0
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

.method public static g()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "1.5.4"

    .line 3
    return-object v0
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

.method public static h(Landroid/app/Application;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lr/a;->d(Landroid/app/Application;)V

    .line 4
    .line 5
    const-string v0, "global-iqa"

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lr/a;->e(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ls/b;->g()Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    move-result-object p0

    .line 17
    .line 18
    .line 19
    invoke-static {v0, p0}, Lai/advance/sdk/global/iqa/lib/JNI;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static i()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->d()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ls/b;->f()I

    .line 10
    move-result v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lk/c;->h(I)Landroid/hardware/Camera$CameraInfo;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    .line 21
    :goto_0
    if-nez v0, :cond_1

    .line 22
    .line 23
    sget-object v1, Lai/advance/sdk/global/iqa/lib/code/ErrorCode;->DEVICE_NOT_SUPPORT:Lai/advance/sdk/global/iqa/lib/code/ErrorCode;

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Ls/a;->o(Lai/advance/sdk/global/iqa/lib/code/ErrorCode;)V

    .line 27
    :cond_1
    return v0
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
.end method

.method public static j(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lai/advance/sdk/global/iqa/lib/JNI;->nativeLicenseAuth(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
