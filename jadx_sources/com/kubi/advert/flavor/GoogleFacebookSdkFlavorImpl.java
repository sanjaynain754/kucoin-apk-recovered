package com.kubi.advert.flavor;

import android.app.Application;
import android.os.Bundle;
import androidx.media3.common.MimeTypes;
import com.facebook.C5501a;
import com.facebook.LoggingBehavior;
import com.kubi.advert.AdCoroutineScope;
import com.kubi.advert.exception.AdvertException;
import com.kubi.user.config.UserInfo;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p569qq.C43840a;
import p569qq.C43846g;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: GoogleFacebookSdkFlavorImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J$\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl;", "Lcom/kubi/advert/flavor/IFacebookSdkFlavor;", "<init>", "()V", "initialize", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "fbEvent", "eventName", "", ReportDataTable.COLUMN_PARAMS, "", "buildCommParams", "Landroid/os/Bundle;", "Companion", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGoogleFacebookSdkFlavorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleFacebookSdkFlavorImpl.kt\ncom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl\n+ 2 AdvertEx.kt\ncom/kubi/advert/AdvertExKt\n+ 3 AdvertIssue.kt\ncom/kubi/advert/exception/AdvertIssueKt\n+ 4 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,85:1\n40#2,3:86\n45#3,4:89\n45#3,4:97\n47#4,4:93\n*S KotlinDebug\n*F\n+ 1 GoogleFacebookSdkFlavorImpl.kt\ncom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl\n*L\n37#1:86,3\n55#1:89,4\n51#1:97,4\n60#1:93,4\n*E\n"})
public final class GoogleFacebookSdkFlavorImpl implements IFacebookSdkFlavor {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f15153a = new Companion(null);

    /* JADX INFO: compiled from: GoogleFacebookSdkFlavorImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl$Companion;", "", "<init>", "()V", "TAG", "", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m14774f() {
        try {
            C5501a.m7784U(true);
            C5501a.m7797k();
            C5501a.m7796j(LoggingBehavior.APP_EVENTS);
            C5501a.m7785V(true);
            C5501a.m7783T(true);
        } catch (Throwable th2) {
            if (C42899b.m94075e(th2)) {
                return;
            }
            C43846g.m96568c(new AdvertException(th2, "GoogleFacebookSdkFlavorImpl", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.advert.flavor.GoogleFacebookSdkFlavorImpl$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    /* JADX INFO: loaded from: classes62.dex */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 GoogleFacebookSdkFlavorImpl.kt\ncom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl\n+ 3 AdvertIssue.kt\ncom/kubi/advert/exception/AdvertIssueKt\n*L\n1#1,49:1\n61#2:50\n62#2:55\n45#3,4:51\n*S KotlinDebug\n*F\n+ 1 GoogleFacebookSdkFlavorImpl.kt\ncom/kubi/advert/flavor/GoogleFacebookSdkFlavorImpl\n*L\n61#1:51,4\n*E\n"})
    public static final class C9351a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public C9351a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            if (!C42899b.m94075e(exception)) {
                C43846g.m96568c(new AdvertException(exception, "GoogleFacebookSdkFlavorImpl", false, null, 8, null), null, 2, null);
            }
        }
    }

    @Override // com.kubi.advert.flavor.IFacebookSdkFlavor
    /* JADX INFO: renamed from: a */
    public void mo14775a(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        try {
            C43840a.m96550d("FacebookSdk start initialize, google.", "GoogleFacebookSdkFlavorImpl");
            C44128b.m97266j("GoogleFacebookSdkFlavorImpl", "FacebookSdk start initialize, google.");
            C5501a.m7786W(C45590s.f102687a.m100666Q());
            C5501a.m7775L(application, new C5501a.b() { // from class: com.kubi.advert.flavor.a
                @Override // com.facebook.C5501a.b
                public final void onInitialized() {
                    GoogleFacebookSdkFlavorImpl.m14774f();
                }
            });
        } catch (Throwable th2) {
            if (C42899b.m94075e(th2)) {
                return;
            }
            C43846g.m96568c(new AdvertException(th2, "GoogleFacebookSdkFlavorImpl", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final Bundle m14776d() {
        Bundle bundle = new Bundle();
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        if (strH.length() > 0) {
            bundle.putString("fb_content_id", strH);
        }
        bundle.putString("fb_description", C45590s.f102687a.m100665P());
        return bundle;
    }

    @Override // com.kubi.advert.flavor.IFacebookSdkFlavor
    /* JADX INFO: renamed from: e */
    public void mo14777e(@NotNull String eventName, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(params, "params");
        C41696j.m91104d(new AdCoroutineScope("GoogleFacebookSdkFlavorImpl"), C42911a.m94120b().plus(new C9351a(CoroutineExceptionHandler.INSTANCE)), null, new GoogleFacebookSdkFlavorImpl$fbEvent$2(this, eventName, params, null), 2, null);
    }
}
