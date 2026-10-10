package p394k6;

import androidx.annotation.RestrictTo;
import com.facebook.C5501a;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.C5764a;
import com.facebook.internal.instrument.crashreport.CrashHandler;
import org.jetbrains.annotations.NotNull;
import p423l6.C42105e;
import p464n6.C42757a;
import p489o6.C42982d;
import p527p6.C43391a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: renamed from: k6.e */
/* JADX INFO: compiled from: InstrumentManager.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lk6/e;", "", "<init>", "()V", "", "d", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C40922e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C40922e f90991a = new C40922e();

    /* JADX INFO: renamed from: e */
    public static final void m89619e(boolean z11) {
        if (z11) {
            CrashHandler.INSTANCE.enable();
            if (FeatureManager.m9939g(FeatureManager.Feature.CrashShield)) {
                C5764a.m10129b();
                C42757a.m93686a();
            }
            if (FeatureManager.m9939g(FeatureManager.Feature.ThreadCheck)) {
                C43391a.m95567a();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m89620f(boolean z11) {
        if (z11) {
            C42982d.m94390d();
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m89621g(boolean z11) {
        if (z11) {
            C42105e.m92363c();
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m89618d() {
        if (!C5501a.m7803q()) {
            return;
        }
        FeatureManager.m9936a(FeatureManager.Feature.CrashReport, new FeatureManager.InterfaceC5749a() { // from class: k6.b
            @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
            /* JADX INFO: renamed from: a */
            public final void mo81a(boolean z11) {
                C40922e.m89619e(z11);
            }
        });
        FeatureManager.m9936a(FeatureManager.Feature.ErrorReport, new FeatureManager.InterfaceC5749a() { // from class: k6.c
            @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
            /* JADX INFO: renamed from: a */
            public final void mo81a(boolean z11) {
                C40922e.m89620f(z11);
            }
        });
        FeatureManager.m9936a(FeatureManager.Feature.AnrReport, new FeatureManager.InterfaceC5749a() { // from class: k6.d
            @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
            /* JADX INFO: renamed from: a */
            public final void mo81a(boolean z11) {
                C40922e.m89621g(z11);
            }
        });
    }
}
