.class public Lcom/jumio/ale/swig/aleEngineJNI;
.super Ljava/lang/Object;
.source "SourceFile"


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

.method public static final native AESGCM_change_ownership(Lcom/jumio/ale/swig/AESGCM;JZ)V
.end method

.method public static final native AESGCM_director_connect(Lcom/jumio/ale/swig/AESGCM;JZZ)V
.end method

.method public static final native AESGCM_finish(JLcom/jumio/ale/swig/AESGCM;[BI)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native AESGCM_generateIV(JLcom/jumio/ale/swig/AESGCM;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native AESGCM_generateKey(JLcom/jumio/ale/swig/AESGCM;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native AESGCM_init(JLcom/jumio/ale/swig/AESGCM;)V
.end method

.method public static final native AESGCM_reset(JLcom/jumio/ale/swig/AESGCM;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native AESGCM_setIV(JLcom/jumio/ale/swig/AESGCM;[B)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native AESGCM_setKey__SWIG_0(JLcom/jumio/ale/swig/AESGCM;[B)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native AESGCM_setMode(JLcom/jumio/ale/swig/AESGCM;I)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native AESGCM_update(JLcom/jumio/ale/swig/AESGCM;[BI[BI)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native ALECore_createRequest(JLcom/jumio/ale/swig/ALECore;)J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native ALECore_destroyRequest(JLcom/jumio/ale/swig/ALECore;JLcom/jumio/ale/swig/ALERequest;)V
.end method

.method public static final native ALEHeader_add__SWIG_0(JLcom/jumio/ale/swig/ALEHeader;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static final native ALEHeader_clear(JLcom/jumio/ale/swig/ALEHeader;)V
.end method

.method public static final native ALERequest_calculateRequestFinish(JLcom/jumio/ale/swig/ALERequest;)I
.end method

.method public static final native ALERequest_calculateRequestInit(JLcom/jumio/ale/swig/ALERequest;JLcom/jumio/ale/swig/ALEHeader;I)I
.end method

.method public static final native ALERequest_calculateRequestSize(JLcom/jumio/ale/swig/ALERequest;JLcom/jumio/ale/swig/ALEHeader;I)I
.end method

.method public static final native ALERequest_calculateRequestUpdate(JLcom/jumio/ale/swig/ALERequest;I)I
.end method

.method public static final native ALERequest_calculateResponseSize(JLcom/jumio/ale/swig/ALERequest;[B)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native ALERequest_finishRequest__SWIG_0(JLcom/jumio/ale/swig/ALERequest;[BI)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native ALERequest_finishRequest__SWIG_1(JLcom/jumio/ale/swig/ALERequest;[B)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native ALERequest_finishResponse(JLcom/jumio/ale/swig/ALERequest;)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native ALERequest_getErrorCode(JLcom/jumio/ale/swig/ALERequest;)I
.end method

.method public static final native ALERequest_initRequest__SWIG_0(JLcom/jumio/ale/swig/ALERequest;JLcom/jumio/ale/swig/ALEHeader;I[BI)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native ALERequest_initRequest__SWIG_1(JLcom/jumio/ale/swig/ALERequest;JLcom/jumio/ale/swig/ALEHeader;I[B)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native ALERequest_initResponse(JLcom/jumio/ale/swig/ALERequest;)V
.end method

.method public static final native ALERequest_isKeyUpdate(JLcom/jumio/ale/swig/ALERequest;)Z
.end method

.method public static final native ALERequest_isVerified(JLcom/jumio/ale/swig/ALERequest;)Z
.end method

.method public static final native ALERequest_request__SWIG_0(JLcom/jumio/ale/swig/ALERequest;JLcom/jumio/ale/swig/ALEHeader;[B[BI)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native ALERequest_request__SWIG_1(JLcom/jumio/ale/swig/ALERequest;JLcom/jumio/ale/swig/ALEHeader;[B[B)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native ALERequest_response__SWIG_0(JLcom/jumio/ale/swig/ALERequest;[B[BI)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native ALERequest_response__SWIG_1(JLcom/jumio/ale/swig/ALERequest;[B[B)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native ALERequest_updateRequest__SWIG_0(JLcom/jumio/ale/swig/ALERequest;[B[BI)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native ALERequest_updateRequest__SWIG_1(JLcom/jumio/ale/swig/ALERequest;[B[B)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native ALERequest_updateResponse__SWIG_0(JLcom/jumio/ale/swig/ALERequest;[B[BI)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native ALERequest_updateResponse__SWIG_1(JLcom/jumio/ale/swig/ALERequest;[B[B)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native ALESettings_change_ownership(Lcom/jumio/ale/swig/ALESettings;JZ)V
.end method

.method public static final native ALESettings_director_connect(Lcom/jumio/ale/swig/ALESettings;JZZ)V
.end method

.method public static final native ALESettings_getDirectory(JLcom/jumio/ale/swig/ALESettings;)Ljava/lang/String;
.end method

.method public static final native ALESettings_getKeyID(JLcom/jumio/ale/swig/ALESettings;)Ljava/lang/String;
.end method

.method public static final native ALESettings_getPublicKey(JLcom/jumio/ale/swig/ALESettings;)Ljava/lang/String;
.end method

.method public static final native ALESettings_setDirectory(JLcom/jumio/ale/swig/ALESettings;Ljava/lang/String;)V
.end method

.method public static final native ALESettings_setKeyID(JLcom/jumio/ale/swig/ALESettings;Ljava/lang/String;)V
.end method

.method public static final native ALESettings_setPublicKey(JLcom/jumio/ale/swig/ALESettings;Ljava/lang/String;)V
.end method

.method public static final native delete_AESGCM(J)V
.end method

.method public static final native delete_ALECore(J)V
.end method

.method public static final native delete_ALEHeader(J)V
.end method

.method public static final native delete_ALESettings(J)V
.end method

.method public static final native new_AESGCM()J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public static final native new_ALECore(JLcom/jumio/ale/swig/ALESettings;)J
.end method

.method public static final native new_ALEHeader()J
.end method

.method public static final native new_ALESettings()J
.end method
