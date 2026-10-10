.class public final Lkotlinx/serialization/internal/t$a;
.super Ljava/lang/Object;
.source "Caching.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/serialization/internal/t;->a(Lkotlin/reflect/KClass;)Ltg0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences$getOrSet$2\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueCache\n*L\n1#1,89:1\n52#2:90\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Lkotlinx/serialization/internal/t;

.field public final synthetic c:Lkotlin/reflect/KClass;


# direct methods
.method public constructor <init>(Lkotlinx/serialization/internal/t;Lkotlin/reflect/KClass;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lkotlinx/serialization/internal/t$a;->b:Lkotlinx/serialization/internal/t;

    .line 3
    .line 4
    iput-object p2, p0, Lkotlinx/serialization/internal/t$a;->c:Lkotlin/reflect/KClass;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lkotlinx/serialization/internal/m;

    .line 3
    .line 4
    iget-object v1, p0, Lkotlinx/serialization/internal/t$a;->b:Lkotlinx/serialization/internal/t;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lkotlinx/serialization/internal/t;->b()Lkotlin/jvm/functions/Function1;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iget-object v2, p0, Lkotlinx/serialization/internal/t$a;->c:Lkotlin/reflect/KClass;

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    check-cast v1, Ltg0/d;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/m;-><init>(Ltg0/d;)V

    .line 20
    return-object v0
    .line 21
.end method
