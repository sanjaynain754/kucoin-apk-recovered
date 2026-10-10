package com.kubi.futures.dialog.twap;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.futures.dialog.twap.TotalTimeSettingDialog;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.resources.widget.wheel.view.WheelView;
import com.kubi.sdk.res.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36771h1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p832zh.C46849a0;
import p832zh.C46855g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: TotalTimeSettingDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0007*\u000347:\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020/H\u0016J\u001a\u00100\u001a\u0002012\u0006\u00102\u001a\u00020'2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010<\u001a\u000201H\u0002J\u0010\u0010=\u001a\u0002012\u0006\u0010>\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001b\u0010\u0013R\u001b\u0010\u001d\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u001e\u0010\u0018R\u001b\u0010 \u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u000f\u001a\u0004\b!\u0010\u0018R\u000e\u0010#\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0004\n\u0002\u00105R\u0010\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0004\n\u0002\u00108R\u0010\u00109\u001a\u00020:X\u0082\u0004¢\u0006\u0004\n\u0002\u0010;¨\u0006@"}, m90084d2 = {"Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogTwapTotalTimeBinding;", "daysRange", "Lkotlin/ranges/IntRange;", "hoursRange", "minutesRange", "requestKey", "", "getRequestKey", "()Ljava/lang/String;", "requestKey$delegate", "Lkotlin/Lazy;", "min", "", "getMin", "()J", "min$delegate", "minBreakdown", "Lcom/kubi/futures/dialog/twap/TimeBreakdown;", "getMinBreakdown", "()Lcom/kubi/futures/dialog/twap/TimeBreakdown;", "minBreakdown$delegate", "max", "getMax", "max$delegate", "maxBreakdown", "getMaxBreakdown", "maxBreakdown$delegate", "initialTotalTime", "getInitialTotalTime", "initialTotalTime$delegate", "currentSelectedDays", "currentSelectedHours", "currentSelectedMinutes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "initType", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "daySelectedListener", "com/kubi/futures/dialog/twap/TotalTimeSettingDialog$daySelectedListener$1", "Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog$daySelectedListener$1;", "hourSelectedListener", "com/kubi/futures/dialog/twap/TotalTimeSettingDialog$hourSelectedListener$1", "Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog$hourSelectedListener$1;", "minuteSelectedListener", "com/kubi/futures/dialog/twap/TotalTimeSettingDialog$minuteSelectedListener$1", "Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog$minuteSelectedListener$1;", "checkTimeValid", "setTimeOfView", "breakdown", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TotalTimeSettingDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: G0 */
    @NotNull
    public static final Companion f22922G0 = new Companion(null);

    /* JADX INFO: renamed from: A0 */
    public long f22923A0;

    /* JADX INFO: renamed from: B0 */
    public long f22924B0;

    /* JADX INFO: renamed from: C0 */
    public long f22925C0;

    /* JADX INFO: renamed from: q0 */
    public C36771h1 f22929q0;

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final IntRange f22930r0 = new IntRange(0, 7);

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final IntRange f22931s0 = new IntRange(0, 23);

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final IntRange f22932t0 = new IntRange(0, 59);

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f22933u0 = LazyKt.lazy(new Function0() { // from class: zh.q
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TotalTimeSettingDialog.m25408O4(this.f104698b);
        }
    });

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f22934v0 = LazyKt.lazy(new Function0() { // from class: zh.r
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Long.valueOf(TotalTimeSettingDialog.m25404K4(this.f104699b));
        }
    });

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public final Lazy f22935w0 = LazyKt.lazy(new Function0() { // from class: zh.s
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TotalTimeSettingDialog.m25403J4(this.f104700b);
        }
    });

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public final Lazy f22936x0 = LazyKt.lazy(new Function0() { // from class: zh.t
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Long.valueOf(TotalTimeSettingDialog.m25402I4(this.f104701b));
        }
    });

    /* JADX INFO: renamed from: y0 */
    @NotNull
    public final Lazy f22937y0 = LazyKt.lazy(new Function0() { // from class: zh.u
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TotalTimeSettingDialog.m25401H4(this.f104702b);
        }
    });

    /* JADX INFO: renamed from: z0 */
    @NotNull
    public final Lazy f22938z0 = LazyKt.lazy(new Function0() { // from class: zh.v
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TotalTimeSettingDialog.m25400G4(this.f104703b);
        }
    });

    /* JADX INFO: renamed from: D0 */
    @NotNull
    public final C13131a f22926D0 = new C13131a();

    /* JADX INFO: renamed from: E0 */
    @NotNull
    public final C13132b f22927E0 = new C13132b();

    /* JADX INFO: renamed from: F0 */
    @NotNull
    public final C13133c f22928F0 = new C13133c();

    /* JADX INFO: compiled from: TotalTimeSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog$Companion;", "", "<init>", "()V", "TAG", "", "EXTRA_CUR", "EXTRA_MIN", "EXTRA_MAX", "EXTRA_TOTAL_TIME", "newInstance", "Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog;", "requestKey", "curTotalTime", "Lcom/kubi/futures/dialog/twap/TimeBreakdown;", "min", "", "max", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final TotalTimeSettingDialog newInstance(@NotNull String requestKey, @NotNull TimeBreakdown curTotalTime, long min, long max) {
            Intrinsics.checkNotNullParameter(requestKey, "requestKey");
            Intrinsics.checkNotNullParameter(curTotalTime, "curTotalTime");
            TotalTimeSettingDialog totalTimeSettingDialog = new TotalTimeSettingDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("cur", curTotalTime);
            bundle.putLong("min", min);
            bundle.putLong("max", max);
            bundle.putString("data", requestKey);
            totalTimeSettingDialog.setArguments(bundle);
            return totalTimeSettingDialog;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.dialog.twap.TotalTimeSettingDialog$a */
    /* JADX INFO: compiled from: TotalTimeSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0006"}, m90084d2 = {"com/kubi/futures/dialog/twap/TotalTimeSettingDialog$daySelectedListener$1", "Lkotlin/Function1;", "", "", "invoke", "selectedIndex", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13131a implements Function1<Integer, Unit> {
        public C13131a() {
        }

        /* JADX INFO: renamed from: a */
        public void m25433a(int i11) {
            TotalTimeSettingDialog totalTimeSettingDialog = TotalTimeSettingDialog.this;
            totalTimeSettingDialog.f22923A0 = ((Number) CollectionsKt.toList(totalTimeSettingDialog.f22930r0).get(i11)).intValue();
            TotalTimeSettingDialog.this.m25425z4();
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            m25433a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.dialog.twap.TotalTimeSettingDialog$b */
    /* JADX INFO: compiled from: TotalTimeSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0006"}, m90084d2 = {"com/kubi/futures/dialog/twap/TotalTimeSettingDialog$hourSelectedListener$1", "Lkotlin/Function1;", "", "", "invoke", "selectedIndex", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13132b implements Function1<Integer, Unit> {
        public C13132b() {
        }

        /* JADX INFO: renamed from: a */
        public void m25434a(int i11) {
            TotalTimeSettingDialog totalTimeSettingDialog = TotalTimeSettingDialog.this;
            totalTimeSettingDialog.f22924B0 = ((Number) CollectionsKt.toList(totalTimeSettingDialog.f22931s0).get(i11)).intValue();
            TotalTimeSettingDialog.this.m25425z4();
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            m25434a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.dialog.twap.TotalTimeSettingDialog$c */
    /* JADX INFO: compiled from: TotalTimeSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0006"}, m90084d2 = {"com/kubi/futures/dialog/twap/TotalTimeSettingDialog$minuteSelectedListener$1", "Lkotlin/Function1;", "", "", "invoke", "selectedIndex", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13133c implements Function1<Integer, Unit> {
        public C13133c() {
        }

        /* JADX INFO: renamed from: a */
        public void m25435a(int i11) {
            TotalTimeSettingDialog totalTimeSettingDialog = TotalTimeSettingDialog.this;
            totalTimeSettingDialog.f22925C0 = ((Number) CollectionsKt.toList(totalTimeSettingDialog.f22932t0).get(i11)).intValue();
            TotalTimeSettingDialog.this.m25425z4();
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            m25435a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public final void m25425z4() {
        long j11 = (this.f22923A0 * 86400) + (this.f22924B0 * C33978va.f72340i) + (this.f22925C0 * 60);
        if (j11 < m25429D4()) {
            m25432P4(m25430E4());
            ToastCompat.m66441G(getString(R$string.bkumex_twap_duration_min_tips, String.valueOf(C46855g.m103205f(m25430E4().toSeconds()))), new Object[0]);
        } else if (j11 > m25427B4()) {
            m25432P4(m25428C4());
            ToastCompat.m66441G(getString(R$string.bkumex_twap_duration_max_tips, String.valueOf(C46855g.m103205f(m25428C4().toSeconds()))), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final TimeBreakdown m25426A4() {
        return (TimeBreakdown) this.f22938z0.getValue();
    }

    /* JADX INFO: renamed from: B4 */
    public final long m25427B4() {
        return ((Number) this.f22936x0.getValue()).longValue();
    }

    /* JADX INFO: renamed from: C4 */
    public final TimeBreakdown m25428C4() {
        return (TimeBreakdown) this.f22937y0.getValue();
    }

    /* JADX INFO: renamed from: D4 */
    public final long m25429D4() {
        return ((Number) this.f22934v0.getValue()).longValue();
    }

    /* JADX INFO: renamed from: E4 */
    public final TimeBreakdown m25430E4() {
        return (TimeBreakdown) this.f22935w0.getValue();
    }

    /* JADX INFO: renamed from: F4 */
    public final String m25431F4() {
        return (String) this.f22933u0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C36771h1 c36771h1M82399c = C36771h1.m82399c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(c36771h1M82399c, "inflate(...)");
        this.f22929q0 = c36771h1M82399c;
        if (c36771h1M82399c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36771h1M82399c = null;
        }
        return c36771h1M82399c.getRoot();
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36771h1 c36771h1 = this.f22929q0;
        C36771h1 c36771h2 = null;
        if (c36771h1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36771h1 = null;
        }
        c36771h1.f80178d.setLabel(getString(R$string.alpha_countdown_day));
        C36771h1 c36771h3 = this.f22929q0;
        if (c36771h3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36771h3 = null;
        }
        c36771h3.f80179e.setLabel(getString(R$string.alpha_countdown_hour));
        C36771h1 c36771h4 = this.f22929q0;
        if (c36771h4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36771h4 = null;
        }
        c36771h4.f80180f.setLabel(getString(R$string.alpha_countdown_minute));
        if (m25426A4().toSeconds() < m25429D4()) {
            m25432P4(m25430E4());
            ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.bkumex_twap_duration_min_tips, String.valueOf(C46855g.m103205f(m25430E4().toSeconds()))), new Object[0]);
        } else if (m25426A4().toSeconds() > m25427B4()) {
            m25432P4(m25428C4());
            ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.bkumex_twap_duration_max_tips, String.valueOf(C46855g.m103205f(m25428C4().toSeconds()))), new Object[0]);
        } else {
            m25432P4(m25426A4());
        }
        C36771h1 c36771h5 = this.f22929q0;
        if (c36771h5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36771h5 = null;
        }
        WheelView days = c36771h5.f80178d;
        Intrinsics.checkNotNullExpressionValue(days, "days");
        C46849a0.m103194b(days, (int) this.f22923A0, CollectionsKt.toList(this.f22930r0), this.f22926D0);
        C36771h1 c36771h6 = this.f22929q0;
        if (c36771h6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36771h6 = null;
        }
        WheelView hours = c36771h6.f80179e;
        Intrinsics.checkNotNullExpressionValue(hours, "hours");
        C46849a0.m103194b(hours, (int) this.f22924B0, CollectionsKt.toList(this.f22931s0), this.f22927E0);
        C36771h1 c36771h7 = this.f22929q0;
        if (c36771h7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36771h7 = null;
        }
        WheelView minutes = c36771h7.f80180f;
        Intrinsics.checkNotNullExpressionValue(minutes, "minutes");
        C46849a0.m103194b(minutes, (int) this.f22925C0, CollectionsKt.toList(this.f22932t0), this.f22928F0);
        C36771h1 c36771h8 = this.f22929q0;
        if (c36771h8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36771h8 = null;
        }
        ImageView closeIv = c36771h8.f80176b;
        Intrinsics.checkNotNullExpressionValue(closeIv, "closeIv");
        C27046k.m66711z(closeIv, 0L, new Function0() { // from class: zh.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TotalTimeSettingDialog.m25406M4(this.f104704b);
            }
        }, 1, null);
        C36771h1 c36771h9 = this.f22929q0;
        if (c36771h9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36771h9 = null;
        }
        KcSecondaryButton resetTv = c36771h9.f80181g;
        Intrinsics.checkNotNullExpressionValue(resetTv, "resetTv");
        C27046k.m66711z(resetTv, 0L, new Function0() { // from class: zh.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TotalTimeSettingDialog.m25407N4(this.f104705b);
            }
        }, 1, null);
        C36771h1 c36771h10 = this.f22929q0;
        if (c36771h10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c36771h2 = c36771h10;
        }
        KcPrimaryButton confirmTv = c36771h2.f80177c;
        Intrinsics.checkNotNullExpressionValue(confirmTv, "confirmTv");
        C27046k.m66711z(confirmTv, 0L, new Function0() { // from class: zh.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TotalTimeSettingDialog.m25405L4(this.f104706b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: G4 */
    public static final TimeBreakdown m25400G4(TotalTimeSettingDialog totalTimeSettingDialog) {
        TimeBreakdown timeBreakdown;
        Bundle arguments = totalTimeSettingDialog.getArguments();
        if (arguments != null && (timeBreakdown = (TimeBreakdown) BundleCompat.getParcelable(arguments, "cur", TimeBreakdown.class)) != null) {
            return timeBreakdown;
        }
        return new TimeBreakdown(0L, 4L, 0L, 0L);
    }

    /* JADX INFO: renamed from: H4 */
    public static final TimeBreakdown m25401H4(TotalTimeSettingDialog totalTimeSettingDialog) {
        return C46849a0.m103196d(totalTimeSettingDialog.m25427B4());
    }

    /* JADX INFO: renamed from: I4 */
    public static final long m25402I4(TotalTimeSettingDialog totalTimeSettingDialog) {
        Bundle arguments = totalTimeSettingDialog.getArguments();
        if (arguments != null) {
            return arguments.getLong("max");
        }
        return 0L;
    }

    /* JADX INFO: renamed from: J4 */
    public static final TimeBreakdown m25403J4(TotalTimeSettingDialog totalTimeSettingDialog) {
        return C46849a0.m103196d(totalTimeSettingDialog.m25429D4());
    }

    /* JADX INFO: renamed from: K4 */
    public static final long m25404K4(TotalTimeSettingDialog totalTimeSettingDialog) {
        Bundle arguments = totalTimeSettingDialog.getArguments();
        if (arguments != null) {
            return arguments.getLong("min");
        }
        return 0L;
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m25405L4(TotalTimeSettingDialog totalTimeSettingDialog) {
        FragmentManager supportFragmentManager;
        FragmentActivity activity = totalTimeSettingDialog.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            String strM25431F4 = totalTimeSettingDialog.m25431F4();
            Bundle bundle = new Bundle();
            bundle.putParcelable("totalTime", new TimeBreakdown(totalTimeSettingDialog.f22923A0, totalTimeSettingDialog.f22924B0, totalTimeSettingDialog.f22925C0, 0L));
            Unit unit = Unit.INSTANCE;
            supportFragmentManager.setFragmentResult(strM25431F4, bundle);
        }
        totalTimeSettingDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m25406M4(TotalTimeSettingDialog totalTimeSettingDialog) {
        totalTimeSettingDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final Unit m25407N4(TotalTimeSettingDialog totalTimeSettingDialog) {
        totalTimeSettingDialog.m25432P4(totalTimeSettingDialog.m25426A4());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O4 */
    public static final String m25408O4(TotalTimeSettingDialog totalTimeSettingDialog) {
        String string;
        Bundle arguments = totalTimeSettingDialog.getArguments();
        if (arguments != null && (string = arguments.getString("data")) != null) {
            return string;
        }
        return "";
    }

    /* JADX INFO: renamed from: P4 */
    public final void m25432P4(TimeBreakdown timeBreakdown) {
        this.f22923A0 = RangesKt.coerceIn(timeBreakdown.getDays(), C46849a0.m103197e(this.f22930r0));
        this.f22924B0 = RangesKt.coerceIn(timeBreakdown.getHours(), C46849a0.m103197e(this.f22931s0));
        this.f22925C0 = RangesKt.coerceIn(timeBreakdown.getMinutes(), C46849a0.m103197e(this.f22932t0));
        C36771h1 c36771h1 = this.f22929q0;
        C36771h1 c36771h2 = null;
        if (c36771h1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36771h1 = null;
        }
        c36771h1.f80178d.setCurrentItem((int) timeBreakdown.getDays());
        C36771h1 c36771h3 = this.f22929q0;
        if (c36771h3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36771h3 = null;
        }
        c36771h3.f80179e.setCurrentItem((int) timeBreakdown.getHours());
        C36771h1 c36771h4 = this.f22929q0;
        if (c36771h4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c36771h2 = c36771h4;
        }
        c36771h2.f80180f.setCurrentItem((int) timeBreakdown.getMinutes());
    }
}
