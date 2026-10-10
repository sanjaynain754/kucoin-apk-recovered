package com.kubi.futures.dialog;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.animation.PathInterpolatorCompat;
import bi.C4615g;
import com.airbnb.lottie.LottieAnimationView;
import com.blankj.utilcode.util.C5267e0;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.event.api.C12572a;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.platform.model.PropertyEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import dm.C36853v;
import f00.C37304a;
import g00.InterfaceC37754f;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p801yl.C46527h0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import th.InterfaceC44980d;
import w00.C45678b;

/* JADX INFO: compiled from: FutureBonusGetDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0014R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/futures/dialog/FutureBonusGetDialog;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "trial", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "getTrial", "()Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "trial$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "tradeNow", "getResources", "Landroid/content/res/Resources;", "attachBaseContext", "newBase", "Landroid/content/Context;", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFutureBonusGetDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FutureBonusGetDialog.kt\ncom/kubi/futures/dialog/FutureBonusGetDialog\n+ 2 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n*L\n1#1,148:1\n20#2:149\n*S KotlinDebug\n*F\n+ 1 FutureBonusGetDialog.kt\ncom/kubi/futures/dialog/FutureBonusGetDialog\n*L\n99#1:149\n*E\n"})
public final class FutureBonusGetDialog extends AppCompatActivity {

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Companion f22772j = new Companion(null);

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Lazy f22773i = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.dialog.t
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FutureBonusGetDialog.m25107P(this.f22893b);
        }
    });

    /* JADX INFO: compiled from: FutureBonusGetDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/dialog/FutureBonusGetDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "activity", "Landroid/app/Activity;", "trial", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull Activity activity, @NotNull FuturesWelfareTrialItemEntity trial) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(trial, "trial");
            Intent intent = new Intent(activity, (Class<?>) FutureBonusGetDialog.class);
            intent.putExtra("data", trial);
            activity.startActivity(intent);
            activity.overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: K */
    private final FuturesWelfareTrialItemEntity m25103K() {
        return (FuturesWelfareTrialItemEntity) this.f22773i.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX INFO: renamed from: O */
    public final void m25108O(FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        String str;
        Object next;
        String strM102677L = C46527h0.f104291a.m102677L();
        List<String> contractList = futuresWelfareTrialItemEntity.getContractList();
        if (contractList != null) {
            Iterator<T> it = contractList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual((String) next, strM102677L));
            String str2 = (String) next;
            if (str2 == null) {
                List<String> contractList2 = futuresWelfareTrialItemEntity.getContractList();
                str = contractList2 != null ? (String) CollectionsKt.getOrNull(contractList2, 0) : null;
            } else {
                str = str2;
            }
        } else {
            List<String> contractList3 = futuresWelfareTrialItemEntity.getContractList();
            str = contractList3 != null ? (String) CollectionsKt.getOrNull(contractList3, 0) : null;
        }
        String name = C4615g.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (str != null) {
            strM102677L = str;
        }
        C12572a.m23695d(name, new C4615g(strM102677L, true), 0L, 4, null);
        if (str == null || str.length() == 0) {
            InterfaceC37754f.a.m85131c(C37304a.f82764a, null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
        } else {
            InterfaceC37754f.a.m85131c(C37304a.f82764a, str, null, null, null, null, null, null, null, null, 510, null);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context newBase) {
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        MultiLanguageManager multiLanguageManager = MultiLanguageManager.f46805a;
        Context contextAttachBaseContext2 = getDelegate().attachBaseContext2(newBase);
        Intrinsics.checkNotNullExpressionValue(contextAttachBaseContext2, "attachBaseContext2(...)");
        super.attachBaseContext(multiLanguageManager.m56994p(contextAttachBaseContext2));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        PropertyEntity properties;
        super.onCreate(savedInstanceState);
        setContentView(R$layout.bkumex_dialog_future_bonus_get);
        final FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntityM25103K = m25103K();
        final C36853v c36853vM82571a = C36853v.m82571a(C45678b.m100787a(this));
        Intrinsics.checkNotNullExpressionValue(c36853vM82571a, "bind(...)");
        if (futuresWelfareTrialItemEntityM25103K == null) {
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        EdgeToEdgeCompat edgeToEdgeCompat = EdgeToEdgeCompat.f48106a;
        View fakeStatusBar = c36853vM82571a.f81160e;
        Intrinsics.checkNotNullExpressionValue(fakeStatusBar, "fakeStatusBar");
        edgeToEdgeCompat.m58268f(this, fakeStatusBar);
        View fakeStatusBar2 = c36853vM82571a.f81160e;
        Intrinsics.checkNotNullExpressionValue(fakeStatusBar2, "fakeStatusBar");
        ViewExtKt.m66577h(fakeStatusBar2);
        LottieAnimationView lottieAnimationView = c36853vM82571a.f81162g;
        ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
        lottieAnimationView.getLayoutParams().width = C5267e0.m6180b();
        lottieAnimationView.getLayoutParams().height = C5267e0.m6182d();
        lottieAnimationView.setLayoutParams(layoutParams);
        ImageView imgClose = c36853vM82571a.f81161f;
        Intrinsics.checkNotNullExpressionValue(imgClose, "imgClose");
        C27046k.m66711z(imgClose, 0L, new Function0() { // from class: com.kubi.futures.dialog.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FutureBonusGetDialog.m25104L(this.f22942b);
            }
        }, 1, null);
        KcPrimaryButton btnTradeNow = c36853vM82571a.f81158c;
        Intrinsics.checkNotNullExpressionValue(btnTradeNow, "btnTradeNow");
        C27046k.m66711z(btnTradeNow, 0L, new Function0() { // from class: com.kubi.futures.dialog.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FutureBonusGetDialog.m25105M(this.f22946b, futuresWelfareTrialItemEntityM25103K);
            }
        }, 1, null);
        if (DayNightThemeManager.f28592a.m33187l()) {
            c36853vM82571a.f81163h.setAlpha(1.0f);
            c36853vM82571a.f81157b.setAlpha(1.0f);
        } else {
            c36853vM82571a.f81163h.setAlpha(0.5f);
            c36853vM82571a.f81157b.setAlpha(0.5f);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ConstraintLayout dialogCtt = c36853vM82571a.f81159d;
        Intrinsics.checkNotNullExpressionValue(dialogCtt, "dialogCtt");
        animatorSet.playTogether(ObjectAnimator.ofFloat(dialogCtt, "scaleX", 0.0f, 0.67f, 0.1f, 1.05f, 0.98f, 1.0f), ObjectAnimator.ofFloat(dialogCtt, "scaleY", 0.2f, 0.67f, 0.98f, 1.05f, 0.98f, 1.0f));
        animatorSet.setDuration(760L);
        animatorSet.setInterpolator(PathInterpolatorCompat.create(0.23f, 0.09f, 0.52f, 0.88f));
        animatorSet.start();
        ImageView imgClose2 = c36853vM82571a.f81161f;
        Intrinsics.checkNotNullExpressionValue(imgClose2, "imgClose");
        ViewExtKt.m66577h(imgClose2);
        c36853vM82571a.f81161f.postDelayed(new Runnable() { // from class: com.kubi.futures.dialog.w
            @Override // java.lang.Runnable
            public final void run() {
                FutureBonusGetDialog.m25106N(this.f22985b, c36853vM82571a);
            }
        }, 400L);
        BaseTextView baseTextView = c36853vM82571a.f81164i;
        BigDecimal bigDecimalM66656p = C27039d.m66656p(futuresWelfareTrialItemEntityM25103K.getFaceValue());
        Integer shortDisplayPrecision = null;
        CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(futuresWelfareTrialItemEntityM25103K.getCurrency()), false, 2, null);
        if (coinEntityM99528E != null && (properties = coinEntityM99528E.getProperties()) != null) {
            shortDisplayPrecision = properties.getShortDisplayPrecision();
        }
        baseTextView.setText(C42180b.m92640e(bigDecimalM66656p, null, C27039d.m66651k(shortDisplayPrecision, 4), false, false, false, 0, null, 125, null));
        c36853vM82571a.f81165j.setText(' ' + C27041f.m66668h(C27041f.m66677q(futuresWelfareTrialItemEntityM25103K.getCurrency())));
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m25104L(FutureBonusGetDialog futureBonusGetDialog) {
        futureBonusGetDialog.finish();
        futureBonusGetDialog.overridePendingTransition(0, 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m25105M(FutureBonusGetDialog futureBonusGetDialog, FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        futureBonusGetDialog.m25108O(futuresWelfareTrialItemEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N */
    public static final void m25106N(FutureBonusGetDialog futureBonusGetDialog, C36853v c36853v) {
        if (!futureBonusGetDialog.isFinishing() && !futureBonusGetDialog.isDestroyed()) {
            c36853v.f81161f.setAlpha(0.0f);
            ImageView imgClose = c36853v.f81161f;
            Intrinsics.checkNotNullExpressionValue(imgClose, "imgClose");
            ViewExtKt.m66594y(imgClose);
            c36853v.f81161f.animate().alpha(1.0f).setDuration(200L).start();
        }
    }

    /* JADX INFO: renamed from: P */
    public static final FuturesWelfareTrialItemEntity m25107P(FutureBonusGetDialog futureBonusGetDialog) {
        return (FuturesWelfareTrialItemEntity) futureBonusGetDialog.getIntent().getParcelableExtra("data");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    @NotNull
    public Resources getResources() {
        Resources resources = super.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Configuration configuration = resources.getConfiguration();
        configuration.fontScale = 1.0f;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return resources;
    }
}
