package com.kubi.kumex.guide;

import android.os.Handler;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.ViewKt;
import com.kubi.futures.guide.AirdropStepGuide;
import com.kubi.futures.guide.CopyTradingGuide;
import com.kubi.futures.guide.DistributionStepGuide;
import com.kubi.futures.guide.FuturesPositionModeGuideDialog;
import com.kubi.futures.guide.SiteTransferStepGuide;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.welfare.AirdropBonusEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.p072ad.api.entity.ResAdEntity;
import com.kubi.resources.GlobalDialogManager;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.extensions.C27025c;
import com.tencent.bugly.proguard.C33590cg;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.kumex.guide.h, reason: from Kotlin metadata */
/* JADX INFO: compiled from: GuideHelper.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r*\u0001\u001f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010!\u001a\u00020\"H\u0002J\u000e\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0016J\u0006\u0010%\u001a\u00020\"J\u0006\u0010&\u001a\u00020\"J\u0006\u0010'\u001a\u00020\"J\u0006\u0010(\u001a\u00020\"J\u0018\u0010)\u001a\u00020\"2\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010%\u001a\u00020\rJ\u000e\u0010,\u001a\u00020\r2\u0006\u0010*\u001a\u00020+J\u0016\u0010-\u001a\u00020\"2\u0006\u0010*\u001a\u00020+2\u0006\u0010%\u001a\u00020\rJ\u000e\u0010.\u001a\u00020\"2\u0006\u0010*\u001a\u00020+J\u0016\u0010/\u001a\u00020\"2\u0006\u0010*\u001a\u00020+2\u0006\u00100\u001a\u000201J\u000e\u00102\u001a\u00020\"2\u0006\u0010*\u001a\u00020+J\"\u00103\u001a\u00020\"2\u0006\u0010*\u001a\u00020+2\b\u00104\u001a\u0004\u0018\u0001052\b\u00100\u001a\u0004\u0018\u000101J\u0010\u00106\u001a\u00020\"2\b\u0010*\u001a\u0004\u0018\u00010+J\u000e\u00107\u001a\u00020\"2\u0006\u0010*\u001a\u00020+J\u000e\u00108\u001a\u00020\"2\u0006\u0010*\u001a\u00020+J\u0006\u00109\u001a\u00020\rJ\u0016\u0010:\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00162\u0006\u0010;\u001a\u00020<J\u0016\u0010=\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00162\u0006\u0010>\u001a\u00020\u0005J\u0018\u0010?\u001a\u00020\"2\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010@\u001a\u00020AJ\u000e\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\rJ\u0006\u0010D\u001a\u00020\"J\u0018\u0010E\u001a\u00020\r2\u0006\u0010F\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+H\u0002J0\u0010G\u001a\u00020\"2\u0006\u0010F\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00162\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<H\u0002J\b\u0010H\u001a\u00020\"H\u0002J\b\u0010I\u001a\u00020\"H\u0002J0\u0010J\u001a\u00020\t2\u0006\u0010*\u001a\u00020+2\u0006\u0010F\u001a\u00020\u00052\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0001H\u0002J,\u0010M\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u00162\u0006\u0010F\u001a\u00020\u00052\b\u0010>\u001a\u0004\u0018\u00010\u00052\b\u0010;\u001a\u0004\u0018\u00010<H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010 ¨\u0006N"}, m90084d2 = {"Lcom/kubi/kumex/guide/GuideHelper;", "", "<init>", "()V", "GUIDE", "", "GUIDE_VERSION_2", C33590cg.f69440j, "Ljava/util/TreeSet;", "Lcom/kubi/kumex/guide/StepGuide;", "target", "Ljava/util/Queue;", "isSelectPositionTab", "", "lastPositionShow", "Ljava/lang/Boolean;", "lastAssetsShow", "count", "", "isShowing", TUIConstants.TUIChat.OWNER, "Ljava/lang/ref/WeakReference;", "Lcom/kubi/sdk/BaseFragment;", "lastGuide", "currentGuide", "next", "Ljava/lang/Runnable;", "runnable", "mHandler", "Landroid/os/Handler;", "dialogLifeCycleListener", "com/kubi/kumex/guide/GuideHelper$dialogLifeCycleListener$1", "Lcom/kubi/kumex/guide/GuideHelper$dialogLifeCycleListener$1;", "initData", "", "setOwner", "fragment", TIMPushProvider.f75062n, TIMPushProvider.f75063o, "increaseCount", "decreaseCount", "showPositionGuide", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "showSubmitPanelGuide", "showSubmitPanelTransferGuide", "showSiteTransferDialog", "showDistributionDialog", "trial", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "showCopyTradingGuideDialog", "showAirdropDialog", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/welfare/AirdropBonusEntity;", "showOpenFuturesGuide", "showSelectContractGuide", "showPositionMode", "isShowPositionMode", "showLeftTopBubble", TUIConstants.TUIChat.NOTICE, "Lcom/kubi/kumex/data/platform/model/ContractNotice;", "showRightTopBubble", "tips", "showFuturesAd", "resAdEntity", "Lcom/kubi/ad/api/entity/ResAdEntity;", "selectPosition", "select", "release", "performBeginnerGuide", "key", "performBubbleGuide", "perform", "prePerform", "guideFactory", "data", "data1", "guideBubbleFactory", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGuideHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideHelper.kt\ncom/kubi/kumex/guide/GuideHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1869#2,2:433\n295#2,2:435\n295#2,2:437\n295#2,2:439\n295#2,2:441\n295#2,2:443\n295#2,2:445\n1#3:447\n*S KotlinDebug\n*F\n+ 1 GuideHelper.kt\ncom/kubi/kumex/guide/GuideHelper\n*L\n95#1:433,2\n162#1:435,2\n170#1:437,2\n180#1:439,2\n190#1:441,2\n196#1:443,2\n240#1:445,2\n*E\n"})
public final class GuideHelper {

    /* JADX INFO: renamed from: d */
    public static boolean f29158d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public static Boolean f29159e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public static Boolean f29160f;

    /* JADX INFO: renamed from: g */
    public static int f29161g;

    /* JADX INFO: renamed from: h */
    public static boolean f29162h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public static WeakReference<BaseFragment> f29163i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public static StepGuide f29164j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public static StepGuide f29165k;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final GuideHelper f29155a = new GuideHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final TreeSet<StepGuide> f29156b = new TreeSet<>();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Queue<String> f29157c = new LinkedList();

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final Runnable f29166l = new Runnable() { // from class: com.kubi.kumex.guide.e
        @Override // java.lang.Runnable
        public final void run() {
            GuideHelper.m33872l();
        }
    };

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final Runnable f29167m = new Runnable() { // from class: com.kubi.kumex.guide.f
        @Override // java.lang.Runnable
        public final void run() {
            GuideHelper.m33873q();
        }
    };

    /* JADX INFO: renamed from: n */
    @NotNull
    public static Handler f29168n = new Handler();

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final a f29169o = new a();

    /* JADX INFO: renamed from: com.kubi.kumex.guide.h$a */
    /* JADX INFO: compiled from: GuideHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/kumex/guide/GuideHelper$dialogLifeCycleListener$1", "Lcom/kubi/resources/GlobalDialogManager$SimpleDialogLifeCycleListener;", "onCreate", "", "dialog", "Landroidx/fragment/app/DialogFragment;", "onDestroy", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends GlobalDialogManager.c {
        @Override // com.kubi.resources.GlobalDialogManager.c, com.kubi.resources.GlobalDialogManager.b
        /* JADX INFO: renamed from: b */
        public void mo33895b(DialogFragment dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            super.mo33895b(dialog);
            GuideHelper.f29155a.m33880j();
        }

        @Override // com.kubi.resources.GlobalDialogManager.c, com.kubi.resources.GlobalDialogManager.b
        /* JADX INFO: renamed from: e */
        public void mo4777e(DialogFragment dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            super.mo4777e(dialog);
            GuideHelper guideHelper = GuideHelper.f29155a;
            guideHelper.m33877e();
            guideHelper.m33884o();
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m33872l() {
        f29162h = false;
        if (f29156b.isEmpty()) {
            f29164j = null;
        }
        StepGuide stepGuide = f29164j;
        if (stepGuide != f29165k) {
            f29165k = stepGuide;
        } else {
            f29165k = null;
        }
        f29155a.m33884o();
    }

    /* JADX INFO: renamed from: p */
    public final void m33885p() {
        f29161g = 0;
        f29162h = false;
        f29156b.clear();
        f29157c.clear();
        f29159e = null;
        f29160f = null;
        f29164j = null;
        f29165k = null;
        f29158d = false;
        WeakReference<BaseFragment> weakReference = f29163i;
        if (weakReference != null) {
            weakReference.clear();
        }
        GlobalDialogManager.f43651a.m54346k(f29169o);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ StepGuide m33870g(GuideHelper guideHelper, View view, String str, Object obj, Object obj2, int i11, Object obj3) {
        if ((i11 & 4) != 0) {
            obj = null;
        }
        if ((i11 & 8) != 0) {
            obj2 = null;
        }
        return guideHelper.m33878f(view, str, obj, obj2);
    }

    /* JADX INFO: renamed from: q */
    public static final void m33873q() {
        f29155a.m33882m();
    }

    /* JADX INFO: renamed from: A */
    public final void m33874A(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        m33883n("SelectContractGuide", view);
    }

    /* JADX INFO: renamed from: B */
    public final void m33875B(@NotNull View view) {
        Object next;
        Intrinsics.checkNotNullParameter(view, "view");
        Iterator<T> it = f29156b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((StepGuide) next) instanceof SiteTransferStepGuide));
        if (next != null) {
            return;
        }
        f29156b.add(m33870g(this, view, "SiteTransferStepGuide", null, null, 12, null));
        m33884o();
    }

    /* JADX INFO: renamed from: C */
    public final void m33876C(@NotNull View view, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.areEqual(f29160f, Boolean.valueOf(z11))) {
            return;
        }
        f29160f = Boolean.valueOf(z11);
        if (z11) {
            m33883n("TransferAssetsGuide", view);
        } else {
            m33884o();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m33877e() {
        f29161g--;
    }

    /* JADX INFO: renamed from: f */
    public final StepGuide m33878f(View view, String str, Object obj, Object obj2) {
        if (Intrinsics.areEqual(str, "SiteTransferStepGuide")) {
            WeakReference<BaseFragment> weakReference = f29163i;
            return new SiteTransferStepGuide(weakReference != null ? weakReference.get() : null, 10, f29166l);
        }
        if (Intrinsics.areEqual(str, OpenFuturesGuide.f29111e.getKey())) {
            return new OpenFuturesGuide(11, f29166l);
        }
        if (Intrinsics.areEqual(str, "AirdropStepGuide")) {
            BaseFragment baseFragment = (BaseFragment) ViewKt.findFragment(view);
            Runnable runnable = f29166l;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.kubi.kumex.data.welfare.AirdropBonusEntity");
            return new AirdropStepGuide(baseFragment, 9, runnable, (AirdropBonusEntity) obj, obj2 instanceof FuturesWelfareTrialItemEntity ? (FuturesWelfareTrialItemEntity) obj2 : null);
        }
        if (Intrinsics.areEqual(str, "DistributionStepGuide")) {
            WeakReference<BaseFragment> weakReference2 = f29163i;
            return new DistributionStepGuide(weakReference2 != null ? weakReference2.get() : null, 8, f29166l, obj instanceof FuturesWelfareTrialItemEntity ? (FuturesWelfareTrialItemEntity) obj : null);
        }
        if (Intrinsics.areEqual(str, FuturesPositionModeGuideDialog.f23063v0.getKey())) {
            FragmentManager childFragmentManager = ViewKt.findFragment(view).getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            return new FuturesPositionModeGuideDialog(childFragmentManager, 7, f29166l);
        }
        if (Intrinsics.areEqual(str, "PositionGuide")) {
            return new PositionGuide(6, view, f29166l);
        }
        if (Intrinsics.areEqual(str, "SelectContractGuide")) {
            return new SelectContractGuide(5, view, f29166l);
        }
        if (Intrinsics.areEqual(str, "TransferAssetsGuide")) {
            return new SubmitPaneTransferGuide(4, view, f29166l);
        }
        if (Intrinsics.areEqual(str, "OrderGuide")) {
            return new SubmitPaneGuide(3, view, f29166l);
        }
        if (Intrinsics.areEqual(str, FuturesAdGuide.f29104g.getKey())) {
            return new FuturesAdGuide(2, f29166l, (BaseFragment) ViewKt.findFragment(view), obj instanceof ResAdEntity ? (ResAdEntity) obj : null);
        }
        if (Intrinsics.areEqual(str, "CopyTradingGuideDialog")) {
            return new CopyTradingGuide((BaseFragment) ViewKt.findFragment(view), 1, f29166l);
        }
        return new NoneStepGuide(new Runnable() { // from class: com.kubi.kumex.guide.g
            @Override // java.lang.Runnable
            public final void run() {
                GuideHelper.m33871h();
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m33879i() {
        f29168n.removeCallbacks(f29167m);
        f29162h = false;
        StepGuide stepGuide = f29165k;
        if (stepGuide instanceof BeginnerGuide) {
            Intrinsics.checkNotNull(stepGuide, "null cannot be cast to non-null type com.kubi.kumex.guide.BeginnerGuide");
            ((BeginnerGuide) stepGuide).hide();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m33880j() {
        f29161g++;
    }

    /* JADX INFO: renamed from: k */
    public final void m33881k() {
        Queue<String> queue = f29157c;
        queue.add(FuturesPositionModeGuideDialog.f23063v0.getKey());
        queue.add("PositionGuide");
        queue.add("SelectContractGuide");
        queue.add("OrderGuide");
        queue.add("TransferAssetsGuide");
        DataMapUtil dataMapUtil = DataMapUtil.f54245a;
        if (dataMapUtil.m66370a("kumex_open_guide", false)) {
            queue.remove("OrderGuide");
            queue.remove("TransferAssetsGuide");
        }
        Iterator it = StringsKt.split$default((CharSequence) dataMapUtil.m66375i("kumex_open_guide_2", ""), new String[]{","}, false, 0, 6, (Object) null).iterator();
        while (it.hasNext()) {
            f29157c.remove((String) it.next());
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m33882m() {
        StepGuide stepGuide;
        BaseFragment baseFragment;
        if (f29161g <= 0) {
            TreeSet<StepGuide> treeSet = f29156b;
            if (!treeSet.isEmpty()) {
                WeakReference<BaseFragment> weakReference = f29163i;
                if (C27025c.m66566d((weakReference == null || (baseFragment = weakReference.get()) == null) ? null : Boolean.valueOf(baseFragment.isShowing()))) {
                    Iterator<StepGuide> it = treeSet.iterator();
                    Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                    do {
                        if (!it.hasNext()) {
                            stepGuide = null;
                            break;
                        } else {
                            StepGuide next = it.next();
                            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                            stepGuide = next;
                        }
                    } while (!stepGuide.enabled());
                    if (stepGuide == null || ((stepGuide instanceof PositionGuide) && !f29158d)) {
                        f29162h = false;
                        return;
                    }
                    StepGuide stepGuide2 = f29164j;
                    if (C27025c.m66566d(stepGuide2 != null ? Boolean.valueOf(stepGuide2.mo25562H2(stepGuide)) : null)) {
                        f29165k = stepGuide;
                        stepGuide.mo25565q2();
                        f29156b.remove(stepGuide);
                        return;
                    }
                    StepGuide stepGuide3 = f29165k;
                    if (stepGuide3 != null) {
                        Intrinsics.checkNotNull(stepGuide3);
                        stepGuide3.mo25565q2();
                        return;
                    } else {
                        f29165k = stepGuide;
                        f29164j = stepGuide;
                        stepGuide.mo25565q2();
                        f29156b.remove(stepGuide);
                        return;
                    }
                }
            }
        }
        f29162h = false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m33883n(String str, View view) {
        Queue<String> queue = f29157c;
        if (!queue.contains(str)) {
            return false;
        }
        f29156b.add(m33870g(this, view, str, null, null, 12, null));
        queue.remove(str);
        m33884o();
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final void m33884o() {
        StepGuide stepGuide;
        BaseFragment baseFragment;
        if (f29161g <= 0) {
            TreeSet<StepGuide> treeSet = f29156b;
            if (treeSet.isEmpty()) {
                return;
            }
            WeakReference<BaseFragment> weakReference = f29163i;
            if (C27025c.m66566d((weakReference == null || (baseFragment = weakReference.get()) == null) ? null : Boolean.valueOf(baseFragment.isShowing()))) {
                Iterator<StepGuide> it = treeSet.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                do {
                    if (!it.hasNext()) {
                        stepGuide = null;
                        break;
                    } else {
                        StepGuide next = it.next();
                        Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                        stepGuide = next;
                    }
                } while (!stepGuide.enabled());
                if (stepGuide == null) {
                    return;
                }
                StepGuide stepGuide2 = f29164j;
                if (C27025c.m66566d(stepGuide2 != null ? Boolean.valueOf(stepGuide2.mo25562H2(stepGuide)) : null)) {
                    f29168n.post(f29167m);
                } else {
                    if (f29162h) {
                        return;
                    }
                    f29162h = true;
                    f29168n.post(f29167m);
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m33886r(boolean z11) {
        f29158d = z11;
        m33884o();
    }

    /* JADX INFO: renamed from: s */
    public final void m33887s(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        m33881k();
        f29162h = false;
        f29161g = 0;
        f29163i = new WeakReference<>(fragment);
        GlobalDialogManager.f43651a.m54345j(f29169o);
    }

    /* JADX INFO: renamed from: u */
    public final void m33889u(@NotNull View view, @Nullable AirdropBonusEntity airdropBonusEntity, @Nullable FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        Object next;
        Intrinsics.checkNotNullParameter(view, "view");
        Iterator<T> it = f29156b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((StepGuide) next) instanceof AirdropStepGuide));
        if (next != null) {
            return;
        }
        f29156b.add(m33878f(view, "AirdropStepGuide", airdropBonusEntity, futuresWelfareTrialItemEntity));
        m33884o();
    }

    /* JADX INFO: renamed from: v */
    public final void m33890v(@NotNull View view) {
        Object next;
        Intrinsics.checkNotNullParameter(view, "view");
        Iterator<T> it = f29156b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((StepGuide) next) instanceof CopyTradingGuide));
        if (next != null) {
            return;
        }
        f29156b.add(m33870g(this, view, "CopyTradingGuideDialog", null, null, 12, null));
        m33884o();
    }

    /* JADX INFO: renamed from: w */
    public final void m33891w(@NotNull View view, @NotNull FuturesWelfareTrialItemEntity trial) {
        Object next;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(trial, "trial");
        Iterator<T> it = f29156b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((StepGuide) next) instanceof DistributionStepGuide));
        if (next != null) {
            return;
        }
        f29156b.add(m33870g(this, view, "DistributionStepGuide", trial, null, 8, null));
        m33884o();
    }

    /* JADX INFO: renamed from: x */
    public final void m33892x(@Nullable View view, @NotNull ResAdEntity resAdEntity) {
        Object next;
        Intrinsics.checkNotNullParameter(resAdEntity, "resAdEntity");
        if (view != null) {
            Iterator<T> it = f29156b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((StepGuide) next) instanceof FuturesAdGuide));
            if (next != null) {
                return;
            }
            f29156b.add(m33870g(this, view, FuturesAdGuide.f29104g.getKey(), resAdEntity, null, 8, null));
            m33884o();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m33893y(@Nullable View view) {
        Object next;
        if (view != null) {
            Iterator<T> it = f29156b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((StepGuide) next) instanceof OpenFuturesGuide));
            if (next != null || KuMexDepend.f30378a.m35906h()) {
                return;
            }
            f29156b.add(m33870g(this, view, OpenFuturesGuide.f29111e.getKey(), null, null, 12, null));
            m33884o();
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m33894z(@Nullable View view, boolean z11) {
        Runnable f29193b;
        if (view == null) {
            return;
        }
        if (z11) {
            m33883n("PositionGuide", view);
            return;
        }
        StepGuide stepGuide = f29165k;
        if (stepGuide instanceof PositionGuide) {
            if (stepGuide != null) {
                stepGuide.hide();
            }
            StepGuide stepGuide2 = f29165k;
            if (stepGuide2 == null || (f29193b = stepGuide2.getF29193b()) == null) {
                return;
            }
            f29193b.run();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m33888t() {
        m33884o();
    }

    /* JADX INFO: renamed from: h */
    public static final void m33871h() {
    }
}
