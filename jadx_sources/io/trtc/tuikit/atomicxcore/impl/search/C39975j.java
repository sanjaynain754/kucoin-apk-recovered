package io.trtc.tuikit.atomicxcore.impl.search;

import com.tencent.imsdk.p128v2.V2TIMGroupInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.search.GroupSearchInfo;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.SafeContinuation;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.search.j */
/* JADX INFO: loaded from: classes61.dex */
public final class C39975j implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39981p f88871a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SafeContinuation f88872b;

    public C39975j(C39981p c39981p, SafeContinuation safeContinuation) {
        this.f88871a = c39981p;
        this.f88872b = safeContinuation;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        SafeContinuation safeContinuation = this.f88872b;
        Result.Companion companion = Result.INSTANCE;
        if (str == null) {
            str = "Group search failed";
        }
        safeContinuation.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new C39497e(i11, str))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        ?? EmptyList;
        List list = (List) obj;
        if (list != null) {
            C39981p c39981p = this.f88871a;
            EmptyList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GroupSearchInfo groupSearchInfoM88371a = C39981p.m88371a(c39981p, (V2TIMGroupInfo) it.next());
                if (groupSearchInfoM88371a != null) {
                    EmptyList.add(groupSearchInfoM88371a);
                }
            }
        } else {
            EmptyList = CollectionsKt.emptyList();
        }
        this.f88871a.f88905n.setValue(EmptyList);
        this.f88871a.f88906o.setValue(Integer.valueOf(EmptyList.size()));
        this.f88871a.f88907p.setValue(Boolean.FALSE);
        SafeContinuation safeContinuation = this.f88872b;
        Result.Companion companion = Result.INSTANCE;
        safeContinuation.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
    }
}
