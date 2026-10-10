package com.kubi.p110rn.debug;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.blankj.utilcode.util.C5258a;
import com.kubi.p110rn.C23207R;
import com.kubi.p110rn.RNConstantKt;
import com.kubi.router.core.Router;
import com.kubi.sdk.C23705e3;
import com.kubi.sdk.pkg.bundle.BundleManager;
import com.kubi.utils.ToastCompat;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import ro.C44128b;

/* JADX INFO: compiled from: KRNPanelManager.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0019\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001,B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015H\u0002J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0015H\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u0015H\u0002J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0003J\b\u0010%\u001a\u00020\u001cH\u0002J\u0012\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u001d\u001a\u00020\u0015H\u0002J\u0018\u0010&\u001a\u0004\u0018\u00010'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002J\b\u0010+\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001a¨\u0006-"}, m90084d2 = {"Lcom/kubi/rn/debug/KRNPanelManager;", "", "<init>", "()V", "CLOUD_MINING_ENTRY_SIZE_DP", "", "CLOUD_MINING_ENTRY_MARGIN_DP", "CLOUD_MINING_ENTRY_BOTTOM_MARGIN_DP", "CLOUD_MINING_ENTRY_ALPHA", "", "CLOUD_MINING_ROUTE", "", "RN_FRAGMENT_CLASS_NAME", "PARAM_BIZ", "PARAM_ENTRY", "PARAM_COMPONENT", "TAG", "lifecycleRegistered", "", "attachedActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", KRNPanelManager.PARAM_ENTRY, "Landroidx/appcompat/widget/AppCompatTextView;", "activityLifecycleCallbacks", "com/kubi/rn/debug/KRNPanelManager$activityLifecycleCallbacks$1", "Lcom/kubi/rn/debug/KRNPanelManager$activityLifecycleCallbacks$1;", TIMPushProvider.f75062n, "", "activity", "attachTo", "createEntry", "createLayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "makeDraggable", "floatingEntry", "Landroid/view/View;", "showCurrentRnBundleInfo", "findCurrentRnPage", "Lcom/kubi/rn/debug/KRNPanelManager$RnPage;", "fragments", "", "Landroidx/fragment/app/Fragment;", "removeEntry", "RnPage", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKRNPanelManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KRNPanelManager.kt\ncom/kubi/rn/debug/KRNPanelManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,245:1\n1869#2:246\n1870#2:248\n1#3:247\n*S KotlinDebug\n*F\n+ 1 KRNPanelManager.kt\ncom/kubi/rn/debug/KRNPanelManager\n*L\n210#1:246\n210#1:248\n*E\n"})
public final class KRNPanelManager {
    private static final float CLOUD_MINING_ENTRY_ALPHA = 0.92f;
    private static final int CLOUD_MINING_ENTRY_BOTTOM_MARGIN_DP = 96;
    private static final int CLOUD_MINING_ENTRY_MARGIN_DP = 16;
    private static final int CLOUD_MINING_ENTRY_SIZE_DP = 72;

    @NotNull
    private static final String CLOUD_MINING_ROUTE = "krn/router?biz=kc-check&entry=main&component=panel";

    @NotNull
    private static final String PARAM_BIZ = "biz";

    @NotNull
    private static final String PARAM_COMPONENT = "component";

    @NotNull
    private static final String PARAM_ENTRY = "entry";

    @NotNull
    private static final String RN_FRAGMENT_CLASS_NAME = "com.kubi.rn.ui.ReactRootFragment";

    @NotNull
    private static final String TAG = "CloudMiningEntry";

    @Nullable
    private static WeakReference<Activity> attachedActivity;

    @Nullable
    private static WeakReference<AppCompatTextView> entry;
    private static boolean lifecycleRegistered;

    @NotNull
    public static final KRNPanelManager INSTANCE = new KRNPanelManager();

    @NotNull
    private static final KRNPanelManager$activityLifecycleCallbacks$1 activityLifecycleCallbacks = new C23705e3() { // from class: com.kubi.rn.debug.KRNPanelManager$activityLifecycleCallbacks$1
        @Override // com.kubi.sdk.C23705e3, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            WeakReference weakReference = KRNPanelManager.attachedActivity;
            if ((weakReference != null ? (Activity) weakReference.get() : null) == activity) {
                KRNPanelManager.INSTANCE.removeEntry();
            }
        }

        @Override // com.kubi.sdk.C23705e3, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            KRNPanelManager.INSTANCE.attachTo(activity);
        }
    };

    /* JADX INFO: renamed from: com.kubi.rn.debug.KRNPanelManager$a, reason: from toString */
    /* JADX INFO: compiled from: KRNPanelManager.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/rn/debug/KRNPanelManager$RnPage;", "", "biz", "", KRNPanelManager.PARAM_ENTRY, "component", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBiz", "()Ljava/lang/String;", "getEntry", "getComponent", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class RnPage {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String biz;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final String entry;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final String component;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RnPage)) {
                return false;
            }
            RnPage rnPage = (RnPage) other;
            return Intrinsics.areEqual(this.biz, rnPage.biz) && Intrinsics.areEqual(this.entry, rnPage.entry) && Intrinsics.areEqual(this.component, rnPage.component);
        }

        public RnPage(@NotNull String biz, @NotNull String entry, @NotNull String component) {
            Intrinsics.checkNotNullParameter(biz, "biz");
            Intrinsics.checkNotNullParameter(entry, "entry");
            Intrinsics.checkNotNullParameter(component, "component");
            this.biz = biz;
            this.entry = entry;
            this.component = component;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBiz() {
            return this.biz;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getComponent() {
            return this.component;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getEntry() {
            return this.entry;
        }

        public int hashCode() {
            return (((this.biz.hashCode() * 31) + this.entry.hashCode()) * 31) + this.component.hashCode();
        }

        @NotNull
        public String toString() {
            return "RnPage(biz=" + this.biz + ", entry=" + this.entry + ", component=" + this.component + ')';
        }
    }

    private final RnPage findCurrentRnPage(Activity activity) {
        if (!(activity instanceof FragmentActivity)) {
            return null;
        }
        List<Fragment> fragments = ((FragmentActivity) activity).getSupportFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        return findCurrentRnPage(fragments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean makeDraggable$lambda$5(GestureDetector gestureDetector, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, Ref.FloatRef floatRef3, Ref.FloatRef floatRef4, Ref.BooleanRef booleanRef, int i11, View view, MotionEvent motionEvent) {
        gestureDetector.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            floatRef.element = motionEvent.getRawX();
            floatRef2.element = motionEvent.getRawY();
            floatRef3.element = view.getX();
            floatRef4.element = view.getY();
            booleanRef.element = false;
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float rawX = motionEvent.getRawX() - floatRef.element;
                float rawY = motionEvent.getRawY() - floatRef2.element;
                if (!booleanRef.element && Math.hypot(rawX, rawY) > i11) {
                    booleanRef.element = true;
                }
                if (booleanRef.element) {
                    ViewParent parent2 = view.getParent();
                    ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                    float fCoerceAtLeast = RangesKt.coerceAtLeast((viewGroup != null ? viewGroup.getWidth() : 0) - view.getWidth(), 0);
                    float fCoerceAtLeast2 = RangesKt.coerceAtLeast((viewGroup != null ? viewGroup.getHeight() : 0) - view.getHeight(), 0);
                    view.setX(RangesKt.coerceIn(floatRef3.element + rawX, 0.0f, fCoerceAtLeast));
                    view.setY(RangesKt.coerceIn(floatRef4.element + rawY, 0.0f, fCoerceAtLeast2));
                }
                return true;
            }
            if (actionMasked != 3) {
                return false;
            }
        }
        ViewParent parent3 = view.getParent();
        if (parent3 != null) {
            parent3.requestDisallowInterceptTouchEvent(false);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createEntry$lambda$2$lambda$1(View view) {
        Router.f46192a.m56184f(CLOUD_MINING_ROUTE).m4048k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeEntry() {
        WeakReference<AppCompatTextView> weakReference = entry;
        AppCompatTextView appCompatTextView = weakReference != null ? weakReference.get() : null;
        ViewParent parent = appCompatTextView != null ? appCompatTextView.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(appCompatTextView);
        }
        entry = null;
        attachedActivity = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCurrentRnBundleInfo() {
        Activity activityM6125h;
        RnPage rnPageFindCurrentRnPage;
        Object objM103844constructorimpl;
        WeakReference<Activity> weakReference = attachedActivity;
        if (((weakReference == null || (activityM6125h = weakReference.get()) == null) && (activityM6125h = C5258a.m6125h()) == null) || (rnPageFindCurrentRnPage = findCurrentRnPage(activityM6125h)) == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Pair<String, String> pairM57474I = BundleManager.f47277a.m57474I(activityM6125h, rnPageFindCurrentRnPage.getBiz(), rnPageFindCurrentRnPage.getEntry());
            objM103844constructorimpl = Result.m103844constructorimpl(pairM57474I != null ? pairM57474I.getFirst() : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97270n(TAG, "get current RN bundle failed: " + thM103847exceptionOrNullimpl.getMessage());
        }
        String str = (String) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
        if (str == null) {
            str = "";
        }
        ToastCompat.m66441G("BundleName: " + rnPageFindCurrentRnPage.getBiz() + "\nBundleVersion: " + str + "\nModuleName: " + rnPageFindCurrentRnPage.getComponent(), new Object[0]);
    }

    public final void show(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!lifecycleRegistered) {
            activity.getApplication().registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
            lifecycleRegistered = true;
        }
        attachTo(activity);
    }

    private KRNPanelManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachTo(Activity activity) {
        ViewGroup viewGroup;
        Activity activity2;
        AppCompatTextView appCompatTextView;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            View decorView = activity.getWindow().getDecorView();
            ViewGroup viewGroup2 = null;
            if (decorView instanceof ViewGroup) {
                viewGroup = (ViewGroup) decorView;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                WeakReference<Activity> weakReference = attachedActivity;
                if (weakReference != null) {
                    activity2 = weakReference.get();
                } else {
                    activity2 = null;
                }
                if (activity2 != activity) {
                    removeEntry();
                    entry = new WeakReference<>(createEntry(activity));
                    attachedActivity = new WeakReference<>(activity);
                }
                WeakReference<AppCompatTextView> weakReference2 = entry;
                if (weakReference2 != null && (appCompatTextView = weakReference2.get()) != null && appCompatTextView.getParent() != viewGroup) {
                    ViewParent parent = appCompatTextView.getParent();
                    if (parent instanceof ViewGroup) {
                        viewGroup2 = (ViewGroup) parent;
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(appCompatTextView);
                    }
                    viewGroup.addView(appCompatTextView, createLayoutParams(activity));
                }
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final AppCompatTextView createEntry(Activity activity) {
        float f11 = activity.getResources().getDisplayMetrics().density;
        AppCompatTextView appCompatTextView = new AppCompatTextView(activity);
        appCompatTextView.setText(RNConstantKt.LOG_TAG);
        Context context = appCompatTextView.getContext();
        int i11 = C23207R.color.c_text;
        appCompatTextView.setTextColor(ContextCompat.getColor(context, i11));
        appCompatTextView.setTextSize(18.0f);
        appCompatTextView.setGravity(17);
        appCompatTextView.setContentDescription(RNConstantKt.LOG_TAG);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(ContextCompat.getColor(appCompatTextView.getContext(), C23207R.color.c_overlay));
        gradientDrawable.setStroke((int) (2 * f11), ContextCompat.getColor(appCompatTextView.getContext(), i11));
        appCompatTextView.setBackground(gradientDrawable);
        appCompatTextView.setAlpha(CLOUD_MINING_ENTRY_ALPHA);
        appCompatTextView.setElevation(8 * f11);
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.rn.debug.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KRNPanelManager.createEntry$lambda$2$lambda$1(view);
            }
        });
        INSTANCE.makeDraggable(appCompatTextView);
        return appCompatTextView;
    }

    private final FrameLayout.LayoutParams createLayoutParams(Activity activity) {
        float f11 = activity.getResources().getDisplayMetrics().density;
        int i11 = (int) (72 * f11);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i11, 8388693);
        layoutParams.setMarginEnd((int) (16 * f11));
        layoutParams.bottomMargin = (int) (96 * f11);
        return layoutParams;
    }

    private final RnPage findCurrentRnPage(List<? extends Fragment> list) {
        Object objM103844constructorimpl;
        Iterator it = CollectionsKt.asReversed(list).iterator();
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            Fragment fragment = (Fragment) it.next();
            KRNPanelManager kRNPanelManager = INSTANCE;
            try {
                Result.Companion companion = Result.INSTANCE;
                List<Fragment> fragments = fragment.getChildFragmentManager().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
                objM103844constructorimpl = Result.m103844constructorimpl(kRNPanelManager.findCurrentRnPage(fragments));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            RnPage rnPage = (RnPage) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
            if (rnPage != null) {
                return rnPage;
            }
            if (Intrinsics.areEqual(fragment.getClass().getName(), RN_FRAGMENT_CLASS_NAME) && (fragment.isVisible() || fragment.getLifecycle().getState().isAtLeast(Lifecycle.State.RESUMED))) {
                Bundle arguments = fragment.getArguments();
                if (arguments == null) {
                    continue;
                } else {
                    String string = arguments.getString("biz");
                    if (string == null) {
                        string = "";
                    }
                    String string2 = arguments.getString(PARAM_ENTRY);
                    if (string2 == null) {
                        string2 = "";
                    }
                    if (string2.length() == 0) {
                        string2 = "index";
                    }
                    String string3 = arguments.getString("component");
                    String str = string3 != null ? string3 : "";
                    if (str.length() == 0) {
                        str = string;
                    }
                    if (string.length() > 0 && str.length() > 0) {
                        return new RnPage(string, string2, str);
                    }
                }
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void makeDraggable(final View floatingEntry) {
        final int scaledTouchSlop = ViewConfiguration.get(floatingEntry.getContext()).getScaledTouchSlop();
        final GestureDetector gestureDetector = new GestureDetector(floatingEntry.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.kubi.rn.debug.KRNPanelManager$makeDraggable$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                KRNPanelManager.INSTANCE.showCurrentRnBundleInfo();
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                floatingEntry.performClick();
                return true;
            }
        });
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
        final Ref.FloatRef floatRef3 = new Ref.FloatRef();
        final Ref.FloatRef floatRef4 = new Ref.FloatRef();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        floatingEntry.setOnTouchListener(new View.OnTouchListener() { // from class: com.kubi.rn.debug.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return KRNPanelManager.makeDraggable$lambda$5(gestureDetector, floatRef, floatRef2, floatRef3, floatRef4, booleanRef, scaledTouchSlop, view, motionEvent);
            }
        });
    }
}
