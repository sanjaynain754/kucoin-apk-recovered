package com.kubi.home.v2;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.copytrading.ICopyTradingService;
import com.kubi.home.realtime.card.C14811d;
import com.kubi.home.v2.biz.empty.BottomGapCardViewHolder;
import com.kubi.home.v2.biz.empty.EmptyCardViewHolder;
import com.kubi.home.v2.biz.footer.FooterCardViewHolder;
import com.kubi.home.v2.biz.kuming.KuMiningCardViewHolder;
import com.kubi.home.widgets.banner.C15100j;
import com.kubi.home.widgets.grid.C15133l;
import com.kubi.home.widgets.recommend.C15138a;
import com.kubi.home.widgets.search.C15147a;
import com.kubi.kucoin.home.p090v2.cards.ClassMappingV2;
import com.kubi.operation.api.IOperationService;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.tradingbotkit.api.ITradingBotService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.kubi.home.v2.s0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: WidgetsMapping.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bP\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007R\u001b\u0010\r\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u000e\u0010\u0007R\u001b\u0010\u0010\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0011\u0010\u0007R\u001b\u0010\u0013\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0014\u0010\u0007R\u001b\u0010\u0016\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0017\u0010\u0007R\u001b\u0010\u0019\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001a\u0010\u0007R\u001b\u0010\u001c\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001d\u0010\u0007R\u001b\u0010\u001f\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\t\u001a\u0004\b \u0010\u0007R\u001b\u0010\"\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\t\u001a\u0004\b#\u0010\u0007R\u001b\u0010%\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\t\u001a\u0004\b&\u0010\u0007R\u001b\u0010(\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\t\u001a\u0004\b)\u0010\u0007R\u001b\u0010+\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\t\u001a\u0004\b,\u0010\u0007R\u001b\u0010.\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\t\u001a\u0004\b/\u0010\u0007R\u001b\u00101\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\t\u001a\u0004\b2\u0010\u0007R\u001b\u00104\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\t\u001a\u0004\b5\u0010\u0007R\u001b\u00107\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\t\u001a\u0004\b8\u0010\u0007R\u001b\u0010:\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\t\u001a\u0004\b;\u0010\u0007R\u001b\u0010=\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\t\u001a\u0004\b>\u0010\u0007R\u001b\u0010@\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\t\u001a\u0004\bA\u0010\u0007R\u001b\u0010C\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\t\u001a\u0004\bD\u0010\u0007R\u001b\u0010F\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bH\u0010\t\u001a\u0004\bG\u0010\u0007R\u001b\u0010I\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u0010\t\u001a\u0004\bJ\u0010\u0007R\u001b\u0010L\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bN\u0010\t\u001a\u0004\bM\u0010\u0007R\u001b\u0010O\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010\t\u001a\u0004\bP\u0010\u0007R\u001b\u0010R\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bT\u0010\t\u001a\u0004\bS\u0010\u0007¨\u0006U"}, m90084d2 = {"Lcom/kubi/home/v2/WidgetsMapping;", "", "<init>", "()V", "empty", "Lcom/kubi/kucoin/home/v2/cards/ClassMappingV2;", "getEmpty", "()Lcom/kubi/kucoin/home/v2/cards/ClassMappingV2;", "empty$delegate", "Lkotlin/Lazy;", "footer", "getFooter", "footer$delegate", "bottomGap", "getBottomGap", "bottomGap$delegate", FirebaseAnalytics.Event.SEARCH, "getSearch", "search$delegate", "newUser", "getNewUser", "newUser$delegate", "learn", "getLearn", "learn$delegate", "userStatus", "getUserStatus", "userStatus$delegate", "menu", "getMenu", "menu$delegate", "banner", "getBanner", "banner$delegate", "bannerFull", "getBannerFull", "bannerFull$delegate", "gembox", "getGembox", "gembox$delegate", "rankingList", "getRankingList", "rankingList$delegate", "recommendPosition", "getRecommendPosition", "recommendPosition$delegate", "changeDistribution", "getChangeDistribution", "changeDistribution$delegate", "changeDistributionFull", "getChangeDistributionFull", "changeDistributionFull$delegate", "fearAndGreedIndex", "getFearAndGreedIndex", "fearAndGreedIndex$delegate", "fearAndGreedIndexFull", "getFearAndGreedIndexFull", "fearAndGreedIndexFull$delegate", "hotSections", "getHotSections", "hotSections$delegate", "hotSectionsFull", "getHotSectionsFull", "hotSectionsFull$delegate", "realTime", "getRealTime", "realTime$delegate", "homeFeed", "getHomeFeed", "homeFeed$delegate", "copyTrading", "getCopyTrading", "copyTrading$delegate", "copyTradingRobot", "getCopyTradingRobot", "copyTradingRobot$delegate", "calendarDay", "getCalendarDay", "calendarDay$delegate", "calendarWeek", "getCalendarWeek", "calendarWeek$delegate", "kuMining", "getKuMining", "kuMining$delegate", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WidgetsMapping {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final WidgetsMapping f26617a = new WidgetsMapping();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f26618b = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.s
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30949J();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f26619c = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.u
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30952M();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy f26620d = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.b0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30942C();
        }
    });

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Lazy f26621e = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.c0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30989y0();
        }
    });

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Lazy f26622f = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.e0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30981u0();
        }
    });

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Lazy f26623g = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.f0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30977s0();
        }
    });

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Lazy f26624h = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.g0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30991z0();
        }
    });

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Lazy f26625i = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.h0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30979t0();
        }
    });

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Lazy f26626j = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.i0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30941B();
        }
    });

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Lazy f26627k = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.j0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30940A();
        }
    });

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final Lazy f26628l = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.d0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30953N();
        }
    });

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final Lazy f26629m = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.k0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30983v0();
        }
    });

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Lazy f26630n = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.l0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30987x0();
        }
    });

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final Lazy f26631o = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.m0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30946G();
        }
    });

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final Lazy f26632p = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.n0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30945F();
        }
    });

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final Lazy f26633q = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.o0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30951L();
        }
    });

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final Lazy f26634r = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.p0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30950K();
        }
    });

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final Lazy f26635s = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.q0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30973q0();
        }
    });

    /* JADX INFO: renamed from: t */
    @NotNull
    public static final Lazy f26636t = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.r0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30971p0();
        }
    });

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final Lazy f26637u = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.t
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30985w0();
        }
    });

    /* JADX INFO: renamed from: v */
    @NotNull
    public static final Lazy f26638v = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.v
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30969o0();
        }
    });

    /* JADX INFO: renamed from: w */
    @NotNull
    public static final Lazy f26639w = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.w
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30948I();
        }
    });

    /* JADX INFO: renamed from: x */
    @NotNull
    public static final Lazy f26640x = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.x
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30947H();
        }
    });

    /* JADX INFO: renamed from: y */
    @NotNull
    public static final Lazy f26641y = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.y
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30943D();
        }
    });

    /* JADX INFO: renamed from: z */
    @NotNull
    public static final Lazy f26642z = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.z
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30944E();
        }
    });

    /* JADX INFO: renamed from: A */
    @NotNull
    public static final Lazy f26616A = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.a0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetsMapping.m30975r0();
        }
    });

    /* JADX INFO: renamed from: C */
    public static final ClassMappingV2 m30942C() {
        return new ClassMappingV2(BottomGapCardViewHolder.class);
    }

    /* JADX INFO: renamed from: D */
    public static final ClassMappingV2 m30943D() {
        return IQuoteFacadeService.f41383a.get().mo50689P();
    }

    /* JADX INFO: renamed from: E */
    public static final ClassMappingV2 m30944E() {
        return IQuoteFacadeService.f41383a.get().mo50701d();
    }

    /* JADX INFO: renamed from: F */
    public static final ClassMappingV2 m30945F() {
        return IQuoteFacadeService.f41383a.get().mo50717v();
    }

    /* JADX INFO: renamed from: G */
    public static final ClassMappingV2 m30946G() {
        return IQuoteFacadeService.f41383a.get().mo50676A();
    }

    /* JADX INFO: renamed from: H */
    public static final ClassMappingV2 m30947H() {
        return ITradingBotService.f52126a.get().mo63681f();
    }

    /* JADX INFO: renamed from: I */
    public static final ClassMappingV2 m30948I() {
        return ICopyTradingService.f19723a.get().mo20629j();
    }

    /* JADX INFO: renamed from: J */
    public static final ClassMappingV2 m30949J() {
        return new ClassMappingV2(EmptyCardViewHolder.class);
    }

    /* JADX INFO: renamed from: K */
    public static final ClassMappingV2 m30950K() {
        return IQuoteFacadeService.f41383a.get().mo50711n();
    }

    /* JADX INFO: renamed from: L */
    public static final ClassMappingV2 m30951L() {
        return IQuoteFacadeService.f41383a.get().mo50685L();
    }

    /* JADX INFO: renamed from: M */
    public static final ClassMappingV2 m30952M() {
        return new ClassMappingV2(FooterCardViewHolder.class);
    }

    /* JADX INFO: renamed from: N */
    public static final ClassMappingV2 m30953N() {
        return IQuoteFacadeService.f41383a.get().mo50721z();
    }

    /* JADX INFO: renamed from: o0 */
    public static final ClassMappingV2 m30969o0() {
        return IQuoteFacadeService.f41383a.get().mo50694U();
    }

    /* JADX INFO: renamed from: p0 */
    public static final ClassMappingV2 m30971p0() {
        return IQuoteFacadeService.f41383a.get().mo50719x();
    }

    /* JADX INFO: renamed from: q0 */
    public static final ClassMappingV2 m30973q0() {
        return IQuoteFacadeService.f41383a.get().mo50684K();
    }

    /* JADX INFO: renamed from: r0 */
    public static final ClassMappingV2 m30975r0() {
        return new ClassMappingV2(KuMiningCardViewHolder.class);
    }

    /* JADX INFO: renamed from: s0 */
    public static final ClassMappingV2 m30977s0() {
        return IOperationService.f36504a.get().mo4609k();
    }

    /* JADX INFO: renamed from: u0 */
    public static final ClassMappingV2 m30981u0() {
        return IOperationService.f36504a.get().mo4604f();
    }

    /* JADX INFO: renamed from: v0 */
    public static final ClassMappingV2 m30983v0() {
        return IQuoteFacadeService.f41383a.get().mo50679D();
    }

    /* JADX INFO: renamed from: z0 */
    public static final ClassMappingV2 m30991z0() {
        return IOperationService.f36504a.get().mo4600b();
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final ClassMappingV2 m30992O() {
        return (ClassMappingV2) f26626j.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final ClassMappingV2 m30993P() {
        return (ClassMappingV2) f26627k.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final ClassMappingV2 m30994Q() {
        return (ClassMappingV2) f26620d.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final ClassMappingV2 m30995R() {
        return (ClassMappingV2) f26641y.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final ClassMappingV2 m30996S() {
        return (ClassMappingV2) f26642z.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final ClassMappingV2 m30997T() {
        return (ClassMappingV2) f26631o.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final ClassMappingV2 m30998U() {
        return (ClassMappingV2) f26632p.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final ClassMappingV2 m30999V() {
        return (ClassMappingV2) f26639w.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final ClassMappingV2 m31000W() {
        return (ClassMappingV2) f26640x.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final ClassMappingV2 m31001X() {
        return (ClassMappingV2) f26618b.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final ClassMappingV2 m31002Y() {
        return (ClassMappingV2) f26633q.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final ClassMappingV2 m31003Z() {
        return (ClassMappingV2) f26634r.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final ClassMappingV2 m31004a0() {
        return (ClassMappingV2) f26619c.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final ClassMappingV2 m31005b0() {
        return (ClassMappingV2) f26628l.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final ClassMappingV2 m31006c0() {
        return (ClassMappingV2) f26638v.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final ClassMappingV2 m31007d0() {
        return (ClassMappingV2) f26635s.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final ClassMappingV2 m31008e0() {
        return (ClassMappingV2) f26636t.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final ClassMappingV2 m31009f0() {
        return (ClassMappingV2) f26616A.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final ClassMappingV2 m31010g0() {
        return (ClassMappingV2) f26623g.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final ClassMappingV2 m31011h0() {
        return (ClassMappingV2) f26625i.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final ClassMappingV2 m31012i0() {
        return (ClassMappingV2) f26622f.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final ClassMappingV2 m31013j0() {
        return (ClassMappingV2) f26629m.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final ClassMappingV2 m31014k0() {
        return (ClassMappingV2) f26637u.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final ClassMappingV2 m31015l0() {
        return (ClassMappingV2) f26630n.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final ClassMappingV2 m31016m0() {
        return (ClassMappingV2) f26621e.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final ClassMappingV2 m31017n0() {
        return (ClassMappingV2) f26624h.getValue();
    }

    /* JADX INFO: renamed from: A */
    public static final ClassMappingV2 m30940A() {
        return C15100j.m31122a();
    }

    /* JADX INFO: renamed from: B */
    public static final ClassMappingV2 m30941B() {
        return C15100j.m31123b();
    }

    /* JADX INFO: renamed from: t0 */
    public static final ClassMappingV2 m30979t0() {
        return C15133l.m31203a();
    }

    /* JADX INFO: renamed from: w0 */
    public static final ClassMappingV2 m30985w0() {
        return C14811d.m30095a();
    }

    /* JADX INFO: renamed from: x0 */
    public static final ClassMappingV2 m30987x0() {
        return C15138a.m31227a();
    }

    /* JADX INFO: renamed from: y0 */
    public static final ClassMappingV2 m30989y0() {
        return C15147a.m31235a();
    }
}
