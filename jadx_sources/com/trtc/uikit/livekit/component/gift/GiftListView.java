package com.trtc.uikit.livekit.component.gift;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LifecycleRegistry;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import io.trtc.tuikit.atomicxcore.api.gift.Gift;
import io.trtc.tuikit.atomicxcore.api.gift.GiftCategory;
import io.trtc.tuikit.atomicxcore.api.gift.GiftStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import ld0.C42175e;
import ld0.C42176f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import vc0.C45496e;

/* JADX INFO: compiled from: GiftListView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0002?@B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\tJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001d\u001a\u00020\u000fH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\u001cH\u0014J\b\u0010\"\u001a\u00020\u001cH\u0014J\u0016\u0010'\u001a\u00020\u001c2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002J\b\u0010+\u001a\u00020\u001cH\u0002J\u0016\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200J\u0010\u00101\u001a\u00020\u001c2\b\u00102\u001a\u0004\u0018\u00010\u0011J\u0016\u00103\u001a\u00020\u001c2\f\u00104\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002J\u0010\u00105\u001a\u0002002\u0006\u00106\u001a\u00020\u001aH\u0002J6\u00107\u001a\u00020\u00182'\u00108\u001a#\b\u0001\u0012\u0004\u0012\u00020:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0;\u0012\u0006\u0012\u0004\u0018\u00010<09¢\u0006\u0002\b=H\u0002¢\u0006\u0002\u0010>R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006A"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/GiftListView;", "Landroid/widget/LinearLayout;", "Landroidx/lifecycle/LifecycleOwner;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "giftTabLayoutManager", "Lcom/trtc/uikit/livekit/component/gift/view/GiftTabLayoutManager;", "roomId", "", "onSendGiftListener", "Lcom/trtc/uikit/livekit/component/gift/GiftListView$OnSendGiftListener;", "giftStore", "Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "collectJobs", "", "Lkotlinx/coroutines/Job;", "isObserverAdded", "", "init", "", "getLanguage", "initStore", "addObserver", "removeObserver", "onAttachedToWindow", "onDetachedFromWindow", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "setGiftCategoryList", "categoryList", "", "Lio/trtc/tuikit/atomicxcore/api/gift/GiftCategory;", "setupLifecycleIfNeeded", "sendGift", "gift", "Lio/trtc/tuikit/atomicxcore/api/gift/Gift;", "giftCount", "", "setListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onGiftListChange", "list", "getReportKey", "isSvgGift", InterfaceC33617e1.f69659h, "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "OnSendGiftListener", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGiftListView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftListView.kt\ncom/trtc/uikit/livekit/component/gift/GiftListView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,193:1\n1869#2,2:194\n*S KotlinDebug\n*F\n+ 1 GiftListView.kt\ncom/trtc/uikit/livekit/component/gift/GiftListView\n*L\n99#1:194,2\n*E\n"})
public final class GiftListView extends LinearLayout implements LifecycleOwner {

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Companion f77729j = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LiveKitLogger f77730b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public C42176f f77731c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public String f77732d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public InterfaceC35909a f77733e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public GiftStore f77734f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final LifecycleRegistry f77735g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final List<InterfaceC41775x1> f77736h;

    /* JADX INFO: renamed from: i */
    public boolean f77737i;

    /* JADX INFO: compiled from: GiftListView.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/GiftListView$Companion;", "", "<init>", "()V", "COLUMNS", "", "ROWS", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.GiftListView$a */
    /* JADX INFO: compiled from: GiftListView.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/GiftListView$OnSendGiftListener;", "", "onSendGift", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Lcom/trtc/uikit/livekit/component/gift/GiftListView;", "gift", "Lio/trtc/tuikit/atomicxcore/api/gift/Gift;", "giftCount", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC35909a {
        /* JADX INFO: renamed from: a */
        void mo79631a(@NotNull GiftListView giftListView, @NotNull Gift gift, int i11);
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.GiftListView$b */
    /* JADX INFO: compiled from: GiftListView.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/trtc/uikit/livekit/component/gift/GiftListView$setGiftCategoryList$1", "Lcom/trtc/uikit/livekit/component/gift/view/GiftCategoryViewPagerManager$GiftClickListener;", "onClick", "", ViewProps.POSITION, "", "gift", "Lio/trtc/tuikit/atomicxcore/api/gift/Gift;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35911b implements C42175e.a {
        public C35911b() {
        }

        @Override // ld0.C42175e.a
        /* JADX INFO: renamed from: a */
        public void mo79633a(int i11, Gift gift) {
            Intrinsics.checkNotNullParameter(gift, "gift");
            InterfaceC35909a interfaceC35909a = GiftListView.this.f77733e;
            if (interfaceC35909a != null) {
                interfaceC35909a.mo79631a(GiftListView.this, gift, 1);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftListView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftListView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77730b = LiveKitLogger.f77564c.getComponentLogger("GiftListPanel");
        this.f77732d = "";
        this.f77735g = new LifecycleRegistry(this);
        this.f77736h = new ArrayList();
        setOrientation(1);
    }

    /* JADX INFO: renamed from: d */
    private final void m79622d() {
        m79627h(new GiftListView$addObserver$1(this, null));
    }

    /* JADX INFO: renamed from: g */
    private final void m79623g() throws Exception {
        GiftStore giftStoreCreate = GiftStore.INSTANCE.create(this.f77732d);
        this.f77734f = giftStoreCreate;
        if (giftStoreCreate != null) {
            giftStoreCreate.setLanguage(getLanguage());
        }
        GiftStore giftStore = this.f77734f;
        if (giftStore != null) {
            giftStore.refreshUsableGifts(null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m79625e(boolean z11) {
        boolean z12 = false;
        if (!TextUtils.isEmpty(this.f77732d)) {
            String str = this.f77732d;
            Intrinsics.checkNotNull(str);
            if (StringsKt.startsWith$default(str, "voice_", false, 2, (Object) null)) {
                z12 = true;
            }
        }
        if (z12) {
            return z11 ? 191021 : 191023;
        }
        return z11 ? 190021 : 190023;
    }

    /* JADX INFO: renamed from: f */
    public final void m79626f(@NotNull String roomId) throws Exception {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        if (roomId.length() == 0) {
            return;
        }
        this.f77732d = roomId;
        m79623g();
        m79630l();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return this.f77735g;
    }

    /* JADX INFO: renamed from: i */
    public final void m79628i(List<GiftCategory> list) {
        if (TextUtils.isEmpty(this.f77732d)) {
            return;
        }
        setGiftCategoryList(list);
    }

    /* JADX INFO: renamed from: k */
    public final void m79629k(@NotNull Gift gift, int i11) {
        Intrinsics.checkNotNullParameter(gift, "gift");
        GiftStore giftStore = this.f77734f;
        if (giftStore != null) {
            giftStore.sendGift(gift.getGiftID(), i11, null);
        }
        if (TextUtils.isEmpty(gift.getResourceURL())) {
            return;
        }
        String resourceURL = gift.getResourceURL();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = resourceURL.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        C45496e.m100464a(m79625e(StringsKt.endsWith$default(lowerCase, ".svga", false, 2, (Object) null)));
    }

    /* JADX INFO: renamed from: l */
    public final void m79630l() {
        if (this.f77732d.length() == 0 || this.f77737i) {
            return;
        }
        this.f77735g.setCurrentState(Lifecycle.State.STARTED);
        m79622d();
        this.f77737i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Iterator<T> it = this.f77736h.iterator();
        while (it.hasNext()) {
            InterfaceC41775x1.a.m91377a((InterfaceC41775x1) it.next(), null, 1, null);
        }
        this.f77736h.clear();
        m79624j();
        this.f77735g.setCurrentState(Lifecycle.State.DESTROYED);
        this.f77737i = false;
        super.onDetachedFromWindow();
    }

    public final void setListener(@Nullable InterfaceC35909a interfaceC35909a) {
        this.f77733e = interfaceC35909a;
    }

    private final String getLanguage() {
        String language = Locale.getDefault().getLanguage();
        String languageTag = Locale.getDefault().toLanguageTag();
        this.f77730b.m79404b("getLanguage language:" + language + ", languageTag:" + languageTag);
        if (!TextUtils.isEmpty(language) && !TextUtils.isEmpty(languageTag)) {
            Intrinsics.checkNotNull(languageTag);
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = languageTag.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (StringsKt.equals(TUIThemeManager.LANGUAGE_ZH_CN, language, true)) {
                if (!StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "zh-hans", false, 2, (Object) null) && !Intrinsics.areEqual(lowerCase, TUIThemeManager.LANGUAGE_ZH_CN) && !Intrinsics.areEqual(lowerCase, "zh-cn") && !Intrinsics.areEqual(lowerCase, "zh-sg") && !Intrinsics.areEqual(lowerCase, "zh-my")) {
                    return "zh-Hant";
                }
                return "zh-Hans";
            }
        }
        return TUIThemeManager.LANGUAGE_EN;
    }

    private final void setGiftCategoryList(List<GiftCategory> categoryList) {
        if (categoryList.isEmpty()) {
            this.f77730b.m79403a("setGiftCategoryList categoryList is empty");
            return;
        }
        removeAllViews();
        if (this.f77731c == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C42176f c42176f = new C42176f(context);
            this.f77731c = c42176f;
            c42176f.m92611e(new C35911b());
        }
        C42176f c42176f2 = this.f77731c;
        Intrinsics.checkNotNull(c42176f2);
        addView(c42176f2.m92610d(categoryList, 4, 2), new LinearLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC41775x1 m79627h(Function2<? super InterfaceC41709m0, ? super Continuation<? super Unit>, ? extends Object> function2) {
        InterfaceC41775x1 interfaceC41775x1M91104d = C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, function2, 3, null);
        this.f77736h.add(interfaceC41775x1M91104d);
        return interfaceC41775x1M91104d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m79630l();
    }

    /* JADX INFO: renamed from: j */
    private final void m79624j() {
    }
}
