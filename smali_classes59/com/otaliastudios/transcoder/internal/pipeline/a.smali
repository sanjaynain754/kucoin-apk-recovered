.class public abstract Lcom/otaliastudios/transcoder/internal/pipeline/a;
.super Ljava/lang/Object;
.source "steps.kt"

# interfaces
.implements Lcom/otaliastudios/transcoder/internal/pipeline/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Input:",
        "Ljava/lang/Object;",
        "InputChannel::",
        "Lcom/otaliastudios/transcoder/internal/pipeline/b;",
        "Output:",
        "Ljava/lang/Object;",
        "OutputChannel::",
        "Lcom/otaliastudios/transcoder/internal/pipeline/b;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/otaliastudios/transcoder/internal/pipeline/g<",
        "TInput;TInputChannel;TOutput;TOutputChannel;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0008\u0008 \u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0008\u0008\u0001\u0010\u0004*\u00020\u0003*\u0008\u0008\u0002\u0010\u0005*\u00020\u0001*\u0008\u0008\u0003\u0010\u0006*\u00020\u00032\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007B\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0003H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR$\u0010\n\u001a\u00028\u00032\u0006\u0010\u000e\u001a\u00028\u00038\u0004@BX\u0084.\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/otaliastudios/transcoder/internal/pipeline/a;",
        "",
        "Input",
        "Lcom/otaliastudios/transcoder/internal/pipeline/b;",
        "InputChannel",
        "Output",
        "OutputChannel",
        "Lcom/otaliastudios/transcoder/internal/pipeline/g;",
        "<init>",
        "()V",
        "next",
        "",
        "c",
        "(Lcom/otaliastudios/transcoder/internal/pipeline/b;)V",
        "<set-?>",
        "b",
        "Lcom/otaliastudios/transcoder/internal/pipeline/b;",
        "f",
        "()Lcom/otaliastudios/transcoder/internal/pipeline/b;",
        "lib_release"
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
.field public b:Lcom/otaliastudios/transcoder/internal/pipeline/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TOutputChannel;"
        }
    .end annotation
.end field


# direct methods
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
.end method


# virtual methods
.method public c(Lcom/otaliastudios/transcoder/internal/pipeline/b;)V
    .locals 1
    .param p1    # Lcom/otaliastudios/transcoder/internal/pipeline/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TOutputChannel;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "next"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/pipeline/a;->b:Lcom/otaliastudios/transcoder/internal/pipeline/b;

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
.end method

.method public final f()Lcom/otaliastudios/transcoder/internal/pipeline/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TOutputChannel;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/pipeline/a;->b:Lcom/otaliastudios/transcoder/internal/pipeline/b;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object v0

    .line 6
    .line 7
    .line 8
    :cond_0
    const-string/jumbo v0, "next"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 12
    const/4 v0, 0x0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public release()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/otaliastudios/transcoder/internal/pipeline/g$a;->b(Lcom/otaliastudios/transcoder/internal/pipeline/g;)V

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
.end method
