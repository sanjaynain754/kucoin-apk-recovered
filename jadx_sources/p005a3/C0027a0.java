package p005a3;

import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.aam.C5505a;
import com.facebook.appevents.cloudbridge.C5514b;
import com.facebook.appevents.gps.ara.GpsAraTriggersManager;
import com.facebook.appevents.iap.C5537e;
import com.facebook.appevents.integrity.ProtectedModeManager;
import com.facebook.appevents.p060ml.ModelManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220e3.C37054a;
import p281g3.C37801a;
import p330i3.C38429a;
import p330i3.C38430b;
import p330i3.C38432d;
import p330i3.C38433e;
import p330i3.C38434f;
import p330i3.C38435g;
import p446m3.C42419a;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: renamed from: a3.a0 */
/* JADX INFO: compiled from: AppEventsManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"La3/a0;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C0027a0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0027a0 f55a = new C0027a0();

    /* JADX INFO: renamed from: a3.a0$a */
    /* JADX INFO: compiled from: AppEventsManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"a3/a0$a", "Lcom/facebook/internal/FetchedAppSettingsManager$a;", "Lcom/facebook/internal/FetchedAppSettings;", "fetchedAppSettings", "", "b", "(Lcom/facebook/internal/FetchedAppSettings;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a implements FetchedAppSettingsManager.InterfaceC5752a {
        /* JADX INFO: renamed from: A */
        public static final void m42A(boolean z11) {
            if (z11) {
                C38429a.m86659a();
            }
        }

        /* JADX INFO: renamed from: B */
        public static final void m43B(boolean z11) {
            if (z11) {
                C5537e.m8216a();
            }
        }

        /* JADX INFO: renamed from: C */
        public static final void m44C(boolean z11) {
            if (z11) {
                C38435g.m86688b();
            }
        }

        /* JADX INFO: renamed from: D */
        public static final void m45D(boolean z11) {
            if (z11) {
                ProtectedModeManager.m8224b();
            }
        }

        /* JADX INFO: renamed from: E */
        public static final void m46E(boolean z11) {
            if (z11) {
                C38432d.m86670a();
            }
        }

        /* JADX INFO: renamed from: F */
        public static final void m47F(boolean z11) {
            if (z11) {
                C38430b.m86663a();
            }
        }

        /* JADX INFO: renamed from: r */
        public static final void m63r(boolean z11) {
            if (z11) {
                C5505a.m7926b();
            }
        }

        /* JADX INFO: renamed from: s */
        public static final void m64s(boolean z11) {
            if (z11) {
                C42419a.m93107a();
            }
        }

        /* JADX INFO: renamed from: t */
        public static final void m65t(boolean z11) {
            if (z11) {
                C38433e.m86680a();
            }
        }

        /* JADX INFO: renamed from: u */
        public static final void m66u(boolean z11) {
            if (z11) {
                C38434f.m86684a();
            }
        }

        /* JADX INFO: renamed from: v */
        public static final void m67v(boolean z11) {
            if (z11) {
                C5514b.m8003b();
            }
        }

        /* JADX INFO: renamed from: w */
        public static final void m68w(boolean z11) {
            if (z11) {
                GpsAraTriggersManager.m8112e();
            }
        }

        /* JADX INFO: renamed from: x */
        public static final void m69x(boolean z11) {
            if (z11) {
                C37801a.m85298c();
            }
        }

        /* JADX INFO: renamed from: y */
        public static final void m70y(boolean z11) {
            if (z11) {
                ModelManager.m8295f();
            }
        }

        /* JADX INFO: renamed from: z */
        public static final void m71z(boolean z11) {
            if (z11) {
                C37054a.m82959a();
            }
        }

        @Override // com.facebook.internal.FetchedAppSettingsManager.InterfaceC5752a
        /* JADX INFO: renamed from: b */
        public void mo73b(@Nullable FetchedAppSettings fetchedAppSettings) {
            FeatureManager.m9936a(FeatureManager.Feature.AAM, new FeatureManager.InterfaceC5749a() { // from class: a3.l
                @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
                /* JADX INFO: renamed from: a */
                public final void mo81a(boolean z11) {
                    C0027a0.a.m63r(z11);
                }
            });
            FeatureManager.m9936a(FeatureManager.Feature.RestrictiveDataFiltering, new FeatureManager.InterfaceC5749a() { // from class: a3.w
                @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
                /* JADX INFO: renamed from: a */
                public final void mo81a(boolean z11) {
                    C0027a0.a.m64s(z11);
                }
            });
            FeatureManager.m9936a(FeatureManager.Feature.PrivacyProtection, new FeatureManager.InterfaceC5749a() { // from class: a3.x
                @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
                /* JADX INFO: renamed from: a */
                public final void mo81a(boolean z11) {
                    C0027a0.a.m70y(z11);
                }
            });
            FeatureManager.m9936a(FeatureManager.Feature.EventDeactivation, new FeatureManager.InterfaceC5749a() { // from class: a3.y
                @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
                /* JADX INFO: renamed from: a */
                public final void mo81a(boolean z11) {
                    C0027a0.a.m71z(z11);
                }
            });
            FeatureManager.m9936a(FeatureManager.Feature.BannedParamFiltering, new FeatureManager.InterfaceC5749a() { // from class: a3.z
                @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
                /* JADX INFO: renamed from: a */
                public final void mo81a(boolean z11) {
                    C0027a0.a.m42A(z11);
                }
            });
            FeatureManager.m9936a(FeatureManager.Feature.IapLogging, new FeatureManager.InterfaceC5749a() { // from class: a3.m
                @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
                /* JADX INFO: renamed from: a */
                public final void mo81a(boolean z11) {
                    C0027a0.a.m43B(z11);
                }
            });
            FeatureManager.m9936a(FeatureManager.Feature.StdParamEnforcement, new FeatureManager.InterfaceC5749a() { // from class: a3.n
                @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
                /* JADX INFO: renamed from: a */
                public final void mo81a(boolean z11) {
                    C0027a0.a.m44C(z11);
                }
            });
            FeatureManager.m9936a(FeatureManager.Feature.ProtectedMode, new FeatureManager.InterfaceC5749a() { // from class: a3.o
                @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
                /* JADX INFO: renamed from: a */
                public final void mo81a(boolean z11) {
                    C0027a0.a.m45D(z11);
                }
            });
            FeatureManager.m9936a(FeatureManager.Feature.MACARuleMatching, new FeatureManager.InterfaceC5749a() { // from class: a3.p
                @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
                /* JADX INFO: renamed from: a */
                public final void mo81a(boolean z11) {
                    C0027a0.a.m46E(z11);
                }
            });
            FeatureManager.m9936a(FeatureManager.Feature.BlocklistEvents, new FeatureManager.InterfaceC5749a() { // from class: a3.q
                @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
                /* JADX INFO: renamed from: a */
                public final void mo81a(boolean z11) {
                    C0027a0.a.m47F(z11);
                }
            });
            FeatureManager.m9936a(FeatureManager.Feature.FilterRedactedEvents, new FeatureManager.InterfaceC5749a() { // from class: a3.r
                @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
                /* JADX INFO: renamed from: a */
                public final void mo81a(boolean z11) {
                    C0027a0.a.m65t(z11);
                }
            });
            FeatureManager.m9936a(FeatureManager.Feature.FilterSensitiveParams, new FeatureManager.InterfaceC5749a() { // from class: a3.s
                @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
                /* JADX INFO: renamed from: a */
                public final void mo81a(boolean z11) {
                    C0027a0.a.m66u(z11);
                }
            });
            FeatureManager.m9936a(FeatureManager.Feature.CloudBridge, new FeatureManager.InterfaceC5749a() { // from class: a3.t
                @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
                /* JADX INFO: renamed from: a */
                public final void mo81a(boolean z11) {
                    C0027a0.a.m67v(z11);
                }
            });
            FeatureManager.m9936a(FeatureManager.Feature.GPSARATriggers, new FeatureManager.InterfaceC5749a() { // from class: a3.u
                @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
                /* JADX INFO: renamed from: a */
                public final void mo81a(boolean z11) {
                    C0027a0.a.m68w(z11);
                }
            });
            FeatureManager.m9936a(FeatureManager.Feature.GPSPACAProcessing, new FeatureManager.InterfaceC5749a() { // from class: a3.v
                @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
                /* JADX INFO: renamed from: a */
                public final void mo81a(boolean z11) {
                    C0027a0.a.m69x(z11);
                }
            });
        }

        @Override // com.facebook.internal.FetchedAppSettingsManager.InterfaceC5752a
        /* JADX INFO: renamed from: a */
        public void mo72a() {
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m41a() {
        if (C42757a.m93689d(C0027a0.class)) {
            return;
        }
        try {
            FetchedAppSettingsManager.m9974d(new a());
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C0027a0.class);
        }
    }
}
