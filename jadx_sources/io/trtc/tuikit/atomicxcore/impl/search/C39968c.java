package io.trtc.tuikit.atomicxcore.impl.search;

import com.tencent.imsdk.p128v2.V2TIMConversation;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p852kotlin.Result;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.SafeContinuation;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.search.c */
/* JADX INFO: loaded from: classes61.dex */
public final class C39968c implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SafeContinuation f88849a;

    public C39968c(SafeContinuation safeContinuation) {
        this.f88849a = safeContinuation;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        SafeContinuation safeContinuation = this.f88849a;
        Result.Companion companion = Result.INSTANCE;
        safeContinuation.resumeWith(Result.m103844constructorimpl(MapsKt.emptyMap()));
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        Map mapEmptyMap;
        List list = (List) obj;
        if (list != null) {
            mapEmptyMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (Object obj2 : list) {
                String conversationID = ((V2TIMConversation) obj2).getConversationID();
                if (conversationID == null) {
                    conversationID = "";
                } else {
                    Intrinsics.checkNotNull(conversationID);
                }
                mapEmptyMap.put(conversationID, obj2);
            }
        } else {
            mapEmptyMap = MapsKt.emptyMap();
        }
        this.f88849a.resumeWith(Result.m103844constructorimpl(mapEmptyMap));
    }
}
