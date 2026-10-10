.class final Lcom/otaliastudios/opengl/program/GlProgram$draw$1;
.super Lkotlin/jvm/internal/Lambda;
.source "GlProgram.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/otaliastudios/opengl/program/GlProgram;->b(Lcom/otaliastudios/opengl/draw/b;[F)V
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
.field final synthetic $drawable:Lcom/otaliastudios/opengl/draw/b;

.field final synthetic $modelViewProjectionMatrix:[F

.field final synthetic this$0:Lcom/otaliastudios/opengl/program/GlProgram;


# direct methods
.method public constructor <init>(Lcom/otaliastudios/opengl/program/GlProgram;Lcom/otaliastudios/opengl/draw/b;[F)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/otaliastudios/opengl/program/GlProgram$draw$1;->this$0:Lcom/otaliastudios/opengl/program/GlProgram;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/otaliastudios/opengl/program/GlProgram$draw$1;->$drawable:Lcom/otaliastudios/opengl/draw/b;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/otaliastudios/opengl/program/GlProgram$draw$1;->$modelViewProjectionMatrix:[F

    .line 7
    const/4 p1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 11
    return-void
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


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/otaliastudios/opengl/program/GlProgram$draw$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/otaliastudios/opengl/program/GlProgram$draw$1;->this$0:Lcom/otaliastudios/opengl/program/GlProgram;

    iget-object v1, p0, Lcom/otaliastudios/opengl/program/GlProgram$draw$1;->$drawable:Lcom/otaliastudios/opengl/draw/b;

    iget-object v2, p0, Lcom/otaliastudios/opengl/program/GlProgram$draw$1;->$modelViewProjectionMatrix:[F

    invoke-virtual {v0, v1, v2}, Lcom/otaliastudios/opengl/program/GlProgram;->h(Lcom/otaliastudios/opengl/draw/b;[F)V

    .line 3
    iget-object v0, p0, Lcom/otaliastudios/opengl/program/GlProgram$draw$1;->this$0:Lcom/otaliastudios/opengl/program/GlProgram;

    iget-object v1, p0, Lcom/otaliastudios/opengl/program/GlProgram$draw$1;->$drawable:Lcom/otaliastudios/opengl/draw/b;

    invoke-virtual {v0, v1}, Lcom/otaliastudios/opengl/program/GlProgram;->f(Lcom/otaliastudios/opengl/draw/b;)V

    .line 4
    iget-object v0, p0, Lcom/otaliastudios/opengl/program/GlProgram$draw$1;->this$0:Lcom/otaliastudios/opengl/program/GlProgram;

    iget-object v1, p0, Lcom/otaliastudios/opengl/program/GlProgram$draw$1;->$drawable:Lcom/otaliastudios/opengl/draw/b;

    invoke-virtual {v0, v1}, Lcom/otaliastudios/opengl/program/GlProgram;->g(Lcom/otaliastudios/opengl/draw/b;)V

    return-void
.end method
