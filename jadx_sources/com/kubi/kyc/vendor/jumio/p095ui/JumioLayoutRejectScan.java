package com.kubi.kyc.vendor.jumio.p095ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.blankj.utilcode.util.C5275i0;
import com.facebook.react.uimanager.ViewProps;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.jumio.sdk.handler.JumioRejectHandler;
import com.jumio.sdk.reject.JumioRejectReason;
import com.jumio.sdk.scanpart.JumioScanPart;
import com.jumio.sdk.views.JumioRejectView;
import com.kubi.kyc.R$layout;
import com.kubi.kyc.R$string;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205dn.C36898r;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: JumioLayoutRejectScan.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ0\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u001e\u0010\u000b\u001a\u001a\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\fj\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u0001`\rJ\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0014J \u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\bH\u0016J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\bH\u0016J\u000e\u0010\"\u001a\u00020\b*\u0004\u0018\u00010#H\u0002J\u000e\u0010$\u001a\u00020\b*\u0004\u0018\u00010%H\u0002J\u0012\u0010&\u001a\u00020\b*\b\u0012\u0004\u0012\u00020#0'H\u0002J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\bH\u0016R&\u0010\u000b\u001a\u001a\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\fj\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u0001`\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m90084d2 = {"Lcom/kubi/kyc/vendor/jumio/ui/JumioLayoutRejectScan;", "Landroid/widget/FrameLayout;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "reasonMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "viewBinding", "Lcom/kubi/kyc/databinding/LayoutJumioRejectScanBinding;", "getViewBinding", "()Lcom/kubi/kyc/databinding/LayoutJumioRejectScanBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "rejectHandler", "Lcom/jumio/sdk/handler/JumioRejectHandler;", TIMPushProvider.f75062n, "", "scanPart", "Lcom/jumio/sdk/scanpart/JumioScanPart;", "initView", "onDetachedFromWindow", "onPageScrolled", ViewProps.POSITION, "positionOffset", "", "positionOffsetPixels", "onPageSelected", "titleStrResId", "Lcom/jumio/sdk/enums/JumioCredentialPart;", "tipsStrResId", "", "buttonStrResId", "", "onPageScrollStateChanged", "state", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJumioLayoutRejectScan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioLayoutRejectScan.kt\ncom/kubi/kyc/vendor/jumio/ui/JumioLayoutRejectScan\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,159:1\n52#2:160\n80#2,7:161\n1#3:168\n1563#4:169\n1634#4,3:170\n1878#4,3:173\n*S KotlinDebug\n*F\n+ 1 JumioLayoutRejectScan.kt\ncom/kubi/kyc/vendor/jumio/ui/JumioLayoutRejectScan\n*L\n38#1:160\n38#1:161,7\n54#1:169\n54#1:170,3\n104#1:173,3\n*E\n"})
public final class JumioLayoutRejectScan extends FrameLayout implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ KProperty<Object>[] f31611e = {Reflection.property1(new PropertyReference1Impl(JumioLayoutRejectScan.class, "viewBinding", "getViewBinding()Lcom/kubi/kyc/databinding/LayoutJumioRejectScanBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @Nullable
    public HashMap<?, ?> f31612b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC24293a f31613c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final JumioRejectHandler f31614d;

    /* JADX INFO: renamed from: com.kubi.kyc.vendor.jumio.ui.JumioLayoutRejectScan$b */
    /* JADX INFO: compiled from: JumioLayoutRejectScan.kt */
    @Metadata(m90083d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¨\u0006\u0011"}, m90084d2 = {"com/kubi/kyc/vendor/jumio/ui/JumioLayoutRejectScan$show$2$1", "Landroidx/viewpager/widget/PagerAdapter;", "isViewFromObject", "", "v", "Landroid/view/View;", "p", "", "getCount", "", "instantiateItem", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", ViewProps.POSITION, "destroyItem", "", "obj", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17283b extends PagerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<JumioRejectView> f31615a;

        public C17283b(List<JumioRejectView> list) {
            this.f31615a = list;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup container, int position, Object obj) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(obj, "obj");
            container.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f31615a.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup container, int position) {
            Intrinsics.checkNotNullParameter(container, "container");
            JumioRejectView jumioRejectView = this.f31615a.get(position);
            container.addView(jumioRejectView);
            return jumioRejectView;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View v11, Object p11) {
            Intrinsics.checkNotNullParameter(v11, "v");
            Intrinsics.checkNotNullParameter(p11, "p");
            return Intrinsics.areEqual(v11, p11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioLayoutRejectScan(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int position) {
        Object objM103844constructorimpl;
        KcPrimaryButton kcPrimaryButton;
        TextView textView;
        TextView textView2;
        JumioLayoutRejectIndicator jumioLayoutRejectIndicator;
        Object key = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            HashMap<?, ?> map = this.f31612b;
            if (map == null) {
                map = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(map);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        Map map2 = (Map) objM103844constructorimpl;
        if (map2 == null) {
            return;
        }
        int i11 = 0;
        Object value = null;
        for (Object obj : map2.entrySet()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) obj;
            if (position == i11) {
                key = entry.getKey();
                value = entry.getValue();
            }
            i11 = i12;
        }
        C36898r viewBinding = getViewBinding();
        if (viewBinding != null && (jumioLayoutRejectIndicator = viewBinding.f81533c) != null) {
            jumioLayoutRejectIndicator.m37336c(position);
        }
        C36898r viewBinding2 = getViewBinding();
        if (viewBinding2 != null && (textView2 = viewBinding2.f81536f) != null) {
            textView2.setText(m37348k((JumioCredentialPart) key));
        }
        C36898r viewBinding3 = getViewBinding();
        if (viewBinding3 != null && (textView = viewBinding3.f81535e) != null) {
            textView.setText(m37347j((String) value));
        }
        C36898r viewBinding4 = getViewBinding();
        if (viewBinding4 == null || (kcPrimaryButton = viewBinding4.f81532b) == null) {
            return;
        }
        kcPrimaryButton.setText(m37344d(this.f31614d.getParts()));
    }

    /* JADX INFO: renamed from: com.kubi.kyc.vendor.jumio.ui.JumioLayoutRejectScan$a */
    /* JADX INFO: compiled from: JumioLayoutRejectScan.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C17282a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JumioCredentialPart.values().length];
            try {
                iArr[JumioCredentialPart.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JumioCredentialPart.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioLayoutRejectScan(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final C36898r getViewBinding() {
        return (C36898r) this.f31613c.getValue(this, f31611e[0]);
    }

    /* JADX INFO: renamed from: i */
    public final void m37346i(@Nullable JumioScanPart jumioScanPart, @Nullable HashMap<?, ?> map) {
        JumioLayoutRejectIndicator jumioLayoutRejectIndicator;
        RtlViewPager rtlViewPager;
        if (jumioScanPart == null && map == null) {
            ViewExtKt.m66577h(this);
            return;
        }
        this.f31612b = map;
        if (jumioScanPart != null) {
            this.f31614d.attach(jumioScanPart);
        }
        List<JumioCredentialPart> parts = this.f31614d.getParts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(parts, 10));
        for (JumioCredentialPart jumioCredentialPart : parts) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            JumioRejectView jumioRejectView = new JumioRejectView(context, null, 0, C27029c.m66601d(this, 8), 0, 16, null);
            this.f31614d.renderPart(jumioCredentialPart, jumioRejectView);
            arrayList.add(jumioRejectView);
        }
        C36898r viewBinding = getViewBinding();
        if (viewBinding != null && (rtlViewPager = viewBinding.f81537g) != null) {
            rtlViewPager.removeOnPageChangeListener(this);
            rtlViewPager.setPageMargin(C5275i0.m6236a(24.0f));
            rtlViewPager.setAdapter(new C17283b(arrayList));
            rtlViewPager.addOnPageChangeListener(this);
        }
        C36898r viewBinding2 = getViewBinding();
        if (viewBinding2 != null && (jumioLayoutRejectIndicator = viewBinding2.f81533c) != null) {
            jumioLayoutRejectIndicator.m37337e(arrayList.size(), 0);
        }
        onPageSelected(0);
        ViewExtKt.m66594y(this);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: j */
    public final int m37347j(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 48629:
                    if (str.equals("104")) {
                        return R$string.kyc_jumio_reject_digitalCopy;
                    }
                    break;
                case 49586:
                    if (str.equals("200")) {
                        return R$string.kyc_jumio_reject_notReadable;
                    }
                    break;
                case 49587:
                    if (str.equals("201")) {
                        return R$string.kyc_jumio_reject_noDoc;
                    }
                    break;
                case 49592:
                    if (str.equals("206")) {
                        return R$string.kyc_jumio_reject_missingBack;
                    }
                    break;
                case 49621:
                    if (str.equals(JumioRejectReason.MISSING_FRONT)) {
                        return R$string.kyc_jumio_reject_missingFront;
                    }
                    break;
                case 1537215:
                    if (str.equals(JumioRejectReason.BLURRY)) {
                        return R$string.kyc_jumio_reject_blurry;
                    }
                    break;
                case 1537217:
                    if (str.equals(JumioRejectReason.MISSING_PART_DOC)) {
                        return R$string.kyc_jumio_reject_missingPartDoc;
                    }
                    break;
                case 1537218:
                    if (str.equals(JumioRejectReason.HIDDEN_PART_DOC)) {
                        return R$string.kyc_jumio_reject_hiddenPartDoc;
                    }
                    break;
                case 1537219:
                    if (str.equals(JumioRejectReason.DAMAGED_DOCUMENT)) {
                        return R$string.kyc_jumio_reject_damagedDocument;
                    }
                    break;
                case 1537220:
                    if (str.equals(JumioRejectReason.GLARE)) {
                        return R$string.kyc_jumio_reject_glare;
                    }
                    break;
            }
        }
        return R$string.kyc_jumio_reject_notReadable;
    }

    /* JADX INFO: renamed from: k */
    public final int m37348k(JumioCredentialPart jumioCredentialPart) {
        int i11 = jumioCredentialPart == null ? -1 : C17282a.$EnumSwitchMapping$0[jumioCredentialPart.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? R$string.kyc_jumio_reject_front : R$string.kyc_jumio_reject_back;
        }
        return R$string.kyc_jumio_reject_front;
    }

    public /* synthetic */ JumioLayoutRejectScan(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m37341f(JumioLayoutRejectScan jumioLayoutRejectScan) {
        KcPrimaryButton kcPrimaryButton;
        C36898r viewBinding = jumioLayoutRejectScan.getViewBinding();
        if (viewBinding != null && (kcPrimaryButton = viewBinding.f81532b) != null) {
            kcPrimaryButton.performClick();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m37342g(JumioLayoutRejectScan jumioLayoutRejectScan) {
        ViewExtKt.m66577h(jumioLayoutRejectScan);
        jumioLayoutRejectScan.f31614d.retake();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m37343h(JumioLayoutRejectScan jumioLayoutRejectScan) {
        RtlViewPager rtlViewPager;
        C36898r viewBinding = jumioLayoutRejectScan.getViewBinding();
        if (viewBinding != null && (rtlViewPager = viewBinding.f81537g) != null) {
            rtlViewPager.removeOnPageChangeListener(jumioLayoutRejectScan);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final int m37344d(List<? extends JumioCredentialPart> list) {
        int i11;
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                return R$string.kyc_camera_retry;
            }
            return R$string.kyc_jumio_reject_retake_both;
        }
        JumioCredentialPart jumioCredentialPart = (JumioCredentialPart) CollectionsKt.firstOrNull((List) list);
        if (jumioCredentialPart == null) {
            i11 = -1;
        } else {
            i11 = C17282a.$EnumSwitchMapping$0[jumioCredentialPart.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return R$string.kyc_camera_retry;
            }
            return R$string.kyc_jumio_reject_retake_back;
        }
        return R$string.kyc_jumio_reject_retake_front;
    }

    /* JADX INFO: renamed from: e */
    public final void m37345e() {
        KcPrimaryButton kcPrimaryButton;
        ImageView imageView;
        C36898r viewBinding = getViewBinding();
        if (viewBinding != null && (imageView = viewBinding.f81534d) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.d0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JumioLayoutRejectScan.m37341f(this.f31651b);
                }
            }, 1, null);
        }
        C36898r viewBinding2 = getViewBinding();
        if (viewBinding2 != null && (kcPrimaryButton = viewBinding2.f81532b) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.e0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JumioLayoutRejectScan.m37342g(this.f31653b);
                }
            }, 1, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C27100x0.m66924e(new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JumioLayoutRejectScan.m37343h(this.f31649b);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioLayoutRejectScan(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31613c = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C36898r>() { // from class: com.kubi.kyc.vendor.jumio.ui.JumioLayoutRejectScan$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36898r invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C36898r.m82665a(C45682f.m100800a(viewGroup));
            }
        });
        this.f31614d = new JumioRejectHandler();
        LayoutInflater.from(context).inflate(R$layout.layout_jumio_reject_scan, (ViewGroup) this, true);
        m37345e();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int state) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }
}
