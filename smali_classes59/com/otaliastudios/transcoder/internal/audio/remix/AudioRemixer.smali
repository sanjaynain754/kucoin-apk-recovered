.class public interface abstract Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer;
.super Ljava/lang/Object;
.source "AudioRemixer.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008`\u0018\u0000 \n2\u00020\u0001:\u0001\u000cJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer;",
        "",
        "Ljava/nio/ShortBuffer;",
        "inputBuffer",
        "outputBuffer",
        "",
        "b",
        "(Ljava/nio/ShortBuffer;Ljava/nio/ShortBuffer;)V",
        "",
        "inputSize",
        "a",
        "(I)I",
        "Companion",
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


# static fields
.field public static final a:Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer$Companion;->a:Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer$Companion;

    .line 3
    .line 4
    sput-object v0, Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer;->a:Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer$Companion;

    .line 5
    return-void
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
.method public abstract a(I)I
.end method

.method public abstract b(Ljava/nio/ShortBuffer;Ljava/nio/ShortBuffer;)V
    .param p1    # Ljava/nio/ShortBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/nio/ShortBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
