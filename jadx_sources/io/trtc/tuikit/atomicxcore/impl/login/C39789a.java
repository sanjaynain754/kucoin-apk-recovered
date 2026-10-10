package io.trtc.tuikit.atomicxcore.impl.login;

import com.tencent.imsdk.p128v2.V2TIMUserFullInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.login.AllowType;
import io.trtc.tuikit.atomicxcore.api.login.Gender;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.login.a */
/* JADX INFO: loaded from: classes61.dex */
public final class C39789a implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39796h f88416a;

    public C39789a(C39796h c39796h) {
        this.f88416a = c39796h;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        C39510r c39510r = this.f88416a.f88428a;
        String message = "API: getUsersInfo failed code=" + i11 + ", desc=" + str;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(2, message);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        V2TIMUserFullInfo v2TIMUserFullInfo;
        List list = (List) obj;
        if (list == null || (v2TIMUserFullInfo = (V2TIMUserFullInfo) CollectionsKt.firstOrNull(list)) == null) {
            return;
        }
        InterfaceC41669n interfaceC41669n = this.f88416a.f88431d;
        String userID = v2TIMUserFullInfo.getUserID();
        Intrinsics.checkNotNullExpressionValue(userID, "getUserID(...)");
        interfaceC41669n.setValue(new UserProfile(userID, v2TIMUserFullInfo.getNickName(), v2TIMUserFullInfo.getFaceUrl(), v2TIMUserFullInfo.getSelfSignature(), Gender.INSTANCE.parse(v2TIMUserFullInfo.getGender()), Integer.valueOf(v2TIMUserFullInfo.getRole()), Integer.valueOf(v2TIMUserFullInfo.getLevel()), Long.valueOf(v2TIMUserFullInfo.getBirthday()), AllowType.INSTANCE.parse(v2TIMUserFullInfo.getAllowType()), v2TIMUserFullInfo.getCustomInfo()));
    }
}
