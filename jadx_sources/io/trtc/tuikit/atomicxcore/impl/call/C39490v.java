package io.trtc.tuikit.atomicxcore.impl.call;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import io.trtc.tuikit.atomicxcore.api.call.CallParticipantInfo;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.v */
/* JADX INFO: loaded from: classes61.dex */
public final class C39490v implements TUICommonDefine.ValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39491w f87665a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CallParticipantInfo f87666b;

    public C39490v(C39491w c39491w, CallParticipantInfo callParticipantInfo) {
        this.f87665a = c39491w;
        this.f87666b = callParticipantInfo;
    }

    @Override // com.tencent.cloud.tuikit.engine.common.TUICommonDefine.ValueCallback
    public final void onError(int i11, String str) {
        Object value;
        String message = "getFriendsInfo fail, errCode: " + i11 + " errMsg: " + str;
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC39492x.m88243a(2, message);
        InterfaceC41669n interfaceC41669n = this.f87665a.f87675h;
        CallParticipantInfo callParticipantInfo = this.f87666b;
        do {
            value = interfaceC41669n.getValue();
        } while (!interfaceC41669n.compareAndSet(value, (LinkedHashSet) CollectionsKt.toCollection(SetsKt.plus((LinkedHashSet) value, callParticipantInfo), new LinkedHashSet())));
    }

    @Override // com.tencent.cloud.tuikit.engine.common.TUICommonDefine.ValueCallback
    public final void onSuccess(Object obj) {
        Object value;
        List data = (List) obj;
        Intrinsics.checkNotNullParameter(data, "data");
        CallParticipantInfo callParticipantInfo = (CallParticipantInfo) data.get(0);
        Iterable iterable = (Iterable) this.f87665a.f87675h.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((CallParticipantInfo) it.next()).getId(), callParticipantInfo.getId())) {
                    return;
                }
            }
        }
        String id2 = callParticipantInfo.getId();
        if (callParticipantInfo.getRemark().length() > 0) {
            id2 = callParticipantInfo.getRemark();
        } else if (callParticipantInfo.getName().length() > 0) {
            id2 = callParticipantInfo.getName();
        }
        this.f87666b.setName(id2);
        this.f87666b.setAvatarUrl(callParticipantInfo.getAvatarUrl());
        InterfaceC41669n interfaceC41669n = this.f87665a.f87675h;
        CallParticipantInfo callParticipantInfo2 = this.f87666b;
        do {
            value = interfaceC41669n.getValue();
        } while (!interfaceC41669n.compareAndSet(value, (LinkedHashSet) CollectionsKt.toCollection(SetsKt.plus((LinkedHashSet) value, callParticipantInfo2), new LinkedHashSet())));
    }
}
