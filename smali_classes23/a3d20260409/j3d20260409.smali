.class La3d20260409/j3d20260409;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static OOOOooOOOO:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    :try_start_0
    const-string v0, "aailiveness_v3.6.14"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x1

    .line 7
    .line 8
    sput-boolean v0, La3d20260409/j3d20260409;->OOOOooOOOO:Z
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-void

    .line 10
    :catch_0
    move-exception v0

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    sput-boolean v1, La3d20260409/j3d20260409;->OOOOooOOOO:Z

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    const-string v2, "Liveness JNI library load failed:"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lk/h;->g(Ljava/lang/String;)V

    .line 38
    return-void
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

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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

.method public static native O0()[B
.end method

.method public static native O00000()Ljava/lang/String;
.end method

.method public static native O00000000()Ljava/lang/String;
.end method

.method public static native O00000oo()Ljava/lang/String;
.end method

.method public static native O00000oo000(Ljava/lang/String;)V
.end method

.method public static native O0000o0()Ljava/lang/String;
.end method

.method public static native O0000o00o0o0()Ljava/lang/String;
.end method

.method public static native O0000o00o0o0ooo(Ljava/lang/String;)V
.end method

.method public static native O000O0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public static native O0OO0oOo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native O0OO0oOo0(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native O0OO0oOo000()Ljava/lang/String;
.end method

.method public static native O0OO0oOo0o(Ljava/lang/String;)V
.end method

.method public static native O0OO0oOo0o0(Ljava/lang/String;Ljava/lang/String;[B[BJ)[B
.end method

.method public static native O0OO0oOo0o0o([[B)[B
.end method

.method public static native O0OO0oOo0o0o000(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native O0OO0oOo0o0oooo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)[B
.end method

.method public static native O0OO0oOo0o0ooooo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)[B
.end method

.method public static native O0OO0oOo1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native O0OO0oOo2(Ljava/lang/String;)V
.end method

.method public static O0OOOoOooo()Z
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, La3d20260409/j3d20260409;->OOOOooOOOO:Z

    .line 3
    return v0
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

.method public static native O0o()[B
.end method

.method public static native O0o0Oo0([BLjava/lang/String;)Ljava/lang/String;
.end method

.method public static native O0o0Oo0o([BLjava/lang/String;Ljava/lang/String;)[B
.end method

.method public static native O0o0Oo0oo0(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;
.end method

.method public static native O0o0Oo0oo0o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;
.end method

.method public static native O0o0Ooo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)[B
.end method

.method public static native O0o0Oooo(Ljava/lang/String;J)V
.end method

.method public static native O0o0o0()Z
.end method

.method public static native O0oO()Ljava/lang/String;
.end method

.method public static native O0ooB()[B
.end method

.method public static native O0ooBk()[B
.end method

.method public static native O0ooC()V
.end method

.method public static native O0ooDp()[B
.end method

.method public static native O0ooE(Ljava/lang/String;)V
.end method

.method public static native O0ooEo0([BJI)V
.end method

.method public static native O0ooEoo0([BJ)V
.end method

.method public static native O0ooEoo0C()I
.end method

.method public static native O0ooEoo0Co()V
.end method

.method public static native O0ooEoo0Co0()V
.end method

.method public static native O0ooEoo0Co00()V
.end method

.method public static native O0ooEoo0Co00o(Ljava/lang/String;)V
.end method

.method public static native O0ooEoo0Co00o0()Ljava/lang/String;
.end method

.method public static native O0ooEoo0Co0o(Ljava/lang/String;)V
.end method

.method public static native O0ooEoo0oo(Ljava/lang/String;)V
.end method

.method public static native O0ooF()[B
.end method

.method public static native O0ooFF()[B
.end method

.method public static native O0ooGE()Ljava/lang/String;
.end method

.method public static native O0ooGoo0()Ljava/lang/String;
.end method

.method public static native O0ooN()[B
.end method

.method public static native O0ooNp()[B
.end method

.method public static native O0ooOoO0()[B
.end method

.method public static native O0oooo0o([BLjava/lang/String;)V
.end method

.method public static native O0oooo0oo000o(Ljava/lang/String;JLjava/lang/String;)V
.end method

.method public static native O0oooo0oo000ol()Ljava/lang/String;
.end method

.method public static native O0ooooo00o00o()Z
.end method

.method public static native O0ooooo00o00oo()Ljava/lang/String;
.end method

.method public static native O0ooooo00o00ooO()Ljava/lang/String;
.end method

.method public static native O0ooooo00o00ooOO(Ljava/lang/String;)V
.end method

.method public static native O0ooooo00o00ooOO0()Ljava/lang/String;
.end method

.method public static native O0ooooo00o00ooOO0o()I
.end method

.method public static native O0ooooo00o00ooOO0o00()Ljava/lang/String;
.end method

.method public static native O0ooooo00o00ooOo(Ljava/lang/String;)V
.end method

.method public static native O0ooooo00o00ooo()Z
.end method

.method public static native O0ooooo0oo()Ljava/lang/String;
.end method

.method public static native OOOOOOOooO()Z
.end method

.method public static native OOOOOOooO()Z
.end method

.method public static OOOOooOOOO()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, La3d20260409/j3d20260409;->O0000o0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static OOOOooOOOO(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 2
    :cond_0
    :try_start_0
    invoke-static {p1}, La3d20260409/u;->i(Landroid/content/Context;)Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {p0, v1}, La3d20260409/j3d20260409;->Oo0O0(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2

    return-object v0

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-static {}, La3d20260409/j3d20260409;->OOOOooOOOO()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1, p0}, Lk/d;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    return-object v0
.end method

.method public static native OOOooO()Z
.end method

.method public static native OOOooOo()Z
.end method

.method public static native OOOooOo0()Z
.end method

.method public static native OOo0ooOO0000o0()I
.end method

.method public static native OOo0ooOO0000ooo0()I
.end method

.method public static native OOooO()Ljava/lang/String;
.end method

.method public static native OOoooOO()Z
.end method

.method public static native OOoooOO000()Z
.end method

.method public static native OOoooOO0000()I
.end method

.method public static native OOoooOO00000()I
.end method

.method public static native OOoooOO000000()I
.end method

.method public static native OOoooOO0000000()I
.end method

.method public static native OOoooOO0000o0()I
.end method

.method public static native OOooooO()I
.end method

.method public static native OOooooO0()[F
.end method

.method public static native OOooooOOo0()I
.end method

.method public static native OOooooOOo0oOo()Z
.end method

.method private static native Oo0O0(Ljava/lang/String;Z)Ljava/lang/String;
.end method

.method public static native Oo0O00O0000o([B)V
.end method

.method public static native Oo0O00O0000oo()Z
.end method

.method public static native Oo0O00O0000oooo([B)V
.end method

.method public static native Oo0O00Oo000oooo([B)V
.end method

.method public static native Oo0Oo(Landroid/content/res/AssetManager;)J
.end method

.method public static native Oo0Oo00O000([B)V
.end method

.method public static native Oo0Oo00O0000O([B)V
.end method

.method public static native Oo0Oo00O0000o([B[B[B)V
.end method

.method public static native Oo0o0o(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native Oo0o0oo(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native OoO(JJ)V
.end method

.method public static native OoOOO(Ljava/lang/String;)V
.end method

.method public static native OoOOOo()Ljava/lang/String;
.end method

.method public static native OoOOOoO()I
.end method

.method public static native OoOOOoO00()Ljava/lang/String;
.end method

.method public static native OoOOOoO0O(Ljava/lang/String;)Z
.end method

.method public static native OoOOOoo()Z
.end method

.method public static native OoOo0OoO(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJILjava/lang/String;Landroid/content/Context;)V
.end method

.method public static native OoOoO000()Ljava/lang/String;
.end method

.method public static native OoOoOoo(Ljava/lang/String;IJ)V
.end method

.method public static native OoOoOooo(J)Ljava/lang/String;
.end method

.method public static native OoOoOooo00o0o(Landroid/content/Context;)V
.end method

.method public static native Ooo([B)V
.end method

.method public static native Ooooo(Z)V
.end method

.method public static native OoooolLi(J)Ljava/lang/String;
.end method

.method public static native a()I
.end method

.method public static native b()I
.end method

.method public static native c()I
.end method

.method public static native d()I
.end method

.method public static native e()I
.end method

.method public static native f()I
.end method

.method public static native lIl()Z
.end method

.method public static native lll()Z
.end method

.method public static native o0o00(J)V
.end method

.method public static native o0o0O(J)V
.end method

.method public static native oO00([BIII[BIZI)I
.end method

.method public static native oO0oOO([BJ)[B
.end method

.method public static native oO0ooO(J[BIII)Ljava/lang/String;
.end method

.method public static native oOOO()I
.end method

.method public static native oOOOo0oO(Ljava/lang/String;)V
.end method

.method public static native oOo0Oo(Ljava/lang/String;)V
.end method

.method public static native oOo0oOo()Ljava/lang/String;
.end method

.method public static native oOo0oOo0()Z
.end method

.method public static native oOo0oOo0o()Ljava/lang/String;
.end method

.method public static native oOo0ooooo(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native oOoOoOo00(Ljava/lang/String;Ljava/lang/String;Z)J
.end method

.method public static native oOoOoOo0000()Z
.end method

.method public static native oOoOoOo00o0()Ljava/lang/String;
.end method

.method public static native oo000o0()V
.end method

.method public static native oo00oo0()V
.end method

.method public static native oo0o0o0()V
.end method

.method public static native oo0ooO([B)Z
.end method

.method public static native oooo000o()Z
.end method

.method public static native q1()I
.end method

.method public static native q2()I
.end method

.method public static native t()I
.end method
