package com.kubi.share.api;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.router.core.Router;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: IShareService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H&J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010\rH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/share/api/IShareService;", "", "getShareReferralCode", "", "overrideRcode", "shareQRCodeUrl", "utmSource", "rcode", FirebaseAnalytics.Event.SHARE, "", "param", "Lcom/kubi/share/api/ShareParam;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "Companion", "ShareApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIShareService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IShareService.kt\ncom/kubi/share/api/IShareService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public interface IShareService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f49268a = Companion.f49269a;

    /* JADX INFO: compiled from: IShareService.kt */
    /* JADX INFO: loaded from: classes46.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/share/api/IShareService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/share/api/IShareService;", "ShareApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f49269a = new Companion();

        @NotNull
        public final IShareService get() {
            return (IShareService) Router.f46192a.m56192n(IShareService.class);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    String mo38d(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: e */
    String mo39e();

    /* JADX INFO: renamed from: f */
    void mo40f(@NotNull ShareParam shareParam, @Nullable Function1<? super Boolean, Unit> function1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    static /* synthetic */ void m59640c(IShareService iShareService, ShareParam shareParam, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: share");
        }
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        iShareService.mo40f(shareParam, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    default String mo37a(@NotNull String utmSource, @Nullable String str) {
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        return mo38d(utmSource);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    default String m59641b(@Nullable String str) {
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return mo39e();
    }
}
