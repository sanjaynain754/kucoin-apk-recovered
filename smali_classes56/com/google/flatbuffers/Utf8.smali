.class public abstract Lcom/google/flatbuffers/Utf8;
.super Ljava/lang/Object;
.source "Utf8.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/flatbuffers/Utf8$UnpairedSurrogateException;,
        Lcom/google/flatbuffers/Utf8$DecodeUtil;
    }
.end annotation


# static fields
.field private static DEFAULT:Lcom/google/flatbuffers/Utf8;


# direct methods
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

.method public static getDefault()Lcom/google/flatbuffers/Utf8;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/flatbuffers/Utf8;->DEFAULT:Lcom/google/flatbuffers/Utf8;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/google/flatbuffers/Utf8Safe;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lcom/google/flatbuffers/Utf8Safe;-><init>()V

    .line 10
    .line 11
    sput-object v0, Lcom/google/flatbuffers/Utf8;->DEFAULT:Lcom/google/flatbuffers/Utf8;

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lcom/google/flatbuffers/Utf8;->DEFAULT:Lcom/google/flatbuffers/Utf8;

    .line 14
    return-object v0
    .line 15
    .line 16
.end method

.method public static setDefault(Lcom/google/flatbuffers/Utf8;)V
    .locals 0

    .line 1
    .line 2
    sput-object p0, Lcom/google/flatbuffers/Utf8;->DEFAULT:Lcom/google/flatbuffers/Utf8;

    .line 3
    return-void
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
.end method


# virtual methods
.method public abstract decodeUtf8(Ljava/nio/ByteBuffer;II)Ljava/lang/String;
.end method

.method public abstract encodeUtf8(Ljava/lang/CharSequence;Ljava/nio/ByteBuffer;)V
.end method

.method public abstract encodedLength(Ljava/lang/CharSequence;)I
.end method
