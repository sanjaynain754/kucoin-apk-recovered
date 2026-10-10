.class public final Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;
.super Ljava/lang/Object;
.source "ThreadHandoffProducer.kt"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/v0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/facebook/imagepipeline/producers/v0<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u000b\u0018\u0000 \u0010*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0016B\u001d\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J%\u0010\r\u001a\u00020\u000c2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001d\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;",
        "T",
        "Lcom/facebook/imagepipeline/producers/v0;",
        "inputProducer",
        "Lcom/facebook/imagepipeline/producers/f1;",
        "threadHandoffProducerQueue",
        "<init>",
        "(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/f1;)V",
        "Lcom/facebook/imagepipeline/producers/m;",
        "consumer",
        "Lcom/facebook/imagepipeline/producers/w0;",
        "context",
        "",
        "a",
        "(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V",
        "Lcom/facebook/imagepipeline/producers/v0;",
        "c",
        "()Lcom/facebook/imagepipeline/producers/v0;",
        "b",
        "Lcom/facebook/imagepipeline/producers/f1;",
        "d",
        "()Lcom/facebook/imagepipeline/producers/f1;",
        "Companion",
        "imagepipeline_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nThreadHandoffProducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadHandoffProducer.kt\ncom/facebook/imagepipeline/producers/ThreadHandoffProducer\n+ 2 FrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/FrescoSystrace\n*L\n1#1,72:1\n40#2,9:73\n*S KotlinDebug\n*F\n+ 1 ThreadHandoffProducer.kt\ncom/facebook/imagepipeline/producers/ThreadHandoffProducer\n*L\n22#1:73,9\n*E\n"
    }
.end annotation


# static fields
.field public static final c:Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/facebook/imagepipeline/producers/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/producers/v0<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/facebook/imagepipeline/producers/f1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;->c:Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$Companion;

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
.end method

.method public constructor <init>(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/f1;)V
    .locals 1
    .param p1    # Lcom/facebook/imagepipeline/producers/v0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/facebook/imagepipeline/producers/f1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "TT;>;",
            "Lcom/facebook/imagepipeline/producers/f1;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "inputProducer"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "threadHandoffProducerQueue"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;->a:Lcom/facebook/imagepipeline/producers/v0;

    .line 17
    .line 18
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;->b:Lcom/facebook/imagepipeline/producers/f1;

    .line 19
    return-void
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
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V
    .locals 5
    .param p1    # Lcom/facebook/imagepipeline/producers/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/facebook/imagepipeline/producers/w0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/m<",
            "TT;>;",
            "Lcom/facebook/imagepipeline/producers/w0;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "consumer"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "context"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Ld6/b;->d()Z

    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    const-string v2, "BackgroundThreadHandoffProducer"

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/w0;->g()Lcom/facebook/imagepipeline/producers/y0;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    sget-object v3, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;->c:Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$Companion;

    .line 26
    .line 27
    .line 28
    invoke-static {v3, p2}, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$Companion;->access$shouldRunImmediately(Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$Companion;Lcom/facebook/imagepipeline/producers/w0;)Z

    .line 29
    move-result v4

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, p2, v2}, Lcom/facebook/imagepipeline/producers/y0;->b(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, p2, v2, v1}, Lcom/facebook/imagepipeline/producers/y0;->j(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;Ljava/util/Map;)V

    .line 38
    .line 39
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;->a:Lcom/facebook/imagepipeline/producers/v0;

    .line 40
    .line 41
    .line 42
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/v0;->a(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V

    .line 43
    return-void

    .line 44
    .line 45
    :cond_0
    new-instance v1, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$b;

    .line 46
    .line 47
    .line 48
    invoke-direct {v1, p1, v0, p2, p0}, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$b;-><init>(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/y0;Lcom/facebook/imagepipeline/producers/w0;Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;)V

    .line 49
    .line 50
    new-instance p1, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$a;

    .line 51
    .line 52
    .line 53
    invoke-direct {p1, v1, p0}, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$a;-><init>(Lcom/facebook/imagepipeline/producers/d1;Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p2, p1}, Lcom/facebook/imagepipeline/producers/w0;->i(Lcom/facebook/imagepipeline/producers/x0;)V

    .line 57
    .line 58
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;->b:Lcom/facebook/imagepipeline/producers/f1;

    .line 59
    .line 60
    .line 61
    invoke-static {v3, p2}, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$Companion;->access$getInstrumentationTag(Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$Companion;Lcom/facebook/imagepipeline/producers/w0;)Ljava/lang/String;

    .line 62
    move-result-object p2

    .line 63
    .line 64
    .line 65
    invoke-static {v1, p2}, Ly5/a;->a(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Runnable;

    .line 66
    move-result-object p2

    .line 67
    .line 68
    .line 69
    invoke-interface {p1, p2}, Lcom/facebook/imagepipeline/producers/f1;->b(Ljava/lang/Runnable;)V

    .line 70
    return-void

    .line 71
    .line 72
    :cond_1
    const-string v0, "ThreadHandoffProducer#produceResults"

    .line 73
    .line 74
    .line 75
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :try_start_0
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/w0;->g()Lcom/facebook/imagepipeline/producers/y0;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    sget-object v3, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;->c:Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$Companion;

    .line 82
    .line 83
    .line 84
    invoke-static {v3, p2}, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$Companion;->access$shouldRunImmediately(Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$Companion;Lcom/facebook/imagepipeline/producers/w0;)Z

    .line 85
    move-result v4

    .line 86
    .line 87
    if-eqz v4, :cond_2

    .line 88
    .line 89
    .line 90
    invoke-interface {v0, p2, v2}, Lcom/facebook/imagepipeline/producers/y0;->b(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v0, p2, v2, v1}, Lcom/facebook/imagepipeline/producers/y0;->j(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;Ljava/util/Map;)V

    .line 94
    .line 95
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;->a:Lcom/facebook/imagepipeline/producers/v0;

    .line 96
    .line 97
    .line 98
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/v0;->a(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    .line 101
    invoke-static {}, Ld6/b;->b()V

    .line 102
    return-void

    .line 103
    :catchall_0
    move-exception p1

    .line 104
    goto :goto_0

    .line 105
    .line 106
    :cond_2
    :try_start_1
    new-instance v1, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$b;

    .line 107
    .line 108
    .line 109
    invoke-direct {v1, p1, v0, p2, p0}, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$b;-><init>(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/y0;Lcom/facebook/imagepipeline/producers/w0;Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;)V

    .line 110
    .line 111
    new-instance p1, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$a;

    .line 112
    .line 113
    .line 114
    invoke-direct {p1, v1, p0}, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$a;-><init>(Lcom/facebook/imagepipeline/producers/d1;Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;)V

    .line 115
    .line 116
    .line 117
    invoke-interface {p2, p1}, Lcom/facebook/imagepipeline/producers/w0;->i(Lcom/facebook/imagepipeline/producers/x0;)V

    .line 118
    .line 119
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;->b:Lcom/facebook/imagepipeline/producers/f1;

    .line 120
    .line 121
    .line 122
    invoke-static {v3, p2}, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$Companion;->access$getInstrumentationTag(Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$Companion;Lcom/facebook/imagepipeline/producers/w0;)Ljava/lang/String;

    .line 123
    move-result-object p2

    .line 124
    .line 125
    .line 126
    invoke-static {v1, p2}, Ly5/a;->a(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Runnable;

    .line 127
    move-result-object p2

    .line 128
    .line 129
    .line 130
    invoke-interface {p1, p2}, Lcom/facebook/imagepipeline/producers/f1;->b(Ljava/lang/Runnable;)V

    .line 131
    .line 132
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    .line 134
    .line 135
    invoke-static {}, Ld6/b;->b()V

    .line 136
    return-void

    .line 137
    .line 138
    .line 139
    :goto_0
    invoke-static {}, Ld6/b;->b()V

    .line 140
    throw p1
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public final c()Lcom/facebook/imagepipeline/producers/v0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;->a:Lcom/facebook/imagepipeline/producers/v0;

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
.end method

.method public final d()Lcom/facebook/imagepipeline/producers/f1;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;->b:Lcom/facebook/imagepipeline/producers/f1;

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
.end method
