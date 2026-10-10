.class public Lcom/google/api/client/http/HttpStatusCodes;
.super Ljava/lang/Object;
.source "HttpStatusCodes.java"


# static fields
.field public static final STATUS_CODE_ACCEPTED:I = 0xca

.field public static final STATUS_CODE_BAD_GATEWAY:I = 0x1f6

.field public static final STATUS_CODE_BAD_REQUEST:I = 0x190

.field public static final STATUS_CODE_CONFLICT:I = 0x199

.field public static final STATUS_CODE_CREATED:I = 0xc9

.field public static final STATUS_CODE_FORBIDDEN:I = 0x193

.field public static final STATUS_CODE_FOUND:I = 0x12e

.field public static final STATUS_CODE_METHOD_NOT_ALLOWED:I = 0x195

.field public static final STATUS_CODE_MOVED_PERMANENTLY:I = 0x12d

.field public static final STATUS_CODE_MULTIPLE_CHOICES:I = 0x12c

.field public static final STATUS_CODE_NOT_FOUND:I = 0x194

.field public static final STATUS_CODE_NOT_MODIFIED:I = 0x130

.field public static final STATUS_CODE_NO_CONTENT:I = 0xcc

.field public static final STATUS_CODE_OK:I = 0xc8

.field private static final STATUS_CODE_PERMANENT_REDIRECT:I = 0x134

.field public static final STATUS_CODE_PRECONDITION_FAILED:I = 0x19c

.field public static final STATUS_CODE_SEE_OTHER:I = 0x12f

.field public static final STATUS_CODE_SERVER_ERROR:I = 0x1f4

.field public static final STATUS_CODE_SERVICE_UNAVAILABLE:I = 0x1f7

.field public static final STATUS_CODE_TEMPORARY_REDIRECT:I = 0x133

.field public static final STATUS_CODE_UNAUTHORIZED:I = 0x191

.field public static final STATUS_CODE_UNPROCESSABLE_ENTITY:I = 0x1a6


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

.method public static isRedirect(I)Z
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x133

    .line 3
    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    const/16 v0, 0x134

    .line 7
    .line 8
    if-eq p0, v0, :cond_0

    .line 9
    .line 10
    .line 11
    packed-switch p0, :pswitch_data_0

    .line 12
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_0
    :pswitch_0
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    nop

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    :pswitch_data_0
    .packed-switch 0x12d
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static isSuccess(I)Z
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0xc8

    .line 3
    .line 4
    if-lt p0, v0, :cond_0

    .line 5
    .line 6
    const/16 v0, 0x12c

    .line 7
    .line 8
    if-ge p0, v0, :cond_0

    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
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
