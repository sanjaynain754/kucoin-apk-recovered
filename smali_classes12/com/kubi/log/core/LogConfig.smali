.class public final Lcom/kubi/log/core/LogConfig;
.super Ljava/lang/Object;
.source "LogConfigManager.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/log/core/LogConfig$a;,
        Lcom/kubi/log/core/LogConfig$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\"\u0018\u0000 22\u00020\u0001:\u0002\u00153BM\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0008\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011B\u0011\u0008\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0010\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008!\u0010\"\u001a\u0004\u0008\u001b\u0010#\"\u0004\u0008$\u0010%R(\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010&\u001a\u0004\u0008!\u0010\'\"\u0004\u0008(\u0010)R(\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00088\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008*\u0010&\u001a\u0004\u0008+\u0010\'\"\u0004\u0008,\u0010)R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008+\u0010\"\u001a\u0004\u0008\u0015\u0010#\"\u0004\u0008-\u0010%R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010.\u001a\u0004\u0008*\u0010/\"\u0004\u00080\u00101\u00a8\u00064"
    }
    d2 = {
        "Lcom/kubi/log/core/LogConfig;",
        "",
        "Lso/b;",
        "processor",
        "Lso/d;",
        "symbolProcessor",
        "",
        "defaultTag",
        "",
        "Lso/a;",
        "logAdapters",
        "Lso/c;",
        "symbolLogAdapters",
        "appId",
        "Lcom/kubi/log/core/a$a;",
        "provider",
        "<init>",
        "(Lso/b;Lso/d;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/kubi/log/core/a$a;)V",
        "Lcom/kubi/log/core/LogConfig$a;",
        "builder",
        "(Lcom/kubi/log/core/LogConfig$a;)V",
        "a",
        "Lso/b;",
        "d",
        "()Lso/b;",
        "setProcessor",
        "(Lso/b;)V",
        "b",
        "Lso/d;",
        "g",
        "()Lso/d;",
        "setSymbolProcessor",
        "(Lso/d;)V",
        "c",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "setDefaultTag",
        "(Ljava/lang/String;)V",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "setLogAdapters",
        "(Ljava/util/List;)V",
        "e",
        "f",
        "setSymbolLogAdapters",
        "setAppId",
        "Lcom/kubi/log/core/a$a;",
        "()Lcom/kubi/log/core/a$a;",
        "setProvider",
        "(Lcom/kubi/log/core/a$a;)V",
        "h",
        "Companion",
        "Logger-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final h:Lcom/kubi/log/core/LogConfig$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public a:Lso/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Lso/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lso/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lso/c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public f:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public g:Lcom/kubi/log/core/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/log/core/LogConfig$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/log/core/LogConfig$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/log/core/LogConfig;->h:Lcom/kubi/log/core/LogConfig$Companion;

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
.end method

.method public constructor <init>(Lcom/kubi/log/core/LogConfig$a;)V
    .locals 8

    .line 10
    invoke-virtual {p1}, Lcom/kubi/log/core/LogConfig$a;->e()Lso/b;

    move-result-object v1

    .line 11
    invoke-virtual {p1}, Lcom/kubi/log/core/LogConfig$a;->h()Lso/d;

    move-result-object v2

    .line 12
    invoke-virtual {p1}, Lcom/kubi/log/core/LogConfig$a;->c()Ljava/lang/String;

    move-result-object v3

    .line 13
    invoke-virtual {p1}, Lcom/kubi/log/core/LogConfig$a;->d()Ljava/util/List;

    move-result-object v4

    .line 14
    invoke-virtual {p1}, Lcom/kubi/log/core/LogConfig$a;->g()Ljava/util/List;

    move-result-object v5

    .line 15
    invoke-virtual {p1}, Lcom/kubi/log/core/LogConfig$a;->b()Ljava/lang/String;

    move-result-object v6

    .line 16
    invoke-virtual {p1}, Lcom/kubi/log/core/LogConfig$a;->f()Lcom/kubi/log/core/a$a;

    move-result-object v7

    move-object v0, p0

    .line 17
    invoke-direct/range {v0 .. v7}, Lcom/kubi/log/core/LogConfig;-><init>(Lso/b;Lso/d;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/kubi/log/core/a$a;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/kubi/log/core/LogConfig$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kubi/log/core/LogConfig;-><init>(Lcom/kubi/log/core/LogConfig$a;)V

    return-void
.end method

.method public constructor <init>(Lso/b;Lso/d;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/kubi/log/core/a$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lso/b;",
            "Lso/d;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lso/a;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lso/c;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/kubi/log/core/a$a;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/kubi/log/core/LogConfig;->a:Lso/b;

    .line 4
    iput-object p2, p0, Lcom/kubi/log/core/LogConfig;->b:Lso/d;

    .line 5
    iput-object p3, p0, Lcom/kubi/log/core/LogConfig;->c:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/kubi/log/core/LogConfig;->d:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/kubi/log/core/LogConfig;->e:Ljava/util/List;

    .line 8
    iput-object p6, p0, Lcom/kubi/log/core/LogConfig;->f:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/kubi/log/core/LogConfig;->g:Lcom/kubi/log/core/a$a;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/log/core/LogConfig;->f:Ljava/lang/String;

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
.end method

.method public final b()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/log/core/LogConfig;->c:Ljava/lang/String;

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
.end method

.method public final c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lso/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/log/core/LogConfig;->d:Ljava/util/List;

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
.end method

.method public final d()Lso/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/log/core/LogConfig;->a:Lso/b;

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
.end method

.method public final e()Lcom/kubi/log/core/a$a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/log/core/LogConfig;->g:Lcom/kubi/log/core/a$a;

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
.end method

.method public final f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lso/c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/log/core/LogConfig;->e:Ljava/util/List;

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
.end method

.method public final g()Lso/d;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/log/core/LogConfig;->b:Lso/d;

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
.end method
