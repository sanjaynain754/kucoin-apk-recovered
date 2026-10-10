package com.kubi.futures.dialog.twap;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.kubi.futures.dialog.twap.IntervalTimeSettingDialog;
import com.kubi.kumex.R$string;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.resources.widget.wheel.view.WheelView;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36759f1;
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

/* JADX INFO: compiled from: IntervalTimeSettingDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\b*\u0002&)\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010+\u001a\u00020#H\u0002J\u0018\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u0010'R\u0010\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0004\n\u0002\u0010*¨\u00060"}, m90084d2 = {"Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogTwapIntervalTimeBinding;", "minutesRange", "Lkotlin/ranges/IntRange;", "secondsRange", "min", "", "max", "reqKey", "", "getReqKey", "()Ljava/lang/String;", "reqKey$delegate", "Lkotlin/Lazy;", "initialInterval", "getInitialInterval", "()J", "initialInterval$delegate", "currentSelectedMinutes", "currentSelectedSeconds", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "initType", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "minuteSelectedListener", "com/kubi/futures/dialog/twap/IntervalTimeSettingDialog$minuteSelectedListener$1", "Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog$minuteSelectedListener$1;", "secondSelectedListener", "com/kubi/futures/dialog/twap/IntervalTimeSettingDialog$secondSelectedListener$1", "Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog$secondSelectedListener$1;", "checkTimeValid", "setTimeOfView", "minutes", "seconds", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class IntervalTimeSettingDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: B0 */
    @NotNull
    public static final Companion f22898B0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    public C36759f1 f22900q0;

    /* JADX INFO: renamed from: x0 */
    public long f22907x0;

    /* JADX INFO: renamed from: y0 */
    public long f22908y0;

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final IntRange f22901r0 = new IntRange(0, 60);

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final IntRange f22902s0 = new IntRange(0, 59);

    /* JADX INFO: renamed from: t0 */
    public final long f22903t0 = 5;

    /* JADX INFO: renamed from: u0 */
    public final long f22904u0 = C33978va.f72340i;

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f22905v0 = LazyKt.lazy(new Function0() { // from class: zh.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IntervalTimeSettingDialog.m25346A4(this.f104687b);
        }
    });

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public final Lazy f22906w0 = LazyKt.lazy(new Function0() { // from class: zh.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Long.valueOf(IntervalTimeSettingDialog.m25357w4(this.f104688b));
        }
    });

    /* JADX INFO: renamed from: z0 */
    @NotNull
    public final C13125a f22909z0 = new C13125a();

    /* JADX INFO: renamed from: A0 */
    @NotNull
    public final C13126b f22899A0 = new C13126b();

    /* JADX INFO: compiled from: IntervalTimeSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog$Companion;", "", "<init>", "()V", "TAG", "", "EXTRA_INTERVAL", "newInstance", "Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;", "reqKey", "curInterval", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final IntervalTimeSettingDialog newInstance(@NotNull String reqKey, long curInterval) {
            Intrinsics.checkNotNullParameter(reqKey, "reqKey");
            IntervalTimeSettingDialog intervalTimeSettingDialog = new IntervalTimeSettingDialog();
            Bundle bundle = new Bundle();
            bundle.putString("data", reqKey);
            bundle.putLong("cur", curInterval);
            intervalTimeSettingDialog.setArguments(bundle);
            return intervalTimeSettingDialog;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.dialog.twap.IntervalTimeSettingDialog$a */
    /* JADX INFO: compiled from: IntervalTimeSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0006"}, m90084d2 = {"com/kubi/futures/dialog/twap/IntervalTimeSettingDialog$minuteSelectedListener$1", "Lkotlin/Function1;", "", "", "invoke", "selectedIndex", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13125a implements Function1<Integer, Unit> {
        public C13125a() {
        }

        /* JADX INFO: renamed from: a */
        public void m25365a(int i11) {
            IntervalTimeSettingDialog intervalTimeSettingDialog = IntervalTimeSettingDialog.this;
            intervalTimeSettingDialog.f22907x0 = ((Number) CollectionsKt.toList(intervalTimeSettingDialog.f22901r0).get(i11)).intValue();
            IntervalTimeSettingDialog.this.m25362t4();
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            m25365a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.dialog.twap.IntervalTimeSettingDialog$b */
    /* JADX INFO: compiled from: IntervalTimeSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0006"}, m90084d2 = {"com/kubi/futures/dialog/twap/IntervalTimeSettingDialog$secondSelectedListener$1", "Lkotlin/Function1;", "", "", "invoke", "selectedIndex", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13126b implements Function1<Integer, Unit> {
        public C13126b() {
        }

        /* JADX INFO: renamed from: a */
        public void m25366a(int i11) {
            IntervalTimeSettingDialog intervalTimeSettingDialog = IntervalTimeSettingDialog.this;
            intervalTimeSettingDialog.f22908y0 = ((Number) CollectionsKt.toList(intervalTimeSettingDialog.f22902s0).get(i11)).intValue();
            IntervalTimeSettingDialog.this.m25362t4();
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            m25366a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: B4 */
    public final void m25361B4(long j11, long j12) {
        this.f22907x0 = RangesKt.coerceIn(j11, C46849a0.m103197e(this.f22901r0));
        this.f22908y0 = RangesKt.coerceIn(j12, C46849a0.m103197e(this.f22902s0));
        C36759f1 c36759f1 = this.f22900q0;
        C36759f1 c36759f2 = null;
        if (c36759f1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36759f1 = null;
        }
        c36759f1.f80013d.setCurrentItem((int) this.f22907x0);
        C36759f1 c36759f3 = this.f22900q0;
        if (c36759f3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c36759f2 = c36759f3;
        }
        c36759f2.f80015f.setCurrentItem((int) this.f22908y0);
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
        C36759f1 c36759f1M82370c = C36759f1.m82370c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(c36759f1M82370c, "inflate(...)");
        this.f22900q0 = c36759f1M82370c;
        if (c36759f1M82370c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36759f1M82370c = null;
        }
        return c36759f1M82370c.getRoot();
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.f22907x0 = RangesKt.coerceIn(C46855g.m103203d(m25363u4()), C46849a0.m103197e(this.f22901r0));
        this.f22908y0 = RangesKt.coerceIn(C46855g.m103204e(m25363u4()), C46849a0.m103197e(this.f22902s0));
        C36759f1 c36759f1 = this.f22900q0;
        C36759f1 c36759f2 = null;
        if (c36759f1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36759f1 = null;
        }
        c36759f1.f80013d.setLabel(getString(R$string.alpha_countdown_minute));
        C36759f1 c36759f3 = this.f22900q0;
        if (c36759f3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36759f3 = null;
        }
        c36759f3.f80015f.setLabel(getString(R$string.alpha_countdown_second));
        C36759f1 c36759f4 = this.f22900q0;
        if (c36759f4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36759f4 = null;
        }
        WheelView minute = c36759f4.f80013d;
        Intrinsics.checkNotNullExpressionValue(minute, "minute");
        C46849a0.m103194b(minute, (int) this.f22907x0, CollectionsKt.toList(this.f22901r0), this.f22909z0);
        C36759f1 c36759f5 = this.f22900q0;
        if (c36759f5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36759f5 = null;
        }
        WheelView second = c36759f5.f80015f;
        Intrinsics.checkNotNullExpressionValue(second, "second");
        C46849a0.m103194b(second, (int) this.f22908y0, CollectionsKt.toList(this.f22902s0), this.f22899A0);
        C36759f1 c36759f6 = this.f22900q0;
        if (c36759f6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36759f6 = null;
        }
        ImageView ivClose = c36759f6.f80012c;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        C27046k.m66711z(ivClose, 0L, new Function0() { // from class: zh.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntervalTimeSettingDialog.m25358x4(this.f104683b);
            }
        }, 1, null);
        C36759f1 c36759f7 = this.f22900q0;
        if (c36759f7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36759f7 = null;
        }
        KcSecondaryButton resetTv = c36759f7.f80014e;
        Intrinsics.checkNotNullExpressionValue(resetTv, "resetTv");
        C27046k.m66711z(resetTv, 0L, new Function0() { // from class: zh.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntervalTimeSettingDialog.m25359y4(this.f104685b);
            }
        }, 1, null);
        C36759f1 c36759f8 = this.f22900q0;
        if (c36759f8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c36759f2 = c36759f8;
        }
        KcPrimaryButton confirmTv = c36759f2.f80011b;
        Intrinsics.checkNotNullExpressionValue(confirmTv, "confirmTv");
        C27046k.m66711z(confirmTv, 0L, new Function0() { // from class: zh.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntervalTimeSettingDialog.m25360z4(this.f104686b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: t4 */
    public final void m25362t4() {
        long j11 = (this.f22907x0 * ((long) 60)) + this.f22908y0;
        long j12 = this.f22903t0;
        if (j11 < j12) {
            m25361B4(C46855g.m103203d(j12), C46855g.m103204e(this.f22903t0));
            ToastCompat.m66441G(getString(R$string.bkumex_twap_interval_min_tips, String.valueOf(C46855g.m103207h(this.f22903t0))), new Object[0]);
            return;
        }
        long j13 = this.f22904u0;
        if (j11 > j13) {
            m25361B4(C46855g.m103203d(j13), C46855g.m103204e(this.f22904u0));
            ToastCompat.m66441G(getString(R$string.bkumex_twap_interval_max_tips, String.valueOf(C46855g.m103207h(this.f22904u0))), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final long m25363u4() {
        return ((Number) this.f22906w0.getValue()).longValue();
    }

    /* JADX INFO: renamed from: v4 */
    public final String m25364v4() {
        return (String) this.f22905v0.getValue();
    }

    /* JADX INFO: renamed from: A4 */
    public static final String m25346A4(IntervalTimeSettingDialog intervalTimeSettingDialog) {
        String string;
        Bundle arguments = intervalTimeSettingDialog.getArguments();
        if (arguments != null && (string = arguments.getString("data")) != null) {
            return string;
        }
        return "";
    }

    /* JADX INFO: renamed from: w4 */
    public static final long m25357w4(IntervalTimeSettingDialog intervalTimeSettingDialog) {
        Bundle arguments = intervalTimeSettingDialog.getArguments();
        if (arguments != null) {
            return arguments.getLong("cur");
        }
        return 30L;
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m25358x4(IntervalTimeSettingDialog intervalTimeSettingDialog) {
        intervalTimeSettingDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m25359y4(IntervalTimeSettingDialog intervalTimeSettingDialog) {
        intervalTimeSettingDialog.m25361B4(C46855g.m103203d(intervalTimeSettingDialog.m25363u4()), C46855g.m103204e(intervalTimeSettingDialog.m25363u4()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m25360z4(IntervalTimeSettingDialog intervalTimeSettingDialog) {
        FragmentManager supportFragmentManager;
        FragmentActivity activity = intervalTimeSettingDialog.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            String strM25364v4 = intervalTimeSettingDialog.m25364v4();
            Bundle bundle = new Bundle();
            bundle.putLong(JPushConstants.Geofence.KEY_INTERVAL, (intervalTimeSettingDialog.f22907x0 * ((long) 60)) + intervalTimeSettingDialog.f22908y0);
            Unit unit = Unit.INSTANCE;
            supportFragmentManager.setFragmentResult(strM25364v4, bundle);
        }
        intervalTimeSettingDialog.dismiss();
        return Unit.INSTANCE;
    }
}
