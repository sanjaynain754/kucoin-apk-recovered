.class public final Lcom/otaliastudios/opengl/program/GlProgram$Companion;
.super Ljava/lang/Object;
.source "GlProgram.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/otaliastudios/opengl/program/GlProgram;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\u0008J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/otaliastudios/opengl/program/GlProgram$Companion;",
        "",
        "()V",
        "create",
        "",
        "shaders",
        "",
        "Lcom/otaliastudios/opengl/program/GlShader;",
        "([Lcom/otaliastudios/opengl/program/GlShader;)I",
        "vertexShaderSource",
        "",
        "fragmentShaderSource",
        "library_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/otaliastudios/opengl/program/GlProgram$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = "Use create(GlShader) signature."
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string/jumbo v0, "vertexShaderSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentShaderSource"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/otaliastudios/opengl/program/GlShader;

    invoke-static {}, Ln90/f;->q()I

    move-result v1

    invoke-direct {v0, v1, p1}, Lcom/otaliastudios/opengl/program/GlShader;-><init>(ILjava/lang/String;)V

    .line 2
    new-instance p1, Lcom/otaliastudios/opengl/program/GlShader;

    invoke-static {}, Ln90/f;->d()I

    move-result v1

    invoke-direct {p1, v1, p2}, Lcom/otaliastudios/opengl/program/GlShader;-><init>(ILjava/lang/String;)V

    filled-new-array {v0, p1}, [Lcom/otaliastudios/opengl/program/GlShader;

    move-result-object p1

    .line 3
    invoke-virtual {p0, p1}, Lcom/otaliastudios/opengl/program/GlProgram$Companion;->create([Lcom/otaliastudios/opengl/program/GlShader;)I

    move-result p1

    return p1
.end method

.method public final varargs create([Lcom/otaliastudios/opengl/program/GlShader;)I
    .locals 5
    .param p1    # [Lcom/otaliastudios/opengl/program/GlShader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string/jumbo v0, "shaders"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v0

    invoke-static {v0}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v0

    .line 5
    const-string v1, "glCreateProgram"

    invoke-static {v1}, Ll90/a;->b(Ljava/lang/String;)V

    if-eqz v0, :cond_2

    .line 6
    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p1, v3

    .line 7
    invoke-virtual {v4}, Lcom/otaliastudios/opengl/program/GlShader;->a()I

    move-result v4

    invoke-static {v4}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v4

    .line 8
    invoke-static {v0, v4}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 9
    const-string v4, "glAttachShader"

    invoke-static {v4}, Ll90/a;->b(Ljava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 10
    :cond_0
    invoke-static {v0}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    const/4 p1, 0x1

    .line 11
    new-array p1, p1, [I

    .line 12
    invoke-static {}, Ln90/f;->f()I

    move-result v1

    .line 13
    invoke-static {v0, v1, p1, v2}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 14
    aget p1, p1, v2

    invoke-static {}, Ln90/f;->p()I

    move-result v1

    if-ne p1, v1, :cond_1

    return v0

    .line 15
    :cond_1
    const-string p1, "Could not link program: "

    .line 16
    invoke-static {v0}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    move-result-object v1

    .line 17
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 18
    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    .line 19
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 20
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Could not create program"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
