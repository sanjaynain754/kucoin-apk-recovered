package a20;

import android.app.Activity;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.C5258a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.host.HostManager;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.ShareParam;
import com.kubi.share.api.entity.ShareReferralEntity;
import com.kubi.share.lib.shareui.ShareDispatcher;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27100x0;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.text.StringsKt;
import w10.C45696a;

/* JADX INFO: renamed from: a20.b */
/* JADX INFO: compiled from: ShareService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0016J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eH\u0016¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/share/lib/service/ShareService;", "Lcom/kubi/share/api/IShareService;", "<init>", "()V", "getShareReferralCode", "", "shareQRCodeUrl", "utmSource", "rcode", FirebaseAnalytics.Event.SHARE, "", "param", "Lcom/kubi/share/api/ShareParam;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C0025b implements IShareService {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object, java.lang.String] */
    /* JADX INFO: renamed from: h */
    public static final Unit m36h(Ref.ObjectRef objectRef, C0025b c0025b, String str, String str2) {
        String strDecode = Uri.decode((String) objectRef.element);
        Uri.Builder builderBuildUpon = Uri.parse((String) objectRef.element).buildUpon();
        String strM59641b = c0025b.m59641b(str);
        Intrinsics.checkNotNull(strDecode);
        if (!StringsKt.contains((CharSequence) strDecode, (CharSequence) "rcode", true) && strM59641b.length() > 0) {
            builderBuildUpon.appendQueryParameter("rcode", strM59641b);
        }
        if (!StringsKt.contains((CharSequence) strDecode, (CharSequence) "utm_source", true) && str2.length() > 0) {
            builderBuildUpon.appendQueryParameter("utm_source", str2);
        }
        ?? string = builderBuildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        objectRef.element = string;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.share.api.IShareService
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo37a(@NotNull final String utmSource, @Nullable final String str) {
        T t11;
        String referralUrl;
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ShareReferralEntity shareReferralEntityM100871a = C45696a.m100871a();
        if (shareReferralEntityM100871a == null || (referralUrl = shareReferralEntityM100871a.getReferralUrl()) == null) {
            t11 = referralUrl;
            t11 = HostManager.a.e() + "/ucenter/signup?";
        }
        t11 = referralUrl;
        objectRef.element = t11;
        C27100x0.m66924e(new Function0() { // from class: a20.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C0025b.m36h(objectRef, this, str, utmSource);
            }
        });
        return HostManager.a.r((String) objectRef.element);
    }

    @Override // com.kubi.share.api.IShareService
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo38d(@NotNull String utmSource) {
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        return mo37a(utmSource, null);
    }

    @Override // com.kubi.share.api.IShareService
    /* JADX INFO: renamed from: f */
    public void mo40f(@NotNull ShareParam param, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(param, "param");
        Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h instanceof FragmentActivity) {
            ShareDispatcher.f49422a.m59808d((FragmentActivity) activityM6125h, param, function1);
        } else if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    @Override // com.kubi.share.api.IShareService
    @NotNull
    /* JADX INFO: renamed from: e */
    public String mo39e() {
        String referralCode;
        ShareReferralEntity shareReferralEntityM100871a = C45696a.m100871a();
        if (shareReferralEntityM100871a != null && (referralCode = shareReferralEntityM100871a.getReferralCode()) != null) {
            return referralCode;
        }
        return UserInfo.c().getReferralCode();
    }
}
