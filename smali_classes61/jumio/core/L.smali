.class public abstract Ljumio/core/L;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    const/16 v0, 0xe

    .line 3
    .line 4
    new-array v0, v0, [B

    .line 5
    .line 6
    .line 7
    fill-array-data v0, :array_0

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const-wide v1, -0x7979533872674215L    # -3.197862339592318E-277

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, v2}, Lcom/jumio/commons/obfuscate/StringDeobfuscator;->deobfuscate([BJ)Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sput-object v0, Ljumio/core/L;->a:Ljava/lang/String;

    .line 19
    return-void

    .line 20
    nop

    .line 21
    :array_0
    .array-data 1
        0x2ct
        -0x38t
        -0x64t
        -0x49t
        -0x2bt
        -0x73t
        -0x69t
        -0x32t
        -0x74t
        -0x7dt
        -0x5t
        0x14t
        0x11t
        0x1et
    .end array-data
.end method
