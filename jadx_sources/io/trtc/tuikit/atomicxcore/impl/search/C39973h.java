package io.trtc.tuikit.atomicxcore.impl.search;

import com.tencent.imsdk.p128v2.V2TIMGroupMemberFullInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.contact.GroupMember;
import io.trtc.tuikit.atomicxcore.api.contact.GroupMemberRole;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.SafeContinuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.search.h */
/* JADX INFO: loaded from: classes61.dex */
public final class C39973h implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39981p f88867a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SafeContinuation f88868b;

    public C39973h(C39981p c39981p, SafeContinuation safeContinuation) {
        this.f88867a = c39981p;
        this.f88868b = safeContinuation;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        SafeContinuation safeContinuation = this.f88868b;
        Result.Companion companion = Result.INSTANCE;
        if (str == null) {
            str = "Group member search failed";
        }
        safeContinuation.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new C39497e(i11, str))));
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        HashMap map = (HashMap) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = 0;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                List<V2TIMGroupMemberFullInfo> list = (List) entry.getValue();
                ArrayList arrayList = new ArrayList();
                for (V2TIMGroupMemberFullInfo v2Member : list) {
                    Intrinsics.checkNotNullParameter(v2Member, "v2Member");
                    String userID = v2Member.getUserID();
                    Intrinsics.checkNotNullExpressionValue(userID, "getUserID(...)");
                    GroupMember groupMember = new GroupMember(userID, v2Member.getNickName(), v2Member.getFaceUrl(), v2Member.getNameCard(), null, 0L, 48, null);
                    groupMember.setRole(GroupMemberRole.INSTANCE.parse(v2Member.getRole()));
                    groupMember.setMuteUntil(v2Member.getMuteUntil());
                    arrayList.add(groupMember);
                }
                linkedHashMap.put(str, arrayList);
                size += arrayList.size();
            }
        }
        this.f88867a.f88908q.setValue(linkedHashMap);
        this.f88867a.f88909r.setValue(Integer.valueOf(size));
        this.f88867a.f88910s.setValue(Boolean.FALSE);
        SafeContinuation safeContinuation = this.f88868b;
        Result.Companion companion = Result.INSTANCE;
        safeContinuation.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
    }
}
