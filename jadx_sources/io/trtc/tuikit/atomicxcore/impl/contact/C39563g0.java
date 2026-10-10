package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMGroupMemberFullInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41716o;
import p852kotlin.Result;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.g0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39563g0 implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39531G0 f87862a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C41716o f87863b;

    public C39563g0(C39531G0 c39531g0, C41716o c41716o) {
        this.f87862a = c39531g0;
        this.f87863b = c41716o;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        C41716o c41716o = this.f87863b;
        Result.Companion companion = Result.INSTANCE;
        AbstractC39552b.m88278a(new C39497e(Integer.valueOf(i11), str), c41716o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        ?? EmptyList;
        List list = (List) obj;
        if (list != null) {
            C39531G0 c39531g0 = this.f87862a;
            EmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                EmptyList.add(C39531G0.m88255a(c39531g0, (V2TIMGroupMemberFullInfo) it.next()));
            }
        } else {
            EmptyList = CollectionsKt.emptyList();
        }
        this.f87862a.f87778t.setValue(EmptyList);
        C41716o c41716o = this.f87863b;
        Result.Companion companion = Result.INSTANCE;
        c41716o.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
    }
}
