.class public final Lcom/otaliastudios/opengl/texture/GlTexture;
.super Ljava/lang/Object;
.source "GlTexture.kt"

# interfaces
.implements Ll90/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0010\u0002\n\u0002\u0008\u0010\u0018\u00002\u00020\u0001BU\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cB)\u0008\u0017\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0012\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0014\u001a\u0004\u0008\u0018\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001a\u001a\u0004\u0008\u0017\u0010\u001cR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001a\u001a\u0004\u0008\u0013\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001a\u001a\u0004\u0008\u001d\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0014\u001a\u0004\u0008\u0019\u0010\u0016\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/otaliastudios/opengl/texture/GlTexture;",
        "Ll90/b;",
        "",
        "unit",
        "target",
        "id",
        "width",
        "height",
        "format",
        "internalFormat",
        "type",
        "<init>",
        "(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V",
        "(IILjava/lang/Integer;)V",
        "",
        "bind",
        "()V",
        "unbind",
        "g",
        "a",
        "I",
        "getUnit",
        "()I",
        "b",
        "d",
        "c",
        "Ljava/lang/Integer;",
        "f",
        "()Ljava/lang/Integer;",
        "e",
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


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final d:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final e:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final f:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final g:I


# direct methods
.method public constructor <init>()V
    .locals 6
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/otaliastudios/opengl/texture/GlTexture;-><init>(IILjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IILjava/lang/Integer;)V
    .locals 9
    .param p3    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    .line 19
    invoke-direct/range {v0 .. v8}, Lcom/otaliastudios/opengl/texture/GlTexture;-><init>(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 18
    invoke-static {}, Ln90/f;->i()I

    move-result p1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    invoke-static {}, Ln90/f;->j()I

    move-result p2

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/4 p3, 0x0

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/otaliastudios/opengl/texture/GlTexture;-><init>(IILjava/lang/Integer;)V

    return-void
.end method

.method public constructor <init>(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 1

    const/4 v0, 0x1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/otaliastudios/opengl/texture/GlTexture;->a:I

    .line 4
    iput p2, p0, Lcom/otaliastudios/opengl/texture/GlTexture;->b:I

    .line 5
    iput-object p4, p0, Lcom/otaliastudios/opengl/texture/GlTexture;->c:Ljava/lang/Integer;

    .line 6
    iput-object p5, p0, Lcom/otaliastudios/opengl/texture/GlTexture;->d:Ljava/lang/Integer;

    .line 7
    iput-object p6, p0, Lcom/otaliastudios/opengl/texture/GlTexture;->e:Ljava/lang/Integer;

    .line 8
    iput-object p8, p0, Lcom/otaliastudios/opengl/texture/GlTexture;->f:Ljava/lang/Integer;

    if-nez p3, :cond_1

    .line 9
    invoke-static {v0}, Lkotlin/UIntArray;->constructor-impl(I)[I

    move-result-object p1

    .line 10
    invoke-static {p1}, Lkotlin/UIntArray;->getSize-impl([I)I

    move-result p2

    new-array p4, p2, [I

    const/4 p5, 0x0

    move p6, p5

    :goto_0
    if-ge p6, p2, :cond_0

    invoke-static {p1, p6}, Lkotlin/UIntArray;->get-pVg5ArA([II)I

    move-result p8

    aput p8, p4, p6

    add-int/2addr p6, v0

    goto :goto_0

    .line 11
    :cond_0
    invoke-static {v0, p4, p5}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 12
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    aget p2, p4, p5

    invoke-static {p2}, Lkotlin/UInt;->constructor-impl(I)I

    move-result p2

    invoke-static {p1, p5, p2}, Lkotlin/UIntArray;->set-VXSXFK8([III)V

    .line 14
    const-string p2, "glGenTextures"

    invoke-static {p2}, Ll90/a;->b(Ljava/lang/String;)V

    .line 15
    invoke-static {p1, p5}, Lkotlin/UIntArray;->get-pVg5ArA([II)I

    move-result p1

    goto :goto_1

    .line 16
    :cond_1
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_1
    iput p1, p0, Lcom/otaliastudios/opengl/texture/GlTexture;->g:I

    if-nez p3, :cond_2

    .line 17
    new-instance p1, Lcom/otaliastudios/opengl/texture/GlTexture$1;

    invoke-direct {p1, p0, p7}, Lcom/otaliastudios/opengl/texture/GlTexture$1;-><init>(Lcom/otaliastudios/opengl/texture/GlTexture;Ljava/lang/Integer;)V

    invoke-static {p0, p1}, Ll90/c;->a(Ll90/b;Lkotlin/jvm/functions/Function0;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture;->e:Ljava/lang/Integer;

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
.end method

.method public final b()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture;->d:Ljava/lang/Integer;

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
.end method

.method public bind()V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture;->a:I

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/UInt;->constructor-impl(I)I

    .line 6
    move-result v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 10
    .line 11
    iget v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture;->b:I

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/UInt;->constructor-impl(I)I

    .line 15
    move-result v0

    .line 16
    .line 17
    iget v1, p0, Lcom/otaliastudios/opengl/texture/GlTexture;->g:I

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Lkotlin/UInt;->constructor-impl(I)I

    .line 21
    move-result v1

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 25
    .line 26
    const-string v0, "bind"

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Ll90/a;->b(Ljava/lang/String;)V

    .line 30
    return-void
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
.end method

.method public final c()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture;->g:I

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
.end method

.method public final d()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture;->b:I

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
.end method

.method public final e()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture;->f:Ljava/lang/Integer;

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
.end method

.method public final f()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture;->c:Ljava/lang/Integer;

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
.end method

.method public final g()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iget v1, p0, Lcom/otaliastudios/opengl/texture/GlTexture;->g:I

    .line 4
    .line 5
    .line 6
    invoke-static {v1}, Lkotlin/UInt;->constructor-impl(I)I

    .line 7
    move-result v1

    .line 8
    .line 9
    .line 10
    filled-new-array {v1}, [I

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Lkotlin/UIntArray;->getSize-impl([I)I

    .line 15
    move-result v2

    .line 16
    .line 17
    new-array v3, v2, [I

    .line 18
    const/4 v4, 0x0

    .line 19
    move v5, v4

    .line 20
    .line 21
    :goto_0
    if-ge v5, v2, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v5}, Lkotlin/UIntArray;->get-pVg5ArA([II)I

    .line 25
    move-result v6

    .line 26
    .line 27
    aput v6, v3, v5

    .line 28
    add-int/2addr v5, v0

    .line 29
    goto :goto_0

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-static {v0, v3, v4}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 33
    .line 34
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 35
    .line 36
    aget v0, v3, v4

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lkotlin/UInt;->constructor-impl(I)I

    .line 40
    move-result v0

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v4, v0}, Lkotlin/UIntArray;->set-VXSXFK8([III)V

    .line 44
    return-void
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
.end method

.method public unbind()V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture;->b:I

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/UInt;->constructor-impl(I)I

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lkotlin/UInt;->constructor-impl(I)I

    .line 11
    move-result v1

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ln90/f;->i()I

    .line 18
    move-result v0

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 22
    .line 23
    .line 24
    const-string/jumbo v0, "unbind"

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Ll90/a;->b(Ljava/lang/String;)V

    .line 28
    return-void
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
.end method
