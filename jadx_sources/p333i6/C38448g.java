package p333i6;

import android.os.RemoteException;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.AccessToken;
import com.facebook.C5501a;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: i6.g */
/* JADX INFO: compiled from: InstallReferrerUtil.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003R\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m90084d2 = {"Li6/g;", "", "<init>", "()V", "Li6/g$a;", TUIConstants.TUIChat.CALL_BACK, "", "d", "(Li6/g$a;)V", "c", "e", "", "b", "()Z", "isUpdated", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C38448g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38448g f86282a = new C38448g();

    /* JADX INFO: renamed from: i6.g$a */
    /* JADX INFO: compiled from: InstallReferrerUtil.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Li6/g$a;", "", "", CmcdData.Factory.STREAMING_FORMAT_SS, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo7873a(@Nullable String s11);
    }

    /* JADX INFO: renamed from: i6.g$b */
    /* JADX INFO: compiled from: InstallReferrerUtil.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"i6/g$b", "Lcom/android/installreferrer/api/InstallReferrerStateListener;", "", "responseCode", "", "onInstallReferrerSetupFinished", "(I)V", "onInstallReferrerServiceDisconnected", "()V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class b implements InstallReferrerStateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InstallReferrerClient f86283a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ a f86284b;

        public b(InstallReferrerClient installReferrerClient, a aVar) {
            this.f86283a = installReferrerClient;
            this.f86284b = aVar;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int responseCode) {
            if (!C42757a.m93689d(this)) {
                try {
                    if (responseCode != 0) {
                        if (responseCode == 2) {
                            C38448g.f86282a.m86712e();
                        }
                    } else {
                        try {
                            ReferrerDetails installReferrer = this.f86283a.getInstallReferrer();
                            Intrinsics.checkNotNullExpressionValue(installReferrer, "{\n                      …rer\n                    }");
                            String installReferrer2 = installReferrer.getInstallReferrer();
                            if (installReferrer2 != null && (StringsKt.contains$default((CharSequence) installReferrer2, (CharSequence) "fb", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) installReferrer2, (CharSequence) AccessToken.DEFAULT_GRAPH_DOMAIN, false, 2, (Object) null))) {
                                this.f86284b.mo7873a(installReferrer2);
                            }
                            C38448g.f86282a.m86712e();
                        } catch (RemoteException | Exception unused) {
                            return;
                        }
                    }
                    this.f86283a.endConnection();
                } catch (Throwable th2) {
                    C42757a.m93687b(th2, this);
                }
            }
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m86709d(@NotNull a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C38448g c38448g = f86282a;
        if (c38448g.m86710b()) {
            return;
        }
        c38448g.m86711c(callback);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m86710b() {
        return C5501a.m7799m().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    /* JADX INFO: renamed from: c */
    public final void m86711c(a callback) {
        InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(C5501a.m7799m()).build();
        try {
            installReferrerClientBuild.startConnection(new b(installReferrerClientBuild, callback));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m86712e() {
        C5501a.m7799m().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}
