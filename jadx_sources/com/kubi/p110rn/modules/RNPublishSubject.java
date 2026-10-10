package com.kubi.p110rn.modules;

import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RNPublishSubject.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\tR\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000b0\u000b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000e0\u000e0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u007f\u0010\u0010\u001ap\u0012l\u0012j\u0012\u0004\u0012\u00020\u0012\u0012(\u0012&\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0013j\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u0014 \u0006*4\u0012\u0004\u0012\u00020\u0012\u0012(\u0012&\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0013j\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u0014\u0018\u00010\u00110\u00110\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/rn/modules/RNPublishSubject;", "", "<init>", "()V", RNH5InterActionHelperKt.EVENT_NAME_FROM_H5, "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "getOnInterCommunicateFromH5$annotations", "getOnInterCommunicateFromH5", "()Lio/reactivex/subjects/PublishSubject;", "nativePageShowStatus", "Lcom/kubi/rn/modules/RNPageShowEvent;", "getNativePageShowStatus", "nativePageHideStatus", "Lcom/kubi/rn/modules/RNPageHideEvent;", "getNativePageHideStatus", "nativeNotifyRn", "Lkotlin/Pair;", "", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getNativeNotifyRn", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RNPublishSubject {

    @NotNull
    public static final RNPublishSubject INSTANCE = new RNPublishSubject();

    @NotNull
    private static final PublishSubject<Pair<String, HashMap<String, Object>>> nativeNotifyRn;

    @NotNull
    private static final PublishSubject<RNPageHideEvent> nativePageHideStatus;

    @NotNull
    private static final PublishSubject<RNPageShowEvent> nativePageShowStatus;

    @NotNull
    private static final PublishSubject<Object> onInterCommunicateFromH5;

    static {
        PublishSubject<Object> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create(...)");
        onInterCommunicateFromH5 = publishSubjectCreate;
        PublishSubject<RNPageShowEvent> publishSubjectCreate2 = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate2, "create(...)");
        nativePageShowStatus = publishSubjectCreate2;
        PublishSubject<RNPageHideEvent> publishSubjectCreate3 = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate3, "create(...)");
        nativePageHideStatus = publishSubjectCreate3;
        PublishSubject<Pair<String, HashMap<String, Object>>> publishSubjectCreate4 = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate4, "create(...)");
        nativeNotifyRn = publishSubjectCreate4;
    }

    @NotNull
    public final PublishSubject<Pair<String, HashMap<String, Object>>> getNativeNotifyRn() {
        return nativeNotifyRn;
    }

    @NotNull
    public final PublishSubject<RNPageHideEvent> getNativePageHideStatus() {
        return nativePageHideStatus;
    }

    @NotNull
    public final PublishSubject<RNPageShowEvent> getNativePageShowStatus() {
        return nativePageShowStatus;
    }

    @NotNull
    public final PublishSubject<Object> getOnInterCommunicateFromH5() {
        return onInterCommunicateFromH5;
    }

    private RNPublishSubject() {
    }

    @Deprecated(message = "由于双端实现不一致，确认过web端并未使用该api，因此该方法废弃，禁止使用，等后续重构新增方法实现该需求")
    public static /* synthetic */ void getOnInterCommunicateFromH5$annotations() {
    }
}
