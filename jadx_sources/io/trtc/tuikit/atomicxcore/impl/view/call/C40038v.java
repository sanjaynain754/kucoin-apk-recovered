package io.trtc.tuikit.atomicxcore.impl.view.call;

import android.widget.TextView;
import com.tencent.imsdk.p128v2.V2TIMFriendInfo;
import com.tencent.imsdk.p128v2.V2TIMFriendInfoResult;
import com.tencent.imsdk.p128v2.V2TIMUserFullInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.v */
/* JADX INFO: loaded from: classes61.dex */
public final class C40038v implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.ObjectRef f89064a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40040x f89065b;

    public C40038v(Ref.ObjectRef objectRef, C40040x c40040x) {
        this.f89064a = objectRef;
        this.f89065b = c40040x;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        C39510r c39510r = this.f89065b.f89068a;
        String message = "getFriendsInfo fail, code=" + i11 + " message=" + str;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(2, message);
        TextView textView = this.f89065b.f89073f;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textUserName");
            textView = null;
        }
        textView.setText(this.f89065b.f89079l.getId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        String str;
        String friendRemark;
        V2TIMUserFullInfo userProfile;
        String nickName;
        List list = (List) obj;
        if (list != null && list.size() > 0) {
            V2TIMFriendInfo friendInfo = ((V2TIMFriendInfoResult) list.get(0)).getFriendInfo();
            TextView textView = null;
            if (friendInfo == null || (userProfile = friendInfo.getUserProfile()) == null) {
                str = null;
            } else {
                nickName = userProfile.getNickName();
            }
            if (friendInfo != null) {
                str = nickName;
                friendRemark = friendInfo.getFriendRemark();
            } else {
                str = nickName;
                friendRemark = null;
            }
            Ref.ObjectRef objectRef = this.f89064a;
            T t11 = str;
            if (friendRemark != null && friendRemark.length() != 0) {
                t11 = str;
                t11 = friendRemark;
            }
            t11 = str;
            objectRef.element = t11;
            CharSequence charSequence = (CharSequence) this.f89064a.element;
            if (charSequence == null || charSequence.length() == 0) {
                TextView textView2 = this.f89065b.f89073f;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textUserName");
                } else {
                    textView = textView2;
                }
                textView.setText(this.f89065b.f89079l.getId());
                return;
            }
            TextView textView3 = this.f89065b.f89073f;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textUserName");
            } else {
                textView = textView3;
            }
            textView.setText((CharSequence) this.f89064a.element);
        }
    }
}
