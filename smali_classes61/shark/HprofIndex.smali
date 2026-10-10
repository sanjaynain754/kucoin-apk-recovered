.class public final Lshark/HprofIndex;
.super Ljava/lang/Object;
.source "HprofIndex.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lshark/HprofIndex$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B!\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0014"
    }
    d2 = {
        "Lshark/HprofIndex;",
        "",
        "Lshark/t;",
        "sourceProvider",
        "Lshark/HprofHeader;",
        "header",
        "Lshark/internal/HprofInMemoryIndex;",
        "index",
        "<init>",
        "(Lshark/t;Lshark/HprofHeader;Lshark/internal/HprofInMemoryIndex;)V",
        "Lshark/a;",
        "a",
        "()Lshark/a;",
        "Lshark/t;",
        "b",
        "Lshark/HprofHeader;",
        "c",
        "Lshark/internal/HprofInMemoryIndex;",
        "d",
        "Companion",
        "shark-graph"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# static fields
.field public static final d:Lshark/HprofIndex$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lshark/t;

.field public final b:Lshark/HprofHeader;

.field public final c:Lshark/internal/HprofInMemoryIndex;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lshark/HprofIndex$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lshark/HprofIndex$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lshark/HprofIndex;->d:Lshark/HprofIndex$Companion;

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
.end method

.method public constructor <init>(Lshark/t;Lshark/HprofHeader;Lshark/internal/HprofInMemoryIndex;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lshark/HprofIndex;->a:Lshark/t;

    iput-object p2, p0, Lshark/HprofIndex;->b:Lshark/HprofHeader;

    iput-object p3, p0, Lshark/HprofIndex;->c:Lshark/internal/HprofInMemoryIndex;

    return-void
.end method

.method public synthetic constructor <init>(Lshark/t;Lshark/HprofHeader;Lshark/internal/HprofInMemoryIndex;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lshark/HprofIndex;-><init>(Lshark/t;Lshark/HprofHeader;Lshark/internal/HprofInMemoryIndex;)V

    return-void
.end method


# virtual methods
.method public final a()Lshark/a;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lshark/RandomAccessHprofReader;->e:Lshark/RandomAccessHprofReader$Companion;

    .line 3
    .line 4
    iget-object v1, p0, Lshark/HprofIndex;->a:Lshark/t;

    .line 5
    .line 6
    iget-object v2, p0, Lshark/HprofIndex;->b:Lshark/HprofHeader;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lshark/RandomAccessHprofReader$Companion;->openReaderFor(Lshark/t;Lshark/HprofHeader;)Lshark/RandomAccessHprofReader;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    new-instance v1, Lshark/HprofHeapGraph;

    .line 13
    .line 14
    iget-object v2, p0, Lshark/HprofIndex;->b:Lshark/HprofHeader;

    .line 15
    .line 16
    iget-object v3, p0, Lshark/HprofIndex;->c:Lshark/internal/HprofInMemoryIndex;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, v2, v0, v3}, Lshark/HprofHeapGraph;-><init>(Lshark/HprofHeader;Lshark/RandomAccessHprofReader;Lshark/internal/HprofInMemoryIndex;)V

    .line 20
    return-object v1
    .line 21
.end method
