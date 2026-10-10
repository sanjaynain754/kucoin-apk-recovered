package io.trtc.tuikit.atomicxcore.impl.search;

import com.tencent.imsdk.p128v2.V2TIMGroupMemberFullInfo;
import com.tencent.imsdk.p128v2.V2TIMGroupMemberSearchResult;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.contact.GroupMember;
import io.trtc.tuikit.atomicxcore.api.contact.GroupMemberRole;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.SafeContinuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.search.g */
/* JADX INFO: loaded from: classes61.dex */
public final class C39972g implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39981p f88865a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SafeContinuation f88866b;

    public C39972g(C39981p c39981p, SafeContinuation safeContinuation) {
        this.f88865a = c39981p;
        this.f88866b = safeContinuation;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        SafeContinuation safeContinuation = this.f88866b;
        Result.Companion companion = Result.INSTANCE;
        if (str == null) {
            str = "Group member search failed";
        }
        safeContinuation.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new C39497e(i11, str))));
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        Unit unit;
        V2TIMGroupMemberSearchResult v2TIMGroupMemberSearchResult = (V2TIMGroupMemberSearchResult) obj;
        if (v2TIMGroupMemberSearchResult != null) {
            C39981p c39981p = this.f88865a;
            SafeContinuation safeContinuation = this.f88866b;
            boolean z11 = c39981p.f88897f.length() == 0;
            String nextCursor = v2TIMGroupMemberSearchResult.getNextCursor();
            if (nextCursor == null) {
                nextCursor = "";
            } else {
                Intrinsics.checkNotNull(nextCursor);
            }
            c39981p.f88897f = nextCursor;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, List<V2TIMGroupMemberFullInfo>> memberList = v2TIMGroupMemberSearchResult.getMemberList();
            if (memberList != null) {
                Intrinsics.checkNotNull(memberList);
                for (Map.Entry<String, List<V2TIMGroupMemberFullInfo>> entry : memberList.entrySet()) {
                    String key = entry.getKey();
                    List<V2TIMGroupMemberFullInfo> value = entry.getValue();
                    Intrinsics.checkNotNull(key);
                    Intrinsics.checkNotNull(value);
                    ArrayList arrayList = new ArrayList();
                    for (V2TIMGroupMemberFullInfo v2Member : value) {
                        Intrinsics.checkNotNull(v2Member);
                        Intrinsics.checkNotNullParameter(v2Member, "v2Member");
                        String userID = v2Member.getUserID();
                        Intrinsics.checkNotNullExpressionValue(userID, "getUserID(...)");
                        GroupMember groupMember = new GroupMember(userID, v2Member.getNickName(), v2Member.getFaceUrl(), v2Member.getNameCard(), null, 0L, 48, null);
                        groupMember.setRole(GroupMemberRole.INSTANCE.parse(v2Member.getRole()));
                        groupMember.setMuteUntil(v2Member.getMuteUntil());
                        arrayList.add(groupMember);
                    }
                    linkedHashMap.put(key, arrayList);
                }
            }
            if (z11) {
                c39981p.f88908q.setValue(linkedHashMap);
            } else {
                Map mutableMap = MapsKt.toMutableMap((Map) c39981p.f88908q.getValue());
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    String str = (String) entry2.getKey();
                    List list = (List) entry2.getValue();
                    List listEmptyList = (List) mutableMap.get(str);
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    mutableMap.put(str, CollectionsKt.plus((Collection) listEmptyList, (Iterable) list));
                }
                c39981p.f88908q.setValue(mutableMap);
            }
            c39981p.f88909r.setValue(Integer.valueOf(v2TIMGroupMemberSearchResult.getTotalCount()));
            c39981p.f88910s.setValue(Boolean.valueOf(!v2TIMGroupMemberSearchResult.getIsFinished()));
            Result.Companion companion = Result.INSTANCE;
            unit = Unit.INSTANCE;
            safeContinuation.resumeWith(Result.m103844constructorimpl(unit));
        } else {
            unit = null;
        }
        if (unit == null) {
            SafeContinuation safeContinuation2 = this.f88866b;
            Result.Companion companion2 = Result.INSTANCE;
            safeContinuation2.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new C39497e(-1, "Internal error"))));
        }
    }
}
