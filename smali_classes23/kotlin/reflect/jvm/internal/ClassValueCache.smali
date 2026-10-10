.class final Lkotlin/reflect/jvm/internal/ClassValueCache;
.super Lkotlin/reflect/jvm/internal/CacheByClass;
.source "CacheByClass.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/reflect/jvm/internal/CacheByClass<",
        "TV;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\u0008\u0003\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0005\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00028\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\u0008\u00030\u0005H\u0016\u00a2\u0006\u0002\u0010\u000cJ\u0008\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/ClassValueCache;",
        "V",
        "Lkotlin/reflect/jvm/internal/CacheByClass;",
        "compute",
        "Lkotlin/Function1;",
        "Ljava/lang/Class;",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;)V",
        "classValue",
        "Lkotlin/reflect/jvm/internal/ComputableClassValue;",
        "get",
        "key",
        "(Ljava/lang/Class;)Ljava/lang/Object;",
        "clear",
        "",
        "kotlin-reflection"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCacheByClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheByClass.kt\nkotlin/reflect/jvm/internal/ClassValueCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"
    }
.end annotation


# instance fields
.field private volatile classValue:Lkotlin/reflect/jvm/internal/ComputableClassValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/reflect/jvm/internal/ComputableClassValue<",
            "TV;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Class<",
            "*>;+TV;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "compute"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/CacheByClass;-><init>()V

    .line 9
    .line 10
    new-instance v0, Lkotlin/reflect/jvm/internal/ComputableClassValue;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p1}, Lkotlin/reflect/jvm/internal/ComputableClassValue;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/ClassValueCache;->classValue:Lkotlin/reflect/jvm/internal/ComputableClassValue;

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/ClassValueCache;->classValue:Lkotlin/reflect/jvm/internal/ComputableClassValue;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/ComputableClassValue;->createNewCopy()Lkotlin/reflect/jvm/internal/ComputableClassValue;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/ClassValueCache;->classValue:Lkotlin/reflect/jvm/internal/ComputableClassValue;

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
.end method

.method public get(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .param p1    # Ljava/lang/Class;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)TV;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "key"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/ClassValueCache;->classValue:Lkotlin/reflect/jvm/internal/ComputableClassValue;

    .line 9
    .line 10
    .line 11
    invoke-static {v0, p1}, Lkotlin/reflect/jvm/internal/a;->a(Lkotlin/reflect/jvm/internal/ComputableClassValue;Ljava/lang/Class;)Ljava/lang/Object;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    check-cast v1, Ljava/lang/ref/SoftReference;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    return-object v1

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-static {v0, p1}, Lkotlin/reflect/jvm/internal/b;->a(Lkotlin/reflect/jvm/internal/ComputableClassValue;Ljava/lang/Class;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0, p1}, Lkotlin/reflect/jvm/internal/a;->a(Lkotlin/reflect/jvm/internal/ComputableClassValue;Ljava/lang/Class;)Ljava/lang/Object;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    check-cast v1, Ljava/lang/ref/SoftReference;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    return-object v1

    .line 38
    .line 39
    :cond_1
    iget-object v0, v0, Lkotlin/reflect/jvm/internal/ComputableClassValue;->compute:Lkotlin/jvm/functions/Function1;

    .line 40
    .line 41
    .line 42
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    move-result-object p1

    .line 44
    return-object p1
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
.end method
