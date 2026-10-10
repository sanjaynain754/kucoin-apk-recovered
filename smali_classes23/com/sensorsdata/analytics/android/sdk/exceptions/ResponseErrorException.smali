.class public Lcom/sensorsdata/analytics/android/sdk/exceptions/ResponseErrorException;
.super Ljava/lang/Exception;
.source "ResponseErrorException.java"


# instance fields
.field private httpCode:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 2
    iput p2, p0, Lcom/sensorsdata/analytics/android/sdk/exceptions/ResponseErrorException;->httpCode:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 4
    iput p2, p0, Lcom/sensorsdata/analytics/android/sdk/exceptions/ResponseErrorException;->httpCode:I

    return-void
.end method


# virtual methods
.method public getHttpCode()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/sensorsdata/analytics/android/sdk/exceptions/ResponseErrorException;->httpCode:I

    .line 3
    return v0
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
.end method
