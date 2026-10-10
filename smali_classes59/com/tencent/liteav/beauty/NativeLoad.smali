.class public Lcom/tencent/liteav/beauty/NativeLoad;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final PROGRAM_BEAUTY:I = 0x1

.field public static final PROGRAM_BEAUTY2:I = 0x5

.field public static final PROGRAM_BEAUTY2_SAMSUNG_S4:I = 0xf

.field public static final PROGRAM_BEAUTY3_FILTER:I = 0xe

.field public static final PROGRAM_BEAUTYBLEND:I = 0xc

.field public static final PROGRAM_EYE_SCALE:I = 0x3

.field public static final PROGRAM_FACE_SLIM:I = 0x4

.field public static final PROGRAM_FACE_VAR:I = 0x2

.field public static final PROGRAM_I4202RGBA:I = 0x7

.field public static final PROGRAM_NV122RGBA:I = 0xa

.field public static final PROGRAM_NV212RGBA:I = 0x9

.field public static final PROGRAM_RGBA2I420:I = 0x8

.field public static final PROGRAM_RGBA2NV21:I = 0xb

.field public static final PROGRAM_SKIN:I = 0x6

.field public static final PROGRAM_SMOOTHHORIZONTAL:I = 0xd

.field private static final TAG:Ljava/lang/String; = "NativeLoad"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/liteav/beauty/NativeLoad;->onLoadBeauty()V

    .line 4
    .line 5
    const-string v0, "NativeLoad"

    .line 6
    .line 7
    const-string v1, "loaded liteav library"

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
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
.end method

.method public static native nativeClearQueue()V
.end method

.method public static native nativeDeleteYuv2Yuv()V
.end method

.method public static native nativeGlMapBufferToQueue(IILjava/nio/ByteBuffer;)V
.end method

.method public static native nativeGlReadPixs(II[B)V
.end method

.method public static native nativeGlReadPixsFromQueue(II[B)Z
.end method

.method public static native nativeGlReadPixsToQueue(II)V
.end method

.method public static native nativeLoadGLProgram(I)I
.end method

.method public static native nativeglTexImage2D(IIIIIIII[BI)V
.end method

.method public static native onLoadBeauty()V
.end method
