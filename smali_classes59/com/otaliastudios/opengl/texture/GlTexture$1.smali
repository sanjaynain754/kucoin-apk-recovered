.class final Lcom/otaliastudios/opengl/texture/GlTexture$1;
.super Lkotlin/jvm/internal/Lambda;
.source "GlTexture.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/otaliastudios/opengl/texture/GlTexture;-><init>(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $internalFormat:Ljava/lang/Integer;

.field final synthetic this$0:Lcom/otaliastudios/opengl/texture/GlTexture;


# direct methods
.method public constructor <init>(Lcom/otaliastudios/opengl/texture/GlTexture;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/otaliastudios/opengl/texture/GlTexture$1;->this$0:Lcom/otaliastudios/opengl/texture/GlTexture;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/otaliastudios/opengl/texture/GlTexture$1;->$internalFormat:Ljava/lang/Integer;

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    return-void
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
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/otaliastudios/opengl/texture/GlTexture$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 10

    .line 2
    iget-object v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture$1;->this$0:Lcom/otaliastudios/opengl/texture/GlTexture;

    invoke-virtual {v0}, Lcom/otaliastudios/opengl/texture/GlTexture;->f()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture$1;->this$0:Lcom/otaliastudios/opengl/texture/GlTexture;

    invoke-virtual {v0}, Lcom/otaliastudios/opengl/texture/GlTexture;->b()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture$1;->this$0:Lcom/otaliastudios/opengl/texture/GlTexture;

    invoke-virtual {v0}, Lcom/otaliastudios/opengl/texture/GlTexture;->a()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture$1;->$internalFormat:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture$1;->this$0:Lcom/otaliastudios/opengl/texture/GlTexture;

    invoke-virtual {v0}, Lcom/otaliastudios/opengl/texture/GlTexture;->e()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture$1;->this$0:Lcom/otaliastudios/opengl/texture/GlTexture;

    invoke-virtual {v0}, Lcom/otaliastudios/opengl/texture/GlTexture;->d()I

    move-result v0

    invoke-static {v0}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v1

    iget-object v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture$1;->$internalFormat:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture$1;->this$0:Lcom/otaliastudios/opengl/texture/GlTexture;

    invoke-virtual {v0}, Lcom/otaliastudios/opengl/texture/GlTexture;->f()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture$1;->this$0:Lcom/otaliastudios/opengl/texture/GlTexture;

    invoke-virtual {v0}, Lcom/otaliastudios/opengl/texture/GlTexture;->b()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 7
    iget-object v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture$1;->this$0:Lcom/otaliastudios/opengl/texture/GlTexture;

    invoke-virtual {v0}, Lcom/otaliastudios/opengl/texture/GlTexture;->a()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v7

    iget-object v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture$1;->this$0:Lcom/otaliastudios/opengl/texture/GlTexture;

    invoke-virtual {v0}, Lcom/otaliastudios/opengl/texture/GlTexture;->e()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v8

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    .line 8
    invoke-static/range {v1 .. v9}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture$1;->this$0:Lcom/otaliastudios/opengl/texture/GlTexture;

    invoke-virtual {v0}, Lcom/otaliastudios/opengl/texture/GlTexture;->d()I

    move-result v0

    invoke-static {v0}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v0

    invoke-static {}, Ln90/f;->l()I

    move-result v1

    invoke-static {}, Ln90/f;->g()F

    move-result v2

    .line 10
    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 11
    iget-object v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture$1;->this$0:Lcom/otaliastudios/opengl/texture/GlTexture;

    invoke-virtual {v0}, Lcom/otaliastudios/opengl/texture/GlTexture;->d()I

    move-result v0

    invoke-static {v0}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v0

    invoke-static {}, Ln90/f;->k()I

    move-result v1

    invoke-static {}, Ln90/f;->e()F

    move-result v2

    .line 12
    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 13
    iget-object v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture$1;->this$0:Lcom/otaliastudios/opengl/texture/GlTexture;

    invoke-virtual {v0}, Lcom/otaliastudios/opengl/texture/GlTexture;->d()I

    move-result v0

    invoke-static {v0}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v0

    invoke-static {}, Ln90/f;->m()I

    move-result v1

    invoke-static {}, Ln90/f;->a()I

    move-result v2

    .line 14
    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 15
    iget-object v0, p0, Lcom/otaliastudios/opengl/texture/GlTexture$1;->this$0:Lcom/otaliastudios/opengl/texture/GlTexture;

    invoke-virtual {v0}, Lcom/otaliastudios/opengl/texture/GlTexture;->d()I

    move-result v0

    invoke-static {v0}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v0

    invoke-static {}, Ln90/f;->n()I

    move-result v1

    invoke-static {}, Ln90/f;->a()I

    move-result v2

    .line 16
    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 17
    const-string v0, "glTexParameter"

    invoke-static {v0}, Ll90/a;->b(Ljava/lang/String;)V

    return-void
.end method
