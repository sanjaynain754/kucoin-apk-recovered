.class public final Lshark/MetadataExtractor$Companion;
.super Ljava/lang/Object;
.source "MetadataExtractor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lshark/MetadataExtractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J2\u0010\n\u001a\u00020\t2 \u0008\u0004\u0010\u0008\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0004H\u0086\n\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lshark/MetadataExtractor$Companion;",
        "",
        "<init>",
        "()V",
        "Lkotlin/Function1;",
        "Lshark/i;",
        "",
        "",
        "block",
        "Lshark/MetadataExtractor;",
        "invoke",
        "(Lkotlin/jvm/functions/Function1;)Lshark/MetadataExtractor;",
        "a",
        "Lshark/MetadataExtractor;",
        "getNO_OP",
        "()Lshark/MetadataExtractor;",
        "NO_OP",
        "shark"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# static fields
.field public static final a:Lshark/MetadataExtractor;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic b:Lshark/MetadataExtractor$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lshark/MetadataExtractor$Companion;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lshark/MetadataExtractor$Companion;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lshark/MetadataExtractor$Companion;->b:Lshark/MetadataExtractor$Companion;

    .line 8
    .line 9
    sget-object v0, Lshark/MetadataExtractor$Companion$a;->b:Lshark/MetadataExtractor$Companion$a;

    .line 10
    .line 11
    sput-object v0, Lshark/MetadataExtractor$Companion;->a:Lshark/MetadataExtractor;

    .line 12
    return-void
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
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final getNO_OP()Lshark/MetadataExtractor;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lshark/MetadataExtractor$Companion;->a:Lshark/MetadataExtractor;

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
.end method

.method public final invoke(Lkotlin/jvm/functions/Function1;)Lshark/MetadataExtractor;
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
            "Lshark/i;",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)",
            "Lshark/MetadataExtractor;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lshark/MetadataExtractor$Companion$b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lshark/MetadataExtractor$Companion$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 6
    return-object v0
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
