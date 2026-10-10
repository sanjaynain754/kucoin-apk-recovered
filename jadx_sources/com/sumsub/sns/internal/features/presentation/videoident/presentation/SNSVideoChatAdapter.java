package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import com.sumsub.sns.internal.features.data.model.common.remote.C29288U1;
import com.sumsub.sns.internal.features.presentation.videoident.chat.SNSVideoChatState;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoChatAdapter;", "", "", "accessToken", "roomName", "", "connectToRoom", "(Ljava/lang/String;Ljava/lang/String;)V", "disconnect", "()V", "makePhoto", "Lcom/sumsub/sns/internal/features/data/model/common/remote/U1;", "message", TUIConstants.TUIChat.METHOD_SEND_MESSAGE, "(Lcom/sumsub/sns/internal/features/data/model/common/remote/U1;)V", "Lcom/sumsub/sns/internal/features/presentation/videoident/chat/SNSVideoChatState;", "getState", "()Lcom/sumsub/sns/internal/features/presentation/videoident/chat/SNSVideoChatState;", "state", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface SNSVideoChatAdapter {
    void connectToRoom(@NotNull String accessToken, @NotNull String roomName);

    void disconnect();

    @Nullable
    SNSVideoChatState getState();

    void makePhoto();

    void sendMessage(@NotNull C29288U1 message);
}
