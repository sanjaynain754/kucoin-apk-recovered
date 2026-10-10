.class public Lcom/jumio/ale/swig/ALESettings;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public transient a:J

.field protected transient swigCMemOwn:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 4
    invoke-static {}, Lcom/jumio/ale/swig/aleEngineJNI;->new_ALESettings()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/jumio/ale/swig/ALESettings;-><init>(JZ)V

    .line 5
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALESettings;->a:J

    invoke-static {p0, v0, v1, v2, v2}, Lcom/jumio/ale/swig/aleEngineJNI;->ALESettings_director_connect(Lcom/jumio/ale/swig/ALESettings;JZZ)V

    return-void
.end method

.method public constructor <init>(JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p3, p0, Lcom/jumio/ale/swig/ALESettings;->swigCMemOwn:Z

    .line 3
    iput-wide p1, p0, Lcom/jumio/ale/swig/ALESettings;->a:J

    return-void
.end method

.method public static getCPtr(Lcom/jumio/ale/swig/ALESettings;)J
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
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALESettings;->a:J

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
.method public declared-synchronized delete()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALESettings;->a:J

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v4, v0, v2

    .line 8
    .line 9
    if-eqz v4, :cond_1

    .line 10
    .line 11
    iget-boolean v4, p0, Lcom/jumio/ale/swig/ALESettings;->swigCMemOwn:Z

    .line 12
    .line 13
    if-eqz v4, :cond_0

    .line 14
    const/4 v4, 0x0

    .line 15
    .line 16
    iput-boolean v4, p0, Lcom/jumio/ale/swig/ALESettings;->swigCMemOwn:Z

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/jumio/ale/swig/aleEngineJNI;->delete_ALESettings(J)V

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_1

    .line 23
    .line 24
    :cond_0
    :goto_0
    iput-wide v2, p0, Lcom/jumio/ale/swig/ALESettings;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    monitor-exit p0

    .line 26
    return-void

    .line 27
    :cond_1
    monitor-exit p0

    .line 28
    return-void

    .line 29
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw v0
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

.method public finalize()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/ale/swig/ALESettings;->delete()V

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

.method public getDirectory()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALESettings;->a:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p0}, Lcom/jumio/ale/swig/aleEngineJNI;->ALESettings_getDirectory(JLcom/jumio/ale/swig/ALESettings;)Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public getKeyID()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALESettings;->a:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p0}, Lcom/jumio/ale/swig/aleEngineJNI;->ALESettings_getKeyID(JLcom/jumio/ale/swig/ALESettings;)Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public getPublicKey()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALESettings;->a:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p0}, Lcom/jumio/ale/swig/aleEngineJNI;->ALESettings_getPublicKey(JLcom/jumio/ale/swig/ALESettings;)Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public setDirectory(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALESettings;->a:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p0, p1}, Lcom/jumio/ale/swig/aleEngineJNI;->ALESettings_setDirectory(JLcom/jumio/ale/swig/ALESettings;Ljava/lang/String;)V

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setKeyID(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALESettings;->a:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p0, p1}, Lcom/jumio/ale/swig/aleEngineJNI;->ALESettings_setKeyID(JLcom/jumio/ale/swig/ALESettings;Ljava/lang/String;)V

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setPublicKey(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/ale/swig/ALESettings;->a:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p0, p1}, Lcom/jumio/ale/swig/aleEngineJNI;->ALESettings_setPublicKey(JLcom/jumio/ale/swig/ALESettings;Ljava/lang/String;)V

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public swigDirectorDisconnect()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/jumio/ale/swig/ALESettings;->swigCMemOwn:Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/jumio/ale/swig/ALESettings;->delete()V

    .line 7
    return-void
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

.method public swigReleaseOwnership()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/jumio/ale/swig/ALESettings;->swigCMemOwn:Z

    .line 4
    .line 5
    iget-wide v1, p0, Lcom/jumio/ale/swig/ALESettings;->a:J

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v1, v2, v0}, Lcom/jumio/ale/swig/aleEngineJNI;->ALESettings_change_ownership(Lcom/jumio/ale/swig/ALESettings;JZ)V

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public swigTakeOwnership()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/jumio/ale/swig/ALESettings;->swigCMemOwn:Z

    .line 4
    .line 5
    iget-wide v1, p0, Lcom/jumio/ale/swig/ALESettings;->a:J

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v1, v2, v0}, Lcom/jumio/ale/swig/aleEngineJNI;->ALESettings_change_ownership(Lcom/jumio/ale/swig/ALESettings;JZ)V

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method
