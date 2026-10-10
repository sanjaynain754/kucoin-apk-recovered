package com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel;

import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AnchorManagerDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorManagerDialog", m90122f = "AnchorManagerDialog.kt", m90123i = {}, m90124l = {TXVodDownloadDataSource.QUALITY_480P}, m90125m = "onConnectUserListChanged", m90126n = {}, m90127s = {})
public final class AnchorManagerDialog$onConnectUserListChanged$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AnchorManagerDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorManagerDialog$onConnectUserListChanged$1(AnchorManagerDialog anchorManagerDialog, Continuation<? super AnchorManagerDialog$onConnectUserListChanged$1> continuation) {
        super(continuation);
        this.this$0 = anchorManagerDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m80423B0(this);
    }
}
