package io.trtc.tuikit.atomicxcore.impl.search;

import com.tencent.imsdk.p128v2.V2TIMGroupInfo;
import com.tencent.imsdk.p128v2.V2TIMGroupSearchResult;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.search.GroupSearchInfo;
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

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.search.i */
/* JADX INFO: loaded from: classes61.dex */
public final class C39974i implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39981p f88869a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SafeContinuation f88870b;

    public C39974i(C39981p c39981p, SafeContinuation safeContinuation) {
        this.f88869a = c39981p;
        this.f88870b = safeContinuation;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        SafeContinuation safeContinuation = this.f88870b;
        Result.Companion companion = Result.INSTANCE;
        if (str == null) {
            str = "Group search failed";
        }
        safeContinuation.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new C39497e(i11, str))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        Unit unit;
        ?? EmptyList;
        V2TIMGroupSearchResult v2TIMGroupSearchResult = (V2TIMGroupSearchResult) obj;
        if (v2TIMGroupSearchResult != null) {
            C39981p c39981p = this.f88869a;
            SafeContinuation safeContinuation = this.f88870b;
            boolean z11 = c39981p.f88896e.length() == 0;
            String nextCursor = v2TIMGroupSearchResult.getNextCursor();
            if (nextCursor == null) {
                nextCursor = "";
            } else {
                Intrinsics.checkNotNull(nextCursor);
            }
            c39981p.f88896e = nextCursor;
            List<V2TIMGroupInfo> groupList = v2TIMGroupSearchResult.getGroupList();
            if (groupList != null) {
                Intrinsics.checkNotNull(groupList);
                EmptyList = new ArrayList();
                for (V2TIMGroupInfo v2TIMGroupInfo : groupList) {
                    Intrinsics.checkNotNull(v2TIMGroupInfo);
                    GroupSearchInfo groupSearchInfoM88371a = C39981p.m88371a(c39981p, v2TIMGroupInfo);
                    if (groupSearchInfoM88371a != null) {
                        EmptyList.add(groupSearchInfoM88371a);
                    }
                }
            } else {
                EmptyList = CollectionsKt.emptyList();
            }
            if (z11) {
                c39981p.f88905n.setValue(EmptyList);
            } else {
                InterfaceC41669n interfaceC41669n = c39981p.f88905n;
                interfaceC41669n.setValue(CollectionsKt.plus((Collection) interfaceC41669n.getValue(), (Iterable) EmptyList));
            }
            c39981p.f88906o.setValue(Integer.valueOf(v2TIMGroupSearchResult.getTotalCount()));
            c39981p.f88907p.setValue(Boolean.valueOf(!v2TIMGroupSearchResult.getIsFinished()));
            Result.Companion companion = Result.INSTANCE;
            unit = Unit.INSTANCE;
            safeContinuation.resumeWith(Result.m103844constructorimpl(unit));
        } else {
            unit = null;
        }
        if (unit == null) {
            SafeContinuation safeContinuation2 = this.f88870b;
            Result.Companion companion2 = Result.INSTANCE;
            safeContinuation2.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new C39497e(-1, "Internal error"))));
        }
    }
}
