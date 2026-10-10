package io.trtc.tuikit.atomicxcore.impl.search;

import com.tencent.imsdk.p128v2.V2TIMUserInfo;
import com.tencent.imsdk.p128v2.V2TIMUserSearchResult;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.SafeContinuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.search.o */
/* JADX INFO: loaded from: classes61.dex */
public final class C39980o implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39981p f88890a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SafeContinuation f88891b;

    public C39980o(C39981p c39981p, SafeContinuation safeContinuation) {
        this.f88890a = c39981p;
        this.f88891b = safeContinuation;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        SafeContinuation safeContinuation = this.f88891b;
        Result.Companion companion = Result.INSTANCE;
        if (str == null) {
            str = "User search failed";
        }
        safeContinuation.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new C39497e(i11, str))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        Unit unit;
        ?? EmptyList;
        V2TIMUserSearchResult v2TIMUserSearchResult = (V2TIMUserSearchResult) obj;
        if (v2TIMUserSearchResult != null) {
            C39981p c39981p = this.f88890a;
            SafeContinuation safeContinuation = this.f88891b;
            boolean z11 = c39981p.f88895d.length() == 0;
            String nextCursor = v2TIMUserSearchResult.getNextCursor();
            if (nextCursor == null) {
                nextCursor = "";
            } else {
                Intrinsics.checkNotNull(nextCursor);
            }
            c39981p.f88895d = nextCursor;
            List<V2TIMUserInfo> userList = v2TIMUserSearchResult.getUserList();
            if (userList != null) {
                Intrinsics.checkNotNull(userList);
                EmptyList = new ArrayList();
                for (V2TIMUserInfo v2UserInfo : userList) {
                    Intrinsics.checkNotNull(v2UserInfo);
                    Intrinsics.checkNotNullParameter(v2UserInfo, "v2UserInfo");
                    String userID = v2UserInfo.getUserID();
                    UserProfile userProfile = new UserProfile(userID == null ? "" : userID, v2UserInfo.getNickName(), v2UserInfo.getFaceUrl(), null, null, null, null, null, null, null, 1016, null);
                    userProfile.setBirthday(Long.valueOf(v2UserInfo.getBirthday()));
                    EmptyList.add(userProfile);
                }
            } else {
                EmptyList = CollectionsKt.emptyList();
            }
            if (z11) {
                c39981p.f88899h.setValue(EmptyList);
            } else {
                InterfaceC41669n interfaceC41669n = c39981p.f88899h;
                interfaceC41669n.setValue(CollectionsKt.plus((Collection) interfaceC41669n.getValue(), (Iterable) EmptyList));
            }
            c39981p.f88900i.setValue(Integer.valueOf(v2TIMUserSearchResult.getTotalCount()));
            c39981p.f88901j.setValue(Boolean.valueOf(!v2TIMUserSearchResult.getIsFinished()));
            Result.Companion companion = Result.INSTANCE;
            unit = Unit.INSTANCE;
            safeContinuation.resumeWith(Result.m103844constructorimpl(unit));
        } else {
            unit = null;
        }
        if (unit == null) {
            SafeContinuation safeContinuation2 = this.f88891b;
            Result.Companion companion2 = Result.INSTANCE;
            safeContinuation2.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new C39497e(-1, "Internal error"))));
        }
    }
}
