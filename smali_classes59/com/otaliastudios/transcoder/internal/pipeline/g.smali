.class public interface abstract Lcom/otaliastudios/transcoder/internal/pipeline/g;
.super Ljava/lang/Object;
.source "Step.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/otaliastudios/transcoder/internal/pipeline/g$a;
    }
.end annotation

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
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008`\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0008\u0008\u0001\u0010\u0004*\u00020\u0003*\u0008\u0008\u0002\u0010\u0005*\u00020\u0001*\u0008\u0008\u0003\u0010\u0006*\u00020\u00032\u00020\u0001J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00028\u0003H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ+\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u000f2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\rH&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00028\u00018&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/otaliastudios/transcoder/internal/pipeline/g;",
        "",
        "Input",
        "Lcom/otaliastudios/transcoder/internal/pipeline/b;",
        "InputChannel",
        "Output",
        "OutputChannel",
        "next",
        "",
        "c",
        "(Lcom/otaliastudios/transcoder/internal/pipeline/b;)V",
        "Lcom/otaliastudios/transcoder/internal/pipeline/f$b;",
        "state",
        "",
        "fresh",
        "Lcom/otaliastudios/transcoder/internal/pipeline/f;",
        "b",
        "(Lcom/otaliastudios/transcoder/internal/pipeline/f$b;Z)Lcom/otaliastudios/transcoder/internal/pipeline/f;",
        "release",
        "()V",
        "getChannel",
        "()Lcom/otaliastudios/transcoder/internal/pipeline/b;",
        "channel",
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


# virtual methods
.method public abstract b(Lcom/otaliastudios/transcoder/internal/pipeline/f$b;Z)Lcom/otaliastudios/transcoder/internal/pipeline/f;
    .param p1    # Lcom/otaliastudios/transcoder/internal/pipeline/f$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/otaliastudios/transcoder/internal/pipeline/f$b<",
            "TInput;>;Z)",
            "Lcom/otaliastudios/transcoder/internal/pipeline/f<",
            "TOutput;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract c(Lcom/otaliastudios/transcoder/internal/pipeline/b;)V
    .param p1    # Lcom/otaliastudios/transcoder/internal/pipeline/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TOutputChannel;)V"
        }
    .end annotation
.end method

.method public abstract getChannel()Lcom/otaliastudios/transcoder/internal/pipeline/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TInputChannel;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract release()V
.end method
