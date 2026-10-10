package y20;

import com.kubi.quotefacade.api.IQuoteFacadeService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: y20.b */
/* JADX INFO: compiled from: MarketGuideHelper.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00100\u0014J3\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00100\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\u0006¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/spot/quote/market/guide/MarketGuideHelper;", "", "<init>", "()V", "isGuide", "", "()Z", "setGuide", "(Z)V", "MARKET_GUIDE", "", "showFeedTab", "getShowFeedTab", "showFeedTab$delegate", "Lkotlin/Lazy;", "checkGuide", "", "activity", "Lcom/kubi/sdk/BaseActivity;", "onComplete", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isCancel", "showFeedGuide", "onFinish", "target", "Landroid/view/View;", "MarketStepFeedHeader", "MarketStepFeed", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46368b {

    /* JADX INFO: renamed from: b */
    public static boolean f103974b;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46368b f103973a = new C46368b();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f103975c = LazyKt.lazy(new Function0() { // from class: y20.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C46368b.m102262c());
        }
    });

    /* JADX INFO: renamed from: c */
    public static final boolean m102262c() {
        return IQuoteFacadeService.f41383a.get().mo50706i();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m102263b() {
        return f103974b;
    }
}
