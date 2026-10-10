.class public final Lcom/jumio/commons/obfuscate/StringDeobfuscator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/jumio/commons/obfuscate/StringDeobfuscator;",
        "",
        "<init>",
        "()V",
        "deobfuscate",
        "",
        "input",
        "",
        "seed",
        "",
        "jumio-core_release"
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
        "SMAP\nStringDeobfuscator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringDeobfuscator.kt\ncom/jumio/commons/obfuscate/StringDeobfuscator\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,20:1\n13477#2,3:21\n*S KotlinDebug\n*F\n+ 1 StringDeobfuscator.kt\ncom/jumio/commons/obfuscate/StringDeobfuscator\n*L\n13#1:21,3\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/jumio/commons/obfuscate/StringDeobfuscator;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/commons/obfuscate/StringDeobfuscator;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/jumio/commons/obfuscate/StringDeobfuscator;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/jumio/commons/obfuscate/StringDeobfuscator;->INSTANCE:Lcom/jumio/commons/obfuscate/StringDeobfuscator;

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
.end method

.method public static final deobfuscate([BJ)Ljava/lang/String;
    .locals 5
    .param p0    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "input"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    array-length v0, p0

    .line 7
    .line 8
    new-array v0, v0, [B

    .line 9
    .line 10
    new-instance v1, Ljava/util/Random;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p1, p2}, Ljava/util/Random;-><init>(J)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/util/Random;->nextBytes([B)V

    .line 17
    array-length p1, p0

    .line 18
    const/4 p2, 0x0

    .line 19
    move v1, p2

    .line 20
    .line 21
    :goto_0
    if-ge p2, p1, :cond_0

    .line 22
    .line 23
    aget-byte v2, p0, p2

    .line 24
    .line 25
    add-int/lit8 v3, v1, 0x1

    .line 26
    .line 27
    aget-byte v4, v0, v1

    .line 28
    xor-int/2addr v2, v4

    .line 29
    int-to-byte v2, v2

    .line 30
    .line 31
    aput-byte v2, v0, v1

    .line 32
    .line 33
    add-int/lit8 p2, p2, 0x1

    .line 34
    move v1, v3

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 38
    .line 39
    sget-object p1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, v0, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 43
    return-object p0
    .line 44
    .line 45
    .line 46
    .line 47
.end method
