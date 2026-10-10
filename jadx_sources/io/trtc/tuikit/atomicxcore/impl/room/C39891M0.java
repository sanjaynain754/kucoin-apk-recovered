package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager;
import io.trtc.tuikit.atomicxcore.api.ListResultCompletionHandler;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.M0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39891M0 implements TUIConferenceInvitationManager.GetInvitationListCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ListResultCompletionHandler f88661a;

    public C39891M0(ListResultCompletionHandler listResultCompletionHandler) {
        this.f88661a = listResultCompletionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager.GetInvitationListCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        ListResultCompletionHandler listResultCompletionHandler = this.f88661a;
        if (listResultCompletionHandler != null) {
            listResultCompletionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager.GetInvitationListCallback
    public final void onSuccess(TUIConferenceInvitationManager.InvitationListResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        List<TUIConferenceInvitationManager.Invitation> invitationList = result.invitationList;
        Intrinsics.checkNotNullExpressionValue(invitationList, "invitationList");
        ArrayList arrayList = new ArrayList();
        for (TUIConferenceInvitationManager.Invitation invitation : invitationList) {
            Intrinsics.checkNotNull(invitation);
            arrayList.add(AbstractC39939m0.m88363a(invitation));
        }
        ListResultCompletionHandler listResultCompletionHandler = this.f88661a;
        if (listResultCompletionHandler != null) {
            String cursor = result.cursor;
            Intrinsics.checkNotNullExpressionValue(cursor, "cursor");
            listResultCompletionHandler.onSuccess(arrayList, cursor);
        }
    }
}
