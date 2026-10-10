.class public abstract Ljumio/core/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    const/16 v0, 0x1c

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
    const-wide v1, 0x8cbbb2c0960879fL

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, v2}, Lcom/jumio/commons/obfuscate/StringDeobfuscator;->deobfuscate([BJ)Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sput-object v0, Ljumio/core/x;->a:Ljava/lang/String;

    .line 19
    return-void

    .line 20
    nop

    .line 21
    :array_0
    .array-data 1
        -0x4bt
        0x79t
        -0x7t
        -0x2ct
        0x26t
        0x61t
        -0x49t
        -0x25t
        0x63t
        -0x29t
        -0x52t
        0x29t
        0x65t
        0x5ft
        -0x57t
        -0xbt
        -0x65t
        -0x2ft
        -0x3dt
        0x41t
        -0x51t
        -0xbt
        0x68t
        -0x1ct
        0x49t
        -0x49t
        0x5dt
        0x16t
    .end array-data
.end method
