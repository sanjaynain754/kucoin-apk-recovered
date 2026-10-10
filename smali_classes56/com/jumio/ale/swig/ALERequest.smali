.class public Lcom/jumio/ale/swig/ALERequest;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public transient a:J

.field protected transient swigCMemOwn:Z


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/jumio/ale/swig/ALERequest;->swigCMemOwn:Z

    .line 6
    .line 7
    iput-wide p1, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

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
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public static getCPtr(Lcom/jumio/ale/swig/ALERequest;)J
    .locals 2

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    return-wide v0

    .line 6
    .line 7
    :cond_0
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    .line 8
    return-wide v0
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
.method public calculateRequestFinish()I
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p0}, Lcom/jumio/ale/swig/aleEngineJNI;->ALERequest_calculateRequestFinish(JLcom/jumio/ale/swig/ALERequest;)I

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public calculateRequestInit(Lcom/jumio/ale/swig/ALEHeader;I)I
    .locals 7

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/jumio/ale/swig/ALEHeader;->getCPtr(Lcom/jumio/ale/swig/ALEHeader;)J

    .line 6
    move-result-wide v3

    .line 7
    move-object v2, p0

    .line 8
    move-object v5, p1

    .line 9
    move v6, p2

    .line 10
    .line 11
    .line 12
    invoke-static/range {v0 .. v6}, Lcom/jumio/ale/swig/aleEngineJNI;->ALERequest_calculateRequestInit(JLcom/jumio/ale/swig/ALERequest;JLcom/jumio/ale/swig/ALEHeader;I)I

    .line 13
    move-result p1

    .line 14
    return p1
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
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public calculateRequestSize(Lcom/jumio/ale/swig/ALEHeader;I)I
    .locals 7

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/jumio/ale/swig/ALEHeader;->getCPtr(Lcom/jumio/ale/swig/ALEHeader;)J

    .line 6
    move-result-wide v3

    .line 7
    move-object v2, p0

    .line 8
    move-object v5, p1

    .line 9
    move v6, p2

    .line 10
    .line 11
    .line 12
    invoke-static/range {v0 .. v6}, Lcom/jumio/ale/swig/aleEngineJNI;->ALERequest_calculateRequestSize(JLcom/jumio/ale/swig/ALERequest;JLcom/jumio/ale/swig/ALEHeader;I)I

    .line 13
    move-result p1

    .line 14
    return p1
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
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public calculateRequestUpdate(I)I
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p0, p1}, Lcom/jumio/ale/swig/aleEngineJNI;->ALERequest_calculateRequestUpdate(JLcom/jumio/ale/swig/ALERequest;I)I

    .line 6
    move-result p1

    .line 7
    return p1
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

.method public calculateResponseSize([B)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p0, p1}, Lcom/jumio/ale/swig/aleEngineJNI;->ALERequest_calculateResponseSize(JLcom/jumio/ale/swig/ALERequest;[B)I

    .line 6
    move-result p1

    .line 7
    return p1
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

.method public declared-synchronized delete()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/jumio/ale/swig/ALERequest;->swigCMemOwn:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iput-wide v2, p0, Lcom/jumio/ale/swig/ALERequest;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    monitor-exit p0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    .line 22
    :try_start_1
    iput-boolean v0, p0, Lcom/jumio/ale/swig/ALERequest;->swigCMemOwn:Z

    .line 23
    .line 24
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 25
    .line 26
    const-string v1, "C++ destructor does not have public access"

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 30
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    :cond_1
    monitor-exit p0

    .line 32
    return-void

    .line 33
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 34
    throw v0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public finishRequest([B)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    invoke-static {v0, v1, p0, p1}, Lcom/jumio/ale/swig/aleEngineJNI;->ALERequest_finishRequest__SWIG_1(JLcom/jumio/ale/swig/ALERequest;[B)I

    move-result p1

    return p1
.end method

.method public finishRequest([BI)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/jumio/ale/swig/aleEngineJNI;->ALERequest_finishRequest__SWIG_0(JLcom/jumio/ale/swig/ALERequest;[BI)I

    move-result p1

    return p1
.end method

.method public finishResponse()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p0}, Lcom/jumio/ale/swig/aleEngineJNI;->ALERequest_finishResponse(JLcom/jumio/ale/swig/ALERequest;)Z

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public getErrorCode()I
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p0}, Lcom/jumio/ale/swig/aleEngineJNI;->ALERequest_getErrorCode(JLcom/jumio/ale/swig/ALERequest;)I

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public initRequest(Lcom/jumio/ale/swig/ALEHeader;I[B)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    invoke-static {p1}, Lcom/jumio/ale/swig/ALEHeader;->getCPtr(Lcom/jumio/ale/swig/ALEHeader;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    move-object v7, p3

    invoke-static/range {v0 .. v7}, Lcom/jumio/ale/swig/aleEngineJNI;->ALERequest_initRequest__SWIG_1(JLcom/jumio/ale/swig/ALERequest;JLcom/jumio/ale/swig/ALEHeader;I[B)I

    move-result p1

    return p1
.end method

.method public initRequest(Lcom/jumio/ale/swig/ALEHeader;I[BI)I
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    invoke-static {p1}, Lcom/jumio/ale/swig/ALEHeader;->getCPtr(Lcom/jumio/ale/swig/ALEHeader;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    move-object v7, p3

    move v8, p4

    invoke-static/range {v0 .. v8}, Lcom/jumio/ale/swig/aleEngineJNI;->ALERequest_initRequest__SWIG_0(JLcom/jumio/ale/swig/ALERequest;JLcom/jumio/ale/swig/ALEHeader;I[BI)I

    move-result p1

    return p1
.end method

.method public initResponse()V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p0}, Lcom/jumio/ale/swig/aleEngineJNI;->ALERequest_initResponse(JLcom/jumio/ale/swig/ALERequest;)V

    .line 6
    return-void
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

.method public isKeyUpdate()Z
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p0}, Lcom/jumio/ale/swig/aleEngineJNI;->ALERequest_isKeyUpdate(JLcom/jumio/ale/swig/ALERequest;)Z

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public isVerified()Z
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p0}, Lcom/jumio/ale/swig/aleEngineJNI;->ALERequest_isVerified(JLcom/jumio/ale/swig/ALERequest;)Z

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public request(Lcom/jumio/ale/swig/ALEHeader;[B[B)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    invoke-static {p1}, Lcom/jumio/ale/swig/ALEHeader;->getCPtr(Lcom/jumio/ale/swig/ALEHeader;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    invoke-static/range {v0 .. v7}, Lcom/jumio/ale/swig/aleEngineJNI;->ALERequest_request__SWIG_1(JLcom/jumio/ale/swig/ALERequest;JLcom/jumio/ale/swig/ALEHeader;[B[B)I

    move-result p1

    return p1
.end method

.method public request(Lcom/jumio/ale/swig/ALEHeader;[B[BI)I
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    invoke-static {p1}, Lcom/jumio/ale/swig/ALEHeader;->getCPtr(Lcom/jumio/ale/swig/ALEHeader;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move v8, p4

    invoke-static/range {v0 .. v8}, Lcom/jumio/ale/swig/aleEngineJNI;->ALERequest_request__SWIG_0(JLcom/jumio/ale/swig/ALERequest;JLcom/jumio/ale/swig/ALEHeader;[B[BI)I

    move-result p1

    return p1
.end method

.method public response([B[B)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/jumio/ale/swig/aleEngineJNI;->ALERequest_response__SWIG_1(JLcom/jumio/ale/swig/ALERequest;[B[B)I

    move-result p1

    return p1
.end method

.method public response([B[BI)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    invoke-static/range {v0 .. v5}, Lcom/jumio/ale/swig/aleEngineJNI;->ALERequest_response__SWIG_0(JLcom/jumio/ale/swig/ALERequest;[B[BI)I

    move-result p1

    return p1
.end method

.method public updateRequest([B[B)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/jumio/ale/swig/aleEngineJNI;->ALERequest_updateRequest__SWIG_1(JLcom/jumio/ale/swig/ALERequest;[B[B)I

    move-result p1

    return p1
.end method

.method public updateRequest([B[BI)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    invoke-static/range {v0 .. v5}, Lcom/jumio/ale/swig/aleEngineJNI;->ALERequest_updateRequest__SWIG_0(JLcom/jumio/ale/swig/ALERequest;[B[BI)I

    move-result p1

    return p1
.end method

.method public updateResponse([B[B)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/jumio/ale/swig/aleEngineJNI;->ALERequest_updateResponse__SWIG_1(JLcom/jumio/ale/swig/ALERequest;[B[B)I

    move-result p1

    return p1
.end method

.method public updateResponse([B[BI)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALERequest;->a:J

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    invoke-static/range {v0 .. v5}, Lcom/jumio/ale/swig/aleEngineJNI;->ALERequest_updateResponse__SWIG_0(JLcom/jumio/ale/swig/ALERequest;[B[BI)I

    move-result p1

    return p1
.end method
