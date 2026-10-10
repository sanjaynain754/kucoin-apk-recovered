package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import com.tencent.imsdk.p128v2.V2TIMGroupInfo;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Result;
import p852kotlin.Unit;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.F0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39529F0 implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f87747a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39531G0 f87748b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ V2TIMGroupInfo f87749c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f87750d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f87751e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C41716o f87752f;

    public C39529F0(String str, C39531G0 c39531g0, V2TIMGroupInfo v2TIMGroupInfo, String str2, String str3, C41716o c41716o) {
        this.f87747a = str;
        this.f87748b = c39531g0;
        this.f87749c = v2TIMGroupInfo;
        this.f87750d = str2;
        this.f87751e = str3;
        this.f87752f = c41716o;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String str) {
        C41716o c41716o = this.f87752f;
        Result.Companion companion = Result.INSTANCE;
        AbstractC39552b.m88278a(new C39497e(Integer.valueOf(i11), str), c41716o);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        if (this.f87747a != null) {
            InterfaceC41669n interfaceC41669n = this.f87748b.f87762d;
            String groupName = this.f87749c.getGroupName();
            if (groupName == null) {
                groupName = this.f87749c.getGroupID();
            }
            if (groupName == null) {
                groupName = "";
            }
            interfaceC41669n.setValue(groupName);
            V2TIMGroupInfo v2TIMGroupInfo = this.f87748b.f87781w;
            if (v2TIMGroupInfo != null) {
                v2TIMGroupInfo.setGroupName(this.f87749c.getGroupName());
            }
        }
        if (this.f87750d != null) {
            InterfaceC41669n interfaceC41669n2 = this.f87748b.f87764f;
            String notification = this.f87749c.getNotification();
            if (notification == null) {
                notification = "";
            }
            interfaceC41669n2.setValue(notification);
            V2TIMGroupInfo v2TIMGroupInfo2 = this.f87748b.f87781w;
            if (v2TIMGroupInfo2 != null) {
                v2TIMGroupInfo2.setNotification(this.f87749c.getNotification());
            }
        }
        if (this.f87751e != null) {
            InterfaceC41669n interfaceC41669n3 = this.f87748b.f87763e;
            String faceUrl = this.f87749c.getFaceUrl();
            interfaceC41669n3.setValue(faceUrl != null ? faceUrl : "");
            V2TIMGroupInfo v2TIMGroupInfo3 = this.f87748b.f87781w;
            if (v2TIMGroupInfo3 != null) {
                v2TIMGroupInfo3.setFaceUrl(this.f87749c.getFaceUrl());
            }
        }
        C41716o c41716o = this.f87752f;
        Result.Companion companion = Result.INSTANCE;
        c41716o.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
    }
}
