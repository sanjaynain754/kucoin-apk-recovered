.class public abstract Lkotlin/reflect/jvm/internal/impl/metadata/serialization/MutableTable;
.super Ljava/lang/Object;
.source "MutableTable.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Element:",
        "Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$Builder<",
        "*TElement;>;Table:",
        "Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite;",
        "TableBuilder:",
        "Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$Builder<",
        "TTable;TTableBuilder;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final interner:Lkotlin/reflect/jvm/internal/impl/metadata/serialization/Interner;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/reflect/jvm/internal/impl/metadata/serialization/Interner<",
            "Lkotlin/reflect/jvm/internal/impl/metadata/serialization/TableElementWrapper<",
            "TElement;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# virtual methods
.method public final get(Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$Builder;)I
    .locals 2
    .param p1    # Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$Builder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TElement;)I"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "type"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/serialization/MutableTable;->interner:Lkotlin/reflect/jvm/internal/impl/metadata/serialization/Interner;

    .line 9
    .line 10
    new-instance v1, Lkotlin/reflect/jvm/internal/impl/metadata/serialization/TableElementWrapper;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p1}, Lkotlin/reflect/jvm/internal/impl/metadata/serialization/TableElementWrapper;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$Builder;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lkotlin/reflect/jvm/internal/impl/metadata/serialization/Interner;->intern(Ljava/lang/Object;)I

    .line 17
    move-result p1

    .line 18
    return p1
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
