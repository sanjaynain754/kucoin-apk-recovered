.class public Lcom/tencent/liteav/videobase/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final h:[F

.field private static final i:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field protected final a:Lcom/tencent/liteav/base/util/Size;

.field protected b:I

.field protected c:I

.field protected d:I

.field protected e:Lcom/tencent/liteav/videobase/frame/e;

.field public f:I

.field public g:[F

.field private final j:Lcom/tencent/liteav/videobase/utils/a;

.field private final k:Lcom/tencent/liteav/videobase/utils/e;

.field private l:I

.field private final m:Lcom/tencent/liteav/videobase/frame/c;

.field private n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x10

    .line 3
    .line 4
    new-array v0, v0, [F

    .line 5
    .line 6
    .line 7
    fill-array-data v0, :array_0

    .line 8
    .line 9
    sput-object v0, Lcom/tencent/liteav/videobase/a/a;->h:[F

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 15
    .line 16
    sput-object v0, Lcom/tencent/liteav/videobase/a/a;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 17
    return-void

    .line 18
    nop

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
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data
    .line 55
    .line 56
    .line 57
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nuniform mat4 textureTransform;\nvarying highp vec2 textureCoordinate;\nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}"

    const-string/jumbo v1, "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}"

    invoke-direct {p0, v0, v1}, Lcom/tencent/liteav/videobase/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lcom/tencent/liteav/base/util/Size;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Lcom/tencent/liteav/base/util/Size;-><init>(II)V

    iput-object v0, p0, Lcom/tencent/liteav/videobase/a/a;->a:Lcom/tencent/liteav/base/util/Size;

    .line 4
    iput v1, p0, Lcom/tencent/liteav/videobase/a/a;->f:I

    .line 5
    new-instance v0, Lcom/tencent/liteav/videobase/frame/c;

    invoke-direct {v0}, Lcom/tencent/liteav/videobase/frame/c;-><init>()V

    iput-object v0, p0, Lcom/tencent/liteav/videobase/a/a;->m:Lcom/tencent/liteav/videobase/frame/c;

    .line 6
    new-instance v0, Lcom/tencent/liteav/videobase/utils/a;

    invoke-direct {v0}, Lcom/tencent/liteav/videobase/utils/a;-><init>()V

    iput-object v0, p0, Lcom/tencent/liteav/videobase/a/a;->j:Lcom/tencent/liteav/videobase/utils/a;

    .line 7
    new-instance v0, Lcom/tencent/liteav/videobase/utils/e;

    invoke-direct {v0, p1, p2}, Lcom/tencent/liteav/videobase/utils/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/tencent/liteav/videobase/a/a;->k:Lcom/tencent/liteav/videobase/utils/e;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    const/16 v0, 0xde1

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 2
    return-void
.end method

.method public final a(II)V
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/tencent/liteav/videobase/a/a;->a:Lcom/tencent/liteav/base/util/Size;

    iput p1, v0, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 41
    iput p2, v0, Lcom/tencent/liteav/base/util/Size;->height:I

    return-void
.end method

.method public a(ILcom/tencent/liteav/videobase/frame/d;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V
    .locals 7

    .line 42
    iget-boolean v0, p0, Lcom/tencent/liteav/videobase/a/a;->n:Z

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 43
    :cond_0
    iget v0, p0, Lcom/tencent/liteav/videobase/a/a;->f:I

    .line 44
    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 45
    iget-object v0, p0, Lcom/tencent/liteav/videobase/a/a;->j:Lcom/tencent/liteav/videobase/utils/a;

    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/utils/a;->a()V

    const/4 v0, 0x0

    .line 46
    invoke-virtual {p3, v0}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 47
    iget v1, p0, Lcom/tencent/liteav/videobase/a/a;->b:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x2

    const/16 v3, 0x1406

    move-object v6, p3

    invoke-static/range {v1 .. v6}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 48
    iget p3, p0, Lcom/tencent/liteav/videobase/a/a;->b:I

    invoke-static {p3}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 49
    invoke-virtual {p4, v0}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 50
    iget v1, p0, Lcom/tencent/liteav/videobase/a/a;->d:I

    move-object v6, p4

    invoke-static/range {v1 .. v6}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 51
    iget p3, p0, Lcom/tencent/liteav/videobase/a/a;->d:I

    invoke-static {p3}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    const/4 p3, -0x1

    const p4, 0x84c0

    if-eq p1, p3, :cond_1

    .line 52
    invoke-static {p4}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 53
    invoke-virtual {p0}, Lcom/tencent/liteav/videobase/a/a;->a()I

    move-result p3

    invoke-static {p3, p1}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->bindTexture(II)V

    .line 54
    iget p3, p0, Lcom/tencent/liteav/videobase/a/a;->c:I

    invoke-static {p3, v0}, Landroid/opengl/GLES20;->glUniform1i(II)V

    :cond_1
    const p3, 0x8d40

    if-eqz p2, :cond_2

    .line 55
    iget-object v1, p0, Lcom/tencent/liteav/videobase/a/a;->m:Lcom/tencent/liteav/videobase/frame/c;

    invoke-virtual {p2}, Lcom/tencent/liteav/videobase/frame/d;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/tencent/liteav/videobase/frame/c;->a(I)V

    .line 56
    iget-object v1, p0, Lcom/tencent/liteav/videobase/a/a;->m:Lcom/tencent/liteav/videobase/frame/c;

    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/c;->b()V

    goto :goto_0

    .line 57
    :cond_2
    invoke-static {p3, v0}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->bindFramebuffer(II)V

    .line 58
    :goto_0
    iget-object v1, p0, Lcom/tencent/liteav/videobase/a/a;->g:[F

    if-nez v1, :cond_3

    sget-object v1, Lcom/tencent/liteav/videobase/a/a;->h:[F

    .line 59
    :cond_3
    iget v2, p0, Lcom/tencent/liteav/videobase/a/a;->l:I

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, v1, v0}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 60
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/videobase/a/a;->a(I)V

    const/4 p1, 0x5

    const/4 v1, 0x4

    .line 61
    invoke-static {p1, v0, v1}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 62
    iget p1, p0, Lcom/tencent/liteav/videobase/a/a;->b:I

    invoke-static {p1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 63
    iget p1, p0, Lcom/tencent/liteav/videobase/a/a;->d:I

    invoke-static {p1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 64
    invoke-static {p4}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 65
    invoke-virtual {p0}, Lcom/tencent/liteav/videobase/a/a;->a()I

    move-result p1

    invoke-static {p1, v0}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->bindTexture(II)V

    if-eqz p2, :cond_4

    .line 66
    invoke-static {p3, v0}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->bindFramebuffer(II)V

    .line 67
    iget-object p1, p0, Lcom/tencent/liteav/videobase/a/a;->m:Lcom/tencent/liteav/videobase/frame/c;

    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/c;->c()V

    :cond_4
    :goto_1
    return-void
.end method

.method public final a(Lcom/tencent/liteav/videobase/frame/e;)V
    .locals 10

    .line 3
    iget-boolean v0, p0, Lcom/tencent/liteav/videobase/a/a;->n:Z

    if-eqz v0, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/videobase/a/a;->m:Lcom/tencent/liteav/videobase/frame/c;

    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/c;->a()V

    .line 5
    iget-object v0, p0, Lcom/tencent/liteav/videobase/a/a;->k:Lcom/tencent/liteav/videobase/utils/e;

    .line 6
    iget-object v1, v0, Lcom/tencent/liteav/videobase/utils/e;->a:Ljava/lang/String;

    const v2, 0x8b31

    invoke-static {v1, v2}, Lcom/tencent/liteav/videobase/utils/e;->a(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, -0x1

    .line 7
    const-string v4, "Program"

    if-nez v1, :cond_1

    .line 8
    const-string v0, "load vertex shader failed."

    invoke-static {v4, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 9
    :cond_1
    iget-object v0, v0, Lcom/tencent/liteav/videobase/utils/e;->b:Ljava/lang/String;

    const v5, 0x8b30

    invoke-static {v0, v5}, Lcom/tencent/liteav/videobase/utils/e;->a(Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_2

    .line 10
    const-string v0, "load fragment shader failed."

    invoke-static {v4, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-static {v1}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    goto :goto_0

    .line 12
    :cond_2
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v5

    .line 13
    invoke-static {v5, v1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 14
    invoke-static {v5, v0}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 15
    invoke-static {v5}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    .line 16
    new-array v6, v2, [I

    const v7, 0x8b82

    const/4 v8, 0x0

    .line 17
    invoke-static {v5, v7, v6, v8}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 18
    aget v7, v6, v8

    if-nez v7, :cond_3

    .line 19
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v9, "link program failed. status: "

    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget v6, v6, v8

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    invoke-static {v1}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 21
    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 22
    invoke-static {v5}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    goto :goto_0

    .line 23
    :cond_3
    invoke-static {v1}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 24
    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    move v3, v5

    .line 25
    :goto_0
    iput v3, p0, Lcom/tencent/liteav/videobase/a/a;->f:I

    .line 26
    const-string/jumbo v0, "position"

    invoke-static {v3, v0}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/videobase/a/a;->b:I

    .line 27
    iget v0, p0, Lcom/tencent/liteav/videobase/a/a;->f:I

    .line 28
    const-string v1, "inputImageTexture"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/videobase/a/a;->c:I

    .line 29
    iget v0, p0, Lcom/tencent/liteav/videobase/a/a;->f:I

    .line 30
    const-string v1, "inputTextureCoordinate"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/videobase/a/a;->d:I

    .line 31
    iget v0, p0, Lcom/tencent/liteav/videobase/a/a;->f:I

    .line 32
    const-string/jumbo v1, "textureTransform"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/videobase/a/a;->l:I

    .line 33
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/videobase/a/a;->b(Lcom/tencent/liteav/videobase/frame/e;)V

    .line 34
    iput-boolean v2, p0, Lcom/tencent/liteav/videobase/a/a;->n:Z

    .line 35
    sget-object p1, Lcom/tencent/liteav/videobase/a/a;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "TXCGPUImageFilter"

    const-string v1, "%s initialized, count: %d"

    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/Runnable;)V
    .locals 2

    .line 36
    iget-object v0, p0, Lcom/tencent/liteav/videobase/a/a;->j:Lcom/tencent/liteav/videobase/utils/a;

    .line 37
    iget-object v1, v0, Lcom/tencent/liteav/videobase/utils/a;->a:Ljava/util/LinkedList;

    monitor-enter v1

    .line 38
    :try_start_0
    iget-object v0, v0, Lcom/tencent/liteav/videobase/utils/a;->a:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 39
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/videobase/a/a;->n:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/videobase/a/a;->j:Lcom/tencent/liteav/videobase/utils/a;

    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/utils/a;->a()V

    .line 3
    invoke-virtual {p0}, Lcom/tencent/liteav/videobase/a/a;->c()V

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/tencent/liteav/videobase/a/a;->n:Z

    .line 5
    iget-object v0, p0, Lcom/tencent/liteav/videobase/a/a;->m:Lcom/tencent/liteav/videobase/frame/c;

    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/c;->d()V

    .line 6
    iget v0, p0, Lcom/tencent/liteav/videobase/a/a;->f:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 7
    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    .line 8
    iput v1, p0, Lcom/tencent/liteav/videobase/a/a;->f:I

    .line 9
    :cond_1
    sget-object v0, Lcom/tencent/liteav/videobase/a/a;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {p0, v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "TXCGPUImageFilter"

    const-string v2, "%s uninitialized, count: %d"

    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public b(Lcom/tencent/liteav/videobase/frame/e;)V
    .locals 0

    .line 10
    iput-object p1, p0, Lcom/tencent/liteav/videobase/a/a;->e:Lcom/tencent/liteav/videobase/frame/e;

    return-void
.end method

.method public c()V
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
.end method
