.class public interface abstract Lcom/tencent/ugc/TXUGCAudioRecorder$ITXAudioRecorderListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/ugc/TXUGCAudioRecorder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ITXAudioRecorderListener"
.end annotation


# virtual methods
.method public abstract onRecordComplete(Lcom/tencent/ugc/TXRecordCommon$TXRecordResult;)V
.end method

.method public abstract onRecordProgress(J)V
.end method
