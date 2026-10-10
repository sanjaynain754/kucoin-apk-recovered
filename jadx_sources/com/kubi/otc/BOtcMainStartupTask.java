package com.kubi.otc;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.MimeTypes;
import com.blankj.utilcode.util.C5264d;
import com.blankj.utilcode.util.C5287o0;
import com.kubi.otc.otc.trade.OtcDealFragment;
import com.kubi.payment.flutter.choosefile.FlutterFileDispatchFragment;
import com.kubi.payment.p2p.order.OrderDetailFragment;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.utils.C27012a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import java.util.ArrayList;
import java.util.List;
import o00.C42917g;
import o00.C42918h;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BOtcStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"Lcom/kubi/otc/BOtcMainStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "b_otc_main", priority = 300, stepType = StartupStepType.Application, threadType = StartupThreadType.Main)
@SourceDebugExtension({"SMAP\nBOtcStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BOtcStartupTask.kt\ncom/kubi/otc/BOtcMainStartupTask\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,66:1\n15#2,2:67\n*S KotlinDebug\n*F\n+ 1 BOtcStartupTask.kt\ncom/kubi/otc/BOtcMainStartupTask\n*L\n28#1:67,2\n*E\n"})
public final class BOtcMainStartupTask implements IStartupTask {
    private static final long PICKER_CACHE_CLEAR_DELAY_MILLIS = 6000;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<ArrayList<String>> needToastPage$delegate = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BOtcMainStartupTask.needToastPage_delegate$lambda$3();
        }
    });

    /* JADX INFO: compiled from: BOtcStartupTask.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R+\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/otc/BOtcMainStartupTask$Companion;", "", "<init>", "()V", "PICKER_CACHE_CLEAR_DELAY_MILLIS", "", "needToastPage", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getNeedToastPage", "()Ljava/util/ArrayList;", "needToastPage$delegate", "Lkotlin/Lazy;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final ArrayList<String> m43917a() {
            return (ArrayList) BOtcMainStartupTask.needToastPage$delegate.getValue();
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.BOtcMainStartupTask$a */
    /* JADX INFO: compiled from: BOtcStartupTask.kt */
    /* JADX INFO: loaded from: classes32.dex */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/otc/BOtcMainStartupTask$run$2", "Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;", "onForeground", "", "activity", "Landroid/app/Activity;", "onBackground", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBOtcStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BOtcStartupTask.kt\ncom/kubi/otc/BOtcMainStartupTask$run$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
    public static final class C19643a implements C5287o0.b {
        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onBackground(Activity activity) {
            C27100x0.m66924e(new Function0() { // from class: com.kubi.otc.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BOtcMainStartupTask.C19643a.m43919b();
                }
            });
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0064  */
        /* JADX INFO: renamed from: b */
        public static final Unit m43919b() {
            FragmentActivity fragmentActivity;
            Activity activityM66494h = C27012a.m66486i().m66494h();
            Object obj = null;
            if (activityM66494h instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) activityM66494h;
            } else {
                fragmentActivity = null;
            }
            if (fragmentActivity != null) {
                if (!CollectionsKt.contains(BOtcMainStartupTask.INSTANCE.m43917a(), Reflection.getOrCreateKotlinClass(fragmentActivity.getClass()).getSimpleName())) {
                    List<Fragment> fragments = fragmentActivity.getSupportFragmentManager().getFragments();
                    Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
                    for (Object obj2 : fragments) {
                        if (CollectionsKt.contains(BOtcMainStartupTask.INSTANCE.m43917a(), Reflection.getOrCreateKotlinClass(((Fragment) obj2).getClass()).getSimpleName())) {
                            obj = obj2;
                            break;
                        }
                    }
                    if (obj != null) {
                        ToastCompat.m66437C(R$string.app_is_background_tips);
                    }
                } else {
                    ToastCompat.m66437C(R$string.app_is_background_tips);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onForeground(Activity activity) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList needToastPage_delegate$lambda$3() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C27041f.m66668h(Reflection.getOrCreateKotlinClass(OrderDetailFragment.class).getSimpleName()));
        arrayList.add(C27041f.m66668h(Reflection.getOrCreateKotlinClass(OtcDealFragment.class).getSimpleName()));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void run$lambda$1(final Application application, final long j11) {
        C42917g.m94137c().execute(new Runnable() { // from class: com.kubi.otc.b
            @Override // java.lang.Runnable
            public final void run() {
                BOtcMainStartupTask.run$lambda$1$lambda$0(application, j11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void run$lambda$1$lambda$0(Application application, long j11) {
        FlutterFileDispatchFragment.f39487e0.clearPickerCache$PaymentLib_googleRelease(application, j11);
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C42918h.m94141a(6000L, new Runnable() { // from class: com.kubi.otc.a
            @Override // java.lang.Runnable
            public final void run() {
                BOtcMainStartupTask.run$lambda$1(application, jCurrentTimeMillis);
            }
        });
        C5264d.registerAppStatusChangedListener(new C19643a());
    }
}
